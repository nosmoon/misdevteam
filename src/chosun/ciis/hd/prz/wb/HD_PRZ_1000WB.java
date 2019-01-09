/***************************************************************************************************
* 파일명 : 
* 기능 : 
 * 작성일자 : 
 * 작성자 : 
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/

package chosun.ciis.hd.prz.wb;


import java.util.*;
import java.io.*;
import java.rmi.RemoteException;
import java.util.StringTokenizer;

import com.oreilly.servlet.multipart.*;

import chosun.ciis.co.base.util.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import chosun.ciis.co.base.wb.BaseWB;
import somo.framework.db.BaseDataSet;
import somo.framework.expt.AppException;
import somo.framework.expt.SysException;
import somo.framework.lib.JNDIManager;
import somo.framework.db.DBManager;
import somo.framework.log.LogManager;
import somo.framework.util.Util;
import chosun.ciis.hd.info.ds.HD_INFO_2002_ADataSet;
import chosun.ciis.hd.info.ds.HD_INFO_2003_ADataSet;
import chosun.ciis.hd.prz.dm.*;
import chosun.ciis.hd.prz.ds.*;

/**
 * 
 */

public class HD_PRZ_1000WB extends BaseWB {
 
    /**
     * 멀티레코드처리 row 구분자
     */
    //public final String ROW_SEPARATOR = "|";
    /**
     * 멀티레코드처리 column 구분자
     */
    //public final String COL_SEPARATOR = "#";
  
    /**
     * 발령관련된 코드
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */


	public void hd_prz_1000(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_PRZ_1000_LDataSet ds = null;
		HD_PRZ_1000_LDM dm = new HD_PRZ_1000_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.req_pers_emp_no = Util.checkString(req.getParameter("req_pers_emp_no"));
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		
		if (!dm.emp_no.equals("")){
			dm.dept_cd = "";
		}
		if (!dm.req_pers_emp_no.equals("")){
			dm.dept_cd = "";
		}		
		
		ds = (HD_PRZ_1000_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_prz_1001(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_PRZ_1001_LDataSet ds = null;
		HD_PRZ_1001_LDM dm = new HD_PRZ_1001_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		
		ds = (HD_PRZ_1001_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}

	public void hd_prz_1002(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_PRZ_1002_LDataSet ds = null;
		HD_PRZ_1002_LDM dm = new HD_PRZ_1002_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		
		ds = (HD_PRZ_1002_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}

	public void hd_prz_1003(HttpServletRequest req, HttpServletResponse res) throws AppException , IOException{
		DBManager manager = new DBManager("MISHDL");

		Hashtable ht = new Hashtable();
		//byte[] up_phot_img = null;
		byte[] atic_add_file = new byte[1048576]; //10Mb
    	String file_name = "";
    	String file_size = "";
		
        int sizeLimit = 10 * 1024 * 1024 ;
		
        MultipartParser mp = new MultipartParser(req, sizeLimit, true, true, "EUC-KR"); // 10MB
        
		HD_PRZ_1003_ADataSet ds = null;
		HD_PRZ_1003_ADM dm = new HD_PRZ_1003_ADM();

			Part part;
			
			while ((part = mp.readNextPart()) != null) {
				
			    String name  = part.getName();
			    
			    if (part.isParam()) {
					ht.put(part.getName(), ((ParamPart)part).getStringValue());
			    }else if (part.isFile()) {
			        FilePart filePart = (FilePart) part;
			        file_name = filePart.getFileName();
			
			        if ( file_name != null ) {
			        	ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
						((FilePart)part).writeTo(byteArrayOutputStream);
						atic_add_file = byteArrayOutputStream.toByteArray();
			    		dm.atic_add_file = atic_add_file;
			    		file_size = String.valueOf(atic_add_file.length);
			    		dm.atic_add_file_size = file_size;
						dm.atic_add_file_nm = file_name;
			        }
			    }
			}
        	
    		dm.mode		     		=         Util.checkString((String)ht.get("mode"));
    		dm.cmpy_cd				=	      Util.getSessionParameterValue(req, "cmpycd", true);
    		//dm.cmpy_cd	     		=         Util.checkString((String)ht.get("cmpy_cd"));         
    		dm.aplc_clsf	     	=         Util.checkString((String)ht.get("aplc_clsf"));       
    		dm.obj_clsf	     		=         Util.checkString((String)ht.get("obj_clsf"));        
    		dm.prz_pnsh_cd	     	=         Util.checkString((String)ht.get("prz_pnsh_cd"));     
    		dm.req_pers_emp_no   	=         Util.checkString((String)ht.get("req_pers_emp_no")); 
    		dm.req_pers_dept_cd  	=         Util.checkString((String)ht.get("req_pers_dept_cd"));
    		dm.atic_pubc_dt	     	=         Util.checkString((String)ht.get("atic_pubc_dt"));    
    		dm.atic_pubc_side    	=         Util.checkString((String)ht.get("atic_pubc_side"));  
    		dm.case_nm	     		=         Util.checkString((String)ht.get("case_nm"));         
    		dm.prz_cont	     		=         Util.checkString((String)ht.get("prz_cont"));     
    		dm.incmg_dt_tm = "";
    		dm.incmg_pers_ipadd = Util.checkString(req.getRemoteAddr());
    		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
    		dm.clas_clsf	     	=         Util.checkString((String)ht.get("clas_clsf"));
    		dm.dtls_cont	     	=         Util.checkString((String)ht.get("dtls_cont"));
    		
    		dm.print();

    		ds = (HD_PRZ_1003_ADataSet)manager.executeCall(dm);

    		if (!"".equals(ds.errcode)) {
            	System.out.println("DAO..error.");
                throw new AppException(ds.errcode, ds.errmsg);
            }
    		
    		req.setAttribute("ds", ds);
	}

	public void hd_prz_1004(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_PRZ_1004_ADataSet ds = null;
		HD_PRZ_1004_ADM dm = new HD_PRZ_1004_ADM();

		String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);
		dm.mode = ((String)hash.get("m")).toUpperCase();
		dm.ov_cmpy_cd = (String)hash.get("ov_cmpy_cd");
		dm.ov_occr_dt = (String)hash.get("ov_occr_dt");
		dm.ov_max_seq = (String)hash.get("ov_max_seq");
		dm.emp_no = (String)hash.get("emp_no");
		dm.flnm = (String)hash.get("flnm");
		dm.dept_cd = (String)hash.get("dept_cd");
		dm.dty_cd = (String)hash.get("dty_cd");
		dm.posi_cd = (String)hash.get("posi_cd");
		dm.prz_pnsh_cd = (String)hash.get("prz_pnsh_cd");
        dm.incmg_pers_ipadd = req.getRemoteAddr();
        dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		
		dm.print();
		
		ds = (HD_PRZ_1004_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_prz_1005_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_PRZ_1005_MDataSet ds = null;
		HD_PRZ_1005_MDM dm = new HD_PRZ_1005_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		
		dm.print();
		
		ds = (HD_PRZ_1005_MDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}

	public void hd_prz_1100(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_PRZ_1100_LDataSet ds = null;
		HD_PRZ_1100_LDM dm = new HD_PRZ_1100_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		
		ds = (HD_PRZ_1100_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}

	public void hd_prz_1101(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_PRZ_1101_LDataSet ds = null;
		HD_PRZ_1101_LDM dm = new HD_PRZ_1101_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.aplc_dt_fm = Util.checkString(req.getParameter("aplc_dt_fm"));
		dm.aplc_dt_to = Util.checkString(req.getParameter("aplc_dt_to"));
		dm.aplc_clsf = Util.checkString(req.getParameter("aplc_clsf"));
		dm.judg_clsf = Util.checkString(req.getParameter("judg_clsf"));
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		
		dm.print();
		
		ds = (HD_PRZ_1101_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}

	public void hd_prz_1103(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_PRZ_1103_ADataSet ds = null;
		HD_PRZ_1103_ADM dm = new HD_PRZ_1103_ADM();

		String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);
		
		dm.mode = ((String)hash.get("m")).toUpperCase();
		dm.occr_dt = (String)hash.get("occr_dt");
		dm.seq = (String)hash.get("seq");
		dm.sub_seq = (String)hash.get("sub_seq");
		dm.tms = (String)hash.get("tms");
		dm.prv_insp_dt = (String)hash.get("prv_insp_dt");
		dm.prv_insp_ocom = (String)hash.get("prv_insp_ocom");
		dm.prv_insp_resn = (String)hash.get("prv_insp_resn");
		dm.main_insp_dt = (String)hash.get("main_insp_dt");
		dm.main_insp_ocom = (String)hash.get("main_insp_ocom");
		dm.prz_pnsh_cd = (String)hash.get("prz_pnsh_cd");
		dm.prz_resn_cd = (String)hash.get("prz_resn_cd");
		dm.prz_grad = (String)hash.get("prz_grad");
		dm.prz_amt = (String)hash.get("prz_amt");
		dm.clas_clsf_cd = (String)hash.get("clas_clsf_cd");
		dm.dtls_cont = (String)hash.get("dtls_cont");
        dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
        dm.incmg_pers_ipadd = req.getRemoteAddr();
        dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.incmg_dt_tm = "";
		
		dm.print();
		
		ds = (HD_PRZ_1103_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_prz_1104_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_PRZ_1104_LDataSet ds = null;
		HD_PRZ_1104_LDM dm = new HD_PRZ_1104_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.occr_dt = Util.checkString(req.getParameter("occr_dt"));
		dm.seq = Util.checkString(req.getParameter("seq"));

		dm.print();
		
		ds = (HD_PRZ_1104_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_prz_1106_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_PRZ_1106_MDataSet ds = null;
		HD_PRZ_1106_MDM dm = new HD_PRZ_1106_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		
		dm.print();
		
		ds = (HD_PRZ_1106_MDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_prz_1200(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_PRZ_1200_LDataSet ds = null;
		HD_PRZ_1200_LDM dm = new HD_PRZ_1200_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.flnm = Util.checkString(req.getParameter("flnm"));
		dm.prz_dt_fm = Util.checkString(req.getParameter("prz_dt_fm"));
		dm.prz_dt_to = Util.checkString(req.getParameter("prz_dt_to"));
		
		ds = (HD_PRZ_1200_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}

	public void hd_prz_1201(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_PRZ_1201_LDataSet ds = null;
		HD_PRZ_1201_LDM dm = new HD_PRZ_1201_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		
		ds = (HD_PRZ_1201_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_prz_1202(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_PRZ_1202_ADataSet ds = null;
		HD_PRZ_1202_ADM dm = new HD_PRZ_1202_ADM();

		String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);
		
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.connect_ip = req.getRemoteAddr();
		dm.connect_userid = Util.getSessionParameterValue(req, "emp_no", true);
		

		dm.mode = ((String)hash.get("m")).toUpperCase();
		dm.emp_no = (String)hash.get("emp_no");
		dm.flnm = (String)hash.get("flnm");
		dm.prz_dt = (String)hash.get("prz_dt");
		dm.prz_nm = (String)hash.get("prz_nm");
		dm.prz_resn = (String)hash.get("prz_resn");
		dm.prz_amt = (String)hash.get("prz_amt");
		dm.prz_ptcr = (String)hash.get("prz_ptcr");
		dm.dept_cd = (String)hash.get("dept_cd");
		dm.dty_cd = (String)hash.get("dty_cd");
		dm.posi_cd = (String)hash.get("posi_cd");
		dm.occr_dt = (String)hash.get("occr_dt");
		dm.seq = (String)hash.get("seq");
		
		ds = (HD_PRZ_1202_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}

	public void hd_prz_1300(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_PRZ_1300_LDataSet ds = null;
		HD_PRZ_1300_LDM dm = new HD_PRZ_1300_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		
		ds = (HD_PRZ_1300_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}

	public void hd_prz_1301_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_PRZ_1301_LDataSet ds = null;
		HD_PRZ_1301_LDM dm = new HD_PRZ_1301_LDM();
		
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.tms_s = Util.checkString(req.getParameter("tms_s"));
		dm.tms_e = Util.checkString(req.getParameter("tms_e"));
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.main_insp_dt_fm = Util.checkString(req.getParameter("main_insp_dt_fm"));
		dm.main_insp_dt_to = Util.checkString(req.getParameter("main_insp_dt_to"));
		dm.aplc_clsf = Util.checkString(req.getParameter("aplc_clsf"));
		dm.obj_clsf = Util.checkString(req.getParameter("obj_clsf"));
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));

		dm.print();
		ds = (HD_PRZ_1301_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_prz_1302_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_PRZ_1302_MDataSet ds = null;
		HD_PRZ_1302_MDM dm = new HD_PRZ_1302_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		
		dm.print();
		
		ds = (HD_PRZ_1302_MDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}

	public void hd_prz_1400(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_PRZ_1400_LDataSet ds = null;
		HD_PRZ_1400_LDM dm = new HD_PRZ_1400_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.req_dt_fm = Util.checkString(req.getParameter("req_dt_fm"));
		dm.req_dt_to = Util.checkString(req.getParameter("req_dt_to"));
		
		ds = (HD_PRZ_1400_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}

	public void hd_prz_1401(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_PRZ_1401_LDataSet ds = null;
		HD_PRZ_1401_LDM dm = new HD_PRZ_1401_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		
		ds = (HD_PRZ_1401_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}

	public void hd_prz_1402(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_PRZ_1402_ADataSet ds = null;
		HD_PRZ_1402_ADM dm = new HD_PRZ_1402_ADM();

		String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);
		
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.connect_ip = req.getRemoteAddr();
		dm.connect_userid = Util.getSessionParameterValue(req, "emp_no", true);
		
		dm.mode = ((String)hash.get("m")).toUpperCase();
		dm.emp_no = (String)hash.get("emp_no");
		dm.flnm = (String)hash.get("flnm");
		dm.req_dt = (String)hash.get("req_dt");
		dm.displcemt_dt = (String)hash.get("displcemt_dt");	 
		dm.dept_cd = (String)hash.get("dept_cd");
		dm.dty_cd = (String)hash.get("dty_cd");
		dm.posi_cd = (String)hash.get("posi_cd");
		dm.occr_dt = (String)hash.get("occr_dt");
		dm.seq = (String)hash.get("seq");
		
		ds = (HD_PRZ_1402_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_prz_1105_d(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_PRZ_1105_DDataSet ds = null;
		HD_PRZ_1105_DDM dm = new HD_PRZ_1105_DDM();

		String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.occr_dt = (String)hash.get("occr_dt");
		dm.seq = (String)hash.get("seq");
		dm.sub_seq = (String)hash.get("sub_seq");
		dm.flag = (String)hash.get("m"); 

		dm.print();

		ds = (HD_PRZ_1105_DDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	
}
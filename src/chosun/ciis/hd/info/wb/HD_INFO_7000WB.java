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

package chosun.ciis.hd.info.wb;

import java.rmi.RemoteException;
import java.util.Hashtable;
import java.util.StringTokenizer;


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
import chosun.ciis.hd.ddemp.dm.HD_DDEMP_1000_LDM;
import chosun.ciis.hd.ddemp.ds.HD_DDEMP_1000_LDataSet;
import chosun.ciis.hd.info.dm.*;
import chosun.ciis.hd.info.ds.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Hashtable;
import java.io.InputStream;
import java.io.OutputStream;
import java.rmi.RemoteException;
import java.sql.CallableStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;
import java.text.SimpleDateFormat;
import java.util.*;
import oracle.jdbc.OracleResultSet;
import oracle.sql.BLOB;
import com.oreilly.servlet.multipart.*;  
/**
 * 
 */

public class HD_INFO_7000WB extends BaseWB {

    /**
     * 멀티레코드처리 row 구분자
     */
    public final String ROW_SEPARATOR = "|";
    /**
     * 멀티레코드처리 column 구분자
     */
    public final String COL_SEPARATOR = "#";

    public void hd_info_7100_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_INFO_7100_MDataSet ds = null;
		HD_INFO_7100_MDM dm = new HD_INFO_7100_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		
		ds = (HD_INFO_7100_MDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    
    public void hd_info_7110_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_INFO_7110_LDataSet ds = null;
		HD_INFO_7110_LDM dm = new HD_INFO_7110_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
	 	dm.supr_dept_cd = Util.checkString(req.getParameter("supr_dept_cd"));
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.flnm = Util.checkString(req.getParameter("flnm"));
		dm.medi_cd = Util.checkString(req.getParameter("medi_cd"));
		dm.thrw_pgm = Util.checkString(req.getParameter("thrw_pgm"));
		dm.chrg_posk_cd = Util.checkString(req.getParameter("chrg_posk_cd"));
		dm.work_yn = Util.checkString(req.getParameter("work_yn"));
		dm.ss_emp_no = Util.getSessionParameterValue(req,"emp_no",true);
		dm.chrg_posk_nm = Util.checkString(req.getParameter("chrg_posk_nm"));
		System.out.println("chrg_posk_nm:");
		System.out.println(Util.checkString(req.getParameter("flnm")));
		System.out.println(Util.checkString(req.getParameter("chrg_posk_nm")));
		ds = (HD_INFO_7110_LDataSet)manager.executeCall(dm);
		dm.print();
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    

    public void hd_info_7130_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_INFO_7130_ADataSet ds = null;
		HD_INFO_7130_ADM dm = new HD_INFO_7130_ADM();
		System.out.println("11111111111111111111111111");
		dm.mode = Util.checkString(req.getParameter("mode"));	
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.frlc_no = Util.checkString(req.getParameter("frlc_no"));
		dm.mang_no = Util.checkString(req.getParameter("mang_no"));
		dm.flnm = Util.checkString(req.getParameter("flnm"));
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.prn = Util.checkString(req.getParameter("prn"));
		dm.tel_no = Util.checkString(req.getParameter("tel_no"));
		dm.zip_code = Util.checkString(req.getParameter("zip_code"));
		dm.addr = Util.checkString(req.getParameter("addr"));
		dm.dtls_addr = Util.checkString(req.getParameter("dtls_addr"));
		dm.chrg_posk_cd = Util.checkString(req.getParameter("chrg_posk_cd"));
		dm.medi_cd = Util.checkString(req.getParameter("medi_cd"));
		dm.thrw_pgm = Util.checkString(req.getParameter("thrw_pgm"));
		dm.medi_cd2 = Util.checkString(req.getParameter("medi_cd2"));
		dm.thrw_pgm2 = Util.checkString(req.getParameter("thrw_pgm2"));
		dm.cntr_dt = Util.checkString(req.getParameter("cntr_dt"));
		dm.cntr_expr_dt = Util.checkString(req.getParameter("cntr_expr_dt"));
		dm.lvcmpy_dt = Util.checkString(req.getParameter("lvcmpy_dt"));
		dm.work_yn = Util.checkString(req.getParameter("work_yn"));
		dm.pay_cycl = Util.checkString(req.getParameter("pay_cycl"));
		dm.servcost = Util.checkString(req.getParameter("servcost"));
		dm.serv_pay_cond = Util.checkString(req.getParameter("serv_pay_cond"));
		dm.draft_no = Util.checkString(req.getParameter("draft_no"));	
		dm.draft_dept_cd = Util.checkString(req.getParameter("draft_dept_cd"));	
		dm.supr_dept_cd = Util.checkString(req.getParameter("supr_dept_cd"));	
		dm.incm_clsf_cd = Util.checkString(req.getParameter("incm_clsf_cd"));	
		dm.incmg_pers_ipadd =  req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.chrg_posk_nm = Util.checkString(req.getParameter("chrg_posk_nm"));
		dm.all_insr_dduc_yn = Util.checkString(req.getParameter("all_insr_dduc_yn"));
		dm.remk = Util.checkString(req.getParameter("remk"));

		ds = (HD_INFO_7130_ADataSet)manager.executeCall(dm);

		dm.print();
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    public void hd_info_7140_a(HttpServletRequest req, HttpServletResponse res) throws AppException , IOException{
		Hashtable ht = new Hashtable();
		byte[] phot = new byte[10 * 1024 * 1024];
		
    	String file_name = "";
    	String file_size = "";
    	
    	System.out.println("length=" + phot.length);
    	
        int sizeLimit = 10 * 1024 * 1024 ;
        MultipartParser mp = new MultipartParser(req, sizeLimit, true, true, "EUC-KR"); // 10MB 
        
        HD_INFO_7140_ADataSet ds = null;
        HD_INFO_7140_ADM dm = new HD_INFO_7140_ADM();

        Part part; 
        
        while ((part = mp.readNextPart()) != null) {
            String name  = part.getName();
            if (part.isParam()) {
    			ht.put(part.getName(), ((ParamPart)part).getStringValue());
            }else if (part.isFile()) {
                FilePart filePart = (FilePart) part;
                file_name = filePart.getFileName();
               // System.out.print("sizeLimit:"+sizeLimit);
               // System.out.print("file_name:"+file_name);
                if ( file_name != null ) {
                	ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
    				((FilePart)part).writeTo(byteArrayOutputStream);
    				//System.out.println("11111112:"+filePart.getFilePath());
    				 
    				phot = byteArrayOutputStream.toByteArray();
    	    		//dm.up_phot_img = up_phot_img;
    	    		file_size = String.valueOf(phot.length);
    	    		//System.out.println("file_size:" + phot.length);
                }
                
            }
            
        }
        
        dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers_ipadd = Util.checkString(req.getRemoteAddr());
		dm.frlc_no          = Util.checkString((String)ht.get("frlc_no"));
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.phot = "1010".getBytes();
		dm.file_size = file_size; 
		dm.print();
		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISHDL");

		ds = (HD_INFO_7140_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}else{
			// BLOB 구하기
			//manager.m_conn.setAutoCommit(false);		
      //      System.out.println("file_name:" + file_name);
      //      System.out.println("file_size:" + file_size);
			if(file_name != ""){
				try {
				//	System.out.println("update:::");
					manager.getConnection();
					manager.m_conn.setAutoCommit(false);
				//	System.out.println("manager:"+manager);
					Statement stmt = manager.m_conn.createStatement();
					
					//System.out.println("stmt:"+stmt);
					String blobQuery = "SELECT PHOT FROM TAHDM_FREELANCER_PHOT WHERE CMPY_CD = '" + dm.cmpy_cd + "' AND FRLC_NO = '" + dm.frlc_no + "' FOR UPDATE";			
					//String blobQuery = "SELECT BO_HEAD_PHOT FROM TASEM_BOHEADPHOT WHERE CMPY_CD = '"+dm.cmpy_cd+"' AND BO_HEAD_PRN = '"+dm.bo_head_prn+"' FOR UPDATE";
					//System.out.println("blobQuery:"+blobQuery);
					//System.out.println("up_phot_img.length:"+up_phot_img.length);
					 
					OracleResultSet rset = (OracleResultSet)stmt.executeQuery(blobQuery);
					//System.out.println("kkk");
					if (rset.next()) {     
//						웹로직용
					//	weblogic.jdbc.wrapper.Blob weblogic_blob = (weblogic.jdbc.wrapper.Blob)rset.getBlob(1);
					//	BLOB oracle_blob = (BLOB)weblogic_blob.getVendorObj();
		      	   		
						//레진용(ep1)
		      	   		oracle.sql.BLOB oracle_blob = (BLOB)rset.getBlob(1);	
		      	   		OutputStream os = oracle_blob.getBinaryOutputStream();
						  
						// 파일로부터 읽어서 BLOB 에 WRITE 한다.
						for(int i=0; i<phot.length; i++){
							os.write(phot[i]);
						}
						os.close();
					}
					stmt.close();
					manager.m_conn.commit();
					manager.disConnection();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					try{
						manager.m_conn.rollback();
						manager.disConnection();
					}catch(SQLException se){
						manager.disConnection();
						throw new SysException(se);
					}
					manager.disConnection();
					throw new SysException(e);
				}
			}
		}
		req.setAttribute("ds", ds);
    }
    public void hd_info_7150_s(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_INFO_7150_SDataSet ds = null;
		HD_INFO_7150_SDM dm = new HD_INFO_7150_SDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.frlc_no = Util.checkString(req.getParameter("frlc_no"));

		ds = (HD_INFO_7150_SDataSet)manager.executeCall(dm);
		dm.print();
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    public void hd_info_7120_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_INFO_7120_LDataSet ds = null;
		HD_INFO_7120_LDM dm = new HD_INFO_7120_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.mang_no = Util.checkString(req.getParameter("mang_no"));
		dm.supr_dept_cd = Util.checkString(req.getParameter("supr_dept_cd"));
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));

		ds = (HD_INFO_7120_LDataSet)manager.executeCall(dm);
		dm.print();
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    //프로랜서 관리 조회 
    public void hd_info_7200_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_INFO_7200_LDataSet ds = null;
		HD_INFO_7200_LDM dm = new HD_INFO_7200_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.pay_mm = Util.checkString(req.getParameter("pay_mm"));
		dm.flnm =  Util.checkString(req.getParameter("flnm"));
		dm.proc_stat =  Util.checkString(req.getParameter("proc_stat"));
		dm.actu_slip_no =  Util.checkString(req.getParameter("actu_slip_no"));
		dm.ss_emp_no = Util.getSessionParameterValue(req,"emp_no",true);
		
		ds = (HD_INFO_7200_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println(dm.cmpy_cd);
        	System.out.println(dm.dept_cd);
        	System.out.println(dm.pay_mm);
        	System.out.println(dm.proc_stat);
        	System.out.println(dm.actu_slip_no);
        	System.out.println(dm.ss_emp_no);
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
    }
    
    
    public void hd_info_7201_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_INFO_7201_ADataSet ds = null;
		HD_INFO_7201_ADM dm = new HD_INFO_7201_ADM();

		String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd =  Util.getSessionParameterValue(req,"cmpycd",true);
		dm.mode = ((String)hash.get("m")).toUpperCase();
		dm.frlc_no = (String)hash.get("frlc_no");
		dm.flnm = (String)hash.get("flnm");
		dm.mang_no = (String)hash.get("mang_no");
		dm.dept_cd = (String)hash.get("dept_cd");
		dm.pay_mm = (String)hash.get("pay_mm");
		dm.duty_dds = (String)hash.get("duty_dds");
		dm.duty_tms = (String)hash.get("duty_tms");
		dm.pay_cycl = (String)hash.get("pay_cycl");
		dm.servcost = (String)hash.get("servcost");
		dm.pay_amt = (String)hash.get("pay_amt");
		dm.etc_pay_cond = (String)hash.get("etc_pay_cond");
		dm.base_amt = (String)hash.get("base_amt");
		dm.etc_amt = (String)hash.get("etc_amt");
		dm.tot_amt = (String)hash.get("tot_amt");
		dm.incm_tax = (String)hash.get("incm_tax");
		dm.res_tax = (String)hash.get("res_tax");
		dm.chrg_posk_cd = (String)hash.get("chrg_posk_cd");
		dm.medi_cd = (String)hash.get("medi_cd");
		dm.thrw_pgm = (String)hash.get("thrw_pgm");
		dm.cntr_dt = (String)hash.get("cntr_dt");
		dm.cntr_expr_dt = (String)hash.get("cntr_expr_dt");
		dm.lvcmpy_dt = (String)hash.get("lvcmpy_dt");
		dm.draft_no = (String)hash.get("draft_no");
		dm.remk = (String)hash.get("remk");
		dm.budg_cd = (String)hash.get("budg_cd");
		
		dm.occr_dt = (String)hash.get("occr_dt");
		dm.seq = (String)hash.get("seq");
		dm.incmg_pers_ipadd =  req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		//dm.aplc_clsf_req = Util.checkString(req.getParameter("aplc_clsf_req"));
		
		dm.print();

		ds = (HD_INFO_7201_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    
    //프로랜서 관리  생성조회 
    public void hd_info_7202_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_INFO_7202_LDataSet ds = null;
		HD_INFO_7202_LDM dm = new HD_INFO_7202_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.pay_mm = Util.checkString(req.getParameter("pay_mm"));
		dm.ss_emp_no = Util.getSessionParameterValue(req,"emp_no",true);
		
		ds = (HD_INFO_7202_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
    }

    //프로랜서 관리  생성조회 
    public void hd_info_7203_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_INFO_7203_MDataSet ds = null;
		HD_INFO_7203_MDM dm = new HD_INFO_7203_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
	
		
		ds = (HD_INFO_7203_MDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
    }
    public void hd_info_7204_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_INFO_7204_ADataSet ds = null;
		HD_INFO_7204_ADM dm = new HD_INFO_7204_ADM();

		String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.mode = ((String)hash.get("m")).toUpperCase();
		dm.occr_dt = (String)hash.get("occr_dt");
		dm.seq = (String)hash.get("seq");
		dm.frlc_no = (String)hash.get("frlc_no");
		String clos_yn   		  = Util.checkString(req.getParameter("clos_yn"));
		
		dm.setClos_yn(clos_yn);
	//	dm.clos_yn =  Util.checkString(req.getParameter("clos_yn"));
		dm.duty_dds = (String)hash.get("duty_dds");
		dm.duty_tms = (String)hash.get("duty_tms");
		dm.pay_amt = (String)hash.get("pay_amt");
		dm.etc_amt = (String)hash.get("etc_amt");
		dm.tot_amt = (String)hash.get("tot_amt");
		dm.pay_cycl = (String)hash.get("pay_cycl");
		dm.servcost = (String)hash.get("servcost");
		dm.etc_pay_cond = (String)hash.get("etc_pay_cond");
		
		dm.cmpy_cd =  Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers_ipaddr =  req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		//dm.aplc_clsf_req = Util.checkString(req.getParameter("aplc_clsf_req"));
		
		dm.print();

		ds = (HD_INFO_7204_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    public void hd_info_7206_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_INFO_7206_ADataSet ds = null;
		HD_INFO_7206_ADM dm = new HD_INFO_7206_ADM();

		String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.mode = ((String)hash.get("m")).toUpperCase();
		dm.cmpy_cd =  Util.getSessionParameterValue(req,"cmpycd",true);
		dm.pay_mm = (String)hash.get("pay_mm");
		dm.occr_dt = (String)hash.get("occr_dt");
		dm.seq = (String)hash.get("seq");
		dm.slip_proc_mang_dt = (String)hash.get("slip_proc_mang_dt");
		dm.slip_proc_mang_seq = (String)hash.get("slip_proc_mang_seq");
		dm.mang_no  = (String)hash.get("mang_no");
		dm.incmg_pers_ipadd =  req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		//dm.aplc_clsf_req = Util.checkString(req.getParameter("aplc_clsf_req"));
		
		dm.print();

		ds = (HD_INFO_7206_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    
    public void hd_info_7207_d(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_INFO_7207_DDataSet ds = null;
		HD_INFO_7207_DDM dm = new HD_INFO_7207_DDM();

		String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.mode = ((String)hash.get("m")).toUpperCase();
		dm.cmpy_cd =  Util.getSessionParameterValue(req,"cmpycd",true);
		dm.pay_mm = (String)hash.get("pay_mm");
		dm.actu_slip_no = (String)hash.get("actu_slip_no");
		dm.slip_proc_mang_dt = (String)hash.get("slip_proc_mang_dt");
		dm.slip_proc_mang_seq = (String)hash.get("slip_proc_mang_seq");
		dm.incmg_pers_ipadd =  req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		//dm.aplc_clsf_req = Util.checkString(req.getParameter("aplc_clsf_req"));
		
		dm.print();

		ds = (HD_INFO_7207_DDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    
    //프로랜서 관리   
    public void hd_info_7208_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_INFO_7208_MDataSet ds = null;
		HD_INFO_7208_MDM dm = new HD_INFO_7208_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
	
		
		ds = (HD_INFO_7208_MDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
    }
}

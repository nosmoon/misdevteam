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

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.rmi.RemoteException;
import java.sql.CallableStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;
import java.text.SimpleDateFormat;
import java.util.*;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import oracle.jdbc.OracleResultSet;
import oracle.sql.BLOB;

import com.oreilly.servlet.multipart.*;

import chosun.ciis.co.base.util.StreamUtil;
import chosun.ciis.co.base.wb.BaseWB;
import chosun.ciis.co.decid.ds.CO_DECID_2000_IDataSet;
import somo.framework.db.BaseDataSet;
import somo.framework.expt.AppException;
import somo.framework.expt.SysException;
import somo.framework.lib.JNDIManager;
import somo.framework.db.DBManager;
import somo.framework.log.LogManager;
import somo.framework.util.Util;
import chosun.ciis.hd.info.dm.*;
import chosun.ciis.hd.info.ds.*;
/**
 * 
 */

public class HD_INFO_2000WB extends BaseWB {

    /**
     * 멀티레코드처리 row 구분자
     */
    public final String ROW_SEPARATOR = "|";
    /**
     * 멀티레코드처리 column 구분자
     */
    public final String COL_SEPARATOR = "#";
    
    public void hd_info_2000_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_INFO_2000_LDataSet ds = null;
		HD_INFO_2000_LDM dm = new HD_INFO_2000_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);

		ds = (HD_INFO_2000_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}

    public void hd_info_2001_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_INFO_2001_LDataSet ds = null;
		HD_INFO_2001_LDM dm = new HD_INFO_2001_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.intern_desty = Util.checkString(req.getParameter("intern_desty"));
		dm.psgp_cd = Util.checkString(req.getParameter("psgp_cd"));
		dm.flnm = Util.checkString(req.getParameter("flnm"));
		dm.print();

		ds = (HD_INFO_2001_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    
    public void hd_info_2002_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_INFO_2002_ADataSet ds = null;
		HD_INFO_2002_ADM dm = new HD_INFO_2002_ADM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.mode = Util.checkString(req.getParameter("mode"));
		dm.occr_dt = Util.checkString(req.getParameter("occr_dt"));
		dm.seq = Util.checkString(req.getParameter("seq"));
		dm.psgp_cd = Util.checkString(req.getParameter("psgp_cd"));
		dm.intern_desty = Util.checkString(req.getParameter("intern_desty"));
		dm.flnm = Util.checkString(req.getParameter("flnm"));
		dm.prn = Util.checkString(req.getParameter("prn"));
		dm.tel_no = Util.checkString(req.getParameter("tel_no"));
		dm.univ_nm = Util.checkString(req.getParameter("univ_nm"));
		dm.majr_nm = Util.checkString(req.getParameter("majr_nm"));
		dm.univ_enty_yy = Util.checkString(req.getParameter("univ_enty_yy"));
		dm.engl_test_nm = Util.checkString(req.getParameter("engl_test_nm"));
		dm.engl_test_scor = Util.checkString(req.getParameter("engl_test_scor"));
		dm.hby = Util.checkString(req.getParameter("hby"));
		dm.spc = Util.checkString(req.getParameter("spc"));
		dm.acty_dept = Util.checkString(req.getParameter("acty_dept"));
		dm.acty_frdt = Util.checkString(req.getParameter("acty_frdt"));
		dm.acty_todt = Util.checkString(req.getParameter("acty_todt"));
		dm.acty_complt_yn = Util.checkString(req.getParameter("acty_complt_yn"));
		dm.carr_matt_1 = Util.checkString(req.getParameter("carr_matt_1"));
		dm.carr_matt_1_frdt = Util.checkString(req.getParameter("carr_matt_1_frdt"));
		dm.carr_matt_1_todt = Util.checkString(req.getParameter("carr_matt_1_todt"));
		dm.carr_matt_1_instt = Util.checkString(req.getParameter("carr_matt_1_instt"));
		dm.carr_matt_2 = Util.checkString(req.getParameter("carr_matt_2"));
		dm.carr_matt_2_frdt = Util.checkString(req.getParameter("carr_matt_2_frdt"));
		dm.carr_matt_2_todt = Util.checkString(req.getParameter("carr_matt_2_todt"));
		dm.carr_matt_2_instt = Util.checkString(req.getParameter("carr_matt_2_instt"));
		dm.carr_matt_3 = Util.checkString(req.getParameter("carr_matt_3"));
		dm.carr_matt_3_frdt = Util.checkString(req.getParameter("carr_matt_3_frdt"));
		dm.carr_matt_3_todt = Util.checkString(req.getParameter("carr_matt_3_todt"));
		dm.carr_matt_3_instt = Util.checkString(req.getParameter("carr_matt_3_instt"));
		dm.blng_dpthd_evlu_idea = Util.checkString(req.getParameter("blng_dpthd_evlu_idea"));
		dm.etc = Util.checkString(req.getParameter("etc"));
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		
		dm.print();
		
		ds = (HD_INFO_2002_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    
    public void hd_info_2003_a(HttpServletRequest req, HttpServletResponse res) throws AppException, IOException {

    	Hashtable ht = new Hashtable();
		byte[] phot = new byte[10485760]; //10Mb
		String file_name = "";
		String file_size = "";
        int sizeLimit = 10 * 1024 * 1024 ;
        MultipartParser mp = new MultipartParser(req, sizeLimit, true, true, "EUC-KR"); // 10MB
    	
		HD_INFO_2003_ADataSet ds = null;
		HD_INFO_2003_ADM dm = new HD_INFO_2003_ADM();
		
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
					phot = byteArrayOutputStream.toByteArray();
		    		dm.phot = phot;
		    		//file_size = String.valueOf(phot.length);
		    		//dm.file_size = file_size;
		        }
		    }
		}

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		//dm.phot = Util.checkString(req.getParameter("phot"));
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		
		dm.print();

		DBManager manager = new DBManager("MISHDL");
		ds = (HD_INFO_2003_ADataSet)manager.executeCall(dm);

		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    
    public void hd_info_2004_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_INFO_2004_ADataSet ds = null;
		HD_INFO_2004_ADM dm = new HD_INFO_2004_ADM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.occr_dt = Util.checkString(req.getParameter("occr_dt"));
		dm.seq = Util.checkString(req.getParameter("seq"));
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		
		dm.print();

		ds = (HD_INFO_2004_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    
    public void hd_info_2006_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_INFO_2006_ADataSet ds = null;
		HD_INFO_2006_ADM dm = new HD_INFO_2006_ADM();

		String multiUpdateData = Util.checkString(req.getParameter("multiUpDate"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.mode = ((String)hash.get("m")).toUpperCase();
		dm.occr_dt = (String)hash.get("occr_dt");
		dm.seq = (String)hash.get("seq");
		dm.psgp_cd = (String)hash.get("psgp_cd");
		dm.intern_desty = (String)hash.get("intern_desty");
		dm.flnm = (String)hash.get("flnm");
		dm.prn = (String)hash.get("prn");
		dm.tel_no = (String)hash.get("tel_no");
		dm.univ_nm = (String)hash.get("univ_nm");
		dm.majr_nm = (String)hash.get("majr_nm");
		dm.univ_enty_yy = (String)hash.get("univ_enty_yy");
		dm.engl_test_nm = (String)hash.get("engl_test_nm");
		dm.engl_test_scor = (String)hash.get("engl_test_scor");
		dm.hby = (String)hash.get("hby");
		dm.spc = (String)hash.get("spc");
		dm.acty_dept = (String)hash.get("acty_dept");
		dm.acty_frdt = (String)hash.get("acty_frdt");
		dm.acty_todt = (String)hash.get("acty_todt");
		dm.acty_complt_yn = (String)hash.get("acty_complt_yn");
		dm.carr_matt_1 = (String)hash.get("carr_matt_1");
		dm.carr_matt_1_frdt = (String)hash.get("carr_matt_1_frdt");
		dm.carr_matt_1_todt = (String)hash.get("carr_matt_1_todt");
		dm.carr_matt_1_instt = (String)hash.get("carr_matt_1_instt");
		dm.carr_matt_2 = (String)hash.get("carr_matt_2");
		dm.carr_matt_2_frdt = (String)hash.get("carr_matt_2_frdt");
		dm.carr_matt_2_todt = (String)hash.get("carr_matt_2_todt");
		dm.carr_matt_2_instt = (String)hash.get("carr_matt_2_instt");
		dm.carr_matt_3 = (String)hash.get("carr_matt_3");
		dm.carr_matt_3_frdt = (String)hash.get("carr_matt_3_frdt");
		dm.carr_matt_3_todt = (String)hash.get("carr_matt_3_todt");
		dm.carr_matt_3_instt = (String)hash.get("carr_matt_3_instt");
		dm.blng_dpthd_evlu_idea = (String)hash.get("blng_dpthd_evlu_idea");
		dm.etc = (String)hash.get("etc");
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		
		dm.print();

		ds = (HD_INFO_2006_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    
    public void hd_info_2100_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_INFO_2100_LDataSet ds = null;
		HD_INFO_2100_LDM dm = new HD_INFO_2100_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.cd = Util.checkString(req.getParameter("issu_resn"));
		
		dm.print();

		ds = (HD_INFO_2100_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    
    public void hd_info_2101_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_INFO_2101_ADataSet ds = null;
		HD_INFO_2101_ADM dm = new HD_INFO_2101_ADM();
		
		String multiUpdateData = Util.checkString(req.getParameter("multiUpDate"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.mode = ((String)hash.get("m")).toUpperCase();
		dm.emp_no = (String)hash.get("emp_no");
		dm.flnm = (String)hash.get("flnm");
		dm.dept_cd = (String)hash.get("dept_cd");
		dm.flnm_engl = (String)hash.get("flnm_engl");
		dm.real_fee_paymt_amt = (String)hash.get("real_fee_paymt_amt");
		dm.issu_resn = (String)hash.get("issu_resn");
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		
		dm.print();

		ds = (HD_INFO_2101_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    
    public void hd_info_2102_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_INFO_2102_LDataSet ds = null;
		HD_INFO_2102_LDM dm = new HD_INFO_2102_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = Util.getSessionParameterValue(req, "emp_no", true);
		dm.emp_tm = Util.checkString(req.getParameter("emp_tm"));
		dm.search = Util.checkString(req.getParameter("search"));
		
		ds = (HD_INFO_2102_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    
    public void hd_info_2103_u(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_INFO_2103_UDataSet ds = null;
		HD_INFO_2103_UDM dm = new HD_INFO_2103_UDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.flnm_engl = Util.checkString(req.getParameter("flnm_engl"));
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);

		dm.print();

		ds = (HD_INFO_2103_UDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    
    public void hd_info_2104_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
		HD_INFO_2104_MDataSet ds = null;
		HD_INFO_2104_MDM dm = new HD_INFO_2104_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);

		dm.print();
		
		DBManager manager = new DBManager("MISHDL");
		ds = (HD_INFO_2104_MDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
   
    public void hd_info_2200_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_INFO_2200_LDataSet ds = null;
		HD_INFO_2200_LDM dm = new HD_INFO_2200_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		
		ds = (HD_INFO_2200_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    
    public void hd_info_2201_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_INFO_2201_LDataSet ds = null;
		HD_INFO_2201_LDM dm = new HD_INFO_2201_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.print();

		ds = (HD_INFO_2201_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    
    public void hd_info_2202_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_INFO_2202_LDataSet ds = null;
		HD_INFO_2202_LDM dm = new HD_INFO_2202_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.issu_yn = Util.checkString(req.getParameter("issu_yn"));
		dm.occr_dt_fr = Util.checkString(req.getParameter("occr_dt_fr"));
		dm.occr_dt_to = Util.checkString(req.getParameter("occr_dt_to"));
		dm.issu_tm = Util.checkString(req.getParameter("issu_tm"));
		
		dm.print();

		ds = (HD_INFO_2202_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    
    public void hd_info_2203_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_INFO_2203_ADataSet ds = null;
		HD_INFO_2203_ADM dm = new HD_INFO_2203_ADM();
		
		String multiUpdateData = Util.checkString(req.getParameter("multiUpDate"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);
		String proc_stat = Util.checkString(req.getParameter("proc_stat"));

		dm.gubun = ((String)hash.get("m")).toUpperCase();
		dm.emp_no = (String)hash.get("emp_no");
		dm.occr_dt = (String)hash.get("occr_dt");
		dm.seq = (String)hash.get("seq");
		dm.dept_cd = (String)hash.get("dept_cd");
		dm.dty_cd = (String)hash.get("dty_cd");
		dm.posi_cd = (String)hash.get("posi_cd");
		dm.flnm = (String)hash.get("nm_korn");
		dm.flnm_engl = (String)hash.get("flnm_engl");
		dm.flnm_chin = (String)hash.get("flnm_chin");
		dm.prn = (String)hash.get("");
		dm.bi_yymm = (String)hash.get("bi_yymm");
		dm.issu_resn = (String)hash.get("issu_resn");
		dm.real_fee_paymt_yn = (String)hash.get("real_fee_paymt_yn");
		dm.real_fee_paymt_amt = (String)hash.get("");
		dm.id_card_typ = (String)hash.get("id_card_typ");
		dm.issu_dt = (String)hash.get("issu_dt");
		dm.issu_yn = (String)hash.get("issu_yn");
		dm.remk = (String)hash.get("remk");
		
		if("3".equalsIgnoreCase(proc_stat)){
			dm.proc_stat = "10";
		}else{
			dm.proc_stat = "20";
		}
		
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers_ipadd = Util.checkString(req.getRemoteAddr());
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		
		dm.print();
		
		ds = (HD_INFO_2203_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    
    public void hd_info_2204_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_INFO_2204_MDataSet ds = null;
		HD_INFO_2204_MDM dm = new HD_INFO_2204_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);

		dm.print();

		ds = (HD_INFO_2204_MDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    
    public void hd_info_2300_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_INFO_2300_LDataSet ds = null;
		HD_INFO_2300_LDM dm = new HD_INFO_2300_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.in_cmpy_dt = Util.checkString(req.getParameter("in_cmpy_dt"));
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.lvcmpy_cd = Util.checkString(req.getParameter("lvcmpy_cd"));
		
		dm.print();

		ds = (HD_INFO_2300_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    
    public void hd_info_2301_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_INFO_2301_ADataSet ds = null;
		HD_INFO_2301_ADM dm = new HD_INFO_2301_ADM();

		String multiUpdateData = Util.checkString(req.getParameter("multiUpDate"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);
		
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.gubun = ((String)hash.get("m")).toUpperCase();
		dm.emp_no = (String)hash.get("emp_no");
		dm.rptv_posi_cd = (String)hash.get("rptv_posi_cd");
		dm.emp_srt_seq = (String)hash.get("emp_srt_seq");
		dm.emp_album_clsf = (String)hash.get("emp_album_clsf");
		dm.incmg_pers_ipadd = Util.checkString(req.getRemoteAddr());
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);

		dm.print();
		
		ds = (HD_INFO_2301_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    
    public void hd_info_2302_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_INFO_2302_MDataSet ds = null;
		HD_INFO_2302_MDM dm = new HD_INFO_2302_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);

		dm.print();

		ds = (HD_INFO_2302_MDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    
    public void hd_info_2400_a(HttpServletRequest req, HttpServletResponse res) throws AppException, IOException {
    	DBManager manager = new DBManager("MISHDL");
		Hashtable ht = new Hashtable();
		byte[] phot = new byte[10485760]; //10Mb
		String file_name = "";
		String file_size = "";
		
		int sizeLimit = 10 * 1024 * 1024 ;

        MultipartParser mp = new MultipartParser(req, sizeLimit, true, true, "EUC-KR"); // 10MB

		HD_INFO_2400_ADataSet ds = null;
		HD_INFO_2400_ADM dm = new HD_INFO_2400_ADM();

		Part part; 
		
		while ((part = mp.readNextPart()) != null) {
			
		    String name  = part.getName();
			
			if (part.isParam()) {
				ht.put(part.getName(), ((ParamPart)part).getStringValue());
		    }else if (part.isFile()) {
		        FilePart filePart = (FilePart) part;
		        file_name = filePart.getFileName();
		
		        if ( file_name != null ) {
		        	InputStream in		= filePart.getInputStream();
					dm.phot				= StreamUtil.readFromStream(in);
					file_size = String.valueOf(phot.length);
		    		dm.file_size = file_size;
		        }
		    }
		}
		try {
			manager.getConnection();
	        manager.m_conn.setAutoCommit(false);
	     
	        CallableStatement cstmt = manager.m_conn.prepareCall(dm.getSQL());
	        dm.emp_no = ht.get("emp_no_1").toString();
			dm.cmpy_cd =  Util.getSessionParameterValue(req,"cmpycd",true);
			dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
			dm.incmg_pers_ipadd = Util.checkString(req.getRemoteAddr());
	        
	        // 파라미터 설정
	        cstmt.registerOutParameter(1, Types.VARCHAR);
			cstmt.registerOutParameter(2, Types.VARCHAR);
			cstmt.setString(3, dm.cmpy_cd);
			cstmt.setString(4, dm.emp_no);
			cstmt.setBytes(5,  "1010".getBytes());
			cstmt.setString(6, dm.file_size);
			cstmt.setString(7, dm.incmg_pers);
			cstmt.setString(8, dm.incmg_pers_ipadd);
	        
	        // 실행
	        cstmt.execute();
	        
	        // 결과
	        ds = (HD_INFO_2400_ADataSet)dm.createDataSetObject();               
	        
	        ds.getValues(cstmt);
	        System.out.println("..... status..1");
	        if(!"".equals(ds.errcode)){
	        	System.out.println("..... error..1");
	        	System.out.println(ds.errmsg);
	            throw new AppException(ds.errcode, ds.errmsg);
	        }
		
	        Statement stmt = manager.m_conn.createStatement();
	        
	       	//첫번째 첨부파일
	       	if(dm.phot != null && dm.phot.length != 0){
	       		System.out.println("..... status..2");
	           	String blobQuery1 =	"SELECT PHOT " +
	               					"  FROM TAHDM_PHOT " +
	               					" WHERE CMPY_CD     = '" + dm.cmpy_cd + "' " +
	               					"   AND EMP_NO  	= '" + dm.emp_no + "' " +
	               					"FOR UPDATE";
	           	
	           	System.out.println("blobQuery1=" + blobQuery1);
	           	
	           	OracleResultSet rset1 = (OracleResultSet)stmt.executeQuery(blobQuery1);	               	
	           	if (rset1.next()) { 
	           		System.out.println("..... status..3");
	             //  weblogic.jdbc.wrapper.Blob weblogic_blob1 = (weblogic.jdbc.wrapper.Blob)rset1.getBlob(1);
	             //   BLOB oracle_blob1 = (BLOB)weblogic_blob1.getVendorObj();
         	   		//레진용(ep1)
         	   		oracle.sql.BLOB oracle_blob = (BLOB)rset1.getBlob(1);	
	               
	            //   OutputStream os1 = oracle_blob1.getBinaryOutputStream();
         	   		OutputStream os1 = oracle_blob.getBinaryOutputStream();
	               // 파일로부터 읽어서 BLOB 에 WRITE 한다.
	               for(int i=0; i<dm.phot.length; i++){
	                   os1.write(dm.phot[i]);
	               }
	               os1.close();
	           	}
	           	System.out.println("..... status..4");
	       	}
	       	
	       	manager.m_conn.commit();
			manager.m_conn.setAutoCommit(true);     
	       	stmt.close();
            manager.disConnection();
            
		} catch(Exception e){
			System.out.println("..... error..2");
			try{
     		   	manager.m_conn.rollback();
     	   	}catch(SQLException se){
     	   		throw new SysException(se);
     	   	}
     	   	manager.disConnection();
     	   throw new AppException(e.getMessage(), "9999");
		}
		
		req.setAttribute("ds", ds);
	}
    
    public void hd_info_2401_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_INFO_2401_LDataSet ds = null;
		HD_INFO_2401_LDM dm = new HD_INFO_2401_LDM();

		dm.cmpy_cd =  Util.getSessionParameterValue(req,"cmpycd",true);
		dm.dept_cd_fr = Util.checkString(req.getParameter("dept_cd_fr"));
		dm.dept_cd_to = Util.checkString(req.getParameter("dept_cd_to"));
		dm.emp_no_fr = Util.checkString(req.getParameter("emp_no_fr"));
		dm.emp_no_to = Util.checkString(req.getParameter("emp_no_to"));
		dm.print();

		ds = (HD_INFO_2401_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    
    public void hd_info_2402_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_INFO_2402_LDataSet ds = null;
		HD_INFO_2402_LDM dm = new HD_INFO_2402_LDM();

		dm.cmpy_cd =  Util.getSessionParameterValue(req,"cmpycd",true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));

		ds = (HD_INFO_2402_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}

    public void hd_info_2403_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_INFO_2403_LDataSet ds = null;
		HD_INFO_2403_LDM dm = new HD_INFO_2403_LDM();

		dm.cmpy_cd =  Util.getSessionParameterValue(req,"cmpycd",true);
		dm.dept_cd_fr = Util.checkString(req.getParameter("dept_cd_fr"));
		dm.dept_cd_to = Util.checkString(req.getParameter("dept_cd_to"));
		dm.emp_no_fr = Util.checkString(req.getParameter("emp_no_fr"));
		dm.emp_no_to = Util.checkString(req.getParameter("emp_no_to"));
		dm.lvcmpy_cd = Util.checkString(req.getParameter("lvcmpy_cd"));
		
		dm.print();

		ds = (HD_INFO_2403_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    
    public void hd_info_2405_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_INFO_2405_MDataSet ds = null;
		HD_INFO_2405_MDM dm = new HD_INFO_2405_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);

		dm.print();

		ds = (HD_INFO_2405_MDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    
    public void hd_info_2500_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_INFO_2500_LDataSet ds = null;
		HD_INFO_2500_LDM dm = new HD_INFO_2500_LDM();

		
		SimpleDateFormat sdfTime = new SimpleDateFormat("yyyyMMdd");
		long currentTime = System.currentTimeMillis();
		String timeString = sdfTime.format(new Date(currentTime));
		String nowTime = timeString.substring(0, 6);
		String et_dt = Util.checkString(req.getParameter("et_dt")) + "01";
		
		
		if(!"".equals(Util.checkString(req.getParameter("et_dt"))) && Integer.parseInt(nowTime) < Integer.parseInt(Util.checkString(req.getParameter("et_dt")))){
			et_dt = nowTime + "01";
		}
		dm.st_dt = Util.checkString(req.getParameter("st_dt")) + "01";
		dm.et_dt = et_dt;
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		
		dm.print();
		
		ds = (HD_INFO_2500_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    
    public void hd_info_2600_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_INFO_2600_LDataSet ds = null;
		HD_INFO_2600_LDM dm = new HD_INFO_2600_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.aply_yymm = Util.checkString(req.getParameter("aply_yymm"));

		dm.print();

		ds = (HD_INFO_2600_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_info_2601_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_INFO_2601_ADataSet ds = null;
		HD_INFO_2601_ADM dm = new HD_INFO_2601_ADM();

		String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.mode = ((String)hash.get("m")).toUpperCase();
		dm.cmpy_nm = (String)hash.get("cmpy_nm");
		dm.rptv_movm_nm = (String)hash.get("rptv_movm_nm");
		dm.emp_cnt = (String)hash.get("emp_cnt");
		dm.vip_serv_job = (String)hash.get("vip_serv_job");
		dm.cntr_cnclus_dt = (String)hash.get("cntr_cnclus_dt");
		dm.aply_yymm = (String)hash.get("aply_yymm");
		dm.mm_servcost = (String)hash.get("mm_servcost");
		dm.one_pers_servcost = (String)hash.get("one_pers_servcost");
		dm.spc_matt = (String)hash.get("spc_matt");
		dm.remk = (String)hash.get("remk");
		dm.seq = (String)hash.get("seq");
		dm.occr_dt = (String)hash.get("occr_dt");
        dm.incmg_pers_ipadd = req.getRemoteAddr();
        dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);

		dm.print();

		ds = (HD_INFO_2601_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_info_2602_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_INFO_2602_LDataSet ds = null;
		HD_INFO_2602_LDM dm = new HD_INFO_2602_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.cmpy_nm = Util.checkString(req.getParameter("cmpy_nm"));
		dm.aply_yymm_fr = Util.checkString(req.getParameter("aply_yymm_fr"));
		dm.aply_yymm_to = Util.checkString(req.getParameter("aply_yymm_to"));

		dm.print();

		ds = (HD_INFO_2602_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_info_2404_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		
		HD_INFO_2404_LDataSet ds = null;
		HD_INFO_2404_LDM dm = new HD_INFO_2404_LDM();
		
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));

		dm.print();
		
		ds = (HD_INFO_2404_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
}


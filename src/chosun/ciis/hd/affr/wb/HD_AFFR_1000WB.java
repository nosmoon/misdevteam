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

package chosun.ciis.hd.affr.wb;

import java.rmi.RemoteException;
import java.util.Hashtable;
import java.util.StringTokenizer;

//import javax.ejb.CreateException;
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
import chosun.ciis.hd.affr.dm.*;
import chosun.ciis.hd.affr.ds.*;
import java.lang.*;
/**
 * 
 */
 
public class HD_AFFR_1000WB extends BaseWB {
 
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

 
	
	public void hd_affr_1000_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		HD_AFFR_1000_LDataSet ds = null;
		HD_AFFR_1000_LDM dm = new HD_AFFR_1000_LDM();
		DBManager manager = new DBManager("MISHDL");
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		//dm.emp_no = Util.getSessionParameterValue(req, "emp_no", true);
		dm.emp_no =  Util.checkString(req.getParameter("emp_no"));
		dm.use_hday = Util.checkString(req.getParameter("use_hday"));

		dm.print();
		
		ds = (HD_AFFR_1000_LDataSet)manager.executeCall(dm);
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		req.setAttribute("ds", ds);
	}

	public void hd_affr_1001(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_AFFR_1001_LDataSet ds = null;
		HD_AFFR_1001_LDM dm = new HD_AFFR_1001_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);

		ds = (HD_AFFR_1001_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}	

	public void hd_affr_1002(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_AFFR_1002_LDataSet ds = null;
		HD_AFFR_1002_LDM dm = new HD_AFFR_1002_LDM();

		dm.search_year = Util.checkString(req.getParameter("search_year"));
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
	    dm.ss_emp_no = Util.getSessionParameterValue(req, "emp_no", true);
		dm.emp_no =  Util.checkString(req.getParameter("emp_no"));
		
		dm.print();
		
		ds = (HD_AFFR_1002_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}

	public void hd_affr_1002_500(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_AFFR_1002_500_LDataSet ds = null;
		HD_AFFR_1002_500_LDM dm = new HD_AFFR_1002_500_LDM();

		dm.search_year = Util.checkString(req.getParameter("search_year"));
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
	    dm.ss_emp_no = Util.getSessionParameterValue(req, "emp_no", true);
		dm.emp_no =  Util.checkString(req.getParameter("emp_no"));
		
		dm.print();
		
		ds = (HD_AFFR_1002_500_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}

	public void hd_affr_1003(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_AFFR_1003_ADataSet ds = null;
		HD_AFFR_1003_ADM dm = new HD_AFFR_1003_ADM();

		String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.mode = ((String)hash.get("m")).toUpperCase();
		dm.emp_no = (String)hash.get("emp_no");
		dm.seq = (String)hash.get("seq");
		dm.occr_dt = (String)hash.get("occr_dt");
		dm.flnm = (String)hash.get("flnm");
		dm.dept_cd = (String)hash.get("dept_cd");
		dm.dty_cd = (String)hash.get("dty_cd");
		dm.posi_cd = (String)hash.get("posi_cd");
		dm.use_frdt = (String)hash.get("use_frdt");
		dm.use_todt = (String)hash.get("use_todt");
		dm.use_dds = (String)hash.get("use_dds");
		dm.aplc_amt = (String)hash.get("aplc_amt");
		dm.preng_condo_area_cd_1 = (String)hash.get("preng_condo_area_cd_1"); 
		dm.preng_condo_cd_1 = (String)hash.get("preng_condo_cd_1"); 
		dm.preng_condo_nm_1 = (String)hash.get("preng_condo_nm_1"); 
		dm.preng_condo_area_cd_2 = (String)hash.get("preng_condo_area_cd_2");
		dm.preng_condo_cd_2 = (String)hash.get("preng_condo_cd_2");
		dm.preng_condo_nm_2 = (String)hash.get("preng_condo_nm_2");
		dm.cmpy_sply_use_yn = (String)hash.get("cmpy_sply_use_yn");
		dm.tel_no = (String)hash.get("tel_no");
		dm.ptph_no = (String)hash.get("ptph_no");
		dm.email_addr = (String)hash.get("email_addr");
		dm.remk = (String)hash.get("remk");
		dm.guest_room_cnt = (String)hash.get("guest_room_cnt");
		dm.emp_clsf = (String)hash.get("emp_clsf");
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.incmg_pers_ipadd  = req.getRemoteAddr();
		dm.print();

		ds = (HD_AFFR_1003_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}	
	
	public void hd_affr_1003_500(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_AFFR_1003_500_ADataSet ds = null;
		HD_AFFR_1003_500_ADM dm = new HD_AFFR_1003_500_ADM();

		String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);
		
		dm.mode = ((String)hash.get("m")).toUpperCase();
		dm.emp_no = (String)hash.get("emp_no");
		dm.seq = (String)hash.get("seq");
		dm.occr_dt = (String)hash.get("occr_dt");
		dm.flnm = (String)hash.get("flnm");
		dm.dept_cd = (String)hash.get("dept_cd");
		dm.dty_cd = (String)hash.get("dty_cd");
		dm.posi_cd = (String)hash.get("posi_cd");
		dm.use_frdt = (String)hash.get("use_frdt");
		dm.use_todt = (String)hash.get("use_todt");
		dm.use_dds = (String)hash.get("use_dds");
		dm.aplc_amt = (String)hash.get("aplc_amt");
		dm.cmpy_sply_use_yn = (String)hash.get("cmpy_sply_use_yn");
		dm.tel_no = (String)hash.get("tel_no");
		dm.ptph_no = (String)hash.get("ptph_no");
		dm.email_addr = (String)hash.get("email_addr");
		dm.remk = (String)hash.get("remk");
		dm.guest_room_cnt = (String)hash.get("guest_room_cnt");
		dm.emp_clsf = (String)hash.get("emp_clsf");
		dm.rcpt_clsf = (String)hash.get("rcpt_clsf");
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.incmg_pers_ipadd  = req.getRemoteAddr();
		dm.print();

		ds = (HD_AFFR_1003_500_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}	

	public void hd_affr_1004_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_AFFR_1004_LDataSet ds = null;
		HD_AFFR_1004_LDM dm = new HD_AFFR_1004_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.mang_cd_1 = Util.checkString(req.getParameter("mang_cd_1"));

		dm.print();

		ds = (HD_AFFR_1004_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}

	public void hd_affr_1100(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_AFFR_1100_LDataSet ds = null;
		HD_AFFR_1100_LDM dm = new HD_AFFR_1100_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = Util.getSessionParameterValue(req, "emp_no", true);
		dm.srch_code = Util.checkString(req.getParameter("srch_code"));
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.srch_emp_no = Util.checkString(req.getParameter("srch_emp_no"));
		dm.actu_slip_no = Util.checkString(req.getParameter("actu_slip_no"));		
		dm.emp_clsf = Util.checkString(req.getParameter("emp_clsf"));
		dm.use_fr_aplc_dt = Util.checkString(req.getParameter("use_fr_aplc_dt"));
		dm.use_to_aplc_dt = Util.checkString(req.getParameter("use_to_aplc_dt"));
		dm.proc_stat = Util.checkString(req.getParameter("proc_stat"));
		dm.ss_emp_no = Util.getSessionParameterValue(req, "emp_no", true);
		
		dm.print();

		ds = (HD_AFFR_1100_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}	
	public void hd_affr_11000_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		
		HD_AFFR_11000_MDataSet ds = null;
		HD_AFFR_11000_MDM dm = new HD_AFFR_11000_MDM();
		
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		
		dm.print();
		
		ds = (HD_AFFR_11000_MDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
			System.out.println("DAO..error.");
			throw new AppException(ds.errcode, ds.errmsg);
		}
		
		req.setAttribute("ds", ds);
	}	

	public void hd_affr_1101(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_AFFR_1101_LDataSet ds = null;
		HD_AFFR_1101_LDM dm = new HD_AFFR_1101_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.print();

		ds = (HD_AFFR_1101_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_affr_1102(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_AFFR_1102_LDataSet ds = null;
		HD_AFFR_1102_LDM dm = new HD_AFFR_1102_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.print();	

		ds = (HD_AFFR_1102_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}	

	public void hd_affr_1103(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_AFFR_1103_ADataSet ds = null;
		HD_AFFR_1103_ADM dm = new HD_AFFR_1103_ADM();

		String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);
		
		dm.mode = ((String)hash.get("m")).toUpperCase();
		dm.emp_no = (String)hash.get("emp_no");
		dm.slip_proc_mang_dt = (String)hash.get("slip_proc_mang_dt");
		dm.slip_proc_mang_seq = (String)hash.get("slip_proc_mang_seq");
		dm.aplc_dt = (String)hash.get("aplc_dt");			     
		dm.emp_no = (String)hash.get("emp_no");
		dm.flnm = (String)hash.get("flnm");	       
		dm.preng_condo_nm_1 = (String)hash.get("preng_condo_nm_1");  		     
		dm.preng_condo_nm_2 = (String)hash.get("preng_condo_nm_2");  		     
		dm.real_preng_condo_nm = (String)hash.get("real_preng_condo_nm");        
		dm.preng_no = (String)hash.get("preng_no");  						     
		dm.use_frdt = (String)hash.get("use_frdt");  						     
		dm.use_todt = (String)hash.get("use_todt");		     
		dm.use_dds = (String)hash.get("use_dds");		       
		dm.guest_room_cnt = (String)hash.get("guest_room_cnt");			     
		dm.ptph_no = (String)hash.get("ptph_no");		       
		dm.tel_no = (String)hash.get("tel_no");		     
		dm.email_addr = (String)hash.get("email_addr");		     
		dm.remk = (String)hash.get("remk");	       
		dm.use_pay_amt = (String)hash.get("use_pay_amt");		       
		dm.slf_burd_amt = (String)hash.get("slf_burd_amt");		     
		dm.cmpy_sply_amt = (String)hash.get("cmpy_sply_amt");				   
		dm.slf_drbk_amt = (String)hash.get("slf_drbk_amt");				 
		dm.guest_room_fee_tot_amt = (String)hash.get("guest_room_fee_tot_amt"); 	   
		dm.dept_cd = (String)hash.get("dept_cd");			 	   
		dm.dty_cd = (String)hash.get("dty_cd");		 		 
		dm.posi_cd = (String)hash.get("posi_cd");			 	   
		dm.seq = (String)hash.get("seq");	 			   
		dm.preng_condo_cd_1 = (String)hash.get("preng_condo_cd_1");  				 
		dm.preng_condo_cd_2 = (String)hash.get("preng_condo_cd_2");  				 
		dm.occr_dt = (String)hash.get("occr_dt");			 	   
		dm.noti_yn = (String)hash.get("noti_yn");			 	   
		dm.drbk_obj_yn = (String)hash.get("drbk_obj_yn");				   
		dm.real_preng_condo_area_cd = (String)hash.get("real_preng_condo_area_cd");   
		dm.real_preng_condo_cd = (String)hash.get("real_preng_condo_cd");  	
		dm.preng_condo_area_cd_1 = (String)hash.get("preng_condo_area_cd_1");
		dm.preng_condo_area_cd_2 = (String)hash.get("preng_condo_area_cd_2");
		dm.cmpy_sply_use_yn = (String)hash.get("cmpy_sply_use_yn");  				 
		dm.preng_canc_yn = (String)hash.get("preng_canc_yn");  	
		dm.emp_clsf = (String)hash.get("emp_clsf");
		dm.rcpt_clsf = (String)hash.get("rcpt_clsf");
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.ss_emp_no = Util.getSessionParameterValue(req, "emp_no", true);
		dm.incmg_pers_ipadd  = req.getRemoteAddr();
		dm.remk_adm = (String)hash.get("remk_adm");
		
		dm.print();

		ds = (HD_AFFR_1103_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}

	public void hd_affr_1105_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_AFFR_1105_ADataSet ds = null;
		HD_AFFR_1105_ADM dm = new HD_AFFR_1105_ADM();
		
		String multiUpdateData1 = Util.checkString(req.getParameter("multiUpData1"));
		Hashtable hash1 = getHashMultiUpdateData(multiUpdateData1);

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		
		dm.s_mode = ((String)hash1.get("m")).toUpperCase();
		dm.tmp_dr_amt = ((String)hash1.get("tmp_dr_amt"));
		dm.emp_no =  ((String)hash1.get("emp_no"));
		dm.flnm =  ((String)hash1.get("flnm"));
		dm.dept_cd =  ((String)hash1.get("dept_cd"));
		dm.titl2 =  ((String)hash1.get("titl2"));
		dm.cmpy_welf_fund_clsf =  ((String)hash1.get("cmpy_welf_fund_clsf"));
		dm.slip_proc_mang_dt =  ((String)hash1.get("slip_proc_mang_dt"));
		dm.slip_proc_mang_seq =  ((String)hash1.get("slip_proc_mang_seq"));
		
		dm.occr_dt = ((String)hash1.get("occr_dt"));
		dm.seq = ((String)hash1.get("seq"));
		
		dm.tmp_crdt_amt = Util.checkString(req.getParameter("tmp_crdt_amt"));
		dm.titl = Util.checkString(req.getParameter("titl"));
		
		dm.incmg_pers_ipadd =  req.getRemoteAddr();
		dm.ss_emp_no = Util.getSessionParameterValue(req, "emp_no", true);
		dm.rcpt_clsf =  ((String)hash1.get("rcpt_clsf"));
		
		dm.print();

		ds = (HD_AFFR_1105_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}	
	

	public void hd_affr_1106_d(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_AFFR_1106_DDataSet ds = null;
		HD_AFFR_1106_DDM dm = new HD_AFFR_1106_DDM();
		
		String multiUpdateData1 = Util.checkString(req.getParameter("multiUpData1"));
		Hashtable hash1 = getHashMultiUpdateData(multiUpdateData1);

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.mode = ((String)hash1.get("m")).toUpperCase();
		dm.slip_proc_mang_dt = ((String)hash1.get("slip_proc_mang_dt"));
		dm.slip_proc_mang_seq = ((String)hash1.get("slip_proc_mang_seq"));
		dm.cmpy_welf_fund_clsf = ((String)hash1.get("cmpy_welf_fund_clsf"));
		dm.slip_occr_dt = Util.checkString(req.getParameter("slip_occr_dt"));
		dm.slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
		dm.slip_seq = Util.checkString(req.getParameter("slip_seq"));
		dm.slip_incmg_pers = Util.checkString(req.getParameter("slip_incmg_pers"));
		dm.slip_incmg_pers_ipadd = Util.checkString(req.getParameter("slip_incmg_pers_ipadd"));
		
		dm.incmg_pers_ipadd =  req.getRemoteAddr();
		dm.ss_emp_no = Util.getSessionParameterValue(req, "emp_no", true);

		dm.print();

		ds = (HD_AFFR_1106_DDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}	
	

	public void hd_affr_1108_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_AFFR_1108_LDataSet ds = null;
		HD_AFFR_1108_LDM dm = new HD_AFFR_1108_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.preng_condo_area_cd_1 = Util.checkString(req.getParameter("preng_condo_area_cd_1"));
		dm.preng_condo_area_cd_2 = Util.checkString(req.getParameter("preng_condo_area_cd_2"));
		dm.real_preng_condo_area_cd = Util.checkString(req.getParameter("real_preng_condo_area_cd"));

		dm.print();

		ds = (HD_AFFR_1108_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}	
	

	public void hd_affr_1109_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_AFFR_1109_ADataSet ds = null;
		HD_AFFR_1109_ADM dm = new HD_AFFR_1109_ADM();
		
		String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.mode = ((String)hash.get("m")).toUpperCase();
		dm.emp_no = (String)hash.get("emp_no");
		dm.flnm = (String)hash.get("flnm");
		dm.seq = (String)hash.get("seq");
		dm.occr_dt = (String)hash.get("occr_dt");
		dm.preng_canc_yn = (String)hash.get("preng_canc_yn");
		
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers_ipadd =  req.getRemoteAddr();
		dm.ss_emp_no = Util.getSessionParameterValue(req, "emp_no", true);
		
		dm.print();

		ds = (HD_AFFR_1109_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}	
	
	public void hd_affr_1200(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_AFFR_1200_LDataSet ds = null;
		HD_AFFR_1200_LDM dm = new HD_AFFR_1200_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = Util.getSessionParameterValue(req, "emp_no", true);
		dm.fr_dt = Util.checkString(req.getParameter("fr_dt"));
		dm.to_dt = Util.checkString(req.getParameter("to_dt"));
		dm.emp_no_tm = Util.checkString(req.getParameter("emp_no_tm"));
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.print();

		ds = (HD_AFFR_1200_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}	


	public void hd_affr_1104_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_AFFR_1104_LDataSet ds = null;
		HD_AFFR_1104_LDM dm = new HD_AFFR_1104_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.srch_code = Util.checkString(req.getParameter("srch_code"));
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.srch_emp_no = Util.checkString(req.getParameter("srch_emp_no"));
		dm.use_fr_aplc_dt = Util.checkString(req.getParameter("use_fr_aplc_dt"));
		dm.use_to_aplc_dt = Util.checkString(req.getParameter("use_to_aplc_dt"));
		dm.actu_slip_no = Util.checkString(req.getParameter("actu_slip_no"));

		dm.print();

		ds = (HD_AFFR_1104_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_affr_1201(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_AFFR_1201_ADataSet ds = null;
		HD_AFFR_1201_ADM dm = new HD_AFFR_1201_ADM();

		String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);
		
		dm.mode = ((String)hash.get("m")).toUpperCase();
		dm.emp_no = (String)hash.get("emp_no");
		dm.preng_condo_nm_1 = (String)hash.get("preng_condo_nm_1");
		dm.preng_condo_cd_1 = (String)hash.get("preng_condo_cd_1"); 
		dm.preng_condo_area_cd_1 = (String)hash.get("preng_condo_area_cd_1");		
		dm.use_frdt = (String)hash.get("use_frdt"); 
		dm.use_todt = (String)hash.get("use_todt"); 
		dm.use_dds = (String)hash.get("use_dds"); 
		dm.guest_room_cnt = (String)hash.get("guest_room_cnt"); 
		dm.cmpy_sply_use_yn = (String)hash.get("cmpy_sply_use_yn");
		dm.preng_no = (String)hash.get("preng_no");
		dm.use_pay_amt = (String)hash.get("use_pay_amt");
		dm.slf_burd_amt = (String)hash.get("slf_burd_amt");
		dm.cmpy_sply_amt = (String)hash.get("cmpy_sply_amt");
		dm.slf_drbk_amt = (String)hash.get("slf_drbk_amt");
		dm.guest_room_fee_tot_amt = (String)hash.get("guest_room_fee_tot_amt"); 
		dm.remk = (String)hash.get("remk");
		dm.seq = (String)hash.get("seq");
		dm.occr_dt = (String)hash.get("occr_dt");
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
        dm.incmg_pers_ipadd = req.getRemoteAddr();
        dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.print();
		
		ds = (HD_AFFR_1201_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	

	public void hd_affr_1202(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_AFFR_1202_LDataSet ds = null;
		HD_AFFR_1202_LDM dm = new HD_AFFR_1202_LDM();
		//dm.cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.flnm = Util.checkString(req.getParameter("flnm"));
		dm.print();

		ds = (HD_AFFR_1202_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}	
	
	public void hd_affr_1203_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_AFFR_1203_LDataSet ds = null;
		HD_AFFR_1203_LDM dm = new HD_AFFR_1203_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = "";

		dm.print();

		ds = (HD_AFFR_1203_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_affr_1204_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		
		HD_AFFR_1204_MDataSet ds = null;
		HD_AFFR_1204_MDM dm = new HD_AFFR_1204_MDM();
		
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		
		dm.print();
		
		ds = (HD_AFFR_1204_MDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
			System.out.println("DAO..error.");
			throw new AppException(ds.errcode, ds.errmsg);
		}
		
		req.setAttribute("ds", ds);
	}	

	public void hd_affr_1300(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_AFFR_1300_LDataSet ds = null;
		HD_AFFR_1300_LDM dm = new HD_AFFR_1300_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.print();

		ds = (HD_AFFR_1300_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_affr_1301(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_AFFR_1301_LDataSet ds = null;
		HD_AFFR_1301_LDM dm = new HD_AFFR_1301_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.flnm = Util.checkString(req.getParameter("flnm"));

		dm.print();

		ds = (HD_AFFR_1301_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}	


	public void hd_affr_1302(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_AFFR_1302_LDataSet ds = null;
		HD_AFFR_1302_LDM dm = new HD_AFFR_1302_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.child_flnm = Util.checkString(req.getParameter("child_flnm"));

		dm.print();

		ds = (HD_AFFR_1302_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}

	public void hd_affr_1303(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_AFFR_1303_ADataSet ds = null;
		HD_AFFR_1303_ADM dm = new HD_AFFR_1303_ADM();
		String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
		System.out.println("multiUpdateData=" + multiUpdateData );
		String[] converted = convertMultiUpdateData(multiUpdateData);
		
		String cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		String ss_emp_no = Util.getSessionParameterValue(req, "emp_no", true);
		String incmg_pers_ipadd  = req.getRemoteAddr();	
		String mode 				  =	converted[0];
		dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
		dm.setSs_emp_no(ss_emp_no);
		dm.setCmpy_cd(cmpy_cd);
		dm.setMode(mode.toUpperCase());	
		
		
		String seq      			 =    converted[17]; 
		String occr_dt      		 =    converted[18];
		String emp_no     			 =    converted[3];
		String flnm 				 =    converted[4];
		String reg_dt 				 =    converted[7];
		String faml_seq 			 =    converted[16];
		String child_flnm 			 =    converted[8];
		String faml_rshp_cd 		 =    converted[15];
		String obcl_grad 			 =    converted[11];
		
		dm.setSeq(seq);
		dm.setOccr_dt(occr_dt);
		dm.setEmp_no(emp_no);
		dm.setFlnm(flnm);
		dm.setReg_dt(reg_dt);
		dm.setFaml_seq(faml_seq); 
		dm.setChild_flnm(child_flnm); 
		dm.setFaml_rshp_cd(faml_rshp_cd); 
		dm.setObcl_grad(obcl_grad); 
		dm.print();

		ds = (HD_AFFR_1303_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}	


	public void hd_affr_1410(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_AFFR_1410_LDataSet ds = null;
		HD_AFFR_1410_LDM dm = new HD_AFFR_1410_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.fr_occr_dt = Util.checkString(req.getParameter("fr_occr_dt"));
		dm.to_occr_dt = Util.checkString(req.getParameter("to_occr_dt"));
		dm.pay_plac_clsf = Util.checkString(req.getParameter("pay_plac_clsf"));
		dm.actu_slip_no = Util.checkString(req.getParameter("actu_slip_no"));
		dm.print();

		ds = (HD_AFFR_1410_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}	
	

	public void hd_affr_1411(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_AFFR_1411_LDataSet ds = null;
		HD_AFFR_1411_LDM dm = new HD_AFFR_1411_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.flnm = Util.checkString(req.getParameter("flnm"));

		dm.print();

		ds = (HD_AFFR_1411_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}

	public void hd_affr_1412(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_AFFR_1412_LDataSet ds = null;
		HD_AFFR_1412_LDM dm = new HD_AFFR_1412_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.faml_flnm = Util.checkString(req.getParameter("faml_flnm"));

		dm.print();

		ds = (HD_AFFR_1412_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}	
	

	public void hd_affr_1413(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_AFFR_1413_ADataSet ds = null;
		HD_AFFR_1413_ADM dm = new HD_AFFR_1413_ADM();
		String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
		System.out.println("multiUpdateData=" + multiUpdateData );
		//String[] converted = convertMultiUpdateData(multiUpdateData);
		Hashtable hash1 = getHashMultiUpdateData(multiUpdateData);

		String cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		String ss_emp_no = Util.getSessionParameterValue(req, "emp_no", true);
		String incmg_pers_ipadd  = req.getRemoteAddr();	
		String mode 				  = ((String)hash1.get("m")).toUpperCase(); 
		dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
		dm.setSs_emp_no(ss_emp_no); 
		dm.setCmpy_cd(cmpy_cd);
		dm.setMode(mode.toUpperCase());	
		
		String seq      			 = ((String)hash1.get("seq")); 
		String occr_dt      		 = ((String)hash1.get("occr_dt")); 
		String emp_no     			 = ((String)hash1.get("emp_no")); 
		String flnm 				 = ((String)hash1.get("flnm")); 
		String dept_cd               = ((String)hash1.get("dept_cd")); 
		String dty_cd                = ((String)hash1.get("dty_cd")); 
		String posi_cd               = ((String)hash1.get("posi_cd")); 
		String faml_seq 			= ((String)hash1.get("faml_seq")); 
		String child_flnm 			= ((String)hash1.get("child_flnm")); 
		String faml_rshp_cd 		= ((String)hash1.get("faml_rshp_cd")); 
		String treat_edu_frdt 		= ((String)hash1.get("treat_edu_frdt")); 
		String treat_edu_todt 		= ((String)hash1.get("treat_edu_todt")); 
		String treat_edu_cont 		= ((String)hash1.get("treat_edu_cont")); 
		String treat_edu_instt 		= ((String)hash1.get("treat_edu_instt")); 
		String treat_edu_instt_tel_no = ((String)hash1.get("treat_edu_instt_tel_no")); 
		String clam_amt 			= ((String)hash1.get("clam_amt")); 
		String cmpy_sply_amt 		= ((String)hash1.get("cmpy_sply_amt")); 
		String slip_proc_mang_dt 	= ((String)hash1.get("slip_proc_mang_dt")); 
		String slip_proc_mang_seq 	= ((String)hash1.get("slip_proc_mang_seq")); 
		String pay_plac_clsf 		= ((String)hash1.get("pay_plac_clsf")); 


		dm.setSeq(seq);
		dm.setOccr_dt(occr_dt);
		dm.setEmp_no(emp_no);
		dm.setFlnm(flnm);
		dm.setDept_cd(dept_cd);
		dm.setDty_cd(dty_cd);
		dm.setPosi_cd(posi_cd);
		dm.setFaml_seq(faml_seq);
		dm.setFaml_rshp_cd(faml_rshp_cd);
		dm.setChild_flnm(child_flnm);
		dm.setTreat_edu_cont(treat_edu_cont);
		dm.setTreat_edu_frdt(treat_edu_frdt);
		dm.setTreat_edu_instt(treat_edu_instt);
		dm.setTreat_edu_instt_tel_no(treat_edu_instt_tel_no);
		dm.setTreat_edu_todt(treat_edu_todt);
		dm.setClam_amt(clam_amt);
		dm.setCmpy_sply_amt(cmpy_sply_amt);
		dm.setSlip_proc_mang_dt(slip_proc_mang_dt);
		dm.setSlip_proc_mang_seq(slip_proc_mang_seq);
		dm.setPay_plac_clsf(pay_plac_clsf);

		dm.print();

		ds = (HD_AFFR_1413_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}	

	public void hd_affr_1414(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_AFFR_1414_LDataSet ds = null;
		HD_AFFR_1414_LDM dm = new HD_AFFR_1414_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.treat_edu_todt = Util.checkString(req.getParameter("treat_edu_todt"));

		dm.print();

		ds = (HD_AFFR_1414_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}	
	

	public void hd_affr_1415_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_AFFR_1415_LDataSet ds = null;
		HD_AFFR_1415_LDM dm = new HD_AFFR_1415_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.fr_occr_dt = Util.checkString(req.getParameter("fr_occr_dt"));
		dm.to_occr_dt = Util.checkString(req.getParameter("to_occr_dt"));
		dm.pay_plac_clsf = Util.checkString(req.getParameter("pay_plac_clsf"));
		dm.actu_slip_no = Util.checkString(req.getParameter("actu_slip_no"));

		dm.print();

		ds = (HD_AFFR_1415_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}	
	

	public void hd_affr_1416_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_AFFR_1416_ADataSet ds = null;
		HD_AFFR_1416_ADM dm = new HD_AFFR_1416_ADM();
		
		String multiUpdateData1 = Util.checkString(req.getParameter("multiUpData1"));
		Hashtable hash1 = getHashMultiUpdateData(multiUpdateData1);
		System.out.println("multiUpdateData1 == " + multiUpdateData1);
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers_ipadd =  req.getRemoteAddr();
		dm.ss_emp_no = Util.getSessionParameterValue(req, "emp_no", true);
		
		dm.s_mode = ((String)hash1.get("m")).toUpperCase();
		
		dm.tmp_dr_amt = ((String)hash1.get("tmp_dr_amt"));
		dm.flnm = ((String)hash1.get("flnm"));
		dm.dept_cd = ((String)hash1.get("dept_cd"));
		dm.emp_no = ((String)hash1.get("emp_no"));
		dm.cmpy_welf_fund_clsf = ((String)hash1.get("cmpy_welf_fund_clsf"));
		dm.slip_proc_mang_dt = ((String)hash1.get("slip_proc_mang_dt"));
		dm.slip_proc_mang_seq = ((String)hash1.get("slip_proc_mang_seq"));
		
		dm.occr_dt = ((String)hash1.get("occr_dt"));
		dm.seq = ((String)hash1.get("seq"));
		
		dm.tmp_crdt_amt = Util.checkString(req.getParameter("tmp_crdt_amt"));
		dm.titl = Util.checkString(req.getParameter("titl"));

		
		dm.print();

		ds = (HD_AFFR_1416_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}	
	

	public void hd_affr_1417_d(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_AFFR_1417_DDataSet ds = null;
		HD_AFFR_1417_DDM dm = new HD_AFFR_1417_DDM();
		String multiUpdateData1 = Util.checkString(req.getParameter("multiUpData1"));
		Hashtable hash1 = getHashMultiUpdateData(multiUpdateData1);
		System.out.println("multiUpdateData1 == " + multiUpdateData1);
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.mode = ((String)hash1.get("m")).toUpperCase();
		dm.slip_proc_mang_dt = ((String)hash1.get("slip_proc_mang_dt"));
		dm.slip_proc_mang_seq = ((String)hash1.get("slip_proc_mang_seq"));
		dm.cmpy_welf_fund_clsf = ((String)hash1.get("cmpy_welf_fund_clsf"));
		dm.slip_occr_dt = Util.checkString(req.getParameter("slip_occr_dt"));
		dm.slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
		dm.slip_seq = Util.checkString(req.getParameter("slip_seq"));
		dm.slip_incmg_pers = Util.checkString(req.getParameter("slip_incmg_pers"));
		dm.slip_incmg_pers_ipadd = Util.checkString(req.getParameter("slip_incmg_pers_ipadd"));
		
		dm.incmg_pers_ipadd =  req.getRemoteAddr();
		dm.ss_emp_no = Util.getSessionParameterValue(req, "emp_no", true);

		dm.print();		

		ds = (HD_AFFR_1417_DDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}	
	
	public void hd_affr_1418_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		
		HD_AFFR_1418_MDataSet ds = null;
		HD_AFFR_1418_MDM dm = new HD_AFFR_1418_MDM();
		
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		
		dm.print();
		
		ds = (HD_AFFR_1418_MDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
			System.out.println("DAO..error.");
			throw new AppException(ds.errcode, ds.errmsg);
		}
		
		req.setAttribute("ds", ds);
	}	
	
	public void hd_affr_1420(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_AFFR_1420_LDataSet ds = null;
		HD_AFFR_1420_LDM dm = new HD_AFFR_1420_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.fr_slip_proc_mang_dt = Util.checkString(req.getParameter("fr_slip_proc_mang_dt"));
		dm.to_slip_proc_mang_dt = Util.checkString(req.getParameter("to_slip_proc_mang_dt"));

		dm.print();

		ds = (HD_AFFR_1420_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}	
	
	public void hd_affr_1500(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_AFFR_1500_LDataSet ds = null;
		HD_AFFR_1500_LDM dm = new HD_AFFR_1500_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);

		ds = (HD_AFFR_1500_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}	

	public void hd_affr_1501(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_AFFR_1501_ADataSet ds = null;
		HD_AFFR_1501_ADM dm = new HD_AFFR_1501_ADM();
		String multiUpdateData1 = Util.checkString(req.getParameter("multiUpData1"));
		String multiUpdateData2 = Util.checkString(req.getParameter("multiUpData2"));
		System.out.println("multiUpdateData1= " + multiUpdateData1+"\n" );
		System.out.println("multiUpdateData2= " + multiUpdateData2 );
		String[] converted1 = convertMultiUpdateData(multiUpdateData1);		
		String[] converted2 = convertMultiUpdateData(multiUpdateData2);		
		String cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		String ss_emp_no   =		Util.getSessionParameterValue(req, "emp_no", true);
		String incmg_pers_ipadd  = req.getRemoteAddr();
		
		System.out.println("cmpy_cd= " + cmpy_cd );
		System.out.println("ss_emp_no= " + ss_emp_no );
		System.out.println("incmg_pers_ipadd= " + incmg_pers_ipadd );
		
		String mode   =		converted1[0];  
		String occr_dt = converted1[9];  
		String scl_exps_clsf = converted1[2];  
		String frdt = converted1[3];  
		String todt = converted1[4];  
		String fix_rate_clsf = converted1[5];  
		String pay_ratio_emp = converted1[6];  
		String pay_ratio_ofcr = converted1[7];  
		String pay_amt = converted1[8];  
		String seq = converted1[10];		   
		
		String mode_qq =		converted2[0];  
		String scl_exps_clsf_qq = converted2[2];  
		String qq = converted2[3];  
		String bgn_mmdd = converted2[4];  
		String end_mmdd = converted2[5];  
		String occr_dt_qq = converted2[6];  
		String seq_qq = converted2[7];
		
		dm.setCmpy_cd(cmpy_cd);
		dm.setMode(mode.toUpperCase());
		dm.setOccr_dt(occr_dt);
		dm.setScl_exps_clsf(scl_exps_clsf);
		dm.setFrdt(frdt);
		dm.setTodt(todt);
		dm.setFix_rate_clsf(fix_rate_clsf);
		dm.setPay_ratio_emp(pay_ratio_emp);
		dm.setPay_ratio_ofcr(pay_ratio_ofcr);
		dm.setPay_amt(pay_amt);
		dm.setSeq(seq);
		
		dm.setMode_qq(mode_qq.toUpperCase());
		dm.setScl_exps_clsf_qq(scl_exps_clsf_qq);
		dm.setQq(qq);
		dm.setBgn_mmdd(bgn_mmdd.replaceAll("-", ""));
		dm.setEnd_mmdd(end_mmdd.replaceAll("-", ""));
		dm.setOccr_dt_qq(occr_dt_qq);
		dm.setSeq_qq(seq_qq);
		dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
		dm.setSs_emp_no(ss_emp_no);
		dm.print();

		ds = (HD_AFFR_1501_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}


	public void hd_affr_1502(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_AFFR_1502_LDataSet ds = null;
		HD_AFFR_1502_LDM dm = new HD_AFFR_1502_LDM();

		dm.cmpy_cd  = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = Util.getSessionParameterValue(req, "emp_no", true);

		ds = (HD_AFFR_1502_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}	
	
	public void hd_affr_1600(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_AFFR_1600_LDataSet ds = null;
		HD_AFFR_1600_LDM dm = new HD_AFFR_1600_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
	
	//	if(dm.emp_no.equals("")){
	//		dm.emp_no = Util.getSessionParameterValue(req, "emp_no", true);
	//	}

		dm.flnm = Util.checkString(req.getParameter("flnm"));

		ds = (HD_AFFR_1600_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}


	public void hd_affr_1601(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_AFFR_1601_LDataSet ds = null;
		HD_AFFR_1601_LDM dm = new HD_AFFR_1601_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));

		ds = (HD_AFFR_1601_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}	


	public void hd_affr_1602(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_AFFR_1602_ADataSet ds = null;
		HD_AFFR_1602_ADM dm = new HD_AFFR_1602_ADM();
		String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
		System.out.println("multiUpdateData=" + multiUpdateData );
		String[] converted = convertMultiUpdateData(multiUpdateData);		
		String cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		String ss_emp_no = Util.getSessionParameterValue(req, "emp_no", true);
		String incmg_pers_ipadd  = req.getRemoteAddr();

		String  mode                          = converted[0];
		String  scl_exps_pay_yy               = converted[2];
		String  scl_exps_pay_qq               = converted[3];
		String  scl_exps_clsf                 = converted[28];
		String  obj_pers_flnm                 = converted[5];
		String  obj_pers_prn                  = converted[6];
		String  scl_nm                        = converted[7];
		String  grade                         = converted[8];
		String  scl_part                      = converted[9];
		String  aplc_amt                      = converted[10];
		String  remk                          = converted[11];
		String  vdty_amt                      = converted[12];
		String  pay_amt                       = converted[13];
		String  seq                           = converted[14];
		String  occr_dt                       = converted[16];
		String  flnm                          = converted[17];
		String  emp_no                        = converted[18];
		String  dept_cd                       = converted[19];
		String  dty_cd                        = converted[20];
		String  posi_cd                       = converted[21];
		String  slip_proc_mang_dt             = converted[22];
		String  slip_proc_mang_seq            = converted[23];
		String  aplc_dt                       = converted[24];
		String  aplc_seq                      = converted[25];
		String  scl_exps_pay_plac_clsf        = converted[26];
		String  emp_clsf      				  = converted[27];
		
		
		dm.setMode(mode.toUpperCase());
		dm.setCmpy_cd(cmpy_cd);
		dm.setScl_exps_pay_yy(scl_exps_pay_yy);
		dm.setScl_exps_pay_qq(scl_exps_pay_qq);
		dm.setScl_exps_clsf(scl_exps_clsf);
		dm.setObj_pers_flnm(obj_pers_flnm);
		dm.setObj_pers_prn(obj_pers_prn);
		dm.setScl_nm(scl_nm);
		dm.setGrade(grade);
		dm.setScl_part(scl_part);
		dm.setAplc_amt(aplc_amt);
		dm.setRemk(remk);
		dm.setVdty_amt(vdty_amt);
		dm.setPay_amt(pay_amt);
		dm.setSeq(seq);
		dm.setOccr_dt(occr_dt);
		dm.setFlnm(flnm);
		dm.setEmp_no(emp_no);
		dm.setDept_cd(dept_cd);
		dm.setDty_cd(dty_cd);
		dm.setPosi_cd(posi_cd);
		dm.setSlip_proc_mang_dt(slip_proc_mang_dt);
		dm.setSlip_proc_mang_seq(slip_proc_mang_seq);
		dm.setAplc_dt(aplc_dt);
		dm.setAplc_seq(aplc_seq);
		dm.setScl_exps_pay_plac_clsf(scl_exps_pay_plac_clsf);
		dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
		dm.setSs_emp_no(ss_emp_no);
		dm.setEmp_clsf(emp_clsf);
		dm.print();
		
		ds = (HD_AFFR_1602_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}	
	
	public void hd_affr_1610_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		
		HD_AFFR_1610_MDataSet ds = null;
		HD_AFFR_1610_MDM dm = new HD_AFFR_1610_MDM();
		
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		//dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.incmg_pers = Util.checkString(req.getParameter("emp_no"));
		
		dm.print();
		
		ds = (HD_AFFR_1610_MDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
			System.out.println("DAO..error.");
			throw new AppException(ds.errcode, ds.errmsg);
		}
		
		req.setAttribute("ds", ds);
	}	

	public void hd_affr_1611(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_AFFR_1611_LDataSet ds = null;
		HD_AFFR_1611_LDM dm = new HD_AFFR_1611_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.ss_emp_no = Util.getSessionParameterValue(req, "emp_no", true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		
		ds = (HD_AFFR_1611_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}	
	

	public void hd_affr_1612(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_AFFR_1612_LDataSet ds = null;
		HD_AFFR_1612_LDM dm = new HD_AFFR_1612_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.obj_pers_flnm = Util.checkString(req.getParameter("obj_pers_flnm"));
		dm.print();

		ds = (HD_AFFR_1612_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}	
	
	public void hd_affr_1613(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_AFFR_1613_ADataSet ds = null;
		HD_AFFR_1613_ADM dm = new HD_AFFR_1613_ADM();

		String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);
		
	//	System.out.println("multiUpdateData1 == " + multiUpdateData);
		
		dm.mode =  ((String)hash.get("m")).toUpperCase();
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = (String)hash.get("emp_no");
		dm.occr_dt = (String)hash.get("occr_dt");
		dm.seq = (String)hash.get("seq");
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.incmg_pers_ipaddr = req.getRemoteAddr();

		dm.print();
		
		ds = (HD_AFFR_1613_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	
	public void hd_affr_1614(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_AFFR_1614_MDataSet ds = null;
		HD_AFFR_1614_MDM dm = new HD_AFFR_1614_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		//dm.emp_no = Util.getSessionParameterValue(req, "emp_no", true);
		dm.scl_exps_clsf = Util.checkString(req.getParameter("scl_exps_clsf"));
		
		ds = (HD_AFFR_1614_MDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}	

	public void hd_affr_1700(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_AFFR_1700_LDataSet ds = null;
		HD_AFFR_1700_LDM dm = new HD_AFFR_1700_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		String emp = Util.checkString(req.getParameter("emp_no"));
		if(emp.equals("")){
			dm.emp_no = Util.getSessionParameterValue(req, "emp_no", true);	
		}else{
			dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		}
		dm.print();

		ds = (HD_AFFR_1700_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}	
	

	public void hd_affr_1701(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_AFFR_1701_LDataSet ds = null;
		HD_AFFR_1701_LDM dm = new HD_AFFR_1701_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);		
		String srch_emp_no =Util.checkString(req.getParameter("srch_emp_no"));
		if(srch_emp_no.equals("")){
			dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		}else{
			dm.emp_no = Util.checkString(req.getParameter("srch_emp_no"));
		}
		dm.print();	
		
		ds = (HD_AFFR_1701_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	

	public void hd_affr_1703(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_AFFR_1703_LDataSet ds = null;
		HD_AFFR_1703_LDM dm = new HD_AFFR_1703_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.srch_flnm = Util.checkString(req.getParameter("srch_flnm"));
		dm.srch_emp_no = Util.checkString(req.getParameter("srch_emp_no"));
		dm.srch_use_fr_aplc_dt = Util.checkString(req.getParameter("srch_use_fr_aplc_dt"));
		dm.srch_use_to_aplc_dt = Util.checkString(req.getParameter("srch_use_to_aplc_dt"));
		dm.srch_scl_exps_pay_yy = Util.checkString(req.getParameter("srch_scl_exps_pay_yy"));
		dm.srch_scl_exps_pay_qq = Util.checkString(req.getParameter("srch_scl_exps_pay_qq"));
		dm.srch_scl_exps_clsf = Util.checkString(req.getParameter("srch_scl_exps_clsf"));
		dm.srch_scl_exps_pay_plac_clsf = Util.checkString(req.getParameter("srch_scl_exps_pay_plac_clsf"));
		dm.srch_proc_stat = Util.checkString(req.getParameter("srch_proc_stat"));		
		dm.actu_slip_no = Util.checkString(req.getParameter("actu_slip_no"));
		dm.ss_emp_no = Util.getSessionParameterValue(req, "emp_no", true);
		dm.print();
		
		ds = (HD_AFFR_1703_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}	
	
	public void hd_affr_1720_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_AFFR_1720_ADataSet ds = null;
		HD_AFFR_1720_ADM dm = new HD_AFFR_1720_ADM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.scl_exps_clsf = Util.checkString(req.getParameter("scl_exps_clsf"));
		dm.scl_yy_pre = Util.checkString(req.getParameter("scl_yy_pre"));
		dm.scl_qq_pre = Util.checkString(req.getParameter("scl_qq_pre"));
		dm.scl_yy_now = Util.checkString(req.getParameter("scl_yy_now"));
		dm.scl_qq_now = Util.checkString(req.getParameter("scl_qq_now"));
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.incmg_pers_ipadd = req.getRemoteAddr();

		dm.print();
		
		ds = (HD_AFFR_1720_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	

	public void hd_affr_1721(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
        System.out.println("sssss");
		HD_AFFR_1721_LDataSet ds = null;
		HD_AFFR_1721_LDM dm = new HD_AFFR_1721_LDM();

        System.out.println("2222");
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.srch_flnm = Util.checkString(req.getParameter("srch_flnm"));
		dm.srch_emp_no = Util.checkString(req.getParameter("srch_emp_no"));
		dm.srch_scl_exps_pay_yy_ft = Util.checkString(req.getParameter("srch_scl_exps_pay_yy_ft"));
		dm.srch_scl_exps_pay_qq_ft = Util.checkString(req.getParameter("srch_scl_exps_pay_qq_ft"));
		dm.srch_scl_exps_pay_yy_to = Util.checkString(req.getParameter("srch_scl_exps_pay_yy_to"));
		dm.srch_scl_exps_pay_qq_to = Util.checkString(req.getParameter("srch_scl_exps_pay_qq_to"));
		dm.srch_scl_exps_clsf = Util.checkString(req.getParameter("srch_scl_exps_clsf"));
	//	dm.ss_emp_no = Util.getSessionParameterValue(req, "emp_no", true);

		ds = (HD_AFFR_1721_LDataSet)manager.executeCall(dm);
		
		  System.out.println("3333"); 
		  
		  
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_affr_1710_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		
		HD_AFFR_1710_MDataSet ds = null;
		HD_AFFR_1710_MDM dm = new HD_AFFR_1710_MDM();
		
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		
		dm.print();
		
		ds = (HD_AFFR_1710_MDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
			System.out.println("DAO..error.");
			throw new AppException(ds.errcode, ds.errmsg);
		}
		
		req.setAttribute("ds", ds);
	}	
	
	public void hd_affr_1712_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_AFFR_1712_LDataSet ds = null;
		HD_AFFR_1712_LDM dm = new HD_AFFR_1712_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));

		dm.print();

		ds = (HD_AFFR_1712_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}


	public void hd_affr_1714(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_AFFR_1714_ADataSet ds = null;
		HD_AFFR_1714_ADM dm = new HD_AFFR_1714_ADM();

		String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
		System.out.println("multiUpdateData=" + multiUpdateData );
		String[] converted = convertMultiUpdateData(multiUpdateData);		
		String cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		String ss_emp_no = Util.getSessionParameterValue(req, "emp_no", true);
		String incmg_pers_ipadd  = req.getRemoteAddr();		
		
		String  mode                          = converted[0];
		String  emp_no                        = converted[4];
		String  flnm                          = converted[5];
		String  scl_exps_pay_yy               = converted[8];
		String  scl_exps_pay_qq               = converted[9];
		String  obj_pers_flnm                 = converted[11];
		String  obj_pers_prn                  = converted[12];
		String  scl_nm                        = converted[13];
		String  grade                         = converted[14];
		String  scl_part                      = converted[15];
		String  aplc_amt                      = converted[16];
		String  vdty_amt                      = converted[17];
		String  pay_amt                       = converted[18].replaceAll(",","");
		String  remk                          = converted[19];
		String  seq                           = converted[23];
		String  occr_dt                       = converted[24];
		String  dept_cd                 	  = converted[25];
		String  dty_cd                		  = converted[26];
		String  posi_cd                       = converted[27];
		
		String  slip_proc_mang_dt             = converted[28];
		String  slip_proc_mang_seq            = converted[29];
		String  scl_exps_pay_plac_clsf        = converted[30];
		String  scl_exps_clsf                 = converted[31];
		
		dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
		dm.setSs_emp_no(ss_emp_no);
		dm.setCmpy_cd(cmpy_cd);
		dm.setMode(mode.toUpperCase());
		dm.setEmp_no(emp_no);                  
		dm.setFlnm(flnm);                    
		dm.setScl_exps_pay_yy(scl_exps_pay_yy);         
		dm.setScl_exps_pay_qq(scl_exps_pay_qq);         
		dm.setObj_pers_flnm(obj_pers_flnm);           
		dm.setObj_pers_prn(obj_pers_prn);            
		dm.setScl_nm(scl_nm);                  
		dm.setGrade(grade);                   
		dm.setScl_part(scl_part);                
		dm.setAplc_amt(aplc_amt);                
		dm.setVdty_amt(vdty_amt);                
		dm.setPay_amt(pay_amt);                 
		dm.setRemk(remk);                    
		//dm.setProc_stat(proc_stat);               
		dm.setSeq(seq);                     
		dm.setOccr_dt(occr_dt);                 
		dm.setDept_cd(dept_cd);                 
		dm.setDty_cd(dty_cd);                	
		dm.setPosi_cd(posi_cd);                 
		dm.setSlip_proc_mang_dt(slip_proc_mang_dt);       
		dm.setSlip_proc_mang_seq(slip_proc_mang_seq);      
		dm.setScl_exps_pay_plac_clsf(scl_exps_pay_plac_clsf);  
		dm.setScl_exps_clsf(scl_exps_clsf);           

		dm.print();	

		ds = (HD_AFFR_1714_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}	
	
	
	public void hd_affr_1714_500(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_AFFR_1714_ADataSet ds = null;
		HD_AFFR_1714_ADM dm = new HD_AFFR_1714_ADM();

		String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
		System.out.println("multiUpdateData=" + multiUpdateData );
		String[] converted = convertMultiUpdateData(multiUpdateData);		
		String cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		String ss_emp_no = Util.getSessionParameterValue(req, "emp_no", true);
		String incmg_pers_ipadd  = req.getRemoteAddr();		
		
		String  mode                          = converted[0];
		String  emp_no                        = converted[4];
		String  flnm                          = converted[5];
		String  scl_exps_pay_yy               = converted[11];  
		String  scl_exps_pay_qq               = converted[12];
		String  obj_pers_flnm                 = converted[14];
		String  obj_pers_prn                  = converted[15];
		String  scl_nm                        = converted[16];
		String  grade                         = converted[17];
		String  scl_part                      = converted[18];
		String  aplc_amt                      = converted[8];
		String  vdty_amt                      = converted[9];
		String  pay_amt                       = converted[10].replaceAll(",","");
		String  remk                          = converted[19];
		String  seq                           = converted[23];
		String  occr_dt                       = converted[24];
		String  dept_cd                 	  = converted[25];
		String  dty_cd                		  = converted[26];
		String  posi_cd                       = converted[27];
		
		String  slip_proc_mang_dt             = converted[28];
		String  slip_proc_mang_seq            = converted[29];
		String  scl_exps_pay_plac_clsf        = converted[30];
		String  scl_exps_clsf                 = converted[31];
		
		dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
		dm.setSs_emp_no(ss_emp_no);
		dm.setCmpy_cd(cmpy_cd);
		dm.setMode(mode.toUpperCase());
		dm.setEmp_no(emp_no);                  
		dm.setFlnm(flnm);                    
		dm.setScl_exps_pay_yy(scl_exps_pay_yy);         
		dm.setScl_exps_pay_qq(scl_exps_pay_qq);         
		dm.setObj_pers_flnm(obj_pers_flnm);           
		dm.setObj_pers_prn(obj_pers_prn);            
		dm.setScl_nm(scl_nm);                  
		dm.setGrade(grade);                   
		dm.setScl_part(scl_part);                
		dm.setAplc_amt(aplc_amt);                
		dm.setVdty_amt(vdty_amt);                
		dm.setPay_amt(pay_amt);                 
		dm.setRemk(remk);                    
		//dm.setProc_stat(proc_stat);               
		dm.setSeq(seq);                     
		dm.setOccr_dt(occr_dt);                 
		dm.setDept_cd(dept_cd);                 
		dm.setDty_cd(dty_cd);                	
		dm.setPosi_cd(posi_cd);                 
		dm.setSlip_proc_mang_dt(slip_proc_mang_dt);       
		dm.setSlip_proc_mang_seq(slip_proc_mang_seq);      
		dm.setScl_exps_pay_plac_clsf(scl_exps_pay_plac_clsf);  
		dm.setScl_exps_clsf(scl_exps_clsf);           

		dm.print();	

		ds = (HD_AFFR_1714_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}	
	
	

	public void hd_affr_1715_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_AFFR_1715_LDataSet ds = null;
		HD_AFFR_1715_LDM dm = new HD_AFFR_1715_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.srch_flnm = Util.checkString(req.getParameter("srch_flnm"));
		dm.srch_emp_no = Util.checkString(req.getParameter("srch_emp_no"));
		dm.srch_use_fr_aplc_dt = Util.checkString(req.getParameter("srch_use_fr_aplc_dt"));
		dm.srch_use_to_aplc_dt = Util.checkString(req.getParameter("srch_use_to_aplc_dt"));
		dm.srch_scl_exps_pay_yy = Util.checkString(req.getParameter("srch_scl_exps_pay_yy"));
		dm.srch_scl_exps_pay_qq = Util.checkString(req.getParameter("srch_scl_exps_pay_qq"));
		dm.srch_scl_exps_clsf = Util.checkString(req.getParameter("srch_scl_exps_clsf"));
		dm.srch_scl_exps_pay_plac_clsf = Util.checkString(req.getParameter("srch_scl_exps_pay_plac_clsf"));
		dm.srch_proc_stat = Util.checkString(req.getParameter("srch_proc_stat"));
		dm.actu_slip_no = Util.checkString(req.getParameter("actu_slip_no"));

		dm.print();

		ds = (HD_AFFR_1715_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}

	public void hd_affr_1716_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_AFFR_1716_ADataSet ds = null;
		HD_AFFR_1716_ADM dm = new HD_AFFR_1716_ADM();
		String multiUpdateData1 = Util.checkString(req.getParameter("multiUpData1"));
		Hashtable hash1 = getHashMultiUpdateData(multiUpdateData1);
		System.out.println("multiUpdateData1 == " + multiUpdateData1);
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers_ipadd =  req.getRemoteAddr();
		dm.ss_emp_no = Util.getSessionParameterValue(req, "emp_no", true);
		
		dm.s_mode = ((String)hash1.get("m")).toUpperCase();
		
		dm.tmp_dr_amt = ((String)hash1.get("tmp_dr_amt"));
		dm.flnm = ((String)hash1.get("flnm"));
		dm.dept_cd = ((String)hash1.get("dept_cd"));
		dm.emp_no = ((String)hash1.get("emp_no"));
		dm.cmpy_welf_fund_clsf = ((String)hash1.get("cmpy_welf_fund_clsf"));
		dm.slip_proc_mang_dt = ((String)hash1.get("slip_proc_mang_dt"));
		dm.slip_proc_mang_seq = ((String)hash1.get("slip_proc_mang_seq"));

		dm.occr_dt = ((String)hash1.get("occr_dt"));
		dm.seq = ((String)hash1.get("seq"));
		
		dm.tmp_crdt_amt = Util.checkString(req.getParameter("tmp_crdt_amt"));
		dm.titl = Util.checkString(req.getParameter("titl"));
		
		dm.print();

		ds = (HD_AFFR_1716_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}	
	

	public void hd_affr_1717_d(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_AFFR_1717_DDataSet ds = null;
		HD_AFFR_1717_DDM dm = new HD_AFFR_1717_DDM();
		String multiUpdateData1 = Util.checkString(req.getParameter("multiUpData1"));
		Hashtable hash1 = getHashMultiUpdateData(multiUpdateData1);
		System.out.println("multiUpdateData1 == " + multiUpdateData1);
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.mode = ((String)hash1.get("m")).toUpperCase();
		dm.slip_proc_mang_dt = ((String)hash1.get("slip_proc_mang_dt"));
		dm.slip_proc_mang_seq = ((String)hash1.get("slip_proc_mang_seq"));
		dm.cmpy_welf_fund_clsf = ((String)hash1.get("cmpy_welf_fund_clsf"));
		dm.slip_occr_dt = Util.checkString(req.getParameter("slip_occr_dt"));
		dm.slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
		dm.slip_seq = Util.checkString(req.getParameter("slip_seq"));
		dm.slip_incmg_pers = Util.checkString(req.getParameter("slip_incmg_pers"));
		dm.slip_incmg_pers_ipadd = Util.checkString(req.getParameter("slip_incmg_pers_ipadd"));
		
		dm.incmg_pers_ipadd =  req.getRemoteAddr();
		dm.ss_emp_no = Util.getSessionParameterValue(req, "emp_no", true);

		dm.print();		

		ds = (HD_AFFR_1717_DDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}	

	public void hd_affr_1800(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_AFFR_1800_LDataSet ds = null;
		HD_AFFR_1800_LDM dm = new HD_AFFR_1800_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.sply_strt_yymm_ft = Util.checkString(req.getParameter("sply_strt_yymm_ft"));
		dm.sply_strt_yymm_to = Util.checkString(req.getParameter("sply_strt_yymm_to"));

		ds = (HD_AFFR_1800_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	

	public void hd_affr_1810(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_AFFR_1810_LDataSet ds = null;
		HD_AFFR_1810_LDM dm = new HD_AFFR_1810_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.flnm = Util.checkString(req.getParameter("flnm"));

		ds = (HD_AFFR_1810_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}	

	public void hd_affr_1820(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_AFFR_1820_ADataSet ds = null;
		HD_AFFR_1820_ADM dm = new HD_AFFR_1820_ADM();
		String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
		System.out.println("multiUpdateData=" + multiUpdateData );
		String[] converted = convertMultiUpdateData(multiUpdateData);		
		String cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		String ss_emp_no = Util.getSessionParameterValue(req, "emp_no", true);
		String incmg_pers_ipadd  = req.getRemoteAddr();			
		System.out.println("테스트 입니다."); 
		
		String mode                       = converted[0];
		String emp_no            		  = converted[3];
		String flnm                       = converted[4];
		String child_flnm                 = converted[7];
		String child_seqo                 = converted[8];
		String child_bidt                 = converted[9];
		String sply_amt                   = converted[10];
		String sply_strt_yymm             = converted[11];
		String prn                        = converted[12];
		String sply_susp_yn               = converted[13];
		String seq                        = converted[17];
		String occr_dt                    = converted[18];
	

		dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
		dm.setSs_emp_no(ss_emp_no);
		dm.setCmpy_cd(cmpy_cd);
		dm.setMode(mode.toUpperCase());
		dm.setEmp_no(emp_no);                  
		dm.setFlnm(flnm); 
		dm.setChild_bidt(child_bidt);
		dm.setChild_flnm(child_flnm);
		dm.setChild_seqo(child_seqo);
		dm.setSply_strt_yymm(sply_strt_yymm);
		dm.setSply_amt(sply_amt);
		dm.setPrn(prn);
		dm.setSply_susp_yn(sply_susp_yn);
		dm.setSeq(seq);
		dm.setOccr_dt(occr_dt);

		dm.print();
		
		ds = (HD_AFFR_1820_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}		

	public void hd_affr_1900(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_AFFR_1900_LDataSet ds = null;
		HD_AFFR_1900_LDM dm = new HD_AFFR_1900_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.congr_condl_dt_fr = Util.checkString(req.getParameter("congr_condl_dt_fr"));
		dm.congr_condl_dt_to = Util.checkString(req.getParameter("congr_condl_dt_to"));

		ds = (HD_AFFR_1900_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}	
}
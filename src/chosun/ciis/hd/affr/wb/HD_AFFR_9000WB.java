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
import java.rmi.registry.Registry;
import java.util.Hashtable;
import java.util.StringTokenizer;
import java.util.prefs.Preferences;


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
import chosun.ciis.hd.duty.dm.HD_DUTY_1003_ADM;
import chosun.ciis.hd.duty.ds.HD_DUTY_1003_ADataSet;
/**
 *
 */

public class HD_AFFR_9000WB extends chosun.ciis.co.base.wb.BaseWB {

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
	public void hd_affr_9000_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		
		HD_AFFR_9000_MDataSet ds = null;
		HD_AFFR_9000_MDM dm = new HD_AFFR_9000_MDM();
		
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.basi_dt = Util.checkString(req.getParameter("basi_dt"));
		
		dm.print();
		
		ds = (HD_AFFR_9000_MDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
			System.out.println("DAO..error.");
			throw new AppException(ds.errcode, ds.errmsg);
		}
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_affr_9001_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_AFFR_9001_ADataSet ds = null;
		HD_AFFR_9001_ADM dm = new HD_AFFR_9001_ADM();
		
		dm.cmpy_cd 		= Util.getSessionParameterValue(req, "cmpycd", true);
		dm.basi_dt 		= Util.checkString(req.getParameter("basi_dt"));
		dm.mm_issu_tms 	= Util.checkString(req.getParameter("mm_issu_tms"));
        dm.incmg_pers 	= Util.getSessionParameterValue(req, "emp_no", true);
        dm.incmg_pers_ipadd = req.getRemoteAddr();
		dm.print();

		ds = (HD_AFFR_9001_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
        	System.out.println(ds.errcode);
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_affr_9002_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_AFFR_9002_ADataSet ds = null;
		HD_AFFR_9002_ADM dm = new HD_AFFR_9002_ADM();
		
		dm.cmpy_cd 		= Util.getSessionParameterValue(req, "cmpycd", true);
		dm.basi_dt 		= Util.checkString(req.getParameter("basi_dt"));
        dm.incmg_pers 	= Util.getSessionParameterValue(req, "emp_no", true);
		dm.print();

		ds = (HD_AFFR_9002_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
        	System.out.println(ds.errcode);
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_affr_9003_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_AFFR_9003_ADataSet ds = null;
		HD_AFFR_9003_ADM dm = new HD_AFFR_9003_ADM();
		
		dm.cmpy_cd 		= Util.getSessionParameterValue(req, "cmpycd", true);
		dm.basi_dt 		= Util.checkString(req.getParameter("basi_dt"));
        dm.incmg_pers 	= Util.getSessionParameterValue(req, "emp_no", true);
		dm.print();

		ds = (HD_AFFR_9003_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
        	System.out.println(ds.errcode);
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	
	public void hd_affr_9010_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		
		HD_AFFR_9010_MDataSet ds = null;
		HD_AFFR_9010_MDM dm = new HD_AFFR_9010_MDM();
		
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.usag_clsf_cd = Util.checkString(req.getParameter("usag_clsf_cd"));
		
		dm.print();
		
		ds = (HD_AFFR_9010_MDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
			System.out.println("DAO..error.");
			throw new AppException(ds.errcode, ds.errmsg);
		}
		
		req.setAttribute("ds", ds);
	}
	
	
	public void hd_affr_9011_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_AFFR_9011_LDataSet ds = null;
		HD_AFFR_9011_LDM dm = new HD_AFFR_9011_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.basi_dt = Util.checkString(req.getParameter("basi_dt"));
		dm.journal_cd = Util.checkString(req.getParameter("journal_cd"));
		dm.usag_clsf_cd = Util.checkString(req.getParameter("usag_clsf_cd"));
		dm.print();

		ds = (HD_AFFR_9011_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_affr_9012_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_AFFR_9012_ADataSet ds = null;
		HD_AFFR_9012_ADM dm = new HD_AFFR_9012_ADM();
		String multiUpdateData = Util.checkString(req.getParameter("multiUpDate"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);
		dm.mode		    = ((String)hash.get("m")).toUpperCase();
		dm.seq 			= (String)hash.get("seq");
		dm.dept_cd 		= (String)hash.get("dept_cd");
		dm.journal_cd 	= (String)hash.get("journal_cd");
		dm.qty 			= (String)hash.get("qty");
		dm.icdc_qty		= (String)hash.get("icdc_qty");
		dm.remk         = (String)hash.get("remk");
		dm.cmpy_cd 		= Util.getSessionParameterValue(req, "cmpycd", true);
		dm.basi_dt 		= Util.checkString(req.getParameter("basi_dt"));
		dm.usag_clsf_cd = Util.checkString(req.getParameter("usag_clsf_cd"));
        dm.ss_emp_no 	= Util.getSessionParameterValue(req, "emp_no", true);
        dm.incmg_pers_ipadd = req.getRemoteAddr();
		dm.print();

		ds = (HD_AFFR_9012_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
        	System.out.println(ds.errcode);
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_affr_9013_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_AFFR_9013_ADataSet ds = null;
		HD_AFFR_9013_ADM dm = new HD_AFFR_9013_ADM();
		String multiUpdateData = Util.checkString(req.getParameter("multiUpDate"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);
		dm.mode		    = ((String)hash.get("m")).toUpperCase();
		dm.seq 			= (String)hash.get("seq");
		dm.cmpy_cd 		= Util.getSessionParameterValue(req, "cmpycd", true);
		dm.basi_dt 		= Util.checkString(req.getParameter("basi_dt"));
		dm.print();

		ds = (HD_AFFR_9013_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
        	System.out.println(ds.errcode);
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_affr_9030_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		
		HD_AFFR_9030_MDataSet ds = null;
		HD_AFFR_9030_MDM dm = new HD_AFFR_9030_MDM();
		
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		//dm.usag_clsf_cd = Util.checkString(req.getParameter("usag_clsf_cd"));
		
		dm.print();
		
		ds = (HD_AFFR_9030_MDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
			System.out.println("DAO..error.");
			throw new AppException(ds.errcode, ds.errmsg);
		}
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_affr_9031_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_AFFR_9031_LDataSet ds = null;
		HD_AFFR_9031_LDM dm = new HD_AFFR_9031_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.basi_dt = Util.checkString(req.getParameter("basi_dt"));
		dm.journal_cd = Util.checkString(req.getParameter("journal_cd"));
		dm.print();

		ds = (HD_AFFR_9031_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_affr_9032_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_AFFR_9032_ADataSet ds = null;
		HD_AFFR_9032_ADM dm = new HD_AFFR_9032_ADM();
		String multiUpdateData = Util.checkString(req.getParameter("multiUpDate"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);
		dm.mode		    		= ((String)hash.get("m")).toUpperCase();
		dm.seq 					= (String)hash.get("seq");
		dm.otn_mgng_cd 			= (String)hash.get("otn_mgng_cd");
		dm.outside_clsf_cd 		= (String)hash.get("outside_clsf_cd");
		dm.journal_cd 			= (String)hash.get("journal_cd");
		dm.outside_tel_no 		= (String)hash.get("outside_tel_no");
		dm.zipcode 				= (String)hash.get("zipcode");
		dm.addr     			= (String)hash.get("addr");
		dm.qty 				= (String)hash.get("qty");
		dm.icdc_qty			= (String)hash.get("icdc_qty");
		dm.remk 			= (String)hash.get("remk");
		dm.cmpy_cd 			= Util.getSessionParameterValue(req, "cmpycd", true);
		dm.basi_dt 			= Util.checkString(req.getParameter("basi_dt"));
        dm.ss_emp_no 		= Util.getSessionParameterValue(req, "emp_no", true);
        dm.incmg_pers_ipadd = req.getRemoteAddr();
		dm.print();

		ds = (HD_AFFR_9032_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
        	System.out.println(ds.errcode);
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}

	public void hd_affr_9033_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_AFFR_9033_ADataSet ds = null;
		HD_AFFR_9033_ADM dm = new HD_AFFR_9033_ADM();
		String multiUpdateData = Util.checkString(req.getParameter("multiUpDate"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);
		dm.mode		    		= ((String)hash.get("m")).toUpperCase();
		dm.seq 					= (String)hash.get("seq");
		dm.otn_mgng_cd 			= (String)hash.get("otn_mgng_cd");
		dm.cmpy_cd 				= Util.getSessionParameterValue(req, "cmpycd", true);
		dm.basi_yy 				= Util.checkString(req.getParameter("basi_yy"));
        dm.basi_no 				= Util.checkString(req.getParameter("basi_no"));
		dm.print();

		ds = (HD_AFFR_9033_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
        	System.out.println(ds.errcode);
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_affr_9050_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		
		HD_AFFR_9050_MDataSet ds = null;
		HD_AFFR_9050_MDM dm = new HD_AFFR_9050_MDM();
		
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		//dm.usag_clsf_cd = Util.checkString(req.getParameter("usag_clsf_cd"));
		
		dm.print();
		
		ds = (HD_AFFR_9050_MDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
			System.out.println("DAO..error.");
			throw new AppException(ds.errcode, ds.errmsg);
		}
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_affr_9051_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_AFFR_9051_LDataSet ds = null;
		HD_AFFR_9051_LDM dm = new HD_AFFR_9051_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.basi_fr = Util.checkString(req.getParameter("basi_fr"));
		dm.basi_to = Util.checkString(req.getParameter("basi_to"));
		dm.usag_clsf_cd = Util.checkString(req.getParameter("usag_clsf_cd"));
		dm.print();

		ds = (HD_AFFR_9051_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_affr_9100_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		
		HD_AFFR_9100_MDataSet ds = null;
		HD_AFFR_9100_MDM dm = new HD_AFFR_9100_MDM();
		
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		
		dm.print();
		
		ds = (HD_AFFR_9100_MDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
			System.out.println("DAO..error.");
			throw new AppException(ds.errcode, ds.errmsg);
		}
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_affr_9101_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_AFFR_9101_LDataSet ds = null;
		HD_AFFR_9101_LDM dm = new HD_AFFR_9101_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.outside_flnm = Util.checkString(req.getParameter("outside_flnm"));
		dm.print();

		ds = (HD_AFFR_9101_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_affr_9102_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_AFFR_9102_ADataSet ds = null;
		HD_AFFR_9102_ADM dm = new HD_AFFR_9102_ADM();
		String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);
		
		System.out.println("test");
		dm.cmpy_cd 				= Util.getSessionParameterValue(req,"cmpycd",true);
		dm.mode		    		= ((String)hash.get("m")).toUpperCase();
		dm.otn_mgng_cd 			= (String)hash.get("otn_mgng_cd");
		dm.outside_clsf_cd  	= (String)hash.get("outside_clsf_cd");
		dm.outside_flnm 		= (String)hash.get("outside_flnm");
		dm.outside_tel_no 		= (String)hash.get("outside_tel_no");
		dm.zipcode				= (String)hash.get("zipcode");
		dm.addr 				= (String)hash.get("addr");
		dm.use_yn 				= (String)hash.get("use_yn");
        dm.ss_emp_no 			= Util.getSessionParameterValue(req, "emp_no", true);
        dm.incmg_pers_ipadd	    = req.getRemoteAddr();
		dm.print();

		ds = (HD_AFFR_9102_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
        	System.out.println(ds.errcode);
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_affr_9110_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_AFFR_9110_LDataSet ds = null;
		HD_AFFR_9110_LDM dm = new HD_AFFR_9110_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
	//	dm.outside_flnm = Util.checkString(req.getParameter("outside_flnm"));
		dm.print();

		ds = (HD_AFFR_9110_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}

	public void hd_affr_9500_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		
		HD_AFFR_9500_MDataSet ds = null;
		HD_AFFR_9500_MDM dm = new HD_AFFR_9500_MDM();
		
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		
		dm.print();
		
		ds = (HD_AFFR_9500_MDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
			System.out.println("DAO..error.");
			throw new AppException(ds.errcode, ds.errmsg);
		}
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_affr_9501_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_AFFR_9501_LDataSet ds = null;
		HD_AFFR_9501_LDM dm = new HD_AFFR_9501_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.flnm = Util.checkString(req.getParameter("flnm"));
		dm.dth_yn = Util.checkString(req.getParameter("dth_yn"));
		dm.memb_clsf = Util.checkString(req.getParameter("memb_clsf"));
		dm.lve_yn = Util.checkString(req.getParameter("lve_yn"));
		dm.print();

		ds = (HD_AFFR_9501_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}

	public void hd_affr_9502_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_AFFR_9502_ADataSet ds = null;
		HD_AFFR_9502_ADM dm = new HD_AFFR_9502_ADM();
		//String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
		//Hashtable hash = getHashMultiUpdateData(multiUpdateData);
		
		System.out.println("test");
		dm.cmpy_cd 				= Util.getSessionParameterValue(req,"cmpycd",true);
		dm.mode		    		= Util.checkString(req.getParameter("mode"));
		dm.mang_no  			= Util.checkString(req.getParameter("mang_no"));
		dm.flnm              	=  Util.checkString(req.getParameter("flnm"));
		dm.memb_clsf 			=  Util.checkString(req.getParameter("memb_clsf"));
		dm.emp_birthday 		=  Util.checkString(req.getParameter("emp_birthday"));
		dm.dth_yn				=  Util.checkString(req.getParameter("dth_yn"));
		dm.spos_name 			=  Util.checkString(req.getParameter("spos_name"));
		dm.spos_birthday 		=  Util.checkString(req.getParameter("spos_birthday"));
		dm.spos_yn				=  Util.checkString(req.getParameter("spos_yn"));
		dm.zipcode				=  Util.checkString(req.getParameter("zipcode"));
		dm.addr 				=  Util.checkString(req.getParameter("addr"));
		dm.phon_no				=  Util.checkString(req.getParameter("phon_no"));
		dm.tel_no				=  Util.checkString(req.getParameter("tel_no"));
		dm.bank_cd 				=  Util.checkString(req.getParameter("bank_cd"));
		dm.acct_no				=  Util.checkString(req.getParameter("acct_no"));
		dm.deps_per				=  Util.checkString(req.getParameter("deps_per"));
		dm.lvcmpy_dty 			=  Util.checkString(req.getParameter("lvcmpy_dty"));
        dm.remk 				=  Util.checkString(req.getParameter("remk"));
        dm.incmg_pers 				= Util.getSessionParameterValue(req, "emp_no", true);
        dm.incmg_pers_ipadd	    = req.getRemoteAddr();
		dm.print();

		ds = (HD_AFFR_9502_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
        	System.out.println(ds.errcode);
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_affr_9503_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_AFFR_9503_LDataSet ds = null;
		HD_AFFR_9503_LDM dm = new HD_AFFR_9503_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.flnm = Util.checkString(req.getParameter("flnm"));
		dm.mang_no = Util.checkString(req.getParameter("mang_no"));
		dm.print();

		ds = (HD_AFFR_9503_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}

	
	public void hd_affr_9600_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		
		HD_AFFR_9600_MDataSet ds = null;
		HD_AFFR_9600_MDM dm = new HD_AFFR_9600_MDM();
		
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		
		dm.print();
		
		ds = (HD_AFFR_9600_MDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
			System.out.println("DAO..error.");
			throw new AppException(ds.errcode, ds.errmsg);
		}
		
		req.setAttribute("ds", ds);
	}
	

	
	public void hd_affr_9601_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_AFFR_9601_LDataSet ds = null;
		HD_AFFR_9601_LDM dm = new HD_AFFR_9601_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.flnm = Util.checkString(req.getParameter("flnm"));
		dm.expn_clsf_cd = Util.checkString(req.getParameter("expn_clsf_cd"));
		dm.memb_clsf = Util.checkString(req.getParameter("memb_clsf"));
		dm.slip_no = Util.checkString(req.getParameter("slip_no"));
		dm.print();
		ds = (HD_AFFR_9601_LDataSet)manager.executeCall(dm);
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}

	
	public void hd_affr_9602_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_AFFR_9602_ADataSet ds = null;
		HD_AFFR_9602_ADM dm = new HD_AFFR_9602_ADM();
		//String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
		//Hashtable hash = getHashMultiUpdateData(multiUpdateData);
		
		System.out.println("test");
		dm.cmpy_cd 				= Util.getSessionParameterValue(req,"cmpycd",true);
		dm.mode		    		= Util.checkString(req.getParameter("mode"));
		dm.mang_no  			= Util.checkString(req.getParameter("mang_no"));
		dm.seq  				= Util.checkString(req.getParameter("seq"));
		dm.flnm              	=  Util.checkString(req.getParameter("flnm"));
		dm.memb_clsf 			=  Util.checkString(req.getParameter("memb_clsf"));
		dm.aply_obj_clsf 		=  Util.checkString(req.getParameter("aply_obj_clsf"));
		dm.aply_obj_name		=  Util.checkString(req.getParameter("aply_obj_name"));
		dm.expn_clsf_cd 		=  Util.checkString(req.getParameter("expn_clsf_cd"));
		dm.expn_cont 			=  Util.checkString(req.getParameter("expn_cont"));
		dm.str_dt				=  Util.checkString(req.getParameter("str_dt"));
		dm.end_dt				=  Util.checkString(req.getParameter("end_dt"));
		dm.limt_amt				=  Util.checkString(req.getParameter("limt_amt"));
		dm.clam_amt 			=  Util.checkString(req.getParameter("clam_amt"));
		dm.excl_amt				=  Util.checkString(req.getParameter("excl_amt"));
		dm.sply_amt				=  Util.checkString(req.getParameter("sply_amt"));
		dm.bank_cd 				=  Util.checkString(req.getParameter("bank_cd"));
		dm.acct_no				=  Util.checkString(req.getParameter("acct_no"));
		dm.deps_per				=  Util.checkString(req.getParameter("deps_per"));
		dm.reg_dt 				=  Util.checkString(req.getParameter("reg_dt"));
		dm.pay_dt 				=  Util.checkString(req.getParameter("pay_dt"));
        dm.proc_stat            =  Util.checkString(req.getParameter("proc_stat"));
        dm.remk 				=  Util.checkString(req.getParameter("remk"));
        dm.spos_name            =  Util.checkString(req.getParameter("spos_name"));
        dm.expn_resn_cd1 		=  Util.checkString(req.getParameter("expn_resn_cd1"));
        dm.expn_resn_cd2 		=  Util.checkString(req.getParameter("expn_resn_cd2"));
        dm.expn_resn_cd3 		=  Util.checkString(req.getParameter("expn_resn_cd3"));
        dm.ss_emp_no		    = Util.getSessionParameterValue(req, "emp_no", true);
        dm.incmg_pers_ipadd	    = req.getRemoteAddr();
		dm.print();

		ds = (HD_AFFR_9602_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
        	System.out.println(ds.errcode);
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	
	public void hd_affr_9603_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		
		System.out.println("test22");
		HD_AFFR_9603_ADataSet ds = null;
		HD_AFFR_9603_ADM dm = new HD_AFFR_9603_ADM();
		
		System.out.println("test33");
		System.out.println(Util.checkString(req.getParameter("multiUpData")));
		String multiUpData = Util.checkString(req.getParameter("multiUpData"));
		System.out.print( multiUpData.length() );
		Hashtable hash = getHashMultiUpdateData(multiUpData);
		
		System.out.println("test");
		dm.cmpy_cd 				= Util.getSessionParameterValue(req,"cmpycd",true);
		dm.mode		    		= ((String)hash.get("m")).toUpperCase();
		dm.mang_no  			= (String)hash.get("mang_no");
		dm.seq       			= (String)hash.get("seq");
		dm.proc_mang_dt 		= (String)hash.get("proc_mang_dt");
        dm.ss_emp_no		    = Util.getSessionParameterValue(req, "emp_no", true);
        dm.incmg_pers_ipadd	    = req.getRemoteAddr();
		dm.print();

		ds = (HD_AFFR_9603_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
        	System.out.println(ds.errcode);
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	
	public void hd_affr_9604_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_AFFR_9604_LDataSet ds = null;
		HD_AFFR_9604_LDM dm = new HD_AFFR_9604_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.mang_no = Util.checkString(req.getParameter("mang_no"));
		dm.expn_clsf_cd = Util.checkString(req.getParameter("expn_clsf_cd"));
		dm.aply_obj_clsf = Util.checkString(req.getParameter("aply_obj_clsf"));
		dm.limt_amt = Util.checkString(req.getParameter("limt_amt"));
		dm.sply_amt = Util.checkString(req.getParameter("sply_amt"));
		dm.str_dt = Util.checkString(req.getParameter("str_dt"));
		dm.print();

		ds = (HD_AFFR_9604_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_affr_9605_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_AFFR_9605_LDataSet ds = null;
		HD_AFFR_9605_LDM dm = new HD_AFFR_9605_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.mang_no = Util.checkString(req.getParameter("mang_no"));
		dm.expn_clsf_cd = Util.checkString(req.getParameter("expn_clsf_cd"));
		dm.aply_obj_clsf = Util.checkString(req.getParameter("aply_obj_clsf"));
		dm.limt_amt = Util.checkString(req.getParameter("limt_amt"));
		dm.str_dt = Util.checkString(req.getParameter("str_dt"));
		dm.print();

		ds = (HD_AFFR_9605_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_affr_9700_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_AFFR_9700_LDataSet ds = null;
		HD_AFFR_9700_LDM dm = new HD_AFFR_9700_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		
		ds = (HD_AFFR_9700_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_affr_9701_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_AFFR_9701_LDataSet ds = null;
		HD_AFFR_9701_LDM dm = new HD_AFFR_9701_LDM();
		
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.mang_no = Util.checkString(req.getParameter("mang_no"));
		dm.memb_clsf = Util.checkString(req.getParameter("memb_clsf"));
		dm.expn_clsf_cd = Util.checkString(req.getParameter("expn_clsf_cd"));
		dm.stlm_desty = Util.checkString(req.getParameter("stlm_desty"));
		dm.reg_sdt = Util.checkString(req.getParameter("reg_sdt"));
		dm.reg_edt = Util.checkString(req.getParameter("reg_edt"));
		dm.pay_sdt = Util.checkString(req.getParameter("pay_sdt"));
		dm.pay_edt = Util.checkString(req.getParameter("pay_edt"));
		dm.spos_yn = Util.checkString(req.getParameter("spos_yn"));
		dm.dth_yn = Util.checkString(req.getParameter("dth_yn"));

		dm.print();
		ds = (HD_AFFR_9701_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_affr_9703_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_AFFR_9703_ADataSet ds = null;
		HD_AFFR_9703_ADM dm = new HD_AFFR_9703_ADM();
		
		System.out.println(Util.checkString(req.getParameter("multiUpData")));
		String multiUpData = Util.checkString(req.getParameter("multiUpData"));
		System.out.print( multiUpData.length() );
		Hashtable hash = getHashMultiUpdateData(multiUpData);
		
		System.out.println("test1111111111111111111111");
		dm.cmpy_cd 				= Util.getSessionParameterValue(req,"cmpycd",true);
		dm.mang_no  			= (String)hash.get("mang_no");
		dm.seq       			= (String)hash.get("seq");
		dm.proc_mang_dt 		= (String)hash.get("proc_mang_dt");
        dm.ss_emp_no		    = Util.getSessionParameterValue(req, "emp_no", true);
        dm.incmg_pers_ipadd	    = req.getRemoteAddr();
		dm.print();

		ds = (HD_AFFR_9703_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
        	System.out.println(ds.errcode);
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_affr_9704_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_AFFR_9704_LDataSet ds = null;
		HD_AFFR_9704_LDM dm = new HD_AFFR_9704_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.mang_cd_1 = Util.checkString(req.getParameter("mang_cd_1"));

		dm.print();

		ds = (HD_AFFR_9704_LDataSet)manager.executeCall(dm);
		System.out.println("1111111111111111112222222222");
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_affr_9707_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_AFFR_9707_ADataSet ds = null;
		HD_AFFR_9707_ADM dm = new HD_AFFR_9707_ADM();
		
		System.out.println(Util.checkString(req.getParameter("multiUpData")));
		String multiUpData = Util.checkString(req.getParameter("multiUpData"));
		System.out.print( multiUpData.length() );
		Hashtable hash = getHashMultiUpdateData(multiUpData);
		
		dm.cmpy_cd 				= Util.getSessionParameterValue(req,"cmpycd",true);
		dm.mang_no  			= (String)hash.get("mang_no");
		dm.seq       			= (String)hash.get("seq");
        dm.ss_emp_no		    = Util.getSessionParameterValue(req, "emp_no", true);
        dm.incmg_pers_ipadd	    = req.getRemoteAddr();
		dm.print();

		ds = (HD_AFFR_9707_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
        	System.out.println(ds.errcode);
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_affr_9708_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_AFFR_9708_LDataSet ds = null;
		HD_AFFR_9708_LDM dm = new HD_AFFR_9708_LDM();
		
		System.out.println(Util.checkString(req.getParameter("multiUpData")));
		String multiUpData = Util.checkString(req.getParameter("multiUpData"));
		System.out.print( multiUpData.length() );
		Hashtable hash = getHashMultiUpdateData(multiUpData);
		
		dm.cmpy_cd 				= Util.getSessionParameterValue(req,"cmpycd",true);
		dm.print();

		ds = (HD_AFFR_9708_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
        	System.out.println(ds.errcode);
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}

}

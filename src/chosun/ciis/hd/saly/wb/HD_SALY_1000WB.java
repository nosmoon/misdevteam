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

package chosun.ciis.hd.saly.wb;


import java.util.*;
import java.io.*;
import java.rmi.RemoteException;
import java.sql.CallableStatement;
import java.sql.SQLException;
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
import chosun.ciis.hd.affr.dm.HD_AFFR_1201_ADM;
import chosun.ciis.hd.affr.ds.HD_AFFR_1201_ADataSet;
import chosun.ciis.hd.lvcmpy.dm.HD_LVCMPY_2001_ADM;
import chosun.ciis.hd.lvcmpy.dm.HD_LVCMPY_2003_ADM;
import chosun.ciis.hd.lvcmpy.ds.HD_LVCMPY_2001_ADataSet;
import chosun.ciis.hd.lvcmpy.ds.HD_LVCMPY_2003_ADataSet;
import chosun.ciis.hd.prz.ds.HD_PRZ_1402_ADataSet;
import chosun.ciis.hd.saly.dm.*;
import chosun.ciis.hd.saly.ds.*;
/**
 * 
 */

public class HD_SALY_1000WB extends BaseWB {
 
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


	public void hd_saly_1000_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_1000_LDataSet ds = null;
		HD_SALY_1000_LDM dm = new HD_SALY_1000_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.saly_yy = Util.checkString(req.getParameter("saly_yy"));
		dm.saly_no = Util.checkString(req.getParameter("saly_no"));

		dm.print();
		
		ds = (HD_SALY_1000_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_saly_1001_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_1001_ADataSet ds = null;
		HD_SALY_1001_ADM dm = new HD_SALY_1001_ADM();

		String multiUpdateData = Util.checkString(req.getParameter("multiUpdate"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);
		System.out.println("=====================================================================================");
		System.out.println(multiUpdateData);
		System.out.println("=====================================================================================");
		
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.mode = ((String)hash.get("m")).toUpperCase();
        dm.saly_yy = (String)hash.get("saly_yy");
		dm.saly_no = (String)hash.get("saly_no");
		dm.emp_no = (String)hash.get("emp_no");
		dm.flnm = (String)hash.get("flnm");
		dm.dept_cd = (String)hash.get("dept_cd");
		dm.dty_cd = (String)hash.get("dty_cd");
		dm.posi_cd = (String)hash.get("posi_cd");
		dm.week_hody_base_alon = (String)hash.get("week_hody_base_alon");
		dm.week_hody_cmpn_alon = (String)hash.get("week_hody_cmpn_alon");
		dm.lgl_hody_alon = (String)hash.get("lgl_hody_alon");
		dm.nissu_dd_alon = (String)hash.get("nissu_dd_alon");
		dm.ovt_alon = (String)hash.get("ovt_alon");
		dm.erl_prsnt_alon = (String)hash.get("erl_prsnt_alon");
		dm.extra_alon = (String)hash.get("extra_alon");
		dm.vgl_fee = (String)hash.get("vgl_fee");
		dm.etc_duty_alon = (String)hash.get("etc_duty_alon");
		dm.prvmm_mstk_alon = (String)hash.get("prvmm_mstk_alon");
		dm.non_regu_alon_stot = (String)hash.get("non_regu_alon_stot");
		dm.incmg_pers_ipadd = req.getRemoteAddr();
        dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
     //   dm.lang_study_splamt = (String)hash.get("lang_study_splamt");    
     //   dm.rslt_alon_saly = (String)hash.get("rslt_alon_saly");     
     //   dm.scl_exps_alon_saly = (String)hash.get("scl_exps_alon_saly");  
        dm.etc_alon_saly = (String)hash.get("etc_alon_saly");       
        dm.bns_saly = (String)hash.get("bns_saly");             
    //    dm.rslt_alon_exst_pay = (String)hash.get("rslt_alon_exst_pay");        
    //    dm.scl_exps_alon_exst_pay = (String)hash.get("scl_exps_alon_exst_pay");    
    //    dm.etc_alon_exst_pay = (String)hash.get("etc_alon_exst_pay");    		
    //    dm.bns_exst_pay = (String)hash.get("bns_exst_pay");              
    //    dm.sply_chk_fee = (String)hash.get("sply_chk_fee");         
    //    dm.anvy_pay_fee = (String)hash.get("anvy_pay_fee");         
        dm.hody_duty_alon = (String)hash.get("hody_duty_alon");
    //    dm.rdr_extn_alon = (String)hash.get("rdr_extn_alon");   
    //    dm.vaca_fee = (String)hash.get("vaca_fee");    
    //    dm.park_vilt_sply_fee = (String)hash.get("park_vilt_sply_fee");    
    //    dm.clamt_alon = (String)hash.get("clamt_alon");   
    //    dm.prz_fee = (String)hash.get("prz_fee");
        dm.congr_fee   = (String)hash.get("congr_fee");
        dm.welfare_fee = (String)hash.get("welfare_fee");
        dm.adpay_amt   = (String)hash.get("adpay_amt");
        
        dm.print();
		
		ds = (HD_SALY_1001_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_saly_1002_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_1002_LDataSet ds = null;
		HD_SALY_1002_LDM dm = new HD_SALY_1002_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));

		dm.print();
		
		ds = (HD_SALY_1002_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_saly_1003_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_1003_MDataSet ds = null;
		HD_SALY_1003_MDM dm = new HD_SALY_1003_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);

		dm.print();
		
		ds = (HD_SALY_1003_MDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_saly_1100_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_1100_LDataSet ds = null;
		HD_SALY_1100_LDM dm = new HD_SALY_1100_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.saly_yy = Util.checkString(req.getParameter("saly_yy"));
		dm.saly_no = Util.checkString(req.getParameter("saly_no"));

		dm.print();
		
		ds = (HD_SALY_1100_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_saly_1200_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_1200_ADataSet ds = null;
		HD_SALY_1200_ADM dm = new HD_SALY_1200_ADM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.saly_yy = Util.checkString(req.getParameter("saly_yy"));
		dm.saly_no = Util.checkString(req.getParameter("saly_no"));
		dm.duty_alon_basi_frdt = Util.checkString(req.getParameter("duty_alon_basi_frdt"));
		dm.duty_alon_basi_todt = Util.checkString(req.getParameter("duty_alon_basi_todt"));
		dm.incmg_pers_ipadd = req.getRemoteAddr();
        dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        
		dm.print();
		
		ds = (HD_SALY_1200_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_saly_1201_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_1201_ADataSet ds = null;
		HD_SALY_1201_ADM dm = new HD_SALY_1201_ADM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.saly_yy = Util.checkString(req.getParameter("saly_yy"));
		dm.saly_no = Util.checkString(req.getParameter("saly_no"));
		dm.incmg_pers_ipadd = req.getRemoteAddr();
        dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);

		dm.print();
		
		ds = (HD_SALY_1201_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_saly_1202_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_1202_MDataSet ds = null;
		HD_SALY_1202_MDM dm = new HD_SALY_1202_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.saly_yy = Util.checkString(req.getParameter("saly_yy"));
		dm.saly_no = Util.checkString(req.getParameter("saly_no"));

		dm.print();
		
		ds = (HD_SALY_1202_MDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_saly_1210_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_1210_LDataSet ds = null;
		HD_SALY_1210_LDM dm = new HD_SALY_1210_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.saly_yy = Util.checkString(req.getParameter("saly_yy"));
		dm.saly_no = Util.checkString(req.getParameter("saly_no"));

		dm.print();
		
		ds = (HD_SALY_1210_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_saly_1211_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_1211_LDataSet ds = null;
		HD_SALY_1211_LDM dm = new HD_SALY_1211_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.saly_yy = Util.checkString(req.getParameter("saly_yy"));
		dm.saly_no = Util.checkString(req.getParameter("saly_no"));

		dm.print();
		
		ds = (HD_SALY_1211_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_saly_1300_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_1300_LDataSet ds = null;
		HD_SALY_1300_LDM dm = new HD_SALY_1300_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.saly_yy = Util.checkString(req.getParameter("saly_yy"));
		dm.saly_no = Util.checkString(req.getParameter("saly_no"));

		dm.print();
		
		ds = (HD_SALY_1300_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_saly_1301_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_1301_ADataSet ds = null;
		HD_SALY_1301_ADM dm = new HD_SALY_1301_ADM();
		
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdate"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);
		System.out.println("=====================================================================================");
		System.out.println(multiUpdateData);
		System.out.println("=====================================================================================");
		
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.mode = ((String)hash.get("m")).toUpperCase();
        dm.saly_yy = (String)hash.get("saly_yy");
		dm.saly_no = (String)hash.get("saly_no");
		dm.emp_no = (String)hash.get("emp_no");
		dm.flnm = (String)hash.get("flnm");
		dm.dept_cd = (String)hash.get("dept_cd");
		dm.dty_cd = (String)hash.get("dty_cd");
		dm.posi_cd = (String)hash.get("posi_cd");
		dm.base_saly = (String)hash.get("base_saly");
		dm.posk_saly = (String)hash.get("posk_saly");
		dm.real_pay_rgla_saly = (String)hash.get("real_pay_rgla_saly");
		dm.prvmm_mstk_saly = (String)hash.get("prvmm_mstk_saly");
		dm.excp_resn = (String)hash.get("excp_resn");
		dm.incmg_pers_ipadd = req.getRemoteAddr();
        dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.food_alon	      = (String)hash.get("food_alon");
        dm.care_alon		  = (String)hash.get("care_alon");
        dm.dty_alon			  = (String)hash.get("dty_alon");
        dm.posk_alon		  = (String)hash.get("posk_alon");
        dm.jrnst     		  = (String)hash.get("jrnst"); 
        dm.auto_driv_alon     = (String)hash.get("auto_driv_alon"); 
        dm.evngt_saly    	  = (String)hash.get("evngt_saly"); 
        dm.print();
		
		ds = (HD_SALY_1301_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_saly_1302_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_1302_LDataSet ds = null;
		HD_SALY_1302_LDM dm = new HD_SALY_1302_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));

		dm.print();
		
		ds = (HD_SALY_1302_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	public void hd_saly_1303_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_1303_MDataSet ds = null;
		HD_SALY_1303_MDM dm = new HD_SALY_1303_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);

		dm.print();
		
		ds = (HD_SALY_1303_MDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	public void hd_saly_1304_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
   	
		HD_SALY_1304_ADataSet ds = null;
		HD_SALY_1304_ADM dm = new HD_SALY_1304_ADM();

		dm.mode = Util.checkString(req.getParameter("mode"));
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true); 
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.chg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		
		dm.print();

		ds = (HD_SALY_1304_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	public void hd_saly_1400_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_1400_ADataSet ds = null;
		HD_SALY_1400_ADM dm = new HD_SALY_1400_ADM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.saly_yy = Util.checkString(req.getParameter("saly_yy"));
		dm.saly_no = Util.checkString(req.getParameter("saly_no"));
		dm.saly_pay_dt = Util.checkString(req.getParameter("saly_pay_dt"));
		dm.appmt_dt = Util.checkString(req.getParameter("appmt_dt"));
		dm.sgyb = Util.checkString(req.getParameter("sgyb"));
		dm.incmg_pers_ipadd = req.getRemoteAddr();
        dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
 
		dm.print();
		
		ds = (HD_SALY_1400_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	/* 경제 I 급여 지급계산  */ 
	public void hd_saly_1400_334_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_1400_334_ADataSet ds = null;
		HD_SALY_1400_334_ADM dm = new HD_SALY_1400_334_ADM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.saly_yy = Util.checkString(req.getParameter("saly_yy"));
		dm.saly_no = Util.checkString(req.getParameter("saly_no"));
		dm.saly_pay_dt = Util.checkString(req.getParameter("saly_pay_dt"));
		dm.appmt_dt = Util.checkString(req.getParameter("appmt_dt"));
		dm.sgyb = Util.checkString(req.getParameter("sgyb"));
		dm.incmg_pers_ipadd = req.getRemoteAddr();
        dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
 
		dm.print();
		
		ds = (HD_SALY_1400_334_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
		
		
	public void hd_saly_1401_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_1401_ADataSet ds = null;
		HD_SALY_1401_ADM dm = new HD_SALY_1401_ADM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.saly_yy = Util.checkString(req.getParameter("saly_yy"));
		dm.saly_no = Util.checkString(req.getParameter("saly_no"));
		dm.incmg_pers_ipadd = req.getRemoteAddr();
        dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);

		dm.print();
		
		ds = (HD_SALY_1401_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_saly_1402_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_1402_MDataSet ds = null;
		HD_SALY_1402_MDM dm = new HD_SALY_1402_MDM();
		
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		
		dm.print();
		
		ds = (HD_SALY_1402_MDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
			System.out.println("DAO..error.");
			throw new AppException(ds.errcode, ds.errmsg);
		}
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_saly_1405_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_1405_ADataSet ds = null;
		HD_SALY_1405_ADM dm = new HD_SALY_1405_ADM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.saly_yy = Util.checkString(req.getParameter("saly_yy"));
		dm.saly_no = Util.checkString(req.getParameter("saly_no"));
		dm.saly_pay_dt = Util.checkString(req.getParameter("saly_pay_dt"));
		dm.appmt_dt = Util.checkString(req.getParameter("appmt_dt"));
		dm.sgyb = Util.checkString(req.getParameter("sgyb"));
		dm.incmg_pers_ipadd = req.getRemoteAddr();
        dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);

		dm.print();
		
		ds = (HD_SALY_1405_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	public void hd_saly_1410_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_1410_LDataSet ds = null;
		HD_SALY_1410_LDM dm = new HD_SALY_1410_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.saly_yy = Util.checkString(req.getParameter("saly_yy"));
		dm.saly_no = Util.checkString(req.getParameter("saly_no"));

		dm.print();
		
		ds = (HD_SALY_1410_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_saly_1411_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_1411_LDataSet ds = null;
		HD_SALY_1411_LDM dm = new HD_SALY_1411_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.saly_yy = Util.checkString(req.getParameter("saly_yy"));
		dm.saly_no = Util.checkString(req.getParameter("saly_no"));

		dm.print();
		
		ds = (HD_SALY_1411_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	public void hd_saly_1410_334_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_1410_334_LDataSet ds = null;
		HD_SALY_1410_334_LDM dm = new HD_SALY_1410_334_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.saly_yy = Util.checkString(req.getParameter("saly_yy"));
		dm.saly_no = Util.checkString(req.getParameter("saly_no"));

		dm.print();
		
		ds = (HD_SALY_1410_334_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_saly_1411_334_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_1411_334_LDataSet ds = null;
		HD_SALY_1411_334_LDM dm = new HD_SALY_1411_334_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.saly_yy = Util.checkString(req.getParameter("saly_yy"));
		dm.saly_no = Util.checkString(req.getParameter("saly_no"));

		dm.print();
		
		ds = (HD_SALY_1411_334_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_saly_2100_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_2100_LDataSet ds = null;
		HD_SALY_2100_LDM dm = new HD_SALY_2100_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.saly_yy = Util.checkString(req.getParameter("saly_yy"));
		dm.saly_no = Util.checkString(req.getParameter("saly_no"));

		dm.print();
		
		ds = (HD_SALY_2100_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_saly_2101_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_2101_ADataSet ds = null;
		HD_SALY_2101_ADM dm = new HD_SALY_2101_ADM();
		
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdate"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);
		System.out.println("=====================================================================================");
		System.out.println(multiUpdateData);
		System.out.println("=====================================================================================");
		
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.mode = ((String)hash.get("m")).toUpperCase();
        dm.saly_yy = (String)hash.get("saly_yy");
		dm.saly_no = (String)hash.get("saly_no");
		dm.emp_no = (String)hash.get("emp_no");
		dm.base_saly = (String)hash.get("base_saly");
		dm.posk_saly = (String)hash.get("posk_saly");
		dm.lvcmpy_alon = (String)hash.get("lvcmpy_alon");
		dm.incmg_pers_ipadd = req.getRemoteAddr();
        dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		
		dm.print();
		
		ds = (HD_SALY_2101_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_saly_2102_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_2102_LDataSet ds = null;
		HD_SALY_2102_LDM dm = new HD_SALY_2102_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));

		dm.print();
		
		ds = (HD_SALY_2102_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_saly_2501_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_2501_LDataSet ds = null;
		HD_SALY_2501_LDM dm = new HD_SALY_2501_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.alon_yymm = Util.checkString(req.getParameter("alon_yymm"));
		dm.print();
		
		ds = (HD_SALY_2501_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_saly_2502_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_2502_LDataSet ds = null;
		HD_SALY_2502_LDM dm = new HD_SALY_2502_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.alon_yymm = Util.checkString(req.getParameter("alon_yymm"));
		dm.print();
		
		ds = (HD_SALY_2502_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	 public void hd_saly_2503_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
			DBManager manager = new DBManager("MISHDL");

			HD_SALY_2503_ADataSet ds = null;
			HD_SALY_2503_ADM dm = new HD_SALY_2503_ADM();

			String multiUpdateData = Util.checkString(req.getParameter("multiUpDate"));
			Hashtable hash = getHashMultiUpdateData(multiUpdateData);

			dm.mode = ((String)hash.get("m")).toUpperCase();
			dm.alon_yymm = Util.checkString(req.getParameter("alon_yymm"));
			dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
			dm.emp_no = (String)hash.get("emp_no");
			dm.flnm = (String)hash.get("flnm");
			dm.alon_cd = (String)hash.get("alon_cd");
			dm.budg_cd = (String)hash.get("budg_cd");			
			dm.pay_dt = (String)hash.get("pay_dt");
			dm.exst_pay_alon = (String)hash.get("exst_pay_alon");
			dm.actu_slip_no = (String)hash.get("actu_slip_no");
			dm.incmg_pers_ipadd = req.getRemoteAddr();
	        dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
	        
	        dm.print();
	        
			ds = (HD_SALY_2503_ADataSet)manager.executeCall(dm);
			
			if (!"".equals(ds.errcode)) {
	        	System.out.println("DAO..error.");
	            throw new AppException(ds.errcode, ds.errmsg);
	        }
			
			req.setAttribute("ds", ds);
		}
	
	 public void hd_saly_2504_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
			DBManager manager = new DBManager("MISHDL");

			HD_SALY_2504_ADataSet ds = null;
			HD_SALY_2504_ADM dm = new HD_SALY_2504_ADM();

			dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
			dm.emp_no = Util.checkString(req.getParameter("emp_no"));
			dm.alon_yymm = Util.checkString(req.getParameter("alon_yymm"));
			dm.incmg_pers_ipadd = req.getRemoteAddr();
	        dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
	        dm.print();

			ds = (HD_SALY_2504_ADataSet)manager.executeCall(dm);
			
			if (!"".equals(ds.errcode)) {
	        	System.out.println("DAO..error.");
	            throw new AppException(ds.errcode, ds.errmsg);
	        }
			
			req.setAttribute("ds", ds);
		}
	    
	
	
	
	public void hd_saly_3000_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_3000_LDataSet ds = null;
		HD_SALY_3000_LDM dm = new HD_SALY_3000_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.saly_yy = Util.checkString(req.getParameter("saly_yy"));
		dm.saly_no = Util.checkString(req.getParameter("saly_no"));

		dm.print();
		
		ds = (HD_SALY_3000_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_saly_3001_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_3001_ADataSet ds = null;
		HD_SALY_3001_ADM dm = new HD_SALY_3001_ADM();
		
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdate"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);
		System.out.println("=====================================================================================");
		System.out.println(multiUpdateData);
		System.out.println("=====================================================================================");
		
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.mode = ((String)hash.get("m")).toUpperCase();
        dm.saly_yy = (String)hash.get("saly_yy");
		dm.saly_no = (String)hash.get("saly_no");
		dm.emp_no = (String)hash.get("emp_no");
		dm.flnm = (String)hash.get("flnm");
		dm.dept_cd = (String)hash.get("dept_cd");
		dm.dty_cd = (String)hash.get("dty_cd");
		dm.posi_cd = (String)hash.get("posi_cd"); 
		dm.etc_dduc_nm_1 = (String)hash.get("etc_dduc_nm_1");
		dm.etc_dduc_1 = (String)hash.get("etc_dduc_1");
		dm.etc_dduc_nm_2 = (String)hash.get("etc_dduc_nm_2");
		dm.etc_dduc_2 = (String)hash.get("etc_dduc_2"); 
		dm.etc_dduc_nm_3 = (String)hash.get("etc_dduc_nm_3");
		dm.etc_dduc_3 = (String)hash.get("etc_dduc_3");
		dm.etc_dduc_nm_4 = (String)hash.get("etc_dduc_nm_4");
		dm.etc_dduc_4 = (String)hash.get("etc_dduc_4");
		dm.etc_dduc_nm_5 = (String)hash.get("etc_dduc_nm_5");
		dm.etc_dduc_5 = (String)hash.get("etc_dduc_5");
		dm.prvmm_mstk_dduc = (String)hash.get("prvmm_mstk_dduc");
		dm.etc_dduc_remk = (String)hash.get("etc_dduc_remk");
		dm.incmg_pers_ipadd = req.getRemoteAddr();
        dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		
		dm.print();
		
		ds = (HD_SALY_3001_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_saly_3002_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_3002_LDataSet ds = null;
		HD_SALY_3002_LDM dm = new HD_SALY_3002_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));

		dm.print();
		
		ds = (HD_SALY_3002_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_saly_3100_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_3100_LDataSet ds = null;
		HD_SALY_3100_LDM dm = new HD_SALY_3100_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.saly_yy = Util.checkString(req.getParameter("saly_yy"));
		dm.saly_no = Util.checkString(req.getParameter("saly_no"));

		dm.print();
		
		ds = (HD_SALY_3100_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_saly_3101_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_3101_ADataSet ds = null;
		HD_SALY_3101_ADM dm = new HD_SALY_3101_ADM();
		
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdate")); 
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);
		System.out.println("=====================================================================================");
		System.out.println(multiUpdateData);
		System.out.println("=====================================================================================");
		
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.mode = ((String)hash.get("m")).toUpperCase();
		dm.saly_yy = (String)hash.get("saly_yy");
		dm.saly_no = (String)hash.get("saly_no");
		dm.emp_no = (String)hash.get("emp_no");
		dm.flnm = (String)hash.get("flnm");
		dm.dept_cd = (String)hash.get("dept_cd");
		dm.dty_cd = (String)hash.get("dty_cd");
		dm.posi_cd = (String)hash.get("posi_cd");
		dm.park_fee_dduc = (String)hash.get("park_fee_dduc");
		dm.incmg_pers_ipadd = req.getRemoteAddr();
        dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);

		dm.print();
		
		ds = (HD_SALY_3101_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_saly_3102_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_3102_LDataSet ds = null;
		HD_SALY_3102_LDM dm = new HD_SALY_3102_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));

		dm.print();
		
		ds = (HD_SALY_3102_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_saly_3200_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_3200_LDataSet ds = null;
		HD_SALY_3200_LDM dm = new HD_SALY_3200_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.saly_yy = Util.checkString(req.getParameter("saly_yy"));
		dm.saly_no = Util.checkString(req.getParameter("saly_no"));

		dm.print();
		
		ds = (HD_SALY_3200_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_saly_3201_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_3201_ADataSet ds = null;
		HD_SALY_3201_ADM dm = new HD_SALY_3201_ADM();
		
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdate"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);
		System.out.println("=====================================================================================");
		System.out.println(multiUpdateData);
		System.out.println("=====================================================================================");
		
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.mode = ((String)hash.get("m")).toUpperCase();
		dm.saly_yy = (String)hash.get("saly_yy");
		dm.saly_no = (String)hash.get("saly_no");
		dm.emp_no = (String)hash.get("emp_no");
		dm.flnm = (String)hash.get("flnm");
		dm.dept_cd = (String)hash.get("dept_cd");
		dm.dty_cd = (String)hash.get("dty_cd");
		dm.posi_cd = (String)hash.get("posi_cd");
		dm.base_stay_fee = (String)hash.get("base_stay_fee");
		dm.incmg_pers_ipadd = req.getRemoteAddr();
        dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		
		dm.print();
		
		ds = (HD_SALY_3201_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_saly_3202_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_3202_LDataSet ds = null;
		HD_SALY_3202_LDM dm = new HD_SALY_3202_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));

		dm.print();
		
		ds = (HD_SALY_3202_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_saly_3203_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_3203_LDataSet ds = null;
		HD_SALY_3203_LDM dm = new HD_SALY_3203_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.saly_yy = Util.checkString(req.getParameter("saly_yy"));
		dm.saly_no = Util.checkString(req.getParameter("saly_no"));
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));

		dm.print();
		
		ds = (HD_SALY_3203_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_saly_4000_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_4000_LDataSet ds = null;
		HD_SALY_4000_LDM dm = new HD_SALY_4000_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);

		dm.print();
		
		ds = (HD_SALY_4000_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_saly_4001_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_4001_LDataSet ds = null;
		HD_SALY_4001_LDM dm = new HD_SALY_4001_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));

		dm.print();
		
		ds = (HD_SALY_4001_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_saly_4002_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_4002_ADataSet ds = null;
		HD_SALY_4002_ADM dm = new HD_SALY_4002_ADM();

		String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);
		
		//String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
		//System.out.println("multiUpdateData=" + multiUpdateData );
		//String[] converted = convertMultiUpdateData(multiUpdateData);

		//System.out.println("length=" + converted.length);
		//System.out.println("length=" + converted);
		
		dm.mode = ((String) hash.get("m")).toUpperCase();
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = (String)hash.get("emp_no");
		dm.lon_clsf_cd = (String)hash.get("lon_clsf_cd");
		dm.lon_dt = (String)hash.get("lon_dt");
		dm.flnm = (String)hash.get("nm_korn");
		dm.repay_months = (String)hash.get("repay_months");
		dm.lon_prcp = (String)hash.get("lon_prcp");
		dm.yy_int_rate = (String)hash.get("yy_int_rate");
		dm.lon_no = (String)hash.get("lon_no");
		dm.mm_pymt_dt = (String)hash.get("mm_pymt_dt");
		dm.mm_pymt_prcp = (String)hash.get("mm_pymt_prcp");
		dm.pymt_acml_tms = (String)hash.get("pymt_acml_tms");
		dm.rmn_amt = (String)hash.get("rmn_amt");
		dm.end_yn = (String)hash.get("end_yn");
		dm.end_dt = (String)hash.get("end_dt");
		dm.u_ipadd =  req.getRemoteAddr();
		dm.u_id = Util.getSessionParameterValue(req,"emp_no",true);

		dm.print();
		
		ds = (HD_SALY_4002_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_saly_4003_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_4003_LDataSet ds = null;
		HD_SALY_4003_LDM dm = new HD_SALY_4003_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.lon_clsf_cd = Util.checkString(req.getParameter("lon_clsf_cd"));
		dm.st_dduc_dt_max = Util.checkString(req.getParameter("st_dduc_dt_max"));
		dm.et_dduc_dt_max = Util.checkString(req.getParameter("et_dduc_dt_max"));
		dm.proc_clsf = Util.checkString(req.getParameter("proc_clsf"));
		dm.st_lon_dt = Util.checkString(req.getParameter("st_lon_dt"));
		dm.et_lon_dt = Util.checkString(req.getParameter("et_lon_dt"));
		dm.end_yn = Util.checkString(req.getParameter("end_yn"));

		dm.print();
		
		ds = (HD_SALY_4003_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_saly_4004_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_4004_ADataSet ds = null;
		HD_SALY_4004_ADM dm = new HD_SALY_4004_ADM();

		String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
		System.out.println("multiUpdateData=" + multiUpdateData );
		String[] converted = convertMultiUpdateData(multiUpdateData);

		System.out.println("length=" + converted.length);
		System.out.println("length=" + converted);

		
		String mode          = converted[0];            
		String cmpy_cd       = converted[9];            
		String emp_no        = converted[10];            
		String lon_clsf_cd   = converted[11];            
		String lon_dt        = converted[12];            
		String dduc_seq      = converted[5];            
		String flnm          = converted[13];            
		String proc_clsf     = converted[6];            
		String dduc_dt       = converted[2];            
		String saly_yy       = converted[7];            
		String saly_no       = converted[8];            
		String prcp_dduc_amt = converted[3];            
		String int_dduc_amt  = converted[4];            
		
		dm.setMode(mode.toUpperCase());
		dm.setCmpy_cd(cmpy_cd);
		dm.setEmp_no(emp_no);
		dm.setLon_clsf_cd(lon_clsf_cd);
		dm.setLon_dt(lon_dt);
		dm.setDduc_seq(dduc_seq);
		dm.setFlnm(flnm);
		dm.setProc_clsf(proc_clsf);
		dm.setDduc_dt(dduc_dt);
		dm.setSaly_no(saly_no);
		dm.setSaly_yy(saly_yy);
		dm.setPrcp_dduc_amt(prcp_dduc_amt);
		dm.setInt_dduc_amt(int_dduc_amt);
		
		//dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.u_ipadd =  req.getRemoteAddr();
		dm.u_id = Util.getSessionParameterValue(req,"emp_no",true);
		
		dm.print();
		
		ds = (HD_SALY_4004_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_saly_4005_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_4005_LDataSet ds = null;
		HD_SALY_4005_LDM dm = new HD_SALY_4005_LDM();

		//dm.cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.lon_clsf_cd = Util.checkString(req.getParameter("lon_clsf_cd"));
		dm.lon_dt = Util.checkString(req.getParameter("lon_dt"));
		//dm.st_dduc_dt = Util.checkString(req.getParameter("st_dduc_dt"));
		//dm.et_dduc_dt = Util.checkString(req.getParameter("et_dduc_dt"));

		dm.print();
		
		ds = (HD_SALY_4005_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_saly_4100_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_4100_LDataSet ds = null;
		HD_SALY_4100_LDM dm = new HD_SALY_4100_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));

		dm.print();
		
		ds = (HD_SALY_4100_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}

	
	public void hd_saly_3300_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_3300_ADataSet ds = null;
		HD_SALY_3300_ADM dm = new HD_SALY_3300_ADM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.saly_yy = Util.checkString(req.getParameter("saly_yy"));
		dm.saly_no = Util.checkString(req.getParameter("saly_no"));
		dm.saly_pay_dt = Util.checkString(req.getParameter("saly_pay_dt"));
		dm.year_rfl_yn = Util.checkString(req.getParameter("year_yn"));
		dm.incmg_pers_ipadd = req.getRemoteAddr();
        dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);

		dm.print();
		
		ds = (HD_SALY_3300_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}

	public void hd_saly_3300_334_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_3300_334_ADataSet ds = null;
		HD_SALY_3300_334_ADM dm = new HD_SALY_3300_334_ADM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.saly_yy = Util.checkString(req.getParameter("saly_yy"));
		dm.saly_no = Util.checkString(req.getParameter("saly_no"));
		dm.saly_pay_dt = Util.checkString(req.getParameter("saly_pay_dt"));
		dm.year_rfl_yn = Util.checkString(req.getParameter("year_yn"));
		dm.incmg_pers_ipadd = req.getRemoteAddr();
        dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);

		dm.print();
		
		ds = (HD_SALY_3300_334_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	public void hd_saly_3300_a_gysg (HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_3300_A_GYSGDataSet ds = null;
		HD_SALY_3300_A_GYSGDM dm = new HD_SALY_3300_A_GYSGDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.saly_yy = Util.checkString(req.getParameter("saly_yy"));
		dm.saly_no = Util.checkString(req.getParameter("saly_no"));
		dm.saly_pay_dt = Util.checkString(req.getParameter("saly_pay_dt"));
		dm.year_rfl_yn = Util.checkString(req.getParameter("year_yn"));
		dm.incmg_pers_ipadd = req.getRemoteAddr();
        dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);

		dm.print();
		
		ds = (HD_SALY_3300_A_GYSGDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_saly_3302_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_3302_ADataSet ds = null;
		HD_SALY_3302_ADM dm = new HD_SALY_3302_ADM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.saly_yy = Util.checkString(req.getParameter("saly_yy"));
		dm.saly_no = Util.checkString(req.getParameter("saly_no"));
		dm.incmg_pers_ipadd = req.getRemoteAddr();
        dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);

		dm.print();
		
		ds = (HD_SALY_3302_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	

	public void hd_saly_3303_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_3303_ADataSet ds = null;
		HD_SALY_3303_ADM dm = new HD_SALY_3303_ADM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.saly_yy = Util.checkString(req.getParameter("saly_yy"));
		dm.saly_no = Util.checkString(req.getParameter("saly_no"));
		dm.saly_pay_dt = Util.checkString(req.getParameter("saly_pay_dt"));
		dm.incmg_pers_ipadd = req.getRemoteAddr();
        dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);

		dm.print();
		
		ds = (HD_SALY_3303_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}	
	
	//경제아이용 급여세금계산-전표생성_20150416
	public void hd_saly_3303_334_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_3303_334_ADataSet ds = null;
		HD_SALY_3303_334_ADM dm = new HD_SALY_3303_334_ADM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.saly_yy = Util.checkString(req.getParameter("saly_yy"));
		dm.saly_no = Util.checkString(req.getParameter("saly_no"));
		dm.saly_pay_dt = Util.checkString(req.getParameter("saly_pay_dt"));
		dm.incmg_pers_ipadd = req.getRemoteAddr();
        dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);

		dm.print();
		
		ds = (HD_SALY_3303_334_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}	
	

	public void hd_saly_3304_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_3304_ADataSet ds = null;
		HD_SALY_3304_ADM dm = new HD_SALY_3304_ADM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.saly_yy = Util.checkString(req.getParameter("saly_yy"));
		dm.saly_no = Util.checkString(req.getParameter("saly_no"));
		dm.saly_pay_dt = Util.checkString(req.getParameter("saly_pay_dt"));
		dm.incmg_pers_ipadd = req.getRemoteAddr();
        dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);

		dm.print();
		
		ds = (HD_SALY_3304_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);

	}
	public void hd_saly_3305_d(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_3305_DDataSet ds = null;
		HD_SALY_3305_DDM dm = new HD_SALY_3305_DDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.saly_yy = Util.checkString(req.getParameter("saly_yy"));
		dm.saly_no = Util.checkString(req.getParameter("saly_no"));
		dm.incmg_pers_ipadd = req.getRemoteAddr();
        dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);

		dm.print();
		
		ds = (HD_SALY_3305_DDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}	
	

	public void hd_saly_3306_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_3306_ADataSet ds = null;
		HD_SALY_3306_ADM dm = new HD_SALY_3306_ADM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.saly_yy = Util.checkString(req.getParameter("saly_yy"));
		dm.saly_no = Util.checkString(req.getParameter("saly_no"));
		dm.saly_pay_dt = Util.checkString(req.getParameter("saly_pay_dt"));
		dm.incmg_pers_ipadd = req.getRemoteAddr();
        dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);

		dm.print();
		
		ds = (HD_SALY_3306_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}	
	

	public void hd_saly_3307_d(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_3307_DDataSet ds = null;
		HD_SALY_3307_DDM dm = new HD_SALY_3307_DDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.saly_yy = Util.checkString(req.getParameter("saly_yy"));
		dm.saly_no = Util.checkString(req.getParameter("saly_no"));
		dm.saly_pay_dt = Util.checkString(req.getParameter("saly_pay_dt"));
		dm.incmg_pers_ipadd = req.getRemoteAddr();
        dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);

		dm.print();
		
		ds = (HD_SALY_3307_DDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}	
	

	public void hd_saly_3308_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_3308_ADataSet ds = null;
		HD_SALY_3308_ADM dm = new HD_SALY_3308_ADM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.saly_yy = Util.checkString(req.getParameter("saly_yy"));
		dm.saly_no = Util.checkString(req.getParameter("saly_no"));
		dm.saly_pay_dt = Util.checkString(req.getParameter("saly_pay_dt"));
		dm.incmg_pers_ipadd = req.getRemoteAddr();
        dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);

		dm.print();
		
		ds = (HD_SALY_3308_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}	
	

	public void hd_saly_3309_d(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_3309_DDataSet ds = null;
		HD_SALY_3309_DDM dm = new HD_SALY_3309_DDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.saly_yy = Util.checkString(req.getParameter("saly_yy"));
		dm.saly_no = Util.checkString(req.getParameter("saly_no"));
		dm.saly_pay_dt = Util.checkString(req.getParameter("saly_pay_dt"));
		dm.incmg_pers_ipadd = req.getRemoteAddr();
        dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.print();
		
		ds = (HD_SALY_3309_DDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}	
	

	public void hd_saly_3310_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_3310_LDataSet ds = null;
		HD_SALY_3310_LDM dm = new HD_SALY_3310_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.saly_yy = Util.checkString(req.getParameter("saly_yy"));
		dm.saly_no = Util.checkString(req.getParameter("saly_no"));

		dm.print();
		
		ds = (HD_SALY_3310_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}	
	

	public void hd_saly_3311_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_3311_LDataSet ds = null;
		HD_SALY_3311_LDM dm = new HD_SALY_3311_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.saly_yy = Util.checkString(req.getParameter("saly_yy"));
		dm.saly_no = Util.checkString(req.getParameter("saly_no"));
		dm.saly_pay_dt = Util.checkString(req.getParameter("saly_pay_dt"));
		dm.tmp_clsf = Util.checkString(req.getParameter("tmp_clsf"));

		dm.print();
		
		ds = (HD_SALY_3311_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	

	public void hd_saly_3312_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_3312_LDataSet ds = null;
		HD_SALY_3312_LDM dm = new HD_SALY_3312_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.saly_yy = Util.checkString(req.getParameter("saly_yy"));
		dm.saly_no = Util.checkString(req.getParameter("saly_no"));
		dm.saly_pay_dt = Util.checkString(req.getParameter("saly_pay_dt"));
		dm.tmp_clsf = Util.checkString(req.getParameter("tmp_clsf"));

		dm.print();
		
		ds = (HD_SALY_3312_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}	
	
	public void hd_saly_3313_p(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_3313_PDataSet ds = null;
		HD_SALY_3313_PDM dm = new HD_SALY_3313_PDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.saly_yy = Util.checkString(req.getParameter("saly_yy"));
		dm.saly_no = Util.checkString(req.getParameter("saly_no"));
		dm.saly_pay_dt = Util.checkString(req.getParameter("saly_pay_dt"));

		dm.print();
		
		ds = (HD_SALY_3313_PDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	
	public void hd_saly_3315_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_3315_ADataSet ds = null;
		HD_SALY_3315_ADM dm = new HD_SALY_3315_ADM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.saly_yy = Util.checkString(req.getParameter("saly_yy"));
		dm.saly_no = Util.checkString(req.getParameter("saly_no"));
		dm.saly_pay_dt = Util.checkString(req.getParameter("saly_pay_dt"));
		dm.tmp_clsf = Util.checkString(req.getParameter("tmp_clsf"));
        dm.incmg_pers_ipadd = req.getRemoteAddr();
        dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);

		dm.print();
		
		ds = (HD_SALY_3315_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_saly_3317_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_3317_LDataSet ds = null;
		HD_SALY_3317_LDM dm = new HD_SALY_3317_LDM();


		dm.print();
		
		ds = (HD_SALY_3317_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	
	
	public void hd_saly_3330(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_3330_ADataSet ds = null;
		HD_SALY_3330_ADM dm = new HD_SALY_3330_ADM();

		String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);
		
		dm.mode = ((String)hash.get("m")).toUpperCase();
		dm.emp_no = (String)hash.get("emp_no");
		dm.saly_yy = (String)hash.get("saly_yy");
		dm.saly_no = (String)hash.get("saly_no"); 
		dm.saly_pay_dt = (String)hash.get("saly_pay_dt");		
		dm.flnm  = (String)hash.get("flnm"); 
		dm.dept_cd = (String)hash.get("dept_cd"); 
		dm.base_saly = (String)hash.get("base_saly"); 
		dm.posi_saly = (String)hash.get("posi_saly"); 
		dm.vgl_fee = (String)hash.get("vgl_fee");
		dm.week_hody_base_alon = (String)hash.get("week_hody_base_alon");
		dm.week_hody_cmpn_alon = (String)hash.get("week_hody_cmpn_alon");
		dm.prvmm_mstk_saly  = (String)hash.get("prvmm_mstk_saly");
		dm.prvmm_mstk_alon = (String)hash.get("prvmm_mstk_alon");
		dm.deci_incm_tax = (String)hash.get("deci_incm_tax");
		dm.deci_res_tax = (String)hash.get("deci_res_tax"); 
		dm.adjm_deci_incm_tax = (String)hash.get("adjm_deci_incm_tax");
		dm.adjm_deci_res_tax = (String)hash.get("adjm_deci_res_tax"); 
		dm.np_slf_ctrb_amt = (String)hash.get("np_slf_ctrb_amt");
		dm.hlth_insr_fee = (String)hash.get("hlth_insr_fee");
		dm.emp_insr_fee = (String)hash.get("emp_insr_fee");
		dm.cal_pay_amt = (String)hash.get("cal_pay_amt");
		dm.tot_pay_saly = (String)hash.get("tot_pay_saly");
		dm.saly_dduc_stot = (String)hash.get("saly_dduc_stot");
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
        dm.incmg_pers_ipadd = req.getRemoteAddr();
 //       dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.print();
		
		ds = (HD_SALY_3330_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
		
	}
	
	
	public void hd_saly_3331(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_3331_ADataSet ds = null;
		HD_SALY_3331_ADM dm = new HD_SALY_3331_ADM();

		String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);
		
		dm.mode = ((String)hash.get("m")).toUpperCase();
		dm.emp_no = (String)hash.get("emp_no");
		dm.saly_yy = (String)hash.get("saly_yy");
		dm.saly_no = (String)hash.get("saly_no"); 
		dm.saly_pay_dt = (String)hash.get("saly_pay_dt");		
		dm.flnm  = (String)hash.get("flnm"); 
		dm.saly_clsf  = (String)hash.get("saly_clsf"); 
		dm.dept_cd    = (String)hash.get("dept_cd"); 
		dm.base_saly = (String)hash.get("base_saly"); 
		dm.evngt_saly = (String)hash.get("evngt_saly"); 
		dm.supl_saly = (String)hash.get("supl_saly"); 
		dm.posk_saly = (String)hash.get("posk_saly"); 
		dm.rgla_saly  = (String)hash.get("rgla_saly");
		dm.real_pay_rgla_saly = (String)hash.get("real_pay_rgla_saly");
		dm.week_hody_base_alon = (String)hash.get("week_hody_base_alon");
		dm.week_hody_cmpn_alon = (String)hash.get("week_hody_cmpn_alon");
		dm.lgl_hody_base_alon = (String)hash.get("lgl_hody_base_alon");
		dm.lgl_hody_cmpn_alon = (String)hash.get("lgl_hody_cmpn_alon");
		dm.nissu_dd_alon = (String)hash.get("nissu_dd_alon");
		dm.vgl_fee = (String)hash.get("vgl_fee");
		dm.non_regu_alon_stot = (String)hash.get("non_regu_alon_stot");
		dm.tot_pay_saly = (String)hash.get("tot_pay_saly");
		
		dm.non_tax_yn_frnc = (String)hash.get("non_tax_yn_frnc");
		dm.non_tax_frnc = (String)hash.get("non_tax_frnc");
		dm.non_tax_yn_jrnst = (String)hash.get("non_tax_yn_jrnst");
		dm.non_tax_jrnst = (String)hash.get("non_tax_jrnst");
		dm.non_tax_stot = (String)hash.get("non_tax_stot");
		
		dm.impt_saly = (String)hash.get("impt_saly");
		dm.deci_incm_tax = (String)hash.get("deci_incm_tax");
		dm.deci_res_tax = (String)hash.get("deci_res_tax"); 
		dm.adjm_dedu_incm_tax = (String)hash.get("adjm_dedu_incm_tax");
		dm.adjm_dedu_res_tax = (String)hash.get("adjm_dedu_res_tax"); 
		
		dm.np_slf_ctrb_amt = (String)hash.get("np_slf_ctrb_amt");
		dm.np_cmpy_burd_amt = (String)hash.get("np_cmpy_burd_amt");
		dm.hlth_insr_fee = (String)hash.get("hlth_insr_fee");
		dm.hlth_insr_med_care_insr_fee = (String)hash.get("hlth_insr_med_care_insr_fee");
		dm.emp_insr_fee = (String)hash.get("emp_insr_fee");
		dm.cal_pay_amt = (String)hash.get("cal_pay_amt");
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
        dm.incmg_pers_ipadd = req.getRemoteAddr();
 //       dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.print();
		
		ds = (HD_SALY_3331_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
		
	}
	
	public void hd_saly_3332_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_3332_MDataSet ds = null;
		HD_SALY_3332_MDM dm = new HD_SALY_3332_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.print();

		ds = (HD_SALY_3332_MDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_saly_3350_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_3350_ADataSet ds = null;
		HD_SALY_3350_ADM dm = new HD_SALY_3350_ADM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.saly_yy = Util.checkString(req.getParameter("saly_yy"));
		dm.saly_no = Util.checkString(req.getParameter("saly_no"));
		dm.saly_pay_dt = Util.checkString(req.getParameter("saly_pay_dt"));
		dm.year_rfl_yn = Util.checkString(req.getParameter("year_yn"));
		dm.incmg_pers_ipadd = req.getRemoteAddr();
        dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);

		dm.print();
		
		ds = (HD_SALY_3350_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_saly_4101_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_4101_LDataSet ds = null;
		HD_SALY_4101_LDM dm = new HD_SALY_4101_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));

		dm.print();
		
		ds = (HD_SALY_4101_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	

	public void hd_saly_4102_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_4102_ADataSet ds = null;
		HD_SALY_4102_ADM dm = new HD_SALY_4102_ADM();
      
		 System.out.println("안 타나?");
		dm.mode = Util.checkString(req.getParameter("mode"));
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.nm_korn = Util.checkString(req.getParameter("nm_korn"));
		dm.lon_clsf_cd = Util.checkString(req.getParameter("lon_clsf_cd"));
		dm.lon_dt = Util.checkString(req.getParameter("lon_dt"));
		dm.bhbhyb = Util.checkString(req.getParameter("bhbhyb"));
		dm.bogaamt = Util.checkString(req.getParameter("bogaamt"));
		dm.bhnosabeon = Util.checkString(req.getParameter("bhnosabeon"));
		dm.add_bogaamt = Util.checkString(req.getParameter("add_bogaamt"));
		dm.add_bhnosabeon = Util.checkString(req.getParameter("add_bhnosabeon"));
		dm.u_ipadd = Util.checkString(req.getParameter("u_ipadd"));
		dm.u_id = Util.checkString(req.getParameter("u_id"));
		
		dm.print();
		ds = (HD_SALY_4102_ADataSet)manager.executeCall(dm);
		
	
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	public void hd_saly_4103_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_4103_LDataSet ds = null;
		HD_SALY_4103_LDM dm = new HD_SALY_4103_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.lon_clsf_cd = Util.checkString(req.getParameter("lon_clsf_cd"));
		dm.lon_dt = Util.checkString(req.getParameter("lon_dt"));
		
		ds = (HD_SALY_4103_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}

	public void hd_saly_4302_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_4302_ADataSet ds = null;
		HD_SALY_4302_ADM dm = new HD_SALY_4302_ADM();

		String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
		System.out.println("multiUpdateData=" + multiUpdateData );
		String[] converted = convertMultiUpdateData(multiUpdateData);

		System.out.println("length=" + converted.length);
		System.out.println("length=" + converted);

		
		
		String mode          		= converted[0];            
		String cmpy_cd 			 	= converted[26];
		String acpn_yy 			 	= converted[7];
		String acpn_seq 			= converted[8];
		String acpn_dt 				= converted[9];
		String emp_no 				= converted[3];
		String flnm 				= converted[4];
		String dept_cd 				= converted[27];
		String now_seiz_clsf 		= converted[10];
		String fst_seiz_clsf 		= converted[11];
		String seiz_deci_dt 		= converted[12];
		String seiz_clsf_chg_dt  	= converted[13];
		String crdtor 				= converted[14];
		String seiz_clam_amt 		= converted[15];
		String seiz_dduc_ratio 	 	= converted[16];
		String seiz_bgn_saly_yy  	= converted[17];
		String seiz_bgn_saly_no  	= converted[18];
		String dduc_amt_agg 		= converted[19];
		String repay_amt_agg 		= converted[20];
		String psdo_seiz_rels_dt 	= converted[21];
		String dduc_end_yn 			= converted[22];
		String dduc_end_dt 			= converted[24];
		String repay_end_yn 		= converted[23];
		String repay_end_dt 		= converted[25];
		
		dm.setMode(mode.toUpperCase());
		//dm.setCmpy_cd(cmpy_cd);
		dm.setAcpn_yy(acpn_yy);
		dm.setAcpn_seq(acpn_seq);
		dm.setAcpn_dt(acpn_dt);
		dm.setEmp_no(emp_no);
		dm.setFlnm(flnm);
		dm.setDept_cd(dept_cd);
		dm.setNow_seiz_clsf(now_seiz_clsf);
		dm.setFst_seiz_clsf(fst_seiz_clsf);
		dm.setSeiz_deci_dt(seiz_deci_dt);
		dm.setSeiz_clsf_chg_dt(seiz_clsf_chg_dt);
		dm.setCrdtor(crdtor);
		dm.setSeiz_clam_amt(seiz_clam_amt);
		dm.setSeiz_dduc_ratio(seiz_dduc_ratio);
		dm.setSeiz_bgn_saly_yy(seiz_bgn_saly_yy);
		dm.setSeiz_bgn_saly_no(seiz_bgn_saly_no);
		dm.setDduc_amt_agg(dduc_amt_agg);
		dm.setRepay_amt_agg(repay_amt_agg);
		dm.setPsdo_seiz_rels_dt(psdo_seiz_rels_dt);
		dm.setDduc_end_yn(dduc_end_yn);
		dm.setDduc_end_dt(dduc_end_dt);
		dm.setRepay_end_yn(repay_end_yn);
		dm.setRepay_end_dt(repay_end_dt);
		
		dm.cmpy_cd =  Util.getSessionParameterValue(req,"cmpycd",true);
		dm.u_ipadd = Util.checkString(req.getParameter("u_ipadd"));
		dm.u_id = Util.checkString(req.getParameter("u_id"));

		dm.print();
		
		ds = (HD_SALY_4302_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_saly_4300_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_4300_LDataSet ds = null;
		HD_SALY_4300_LDM dm = new HD_SALY_4300_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		
		dm.print();
		
		ds = (HD_SALY_4300_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	public void hd_saly_4301_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_4301_LDataSet ds = null;
		HD_SALY_4301_LDM dm = new HD_SALY_4301_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.seiz_clsf = Util.checkString(req.getParameter("seiz_clsf"));
		dm.st_acpn_dt = Util.checkString(req.getParameter("st_acpn_dt"));
		dm.et_acpn_dt = Util.checkString(req.getParameter("et_acpn_dt"));

		dm.print();
		
		ds = (HD_SALY_4301_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_saly_4304_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_4304_ADataSet ds = null;
		HD_SALY_4304_ADM dm = new HD_SALY_4304_ADM();
		
		String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.mode = ((String)hash.get("m")).toUpperCase();
		dm.acpn_yy = (String)hash.get("acpn_yy");
		dm.acpn_seq = (String)hash.get("acpn_seq");
		dm.seiz_dduc_tms = (String)hash.get("seiz_dduc_tms");
		dm.proc_clsf = (String)hash.get("proc_clsf");
		dm.dduc_dt = (String)hash.get("dduc_dt");
		dm.seiz_dduc_amt = (String)hash.get("seiz_dduc_amt");
		dm.emp_no = (String)hash.get("emp_no");
		dm.flnm = (String)hash.get("flnm");
		dm.dept_cd = (String)hash.get("dept_cd");

        dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.u_ipadd = req.getRemoteAddr();
		dm.u_id = Util.getSessionParameterValue(req, "emp_no", true);

		dm.print();
		
		ds = (HD_SALY_4304_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	public void hd_saly_4303_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_4303_LDataSet ds = null;
		HD_SALY_4303_LDM dm = new HD_SALY_4303_LDM();

		//dm.cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.acpn_yy = Util.checkString(req.getParameter("acpn_yy"));
		dm.acpn_seq = Util.checkString(req.getParameter("acpn_seq"));
		dm.st_repay_dt = Util.checkString(req.getParameter("st_repay_dt"));
		dm.et_repay_dt = Util.checkString(req.getParameter("et_repay_dt"));

		dm.print();
		
		ds = (HD_SALY_4303_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_saly_4200_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_4200_LDataSet ds = null;
		HD_SALY_4200_LDM dm = new HD_SALY_4200_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);

		dm.print();
		
		ds = (HD_SALY_4200_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_saly_3400_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_3400_ADataSet ds = null;
		HD_SALY_3400_ADM dm = new HD_SALY_3400_ADM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.saly_yy = Util.checkString(req.getParameter("saly_yy"));
		dm.saly_no = Util.checkString(req.getParameter("saly_no"));
		dm.saly_pay_dt = Util.checkString(req.getParameter("saly_pay_dt"));
		dm.incmg_pers_ipadd = req.getRemoteAddr();
        dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);

		dm.print();
		
		ds = (HD_SALY_3400_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_saly_3401_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_3401_ADataSet ds = null;
		HD_SALY_3401_ADM dm = new HD_SALY_3401_ADM();
		
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.saly_yy = Util.checkString(req.getParameter("saly_yy"));
		dm.saly_no = Util.checkString(req.getParameter("saly_no"));
		dm.incmg_pers_ipadd = req.getRemoteAddr();
        dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		
		dm.print();
		
		ds = (HD_SALY_3401_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_saly_3402_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_3402_MDataSet ds = null;
		HD_SALY_3402_MDM dm = new HD_SALY_3402_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.print();

		ds = (HD_SALY_3402_MDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_saly_4201_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_4201_ADataSet ds = null;
		HD_SALY_4201_ADM dm = new HD_SALY_4201_ADM();

		

		String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
		System.out.println("multiUpdateData=" + multiUpdateData );
		String[] converted = convertMultiUpdateData(multiUpdateData);

		System.out.println("length=" + converted.length);
		System.out.println("length=" + converted);

		
		String mode		 	  =	converted[0];
		String cmpy_cd        = converted[18];
		String emp_no         = converted[3];
		String adv_clsf       = converted[9];
		String adv_dt         = converted[7];
		String flnm           = converted[4];
		String mtry_months    = converted[10];
		String adv_prcp       = converted[11];
		String mm_pymt_prcp   = converted[14];
		String pymt_acml_tms  = converted[15];
		String rmn_amt        = converted[13];
		String end_yn         = converted[8];
		String end_dt         = converted[16];

		
		
		dm.setMode(mode.toUpperCase());
		dm.setCmpy_cd(cmpy_cd);
		dm.setEmp_no(emp_no);
		dm.setAdv_clsf(adv_clsf);
		dm.setAdv_dt(adv_dt);
		dm.setFlnm(flnm);
		dm.setMtry_months(mtry_months);
		dm.setAdv_prcp(adv_prcp);
		dm.setMm_pymt_prcp(mm_pymt_prcp);
		dm.setPymt_acml_tms(pymt_acml_tms);
		dm.setEnd_yn(end_yn);
		dm.setEnd_dt(end_dt);
		dm.setRmn_amt(rmn_amt);
		
		dm.u_ipadd =  req.getRemoteAddr();
		dm.u_id = Util.getSessionParameterValue(req,"emp_no",true);

		
		ds = (HD_SALY_4201_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_saly_4202_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_4202_LDataSet ds = null;
		HD_SALY_4202_LDM dm = new HD_SALY_4202_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.lon_clsf_cd = Util.checkString(req.getParameter("lon_clsf_cd"));
		dm.st_lon_dt = Util.checkString(req.getParameter("st_lon_dt"));
		dm.et_lon_dt = Util.checkString(req.getParameter("et_lon_dt"));
		dm.end_yn = Util.checkString(req.getParameter("end_yn"));

		dm.print();
		
		ds = (HD_SALY_4202_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
 
	public void hd_saly_4500_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_4500_ADataSet ds = null;
		HD_SALY_4500_ADM dm = new HD_SALY_4500_ADM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.saly_yy = Util.checkString(req.getParameter("saly_yy"));
		dm.saly_pay_dt = Util.checkString(req.getParameter("saly_pay_dt"));
		dm.incmg_pers_ipadd = req.getRemoteAddr();
        dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		
		dm.print();
		
		ds = (HD_SALY_4500_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_saly_1600_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_1600_LDataSet ds = null;
		HD_SALY_1600_LDM dm = new HD_SALY_1600_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.nm_korn = Util.checkString(req.getParameter("nm_korn"));

		dm.print();
		
		ds = (HD_SALY_1600_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_saly_1601_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_1601_LDataSet ds = null;
		HD_SALY_1601_LDM dm = new HD_SALY_1601_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.saly_yy = Util.checkString(req.getParameter("saly_yy"));

		dm.print();
		
		ds = (HD_SALY_1601_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_saly_1602_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_1602_LDataSet ds = null;
		HD_SALY_1602_LDM dm = new HD_SALY_1602_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.saly_yy = Util.checkString(req.getParameter("saly_yy"));

		dm.print();
		
		ds = (HD_SALY_1602_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_saly_1603_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_1603_ADataSet ds = null;
		HD_SALY_1603_ADM dm = new HD_SALY_1603_ADM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.non_tax_yn_frnc = Util.checkString(req.getParameter("non_tax_yn_frnc"));
		dm.non_tax_yn_jrnst = Util.checkString(req.getParameter("non_tax_yn_jrnst"));
		dm.incmg_pers_ipadd = req.getRemoteAddr();
        dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		
		dm.print();
		
		ds = (HD_SALY_1603_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_saly_1604_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_1604_MDataSet ds = null;
		HD_SALY_1604_MDM dm = new HD_SALY_1604_MDM();
		
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		
		dm.print();
		
		ds = (HD_SALY_1604_MDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
			System.out.println("DAO..error.");
			throw new AppException(ds.errcode, ds.errmsg);
		}
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_saly_1700_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_1700_LDataSet ds = null;
		HD_SALY_1700_LDM dm = new HD_SALY_1700_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.saly_yy = Util.checkString(req.getParameter("saly_yy"));
		dm.incmg_pers_ipadd = req.getRemoteAddr();
        dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);

		dm.print();
		
		ds = (HD_SALY_1700_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	
	public void hd_saly_1700_500_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_1700_500_LDataSet ds = null;
		HD_SALY_1700_500_LDM dm = new HD_SALY_1700_500_LDM();
		System.out.println("11111111111111");
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.basi_dt = Util.checkString(req.getParameter("basi_dt"));
		dm.incmg_pers_ipadd = req.getRemoteAddr();
        dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        System.out.println("222222222");
		dm.print(); 
		
		ds = (HD_SALY_1700_500_LDataSet)manager.executeCall(dm);
		System.out.println("333333333");
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	
	public void hd_saly_1701_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_1701_LDataSet ds = null;
		HD_SALY_1701_LDM dm = new HD_SALY_1701_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.saly_yy = Util.checkString(req.getParameter("saly_yy"));
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		
		dm.print();
		
		ds = (HD_SALY_1701_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_saly_1701_500_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_1701_500_LDataSet ds = null;
		HD_SALY_1701_500_LDM dm = new HD_SALY_1701_500_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.saly_yy_fr = Util.checkString(req.getParameter("saly_yy_fr"));
		dm.saly_yy_to = Util.checkString(req.getParameter("saly_yy_to"));
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		
		dm.print();
		
		ds = (HD_SALY_1701_500_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_saly_1702_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_1702_ADataSet ds = null;
		HD_SALY_1702_ADM dm = new HD_SALY_1702_ADM();
		
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdate"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);
		System.out.println("=====================================================================================");
		System.out.println(multiUpdateData);
		System.out.println("=====================================================================================");
		
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.mode = ((String)hash.get("m")).toUpperCase();
		dm.saly_yy = (String)hash.get("saly_yy");
		dm.emp_no = (String)hash.get("emp_no");
		dm.rslt_pay = (String)hash.get("rslt_pay");
		dm.year_alon = (String)hash.get("year_alon");
		dm.hody_alon = (String)hash.get("hody_alon");
		dm.vgl_fee = (String)hash.get("vgl_fee");
		dm.snk_fee = (String)hash.get("snk_fee");
		dm.dd_subj_sel_fee = (String)hash.get("dd_subj_sel_fee");
		dm.cnfr_fee = (String)hash.get("cnfr_fee");
		dm.real_subj_sel_fee = (String)hash.get("real_subj_sel_fee");
		dm.erl_prsnt_alon = (String)hash.get("erl_prsnt_alon");
		dm.movm_fee = (String)hash.get("movm_fee");
		dm.dspch_dd_fee = (String)hash.get("dspch_dd_fee");
		dm.cmpy_burd_np_amt = (String)hash.get("cmpy_burd_np_amt");
		dm.cmpy_burd_hlth_insr_fee = (String)hash.get("cmpy_burd_hlth_insr_fee");
		dm.cmpy_burd_emp_insr_fee = (String)hash.get("cmpy_burd_emp_insr_fee");
		dm.cmpy_burd_dist_insr_fee = (String)hash.get("cmpy_burd_dist_insr_fee");
		dm.corp_card_use_amt = (String)hash.get("corp_card_use_amt");
		dm.olcard_use_amt = (String)hash.get("olcard_use_amt");
		dm.welf_card_use_amt = (String)hash.get("welf_card_use_amt");
		dm.hlth_chk_sply_amt = (String)hash.get("hlth_chk_sply_amt");
		dm.hospz_med_exam_fee = (String)hash.get("hospz_med_exam_fee");
		dm.child_scl_exps = (String)hash.get("child_scl_exps");
		dm.congr_condl_fee = (String)hash.get("congr_condl_fee");
		dm.paty_insr_fee = (String)hash.get("paty_insr_fee");
		dm.condo_use_cmpy_sply_amt = (String)hash.get("condo_use_cmpy_sply_amt");
		dm.posk_edu_fee = (String)hash.get("posk_edu_fee");
		dm.onl_edu_fee = (String)hash.get("onl_edu_fee");
		dm.sclgg_course_edu_fee = (String)hash.get("sclgg_course_edu_fee");
		dm.mba_course_edu_fee = (String)hash.get("mba_course_edu_fee");
		dm.cmpy_sply_stdy_fee = (String)hash.get("cmpy_sply_stdy_fee");
		dm.gc_sply_edu_fee = (String)hash.get("gc_sply_edu_fee");
		dm.incmg_pers_ipadd = req.getRemoteAddr();
        dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);

		dm.print();
		
		ds = (HD_SALY_1702_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_saly_1702_500_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_1702_500_ADataSet ds = null;
		HD_SALY_1702_500_ADM dm = new HD_SALY_1702_500_ADM();
		
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdate"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);
		System.out.println("=====================================================================================");
		System.out.println(multiUpdateData);
		System.out.println("=====================================================================================");
		
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.mode = ((String)hash.get("m")).toUpperCase();
		dm.saly_yy = (String)hash.get("saly_yy");
		dm.emp_no = (String)hash.get("emp_no");
		dm.rslt_pay = (String)hash.get("rslt_pay");
		dm.year_alon = (String)hash.get("year_alon");
		dm.hody_alon = (String)hash.get("hody_alon");
		dm.vgl_fee = (String)hash.get("vgl_fee");
		//dm.snk_fee = (String)hash.get("snk_fee");
		dm.dd_subj_sel_fee = (String)hash.get("dd_subj_sel_fee");
		dm.cnfr_fee = (String)hash.get("cnfr_fee");
		dm.real_subj_sel_fee = (String)hash.get("real_subj_sel_fee");
		dm.erl_prsnt_alon = (String)hash.get("erl_prsnt_alon");
		//dm.movm_fee = (String)hash.get("movm_fee");
		dm.dspch_dd_fee = (String)hash.get("dspch_dd_fee");
		dm.cmpy_burd_np_amt = (String)hash.get("cmpy_burd_np_amt");
		dm.cmpy_burd_hlth_insr_fee = (String)hash.get("cmpy_burd_hlth_insr_fee");
		dm.cmpy_burd_emp_insr_fee = (String)hash.get("cmpy_burd_emp_insr_fee");
		dm.cmpy_burd_dist_insr_fee = (String)hash.get("cmpy_burd_dist_insr_fee");
		dm.corp_card_use_amt = (String)hash.get("corp_card_use_amt");
		dm.olcard_use_amt = (String)hash.get("olcard_use_amt");
		//dm.welf_card_use_amt = (String)hash.get("welf_card_use_amt");
		dm.hlth_chk_sply_amt = (String)hash.get("hlth_chk_sply_amt");
		dm.hospz_med_exam_fee = (String)hash.get("hospz_med_exam_fee");
		dm.child_scl_exps = (String)hash.get("child_scl_exps");
		dm.congr_condl_fee = (String)hash.get("congr_condl_fee");
		dm.paty_insr_fee = (String)hash.get("paty_insr_fee");
		dm.condo_use_cmpy_sply_amt = (String)hash.get("condo_use_cmpy_sply_amt");
		dm.posk_edu_fee = (String)hash.get("posk_edu_fee");
		//dm.onl_edu_fee = (String)hash.get("onl_edu_fee");
		dm.sclgg_course_edu_fee = (String)hash.get("sclgg_course_edu_fee");
		//dm.mba_course_edu_fee = (String)hash.get("mba_course_edu_fee");
		dm.cmpy_sply_stdy_fee = (String)hash.get("cmpy_sply_stdy_fee");
		dm.etc_alon_prize_amt = (String)hash.get("etc_alon_prize_amt");
		dm.etc_alon_show_amt = (String)hash.get("etc_alon_show_amt");
		dm.subj_sel_oli_deal_amt = (String)hash.get("subj_sel_oli_deal_amt");
		dm.make_proc_deal_amt = (String)hash.get("make_proc_deal_amt");
		dm.etc_bns_amt = (String)hash.get("etc_bns_amt");
		dm.etc_evlu_amt = (String)hash.get("etc_evlu_amt");
		dm.etc_etc_amt = (String)hash.get("etc_etc_amt");
		dm.etc_spos_hlth_amt = (String)hash.get("etc_spos_hlth_amt");
		dm.etc_ptph_amt = (String)hash.get("etc_ptph_amt");
		dm.etc_med_exam_amt = (String)hash.get("etc_med_exam_amt");
		dm.etc_child_birth_amt = (String)hash.get("etc_child_birth_amt");
		dm.etc_scl_exps_amt = (String)hash.get("etc_scl_exps_amt");
		dm.etc_drvr_trff_amt = (String)hash.get("etc_drvr_trff_amt");
		dm.etc_cast_amt = (String)hash.get("etc_cast_amt");
		dm.etc_edu_amt = (String)hash.get("etc_edu_amt");
		//dm.gc_sply_edu_fee = (String)hash.get("gc_sply_edu_fee");		
		dm.incmg_pers_ipadd = req.getRemoteAddr();
        dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);

		dm.print();
		
		ds = (HD_SALY_1702_500_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_saly_4203_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_4203_ADataSet ds = null;
		HD_SALY_4203_ADM dm = new HD_SALY_4203_ADM();

		String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
		System.out.println("multiUpdateData=" + multiUpdateData );
		String[] converted = convertMultiUpdateData(multiUpdateData);

		System.out.println("length=" + converted.length);
		System.out.println("length=" + converted);

		
		String mode		 	   = converted[0];
		String dduc_dt       = converted[2];  
		String dduc_amt      = converted[3];  
		String dduc_seq      = converted[4];  
		String proc_clsf     = converted[5];  
		String saly_yy       = converted[6];  
		String saly_no       = converted[7];  
		String cmpy_cd       = converted[8];  
		String emp_no        = converted[9];  
		String adv_clsf     = converted[10];  
		String adv_dt       = converted[11];  
	 


		
		dm.setMode(mode.toUpperCase());
		dm.setDduc_dt(dduc_dt);
		dm.setDduc_amt(dduc_amt);
		dm.setDduc_seq(dduc_seq);
		dm.setProc_clsf(proc_clsf);
		dm.setSaly_yy(saly_yy);
		dm.setSaly_no(saly_no);
		dm.setCmpy_cd(cmpy_cd);
		dm.setEmp_no(emp_no);
		dm.setAdv_clsf(adv_clsf);
		dm.setAdv_dt(adv_dt);
		
		
	
		dm.u_ipadd =  req.getRemoteAddr();
		dm.u_id = Util.getSessionParameterValue(req,"emp_no",true);


		dm.print();
		
		ds = (HD_SALY_4203_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_saly_4204_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_4204_LDataSet ds = null;
		HD_SALY_4204_LDM dm = new HD_SALY_4204_LDM();

		//dm.cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.adv_clsf = Util.checkString(req.getParameter("adv_clsf"));
		dm.adv_dt = Util.checkString(req.getParameter("adv_dt"));
		dm.st_dduc_dt = Util.checkString(req.getParameter("st_dduc_dt"));
		dm.et_dduc_dt = Util.checkString(req.getParameter("et_dduc_dt"));

		dm.print();
		
		ds = (HD_SALY_4204_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_saly_2200_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_2200_ADataSet ds = null;
		HD_SALY_2200_ADM dm = new HD_SALY_2200_ADM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.saly_yy = Util.checkString(req.getParameter("saly_yy"));
		dm.saly_no = Util.checkString(req.getParameter("saly_no"));
		dm.saly_pay_dt = Util.checkString(req.getParameter("saly_pay_dt"));
		dm.appmt_dt = Util.checkString(req.getParameter("appmt_dt"));
		dm.incmg_pers_ipadd = req.getRemoteAddr();
        dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);

		dm.print();
		
		ds = (HD_SALY_2200_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_saly_2201_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_2201_ADataSet ds = null;
		HD_SALY_2201_ADM dm = new HD_SALY_2201_ADM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.saly_yy = Util.checkString(req.getParameter("saly_yy"));
		dm.saly_no = Util.checkString(req.getParameter("saly_no"));
		dm.incmg_pers_ipadd = req.getRemoteAddr();
        dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);

		dm.print();
		
		ds = (HD_SALY_2201_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_saly_2202_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_2202_MDataSet ds = null;
		HD_SALY_2202_MDM dm = new HD_SALY_2202_MDM();

		//dm.cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		
		dm.print();
		
		ds = (HD_SALY_2202_MDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}


	public void hd_saly_2000(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_2000_LDataSet ds = null;
		HD_SALY_2000_LDM dm = new HD_SALY_2000_LDM();

		//dm.cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		
		dm.print();
		
		ds = (HD_SALY_2000_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);

	}


	public void hd_saly_2001(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_2001_LDataSet ds = null;
		HD_SALY_2001_LDM dm = new HD_SALY_2001_LDM();

		//dm.cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.aply_basi_dt = Util.checkString(req.getParameter("aply_basi_dt"));
		
		dm.print();
		
		ds = (HD_SALY_2001_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}


	public void hd_saly_2002(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_SALY_2002_ADataSet ds = null;
		HD_SALY_2002_ADM dm = new HD_SALY_2002_ADM();

		String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);
		
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
        dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.incmg_pers_ip = req.getRemoteAddr();
		dm.aply_basi_dt = Util.checkString(req.getParameter("aply_basi_dt"));        
		dm.new_apst_dt = Util.checkString(req.getParameter("new_apst_dt")); 
		
		dm.mode = ((String)hash.get("m")).toUpperCase();
		dm.seq = (String)hash.get("seq");                 
		dm.dspch_enpr_main_clsf = (String)hash.get("dspch_enpr_main_clsf");
		dm.presi_flnm = (String)hash.get("presi_flnm");          
		dm.eps_no = (String)hash.get("eps_no");
		dm.zip1 = (String)hash.get("zip_1");
		dm.zip2 = (String)hash.get("zip_2");
		dm.addr = (String)hash.get("addr");
		dm.dtls_addr = (String)hash.get("dtls_addr");
		dm.servcost_calc_rate = (String)hash.get("servcost_calc_rate");  
		dm.mang_liab_pers_flnm = (String)hash.get("mang_liab_pers_flnm"); 
		dm.mang_liab_pers_prn = (String)hash.get("mang_liab_pers_prn");  
		
		
		dm.print();
		
		ds = (HD_SALY_2002_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);

	}
	
	public void hd_saly_2003_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_2003_LDataSet ds = null;
		HD_SALY_2003_LDM dm = new HD_SALY_2003_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);

		dm.print();
		
		ds = (HD_SALY_2003_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}

	public void hd_saly_1500_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_1500_LDataSet ds = null;
		HD_SALY_1500_LDM dm = new HD_SALY_1500_LDM();

		dm.cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.saly_yy_nw = Util.checkString(req.getParameter("saly_yy_nw"));
		dm.saly_no_nw = Util.checkString(req.getParameter("saly_no_nw"));
		dm.saly_yy_be = Util.checkString(req.getParameter("saly_yy_be"));
		dm.saly_no_be = Util.checkString(req.getParameter("saly_no_be"));

		dm.print();
		
		ds = (HD_SALY_1500_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_saly_1501_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_1501_MDataSet ds = null;
		HD_SALY_1501_MDM dm = new HD_SALY_1501_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);

		dm.print();
		
		ds = (HD_SALY_1501_MDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
		
	}
	
public void hd_saly_2300_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
	DBManager manager = new DBManager("MISHDL");
		
		HD_SALY_2300_LDataSet ds = null;
		
		String cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		String saly_yy = Util.checkString(req.getParameter("saly_yy"));
		String saly_no = Util.checkString(req.getParameter("saly_no"));	
		
		HD_SALY_2300_LDM dm = new HD_SALY_2300_LDM();
		dm.setCmpy_cd(cmpy_cd);
		dm.setSaly_yy(saly_yy);
		dm.setSaly_no(saly_no);

		dm.print();
		
		ds = (HD_SALY_2300_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}

	public void hd_saly_5002_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_5002_LDataSet ds = null;
		HD_SALY_5002_LDM dm = new HD_SALY_5002_LDM();
	
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.saly_yy = Util.checkString(req.getParameter("saly_yy"));
		dm.saly_no = Util.checkString(req.getParameter("saly_no"));
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		//dm.emp_no = Util.getSessionParameterValue(req, "emp_no", true);
		System.out.println("111111111");
		dm.print();
		System.out.println("222222222");
		ds = (HD_SALY_5002_LDataSet)manager.executeCall(dm);
		System.out.println("333333333");
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	/*경제 I 명세서 조회 */
	public void hd_saly_5002_334_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_5002_334_LDataSet ds = null;
		HD_SALY_5002_334_LDM dm = new HD_SALY_5002_334_LDM();
	
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.saly_yy = Util.checkString(req.getParameter("saly_yy"));
		dm.saly_no = Util.checkString(req.getParameter("saly_no"));
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		//dm.emp_no = Util.getSessionParameterValue(req, "emp_no", true);
	
		dm.print();
		
		ds = (HD_SALY_5002_334_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_saly_5002_2006_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_5002_2006_LDataSet ds = null;
		HD_SALY_5002_2006_LDM dm = new HD_SALY_5002_2006_LDM();
	
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.saly_yy = Util.checkString(req.getParameter("saly_yy"));
		dm.saly_no = Util.checkString(req.getParameter("saly_no"));
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		//dm.emp_no = Util.getSessionParameterValue(req, "emp_no", true);
	
		dm.print();
		
		ds = (HD_SALY_5002_2006_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_saly_5003_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_5003_LDataSet ds = null;
		HD_SALY_5003_LDM dm = new HD_SALY_5003_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		//dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.emp_no = Util.getSessionParameterValue(req, "emp_no", true);

		dm.print();
		
		ds = (HD_SALY_5003_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_saly_5004_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_5004_LDataSet ds = null;
		HD_SALY_5004_LDM dm = new HD_SALY_5004_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.saly_yy = Util.checkString(req.getParameter("saly_yy"));
		dm.saly_no = Util.checkString(req.getParameter("saly_no"));

		dm.print();
		
		ds = (HD_SALY_5004_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_saly_5005_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_5005_LDataSet ds = null;
		HD_SALY_5005_LDM dm = new HD_SALY_5005_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.saly_yy = Util.checkString(req.getParameter("saly_yy"));
		dm.saly_no = Util.checkString(req.getParameter("saly_no"));

		dm.print();
		
		ds = (HD_SALY_5005_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_saly_5008_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_5008_LDataSet ds = null;
		HD_SALY_5008_LDM dm = new HD_SALY_5008_LDM();
	   
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.saly_yy = Util.checkString(req.getParameter("saly_yy"));
		dm.saly_no = Util.checkString(req.getParameter("saly_no"));
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		//dm.emp_no = Util.getSessionParameterValue(req, "emp_no", true);
	
		dm.print();
		
		ds = (HD_SALY_5008_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_saly_3103_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_3103_ADataSet ds = null;
		HD_SALY_3103_ADM dm = new HD_SALY_3103_ADM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.saly_yy = Util.checkString(req.getParameter("saly_yy"));
		dm.saly_no = Util.checkString(req.getParameter("saly_no"));
		dm.incmg_pers_ipadd = req.getRemoteAddr();
        dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        
		dm.print();
		
		ds = (HD_SALY_3103_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
				
		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.saly_yy = (String)hash.get("saly_yy");
		dm.saly_no = (String)hash.get("saly_no");
		dm.incmg_pers_ipadd = (String)hash.get("incmg_pers_ipadd");
		dm.incmg_pers = (String)hash.get("incmg_pers");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.saly_yy = Util.getSessionParameterValue(req,"saly_yy",true);
		dm.saly_no = Util.getSessionParameterValue(req,"saly_no",true);
		dm.incmg_pers_ipadd = Util.getSessionParameterValue(req,"incmg_pers_ipadd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"incmg_pers",true);
		*******************************************************************************************/
	}
	
	public void hd_saly_5006_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_5006_LDataSet ds = null;
		HD_SALY_5006_LDM dm = new HD_SALY_5006_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.saly_yy = Util.checkString(req.getParameter("saly_yy"));

		dm.print();
		
		ds = (HD_SALY_5006_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}

	public void hd_saly_5007_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_5007_MDataSet ds = null;
		HD_SALY_5007_MDM dm = new HD_SALY_5007_MDM();
		
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		
		dm.print();
		
		ds = (HD_SALY_5007_MDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
			System.out.println("DAO..error.");
			throw new AppException(ds.errcode, ds.errmsg);
		}
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_saly_3503_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_3503_LDataSet ds = null;
		HD_SALY_3503_LDM dm = new HD_SALY_3503_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.saly_yy = Util.checkString(req.getParameter("saly_yy"));

		dm.print();
		
		ds = (HD_SALY_3503_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_saly_3502_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_3502_LDataSet ds = null;
		HD_SALY_3502_LDM dm = new HD_SALY_3502_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.saly_yy = Util.checkString(req.getParameter("saly_yy"));

		dm.print();
		
		ds = (HD_SALY_3502_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_saly_3600_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_3600_LDataSet ds = null;
		HD_SALY_3600_LDM dm = new HD_SALY_3600_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.saly_yy = Util.checkString(req.getParameter("saly_yy"));

		dm.print();
		
		ds = (HD_SALY_3600_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_saly_3601_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_3601_LDataSet ds = null;
		HD_SALY_3601_LDM dm = new HD_SALY_3601_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.saly_yy = Util.checkString(req.getParameter("saly_yy"));

		dm.print();
		
		ds = (HD_SALY_3601_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_saly_3602_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_3602_LDataSet ds = null;
		HD_SALY_3602_LDM dm = new HD_SALY_3602_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.saly_yy = Util.checkString(req.getParameter("saly_yy"));

		dm.print();
		
		ds = (HD_SALY_3602_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_saly_3603_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_3603_LDataSet ds = null;
		HD_SALY_3603_LDM dm = new HD_SALY_3603_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.saly_yy = Util.checkString(req.getParameter("saly_yy"));

		dm.print();
		
		ds = (HD_SALY_3603_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_saly_3604_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_3604_LDataSet ds = null;
		HD_SALY_3604_LDM dm = new HD_SALY_3604_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.saly_yy = Util.checkString(req.getParameter("saly_yy"));

		dm.print();
		
		ds = (HD_SALY_3604_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_saly_3605_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_3605_MDataSet ds = null;
		HD_SALY_3605_MDM dm = new HD_SALY_3605_MDM();
		
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		
		dm.print();
		
		ds = (HD_SALY_3605_MDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
			System.out.println("DAO..error.");
			throw new AppException(ds.errcode, ds.errmsg);
		}
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_saly_3700_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_3700_LDataSet ds = null;
		HD_SALY_3700_LDM dm = new HD_SALY_3700_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.saly_yy = Util.checkString(req.getParameter("saly_yy"));
		dm.etc_saly_cd = Util.checkString(req.getParameter("etc_saly_cd"));

		dm.print();
		
		ds = (HD_SALY_3700_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_saly_3800_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_3800_LDataSet ds = null;
		HD_SALY_3800_LDM dm = new HD_SALY_3800_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.saly_yy = Util.checkString(req.getParameter("saly_yy"));
		dm.saly_no = Util.checkString(req.getParameter("saly_no"));

		dm.print();
		
		ds = (HD_SALY_3800_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_saly_3801_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_3801_ADataSet ds = null;
		HD_SALY_3801_ADM dm = new HD_SALY_3801_ADM();
		
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdate"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);
		System.out.println("=====================================================================================");
		System.out.println(multiUpdateData);
		System.out.println("=====================================================================================");
		
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.mode = ((String)hash.get("m")).toUpperCase();
		dm.saly_yy = (String)hash.get("saly_yy");
		dm.saly_no = (String)hash.get("saly_no");
		dm.emp_no = (String)hash.get("emp_no");
		dm.flnm = (String)hash.get("flnm");
		dm.dept_cd = (String)hash.get("dept_cd");
		dm.dty_cd = (String)hash.get("dty_cd");
		dm.posi_cd = (String)hash.get("posi_cd");
		dm.prsn_pens_dduc = (String)hash.get("prsn_pens_dduc");
		dm.incmg_pers_ipadd = req.getRemoteAddr();
        dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);

		dm.print();
		
		ds = (HD_SALY_3801_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_saly_3802_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_3802_LDataSet ds = null;
		HD_SALY_3802_LDM dm = new HD_SALY_3802_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));

		dm.print();
		
		ds = (HD_SALY_3802_LDataSet)manager.executeCall(dm);
		
		dm.print();
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_saly_3803_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_3803_ADataSet ds = null;
		HD_SALY_3803_ADM dm = new HD_SALY_3803_ADM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.saly_yy = Util.checkString(req.getParameter("saly_yy"));
		dm.saly_no = Util.checkString(req.getParameter("saly_no"));
		dm.incmg_pers_ipadd = req.getRemoteAddr();
        dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        
		dm.print();
		
		ds = (HD_SALY_3803_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
				
		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.saly_yy = (String)hash.get("saly_yy");
		dm.saly_no = (String)hash.get("saly_no");
		dm.incmg_pers_ipadd = (String)hash.get("incmg_pers_ipadd");
		dm.incmg_pers = (String)hash.get("incmg_pers");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.saly_yy = Util.getSessionParameterValue(req,"saly_yy",true);
		dm.saly_no = Util.getSessionParameterValue(req,"saly_no",true);
		dm.incmg_pers_ipadd = Util.getSessionParameterValue(req,"incmg_pers_ipadd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"incmg_pers",true);
		*******************************************************************************************/
	}
	
	public void hd_saly_2400_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		
		DBManager manager = new DBManager("MISHDL");
		
		HD_SALY_2400_ADataSet ds = null;
		HD_SALY_2400_ADM dm = new HD_SALY_2400_ADM();
		
		String multiUpdateData = Util.checkString(req.getParameter("multiUpDate"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.mode = ((String) hash.get("m")).toUpperCase();
		dm.emp_no = (String)hash.get("emp_no");
		dm.base_saly = (String)hash.get("base_saly");

		dm.print();

		ds = (HD_SALY_2400_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_saly_2401_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		
		DBManager manager = new DBManager("MISHDL");
		
		HD_SALY_2401_LDataSet ds = null;
		HD_SALY_2401_LDM dm = new HD_SALY_2401_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.saly_yymm = Util.checkString(req.getParameter("saly_yymm"));

		dm.print();

		ds = (HD_SALY_2401_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_saly_2402_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		
		DBManager manager = new DBManager("MISHDL");
		
		HD_SALY_2402_ADataSet ds = null;
		HD_SALY_2402_ADM dm = new HD_SALY_2402_ADM();
		
		String multiUpdateData = Util.checkString(req.getParameter("multiUpDate"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.saly_yymm = Util.checkString(req.getParameter("saly_yymm"));
		dm.mode = ((String) hash.get("m")).toUpperCase();
		dm.emp_no = (String)hash.get("emp_no");
		dm.dept_cd = (String)hash.get("dept_cd");
		dm.emp_clsf = (String)hash.get("emp_clsf");
		dm.base_saly = (String)hash.get("chk_2");
		dm.incmg_pers_ipadd = req.getRemoteAddr();
        dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);

		dm.print();

		ds = (HD_SALY_2402_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_saly_2600_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		System.out.println("**** WB **");
		HD_SALY_2600_LDataSet ds = null;
		HD_SALY_2600_LDM dm = new HD_SALY_2600_LDM();
		
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));

		dm.print();

		ds = (HD_SALY_2600_LDataSet)manager.executeCall(dm);
		System.out.println("**** WB **");
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	
	public void hd_saly_2601_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_2601_MDataSet ds = null;
		HD_SALY_2601_MDM dm = new HD_SALY_2601_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);

		dm.print();
		
		ds = (HD_SALY_2601_MDataSet)manager.executeCall(dm);
		
		dm.print();
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_saly_2602_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_2602_ADataSet ds = null;
		HD_SALY_2602_ADM dm = new HD_SALY_2602_ADM();

		String multiUpdateData = Util.checkString(req.getParameter("multiUpDate"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);
		
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.mode = ((String) hash.get("m")).toUpperCase();
		dm.emp_no = (String)hash.get("emp_no");
		dm.simp_tax_rate = (String)hash.get("simp_tax_rate");

		

		ds = (HD_SALY_2602_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_saly_6000_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_6000_LDataSet ds = null;
		HD_SALY_6000_LDM dm = new HD_SALY_6000_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.lvcmpy_dt = Util.checkString(req.getParameter("lvcmpy_dt"));
		dm.emp_clsf = Util.checkString(req.getParameter("emp_clsf"));

		dm.print();

		ds = (HD_SALY_6000_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	public void hd_saly_6001_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_6001_LDataSet ds = null;
		HD_SALY_6001_LDM dm = new HD_SALY_6001_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.lvcmpy_dt = Util.checkString(req.getParameter("lvcmpy_dt"));
		dm.emp_clsf = Util.checkString(req.getParameter("emp_clsf"));

		dm.print();

		ds = (HD_SALY_6001_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	public void hd_saly_6002_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_6002_LDataSet ds = null;
		HD_SALY_6002_LDM dm = new HD_SALY_6002_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.end_mm = Util.checkString(req.getParameter("end_mm"));

		dm.print();

		ds = (HD_SALY_6002_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	public void hd_saly_6003_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_6003_LDataSet ds = null;
		HD_SALY_6003_LDM dm = new HD_SALY_6003_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.start_mm = Util.checkString(req.getParameter("start_mm"));
		dm.term = Util.checkString(req.getParameter("term"));

		dm.print();

		ds = (HD_SALY_6003_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	public void hd_saly_6004_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_6004_ADataSet ds = null;
		HD_SALY_6004_ADM dm = new HD_SALY_6004_ADM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.start_mm = Util.checkString(req.getParameter("start_mm"));
		dm.end_mm = Util.checkString(req.getParameter("end_mm"));
		dm.end2_mm = Util.checkString(req.getParameter("end2_mm"));
		dm.lock_use_yn = Util.checkString(req.getParameter("lock_use_yn"));
		dm.term = Util.checkString(req.getParameter("term"));
		dm.occr_dt = Util.checkString(req.getParameter("occr_dt"));
		dm.seq = Util.checkString(req.getParameter("seq"));
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.incmg_pers_ipadd = req.getRemoteAddr();

		dm.print();

		ds = (HD_SALY_6004_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	public void hd_saly_6005_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_6005_LDataSet ds = null;
		HD_SALY_6005_LDM dm = new HD_SALY_6005_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.end2_mm = Util.checkString(req.getParameter("end2_mm"));

		dm.print();

		ds = (HD_SALY_6005_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	public void hd_saly_6100_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_6100_LDataSet ds = null;
		HD_SALY_6100_LDM dm = new HD_SALY_6100_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.lvcmpy_dt = Util.checkString(req.getParameter("lvcmpy_dt"));
		dm.emp_clsf = Util.checkString(req.getParameter("emp_clsf"));
		dm.saly_yymm = Util.checkString(req.getParameter("saly_yymm"));

		dm.print();

		ds = (HD_SALY_6100_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	public void hd_saly_1350_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		CallableStatement cstmt  = null;
		
		HD_SALY_1350_ADataSet ds = null;
		HD_SALY_1350_ADM dm = new HD_SALY_1350_ADM();
		
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdate"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);
		
		String[] mode 	= Util.checkString((String)hash.get("m")).split("#");
		String[] emp_no 	= Util.checkString((String)hash.get("emp_no")).split("#");
		String[] exst_pay_saly_yy 	= Util.checkString((String)hash.get("exst_pay_saly_yy")).split("#");
		String[] exst_pay_saly_no 	= Util.checkString((String)hash.get("exst_pay_saly_no")).split("#");
		String[] retr_rgla_saly 	= Util.checkString((String)hash.get("retr_rgla_saly")).split("#");
		System.out.println("try 실행전");
		
		try{
//			0.DB연결
			manager.getConnection();
			manager.m_conn.setAutoCommit(false);
			
			for(int row =0; row<exst_pay_saly_yy.length; row++ ){
				
				dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
				dm.setMode(mode[row]+row);
				dm.rfl_saly_yy = Util.checkString(req.getParameter("rfl_saly_yy"));
				dm.rfl_saly_no = Util.checkString(req.getParameter("rfl_saly_no"));
				dm.setEmp_no(emp_no[row]);
				dm.setExst_pay_saly_yy(exst_pay_saly_yy[row]);
				dm.setExst_pay_saly_no(exst_pay_saly_no[row]);
				dm.setRetr_rgla_saly(retr_rgla_saly[row]);
				dm.incmg_pers_ipadd = req.getRemoteAddr();
				dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
				
				cstmt = manager.m_conn.prepareCall(dm.getSQL());
		       	// 파라미터 설정
		       	dm.setParams(cstmt,dm);
		       	// 실행
		       	cstmt.execute();		       		
		        //System.out.println("HD_SALY_1350_ADataSet 실행전 "+row);	
		        // 결과
		       	ds = (HD_SALY_1350_ADataSet) dm.createDataSetObject();
		       	ds.getValues(cstmt);
		       	cstmt.close();
		       	if (!"".equals(ds.errcode)) {
			            throw new AppException(ds.errcode, ds.errmsg);
		        }
	 
		       	manager.commit();	
			}
		}
		catch (AppException e) {
	    	  if (manager != null)
		          manager.rollback();	
           throw e;   
		}catch (SQLException e) {
			if (manager != null)
		          manager.rollback();	
	    	  throw new SysException(e);
		}catch (Exception e) {
		      if (manager != null)
		          manager.rollback();	
	    	  throw new SysException(e);
	    } finally {	    	
		    if (manager != null)	
		    	manager.disConnection();
	    }
	    
	    req.setAttribute("ds", ds);
		/*
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.mode = ((String) hash.get("m")).toUpperCase();
		dm.rfl_saly_yy = Util.checkString(req.getParameter("rfl_saly_yy"));
		dm.rfl_saly_no = Util.checkString(req.getParameter("rfl_saly_no"));
		dm.emp_no = (String)hash.get("emp_no");
		dm.exst_pay_saly_yy = (String)hash.get("exst_pay_saly_yy");
		dm.exst_pay_saly_no = (String)hash.get("exst_pay_saly_no");
		dm.retr_rgla_saly = (String)hash.get("retr_rgla_saly");
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);

		dm.print();

		ds = (HD_SALY_1350_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
		*/
	}
	public void hd_saly_1351_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_1351_LDataSet ds = null;
		HD_SALY_1351_LDM dm = new HD_SALY_1351_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.rfl_saly_yy = Util.checkString(req.getParameter("rfl_saly_yy"));
		dm.rfl_saly_no = Util.checkString(req.getParameter("rfl_saly_no"));

		dm.print();

		ds = (HD_SALY_1351_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	//개인별내역조회_뉴스프레스
	public void hd_saly_3313_326_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_3313_326_LDataSet ds = null;
		HD_SALY_3313_326_LDM dm = new HD_SALY_3313_326_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.saly_yy = Util.checkString(req.getParameter("saly_yy"));
		dm.saly_no = Util.checkString(req.getParameter("saly_no"));
		dm.saly_pay_dt = Util.checkString(req.getParameter("saly_pay_dt"));

		dm.print();
		
		ds = (HD_SALY_3313_326_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}

	//간의세액 
	public void hd_saly_7000_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_7000_MDataSet ds = null;
		HD_SALY_7000_MDM dm = new HD_SALY_7000_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.print();

		ds = (HD_SALY_7000_MDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	//간이세액표 조회 
	public void hd_saly_7001_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_7001_LDataSet ds = null;
		HD_SALY_7001_LDM dm = new HD_SALY_7001_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.aply_basi_mm = Util.checkString(req.getParameter("aply_basi_mm"));

		dm.print();

		ds = (HD_SALY_7001_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_saly_7002_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_7002_ADataSet ds = null;
		HD_SALY_7002_ADM dm = new HD_SALY_7002_ADM();
		
		
		String multiUpdatedata = Util.checkString(req.getParameter("multiUpdate"));
		Hashtable hash = getHashMultiUpdateData(multiUpdatedata);
		
		System.out.println( multiUpdatedata +" hash " + hash);

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.new_aply_basi_mm = Util.checkString(req.getParameter("new_aply_basi_mm"));
		dm.mode = ((String) hash.get("m")).toUpperCase();
		dm.saly_amt_fr = (String)hash.get("saly_amt_fr");
		dm.saly_amt_to = (String)hash.get("saly_amt_to");
		dm.faml_1 = (String)hash.get("faml_1");
		dm.faml_2 = (String)hash.get("faml_2");
		dm.faml_3 = (String)hash.get("faml_3");
		dm.faml_4 = (String)hash.get("faml_4");
		dm.faml_5 = (String)hash.get("faml_5");
		dm.faml_6 = (String)hash.get("faml_6");
		dm.faml_7 = (String)hash.get("faml_7");
		dm.faml_8 = (String)hash.get("faml_8");
		dm.faml_9 = (String)hash.get("faml_9");
		dm.faml_10 = (String)hash.get("faml_10");
		dm.faml_11 = (String)hash.get("faml_11");
		dm.incmg_pers_ipadd = req.getRemoteAddr();
        dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.incmg_pers_ipadd = req.getRemoteAddr();

		dm.print();

		ds = (HD_SALY_7002_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	//휘트니스사용자등록관리_회사콤보구성
	public void hd_saly_6200_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_6200_MDataSet ds = null;
		HD_SALY_6200_MDM dm = new HD_SALY_6200_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.print();

		ds = (HD_SALY_6200_MDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	//휘트니스사용자등록관리_조회
	public void hd_saly_6210_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_6210_LDataSet ds = null;
		HD_SALY_6210_LDM dm = new HD_SALY_6210_LDM();

		dm.fit_yy = Util.checkString(req.getParameter("fit_yy"));
		dm.fit_no = Util.checkString(req.getParameter("fit_no"));

		dm.print();
		
		ds = (HD_SALY_6210_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	//휘트니스사용자등록관리_CUD
	public void hd_saly_6220_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_6220_ADataSet ds = null;
		HD_SALY_6220_ADM dm = new HD_SALY_6220_ADM();
		
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdate")); 
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);
		System.out.println("=====================================================================================");
		System.out.println(multiUpdateData);
		System.out.println("=====================================================================================");
		
		
		dm.mode = ((String)hash.get("m")).toUpperCase();
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.cmpy_blng_cd = (String)hash.get("cmpy_blng_cd");
		dm.fit_yy = Util.checkString(req.getParameter("fit_yy"));
		dm.fit_no = Util.checkString(req.getParameter("fit_no"));
		dm.nm_korn = (String)hash.get("nm_korn");
		dm.tel_no = (String)hash.get("tel_no");
		dm.fitness_dus = (String)hash.get("fitness_dus");
		dm.locker_yn = (String)hash.get("locker_yn");
		dm.locker_pay = (String)hash.get("locker_pay");
		dm.fitness_sum = (String)hash.get("fitness_sum");		
		dm.remk = (String)hash.get("remk");		
		dm.magam_yn = (String)hash.get("magam_yn");
		dm.mang_no = (String)hash.get("mang_no");
		dm.occr_dt = (String)hash.get("occr_dt");
		dm.seq = (String)hash.get("seq");		
		dm.incmg_pers_ipadd = req.getRemoteAddr();
        dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);

		dm.print();
		
		ds = (HD_SALY_6220_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	//휘트니스사용자등록관리_전월내역복사
	public void hd_saly_6230_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_6230_ADataSet ds = null;
		HD_SALY_6230_ADM dm = new HD_SALY_6230_ADM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.fit_yy = Util.checkString(req.getParameter("fit_yy"));
		dm.fit_no = Util.checkString(req.getParameter("fit_no"));
		dm.incmg_pers_ipadd = req.getRemoteAddr();
        dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        
		dm.print();
		
		ds = (HD_SALY_6230_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
						
	}
	
	//휘트니스사용자등록관리_마감/마감취소
	public void hd_saly_6240_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_6240_ADataSet ds = null;
		HD_SALY_6240_ADM dm = new HD_SALY_6240_ADM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.fit_yy = Util.checkString(req.getParameter("fit_yy"));
		dm.fit_no = Util.checkString(req.getParameter("fit_no"));
		dm.magam_flag = Util.checkString(req.getParameter("magam_flag"));		
        dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        
		dm.print();
		
		ds = (HD_SALY_6240_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
						
	}
	
//	개인연금접수  ready 
	public void hd_saly_8001_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_8001_MDataSet ds = null;
		HD_SALY_8001_MDM dm = new HD_SALY_8001_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.print();

		ds = (HD_SALY_8001_MDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	
	
//	개인연금접수(현업)- 신청 
	public void hd_saly_8002_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_8002_ADataSet ds = null;
		HD_SALY_8002_ADM dm = new HD_SALY_8002_ADM();

	
		System.out.println("=====================================================================================");
		System.out.println("=====================================================================================");
		
		
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no =  Util.checkString(req.getParameter("emp_no"));
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.pens_aply_mm = Util.checkString(req.getParameter("pens_aply_mm"));
		dm.pens_clsf = Util.checkString(req.getParameter("pens_clsf"));
		dm.prsn_pens_amt = Util.checkString(req.getParameter("prsn_pens_amt"));
		dm.prsn_sppt_amt = Util.checkString(req.getParameter("prsn_sppt_amt"));
		dm.remk = Util.checkString(req.getParameter("remk"));
        dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		dm.print();
		
		ds = (HD_SALY_8002_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
						
	}
	
//	개인연금접수 조회1 
	public void hd_saly_8003_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_8003_LDataSet ds = null;
		HD_SALY_8003_LDM dm = new HD_SALY_8003_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no  = Util.checkString(req.getParameter("emp_no"));

		dm.print();
		
		ds = (HD_SALY_8003_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
//	개인연금접수 (개인연금납부현황)  
	public void hd_saly_8004_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_8004_LDataSet ds = null;
		HD_SALY_8004_LDM dm = new HD_SALY_8004_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no  = Util.checkString(req.getParameter("emp_no"));
		dm.search_frdt = Util.checkString(req.getParameter("search_frdt"));
		dm.search_todt = Util.checkString(req.getParameter("search_todt")); 

		dm.print();
		
		ds = (HD_SALY_8004_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
//	 개인연금접수(총무팀)
	// ready 
	public void hd_saly_8101_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_8101_MDataSet ds = null;
		HD_SALY_8101_MDM dm = new HD_SALY_8101_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.print();

		ds = (HD_SALY_8101_MDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	

	//조회 
	public void hd_saly_8102_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_8102_LDataSet ds = null;
		HD_SALY_8102_LDM dm = new HD_SALY_8102_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no  = Util.checkString(req.getParameter("emp_no"));
		dm.pens_aply_mm = Util.checkString(req.getParameter("pens_aply_mm"));
		dm.pens_clsf =  Util.checkString(req.getParameter("pens_clsf"));
		dm.proc_stat =  Util.checkString(req.getParameter("proc_stat"));
		dm.prsn_pens_amt = Util.checkString(req.getParameter("prsn_pens_amt"));

		dm.print();
		
		ds = (HD_SALY_8102_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	//개인연금접수(총무팀)- 저장 
	public void hd_saly_8103_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_8103_ADataSet ds = null;
		HD_SALY_8103_ADM dm = new HD_SALY_8103_ADM();

		String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);
		System.out.println("=====================================================================================");
		System.out.println(multiUpdateData);
		System.out.println("=====================================================================================");
		
		
		dm.flag = ((String)hash.get("m")).toUpperCase();
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = (String)hash.get("emp_no");
		dm.occr_dt = (String)hash.get("occr_dt");
		dm.seq = (String)hash.get("seq");		
		dm.pens_aply_mm = (String)hash.get("pens_aply_mm");
		dm.remk = (String)hash.get("remk");
        dm.chg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.print();
		
		ds = (HD_SALY_8103_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
						
	}
	
//	개인연금접수(총무팀)- 처리완료/처리취소 
	public void hd_saly_8104_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_8104_ADataSet ds = null;
		HD_SALY_8104_ADM dm = new HD_SALY_8104_ADM();

		String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);
		System.out.println("=====================================================================================");
		System.out.println(multiUpdateData);
		System.out.println("=====================================================================================");
		
		
		dm.flag = ((String)hash.get("m")).toUpperCase();
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = (String)hash.get("emp_no");
		dm.occr_dt = (String)hash.get("occr_dt");
		dm.seq = (String)hash.get("seq");		
		dm.proc_clsf_yn = Util.checkString(req.getParameter("proc_clsf_yn"));
        dm.chg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.print();
		
		ds = (HD_SALY_8104_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
						
	}
//	개인연금접수(총무팀)- 적용년월일괄적용 
	public void hd_saly_8105_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_8105_ADataSet ds = null;
		HD_SALY_8105_ADM dm = new HD_SALY_8105_ADM();

		String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);
		System.out.println("=====================================================================================");
		System.out.println(multiUpdateData);
		System.out.println("=====================================================================================");
		
		
		dm.flag = ((String)hash.get("m")).toUpperCase();
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = (String)hash.get("emp_no");
		dm.occr_dt = (String)hash.get("occr_dt");
		dm.seq = (String)hash.get("seq");	
		dm.lump_pens_aply_mm = Util.checkString(req.getParameter("lump_pens_aply_mm"));
        dm.chg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.print();
		
		ds = (HD_SALY_8105_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
						
	}
	
//	조회 
	public void hd_saly_8201_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_8201_LDataSet ds = null;
		HD_SALY_8201_LDM dm = new HD_SALY_8201_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no  = Util.checkString(req.getParameter("emp_no"));
		dm.pymt_yy = Util.checkString(req.getParameter("pymt_yy"));
		dm.pymt_no =  Util.checkString(req.getParameter("pymt_no"));

		dm.print();
		
		ds = (HD_SALY_8201_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	//개인연금정보 납부현황으로 데이터이관
	public void hd_saly_3804_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_3804_ADataSet ds = null;
		HD_SALY_3804_ADM dm = new HD_SALY_3804_ADM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.saly_yy = Util.checkString(req.getParameter("saly_yy"));
		dm.saly_no = Util.checkString(req.getParameter("saly_no"));
		dm.incmg_pers_ipadd = req.getRemoteAddr();
        dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        
		dm.print();
		
		ds = (HD_SALY_3804_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
						
	}
	
	//개인연금정보 전송금액 체크
	public void hd_saly_3805_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_SALY_3805_LDataSet ds = null;
		HD_SALY_3805_LDM dm = new HD_SALY_3805_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.saly_yy = Util.checkString(req.getParameter("saly_yy"));
		dm.saly_no = Util.checkString(req.getParameter("saly_no"));

		dm.print();
		
		ds = (HD_SALY_3805_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
}
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

package chosun.ciis.hd.appmt.wb;

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
import chosun.ciis.hd.appmt.dm.*;
import chosun.ciis.hd.appmt.ds.*;
/**
 * 
 */
 
public class HD_APPMT_1000WB extends BaseWB {
 
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
    public void hd_appmt_1000(HttpServletRequest req, HttpServletResponse res) throws   AppException {
		DBManager manager = new DBManager("MISHDL");
   	
    	HD_APPMT_1000_LDataSet ds = null;

        // DM Setting
    	HD_APPMT_1000_LDM dm = new HD_APPMT_1000_LDM();
        dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
        dm.print();

		ds = (HD_APPMT_1000_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
    }
    /**
     * 발령관련된 그리드
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void hd_appmt_1001(HttpServletRequest req, HttpServletResponse res) throws   AppException {
		DBManager manager = new DBManager("MISHDL");
   	
    	HD_APPMT_1001_LDataSet ds = null;

        // DM Setting
    	HD_APPMT_1001_LDM dm = new HD_APPMT_1001_LDM();
        dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.flnm = Util.checkString(req.getParameter("nm_korn"));
		dm.appmt_cd = Util.checkString(req.getParameter("appmt_cd"));
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.appmt_dt_fm = Util.checkString(req.getParameter("appmt_dt_fm"));
		dm.appmt_dt_to = Util.checkString(req.getParameter("appmt_dt_to"));
		dm.appmt_stat_clsf = Util.checkString(req.getParameter("appmt_stat_clsf"));
		dm.lvcmpy_dt = Util.checkString(req.getParameter("lvcmpy_dt"));
		
		dm.print();

		ds = (HD_APPMT_1001_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
    }
    
    public void hd_appmt_1011(HttpServletRequest req, HttpServletResponse res) throws   AppException {
		DBManager manager = new DBManager("MISHDL");
   	
    	HD_APPMT_1011_LDataSet ds = null;

        // DM Setting
    	HD_APPMT_1011_LDM dm = new HD_APPMT_1011_LDM();
        dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.flnm = Util.checkString(req.getParameter("nm_korn"));
		dm.appmt_cd = Util.checkString(req.getParameter("appmt_cd"));
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.appmt_dt_fm = Util.checkString(req.getParameter("appmt_dt_fm"));
		dm.appmt_dt_to = Util.checkString(req.getParameter("appmt_dt_to"));
		dm.appmt_stat_clsf = Util.checkString(req.getParameter("appmt_stat_clsf"));
		dm.lvcmpy_dt = Util.checkString(req.getParameter("lvcmpy_dt"));
		
		dm.print();

		ds = (HD_APPMT_1011_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
    }
    /**
     * 발령관련된
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void hd_appmt_1002(HttpServletRequest req, HttpServletResponse res) throws   AppException {
		DBManager manager = new DBManager("MISHDL");
    	
    	HD_APPMT_1002_LDataSet ds = null;

        // DM Setting
    	HD_APPMT_1002_LDM dm = new HD_APPMT_1002_LDM();
        dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.nm_korn = Util.checkString(req.getParameter("nm_korn"));
		dm.print();

		ds = (HD_APPMT_1002_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
    }
    
    public void hd_appmt_1003(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_APPMT_1003_ADataSet ds = null;
		HD_APPMT_1003_ADM dm = new HD_APPMT_1003_ADM();

		String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);
		
		dm.mode = ((String)hash.get("m")).toUpperCase();
		dm.emp_no = (String)hash.get("emp_no");
		dm.flnm = (String)hash.get("flnm");
		dm.appmt_dt = (String)hash.get("appmt_dt");
		dm.mtry_dt = (String)hash.get("mtry_dt");
		dm.base_saly = (String)hash.get("base_saly");
		dm.posk_saly = (String)hash.get("posk_saly");
		dm.food_alon = (String)hash.get("food_alon");
		dm.tax_jrnst    = (String)hash.get("tax_jrnst");
		dm.auto_driv_alon = (String)hash.get("auto_driv_alon");
		dm.evngt_saly = (String)hash.get("evngt_saly");
		
		dm.saly_stot = (String)hash.get("saly_stot");
		dm.appmt_sort = (String)hash.get("appmt_sort");
		dm.appmt_cont = (String)hash.get("appmt_cont");
		dm.dept_cd = (String)hash.get("dept_cd");
		dm.addm_dept_cd = (String)hash.get("addm_dept_cd");
		dm.appmt_cd = (String)hash.get("appmt_cd");
		dm.appmt_resn_cd = (String)hash.get("appmt_resn_cd");
		dm.emp_clsf_cd = (String)hash.get("emp_clsf_cd");
		dm.dty_cd = (String)hash.get("dty_cd");
		dm.posi_cd = (String)hash.get("posi_cd");
		dm.emp_dtls_clsf = (String)hash.get("emp_dtls_clsf");
		dm.seq = (String)hash.get("seq");
		dm.occr_dt = (String)hash.get("occr_dt");
        dm.incmg_pers_ipadd = req.getRemoteAddr();
        dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
        
        dm.print();

		ds = (HD_APPMT_1003_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
    }
    
    public void hd_appmt_1013(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_APPMT_1013_ADataSet ds = null;
		HD_APPMT_1013_ADM dm = new HD_APPMT_1013_ADM();

		String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);
		
		dm.mode = ((String)hash.get("m")).toUpperCase();
		dm.emp_no = (String)hash.get("emp_no");
		dm.flnm = (String)hash.get("flnm");
		dm.appmt_dt = (String)hash.get("appmt_dt");
		dm.mtry_dt = (String)hash.get("mtry_dt");
		dm.base_saly = (String)hash.get("base_saly");
		dm.posk_saly = (String)hash.get("posk_saly");
		dm.dty_alon = (String)hash.get("dty_alon");
		dm.posk_alon = (String)hash.get("posk_alon");
		dm.care_alon = (String)hash.get("care_alon");
		dm.meal_fee = (String)hash.get("meal_fee");
		dm.saly_stot = (String)hash.get("saly_stot");
		dm.appmt_sort = (String)hash.get("appmt_sort");
		dm.appmt_cont = (String)hash.get("appmt_cont");
		dm.dept_cd = (String)hash.get("dept_cd");
		dm.addm_dept_cd = (String)hash.get("addm_dept_cd");
		dm.appmt_cd = (String)hash.get("appmt_cd");
		dm.appmt_resn_cd = (String)hash.get("appmt_resn_cd");
		dm.emp_clsf_cd = (String)hash.get("emp_clsf_cd");
		dm.dty_cd = (String)hash.get("dty_cd");
		dm.posi_cd = (String)hash.get("posi_cd");
		dm.emp_dtls_clsf = (String)hash.get("emp_dtls_clsf");
		dm.seq = (String)hash.get("seq");
		dm.occr_dt = (String)hash.get("occr_dt");
        dm.incmg_pers_ipadd = req.getRemoteAddr();
        dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
        
        dm.print();

		ds = (HD_APPMT_1013_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
    }
    
    public void hd_appmt_1004(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_APPMT_1004_UDataSet ds = null;
		HD_APPMT_1004_UDM dm = new HD_APPMT_1004_UDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.flnm = Util.checkString(req.getParameter("flnm"));
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.appmt_cd = Util.checkString(req.getParameter("appmt_cd"));
		dm.appmt_resn_cd = Util.checkString(req.getParameter("appmt_resn_cd"));
		dm.appmt_dt = Util.checkString(req.getParameter("appmt_dt"));
		dm.mtry_dt = Util.checkString(req.getParameter("mtry_dt"));
		dm.emp_clsf_cd = Util.checkString(req.getParameter("emp_clsf_cd"));
		dm.dty_cd = Util.checkString(req.getParameter("dty_cd"));
		dm.posi_cd = Util.checkString(req.getParameter("posi_cd"));
		dm.emp_dtls_clsf = Util.checkString(req.getParameter("emp_dtls_clsf"));
		dm.base_saly = Util.checkString(req.getParameter("base_saly"));
		dm.posk_saly = Util.checkString(req.getParameter("posk_saly"));
		dm.saly_stot = Util.checkString(req.getParameter("saly_stot"));
		dm.appmt_sort = Util.checkString(req.getParameter("appmt_sort"));
		dm.appmt_cont = Util.checkString(req.getParameter("appmt_cont"));
		dm.clos_proc_yn = Util.checkString(req.getParameter("clos_proc_yn"));
		dm.clos_proc_dt = Util.checkString(req.getParameter("clos_proc_dt"));
		dm.seq = Util.checkString(req.getParameter("seq"));
		dm.occr_dt = Util.checkString(req.getParameter("occr_dt"));
        dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        
        dm.print();

		ds = (HD_APPMT_1004_UDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    
    public void hd_appmt_1005_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_APPMT_1005_LDataSet ds = null;
		HD_APPMT_1005_LDM dm = new HD_APPMT_1005_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.print();
		
		ds = (HD_APPMT_1005_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    
    public void hd_appmt_1006_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_APPMT_1006_LDataSet ds = null;
		HD_APPMT_1006_LDM dm = new HD_APPMT_1006_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.print();

		ds = (HD_APPMT_1006_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    
    public void hd_appmt_1007_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_APPMT_1007_LDataSet ds = null;
		HD_APPMT_1007_LDM dm = new HD_APPMT_1007_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.nm_korn = Util.checkString(req.getParameter("nm_korn"));
		
		dm.print();

		ds = (HD_APPMT_1007_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    
    public void hd_appmt_1008_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_APPMT_1008_LDataSet ds = null;
		HD_APPMT_1008_LDM dm = new HD_APPMT_1008_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.nm_korn = Util.checkString(req.getParameter("nm_korn"));
		
		dm.print();

		ds = (HD_APPMT_1008_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    
    public void hd_appmt_1009_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	DBManager manager = new DBManager("MISHDL");
    	
    	HD_APPMT_1009_MDataSet ds = null;
    	HD_APPMT_1009_MDM dm = new HD_APPMT_1009_MDM();
    	
    	dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
    	dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
    	
    	dm.print();
    	
    	ds = (HD_APPMT_1009_MDataSet)manager.executeCall(dm);
    	
    	if (!"".equals(ds.errcode)) {
    		System.out.println("DAO..error.");
    		throw new AppException(ds.errcode, ds.errmsg);
    	}
    	
    	req.setAttribute("ds", ds);
    }
    
    public void hd_appmt_1016_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	DBManager manager = new DBManager("MISHDL");
    	
    	HD_APPMT_1016_MDataSet ds = null;
    	HD_APPMT_1016_MDM dm = new HD_APPMT_1016_MDM();
    	
    	dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
    	dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
    	
    	dm.print();
    	
    	ds = (HD_APPMT_1016_MDataSet)manager.executeCall(dm);
    	
    	if (!"".equals(ds.errcode)) {
    		System.out.println("DAO..error.");
    		throw new AppException(ds.errcode, ds.errmsg);
    	}
    	
    	req.setAttribute("ds", ds);
    }

	public void hd_appmt_1100(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_APPMT_1100_LDataSet ds = null;
		HD_APPMT_1100_LDM dm = new HD_APPMT_1100_LDM();

		dm.appmt_dt_fr = Util.checkString(req.getParameter("appmt_dt_fr"));
		dm.appmt_dt_to = Util.checkString(req.getParameter("appmt_dt_to"));
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.appmt_stat_clsf = Util.checkString(req.getParameter("appmt_stat_clsf"));
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		
		dm.print();

		ds = (HD_APPMT_1100_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    
    public void hd_appmt_1101(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_APPMT_1101_UDataSet ds = null;
		HD_APPMT_1101_UDM dm = new HD_APPMT_1101_UDM();

		String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);
		
		dm.mode = ((String)hash.get("m")).toUpperCase();
		dm.emp_no = (String)hash.get("emp_no");
		dm.save = (String)hash.get("save");
		dm.flnm = (String)hash.get("flnm");
		dm.dept_cd = (String)hash.get("dept_cd");
		dm.addm_dept_cd = (String)hash.get("addm_dept_cd");
		dm.dty_cd = (String)hash.get("dty_cd");
		dm.posi_cd = (String)hash.get("posi_cd");
		dm.appmt_cd = (String)hash.get("appmt_cd");
		dm.appmt_resn_cd = (String)hash.get("appmt_resn_cd");
		dm.appmt_dt = (String)hash.get("appmt_dt");
		dm.appmt_cont = (String)hash.get("appmt_cont");
		dm.mtry_dt = (String)hash.get("mtry_dt");
		dm.emp_clsf_cd = (String)hash.get("emp_clsf_cd");
		dm.emp_dtls_clsf = (String)hash.get("emp_dtls_clsf");
		dm.seq = (String)hash.get("seq");
		dm.occr_dt = (String)hash.get("occr_dt");
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
        dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.incmg_pers_ipadd = req.getRemoteAddr();
        
        dm.print();

		ds = (HD_APPMT_1101_UDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
    }
    
    public void hd_appmt_1102(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_APPMT_1102_UDataSet ds = null;
		HD_APPMT_1102_UDM dm = new HD_APPMT_1102_UDM();

		String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);
		// 2014.06.17 evngt_saly, tax_jrnst, auto_driv_alon  컬럼 추가  : 조선경제 I 사용으로 인해 추가 됨 
		dm.mode = ((String)hash.get("m")).toUpperCase();
		dm.emp_no = (String)hash.get("emp_no");
		dm.save = (String)hash.get("save");
		dm.flnm = (String)hash.get("flnm");
		dm.base_saly = (String)hash.get("base_saly");
		dm.posk_saly = (String)hash.get("posk_saly");
		dm.evngt_saly = (String)hash.get("evngt_saly");
		dm.dty_alon  = (String)hash.get("dty_alon");
		dm.posk_alon = (String)hash.get("posk_alon");
		dm.care_alon = (String)hash.get("care_alon");
		dm.food_alon = (String)hash.get("food_alon");
		dm.tax_jrnst = (String)hash.get("tax_jrnst");
		dm.auto_driv_alon = (String)hash.get("auto_driv_alon");
		dm.saly_stot = (String)hash.get("saly_stot");
		dm.appmt_cd = (String)hash.get("appmt_cd");
		dm.appmt_dt = (String)hash.get("appmt_dt");
		dm.seq = (String)hash.get("seq");
		dm.occr_dt = (String)hash.get("occr_dt");
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
        dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        
        dm.print();

		ds = (HD_APPMT_1102_UDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
    }
    
    public void hd_appmt_1103(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_APPMT_1103_UDataSet ds = null;
		HD_APPMT_1103_UDM dm = new HD_APPMT_1103_UDM();

		String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);
		
		dm.mode = ((String)hash.get("m")).toUpperCase();
		dm.emp_no = (String)hash.get("emp_no");
		dm.save = (String)hash.get("save");
		dm.flnm = (String)hash.get("flnm");
		dm.dept_cd = (String)hash.get("dept_cd");
		dm.addm_dept_cd = (String)hash.get("addm_dept_cd");
		dm.dty_cd = (String)hash.get("dty_cd");
		dm.posi_cd = (String)hash.get("posi_cd");
		dm.appmt_cd = (String)hash.get("appmt_cd");
		dm.appmt_resn_cd = (String)hash.get("appmt_resn_cd");
		dm.appmt_dt = (String)hash.get("appmt_dt");
		dm.appmt_cont = (String)hash.get("appmt_cont");
		dm.mtry_dt = (String)hash.get("mtry_dt");
		dm.emp_clsf_cd = (String)hash.get("emp_clsf_cd");
		dm.emp_dtls_clsf = (String)hash.get("emp_dtls_clsf");
		dm.base_saly = (String)hash.get("base_saly");
		dm.posk_saly = (String)hash.get("posk_saly");
		dm.saly_stot = (String)hash.get("saly_stot");
		dm.dty_alon  = (String)hash.get("dty_alon");
		dm.posk_alon = (String)hash.get("posk_alon");
		dm.care_alon = (String)hash.get("care_alon");
		dm.food_alon = (String)hash.get("food_alon");
		dm.tax_jrnst = (String)hash.get("tax_jrnst");
		dm.auto_driv_alon = (String)hash.get("auto_driv_alon");
		dm.evngt_saly = (String)hash.get("evngt_saly");
		dm.seq = (String)hash.get("seq");
		dm.occr_dt = (String)hash.get("occr_dt");
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
        dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.incmg_pers_ipadd = req.getRemoteAddr();
        
        dm.print();

		ds = (HD_APPMT_1103_UDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
    }
    
    public void hd_appmt_1104(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_APPMT_1104_UDataSet ds = null;
		HD_APPMT_1104_UDM dm = new HD_APPMT_1104_UDM();

		String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);
		
		dm.mode = ((String)hash.get("m")).toUpperCase();
		dm.emp_no = (String)hash.get("emp_no");
		dm.save = (String)hash.get("save");
		dm.flnm = (String)hash.get("flnm");
		dm.dept_cd = (String)hash.get("dept_cd");
		dm.dty_cd = (String)hash.get("dty_cd");
		dm.posi_cd = (String)hash.get("posi_cd");
		dm.appmt_cd = (String)hash.get("appmt_cd");
		dm.appmt_resn_cd = (String)hash.get("appmt_resn_cd");
		dm.appmt_dt = (String)hash.get("appmt_dt");
		dm.appmt_cont = (String)hash.get("appmt_cont");
		dm.mtry_dt = (String)hash.get("mtry_dt");
		dm.emp_clsf_cd = (String)hash.get("emp_clsf_cd");
		dm.emp_dtls_clsf = (String)hash.get("emp_dtls_clsf");
		dm.base_saly = (String)hash.get("base_saly");
		dm.posk_saly = (String)hash.get("posk_saly");
		dm.saly_stot = (String)hash.get("saly_stot");
		dm.seq = (String)hash.get("seq");
		dm.occr_dt = (String)hash.get("occr_dt"); 
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
        dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        
        dm.print();

		ds = (HD_APPMT_1104_UDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
    }

	public void hd_appmt_1200(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_APPMT_1200_LDataSet ds = null;
		HD_APPMT_1200_LDM dm = new HD_APPMT_1200_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		
		dm.print();

		ds = (HD_APPMT_1200_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}

	public void hd_appmt_1201(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_APPMT_1201_LDataSet ds = null;
		HD_APPMT_1201_LDM dm = new HD_APPMT_1201_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
        dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.flnm = Util.checkString(req.getParameter("flnm"));
		dm.appmt_cd = Util.checkString(req.getParameter("appmt_cd"));
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.appmt_dt_fm = Util.checkString(req.getParameter("appmt_dt_fm"));
		dm.appmt_dt_to = Util.checkString(req.getParameter("appmt_dt_to"));
		dm.sort = Util.checkString(req.getParameter("sort"));
		
		dm.print();

		ds = (HD_APPMT_1201_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
    public void hd_appmt_1202(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_APPMT_1202_ADataSet ds = null;
		HD_APPMT_1202_ADM dm = new HD_APPMT_1202_ADM();

		String multiUpdateData = Util.checkString(req.getParameter("mutilUpData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		int idx = 0;

		dm.mode = ((String)hash.get("m")).toUpperCase();
		dm.emp_no = (String)hash.get("emp_no");
        dm.flnm = (String)hash.get("flnm");
        dm.appmt_dt = (String)hash.get("appmt_dt");
        dm.mtry_dt = (String)hash.get("mtry_dt");
        dm.base_saly = (String)hash.get("base_saly");
        dm.posk_saly = (String)hash.get("posk_saly");
        dm.saly_stot = (String)hash.get("saly_stot");
        dm.appmt_sort = (String)hash.get("appmt_sort");
        dm.appmt_cont = (String)hash.get("appmt_cont");
        dm.dept_cd = (String)hash.get("dept_cd");
        dm.appmt_cd = (String)hash.get("appmt_cd");
        dm.appmt_resn_cd = (String)hash.get("appmt_resn_cd");
        dm.emp_clsf_cd = (String)hash.get("emp_clsf_cd");
        dm.dspch_enpr_main_clsf = (String)hash.get("dspch_enpr_main_clsf");
        dm.posk_clas_cd = (String)hash.get("posk_clas_cd");
        dm.seq = (String)hash.get("seq");
        dm.occr_dt = (String)hash.get("occr_dt");
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
        dm.incmg_pers_ipadd = req.getRemoteAddr();
        dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        
        dm.print();
        
		ds = (HD_APPMT_1202_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
    }
    
    public void hd_appmt_1203(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_APPMT_1203_UDataSet ds = null;
		HD_APPMT_1203_UDM dm = new HD_APPMT_1203_UDM();

		//dm.cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.flnm = Util.checkString(req.getParameter("flnm"));
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.appmt_cd = Util.checkString(req.getParameter("appmt_cd"));
		dm.appmt_resn_cd = Util.checkString(req.getParameter("appmt_resn_cd"));
		dm.appmt_dt = Util.checkString(req.getParameter("appmt_dt"));
		dm.mtry_dt = Util.checkString(req.getParameter("mtry_dt"));
		dm.emp_clsf_cd = Util.checkString(req.getParameter("emp_clsf_cd"));
		dm.base_saly = Util.checkString(req.getParameter("base_saly"));
		dm.posk_saly = Util.checkString(req.getParameter("posk_saly"));
		dm.saly_stot = Util.checkString(req.getParameter("saly_stot"));
		dm.appmt_sort = Util.checkString(req.getParameter("appmt_sort"));
		dm.appmt_cont = Util.checkString(req.getParameter("appmt_cont"));
		dm.seq = Util.checkString(req.getParameter("seq"));
		dm.occr_dt = Util.checkString(req.getParameter("occr_dt"));
        dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        
        dm.print();

		ds = (HD_APPMT_1203_UDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    
    public void hd_appmt_1204_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_APPMT_1204_LDataSet ds = null;
		HD_APPMT_1204_LDM dm = new HD_APPMT_1204_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.nm_korn = Util.checkString(req.getParameter("nm_korn"));
		
		dm.print();

		ds = (HD_APPMT_1204_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    
    public void hd_appmt_1205_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_APPMT_1205_LDataSet ds = null;
		HD_APPMT_1205_LDM dm = new HD_APPMT_1205_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		
		dm.print();

		ds = (HD_APPMT_1205_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    
    public void hd_appmt_1206_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	DBManager manager = new DBManager("MISHDL");
    	
    	HD_APPMT_1206_MDataSet ds = null;
    	HD_APPMT_1206_MDM dm = new HD_APPMT_1206_MDM();
    	
    	dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
    	dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
    	
    	dm.print();
    	
    	ds = (HD_APPMT_1206_MDataSet)manager.executeCall(dm);
    	
    	if (!"".equals(ds.errcode)) {
    		System.out.println("DAO..error.");
    		throw new AppException(ds.errcode, ds.errmsg);
    	}
    	
    	req.setAttribute("ds", ds);
    }

	public void hd_appmt_1300(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_APPMT_1300_LDataSet ds = null;
		HD_APPMT_1300_LDM dm = new HD_APPMT_1300_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.clos_proc_yn = Util.checkString(req.getParameter("clos_proc_yn"));
		dm.appmt_dt_fr = Util.checkString(req.getParameter("appmt_dt_fr"));
		dm.appmt_dt_to = Util.checkString(req.getParameter("appmt_dt_to"));
		dm.emp_no= Util.checkString(req.getParameter("emp_no"));
		dm.nm_korn = Util.checkString(req.getParameter("nm_korn"));

		dm.print();

		ds = (HD_APPMT_1300_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    
    public void hd_appmt_1301(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_APPMT_1301_UDataSet ds = null;
		HD_APPMT_1301_UDM dm = new HD_APPMT_1301_UDM();

		String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);
		
		dm.mode = ((String)hash.get("m")).toUpperCase();
		dm.emp_no = (String)hash.get("emp_no");
		dm.save = (String)hash.get("save");
		dm.flnm = (String)hash.get("flnm");
		dm.dept_cd = (String)hash.get("dept_cd");
		dm.appmt_cd = (String)hash.get("appmt_cd");
		dm.appmt_resn_cd = (String)hash.get("appmt_resn_cd");
		dm.appmt_dt = (String)hash.get("appmt_dt");
		dm.appmt_cont = (String)hash.get("appmt_cont");
		dm.clos_proc_yn = (String)hash.get("clos_proc_yn");
		dm.emp_clsf_cd = (String)hash.get("emp_clsf_cd");
		dm.base_saly = (String)hash.get("base_saly");
		dm.posk_saly = (String)hash.get("posk_saly");
		dm.saly_stot = (String)hash.get("saly_stot");
		dm.seq = (String)hash.get("seq");
		dm.occr_dt = (String)hash.get("occr_dt");
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
        dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.incmg_pers_ipadd = req.getRemoteAddr();
        
        dm.print();

		ds = (HD_APPMT_1301_UDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
    }
    
    public void hd_appmt_1302(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_APPMT_1302_UDataSet ds = null;
		HD_APPMT_1302_UDM dm = new HD_APPMT_1302_UDM();

		String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);
		
		dm.mode = ((String)hash.get("m")).toUpperCase();
		dm.emp_no = (String)hash.get("emp_no");
		dm.save = (String)hash.get("save");
		dm.flnm = (String)hash.get("flnm");
		dm.dept_cd = (String)hash.get("dept_cd");
		dm.appmt_cd = (String)hash.get("appmt_cd");
		dm.appmt_resn_cd = (String)hash.get("appmt_resn_cd");
		dm.appmt_dt = (String)hash.get("appmt_dt");
		dm.appmt_cont = (String)hash.get("appmt_cont");
		dm.clos_proc_yn = (String)hash.get("clos_proc_yn");
		dm.emp_clsf_cd = (String)hash.get("emp_clsf_cd");
		dm.seq = (String)hash.get("seq");
		dm.occr_dt = (String)hash.get("occr_dt");
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
        dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        
        dm.print();

		ds = (HD_APPMT_1302_UDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
    }
    
    public void hd_appmt_2000_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_APPMT_2000_LDataSet ds = null;
		HD_APPMT_2000_LDM dm = new HD_APPMT_2000_LDM();
		
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
	//	dm.emp_no = Util.getSessionParameterValue(req, "emp_no", true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));

		dm.print();

		ds = (HD_APPMT_2000_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    
    public void hd_appmt_2000_500_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_APPMT_2000_500_LDataSet ds = null;
		HD_APPMT_2000_500_LDM dm = new HD_APPMT_2000_500_LDM();
		
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
	//	dm.emp_no = Util.getSessionParameterValue(req, "emp_no", true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));

		dm.print();

		ds = (HD_APPMT_2000_500_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    
    public void hd_appmt_2001_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_APPMT_2001_LDataSet ds = null;
		HD_APPMT_2001_LDM dm = new HD_APPMT_2001_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.appmt_dt = Util.checkString(req.getParameter("appmt_dt"));
		
		dm.print();

		ds = (HD_APPMT_2001_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    
    public void hd_appmt_2002_u(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_APPMT_2002_UDataSet ds = null;
		HD_APPMT_2002_UDM dm = new HD_APPMT_2002_UDM();
		
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.seq = Util.checkString(req.getParameter("epView_seq"));
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
        dm.incmg_pers_ipadd = req.getRemoteAddr();
        dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        
        dm.print();

		ds = (HD_APPMT_2002_UDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    public void hd_appmt_2003_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_APPMT_2003_LDataSet ds = null;
		HD_APPMT_2003_LDM dm = new HD_APPMT_2003_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		//dm.emp_no = Util.getSessionParameterValue(req, "emp_no", true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.appmt_dt = Util.checkString(req.getParameter("appmt_dt"));
		
		dm.print();

		ds = (HD_APPMT_2003_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    
    public void hd_appmt_1105_i(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_APPMT_1105_IDataSet ds = null;
		HD_APPMT_1105_IDM dm = new HD_APPMT_1105_IDM();
		
		String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);
		System.out.println(multiUpdateData);
		
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.mode = ((String)hash.get("m")).toUpperCase();
        dm.emp_no = (String)hash.get("emp_no");
        dm.incmg_pers_ipadd = req.getRemoteAddr();
        dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        
        dm.print();
		
		ds = (HD_APPMT_1105_IDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    
    public void hd_appmt_3000_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");

		HD_APPMT_3000_LDataSet ds = null;
		HD_APPMT_3000_LDM dm = new HD_APPMT_3000_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.print();

		ds = (HD_APPMT_3000_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
}
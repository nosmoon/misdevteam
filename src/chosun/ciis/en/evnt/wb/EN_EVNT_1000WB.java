/***************************************************************************************************
 * 파일명 : EN_EVNT_1000WB.java
 * 기능 : 행사관리 관련 WorkBean
 * 작성일자 : 2009.02.01
 * 작성자 : 최승구
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/

package chosun.ciis.en.evnt.wb;

import java.rmi.RemoteException;
import java.util.Hashtable;
import java.util.StringTokenizer;

import javax.ejb.CreateException;
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
import chosun.ciis.en.evnt.dm.*;
import chosun.ciis.en.evnt.ds.*;
/**
 * 
 */

public class EN_EVNT_1000WB extends BaseWB {

	public void en_evnt_1000_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISENP");
		EN_EVNT_1000_MDataSet ds = null;
		EN_EVNT_1000_MDM dm = new EN_EVNT_1000_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		//dm.cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
		dm.print();

		ds = (EN_EVNT_1000_MDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
		
		/*
		try {
			EN_EVNT_1000EJBHome home = (EN_EVNT_1000EJBHome)JNDIManager.getInstance().getHome("EN_EVNT_1000EJB");
			EN_EVNT_1000EJB ejb = home.create();

			ds = ejb.en_evnt_1000_m(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}

		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		*******************************************************************************************/
	}

	public void en_evnt_1001_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISENP");
		EN_EVNT_1001_MDataSet ds = null;
		EN_EVNT_1001_MDM dm = new EN_EVNT_1001_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		//dm.cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
		dm.print();

		ds = (EN_EVNT_1001_MDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);

		/*
		try {
			EN_EVNT_1000EJBHome home = (EN_EVNT_1000EJBHome)JNDIManager.getInstance().getHome("EN_EVNT_1000EJB");
			EN_EVNT_1000EJB ejb = home.create();

			ds = ejb.en_evnt_1001_m(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}

		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		*******************************************************************************************/
	}
	
	public void en_evnt_1002_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISENP");
		EN_EVNT_1002_LDataSet ds = null;
		EN_EVNT_1002_LDM dm = new EN_EVNT_1002_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		//dm.cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
		dm.evnt_yy = Util.checkString(req.getParameter("evnt_yy"));
		dm.evnt_nm = Util.checkString(req.getParameter("evnt_nm"));
		dm.print();

		ds = (EN_EVNT_1002_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);

		/*
		try {
			EN_EVNT_1000EJBHome home = (EN_EVNT_1000EJBHome)JNDIManager.getInstance().getHome("EN_EVNT_1000EJB");
			EN_EVNT_1000EJB ejb = home.create();

			ds = ejb.en_evnt_1002_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}

		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.evnt_yy = (String)hash.get("evnt_yy");
		dm.evnt_nm = (String)hash.get("evnt_nm");
		*******************************************************************************************/
	}

	public void en_evnt_1003_s(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISENP");
		EN_EVNT_1003_SDataSet ds = null;
		EN_EVNT_1003_SDM dm = new EN_EVNT_1003_SDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		//dm.cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
		dm.evnt_yy = Util.checkString(req.getParameter("evnt_yy"));
		dm.evnt_cd = Util.checkString(req.getParameter("evnt_cd"));
		dm.evnt_seq = Util.checkString(req.getParameter("evnt_seq"));

		ds = (EN_EVNT_1003_SDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);

		/*
		try {
			EN_EVNT_1000EJBHome home = (EN_EVNT_1000EJBHome)JNDIManager.getInstance().getHome("EN_EVNT_1000EJB");
			EN_EVNT_1000EJB ejb = home.create();

			ds = ejb.en_evnt_1003_s(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}

		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.evnt_yy = (String)hash.get("evnt_yy");
		dm.evnt_cd = (String)hash.get("evnt_cd");
		dm.evnt_seq = (String)hash.get("evnt_seq");
		*******************************************************************************************/
	}

	public void en_evnt_1004_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISENP");
		EN_EVNT_1004_ADataSet ds = null;
		EN_EVNT_1004_ADM dm = new EN_EVNT_1004_ADM();

		dm.mode = Util.checkString(req.getParameter("mode"));
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		//dm.cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
		dm.evnt_yy = Util.checkString(req.getParameter("evnt_yy"));
		dm.evnt_cd = Util.checkString(req.getParameter("evnt_cd"));
		dm.evnt_seq = Util.checkString(req.getParameter("evnt_seq"));
		dm.evnt_nm = Util.checkString(req.getParameter("evnt_nm"));
		dm.evnt_type = Util.checkString(req.getParameter("evnt_type"));
		dm.regu_non_regu_clsf = Util.checkString(req.getParameter("regu_non_regu_clsf"));
		dm.spons_clsf = Util.checkString(req.getParameter("spons_clsf"));
		dm.entr_cost = Util.checkString(req.getParameter("entr_cost"));
		dm.charg_entr_nops = Util.checkString(req.getParameter("charg_entr_nops"));
		dm.free_entr_nops = Util.checkString(req.getParameter("free_entr_nops"));
		dm.grp_entr_nops = Util.checkString(req.getParameter("grp_entr_nops"));
		dm.grp_entr_team_cnt = Util.checkString(req.getParameter("grp_entr_team_cnt"));
		dm.evnt_dds = Util.checkString(req.getParameter("evnt_dds"));
		dm.evnt_frdt = Util.checkString(req.getParameter("evnt_frdt"));
		dm.evnt_todt = Util.checkString(req.getParameter("evnt_todt"));
		dm.plac_1 = Util.checkString(req.getParameter("plac_1"));
		dm.plac_2 = Util.checkString(req.getParameter("plac_2"));
		dm.plac_3 = Util.checkString(req.getParameter("plac_3"));
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.chrg_pers_emp_no = Util.checkString(req.getParameter("chrg_pers_emp_no"));
		dm.vat_incd_yn = Util.checkString(req.getParameter("vat_incd_yn"));
		dm.incmg_pers_ip = req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.chg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		//dm.incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
		//dm.chg_pers = Util.checkString(req.getParameter("chg_pers"));
		dm.print();

		ds = (EN_EVNT_1004_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);

		/*
		try {
			EN_EVNT_1000EJBHome home = (EN_EVNT_1000EJBHome)JNDIManager.getInstance().getHome("EN_EVNT_1000EJB");
			EN_EVNT_1000EJB ejb = home.create();

			ds = ejb.en_evnt_1004_a(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}

		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.mode = (String)hash.get("mode");
		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.evnt_yy = (String)hash.get("evnt_yy");
		dm.evnt_cd = (String)hash.get("evnt_cd");
		dm.evnt_seq = (String)hash.get("evnt_seq");
		dm.evnt_nm = (String)hash.get("evnt_nm");
		dm.evnt_type = (String)hash.get("evnt_type");
		dm.regu_non_regu_clsf = (String)hash.get("regu_non_regu_clsf");
		dm.spons_clsf = (String)hash.get("spons_clsf");
		dm.entr_cost = (String)hash.get("entr_cost");
		dm.charg_entr_nops = (String)hash.get("charg_entr_nops");
		dm.free_entr_nops = (String)hash.get("free_entr_nops");
		dm.grp_entr_nops = (String)hash.get("grp_entr_nops");
		dm.grp_entr_team_cnt = (String)hash.get("grp_entr_team_cnt");
		dm.evnt_dds = (String)hash.get("evnt_dds");
		dm.evnt_frdt = (String)hash.get("evnt_frdt");
		dm.evnt_todt = (String)hash.get("evnt_todt");
		dm.plac_1 = (String)hash.get("plac_1");
		dm.plac_2 = (String)hash.get("plac_2");
		dm.plac_3 = (String)hash.get("plac_3");
		dm.dept_cd = (String)hash.get("dept_cd");
		dm.chrg_pers_emp_no = (String)hash.get("chrg_pers_emp_no");
		dm.vat_incd_yn = (String)hash.get("vat_incd_yn");
		dm.incmg_pers_ip = (String)hash.get("incmg_pers_ip");
		dm.incmg_pers = (String)hash.get("incmg_pers");
		dm.chg_pers = (String)hash.get("chg_pers");
		*******************************************************************************************/
	}
	
	public void en_evnt_1101_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISENP");
		EN_EVNT_1101_LDataSet ds = null;
		EN_EVNT_1101_LDM dm = new EN_EVNT_1101_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		//dm.cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
		dm.evnt_yy = Util.checkString(req.getParameter("evnt_yy"));
		dm.evnt_cd = Util.checkString(req.getParameter("evnt_cd"));
		dm.evnt_nm = Util.checkString(req.getParameter("evnt_nm"));
		dm.clos_yn = Util.checkString(req.getParameter("clos_yn"));
		dm.print();

		ds = (EN_EVNT_1101_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);

		/*
		try {
			EN_EVNT_1000EJBHome home = (EN_EVNT_1000EJBHome)JNDIManager.getInstance().getHome("EN_EVNT_1000EJB");
			EN_EVNT_1000EJB ejb = home.create();

			ds = ejb.en_evnt_1101_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}

		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.evnt_yy = (String)hash.get("evnt_yy");
		dm.evnt_cd = (String)hash.get("evnt_cd");
		dm.evnt_nm = (String)hash.get("evnt_nm");
		dm.clos_yn = (String)hash.get("clos_yn");
		*******************************************************************************************/
	}

	public void en_evnt_1102_u(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISENP");
		EN_EVNT_1102_UDataSet ds = null;
		EN_EVNT_1102_UDM dm = new EN_EVNT_1102_UDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		//dm.cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
		dm.evnt_yy = Util.checkString(req.getParameter("evnt_yy"));
		dm.evnt_cd = Util.checkString(req.getParameter("evnt_cd"));
		dm.evnt_seq = Util.checkString(req.getParameter("evnt_seq"));
		dm.stlm_dt = Util.checkString(req.getParameter("stlm_dt"));
		dm.chg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.print();

		ds = (EN_EVNT_1102_UDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);

		/*
		try {
			EN_EVNT_1000EJBHome home = (EN_EVNT_1000EJBHome)JNDIManager.getInstance().getHome("EN_EVNT_1000EJB");
			EN_EVNT_1000EJB ejb = home.create();

			ds = ejb.en_evnt_1102_u(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}

		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.evnt_yy = (String)hash.get("evnt_yy");
		dm.evnt_cd = (String)hash.get("evnt_cd");
		dm.evnt_seq = (String)hash.get("evnt_seq");
		dm.stlm_dt = (String)hash.get("stlm_dt");
		dm.chg_pers = (String)hash.get("chg_pers");
		*******************************************************************************************/
	}

	public void en_evnt_1103_u(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISENP");
		EN_EVNT_1103_UDataSet ds = null;
		EN_EVNT_1103_UDM dm = new EN_EVNT_1103_UDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		//dm.cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
		dm.evnt_yy = Util.checkString(req.getParameter("evnt_yy"));
		dm.evnt_cd = Util.checkString(req.getParameter("evnt_cd"));
		dm.evnt_seq = Util.checkString(req.getParameter("evnt_seq"));
		dm.chg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.print();

		ds = (EN_EVNT_1103_UDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);

		/*
		try {
			EN_EVNT_1000EJBHome home = (EN_EVNT_1000EJBHome)JNDIManager.getInstance().getHome("EN_EVNT_1000EJB");
			EN_EVNT_1000EJB ejb = home.create();

			ds = ejb.en_evnt_1103_u(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}

		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.evnt_yy = (String)hash.get("evnt_yy");
		dm.evnt_cd = (String)hash.get("evnt_cd");
		dm.evnt_seq = (String)hash.get("evnt_seq");
		dm.chg_pers = (String)hash.get("chg_pers");
		*******************************************************************************************/
	}

	public void en_evnt_1201_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISENP");
		EN_EVNT_1201_LDataSet ds = null;
		EN_EVNT_1201_LDM dm = new EN_EVNT_1201_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		//dm.cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
		dm.evnt_yy = Util.checkString(req.getParameter("evnt_yy"));
		dm.evnt_cd = Util.checkString(req.getParameter("evnt_cd"));
		dm.evnt_seq = Util.checkString(req.getParameter("evnt_seq"));
		dm.print();

		ds = (EN_EVNT_1201_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);

		/*
		try {
			EN_EVNT_1000EJBHome home = (EN_EVNT_1000EJBHome)JNDIManager.getInstance().getHome("EN_EVNT_1000EJB");
			EN_EVNT_1000EJB ejb = home.create();

			ds = ejb.en_evnt_1201_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}

		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.evnt_yy = (String)hash.get("evnt_yy");
		dm.evnt_cd = (String)hash.get("evnt_cd");
		dm.evnt_seq = (String)hash.get("evnt_seq");
		*******************************************************************************************/
	}

	public void en_evnt_1202_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISENP");
		EN_EVNT_1202_ADataSet ds = null;
		EN_EVNT_1202_ADM dm = new EN_EVNT_1202_ADM();

		dm.mode = Util.checkString(req.getParameter("mode"));
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		//dm.cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
		dm.evnt_yy = Util.checkString(req.getParameter("evnt_yy"));
		dm.evnt_cd = Util.checkString(req.getParameter("evnt_cd"));
		dm.evnt_seq = Util.checkString(req.getParameter("evnt_seq"));
		dm.evnt_rcpm_unit_clsf = Util.checkString(req.getParameter("evnt_rcpm_unit_clsf"));
		dm.vitl_acct_no_bgn = Util.checkString(req.getParameter("vitl_acct_no_bgn"));
		dm.vitl_acct_no_end = Util.checkString(req.getParameter("vitl_acct_no_end"));
		dm.use_end_yn = Util.checkString(req.getParameter("use_end_yn"));
		dm.remk = Util.checkString(req.getParameter("remk"));
		dm.incmg_pers_ip = req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.chg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		//dm.incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
		//dm.chg_pers = Util.checkString(req.getParameter("chg_pers"));
		dm.print();

		ds = (EN_EVNT_1202_ADataSet)manager.executeCall(dm);

		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);

		/*
		try {
			EN_EVNT_1000EJBHome home = (EN_EVNT_1000EJBHome)JNDIManager.getInstance().getHome("EN_EVNT_1000EJB");
			EN_EVNT_1000EJB ejb = home.create();

			ds = ejb.en_evnt_1202_a(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}

		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.mode = (String)hash.get("mode");
		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.evnt_yy = (String)hash.get("evnt_yy");
		dm.evnt_cd = (String)hash.get("evnt_cd");
		dm.evnt_seq = (String)hash.get("evnt_seq");
		dm.evnt_rcpm_unit_clsf = (String)hash.get("evnt_rcpm_unit_clsf");
		dm.vitl_acct_no_bgn = (String)hash.get("vitl_acct_no_bgn");
		dm.vitl_acct_no_end = (String)hash.get("vitl_acct_no_end");
		dm.use_end_yn = (String)hash.get("use_end_yn");
		dm.remk = (String)hash.get("remk");
		dm.incmg_pers_ip = (String)hash.get("incmg_pers_ip");
		dm.incmg_pers = (String)hash.get("incmg_pers");
		dm.chg_pers = (String)hash.get("chg_pers");
		*******************************************************************************************/
	}

	public void en_evnt_1203_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISENP");
		EN_EVNT_1203_LDataSet ds = null;
		EN_EVNT_1203_LDM dm = new EN_EVNT_1203_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.evnt_yy = Util.checkString(req.getParameter("evnt_yy"));
		dm.evnt_cd = Util.checkString(req.getParameter("evnt_cd"));
		dm.evnt_seq = Util.checkString(req.getParameter("evnt_seq"));
		dm.print();

		ds = (EN_EVNT_1203_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);

		/*
		try {
			EN_EVNT_1000EJBHome home = (EN_EVNT_1000EJBHome)JNDIManager.getInstance().getHome("EN_EVNT_1000EJB");
			EN_EVNT_1000EJB ejb = home.create();

			ds = ejb.en_evnt_1203_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}

		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.evnt_yy = (String)hash.get("evnt_yy");
		dm.evnt_cd = (String)hash.get("evnt_cd");
		dm.evnt_seq = (String)hash.get("evnt_seq");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.evnt_yy = Util.getSessionParameterValue(req,"evnt_yy",true);
		dm.evnt_cd = Util.getSessionParameterValue(req,"evnt_cd",true);
		dm.evnt_seq = Util.getSessionParameterValue(req,"evnt_seq",true);
		*******************************************************************************************/
	}

}

/***************************************************************************************************
* 파일명 : EN_INNEXP_1000WB.java
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

package chosun.ciis.en.innexp.wb;

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
import chosun.ciis.en.innexp.dm.*;
import chosun.ciis.en.innexp.ds.*;
/**
 * 
 */

public class EN_INNEXP_1000WB extends BaseWB {

	public void en_innexp_1000_m(HttpServletRequest req, HttpServletResponse res) 
	    throws AppException {
		DBManager manager = new DBManager("MISENP");
		EN_INNEXP_1000_MDataSet ds = null;
		EN_INNEXP_1000_MDM dm = new EN_INNEXP_1000_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.print();

		ds = (EN_INNEXP_1000_MDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);

		/*
		try {
			EN_INNEXP_1000EJBHome home = (EN_INNEXP_1000EJBHome)JNDIManager.getInstance().getHome("EN_INNEXP_1000EJB");
			EN_INNEXP_1000EJB ejb = home.create();

			ds = ejb.en_innexp_1000_m(dm);
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

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		*******************************************************************************************/
	}

	public void en_innexp_1001_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISENP");
		EN_INNEXP_1001_LDataSet ds = null;
		EN_INNEXP_1001_LDM dm = new EN_INNEXP_1001_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.occr_dt_fr = Util.checkString(req.getParameter("occr_dt_fr"));
		dm.occr_dt_to = Util.checkString(req.getParameter("occr_dt_to"));
		dm.srch_dlco_no = Util.checkString(req.getParameter("srch_dlco_no"));
		dm.srch_titl = Util.checkString(req.getParameter("srch_titl"));
		dm.print();

		ds = (EN_INNEXP_1001_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);

		/*
		try {
			EN_INNEXP_1000EJBHome home = (EN_INNEXP_1000EJBHome)JNDIManager.getInstance().getHome("EN_INNEXP_1000EJB");
			EN_INNEXP_1000EJB ejb = home.create();

			ds = ejb.en_innexp_1001_l(dm);
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
		dm.occr_dt_fr = (String)hash.get("occr_dt_fr");
		dm.occr_dt_to = (String)hash.get("occr_dt_to");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.occr_dt_fr = Util.getSessionParameterValue(req,"occr_dt_fr",true);
		dm.occr_dt_to = Util.getSessionParameterValue(req,"occr_dt_to",true);
		*******************************************************************************************/
	}

	public void en_innexp_1002_s(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISENP");
		EN_INNEXP_1002_SDataSet ds = null;
		EN_INNEXP_1002_SDM dm = new EN_INNEXP_1002_SDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.occr_dt = Util.checkString(req.getParameter("occr_dt"));
		dm.slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
		dm.occr_seq = Util.checkString(req.getParameter("occr_seq"));
		dm.evnt_yy = Util.checkString(req.getParameter("evnt_yy"));
		dm.evnt_cd = Util.checkString(req.getParameter("evnt_cd"));
		dm.evnt_seq = Util.checkString(req.getParameter("evnt_seq"));
		dm.print();

		ds = (EN_INNEXP_1002_SDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);

		/*
		try {
			EN_INNEXP_1000EJBHome home = (EN_INNEXP_1000EJBHome)JNDIManager.getInstance().getHome("EN_INNEXP_1000EJB");
			EN_INNEXP_1000EJB ejb = home.create();

			ds = ejb.en_innexp_1002_s(dm);
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
		dm.occr_dt = (String)hash.get("occr_dt");
		dm.slip_clsf_cd = (String)hash.get("slip_clsf_cd");
		dm.occr_seq = (String)hash.get("occr_seq");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.occr_dt = Util.getSessionParameterValue(req,"occr_dt",true);
		dm.slip_clsf_cd = Util.getSessionParameterValue(req,"slip_clsf_cd",true);
		dm.occr_seq = Util.getSessionParameterValue(req,"occr_seq",true);
		*******************************************************************************************/
	}

	public void en_innexp_1003_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISENP");
		EN_INNEXP_1003_LDataSet ds = null;
		EN_INNEXP_1003_LDM dm = new EN_INNEXP_1003_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.evnt_yy = Util.checkString(req.getParameter("evnt_yy"));
		dm.evnt_cd = Util.checkString(req.getParameter("evnt_cd"));
		dm.print();

		ds = (EN_INNEXP_1003_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
		
		/*
		try {
			EN_INNEXP_1000EJBHome home = (EN_INNEXP_1000EJBHome)JNDIManager.getInstance().getHome("EN_INNEXP_1000EJB");
			EN_INNEXP_1000EJB ejb = home.create();

			ds = ejb.en_innexp_1003_l(dm);
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
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.evnt_yy = Util.getSessionParameterValue(req,"evnt_yy",true);
		dm.evnt_cd = Util.getSessionParameterValue(req,"evnt_cd",true);
		*******************************************************************************************/
	}

	public void en_innexp_1004_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISENP");
		EN_INNEXP_1004_LDataSet ds = null;
		EN_INNEXP_1004_LDM dm = new EN_INNEXP_1004_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.evnt_yy = Util.checkString(req.getParameter("evnt_yy"));
		dm.evnt_cd = Util.checkString(req.getParameter("evnt_cd"));
		dm.print();

		ds = (EN_INNEXP_1004_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);

		/*
		try {
			EN_INNEXP_1000EJBHome home = (EN_INNEXP_1000EJBHome)JNDIManager.getInstance().getHome("EN_INNEXP_1000EJB");
			EN_INNEXP_1000EJB ejb = home.create();

			ds = ejb.en_innexp_1004_l(dm);
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
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.evnt_yy = Util.getSessionParameterValue(req,"evnt_yy",true);
		dm.evnt_cd = Util.getSessionParameterValue(req,"evnt_cd",true);
		*******************************************************************************************/
	}

	public void en_innexp_1005_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISENP");
		EN_INNEXP_1005_LDataSet ds = null;
		EN_INNEXP_1005_LDM dm = new EN_INNEXP_1005_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.evnt_yy = Util.checkString(req.getParameter("evnt_yy"));
		dm.evnt_cd = Util.checkString(req.getParameter("evnt_cd"));
		dm.evnt_seq = Util.checkString(req.getParameter("evnt_seq"));
		dm.print();

		ds = (EN_INNEXP_1005_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);

		/*
		try {
			EN_INNEXP_1000EJBHome home = (EN_INNEXP_1000EJBHome)JNDIManager.getInstance().getHome("EN_INNEXP_1000EJB");
			EN_INNEXP_1000EJB ejb = home.create();

			ds = ejb.en_innexp_1005_l(dm);
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

	public void en_innexp_1006_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISENP");
		EN_INNEXP_1006_LDataSet ds = null;
		EN_INNEXP_1006_LDM dm = new EN_INNEXP_1006_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.bank_cd = Util.checkString(req.getParameter("bank_cd"));
		dm.print();

		ds = (EN_INNEXP_1006_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);

		/*
		try {
			EN_INNEXP_1000EJBHome home = (EN_INNEXP_1000EJBHome)JNDIManager.getInstance().getHome("EN_INNEXP_1000EJB");
			EN_INNEXP_1000EJB ejb = home.create();

			ds = ejb.en_innexp_1006_l(dm);
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
		dm.bank_cd = (String)hash.get("bank_cd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.bank_cd = Util.getSessionParameterValue(req,"bank_cd",true);
		*******************************************************************************************/
	}

	public void en_innexp_1007_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISENP");
		EN_INNEXP_1007_LDataSet ds = null;
		EN_INNEXP_1007_LDM dm = new EN_INNEXP_1007_LDM();

		dm.dlco_no = Util.checkString(req.getParameter("dlco_no"));
		dm.print();

		ds = (EN_INNEXP_1007_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);

		/*
		try {
			EN_INNEXP_1000EJBHome home = (EN_INNEXP_1000EJBHome)JNDIManager.getInstance().getHome("EN_INNEXP_1000EJB");
			EN_INNEXP_1000EJB ejb = home.create();

			ds = ejb.en_innexp_1007_l(dm);
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

		dm.dlco_no = (String)hash.get("dlco_no");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.dlco_no = Util.getSessionParameterValue(req,"dlco_no",true);
		*******************************************************************************************/
	}

	public void en_innexp_1008_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISENP");
		EN_INNEXP_1008_LDataSet ds = null;
		EN_INNEXP_1008_LDM dm = new EN_INNEXP_1008_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.reven_dt = Util.checkString(req.getParameter("reven_dt"));
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.evnt_cd = Util.checkString(req.getParameter("evnt_cd"));
		dm.print();

		ds = (EN_INNEXP_1008_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
		
		/*
		try {
			EN_INNEXP_1000EJBHome home = (EN_INNEXP_1000EJBHome)JNDIManager.getInstance().getHome("EN_INNEXP_1000EJB");
			EN_INNEXP_1000EJB ejb = home.create();

			ds = ejb.en_innexp_1008_l(dm);
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
		dm.reven_dt = (String)hash.get("reven_dt");
		dm.dept_cd = (String)hash.get("dept_cd");
		dm.evnt_cd = (String)hash.get("evnt_cd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.reven_dt = Util.getSessionParameterValue(req,"reven_dt",true);
		dm.dept_cd = Util.getSessionParameterValue(req,"dept_cd",true);
		dm.evnt_cd = Util.getSessionParameterValue(req,"evnt_cd",true);
		*******************************************************************************************/
	}

	public void en_innexp_1009_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISENP");
		EN_INNEXP_1009_LDataSet ds = null;
		EN_INNEXP_1009_LDM dm = new EN_INNEXP_1009_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.occr_dt = Util.checkString(req.getParameter("occr_dt"));
		dm.slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
		dm.occr_seq = Util.checkString(req.getParameter("occr_seq"));
		dm.print();

		ds = (EN_INNEXP_1009_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);

		/*
		try {
			EN_INNEXP_1000EJBHome home = (EN_INNEXP_1000EJBHome)JNDIManager.getInstance().getHome("EN_INNEXP_1000EJB");
			EN_INNEXP_1000EJB ejb = home.create();

			ds = ejb.en_innexp_1009_l(dm);
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
		dm.occr_dt = (String)hash.get("occr_dt");
		dm.slip_clsf_cd = (String)hash.get("slip_clsf_cd");
		dm.occr_seq = (String)hash.get("occr_seq");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.occr_dt = Util.getSessionParameterValue(req,"occr_dt",true);
		dm.slip_clsf_cd = Util.getSessionParameterValue(req,"slip_clsf_cd",true);
		dm.occr_seq = Util.getSessionParameterValue(req,"occr_seq",true);
		*******************************************************************************************/
	}

	public void en_innexp_1010_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISENP");
		EN_INNEXP_1010_ADataSet ds = null;
		EN_INNEXP_1010_ADM dm = new EN_INNEXP_1010_ADM();

		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		String multiUpdateData2 = Util.checkString(req.getParameter("multiUpdateData2"));
		System.out.println(multiUpdateData);
		System.out.println(multiUpdateData2);
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);
		Hashtable hash2 = getHashMultiUpdateData(multiUpdateData2);

		dm.mst_mode = Util.checkString(req.getParameter("mst_mode"));
		dm.incmg_pers_ip = Util.checkString(req.getRemoteAddr());
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.chg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.occr_dt = Util.checkString(req.getParameter("occr_dt"));
		dm.occr_seq = Util.checkString(req.getParameter("occr_seq"));
		dm.reven_dt = Util.checkString(req.getParameter("reven_dt"));
		dm.dlco_clsf_cd = Util.checkString(req.getParameter("dlco_clsf_cd"));
		dm.dlco_no = Util.checkString(req.getParameter("dlco_no"));
		dm.boks_dlco_nm = Util.checkString(req.getParameter("boks_dlco_nm"));
		dm.titl = Util.checkString(req.getParameter("titl"));
		dm.rcpm_shet_kind = Util.checkString(req.getParameter("rcpm_shet_kind"));
		dm.rcpm_shet_no = Util.checkString(req.getParameter("rcpm_shet_no"));
		dm.reven_amt = Util.checkString(req.getParameter("reven_amt"));
		dm.vat_amt = Util.checkString(req.getParameter("vat_amt"));
		dm.rcpm_amt = Util.checkString(req.getParameter("rcpm_amt"));
		dm.stmt_occr_dt = Util.checkString(req.getParameter("stmt_occr_dt"));
		dm.stmt_occr_seq = Util.checkString(req.getParameter("stmt_occr_seq"));
		dm.chrg_dept_cd = Util.checkString(req.getParameter("chrg_dept_cd"));
		dm.chrg_pers_emp_no = Util.checkString(req.getParameter("chrg_pers_emp_no"));
		dm.evnt_yy = Util.checkString(req.getParameter("evnt_yy"));
		dm.evnt_cd = Util.checkString(req.getParameter("evnt_cd"));
		dm.evnt_seq = Util.checkString(req.getParameter("evnt_seq"));
		dm.remk = Util.checkString(req.getParameter("remk"));
		dm.payo_clsf = Util.checkString(req.getParameter("payo_clsf"));
		dm.rcpm_occr_dt = Util.checkString(req.getParameter("rcpm_occr_dt"));
		dm.rcpm_occr_seq = Util.checkString(req.getParameter("rcpm_occr_seq"));
		dm.p_upd_occr_dt = Util.checkString(req.getParameter("p_upd_occr_dt"));
		dm.p_upd_occr_seq = Util.checkString(req.getParameter("p_upd_occr_seq"));
		
		dm.drcr_clsf = Util.checkString((String)hash.get("drcr_clsf"));
		dm.budg_cd = Util.checkString((String)hash.get("budg_cd"));
		dm.amt = Util.checkString((String)hash.get("amt"));
		dm.acct_mang_no = Util.checkString((String)hash.get("acct_mang_no"));
		dm.rmtt_dt = Util.checkString((String)hash.get("rmtt_dt"));
		dm.rmtt_plac = Util.checkString((String)hash.get("rmtt_plac"));
		dm.note_no = Util.checkString((String)hash.get("note_no"));
		dm.note_clsf_cd = Util.checkString((String)hash.get("note_clsf_cd"));
		dm.bank_cd = Util.checkString((String)hash.get("bank_cd"));
		dm.issu_pers_nm = Util.checkString((String)hash.get("issu_pers_nm"));
		dm.issu_cmpy_clsf_cd = Util.checkString((String)hash.get("issu_cmpy_clsf_cd"));
		dm.comp_dt = Util.checkString((String)hash.get("comp_dt"));
		dm.mtry_dt = Util.checkString((String)hash.get("mtry_dt"));
		dm.rcpm_acct = Util.checkString((String)hash.get("rcpm_acct"));
		dm.sale_aprv_no = Util.checkString((String)hash.get("sale_aprv_no"));
		dm.bal_occr_slip_no = Util.checkString((String)hash.get("bal_occr_slip_no"));
		dm.extnc_dlco_no = Util.checkString((String)hash.get("extnc_dlco_no"));
		dm.extnc_obj_slip_clsf = Util.checkString((String)hash.get("extnc_obj_slip_clsf"));
		dm.medi_cd = Util.checkString((String)hash.get("medi_cd"));
		dm.biz_reg_no = Util.checkString((String)hash.get("biz_reg_no"));
		dm.bank_id = Util.checkString((String)hash.get("bank_id"));
		dm.acct_num = Util.checkString((String)hash.get("acct_num"));
		dm.tran_date = Util.checkString((String)hash.get("tran_date"));
		dm.tran_date_seq = Util.checkString((String)hash.get("tran_date_seq"));
		dm.slip_no = Util.checkString((String)hash.get("slip_no"));

		dm.vitl_biz_reg_no = Util.checkString((String)hash2.get("biz_reg_no"));
		dm.vitl_bank_id = Util.checkString((String)hash2.get("bank_id"));
		dm.vitl_acct_num = Util.checkString((String)hash2.get("acct_num"));
		dm.vitl_tran_date = Util.checkString((String)hash2.get("tran_date"));
		dm.vitl_tran_date_seq = Util.checkString((String)hash2.get("tran_date_seq"));
		dm.vitl_slip_no = Util.checkString((String)hash2.get("slip_no"));
		dm.vitl_extnc_amt = Util.checkString((String)hash2.get("extnc_amt"));

		dm.chg_unrcp_amt = Util.checkString(req.getParameter("chg_unrcp_amt"));
		dm.chk_note_no = Util.checkString(req.getParameter("chk_note_no"));
		dm.chk_bank_cd = Util.checkString(req.getParameter("chk_bank_cd"));
		
		dm.print();

		ds = (EN_INNEXP_1010_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);

		/*
		try {
			EN_INNEXP_1000EJBHome home = (EN_INNEXP_1000EJBHome)JNDIManager.getInstance().getHome("EN_INNEXP_1000EJB");
			EN_INNEXP_1000EJB ejb = home.create();

			ds = ejb.en_innexp_1010_a(dm);
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

		dm.mst_mode = (String)hash.get("mst_mode");
		dm.incmg_pers_ip = (String)hash.get("incmg_pers_ip");
		dm.incmg_pers = (String)hash.get("incmg_pers");
		dm.chg_pers = (String)hash.get("chg_pers");
		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.occr_dt = (String)hash.get("occr_dt");
		dm.occr_seq = (String)hash.get("occr_seq");
		dm.reven_dt = (String)hash.get("reven_dt");
		dm.dlco_clsf_cd = (String)hash.get("dlco_clsf_cd");
		dm.dlco_no = (String)hash.get("dlco_no");
		dm.boks_dlco_nm = (String)hash.get("boks_dlco_nm");
		dm.titl = (String)hash.get("titl");
		dm.rcpm_shet_kind = (String)hash.get("rcpm_shet_kind");
		dm.rcpm_shet_no = (String)hash.get("rcpm_shet_no");
		dm.reven_amt = (String)hash.get("reven_amt");
		dm.vat_amt = (String)hash.get("vat_amt");
		dm.rcpm_amt = (String)hash.get("rcpm_amt");
		dm.stmt_occr_dt = (String)hash.get("stmt_occr_dt");
		dm.stmt_occr_seq = (String)hash.get("stmt_occr_seq");
		dm.p_upd_reven_occr_dt = (String)hash.get("p_upd_reven_occr_dt");
		dm.p_upd_reven_occr_seq = (String)hash.get("p_upd_reven_occr_seq");
		dm.chrg_dept_cd = (String)hash.get("chrg_dept_cd");
		dm.chrg_pers_emp_no = (String)hash.get("chrg_pers_emp_no");
		dm.evnt_yy = (String)hash.get("evnt_yy");
		dm.evnt_cd = (String)hash.get("evnt_cd");
		dm.evnt_seq = (String)hash.get("evnt_seq");
		dm.payo_clsf_cd = (String)hash.get("payo_clsf_cd");
		dm.rcpm_occr_dt = (String)hash.get("rcpm_occr_dt");
		dm.rcpm_occr_seq = (String)hash.get("rcpm_occr_seq");
		dm.remk = (String)hash.get("remk");
		dm.drcr_clsf = (String)hash.get("drcr_clsf");
		dm.budg_cd = (String)hash.get("budg_cd");
		dm.amt = (String)hash.get("amt");
		dm.acct_mang_no = (String)hash.get("acct_mang_no");
		dm.rmtt_dt = (String)hash.get("rmtt_dt");
		dm.rmtt_plac = (String)hash.get("rmtt_plac");
		dm.note_no = (String)hash.get("note_no");
		dm.note_clsf_cd = (String)hash.get("note_clsf_cd");
		dm.bank_cd = (String)hash.get("bank_cd");
		dm.issu_pers_nm = (String)hash.get("issu_pers_nm");
		dm.issu_cmpy_clsf_cd = (String)hash.get("issu_cmpy_clsf_cd");
		dm.comp_dt = (String)hash.get("comp_dt");
		dm.mtry_dt = (String)hash.get("mtry_dt");
		dm.rcpm_acct = (String)hash.get("rcpm_acct");
		dm.sale_aprv_no = (String)hash.get("sale_aprv_no");
		dm.chg_unrcp_amt = (String)hash.get("chg_unrcp_amt");
		dm.chk_note_no = (String)hash.get("chk_note_no");
		dm.chk_bank_cd = (String)hash.get("chk_bank_cd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.mst_mode = Util.getSessionParameterValue(req,"mst_mode",true);
		dm.incmg_pers_ip = Util.getSessionParameterValue(req,"incmg_pers_ip",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"incmg_pers",true);
		dm.chg_pers = Util.getSessionParameterValue(req,"chg_pers",true);
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.occr_dt = Util.getSessionParameterValue(req,"occr_dt",true);
		dm.occr_seq = Util.getSessionParameterValue(req,"occr_seq",true);
		dm.reven_dt = Util.getSessionParameterValue(req,"reven_dt",true);
		dm.dlco_clsf_cd = Util.getSessionParameterValue(req,"dlco_clsf_cd",true);
		dm.dlco_no = Util.getSessionParameterValue(req,"dlco_no",true);
		dm.boks_dlco_nm = Util.getSessionParameterValue(req,"boks_dlco_nm",true);
		dm.titl = Util.getSessionParameterValue(req,"titl",true);
		dm.rcpm_shet_kind = Util.getSessionParameterValue(req,"rcpm_shet_kind",true);
		dm.rcpm_shet_no = Util.getSessionParameterValue(req,"rcpm_shet_no",true);
		dm.reven_amt = Util.getSessionParameterValue(req,"reven_amt",true);
		dm.vat_amt = Util.getSessionParameterValue(req,"vat_amt",true);
		dm.rcpm_amt = Util.getSessionParameterValue(req,"rcpm_amt",true);
		dm.stmt_occr_dt = Util.getSessionParameterValue(req,"stmt_occr_dt",true);
		dm.stmt_occr_seq = Util.getSessionParameterValue(req,"stmt_occr_seq",true);
		dm.p_upd_reven_occr_dt = Util.getSessionParameterValue(req,"p_upd_reven_occr_dt",true);
		dm.p_upd_reven_occr_seq = Util.getSessionParameterValue(req,"p_upd_reven_occr_seq",true);
		dm.chrg_dept_cd = Util.getSessionParameterValue(req,"chrg_dept_cd",true);
		dm.chrg_pers_emp_no = Util.getSessionParameterValue(req,"chrg_pers_emp_no",true);
		dm.evnt_yy = Util.getSessionParameterValue(req,"evnt_yy",true);
		dm.evnt_cd = Util.getSessionParameterValue(req,"evnt_cd",true);
		dm.evnt_seq = Util.getSessionParameterValue(req,"evnt_seq",true);
		dm.payo_clsf_cd = Util.getSessionParameterValue(req,"payo_clsf_cd",true);
		dm.rcpm_occr_dt = Util.getSessionParameterValue(req,"rcpm_occr_dt",true);
		dm.rcpm_occr_seq = Util.getSessionParameterValue(req,"rcpm_occr_seq",true);
		dm.remk = Util.getSessionParameterValue(req,"remk",true);
		dm.drcr_clsf = Util.getSessionParameterValue(req,"drcr_clsf",true);
		dm.budg_cd = Util.getSessionParameterValue(req,"budg_cd",true);
		dm.amt = Util.getSessionParameterValue(req,"amt",true);
		dm.acct_mang_no = Util.getSessionParameterValue(req,"acct_mang_no",true);
		dm.rmtt_dt = Util.getSessionParameterValue(req,"rmtt_dt",true);
		dm.rmtt_plac = Util.getSessionParameterValue(req,"rmtt_plac",true);
		dm.note_no = Util.getSessionParameterValue(req,"note_no",true);
		dm.note_clsf_cd = Util.getSessionParameterValue(req,"note_clsf_cd",true);
		dm.bank_cd = Util.getSessionParameterValue(req,"bank_cd",true);
		dm.issu_pers_nm = Util.getSessionParameterValue(req,"issu_pers_nm",true);
		dm.issu_cmpy_clsf_cd = Util.getSessionParameterValue(req,"issu_cmpy_clsf_cd",true);
		dm.comp_dt = Util.getSessionParameterValue(req,"comp_dt",true);
		dm.mtry_dt = Util.getSessionParameterValue(req,"mtry_dt",true);
		dm.rcpm_acct = Util.getSessionParameterValue(req,"rcpm_acct",true);
		dm.sale_aprv_no = Util.getSessionParameterValue(req,"sale_aprv_no",true);
		dm.chg_unrcp_amt = Util.getSessionParameterValue(req,"chg_unrcp_amt",true);
		dm.chk_note_no = Util.getSessionParameterValue(req,"chk_note_no",true);
		dm.chk_bank_cd = Util.getSessionParameterValue(req,"chk_bank_cd",true);
		*******************************************************************************************/
	}
	public void en_innexp_1020_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISENP");
		EN_INNEXP_1020_ADataSet ds = null;
		EN_INNEXP_1020_ADM dm = new EN_INNEXP_1020_ADM();

		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		String multiUpdateData2 = Util.checkString(req.getParameter("multiUpdateData2"));
		System.out.println(multiUpdateData);
		System.out.println(multiUpdateData2);
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);
		Hashtable hash2 = getHashMultiUpdateData(multiUpdateData2);

		dm.mst_mode = Util.checkString(req.getParameter("mst_mode"));
		dm.incmg_pers_ip = Util.checkString(req.getRemoteAddr());
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.chg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.occr_dt = Util.checkString(req.getParameter("occr_dt"));
		dm.occr_seq = Util.checkString(req.getParameter("occr_seq"));
		dm.reven_dt = Util.checkString(req.getParameter("reven_dt"));
		dm.dlco_clsf_cd = Util.checkString(req.getParameter("dlco_clsf_cd"));
		dm.dlco_no = Util.checkString(req.getParameter("dlco_no"));
		dm.boks_dlco_nm = Util.checkString(req.getParameter("boks_dlco_nm"));
		dm.titl = Util.checkString(req.getParameter("titl"));
		dm.rcpm_shet_kind = Util.checkString(req.getParameter("rcpm_shet_kind"));
		dm.rcpm_shet_no = Util.checkString(req.getParameter("rcpm_shet_no"));
		dm.reven_amt = Util.checkString(req.getParameter("reven_amt"));
		dm.vat_amt = Util.checkString(req.getParameter("vat_amt"));
		dm.rcpm_amt = Util.checkString(req.getParameter("rcpm_amt"));
		dm.stmt_occr_dt = Util.checkString(req.getParameter("stmt_occr_dt"));
		dm.stmt_occr_seq = Util.checkString(req.getParameter("stmt_occr_seq"));
		dm.chrg_dept_cd = Util.checkString(req.getParameter("chrg_dept_cd"));
		dm.chrg_pers_emp_no = Util.checkString(req.getParameter("chrg_pers_emp_no"));
		dm.evnt_yy = Util.checkString(req.getParameter("evnt_yy"));
		dm.evnt_cd = Util.checkString(req.getParameter("evnt_cd"));
		dm.evnt_seq = Util.checkString(req.getParameter("evnt_seq"));
		dm.remk = Util.checkString(req.getParameter("remk"));
		dm.payo_clsf = Util.checkString(req.getParameter("payo_clsf"));
		dm.rcpm_occr_dt = Util.checkString(req.getParameter("rcpm_occr_dt"));
		dm.rcpm_occr_seq = Util.checkString(req.getParameter("rcpm_occr_seq"));
		dm.p_upd_occr_dt = Util.checkString(req.getParameter("p_upd_occr_dt"));
		dm.p_upd_occr_seq = Util.checkString(req.getParameter("p_upd_occr_seq"));
		
		dm.drcr_clsf = Util.checkString((String)hash.get("drcr_clsf"));
		dm.budg_cd = Util.checkString((String)hash.get("budg_cd"));
		dm.amt = Util.checkString((String)hash.get("amt"));
		dm.acct_mang_no = Util.checkString((String)hash.get("acct_mang_no"));
		dm.rmtt_dt = Util.checkString((String)hash.get("rmtt_dt"));
		dm.rmtt_plac = Util.checkString((String)hash.get("rmtt_plac"));
		dm.note_no = Util.checkString((String)hash.get("note_no"));
		dm.note_clsf_cd = Util.checkString((String)hash.get("note_clsf_cd"));
		dm.bank_cd = Util.checkString((String)hash.get("bank_cd"));
		dm.issu_pers_nm = Util.checkString((String)hash.get("issu_pers_nm"));
		dm.issu_cmpy_clsf_cd = Util.checkString((String)hash.get("issu_cmpy_clsf_cd"));
		dm.comp_dt = Util.checkString((String)hash.get("comp_dt"));
		dm.mtry_dt = Util.checkString((String)hash.get("mtry_dt"));
		dm.rcpm_acct = Util.checkString((String)hash.get("rcpm_acct"));
		dm.sale_aprv_no = Util.checkString((String)hash.get("sale_aprv_no"));
		dm.bal_occr_slip_no = Util.checkString((String)hash.get("bal_occr_slip_no"));
		dm.extnc_dlco_no = Util.checkString((String)hash.get("extnc_dlco_no"));
		dm.extnc_obj_slip_clsf = Util.checkString((String)hash.get("extnc_obj_slip_clsf"));
		dm.medi_cd = Util.checkString((String)hash.get("medi_cd"));
		dm.biz_reg_no = Util.checkString((String)hash.get("biz_reg_no"));
		dm.bank_id = Util.checkString((String)hash.get("bank_id"));
		dm.acct_num = Util.checkString((String)hash.get("acct_num"));
		dm.tran_date = Util.checkString((String)hash.get("tran_date"));
		dm.tran_date_seq = Util.checkString((String)hash.get("tran_date_seq"));
		dm.slip_no = Util.checkString((String)hash.get("slip_no"));

		dm.vitl_biz_reg_no = Util.checkString((String)hash2.get("biz_reg_no"));
		dm.vitl_bank_id = Util.checkString((String)hash2.get("bank_id"));
		dm.vitl_acct_num = Util.checkString((String)hash2.get("acct_num"));
		dm.vitl_tran_date = Util.checkString((String)hash2.get("tran_date"));
		dm.vitl_tran_date_seq = Util.checkString((String)hash2.get("tran_date_seq"));
		dm.vitl_slip_no = Util.checkString((String)hash2.get("slip_no"));
		dm.vitl_extnc_amt = Util.checkString((String)hash2.get("extnc_amt"));

		dm.chg_unrcp_amt = Util.checkString(req.getParameter("chg_unrcp_amt"));
		dm.chk_note_no = Util.checkString(req.getParameter("chk_note_no"));
		dm.chk_bank_cd = Util.checkString(req.getParameter("chk_bank_cd"));
		
		dm.print();

		ds = (EN_INNEXP_1020_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);

		/*
		try {
			EN_INNEXP_1000EJBHome home = (EN_INNEXP_1000EJBHome)JNDIManager.getInstance().getHome("EN_INNEXP_1000EJB");
			EN_INNEXP_1000EJB ejb = home.create();

			ds = ejb.en_innexp_1020_a(dm);
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

		dm.mst_mode = (String)hash.get("mst_mode");
		dm.incmg_pers_ip = (String)hash.get("incmg_pers_ip");
		dm.incmg_pers = (String)hash.get("incmg_pers");
		dm.chg_pers = (String)hash.get("chg_pers");
		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.occr_dt = (String)hash.get("occr_dt");
		dm.occr_seq = (String)hash.get("occr_seq");
		dm.reven_dt = (String)hash.get("reven_dt");
		dm.dlco_clsf_cd = (String)hash.get("dlco_clsf_cd");
		dm.dlco_no = (String)hash.get("dlco_no");
		dm.boks_dlco_nm = (String)hash.get("boks_dlco_nm");
		dm.titl = (String)hash.get("titl");
		dm.rcpm_shet_kind = (String)hash.get("rcpm_shet_kind");
		dm.rcpm_shet_no = (String)hash.get("rcpm_shet_no");
		dm.reven_amt = (String)hash.get("reven_amt");
		dm.vat_amt = (String)hash.get("vat_amt");
		dm.rcpm_amt = (String)hash.get("rcpm_amt");
		dm.stmt_occr_dt = (String)hash.get("stmt_occr_dt");
		dm.stmt_occr_seq = (String)hash.get("stmt_occr_seq");
		dm.p_upd_reven_occr_dt = (String)hash.get("p_upd_reven_occr_dt");
		dm.p_upd_reven_occr_seq = (String)hash.get("p_upd_reven_occr_seq");
		dm.chrg_dept_cd = (String)hash.get("chrg_dept_cd");
		dm.chrg_pers_emp_no = (String)hash.get("chrg_pers_emp_no");
		dm.evnt_yy = (String)hash.get("evnt_yy");
		dm.evnt_cd = (String)hash.get("evnt_cd");
		dm.evnt_seq = (String)hash.get("evnt_seq");
		dm.payo_clsf_cd = (String)hash.get("payo_clsf_cd");
		dm.rcpm_occr_dt = (String)hash.get("rcpm_occr_dt");
		dm.rcpm_occr_seq = (String)hash.get("rcpm_occr_seq");
		dm.remk = (String)hash.get("remk");
		dm.drcr_clsf = (String)hash.get("drcr_clsf");
		dm.budg_cd = (String)hash.get("budg_cd");
		dm.amt = (String)hash.get("amt");
		dm.acct_mang_no = (String)hash.get("acct_mang_no");
		dm.rmtt_dt = (String)hash.get("rmtt_dt");
		dm.rmtt_plac = (String)hash.get("rmtt_plac");
		dm.note_no = (String)hash.get("note_no");
		dm.note_clsf_cd = (String)hash.get("note_clsf_cd");
		dm.bank_cd = (String)hash.get("bank_cd");
		dm.issu_pers_nm = (String)hash.get("issu_pers_nm");
		dm.issu_cmpy_clsf_cd = (String)hash.get("issu_cmpy_clsf_cd");
		dm.comp_dt = (String)hash.get("comp_dt");
		dm.mtry_dt = (String)hash.get("mtry_dt");
		dm.rcpm_acct = (String)hash.get("rcpm_acct");
		dm.sale_aprv_no = (String)hash.get("sale_aprv_no");
		dm.chg_unrcp_amt = (String)hash.get("chg_unrcp_amt");
		dm.chk_note_no = (String)hash.get("chk_note_no");
		dm.chk_bank_cd = (String)hash.get("chk_bank_cd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.mst_mode = Util.getSessionParameterValue(req,"mst_mode",true);
		dm.incmg_pers_ip = Util.getSessionParameterValue(req,"incmg_pers_ip",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"incmg_pers",true);
		dm.chg_pers = Util.getSessionParameterValue(req,"chg_pers",true);
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.occr_dt = Util.getSessionParameterValue(req,"occr_dt",true);
		dm.occr_seq = Util.getSessionParameterValue(req,"occr_seq",true);
		dm.reven_dt = Util.getSessionParameterValue(req,"reven_dt",true);
		dm.dlco_clsf_cd = Util.getSessionParameterValue(req,"dlco_clsf_cd",true);
		dm.dlco_no = Util.getSessionParameterValue(req,"dlco_no",true);
		dm.boks_dlco_nm = Util.getSessionParameterValue(req,"boks_dlco_nm",true);
		dm.titl = Util.getSessionParameterValue(req,"titl",true);
		dm.rcpm_shet_kind = Util.getSessionParameterValue(req,"rcpm_shet_kind",true);
		dm.rcpm_shet_no = Util.getSessionParameterValue(req,"rcpm_shet_no",true);
		dm.reven_amt = Util.getSessionParameterValue(req,"reven_amt",true);
		dm.vat_amt = Util.getSessionParameterValue(req,"vat_amt",true);
		dm.rcpm_amt = Util.getSessionParameterValue(req,"rcpm_amt",true);
		dm.stmt_occr_dt = Util.getSessionParameterValue(req,"stmt_occr_dt",true);
		dm.stmt_occr_seq = Util.getSessionParameterValue(req,"stmt_occr_seq",true);
		dm.p_upd_reven_occr_dt = Util.getSessionParameterValue(req,"p_upd_reven_occr_dt",true);
		dm.p_upd_reven_occr_seq = Util.getSessionParameterValue(req,"p_upd_reven_occr_seq",true);
		dm.chrg_dept_cd = Util.getSessionParameterValue(req,"chrg_dept_cd",true);
		dm.chrg_pers_emp_no = Util.getSessionParameterValue(req,"chrg_pers_emp_no",true);
		dm.evnt_yy = Util.getSessionParameterValue(req,"evnt_yy",true);
		dm.evnt_cd = Util.getSessionParameterValue(req,"evnt_cd",true);
		dm.evnt_seq = Util.getSessionParameterValue(req,"evnt_seq",true);
		dm.payo_clsf_cd = Util.getSessionParameterValue(req,"payo_clsf_cd",true);
		dm.rcpm_occr_dt = Util.getSessionParameterValue(req,"rcpm_occr_dt",true);
		dm.rcpm_occr_seq = Util.getSessionParameterValue(req,"rcpm_occr_seq",true);
		dm.remk = Util.getSessionParameterValue(req,"remk",true);
		dm.drcr_clsf = Util.getSessionParameterValue(req,"drcr_clsf",true);
		dm.budg_cd = Util.getSessionParameterValue(req,"budg_cd",true);
		dm.amt = Util.getSessionParameterValue(req,"amt",true);
		dm.acct_mang_no = Util.getSessionParameterValue(req,"acct_mang_no",true);
		dm.rmtt_dt = Util.getSessionParameterValue(req,"rmtt_dt",true);
		dm.rmtt_plac = Util.getSessionParameterValue(req,"rmtt_plac",true);
		dm.note_no = Util.getSessionParameterValue(req,"note_no",true);
		dm.note_clsf_cd = Util.getSessionParameterValue(req,"note_clsf_cd",true);
		dm.bank_cd = Util.getSessionParameterValue(req,"bank_cd",true);
		dm.issu_pers_nm = Util.getSessionParameterValue(req,"issu_pers_nm",true);
		dm.issu_cmpy_clsf_cd = Util.getSessionParameterValue(req,"issu_cmpy_clsf_cd",true);
		dm.comp_dt = Util.getSessionParameterValue(req,"comp_dt",true);
		dm.mtry_dt = Util.getSessionParameterValue(req,"mtry_dt",true);
		dm.rcpm_acct = Util.getSessionParameterValue(req,"rcpm_acct",true);
		dm.sale_aprv_no = Util.getSessionParameterValue(req,"sale_aprv_no",true);
		dm.chg_unrcp_amt = Util.getSessionParameterValue(req,"chg_unrcp_amt",true);
		dm.chk_note_no = Util.getSessionParameterValue(req,"chk_note_no",true);
		dm.chk_bank_cd = Util.getSessionParameterValue(req,"chk_bank_cd",true);
		*******************************************************************************************/
	}
	public void en_innexp_1011_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISENP");
		EN_INNEXP_1011_LDataSet ds = null;
		EN_INNEXP_1011_LDM dm = new EN_INNEXP_1011_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.print();

		ds = (EN_INNEXP_1011_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);

		/*
		try {
			EN_INNEXP_1000EJBHome home = (EN_INNEXP_1000EJBHome)JNDIManager.getInstance().getHome("EN_INNEXP_1000EJB");
			EN_INNEXP_1000EJB ejb = home.create();

			ds = ejb.en_innexp_1011_l(dm);
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

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		*******************************************************************************************/
	}

	public void en_innexp_1012_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISENP");
		EN_INNEXP_1012_LDataSet ds = null;
		EN_INNEXP_1012_LDM dm = new EN_INNEXP_1012_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.bal_occr_slip_no = Util.checkString(req.getParameter("bal_occr_slip_no"));
		dm.print();

		ds = (EN_INNEXP_1012_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);

		/*
		try {
			EN_INNEXP_1000EJBHome home = (EN_INNEXP_1000EJBHome)JNDIManager.getInstance().getHome("EN_INNEXP_1000EJB");
			EN_INNEXP_1000EJB ejb = home.create();

			ds = ejb.en_innexp_1012_l(dm);
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
		dm.bal_occr_slip_no = (String)hash.get("bal_occr_slip_no");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.bal_occr_slip_no = Util.getSessionParameterValue(req,"bal_occr_slip_no",true);
		*******************************************************************************************/
	}

	public void en_innexp_1013_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISENP");
		EN_INNEXP_1013_LDataSet ds = null;
		EN_INNEXP_1013_LDM dm = new EN_INNEXP_1013_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.bal_occr_slip_no = Util.checkString(req.getParameter("bal_occr_slip_no"));
		dm.print();

		ds = (EN_INNEXP_1013_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);

		/*
		try {
			EN_INNEXP_1000EJBHome home = (EN_INNEXP_1000EJBHome)JNDIManager.getInstance().getHome("EN_INNEXP_1000EJB");
			EN_INNEXP_1000EJB ejb = home.create();

			ds = ejb.en_innexp_1013_l(dm);
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
		dm.bal_occr_slip_no = (String)hash.get("bal_occr_slip_no");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.bal_occr_slip_no = Util.getSessionParameterValue(req,"bal_occr_slip_no",true);
		*******************************************************************************************/
	}

	public void en_innexp_1014_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISENP");
		EN_INNEXP_1014_LDataSet ds = null;
		EN_INNEXP_1014_LDM dm = new EN_INNEXP_1014_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.evnt_yy = Util.checkString(req.getParameter("evnt_yy"));
		dm.evnt_cd = Util.checkString(req.getParameter("evnt_cd"));
		dm.evnt_seq = Util.checkString(req.getParameter("evnt_seq"));
		dm.print();

		ds = (EN_INNEXP_1014_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);

		/*
		try {
			EN_INNEXP_1000EJBHome home = (EN_INNEXP_1000EJBHome)JNDIManager.getInstance().getHome("EN_INNEXP_1000EJB");
			EN_INNEXP_1000EJB ejb = home.create();

			ds = ejb.en_innexp_1014_l(dm);
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

	public void en_innexp_1015_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISENP");
		EN_INNEXP_1015_LDataSet ds = null;
		EN_INNEXP_1015_LDM dm = new EN_INNEXP_1015_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.clos_dt = Util.checkString(req.getParameter("clos_dt"));
		dm.print();

		ds = (EN_INNEXP_1015_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);

		/*
		try {
			EN_INNEXP_1000EJBHome home = (EN_INNEXP_1000EJBHome)JNDIManager.getInstance().getHome("EN_INNEXP_1000EJB");
			EN_INNEXP_1000EJB ejb = home.create();

			ds = ejb.en_innexp_1015_l(dm);
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
		dm.clos_dt = (String)hash.get("clos_dt");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.clos_dt = Util.getSessionParameterValue(req,"clos_dt",true);
		*******************************************************************************************/
	}

	public void en_innexp_1016_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISENP");
		EN_INNEXP_1016_LDataSet ds = null;
		EN_INNEXP_1016_LDM dm = new EN_INNEXP_1016_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.evnt_yy = Util.checkString(req.getParameter("evnt_yy"));
		dm.evnt_cd = Util.checkString(req.getParameter("evnt_cd"));
		dm.evnt_seq = Util.checkString(req.getParameter("evnt_seq"));
		dm.reven_dt = Util.checkString(req.getParameter("reven_dt"));
		dm.print();

		ds = (EN_INNEXP_1016_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);

		/*
		try {
			EN_INNEXP_1000EJBHome home = (EN_INNEXP_1000EJBHome)JNDIManager.getInstance().getHome("EN_INNEXP_1000EJB");
			EN_INNEXP_1000EJB ejb = home.create();

			ds = ejb.en_innexp_1016_l(dm);
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
		dm.occr_dt = (String)hash.get("occr_dt");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.evnt_yy = Util.getSessionParameterValue(req,"evnt_yy",true);
		dm.evnt_cd = Util.getSessionParameterValue(req,"evnt_cd",true);
		dm.evnt_seq = Util.getSessionParameterValue(req,"evnt_seq",true);
		dm.occr_dt = Util.getSessionParameterValue(req,"occr_dt",true);
		*******************************************************************************************/
	}

	public void en_innexp_1017_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISENP");
		EN_INNEXP_1017_MDataSet ds = null;
		EN_INNEXP_1017_MDM dm = new EN_INNEXP_1017_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.evnt_yy = Util.checkString(req.getParameter("evnt_yy"));
		dm.evnt_cd = Util.checkString(req.getParameter("evnt_cd"));
		dm.evnt_seq = Util.checkString(req.getParameter("evnt_seq"));
		dm.print();

		ds = (EN_INNEXP_1017_MDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);

		/*
		try {
			EN_INNEXP_1000EJBHome home = (EN_INNEXP_1000EJBHome)JNDIManager.getInstance().getHome("EN_INNEXP_1000EJB");
			EN_INNEXP_1000EJB ejb = home.create();

			ds = ejb.en_innexp_1017_m(dm);
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
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.evnt_yy = Util.getSessionParameterValue(req,"evnt_yy",true);
		dm.evnt_cd = Util.getSessionParameterValue(req,"evnt_cd",true);
		*******************************************************************************************/
	}

	public void en_innexp_1019_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISENP");
		EN_INNEXP_1019_MDataSet ds = null;
		EN_INNEXP_1019_MDM dm = new EN_INNEXP_1019_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.evnt_yy = Util.checkString(req.getParameter("evnt_yy"));
		dm.evnt_cd = Util.checkString(req.getParameter("evnt_cd"));
		dm.evnt_seq = Util.checkString(req.getParameter("evnt_seq"));
		dm.print();

		ds = (EN_INNEXP_1019_MDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
		
		/*
		try {
			EN_INNEXP_1000EJBHome home = (EN_INNEXP_1000EJBHome)JNDIManager.getInstance().getHome("EN_INNEXP_1000EJB");
			EN_INNEXP_1000EJB ejb = home.create();

			ds = ejb.en_innexp_1019_m(dm);
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

	public void en_innexp_1100_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISENP");
		EN_INNEXP_1100_MDataSet ds = null;
		EN_INNEXP_1100_MDM dm = new EN_INNEXP_1100_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.print();

		ds = (EN_INNEXP_1100_MDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);

		/*
		try {
			EN_INNEXP_1000EJBHome home = (EN_INNEXP_1000EJBHome)JNDIManager.getInstance().getHome("EN_INNEXP_1000EJB");
			EN_INNEXP_1000EJB ejb = home.create();

			ds = ejb.en_innexp_1100_m(dm);
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

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		*******************************************************************************************/
	}

	public void en_innexp_1101_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISENP");
		EN_INNEXP_1101_LDataSet ds = null;
		EN_INNEXP_1101_LDM dm = new EN_INNEXP_1101_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.slip_occr_dt_fr = Util.checkString(req.getParameter("slip_occr_dt_fr"));
		dm.slip_occr_dt_to = Util.checkString(req.getParameter("slip_occr_dt_to"));
		dm.make_dt_fr = Util.checkString(req.getParameter("make_dt_fr"));
		dm.make_dt_to = Util.checkString(req.getParameter("make_dt_to"));
		dm.dlco_nm = Util.checkString(req.getParameter("dlco_nm"));
		dm.print();

		ds = (EN_INNEXP_1101_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);

		/*
		try {
			EN_INNEXP_1000EJBHome home = (EN_INNEXP_1000EJBHome)JNDIManager.getInstance().getHome("EN_INNEXP_1000EJB");
			EN_INNEXP_1000EJB ejb = home.create();

			ds = ejb.en_innexp_1101_l(dm);
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
		dm.slip_occr_dt_fr = (String)hash.get("slip_occr_dt_fr");
		dm.slip_occr_dt_to = (String)hash.get("slip_occr_dt_to");
		dm.make_dt_fr = (String)hash.get("make_dt_fr");
		dm.make_dt_to = (String)hash.get("make_dt_to");
		dm.dlco_nm = (String)hash.get("dlco_nm");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.slip_occr_dt_fr = Util.getSessionParameterValue(req,"slip_occr_dt_fr",true);
		dm.slip_occr_dt_to = Util.getSessionParameterValue(req,"slip_occr_dt_to",true);
		dm.make_dt_fr = Util.getSessionParameterValue(req,"make_dt_fr",true);
		dm.make_dt_to = Util.getSessionParameterValue(req,"make_dt_to",true);
		dm.dlco_nm = Util.getSessionParameterValue(req,"dlco_nm",true);
		*******************************************************************************************/
	}

	public void en_innexp_1102_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISENP");
		EN_INNEXP_1102_LDataSet ds = null;
		EN_INNEXP_1102_LDM dm = new EN_INNEXP_1102_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.occr_dt_fr = Util.checkString(req.getParameter("occr_dt_fr"));
		dm.occr_dt_to = Util.checkString(req.getParameter("occr_dt_to"));
		dm.slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
		dm.prof_type_cd = Util.checkString(req.getParameter("prof_type_cd"));
		dm.srch_clsf = Util.checkString(req.getParameter("srch_clsf"));
		dm.print();

		ds = (EN_INNEXP_1102_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);

		/*
		try {
			EN_INNEXP_1000EJBHome home = (EN_INNEXP_1000EJBHome)JNDIManager.getInstance().getHome("EN_INNEXP_1000EJB");
			EN_INNEXP_1000EJB ejb = home.create();

			ds = ejb.en_innexp_1102_l(dm);
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
		dm.occr_dt_fr = (String)hash.get("occr_dt_fr");
		dm.occr_dt_to = (String)hash.get("occr_dt_to");
		dm.slip_clsf_cd = (String)hash.get("slip_clsf_cd");
		dm.prof_type_cd = (String)hash.get("prof_type_cd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.occr_dt_fr = Util.getSessionParameterValue(req,"occr_dt_fr",true);
		dm.occr_dt_to = Util.getSessionParameterValue(req,"occr_dt_to",true);
		dm.slip_clsf_cd = Util.getSessionParameterValue(req,"slip_clsf_cd",true);
		dm.prof_type_cd = Util.getSessionParameterValue(req,"prof_type_cd",true);
		*******************************************************************************************/
	}

	public void en_innexp_1103_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISENP");
		EN_INNEXP_1103_ADataSet ds = null;
		EN_INNEXP_1103_ADM dm = new EN_INNEXP_1103_ADM();

		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		System.out.println(multiUpdateData);
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.mst_mode = Util.checkString(req.getParameter("mst_mode"));
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers_ip = Util.checkString(req.getRemoteAddr());
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.chg_pers = Util.getSessionParameterValue(req,"emp_no",true);

		dm.occr_dt = Util.checkString((String)hash.get("occr_dt"));
		dm.occr_seq = Util.checkString((String)hash.get("occr_seq"));
		dm.titl = Util.checkString((String)hash.get("titl"));
		dm.reven_amt = Util.checkString((String)hash.get("reven_amt"));
		dm.vat_amt = Util.checkString((String)hash.get("vat_amt"));

		dm.slip_occr_dt = Util.checkString(req.getParameter("slip_occr_dt"));
		dm.slip_seq = Util.checkString(req.getParameter("slip_seq"));
		dm.prof_type_cd = Util.checkString(req.getParameter("prof_type_cd"));
		dm.slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
		dm.make_dt = Util.checkString(req.getParameter("make_dt"));
		dm.erplace_cd = Util.checkString(req.getParameter("erplace_cd"));
		dm.dlco_clsf_cd = Util.checkString(req.getParameter("dlco_clsf_cd"));
		dm.dlco_cd = Util.checkString(req.getParameter("dlco_cd"));
		dm.deal_clsf = Util.checkString(req.getParameter("deal_clsf"));
		dm.ern = Util.checkString(req.getParameter("ern"));
		dm.dlco_nm = Util.checkString(req.getParameter("dlco_nm"));
		dm.presi_nm = Util.checkString(req.getParameter("presi_nm"));
		dm.addr = Util.checkString(req.getParameter("addr"));
		dm.bizcond = Util.checkString(req.getParameter("bizcond"));
		dm.item = Util.checkString(req.getParameter("item"));
		dm.tax_suply_amt = Util.checkString(req.getParameter("tax_suply_amt"));
		dm.tax_vat_amt = Util.checkString(req.getParameter("tax_vat_amt"));
		dm.vexc_cmpy_cd = Util.checkString(req.getParameter("vexc_cmpy_cd"));
		dm.evnt_cd = Util.checkString(req.getParameter("evnt_cd"));
		dm.ask_emp_no = Util.checkString(req.getParameter("ask_emp_no"));
		dm.ask_dept_cd = Util.checkString(req.getParameter("ask_dept_cd"));
		dm.remk = Util.checkString(req.getParameter("remk"));

		
		dm.print();

		ds = (EN_INNEXP_1103_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
		
		/*
		try {
			EN_INNEXP_1000EJBHome home = (EN_INNEXP_1000EJBHome)JNDIManager.getInstance().getHome("EN_INNEXP_1000EJB");
			EN_INNEXP_1000EJB ejb = home.create();

			ds = ejb.en_innexp_1103_a(dm);
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

		dm.mst_mode = (String)hash.get("mst_mode");
		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.incmg_pers_ip = (String)hash.get("incmg_pers_ip");
		dm.incmg_pers = (String)hash.get("incmg_pers");
		dm.chg_pers = (String)hash.get("chg_pers");
		dm.occr_dt = (String)hash.get("occr_dt");
		dm.occr_seq = (String)hash.get("occr_seq");
		dm.titl = (String)hash.get("titl");
		dm.reven_amt = (String)hash.get("reven_amt");
		dm.vat_amt = (String)hash.get("vat_amt");
		dm.prof_type_cd = (String)hash.get("prof_type_cd");
		dm.slip_clsf_cd = (String)hash.get("slip_clsf_cd");
		dm.stmt_occr_dt = (String)hash.get("stmt_occr_dt");
		dm.stmt_occr_seq = (String)hash.get("stmt_occr_seq");
		dm.make_dt = (String)hash.get("make_dt");
		dm.erplace_cd = (String)hash.get("erplace_cd");
		dm.dlco_clsf_cd = (String)hash.get("dlco_clsf_cd");
		dm.dlco_cd = (String)hash.get("dlco_cd");
		dm.deal_clsf = (String)hash.get("deal_clsf");
		dm.ern = (String)hash.get("ern");
		dm.dlco_nm = (String)hash.get("dlco_nm");
		dm.presi_nm = (String)hash.get("presi_nm");
		dm.addr = (String)hash.get("addr");
		dm.bizcond = (String)hash.get("bizcond");
		dm.item = (String)hash.get("item");
		dm.tax_suply_amt = (String)hash.get("tax_suply_amt");
		dm.tax_vat_amt = (String)hash.get("tax_vat_amt");
		dm.tax_stmt_aprv_yn = (String)hash.get("tax_stmt_aprv_yn");
		dm.vexc_cmpy_cd = (String)hash.get("vexc_cmpy_cd");
		dm.setoff_yn = (String)hash.get("setoff_yn");
		dm.evnt_cd = (String)hash.get("evnt_cd");
		dm.ask_emp_no = (String)hash.get("ask_emp_no");
		dm.ask_dept_cd = (String)hash.get("ask_dept_cd");
		dm.remk = (String)hash.get("remk");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.mst_mode = Util.getSessionParameterValue(req,"mst_mode",true);
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.incmg_pers_ip = Util.getSessionParameterValue(req,"incmg_pers_ip",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"incmg_pers",true);
		dm.chg_pers = Util.getSessionParameterValue(req,"chg_pers",true);
		dm.occr_dt = Util.getSessionParameterValue(req,"occr_dt",true);
		dm.occr_seq = Util.getSessionParameterValue(req,"occr_seq",true);
		dm.titl = Util.getSessionParameterValue(req,"titl",true);
		dm.reven_amt = Util.getSessionParameterValue(req,"reven_amt",true);
		dm.vat_amt = Util.getSessionParameterValue(req,"vat_amt",true);
		dm.prof_type_cd = Util.getSessionParameterValue(req,"prof_type_cd",true);
		dm.slip_clsf_cd = Util.getSessionParameterValue(req,"slip_clsf_cd",true);
		dm.stmt_occr_dt = Util.getSessionParameterValue(req,"stmt_occr_dt",true);
		dm.stmt_occr_seq = Util.getSessionParameterValue(req,"stmt_occr_seq",true);
		dm.make_dt = Util.getSessionParameterValue(req,"make_dt",true);
		dm.erplace_cd = Util.getSessionParameterValue(req,"erplace_cd",true);
		dm.dlco_clsf_cd = Util.getSessionParameterValue(req,"dlco_clsf_cd",true);
		dm.dlco_cd = Util.getSessionParameterValue(req,"dlco_cd",true);
		dm.deal_clsf = Util.getSessionParameterValue(req,"deal_clsf",true);
		dm.ern = Util.getSessionParameterValue(req,"ern",true);
		dm.dlco_nm = Util.getSessionParameterValue(req,"dlco_nm",true);
		dm.presi_nm = Util.getSessionParameterValue(req,"presi_nm",true);
		dm.addr = Util.getSessionParameterValue(req,"addr",true);
		dm.bizcond = Util.getSessionParameterValue(req,"bizcond",true);
		dm.item = Util.getSessionParameterValue(req,"item",true);
		dm.tax_suply_amt = Util.getSessionParameterValue(req,"tax_suply_amt",true);
		dm.tax_vat_amt = Util.getSessionParameterValue(req,"tax_vat_amt",true);
		dm.tax_stmt_aprv_yn = Util.getSessionParameterValue(req,"tax_stmt_aprv_yn",true);
		dm.vexc_cmpy_cd = Util.getSessionParameterValue(req,"vexc_cmpy_cd",true);
		dm.setoff_yn = Util.getSessionParameterValue(req,"setoff_yn",true);
		dm.evnt_cd = Util.getSessionParameterValue(req,"evnt_cd",true);
		dm.ask_emp_no = Util.getSessionParameterValue(req,"ask_emp_no",true);
		dm.ask_dept_cd = Util.getSessionParameterValue(req,"ask_dept_cd",true);
		dm.remk = Util.getSessionParameterValue(req,"remk",true);
		*******************************************************************************************/
	}

	public void en_innexp_1301_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISENP");
		EN_INNEXP_1301_LDataSet ds = null;
		EN_INNEXP_1301_LDM dm = new EN_INNEXP_1301_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.clos_dt_fr = Util.checkString(req.getParameter("clos_dt_fr"));
		dm.clos_dt_to = Util.checkString(req.getParameter("clos_dt_to"));
		dm.print();

		ds = (EN_INNEXP_1301_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);

		/*
		try {
			EN_INNEXP_1000EJBHome home = (EN_INNEXP_1000EJBHome)JNDIManager.getInstance().getHome("EN_INNEXP_1000EJB");
			EN_INNEXP_1000EJB ejb = home.create();

			ds = ejb.en_innexp_1301_l(dm);
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
		dm.clos_dt_fr = (String)hash.get("clos_dt_fr");
		dm.clos_dt_to = (String)hash.get("clos_dt_to");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.clos_dt_fr = Util.getSessionParameterValue(req,"clos_dt_fr",true);
		dm.clos_dt_to = Util.getSessionParameterValue(req,"clos_dt_to",true);
		*******************************************************************************************/
	}

	public void en_innexp_1302_i(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISENP");
		EN_INNEXP_1302_IDataSet ds = null;
		EN_INNEXP_1302_IDM dm = new EN_INNEXP_1302_IDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.clos_dt = Util.checkString(req.getParameter("clos_dt"));
		dm.incmg_pers_ip = req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.print();

		ds = (EN_INNEXP_1302_IDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);

		/*
		try {
			EN_INNEXP_1000EJBHome home = (EN_INNEXP_1000EJBHome)JNDIManager.getInstance().getHome("EN_INNEXP_1000EJB");
			EN_INNEXP_1000EJB ejb = home.create();

			ds = ejb.en_innexp_1302_i(dm);
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
		dm.clos_dt = (String)hash.get("clos_dt");
		dm.incmg_pers_ip = (String)hash.get("incmg_pers_ip");
		dm.incmg_pers = (String)hash.get("incmg_pers");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.clos_dt = Util.getSessionParameterValue(req,"clos_dt",true);
		dm.incmg_pers_ip = Util.getSessionParameterValue(req,"incmg_pers_ip",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"incmg_pers",true);
		*******************************************************************************************/
	}

	public void en_innexp_1303_u(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISENP");
		EN_INNEXP_1303_UDataSet ds = null;
		EN_INNEXP_1303_UDM dm = new EN_INNEXP_1303_UDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.clos_dt = Util.checkString(req.getParameter("clos_dt"));
		dm.chg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.print();

		ds = (EN_INNEXP_1303_UDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
		
		/*
		try {
			EN_INNEXP_1000EJBHome home = (EN_INNEXP_1000EJBHome)JNDIManager.getInstance().getHome("EN_INNEXP_1000EJB");
			EN_INNEXP_1000EJB ejb = home.create();

			ds = ejb.en_innexp_1303_u(dm);
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
		dm.clos_dt = (String)hash.get("clos_dt");
		dm.chg_pers = (String)hash.get("chg_pers");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.clos_dt = Util.getSessionParameterValue(req,"clos_dt",true);
		dm.chg_pers = Util.getSessionParameterValue(req,"chg_pers",true);
		*******************************************************************************************/
	}
	
    public void en_innexp_1305_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	
    	DBManager manager = new DBManager("MISENP");
    	
		EN_INNEXP_1305_LDataSet ds = null;
		EN_INNEXP_1305_LDM dm = new EN_INNEXP_1305_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.clos_dt_fr = Util.checkString(req.getParameter("clos_dt_fr"));
		dm.clos_dt_to = Util.checkString(req.getParameter("clos_dt_to"));

		dm.print();
		
	    ds = (EN_INNEXP_1305_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
		
		/*	
		try {
			EN_INNEXP_1000EJBHome home = (EN_INNEXP_1000EJBHome)JNDIManager.getInstance().getHome("EN_INNEXP_1000EJB");
			EN_INNEXP_1000EJB ejb = home.create();

			ds = ejb.en_innexp_1305_l(dm);
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
       */ 
		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.clos_dt_fr = (String)hash.get("clos_dt_fr");
		dm.clos_dt_to = (String)hash.get("clos_dt_to");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.clos_dt_fr = Util.getSessionParameterValue(req,"clos_dt_fr",true);
		dm.clos_dt_to = Util.getSessionParameterValue(req,"clos_dt_to",true);
		*******************************************************************************************/
	}
    
   public void en_innexp_1306_i(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	
    	DBManager manager = new DBManager("MISENP");
    	
		EN_INNEXP_1306_IDataSet ds = null;
		EN_INNEXP_1306_IDM dm = new EN_INNEXP_1306_IDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.clos_dt = Util.checkString(req.getParameter("clos_dt"));
		dm.incmg_pers_ip = req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.print();
		
	    ds = (EN_INNEXP_1306_IDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
		
	}
   
   public void en_innexp_1307_i(HttpServletRequest req, HttpServletResponse res) throws AppException {
   	
   	DBManager manager = new DBManager("MISENP");
   	
		EN_INNEXP_1307_IDataSet ds = null;
		EN_INNEXP_1307_IDM dm = new EN_INNEXP_1307_IDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.clos_dt = Util.checkString(req.getParameter("clos_dt"));
		dm.incmg_pers_ip = req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.print();
		
	    ds = (EN_INNEXP_1307_IDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
       	System.out.println("DAO..error.");
           throw new AppException(ds.errcode, ds.errmsg);
       }
		
		req.setAttribute("ds", ds);
		
	}
   
   public void en_innexp_1308_u(HttpServletRequest req, HttpServletResponse res) throws AppException {
   	
   	DBManager manager = new DBManager("MISENP");
   	
		EN_INNEXP_1308_UDataSet ds = null;
		EN_INNEXP_1308_UDM dm = new EN_INNEXP_1308_UDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.clos_dt = Util.checkString(req.getParameter("clos_dt"));
		dm.chg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.print();
		
	    ds = (EN_INNEXP_1308_UDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
       	System.out.println("DAO..error.");
           throw new AppException(ds.errcode, ds.errmsg);
       }
		
		req.setAttribute("ds", ds);
		
	}
   
   public void en_innexp_1309_u(HttpServletRequest req, HttpServletResponse res) throws AppException {
   	
   	DBManager manager = new DBManager("MISENP");
   	
		EN_INNEXP_1309_UDataSet ds = null;
		EN_INNEXP_1309_UDM dm = new EN_INNEXP_1309_UDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.clos_dt = Util.checkString(req.getParameter("clos_dt"));
		dm.chg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.print();
		
	    ds = (EN_INNEXP_1309_UDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
       	System.out.println("DAO..error.");
           throw new AppException(ds.errcode, ds.errmsg);
       }
		
		req.setAttribute("ds", ds);
		
	}
	public void en_innexp_1401_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISENP");
		EN_INNEXP_1401_MDataSet ds = null;
		EN_INNEXP_1401_MDM dm = new EN_INNEXP_1401_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.print();

		ds = (EN_INNEXP_1401_MDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);

		/*
		try {
			EN_INNEXP_1000EJBHome home = (EN_INNEXP_1000EJBHome)JNDIManager.getInstance().getHome("EN_INNEXP_1000EJB");
			EN_INNEXP_1000EJB ejb = home.create();

			ds = ejb.en_innexp_1401_m(dm);
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

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		*******************************************************************************************/
	}

	public void en_innexp_1402_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISENP");
		EN_INNEXP_1402_LDataSet ds = null;
		EN_INNEXP_1402_LDM dm = new EN_INNEXP_1402_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.evnt_yy = Util.checkString(req.getParameter("evnt_yy"));
		dm.evnt_cd = Util.checkString(req.getParameter("evnt_cd"));
		dm.evnt_seq = Util.checkString(req.getParameter("evnt_seq"));
		dm.rcpm_unit_clsf = Util.checkString(req.getParameter("rcpm_unit_clsf"));
		dm.erp_transfer_yn = Util.checkString(req.getParameter("erp_transfer_yn"));
		dm.tran_date_fr = Util.checkString(req.getParameter("tran_date_fr"));
		dm.tran_date_to = Util.checkString(req.getParameter("tran_date_to"));
		dm.print();

		ds = (EN_INNEXP_1402_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);

		/*
		try {
			EN_INNEXP_1000EJBHome home = (EN_INNEXP_1000EJBHome)JNDIManager.getInstance().getHome("EN_INNEXP_1000EJB");
			EN_INNEXP_1000EJB ejb = home.create();

			ds = ejb.en_innexp_1402_l(dm);
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
		dm.rcpm_unit_clsf = (String)hash.get("rcpm_unit_clsf");
		dm.erp_transfer_yn = (String)hash.get("erp_transfer_yn");
		dm.tran_date_fr = (String)hash.get("tran_date_fr");
		dm.tran_date_to = (String)hash.get("tran_date_to");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.evnt_yy = Util.getSessionParameterValue(req,"evnt_yy",true);
		dm.evnt_cd = Util.getSessionParameterValue(req,"evnt_cd",true);
		dm.evnt_seq = Util.getSessionParameterValue(req,"evnt_seq",true);
		dm.rcpm_unit_clsf = Util.getSessionParameterValue(req,"rcpm_unit_clsf",true);
		dm.erp_transfer_yn = Util.getSessionParameterValue(req,"erp_transfer_yn",true);
		dm.tran_date_fr = Util.getSessionParameterValue(req,"tran_date_fr",true);
		dm.tran_date_to = Util.getSessionParameterValue(req,"tran_date_to",true);
		*******************************************************************************************/
	}

	public void en_innexp_1501_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISENP");
		EN_INNEXP_1501_LDataSet ds = null;
		EN_INNEXP_1501_LDM dm = new EN_INNEXP_1501_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.occr_dt_fr = Util.checkString(req.getParameter("occr_dt_fr"));
		dm.occr_dt_to = Util.checkString(req.getParameter("occr_dt_to"));

		dm.print();

		ds = (EN_INNEXP_1501_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);

		/*
		try {
			EN_INNEXP_1000EJBHome home = (EN_INNEXP_1000EJBHome)JNDIManager.getInstance().getHome("EN_INNEXP_1000EJB");
			EN_INNEXP_1000EJB ejb = home.create();

			ds = ejb.en_innexp_1501_l(dm);
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
		dm.occr_dt_fr = (String)hash.get("occr_dt_fr");
		dm.occr_dt_to = (String)hash.get("occr_dt_to");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.occr_dt_fr = Util.getSessionParameterValue(req,"occr_dt_fr",true);
		dm.occr_dt_to = Util.getSessionParameterValue(req,"occr_dt_to",true);
		*******************************************************************************************/
	}
	public void en_innexp_1502_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISENP");
		EN_INNEXP_1502_LDataSet ds = null;
		EN_INNEXP_1502_LDM dm = new EN_INNEXP_1502_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.occr_dt_fr_t2 = Util.checkString(req.getParameter("occr_dt_fr_t2"));
		dm.occr_dt_to_t2 = Util.checkString(req.getParameter("occr_dt_to_t2"));

		dm.print();

		ds = (EN_INNEXP_1502_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
		
		/*
		try {
			EN_INNEXP_1000EJBHome home = (EN_INNEXP_1000EJBHome)JNDIManager.getInstance().getHome("EN_INNEXP_1000EJB");
			EN_INNEXP_1000EJB ejb = home.create();

			ds = ejb.en_innexp_1502_l(dm);
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
		dm.occr_dt_fr_t2 = (String)hash.get("occr_dt_fr_t2");
		dm.occr_dt_to_t2 = (String)hash.get("occr_dt_to_t2");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.occr_dt_fr_t2 = Util.getSessionParameterValue(req,"occr_dt_fr_t2",true);
		dm.occr_dt_to_t2 = Util.getSessionParameterValue(req,"occr_dt_to_t2",true);
		*******************************************************************************************/
	}
	public void en_innexp_1503_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISENP");
		EN_INNEXP_1503_LDataSet ds = null;
		EN_INNEXP_1503_LDM dm = new EN_INNEXP_1503_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.occr_dt_f = Util.checkString(req.getParameter("occr_dt_f"));
		dm.occr_dt_t = Util.checkString(req.getParameter("occr_dt_t"));
		dm.clsf = Util.checkString(req.getParameter("clsf"));
		dm.evnt_yy = Util.checkString(req.getParameter("evnt_yy"));
		dm.evnt_cd = Util.checkString(req.getParameter("evnt_cd"));
		dm.evnt_seq = Util.checkString(req.getParameter("evnt_seq"));
		dm.tab_mode = Util.checkString(req.getParameter("tab_mode"));

		dm.print();

		ds = (EN_INNEXP_1503_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);

		/*
		try {
			EN_INNEXP_1000EJBHome home = (EN_INNEXP_1000EJBHome)JNDIManager.getInstance().getHome("EN_INNEXP_1000EJB");
			EN_INNEXP_1000EJB ejb = home.create();

			ds = ejb.en_innexp_1503_l(dm);
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
		dm.occr_dt_f = (String)hash.get("occr_dt_f");
		dm.occr_dt_t = (String)hash.get("occr_dt_t");
		dm.clsf = (String)hash.get("clsf");
		dm.evnt_yy = (String)hash.get("evnt_yy");
		dm.evnt_cd = (String)hash.get("evnt_cd");
		dm.evnt_seq = (String)hash.get("evnt_seq");
		dm.tab_mode = (String)hash.get("tab_mode");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.occr_dt_f = Util.getSessionParameterValue(req,"occr_dt_f",true);
		dm.occr_dt_t = Util.getSessionParameterValue(req,"occr_dt_t",true);
		dm.clsf = Util.getSessionParameterValue(req,"clsf",true);
		dm.evnt_yy = Util.getSessionParameterValue(req,"evnt_yy",true);
		dm.evnt_cd = Util.getSessionParameterValue(req,"evnt_cd",true);
		dm.evnt_seq = Util.getSessionParameterValue(req,"evnt_seq",true);
		dm.tab_mode = Util.getSessionParameterValue(req,"tab_mode",true);
		*******************************************************************************************/
	}
	public void en_innexp_1504_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISENP");
		EN_INNEXP_1504_LDataSet ds = null;
		EN_INNEXP_1504_LDM dm = new EN_INNEXP_1504_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.occr_dt_f = Util.checkString(req.getParameter("occr_dt_f"));
		dm.occr_dt_t = Util.checkString(req.getParameter("occr_dt_t"));
		dm.evnt_yy = Util.checkString(req.getParameter("evnt_yy"));
		dm.evnt_cd = Util.checkString(req.getParameter("evnt_cd"));
		dm.evnt_seq = Util.checkString(req.getParameter("evnt_seq"));

		dm.print();

		ds = (EN_INNEXP_1504_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);

		/*
		try {
			EN_INNEXP_1000EJBHome home = (EN_INNEXP_1000EJBHome)JNDIManager.getInstance().getHome("EN_INNEXP_1000EJB");
			EN_INNEXP_1000EJB ejb = home.create();

			ds = ejb.en_innexp_1504_l(dm);
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
		dm.occr_dt_f = (String)hash.get("occr_dt_f");
		dm.occr_dt_t = (String)hash.get("occr_dt_t");
		dm.evnt_yy = (String)hash.get("evnt_yy");
		dm.evnt_cd = (String)hash.get("evnt_cd");
		dm.evnt_seq = (String)hash.get("evnt_seq");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.occr_dt_f = Util.getSessionParameterValue(req,"occr_dt_f",true);
		dm.occr_dt_t = Util.getSessionParameterValue(req,"occr_dt_t",true);
		dm.evnt_yy = Util.getSessionParameterValue(req,"evnt_yy",true);
		dm.evnt_cd = Util.getSessionParameterValue(req,"evnt_cd",true);
		dm.evnt_seq = Util.getSessionParameterValue(req,"evnt_seq",true);
		*******************************************************************************************/
	}
	public void en_innexp_1505_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISENP");
		EN_INNEXP_1505_LDataSet ds = null;
		EN_INNEXP_1505_LDM dm = new EN_INNEXP_1505_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.evnt_frdt_f = Util.checkString(req.getParameter("evnt_frdt_f"));
		dm.evnt_frdt_t = Util.checkString(req.getParameter("evnt_frdt_t"));
		dm.clsf = Util.checkString(req.getParameter("clsf"));

		dm.print();

		ds = (EN_INNEXP_1505_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);

		/*
		try {
			EN_INNEXP_1000EJBHome home = (EN_INNEXP_1000EJBHome)JNDIManager.getInstance().getHome("EN_INNEXP_1000EJB");
			EN_INNEXP_1000EJB ejb = home.create();

			ds = ejb.en_innexp_1505_l(dm);
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
		dm.evnt_frdt_f = (String)hash.get("evnt_frdt_f");
		dm.evnt_frdt_t = (String)hash.get("evnt_frdt_t");
		dm.clsf = (String)hash.get("clsf");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.evnt_frdt_f = Util.getSessionParameterValue(req,"evnt_frdt_f",true);
		dm.evnt_frdt_t = Util.getSessionParameterValue(req,"evnt_frdt_t",true);
		dm.clsf = Util.getSessionParameterValue(req,"clsf",true);
		*******************************************************************************************/
	}

}
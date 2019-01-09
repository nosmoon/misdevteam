/***************************************************************************************************
* 파일명 : EN_EVNT_1000WB.java
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

package chosun.ciis.en.comm.wb;

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
import chosun.ciis.en.comm.dm.*;
import chosun.ciis.en.comm.ds.*;
/**
 * 
 */

public class EN_COMM_1000WB extends BaseWB {

	public void en_comm_1001_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISENP");
		EN_COMM_1001_LDataSet ds = null;
		EN_COMM_1001_LDM dm = new EN_COMM_1001_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		//dm.cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
		dm.search = Util.checkString(req.getParameter("search"));
		dm.clsf_cd = Util.checkString(req.getParameter("clsf_cd"));
		dm.print();

		ds = (EN_COMM_1001_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
		
		/*
		try {
			EN_COMM_1000EJBHome home = (EN_COMM_1000EJBHome)JNDIManager.getInstance().getHome("EN_COMM_1000EJB");
			EN_COMM_1000EJB ejb = home.create();

			ds = ejb.en_comm_1001_l(dm);
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
		dm.search = (String)hash.get("search");
		dm.clsf_cd = (String)hash.get("clsf_cd");
		*******************************************************************************************/
	}

	public void en_comm_1002_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISENP");
		EN_COMM_1002_LDataSet ds = null;
		EN_COMM_1002_LDM dm = new EN_COMM_1002_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		//dm.cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
		dm.evnt_cd = Util.checkString(req.getParameter("evnt_cd"));
		dm.evnt_nm = Util.checkString(req.getParameter("evnt_nm"));
		dm.print();

		ds = (EN_COMM_1002_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);

		/*
		try {
			EN_COMM_1000EJBHome home = (EN_COMM_1000EJBHome)JNDIManager.getInstance().getHome("EN_COMM_1000EJB");
			EN_COMM_1000EJB ejb = home.create();

			ds = ejb.en_comm_1002_l(dm);
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
		dm.evnt_cd = (String)hash.get("evnt_cd");
		dm.evnt_nm = (String)hash.get("evnt_nm");
		*******************************************************************************************/
	}

	public void en_comm_1003_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISENP");
		EN_COMM_1003_LDataSet ds = null;
		EN_COMM_1003_LDM dm = new EN_COMM_1003_LDM();

		dm.dlco_no = Util.checkString(req.getParameter("dlco_no"));

		ds = (EN_COMM_1003_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);

		/*
		try {
			EN_COMM_1000EJBHome home = (EN_COMM_1000EJBHome)JNDIManager.getInstance().getHome("EN_COMM_1000EJB");
			EN_COMM_1000EJB ejb = home.create();

			ds = ejb.en_comm_1003_l(dm);
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

	public void en_comm_1004_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISENP");
		EN_COMM_1004_LDataSet ds = null;
		EN_COMM_1004_LDM dm = new EN_COMM_1004_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.budg_cd = Util.checkString(req.getParameter("budg_cd"));
		dm.print();

		ds = (EN_COMM_1004_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);

		/*
		try {
			EN_COMM_1000EJBHome home = (EN_COMM_1000EJBHome)JNDIManager.getInstance().getHome("EN_COMM_1000EJB");
			EN_COMM_1000EJB ejb = home.create();

			ds = ejb.en_comm_1004_l(dm);
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
		dm.budg_cd = (String)hash.get("budg_cd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.budg_cd = Util.getSessionParameterValue(req,"budg_cd",true);
		*******************************************************************************************/
	}

	public void en_comm_1005_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISENP");
		EN_COMM_1005_LDataSet ds = null;
		EN_COMM_1005_LDM dm = new EN_COMM_1005_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.print();

		ds = (EN_COMM_1005_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);

		/*
		try {
			EN_COMM_1000EJBHome home = (EN_COMM_1000EJBHome)JNDIManager.getInstance().getHome("EN_COMM_1000EJB");
			EN_COMM_1000EJB ejb = home.create();

			ds = ejb.en_comm_1005_l(dm);
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
		dm.dept_cd = (String)hash.get("dept_cd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.dept_cd = Util.getSessionParameterValue(req,"dept_cd",true);
		*******************************************************************************************/
	}

	public void en_comm_1100_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISENP");
		EN_COMM_1100_LDataSet ds = null;
		EN_COMM_1100_LDM dm = new EN_COMM_1100_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.evnt_yy = Util.checkString(req.getParameter("evnt_yy"));
		dm.evnt_cd = Util.checkString(req.getParameter("evnt_cd"));
		dm.evnt_cd_fr = Util.checkString(req.getParameter("evnt_cd_fr"));
		dm.evnt_cd_to = Util.checkString(req.getParameter("evnt_cd_to"));
		dm.evnt_nm1 = Util.checkString(req.getParameter("evnt_nm1"));
		dm.evnt_nm2 = Util.checkString(req.getParameter("evnt_nm2"));
		dm.srch_clsf = Util.checkString(req.getParameter("srch_clsf"));
		dm.print();

		ds = (EN_COMM_1100_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
		
		/*
		try {
			EN_COMM_1000EJBHome home = (EN_COMM_1000EJBHome)JNDIManager.getInstance().getHome("EN_COMM_1000EJB");
			EN_COMM_1000EJB ejb = home.create();

			ds = ejb.en_comm_1100_l(dm);
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
		dm.evnt_cd_fr = (String)hash.get("evnt_cd_fr");
		dm.evnt_cd_to = (String)hash.get("evnt_cd_to");
		dm.evnt_nm1 = (String)hash.get("evnt_nm1");
		dm.evnt_nm2 = (String)hash.get("evnt_nm2");
		dm.srch_clsf = (String)hash.get("srch_clsf");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.evnt_yy = Util.getSessionParameterValue(req,"evnt_yy",true);
		dm.evnt_cd = Util.getSessionParameterValue(req,"evnt_cd",true);
		dm.evnt_cd_fr = Util.getSessionParameterValue(req,"evnt_cd_fr",true);
		dm.evnt_cd_to = Util.getSessionParameterValue(req,"evnt_cd_to",true);
		dm.evnt_nm1 = Util.getSessionParameterValue(req,"evnt_nm1",true);
		dm.evnt_nm2 = Util.getSessionParameterValue(req,"evnt_nm2",true);
		dm.srch_clsf = Util.getSessionParameterValue(req,"srch_clsf",true);
		*******************************************************************************************/
	}

	public void en_comm_1200_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISENP");
		EN_COMM_1200_MDataSet ds = null;
		EN_COMM_1200_MDM dm = new EN_COMM_1200_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.print();

		ds = (EN_COMM_1200_MDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
		
		/*
		try {
			EN_COMM_1000EJBHome home = (EN_COMM_1000EJBHome)JNDIManager.getInstance().getHome("EN_COMM_1000EJB");
			EN_COMM_1000EJB ejb = home.create();

			ds = ejb.en_comm_1200_m(dm);
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

	public void en_comm_1201_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISENP");
		EN_COMM_1201_LDataSet ds = null;
		EN_COMM_1201_LDM dm = new EN_COMM_1201_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.evnt_cd = Util.checkString(req.getParameter("evnt_cd"));
		dm.rcpm_unit_clsf = Util.checkString(req.getParameter("rcpm_unit_clsf"));
		dm.rcpm_proc_yn = Util.checkString(req.getParameter("rcpm_proc_yn"));
		dm.rcpm_frdt = Util.checkString(req.getParameter("rcpm_frdt"));
		dm.rcpm_todt = Util.checkString(req.getParameter("rcpm_todt"));
		dm.print();

		ds = (EN_COMM_1201_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
		
		/*
		try {
			EN_COMM_1000EJBHome home = (EN_COMM_1000EJBHome)JNDIManager.getInstance().getHome("EN_COMM_1000EJB");
			EN_COMM_1000EJB ejb = home.create();

			ds = ejb.en_comm_1201_l(dm);
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
		dm.evnt_cd = (String)hash.get("evnt_cd");
		dm.rcpm_unit_clsf = (String)hash.get("rcpm_unit_clsf");
		dm.rcpm_proc_yn = (String)hash.get("rcpm_proc_yn");
		dm.rcpm_frdt = (String)hash.get("rcpm_frdt");
		dm.rcpm_todt = (String)hash.get("rcpm_todt");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.evnt_cd = Util.getSessionParameterValue(req,"evnt_cd",true);
		dm.rcpm_unit_clsf = Util.getSessionParameterValue(req,"rcpm_unit_clsf",true);
		dm.rcpm_proc_yn = Util.getSessionParameterValue(req,"rcpm_proc_yn",true);
		dm.rcpm_frdt = Util.getSessionParameterValue(req,"rcpm_frdt",true);
		dm.rcpm_todt = Util.getSessionParameterValue(req,"rcpm_todt",true);
		*******************************************************************************************/
	}

	public void en_comm_1202_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISENP");
		EN_COMM_1202_LDataSet ds = null;
		EN_COMM_1202_LDM dm = new EN_COMM_1202_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.evnt_cd = Util.checkString(req.getParameter("evnt_cd"));
		dm.print();

		ds = (EN_COMM_1202_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
		
		/*
		try {
			EN_COMM_1000EJBHome home = (EN_COMM_1000EJBHome)JNDIManager.getInstance().getHome("EN_COMM_1000EJB");
			EN_COMM_1000EJB ejb = home.create();

			ds = ejb.en_comm_1202_l(dm);
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
		dm.evnt_cd = (String)hash.get("evnt_cd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.evnt_cd = Util.getSessionParameterValue(req,"evnt_cd",true);
		*******************************************************************************************/
	}

	public void en_comm_1301_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISENP");
		EN_COMM_1301_MDataSet ds = null;
		EN_COMM_1301_MDM dm = new EN_COMM_1301_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);

		dm.print();

		ds = (EN_COMM_1301_MDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
		
		/*
		try {
			EN_COMM_1000EJBHome home = (EN_COMM_1000EJBHome)JNDIManager.getInstance().getHome("EN_COMM_1000EJB");
			EN_COMM_1000EJB ejb = home.create();

			ds = ejb.en_comm_1301_m(dm);
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

	public void en_comm_1302_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISENP");
		EN_COMM_1302_LDataSet ds = null;
		EN_COMM_1302_LDM dm = new EN_COMM_1302_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.occr_slip_clsf = Util.checkString(req.getParameter("occr_slip_clsf"));
		dm.budg_cd = Util.checkString(req.getParameter("budg_cd"));
		dm.frdt = Util.checkString(req.getParameter("frdt"));
		dm.todt = Util.checkString(req.getParameter("todt"));
		dm.proc_clsf1 = Util.checkString(req.getParameter("proc_clsf1"));
		dm.proc_clsf2 = Util.checkString(req.getParameter("proc_clsf2"));
		dm.kind = Util.checkString(req.getParameter("kind"));

		dm.print();

		ds = (EN_COMM_1302_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
		
		/*
		try {
			EN_COMM_1000EJBHome home = (EN_COMM_1000EJBHome)JNDIManager.getInstance().getHome("EN_COMM_1000EJB");
			EN_COMM_1000EJB ejb = home.create();

			ds = ejb.en_comm_1302_l(dm);
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
		dm.occr_slip_clsf = (String)hash.get("occr_slip_clsf");
		dm.budg_cd = (String)hash.get("budg_cd");
		dm.frdt = (String)hash.get("frdt");
		dm.todt = (String)hash.get("todt");
		dm.proc_clsf1 = (String)hash.get("proc_clsf1");
		dm.proc_clsf2 = (String)hash.get("proc_clsf2");
		dm.kind = (String)hash.get("kind");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.occr_slip_clsf = Util.getSessionParameterValue(req,"occr_slip_clsf",true);
		dm.budg_cd = Util.getSessionParameterValue(req,"budg_cd",true);
		dm.frdt = Util.getSessionParameterValue(req,"frdt",true);
		dm.todt = Util.getSessionParameterValue(req,"todt",true);
		dm.proc_clsf1 = Util.getSessionParameterValue(req,"proc_clsf1",true);
		dm.proc_clsf2 = Util.getSessionParameterValue(req,"proc_clsf2",true);
		dm.kind = Util.getSessionParameterValue(req,"kind",true);
		*******************************************************************************************/
	}

	public void en_comm_1401_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISENP");
		EN_COMM_1401_MDataSet ds = null;
		EN_COMM_1401_MDM dm = new EN_COMM_1401_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);

		dm.print();

		ds = (EN_COMM_1401_MDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
		
		/*
		try {
			EN_COMM_1000EJBHome home = (EN_COMM_1000EJBHome)JNDIManager.getInstance().getHome("EN_COMM_1000EJB");
			EN_COMM_1000EJB ejb = home.create();

			ds = ejb.en_comm_1401_m(dm);
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

	public void en_comm_1402_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISENP");
		EN_COMM_1402_LDataSet ds = null;
		EN_COMM_1402_LDM dm = new EN_COMM_1402_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.rcpm_clsf = Util.checkString(req.getParameter("rcpm_clsf"));
		dm.rcpm_shet_no_fr = Util.checkString(req.getParameter("rcpm_shet_no_fr"));
		dm.rcpm_shet_no_to = Util.checkString(req.getParameter("rcpm_shet_no_to"));

		dm.print();

		ds = (EN_COMM_1402_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
		
		/*
		try {
			EN_COMM_1000EJBHome home = (EN_COMM_1000EJBHome)JNDIManager.getInstance().getHome("EN_COMM_1000EJB");
			EN_COMM_1000EJB ejb = home.create();

			ds = ejb.en_comm_1402_l(dm);
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
		dm.rcpm_shet_kind = (String)hash.get("rcpm_shet_kind");
		dm.rcpm_shet_no_fr = (String)hash.get("rcpm_shet_no_fr");
		dm.rcpm_shet_no_to = (String)hash.get("rcpm_shet_no_to");
		dm.rcpm_clsf_cd = (String)hash.get("rcpm_clsf_cd");
		dm.rcpm_shet_dlv_dt_fr = (String)hash.get("rcpm_shet_dlv_dt_fr");
		dm.rcpm_shet_dlv_dt_to = (String)hash.get("rcpm_shet_dlv_dt_to");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.rcpm_shet_kind = Util.getSessionParameterValue(req,"rcpm_shet_kind",true);
		dm.rcpm_shet_no_fr = Util.getSessionParameterValue(req,"rcpm_shet_no_fr",true);
		dm.rcpm_shet_no_to = Util.getSessionParameterValue(req,"rcpm_shet_no_to",true);
		dm.rcpm_clsf_cd = Util.getSessionParameterValue(req,"rcpm_clsf_cd",true);
		dm.rcpm_shet_dlv_dt_fr = Util.getSessionParameterValue(req,"rcpm_shet_dlv_dt_fr",true);
		dm.rcpm_shet_dlv_dt_to = Util.getSessionParameterValue(req,"rcpm_shet_dlv_dt_to",true);
		*******************************************************************************************/
	}

}

/***************************************************************************************************
* 파일명 : EN_INNEXP_3000WB.java
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

public class EN_INNEXP_3000WB extends BaseWB {

	public void en_innexp_3001_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISENP");
		EN_INNEXP_3001_LDataSet ds = null;
		EN_INNEXP_3001_LDM dm = new EN_INNEXP_3001_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.evnt_yy = Util.checkString(req.getParameter("evnt_yy"));
		dm.occr_dt_fr = Util.checkString(req.getParameter("occr_dt_fr"));
		dm.occr_dt_to = Util.checkString(req.getParameter("occr_dt_to"));
		dm.print();

		ds = (EN_INNEXP_3001_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);

		/*
		try {
			EN_INNEXP_3000EJBHome home = (EN_INNEXP_3000EJBHome)JNDIManager.getInstance().getHome("EN_INNEXP_3000EJB");
			EN_INNEXP_3000EJB ejb = home.create();

			ds = ejb.en_innexp_3001_l(dm);
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
		dm.occr_dt_fr = (String)hash.get("occr_dt_fr");
		dm.occr_dt_to = (String)hash.get("occr_dt_to");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.evnt_yy = Util.getSessionParameterValue(req,"evnt_yy",true);
		dm.occr_dt_fr = Util.getSessionParameterValue(req,"occr_dt_fr",true);
		dm.occr_dt_to = Util.getSessionParameterValue(req,"occr_dt_to",true);
		*******************************************************************************************/
	}

	public void en_innexp_3002_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISENP");
		EN_INNEXP_3002_LDataSet ds = null;
		EN_INNEXP_3002_LDM dm = new EN_INNEXP_3002_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.evnt_yy = Util.checkString(req.getParameter("evnt_yy"));
		dm.evnt_cd = Util.checkString(req.getParameter("evnt_cd"));
		dm.evnt_seq = Util.checkString(req.getParameter("evnt_seq"));
		dm.dlco_no = Util.checkString(req.getParameter("dlco_no"));
		dm.chrg_pers_emp_no = Util.checkString(req.getParameter("chrg_pers_emp_no"));
		dm.occr_dt_fr = Util.checkString(req.getParameter("occr_dt_fr"));
		dm.occr_dt_to = Util.checkString(req.getParameter("occr_dt_to"));
		dm.print();

		ds = (EN_INNEXP_3002_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);

		/*
		try {
			EN_INNEXP_3000EJBHome home = (EN_INNEXP_3000EJBHome)JNDIManager.getInstance().getHome("EN_INNEXP_3000EJB");
			EN_INNEXP_3000EJB ejb = home.create();

			ds = ejb.en_innexp_3002_l(dm);
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
		dm.dlco_no = (String)hash.get("dlco_no");
		dm.chrg_pers_emp_no = (String)hash.get("chrg_pers_emp_no");
		dm.occr_dt_fr = (String)hash.get("occr_dt_fr");
		dm.occr_dt_to = (String)hash.get("occr_dt_to");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.evnt_yy = Util.getSessionParameterValue(req,"evnt_yy",true);
		dm.evnt_cd = Util.getSessionParameterValue(req,"evnt_cd",true);
		dm.evnt_seq = Util.getSessionParameterValue(req,"evnt_seq",true);
		dm.dlco_no = Util.getSessionParameterValue(req,"dlco_no",true);
		dm.chrg_pers_emp_no = Util.getSessionParameterValue(req,"chrg_pers_emp_no",true);
		dm.occr_dt_fr = Util.getSessionParameterValue(req,"occr_dt_fr",true);
		dm.occr_dt_to = Util.getSessionParameterValue(req,"occr_dt_to",true);
		*******************************************************************************************/
	}

	public void en_innexp_3003_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISENP");
		EN_INNEXP_3003_LDataSet ds = null;
		EN_INNEXP_3003_LDM dm = new EN_INNEXP_3003_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.evnt_yy = Util.checkString(req.getParameter("evnt_yy"));
		dm.sort_clsf = Util.checkString(req.getParameter("sort_clsf"));
		dm.occr_dt_fr = Util.checkString(req.getParameter("occr_dt_fr"));
		dm.occr_dt_to = Util.checkString(req.getParameter("occr_dt_to"));
		dm.print();

		ds = (EN_INNEXP_3003_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);

		/*
		try {
			EN_INNEXP_3000EJBHome home = (EN_INNEXP_3000EJBHome)JNDIManager.getInstance().getHome("EN_INNEXP_3000EJB");
			EN_INNEXP_3000EJB ejb = home.create();

			ds = ejb.en_innexp_3003_l(dm);
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
		dm.sort_clsf = (String)hash.get("sort_clsf");
		dm.occr_dt_fr = (String)hash.get("occr_dt_fr");
		dm.occr_dt_to = (String)hash.get("occr_dt_to");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.evnt_yy = Util.getSessionParameterValue(req,"evnt_yy",true);
		dm.sort_clsf = Util.getSessionParameterValue(req,"sort_clsf",true);
		dm.occr_dt_fr = Util.getSessionParameterValue(req,"occr_dt_fr",true);
		dm.occr_dt_to = Util.getSessionParameterValue(req,"occr_dt_to",true);
		*******************************************************************************************/
	}

	public void en_innexp_3004_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISENP");
		EN_INNEXP_3004_LDataSet ds = null;
		EN_INNEXP_3004_LDM dm = new EN_INNEXP_3004_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.evnt_yy = Util.checkString(req.getParameter("evnt_yy"));
		dm.sort_clsf = Util.checkString(req.getParameter("sort_clsf"));
		dm.occr_dt_fr = Util.checkString(req.getParameter("occr_dt_fr"));
		dm.occr_dt_to = Util.checkString(req.getParameter("occr_dt_to"));
		dm.print();

		ds = (EN_INNEXP_3004_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);

		/*
		try {
			EN_INNEXP_3000EJBHome home = (EN_INNEXP_3000EJBHome)JNDIManager.getInstance().getHome("EN_INNEXP_3000EJB");
			EN_INNEXP_3000EJB ejb = home.create();

			ds = ejb.en_innexp_3004_l(dm);
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
		dm.sort_clsf = (String)hash.get("sort_clsf");
		dm.occr_dt_fr = (String)hash.get("occr_dt_fr");
		dm.occr_dt_to = (String)hash.get("occr_dt_to");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.evnt_yy = Util.getSessionParameterValue(req,"evnt_yy",true);
		dm.sort_clsf = Util.getSessionParameterValue(req,"sort_clsf",true);
		dm.occr_dt_fr = Util.getSessionParameterValue(req,"occr_dt_fr",true);
		dm.occr_dt_to = Util.getSessionParameterValue(req,"occr_dt_to",true);
		*******************************************************************************************/
	}

	public void en_innexp_3101_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISENP");
		EN_INNEXP_3101_LDataSet ds = null;
		EN_INNEXP_3101_LDM dm = new EN_INNEXP_3101_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.evnt_yy = Util.checkString(req.getParameter("evnt_yy"));
		dm.evnt_frdt_fr = Util.checkString(req.getParameter("evnt_frdt_fr"));
		dm.evnt_frdt_to = Util.checkString(req.getParameter("evnt_frdt_to"));
		dm.srch_clsf = Util.checkString(req.getParameter("srch_clsf"));
		dm.print();

		ds = (EN_INNEXP_3101_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);

		/*
		try {
			EN_INNEXP_3000EJBHome home = (EN_INNEXP_3000EJBHome)JNDIManager.getInstance().getHome("EN_INNEXP_3000EJB");
			EN_INNEXP_3000EJB ejb = home.create();

			ds = ejb.en_innexp_3101_l(dm);
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
		dm.evnt_frdt_fr = (String)hash.get("evnt_frdt_fr");
		dm.evnt_frdt_to = (String)hash.get("evnt_frdt_to");
		dm.srch_clsf = (String)hash.get("srch_clsf");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.evnt_yy = Util.getSessionParameterValue(req,"evnt_yy",true);
		dm.evnt_frdt_fr = Util.getSessionParameterValue(req,"evnt_frdt_fr",true);
		dm.evnt_frdt_to = Util.getSessionParameterValue(req,"evnt_frdt_to",true);
		dm.srch_clsf = Util.getSessionParameterValue(req,"srch_clsf",true);
		*******************************************************************************************/
	}

	public void en_innexp_3102_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISENP");
		EN_INNEXP_3102_LDataSet ds = null;
		EN_INNEXP_3102_LDM dm = new EN_INNEXP_3102_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.evnt_yy1 = Util.checkString(req.getParameter("evnt_yy1"));
		dm.evnt_cd1 = Util.checkString(req.getParameter("evnt_cd1"));
		dm.evnt_seq1 = Util.checkString(req.getParameter("evnt_seq1"));
		dm.evnt_yy2 = Util.checkString(req.getParameter("evnt_yy2"));
		dm.evnt_cd2 = Util.checkString(req.getParameter("evnt_cd2"));
		dm.evnt_seq2 = Util.checkString(req.getParameter("evnt_seq2"));
		dm.evnt_yy3 = Util.checkString(req.getParameter("evnt_yy3"));
		dm.evnt_cd3 = Util.checkString(req.getParameter("evnt_cd3"));
		dm.evnt_seq3 = Util.checkString(req.getParameter("evnt_seq3"));
		dm.srch_clsf = Util.checkString(req.getParameter("srch_clsf"));
		dm.print();

		ds = (EN_INNEXP_3102_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);

		/*
		try {
			EN_INNEXP_3000EJBHome home = (EN_INNEXP_3000EJBHome)JNDIManager.getInstance().getHome("EN_INNEXP_3000EJB");
			EN_INNEXP_3000EJB ejb = home.create();

			ds = ejb.en_innexp_3102_l(dm);
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
		dm.evnt_yy1 = (String)hash.get("evnt_yy1");
		dm.evnt_cd1 = (String)hash.get("evnt_cd1");
		dm.evnt_seq1 = (String)hash.get("evnt_seq1");
		dm.evnt_yy2 = (String)hash.get("evnt_yy2");
		dm.evnt_cd2 = (String)hash.get("evnt_cd2");
		dm.evnt_seq2 = (String)hash.get("evnt_seq2");
		dm.evnt_yy3 = (String)hash.get("evnt_yy3");
		dm.evnt_cd3 = (String)hash.get("evnt_cd3");
		dm.evnt_seq3 = (String)hash.get("evnt_seq3");
		dm.srch_clsf = (String)hash.get("srch_clsf");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.evnt_yy1 = Util.getSessionParameterValue(req,"evnt_yy1",true);
		dm.evnt_cd1 = Util.getSessionParameterValue(req,"evnt_cd1",true);
		dm.evnt_seq1 = Util.getSessionParameterValue(req,"evnt_seq1",true);
		dm.evnt_yy2 = Util.getSessionParameterValue(req,"evnt_yy2",true);
		dm.evnt_cd2 = Util.getSessionParameterValue(req,"evnt_cd2",true);
		dm.evnt_seq2 = Util.getSessionParameterValue(req,"evnt_seq2",true);
		dm.evnt_yy3 = Util.getSessionParameterValue(req,"evnt_yy3",true);
		dm.evnt_cd3 = Util.getSessionParameterValue(req,"evnt_cd3",true);
		dm.evnt_seq3 = Util.getSessionParameterValue(req,"evnt_seq3",true);
		dm.srch_clsf = Util.getSessionParameterValue(req,"srch_clsf",true);
		*******************************************************************************************/
	}

	public void en_innexp_3103_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISENP");
		EN_INNEXP_3103_LDataSet ds = null;
		EN_INNEXP_3103_LDM dm = new EN_INNEXP_3103_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.evnt_yy_fr = Util.checkString(req.getParameter("evnt_yy_fr"));
		dm.evnt_yy_to = Util.checkString(req.getParameter("evnt_yy_to"));
		dm.srch_clsf = Util.checkString(req.getParameter("srch_clsf"));
		dm.print();

		ds = (EN_INNEXP_3103_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);

		/*
		try {
			EN_INNEXP_3000EJBHome home = (EN_INNEXP_3000EJBHome)JNDIManager.getInstance().getHome("EN_INNEXP_3000EJB");
			EN_INNEXP_3000EJB ejb = home.create();

			ds = ejb.en_innexp_3103_l(dm);
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
		dm.evnt_yy_fr = (String)hash.get("evnt_yy_fr");
		dm.evnt_yy_to = (String)hash.get("evnt_yy_to");
		dm.srch_clsf = (String)hash.get("srch_clsf");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.evnt_yy_fr = Util.getSessionParameterValue(req,"evnt_yy_fr",true);
		dm.evnt_yy_to = Util.getSessionParameterValue(req,"evnt_yy_to",true);
		dm.srch_clsf = Util.getSessionParameterValue(req,"srch_clsf",true);
		*******************************************************************************************/
	}

	public void en_innexp_3104_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISENP");
		EN_INNEXP_3104_LDataSet ds = null;
		EN_INNEXP_3104_LDM dm = new EN_INNEXP_3104_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.evnt_yy_fr = Util.checkString(req.getParameter("evnt_yy_fr"));
		dm.evnt_yy_to = Util.checkString(req.getParameter("evnt_yy_to"));
		dm.print();

		ds = (EN_INNEXP_3104_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);

		/*
		try {
			EN_INNEXP_3000EJBHome home = (EN_INNEXP_3000EJBHome)JNDIManager.getInstance().getHome("EN_INNEXP_3000EJB");
			EN_INNEXP_3000EJB ejb = home.create();

			ds = ejb.en_innexp_3104_l(dm);
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
		dm.evnt_yy_fr = (String)hash.get("evnt_yy_fr");
		dm.evnt_yy_to = (String)hash.get("evnt_yy_to");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.evnt_yy_fr = Util.getSessionParameterValue(req,"evnt_yy_fr",true);
		dm.evnt_yy_to = Util.getSessionParameterValue(req,"evnt_yy_to",true);
		*******************************************************************************************/
	}

	public void en_innexp_3105_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISENP");
		EN_INNEXP_3105_LDataSet ds = null;
		EN_INNEXP_3105_LDM dm = new EN_INNEXP_3105_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.evnt_yy = Util.checkString(req.getParameter("evnt_yy"));
		dm.evnt_clsf = Util.checkString(req.getParameter("evnt_clsf"));
		dm.srch_clsf = Util.checkString(req.getParameter("srch_clsf"));
		dm.print();

		ds = (EN_INNEXP_3105_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);

		/*
		try {
			EN_INNEXP_3000EJBHome home = (EN_INNEXP_3000EJBHome)JNDIManager.getInstance().getHome("EN_INNEXP_3000EJB");
			EN_INNEXP_3000EJB ejb = home.create();

			ds = ejb.en_innexp_3105_l(dm);
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
		dm.evnt_clsf = (String)hash.get("evnt_clsf");
		dm.srch_clsf = (String)hash.get("srch_clsf");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.evnt_yy = Util.getSessionParameterValue(req,"evnt_yy",true);
		dm.evnt_clsf = Util.getSessionParameterValue(req,"evnt_clsf",true);
		dm.srch_clsf = Util.getSessionParameterValue(req,"srch_clsf",true);
		*******************************************************************************************/
	}

	public void en_innexp_3201_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISENP");
		EN_INNEXP_3201_LDataSet ds = null;
		EN_INNEXP_3201_LDM dm = new EN_INNEXP_3201_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.evnt_yy = Util.checkString(req.getParameter("evnt_yy"));
		dm.occr_dt = Util.checkString(req.getParameter("occr_dt"));
		dm.evnt_cd_fr = Util.checkString(req.getParameter("evnt_cd_fr"));
		dm.evnt_cd_to = Util.checkString(req.getParameter("evnt_cd_to"));
		dm.print();

		ds = (EN_INNEXP_3201_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);

		/*
		try {
			EN_INNEXP_3000EJBHome home = (EN_INNEXP_3000EJBHome)JNDIManager.getInstance().getHome("EN_INNEXP_3000EJB");
			EN_INNEXP_3000EJB ejb = home.create();

			ds = ejb.en_innexp_3201_l(dm);
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
		dm.occr_dt = (String)hash.get("occr_dt");
		dm.evnt_cd_fr = (String)hash.get("evnt_cd_fr");
		dm.evnt_cd_to = (String)hash.get("evnt_cd_to");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.evnt_yy = Util.getSessionParameterValue(req,"evnt_yy",true);
		dm.occr_dt = Util.getSessionParameterValue(req,"occr_dt",true);
		dm.evnt_cd_fr = Util.getSessionParameterValue(req,"evnt_cd_fr",true);
		dm.evnt_cd_to = Util.getSessionParameterValue(req,"evnt_cd_to",true);
		*******************************************************************************************/
	}

	public void en_innexp_3202_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISENP");
		EN_INNEXP_3202_LDataSet ds = null;
		EN_INNEXP_3202_LDM dm = new EN_INNEXP_3202_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.evnt_yy = Util.checkString(req.getParameter("evnt_yy"));
		dm.evnt_cd = Util.checkString(req.getParameter("evnt_cd"));
		dm.evnt_seq = Util.checkString(req.getParameter("evnt_seq"));
		dm.print();

		ds = (EN_INNEXP_3202_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);

		/*
		try {
			EN_INNEXP_3000EJBHome home = (EN_INNEXP_3000EJBHome)JNDIManager.getInstance().getHome("EN_INNEXP_3000EJB");
			EN_INNEXP_3000EJB ejb = home.create();

			ds = ejb.en_innexp_3202_l(dm);
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

	public void en_innexp_3203_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISENP");
		EN_INNEXP_3203_LDataSet ds = null;
		EN_INNEXP_3203_LDM dm = new EN_INNEXP_3203_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.evnt_yy = Util.checkString(req.getParameter("evnt_yy"));
		dm.evnt_cd = Util.checkString(req.getParameter("evnt_cd"));
		dm.evnt_seq = Util.checkString(req.getParameter("evnt_seq"));
		dm.dlco_no = Util.checkString(req.getParameter("dlco_no"));
		dm.print();

		ds = (EN_INNEXP_3203_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);

		/*
		try {
			EN_INNEXP_3000EJBHome home = (EN_INNEXP_3000EJBHome)JNDIManager.getInstance().getHome("EN_INNEXP_3000EJB");
			EN_INNEXP_3000EJB ejb = home.create();

			ds = ejb.en_innexp_3203_l(dm);
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
		dm.dlco_no = (String)hash.get("dlco_no");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.evnt_yy = Util.getSessionParameterValue(req,"evnt_yy",true);
		dm.evnt_cd = Util.getSessionParameterValue(req,"evnt_cd",true);
		dm.evnt_seq = Util.getSessionParameterValue(req,"evnt_seq",true);
		dm.dlco_no = Util.getSessionParameterValue(req,"dlco_no",true);
		*******************************************************************************************/
	}


}
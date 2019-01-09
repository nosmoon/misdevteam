package chosun.ciis.fc.acct.wb;

import java.rmi.*;
import java.sql.SQLException;
import java.util.*;

import javax.ejb.*;
import javax.servlet.http.*;

import somo.framework.db.DBManager;
import somo.framework.expt.*;
import somo.framework.lib.*;
import somo.framework.log.*;
import somo.framework.util.*;

import chosun.ciis.fc.acct.dao.FC_ACCT_2000DAO;
import chosun.ciis.fc.acct.dm.*;
import chosun.ciis.fc.acct.ds.*;

public class FC_ACCT_2000WB extends chosun.ciis.co.base.wb.BaseWB {
	
	FC_ACCT_2000DAO dao = new FC_ACCT_2000DAO();
	
	public void getDummyList(HttpServletRequest req, HttpServletResponse res)
			throws AppException, SQLException {
		FC_ACCT_9999_LDataSet ds = null;
		FC_ACCT_9999_LDM dm = new FC_ACCT_9999_LDM();

		dm.cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));

		/* EJB 수정후 시작 */
		ds = dao.getDummyList(dm);

		if (!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/*
		 * EJB 수정전 시작 try { FC_ACCT_2000EJBHome home =
		 * (FC_ACCT_2000EJBHome)JNDIManager
		 * .getInstance().getHome("FC_ACCT_2000EJB"); FC_ACCT_2000EJB ejb =
		 * home.create(); ds = ejb.getDummyList(dm); req.setAttribute("ds", ds);
		 * } catch (CreateException e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } catch (RemoteException
		 * e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } EJB 수정전 끝
		 */
	}

	public void fc_acct_2030_m(HttpServletRequest req, HttpServletResponse res)
			throws AppException, SQLException {
		FC_ACCT_2030_MDataSet ds = null;
		FC_ACCT_2030_MDM dm = new FC_ACCT_2030_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		
		/* EJB 수정후 시작 */
		//FC_ACCT_2000DAO dao = new FC_ACCT_2000DAO();
		ds = dao.fc_acct_2030_m(dm);
		if (!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/*
		 * EJB 수정전 시작 try { FC_ACCT_2000EJBHome home =
		 * (FC_ACCT_2000EJBHome)JNDIManager
		 * .getInstance().getHome("FC_ACCT_2000EJB"); FC_ACCT_2000EJB ejb =
		 * home.create();
		 * 
		 * ds = ejb.fc_acct_2030_m(dm); req.setAttribute("ds", ds); } catch
		 * (CreateException e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } catch (RemoteException
		 * e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } EJB 수정전 끝
		 */

		/*******************************************************************************************
		 * String multiUpdateData =
		 * Util.checkString(req.getParameter("multiUpdateData")); Hashtable hash
		 * = getHashMultiUpdateData(multiUpdateData);
		 * 
		 * dm.cmpy_cd = (String)hash.get("cmpy_cd");
		 *******************************************************************************************/

		/*******************************************************************************************
		 * dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		 *******************************************************************************************/
	}

	public void fc_acct_2031_l(HttpServletRequest req, HttpServletResponse res)
			throws AppException, SQLException {
		FC_ACCT_2031_LDataSet ds = null;
		FC_ACCT_2031_LDM dm = new FC_ACCT_2031_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.uid = Util.getSessionParameterValue(req, "uid", true);
		dm.slip_occr_dt = Util.checkString(req.getParameter("slip_occr_dt"));
		dm.slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
		dm.slip_seq = Util.checkString(req.getParameter("slip_seq"));

		dm.print();

		/* EJB 수정후 시작 */
		ds = dao.fc_acct_2031_l(dm);
		
		if (!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		req.setAttribute("ds", ds);		
				/* EJB 수정후 끝 */

		/*
		 * EJB 수정전 시작 try { FC_ACCT_2000EJBHome home =
		 * (FC_ACCT_2000EJBHome)JNDIManager
		 * .getInstance().getHome("FC_ACCT_2000EJB"); FC_ACCT_2000EJB ejb =
		 * home.create();
		 * 
		 * ds = ejb.fc_acct_2031_l(dm); req.setAttribute("ds", ds); } catch
		 * (CreateException e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } catch (RemoteException
		 * e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } EJB 수정전 끝
		 */

		/*******************************************************************************************
		 * String multiUpdateData =
		 * Util.checkString(req.getParameter("multiUpdateData")); Hashtable hash
		 * = getHashMultiUpdateData(multiUpdateData);
		 * 
		 * dm.cmpy_cd = (String)hash.get("cmpy_cd"); dm.uid =
		 * (String)hash.get("uid"); dm.slip_occr_dt =
		 * (String)hash.get("slip_occr_dt"); dm.slip_clsf_cd =
		 * (String)hash.get("slip_clsf_cd"); dm.slip_seq =
		 * (String)hash.get("slip_seq");
		 *******************************************************************************************/

		/*******************************************************************************************
		 * dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		 * dm.uid = Util.getSessionParameterValue(req,"uid",true);
		 * dm.slip_occr_dt =
		 * Util.getSessionParameterValue(req,"slip_occr_dt",true);
		 * dm.slip_clsf_cd =
		 * Util.getSessionParameterValue(req,"slip_clsf_cd",true); dm.slip_seq =
		 * Util.getSessionParameterValue(req,"slip_seq",true);
		 *******************************************************************************************/
	}

	public void fc_acct_2032_i(HttpServletRequest req, HttpServletResponse res)
			throws AppException, SQLException {
		FC_ACCT_2032_IDataSet ds = null;
		FC_ACCT_2032_IDM dm = new FC_ACCT_2032_IDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.slip_occr_dt = Util.checkString(req.getParameter("slip_occr_dt"));
		dm.slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
		dm.slip_seq = Util.checkString(req.getParameter("slip_seq"));
		dm.budg_yymm = Util.checkString(req.getParameter("budg_yymm"));
		dm.clam_dept_cd = Util.checkString(req.getParameter("clam_dept_cd"));
		dm.clam_amt = Util.checkString(req.getParameter("clam_amt"));
		dm.rmks = Util.checkString(req.getParameter("rmks"));
		dm.chrg_emp_no = Util.checkString(req.getParameter("chrg_emp_no"));
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);

		String multiUpdateData = Util.checkString(req
				.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.slip_arow_no = (String) hash.get("slip_arow_no");
		dm.emp_no = (String) hash.get("emp_no");
		dm.dest = (String) hash.get("dest");
		dm.amt = (String) hash.get("amt");
		dm.emp_nm = (String) hash.get("emp_no_nm");
		dm.use_dept_cd = (String) hash.get("use_dept_cd");
		/*
		 * System.out.println("slip_arow_no:"+dm.slip_arow_no);
		 * System.out.println("emp_no:"+dm.emp_no);
		 * System.out.println("emp_nm:"+dm.emp_nm);
		 */
		/* EJB 수정후 시작 */

		ds = dao.fc_acct_2032_i(dm);
		
		if (!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/*
		 * EJB 수정전 시작 try { FC_ACCT_2000EJBHome home =
		 * (FC_ACCT_2000EJBHome)JNDIManager
		 * .getInstance().getHome("FC_ACCT_2000EJB"); FC_ACCT_2000EJB ejb =
		 * home.create();
		 * 
		 * ds = ejb.fc_acct_2032_i(dm); req.setAttribute("ds", ds); } catch
		 * (CreateException e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } catch (RemoteException
		 * e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } EJB 수정전 끝
		 */

		/*******************************************************************************************
		 * String multiUpdateData =
		 * Util.checkString(req.getParameter("multiUpdateData")); Hashtable hash
		 * = getHashMultiUpdateData(multiUpdateData);
		 * 
		 * dm.cmpy_cd = (String)hash.get("cmpy_cd"); dm.slip_occr_dt =
		 * (String)hash.get("slip_occr_dt"); dm.slip_clsf_cd =
		 * (String)hash.get("slip_clsf_cd"); dm.slip_seq =
		 * (String)hash.get("slip_seq"); dm.slip_arow_no =
		 * (String)hash.get("slip_arow_no"); dm.budg_yymm =
		 * (String)hash.get("budg_yymm"); dm.emp_no =
		 * (String)hash.get("emp_no"); dm.clam_dept_cd =
		 * (String)hash.get("clam_dept_cd"); dm.clam_amt =
		 * (String)hash.get("clam_amt"); dm.rmks = (String)hash.get("rmks");
		 * dm.chrg_emp_no = (String)hash.get("chrg_emp_no"); dm.dest =
		 * (String)hash.get("dest"); dm.amt = (String)hash.get("amt");
		 * dm.incmg_pers_ipadd = (String)hash.get("incmg_pers_ipadd");
		 * dm.incmg_pers = (String)hash.get("incmg_pers"); dm.emp_nm =
		 * (String)hash.get("emp_nm"); dm.use_dept_cd =
		 * (String)hash.get("use_dept_cd");
		 *******************************************************************************************/

		/*******************************************************************************************
		 * dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		 * dm.slip_occr_dt =
		 * Util.getSessionParameterValue(req,"slip_occr_dt",true);
		 * dm.slip_clsf_cd =
		 * Util.getSessionParameterValue(req,"slip_clsf_cd",true); dm.slip_seq =
		 * Util.getSessionParameterValue(req,"slip_seq",true); dm.slip_arow_no =
		 * Util.getSessionParameterValue(req,"slip_arow_no",true); dm.budg_yymm
		 * = Util.getSessionParameterValue(req,"budg_yymm",true); dm.emp_no =
		 * Util.getSessionParameterValue(req,"emp_no",true); dm.clam_dept_cd =
		 * Util.getSessionParameterValue(req,"clam_dept_cd",true); dm.clam_amt =
		 * Util.getSessionParameterValue(req,"clam_amt",true); dm.rmks =
		 * Util.getSessionParameterValue(req,"rmks",true); dm.chrg_emp_no =
		 * Util.getSessionParameterValue(req,"chrg_emp_no",true); dm.dest =
		 * Util.getSessionParameterValue(req,"dest",true); dm.amt =
		 * Util.getSessionParameterValue(req,"amt",true); dm.incmg_pers_ipadd =
		 * Util.getSessionParameterValue(req,"incmg_pers_ipadd",true);
		 * dm.incmg_pers = Util.getSessionParameterValue(req,"incmg_pers",true);
		 * dm.emp_nm = Util.getSessionParameterValue(req,"emp_nm",true);
		 * dm.use_dept_cd =
		 * Util.getSessionParameterValue(req,"use_dept_cd",true);
		 *******************************************************************************************/
	}

	public void fc_acct_2033_d(HttpServletRequest req, HttpServletResponse res)
			throws AppException, SQLException {
		FC_ACCT_2033_DDataSet ds = null;
		FC_ACCT_2033_DDM dm = new FC_ACCT_2033_DDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.slip_occr_dt = Util.checkString(req.getParameter("slip_occr_dt"));
		dm.slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
		dm.slip_seq = Util.checkString(req.getParameter("slip_seq"));
		dm.chg_pers = Util.checkString(req.getParameter("incmg_pers"));
		dm.incmg_pers_ipadd = req.getRemoteAddr();

		/* EJB 수정후 시작 */

		ds = dao.fc_acct_2033_d(dm);
		
		if (!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/*
		 * EJB 수정전 시작 try { FC_ACCT_2000EJBHome home =
		 * (FC_ACCT_2000EJBHome)JNDIManager
		 * .getInstance().getHome("FC_ACCT_2000EJB"); FC_ACCT_2000EJB ejb =
		 * home.create();
		 * 
		 * ds = ejb.fc_acct_2033_d(dm); req.setAttribute("ds", ds); } catch
		 * (CreateException e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } catch (RemoteException
		 * e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } EJB 수정전 끝
		 */

		/*******************************************************************************************
		 * String multiUpdateData =
		 * Util.checkString(req.getParameter("multiUpdateData")); Hashtable hash
		 * = getHashMultiUpdateData(multiUpdateData);
		 * 
		 * dm.cmpy_cd = (String)hash.get("cmpy_cd"); dm.slip_occr_dt =
		 * (String)hash.get("slip_occr_dt"); dm.slip_clsf_cd =
		 * (String)hash.get("slip_clsf_cd"); dm.slip_seq =
		 * (String)hash.get("slip_seq"); dm.chg_pers =
		 * (String)hash.get("chg_pers"); dm.incmg_pers_ipadd =
		 * (String)hash.get("incmg_pers_ipadd");
		 *******************************************************************************************/

		/*******************************************************************************************
		 * dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		 * dm.slip_occr_dt =
		 * Util.getSessionParameterValue(req,"slip_occr_dt",true);
		 * dm.slip_clsf_cd =
		 * Util.getSessionParameterValue(req,"slip_clsf_cd",true); dm.slip_seq =
		 * Util.getSessionParameterValue(req,"slip_seq",true); dm.chg_pers =
		 * Util.getSessionParameterValue(req,"chg_pers",true);
		 * dm.incmg_pers_ipadd =
		 * Util.getSessionParameterValue(req,"incmg_pers_ipadd",true);
		 *******************************************************************************************/
	}

	public void fc_acct_2040_m(HttpServletRequest req, HttpServletResponse res)
			throws AppException, SQLException {
		FC_ACCT_2040_MDataSet ds = null;
		FC_ACCT_2040_MDM dm = new FC_ACCT_2040_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);

		dm.print();

		/* EJB 수정후 시작 */
		ds = dao.fc_acct_2040_m(dm);		
		
		if (!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);

		/*******************************************************************************************
		 * String multiUpdateData =
		 * Util.checkString(req.getParameter("multiUpdateData")); Hashtable hash
		 * = getHashMultiUpdateData(multiUpdateData);
		 * 
		 * dm.cmpy_cd = (String)hash.get(cmpy_cd"); dm.occr_dt_from =
		 * (String)hash.get(occr_dt_from"); dm.occr_dt_to =
		 * (String)hash.get(occr_dt_to"); dm.occr_acct_cd =
		 * (String)hash.get(occr_acct_cd"); dm.dept_cd =
		 * (String)hash.get(dept_cd"); dm.combo1 = (String)hash.get(combo1");
		 * dm.combo2 = (String)hash.get(combo2");
		 *******************************************************************************************/
	}

	public void fc_acct_2041_l(HttpServletRequest req, HttpServletResponse res)
			throws AppException, SQLException {
		FC_ACCT_2041_LDataSet ds = null;
		FC_ACCT_2041_LDM dm = new FC_ACCT_2041_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.occr_dt_from = Util.checkString(req.getParameter("occr_dt_from"));
		dm.occr_dt_to = Util.checkString(req.getParameter("occr_dt_to"));
		dm.occr_acct_cd = Util.checkString(req.getParameter("occr_acct_cd"));
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.combo1 = Util.checkString(req.getParameter("combo1"));
		dm.combo2 = Util.checkString(req.getParameter("combo2"));

		dm.print();

		/* EJB 수정후 시작 */
		ds = dao.fc_acct_2041_l(dm);	

		if (!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/*
		 * EJB 수정전 시작 try { FC_ACCT_2000EJBHome home =
		 * (FC_ACCT_2000EJBHome)JNDIManager
		 * .getInstance().getHome("FC_ACCT_2000EJB"); FC_ACCT_2000EJB ejb =
		 * home.create();
		 * 
		 * ds = ejb.fc_acct_2041_l(dm); req.setAttribute("ds", ds); } catch
		 * (CreateException e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } catch (RemoteException
		 * e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } EJB 수정전 끝
		 */

		/*******************************************************************************************
		 * String multiUpdateData =
		 * Util.checkString(req.getParameter("multiUpdateData")); Hashtable hash
		 * = getHashMultiUpdateData(multiUpdateData);
		 * 
		 * dm.cmpy_cd = (String)hash.get(cmpy_cd"); dm.occr_dt_from =
		 * (String)hash.get(occr_dt_from"); dm.occr_dt_to =
		 * (String)hash.get(occr_dt_to"); dm.occr_acct_cd =
		 * (String)hash.get(occr_acct_cd"); dm.dept_cd =
		 * (String)hash.get(dept_cd"); dm.combo1 = (String)hash.get(combo1");
		 * dm.combo2 = (String)hash.get(combo2");
		 *******************************************************************************************/
	}
	
	public void fc_acct_2045_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		FC_ACCT_2045_LDataSet ds = null;
		FC_ACCT_2045_LDM dm = new FC_ACCT_2045_LDM();

		dm.cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
		dm.occr_dt_from = Util.checkString(req.getParameter("occr_dt_from"));
		dm.occr_dt_to = Util.checkString(req.getParameter("occr_dt_to"));
		dm.occr_acct_cd = Util.checkString(req.getParameter("occr_acct_cd"));
		dm.occr_clsf_dt = Util.checkString(req.getParameter("occr_clsf_dt"));
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.combo1 = Util.checkString(req.getParameter("combo1"));
		dm.combo2 = Util.checkString(req.getParameter("combo2"));

		dm.print();

		/* EJB 수정후 시작 */
		ds = dao.fc_acct_2045_l(dm);	

		if (!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.occr_dt_from = (String)hash.get("occr_dt_from");
		dm.occr_dt_to = (String)hash.get("occr_dt_to");
		dm.occr_acct_cd = (String)hash.get("occr_acct_cd");
		dm.occr_clsf_dt = (String)hash.get("occr_clsf_dt");
		dm.dept_cd = (String)hash.get("dept_cd");
		dm.combo1 = (String)hash.get("combo1");
		dm.combo2 = (String)hash.get("combo2");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.occr_dt_from = Util.getSessionParameterValue(req,"occr_dt_from",true);
		dm.occr_dt_to = Util.getSessionParameterValue(req,"occr_dt_to",true);
		dm.occr_acct_cd = Util.getSessionParameterValue(req,"occr_acct_cd",true);
		dm.occr_clsf_dt = Util.getSessionParameterValue(req,"occr_clsf_dt",true);
		dm.dept_cd = Util.getSessionParameterValue(req,"dept_cd",true);
		dm.combo1 = Util.getSessionParameterValue(req,"combo1",true);
		dm.combo2 = Util.getSessionParameterValue(req,"combo2",true);
		*******************************************************************************************/
	}
	
	public void fc_acct_2010_m(HttpServletRequest req, HttpServletResponse res)
	throws AppException, SQLException {
		FC_ACCT_2010_MDataSet ds = null;
		FC_ACCT_2010_MDM dm = new FC_ACCT_2010_MDM();
		
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);

		dm.print();
		
		/* EJB 수정후 시작 */
		FC_ACCT_2000DAO dao = new FC_ACCT_2000DAO();
		ds = dao.fc_acct_2010_m(dm);
		
		if (!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		req.setAttribute("ds", ds);
	}
	
	
	public void fc_acct_2011_l(HttpServletRequest req, HttpServletResponse res)
			throws AppException, SQLException {
		FC_ACCT_2011_LDataSet ds = null;
		FC_ACCT_2011_LDM dm = new FC_ACCT_2011_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.uid = Util.getSessionParameterValue(req, "uid", true);
		dm.slip_occr_dt = Util.checkString(req.getParameter("slip_occr_dt"));
		dm.slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
		dm.slip_seq = Util.checkString(req.getParameter("slip_seq"));

		dm.print();

		/* EJB 수정후 시작 */
		FC_ACCT_2000DAO dao = new FC_ACCT_2000DAO();
		ds = dao.fc_acct_2011_l(dm);

		if (!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/*
		 * EJB 수정전 시작 try { FC_ACCT_2000EJBHome home =
		 * (FC_ACCT_2000EJBHome)JNDIManager
		 * .getInstance().getHome("FC_ACCT_2000EJB"); FC_ACCT_2000EJB ejb =
		 * home.create();
		 * 
		 * ds = ejb.fc_acct_2011_l(dm); req.setAttribute("ds", ds); } catch
		 * (CreateException e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } catch (RemoteException
		 * e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } EJB 수정전 끝
		 */

		/*******************************************************************************************
		 * String multiUpdateData =
		 * Util.checkString(req.getParameter("multiUpdateData")); Hashtable hash
		 * = getHashMultiUpdateData(multiUpdateData);
		 * 
		 * dm.cmpy_cd = (String)hash.get("cmpy_cd"); dm.uid =
		 * (String)hash.get("uid"); dm.slip_occr_dt =
		 * (String)hash.get("slip_occr_dt"); dm.slip_clsf_cd =
		 * (String)hash.get("slip_clsf_cd"); dm.slip_seq =
		 * (String)hash.get("slip_seq");
		 *******************************************************************************************/

		/*******************************************************************************************
		 * dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		 * dm.uid = Util.getSessionParameterValue(req,"uid",true);
		 * dm.slip_occr_dt =
		 * Util.getSessionParameterValue(req,"slip_occr_dt",true);
		 * dm.slip_clsf_cd =
		 * Util.getSessionParameterValue(req,"slip_clsf_cd",true); dm.slip_seq =
		 * Util.getSessionParameterValue(req,"slip_seq",true);
		 *******************************************************************************************/
	}

	public void fc_acct_2012_i(HttpServletRequest req, HttpServletResponse res)
			throws AppException, SQLException {
		FC_ACCT_2012_IDataSet ds = null;
		FC_ACCT_2012_IDM dm = new FC_ACCT_2012_IDM();

		String multiUpdateData = Util.checkString(req
				.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.inupd_flag = Util.checkString(req.getParameter("inupd_flag"));
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.slip_occr_dt = Util.checkString(req.getParameter("slip_occr_dt"));
		dm.slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
		dm.slip_seq = Util.checkString(req.getParameter("slip_seq"));
		dm.rece_exp_aplc_yn = (String) hash.get("rece_exp_aplc_yn");
		dm.titl = Util.checkString(req.getParameter("titl"));
		dm.reso_amt = Util.checkString(req.getParameter("reso_amt"));
		dm.expn_hope_dt = Util.checkString(req.getParameter("expn_hope_dt"));
		dm.expn_clsf = Util.checkString(req.getParameter("expn_clsf"));
		dm.clam_dept_cd = Util.checkString(req.getParameter("clam_dept_cd"));
		dm.evnt_cd = Util.checkString(req.getParameter("evnt_cd"));
		dm.budg_yymm = Util.checkString(req.getParameter("budg_yymm"));
		dm.chrg_emp_no = Util.checkString(req.getParameter("chrg_emp_no"));
		dm.chg_pers = Util.checkString(req.getParameter("chg_pers"));
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		dm.slip_sub_seq = Util.checkString(req.getParameter("slip_sub_seq"));
		dm.slip_arow_no = Util.checkString(req.getParameter("slip_arow_no"));
		dm.budg_cd = (String) hash.get("budg_cd");
		dm.use_dept_cd = (String) hash.get("use_dept_cd");
		dm.rmks2 = (String) hash.get("rmks2");
		dm.dlco_clsf_cd = (String) hash.get("dlco_clsf_cd");
		dm.dlco_cd = (String) hash.get("dlco_cd");
		dm.dlco_nm = (String) hash.get("dlco_nm");
		dm.boks_dlco_nm = (String) hash.get("boks_dlco_nm");
		dm.mang_clsf_cd = (String) hash.get("mang_clsf_cd");
		dm.mang_no = (String) hash.get("mang_no");
		dm.incm_clsf_cd = (String) hash.get("incm_clsf_cd");
		dm.etc_in = (String) hash.get("etc_in");
		dm.setoff_slip_occr_dt = (String) hash.get("setoff_slip_occr_dt");
		dm.medi_cd = (String) hash.get("medi_cd");
		dm.dtls_medi_cd = (String) hash.get("dtls_medi_cd");
		dm.comp_dt = (String) hash.get("comp_dt");
		dm.mtry_dt = (String) hash.get("mtry_dt");
		dm.unit = (String) hash.get("unit");
		dm.qunt = (String) hash.get("qunt");
		dm.tax_stmt_no = (String) hash.get("tax_stmt_no");
		dm.make_dt = (String) hash.get("make_dt");
		dm.erplace_cd = (String) hash.get("erplace_cd");
		dm.ern = (String) hash.get("ern");
		dm.tax_suply_amt = Util.checkString(req.getParameter("tax_suply_amt"));
		dm.tax_vat_amt = Util.checkString(req.getParameter("tax_vat_amt"));
		dm.suply_amt = (String) hash.get("suply_amt");
		dm.vat_amt = (String) hash.get("vat_amt");
		dm.with_tax = (String) hash.get("with_tax");
		dm.incm_tax = (String) hash.get("incm_tax");
		dm.res_tax = (String) hash.get("res_tax");
		dm.purc_amt = (String) hash.get("purc_amt");
		dm.int_rate = (String) hash.get("int_rate");
		dm.pay_bank_cd = (String) hash.get("pay_bank_cd");
		dm.corp_tax_amt = (String) hash.get("corp_tax_amt");
		dm.issu_dt = (String) hash.get("issu_dt");
		dm.insr_nm = (String) hash.get("insr_nm");
		dm.adpay_adjm_count = (String) hash.get("adpay_adjm_count");
		dm.adpay_adjm_sgno = (String) hash.get("adpay_adjm_sgno");
		dm.adpay_adjm_x = (String) hash.get("adpay_adjm_x");
		dm.adpay_adjm_amt = (String) hash.get("adpay_adjm_amt");
		dm.evnt_cd_seq = Util.checkString(req.getParameter("evnt_cd_seq"));
		dm.prop_equip_cd = (String) hash.get("prop_equip_cd");
		dm.rcpt_prof_clsf = (String) hash.get("rcpt_prof_clsf");
		dm.bank_clsf = (String) hash.get("bank_clsf");
		dm.acct_no = (String) hash.get("acct_no");
		dm.deps_pers_nm = (String) hash.get("deps_pers_nm");
		dm.draft_doc_no = (String) hash.get("draft_doc_no");
		dm.draft_expn_amt = (String) hash.get("draft_expn_amt");
		dm.recp_pers_clsf = (String) hash.get("recp_pers_clsf");
		// dm.recp_pers = (String)hash.get("recp_pers");
		dm.recp_pers = (String) hash.get("recp_pers1");
		dm.draft_doc_dept_cd = (String) hash.get("draft_doc_dept_cd");
		dm.semuro_occr_dt = (String) hash.get("semuro_occr_dt");
		dm.semuro_seq = (String) hash.get("semuro_seq");
		dm.semuro_no = (String) hash.get("semuro_no");
		dm.email_id = (String) hash.get("email_id");
		dm.recp_pers_clsf1 = Util.checkString(req
				.getParameter("recp_pers_clsf1"));
		dm.recp_pers1 = Util.checkString(req.getParameter("recp_pers1"));
		dm.recp_pers_nm1 = Util.checkString(req.getParameter("recp_pers_nm1"));
		dm.chnl_clsf_cd = Util.checkString(req.getParameter("chnl_clsf_cd"));

		dm.print();

		/* EJB 수정후 시작 */
		FC_ACCT_2000DAO dao = new FC_ACCT_2000DAO();
		ds = dao.fc_acct_2012_i(dm);

		if (!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/*
		 * EJB 수정전 시작 try { FC_ACCT_2000EJBHome home =
		 * (FC_ACCT_2000EJBHome)JNDIManager
		 * .getInstance().getHome("FC_ACCT_2000EJB"); FC_ACCT_2000EJB ejb =
		 * home.create();
		 * 
		 * ds = ejb.fc_acct_2012_i(dm); req.setAttribute("ds", ds); } catch
		 * (CreateException e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } catch (RemoteException
		 * e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } EJB 수정전 끝
		 */

		/*******************************************************************************************
		 * String multiUpdateData =
		 * Util.checkString(req.getParameter("multiUpdateData")); Hashtable hash
		 * = getHashMultiUpdateData(multiUpdateData);
		 * 
		 * dm.inupd_flag = (String)hash.get("inupd_flag"); dm.cmpy_cd =
		 * (String)hash.get("cmpy_cd"); dm.slip_occr_dt =
		 * (String)hash.get("slip_occr_dt"); dm.slip_clsf_cd =
		 * (String)hash.get("slip_clsf_cd"); dm.slip_seq =
		 * (String)hash.get("slip_seq"); dm.rece_exp_aplc_yn =
		 * (String)hash.get("rece_exp_aplc_yn"); dm.titl =
		 * (String)hash.get("titl"); dm.reso_amt = (String)hash.get("reso_amt");
		 * dm.expn_hope_dt = (String)hash.get("expn_hope_dt"); dm.expn_clsf =
		 * (String)hash.get("expn_clsf"); dm.clam_dept_cd =
		 * (String)hash.get("clam_dept_cd"); dm.evnt_cd =
		 * (String)hash.get("evnt_cd"); dm.budg_yymm =
		 * (String)hash.get("budg_yymm"); dm.chrg_emp_no =
		 * (String)hash.get("chrg_emp_no"); dm.chg_pers =
		 * (String)hash.get("chg_pers"); dm.incmg_pers_ipadd =
		 * (String)hash.get("incmg_pers_ipadd"); dm.slip_sub_seq =
		 * (String)hash.get("slip_sub_seq"); dm.slip_arow_no =
		 * (String)hash.get("slip_arow_no"); dm.budg_cd =
		 * (String)hash.get("budg_cd"); dm.use_dept_cd =
		 * (String)hash.get("use_dept_cd"); dm.rmks2 =
		 * (String)hash.get("rmks2"); dm.dlco_clsf_cd =
		 * (String)hash.get("dlco_clsf_cd"); dm.dlco_cd =
		 * (String)hash.get("dlco_cd"); dm.dlco_nm =
		 * (String)hash.get("dlco_nm"); dm.boks_dlco_nm =
		 * (String)hash.get("boks_dlco_nm"); dm.mang_clsf_cd =
		 * (String)hash.get("mang_clsf_cd"); dm.mang_no =
		 * (String)hash.get("mang_no"); dm.incm_clsf_cd =
		 * (String)hash.get("incm_clsf_cd"); dm.etc_in =
		 * (String)hash.get("etc_in"); dm.setoff_slip_occr_dt =
		 * (String)hash.get("setoff_slip_occr_dt"); dm.medi_cd =
		 * (String)hash.get("medi_cd"); dm.dtls_medi_cd =
		 * (String)hash.get("dtls_medi_cd"); dm.comp_dt =
		 * (String)hash.get("comp_dt"); dm.mtry_dt =
		 * (String)hash.get("mtry_dt"); dm.unit = (String)hash.get("unit");
		 * dm.qunt = (String)hash.get("qunt"); dm.tax_stmt_no =
		 * (String)hash.get("tax_stmt_no"); dm.make_dt =
		 * (String)hash.get("make_dt"); dm.erplace_cd =
		 * (String)hash.get("erplace_cd"); dm.ern = (String)hash.get("ern");
		 * dm.tax_suply_amt = (String)hash.get("tax_suply_amt"); dm.tax_vat_amt
		 * = (String)hash.get("tax_vat_amt"); dm.suply_amt =
		 * (String)hash.get("suply_amt"); dm.vat_amt =
		 * (String)hash.get("vat_amt"); dm.with_tax =
		 * (String)hash.get("with_tax"); dm.incm_tax =
		 * (String)hash.get("incm_tax"); dm.res_tax =
		 * (String)hash.get("res_tax"); dm.purc_amt =
		 * (String)hash.get("purc_amt"); dm.int_rate =
		 * (String)hash.get("int_rate"); dm.pay_bank_cd =
		 * (String)hash.get("pay_bank_cd"); dm.corp_tax_amt =
		 * (String)hash.get("corp_tax_amt"); dm.issu_dt =
		 * (String)hash.get("issu_dt"); dm.insr_nm =
		 * (String)hash.get("insr_nm"); dm.adpay_adjm_count =
		 * (String)hash.get("adpay_adjm_count"); dm.adpay_adjm_sgno =
		 * (String)hash.get("adpay_adjm_sgno"); dm.adpay_adjm_x =
		 * (String)hash.get("adpay_adjm_x"); dm.adpay_adjm_amt =
		 * (String)hash.get("adpay_adjm_amt"); dm.evnt_cd_seq =
		 * (String)hash.get("evnt_cd_seq"); dm.prop_equip_cd =
		 * (String)hash.get("prop_equip_cd"); dm.rcpt_prof_clsf =
		 * (String)hash.get("rcpt_prof_clsf"); dm.bank_clsf =
		 * (String)hash.get("bank_clsf"); dm.acct_no =
		 * (String)hash.get("acct_no"); dm.deps_pers_nm =
		 * (String)hash.get("deps_pers_nm"); dm.draft_doc_no =
		 * (String)hash.get("draft_doc_no"); dm.draft_expn_amt =
		 * (String)hash.get("draft_expn_amt"); dm.recp_pers_clsf =
		 * (String)hash.get("recp_pers_clsf"); dm.recp_pers =
		 * (String)hash.get("recp_pers"); dm.recp_pers_clsf1 =
		 * (String)hash.get("recp_pers_clsf1"); dm.recp_pers1 =
		 * (String)hash.get("recp_pers1"); dm.recp_pers_nm1 =
		 * (String)hash.get("recp_pers_nm1");
		 *******************************************************************************************/

		/*******************************************************************************************
		 * dm.inupd_flag = Util.getSessionParameterValue(req,"inupd_flag",true);
		 * dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		 * dm.slip_occr_dt =
		 * Util.getSessionParameterValue(req,"slip_occr_dt",true);
		 * dm.slip_clsf_cd =
		 * Util.getSessionParameterValue(req,"slip_clsf_cd",true); dm.slip_seq =
		 * Util.getSessionParameterValue(req,"slip_seq",true);
		 * dm.rece_exp_aplc_yn =
		 * Util.getSessionParameterValue(req,"rece_exp_aplc_yn",true); dm.titl =
		 * Util.getSessionParameterValue(req,"titl",true); dm.reso_amt =
		 * Util.getSessionParameterValue(req,"reso_amt",true); dm.expn_hope_dt =
		 * Util.getSessionParameterValue(req,"expn_hope_dt",true); dm.expn_clsf
		 * = Util.getSessionParameterValue(req,"expn_clsf",true);
		 * dm.clam_dept_cd =
		 * Util.getSessionParameterValue(req,"clam_dept_cd",true); dm.evnt_cd =
		 * Util.getSessionParameterValue(req,"evnt_cd",true); dm.budg_yymm =
		 * Util.getSessionParameterValue(req,"budg_yymm",true); dm.chrg_emp_no =
		 * Util.getSessionParameterValue(req,"chrg_emp_no",true); dm.chg_pers =
		 * Util.getSessionParameterValue(req,"chg_pers",true);
		 * dm.incmg_pers_ipadd =
		 * Util.getSessionParameterValue(req,"incmg_pers_ipadd",true);
		 * dm.slip_sub_seq =
		 * Util.getSessionParameterValue(req,"slip_sub_seq",true);
		 * dm.slip_arow_no =
		 * Util.getSessionParameterValue(req,"slip_arow_no",true); dm.budg_cd =
		 * Util.getSessionParameterValue(req,"budg_cd",true); dm.use_dept_cd =
		 * Util.getSessionParameterValue(req,"use_dept_cd",true); dm.rmks2 =
		 * Util.getSessionParameterValue(req,"rmks2",true); dm.dlco_clsf_cd =
		 * Util.getSessionParameterValue(req,"dlco_clsf_cd",true); dm.dlco_cd =
		 * Util.getSessionParameterValue(req,"dlco_cd",true); dm.dlco_nm =
		 * Util.getSessionParameterValue(req,"dlco_nm",true); dm.boks_dlco_nm =
		 * Util.getSessionParameterValue(req,"boks_dlco_nm",true);
		 * dm.mang_clsf_cd =
		 * Util.getSessionParameterValue(req,"mang_clsf_cd",true); dm.mang_no =
		 * Util.getSessionParameterValue(req,"mang_no",true); dm.incm_clsf_cd =
		 * Util.getSessionParameterValue(req,"incm_clsf_cd",true); dm.etc_in =
		 * Util.getSessionParameterValue(req,"etc_in",true);
		 * dm.setoff_slip_occr_dt =
		 * Util.getSessionParameterValue(req,"setoff_slip_occr_dt",true);
		 * dm.medi_cd = Util.getSessionParameterValue(req,"medi_cd",true);
		 * dm.dtls_medi_cd =
		 * Util.getSessionParameterValue(req,"dtls_medi_cd",true); dm.comp_dt =
		 * Util.getSessionParameterValue(req,"comp_dt",true); dm.mtry_dt =
		 * Util.getSessionParameterValue(req,"mtry_dt",true); dm.unit =
		 * Util.getSessionParameterValue(req,"unit",true); dm.qunt =
		 * Util.getSessionParameterValue(req,"qunt",true); dm.tax_stmt_no =
		 * Util.getSessionParameterValue(req,"tax_stmt_no",true); dm.make_dt =
		 * Util.getSessionParameterValue(req,"make_dt",true); dm.erplace_cd =
		 * Util.getSessionParameterValue(req,"erplace_cd",true); dm.ern =
		 * Util.getSessionParameterValue(req,"ern",true); dm.tax_suply_amt =
		 * Util.getSessionParameterValue(req,"tax_suply_amt",true);
		 * dm.tax_vat_amt =
		 * Util.getSessionParameterValue(req,"tax_vat_amt",true); dm.suply_amt =
		 * Util.getSessionParameterValue(req,"suply_amt",true); dm.vat_amt =
		 * Util.getSessionParameterValue(req,"vat_amt",true); dm.with_tax =
		 * Util.getSessionParameterValue(req,"with_tax",true); dm.incm_tax =
		 * Util.getSessionParameterValue(req,"incm_tax",true); dm.res_tax =
		 * Util.getSessionParameterValue(req,"res_tax",true); dm.purc_amt =
		 * Util.getSessionParameterValue(req,"purc_amt",true); dm.int_rate =
		 * Util.getSessionParameterValue(req,"int_rate",true); dm.pay_bank_cd =
		 * Util.getSessionParameterValue(req,"pay_bank_cd",true);
		 * dm.corp_tax_amt =
		 * Util.getSessionParameterValue(req,"corp_tax_amt",true); dm.issu_dt =
		 * Util.getSessionParameterValue(req,"issu_dt",true); dm.insr_nm =
		 * Util.getSessionParameterValue(req,"insr_nm",true);
		 * dm.adpay_adjm_count =
		 * Util.getSessionParameterValue(req,"adpay_adjm_count",true);
		 * dm.adpay_adjm_sgno =
		 * Util.getSessionParameterValue(req,"adpay_adjm_sgno",true);
		 * dm.adpay_adjm_x =
		 * Util.getSessionParameterValue(req,"adpay_adjm_x",true);
		 * dm.adpay_adjm_amt =
		 * Util.getSessionParameterValue(req,"adpay_adjm_amt",true);
		 * dm.evnt_cd_seq =
		 * Util.getSessionParameterValue(req,"evnt_cd_seq",true);
		 * dm.prop_equip_cd =
		 * Util.getSessionParameterValue(req,"prop_equip_cd",true);
		 * dm.rcpt_prof_clsf =
		 * Util.getSessionParameterValue(req,"rcpt_prof_clsf",true);
		 * dm.bank_clsf = Util.getSessionParameterValue(req,"bank_clsf",true);
		 * dm.acct_no = Util.getSessionParameterValue(req,"acct_no",true);
		 * dm.deps_pers_nm =
		 * Util.getSessionParameterValue(req,"deps_pers_nm",true);
		 * dm.draft_doc_no =
		 * Util.getSessionParameterValue(req,"draft_doc_no",true);
		 * dm.draft_expn_amt =
		 * Util.getSessionParameterValue(req,"draft_expn_amt",true);
		 * dm.recp_pers_clsf =
		 * Util.getSessionParameterValue(req,"recp_pers_clsf",true);
		 * dm.recp_pers = Util.getSessionParameterValue(req,"recp_pers",true);
		 * dm.recp_pers_clsf1 =
		 * Util.getSessionParameterValue(req,"recp_pers_clsf1",true);
		 * dm.recp_pers1 = Util.getSessionParameterValue(req,"recp_pers1",true);
		 * dm.recp_pers_nm1 =
		 * Util.getSessionParameterValue(req,"recp_pers_nm1",true);
		 *******************************************************************************************/
	}

	public void fc_acct_2013_s(HttpServletRequest req, HttpServletResponse res)
			throws AppException, SQLException {
		FC_ACCT_2013_SDataSet ds = null;
		FC_ACCT_2013_SDM dm = new FC_ACCT_2013_SDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.draft_doc_no = Util.checkString(req.getParameter("draft_doc_no"));
		dm.draft_dept_cd = Util.checkString(req.getParameter("draft_dept_cd"));

		dm.print();

		/* EJB 수정후 시작 */
		FC_ACCT_2000DAO dao = new FC_ACCT_2000DAO();
		ds = dao.fc_acct_2013_s(dm);

		if (!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/*
		 * EJB 수정전 시작 try { FC_ACCT_2000EJBHome home =
		 * (FC_ACCT_2000EJBHome)JNDIManager
		 * .getInstance().getHome("FC_ACCT_2000EJB"); FC_ACCT_2000EJB ejb =
		 * home.create();
		 * 
		 * ds = ejb.fc_acct_2013_s(dm); req.setAttribute("ds", ds); } catch
		 * (CreateException e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } catch (RemoteException
		 * e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } EJB 수정전 끝
		 */

		/*******************************************************************************************
		 * String multiUpdateData =
		 * Util.checkString(req.getParameter("multiUpdateData")); Hashtable hash
		 * = getHashMultiUpdateData(multiUpdateData);
		 * 
		 * dm.cmpy_cd = (String)hash.get("cmpy_cd"); dm.draft_doc_no =
		 * (String)hash.get("draft_doc_no"); dm.draft_dept_cd =
		 * (String)hash.get("draft_dept_cd");
		 *******************************************************************************************/

		/*******************************************************************************************
		 * dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		 * dm.draft_doc_no =
		 * Util.getSessionParameterValue(req,"draft_doc_no",true);
		 * dm.draft_dept_cd =
		 * Util.getSessionParameterValue(req,"draft_dept_cd",true);
		 *******************************************************************************************/
	}

	public void fc_acct_2014_s(HttpServletRequest req, HttpServletResponse res)
			throws AppException, SQLException {
		FC_ACCT_2014_SDataSet ds = null;
		FC_ACCT_2014_SDM dm = new FC_ACCT_2014_SDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.slip_occr_dt = Util.checkString(req.getParameter("slip_occr_dt"));
		dm.slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
		dm.slip_seq = Util.checkString(req.getParameter("slip_seq"));
		dm.draft_doc_no = Util.checkString(req.getParameter("draft_doc_no"));
		dm.draft_dept_cd = Util.checkString(req.getParameter("draft_dept_cd"));

		dm.print();

		/* EJB 수정후 시작 */
		FC_ACCT_2000DAO dao = new FC_ACCT_2000DAO();
		ds = dao.fc_acct_2014_s(dm);

		if (!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/*
		 * EJB 수정전 시작 try { FC_ACCT_2000EJBHome home =
		 * (FC_ACCT_2000EJBHome)JNDIManager
		 * .getInstance().getHome("FC_ACCT_2000EJB"); FC_ACCT_2000EJB ejb =
		 * home.create();
		 * 
		 * ds = ejb.fc_acct_2014_s(dm); req.setAttribute("ds", ds); } catch
		 * (CreateException e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } catch (RemoteException
		 * e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } EJB 수정전 끝
		 */

		/*******************************************************************************************
		 * String multiUpdateData =
		 * Util.checkString(req.getParameter("multiUpdateData")); Hashtable hash
		 * = getHashMultiUpdateData(multiUpdateData);
		 * 
		 * dm.cmpy_cd = (String)hash.get("cmpy_cd"); dm.slip_occr_dt =
		 * (String)hash.get("slip_occr_dt"); dm.slip_clsf_cd =
		 * (String)hash.get("slip_clsf_cd"); dm.slip_seq =
		 * (String)hash.get("slip_seq"); dm.draft_doc_no =
		 * (String)hash.get("draft_doc_no"); dm.draft_dept_cd =
		 * (String)hash.get("draft_dept_cd");
		 *******************************************************************************************/

		/*******************************************************************************************
		 * dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		 * dm.slip_occr_dt =
		 * Util.getSessionParameterValue(req,"slip_occr_dt",true);
		 * dm.slip_clsf_cd =
		 * Util.getSessionParameterValue(req,"slip_clsf_cd",true); dm.slip_seq =
		 * Util.getSessionParameterValue(req,"slip_seq",true); dm.draft_doc_no =
		 * Util.getSessionParameterValue(req,"draft_doc_no",true);
		 * dm.draft_dept_cd =
		 * Util.getSessionParameterValue(req,"draft_dept_cd",true);
		 *******************************************************************************************/
	}

	public void fc_acct_2050_m(HttpServletRequest req, HttpServletResponse res)
			throws AppException, SQLException {

		long start_tm = System.currentTimeMillis();

		FC_ACCT_2050_MDataSet ds = null;
		FC_ACCT_2050_MDM dm = new FC_ACCT_2050_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.print();

		/* EJB 수정후 시작 */
		FC_ACCT_2000DAO dao = new FC_ACCT_2000DAO();
		ds = dao.fc_acct_2050_m(dm);

		if (!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/*
		 * EJB 수정전 시작 try { FC_ACCT_2000EJBHome home =
		 * (FC_ACCT_2000EJBHome)JNDIManager
		 * .getInstance().getHome("FC_ACCT_2000EJB"); FC_ACCT_2000EJB ejb =
		 * home.create();
		 * 
		 * ds = ejb.fc_acct_2080_m(dm); req.setAttribute("ds", ds);
		 * 
		 * long end_tm = System.currentTimeMillis();
		 * 
		 * System.out.println("elapsed = " + (end_tm - start_tm));
		 * 
		 * } catch (CreateException e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } catch (RemoteException
		 * e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } EJB 수정전 끝
		 */

		/*******************************************************************************************
		 * String multiUpdateData =
		 * Util.checkString(req.getParameter("multiUpdateData")); Hashtable hash
		 * = getHashMultiUpdateData(multiUpdateData);
		 * 
		 * dm.cmpy_cd = (String)hash.get("cmpy_cd"); dm.budg_cd =
		 * (String)hash.get("budg_cd"); dm.incm_clsf_cd =
		 * (String)hash.get("incm_clsf_cd"); dm.prop_equip_cd =
		 * (String)hash.get("prop_equip_cd");
		 *******************************************************************************************/

		/*******************************************************************************************
		 * dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		 * dm.budg_cd = Util.getSessionParameterValue(req,"budg_cd",true);
		 * dm.incm_clsf_cd =
		 * Util.getSessionParameterValue(req,"incm_clsf_cd",true);
		 * dm.prop_equip_cd =
		 * Util.getSessionParameterValue(req,"prop_equip_cd",true);
		 *******************************************************************************************/
	}

	public void fc_acct_2060_m(HttpServletRequest req, HttpServletResponse res)
			throws AppException, SQLException {

		long start_tm = System.currentTimeMillis();

		FC_ACCT_2060_MDataSet ds = null;
		FC_ACCT_2060_MDM dm = new FC_ACCT_2060_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.print();

		/* EJB 수정후 시작 */
		FC_ACCT_2000DAO dao = new FC_ACCT_2000DAO();
		ds = dao.fc_acct_2060_m(dm);

		if (!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/*
		 * EJB 수정전 시작 try { FC_ACCT_2000EJBHome home =
		 * (FC_ACCT_2000EJBHome)JNDIManager
		 * .getInstance().getHome("FC_ACCT_2000EJB"); FC_ACCT_2000EJB ejb =
		 * home.create();
		 * 
		 * ds = ejb.fc_acct_2080_m(dm); req.setAttribute("ds", ds);
		 * 
		 * long end_tm = System.currentTimeMillis();
		 * 
		 * System.out.println("elapsed = " + (end_tm - start_tm));
		 * 
		 * } catch (CreateException e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } catch (RemoteException
		 * e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } EJB 수정전 끝
		 */

		/*******************************************************************************************
		 * String multiUpdateData =
		 * Util.checkString(req.getParameter("multiUpdateData")); Hashtable hash
		 * = getHashMultiUpdateData(multiUpdateData);
		 * 
		 * dm.cmpy_cd = (String)hash.get("cmpy_cd"); dm.budg_cd =
		 * (String)hash.get("budg_cd"); dm.incm_clsf_cd =
		 * (String)hash.get("incm_clsf_cd"); dm.prop_equip_cd =
		 * (String)hash.get("prop_equip_cd");
		 *******************************************************************************************/

		/*******************************************************************************************
		 * dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		 * dm.budg_cd = Util.getSessionParameterValue(req,"budg_cd",true);
		 * dm.incm_clsf_cd =
		 * Util.getSessionParameterValue(req,"incm_clsf_cd",true);
		 * dm.prop_equip_cd =
		 * Util.getSessionParameterValue(req,"prop_equip_cd",true);
		 *******************************************************************************************/
	}

	public void fc_acct_2070_m(HttpServletRequest req, HttpServletResponse res)
			throws AppException, SQLException {

		long start_tm = System.currentTimeMillis();

		FC_ACCT_2070_MDataSet ds = null;
		FC_ACCT_2070_MDM dm = new FC_ACCT_2070_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.print();

		/* EJB 수정후 시작 */
		FC_ACCT_2000DAO dao = new FC_ACCT_2000DAO();
		ds = dao.fc_acct_2070_m(dm);

		if (!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/*
		 * EJB 수정전 시작 try { FC_ACCT_2000EJBHome home =
		 * (FC_ACCT_2000EJBHome)JNDIManager
		 * .getInstance().getHome("FC_ACCT_2000EJB"); FC_ACCT_2000EJB ejb =
		 * home.create();
		 * 
		 * ds = ejb.fc_acct_2080_m(dm); req.setAttribute("ds", ds);
		 * 
		 * long end_tm = System.currentTimeMillis();
		 * 
		 * System.out.println("elapsed = " + (end_tm - start_tm));
		 * 
		 * } catch (CreateException e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } catch (RemoteException
		 * e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } EJB 수정전 끝
		 */

		/*******************************************************************************************
		 * String multiUpdateData =
		 * Util.checkString(req.getParameter("multiUpdateData")); Hashtable hash
		 * = getHashMultiUpdateData(multiUpdateData);
		 * 
		 * dm.cmpy_cd = (String)hash.get("cmpy_cd"); dm.budg_cd =
		 * (String)hash.get("budg_cd"); dm.incm_clsf_cd =
		 * (String)hash.get("incm_clsf_cd"); dm.prop_equip_cd =
		 * (String)hash.get("prop_equip_cd");
		 *******************************************************************************************/

		/*******************************************************************************************
		 * dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		 * dm.budg_cd = Util.getSessionParameterValue(req,"budg_cd",true);
		 * dm.incm_clsf_cd =
		 * Util.getSessionParameterValue(req,"incm_clsf_cd",true);
		 * dm.prop_equip_cd =
		 * Util.getSessionParameterValue(req,"prop_equip_cd",true);
		 *******************************************************************************************/
	}

	public void fc_acct_2080_m(HttpServletRequest req, HttpServletResponse res)
			throws AppException, SQLException {

		long start_tm = System.currentTimeMillis();

		FC_ACCT_2080_MDataSet ds = null;
		FC_ACCT_2080_MDM dm = new FC_ACCT_2080_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.budg_cd = Util.checkString(req.getParameter("budg_cd"));
		dm.incm_clsf_cd = Util.checkString(req.getParameter("incm_clsf_cd"));
		dm.prop_equip_cd = Util.checkString(req.getParameter("prop_equip_cd"));

		/* EJB 수정후 시작 */
		FC_ACCT_2000DAO dao = new FC_ACCT_2000DAO();
		ds = dao.fc_acct_2080_m(dm);

		if (!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/*
		 * EJB 수정전 시작 try { FC_ACCT_2000EJBHome home =
		 * (FC_ACCT_2000EJBHome)JNDIManager
		 * .getInstance().getHome("FC_ACCT_2000EJB"); FC_ACCT_2000EJB ejb =
		 * home.create();
		 * 
		 * ds = ejb.fc_acct_2080_m(dm); req.setAttribute("ds", ds);
		 * 
		 * long end_tm = System.currentTimeMillis();
		 * 
		 * System.out.println("elapsed = " + (end_tm - start_tm));
		 * 
		 * } catch (CreateException e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } catch (RemoteException
		 * e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } EJB 수정전 끝
		 */

		/*******************************************************************************************
		 * String multiUpdateData =
		 * Util.checkString(req.getParameter("multiUpdateData")); Hashtable hash
		 * = getHashMultiUpdateData(multiUpdateData);
		 * 
		 * dm.cmpy_cd = (String)hash.get("cmpy_cd"); dm.budg_cd =
		 * (String)hash.get("budg_cd"); dm.incm_clsf_cd =
		 * (String)hash.get("incm_clsf_cd"); dm.prop_equip_cd =
		 * (String)hash.get("prop_equip_cd");
		 *******************************************************************************************/

		/*******************************************************************************************
		 * dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		 * dm.budg_cd = Util.getSessionParameterValue(req,"budg_cd",true);
		 * dm.incm_clsf_cd =
		 * Util.getSessionParameterValue(req,"incm_clsf_cd",true);
		 * dm.prop_equip_cd =
		 * Util.getSessionParameterValue(req,"prop_equip_cd",true);
		 *******************************************************************************************/
	}

	public void fc_acct_2081_s(HttpServletRequest req, HttpServletResponse res)
			throws AppException, SQLException {
		FC_ACCT_2081_SDataSet ds = null;
		FC_ACCT_2081_SDM dm = new FC_ACCT_2081_SDM();

		dm.cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
		dm.input_val_1 = Util.checkString(req.getParameter("input_val_1"));
		dm.input_val_2 = Util.checkString(req.getParameter("input_val_2"));

		/* EJB 수정후 시작 */
		FC_ACCT_2000DAO dao = new FC_ACCT_2000DAO();
		ds = dao.fc_acct_2081_s(dm);

		if (!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/*
		 * EJB 수정전 시작 try { FC_ACCT_2000EJBHome home =
		 * (FC_ACCT_2000EJBHome)JNDIManager
		 * .getInstance().getHome("FC_ACCT_2000EJB"); FC_ACCT_2000EJB ejb =
		 * home.create();
		 * 
		 * ds = ejb.fc_acct_2081_s(dm); req.setAttribute("ds", ds); } catch
		 * (CreateException e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } catch (RemoteException
		 * e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } EJB 수정전 끝
		 */

		/*******************************************************************************************
		 * String multiUpdateData =
		 * Util.checkString(req.getParameter("multiUpdateData")); Hashtable hash
		 * = getHashMultiUpdateData(multiUpdateData);
		 * 
		 * dm.cmpy_cd = (String)hash.get("cmpy_cd"); dm.input_val_1 =
		 * (String)hash.get("input_val_1"); dm.input_val_2 =
		 * (String)hash.get("input_val_2");
		 *******************************************************************************************/

		/*******************************************************************************************
		 * dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		 * dm.input_val_1 =
		 * Util.getSessionParameterValue(req,"input_val_1",true); dm.input_val_2
		 * = Util.getSessionParameterValue(req,"input_val_2",true);
		 *******************************************************************************************/
	}

	public void fc_acct_2082_s(HttpServletRequest req, HttpServletResponse res)
			throws AppException, SQLException {
		FC_ACCT_2082_SDataSet ds = null;
		FC_ACCT_2082_SDM dm = new FC_ACCT_2082_SDM();

		dm.cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
		dm.dlco_clsf_cd = Util.checkString(req.getParameter("dlco_clsf_cd"));
		dm.dlco_no = Util.checkString(req.getParameter("dlco_no"));

		/* EJB 수정후 시작 */
		FC_ACCT_2000DAO dao = new FC_ACCT_2000DAO();
		ds = dao.fc_acct_2082_s(dm);

		if (!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/*
		 * EJB 수정전 시작 try { FC_ACCT_2000EJBHome home =
		 * (FC_ACCT_2000EJBHome)JNDIManager
		 * .getInstance().getHome("FC_ACCT_2000EJB"); FC_ACCT_2000EJB ejb =
		 * home.create();
		 * 
		 * ds = ejb.fc_acct_2082_s(dm); req.setAttribute("ds", ds); } catch
		 * (CreateException e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } catch (RemoteException
		 * e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } EJB 수정전 끝
		 */

		/*******************************************************************************************
		 * String multiUpdateData =
		 * Util.checkString(req.getParameter("multiUpdateData")); Hashtable hash
		 * = getHashMultiUpdateData(multiUpdateData);
		 * 
		 * dm.cmpy_cd = (String)hash.get("cmpy_cd"); dm.dlco_clsf_cd =
		 * (String)hash.get("dlco_clsf_cd"); dm.dlco_no =
		 * (String)hash.get("dlco_no");
		 *******************************************************************************************/

		/*******************************************************************************************
		 * dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		 * dm.dlco_clsf_cd =
		 * Util.getSessionParameterValue(req,"dlco_clsf_cd",true); dm.dlco_no =
		 * Util.getSessionParameterValue(req,"dlco_no",true);
		 *******************************************************************************************/
	}

	public void fc_acct_2083_s(HttpServletRequest req, HttpServletResponse res)
			throws AppException, SQLException {
		FC_ACCT_2083_SDataSet ds = null;
		FC_ACCT_2083_SDM dm = new FC_ACCT_2083_SDM();

		dm.cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
		dm.budg_cd = Util.checkString(req.getParameter("budg_cd"));
		dm.cd = Util.checkString(req.getParameter("cd"));

		/* EJB 수정후 시작 */
		FC_ACCT_2000DAO dao = new FC_ACCT_2000DAO();
		ds = dao.fc_acct_2083_s(dm);

		if (!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/*
		 * EJB 수정전 시작 try { FC_ACCT_2000EJBHome home =
		 * (FC_ACCT_2000EJBHome)JNDIManager
		 * .getInstance().getHome("FC_ACCT_2000EJB"); FC_ACCT_2000EJB ejb =
		 * home.create();
		 * 
		 * ds = ejb.fc_acct_2083_s(dm); req.setAttribute("ds", ds); } catch
		 * (CreateException e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } catch (RemoteException
		 * e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } EJB 수정전 끝
		 */

		/*******************************************************************************************
		 * String multiUpdateData =
		 * Util.checkString(req.getParameter("multiUpdateData")); Hashtable hash
		 * = getHashMultiUpdateData(multiUpdateData);
		 * 
		 * dm.cmpy_cd = (String)hash.get("cmpy_cd"); dm.budg_cd =
		 * (String)hash.get("budg_cd"); dm.cd = (String)hash.get("cd");
		 *******************************************************************************************/

		/*******************************************************************************************
		 * dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		 * dm.budg_cd = Util.getSessionParameterValue(req,"budg_cd",true); dm.cd
		 * = Util.getSessionParameterValue(req,"cd",true);
		 *******************************************************************************************/
	}

	public void fc_acct_2090_m(HttpServletRequest req, HttpServletResponse res)
			throws AppException, SQLException {

		long start_tm = System.currentTimeMillis();

		FC_ACCT_2090_MDataSet ds = null;
		FC_ACCT_2090_MDM dm = new FC_ACCT_2090_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.print();

		/* EJB 수정후 시작 */
		FC_ACCT_2000DAO dao = new FC_ACCT_2000DAO();
		ds = dao.fc_acct_2090_m(dm);

		if (!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/*
		 * EJB 수정전 시작 try { FC_ACCT_2000EJBHome home =
		 * (FC_ACCT_2000EJBHome)JNDIManager
		 * .getInstance().getHome("FC_ACCT_2000EJB"); FC_ACCT_2000EJB ejb =
		 * home.create();
		 * 
		 * ds = ejb.fc_acct_2080_m(dm); req.setAttribute("ds", ds);
		 * 
		 * long end_tm = System.currentTimeMillis();
		 * 
		 * System.out.println("elapsed = " + (end_tm - start_tm));
		 * 
		 * } catch (CreateException e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } catch (RemoteException
		 * e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } EJB 수정전 끝
		 */

		/*******************************************************************************************
		 * String multiUpdateData =
		 * Util.checkString(req.getParameter("multiUpdateData")); Hashtable hash
		 * = getHashMultiUpdateData(multiUpdateData);
		 * 
		 * dm.cmpy_cd = (String)hash.get("cmpy_cd"); dm.budg_cd =
		 * (String)hash.get("budg_cd"); dm.incm_clsf_cd =
		 * (String)hash.get("incm_clsf_cd"); dm.prop_equip_cd =
		 * (String)hash.get("prop_equip_cd");
		 *******************************************************************************************/

		/*******************************************************************************************
		 * dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		 * dm.budg_cd = Util.getSessionParameterValue(req,"budg_cd",true);
		 * dm.incm_clsf_cd =
		 * Util.getSessionParameterValue(req,"incm_clsf_cd",true);
		 * dm.prop_equip_cd =
		 * Util.getSessionParameterValue(req,"prop_equip_cd",true);
		 *******************************************************************************************/
	}

	public void fc_acct_2101_l(HttpServletRequest req, HttpServletResponse res)
			throws AppException, SQLException {
		FC_ACCT_2101_LDataSet ds = null;
		FC_ACCT_2101_LDM dm = new FC_ACCT_2101_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.uid = Util.getSessionParameterValue(req, "uid", true);
		dm.draft_doc_no = Util.checkString(req.getParameter("draft_doc_no"));
		dm.draft_doc_dept_cd = Util.checkString(req
				.getParameter("draft_doc_dept_cd"));

		dm.print();

		/* EJB 수정후 시작 */
		FC_ACCT_2000DAO dao = new FC_ACCT_2000DAO();
		ds = dao.fc_acct_2101_l(dm);

		if (!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/*
		 * EJB 수정전 시작 try { FC_ACCT_2000EJBHome home =
		 * (FC_ACCT_2000EJBHome)JNDIManager
		 * .getInstance().getHome("FC_ACCT_2000EJB"); FC_ACCT_2000EJB ejb =
		 * home.create();
		 * 
		 * ds = ejb.fc_acct_2101_l(dm); req.setAttribute("ds", ds); } catch
		 * (CreateException e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } catch (RemoteException
		 * e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } EJB 수정전 끝
		 */

		/*******************************************************************************************
		 * String multiUpdateData =
		 * Util.checkString(req.getParameter("multiUpdateData")); Hashtable hash
		 * = getHashMultiUpdateData(multiUpdateData);
		 * 
		 * dm.cmpy_cd = (String)hash.get("cmpy_cd"); dm.uid =
		 * (String)hash.get("uid"); dm.draft_doc_no =
		 * (String)hash.get("draft_doc_no"); dm.draft_doc_dept_cd =
		 * (String)hash.get("draft_doc_dept_cd");
		 *******************************************************************************************/

		/*******************************************************************************************
		 * dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		 * dm.uid = Util.getSessionParameterValue(req,"uid",true);
		 * dm.draft_doc_no =
		 * Util.getSessionParameterValue(req,"draft_doc_no",true);
		 * dm.draft_doc_dept_cd =
		 * Util.getSessionParameterValue(req,"draft_doc_dept_cd",true);
		 *******************************************************************************************/
	}
	public void fc_acct_2110_m(HttpServletRequest req, HttpServletResponse res)
	throws AppException, SQLException {
		FC_ACCT_2110_MDataSet ds = null;
		FC_ACCT_2110_MDM dm = new FC_ACCT_2110_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.yymm = "";
		dm.print();

		/* EJB 수정후 시작 */
		FC_ACCT_2000DAO dao = new FC_ACCT_2000DAO();
		ds = dao.fc_acct_2110_m(dm);
		
		if (!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/*
		 * EJB 수정전 시작 try { FC_ACCT_2000EJBHome home =
		 * (FC_ACCT_2000EJBHome)JNDIManager
		 * .getInstance().getHome("FC_ACCT_2000EJB"); FC_ACCT_2000EJB ejb =
		 * home.create();
		 * 
		 * ds = ejb.fc_acct_2120_m(dm); req.setAttribute("ds", ds); } catch
		 * (CreateException e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } catch (RemoteException
		 * e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } EJB 수정전 끝
		 */
		
		/*******************************************************************************************
		 * String multiUpdateData =
		 * Util.checkString(req.getParameter("multiUpdateData")); Hashtable hash
		 * = getHashMultiUpdateData(multiUpdateData);
		 * 
		 * dm.cmpy_cd = (String)hash.get("cmpy_cd");
		 *******************************************************************************************/
		
		/*******************************************************************************************
		 * dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		 *******************************************************************************************/
}
public void fc_acct_2111_l(HttpServletRequest req, HttpServletResponse res)
	throws AppException, SQLException {
		FC_ACCT_2111_LDataSet ds = null;
		FC_ACCT_2111_LDM dm = new FC_ACCT_2111_LDM();
		
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "uid", true);
		dm.yymm = Util.checkString(req.getParameter("yymm"));
		dm.supr_dept_cd = Util.checkString(req.getParameter("supr_dept_cd"));
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.sply_basi_cd = Util.checkString(req.getParameter("sply_basi_cd"));
		
		dm.print();
		
		/* EJB 수정후 시작 */
		FC_ACCT_2000DAO dao = new FC_ACCT_2000DAO();
		ds = dao.fc_acct_2111_l(dm);
		
		if (!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/*
		 * EJB 수정전 시작 try { FC_ACCT_2000EJBHome home =
		 * (FC_ACCT_2000EJBHome) JNDIManager
		 * .getInstance().getHome("FC_ACCT_2000EJB"); FC_ACCT_2000EJB ejb =
		 * home.create();
		 * 
		 * ds = ejb.fc_acct_2101_l(dm); req.setAttribute("ds", ds); } catch
		 * (CreateException e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } catch (RemoteException
		 * e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } EJB 수정전 끝
		 */
		
		/*******************************************************************************************
		 * String multiUpdateData =
		 * Util.checkString(req.getParameter("multiUpdateData")); Hashtable hash
		 * = getHashMultiUpdateData(multiUpdateData);
		 * 
		 * dm.cmpy_cd = (String)hash.get("cmpy_cd"); dm.uid =
		 * (String)hash.get("uid"); dm.draft_doc_no =
		 * (String)hash.get("draft_doc_no"); dm.draft_doc_dept_cd =
		 * (String)hash.get("draft_doc_dept_cd");
		 *******************************************************************************************/
		
		/*******************************************************************************************
		 * dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		 * dm.uid = Util.getSessionParameterValue(req,"uid",true);
		 * dm.draft_doc_no =
		 * Util.getSessionParameterValue(req,"draft_doc_no",true);
		 * dm.draft_doc_dept_cd =
		 * Util.getSessionParameterValue(req,"draft_doc_dept_cd",true);
		 *******************************************************************************************/
}
public void fc_acct_2112_l(HttpServletRequest req, HttpServletResponse res)
	throws AppException, SQLException {
		FC_ACCT_2112_LDataSet ds = null;
		FC_ACCT_2112_LDM dm = new FC_ACCT_2112_LDM();
		
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "uid", true);
		dm.yymm = Util.checkString(req.getParameter("yymm"));
		dm.supr_dept_cd = Util.checkString(req.getParameter("supr_dept_cd"));
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.sply_basi_cd = Util.checkString(req.getParameter("sply_basi_cd"));
		
		dm.print();
		
		/* EJB 수정후 시작 */
		FC_ACCT_2000DAO dao = new FC_ACCT_2000DAO();
		ds = dao.fc_acct_2112_l(dm);
		
		if (!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/*
		 * EJB 수정전 시작 try { FC_ACCT_2000EJBHome home =
		 * (FC_ACCT_2000EJBHome)JNDIManager
		 * .getInstance().getHome("FC_ACCT_2000EJB"); FC_ACCT_2000EJB ejb =
		 * home.create();
		 * 
		 * ds = ejb.fc_acct_2101_l(dm); req.setAttribute("ds", ds); } catch
		 * (CreateException e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } catch (RemoteException
		 * e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } EJB 수정전 끝
		 */
		
		/*******************************************************************************************
		 * String multiUpdateData =
		 * Util.checkString(req.getParameter("multiUpdateData")); Hashtable hash
		 * = getHashMultiUpdateData(multiUpdateData);
		 * 
		 * dm.cmpy_cd = (String)hash.get("cmpy_cd"); dm.uid =
		 * (String)hash.get("uid"); dm.draft_doc_no =
		 * (String)hash.get("draft_doc_no"); dm.draft_doc_dept_cd =
		 * (String)hash.get("draft_doc_dept_cd");
		 *******************************************************************************************/
		
		/*******************************************************************************************
		 * dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		 * dm.uid = Util.getSessionParameterValue(req,"uid",true);
		 * dm.draft_doc_no =
		 * Util.getSessionParameterValue(req,"draft_doc_no",true);
		 * dm.draft_doc_dept_cd =
		 * Util.getSessionParameterValue(req,"draft_doc_dept_cd",true);
		 *******************************************************************************************/
}
public void fc_acct_2113_a(HttpServletRequest req, HttpServletResponse res) throws   AppException, SQLException {
	
	FC_ACCT_2113_ADataSet ds = null;
	FC_ACCT_2113_ADM dm = new FC_ACCT_2113_ADM();

	String multiUpdateData = Util.checkString(req.getParameter("multiUpDate"));
	Hashtable hash = getHashMultiUpdateData(multiUpdateData);
	
	dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
	dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);		
	dm.incmg_pers_ipadd = req.getRemoteAddr();		
	dm.mode = (String)hash.get("m");
	dm.emp_no = (String)hash.get("emp_no");
	dm.sply_basi_cd = (String)hash.get("sply_basi_cd");		
	
	dm.print();
	
	/* EJB 수정후 시작 */
	FC_ACCT_2000DAO dao = new FC_ACCT_2000DAO();
	ds = dao.fc_acct_2113_a(dm);

	if(!ds.getErrcode().equals("")) {
		throw new AppException(ds.getErrcode(), ds.getErrmsg());
	}

	req.setAttribute("ds", ds);

//    dm.print();
    
//    SE_ETC_1300EJBHome home = (SE_ETC_1300EJBHome) JNDIManager.getInstance().getHome("SE_ETC_1300EJB");
//    
//    try {
//    	SE_ETC_1300EJB ejb = home.create();
//        System.out.println("1111111111111111111111::::::::::");
//        ds = ejb.se_etc_1330_a(dm);
//        System.out.println("2222222222222222222222::::::::::");
//        req.setAttribute("ds", ds);
//    }
//    catch (CreateException e) {
//        SysException se = new SysException(e);
//        System.out.println("errrrrrrr>>>>>>>>>>>>>>>"+ds.getErrmsg());
//        LogManager.getInstance().log(se);
//        throw se;
//    }
//    catch (RemoteException e) {
//        SysException se = new SysException(e);
//        System.out.println("remote errrrrrrr>>>>>>>>>>>>>>>"+ds.getErrmsg());
//        LogManager.getInstance().log(se);
//        throw se;
//    }
}

/**
 * 생성
 *
 * @param req HttpServletRequest
 * @param res HttpServletResponse
 * @throws AppException
 */

public void fc_acct_2114_a(HttpServletRequest req, HttpServletResponse res) throws   AppException, SQLException {
	
	FC_ACCT_2114_ADataSet ds = null;
	FC_ACCT_2114_ADM dm = new FC_ACCT_2114_ADM();
	
	dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
	dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);		
	dm.incmg_pers_ipadd = req.getRemoteAddr();		
	dm.yymm = Util.checkString(req.getParameter("yymm"));
	dm.credel_clsf = Util.checkString(req.getParameter("credel_clsf"));		
	
	dm.print();
	
	/* EJB 수정후 시작 */
	FC_ACCT_2000DAO dao = new FC_ACCT_2000DAO();
	ds = dao.fc_acct_2114_a(dm);

	if(!ds.getErrcode().equals("")) {
		throw new AppException(ds.getErrcode(), ds.getErrmsg());
	}

	req.setAttribute("ds", ds);

//    dm.print();
    
//    SE_ETC_1300EJBHome home = (SE_ETC_1300EJBHome) JNDIManager.getInstance().getHome("SE_ETC_1300EJB");
//    
//    try {
//    	SE_ETC_1300EJB ejb = home.create();
//        System.out.println("1111111111111111111111::::::::::");
//        ds = ejb.se_etc_1330_a(dm);
//        System.out.println("2222222222222222222222::::::::::");
//        req.setAttribute("ds", ds);
//    }
//    catch (CreateException e) {
//        SysException se = new SysException(e);
//        System.out.println("errrrrrrr>>>>>>>>>>>>>>>"+ds.getErrmsg());
//        LogManager.getInstance().log(se);
//        throw se;
//    }
//    catch (RemoteException e) {
//        SysException se = new SysException(e);
//        System.out.println("remote errrrrrrr>>>>>>>>>>>>>>>"+ds.getErrmsg());
//        LogManager.getInstance().log(se);
//        throw se;
//    }
}

/**
 * 생성
 *
 * @param req HttpServletRequest
 * @param res HttpServletResponse
 * @throws AppException
 */

public void fc_acct_2115_a(HttpServletRequest req, HttpServletResponse res) throws   AppException, SQLException {
	
	FC_ACCT_2115_ADataSet ds = null;
	FC_ACCT_2115_ADM dm = new FC_ACCT_2115_ADM();
	
	dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
	dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);		
	dm.incmg_pers_ipadd = req.getRemoteAddr();		
	dm.yymm = Util.checkString(req.getParameter("yymm"));
	dm.credel_clsf = Util.checkString(req.getParameter("credel_clsf"));
	dm.actu_slip_no = Util.checkString(req.getParameter("actu_slip_no"));	
	
	dm.print();
	
	/* EJB 수정후 시작 */
	FC_ACCT_2000DAO dao = new FC_ACCT_2000DAO();
	ds = dao.fc_acct_2115_a(dm);

	if(!ds.getErrcode().equals("")) {
		throw new AppException(ds.getErrcode(), ds.getErrmsg());
	}

	req.setAttribute("ds", ds);

//    dm.print();
    
//    SE_ETC_1300EJBHome home = (SE_ETC_1300EJBHome) JNDIManager.getInstance().getHome("SE_ETC_1300EJB");
//    
//    try {
//    	SE_ETC_1300EJB ejb = home.create();
//        System.out.println("1111111111111111111111::::::::::");
//        ds = ejb.se_etc_1330_a(dm);
//        System.out.println("2222222222222222222222::::::::::");
//        req.setAttribute("ds", ds);
//    }
//    catch (CreateException e) {
//        SysException se = new SysException(e);
//        System.out.println("errrrrrrr>>>>>>>>>>>>>>>"+ds.getErrmsg());
//        LogManager.getInstance().log(se);
//        throw se;
//    }
//    catch (RemoteException e) {
//        SysException se = new SysException(e);
//        System.out.println("remote errrrrrrr>>>>>>>>>>>>>>>"+ds.getErrmsg());
//        LogManager.getInstance().log(se);
//        throw se;
//    }
}

/**
 * 생성
 *
 * @param req HttpServletRequest
 * @param res HttpServletResponse
 * @throws AppException
 */

public void fc_acct_2116_a(HttpServletRequest req, HttpServletResponse res) throws   AppException, SQLException {
	
	FC_ACCT_2116_ADataSet ds = null;
	FC_ACCT_2116_ADM dm = new FC_ACCT_2116_ADM();
	
	dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
	dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);		
	dm.incmg_pers_ipadd = req.getRemoteAddr();		
	dm.yymm = Util.checkString(req.getParameter("yymm"));
	dm.credel_clsf = Util.checkString(req.getParameter("credel_clsf"));
	dm.actu_slip_no = Util.checkString(req.getParameter("actu_slip_no"));	
	
	dm.print();
	
	/* EJB 수정후 시작 */
	FC_ACCT_2000DAO dao = new FC_ACCT_2000DAO();
	ds = dao.fc_acct_2116_a(dm);

	if(!ds.getErrcode().equals("")) {
		throw new AppException(ds.getErrcode(), ds.getErrmsg());
	}

	req.setAttribute("ds", ds);

//    dm.print();
    
//    SE_ETC_1300EJBHome home = (SE_ETC_1300EJBHome) JNDIManager.getInstance().getHome("SE_ETC_1300EJB");
//    
//    try {
//    	SE_ETC_1300EJB ejb = home.create();
//        System.out.println("1111111111111111111111::::::::::");
//        ds = ejb.se_etc_1330_a(dm);
//        System.out.println("2222222222222222222222::::::::::");
//        req.setAttribute("ds", ds);
//    }
//    catch (CreateException e) {
//        SysException se = new SysException(e);
//        System.out.println("errrrrrrr>>>>>>>>>>>>>>>"+ds.getErrmsg());
//        LogManager.getInstance().log(se);
//        throw se;
//    }
//    catch (RemoteException e) {
//        SysException se = new SysException(e);
//        System.out.println("remote errrrrrrr>>>>>>>>>>>>>>>"+ds.getErrmsg());
//        LogManager.getInstance().log(se);
//        throw se;
//    }
}

/**
 * 생성
 *
 * @param req HttpServletRequest
 * @param res HttpServletResponse
 * @throws AppException
 */
	public void fc_acct_2120_m(HttpServletRequest req, HttpServletResponse res)
			throws AppException, SQLException {
		FC_ACCT_2120_MDataSet ds = null;
		FC_ACCT_2120_MDM dm = new FC_ACCT_2120_MDM();

		dm.cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));

		/* EJB 수정후 시작 */
		FC_ACCT_2000DAO dao = new FC_ACCT_2000DAO();
		ds = dao.fc_acct_2120_m(dm);

		if (!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/*
		 * EJB 수정전 시작 try { FC_ACCT_2000EJBHome home =
		 * (FC_ACCT_2000EJBHome)JNDIManager
		 * .getInstance().getHome("FC_ACCT_2000EJB"); FC_ACCT_2000EJB ejb =
		 * home.create();
		 * 
		 * ds = ejb.fc_acct_2120_m(dm); req.setAttribute("ds", ds); } catch
		 * (CreateException e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } catch (RemoteException
		 * e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } EJB 수정전 끝
		 */

		/*******************************************************************************************
		 * String multiUpdateData =
		 * Util.checkString(req.getParameter("multiUpdateData")); Hashtable hash
		 * = getHashMultiUpdateData(multiUpdateData);
		 * 
		 * dm.cmpy_cd = (String)hash.get("cmpy_cd");
		 *******************************************************************************************/

		/*******************************************************************************************
		 * dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		 *******************************************************************************************/
	}

	public void fc_acct_2121_l(HttpServletRequest req, HttpServletResponse res)
			throws AppException, SQLException {
		FC_ACCT_2121_LDataSet ds = null;
		FC_ACCT_2121_LDM dm = new FC_ACCT_2121_LDM();

		dm.cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
		dm.slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
		dm.slip_occr_dt = Util.checkString(req.getParameter("slip_occr_dt"));
		dm.slip_seq = Util.checkString(req.getParameter("slip_seq"));
		dm.uid = Util.checkString(req.getParameter("uid"));
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));

		dm.print();

		/* EJB 수정후 시작 */
		FC_ACCT_2000DAO dao = new FC_ACCT_2000DAO();
		ds = dao.fc_acct_2121_l(dm);

		if (!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/*
		 * EJB 수정전 시작 try { FC_ACCT_2000EJBHome home =
		 * (FC_ACCT_2000EJBHome)JNDIManager
		 * .getInstance().getHome("FC_ACCT_2000EJB"); FC_ACCT_2000EJB ejb =
		 * home.create();
		 * 
		 * ds = ejb.fc_acct_2121_l(dm); req.setAttribute("ds", ds); } catch
		 * (CreateException e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } catch (RemoteException
		 * e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } EJB 수정전 끝
		 */

		/*******************************************************************************************
		 * String multiUpdateData =
		 * Util.checkString(req.getParameter("multiUpdateData")); Hashtable hash
		 * = getHashMultiUpdateData(multiUpdateData);
		 * 
		 * dm.cmpy_cd = (String)hash.get("cmpy_cd"); dm.slip_clsf_cd =
		 * (String)hash.get("slip_clsf_cd"); dm.slip_occr_dt =
		 * (String)hash.get("slip_occr_dt"); dm.slip_seq =
		 * (String)hash.get("slip_seq"); dm.uid = (String)hash.get("uid");
		 * dm.emp_no = (String)hash.get("emp_no");
		 *******************************************************************************************/

		/*******************************************************************************************
		 * dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		 * dm.slip_clsf_cd =
		 * Util.getSessionParameterValue(req,"slip_clsf_cd",true);
		 * dm.slip_occr_dt =
		 * Util.getSessionParameterValue(req,"slip_occr_dt",true); dm.slip_seq =
		 * Util.getSessionParameterValue(req,"slip_seq",true); dm.uid =
		 * Util.getSessionParameterValue(req,"uid",true); dm.emp_no =
		 * Util.getSessionParameterValue(req,"emp_no",true);
		 *******************************************************************************************/
	}

	public void fc_acct_2122_i(HttpServletRequest req, HttpServletResponse res)
			throws AppException, SQLException {
		FC_ACCT_2122_IDataSet ds = null;
		FC_ACCT_2122_IDM dm = new FC_ACCT_2122_IDM();

		String multiUpdateData;
		Hashtable hash;

		dm.cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
		dm.mode = Util.checkString(req.getParameter("mode"));
		dm.reg_clsf = Util.checkString(req.getParameter("reg_clsf"));
		dm.prof_type_cd = Util.checkString(req.getParameter("prof_type_cd"));
		dm.slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
		dm.slip_occr_dt = Util.checkString(req.getParameter("slip_occr_dt"));
		dm.slip_seq = Util.checkString(req.getParameter("slip_seq"));
		dm.make_dt = Util.checkString(req.getParameter("make_dt"));
		dm.erplace_cd = Util.checkString(req.getParameter("erplace_cd"));
		dm.dlco_clsf_cd = Util.checkString(req.getParameter("dlco_clsf_cd"));
		dm.dlco_cd = Util.checkString(req.getParameter("dlco_cd"));
		dm.deal_clsf = Util.checkString(req.getParameter("deal_clsf"));
		dm.ern = Util.checkString(req.getParameter("ern"));
		dm.dlco_nm = Util.checkString(req.getParameter("dlco_nm"));
		dm.boks_dlco_nm = Util.checkString(req.getParameter("boks_dlco_nm"));
		dm.presi_nm = Util.checkString(req.getParameter("presi_nm"));
		dm.addr = Util.checkString(req.getParameter("addr"));
		dm.bizcond = Util.checkString(req.getParameter("bizcond"));
		dm.item = Util.checkString(req.getParameter("item"));
		dm.evnt_cd = Util.checkString(req.getParameter("evnt_cd"));
		dm.suply_amt = Util.checkString(req.getParameter("suply_amt"));
		dm.vat_amt = Util.checkString(req.getParameter("vat_amt"));
		dm.tax_stmt_aprv_yn = Util.checkString(req
				.getParameter("tax_stmt_aprv_yn"));
		dm.rcpt_nosh = Util.checkString(req.getParameter("rcpt_nosh"));
		dm.sg_budg_cd = Util.checkString(req.getParameter("sg_budg_cd"));
		dm.ask_emp_no = Util.checkString(req.getParameter("ask_emp_no"));
		dm.ask_dept_cd = Util.checkString(req.getParameter("ask_dept_cd"));
		dm.rcpm_plan_dd = Util.checkString(req.getParameter("rcpm_plan_dd"));
		dm.incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		dm.sgtitem = Util.checkString(req.getParameter("sgtitem"));
		dm.medi_cd = Util.checkString(req.getParameter("medi_cd"));
		dm.dtls_medi_cd = Util.checkString(req.getParameter("dtls_medi_cd"));
		dm.vexc_cmpy_cd = Util.checkString(req.getParameter("vexc_cmpy_cd"));
		dm.draft_doc_no = Util.checkString(req.getParameter("draft_doc_no"));
		dm.draft_impt_amt = Util
				.checkString(req.getParameter("draft_impt_amt"));
		dm.draft_expn_amt = Util
				.checkString(req.getParameter("draft_expn_amt"));
		dm.in_igyb = Util.checkString(req.getParameter("in_igyb"));
		dm.slip_rcpm_dt = Util.checkString(req.getParameter("slip_rcpm_dt"));
		dm.rcpm_shet_kind = Util
				.checkString(req.getParameter("rcpm_shet_kind"));
		dm.rcpm_shet_no = Util.checkString(req.getParameter("rcpm_shet_no"));
		dm.g0_rcpm_amt = Util.checkString(req.getParameter("g0_rcpm_amt"));
		dm.email = Util.checkString(req.getParameter("email"));
		dm.semuro_no = Util.checkString(req.getParameter("semuro_no"));
		dm.elec_tax_comp_cd = Util.checkString(req
				.getParameter("elec_tax_comp_cd"));

		multiUpdateData = Util
				.checkString(req.getParameter("multiUpdateData1"));
		hash = getHashMultiUpdateData(multiUpdateData);

		dm.g1_rcpm_slip_seq = (String) hash.get("g1_rcpm_slip_seq");
		dm.g1_rcpm_dt = (String) hash.get("g1_rcpm_dt");
		dm.g1_rcpm_amt = (String) hash.get("g1_rcpm_amt");
		dm.g1_rcpm_pers_nm = (String) hash.get("g1_rcpm_pers_nm");
		dm.g1_deps_psbk = (String) hash.get("g1_deps_psbk");
		dm.g1_coms = (String) hash.get("g1_coms");
		dm.g1_frex_clsf = (String) hash.get("g1_frex_clsf");
		dm.g1_exrate = (String) hash.get("g1_exrate");
		dm.g1_frex_amt = (String) hash.get("g1_frex_amt");
		dm.biz_reg_no = (String) hash.get("biz_reg_no");
		dm.bank_id = (String) hash.get("bank_id");
		dm.acct_num = (String) hash.get("acct_num");
		dm.tran_date_seq = (String) hash.get("tran_date_seq");

		multiUpdateData = Util
				.checkString(req.getParameter("multiUpdateData2"));
		hash = getHashMultiUpdateData(multiUpdateData);

		dm.g2_rcpm_sub_seq = (String) hash.get("g2_rcpm_sub_seq");
		dm.g2_note_no = (String) hash.get("g2_note_no");
		dm.g2_rcpm_amt = (String) hash.get("g2_rcpm_amt");
		dm.g2_note_clsf_cd = (String) hash.get("g2_note_clsf_cd");
		dm.g2_bank_cd = (String) hash.get("g2_bank_cd");
		dm.g2_bank_cd_nm = (String) hash.get("g2_bank_cd_nm");
		dm.g2_issu_pers_nm = (String) hash.get("g2_issu_pers_nm");
		dm.g2_issu_cmpy_clsf_cd = (String) hash.get("g2_issu_cmpy_clsf_cd");
		dm.g2_comp_dt = (String) hash.get("g2_comp_dt");
		dm.g2_mtry_dt = (String) hash.get("g2_mtry_dt");
		dm.g2_rcpm_acct = (String) hash.get("g2_rcpm_acct");
		dm.g2_sale_aprv_no = (String) hash.get("g2_sale_aprv_no");

		multiUpdateData = Util
				.checkString(req.getParameter("multiUpdateData3"));
		hash = getHashMultiUpdateData(multiUpdateData);

		dm.g3_rcpm_sub_seq = (String) hash.get("g3_rcpm_sub_seq");
		dm.g3_budg_cd = (String) hash.get("g3_budg_cd");
		dm.g3_budg_cd_nm = (String) hash.get("g3_budg_cd_nm");
		dm.g3_rcpm_amt = (String) hash.get("g3_rcpm_amt");
		dm.g3_whco_slip_clsf = (String) hash.get("g3_whco_slip_clsf");
		dm.g3_whco_slip_no = (String) hash.get("g3_whco_slip_no");

		dm.make_upd_dt = Util.checkString(req.getParameter("make_upd_dt"));
		dm.upd_tms = Util.checkString(req.getParameter("upd_tms"));
		dm.last_upd_dd = Util.checkString(req.getParameter("last_upd_dd"));

		dm.rcpm_slip_no = Util.checkString(req.getParameter("rcpm_slip_no"));
		dm.exrate_diff_yn = Util
				.checkString(req.getParameter("exrate_diff_yn"));
		dm.etc_in_yn = Util.checkString(req.getParameter("etc_in_yn"));
		dm.stmt_rmtt_yn = Util.checkString(req.getParameter("stmt_rmtt_yn"));
		dm.unit = Util.checkString(req.getParameter("unit"));
		dm.qunt = Util.checkString(req.getParameter("qunt"));
		dm.code_cd = Util.checkString(req.getParameter("code_cd"));
		dm.chnl_clsf_cd = Util.checkString(req.getParameter("chnl_clsf_cd"));

		dm.print();

		/* EJB 수정후 시작 */
		FC_ACCT_2000DAO dao = new FC_ACCT_2000DAO();
		ds = dao.fc_acct_2122_i(dm);

		if (!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/*
		 * EJB 수정전 시작 try { FC_ACCT_2000EJBHome home =
		 * (FC_ACCT_2000EJBHome)JNDIManager
		 * .getInstance().getHome("FC_ACCT_2000EJB"); FC_ACCT_2000EJB ejb =
		 * home.create();
		 * 
		 * ds = ejb.fc_acct_2122_i(dm); req.setAttribute("ds", ds); } catch
		 * (CreateException e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } catch (RemoteException
		 * e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } EJB 수정전 끝
		 */

		/*******************************************************************************************
		 * String multiUpdateData =
		 * Util.checkString(req.getParameter("multiUpdateData")); Hashtable hash
		 * = getHashMultiUpdateData(multiUpdateData);
		 * 
		 * dm.cmpy_cd = (String)hash.get("cmpy_cd"); dm.mode =
		 * (String)hash.get("mode"); dm.reg_clsf = (String)hash.get("reg_clsf");
		 * dm.prof_type_cd = (String)hash.get("prof_type_cd"); dm.slip_clsf_cd =
		 * (String)hash.get("slip_clsf_cd"); dm.slip_occr_dt =
		 * (String)hash.get("slip_occr_dt"); dm.slip_seq =
		 * (String)hash.get("slip_seq"); dm.make_dt =
		 * (String)hash.get("make_dt"); dm.erplace_cd =
		 * (String)hash.get("erplace_cd"); dm.dlco_clsf_cd =
		 * (String)hash.get("dlco_clsf_cd"); dm.dlco_cd =
		 * (String)hash.get("dlco_cd"); dm.deal_clsf =
		 * (String)hash.get("deal_clsf"); dm.ern = (String)hash.get("ern");
		 * dm.dlco_nm = (String)hash.get("dlco_nm"); dm.presi_nm =
		 * (String)hash.get("presi_nm"); dm.addr = (String)hash.get("addr");
		 * dm.bizcond = (String)hash.get("bizcond"); dm.item =
		 * (String)hash.get("item"); dm.evnt_cd = (String)hash.get("evnt_cd");
		 * dm.suply_amt = (String)hash.get("suply_amt"); dm.vat_amt =
		 * (String)hash.get("vat_amt"); dm.tax_stmt_aprv_yn =
		 * (String)hash.get("tax_stmt_aprv_yn"); dm.rcpt_nosh =
		 * (String)hash.get("rcpt_nosh"); dm.sg_budg_cd =
		 * (String)hash.get("sg_budg_cd"); dm.ask_emp_no =
		 * (String)hash.get("ask_emp_no"); dm.ask_dept_cd =
		 * (String)hash.get("ask_dept_cd"); dm.rcpm_plan_dd =
		 * (String)hash.get("rcpm_plan_dd"); dm.incmg_pers =
		 * (String)hash.get("incmg_pers"); dm.incmg_pers_ipadd =
		 * (String)hash.get("incmg_pers_ipadd"); dm.sgtitem =
		 * (String)hash.get("sgtitem"); dm.medi_cd =
		 * (String)hash.get("medi_cd"); dm.dtls_medi_cd =
		 * (String)hash.get("dtls_medi_cd"); dm.vexc_cmpy_cd =
		 * (String)hash.get("vexc_cmpy_cd"); dm.draft_doc_no =
		 * (String)hash.get("draft_doc_no"); dm.draft_impt_amt =
		 * (String)hash.get("draft_impt_amt"); dm.draft_expn_amt =
		 * (String)hash.get("draft_expn_amt"); dm.in_igyb =
		 * (String)hash.get("in_igyb"); dm.slip_rcpm_dt =
		 * (String)hash.get("slip_rcpm_dt"); dm.rcpm_shet_kind =
		 * (String)hash.get("rcpm_shet_kind"); dm.rcpm_shet_no =
		 * (String)hash.get("rcpm_shet_no"); dm.g0_rcpm_amt =
		 * (String)hash.get("g0_rcpm_amt"); dm.g1_rcpm_slip_seq =
		 * (String)hash.get("g1_rcpm_slip_seq"); dm.g1_rcpm_dt =
		 * (String)hash.get("g1_rcpm_dt"); dm.g1_rcpm_amt =
		 * (String)hash.get("g1_rcpm_amt"); dm.g1_rcpm_pers_nm =
		 * (String)hash.get("g1_rcpm_pers_nm"); dm.g1_deps_psbk =
		 * (String)hash.get("g1_deps_psbk"); dm.g1_coms =
		 * (String)hash.get("g1_coms"); dm.g1_frex_clsf =
		 * (String)hash.get("g1_frex_clsf"); dm.g1_exrate =
		 * (String)hash.get("g1_exrate"); dm.g1_frex_amt =
		 * (String)hash.get("g1_frex_amt"); dm.g2_rcpm_sub_seq =
		 * (String)hash.get("g2_rcpm_sub_seq"); dm.g2_note_no =
		 * (String)hash.get("g2_note_no"); dm.g2_rcpm_amt =
		 * (String)hash.get("g2_rcpm_amt"); dm.g2_note_clsf_cd =
		 * (String)hash.get("g2_note_clsf_cd"); dm.g2_bank_cd =
		 * (String)hash.get("g2_bank_cd"); dm.g2_bank_cd_nm =
		 * (String)hash.get("g2_bank_cd_nm"); dm.g2_issu_pers_nm =
		 * (String)hash.get("g2_issu_pers_nm"); dm.g2_issu_cmpy_clsf_cd =
		 * (String)hash.get("g2_issu_cmpy_clsf_cd"); dm.g2_comp_dt =
		 * (String)hash.get("g2_comp_dt"); dm.g2_mtry_dt =
		 * (String)hash.get("g2_mtry_dt"); dm.g2_rcpm_acct =
		 * (String)hash.get("g2_rcpm_acct"); dm.g2_sale_aprv_no =
		 * (String)hash.get("g2_sale_aprv_no"); dm.g3_rcpm_sub_seq =
		 * (String)hash.get("g3_rcpm_sub_seq"); dm.g3_budg_cd =
		 * (String)hash.get("g3_budg_cd"); dm.g3_budg_cd_nm =
		 * (String)hash.get("g3_budg_cd_nm"); dm.g3_rcpm_amt =
		 * (String)hash.get("g3_rcpm_amt"); dm.g3_whco_slip_clsf =
		 * (String)hash.get("g3_whco_slip_clsf"); dm.g3_whco_slip_no =
		 * (String)hash.get("g3_whco_slip_no"); dm.make_upd_dt =
		 * (String)hash.get("make_upd_dt"); dm.upd_tms =
		 * (String)hash.get("upd_tms"); dm.last_upd_dd =
		 * (String)hash.get("last_upd_dd");
		 *******************************************************************************************/

		/*******************************************************************************************
		 * dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		 * dm.mode = Util.getSessionParameterValue(req,"mode",true); dm.reg_clsf
		 * = Util.getSessionParameterValue(req,"reg_clsf",true); dm.prof_type_cd
		 * = Util.getSessionParameterValue(req,"prof_type_cd",true);
		 * dm.slip_clsf_cd =
		 * Util.getSessionParameterValue(req,"slip_clsf_cd",true);
		 * dm.slip_occr_dt =
		 * Util.getSessionParameterValue(req,"slip_occr_dt",true); dm.slip_seq =
		 * Util.getSessionParameterValue(req,"slip_seq",true); dm.make_dt =
		 * Util.getSessionParameterValue(req,"make_dt",true); dm.erplace_cd =
		 * Util.getSessionParameterValue(req,"erplace_cd",true); dm.dlco_clsf_cd
		 * = Util.getSessionParameterValue(req,"dlco_clsf_cd",true); dm.dlco_cd
		 * = Util.getSessionParameterValue(req,"dlco_cd",true); dm.deal_clsf =
		 * Util.getSessionParameterValue(req,"deal_clsf",true); dm.ern =
		 * Util.getSessionParameterValue(req,"ern",true); dm.dlco_nm =
		 * Util.getSessionParameterValue(req,"dlco_nm",true); dm.presi_nm =
		 * Util.getSessionParameterValue(req,"presi_nm",true); dm.addr =
		 * Util.getSessionParameterValue(req,"addr",true); dm.bizcond =
		 * Util.getSessionParameterValue(req,"bizcond",true); dm.item =
		 * Util.getSessionParameterValue(req,"item",true); dm.evnt_cd =
		 * Util.getSessionParameterValue(req,"evnt_cd",true); dm.suply_amt =
		 * Util.getSessionParameterValue(req,"suply_amt",true); dm.vat_amt =
		 * Util.getSessionParameterValue(req,"vat_amt",true);
		 * dm.tax_stmt_aprv_yn =
		 * Util.getSessionParameterValue(req,"tax_stmt_aprv_yn",true);
		 * dm.rcpt_nosh = Util.getSessionParameterValue(req,"rcpt_nosh",true);
		 * dm.sg_budg_cd = Util.getSessionParameterValue(req,"sg_budg_cd",true);
		 * dm.ask_emp_no = Util.getSessionParameterValue(req,"ask_emp_no",true);
		 * dm.ask_dept_cd =
		 * Util.getSessionParameterValue(req,"ask_dept_cd",true);
		 * dm.rcpm_plan_dd =
		 * Util.getSessionParameterValue(req,"rcpm_plan_dd",true); dm.incmg_pers
		 * = Util.getSessionParameterValue(req,"incmg_pers",true);
		 * dm.incmg_pers_ipadd =
		 * Util.getSessionParameterValue(req,"incmg_pers_ipadd",true);
		 * dm.sgtitem = Util.getSessionParameterValue(req,"sgtitem",true);
		 * dm.medi_cd = Util.getSessionParameterValue(req,"medi_cd",true);
		 * dm.dtls_medi_cd =
		 * Util.getSessionParameterValue(req,"dtls_medi_cd",true);
		 * dm.vexc_cmpy_cd =
		 * Util.getSessionParameterValue(req,"vexc_cmpy_cd",true);
		 * dm.draft_doc_no =
		 * Util.getSessionParameterValue(req,"draft_doc_no",true);
		 * dm.draft_impt_amt =
		 * Util.getSessionParameterValue(req,"draft_impt_amt",true);
		 * dm.draft_expn_amt =
		 * Util.getSessionParameterValue(req,"draft_expn_amt",true); dm.in_igyb
		 * = Util.getSessionParameterValue(req,"in_igyb",true); dm.slip_rcpm_dt
		 * = Util.getSessionParameterValue(req,"slip_rcpm_dt",true);
		 * dm.rcpm_shet_kind =
		 * Util.getSessionParameterValue(req,"rcpm_shet_kind",true);
		 * dm.rcpm_shet_no =
		 * Util.getSessionParameterValue(req,"rcpm_shet_no",true);
		 * dm.g0_rcpm_amt =
		 * Util.getSessionParameterValue(req,"g0_rcpm_amt",true);
		 * dm.g1_rcpm_slip_seq =
		 * Util.getSessionParameterValue(req,"g1_rcpm_slip_seq",true);
		 * dm.g1_rcpm_dt = Util.getSessionParameterValue(req,"g1_rcpm_dt",true);
		 * dm.g1_rcpm_amt =
		 * Util.getSessionParameterValue(req,"g1_rcpm_amt",true);
		 * dm.g1_rcpm_pers_nm =
		 * Util.getSessionParameterValue(req,"g1_rcpm_pers_nm",true);
		 * dm.g1_deps_psbk =
		 * Util.getSessionParameterValue(req,"g1_deps_psbk",true); dm.g1_coms =
		 * Util.getSessionParameterValue(req,"g1_coms",true); dm.g1_frex_clsf =
		 * Util.getSessionParameterValue(req,"g1_frex_clsf",true); dm.g1_exrate
		 * = Util.getSessionParameterValue(req,"g1_exrate",true); dm.g1_frex_amt
		 * = Util.getSessionParameterValue(req,"g1_frex_amt",true);
		 * dm.g2_rcpm_sub_seq =
		 * Util.getSessionParameterValue(req,"g2_rcpm_sub_seq",true);
		 * dm.g2_note_no = Util.getSessionParameterValue(req,"g2_note_no",true);
		 * dm.g2_rcpm_amt =
		 * Util.getSessionParameterValue(req,"g2_rcpm_amt",true);
		 * dm.g2_note_clsf_cd =
		 * Util.getSessionParameterValue(req,"g2_note_clsf_cd",true);
		 * dm.g2_bank_cd = Util.getSessionParameterValue(req,"g2_bank_cd",true);
		 * dm.g2_bank_cd_nm =
		 * Util.getSessionParameterValue(req,"g2_bank_cd_nm",true);
		 * dm.g2_issu_pers_nm =
		 * Util.getSessionParameterValue(req,"g2_issu_pers_nm",true);
		 * dm.g2_issu_cmpy_clsf_cd =
		 * Util.getSessionParameterValue(req,"g2_issu_cmpy_clsf_cd",true);
		 * dm.g2_comp_dt = Util.getSessionParameterValue(req,"g2_comp_dt",true);
		 * dm.g2_mtry_dt = Util.getSessionParameterValue(req,"g2_mtry_dt",true);
		 * dm.g2_rcpm_acct =
		 * Util.getSessionParameterValue(req,"g2_rcpm_acct",true);
		 * dm.g2_sale_aprv_no =
		 * Util.getSessionParameterValue(req,"g2_sale_aprv_no",true);
		 * dm.g3_rcpm_sub_seq =
		 * Util.getSessionParameterValue(req,"g3_rcpm_sub_seq",true);
		 * dm.g3_budg_cd = Util.getSessionParameterValue(req,"g3_budg_cd",true);
		 * dm.g3_budg_cd_nm =
		 * Util.getSessionParameterValue(req,"g3_budg_cd_nm",true);
		 * dm.g3_rcpm_amt =
		 * Util.getSessionParameterValue(req,"g3_rcpm_amt",true);
		 * dm.g3_whco_slip_clsf =
		 * Util.getSessionParameterValue(req,"g3_whco_slip_clsf",true);
		 * dm.g3_whco_slip_no =
		 * Util.getSessionParameterValue(req,"g3_whco_slip_no",true);
		 * dm.make_upd_dt =
		 * Util.getSessionParameterValue(req,"make_upd_dt",true); dm.upd_tms =
		 * Util.getSessionParameterValue(req,"upd_tms",true); dm.last_upd_dd =
		 * Util.getSessionParameterValue(req,"last_upd_dd",true);
		 *******************************************************************************************/
	}

	public void fc_acct_2123_u(HttpServletRequest req, HttpServletResponse res)
			throws AppException, SQLException {
		FC_ACCT_2123_UDataSet ds = null;
		FC_ACCT_2123_UDM dm = new FC_ACCT_2123_UDM();

		dm.cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
		dm.reg_clsf = Util.checkString(req.getParameter("reg_clsf"));
		dm.prof_type_cd = Util.checkString(req.getParameter("prof_type_cd"));
		dm.slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
		dm.slip_occr_dt = Util.checkString(req.getParameter("slip_occr_dt"));
		dm.slip_seq = Util.checkString(req.getParameter("slip_seq"));
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
		dm.evnt_cd = Util.checkString(req.getParameter("evnt_cd"));
		dm.suply_amt = Util.checkString(req.getParameter("suply_amt"));
		dm.vat_amt = Util.checkString(req.getParameter("vat_amt"));
		dm.tax_stmt_aprv_yn = Util.checkString(req
				.getParameter("tax_stmt_aprv_yn"));
		dm.make_upd_dt = Util.checkString(req.getParameter("make_upd_dt"));
		dm.upd_tms = Util.checkString(req.getParameter("upd_tms"));
		dm.last_upd_dd = Util.checkString(req.getParameter("last_upd_dd"));
		dm.rcpt_nosh = Util.checkString(req.getParameter("rcpt_nosh"));
		dm.sg_budg_cd = Util.checkString(req.getParameter("sg_budg_cd"));
		dm.ask_emp_no = Util.checkString(req.getParameter("ask_emp_no"));
		dm.ask_dept_cd = Util.checkString(req.getParameter("ask_dept_cd"));
		dm.rcpm_plan_dd = Util.checkString(req.getParameter("rcpm_plan_dd"));
		dm.incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
		dm.incmg_pers_ipadd = Util.checkString(req
				.getParameter("incmg_pers_ipadd"));
		dm.sgtitem = Util.checkString(req.getParameter("sgtitem"));
		dm.slip_rcpm_dt = Util.checkString(req.getParameter("slip_rcpm_dt"));
		dm.slip_sub_seq = Util.checkString(req.getParameter("slip_sub_seq"));
		dm.gt_budg_cd = Util.checkString(req.getParameter("gt_budg_cd"));
		dm.rcpm_amt = Util.checkString(req.getParameter("rcpm_amt"));
		dm.rcpm_dt = Util.checkString(req.getParameter("rcpm_dt"));
		dm.deps_psbk = Util.checkString(req.getParameter("deps_psbk"));
		dm.coms = Util.checkString(req.getParameter("coms"));
		dm.rcpm_pers_nm = Util.checkString(req.getParameter("rcpm_pers_nm"));
		dm.gt_note_no = Util.checkString(req.getParameter("gt_note_no"));
		dm.gt_bank_cd = Util.checkString(req.getParameter("gt_bank_cd"));
		dm.note_clsf_cd = Util.checkString(req.getParameter("note_clsf_cd"));
		dm.comp_dt = Util.checkString(req.getParameter("comp_dt"));
		dm.mtry_dt = Util.checkString(req.getParameter("mtry_dt"));
		dm.note_amt = Util.checkString(req.getParameter("note_amt"));
		dm.issu_cmpy_clsf_cd = Util.checkString(req
				.getParameter("issu_cmpy_clsf_cd"));
		dm.issu_pers_nm = Util.checkString(req.getParameter("issu_pers_nm"));
		dm.ee_bank_cd = Util.checkString(req.getParameter("ee_bank_cd"));
		dm.ee_note_no = Util.checkString(req.getParameter("ee_note_no"));
		dm.in_igyb = Util.checkString(req.getParameter("in_igyb"));
		dm.rcpm_shet_kind = Util
				.checkString(req.getParameter("rcpm_shet_kind"));
		dm.rcpm_shet_no = Util.checkString(req.getParameter("rcpm_shet_no"));
		dm.whco_slip_clsf = Util
				.checkString(req.getParameter("whco_slip_clsf"));
		dm.whco_slip_no = Util.checkString(req.getParameter("whco_slip_no"));
		dm.medi_cd = Util.checkString(req.getParameter("medi_cd"));
		dm.semuro_no = Util.checkString(req.getParameter("semuro_no"));
		dm.elec_tax_comp_cd = Util.checkString(req
				.getParameter("elec_tax_comp_cd"));

		dm.print();

		/* EJB 수정후 시작 */
		FC_ACCT_2000DAO dao = new FC_ACCT_2000DAO();
		ds = dao.fc_acct_2123_u(dm);

		if (!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/*
		 * EJB 수정전 시작 try { FC_ACCT_2000EJBHome home =
		 * (FC_ACCT_2000EJBHome)JNDIManager
		 * .getInstance().getHome("FC_ACCT_2000EJB"); FC_ACCT_2000EJB ejb =
		 * home.create();
		 * 
		 * ds = ejb.fc_acct_2123_u(dm); req.setAttribute("ds", ds); } catch
		 * (CreateException e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } catch (RemoteException
		 * e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } EJB 수정전 끝
		 */

		/*******************************************************************************************
		 * String multiUpdateData =
		 * Util.checkString(req.getParameter("multiUpdateData")); Hashtable hash
		 * = getHashMultiUpdateData(multiUpdateData);
		 * 
		 * dm.cmpy_cd = (String)hash.get("cmpy_cd"); dm.reg_clsf =
		 * (String)hash.get("reg_clsf"); dm.prof_type_cd =
		 * (String)hash.get("prof_type_cd"); dm.slip_clsf_cd =
		 * (String)hash.get("slip_clsf_cd"); dm.slip_occr_dt =
		 * (String)hash.get("slip_occr_dt"); dm.slip_seq =
		 * (String)hash.get("slip_seq"); dm.make_dt =
		 * (String)hash.get("make_dt"); dm.erplace_cd =
		 * (String)hash.get("erplace_cd"); dm.dlco_clsf_cd =
		 * (String)hash.get("dlco_clsf_cd"); dm.dlco_cd =
		 * (String)hash.get("dlco_cd"); dm.deal_clsf =
		 * (String)hash.get("deal_clsf"); dm.ern = (String)hash.get("ern");
		 * dm.dlco_nm = (String)hash.get("dlco_nm"); dm.presi_nm =
		 * (String)hash.get("presi_nm"); dm.addr = (String)hash.get("addr");
		 * dm.bizcond = (String)hash.get("bizcond"); dm.item =
		 * (String)hash.get("item"); dm.evnt_cd = (String)hash.get("evnt_cd");
		 * dm.suply_amt = (String)hash.get("suply_amt"); dm.vat_amt =
		 * (String)hash.get("vat_amt"); dm.tax_stmt_aprv_yn =
		 * (String)hash.get("tax_stmt_aprv_yn"); dm.make_upd_dt =
		 * (String)hash.get("make_upd_dt"); dm.upd_tms =
		 * (String)hash.get("upd_tms"); dm.last_upd_dd =
		 * (String)hash.get("last_upd_dd"); dm.rcpt_nosh =
		 * (String)hash.get("rcpt_nosh"); dm.sg_budg_cd =
		 * (String)hash.get("sg_budg_cd"); dm.ask_emp_no =
		 * (String)hash.get("ask_emp_no"); dm.ask_dept_cd =
		 * (String)hash.get("ask_dept_cd"); dm.rcpm_plan_dd =
		 * (String)hash.get("rcpm_plan_dd"); dm.incmg_pers =
		 * (String)hash.get("incmg_pers"); dm.incmg_pers_ipadd =
		 * (String)hash.get("incmg_pers_ipadd"); dm.sgtitem =
		 * (String)hash.get("sgtitem"); dm.slip_rcpm_dt =
		 * (String)hash.get("slip_rcpm_dt"); dm.slip_sub_seq =
		 * (String)hash.get("slip_sub_seq"); dm.gt_budg_cd =
		 * (String)hash.get("gt_budg_cd"); dm.rcpm_amt =
		 * (String)hash.get("rcpm_amt"); dm.rcpm_dt =
		 * (String)hash.get("rcpm_dt"); dm.deps_psbk =
		 * (String)hash.get("deps_psbk"); dm.coms = (String)hash.get("coms");
		 * dm.rcpm_pers_nm = (String)hash.get("rcpm_pers_nm"); dm.gt_note_no =
		 * (String)hash.get("gt_note_no"); dm.gt_bank_cd =
		 * (String)hash.get("gt_bank_cd"); dm.note_clsf_cd =
		 * (String)hash.get("note_clsf_cd"); dm.comp_dt =
		 * (String)hash.get("comp_dt"); dm.mtry_dt =
		 * (String)hash.get("mtry_dt"); dm.note_amt =
		 * (String)hash.get("note_amt"); dm.issu_cmpy_clsf_cd =
		 * (String)hash.get("issu_cmpy_clsf_cd"); dm.issu_pers_nm =
		 * (String)hash.get("issu_pers_nm"); dm.ee_bank_cd =
		 * (String)hash.get("ee_bank_cd"); dm.ee_note_no =
		 * (String)hash.get("ee_note_no"); dm.in_igyb =
		 * (String)hash.get("in_igyb"); dm.rcpm_shet_kind =
		 * (String)hash.get("rcpm_shet_kind"); dm.rcpm_shet_no =
		 * (String)hash.get("rcpm_shet_no"); dm.whco_slip_clsf =
		 * (String)hash.get("whco_slip_clsf"); dm.whco_slip_no =
		 * (String)hash.get("whco_slip_no"); dm.medi_cd =
		 * (String)hash.get("medi_cd");
		 *******************************************************************************************/

		/*******************************************************************************************
		 * dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		 * dm.reg_clsf = Util.getSessionParameterValue(req,"reg_clsf",true);
		 * dm.prof_type_cd =
		 * Util.getSessionParameterValue(req,"prof_type_cd",true);
		 * dm.slip_clsf_cd =
		 * Util.getSessionParameterValue(req,"slip_clsf_cd",true);
		 * dm.slip_occr_dt =
		 * Util.getSessionParameterValue(req,"slip_occr_dt",true); dm.slip_seq =
		 * Util.getSessionParameterValue(req,"slip_seq",true); dm.make_dt =
		 * Util.getSessionParameterValue(req,"make_dt",true); dm.erplace_cd =
		 * Util.getSessionParameterValue(req,"erplace_cd",true); dm.dlco_clsf_cd
		 * = Util.getSessionParameterValue(req,"dlco_clsf_cd",true); dm.dlco_cd
		 * = Util.getSessionParameterValue(req,"dlco_cd",true); dm.deal_clsf =
		 * Util.getSessionParameterValue(req,"deal_clsf",true); dm.ern =
		 * Util.getSessionParameterValue(req,"ern",true); dm.dlco_nm =
		 * Util.getSessionParameterValue(req,"dlco_nm",true); dm.presi_nm =
		 * Util.getSessionParameterValue(req,"presi_nm",true); dm.addr =
		 * Util.getSessionParameterValue(req,"addr",true); dm.bizcond =
		 * Util.getSessionParameterValue(req,"bizcond",true); dm.item =
		 * Util.getSessionParameterValue(req,"item",true); dm.evnt_cd =
		 * Util.getSessionParameterValue(req,"evnt_cd",true); dm.suply_amt =
		 * Util.getSessionParameterValue(req,"suply_amt",true); dm.vat_amt =
		 * Util.getSessionParameterValue(req,"vat_amt",true);
		 * dm.tax_stmt_aprv_yn =
		 * Util.getSessionParameterValue(req,"tax_stmt_aprv_yn",true);
		 * dm.make_upd_dt =
		 * Util.getSessionParameterValue(req,"make_upd_dt",true); dm.upd_tms =
		 * Util.getSessionParameterValue(req,"upd_tms",true); dm.last_upd_dd =
		 * Util.getSessionParameterValue(req,"last_upd_dd",true); dm.rcpt_nosh =
		 * Util.getSessionParameterValue(req,"rcpt_nosh",true); dm.sg_budg_cd =
		 * Util.getSessionParameterValue(req,"sg_budg_cd",true); dm.ask_emp_no =
		 * Util.getSessionParameterValue(req,"ask_emp_no",true); dm.ask_dept_cd
		 * = Util.getSessionParameterValue(req,"ask_dept_cd",true);
		 * dm.rcpm_plan_dd =
		 * Util.getSessionParameterValue(req,"rcpm_plan_dd",true); dm.incmg_pers
		 * = Util.getSessionParameterValue(req,"incmg_pers",true);
		 * dm.incmg_pers_ipadd =
		 * Util.getSessionParameterValue(req,"incmg_pers_ipadd",true);
		 * dm.sgtitem = Util.getSessionParameterValue(req,"sgtitem",true);
		 * dm.slip_rcpm_dt =
		 * Util.getSessionParameterValue(req,"slip_rcpm_dt",true);
		 * dm.slip_sub_seq =
		 * Util.getSessionParameterValue(req,"slip_sub_seq",true); dm.gt_budg_cd
		 * = Util.getSessionParameterValue(req,"gt_budg_cd",true); dm.rcpm_amt =
		 * Util.getSessionParameterValue(req,"rcpm_amt",true); dm.rcpm_dt =
		 * Util.getSessionParameterValue(req,"rcpm_dt",true); dm.deps_psbk =
		 * Util.getSessionParameterValue(req,"deps_psbk",true); dm.coms =
		 * Util.getSessionParameterValue(req,"coms",true); dm.rcpm_pers_nm =
		 * Util.getSessionParameterValue(req,"rcpm_pers_nm",true); dm.gt_note_no
		 * = Util.getSessionParameterValue(req,"gt_note_no",true); dm.gt_bank_cd
		 * = Util.getSessionParameterValue(req,"gt_bank_cd",true);
		 * dm.note_clsf_cd =
		 * Util.getSessionParameterValue(req,"note_clsf_cd",true); dm.comp_dt =
		 * Util.getSessionParameterValue(req,"comp_dt",true); dm.mtry_dt =
		 * Util.getSessionParameterValue(req,"mtry_dt",true); dm.note_amt =
		 * Util.getSessionParameterValue(req,"note_amt",true);
		 * dm.issu_cmpy_clsf_cd =
		 * Util.getSessionParameterValue(req,"issu_cmpy_clsf_cd",true);
		 * dm.issu_pers_nm =
		 * Util.getSessionParameterValue(req,"issu_pers_nm",true); dm.ee_bank_cd
		 * = Util.getSessionParameterValue(req,"ee_bank_cd",true); dm.ee_note_no
		 * = Util.getSessionParameterValue(req,"ee_note_no",true); dm.in_igyb =
		 * Util.getSessionParameterValue(req,"in_igyb",true); dm.rcpm_shet_kind
		 * = Util.getSessionParameterValue(req,"rcpm_shet_kind",true);
		 * dm.rcpm_shet_no =
		 * Util.getSessionParameterValue(req,"rcpm_shet_no",true);
		 * dm.whco_slip_clsf =
		 * Util.getSessionParameterValue(req,"whco_slip_clsf",true);
		 * dm.whco_slip_no =
		 * Util.getSessionParameterValue(req,"whco_slip_no",true); dm.medi_cd =
		 * Util.getSessionParameterValue(req,"medi_cd",true);
		 *******************************************************************************************/
	}

	public void fc_acct_2124_d(HttpServletRequest req, HttpServletResponse res)
			throws AppException, SQLException {
		FC_ACCT_2124_DDataSet ds = null;
		FC_ACCT_2124_DDM dm = new FC_ACCT_2124_DDM();

		dm.cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
		dm.prof_type_cd = Util.checkString(req.getParameter("prof_type_cd"));
		dm.slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
		dm.slip_occr_dt = Util.checkString(req.getParameter("slip_occr_dt"));
		dm.slip_seq = Util.checkString(req.getParameter("slip_seq"));
		dm.bank_cd = Util.checkString(req.getParameter("bank_cd"));
		dm.note_no = Util.checkString(req.getParameter("note_no"));
		dm.slip_rcpm_dt = Util.checkString(req.getParameter("slip_rcpm_dt"));
		dm.in_igyb = Util.checkString(req.getParameter("in_igyb"));
		dm.rcpm_shet_kind = Util
				.checkString(req.getParameter("rcpm_shet_kind"));
		dm.rcpm_shet_no = Util.checkString(req.getParameter("rcpm_shet_no"));
		dm.whco_slip_clsf = Util
				.checkString(req.getParameter("whco_slip_clsf"));
		dm.whco_slip_no = Util.checkString(req.getParameter("whco_slip_no"));
		dm.rcpm_amt = Util.checkString(req.getParameter("rcpm_amt"));
		dm.incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
		dm.incmg_pers_ipadd = req.getRemoteAddr();

		dm.print();

		/* EJB 수정후 시작 */
		FC_ACCT_2000DAO dao = new FC_ACCT_2000DAO();
		ds = dao.fc_acct_2124_d(dm);

		if (!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/*
		 * EJB 수정전 시작 try { FC_ACCT_2000EJBHome home =
		 * (FC_ACCT_2000EJBHome)JNDIManager
		 * .getInstance().getHome("FC_ACCT_2000EJB"); FC_ACCT_2000EJB ejb =
		 * home.create();
		 * 
		 * ds = ejb.fc_acct_2124_d(dm); req.setAttribute("ds", ds); } catch
		 * (CreateException e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } catch (RemoteException
		 * e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } EJB 수정전 끝
		 */

		/*******************************************************************************************
		 * String multiUpdateData =
		 * Util.checkString(req.getParameter("multiUpdateData")); Hashtable hash
		 * = getHashMultiUpdateData(multiUpdateData);
		 * 
		 * dm.cmpy_cd = (String)hash.get("cmpy_cd"); dm.prof_type_cd =
		 * (String)hash.get("prof_type_cd"); dm.slip_clsf_cd =
		 * (String)hash.get("slip_clsf_cd"); dm.slip_occr_dt =
		 * (String)hash.get("slip_occr_dt"); dm.slip_seq =
		 * (String)hash.get("slip_seq"); dm.bank_cd =
		 * (String)hash.get("bank_cd"); dm.note_no =
		 * (String)hash.get("note_no"); dm.slip_rcpm_dt =
		 * (String)hash.get("slip_rcpm_dt"); dm.in_igyb =
		 * (String)hash.get("in_igyb"); dm.rcpm_shet_kind =
		 * (String)hash.get("rcpm_shet_kind"); dm.rcpm_shet_no =
		 * (String)hash.get("rcpm_shet_no"); dm.whco_slip_clsf =
		 * (String)hash.get("whco_slip_clsf"); dm.whco_slip_no =
		 * (String)hash.get("whco_slip_no"); dm.rcpm_amt =
		 * (String)hash.get("rcpm_amt"); dm.incmg_pers =
		 * (String)hash.get("incmg_pers"); dm.incmg_pers_ipadd =
		 * (String)hash.get("incmg_pers_ipadd");
		 *******************************************************************************************/

		/*******************************************************************************************
		 * dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		 * dm.prof_type_cd =
		 * Util.getSessionParameterValue(req,"prof_type_cd",true);
		 * dm.slip_clsf_cd =
		 * Util.getSessionParameterValue(req,"slip_clsf_cd",true);
		 * dm.slip_occr_dt =
		 * Util.getSessionParameterValue(req,"slip_occr_dt",true); dm.slip_seq =
		 * Util.getSessionParameterValue(req,"slip_seq",true); dm.bank_cd =
		 * Util.getSessionParameterValue(req,"bank_cd",true); dm.note_no =
		 * Util.getSessionParameterValue(req,"note_no",true); dm.slip_rcpm_dt =
		 * Util.getSessionParameterValue(req,"slip_rcpm_dt",true); dm.in_igyb =
		 * Util.getSessionParameterValue(req,"in_igyb",true); dm.rcpm_shet_kind
		 * = Util.getSessionParameterValue(req,"rcpm_shet_kind",true);
		 * dm.rcpm_shet_no =
		 * Util.getSessionParameterValue(req,"rcpm_shet_no",true);
		 * dm.whco_slip_clsf =
		 * Util.getSessionParameterValue(req,"whco_slip_clsf",true);
		 * dm.whco_slip_no =
		 * Util.getSessionParameterValue(req,"whco_slip_no",true); dm.rcpm_amt =
		 * Util.getSessionParameterValue(req,"rcpm_amt",true); dm.incmg_pers =
		 * Util.getSessionParameterValue(req,"incmg_pers",true);
		 * dm.incmg_pers_ipadd =
		 * Util.getSessionParameterValue(req,"incmg_pers_ipadd",true);
		 *******************************************************************************************/
	}

	public void fc_acct_2125_s(HttpServletRequest req, HttpServletResponse res)
			throws AppException, SQLException {
		FC_ACCT_2125_SDataSet ds = null;
		FC_ACCT_2125_SDM dm = new FC_ACCT_2125_SDM();

		dm.cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
		dm.rcpm_slip_occr_dt = Util.checkString(req
				.getParameter("rcpm_slip_occr_dt"));
		dm.rcpm_slip_clsf_cd = Util.checkString(req
				.getParameter("rcpm_slip_clsf_cd"));
		dm.rcpm_slip_seq = Util.checkString(req.getParameter("rcpm_slip_seq"));
		dm.slip_occr_dt = Util.checkString(req.getParameter("slip_occr_dt"));
		dm.slip_seq = Util.checkString(req.getParameter("slip_seq"));

		dm.print();

		/* EJB 수정후 시작 */
		FC_ACCT_2000DAO dao = new FC_ACCT_2000DAO();
		ds = dao.fc_acct_2125_s(dm);

		if (!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/*
		 * EJB 수정전 시작 try { FC_ACCT_2000EJBHome home =
		 * (FC_ACCT_2000EJBHome)JNDIManager
		 * .getInstance().getHome("FC_ACCT_2000EJB"); FC_ACCT_2000EJB ejb =
		 * home.create();
		 * 
		 * ds = ejb.fc_acct_2125_s(dm); req.setAttribute("ds", ds); } catch
		 * (CreateException e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } catch (RemoteException
		 * e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } EJB 수정전 끝
		 */

		/*******************************************************************************************
		 * String multiUpdateData =
		 * Util.checkString(req.getParameter("multiUpdateData")); Hashtable hash
		 * = getHashMultiUpdateData(multiUpdateData);
		 * 
		 * dm.cmpy_cd = (String)hash.get("cmpy_cd"); dm.rcpm_slip_occr_dt =
		 * (String)hash.get("rcpm_slip_occr_dt"); dm.rcpm_slip_clsf_cd =
		 * (String)hash.get("rcpm_slip_clsf_cd"); dm.rcpm_slip_seq =
		 * (String)hash.get("rcpm_slip_seq");
		 *******************************************************************************************/

		/*******************************************************************************************
		 * dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		 * dm.rcpm_slip_occr_dt =
		 * Util.getSessionParameterValue(req,"rcpm_slip_occr_dt",true);
		 * dm.rcpm_slip_clsf_cd =
		 * Util.getSessionParameterValue(req,"rcpm_slip_clsf_cd",true);
		 * dm.rcpm_slip_seq =
		 * Util.getSessionParameterValue(req,"rcpm_slip_seq",true);
		 *******************************************************************************************/
	}

	public void fc_acct_2126_s(HttpServletRequest req, HttpServletResponse res)
			throws AppException, SQLException {
		FC_ACCT_2126_SDataSet ds = null;
		FC_ACCT_2126_SDM dm = new FC_ACCT_2126_SDM();

		dm.cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
		dm.budg_cd = Util.checkString(req.getParameter("budg_cd"));

		dm.print();

		/* EJB 수정후 시작 */
		FC_ACCT_2000DAO dao = new FC_ACCT_2000DAO();
		ds = dao.fc_acct_2126_s(dm);

		if (!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/*
		 * EJB 수정전 시작 try { FC_ACCT_2000EJBHome home =
		 * (FC_ACCT_2000EJBHome)JNDIManager
		 * .getInstance().getHome("FC_ACCT_2000EJB"); FC_ACCT_2000EJB ejb =
		 * home.create();
		 * 
		 * ds = ejb.fc_acct_2126_s(dm); req.setAttribute("ds", ds); } catch
		 * (CreateException e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } catch (RemoteException
		 * e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } EJB 수정전 끝
		 */

		/*******************************************************************************************
		 * String multiUpdateData =
		 * Util.checkString(req.getParameter("multiUpdateData")); Hashtable hash
		 * = getHashMultiUpdateData(multiUpdateData);
		 * 
		 * dm.cmpy_cd = (String)hash.get("cmpy_cd"); dm.budg_cd =
		 * (String)hash.get("budg_cd");
		 *******************************************************************************************/

		/*******************************************************************************************
		 * dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		 * dm.budg_cd = Util.getSessionParameterValue(req,"budg_cd",true);
		 *******************************************************************************************/
	}

	public void fc_acct_2142_a(HttpServletRequest req, HttpServletResponse res)
			throws AppException, SQLException {
		FC_ACCT_2142_ADataSet ds = null;
		FC_ACCT_2142_ADM dm = new FC_ACCT_2142_ADM();

		dm.cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
		dm.rcpm_slip_occr_dt = Util.checkString(req
				.getParameter("rcpm_slip_occr_dt"));
		dm.rcpm_slip_clsf_cd = Util.checkString(req
				.getParameter("rcpm_slip_clsf_cd"));
		dm.rcpm_slip_seq = Util.checkString(req.getParameter("rcpm_slip_seq"));
		dm.rcpm_slip_sub_seq = Util.checkString(req
				.getParameter("rcpm_slip_sub_seq"));
		dm.incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
		dm.incmg_pers_ipadd = Util.checkString(req
				.getParameter("incmg_pers_ipadd"));
		dm.slip_rcpm_dt = Util.checkString(req.getParameter("slip_rcpm_dt"));
		dm.ask_dept_cd = Util.checkString(req.getParameter("ask_dept_cd"));

		dm.print();

		/* EJB 수정후 시작 */
		FC_ACCT_2000DAO dao = new FC_ACCT_2000DAO();
		ds = dao.fc_acct_2142_a(dm);

		if (!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/*
		 * EJB 수정전 시작 try { FC_ACCT_2000EJBHome home =
		 * (FC_ACCT_2000EJBHome)JNDIManager
		 * .getInstance().getHome("FC_ACCT_2000EJB"); FC_ACCT_2000EJB ejb =
		 * home.create();
		 * 
		 * ds = ejb.fc_acct_2142_a(dm); req.setAttribute("ds", ds); } catch
		 * (CreateException e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } catch (RemoteException
		 * e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } EJB 수정전 끝
		 */

		/*******************************************************************************************
		 * String multiUpdateData =
		 * Util.checkString(req.getParameter("multiUpdateData")); Hashtable hash
		 * = getHashMultiUpdateData(multiUpdateData);
		 * 
		 * dm.cmpy_cd = (String)hash.get("cmpy_cd"); dm.rcpm_slip_occr_dt =
		 * (String)hash.get("rcpm_slip_occr_dt"); dm.rcpm_slip_clsf_cd =
		 * (String)hash.get("rcpm_slip_clsf_cd"); dm.rcpm_slip_seq =
		 * (String)hash.get("rcpm_slip_seq"); dm.rcpm_slip_sub_seq =
		 * (String)hash.get("rcpm_slip_sub_seq"); dm.incmg_pers =
		 * (String)hash.get("incmg_pers"); dm.incmg_pers_ipadd =
		 * (String)hash.get("incmg_pers_ipadd"); dm.slip_rcpm_dt =
		 * (String)hash.get("slip_rcpm_dt"); dm.ask_dept_cd =
		 * (String)hash.get("ask_dept_cd");
		 *******************************************************************************************/

		/*******************************************************************************************
		 * dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		 * dm.rcpm_slip_occr_dt =
		 * Util.getSessionParameterValue(req,"rcpm_slip_occr_dt",true);
		 * dm.rcpm_slip_clsf_cd =
		 * Util.getSessionParameterValue(req,"rcpm_slip_clsf_cd",true);
		 * dm.rcpm_slip_seq =
		 * Util.getSessionParameterValue(req,"rcpm_slip_seq",true);
		 * dm.rcpm_slip_sub_seq =
		 * Util.getSessionParameterValue(req,"rcpm_slip_sub_seq",true);
		 * dm.incmg_pers = Util.getSessionParameterValue(req,"incmg_pers",true);
		 * dm.incmg_pers_ipadd =
		 * Util.getSessionParameterValue(req,"incmg_pers_ipadd",true);
		 * dm.slip_rcpm_dt =
		 * Util.getSessionParameterValue(req,"slip_rcpm_dt",true);
		 * dm.ask_dept_cd =
		 * Util.getSessionParameterValue(req,"ask_dept_cd",true);
		 *******************************************************************************************/
	}

	public void fc_acct_2143_i(HttpServletRequest req, HttpServletResponse res)
			throws AppException, SQLException {
		FC_ACCT_2143_IDataSet ds = null;
		FC_ACCT_2143_IDM dm = new FC_ACCT_2143_IDM();

		String multiUpdateData = Util.checkString(req
				.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
		dm.tax_slip_no = (String) hash.get("tax_slip_no");
		dm.sg_budg_cd = Util.checkString(req.getParameter("sg_budg_cd"));
		dm.ask_emp_no = Util.checkString(req.getParameter("ask_emp_no"));
		dm.ask_dept_cd = Util.checkString(req.getParameter("ask_dept_cd"));
		dm.slip_rcpm_dt = Util.checkString(req.getParameter("slip_rcpm_dt"));
		dm.slip_sub_seq = (String) hash.get("slip_sub_seq");
		dm.budg_cd = (String) hash.get("budg_cd");
		dm.rcpm_amt = (String) hash.get("rcpm_amt");
		dm.coms = (String) hash.get("coms");
		dm.incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
		dm.jdw_fg = Util.checkString(req.getParameter("jdw_fg"));
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		dm.use_dept_cd = Util.checkString(req.getParameter("use_dept_cd"));
		dm.rmks = Util.checkString(req.getParameter("rmks"));

		dm.print();

		/* EJB 수정후 시작 */
		FC_ACCT_2000DAO dao = new FC_ACCT_2000DAO();
		ds = dao.fc_acct_2143_i(dm);

		if (!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/*
		 * EJB 수정전 시작 try { FC_ACCT_2000EJBHome home =
		 * (FC_ACCT_2000EJBHome)JNDIManager
		 * .getInstance().getHome("FC_ACCT_2000EJB"); FC_ACCT_2000EJB ejb =
		 * home.create();
		 * 
		 * ds = ejb.fc_acct_2143_i(dm); req.setAttribute("ds", ds); } catch
		 * (CreateException e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } catch (RemoteException
		 * e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } EJB 수정전 끝
		 */

		/*******************************************************************************************
		 * String multiUpdateData =
		 * Util.checkString(req.getParameter("multiUpdateData")); Hashtable hash
		 * = getHashMultiUpdateData(multiUpdateData);
		 * 
		 * dm.cmpy_cd = (String)hash.get("cmpy_cd"); dm.tax_slip_no =
		 * (String)hash.get("tax_slip_no"); dm.sg_budg_cd =
		 * (String)hash.get("sg_budg_cd"); dm.ask_emp_no =
		 * (String)hash.get("ask_emp_no"); dm.ask_dept_cd =
		 * (String)hash.get("ask_dept_cd"); dm.slip_rcpm_dt =
		 * (String)hash.get("slip_rcpm_dt"); dm.slip_sub_seq =
		 * (String)hash.get("slip_sub_seq"); dm.budg_cd =
		 * (String)hash.get("budg_cd"); dm.rcpm_amt =
		 * (String)hash.get("rcpm_amt"); dm.coms = (String)hash.get("coms");
		 * dm.incmg_pers = (String)hash.get("incmg_pers"); dm.jdw_fg =
		 * (String)hash.get("jdw_fg"); dm.incmg_pers_ipadd =
		 * (String)hash.get("incmg_pers_ipadd"); dm.use_dept_cd =
		 * (String)hash.get("use_dept_cd"); dm.rmks = (String)hash.get("rmks");
		 *******************************************************************************************/

		/*******************************************************************************************
		 * dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		 * dm.tax_slip_no =
		 * Util.getSessionParameterValue(req,"tax_slip_no",true); dm.sg_budg_cd
		 * = Util.getSessionParameterValue(req,"sg_budg_cd",true); dm.ask_emp_no
		 * = Util.getSessionParameterValue(req,"ask_emp_no",true);
		 * dm.ask_dept_cd =
		 * Util.getSessionParameterValue(req,"ask_dept_cd",true);
		 * dm.slip_rcpm_dt =
		 * Util.getSessionParameterValue(req,"slip_rcpm_dt",true);
		 * dm.slip_sub_seq =
		 * Util.getSessionParameterValue(req,"slip_sub_seq",true); dm.budg_cd =
		 * Util.getSessionParameterValue(req,"budg_cd",true); dm.rcpm_amt =
		 * Util.getSessionParameterValue(req,"rcpm_amt",true); dm.coms =
		 * Util.getSessionParameterValue(req,"coms",true); dm.incmg_pers =
		 * Util.getSessionParameterValue(req,"incmg_pers",true); dm.jdw_fg =
		 * Util.getSessionParameterValue(req,"jdw_fg",true); dm.incmg_pers_ipadd
		 * = Util.getSessionParameterValue(req,"incmg_pers_ipadd",true);
		 * dm.use_dept_cd =
		 * Util.getSessionParameterValue(req,"use_dept_cd",true); dm.rmks =
		 * Util.getSessionParameterValue(req,"rmks",true);
		 *******************************************************************************************/
	}

	public void fc_acct_2144_l(HttpServletRequest req, HttpServletResponse res)
			throws AppException, SQLException {
		FC_ACCT_2144_LDataSet ds = null;
		FC_ACCT_2144_LDM dm = new FC_ACCT_2144_LDM();

		dm.cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
		dm.slip_occr_dt = Util.checkString(req.getParameter("slip_occr_dt"));
		dm.budg_cd = Util.checkString(req.getParameter("budg_cd"));
		dm.ask_dept_cd = Util.checkString(req.getParameter("ask_dept_cd"));

		dm.print();

		/* EJB 수정후 시작 */
		FC_ACCT_2000DAO dao = new FC_ACCT_2000DAO();
		ds = dao.fc_acct_2144_l(dm);


		if (!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/*
		 * EJB 수정전 시작 try { FC_ACCT_2000EJBHome home =
		 * (FC_ACCT_2000EJBHome)JNDIManager
		 * .getInstance().getHome("FC_ACCT_2000EJB"); FC_ACCT_2000EJB ejb =
		 * home.create();
		 * 
		 * ds = ejb.fc_acct_2144_l(dm); req.setAttribute("ds", ds); } catch
		 * (CreateException e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } catch (RemoteException
		 * e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } EJB 수정전 끝
		 */

		/*******************************************************************************************
		 * String multiUpdateData =
		 * Util.checkString(req.getParameter("multiUpdateData")); Hashtable hash
		 * = getHashMultiUpdateData(multiUpdateData);
		 * 
		 * dm.cmpy_cd = (String)hash.get("cmpy_cd"); dm.slip_occr_dt =
		 * (String)hash.get("slip_occr_dt"); dm.budg_cd =
		 * (String)hash.get("budg_cd"); dm.ask_dept_cd =
		 * (String)hash.get("ask_dept_cd");
		 *******************************************************************************************/

		/*******************************************************************************************
		 * dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		 * dm.slip_occr_dt =
		 * Util.getSessionParameterValue(req,"slip_occr_dt",true); dm.budg_cd =
		 * Util.getSessionParameterValue(req,"budg_cd",true); dm.ask_dept_cd =
		 * Util.getSessionParameterValue(req,"ask_dept_cd",true);
		 *******************************************************************************************/
	}

	public void fc_acct_2150_m(HttpServletRequest req, HttpServletResponse res)
			throws AppException, SQLException {
		FC_ACCT_2150_MDataSet ds = null;
		FC_ACCT_2150_MDM dm = new FC_ACCT_2150_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);

		dm.print();

		/* EJB 수정후 시작 */
		FC_ACCT_2000DAO dao = new FC_ACCT_2000DAO();
		ds = dao.fc_acct_2150_m(dm);

		if (!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/*
		 * EJB 수정전 시작 try { FC_ACCT_2000EJBHome home =
		 * (FC_ACCT_2000EJBHome)JNDIManager
		 * .getInstance().getHome("FC_ACCT_2000EJB"); FC_ACCT_2000EJB ejb =
		 * home.create();
		 * 
		 * ds = ejb.fc_acct_2160_m(dm); req.setAttribute("ds", ds); } catch
		 * (CreateException e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } catch (RemoteException
		 * e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } EJB 수정전 끝
		 */

		/*******************************************************************************************
		 * String multiUpdateData =
		 * Util.checkString(req.getParameter("multiUpdateData")); Hashtable hash
		 * = getHashMultiUpdateData(multiUpdateData);
		 * 
		 * dm.cmpy_cd = (String)hash.get("cmpy_cd");
		 *******************************************************************************************/

		/*******************************************************************************************
		 * dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		 *******************************************************************************************/
	}

	public void fc_acct_2160_m(HttpServletRequest req, HttpServletResponse res)
			throws AppException, SQLException {
		FC_ACCT_2160_MDataSet ds = null;
		FC_ACCT_2160_MDM dm = new FC_ACCT_2160_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);

		dm.print();

		/* EJB 수정후 시작 */
		FC_ACCT_2000DAO dao = new FC_ACCT_2000DAO();
		ds = dao.fc_acct_2160_m(dm);

		if (!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/*
		 * EJB 수정전 시작 try { FC_ACCT_2000EJBHome home =
		 * (FC_ACCT_2000EJBHome)JNDIManager
		 * .getInstance().getHome("FC_ACCT_2000EJB"); FC_ACCT_2000EJB ejb =
		 * home.create();
		 * 
		 * ds = ejb.fc_acct_2160_m(dm); req.setAttribute("ds", ds); } catch
		 * (CreateException e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } catch (RemoteException
		 * e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } EJB 수정전 끝
		 */

		/*******************************************************************************************
		 * String multiUpdateData =
		 * Util.checkString(req.getParameter("multiUpdateData")); Hashtable hash
		 * = getHashMultiUpdateData(multiUpdateData);
		 * 
		 * dm.cmpy_cd = (String)hash.get("cmpy_cd");
		 *******************************************************************************************/

		/*******************************************************************************************
		 * dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		 *******************************************************************************************/
	}

	public void fc_acct_2161_l(HttpServletRequest req, HttpServletResponse res)
			throws AppException, SQLException {
		FC_ACCT_2161_LDataSet ds = null;
		FC_ACCT_2161_LDM dm = new FC_ACCT_2161_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_dt = Util.checkString(req.getParameter("incmg_dt"));
		dm.impt_dept = Util.checkString(req.getParameter("impt_dept"));

		dm.print();

		/* EJB 수정후 시작 */
		
		ds = dao.fc_acct_2161_l(dm);

		if (!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/*
		 * EJB 수정전 시작 try { FC_ACCT_2000EJBHome home =
		 * (FC_ACCT_2000EJBHome)JNDIManager
		 * .getInstance().getHome("FC_ACCT_2000EJB"); FC_ACCT_2000EJB ejb =
		 * home.create();
		 * 
		 * ds = ejb.fc_acct_2161_l(dm); req.setAttribute("ds", ds); } catch
		 * (CreateException e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } catch (RemoteException
		 * e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } EJB 수정전 끝
		 */

		/*******************************************************************************************
		 * String multiUpdateData =
		 * Util.checkString(req.getParameter("multiUpdateData")); Hashtable hash
		 * = getHashMultiUpdateData(multiUpdateData);
		 * 
		 * dm.cmpy_cd = (String)hash.get("cmpy_cd"); dm.incmg_dt =
		 * (String)hash.get("incmg_dt"); dm.impt_dept =
		 * (String)hash.get("impt_dept");
		 *******************************************************************************************/

		/*******************************************************************************************
		 * dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		 * dm.incmg_dt = Util.getSessionParameterValue(req,"incmg_dt",true);
		 * dm.impt_dept = Util.getSessionParameterValue(req,"impt_dept",true);
		 *******************************************************************************************/
	}

	public void fc_acct_2162_l(HttpServletRequest req, HttpServletResponse res)
			throws AppException, SQLException {
		FC_ACCT_2162_LDataSet ds = null;
		FC_ACCT_2162_LDM dm = new FC_ACCT_2162_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_dt = Util.checkString(req.getParameter("incmg_dt"));
		dm.impt_dept = Util.checkString(req.getParameter("impt_dept"));

		dm.print();

		/* EJB 수정후 시작 */
		
		ds = dao.fc_acct_2162_l(dm);

		if (!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/*
		 * EJB 수정전 시작 try { FC_ACCT_2000EJBHome home =
		 * (FC_ACCT_2000EJBHome)JNDIManager
		 * .getInstance().getHome("FC_ACCT_2000EJB"); FC_ACCT_2000EJB ejb =
		 * home.create();
		 * 
		 * ds = ejb.fc_acct_2162_l(dm); req.setAttribute("ds", ds); } catch
		 * (CreateException e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } catch (RemoteException
		 * e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } EJB 수정전 끝
		 */

		/*******************************************************************************************
		 * String multiUpdateData =
		 * Util.checkString(req.getParameter("multiUpdateData")); Hashtable hash
		 * = getHashMultiUpdateData(multiUpdateData);
		 * 
		 * dm.cmpy_cd = (String)hash.get("cmpy_cd"); dm.incmg_dt =
		 * (String)hash.get("incmg_dt"); dm.impt_dept =
		 * (String)hash.get("impt_dept");
		 *******************************************************************************************/

		/*******************************************************************************************
		 * dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		 * dm.incmg_dt = Util.getSessionParameterValue(req,"incmg_dt",true);
		 * dm.impt_dept = Util.getSessionParameterValue(req,"impt_dept",true);
		 *******************************************************************************************/
	}

	public void fc_acct_2164_i(HttpServletRequest req, HttpServletResponse res)
			throws AppException, SQLException {
		FC_ACCT_2164_IDataSet ds = null;
		FC_ACCT_2164_IDM dm = new FC_ACCT_2164_IDM();

		String multiUpdateData = Util.checkString(req
				.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.pch_flag = (String) hash.get("m");
		dm.incmg_dt = Util.checkString(req.getParameter("incmg_dt"));
		dm.impt_dept = Util.checkString(req.getParameter("impt_dept"));
		dm.incmg_seq = (String) hash.get("incmg_seq");
		dm.dlco_clsf_cd = (String) hash.get("dlco_clsf_cd");
		dm.dlco_cd = (String) hash.get("dlco_cd");
		dm.dlco_nm = (String) hash.get("dlco_nm");
		dm.obj_amt = (String) hash.get("obj_amt");
		dm.incm_clsf_cd = (String) hash.get("incm_clsf_cd");
		dm.incm_tax = (String) hash.get("incm_tax");
		dm.res_tax = (String) hash.get("res_tax");
		dm.rmks2 = (String) hash.get("rmks2");
		dm.budg_cd = (String) hash.get("budg_cd");
		dm.rcpm_amt = (String) hash.get("rcpm_amt");
		dm.mang_clsf_cd = (String) hash.get("mang_clsf_cd");
		dm.comp_dt = (String) hash.get("comp_dt");
		dm.biz_reg_no = (String) hash.get("biz_reg_no");
		dm.bank_id = (String) hash.get("bank_id");
		dm.acct_num = (String) hash.get("acct_num");
		dm.tran_date_seq = (String) hash.get("tran_date_seq");
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		dm.chnl_clsf_cd = Util.checkString(req.getParameter("chnl_clsf_cd"));

		dm.print();

		/* EJB 수정후 시작 */
		
		ds = dao.fc_acct_2164_i(dm);

		if (!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/*
		 * EJB 수정전 시작 try { FC_ACCT_2000EJBHome home =
		 * (FC_ACCT_2000EJBHome)JNDIManager
		 * .getInstance().getHome("FC_ACCT_2000EJB"); FC_ACCT_2000EJB ejb =
		 * home.create();
		 * 
		 * ds = ejb.fc_acct_2164_i(dm); req.setAttribute("ds", ds); } catch
		 * (CreateException e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } catch (RemoteException
		 * e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } EJB 수정전 끝
		 */

		/*******************************************************************************************
		 * String multiUpdateData =
		 * Util.checkString(req.getParameter("multiUpdateData")); Hashtable hash
		 * = getHashMultiUpdateData(multiUpdateData);
		 * 
		 * dm.cmpy_cd = (String)hash.get("cmpy_cd"); dm.pch_flag =
		 * (String)hash.get("pch_flag"); dm.incmg_dt =
		 * (String)hash.get("incmg_dt"); dm.impt_dept =
		 * (String)hash.get("impt_dept"); dm.incmg_seq =
		 * (String)hash.get("incmg_seq"); dm.dlco_clsf_cd =
		 * (String)hash.get("dlco_clsf_cd"); dm.dlco_cd =
		 * (String)hash.get("dlco_cd"); dm.dlco_nm =
		 * (String)hash.get("dlco_nm"); dm.obj_amt =
		 * (String)hash.get("obj_amt"); dm.incm_clsf_cd =
		 * (String)hash.get("incm_clsf_cd"); dm.incm_tax =
		 * (String)hash.get("incm_tax"); dm.res_tax =
		 * (String)hash.get("res_tax"); dm.rmks2 = (String)hash.get("rmks2");
		 * dm.budg_cd = (String)hash.get("budg_cd"); dm.rcpm_amt =
		 * (String)hash.get("rcpm_amt"); dm.mang_clsf_cd =
		 * (String)hash.get("mang_clsf_cd"); dm.comp_dt =
		 * (String)hash.get("comp_dt"); dm.incmg_pers =
		 * (String)hash.get("incmg_pers"); dm.incmg_pers_ipadd =
		 * (String)hash.get("incmg_pers_ipadd");
		 *******************************************************************************************/

		/*******************************************************************************************
		 * dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		 * dm.pch_flag = Util.getSessionParameterValue(req,"pch_flag",true);
		 * dm.incmg_dt = Util.getSessionParameterValue(req,"incmg_dt",true);
		 * dm.impt_dept = Util.getSessionParameterValue(req,"impt_dept",true);
		 * dm.incmg_seq = Util.getSessionParameterValue(req,"incmg_seq",true);
		 * dm.dlco_clsf_cd =
		 * Util.getSessionParameterValue(req,"dlco_clsf_cd",true); dm.dlco_cd =
		 * Util.getSessionParameterValue(req,"dlco_cd",true); dm.dlco_nm =
		 * Util.getSessionParameterValue(req,"dlco_nm",true); dm.obj_amt =
		 * Util.getSessionParameterValue(req,"obj_amt",true); dm.incm_clsf_cd =
		 * Util.getSessionParameterValue(req,"incm_clsf_cd",true); dm.incm_tax =
		 * Util.getSessionParameterValue(req,"incm_tax",true); dm.res_tax =
		 * Util.getSessionParameterValue(req,"res_tax",true); dm.rmks2 =
		 * Util.getSessionParameterValue(req,"rmks2",true); dm.budg_cd =
		 * Util.getSessionParameterValue(req,"budg_cd",true); dm.rcpm_amt =
		 * Util.getSessionParameterValue(req,"rcpm_amt",true); dm.mang_clsf_cd =
		 * Util.getSessionParameterValue(req,"mang_clsf_cd",true); dm.comp_dt =
		 * Util.getSessionParameterValue(req,"comp_dt",true); dm.incmg_pers =
		 * Util.getSessionParameterValue(req,"incmg_pers",true);
		 * dm.incmg_pers_ipadd =
		 * Util.getSessionParameterValue(req,"incmg_pers_ipadd",true);
		 *******************************************************************************************/
	}

	public void fc_acct_2165_d(HttpServletRequest req, HttpServletResponse res)
			throws AppException, SQLException {
		FC_ACCT_2165_DDataSet ds = null;
		FC_ACCT_2165_DDM dm = new FC_ACCT_2165_DDM();

		String multiUpdateData = Util.checkString(req
				.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_dt = Util.checkString(req.getParameter("incmg_dt"));
		dm.impt_dept = Util.checkString(req.getParameter("impt_dept"));
		dm.incmg_seq = (String) hash.get("incmg_seq");
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.incmg_pers_ipadd = req.getRemoteAddr();

		dm.print();

		/* EJB 수정후 시작 */

		ds = dao.fc_acct_2165_d(dm);
		
		if (!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);

		/*
		 * EJB 수정전 시작 try { FC_ACCT_2000EJBHome home =
		 * (FC_ACCT_2000EJBHome)JNDIManager
		 * .getInstance().getHome("FC_ACCT_2000EJB"); FC_ACCT_2000EJB ejb =
		 * home.create();
		 * 
		 * ds = ejb.fc_acct_2165_d(dm); req.setAttribute("ds", ds); } catch
		 * (CreateException e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } catch (RemoteException
		 * e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } EJB 수정전 끝
		 */

		/*******************************************************************************************
		 * String multiUpdateData =
		 * Util.checkString(req.getParameter("multiUpdateData")); Hashtable hash
		 * = getHashMultiUpdateData(multiUpdateData);
		 * 
		 * dm.cmpy_cd = (String)hash.get("cmpy_cd"); dm.incmg_dt =
		 * (String)hash.get("incmg_dt"); dm.impt_dept =
		 * (String)hash.get("impt_dept"); dm.incmg_seq =
		 * (String)hash.get("incmg_seq"); dm.incmg_pers =
		 * (String)hash.get("incmg_pers"); dm.incmg_pers_ipadd =
		 * (String)hash.get("incmg_pers_ipadd");
		 *******************************************************************************************/

		/*******************************************************************************************
		 * dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		 * dm.incmg_dt = Util.getSessionParameterValue(req,"incmg_dt",true);
		 * dm.impt_dept = Util.getSessionParameterValue(req,"impt_dept",true);
		 * dm.incmg_seq = Util.getSessionParameterValue(req,"incmg_seq",true);
		 * dm.incmg_pers = Util.getSessionParameterValue(req,"incmg_pers",true);
		 * dm.incmg_pers_ipadd =
		 * Util.getSessionParameterValue(req,"incmg_pers_ipadd",true);
		 *******************************************************************************************/
	}

	public void fc_acct_2166_i(HttpServletRequest req, HttpServletResponse res)
			throws AppException, SQLException {
		FC_ACCT_2166_IDataSet ds = null;
		FC_ACCT_2166_IDM dm = new FC_ACCT_2166_IDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_dt = Util.checkString(req.getParameter("incmg_dt"));
		dm.impt_dept = Util.checkString(req.getParameter("impt_dept"));
		dm.chgcmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		dm.budg_yymm = Util.checkString(req.getParameter("budg_yymm"));
		dm.incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
		dm.rmks1 = Util.checkString(req.getParameter("rmks1"));

		dm.print();

		/* EJB 수정후 시작 */

		ds = dao.fc_acct_2166_i(dm);
		
		if (!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/*
		 * EJB 수정전 시작 try { FC_ACCT_2000EJBHome home =
		 * (FC_ACCT_2000EJBHome)JNDIManager
		 * .getInstance().getHome("FC_ACCT_2000EJB"); FC_ACCT_2000EJB ejb =
		 * home.create();
		 * 
		 * ds = ejb.fc_acct_2166_i(dm); req.setAttribute("ds", ds); } catch
		 * (CreateException e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } catch (RemoteException
		 * e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } EJB 수정전 끝
		 */

		/*******************************************************************************************
		 * String multiUpdateData =
		 * Util.checkString(req.getParameter("multiUpdateData")); Hashtable hash
		 * = getHashMultiUpdateData(multiUpdateData);
		 * 
		 * dm.cmpy_cd = (String)hash.get("cmpy_cd"); dm.incmg_dt =
		 * (String)hash.get("incmg_dt"); dm.impt_dept =
		 * (String)hash.get("impt_dept"); dm.chgcmg_pers =
		 * (String)hash.get("chgcmg_pers"); dm.incmg_pers_ipadd =
		 * (String)hash.get("incmg_pers_ipadd"); dm.budg_yymm =
		 * (String)hash.get("budg_yymm"); dm.incmg_pers =
		 * (String)hash.get("incmg_pers"); dm.rmks1 = (String)hash.get("rmks1");
		 *******************************************************************************************/

		/*******************************************************************************************
		 * dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		 * dm.incmg_dt = Util.getSessionParameterValue(req,"incmg_dt",true);
		 * dm.impt_dept = Util.getSessionParameterValue(req,"impt_dept",true);
		 * dm.chgcmg_pers =
		 * Util.getSessionParameterValue(req,"chgcmg_pers",true);
		 * dm.incmg_pers_ipadd =
		 * Util.getSessionParameterValue(req,"incmg_pers_ipadd",true);
		 * dm.budg_yymm = Util.getSessionParameterValue(req,"budg_yymm",true);
		 * dm.incmg_pers = Util.getSessionParameterValue(req,"incmg_pers",true);
		 * dm.rmks1 = Util.getSessionParameterValue(req,"rmks1",true);
		 *******************************************************************************************/
	}

	public void fc_acct_2167_d(HttpServletRequest req, HttpServletResponse res)
			throws AppException, SQLException {
		FC_ACCT_2167_DDataSet ds = null;
		FC_ACCT_2167_DDM dm = new FC_ACCT_2167_DDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.slip_occr_dt = Util.checkString(req.getParameter("slip_occr_dt"));
		dm.slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
		dm.slip_seq = Util.checkString(req.getParameter("slip_seq"));
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.incmg_pers_ipadd = req.getRemoteAddr();

		dm.print();

		/* EJB 수정후 시작 */

		ds = dao.fc_acct_2167_d(dm);
		
		if (!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/*
		 * EJB 수정전 시작 try { FC_ACCT_2000EJBHome home =
		 * (FC_ACCT_2000EJBHome)JNDIManager
		 * .getInstance().getHome("FC_ACCT_2000EJB"); FC_ACCT_2000EJB ejb =
		 * home.create();
		 * 
		 * ds = ejb.fc_acct_2167_d(dm); req.setAttribute("ds", ds); } catch
		 * (CreateException e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } catch (RemoteException
		 * e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } EJB 수정전 끝
		 */

		/*******************************************************************************************
		 * String multiUpdateData =
		 * Util.checkString(req.getParameter("multiUpdateData")); Hashtable hash
		 * = getHashMultiUpdateData(multiUpdateData);
		 * 
		 * dm.cmpy_cd = (String)hash.get("cmpy_cd"); dm.slip_occr_dt =
		 * (String)hash.get("slip_occr_dt"); dm.slip_clsf_cd =
		 * (String)hash.get("slip_clsf_cd"); dm.slip_seq =
		 * (String)hash.get("slip_seq"); dm.incmg_pers =
		 * (String)hash.get("incmg_pers"); dm.incmg_pers_ipadd =
		 * (String)hash.get("incmg_pers_ipadd");
		 *******************************************************************************************/

		/*******************************************************************************************
		 * dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		 * dm.slip_occr_dt =
		 * Util.getSessionParameterValue(req,"slip_occr_dt",true);
		 * dm.slip_clsf_cd =
		 * Util.getSessionParameterValue(req,"slip_clsf_cd",true); dm.slip_seq =
		 * Util.getSessionParameterValue(req,"slip_seq",true); dm.incmg_pers =
		 * Util.getSessionParameterValue(req,"incmg_pers",true);
		 * dm.incmg_pers_ipadd =
		 * Util.getSessionParameterValue(req,"incmg_pers_ipadd",true);
		 *******************************************************************************************/
	}

	public void fc_acct_2168_l(HttpServletRequest req, HttpServletResponse res)
			throws AppException, SQLException {
		FC_ACCT_2168_LDataSet ds = null;
		FC_ACCT_2168_LDM dm = new FC_ACCT_2168_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.slip_occr_dt = Util.checkString(req.getParameter("slip_occr_dt"));
		dm.slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
		dm.slip_seq = Util.checkString(req.getParameter("slip_seq"));

		dm.print();

		/* EJB 수정후 시작 */
		
		ds = dao.fc_acct_2168_l(dm);

		if (!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/*
		 * EJB 수정전 시작 try { FC_ACCT_2000EJBHome home =
		 * (FC_ACCT_2000EJBHome)JNDIManager
		 * .getInstance().getHome("FC_ACCT_2000EJB"); FC_ACCT_2000EJB ejb =
		 * home.create();
		 * 
		 * ds = ejb.fc_acct_2168_l(dm); req.setAttribute("ds", ds); } catch
		 * (CreateException e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } catch (RemoteException
		 * e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } EJB 수정전 끝
		 */

		/*******************************************************************************************
		 * String multiUpdateData =
		 * Util.checkString(req.getParameter("multiUpdateData")); Hashtable hash
		 * = getHashMultiUpdateData(multiUpdateData);
		 * 
		 * dm.cmpy_cd = (String)hash.get("cmpy_cd"); dm.slip_occr_dt =
		 * (String)hash.get("slip_occr_dt"); dm.slip_clsf_cd =
		 * (String)hash.get("slip_clsf_cd"); dm.slip_seq =
		 * (String)hash.get("slip_seq");
		 *******************************************************************************************/

		/*******************************************************************************************
		 * dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		 * dm.slip_occr_dt =
		 * Util.getSessionParameterValue(req,"slip_occr_dt",true);
		 * dm.slip_clsf_cd =
		 * Util.getSessionParameterValue(req,"slip_clsf_cd",true); dm.slip_seq =
		 * Util.getSessionParameterValue(req,"slip_seq",true);
		 *******************************************************************************************/
	}

	public void fc_acct_2175_a(HttpServletRequest req, HttpServletResponse res)
			throws AppException, SQLException {
		FC_ACCT_2175_ADataSet ds = null;
		FC_ACCT_2175_ADM dm = new FC_ACCT_2175_ADM();

		String multiUpdateData = Util.checkString(req
				.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);

		dm.slip_occr_dt = (String) hash.get("tax_stmt");
		dm.slip_clsf_cd = (String) hash.get("tax_stmt");
		dm.slip_seq = (String) hash.get("tax_stmt");

		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.incmg_pers_ip = req.getRemoteAddr();

		dm.tax_demand = Util.checkString(req.getParameter("tax_demand"));
		dm.dtt_yn = Util.checkString(req.getParameter("dtt_yn"));

		dm.print();

		try {
			/* EJB 수정후 시작 */

			ds = dao.fc_acct_2175_a(dm);
			
			if (!ds.getErrcode().equals("")) {
				throw new AppException(ds.getErrcode(), ds.getErrmsg());
			}

			req.setAttribute("ds", ds);

		} catch (SysException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}

		/*******************************************************************************************
		 * String multiUpdateData =
		 * Util.checkString(req.getParameter("multiUpdateData")); Hashtable hash
		 * = getHashMultiUpdateData(multiUpdateData);
		 * 
		 * dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		 * dm.slip_occr_dt = (String)hash.get("slip_occr_dt"); dm.slip_clsf_cd =
		 * (String)hash.get("slip_clsf_cd"); dm.slip_seq =
		 * (String)hash.get("slip_seq");
		 * 
		 * dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		 * dm.incmg_pers_ipadd = req.getRemoteAddr();
		 *******************************************************************************************/

		/*******************************************************************************************
		 * dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		 * dm.slip_occr_dt =
		 * Util.getSessionParameterValue(req,"slip_occr_dt",true);
		 * dm.slip_clsf_cd =
		 * Util.getSessionParameterValue(req,"slip_clsf_cd",true); dm.slip_seq =
		 * Util.getSessionParameterValue(req,"slip_seq",true); dm.incmg_pers_ip
		 * = Util.getSessionParameterValue(req,"incmg_pers_ip",true);
		 * dm.incmg_pers = Util.getSessionParameterValue(req,"incmg_pers",true);
		 *******************************************************************************************/
	}

	public void fc_acct_2180_m(HttpServletRequest req, HttpServletResponse res)
			throws AppException, SQLException {
		FC_ACCT_2180_MDataSet ds = null;
		FC_ACCT_2180_MDM dm = new FC_ACCT_2180_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);

		dm.print();

		/* EJB 수정후 시작 */
		ds = dao.fc_acct_2180_m(dm);

		if (!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/*
		 * EJB 수정전 시작 try { FC_ACCT_2000EJBHome home =
		 * (FC_ACCT_2000EJBHome)JNDIManager
		 * .getInstance().getHome("FC_ACCT_2000EJB"); FC_ACCT_2000EJB ejb =
		 * home.create();
		 * 
		 * ds = ejb.fc_acct_2180_m(dm); req.setAttribute("ds", ds); } catch
		 * (CreateException e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } catch (RemoteException
		 * e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } EJB 수정전 끝
		 */

		/*******************************************************************************************
		 * String multiUpdateData =
		 * Util.checkString(req.getParameter("multiUpdateData")); Hashtable hash
		 * = getHashMultiUpdateData(multiUpdateData);
		 * 
		 * dm.cmpy_cd = (String)hash.get("cmpy_cd");
		 *******************************************************************************************/

		/*******************************************************************************************
		 * dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		 *******************************************************************************************/
	}

	public void fc_acct_2182_s(HttpServletRequest req, HttpServletResponse res)
			throws AppException, SQLException {
		FC_ACCT_2182_SDataSet ds = null;
		FC_ACCT_2182_SDM dm = new FC_ACCT_2182_SDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.uid = Util.getSessionParameterValue(req, "uid", true);
		dm.prof_type_cd = Util.checkString(req.getParameter("prof_type_cd"));
		dm.slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
		dm.slip_occr_dt = Util.checkString(req.getParameter("slip_occr_dt"));
		dm.slip_seq_fr = Util.checkString(req.getParameter("slip_seq_fr"));
		dm.slip_seq_to = Util.checkString(req.getParameter("slip_seq_to"));

		dm.print();

		/* EJB 수정후 시작 */
		ds = dao.fc_acct_2182_s(dm);

		if (!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/*
		 * EJB 수정전 시작 try { FC_ACCT_2000EJBHome home =
		 * (FC_ACCT_2000EJBHome)JNDIManager
		 * .getInstance().getHome("FC_ACCT_2000EJB"); FC_ACCT_2000EJB ejb =
		 * home.create();
		 * 
		 * ds = ejb.fc_acct_2182_s(dm); req.setAttribute("ds", ds); } catch
		 * (CreateException e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } catch (RemoteException
		 * e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } EJB 수정전 끝
		 */

		/*******************************************************************************************
		 * String multiUpdateData =
		 * Util.checkString(req.getParameter("multiUpdateData")); Hashtable hash
		 * = getHashMultiUpdateData(multiUpdateData);
		 * 
		 * dm.cmpy_cd = (String)hash.get("cmpy_cd"); dm.uid =
		 * (String)hash.get("uid"); dm.prof_type_cd =
		 * (String)hash.get("prof_type_cd"); dm.slip_clsf_cd =
		 * (String)hash.get("slip_clsf_cd"); dm.slip_occr_dt =
		 * (String)hash.get("slip_occr_dt"); dm.slip_seq_fr =
		 * (String)hash.get("slip_seq_fr"); dm.slip_seq_to =
		 * (String)hash.get("slip_seq_to");
		 *******************************************************************************************/

		/*******************************************************************************************
		 * dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		 * dm.uid = Util.getSessionParameterValue(req,"uid",true);
		 * dm.prof_type_cd =
		 * Util.getSessionParameterValue(req,"prof_type_cd",true);
		 * dm.slip_clsf_cd =
		 * Util.getSessionParameterValue(req,"slip_clsf_cd",true);
		 * dm.slip_occr_dt =
		 * Util.getSessionParameterValue(req,"slip_occr_dt",true);
		 * dm.slip_seq_fr =
		 * Util.getSessionParameterValue(req,"slip_seq_fr",true); dm.slip_seq_to
		 * = Util.getSessionParameterValue(req,"slip_seq_to",true);
		 *******************************************************************************************/
	}

	public void fc_acct_2190_m(HttpServletRequest req, HttpServletResponse res)
			throws AppException, SQLException {
		FC_ACCT_2190_MDataSet ds = null;
		FC_ACCT_2190_MDM dm = new FC_ACCT_2190_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);

		dm.print();

		/* EJB 수정후 시작 */
		ds = dao.fc_acct_2190_m(dm);

		if (!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/*
		 * EJB 수정전 시작 try { FC_ACCT_2000EJBHome home =
		 * (FC_ACCT_2000EJBHome)JNDIManager
		 * .getInstance().getHome("FC_ACCT_2000EJB"); FC_ACCT_2000EJB ejb =
		 * home.create();
		 * 
		 * ds = ejb.fc_acct_2190_m(dm); req.setAttribute("ds", ds); } catch
		 * (CreateException e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } catch (RemoteException
		 * e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } EJB 수정전 끝
		 */

		/*******************************************************************************************
		 * String multiUpdateData =
		 * Util.checkString(req.getParameter("multiUpdateData")); Hashtable hash
		 * = getHashMultiUpdateData(multiUpdateData);
		 * 
		 * dm.cmpy_cd = (String)hash.get("cmpy_cd");
		 *******************************************************************************************/

		/*******************************************************************************************
		 * dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		 *******************************************************************************************/
	}

	public void fc_acct_2191_l(HttpServletRequest req, HttpServletResponse res)
			throws AppException, SQLException {
		FC_ACCT_2191_LDataSet ds = null;
		FC_ACCT_2191_LDM dm = new FC_ACCT_2191_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.slip_occr_dt = Util.checkString(req.getParameter("slip_occr_dt"));
		dm.slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
		dm.slip_seq = Util.checkString(req.getParameter("slip_seq"));
		dm.slip_sub_seq = Util.checkString(req.getParameter("slip_sub_seq"));

		dm.print();

		/* EJB 수정후 시작 */
		ds = dao.fc_acct_2191_l(dm);

		if (!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/*
		 * EJB 수정전 시작 try { FC_ACCT_2000EJBHome home =
		 * (FC_ACCT_2000EJBHome)JNDIManager
		 * .getInstance().getHome("FC_ACCT_2000EJB"); FC_ACCT_2000EJB ejb =
		 * home.create();
		 * 
		 * ds = ejb.fc_acct_2191_l(dm); req.setAttribute("ds", ds); } catch
		 * (CreateException e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } catch (RemoteException
		 * e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } EJB 수정전 끝
		 */

		/*******************************************************************************************
		 * String multiUpdateData =
		 * Util.checkString(req.getParameter("multiUpdateData")); Hashtable hash
		 * = getHashMultiUpdateData(multiUpdateData);
		 * 
		 * dm.cmpy_cd = (String)hash.get("cmpy_cd"); dm.slip_occr_dt =
		 * (String)hash.get("slip_occr_dt"); dm.slip_clsf_cd =
		 * (String)hash.get("slip_clsf_cd"); dm.slip_seq =
		 * (String)hash.get("slip_seq"); dm.slip_sub_seq =
		 * (String)hash.get("slip_sub_seq");
		 *******************************************************************************************/

		/*******************************************************************************************
		 * dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		 * dm.slip_occr_dt =
		 * Util.getSessionParameterValue(req,"slip_occr_dt",true);
		 * dm.slip_clsf_cd =
		 * Util.getSessionParameterValue(req,"slip_clsf_cd",true); dm.slip_seq =
		 * Util.getSessionParameterValue(req,"slip_seq",true); dm.slip_sub_seq =
		 * Util.getSessionParameterValue(req,"slip_sub_seq",true);
		 *******************************************************************************************/
	}

	public void fc_acct_2193_s(HttpServletRequest req, HttpServletResponse res)
			throws AppException, SQLException {
		FC_ACCT_2193_SDataSet ds = null;
		FC_ACCT_2193_SDM dm = new FC_ACCT_2193_SDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.uid = Util.getSessionParameterValue(req, "uid", true);
		dm.slip_occr_dt = Util.checkString(req.getParameter("slip_occr_dt"));
		dm.slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
		dm.slip_seq = Util.checkString(req.getParameter("slip_seq"));
		dm.slip_sub_seq = Util.checkString(req.getParameter("slip_sub_seq"));
		dm.slip_occr_dt2 = Util.checkString(req.getParameter("slip_occr_dt2"));
		dm.budg_cd = Util.checkString(req.getParameter("budg_cd"));
		dm.budg_cd1 = Util.checkString(req.getParameter("budg_cd1"));
		dm.budg_cd2 = Util.checkString(req.getParameter("budg_cd2"));
		dm.budg_cd3 = Util.checkString(req.getParameter("budg_cd3"));
		dm.budg_cd4 = Util.checkString(req.getParameter("budg_cd4"));
		dm.budg_cd5 = Util.checkString(req.getParameter("budg_cd5"));

		dm.print();

		/* EJB 수정후 시작 */
		ds = dao.fc_acct_2193_s(dm);

		if (!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/*
		 * EJB 수정전 시작 try { FC_ACCT_2000EJBHome home =
		 * (FC_ACCT_2000EJBHome)JNDIManager
		 * .getInstance().getHome("FC_ACCT_2000EJB"); FC_ACCT_2000EJB ejb =
		 * home.create();
		 * 
		 * ds = ejb.fc_acct_2193_s(dm); req.setAttribute("ds", ds); } catch
		 * (CreateException e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } catch (RemoteException
		 * e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } EJB 수정전 끝
		 */

		/*******************************************************************************************
		 * String multiUpdateData =
		 * Util.checkString(req.getParameter("multiUpdateData")); Hashtable hash
		 * = getHashMultiUpdateData(multiUpdateData);
		 * 
		 * dm.cmpy_cd = (String)hash.get("cmpy_cd"); dm.uid =
		 * (String)hash.get("uid"); dm.slip_occr_dt =
		 * (String)hash.get("slip_occr_dt"); dm.slip_clsf_cd =
		 * (String)hash.get("slip_clsf_cd"); dm.slip_seq =
		 * (String)hash.get("slip_seq"); dm.slip_sub_seq =
		 * (String)hash.get("slip_sub_seq"); dm.slip_occr_dt2 =
		 * (String)hash.get("slip_occr_dt2"); dm.budg_cd =
		 * (String)hash.get("budg_cd"); dm.budg_cd1 =
		 * (String)hash.get("budg_cd1"); dm.budg_cd2 =
		 * (String)hash.get("budg_cd2"); dm.budg_cd3 =
		 * (String)hash.get("budg_cd3"); dm.budg_cd4 =
		 * (String)hash.get("budg_cd4"); dm.budg_cd5 =
		 * (String)hash.get("budg_cd5");
		 *******************************************************************************************/

		/*******************************************************************************************
		 * dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		 * dm.uid = Util.getSessionParameterValue(req,"uid",true);
		 * dm.slip_occr_dt =
		 * Util.getSessionParameterValue(req,"slip_occr_dt",true);
		 * dm.slip_clsf_cd =
		 * Util.getSessionParameterValue(req,"slip_clsf_cd",true); dm.slip_seq =
		 * Util.getSessionParameterValue(req,"slip_seq",true); dm.slip_sub_seq =
		 * Util.getSessionParameterValue(req,"slip_sub_seq",true);
		 * dm.slip_occr_dt2 =
		 * Util.getSessionParameterValue(req,"slip_occr_dt2",true); dm.budg_cd =
		 * Util.getSessionParameterValue(req,"budg_cd",true); dm.budg_cd1 =
		 * Util.getSessionParameterValue(req,"budg_cd1",true); dm.budg_cd2 =
		 * Util.getSessionParameterValue(req,"budg_cd2",true); dm.budg_cd3 =
		 * Util.getSessionParameterValue(req,"budg_cd3",true); dm.budg_cd4 =
		 * Util.getSessionParameterValue(req,"budg_cd4",true); dm.budg_cd5 =
		 * Util.getSessionParameterValue(req,"budg_cd5",true);
		 *******************************************************************************************/
	}

	public void fc_acct_2194_s(HttpServletRequest req, HttpServletResponse res)
			throws AppException, SQLException {
		FC_ACCT_2194_SDataSet ds = null;
		FC_ACCT_2194_SDM dm = new FC_ACCT_2194_SDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.slip_occr_dt = Util.checkString(req.getParameter("slip_occr_dt"));
		dm.slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
		dm.slip_seq = Util.checkString(req.getParameter("slip_seq"));
		dm.slip_sub_seq = Util.checkString(req.getParameter("slip_sub_seq"));
		dm.slip_occr_dt2 = Util.checkString(req.getParameter("slip_occr_dt2"));
		dm.budg_cd = Util.checkString(req.getParameter("budg_cd"));
		dm.budg_cd1 = Util.checkString(req.getParameter("budg_cd1"));
		dm.budg_cd2 = Util.checkString(req.getParameter("budg_cd2"));
		dm.budg_cd3 = Util.checkString(req.getParameter("budg_cd3"));
		dm.budg_cd4 = Util.checkString(req.getParameter("budg_cd4"));
		dm.budg_cd5 = Util.checkString(req.getParameter("budg_cd5"));

		dm.print();

		/* EJB 수정후 시작 */
		ds = dao.fc_acct_2194_s(dm);

		if (!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/*
		 * EJB 수정전 시작 try { FC_ACCT_2000EJBHome home =
		 * (FC_ACCT_2000EJBHome)JNDIManager
		 * .getInstance().getHome("FC_ACCT_2000EJB"); FC_ACCT_2000EJB ejb =
		 * home.create();
		 * 
		 * ds = ejb.fc_acct_2194_s(dm); req.setAttribute("ds", ds); } catch
		 * (CreateException e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } catch (RemoteException
		 * e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } EJB 수정전 끝
		 */

		/*******************************************************************************************
		 * String multiUpdateData =
		 * Util.checkString(req.getParameter("multiUpdateData")); Hashtable hash
		 * = getHashMultiUpdateData(multiUpdateData);
		 * 
		 * dm.cmpy_cd = (String)hash.get("cmpy_cd"); dm.slip_occr_dt =
		 * (String)hash.get("slip_occr_dt"); dm.slip_clsf_cd =
		 * (String)hash.get("slip_clsf_cd"); dm.slip_seq =
		 * (String)hash.get("slip_seq"); dm.slip_sub_seq =
		 * (String)hash.get("slip_sub_seq"); dm.slip_occr_dt2 =
		 * (String)hash.get("slip_occr_dt2"); dm.budg_cd =
		 * (String)hash.get("budg_cd"); dm.budg_cd1 =
		 * (String)hash.get("budg_cd1"); dm.budg_cd2 =
		 * (String)hash.get("budg_cd2"); dm.budg_cd3 =
		 * (String)hash.get("budg_cd3"); dm.budg_cd4 =
		 * (String)hash.get("budg_cd4"); dm.budg_cd5 =
		 * (String)hash.get("budg_cd5");
		 *******************************************************************************************/

		/*******************************************************************************************
		 * dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		 * dm.slip_occr_dt =
		 * Util.getSessionParameterValue(req,"slip_occr_dt",true);
		 * dm.slip_clsf_cd =
		 * Util.getSessionParameterValue(req,"slip_clsf_cd",true); dm.slip_seq =
		 * Util.getSessionParameterValue(req,"slip_seq",true); dm.slip_sub_seq =
		 * Util.getSessionParameterValue(req,"slip_sub_seq",true);
		 * dm.slip_occr_dt2 =
		 * Util.getSessionParameterValue(req,"slip_occr_dt2",true); dm.budg_cd =
		 * Util.getSessionParameterValue(req,"budg_cd",true); dm.budg_cd1 =
		 * Util.getSessionParameterValue(req,"budg_cd1",true); dm.budg_cd2 =
		 * Util.getSessionParameterValue(req,"budg_cd2",true); dm.budg_cd3 =
		 * Util.getSessionParameterValue(req,"budg_cd3",true); dm.budg_cd4 =
		 * Util.getSessionParameterValue(req,"budg_cd4",true); dm.budg_cd5 =
		 * Util.getSessionParameterValue(req,"budg_cd5",true);
		 *******************************************************************************************/
	}

	public void fc_acct_2200_m(HttpServletRequest req, HttpServletResponse res)
			throws AppException, SQLException {
		FC_ACCT_2200_MDataSet ds = null;
		FC_ACCT_2200_MDM dm = new FC_ACCT_2200_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);

		dm.print();

		/* EJB 수정후 시작 */
		ds = dao.fc_acct_2200_m(dm);

		if (!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/*
		 * EJB 수정전 시작 try { FC_ACCT_2000EJBHome home =
		 * (FC_ACCT_2000EJBHome)JNDIManager
		 * .getInstance().getHome("FC_ACCT_2000EJB"); FC_ACCT_2000EJB ejb =
		 * home.create();
		 * 
		 * ds = ejb.fc_acct_2200_m(dm); req.setAttribute("ds", ds); } catch
		 * (CreateException e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } catch (RemoteException
		 * e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } EJB 수정전 끝
		 */

		/*******************************************************************************************
		 * String multiUpdateData =
		 * Util.checkString(req.getParameter("multiUpdateData")); Hashtable hash
		 * = getHashMultiUpdateData(multiUpdateData);
		 * 
		 * dm.cmpy_cd = (String)hash.get("cmpy_cd");
		 *******************************************************************************************/

		/*******************************************************************************************
		 * dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		 *******************************************************************************************/
	}

	public void fc_acct_2201_p(HttpServletRequest req, HttpServletResponse res)
			throws AppException, SQLException {
		FC_ACCT_2201_PDataSet ds = null;
		FC_ACCT_2201_PDM dm = new FC_ACCT_2201_PDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.slip_occr_dt = Util.checkString(req.getParameter("slip_occr_dt"));
		dm.slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
		dm.slip_seq = Util.checkString(req.getParameter("slip_seq"));
		dm.slip_sub_seq = Util.checkString(req.getParameter("slip_sub_seq"));

		dm.print();

		/* EJB 수정후 시작 */
		ds = dao.fc_acct_2201_p(dm);

		if (!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/*
		 * EJB 수정전 시작 try { FC_ACCT_2000EJBHome home =
		 * (FC_ACCT_2000EJBHome)JNDIManager
		 * .getInstance().getHome("FC_ACCT_2000EJB"); FC_ACCT_2000EJB ejb =
		 * home.create();
		 * 
		 * ds = ejb.fc_acct_2201_p(dm); req.setAttribute("ds", ds); } catch
		 * (CreateException e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } catch (RemoteException
		 * e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } EJB 수정전 끝
		 */

		/*******************************************************************************************
		 * String multiUpdateData =
		 * Util.checkString(req.getParameter("multiUpdateData")); Hashtable hash
		 * = getHashMultiUpdateData(multiUpdateData);
		 * 
		 * dm.cmpy_cd = (String)hash.get("cmpy_cd"); dm.slip_occr_dt =
		 * (String)hash.get("slip_occr_dt"); dm.slip_clsf_cd =
		 * (String)hash.get("slip_clsf_cd"); dm.slip_seq =
		 * (String)hash.get("slip_seq"); dm.slip_sub_seq =
		 * (String)hash.get("slip_sub_seq");
		 *******************************************************************************************/

		/*******************************************************************************************
		 * dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		 * dm.slip_occr_dt =
		 * Util.getSessionParameterValue(req,"slip_occr_dt",true);
		 * dm.slip_clsf_cd =
		 * Util.getSessionParameterValue(req,"slip_clsf_cd",true); dm.slip_seq =
		 * Util.getSessionParameterValue(req,"slip_seq",true); dm.slip_sub_seq =
		 * Util.getSessionParameterValue(req,"slip_sub_seq",true);
		 *******************************************************************************************/
	}

	public void fc_acct_2203_s(HttpServletRequest req, HttpServletResponse res)
			throws AppException, SQLException {
		FC_ACCT_2203_SDataSet ds = null;
		FC_ACCT_2203_SDM dm = new FC_ACCT_2203_SDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.uid = Util.getSessionParameterValue(req, "uid", true);
		dm.slip_occr_dt = Util.checkString(req.getParameter("slip_occr_dt"));
		dm.slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
		dm.slip_seq = Util.checkString(req.getParameter("slip_seq"));
		dm.slip_sub_seq = Util.checkString(req.getParameter("slip_sub_seq"));
		dm.budg_cd = Util.checkString(req.getParameter("budg_cd"));

		dm.print();

		/* EJB 수정후 시작 */
		ds = dao.fc_acct_2203_s(dm);

		if (!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/*
		 * EJB 수정전 시작 try { FC_ACCT_2000EJBHome home =
		 * (FC_ACCT_2000EJBHome)JNDIManager
		 * .getInstance().getHome("FC_ACCT_2000EJB"); FC_ACCT_2000EJB ejb =
		 * home.create();
		 * 
		 * ds = ejb.fc_acct_2203_s(dm); req.setAttribute("ds", ds); } catch
		 * (CreateException e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } catch (RemoteException
		 * e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } EJB 수정전 끝
		 */

		/*******************************************************************************************
		 * String multiUpdateData =
		 * Util.checkString(req.getParameter("multiUpdateData")); Hashtable hash
		 * = getHashMultiUpdateData(multiUpdateData);
		 * 
		 * dm.cmpy_cd = (String)hash.get("cmpy_cd"); dm.uid =
		 * (String)hash.get("uid"); dm.slip_occr_dt =
		 * (String)hash.get("slip_occr_dt"); dm.slip_clsf_cd =
		 * (String)hash.get("slip_clsf_cd"); dm.slip_seq =
		 * (String)hash.get("slip_seq"); dm.slip_sub_seq =
		 * (String)hash.get("slip_sub_seq"); dm.budg_cd =
		 * (String)hash.get("budg_cd");
		 *******************************************************************************************/

		/*******************************************************************************************
		 * dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		 * dm.uid = Util.getSessionParameterValue(req,"uid",true);
		 * dm.slip_occr_dt =
		 * Util.getSessionParameterValue(req,"slip_occr_dt",true);
		 * dm.slip_clsf_cd =
		 * Util.getSessionParameterValue(req,"slip_clsf_cd",true); dm.slip_seq =
		 * Util.getSessionParameterValue(req,"slip_seq",true); dm.slip_sub_seq =
		 * Util.getSessionParameterValue(req,"slip_sub_seq",true); dm.budg_cd =
		 * Util.getSessionParameterValue(req,"budg_cd",true);
		 *******************************************************************************************/
	}

	public void fc_acct_2210_m(HttpServletRequest req, HttpServletResponse res)
			throws AppException, SQLException {
		FC_ACCT_2210_MDataSet ds = null;
		FC_ACCT_2210_MDM dm = new FC_ACCT_2210_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);

		dm.print();

		/* EJB 수정후 시작 */
		ds = dao.fc_acct_2210_m(dm);

		if (!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/*
		 * EJB 수정전 시작 try { FC_ACCT_2000EJBHome home =
		 * (FC_ACCT_2000EJBHome)JNDIManager
		 * .getInstance().getHome("FC_ACCT_2000EJB"); FC_ACCT_2000EJB ejb =
		 * home.create();
		 * 
		 * ds = ejb.fc_acct_2211_l(dm); req.setAttribute("ds", ds); } catch
		 * (CreateException e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } catch (RemoteException
		 * e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } EJB 수정전 끝
		 */

		/*******************************************************************************************
		 * String multiUpdateData =
		 * Util.checkString(req.getParameter("multiUpdateData")); Hashtable hash
		 * = getHashMultiUpdateData(multiUpdateData);
		 * 
		 * dm.cmpy_cd = (String)hash.get("cmpy_cd"); dm.uid =
		 * (String)hash.get("uid"); dm.pch_acntcymdfr =
		 * (String)hash.get("pch_acntcymdfr"); dm.pch_acntcymdto =
		 * (String)hash.get("pch_acntcymdto"); dm.budg_cd =
		 * (String)hash.get("budg_cd");
		 *******************************************************************************************/

		/*******************************************************************************************
		 * dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		 * dm.uid = Util.getSessionParameterValue(req,"uid",true);
		 * dm.pch_acntcymdfr =
		 * Util.getSessionParameterValue(req,"pch_acntcymdfr",true);
		 * dm.pch_acntcymdto =
		 * Util.getSessionParameterValue(req,"pch_acntcymdto",true); dm.budg_cd
		 * = Util.getSessionParameterValue(req,"budg_cd",true);
		 *******************************************************************************************/
	}

	public void fc_acct_2211_l(HttpServletRequest req, HttpServletResponse res)
			throws AppException, SQLException {
		FC_ACCT_2211_LDataSet ds = null;
		FC_ACCT_2211_LDM dm = new FC_ACCT_2211_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.uid = Util.getSessionParameterValue(req, "uid", true);
		dm.pch_acntcymdfr = Util
				.checkString(req.getParameter("pch_acntcymdfr"));
		dm.pch_acntcymdto = Util
				.checkString(req.getParameter("pch_acntcymdto"));
		dm.budg_cd = Util.checkString(req.getParameter("budg_cd"));
		dm.kind = Util.checkString(req.getParameter("kind"));

		dm.print();

		/* EJB 수정후 시작 */
		ds = dao.fc_acct_2211_l(dm);

		if (!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/*
		 * EJB 수정전 시작 try { FC_ACCT_2000EJBHome home =
		 * (FC_ACCT_2000EJBHome)JNDIManager
		 * .getInstance().getHome("FC_ACCT_2000EJB"); FC_ACCT_2000EJB ejb =
		 * home.create();
		 * 
		 * ds = ejb.fc_acct_2211_l(dm); req.setAttribute("ds", ds); } catch
		 * (CreateException e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } catch (RemoteException
		 * e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } EJB 수정전 끝
		 */

		/*******************************************************************************************
		 * String multiUpdateData =
		 * Util.checkString(req.getParameter("multiUpdateData")); Hashtable hash
		 * = getHashMultiUpdateData(multiUpdateData);
		 * 
		 * dm.cmpy_cd = (String)hash.get("cmpy_cd"); dm.uid =
		 * (String)hash.get("uid"); dm.pch_acntcymdfr =
		 * (String)hash.get("pch_acntcymdfr"); dm.pch_acntcymdto =
		 * (String)hash.get("pch_acntcymdto"); dm.budg_cd =
		 * (String)hash.get("budg_cd");
		 *******************************************************************************************/

		/*******************************************************************************************
		 * dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		 * dm.uid = Util.getSessionParameterValue(req,"uid",true);
		 * dm.pch_acntcymdfr =
		 * Util.getSessionParameterValue(req,"pch_acntcymdfr",true);
		 * dm.pch_acntcymdto =
		 * Util.getSessionParameterValue(req,"pch_acntcymdto",true); dm.budg_cd
		 * = Util.getSessionParameterValue(req,"budg_cd",true);
		 *******************************************************************************************/
	}

	public void fc_acct_2212_i(HttpServletRequest req, HttpServletResponse res)
			throws AppException, SQLException {
		FC_ACCT_2212_IDataSet ds = null;
		FC_ACCT_2212_IDM dm = new FC_ACCT_2212_IDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.slip_occr_dt = Util.checkString(req.getParameter("slip_occr_dt"));
		dm.slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
		dm.slip_seq = Util.checkString(req.getParameter("slip_seq"));
		dm.unrcp_excl_yn = Util.checkString(req.getParameter("unrcp_excl_yn"));
		dm.chg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.incmg_pers_ipadd = req.getRemoteAddr();

		dm.print();

		/* EJB 수정후 시작 */
		ds = dao.fc_acct_2212_i(dm);

		if (!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/*
		 * EJB 수정전 시작 try { FC_ACCT_2000EJBHome home =
		 * (FC_ACCT_2000EJBHome)JNDIManager
		 * .getInstance().getHome("FC_ACCT_2000EJB"); FC_ACCT_2000EJB ejb =
		 * home.create();
		 * 
		 * ds = ejb.fc_acct_2212_i(dm); req.setAttribute("ds", ds); } catch
		 * (CreateException e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } catch (RemoteException
		 * e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } EJB 수정전 끝
		 */

		/*******************************************************************************************
		 * String multiUpdateData =
		 * Util.checkString(req.getParameter("multiUpdateData")); Hashtable hash
		 * = getHashMultiUpdateData(multiUpdateData);
		 * 
		 * dm.cmpy_cd = (String)hash.get("cmpy_cd"); dm.slip_occr_dt =
		 * (String)hash.get("slip_occr_dt"); dm.slip_clsf_cd =
		 * (String)hash.get("slip_clsf_cd"); dm.slip_seq =
		 * (String)hash.get("slip_seq"); dm.unrcp_excl_yn =
		 * (String)hash.get("unrcp_excl_yn"); dm.chg_pers =
		 * (String)hash.get("chg_pers"); dm.incmg_pers_ipadd =
		 * (String)hash.get("incmg_pers_ipadd");
		 *******************************************************************************************/

		/*******************************************************************************************
		 * dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		 * dm.slip_occr_dt =
		 * Util.getSessionParameterValue(req,"slip_occr_dt",true);
		 * dm.slip_clsf_cd =
		 * Util.getSessionParameterValue(req,"slip_clsf_cd",true); dm.slip_seq =
		 * Util.getSessionParameterValue(req,"slip_seq",true); dm.unrcp_excl_yn
		 * = Util.getSessionParameterValue(req,"unrcp_excl_yn",true);
		 * dm.chg_pers = Util.getSessionParameterValue(req,"chg_pers",true);
		 * dm.incmg_pers_ipadd =
		 * Util.getSessionParameterValue(req,"incmg_pers_ipadd",true);
		 *******************************************************************************************/
	}

	public void fc_acct_2213_l(HttpServletRequest req, HttpServletResponse res)
			throws AppException, SQLException {
		FC_ACCT_2213_LDataSet ds = null;
		FC_ACCT_2213_LDM dm = new FC_ACCT_2213_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
		dm.slip_occr_dt = Util.checkString(req.getParameter("slip_occr_dt"));
		dm.slip_seq = Util.checkString(req.getParameter("slip_seq"));

		dm.print();

		/* EJB 수정후 시작 */
		ds = dao.fc_acct_2213_l(dm);

		if (!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/*
		 * EJB 수정전 시작 try { FC_ACCT_2000EJBHome home =
		 * (FC_ACCT_2000EJBHome)JNDIManager
		 * .getInstance().getHome("FC_ACCT_2000EJB"); FC_ACCT_2000EJB ejb =
		 * home.create();
		 * 
		 * ds = ejb.fc_acct_2213_l(dm); req.setAttribute("ds", ds); } catch
		 * (CreateException e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } catch (RemoteException
		 * e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } EJB 수정전 끝
		 */

		/*******************************************************************************************
		 * String multiUpdateData =
		 * Util.checkString(req.getParameter("multiUpdateData")); Hashtable hash
		 * = getHashMultiUpdateData(multiUpdateData);
		 * 
		 * dm.cmpy_cd = (String)hash.get("cmpy_cd"); dm.slip_clsf_cd =
		 * (String)hash.get("slip_clsf_cd"); dm.slip_occr_dt =
		 * (String)hash.get("slip_occr_dt"); dm.slip_seq =
		 * (String)hash.get("slip_seq");
		 *******************************************************************************************/

		/*******************************************************************************************
		 * dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		 * dm.slip_clsf_cd =
		 * Util.getSessionParameterValue(req,"slip_clsf_cd",true);
		 * dm.slip_occr_dt =
		 * Util.getSessionParameterValue(req,"slip_occr_dt",true); dm.slip_seq =
		 * Util.getSessionParameterValue(req,"slip_seq",true);
		 *******************************************************************************************/
	}

	public void fc_acct_2220_m(HttpServletRequest req, HttpServletResponse res)
			throws AppException, SQLException {
		FC_ACCT_2220_MDataSet ds = null;
		FC_ACCT_2220_MDM dm = new FC_ACCT_2220_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);

		dm.print();

		/* EJB 수정후 시작 */
		ds = dao.fc_acct_2220_m(dm);

		if (!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/*
		 * EJB 수정전 시작 try { FC_ACCT_2000EJBHome home =
		 * (FC_ACCT_2000EJBHome)JNDIManager
		 * .getInstance().getHome("FC_ACCT_2000EJB"); FC_ACCT_2000EJB ejb =
		 * home.create();
		 * 
		 * ds = ejb.fc_acct_2220_m(dm); req.setAttribute("ds", ds); } catch
		 * (CreateException e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } catch (RemoteException
		 * e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } EJB 수정전 끝
		 */

		/*******************************************************************************************
		 * String multiUpdateData =
		 * Util.checkString(req.getParameter("multiUpdateData")); Hashtable hash
		 * = getHashMultiUpdateData(multiUpdateData);
		 * 
		 * dm.cmpy_cd = (String)hash.get("cmpy_cd");
		 *******************************************************************************************/

		/*******************************************************************************************
		 * dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		 *******************************************************************************************/
	}

	public void fc_acct_2222_s(HttpServletRequest req, HttpServletResponse res)
			throws AppException, SQLException {
		FC_ACCT_2222_SDataSet ds = null;
		FC_ACCT_2222_SDM dm = new FC_ACCT_2222_SDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.uid = Util.getSessionParameterValue(req, "uid", true);
		dm.slip_occr_dt = Util.checkString(req.getParameter("slip_occr_dt"));
		dm.slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
		dm.slip_seq = Util.checkString(req.getParameter("slip_seq"));

		dm.print();

		/* EJB 수정후 시작 */
		ds = dao.fc_acct_2222_s(dm);

		if (!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/*
		 * EJB 수정전 시작 try { FC_ACCT_2000EJBHome home =
		 * (FC_ACCT_2000EJBHome)JNDIManager
		 * .getInstance().getHome("FC_ACCT_2000EJB"); FC_ACCT_2000EJB ejb =
		 * home.create();
		 * 
		 * ds = ejb.fc_acct_2222_s(dm); req.setAttribute("ds", ds); } catch
		 * (CreateException e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } catch (RemoteException
		 * e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } EJB 수정전 끝
		 */

		/*******************************************************************************************
		 * String multiUpdateData =
		 * Util.checkString(req.getParameter("multiUpdateData")); Hashtable hash
		 * = getHashMultiUpdateData(multiUpdateData);
		 * 
		 * dm.cmpy_cd = (String)hash.get("cmpy_cd"); dm.uid =
		 * (String)hash.get("uid"); dm.slip_occr_dt =
		 * (String)hash.get("slip_occr_dt"); dm.slip_clsf_cd =
		 * (String)hash.get("slip_clsf_cd"); dm.slip_seq =
		 * (String)hash.get("slip_seq");
		 *******************************************************************************************/

		/*******************************************************************************************
		 * dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		 * dm.uid = Util.getSessionParameterValue(req,"uid",true);
		 * dm.slip_occr_dt =
		 * Util.getSessionParameterValue(req,"slip_occr_dt",true);
		 * dm.slip_clsf_cd =
		 * Util.getSessionParameterValue(req,"slip_clsf_cd",true); dm.slip_seq =
		 * Util.getSessionParameterValue(req,"slip_seq",true);
		 *******************************************************************************************/
	}

	public void fc_acct_2223_s(HttpServletRequest req, HttpServletResponse res)
			throws AppException, SQLException {
		FC_ACCT_2223_SDataSet ds = null;
		FC_ACCT_2223_SDM dm = new FC_ACCT_2223_SDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.slip_occr_dt = Util.checkString(req.getParameter("slip_occr_dt"));
		dm.slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
		dm.slip_seq = Util.checkString(req.getParameter("slip_seq"));

		dm.print();

		/* EJB 수정후 시작 */
		ds = dao.fc_acct_2223_s(dm);

		if (!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/*
		 * EJB 수정전 시작 try { FC_ACCT_2000EJBHome home =
		 * (FC_ACCT_2000EJBHome)JNDIManager
		 * .getInstance().getHome("FC_ACCT_2000EJB"); FC_ACCT_2000EJB ejb =
		 * home.create();
		 * 
		 * ds = ejb.fc_acct_2223_s(dm); req.setAttribute("ds", ds); } catch
		 * (CreateException e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } catch (RemoteException
		 * e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } EJB 수정전 끝
		 */

		/*******************************************************************************************
		 * String multiUpdateData =
		 * Util.checkString(req.getParameter("multiUpdateData")); Hashtable hash
		 * = getHashMultiUpdateData(multiUpdateData);
		 * 
		 * dm.cmpy_cd = (String)hash.get("cmpy_cd"); dm.slip_occr_dt =
		 * (String)hash.get("slip_occr_dt"); dm.slip_clsf_cd =
		 * (String)hash.get("slip_clsf_cd"); dm.slip_seq =
		 * (String)hash.get("slip_seq");
		 *******************************************************************************************/

		/*******************************************************************************************
		 * dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		 * dm.slip_occr_dt =
		 * Util.getSessionParameterValue(req,"slip_occr_dt",true);
		 * dm.slip_clsf_cd =
		 * Util.getSessionParameterValue(req,"slip_clsf_cd",true); dm.slip_seq =
		 * Util.getSessionParameterValue(req,"slip_seq",true);
		 *******************************************************************************************/
	}

	public void fc_acct_2230_m(HttpServletRequest req, HttpServletResponse res)
			throws AppException, SQLException {
		FC_ACCT_2230_MDataSet ds = null;
		FC_ACCT_2230_MDM dm = new FC_ACCT_2230_MDM();

		dm.cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));

		dm.print();

		/* EJB 수정후 시작 */
		ds = dao.fc_acct_2230_m(dm);

		if (!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/*
		 * EJB 수정전 시작 try { FC_ACCT_2000EJBHome home =
		 * (FC_ACCT_2000EJBHome)JNDIManager
		 * .getInstance().getHome("FC_ACCT_2000EJB"); FC_ACCT_2000EJB ejb =
		 * home.create();
		 * 
		 * ds = ejb.fc_acct_2230_m(dm); req.setAttribute("ds", ds); } catch
		 * (CreateException e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } catch (RemoteException
		 * e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } EJB 수정전 끝
		 */

		/*******************************************************************************************
		 * String multiUpdateData =
		 * Util.checkString(req.getParameter("multiUpdateData")); Hashtable hash
		 * = getHashMultiUpdateData(multiUpdateData);
		 * 
		 * dm.cmpy_cd = (String)hash.get("cmpy_cd");
		 *******************************************************************************************/

		/*******************************************************************************************
		 * dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		 *******************************************************************************************/
	}

	public void fc_acct_2231_l(HttpServletRequest req, HttpServletResponse res)
			throws AppException, SQLException {
		FC_ACCT_2231_LDataSet ds = null;
		FC_ACCT_2231_LDM dm = new FC_ACCT_2231_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.dlco_cd = Util.checkString(req.getParameter("dlco_cd"));
		dm.slip_occr_dt_fr = Util.checkString(req
				.getParameter("slip_occr_dt_fr"));
		dm.slip_occr_dt_to = Util.checkString(req
				.getParameter("slip_occr_dt_to"));
		dm.ask_dept_cd = Util.checkString(req.getParameter("ask_dept_cd"));
		dm.unrcp_yn = Util.checkString(req.getParameter("unrcp_yn"));

		dm.print();

		/* EJB 수정후 시작 */
		ds = dao.fc_acct_2231_l(dm);

		if (!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/*
		 * EJB 수정전 시작 try { FC_ACCT_2000EJBHome home =
		 * (FC_ACCT_2000EJBHome)JNDIManager
		 * .getInstance().getHome("FC_ACCT_2000EJB"); FC_ACCT_2000EJB ejb =
		 * home.create();
		 * 
		 * ds = ejb.fc_acct_2231_l(dm); req.setAttribute("ds", ds); } catch
		 * (CreateException e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } catch (RemoteException
		 * e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } EJB 수정전 끝
		 */

		/*******************************************************************************************
		 * String multiUpdateData =
		 * Util.checkString(req.getParameter("multiUpdateData")); Hashtable hash
		 * = getHashMultiUpdateData(multiUpdateData);
		 * 
		 * dm.cmpy_cd = (String)hash.get("cmpy_cd"); dm.dlco_cd =
		 * (String)hash.get("dlco_cd"); dm.slip_occr_dt_fr =
		 * (String)hash.get("slip_occr_dt_fr"); dm.slip_occr_dt_to =
		 * (String)hash.get("slip_occr_dt_to"); dm.ask_dept_cd =
		 * (String)hash.get("ask_dept_cd"); dm.unrcp_yn =
		 * (String)hash.get("unrcp_yn");
		 *******************************************************************************************/

		/*******************************************************************************************
		 * dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		 * dm.dlco_cd = Util.getSessionParameterValue(req,"dlco_cd",true);
		 * dm.slip_occr_dt_fr =
		 * Util.getSessionParameterValue(req,"slip_occr_dt_fr",true);
		 * dm.slip_occr_dt_to =
		 * Util.getSessionParameterValue(req,"slip_occr_dt_to",true);
		 * dm.ask_dept_cd =
		 * Util.getSessionParameterValue(req,"ask_dept_cd",true); dm.unrcp_yn =
		 * Util.getSessionParameterValue(req,"unrcp_yn",true);
		 *******************************************************************************************/
	}

	public void fc_acct_2232_s(HttpServletRequest req, HttpServletResponse res)
			throws AppException, SQLException {
		FC_ACCT_2232_SDataSet ds = null;
		FC_ACCT_2232_SDM dm = new FC_ACCT_2232_SDM();

		dm.cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
		dm.slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
		dm.slip_occr_dt = Util.checkString(req.getParameter("slip_occr_dt"));
		dm.slip_seq = Util.checkString(req.getParameter("slip_seq"));

		dm.print();

		/* EJB 수정후 시작 */
		ds = dao.fc_acct_2232_s(dm);

		if (!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/*
		 * EJB 수정전 시작 try { FC_ACCT_2000EJBHome home =
		 * (FC_ACCT_2000EJBHome)JNDIManager
		 * .getInstance().getHome("FC_ACCT_2000EJB"); FC_ACCT_2000EJB ejb =
		 * home.create();
		 * 
		 * ds = ejb.fc_acct_2232_s(dm); req.setAttribute("ds", ds); } catch
		 * (CreateException e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } catch (RemoteException
		 * e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } EJB 수정전 끝
		 */

		/*******************************************************************************************
		 * String multiUpdateData =
		 * Util.checkString(req.getParameter("multiUpdateData")); Hashtable hash
		 * = getHashMultiUpdateData(multiUpdateData);
		 * 
		 * dm.cmpy_cd = (String)hash.get("cmpy_cd"); dm.slip_clsf_cd =
		 * (String)hash.get("slip_clsf_cd"); dm.slip_occr_dt =
		 * (String)hash.get("slip_occr_dt"); dm.slip_seq =
		 * (String)hash.get("slip_seq");
		 *******************************************************************************************/

		/*******************************************************************************************
		 * dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		 * dm.slip_clsf_cd =
		 * Util.getSessionParameterValue(req,"slip_clsf_cd",true);
		 * dm.slip_occr_dt =
		 * Util.getSessionParameterValue(req,"slip_occr_dt",true); dm.slip_seq =
		 * Util.getSessionParameterValue(req,"slip_seq",true);
		 *******************************************************************************************/
	}

	public void fc_acct_2241_l(HttpServletRequest req, HttpServletResponse res)
			throws AppException, SQLException {
		FC_ACCT_2241_LDataSet ds = null;
		FC_ACCT_2241_LDM dm = new FC_ACCT_2241_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.acct_num = Util.checkString(req.getParameter("acct_num"));
		dm.frdt = Util.checkString(req.getParameter("frdt"));
		dm.todt = Util.checkString(req.getParameter("todt"));
		dm.remark = Util.checkString(req.getParameter("remark"));
		dm.tran_amt = Util.checkString(req.getParameter("tran_amt"));

		dm.print();

		/* EJB 수정후 시작 */
		ds = dao.fc_acct_2241_l(dm);

		if (!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/*
		 * EJB 수정전 시작 try { FC_ACCT_2000EJBHome home =
		 * (FC_ACCT_2000EJBHome)JNDIManager
		 * .getInstance().getHome("FC_ACCT_2000EJB"); FC_ACCT_2000EJB ejb =
		 * home.create();
		 * 
		 * ds = ejb.fc_acct_2241_l(dm); req.setAttribute("ds", ds); } catch
		 * (CreateException e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } catch (RemoteException
		 * e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } EJB 수정전 끝
		 */

		/*******************************************************************************************
		 * String multiUpdateData =
		 * Util.checkString(req.getParameter("multiUpdateData")); Hashtable hash
		 * = getHashMultiUpdateData(multiUpdateData);
		 * 
		 * dm.cmpy_cd = (String)hash.get("cmpy_cd"); dm.acct_num =
		 * (String)hash.get("acct_num"); dm.frdt = (String)hash.get("frdt");
		 * dm.todt = (String)hash.get("todt"); dm.remark =
		 * (String)hash.get("remark"); dm.tran_amt =
		 * (String)hash.get("tran_amt");
		 *******************************************************************************************/

		/*******************************************************************************************
		 * dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		 * dm.acct_num = Util.getSessionParameterValue(req,"acct_num",true);
		 * dm.frdt = Util.getSessionParameterValue(req,"frdt",true); dm.todt =
		 * Util.getSessionParameterValue(req,"todt",true); dm.remark =
		 * Util.getSessionParameterValue(req,"remark",true); dm.tran_amt =
		 * Util.getSessionParameterValue(req,"tran_amt",true);
		 *******************************************************************************************/
	}

	public void fc_acct_2245_m(HttpServletRequest req, HttpServletResponse res)
			throws AppException, SQLException {
		FC_ACCT_2245_MDataSet ds = null;
		FC_ACCT_2245_MDM dm = new FC_ACCT_2245_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);

		dm.print();

		/* EJB 수정후 시작 */
		ds = dao.fc_acct_2245_m(dm);

		if (!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/*
		 * EJB 수정전 시작 try { FC_ACCT_2000EJBHome home =
		 * (FC_ACCT_2000EJBHome)JNDIManager
		 * .getInstance().getHome("FC_ACCT_2000EJB"); FC_ACCT_2000EJB ejb =
		 * home.create();
		 * 
		 * ds = ejb.fc_acct_2246_l(dm); req.setAttribute("ds", ds); } catch
		 * (CreateException e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } catch (RemoteException
		 * e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } EJB 수정전 끝
		 */

		/*******************************************************************************************
		 * String multiUpdateData =
		 * Util.checkString(req.getParameter("multiUpdateData")); Hashtable hash
		 * = getHashMultiUpdateData(multiUpdateData);
		 * 
		 * dm.cmpy_cd = (String)hash.get("cmpy_cd"); dm.acct_num =
		 * (String)hash.get("acct_num"); dm.frdt = (String)hash.get("frdt");
		 * dm.todt = (String)hash.get("todt"); dm.remark =
		 * (String)hash.get("remark"); dm.tran_amt =
		 * (String)hash.get("tran_amt");
		 *******************************************************************************************/

		/*******************************************************************************************
		 * dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		 * dm.acct_num = Util.getSessionParameterValue(req,"acct_num",true);
		 * dm.frdt = Util.getSessionParameterValue(req,"frdt",true); dm.todt =
		 * Util.getSessionParameterValue(req,"todt",true); dm.remark =
		 * Util.getSessionParameterValue(req,"remark",true); dm.tran_amt =
		 * Util.getSessionParameterValue(req,"tran_amt",true);
		 *******************************************************************************************/
	}

	public void fc_acct_2246_l(HttpServletRequest req, HttpServletResponse res)
			throws AppException, SQLException {
		FC_ACCT_2246_LDataSet ds = null;
		FC_ACCT_2246_LDM dm = new FC_ACCT_2246_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.acct_num = Util.checkString(req.getParameter("acct_num"));
		dm.frdt = Util.checkString(req.getParameter("frdt"));
		dm.todt = Util.checkString(req.getParameter("todt"));
		dm.remark = Util.checkString(req.getParameter("remark"));
		dm.tran_amt = Util.checkString(req.getParameter("tran_amt"));
		dm.tran_clsfy = Util.checkString(req.getParameter("tran_clsfy"));

		dm.print();

		/* EJB 수정후 시작 */
		ds = dao.fc_acct_2246_l(dm);

		if (!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/*
		 * EJB 수정전 시작 try { FC_ACCT_2000EJBHome home =
		 * (FC_ACCT_2000EJBHome)JNDIManager
		 * .getInstance().getHome("FC_ACCT_2000EJB"); FC_ACCT_2000EJB ejb =
		 * home.create();
		 * 
		 * ds = ejb.fc_acct_2246_l(dm); req.setAttribute("ds", ds); } catch
		 * (CreateException e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } catch (RemoteException
		 * e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } EJB 수정전 끝
		 */

		/*******************************************************************************************
		 * String multiUpdateData =
		 * Util.checkString(req.getParameter("multiUpdateData")); Hashtable hash
		 * = getHashMultiUpdateData(multiUpdateData);
		 * 
		 * dm.cmpy_cd = (String)hash.get("cmpy_cd"); dm.acct_num =
		 * (String)hash.get("acct_num"); dm.frdt = (String)hash.get("frdt");
		 * dm.todt = (String)hash.get("todt"); dm.remark =
		 * (String)hash.get("remark"); dm.tran_amt =
		 * (String)hash.get("tran_amt");
		 *******************************************************************************************/

		/*******************************************************************************************
		 * dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		 * dm.acct_num = Util.getSessionParameterValue(req,"acct_num",true);
		 * dm.frdt = Util.getSessionParameterValue(req,"frdt",true); dm.todt =
		 * Util.getSessionParameterValue(req,"todt",true); dm.remark =
		 * Util.getSessionParameterValue(req,"remark",true); dm.tran_amt =
		 * Util.getSessionParameterValue(req,"tran_amt",true);
		 *******************************************************************************************/
	}

	public void fc_acct_2247_l(HttpServletRequest req, HttpServletResponse res)
			throws AppException, SQLException {
		FC_ACCT_2247_LDataSet ds = null;
		FC_ACCT_2247_LDM dm = new FC_ACCT_2247_LDM();
		
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.acct_num = Util.checkString(req.getParameter("acct_num"));
		dm.frdt = Util.checkString(req.getParameter("frdt"));
		dm.todt = Util.checkString(req.getParameter("todt"));
		dm.extnc_dt = Util.checkString(req.getParameter("extnc_dt"));
		dm.remark = Util.checkString(req.getParameter("remark"));
		dm.tran_clsfy = Util.checkString(req.getParameter("tran_clsfy"));
		
		dm.print();
		
		/* EJB 수정후 시작 */
		ds = dao.fc_acct_2247_l(dm);
		
		if (!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		req.setAttribute("ds", ds);
}
	public void fc_acct_2250_m(HttpServletRequest req, HttpServletResponse res)
			throws AppException, SQLException {
		FC_ACCT_2250_MDataSet ds = null;
		FC_ACCT_2250_MDM dm = new FC_ACCT_2250_MDM();

		dm.cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);

		dm.print();

		/* EJB 수정후 시작 */
		ds = dao.fc_acct_2250_m(dm);

		if (!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/*
		 * EJB 수정전 시작 try { FC_ACCT_2000EJBHome home =
		 * (FC_ACCT_2000EJBHome)JNDIManager
		 * .getInstance().getHome("FC_ACCT_2000EJB"); FC_ACCT_2000EJB ejb =
		 * home.create();
		 * 
		 * ds = ejb.fc_acct_2250_m(dm); req.setAttribute("ds", ds); } catch
		 * (CreateException e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } catch (RemoteException
		 * e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } EJB 수정전 끝
		 */

		/*******************************************************************************************
		 * String multiUpdateData =
		 * Util.checkString(req.getParameter("multiUpdateData")); Hashtable hash
		 * = getHashMultiUpdateData(multiUpdateData);
		 * 
		 * dm.cmpy_cd = (String)hash.get("cmpy_cd");
		 *******************************************************************************************/

		/*******************************************************************************************
		 * dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		 *******************************************************************************************/
	}

	public void fc_acct_2251_l(HttpServletRequest req, HttpServletResponse res)
			throws AppException, SQLException {
		FC_ACCT_2251_LDataSet ds = null;
		FC_ACCT_2251_LDM dm = new FC_ACCT_2251_LDM();

		dm.cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
		dm.slip_occr_dt = Util.checkString(req.getParameter("slip_occr_dt"));
		dm.slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
		dm.slip_seq = Util.checkString(req.getParameter("slip_seq"));
		dm.slip_sub_seq = Util.checkString(req.getParameter("slip_sub_seq"));

		dm.print();

		/* EJB 수정후 시작 */
		ds = dao.fc_acct_2251_l(dm);

		if (!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/*
		 * EJB 수정전 시작 try { FC_ACCT_2000EJBHome home =
		 * (FC_ACCT_2000EJBHome)JNDIManager
		 * .getInstance().getHome("FC_ACCT_2000EJB"); FC_ACCT_2000EJB ejb =
		 * home.create();
		 * 
		 * ds = ejb.fc_acct_2251_l(dm); req.setAttribute("ds", ds); } catch
		 * (CreateException e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } catch (RemoteException
		 * e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } EJB 수정전 끝
		 */

		/*******************************************************************************************
		 * String multiUpdateData =
		 * Util.checkString(req.getParameter("multiUpdateData")); Hashtable hash
		 * = getHashMultiUpdateData(multiUpdateData);
		 * 
		 * dm.cmpy_cd = (String)hash.get("cmpy_cd"); dm.slip_occr_dt =
		 * (String)hash.get("slip_occr_dt"); dm.slip_clsf_cd =
		 * (String)hash.get("slip_clsf_cd"); dm.slip_seq =
		 * (String)hash.get("slip_seq"); dm.slip_sub_seq =
		 * (String)hash.get("slip_sub_seq");
		 *******************************************************************************************/

		/*******************************************************************************************
		 * dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		 * dm.slip_occr_dt =
		 * Util.getSessionParameterValue(req,"slip_occr_dt",true);
		 * dm.slip_clsf_cd =
		 * Util.getSessionParameterValue(req,"slip_clsf_cd",true); dm.slip_seq =
		 * Util.getSessionParameterValue(req,"slip_seq",true); dm.slip_sub_seq =
		 * Util.getSessionParameterValue(req,"slip_sub_seq",true);
		 *******************************************************************************************/
	}

	public void fc_acct_2253_i(HttpServletRequest req, HttpServletResponse res)
			throws AppException, SQLException {
		FC_ACCT_2253_IDataSet ds = null;
		FC_ACCT_2253_IDM dm = new FC_ACCT_2253_IDM();

		String multiUpdateData = Util.checkString(req
				.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
		dm.slip_occr_dt = Util.checkString(req.getParameter("slip_occr_dt"));
		dm.slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
		dm.slip_sub_seq = Util.checkString(req.getParameter("slip_sub_seq"));
		dm.clam_dept_cd = Util.checkString(req.getParameter("clam_dept_cd"));
		dm.incmg_emp_no = Util.checkString(req.getParameter("incmg_emp_no"));
		dm.fisc_dt = Util.checkString(req.getParameter("fisc_dt"));
		dm.incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		dm.slip_arow_no = (String) hash.get("slip_arow_no");
		dm.budg_cd = (String) hash.get("budg_cd");
		dm.drcr_clsf = (String) hash.get("drcr_clsf");
		dm.dr_amt = (String) hash.get("dr_amt");
		dm.crdt_amt = (String) hash.get("crdt_amt");
		dm.intg_dlco_cd = (String) hash.get("intg_dlco_cd");
		dm.dlco_clsf_cd = (String) hash.get("dlco_clsf_cd");
		dm.dlco_cd = (String) hash.get("dlco_cd");
		dm.dlco_nm = (String) hash.get("dlco_nm");
		dm.boks_dlco_nm = (String) hash.get("boks_dlco_nm");
		dm.mang_clsf_cd = (String) hash.get("mang_clsf_cd");
		dm.mang_no = (String) hash.get("mang_no");
		dm.incm_clsf_cd = (String) hash.get("incm_clsf_cd");
		dm.medi_cd = (String) hash.get("medi_cd");
		dm.dtls_medi_cd = (String) hash.get("dtls_medi_cd");
		dm.evnt_cd = (String) hash.get("evnt_cd");
		dm.use_dept_cd = (String) hash.get("use_dept_cd");
		dm.comp_dt = (String) hash.get("comp_dt");
		dm.mtry_dt = (String) hash.get("mtry_dt");
		dm.bank_cd = (String) hash.get("bank_cd");
		dm.prop_equip_cd = (String) hash.get("prop_equip_cd");
		dm.unit = (String) hash.get("unit");
		dm.qunt = (String) hash.get("qunt");
		dm.tax_stmt_no = (String) hash.get("tax_stmt_no");
		dm.setoff_slip_occr_dt = (String) hash.get("setoff_slip_occr_dt");
		dm.setoff_slip_clsf_cd = (String) hash.get("setoff_slip_clsf_cd");
		dm.setoff_slip_seq = (String) hash.get("setoff_slip_seq");
		dm.setoff_slip_sub_seq = (String) hash.get("setoff_slip_sub_seq");
		dm.setoff_slip_arow_no = (String) hash.get("setoff_slip_arow_no");
		dm.obj_acct_cd = (String) hash.get("obj_acct_cd");
		dm.obj_dt = (String) hash.get("obj_dt");
		dm.obj_amt = (String) hash.get("obj_amt");
		dm.frcr_clsf_cd = (String) hash.get("frcr_clsf_cd");
		dm.frcr_amt = (String) hash.get("frcr_amt");
		dm.exrate = (String) hash.get("exrate");
		dm.note_stat = (String) hash.get("note_stat");
		dm.rmks1 = (String) hash.get("rmks1");
		dm.rmks2 = (String) hash.get("rmks2");
		dm.incmg_dt = Util.checkString(req.getParameter("incmg_dt"));
		dm.occr_slip_clsf = (String) hash.get("occr_slip_clsf");
		dm.occr_slip = (String) hash.get("occr_slip");

		dm.etc_in = (String) hash.get("etc_in");
		dm.make_dt = (String) hash.get("make_dt");
		dm.erplace_cd = (String) hash.get("erplace_cd");
		dm.ern = (String) hash.get("ern");
		dm.suply_amt = (String) hash.get("suply_amt");
		dm.vat_amt = (String) hash.get("vat_amt");
		dm.chnl_clsf_cd = Util.checkString(req.getParameter("chnl_clsf_cd"));
		dm.print();

		/* EJB 수정후 시작 */
		ds = dao.fc_acct_2253_i(dm);

		if (!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/*
		 * EJB 수정전 시작 try { FC_ACCT_2000EJBHome home =
		 * (FC_ACCT_2000EJBHome)JNDIManager
		 * .getInstance().getHome("FC_ACCT_2000EJB"); FC_ACCT_2000EJB ejb =
		 * home.create();
		 * 
		 * ds = ejb.fc_acct_2253_i(dm); req.setAttribute("ds", ds); } catch
		 * (CreateException e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } catch (RemoteException
		 * e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } EJB 수정전 끝
		 */

		/*******************************************************************************************
		 * String multiUpdateData =
		 * Util.checkString(req.getParameter("multiUpdateData")); Hashtable hash
		 * = getHashMultiUpdateData(multiUpdateData);
		 * 
		 * dm.cmpy_cd = (String)hash.get("cmpy_cd"); dm.slip_occr_dt =
		 * (String)hash.get("slip_occr_dt"); dm.slip_clsf_cd =
		 * (String)hash.get("slip_clsf_cd"); dm.slip_sub_seq =
		 * (String)hash.get("slip_sub_seq"); dm.clam_dept_cd =
		 * (String)hash.get("clam_dept_cd"); dm.incmg_emp_no =
		 * (String)hash.get("incmg_emp_no"); dm.fisc_dt =
		 * (String)hash.get("fisc_dt"); dm.incmg_pers =
		 * (String)hash.get("incmg_pers"); dm.incmg_pers_ipadd =
		 * (String)hash.get("incmg_pers_ipadd"); dm.slip_arow_no =
		 * (String)hash.get("slip_arow_no"); dm.budg_cd =
		 * (String)hash.get("budg_cd"); dm.drcr_clsf =
		 * (String)hash.get("drcr_clsf"); dm.dr_amt =
		 * (String)hash.get("dr_amt"); dm.crdt_amt =
		 * (String)hash.get("crdt_amt"); dm.intg_dlco_cd =
		 * (String)hash.get("intg_dlco_cd"); dm.dlco_clsf_cd =
		 * (String)hash.get("dlco_clsf_cd"); dm.dlco_cd =
		 * (String)hash.get("dlco_cd"); dm.dlco_nm =
		 * (String)hash.get("dlco_nm"); dm.boks_dlco_nm =
		 * (String)hash.get("boks_dlco_nm"); dm.mang_clsf_cd =
		 * (String)hash.get("mang_clsf_cd"); dm.mang_no =
		 * (String)hash.get("mang_no"); dm.incm_clsf_cd =
		 * (String)hash.get("incm_clsf_cd"); dm.medi_cd =
		 * (String)hash.get("medi_cd"); dm.dtls_medi_cd =
		 * (String)hash.get("dtls_medi_cd"); dm.evnt_cd =
		 * (String)hash.get("evnt_cd"); dm.use_dept_cd =
		 * (String)hash.get("use_dept_cd"); dm.comp_dt =
		 * (String)hash.get("comp_dt"); dm.mtry_dt =
		 * (String)hash.get("mtry_dt"); dm.bank_cd =
		 * (String)hash.get("bank_cd"); dm.prop_equip_cd =
		 * (String)hash.get("prop_equip_cd"); dm.unit =
		 * (String)hash.get("unit"); dm.qunt = (String)hash.get("qunt");
		 * dm.tax_stmt_no = (String)hash.get("tax_stmt_no");
		 * dm.setoff_slip_occr_dt = (String)hash.get("setoff_slip_occr_dt");
		 * dm.setoff_slip_clsf_cd = (String)hash.get("setoff_slip_clsf_cd");
		 * dm.setoff_slip_seq = (String)hash.get("setoff_slip_seq");
		 * dm.setoff_slip_sub_seq = (String)hash.get("setoff_slip_sub_seq");
		 * dm.setoff_slip_arow_no = (String)hash.get("setoff_slip_arow_no");
		 * dm.obj_acct_cd = (String)hash.get("obj_acct_cd"); dm.obj_dt =
		 * (String)hash.get("obj_dt"); dm.obj_amt = (String)hash.get("obj_amt");
		 * dm.frcr_clsf_cd = (String)hash.get("frcr_clsf_cd"); dm.frcr_amt =
		 * (String)hash.get("frcr_amt"); dm.exrate = (String)hash.get("exrate");
		 * dm.note_stat = (String)hash.get("note_stat"); dm.rmks1 =
		 * (String)hash.get("rmks1"); dm.rmks2 = (String)hash.get("rmks2");
		 * dm.incmg_dt = (String)hash.get("incmg_dt"); dm.occr_slip_clsf =
		 * (String)hash.get("occr_slip_clsf"); dm.occr_slip =
		 * (String)hash.get("occr_slip");
		 *******************************************************************************************/

		/*******************************************************************************************
		 * dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		 * dm.slip_occr_dt =
		 * Util.getSessionParameterValue(req,"slip_occr_dt",true);
		 * dm.slip_clsf_cd =
		 * Util.getSessionParameterValue(req,"slip_clsf_cd",true);
		 * dm.slip_sub_seq =
		 * Util.getSessionParameterValue(req,"slip_sub_seq",true);
		 * dm.clam_dept_cd =
		 * Util.getSessionParameterValue(req,"clam_dept_cd",true);
		 * dm.incmg_emp_no =
		 * Util.getSessionParameterValue(req,"incmg_emp_no",true); dm.fisc_dt =
		 * Util.getSessionParameterValue(req,"fisc_dt",true); dm.incmg_pers =
		 * Util.getSessionParameterValue(req,"incmg_pers",true);
		 * dm.incmg_pers_ipadd =
		 * Util.getSessionParameterValue(req,"incmg_pers_ipadd",true);
		 * dm.slip_arow_no =
		 * Util.getSessionParameterValue(req,"slip_arow_no",true); dm.budg_cd =
		 * Util.getSessionParameterValue(req,"budg_cd",true); dm.drcr_clsf =
		 * Util.getSessionParameterValue(req,"drcr_clsf",true); dm.dr_amt =
		 * Util.getSessionParameterValue(req,"dr_amt",true); dm.crdt_amt =
		 * Util.getSessionParameterValue(req,"crdt_amt",true); dm.intg_dlco_cd =
		 * Util.getSessionParameterValue(req,"intg_dlco_cd",true);
		 * dm.dlco_clsf_cd =
		 * Util.getSessionParameterValue(req,"dlco_clsf_cd",true); dm.dlco_cd =
		 * Util.getSessionParameterValue(req,"dlco_cd",true); dm.dlco_nm =
		 * Util.getSessionParameterValue(req,"dlco_nm",true); dm.boks_dlco_nm =
		 * Util.getSessionParameterValue(req,"boks_dlco_nm",true);
		 * dm.mang_clsf_cd =
		 * Util.getSessionParameterValue(req,"mang_clsf_cd",true); dm.mang_no =
		 * Util.getSessionParameterValue(req,"mang_no",true); dm.incm_clsf_cd =
		 * Util.getSessionParameterValue(req,"incm_clsf_cd",true); dm.medi_cd =
		 * Util.getSessionParameterValue(req,"medi_cd",true); dm.dtls_medi_cd =
		 * Util.getSessionParameterValue(req,"dtls_medi_cd",true); dm.evnt_cd =
		 * Util.getSessionParameterValue(req,"evnt_cd",true); dm.use_dept_cd =
		 * Util.getSessionParameterValue(req,"use_dept_cd",true); dm.comp_dt =
		 * Util.getSessionParameterValue(req,"comp_dt",true); dm.mtry_dt =
		 * Util.getSessionParameterValue(req,"mtry_dt",true); dm.bank_cd =
		 * Util.getSessionParameterValue(req,"bank_cd",true); dm.prop_equip_cd =
		 * Util.getSessionParameterValue(req,"prop_equip_cd",true); dm.unit =
		 * Util.getSessionParameterValue(req,"unit",true); dm.qunt =
		 * Util.getSessionParameterValue(req,"qunt",true); dm.tax_stmt_no =
		 * Util.getSessionParameterValue(req,"tax_stmt_no",true);
		 * dm.setoff_slip_occr_dt =
		 * Util.getSessionParameterValue(req,"setoff_slip_occr_dt",true);
		 * dm.setoff_slip_clsf_cd =
		 * Util.getSessionParameterValue(req,"setoff_slip_clsf_cd",true);
		 * dm.setoff_slip_seq =
		 * Util.getSessionParameterValue(req,"setoff_slip_seq",true);
		 * dm.setoff_slip_sub_seq =
		 * Util.getSessionParameterValue(req,"setoff_slip_sub_seq",true);
		 * dm.setoff_slip_arow_no =
		 * Util.getSessionParameterValue(req,"setoff_slip_arow_no",true);
		 * dm.obj_acct_cd =
		 * Util.getSessionParameterValue(req,"obj_acct_cd",true); dm.obj_dt =
		 * Util.getSessionParameterValue(req,"obj_dt",true); dm.obj_amt =
		 * Util.getSessionParameterValue(req,"obj_amt",true); dm.frcr_clsf_cd =
		 * Util.getSessionParameterValue(req,"frcr_clsf_cd",true); dm.frcr_amt =
		 * Util.getSessionParameterValue(req,"frcr_amt",true); dm.exrate =
		 * Util.getSessionParameterValue(req,"exrate",true); dm.note_stat =
		 * Util.getSessionParameterValue(req,"note_stat",true); dm.rmks1 =
		 * Util.getSessionParameterValue(req,"rmks1",true); dm.rmks2 =
		 * Util.getSessionParameterValue(req,"rmks2",true); dm.incmg_dt =
		 * Util.getSessionParameterValue(req,"incmg_dt",true); dm.occr_slip_clsf
		 * = Util.getSessionParameterValue(req,"occr_slip_clsf",true);
		 * dm.occr_slip = Util.getSessionParameterValue(req,"occr_slip",true);
		 *******************************************************************************************/
	}

	public void fc_acct_2254_u(HttpServletRequest req, HttpServletResponse res)
			throws AppException, SQLException {
		FC_ACCT_2254_UDataSet ds = null;
		FC_ACCT_2254_UDM dm = new FC_ACCT_2254_UDM();

		String multiUpdateData = Util.checkString(req
				.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
		dm.slip_occr_dt = Util.checkString(req.getParameter("slip_occr_dt"));
		dm.slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
		dm.slip_seq = Util.checkString(req.getParameter("slip_seq"));
		dm.slip_sub_seq = Util.checkString(req.getParameter("slip_sub_seq"));
		dm.clam_dept_cd = Util.checkString(req.getParameter("clam_dept_cd"));
		dm.incmg_emp_no = Util.checkString(req.getParameter("incmg_emp_no"));
		dm.fisc_dt = Util.checkString(req.getParameter("fisc_dt"));
		dm.incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		dm.slip_arow_no = (String) hash.get("slip_arow_no");
		dm.budg_cd = (String) hash.get("budg_cd");
		dm.drcr_clsf = (String) hash.get("drcr_clsf");
		dm.dr_amt = (String) hash.get("dr_amt");
		dm.crdt_amt = (String) hash.get("crdt_amt");
		dm.intg_dlco_cd = (String) hash.get("intg_dlco_cd");
		dm.dlco_clsf_cd = (String) hash.get("dlco_clsf_cd");
		dm.dlco_cd = (String) hash.get("dlco_cd");
		dm.dlco_nm = (String) hash.get("dlco_nm");
		dm.boks_dlco_nm = (String) hash.get("boks_dlco_nm");
		dm.mang_clsf_cd = (String) hash.get("mang_clsf_cd");
		dm.mang_no = (String) hash.get("mang_no");
		dm.incm_clsf_cd = (String) hash.get("incm_clsf_cd");
		dm.medi_cd = (String) hash.get("medi_cd");
		dm.dtls_medi_cd = (String) hash.get("dtls_medi_cd");
		dm.evnt_cd = (String) hash.get("evnt_cd");
		dm.use_dept_cd = (String) hash.get("use_dept_cd");
		dm.comp_dt = (String) hash.get("comp_dt");
		dm.mtry_dt = (String) hash.get("mtry_dt");
		dm.bank_cd = (String) hash.get("bank_cd");
		dm.prop_equip_cd = (String) hash.get("prop_equip_cd");
		dm.unit = (String) hash.get("unit");
		dm.qunt = (String) hash.get("qunt");
		dm.chnl_clsf_cd = Util.checkString(req.getParameter("chnl_clsf_cd"));
		dm.tax_stmt_no = (String) hash.get("tax_stmt_no");
		dm.setoff_slip_occr_dt = (String) hash.get("setoff_slip_occr_dt");
		dm.setoff_slip_clsf_cd = (String) hash.get("setoff_slip_clsf_cd");
		dm.setoff_slip_seq = (String) hash.get("setoff_slip_seq");
		dm.setoff_slip_sub_seq = (String) hash.get("setoff_slip_sub_seq");
		dm.setoff_slip_arow_no = (String) hash.get("setoff_slip_arow_no");
		dm.obj_acct_cd = (String) hash.get("obj_acct_cd");
		dm.obj_dt = (String) hash.get("obj_dt");
		dm.obj_amt = (String) hash.get("obj_amt");
		dm.frcr_clsf_cd = (String) hash.get("frcr_clsf_cd");
		dm.frcr_amt = (String) hash.get("frcr_amt");
		dm.exrate = (String) hash.get("exrate");
		dm.note_stat = (String) hash.get("note_stat");
		dm.rmks1 = (String) hash.get("rmks1");
		dm.rmks2 = (String) hash.get("rmks2");
		dm.incmg_dt = Util.checkString(req.getParameter("incmg_dt"));
		dm.occr_slip_clsf = (String) hash.get("occr_slip_clsf");
		dm.occr_slip = (String) hash.get("occr_slip");
		dm.reso_amt = Util.checkString(req.getParameter("reso_amt"));
		dm.reso_amt_ch = Util.checkString(req.getParameter("reso_amt_ch"));

		dm.etc_in = (String) hash.get("etc_in");
		dm.make_dt = (String) hash.get("make_dt");
		dm.erplace_cd = (String) hash.get("erplace_cd");
		dm.ern = (String) hash.get("ern");
		dm.suply_amt = (String) hash.get("suply_amt");
		dm.vat_amt = (String) hash.get("vat_amt");

		dm.print();

		/* EJB 수정후 시작 */
		ds = dao.fc_acct_2254_u(dm);

		if (!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/*
		 * EJB 수정전 시작 try { FC_ACCT_2000EJBHome home =
		 * (FC_ACCT_2000EJBHome)JNDIManager
		 * .getInstance().getHome("FC_ACCT_2000EJB"); FC_ACCT_2000EJB ejb =
		 * home.create();
		 * 
		 * ds = ejb.fc_acct_2254_u(dm); req.setAttribute("ds", ds); } catch
		 * (CreateException e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } catch (RemoteException
		 * e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } EJB 수정전 끝
		 */

		/*******************************************************************************************
		 * String multiUpdateData =
		 * Util.checkString(req.getParameter("multiUpdateData")); Hashtable hash
		 * = getHashMultiUpdateData(multiUpdateData);
		 * 
		 * dm.cmpy_cd = (String)hash.get("cmpy_cd"); dm.slip_occr_dt =
		 * (String)hash.get("slip_occr_dt"); dm.slip_clsf_cd =
		 * (String)hash.get("slip_clsf_cd"); dm.slip_seq =
		 * (String)hash.get("slip_seq"); dm.slip_sub_seq =
		 * (String)hash.get("slip_sub_seq"); dm.clam_dept_cd =
		 * (String)hash.get("clam_dept_cd"); dm.incmg_emp_no =
		 * (String)hash.get("incmg_emp_no"); dm.fisc_dt =
		 * (String)hash.get("fisc_dt"); dm.incmg_pers =
		 * (String)hash.get("incmg_pers"); dm.incmg_pers_ipadd =
		 * (String)hash.get("incmg_pers_ipadd"); dm.slip_arow_no =
		 * (String)hash.get("slip_arow_no"); dm.budg_cd =
		 * (String)hash.get("budg_cd"); dm.drcr_clsf =
		 * (String)hash.get("drcr_clsf"); dm.dr_amt =
		 * (String)hash.get("dr_amt"); dm.crdt_amt =
		 * (String)hash.get("crdt_amt"); dm.intg_dlco_cd =
		 * (String)hash.get("intg_dlco_cd"); dm.dlco_clsf_cd =
		 * (String)hash.get("dlco_clsf_cd"); dm.dlco_cd =
		 * (String)hash.get("dlco_cd"); dm.dlco_nm =
		 * (String)hash.get("dlco_nm"); dm.boks_dlco_nm =
		 * (String)hash.get("boks_dlco_nm"); dm.mang_clsf_cd =
		 * (String)hash.get("mang_clsf_cd"); dm.mang_no =
		 * (String)hash.get("mang_no"); dm.incm_clsf_cd =
		 * (String)hash.get("incm_clsf_cd"); dm.medi_cd =
		 * (String)hash.get("medi_cd"); dm.dtls_medi_cd =
		 * (String)hash.get("dtls_medi_cd"); dm.evnt_cd =
		 * (String)hash.get("evnt_cd"); dm.use_dept_cd =
		 * (String)hash.get("use_dept_cd"); dm.comp_dt =
		 * (String)hash.get("comp_dt"); dm.mtry_dt =
		 * (String)hash.get("mtry_dt"); dm.bank_cd =
		 * (String)hash.get("bank_cd"); dm.prop_equip_cd =
		 * (String)hash.get("prop_equip_cd"); dm.unit =
		 * (String)hash.get("unit"); dm.qunt = (String)hash.get("qunt");
		 * dm.tax_stmt_no = (String)hash.get("tax_stmt_no");
		 * dm.setoff_slip_occr_dt = (String)hash.get("setoff_slip_occr_dt");
		 * dm.setoff_slip_clsf_cd = (String)hash.get("setoff_slip_clsf_cd");
		 * dm.setoff_slip_seq = (String)hash.get("setoff_slip_seq");
		 * dm.setoff_slip_sub_seq = (String)hash.get("setoff_slip_sub_seq");
		 * dm.setoff_slip_arow_no = (String)hash.get("setoff_slip_arow_no");
		 * dm.obj_acct_cd = (String)hash.get("obj_acct_cd"); dm.obj_dt =
		 * (String)hash.get("obj_dt"); dm.obj_amt = (String)hash.get("obj_amt");
		 * dm.frcr_clsf_cd = (String)hash.get("frcr_clsf_cd"); dm.frcr_amt =
		 * (String)hash.get("frcr_amt"); dm.exrate = (String)hash.get("exrate");
		 * dm.note_stat = (String)hash.get("note_stat"); dm.rmks1 =
		 * (String)hash.get("rmks1"); dm.rmks2 = (String)hash.get("rmks2");
		 * dm.incmg_dt = (String)hash.get("incmg_dt"); dm.occr_slip_clsf =
		 * (String)hash.get("occr_slip_clsf"); dm.occr_slip =
		 * (String)hash.get("occr_slip");
		 *******************************************************************************************/

		/*******************************************************************************************
		 * dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		 * dm.slip_occr_dt =
		 * Util.getSessionParameterValue(req,"slip_occr_dt",true);
		 * dm.slip_clsf_cd =
		 * Util.getSessionParameterValue(req,"slip_clsf_cd",true); dm.slip_seq =
		 * Util.getSessionParameterValue(req,"slip_seq",true); dm.slip_sub_seq =
		 * Util.getSessionParameterValue(req,"slip_sub_seq",true);
		 * dm.clam_dept_cd =
		 * Util.getSessionParameterValue(req,"clam_dept_cd",true);
		 * dm.incmg_emp_no =
		 * Util.getSessionParameterValue(req,"incmg_emp_no",true); dm.fisc_dt =
		 * Util.getSessionParameterValue(req,"fisc_dt",true); dm.incmg_pers =
		 * Util.getSessionParameterValue(req,"incmg_pers",true);
		 * dm.incmg_pers_ipadd =
		 * Util.getSessionParameterValue(req,"incmg_pers_ipadd",true);
		 * dm.slip_arow_no =
		 * Util.getSessionParameterValue(req,"slip_arow_no",true); dm.budg_cd =
		 * Util.getSessionParameterValue(req,"budg_cd",true); dm.drcr_clsf =
		 * Util.getSessionParameterValue(req,"drcr_clsf",true); dm.dr_amt =
		 * Util.getSessionParameterValue(req,"dr_amt",true); dm.crdt_amt =
		 * Util.getSessionParameterValue(req,"crdt_amt",true); dm.intg_dlco_cd =
		 * Util.getSessionParameterValue(req,"intg_dlco_cd",true);
		 * dm.dlco_clsf_cd =
		 * Util.getSessionParameterValue(req,"dlco_clsf_cd",true); dm.dlco_cd =
		 * Util.getSessionParameterValue(req,"dlco_cd",true); dm.dlco_nm =
		 * Util.getSessionParameterValue(req,"dlco_nm",true); dm.boks_dlco_nm =
		 * Util.getSessionParameterValue(req,"boks_dlco_nm",true);
		 * dm.mang_clsf_cd =
		 * Util.getSessionParameterValue(req,"mang_clsf_cd",true); dm.mang_no =
		 * Util.getSessionParameterValue(req,"mang_no",true); dm.incm_clsf_cd =
		 * Util.getSessionParameterValue(req,"incm_clsf_cd",true); dm.medi_cd =
		 * Util.getSessionParameterValue(req,"medi_cd",true); dm.dtls_medi_cd =
		 * Util.getSessionParameterValue(req,"dtls_medi_cd",true); dm.evnt_cd =
		 * Util.getSessionParameterValue(req,"evnt_cd",true); dm.use_dept_cd =
		 * Util.getSessionParameterValue(req,"use_dept_cd",true); dm.comp_dt =
		 * Util.getSessionParameterValue(req,"comp_dt",true); dm.mtry_dt =
		 * Util.getSessionParameterValue(req,"mtry_dt",true); dm.bank_cd =
		 * Util.getSessionParameterValue(req,"bank_cd",true); dm.prop_equip_cd =
		 * Util.getSessionParameterValue(req,"prop_equip_cd",true); dm.unit =
		 * Util.getSessionParameterValue(req,"unit",true); dm.qunt =
		 * Util.getSessionParameterValue(req,"qunt",true); dm.tax_stmt_no =
		 * Util.getSessionParameterValue(req,"tax_stmt_no",true);
		 * dm.setoff_slip_occr_dt =
		 * Util.getSessionParameterValue(req,"setoff_slip_occr_dt",true);
		 * dm.setoff_slip_clsf_cd =
		 * Util.getSessionParameterValue(req,"setoff_slip_clsf_cd",true);
		 * dm.setoff_slip_seq =
		 * Util.getSessionParameterValue(req,"setoff_slip_seq",true);
		 * dm.setoff_slip_sub_seq =
		 * Util.getSessionParameterValue(req,"setoff_slip_sub_seq",true);
		 * dm.setoff_slip_arow_no =
		 * Util.getSessionParameterValue(req,"setoff_slip_arow_no",true);
		 * dm.obj_acct_cd =
		 * Util.getSessionParameterValue(req,"obj_acct_cd",true); dm.obj_dt =
		 * Util.getSessionParameterValue(req,"obj_dt",true); dm.obj_amt =
		 * Util.getSessionParameterValue(req,"obj_amt",true); dm.frcr_clsf_cd =
		 * Util.getSessionParameterValue(req,"frcr_clsf_cd",true); dm.frcr_amt =
		 * Util.getSessionParameterValue(req,"frcr_amt",true); dm.exrate =
		 * Util.getSessionParameterValue(req,"exrate",true); dm.note_stat =
		 * Util.getSessionParameterValue(req,"note_stat",true); dm.rmks1 =
		 * Util.getSessionParameterValue(req,"rmks1",true); dm.rmks2 =
		 * Util.getSessionParameterValue(req,"rmks2",true); dm.incmg_dt =
		 * Util.getSessionParameterValue(req,"incmg_dt",true); dm.occr_slip_clsf
		 * = Util.getSessionParameterValue(req,"occr_slip_clsf",true);
		 * dm.occr_slip = Util.getSessionParameterValue(req,"occr_slip",true);
		 *******************************************************************************************/
	}

	public void fc_acct_2255_d(HttpServletRequest req, HttpServletResponse res)
			throws AppException, SQLException {
		FC_ACCT_2255_DDataSet ds = null;
		FC_ACCT_2255_DDM dm = new FC_ACCT_2255_DDM();

		dm.cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
		dm.slip_occr_dt = Util.checkString(req.getParameter("slip_occr_dt"));
		dm.slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
		dm.slip_seq = Util.checkString(req.getParameter("slip_seq"));
		dm.slip_sub_seq = Util.checkString(req.getParameter("slip_sub_seq"));
		dm.incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		dm.in_sicsgb = Util.checkString(req.getParameter("in_sicsgb"));

		dm.print();

		/* EJB 수정후 시작 */
		ds = dao.fc_acct_2255_d(dm);

		if (!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/*
		 * EJB 수정전 시작 try { FC_ACCT_2000EJBHome home =
		 * (FC_ACCT_2000EJBHome)JNDIManager
		 * .getInstance().getHome("FC_ACCT_2000EJB"); FC_ACCT_2000EJB ejb =
		 * home.create();
		 * 
		 * ds = ejb.fc_acct_2255_d(dm); req.setAttribute("ds", ds); } catch
		 * (CreateException e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } catch (RemoteException
		 * e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } EJB 수정전 끝
		 */

		/*******************************************************************************************
		 * String multiUpdateData =
		 * Util.checkString(req.getParameter("multiUpdateData")); Hashtable hash
		 * = getHashMultiUpdateData(multiUpdateData);
		 * 
		 * dm.cmpy_cd = (String)hash.get("cmpy_cd"); dm.slip_occr_dt =
		 * (String)hash.get("slip_occr_dt"); dm.slip_clsf_cd =
		 * (String)hash.get("slip_clsf_cd"); dm.slip_seq =
		 * (String)hash.get("slip_seq"); dm.slip_sub_seq =
		 * (String)hash.get("slip_sub_seq"); dm.incmg_pers =
		 * (String)hash.get("incmg_pers"); dm.incmg_pers_ipadd =
		 * (String)hash.get("incmg_pers_ipadd"); dm.in_sicsgb =
		 * (String)hash.get("in_sicsgb");
		 *******************************************************************************************/

		/*******************************************************************************************
		 * dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		 * dm.slip_occr_dt =
		 * Util.getSessionParameterValue(req,"slip_occr_dt",true);
		 * dm.slip_clsf_cd =
		 * Util.getSessionParameterValue(req,"slip_clsf_cd",true); dm.slip_seq =
		 * Util.getSessionParameterValue(req,"slip_seq",true); dm.slip_sub_seq =
		 * Util.getSessionParameterValue(req,"slip_sub_seq",true); dm.incmg_pers
		 * = Util.getSessionParameterValue(req,"incmg_pers",true);
		 * dm.incmg_pers_ipadd =
		 * Util.getSessionParameterValue(req,"incmg_pers_ipadd",true);
		 * dm.in_sicsgb = Util.getSessionParameterValue(req,"in_sicsgb",true);
		 *******************************************************************************************/
	}

	public void fc_acct_2260_m(HttpServletRequest req, HttpServletResponse res)
			throws AppException, SQLException {
		FC_ACCT_2260_MDataSet ds = null;
		FC_ACCT_2260_MDM dm = new FC_ACCT_2260_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);

		dm.print();

		/* EJB 수정후 시작 */
		ds = dao.fc_acct_2260_m(dm);

		if (!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/*
		 * EJB 수정전 시작 try { FC_ACCT_2000EJBHome home =
		 * (FC_ACCT_2000EJBHome)JNDIManager
		 * .getInstance().getHome("FC_ACCT_2000EJB"); FC_ACCT_2000EJB ejb =
		 * home.create();
		 * 
		 * ds = ejb.fc_acct_2260_m(dm); req.setAttribute("ds", ds); } catch
		 * (CreateException e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } catch (RemoteException
		 * e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } EJB 수정전 끝
		 */

		/*******************************************************************************************
		 * String multiUpdateData =
		 * Util.checkString(req.getParameter("multiUpdateData")); Hashtable hash
		 * = getHashMultiUpdateData(multiUpdateData);
		 * 
		 * dm.cmpy_cd = (String)hash.get("cmpy_cd");
		 *******************************************************************************************/

		/*******************************************************************************************
		 * dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		 *******************************************************************************************/
	}

	public void fc_acct_2261_p(HttpServletRequest req, HttpServletResponse res)
			throws AppException, SQLException {
		FC_ACCT_2261_PDataSet ds = null;
		FC_ACCT_2261_PDM dm = new FC_ACCT_2261_PDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.cd = Util.checkString(req.getParameter("cd"));

		dm.print();

		/* EJB 수정후 시작 */
		ds = dao.fc_acct_2261_p(dm);

		if (!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/*
		 * EJB 수정전 시작 try { FC_ACCT_2000EJBHome home =
		 * (FC_ACCT_2000EJBHome)JNDIManager
		 * .getInstance().getHome("FC_ACCT_2000EJB"); FC_ACCT_2000EJB ejb =
		 * home.create();
		 * 
		 * ds = ejb.fc_acct_2261_p(dm); req.setAttribute("ds", ds); } catch
		 * (CreateException e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } catch (RemoteException
		 * e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } EJB 수정전 끝
		 */

		/*******************************************************************************************
		 * String multiUpdateData =
		 * Util.checkString(req.getParameter("multiUpdateData")); Hashtable hash
		 * = getHashMultiUpdateData(multiUpdateData);
		 * 
		 * dm.cmpy_cd = (String)hash.get("cmpy_cd"); dm.cd =
		 * (String)hash.get("cd");
		 *******************************************************************************************/

		/*******************************************************************************************
		 * dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true); dm.cd
		 * = Util.getSessionParameterValue(req,"cd",true);
		 *******************************************************************************************/
	}

	public void fc_acct_2263_i(HttpServletRequest req, HttpServletResponse res)
			throws AppException, SQLException {
		FC_ACCT_2263_IDataSet ds = null;
		FC_ACCT_2263_IDM dm = new FC_ACCT_2263_IDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.slip_occr_dt = Util.checkString(req.getParameter("slip_occr_dt"));
		dm.slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
		dm.slip_seqfr = Util.checkString(req.getParameter("slip_seqfr"));
		dm.slip_seqto = Util.checkString(req.getParameter("slip_seqto"));
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		dm.clgbcd = Util.checkString(req.getParameter("clgbcd"));

		dm.print();

		/* EJB 수정후 시작 */
		ds = dao.fc_acct_2263_i(dm);

		if (!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/*
		 * EJB 수정전 시작 try { FC_ACCT_2000EJBHome home =
		 * (FC_ACCT_2000EJBHome)JNDIManager
		 * .getInstance().getHome("FC_ACCT_2000EJB"); FC_ACCT_2000EJB ejb =
		 * home.create();
		 * 
		 * ds = ejb.fc_acct_2263_i(dm); req.setAttribute("ds", ds); } catch
		 * (CreateException e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } catch (RemoteException
		 * e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } EJB 수정전 끝
		 */

		/*******************************************************************************************
		 * String multiUpdateData =
		 * Util.checkString(req.getParameter("multiUpdateData")); Hashtable hash
		 * = getHashMultiUpdateData(multiUpdateData);
		 * 
		 * dm.cmpy_cd = (String)hash.get("cmpy_cd"); dm.slip_occr_dt =
		 * (String)hash.get("slip_occr_dt"); dm.slip_clsf_cd =
		 * (String)hash.get("slip_clsf_cd"); dm.slip_seqfr =
		 * (String)hash.get("slip_seqfr"); dm.slip_seqto =
		 * (String)hash.get("slip_seqto"); dm.incmg_pers =
		 * (String)hash.get("incmg_pers"); dm.incmg_pers_ipadd =
		 * (String)hash.get("incmg_pers_ipadd"); dm.clgbcd =
		 * (String)hash.get("clgbcd");
		 *******************************************************************************************/

		/*******************************************************************************************
		 * dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		 * dm.slip_occr_dt =
		 * Util.getSessionParameterValue(req,"slip_occr_dt",true);
		 * dm.slip_clsf_cd =
		 * Util.getSessionParameterValue(req,"slip_clsf_cd",true); dm.slip_seqfr
		 * = Util.getSessionParameterValue(req,"slip_seqfr",true); dm.slip_seqto
		 * = Util.getSessionParameterValue(req,"slip_seqto",true); dm.incmg_pers
		 * = Util.getSessionParameterValue(req,"incmg_pers",true);
		 * dm.incmg_pers_ipadd =
		 * Util.getSessionParameterValue(req,"incmg_pers_ipadd",true); dm.clgbcd
		 * = Util.getSessionParameterValue(req,"clgbcd",true);
		 *******************************************************************************************/
	}

	public void fc_acct_2270_m(HttpServletRequest req, HttpServletResponse res)
			throws AppException, SQLException {
		FC_ACCT_2270_MDataSet ds = null;
		FC_ACCT_2270_MDM dm = new FC_ACCT_2270_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);

		dm.print();

		/* EJB 수정후 시작 */
		ds = dao.fc_acct_2270_m(dm);

		if (!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/*
		 * EJB 수정전 시작 try { FC_ACCT_2000EJBHome home =
		 * (FC_ACCT_2000EJBHome)JNDIManager
		 * .getInstance().getHome("FC_ACCT_2000EJB"); FC_ACCT_2000EJB ejb =
		 * home.create();
		 * 
		 * ds = ejb.fc_acct_2270_m(dm); req.setAttribute("ds", ds); } catch
		 * (CreateException e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } catch (RemoteException
		 * e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } EJB 수정전 끝
		 */

		/*******************************************************************************************
		 * String multiUpdateData =
		 * Util.checkString(req.getParameter("multiUpdateData")); Hashtable hash
		 * = getHashMultiUpdateData(multiUpdateData);
		 * 
		 * dm.cmpy_cd = (String)hash.get("cmpy_cd");
		 *******************************************************************************************/

		/*******************************************************************************************
		 * dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		 *******************************************************************************************/
	}

	public void fc_acct_2272_s(HttpServletRequest req, HttpServletResponse res)
			throws AppException, SQLException {
		FC_ACCT_2272_SDataSet ds = null;
		FC_ACCT_2272_SDM dm = new FC_ACCT_2272_SDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.slip_occr_dt = Util.checkString(req.getParameter("slip_occr_dt"));
		dm.slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
		dm.slip_seqfr = Util.checkString(req.getParameter("slip_seqfr"));
		dm.slip_seqto = Util.checkString(req.getParameter("slip_seqto"));

		dm.print();

		/* EJB 수정후 시작 */
		ds = dao.fc_acct_2272_s(dm);

		if (!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/*
		 * EJB 수정전 시작 try { FC_ACCT_2000EJBHome home =
		 * (FC_ACCT_2000EJBHome)JNDIManager
		 * .getInstance().getHome("FC_ACCT_2000EJB"); FC_ACCT_2000EJB ejb =
		 * home.create();
		 * 
		 * ds = ejb.fc_acct_2272_s(dm); req.setAttribute("ds", ds); } catch
		 * (CreateException e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } catch (RemoteException
		 * e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } EJB 수정전 끝
		 */

		/*******************************************************************************************
		 * String multiUpdateData =
		 * Util.checkString(req.getParameter("multiUpdateData")); Hashtable hash
		 * = getHashMultiUpdateData(multiUpdateData);
		 * 
		 * dm.cmpy_cd = (String)hash.get("cmpy_cd"); dm.slip_occr_dt =
		 * (String)hash.get("slip_occr_dt"); dm.slip_clsf_cd =
		 * (String)hash.get("slip_clsf_cd"); dm.slip_seqfr =
		 * (String)hash.get("slip_seqfr"); dm.slip_seqto =
		 * (String)hash.get("slip_seqto");
		 *******************************************************************************************/

		/*******************************************************************************************
		 * dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		 * dm.slip_occr_dt =
		 * Util.getSessionParameterValue(req,"slip_occr_dt",true);
		 * dm.slip_clsf_cd =
		 * Util.getSessionParameterValue(req,"slip_clsf_cd",true); dm.slip_seqfr
		 * = Util.getSessionParameterValue(req,"slip_seqfr",true); dm.slip_seqto
		 * = Util.getSessionParameterValue(req,"slip_seqto",true);
		 *******************************************************************************************/
	}

	public void fc_acct_2280_m(HttpServletRequest req, HttpServletResponse res)
			throws AppException, SQLException {
		FC_ACCT_2280_MDataSet ds = null;
		FC_ACCT_2280_MDM dm = new FC_ACCT_2280_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);

		dm.print();

		/* EJB 수정후 시작 */
		ds = dao.fc_acct_2280_m(dm);

		if (!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/*
		 * EJB 수정전 시작 try { FC_ACCT_2000EJBHome home =
		 * (FC_ACCT_2000EJBHome)JNDIManager
		 * .getInstance().getHome("FC_ACCT_2000EJB"); FC_ACCT_2000EJB ejb =
		 * home.create();
		 * 
		 * ds = ejb.fc_acct_2280_m(dm); req.setAttribute("ds", ds); } catch
		 * (CreateException e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } catch (RemoteException
		 * e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } EJB 수정전 끝
		 */
	}

	public void fc_acct_2281_l(HttpServletRequest req, HttpServletResponse res)
			throws AppException, SQLException {
		FC_ACCT_2281_LDataSet ds = null;
		FC_ACCT_2281_LDM dm = new FC_ACCT_2281_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.slip_flag = Util.checkString(req.getParameter("slip_flag"));
		dm.incmg_dt = Util.checkString(req.getParameter("incmg_dt"));
		dm.slip_occr_dt = Util.checkString(req.getParameter("slip_occr_dt"));
		dm.slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
		dm.slip_seq = Util.checkString(req.getParameter("slip_seq"));
		dm.slip_sub_seq = Util.checkString(req.getParameter("slip_sub_seq"));

		dm.print();

		/* EJB 수정후 시작 */
		ds = dao.fc_acct_2281_l(dm);

		if (!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/*
		 * EJB 수정전 시작 try { FC_ACCT_2000EJBHome home =
		 * (FC_ACCT_2000EJBHome)JNDIManager
		 * .getInstance().getHome("FC_ACCT_2000EJB"); FC_ACCT_2000EJB ejb =
		 * home.create();
		 * 
		 * ds = ejb.fc_acct_2281_l(dm); req.setAttribute("ds", ds); } catch
		 * (CreateException e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } catch (RemoteException
		 * e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } EJB 수정전 끝
		 */
	}

	public void fc_acct_2282_s(HttpServletRequest req, HttpServletResponse res)
			throws AppException, SQLException {
		FC_ACCT_2282_SDataSet ds = null;
		FC_ACCT_2282_SDM dm = new FC_ACCT_2282_SDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_dt = Util.checkString(req.getParameter("incmg_dt"));

		dm.print();

		/* EJB 수정후 시작 */
		ds = dao.fc_acct_2282_s(dm);

		if (!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/*
		 * EJB 수정전 시작 try { FC_ACCT_2000EJBHome home =
		 * (FC_ACCT_2000EJBHome)JNDIManager
		 * .getInstance().getHome("FC_ACCT_2000EJB"); FC_ACCT_2000EJB ejb =
		 * home.create();
		 * 
		 * ds = ejb.fc_acct_2282_s(dm); req.setAttribute("ds", ds); } catch
		 * (CreateException e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } catch (RemoteException
		 * e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } EJB 수정전 끝
		 */
	}

	public void fc_acct_2283_i(HttpServletRequest req, HttpServletResponse res)
			throws AppException, SQLException {
		FC_ACCT_2283_IDataSet ds = null;
		FC_ACCT_2283_IDM dm = new FC_ACCT_2283_IDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.slip_occr_dt = Util.checkString(req.getParameter("slip_occr_dt"));
		dm.slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
		dm.fisc_dt = Util.checkString(req.getParameter("fisc_dt"));
		dm.rmks1 = Util.checkString(req.getParameter("rmks1"));
		dm.work_flag = Util.checkString(req.getParameter("work_flag"));
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.incmg_pers_ipadd = req.getRemoteAddr();

		String multiUpdateData = Util.checkString(req
				.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);
		dm.grid1_mode = (String) hash.get("m");
		dm.grid1_rownum = (String) hash.get("rownum");
		dm.grid1_drcr_clsf_cd = (String) hash.get("drcr_clsf_cd");
		dm.grid1_budg_cd = (String) hash.get("budg_cd");
		dm.grid1_mang_clsf_cd = (String) hash.get("mang_clsf_cd");
		dm.grid1_dr_amt = (String) hash.get("dr_amt");
		dm.grid1_crdt_amt = (String) hash.get("crdt_amt");
		dm.grid1_rmks2 = (String) hash.get("rmks2");
		dm.grid1_dlco_clsf_cd = (String) hash.get("dlco_clsf_cd");
		dm.grid1_dlco_cd = (String) hash.get("dlco_cd");
		dm.grid1_dlco_nm = (String) hash.get("dlco_nm");
		dm.grid1_boks_dlco_nm = (String) hash.get("boks_dlco_nm");

		dm.print();

		/* EJB 수정후 시작 */
		ds = dao.fc_acct_2283_i(dm);

		if (!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/*
		 * EJB 수정전 시작 try { FC_ACCT_2000EJBHome home =
		 * (FC_ACCT_2000EJBHome)JNDIManager
		 * .getInstance().getHome("FC_ACCT_2000EJB"); FC_ACCT_2000EJB ejb =
		 * home.create();
		 * 
		 * ds = ejb.fc_acct_2283_i(dm); req.setAttribute("ds", ds); } catch
		 * (CreateException e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } catch (RemoteException
		 * e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } EJB 수정전 끝
		 */

		/*******************************************************************************************
		 * String multiUpdateData =
		 * Util.checkString(req.getParameter("multiUpdateData")); Hashtable hash
		 * = getHashMultiUpdateData(multiUpdateData);
		 * 
		 * dm.cmpy_cd = (String)hash.get("cmpy_cd"); dm.slip_occr_dt =
		 * (String)hash.get("slip_occr_dt"); dm.slip_clsf_cd =
		 * (String)hash.get("slip_clsf_cd"); dm.fisc_dt =
		 * (String)hash.get("fisc_dt"); dm.rmks1 = (String)hash.get("rmks1");
		 * dm.work_flag = (String)hash.get("work_flag"); dm.incmg_pers =
		 * (String)hash.get("incmg_pers"); dm.incmg_pers_ipadd =
		 * (String)hash.get("incmg_pers_ipadd"); dm.grid1_mode =
		 * (String)hash.get("grid1_mode"); dm.grid1_rownum =
		 * (String)hash.get("grid1_rownum"); dm.grid1_drcr_clsf_cd =
		 * (String)hash.get("grid1_drcr_clsf_cd"); dm.grid1_budg_cd =
		 * (String)hash.get("grid1_budg_cd"); dm.grid1_mang_clsf_cd =
		 * (String)hash.get("grid1_mang_clsf_cd"); dm.grid1_dr_amt =
		 * (String)hash.get("grid1_dr_amt"); dm.grid1_crdt_amt =
		 * (String)hash.get("grid1_crdt_amt"); dm.grid1_rmks2 =
		 * (String)hash.get("grid1_rmks2"); dm.grid1_dlco_clsf_cd =
		 * (String)hash.get("grid1_dlco_clsf_cd"); dm.grid1_dlco_cd =
		 * (String)hash.get("grid1_dlco_cd"); dm.grid1_dlco_nm =
		 * (String)hash.get("grid1_dlco_nm"); dm.grid1_boks_dlco_nm =
		 * (String)hash.get("grid1_boks_dlco_nm");
		 *******************************************************************************************/

		/*******************************************************************************************
		 * dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		 * dm.slip_occr_dt =
		 * Util.getSessionParameterValue(req,"slip_occr_dt",true);
		 * dm.slip_clsf_cd =
		 * Util.getSessionParameterValue(req,"slip_clsf_cd",true); dm.fisc_dt =
		 * Util.getSessionParameterValue(req,"fisc_dt",true); dm.rmks1 =
		 * Util.getSessionParameterValue(req,"rmks1",true); dm.work_flag =
		 * Util.getSessionParameterValue(req,"work_flag",true); dm.incmg_pers =
		 * Util.getSessionParameterValue(req,"incmg_pers",true);
		 * dm.incmg_pers_ipadd =
		 * Util.getSessionParameterValue(req,"incmg_pers_ipadd",true);
		 * dm.grid1_mode = Util.getSessionParameterValue(req,"grid1_mode",true);
		 * dm.grid1_rownum =
		 * Util.getSessionParameterValue(req,"grid1_rownum",true);
		 * dm.grid1_drcr_clsf_cd =
		 * Util.getSessionParameterValue(req,"grid1_drcr_clsf_cd",true);
		 * dm.grid1_budg_cd =
		 * Util.getSessionParameterValue(req,"grid1_budg_cd",true);
		 * dm.grid1_mang_clsf_cd =
		 * Util.getSessionParameterValue(req,"grid1_mang_clsf_cd",true);
		 * dm.grid1_dr_amt =
		 * Util.getSessionParameterValue(req,"grid1_dr_amt",true);
		 * dm.grid1_crdt_amt =
		 * Util.getSessionParameterValue(req,"grid1_crdt_amt",true);
		 * dm.grid1_rmks2 =
		 * Util.getSessionParameterValue(req,"grid1_rmks2",true);
		 * dm.grid1_dlco_clsf_cd =
		 * Util.getSessionParameterValue(req,"grid1_dlco_clsf_cd",true);
		 * dm.grid1_dlco_cd =
		 * Util.getSessionParameterValue(req,"grid1_dlco_cd",true);
		 * dm.grid1_dlco_nm =
		 * Util.getSessionParameterValue(req,"grid1_dlco_nm",true);
		 * dm.grid1_boks_dlco_nm =
		 * Util.getSessionParameterValue(req,"grid1_boks_dlco_nm",true);
		 *******************************************************************************************/
	}

	public void fc_acct_2284_d(HttpServletRequest req, HttpServletResponse res)
			throws AppException, SQLException {
		FC_ACCT_2284_DDataSet ds = null;
		FC_ACCT_2284_DDM dm = new FC_ACCT_2284_DDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.slip_occr_dt = Util.checkString(req.getParameter("slip_occr_dt"));
		dm.slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
		dm.slip_seq = Util.checkString(req.getParameter("slip_seq"));
		dm.work_flag = Util.checkString(req.getParameter("work_flag"));
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.incmg_pers_ipadd = req.getRemoteAddr();

		dm.print();

		ds = dao.fc_acct_2284_d(dm);
		
		if (!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}		
		
		req.setAttribute("ds", ds);
		
		/*
		try {
			FC_ACCT_2000EJBHome home = (FC_ACCT_2000EJBHome) JNDIManager
					.getInstance().getHome("FC_ACCT_2000EJB");
			FC_ACCT_2000EJB ejb = home.create();

			ds = ejb.fc_acct_2284_d(dm);
			req.setAttribute("ds", ds);
		} catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		} catch (RemoteException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		*/
	}

	public void fc_acct_2285_a(HttpServletRequest req, HttpServletResponse res)
			throws AppException, SQLException {
		FC_ACCT_2285_ADataSet ds = null;
		FC_ACCT_2285_ADM dm = new FC_ACCT_2285_ADM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_dt = Util.checkString(req.getParameter("incmg_dt"));
		dm.work_flag = Util.checkString(req.getParameter("work_flag"));
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.incmg_pers_ipadd = req.getRemoteAddr();

		dm.print();

		/* EJB 수정후 시작 */
		ds = dao.fc_acct_2285_a(dm);

		if (!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/*
		 * EJB 수정전 시작 try { FC_ACCT_2000EJBHome home =
		 * (FC_ACCT_2000EJBHome)JNDIManager
		 * .getInstance().getHome("FC_ACCT_2000EJB"); FC_ACCT_2000EJB ejb =
		 * home.create();
		 * 
		 * ds = ejb.fc_acct_2285_a(dm); req.setAttribute("ds", ds); } catch
		 * (CreateException e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } catch (RemoteException
		 * e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } EJB 수정전 끝
		 */
	}

	public void fc_acct_2290_m(HttpServletRequest req, HttpServletResponse res)
			throws AppException, SQLException {
		FC_ACCT_2290_MDataSet ds = null;
		FC_ACCT_2290_MDM dm = new FC_ACCT_2290_MDM();

		dm.cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
		dm.budg_cd = Util.checkString(req.getParameter("budg_cd"));

		dm.print();

		/* EJB 수정후 시작 */
		ds = dao.fc_acct_2290_m(dm);

		if (!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/*
		 * EJB 수정전 시작 try { FC_ACCT_2000EJBHome home =
		 * (FC_ACCT_2000EJBHome)JNDIManager
		 * .getInstance().getHome("FC_ACCT_2000EJB"); FC_ACCT_2000EJB ejb =
		 * home.create();
		 * 
		 * ds = ejb.fc_acct_2290_m(dm); req.setAttribute("ds", ds); } catch
		 * (CreateException e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } catch (RemoteException
		 * e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } EJB 수정전 끝
		 */

		/*******************************************************************************************
		 * String multiUpdateData =
		 * Util.checkString(req.getParameter("multiUpdateData")); Hashtable hash
		 * = getHashMultiUpdateData(multiUpdateData);
		 * 
		 * dm.cmpy_cd = (String)hash.get("cmpy_cd");
		 *******************************************************************************************/

		/*******************************************************************************************
		 * dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		 *******************************************************************************************/
	}

	public void fc_acct_2291_s(HttpServletRequest req, HttpServletResponse res)
			throws AppException, SQLException {
		FC_ACCT_2291_SDataSet ds = null;
		FC_ACCT_2291_SDM dm = new FC_ACCT_2291_SDM();

		dm.cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
		dm.budg_cd = Util.checkString(req.getParameter("budg_cd"));

		dm.print();

		/* EJB 수정후 시작 */
		ds = dao.fc_acct_2291_s(dm);

		if (!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/*
		 * EJB 수정전 시작 try { FC_ACCT_2000EJBHome home =
		 * (FC_ACCT_2000EJBHome)JNDIManager
		 * .getInstance().getHome("FC_ACCT_2000EJB"); FC_ACCT_2000EJB ejb =
		 * home.create();
		 * 
		 * ds = ejb.fc_acct_2291_s(dm); req.setAttribute("ds", ds); } catch
		 * (CreateException e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } catch (RemoteException
		 * e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } EJB 수정전 끝
		 */

		/*******************************************************************************************
		 * String multiUpdateData =
		 * Util.checkString(req.getParameter("multiUpdateData")); Hashtable hash
		 * = getHashMultiUpdateData(multiUpdateData);
		 * 
		 * dm.cmpy_cd = (String)hash.get("cmpy_cd"); dm.budg_cd =
		 * (String)hash.get("budg_cd");
		 *******************************************************************************************/

		/*******************************************************************************************
		 * dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		 * dm.budg_cd = Util.getSessionParameterValue(req,"budg_cd",true);
		 *******************************************************************************************/
	}

	public void fc_acct_2292_s(HttpServletRequest req, HttpServletResponse res)
			throws AppException, SQLException {
		FC_ACCT_2292_SDataSet ds = null;
		FC_ACCT_2292_SDM dm = new FC_ACCT_2292_SDM();

		dm.cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
		dm.budg_cd = Util.checkString(req.getParameter("budg_cd"));

		dm.print();

		/* EJB 수정후 시작 */
		ds = dao.fc_acct_2292_s(dm);

		if (!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/*
		 * EJB 수정전 시작 try { FC_ACCT_2000EJBHome home =
		 * (FC_ACCT_2000EJBHome)JNDIManager
		 * .getInstance().getHome("FC_ACCT_2000EJB"); FC_ACCT_2000EJB ejb =
		 * home.create();
		 * 
		 * ds = ejb.fc_acct_2292_s(dm); req.setAttribute("ds", ds); } catch
		 * (CreateException e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } catch (RemoteException
		 * e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } EJB 수정전 끝
		 */

		/*******************************************************************************************
		 * String multiUpdateData =
		 * Util.checkString(req.getParameter("multiUpdateData")); Hashtable hash
		 * = getHashMultiUpdateData(multiUpdateData);
		 * 
		 * dm.cmpy_cd = (String)hash.get("cmpy_cd"); dm.budg_cd =
		 * (String)hash.get("budg_cd");
		 *******************************************************************************************/

		/*******************************************************************************************
		 * dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		 * dm.budg_cd = Util.getSessionParameterValue(req,"budg_cd",true);
		 *******************************************************************************************/
	}

	public void fc_acct_2293_s(HttpServletRequest req, HttpServletResponse res)
			throws AppException, SQLException {
		FC_ACCT_2293_SDataSet ds = null;
		FC_ACCT_2293_SDM dm = new FC_ACCT_2293_SDM();

		dm.cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
		dm.budg_cd = Util.checkString(req.getParameter("budg_cd"));

		dm.print();

		/* EJB 수정후 시작 */
		ds = dao.fc_acct_2293_s(dm);

		if (!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/*
		 * EJB 수정전 시작 try { FC_ACCT_2000EJBHome home =
		 * (FC_ACCT_2000EJBHome)JNDIManager
		 * .getInstance().getHome("FC_ACCT_2000EJB"); FC_ACCT_2000EJB ejb =
		 * home.create();
		 * 
		 * ds = ejb.fc_acct_2293_s(dm); req.setAttribute("ds", ds); } catch
		 * (CreateException e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } catch (RemoteException
		 * e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } EJB 수정전 끝
		 */

		/*******************************************************************************************
		 * String multiUpdateData =
		 * Util.checkString(req.getParameter("multiUpdateData")); Hashtable hash
		 * = getHashMultiUpdateData(multiUpdateData);
		 * 
		 * dm.cmpy_cd = (String)hash.get("cmpy_cd"); dm.budg_cd =
		 * (String)hash.get("budg_cd");
		 *******************************************************************************************/

		/*******************************************************************************************
		 * dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		 * dm.budg_cd = Util.getSessionParameterValue(req,"budg_cd",true);
		 *******************************************************************************************/
	}

	public void fc_acct_2340_m(HttpServletRequest req, HttpServletResponse res)
			throws AppException, SQLException {
		FC_ACCT_2340_MDataSet ds = null;
		FC_ACCT_2340_MDM dm = new FC_ACCT_2340_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);

		dm.print();

		/* EJB 수정후 시작 */
		ds = dao.fc_acct_2340_m(dm);

		if (!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/*
		 * EJB 수정전 시작 try { FC_ACCT_2000EJBHome home =
		 * (FC_ACCT_2000EJBHome)JNDIManager
		 * .getInstance().getHome("FC_ACCT_2000EJB"); FC_ACCT_2000EJB ejb =
		 * home.create();
		 * 
		 * ds = ejb.fc_acct_2340_m(dm); req.setAttribute("ds", ds); } catch
		 * (CreateException e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } catch (RemoteException
		 * e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } EJB 수정전 끝
		 */

		/*******************************************************************************************
		 * String multiUpdateData =
		 * Util.checkString(req.getParameter("multiUpdateData")); Hashtable hash
		 * = getHashMultiUpdateData(multiUpdateData);
		 * 
		 * dm.cmpy_cd = (String)hash.get("cmpy_cd");
		 *******************************************************************************************/

		/*******************************************************************************************
		 * dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		 *******************************************************************************************/
	}

	public void fc_acct_2341_l(HttpServletRequest req, HttpServletResponse res)
			throws AppException, SQLException {
		FC_ACCT_2341_LDataSet ds = null;
		FC_ACCT_2341_LDM dm = new FC_ACCT_2341_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.slip_occr_dt = Util.checkString(req.getParameter("slip_occr_dt"));
		dm.slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
		dm.slip_seq = Util.checkString(req.getParameter("slip_seq"));
		dm.slip_sub_seq = Util.checkString(req.getParameter("slip_sub_seq"));

		dm.print();

		/* EJB 수정후 시작 */
		ds = dao.fc_acct_2341_l(dm);

		if (!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/*
		 * EJB 수정전 시작 try { FC_ACCT_2000EJBHome home =
		 * (FC_ACCT_2000EJBHome)JNDIManager
		 * .getInstance().getHome("FC_ACCT_2000EJB"); FC_ACCT_2000EJB ejb =
		 * home.create();
		 * 
		 * ds = ejb.fc_acct_2341_l(dm); req.setAttribute("ds", ds); } catch
		 * (CreateException e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } catch (RemoteException
		 * e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } EJB 수정전 끝
		 */

		/*******************************************************************************************
		 * String multiUpdateData =
		 * Util.checkString(req.getParameter("multiUpdateData")); Hashtable hash
		 * = getHashMultiUpdateData(multiUpdateData);
		 * 
		 * dm.cmpy_cd = (String)hash.get("cmpy_cd"); dm.slip_occr_dt =
		 * (String)hash.get("slip_occr_dt"); dm.slip_clsf_cd =
		 * (String)hash.get("slip_clsf_cd"); dm.slip_seq =
		 * (String)hash.get("slip_seq"); dm.slip_sub_seq =
		 * (String)hash.get("slip_sub_seq");
		 *******************************************************************************************/

		/*******************************************************************************************
		 * dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		 * dm.slip_occr_dt =
		 * Util.getSessionParameterValue(req,"slip_occr_dt",true);
		 * dm.slip_clsf_cd =
		 * Util.getSessionParameterValue(req,"slip_clsf_cd",true); dm.slip_seq =
		 * Util.getSessionParameterValue(req,"slip_seq",true); dm.slip_sub_seq =
		 * Util.getSessionParameterValue(req,"slip_sub_seq",true);
		 *******************************************************************************************/
	}

	public void fc_acct_2342_l(HttpServletRequest req, HttpServletResponse res)
			throws AppException, SQLException {
		FC_ACCT_2342_LDataSet ds = null;
		FC_ACCT_2342_LDM dm = new FC_ACCT_2342_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.slip_occr_dt = Util.checkString(req.getParameter("slip_occr_dt"));
		dm.slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
		dm.slip_seq = Util.checkString(req.getParameter("slip_seq"));
		dm.slip_sub_seq = Util.checkString(req.getParameter("slip_sub_seq"));

		dm.print();

		/* EJB 수정후 시작 */
		ds = dao.fc_acct_2342_l(dm);


		if (!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/*
		 * EJB 수정전 시작 try { FC_ACCT_2000EJBHome home =
		 * (FC_ACCT_2000EJBHome)JNDIManager
		 * .getInstance().getHome("FC_ACCT_2000EJB"); FC_ACCT_2000EJB ejb =
		 * home.create();
		 * 
		 * ds = ejb.fc_acct_2342_l(dm); req.setAttribute("ds", ds); } catch
		 * (CreateException e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } catch (RemoteException
		 * e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } EJB 수정전 끝
		 */

		/*******************************************************************************************
		 * String multiUpdateData =
		 * Util.checkString(req.getParameter("multiUpdateData")); Hashtable hash
		 * = getHashMultiUpdateData(multiUpdateData);
		 * 
		 * dm.cmpy_cd = (String)hash.get("cmpy_cd"); dm.slip_occr_dt =
		 * (String)hash.get("slip_occr_dt"); dm.slip_clsf_cd =
		 * (String)hash.get("slip_clsf_cd"); dm.slip_seq =
		 * (String)hash.get("slip_seq"); dm.slip_sub_seq =
		 * (String)hash.get("slip_sub_seq");
		 *******************************************************************************************/

		/*******************************************************************************************
		 * dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		 * dm.slip_occr_dt =
		 * Util.getSessionParameterValue(req,"slip_occr_dt",true);
		 * dm.slip_clsf_cd =
		 * Util.getSessionParameterValue(req,"slip_clsf_cd",true); dm.slip_seq =
		 * Util.getSessionParameterValue(req,"slip_seq",true); dm.slip_sub_seq =
		 * Util.getSessionParameterValue(req,"slip_sub_seq",true);
		 *******************************************************************************************/
	}

	public void fc_acct_2343_l(HttpServletRequest req, HttpServletResponse res)
			throws AppException, SQLException {
		FC_ACCT_2343_LDataSet ds = null;
		FC_ACCT_2343_LDM dm = new FC_ACCT_2343_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.slip_occr_dt = Util.checkString(req.getParameter("slip_occr_dt"));
		dm.slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
		dm.slip_seq = Util.checkString(req.getParameter("slip_seq"));

		dm.print();

		/* EJB 수정후 시작 */
		ds = dao.fc_acct_2343_l(dm);

		if (!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/*
		 * EJB 수정전 시작 try { FC_ACCT_2000EJBHome home =
		 * (FC_ACCT_2000EJBHome)JNDIManager
		 * .getInstance().getHome("FC_ACCT_2000EJB"); FC_ACCT_2000EJB ejb =
		 * home.create();
		 * 
		 * ds = ejb.fc_acct_2343_l(dm); req.setAttribute("ds", ds); } catch
		 * (CreateException e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } catch (RemoteException
		 * e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } EJB 수정전 끝
		 */

		/*******************************************************************************************
		 * String multiUpdateData =
		 * Util.checkString(req.getParameter("multiUpdateData")); Hashtable hash
		 * = getHashMultiUpdateData(multiUpdateData);
		 * 
		 * dm.cmpy_cd = (String)hash.get("cmpy_cd"); dm.slip_occr_dt =
		 * (String)hash.get("slip_occr_dt"); dm.slip_clsf_cd =
		 * (String)hash.get("slip_clsf_cd"); dm.slip_seq =
		 * (String)hash.get("slip_seq");
		 *******************************************************************************************/

		/*******************************************************************************************
		 * dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		 * dm.slip_occr_dt =
		 * Util.getSessionParameterValue(req,"slip_occr_dt",true);
		 * dm.slip_clsf_cd =
		 * Util.getSessionParameterValue(req,"slip_clsf_cd",true); dm.slip_seq =
		 * Util.getSessionParameterValue(req,"slip_seq",true);
		 *******************************************************************************************/
	}

	public void fc_acct_2345_i(HttpServletRequest req, HttpServletResponse res)
			throws AppException, SQLException {
		FC_ACCT_2345_IDataSet ds = null;
		FC_ACCT_2345_IDM dm = new FC_ACCT_2345_IDM();

		String multiUpdateData = Util.checkString(req
				.getParameter("multiUpdateData"));
		String multiUpdateData2 = Util.checkString(req
				.getParameter("multiUpdateData2"));

		// System.out.println("multi:"+multiUpdateData);
		// System.out.println("multi2:"+multiUpdateData2);

		Hashtable hash = getHashMultiUpdateData(multiUpdateData);
		Hashtable hash2 = getHashMultiUpdateData(multiUpdateData2);

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.slip_occr_dt = Util.checkString(req.getParameter("slip_occr_dt"));
		dm.slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
		dm.slip_seq = Util.checkString(req.getParameter("slip_seq"));
		dm.slip_sub_seq = Util.checkString(req.getParameter("slip_sub_seq"));
		dm.incmg_emp_no = Util.checkString(req.getParameter("incmg_emp_no"));
		dm.hjpdacntcymd = Util.checkString(req.getParameter("hjpdacntcymd"));
		dm.hjpjacntcymd = Util.checkString(req.getParameter("hjpjacntcymd"));
		dm.chg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		dm.hjpdsyscd = Util.checkString(req.getParameter("hjpdsyscd"));
		dm.mang_clsf_cd = Util.checkString(req.getParameter("mang_clsf_cd"));
		dm.hjnjcgb = Util.checkString(req.getParameter("hjnjcgb"));
		dm.rmks1 = Util.checkString(req.getParameter("rmks1"));
		dm.in_sicsgb = Util.checkString(req.getParameter("in_sicsgb"));
		dm.pch_jwdwgb = Util.checkString(req.getParameter("pch_jwdwgb"));
		dm.slip_arow_no = (String) hash.get("slip_arow_no");
		dm.pch_jbtype = (String) hash.get("jibul_clsf");
		dm.dr_amt = (String) hash.get("dr_amt");
		dm.dlco_clsf_cd = (String) hash.get("dlco_clsf_cd");
		dm.dlco_cd = (String) hash.get("dlco_cd3");
		dm.dlco_nm = (String) hash.get("dlco_nm3");
		dm.tax_stmt_no = (String) hash.get("tax_stmt_no");
		dm.pch_vat = (String) hash.get("vat_amt2");
		dm.budg_cd = (String) hash.get("budg_cd");
		dm.use_dept_cd = (String) hash.get("usebuseonm2");
		dm.pch_sgchk = Util.checkString(req.getParameter("pch_sgchk"));
		dm.pch_buseonm = Util.checkString(req.getParameter("pch_buseonm"));
		dm.incm_clsf_cd = (String) hash.get("incm_clsf_cd");
		dm.incmg_dt = Util.checkString(req.getParameter("incmg_dt"));
		dm.etc_in = (String) hash.get("etc_in");
		dm.boks_dlco_nm = (String) hash.get("boks_dlco_nm");
		dm.prt_no = (String) hash.get("prt_no");
		dm.rmks2 = (String) hash.get("rmks2");
		dm.draft_doc_no = Util.checkString(req.getParameter("draft_doc_no"));
		dm.draft_dept_cd = Util.checkString(req.getParameter("draft_dept_cd"));
		dm.draft_expn_amt = Util
				.checkString(req.getParameter("draft_expn_amt"));

		dm.current_clsf = (String) hash2.get("current_clsf");
		dm.biz_reg_no = (String) hash2.get("biz_reg_no");
		dm.bank_id = (String) hash2.get("bank_id");
		dm.acct_num = (String) hash2.get("acct_num");
		dm.tran_date = (String) hash2.get("tran_date");
		dm.tran_date_seq = (String) hash2.get("tran_date_seq");
		dm.tran_amt = (String) hash2.get("tran_amt");
		dm.acct_mang_no = (String) hash2.get("acct_mang_no");
		dm.tran_content = (String) hash2.get("tran_content");
		dm.acct_tonghwa = (String) hash2.get("acct_tonghwa");
		dm.frex_amt = (String) hash2.get("frex_amt");

		dm.print();

		/* EJB 수정후 시작 */
		ds = dao.fc_acct_2345_i(dm);

		if (!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/*
		 * EJB 수정전 시작 try { FC_ACCT_2000EJBHome home =
		 * (FC_ACCT_2000EJBHome)JNDIManager
		 * .getInstance().getHome("FC_ACCT_2000EJB"); FC_ACCT_2000EJB ejb =
		 * home.create();
		 * 
		 * ds = ejb.fc_acct_2345_i(dm); req.setAttribute("ds", ds); } catch
		 * (CreateException e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } catch (RemoteException
		 * e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } EJB 수정전 끝
		 */

		/*******************************************************************************************
		 * String multiUpdateData =
		 * Util.checkString(req.getParameter("multiUpdateData")); Hashtable hash
		 * = getHashMultiUpdateData(multiUpdateData);
		 * 
		 * dm.cmpy_cd = (String)hash.get("cmpy_cd"); dm.slip_occr_dt =
		 * (String)hash.get("slip_occr_dt"); dm.slip_clsf_cd =
		 * (String)hash.get("slip_clsf_cd"); dm.slip_seq =
		 * (String)hash.get("slip_seq"); dm.slip_sub_seq =
		 * (String)hash.get("slip_sub_seq"); dm.incmg_emp_no =
		 * (String)hash.get("incmg_emp_no"); dm.hjpdacntcymd =
		 * (String)hash.get("hjpdacntcymd"); dm.hjpjacntcymd =
		 * (String)hash.get("hjpjacntcymd"); dm.chg_pers =
		 * (String)hash.get("chg_pers"); dm.incmg_pers_ipadd =
		 * (String)hash.get("incmg_pers_ipadd"); dm.hjpdsyscd =
		 * (String)hash.get("hjpdsyscd"); dm.mang_clsf_cd =
		 * (String)hash.get("mang_clsf_cd"); dm.hjnjcgb =
		 * (String)hash.get("hjnjcgb"); dm.rmks1 = (String)hash.get("rmks1");
		 * dm.in_sicsgb = (String)hash.get("in_sicsgb"); dm.pch_jwdwgb =
		 * (String)hash.get("pch_jwdwgb"); dm.slip_arow_no =
		 * (String)hash.get("slip_arow_no"); dm.pch_jbtype =
		 * (String)hash.get("pch_jbtype"); dm.dr_amt =
		 * (String)hash.get("dr_amt"); dm.dlco_clsf_cd =
		 * (String)hash.get("dlco_clsf_cd"); dm.dlco_cd =
		 * (String)hash.get("dlco_cd"); dm.dlco_nm =
		 * (String)hash.get("dlco_nm"); dm.tax_stmt_no =
		 * (String)hash.get("tax_stmt_no"); dm.pch_vat =
		 * (String)hash.get("pch_vat"); dm.budg_cd =
		 * (String)hash.get("budg_cd"); dm.use_dept_cd =
		 * (String)hash.get("use_dept_cd"); dm.pch_sgchk =
		 * (String)hash.get("pch_sgchk"); dm.pch_buseonm =
		 * (String)hash.get("pch_buseonm"); dm.incm_clsf_cd =
		 * (String)hash.get("incm_clsf_cd"); dm.incmg_dt =
		 * (String)hash.get("incmg_dt"); dm.etc_in = (String)hash.get("etc_in");
		 * dm.boks_dlco_nm = (String)hash.get("boks_dlco_nm"); dm.prt_no =
		 * (String)hash.get("prt_no"); dm.rmks2 = (String)hash.get("rmks2");
		 * dm.draft_doc_no = (String)hash.get("draft_doc_no"); dm.draft_dept_cd
		 * = (String)hash.get("draft_dept_cd"); dm.draft_expn_amt =
		 * (String)hash.get("draft_expn_amt");
		 *******************************************************************************************/

		/*******************************************************************************************
		 * dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		 * dm.slip_occr_dt =
		 * Util.getSessionParameterValue(req,"slip_occr_dt",true);
		 * dm.slip_clsf_cd =
		 * Util.getSessionParameterValue(req,"slip_clsf_cd",true); dm.slip_seq =
		 * Util.getSessionParameterValue(req,"slip_seq",true); dm.slip_sub_seq =
		 * Util.getSessionParameterValue(req,"slip_sub_seq",true);
		 * dm.incmg_emp_no =
		 * Util.getSessionParameterValue(req,"incmg_emp_no",true);
		 * dm.hjpdacntcymd =
		 * Util.getSessionParameterValue(req,"hjpdacntcymd",true);
		 * dm.hjpjacntcymd =
		 * Util.getSessionParameterValue(req,"hjpjacntcymd",true); dm.chg_pers =
		 * Util.getSessionParameterValue(req,"chg_pers",true);
		 * dm.incmg_pers_ipadd =
		 * Util.getSessionParameterValue(req,"incmg_pers_ipadd",true);
		 * dm.hjpdsyscd = Util.getSessionParameterValue(req,"hjpdsyscd",true);
		 * dm.mang_clsf_cd =
		 * Util.getSessionParameterValue(req,"mang_clsf_cd",true); dm.hjnjcgb =
		 * Util.getSessionParameterValue(req,"hjnjcgb",true); dm.rmks1 =
		 * Util.getSessionParameterValue(req,"rmks1",true); dm.in_sicsgb =
		 * Util.getSessionParameterValue(req,"in_sicsgb",true); dm.pch_jwdwgb =
		 * Util.getSessionParameterValue(req,"pch_jwdwgb",true); dm.slip_arow_no
		 * = Util.getSessionParameterValue(req,"slip_arow_no",true);
		 * dm.pch_jbtype = Util.getSessionParameterValue(req,"pch_jbtype",true);
		 * dm.dr_amt = Util.getSessionParameterValue(req,"dr_amt",true);
		 * dm.dlco_clsf_cd =
		 * Util.getSessionParameterValue(req,"dlco_clsf_cd",true); dm.dlco_cd =
		 * Util.getSessionParameterValue(req,"dlco_cd",true); dm.dlco_nm =
		 * Util.getSessionParameterValue(req,"dlco_nm",true); dm.tax_stmt_no =
		 * Util.getSessionParameterValue(req,"tax_stmt_no",true); dm.pch_vat =
		 * Util.getSessionParameterValue(req,"pch_vat",true); dm.budg_cd =
		 * Util.getSessionParameterValue(req,"budg_cd",true); dm.use_dept_cd =
		 * Util.getSessionParameterValue(req,"use_dept_cd",true); dm.pch_sgchk =
		 * Util.getSessionParameterValue(req,"pch_sgchk",true); dm.pch_buseonm =
		 * Util.getSessionParameterValue(req,"pch_buseonm",true);
		 * dm.incm_clsf_cd =
		 * Util.getSessionParameterValue(req,"incm_clsf_cd",true); dm.incmg_dt =
		 * Util.getSessionParameterValue(req,"incmg_dt",true); dm.etc_in =
		 * Util.getSessionParameterValue(req,"etc_in",true); dm.boks_dlco_nm =
		 * Util.getSessionParameterValue(req,"boks_dlco_nm",true); dm.prt_no =
		 * Util.getSessionParameterValue(req,"prt_no",true); dm.rmks2 =
		 * Util.getSessionParameterValue(req,"rmks2",true); dm.draft_doc_no =
		 * Util.getSessionParameterValue(req,"draft_doc_no",true);
		 * dm.draft_dept_cd =
		 * Util.getSessionParameterValue(req,"draft_dept_cd",true);
		 * dm.draft_expn_amt =
		 * Util.getSessionParameterValue(req,"draft_expn_amt",true);
		 *******************************************************************************************/
	}

	public void fc_acct_2346_d(HttpServletRequest req, HttpServletResponse res)
			throws AppException, SQLException {
		FC_ACCT_2346_DDataSet ds = null;
		FC_ACCT_2346_DDM dm = new FC_ACCT_2346_DDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.slip_occr_dt = Util.checkString(req.getParameter("slip_occr_dt"));
		dm.slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
		dm.slip_seq = Util.checkString(req.getParameter("slip_seq"));
		dm.slip_sub_seq = Util.checkString(req.getParameter("slip_sub_seq"));
		dm.incmg_emp_no = Util.checkString(req.getParameter("incmg_emp_no"));
		dm.incmg_dt = Util.checkString(req.getParameter("incmg_dt"));
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		dm.hjnjcgb = Util.checkString(req.getParameter("hjnjcgb"));
		dm.in_sicsgb = Util.checkString(req.getParameter("in_sicsgb"));
		dm.pch_jwdwgb = Util.checkString(req.getParameter("pch_jwdwgb"));

		dm.print();

		/* EJB 수정후 시작 */
		ds = dao.fc_acct_2346_d(dm);

		if (!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/*
		 * EJB 수정전 시작 try { FC_ACCT_2000EJBHome home =
		 * (FC_ACCT_2000EJBHome)JNDIManager
		 * .getInstance().getHome("FC_ACCT_2000EJB"); FC_ACCT_2000EJB ejb =
		 * home.create();
		 * 
		 * ds = ejb.fc_acct_2346_d(dm); req.setAttribute("ds", ds); } catch
		 * (CreateException e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } catch (RemoteException
		 * e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } EJB 수정전 끝
		 */

		/*******************************************************************************************
		 * String multiUpdateData =
		 * Util.checkString(req.getParameter("multiUpdateData")); Hashtable hash
		 * = getHashMultiUpdateData(multiUpdateData);
		 * 
		 * dm.cmpy_cd = (String)hash.get("cmpy_cd"); dm.slip_occr_dt =
		 * (String)hash.get("slip_occr_dt"); dm.slip_clsf_cd =
		 * (String)hash.get("slip_clsf_cd"); dm.slip_seq =
		 * (String)hash.get("slip_seq"); dm.slip_sub_seq =
		 * (String)hash.get("slip_sub_seq"); dm.incmg_emp_no =
		 * (String)hash.get("incmg_emp_no"); dm.incmg_dt =
		 * (String)hash.get("incmg_dt"); dm.incmg_pers =
		 * (String)hash.get("incmg_pers"); dm.incmg_pers_ipadd =
		 * (String)hash.get("incmg_pers_ipadd"); dm.hjnjcgb =
		 * (String)hash.get("hjnjcgb"); dm.in_sicsgb =
		 * (String)hash.get("in_sicsgb"); dm.pch_jwdwgb =
		 * (String)hash.get("pch_jwdwgb");
		 *******************************************************************************************/

		/*******************************************************************************************
		 * dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		 * dm.slip_occr_dt =
		 * Util.getSessionParameterValue(req,"slip_occr_dt",true);
		 * dm.slip_clsf_cd =
		 * Util.getSessionParameterValue(req,"slip_clsf_cd",true); dm.slip_seq =
		 * Util.getSessionParameterValue(req,"slip_seq",true); dm.slip_sub_seq =
		 * Util.getSessionParameterValue(req,"slip_sub_seq",true);
		 * dm.incmg_emp_no =
		 * Util.getSessionParameterValue(req,"incmg_emp_no",true); dm.incmg_dt =
		 * Util.getSessionParameterValue(req,"incmg_dt",true); dm.incmg_pers =
		 * Util.getSessionParameterValue(req,"incmg_pers",true);
		 * dm.incmg_pers_ipadd =
		 * Util.getSessionParameterValue(req,"incmg_pers_ipadd",true);
		 * dm.hjnjcgb = Util.getSessionParameterValue(req,"hjnjcgb",true);
		 * dm.in_sicsgb = Util.getSessionParameterValue(req,"in_sicsgb",true);
		 * dm.pch_jwdwgb = Util.getSessionParameterValue(req,"pch_jwdwgb",true);
		 *******************************************************************************************/
	}

	public void fc_acct_2347_u(HttpServletRequest req, HttpServletResponse res)
			throws AppException, SQLException {
		FC_ACCT_2347_UDataSet ds = null;
		FC_ACCT_2347_UDM dm = new FC_ACCT_2347_UDM();

		String multiUpdateData = Util.checkString(req
				.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.mode = (String) hash.get("m");
		dm.note_stat = (String) hash.get("note_stat");
		dm.slip_arow_no = (String) hash.get("slip_arow_no");
		dm.slip_occr_dt = Util.checkString(req.getParameter("slip_occr_dt"));
		dm.slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
		dm.slip_seq = Util.checkString(req.getParameter("slip_seq"));
		dm.slip_sub_seq = Util.checkString(req.getParameter("slip_sub_seq"));
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.incmg_pers_ipadd = req.getRemoteAddr();

		dm.print();

		/* EJB 수정후 시작 */
		ds = dao.fc_acct_2347_u(dm);

		if (!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/*
		 * EJB 수정전 시작 try { FC_ACCT_2000EJBHome home =
		 * (FC_ACCT_2000EJBHome)JNDIManager
		 * .getInstance().getHome("FC_ACCT_2000EJB"); FC_ACCT_2000EJB ejb =
		 * home.create();
		 * 
		 * ds = ejb.fc_acct_2347_u(dm); req.setAttribute("ds", ds); } catch
		 * (CreateException e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } catch (RemoteException
		 * e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } EJB 수정전 끝
		 */

		/*******************************************************************************************
		 * String multiUpdateData =
		 * Util.checkString(req.getParameter("multiUpdateData")); Hashtable hash
		 * = getHashMultiUpdateData(multiUpdateData);
		 * 
		 * dm.cmpy_cd = (String)hash.get("cmpy_cd"); dm.mode =
		 * (String)hash.get("mode"); dm.note_stat =
		 * (String)hash.get("note_stat"); dm.slip_arow_no =
		 * (String)hash.get("slip_arow_no"); dm.slip_occr_dt =
		 * (String)hash.get("slip_occr_dt"); dm.slip_clsf_cd =
		 * (String)hash.get("slip_clsf_cd"); dm.slip_seq =
		 * (String)hash.get("slip_seq"); dm.slip_sub_seq =
		 * (String)hash.get("slip_sub_seq"); dm.incmg_pers =
		 * (String)hash.get("incmg_pers"); dm.incmg_pers_ipadd =
		 * (String)hash.get("incmg_pers_ipadd");
		 *******************************************************************************************/

		/*******************************************************************************************
		 * dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		 * dm.mode = Util.getSessionParameterValue(req,"mode",true);
		 * dm.note_stat = Util.getSessionParameterValue(req,"note_stat",true);
		 * dm.slip_arow_no =
		 * Util.getSessionParameterValue(req,"slip_arow_no",true);
		 * dm.slip_occr_dt =
		 * Util.getSessionParameterValue(req,"slip_occr_dt",true);
		 * dm.slip_clsf_cd =
		 * Util.getSessionParameterValue(req,"slip_clsf_cd",true); dm.slip_seq =
		 * Util.getSessionParameterValue(req,"slip_seq",true); dm.slip_sub_seq =
		 * Util.getSessionParameterValue(req,"slip_sub_seq",true); dm.incmg_pers
		 * = Util.getSessionParameterValue(req,"incmg_pers",true);
		 * dm.incmg_pers_ipadd =
		 * Util.getSessionParameterValue(req,"incmg_pers_ipadd",true);
		 *******************************************************************************************/
	}

	public void fc_acct_2350_m(HttpServletRequest req, HttpServletResponse res)
			throws AppException, SQLException {
		FC_ACCT_2350_MDataSet ds = null;
		FC_ACCT_2350_MDM dm = new FC_ACCT_2350_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);

		dm.print();

		/* EJB 수정후 시작 */
		ds = dao.fc_acct_2350_m(dm);

		if (!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/*
		 * EJB 수정전 시작 try { FC_ACCT_2000EJBHome home =
		 * (FC_ACCT_2000EJBHome)JNDIManager
		 * .getInstance().getHome("FC_ACCT_2000EJB"); FC_ACCT_2000EJB ejb =
		 * home.create();
		 * 
		 * ds = ejb.fc_acct_2350_m(dm); req.setAttribute("ds", ds); } catch
		 * (CreateException e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } catch (RemoteException
		 * e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } EJB 수정전 끝
		 */

		/*******************************************************************************************
		 * String multiUpdateData =
		 * Util.checkString(req.getParameter("multiUpdateData")); Hashtable hash
		 * = getHashMultiUpdateData(multiUpdateData);
		 * 
		 * dm.cmpy_cd = (String)hash.get("cmpy_cd");
		 *******************************************************************************************/

		/*******************************************************************************************
		 * dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		 *******************************************************************************************/
	}

	public void fc_acct_2351_l(HttpServletRequest req, HttpServletResponse res)
			throws AppException, SQLException {
		FC_ACCT_2351_LDataSet ds = null;
		FC_ACCT_2351_LDM dm = new FC_ACCT_2351_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.slip_occr_dt = Util.checkString(req.getParameter("slip_occr_dt"));
		dm.slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));

		dm.print();

		/* EJB 수정후 시작 */
		ds = dao.fc_acct_2351_l(dm);

		if (!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/*
		 * EJB 수정전 시작 try { FC_ACCT_2000EJBHome home =
		 * (FC_ACCT_2000EJBHome)JNDIManager
		 * .getInstance().getHome("FC_ACCT_2000EJB"); FC_ACCT_2000EJB ejb =
		 * home.create();
		 * 
		 * ds = ejb.fc_acct_2351_l(dm); req.setAttribute("ds", ds); } catch
		 * (CreateException e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } catch (RemoteException
		 * e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } EJB 수정전 끝
		 */

		/*******************************************************************************************
		 * String multiUpdateData =
		 * Util.checkString(req.getParameter("multiUpdateData")); Hashtable hash
		 * = getHashMultiUpdateData(multiUpdateData);
		 * 
		 * dm.cmpy_cd = (String)hash.get("cmpy_cd"); dm.slip_occr_dt =
		 * (String)hash.get("slip_occr_dt"); dm.slip_clsf_cd =
		 * (String)hash.get("slip_clsf_cd");
		 *******************************************************************************************/

		/*******************************************************************************************
		 * dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		 * dm.slip_occr_dt =
		 * Util.getSessionParameterValue(req,"slip_occr_dt",true);
		 * dm.slip_clsf_cd =
		 * Util.getSessionParameterValue(req,"slip_clsf_cd",true);
		 *******************************************************************************************/
	}

	public void fc_acct_2352_l(HttpServletRequest req, HttpServletResponse res)
			throws AppException, SQLException {
		FC_ACCT_2352_LDataSet ds = null;
		FC_ACCT_2352_LDM dm = new FC_ACCT_2352_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.slip_occr_dt = Util.checkString(req.getParameter("slip_occr_dt"));

		dm.print();

		/* EJB 수정후 시작 */
		ds = dao.fc_acct_2352_l(dm);

		if (!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/*
		 * EJB 수정전 시작 try { FC_ACCT_2000EJBHome home =
		 * (FC_ACCT_2000EJBHome)JNDIManager
		 * .getInstance().getHome("FC_ACCT_2000EJB"); FC_ACCT_2000EJB ejb =
		 * home.create();
		 * 
		 * ds = ejb.fc_acct_2352_l(dm); req.setAttribute("ds", ds); } catch
		 * (CreateException e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } catch (RemoteException
		 * e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } EJB 수정전 끝
		 */

		/*******************************************************************************************
		 * String multiUpdateData =
		 * Util.checkString(req.getParameter("multiUpdateData")); Hashtable hash
		 * = getHashMultiUpdateData(multiUpdateData);
		 * 
		 * dm.cmpy_cd = (String)hash.get("cmpy_cd"); dm.slip_occr_dt =
		 * (String)hash.get("slip_occr_dt");
		 *******************************************************************************************/

		/*******************************************************************************************
		 * dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		 * dm.slip_occr_dt =
		 * Util.getSessionParameterValue(req,"slip_occr_dt",true);
		 *******************************************************************************************/
	}

	public void fc_acct_2353_i(HttpServletRequest req, HttpServletResponse res)
			throws AppException, SQLException {
		FC_ACCT_2353_IDataSet ds = null;
		FC_ACCT_2353_IDM dm = new FC_ACCT_2353_IDM();

		String multiUpdateData = Util.checkString(req
				.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.mode = (String) hash.get("m");
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.slip_occr_dt = Util.checkString(req.getParameter("slip_occr_dt"));
		dm.slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
		dm.slip_seq = (String) hash.get("slip_seq");
		dm.slip_sub_seq = (String) hash.get("slip_sub_seq");
		dm.pch_hjpno = (String) hash.get("seq");
		dm.incmg_emp_no = Util.checkString(req.getParameter("incmg_emp_no"));
		dm.incmg_dt = Util.checkString(req.getParameter("incmg_dt"));
		dm.fisc_dt = Util.checkString(req.getParameter("fisc_dt"));
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		dm.sicsgb = Util.checkString(req.getParameter("sicsgb"));
		dm.acct_cd = (String) hash.get("acct_cd");
		dm.fr_fisc_dt = Util.checkString(req.getParameter("fr_fisc_dt"));

		dm.print();

		/* EJB 수정후 시작 */
		ds = dao.fc_acct_2353_i(dm);

		if (!ds.getErrcode().equals("")) {
			System.out.println("errmsg:" + ds.getErrmsg());
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/*
		 * EJB 수정전 시작 try { FC_ACCT_2000EJBHome home =
		 * (FC_ACCT_2000EJBHome)JNDIManager
		 * .getInstance().getHome("FC_ACCT_2000EJB"); FC_ACCT_2000EJB ejb =
		 * home.create();
		 * 
		 * ds = ejb.fc_acct_2353_i(dm); req.setAttribute("ds", ds); } catch
		 * (CreateException e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } catch (RemoteException
		 * e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } EJB 수정전 끝
		 */

		/*******************************************************************************************
		 * String multiUpdateData =
		 * Util.checkString(req.getParameter("multiUpdateData")); Hashtable hash
		 * = getHashMultiUpdateData(multiUpdateData);
		 * 
		 * dm.mode = (String)hash.get("mode"); dm.cmpy_cd =
		 * (String)hash.get("cmpy_cd"); dm.slip_occr_dt =
		 * (String)hash.get("slip_occr_dt"); dm.slip_clsf_cd =
		 * (String)hash.get("slip_clsf_cd"); dm.slip_seq =
		 * (String)hash.get("slip_seq"); dm.slip_sub_seq =
		 * (String)hash.get("slip_sub_seq"); dm.pch_hjpno =
		 * (String)hash.get("pch_hjpno"); dm.incmg_emp_no =
		 * (String)hash.get("incmg_emp_no"); dm.incmg_dt =
		 * (String)hash.get("incmg_dt"); dm.fisc_dt =
		 * (String)hash.get("fisc_dt"); dm.incmg_pers =
		 * (String)hash.get("incmg_pers"); dm.incmg_pers_ipadd =
		 * (String)hash.get("incmg_pers_ipadd"); dm.sicsgb =
		 * (String)hash.get("sicsgb"); dm.acct_cd = (String)hash.get("acct_cd");
		 * dm.fr_fisc_dt = (String)hash.get("fr_fisc_dt");
		 *******************************************************************************************/

		/*******************************************************************************************
		 * dm.mode = Util.getSessionParameterValue(req,"mode",true); dm.cmpy_cd
		 * = Util.getSessionParameterValue(req,"cmpy_cd",true); dm.slip_occr_dt
		 * = Util.getSessionParameterValue(req,"slip_occr_dt",true);
		 * dm.slip_clsf_cd =
		 * Util.getSessionParameterValue(req,"slip_clsf_cd",true); dm.slip_seq =
		 * Util.getSessionParameterValue(req,"slip_seq",true); dm.slip_sub_seq =
		 * Util.getSessionParameterValue(req,"slip_sub_seq",true); dm.pch_hjpno
		 * = Util.getSessionParameterValue(req,"pch_hjpno",true);
		 * dm.incmg_emp_no =
		 * Util.getSessionParameterValue(req,"incmg_emp_no",true); dm.incmg_dt =
		 * Util.getSessionParameterValue(req,"incmg_dt",true); dm.fisc_dt =
		 * Util.getSessionParameterValue(req,"fisc_dt",true); dm.incmg_pers =
		 * Util.getSessionParameterValue(req,"incmg_pers",true);
		 * dm.incmg_pers_ipadd =
		 * Util.getSessionParameterValue(req,"incmg_pers_ipadd",true); dm.sicsgb
		 * = Util.getSessionParameterValue(req,"sicsgb",true); dm.acct_cd =
		 * Util.getSessionParameterValue(req,"acct_cd",true); dm.fr_fisc_dt =
		 * Util.getSessionParameterValue(req,"fr_fisc_dt",true);
		 *******************************************************************************************/
	}

	public void fc_acct_2354_l(HttpServletRequest req, HttpServletResponse res)
			throws AppException, SQLException {
		FC_ACCT_2354_LDataSet ds = null;
		FC_ACCT_2354_LDM dm = new FC_ACCT_2354_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.slip_occr_dt = Util.checkString(req.getParameter("slip_occr_dt"));
		dm.slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
		dm.frslip_seq = Util.checkString(req.getParameter("frslip_seq"));
		dm.toslip_seq = Util.checkString(req.getParameter("toslip_seq"));

		dm.print();

		/* EJB 수정후 시작 */
		ds = dao.fc_acct_2354_l(dm);

		if (!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/*
		 * EJB 수정전 시작 try { FC_ACCT_2000EJBHome home =
		 * (FC_ACCT_2000EJBHome)JNDIManager
		 * .getInstance().getHome("FC_ACCT_2000EJB"); FC_ACCT_2000EJB ejb =
		 * home.create();
		 * 
		 * ds = ejb.fc_acct_2354_l(dm); req.setAttribute("ds", ds); } catch
		 * (CreateException e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } catch (RemoteException
		 * e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } EJB 수정전 끝
		 */

		/*******************************************************************************************
		 * String multiUpdateData =
		 * Util.checkString(req.getParameter("multiUpdateData")); Hashtable hash
		 * = getHashMultiUpdateData(multiUpdateData);
		 * 
		 * dm.cmpy_cd = (String)hash.get("cmpy_cd"); dm.slip_occr_dt =
		 * (String)hash.get("slip_occr_dt"); dm.slip_clsf_cd =
		 * (String)hash.get("slip_clsf_cd"); dm.frslip_seq =
		 * (String)hash.get("frslip_seq"); dm.toslip_seq =
		 * (String)hash.get("toslip_seq");
		 *******************************************************************************************/

		/*******************************************************************************************
		 * dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		 * dm.slip_occr_dt =
		 * Util.getSessionParameterValue(req,"slip_occr_dt",true);
		 * dm.slip_clsf_cd =
		 * Util.getSessionParameterValue(req,"slip_clsf_cd",true); dm.frslip_seq
		 * = Util.getSessionParameterValue(req,"frslip_seq",true); dm.toslip_seq
		 * = Util.getSessionParameterValue(req,"toslip_seq",true);
		 *******************************************************************************************/
	}

	public void fc_acct_2355_l(HttpServletRequest req, HttpServletResponse res)
			throws AppException, SQLException {
		FC_ACCT_2355_LDataSet ds = null;
		FC_ACCT_2355_LDM dm = new FC_ACCT_2355_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.slip_occr_dt = Util.checkString(req.getParameter("slip_occr_dt"));
		dm.slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
		dm.frslip_seq = Util.checkString(req.getParameter("frslip_seq"));
		dm.toslip_seq = Util.checkString(req.getParameter("toslip_seq"));

		dm.print();

		/* EJB 수정후 시작 */
		ds = dao.fc_acct_2355_l(dm);

		if (!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/*
		 * EJB 수정전 시작 try { FC_ACCT_2000EJBHome home =
		 * (FC_ACCT_2000EJBHome)JNDIManager
		 * .getInstance().getHome("FC_ACCT_2000EJB"); FC_ACCT_2000EJB ejb =
		 * home.create();
		 * 
		 * ds = ejb.fc_acct_2355_l(dm); req.setAttribute("ds", ds); } catch
		 * (CreateException e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } catch (RemoteException
		 * e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } EJB 수정전 끝
		 */

		/*******************************************************************************************
		 * String multiUpdateData =
		 * Util.checkString(req.getParameter("multiUpdateData")); Hashtable hash
		 * = getHashMultiUpdateData(multiUpdateData);
		 * 
		 * dm.cmpy_cd = (String)hash.get("cmpy_cd"); dm.slip_occr_dt =
		 * (String)hash.get("slip_occr_dt"); dm.slip_clsf_cd =
		 * (String)hash.get("slip_clsf_cd"); dm.frslip_seq =
		 * (String)hash.get("frslip_seq"); dm.toslip_seq =
		 * (String)hash.get("toslip_seq");
		 *******************************************************************************************/

		/*******************************************************************************************
		 * dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		 * dm.slip_occr_dt =
		 * Util.getSessionParameterValue(req,"slip_occr_dt",true);
		 * dm.slip_clsf_cd =
		 * Util.getSessionParameterValue(req,"slip_clsf_cd",true); dm.frslip_seq
		 * = Util.getSessionParameterValue(req,"frslip_seq",true); dm.toslip_seq
		 * = Util.getSessionParameterValue(req,"toslip_seq",true);
		 *******************************************************************************************/
	}

	public void fc_acct_2361_l(HttpServletRequest req, HttpServletResponse res)
			throws AppException, SQLException {
		FC_ACCT_2361_LDataSet ds = null;
		FC_ACCT_2361_LDM dm = new FC_ACCT_2361_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.slip_occr_dt = Util.checkString(req.getParameter("slip_occr_dt"));

		/* EJB 수정후 시작 */
		ds = dao.fc_acct_2361_l(dm);

		if (!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/*
		 * EJB 수정전 시작 try { FC_ACCT_2000EJBHome home =
		 * (FC_ACCT_2000EJBHome)JNDIManager
		 * .getInstance().getHome("FC_ACCT_2000EJB"); FC_ACCT_2000EJB ejb =
		 * home.create();
		 * 
		 * ds = ejb.fc_acct_2361_l(dm); req.setAttribute("ds", ds); } catch
		 * (CreateException e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } catch (RemoteException
		 * e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } EJB 수정전 끝
		 */

		/*******************************************************************************************
		 * String multiUpdateData =
		 * Util.checkString(req.getParameter("multiUpdateData")); Hashtable hash
		 * = getHashMultiUpdateData(multiUpdateData);
		 * 
		 * dm.cmpy_cd = (String)hash.get("cmpy_cd"); dm.slip_occr_dt =
		 * (String)hash.get("slip_occr_dt");
		 *******************************************************************************************/

		/*******************************************************************************************
		 * dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		 * dm.slip_occr_dt =
		 * Util.getSessionParameterValue(req,"slip_occr_dt",true);
		 *******************************************************************************************/
	}

	public void fc_acct_2370_m(HttpServletRequest req, HttpServletResponse res)
			throws AppException, SQLException {
		FC_ACCT_2370_MDataSet ds = null;
		FC_ACCT_2370_MDM dm = new FC_ACCT_2370_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);

		dm.print();
		/* EJB 수정후 시작 */
		ds = dao.fc_acct_2370_m(dm);

		if (!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/*
		 * EJB 수정전 시작 try { FC_ACCT_2000EJBHome home =
		 * (FC_ACCT_2000EJBHome)JNDIManager
		 * .getInstance().getHome("FC_ACCT_2000EJB"); FC_ACCT_2000EJB ejb =
		 * home.create();
		 * 
		 * ds = ejb.fc_acct_2370_m(dm); req.setAttribute("ds", ds); } catch
		 * (CreateException e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } catch (RemoteException
		 * e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } EJB 수정전 끝
		 */

		/*******************************************************************************************
		 * String multiUpdateData =
		 * Util.checkString(req.getParameter("multiUpdateData")); Hashtable hash
		 * = getHashMultiUpdateData(multiUpdateData);
		 * 
		 * dm.cmpy_cd = (String)hash.get("cmpy_cd");
		 *******************************************************************************************/

		/*******************************************************************************************
		 * dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		 *******************************************************************************************/
	}

	public void fc_acct_2371_i(HttpServletRequest req, HttpServletResponse res)
			throws AppException, SQLException {
		FC_ACCT_2371_IDataSet ds = null;
		FC_ACCT_2371_IDM dm = new FC_ACCT_2371_IDM();

		String multiUpdateData = Util.checkString(req
				.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.mode = (String) hash.get("m");
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.slip_occr_dt = (String) hash.get("slip_occr_dt");
		dm.slip_clsf_cd = (String) hash.get("slip_clsf_cd");
		dm.slip_seq = (String) hash.get("slip_seq");
		dm.slip_sub_seq = (String) hash.get("slip_sub_seq");
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.incmg_dt = Util.checkString(req.getParameter("incmg_dt"));
		dm.fisc_dt = Util.checkString(req.getParameter("fisc_dt"));
		dm.chg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		dm.slip_aprv_yn = Util.checkString(req.getParameter("slip_aprv_yn"));
		dm.budg_cd = Util.checkString(req.getParameter("budg_cd"));
		dm.mang_clsf_cd = Util.checkString(req.getParameter("mang_clsf_cd"));

		/* EJB 수정후 시작 */
		ds = dao.fc_acct_2371_i(dm);

		if (!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/*
		 * EJB 수정전 시작 try { FC_ACCT_2000EJBHome home =
		 * (FC_ACCT_2000EJBHome)JNDIManager
		 * .getInstance().getHome("FC_ACCT_2000EJB"); FC_ACCT_2000EJB ejb =
		 * home.create();
		 * 
		 * ds = ejb.fc_acct_2371_i(dm); req.setAttribute("ds", ds); } catch
		 * (CreateException e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } catch (RemoteException
		 * e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } EJB 수정전 끝
		 */

		/*******************************************************************************************
		 * String multiUpdateData =
		 * Util.checkString(req.getParameter("multiUpdateData")); Hashtable hash
		 * = getHashMultiUpdateData(multiUpdateData);
		 * 
		 * dm.mode = (String)hash.get("mode"); dm.cmpy_cd =
		 * (String)hash.get("cmpy_cd"); dm.slip_occr_dt =
		 * (String)hash.get("slip_occr_dt"); dm.slip_clsf_cd =
		 * (String)hash.get("slip_clsf_cd"); dm.slip_seq =
		 * (String)hash.get("slip_seq"); dm.slip_sub_seq =
		 * (String)hash.get("slip_sub_seq"); dm.incmg_pers =
		 * (String)hash.get("incmg_pers"); dm.incmg_dt =
		 * (String)hash.get("incmg_dt"); dm.fisc_dt =
		 * (String)hash.get("fisc_dt"); dm.chg_pers =
		 * (String)hash.get("chg_pers"); dm.incmg_pers_ipadd =
		 * (String)hash.get("incmg_pers_ipadd"); dm.slip_aprv_yn =
		 * (String)hash.get("slip_aprv_yn");
		 *******************************************************************************************/

		/*******************************************************************************************
		 * dm.mode = Util.getSessionParameterValue(req,"mode",true); dm.cmpy_cd
		 * = Util.getSessionParameterValue(req,"cmpy_cd",true); dm.slip_occr_dt
		 * = Util.getSessionParameterValue(req,"slip_occr_dt",true);
		 * dm.slip_clsf_cd =
		 * Util.getSessionParameterValue(req,"slip_clsf_cd",true); dm.slip_seq =
		 * Util.getSessionParameterValue(req,"slip_seq",true); dm.slip_sub_seq =
		 * Util.getSessionParameterValue(req,"slip_sub_seq",true); dm.incmg_pers
		 * = Util.getSessionParameterValue(req,"incmg_pers",true); dm.incmg_dt =
		 * Util.getSessionParameterValue(req,"incmg_dt",true); dm.fisc_dt =
		 * Util.getSessionParameterValue(req,"fisc_dt",true); dm.chg_pers =
		 * Util.getSessionParameterValue(req,"chg_pers",true);
		 * dm.incmg_pers_ipadd =
		 * Util.getSessionParameterValue(req,"incmg_pers_ipadd",true);
		 * dm.slip_aprv_yn =
		 * Util.getSessionParameterValue(req,"slip_aprv_yn",true);
		 *******************************************************************************************/
	}

	public void fc_acct_2372_l(HttpServletRequest req, HttpServletResponse res)
			throws AppException, SQLException {
		FC_ACCT_2372_LDataSet ds = null;
		FC_ACCT_2372_LDM dm = new FC_ACCT_2372_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.slip_occr_dt = Util.checkString(req.getParameter("slip_occr_dt"));
		dm.slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
		dm.slip_seq_fr = Util.checkString(req.getParameter("slip_seq_fr"));
		dm.slip_seq_to = Util.checkString(req.getParameter("slip_seq_to"));
		dm.slip_aprv_yn = Util.checkString(req.getParameter("slip_aprv_yn"));

		/* EJB 수정후 시작 */
		ds = dao.fc_acct_2372_l(dm);

		if (!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/*
		 * EJB 수정전 시작 try { FC_ACCT_2000EJBHome home =
		 * (FC_ACCT_2000EJBHome)JNDIManager
		 * .getInstance().getHome("FC_ACCT_2000EJB"); FC_ACCT_2000EJB ejb =
		 * home.create();
		 * 
		 * ds = ejb.fc_acct_2372_l(dm); req.setAttribute("ds", ds); } catch
		 * (CreateException e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } catch (RemoteException
		 * e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } EJB 수정전 끝
		 */

		/*******************************************************************************************
		 * String multiUpdateData =
		 * Util.checkString(req.getParameter("multiUpdateData")); Hashtable hash
		 * = getHashMultiUpdateData(multiUpdateData);
		 * 
		 * dm.cmpy_cd = (String)hash.get("cmpy_cd"); dm.slip_occr_dt =
		 * (String)hash.get("slip_occr_dt"); dm.slip_clsf_cd =
		 * (String)hash.get("slip_clsf_cd"); dm.slip_seq_fr =
		 * (String)hash.get("slip_seq_fr"); dm.slip_seq_to =
		 * (String)hash.get("slip_seq_to"); dm.slip_aprv_yn =
		 * (String)hash.get("slip_aprv_yn");
		 *******************************************************************************************/

		/*******************************************************************************************
		 * dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		 * dm.slip_occr_dt =
		 * Util.getSessionParameterValue(req,"slip_occr_dt",true);
		 * dm.slip_clsf_cd =
		 * Util.getSessionParameterValue(req,"slip_clsf_cd",true);
		 * dm.slip_seq_fr =
		 * Util.getSessionParameterValue(req,"slip_seq_fr",true); dm.slip_seq_to
		 * = Util.getSessionParameterValue(req,"slip_seq_to",true);
		 * dm.slip_aprv_yn =
		 * Util.getSessionParameterValue(req,"slip_aprv_yn",true);
		 *******************************************************************************************/
	}

	public void fc_acct_2373_l(HttpServletRequest req, HttpServletResponse res)
			throws AppException, SQLException {
		FC_ACCT_2373_LDataSet ds = null;
		FC_ACCT_2373_LDM dm = new FC_ACCT_2373_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.slip_occr_dt = Util.checkString(req.getParameter("slip_occr_dt"));
		dm.slip_occr_dt2 = Util.checkString(req.getParameter("slip_occr_dt2"));
		dm.slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
		dm.slip_seq_fr = Util.checkString(req.getParameter("slip_seq_fr"));
		dm.slip_seq_to = Util.checkString(req.getParameter("slip_seq_to"));
		dm.slip_aprv_yn = Util.checkString(req.getParameter("slip_aprv_yn"));

		/* EJB 수정후 시작 */
		ds = dao.fc_acct_2373_l(dm);

		if (!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/*
		 * EJB 수정전 시작 try { FC_ACCT_2000EJBHome home =
		 * (FC_ACCT_2000EJBHome)JNDIManager
		 * .getInstance().getHome("FC_ACCT_2000EJB"); FC_ACCT_2000EJB ejb =
		 * home.create();
		 * 
		 * ds = ejb.fc_acct_2373_l(dm); req.setAttribute("ds", ds); } catch
		 * (CreateException e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } catch (RemoteException
		 * e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } EJB 수정전 끝
		 */

		/*******************************************************************************************
		 * String multiUpdateData =
		 * Util.checkString(req.getParameter("multiUpdateData")); Hashtable hash
		 * = getHashMultiUpdateData(multiUpdateData);
		 * 
		 * dm.cmpy_cd = (String)hash.get("cmpy_cd"); dm.slip_occr_dt =
		 * (String)hash.get("slip_occr_dt"); dm.slip_occr_dt2 =
		 * (String)hash.get("slip_occr_dt2"); dm.slip_clsf_cd =
		 * (String)hash.get("slip_clsf_cd"); dm.slip_seq_fr =
		 * (String)hash.get("slip_seq_fr"); dm.slip_seq_to =
		 * (String)hash.get("slip_seq_to"); dm.slip_aprv_yn =
		 * (String)hash.get("slip_aprv_yn");
		 *******************************************************************************************/

		/*******************************************************************************************
		 * dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		 * dm.slip_occr_dt =
		 * Util.getSessionParameterValue(req,"slip_occr_dt",true);
		 * dm.slip_occr_dt2 =
		 * Util.getSessionParameterValue(req,"slip_occr_dt2",true);
		 * dm.slip_clsf_cd =
		 * Util.getSessionParameterValue(req,"slip_clsf_cd",true);
		 * dm.slip_seq_fr =
		 * Util.getSessionParameterValue(req,"slip_seq_fr",true); dm.slip_seq_to
		 * = Util.getSessionParameterValue(req,"slip_seq_to",true);
		 * dm.slip_aprv_yn =
		 * Util.getSessionParameterValue(req,"slip_aprv_yn",true);
		 *******************************************************************************************/
	}

	public void fc_acct_2374_d(HttpServletRequest req, HttpServletResponse res)
			throws AppException, SQLException {
		FC_ACCT_2374_DDataSet ds = null;
		FC_ACCT_2374_DDM dm = new FC_ACCT_2374_DDM();

		String multiUpdateData = Util.checkString(req
				.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.slip_occr_dt = (String) hash.get("slip_occr_dt");
		dm.slip_clsf_cd = (String) hash.get("slip_clsf_cd");
		dm.slip_seq = (String) hash.get("slip_seq");
		dm.slip_sub_seq = (String) hash.get("slip_sub_seq");
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.incmg_dt = (String) hash.get("incmg_dt");
		dm.fisc_dt = (String) hash.get("fisc_dt");
		dm.chg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		dm.slip_aprv = Util.checkString(req.getParameter("slip_aprv"));

		/* EJB 수정후 시작 */
		ds = dao.fc_acct_2374_d(dm);

		if (!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/*
		 * EJB 수정전 시작 try { FC_ACCT_2000EJBHome home =
		 * (FC_ACCT_2000EJBHome)JNDIManager
		 * .getInstance().getHome("FC_ACCT_2000EJB"); FC_ACCT_2000EJB ejb =
		 * home.create();
		 * 
		 * ds = ejb.fc_acct_2374_d(dm); req.setAttribute("ds", ds); } catch
		 * (CreateException e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } catch (RemoteException
		 * e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } EJB 수정전 끝
		 */

		/*******************************************************************************************
		 * String multiUpdateData =
		 * Util.checkString(req.getParameter("multiUpdateData")); Hashtable hash
		 * = getHashMultiUpdateData(multiUpdateData);
		 * 
		 * dm.cmpy_cd = (String)hash.get("cmpy_cd"); dm.slip_occr_dt =
		 * (String)hash.get("slip_occr_dt"); dm.slip_clsf_cd =
		 * (String)hash.get("slip_clsf_cd"); dm.slip_seq =
		 * (String)hash.get("slip_seq"); dm.slip_sub_seq =
		 * (String)hash.get("slip_sub_seq"); dm.incmg_pers =
		 * (String)hash.get("incmg_pers"); dm.incmg_dt =
		 * (String)hash.get("incmg_dt"); dm.fisc_dt =
		 * (String)hash.get("fisc_dt"); dm.chg_pers =
		 * (String)hash.get("chg_pers"); dm.incmg_pers_ipadd =
		 * (String)hash.get("incmg_pers_ipadd"); dm.slip_aprv =
		 * (String)hash.get("slip_aprv");
		 *******************************************************************************************/

		/*******************************************************************************************
		 * dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		 * dm.slip_occr_dt =
		 * Util.getSessionParameterValue(req,"slip_occr_dt",true);
		 * dm.slip_clsf_cd =
		 * Util.getSessionParameterValue(req,"slip_clsf_cd",true); dm.slip_seq =
		 * Util.getSessionParameterValue(req,"slip_seq",true); dm.slip_sub_seq =
		 * Util.getSessionParameterValue(req,"slip_sub_seq",true); dm.incmg_pers
		 * = Util.getSessionParameterValue(req,"incmg_pers",true); dm.incmg_dt =
		 * Util.getSessionParameterValue(req,"incmg_dt",true); dm.fisc_dt =
		 * Util.getSessionParameterValue(req,"fisc_dt",true); dm.chg_pers =
		 * Util.getSessionParameterValue(req,"chg_pers",true);
		 * dm.incmg_pers_ipadd =
		 * Util.getSessionParameterValue(req,"incmg_pers_ipadd",true);
		 * dm.slip_aprv = Util.getSessionParameterValue(req,"slip_aprv",true);
		 *******************************************************************************************/
	}

	public void fc_acct_2375_l(HttpServletRequest req, HttpServletResponse res)
			throws AppException, SQLException {
		FC_ACCT_2375_LDataSet ds = null;
		FC_ACCT_2375_LDM dm = new FC_ACCT_2375_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.slip_occr_dt = Util.checkString(req.getParameter("slip_occr_dt"));
		dm.slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
		dm.slip_seq_fr = Util.checkString(req.getParameter("slip_seq_fr"));
		dm.slip_seq_to = Util.checkString(req.getParameter("slip_seq_to"));
		dm.incmg_emp_no = Util.checkString(req.getParameter("incmg_emp_no"));
		dm.fisc_dt = Util.checkString(req.getParameter("fisc_dt"));

		/* EJB 수정후 시작 */
		ds = dao.fc_acct_2375_l(dm);

		if (!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/*
		 * EJB 수정전 시작 try { FC_ACCT_2000EJBHome home =
		 * (FC_ACCT_2000EJBHome)JNDIManager
		 * .getInstance().getHome("FC_ACCT_2000EJB"); FC_ACCT_2000EJB ejb =
		 * home.create();
		 * 
		 * ds = ejb.fc_acct_2375_l(dm); req.setAttribute("ds", ds); } catch
		 * (CreateException e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } catch (RemoteException
		 * e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } EJB 수정전 끝
		 */

		/*******************************************************************************************
		 * String multiUpdateData =
		 * Util.checkString(req.getParameter("multiUpdateData")); Hashtable hash
		 * = getHashMultiUpdateData(multiUpdateData);
		 * 
		 * dm.cmpy_cd = (String)hash.get("cmpy_cd"); dm.slip_occr_dt =
		 * (String)hash.get("slip_occr_dt"); dm.slip_clsf_cd =
		 * (String)hash.get("slip_clsf_cd"); dm.slip_seq_fr =
		 * (String)hash.get("slip_seq_fr"); dm.slip_seq_to =
		 * (String)hash.get("slip_seq_to"); dm.incmg_emp_no =
		 * (String)hash.get("incmg_emp_no"); dm.fisc_dt =
		 * (String)hash.get("fisc_dt");
		 *******************************************************************************************/

		/*******************************************************************************************
		 * dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		 * dm.slip_occr_dt =
		 * Util.getSessionParameterValue(req,"slip_occr_dt",true);
		 * dm.slip_clsf_cd =
		 * Util.getSessionParameterValue(req,"slip_clsf_cd",true);
		 * dm.slip_seq_fr =
		 * Util.getSessionParameterValue(req,"slip_seq_fr",true); dm.slip_seq_to
		 * = Util.getSessionParameterValue(req,"slip_seq_to",true);
		 * dm.incmg_emp_no =
		 * Util.getSessionParameterValue(req,"incmg_emp_no",true); dm.fisc_dt =
		 * Util.getSessionParameterValue(req,"fisc_dt",true);
		 *******************************************************************************************/
	}

	public void fc_acct_2376_l(HttpServletRequest req, HttpServletResponse res)
			throws AppException, SQLException {
		FC_ACCT_2376_LDataSet ds = null;
		FC_ACCT_2376_LDM dm = new FC_ACCT_2376_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.slip_occr_dt = Util.checkString(req.getParameter("slip_occr_dt"));
		dm.slip_occr_dt2 = Util.checkString(req.getParameter("slip_occr_dt2"));
		dm.slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
		dm.slip_seq_fr = Util.checkString(req.getParameter("slip_seq_fr"));
		dm.slip_seq_to = Util.checkString(req.getParameter("slip_seq_to"));
		dm.incmg_emp_no = Util.getSessionParameterValue(req, "emp_no", true);
		dm.fisc_dt = Util.checkString(req.getParameter("fisc_dt"));

		/* EJB 수정후 시작 */
		ds = dao.fc_acct_2376_l(dm);

		if (!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/*
		 * EJB 수정전 시작 try { FC_ACCT_2000EJBHome home =
		 * (FC_ACCT_2000EJBHome)JNDIManager
		 * .getInstance().getHome("FC_ACCT_2000EJB"); FC_ACCT_2000EJB ejb =
		 * home.create();
		 * 
		 * ds = ejb.fc_acct_2376_l(dm); req.setAttribute("ds", ds); } catch
		 * (CreateException e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } catch (RemoteException
		 * e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } EJB 수정전 끝
		 */

		/*******************************************************************************************
		 * String multiUpdateData =
		 * Util.checkString(req.getParameter("multiUpdateData")); Hashtable hash
		 * = getHashMultiUpdateData(multiUpdateData);
		 * 
		 * dm.cmpy_cd = (String)hash.get("cmpy_cd"); dm.slip_occr_dt =
		 * (String)hash.get("slip_occr_dt"); dm.slip_occr_dt2 =
		 * (String)hash.get("slip_occr_dt2"); dm.slip_clsf_cd =
		 * (String)hash.get("slip_clsf_cd"); dm.slip_seq_fr =
		 * (String)hash.get("slip_seq_fr"); dm.slip_seq_to =
		 * (String)hash.get("slip_seq_to"); dm.incmg_emp_no =
		 * (String)hash.get("incmg_emp_no"); dm.fisc_dt =
		 * (String)hash.get("fisc_dt");
		 *******************************************************************************************/

		/*******************************************************************************************
		 * dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		 * dm.slip_occr_dt =
		 * Util.getSessionParameterValue(req,"slip_occr_dt",true);
		 * dm.slip_occr_dt2 =
		 * Util.getSessionParameterValue(req,"slip_occr_dt2",true);
		 * dm.slip_clsf_cd =
		 * Util.getSessionParameterValue(req,"slip_clsf_cd",true);
		 * dm.slip_seq_fr =
		 * Util.getSessionParameterValue(req,"slip_seq_fr",true); dm.slip_seq_to
		 * = Util.getSessionParameterValue(req,"slip_seq_to",true);
		 * dm.incmg_emp_no =
		 * Util.getSessionParameterValue(req,"incmg_emp_no",true); dm.fisc_dt =
		 * Util.getSessionParameterValue(req,"fisc_dt",true);
		 *******************************************************************************************/
	}

	public void fc_acct_2380_m(HttpServletRequest req, HttpServletResponse res)
			throws AppException, SQLException {
		FC_ACCT_2380_MDataSet ds = null;
		FC_ACCT_2380_MDM dm = new FC_ACCT_2380_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);

		/* EJB 수정후 시작 */
		ds = dao.fc_acct_2380_m(dm);

		if (!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/*
		 * EJB 수정전 시작 try { FC_ACCT_2000EJBHome home =
		 * (FC_ACCT_2000EJBHome)JNDIManager
		 * .getInstance().getHome("FC_ACCT_2000EJB"); FC_ACCT_2000EJB ejb =
		 * home.create();
		 * 
		 * ds = ejb.fc_acct_2380_m(dm); req.setAttribute("ds", ds); } catch
		 * (CreateException e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } catch (RemoteException
		 * e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } EJB 수정전 끝
		 */

		/*******************************************************************************************
		 * String multiUpdateData =
		 * Util.checkString(req.getParameter("multiUpdateData")); Hashtable hash
		 * = getHashMultiUpdateData(multiUpdateData);
		 * 
		 * dm.cmpy_cd = (String)hash.get("cmpy_cd");
		 *******************************************************************************************/

		/*******************************************************************************************
		 * dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		 *******************************************************************************************/
	}

	public void fc_acct_2381_l(HttpServletRequest req, HttpServletResponse res)
			throws AppException, SQLException {
		FC_ACCT_2381_LDataSet ds = null;
		FC_ACCT_2381_LDM dm = new FC_ACCT_2381_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.prof_type_cd = Util.checkString(req.getParameter("prof_type_cd"));
		dm.slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
		dm.slip_occr_dt = Util.checkString(req.getParameter("slip_occr_dt"));
		dm.slip_seq = Util.checkString(req.getParameter("slip_seq"));

		/* EJB 수정후 시작 */
		ds = dao.fc_acct_2381_l(dm);

		if (!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/*
		 * EJB 수정전 시작 try { FC_ACCT_2000EJBHome home =
		 * (FC_ACCT_2000EJBHome)JNDIManager
		 * .getInstance().getHome("FC_ACCT_2000EJB"); FC_ACCT_2000EJB ejb =
		 * home.create();
		 * 
		 * ds = ejb.fc_acct_2381_l(dm); req.setAttribute("ds", ds); } catch
		 * (CreateException e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } catch (RemoteException
		 * e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } EJB 수정전 끝
		 */

		/*******************************************************************************************
		 * String multiUpdateData =
		 * Util.checkString(req.getParameter("multiUpdateData")); Hashtable hash
		 * = getHashMultiUpdateData(multiUpdateData);
		 * 
		 * dm.cmpy_cd = (String)hash.get("cmpy_cd"); dm.prof_type_cd =
		 * (String)hash.get("prof_type_cd"); dm.slip_clsf_cd =
		 * (String)hash.get("slip_clsf_cd"); dm.slip_occr_dt =
		 * (String)hash.get("slip_occr_dt"); dm.slip_seq =
		 * (String)hash.get("slip_seq");
		 *******************************************************************************************/

		/*******************************************************************************************
		 * dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		 * dm.prof_type_cd =
		 * Util.getSessionParameterValue(req,"prof_type_cd",true);
		 * dm.slip_clsf_cd =
		 * Util.getSessionParameterValue(req,"slip_clsf_cd",true);
		 * dm.slip_occr_dt =
		 * Util.getSessionParameterValue(req,"slip_occr_dt",true); dm.slip_seq =
		 * Util.getSessionParameterValue(req,"slip_seq",true);
		 *******************************************************************************************/
	}

	public void fc_acct_2382_l(HttpServletRequest req, HttpServletResponse res)
			throws AppException, SQLException {
		FC_ACCT_2382_LDataSet ds = null;
		FC_ACCT_2382_LDM dm = new FC_ACCT_2382_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.slip_occr_dt = Util.checkString(req.getParameter("slip_occr_dt"));
		dm.slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
		dm.slip_seq = Util.checkString(req.getParameter("slip_seq"));
		dm.slip_sub_seq = Util.checkString(req.getParameter("slip_sub_seq"));
		dm.slip_arow_no = Util.checkString(req.getParameter("slip_arow_no"));

		/* EJB 수정후 시작 */
		ds = dao.fc_acct_2382_l(dm);

		if (!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/*
		 * EJB 수정전 시작 try { FC_ACCT_2000EJBHome home =
		 * (FC_ACCT_2000EJBHome)JNDIManager
		 * .getInstance().getHome("FC_ACCT_2000EJB"); FC_ACCT_2000EJB ejb =
		 * home.create();
		 * 
		 * ds = ejb.fc_acct_2382_l(dm); req.setAttribute("ds", ds); } catch
		 * (CreateException e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } catch (RemoteException
		 * e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } EJB 수정전 끝
		 */

		/*******************************************************************************************
		 * String multiUpdateData =
		 * Util.checkString(req.getParameter("multiUpdateData")); Hashtable hash
		 * = getHashMultiUpdateData(multiUpdateData);
		 * 
		 * dm.cmpy_cd = (String)hash.get("cmpy_cd"); dm.slip_occr_dt =
		 * (String)hash.get("slip_occr_dt"); dm.slip_clsf_cd =
		 * (String)hash.get("slip_clsf_cd"); dm.slip_seq =
		 * (String)hash.get("slip_seq"); dm.slip_sub_seq =
		 * (String)hash.get("slip_sub_seq"); dm.slip_arow_no =
		 * (String)hash.get("slip_arow_no");
		 *******************************************************************************************/

		/*******************************************************************************************
		 * dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		 * dm.slip_occr_dt =
		 * Util.getSessionParameterValue(req,"slip_occr_dt",true);
		 * dm.slip_clsf_cd =
		 * Util.getSessionParameterValue(req,"slip_clsf_cd",true); dm.slip_seq =
		 * Util.getSessionParameterValue(req,"slip_seq",true); dm.slip_sub_seq =
		 * Util.getSessionParameterValue(req,"slip_sub_seq",true);
		 * dm.slip_arow_no =
		 * Util.getSessionParameterValue(req,"slip_arow_no",true);
		 *******************************************************************************************/
	}

	public void fc_acct_2410_m(HttpServletRequest req, HttpServletResponse res)
			throws AppException, SQLException {
		FC_ACCT_2410_MDataSet ds = null;
		FC_ACCT_2410_MDM dm = new FC_ACCT_2410_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);

		dm.print();

		/* EJB 수정후 시작 */
		ds = dao.fc_acct_2410_m(dm);

		if (!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/*
		 * EJB 수정전 시작 try { FC_ACCT_2000EJBHome home =
		 * (FC_ACCT_2000EJBHome)JNDIManager
		 * .getInstance().getHome("FC_ACCT_2000EJB"); FC_ACCT_2000EJB ejb =
		 * home.create();
		 * 
		 * ds = ejb.fc_acct_2410_m(dm); req.setAttribute("ds", ds); } catch
		 * (CreateException e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } catch (RemoteException
		 * e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } EJB 수정전 끝
		 */

		/*******************************************************************************************
		 * String multiUpdateData =
		 * Util.checkString(req.getParameter("multiUpdateData")); Hashtable hash
		 * = getHashMultiUpdateData(multiUpdateData);
		 * 
		 * dm.cmpy_cd = (String)hash.get("cmpy_cd");
		 *******************************************************************************************/

		/*******************************************************************************************
		 * dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		 *******************************************************************************************/
	}

	public void fc_acct_2411_l(HttpServletRequest req, HttpServletResponse res)
			throws AppException, SQLException {

		long start_tm = System.currentTimeMillis();

		FC_ACCT_2411_LDataSet ds = null;
		FC_ACCT_2411_LDM dm = new FC_ACCT_2411_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.acct_cd = Util.checkString(req.getParameter("acct_cd"));
		dm.frfisc_dt = Util.checkString(req.getParameter("frfisc_dt"));
		dm.tofisc_dt = Util.checkString(req.getParameter("tofisc_dt"));
		dm.dlco_clsf_cd = Util.checkString(req.getParameter("dlco_clsf_cd"));
		dm.dlco_cd = Util.checkString(req.getParameter("dlco_cd"));
		dm.medi_cd = Util.checkString(req.getParameter("medi_cd"));
		dm.mang_clsf_cd = Util.checkString(req.getParameter("mang_clsf_cd"));
		dm.evnt_cd = Util.checkString(req.getParameter("evnt_cd"));
		dm.clam_dept_cd = Util.checkString(req.getParameter("clam_dept_cd"));
		dm.slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
		dm.dr_amt = Util.checkString(req.getParameter("dr_amt"));
		dm.crdt_amt = Util.checkString(req.getParameter("crdt_amt"));
		dm.incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
		dm.drcr_clsf1 = Util.checkString(req.getParameter("drcr_clsf1"));
		dm.drcr_clsf2 = Util.checkString(req.getParameter("drcr_clsf2"));
		dm.pch_x = Util.checkString(req.getParameter("pch_x"));
		dm.tran_slip_clsf = Util.checkString(req.getParameter("tran_slip_clsf"));
		dm.dt_clsf = Util.checkString(req.getParameter("dt_clsf"));
		dm.chnl_clsf_cd = Util.checkString(req.getParameter("chnl_clsf_cd")); 

		dm.print();

		/* EJB 수정후 시작 */
		ds = dao.fc_acct_2411_l(dm);

		if (!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/*
		 * EJB 수정전 시작 try { FC_ACCT_2000EJBHome home =
		 * (FC_ACCT_2000EJBHome)JNDIManager
		 * .getInstance().getHome("FC_ACCT_2000EJB"); FC_ACCT_2000EJB ejb =
		 * home.create();
		 * 
		 * ds = ejb.fc_acct_2411_l(dm); req.setAttribute("ds", ds);
		 * 
		 * long end_tm = System.currentTimeMillis();
		 * 
		 * System.out.println("elapsed = " + (end_tm - start_tm));
		 * 
		 * } catch (CreateException e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } catch (RemoteException
		 * e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } EJB 수정전 끝
		 */

		/*******************************************************************************************
		 * String multiUpdateData =
		 * Util.checkString(req.getParameter("multiUpdateData")); Hashtable hash
		 * = getHashMultiUpdateData(multiUpdateData);
		 * 
		 * dm.cmpy_cd = (String)hash.get("cmpy_cd"); dm.acct_cd =
		 * (String)hash.get("acct_cd"); dm.frfisc_dt =
		 * (String)hash.get("frfisc_dt"); dm.tofisc_dt =
		 * (String)hash.get("tofisc_dt"); dm.dlco_clsf_cd =
		 * (String)hash.get("dlco_clsf_cd"); dm.dlco_cd =
		 * (String)hash.get("dlco_cd"); dm.medi_cd =
		 * (String)hash.get("medi_cd"); dm.mang_clsf_cd =
		 * (String)hash.get("mang_clsf_cd"); dm.evnt_cd =
		 * (String)hash.get("evnt_cd"); dm.clam_dept_cd =
		 * (String)hash.get("clam_dept_cd"); dm.slip_clsf_cd =
		 * (String)hash.get("slip_clsf_cd"); dm.dr_amt =
		 * (String)hash.get("dr_amt"); dm.crdt_amt =
		 * (String)hash.get("crdt_amt"); dm.incmg_pers =
		 * (String)hash.get("incmg_pers"); dm.drcr_clsf1 =
		 * (String)hash.get("drcr_clsf1"); dm.drcr_clsf2 =
		 * (String)hash.get("drcr_clsf2"); dm.pch_x = (String)hash.get("pch_x");
		 *******************************************************************************************/

		/*******************************************************************************************
		 * dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		 * dm.acct_cd = Util.getSessionParameterValue(req,"acct_cd",true);
		 * dm.frfisc_dt = Util.getSessionParameterValue(req,"frfisc_dt",true);
		 * dm.tofisc_dt = Util.getSessionParameterValue(req,"tofisc_dt",true);
		 * dm.dlco_clsf_cd =
		 * Util.getSessionParameterValue(req,"dlco_clsf_cd",true); dm.dlco_cd =
		 * Util.getSessionParameterValue(req,"dlco_cd",true); dm.medi_cd =
		 * Util.getSessionParameterValue(req,"medi_cd",true); dm.mang_clsf_cd =
		 * Util.getSessionParameterValue(req,"mang_clsf_cd",true); dm.evnt_cd =
		 * Util.getSessionParameterValue(req,"evnt_cd",true); dm.clam_dept_cd =
		 * Util.getSessionParameterValue(req,"clam_dept_cd",true);
		 * dm.slip_clsf_cd =
		 * Util.getSessionParameterValue(req,"slip_clsf_cd",true); dm.dr_amt =
		 * Util.getSessionParameterValue(req,"dr_amt",true); dm.crdt_amt =
		 * Util.getSessionParameterValue(req,"crdt_amt",true); dm.incmg_pers =
		 * Util.getSessionParameterValue(req,"incmg_pers",true); dm.drcr_clsf1 =
		 * Util.getSessionParameterValue(req,"drcr_clsf1",true); dm.drcr_clsf2 =
		 * Util.getSessionParameterValue(req,"drcr_clsf2",true); dm.pch_x =
		 * Util.getSessionParameterValue(req,"pch_x",true);
		 *******************************************************************************************/
	}

	public void fc_acct_2420_m(HttpServletRequest req, HttpServletResponse res)
			throws AppException, SQLException {
		FC_ACCT_2420_MDataSet ds = null;
		FC_ACCT_2420_MDM dm = new FC_ACCT_2420_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);

		dm.print();

		/* EJB 수정후 시작 */
		ds = dao.fc_acct_2420_m(dm);

		if (!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/*
		 * EJB 수정전 시작 try { FC_ACCT_2000EJBHome home =
		 * (FC_ACCT_2000EJBHome)JNDIManager
		 * .getInstance().getHome("FC_ACCT_2000EJB"); FC_ACCT_2000EJB ejb =
		 * home.create();
		 * 
		 * ds = ejb.fc_acct_2420_m(dm); req.setAttribute("ds", ds); } catch
		 * (CreateException e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } catch (RemoteException
		 * e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } EJB 수정전 끝
		 */

		/*******************************************************************************************
		 * String multiUpdateData =
		 * Util.checkString(req.getParameter("multiUpdateData")); Hashtable hash
		 * = getHashMultiUpdateData(multiUpdateData);
		 * 
		 * dm.cmpy_cd = (String)hash.get("cmpy_cd");
		 *******************************************************************************************/

		/*******************************************************************************************
		 * dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		 *******************************************************************************************/
	}

	public void fc_acct_2421_l(HttpServletRequest req, HttpServletResponse res)
			throws AppException, SQLException {
		FC_ACCT_2421_LDataSet ds = null;
		FC_ACCT_2421_LDM dm = new FC_ACCT_2421_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.acct_cd1 = Util.checkString(req.getParameter("acct_cd1"));
		dm.acct_cd2 = Util.checkString(req.getParameter("acct_cd2"));
		dm.frfisc_dt = Util.checkString(req.getParameter("frfisc_dt"));
		dm.tofisc_dt = Util.checkString(req.getParameter("tofisc_dt"));
		dm.dlco_clsf_cd = Util.checkString(req.getParameter("dlco_clsf_cd"));
		dm.dlco_cd = Util.checkString(req.getParameter("dlco_cd"));

		dm.print();

		/* EJB 수정후 시작 */
		ds = dao.fc_acct_2421_l(dm);

		if (!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/*
		 * EJB 수정전 시작 try { FC_ACCT_2000EJBHome home =
		 * (FC_ACCT_2000EJBHome)JNDIManager
		 * .getInstance().getHome("FC_ACCT_2000EJB"); FC_ACCT_2000EJB ejb =
		 * home.create();
		 * 
		 * ds = ejb.fc_acct_2421_l(dm); req.setAttribute("ds", ds); } catch
		 * (CreateException e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } catch (RemoteException
		 * e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } EJB 수정전 끝
		 */

		/*******************************************************************************************
		 * String multiUpdateData =
		 * Util.checkString(req.getParameter("multiUpdateData")); Hashtable hash
		 * = getHashMultiUpdateData(multiUpdateData);
		 * 
		 * dm.cmpy_cd = (String)hash.get("cmpy_cd"); dm.acct_cd1 =
		 * (String)hash.get("acct_cd1"); dm.acct_cd2 =
		 * (String)hash.get("acct_cd2"); dm.frfisc_dt =
		 * (String)hash.get("frfisc_dt"); dm.tofisc_dt =
		 * (String)hash.get("tofisc_dt"); dm.dlco_clsf_cd =
		 * (String)hash.get("dlco_clsf_cd"); dm.dlco_cd =
		 * (String)hash.get("dlco_cd");
		 *******************************************************************************************/

		/*******************************************************************************************
		 * dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		 * dm.acct_cd1 = Util.getSessionParameterValue(req,"acct_cd1",true);
		 * dm.acct_cd2 = Util.getSessionParameterValue(req,"acct_cd2",true);
		 * dm.frfisc_dt = Util.getSessionParameterValue(req,"frfisc_dt",true);
		 * dm.tofisc_dt = Util.getSessionParameterValue(req,"tofisc_dt",true);
		 * dm.dlco_clsf_cd =
		 * Util.getSessionParameterValue(req,"dlco_clsf_cd",true); dm.dlco_cd =
		 * Util.getSessionParameterValue(req,"dlco_cd",true);
		 *******************************************************************************************/
	}

	public void fc_acct_2470_m(HttpServletRequest req, HttpServletResponse res)
			throws AppException, SQLException {
		FC_ACCT_2470_MDataSet ds = null;
		FC_ACCT_2470_MDM dm = new FC_ACCT_2470_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);

		/* EJB 수정후 시작 */
		ds = dao.fc_acct_2470_m(dm);

		if (!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/*
		 * EJB 수정전 시작 try { FC_ACCT_2000EJBHome home =
		 * (FC_ACCT_2000EJBHome)JNDIManager
		 * .getInstance().getHome("FC_ACCT_2000EJB"); FC_ACCT_2000EJB ejb =
		 * home.create();
		 * 
		 * ds = ejb.fc_acct_2470_m(dm); req.setAttribute("ds", ds); } catch
		 * (CreateException e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } catch (RemoteException
		 * e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } EJB 수정전 끝
		 */

		/*******************************************************************************************
		 * String multiUpdateData =
		 * Util.checkString(req.getParameter("multiUpdateData")); Hashtable hash
		 * = getHashMultiUpdateData(multiUpdateData);
		 * 
		 * dm.cmpy_cd = (String)hash.get("cmpy_cd");
		 *******************************************************************************************/

		/*******************************************************************************************
		 * dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		 *******************************************************************************************/
	}

	public void fc_acct_2471_l(HttpServletRequest req, HttpServletResponse res)
			throws AppException, SQLException {
		FC_ACCT_2471_LDataSet ds = null;
		FC_ACCT_2471_LDM dm = new FC_ACCT_2471_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.slip_occr_dt = Util.checkString(req.getParameter("slip_occr_dt1"));
		dm.slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd1"));
		dm.slip_seq = Util.checkString(req.getParameter("slip_seq1"));
		dm.slip_sub_seq = Util.checkString(req.getParameter("slip_sub_seq1"));
		dm.kind = Util.checkString(req.getParameter("kind"));
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);

		/* EJB 수정후 시작 */
		ds = dao.fc_acct_2471_l(dm);

		if (!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/*
		 * EJB 수정전 시작 try { FC_ACCT_2000EJBHome home =
		 * (FC_ACCT_2000EJBHome)JNDIManager
		 * .getInstance().getHome("FC_ACCT_2000EJB"); FC_ACCT_2000EJB ejb =
		 * home.create();
		 * 
		 * ds = ejb.fc_acct_2471_l(dm); req.setAttribute("ds", ds); } catch
		 * (CreateException e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } catch (RemoteException
		 * e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } EJB 수정전 끝
		 */

		/*******************************************************************************************
		 * String multiUpdateData =
		 * Util.checkString(req.getParameter("multiUpdateData")); Hashtable hash
		 * = getHashMultiUpdateData(multiUpdateData);
		 * 
		 * dm.cmpy_cd = (String)hash.get("cmpy_cd"); dm.slip_occr_dt =
		 * (String)hash.get("slip_occr_dt"); dm.slip_clsf_cd =
		 * (String)hash.get("slip_clsf_cd"); dm.slip_seq =
		 * (String)hash.get("slip_seq"); dm.slip_sub_seq =
		 * (String)hash.get("slip_sub_seq"); dm.kind = (String)hash.get("kind");
		 *******************************************************************************************/

		/*******************************************************************************************
		 * dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		 * dm.slip_occr_dt =
		 * Util.getSessionParameterValue(req,"slip_occr_dt",true);
		 * dm.slip_clsf_cd =
		 * Util.getSessionParameterValue(req,"slip_clsf_cd",true); dm.slip_seq =
		 * Util.getSessionParameterValue(req,"slip_seq",true); dm.slip_sub_seq =
		 * Util.getSessionParameterValue(req,"slip_sub_seq",true); dm.kind =
		 * Util.getSessionParameterValue(req,"kind",true);
		 *******************************************************************************************/
	}

	public void fc_acct_2472_u(HttpServletRequest req, HttpServletResponse res)
			throws AppException, SQLException {
		FC_ACCT_2472_UDataSet ds = null;
		FC_ACCT_2472_UDM dm = new FC_ACCT_2472_UDM();

		String multiUpdateData = Util.checkString(req
				.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.slip_occr_dt = Util.checkString(req.getParameter("slip_occr_dt"));
		dm.slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
		dm.slip_seq = Util.checkString(req.getParameter("slip_seq"));
		dm.slip_sub_seq = Util.checkString(req.getParameter("slip_sub_seq"));
		dm.mode = (String) hash.get("m");
		dm.slip_arow_no = (String) hash.get("slip_arow_no");
		dm.boks_dlco_nm = (String) hash.get("boks_dlco_nm");
		dm.use_dept_cd = (String) hash.get("use_dept_cd");
		dm.prop_equip_cd = (String) hash.get("prop_equip_cd");
		dm.rmks1 = Util.checkString(req.getParameter("rmks1"));
		dm.rmks2 = (String) hash.get("rmks2");
		dm.medi_cd = (String) hash.get("medi_cd");

		dm.dtls_medi_cd = (String) hash.get("dtls_medi_cd");
		dm.pch_x = Util.checkString(req.getParameter("pch_x"));

		dm.dtls_medi_cd = (String) hash.get("dtls_medi_cd");
		dm.pch_x = Util.checkString(req.getParameter("pch_x"));

		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);

		dm.print();

		/* EJB 수정후 시작 */
		ds = dao.fc_acct_2472_u(dm);

		if (!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/*
		 * EJB 수정전 시작 try { FC_ACCT_2000EJBHome home =
		 * (FC_ACCT_2000EJBHome)JNDIManager
		 * .getInstance().getHome("FC_ACCT_2000EJB"); FC_ACCT_2000EJB ejb =
		 * home.create();
		 * 
		 * ds = ejb.fc_acct_2472_u(dm); req.setAttribute("ds", ds); } catch
		 * (CreateException e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } catch (RemoteException
		 * e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } EJB 수정전 끝
		 */

		/*******************************************************************************************
		 * String multiUpdateData =
		 * Util.checkString(req.getParameter("multiUpdateData")); Hashtable hash
		 * = getHashMultiUpdateData(multiUpdateData);
		 * 
		 * dm.cmpy_cd = (String)hash.get("cmpy_cd"); dm.slip_occr_dt =
		 * (String)hash.get("slip_occr_dt"); dm.slip_clsf_cd =
		 * (String)hash.get("slip_clsf_cd"); dm.slip_seq =
		 * (String)hash.get("slip_seq"); dm.slip_sub_seq =
		 * (String)hash.get("slip_sub_seq"); dm.mode = (String)hash.get("mode");
		 * dm.slip_arow_no = (String)hash.get("slip_arow_no"); dm.boks_dlco_nm =
		 * (String)hash.get("boks_dlco_nm"); dm.use_dept_cd =
		 * (String)hash.get("use_dept_cd"); dm.prop_equip_cd =
		 * (String)hash.get("prop_equip_cd"); dm.rmks1 =
		 * (String)hash.get("rmks1"); dm.rmks2 = (String)hash.get("rmks2");
		 * dm.medi_cd = (String)hash.get("medi_cd"); dm.dtls_medi_cd =
		 * (String)hash.get("dtls_medi_cd"); dm.pch_x =
		 * (String)hash.get("pch_x");
		 *******************************************************************************************/

		/*******************************************************************************************
		 * dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		 * dm.slip_occr_dt =
		 * Util.getSessionParameterValue(req,"slip_occr_dt",true);
		 * dm.slip_clsf_cd =
		 * Util.getSessionParameterValue(req,"slip_clsf_cd",true); dm.slip_seq =
		 * Util.getSessionParameterValue(req,"slip_seq",true); dm.slip_sub_seq =
		 * Util.getSessionParameterValue(req,"slip_sub_seq",true); dm.mode =
		 * Util.getSessionParameterValue(req,"mode",true); dm.slip_arow_no =
		 * Util.getSessionParameterValue(req,"slip_arow_no",true);
		 * dm.boks_dlco_nm =
		 * Util.getSessionParameterValue(req,"boks_dlco_nm",true);
		 * dm.use_dept_cd =
		 * Util.getSessionParameterValue(req,"use_dept_cd",true);
		 * dm.prop_equip_cd =
		 * Util.getSessionParameterValue(req,"prop_equip_cd",true); dm.rmks1 =
		 * Util.getSessionParameterValue(req,"rmks1",true); dm.rmks2 =
		 * Util.getSessionParameterValue(req,"rmks2",true); dm.medi_cd =
		 * Util.getSessionParameterValue(req,"medi_cd",true); dm.dtls_medi_cd =
		 * Util.getSessionParameterValue(req,"dtls_medi_cd",true); dm.pch_x =
		 * Util.getSessionParameterValue(req,"pch_x",true);
		 *******************************************************************************************/
	}

	public void fc_acct_2473_s(HttpServletRequest req, HttpServletResponse res)
			throws AppException, SQLException {
		FC_ACCT_2473_SDataSet ds = null;
		FC_ACCT_2473_SDM dm = new FC_ACCT_2473_SDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.slip_occr_dt = Util.checkString(req.getParameter("slip_occr_dt"));
		dm.slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
		dm.slip_seq = Util.checkString(req.getParameter("slip_seq"));
		dm.slip_sub_seq = Util.checkString(req.getParameter("slip_sub_seq"));
		dm.slip_arow_no = Util.checkString(req.getParameter("slip_arow_no"));

		/* EJB 수정후 시작 */
		ds = dao.fc_acct_2473_s(dm);

		if (!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/*
		 * EJB 수정전 시작 try { FC_ACCT_2000EJBHome home =
		 * (FC_ACCT_2000EJBHome)JNDIManager
		 * .getInstance().getHome("FC_ACCT_2000EJB"); FC_ACCT_2000EJB ejb =
		 * home.create();
		 * 
		 * ds = ejb.fc_acct_2473_s(dm); req.setAttribute("ds", ds); } catch
		 * (CreateException e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } catch (RemoteException
		 * e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } EJB 수정전 끝
		 */

		/*******************************************************************************************
		 * String multiUpdateData =
		 * Util.checkString(req.getParameter("multiUpdateData")); Hashtable hash
		 * = getHashMultiUpdateData(multiUpdateData);
		 * 
		 * dm.cmpy_cd = (String)hash.get("cmpy_cd"); dm.slip_occr_dt =
		 * (String)hash.get("slip_occr_dt"); dm.slip_clsf_cd =
		 * (String)hash.get("slip_clsf_cd"); dm.slip_seq =
		 * (String)hash.get("slip_seq"); dm.slip_sub_seq =
		 * (String)hash.get("slip_sub_seq"); dm.slip_arow_no =
		 * (String)hash.get("slip_arow_no");
		 *******************************************************************************************/

		/*******************************************************************************************
		 * dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		 * dm.slip_occr_dt =
		 * Util.getSessionParameterValue(req,"slip_occr_dt",true);
		 * dm.slip_clsf_cd =
		 * Util.getSessionParameterValue(req,"slip_clsf_cd",true); dm.slip_seq =
		 * Util.getSessionParameterValue(req,"slip_seq",true); dm.slip_sub_seq =
		 * Util.getSessionParameterValue(req,"slip_sub_seq",true);
		 * dm.slip_arow_no =
		 * Util.getSessionParameterValue(req,"slip_arow_no",true);
		 *******************************************************************************************/
	}

	public void fc_acct_2480_m(HttpServletRequest req, HttpServletResponse res)
			throws AppException, SQLException {
		FC_ACCT_2480_MDataSet ds = null;
		FC_ACCT_2480_MDM dm = new FC_ACCT_2480_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);

		dm.print();

		/* EJB 수정후 시작 */
		ds = dao.fc_acct_2480_m(dm);

		if (!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/*
		 * EJB 수정전 시작 try { FC_ACCT_2000EJBHome home =
		 * (FC_ACCT_2000EJBHome)JNDIManager
		 * .getInstance().getHome("FC_ACCT_2000EJB"); FC_ACCT_2000EJB ejb =
		 * home.create();
		 * 
		 * ds = ejb.fc_acct_2480_m(dm); req.setAttribute("ds", ds); } catch
		 * (CreateException e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } catch (RemoteException
		 * e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } EJB 수정전 끝
		 */

		/*******************************************************************************************
		 * String multiUpdateData =
		 * Util.checkString(req.getParameter("multiUpdateData")); Hashtable hash
		 * = getHashMultiUpdateData(multiUpdateData);
		 * 
		 * dm.cmpy_cd = (String)hash.get("cmpy_cd");
		 *******************************************************************************************/

		/*******************************************************************************************
		 * dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		 *******************************************************************************************/
	}

	public void fc_acct_2481_l(HttpServletRequest req, HttpServletResponse res)
			throws AppException, SQLException {
		FC_ACCT_2481_LDataSet ds = null;
		FC_ACCT_2481_LDM dm = new FC_ACCT_2481_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.frbudg_cd = Util.checkString(req.getParameter("frbudg_cd"));
		dm.tobudg_cd = Util.checkString(req.getParameter("tobudg_cd"));
		dm.frfisc_dt = Util.checkString(req.getParameter("frfisc_dt"));
		dm.tofisc_dt = Util.checkString(req.getParameter("tofisc_dt"));
		dm.dlco_clsf_cd = Util.checkString(req.getParameter("dlco_clsf_cd"));
		dm.dlco_cd = Util.checkString(req.getParameter("dlco_cd"));
		dm.medi_cd = Util.checkString(req.getParameter("medi_cd"));
		dm.dtls_medi_cd = Util.checkString(req.getParameter("dtls_medi_cd"));
		dm.mang_clsf_cd = Util.checkString(req.getParameter("mang_clsf_cd"));
		dm.to_mang_clsf_cd = Util.checkString(req.getParameter("to_mang_clsf_cd"));
		dm.evnt_cd = Util.checkString(req.getParameter("evnt_cd"));
		dm.clam_dept_cd = Util.checkString(req.getParameter("clam_dept_cd"));
		dm.to_clam_dept_cd = Util.checkString(req.getParameter("to_clam_dept_cd"));
		dm.use_dept_cd = Util.checkString(req.getParameter("use_dept_cd"));
		dm.to_use_dept_cd = Util.checkString(req.getParameter("to_use_dept_cd"));		
		dm.slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
		dm.dr_amt = Util.checkString(req.getParameter("dr_amt"));
		dm.crdt_amt = Util.checkString(req.getParameter("crdt_amt"));
		dm.incmg_emp_no = Util.checkString(req.getParameter("incmg_emp_no"));
		dm.drcr_clsf1 = Util.checkString(req.getParameter("drcr_clsf1"));
		dm.drcr_clsf2 = Util.checkString(req.getParameter("drcr_clsf2"));
		dm.remk = Util.checkString(req.getParameter("remk"));
		dm.incm_clsf_cd = Util.checkString(req.getParameter("incm_clsf_cd"));
		dm.chnl_clsf_cd = Util.checkString(req.getParameter("chnl_clsf_cd"));
		dm.slip_aprv_yn = Util.checkString(req.getParameter("slip_aprv_yn"));
		dm.prop_equip_cd = Util.checkString(req.getParameter("prop_equip_cd"));
		/* EJB 수정후 시작 */
		ds = dao.fc_acct_2481_l(dm);

		if (!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/*
		 * EJB 수정전 시작 try { FC_ACCT_2000EJBHome home =
		 * (FC_ACCT_2000EJBHome)JNDIManager
		 * .getInstance().getHome("FC_ACCT_2000EJB"); FC_ACCT_2000EJB ejb =
		 * home.create();
		 * 
		 * ds = ejb.fc_acct_2481_l(dm); req.setAttribute("ds", ds); } catch
		 * (CreateException e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } catch (RemoteException
		 * e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } EJB 수정전 끝
		 */

		/*******************************************************************************************
		 * String multiUpdateData =
		 * Util.checkString(req.getParameter("multiUpdateData")); Hashtable hash
		 * = getHashMultiUpdateData(multiUpdateData);
		 * 
		 * dm.cmpy_cd = (String)hash.get("cmpy_cd"); dm.frbudg_cd =
		 * (String)hash.get("frbudg_cd"); dm.tobudg_cd =
		 * (String)hash.get("tobudg_cd"); dm.frfisc_dt =
		 * (String)hash.get("frfisc_dt"); dm.tofisc_dt =
		 * (String)hash.get("tofisc_dt"); dm.dlco_clsf_cd =
		 * (String)hash.get("dlco_clsf_cd"); dm.dlco_cd =
		 * (String)hash.get("dlco_cd"); dm.medi_cd =
		 * (String)hash.get("medi_cd"); dm.mang_clsf_cd =
		 * (String)hash.get("mang_clsf_cd"); dm.evnt_cd =
		 * (String)hash.get("evnt_cd"); dm.clam_dept_cd =
		 * (String)hash.get("clam_dept_cd"); dm.slip_clsf_cd =
		 * (String)hash.get("slip_clsf_cd"); dm.dr_amt =
		 * (String)hash.get("dr_amt"); dm.crdt_amt =
		 * (String)hash.get("crdt_amt"); dm.incmg_emp_no =
		 * (String)hash.get("incmg_emp_no"); dm.drcr_clsf1 =
		 * (String)hash.get("drcr_clsf1"); dm.drcr_clsf2 =
		 * (String)hash.get("drcr_clsf2");
		 *******************************************************************************************/

		/*******************************************************************************************
		 * dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		 * dm.frbudg_cd = Util.getSessionParameterValue(req,"frbudg_cd",true);
		 * dm.tobudg_cd = Util.getSessionParameterValue(req,"tobudg_cd",true);
		 * dm.frfisc_dt = Util.getSessionParameterValue(req,"frfisc_dt",true);
		 * dm.tofisc_dt = Util.getSessionParameterValue(req,"tofisc_dt",true);
		 * dm.dlco_clsf_cd =
		 * Util.getSessionParameterValue(req,"dlco_clsf_cd",true); dm.dlco_cd =
		 * Util.getSessionParameterValue(req,"dlco_cd",true); dm.medi_cd =
		 * Util.getSessionParameterValue(req,"medi_cd",true); dm.mang_clsf_cd =
		 * Util.getSessionParameterValue(req,"mang_clsf_cd",true); dm.evnt_cd =
		 * Util.getSessionParameterValue(req,"evnt_cd",true); dm.clam_dept_cd =
		 * Util.getSessionParameterValue(req,"clam_dept_cd",true);
		 * dm.slip_clsf_cd =
		 * Util.getSessionParameterValue(req,"slip_clsf_cd",true); dm.dr_amt =
		 * Util.getSessionParameterValue(req,"dr_amt",true); dm.crdt_amt =
		 * Util.getSessionParameterValue(req,"crdt_amt",true); dm.incmg_emp_no =
		 * Util.getSessionParameterValue(req,"incmg_emp_no",true); dm.drcr_clsf1
		 * = Util.getSessionParameterValue(req,"drcr_clsf1",true); dm.drcr_clsf2
		 * = Util.getSessionParameterValue(req,"drcr_clsf2",true);
		 *******************************************************************************************/
	}

	public void fc_acct_2490_m(HttpServletRequest req, HttpServletResponse res)
			throws AppException, SQLException {
		FC_ACCT_2490_MDataSet ds = null;
		FC_ACCT_2490_MDM dm = new FC_ACCT_2490_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.budg_cd = Util.checkString(req.getParameter("budg_cd"));
		dm.budg_nm = Util.checkString(req.getParameter("budg_nm"));

		dm.print();

		/* EJB 수정후 시작 */
		ds = dao.fc_acct_2490_m(dm);

		if (!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/*
		 * EJB 수정전 시작 try { FC_ACCT_2000EJBHome home =
		 * (FC_ACCT_2000EJBHome)JNDIManager
		 * .getInstance().getHome("FC_ACCT_2000EJB"); FC_ACCT_2000EJB ejb =
		 * home.create();
		 * 
		 * ds = ejb.fc_acct_2490_m(dm); req.setAttribute("ds", ds); } catch
		 * (CreateException e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } catch (RemoteException
		 * e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } EJB 수정전 끝
		 */

		/*******************************************************************************************
		 * String multiUpdateData =
		 * Util.checkString(req.getParameter("multiUpdateData")); Hashtable hash
		 * = getHashMultiUpdateData(multiUpdateData);
		 * 
		 * dm.cmpy_cd = (String)hash.get("cmpy_cd"); dm.dept_cd =
		 * (String)hash.get("dept_cd"); dm.budg_cd =
		 * (String)hash.get("budg_cd"); dm.budg_nm =
		 * (String)hash.get("budg_nm");
		 *******************************************************************************************/
	}

	public void fc_acct_2491_l(HttpServletRequest req, HttpServletResponse res)
			throws AppException, SQLException {
		FC_ACCT_2491_LDataSet ds = null;
		FC_ACCT_2491_LDM dm = new FC_ACCT_2491_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.frbudg_cd = Util.checkString(req.getParameter("frbudg_cd"));
		dm.tobudg_cd = Util.checkString(req.getParameter("tobudg_cd"));
		dm.frfisc_dt = Util.checkString(req.getParameter("frfisc_dt"));
		dm.tofisc_dt = Util.checkString(req.getParameter("tofisc_dt"));
		dm.dlco_clsf_cd = Util.checkString(req.getParameter("dlco_clsf_cd"));
		dm.dlco_cd = Util.checkString(req.getParameter("dlco_cd"));
		dm.medi_cd = Util.checkString(req.getParameter("medi_cd"));
		dm.mang_clsf_cd = Util.checkString(req.getParameter("mang_clsf_cd"));
		dm.evnt_cd = Util.checkString(req.getParameter("evnt_cd"));
		dm.clam_dept_cd = Util.checkString(req.getParameter("clam_dept_cd"));
		dm.slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
		dm.dr_amt = Util.checkString(req.getParameter("dr_amt"));
		dm.crdt_amt = Util.checkString(req.getParameter("crdt_amt"));
		dm.incmg_emp_no = Util.checkString(req.getParameter("incmg_emp_no"));
		dm.drcr_clsf1 = Util.checkString(req.getParameter("drcr_clsf1"));
		dm.drcr_clsf2 = Util.checkString(req.getParameter("drcr_clsf2"));

		dm.print();

		/* EJB 수정후 시작 */
		ds = dao.fc_acct_2491_l(dm);

		if (!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/*
		 * EJB 수정전 시작 try { FC_ACCT_2000EJBHome home =
		 * (FC_ACCT_2000EJBHome)JNDIManager
		 * .getInstance().getHome("FC_ACCT_2000EJB"); FC_ACCT_2000EJB ejb =
		 * home.create();
		 * 
		 * ds = ejb.fc_acct_2491_l(dm); req.setAttribute("ds", ds); } catch
		 * (CreateException e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } catch (RemoteException
		 * e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } EJB 수정전 끝
		 */

		/*******************************************************************************************
		 * String multiUpdateData =
		 * Util.checkString(req.getParameter("multiUpdateData")); Hashtable hash
		 * = getHashMultiUpdateData(multiUpdateData);
		 * 
		 * dm.cmpy_cd = (String)hash.get("cmpy_cd"); dm.frbudg_cd =
		 * (String)hash.get("frbudg_cd"); dm.tobudg_cd =
		 * (String)hash.get("tobudg_cd"); dm.frfisc_dt =
		 * (String)hash.get("frfisc_dt"); dm.tofisc_dt =
		 * (String)hash.get("tofisc_dt"); dm.dlco_clsf_cd =
		 * (String)hash.get("dlco_clsf_cd"); dm.dlco_cd =
		 * (String)hash.get("dlco_cd"); dm.medi_cd =
		 * (String)hash.get("medi_cd"); dm.mang_clsf_cd =
		 * (String)hash.get("mang_clsf_cd"); dm.evnt_cd =
		 * (String)hash.get("evnt_cd"); dm.clam_dept_cd =
		 * (String)hash.get("clam_dept_cd"); dm.slip_clsf_cd =
		 * (String)hash.get("slip_clsf_cd"); dm.dr_amt =
		 * (String)hash.get("dr_amt"); dm.crdt_amt =
		 * (String)hash.get("crdt_amt"); dm.incmg_emp_no =
		 * (String)hash.get("incmg_emp_no"); dm.drcr_clsf1 =
		 * (String)hash.get("drcr_clsf1"); dm.drcr_clsf2 =
		 * (String)hash.get("drcr_clsf2");
		 *******************************************************************************************/
	}

	public void fc_acct_2492_s(HttpServletRequest req, HttpServletResponse res)
			throws AppException, SQLException {
		FC_ACCT_2492_SDataSet ds = null;
		FC_ACCT_2492_SDM dm = new FC_ACCT_2492_SDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.clam_dept_cd = Util.checkString(req.getParameter("clam_dept_cd"));

		dm.print();

		/* EJB 수정후 시작 */
		ds = dao.fc_acct_2492_s(dm);

		if (!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/*
		 * EJB 수정전 시작 try { FC_ACCT_2000EJBHome home =
		 * (FC_ACCT_2000EJBHome)JNDIManager
		 * .getInstance().getHome("FC_ACCT_2000EJB"); FC_ACCT_2000EJB ejb =
		 * home.create();
		 * 
		 * ds = ejb.fc_acct_2492_s(dm); req.setAttribute("ds", ds); } catch
		 * (CreateException e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } catch (RemoteException
		 * e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } EJB 수정전 끝
		 */

		/*******************************************************************************************
		 * String multiUpdateData =
		 * Util.checkString(req.getParameter("multiUpdateData")); Hashtable hash
		 * = getHashMultiUpdateData(multiUpdateData);
		 * 
		 * dm.cmpy_cd = (String)hash.get("cmpy_cd"); dm.clam_dept_cd =
		 * (String)hash.get("clam_dept_cd");
		 *******************************************************************************************/

		/*******************************************************************************************
		 * dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		 * dm.clam_dept_cd =
		 * Util.getSessionParameterValue(req,"clam_dept_cd",true);
		 *******************************************************************************************/
	}

	public void fc_acct_2500_m(HttpServletRequest req, HttpServletResponse res)
			throws AppException, SQLException {
		FC_ACCT_2500_MDataSet ds = null;
		FC_ACCT_2500_MDM dm = new FC_ACCT_2500_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);

		dm.print();

		/* EJB 수정후 시작 */
		ds = dao.fc_acct_2500_m(dm);

		if (!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/*
		 * EJB 수정전 시작 try { FC_ACCT_2000EJBHome home =
		 * (FC_ACCT_2000EJBHome)JNDIManager
		 * .getInstance().getHome("FC_ACCT_2000EJB"); FC_ACCT_2000EJB ejb =
		 * home.create();
		 * 
		 * ds = ejb.fc_acct_2500_m(dm); req.setAttribute("ds", ds); } catch
		 * (CreateException e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } catch (RemoteException
		 * e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } EJB 수정전 끝
		 */

		/*******************************************************************************************
		 * String multiUpdateData =
		 * Util.checkString(req.getParameter("multiUpdateData")); Hashtable hash
		 * = getHashMultiUpdateData(multiUpdateData);
		 * 
		 * dm.cmpy_cd = (String)hash.get("cmpy_cd");
		 *******************************************************************************************/

		/*******************************************************************************************
		 * dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		 *******************************************************************************************/
	}

	public void fc_acct_2501_l(HttpServletRequest req, HttpServletResponse res)
			throws AppException, SQLException {
		FC_ACCT_2501_LDataSet ds = null;
		FC_ACCT_2501_LDM dm = new FC_ACCT_2501_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.occr_slip_clsf = Util
				.checkString(req.getParameter("occr_slip_clsf"));
		dm.budg_cd = Util.checkString(req.getParameter("budg_cd"));
		dm.frdt = Util.checkString(req.getParameter("frdt"));
		dm.todt = Util.checkString(req.getParameter("todt"));
		dm.proc_clsf1 = Util.checkString(req.getParameter("proc_clsf1"));
		dm.proc_clsf2 = Util.checkString(req.getParameter("proc_clsf2"));
		dm.kind = Util.checkString(req.getParameter("kind"));

		dm.print();

		/* EJB 수정후 시작 */
		ds = dao.fc_acct_2501_l(dm);

		if (!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/*
		 * EJB 수정전 시작 try { FC_ACCT_2000EJBHome home =
		 * (FC_ACCT_2000EJBHome)JNDIManager
		 * .getInstance().getHome("FC_ACCT_2000EJB"); FC_ACCT_2000EJB ejb =
		 * home.create();
		 * 
		 * ds = ejb.fc_acct_2501_l(dm); req.setAttribute("ds", ds); } catch
		 * (CreateException e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } catch (RemoteException
		 * e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } EJB 수정전 끝
		 */

		/*******************************************************************************************
		 * String multiUpdateData =
		 * Util.checkString(req.getParameter("multiUpdateData")); Hashtable hash
		 * = getHashMultiUpdateData(multiUpdateData);
		 * 
		 * dm.cmpy_cd = (String)hash.get("cmpy_cd"); dm.occr_slip_clsf =
		 * (String)hash.get("occr_slip_clsf"); dm.budg_cd =
		 * (String)hash.get("budg_cd"); dm.frdt = (String)hash.get("frdt");
		 * dm.todt = (String)hash.get("todt"); dm.proc_clsf1 =
		 * (String)hash.get("proc_clsf1"); dm.proc_clsf2 =
		 * (String)hash.get("proc_clsf2"); dm.kind = (String)hash.get("kind");
		 *******************************************************************************************/

		/*******************************************************************************************
		 * dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		 * dm.occr_slip_clsf =
		 * Util.getSessionParameterValue(req,"occr_slip_clsf",true); dm.budg_cd
		 * = Util.getSessionParameterValue(req,"budg_cd",true); dm.frdt =
		 * Util.getSessionParameterValue(req,"frdt",true); dm.todt =
		 * Util.getSessionParameterValue(req,"todt",true); dm.proc_clsf1 =
		 * Util.getSessionParameterValue(req,"proc_clsf1",true); dm.proc_clsf2 =
		 * Util.getSessionParameterValue(req,"proc_clsf2",true); dm.kind =
		 * Util.getSessionParameterValue(req,"kind",true);
		 *******************************************************************************************/
	}

	public void fc_acct_2510_m(HttpServletRequest req, HttpServletResponse res)
			throws AppException, SQLException {
		FC_ACCT_2510_MDataSet ds = null;
		FC_ACCT_2510_MDM dm = new FC_ACCT_2510_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.acct_cd = Util.checkString(req.getParameter("acct_cd1"));

		dm.print();

		/* EJB 수정후 시작 */
		ds = dao.fc_acct_2510_m(dm);

		if (!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/*
		 * EJB 수정전 시작 try { FC_ACCT_2000EJBHome home =
		 * (FC_ACCT_2000EJBHome)JNDIManager
		 * .getInstance().getHome("FC_ACCT_2000EJB"); FC_ACCT_2000EJB ejb =
		 * home.create();
		 * 
		 * ds = ejb.fc_acct_2510_m(dm); req.setAttribute("ds", ds); } catch
		 * (CreateException e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } catch (RemoteException
		 * e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } EJB 수정전 끝
		 */

		/*******************************************************************************************
		 * String multiUpdateData =
		 * Util.checkString(req.getParameter("multiUpdateData")); Hashtable hash
		 * = getHashMultiUpdateData(multiUpdateData);
		 * 
		 * dm.cmpy_cd = (String)hash.get("cmpy_cd"); dm.acct_cd =
		 * (String)hash.get("acct_cd");
		 *******************************************************************************************/
	}

	public void fc_acct_2511_l(HttpServletRequest req, HttpServletResponse res)
			throws AppException, SQLException {
		FC_ACCT_2511_LDataSet ds = null;
		FC_ACCT_2511_LDM dm = new FC_ACCT_2511_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.acct_cd = Util.checkString(req.getParameter("acct_cd"));
		dm.fisc_dt_fr = Util.checkString(req.getParameter("fisc_dt_fr"));
		dm.fisc_dt_to = Util.checkString(req.getParameter("fisc_dt_to"));
		dm.mang_clsf_cd = Util.checkString(req.getParameter("mang_clsf_cd"));
		dm.slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
		dm.comp_dt_fr = Util.checkString(req.getParameter("comp_dt_fr"));
		dm.comp_dt_to = Util.checkString(req.getParameter("comp_dt_to"));
		dm.dr_amt = Util.checkString(req.getParameter("dr_amt"));
		dm.crdt_amt = Util.checkString(req.getParameter("crdt_amt"));
		dm.drcr_clsf1 = Util.checkString(req.getParameter("drcr_clsf1"));
		dm.drcr_clsf2 = Util.checkString(req.getParameter("drcr_clsf2"));
		dm.kind = Util.checkString(req.getParameter("kind"));

		/* EJB 수정후 시작 */
		ds = dao.fc_acct_2511_l(dm);

		if (!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/*
		 * EJB 수정전 시작 try { FC_ACCT_2000EJBHome home =
		 * (FC_ACCT_2000EJBHome)JNDIManager
		 * .getInstance().getHome("FC_ACCT_2000EJB"); FC_ACCT_2000EJB ejb =
		 * home.create();
		 * 
		 * ds = ejb.fc_acct_2511_l(dm); req.setAttribute("ds", ds); } catch
		 * (CreateException e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } catch (RemoteException
		 * e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } EJB 수정전 끝
		 */

		/*******************************************************************************************
		 * String multiUpdateData =
		 * Util.checkString(req.getParameter("multiUpdateData")); Hashtable hash
		 * = getHashMultiUpdateData(multiUpdateData);
		 * 
		 * dm.cmpy_cd = (String)hash.get("cmpy_cd"); dm.acct_cd =
		 * (String)hash.get("acct_cd"); dm.fisc_dt_fr =
		 * (String)hash.get("fisc_dt_fr"); dm.fisc_dt_to =
		 * (String)hash.get("fisc_dt_to"); dm.mang_clsf_cd =
		 * (String)hash.get("mang_clsf_cd"); dm.slip_clsf_cd =
		 * (String)hash.get("slip_clsf_cd"); dm.comp_dt_fr =
		 * (String)hash.get("comp_dt_fr"); dm.comp_dt_to =
		 * (String)hash.get("comp_dt_to"); dm.dr_amt =
		 * (String)hash.get("dr_amt"); dm.crdt_amt =
		 * (String)hash.get("crdt_amt"); dm.drcr_clsf1 =
		 * (String)hash.get("drcr_clsf1"); dm.drcr_clsf2 =
		 * (String)hash.get("drcr_clsf2"); dm.kind = (String)hash.get("kind");
		 *******************************************************************************************/
	}

	public void fc_acct_2512_s(HttpServletRequest req, HttpServletResponse res)
			throws AppException, SQLException {
		FC_ACCT_2512_SDataSet ds = null;
		FC_ACCT_2512_SDM dm = new FC_ACCT_2512_SDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.acct_cd = Util.checkString(req.getParameter("acct_cd"));
		System.out.println(dm.acct_cd);

		/* EJB 수정후 시작 */
		ds = dao.fc_acct_2512_s(dm);

		if (!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/*
		 * EJB 수정전 시작 try { FC_ACCT_2000EJBHome home =
		 * (FC_ACCT_2000EJBHome)JNDIManager
		 * .getInstance().getHome("FC_ACCT_2000EJB"); FC_ACCT_2000EJB ejb =
		 * home.create();
		 * 
		 * ds = ejb.fc_acct_2512_s(dm); req.setAttribute("ds", ds); } catch
		 * (CreateException e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } catch (RemoteException
		 * e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } EJB 수정전 끝
		 */

		/*******************************************************************************************
		 * String multiUpdateData =
		 * Util.checkString(req.getParameter("multiUpdateData")); Hashtable hash
		 * = getHashMultiUpdateData(multiUpdateData);
		 * 
		 * dm.cmpy_cd = (String)hash.get("cmpy_cd"); dm.acct_cd =
		 * (String)hash.get("acct_cd");
		 *******************************************************************************************/
	}

	public void fc_acct_2520_m(HttpServletRequest req, HttpServletResponse res)
			throws AppException, SQLException {
		FC_ACCT_2520_MDataSet ds = null;
		FC_ACCT_2520_MDM dm = new FC_ACCT_2520_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);

		dm.print();

		/* EJB 수정후 시작 */
		ds = dao.fc_acct_2520_m(dm);

		if (!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/*
		 * EJB 수정전 시작 try { FC_ACCT_2000EJBHome home =
		 * (FC_ACCT_2000EJBHome)JNDIManager
		 * .getInstance().getHome("FC_ACCT_2000EJB"); FC_ACCT_2000EJB ejb =
		 * home.create();
		 * 
		 * ds = ejb.fc_acct_2521_l(dm); req.setAttribute("ds", ds); } catch
		 * (CreateException e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } catch (RemoteException
		 * e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } EJB 수정전 끝
		 */

		/*******************************************************************************************
		 * String multiUpdateData =
		 * Util.checkString(req.getParameter("multiUpdateData")); Hashtable hash
		 * = getHashMultiUpdateData(multiUpdateData);
		 * 
		 * dm.cmpy_cd = (String)hash.get("cmpy_cd"); dm.acctcdfr =
		 * (String)hash.get("acctcdfr"); dm.acctcdto =
		 * (String)hash.get("acctcdto"); dm.acntcymfr =
		 * (String)hash.get("acntcymfr"); dm.acntcymto =
		 * (String)hash.get("acntcymto");
		 *******************************************************************************************/
	}

	public void fc_acct_2521_l(HttpServletRequest req, HttpServletResponse res)
			throws AppException, SQLException {
		FC_ACCT_2521_LDataSet ds = null;
		FC_ACCT_2521_LDM dm = new FC_ACCT_2521_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.acctcdfr = Util.checkString(req.getParameter("acctcdfr"));
		dm.acctcdto = Util.checkString(req.getParameter("acctcdto"));
		dm.acntcymfr = Util.checkString(req.getParameter("acntcymfr"));
		dm.acntcymto = Util.checkString(req.getParameter("acntcymto"));

		/* EJB 수정후 시작 */
		ds = dao.fc_acct_2521_l(dm);

		if (!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/*
		 * EJB 수정전 시작 try { FC_ACCT_2000EJBHome home =
		 * (FC_ACCT_2000EJBHome)JNDIManager
		 * .getInstance().getHome("FC_ACCT_2000EJB"); FC_ACCT_2000EJB ejb =
		 * home.create();
		 * 
		 * ds = ejb.fc_acct_2521_l(dm); req.setAttribute("ds", ds); } catch
		 * (CreateException e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } catch (RemoteException
		 * e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } EJB 수정전 끝
		 */

		/*******************************************************************************************
		 * String multiUpdateData =
		 * Util.checkString(req.getParameter("multiUpdateData")); Hashtable hash
		 * = getHashMultiUpdateData(multiUpdateData);
		 * 
		 * dm.cmpy_cd = (String)hash.get("cmpy_cd"); dm.acctcdfr =
		 * (String)hash.get("acctcdfr"); dm.acctcdto =
		 * (String)hash.get("acctcdto"); dm.acntcymfr =
		 * (String)hash.get("acntcymfr"); dm.acntcymto =
		 * (String)hash.get("acntcymto");
		 *******************************************************************************************/
	}

	public void fc_acct_2530_m(HttpServletRequest req, HttpServletResponse res)
			throws AppException, SQLException {
		FC_ACCT_2530_MDataSet ds = null;
		FC_ACCT_2530_MDM dm = new FC_ACCT_2530_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true); 
		/* EJB 수정후 시작 */
		ds = dao.fc_acct_2530_m(dm);

		if (!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/*
		 * EJB 수정전 시작 try { FC_ACCT_2000EJBHome home =
		 * (FC_ACCT_2000EJBHome)JNDIManager
		 * .getInstance().getHome("FC_ACCT_2000EJB"); FC_ACCT_2000EJB ejb =
		 * home.create();
		 * 
		 * ds = ejb.fc_acct_2531_l(dm); req.setAttribute("ds", ds); } catch
		 * (CreateException e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } catch (RemoteException
		 * e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } EJB 수정전 끝
		 */

		/*******************************************************************************************
		 * String multiUpdateData =
		 * Util.checkString(req.getParameter("multiUpdateData")); Hashtable hash
		 * = getHashMultiUpdateData(multiUpdateData);
		 * 
		 * dm.cmpy_cd = (String)hash.get("cmpy_cd"); dm.dlco_cd =
		 * (String)hash.get("dlco_cd"); dm.mang_clsf =
		 * (String)hash.get("mang_clsf"); dm.media_cd =
		 * (String)hash.get("media_cd"); dm.event_cd =
		 * (String)hash.get("event_cd"); dm.fisc_yymm =
		 * (String)hash.get("fisc_yymm"); dm.acct_cd_fr =
		 * (String)hash.get("acct_cd_fr"); dm.acct_cd_to =
		 * (String)hash.get("acct_cd_to");
		 *******************************************************************************************/
	}

	public void fc_acct_2531_l(HttpServletRequest req, HttpServletResponse res)
			throws AppException, SQLException {
		FC_ACCT_2531_LDataSet ds = null;
		FC_ACCT_2531_LDM dm = new FC_ACCT_2531_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.dlco_cd = Util.checkString(req.getParameter("dlco_cd"));
		dm.mang_clsf = Util.checkString(req.getParameter("mang_clsf"));
		dm.media_cd = Util.checkString(req.getParameter("media_cd"));
		dm.event_cd = Util.checkString(req.getParameter("event_cd"));
		dm.fisc_yymm = Util.checkString(req.getParameter("fisc_yymm"));
		dm.acct_cd_fr = Util.checkString(req.getParameter("acct_cd_fr"));
		dm.acct_cd_to = Util.checkString(req.getParameter("acct_cd_to"));
		dm.chnl_clsf_cd = Util.checkString(req.getParameter("chnl_clsf_cd"));
		/* EJB 수정후 시작 */
		ds = dao.fc_acct_2531_l(dm);

		if (!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/*
		 * EJB 수정전 시작 try { FC_ACCT_2000EJBHome home =
		 * (FC_ACCT_2000EJBHome)JNDIManager
		 * .getInstance().getHome("FC_ACCT_2000EJB"); FC_ACCT_2000EJB ejb =
		 * home.create();
		 * 
		 * ds = ejb.fc_acct_2531_l(dm); req.setAttribute("ds", ds); } catch
		 * (CreateException e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } catch (RemoteException
		 * e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } EJB 수정전 끝
		 */

		/*******************************************************************************************
		 * String multiUpdateData =
		 * Util.checkString(req.getParameter("multiUpdateData")); Hashtable hash
		 * = getHashMultiUpdateData(multiUpdateData);
		 * 
		 * dm.cmpy_cd = (String)hash.get("cmpy_cd"); dm.dlco_cd =
		 * (String)hash.get("dlco_cd"); dm.mang_clsf =
		 * (String)hash.get("mang_clsf"); dm.media_cd =
		 * (String)hash.get("media_cd"); dm.event_cd =
		 * (String)hash.get("event_cd"); dm.fisc_yymm =
		 * (String)hash.get("fisc_yymm"); dm.acct_cd_fr =
		 * (String)hash.get("acct_cd_fr"); dm.acct_cd_to =
		 * (String)hash.get("acct_cd_to");
		 *******************************************************************************************/
	}

	public void fc_acct_2542_m(HttpServletRequest req, HttpServletResponse res)
			throws AppException, SQLException {
		FC_ACCT_2542_MDataSet ds = null;
		FC_ACCT_2542_MDM dm = new FC_ACCT_2542_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);

		dm.print();

		/* EJB 수정후 시작 */
		ds = dao.fc_acct_2542_m(dm);

		if (!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/*
		 * EJB 수정전 시작 try { FC_ACCT_2000EJBHome home =
		 * (FC_ACCT_2000EJBHome)JNDIManager
		 * .getInstance().getHome("FC_ACCT_2000EJB"); FC_ACCT_2000EJB ejb =
		 * home.create();
		 * 
		 * ds = ejb.fc_acct_2531_l(dm); req.setAttribute("ds", ds); } catch
		 * (CreateException e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } catch (RemoteException
		 * e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } EJB 수정전 끝
		 */

		/*******************************************************************************************
		 * String multiUpdateData =
		 * Util.checkString(req.getParameter("multiUpdateData")); Hashtable hash
		 * = getHashMultiUpdateData(multiUpdateData);
		 * 
		 * dm.cmpy_cd = (String)hash.get("cmpy_cd"); dm.dlco_cd =
		 * (String)hash.get("dlco_cd"); dm.mang_clsf =
		 * (String)hash.get("mang_clsf"); dm.media_cd =
		 * (String)hash.get("media_cd"); dm.event_cd =
		 * (String)hash.get("event_cd"); dm.fisc_yymm =
		 * (String)hash.get("fisc_yymm"); dm.acct_cd_fr =
		 * (String)hash.get("acct_cd_fr"); dm.acct_cd_to =
		 * (String)hash.get("acct_cd_to");
		 *******************************************************************************************/
	}

	public void fc_acct_2560_m(HttpServletRequest req, HttpServletResponse res)
			throws AppException, SQLException {
		FC_ACCT_2560_MDataSet ds = null;
		FC_ACCT_2560_MDM dm = new FC_ACCT_2560_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);

		dm.print();

		/* EJB 수정후 시작 */
		ds = dao.fc_acct_2560_m(dm);

		if (!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/*
		 * EJB 수정전 시작 try { FC_ACCT_2000EJBHome home =
		 * (FC_ACCT_2000EJBHome)JNDIManager
		 * .getInstance().getHome("FC_ACCT_2000EJB"); FC_ACCT_2000EJB ejb =
		 * home.create();
		 * 
		 * ds = ejb.fc_acct_2561_l(dm); req.setAttribute("ds", ds); } catch
		 * (CreateException e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } catch (RemoteException
		 * e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } EJB 수정전 끝
		 */

		/*******************************************************************************************
		 * String multiUpdateData =
		 * Util.checkString(req.getParameter("multiUpdateData")); Hashtable hash
		 * = getHashMultiUpdateData(multiUpdateData);
		 * 
		 * dm.cmpy_cd = (String)hash.get("cmpy_cd"); dm.evnt_clsf_cd =
		 * (String)hash.get("evnt_clsf_cd"); dm.from_fisc_dt =
		 * (String)hash.get("from_fisc_dt"); dm.to_fisc_dt =
		 * (String)hash.get("to_fisc_dt"); dm.evnt_cd =
		 * (String)hash.get("evnt_cd");
		 *******************************************************************************************/

		/*******************************************************************************************
		 * dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		 * dm.evnt_clsf_cd =
		 * Util.getSessionParameterValue(req,"evnt_clsf_cd",true);
		 * dm.from_fisc_dt =
		 * Util.getSessionParameterValue(req,"from_fisc_dt",true); dm.to_fisc_dt
		 * = Util.getSessionParameterValue(req,"to_fisc_dt",true); dm.evnt_cd =
		 * Util.getSessionParameterValue(req,"evnt_cd",true);
		 *******************************************************************************************/
	}

	public void fc_acct_2561_l(HttpServletRequest req, HttpServletResponse res)
			throws AppException, SQLException {
		FC_ACCT_2561_LDataSet ds = null;
		FC_ACCT_2561_LDM dm = new FC_ACCT_2561_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.evnt_clsf_cd = Util.checkString(req.getParameter("evnt_clsf_cd"));
		dm.from_fisc_dt = Util.checkString(req.getParameter("from_fisc_dt"));
		dm.to_fisc_dt = Util.checkString(req.getParameter("to_fisc_dt"));
		dm.evnt_cd = Util.checkString(req.getParameter("evnt_cd"));
		dm.vat_flag = Util.checkString(req.getParameter("vat_flag"));

		dm.print();

		/* EJB 수정후 시작 */
		ds = dao.fc_acct_2561_l(dm);

		if (!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/*
		 * EJB 수정전 시작 try { FC_ACCT_2000EJBHome home =
		 * (FC_ACCT_2000EJBHome)JNDIManager
		 * .getInstance().getHome("FC_ACCT_2000EJB"); FC_ACCT_2000EJB ejb =
		 * home.create();
		 * 
		 * ds = ejb.fc_acct_2561_l(dm); req.setAttribute("ds", ds); } catch
		 * (CreateException e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } catch (RemoteException
		 * e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } EJB 수정전 끝
		 */

		/*******************************************************************************************
		 * String multiUpdateData =
		 * Util.checkString(req.getParameter("multiUpdateData")); Hashtable hash
		 * = getHashMultiUpdateData(multiUpdateData);
		 * 
		 * dm.cmpy_cd = (String)hash.get("cmpy_cd"); dm.evnt_clsf_cd =
		 * (String)hash.get("evnt_clsf_cd"); dm.from_fisc_dt =
		 * (String)hash.get("from_fisc_dt"); dm.to_fisc_dt =
		 * (String)hash.get("to_fisc_dt"); dm.evnt_cd =
		 * (String)hash.get("evnt_cd");
		 *******************************************************************************************/

		/*******************************************************************************************
		 * dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		 * dm.evnt_clsf_cd =
		 * Util.getSessionParameterValue(req,"evnt_clsf_cd",true);
		 * dm.from_fisc_dt =
		 * Util.getSessionParameterValue(req,"from_fisc_dt",true); dm.to_fisc_dt
		 * = Util.getSessionParameterValue(req,"to_fisc_dt",true); dm.evnt_cd =
		 * Util.getSessionParameterValue(req,"evnt_cd",true);
		 *******************************************************************************************/
	}

	public void fc_acct_2562_s(HttpServletRequest req, HttpServletResponse res)
			throws AppException, SQLException {
		FC_ACCT_2562_SDataSet ds = null;
		FC_ACCT_2562_SDM dm = new FC_ACCT_2562_SDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.evnt_cd = Util.checkString(req.getParameter("evnt_cd"));

		dm.print();

		/* EJB 수정후 시작 */
		ds = dao.fc_acct_2562_s(dm);

		if (!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/*
		 * EJB 수정전 시작 try { FC_ACCT_2000EJBHome home =
		 * (FC_ACCT_2000EJBHome)JNDIManager
		 * .getInstance().getHome("FC_ACCT_2000EJB"); FC_ACCT_2000EJB ejb =
		 * home.create();
		 * 
		 * ds = ejb.fc_acct_2562_s(dm); req.setAttribute("ds", ds); } catch
		 * (CreateException e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } catch (RemoteException
		 * e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } EJB 수정전 끝
		 */

		/*******************************************************************************************
		 * String multiUpdateData =
		 * Util.checkString(req.getParameter("multiUpdateData")); Hashtable hash
		 * = getHashMultiUpdateData(multiUpdateData);
		 * 
		 * dm.cmpy_cd = (String)hash.get("cmpy_cd"); dm.evnt_cd =
		 * (String)hash.get("evnt_cd");
		 *******************************************************************************************/

		/*******************************************************************************************
		 * dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		 * dm.evnt_cd = Util.getSessionParameterValue(req,"evnt_cd",true);
		 *******************************************************************************************/
	}

	public void fc_acct_2570_m(HttpServletRequest req, HttpServletResponse res)
			throws AppException, SQLException {
		FC_ACCT_2570_MDataSet ds = null;
		FC_ACCT_2570_MDM dm = new FC_ACCT_2570_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.sys_clsf = Util.checkString(req.getParameter("sys_clsf"));

		dm.print();

		/* EJB 수정후 시작 */
		ds = dao.fc_acct_2570_m(dm);

		if (!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/*
		 * EJB 수정전 시작 try { FC_ACCT_2000EJBHome home =
		 * (FC_ACCT_2000EJBHome)JNDIManager
		 * .getInstance().getHome("FC_ACCT_2000EJB"); FC_ACCT_2000EJB ejb =
		 * home.create();
		 * 
		 * ds = ejb.fc_acct_2570_m(dm); req.setAttribute("ds", ds); } catch
		 * (CreateException e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } catch (RemoteException
		 * e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } EJB 수정전 끝
		 */

		/*******************************************************************************************
		 * String multiUpdateData =
		 * Util.checkString(req.getParameter("multiUpdateData")); Hashtable hash
		 * = getHashMultiUpdateData(multiUpdateData);
		 * 
		 * dm.cmpy_cd = (String)hash.get("cmpy_cd"); dm.sys_clsf =
		 * (String)hash.get("sys_clsf");
		 *******************************************************************************************/

		/*******************************************************************************************
		 * dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		 * dm.sys_clsf = Util.getSessionParameterValue(req,"sys_clsf",true);
		 *******************************************************************************************/
	}

	public void fc_acct_2571_l(HttpServletRequest req, HttpServletResponse res)
			throws AppException, SQLException {
		FC_ACCT_2571_LDataSet ds = null;
		FC_ACCT_2571_LDM dm = new FC_ACCT_2571_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.uid = Util.getSessionParameterValue(req, "uid", true);
		dm.acct_num = Util.checkString(req.getParameter("acct_num"));
		dm.frdt = Util.checkString(req.getParameter("frdt"));
		dm.todt = Util.checkString(req.getParameter("todt"));
		dm.tran_clsfy = Util.checkString(req.getParameter("tran_clsfy"));
		dm.approval = Util.checkString(req.getParameter("approval"));
		
		dm.print();

		/* EJB 수정후 시작 */
		ds = dao.fc_acct_2571_l(dm);

		if (!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/*
		 * EJB 수정전 시작 try { FC_ACCT_2000EJBHome home =
		 * (FC_ACCT_2000EJBHome)JNDIManager
		 * .getInstance().getHome("FC_ACCT_2000EJB"); FC_ACCT_2000EJB ejb =
		 * home.create();
		 * 
		 * ds = ejb.fc_acct_2571_l(dm); req.setAttribute("ds", ds); } catch
		 * (CreateException e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } catch (RemoteException
		 * e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } EJB 수정전 끝
		 */

		/*******************************************************************************************
		 * String multiUpdateData =
		 * Util.checkString(req.getParameter("multiUpdateData")); Hashtable hash
		 * = getHashMultiUpdateData(multiUpdateData);
		 * 
		 * dm.cmpy_cd = (String)hash.get("cmpy_cd"); dm.uid =
		 * (String)hash.get("uid"); dm.acct_num = (String)hash.get("acct_num");
		 * dm.frdt = (String)hash.get("frdt"); dm.todt =
		 * (String)hash.get("todt");
		 *******************************************************************************************/

		/*******************************************************************************************
		 * dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		 * dm.uid = Util.getSessionParameterValue(req,"uid",true); dm.acct_num =
		 * Util.getSessionParameterValue(req,"acct_num",true); dm.frdt =
		 * Util.getSessionParameterValue(req,"frdt",true); dm.todt =
		 * Util.getSessionParameterValue(req,"todt",true);
		 *******************************************************************************************/
	}

	public void fc_acct_2572_u(HttpServletRequest req, HttpServletResponse res)
			throws AppException, SQLException {
		FC_ACCT_2572_UDataSet ds = null;
		FC_ACCT_2572_UDM dm = new FC_ACCT_2572_UDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_chg_pers_ip = req.getRemoteAddr();
		dm.incmg_chg_pers = Util.getSessionParameterValue(req, "emp_no", true);

		String multiUpdateData = Util.checkString(req
				.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.biz_reg_no = (String) hash.get("biz_reg_no");
		dm.bank_id = (String) hash.get("bank_id");
		dm.acct_num = (String) hash.get("acct_num");
		dm.acct_tonghwa = (String) hash.get("acct_tonghwa");
		dm.tran_date = (String) hash.get("tran_date");
		dm.tran_date_seq = (String) hash.get("tran_date_seq");
		dm.extnc_seq = (String) hash.get("extnc_seq");
		dm.actu_slip_no = (String) hash.get("actu_slip_no");
		dm.extnc_amt = (String) hash.get("extnc_amt");

		dm.print();

		/* EJB 수정후 시작 */
		ds = dao.fc_acct_2572_u(dm);

		if (!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/*
		 * EJB 수정전 시작 try { FC_ACCT_2000EJBHome home =
		 * (FC_ACCT_2000EJBHome)JNDIManager
		 * .getInstance().getHome("FC_ACCT_2000EJB"); FC_ACCT_2000EJB ejb =
		 * home.create();
		 * 
		 * ds = ejb.fc_acct_2572_u(dm); req.setAttribute("ds", ds); } catch
		 * (CreateException e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } catch (RemoteException
		 * e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } EJB 수정전 끝
		 */

		/*******************************************************************************************
		 * String multiUpdateData =
		 * Util.checkString(req.getParameter("multiUpdateData")); Hashtable hash
		 * = getHashMultiUpdateData(multiUpdateData);
		 * 
		 * dm.cmpy_cd = (String)hash.get("cmpy_cd"); dm.incmg_chg_pers_ip =
		 * (String)hash.get("incmg_chg_pers_ip"); dm.incmg_chg_pers =
		 * (String)hash.get("incmg_chg_pers"); dm.biz_reg_no =
		 * (String)hash.get("biz_reg_no"); dm.bank_id =
		 * (String)hash.get("bank_id"); dm.acct_num =
		 * (String)hash.get("acct_num"); dm.acct_tonghwa =
		 * (String)hash.get("acct_tonghwa"); dm.tran_date =
		 * (String)hash.get("tran_date"); dm.tran_date_seq =
		 * (String)hash.get("tran_date_seq"); dm.extnc_seq =
		 * (String)hash.get("extnc_seq"); dm.actu_slip_no =
		 * (String)hash.get("actu_slip_no");
		 *******************************************************************************************/

		/*******************************************************************************************
		 * dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		 * dm.incmg_chg_pers_ip =
		 * Util.getSessionParameterValue(req,"incmg_chg_pers_ip",true);
		 * dm.incmg_chg_pers =
		 * Util.getSessionParameterValue(req,"incmg_chg_pers",true);
		 * dm.biz_reg_no = Util.getSessionParameterValue(req,"biz_reg_no",true);
		 * dm.bank_id = Util.getSessionParameterValue(req,"bank_id",true);
		 * dm.acct_num = Util.getSessionParameterValue(req,"acct_num",true);
		 * dm.acct_tonghwa =
		 * Util.getSessionParameterValue(req,"acct_tonghwa",true); dm.tran_date
		 * = Util.getSessionParameterValue(req,"tran_date",true);
		 * dm.tran_date_seq =
		 * Util.getSessionParameterValue(req,"tran_date_seq",true); dm.extnc_seq
		 * = Util.getSessionParameterValue(req,"extnc_seq",true);
		 * dm.actu_slip_no =
		 * Util.getSessionParameterValue(req,"actu_slip_no",true);
		 *******************************************************************************************/
	}

	public void fc_acct_2573_i(HttpServletRequest req, HttpServletResponse res)
			throws AppException, SQLException {
		FC_ACCT_2573_IDataSet ds = null;
		FC_ACCT_2573_IDM dm = new FC_ACCT_2573_IDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_chg_pers_ip = req.getRemoteAddr();
		dm.incmg_chg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.fisc_dt = Util.checkString(req.getParameter("fisc_dt"));

		String multiUpdateData = Util.checkString(req
				.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.biz_reg_no = (String) hash.get("biz_reg_no");
		dm.bank_id = (String) hash.get("bank_id");
		dm.acct_num = (String) hash.get("acct_num");
		dm.acct_tonghwa = (String) hash.get("acct_tonghwa");
		dm.tran_date = (String) hash.get("tran_date");
		dm.tran_date_seq = (String) hash.get("tran_date_seq");
		dm.extnc_seq = (String) hash.get("extnc_seq");

		dm.print();

		/* EJB 수정후 시작 */
		ds = dao.fc_acct_2573_i(dm);

		if (!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/*
		 * EJB 수정전 시작 try { FC_ACCT_2000EJBHome home =
		 * (FC_ACCT_2000EJBHome)JNDIManager
		 * .getInstance().getHome("FC_ACCT_2000EJB"); FC_ACCT_2000EJB ejb =
		 * home.create();
		 * 
		 * ds = ejb.fc_acct_2573_i(dm); req.setAttribute("ds", ds); } catch
		 * (CreateException e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } catch (RemoteException
		 * e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } EJB 수정전 끝
		 */

		/*******************************************************************************************
		 * String multiUpdateData =
		 * Util.checkString(req.getParameter("multiUpdateData")); Hashtable hash
		 * = getHashMultiUpdateData(multiUpdateData);
		 * 
		 * dm.cmpy_cd = (String)hash.get("cmpy_cd"); dm.incmg_chg_pers_ip =
		 * (String)hash.get("incmg_chg_pers_ip"); dm.incmg_chg_pers =
		 * (String)hash.get("incmg_chg_pers"); dm.biz_reg_no =
		 * (String)hash.get("biz_reg_no"); dm.bank_id =
		 * (String)hash.get("bank_id"); dm.acct_num =
		 * (String)hash.get("acct_num"); dm.acct_tonghwa =
		 * (String)hash.get("acct_tonghwa"); dm.tran_date =
		 * (String)hash.get("tran_date"); dm.tran_date_seq =
		 * (String)hash.get("tran_date_seq"); dm.extnc_seq =
		 * (String)hash.get("extnc_seq"); dm.fisc_dt =
		 * (String)hash.get("fisc_dt");
		 *******************************************************************************************/

		/*******************************************************************************************
		 * dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		 * dm.incmg_chg_pers_ip =
		 * Util.getSessionParameterValue(req,"incmg_chg_pers_ip",true);
		 * dm.incmg_chg_pers =
		 * Util.getSessionParameterValue(req,"incmg_chg_pers",true);
		 * dm.biz_reg_no = Util.getSessionParameterValue(req,"biz_reg_no",true);
		 * dm.bank_id = Util.getSessionParameterValue(req,"bank_id",true);
		 * dm.acct_num = Util.getSessionParameterValue(req,"acct_num",true);
		 * dm.acct_tonghwa =
		 * Util.getSessionParameterValue(req,"acct_tonghwa",true); dm.tran_date
		 * = Util.getSessionParameterValue(req,"tran_date",true);
		 * dm.tran_date_seq =
		 * Util.getSessionParameterValue(req,"tran_date_seq",true); dm.extnc_seq
		 * = Util.getSessionParameterValue(req,"extnc_seq",true); dm.fisc_dt =
		 * Util.getSessionParameterValue(req,"fisc_dt",true);
		 *******************************************************************************************/
	}

	public void fc_acct_2574_d(HttpServletRequest req, HttpServletResponse res)
			throws AppException, SQLException {
		FC_ACCT_2574_DDataSet ds = null;
		FC_ACCT_2574_DDM dm = new FC_ACCT_2574_DDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_chg_pers_ip = req.getRemoteAddr();
		dm.incmg_chg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.slip_occr_dt = Util.checkString(req.getParameter("slip_occr_dt"));
		dm.slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
		dm.slip_seq = Util.checkString(req.getParameter("slip_seq"));
		dm.slip_sub_seq = Util.checkString(req.getParameter("slip_sub_seq"));

		dm.print();

		/* EJB 수정후 시작 */
		ds = dao.fc_acct_2574_d(dm);

		if (!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/*
		 * EJB 수정전 시작 try { FC_ACCT_2000EJBHome home =
		 * (FC_ACCT_2000EJBHome)JNDIManager
		 * .getInstance().getHome("FC_ACCT_2000EJB"); FC_ACCT_2000EJB ejb =
		 * home.create();
		 * 
		 * ds = ejb.fc_acct_2574_d(dm); req.setAttribute("ds", ds); } catch
		 * (CreateException e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } catch (RemoteException
		 * e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } EJB 수정전 끝
		 */

		/*******************************************************************************************
		 * String multiUpdateData =
		 * Util.checkString(req.getParameter("multiUpdateData")); Hashtable hash
		 * = getHashMultiUpdateData(multiUpdateData);
		 * 
		 * dm.cmpy_cd = (String)hash.get("cmpy_cd"); dm.incmg_chg_pers_ip =
		 * (String)hash.get("incmg_chg_pers_ip"); dm.incmg_chg_pers =
		 * (String)hash.get("incmg_chg_pers"); dm.slip_occr_dt =
		 * (String)hash.get("slip_occr_dt"); dm.slip_clsf_cd =
		 * (String)hash.get("slip_clsf_cd"); dm.slip_seq =
		 * (String)hash.get("slip_seq"); dm.slip_sub_seq =
		 * (String)hash.get("slip_sub_seq");
		 *******************************************************************************************/

		/*******************************************************************************************
		 * dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		 * dm.incmg_chg_pers_ip =
		 * Util.getSessionParameterValue(req,"incmg_chg_pers_ip",true);
		 * dm.incmg_chg_pers =
		 * Util.getSessionParameterValue(req,"incmg_chg_pers",true);
		 * dm.slip_occr_dt =
		 * Util.getSessionParameterValue(req,"slip_occr_dt",true);
		 * dm.slip_clsf_cd =
		 * Util.getSessionParameterValue(req,"slip_clsf_cd",true); dm.slip_seq =
		 * Util.getSessionParameterValue(req,"slip_seq",true); dm.slip_sub_seq =
		 * Util.getSessionParameterValue(req,"slip_sub_seq",true);
		 *******************************************************************************************/
	}

	public void fc_acct_2580_m(HttpServletRequest req, HttpServletResponse res)
			throws AppException, SQLException {
		FC_ACCT_2580_MDataSet ds = null;
		FC_ACCT_2580_MDM dm = new FC_ACCT_2580_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);

		dm.print();

		/* EJB 수정후 시작 */
		ds = dao.fc_acct_2580_m(dm);

		if (!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/*
		 * EJB 수정전 시작 try { FC_ACCT_2000EJBHome home =
		 * (FC_ACCT_2000EJBHome)JNDIManager
		 * .getInstance().getHome("FC_ACCT_2000EJB"); FC_ACCT_2000EJB ejb =
		 * home.create();
		 * 
		 * ds = ejb.fc_acct_2580_m(dm); req.setAttribute("ds", ds); } catch
		 * (CreateException e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } catch (RemoteException
		 * e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } EJB 수정전 끝
		 */

		/*******************************************************************************************
		 * String multiUpdateData =
		 * Util.checkString(req.getParameter("multiUpdateData")); Hashtable hash
		 * = getHashMultiUpdateData(multiUpdateData);
		 * 
		 * dm.cmpy_cd = (String)hash.get("cmpy_cd");
		 *******************************************************************************************/

		/*******************************************************************************************
		 * dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		 *******************************************************************************************/
	}

	public void fc_acct_2581_l(HttpServletRequest req, HttpServletResponse res)
			throws AppException, SQLException {
		FC_ACCT_2581_LDataSet ds = null;
		FC_ACCT_2581_LDM dm = new FC_ACCT_2581_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.slip_flag = Util.checkString(req.getParameter("slip_flag"));
		dm.incmg_dt = Util.checkString(req.getParameter("incmg_dt"));
		dm.slip_occr_dt = Util.checkString(req.getParameter("slip_occr_dt"));
		dm.slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
		dm.slip_seq = Util.checkString(req.getParameter("slip_seq"));
		dm.slip_sub_seq = Util.checkString(req.getParameter("slip_sub_seq"));

		dm.print();

		/* EJB 수정후 시작 */
		ds = dao.fc_acct_2581_l(dm);

		if (!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/*
		 * EJB 수정전 시작 try { FC_ACCT_2000EJBHome home =
		 * (FC_ACCT_2000EJBHome)JNDIManager
		 * .getInstance().getHome("FC_ACCT_2000EJB"); FC_ACCT_2000EJB ejb =
		 * home.create();
		 * 
		 * ds = ejb.fc_acct_2581_l(dm); req.setAttribute("ds", ds); } catch
		 * (CreateException e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } catch (RemoteException
		 * e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } EJB 수정전 끝
		 */

		/*******************************************************************************************
		 * String multiUpdateData =
		 * Util.checkString(req.getParameter("multiUpdateData")); Hashtable hash
		 * = getHashMultiUpdateData(multiUpdateData);
		 * 
		 * dm.cmpy_cd = (String)hash.get("cmpy_cd"); dm.slip_flag =
		 * (String)hash.get("slip_flag"); dm.incmg_dt =
		 * (String)hash.get("incmg_dt"); dm.slip_occr_dt =
		 * (String)hash.get("slip_occr_dt"); dm.slip_clsf_cd =
		 * (String)hash.get("slip_clsf_cd"); dm.slip_seq =
		 * (String)hash.get("slip_seq"); dm.slip_sub_seq =
		 * (String)hash.get("slip_sub_seq");
		 *******************************************************************************************/

		/*******************************************************************************************
		 * dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		 * dm.slip_flag = Util.getSessionParameterValue(req,"slip_flag",true);
		 * dm.incmg_dt = Util.getSessionParameterValue(req,"incmg_dt",true);
		 * dm.slip_occr_dt =
		 * Util.getSessionParameterValue(req,"slip_occr_dt",true);
		 * dm.slip_clsf_cd =
		 * Util.getSessionParameterValue(req,"slip_clsf_cd",true); dm.slip_seq =
		 * Util.getSessionParameterValue(req,"slip_seq",true); dm.slip_sub_seq =
		 * Util.getSessionParameterValue(req,"slip_sub_seq",true);
		 *******************************************************************************************/
	}

	public void fc_acct_2582_s(HttpServletRequest req, HttpServletResponse res)
			throws AppException, SQLException {
		FC_ACCT_2582_SDataSet ds = null;
		FC_ACCT_2582_SDM dm = new FC_ACCT_2582_SDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_dt = Util.checkString(req.getParameter("incmg_dt"));

		dm.print();

		/* EJB 수정후 시작 */
		ds = dao.fc_acct_2582_s(dm);

		if (!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/*
		 * EJB 수정전 시작 try { FC_ACCT_2000EJBHome home =
		 * (FC_ACCT_2000EJBHome)JNDIManager
		 * .getInstance().getHome("FC_ACCT_2000EJB"); FC_ACCT_2000EJB ejb =
		 * home.create();
		 * 
		 * ds = ejb.fc_acct_2582_s(dm); req.setAttribute("ds", ds); } catch
		 * (CreateException e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } catch (RemoteException
		 * e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } EJB 수정전 끝
		 */

		/*******************************************************************************************
		 * String multiUpdateData =
		 * Util.checkString(req.getParameter("multiUpdateData")); Hashtable hash
		 * = getHashMultiUpdateData(multiUpdateData);
		 * 
		 * dm.cmpy_cd = (String)hash.get("cmpy_cd"); dm.incmg_dt =
		 * (String)hash.get("incmg_dt");
		 *******************************************************************************************/

		/*******************************************************************************************
		 * dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		 * dm.incmg_dt = Util.getSessionParameterValue(req,"incmg_dt",true);
		 *******************************************************************************************/
	}

	public void fc_acct_2583_i(HttpServletRequest req, HttpServletResponse res)
			throws AppException, SQLException {
		FC_ACCT_2583_IDataSet ds = null;
		FC_ACCT_2583_IDM dm = new FC_ACCT_2583_IDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.slip_occr_dt = Util.checkString(req.getParameter("slip_occr_dt"));
		dm.slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
		dm.fisc_dt = Util.checkString(req.getParameter("fisc_dt"));
		dm.rmks1 = Util.checkString(req.getParameter("rmks1"));
		dm.work_flag = Util.checkString(req.getParameter("work_flag"));
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.incmg_pers_ipadd = req.getRemoteAddr();

		String multiUpdateData = Util.checkString(req
				.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);
		dm.grid1_mode = (String) hash.get("m");
		dm.grid1_rownum = (String) hash.get("rownum");
		dm.grid1_drcr_clsf_cd = (String) hash.get("drcr_clsf_cd");
		dm.grid1_budg_cd = (String) hash.get("budg_cd");
		dm.grid1_mang_clsf_cd = (String) hash.get("mang_clsf_cd");
		dm.grid1_dr_amt = (String) hash.get("dr_amt");
		dm.grid1_crdt_amt = (String) hash.get("crdt_amt");
		dm.grid1_rmks2 = (String) hash.get("rmks2");
		dm.grid1_dlco_clsf_cd = (String) hash.get("dlco_clsf_cd");
		dm.grid1_dlco_cd = (String) hash.get("dlco_cd");
		dm.grid1_dlco_nm = (String) hash.get("dlco_nm");
		dm.grid1_boks_dlco_nm = (String) hash.get("boks_dlco_nm");

		dm.print();

		/* EJB 수정후 시작 */
		ds = dao.fc_acct_2583_i(dm);

		if (!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/*
		 * EJB 수정전 시작 try { FC_ACCT_2000EJBHome home =
		 * (FC_ACCT_2000EJBHome)JNDIManager
		 * .getInstance().getHome("FC_ACCT_2000EJB"); FC_ACCT_2000EJB ejb =
		 * home.create();
		 * 
		 * ds = ejb.fc_acct_2583_i(dm); req.setAttribute("ds", ds); } catch
		 * (CreateException e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } catch (RemoteException
		 * e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } EJB 수정전 끝
		 */

		/*******************************************************************************************
		 * String multiUpdateData =
		 * Util.checkString(req.getParameter("multiUpdateData")); Hashtable hash
		 * = getHashMultiUpdateData(multiUpdateData);
		 * 
		 * dm.cmpy_cd = (String)hash.get("cmpy_cd"); dm.slip_occr_dt =
		 * (String)hash.get("slip_occr_dt"); dm.slip_clsf_cd =
		 * (String)hash.get("slip_clsf_cd"); dm.fisc_dt =
		 * (String)hash.get("fisc_dt"); dm.rmks1 = (String)hash.get("rmks1");
		 * dm.work_flag = (String)hash.get("work_flag"); dm.incmg_pers =
		 * (String)hash.get("incmg_pers"); dm.incmg_pers_ipadd =
		 * (String)hash.get("incmg_pers_ipadd"); dm.grid1_mode =
		 * (String)hash.get("grid1_mode"); dm.grid1_rownum =
		 * (String)hash.get("grid1_rownum"); dm.grid1_drcr_clsf_cd =
		 * (String)hash.get("grid1_drcr_clsf_cd"); dm.grid1_budg_cd =
		 * (String)hash.get("grid1_budg_cd"); dm.grid1_mang_clsf_cd =
		 * (String)hash.get("grid1_mang_clsf_cd"); dm.grid1_dr_amt =
		 * (String)hash.get("grid1_dr_amt"); dm.grid1_crdt_amt =
		 * (String)hash.get("grid1_crdt_amt"); dm.grid1_rmks2 =
		 * (String)hash.get("grid1_rmks2"); dm.grid1_dlco_clsf_cd =
		 * (String)hash.get("grid1_dlco_clsf_cd"); dm.grid1_dlco_cd =
		 * (String)hash.get("grid1_dlco_cd"); dm.grid1_dlco_nm =
		 * (String)hash.get("grid1_dlco_nm"); dm.grid1_boks_dlco_nm =
		 * (String)hash.get("grid1_boks_dlco_nm");
		 *******************************************************************************************/

		/*******************************************************************************************
		 * dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		 * dm.slip_occr_dt =
		 * Util.getSessionParameterValue(req,"slip_occr_dt",true);
		 * dm.slip_clsf_cd =
		 * Util.getSessionParameterValue(req,"slip_clsf_cd",true); dm.fisc_dt =
		 * Util.getSessionParameterValue(req,"fisc_dt",true); dm.rmks1 =
		 * Util.getSessionParameterValue(req,"rmks1",true); dm.work_flag =
		 * Util.getSessionParameterValue(req,"work_flag",true); dm.incmg_pers =
		 * Util.getSessionParameterValue(req,"incmg_pers",true);
		 * dm.incmg_pers_ipadd =
		 * Util.getSessionParameterValue(req,"incmg_pers_ipadd",true);
		 * dm.grid1_mode = Util.getSessionParameterValue(req,"grid1_mode",true);
		 * dm.grid1_rownum =
		 * Util.getSessionParameterValue(req,"grid1_rownum",true);
		 * dm.grid1_drcr_clsf_cd =
		 * Util.getSessionParameterValue(req,"grid1_drcr_clsf_cd",true);
		 * dm.grid1_budg_cd =
		 * Util.getSessionParameterValue(req,"grid1_budg_cd",true);
		 * dm.grid1_mang_clsf_cd =
		 * Util.getSessionParameterValue(req,"grid1_mang_clsf_cd",true);
		 * dm.grid1_dr_amt =
		 * Util.getSessionParameterValue(req,"grid1_dr_amt",true);
		 * dm.grid1_crdt_amt =
		 * Util.getSessionParameterValue(req,"grid1_crdt_amt",true);
		 * dm.grid1_rmks2 =
		 * Util.getSessionParameterValue(req,"grid1_rmks2",true);
		 * dm.grid1_dlco_clsf_cd =
		 * Util.getSessionParameterValue(req,"grid1_dlco_clsf_cd",true);
		 * dm.grid1_dlco_cd =
		 * Util.getSessionParameterValue(req,"grid1_dlco_cd",true);
		 * dm.grid1_dlco_nm =
		 * Util.getSessionParameterValue(req,"grid1_dlco_nm",true);
		 * dm.grid1_boks_dlco_nm =
		 * Util.getSessionParameterValue(req,"grid1_boks_dlco_nm",true);
		 *******************************************************************************************/
	}

	public void fc_acct_2584_d(HttpServletRequest req, HttpServletResponse res)
			throws AppException, SQLException {
		FC_ACCT_2584_DDataSet ds = null;
		FC_ACCT_2584_DDM dm = new FC_ACCT_2584_DDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.slip_occr_dt = Util.checkString(req.getParameter("slip_occr_dt"));
		dm.slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
		dm.slip_seq = Util.checkString(req.getParameter("slip_seq"));
		dm.work_flag = Util.checkString(req.getParameter("work_flag"));
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.incmg_pers_ipadd = req.getRemoteAddr();

		dm.print();

		/* EJB 수정후 시작 */
		ds = dao.fc_acct_2584_d(dm);

		if (!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/*
		 * EJB 수정전 시작 try { FC_ACCT_2000EJBHome home =
		 * (FC_ACCT_2000EJBHome)JNDIManager
		 * .getInstance().getHome("FC_ACCT_2000EJB"); FC_ACCT_2000EJB ejb =
		 * home.create();
		 * 
		 * ds = ejb.fc_acct_2584_d(dm); req.setAttribute("ds", ds); } catch
		 * (CreateException e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } catch (RemoteException
		 * e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } EJB 수정전 끝
		 */

		/*******************************************************************************************
		 * String multiUpdateData =
		 * Util.checkString(req.getParameter("multiUpdateData")); Hashtable hash
		 * = getHashMultiUpdateData(multiUpdateData);
		 * 
		 * dm.cmpy_cd = (String)hash.get("cmpy_cd"); dm.slip_occr_dt =
		 * (String)hash.get("slip_occr_dt"); dm.slip_clsf_cd =
		 * (String)hash.get("slip_clsf_cd"); dm.slip_seq =
		 * (String)hash.get("slip_seq"); dm.work_flag =
		 * (String)hash.get("work_flag"); dm.incmg_pers =
		 * (String)hash.get("incmg_pers"); dm.incmg_pers_ipadd =
		 * (String)hash.get("incmg_pers_ipadd");
		 *******************************************************************************************/

		/*******************************************************************************************
		 * dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		 * dm.slip_occr_dt =
		 * Util.getSessionParameterValue(req,"slip_occr_dt",true);
		 * dm.slip_clsf_cd =
		 * Util.getSessionParameterValue(req,"slip_clsf_cd",true); dm.slip_seq =
		 * Util.getSessionParameterValue(req,"slip_seq",true); dm.work_flag =
		 * Util.getSessionParameterValue(req,"work_flag",true); dm.incmg_pers =
		 * Util.getSessionParameterValue(req,"incmg_pers",true);
		 * dm.incmg_pers_ipadd =
		 * Util.getSessionParameterValue(req,"incmg_pers_ipadd",true);
		 *******************************************************************************************/
	}

	public void fc_acct_2585_a(HttpServletRequest req, HttpServletResponse res)
			throws AppException, SQLException {
		FC_ACCT_2585_ADataSet ds = null;
		FC_ACCT_2585_ADM dm = new FC_ACCT_2585_ADM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_dt = Util.checkString(req.getParameter("incmg_dt"));
		dm.work_flag = Util.checkString(req.getParameter("work_flag"));
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.incmg_pers_ipadd = req.getRemoteAddr();

		dm.print();

		/* EJB 수정후 시작 */
		ds = dao.fc_acct_2585_a(dm);

		if (!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/*
		 * EJB 수정전 시작 try { FC_ACCT_2000EJBHome home =
		 * (FC_ACCT_2000EJBHome)JNDIManager
		 * .getInstance().getHome("FC_ACCT_2000EJB"); FC_ACCT_2000EJB ejb =
		 * home.create();
		 * 
		 * ds = ejb.fc_acct_2585_a(dm); req.setAttribute("ds", ds); } catch
		 * (CreateException e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } catch (RemoteException
		 * e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } EJB 수정전 끝
		 */

		/*******************************************************************************************
		 * String multiUpdateData =
		 * Util.checkString(req.getParameter("multiUpdateData")); Hashtable hash
		 * = getHashMultiUpdateData(multiUpdateData);
		 * 
		 * dm.cmpy_cd = (String)hash.get("cmpy_cd"); dm.incmg_dt =
		 * (String)hash.get("incmg_dt"); dm.work_flag =
		 * (String)hash.get("work_flag"); dm.incmg_pers =
		 * (String)hash.get("incmg_pers"); dm.incmg_pers_ipadd =
		 * (String)hash.get("incmg_pers_ipadd");
		 *******************************************************************************************/

		/*******************************************************************************************
		 * dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		 * dm.incmg_dt = Util.getSessionParameterValue(req,"incmg_dt",true);
		 * dm.work_flag = Util.getSessionParameterValue(req,"work_flag",true);
		 * dm.incmg_pers = Util.getSessionParameterValue(req,"incmg_pers",true);
		 * dm.incmg_pers_ipadd =
		 * Util.getSessionParameterValue(req,"incmg_pers_ipadd",true);
		 *******************************************************************************************/
	}

	public void fc_acct_2591_l(HttpServletRequest req, HttpServletResponse res)
		throws AppException, SQLException {
	FC_ACCT_2591_LDataSet ds = null;
	FC_ACCT_2591_LDM dm = new FC_ACCT_2591_LDM();
	
	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
	dm.frfisc_dt = Util.checkString(req.getParameter("frfisc_dt"));
	dm.tofisc_dt = Util.checkString(req.getParameter("tofisc_dt"));
	dm.mang_clsf_cd = Util.checkString(req.getParameter("mang_clsf_cd"));
	
	dm.print();
	
	/* EJB 수정후 시작 */
	ds = dao.fc_acct_2591_l(dm);
	
	if (!ds.getErrcode().equals("")) {
		throw new AppException(ds.getErrcode(), ds.getErrmsg());
	}
	
	req.setAttribute("ds", ds);
	/* EJB 수정후 끝 */
	
	/*
	 * EJB 수정전 시작 try { FC_ACCT_2000EJBHome home =
	 * (FC_ACCT_2000EJBHome)JNDIManager
	 * .getInstance().getHome("FC_ACCT_2000EJB"); FC_ACCT_2000EJB ejb =
	 * home.create();
	 * 
	 * ds = ejb.fc_acct_2585_a(dm); req.setAttribute("ds", ds); } catch
	 * (CreateException e) { SysException se = new SysException(e);
	 * LogManager.getInstance().log(se); throw se; } catch (RemoteException
	 * e) { SysException se = new SysException(e);
	 * LogManager.getInstance().log(se); throw se; } EJB 수정전 끝
	 */
	
	/*******************************************************************************************
	 * String multiUpdateData =
	 * Util.checkString(req.getParameter("multiUpdateData")); Hashtable hash
	 * = getHashMultiUpdateData(multiUpdateData);
	 * 
	 * dm.cmpy_cd = (String)hash.get("cmpy_cd"); dm.incmg_dt =
	 * (String)hash.get("incmg_dt"); dm.work_flag =
	 * (String)hash.get("work_flag"); dm.incmg_pers =
	 * (String)hash.get("incmg_pers"); dm.incmg_pers_ipadd =
	 * (String)hash.get("incmg_pers_ipadd");
	 *******************************************************************************************/
	
	/*******************************************************************************************
	 * dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
	 * dm.incmg_dt = Util.getSessionParameterValue(req,"incmg_dt",true);
	 * dm.work_flag = Util.getSessionParameterValue(req,"work_flag",true);
	 * dm.incmg_pers = Util.getSessionParameterValue(req,"incmg_pers",true);
	 * dm.incmg_pers_ipadd =
	 * Util.getSessionParameterValue(req,"incmg_pers_ipadd",true);
	 *******************************************************************************************/
	}
	
	public void fc_acct_2840_m(HttpServletRequest req, HttpServletResponse res)
			throws AppException, SQLException {
		FC_ACCT_2840_MDataSet ds = null;

		String cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);

		FC_ACCT_2840_MDM dm = new FC_ACCT_2840_MDM();

		dm.setCmpy_cd(cmpy_cd);

		/* EJB 수정후 시작 */
		ds = dao.fc_acct_2840_m(dm);

		if (!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/*
		 * EJB 수정전 시작 try { FC_ACCT_2000EJBHome home =
		 * (FC_ACCT_2000EJBHome)JNDIManager
		 * .getInstance().getHome("FC_ACCT_2000EJB"); FC_ACCT_2000EJB ejb =
		 * home.create(); ds = ejb.fc_acct_2840_m(dm); req.setAttribute("ds",
		 * ds); } catch (CreateException e) { SysException se = new
		 * SysException(e); LogManager.getInstance().log(se); throw se; } catch
		 * (RemoteException e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } EJB 수정전 끝
		 */
	}

	public void fc_acct_2841_l(HttpServletRequest req, HttpServletResponse res)
			throws AppException, SQLException {
		FC_ACCT_2841_LDataSet ds = null;

		String cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		String rcpm_shet_kind = Util.checkString(req
				.getParameter("rcpm_shet_kind"));
		String rcpm_shet_dlv_dt_fr = Util.checkString(req
				.getParameter("rcpm_shet_dlv_dt_fr"));
		String rcpm_shet_dlv_dt_to = Util.checkString(req
				.getParameter("rcpm_shet_dlv_dt_to"));
		String rcpm_shet_stat = Util.checkString(req
				.getParameter("rcpm_shet_stat"));

		FC_ACCT_2841_LDM dm = new FC_ACCT_2841_LDM();

		dm.setCmpy_cd(cmpy_cd);
		dm.setRcpm_shet_kind(rcpm_shet_kind);
		dm.setRcpm_shet_dlv_dt_fr(rcpm_shet_dlv_dt_fr);
		dm.setRcpm_shet_dlv_dt_to(rcpm_shet_dlv_dt_to);
		dm.setRcpm_shet_stat(rcpm_shet_stat);

		dm.print();

		/* EJB 수정후 시작 */
		ds = dao.fc_acct_2841_l(dm);

		if (!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/*
		 * EJB 수정전 시작 try { FC_ACCT_2000EJBHome home =
		 * (FC_ACCT_2000EJBHome)JNDIManager
		 * .getInstance().getHome("FC_ACCT_2000EJB"); FC_ACCT_2000EJB ejb =
		 * home.create(); ds = ejb.fc_acct_2841_l(dm); req.setAttribute("ds",
		 * ds); } catch (CreateException e) { SysException se = new
		 * SysException(e); LogManager.getInstance().log(se); throw se; } catch
		 * (RemoteException e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } EJB 수정전 끝
		 */
	}

	public void fc_acct_2842_a(HttpServletRequest req, HttpServletResponse res)
			throws AppException, SQLException {
		FC_ACCT_2842_ADataSet ds = null;

		// System.out.println("1:::");

		String multiUpdateData = Util.checkString(req
				.getParameter("multiUpdateData"));

		// System.out.println("2:::"+multiUpdateData+"==");

		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		String cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		// String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
		String clsf = (String) hash.get("m");
		String rcpm_shet_kind = (String) hash.get("rcpm_shet_kind");
		String rcpm_shet_no = (String) hash.get("rcpm_shet_no");
		String rcpm_clsf = (String) hash.get("rcpm_clsf");
		String rcpm_shet_dlv_dt = (String) hash.get("rcpm_shet_dlv_dt");
		String dlver_emp_no = (String) hash.get("dlver_emp_no");
		String recp_pers_emp_no = (String) hash.get("recp_pers_emp_no");
		String rcpm_shet_stat = (String) hash.get("rcpm_shet_stat");
		String rcpm_indc_bgn_no = (String) hash.get("rcpm_indc_bgn_no");
		String dept_cd = Util.checkString(req.getParameter("dept_cd"));
		String incmg_pers_ipadd = req.getRemoteAddr();
		String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);

		// System.out.println("3:::");

		/*
		 * String clsf = Util.checkString(req.getParameter("clsf")); String
		 * cmpy_cd = Util.checkString(req.getParameter("cmpy_cd")); String
		 * rcpm_shet_kind =
		 * Util.checkString(req.getParameter("rcpm_shet_kind")); String
		 * rcpm_shet_no = Util.checkString(req.getParameter("rcpm_shet_no"));
		 * String rcpm_clsf = Util.checkString(req.getParameter("rcpm_clsf"));
		 * String rcpm_shet_dlv_dt =
		 * Util.checkString(req.getParameter("rcpm_shet_dlv_dt")); String
		 * dlver_emp_no = Util.checkString(req.getParameter("dlver_emp_no"));
		 * String recp_pers_emp_no =
		 * Util.checkString(req.getParameter("recp_pers_emp_no")); String
		 * rcpm_shet_stat =
		 * Util.checkString(req.getParameter("rcpm_shet_stat")); String
		 * rcpm_indc_bgn_no =
		 * Util.checkString(req.getParameter("rcpm_indc_bgn_no")); String
		 * dept_cd = Util.checkString(req.getParameter("dept_cd")); String
		 * incmg_pers_ipadd =
		 * Util.checkString(req.getParameter("incmg_pers_ipadd")); String
		 * incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
		 */

		FC_ACCT_2842_ADM dm = new FC_ACCT_2842_ADM();

		dm.setClsf(clsf.toUpperCase());
		dm.setCmpy_cd(cmpy_cd);
		dm.setRcpm_shet_kind(rcpm_shet_kind);
		dm.setRcpm_shet_no(rcpm_shet_no);
		dm.setRcpm_clsf(rcpm_clsf);
		dm.setRcpm_shet_dlv_dt(rcpm_shet_dlv_dt);
		dm.setDlver_emp_no(dlver_emp_no);
		dm.setRecp_pers_emp_no(recp_pers_emp_no);
		dm.setRcpm_shet_stat(rcpm_shet_stat);
		dm.setRcpm_indc_bgn_no(rcpm_indc_bgn_no);
		dm.setDept_cd(dept_cd);
		dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
		dm.setIncmg_pers(incmg_pers);

		dm.print();

		/* EJB 수정후 시작 */
		ds = dao.fc_acct_2842_a(dm);

		if (!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/*
		 * EJB 수정전 시작 try { FC_ACCT_2000EJBHome home =
		 * (FC_ACCT_2000EJBHome)JNDIManager
		 * .getInstance().getHome("FC_ACCT_2000EJB"); FC_ACCT_2000EJB ejb =
		 * home.create(); ds = ejb.fc_acct_2842_a(dm); req.setAttribute("ds",
		 * ds); } catch (CreateException e) { SysException se = new
		 * SysException(e); LogManager.getInstance().log(se); throw se; } catch
		 * (RemoteException e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } EJB 수정전 끝
		 */
	}

	public void fc_acct_2873_s(HttpServletRequest req, HttpServletResponse res)
			throws AppException, SQLException {
		FC_ACCT_2873_SDataSet ds = null;
		FC_ACCT_2873_SDM dm = new FC_ACCT_2873_SDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.frrcpm_shet_dlv_dt = Util.checkString(req
				.getParameter("frrcpm_shet_dlv_dt"));
		dm.torcpm_shet_dlv_dt = Util.checkString(req
				.getParameter("torcpm_shet_dlv_dt"));
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.bef_dept_cd = Util.checkString(req.getParameter("bef_dept_cd"));
		dm.retn_dt = Util.checkString(req.getParameter("retn_dt"));

		dm.print();

		/* EJB 수정후 시작 */
		ds = dao.fc_acct_2873_s(dm);

		if (!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/*
		 * EJB 수정전 시작 try { FC_ACCT_2000EJBHome home =
		 * (FC_ACCT_2000EJBHome)JNDIManager
		 * .getInstance().getHome("FC_ACCT_2000EJB"); FC_ACCT_2000EJB ejb =
		 * home.create();
		 * 
		 * ds = ejb.fc_acct_2873_s(dm); req.setAttribute("ds", ds); } catch
		 * (CreateException e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } catch (RemoteException
		 * e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } EJB 수정전 끝
		 */

		/*******************************************************************************************
		 * String multiUpdateData =
		 * Util.checkString(req.getParameter("multiUpdateData")); Hashtable hash
		 * = getHashMultiUpdateData(multiUpdateData);
		 * 
		 * dm.cmpy_cd = (String)hash.get("cmpy_cd"); dm.frrcpm_shet_dlv_dt =
		 * (String)hash.get("frrcpm_shet_dlv_dt"); dm.torcpm_shet_dlv_dt =
		 * (String)hash.get("torcpm_shet_dlv_dt"); dm.dept_cd =
		 * (String)hash.get("dept_cd"); dm.emp_no = (String)hash.get("emp_no");
		 * dm.bef_dept_cd = (String)hash.get("bef_dept_cd"); dm.retn_dt =
		 * (String)hash.get("retn_dt");
		 *******************************************************************************************/

		/*******************************************************************************************
		 * dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		 * dm.frrcpm_shet_dlv_dt =
		 * Util.getSessionParameterValue(req,"frrcpm_shet_dlv_dt",true);
		 * dm.torcpm_shet_dlv_dt =
		 * Util.getSessionParameterValue(req,"torcpm_shet_dlv_dt",true);
		 * dm.dept_cd = Util.getSessionParameterValue(req,"dept_cd",true);
		 * dm.emp_no = Util.getSessionParameterValue(req,"emp_no",true);
		 * dm.bef_dept_cd =
		 * Util.getSessionParameterValue(req,"bef_dept_cd",true); dm.retn_dt =
		 * Util.getSessionParameterValue(req,"retn_dt",true);
		 *******************************************************************************************/
	}

	public void fc_acct_2920_m(HttpServletRequest req, HttpServletResponse res)
			throws AppException, SQLException {
		FC_ACCT_2920_MDataSet ds = null;

		String cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);

		FC_ACCT_2920_MDM dm = new FC_ACCT_2920_MDM();
		dm.setCmpy_cd(cmpy_cd);
		dm.setIncmg_pers(incmg_pers);

		dm.print();

		/* EJB 수정후 시작 */
		ds = dao.fc_acct_2920_m(dm);

		if (!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/*
		 * EJB 수정전 시작 try { FC_ACCT_2000EJBHome home =
		 * (FC_ACCT_2000EJBHome)JNDIManager
		 * .getInstance().getHome("FC_ACCT_2000EJB"); FC_ACCT_2000EJB ejb =
		 * home.create(); ds = ejb.fc_acct_2920_m(dm); req.setAttribute("ds",
		 * ds); } catch (CreateException e) { SysException se = new
		 * SysException(e); LogManager.getInstance().log(se); throw se; } catch
		 * (RemoteException e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } EJB 수정전 끝
		 */
	}

	public void fc_acct_2921_l(HttpServletRequest req, HttpServletResponse res)
			throws AppException, SQLException {
		FC_ACCT_2921_LDataSet ds = null;
		FC_ACCT_2921_LDM dm = new FC_ACCT_2921_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.dlco_cd = Util.checkString(req.getParameter("dlco_cd"));
		dm.clsf = Util.checkString(req.getParameter("clsf"));
		dm.frdt = Util.checkString(req.getParameter("frdt"));
		dm.todt = Util.checkString(req.getParameter("todt"));

		dm.print();

		/* EJB 수정후 시작 */
		ds = dao.fc_acct_2921_l(dm);

		if (!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/*
		 * EJB 수정전 시작 try { FC_ACCT_2000EJBHome home =
		 * (FC_ACCT_2000EJBHome)JNDIManager
		 * .getInstance().getHome("FC_ACCT_2000EJB"); FC_ACCT_2000EJB ejb =
		 * home.create();
		 * 
		 * ds = ejb.fc_acct_2921_l(dm); req.setAttribute("ds", ds); } catch
		 * (CreateException e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } catch (RemoteException
		 * e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } EJB 수정전 끝
		 */

		/*******************************************************************************************
		 * String multiUpdateData =
		 * Util.checkString(req.getParameter("multiUpdateData")); Hashtable hash
		 * = getHashMultiUpdateData(multiUpdateData);
		 * 
		 * dm.cmpy_cd = (String)hash.get("cmpy_cd"); dm.dlco_cd =
		 * (String)hash.get("dlco_cd"); dm.clsf = (String)hash.get("clsf");
		 * dm.frdt = (String)hash.get("frdt"); dm.todt =
		 * (String)hash.get("todt");
		 *******************************************************************************************/

		/*******************************************************************************************
		 * dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		 * dm.dlco_cd = Util.getSessionParameterValue(req,"dlco_cd",true);
		 * dm.clsf = Util.getSessionParameterValue(req,"clsf",true); dm.frdt =
		 * Util.getSessionParameterValue(req,"frdt",true); dm.todt =
		 * Util.getSessionParameterValue(req,"todt",true);
		 *******************************************************************************************/
	}

	public void fc_acct_2130_m(HttpServletRequest req, HttpServletResponse res)
			throws AppException, SQLException {
		FC_ACCT_2130_MDataSet ds = null;
		FC_ACCT_2130_MDM dm = new FC_ACCT_2130_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);

		dm.print();

		/* EJB 수정후 시작 */
		ds = dao.fc_acct_2130_m(dm);

		if (!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/*
		 * EJB 수정전 시작 try { FC_ACCT_2000EJBHome home =
		 * (FC_ACCT_2000EJBHome)JNDIManager
		 * .getInstance().getHome("FC_ACCT_2000EJB"); FC_ACCT_2000EJB ejb =
		 * home.create();
		 * 
		 * ds = ejb.fc_acct_2130_m(dm); req.setAttribute("ds", ds); } catch
		 * (CreateException e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } catch (RemoteException
		 * e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } EJB 수정전 끝
		 */

		/*******************************************************************************************
		 * String multiUpdateData =
		 * Util.checkString(req.getParameter("multiUpdateData")); Hashtable hash
		 * = getHashMultiUpdateData(multiUpdateData);
		 * 
		 * dm.cmpy_cd = (String)hash.get("cmpy_cd");
		 *******************************************************************************************/
	}

	public void fc_acct_2131_l(HttpServletRequest req, HttpServletResponse res)
			throws AppException, SQLException {
		FC_ACCT_2131_LDataSet ds = null;
		FC_ACCT_2131_LDM dm = new FC_ACCT_2131_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.uid = Util.getSessionParameterValue(req, "uid", true);
		dm.slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
		dm.slip_occr_dt = Util.checkString(req.getParameter("slip_occr_dt"));
		dm.slip_seq = Util.checkString(req.getParameter("slip_seq"));

		dm.print();

		/* EJB 수정후 시작 */
		ds = dao.fc_acct_2131_l(dm);

		if (!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/*
		 * EJB 수정전 시작 try { FC_ACCT_2000EJBHome home =
		 * (FC_ACCT_2000EJBHome)JNDIManager
		 * .getInstance().getHome("FC_ACCT_2000EJB"); FC_ACCT_2000EJB ejb =
		 * home.create();
		 * 
		 * ds = ejb.fc_acct_2131_l(dm); req.setAttribute("ds", ds); } catch
		 * (CreateException e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } catch (RemoteException
		 * e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } EJB 수정전 끝
		 */

		/*******************************************************************************************
		 * String multiUpdateData =
		 * Util.checkString(req.getParameter("multiUpdateData")); Hashtable hash
		 * = getHashMultiUpdateData(multiUpdateData);
		 * 
		 * dm.cmpy_cd = (String)hash.get("cmpy_cd"); dm.uid =
		 * (String)hash.get("uid"); dm.slip_clsf_cd =
		 * (String)hash.get("slip_clsf_cd"); dm.slip_occr_dt =
		 * (String)hash.get("slip_occr_dt"); dm.slip_seq =
		 * (String)hash.get("slip_seq");
		 *******************************************************************************************/

		/*******************************************************************************************
		 * dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		 * dm.uid = Util.getSessionParameterValue(req,"uid",true);
		 * dm.slip_clsf_cd =
		 * Util.getSessionParameterValue(req,"slip_clsf_cd",true);
		 * dm.slip_occr_dt =
		 * Util.getSessionParameterValue(req,"slip_occr_dt",true); dm.slip_seq =
		 * Util.getSessionParameterValue(req,"slip_seq",true);
		 *******************************************************************************************/
	}

	public void fc_acct_2132_i(HttpServletRequest req, HttpServletResponse res)
			throws AppException, SQLException {
		FC_ACCT_2132_IDataSet ds = null;
		FC_ACCT_2132_IDM dm = new FC_ACCT_2132_IDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.prof_type_cd = Util.checkString(req.getParameter("prof_type_cd"));
		dm.slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
		dm.slip_occr_dt = Util.checkString(req.getParameter("slip_occr_dt"));
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
		dm.evnt_cd = Util.checkString(req.getParameter("evnt_cd"));
		dm.suply_amt = Util.checkString(req.getParameter("suply_amt"));
		dm.vat_amt = Util.checkString(req.getParameter("vat_amt"));
		dm.tax_stmt_aprv_yn = Util.checkString(req
				.getParameter("tax_stmt_aprv_yn"));
		dm.rcpt_nosh = Util.checkString(req.getParameter("rcpt_nosh"));
		dm.budg_cd = Util.checkString(req.getParameter("budg_cd"));
		dm.ask_emp_no = Util.checkString(req.getParameter("ask_emp_no"));
		dm.ask_dept_cd = Util.checkString(req.getParameter("ask_dept_cd"));
		dm.rcpm_plan_dt = Util.checkString(req.getParameter("rcpm_plan_dt"));
		dm.item2 = Util.checkString(req.getParameter("item2"));
		dm.slip_rcpm_dt = Util.checkString(req.getParameter("slip_rcpm_dt"));
		dm.rcpm_sub_seq = Util.checkString(req.getParameter("rcpm_sub_seq"));
		dm.budg_cd2 = Util.checkString(req.getParameter("budg_cd2"));
		dm.rcpm_amt = Util.checkString(req.getParameter("rcpm_amt"));
		dm.rcpm_dt = Util.checkString(req.getParameter("rcpm_dt"));
		dm.deps_psbk = Util.checkString(req.getParameter("deps_psbk"));
		dm.coms = Util.checkString(req.getParameter("coms"));
		dm.rcpm_pers_nm = Util.checkString(req.getParameter("rcpm_pers_nm"));
		dm.gtieeno = Util.checkString(req.getParameter("gtieeno"));
		dm.gtibankcd = Util.checkString(req.getParameter("gtibankcd"));
		dm.medi_cd = Util.checkString(req.getParameter("medi_cd"));
		dm.chg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.incmg_pers_ipadd = req.getRemoteAddr();

		dm.print();

		/* EJB 수정후 시작 */
		ds = dao.fc_acct_2132_i(dm);

		if (!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/*
		 * EJB 수정전 시작 try { FC_ACCT_2000EJBHome home =
		 * (FC_ACCT_2000EJBHome)JNDIManager
		 * .getInstance().getHome("FC_ACCT_2000EJB"); FC_ACCT_2000EJB ejb =
		 * home.create();
		 * 
		 * ds = ejb.fc_acct_2132_i(dm); req.setAttribute("ds", ds); } catch
		 * (CreateException e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } catch (RemoteException
		 * e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } EJB 수정전 끝
		 */

		/*******************************************************************************************
		 * dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		 * dm.prof_type_cd =
		 * Util.getSessionParameterValue(req,"prof_type_cd",true);
		 * dm.slip_clsf_cd =
		 * Util.getSessionParameterValue(req,"slip_clsf_cd",true);
		 * dm.slip_occr_dt =
		 * Util.getSessionParameterValue(req,"slip_occr_dt",true); dm.make_dt =
		 * Util.getSessionParameterValue(req,"make_dt",true); dm.erplace_cd =
		 * Util.getSessionParameterValue(req,"erplace_cd",true); dm.dlco_clsf_cd
		 * = Util.getSessionParameterValue(req,"dlco_clsf_cd",true); dm.dlco_cd
		 * = Util.getSessionParameterValue(req,"dlco_cd",true); dm.deal_clsf =
		 * Util.getSessionParameterValue(req,"deal_clsf",true); dm.ern =
		 * Util.getSessionParameterValue(req,"ern",true); dm.dlco_nm =
		 * Util.getSessionParameterValue(req,"dlco_nm",true); dm.presi_nm =
		 * Util.getSessionParameterValue(req,"presi_nm",true); dm.addr =
		 * Util.getSessionParameterValue(req,"addr",true); dm.bizcond =
		 * Util.getSessionParameterValue(req,"bizcond",true); dm.item =
		 * Util.getSessionParameterValue(req,"item",true); dm.evnt_cd =
		 * Util.getSessionParameterValue(req,"evnt_cd",true); dm.suply_amt =
		 * Util.getSessionParameterValue(req,"suply_amt",true); dm.vat_amt =
		 * Util.getSessionParameterValue(req,"vat_amt",true);
		 * dm.tax_stmt_aprv_yn =
		 * Util.getSessionParameterValue(req,"tax_stmt_aprv_yn",true);
		 * dm.rcpt_nosh = Util.getSessionParameterValue(req,"rcpt_nosh",true);
		 * dm.budg_cd = Util.getSessionParameterValue(req,"budg_cd",true);
		 * dm.ask_emp_no = Util.getSessionParameterValue(req,"ask_emp_no",true);
		 * dm.ask_dept_cd =
		 * Util.getSessionParameterValue(req,"ask_dept_cd",true);
		 * dm.rcpm_plan_dt =
		 * Util.getSessionParameterValue(req,"rcpm_plan_dt",true); dm.item2 =
		 * Util.getSessionParameterValue(req,"item2",true); dm.slip_rcpm_dt =
		 * Util.getSessionParameterValue(req,"slip_rcpm_dt",true);
		 * dm.rcpm_sub_seq =
		 * Util.getSessionParameterValue(req,"rcpm_sub_seq",true); dm.budg_cd2 =
		 * Util.getSessionParameterValue(req,"budg_cd2",true); dm.rcpm_amt =
		 * Util.getSessionParameterValue(req,"rcpm_amt",true); dm.rcpm_dt =
		 * Util.getSessionParameterValue(req,"rcpm_dt",true); dm.deps_psbk =
		 * Util.getSessionParameterValue(req,"deps_psbk",true); dm.coms =
		 * Util.getSessionParameterValue(req,"coms",true); dm.rcpm_pers_nm =
		 * Util.getSessionParameterValue(req,"rcpm_pers_nm",true); dm.gtieeno =
		 * Util.getSessionParameterValue(req,"gtieeno",true); dm.gtibankcd =
		 * Util.getSessionParameterValue(req,"gtibankcd",true); dm.medi_cd =
		 * Util.getSessionParameterValue(req,"medi_cd",true); dm.chg_pers =
		 * Util.getSessionParameterValue(req,"chg_pers",true);
		 * dm.incmg_pers_ipadd =
		 * Util.getSessionParameterValue(req,"incmg_pers_ipadd",true);
		 *******************************************************************************************/

	}

	public void fc_acct_2133_u(HttpServletRequest req, HttpServletResponse res)
			throws AppException, SQLException {
		FC_ACCT_2133_UDataSet ds = null;
		FC_ACCT_2133_UDM dm = new FC_ACCT_2133_UDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.prof_type_cd = Util.checkString(req.getParameter("prof_type_cd"));
		dm.slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
		dm.slip_occr_dt = Util.checkString(req.getParameter("slip_occr_dt"));
		dm.slip_seq = Util.checkString(req.getParameter("slip_seq"));
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
		dm.evnt_cd = Util.checkString(req.getParameter("evnt_cd"));
		dm.suply_amt = Util.checkString(req.getParameter("suply_amt"));
		dm.vat_amt = Util.checkString(req.getParameter("vat_amt"));
		dm.tax_stmt_aprv_yn = Util.checkString(req
				.getParameter("tax_stmt_aprv_yn"));
		dm.make_upd_dt = Util.checkString(req.getParameter("make_upd_dt"));
		dm.upd_tms = Util.checkString(req.getParameter("upd_tms"));
		dm.last_upd_dt = Util.checkString(req.getParameter("last_upd_dt"));
		dm.rcpt_nosh = Util.checkString(req.getParameter("rcpt_nosh"));
		dm.budg_cd = Util.checkString(req.getParameter("budg_cd"));
		dm.ask_emp_no = Util.checkString(req.getParameter("ask_emp_no"));
		dm.ask_dept_cd = Util.checkString(req.getParameter("ask_dept_cd"));
		dm.rcpm_plan_dt = Util.checkString(req.getParameter("rcpm_plan_dt"));
		dm.item2 = Util.checkString(req.getParameter("item2"));
		dm.slip_rcpm_dt = Util.checkString(req.getParameter("slip_rcpm_dt"));
		dm.rcpm_sub_seq = Util.checkString(req.getParameter("rcpm_sub_seq"));
		dm.budg_cd2 = Util.checkString(req.getParameter("budg_cd2"));
		dm.rcpm_amt = Util.checkString(req.getParameter("rcpm_amt"));
		dm.rcpm_dt = Util.checkString(req.getParameter("rcpm_dt"));
		dm.deps_psbk = Util.checkString(req.getParameter("deps_psbk"));
		dm.coms = Util.checkString(req.getParameter("coms"));
		dm.rcpm_pers_nm = Util.checkString(req.getParameter("rcpm_pers_nm"));
		dm.gtieeno = Util.checkString(req.getParameter("gtieeno"));
		dm.gtibankcd = Util.checkString(req.getParameter("gtibankcd"));
		dm.medi_cd = Util.checkString(req.getParameter("medi_cd"));
		dm.chg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.incmg_pers_ipadd = req.getRemoteAddr();

		dm.print();

		/* EJB 수정후 시작 */
		ds = dao.fc_acct_2133_u(dm);

		if (!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/*
		 * EJB 수정전 시작 try { FC_ACCT_2000EJBHome home =
		 * (FC_ACCT_2000EJBHome)JNDIManager
		 * .getInstance().getHome("FC_ACCT_2000EJB"); FC_ACCT_2000EJB ejb =
		 * home.create();
		 * 
		 * ds = ejb.fc_acct_2133_u(dm); req.setAttribute("ds", ds); } catch
		 * (CreateException e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } catch (RemoteException
		 * e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } EJB 수정전 끝
		 */

		/*******************************************************************************************
		 * String multiUpdateData =
		 * Util.checkString(req.getParameter("multiUpdateData")); Hashtable hash
		 * = getHashMultiUpdateData(multiUpdateData);
		 * 
		 * dm.cmpy_cd = (String)hash.get("cmpy_cd"); dm.prof_type_cd =
		 * (String)hash.get("prof_type_cd"); dm.slip_clsf_cd =
		 * (String)hash.get("slip_clsf_cd"); dm.slip_occr_dt =
		 * (String)hash.get("slip_occr_dt"); dm.slip_seq =
		 * (String)hash.get("slip_seq"); dm.make_dt =
		 * (String)hash.get("make_dt"); dm.erplace_cd =
		 * (String)hash.get("erplace_cd"); dm.dlco_clsf_cd =
		 * (String)hash.get("dlco_clsf_cd"); dm.dlco_cd =
		 * (String)hash.get("dlco_cd"); dm.deal_clsf =
		 * (String)hash.get("deal_clsf"); dm.ern = (String)hash.get("ern");
		 * dm.dlco_nm = (String)hash.get("dlco_nm"); dm.presi_nm =
		 * (String)hash.get("presi_nm"); dm.addr = (String)hash.get("addr");
		 * dm.bizcond = (String)hash.get("bizcond"); dm.item =
		 * (String)hash.get("item"); dm.evnt_cd = (String)hash.get("evnt_cd");
		 * dm.suply_amt = (String)hash.get("suply_amt"); dm.vat_amt =
		 * (String)hash.get("vat_amt"); dm.tax_stmt_aprv_yn =
		 * (String)hash.get("tax_stmt_aprv_yn"); dm.make_upd_dt =
		 * (String)hash.get("make_upd_dt"); dm.upd_tms =
		 * (String)hash.get("upd_tms"); dm.last_upd_dt =
		 * (String)hash.get("last_upd_dt"); dm.rcpt_nosh =
		 * (String)hash.get("rcpt_nosh"); dm.budg_cd =
		 * (String)hash.get("budg_cd"); dm.ask_emp_no =
		 * (String)hash.get("ask_emp_no"); dm.ask_dept_cd =
		 * (String)hash.get("ask_dept_cd"); dm.rcpm_plan_dt =
		 * (String)hash.get("rcpm_plan_dt"); dm.slip_rcpm_dt =
		 * (String)hash.get("slip_rcpm_dt"); dm.rcpm_sub_seq =
		 * (String)hash.get("rcpm_sub_seq"); dm.rcpm_amt =
		 * (String)hash.get("rcpm_amt"); dm.rcpm_dt =
		 * (String)hash.get("rcpm_dt"); dm.deps_psbk =
		 * (String)hash.get("deps_psbk"); dm.coms = (String)hash.get("coms");
		 * dm.rcpm_pers_nm = (String)hash.get("rcpm_pers_nm"); dm.gtieeno =
		 * (String)hash.get("gtieeno"); dm.gtibankcd =
		 * (String)hash.get("gtibankcd"); dm.medi_cd =
		 * (String)hash.get("medi_cd"); dm.chg_pers =
		 * (String)hash.get("chg_pers"); dm.incmg_pers_ipadd =
		 * (String)hash.get("incmg_pers_ipadd");
		 *******************************************************************************************/
	}

	public void fc_acct_2134_d(HttpServletRequest req, HttpServletResponse res)
			throws AppException, SQLException {
		FC_ACCT_2134_DDataSet ds = null;
		FC_ACCT_2134_DDM dm = new FC_ACCT_2134_DDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.prof_type_cd = Util.checkString(req.getParameter("prof_type_cd"));
		dm.slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
		dm.slip_occr_dt = Util.checkString(req.getParameter("slip_occr_dt"));
		dm.slip_seq = Util.checkString(req.getParameter("slip_seq"));
		dm.chg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.incmg_pers_ipadd = req.getRemoteAddr();

		dm.print();

		/* EJB 수정후 시작 */
		ds = dao.fc_acct_2134_d(dm);

		if (!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/*
		 * EJB 수정전 시작 try { FC_ACCT_2000EJBHome home =
		 * (FC_ACCT_2000EJBHome)JNDIManager
		 * .getInstance().getHome("FC_ACCT_2000EJB"); FC_ACCT_2000EJB ejb =
		 * home.create();
		 * 
		 * ds = ejb.fc_acct_2134_d(dm); req.setAttribute("ds", ds); } catch
		 * (CreateException e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } catch (RemoteException
		 * e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } EJB 수정전 끝
		 */

		/*******************************************************************************************
		 * String multiUpdateData =
		 * Util.checkString(req.getParameter("multiUpdateData")); Hashtable hash
		 * = getHashMultiUpdateData(multiUpdateData);
		 * 
		 * dm.cmpy_cd = (String)hash.get("cmpy_cd"); dm.prof_type_cd =
		 * (String)hash.get("prof_type_cd"); dm.slip_clsf_cd =
		 * (String)hash.get("slip_clsf_cd"); dm.slip_occr_dt =
		 * (String)hash.get("slip_occr_dt"); dm.slip_seq =
		 * (String)hash.get("slip_seq"); dm.chg_pers =
		 * (String)hash.get("chg_pers"); dm.incmg_pers_ipadd =
		 * (String)hash.get("incmg_pers_ipadd");
		 *******************************************************************************************/
	}

	public void fc_acct_2135_s(HttpServletRequest req, HttpServletResponse res)
			throws AppException, SQLException {
		FC_ACCT_2135_SDataSet ds = null;
		FC_ACCT_2135_SDM dm = new FC_ACCT_2135_SDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.uid = Util.checkString(req.getParameter("uid"));
		dm.slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
		dm.dlco_cd = Util.checkString(req.getParameter("dlco_cd"));
		dm.ask_dept_cd = Util.checkString(req.getParameter("ask_dept_cd"));
		dm.budg_cd = Util.checkString(req.getParameter("budg_cd"));

		dm.print();

		/* EJB 수정후 시작 */
		ds = dao.fc_acct_2135_s(dm);

		if (!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/*
		 * EJB 수정전 시작 try { FC_ACCT_2000EJBHome home =
		 * (FC_ACCT_2000EJBHome)JNDIManager
		 * .getInstance().getHome("FC_ACCT_2000EJB"); FC_ACCT_2000EJB ejb =
		 * home.create();
		 * 
		 * ds = ejb.fc_acct_2135_s(dm); req.setAttribute("ds", ds); } catch
		 * (CreateException e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } catch (RemoteException
		 * e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } EJB 수정전 끝
		 */

		/*******************************************************************************************
		 * String multiUpdateData =
		 * Util.checkString(req.getParameter("multiUpdateData")); Hashtable hash
		 * = getHashMultiUpdateData(multiUpdateData);
		 * 
		 * dm.cmpy_cd = (String)hash.get("cmpy_cd"); dm.uid =
		 * (String)hash.get("uid"); dm.slip_clsf_cd =
		 * (String)hash.get("slip_clsf_cd"); dm.dlco_cd =
		 * (String)hash.get("dlco_cd"); dm.ask_dept_cd =
		 * (String)hash.get("ask_dept_cd"); dm.budg_cd =
		 * (String)hash.get("budg_cd");
		 *******************************************************************************************/

		/*******************************************************************************************
		 * dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		 * dm.uid = Util.getSessionParameterValue(req,"uid",true);
		 * dm.slip_clsf_cd =
		 * Util.getSessionParameterValue(req,"slip_clsf_cd",true); dm.dlco_cd =
		 * Util.getSessionParameterValue(req,"dlco_cd",true); dm.ask_dept_cd =
		 * Util.getSessionParameterValue(req,"ask_dept_cd",true); dm.budg_cd =
		 * Util.getSessionParameterValue(req,"budg_cd",true);
		 *******************************************************************************************/
	}

	public void fc_acct_2441_l(HttpServletRequest req, HttpServletResponse res)
			throws AppException, SQLException {
		FC_ACCT_2441_LDataSet ds = null;
		FC_ACCT_2441_LDM dm = new FC_ACCT_2441_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.uid = Util.getSessionParameterValue(req, "uid", true);
		dm.occr_dt = Util.checkString(req.getParameter("occr_dt"));
		dm.slip_clsf = Util.checkString(req.getParameter("slip_clsf"));
		dm.seq = Util.checkString(req.getParameter("seq"));
		dm.subseq = Util.checkString(req.getParameter("subseq"));
		dm.arow_no = Util.checkString(req.getParameter("arow_no"));

		dm.print();

		/* EJB 수정후 시작 */
		ds = dao.fc_acct_2441_l(dm);

		if (!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/*
		 * EJB 수정전 시작 try { FC_ACCT_2000EJBHome home =
		 * (FC_ACCT_2000EJBHome)JNDIManager
		 * .getInstance().getHome("FC_ACCT_2000EJB"); FC_ACCT_2000EJB ejb =
		 * home.create();
		 * 
		 * ds = ejb.fc_acct_2441_l(dm); req.setAttribute("ds", ds); } catch
		 * (CreateException e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } catch (RemoteException
		 * e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } EJB 수정전 끝
		 */

		/*******************************************************************************************
		 * String multiUpdateData =
		 * Util.checkString(req.getParameter("multiUpdateData")); Hashtable hash
		 * = getHashMultiUpdateData(multiUpdateData);
		 * 
		 * dm.cmpy_cd = (String)hash.get("cmpy_cd"); dm.occr_dt =
		 * (String)hash.get("occr_dt"); dm.slip_clsf =
		 * (String)hash.get("slip_clsf"); dm.seq = (String)hash.get("seq");
		 * dm.subseq = (String)hash.get("subseq"); dm.arow_no =
		 * (String)hash.get("arow_no");
		 *******************************************************************************************/

		/*******************************************************************************************
		 * dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		 * dm.occr_dt = Util.getSessionParameterValue(req,"occr_dt",true);
		 * dm.slip_clsf = Util.getSessionParameterValue(req,"slip_clsf",true);
		 * dm.seq = Util.getSessionParameterValue(req,"seq",true); dm.subseq =
		 * Util.getSessionParameterValue(req,"subseq",true); dm.arow_no =
		 * Util.getSessionParameterValue(req,"arow_no",true);
		 *******************************************************************************************/
	}

	/**
	 * 업무구분, 코드구분의 combobox 데이타가져오기
	 * 
	 * @param req
	 *            HttpServletRequest
	 * @param res
	 *            HttpServletResponse
	 * @throws AppException
	 */
	public void fc_acct_2440_m(HttpServletRequest req, HttpServletResponse res)
			throws AppException, SQLException {
		FC_ACCT_2440_MDataSet ds = null;
		FC_ACCT_2440_MDM dm = new FC_ACCT_2440_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);

		dm.print();

		/* EJB 수정후 시작 */
		ds = dao.fc_acct_2440_m(dm);

		if (!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/*
		 * EJB 수정전 시작 try { FC_ACCT_2000EJBHome home =
		 * (FC_ACCT_2000EJBHome)JNDIManager
		 * .getInstance().getHome("FC_ACCT_2000EJB"); FC_ACCT_2000EJB ejb =
		 * home.create();
		 * 
		 * ds = ejb.fc_acct_2440_m(dm); req.setAttribute("ds", ds); } catch
		 * (CreateException e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } catch (RemoteException
		 * e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } EJB 수정전 끝
		 */

		/*******************************************************************************************
		 * String multiUpdateData =
		 * Util.checkString(req.getParameter("multiUpdateData")); Hashtable hash
		 * = getHashMultiUpdateData(multiUpdateData);
		 * 
		 * dm.cmpy_cd = (String)hash.get("cmpy_cd");
		 *******************************************************************************************/

		/*******************************************************************************************
		 * dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		 *******************************************************************************************/
	}

	/**
	 * 입금표처리내역조회 데이타가져오기
	 * 
	 * @param req
	 *            HttpServletRequest
	 * @param res
	 *            HttpServletResponse
	 * @throws AppException
	 */
	public void fc_acct_2851_l(HttpServletRequest req, HttpServletResponse res)
			throws AppException, SQLException {
		FC_ACCT_2851_LDataSet ds = null;
		FC_ACCT_2851_LDM dm = new FC_ACCT_2851_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.rcpm_shet_kind = Util
				.checkString(req.getParameter("rcpm_shet_kind"));
		dm.rcpm_shet_no_fr = Util.checkString(req
				.getParameter("rcpm_shet_no_fr"));
		dm.rcpm_shet_no_to = Util.checkString(req
				.getParameter("rcpm_shet_no_to"));
		dm.rcpm_clsf_cd = Util.checkString(req.getParameter("rcpm_clsf_cd"));
		dm.rcpm_shet_dlv_dt_fr = Util.checkString(req
				.getParameter("rcpm_shet_dlv_dt_fr"));
		dm.rcpm_shet_dlv_dt_to = Util.checkString(req
				.getParameter("rcpm_shet_dlv_dt_to"));

		dm.print();

		/* EJB 수정후 시작 */
		ds = dao.fc_acct_2851_l(dm);

		if (!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/*
		 * EJB 수정전 시작 try { FC_ACCT_2000EJBHome home =
		 * (FC_ACCT_2000EJBHome)JNDIManager
		 * .getInstance().getHome("FC_ACCT_2000EJB"); FC_ACCT_2000EJB ejb =
		 * home.create();
		 * 
		 * ds = ejb.fc_acct_2851_l(dm); req.setAttribute("ds", ds); } catch
		 * (CreateException e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } catch (RemoteException
		 * e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } EJB 수정전 끝
		 */

		/*******************************************************************************************
		 * String multiUpdateData =
		 * Util.checkString(req.getParameter("multiUpdateData")); Hashtable hash
		 * = getHashMultiUpdateData(multiUpdateData);
		 * 
		 * dm.cmpy_cd = (String)hash.get("cmpy_cd"); dm.rcpm_shet_kind =
		 * (String)hash.get("rcpm_shet_kind"); dm.rcpm_shet_no_fr =
		 * (String)hash.get("rcpm_shet_no_fr"); dm.rcpm_shet_no_to =
		 * (String)hash.get("rcpm_shet_no_to"); dm.rcpm_clsf_cd =
		 * (String)hash.get("rcpm_clsf_cd"); dm.rcpm_shet_dlv_dt_fr =
		 * (String)hash.get("rcpm_shet_dlv_dt_fr"); dm.rcpm_shet_dlv_dt_to =
		 * (String)hash.get("rcpm_shet_dlv_dt_to");
		 *******************************************************************************************/

		/*******************************************************************************************
		 * dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		 * dm.rcpm_shet_kind =
		 * Util.getSessionParameterValue(req,"rcpm_shet_kind",true);
		 * dm.rcpm_shet_no_fr =
		 * Util.getSessionParameterValue(req,"rcpm_shet_no_fr",true);
		 * dm.rcpm_shet_no_to =
		 * Util.getSessionParameterValue(req,"rcpm_shet_no_to",true);
		 * dm.rcpm_clsf_cd =
		 * Util.getSessionParameterValue(req,"rcpm_clsf_cd",true);
		 * dm.rcpm_shet_dlv_dt_fr =
		 * Util.getSessionParameterValue(req,"rcpm_shet_dlv_dt_fr",true);
		 * dm.rcpm_shet_dlv_dt_to =
		 * Util.getSessionParameterValue(req,"rcpm_shet_dlv_dt_to",true);
		 *******************************************************************************************/
	}

	/**
	 * 
	 * 단일레코드 등록,수정,삭제 처리하기
	 * 
	 * @param req
	 * @param res
	 * @throws AppException
	 */

	public void fc_acct_2852_u(HttpServletRequest req, HttpServletResponse res)
			throws AppException, SQLException {

		FC_ACCT_2852_UDataSet ds = null;

		String cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		String rcpm_shet_kind = Util.checkString(req
				.getParameter("rcpm_shet_kind"));
		String rcpm_shet_no = Util
				.checkString(req.getParameter("rcpm_shet_no"));
		String widr_dt = Util.checkString(req.getParameter("widr_dt"));
		String rcpm_shet_stat = Util.checkString(req
				.getParameter("rcpm_shet_stat"));
		String widr_resn = Util.checkString(req.getParameter("widr_resn"));
		String rmks = Util.checkString(req.getParameter("rmks"));
		String rsrt_pers_emp_no = Util.checkString(req
				.getParameter("rsrt_pers_emp_no"));
		String rcpm_shet_dlv_dt = Util.checkString(req
				.getParameter("rcpm_shet_dlv_dt"));
		String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));

		// DM Setting
		FC_ACCT_2852_UDM dm = new FC_ACCT_2852_UDM();

		dm.setCmpy_cd(cmpy_cd);
		dm.setRcpm_shet_kind(rcpm_shet_kind);
		dm.setRcpm_shet_no(rcpm_shet_no);
		dm.setWidr_dt(widr_dt);
		dm.setRcpm_shet_stat(rcpm_shet_stat);
		dm.setWidr_resn(widr_resn);
		dm.setRmks(rmks);
		dm.setRsrt_pers_emp_no(rsrt_pers_emp_no);
		dm.setRcpm_shet_dlv_dt(rcpm_shet_dlv_dt);
		dm.setIncmg_pers(incmg_pers);

		/* EJB 수정후 시작 */
		ds = dao.fc_acct_2852_u(dm);

		if (!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/*
		 * EJB 수정전 시작 try { FC_ACCT_2000EJBHome home = (FC_ACCT_2000EJBHome)
		 * JNDIManager.getInstance().getHome("FC_ACCT_2000EJB"); FC_ACCT_2000EJB
		 * ejb = home.create(); ds = ejb.fc_acct_2852_u(dm);
		 * req.setAttribute("ds", ds); } catch (CreateException e) {
		 * SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } catch (RemoteException
		 * e) { e.printStackTrace(); SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } EJB 수정전 끝
		 */
	}

	/**
	 * 업무구분, 코드구분의 combobox 데이타가져오기
	 * 
	 * @param req
	 *            HttpServletRequest
	 * @param res
	 *            HttpServletResponse
	 * @throws AppException
	 */
	public void fc_acct_2860_m(HttpServletRequest req, HttpServletResponse res)
			throws AppException, SQLException {

		FC_ACCT_2860_MDataSet ds = null;

		// DM Setting
		FC_ACCT_2860_MDM dm = new FC_ACCT_2860_MDM();

		String cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);

		dm.setCmpy_cd(cmpy_cd);

		/* EJB 수정후 시작 */
		ds = dao.fc_acct_2860_m(dm);

		if (!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/*
		 * EJB 수정전 시작 try { FC_ACCT_2000EJBHome home = (FC_ACCT_2000EJBHome)
		 * JNDIManager.getInstance().getHome("FC_ACCT_2000EJB"); FC_ACCT_2000EJB
		 * ejb = home.create(); ds = ejb.fc_acct_2860_m(dm);
		 * req.setAttribute("ds", ds); } catch (CreateException e) {
		 * SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } catch (RemoteException
		 * e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } EJB 수정전 끝
		 */
	}

	/**
	 * 입금표처리내역조회 데이타가져오기
	 * 
	 * @param req
	 *            HttpServletRequest
	 * @param res
	 *            HttpServletResponse
	 * @throws AppException
	 */

	public void fc_acct_2861_l(HttpServletRequest req, HttpServletResponse res)
			throws AppException, SQLException {
		FC_ACCT_2861_LDataSet ds = null;
		FC_ACCT_2861_LDM dm = new FC_ACCT_2861_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.uid = Util.getSessionParameterValue(req, "uid", true);
		dm.rcpm_shet_kind = Util
				.checkString(req.getParameter("rcpm_shet_kind"));
		dm.rcpm_shet_no_fr = Util.checkString(req
				.getParameter("rcpm_shet_no_fr"));
		dm.rcpm_shet_no_to = Util.checkString(req
				.getParameter("rcpm_shet_no_to"));
		dm.rcpm_clsf_cd = Util.checkString(req.getParameter("rcpm_clsf_cd"));
		dm.rcpm_shet_dlv_dt_fr = Util.checkString(req
				.getParameter("rcpm_shet_dlv_dt_fr"));
		dm.rcpm_shet_dlv_dt_to = Util.checkString(req
				.getParameter("rcpm_shet_dlv_dt_to"));
		dm.dept_no = Util.checkString(req.getParameter("dept_no"));

		dm.print();

		/* EJB 수정후 시작 */
		ds = dao.fc_acct_2861_l(dm);

		if (!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/*
		 * EJB 수정전 시작 try { FC_ACCT_2000EJBHome home =
		 * (FC_ACCT_2000EJBHome)JNDIManager
		 * .getInstance().getHome("FC_ACCT_2000EJB"); FC_ACCT_2000EJB ejb =
		 * home.create();
		 * 
		 * ds = ejb.fc_acct_2861_l(dm); req.setAttribute("ds", ds); } catch
		 * (CreateException e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } catch (RemoteException
		 * e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } EJB 수정전 끝
		 */

		/*******************************************************************************************
		 * String multiUpdateData =
		 * Util.checkString(req.getParameter("multiUpdateData")); Hashtable hash
		 * = getHashMultiUpdateData(multiUpdateData);
		 * 
		 * dm.cmpy_cd = (String)hash.get("cmpy_cd"); dm.uid =
		 * (String)hash.get("uid"); dm.rcpm_shet_kind =
		 * (String)hash.get("rcpm_shet_kind"); dm.rcpm_shet_no_fr =
		 * (String)hash.get("rcpm_shet_no_fr"); dm.rcpm_shet_no_to =
		 * (String)hash.get("rcpm_shet_no_to"); dm.rcpm_clsf_cd =
		 * (String)hash.get("rcpm_clsf_cd"); dm.rcpm_shet_dlv_dt_fr =
		 * (String)hash.get("rcpm_shet_dlv_dt_fr"); dm.rcpm_shet_dlv_dt_to =
		 * (String)hash.get("rcpm_shet_dlv_dt_to"); dm.dept_no =
		 * (String)hash.get("dept_no");
		 *******************************************************************************************/

		/*******************************************************************************************
		 * dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		 * dm.uid = Util.getSessionParameterValue(req,"uid",true);
		 * dm.rcpm_shet_kind =
		 * Util.getSessionParameterValue(req,"rcpm_shet_kind",true);
		 * dm.rcpm_shet_no_fr =
		 * Util.getSessionParameterValue(req,"rcpm_shet_no_fr",true);
		 * dm.rcpm_shet_no_to =
		 * Util.getSessionParameterValue(req,"rcpm_shet_no_to",true);
		 * dm.rcpm_clsf_cd =
		 * Util.getSessionParameterValue(req,"rcpm_clsf_cd",true);
		 * dm.rcpm_shet_dlv_dt_fr =
		 * Util.getSessionParameterValue(req,"rcpm_shet_dlv_dt_fr",true);
		 * dm.rcpm_shet_dlv_dt_to =
		 * Util.getSessionParameterValue(req,"rcpm_shet_dlv_dt_to",true);
		 * dm.dept_no = Util.getSessionParameterValue(req,"dept_no",true);
		 *******************************************************************************************/
	}

	public void fc_acct_2170_m(HttpServletRequest req, HttpServletResponse res)
			throws AppException, SQLException {
		FC_ACCT_2170_MDataSet ds = null;
		FC_ACCT_2170_MDM dm = new FC_ACCT_2170_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.uid = Util.getSessionParameterValue(req, "uid", true);

		/* EJB 수정후 시작 */
		ds = dao.fc_acct_2170_m(dm);

		if (!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/*
		 * EJB 수정전 시작 try { FC_ACCT_2000EJBHome home =
		 * (FC_ACCT_2000EJBHome)JNDIManager
		 * .getInstance().getHome("FC_ACCT_2000EJB"); FC_ACCT_2000EJB ejb =
		 * home.create();
		 * 
		 * ds = ejb.fc_acct_2170_m(dm); req.setAttribute("ds", ds); } catch
		 * (CreateException e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } catch (RemoteException
		 * e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } EJB 수정전 끝
		 */

		/*******************************************************************************************
		 * String multiUpdateData =
		 * Util.checkString(req.getParameter("multiUpdateData")); Hashtable hash
		 * = getHashMultiUpdateData(multiUpdateData);
		 * 
		 * dm.cmpy_cd = (String)hash.get("cmpy_cd");
		 *******************************************************************************************/
	}

	public void fc_acct_2171_l(HttpServletRequest req, HttpServletResponse res)
			throws AppException, SQLException {
		FC_ACCT_2171_LDataSet ds = null;
		FC_ACCT_2171_LDM dm = new FC_ACCT_2171_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.uid = Util.getSessionParameterValue(req, "uid", true);
		dm.prof_type_cd = Util.checkString(req.getParameter("prof_type_cd"));
		dm.slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
		dm.tax_stmt_aprv_yn = Util.checkString(req
				.getParameter("tax_stmt_aprv_yn"));
		dm.slip_occr_dt_fr = Util.checkString(req
				.getParameter("slip_occr_dt_fr"));
		dm.slip_occr_dt_to = Util.checkString(req
				.getParameter("slip_occr_dt_to"));
		dm.dlco_nm = Util.checkString(req.getParameter("dlco_nm"));

		dm.print();

		/* EJB 수정후 시작 */
		ds = dao.fc_acct_2171_l(dm);

		if (!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/*
		 * EJB 수정전 시작 try { FC_ACCT_2000EJBHome home =
		 * (FC_ACCT_2000EJBHome)JNDIManager
		 * .getInstance().getHome("FC_ACCT_2000EJB"); FC_ACCT_2000EJB ejb =
		 * home.create();
		 * 
		 * ds = ejb.fc_acct_2171_l(dm); req.setAttribute("ds", ds); } catch
		 * (CreateException e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } catch (RemoteException
		 * e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } EJB 수정전 끝
		 */

		/*******************************************************************************************
		 * String multiUpdateData =
		 * Util.checkString(req.getParameter("multiUpdateData")); Hashtable hash
		 * = getHashMultiUpdateData(multiUpdateData);
		 * 
		 * dm.cmpy_cd = (String)hash.get("cmpy_cd"); dm.uid =
		 * (String)hash.get("uid"); dm.prof_type_cd =
		 * (String)hash.get("prof_type_cd"); dm.slip_clsf_cd =
		 * (String)hash.get("slip_clsf_cd"); dm.tax_stmt_aprv_yn =
		 * (String)hash.get("tax_stmt_aprv_yn"); dm.slip_occr_dt_fr =
		 * (String)hash.get("slip_occr_dt_fr"); dm.slip_occr_dt_to =
		 * (String)hash.get("slip_occr_dt_to");
		 *******************************************************************************************/

		/*******************************************************************************************
		 * dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		 * dm.uid = Util.getSessionParameterValue(req,"uid",true);
		 * dm.prof_type_cd =
		 * Util.getSessionParameterValue(req,"prof_type_cd",true);
		 * dm.slip_clsf_cd =
		 * Util.getSessionParameterValue(req,"slip_clsf_cd",true);
		 * dm.tax_stmt_aprv_yn =
		 * Util.getSessionParameterValue(req,"tax_stmt_aprv_yn",true);
		 * dm.slip_occr_dt_fr =
		 * Util.getSessionParameterValue(req,"slip_occr_dt_fr",true);
		 * dm.slip_occr_dt_to =
		 * Util.getSessionParameterValue(req,"slip_occr_dt_to",true);
		 *******************************************************************************************/
	}

	public void fc_acct_2172_a(HttpServletRequest req, HttpServletResponse res)
			throws AppException, SQLException {
		FC_ACCT_2172_ADataSet ds = null;
		FC_ACCT_2172_ADM dm = new FC_ACCT_2172_ADM();

		String multiUpdateData = Util.checkString(req
				.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.slip_occr_dt = (String) hash.get("tax_stmt");
		dm.slip_clsf_cd = (String) hash.get("tax_stmt");
		dm.slip_seq = (String) hash.get("tax_stmt");
		dm.tmsg_type = Util.checkString(req.getParameter("tmsg_type"));
		dm.stmt_clsf = Util.checkString(req.getParameter("stmt_clsf"));
		dm.pers_clsf = Util.checkString(req.getParameter("pers_clsf"));
		dm.semuro_id = Util.checkString(req.getParameter("semuro_id"));
		dm.incmg_pers_ip = req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);

		dm.print();

		/* EJB 수정후 시작 */
		ds = dao.fc_acct_2172_a(dm);


		if (!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/*
		 * EJB 수정전 시작 try { FC_ACCT_2000EJBHome home =
		 * (FC_ACCT_2000EJBHome)JNDIManager
		 * .getInstance().getHome("FC_ACCT_2000EJB"); FC_ACCT_2000EJB ejb =
		 * home.create();
		 * 
		 * ds = ejb.fc_acct_2172_a(dm); req.setAttribute("ds", ds); } catch
		 * (CreateException e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } catch (RemoteException
		 * e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } EJB 수정전 끝
		 */

		/*******************************************************************************************
		 * String multiUpdateData =
		 * Util.checkString(req.getParameter("multiUpdateData")); Hashtable hash
		 * = getHashMultiUpdateData(multiUpdateData);
		 * 
		 * dm.cmpy_cd = (String)hash.get("cmpy_cd"); dm.slip_occr_dt =
		 * (String)hash.get("slip_occr_dt"); dm.slip_clsf_cd =
		 * (String)hash.get("slip_clsf_cd"); dm.slip_seq =
		 * (String)hash.get("slip_seq"); dm.tmsg_type =
		 * (String)hash.get("tmsg_type"); dm.stmt_clsf =
		 * (String)hash.get("stmt_clsf"); dm.pers_clsf =
		 * (String)hash.get("pers_clsf"); dm.semuro_id =
		 * (String)hash.get("semuro_id"); dm.incmg_pers_ip =
		 * (String)hash.get("incmg_pers_ip"); dm.incmg_pers =
		 * (String)hash.get("incmg_pers");
		 *******************************************************************************************/

		/*******************************************************************************************
		 * dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		 * dm.slip_occr_dt =
		 * Util.getSessionParameterValue(req,"slip_occr_dt",true);
		 * dm.slip_clsf_cd =
		 * Util.getSessionParameterValue(req,"slip_clsf_cd",true); dm.slip_seq =
		 * Util.getSessionParameterValue(req,"slip_seq",true); dm.tmsg_type =
		 * Util.getSessionParameterValue(req,"tmsg_type",true); dm.stmt_clsf =
		 * Util.getSessionParameterValue(req,"stmt_clsf",true); dm.pers_clsf =
		 * Util.getSessionParameterValue(req,"pers_clsf",true); dm.semuro_id =
		 * Util.getSessionParameterValue(req,"semuro_id",true); dm.incmg_pers_ip
		 * = Util.getSessionParameterValue(req,"incmg_pers_ip",true);
		 * dm.incmg_pers = Util.getSessionParameterValue(req,"incmg_pers",true);
		 *******************************************************************************************/
	}

	public void fc_acct_2173_u(HttpServletRequest req, HttpServletResponse res)
			throws AppException, SQLException {
		FC_ACCT_2173_UDataSet ds = null;
		FC_ACCT_2173_UDM dm = new FC_ACCT_2173_UDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.slip_occr_dt = Util.checkString(req.getParameter("slip_occr_dt"));
		dm.slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
		dm.slip_seq = Util.checkString(req.getParameter("slip_seq"));
		dm.semuro_no = Util.checkString(req.getParameter("semuro_no"));
		dm.incmg_pers_ip = req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);

		dm.print();

		/* EJB 수정후 시작 */
		ds = dao.fc_acct_2173_u(dm);

		if (!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/*
		 * EJB 수정전 시작 try { FC_ACCT_2000EJBHome home =
		 * (FC_ACCT_2000EJBHome)JNDIManager
		 * .getInstance().getHome("FC_ACCT_2000EJB"); FC_ACCT_2000EJB ejb =
		 * home.create();
		 * 
		 * ds = ejb.fc_acct_2173_u(dm); req.setAttribute("ds", ds); } catch
		 * (CreateException e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } catch (RemoteException
		 * e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } EJB 수정전 끝
		 */

		/*******************************************************************************************
		 * String multiUpdateData =
		 * Util.checkString(req.getParameter("multiUpdateData")); Hashtable hash
		 * = getHashMultiUpdateData(multiUpdateData);
		 * 
		 * dm.cmpy_cd = (String)hash.get("cmpy_cd"); dm.slip_occr_dt =
		 * (String)hash.get("slip_occr_dt"); dm.slip_clsf_cd =
		 * (String)hash.get("slip_clsf_cd"); dm.slip_seq =
		 * (String)hash.get("slip_seq"); dm.semuro_no =
		 * (String)hash.get("semuro_no"); dm.incmg_pers_ip =
		 * (String)hash.get("incmg_pers_ip"); dm.incmg_pers =
		 * (String)hash.get("incmg_pers");
		 *******************************************************************************************/

		/*******************************************************************************************
		 * dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		 * dm.slip_occr_dt =
		 * Util.getSessionParameterValue(req,"slip_occr_dt",true);
		 * dm.slip_clsf_cd =
		 * Util.getSessionParameterValue(req,"slip_clsf_cd",true); dm.slip_seq =
		 * Util.getSessionParameterValue(req,"slip_seq",true); dm.semuro_no =
		 * Util.getSessionParameterValue(req,"semuro_no",true); dm.incmg_pers_ip
		 * = Util.getSessionParameterValue(req,"incmg_pers_ip",true);
		 * dm.incmg_pers = Util.getSessionParameterValue(req,"incmg_pers",true);
		 *******************************************************************************************/
	}

	public void fc_acct_2310_l(HttpServletRequest req, HttpServletResponse res)
			throws AppException, SQLException {
		FC_ACCT_2310_LDataSet ds = null;
		FC_ACCT_2310_LDM dm = new FC_ACCT_2310_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.pay_yn = Util.checkString(req.getParameter("pay_yn"));
		dm.reserv_dt_fr = Util.checkString(req.getParameter("reserv_dt_fr"));
		dm.reserv_dt_to = Util.checkString(req.getParameter("reserv_dt_to"));

		/* EJB 수정후 시작 */
		ds = dao.fc_acct_2310_l(dm);

		if (!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/*
		 * EJB 수정전 시작 try { FC_ACCT_2000EJBHome home =
		 * (FC_ACCT_2000EJBHome)JNDIManager
		 * .getInstance().getHome("FC_ACCT_2000EJB"); FC_ACCT_2000EJB ejb =
		 * home.create();
		 * 
		 * ds = ejb.fc_acct_2310_l(dm); req.setAttribute("ds", ds); } catch
		 * (CreateException e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } catch (RemoteException
		 * e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } EJB 수정전 끝
		 */

		/*******************************************************************************************
		 * String multiUpdateData =
		 * Util.checkString(req.getParameter("multiUpdateData")); Hashtable hash
		 * = getHashMultiUpdateData(multiUpdateData);
		 * 
		 * dm.cmpy_cd = (String)hash.get("cmpy_cd"); dm.pay_yn =
		 * (String)hash.get("pay_yn"); dm.reserv_dt_fr =
		 * (String)hash.get("reserv_dt_fr"); dm.reserv_dt_to =
		 * (String)hash.get("reserv_dt_to");
		 *******************************************************************************************/
	}

	public void fc_acct_2431_l(HttpServletRequest req, HttpServletResponse res)
			throws AppException, SQLException {
		FC_ACCT_2431_LDataSet ds = null;
		FC_ACCT_2431_LDM dm = new FC_ACCT_2431_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.clam_dept_cd = Util.checkString(req.getParameter("clam_dept_cd"));
		dm.clam_dept_part_cd = Util.checkString(req
				.getParameter("clam_dept_part_cd"));
		dm.impt_expn_clsf = Util
				.checkString(req.getParameter("impt_expn_clsf"));
		dm.slip_occr_dt_fr = Util.checkString(req
				.getParameter("slip_occr_dt_fr"));
		dm.slip_occr_dt_to = Util.checkString(req
				.getParameter("slip_occr_dt_to"));

		/* EJB 수정후 시작 */
		ds = dao.fc_acct_2431_l(dm);

		if (!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/*
		 * EJB 수정전 시작 try { FC_ACCT_2000EJBHome home =
		 * (FC_ACCT_2000EJBHome)JNDIManager
		 * .getInstance().getHome("FC_ACCT_2000EJB"); FC_ACCT_2000EJB ejb =
		 * home.create();
		 * 
		 * ds = ejb.fc_acct_2431_l(dm); req.setAttribute("ds", ds); } catch
		 * (CreateException e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } catch (RemoteException
		 * e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } EJB 수정전 끝
		 */

		/*******************************************************************************************
		 * String multiUpdateData =
		 * Util.checkString(req.getParameter("multiUpdateData")); Hashtable hash
		 * = getHashMultiUpdateData(multiUpdateData);
		 * 
		 * dm.cmpy_cd = (String)hash.get("cmpy_cd"); dm.clam_dept_cd =
		 * (String)hash.get("clam_dept_cd"); dm.clam_dept_part_cd =
		 * (String)hash.get("clam_dept_part_cd"); dm.impt_expn_clsf =
		 * (String)hash.get("impt_expn_clsf"); dm.slip_occr_dt_fr =
		 * (String)hash.get("slip_occr_dt_fr"); dm.slip_occr_dt_to =
		 * (String)hash.get("slip_occr_dt_to");
		 *******************************************************************************************/
	}

	public void fc_acct_2430_m(HttpServletRequest req, HttpServletResponse res)
			throws AppException, SQLException {
		FC_ACCT_2430_MDataSet ds = null;
		FC_ACCT_2430_MDM dm = new FC_ACCT_2430_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.clam_dept_cd = Util.checkString(req.getParameter("clam_dept_cd"));

		/* EJB 수정후 시작 */
		ds = dao.fc_acct_2430_m(dm);

		if (!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/*
		 * EJB 수정전 시작 try { FC_ACCT_2000EJBHome home =
		 * (FC_ACCT_2000EJBHome)JNDIManager
		 * .getInstance().getHome("FC_ACCT_2000EJB"); FC_ACCT_2000EJB ejb =
		 * home.create();
		 * 
		 * ds = ejb.fc_acct_2430_m(dm); req.setAttribute("ds", ds); } catch
		 * (CreateException e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } catch (RemoteException
		 * e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } EJB 수정전 끝
		 */

		/*******************************************************************************************
		 * String multiUpdateData =
		 * Util.checkString(req.getParameter("multiUpdateData")); Hashtable hash
		 * = getHashMultiUpdateData(multiUpdateData);
		 * 
		 * dm.cmpy_cd = (String)hash.get("cmpy_cd"); dm.dept_cd =
		 * (String)hash.get("dept_cd");
		 *******************************************************************************************/
	}

	public void fc_acct_2450_m(HttpServletRequest req, HttpServletResponse res)
			throws AppException, SQLException {
		FC_ACCT_2450_MDataSet ds = null;
		FC_ACCT_2450_MDM dm = new FC_ACCT_2450_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);

		dm.print();

		/* EJB 수정후 시작 */
		ds = dao.fc_acct_2450_m(dm);

		if (!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/*
		 * EJB 수정전 시작 try { FC_ACCT_2000EJBHome home =
		 * (FC_ACCT_2000EJBHome)JNDIManager
		 * .getInstance().getHome("FC_ACCT_2000EJB"); FC_ACCT_2000EJB ejb =
		 * home.create();
		 * 
		 * ds = ejb.fc_acct_2450_m(dm); req.setAttribute("ds", ds); } catch
		 * (CreateException e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } catch (RemoteException
		 * e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } EJB 수정전 끝
		 */

		/*******************************************************************************************
		 * String multiUpdateData =
		 * Util.checkString(req.getParameter("multiUpdateData")); Hashtable hash
		 * = getHashMultiUpdateData(multiUpdateData);
		 * 
		 * dm.cmpy_cd = (String)hash.get("cmpy_cd");
		 *******************************************************************************************/

		/*******************************************************************************************
		 * dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		 *******************************************************************************************/
	}

	public void fc_acct_2451_l(HttpServletRequest req, HttpServletResponse res)
			throws AppException, SQLException {
		FC_ACCT_2451_LDataSet ds = null;
		FC_ACCT_2451_LDM dm = new FC_ACCT_2451_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.uid = Util.getSessionParameterValue(req, "uid", true);
		dm.slip_occr_dt = Util.checkString(req.getParameter("slip_occr_dt"));
		dm.slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
		dm.slip_seq = Util.checkString(req.getParameter("slip_seq"));

		dm.print();

		/* EJB 수정후 시작 */
		ds = dao.fc_acct_2451_l(dm);

		if (!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/*
		 * EJB 수정전 시작 try { FC_ACCT_2000EJBHome home =
		 * (FC_ACCT_2000EJBHome)JNDIManager
		 * .getInstance().getHome("FC_ACCT_2000EJB"); FC_ACCT_2000EJB ejb =
		 * home.create();
		 * 
		 * ds = ejb.fc_acct_2451_l(dm); req.setAttribute("ds", ds); } catch
		 * (CreateException e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } catch (RemoteException
		 * e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } EJB 수정전 끝
		 */

		/*******************************************************************************************
		 * String multiUpdateData =
		 * Util.checkString(req.getParameter("multiUpdateData")); Hashtable hash
		 * = getHashMultiUpdateData(multiUpdateData);
		 * 
		 * dm.cmpy_cd = (String)hash.get("cmpy_cd"); dm.uid =
		 * (String)hash.get("uid"); dm.slip_occr_dt =
		 * (String)hash.get("slip_occr_dt"); dm.slip_clsf_cd =
		 * (String)hash.get("slip_clsf_cd"); dm.slip_seq =
		 * (String)hash.get("slip_seq");
		 *******************************************************************************************/

		/*******************************************************************************************
		 * dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		 * dm.uid = Util.getSessionParameterValue(req,"uid",true);
		 * dm.slip_occr_dt =
		 * Util.getSessionParameterValue(req,"slip_occr_dt",true);
		 * dm.slip_clsf_cd =
		 * Util.getSessionParameterValue(req,"slip_clsf_cd",true); dm.slip_seq =
		 * Util.getSessionParameterValue(req,"slip_seq",true);
		 *******************************************************************************************/
	}

	public void fc_acct_2460_l(HttpServletRequest req, HttpServletResponse res)
			throws AppException, SQLException {
		FC_ACCT_2460_LDataSet ds = null;
		FC_ACCT_2460_LDM dm = new FC_ACCT_2460_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.slip_occr_dt_fr = Util.checkString(req
				.getParameter("slip_occr_dt_fr"));
		dm.slip_occr_dt_to = Util.checkString(req
				.getParameter("slip_occr_dt_to"));
		dm.fisc_dt_fr = Util.checkString(req.getParameter("fisc_dt_fr"));
		dm.fisc_dt_to = Util.checkString(req.getParameter("fisc_dt_to"));
		dm.incmg_dt_fr = Util.checkString(req.getParameter("incmg_dt_fr"));
		dm.incmg_dt_to = Util.checkString(req.getParameter("incmg_dt_to"));
		dm.slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
		dm.incmg_emp_no = Util.checkString(req.getParameter("incmg_emp_no"));
		// dm.incmg_emp_no = Util.getSessionParameterValue(req,"emp_no",true);
		dm.slip_aprv_yn = Util.checkString(req.getParameter("slip_aprv_yn"));

		dm.print();

		/* EJB 수정후 시작 */
		ds = dao.fc_acct_2460_l(dm);

		if (!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/*
		 * EJB 수정전 시작 try { FC_ACCT_2000EJBHome home =
		 * (FC_ACCT_2000EJBHome)JNDIManager
		 * .getInstance().getHome("FC_ACCT_2000EJB"); FC_ACCT_2000EJB ejb =
		 * home.create();
		 * 
		 * ds = ejb.fc_acct_2460_l(dm); req.setAttribute("ds", ds); } catch
		 * (CreateException e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } catch (RemoteException
		 * e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } EJB 수정전 끝
		 */

		/*******************************************************************************************
		 * String multiUpdateData =
		 * Util.checkString(req.getParameter("multiUpdateData")); Hashtable hash
		 * = getHashMultiUpdateData(multiUpdateData);
		 * 
		 * dm.cmpy_cd = (String)hash.get("cmpy_cd"); dm.slip_occr_dt_fr =
		 * (String)hash.get("slip_occr_dt_fr"); dm.slip_occr_dt_to =
		 * (String)hash.get("slip_occr_dt_to"); dm.fisc_dt_fr =
		 * (String)hash.get("fisc_dt_fr"); dm.fisc_dt_to =
		 * (String)hash.get("fisc_dt_to"); dm.incmg_dt_fr =
		 * (String)hash.get("incmg_dt_fr"); dm.incmg_dt_to =
		 * (String)hash.get("incmg_dt_to"); dm.slip_clsf_cd =
		 * (String)hash.get("slip_clsf_cd"); dm.incmg_emp_no =
		 * (String)hash.get("incmg_emp_no"); dm.slip_aprv_yn =
		 * (String)hash.get("slip_aprv_yn");
		 *******************************************************************************************/
	}
	
	public void fc_acct_2461_i(HttpServletRequest req, HttpServletResponse res) throws AppException {
		FC_ACCT_2461_IDataSet ds = null;
		FC_ACCT_2461_IDM dm = new FC_ACCT_2461_IDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.slip_data = Util.checkString(req.getParameter("slip_data"));
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		dm.clgbcd = Util.checkString(req.getParameter("clgbcd"));

		dm.print();

		/* EJB 수정후 시작 */
		ds = dao.fc_acct_2461_i(dm);

		if (!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/*
		try {
			FC_ACCT_2000EJBHome home = (FC_ACCT_2000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_2000EJB");
			FC_ACCT_2000EJB ejb = home.create();

			ds = ejb.fc_acct_2461_i(dm);
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
		dm.slip_data = (String)hash.get("slip_data");
		dm.incmg_pers = (String)hash.get("incmg_pers");
		dm.incmg_pers_ipadd = (String)hash.get("incmg_pers_ipadd");
		dm.clgbcd = (String)hash.get("clgbcd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.slip_data = Util.getSessionParameterValue(req,"slip_data",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"incmg_pers",true);
		dm.incmg_pers_ipadd = Util.getSessionParameterValue(req,"incmg_pers_ipadd",true);
		dm.clgbcd = Util.getSessionParameterValue(req,"clgbcd",true);
		*******************************************************************************************/
	}

	public void fc_acct_2540_l(HttpServletRequest req, HttpServletResponse res)
			throws AppException, SQLException {
		FC_ACCT_2540_LDataSet ds = null;
		FC_ACCT_2540_LDM dm = new FC_ACCT_2540_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.acct_cd = Util.checkString(req.getParameter("acct_cd"));
		dm.fr_fisc_dt = Util.checkString(req.getParameter("fr_fisc_dt"));
		dm.to_fisc_dt = Util.checkString(req.getParameter("to_fisc_dt"));
		dm.dlco_clsf_cd = Util.checkString(req.getParameter("dlco_clsf_cd"));
		dm.dlco_cd = Util.checkString(req.getParameter("dlco_cd"));
		dm.medi_cd = Util.checkString(req.getParameter("medi_cd"));
		dm.mang_clsf_cd = Util.checkString(req.getParameter("mang_clsf_cd"));
		dm.evnt_cd = Util.checkString(req.getParameter("evnt_cd"));
		dm.clam_dept_cd = Util.checkString(req.getParameter("clam_dept_cd"));
		dm.setoff_slip_clsf_cd = Util.checkString(req
				.getParameter("setoff_slip_clsf_cd"));
		dm.dr_amt = Util.checkString(req.getParameter("dr_amt"));
		dm.crdt_amt = Util.checkString(req.getParameter("crdt_amt"));
		dm.incmg_emp_no = Util.checkString(req.getParameter("incmg_emp_no"));
		dm.drcr_clsf_1 = Util.checkString(req.getParameter("drcr_clsf_1"));
		dm.drcr_clsf_2 = Util.checkString(req.getParameter("drcr_clsf_2"));
		dm.pch_x = Util.checkString(req.getParameter("pch_x"));

		dm.print();

		/* EJB 수정후 시작 */
		ds = dao.fc_acct_2540_l(dm);

		if (!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/*
		 * EJB 수정전 시작 try { FC_ACCT_2000EJBHome home =
		 * (FC_ACCT_2000EJBHome)JNDIManager
		 * .getInstance().getHome("FC_ACCT_2000EJB"); FC_ACCT_2000EJB ejb =
		 * home.create();
		 * 
		 * ds = ejb.fc_acct_2540_l(dm); req.setAttribute("ds", ds); } catch
		 * (CreateException e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } catch (RemoteException
		 * e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } EJB 수정전 끝
		 */

		/*******************************************************************************************
		 * String multiUpdateData =
		 * Util.checkString(req.getParameter("multiUpdateData")); Hashtable hash
		 * = getHashMultiUpdateData(multiUpdateData);
		 * 
		 * dm.cmpy_cd = (String)hash.get("cmpy_cd"); dm.acct_cd =
		 * (String)hash.get("acct_cd"); dm.fr_fisc_dt =
		 * (String)hash.get("fr_fisc_dt"); dm.to_fisc_dt =
		 * (String)hash.get("to_fisc_dt"); dm.dlco_clsf_cd =
		 * (String)hash.get("dlco_clsf_cd"); dm.dlco_cd =
		 * (String)hash.get("dlco_cd"); dm.medi_cd =
		 * (String)hash.get("medi_cd"); dm.mang_clsf_cd =
		 * (String)hash.get("mang_clsf_cd"); dm.evnt_cd =
		 * (String)hash.get("evnt_cd"); dm.clam_dept_cd =
		 * (String)hash.get("clam_dept_cd"); dm.setoff_slip_clsf_cd =
		 * (String)hash.get("setoff_slip_clsf_cd"); dm.dr_amt =
		 * (String)hash.get("dr_amt"); dm.crdt_amt =
		 * (String)hash.get("crdt_amt"); dm.incmg_emp_no =
		 * (String)hash.get("incmg_emp_no"); dm.drcr_clsf_1 =
		 * (String)hash.get("drcr_clsf_1"); dm.drcr_clsf_2 =
		 * (String)hash.get("drcr_clsf_2"); dm.pch_x =
		 * (String)hash.get("pch_x");
		 *******************************************************************************************/

		/*******************************************************************************************
		 * dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		 * dm.acct_cd = Util.getSessionParameterValue(req,"acct_cd",true);
		 * dm.fr_fisc_dt = Util.getSessionParameterValue(req,"fr_fisc_dt",true);
		 * dm.to_fisc_dt = Util.getSessionParameterValue(req,"to_fisc_dt",true);
		 * dm.dlco_clsf_cd =
		 * Util.getSessionParameterValue(req,"dlco_clsf_cd",true); dm.dlco_cd =
		 * Util.getSessionParameterValue(req,"dlco_cd",true); dm.medi_cd =
		 * Util.getSessionParameterValue(req,"medi_cd",true); dm.mang_clsf_cd =
		 * Util.getSessionParameterValue(req,"mang_clsf_cd",true); dm.evnt_cd =
		 * Util.getSessionParameterValue(req,"evnt_cd",true); dm.clam_dept_cd =
		 * Util.getSessionParameterValue(req,"clam_dept_cd",true);
		 * dm.setoff_slip_clsf_cd =
		 * Util.getSessionParameterValue(req,"setoff_slip_clsf_cd",true);
		 * dm.dr_amt = Util.getSessionParameterValue(req,"dr_amt",true);
		 * dm.crdt_amt = Util.getSessionParameterValue(req,"crdt_amt",true);
		 * dm.incmg_emp_no =
		 * Util.getSessionParameterValue(req,"incmg_emp_no",true);
		 * dm.drcr_clsf_1 =
		 * Util.getSessionParameterValue(req,"drcr_clsf_1",true); dm.drcr_clsf_2
		 * = Util.getSessionParameterValue(req,"drcr_clsf_2",true); dm.pch_x =
		 * Util.getSessionParameterValue(req,"pch_x",true);
		 *******************************************************************************************/
	}

	public void fc_acct_2541_l(HttpServletRequest req, HttpServletResponse res)
			throws AppException, SQLException {
		FC_ACCT_2541_LDataSet ds = null;
		FC_ACCT_2541_LDM dm = new FC_ACCT_2541_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.fisc_dt = Util.checkString(req.getParameter("fisc_dt"));
		dm.mang_clsf_cd = Util.checkString(req.getParameter("mang_clsf_cd"));

		dm.print();

		/* EJB 수정후 시작 */
		ds = dao.fc_acct_2541_l(dm);

		if (!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/*
		 * EJB 수정전 시작 try { FC_ACCT_2000EJBHome home =
		 * (FC_ACCT_2000EJBHome)JNDIManager
		 * .getInstance().getHome("FC_ACCT_2000EJB"); FC_ACCT_2000EJB ejb =
		 * home.create();
		 * 
		 * ds = ejb.fc_acct_2541_l(dm); req.setAttribute("ds", ds); } catch
		 * (CreateException e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } catch (RemoteException
		 * e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } EJB 수정전 끝
		 */

		/*******************************************************************************************
		 * String multiUpdateData =
		 * Util.checkString(req.getParameter("multiUpdateData")); Hashtable hash
		 * = getHashMultiUpdateData(multiUpdateData);
		 * 
		 * dm.cmpy_cd = (String)hash.get("cmpy_cd"); dm.fisc_dt =
		 * (String)hash.get("fisc_dt"); dm.mang_clsf_cd =
		 * (String)hash.get("mang_clsf_cd");
		 *******************************************************************************************/

		/*******************************************************************************************
		 * dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		 * dm.fisc_dt = Util.getSessionParameterValue(req,"fisc_dt",true);
		 * dm.mang_clsf_cd =
		 * Util.getSessionParameterValue(req,"mang_clsf_cd",true);
		 *******************************************************************************************/
	}

	public void fc_acct_2550_m(HttpServletRequest req, HttpServletResponse res)
			throws AppException, SQLException {
		FC_ACCT_2550_MDataSet ds = null;
		FC_ACCT_2550_MDM dm = new FC_ACCT_2550_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);

		dm.print();

		/* EJB 수정후 시작 */
		ds = dao.fc_acct_2550_m(dm);

		if (!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/*
		 * EJB 수정전 시작 try { FC_ACCT_2000EJBHome home =
		 * (FC_ACCT_2000EJBHome)JNDIManager
		 * .getInstance().getHome("FC_ACCT_2000EJB"); FC_ACCT_2000EJB ejb =
		 * home.create();
		 * 
		 * ds = ejb.fc_acct_2550_m(dm); req.setAttribute("ds", ds); } catch
		 * (CreateException e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } catch (RemoteException
		 * e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } EJB 수정전 끝
		 */

		/*******************************************************************************************
		 * String multiUpdateData =
		 * Util.checkString(req.getParameter("multiUpdateData")); Hashtable hash
		 * = getHashMultiUpdateData(multiUpdateData);
		 * 
		 * dm.cmpy_cd = (String)hash.get("cmpy_cd");
		 *******************************************************************************************/

		/*******************************************************************************************
		 * dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		 *******************************************************************************************/
	}

	public void fc_acct_2555_s(HttpServletRequest req, HttpServletResponse res)
			throws AppException, SQLException {
		FC_ACCT_2555_SDataSet ds = null;
		FC_ACCT_2555_SDM dm = new FC_ACCT_2555_SDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.slip_occr_dt = Util.checkString(req.getParameter("slip_occr_dt"));
		dm.slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
		dm.slip_seq = Util.checkString(req.getParameter("slip_seq"));

		dm.print();

		/* EJB 수정후 시작 */
		ds = dao.fc_acct_2555_s(dm);

		if (!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/*
		 * EJB 수정전 시작 try { FC_ACCT_2000EJBHome home =
		 * (FC_ACCT_2000EJBHome)JNDIManager
		 * .getInstance().getHome("FC_ACCT_2000EJB"); FC_ACCT_2000EJB ejb =
		 * home.create();
		 * 
		 * ds = ejb.fc_acct_2555_s(dm); req.setAttribute("ds", ds); } catch
		 * (CreateException e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } catch (RemoteException
		 * e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } EJB 수정전 끝
		 */

		/*******************************************************************************************
		 * String multiUpdateData =
		 * Util.checkString(req.getParameter("multiUpdateData")); Hashtable hash
		 * = getHashMultiUpdateData(multiUpdateData);
		 * 
		 * dm.cmpy_cd = (String)hash.get("cmpy_cd"); dm.slip_occr_dt =
		 * (String)hash.get("slip_occr_dt"); dm.slip_clsf_cd =
		 * (String)hash.get("slip_clsf_cd"); dm.slip_seq =
		 * (String)hash.get("slip_seq");
		 *******************************************************************************************/

		/*******************************************************************************************
		 * dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		 * dm.slip_occr_dt =
		 * Util.getSessionParameterValue(req,"slip_occr_dt",true);
		 * dm.slip_clsf_cd =
		 * Util.getSessionParameterValue(req,"slip_clsf_cd",true); dm.slip_seq =
		 * Util.getSessionParameterValue(req,"slip_seq",true);
		 *******************************************************************************************/
	}

	public void fc_acct_2900_l(HttpServletRequest req, HttpServletResponse res)
			throws AppException, SQLException {
		FC_ACCT_2900_LDataSet ds = null;
		FC_ACCT_2900_LDM dm = new FC_ACCT_2900_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.slip_occr_clsf = Util
				.checkString(req.getParameter("slip_occr_clsf"));
		dm.rmtt_dd = Util.checkString(req.getParameter("rmtt_dd"));

		dm.print();

		/* EJB 수정후 시작 */
		ds = dao.fc_acct_2900_l(dm);

		if (!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/*
		 * EJB 수정전 시작 try { FC_ACCT_2000EJBHome home =
		 * (FC_ACCT_2000EJBHome)JNDIManager
		 * .getInstance().getHome("FC_ACCT_2000EJB"); FC_ACCT_2000EJB ejb =
		 * home.create();
		 * 
		 * ds = ejb.fc_acct_2900_l(dm); req.setAttribute("ds", ds); } catch
		 * (CreateException e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } catch (RemoteException
		 * e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } EJB 수정전 끝
		 */

		/*******************************************************************************************
		 * String multiUpdateData =
		 * Util.checkString(req.getParameter("multiUpdateData")); Hashtable hash
		 * = getHashMultiUpdateData(multiUpdateData);
		 * 
		 * dm.cmpy_cd = (String)hash.get("cmpy_cd"); dm.slip_occr_clsf =
		 * (String)hash.get("slip_occr_clsf"); dm.rmtt_dd =
		 * (String)hash.get("rmtt_dd");
		 *******************************************************************************************/
	}

	public void fc_acct_2901_l(HttpServletRequest req, HttpServletResponse res)
			throws AppException, SQLException {
		FC_ACCT_2901_LDataSet ds = null;
		FC_ACCT_2901_LDM dm = new FC_ACCT_2901_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.slip_occr_dt = Util.checkString(req.getParameter("slip_occr_dt"));
		dm.slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
		dm.slip_seq = Util.checkString(req.getParameter("slip_seq"));

		/* EJB 수정후 시작 */
		ds = dao.fc_acct_2901_l(dm);

		if (!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/*
		 * EJB 수정전 시작 try { FC_ACCT_2000EJBHome home =
		 * (FC_ACCT_2000EJBHome)JNDIManager
		 * .getInstance().getHome("FC_ACCT_2000EJB"); FC_ACCT_2000EJB ejb =
		 * home.create();
		 * 
		 * ds = ejb.fc_acct_2901_l(dm); req.setAttribute("ds", ds); } catch
		 * (CreateException e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } catch (RemoteException
		 * e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } EJB 수정전 끝
		 */

		/*******************************************************************************************
		 * String multiUpdateData =
		 * Util.checkString(req.getParameter("multiUpdateData")); Hashtable hash
		 * = getHashMultiUpdateData(multiUpdateData);
		 * 
		 * dm.cmpy_cd = (String)hash.get("cmpy_cd"); dm.slip_occr_dt =
		 * (String)hash.get("slip_occr_dt"); dm.slip_clsf_cd =
		 * (String)hash.get("slip_clsf_cd"); dm.slip_seq =
		 * (String)hash.get("slip_seq");
		 *******************************************************************************************/
	}

	public void fc_acct_2902_u(HttpServletRequest req, HttpServletResponse res)
			throws AppException, SQLException {
		FC_ACCT_2902_UDataSet ds = null;
		FC_ACCT_2902_UDM dm = new FC_ACCT_2902_UDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_emp_no = Util.getSessionParameterValue(req, "emp_no", true);
		dm.chrg_emp_no = Util.getSessionParameterValue(req, "emp_no", true); // Util.checkString(req.getParameter("chrg_emp_no"));

		dm.yyyymmdd = Util.checkString(req.getParameter("yyyymmdd"));
		dm.fisc_dt = Util.checkString(req.getParameter("fisc_dt"));
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		dm.blng_dept = Util.getSessionParameterValue(req, "deptcd", true); // Util.checkString(req.getParameter("blng_dept"));
		dm.budg_cd1 = Util.checkString(req.getParameter("budg_cd1"));
		dm.mang_clsf_cd1 = Util.checkString(req.getParameter("mang_clsf_cd1"));

		String multiUpdateData = Util.checkString(req
				.getParameter("multiUpDate"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cnt = (String) hash.get("rmtt_cnt");
		dm.slip_occr_dt = (String) hash.get("slip_occr_dt");
		dm.slip_clsf_cd = (String) hash.get("slip_clsf_cd");
		dm.slip_seq = (String) hash.get("slip_seq");
		dm.slip_sub_seq = (String) hash.get("slip_sub_seq");
		dm.cal_pay_amt = (String) hash.get("calc_amt");
		dm.ptcr = (String) hash.get("ptcr");

		dm.print();

		/* EJB 수정후 시작 */
		ds = dao.fc_acct_2902_u(dm);

		if (!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/*
		 * EJB 수정전 시작 try { FC_ACCT_2000EJBHome home =
		 * (FC_ACCT_2000EJBHome)JNDIManager
		 * .getInstance().getHome("FC_ACCT_2000EJB"); FC_ACCT_2000EJB ejb =
		 * home.create();
		 * 
		 * ds = ejb.fc_acct_2902_u(dm); req.setAttribute("ds", ds); } catch
		 * (CreateException e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } catch (RemoteException
		 * e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } EJB 수정전 끝
		 */

		/*******************************************************************************************
		 * dm.cmpy_cd = (String)hash.get("cmpy_cd"); dm.yyyymmdd =
		 * (String)hash.get("yyyymmdd"); dm.fisc_dt =
		 * (String)hash.get("fisc_dt"); dm.incmg_emp_no =
		 * (String)hash.get("incmg_emp_no"); dm.chrg_emp_no =
		 * (String)hash.get("chrg_emp_no"); dm.incmg_pers_ipadd =
		 * (String)hash.get("incmg_pers_ipadd"); dm.blng_dept =
		 * (String)hash.get("blng_dept");
		 *******************************************************************************************/
	}

	public void fc_acct_2903_d(HttpServletRequest req, HttpServletResponse res)
			throws AppException, SQLException {
		FC_ACCT_2903_DDataSet ds = null;
		FC_ACCT_2903_DDM dm = new FC_ACCT_2903_DDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_emp_no = Util.getSessionParameterValue(req, "emp_no", true);
		// dm.cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
		// dm.incmg_emp_no = Util.checkString(req.getParameter("incmg_emp_no"));
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		// dm.incmg_pers_ipadd =
		// Util.checkString(req.getParameter("incmg_pers_ipadd"));

		String multiUpdateData = Util.checkString(req
				.getParameter("multiUpDate"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.slip_occr_dt = (String) hash.get("slip_occr_dt");
		dm.slip_clsf_cd = (String) hash.get("slip_clsf_cd");
		dm.slip_seq = (String) hash.get("slip_seq");
		dm.slip_sub_seq = (String) hash.get("slip_sub_seq");

		dm.print();

		/* EJB 수정후 시작 */
		ds = dao.fc_acct_2903_d(dm);

		if (!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/*
		 * EJB 수정전 시작 try { FC_ACCT_2000EJBHome home =
		 * (FC_ACCT_2000EJBHome)JNDIManager
		 * .getInstance().getHome("FC_ACCT_2000EJB"); FC_ACCT_2000EJB ejb =
		 * home.create();
		 * 
		 * ds = ejb.fc_acct_2903_d(dm); req.setAttribute("ds", ds); } catch
		 * (CreateException e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } catch (RemoteException
		 * e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } EJB 수정전 끝
		 */

		/*******************************************************************************************
		 * String multiUpdateData =
		 * Util.checkString(req.getParameter("multiUpdateData")); Hashtable hash
		 * = getHashMultiUpdateData(multiUpdateData);
		 * 
		 * dm.cmpy_cd = (String)hash.get("cmpy_cd"); dm.slip_occr_dt =
		 * (String)hash.get("slip_occr_dt"); dm.slip_clsf_cd =
		 * (String)hash.get("slip_clsf_cd"); dm.slip_seq =
		 * (String)hash.get("slip_seq"); dm.slip_sub_seq =
		 * (String)hash.get("slip_sub_seq"); dm.incmg_emp_no =
		 * (String)hash.get("incmg_emp_no"); dm.incmg_pers_ipadd =
		 * (String)hash.get("incmg_pers_ipadd");
		 *******************************************************************************************/
	}

	public void fc_acct_2904_l(HttpServletRequest req, HttpServletResponse res)
			throws AppException, SQLException {
		FC_ACCT_2904_LDataSet ds = null;
		FC_ACCT_2904_LDM dm = new FC_ACCT_2904_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.acct_rmtt_dt = Util.checkString(req.getParameter("acct_rmtt_dt"));

		dm.print();

		/* EJB 수정후 시작 */
		ds = dao.fc_acct_2904_l(dm);

		if (!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/*
		 * EJB 수정전 시작 try { FC_ACCT_2000EJBHome home =
		 * (FC_ACCT_2000EJBHome)JNDIManager
		 * .getInstance().getHome("FC_ACCT_2000EJB"); FC_ACCT_2000EJB ejb =
		 * home.create();
		 * 
		 * ds = ejb.fc_acct_2904_l(dm); req.setAttribute("ds", ds); } catch
		 * (CreateException e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } catch (RemoteException
		 * e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } EJB 수정전 끝
		 */

		/*******************************************************************************************
		 * String multiUpdateData =
		 * Util.checkString(req.getParameter("multiUpdateData")); Hashtable hash
		 * = getHashMultiUpdateData(multiUpdateData);
		 * 
		 * dm.cmpy_cd = (String)hash.get("cmpy_cd"); dm.acct_rmtt_dt =
		 * (String)hash.get("acct_rmtt_dt");
		 *******************************************************************************************/

		/*******************************************************************************************
		 * dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		 * dm.acct_rmtt_dt =
		 * Util.getSessionParameterValue(req,"acct_rmtt_dt",true);
		 *******************************************************************************************/
	}

	public void fc_acct_2905_l(HttpServletRequest req, HttpServletResponse res)
			throws AppException, SQLException {
		FC_ACCT_2905_LDataSet ds = null;
		FC_ACCT_2905_LDM dm = new FC_ACCT_2905_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.aprv_slip_occr_dt = Util.checkString(req
				.getParameter("aprv_slip_occr_dt"));
		dm.aprv_slip_clsf = Util
				.checkString(req.getParameter("aprv_slip_clsf"));
		dm.aprv_slip_occr_seqo = Util.checkString(req
				.getParameter("aprv_slip_occr_seqo"));
		dm.aprv_slip_occr_sub_seq = Util.checkString(req
				.getParameter("aprv_slip_occr_sub_seq"));

		dm.print();

		/* EJB 수정후 시작 */
		ds = dao.fc_acct_2905_l(dm);

		if (!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/*
		 * EJB 수정전 시작 try { FC_ACCT_2000EJBHome home =
		 * (FC_ACCT_2000EJBHome)JNDIManager
		 * .getInstance().getHome("FC_ACCT_2000EJB"); FC_ACCT_2000EJB ejb =
		 * home.create();
		 * 
		 * ds = ejb.fc_acct_2905_l(dm); req.setAttribute("ds", ds); } catch
		 * (CreateException e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } catch (RemoteException
		 * e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } EJB 수정전 끝
		 */

		/*******************************************************************************************
		 * String multiUpdateData =
		 * Util.checkString(req.getParameter("multiUpdateData")); Hashtable hash
		 * = getHashMultiUpdateData(multiUpdateData);
		 * 
		 * dm.cmpy_cd = (String)hash.get("cmpy_cd"); dm.aprv_slip_occr_dt =
		 * (String)hash.get("aprv_slip_occr_dt"); dm.aprv_slip_clsf =
		 * (String)hash.get("aprv_slip_clsf"); dm.aprv_slip_occr_seqo =
		 * (String)hash.get("aprv_slip_occr_seqo"); dm.aprv_slip_occr_sub_seq =
		 * (String)hash.get("aprv_slip_occr_sub_seq");
		 *******************************************************************************************/

		/*******************************************************************************************
		 * dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		 * dm.aprv_slip_occr_dt =
		 * Util.getSessionParameterValue(req,"aprv_slip_occr_dt",true);
		 * dm.aprv_slip_clsf =
		 * Util.getSessionParameterValue(req,"aprv_slip_clsf",true);
		 * dm.aprv_slip_occr_seqo =
		 * Util.getSessionParameterValue(req,"aprv_slip_occr_seqo",true);
		 * dm.aprv_slip_occr_sub_seq =
		 * Util.getSessionParameterValue(req,"aprv_slip_occr_sub_seq",true);
		 *******************************************************************************************/
	}

	public void fc_acct_2906_l(HttpServletRequest req, HttpServletResponse res)
			throws AppException, SQLException {
		FC_ACCT_2906_LDataSet ds = null;
		FC_ACCT_2906_LDM dm = new FC_ACCT_2906_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_dt = Util.checkString(req.getParameter("incmg_dt"));

		dm.print();

		/* EJB 수정후 시작 */
		ds = dao.fc_acct_2906_l(dm);

		if (!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/*
		 * EJB 수정전 시작 try { FC_ACCT_2000EJBHome home =
		 * (FC_ACCT_2000EJBHome)JNDIManager
		 * .getInstance().getHome("FC_ACCT_2000EJB"); FC_ACCT_2000EJB ejb =
		 * home.create();
		 * 
		 * ds = ejb.fc_acct_2906_l(dm); req.setAttribute("ds", ds); } catch
		 * (CreateException e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } catch (RemoteException
		 * e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } EJB 수정전 끝
		 */

		/*******************************************************************************************
		 * String multiUpdateData =
		 * Util.checkString(req.getParameter("multiUpdateData")); Hashtable hash
		 * = getHashMultiUpdateData(multiUpdateData);
		 * 
		 * dm.cmpy_cd = (String)hash.get("cmpy_cd"); dm.incmg_dt =
		 * (String)hash.get("incmg_dt");
		 *******************************************************************************************/

		/*******************************************************************************************
		 * dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		 * dm.incmg_dt = Util.getSessionParameterValue(req,"incmg_dt",true);
		 *******************************************************************************************/
	}

	public void fc_acct_2907_i(HttpServletRequest req, HttpServletResponse res)
			throws AppException, SQLException {
		FC_ACCT_2907_IDataSet ds = null;
		FC_ACCT_2907_IDM dm = new FC_ACCT_2907_IDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_dt = Util.checkString(req.getParameter("incmg_dt"));
		dm.fisc_dt = Util.checkString(req.getParameter("fisc_dt"));
		dm.incmg_emp_no = Util.checkString(req.getParameter("incmg_emp_no"));
		dm.chg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		dm.use_dept_cd = Util.getSessionParameterValue(req, "deptcd", true);
		dm.budg_cd1 = Util.checkString(req.getParameter("budg_cd1"));
		dm.mang_clsf_cd1 = Util.checkString(req.getParameter("mang_clsf_cd1"));

		String multiUpdateData = Util.checkString(req
				.getParameter("multiUpDate"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.budg_cd = (String) hash.get("budg_cd");
		dm.dr_amt = (String) hash.get("dr_amt");
		dm.clam_dept_cd = (String) hash.get("clam_dept_cd");
		dm.mang_clsf_cd = (String) hash.get("mang_clsf_cd");
		dm.boks_dlco_nm = (String) hash.get("boks_dlco_nm");
		dm.rmks2 = (String) hash.get("rmks2");

		dm.print();

		/* EJB 수정후 시작 */
		ds = dao.fc_acct_2907_i(dm);

		if (!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/*
		 * EJB 수정전 시작 try { FC_ACCT_2000EJBHome home =
		 * (FC_ACCT_2000EJBHome)JNDIManager
		 * .getInstance().getHome("FC_ACCT_2000EJB"); FC_ACCT_2000EJB ejb =
		 * home.create();
		 * 
		 * ds = ejb.fc_acct_2907_i(dm); req.setAttribute("ds", ds); } catch
		 * (CreateException e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } catch (RemoteException
		 * e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } EJB 수정전 끝
		 */

		/*******************************************************************************************
		 * String multiUpdateData =
		 * Util.checkString(req.getParameter("multiUpdateData")); Hashtable hash
		 * = getHashMultiUpdateData(multiUpdateData);
		 * 
		 * dm.cmpy_cd = (String)hash.get("cmpy_cd"); dm.incmg_dt =
		 * (String)hash.get("incmg_dt"); dm.fisc_dt =
		 * (String)hash.get("fisc_dt"); dm.incmg_emp_no =
		 * (String)hash.get("incmg_emp_no"); dm.chg_pers =
		 * (String)hash.get("chg_pers"); dm.incmg_pers_ipadd =
		 * (String)hash.get("incmg_pers_ipadd"); dm.use_dept_cd =
		 * (String)hash.get("use_dept_cd"); dm.budg_cd =
		 * (String)hash.get("budg_cd"); dm.dr_amt = (String)hash.get("dr_amt");
		 * dm.clam_dept_cd = (String)hash.get("clam_dept_cd"); dm.mang_clsf_cd =
		 * (String)hash.get("mang_clsf_cd"); dm.boks_dlco_nm =
		 * (String)hash.get("boks_dlco_nm"); dm.rmks2 =
		 * (String)hash.get("rmks2");
		 *******************************************************************************************/

		/*******************************************************************************************
		 * dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		 * dm.incmg_dt = Util.getSessionParameterValue(req,"incmg_dt",true);
		 * dm.fisc_dt = Util.getSessionParameterValue(req,"fisc_dt",true);
		 * dm.incmg_emp_no =
		 * Util.getSessionParameterValue(req,"incmg_emp_no",true); dm.chg_pers =
		 * Util.getSessionParameterValue(req,"chg_pers",true);
		 * dm.incmg_pers_ipadd =
		 * Util.getSessionParameterValue(req,"incmg_pers_ipadd",true);
		 * dm.use_dept_cd =
		 * Util.getSessionParameterValue(req,"use_dept_cd",true); dm.budg_cd =
		 * Util.getSessionParameterValue(req,"budg_cd",true); dm.dr_amt =
		 * Util.getSessionParameterValue(req,"dr_amt",true); dm.clam_dept_cd =
		 * Util.getSessionParameterValue(req,"clam_dept_cd",true);
		 * dm.mang_clsf_cd =
		 * Util.getSessionParameterValue(req,"mang_clsf_cd",true);
		 * dm.boks_dlco_nm =
		 * Util.getSessionParameterValue(req,"boks_dlco_nm",true); dm.rmks2 =
		 * Util.getSessionParameterValue(req,"rmks2",true);
		 *******************************************************************************************/
	}

	public void fc_acct_2908_d(HttpServletRequest req, HttpServletResponse res)
			throws AppException, SQLException {
		FC_ACCT_2908_DDataSet ds = null;
		FC_ACCT_2908_DDM dm = new FC_ACCT_2908_DDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.aprv_slip_occr_dt = Util.checkString(req
				.getParameter("aprv_slip_occr_dt"));
		dm.aprv_slip_clsf_cd = Util.checkString(req
				.getParameter("aprv_slip_clsf_cd"));
		dm.aprv_slip_seq = Util.checkString(req.getParameter("aprv_slip_seq"));
		dm.aprv_slip_sub_seq = Util.checkString(req
				.getParameter("aprv_slip_sub_seq"));
		dm.incmg_emp_no = Util.checkString(req.getParameter("incmg_emp_no"));
		dm.chg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.incmg_pers_ipadd = req.getRemoteAddr();

		dm.print();

		/* EJB 수정후 시작 */
		ds = dao.fc_acct_2908_d(dm);

		if (!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/*
		 * EJB 수정전 시작 try { FC_ACCT_2000EJBHome home =
		 * (FC_ACCT_2000EJBHome)JNDIManager
		 * .getInstance().getHome("FC_ACCT_2000EJB"); FC_ACCT_2000EJB ejb =
		 * home.create();
		 * 
		 * ds = ejb.fc_acct_2908_d(dm); req.setAttribute("ds", ds); } catch
		 * (CreateException e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } catch (RemoteException
		 * e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } EJB 수정전 끝
		 */

		/*******************************************************************************************
		 * String multiUpdateData =
		 * Util.checkString(req.getParameter("multiUpdateData")); Hashtable hash
		 * = getHashMultiUpdateData(multiUpdateData);
		 * 
		 * dm.cmpy_cd = (String)hash.get("cmpy_cd"); dm.aprv_slip_occr_dt =
		 * (String)hash.get("aprv_slip_occr_dt"); dm.aprv_slip_clsf_cd =
		 * (String)hash.get("aprv_slip_clsf_cd"); dm.aprv_slip_seq =
		 * (String)hash.get("aprv_slip_seq"); dm.aprv_slip_sub_seq =
		 * (String)hash.get("aprv_slip_sub_seq"); dm.incmg_emp_no =
		 * (String)hash.get("incmg_emp_no"); dm.chg_pers =
		 * (String)hash.get("chg_pers"); dm.incmg_pers_ipadd =
		 * (String)hash.get("incmg_pers_ipadd");
		 *******************************************************************************************/

		/*******************************************************************************************
		 * dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		 * dm.aprv_slip_occr_dt =
		 * Util.getSessionParameterValue(req,"aprv_slip_occr_dt",true);
		 * dm.aprv_slip_clsf_cd =
		 * Util.getSessionParameterValue(req,"aprv_slip_clsf_cd",true);
		 * dm.aprv_slip_seq =
		 * Util.getSessionParameterValue(req,"aprv_slip_seq",true);
		 * dm.aprv_slip_sub_seq =
		 * Util.getSessionParameterValue(req,"aprv_slip_sub_seq",true);
		 * dm.incmg_emp_no =
		 * Util.getSessionParameterValue(req,"incmg_emp_no",true); dm.chg_pers =
		 * Util.getSessionParameterValue(req,"chg_pers",true);
		 * dm.incmg_pers_ipadd =
		 * Util.getSessionParameterValue(req,"incmg_pers_ipadd",true);
		 *******************************************************************************************/
	}

	public void fc_acct_2931_l(HttpServletRequest req, HttpServletResponse res)
			throws AppException, SQLException {
		FC_ACCT_2931_LDataSet ds = null;
		FC_ACCT_2931_LDM dm = new FC_ACCT_2931_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.from_dt = Util.checkString(req.getParameter("from_dt"));
		dm.to_dt = Util.checkString(req.getParameter("to_dt"));
		dm.dt_clsf = Util.checkString(req.getParameter("dt_clsf"));
		dm.jbjp_clsf = Util.checkString(req.getParameter("jbjp_clsf"));

		dm.print();

		/* EJB 수정후 시작 */
		ds = dao.fc_acct_2931_l(dm);

		if (!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/*
		 * EJB 수정전 시작 try { FC_ACCT_2000EJBHome home =
		 * (FC_ACCT_2000EJBHome)JNDIManager
		 * .getInstance().getHome("FC_ACCT_2000EJB"); FC_ACCT_2000EJB ejb =
		 * home.create();
		 * 
		 * ds = ejb.fc_acct_2931_l(dm); req.setAttribute("ds", ds); } catch
		 * (CreateException e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } catch (RemoteException
		 * e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } EJB 수정전 끝
		 */

		/*******************************************************************************************
		 * String multiUpdateData =
		 * Util.checkString(req.getParameter("multiUpdateData")); Hashtable hash
		 * = getHashMultiUpdateData(multiUpdateData);
		 * 
		 * dm.cmpy_cd = (String)hash.get("cmpy_cd"); dm.from_dt =
		 * (String)hash.get("from_dt"); dm.to_dt = (String)hash.get("to_dt");
		 *******************************************************************************************/

		/*******************************************************************************************
		 * dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		 * dm.from_dt = Util.getSessionParameterValue(req,"from_dt",true);
		 * dm.to_dt = Util.getSessionParameterValue(req,"to_dt",true);
		 *******************************************************************************************/
	}

	public void fc_acct_2932_l(HttpServletRequest req, HttpServletResponse res)
			throws AppException, SQLException {
		FC_ACCT_2932_LDataSet ds = null;
		FC_ACCT_2932_LDM dm = new FC_ACCT_2932_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.rmtt_dwload_dt = Util
				.checkString(req.getParameter("rmtt_dwload_dt"));

		dm.print();

		/* EJB 수정후 시작 */
		ds = dao.fc_acct_2932_l(dm);

		if (!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/*
		 * EJB 수정전 시작 try { FC_ACCT_2000EJBHome home =
		 * (FC_ACCT_2000EJBHome)JNDIManager
		 * .getInstance().getHome("FC_ACCT_2000EJB"); FC_ACCT_2000EJB ejb =
		 * home.create();
		 * 
		 * ds = ejb.fc_acct_2932_l(dm); req.setAttribute("ds", ds); } catch
		 * (CreateException e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } catch (RemoteException
		 * e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } EJB 수정전 끝
		 */

		/*******************************************************************************************
		 * String multiUpdateData =
		 * Util.checkString(req.getParameter("multiUpdateData")); Hashtable hash
		 * = getHashMultiUpdateData(multiUpdateData);
		 * 
		 * dm.cmpy_cd = (String)hash.get("cmpy_cd"); dm.rmtt_dwload_dt =
		 * (String)hash.get("rmtt_dwload_dt");
		 *******************************************************************************************/

		/*******************************************************************************************
		 * dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		 * dm.rmtt_dwload_dt =
		 * Util.getSessionParameterValue(req,"rmtt_dwload_dt",true);
		 *******************************************************************************************/
	}

	public void fc_acct_2933_l(HttpServletRequest req, HttpServletResponse res)
			throws AppException, SQLException {
		FC_ACCT_2933_LDataSet ds = null;
		FC_ACCT_2933_LDM dm = new FC_ACCT_2933_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.aprv_slip_occr_dt = Util.checkString(req
				.getParameter("aprv_slip_occr_dt"));
		dm.aprv_slip_clsf = Util
				.checkString(req.getParameter("aprv_slip_clsf"));
		dm.aprv_slip_occr_seqo = Util.checkString(req
				.getParameter("aprv_slip_occr_seqo"));
		dm.aprv_slip_occr_sub_seq = Util.checkString(req
				.getParameter("aprv_slip_occr_sub_seq"));
		dm.budg_cd = Util.checkString(req.getParameter("budg_cd"));
		dm.dt_clsf = Util.checkString(req.getParameter("dt_clsf"));
		dm.print();

		/* EJB 수정후 시작 */
		ds = dao.fc_acct_2933_l(dm);

		if (!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/*
		 * EJB 수정전 시작 try { FC_ACCT_2000EJBHome home =
		 * (FC_ACCT_2000EJBHome)JNDIManager
		 * .getInstance().getHome("FC_ACCT_2000EJB"); FC_ACCT_2000EJB ejb =
		 * home.create();
		 * 
		 * ds = ejb.fc_acct_2933_l(dm); req.setAttribute("ds", ds); } catch
		 * (CreateException e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } catch (RemoteException
		 * e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } EJB 수정전 끝
		 */

		/*******************************************************************************************
		 * String multiUpdateData =
		 * Util.checkString(req.getParameter("multiUpdateData")); Hashtable hash
		 * = getHashMultiUpdateData(multiUpdateData);
		 * 
		 * dm.cmpy_cd = (String)hash.get("cmpy_cd"); dm.aprv_slip_occr_dt =
		 * (String)hash.get("aprv_slip_occr_dt"); dm.aprv_slip_clsf =
		 * (String)hash.get("aprv_slip_clsf"); dm.aprv_slip_occr_seqo =
		 * (String)hash.get("aprv_slip_occr_seqo"); dm.aprv_slip_occr_sub_seq =
		 * (String)hash.get("aprv_slip_occr_sub_seq"); dm.budg_cd =
		 * (String)hash.get("budg_cd");
		 *******************************************************************************************/

		/*******************************************************************************************
		 * dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		 * dm.aprv_slip_occr_dt =
		 * Util.getSessionParameterValue(req,"aprv_slip_occr_dt",true);
		 * dm.aprv_slip_clsf =
		 * Util.getSessionParameterValue(req,"aprv_slip_clsf",true);
		 * dm.aprv_slip_occr_seqo =
		 * Util.getSessionParameterValue(req,"aprv_slip_occr_seqo",true);
		 * dm.aprv_slip_occr_sub_seq =
		 * Util.getSessionParameterValue(req,"aprv_slip_occr_sub_seq",true);
		 * dm.budg_cd = Util.getSessionParameterValue(req,"budg_cd",true);
		 *******************************************************************************************/
	}

	public void fc_acct_2934_i(HttpServletRequest req, HttpServletResponse res)
			throws AppException, SQLException {
		FC_ACCT_2934_IDataSet ds = null;
		FC_ACCT_2934_IDM dm = new FC_ACCT_2934_IDM();

		String multiUpdateData = Util.checkString(req
				.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.aprv_slip_occr_dt = (String) hash.get("aprv_slip_occr_dt");
		dm.aprv_slip_clsf = (String) hash.get("aprv_slip_clsf");
		dm.aprv_slip_occr_seqo = (String) hash.get("aprv_slip_occr_seqo");
		dm.aprv_slip_occr_sub_seq = (String) hash.get("aprv_slip_occr_sub_seq");
		dm.budg_cd = (String) hash.get("budg_cd");
		dm.dt_clsf = (String) hash.get("dt_clsf");
		dm.rmtt_dwload_dt = Util
				.checkString(req.getParameter("rmtt_dwload_dt"));
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.incmg_pers_ipadd = req.getRemoteAddr();

		dm.print();

		/* EJB 수정후 시작 */
		ds = dao.fc_acct_2934_i(dm);

		if (!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/*
		 * EJB 수정전 시작 try { FC_ACCT_2000EJBHome home =
		 * (FC_ACCT_2000EJBHome)JNDIManager
		 * .getInstance().getHome("FC_ACCT_2000EJB"); FC_ACCT_2000EJB ejb =
		 * home.create();
		 * 
		 * ds = ejb.fc_acct_2934_i(dm); req.setAttribute("ds", ds); } catch
		 * (CreateException e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } catch (RemoteException
		 * e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } EJB 수정전 끝
		 */

		/*******************************************************************************************
		 * String multiUpdateData =
		 * Util.checkString(req.getParameter("multiUpdateData")); Hashtable hash
		 * = getHashMultiUpdateData(multiUpdateData);
		 * 
		 * dm.cmpy_cd = (String)hash.get("cmpy_cd"); dm.aprv_slip_occr_dt =
		 * (String)hash.get("aprv_slip_occr_dt"); dm.aprv_slip_clsf =
		 * (String)hash.get("aprv_slip_clsf"); dm.aprv_slip_occr_seqo =
		 * (String)hash.get("aprv_slip_occr_seqo"); dm.aprv_slip_occr_sub_seq =
		 * (String)hash.get("aprv_slip_occr_sub_seq"); dm.budg_cd =
		 * (String)hash.get("budg_cd"); dm.rmtt_dwload_dt =
		 * (String)hash.get("rmtt_dwload_dt"); dm.incmg_pers =
		 * (String)hash.get("incmg_pers"); dm.incmg_pers_ipadd =
		 * (String)hash.get("incmg_pers_ipadd");
		 *******************************************************************************************/

		/*******************************************************************************************
		 * dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		 * dm.aprv_slip_occr_dt =
		 * Util.getSessionParameterValue(req,"aprv_slip_occr_dt",true);
		 * dm.aprv_slip_clsf =
		 * Util.getSessionParameterValue(req,"aprv_slip_clsf",true);
		 * dm.aprv_slip_occr_seqo =
		 * Util.getSessionParameterValue(req,"aprv_slip_occr_seqo",true);
		 * dm.aprv_slip_occr_sub_seq =
		 * Util.getSessionParameterValue(req,"aprv_slip_occr_sub_seq",true);
		 * dm.budg_cd = Util.getSessionParameterValue(req,"budg_cd",true);
		 * dm.rmtt_dwload_dt =
		 * Util.getSessionParameterValue(req,"rmtt_dwload_dt",true);
		 * dm.incmg_pers = Util.getSessionParameterValue(req,"incmg_pers",true);
		 * dm.incmg_pers_ipadd =
		 * Util.getSessionParameterValue(req,"incmg_pers_ipadd",true);
		 *******************************************************************************************/
	}

	public void fc_acct_2935_d(HttpServletRequest req, HttpServletResponse res)
			throws AppException, SQLException {
		FC_ACCT_2935_DDataSet ds = null;
		FC_ACCT_2935_DDM dm = new FC_ACCT_2935_DDM();

		String multiUpdateData = Util.checkString(req
				.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.aprv_slip_occr_dt = (String) hash.get("aprv_slip_occr_dt");
		dm.aprv_slip_clsf = (String) hash.get("aprv_slip_clsf");
		dm.aprv_slip_occr_seqo = (String) hash.get("aprv_slip_occr_seqo");
		dm.aprv_slip_occr_sub_seq = (String) hash.get("aprv_slip_occr_sub_seq");
		dm.budg_cd = (String) hash.get("budg_cd");
		dm.dt_clsf = (String) hash.get("dt_clsf");
		dm.rmtt_dwload_dt = Util
				.checkString(req.getParameter("rmtt_dwload_dt"));
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.incmg_pers_ipadd = req.getRemoteAddr();

		dm.print();

		/* EJB 수정후 시작 */
		ds = dao.fc_acct_2935_d(dm);

		if (!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/*
		 * EJB 수정전 시작 try { FC_ACCT_2000EJBHome home =
		 * (FC_ACCT_2000EJBHome)JNDIManager
		 * .getInstance().getHome("FC_ACCT_2000EJB"); FC_ACCT_2000EJB ejb =
		 * home.create();
		 * 
		 * ds = ejb.fc_acct_2935_d(dm); req.setAttribute("ds", ds); } catch
		 * (CreateException e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } catch (RemoteException
		 * e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } EJB 수정전 끝
		 */

		/*******************************************************************************************
		 * String multiUpdateData =
		 * Util.checkString(req.getParameter("multiUpdateData")); Hashtable hash
		 * = getHashMultiUpdateData(multiUpdateData);
		 * 
		 * dm.cmpy_cd = (String)hash.get("cmpy_cd"); dm.aprv_slip_occr_dt =
		 * (String)hash.get("aprv_slip_occr_dt"); dm.aprv_slip_clsf =
		 * (String)hash.get("aprv_slip_clsf"); dm.aprv_slip_occr_seqo =
		 * (String)hash.get("aprv_slip_occr_seqo"); dm.aprv_slip_occr_sub_seq =
		 * (String)hash.get("aprv_slip_occr_sub_seq"); dm.budg_cd =
		 * (String)hash.get("budg_cd"); dm.rmtt_dwload_dt =
		 * (String)hash.get("rmtt_dwload_dt"); dm.incmg_pers =
		 * (String)hash.get("incmg_pers"); dm.incmg_pers_ipadd =
		 * (String)hash.get("incmg_pers_ipadd");
		 *******************************************************************************************/

		/*******************************************************************************************
		 * dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		 * dm.aprv_slip_occr_dt =
		 * Util.getSessionParameterValue(req,"aprv_slip_occr_dt",true);
		 * dm.aprv_slip_clsf =
		 * Util.getSessionParameterValue(req,"aprv_slip_clsf",true);
		 * dm.aprv_slip_occr_seqo =
		 * Util.getSessionParameterValue(req,"aprv_slip_occr_seqo",true);
		 * dm.aprv_slip_occr_sub_seq =
		 * Util.getSessionParameterValue(req,"aprv_slip_occr_sub_seq",true);
		 * dm.budg_cd = Util.getSessionParameterValue(req,"budg_cd",true);
		 * dm.rmtt_dwload_dt =
		 * Util.getSessionParameterValue(req,"rmtt_dwload_dt",true);
		 * dm.incmg_pers = Util.getSessionParameterValue(req,"incmg_pers",true);
		 * dm.incmg_pers_ipadd =
		 * Util.getSessionParameterValue(req,"incmg_pers_ipadd",true);
		 *******************************************************************************************/
	}

	public void fc_acct_2970_m(HttpServletRequest req, HttpServletResponse res)
			throws AppException, SQLException {
		FC_ACCT_2970_MDataSet ds = null;
		FC_ACCT_2970_MDM dm = new FC_ACCT_2970_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);

		dm.print();

		/* EJB 수정후 시작 */
		ds = dao.fc_acct_2970_m(dm);

		if (!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/*
		 * EJB 수정전 시작 try { FC_ACCT_2000EJBHome home =
		 * (FC_ACCT_2000EJBHome)JNDIManager
		 * .getInstance().getHome("FC_ACCT_2000EJB"); FC_ACCT_2000EJB ejb =
		 * home.create();
		 * 
		 * ds = ejb.fc_acct_2970_m(dm); req.setAttribute("ds", ds); } catch
		 * (CreateException e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } catch (RemoteException
		 * e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } EJB 수정전 끝
		 */

		/*******************************************************************************************
		 * String multiUpdateData =
		 * Util.checkString(req.getParameter("multiUpdateData")); Hashtable hash
		 * = getHashMultiUpdateData(multiUpdateData);
		 * 
		 * dm.cmpy_cd = (String)hash.get("cmpy_cd");
		 *******************************************************************************************/

		/*******************************************************************************************
		 * dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		 *******************************************************************************************/
	}

	public void fc_acct_2971_l(HttpServletRequest req, HttpServletResponse res)
			throws AppException, SQLException {
		FC_ACCT_2971_LDataSet ds = null;
		FC_ACCT_2971_LDM dm = new FC_ACCT_2971_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.uid = Util.getSessionParameterValue(req, "uid", true);
		dm.dlco_cd = Util.checkString(req.getParameter("dlco_cd"));
		dm.clsf = Util.checkString(req.getParameter("clsf"));
		dm.frdt = Util.checkString(req.getParameter("frdt"));
		dm.todt = Util.checkString(req.getParameter("todt"));

		dm.print();

		/* EJB 수정후 시작 */
		ds = dao.fc_acct_2971_l(dm);

		if (!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/*
		 * EJB 수정전 시작 try { FC_ACCT_2000EJBHome home =
		 * (FC_ACCT_2000EJBHome)JNDIManager
		 * .getInstance().getHome("FC_ACCT_2000EJB"); FC_ACCT_2000EJB ejb =
		 * home.create();
		 * 
		 * ds = ejb.fc_acct_2971_l(dm); req.setAttribute("ds", ds); } catch
		 * (CreateException e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } catch (RemoteException
		 * e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } EJB 수정전 끝
		 */

		/*******************************************************************************************
		 * String multiUpdateData =
		 * Util.checkString(req.getParameter("multiUpdateData")); Hashtable hash
		 * = getHashMultiUpdateData(multiUpdateData);
		 * 
		 * dm.cmpy_cd = (String)hash.get("cmpy_cd"); dm.uid =
		 * (String)hash.get("uid"); dm.dlco_cd = (String)hash.get("dlco_cd");
		 * dm.clsf = (String)hash.get("clsf"); dm.frdt =
		 * (String)hash.get("frdt"); dm.todt = (String)hash.get("todt");
		 *******************************************************************************************/

		/*******************************************************************************************
		 * dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		 * dm.uid = Util.getSessionParameterValue(req,"uid",true); dm.dlco_cd =
		 * Util.getSessionParameterValue(req,"dlco_cd",true); dm.clsf =
		 * Util.getSessionParameterValue(req,"clsf",true); dm.frdt =
		 * Util.getSessionParameterValue(req,"frdt",true); dm.todt =
		 * Util.getSessionParameterValue(req,"todt",true);
		 *******************************************************************************************/
	}

	public void fc_acct_2300_m(HttpServletRequest req, HttpServletResponse res)
			throws AppException, SQLException {
		FC_ACCT_2300_MDataSet ds = null;
		FC_ACCT_2300_MDM dm = new FC_ACCT_2300_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);

		dm.print();

		/* EJB 수정후 시작 */
		ds = dao.fc_acct_2300_m(dm);

		if (!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/*
		 * EJB 수정전 시작 try { FC_ACCT_2000EJBHome home =
		 * (FC_ACCT_2000EJBHome)JNDIManager
		 * .getInstance().getHome("FC_ACCT_2000EJB"); FC_ACCT_2000EJB ejb =
		 * home.create();
		 * 
		 * ds = ejb.fc_acct_2300_m(dm); req.setAttribute("ds", ds); } catch
		 * (CreateException e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } catch (RemoteException
		 * e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } EJB 수정전 끝
		 */

		/*******************************************************************************************
		 * String multiUpdateData =
		 * Util.checkString(req.getParameter("multiUpdateData")); Hashtable hash
		 * = getHashMultiUpdateData(multiUpdateData);
		 * 
		 * dm.cmpy_cd = (String)hash.get("cmpy_cd");
		 *******************************************************************************************/

		/*******************************************************************************************
		 * dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		 *******************************************************************************************/
	}

	public void fc_acct_2301_l(HttpServletRequest req, HttpServletResponse res)
			throws AppException, SQLException {
		FC_ACCT_2301_LDataSet ds = null;
		FC_ACCT_2301_LDM dm = new FC_ACCT_2301_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.vexc_cmpy_cd = Util.checkString(req.getParameter("vexc_cmpy_cd"));
		dm.pay_dt = Util.checkString(req.getParameter("pay_dt"));
		dm.occr_slip_occr_dt = Util.checkString(req
				.getParameter("occr_slip_occr_dt"));
		dm.mode = Util.checkString(req.getParameter("mode"));

		dm.print();

		/* EJB 수정후 시작 */
		ds = dao.fc_acct_2301_l(dm);

		if (!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/*
		 * EJB 수정전 시작 try { FC_ACCT_2000EJBHome home =
		 * (FC_ACCT_2000EJBHome)JNDIManager
		 * .getInstance().getHome("FC_ACCT_2000EJB"); FC_ACCT_2000EJB ejb =
		 * home.create();
		 * 
		 * ds = ejb.fc_acct_2301_l(dm); req.setAttribute("ds", ds); } catch
		 * (CreateException e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } catch (RemoteException
		 * e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } EJB 수정전 끝
		 */

		/*******************************************************************************************
		 * String multiUpdateData =
		 * Util.checkString(req.getParameter("multiUpdateData")); Hashtable hash
		 * = getHashMultiUpdateData(multiUpdateData);
		 * 
		 * dm.cmpy_cd = (String)hash.get("cmpy_cd"); dm.vexc_cmpy_cd =
		 * (String)hash.get("vexc_cmpy_cd"); dm.pay_dt =
		 * (String)hash.get("pay_dt"); dm.occr_slip_occr_dt =
		 * (String)hash.get("occr_slip_occr_dt"); dm.mode =
		 * (String)hash.get("mode");
		 *******************************************************************************************/

		/*******************************************************************************************
		 * dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		 * dm.vexc_cmpy_cd =
		 * Util.getSessionParameterValue(req,"vexc_cmpy_cd",true); dm.pay_dt =
		 * Util.getSessionParameterValue(req,"pay_dt",true);
		 * dm.occr_slip_occr_dt =
		 * Util.getSessionParameterValue(req,"occr_slip_occr_dt",true); dm.mode
		 * = Util.getSessionParameterValue(req,"mode",true);
		 *******************************************************************************************/
	}

	public void fc_acct_2303_i(HttpServletRequest req, HttpServletResponse res)
			throws AppException, SQLException {
		FC_ACCT_2303_IDataSet ds = null;
		FC_ACCT_2303_IDM dm = new FC_ACCT_2303_IDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.vexc_cmpy_cd = Util.checkString(req.getParameter("vexc_cmpy_cd"));
		dm.pch_compnm = Util.checkString(req.getParameter("pch_compnm"));
		dm.in_slip_occr_dt = Util.checkString(req
				.getParameter("in_slip_occr_dt"));
		dm.in_slip_clsf_cd = Util.checkString(req
				.getParameter("in_slip_clsf_cd"));
		dm.incmg_emp_no = Util.checkString(req.getParameter("incmg_emp_no"));
		dm.fisc_dt = Util.checkString(req.getParameter("fisc_dt"));
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		dm.budg_cd = Util.checkString(req.getParameter("budg_cd"));

		String multiUpdateData = Util.checkString(req
				.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.rmks1 = (String) hash.get("pch_mcnm");
		dm.prof_type_cd = (String) hash.get("prof_type_cd");
		dm.slip_clsf_cd = (String) hash.get("slip_clsf_cd");
		dm.slip_occr_dt = (String) hash.get("slip_occr_dt");
		dm.slip_seq = (String) hash.get("slip_seq");
		dm.medi_cd = (String) hash.get("medi_cd");

		dm.print();

		/* EJB 수정후 시작 */
		ds = dao.fc_acct_2303_i(dm);

		if (!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/*
		 * EJB 수정전 시작 try { FC_ACCT_2000EJBHome home =
		 * (FC_ACCT_2000EJBHome)JNDIManager
		 * .getInstance().getHome("FC_ACCT_2000EJB"); FC_ACCT_2000EJB ejb =
		 * home.create();
		 * 
		 * ds = ejb.fc_acct_2303_i(dm); req.setAttribute("ds", ds); } catch
		 * (CreateException e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } catch (RemoteException
		 * e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } EJB 수정전 끝
		 */

		/*******************************************************************************************
		 * String multiUpdateData =
		 * Util.checkString(req.getParameter("multiUpdateData")); Hashtable hash
		 * = getHashMultiUpdateData(multiUpdateData);
		 * 
		 * dm.cmpy_cd = (String)hash.get("cmpy_cd"); dm.vexc_cmpy_cd =
		 * (String)hash.get("vexc_cmpy_cd"); dm.pch_compnm =
		 * (String)hash.get("pch_compnm"); dm.in_slip_occr_dt =
		 * (String)hash.get("in_slip_occr_dt"); dm.in_slip_clsf_cd =
		 * (String)hash.get("in_slip_clsf_cd"); dm.incmg_emp_no =
		 * (String)hash.get("incmg_emp_no"); dm.fisc_dt =
		 * (String)hash.get("fisc_dt"); dm.rmks1 = (String)hash.get("rmks1");
		 * dm.incmg_pers = (String)hash.get("incmg_pers"); dm.incmg_pers_ipadd =
		 * (String)hash.get("incmg_pers_ipadd"); dm.budg_cd =
		 * (String)hash.get("budg_cd"); dm.prof_type_cd =
		 * (String)hash.get("prof_type_cd"); dm.slip_clsf_cd =
		 * (String)hash.get("slip_clsf_cd"); dm.slip_occr_dt =
		 * (String)hash.get("slip_occr_dt"); dm.slip_seq =
		 * (String)hash.get("slip_seq"); dm.medi_cd =
		 * (String)hash.get("medi_cd");
		 *******************************************************************************************/

		/*******************************************************************************************
		 * dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		 * dm.vexc_cmpy_cd =
		 * Util.getSessionParameterValue(req,"vexc_cmpy_cd",true); dm.pch_compnm
		 * = Util.getSessionParameterValue(req,"pch_compnm",true);
		 * dm.in_slip_occr_dt =
		 * Util.getSessionParameterValue(req,"in_slip_occr_dt",true);
		 * dm.in_slip_clsf_cd =
		 * Util.getSessionParameterValue(req,"in_slip_clsf_cd",true);
		 * dm.incmg_emp_no =
		 * Util.getSessionParameterValue(req,"incmg_emp_no",true); dm.fisc_dt =
		 * Util.getSessionParameterValue(req,"fisc_dt",true); dm.rmks1 =
		 * Util.getSessionParameterValue(req,"rmks1",true); dm.incmg_pers =
		 * Util.getSessionParameterValue(req,"incmg_pers",true);
		 * dm.incmg_pers_ipadd =
		 * Util.getSessionParameterValue(req,"incmg_pers_ipadd",true);
		 * dm.budg_cd = Util.getSessionParameterValue(req,"budg_cd",true);
		 * dm.prof_type_cd =
		 * Util.getSessionParameterValue(req,"prof_type_cd",true);
		 * dm.slip_clsf_cd =
		 * Util.getSessionParameterValue(req,"slip_clsf_cd",true);
		 * dm.slip_occr_dt =
		 * Util.getSessionParameterValue(req,"slip_occr_dt",true); dm.slip_seq =
		 * Util.getSessionParameterValue(req,"slip_seq",true); dm.medi_cd =
		 * Util.getSessionParameterValue(req,"medi_cd",true);
		 *******************************************************************************************/
	}

	public void fc_acct_2304_d(HttpServletRequest req, HttpServletResponse res)
			throws AppException, SQLException {
		FC_ACCT_2304_DDataSet ds = null;
		FC_ACCT_2304_DDM dm = new FC_ACCT_2304_DDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.inrow = Util.checkString(req.getParameter("inrow"));
		dm.vexc_cmpy_cd = Util.checkString(req.getParameter("vexc_cmpy_cd"));
		dm.in_slip_occr_dt = Util.checkString(req
				.getParameter("in_slip_occr_dt"));
		dm.in_slip_clsf_cd = Util.checkString(req
				.getParameter("in_slip_clsf_cd"));
		dm.in_slip_seq = Util.checkString(req.getParameter("in_slip_seq"));
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		dm.pch_amt = Util.checkString(req.getParameter("pch_amt"));

		String multiUpdateData = Util.checkString(req
				.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.prof_type_cd = (String) hash.get("prof_type_cd");
		dm.slip_clsf_cd = (String) hash.get("slip_clsf_cd");
		dm.slip_occr_dt = (String) hash.get("slip_occr_dt");
		dm.slip_seq = (String) hash.get("slip_seq");

		dm.print();

		/* EJB 수정후 시작 */
		ds = dao.fc_acct_2304_d(dm);

		if (!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/*
		 * EJB 수정전 시작 try { FC_ACCT_2000EJBHome home =
		 * (FC_ACCT_2000EJBHome)JNDIManager
		 * .getInstance().getHome("FC_ACCT_2000EJB"); FC_ACCT_2000EJB ejb =
		 * home.create();
		 * 
		 * ds = ejb.fc_acct_2304_d(dm); req.setAttribute("ds", ds); } catch
		 * (CreateException e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } catch (RemoteException
		 * e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } EJB 수정전 끝
		 */

		/*******************************************************************************************
		 * String multiUpdateData =
		 * Util.checkString(req.getParameter("multiUpdateData")); Hashtable hash
		 * = getHashMultiUpdateData(multiUpdateData);
		 * 
		 * dm.cmpy_cd = (String)hash.get("cmpy_cd"); dm.inrow =
		 * (String)hash.get("inrow"); dm.vexc_cmpy_cd =
		 * (String)hash.get("vexc_cmpy_cd"); dm.in_slip_occr_dt =
		 * (String)hash.get("in_slip_occr_dt"); dm.in_slip_clsf_cd =
		 * (String)hash.get("in_slip_clsf_cd"); dm.in_slip_seq =
		 * (String)hash.get("in_slip_seq"); dm.incmg_pers =
		 * (String)hash.get("incmg_pers"); dm.incmg_pers_ipadd =
		 * (String)hash.get("incmg_pers_ipadd"); dm.pch_amt =
		 * (String)hash.get("pch_amt"); dm.prof_type_cd =
		 * (String)hash.get("prof_type_cd"); dm.slip_clsf_cd =
		 * (String)hash.get("slip_clsf_cd"); dm.slip_occr_dt =
		 * (String)hash.get("slip_occr_dt"); dm.slip_seq =
		 * (String)hash.get("slip_seq");
		 *******************************************************************************************/

		/*******************************************************************************************
		 * dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		 * dm.inrow = Util.getSessionParameterValue(req,"inrow",true);
		 * dm.vexc_cmpy_cd =
		 * Util.getSessionParameterValue(req,"vexc_cmpy_cd",true);
		 * dm.in_slip_occr_dt =
		 * Util.getSessionParameterValue(req,"in_slip_occr_dt",true);
		 * dm.in_slip_clsf_cd =
		 * Util.getSessionParameterValue(req,"in_slip_clsf_cd",true);
		 * dm.in_slip_seq =
		 * Util.getSessionParameterValue(req,"in_slip_seq",true); dm.incmg_pers
		 * = Util.getSessionParameterValue(req,"incmg_pers",true);
		 * dm.incmg_pers_ipadd =
		 * Util.getSessionParameterValue(req,"incmg_pers_ipadd",true);
		 * dm.pch_amt = Util.getSessionParameterValue(req,"pch_amt",true);
		 * dm.prof_type_cd =
		 * Util.getSessionParameterValue(req,"prof_type_cd",true);
		 * dm.slip_clsf_cd =
		 * Util.getSessionParameterValue(req,"slip_clsf_cd",true);
		 * dm.slip_occr_dt =
		 * Util.getSessionParameterValue(req,"slip_occr_dt",true); dm.slip_seq =
		 * Util.getSessionParameterValue(req,"slip_seq",true);
		 *******************************************************************************************/
	}

	public void fc_acct_2305_l(HttpServletRequest req, HttpServletResponse res)
			throws AppException, SQLException {
		FC_ACCT_2305_LDataSet ds = null;
		FC_ACCT_2305_LDM dm = new FC_ACCT_2305_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.dlco_abrv_nm = Util.checkString(req.getParameter("dlco_abrv_nm"));

		dm.print();

		/* EJB 수정후 시작 */
		ds = dao.fc_acct_2305_l(dm);

		if (!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/*
		 * EJB 수정전 시작 try { FC_ACCT_2000EJBHome home =
		 * (FC_ACCT_2000EJBHome)JNDIManager
		 * .getInstance().getHome("FC_ACCT_2000EJB"); FC_ACCT_2000EJB ejb =
		 * home.create();
		 * 
		 * ds = ejb.fc_acct_2305_l(dm); req.setAttribute("ds", ds); } catch
		 * (CreateException e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } catch (RemoteException
		 * e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } EJB 수정전 끝
		 */

		/*******************************************************************************************
		 * String multiUpdateData =
		 * Util.checkString(req.getParameter("multiUpdateData")); Hashtable hash
		 * = getHashMultiUpdateData(multiUpdateData);
		 * 
		 * dm.cmpy_cd = (String)hash.get("cmpy_cd"); dm.dlco_abrv_nm =
		 * (String)hash.get("dlco_abrv_nm");
		 *******************************************************************************************/

		/*******************************************************************************************
		 * dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		 * dm.dlco_abrv_nm =
		 * Util.getSessionParameterValue(req,"dlco_abrv_nm",true);
		 *******************************************************************************************/
	}

	public void fc_acct_2151_l(HttpServletRequest req, HttpServletResponse res)
			throws AppException, SQLException {
		FC_ACCT_2151_LDataSet ds = null;
		FC_ACCT_2151_LDM dm = new FC_ACCT_2151_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.budg_cd = Util.checkString(req.getParameter("budg_cd"));
		dm.ask_dept_cd = Util.checkString(req.getParameter("ask_dept_cd"));
		dm.slip_occr_dt = Util.checkString(req.getParameter("slip_occr_dt"));

		dm.print();

		/* EJB 수정후 시작 */
		ds = dao.fc_acct_2151_l(dm);

		if (!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/*
		 * EJB 수정전 시작 try { FC_ACCT_2000EJBHome home =
		 * (FC_ACCT_2000EJBHome)JNDIManager
		 * .getInstance().getHome("FC_ACCT_2000EJB"); FC_ACCT_2000EJB ejb =
		 * home.create();
		 * 
		 * ds = ejb.fc_acct_2151_l(dm); req.setAttribute("ds", ds); } catch
		 * (CreateException e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } catch (RemoteException
		 * e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } EJB 수정전 끝
		 */

		/*******************************************************************************************
		 * String multiUpdateData =
		 * Util.checkString(req.getParameter("multiUpdateData")); Hashtable hash
		 * = getHashMultiUpdateData(multiUpdateData);
		 * 
		 * dm.cmpy_cd = (String)hash.get("cmpy_cd"); dm.budg_cd =
		 * (String)hash.get("budg_cd"); dm.ask_dept_cd =
		 * (String)hash.get("ask_dept_cd"); dm.slip_occr_dt =
		 * (String)hash.get("slip_occr_dt");
		 *******************************************************************************************/

		/*******************************************************************************************
		 * dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		 * dm.budg_cd = Util.getSessionParameterValue(req,"budg_cd",true);
		 * dm.ask_dept_cd =
		 * Util.getSessionParameterValue(req,"ask_dept_cd",true);
		 * dm.slip_occr_dt =
		 * Util.getSessionParameterValue(req,"slip_occr_dt",true);
		 *******************************************************************************************/
	}

	public void fc_acct_2152_i(HttpServletRequest req, HttpServletResponse res)
			throws AppException, SQLException {
		FC_ACCT_2152_IDataSet ds = null;
		FC_ACCT_2152_IDM dm = new FC_ACCT_2152_IDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.budg_cd = Util.checkString(req.getParameter("budg_cd"));
		dm.ask_emp_no = Util.checkString(req.getParameter("ask_emp_no"));
		dm.ask_dept_cd = Util.checkString(req.getParameter("ask_dept_cd"));
		dm.slip_rcpm_dt = Util.checkString(req.getParameter("slip_rcpm_dt"));
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.jdw_fg = Util.checkString(req.getParameter("jdw_fg"));
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		dm.pch_buseocd = Util.checkString(req.getParameter("pch_buseocd"));
		dm.rmks = Util.checkString(req.getParameter("rmks"));

		String multiUpdateData = Util.checkString(req
				.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.slip_clsf_cd = (String) hash.get("slip_clsf_cd");
		dm.slip_occr_dt = (String) hash.get("slip_occr_dt");
		dm.slip_seq = (String) hash.get("slip_seq");
		dm.budg_cd2 = (String) hash.get("budg_cd2");
		dm.rcpm_amt = (String) hash.get("rcpm_amt");

		dm.print();

		/* EJB 수정후 시작 */
		ds = dao.fc_acct_2152_i(dm);

		if (!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/*
		 * EJB 수정전 시작 try { FC_ACCT_2000EJBHome home =
		 * (FC_ACCT_2000EJBHome)JNDIManager
		 * .getInstance().getHome("FC_ACCT_2000EJB"); FC_ACCT_2000EJB ejb =
		 * home.create();
		 * 
		 * ds = ejb.fc_acct_2152_i(dm); req.setAttribute("ds", ds); } catch
		 * (CreateException e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } catch (RemoteException
		 * e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } EJB 수정전 끝
		 */

		/*******************************************************************************************
		 * String multiUpdateData =
		 * Util.checkString(req.getParameter("multiUpdateData")); Hashtable hash
		 * = getHashMultiUpdateData(multiUpdateData);
		 * 
		 * dm.cmpy_cd = (String)hash.get("cmpy_cd"); dm.slip_clsf_cd =
		 * (String)hash.get("slip_clsf_cd"); dm.slip_occr_dt =
		 * (String)hash.get("slip_occr_dt"); dm.slip_seq =
		 * (String)hash.get("slip_seq"); dm.budg_cd =
		 * (String)hash.get("budg_cd"); dm.ask_emp_no =
		 * (String)hash.get("ask_emp_no"); dm.ask_dept_cd =
		 * (String)hash.get("ask_dept_cd"); dm.slip_rcpm_dt =
		 * (String)hash.get("slip_rcpm_dt"); dm.budg_cd2 =
		 * (String)hash.get("budg_cd2"); dm.rcpm_amt =
		 * (String)hash.get("rcpm_amt"); dm.incmg_pers =
		 * (String)hash.get("incmg_pers"); dm.jdw_fg =
		 * (String)hash.get("jdw_fg"); dm.incmg_pers_ipadd =
		 * (String)hash.get("incmg_pers_ipadd"); dm.pch_buseocd =
		 * (String)hash.get("pch_buseocd"); dm.rmks = (String)hash.get("rmks");
		 *******************************************************************************************/

		/*******************************************************************************************
		 * dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		 * dm.slip_clsf_cd =
		 * Util.getSessionParameterValue(req,"slip_clsf_cd",true);
		 * dm.slip_occr_dt =
		 * Util.getSessionParameterValue(req,"slip_occr_dt",true); dm.slip_seq =
		 * Util.getSessionParameterValue(req,"slip_seq",true); dm.budg_cd =
		 * Util.getSessionParameterValue(req,"budg_cd",true); dm.ask_emp_no =
		 * Util.getSessionParameterValue(req,"ask_emp_no",true); dm.ask_dept_cd
		 * = Util.getSessionParameterValue(req,"ask_dept_cd",true);
		 * dm.slip_rcpm_dt =
		 * Util.getSessionParameterValue(req,"slip_rcpm_dt",true); dm.budg_cd2 =
		 * Util.getSessionParameterValue(req,"budg_cd2",true); dm.rcpm_amt =
		 * Util.getSessionParameterValue(req,"rcpm_amt",true); dm.incmg_pers =
		 * Util.getSessionParameterValue(req,"incmg_pers",true); dm.jdw_fg =
		 * Util.getSessionParameterValue(req,"jdw_fg",true); dm.incmg_pers_ipadd
		 * = Util.getSessionParameterValue(req,"incmg_pers_ipadd",true);
		 * dm.pch_buseocd =
		 * Util.getSessionParameterValue(req,"pch_buseocd",true); dm.rmks =
		 * Util.getSessionParameterValue(req,"rmks",true);
		 *******************************************************************************************/
	}

	public void fc_acct_2153_d(HttpServletRequest req, HttpServletResponse res)
			throws AppException, SQLException {
		FC_ACCT_2153_DDataSet ds = null;
		FC_ACCT_2153_DDM dm = new FC_ACCT_2153_DDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.rcpm_slip_occr_dt = Util.checkString(req
				.getParameter("rcpm_slip_occr_dt"));
		dm.rcpm_slip_clsf_cd = Util.checkString(req
				.getParameter("rcpm_slip_clsf_cd"));
		dm.rcpm_slip_seq = Util.checkString(req.getParameter("rcpm_slip_seq"));
		dm.rcpm_slip_sub_seq = Util.checkString(req
				.getParameter("rcpm_slip_sub_seq"));
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.incmg_pers_ipadd = req.getRemoteAddr();

		dm.print();

		/* EJB 수정후 시작 */
		ds = dao.fc_acct_2153_d(dm);

		if (!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/*
		 * EJB 수정전 시작 try { FC_ACCT_2000EJBHome home =
		 * (FC_ACCT_2000EJBHome)JNDIManager
		 * .getInstance().getHome("FC_ACCT_2000EJB"); FC_ACCT_2000EJB ejb =
		 * home.create();
		 * 
		 * ds = ejb.fc_acct_2153_d(dm); req.setAttribute("ds", ds); } catch
		 * (CreateException e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } catch (RemoteException
		 * e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } EJB 수정전 끝
		 */

		/*******************************************************************************************
		 * String multiUpdateData =
		 * Util.checkString(req.getParameter("multiUpdateData")); Hashtable hash
		 * = getHashMultiUpdateData(multiUpdateData);
		 * 
		 * dm.cmpy_cd = (String)hash.get("cmpy_cd"); dm.rcpm_slip_occr_dt =
		 * (String)hash.get("rcpm_slip_occr_dt"); dm.rcpm_slip_clsf_cd =
		 * (String)hash.get("rcpm_slip_clsf_cd"); dm.rcpm_slip_seq =
		 * (String)hash.get("rcpm_slip_seq"); dm.rcpm_slip_sub_seq =
		 * (String)hash.get("rcpm_slip_sub_seq"); dm.incmg_pers =
		 * (String)hash.get("incmg_pers"); dm.incmg_pers_ipadd =
		 * (String)hash.get("incmg_pers_ipadd");
		 *******************************************************************************************/

		/*******************************************************************************************
		 * dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		 * dm.rcpm_slip_occr_dt =
		 * Util.getSessionParameterValue(req,"rcpm_slip_occr_dt",true);
		 * dm.rcpm_slip_clsf_cd =
		 * Util.getSessionParameterValue(req,"rcpm_slip_clsf_cd",true);
		 * dm.rcpm_slip_seq =
		 * Util.getSessionParameterValue(req,"rcpm_slip_seq",true);
		 * dm.rcpm_slip_sub_seq =
		 * Util.getSessionParameterValue(req,"rcpm_slip_sub_seq",true);
		 * dm.incmg_pers = Util.getSessionParameterValue(req,"incmg_pers",true);
		 * dm.incmg_pers_ipadd =
		 * Util.getSessionParameterValue(req,"incmg_pers_ipadd",true);
		 *******************************************************************************************/
	}

	public void fc_acct_2910_m(HttpServletRequest req, HttpServletResponse res)
			throws AppException, SQLException {
		FC_ACCT_2910_MDataSet ds = null;
		FC_ACCT_2910_MDM dm = new FC_ACCT_2910_MDM();

		// dm.cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);

		/* EJB 수정후 시작 */
		ds = dao.fc_acct_2910_m(dm);

		if (!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/*
		 * EJB 수정전 시작 try { FC_ACCT_2000EJBHome home =
		 * (FC_ACCT_2000EJBHome)JNDIManager
		 * .getInstance().getHome("FC_ACCT_2000EJB"); FC_ACCT_2000EJB ejb =
		 * home.create();
		 * 
		 * ds = ejb.fc_acct_2910_m(dm); req.setAttribute("ds", ds); } catch
		 * (CreateException e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } catch (RemoteException
		 * e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } EJB 수정전 끝
		 */

		/*******************************************************************************************
		 * String multiUpdateData =
		 * Util.checkString(req.getParameter("multiUpdateData")); Hashtable hash
		 * = getHashMultiUpdateData(multiUpdateData);
		 * 
		 * dm.cmpy_cd = (String)hash.get("cmpy_cd");
		 *******************************************************************************************/
	}

	public void fc_acct_2940_m(HttpServletRequest req, HttpServletResponse res)
			throws AppException, SQLException {
		FC_ACCT_2940_MDataSet ds = null;
		FC_ACCT_2940_MDM dm = new FC_ACCT_2940_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);

		/* EJB 수정후 시작 */
		ds = dao.fc_acct_2940_m(dm);

		if (!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/*
		 * EJB 수정전 시작 try { FC_ACCT_2000EJBHome home =
		 * (FC_ACCT_2000EJBHome)JNDIManager
		 * .getInstance().getHome("FC_ACCT_2000EJB"); FC_ACCT_2000EJB ejb =
		 * home.create();
		 * 
		 * ds = ejb.fc_acct_2940_m(dm); req.setAttribute("ds", ds); } catch
		 * (CreateException e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } catch (RemoteException
		 * e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } EJB 수정전 끝
		 */

		/*******************************************************************************************
		 * String multiUpdateData =
		 * Util.checkString(req.getParameter("multiUpdateData")); Hashtable hash
		 * = getHashMultiUpdateData(multiUpdateData);
		 * 
		 * dm.cmpy_cd = (String)hash.get("cmpy_cd");
		 *******************************************************************************************/
	}

	public void fc_acct_2942_s(HttpServletRequest req, HttpServletResponse res)
			throws AppException, SQLException {
		FC_ACCT_2942_SDataSet ds = null;
		FC_ACCT_2942_SDM dm = new FC_ACCT_2942_SDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.aprv_slip_occr_dt = Util.checkString(req
				.getParameter("slip_occr_dt"));
		dm.aprv_slip_clsf = Util.checkString(req.getParameter("slip_clsf_cd"));
		dm.aprv_slip_occr_seqo = Util.checkString(req
				.getParameter("slip_occr_seqo"));
		dm.aprv_slip_occr_sub_seq = Util.checkString(req
				.getParameter("slip_occr_sub_seq"));

		dm.print();

		/* EJB 수정후 시작 */
		ds = dao.fc_acct_2942_s(dm);

		if (!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/*
		 * EJB 수정전 시작 try { FC_ACCT_2000EJBHome home =
		 * (FC_ACCT_2000EJBHome)JNDIManager
		 * .getInstance().getHome("FC_ACCT_2000EJB"); FC_ACCT_2000EJB ejb =
		 * home.create();
		 * 
		 * ds = ejb.fc_acct_2942_s(dm); req.setAttribute("ds", ds); } catch
		 * (CreateException e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } catch (RemoteException
		 * e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } EJB 수정전 끝
		 */

		/*******************************************************************************************
		 * String multiUpdateData =
		 * Util.checkString(req.getParameter("multiUpdateData")); Hashtable hash
		 * = getHashMultiUpdateData(multiUpdateData);
		 * 
		 * dm.cmpy_cd = (String)hash.get("cmpy_cd"); dm.aprv_slip_occr_dt =
		 * (String)hash.get("aprv_slip_occr_dt"); dm.aprv_slip_clsf =
		 * (String)hash.get("aprv_slip_clsf"); dm.aprv_slip_occr_seqo =
		 * (String)hash.get("aprv_slip_occr_seqo"); dm.aprv_slip_occr_sub_seq =
		 * (String)hash.get("aprv_slip_occr_sub_seq");
		 *******************************************************************************************/

		/*******************************************************************************************
		 * dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		 * dm.aprv_slip_occr_dt =
		 * Util.getSessionParameterValue(req,"aprv_slip_occr_dt",true);
		 * dm.aprv_slip_clsf =
		 * Util.getSessionParameterValue(req,"aprv_slip_clsf",true);
		 * dm.aprv_slip_occr_seqo =
		 * Util.getSessionParameterValue(req,"aprv_slip_occr_seqo",true);
		 * dm.aprv_slip_occr_sub_seq =
		 * Util.getSessionParameterValue(req,"aprv_slip_occr_sub_seq",true);
		 *******************************************************************************************/
	}

	public void fc_acct_2950_l(HttpServletRequest req, HttpServletResponse res)
			throws AppException, SQLException {
		FC_ACCT_2950_LDataSet ds = null;
		FC_ACCT_2950_LDM dm = new FC_ACCT_2950_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.occr_slip_occr_dt = Util.checkString(req
				.getParameter("occr_slip_occr_dt"));
		dm.occr_slip_clsf_cd = Util.checkString(req
				.getParameter("occr_slip_clsf_cd"));
		dm.occr_slip_seq = Util.checkString(req.getParameter("occr_slip_seq"));
		dm.pay_dt_fr = Util.checkString(req.getParameter("pay_dt_fr"));
		dm.pay_dt_to = Util.checkString(req.getParameter("pay_dt_to"));

		/* EJB 수정후 시작 */
		ds = dao.fc_acct_2950_l(dm);

		if (!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/*
		 * EJB 수정전 시작 try { FC_ACCT_2000EJBHome home =
		 * (FC_ACCT_2000EJBHome)JNDIManager
		 * .getInstance().getHome("FC_ACCT_2000EJB"); FC_ACCT_2000EJB ejb =
		 * home.create();
		 * 
		 * ds = ejb.fc_acct_2950_l(dm); req.setAttribute("ds", ds); } catch
		 * (CreateException e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } catch (RemoteException
		 * e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } EJB 수정전 끝
		 */

		/*******************************************************************************************
		 * String multiUpdateData =
		 * Util.checkString(req.getParameter("multiUpdateData")); Hashtable hash
		 * = getHashMultiUpdateData(multiUpdateData);
		 * 
		 * dm.cmpy_cd = (String)hash.get("cmpy_cd"); dm.occr_slip_occr_dt =
		 * (String)hash.get("occr_slip_occr_dt"); dm.occr_slip_clsf_cd =
		 * (String)hash.get("occr_slip_clsf_cd"); dm.occr_slip_seq =
		 * (String)hash.get("occr_slip_seq"); dm.pay_dt_fr =
		 * (String)hash.get("pay_dt_fr"); dm.pay_dt_to =
		 * (String)hash.get("pay_dt_to");
		 *******************************************************************************************/
	}

	public void fc_acct_2951_u(HttpServletRequest req, HttpServletResponse res)
			throws AppException, SQLException {
		FC_ACCT_2951_UDataSet ds = null;
		FC_ACCT_2951_UDM dm = new FC_ACCT_2951_UDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_emp_no = Util.getSessionParameterValue(req, "emp_no", true);

		// dm.cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
		dm.slip_occr_dt_in = Util.checkString(req
				.getParameter("slip_occr_dt_in"));
		dm.slip_clsf_cd_in = Util.checkString(req
				.getParameter("slip_clsf_cd_in"));
		// dm.incmg_emp_no = Util.checkString(req.getParameter("incmg_emp_no"));
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		// dm.incmg_pers_ipadd =
		// Util.checkString(req.getParameter("incmg_pers_ipadd"));
		dm.fisc_dt = Util.checkString(req.getParameter("fisc_dt"));
		dm.ptcr = Util.checkString(req.getParameter("ptcr"));
		dm.chrg_emp_no = Util.checkString(req.getParameter("chrg_emp_no"));

		String multiUpdateData = Util.checkString(req
				.getParameter("multiUpDate"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.prof_type_cd = (String) hash.get("prof_type_cd");
		dm.slip_clsf_cd = (String) hash.get("slip_clsf_cd");
		dm.slip_occr_dt = (String) hash.get("slip_occr_dt");
		dm.slip_seq = (String) hash.get("slip_seq");
		dm.vexc_cmpy_cd = (String) hash.get("vexc_cmpy_cd");
		dm.vexc_cmpy_nm = (String) hash.get("vexc_cmpy_nm");
		dm.acct_no = (String) hash.get("acct_no");
		dm.medi_cd = (String) hash.get("medi_cd");

		dm.print();

		/* EJB 수정후 시작 */
		ds = dao.fc_acct_2951_u(dm);

		if (!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/*
		 * EJB 수정전 시작 try { FC_ACCT_2000EJBHome home =
		 * (FC_ACCT_2000EJBHome)JNDIManager
		 * .getInstance().getHome("FC_ACCT_2000EJB"); FC_ACCT_2000EJB ejb =
		 * home.create();
		 * 
		 * ds = ejb.fc_acct_2951_u(dm); req.setAttribute("ds", ds); } catch
		 * (CreateException e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } catch (RemoteException
		 * e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } EJB 수정전 끝
		 */

		/*******************************************************************************************
		 * String multiUpdateData =
		 * Util.checkString(req.getParameter("multiUpdateData")); Hashtable hash
		 * = getHashMultiUpdateData(multiUpdateData);
		 * 
		 * dm.cmpy_cd = (String)hash.get("cmpy_cd"); dm.slip_occr_dt_in =
		 * (String)hash.get("slip_occr_dt_in"); dm.slip_clsf_cd_in =
		 * (String)hash.get("slip_clsf_cd_in"); dm.incmg_emp_no =
		 * (String)hash.get("incmg_emp_no"); dm.incmg_pers_ipadd =
		 * (String)hash.get("incmg_pers_ipadd"); dm.fisc_dt =
		 * (String)hash.get("fisc_dt"); dm.ptcr = (String)hash.get("ptcr");
		 * dm.chrg_emp_no = (String)hash.get("chrg_emp_no"); dm.prof_type_cd =
		 * (String)hash.get("prof_type_cd"); dm.slip_clsf_cd =
		 * (String)hash.get("slip_clsf_cd"); dm.slip_occr_dt =
		 * (String)hash.get("slip_occr_dt"); dm.slip_seq =
		 * (String)hash.get("slip_seq"); dm.vexc_cmpy_cd =
		 * (String)hash.get("vexc_cmpy_cd"); dm.vexc_cmpy_nm =
		 * (String)hash.get("vexc_cmpy_nm"); dm.acct_no =
		 * (String)hash.get("acct_no"); dm.medi_cd =
		 * (String)hash.get("medi_cd");
		 * 
		 * dm.prof_type_cd = Util.checkString(req.getParameter("prof_type_cd"));
		 * dm.slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
		 * dm.slip_occr_dt = Util.checkString(req.getParameter("slip_occr_dt"));
		 * dm.slip_seq = Util.checkString(req.getParameter("slip_seq"));
		 * dm.vexc_cmpy_cd = Util.checkString(req.getParameter("vexc_cmpy_cd"));
		 * dm.vexc_cmpy_nm = Util.checkString(req.getParameter("vexc_cmpy_nm"));
		 * dm.acct_no = Util.checkString(req.getParameter("acct_no"));
		 * dm.medi_cd = Util.checkString(req.getParameter("medi_cd"));
		 *******************************************************************************************/
	}

	public void fc_acct_2952_d(HttpServletRequest req, HttpServletResponse res)
			throws AppException, SQLException {
		FC_ACCT_2952_DDataSet ds = null;
		FC_ACCT_2952_DDM dm = new FC_ACCT_2952_DDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_emp_no = Util.getSessionParameterValue(req, "emp_no", true);
		// dm.cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
		dm.slip_occr_dt_in = Util.checkString(req
				.getParameter("slip_occr_dt_in"));
		dm.slip_clsf_cd_in = Util.checkString(req
				.getParameter("slip_clsf_cd_in"));
		dm.slip_seq_in = Util.checkString(req.getParameter("slip_seq_in"));
		// dm.incmg_emp_no = Util.checkString(req.getParameter("incmg_emp_no"));
		dm.incmg_emp_no_ipadd = req.getRemoteAddr();
		// dm.incmg_emp_no_ipadd =
		// Util.checkString(req.getParameter("incmg_emp_no_ipadd"));

		String multiUpdateData = Util.checkString(req
				.getParameter("multiUpDate"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.prof_type_cd = (String) hash.get("prof_type_cd");
		dm.slip_occr_dt = (String) hash.get("slip_occr_dt");
		dm.slip_clsf_cd = (String) hash.get("slip_clsf_cd");
		dm.slip_seq = (String) hash.get("slip_seq");

		dm.print();

		/* EJB 수정후 시작 */
		ds = dao.fc_acct_2952_d(dm);

		if (!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/*
		 * EJB 수정전 시작 try { FC_ACCT_2000EJBHome home =
		 * (FC_ACCT_2000EJBHome)JNDIManager
		 * .getInstance().getHome("FC_ACCT_2000EJB"); FC_ACCT_2000EJB ejb =
		 * home.create();
		 * 
		 * ds = ejb.fc_acct_2952_d(dm); req.setAttribute("ds", ds); } catch
		 * (CreateException e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } catch (RemoteException
		 * e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } EJB 수정전 끝
		 */

		/*******************************************************************************************
		 * String multiUpdateData =
		 * Util.checkString(req.getParameter("multiUpdateData")); Hashtable hash
		 * = getHashMultiUpdateData(multiUpdateData);
		 * 
		 * dm.cmpy_cd = (String)hash.get("cmpy_cd"); dm.slip_occr_dt_in =
		 * (String)hash.get("slip_occr_dt_in"); dm.slip_clsf_cd_in =
		 * (String)hash.get("slip_clsf_cd_in"); dm.slip_seq_in =
		 * (String)hash.get("slip_seq_in"); dm.incmg_emp_no =
		 * (String)hash.get("incmg_emp_no"); dm.incmg_emp_no_ipadd =
		 * (String)hash.get("incmg_emp_no_ipadd"); dm.prof_type_cd =
		 * (String)hash.get("prof_type_cd"); dm.slip_occr_dt =
		 * (String)hash.get("slip_occr_dt"); dm.slip_clsf_cd =
		 * (String)hash.get("slip_clsf_cd"); dm.slip_seq =
		 * (String)hash.get("slip_seq");
		 *******************************************************************************************/
	}

	public void fc_acct_2960_m(HttpServletRequest req, HttpServletResponse res)
			throws AppException, SQLException {
		FC_ACCT_2960_MDataSet ds = null;
		FC_ACCT_2960_MDM dm = new FC_ACCT_2960_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);

		dm.print();

		/* EJB 수정후 시작 */
		ds = dao.fc_acct_2960_m(dm);

		if (!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/*
		 * EJB 수정전 시작 try { FC_ACCT_2000EJBHome home =
		 * (FC_ACCT_2000EJBHome)JNDIManager
		 * .getInstance().getHome("FC_ACCT_2000EJB"); FC_ACCT_2000EJB ejb =
		 * home.create();
		 * 
		 * ds = ejb.fc_acct_2960_m(dm); req.setAttribute("ds", ds); } catch
		 * (CreateException e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } catch (RemoteException
		 * e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } EJB 수정전 끝
		 */

		/*******************************************************************************************
		 * String multiUpdateData =
		 * Util.checkString(req.getParameter("multiUpdateData")); Hashtable hash
		 * = getHashMultiUpdateData(multiUpdateData);
		 * 
		 * dm.cmpy_cd = (String)hash.get("cmpy_cd");
		 *******************************************************************************************/

		/*******************************************************************************************
		 * dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		 *******************************************************************************************/
	}

	public void fc_acct_2961_l(HttpServletRequest req, HttpServletResponse res)
			throws AppException, SQLException {
		FC_ACCT_2961_LDataSet ds = null;
		FC_ACCT_2961_LDM dm = new FC_ACCT_2961_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.from_fisc_dt = Util.checkString(req.getParameter("from_fisc_dt"));
		dm.to_fisc_dt = Util.checkString(req.getParameter("to_fisc_dt"));
		dm.from_occr_amt = Util.checkString(req.getParameter("from_occr_amt"));
		dm.to_occr_amt = Util.checkString(req.getParameter("to_occr_amt"));
		dm.adjm_occr_dt = Util.checkString(req.getParameter("adjm_occr_dt"));
		dm.adjm_slip_clsf = Util
				.checkString(req.getParameter("adjm_slip_clsf"));
		dm.adjm_seq = Util.checkString(req.getParameter("adjm_seq"));
		dm.adjm_sub_seq = Util.checkString(req.getParameter("adjm_sub_seq"));
		dm.mode = Util.checkString(req.getParameter("mode"));
		dm.acct_cd = Util.checkString(req.getParameter("acct_cd"));

		dm.print();

		/* EJB 수정후 시작 */
		ds = dao.fc_acct_2961_l(dm);

		if (!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/*
		 * EJB 수정전 시작 try { FC_ACCT_2000EJBHome home =
		 * (FC_ACCT_2000EJBHome)JNDIManager
		 * .getInstance().getHome("FC_ACCT_2000EJB"); FC_ACCT_2000EJB ejb =
		 * home.create();
		 * 
		 * ds = ejb.fc_acct_2961_l(dm); req.setAttribute("ds", ds); } catch
		 * (CreateException e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } catch (RemoteException
		 * e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } EJB 수정전 끝
		 */

		/*******************************************************************************************
		 * String multiUpdateData =
		 * Util.checkString(req.getParameter("multiUpdateData")); Hashtable hash
		 * = getHashMultiUpdateData(multiUpdateData);
		 * 
		 * dm.cmpy_cd = (String)hash.get("cmpy_cd"); dm.from_fisc_dt =
		 * (String)hash.get("from_fisc_dt"); dm.to_fisc_dt =
		 * (String)hash.get("to_fisc_dt"); dm.from_occr_amt =
		 * (String)hash.get("from_occr_amt"); dm.to_occr_amt =
		 * (String)hash.get("to_occr_amt"); dm.adjm_occr_dt =
		 * (String)hash.get("adjm_occr_dt"); dm.adjm_slip_clsf =
		 * (String)hash.get("adjm_slip_clsf"); dm.adjm_seq =
		 * (String)hash.get("adjm_seq"); dm.adjm_sub_seq =
		 * (String)hash.get("adjm_sub_seq"); dm.mode = (String)hash.get("mode");
		 *******************************************************************************************/

		/*******************************************************************************************
		 * dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		 * dm.from_fisc_dt =
		 * Util.getSessionParameterValue(req,"from_fisc_dt",true); dm.to_fisc_dt
		 * = Util.getSessionParameterValue(req,"to_fisc_dt",true);
		 * dm.from_occr_amt =
		 * Util.getSessionParameterValue(req,"from_occr_amt",true);
		 * dm.to_occr_amt =
		 * Util.getSessionParameterValue(req,"to_occr_amt",true);
		 * dm.adjm_occr_dt =
		 * Util.getSessionParameterValue(req,"adjm_occr_dt",true);
		 * dm.adjm_slip_clsf =
		 * Util.getSessionParameterValue(req,"adjm_slip_clsf",true); dm.adjm_seq
		 * = Util.getSessionParameterValue(req,"adjm_seq",true); dm.adjm_sub_seq
		 * = Util.getSessionParameterValue(req,"adjm_sub_seq",true); dm.mode =
		 * Util.getSessionParameterValue(req,"mode",true);
		 *******************************************************************************************/
	}

	public void fc_acct_2963_i(HttpServletRequest req, HttpServletResponse res)
			throws AppException, SQLException {
		FC_ACCT_2963_IDataSet ds = null;
		FC_ACCT_2963_IDM dm = new FC_ACCT_2963_IDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.rmks1 = Util.checkString(req.getParameter("rmks1"));
		dm.rmks2 = Util.checkString(req.getParameter("rmks2"));
		dm.incmg_emp_no = Util.checkString(req.getParameter("incmg_emp_no"));
		dm.fisc_dt = Util.checkString(req.getParameter("fisc_dt"));
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		dm.in_sicsgb = Util.checkString(req.getParameter("in_sicsgb"));
		dm.incmg_dt = Util.checkString(req.getParameter("incmg_dt"));

		String multiUpdateData = Util.checkString(req
				.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.slip_occr_dt = (String) hash.get("slip_occr_dt");
		dm.slip_clsf_cd = (String) hash.get("slip_clsf_cd");
		dm.slip_seq = (String) hash.get("slip_seq");
		dm.slip_sub_seq = (String) hash.get("slip_sub_seq");
		dm.slip_arow_no = (String) hash.get("slip_arow_no");
		dm.dlco_clsf_cd = (String) hash.get("dlco_clsf_cd");
		dm.dlco_cd = (String) hash.get("dlco_cd");
		dm.dlco_nm = (String) hash.get("dlco_nm");
		dm.occr_amt = (String) hash.get("occr_amt");

		dm.print();

		/* EJB 수정후 시작 */
		ds = dao.fc_acct_2963_i(dm);

		if (!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/*
		 * EJB 수정전 시작 try { FC_ACCT_2000EJBHome home =
		 * (FC_ACCT_2000EJBHome)JNDIManager
		 * .getInstance().getHome("FC_ACCT_2000EJB"); FC_ACCT_2000EJB ejb =
		 * home.create();
		 * 
		 * ds = ejb.fc_acct_2963_i(dm); req.setAttribute("ds", ds); } catch
		 * (CreateException e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } catch (RemoteException
		 * e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } EJB 수정전 끝
		 */

		/*******************************************************************************************
		 * String multiUpdateData =
		 * Util.checkString(req.getParameter("multiUpdateData")); Hashtable hash
		 * = getHashMultiUpdateData(multiUpdateData);
		 * 
		 * dm.cmpy_cd = (String)hash.get("cmpy_cd"); dm.slip_occr_dt =
		 * (String)hash.get("slip_occr_dt"); dm.slip_clsf_cd =
		 * (String)hash.get("slip_clsf_cd"); dm.slip_seq =
		 * (String)hash.get("slip_seq"); dm.slip_sub_seq =
		 * (String)hash.get("slip_sub_seq"); dm.slip_arow_no =
		 * (String)hash.get("slip_arow_no"); dm.dlco_clsf_cd =
		 * (String)hash.get("dlco_clsf_cd"); dm.dlco_cd =
		 * (String)hash.get("dlco_cd"); dm.dlco_nm =
		 * (String)hash.get("dlco_nm"); dm.occr_amt =
		 * (String)hash.get("occr_amt"); dm.rmks1 = (String)hash.get("rmks1");
		 * dm.rmks2 = (String)hash.get("rmks2"); dm.incmg_emp_no =
		 * (String)hash.get("incmg_emp_no"); dm.fisc_dt =
		 * (String)hash.get("fisc_dt"); dm.incmg_pers =
		 * (String)hash.get("incmg_pers"); dm.incmg_pers_ipadd =
		 * (String)hash.get("incmg_pers_ipadd"); dm.in_sicsgb =
		 * (String)hash.get("in_sicsgb"); dm.incmg_dt =
		 * (String)hash.get("incmg_dt");
		 *******************************************************************************************/

		/*******************************************************************************************
		 * dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		 * dm.slip_occr_dt =
		 * Util.getSessionParameterValue(req,"slip_occr_dt",true);
		 * dm.slip_clsf_cd =
		 * Util.getSessionParameterValue(req,"slip_clsf_cd",true); dm.slip_seq =
		 * Util.getSessionParameterValue(req,"slip_seq",true); dm.slip_sub_seq =
		 * Util.getSessionParameterValue(req,"slip_sub_seq",true);
		 * dm.slip_arow_no =
		 * Util.getSessionParameterValue(req,"slip_arow_no",true);
		 * dm.dlco_clsf_cd =
		 * Util.getSessionParameterValue(req,"dlco_clsf_cd",true); dm.dlco_cd =
		 * Util.getSessionParameterValue(req,"dlco_cd",true); dm.dlco_nm =
		 * Util.getSessionParameterValue(req,"dlco_nm",true); dm.occr_amt =
		 * Util.getSessionParameterValue(req,"occr_amt",true); dm.rmks1 =
		 * Util.getSessionParameterValue(req,"rmks1",true); dm.rmks2 =
		 * Util.getSessionParameterValue(req,"rmks2",true); dm.incmg_emp_no =
		 * Util.getSessionParameterValue(req,"incmg_emp_no",true); dm.fisc_dt =
		 * Util.getSessionParameterValue(req,"fisc_dt",true); dm.incmg_pers =
		 * Util.getSessionParameterValue(req,"incmg_pers",true);
		 * dm.incmg_pers_ipadd =
		 * Util.getSessionParameterValue(req,"incmg_pers_ipadd",true);
		 * dm.in_sicsgb = Util.getSessionParameterValue(req,"in_sicsgb",true);
		 * dm.incmg_dt = Util.getSessionParameterValue(req,"incmg_dt",true);
		 *******************************************************************************************/
	}

	public void fc_acct_2964_d(HttpServletRequest req, HttpServletResponse res)
			throws AppException, SQLException {
		FC_ACCT_2964_DDataSet ds = null;
		FC_ACCT_2964_DDM dm = new FC_ACCT_2964_DDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.slip_occr_dt = Util.checkString(req.getParameter("slip_occr_dt"));
		dm.slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
		dm.slip_seq = Util.checkString(req.getParameter("slip_seq"));
		dm.slip_sub_seq = Util.checkString(req.getParameter("slip_sub_seq"));
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		dm.in_sicsgb = Util.checkString(req.getParameter("in_sicsgb"));

		dm.print();

		/* EJB 수정후 시작 */
		ds = dao.fc_acct_2964_d(dm);

		if (!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/*
		 * EJB 수정전 시작 try { FC_ACCT_2000EJBHome home =
		 * (FC_ACCT_2000EJBHome)JNDIManager
		 * .getInstance().getHome("FC_ACCT_2000EJB"); FC_ACCT_2000EJB ejb =
		 * home.create();
		 * 
		 * ds = ejb.fc_acct_2964_d(dm); req.setAttribute("ds", ds); } catch
		 * (CreateException e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } catch (RemoteException
		 * e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } EJB 수정전 끝
		 */

		/*******************************************************************************************
		 * String multiUpdateData =
		 * Util.checkString(req.getParameter("multiUpdateData")); Hashtable hash
		 * = getHashMultiUpdateData(multiUpdateData);
		 * 
		 * dm.cmpy_cd = (String)hash.get("cmpy_cd"); dm.slip_occr_dt =
		 * (String)hash.get("slip_occr_dt"); dm.slip_clsf_cd =
		 * (String)hash.get("slip_clsf_cd"); dm.slip_seq =
		 * (String)hash.get("slip_seq"); dm.slip_sub_seq =
		 * (String)hash.get("slip_sub_seq"); dm.incmg_pers =
		 * (String)hash.get("incmg_pers"); dm.incmg_pers_ipadd =
		 * (String)hash.get("incmg_pers_ipadd"); dm.in_sicsgb =
		 * (String)hash.get("in_sicsgb");
		 *******************************************************************************************/

		/*******************************************************************************************
		 * dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		 * dm.slip_occr_dt =
		 * Util.getSessionParameterValue(req,"slip_occr_dt",true);
		 * dm.slip_clsf_cd =
		 * Util.getSessionParameterValue(req,"slip_clsf_cd",true); dm.slip_seq =
		 * Util.getSessionParameterValue(req,"slip_seq",true); dm.slip_sub_seq =
		 * Util.getSessionParameterValue(req,"slip_sub_seq",true); dm.incmg_pers
		 * = Util.getSessionParameterValue(req,"incmg_pers",true);
		 * dm.incmg_pers_ipadd =
		 * Util.getSessionParameterValue(req,"incmg_pers_ipadd",true);
		 * dm.in_sicsgb = Util.getSessionParameterValue(req,"in_sicsgb",true);
		 *******************************************************************************************/
	}

	public void fc_acct_2020_m(HttpServletRequest req, HttpServletResponse res)
			throws AppException, SQLException {
		FC_ACCT_2020_MDataSet ds = null;
		FC_ACCT_2020_MDM dm = new FC_ACCT_2020_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);

		dm.print();

		/* EJB 수정후 시작 */
		ds = dao.fc_acct_2020_m(dm);

		if (!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/*
		 * EJB 수정전 시작 try { FC_ACCT_2000EJBHome home =
		 * (FC_ACCT_2000EJBHome)JNDIManager
		 * .getInstance().getHome("FC_ACCT_2000EJB"); FC_ACCT_2000EJB ejb =
		 * home.create();
		 * 
		 * ds = ejb.fc_acct_2020_m(dm); req.setAttribute("ds", ds); } catch
		 * (CreateException e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } catch (RemoteException
		 * e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } EJB 수정전 끝
		 */

		/*******************************************************************************************
		 * String multiUpdateData =
		 * Util.checkString(req.getParameter("multiUpdateData")); Hashtable hash
		 * = getHashMultiUpdateData(multiUpdateData);
		 * 
		 * dm.cmpy_cd = (String)hash.get("cmpy_cd");
		 *******************************************************************************************/

		/*******************************************************************************************
		 * dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		 *******************************************************************************************/
	}

	public void fc_acct_2021_l(HttpServletRequest req, HttpServletResponse res)
			throws AppException, SQLException {
		FC_ACCT_2021_LDataSet ds = null;
		FC_ACCT_2021_LDM dm = new FC_ACCT_2021_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.uid = Util.getSessionParameterValue(req, "uid", true);
		dm.slip_occr_dt = Util.checkString(req.getParameter("slip_occr_dt"));
		dm.slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
		dm.slip_seq = Util.checkString(req.getParameter("slip_seq"));

		dm.print();

		/* EJB 수정후 시작 */
		ds = dao.fc_acct_2021_l(dm);

		if (!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/*
		 * EJB 수정전 시작 try { FC_ACCT_2000EJBHome home =
		 * (FC_ACCT_2000EJBHome)JNDIManager
		 * .getInstance().getHome("FC_ACCT_2000EJB"); FC_ACCT_2000EJB ejb =
		 * home.create();
		 * 
		 * ds = ejb.fc_acct_2021_l(dm); req.setAttribute("ds", ds); } catch
		 * (CreateException e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } catch (RemoteException
		 * e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } EJB 수정전 끝
		 */

		/*******************************************************************************************
		 * String multiUpdateData =
		 * Util.checkString(req.getParameter("multiUpdateData")); Hashtable hash
		 * = getHashMultiUpdateData(multiUpdateData);
		 * 
		 * dm.cmpy_cd = (String)hash.get("cmpy_cd"); dm.uid =
		 * (String)hash.get("uid"); dm.slip_occr_dt =
		 * (String)hash.get("slip_occr_dt"); dm.slip_clsf_cd =
		 * (String)hash.get("slip_clsf_cd"); dm.slip_seq =
		 * (String)hash.get("slip_seq");
		 *******************************************************************************************/

		/*******************************************************************************************
		 * dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		 * dm.uid = Util.getSessionParameterValue(req,"uid",true);
		 * dm.slip_occr_dt =
		 * Util.getSessionParameterValue(req,"slip_occr_dt",true);
		 * dm.slip_clsf_cd =
		 * Util.getSessionParameterValue(req,"slip_clsf_cd",true); dm.slip_seq =
		 * Util.getSessionParameterValue(req,"slip_seq",true);
		 *******************************************************************************************/
	}

	public void fc_acct_2022_l(HttpServletRequest req, HttpServletResponse res)
			throws AppException, SQLException {
		FC_ACCT_2022_LDataSet ds = null;
		FC_ACCT_2022_LDM dm = new FC_ACCT_2022_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.slip_occr_dt = Util.checkString(req.getParameter("slip_occr_dt"));
		dm.slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
		dm.slip_seq = Util.checkString(req.getParameter("slip_seq"));

		dm.print();

		/* EJB 수정후 시작 */
		ds = dao.fc_acct_2022_l(dm);

		if (!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/*
		 * EJB 수정전 시작 try { FC_ACCT_2000EJBHome home =
		 * (FC_ACCT_2000EJBHome)JNDIManager
		 * .getInstance().getHome("FC_ACCT_2000EJB"); FC_ACCT_2000EJB ejb =
		 * home.create();
		 * 
		 * ds = ejb.fc_acct_2022_l(dm); req.setAttribute("ds", ds); } catch
		 * (CreateException e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } catch (RemoteException
		 * e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } EJB 수정전 끝
		 */

		/*******************************************************************************************
		 * String multiUpdateData =
		 * Util.checkString(req.getParameter("multiUpdateData")); Hashtable hash
		 * = getHashMultiUpdateData(multiUpdateData);
		 * 
		 * dm.cmpy_cd = (String)hash.get("cmpy_cd"); dm.slip_occr_dt =
		 * (String)hash.get("slip_occr_dt"); dm.slip_clsf_cd =
		 * (String)hash.get("slip_clsf_cd"); dm.slip_seq =
		 * (String)hash.get("slip_seq");
		 *******************************************************************************************/

		/*******************************************************************************************
		 * dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		 * dm.slip_occr_dt =
		 * Util.getSessionParameterValue(req,"slip_occr_dt",true);
		 * dm.slip_clsf_cd =
		 * Util.getSessionParameterValue(req,"slip_clsf_cd",true); dm.slip_seq =
		 * Util.getSessionParameterValue(req,"slip_seq",true);
		 *******************************************************************************************/
	}

	public void fc_acct_2023_i(HttpServletRequest req, HttpServletResponse res)
			throws AppException, SQLException {
		FC_ACCT_2023_IDataSet ds = null;
		FC_ACCT_2023_IDM dm = new FC_ACCT_2023_IDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.slip_occr_dt = Util.checkString(req.getParameter("slip_occr_dt"));
		dm.slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
		dm.clam_dept_cd = Util.checkString(req.getParameter("clam_dept_cd"));
		dm.clam_amt = Util.checkString(req.getParameter("clam_amt"));
		dm.titl = Util.checkString(req.getParameter("titl"));
		dm.medi_cd = Util.checkString(req.getParameter("medi_cd"));
		dm.cost_clsf = Util.checkString(req.getParameter("cost_clsf"));
		dm.budg_yymm = Util.checkString(req.getParameter("budg_yymm"));
		dm.chrg_emp_no = Util.checkString(req.getParameter("chrg_emp_no"));
		dm.budg_cd = Util.checkString(req.getParameter("budg_cd"));
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		dm.adpay_expn_no = Util.checkString(req.getParameter("adpay_expn_no"));
		dm.end_yn = Util.checkString(req.getParameter("end_yn"));
		dm.draft_doc_no = Util.checkString(req.getParameter("draft_doc_no"));
		dm.draft_doc_dept_cd = Util.checkString(req
				.getParameter("draft_doc_dept_cd"));
		dm.draft_expn_amt = Util
				.checkString(req.getParameter("draft_expn_amt"));

		String multiUpdateData = Util.checkString(req
				.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.old_dlco_clsf_cd = (String) hash.get("old_dlco_clsf_cd");
		dm.old_dlco_cd = (String) hash.get("old_dlco_cd");
		dm.pch_compnm = (String) hash.get("pch_compnm");
		dm.pubc_dt = (String) hash.get("pubc_dt");
		dm.nosh = (String) hash.get("nosh");
		dm.uprc = (String) hash.get("uprc");
		dm.atic_fee = (String) hash.get("atic_fee");
		dm.incm_clsf_cd = (String) hash.get("incm_clsf_cd");
		dm.incm_tax = (String) hash.get("incm_tax");
		dm.res_tax = (String) hash.get("res_tax");
		dm.coms = (String) hash.get("coms");
		dm.atic_nm = (String) hash.get("atic_nm");
		dm.with_tax = (String) hash.get("with_tax");
		dm.pubc_side = (String) hash.get("pubc_side");
		dm.cal_pay_amt = (String) hash.get("cal_pay_amt");
		dm.bank_clsf = (String) hash.get("bank_clsf");
		dm.acct_no = (String) hash.get("acct_no");
		dm.deps_pers_nm = (String) hash.get("deps_pers_nm");
		dm.dtls_medi_cd = (String) hash.get("dtls_medi_cd");

		dm.print();

		/* EJB 수정후 시작 */
		ds = dao.fc_acct_2023_i(dm);

		if (!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/*
		 * EJB 수정전 시작 try { FC_ACCT_2000EJBHome home =
		 * (FC_ACCT_2000EJBHome)JNDIManager
		 * .getInstance().getHome("FC_ACCT_2000EJB"); FC_ACCT_2000EJB ejb =
		 * home.create();
		 * 
		 * ds = ejb.fc_acct_2023_i(dm); req.setAttribute("ds", ds); } catch
		 * (CreateException e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } catch (RemoteException
		 * e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } EJB 수정전 끝
		 */

		/*******************************************************************************************
		 * String multiUpdateData =
		 * Util.checkString(req.getParameter("multiUpdateData")); Hashtable hash
		 * = getHashMultiUpdateData(multiUpdateData);
		 * 
		 * dm.cmpy_cd = (String)hash.get("cmpy_cd"); dm.slip_occr_dt =
		 * (String)hash.get("slip_occr_dt"); dm.slip_clsf_cd =
		 * (String)hash.get("slip_clsf_cd"); dm.clam_dept_cd =
		 * (String)hash.get("clam_dept_cd"); dm.clam_amt =
		 * (String)hash.get("clam_amt"); dm.titl = (String)hash.get("titl");
		 * dm.medi_cd = (String)hash.get("medi_cd"); dm.cost_clsf =
		 * (String)hash.get("cost_clsf"); dm.budg_yymm =
		 * (String)hash.get("budg_yymm"); dm.chrg_emp_no =
		 * (String)hash.get("chrg_emp_no"); dm.budg_cd =
		 * (String)hash.get("budg_cd"); dm.incmg_pers =
		 * (String)hash.get("incmg_pers"); dm.incmg_pers_ipadd =
		 * (String)hash.get("incmg_pers_ipadd"); dm.old_dlco_clsf_cd =
		 * (String)hash.get("old_dlco_clsf_cd"); dm.old_dlco_cd =
		 * (String)hash.get("old_dlco_cd"); dm.pch_compnm =
		 * (String)hash.get("pch_compnm"); dm.pubc_dt =
		 * (String)hash.get("pubc_dt"); dm.nosh = (String)hash.get("nosh");
		 * dm.uprc = (String)hash.get("uprc"); dm.atic_fee =
		 * (String)hash.get("atic_fee"); dm.incm_clsf_cd =
		 * (String)hash.get("incm_clsf_cd"); dm.incm_tax =
		 * (String)hash.get("incm_tax"); dm.res_tax =
		 * (String)hash.get("res_tax"); dm.coms = (String)hash.get("coms");
		 * dm.atic_nm = (String)hash.get("atic_nm"); dm.with_tax =
		 * (String)hash.get("with_tax"); dm.pubc_side =
		 * (String)hash.get("pubc_side"); dm.cal_pay_amt =
		 * (String)hash.get("cal_pay_amt"); dm.bank_clsf =
		 * (String)hash.get("bank_clsf"); dm.acct_no =
		 * (String)hash.get("acct_no"); dm.deps_pers_nm =
		 * (String)hash.get("deps_pers_nm"); dm.dtls_medi_cd =
		 * (String)hash.get("dtls_medi_cd"); dm.adpay_expn_no =
		 * (String)hash.get("adpay_expn_no"); dm.end_yn =
		 * (String)hash.get("end_yn"); dm.draft_doc_no =
		 * (String)hash.get("draft_doc_no"); dm.draft_doc_dept_cd =
		 * (String)hash.get("draft_doc_dept_cd"); dm.draft_expn_amt =
		 * (String)hash.get("draft_expn_amt");
		 *******************************************************************************************/

		/*******************************************************************************************
		 * dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		 * dm.slip_occr_dt =
		 * Util.getSessionParameterValue(req,"slip_occr_dt",true);
		 * dm.slip_clsf_cd =
		 * Util.getSessionParameterValue(req,"slip_clsf_cd",true);
		 * dm.clam_dept_cd =
		 * Util.getSessionParameterValue(req,"clam_dept_cd",true); dm.clam_amt =
		 * Util.getSessionParameterValue(req,"clam_amt",true); dm.titl =
		 * Util.getSessionParameterValue(req,"titl",true); dm.medi_cd =
		 * Util.getSessionParameterValue(req,"medi_cd",true); dm.cost_clsf =
		 * Util.getSessionParameterValue(req,"cost_clsf",true); dm.budg_yymm =
		 * Util.getSessionParameterValue(req,"budg_yymm",true); dm.chrg_emp_no =
		 * Util.getSessionParameterValue(req,"chrg_emp_no",true); dm.budg_cd =
		 * Util.getSessionParameterValue(req,"budg_cd",true); dm.incmg_pers =
		 * Util.getSessionParameterValue(req,"incmg_pers",true);
		 * dm.incmg_pers_ipadd =
		 * Util.getSessionParameterValue(req,"incmg_pers_ipadd",true);
		 * dm.old_dlco_clsf_cd =
		 * Util.getSessionParameterValue(req,"old_dlco_clsf_cd",true);
		 * dm.old_dlco_cd =
		 * Util.getSessionParameterValue(req,"old_dlco_cd",true); dm.pch_compnm
		 * = Util.getSessionParameterValue(req,"pch_compnm",true); dm.pubc_dt =
		 * Util.getSessionParameterValue(req,"pubc_dt",true); dm.nosh =
		 * Util.getSessionParameterValue(req,"nosh",true); dm.uprc =
		 * Util.getSessionParameterValue(req,"uprc",true); dm.atic_fee =
		 * Util.getSessionParameterValue(req,"atic_fee",true); dm.incm_clsf_cd =
		 * Util.getSessionParameterValue(req,"incm_clsf_cd",true); dm.incm_tax =
		 * Util.getSessionParameterValue(req,"incm_tax",true); dm.res_tax =
		 * Util.getSessionParameterValue(req,"res_tax",true); dm.coms =
		 * Util.getSessionParameterValue(req,"coms",true); dm.atic_nm =
		 * Util.getSessionParameterValue(req,"atic_nm",true); dm.with_tax =
		 * Util.getSessionParameterValue(req,"with_tax",true); dm.pubc_side =
		 * Util.getSessionParameterValue(req,"pubc_side",true); dm.cal_pay_amt =
		 * Util.getSessionParameterValue(req,"cal_pay_amt",true); dm.bank_clsf =
		 * Util.getSessionParameterValue(req,"bank_clsf",true); dm.acct_no =
		 * Util.getSessionParameterValue(req,"acct_no",true); dm.deps_pers_nm =
		 * Util.getSessionParameterValue(req,"deps_pers_nm",true);
		 * dm.dtls_medi_cd =
		 * Util.getSessionParameterValue(req,"dtls_medi_cd",true);
		 * dm.adpay_expn_no =
		 * Util.getSessionParameterValue(req,"adpay_expn_no",true); dm.end_yn =
		 * Util.getSessionParameterValue(req,"end_yn",true); dm.draft_doc_no =
		 * Util.getSessionParameterValue(req,"draft_doc_no",true);
		 * dm.draft_doc_dept_cd =
		 * Util.getSessionParameterValue(req,"draft_doc_dept_cd",true);
		 * dm.draft_expn_amt =
		 * Util.getSessionParameterValue(req,"draft_expn_amt",true);
		 *******************************************************************************************/
	}

	public void fc_acct_2024_u(HttpServletRequest req, HttpServletResponse res)
			throws AppException, SQLException {
		FC_ACCT_2024_UDataSet ds = null;
		FC_ACCT_2024_UDM dm = new FC_ACCT_2024_UDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.slip_occr_dt = Util.checkString(req.getParameter("slip_occr_dt"));
		dm.slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
		dm.slip_seq = Util.checkString(req.getParameter("slip_seq"));
		dm.clam_dept_cd = Util.checkString(req.getParameter("clam_dept_cd"));
		dm.clam_amt = Util.checkString(req.getParameter("clam_amt"));
		dm.titl = Util.checkString(req.getParameter("titl"));
		dm.medi_cd = Util.checkString(req.getParameter("medi_cd"));
		dm.cost_clsf = Util.checkString(req.getParameter("cost_clsf"));
		dm.budg_yymm = Util.checkString(req.getParameter("budg_yymm"));
		dm.chrg_emp_no = Util.checkString(req.getParameter("chrg_emp_no"));
		dm.budg_cd = Util.checkString(req.getParameter("budg_cd"));
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		dm.adpay_expn_no = Util.checkString(req.getParameter("adpay_expn_no"));
		dm.end_yn = Util.checkString(req.getParameter("end_yn"));
		dm.draft_doc_no = Util.checkString(req.getParameter("draft_doc_no"));
		dm.draft_doc_dept_cd = Util.checkString(req
				.getParameter("draft_doc_dept_cd"));
		dm.draft_expn_amt = Util
				.checkString(req.getParameter("draft_expn_amt"));

		String multiUpdateData = Util.checkString(req
				.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.old_dlco_clsf_cd = (String) hash.get("old_dlco_clsf_cd");
		dm.old_dlco_cd = (String) hash.get("old_dlco_cd");
		dm.pch_compnm = (String) hash.get("pch_compnm");
		dm.pubc_dt = (String) hash.get("pubc_dt");
		dm.nosh = (String) hash.get("nosh");
		dm.uprc = (String) hash.get("uprc");
		dm.atic_fee = (String) hash.get("atic_fee");
		dm.incm_clsf_cd = (String) hash.get("incm_clsf_cd");
		dm.incm_tax = (String) hash.get("incm_tax");
		dm.res_tax = (String) hash.get("res_tax");
		dm.coms = (String) hash.get("coms");
		dm.atic_nm = (String) hash.get("atic_nm");
		dm.with_tax = (String) hash.get("with_tax");
		dm.pubc_side = (String) hash.get("pubc_side");
		dm.cal_pay_amt = (String) hash.get("cal_pay_amt");
		dm.bank_clsf = (String) hash.get("bank_clsf");
		dm.acct_no = (String) hash.get("acct_no");
		dm.deps_pers_nm = (String) hash.get("deps_pers_nm");
		dm.dtls_medi_cd = (String) hash.get("dtls_medi_cd");

		dm.print();

		/* EJB 수정후 시작 */
		ds = dao.fc_acct_2024_u(dm);

		if (!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/*
		 * EJB 수정전 시작 try { FC_ACCT_2000EJBHome home =
		 * (FC_ACCT_2000EJBHome)JNDIManager
		 * .getInstance().getHome("FC_ACCT_2000EJB"); FC_ACCT_2000EJB ejb =
		 * home.create();
		 * 
		 * ds = ejb.fc_acct_2024_u(dm); req.setAttribute("ds", ds); } catch
		 * (CreateException e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } catch (RemoteException
		 * e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } EJB 수정전 끝
		 */

		/*******************************************************************************************
		 * String multiUpdateData =
		 * Util.checkString(req.getParameter("multiUpdateData")); Hashtable hash
		 * = getHashMultiUpdateData(multiUpdateData);
		 * 
		 * dm.cmpy_cd = (String)hash.get("cmpy_cd"); dm.slip_occr_dt =
		 * (String)hash.get("slip_occr_dt"); dm.slip_clsf_cd =
		 * (String)hash.get("slip_clsf_cd"); dm.slip_seq =
		 * (String)hash.get("slip_seq"); dm.clam_dept_cd =
		 * (String)hash.get("clam_dept_cd"); dm.clam_amt =
		 * (String)hash.get("clam_amt"); dm.titl = (String)hash.get("titl");
		 * dm.medi_cd = (String)hash.get("medi_cd"); dm.cost_clsf =
		 * (String)hash.get("cost_clsf"); dm.budg_yymm =
		 * (String)hash.get("budg_yymm"); dm.chrg_emp_no =
		 * (String)hash.get("chrg_emp_no"); dm.budg_cd =
		 * (String)hash.get("budg_cd"); dm.incmg_pers =
		 * (String)hash.get("incmg_pers"); dm.incmg_pers_ipadd =
		 * (String)hash.get("incmg_pers_ipadd"); dm.old_dlco_clsf_cd =
		 * (String)hash.get("old_dlco_clsf_cd"); dm.old_dlco_cd =
		 * (String)hash.get("old_dlco_cd"); dm.pch_compnm =
		 * (String)hash.get("pch_compnm"); dm.pubc_dt =
		 * (String)hash.get("pubc_dt"); dm.nosh = (String)hash.get("nosh");
		 * dm.uprc = (String)hash.get("uprc"); dm.atic_fee =
		 * (String)hash.get("atic_fee"); dm.incm_clsf_cd =
		 * (String)hash.get("incm_clsf_cd"); dm.incm_tax =
		 * (String)hash.get("incm_tax"); dm.res_tax =
		 * (String)hash.get("res_tax"); dm.coms = (String)hash.get("coms");
		 * dm.atic_nm = (String)hash.get("atic_nm"); dm.with_tax =
		 * (String)hash.get("with_tax"); dm.pch_row_no_in =
		 * (String)hash.get("pch_row_no_in"); dm.pubc_side =
		 * (String)hash.get("pubc_side"); dm.cal_pay_amt =
		 * (String)hash.get("cal_pay_amt"); dm.bank_clsf =
		 * (String)hash.get("bank_clsf"); dm.acct_no =
		 * (String)hash.get("acct_no"); dm.deps_pers_nm =
		 * (String)hash.get("deps_pers_nm"); dm.dtls_medi_cd =
		 * (String)hash.get("dtls_medi_cd"); dm.adpay_expn_no =
		 * (String)hash.get("adpay_expn_no"); dm.end_yn =
		 * (String)hash.get("end_yn"); dm.draft_doc_no =
		 * (String)hash.get("draft_doc_no"); dm.draft_doc_dept_cd =
		 * (String)hash.get("draft_doc_dept_cd"); dm.draft_expn_amt =
		 * (String)hash.get("draft_expn_amt");
		 *******************************************************************************************/

		/*******************************************************************************************
		 * dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		 * dm.slip_occr_dt =
		 * Util.getSessionParameterValue(req,"slip_occr_dt",true);
		 * dm.slip_clsf_cd =
		 * Util.getSessionParameterValue(req,"slip_clsf_cd",true); dm.slip_seq =
		 * Util.getSessionParameterValue(req,"slip_seq",true); dm.clam_dept_cd =
		 * Util.getSessionParameterValue(req,"clam_dept_cd",true); dm.clam_amt =
		 * Util.getSessionParameterValue(req,"clam_amt",true); dm.titl =
		 * Util.getSessionParameterValue(req,"titl",true); dm.medi_cd =
		 * Util.getSessionParameterValue(req,"medi_cd",true); dm.cost_clsf =
		 * Util.getSessionParameterValue(req,"cost_clsf",true); dm.budg_yymm =
		 * Util.getSessionParameterValue(req,"budg_yymm",true); dm.chrg_emp_no =
		 * Util.getSessionParameterValue(req,"chrg_emp_no",true); dm.budg_cd =
		 * Util.getSessionParameterValue(req,"budg_cd",true); dm.incmg_pers =
		 * Util.getSessionParameterValue(req,"incmg_pers",true);
		 * dm.incmg_pers_ipadd =
		 * Util.getSessionParameterValue(req,"incmg_pers_ipadd",true);
		 * dm.old_dlco_clsf_cd =
		 * Util.getSessionParameterValue(req,"old_dlco_clsf_cd",true);
		 * dm.old_dlco_cd =
		 * Util.getSessionParameterValue(req,"old_dlco_cd",true); dm.pch_compnm
		 * = Util.getSessionParameterValue(req,"pch_compnm",true); dm.pubc_dt =
		 * Util.getSessionParameterValue(req,"pubc_dt",true); dm.nosh =
		 * Util.getSessionParameterValue(req,"nosh",true); dm.uprc =
		 * Util.getSessionParameterValue(req,"uprc",true); dm.atic_fee =
		 * Util.getSessionParameterValue(req,"atic_fee",true); dm.incm_clsf_cd =
		 * Util.getSessionParameterValue(req,"incm_clsf_cd",true); dm.incm_tax =
		 * Util.getSessionParameterValue(req,"incm_tax",true); dm.res_tax =
		 * Util.getSessionParameterValue(req,"res_tax",true); dm.coms =
		 * Util.getSessionParameterValue(req,"coms",true); dm.atic_nm =
		 * Util.getSessionParameterValue(req,"atic_nm",true); dm.with_tax =
		 * Util.getSessionParameterValue(req,"with_tax",true); dm.pch_row_no_in
		 * = Util.getSessionParameterValue(req,"pch_row_no_in",true);
		 * dm.pubc_side = Util.getSessionParameterValue(req,"pubc_side",true);
		 * dm.cal_pay_amt =
		 * Util.getSessionParameterValue(req,"cal_pay_amt",true); dm.bank_clsf =
		 * Util.getSessionParameterValue(req,"bank_clsf",true); dm.acct_no =
		 * Util.getSessionParameterValue(req,"acct_no",true); dm.deps_pers_nm =
		 * Util.getSessionParameterValue(req,"deps_pers_nm",true);
		 * dm.dtls_medi_cd =
		 * Util.getSessionParameterValue(req,"dtls_medi_cd",true);
		 * dm.adpay_expn_no =
		 * Util.getSessionParameterValue(req,"adpay_expn_no",true); dm.end_yn =
		 * Util.getSessionParameterValue(req,"end_yn",true); dm.draft_doc_no =
		 * Util.getSessionParameterValue(req,"draft_doc_no",true);
		 * dm.draft_doc_dept_cd =
		 * Util.getSessionParameterValue(req,"draft_doc_dept_cd",true);
		 * dm.draft_expn_amt =
		 * Util.getSessionParameterValue(req,"draft_expn_amt",true);
		 *******************************************************************************************/
	}

	public void fc_acct_2025_d(HttpServletRequest req, HttpServletResponse res)
			throws AppException, SQLException {
		FC_ACCT_2025_DDataSet ds = null;
		FC_ACCT_2025_DDM dm = new FC_ACCT_2025_DDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.slip_occr_dt = Util.checkString(req.getParameter("slip_occr_dt"));
		dm.slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
		dm.slip_seq = Util.checkString(req.getParameter("slip_seq"));
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.incmg_pers_ipadd = req.getRemoteAddr();

		dm.print();

		/* EJB 수정후 시작 */
		ds = dao.fc_acct_2025_d(dm);

		if (!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/*
		 * EJB 수정전 시작 try { FC_ACCT_2000EJBHome home =
		 * (FC_ACCT_2000EJBHome)JNDIManager
		 * .getInstance().getHome("FC_ACCT_2000EJB"); FC_ACCT_2000EJB ejb =
		 * home.create();
		 * 
		 * ds = ejb.fc_acct_2025_d(dm); req.setAttribute("ds", ds); } catch
		 * (CreateException e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } catch (RemoteException
		 * e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } EJB 수정전 끝
		 */

		/*******************************************************************************************
		 * String multiUpdateData =
		 * Util.checkString(req.getParameter("multiUpdateData")); Hashtable hash
		 * = getHashMultiUpdateData(multiUpdateData);
		 * 
		 * dm.cmpy_cd = (String)hash.get("cmpy_cd"); dm.slip_occr_dt =
		 * (String)hash.get("slip_occr_dt"); dm.slip_clsf_cd =
		 * (String)hash.get("slip_clsf_cd"); dm.slip_seq =
		 * (String)hash.get("slip_seq"); dm.incmg_pers =
		 * (String)hash.get("incmg_pers"); dm.incmg_pers_ipadd =
		 * (String)hash.get("incmg_pers_ipadd");
		 *******************************************************************************************/

		/*******************************************************************************************
		 * dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		 * dm.slip_occr_dt =
		 * Util.getSessionParameterValue(req,"slip_occr_dt",true);
		 * dm.slip_clsf_cd =
		 * Util.getSessionParameterValue(req,"slip_clsf_cd",true); dm.slip_seq =
		 * Util.getSessionParameterValue(req,"slip_seq",true); dm.incmg_pers =
		 * Util.getSessionParameterValue(req,"incmg_pers",true);
		 * dm.incmg_pers_ipadd =
		 * Util.getSessionParameterValue(req,"incmg_pers_ipadd",true);
		 *******************************************************************************************/
	}

	public void fc_acct_2026_l(HttpServletRequest req, HttpServletResponse res)
			throws AppException, SQLException {
		FC_ACCT_2026_LDataSet ds = null;
		FC_ACCT_2026_LDM dm = new FC_ACCT_2026_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.dlco_no = Util.checkString(req.getParameter("dlco_no"));

		dm.print();

		/* EJB 수정후 시작 */
		ds = dao.fc_acct_2026_l(dm);

		if (!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/*
		 * EJB 수정전 시작 try { FC_ACCT_2000EJBHome home =
		 * (FC_ACCT_2000EJBHome)JNDIManager
		 * .getInstance().getHome("FC_ACCT_2000EJB"); FC_ACCT_2000EJB ejb =
		 * home.create();
		 * 
		 * ds = ejb.fc_acct_2026_l(dm); req.setAttribute("ds", ds); } catch
		 * (CreateException e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } catch (RemoteException
		 * e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } EJB 수정전 끝
		 */

		/*******************************************************************************************
		 * String multiUpdateData =
		 * Util.checkString(req.getParameter("multiUpdateData")); Hashtable hash
		 * = getHashMultiUpdateData(multiUpdateData);
		 * 
		 * dm.dlco_no = (String)hash.get("dlco_no");
		 *******************************************************************************************/

		/*******************************************************************************************
		 * dm.dlco_no = Util.getSessionParameterValue(req,"dlco_no",true);
		 *******************************************************************************************/
	}

	public void fc_acct_2053_s(HttpServletRequest req, HttpServletResponse res)
			throws AppException, SQLException {
		FC_ACCT_2053_SDataSet ds = null;
		FC_ACCT_2053_SDM dm = new FC_ACCT_2053_SDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.slip_occr_dt = Util.checkString(req.getParameter("slip_occr_dt"));
		dm.slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
		dm.slip_seq = Util.checkString(req.getParameter("slip_seq"));

		dm.print();

		/* EJB 수정후 시작 */
		ds = dao.fc_acct_2053_s(dm);

		if (!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/*
		 * EJB 수정전 시작 try { FC_ACCT_2000EJBHome home =
		 * (FC_ACCT_2000EJBHome)JNDIManager
		 * .getInstance().getHome("FC_ACCT_2000EJB"); FC_ACCT_2000EJB ejb =
		 * home.create();
		 * 
		 * ds = ejb.fc_acct_2053_s(dm); req.setAttribute("ds", ds); } catch
		 * (CreateException e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } catch (RemoteException
		 * e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } EJB 수정전 끝
		 */

		/*******************************************************************************************
		 * String multiUpdateData =
		 * Util.checkString(req.getParameter("multiUpdateData")); Hashtable hash
		 * = getHashMultiUpdateData(multiUpdateData);
		 * 
		 * dm.cmpy_cd = (String)hash.get("cmpy_cd"); dm.slip_occr_dt =
		 * (String)hash.get("slip_occr_dt"); dm.slip_clsf_cd =
		 * (String)hash.get("slip_clsf_cd"); dm.slip_seq =
		 * (String)hash.get("slip_seq");
		 *******************************************************************************************/

		/*******************************************************************************************
		 * dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		 * dm.slip_occr_dt =
		 * Util.getSessionParameterValue(req,"slip_occr_dt",true);
		 * dm.slip_clsf_cd =
		 * Util.getSessionParameterValue(req,"slip_clsf_cd",true); dm.slip_seq =
		 * Util.getSessionParameterValue(req,"slip_seq",true);
		 *******************************************************************************************/
	}

	public void fc_acct_2054_s(HttpServletRequest req, HttpServletResponse res)
			throws AppException, SQLException {
		FC_ACCT_2054_SDataSet ds = null;
		FC_ACCT_2054_SDM dm = new FC_ACCT_2054_SDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.uid = Util.getSessionParameterValue(req, "uid", true);
		dm.slip_occr_dt = Util.checkString(req.getParameter("slip_occr_dt"));
		dm.slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
		dm.slip_seq = Util.checkString(req.getParameter("slip_seq"));

		dm.print();

		/* EJB 수정후 시작 */
		ds = dao.fc_acct_2054_s(dm);

		if (!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/*
		 * EJB 수정전 시작 try { FC_ACCT_2000EJBHome home =
		 * (FC_ACCT_2000EJBHome)JNDIManager
		 * .getInstance().getHome("FC_ACCT_2000EJB"); FC_ACCT_2000EJB ejb =
		 * home.create();
		 * 
		 * ds = ejb.fc_acct_2054_s(dm); req.setAttribute("ds", ds); } catch
		 * (CreateException e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } catch (RemoteException
		 * e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } EJB 수정전 끝
		 */

		/*******************************************************************************************
		 * String multiUpdateData =
		 * Util.checkString(req.getParameter("multiUpdateData")); Hashtable hash
		 * = getHashMultiUpdateData(multiUpdateData);
		 * 
		 * dm.cmpy_cd = (String)hash.get("cmpy_cd"); dm.uid =
		 * (String)hash.get("uid"); dm.slip_occr_dt =
		 * (String)hash.get("slip_occr_dt"); dm.slip_clsf_cd =
		 * (String)hash.get("slip_clsf_cd"); dm.slip_seq =
		 * (String)hash.get("slip_seq");
		 *******************************************************************************************/

		/*******************************************************************************************
		 * dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		 * dm.uid = Util.getSessionParameterValue(req,"uid",true);
		 * dm.slip_occr_dt =
		 * Util.getSessionParameterValue(req,"slip_occr_dt",true);
		 * dm.slip_clsf_cd =
		 * Util.getSessionParameterValue(req,"slip_clsf_cd",true); dm.slip_seq =
		 * Util.getSessionParameterValue(req,"slip_seq",true);
		 *******************************************************************************************/
	}

	public void fc_acct_2055_s(HttpServletRequest req, HttpServletResponse res)
			throws AppException, SQLException {
		FC_ACCT_2055_SDataSet ds = null;
		FC_ACCT_2055_SDM dm = new FC_ACCT_2055_SDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.slip_occr_dt = Util.checkString(req.getParameter("slip_occr_dt"));
		dm.slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
		dm.slip_seq_fr = Util.checkString(req.getParameter("slip_seq_fr"));
		dm.slip_seq_to = Util.checkString(req.getParameter("slip_seq_to"));

		dm.print();

		/* EJB 수정후 시작 */
		ds = dao.fc_acct_2055_s(dm);

		if (!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/*
		 * EJB 수정전 시작 try { FC_ACCT_2000EJBHome home =
		 * (FC_ACCT_2000EJBHome)JNDIManager
		 * .getInstance().getHome("FC_ACCT_2000EJB"); FC_ACCT_2000EJB ejb =
		 * home.create();
		 * 
		 * ds = ejb.fc_acct_2055_s(dm); req.setAttribute("ds", ds); } catch
		 * (CreateException e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } catch (RemoteException
		 * e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } EJB 수정전 끝
		 */

		/*******************************************************************************************
		 * String multiUpdateData =
		 * Util.checkString(req.getParameter("multiUpdateData")); Hashtable hash
		 * = getHashMultiUpdateData(multiUpdateData);
		 * 
		 * dm.cmpy_cd = (String)hash.get("cmpy_cd"); dm.slip_occr_dt =
		 * (String)hash.get("slip_occr_dt"); dm.slip_clsf_cd =
		 * (String)hash.get("slip_clsf_cd"); dm.slip_seq_fr =
		 * (String)hash.get("slip_seq_fr"); dm.slip_seq_to =
		 * (String)hash.get("slip_seq_to");
		 *******************************************************************************************/

		/*******************************************************************************************
		 * dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		 * dm.slip_occr_dt =
		 * Util.getSessionParameterValue(req,"slip_occr_dt",true);
		 * dm.slip_clsf_cd =
		 * Util.getSessionParameterValue(req,"slip_clsf_cd",true);
		 * dm.slip_seq_fr =
		 * Util.getSessionParameterValue(req,"slip_seq_fr",true); dm.slip_seq_to
		 * = Util.getSessionParameterValue(req,"slip_seq_to",true);
		 *******************************************************************************************/
	}

	public void fc_acct_2063_s(HttpServletRequest req, HttpServletResponse res)
			throws AppException, SQLException {
		FC_ACCT_2063_SDataSet ds = null;
		FC_ACCT_2063_SDM dm = new FC_ACCT_2063_SDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.uid = Util.getSessionParameterValue(req, "uid", true);
		dm.slip_occr_dt = Util.checkString(req.getParameter("slip_occr_dt"));
		dm.slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
		dm.slip_seq = Util.checkString(req.getParameter("slip_seq"));

		dm.print();

		/* EJB 수정후 시작 */
		ds = dao.fc_acct_2063_s(dm);

		if (!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/*
		 * EJB 수정전 시작 try { FC_ACCT_2000EJBHome home =
		 * (FC_ACCT_2000EJBHome)JNDIManager
		 * .getInstance().getHome("FC_ACCT_2000EJB"); FC_ACCT_2000EJB ejb =
		 * home.create();
		 * 
		 * ds = ejb.fc_acct_2063_s(dm); req.setAttribute("ds", ds); } catch
		 * (CreateException e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } catch (RemoteException
		 * e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } EJB 수정전 끝
		 */

		/*******************************************************************************************
		 * String multiUpdateData =
		 * Util.checkString(req.getParameter("multiUpdateData")); Hashtable hash
		 * = getHashMultiUpdateData(multiUpdateData);
		 * 
		 * dm.cmpy_cd = (String)hash.get("cmpy_cd"); dm.uid =
		 * (String)hash.get("uid"); dm.slip_occr_dt =
		 * (String)hash.get("slip_occr_dt"); dm.slip_clsf_cd =
		 * (String)hash.get("slip_clsf_cd"); dm.slip_seq =
		 * (String)hash.get("slip_seq");
		 *******************************************************************************************/

		/*******************************************************************************************
		 * dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		 * dm.uid = Util.getSessionParameterValue(req,"uid",true);
		 * dm.slip_occr_dt =
		 * Util.getSessionParameterValue(req,"slip_occr_dt",true);
		 * dm.slip_clsf_cd =
		 * Util.getSessionParameterValue(req,"slip_clsf_cd",true); dm.slip_seq =
		 * Util.getSessionParameterValue(req,"slip_seq",true);
		 *******************************************************************************************/
	}

	public void fc_acct_2072_s(HttpServletRequest req, HttpServletResponse res)
			throws AppException, SQLException {
		FC_ACCT_2072_SDataSet ds = null;
		FC_ACCT_2072_SDM dm = new FC_ACCT_2072_SDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.uid = Util.getSessionParameterValue(req, "uid", true);
		dm.slip_occr_dt = Util.checkString(req.getParameter("slip_occr_dt"));
		dm.slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
		dm.slip_seq = Util.checkString(req.getParameter("slip_seq"));

		dm.print();

		/* EJB 수정후 시작 */
		ds = dao.fc_acct_2072_s(dm);

		if (!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/*
		 * EJB 수정전 시작 try { FC_ACCT_2000EJBHome home =
		 * (FC_ACCT_2000EJBHome)JNDIManager
		 * .getInstance().getHome("FC_ACCT_2000EJB"); FC_ACCT_2000EJB ejb =
		 * home.create();
		 * 
		 * ds = ejb.fc_acct_2072_s(dm); req.setAttribute("ds", ds); } catch
		 * (CreateException e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } catch (RemoteException
		 * e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } EJB 수정전 끝
		 */

		/*******************************************************************************************
		 * String multiUpdateData =
		 * Util.checkString(req.getParameter("multiUpdateData")); Hashtable hash
		 * = getHashMultiUpdateData(multiUpdateData);
		 * 
		 * dm.cmpy_cd = (String)hash.get("cmpy_cd"); dm.uid =
		 * (String)hash.get("uid"); dm.slip_occr_dt =
		 * (String)hash.get("slip_occr_dt"); dm.slip_clsf_cd =
		 * (String)hash.get("slip_clsf_cd"); dm.slip_seq =
		 * (String)hash.get("slip_seq");
		 *******************************************************************************************/

		/*******************************************************************************************
		 * dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		 * dm.uid = Util.getSessionParameterValue(req,"uid",true);
		 * dm.slip_occr_dt =
		 * Util.getSessionParameterValue(req,"slip_occr_dt",true);
		 * dm.slip_clsf_cd =
		 * Util.getSessionParameterValue(req,"slip_clsf_cd",true); dm.slip_seq =
		 * Util.getSessionParameterValue(req,"slip_seq",true);
		 *******************************************************************************************/
	}

	public void fc_acct_2915_s(HttpServletRequest req, HttpServletResponse res)
			throws AppException, SQLException {
		FC_ACCT_2915_SDataSet ds = null;
		FC_ACCT_2915_SDM dm = new FC_ACCT_2915_SDM();

		dm.flag = Util.checkString(req.getParameter("flag"));
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.slip_occr_dt = Util.checkString(req.getParameter("slip_occr_dt"));
		dm.slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
		dm.slip_occr_seqo = Util
				.checkString(req.getParameter("slip_occr_seqo"));
		dm.slip_occr_sub_seq = Util.checkString(req
				.getParameter("slip_occr_sub_seq"));

		dm.print();

		/* EJB 수정후 시작 */
		ds = dao.fc_acct_2915_s(dm);

		if (!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/*
		 * EJB 수정전 시작 try { FC_ACCT_2000EJBHome home =
		 * (FC_ACCT_2000EJBHome)JNDIManager
		 * .getInstance().getHome("FC_ACCT_2000EJB"); FC_ACCT_2000EJB ejb =
		 * home.create();
		 * 
		 * ds = ejb.fc_acct_2915_s(dm); req.setAttribute("ds", ds); } catch
		 * (CreateException e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } catch (RemoteException
		 * e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } EJB 수정전 끝
		 */

		/*******************************************************************************************
		 * String multiUpdateData =
		 * Util.checkString(req.getParameter("multiUpdateData")); Hashtable hash
		 * = getHashMultiUpdateData(multiUpdateData);
		 * 
		 * dm.flag = (String)hash.get("flag"); dm.cmpy_cd =
		 * (String)hash.get("cmpy_cd"); dm.slip_occr_dt =
		 * (String)hash.get("slip_occr_dt"); dm.slip_clsf_cd =
		 * (String)hash.get("slip_clsf_cd"); dm.slip_occr_seqo =
		 * (String)hash.get("slip_occr_seqo"); dm.slip_occr_sub_seq =
		 * (String)hash.get("slip_occr_sub_seq");
		 *******************************************************************************************/

		/*******************************************************************************************
		 * dm.flag = Util.getSessionParameterValue(req,"flag",true); dm.cmpy_cd
		 * = Util.getSessionParameterValue(req,"cmpy_cd",true); dm.slip_occr_dt
		 * = Util.getSessionParameterValue(req,"slip_occr_dt",true);
		 * dm.slip_clsf_cd =
		 * Util.getSessionParameterValue(req,"slip_clsf_cd",true);
		 * dm.slip_occr_seqo =
		 * Util.getSessionParameterValue(req,"slip_occr_seqo",true);
		 * dm.slip_occr_sub_seq =
		 * Util.getSessionParameterValue(req,"slip_occr_sub_seq",true);
		 *******************************************************************************************/
	}

	public void fc_acct_2015_l(HttpServletRequest req, HttpServletResponse res)
			throws AppException, SQLException {
		FC_ACCT_2015_LDataSet ds = null;
		FC_ACCT_2015_LDM dm = new FC_ACCT_2015_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.cd = Util.checkString(req.getParameter("cd"));
		dm.medi_cd = Util.checkString(req.getParameter("medi_cd"));

		dm.print();

		/* EJB 수정후 시작 */
		ds = dao.fc_acct_2015_l(dm);

		if (!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/*
		 * EJB 수정전 시작 try { FC_ACCT_2000EJBHome home =
		 * (FC_ACCT_2000EJBHome)JNDIManager
		 * .getInstance().getHome("FC_ACCT_2000EJB"); FC_ACCT_2000EJB ejb =
		 * home.create();
		 * 
		 * ds = ejb.fc_acct_2015_l(dm); req.setAttribute("ds", ds); } catch
		 * (CreateException e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } catch (RemoteException
		 * e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } EJB 수정전 끝
		 */

		/*******************************************************************************************
		 * String multiUpdateData =
		 * Util.checkString(req.getParameter("multiUpdateData")); Hashtable hash
		 * = getHashMultiUpdateData(multiUpdateData);
		 * 
		 * dm.cmpy_cd = (String)hash.get("cmpy_cd"); dm.cd =
		 * (String)hash.get("cd"); dm.medi_cd = (String)hash.get("medi_cd");
		 *******************************************************************************************/

		/*******************************************************************************************
		 * dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true); dm.cd
		 * = Util.getSessionParameterValue(req,"cd",true); dm.medi_cd =
		 * Util.getSessionParameterValue(req,"medi_cd",true);
		 *******************************************************************************************/
	}

	public void fc_acct_2128_s(HttpServletRequest req, HttpServletResponse res)
			throws AppException, SQLException {
		FC_ACCT_2128_SDataSet ds = null;
		FC_ACCT_2128_SDM dm = new FC_ACCT_2128_SDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.rcpm_slip_occr_dt = Util.checkString(req
				.getParameter("rcpm_slip_occr_dt"));
		dm.rcpm_slip_clsf_cd = Util.checkString(req
				.getParameter("rcpm_slip_clsf_cd"));
		dm.rcpm_slip_seq = Util.checkString(req.getParameter("rcpm_slip_seq"));
		dm.slip_occr_dt = Util.checkString(req.getParameter("slip_occr_dt"));
		dm.slip_seq = Util.checkString(req.getParameter("slip_seq"));

		dm.print();

		/* EJB 수정후 시작 */
		ds = dao.fc_acct_2128_s(dm);

		if (!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/*
		 * EJB 수정전 시작 try { FC_ACCT_2000EJBHome home =
		 * (FC_ACCT_2000EJBHome)JNDIManager
		 * .getInstance().getHome("FC_ACCT_2000EJB"); FC_ACCT_2000EJB ejb =
		 * home.create();
		 * 
		 * ds = ejb.fc_acct_2128_s(dm); req.setAttribute("ds", ds); } catch
		 * (CreateException e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } catch (RemoteException
		 * e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } EJB 수정전 끝
		 */

		/*******************************************************************************************
		 * String multiUpdateData =
		 * Util.checkString(req.getParameter("multiUpdateData")); Hashtable hash
		 * = getHashMultiUpdateData(multiUpdateData);
		 * 
		 * dm.cmpy_cd = (String)hash.get("cmpy_cd"); dm.rcpm_slip_occr_dt =
		 * (String)hash.get("rcpm_slip_occr_dt"); dm.rcpm_slip_clsf_cd =
		 * (String)hash.get("rcpm_slip_clsf_cd"); dm.rcpm_slip_seq =
		 * (String)hash.get("rcpm_slip_seq"); dm.slip_occr_dt =
		 * (String)hash.get("slip_occr_dt"); dm.slip_seq =
		 * (String)hash.get("slip_seq");
		 *******************************************************************************************/

		/*******************************************************************************************
		 * dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		 * dm.rcpm_slip_occr_dt =
		 * Util.getSessionParameterValue(req,"rcpm_slip_occr_dt",true);
		 * dm.rcpm_slip_clsf_cd =
		 * Util.getSessionParameterValue(req,"rcpm_slip_clsf_cd",true);
		 * dm.rcpm_slip_seq =
		 * Util.getSessionParameterValue(req,"rcpm_slip_seq",true);
		 * dm.slip_occr_dt =
		 * Util.getSessionParameterValue(req,"slip_occr_dt",true); dm.slip_seq =
		 * Util.getSessionParameterValue(req,"slip_seq",true);
		 *******************************************************************************************/
	}

	public void fc_acct_2016_s(HttpServletRequest req, HttpServletResponse res)
			throws AppException, SQLException {
		FC_ACCT_2016_SDataSet ds = null;
		FC_ACCT_2016_SDM dm = new FC_ACCT_2016_SDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);

		dm.print();

		/* EJB 수정후 시작 */
		ds = dao.fc_acct_2016_s(dm);

		if (!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/*
		 * EJB 수정전 시작 try { FC_ACCT_2000EJBHome home =
		 * (FC_ACCT_2000EJBHome)JNDIManager
		 * .getInstance().getHome("FC_ACCT_2000EJB"); FC_ACCT_2000EJB ejb =
		 * home.create();
		 * 
		 * ds = ejb.fc_acct_2016_s(dm); req.setAttribute("ds", ds); } catch
		 * (CreateException e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } catch (RemoteException
		 * e) { SysException se = new SysException(e);
		 * LogManager.getInstance().log(se); throw se; } EJB 수정전 끝
		 */

		/*******************************************************************************************
		 * String multiUpdateData =
		 * Util.checkString(req.getParameter("multiUpdateData")); Hashtable hash
		 * = getHashMultiUpdateData(multiUpdateData);
		 * 
		 * dm.cmpy_cd = (String)hash.get("cmpy_cd");
		 *******************************************************************************************/

		/*******************************************************************************************
		 * dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		 *******************************************************************************************/
	}

	public void fc_acct_2017_s(HttpServletRequest req, HttpServletResponse res)
		throws AppException, SQLException {
	FC_ACCT_2017_SDataSet ds = null;
	FC_ACCT_2017_SDM dm = new FC_ACCT_2017_SDM();
	
	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
	dm.emp_no = Util.checkString(req.getParameter("emp_no"));
	
	dm.print();
	
	/* EJB 수정후 시작 */
	ds = dao.fc_acct_2017_s(dm);
	
	if (!ds.getErrcode().equals("")) {
		throw new AppException(ds.getErrcode(), ds.getErrmsg());
	}
	
	req.setAttribute("ds", ds);
	/* EJB 수정후 끝 */
	
	/*
	 * EJB 수정전 시작 try { FC_ACCT_2000EJBHome home =
	 * (FC_ACCT_2000EJBHome)JNDIManager
	 * .getInstance().getHome("FC_ACCT_2000EJB"); FC_ACCT_2000EJB ejb =
	 * home.create();
	 * 
	 * ds = ejb.fc_acct_2017_s(dm); req.setAttribute("ds", ds); } catch
	 * (CreateException e) { SysException se = new SysException(e);
	 * LogManager.getInstance().log(se); throw se; } catch (RemoteException
	 * e) { SysException se = new SysException(e);
	 * LogManager.getInstance().log(se); throw se; } EJB 수정전 끝
	 */
	
	/*******************************************************************************************
	 * String multiUpdateData =
	 * Util.checkString(req.getParameter("multiUpdateData")); Hashtable hash
	 * = getHashMultiUpdateData(multiUpdateData);
	 * 
	 * dm.cmpy_cd = (String)hash.get("cmpy_cd");
     * dm.emp_no = (String)hash.get("emp_no");
	 *******************************************************************************************/
	
	/*******************************************************************************************
	 * dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
	 * dm.emp_no = Util.checkString(req.getParameter("emp_no"));
	 *******************************************************************************************/
	}

	public void fc_acct_2600_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
		FC_ACCT_2600_MDataSet ds = null;
		FC_ACCT_2600_MDM dm = new FC_ACCT_2600_MDM();

		dm.cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));

		dm.print();
		
		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_2600_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		
		/* EJB 수정전 시작
		try {
			FC_ACCT_1000EJBHome home = (FC_ACCT_1000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_1000EJB");
			FC_ACCT_1000EJB ejb = home.create();

			ds = ejb.fc_acct_1160_m(dm);
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
		EJB 수정전 끝 */
		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		*******************************************************************************************/
	}
	
	public void fc_acct_2601_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		FC_ACCT_2601_LDataSet ds = null;
		FC_ACCT_2601_LDM dm = new FC_ACCT_2601_LDM();

		dm.cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
		dm.acct_type_cd = Util.checkString(req.getParameter("acct_type_cd"));
		dm.search_yymm = Util.checkString(req.getParameter("search_yymm"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_2601_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		
		/* EJB 수정전 시작
		try {
			FC_ACCT_1000EJBHome home = (FC_ACCT_1000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_1000EJB");
			FC_ACCT_1000EJB ejb = home.create();

			ds = ejb.fc_acct_1161_l(dm);
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
		EJB 수정전 끝 */
		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.acct_type_cd = (String)hash.get("acct_type_cd");
		dm.search_yymm = (String)hash.get("search_yymm");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.acct_type_cd = Util.getSessionParameterValue(req,"acct_type_cd",true);
		dm.search_yymm = Util.getSessionParameterValue(req,"search_yymm",true);
		*******************************************************************************************/
	}
	
	public void fc_acct_2603_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		FC_ACCT_2603_LDataSet ds = null;
		FC_ACCT_2603_LDM dm = new FC_ACCT_2603_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.acct_type_cd = Util.checkString(req.getParameter("acct_type_cd"));
		dm.search_yymm = Util.checkString(req.getParameter("search_yymm"));
		dm.print();

		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_2603_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
	}

	
	public void fc_acct_2610_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
		FC_ACCT_2610_MDataSet ds = null;
		FC_ACCT_2610_MDM dm = new FC_ACCT_2610_MDM();

		dm.cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_2610_MDataSet)manager.executeCall(dm);
		
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);

		/*
		try {
			FC_ACCT_2000EJBHome home = (FC_ACCT_2000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_2000EJB");
			FC_ACCT_2000EJB ejb = home.create();

			ds = ejb.fc_acct_2610_m(dm);
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
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		*******************************************************************************************/
	}
	
	public void fc_acct_2611_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		FC_ACCT_2611_LDataSet ds = null;
		FC_ACCT_2611_LDM dm = new FC_ACCT_2611_LDM();

		dm.cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
		dm.fr_dt = Util.checkString(req.getParameter("fr_dt"));
		dm.to_dt = Util.checkString(req.getParameter("to_dt"));
		dm.fr_budg_cd = Util.checkString(req.getParameter("fr_budg_cd"));
		dm.to_budg_cd = Util.checkString(req.getParameter("to_budg_cd"));
		dm.dlco_cmpy_cd = Util.checkString(req.getParameter("dlco_cmpy_cd"));
		dm.dlco_clsf_cd = Util.checkString(req.getParameter("dlco_clsf_cd"));
		dm.slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
		dm.budg_clsf_cd = Util.checkString(req.getParameter("budg_clsf_cd"));
		dm.cnfm_clsf_cd = Util.checkString(req.getParameter("cnfm_clsf_cd"));

		dm.print();
		
		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_2611_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);

		/*
		try {
			FC_ACCT_2000EJBHome home = (FC_ACCT_2000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_2000EJB");
			FC_ACCT_2000EJB ejb = home.create();

			ds = ejb.fc_acct_2611_l(dm);
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
		dm.dlco_cd = (String)hash.get("dlco_cd");
		dm.fr_dt = (String)hash.get("fr_dt");
		dm.to_dt = (String)hash.get("to_dt");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.dlco_cd = Util.getSessionParameterValue(req,"dlco_cd",true);
		dm.fr_dt = Util.getSessionParameterValue(req,"fr_dt",true);
		dm.to_dt = Util.getSessionParameterValue(req,"to_dt",true);
		*******************************************************************************************/
	}

	public void fc_acct_2612_u(HttpServletRequest req, HttpServletResponse res) throws AppException {
		FC_ACCT_2612_UDataSet ds = null;
		FC_ACCT_2612_UDM dm = new FC_ACCT_2612_UDM();

		dm.cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
		dm.slip_list = Util.checkString(req.getParameter("slip_list"));
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		
		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_2612_UDataSet)manager.executeCall(dm);
		
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);

		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.slip_list = (String)hash.get("slip_list");
		dm.incmg_pers_ipadd = (String)hash.get("incmg_pers_ipadd");
		dm.incmg_pers = (String)hash.get("incmg_pers");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.slip_list = Util.getSessionParameterValue(req,"slip_list",true);
		dm.incmg_pers_ipadd = Util.getSessionParameterValue(req,"incmg_pers_ipadd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"incmg_pers",true);
		*******************************************************************************************/
	}
	
	public void fc_acct_2614_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		FC_ACCT_2614_LDataSet ds = null;
		FC_ACCT_2614_LDM dm = new FC_ACCT_2614_LDM();

		dm.cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
		dm.slip_no = Util.checkString(req.getParameter("slip_no"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_2614_LDataSet)manager.executeCall(dm);
		
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);

		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.slip_no = (String)hash.get("slip_no");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.slip_no = Util.getSessionParameterValue(req,"slip_no",true);
		*******************************************************************************************/
	}
	
	public void fc_acct_2620_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
		FC_ACCT_2620_MDataSet ds = null;
		FC_ACCT_2620_MDM dm = new FC_ACCT_2620_MDM();

		dm.cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_2620_MDataSet)manager.executeCall(dm);
		
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
	}
	
	public void fc_acct_2621_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		FC_ACCT_2621_LDataSet ds = null;
		FC_ACCT_2621_LDM dm = new FC_ACCT_2621_LDM();

		dm.cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
		dm.fr_dt = Util.checkString(req.getParameter("fr_dt"));
		dm.to_dt = Util.checkString(req.getParameter("to_dt"));
		dm.conn_cmpy_cd1 = Util.checkString(req.getParameter("conn_cmpy_cd1"));
		dm.fr_budg_cd1 = Util.checkString(req.getParameter("fr_budg_cd1"));
		dm.to_budg_cd1 = Util.checkString(req.getParameter("to_budg_cd1"));
		dm.slip_clsf_cd1 = Util.checkString(req.getParameter("slip_clsf_cd1"));
		dm.budg_clsf_cd1 = Util.checkString(req.getParameter("budg_clsf_cd1"));
		dm.conn_clsf_cd1 = Util.checkString(req.getParameter("conn_clsf_cd1"));
		dm.conn_cmpy_cd2 = Util.checkString(req.getParameter("conn_cmpy_cd2"));
		dm.fr_budg_cd2 = Util.checkString(req.getParameter("fr_budg_cd2"));
		dm.to_budg_cd2 = Util.checkString(req.getParameter("to_budg_cd2"));
		dm.slip_clsf_cd2 = Util.checkString(req.getParameter("slip_clsf_cd2"));
		dm.budg_clsf_cd2 = Util.checkString(req.getParameter("budg_clsf_cd2"));
		dm.conn_clsf_cd2 = Util.checkString(req.getParameter("conn_clsf_cd2"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_2621_LDataSet)manager.executeCall(dm);
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
	}
	
	public void fc_acct_2622_u(HttpServletRequest req, HttpServletResponse res) throws AppException {
		FC_ACCT_2622_UDataSet ds = null;
		FC_ACCT_2622_UDM dm = new FC_ACCT_2622_UDM();

		dm.cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
		dm.fr_fisc_dt = Util.checkString(req.getParameter("fr_fisc_dt"));
		dm.to_fisc_dt = Util.checkString(req.getParameter("to_fisc_dt"));
		dm.conn_cmpy_cd1 = Util.checkString(req.getParameter("conn_cmpy_cd1"));
		dm.data_list1 = Util.checkString(req.getParameter("data_list1"));
		dm.conn_cmpy_cd2 = Util.checkString(req.getParameter("conn_cmpy_cd2"));
		dm.data_list2 = Util.checkString(req.getParameter("data_list2"));
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_2622_UDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);

	}
	
	public void fc_acct_2630_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
		FC_ACCT_2630_MDataSet ds = null;
		FC_ACCT_2630_MDM dm = new FC_ACCT_2630_MDM();

		dm.cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_2630_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);

	}
	
	public void fc_acct_2631_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		FC_ACCT_2631_LDataSet ds = null;
		FC_ACCT_2631_LDM dm = new FC_ACCT_2631_LDM();

		dm.cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
		dm.fr_dt = Util.checkString(req.getParameter("fr_dt"));
		dm.to_dt = Util.checkString(req.getParameter("to_dt"));
		dm.fr_budg_cd = Util.checkString(req.getParameter("fr_budg_cd"));
		dm.to_budg_cd = Util.checkString(req.getParameter("to_budg_cd"));
		dm.dlco_cmpy_cd = Util.checkString(req.getParameter("dlco_cmpy_cd"));
		dm.dlco_clsf_cd = Util.checkString(req.getParameter("dlco_clsf_cd"));
		dm.slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
		dm.budg_clsf_cd = Util.checkString(req.getParameter("budg_clsf_cd"));
		dm.cnfm_clsf_cd = Util.checkString(req.getParameter("cnfm_clsf_cd"));

		dm.print();
		
		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_2631_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);

	}
	
	public void fc_acct_2632_u(HttpServletRequest req, HttpServletResponse res) throws AppException {
		FC_ACCT_2632_UDataSet ds = null;
		FC_ACCT_2632_UDM dm = new FC_ACCT_2632_UDM();

		dm.cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
		dm.slip_list = Util.checkString(req.getParameter("slip_list"));
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_2632_UDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);

	}
	
	public void fc_acct_2633_u(HttpServletRequest req, HttpServletResponse res) throws AppException {
		FC_ACCT_2633_UDataSet ds = null;
		FC_ACCT_2633_UDM dm = new FC_ACCT_2633_UDM();

		dm.cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
		dm.obj_cmpy_cd = Util.checkString(req.getParameter("obj_cmpy_cd"));
		dm.fisc_ym = Util.checkString(req.getParameter("fisc_ym"));
		dm.clos_clsf = Util.checkString(req.getParameter("clos_clsf"));
		dm.wrk_clsf = Util.checkString(req.getParameter("wrk_clsf"));
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_2633_UDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
	}
	
	public void fc_acct_2640_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
		FC_ACCT_2640_MDataSet ds = null;
		FC_ACCT_2640_MDM dm = new FC_ACCT_2640_MDM();

		dm.cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_2640_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
	}

	public void fc_acct_2641_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		FC_ACCT_2641_LDataSet ds = null;
		FC_ACCT_2641_LDM dm = new FC_ACCT_2641_LDM();

		dm.cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
		dm.fr_dt = Util.checkString(req.getParameter("fr_dt"));
		dm.to_dt = Util.checkString(req.getParameter("to_dt"));
		dm.grp_cd = Util.checkString(req.getParameter("grp_cd"));
		dm.conn_cmpy_cd1 = Util.checkString(req.getParameter("conn_cmpy_cd1"));
		dm.fr_budg_cd1 = Util.checkString(req.getParameter("fr_budg_cd1"));
		dm.to_budg_cd1 = Util.checkString(req.getParameter("to_budg_cd1"));
		dm.slip_clsf_cd1 = Util.checkString(req.getParameter("slip_clsf_cd1"));
		dm.budg_clsf_cd1 = Util.checkString(req.getParameter("budg_clsf_cd1"));
		dm.conn_clsf_cd1 = Util.checkString(req.getParameter("conn_clsf_cd1"));
		dm.conn_cmpy_cd2 = Util.checkString(req.getParameter("conn_cmpy_cd2"));
		dm.fr_budg_cd2 = Util.checkString(req.getParameter("fr_budg_cd2"));
		dm.to_budg_cd2 = Util.checkString(req.getParameter("to_budg_cd2"));
		dm.slip_clsf_cd2 = Util.checkString(req.getParameter("slip_clsf_cd2"));
		dm.budg_clsf_cd2 = Util.checkString(req.getParameter("budg_clsf_cd2"));
		dm.conn_clsf_cd2 = Util.checkString(req.getParameter("conn_clsf_cd2"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_2641_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
	}
	
	public void fc_acct_2642_u(HttpServletRequest req, HttpServletResponse res) throws AppException {
		FC_ACCT_2642_UDataSet ds = null;
		FC_ACCT_2642_UDM dm = new FC_ACCT_2642_UDM();

		dm.cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
		dm.fr_fisc_dt = Util.checkString(req.getParameter("fr_fisc_dt"));
		dm.to_fisc_dt = Util.checkString(req.getParameter("to_fisc_dt"));
		dm.conn_cmpy_cd1 = Util.checkString(req.getParameter("conn_cmpy_cd1"));
		dm.data_list1 = Util.checkString(req.getParameter("data_list1"));
		dm.conn_cmpy_cd2 = Util.checkString(req.getParameter("conn_cmpy_cd2"));
		dm.data_list2 = Util.checkString(req.getParameter("data_list2"));
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_2642_UDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		
		req.setAttribute("ds", ds);
	}
	
	public void fc_acct_2651_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		FC_ACCT_2651_LDataSet ds = null;
		FC_ACCT_2651_LDM dm = new FC_ACCT_2651_LDM();

		dm.cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
		dm.fisc_mm_fr = Util.checkString(req.getParameter("fisc_mm_fr"));
		dm.fisc_mm_to = Util.checkString(req.getParameter("fisc_mm_to"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_2651_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		
		req.setAttribute("ds", ds);
	}
	
	public void fc_acct_2652_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		FC_ACCT_2652_ADataSet ds = null;
		FC_ACCT_2652_ADM dm = new FC_ACCT_2652_ADM();

		dm.cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
		dm.fisc_yymm = Util.checkString(req.getParameter("fisc_mm"));
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_2652_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		
		req.setAttribute("ds", ds);
	}

	public void fc_acct_2700_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		FC_ACCT_2700_LDataSet ds = null;
		FC_ACCT_2700_LDM dm = new FC_ACCT_2700_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.fisc_dt = Util.checkString(req.getParameter("fisc_dt"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_2700_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.acct_type_cd = (String)hash.get("acct_type_cd");
		dm.search_yymm = (String)hash.get("search_yymm");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.acct_type_cd = Util.getSessionParameterValue(req,"acct_type_cd",true);
		dm.search_yymm = Util.getSessionParameterValue(req,"search_yymm",true);
		*******************************************************************************************/
	}
}

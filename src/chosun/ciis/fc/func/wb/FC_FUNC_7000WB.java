 package chosun.ciis.fc.func.wb;

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

import chosun.ciis.fc.func.dm.*;
import chosun.ciis.fc.func.ds.*;

public class FC_FUNC_7000WB extends chosun.ciis.co.base.wb.BaseWB {
	public void getDummyList(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_9999_LDataSet ds = null;
		FC_FUNC_9999_LDM dm = new FC_FUNC_9999_LDM();
		
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_9999_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_FUNC_7000EJBHome home = (FC_FUNC_7000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_7000EJB");
			FC_FUNC_7000EJB ejb = home.create();
			ds = ejb.getDummyList(dm);
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
		
	}
	public void fc_func_7000_m(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_7000_MDataSet ds = null;
		FC_FUNC_7000_MDM dm = new FC_FUNC_7000_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_7000_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_FUNC_7000EJBHome home = (FC_FUNC_7000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_7000EJB");
			FC_FUNC_7000EJB ejb = home.create();

			ds = ejb.fc_func_7000_m(dm);
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
	public void fc_func_7001_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_7001_LDataSet ds = null;
		FC_FUNC_7001_LDM dm = new FC_FUNC_7001_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.fund_mang_no = Util.checkString(req.getParameter("fund_mang_no"));
		dm.loan_no = Util.checkString(req.getParameter("loan_no"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_7001_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_FUNC_7000EJBHome home = (FC_FUNC_7000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_7000EJB");
			FC_FUNC_7000EJB ejb = home.create();

			ds = ejb.fc_func_7001_l(dm);
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
		dm.fund_mang_no = (String)hash.get("fund_mang_no");
		dm.loan_no = (String)hash.get("loan_no");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.fund_mang_no = Util.getSessionParameterValue(req,"fund_mang_no",true);
		dm.loan_no = Util.getSessionParameterValue(req,"loan_no",true);
		*******************************************************************************************/
	}
	public void fc_func_7002_i(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_7002_IDataSet ds = null;
		FC_FUNC_7002_IDM dm = new FC_FUNC_7002_IDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.fund_mang_no = Util.checkString(req.getParameter("fund_mang_no"));
		dm.loan_no = Util.checkString(req.getParameter("loan_no"));
		dm.loan_nm = Util.checkString(req.getParameter("loan_nm"));
		dm.loan_amt = Util.checkString(req.getParameter("loan_amt"));
		dm.comp_dt = Util.checkString(req.getParameter("comp_dt"));
		dm.mtry_dt = Util.checkString(req.getParameter("mtry_dt"));
		dm.loan_repay_clsf_cd = Util.checkString(req.getParameter("loan_repay_clsf_cd"));
		dm.int_clsf_cd = Util.checkString(req.getParameter("int_clsf_cd"));
		dm.dlco_clsf_cd = Util.checkString(req.getParameter("dlco_clsf_cd"));
		dm.dlco_cd = Util.checkString(req.getParameter("dlco_cd"));
		dm.loan_patr_budg_cd = Util.checkString(req.getParameter("loan_patr_budg_cd"));
		dm.loan_deps_clsf_cd = Util.checkString(req.getParameter("loan_deps_clsf_cd"));
		dm.colt_note_no = Util.checkString(req.getParameter("colt_note_no"));
		dm.loan_rmks = Util.checkString(req.getParameter("loan_rmks"));
		dm.prelae_pay_clsf_cd = Util.checkString(req.getParameter("prelae_pay_clsf_cd"));
		dm.incmg_pers =Util.getSessionParameterValue(req,"emp_no",true);
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		dm.misfnc_dlco_nm = Util.checkString(req.getParameter("misfnc_dlco_nm"));
		dm.int_rate = Util.checkString(req.getParameter("int_rate"));
		dm.use_dept_cd = Util.getSessionParameterValue(req,"deptcd",true);
		dm.igamt = Util.checkString(req.getParameter("igamt"));
		dm.sgiamt = Util.checkString(req.getParameter("sgiamt"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_7002_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_FUNC_7000EJBHome home = (FC_FUNC_7000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_7000EJB");
			FC_FUNC_7000EJB ejb = home.create();

			ds = ejb.fc_func_7002_i(dm);
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
		dm.fund_mang_no = (String)hash.get("fund_mang_no");
		dm.loan_no = (String)hash.get("loan_no");
		dm.loan_nm = (String)hash.get("loan_nm");
		dm.loan_amt = (String)hash.get("loan_amt");
		dm.comp_dt = (String)hash.get("comp_dt");
		dm.mtry_dt = (String)hash.get("mtry_dt");
		dm.loan_repay_clsf_cd = (String)hash.get("loan_repay_clsf_cd");
		dm.int_clsf_cd = (String)hash.get("int_clsf_cd");
		dm.dlco_clsf_cd = (String)hash.get("dlco_clsf_cd");
		dm.dlco_cd = (String)hash.get("dlco_cd");
		dm.loan_patr_budg_cd = (String)hash.get("loan_patr_budg_cd");
		dm.loan_deps_clsf_cd = (String)hash.get("loan_deps_clsf_cd");
		dm.colt_note_no = (String)hash.get("colt_note_no");
		dm.loan_rmks = (String)hash.get("loan_rmks");
		dm.prelae_pay_clsf_cd = (String)hash.get("prelae_pay_clsf_cd");
		dm.incmg_pers = (String)hash.get("incmg_pers");
		dm.incmg_pers_ipadd = (String)hash.get("incmg_pers_ipadd");
		dm.misfnc_dlco_nm = (String)hash.get("misfnc_dlco_nm");
		dm.int_rate = (String)hash.get("int_rate");
		dm.use_dept_cd = (String)hash.get("use_dept_cd");
		dm.igamt = (String)hash.get("igamt");
		dm.sgiamt = (String)hash.get("sgiamt");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.fund_mang_no = Util.getSessionParameterValue(req,"fund_mang_no",true);
		dm.loan_no = Util.getSessionParameterValue(req,"loan_no",true);
		dm.loan_nm = Util.getSessionParameterValue(req,"loan_nm",true);
		dm.loan_amt = Util.getSessionParameterValue(req,"loan_amt",true);
		dm.comp_dt = Util.getSessionParameterValue(req,"comp_dt",true);
		dm.mtry_dt = Util.getSessionParameterValue(req,"mtry_dt",true);
		dm.loan_repay_clsf_cd = Util.getSessionParameterValue(req,"loan_repay_clsf_cd",true);
		dm.int_clsf_cd = Util.getSessionParameterValue(req,"int_clsf_cd",true);
		dm.dlco_clsf_cd = Util.getSessionParameterValue(req,"dlco_clsf_cd",true);
		dm.dlco_cd = Util.getSessionParameterValue(req,"dlco_cd",true);
		dm.loan_patr_budg_cd = Util.getSessionParameterValue(req,"loan_patr_budg_cd",true);
		dm.loan_deps_clsf_cd = Util.getSessionParameterValue(req,"loan_deps_clsf_cd",true);
		dm.colt_note_no = Util.getSessionParameterValue(req,"colt_note_no",true);
		dm.loan_rmks = Util.getSessionParameterValue(req,"loan_rmks",true);
		dm.prelae_pay_clsf_cd = Util.getSessionParameterValue(req,"prelae_pay_clsf_cd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"incmg_pers",true);
		dm.incmg_pers_ipadd = Util.getSessionParameterValue(req,"incmg_pers_ipadd",true);
		dm.misfnc_dlco_nm = Util.getSessionParameterValue(req,"misfnc_dlco_nm",true);
		dm.int_rate = Util.getSessionParameterValue(req,"int_rate",true);
		dm.use_dept_cd = Util.getSessionParameterValue(req,"use_dept_cd",true);
		dm.igamt = Util.getSessionParameterValue(req,"igamt",true);
		dm.sgiamt = Util.getSessionParameterValue(req,"sgiamt",true);
		*******************************************************************************************/
	}
	public void fc_func_7003_u(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_7003_UDataSet ds = null;
		FC_FUNC_7003_UDM dm = new FC_FUNC_7003_UDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.fund_mang_no = Util.checkString(req.getParameter("fund_mang_no"));
		dm.loan_no = Util.checkString(req.getParameter("loan_no"));
		dm.loan_nm = Util.checkString(req.getParameter("loan_nm"));
		dm.loan_amt = Util.checkString(req.getParameter("loan_amt"));
		dm.comp_dt = Util.checkString(req.getParameter("comp_dt"));
		dm.mtry_dt = Util.checkString(req.getParameter("mtry_dt"));
		dm.loan_repay_clsf_cd = Util.checkString(req.getParameter("loan_repay_clsf_cd"));
		dm.int_clsf_cd = Util.checkString(req.getParameter("int_clsf_cd"));
		dm.dlco_clsf_cd = Util.checkString(req.getParameter("dlco_clsf_cd"));
		dm.dlco_cd = Util.checkString(req.getParameter("dlco_cd"));
		dm.loan_patr_budg_cd = Util.checkString(req.getParameter("loan_patr_budg_cd"));
		dm.loan_deps_clsf_cd = Util.checkString(req.getParameter("loan_deps_clsf_cd"));
		dm.colt_note_no = Util.checkString(req.getParameter("colt_note_no"));
		dm.loan_rmks = Util.checkString(req.getParameter("loan_rmks"));
		dm.prelae_pay_clsf_cd = Util.checkString(req.getParameter("prelae_pay_clsf_cd"));
		dm.incmg_pers =Util.getSessionParameterValue(req,"emp_no",true);
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		dm.misfnc_dlco_nm = Util.checkString(req.getParameter("misfnc_dlco_nm"));
		dm.int_rate = Util.checkString(req.getParameter("int_rate"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_7003_UDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_FUNC_7000EJBHome home = (FC_FUNC_7000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_7000EJB");
			FC_FUNC_7000EJB ejb = home.create();

			ds = ejb.fc_func_7003_u(dm);
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
		dm.fund_mang_no = (String)hash.get("fund_mang_no");
		dm.loan_no = (String)hash.get("loan_no");
		dm.loan_nm = (String)hash.get("loan_nm");
		dm.loan_amt = (String)hash.get("loan_amt");
		dm.comp_dt = (String)hash.get("comp_dt");
		dm.mtry_dt = (String)hash.get("mtry_dt");
		dm.loan_repay_clsf_cd = (String)hash.get("loan_repay_clsf_cd");
		dm.int_clsf_cd = (String)hash.get("int_clsf_cd");
		dm.dlco_clsf_cd = (String)hash.get("dlco_clsf_cd");
		dm.dlco_cd = (String)hash.get("dlco_cd");
		dm.loan_patr_budg_cd = (String)hash.get("loan_patr_budg_cd");
		dm.loan_deps_clsf_cd = (String)hash.get("loan_deps_clsf_cd");
		dm.colt_note_no = (String)hash.get("colt_note_no");
		dm.loan_rmks = (String)hash.get("loan_rmks");
		dm.prelae_pay_clsf_cd = (String)hash.get("prelae_pay_clsf_cd");
		dm.incmg_pers = (String)hash.get("incmg_pers");
		dm.incmg_pers_ipadd = (String)hash.get("incmg_pers_ipadd");
		dm.misfnc_dlco_nm = (String)hash.get("misfnc_dlco_nm");
		dm.int_rate = (String)hash.get("int_rate");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.fund_mang_no = Util.getSessionParameterValue(req,"fund_mang_no",true);
		dm.loan_no = Util.getSessionParameterValue(req,"loan_no",true);
		dm.loan_nm = Util.getSessionParameterValue(req,"loan_nm",true);
		dm.loan_amt = Util.getSessionParameterValue(req,"loan_amt",true);
		dm.comp_dt = Util.getSessionParameterValue(req,"comp_dt",true);
		dm.mtry_dt = Util.getSessionParameterValue(req,"mtry_dt",true);
		dm.loan_repay_clsf_cd = Util.getSessionParameterValue(req,"loan_repay_clsf_cd",true);
		dm.int_clsf_cd = Util.getSessionParameterValue(req,"int_clsf_cd",true);
		dm.dlco_clsf_cd = Util.getSessionParameterValue(req,"dlco_clsf_cd",true);
		dm.dlco_cd = Util.getSessionParameterValue(req,"dlco_cd",true);
		dm.loan_patr_budg_cd = Util.getSessionParameterValue(req,"loan_patr_budg_cd",true);
		dm.loan_deps_clsf_cd = Util.getSessionParameterValue(req,"loan_deps_clsf_cd",true);
		dm.colt_note_no = Util.getSessionParameterValue(req,"colt_note_no",true);
		dm.loan_rmks = Util.getSessionParameterValue(req,"loan_rmks",true);
		dm.prelae_pay_clsf_cd = Util.getSessionParameterValue(req,"prelae_pay_clsf_cd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"incmg_pers",true);
		dm.incmg_pers_ipadd = Util.getSessionParameterValue(req,"incmg_pers_ipadd",true);
		dm.misfnc_dlco_nm = Util.getSessionParameterValue(req,"misfnc_dlco_nm",true);
		dm.int_rate = Util.getSessionParameterValue(req,"int_rate",true);
		*******************************************************************************************/
	}
	public void fc_func_7004_d(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_7004_DDataSet ds = null;
		FC_FUNC_7004_DDM dm = new FC_FUNC_7004_DDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.fund_mang_no = Util.checkString(req.getParameter("fund_mang_no"));
		dm.loan_no = Util.checkString(req.getParameter("loan_no"));
		dm.incmg_pers =Util.getSessionParameterValue(req,"emp_no",true);
		dm.incmg_pers_ipadd = req.getRemoteAddr();

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_7004_DDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_FUNC_7000EJBHome home = (FC_FUNC_7000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_7000EJB");
			FC_FUNC_7000EJB ejb = home.create();

			ds = ejb.fc_func_7004_d(dm);
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
		dm.fund_mang_no = (String)hash.get("fund_mang_no");
		dm.loan_no = (String)hash.get("loan_no");
		dm.incmg_pers = (String)hash.get("incmg_pers");
		dm.incmg_pers_ipadd = (String)hash.get("incmg_pers_ipadd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.fund_mang_no = Util.getSessionParameterValue(req,"fund_mang_no",true);
		dm.loan_no = Util.getSessionParameterValue(req,"loan_no",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"incmg_pers",true);
		dm.incmg_pers_ipadd = Util.getSessionParameterValue(req,"incmg_pers_ipadd",true);
		*******************************************************************************************/
	}
	public void fc_func_7010_m(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_7010_MDataSet ds = null;
		FC_FUNC_7010_MDM dm = new FC_FUNC_7010_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_7010_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_FUNC_7000EJBHome home = (FC_FUNC_7000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_7000EJB");
			FC_FUNC_7000EJB ejb = home.create();

			ds = ejb.fc_func_7010_m(dm);
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
	public void fc_func_7011_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_7011_LDataSet ds = null;
		FC_FUNC_7011_LDM dm = new FC_FUNC_7011_LDM();
		
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.fund_mang_no = Util.checkString(req.getParameter("fund_mang_no"));
		dm.loan_no = Util.checkString(req.getParameter("loan_no"));
			
		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_7011_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_FUNC_7000EJBHome home = (FC_FUNC_7000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_7000EJB");
			FC_FUNC_7000EJB ejb = home.create();
			ds = ejb.fc_func_7011_l(dm);
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
		
	}	
	public void fc_func_7012_i(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_7012_IDataSet ds = null;
		FC_FUNC_7012_IDM dm = new FC_FUNC_7012_IDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.fund_mang_no = Util.checkString(req.getParameter("fund_mang_no"));
		dm.loan_no = Util.checkString(req.getParameter("loan_no"));
		dm.int_rate_chg_dt = Util.checkString(req.getParameter("int_rate_chg_dt"));
		dm.int_rate = Util.checkString(req.getParameter("int_rate"));
		dm.incmg_pers =Util.getSessionParameterValue(req,"emp_no",true);
		dm.incmg_pers_ipadd = req.getRemoteAddr();

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_7012_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_FUNC_7000EJBHome home = (FC_FUNC_7000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_7000EJB");
			FC_FUNC_7000EJB ejb = home.create();

			ds = ejb.fc_func_7012_i(dm);
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
		dm.fund_mang_no = (String)hash.get("fund_mang_no");
		dm.loan_no = (String)hash.get("loan_no");
		dm.int_rate_chg_dt = (String)hash.get("int_rate_chg_dt");
		dm.int_rate = (String)hash.get("int_rate");
		dm.incmg_pers = (String)hash.get("incmg_pers");
		dm.incmg_pers_ipadd = (String)hash.get("incmg_pers_ipadd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.fund_mang_no = Util.getSessionParameterValue(req,"fund_mang_no",true);
		dm.loan_no = Util.getSessionParameterValue(req,"loan_no",true);
		dm.int_rate_chg_dt = Util.getSessionParameterValue(req,"int_rate_chg_dt",true);
		dm.int_rate = Util.getSessionParameterValue(req,"int_rate",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"incmg_pers",true);
		dm.incmg_pers_ipadd = Util.getSessionParameterValue(req,"incmg_pers_ipadd",true);
		*******************************************************************************************/
	}
	public void fc_func_7013_u(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_7013_UDataSet ds = null;
		FC_FUNC_7013_UDM dm = new FC_FUNC_7013_UDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.fund_mang_no = Util.checkString(req.getParameter("fund_mang_no"));
		dm.loan_no = Util.checkString(req.getParameter("loan_no"));
		dm.int_rate_chg_dt = Util.checkString(req.getParameter("int_rate_chg_dt"));
		dm.int_rate = Util.checkString(req.getParameter("int_rate"));
		dm.incmg_pers =Util.getSessionParameterValue(req,"emp_no",true);
		dm.incmg_pers_ipadd = req.getRemoteAddr();

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_7013_UDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_FUNC_7000EJBHome home = (FC_FUNC_7000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_7000EJB");
			FC_FUNC_7000EJB ejb = home.create();

			ds = ejb.fc_func_7013_u(dm);
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
		dm.fund_mang_no = (String)hash.get("fund_mang_no");
		dm.loan_no = (String)hash.get("loan_no");
		dm.int_rate_chg_dt = (String)hash.get("int_rate_chg_dt");
		dm.int_rate = (String)hash.get("int_rate");
		dm.incmg_pers = (String)hash.get("incmg_pers");
		dm.incmg_pers_ipadd = (String)hash.get("incmg_pers_ipadd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.fund_mang_no = Util.getSessionParameterValue(req,"fund_mang_no",true);
		dm.loan_no = Util.getSessionParameterValue(req,"loan_no",true);
		dm.int_rate_chg_dt = Util.getSessionParameterValue(req,"int_rate_chg_dt",true);
		dm.int_rate = Util.getSessionParameterValue(req,"int_rate",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"incmg_pers",true);
		dm.incmg_pers_ipadd = Util.getSessionParameterValue(req,"incmg_pers_ipadd",true);
		*******************************************************************************************/
	}
	public void fc_func_7014_d(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_7014_DDataSet ds = null;
		FC_FUNC_7014_DDM dm = new FC_FUNC_7014_DDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.fund_mang_no = Util.checkString(req.getParameter("fund_mang_no"));
		dm.loan_no = Util.checkString(req.getParameter("loan_no"));
		dm.int_rate_chg_dt = Util.checkString(req.getParameter("int_rate_chg_dt"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_7014_DDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_FUNC_7000EJBHome home = (FC_FUNC_7000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_7000EJB");
			FC_FUNC_7000EJB ejb = home.create();

			ds = ejb.fc_func_7014_d(dm);
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
		dm.fund_mang_no = (String)hash.get("fund_mang_no");
		dm.loan_no = (String)hash.get("loan_no");
		dm.int_rate_chg_dt = (String)hash.get("int_rate_chg_dt");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.fund_mang_no = Util.getSessionParameterValue(req,"fund_mang_no",true);
		dm.loan_no = Util.getSessionParameterValue(req,"loan_no",true);
		dm.int_rate_chg_dt = Util.getSessionParameterValue(req,"int_rate_chg_dt",true);
		*******************************************************************************************/
	}
	public void fc_func_7020_m(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_7020_MDataSet ds = null;
		FC_FUNC_7020_MDM dm = new FC_FUNC_7020_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_7020_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_FUNC_7000EJBHome home = (FC_FUNC_7000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_7000EJB");
			FC_FUNC_7000EJB ejb = home.create();

			ds = ejb.fc_func_7020_m(dm);
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
	public void fc_func_7021_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_7021_LDataSet ds = null;
		FC_FUNC_7021_LDM dm = new FC_FUNC_7021_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.fund_mang_no = Util.checkString(req.getParameter("fund_mang_no"));
		dm.loan_no = Util.checkString(req.getParameter("loan_no"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_7021_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_FUNC_7000EJBHome home = (FC_FUNC_7000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_7000EJB");
			FC_FUNC_7000EJB ejb = home.create();

			ds = ejb.fc_func_7021_l(dm);
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
		dm.fund_mang_no = (String)hash.get("fund_mang_no");
		dm.loan_no = (String)hash.get("loan_no");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.fund_mang_no = Util.getSessionParameterValue(req,"fund_mang_no",true);
		dm.loan_no = Util.getSessionParameterValue(req,"loan_no",true);
		*******************************************************************************************/
	}
	public void fc_func_7022_i(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_7022_IDataSet ds = null;
		FC_FUNC_7022_IDM dm = new FC_FUNC_7022_IDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.fund_mang_no = Util.checkString(req.getParameter("fund_mang_no"));
		dm.loan_no = Util.checkString(req.getParameter("loan_no"));
		dm.repay_dt = Util.checkString(req.getParameter("repay_dt"));
		dm.repay_amt = Util.checkString(req.getParameter("repay_amt"));
		dm.repay_rmks = Util.checkString(req.getParameter("repay_rmks"));
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		dm.use_dept_cd = Util.getSessionParameterValue(req,"deptcd",true);
		dm.repay_slip_occr_dt = Util.checkString(req.getParameter("repay_slip_occr_dt"));
		dm.repay_slip_clsf_cd = Util.checkString(req.getParameter("repay_slip_clsf_cd"));
		dm.repay_slip_seq = Util.checkString(req.getParameter("repay_slip_seq"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_7022_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_FUNC_7000EJBHome home = (FC_FUNC_7000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_7000EJB");
			FC_FUNC_7000EJB ejb = home.create();

			ds = ejb.fc_func_7022_i(dm);
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
		dm.fund_mang_no = (String)hash.get("fund_mang_no");
		dm.loan_no = (String)hash.get("loan_no");
		dm.repay_dt = (String)hash.get("repay_dt");
		dm.repay_amt = (String)hash.get("repay_amt");
		dm.repay_rmks = (String)hash.get("repay_rmks");
		dm.incmg_pers = (String)hash.get("incmg_pers");
		dm.incmg_pers_ipadd = (String)hash.get("incmg_pers_ipadd");
		dm.use_dept_cd = (String)hash.get("use_dept_cd");
		dm.repay_slip_occr_dt = (String)hash.get("repay_slip_occr_dt");
		dm.repay_slip_clsf_cd = (String)hash.get("repay_slip_clsf_cd");
		dm.repay_slip_seq = (String)hash.get("repay_slip_seq");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.fund_mang_no = Util.getSessionParameterValue(req,"fund_mang_no",true);
		dm.loan_no = Util.getSessionParameterValue(req,"loan_no",true);
		dm.repay_dt = Util.getSessionParameterValue(req,"repay_dt",true);
		dm.repay_amt = Util.getSessionParameterValue(req,"repay_amt",true);
		dm.repay_rmks = Util.getSessionParameterValue(req,"repay_rmks",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"incmg_pers",true);
		dm.incmg_pers_ipadd = Util.getSessionParameterValue(req,"incmg_pers_ipadd",true);
		dm.use_dept_cd = Util.getSessionParameterValue(req,"use_dept_cd",true);
		dm.repay_slip_occr_dt = Util.getSessionParameterValue(req,"repay_slip_occr_dt",true);
		dm.repay_slip_clsf_cd = Util.getSessionParameterValue(req,"repay_slip_clsf_cd",true);
		dm.repay_slip_seq = Util.getSessionParameterValue(req,"repay_slip_seq",true);
		*******************************************************************************************/
	}
	public void fc_func_7023_d(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_7023_DDataSet ds = null;
		FC_FUNC_7023_DDM dm = new FC_FUNC_7023_DDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.fund_mang_no = Util.checkString(req.getParameter("fund_mang_no"));
		dm.loan_no = Util.checkString(req.getParameter("loan_no"));
		dm.incmg_pers =Util.getSessionParameterValue(req,"emp_no",true);
		dm.incmg_pers_ipadd = req.getRemoteAddr();

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_7023_DDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_FUNC_7000EJBHome home = (FC_FUNC_7000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_7000EJB");
			FC_FUNC_7000EJB ejb = home.create();

			ds = ejb.fc_func_7023_d(dm);
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
		dm.fund_mang_no = (String)hash.get("fund_mang_no");
		dm.loan_no = (String)hash.get("loan_no");
		dm.incmg_pers = (String)hash.get("incmg_pers");
		dm.incmg_pers_ipadd = (String)hash.get("incmg_pers_ipadd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.fund_mang_no = Util.getSessionParameterValue(req,"fund_mang_no",true);
		dm.loan_no = Util.getSessionParameterValue(req,"loan_no",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"incmg_pers",true);
		dm.incmg_pers_ipadd = Util.getSessionParameterValue(req,"incmg_pers_ipadd",true);
		*******************************************************************************************/
	}
	public void fc_func_7040_m(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_7040_MDataSet ds = null;
		FC_FUNC_7040_MDM dm = new FC_FUNC_7040_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.recp_dt = Util.checkString(req.getParameter("recp_dt"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_7040_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_FUNC_7000EJBHome home = (FC_FUNC_7000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_7000EJB");
			FC_FUNC_7000EJB ejb = home.create();

			ds = ejb.fc_func_7040_m(dm);
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
		dm.recp_dt = (String)hash.get("recp_dt");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.recp_dt = Util.getSessionParameterValue(req,"recp_dt",true);
		*******************************************************************************************/
	}
	public void fc_func_7041_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_7041_LDataSet ds = null;
		FC_FUNC_7041_LDM dm = new FC_FUNC_7041_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.date = Util.checkString(req.getParameter("date"));
		dm.fund_mang_no = Util.checkString(req.getParameter("fund_mang_no"));
		dm.dlco_clsf_cd = Util.checkString(req.getParameter("dlco_clsf_cd"));
		dm.dlco_cd = Util.checkString(req.getParameter("dlco_cd"));
		dm.comp_dt_fr = Util.checkString(req.getParameter("comp_dt_fr"));
		dm.comp_dt_to = Util.checkString(req.getParameter("comp_dt_to"));
		dm.mtry_dt_fr = Util.checkString(req.getParameter("mtry_dt_fr"));
		dm.mtry_dt_to = Util.checkString(req.getParameter("mtry_dt_to"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_7041_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_FUNC_7000EJBHome home = (FC_FUNC_7000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_7000EJB");
			FC_FUNC_7000EJB ejb = home.create();

			ds = ejb.fc_func_7041_l(dm);
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
		dm.date = (String)hash.get("date");
		dm.fund_mang_no = (String)hash.get("fund_mang_no");
		dm.dlco_clsf_cd = (String)hash.get("dlco_clsf_cd");
		dm.dlco_cd = (String)hash.get("dlco_cd");
		dm.comp_dt_fr = (String)hash.get("comp_dt_fr");
		dm.comp_dt_to = (String)hash.get("comp_dt_to");
		dm.mtry_dt_fr = (String)hash.get("mtry_dt_fr");
		dm.mtry_dt_to = (String)hash.get("mtry_dt_to");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.date = Util.getSessionParameterValue(req,"date",true);
		dm.fund_mang_no = Util.getSessionParameterValue(req,"fund_mang_no",true);
		dm.dlco_clsf_cd = Util.getSessionParameterValue(req,"dlco_clsf_cd",true);
		dm.dlco_cd = Util.getSessionParameterValue(req,"dlco_cd",true);
		dm.comp_dt_fr = Util.getSessionParameterValue(req,"comp_dt_fr",true);
		dm.comp_dt_to = Util.getSessionParameterValue(req,"comp_dt_to",true);
		dm.mtry_dt_fr = Util.getSessionParameterValue(req,"mtry_dt_fr",true);
		dm.mtry_dt_to = Util.getSessionParameterValue(req,"mtry_dt_to",true);
		*******************************************************************************************/
	}
	public void fc_func_7030_m(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_7030_MDataSet ds = null;
		FC_FUNC_7030_MDM dm = new FC_FUNC_7030_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_7030_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_FUNC_7000EJBHome home = (FC_FUNC_7000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_7000EJB");
			FC_FUNC_7000EJB ejb = home.create();

			ds = ejb.fc_func_7030_m(dm);
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
	public void fc_func_7031_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_7031_LDataSet ds = null;
		FC_FUNC_7031_LDM dm = new FC_FUNC_7031_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.fund_mang_no = Util.checkString(req.getParameter("fund_mang_no"));
		dm.loan_no = Util.checkString(req.getParameter("loan_no"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_7031_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_FUNC_7000EJBHome home = (FC_FUNC_7000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_7000EJB");
			FC_FUNC_7000EJB ejb = home.create();

			ds = ejb.fc_func_7031_l(dm);
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
		dm.fund_mang_no = (String)hash.get("fund_mang_no");
		dm.loan_no = (String)hash.get("loan_no");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.fund_mang_no = Util.getSessionParameterValue(req,"fund_mang_no",true);
		dm.loan_no = Util.getSessionParameterValue(req,"loan_no",true);
		*******************************************************************************************/
	}
	public void fc_func_7034_e(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_7034_EDataSet ds = null;
		FC_FUNC_7034_EDM dm = new FC_FUNC_7034_EDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.fund_mang_no = Util.checkString(req.getParameter("fund_mang_no"));
		dm.loan_no = Util.checkString(req.getParameter("loan_no"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_7034_EDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_FUNC_7000EJBHome home = (FC_FUNC_7000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_7000EJB");
			FC_FUNC_7000EJB ejb = home.create();

			ds = ejb.fc_func_7034_e(dm);
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
		dm.fund_mang_no = (String)hash.get("fund_mang_no");
		dm.loan_no = (String)hash.get("loan_no");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.fund_mang_no = Util.getSessionParameterValue(req,"fund_mang_no",true);
		dm.loan_no = Util.getSessionParameterValue(req,"loan_no",true);
		*******************************************************************************************/
	}
	public void fc_func_7035_e(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_7035_EDataSet ds = null;
		FC_FUNC_7035_EDM dm = new FC_FUNC_7035_EDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.fund_mang_no = Util.checkString(req.getParameter("fund_mang_no"));
		dm.loan_no = Util.checkString(req.getParameter("loan_no"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_7035_EDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_FUNC_7000EJBHome home = (FC_FUNC_7000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_7000EJB");
			FC_FUNC_7000EJB ejb = home.create();

			ds = ejb.fc_func_7035_e(dm);
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
		dm.fund_mang_no = (String)hash.get("fund_mang_no");
		dm.loan_no = (String)hash.get("loan_no");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.fund_mang_no = Util.getSessionParameterValue(req,"fund_mang_no",true);
		dm.loan_no = Util.getSessionParameterValue(req,"loan_no",true);
		*******************************************************************************************/
	}
	public void fc_func_7032_i(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_7032_IDataSet ds = null;
		FC_FUNC_7032_IDM dm = new FC_FUNC_7032_IDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.fund_mang_no = Util.checkString(req.getParameter("fund_mang_no"));
		dm.loan_no = Util.checkString(req.getParameter("loan_no"));
		dm.pay_dt = Util.checkString(req.getParameter("pay_dt"));
		dm.comp_dt = Util.checkString(req.getParameter("comp_dt"));
		dm.mtry_dt = Util.checkString(req.getParameter("mtry_dt"));
		dm.int_rate = Util.checkString(req.getParameter("int_rate"));
		dm.int_amt = Util.checkString(req.getParameter("int_amt"));
		dm.rmks = Util.checkString(req.getParameter("rmks"));
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		dm.use_dept_cd = Util.getSessionParameterValue(req,"deptcd",true);
		dm.patr_budg_cd = Util.checkString(req.getParameter("patr_budg_cd"));
		dm.deps_clsf_cd = Util.checkString(req.getParameter("deps_clsf_cd"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_7032_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_FUNC_7000EJBHome home = (FC_FUNC_7000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_7000EJB");
			FC_FUNC_7000EJB ejb = home.create();

			ds = ejb.fc_func_7032_i(dm);
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
		dm.fund_mang_no = (String)hash.get("fund_mang_no");
		dm.loan_no = (String)hash.get("loan_no");
		dm.pay_dt = (String)hash.get("pay_dt");
		dm.comp_dt = (String)hash.get("comp_dt");
		dm.mtry_dt = (String)hash.get("mtry_dt");
		dm.int_rate = (String)hash.get("int_rate");
		dm.int_amt = (String)hash.get("int_amt");
		dm.rmks = (String)hash.get("rmks");
		dm.incmg_pers = (String)hash.get("incmg_pers");
		dm.incmg_pers_ipadd = (String)hash.get("incmg_pers_ipadd");
		dm.use_dept_cd = (String)hash.get("use_dept_cd");
		dm.part_budg_cd = (String)hash.get("part_budg_cd");
		dm.deps_clsf_cd = (String)hash.get("deps_clsf_cd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.fund_mang_no = Util.getSessionParameterValue(req,"fund_mang_no",true);
		dm.loan_no = Util.getSessionParameterValue(req,"loan_no",true);
		dm.pay_dt = Util.getSessionParameterValue(req,"pay_dt",true);
		dm.comp_dt = Util.getSessionParameterValue(req,"comp_dt",true);
		dm.mtry_dt = Util.getSessionParameterValue(req,"mtry_dt",true);
		dm.int_rate = Util.getSessionParameterValue(req,"int_rate",true);
		dm.int_amt = Util.getSessionParameterValue(req,"int_amt",true);
		dm.rmks = Util.getSessionParameterValue(req,"rmks",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"incmg_pers",true);
		dm.incmg_pers_ipadd = Util.getSessionParameterValue(req,"incmg_pers_ipadd",true);
		dm.use_dept_cd = Util.getSessionParameterValue(req,"use_dept_cd",true);
		dm.part_budg_cd = Util.getSessionParameterValue(req,"part_budg_cd",true);
		dm.deps_clsf_cd = Util.getSessionParameterValue(req,"deps_clsf_cd",true);
		*******************************************************************************************/
	}
	public void fc_func_7033_d(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_7033_DDataSet ds = null;
		FC_FUNC_7033_DDM dm = new FC_FUNC_7033_DDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.fund_mang_no = Util.checkString(req.getParameter("fund_mang_no"));
		dm.loan_no = Util.checkString(req.getParameter("loan_no"));
		dm.pay_dt = Util.checkString(req.getParameter("pay_dt"));
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.incmg_pers_ipadd = req.getRemoteAddr();

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_7033_DDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_FUNC_7000EJBHome home = (FC_FUNC_7000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_7000EJB");
			FC_FUNC_7000EJB ejb = home.create();

			ds = ejb.fc_func_7033_d(dm);
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
		dm.fund_mang_no = (String)hash.get("fund_mang_no");
		dm.loan_no = (String)hash.get("loan_no");
		dm.pay_dt = (String)hash.get("pay_dt");
		dm.incmg_pers = (String)hash.get("incmg_pers");
		dm.incmg_pers_ipadd = (String)hash.get("incmg_pers_ipadd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.fund_mang_no = Util.getSessionParameterValue(req,"fund_mang_no",true);
		dm.loan_no = Util.getSessionParameterValue(req,"loan_no",true);
		dm.pay_dt = Util.getSessionParameterValue(req,"pay_dt",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"incmg_pers",true);
		dm.incmg_pers_ipadd = Util.getSessionParameterValue(req,"incmg_pers_ipadd",true);
		*******************************************************************************************/
	}
	public void fc_func_7070_m(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_7070_MDataSet ds = null;
		FC_FUNC_7070_MDM dm = new FC_FUNC_7070_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_7070_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_FUNC_7000EJBHome home = (FC_FUNC_7000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_7000EJB");
			FC_FUNC_7000EJB ejb = home.create();

			ds = ejb.fc_func_7070_m(dm);
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
	public void fc_func_7071_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_7071_LDataSet ds = null;
		FC_FUNC_7071_LDM dm = new FC_FUNC_7071_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.fund_mang_no = Util.checkString(req.getParameter("fund_mang_no"));
		dm.loan_no_fr = Util.checkString(req.getParameter("loan_no_fr"));
		dm.loan_no_to = Util.checkString(req.getParameter("loan_no_to"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_7071_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_FUNC_7000EJBHome home = (FC_FUNC_7000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_7000EJB");
			FC_FUNC_7000EJB ejb = home.create();

			ds = ejb.fc_func_7071_l(dm);
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
		dm.fund_mang_no = (String)hash.get("fund_mang_no");
		dm.loan_no_fr = (String)hash.get("loan_no_fr");
		dm.loan_no_to = (String)hash.get("loan_no_to");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.fund_mang_no = Util.getSessionParameterValue(req,"fund_mang_no",true);
		dm.loan_no_fr = Util.getSessionParameterValue(req,"loan_no_fr",true);
		dm.loan_no_to = Util.getSessionParameterValue(req,"loan_no_to",true);
		*******************************************************************************************/
	}
	public void fc_func_7072_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_7072_LDataSet ds = null;
		FC_FUNC_7072_LDM dm = new FC_FUNC_7072_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.slip_occr_dt = Util.checkString(req.getParameter("slip_occr_dt"));
		dm.slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
		dm.slip_seq = Util.checkString(req.getParameter("slip_seq"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_7072_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_FUNC_7000EJBHome home = (FC_FUNC_7000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_7000EJB");
			FC_FUNC_7000EJB ejb = home.create();

			ds = ejb.fc_func_7072_l(dm);
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
		dm.slip_occr_dt = (String)hash.get("slip_occr_dt");
		dm.slip_clsf_cd = (String)hash.get("slip_clsf_cd");
		dm.slip_seq = (String)hash.get("slip_seq");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.slip_occr_dt = Util.getSessionParameterValue(req,"slip_occr_dt",true);
		dm.slip_clsf_cd = Util.getSessionParameterValue(req,"slip_clsf_cd",true);
		dm.slip_seq = Util.getSessionParameterValue(req,"slip_seq",true);
		*******************************************************************************************/
	}
	public void fc_func_7073_i(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_7073_IDataSet ds = null;
		FC_FUNC_7073_IDM dm = new FC_FUNC_7073_IDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.mode = Util.checkString(req.getParameter("mode"));
		dm.loan_budg_cd = Util.checkString(req.getParameter("loan_budg_cd"));
		dm.repay_dt = Util.checkString(req.getParameter("repay_dt"));
		dm.repay_rmks = Util.checkString(req.getParameter("repay_rmks"));
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		dm.use_dept_cd = Util.getSessionParameterValue(req,"deptcd",true);
		
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);
		
		dm.fund_mang_no = (String)hash.get("fund_mang_no");
		dm.loan_no = (String)hash.get("loan_no");
		dm.repay_amt = (String)hash.get("repay_amt");
		
		dm.repay_slip_occr_dt = Util.checkString(req.getParameter("repay_slip_occr_dt"));
		dm.repay_slip_clsf_cd = Util.checkString(req.getParameter("repay_slip_clsf_cd"));
		dm.repay_slip_seq = Util.checkString(req.getParameter("repay_slip_seq"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_7073_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_FUNC_7000EJBHome home = (FC_FUNC_7000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_7000EJB");
			FC_FUNC_7000EJB ejb = home.create();

			ds = ejb.fc_func_7073_i(dm);
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
		dm.mode = (String)hash.get("mode");
		dm.loan_budg_cd = (String)hash.get("loan_budg_cd");
		dm.repay_dt = (String)hash.get("repay_dt");
		dm.repay_rmks = (String)hash.get("repay_rmks");
		dm.incmg_pers = (String)hash.get("incmg_pers");
		dm.incmg_pers_ipadd = (String)hash.get("incmg_pers_ipadd");
		dm.use_dept_cd = (String)hash.get("use_dept_cd");
		dm.fund_mang_no = (String)hash.get("fund_mang_no");
		dm.loan_no = (String)hash.get("loan_no");
		dm.repay_amt = (String)hash.get("repay_amt");
		dm.repay_slip_occr_dt = (String)hash.get("repay_slip_occr_dt");
		dm.repay_slip_clsf_cd = (String)hash.get("repay_slip_clsf_cd");
		dm.repay_slip_seq = (String)hash.get("repay_slip_seq");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.mode = Util.getSessionParameterValue(req,"mode",true);
		dm.loan_budg_cd = Util.getSessionParameterValue(req,"loan_budg_cd",true);
		dm.repay_dt = Util.getSessionParameterValue(req,"repay_dt",true);
		dm.repay_rmks = Util.getSessionParameterValue(req,"repay_rmks",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"incmg_pers",true);
		dm.incmg_pers_ipadd = Util.getSessionParameterValue(req,"incmg_pers_ipadd",true);
		dm.use_dept_cd = Util.getSessionParameterValue(req,"use_dept_cd",true);
		dm.fund_mang_no = Util.getSessionParameterValue(req,"fund_mang_no",true);
		dm.loan_no = Util.getSessionParameterValue(req,"loan_no",true);
		dm.repay_amt = Util.getSessionParameterValue(req,"repay_amt",true);
		dm.repay_slip_occr_dt = Util.getSessionParameterValue(req,"repay_slip_occr_dt",true);
		dm.repay_slip_clsf_cd = Util.getSessionParameterValue(req,"repay_slip_clsf_cd",true);
		dm.repay_slip_seq = Util.getSessionParameterValue(req,"repay_slip_seq",true);
		*******************************************************************************************/
	}
	public void fc_func_7074_d(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_7074_DDataSet ds = null;
		FC_FUNC_7074_DDM dm = new FC_FUNC_7074_DDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.repay_slip_occr_dt = Util.checkString(req.getParameter("repay_slip_occr_dt"));
		dm.repay_slip_clsf_cd = Util.checkString(req.getParameter("repay_slip_clsf_cd"));
		dm.repay_slip_seq = Util.checkString(req.getParameter("repay_slip_seq"));
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.incmg_pers_ipadd = req.getRemoteAddr();

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_7074_DDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_FUNC_7000EJBHome home = (FC_FUNC_7000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_7000EJB");
			FC_FUNC_7000EJB ejb = home.create();

			ds = ejb.fc_func_7074_d(dm);
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
		dm.repay_slip_occr_dt = (String)hash.get("repay_slip_occr_dt");
		dm.repay_slip_clsf_cd = (String)hash.get("repay_slip_clsf_cd");
		dm.repay_slip_seq = (String)hash.get("repay_slip_seq");
		dm.incmg_pers = (String)hash.get("incmg_pers");
		dm.incmg_pers_ipadd = (String)hash.get("incmg_pers_ipadd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.repay_slip_occr_dt = Util.getSessionParameterValue(req,"repay_slip_occr_dt",true);
		dm.repay_slip_clsf_cd = Util.getSessionParameterValue(req,"repay_slip_clsf_cd",true);
		dm.repay_slip_seq = Util.getSessionParameterValue(req,"repay_slip_seq",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"incmg_pers",true);
		dm.incmg_pers_ipadd = Util.getSessionParameterValue(req,"incmg_pers_ipadd",true);
		*******************************************************************************************/

	}
}

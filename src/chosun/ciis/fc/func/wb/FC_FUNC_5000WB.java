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

public class FC_FUNC_5000WB extends chosun.ciis.co.base.wb.BaseWB {
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
			FC_FUNC_5000EJBHome home = (FC_FUNC_5000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_5000EJB");
			FC_FUNC_5000EJB ejb = home.create();
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
	public void fc_func_5000_m(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_5000_MDataSet ds = null;
		FC_FUNC_5000_MDM dm = new FC_FUNC_5000_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_5000_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_FUNC_5000EJBHome home = (FC_FUNC_5000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_5000EJB");
			FC_FUNC_5000EJB ejb = home.create();

			ds = ejb.fc_func_5000_m(dm);
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
	public void fc_func_5001_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_5001_LDataSet ds = null;
		FC_FUNC_5001_LDM dm = new FC_FUNC_5001_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.insr_clsf_cd = Util.checkString(req.getParameter("insr_clsf_cd"));
		dm.insr_no = Util.checkString(req.getParameter("insr_no"));
		dm.comp_dt = Util.checkString(req.getParameter("comp_dt"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_5001_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_FUNC_5000EJBHome home = (FC_FUNC_5000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_5000EJB");
			FC_FUNC_5000EJB ejb = home.create();

			ds = ejb.fc_func_5001_l(dm);
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
		dm.insr_clsf_cd = (String)hash.get("insr_clsf_cd");
		dm.insr_no = (String)hash.get("insr_no");
		dm.comp_dt = (String)hash.get("comp_dt");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.insr_clsf_cd = Util.getSessionParameterValue(req,"insr_clsf_cd",true);
		dm.insr_no = Util.getSessionParameterValue(req,"insr_no",true);
		dm.comp_dt = Util.getSessionParameterValue(req,"comp_dt",true);
		*******************************************************************************************/
	}
	public void fc_func_5002_i(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_5002_IDataSet ds = null;
		FC_FUNC_5002_IDM dm = new FC_FUNC_5002_IDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.insr_nm = Util.checkString(req.getParameter("insr_nm"));
		dm.dlco_clsf_cd = Util.checkString(req.getParameter("dlco_clsf_cd"));
		dm.dlco_cd = Util.checkString(req.getParameter("dlco_cd"));
		dm.mtry_dt = Util.checkString(req.getParameter("mtry_dt"));
		dm.medi_cd = Util.checkString(req.getParameter("medi_cd"));
		dm.dtls_medi_cd = Util.checkString(req.getParameter("dtls_medi_cd"));
		dm.use_dept_cd = Util.checkString(req.getParameter("use_dept_cd"));
		dm.insr_amt = Util.checkString(req.getParameter("insr_amt"));
		dm.insr_rate = Util.checkString(req.getParameter("insr_rate"));
		dm.frex_cd = Util.checkString(req.getParameter("frex_cd"));
		dm.exrate = Util.checkString(req.getParameter("exrate"));
		dm.frcr_amt = Util.checkString(req.getParameter("frcr_amt"));
		dm.won_amt = Util.checkString(req.getParameter("won_amt"));
		dm.pymt_rmks = Util.checkString(req.getParameter("pymt_rmks"));
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		dm.insr_clsf_cd = Util.checkString(req.getParameter("insr_clsf_cd"));
		dm.insr_no = Util.checkString(req.getParameter("insr_no"));
		dm.comp_dt = Util.checkString(req.getParameter("comp_dt"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_5002_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */		
		
		/* EJB 수정전 시작
		try {
			FC_FUNC_5000EJBHome home = (FC_FUNC_5000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_5000EJB");
			FC_FUNC_5000EJB ejb = home.create();

			ds = ejb.fc_func_5002_i(dm);
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
		dm.insr_nm = (String)hash.get("insr_nm");
		dm.dlco_clsf_cd = (String)hash.get("dlco_clsf_cd");
		dm.dlco_cd = (String)hash.get("dlco_cd");
		dm.mtry_dt = (String)hash.get("mtry_dt");
		dm.medi_cd = (String)hash.get("medi_cd");
		dm.dtls_medi_cd = (String)hash.get("dtls_medi_cd");
		dm.use_dept_cd = (String)hash.get("use_dept_cd");
		dm.insr_amt = (String)hash.get("insr_amt");
		dm.insr_rate = (String)hash.get("insr_rate");
		dm.frex_cd = (String)hash.get("frex_cd");
		dm.exrate = (String)hash.get("exrate");
		dm.frcr_amt = (String)hash.get("frcr_amt");
		dm.won_amt = (String)hash.get("won_amt");
		dm.pymt_rmks = (String)hash.get("pymt_rmks");
		dm.incmg_pers = (String)hash.get("incmg_pers");
		dm.incmg_pers_ipadd = (String)hash.get("incmg_pers_ipadd");
		dm.insr_clsf_cd = (String)hash.get("insr_clsf_cd");
		dm.insr_no = (String)hash.get("insr_no");
		dm.comp_dt = (String)hash.get("comp_dt");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.insr_nm = Util.getSessionParameterValue(req,"insr_nm",true);
		dm.dlco_clsf_cd = Util.getSessionParameterValue(req,"dlco_clsf_cd",true);
		dm.dlco_cd = Util.getSessionParameterValue(req,"dlco_cd",true);
		dm.mtry_dt = Util.getSessionParameterValue(req,"mtry_dt",true);
		dm.medi_cd = Util.getSessionParameterValue(req,"medi_cd",true);
		dm.dtls_medi_cd = Util.getSessionParameterValue(req,"dtls_medi_cd",true);
		dm.use_dept_cd = Util.getSessionParameterValue(req,"use_dept_cd",true);
		dm.insr_amt = Util.getSessionParameterValue(req,"insr_amt",true);
		dm.insr_rate = Util.getSessionParameterValue(req,"insr_rate",true);
		dm.frex_cd = Util.getSessionParameterValue(req,"frex_cd",true);
		dm.exrate = Util.getSessionParameterValue(req,"exrate",true);
		dm.frcr_amt = Util.getSessionParameterValue(req,"frcr_amt",true);
		dm.won_amt = Util.getSessionParameterValue(req,"won_amt",true);
		dm.pymt_rmks = Util.getSessionParameterValue(req,"pymt_rmks",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"incmg_pers",true);
		dm.incmg_pers_ipadd = Util.getSessionParameterValue(req,"incmg_pers_ipadd",true);
		dm.insr_clsf_cd = Util.getSessionParameterValue(req,"insr_clsf_cd",true);
		dm.insr_no = Util.getSessionParameterValue(req,"insr_no",true);
		dm.comp_dt = Util.getSessionParameterValue(req,"comp_dt",true);
		*******************************************************************************************/
	}
	public void fc_func_5010_m(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_5010_MDataSet ds = null;
		FC_FUNC_5010_MDM dm = new FC_FUNC_5010_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_5010_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */		
		
		/* EJB 수정전 시작
		try {
			FC_FUNC_5000EJBHome home = (FC_FUNC_5000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_5000EJB");
			FC_FUNC_5000EJB ejb = home.create();

			ds = ejb.fc_func_5010_m(dm);
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
	public void fc_func_5011_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_5011_LDataSet ds = null;
		FC_FUNC_5011_LDM dm = new FC_FUNC_5011_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.insr_clsf_cd = Util.checkString(req.getParameter("insr_clsf_cd"));
		dm.insr_no = Util.checkString(req.getParameter("insr_no"));
		dm.comp_dt = Util.checkString(req.getParameter("comp_dt"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_5011_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_FUNC_5000EJBHome home = (FC_FUNC_5000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_5000EJB");
			FC_FUNC_5000EJB ejb = home.create();

			ds = ejb.fc_func_5011_l(dm);
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
		dm.insr_clsf_cd = (String)hash.get("insr_clsf_cd");
		dm.insr_no = (String)hash.get("insr_no");
		dm.comp_dt = (String)hash.get("comp_dt");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.insr_clsf_cd = Util.getSessionParameterValue(req,"insr_clsf_cd",true);
		dm.insr_no = Util.getSessionParameterValue(req,"insr_no",true);
		dm.comp_dt = Util.getSessionParameterValue(req,"comp_dt",true);
		*******************************************************************************************/
	}
	public void fc_func_5012_i(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_5012_IDataSet ds = null;
		FC_FUNC_5012_IDM dm = new FC_FUNC_5012_IDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.insr_clsf_cd = Util.checkString(req.getParameter("insr_clsf_cd"));
		dm.insr_no = Util.checkString(req.getParameter("insr_no"));
		dm.comp_dt = Util.checkString(req.getParameter("comp_dt"));
		dm.cctr_dt = Util.checkString(req.getParameter("cctr_dt"));
		dm.cctr_amt = Util.checkString(req.getParameter("cctr_amt"));
		dm.cctr_rmks = Util.checkString(req.getParameter("cctr_rmks"));
		dm.nomach_adpay_bal = Util.checkString(req.getParameter("nomach_adpay_bal"));
		dm.cost_gain_stot = Util.checkString(req.getParameter("cost_gain_stot"));
		dm.rcpay_amt_stot = Util.checkString(req.getParameter("rcpay_amt_stot"));
		dm.sum_cost_gain_stot = Util.checkString(req.getParameter("sum_cost_gain_stot"));
		dm.sum_rcpay_amt_stot = Util.checkString(req.getParameter("sum_rcpay_amt_stot"));
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		dm.dlco_clsf_cd = Util.checkString(req.getParameter("dlco_clsf_cd"));
		dm.dlco_cd = Util.checkString(req.getParameter("dlco_cd"));
		dm.dlco_nm = Util.checkString(req.getParameter("dlco_nm"));
		dm.medi_cd = Util.checkString(req.getParameter("medi_cd"));
		dm.dtls_medi_cd = Util.checkString(req.getParameter("dtls_medi_cd"));
		dm.mtry_dt = Util.checkString(req.getParameter("mtry_dt"));
		dm.use_dept_cd = Util.getSessionParameterValue(req,"deptcd",true);

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_5012_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_FUNC_5000EJBHome home = (FC_FUNC_5000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_5000EJB");
			FC_FUNC_5000EJB ejb = home.create();

			ds = ejb.fc_func_5012_i(dm);
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
		dm.insr_clsf_cd = (String)hash.get("insr_clsf_cd");
		dm.insr_no = (String)hash.get("insr_no");
		dm.comp_dt = (String)hash.get("comp_dt");
		dm.cctr_dt = (String)hash.get("cctr_dt");
		dm.cctr_amt = (String)hash.get("cctr_amt");
		dm.cctr_rmks = (String)hash.get("cctr_rmks");
		dm.nomach_adpay_bal = (String)hash.get("nomach_adpay_bal");
		dm.cost_gain_stot = (String)hash.get("cost_gain_stot");
		dm.rcpay_amt_stot = (String)hash.get("rcpay_amt_stot");
		dm.sum_cost_gain_stot = (String)hash.get("sum_cost_gain_stot");
		dm.sum_rcpay_amt_stot = (String)hash.get("sum_rcpay_amt_stot");
		dm.incmg_pers = (String)hash.get("incmg_pers");
		dm.incmg_pers_ipadd = (String)hash.get("incmg_pers_ipadd");
		dm.dlco_clsf_cd = (String)hash.get("dlco_clsf_cd");
		dm.dlco_cd = (String)hash.get("dlco_cd");
		dm.dlco_nm = (String)hash.get("dlco_nm");
		dm.medi_cd = (String)hash.get("medi_cd");
		dm.dtls_medi_cd = (String)hash.get("dtls_medi_cd");
		dm.mtry_dt = (String)hash.get("mtry_dt");
		dm.use_dept_cd = (String)hash.get("use_dept_cd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.insr_clsf_cd = Util.getSessionParameterValue(req,"insr_clsf_cd",true);
		dm.insr_no = Util.getSessionParameterValue(req,"insr_no",true);
		dm.comp_dt = Util.getSessionParameterValue(req,"comp_dt",true);
		dm.cctr_dt = Util.getSessionParameterValue(req,"cctr_dt",true);
		dm.cctr_amt = Util.getSessionParameterValue(req,"cctr_amt",true);
		dm.cctr_rmks = Util.getSessionParameterValue(req,"cctr_rmks",true);
		dm.nomach_adpay_bal = Util.getSessionParameterValue(req,"nomach_adpay_bal",true);
		dm.cost_gain_stot = Util.getSessionParameterValue(req,"cost_gain_stot",true);
		dm.rcpay_amt_stot = Util.getSessionParameterValue(req,"rcpay_amt_stot",true);
		dm.sum_cost_gain_stot = Util.getSessionParameterValue(req,"sum_cost_gain_stot",true);
		dm.sum_rcpay_amt_stot = Util.getSessionParameterValue(req,"sum_rcpay_amt_stot",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"incmg_pers",true);
		dm.incmg_pers_ipadd = Util.getSessionParameterValue(req,"incmg_pers_ipadd",true);
		dm.dlco_clsf_cd = Util.getSessionParameterValue(req,"dlco_clsf_cd",true);
		dm.dlco_cd = Util.getSessionParameterValue(req,"dlco_cd",true);
		dm.dlco_nm = Util.getSessionParameterValue(req,"dlco_nm",true);
		dm.medi_cd = Util.getSessionParameterValue(req,"medi_cd",true);
		dm.dtls_medi_cd = Util.getSessionParameterValue(req,"dtls_medi_cd",true);
		dm.mtry_dt = Util.getSessionParameterValue(req,"mtry_dt",true);
		dm.use_dept_cd = Util.getSessionParameterValue(req,"use_dept_cd",true);
		*******************************************************************************************/
	}
	public void fc_func_5013_d(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_5013_DDataSet ds = null;
		FC_FUNC_5013_DDM dm = new FC_FUNC_5013_DDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.insr_clsf_cd = Util.checkString(req.getParameter("insr_clsf_cd"));
		dm.insr_no = Util.checkString(req.getParameter("insr_no"));
		dm.comp_dt = Util.checkString(req.getParameter("comp_dt"));
		dm.nomach_adpay_bal = Util.checkString(req.getParameter("nomach_adpay_bal"));
		dm.cost_gain_stot = Util.checkString(req.getParameter("cost_gain_stot"));
		dm.rcpay_amt_stot = Util.checkString(req.getParameter("rcpay_amt_stot"));
		dm.sum_cost_gain_stot = Util.checkString(req.getParameter("sum_cost_gain_stot"));
		dm.sum_rcpay_amt_stot = Util.checkString(req.getParameter("sum_rcpay_amt_stot"));
		dm.incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
		dm.incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
		dm.slip_occr_dt = Util.checkString(req.getParameter("slip_occr_dt"));
		dm.slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
		dm.slip_seq = Util.checkString(req.getParameter("slip_seq"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_5013_DDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_FUNC_5000EJBHome home = (FC_FUNC_5000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_5000EJB");
			FC_FUNC_5000EJB ejb = home.create();

			ds = ejb.fc_func_5013_d(dm);
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
		dm.insr_clsf_cd = (String)hash.get("insr_clsf_cd");
		dm.insr_no = (String)hash.get("insr_no");
		dm.comp_dt = (String)hash.get("comp_dt");
		dm.nomach_adpay_bal = (String)hash.get("nomach_adpay_bal");
		dm.cost_gain_stot = (String)hash.get("cost_gain_stot");
		dm.rcpay_amt_stot = (String)hash.get("rcpay_amt_stot");
		dm.sum_cost_gain_stot = (String)hash.get("sum_cost_gain_stot");
		dm.sum_rcpay_amt_stot = (String)hash.get("sum_rcpay_amt_stot");
		dm.incmg_pers = (String)hash.get("incmg_pers");
		dm.incmg_pers_ipadd = (String)hash.get("incmg_pers_ipadd");
		dm.slip_occr_dt = (String)hash.get("slip_occr_dt");
		dm.slip_clsf_cd = (String)hash.get("slip_clsf_cd");
		dm.slip_seq = (String)hash.get("slip_seq");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.insr_clsf_cd = Util.getSessionParameterValue(req,"insr_clsf_cd",true);
		dm.insr_no = Util.getSessionParameterValue(req,"insr_no",true);
		dm.comp_dt = Util.getSessionParameterValue(req,"comp_dt",true);
		dm.nomach_adpay_bal = Util.getSessionParameterValue(req,"nomach_adpay_bal",true);
		dm.cost_gain_stot = Util.getSessionParameterValue(req,"cost_gain_stot",true);
		dm.rcpay_amt_stot = Util.getSessionParameterValue(req,"rcpay_amt_stot",true);
		dm.sum_cost_gain_stot = Util.getSessionParameterValue(req,"sum_cost_gain_stot",true);
		dm.sum_rcpay_amt_stot = Util.getSessionParameterValue(req,"sum_rcpay_amt_stot",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"incmg_pers",true);
		dm.incmg_pers_ipadd = Util.getSessionParameterValue(req,"incmg_pers_ipadd",true);
		dm.slip_occr_dt = Util.getSessionParameterValue(req,"slip_occr_dt",true);
		dm.slip_clsf_cd = Util.getSessionParameterValue(req,"slip_clsf_cd",true);
		dm.slip_seq = Util.getSessionParameterValue(req,"slip_seq",true);
		*******************************************************************************************/
	}
	
	public void fc_func_5020_m(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_5020_MDataSet ds = null;
		FC_FUNC_5020_MDM dm = new FC_FUNC_5020_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		
		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_5020_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.incmg_pers = (String)hash.get("incmg_pers");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"incmg_pers",true);
		*******************************************************************************************/
	}
	
	public void fc_func_5021_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_5021_LDataSet ds = null;
		FC_FUNC_5021_LDM dm = new FC_FUNC_5021_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.pch_cymd1fr = Util.checkString(req.getParameter("pch_cymd1fr"));
		dm.insr_clsf_cd = Util.checkString(req.getParameter("insr_clsf_cd"));
		dm.dlco_clsf_cd = Util.checkString(req.getParameter("dlco_clsf_cd"));
		dm.dlco_cd = Util.checkString(req.getParameter("dlco_cd"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_5021_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_FUNC_5000EJBHome home = (FC_FUNC_5000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_5000EJB");
			FC_FUNC_5000EJB ejb = home.create();

			ds = ejb.fc_func_5021_l(dm);
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
		dm.pch_cymd1fr = (String)hash.get("pch_cymd1fr");
		dm.insr_clsf_cd = (String)hash.get("insr_clsf_cd");
		dm.dlco_clsf_cd = (String)hash.get("dlco_clsf_cd");
		dm.dlco_cd = (String)hash.get("dlco_cd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.pch_cymd1fr = Util.getSessionParameterValue(req,"pch_cymd1fr",true);
		dm.insr_clsf_cd = Util.getSessionParameterValue(req,"insr_clsf_cd",true);
		dm.dlco_clsf_cd = Util.getSessionParameterValue(req,"dlco_clsf_cd",true);
		dm.dlco_cd = Util.getSessionParameterValue(req,"dlco_cd",true);
		*******************************************************************************************/
	}
}

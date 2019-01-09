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

public class FC_FUNC_2000WB extends chosun.ciis.co.base.wb.BaseWB {
	public void getDummyList(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_9999_LDataSet ds = null;
		FC_FUNC_9999_LDM dm = new FC_FUNC_9999_LDM();
		
		//dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.cmpy_cd = "100";

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
			FC_FUNC_2000EJBHome home = (FC_FUNC_2000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_2000EJB");
			FC_FUNC_2000EJB ejb = home.create();
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
	
	public void fc_func_2000_m(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_2000_MDataSet ds = null;
		FC_FUNC_2000_MDM dm = new FC_FUNC_2000_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_2000_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_FUNC_2000EJBHome home = (FC_FUNC_2000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_2000EJB");
			FC_FUNC_2000EJB ejb = home.create();

			ds = ejb.fc_func_2000_m(dm);
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
	public void fc_func_2001_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_2001_LDataSet ds = null;
		FC_FUNC_2001_LDM dm = new FC_FUNC_2001_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.seci_clsf_cd = Util.checkString(req.getParameter("seci_clsf_cd"));
		dm.seci_no = Util.checkString(req.getParameter("seci_no"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_2001_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_FUNC_2000EJBHome home = (FC_FUNC_2000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_2000EJB");
			FC_FUNC_2000EJB ejb = home.create();

			ds = ejb.fc_func_2001_l(dm);
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
	public void fc_func_2002_i(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_2002_IDataSet ds = null;
		FC_FUNC_2002_IDM dm = new FC_FUNC_2002_IDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.seci_clsf_cd = Util.checkString(req.getParameter("seci_clsf_cd"));
		dm.seci_no = Util.checkString(req.getParameter("seci_no"));
		dm.seci_stat_cd = Util.checkString(req.getParameter("seci_stat_cd"));
		dm.fisc_aprv_stat = Util.checkString(req.getParameter("fisc_aprv_stat"));
		dm.seci_nm = Util.checkString(req.getParameter("seci_nm"));
		dm.comp_dt = Util.checkString(req.getParameter("comp_dt"));
		dm.mtry_dt = Util.checkString(req.getParameter("mtry_dt"));
		dm.dlco_clsf_cd = Util.checkString(req.getParameter("dlco_clsf_cd"));
		dm.dlco_cd = Util.checkString(req.getParameter("dlco_cd"));
		dm.face_val_amt = Util.checkString(req.getParameter("face_val_amt"));
		dm.purc_amt = Util.checkString(req.getParameter("purc_amt"));
		dm.defr_yys = Util.checkString(req.getParameter("defr_yys"));
		dm.repay_yys = Util.checkString(req.getParameter("repay_yys"));
		dm.div_repay_tms = Util.checkString(req.getParameter("div_repay_tms"));
		dm.int_rate = Util.checkString(req.getParameter("int_rate"));
		dm.issu_dt = Util.checkString(req.getParameter("issu_dt"));
		dm.rmks = Util.checkString(req.getParameter("rmks"));
		dm.pay_bank_cd = Util.checkString(req.getParameter("pay_bank_cd"));
		dm.chg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.incmg_pers_ipadd = req.getRemoteAddr();

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_2002_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_FUNC_2000EJBHome home = (FC_FUNC_2000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_2000EJB");
			FC_FUNC_2000EJB ejb = home.create();

			ds = ejb.fc_func_2002_i(dm);
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
	public void fc_func_2010_m(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_2010_MDataSet ds = null;
		FC_FUNC_2010_MDM dm = new FC_FUNC_2010_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_2010_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_FUNC_2000EJBHome home = (FC_FUNC_2000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_2000EJB");
			FC_FUNC_2000EJB ejb = home.create();

			ds = ejb.fc_func_2010_m(dm);
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
	public void fc_func_2011_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_2011_LDataSet ds = null;
		FC_FUNC_2011_LDM dm = new FC_FUNC_2011_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.seci_clsf_cd = Util.checkString(req.getParameter("seci_clsf_cd"));
		dm.pay_bank_cd = Util.checkString(req.getParameter("pay_bank_cd"));
		dm.mtry_dt = Util.checkString(req.getParameter("mtry_dt"));
		dm.repay_dt = Util.checkString(req.getParameter("repay_dt"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_2011_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_FUNC_2000EJBHome home = (FC_FUNC_2000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_2000EJB");
			FC_FUNC_2000EJB ejb = home.create();

			ds = ejb.fc_func_2011_l(dm);
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
	public void fc_func_2012_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_2012_LDataSet ds = null;
		FC_FUNC_2012_LDM dm = new FC_FUNC_2012_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.seci_clsf_cd = Util.checkString(req.getParameter("seci_clsf_cd"));
		dm.pay_bank_cd = Util.checkString(req.getParameter("pay_bank_cd"));
		dm.mtry_dt = Util.checkString(req.getParameter("mtry_dt"));
		dm.repay_dt = Util.checkString(req.getParameter("repay_dt"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_2012_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */		
		
		/* EJB 수정전 시작
		try {
			FC_FUNC_2000EJBHome home = (FC_FUNC_2000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_2000EJB");
			FC_FUNC_2000EJB ejb = home.create();

			ds = ejb.fc_func_2012_l(dm);
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
	public void fc_func_2013_i(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_2013_IDataSet ds = null;
		FC_FUNC_2013_IDM dm = new FC_FUNC_2013_IDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.yugagbcd = Util.checkString(req.getParameter("yugagbcd"));
		dm.shcymd = Util.checkString(req.getParameter("shcymd"));
		dm.jeog = Util.checkString(req.getParameter("jeog"));
		dm.ygtotamt = Util.checkString(req.getParameter("ygtotamt"));
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		dm.use_dept_cd = Util.getSessionParameterValue(req,"deptcd",true);
		
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);
		dm.seci_no = (String)hash.get("seci_no");
		dm.cost_gain_stot = (String)hash.get("cost_gain_stot");
		dm.rcpay_amt_stot = (String)hash.get("rcpay_amt_stot");
		dm.yugaint2 = (String)hash.get("yugaint2");
		dm.intamt = (String)hash.get("intamt");
		dm.jbgamt = (String)hash.get("jbgamt");
		dm.rcpay_amt = (String)hash.get("rcpay_amt");
		dm.corp_tax_amt = (String)hash.get("corp_tax_amt");
		dm.misusuic = (String)hash.get("misusuic");
		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_2013_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_FUNC_2000EJBHome home = (FC_FUNC_2000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_2000EJB");
			FC_FUNC_2000EJB ejb = home.create();

			ds = ejb.fc_func_2013_i(dm);
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
	public void fc_func_2014_d(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_2014_DDataSet ds = null;
		FC_FUNC_2014_DDM dm = new FC_FUNC_2014_DDM();
		
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.yugagbcd = Util.checkString(req.getParameter("yugagbcd"));
		dm.shcymd = Util.checkString(req.getParameter("shcymd"));
		dm.slip_occr_dt = Util.checkString(req.getParameter("slip_occr_dt"));
		dm.slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
		dm.slip_seq = Util.checkString(req.getParameter("slip_seq"));
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);
		dm.seci_no = (String)hash.get("seci_no");
		dm.cost_gain_stot = (String)hash.get("cost_gain_stot");
		dm.rcpay_amt_stot = (String)hash.get("rcpay_amt_stot");
		dm.yugaint2 = (String)hash.get("yugaint2");
		dm.intamt = (String)hash.get("intamt");
		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_2014_DDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_FUNC_2000EJBHome home = (FC_FUNC_2000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_2000EJB");
			FC_FUNC_2000EJB ejb = home.create();

			ds = ejb.fc_func_2014_d(dm);
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
	public void fc_func_2020_m(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_2020_MDataSet ds = null;
		FC_FUNC_2020_MDM dm = new FC_FUNC_2020_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_2020_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_FUNC_2000EJBHome home = (FC_FUNC_2000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_2000EJB");
			FC_FUNC_2000EJB ejb = home.create();

			ds = ejb.fc_func_2020_m(dm);
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
	public void fc_func_2021_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_2021_LDataSet ds = null;
		FC_FUNC_2021_LDM dm = new FC_FUNC_2021_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.seci_clsf_cd = Util.checkString(req.getParameter("seci_clsf_cd"));
		dm.pay_bank_cd = Util.checkString(req.getParameter("pay_bank_cd"));
		dm.mtry_dt = Util.checkString(req.getParameter("mtry_dt"));
		dm.comp_dt = Util.checkString(req.getParameter("comp_dt"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_2021_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_FUNC_2000EJBHome home = (FC_FUNC_2000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_2000EJB");
			FC_FUNC_2000EJB ejb = home.create();

			ds = ejb.fc_func_2021_l(dm);
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
	public void fc_func_2022_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_2022_LDataSet ds = null;
		FC_FUNC_2022_LDM dm = new FC_FUNC_2022_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.seci_clsf_cd = Util.checkString(req.getParameter("seci_clsf_cd"));
		dm.pay_bank_cd = Util.checkString(req.getParameter("pay_bank_cd"));
		dm.mtry_dt = Util.checkString(req.getParameter("mtry_dt"));
		dm.repay_dt = Util.checkString(req.getParameter("repay_dt"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_2022_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_FUNC_2000EJBHome home = (FC_FUNC_2000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_2000EJB");
			FC_FUNC_2000EJB ejb = home.create();

			ds = ejb.fc_func_2022_l(dm);
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
	public void fc_func_2023_i(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_2023_IDataSet ds = null;
		FC_FUNC_2023_IDM dm = new FC_FUNC_2023_IDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.seci_clsf_cd = Util.checkString(req.getParameter("seci_clsf_cd"));
		dm.repay_dt = Util.checkString(req.getParameter("comp_dt"));
		dm.rmks = Util.checkString(req.getParameter("jeog"));
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		dm.use_dept_cd = Util.getSessionParameterValue(req,"deptcd",true);
		
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);
		dm.seci_no = (String)hash.get("seci_no");
		dm.cost_gain_stot = (String)hash.get("cost_gain_stot");
		dm.rcpay_amt_stot = (String)hash.get("rcpay_amt_stot");
		dm.yugaint = (String)hash.get("yugaint");
		dm.intamt = (String)hash.get("intamt");
		dm.jbgamt = (String)hash.get("jbgamt");
		dm.rcpay_amt = (String)hash.get("rcpay_amt");
		dm.corp_tax_amt = (String)hash.get("corp_tax_amt");
		dm.misuamt = (String)hash.get("misusuic");
		
		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_2023_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_FUNC_2000EJBHome home = (FC_FUNC_2000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_2000EJB");
			FC_FUNC_2000EJB ejb = home.create();

			ds = ejb.fc_func_2023_i(dm);
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
	public void fc_func_2024_d(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_2024_DDataSet ds = null;
		FC_FUNC_2024_DDM dm = new FC_FUNC_2024_DDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.seci_clsf_cd = Util.checkString(req.getParameter("seci_clsf_cd"));
		dm.repay_dt = Util.checkString(req.getParameter("repay_dt"));
		dm.slip_occr_dt = Util.checkString(req.getParameter("slip_occr_dt"));
		dm.slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
		dm.slip_seq = Util.checkString(req.getParameter("slip_seq"));
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);
		dm.seci_no = (String)hash.get("seci_no");
		dm.cost_gain_stot = (String)hash.get("cost_gain_stot");
		dm.rcpay_amt_stot = (String)hash.get("rcpay_amt_stot");
		dm.yugaint = (String)hash.get("yugaint");
		dm.intamt = (String)hash.get("intamt");
	
		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_2024_DDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_FUNC_2000EJBHome home = (FC_FUNC_2000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_2000EJB");
			FC_FUNC_2000EJB ejb = home.create();

			ds = ejb.fc_func_2024_d(dm);
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
	public void fc_func_2030_m(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_2030_MDataSet ds = null;
		FC_FUNC_2030_MDM dm = new FC_FUNC_2030_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_2030_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_FUNC_2000EJBHome home = (FC_FUNC_2000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_2000EJB");
			FC_FUNC_2000EJB ejb = home.create();

			ds = ejb.fc_func_2030_m(dm);
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
	public void fc_func_2031_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_2031_LDataSet ds = null;
		FC_FUNC_2031_LDM dm = new FC_FUNC_2031_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.end_dt = Util.checkString(req.getParameter("end_dt"));
		dm.seci_clsf_cd = Util.checkString(req.getParameter("seci_clsf_cd"));
		dm.pay_bank_cd = Util.checkString(req.getParameter("pay_bank_cd"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_2031_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_FUNC_2000EJBHome home = (FC_FUNC_2000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_2000EJB");
			FC_FUNC_2000EJB ejb = home.create();

			ds = ejb.fc_func_2031_l(dm);
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
	public void fc_func_2050_m(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_2050_MDataSet ds = null;
		FC_FUNC_2050_MDM dm = new FC_FUNC_2050_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_2050_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_FUNC_2000EJBHome home = (FC_FUNC_2000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_2000EJB");
			FC_FUNC_2000EJB ejb = home.create();

			ds = ejb.fc_func_2050_m(dm);
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
	public void fc_func_2051_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_2051_LDataSet ds = null;
		FC_FUNC_2051_LDM dm = new FC_FUNC_2051_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.pch_sql = req.getParameter("pch_sql");
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);


		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_2051_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_FUNC_2000EJBHome home = (FC_FUNC_2000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_2000EJB");
			FC_FUNC_2000EJB ejb = home.create();

			ds = ejb.fc_func_2051_l(dm);
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
}

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

public class FC_FUNC_6000WB extends chosun.ciis.co.base.wb.BaseWB {
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
			FC_FUNC_6000EJBHome home = (FC_FUNC_6000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_6000EJB");
			FC_FUNC_6000EJB ejb = home.create();
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
	
	public void fc_func_6080_m(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_6080_MDataSet ds = null;
		FC_FUNC_6080_MDM dm = new FC_FUNC_6080_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
			
		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_6080_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_FUNC_6000EJBHome home = (FC_FUNC_6000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_6000EJB");
			FC_FUNC_6000EJB ejb = home.create();

			ds = ejb.fc_func_6080_m(dm);
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
	
	public void fc_func_6081_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_6081_LDataSet ds = null;
		FC_FUNC_6081_LDM dm = new FC_FUNC_6081_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.deps_isav_clsf_cd = Util.checkString(req.getParameter("deps_isav_clsf_cd"));
		dm.deps_isav_no = Util.checkString(req.getParameter("deps_isav_no"));

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_6081_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_FUNC_6000EJBHome home = (FC_FUNC_6000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_6000EJB");
			FC_FUNC_6000EJB ejb = home.create();

			ds = ejb.fc_func_6081_l(dm);
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
	
	public void fc_func_6082_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_6082_LDataSet ds = null;
		FC_FUNC_6082_LDM dm = new FC_FUNC_6082_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.deps_isav_clsf_cd = Util.checkString(req.getParameter("deps_isav_clsf_cd"));
		dm.deps_isav_no = Util.checkString(req.getParameter("deps_isav_no"));

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_6082_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_FUNC_6000EJBHome home = (FC_FUNC_6000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_6000EJB");
			FC_FUNC_6000EJB ejb = home.create();

			ds = ejb.fc_func_6082_l(dm);
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
	
	public void fc_func_6083_i(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_6083_IDataSet ds = null;
		FC_FUNC_6083_IDM dm = new FC_FUNC_6083_IDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.deps_isav_clsf_cd = Util.checkString(req.getParameter("deps_isav_clsf_cd"));
		dm.deps_isav_no = Util.checkString(req.getParameter("deps_isav_no"));
		dm.int_rate_chg_dt = Util.checkString(req.getParameter("int_rate_chg_dt"));
		dm.int_rate = Util.checkString(req.getParameter("int_rate"));
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_6083_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_FUNC_6000EJBHome home = (FC_FUNC_6000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_6000EJB");
			FC_FUNC_6000EJB ejb = home.create();

			ds = ejb.fc_func_6083_i(dm);
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
	
	public void fc_func_6084_d(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_6084_DDataSet ds = null;
		FC_FUNC_6084_DDM dm = new FC_FUNC_6084_DDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.deps_isav_clsf_cd = Util.checkString(req.getParameter("deps_isav_clsf_cd"));
		dm.deps_isav_no = Util.checkString(req.getParameter("deps_isav_no"));
		dm.int_rate_chg_dt = Util.checkString(req.getParameter("int_rate_chg_dt"));		

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_6084_DDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_FUNC_6000EJBHome home = (FC_FUNC_6000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_6000EJB");
			FC_FUNC_6000EJB ejb = home.create();

			ds = ejb.fc_func_6084_d(dm);
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
	
	public void fc_func_6090_m(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_6090_MDataSet ds = null;
		FC_FUNC_6090_MDM dm = new FC_FUNC_6090_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);


		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_6090_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_FUNC_6000EJBHome home = (FC_FUNC_6000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_6000EJB");
			FC_FUNC_6000EJB ejb = home.create();

			ds = ejb.fc_func_6090_m(dm);
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
	
	public void fc_func_6091_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_6091_LDataSet ds = null;
		FC_FUNC_6091_LDM dm = new FC_FUNC_6091_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.deps_isav_clsf_cd = Util.checkString(req.getParameter("deps_isav_clsf_cd"));
		dm.deps_isav_no = Util.checkString(req.getParameter("deps_isav_no"));

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_6091_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_FUNC_6000EJBHome home = (FC_FUNC_6000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_6000EJB");
			FC_FUNC_6000EJB ejb = home.create();

			ds = ejb.fc_func_6091_l(dm);
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
	
	public void fc_func_6092_i(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_6092_IDataSet ds = null;
		FC_FUNC_6092_IDM dm = new FC_FUNC_6092_IDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.deps_isav_clsf_cd = Util.checkString(req.getParameter("deps_isav_clsf_cd"));
		dm.deps_isav_no = Util.checkString(req.getParameter("deps_isav_no"));
		dm.recp_dt = Util.checkString(req.getParameter("recp_dt"));
		dm.int_rate = Util.checkString(req.getParameter("int_rate"));
		dm.tot_int_amt = Util.checkString(req.getParameter("tot_int_amt"));
		dm.corp_tax_amt = Util.checkString(req.getParameter("corp_tax_amt"));
		dm.aft_tax_int_amt = Util.checkString(req.getParameter("aft_tax_int_amt"));
		dm.unrcp_precpt_bal = Util.checkString(req.getParameter("unrcp_precpt_bal"));
		dm.int_gain_amt = Util.checkString(req.getParameter("int_gain_amt"));
		dm.rmks = Util.checkString(req.getParameter("rmks"));
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.dlco_clsf_cd = Util.checkString(req.getParameter("dlco_clsf_cd"));
		dm.dlco_cd = Util.checkString(req.getParameter("dlco_cd"));
		dm.compnm = Util.checkString(req.getParameter("compnm"));
		dm.deps_isav_stat_cd = Util.checkString(req.getParameter("deps_isav_stat_cd"));
		dm.cctr_dt = Util.checkString(req.getParameter("cctr_dt"));
		dm.impt_amt = Util.checkString(req.getParameter("impt_amt"));
		dm.rmks2 = Util.checkString(req.getParameter("rmks2"));
		dm.patr_budg_cd = Util.checkString(req.getParameter("patr_budg_cd"));
		dm.deps_clsf_cd = Util.checkString(req.getParameter("deps_clsf_cd"));
		dm.cost_gain_stot = Util.checkString(req.getParameter("cost_gain_stot"));
		dm.rcpay_amt_stot = Util.checkString(req.getParameter("rcpay_amt_stot"));
		dm.use_dept_cd = Util.checkString(req.getParameter("use_dept_cd"));
		dm.comp_dt = Util.checkString(req.getParameter("comp_dt"));
		dm.mtry_dt = Util.checkString(req.getParameter("mtry_dt"));
		
		dm.print();
		
		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_6092_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_FUNC_6000EJBHome home = (FC_FUNC_6000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_6000EJB");
			FC_FUNC_6000EJB ejb = home.create();

			ds = ejb.fc_func_6092_i(dm);
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
	
	public void fc_func_6093_d(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_6093_DDataSet ds = null;
		FC_FUNC_6093_DDM dm = new FC_FUNC_6093_DDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.deps_isav_clsf_cd = Util.checkString(req.getParameter("deps_isav_clsf_cd"));
		dm.deps_isav_no = Util.checkString(req.getParameter("deps_isav_no"));
		dm.recp_dt = Util.checkString(req.getParameter("recp_dt"));
		//dm.incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
		//dm.incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.slip_occr_dt = Util.checkString(req.getParameter("slip_occr_dt"));
		dm.slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
		dm.slip_seq = Util.checkString(req.getParameter("slip_seq"));
		dm.upintsuigamt = Util.checkString(req.getParameter("upintsuigamt"));
		dm.uptotintamt = Util.checkString(req.getParameter("uptotintamt"));
		dm.cost_gain_stot = Util.checkString(req.getParameter("cost_gain_stot"));
		dm.rcpay_amt_stot = Util.checkString(req.getParameter("rcpay_amt_stot"));		
		
		dm.print();
		
		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_6093_DDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/* EJB 수정전 시작
		try {
			FC_FUNC_6000EJBHome home = (FC_FUNC_6000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_6000EJB");
			FC_FUNC_6000EJB ejb = home.create();

			ds = ejb.fc_func_6093_d(dm);
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
	
	public void fc_func_6100_m(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_6100_MDataSet ds = null;
		FC_FUNC_6100_MDM dm = new FC_FUNC_6100_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_6100_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_FUNC_6000EJBHome home = (FC_FUNC_6000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_6000EJB");
			FC_FUNC_6000EJB ejb = home.create();

			ds = ejb.fc_func_6100_m(dm);
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
	
	public void fc_func_6101_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_6101_LDataSet ds = null;
		FC_FUNC_6101_LDM dm = new FC_FUNC_6101_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.in_cymd = Util.checkString(req.getParameter("in_cymd"));
		dm.deps_isav_clsf_cd = Util.checkString(req.getParameter("deps_isav_clsf_cd"));
		dm.dlco_clsf_cd = Util.checkString(req.getParameter("dlco_clsf_cd"));
		dm.dlco_cd = Util.checkString(req.getParameter("dlco_cd"));
		dm.order_string = Util.checkString(req.getParameter("order_string"));
		
		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_6101_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_FUNC_6000EJBHome home = (FC_FUNC_6000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_6000EJB");
			FC_FUNC_6000EJB ejb = home.create();

			ds = ejb.fc_func_6101_l(dm);
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
	
	public void fc_func_6111_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_6111_LDataSet ds = null;
		FC_FUNC_6111_LDM dm = new FC_FUNC_6111_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.comp_dt = Util.checkString(req.getParameter("comp_dt"));

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_6111_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_FUNC_6000EJBHome home = (FC_FUNC_6000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_6000EJB");
			FC_FUNC_6000EJB ejb = home.create();

			ds = ejb.fc_func_6111_l(dm);
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
	
	public void fc_func_6112_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_6112_LDataSet ds = null;
		FC_FUNC_6112_LDM dm = new FC_FUNC_6112_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.comp_dt = Util.checkString(req.getParameter("comp_dt"));

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_6112_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_FUNC_6000EJBHome home = (FC_FUNC_6000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_6000EJB");
			FC_FUNC_6000EJB ejb = home.create();

			ds = ejb.fc_func_6112_l(dm);
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
	
	public void fc_func_6113_i(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_6113_IDataSet ds = null;
		FC_FUNC_6113_IDM dm = new FC_FUNC_6113_IDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.ybtotbiamt = Util.checkString(req.getParameter("ybtotbiamt"));
		dm.pymt_dt = Util.checkString(req.getParameter("pymt_dt"));
		dm.use_dept_cd = Util.checkString(req.getParameter("use_dept_cd"));
		
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.deps_isav_clsf_cd = (String)hash.get("deps_isav_clsf_cd");
		dm.deps_isav_no = (String)hash.get("deps_isav_no");
		dm.comp_dt = (String)hash.get("comp_dt");
		dm.pymt_amt = (String)hash.get("pymt_amt");
		dm.rmks = (String)hash.get("rmks");
		dm.dlco_clsf_cd = (String)hash.get("dlco_clsf_cd");
		dm.dlco_cd = (String)hash.get("dlco_cd");
		dm.mtry_dt = (String)hash.get("mtry_dt");
		dm.obj_amt = (String)hash.get("obj_amt");
		
		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_6113_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_FUNC_6000EJBHome home = (FC_FUNC_6000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_6000EJB");
			FC_FUNC_6000EJB ejb = home.create();

			ds = ejb.fc_func_6113_i(dm);
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
	
	public void fc_func_6114_d(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_6114_DDataSet ds = null;
		FC_FUNC_6114_DDM dm = new FC_FUNC_6114_DDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.pymt_dt = Util.checkString(req.getParameter("pymt_dt"));
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.slip_occr_dt = Util.checkString(req.getParameter("slip_occr_dt"));
		dm.slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
		dm.slip_seq = Util.checkString(req.getParameter("slip_seq"));
		
		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_6114_DDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/* EJB 수정전 시작
		try {
			FC_FUNC_6000EJBHome home = (FC_FUNC_6000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_6000EJB");
			FC_FUNC_6000EJB ejb = home.create();

			ds = ejb.fc_func_6114_d(dm);
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
	
	public void fc_func_6120_m(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_6120_MDataSet ds = null;
		FC_FUNC_6120_MDM dm = new FC_FUNC_6120_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_6120_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_FUNC_6000EJBHome home = (FC_FUNC_6000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_6000EJB");
			FC_FUNC_6000EJB ejb = home.create();

			ds = ejb.fc_func_6120_m(dm);
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
	
	public void fc_func_6121_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_6121_LDataSet ds = null;
		FC_FUNC_6121_LDM dm = new FC_FUNC_6121_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.deps_isav_clsf_cd = Util.checkString(req.getParameter("deps_isav_clsf_cd"));
		dm.deps_isav_no = Util.checkString(req.getParameter("deps_isav_no"));

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_6121_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_FUNC_6000EJBHome home = (FC_FUNC_6000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_6000EJB");
			FC_FUNC_6000EJB ejb = home.create();

			ds = ejb.fc_func_6121_l(dm);
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
	
	public void fc_func_6122_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_6122_LDataSet ds = null;
		FC_FUNC_6122_LDM dm = new FC_FUNC_6122_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.deps_isav_clsf_cd = Util.checkString(req.getParameter("deps_isav_clsf_cd"));
		dm.deps_isav_no = Util.checkString(req.getParameter("deps_isav_no"));

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_6122_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_FUNC_6000EJBHome home = (FC_FUNC_6000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_6000EJB");
			FC_FUNC_6000EJB ejb = home.create();

			ds = ejb.fc_func_6122_l(dm);
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
	
	public void fc_func_6123_i(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_6123_IDataSet ds = null;
		FC_FUNC_6123_IDM dm = new FC_FUNC_6123_IDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.deps_isav_clsf_cd = Util.checkString(req.getParameter("deps_isav_clsf_cd"));
		dm.deps_isav_no = Util.checkString(req.getParameter("deps_isav_no"));
		dm.recp_dt = Util.checkString(req.getParameter("recp_dt"));
		dm.int_rate = Util.checkString(req.getParameter("int_rate"));
		dm.tot_int_amt = Util.checkString(req.getParameter("tot_int_amt"));
		dm.corp_tax_amt = Util.checkString(req.getParameter("corp_tax_amt"));
		dm.aft_tax_int_amt = Util.checkString(req.getParameter("aft_tax_int_amt"));
		dm.unrcp_precpt_bal = Util.checkString(req.getParameter("unrcp_precpt_bal"));
		dm.int_gain_amt = Util.checkString(req.getParameter("int_gain_amt"));
		dm.rmks = Util.checkString(req.getParameter("rmks"));
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.compgbcd = Util.checkString(req.getParameter("compgbcd"));
		dm.compcd = Util.checkString(req.getParameter("compcd"));
		dm.compnm = Util.checkString(req.getParameter("compnm"));
		dm.cost_gain_stot = Util.checkString(req.getParameter("cost_gain_stot"));
		dm.rcpay_amt_stot = Util.checkString(req.getParameter("rcpay_amt_stot"));
		dm.use_dept_cd = Util.checkString(req.getParameter("use_dept_cd"));

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_6123_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_FUNC_6000EJBHome home = (FC_FUNC_6000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_6000EJB");
			FC_FUNC_6000EJB ejb = home.create();

			ds = ejb.fc_func_6123_i(dm);
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
	
	public void fc_func_6124_d(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_6124_DDataSet ds = null;
		FC_FUNC_6124_DDM dm = new FC_FUNC_6124_DDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.deps_isav_clsf_cd = Util.checkString(req.getParameter("deps_isav_clsf_cd"));
		dm.deps_isav_no = Util.checkString(req.getParameter("deps_isav_no"));
		dm.recp_dt = Util.checkString(req.getParameter("recp_dt"));
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.slip_occr_dt = Util.checkString(req.getParameter("slip_occr_dt"));
		dm.slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
		dm.slip_seq = Util.checkString(req.getParameter("slip_seq"));
		dm.upintsuigamt = Util.checkString(req.getParameter("upintsuigamt"));
		dm.uptotintamt = Util.checkString(req.getParameter("uptotintamt"));
		dm.cost_gain_stot = Util.checkString(req.getParameter("cost_gain_stot"));
		dm.rcpay_amt_stot = Util.checkString(req.getParameter("rcpay_amt_stot"));		

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_6124_DDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_FUNC_6000EJBHome home = (FC_FUNC_6000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_6000EJB");
			FC_FUNC_6000EJB ejb = home.create();

			ds = ejb.fc_func_6124_d(dm);
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
	
	public void fc_func_6150_m(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_6150_MDataSet ds = null;
		FC_FUNC_6150_MDM dm = new FC_FUNC_6150_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_6150_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_FUNC_6000EJBHome home = (FC_FUNC_6000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_6000EJB");
			FC_FUNC_6000EJB ejb = home.create();

			ds = ejb.fc_func_6150_m(dm);
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
	
	public void fc_func_6151_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_6151_LDataSet ds = null;
		FC_FUNC_6151_LDM dm = new FC_FUNC_6151_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		//dm.and_string = Util.checkString(req.getParameter("and_string"));
		dm.and_string = req.getParameter("and_string");
		
		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_6151_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_FUNC_6000EJBHome home = (FC_FUNC_6000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_6000EJB");
			FC_FUNC_6000EJB ejb = home.create();

			ds = ejb.fc_func_6151_l(dm);
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
	
	public void fc_func_6160_m(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_6160_MDataSet ds = null;
		FC_FUNC_6160_MDM dm = new FC_FUNC_6160_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_6160_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_FUNC_6000EJBHome home = (FC_FUNC_6000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_6000EJB");
			FC_FUNC_6000EJB ejb = home.create();

			ds = ejb.fc_func_6160_m(dm);
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
	
	public void fc_func_6161_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_6161_LDataSet ds = null;
		FC_FUNC_6161_LDM dm = new FC_FUNC_6161_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		//dm.and_string = Util.checkString(req.getParameter("and_string"));
		dm.and_string = req.getParameter("and_string");

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_6161_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_FUNC_6000EJBHome home = (FC_FUNC_6000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_6000EJB");
			FC_FUNC_6000EJB ejb = home.create();

			ds = ejb.fc_func_6161_l(dm);
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
	public void fc_func_6000_m(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_6000_MDataSet ds = null;
		FC_FUNC_6000_MDM dm = new FC_FUNC_6000_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);

		dm.print();
		
		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_6000_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/* EJB 수정전 시작
		try {
			FC_FUNC_6000EJBHome home = (FC_FUNC_6000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_6000EJB");
			FC_FUNC_6000EJB ejb = home.create();

			ds = ejb.fc_func_6000_m(dm);
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
	public void fc_func_6001_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_6001_LDataSet ds = null;
		FC_FUNC_6001_LDM dm = new FC_FUNC_6001_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.deps_isav_clsf_cd = Util.checkString(req.getParameter("deps_isav_clsf_cd"));
		dm.deps_isav_no = Util.checkString(req.getParameter("deps_isav_no"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_6001_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_FUNC_6000EJBHome home = (FC_FUNC_6000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_6000EJB");
			FC_FUNC_6000EJB ejb = home.create();

			ds = ejb.fc_func_6001_l(dm);
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
	public void fc_func_6002_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_6002_LDataSet ds = null;
		FC_FUNC_6002_LDM dm = new FC_FUNC_6002_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.deps_isav_clsf_cd = Util.checkString(req.getParameter("deps_isav_clsf_cd"));
		dm.deps_isav_no = Util.checkString(req.getParameter("deps_isav_no"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_6002_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_FUNC_6000EJBHome home = (FC_FUNC_6000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_6000EJB");
			FC_FUNC_6000EJB ejb = home.create();

			ds = ejb.fc_func_6002_l(dm);
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
	public void fc_func_6003_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_6003_LDataSet ds = null;
		FC_FUNC_6003_LDM dm = new FC_FUNC_6003_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.deps_isav_clsf_cd = Util.checkString(req.getParameter("deps_isav_clsf_cd"));
		dm.deps_isav_no = Util.checkString(req.getParameter("deps_isav_no"));
		dm.occr_clsf_cd = Util.checkString(req.getParameter("occr_clsf_cd"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_6003_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_FUNC_6000EJBHome home = (FC_FUNC_6000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_6000EJB");
			FC_FUNC_6000EJB ejb = home.create();

			ds = ejb.fc_func_6003_l(dm);
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
	public void fc_func_6004_i(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_6004_IDataSet ds = null;
		FC_FUNC_6004_IDM dm = new FC_FUNC_6004_IDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.deps_isav_clsf_cd = Util.checkString(req.getParameter("deps_isav_clsf_cd"));
		dm.deps_isav_no = Util.checkString(req.getParameter("deps_isav_no"));
		dm.deps_isav_nm = Util.checkString(req.getParameter("deps_isav_nm"));
		dm.dlco_clsf_cd = Util.checkString(req.getParameter("dlco_clsf_cd"));
		dm.dlco_cd = Util.checkString(req.getParameter("dlco_cd"));
		dm.compnm = Util.checkString(req.getParameter("compnm"));
		dm.comp_dt = Util.checkString(req.getParameter("comp_dt"));
		dm.mtry_dt = Util.checkString(req.getParameter("mtry_dt"));
		dm.tot_pymt_amt = Util.checkString(req.getParameter("tot_pymt_amt"));
		dm.mm_int = Util.checkString(req.getParameter("mm_int"));
		dm.tot_int = Util.checkString(req.getParameter("tot_int"));
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		dm.int_rate = Util.checkString(req.getParameter("int_rate"));
		dm.rmks = Util.checkString(req.getParameter("rmks"));
		dm.use_dept_cd = Util.getSessionParameterValue(req,"deptcd",true);
		dm.frex_cd = Util.checkString(req.getParameter("frex_cd"));
		dm.exrate = Util.checkString(req.getParameter("exrate"));
		dm.frex_amt = Util.checkString(req.getParameter("frex_amt"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_6004_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_FUNC_6000EJBHome home = (FC_FUNC_6000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_6000EJB");
			FC_FUNC_6000EJB ejb = home.create();

			ds = ejb.fc_func_6004_i(dm);
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
	public void fc_func_6005_d(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_6005_DDataSet ds = null;
		FC_FUNC_6005_DDM dm = new FC_FUNC_6005_DDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.deps_isav_clsf_cd = Util.checkString(req.getParameter("deps_isav_clsf_cd"));
		dm.deps_isav_no = Util.checkString(req.getParameter("deps_isav_no"));
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.incmg_pers_ipadd = req.getRemoteAddr();

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_6005_DDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_FUNC_6000EJBHome home = (FC_FUNC_6000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_6000EJB");
			FC_FUNC_6000EJB ejb = home.create();

			ds = ejb.fc_func_6005_d(dm);
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
	public void fc_func_6010_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_6010_LDataSet ds = null;
		FC_FUNC_6010_LDM dm = new FC_FUNC_6010_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.comp_dt = Util.checkString(req.getParameter("comp_dt"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_6010_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_FUNC_6000EJBHome home = (FC_FUNC_6000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_6000EJB");
			FC_FUNC_6000EJB ejb = home.create();

			ds = ejb.fc_func_6010_l(dm);
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
	public void fc_func_6011_i(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_6011_IDataSet ds = null;
		FC_FUNC_6011_IDM dm = new FC_FUNC_6011_IDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.comp_dt = Util.checkString(req.getParameter("comp_dt"));
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		dm.rmks = Util.checkString(req.getParameter("rmks"));
		dm.use_dept_cd = Util.getSessionParameterValue(req,"deptcd",true);
		
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);
		
		dm.deps_isav_clsf_cd = (String)hash.get("deps_isav_clsf_cd");
		dm.deps_isav_no = (String)hash.get("deps_isav_no");
		dm.deps_isav_nm = (String)hash.get("deps_isav_nm");
		dm.dlco_clsf_cd = (String)hash.get("dlco_clsf_cd");
		dm.dlco_cd = (String)hash.get("dlco_cd");
		dm.compnm = (String)hash.get("compnm");
		dm.mtry_dt = (String)hash.get("mtry_dt");
		dm.tot_pymt_amt = (String)hash.get("tot_pymt_amt");
		dm.int_rate = (String)hash.get("int_rate");
				
		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_6011_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_FUNC_6000EJBHome home = (FC_FUNC_6000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_6000EJB");
			FC_FUNC_6000EJB ejb = home.create();

			ds = ejb.fc_func_6011_i(dm);
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
	public void fc_func_6012_d(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_6012_DDataSet ds = null;
		FC_FUNC_6012_DDM dm = new FC_FUNC_6012_DDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.slip_occr_dt = Util.checkString(req.getParameter("slip_occr_dt"));
		dm.slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
		dm.slip_seq = Util.checkString(req.getParameter("slip_seq"));
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.incmg_pers_ipadd = req.getRemoteAddr();

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_6012_DDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_FUNC_6000EJBHome home = (FC_FUNC_6000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_6000EJB");
			FC_FUNC_6000EJB ejb = home.create();

			ds = ejb.fc_func_6012_d(dm);
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
	public void fc_func_6020_m(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_6020_MDataSet ds = null;
		FC_FUNC_6020_MDM dm = new FC_FUNC_6020_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_6020_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_FUNC_6000EJBHome home = (FC_FUNC_6000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_6000EJB");
			FC_FUNC_6000EJB ejb = home.create();

			ds = ejb.fc_func_6020_m(dm);
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
	public void fc_func_6021_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_6021_LDataSet ds = null;
		FC_FUNC_6021_LDM dm = new FC_FUNC_6021_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.deps_isav_clsf_cd = Util.checkString(req.getParameter("deps_isav_clsf_cd"));
		dm.deps_isav_no = Util.checkString(req.getParameter("deps_isav_no"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_6021_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_FUNC_6000EJBHome home = (FC_FUNC_6000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_6000EJB");
			FC_FUNC_6000EJB ejb = home.create();

			ds = ejb.fc_func_6021_l(dm);
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
	public void fc_func_6022_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_6022_LDataSet ds = null;
		FC_FUNC_6022_LDM dm = new FC_FUNC_6022_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.deps_isav_clsf_cd = Util.checkString(req.getParameter("deps_isav_clsf_cd"));
		dm.deps_isav_no = Util.checkString(req.getParameter("deps_isav_no"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_6022_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_FUNC_6000EJBHome home = (FC_FUNC_6000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_6000EJB");
			FC_FUNC_6000EJB ejb = home.create();

			ds = ejb.fc_func_6022_l(dm);
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
	public void fc_func_6023_i(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_6023_IDataSet ds = null;
		FC_FUNC_6023_IDM dm = new FC_FUNC_6023_IDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.deps_isav_clsf_cd = Util.checkString(req.getParameter("deps_isav_clsf_cd"));
		dm.deps_isav_no = Util.checkString(req.getParameter("deps_isav_no"));
		dm.int_rate_chg_dt = Util.checkString(req.getParameter("int_rate_chg_dt"));
		dm.int_rate = Util.checkString(req.getParameter("int_rate"));
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		
		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_6023_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_FUNC_6000EJBHome home = (FC_FUNC_6000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_6000EJB");
			FC_FUNC_6000EJB ejb = home.create();

			ds = ejb.fc_func_6023_i(dm);
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
	public void fc_func_6024_d(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_6024_DDataSet ds = null;
		FC_FUNC_6024_DDM dm = new FC_FUNC_6024_DDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.deps_isav_clsf_cd = Util.checkString(req.getParameter("deps_isav_clsf_cd"));
		dm.deps_isav_no = Util.checkString(req.getParameter("deps_isav_no"));
		dm.int_rate_chg_dt = Util.checkString(req.getParameter("int_rate_chg_dt"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_6024_DDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_FUNC_6000EJBHome home = (FC_FUNC_6000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_6000EJB");
			FC_FUNC_6000EJB ejb = home.create();

			ds = ejb.fc_func_6024_d(dm);
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
	public void fc_func_6030_m(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_6030_MDataSet ds = null;
		FC_FUNC_6030_MDM dm = new FC_FUNC_6030_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_6030_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_FUNC_6000EJBHome home = (FC_FUNC_6000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_6000EJB");
			FC_FUNC_6000EJB ejb = home.create();

			ds = ejb.fc_func_6030_m(dm);
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
	public void fc_func_6031_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_6031_LDataSet ds = null;
		FC_FUNC_6031_LDM dm = new FC_FUNC_6031_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.deps_isav_clsf_cd = Util.checkString(req.getParameter("deps_isav_clsf_cd"));
		dm.deps_isav_no = Util.checkString(req.getParameter("deps_isav_no"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_6031_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_FUNC_6000EJBHome home = (FC_FUNC_6000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_6000EJB");
			FC_FUNC_6000EJB ejb = home.create();

			ds = ejb.fc_func_6031_l(dm);
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
	public void fc_func_6032_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_6032_LDataSet ds = null;
		FC_FUNC_6032_LDM dm = new FC_FUNC_6032_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.deps_isav_clsf_cd = Util.checkString(req.getParameter("deps_isav_clsf_cd"));
		dm.deps_isav_no = Util.checkString(req.getParameter("deps_isav_no"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_6032_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_FUNC_6000EJBHome home = (FC_FUNC_6000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_6000EJB");
			FC_FUNC_6000EJB ejb = home.create();

			ds = ejb.fc_func_6032_l(dm);
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
	public void fc_func_6033_i(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_6033_IDataSet ds = null;
		FC_FUNC_6033_IDM dm = new FC_FUNC_6033_IDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.deps_isav_clsf_cd = Util.checkString(req.getParameter("deps_isav_clsf_cd"));
		dm.deps_isav_no = Util.checkString(req.getParameter("deps_isav_no"));
		dm.recp_dt = Util.checkString(req.getParameter("recp_dt"));
		dm.int_rate = Util.checkString(req.getParameter("int_rate"));
		dm.tot_int_amt = Util.checkString(req.getParameter("tot_int_amt"));
		dm.corp_tax_amt = Util.checkString(req.getParameter("corp_tax_amt"));
		dm.aft_tax_int_amt = Util.checkString(req.getParameter("aft_tax_int_amt"));
		dm.unrcp_precpt_bal = Util.checkString(req.getParameter("unrcp_precpt_bal"));
		dm.int_gain_amt = Util.checkString(req.getParameter("int_gain_amt"));
		dm.rmks = Util.checkString(req.getParameter("rmks"));
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		dm.compgbcd = Util.checkString(req.getParameter("compgbcd"));
		dm.compcd = Util.checkString(req.getParameter("compcd"));
		dm.compnm = Util.checkString(req.getParameter("compnm"));
		dm.cost_gain_stot = Util.checkString(req.getParameter("cost_gain_stot"));
		dm.rcpay_amt_stot = Util.checkString(req.getParameter("rcpay_amt_stot"));
		dm.use_dept_cd = Util.getSessionParameterValue(req,"deptcd",true);

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_6033_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_FUNC_6000EJBHome home = (FC_FUNC_6000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_6000EJB");
			FC_FUNC_6000EJB ejb = home.create();

			ds = ejb.fc_func_6033_i(dm);
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
	public void fc_func_6034_d(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_6034_DDataSet ds = null;
		FC_FUNC_6034_DDM dm = new FC_FUNC_6034_DDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.deps_isav_clsf_cd = Util.checkString(req.getParameter("deps_isav_clsf_cd"));
		dm.deps_isav_no = Util.checkString(req.getParameter("deps_isav_no"));
		dm.recp_dt = Util.checkString(req.getParameter("recp_dt"));
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		dm.slip_occr_dt = Util.checkString(req.getParameter("slip_occr_dt"));
		dm.slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
		dm.slip_seq = Util.checkString(req.getParameter("slip_seq"));
		dm.upintsuigamt = Util.checkString(req.getParameter("upintsuigamt"));
		dm.uptotintamt = Util.checkString(req.getParameter("uptotintamt"));
		dm.cost_gain_stot = Util.checkString(req.getParameter("cost_gain_stot"));
		dm.rcpay_amt_stot = Util.checkString(req.getParameter("rcpay_amt_stot"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_6034_DDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_FUNC_6000EJBHome home = (FC_FUNC_6000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_6000EJB");
			FC_FUNC_6000EJB ejb = home.create();

			ds = ejb.fc_func_6034_d(dm);
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
	public void fc_func_6050_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_6050_LDataSet ds = null;
		FC_FUNC_6050_LDM dm = new FC_FUNC_6050_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.cymd = Util.checkString(req.getParameter("cymd"));
		dm.deps_isav_clsf_cd = Util.checkString(req.getParameter("deps_isav_clsf_cd"));
		dm.dlco_clsf_cd = Util.checkString(req.getParameter("dlco_clsf_cd"));
		dm.dlco_cd = Util.checkString(req.getParameter("dlco_cd"));
		dm.where_string = req.getParameter("where_string");

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_6050_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_FUNC_6000EJBHome home = (FC_FUNC_6000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_6000EJB");
			FC_FUNC_6000EJB ejb = home.create();

			ds = ejb.fc_func_6050_l(dm);
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
	public void fc_func_6051_m(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_6051_MDataSet ds = null;
		FC_FUNC_6051_MDM dm = new FC_FUNC_6051_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_6051_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_FUNC_6000EJBHome home = (FC_FUNC_6000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_6000EJB");
			FC_FUNC_6000EJB ejb = home.create();

			ds = ejb.fc_func_6051_m(dm);
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
	public void fc_func_6060_m(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_6060_MDataSet ds = null;
		FC_FUNC_6060_MDM dm = new FC_FUNC_6060_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_6060_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_FUNC_6000EJBHome home = (FC_FUNC_6000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_6000EJB");
			FC_FUNC_6000EJB ejb = home.create();

			ds = ejb.fc_func_6060_m(dm);
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
	public void fc_func_6061_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_6061_LDataSet ds = null;
		FC_FUNC_6061_LDM dm = new FC_FUNC_6061_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.deps_isav_clsf_cd = Util.checkString(req.getParameter("deps_isav_clsf_cd"));
		dm.deps_isav_no = Util.checkString(req.getParameter("deps_isav_no"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_6061_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_FUNC_6000EJBHome home = (FC_FUNC_6000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_6000EJB");
			FC_FUNC_6000EJB ejb = home.create();

			ds = ejb.fc_func_6061_l(dm);
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
	public void fc_func_6062_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_6062_LDataSet ds = null;
		FC_FUNC_6062_LDM dm = new FC_FUNC_6062_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.deps_isav_clsf_cd = Util.checkString(req.getParameter("deps_isav_clsf_cd"));
		dm.deps_isav_no = Util.checkString(req.getParameter("deps_isav_no"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_6062_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_FUNC_6000EJBHome home = (FC_FUNC_6000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_6000EJB");
			FC_FUNC_6000EJB ejb = home.create();

			ds = ejb.fc_func_6062_l(dm);
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
	public void fc_func_6063_i(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_6063_IDataSet ds = null;
		FC_FUNC_6063_IDM dm = new FC_FUNC_6063_IDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.deps_isav_clsf_cd = Util.checkString(req.getParameter("deps_isav_clsf_cd"));
		dm.deps_isav_no = Util.checkString(req.getParameter("deps_isav_no"));
		dm.deps_isav_nm = Util.checkString(req.getParameter("deps_isav_nm"));
		dm.dlco_clsf_cd = Util.checkString(req.getParameter("dlco_clsf_cd"));
		dm.dlco_cd = Util.checkString(req.getParameter("dlco_cd"));
		dm.dlco_nm = Util.checkString(req.getParameter("dlco_nm"));
		dm.comp_dt = Util.checkString(req.getParameter("comp_dt"));
		dm.mtry_dt = Util.checkString(req.getParameter("mtry_dt"));
		dm.pymt_mm = Util.checkString(req.getParameter("pymt_mm"));
		dm.tot_pymt_amt = Util.checkString(req.getParameter("tot_pymt_amt"));
		dm.cntr_amt = Util.checkString(req.getParameter("cntr_amt"));
		dm.tot_int = Util.checkString(req.getParameter("tot_int"));
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		dm.int_rate = Util.checkString(req.getParameter("int_rate"));
		dm.insr_amt = Util.checkString(req.getParameter("insr_amt"));
		dm.isav_amt = Util.checkString(req.getParameter("isav_amt"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_6063_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_FUNC_6000EJBHome home = (FC_FUNC_6000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_6000EJB");
			FC_FUNC_6000EJB ejb = home.create();

			ds = ejb.fc_func_6063_i(dm);
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
	public void fc_func_6064_d(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_6064_DDataSet ds = null;
		FC_FUNC_6064_DDM dm = new FC_FUNC_6064_DDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.deps_isav_clsf_cd = Util.checkString(req.getParameter("deps_isav_clsf_cd"));
		dm.deps_isav_no = Util.checkString(req.getParameter("deps_isav_no"));
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.incmg_pers_ipadd = req.getRemoteAddr();

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_6064_DDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_FUNC_6000EJBHome home = (FC_FUNC_6000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_6000EJB");
			FC_FUNC_6000EJB ejb = home.create();

			ds = ejb.fc_func_6064_d(dm);
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
	public void fc_func_6070_m(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_6070_MDataSet ds = null;
		FC_FUNC_6070_MDM dm = new FC_FUNC_6070_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_6070_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_FUNC_6000EJBHome home = (FC_FUNC_6000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_6000EJB");
			FC_FUNC_6000EJB ejb = home.create();

			ds = ejb.fc_func_6070_m(dm);
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
	public void fc_func_6071_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_6071_LDataSet ds = null;
		FC_FUNC_6071_LDM dm = new FC_FUNC_6071_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.deps_isav_clsf_cd = Util.checkString(req.getParameter("deps_isav_clsf_cd"));
		dm.deps_isav_no = Util.checkString(req.getParameter("deps_isav_no"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_6071_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_FUNC_6000EJBHome home = (FC_FUNC_6000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_6000EJB");
			FC_FUNC_6000EJB ejb = home.create();

			ds = ejb.fc_func_6071_l(dm);
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
	public void fc_func_6072_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_6072_LDataSet ds = null;
		FC_FUNC_6072_LDM dm = new FC_FUNC_6072_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.deps_isav_clsf_cd = Util.checkString(req.getParameter("deps_isav_clsf_cd"));
		dm.deps_isav_no = Util.checkString(req.getParameter("deps_isav_no"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_6072_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_FUNC_6000EJBHome home = (FC_FUNC_6000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_6000EJB");
			FC_FUNC_6000EJB ejb = home.create();

			ds = ejb.fc_func_6072_l(dm);
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
	public void fc_func_6076_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_6076_LDataSet ds = null;
		FC_FUNC_6076_LDM dm = new FC_FUNC_6076_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.deps_isav_clsf_cd = Util.checkString(req.getParameter("deps_isav_clsf_cd"));
		dm.deps_isav_no = Util.checkString(req.getParameter("deps_isav_no"));
		dm.comp_dt = Util.checkString(req.getParameter("comp_dt"));
		dm.mtry_dt = Util.checkString(req.getParameter("mtry_dt"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_6076_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_FUNC_6000EJBHome home = (FC_FUNC_6000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_6000EJB");
			FC_FUNC_6000EJB ejb = home.create();

			ds = ejb.fc_func_6076_l(dm);
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
	public void fc_func_6073_i(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_6073_IDataSet ds = null;
		FC_FUNC_6073_IDM dm = new FC_FUNC_6073_IDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.deps_isav_clsf_cd = Util.checkString(req.getParameter("deps_isav_clsf_cd"));
		dm.deps_isav_no = Util.checkString(req.getParameter("deps_isav_no"));
		dm.pymt_dt = Util.checkString(req.getParameter("pymt_dt"));
		dm.pymt_amt = Util.checkString(req.getParameter("pymt_amt"));
		dm.rmks = Util.checkString(req.getParameter("rmks"));
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		dm.use_dept_cd = Util.getSessionParameterValue(req,"deptcd",true);
		dm.dlco_clsf_cd = Util.checkString(req.getParameter("dlco_clsf_cd"));
		dm.dlco_cd = Util.checkString(req.getParameter("dlco_cd"));
		dm.dlco_nm = Util.checkString(req.getParameter("dlco_nm"));
		dm.comp_dt = Util.checkString(req.getParameter("comp_dt"));
		dm.mtry_dt = Util.checkString(req.getParameter("mtry_dt"));
		dm.cntr_amt = Util.checkString(req.getParameter("cntr_amt"));
		dm.obj_amt = Util.checkString(req.getParameter("obj_amt"));
		dm.etc_amt = Util.checkString(req.getParameter("etc_amt"));
		dm.insr_amt = Util.checkString(req.getParameter("insr_amt"));
		dm.isav_amt = Util.checkString(req.getParameter("isav_amt"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_6073_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_FUNC_6000EJBHome home = (FC_FUNC_6000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_6000EJB");
			FC_FUNC_6000EJB ejb = home.create();

			ds = ejb.fc_func_6073_i(dm);
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
	public void fc_func_6074_d(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_6074_DDataSet ds = null;
		FC_FUNC_6074_DDM dm = new FC_FUNC_6074_DDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.deps_isav_clsf_cd = Util.checkString(req.getParameter("deps_isav_clsf_cd"));
		dm.deps_isav_no = Util.checkString(req.getParameter("deps_isav_no"));
		dm.pymt_dt = Util.checkString(req.getParameter("pymt_dt"));
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		dm.slip_occr_dt = Util.checkString(req.getParameter("slip_occr_dt"));
		dm.slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
		dm.slip_seq = Util.checkString(req.getParameter("slip_seq"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_6074_DDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_FUNC_6000EJBHome home = (FC_FUNC_6000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_6000EJB");
			FC_FUNC_6000EJB ejb = home.create();

			ds = ejb.fc_func_6074_d(dm);
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
	public void fc_func_6075_i(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_6075_IDataSet ds = null;
		FC_FUNC_6075_IDM dm = new FC_FUNC_6075_IDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.deps_isav_clsf_cd = Util.checkString(req.getParameter("deps_isav_clsf_cd"));
		dm.deps_isav_no = Util.checkString(req.getParameter("deps_isav_no"));
		dm.ybydsdcamt = Util.checkString(req.getParameter("ybydsdcamt"));
		dm.ybydsdccymd = Util.checkString(req.getParameter("ybydsdccymd"));
		dm.dlco_clsf_cd = Util.checkString(req.getParameter("dlco_clsf_cd"));
		dm.dlco_cd = Util.checkString(req.getParameter("dlco_cd"));
		dm.dlco_nm = Util.checkString(req.getParameter("dlco_nm"));
		dm.rmks = Util.checkString(req.getParameter("rmks"));
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		dm.comp_dt = Util.checkString(req.getParameter("comp_dt"));
		dm.mtry_dt = Util.checkString(req.getParameter("mtry_dt"));
		dm.use_dept_cd = Util.getSessionParameterValue(req,"deptcd",true);

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_6075_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_FUNC_6000EJBHome home = (FC_FUNC_6000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_6000EJB");
			FC_FUNC_6000EJB ejb = home.create();

			ds = ejb.fc_func_6075_i(dm);
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
	public void fc_func_6077_d(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_6077_DDataSet ds = null;
		FC_FUNC_6077_DDM dm = new FC_FUNC_6077_DDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.deps_isav_clsf_cd = Util.checkString(req.getParameter("deps_isav_clsf_cd"));
		dm.deps_isav_no = Util.checkString(req.getParameter("deps_isav_no"));
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		dm.comp_dt = Util.checkString(req.getParameter("comp_dt"));
		dm.mtry_dt = Util.checkString(req.getParameter("mtry_dt"));
		dm.slip_occr_dt = Util.checkString(req.getParameter("slip_occr_dt"));
		dm.slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
		dm.slip_seq = Util.checkString(req.getParameter("slip_seq"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_6077_DDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_FUNC_6000EJBHome home = (FC_FUNC_6000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_6000EJB");
			FC_FUNC_6000EJB ejb = home.create();

			ds = ejb.fc_func_6077_d(dm);
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
	public void fc_func_6040_m(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_6040_MDataSet ds = null;
		FC_FUNC_6040_MDM dm = new FC_FUNC_6040_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		
		dm.print();
		
		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_6040_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_FUNC_6000EJBHome home = (FC_FUNC_6000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_6000EJB");
			FC_FUNC_6000EJB ejb = home.create();

			ds = ejb.fc_func_6040_m(dm);
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
	public void fc_func_6041_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_6041_LDataSet ds = null;
		FC_FUNC_6041_LDM dm = new FC_FUNC_6041_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.mtry_dt_fr = Util.checkString(req.getParameter("mtry_dt_fr"));
		dm.mtry_dt_to = Util.checkString(req.getParameter("mtry_dt_to"));
		dm.flag = Util.checkString(req.getParameter("flag"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_6041_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_FUNC_6000EJBHome home = (FC_FUNC_6000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_6000EJB");
			FC_FUNC_6000EJB ejb = home.create();

			ds = ejb.fc_func_6041_l(dm);
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
	public void fc_func_6042_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_6042_LDataSet ds = null;
		FC_FUNC_6042_LDM dm = new FC_FUNC_6042_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.deps_isav_clsf_cd = Util.checkString(req.getParameter("deps_isav_clsf_cd"));
		dm.deps_isav_no = Util.checkString(req.getParameter("deps_isav_no"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_6042_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_FUNC_6000EJBHome home = (FC_FUNC_6000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_6000EJB");
			FC_FUNC_6000EJB ejb = home.create();

			ds = ejb.fc_func_6042_l(dm);
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
	   public void fc_func_6043_i(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		      FC_FUNC_6043_IDataSet ds = null;
		      FC_FUNC_6043_IDM dm = new FC_FUNC_6043_IDM();

		      dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		      dm.use_dept_cd = Util.getSessionParameterValue(req,"deptcd",true);
		      dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		      dm.incmg_pers_ipadd = req.getRemoteAddr();
		      
		      String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		      Hashtable hash = getHashMultiUpdateData(multiUpdateData);
		      
		      dm.deps_isav_clsf_cd = (String)hash.get("deps_isav_clsf_cd");
		      dm.deps_isav_no = (String)hash.get("deps_isav_no");
		      dm.int_rate = (String)hash.get("int_rate");
		      dm.hy_tot_int_amt = (String)hash.get("hy_tot_int_amt");
		      dm.hy_corp_tax_amt = (String)hash.get("hy_corp_tax_amt");
		      dm.hy_unrcp_precpt_bal = (String)hash.get("cost_gain_stot");
		      dm.hy_rmks = (String)hash.get("hy_rmks");
		      dm.dlco_clsf_cd = (String)hash.get("dlco_clsf_cd");
		      dm.dlco_cd = (String)hash.get("dlco_cd");
		      dm.compnm = (String)hash.get("compnm");
		      dm.hy_cctr_dt = (String)hash.get("hy_cctr_dt");
		      dm.hy_impt_amt = (String)hash.get("hy_impt_amt");
		      dm.rmks = (String)hash.get("rmks");
		      dm.hy_patr_budg_cd = (String)hash.get("hy_patr_budg_cd");
		      dm.hy_deps_clsf_cd = (String)hash.get("hy_deps_clsf_cd");
		      dm.tot_pymt_amt = (String)hash.get("tot_pymt_amt");
		      dm.cost_gain_stot = (String)hash.get("cost_gain_stot");
		      dm.rcpay_amt_stot = (String)hash.get("rcpay_amt_stot");
		      dm.comp_dt = (String)hash.get("comp_dt");
		      dm.mtry_dt = (String)hash.get("mtry_dt");
		      dm.hy_frex_cd = (String)hash.get("hy_frex_cd");
		      dm.hy_exrate = (String)hash.get("hy_exrate");
		      dm.hy_frex_amt = (String)hash.get("hy_frex_amt");
		      dm.hy_def_tax_amt = (String)hash.get("hy_def_tax_amt");
		
		/*
		dm.deps_isav_clsf_cd = (String)hash.get("deps_isav_clsf_cd");
		dm.deps_isav_no = (String)hash.get("deps_isav_no");
		dm.int_rate = (String)hash.get("int_rate");
		dm.hy_tot_int_amt = (String)hash.get("hy_tot_int_amt");
		dm.hy_corp_tax_amt = (String)hash.get("hy_corp_tax_amt");
		dm.hy_unrcp_precpt_bal = (String)hash.get("hy_unrcp_precpt_bal");
		dm.hy_rmks = (String)hash.get("hy_rmks");
		dm.dlco_clsf_cd = (String)hash.get("dlco_clsf_cd");
		dm.dlco_cd = (String)hash.get("dlco_cd");
		dm.compnm = (String)hash.get("compnm");
		dm.hy_cctr_dt = (String)hash.get("hy_cctr_dt");
		dm.hy_impt_amt = (String)hash.get("hy_impt_amt");
		dm.rmks = (String)hash.get("rmks");
		dm.hy_patr_budg_cd = (String)hash.get("hy_patr_budg_cd");
		dm.hy_deps_clsf_cd = (String)hash.get("hy_deps_clsf_cd");
		dm.tot_pymt_amt = (String)hash.get("tot_pymt_amt");
		dm.cost_gain_stot = (String)hash.get("cost_gain_stot");
		dm.rcpay_amt_stot = (String)hash.get("rcpay_amt_stot");
		dm.comp_dt = (String)hash.get("comp_dt");
		dm.mtry_dt = (String)hash.get("mtry_dt");
		dm.hy_frex_cd = (String)hash.get("hy_frex_cd");
		dm.hy_exrate = (String)hash.get("hy_exrate");
		dm.hy_frex_amt = (String)hash.get("hy_frex_amt");
		*/		
		
		dm.print();
		
		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_6043_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */		

		/* EJB 수정전 시작
		try {
			FC_FUNC_6000EJBHome home = (FC_FUNC_6000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_6000EJB");
			FC_FUNC_6000EJB ejb = home.create();

			ds = ejb.fc_func_6043_i(dm);
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
	public void fc_func_6044_d(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_6044_DDataSet ds = null;
		FC_FUNC_6044_DDM dm = new FC_FUNC_6044_DDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.deps_isav_clsf_cd = Util.checkString(req.getParameter("deps_isav_clsf_cd"));
		dm.deps_isav_no = Util.checkString(req.getParameter("deps_isav_no"));
		dm.recp_dt = Util.checkString(req.getParameter("recp_dt"));
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		dm.slip_occr_dt = Util.checkString(req.getParameter("slip_occr_dt"));
		dm.slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
		dm.slip_seq = Util.checkString(req.getParameter("slip_seq"));
		dm.upintsuigamt = Util.checkString(req.getParameter("upintsuigamt"));
		dm.uptotintamt = Util.checkString(req.getParameter("uptotintamt"));
		dm.cost_gain_stot = Util.checkString(req.getParameter("cost_gain_stot"));
		dm.rcpay_amt_stot = Util.checkString(req.getParameter("rcpay_amt_stot"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_6044_DDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_FUNC_6000EJBHome home = (FC_FUNC_6000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_6000EJB");
			FC_FUNC_6000EJB ejb = home.create();

			ds = ejb.fc_func_6044_d(dm);
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
	public void fc_func_6500_m(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_6500_MDataSet ds = null;
		FC_FUNC_6500_MDM dm = new FC_FUNC_6500_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);

		dm.print();
		
		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_6500_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/* EJB 수정전 시작
		try {
			FC_FUNC_6000EJBHome home = (FC_FUNC_6000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_6000EJB");
			FC_FUNC_6000EJB ejb = home.create();

			ds = ejb.fc_func_6000_m(dm);
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
	public void fc_func_6501_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_6501_LDataSet ds = null;
		FC_FUNC_6501_LDM dm = new FC_FUNC_6501_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.deps_isav_clsf_cd = Util.checkString(req.getParameter("deps_isav_clsf_cd"));
		dm.deps_isav_no = Util.checkString(req.getParameter("deps_isav_no"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_6501_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_FUNC_6000EJBHome home = (FC_FUNC_6000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_6000EJB");
			FC_FUNC_6000EJB ejb = home.create();

			ds = ejb.fc_func_6001_l(dm);
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
	public void fc_func_6502_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_6502_LDataSet ds = null;
		FC_FUNC_6502_LDM dm = new FC_FUNC_6502_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.deps_isav_clsf_cd = Util.checkString(req.getParameter("deps_isav_clsf_cd"));
		dm.deps_isav_no = Util.checkString(req.getParameter("deps_isav_no"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_6502_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_FUNC_6000EJBHome home = (FC_FUNC_6000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_6000EJB");
			FC_FUNC_6000EJB ejb = home.create();

			ds = ejb.fc_func_6002_l(dm);
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
	public void fc_func_6503_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_6503_LDataSet ds = null;
		FC_FUNC_6503_LDM dm = new FC_FUNC_6503_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.deps_isav_clsf_cd = Util.checkString(req.getParameter("deps_isav_clsf_cd"));
		dm.deps_isav_no = Util.checkString(req.getParameter("deps_isav_no"));
		dm.occr_clsf_cd = Util.checkString(req.getParameter("occr_clsf_cd"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_6503_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_FUNC_6000EJBHome home = (FC_FUNC_6000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_6000EJB");
			FC_FUNC_6000EJB ejb = home.create();

			ds = ejb.fc_func_6003_l(dm);
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
	public void fc_func_6504_i(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_6504_IDataSet ds = null;
		FC_FUNC_6504_IDM dm = new FC_FUNC_6504_IDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.deps_isav_clsf_cd = Util.checkString(req.getParameter("deps_isav_clsf_cd"));
		dm.deps_isav_no = Util.checkString(req.getParameter("deps_isav_no"));
		dm.deps_isav_nm = Util.checkString(req.getParameter("deps_isav_nm"));
		dm.dlco_clsf_cd = Util.checkString(req.getParameter("dlco_clsf_cd"));
		dm.dlco_cd = Util.checkString(req.getParameter("dlco_cd"));
		dm.compnm = Util.checkString(req.getParameter("compnm"));
		dm.comp_dt = Util.checkString(req.getParameter("comp_dt"));
		dm.mtry_dt = Util.checkString(req.getParameter("mtry_dt"));
		dm.tot_pymt_amt = Util.checkString(req.getParameter("tot_pymt_amt"));
		dm.mm_int = Util.checkString(req.getParameter("mm_int"));
		dm.tot_int = Util.checkString(req.getParameter("tot_int"));
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		dm.int_rate = Util.checkString(req.getParameter("int_rate"));
		dm.rmks = Util.checkString(req.getParameter("rmks"));
		dm.use_dept_cd = Util.getSessionParameterValue(req,"deptcd",true);
		dm.frex_cd = Util.checkString(req.getParameter("frex_cd"));
		dm.exrate = Util.checkString(req.getParameter("exrate"));
		dm.frex_amt = Util.checkString(req.getParameter("frex_amt"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_6504_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_FUNC_6000EJBHome home = (FC_FUNC_6000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_6000EJB");
			FC_FUNC_6000EJB ejb = home.create();

			ds = ejb.fc_func_6004_i(dm);
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
	public void fc_func_6505_d(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_6505_DDataSet ds = null;
		FC_FUNC_6505_DDM dm = new FC_FUNC_6505_DDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.deps_isav_clsf_cd = Util.checkString(req.getParameter("deps_isav_clsf_cd"));
		dm.deps_isav_no = Util.checkString(req.getParameter("deps_isav_no"));
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.incmg_pers_ipadd = req.getRemoteAddr();

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_6505_DDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_FUNC_6000EJBHome home = (FC_FUNC_6000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_6000EJB");
			FC_FUNC_6000EJB ejb = home.create();

			ds = ejb.fc_func_6005_d(dm);
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
	public void fc_func_6510_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_6510_LDataSet ds = null;
		FC_FUNC_6510_LDM dm = new FC_FUNC_6510_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.comp_dt = Util.checkString(req.getParameter("comp_dt"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_6510_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_FUNC_6000EJBHome home = (FC_FUNC_6000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_6000EJB");
			FC_FUNC_6000EJB ejb = home.create();

			ds = ejb.fc_func_6010_l(dm);
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
	public void fc_func_6511_i(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_6511_IDataSet ds = null;
		FC_FUNC_6511_IDM dm = new FC_FUNC_6511_IDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.comp_dt = Util.checkString(req.getParameter("comp_dt"));
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		dm.rmks = Util.checkString(req.getParameter("rmks"));
		dm.use_dept_cd = Util.getSessionParameterValue(req,"deptcd",true);
		
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);
		
		dm.deps_isav_clsf_cd = (String)hash.get("deps_isav_clsf_cd");
		dm.deps_isav_no = (String)hash.get("deps_isav_no");
		dm.deps_isav_nm = (String)hash.get("deps_isav_nm");
		dm.dlco_clsf_cd = (String)hash.get("dlco_clsf_cd");
		dm.dlco_cd = (String)hash.get("dlco_cd");
		dm.compnm = (String)hash.get("compnm");
		dm.mtry_dt = (String)hash.get("mtry_dt");
		dm.tot_pymt_amt = (String)hash.get("tot_pymt_amt");
		dm.int_rate = (String)hash.get("int_rate");
				
		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_6511_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_FUNC_6000EJBHome home = (FC_FUNC_6000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_6000EJB");
			FC_FUNC_6000EJB ejb = home.create();

			ds = ejb.fc_func_6011_i(dm);
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
	public void fc_func_6512_d(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_6512_DDataSet ds = null;
		FC_FUNC_6512_DDM dm = new FC_FUNC_6512_DDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.slip_occr_dt = Util.checkString(req.getParameter("slip_occr_dt"));
		dm.slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
		dm.slip_seq = Util.checkString(req.getParameter("slip_seq"));
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.incmg_pers_ipadd = req.getRemoteAddr();

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_6512_DDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_FUNC_6000EJBHome home = (FC_FUNC_6000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_6000EJB");
			FC_FUNC_6000EJB ejb = home.create();

			ds = ejb.fc_func_6012_d(dm);
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
	public void fc_func_6520_m(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_6520_MDataSet ds = null;
		FC_FUNC_6520_MDM dm = new FC_FUNC_6520_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_6520_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_FUNC_6000EJBHome home = (FC_FUNC_6000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_6000EJB");
			FC_FUNC_6000EJB ejb = home.create();

			ds = ejb.fc_func_6020_m(dm);
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
	public void fc_func_6521_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_6521_LDataSet ds = null;
		FC_FUNC_6521_LDM dm = new FC_FUNC_6521_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.deps_isav_clsf_cd = Util.checkString(req.getParameter("deps_isav_clsf_cd"));
		dm.deps_isav_no = Util.checkString(req.getParameter("deps_isav_no"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_6521_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_FUNC_6000EJBHome home = (FC_FUNC_6000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_6000EJB");
			FC_FUNC_6000EJB ejb = home.create();

			ds = ejb.fc_func_6021_l(dm);
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
	public void fc_func_6522_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_6522_LDataSet ds = null;
		FC_FUNC_6522_LDM dm = new FC_FUNC_6522_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.deps_isav_clsf_cd = Util.checkString(req.getParameter("deps_isav_clsf_cd"));
		dm.deps_isav_no = Util.checkString(req.getParameter("deps_isav_no"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_6522_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_FUNC_6000EJBHome home = (FC_FUNC_6000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_6000EJB");
			FC_FUNC_6000EJB ejb = home.create();

			ds = ejb.fc_func_6022_l(dm);
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
	public void fc_func_6523_i(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_6523_IDataSet ds = null;
		FC_FUNC_6523_IDM dm = new FC_FUNC_6523_IDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.deps_isav_clsf_cd = Util.checkString(req.getParameter("deps_isav_clsf_cd"));
		dm.deps_isav_no = Util.checkString(req.getParameter("deps_isav_no"));
		dm.int_rate_chg_dt = Util.checkString(req.getParameter("int_rate_chg_dt"));
		dm.int_rate = Util.checkString(req.getParameter("int_rate"));
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		
		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_6523_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_FUNC_6000EJBHome home = (FC_FUNC_6000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_6000EJB");
			FC_FUNC_6000EJB ejb = home.create();

			ds = ejb.fc_func_6023_i(dm);
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
	public void fc_func_6524_d(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_6524_DDataSet ds = null;
		FC_FUNC_6524_DDM dm = new FC_FUNC_6524_DDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.deps_isav_clsf_cd = Util.checkString(req.getParameter("deps_isav_clsf_cd"));
		dm.deps_isav_no = Util.checkString(req.getParameter("deps_isav_no"));
		dm.int_rate_chg_dt = Util.checkString(req.getParameter("int_rate_chg_dt"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_6524_DDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_FUNC_6000EJBHome home = (FC_FUNC_6000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_6000EJB");
			FC_FUNC_6000EJB ejb = home.create();

			ds = ejb.fc_func_6024_d(dm);
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
	public void fc_func_6530_m(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_6530_MDataSet ds = null;
		FC_FUNC_6530_MDM dm = new FC_FUNC_6530_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_6530_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_FUNC_6000EJBHome home = (FC_FUNC_6000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_6000EJB");
			FC_FUNC_6000EJB ejb = home.create();

			ds = ejb.fc_func_6030_m(dm);
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
	public void fc_func_6531_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_6531_LDataSet ds = null;
		FC_FUNC_6531_LDM dm = new FC_FUNC_6531_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.deps_isav_clsf_cd = Util.checkString(req.getParameter("deps_isav_clsf_cd"));
		dm.deps_isav_no = Util.checkString(req.getParameter("deps_isav_no"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_6531_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_FUNC_6000EJBHome home = (FC_FUNC_6000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_6000EJB");
			FC_FUNC_6000EJB ejb = home.create();

			ds = ejb.fc_func_6031_l(dm);
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
	public void fc_func_6532_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_6532_LDataSet ds = null;
		FC_FUNC_6532_LDM dm = new FC_FUNC_6532_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.deps_isav_clsf_cd = Util.checkString(req.getParameter("deps_isav_clsf_cd"));
		dm.deps_isav_no = Util.checkString(req.getParameter("deps_isav_no"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_6532_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_FUNC_6000EJBHome home = (FC_FUNC_6000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_6000EJB");
			FC_FUNC_6000EJB ejb = home.create();

			ds = ejb.fc_func_6032_l(dm);
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
	public void fc_func_6533_i(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_6533_IDataSet ds = null;
		FC_FUNC_6533_IDM dm = new FC_FUNC_6533_IDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.deps_isav_clsf_cd = Util.checkString(req.getParameter("deps_isav_clsf_cd"));
		dm.deps_isav_no = Util.checkString(req.getParameter("deps_isav_no"));
		dm.recp_dt = Util.checkString(req.getParameter("recp_dt"));
		dm.int_rate = Util.checkString(req.getParameter("int_rate"));
		dm.tot_int_amt = Util.checkString(req.getParameter("tot_int_amt"));
		dm.corp_tax_amt = Util.checkString(req.getParameter("corp_tax_amt"));
		dm.aft_tax_int_amt = Util.checkString(req.getParameter("aft_tax_int_amt"));
		dm.unrcp_precpt_bal = Util.checkString(req.getParameter("unrcp_precpt_bal"));
		dm.int_gain_amt = Util.checkString(req.getParameter("int_gain_amt"));
		dm.rmks = Util.checkString(req.getParameter("rmks"));
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		dm.compgbcd = Util.checkString(req.getParameter("compgbcd"));
		dm.compcd = Util.checkString(req.getParameter("compcd"));
		dm.compnm = Util.checkString(req.getParameter("compnm"));
		dm.cost_gain_stot = Util.checkString(req.getParameter("cost_gain_stot"));
		dm.rcpay_amt_stot = Util.checkString(req.getParameter("rcpay_amt_stot"));
		dm.use_dept_cd = Util.getSessionParameterValue(req,"deptcd",true);

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_6533_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_FUNC_6000EJBHome home = (FC_FUNC_6000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_6000EJB");
			FC_FUNC_6000EJB ejb = home.create();

			ds = ejb.fc_func_6033_i(dm);
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
	public void fc_func_6534_d(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_6534_DDataSet ds = null;
		FC_FUNC_6534_DDM dm = new FC_FUNC_6534_DDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.deps_isav_clsf_cd = Util.checkString(req.getParameter("deps_isav_clsf_cd"));
		dm.deps_isav_no = Util.checkString(req.getParameter("deps_isav_no"));
		dm.recp_dt = Util.checkString(req.getParameter("recp_dt"));
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		dm.slip_occr_dt = Util.checkString(req.getParameter("slip_occr_dt"));
		dm.slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
		dm.slip_seq = Util.checkString(req.getParameter("slip_seq"));
		dm.upintsuigamt = Util.checkString(req.getParameter("upintsuigamt"));
		dm.uptotintamt = Util.checkString(req.getParameter("uptotintamt"));
		dm.cost_gain_stot = Util.checkString(req.getParameter("cost_gain_stot"));
		dm.rcpay_amt_stot = Util.checkString(req.getParameter("rcpay_amt_stot"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_6534_DDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_FUNC_6000EJBHome home = (FC_FUNC_6000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_6000EJB");
			FC_FUNC_6000EJB ejb = home.create();

			ds = ejb.fc_func_6034_d(dm);
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
	public void fc_func_6540_m(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_6540_MDataSet ds = null;
		FC_FUNC_6540_MDM dm = new FC_FUNC_6540_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		
		dm.print();
		
		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_6540_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_FUNC_6000EJBHome home = (FC_FUNC_6000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_6000EJB");
			FC_FUNC_6000EJB ejb = home.create();

			ds = ejb.fc_func_6040_m(dm);
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
	public void fc_func_6541_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_6541_LDataSet ds = null;
		FC_FUNC_6541_LDM dm = new FC_FUNC_6541_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.mtry_dt_fr = Util.checkString(req.getParameter("mtry_dt_fr"));
		dm.mtry_dt_to = Util.checkString(req.getParameter("mtry_dt_to"));
		dm.flag = Util.checkString(req.getParameter("flag"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_6541_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_FUNC_6000EJBHome home = (FC_FUNC_6000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_6000EJB");
			FC_FUNC_6000EJB ejb = home.create();

			ds = ejb.fc_func_6041_l(dm);
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
	public void fc_func_6542_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_6542_LDataSet ds = null;
		FC_FUNC_6542_LDM dm = new FC_FUNC_6542_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.deps_isav_clsf_cd = Util.checkString(req.getParameter("deps_isav_clsf_cd"));
		dm.deps_isav_no = Util.checkString(req.getParameter("deps_isav_no"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_6542_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_FUNC_6000EJBHome home = (FC_FUNC_6000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_6000EJB");
			FC_FUNC_6000EJB ejb = home.create();

			ds = ejb.fc_func_6042_l(dm);
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
	public void fc_func_6543_i(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_6543_IDataSet ds = null;
		FC_FUNC_6543_IDM dm = new FC_FUNC_6543_IDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.use_dept_cd = Util.getSessionParameterValue(req,"deptcd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);
		
		dm.deps_isav_clsf_cd = (String)hash.get("deps_isav_clsf_cd");
		dm.deps_isav_no = (String)hash.get("deps_isav_no");
		dm.int_rate = (String)hash.get("int_rate");
		dm.hy_tot_int_amt = (String)hash.get("hy_tot_int_amt");
		dm.hy_corp_tax_amt = (String)hash.get("hy_corp_tax_amt");
		dm.hy_def_tax_amt = (String)hash.get("hy_def_tax_amt");
		dm.hy_unrcp_precpt_bal = (String)hash.get("cost_gain_stot");
		dm.hy_rmks = (String)hash.get("hy_rmks");
		dm.dlco_clsf_cd = (String)hash.get("dlco_clsf_cd");
		dm.dlco_cd = (String)hash.get("dlco_cd");
		dm.compnm = (String)hash.get("compnm");
		dm.hy_cctr_dt = (String)hash.get("hy_cctr_dt");
		dm.hy_impt_amt = (String)hash.get("hy_impt_amt");
		dm.rmks = (String)hash.get("rmks");
		dm.hy_patr_budg_cd = (String)hash.get("hy_patr_budg_cd");
		dm.hy_deps_clsf_cd = (String)hash.get("hy_deps_clsf_cd");
		dm.tot_pymt_amt = (String)hash.get("tot_pymt_amt");
		dm.cost_gain_stot = (String)hash.get("cost_gain_stot");
		dm.rcpay_amt_stot = (String)hash.get("rcpay_amt_stot");
		dm.comp_dt = (String)hash.get("comp_dt");
		dm.mtry_dt = (String)hash.get("mtry_dt");
		dm.hy_frex_cd = (String)hash.get("hy_frex_cd");
		dm.hy_exrate = (String)hash.get("hy_exrate");
		dm.hy_frex_amt = (String)hash.get("hy_frex_amt");
		
		/*
		dm.deps_isav_clsf_cd = (String)hash.get("deps_isav_clsf_cd");
		dm.deps_isav_no = (String)hash.get("deps_isav_no");
		dm.int_rate = (String)hash.get("int_rate");
		dm.hy_tot_int_amt = (String)hash.get("hy_tot_int_amt");
		dm.hy_corp_tax_amt = (String)hash.get("hy_corp_tax_amt");
		dm.hy_unrcp_precpt_bal = (String)hash.get("hy_unrcp_precpt_bal");
		dm.hy_rmks = (String)hash.get("hy_rmks");
		dm.dlco_clsf_cd = (String)hash.get("dlco_clsf_cd");
		dm.dlco_cd = (String)hash.get("dlco_cd");
		dm.compnm = (String)hash.get("compnm");
		dm.hy_cctr_dt = (String)hash.get("hy_cctr_dt");
		dm.hy_impt_amt = (String)hash.get("hy_impt_amt");
		dm.rmks = (String)hash.get("rmks");
		dm.hy_patr_budg_cd = (String)hash.get("hy_patr_budg_cd");
		dm.hy_deps_clsf_cd = (String)hash.get("hy_deps_clsf_cd");
		dm.tot_pymt_amt = (String)hash.get("tot_pymt_amt");
		dm.cost_gain_stot = (String)hash.get("cost_gain_stot");
		dm.rcpay_amt_stot = (String)hash.get("rcpay_amt_stot");
		dm.comp_dt = (String)hash.get("comp_dt");
		dm.mtry_dt = (String)hash.get("mtry_dt");
		dm.hy_frex_cd = (String)hash.get("hy_frex_cd");
		dm.hy_exrate = (String)hash.get("hy_exrate");
		dm.hy_frex_amt = (String)hash.get("hy_frex_amt");
		*/		
		
		dm.print();
		
		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_6543_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */		

		/* EJB 수정전 시작
		try {
			FC_FUNC_6000EJBHome home = (FC_FUNC_6000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_6000EJB");
			FC_FUNC_6000EJB ejb = home.create();

			ds = ejb.fc_func_6043_i(dm);
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
	public void fc_func_6544_d(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_6544_DDataSet ds = null;
		FC_FUNC_6544_DDM dm = new FC_FUNC_6544_DDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.deps_isav_clsf_cd = Util.checkString(req.getParameter("deps_isav_clsf_cd"));
		dm.deps_isav_no = Util.checkString(req.getParameter("deps_isav_no"));
		dm.recp_dt = Util.checkString(req.getParameter("recp_dt"));
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		dm.slip_occr_dt = Util.checkString(req.getParameter("slip_occr_dt"));
		dm.slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
		dm.slip_seq = Util.checkString(req.getParameter("slip_seq"));
		dm.upintsuigamt = Util.checkString(req.getParameter("upintsuigamt"));
		dm.uptotintamt = Util.checkString(req.getParameter("uptotintamt"));
		dm.cost_gain_stot = Util.checkString(req.getParameter("cost_gain_stot"));
		dm.rcpay_amt_stot = Util.checkString(req.getParameter("rcpay_amt_stot"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_6544_DDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_FUNC_6000EJBHome home = (FC_FUNC_6000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_6000EJB");
			FC_FUNC_6000EJB ejb = home.create();

			ds = ejb.fc_func_6044_d(dm);
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
	public void fc_func_6550_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_6550_LDataSet ds = null;
		FC_FUNC_6550_LDM dm = new FC_FUNC_6550_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.cymd = Util.checkString(req.getParameter("cymd"));
		dm.deps_isav_clsf_cd = Util.checkString(req.getParameter("deps_isav_clsf_cd"));
		dm.dlco_clsf_cd = Util.checkString(req.getParameter("dlco_clsf_cd"));
		dm.dlco_cd = Util.checkString(req.getParameter("dlco_cd"));
		dm.where_string = req.getParameter("where_string");

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_6550_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_FUNC_6000EJBHome home = (FC_FUNC_6000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_6000EJB");
			FC_FUNC_6000EJB ejb = home.create();

			ds = ejb.fc_func_6050_l(dm);
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
	public void fc_func_6551_m(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_6551_MDataSet ds = null;
		FC_FUNC_6551_MDM dm = new FC_FUNC_6551_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_6551_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_FUNC_6000EJBHome home = (FC_FUNC_6000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_6000EJB");
			FC_FUNC_6000EJB ejb = home.create();

			ds = ejb.fc_func_6051_m(dm);
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

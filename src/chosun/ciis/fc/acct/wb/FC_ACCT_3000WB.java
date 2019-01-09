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
//import utils.system;

import chosun.ciis.fc.acct.dao.*;
import chosun.ciis.fc.acct.dm.*;
import chosun.ciis.fc.acct.ds.*;

public class FC_ACCT_3000WB extends chosun.ciis.co.base.wb.BaseWB {
	public final String ROW_SEPARATOR = "|";
    public final String COL_SEPARATOR = "#";
    FC_ACCT_3000DAO dao = new FC_ACCT_3000DAO();
    	
	public void getDummyList(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_9999_LDataSet ds = null;
		FC_ACCT_9999_LDM dm = new FC_ACCT_9999_LDM();
		
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_9999_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/* EJB 수정전 시작
		try {
			FC_ACCT_3000EJBHome home = (FC_ACCT_3000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_3000EJB");
			FC_ACCT_3000EJB ejb = home.create();
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
	
	public void fc_acct_3000_m(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_3000_MDataSet ds = null;
		FC_ACCT_3000_MDM dm = new FC_ACCT_3000_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_3000_MDataSet)manager.executeCall(dm);

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
	
	public void fc_acct_3001_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_3001_LDataSet ds = null;
		FC_ACCT_3001_LDM dm = new FC_ACCT_3001_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.cost_gain_clsf_cd = Util.checkString(req.getParameter("cost_gain_clsf_cd"));
		dm.stlm_dt = Util.checkString(req.getParameter("stlm_dt"));

		dm.print();
		
		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_3001_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/* EJB 수정전 시작
		try {
			FC_ACCT_3000EJBHome home = (FC_ACCT_3000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_3000EJB");
			FC_ACCT_3000EJB ejb = home.create();

			ds = ejb.fc_acct_3001_l(dm);
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
		dm.cost_gain_clsf_cd = (String)hash.get("cost_gain_clsf_cd");
		dm.stlm_dt = (String)hash.get("stlm_dt");
		*******************************************************************************************/
	}
	public void fc_acct_3002_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_3002_LDataSet ds = null;
		FC_ACCT_3002_LDM dm = new FC_ACCT_3002_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.cost_gain_clsf_cd = Util.checkString(req.getParameter("cost_gain_clsf_cd"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_3002_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/* EJB 수정전 시작
		try {
			FC_ACCT_3000EJBHome home = (FC_ACCT_3000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_3000EJB");
			FC_ACCT_3000EJB ejb = home.create();

			ds = ejb.fc_acct_3002_l(dm);
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
		dm.cost_gain_clsf_cd = (String)hash.get("cost_gain_clsf_cd");
		*******************************************************************************************/
	}
	public void fc_acct_3003_i(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_3003_IDataSet ds = null;
		FC_ACCT_3003_IDM dm = new FC_ACCT_3003_IDM();

		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);
		
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.stlm_dt = Util.checkString(req.getParameter("stlm_dt"));
		dm.rmks = Util.checkString(req.getParameter("rmks"));
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.incmg_pers_ipadd = req.getRemoteAddr();		
		dm.prelae_pay_clsf_cd = (String)hash.get("prelae_pay_clsf_cd1");
		dm.mang_clsf_cd = (String)hash.get("mang_clsf_cd1");
		dm.mang_no = (String)hash.get("mang_no");
		dm.comp_dt = (String)hash.get("comp_dt");
		dm.mtry_dt = (String)hash.get("mtry_dt");
		dm.tot_pymt_amt = (String)hash.get("tot_pymt_amt");
		dm.dds = (String)hash.get("dds");
		dm.int_rate = (String)hash.get("int_rate");
		dm.prvmm_bal = (String)hash.get("prvmm_bal");
		dm.thmm_dr = (String)hash.get("thmm_dr");
		dm.thmm_crdt = (String)hash.get("thmm_crdt");
		dm.thmm_bal = (String)hash.get("thmm_bal");
		dm.clam_dept_cd = Util.getSessionParameterValue(req, "deptcd", true);
		dm.incmg_dt = Util.checkString(req.getParameter("incmg_dt"));
		
		dm.print();
		
		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_3003_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/* EJB 수정전 시작
		try {
			FC_ACCT_3000EJBHome home = (FC_ACCT_3000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_3000EJB");
			FC_ACCT_3000EJB ejb = home.create();

			ds = ejb.fc_acct_3003_i(dm);
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
		dm.stlm_dt = (String)hash.get("stlm_dt");
		dm.rmks = (String)hash.get("rmks");
		dm.incmg_pers = (String)hash.get("incmg_pers");
		dm.incmg_pers_ipadd = (String)hash.get("incmg_pers_ipadd");
		dm.prelae_pay_clsf_cd = (String)hash.get("prelae_pay_clsf_cd");
		dm.mang_clsf_cd = (String)hash.get("mang_clsf_cd");
		dm.mang_no = (String)hash.get("mang_no");
		dm.comp_dt = (String)hash.get("comp_dt");
		dm.mtry_dt = (String)hash.get("mtry_dt");
		dm.tot_pymt_amt = (String)hash.get("tot_pymt_amt");
		dm.dds = (String)hash.get("dds");
		dm.int_rate = (String)hash.get("int_rate");
		dm.prvmm_bal = (String)hash.get("prvmm_bal");
		dm.thmm_dr = (String)hash.get("thmm_dr");
		dm.thmm_crdt = (String)hash.get("thmm_crdt");
		dm.thmm_bal = (String)hash.get("thmm_bal");
		dm.clam_dept_cd = (String)hash.get("clam_dept_cd");
		dm.incmg_dt = (String)hash.get("incmg_dt");
		*******************************************************************************************/
	}	
	public void fc_acct_3004_d(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_3004_DDataSet ds = null;
		FC_ACCT_3004_DDM dm = new FC_ACCT_3004_DDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);		
		dm.slip_occr_dt = Util.checkString(req.getParameter("slip_occr_dt"));
		dm.slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
		dm.slip_seq = Util.checkString(req.getParameter("slip_seq"));
		dm.stlm_dt = Util.checkString(req.getParameter("stlm_dt"));
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true); 		
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		dm.pch_count = Long.parseLong(req.getParameter("pch_count"));
		
		dm.print();
		
		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_3004_DDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/* EJB 수정전 시작
		try {
			FC_ACCT_3000EJBHome home = (FC_ACCT_3000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_3000EJB");
			FC_ACCT_3000EJB ejb = home.create();

			ds = ejb.fc_acct_3004_d(dm);
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
		dm.stlm_dt = (String)hash.get("stlm_dt");
		dm.incmg_pers = (String)hash.get("incmg_pers");
		dm.incmg_pers_ipadd = (String)hash.get("incmg_pers_ipadd");
		dm.pch_count = (String)hash.get("pch_count");
		*******************************************************************************************/
	}
	public void fc_acct_3005_a(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_3005_ADataSet ds = null;
		FC_ACCT_3005_ADM dm = new FC_ACCT_3005_ADM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.stlm_dt = Util.checkString(req.getParameter("stlm_dt"));

		dm.print();
		
		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_3005_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/* EJB 수정전 시작		
		try {
			FC_ACCT_3000EJBHome home = (FC_ACCT_3000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_3000EJB");
			FC_ACCT_3000EJB ejb = home.create();

			ds = ejb.fc_acct_3005_a(dm);
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
		dm.stlm_dt = (String)hash.get("stlm_dt");
		*******************************************************************************************/
	}
	public void fc_acct_3006_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_3006_LDataSet ds = null;
		FC_ACCT_3006_LDM dm = new FC_ACCT_3006_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.stlm_dt = Util.checkString(req.getParameter("stlm_dt"));

		dm.print();
		
		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_3006_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/* EJB 수정전 시작
		try {
			FC_ACCT_3000EJBHome home = (FC_ACCT_3000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_3000EJB");
			FC_ACCT_3000EJB ejb = home.create();

			ds = ejb.fc_acct_3006_l(dm);
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
		dm.stlm_dt = (String)hash.get("stlm_dt");
		*******************************************************************************************/
	}
	
	public void fc_acct_3010_m(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_3010_MDataSet ds = null;
		FC_ACCT_3010_MDM dm = new FC_ACCT_3010_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_3010_MDataSet)manager.executeCall(dm);

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
	
	public void fc_acct_3011_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_3011_LDataSet ds = null;
		FC_ACCT_3011_LDM dm = new FC_ACCT_3011_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.cost_gain_clsf_cd = Util.checkString(req.getParameter("cost_gain_clsf_cd"));
		dm.stlm_dt = Util.checkString(req.getParameter("stlm_dt"));

		dm.print();
		
		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_3011_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/* EJB 수정전 시작
		try {
			FC_ACCT_3000EJBHome home = (FC_ACCT_3000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_3000EJB");
			FC_ACCT_3000EJB ejb = home.create();

			ds = ejb.fc_acct_3011_l(dm);
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
		dm.cost_gain_clsf_cd = (String)hash.get("cost_gain_clsf_cd");
		dm.stlm_dt = (String)hash.get("stlm_dt");
		*******************************************************************************************/
	}	
	public void fc_acct_3012_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_3012_LDataSet ds = null;
		FC_ACCT_3012_LDM dm = new FC_ACCT_3012_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.cost_gain_clsf_cd = Util.checkString(req.getParameter("cost_gain_clsf_cd"));

		dm.print();
		
		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_3012_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/* EJB 수정전 시작
		try {
			FC_ACCT_3000EJBHome home = (FC_ACCT_3000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_3000EJB");
			FC_ACCT_3000EJB ejb = home.create();

			ds = ejb.fc_acct_3012_l(dm);
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
		dm.cost_gain_clsf_cd = (String)hash.get("cost_gain_clsf_cd");
		*******************************************************************************************/
	}
	public void fc_acct_3013_i(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_3013_IDataSet ds = null;
		FC_ACCT_3013_IDM dm = new FC_ACCT_3013_IDM();

		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);
		
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.stlm_dt = Util.checkString(req.getParameter("stlm_dt"));
		dm.rmks = Util.checkString(req.getParameter("rmks"));
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		dm.prelae_pay_clsf_cd = (String)hash.get("prelae_pay_clsf_cd1");
		dm.mang_clsf_cd = (String)hash.get("mang_clsf_cd1");
		dm.mang_no = (String)hash.get("mang_no");
		dm.comp_dt = (String)hash.get("comp_dt");
		dm.mtry_dt = (String)hash.get("mtry_dt");
		dm.pymt_amt = (String)hash.get("pymt_amt");
		dm.int_rate = (String)hash.get("int_rate");
		dm.prvmm_bal = (String)hash.get("prvmm_bal");
		dm.thmm_dr = (String)hash.get("thmm_dr");
		dm.thmm_crdt = (String)hash.get("thmm_crdt");
		dm.thmm_bal = (String)hash.get("thmm_bal");
		dm.clam_dept_cd = Util.getSessionParameterValue(req, "deptcd", true);
		dm.incmg_dt = Util.checkString(req.getParameter("incmg_dt"));

		dm.print();
		
		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_3013_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/* EJB 수정전 시작
		try {
			FC_ACCT_3000EJBHome home = (FC_ACCT_3000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_3000EJB");
			FC_ACCT_3000EJB ejb = home.create();

			ds = ejb.fc_acct_3013_i(dm);
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
		dm.stlm_dt = (String)hash.get("stlm_dt");
		dm.rmks = (String)hash.get("rmks");
		dm.incmg_pers = (String)hash.get("incmg_pers");
		dm.incmg_pers_ipadd = (String)hash.get("incmg_pers_ipadd");
		dm.prelae_pay_clsf_cd = (String)hash.get("prelae_pay_clsf_cd");
		dm.mang_clsf_cd = (String)hash.get("mang_clsf_cd");
		dm.mang_no = (String)hash.get("mang_no");
		dm.comp_dt = (String)hash.get("comp_dt");
		dm.mtry_dt = (String)hash.get("mtry_dt");
		dm.pymt_amt = (String)hash.get("pymt_amt");
		dm.int_rate = (String)hash.get("int_rate");
		dm.prvmm_bal = (String)hash.get("prvmm_bal");
		dm.thmm_dr = (String)hash.get("thmm_dr");
		dm.thmm_crdt = (String)hash.get("thmm_crdt");
		dm.thmm_bal = (String)hash.get("thmm_bal");
		dm.clam_dept_cd = (String)hash.get("clam_dept_cd");
		dm.incmg_dt = (String)hash.get("incmg_dt");
		*******************************************************************************************/
	}
	public void fc_acct_3014_d(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_3014_DDataSet ds = null;
		FC_ACCT_3014_DDM dm = new FC_ACCT_3014_DDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);			
		dm.slip_occr_dt = Util.checkString(req.getParameter("slip_occr_dt"));
		dm.slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
		dm.slip_seq = Util.checkString(req.getParameter("slip_seq"));
		dm.stlm_dt = Util.checkString(req.getParameter("stlm_dt"));
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		dm.pch_count = Long.parseLong(req.getParameter("pch_count"));

		dm.print();
		
		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_3014_DDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/* EJB 수정전 시작
		try {
			FC_ACCT_3000EJBHome home = (FC_ACCT_3000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_3000EJB");
			FC_ACCT_3000EJB ejb = home.create();

			ds = ejb.fc_acct_3014_d(dm);
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
		dm.stlm_dt = (String)hash.get("stlm_dt");
		dm.incmg_pers = (String)hash.get("incmg_pers");
		dm.incmg_pers_ipadd = (String)hash.get("incmg_pers_ipadd");
		dm.pch_count = (String)hash.get("pch_count");
		*******************************************************************************************/
	}	
	public void fc_acct_3015_a(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_3015_ADataSet ds = null;
		FC_ACCT_3015_ADM dm = new FC_ACCT_3015_ADM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.stlm_dt = Util.checkString(req.getParameter("stlm_dt"));

		dm.print();
		
		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_3015_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/* EJB 수정전 시작
		try {
			FC_ACCT_3000EJBHome home = (FC_ACCT_3000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_3000EJB");
			FC_ACCT_3000EJB ejb = home.create();

			ds = ejb.fc_acct_3015_a(dm);
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
		dm.stlm_dt = (String)hash.get("stlm_dt");
		*******************************************************************************************/
	}
	public void fc_acct_3016_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_3016_LDataSet ds = null;
		FC_ACCT_3016_LDM dm = new FC_ACCT_3016_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.stlm_dt = Util.checkString(req.getParameter("stlm_dt"));

		dm.print();
		
		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_3016_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/* EJB 수정전 시작
		try {
			FC_ACCT_3000EJBHome home = (FC_ACCT_3000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_3000EJB");
			FC_ACCT_3000EJB ejb = home.create();

			ds = ejb.fc_acct_3016_l(dm);
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
		dm.stlm_dt = (String)hash.get("stlm_dt");
		*******************************************************************************************/
	}	
	
	public void fc_acct_3020_m(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_3020_MDataSet ds = null;
		FC_ACCT_3020_MDM dm = new FC_ACCT_3020_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_3020_MDataSet)manager.executeCall(dm);

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

	public void fc_acct_3021_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_3021_LDataSet ds = null;
		FC_ACCT_3021_LDM dm = new FC_ACCT_3021_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.cost_gain_clsf_cd = Util.checkString(req.getParameter("cost_gain_clsf_cd"));
		dm.stlm_dt = Util.checkString(req.getParameter("stlm_dt"));

		dm.print();
		
		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_3021_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/* EJB 수정전 시작
		try {
			FC_ACCT_3000EJBHome home = (FC_ACCT_3000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_3000EJB");
			FC_ACCT_3000EJB ejb = home.create();

			ds = ejb.fc_acct_3021_l(dm);
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
		dm.cost_gain_clsf_cd = (String)hash.get("cost_gain_clsf_cd");
		dm.stlm_dt = (String)hash.get("stlm_dt");
		*******************************************************************************************/
	}
	public void fc_acct_3022_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_3022_LDataSet ds = null;
		FC_ACCT_3022_LDM dm = new FC_ACCT_3022_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.cost_gain_clsf_cd = Util.checkString(req.getParameter("cost_gain_clsf_cd"));

		dm.print();
		
		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_3022_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/* EJB 수정전 시작
		try {
			FC_ACCT_3000EJBHome home = (FC_ACCT_3000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_3000EJB");
			FC_ACCT_3000EJB ejb = home.create();

			ds = ejb.fc_acct_3022_l(dm);
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
		dm.cost_gain_clsf_cd = (String)hash.get("cost_gain_clsf_cd");
		*******************************************************************************************/
	}
	public void fc_acct_3023_i(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_3023_IDataSet ds = null;
		FC_ACCT_3023_IDM dm = new FC_ACCT_3023_IDM();

		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);
		
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);		
		dm.stlm_dt = Util.checkString(req.getParameter("stlm_dt"));
		dm.rmks = Util.checkString(req.getParameter("rmks"));
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.incmg_pers_ipadd = req.getRemoteAddr();		
		dm.prelae_pay_clsf_cd = (String)hash.get("prelae_pay_clsf_cd1");
		dm.mang_clsf_cd = (String)hash.get("mang_clsf_cd1");
		dm.mang_no = (String)hash.get("mang_no");
		dm.comp_dt = (String)hash.get("comp_dt");
		dm.mtry_dt = (String)hash.get("mtry_dt");
		dm.face_val_amt = (String)hash.get("face_val_amt");
		dm.dds = (String)hash.get("dds");
		dm.int_rate = (String)hash.get("int_rate");
		dm.prvmm_bal = (String)hash.get("prvmm_bal");
		dm.thmm_dr = (String)hash.get("thmm_dr");
		dm.thmm_crdt = (String)hash.get("thmm_crdt");
		dm.thmm_bal = (String)hash.get("thmm_bal");
		dm.clam_dept_cd = Util.getSessionParameterValue(req, "deptcd", true);
		dm.incmg_dt = Util.checkString(req.getParameter("incmg_dt"));

		dm.print();
		
		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_3023_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/* EJB 수정전 시작
		try {
			FC_ACCT_3000EJBHome home = (FC_ACCT_3000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_3000EJB");
			FC_ACCT_3000EJB ejb = home.create();

			ds = ejb.fc_acct_3023_i(dm);
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
		dm.stlm_dt = (String)hash.get("stlm_dt");
		dm.rmks = (String)hash.get("rmks");
		dm.incmg_pers = (String)hash.get("incmg_pers");
		dm.incmg_pers_ipadd = (String)hash.get("incmg_pers_ipadd");
		dm.prelae_pay_clsf_cd = (String)hash.get("prelae_pay_clsf_cd");
		dm.mang_clsf_cd = (String)hash.get("mang_clsf_cd");
		dm.mang_no = (String)hash.get("mang_no");
		dm.comp_dt = (String)hash.get("comp_dt");
		dm.mtry_dt = (String)hash.get("mtry_dt");
		dm.face_val_amt = (String)hash.get("face_val_amt");
		dm.dds = (String)hash.get("dds");
		dm.int_rate = (String)hash.get("int_rate");
		dm.prvmm_bal = (String)hash.get("prvmm_bal");
		dm.thmm_dr = (String)hash.get("thmm_dr");
		dm.thmm_crdt = (String)hash.get("thmm_crdt");
		dm.thmm_bal = (String)hash.get("thmm_bal");
		dm.clam_dept_cd = (String)hash.get("clam_dept_cd");
		dm.incmg_dt = (String)hash.get("incmg_dt");
		*******************************************************************************************/
	}
	public void fc_acct_3024_d(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_3024_DDataSet ds = null;
		FC_ACCT_3024_DDM dm = new FC_ACCT_3024_DDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.slip_occr_dt = Util.checkString(req.getParameter("slip_occr_dt"));
		dm.slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
		dm.slip_seq = Util.checkString(req.getParameter("slip_seq"));
		dm.stlm_dt = Util.checkString(req.getParameter("stlm_dt"));
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		dm.pch_count = Long.parseLong(req.getParameter("pch_count"));
	
		dm.print();
		
		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_3024_DDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/* EJB 수정전 시작
		try {
			FC_ACCT_3000EJBHome home = (FC_ACCT_3000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_3000EJB");
			FC_ACCT_3000EJB ejb = home.create();

			ds = ejb.fc_acct_3024_d(dm);
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
		dm.stlm_dt = (String)hash.get("stlm_dt");
		dm.incmg_pers = (String)hash.get("incmg_pers");
		dm.incmg_pers_ipadd = (String)hash.get("incmg_pers_ipadd");
		dm.pch_count = (String)hash.get("pch_count");
		*******************************************************************************************/
	}
	public void fc_acct_3025_a(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_3025_ADataSet ds = null;
		FC_ACCT_3025_ADM dm = new FC_ACCT_3025_ADM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.stlm_dt = Util.checkString(req.getParameter("stlm_dt"));

		dm.print();
		
		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_3025_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/* EJB 수정전 시작
		try {
			FC_ACCT_3000EJBHome home = (FC_ACCT_3000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_3000EJB");
			FC_ACCT_3000EJB ejb = home.create();

			ds = ejb.fc_acct_3025_a(dm);
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
		dm.stlm_dt = (String)hash.get("stlm_dt");
		*******************************************************************************************/
	}	
	public void fc_acct_3026_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_3026_LDataSet ds = null;
		FC_ACCT_3026_LDM dm = new FC_ACCT_3026_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.stlm_dt = Util.checkString(req.getParameter("stlm_dt"));

		dm.print();
		
		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_3026_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/* EJB 수정전 시작
		try {
			FC_ACCT_3000EJBHome home = (FC_ACCT_3000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_3000EJB");
			FC_ACCT_3000EJB ejb = home.create();

			ds = ejb.fc_acct_3026_l(dm);
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
		dm.stlm_dt = (String)hash.get("stlm_dt");
		*******************************************************************************************/
	}	
	
	public void fc_acct_3030_m(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_3030_MDataSet ds = null;
		FC_ACCT_3030_MDM dm = new FC_ACCT_3030_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_3030_MDataSet)manager.executeCall(dm);

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
	
	public void fc_acct_3031_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_3031_LDataSet ds = null;
		FC_ACCT_3031_LDM dm = new FC_ACCT_3031_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.cost_gain_clsf_cd = Util.checkString(req.getParameter("cost_gain_clsf_cd"));
		dm.stlm_dt = Util.checkString(req.getParameter("stlm_dt"));

		dm.print();
		
		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_3031_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/* EJB 수정전 시작
		try {
			FC_ACCT_3000EJBHome home = (FC_ACCT_3000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_3000EJB");
			FC_ACCT_3000EJB ejb = home.create();

			ds = ejb.fc_acct_3031_l(dm);
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

		dm.cmpy_cd = (String)hash.get(cmpy_cd");
		dm.cost_gain_clsf_cd = (String)hash.get(cost_gain_clsf_cd");
		dm.stlm_dt = (String)hash.get(stlm_dt");
		*******************************************************************************************/
	}	
	public void fc_acct_3032_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_3032_LDataSet ds = null;
		FC_ACCT_3032_LDM dm = new FC_ACCT_3032_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.stlm_dt = Util.checkString(req.getParameter("stlm_dt"));

		dm.print();
		
		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_3032_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/* EJB 수정전 시작
		try {
			FC_ACCT_3000EJBHome home = (FC_ACCT_3000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_3000EJB");
			FC_ACCT_3000EJB ejb = home.create();

			ds = ejb.fc_acct_3032_l(dm);
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

		dm.cmpy_cd = (String)hash.get(cmpy_cd");
		dm.stlm_dt = (String)hash.get(stlm_dt");
		*******************************************************************************************/
	}	
	public void fc_acct_3033_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_3033_LDataSet ds = null;
		FC_ACCT_3033_LDM dm = new FC_ACCT_3033_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.stlm_dt = Util.checkString(req.getParameter("stlm_dt"));

		dm.print();
		
		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_3033_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/* EJB 수정전 시작
		try {
			FC_ACCT_3000EJBHome home = (FC_ACCT_3000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_3000EJB");
			FC_ACCT_3000EJB ejb = home.create();

			ds = ejb.fc_acct_3033_l(dm);
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

		dm.cmpy_cd = (String)hash.get(cmpy_cd");
		dm.stlm_dt = (String)hash.get(stlm_dt");
		*******************************************************************************************/
	}	
	public void fc_acct_3034_i(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_3034_IDataSet ds = null;
		FC_ACCT_3034_IDM dm = new FC_ACCT_3034_IDM();			                   
        
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);
                            
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.stlm_dt = Util.checkString(req.getParameter("stlm_dt"));
		dm.rmks = Util.checkString(req.getParameter("rmks"));
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		dm.mang_clsf_cd = (String)hash.get("mang_clsf_cd");
		dm.mang_no = (String)hash.get("mang_no");
		dm.mang_no2 = (String)hash.get("mang_no2");
		dm.prvmm_bal = (String)hash.get("prvmm_bal");
		dm.thmm_dr = (String)hash.get("thmm_dr");
		dm.thmm_crdt = (String)hash.get("thmm_crdt");
		dm.thmm_bal = (String)hash.get("thmm_bal");
		dm.dds = (String)hash.get("dds");
		dm.mtry_dt = (String)hash.get("mtry_dt");        
		dm.clam_dept_cd = Util.getSessionParameterValue(req, "deptcd", true);
		dm.incmg_dt = Util.checkString(req.getParameter("incmg_dt"));

		dm.print();
		
		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_3034_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/* EJB 수정전 시작
		try {
			FC_ACCT_3000EJBHome home = (FC_ACCT_3000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_3000EJB");
			FC_ACCT_3000EJB ejb = home.create();
			
			ds = ejb.fc_acct_3034_i(dm);
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
		dm.stlm_dt = (String)hash.get("stlm_dt");
		dm.rmks = (String)hash.get("rmks");
		dm.incmg_pers = (String)hash.get("incmg_pers");
		dm.incmg_pers_ipadd = (String)hash.get("incmg_pers_ipadd");
		dm.mang_clsf_cd = (String)hash.get("mang_clsf_cd");
		dm.mang_no = (String)hash.get("mang_no");
		dm.mang_no2 = (String)hash.get("mang_no2");
		dm.prvmm_bal = (String)hash.get("prvmm_bal");
		dm.thmm_dr = (String)hash.get("thmm_dr");
		dm.thmm_crdt = (String)hash.get("thmm_crdt");
		dm.thmm_bal = (String)hash.get("thmm_bal");
		dm.dds = (String)hash.get("dds");
		dm.mtry_dt = (String)hash.get("mtry_dt");
		dm.clam_dept_cd = (String)hash.get("clam_dept_cd");
		dm.incmg_dt = (String)hash.get("incmg_dt");
		*******************************************************************************************/
	}	
	public void fc_acct_3035_d(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_3035_DDataSet ds = null;
		FC_ACCT_3035_DDM dm = new FC_ACCT_3035_DDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.slip_occr_dt = Util.checkString(req.getParameter("slip_occr_dt"));
		dm.slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
		dm.slip_seq = Util.checkString(req.getParameter("slip_seq"));
		dm.stlm_dt = Util.checkString(req.getParameter("stlm_dt"));
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		dm.pch_count = Long.parseLong(req.getParameter("pch_count"));				  		
		
		dm.print();
		
		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_3035_DDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/* EJB 수정전 시작
		try {
			FC_ACCT_3000EJBHome home = (FC_ACCT_3000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_3000EJB");
			FC_ACCT_3000EJB ejb = home.create();

			ds = ejb.fc_acct_3035_d(dm);
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

		dm.cmpy_cd = (String)hash.get(cmpy_cd");
		dm.slip_occr_dt = (String)hash.get(slip_occr_dt");
		dm.slip_clsf_cd = (String)hash.get(slip_clsf_cd");
		dm.slip_seq = (String)hash.get(slip_seq");
		dm.stlm_dt = (String)hash.get(stlm_dt");
		dm.incmg_pers = (String)hash.get(incmg_pers");
		dm.incmg_pers_ipadd = (String)hash.get(incmg_pers_ipadd");
		dm.pch_count = (String)hash.get(pch_count");
		*******************************************************************************************/
	}
	
	public void fc_acct_3040_m(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_3040_MDataSet ds = null;
		FC_ACCT_3040_MDM dm = new FC_ACCT_3040_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_3040_MDataSet)manager.executeCall(dm);

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
	
	public void fc_acct_3041_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_3041_LDataSet ds = null;
		FC_ACCT_3041_LDM dm = new FC_ACCT_3041_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.cost_gain_clsf_cd = Util.checkString(req.getParameter("cost_gain_clsf_cd"));
		dm.stlm_dt = Util.checkString(req.getParameter("stlm_dt"));

		dm.print();
		
		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_3041_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/* EJB 수정전 시작
		try {
			FC_ACCT_3000EJBHome home = (FC_ACCT_3000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_3000EJB");
			FC_ACCT_3000EJB ejb = home.create();

			ds = ejb.fc_acct_3041_l(dm);
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
		dm.cost_gain_clsf_cd = (String)hash.get("cost_gain_clsf_cd");
		dm.stlm_dt = (String)hash.get("stlm_dt");
		*******************************************************************************************/
	}	
	public void fc_acct_3042_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_3042_LDataSet ds = null;
		FC_ACCT_3042_LDM dm = new FC_ACCT_3042_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.cost_gain_clsf_cd = Util.checkString(req.getParameter("cost_gain_clsf_cd"));

		dm.print();
		
		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_3042_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/* EJB 수정전 시작
		try {
			FC_ACCT_3000EJBHome home = (FC_ACCT_3000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_3000EJB");
			FC_ACCT_3000EJB ejb = home.create();

			ds = ejb.fc_acct_3042_l(dm);
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
		dm.cost_gain_clsf_cd = (String)hash.get("cost_gain_clsf_cd");
		*******************************************************************************************/
	}	
	public void fc_acct_3043_i(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_3043_IDataSet ds = null;
		FC_ACCT_3043_IDM dm = new FC_ACCT_3043_IDM();
		
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);
		
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.stlm_dt = Util.checkString(req.getParameter("stlm_dt"));
		dm.rmks = Util.checkString(req.getParameter("rmks"));
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		dm.prelae_pay_clsf_cd = (String)hash.get("prelae_pay_clsf_cd1");
		dm.mang_clsf_cd = (String)hash.get("mang_clsf_cd1");
		dm.mang_no = (String)hash.get("mang_no");
		dm.comp_dt = (String)hash.get("comp_dt");
		dm.mtry_dt = (String)hash.get("mtry_dt");
		dm.won_amt = (String)hash.get("won_amt");
		dm.dds = (String)hash.get("dds");
		dm.pymt_dt = (String)hash.get("pymt_dt");
		dm.prvmm_bal = (String)hash.get("prvmm_bal");
		dm.thmm_dr = (String)hash.get("thmm_dr");
		dm.thmm_crdt = (String)hash.get("thmm_crdt");
		dm.thmm_bal = (String)hash.get("thmm_bal");
		dm.clam_dept_cd = Util.getSessionParameterValue(req, "deptcd", true);
		dm.incmg_dt = Util.checkString(req.getParameter("incmg_dt"));
		
		dm.print();
		
		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_3043_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/* EJB 수정전 시작
		try {
			FC_ACCT_3000EJBHome home = (FC_ACCT_3000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_3000EJB");
			FC_ACCT_3000EJB ejb = home.create();

			ds = ejb.fc_acct_3043_i(dm);
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
		dm.stlm_dt = (String)hash.get("stlm_dt");
		dm.rmks = (String)hash.get("rmks");
		dm.incmg_pers = (String)hash.get("incmg_pers");
		dm.incmg_pers_ipadd = (String)hash.get("incmg_pers_ipadd");
		dm.prelae_pay_clsf_cd = (String)hash.get("prelae_pay_clsf_cd");
		dm.mang_clsf_cd = (String)hash.get("mang_clsf_cd");
		dm.mang_no = (String)hash.get("mang_no");
		dm.comp_dt = (String)hash.get("comp_dt");
		dm.mtry_dt = (String)hash.get("mtry_dt");
		dm.won_amt = (String)hash.get("won_amt");
		dm.dds = (String)hash.get("dds");
		dm.pymt_dt = (String)hash.get("pymt_dt");
		dm.prvmm_bal = (String)hash.get("prvmm_bal");
		dm.thmm_dr = (String)hash.get("thmm_dr");
		dm.thmm_crdt = (String)hash.get("thmm_crdt");
		dm.thmm_bal = (String)hash.get("thmm_bal");
		dm.clam_dept_cd = (String)hash.get("clam_dept_cd");
		dm.incmg_dt = (String)hash.get("incmg_dt");
		*******************************************************************************************/
	}
	public void fc_acct_3044_d(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_3044_DDataSet ds = null;
		FC_ACCT_3044_DDM dm = new FC_ACCT_3044_DDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.slip_occr_dt = Util.checkString(req.getParameter("slip_occr_dt"));
		dm.slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
		dm.slip_seq = Util.checkString(req.getParameter("slip_seq"));
		dm.stlm_dt = Util.checkString(req.getParameter("stlm_dt"));
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		dm.pch_count = Long.parseLong(req.getParameter("pch_count"));
		dm.pch_count2 = Long.parseLong(req.getParameter("pch_count2"));

		dm.print();
		
		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_3044_DDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/* EJB 수정전 시작
		try {
			FC_ACCT_3000EJBHome home = (FC_ACCT_3000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_3000EJB");
			FC_ACCT_3000EJB ejb = home.create();

			ds = ejb.fc_acct_3044_d(dm);
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
		dm.stlm_dt = (String)hash.get("stlm_dt");
		dm.chg_pers = (String)hash.get("chg_pers");
		dm.incmg_pers_ipadd = (String)hash.get("incmg_pers_ipadd");
		dm.pch_count = (String)hash.get("pch_count");
		dm.pch_count2 = (String)hash.get("pch_count2");
		*******************************************************************************************/
	}	
	public void fc_acct_3045_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_3045_LDataSet ds = null;
		FC_ACCT_3045_LDM dm = new FC_ACCT_3045_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.stlm_dt = Util.checkString(req.getParameter("stlm_dt"));

		dm.print();
		
		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_3045_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/* EJB 수정전 시작
		try {
			FC_ACCT_3000EJBHome home = (FC_ACCT_3000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_3000EJB");
			FC_ACCT_3000EJB ejb = home.create();

			ds = ejb.fc_acct_3045_l(dm);
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
		dm.stlm_dt = (String)hash.get("stlm_dt");
		*******************************************************************************************/
	}	
	public void fc_acct_3046_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_3046_LDataSet ds = null;
		FC_ACCT_3046_LDM dm = new FC_ACCT_3046_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.stlm_dt = Util.checkString(req.getParameter("stlm_dt"));

		dm.print();
		
		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_3046_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/* EJB 수정전 시작
		try {
			FC_ACCT_3000EJBHome home = (FC_ACCT_3000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_3000EJB");
			FC_ACCT_3000EJB ejb = home.create();

			ds = ejb.fc_acct_3046_l(dm);
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
		dm.stlm_dt = (String)hash.get("stlm_dt");
		*******************************************************************************************/
	}	
	
	public void fc_acct_3050_m(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_3050_MDataSet ds = null;
		FC_ACCT_3050_MDM dm = new FC_ACCT_3050_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_3050_MDataSet)manager.executeCall(dm);

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
	
	public void fc_acct_3051_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_3051_LDataSet ds = null;
		FC_ACCT_3051_LDM dm = new FC_ACCT_3051_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.cost_gain_clsf_cd = Util.checkString(req.getParameter("cost_gain_clsf_cd"));
		dm.stlm_dt = Util.checkString(req.getParameter("stlm_dt"));

		dm.print();
		
		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_3051_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/* EJB 수정전 시작
		try {
			FC_ACCT_3000EJBHome home = (FC_ACCT_3000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_3000EJB");
			FC_ACCT_3000EJB ejb = home.create();

			ds = ejb.fc_acct_3051_l(dm);
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
		dm.cost_gain_clsf_cd = (String)hash.get("cost_gain_clsf_cd");
		dm.stlm_dt = (String)hash.get("stlm_dt");
		*******************************************************************************************/
	}	
	public void fc_acct_3052_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_3052_LDataSet ds = null;
		FC_ACCT_3052_LDM dm = new FC_ACCT_3052_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.cost_gain_clsf_cd = Util.checkString(req.getParameter("cost_gain_clsf_cd"));

		dm.print();
		
		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_3052_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/* EJB 수정전 시작
		try {
			FC_ACCT_3000EJBHome home = (FC_ACCT_3000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_3000EJB");
			FC_ACCT_3000EJB ejb = home.create();

			ds = ejb.fc_acct_3052_l(dm);
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
		dm.cost_gain_clsf_cd = (String)hash.get("cost_gain_clsf_cd");
		*******************************************************************************************/
	}	
	public void fc_acct_3053_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_3053_LDataSet ds = null;
		FC_ACCT_3053_LDM dm = new FC_ACCT_3053_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.stlm_dt = Util.checkString(req.getParameter("stlm_dt"));

		dm.print();
		
		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_3053_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/* EJB 수정전 시작
		try {
			FC_ACCT_3000EJBHome home = (FC_ACCT_3000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_3000EJB");
			FC_ACCT_3000EJB ejb = home.create();

			ds = ejb.fc_acct_3053_l(dm);
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
		dm.stlm_dt = (String)hash.get("stlm_dt");
		*******************************************************************************************/
	}	
	public void fc_acct_3054_i(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_3054_IDataSet ds = null;
		FC_ACCT_3054_IDM dm = new FC_ACCT_3054_IDM();

		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);
		
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.stlm_dt = Util.checkString(req.getParameter("stlm_dt"));
		dm.rmks = Util.checkString(req.getParameter("rmks"));
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.incmg_pers_ipadd = req.getRemoteAddr();		
		dm.prelae_pay_clsf_cd = (String)hash.get("prelae_pay_clsf_cd1");
		dm.mang_clsf_cd = (String)hash.get("mang_clsf_cd1");
		dm.mang_no = (String)hash.get("mang_no");
		dm.comp_dt = (String)hash.get("comp_dt");
		dm.mtry_dt = (String)hash.get("mtry_dt");
		dm.loan_amt = (String)hash.get("loan_amt");
		dm.dds = (String)hash.get("dds");
		dm.int_rate = (String)hash.get("int_rate");
		dm.prvmm_bal = (String)hash.get("prvmm_bal");
		dm.thmm_dr = (String)hash.get("thmm_dr");
		dm.thmm_crdt = (String)hash.get("thmm_crdt");
		dm.thmm_bal = (String)hash.get("thmm_bal");
		dm.cmpy_cd = Util.getSessionParameterValue(req, "deptcd", true);
		dm.incmg_dt = Util.checkString(req.getParameter("incmg_dt"));

		dm.print();
		
		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_3054_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/* EJB 수정전 시작
		try {
			FC_ACCT_3000EJBHome home = (FC_ACCT_3000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_3000EJB");
			FC_ACCT_3000EJB ejb = home.create();

			ds = ejb.fc_acct_3054_i(dm);
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
		dm.stlm_dt = (String)hash.get("stlm_dt");
		dm.rmks = (String)hash.get("rmks");
		dm.incmg_pers = (String)hash.get("incmg_pers");
		dm.incmg_pers_ipadd = (String)hash.get("incmg_pers_ipadd");
		dm.prelae_pay_clsf_cd = (String)hash.get("prelae_pay_clsf_cd");
		dm.mang_clsf_cd = (String)hash.get("mang_clsf_cd");
		dm.mang_no = (String)hash.get("mang_no");
		dm.comp_dt = (String)hash.get("comp_dt");
		dm.mtry_dt = (String)hash.get("mtry_dt");
		dm.loan_amt = (String)hash.get("loan_amt");
		dm.dds = (String)hash.get("dds");
		dm.int_rate = (String)hash.get("int_rate");
		dm.prvmm_bal = (String)hash.get("prvmm_bal");
		dm.thmm_dr = (String)hash.get("thmm_dr");
		dm.thmm_crdt = (String)hash.get("thmm_crdt");
		dm.thmm_bal = (String)hash.get("thmm_bal");
		dm.clam_dept_cd = (String)hash.get("clam_dept_cd");
		dm.incmg_dt = (String)hash.get("incmg_dt");
		*******************************************************************************************/
	}	
	public void fc_acct_3055_d(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_3055_DDataSet ds = null;
		FC_ACCT_3055_DDM dm = new FC_ACCT_3055_DDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.slip_occr_dt = Util.checkString(req.getParameter("slip_occr_dt"));
		dm.slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
		dm.slip_seq = Util.checkString(req.getParameter("slip_seq"));
		dm.stlm_dt = Util.checkString(req.getParameter("stlm_dt"));
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		dm.pch_count = Long.parseLong(req.getParameter("pch_count"));

		dm.print();
		
		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_3055_DDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/* EJB 수정전 시작
		try {
			FC_ACCT_3000EJBHome home = (FC_ACCT_3000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_3000EJB");
			FC_ACCT_3000EJB ejb = home.create();

			ds = ejb.fc_acct_3055_d(dm);
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
		dm.stlm_dt = (String)hash.get("stlm_dt");
		dm.chg_pers = (String)hash.get("chg_pers");
		dm.incmg_pers_ipadd = (String)hash.get("incmg_pers_ipadd");
		dm.pch_count = (String)hash.get("pch_count");
		*******************************************************************************************/
	}	
	public void fc_acct_3056_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_3056_LDataSet ds = null;
		FC_ACCT_3056_LDM dm = new FC_ACCT_3056_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.stlm_dt = Util.checkString(req.getParameter("stlm_dt"));

		dm.print();
		
		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_3056_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/* EJB 수정전 시작
		try {
			FC_ACCT_3000EJBHome home = (FC_ACCT_3000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_3000EJB");
			FC_ACCT_3000EJB ejb = home.create();

			ds = ejb.fc_acct_3056_l(dm);
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
		dm.stlm_dt = (String)hash.get("stlm_dt");
		*******************************************************************************************/
	}
	
	public void fc_acct_3150_m(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_3150_MDataSet ds = null;
		FC_ACCT_3150_MDM dm = new FC_ACCT_3150_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		System.out.println("bong_wb");
		dm.print();
		
		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_3150_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
	}
	
	public void fc_acct_3151_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_3151_LDataSet ds = null;
		FC_ACCT_3151_LDM dm = new FC_ACCT_3151_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.yyyymm = Util.checkString(req.getParameter("yyyymm"));
		dm.gbn = Util.checkString(req.getParameter("gbn"));
		dm.budg_cd = Util.checkString(req.getParameter("budg_cd"));
		dm.evnt_cd = Util.checkString(req.getParameter("evnt_cd"));

		dm.print();
		
		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_3151_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/* EJB 수정전 시작
		try {
			FC_ACCT_3000EJBHome home = (FC_ACCT_3000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_3000EJB");
			FC_ACCT_3000EJB ejb = home.create();

			ds = ejb.fc_acct_3151_l(dm);
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
		dm.yyyymm = (String)hash.get("yyyymm");
		dm.gbn = (String)hash.get("gbn");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.yyyymm = Util.getSessionParameterValue(req,"yyyymm",true);
		dm.gbn = Util.getSessionParameterValue(req,"gbn",true);
		*******************************************************************************************/
	}
	public void fc_acct_3152_i(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_3152_IDataSet ds = null;
		FC_ACCT_3152_IDM dm = new FC_ACCT_3152_IDM();

		dm.cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
		dm.clam_dept_cd = Util.checkString(req.getParameter("clam_dept_cd"));
		dm.incmg_dt = Util.checkString(req.getParameter("incmg_dt"));
		dm.fisc_dt = Util.checkString(req.getParameter("fisc_dt"));
		dm.rmks = Util.checkString(req.getParameter("rmks"));
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		dm.incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
		
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);
		
		dm.slip_no = (String)hash.get("slip_no");
		dm.obj_amt = (String)hash.get("obj_amt");	


		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_3152_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/* EJB 수정전 시작
		try {
			FC_ACCT_3000EJBHome home = (FC_ACCT_3000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_3000EJB");
			FC_ACCT_3000EJB ejb = home.create();

			ds = ejb.fc_acct_3152_i(dm);
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
		dm.clam_dept_cd = (String)hash.get("clam_dept_cd");
		dm.incmg_dt = (String)hash.get("incmg_dt");
		dm.fisc_dt = (String)hash.get("fisc_dt");
		dm.rmks = (String)hash.get("rmks");
		dm.slip_no = (String)hash.get("slip_no");
		dm.obj_amt = (String)hash.get("obj_amt");
		dm.incmg_pers_ipadd = (String)hash.get("incmg_pers_ipadd");
		dm.incmg_pers = (String)hash.get("incmg_pers");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.clam_dept_cd = Util.getSessionParameterValue(req,"clam_dept_cd",true);
		dm.incmg_dt = Util.getSessionParameterValue(req,"incmg_dt",true);
		dm.fisc_dt = Util.getSessionParameterValue(req,"fisc_dt",true);
		dm.rmks = Util.getSessionParameterValue(req,"rmks",true);
		dm.slip_no = Util.getSessionParameterValue(req,"slip_no",true);
		dm.obj_amt = Util.getSessionParameterValue(req,"obj_amt",true);
		dm.incmg_pers_ipadd = Util.getSessionParameterValue(req,"incmg_pers_ipadd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"incmg_pers",true);
		*******************************************************************************************/
	}
	public void fc_acct_3153_d(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_3153_DDataSet ds = null;
		FC_ACCT_3153_DDM dm = new FC_ACCT_3153_DDM();

		dm.cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
		dm.slip_occr_dt = Util.checkString(req.getParameter("slip_occr_dt"));
		dm.slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
		dm.slip_seq = Util.checkString(req.getParameter("slip_seq"));
		dm.fisc_dt = Util.checkString(req.getParameter("fisc_dt"));
		dm.incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
		dm.incmg_pers_ipadd = req.getRemoteAddr();

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_3153_DDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/* EJB 수정전 시작
		try {
			FC_ACCT_3000EJBHome home = (FC_ACCT_3000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_3000EJB");
			FC_ACCT_3000EJB ejb = home.create();

			ds = ejb.fc_acct_3153_d(dm);
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
		dm.fisc_dt = (String)hash.get("fisc_dt");
		dm.incmg_pers = (String)hash.get("incmg_pers");
		dm.incmg_pers_ipadd = (String)hash.get("incmg_pers_ipadd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.slip_occr_dt = Util.getSessionParameterValue(req,"slip_occr_dt",true);
		dm.slip_clsf_cd = Util.getSessionParameterValue(req,"slip_clsf_cd",true);
		dm.slip_seq = Util.getSessionParameterValue(req,"slip_seq",true);
		dm.fisc_dt = Util.getSessionParameterValue(req,"fisc_dt",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"incmg_pers",true);
		dm.incmg_pers_ipadd = Util.getSessionParameterValue(req,"incmg_pers_ipadd",true);
		*******************************************************************************************/
	}
	public void fc_acct_3154_i(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_3154_IDataSet ds = null;
		FC_ACCT_3154_IDM dm = new FC_ACCT_3154_IDM();

		dm.cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
		dm.clam_dept_cd = Util.checkString(req.getParameter("clam_dept_cd"));
		dm.incmg_dt = Util.checkString(req.getParameter("incmg_dt"));
		dm.fisc_dt = Util.checkString(req.getParameter("fisc_dt"));
		dm.rmks = Util.checkString(req.getParameter("rmks"));
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		dm.incmg_pers = Util.checkString(req.getParameter("incmg_pers"));

		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);
		
		dm.slip_no = (String)hash.get("slip_no");
		dm.obj_amt = (String)hash.get("obj_amt");
		
		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_3154_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/* EJB 수정전 시작		
		try {
			FC_ACCT_3000EJBHome home = (FC_ACCT_3000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_3000EJB");
			FC_ACCT_3000EJB ejb = home.create();

			ds = ejb.fc_acct_3154_i(dm);
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
		dm.clam_dept_cd = (String)hash.get("clam_dept_cd");
		dm.incmg_dt = (String)hash.get("incmg_dt");
		dm.fisc_dt = (String)hash.get("fisc_dt");
		dm.rmks = (String)hash.get("rmks");
		dm.slip_no = (String)hash.get("slip_no");
		dm.obj_amt = (String)hash.get("obj_amt");
		dm.incmg_pers_ipadd = (String)hash.get("incmg_pers_ipadd");
		dm.incmg_pers = (String)hash.get("incmg_pers");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.clam_dept_cd = Util.getSessionParameterValue(req,"clam_dept_cd",true);
		dm.incmg_dt = Util.getSessionParameterValue(req,"incmg_dt",true);
		dm.fisc_dt = Util.getSessionParameterValue(req,"fisc_dt",true);
		dm.rmks = Util.getSessionParameterValue(req,"rmks",true);
		dm.slip_no = Util.getSessionParameterValue(req,"slip_no",true);
		dm.obj_amt = Util.getSessionParameterValue(req,"obj_amt",true);
		dm.incmg_pers_ipadd = Util.getSessionParameterValue(req,"incmg_pers_ipadd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"incmg_pers",true);
		*******************************************************************************************/
	}	
	public void fc_acct_3070_m(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_3070_MDataSet ds = null;
		FC_ACCT_3070_MDM dm = new FC_ACCT_3070_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_3070_MDataSet)manager.executeCall(dm);

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
	
	public void fc_acct_3071_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_3071_LDataSet ds = null;
		FC_ACCT_3071_LDM dm = new FC_ACCT_3071_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.cost_gain_clsf_cd = Util.checkString(req.getParameter("cost_gain_clsf_cd"));
		dm.stlm_dt = Util.checkString(req.getParameter("stlm_dt"));

		dm.print();
		
		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_3071_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/* EJB 수정전 시작
		try {
			FC_ACCT_3000EJBHome home = (FC_ACCT_3000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_3000EJB");
			FC_ACCT_3000EJB ejb = home.create();

			ds = ejb.fc_acct_3001_l(dm);
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
		dm.cost_gain_clsf_cd = (String)hash.get("cost_gain_clsf_cd");
		dm.stlm_dt = (String)hash.get("stlm_dt");
		*******************************************************************************************/
	}
	public void fc_acct_3072_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_3072_LDataSet ds = null;
		FC_ACCT_3072_LDM dm = new FC_ACCT_3072_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.cost_gain_clsf_cd = Util.checkString(req.getParameter("cost_gain_clsf_cd"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_3072_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/* EJB 수정전 시작
		try {
			FC_ACCT_3000EJBHome home = (FC_ACCT_3000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_3000EJB");
			FC_ACCT_3000EJB ejb = home.create();

			ds = ejb.fc_acct_3002_l(dm);
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
		dm.cost_gain_clsf_cd = (String)hash.get("cost_gain_clsf_cd");
		*******************************************************************************************/
	}
	public void fc_acct_3073_i(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_3073_IDataSet ds = null;
		FC_ACCT_3073_IDM dm = new FC_ACCT_3073_IDM();

		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);
		
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.stlm_dt = Util.checkString(req.getParameter("stlm_dt"));
		dm.rmks = Util.checkString(req.getParameter("rmks"));
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.incmg_pers_ipadd = req.getRemoteAddr();		
		dm.prelae_pay_clsf_cd = (String)hash.get("prelae_pay_clsf_cd1");
		dm.mang_clsf_cd = (String)hash.get("mang_clsf_cd1");
		dm.mang_no = (String)hash.get("mang_no");
		dm.comp_dt = (String)hash.get("comp_dt");
		dm.mtry_dt = (String)hash.get("mtry_dt");
		dm.tot_pymt_amt = (String)hash.get("tot_pymt_amt");
		dm.dds = (String)hash.get("dds");
		dm.int_rate = (String)hash.get("int_rate");
		dm.prvmm_bal = (String)hash.get("prvmm_bal");
		dm.thmm_dr = (String)hash.get("thmm_dr");
		dm.thmm_crdt = (String)hash.get("thmm_crdt");
		dm.thmm_bal = (String)hash.get("thmm_bal");
		dm.clam_dept_cd = Util.getSessionParameterValue(req, "deptcd", true);
		dm.incmg_dt = Util.checkString(req.getParameter("incmg_dt"));
		
		dm.print();
		
		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_3073_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/* EJB 수정전 시작
		try {
			FC_ACCT_3000EJBHome home = (FC_ACCT_3000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_3000EJB");
			FC_ACCT_3000EJB ejb = home.create();

			ds = ejb.fc_acct_3003_i(dm);
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
		dm.stlm_dt = (String)hash.get("stlm_dt");
		dm.rmks = (String)hash.get("rmks");
		dm.incmg_pers = (String)hash.get("incmg_pers");
		dm.incmg_pers_ipadd = (String)hash.get("incmg_pers_ipadd");
		dm.prelae_pay_clsf_cd = (String)hash.get("prelae_pay_clsf_cd");
		dm.mang_clsf_cd = (String)hash.get("mang_clsf_cd");
		dm.mang_no = (String)hash.get("mang_no");
		dm.comp_dt = (String)hash.get("comp_dt");
		dm.mtry_dt = (String)hash.get("mtry_dt");
		dm.tot_pymt_amt = (String)hash.get("tot_pymt_amt");
		dm.dds = (String)hash.get("dds");
		dm.int_rate = (String)hash.get("int_rate");
		dm.prvmm_bal = (String)hash.get("prvmm_bal");
		dm.thmm_dr = (String)hash.get("thmm_dr");
		dm.thmm_crdt = (String)hash.get("thmm_crdt");
		dm.thmm_bal = (String)hash.get("thmm_bal");
		dm.clam_dept_cd = (String)hash.get("clam_dept_cd");
		dm.incmg_dt = (String)hash.get("incmg_dt");
		*******************************************************************************************/
	}	
	public void fc_acct_3074_d(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_3074_DDataSet ds = null;
		FC_ACCT_3074_DDM dm = new FC_ACCT_3074_DDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);		
		dm.slip_occr_dt = Util.checkString(req.getParameter("slip_occr_dt"));
		dm.slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
		dm.slip_seq = Util.checkString(req.getParameter("slip_seq"));
		dm.stlm_dt = Util.checkString(req.getParameter("stlm_dt"));
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true); 		
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		dm.pch_count = Long.parseLong(req.getParameter("pch_count"));
		
		dm.print();
		
		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_3074_DDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/* EJB 수정전 시작
		try {
			FC_ACCT_3000EJBHome home = (FC_ACCT_3000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_3000EJB");
			FC_ACCT_3000EJB ejb = home.create();

			ds = ejb.fc_acct_3004_d(dm);
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
		dm.stlm_dt = (String)hash.get("stlm_dt");
		dm.incmg_pers = (String)hash.get("incmg_pers");
		dm.incmg_pers_ipadd = (String)hash.get("incmg_pers_ipadd");
		dm.pch_count = (String)hash.get("pch_count");
		*******************************************************************************************/
	}
	public void fc_acct_3075_a(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_3075_ADataSet ds = null;
		FC_ACCT_3075_ADM dm = new FC_ACCT_3075_ADM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.stlm_dt = Util.checkString(req.getParameter("stlm_dt"));

		dm.print();
		
		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_3075_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/* EJB 수정전 시작		
		try {
			FC_ACCT_3000EJBHome home = (FC_ACCT_3000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_3000EJB");
			FC_ACCT_3000EJB ejb = home.create();

			ds = ejb.fc_acct_3005_a(dm);
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
		dm.stlm_dt = (String)hash.get("stlm_dt");
		*******************************************************************************************/
	}
	public void fc_acct_3076_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_3076_LDataSet ds = null;
		FC_ACCT_3076_LDM dm = new FC_ACCT_3076_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.stlm_dt = Util.checkString(req.getParameter("stlm_dt"));

		dm.print();
		
		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_3076_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/* EJB 수정전 시작
		try {
			FC_ACCT_3000EJBHome home = (FC_ACCT_3000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_3000EJB");
			FC_ACCT_3000EJB ejb = home.create();

			ds = ejb.fc_acct_3006_l(dm);
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
		dm.stlm_dt = (String)hash.get("stlm_dt");
		*******************************************************************************************/
	}
	public void fc_acct_3250_m(HttpServletRequest req, HttpServletResponse res)
	throws AppException, SQLException {
	FC_ACCT_3250_MDataSet ds = null;
	FC_ACCT_3250_MDM dm = new FC_ACCT_3250_MDM();
	
	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
	dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
	
	dm.print();
	
	/* EJB 수정후 시작 */
	ds = dao.fc_acct_3250_m(dm); 
	
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
	
	public void fc_acct_3251_l(HttpServletRequest req, HttpServletResponse res)
		throws AppException, SQLException {
	FC_ACCT_3251_LDataSet ds = null;
	FC_ACCT_3251_LDM dm = new FC_ACCT_3251_LDM();
	
	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
	dm.slip_occr_dt = Util.checkString(req.getParameter("slip_occr_dt"));
	dm.slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
	dm.slip_seq = Util.checkString(req.getParameter("slip_seq"));
	dm.slip_sub_seq = Util.checkString(req.getParameter("slip_sub_seq"));
	
	dm.print();
	
	/* EJB 수정후 시작 */
	ds = dao.fc_acct_3251_l(dm); 
	
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
	
	public void fc_acct_3253_i(HttpServletRequest req, HttpServletResponse res)
		throws AppException, SQLException {
	FC_ACCT_3253_IDataSet ds = null;
	FC_ACCT_3253_IDM dm = new FC_ACCT_3253_IDM();
	
	String multiUpdateData = Util.checkString(req
			.getParameter("multiUpdateData"));
	Hashtable hash = getHashMultiUpdateData(multiUpdateData);
	
	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
	dm.slip_occr_dt = Util.checkString(req.getParameter("slip_occr_dt"));
	dm.slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
	dm.slip_sub_seq = Util.checkString(req.getParameter("slip_sub_seq"));
	dm.clam_dept_cd = Util.checkString(req.getParameter("clam_dept_cd"));
	dm.incmg_emp_no = Util.checkString(req.getParameter("incmg_emp_no"));
	dm.fisc_dt = Util.checkString(req.getParameter("fisc_dt"));
	dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
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
	dm.email_id = (String) hash.get("email_id");
	dm.remk = (String) hash.get("remk");
	dm.item = (String) hash.get("item");
	dm.re_issu_resn_cd = (String) hash.get("re_issu_resn_cd");
	
	/*dm.g1_rcpm_slip_seq = (String) hash.get("g1_rcpm_slip_seq");
	dm.g1_rcpm_dt = (String) hash.get("g1_rcpm_dt");
	dm.g1_rcpm_amt = (String) hash.get("g1_rcpm_amt");
	dm.g1_rcpm_pers_nm = (String) hash.get("g1_rcpm_pers_nm");
	dm.g1_deps_psbk = (String) hash.get("g1_deps_psbk");
	dm.g1_coms = (String) hash.get("g1_coms");
	dm.g1_frex_clsf = (String) hash.get("g1_frex_clsf");
	dm.g1_exrate = (String) hash.get("g1_exrate");
	dm.g1_frex_amt = (String) hash.get("g1_frex_amt");
	dm.biz_reg_no = (String) hash.get("biz_reg_no");
	dm.bank_id  = (String) hash.get("bank_id");
	dm.acct_num = (String) hash.get("acct_num");
	dm.tran_date_seq = (String) hash.get("tran_date_seq");*/
	
	dm.print();
	
	/* EJB 수정후 시작 */
	ds = dao.fc_acct_3253_i(dm);
	
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
	
	public void fc_acct_3254_u(HttpServletRequest req, HttpServletResponse res)
		throws AppException, SQLException {
	FC_ACCT_3254_UDataSet ds = null;
	FC_ACCT_3254_UDM dm = new FC_ACCT_3254_UDM();
	
	String multiUpdateData = Util.checkString(req
			.getParameter("multiUpdateData"));
	Hashtable hash = getHashMultiUpdateData(multiUpdateData);
	
	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
	dm.slip_occr_dt = Util.checkString(req.getParameter("slip_occr_dt"));
	dm.slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
	dm.slip_seq = Util.checkString(req.getParameter("slip_seq"));
	dm.slip_sub_seq = Util.checkString(req.getParameter("slip_sub_seq"));
	dm.clam_dept_cd = Util.checkString(req.getParameter("clam_dept_cd"));
	dm.incmg_emp_no = Util.checkString(req.getParameter("incmg_emp_no"));
	dm.fisc_dt = Util.checkString(req.getParameter("fisc_dt"));
	dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
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
	dm.reso_amt = Util.checkString(req.getParameter("reso_amt"));
	dm.reso_amt_ch = Util.checkString(req.getParameter("reso_amt_ch"));
	
	dm.etc_in = (String) hash.get("etc_in");
	dm.make_dt = (String) hash.get("make_dt");
	dm.erplace_cd = (String) hash.get("erplace_cd");
	dm.ern = (String) hash.get("ern");
	dm.suply_amt = (String) hash.get("suply_amt");
	dm.vat_amt = (String) hash.get("vat_amt");
	dm.email_id = (String) hash.get("email_id");
	dm.remk = (String) hash.get("remk");
	dm.item = (String) hash.get("item");
	dm.re_issu_resn_cd = (String) hash.get("re_issu_resn_cd");
	
	/*dm.g1_rcpm_slip_seq = (String) hash.get("g1_rcpm_slip_seq");
	dm.g1_rcpm_dt = (String) hash.get("g1_rcpm_dt");
	dm.g1_rcpm_amt = (String) hash.get("g1_rcpm_amt");
	dm.g1_rcpm_pers_nm = (String) hash.get("g1_rcpm_pers_nm");
	dm.g1_deps_psbk = (String) hash.get("g1_deps_psbk");
	dm.g1_coms = (String) hash.get("g1_coms");
	dm.g1_frex_clsf = (String) hash.get("g1_frex_clsf");
	dm.g1_exrate = (String) hash.get("g1_exrate");
	dm.g1_frex_amt = (String) hash.get("g1_frex_amt");
	dm.biz_reg_no = (String) hash.get("biz_reg_no");
	dm.bank_id  = (String) hash.get("bank_id");
	dm.acct_num = (String) hash.get("acct_num");
	dm.tran_date_seq = (String) hash.get("tran_date_seq");*/
	
	dm.print();
	
	/* EJB 수정후 시작 */
	ds = dao.fc_acct_3254_u(dm);
	
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
	
	public void fc_acct_3255_d(HttpServletRequest req, HttpServletResponse res)
		throws AppException, SQLException {
	FC_ACCT_3255_DDataSet ds = null;
	FC_ACCT_3255_DDM dm = new FC_ACCT_3255_DDM();
	
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
	ds = dao.fc_acct_3255_d(dm);
	
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
	
	public void fc_acct_3256_l(HttpServletRequest req, HttpServletResponse res)
			throws AppException, SQLException {
		FC_ACCT_3256_LDataSet ds = null;
		FC_ACCT_3256_LDM dm = new FC_ACCT_3256_LDM();
		
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.slip_occr_dt = Util.checkString(req.getParameter("slip_occr_dt"));
		dm.slip_seq = Util.checkString(req.getParameter("slip_seq"));
		dm.slip_sub_seq = Util.checkString(req.getParameter("slip_sub_seq"));
		dm.fisc_dt_fr = Util.checkString(req.getParameter("ifisc_dt_fr"));
		dm.fisc_dt_to = Util.checkString(req.getParameter("fisc_dt_to"));
		dm.incmg_dt_fr = Util.checkString(req.getParameter("ifisc_dt_fr"));
		dm.incmg_dt_to = Util.checkString(req.getParameter("fisc_dt_to"));
		dm.slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
		dm.incmg_emp_no = Util.checkString(req.getParameter("incmg_emp_no"));
		dm.clam_dept_cd = Util.checkString(req.getParameter("clam_dept_cd"));
		dm.slip_aprv_yn = Util.checkString(req.getParameter("slip_aprv_yn"));
	
		
		dm.print();
		
		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_3256_LDataSet) manager.executeCall(dm);
		
		if (!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		req.setAttribute("ds", ds);
	
	}
	
	public void fc_acct_3257_a(HttpServletRequest req, HttpServletResponse res)
	throws AppException, SQLException {
		FC_ACCT_3257_ADataSet ds = null;
		FC_ACCT_3257_ADM dm = new FC_ACCT_3257_ADM();
		
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.prof_type_cd = Util.checkString(req.getParameter("prof_type_cd"));
		dm.slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
		dm.slip_occr_dt = Util.checkString(req.getParameter("slip_occr_dt"));
		dm.slip_seq = Util.checkString(req.getParameter("slip_seq"));
		dm.occr_slip_occr_dt = Util.checkString(req.getParameter("occr_slip_occr_dt"));
		dm.occr_slip_clsf_cd = Util.checkString(req.getParameter("occr_slip_clsf_cd"));
		dm.occr_slip_seq = Util.checkString(req.getParameter("occr_slip_seq"));
		dm.occr_slip_sub_seq = Util.checkString(req.getParameter("occr_slip_sub_seq"));
		dm.occr_slip_arow_no = Util.checkString(req.getParameter("occr_slip_arow_no"));
		dm.make_dt = Util.checkString(req.getParameter("make_dt"));
		dm.erplace_cd = Util.checkString(req.getParameter("erplace_cd"));
		dm.dlco_clsf_cd = Util.checkString(req.getParameter("dlco_clsf_cd"));
		dm.dlco_clsf_cd = Util.checkString(req.getParameter("dlco_clsf_cd"));
		dm.dlco_cd = Util.checkString(req.getParameter("dlco_cd"));
		dm.deal_clsf = Util.checkString(req.getParameter("deal_clsf"));
		dm.ern = Util.checkString(req.getParameter("ern"));
		dm.dlco_nm = Util.checkString(req.getParameter("dlco_nm"));
		dm.presi_nm = Util.checkString(req.getParameter("presi_nm"));
		dm.addr = Util.checkString(req.getParameter("addr"));
		dm.bizcond = Util.checkString(req.getParameter("bizcond"));
		dm.item = Util.checkString(req.getParameter("item"));
		dm.suply_amt = Util.checkString(req.getParameter("suply_amt"));
		dm.vat_amt = Util.checkString(req.getParameter("vat_amt"));
		dm.tax_stmt_aprv_yn = Util.checkString(req.getParameter("tax_stmt_aprv_yn"));
		dm.decl_yn = Util.checkString(req.getParameter("decl_yn"));
		dm.decl_qq = Util.checkString(req.getParameter("decl_qq"));
		dm.make_upd_dt = Util.checkString(req.getParameter("make_upd_dt"));
		dm.upd_tms = Util.checkString(req.getParameter("upd_tms"));
		dm.last_upd_dd = Util.checkString(req.getParameter("last_upd_dd"));
		dm.issu_pers_emp_no = Util.checkString(req.getParameter("issu_pers_emp_no"));
		dm.issu_tms = Util.checkString(req.getParameter("issu_tms"));
		dm.incmg_dt_tm = Util.checkString(req.getParameter("incmg_dt_tm"));
		dm.incmg_pers = Util.checkString(req.getParameter("incmg_emp_no"));
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		dm.canc_yn = Util.checkString(req.getParameter("canc_yn"));
		dm.canc_dt = Util.checkString(req.getParameter("canc_dt"));
		dm.del_resn = Util.checkString(req.getParameter("del_resn"));
		
		dm.mode = Util.checkString(req.getParameter("mode"));
		dm.slip_arow_no = Util.checkString(req.getParameter("slip_arow_no"));
		dm.mmdd = Util.checkString(req.getParameter("mmdd"));
		dm.item1 = Util.checkString(req.getParameter("item1"));
		dm.std = Util.checkString(req.getParameter("std"));
		dm.qunt = Util.checkString(req.getParameter("qunt"));
		dm.uprc = Util.checkString(req.getParameter("uprc"));
		dm.suply_amt1 = Util.checkString(req.getParameter("suply_amt1"));
		dm.vat_amt1 = Util.checkString(req.getParameter("vat_amt1"));
		
		dm.semuro_no = Util.checkString(req.getParameter("semuro_no"));
		dm.elec_tax_comp_cd = Util.checkString(req.getParameter("elec_tax_comp_cd"));
		dm.email_id = Util.checkString(req.getParameter("email_id"));
		
		dm.print();
		
		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_3257_ADataSet) manager.executeCall(dm);
		
		if (!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		req.setAttribute("ds", ds);		
		}
}


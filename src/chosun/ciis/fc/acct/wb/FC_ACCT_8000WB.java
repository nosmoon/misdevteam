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

import chosun.ciis.fc.acct.dm.*;
import chosun.ciis.fc.acct.ds.*;

public class FC_ACCT_8000WB extends chosun.ciis.co.base.wb.BaseWB {
	public void getDummyList(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_9999_LDataSet ds = null;
		FC_ACCT_9999_LDM dm = new FC_ACCT_9999_LDM();
		
		dm.cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
		
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
			FC_ACCT_8000EJBHome home = (FC_ACCT_8000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_8000EJB");
			FC_ACCT_8000EJB ejb = home.create();
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
	
	public void fc_acct_9011_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_9011_LDataSet ds = null;
		FC_ACCT_9011_LDM dm = new FC_ACCT_9011_LDM();
		
		dm.cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
		
		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_9011_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/* EJB 수정전 시작
		try {
			FC_ACCT_8000EJBHome home = (FC_ACCT_8000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_8000EJB");
			FC_ACCT_8000EJB ejb = home.create();
			ds = ejb.fc_acct_9011_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
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
	
	public void fc_acct_9998_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_9998_LDataSet ds = null;
		FC_ACCT_9998_LDM dm = new FC_ACCT_9998_LDM();

		dm.cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_9998_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/* EJB 수정전 시작		
		try {
			FC_ACCT_8000EJBHome home = (FC_ACCT_8000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_8000EJB");
			FC_ACCT_8000EJB ejb = home.create();

			ds = ejb.fc_acct_9998_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
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
	}
	public void fc_acct_8000_m(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_8000_MDataSet ds = null;
		FC_ACCT_8000_MDM dm = new FC_ACCT_8000_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_8000_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/* EJB 수정전 시작
		try {
			FC_ACCT_8000EJBHome home = (FC_ACCT_8000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_8000EJB");
			FC_ACCT_8000EJB ejb = home.create();

			ds = ejb.fc_acct_8000_m(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
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
	public void fc_acct_8001_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_8001_LDataSet ds = null;
		FC_ACCT_8001_LDM dm = new FC_ACCT_8001_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.frfisc_dt = Util.checkString(req.getParameter("frfisc_dt"));
		dm.tofisc_dt = Util.checkString(req.getParameter("tofisc_dt"));
		dm.acct_cd1 = Util.checkString(req.getParameter("acct_cd1"));
		dm.acct_cd2 = Util.checkString(req.getParameter("acct_cd2"));
		dm.setoff_slip_occr_dt = Util.checkString(req.getParameter("setoff_slip_occr_dt"));
		dm.setoff_slip_clsf_cd = Util.checkString(req.getParameter("setoff_slip_clsf_cd"));
		dm.setoff_slip_seq = Util.checkString(req.getParameter("setoff_slip_seq"));
		dm.setoff_slip_sub_seq = Util.checkString(req.getParameter("setoff_slip_sub_seq"));
		dm.incm_clsf_cd = Util.checkString(req.getParameter("incm_clsf_cd"));
		dm.mode = Util.checkString(req.getParameter("mode"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_8001_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/* EJB 수정전 시작
		try {
			FC_ACCT_8000EJBHome home = (FC_ACCT_8000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_8000EJB");
			FC_ACCT_8000EJB ejb = home.create();

			ds = ejb.fc_acct_8001_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
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
		dm.frfisc_dt = (String)hash.get("frfisc_dt");
		dm.tofisc_dt = (String)hash.get("tofisc_dt");
		dm.acct_cd1 = (String)hash.get("acct_cd1");
		dm.acct_cd2 = (String)hash.get("acct_cd2");
		dm.setoff_slip_occr_dt = (String)hash.get("setoff_slip_occr_dt");
		dm.setoff_slip_clsf_cd = (String)hash.get("setoff_slip_clsf_cd");
		dm.setoff_slip_seq = (String)hash.get("setoff_slip_seq");
		dm.setoff_slip_sub_seq = (String)hash.get("setoff_slip_sub_seq");
		dm.mode = (String)hash.get("mode");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.frfisc_dt = Util.getSessionParameterValue(req,"frfisc_dt",true);
		dm.tofisc_dt = Util.getSessionParameterValue(req,"tofisc_dt",true);
		dm.acct_cd1 = Util.getSessionParameterValue(req,"acct_cd1",true);
		dm.acct_cd2 = Util.getSessionParameterValue(req,"acct_cd2",true);
		dm.setoff_slip_occr_dt = Util.getSessionParameterValue(req,"setoff_slip_occr_dt",true);
		dm.setoff_slip_clsf_cd = Util.getSessionParameterValue(req,"setoff_slip_clsf_cd",true);
		dm.setoff_slip_seq = Util.getSessionParameterValue(req,"setoff_slip_seq",true);
		dm.setoff_slip_sub_seq = Util.getSessionParameterValue(req,"setoff_slip_sub_seq",true);
		dm.mode = Util.getSessionParameterValue(req,"mode",true);
		*******************************************************************************************/
	}
	public void fc_acct_8003_i(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_8003_IDataSet ds = null;
		FC_ACCT_8003_IDM dm = new FC_ACCT_8003_IDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.from_fisc_dt = Util.checkString(req.getParameter("from_fisc_dt"));
		dm.to_fisc_dt = Util.checkString(req.getParameter("to_fisc_dt"));
		dm.acct_cd1 = Util.checkString(req.getParameter("acct_cd1"));
		dm.acct_cd2 = Util.checkString(req.getParameter("acct_cd2"));
		dm.incm_clsf_cd = Util.checkString(req.getParameter("incm_clsf_cd"));
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.incmg_pers_ipadd = req.getRemoteAddr();

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_8003_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/* EJB 수정전 시작
		try {
			FC_ACCT_8000EJBHome home = (FC_ACCT_8000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_8000EJB");
			FC_ACCT_8000EJB ejb = home.create();

			ds = ejb.fc_acct_8003_i(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
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
		dm.from_fisc_dt = (String)hash.get("from_fisc_dt");
		dm.to_fisc_dt = (String)hash.get("to_fisc_dt");
		dm.acct_cd1 = (String)hash.get("acct_cd1");
		dm.acct_cd2 = (String)hash.get("acct_cd2");
		dm.incm_clsf_cd = (String)hash.get("incm_clsf_cd");
		dm.incmg_pers = (String)hash.get("incmg_pers");
		dm.incmg_pers_ipadd = (String)hash.get("incmg_pers_ipadd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.from_fisc_dt = Util.getSessionParameterValue(req,"from_fisc_dt",true);
		dm.to_fisc_dt = Util.getSessionParameterValue(req,"to_fisc_dt",true);
		dm.acct_cd1 = Util.getSessionParameterValue(req,"acct_cd1",true);
		dm.acct_cd2 = Util.getSessionParameterValue(req,"acct_cd2",true);
		dm.incm_clsf_cd = Util.getSessionParameterValue(req,"incm_clsf_cd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"incmg_pers",true);
		dm.incmg_pers_ipadd = Util.getSessionParameterValue(req,"incmg_pers_ipadd",true);
		*******************************************************************************************/
	}
	public void fc_acct_8004_i(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_8004_IDataSet ds = null;
		FC_ACCT_8004_IDM dm = new FC_ACCT_8004_IDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.fisc_dt = Util.checkString(req.getParameter("fisc_dt"));
		dm.incmg_emp_no = Util.checkString(req.getParameter("incmg_emp_no"));
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		dm.in_sicsgb = Util.checkString(req.getParameter("in_sicsgb"));
		dm.rmks1 = Util.checkString(req.getParameter("rmks1"));
		dm.acct_cd = Util.checkString(req.getParameter("acct_cd"));
		
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.slip_occr_dt = (String)hash.get("slip_occr_dt");
		dm.slip_clsf_cd = (String)hash.get("slip_clsf_cd");
		dm.slip_seq = (String)hash.get("slip_seq");
		dm.slip_sub_seq = (String)hash.get("slip_sub_seq");
		dm.slip_arow_no = (String)hash.get("slip_arow_no");

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_8004_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/* EJB 수정전 시작
		try {
			FC_ACCT_8000EJBHome home = (FC_ACCT_8000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_8000EJB");
			FC_ACCT_8000EJB ejb = home.create();

			ds = ejb.fc_acct_8004_i(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
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
		dm.slip_sub_seq = (String)hash.get("slip_sub_seq");
		dm.slip_arow_no = (String)hash.get("slip_arow_no");
		dm.fisc_dt = (String)hash.get("fisc_dt");
		dm.incmg_emp_no = (String)hash.get("incmg_emp_no");
		dm.incmg_pers = (String)hash.get("incmg_pers");
		dm.incmg_pers_ipadd = (String)hash.get("incmg_pers_ipadd");
		dm.in_sicsgb = (String)hash.get("in_sicsgb");
		dm.rmks1 = (String)hash.get("rmks1");
		dm.acct_cd = (String)hash.get("acct_cd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.slip_occr_dt = Util.getSessionParameterValue(req,"slip_occr_dt",true);
		dm.slip_clsf_cd = Util.getSessionParameterValue(req,"slip_clsf_cd",true);
		dm.slip_seq = Util.getSessionParameterValue(req,"slip_seq",true);
		dm.slip_sub_seq = Util.getSessionParameterValue(req,"slip_sub_seq",true);
		dm.slip_arow_no = Util.getSessionParameterValue(req,"slip_arow_no",true);
		dm.fisc_dt = Util.getSessionParameterValue(req,"fisc_dt",true);
		dm.incmg_emp_no = Util.getSessionParameterValue(req,"incmg_emp_no",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"incmg_pers",true);
		dm.incmg_pers_ipadd = Util.getSessionParameterValue(req,"incmg_pers_ipadd",true);
		dm.in_sicsgb = Util.getSessionParameterValue(req,"in_sicsgb",true);
		dm.rmks1 = Util.getSessionParameterValue(req,"rmks1",true);
		dm.acct_cd = Util.getSessionParameterValue(req,"acct_cd",true);
		*******************************************************************************************/
	}
	public void fc_acct_8005_i(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_8005_IDataSet ds = null;
		FC_ACCT_8005_IDM dm = new FC_ACCT_8005_IDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.setoff_slip_occr_dt = Util.checkString(req.getParameter("setoff_slip_occr_dt"));
		dm.setoff_slip_clsf_cd = Util.checkString(req.getParameter("setoff_slip_clsf_cd"));
		dm.setoff_slip_seq = Util.checkString(req.getParameter("setoff_slip_seq"));
		dm.setoff_slip_sub_seq = Util.checkString(req.getParameter("setoff_slip_sub_seq"));
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		dm.in_sicsgb = Util.checkString(req.getParameter("in_sicsgb"));
		
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.slip_occr_dt = (String)hash.get("slip_occr_dt");
		dm.slip_clsf_cd = (String)hash.get("slip_clsf_cd");
		dm.slip_seq = (String)hash.get("slip_seq");
		dm.slip_sub_seq = (String)hash.get("slip_sub_seq");
		dm.slip_arow_no = (String)hash.get("slip_arow_no");

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_8005_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/* EJB 수정전 시작
		try {
			FC_ACCT_8000EJBHome home = (FC_ACCT_8000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_8000EJB");
			FC_ACCT_8000EJB ejb = home.create();

			ds = ejb.fc_acct_8005_i(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
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
		dm.setoff_slip_occr_dt = (String)hash.get("setoff_slip_occr_dt");
		dm.setoff_slip_clsf_cd = (String)hash.get("setoff_slip_clsf_cd");
		dm.setoff_slip_seq = (String)hash.get("setoff_slip_seq");
		dm.setoff_slip_sub_seq = (String)hash.get("setoff_slip_sub_seq");
		dm.slip_occr_dt = (String)hash.get("slip_occr_dt");
		dm.slip_clsf_cd = (String)hash.get("slip_clsf_cd");
		dm.slip_seq = (String)hash.get("slip_seq");
		dm.slip_sub_seq = (String)hash.get("slip_sub_seq");
		dm.slip_arow_no = (String)hash.get("slip_arow_no");
		dm.incmg_pers = (String)hash.get("incmg_pers");
		dm.incmg_pers_ipadd = (String)hash.get("incmg_pers_ipadd");
		dm.in_sicsgb = (String)hash.get("in_sicsgb");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.setoff_slip_occr_dt = Util.getSessionParameterValue(req,"setoff_slip_occr_dt",true);
		dm.setoff_slip_clsf_cd = Util.getSessionParameterValue(req,"setoff_slip_clsf_cd",true);
		dm.setoff_slip_seq = Util.getSessionParameterValue(req,"setoff_slip_seq",true);
		dm.setoff_slip_sub_seq = Util.getSessionParameterValue(req,"setoff_slip_sub_seq",true);
		dm.slip_occr_dt = Util.getSessionParameterValue(req,"slip_occr_dt",true);
		dm.slip_clsf_cd = Util.getSessionParameterValue(req,"slip_clsf_cd",true);
		dm.slip_seq = Util.getSessionParameterValue(req,"slip_seq",true);
		dm.slip_sub_seq = Util.getSessionParameterValue(req,"slip_sub_seq",true);
		dm.slip_arow_no = Util.getSessionParameterValue(req,"slip_arow_no",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"incmg_pers",true);
		dm.incmg_pers_ipadd = Util.getSessionParameterValue(req,"incmg_pers_ipadd",true);
		dm.in_sicsgb = Util.getSessionParameterValue(req,"in_sicsgb",true);
		*******************************************************************************************/
	}
	public void fc_acct_8010_m(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_8010_MDataSet ds = null;
		FC_ACCT_8010_MDM dm = new FC_ACCT_8010_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_8010_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/* EJB 수정전 시작
		try {
			FC_ACCT_8000EJBHome home = (FC_ACCT_8000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_8000EJB");
			FC_ACCT_8000EJB ejb = home.create();

			ds = ejb.fc_acct_8010_m(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
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
	public void fc_acct_8021_s(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_8021_SDataSet ds = null;
		FC_ACCT_8021_SDM dm = new FC_ACCT_8021_SDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.from_fisc_dt = Util.checkString(req.getParameter("from_fisc_dt"));
		dm.to_fisc_dt = Util.checkString(req.getParameter("to_fisc_dt"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_8021_SDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/* EJB 수정전 시작
		try {
			FC_ACCT_8000EJBHome home = (FC_ACCT_8000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_8000EJB");
			FC_ACCT_8000EJB ejb = home.create();

			ds = ejb.fc_acct_8021_s(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
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
		dm.from_fisc_dt = (String)hash.get("from_fisc_dt");
		dm.to_fisc_dt = (String)hash.get("to_fisc_dt");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.from_fisc_dt = Util.getSessionParameterValue(req,"from_fisc_dt",true);
		dm.to_fisc_dt = Util.getSessionParameterValue(req,"to_fisc_dt",true);
		*******************************************************************************************/
	}	
	public void fc_acct_8030_m(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_8030_MDataSet ds = null;
		FC_ACCT_8030_MDM dm = new FC_ACCT_8030_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);

		dm.print();
		
		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_8030_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/* EJB 수정전 시작
		try {
			FC_ACCT_8000EJBHome home = (FC_ACCT_8000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_8000EJB");
			FC_ACCT_8000EJB ejb = home.create();

			ds = ejb.fc_acct_8030_m(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
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
	public void fc_acct_8061_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_8061_LDataSet ds = null;
		FC_ACCT_8061_LDM dm = new FC_ACCT_8061_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.from_fisc_dt = Util.checkString(req.getParameter("from_fisc_dt"));
		dm.to_fisc_dt = Util.checkString(req.getParameter("to_fisc_dt"));
		dm.erplace_cd = Util.checkString(req.getParameter("erplace_cd"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_8061_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/* EJB 수정전 시작
		try {
			FC_ACCT_8000EJBHome home = (FC_ACCT_8000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_8000EJB");
			FC_ACCT_8000EJB ejb = home.create();

			ds = ejb.fc_acct_8061_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
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
		dm.from_fisc_dt = (String)hash.get("from_fisc_dt");
		dm.to_fisc_dt = (String)hash.get("to_fisc_dt");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.from_fisc_dt = Util.getSessionParameterValue(req,"from_fisc_dt",true);
		dm.to_fisc_dt = Util.getSessionParameterValue(req,"to_fisc_dt",true);
		*******************************************************************************************/
	}
	public void fc_acct_8062_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_8062_LDataSet ds = null;
		FC_ACCT_8062_LDM dm = new FC_ACCT_8062_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.from_fisc_dt = Util.checkString(req.getParameter("from_fisc_dt"));
		dm.to_fisc_dt = Util.checkString(req.getParameter("to_fisc_dt"));
		dm.erplace_cd = Util.checkString(req.getParameter("erplace_cd"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_8062_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/* EJB 수정전 시작
		try {
			FC_ACCT_8000EJBHome home = (FC_ACCT_8000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_8000EJB");
			FC_ACCT_8000EJB ejb = home.create();

			ds = ejb.fc_acct_8062_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
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
		dm.from_fisc_dt = (String)hash.get("from_fisc_dt");
		dm.to_fisc_dt = (String)hash.get("to_fisc_dt");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.from_fisc_dt = Util.getSessionParameterValue(req,"from_fisc_dt",true);
		dm.to_fisc_dt = Util.getSessionParameterValue(req,"to_fisc_dt",true);
		*******************************************************************************************/
	}	
	public void fc_acct_8064_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_8064_LDataSet ds = null;
		FC_ACCT_8064_LDM dm = new FC_ACCT_8064_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.submit_dt = Util.checkString(req.getParameter("submit_dt"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_8064_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/* EJB 수정전 시작
		try {
			FC_ACCT_8000EJBHome home = (FC_ACCT_8000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_8000EJB");
			FC_ACCT_8000EJB ejb = home.create();

			ds = ejb.fc_acct_8064_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
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
		dm.submit_dt = (String)hash.get("submit_dt");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.submit_dt = Util.getSessionParameterValue(req,"submit_dt",true);
		*******************************************************************************************/
	}
	public void fc_acct_8065_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_8065_LDataSet ds = null;
		FC_ACCT_8065_LDM dm = new FC_ACCT_8065_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.inwoncnt = Util.checkString(req.getParameter("inwoncnt"));
		dm.totcnt = Util.checkString(req.getParameter("totcnt"));
		dm.totamt = Util.checkString(req.getParameter("totamt"));
		dm.sdstotamt = Util.checkString(req.getParameter("sdstotamt"));
		dm.jmstotamt = Util.checkString(req.getParameter("jmstotamt"));
		dm.wctotamt = Util.checkString(req.getParameter("wctotamt"));
		dm.soaegcnt = Util.checkString(req.getParameter("soaegcnt"));
		dm.soaegamt = Util.checkString(req.getParameter("soaegamt"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_8065_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/* EJB 수정전 시작
		try {
			FC_ACCT_8000EJBHome home = (FC_ACCT_8000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_8000EJB");
			FC_ACCT_8000EJB ejb = home.create();

			ds = ejb.fc_acct_8065_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
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
		dm.inwoncnt = (String)hash.get("inwoncnt");
		dm.totcnt = (String)hash.get("totcnt");
		dm.totamt = (String)hash.get("totamt");
		dm.sdstotamt = (String)hash.get("sdstotamt");
		dm.jmstotamt = (String)hash.get("jmstotamt");
		dm.wctotamt = (String)hash.get("wctotamt");
		dm.soaegcnt = (String)hash.get("soaegcnt");
		dm.soaegamt = (String)hash.get("soaegamt");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.inwoncnt = Util.getSessionParameterValue(req,"inwoncnt",true);
		dm.totcnt = Util.getSessionParameterValue(req,"totcnt",true);
		dm.totamt = Util.getSessionParameterValue(req,"totamt",true);
		dm.sdstotamt = Util.getSessionParameterValue(req,"sdstotamt",true);
		dm.jmstotamt = Util.getSessionParameterValue(req,"jmstotamt",true);
		dm.wctotamt = Util.getSessionParameterValue(req,"wctotamt",true);
		dm.soaegcnt = Util.getSessionParameterValue(req,"soaegcnt",true);
		dm.soaegamt = Util.getSessionParameterValue(req,"soaegamt",true);
		*******************************************************************************************/
	}	
	public void fc_acct_8066_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_8066_LDataSet ds = null;
		FC_ACCT_8066_LDM dm = new FC_ACCT_8066_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.from_fisc_dt = Util.checkString(req.getParameter("from_fisc_dt"));
		dm.to_fisc_dt = Util.checkString(req.getParameter("to_fisc_dt"));
		dm.erplace_cd = Util.checkString(req.getParameter("erplace_cd"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_8066_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/* EJB 수정전 시작
		try {
			FC_ACCT_8000EJBHome home = (FC_ACCT_8000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_8000EJB");
			FC_ACCT_8000EJB ejb = home.create();

			ds = ejb.fc_acct_8066_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
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
		dm.from_fisc_dt = (String)hash.get("from_fisc_dt");
		dm.to_fisc_dt = (String)hash.get("to_fisc_dt");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.from_fisc_dt = Util.getSessionParameterValue(req,"from_fisc_dt",true);
		dm.to_fisc_dt = Util.getSessionParameterValue(req,"to_fisc_dt",true);
		*******************************************************************************************/
	}
	public void fc_acct_8070_m(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_8070_MDataSet ds = null;
		FC_ACCT_8070_MDM dm = new FC_ACCT_8070_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_8070_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/* EJB 수정전 시작
		try {
			FC_ACCT_8000EJBHome home = (FC_ACCT_8000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_8000EJB");
			FC_ACCT_8000EJB ejb = home.create();

			ds = ejb.fc_acct_8071_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
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
		dm.from_fisc_dt = (String)hash.get("from_fisc_dt");
		dm.to_fisc_dt = (String)hash.get("to_fisc_dt");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.from_fisc_dt = Util.getSessionParameterValue(req,"from_fisc_dt",true);
		dm.to_fisc_dt = Util.getSessionParameterValue(req,"to_fisc_dt",true);
		*******************************************************************************************/
	}
	public void fc_acct_8071_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_8071_LDataSet ds = null;
		FC_ACCT_8071_LDM dm = new FC_ACCT_8071_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.from_fisc_dt = Util.checkString(req.getParameter("from_fisc_dt"));
		dm.to_fisc_dt = Util.checkString(req.getParameter("to_fisc_dt"));
		dm.erplace_cd = Util.checkString(req.getParameter("erplace_cd"));	
		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_8071_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/* EJB 수정전 시작
		try {
			FC_ACCT_8000EJBHome home = (FC_ACCT_8000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_8000EJB");
			FC_ACCT_8000EJB ejb = home.create();

			ds = ejb.fc_acct_8071_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
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
		dm.from_fisc_dt = (String)hash.get("from_fisc_dt");
		dm.to_fisc_dt = (String)hash.get("to_fisc_dt");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.from_fisc_dt = Util.getSessionParameterValue(req,"from_fisc_dt",true);
		dm.to_fisc_dt = Util.getSessionParameterValue(req,"to_fisc_dt",true);
		*******************************************************************************************/
	}	
	public void fc_acct_8072_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_8072_LDataSet ds = null;
		FC_ACCT_8072_LDM dm = new FC_ACCT_8072_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.from_fisc_dt = Util.checkString(req.getParameter("from_fisc_dt"));
		dm.to_fisc_dt = Util.checkString(req.getParameter("to_fisc_dt"));
		dm.erplace_cd = Util.checkString(req.getParameter("erplace_cd"));	
		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_8072_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/* EJB 수정전 시작
		try {
			FC_ACCT_8000EJBHome home = (FC_ACCT_8000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_8000EJB");
			FC_ACCT_8000EJB ejb = home.create();

			ds = ejb.fc_acct_8072_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
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
		dm.from_fisc_dt = (String)hash.get("from_fisc_dt");
		dm.to_fisc_dt = (String)hash.get("to_fisc_dt");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.from_fisc_dt = Util.getSessionParameterValue(req,"from_fisc_dt",true);
		dm.to_fisc_dt = Util.getSessionParameterValue(req,"to_fisc_dt",true);
		*******************************************************************************************/
	}
	public void fc_acct_8073_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_8073_LDataSet ds = null;
		FC_ACCT_8073_LDM dm = new FC_ACCT_8073_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.submit_dt = Util.checkString(req.getParameter("submit_dt"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_8073_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/* EJB 수정전 시작
		try {
			FC_ACCT_8000EJBHome home = (FC_ACCT_8000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_8000EJB");
			FC_ACCT_8000EJB ejb = home.create();

			ds = ejb.fc_acct_8073_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
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
		dm.submit_dt = (String)hash.get("submit_dt");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.submit_dt = Util.getSessionParameterValue(req,"submit_dt",true);
		*******************************************************************************************/
	}
	public void fc_acct_8074_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_8074_LDataSet ds = null;
		FC_ACCT_8074_LDM dm = new FC_ACCT_8074_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.inwoncnt = Util.checkString(req.getParameter("inwoncnt"));
		dm.totcnt = Util.checkString(req.getParameter("totcnt"));
		dm.totamt = Util.checkString(req.getParameter("totamt"));
		dm.sdtotamt = Util.checkString(req.getParameter("sdtotamt"));
		dm.sdstotamt = Util.checkString(req.getParameter("sdstotamt"));
		dm.jmstotamt = Util.checkString(req.getParameter("jmstotamt"));
		dm.wctotamt = Util.checkString(req.getParameter("wctotamt"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_8074_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/* EJB 수정전 시작		
		try {
			FC_ACCT_8000EJBHome home = (FC_ACCT_8000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_8000EJB");
			FC_ACCT_8000EJB ejb = home.create();

			ds = ejb.fc_acct_8074_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
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
		dm.inwoncnt = (String)hash.get("inwoncnt");
		dm.totcnt = (String)hash.get("totcnt");
		dm.totamt = (String)hash.get("totamt");
		dm.sdtotamt = (String)hash.get("sdtotamt");
		dm.sdstotamt = (String)hash.get("sdstotamt");
		dm.jmstotamt = (String)hash.get("jmstotamt");
		dm.wctotamt = (String)hash.get("wctotamt");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.inwoncnt = Util.getSessionParameterValue(req,"inwoncnt",true);
		dm.totcnt = Util.getSessionParameterValue(req,"totcnt",true);
		dm.totamt = Util.getSessionParameterValue(req,"totamt",true);
		dm.sdtotamt = Util.getSessionParameterValue(req,"sdtotamt",true);
		dm.sdstotamt = Util.getSessionParameterValue(req,"sdstotamt",true);
		dm.jmstotamt = Util.getSessionParameterValue(req,"jmstotamt",true);
		dm.wctotamt = Util.getSessionParameterValue(req,"wctotamt",true);
		*******************************************************************************************/
	}
	public void fc_acct_8080_m(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_8080_MDataSet ds = null;
		FC_ACCT_8080_MDM dm = new FC_ACCT_8080_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_8080_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/* EJB 수정전 시작
		try {
			FC_ACCT_8000EJBHome home = (FC_ACCT_8000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_8000EJB");
			FC_ACCT_8000EJB ejb = home.create();

			ds = ejb.fc_acct_8071_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
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
		dm.from_fisc_dt = (String)hash.get("from_fisc_dt");
		dm.to_fisc_dt = (String)hash.get("to_fisc_dt");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.from_fisc_dt = Util.getSessionParameterValue(req,"from_fisc_dt",true);
		dm.to_fisc_dt = Util.getSessionParameterValue(req,"to_fisc_dt",true);
		*******************************************************************************************/
	}
	public void fc_acct_8081_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_8081_LDataSet ds = null;
		FC_ACCT_8081_LDM dm = new FC_ACCT_8081_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.from_fisc_dt = Util.checkString(req.getParameter("from_fisc_dt"));
		dm.to_fisc_dt = Util.checkString(req.getParameter("to_fisc_dt"));
		dm.erplace_cd = Util.checkString(req.getParameter("erplace_cd"));	
		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_8081_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/* EJB 수정전 시작
		try {
			FC_ACCT_8000EJBHome home = (FC_ACCT_8000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_8000EJB");
			FC_ACCT_8000EJB ejb = home.create();

			ds = ejb.fc_acct_8081_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
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
		dm.from_fisc_dt = (String)hash.get("from_fisc_dt");
		dm.to_fisc_dt = (String)hash.get("to_fisc_dt");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.from_fisc_dt = Util.getSessionParameterValue(req,"from_fisc_dt",true);
		dm.to_fisc_dt = Util.getSessionParameterValue(req,"to_fisc_dt",true);
		*******************************************************************************************/
	}
	public void fc_acct_8082_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_8082_LDataSet ds = null;
		FC_ACCT_8082_LDM dm = new FC_ACCT_8082_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.from_fisc_dt = Util.checkString(req.getParameter("from_fisc_dt"));
		dm.to_fisc_dt = Util.checkString(req.getParameter("to_fisc_dt"));
		dm.erplace_cd = Util.checkString(req.getParameter("erplace_cd"));	
		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_8082_LDataSet)manager.executeCall(dm);
		System.out.println("------------------------------");
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/* EJB 수정전 시작
		try {
			FC_ACCT_8000EJBHome home = (FC_ACCT_8000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_8000EJB");
			FC_ACCT_8000EJB ejb = home.create();

			ds = ejb.fc_acct_8082_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
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
		dm.from_fisc_dt = (String)hash.get("from_fisc_dt");
		dm.to_fisc_dt = (String)hash.get("to_fisc_dt");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.from_fisc_dt = Util.getSessionParameterValue(req,"from_fisc_dt",true);
		dm.to_fisc_dt = Util.getSessionParameterValue(req,"to_fisc_dt",true);
		*******************************************************************************************/
	}
	public void fc_acct_8083_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_8083_LDataSet ds = null;
		FC_ACCT_8083_LDM dm = new FC_ACCT_8083_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.submit_dt = Util.checkString(req.getParameter("submit_dt"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_8083_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/* EJB 수정전 시작
		try {
			FC_ACCT_8000EJBHome home = (FC_ACCT_8000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_8000EJB");
			FC_ACCT_8000EJB ejb = home.create();

			ds = ejb.fc_acct_8083_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
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
		dm.submit_dt = (String)hash.get("submit_dt");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.submit_dt = Util.getSessionParameterValue(req,"submit_dt",true);
		*******************************************************************************************/
	}
	public void fc_acct_8084_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_8084_LDataSet ds = null;
		FC_ACCT_8084_LDM dm = new FC_ACCT_8084_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.inwoncnt = Util.checkString(req.getParameter("inwoncnt"));
		dm.totcnt = Util.checkString(req.getParameter("totcnt"));
		dm.totamt = Util.checkString(req.getParameter("totamt"));
		dm.sdtotamt = Util.checkString(req.getParameter("sdtotamt"));
		dm.sdstotamt = Util.checkString(req.getParameter("sdstotamt"));
		dm.jmstotamt = Util.checkString(req.getParameter("jmstotamt"));
		dm.wctotamt = Util.checkString(req.getParameter("wctotamt"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_8084_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/* EJB 수정전 시작
		try {
			FC_ACCT_8000EJBHome home = (FC_ACCT_8000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_8000EJB");
			FC_ACCT_8000EJB ejb = home.create();

			ds = ejb.fc_acct_8084_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
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
		dm.inwoncnt = (String)hash.get("inwoncnt");
		dm.totcnt = (String)hash.get("totcnt");
		dm.totamt = (String)hash.get("totamt");
		dm.sdtotamt = (String)hash.get("sdtotamt");
		dm.sdstotamt = (String)hash.get("sdstotamt");
		dm.jmstotamt = (String)hash.get("jmstotamt");
		dm.wctotamt = (String)hash.get("wctotamt");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.inwoncnt = Util.getSessionParameterValue(req,"inwoncnt",true);
		dm.totcnt = Util.getSessionParameterValue(req,"totcnt",true);
		dm.totamt = Util.getSessionParameterValue(req,"totamt",true);
		dm.sdtotamt = Util.getSessionParameterValue(req,"sdtotamt",true);
		dm.sdstotamt = Util.getSessionParameterValue(req,"sdstotamt",true);
		dm.jmstotamt = Util.getSessionParameterValue(req,"jmstotamt",true);
		dm.wctotamt = Util.getSessionParameterValue(req,"wctotamt",true);
		*******************************************************************************************/
	}	
	public void fc_acct_8090_m(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_8090_MDataSet ds = null;
		FC_ACCT_8090_MDM dm = new FC_ACCT_8090_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_8090_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/* EJB 수정전 시작
		try {
			FC_ACCT_8000EJBHome home = (FC_ACCT_8000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_8000EJB");
			FC_ACCT_8000EJB ejb = home.create();

			ds = ejb.fc_acct_8090_m(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
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
	public void fc_acct_8091_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_8091_LDataSet ds = null;
		FC_ACCT_8091_LDM dm = new FC_ACCT_8091_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.from_fisc_dt = Util.checkString(req.getParameter("from_fisc_dt"));
		dm.to_fisc_dt = Util.checkString(req.getParameter("to_fisc_dt"));
		dm.dlco_clsf_cd = Util.checkString(req.getParameter("dlco_clsf_cd"));
		dm.dlco_cd = Util.checkString(req.getParameter("dlco_cd"));
		dm.incm_clsf_cd = Util.checkString(req.getParameter("incm_clsf_cd"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_8091_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/* EJB 수정전 시작
		try {
			FC_ACCT_8000EJBHome home = (FC_ACCT_8000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_8000EJB");
			FC_ACCT_8000EJB ejb = home.create();

			ds = ejb.fc_acct_8091_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
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
		dm.from_fisc_dt = (String)hash.get("from_fisc_dt");
		dm.to_fisc_dt = (String)hash.get("to_fisc_dt");
		dm.dlco_clsf_cd = (String)hash.get("dlco_clsf_cd");
		dm.dlco_cd = (String)hash.get("dlco_cd");
		dm.incm_clsf_cd = (String)hash.get("incm_clsf_cd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.from_fisc_dt = Util.getSessionParameterValue(req,"from_fisc_dt",true);
		dm.to_fisc_dt = Util.getSessionParameterValue(req,"to_fisc_dt",true);
		dm.dlco_clsf_cd = Util.getSessionParameterValue(req,"dlco_clsf_cd",true);
		dm.dlco_cd = Util.getSessionParameterValue(req,"dlco_cd",true);
		dm.incm_clsf_cd = Util.getSessionParameterValue(req,"incm_clsf_cd",true);
		*******************************************************************************************/
	}
	public void fc_acct_8110_m(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_8110_MDataSet ds = null;
		FC_ACCT_8110_MDM dm = new FC_ACCT_8110_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_8110_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/* EJB 수정전 시작
		try {
			FC_ACCT_8000EJBHome home = (FC_ACCT_8000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_8000EJB");
			FC_ACCT_8000EJB ejb = home.create();

			ds = ejb.fc_acct_8110_m(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
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
	public void fc_acct_8121_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_8121_LDataSet ds = null;
		FC_ACCT_8121_LDM dm = new FC_ACCT_8121_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.from_fisc_dt = Util.checkString(req.getParameter("from_fisc_dt"));
		dm.to_fisc_dt = Util.checkString(req.getParameter("to_fisc_dt"));
		dm.erplace_cd = Util.checkString(req.getParameter("erplace_cd"));	
		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_8121_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/* EJB 수정전 시작
		try {
			FC_ACCT_8000EJBHome home = (FC_ACCT_8000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_8000EJB");
			FC_ACCT_8000EJB ejb = home.create();

			ds = ejb.fc_acct_8121_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
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
		dm.from_fisc_dt = (String)hash.get("from_fisc_dt");
		dm.to_fisc_dt = (String)hash.get("to_fisc_dt");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.from_fisc_dt = Util.getSessionParameterValue(req,"from_fisc_dt",true);
		dm.to_fisc_dt = Util.getSessionParameterValue(req,"to_fisc_dt",true);
		*******************************************************************************************/
	}
	public void fc_acct_8122_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_8122_LDataSet ds = null;
		FC_ACCT_8122_LDM dm = new FC_ACCT_8122_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.submit_dt = Util.checkString(req.getParameter("submit_dt"));
		dm.erplace_cd = Util.checkString(req.getParameter("erplace_cd"));
		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_8122_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/* EJB 수정전 시작
		try {
			FC_ACCT_8000EJBHome home = (FC_ACCT_8000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_8000EJB");
			FC_ACCT_8000EJB ejb = home.create();

			ds = ejb.fc_acct_8122_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
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
		dm.submit_dt = (String)hash.get("submit_dt");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.submit_dt = Util.getSessionParameterValue(req,"submit_dt",true);
		*******************************************************************************************/
	}
	public void fc_acct_8123_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_8123_LDataSet ds = null;
		FC_ACCT_8123_LDM dm = new FC_ACCT_8123_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_8123_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/* EJB 수정전 시작
		try {
			FC_ACCT_8000EJBHome home = (FC_ACCT_8000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_8000EJB");
			FC_ACCT_8000EJB ejb = home.create();

			ds = ejb.fc_acct_8123_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
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
	public void fc_acct_8124_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_8124_LDataSet ds = null;
		FC_ACCT_8124_LDM dm = new FC_ACCT_8124_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.from_fisc_dt = Util.checkString(req.getParameter("from_fisc_dt"));
		dm.to_fisc_dt = Util.checkString(req.getParameter("to_fisc_dt"));
		dm.erplace_cd = Util.checkString(req.getParameter("erplace_cd"));	
		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_8124_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/* EJB 수정전 시작
		try {
			FC_ACCT_8000EJBHome home = (FC_ACCT_8000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_8000EJB");
			FC_ACCT_8000EJB ejb = home.create();

			ds = ejb.fc_acct_8124_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
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
		dm.from_fisc_dt = (String)hash.get("from_fisc_dt");
		dm.to_fisc_dt = (String)hash.get("to_fisc_dt");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.from_fisc_dt = Util.getSessionParameterValue(req,"from_fisc_dt",true);
		dm.to_fisc_dt = Util.getSessionParameterValue(req,"to_fisc_dt",true);
		*******************************************************************************************/
	}
	public void fc_acct_8130_m(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_8130_MDataSet ds = null;
		FC_ACCT_8130_MDM dm = new FC_ACCT_8130_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_8130_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/* EJB 수정전 시작
		try {
			FC_ACCT_8000EJBHome home = (FC_ACCT_8000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_8000EJB");
			FC_ACCT_8000EJB ejb = home.create();

			ds = ejb.fc_acct_8130_m(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
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
	public void fc_acct_8999_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_8999_LDataSet ds = null;
		FC_ACCT_8999_LDM dm = new FC_ACCT_8999_LDM();

		dm.cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_8999_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/* EJB 수정전 시작
		try {
			FC_ACCT_8000EJBHome home = (FC_ACCT_8000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_8000EJB");
			FC_ACCT_8000EJB ejb = home.create();

			ds = ejb.fc_acct_8999_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
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
	}
}

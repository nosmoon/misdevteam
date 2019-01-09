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

public class FC_ACCT_4000WB extends chosun.ciis.co.base.wb.BaseWB {
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
			FC_ACCT_4000EJBHome home = (FC_ACCT_4000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_4000EJB");
			FC_ACCT_4000EJB ejb = home.create();
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
	public void fc_acct_4000_m(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_4000_MDataSet ds = null;
		FC_ACCT_4000_MDM dm = new FC_ACCT_4000_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_4000_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/* EJB 수정전 시작
		try {
			FC_ACCT_4000EJBHome home = (FC_ACCT_4000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_4000EJB");
			FC_ACCT_4000EJB ejb = home.create();

			ds = ejb.fc_acct_4000_m(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
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
	public void fc_acct_4001_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_4001_LDataSet ds = null;
		FC_ACCT_4001_LDM dm = new FC_ACCT_4001_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.occr_acct_cd = Util.checkString(req.getParameter("occr_acct_cd"));
		dm.from_fisc_dt = Util.checkString(req.getParameter("from_fisc_dt"));
		dm.to_fisc_dt = Util.checkString(req.getParameter("to_fisc_dt"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_4001_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/* EJB 수정전 시작
		try {
			FC_ACCT_4000EJBHome home = (FC_ACCT_4000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_4000EJB");
			FC_ACCT_4000EJB ejb = home.create();

			ds = ejb.fc_acct_4001_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
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
		dm.occr_acct_cd = (String)hash.get("occr_acct_cd");
		dm.from_fisc_dt = (String)hash.get("from_fisc_dt");
		dm.to_fisc_dt = (String)hash.get("to_fisc_dt");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.occr_acct_cd = Util.getSessionParameterValue(req,"occr_acct_cd",true);
		dm.from_fisc_dt = Util.getSessionParameterValue(req,"from_fisc_dt",true);
		dm.to_fisc_dt = Util.getSessionParameterValue(req,"to_fisc_dt",true);
		*******************************************************************************************/
	}
	public void fc_acct_4002_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_4002_LDataSet ds = null;
		FC_ACCT_4002_LDM dm = new FC_ACCT_4002_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.adjm_occr_dt = Util.checkString(req.getParameter("adjm_occr_dt"));
		dm.adjm_slip_clsf = Util.checkString(req.getParameter("adjm_slip_clsf"));
		dm.adjm_seq = Util.checkString(req.getParameter("adjm_seq"));
		dm.adjm_sub_seq = Util.checkString(req.getParameter("adjm_sub_seq"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_4002_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/* EJB 수정전 시작
		try {
			FC_ACCT_4000EJBHome home = (FC_ACCT_4000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_4000EJB");
			FC_ACCT_4000EJB ejb = home.create();

			ds = ejb.fc_acct_4002_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
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
		dm.adjm_occr_dt = (String)hash.get("adjm_occr_dt");
		dm.adjm_slip_clsf = (String)hash.get("adjm_slip_clsf");
		dm.adjm_seq = (String)hash.get("adjm_seq");
		dm.adjm_sub_seq = (String)hash.get("adjm_sub_seq");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.adjm_occr_dt = Util.getSessionParameterValue(req,"adjm_occr_dt",true);
		dm.adjm_slip_clsf = Util.getSessionParameterValue(req,"adjm_slip_clsf",true);
		dm.adjm_seq = Util.getSessionParameterValue(req,"adjm_seq",true);
		dm.adjm_sub_seq = Util.getSessionParameterValue(req,"adjm_sub_seq",true);
		*******************************************************************************************/
	}
	public void fc_acct_4004_d(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_4004_DDataSet ds = null;
		FC_ACCT_4004_DDM dm = new FC_ACCT_4004_DDM();

		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.slip_occr_dt = (String)hash.get("slip_occr_dt");
		dm.slip_clsf_cd = (String)hash.get("slip_clsf_cd");
		dm.slip_seq = (String)hash.get("slip_seq");
		dm.slip_sub_seq = (String)hash.get("slip_sub_seq");
		dm.slip_arow_no = (String)hash.get("slip_arow_no");
		dm.in_sicsgb = Util.checkString(req.getParameter("in_sicsgb"));
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.incmg_pers_ipadd = req.getRemoteAddr();

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_4004_DDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/* EJB 수정전 시작
		try {
			FC_ACCT_4000EJBHome home = (FC_ACCT_4000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_4000EJB");
			FC_ACCT_4000EJB ejb = home.create();

			ds = ejb.fc_acct_4004_d(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
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
		dm.in_sicsgb = (String)hash.get("in_sicsgb");
		dm.incmg_pers = (String)hash.get("incmg_pers");
		dm.incmg_pers_ipadd = (String)hash.get("incmg_pers_ipadd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.slip_occr_dt = Util.getSessionParameterValue(req,"slip_occr_dt",true);
		dm.slip_clsf_cd = Util.getSessionParameterValue(req,"slip_clsf_cd",true);
		dm.slip_seq = Util.getSessionParameterValue(req,"slip_seq",true);
		dm.slip_sub_seq = Util.getSessionParameterValue(req,"slip_sub_seq",true);
		dm.slip_arow_no = Util.getSessionParameterValue(req,"slip_arow_no",true);
		dm.in_sicsgb = Util.getSessionParameterValue(req,"in_sicsgb",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"incmg_pers",true);
		dm.incmg_pers_ipadd = Util.getSessionParameterValue(req,"incmg_pers_ipadd",true);
		*******************************************************************************************/
	}
	public void fc_acct_4005_i(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_4005_IDataSet ds = null;
		FC_ACCT_4005_IDM dm = new FC_ACCT_4005_IDM();

		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.slip_occr_dt = (String)hash.get("slip_occr_dt");
		dm.slip_clsf_cd = (String)hash.get("slip_clsf_cd");
		dm.slip_seq = (String)hash.get("slip_seq");
		dm.slip_sub_seq = (String)hash.get("slip_sub_seq");
		dm.slip_arow_no = (String)hash.get("slip_arow_no");
		dm.occr_amt = (String)hash.get("occr_amt");
		dm.fisc_dt = Util.checkString(req.getParameter("fisc_dt"));
		dm.incmg_emp_no = Util.checkString(req.getParameter("incmg_emp_no"));
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		dm.in_sicsgb = Util.checkString(req.getParameter("in_sicsgb"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_4005_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/* EJB 수정전 시작
		try {
			FC_ACCT_4000EJBHome home = (FC_ACCT_4000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_4000EJB");
			FC_ACCT_4000EJB ejb = home.create();

			ds = ejb.fc_acct_4005_i(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
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
		dm.occr_amt = (String)hash.get("occr_amt");
		dm.fisc_dt = (String)hash.get("fisc_dt");
		dm.incmg_emp_no = (String)hash.get("incmg_emp_no");
		dm.incmg_pers = (String)hash.get("incmg_pers");
		dm.incmg_pers_ipadd = (String)hash.get("incmg_pers_ipadd");
		dm.in_sicsgb = (String)hash.get("in_sicsgb");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.slip_occr_dt = Util.getSessionParameterValue(req,"slip_occr_dt",true);
		dm.slip_clsf_cd = Util.getSessionParameterValue(req,"slip_clsf_cd",true);
		dm.slip_seq = Util.getSessionParameterValue(req,"slip_seq",true);
		dm.slip_sub_seq = Util.getSessionParameterValue(req,"slip_sub_seq",true);
		dm.slip_arow_no = Util.getSessionParameterValue(req,"slip_arow_no",true);
		dm.occr_amt = Util.getSessionParameterValue(req,"occr_amt",true);
		dm.fisc_dt = Util.getSessionParameterValue(req,"fisc_dt",true);
		dm.incmg_emp_no = Util.getSessionParameterValue(req,"incmg_emp_no",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"incmg_pers",true);
		dm.incmg_pers_ipadd = Util.getSessionParameterValue(req,"incmg_pers_ipadd",true);
		dm.in_sicsgb = Util.getSessionParameterValue(req,"in_sicsgb",true);
		*******************************************************************************************/
	}
	public void fc_acct_4010_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_4010_LDataSet ds = null;
		FC_ACCT_4010_LDM dm = new FC_ACCT_4010_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.from_fisc_dt = Util.checkString(req.getParameter("from_fisc_dt"));
		dm.to_fisc_dt = Util.checkString(req.getParameter("to_fisc_dt"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_4010_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/* EJB 수정전 시작
		try {
			FC_ACCT_4000EJBHome home = (FC_ACCT_4000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_4000EJB");
			FC_ACCT_4000EJB ejb = home.create();

			ds = ejb.fc_acct_4010_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
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
	public void fc_acct_4006_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_4006_LDataSet ds = null;
		FC_ACCT_4006_LDM dm = new FC_ACCT_4006_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.occr_acct_cd = Util.checkString(req.getParameter("occr_acct_cd"));
		dm.from_fisc_dt = Util.checkString(req.getParameter("from_fisc_dt"));
		dm.to_fisc_dt = Util.checkString(req.getParameter("to_fisc_dt"));
		dm.adjm_occr_dt = Util.checkString(req.getParameter("adjm_occr_dt"));
		dm.adjm_slip_clsf = Util.checkString(req.getParameter("adjm_slip_clsf"));
		dm.adjm_seq = Util.checkString(req.getParameter("adjm_seq"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_4006_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/* EJB 수정전 시작
		try {
			FC_ACCT_4000EJBHome home = (FC_ACCT_4000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_4000EJB");
			FC_ACCT_4000EJB ejb = home.create();

			ds = ejb.fc_acct_4006_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
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
		dm.occr_acct_cd = (String)hash.get("occr_acct_cd");
		dm.from_fisc_dt = (String)hash.get("from_fisc_dt");
		dm.to_fisc_dt = (String)hash.get("to_fisc_dt");
		dm.adjm_occr_dt = (String)hash.get("adjm_occr_dt");
		dm.adjm_slip_clsf = (String)hash.get("adjm_slip_clsf");
		dm.adjm_seq = (String)hash.get("adjm_seq");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.occr_acct_cd = Util.getSessionParameterValue(req,"occr_acct_cd",true);
		dm.from_fisc_dt = Util.getSessionParameterValue(req,"from_fisc_dt",true);
		dm.to_fisc_dt = Util.getSessionParameterValue(req,"to_fisc_dt",true);
		dm.adjm_occr_dt = Util.getSessionParameterValue(req,"adjm_occr_dt",true);
		dm.adjm_slip_clsf = Util.getSessionParameterValue(req,"adjm_slip_clsf",true);
		dm.adjm_seq = Util.getSessionParameterValue(req,"adjm_seq",true);
		*******************************************************************************************/
	}	
	public void fc_acct_4011_i(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_4011_IDataSet ds = null;
		FC_ACCT_4011_IDM dm = new FC_ACCT_4011_IDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.fr_fisc_dt = Util.checkString(req.getParameter("fr_fisc_dt"));
		dm.to_fisc_dt = Util.checkString(req.getParameter("to_fisc_dt"));
		dm.setoff_reserv_dt = Util.checkString(req.getParameter("setoff_reserv_dt"));
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.incmg_pers_ipadd = req.getRemoteAddr();

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_4011_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/* EJB 수정전 시작
		try {
			FC_ACCT_4000EJBHome home = (FC_ACCT_4000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_4000EJB");
			FC_ACCT_4000EJB ejb = home.create();

			ds = ejb.fc_acct_4011_i(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
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
		dm.fr_fisc_dt = (String)hash.get("fr_fisc_dt");
		dm.to_fisc_dt = (String)hash.get("to_fisc_dt");
		dm.setoff_reserv_dt = (String)hash.get("setoff_reserv_dt");
		dm.incmg_pers = (String)hash.get("incmg_pers");
		dm.incmg_pers_ipadd = (String)hash.get("incmg_pers_ipadd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.fr_fisc_dt = Util.getSessionParameterValue(req,"fr_fisc_dt",true);
		dm.to_fisc_dt = Util.getSessionParameterValue(req,"to_fisc_dt",true);
		dm.setoff_reserv_dt = Util.getSessionParameterValue(req,"setoff_reserv_dt",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"incmg_pers",true);
		dm.incmg_pers_ipadd = Util.getSessionParameterValue(req,"incmg_pers_ipadd",true);
		*******************************************************************************************/
	}
	public void fc_acct_4012_d(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_4012_DDataSet ds = null;
		FC_ACCT_4012_DDM dm = new FC_ACCT_4012_DDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.setoff_reserv_dt = Util.checkString(req.getParameter("setoff_reserv_dt"));
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.incmg_pers_ipadd = req.getRemoteAddr();

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_4012_DDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/* EJB 수정전 시작
		try {
			FC_ACCT_4000EJBHome home = (FC_ACCT_4000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_4000EJB");
			FC_ACCT_4000EJB ejb = home.create();

			ds = ejb.fc_acct_4012_d(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
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
		dm.setoff_reserv_dt = (String)hash.get("setoff_reserv_dt");
		dm.incmg_pers = (String)hash.get("incmg_pers");
		dm.incmg_pers_ipadd = (String)hash.get("incmg_pers_ipadd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.setoff_reserv_dt = Util.getSessionParameterValue(req,"setoff_reserv_dt",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"incmg_pers",true);
		dm.incmg_pers_ipadd = Util.getSessionParameterValue(req,"incmg_pers_ipadd",true);
		*******************************************************************************************/
	}

	public void fc_acct_4020_m(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_4020_MDataSet ds = null;
		FC_ACCT_4020_MDM dm = new FC_ACCT_4020_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_4020_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/* EJB 수정전 시작
		try {
			FC_ACCT_4000EJBHome home = (FC_ACCT_4000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_4000EJB");
			FC_ACCT_4000EJB ejb = home.create();

			ds = ejb.fc_acct_4020_m(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
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
	public void fc_acct_4021_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_4021_LDataSet ds = null;
		FC_ACCT_4021_LDM dm = new FC_ACCT_4021_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.occr_acct_cd1 = Util.checkString(req.getParameter("occr_acct_cd1"));
		dm.occr_acct_cd2 = Util.checkString(req.getParameter("occr_acct_cd2"));
		dm.dlco_clsf_cd = Util.checkString(req.getParameter("dlco_clsf_cd"));
		dm.dlco_cd = Util.checkString(req.getParameter("dlco_cd"));
		dm.slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
		dm.extnc_acct_cd = Util.checkString(req.getParameter("extnc_acct_cd"));
		dm.fr_fisc_dt = Util.checkString(req.getParameter("fr_fisc_dt"));
		dm.to_fisc_dt = Util.checkString(req.getParameter("to_fisc_dt"));
		dm.slip_occr_dt = Util.checkString(req.getParameter("slip_occr_dt"));
		dm.slip_seq = Util.checkString(req.getParameter("slip_seq"));
		dm.slip_sub_seq = Util.checkString(req.getParameter("slip_sub_seq"));
		dm.mode = Util.checkString(req.getParameter("mode"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_4021_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/* EJB 수정전 시작
		try {
			FC_ACCT_4000EJBHome home = (FC_ACCT_4000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_4000EJB");
			FC_ACCT_4000EJB ejb = home.create();

			ds = ejb.fc_acct_4021_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
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
		dm.occr_acct_cd1 = (String)hash.get("occr_acct_cd1");
		dm.occr_acct_cd2 = (String)hash.get("occr_acct_cd2");
		dm.dlco_clsf_cd = (String)hash.get("dlco_clsf_cd");
		dm.dlco_cd = (String)hash.get("dlco_cd");
		dm.slip_clsf_cd = (String)hash.get("slip_clsf_cd");
		dm.extnc_acct_cd = (String)hash.get("extnc_acct_cd");
		dm.fr_fisc_dt = (String)hash.get("fr_fisc_dt");
		dm.to_fisc_dt = (String)hash.get("to_fisc_dt");
		dm.slip_occr_dt = (String)hash.get("slip_occr_dt");
		dm.slip_seq = (String)hash.get("slip_seq");
		dm.slip_sub_seq = (String)hash.get("slip_sub_seq");
		dm.mode = (String)hash.get("mode");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.occr_acct_cd1 = Util.getSessionParameterValue(req,"occr_acct_cd1",true);
		dm.occr_acct_cd2 = Util.getSessionParameterValue(req,"occr_acct_cd2",true);
		dm.dlco_clsf_cd = Util.getSessionParameterValue(req,"dlco_clsf_cd",true);
		dm.dlco_cd = Util.getSessionParameterValue(req,"dlco_cd",true);
		dm.slip_clsf_cd = Util.getSessionParameterValue(req,"slip_clsf_cd",true);
		dm.extnc_acct_cd = Util.getSessionParameterValue(req,"extnc_acct_cd",true);
		dm.fr_fisc_dt = Util.getSessionParameterValue(req,"fr_fisc_dt",true);
		dm.to_fisc_dt = Util.getSessionParameterValue(req,"to_fisc_dt",true);
		dm.slip_occr_dt = Util.getSessionParameterValue(req,"slip_occr_dt",true);
		dm.slip_seq = Util.getSessionParameterValue(req,"slip_seq",true);
		dm.slip_sub_seq = Util.getSessionParameterValue(req,"slip_sub_seq",true);
		dm.mode = Util.getSessionParameterValue(req,"mode",true);
		*******************************************************************************************/
	}
	public void fc_acct_4022_d(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_4022_DDataSet ds = null;
		FC_ACCT_4022_DDM dm = new FC_ACCT_4022_DDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.extnc_acct_cd = Util.checkString(req.getParameter("extnc_acct_cd"));
		dm.setoff_exne = Util.checkString(req.getParameter("setoff_exne"));
		dm.setoff_dt = Util.checkString(req.getParameter("setoff_dt"));
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.incmg_pers_ipadd = req.getRemoteAddr();

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
		ds = (FC_ACCT_4022_DDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/* EJB 수정전 시작
		try {
			FC_ACCT_4000EJBHome home = (FC_ACCT_4000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_4000EJB");
			FC_ACCT_4000EJB ejb = home.create();

			ds = ejb.fc_acct_4022_d(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
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
		dm.extnc_acct_cd = (String)hash.get("extnc_acct_cd");
		dm.setoff_exne = (String)hash.get("setoff_exne");
		dm.setoff_dt = (String)hash.get("setoff_dt");
		dm.incmg_pers = (String)hash.get("incmg_pers");
		dm.incmg_pers_ipadd = (String)hash.get("incmg_pers_ipadd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.slip_occr_dt = Util.getSessionParameterValue(req,"slip_occr_dt",true);
		dm.slip_clsf_cd = Util.getSessionParameterValue(req,"slip_clsf_cd",true);
		dm.slip_seq = Util.getSessionParameterValue(req,"slip_seq",true);
		dm.slip_sub_seq = Util.getSessionParameterValue(req,"slip_sub_seq",true);
		dm.slip_arow_no = Util.getSessionParameterValue(req,"slip_arow_no",true);
		dm.extnc_acct_cd = Util.getSessionParameterValue(req,"extnc_acct_cd",true);
		dm.setoff_exne = Util.getSessionParameterValue(req,"setoff_exne",true);
		dm.setoff_dt = Util.getSessionParameterValue(req,"setoff_dt",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"incmg_pers",true);
		dm.incmg_pers_ipadd = Util.getSessionParameterValue(req,"incmg_pers_ipadd",true);
		*******************************************************************************************/
	}
	public void fc_acct_4023_i(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_4023_IDataSet ds = null;
		FC_ACCT_4023_IDM dm = new FC_ACCT_4023_IDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.extnc_acct_cd = Util.checkString(req.getParameter("extnc_acct_cd"));
		dm.setoff_reserv_exne = Util.checkString(req.getParameter("setoff_reserv_exne"));
		dm.setoff_reserv_dt = Util.checkString(req.getParameter("setoff_reserv_dt"));

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
		ds = (FC_ACCT_4023_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/* EJB 수정전 시작
		try {
			FC_ACCT_4000EJBHome home = (FC_ACCT_4000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_4000EJB");
			FC_ACCT_4000EJB ejb = home.create();

			ds = ejb.fc_acct_4023_i(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
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
		dm.extnc_acct_cd = (String)hash.get("extnc_acct_cd");
		dm.setoff_reserv_exne = (String)hash.get("setoff_reserv_exne");
		dm.setoff_reserv_dt = (String)hash.get("setoff_reserv_dt");
		dm.incmg_pers = (String)hash.get("incmg_pers");
		dm.incmg_pers_ipadd = (String)hash.get("incmg_pers_ipadd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.slip_occr_dt = Util.getSessionParameterValue(req,"slip_occr_dt",true);
		dm.slip_clsf_cd = Util.getSessionParameterValue(req,"slip_clsf_cd",true);
		dm.slip_seq = Util.getSessionParameterValue(req,"slip_seq",true);
		dm.slip_sub_seq = Util.getSessionParameterValue(req,"slip_sub_seq",true);
		dm.slip_arow_no = Util.getSessionParameterValue(req,"slip_arow_no",true);
		dm.extnc_acct_cd = Util.getSessionParameterValue(req,"extnc_acct_cd",true);
		dm.setoff_reserv_exne = Util.getSessionParameterValue(req,"setoff_reserv_exne",true);
		dm.setoff_reserv_dt = Util.getSessionParameterValue(req,"setoff_reserv_dt",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"incmg_pers",true);
		dm.incmg_pers_ipadd = Util.getSessionParameterValue(req,"incmg_pers_ipadd",true);
		*******************************************************************************************/
	}
	public void fc_acct_4027_m(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_4027_MDataSet ds = null;
		FC_ACCT_4027_MDM dm = new FC_ACCT_4027_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.extnc_acct_cd = Util.checkString(req.getParameter("extnc_acct_cd"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_4027_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/* EJB 수정전 시작
		try {
			FC_ACCT_4000EJBHome home = (FC_ACCT_4000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_4000EJB");
			FC_ACCT_4000EJB ejb = home.create();

			ds = ejb.fc_acct_4027_m(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
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
		dm.extnc_acct_cd = (String)hash.get("extnc_acct_cd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.extnc_acct_cd = Util.getSessionParameterValue(req,"extnc_acct_cd",true);
		*******************************************************************************************/
	}

	public void fc_acct_4028_i(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_4028_IDataSet ds = null;
		FC_ACCT_4028_IDM dm = new FC_ACCT_4028_IDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.setoff_acct_cd = Util.checkString(req.getParameter("setoff_acct_cd"));
		dm.mang_clsf_cd = Util.checkString(req.getParameter("mang_clsf_cd"));
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		dm.in_sicsgb = Util.checkString(req.getParameter("in_sicsgb"));
		dm.fisc_dt = Util.checkString(req.getParameter("fisc_dt"));
		dm.rmks1 = Util.checkString(req.getParameter("rmks1"));

		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.slip_occr_dt = (String)hash.get("slip_occr_dt");
		dm.slip_clsf_cd = (String)hash.get("slip_clsf_cd");
		dm.slip_seq = (String)hash.get("slip_seq");
		dm.slip_sub_seq = (String)hash.get("slip_sub_seq");
		dm.slip_arow_no = (String)hash.get("slip_arow_no");
		dm.adjm_amt = (String)hash.get("adjm_amt");
		dm.incm_clsf_cd = (String)hash.get("incm_clsf_cd");

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_4028_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/* EJB 수정전 시작
		try {
			FC_ACCT_4000EJBHome home = (FC_ACCT_4000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_4000EJB");
			FC_ACCT_4000EJB ejb = home.create();

			ds = ejb.fc_acct_4028_i(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
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
		dm.adjm_amt = (String)hash.get("adjm_amt");
		dm.incm_clsf_cd = (String)hash.get("incm_clsf_cd");
		dm.setoff_acct_cd = (String)hash.get("setoff_acct_cd");
		dm.mang_clsf_cd = (String)hash.get("mang_clsf_cd");
		dm.incmg_pers = (String)hash.get("incmg_pers");
		dm.incmg_pers_ipadd = (String)hash.get("incmg_pers_ipadd");
		dm.in_sicsgb = (String)hash.get("in_sicsgb");
		dm.fisc_dt = (String)hash.get("fisc_dt");
		dm.rmks1 = (String)hash.get("rmks1");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.slip_occr_dt = Util.getSessionParameterValue(req,"slip_occr_dt",true);
		dm.slip_clsf_cd = Util.getSessionParameterValue(req,"slip_clsf_cd",true);
		dm.slip_seq = Util.getSessionParameterValue(req,"slip_seq",true);
		dm.slip_sub_seq = Util.getSessionParameterValue(req,"slip_sub_seq",true);
		dm.slip_arow_no = Util.getSessionParameterValue(req,"slip_arow_no",true);
		dm.adjm_amt = Util.getSessionParameterValue(req,"adjm_amt",true);
		dm.incm_clsf_cd = Util.getSessionParameterValue(req,"incm_clsf_cd",true);
		dm.setoff_acct_cd = Util.getSessionParameterValue(req,"setoff_acct_cd",true);
		dm.mang_clsf_cd = Util.getSessionParameterValue(req,"mang_clsf_cd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"incmg_pers",true);
		dm.incmg_pers_ipadd = Util.getSessionParameterValue(req,"incmg_pers_ipadd",true);
		dm.in_sicsgb = Util.getSessionParameterValue(req,"in_sicsgb",true);
		dm.fisc_dt = Util.getSessionParameterValue(req,"fisc_dt",true);
		dm.rmks1 = Util.getSessionParameterValue(req,"rmks1",true);
		*******************************************************************************************/
	}
	
	public void fc_acct_4029_d(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_4029_DDataSet ds = null;
		FC_ACCT_4029_DDM dm = new FC_ACCT_4029_DDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.adjm_occr_dt = Util.checkString(req.getParameter("adjm_occr_dt"));
		dm.adjm_slip_clsf = Util.checkString(req.getParameter("adjm_slip_clsf"));
		dm.adjm_seq = Util.checkString(req.getParameter("adjm_seq"));
		dm.adjm_sub_seq = Util.checkString(req.getParameter("adjm_sub_seq"));
		dm.slip_occr_dt = Util.checkString(req.getParameter("slip_occr_dt"));
		dm.slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
		dm.slip_seq = Util.checkString(req.getParameter("slip_seq"));
		dm.slip_sub_seq = Util.checkString(req.getParameter("slip_sub_seq"));
		dm.slip_arow_no = Util.checkString(req.getParameter("slip_arow_no"));
		dm.in_sicsgb = Util.checkString(req.getParameter("in_sicsgb"));
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		
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
		ds = (FC_ACCT_4029_DDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/* EJB 수정전 시작
		try {
			FC_ACCT_4000EJBHome home = (FC_ACCT_4000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_4000EJB");
			FC_ACCT_4000EJB ejb = home.create();

			ds = ejb.fc_acct_4029_d(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
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
		dm.adjm_occr_dt = (String)hash.get("adjm_occr_dt");
		dm.adjm_slip_clsf = (String)hash.get("adjm_slip_clsf");
		dm.adjm_seq = (String)hash.get("adjm_seq");
		dm.adjm_sub_seq = (String)hash.get("adjm_sub_seq");
		dm.slip_occr_dt = (String)hash.get("slip_occr_dt");
		dm.slip_clsf_cd = (String)hash.get("slip_clsf_cd");
		dm.slip_seq = (String)hash.get("slip_seq");
		dm.slip_sub_seq = (String)hash.get("slip_sub_seq");
		dm.slip_arow_no = (String)hash.get("slip_arow_no");
		dm.in_sicsgb = (String)hash.get("in_sicsgb");
		dm.incmg_pers = (String)hash.get("incmg_pers");
		dm.incmg_pers_ipadd = (String)hash.get("incmg_pers_ipadd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.adjm_occr_dt = Util.getSessionParameterValue(req,"adjm_occr_dt",true);
		dm.adjm_slip_clsf = Util.getSessionParameterValue(req,"adjm_slip_clsf",true);
		dm.adjm_seq = Util.getSessionParameterValue(req,"adjm_seq",true);
		dm.adjm_sub_seq = Util.getSessionParameterValue(req,"adjm_sub_seq",true);
		dm.slip_occr_dt = Util.getSessionParameterValue(req,"slip_occr_dt",true);
		dm.slip_clsf_cd = Util.getSessionParameterValue(req,"slip_clsf_cd",true);
		dm.slip_seq = Util.getSessionParameterValue(req,"slip_seq",true);
		dm.slip_sub_seq = Util.getSessionParameterValue(req,"slip_sub_seq",true);
		dm.slip_arow_no = Util.getSessionParameterValue(req,"slip_arow_no",true);
		dm.in_sicsgb = Util.getSessionParameterValue(req,"in_sicsgb",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"incmg_pers",true);
		dm.incmg_pers_ipadd = Util.getSessionParameterValue(req,"incmg_pers_ipadd",true);
		*******************************************************************************************/
	}	

	public void fc_acct_4030_m(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
      FC_ACCT_4030_MDataSet ds = null;
      FC_ACCT_4030_MDM dm = new FC_ACCT_4030_MDM();

      dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);

      /* EJB 수정후 시작 */
      DBManager manager = new DBManager("MISFNC");
      ds = (FC_ACCT_4030_MDataSet)manager.executeCall(dm);

      if(!ds.getErrcode().equals("")) {
      	throw new AppException(ds.getErrcode(), ds.getErrmsg());
      }

      req.setAttribute("ds", ds);
      /* EJB 수정후 끝 */

      /* EJB 수정전 시작
      try {
          FC_ACCT_4000EJBHome home = (FC_ACCT_4000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_4000EJB");
          FC_ACCT_4000EJB ejb = home.create();

          ds = ejb.fc_acct_4030_m(dm);
          req.setAttribute("ds", ds);
      }
      catch (CreateException e) {
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
	public void fc_acct_4040_m(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_4040_MDataSet ds = null;
		FC_ACCT_4040_MDM dm = new FC_ACCT_4040_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_4040_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/* EJB 수정전 시작
		try {
			FC_ACCT_4000EJBHome home = (FC_ACCT_4000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_4000EJB");
			FC_ACCT_4000EJB ejb = home.create();

			ds = ejb.fc_acct_4041_p(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
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
		dm.flag = (String)hash.get("flag");
		dm.sort = (String)hash.get("sort");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.frfisc_dt = Util.getSessionParameterValue(req,"frfisc_dt",true);
		dm.tofisc_dt = Util.getSessionParameterValue(req,"tofisc_dt",true);
		dm.flag = Util.getSessionParameterValue(req,"flag",true);
		dm.sort = Util.getSessionParameterValue(req,"sort",true);
		*******************************************************************************************/
	}
	public void fc_acct_4041_p(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_4041_PDataSet ds = null;
		FC_ACCT_4041_PDM dm = new FC_ACCT_4041_PDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.frfisc_dt = Util.checkString(req.getParameter("frfisc_dt"));
		dm.tofisc_dt = Util.checkString(req.getParameter("tofisc_dt"));
		dm.flag = Util.checkString(req.getParameter("flag"));
		dm.sort = Util.checkString(req.getParameter("sort"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_4041_PDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/* EJB 수정전 시작
		try {
			FC_ACCT_4000EJBHome home = (FC_ACCT_4000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_4000EJB");
			FC_ACCT_4000EJB ejb = home.create();

			ds = ejb.fc_acct_4041_p(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
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
		dm.flag = (String)hash.get("flag");
		dm.sort = (String)hash.get("sort");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.frfisc_dt = Util.getSessionParameterValue(req,"frfisc_dt",true);
		dm.tofisc_dt = Util.getSessionParameterValue(req,"tofisc_dt",true);
		dm.flag = Util.getSessionParameterValue(req,"flag",true);
		dm.sort = Util.getSessionParameterValue(req,"sort",true);
		*******************************************************************************************/
	}
	public void fc_acct_4044_p(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_4044_PDataSet ds = null;
		FC_ACCT_4044_PDM dm = new FC_ACCT_4044_PDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.stat_dt = Util.checkString(req.getParameter("stat_dt"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_4044_PDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/* EJB 수정전 시작
		try {
			FC_ACCT_4000EJBHome home = (FC_ACCT_4000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_4000EJB");
			FC_ACCT_4000EJB ejb = home.create();

			ds = ejb.fc_acct_4044_p(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
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
		dm.stat_dt = (String)hash.get("stat_dt");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.stat_dt = Util.getSessionParameterValue(req,"stat_dt",true);
		*******************************************************************************************/
	}
}

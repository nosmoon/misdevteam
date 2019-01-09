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

public class FC_ACCT_7000WB extends chosun.ciis.co.base.wb.BaseWB {
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
			FC_ACCT_7000EJBHome home = (FC_ACCT_7000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_7000EJB");
			FC_ACCT_7000EJB ejb = home.create();
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
	public void fc_acct_7000_m(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_7000_MDataSet ds = null;
		FC_ACCT_7000_MDM dm = new FC_ACCT_7000_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_7000_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/* EJB 수정전 시작
		try {
			FC_ACCT_7000EJBHome home = (FC_ACCT_7000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_7000EJB");
			FC_ACCT_7000EJB ejb = home.create();

			ds = ejb.fc_acct_7001_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
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
		dm.card_mang_no = (String)hash.get("card_mang_no");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.card_mang_no = Util.getSessionParameterValue(req,"card_mang_no",true);
		*******************************************************************************************/
	}
	public void fc_acct_7001_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_7001_LDataSet ds = null;
		FC_ACCT_7001_LDM dm = new FC_ACCT_7001_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.card_mang_no = Util.checkString(req.getParameter("card_mang_no"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_7001_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/* EJB 수정전 시작
		try {
			FC_ACCT_7000EJBHome home = (FC_ACCT_7000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_7000EJB");
			FC_ACCT_7000EJB ejb = home.create();

			ds = ejb.fc_acct_7001_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
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
		dm.card_mang_no = (String)hash.get("card_mang_no");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.card_mang_no = Util.getSessionParameterValue(req,"card_mang_no",true);
		*******************************************************************************************/
	}
	
		public void fc_acct_7002_i(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_7002_IDataSet ds = null;
		FC_ACCT_7002_IDM dm = new FC_ACCT_7002_IDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.card_mang_no = Util.checkString(req.getParameter("card_mang_no"));
		dm.card_no = Util.checkString(req.getParameter("card_no"));
		dm.bcusesabeon = Util.checkString(req.getParameter("bcusesabeon"));
		dm.issu_dt = Util.checkString(req.getParameter("issu_dt"));
		dm.mtry_dt = Util.checkString(req.getParameter("mtry_dt"));
		dm.decid_dd = Util.checkString(req.getParameter("decid_dd"));
		dm.wste_dt = Util.checkString(req.getParameter("wste_dt"));
		dm.dlco_cd = Util.checkString(req.getParameter("dlco_cd"));
		dm.decid_bank_cd = Util.checkString(req.getParameter("decid_bank_cd"));
		dm.memb_dnmn = Util.checkString(req.getParameter("memb_dnmn"));
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		dm.use_yn = Util.checkString(req.getParameter("use_yn"));
		dm.corp_card_clsf = Util.checkString(req.getParameter("corp_card_clsf"));
		dm.pch_ynm = Util.checkString(req.getParameter("pch_ynm"));
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_7002_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/* EJB 수정전 시작
		try {
			FC_ACCT_7000EJBHome home = (FC_ACCT_7000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_7000EJB");
			FC_ACCT_7000EJB ejb = home.create();

			ds = ejb.fc_acct_7002_i(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
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
		dm.card_mang_no = (String)hash.get("card_mang_no");
		dm.card_no = (String)hash.get("card_no");
		dm.bcusesabeon = (String)hash.get("bcusesabeon");
		dm.issu_dt = (String)hash.get("issu_dt");
		dm.mtry_dt = (String)hash.get("mtry_dt");
		dm.decid_dd = (String)hash.get("decid_dd");
		dm.wste_dt = (String)hash.get("wste_dt");
		dm.dlco_cd = (String)hash.get("dlco_cd");
		dm.decid_bank_cd = (String)hash.get("decid_bank_cd");
		dm.memb_dnmn = (String)hash.get("memb_dnmn");
		dm.emp_no = (String)hash.get("emp_no");
		dm.incmg_pers_ipadd = (String)hash.get("incmg_pers_ipadd");
		dm.use_yn = (String)hash.get("use_yn");
		dm.corp_card_clsf = (String)hash.get("corp_card_clsf");
		dm.pch_ynm = (String)hash.get("pch_ynm");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.card_mang_no = Util.getSessionParameterValue(req,"card_mang_no",true);
		dm.card_no = Util.getSessionParameterValue(req,"card_no",true);
		dm.bcusesabeon = Util.getSessionParameterValue(req,"bcusesabeon",true);
		dm.issu_dt = Util.getSessionParameterValue(req,"issu_dt",true);
		dm.mtry_dt = Util.getSessionParameterValue(req,"mtry_dt",true);
		dm.decid_dd = Util.getSessionParameterValue(req,"decid_dd",true);
		dm.wste_dt = Util.getSessionParameterValue(req,"wste_dt",true);
		dm.dlco_cd = Util.getSessionParameterValue(req,"dlco_cd",true);
		dm.decid_bank_cd = Util.getSessionParameterValue(req,"decid_bank_cd",true);
		dm.memb_dnmn = Util.getSessionParameterValue(req,"memb_dnmn",true);
		dm.emp_no = Util.getSessionParameterValue(req,"emp_no",true);
		dm.incmg_pers_ipadd = Util.getSessionParameterValue(req,"incmg_pers_ipadd",true);
		dm.use_yn = Util.getSessionParameterValue(req,"use_yn",true);
		dm.corp_card_clsf = Util.getSessionParameterValue(req,"corp_card_clsf",true);
		dm.pch_ynm = Util.getSessionParameterValue(req,"pch_ynm",true);
		*******************************************************************************************/
	}
	public void fc_acct_7003_u(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_7003_UDataSet ds = null;
		FC_ACCT_7003_UDM dm = new FC_ACCT_7003_UDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.card_mang_no = Util.checkString(req.getParameter("card_mang_no"));
		dm.card_no = Util.checkString(req.getParameter("card_no"));
		dm.bcusesabeon = Util.checkString(req.getParameter("bcusesabeon"));
		dm.issu_dt = Util.checkString(req.getParameter("issu_dt"));
		dm.mtry_dt = Util.checkString(req.getParameter("mtry_dt"));
		dm.decid_dd = Util.checkString(req.getParameter("decid_dd"));
		dm.wste_dt = Util.checkString(req.getParameter("wste_dt"));
		dm.dlco_cd = Util.checkString(req.getParameter("dlco_cd"));
		dm.decid_bank_cd = Util.checkString(req.getParameter("decid_bank_cd"));
		dm.memb_dnmn = Util.checkString(req.getParameter("memb_dnmn"));
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		dm.use_yn = Util.checkString(req.getParameter("use_yn"));
		dm.corp_card_clsf = Util.checkString(req.getParameter("corp_card_clsf"));
		dm.pch_ynm = Util.checkString(req.getParameter("pch_ynm"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_7003_UDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/* EJB 수정전 시작
		try {
			FC_ACCT_7000EJBHome home = (FC_ACCT_7000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_7000EJB");
			FC_ACCT_7000EJB ejb = home.create();

			ds = ejb.fc_acct_7003_u(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
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
		dm.card_mang_no = (String)hash.get("card_mang_no");
		dm.card_no = (String)hash.get("card_no");
		dm.bcusesabeon = (String)hash.get("bcusesabeon");
		dm.issu_dt = (String)hash.get("issu_dt");
		dm.mtry_dt = (String)hash.get("mtry_dt");
		dm.decid_dd = (String)hash.get("decid_dd");
		dm.wste_dt = (String)hash.get("wste_dt");
		dm.dlco_cd = (String)hash.get("dlco_cd");
		dm.decid_bank_cd = (String)hash.get("decid_bank_cd");
		dm.memb_dnmn = (String)hash.get("memb_dnmn");
		dm.emp_no = (String)hash.get("emp_no");
		dm.incmg_pers_ipadd = (String)hash.get("incmg_pers_ipadd");
		dm.use_yn = (String)hash.get("use_yn");
		dm.corp_card_clsf = (String)hash.get("corp_card_clsf");
		dm.pch_ynm = (String)hash.get("pch_ynm");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.card_mang_no = Util.getSessionParameterValue(req,"card_mang_no",true);
		dm.card_no = Util.getSessionParameterValue(req,"card_no",true);
		dm.bcusesabeon = Util.getSessionParameterValue(req,"bcusesabeon",true);
		dm.issu_dt = Util.getSessionParameterValue(req,"issu_dt",true);
		dm.mtry_dt = Util.getSessionParameterValue(req,"mtry_dt",true);
		dm.decid_dd = Util.getSessionParameterValue(req,"decid_dd",true);
		dm.wste_dt = Util.getSessionParameterValue(req,"wste_dt",true);
		dm.dlco_cd = Util.getSessionParameterValue(req,"dlco_cd",true);
		dm.decid_bank_cd = Util.getSessionParameterValue(req,"decid_bank_cd",true);
		dm.memb_dnmn = Util.getSessionParameterValue(req,"memb_dnmn",true);
		dm.emp_no = Util.getSessionParameterValue(req,"emp_no",true);
		dm.incmg_pers_ipadd = Util.getSessionParameterValue(req,"incmg_pers_ipadd",true);
		dm.use_yn = Util.getSessionParameterValue(req,"use_yn",true);
		dm.corp_card_clsf = Util.getSessionParameterValue(req,"corp_card_clsf",true);
		dm.pch_ynm = Util.getSessionParameterValue(req,"pch_ynm",true);
		*******************************************************************************************/
	}	
	public void fc_acct_7004_d(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_7004_DDataSet ds = null;
		FC_ACCT_7004_DDM dm = new FC_ACCT_7004_DDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.card_mang_no = Util.checkString(req.getParameter("card_mang_no"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_7004_DDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/* EJB 수정전 시작
		try {
			FC_ACCT_7000EJBHome home = (FC_ACCT_7000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_7000EJB");
			FC_ACCT_7000EJB ejb = home.create();

			ds = ejb.fc_acct_7004_d(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
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
		dm.card_mang_no = (String)hash.get("card_mang_no");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.card_mang_no = Util.getSessionParameterValue(req,"card_mang_no",true);
		*******************************************************************************************/
	}
	
	public void fc_acct_7011_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_7011_LDataSet ds = null;
		FC_ACCT_7011_LDM dm = new FC_ACCT_7011_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.fisc_fr = Util.checkString(req.getParameter("fisc_fr"));
		dm.fisc_to = Util.checkString(req.getParameter("fisc_to"));
		dm.acct_cd1 = Util.checkString(req.getParameter("acct_cd1"));
		dm.acct_cd2 = Util.checkString(req.getParameter("acct_cd2"));
		dm.acct_cd3 = Util.checkString(req.getParameter("acct_cd3"));
		dm.acct_cd4 = Util.checkString(req.getParameter("acct_cd4"));
		dm.acct_cd5 = Util.checkString(req.getParameter("acct_cd5"));
		dm.acct_cd6 = Util.checkString(req.getParameter("acct_cd6"));
		dm.acct_cd7 = Util.checkString(req.getParameter("acct_cd7"));
		dm.acct_cd8 = Util.checkString(req.getParameter("acct_cd8"));
		dm.acct_cd9 = Util.checkString(req.getParameter("acct_cd9"));
		dm.acct_cd10 = Util.checkString(req.getParameter("acct_cd10"));
		dm.acct_cd11 = Util.checkString(req.getParameter("acct_cd11"));
		dm.acct_cd12 = Util.checkString(req.getParameter("acct_cd12"));

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_7011_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/* EJB 수정전 시작
		try {
			FC_ACCT_7000EJBHome home = (FC_ACCT_7000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_7000EJB");
			FC_ACCT_7000EJB ejb = home.create();

			ds = ejb.fc_acct_7011_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
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
		dm.fisc_dt_fr = (String)hash.get(fisc_dt_fr");
		dm.fisc_dt_to = (String)hash.get(fisc_dt_to");
		dm.acct_cd1 = (String)hash.get(acct_cd1");
		dm.acct_cd2 = (String)hash.get(acct_cd2");
		dm.acct_cd3 = (String)hash.get(acct_cd3");
		dm.acct_cd4 = (String)hash.get(acct_cd4");
		dm.acct_cd5 = (String)hash.get(acct_cd5");
		dm.acct_cd6 = (String)hash.get(acct_cd6");
		dm.acct_cd7 = (String)hash.get(acct_cd7");
		dm.acct_cd8 = (String)hash.get(acct_cd8");
		dm.acct_cd9 = (String)hash.get(acct_cd9");
		dm.acct_cd10 = (String)hash.get(acct_cd10");
		dm.acct_cd11 = (String)hash.get(acct_cd11");
		dm.acct_cd12 = (String)hash.get(acct_cd12");
		*******************************************************************************************/
	}
	public void fc_acct_7012_i(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_7012_IDataSet ds = null;
		FC_ACCT_7012_IDM dm = new FC_ACCT_7012_IDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.fisc_fr = Util.checkString(req.getParameter("fisc_fr"));
		dm.fisc_to = Util.checkString(req.getParameter("fisc_to"));
		dm.acct_cd1 = Util.checkString(req.getParameter("acct_cd1"));
		dm.acct_cd2 = Util.checkString(req.getParameter("acct_cd2"));
		dm.acct_cd3 = Util.checkString(req.getParameter("acct_cd3"));
		dm.acct_cd4 = Util.checkString(req.getParameter("acct_cd4"));
		dm.acct_cd5 = Util.checkString(req.getParameter("acct_cd5"));		
		dm.acct_cd6 = Util.checkString(req.getParameter("acct_cd6"));
		dm.acct_cd7 = Util.checkString(req.getParameter("acct_cd7"));
		dm.acct_cd8 = Util.checkString(req.getParameter("acct_cd8"));
		dm.acct_cd9 = Util.checkString(req.getParameter("acct_cd9"));
		dm.acct_cd10 = Util.checkString(req.getParameter("acct_cd10"));
		dm.acct_cd11 = Util.checkString(req.getParameter("acct_cd11"));
		dm.acct_cd12 = Util.checkString(req.getParameter("acct_cd12"));
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.incmg_pers_ipadd = req.getRemoteAddr();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_7012_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/* EJB 수정전 시작
		try {
			FC_ACCT_7000EJBHome home = (FC_ACCT_7000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_7000EJB");
			FC_ACCT_7000EJB ejb = home.create();

			ds = ejb.fc_acct_7012_i(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
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
		dm.fisc_fr = (String)hash.get(fisc_fr");
		dm.fisc_to = (String)hash.get(fisc_to");
		dm.acct_cd1 = (String)hash.get(acct_cd1");
		dm.acct_cd2 = (String)hash.get(acct_cd2");
		dm.acct_cd3 = (String)hash.get(acct_cd3");
		dm.acct_cd4 = (String)hash.get(acct_cd4");
		dm.acct_cd5 = (String)hash.get(acct_cd5");
		dm.acct_cd6 = (String)hash.get(acct_cd6");
		dm.acct_cd7 = (String)hash.get(acct_cd7");
		dm.acct_cd8 = (String)hash.get(acct_cd8");
		dm.acct_cd9 = (String)hash.get(acct_cd9");
		dm.acct_cd10 = (String)hash.get(acct_cd10");
		dm.acct_cd11 = (String)hash.get(acct_cd11");
		dm.acct_cd12 = (String)hash.get(acct_cd12");
		dm.incmg_pers = (String)hash.get(incmg_pers");
		dm.incmg_pers_ipadd = (String)hash.get(incmg_pers_ipadd");
		*******************************************************************************************/
	}	
	public void fc_acct_7013_d(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_7013_DDataSet ds = null;
		FC_ACCT_7013_DDM dm = new FC_ACCT_7013_DDM();
		
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.fisc_fr = Util.checkString(req.getParameter("fisc_fr"));
		dm.fisc_to = Util.checkString(req.getParameter("fisc_to"));
		dm.acct_cd1 = Util.checkString(req.getParameter("acct_cd1"));
		dm.acct_cd2 = Util.checkString(req.getParameter("acct_cd2"));
		dm.acct_cd3 = Util.checkString(req.getParameter("acct_cd3"));
		dm.acct_cd4 = Util.checkString(req.getParameter("acct_cd4"));
		dm.acct_cd5 = Util.checkString(req.getParameter("acct_cd5"));
		dm.acct_cd6 = Util.checkString(req.getParameter("acct_cd6"));
		dm.acct_cd7 = Util.checkString(req.getParameter("acct_cd7"));
		dm.acct_cd8 = Util.checkString(req.getParameter("acct_cd8"));
		dm.acct_cd9 = Util.checkString(req.getParameter("acct_cd9"));
		dm.acct_cd10 = Util.checkString(req.getParameter("acct_cd10"));
		dm.acct_cd11 = Util.checkString(req.getParameter("acct_cd11"));
		dm.acct_cd12 = Util.checkString(req.getParameter("acct_cd12"));

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_7013_DDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/* EJB 수정전 시작
		try {
			FC_ACCT_7000EJBHome home = (FC_ACCT_7000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_7000EJB");
			FC_ACCT_7000EJB ejb = home.create();

			ds = ejb.fc_acct_7013_d(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
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
		dm.fisc_dt_fr = (String)hash.get(fisc_dt_fr");
		dm.fisc_dt_to = (String)hash.get(fisc_dt_to");
		dm.acct_cd1 = (String)hash.get(acct_cd1");
		dm.acct_cd2 = (String)hash.get(acct_cd2");
		dm.acct_cd3 = (String)hash.get(acct_cd3");
		dm.acct_cd4 = (String)hash.get(acct_cd4");
		dm.acct_cd5 = (String)hash.get(acct_cd5");
		dm.acct_cd6 = (String)hash.get(acct_cd6");
		dm.acct_cd7 = (String)hash.get(acct_cd7");
		dm.acct_cd8 = (String)hash.get(acct_cd8");
		dm.acct_cd9 = (String)hash.get(acct_cd9");
		dm.acct_cd10 = (String)hash.get(acct_cd10");
		dm.acct_cd11 = (String)hash.get(acct_cd11");
		dm.acct_cd12 = (String)hash.get(acct_cd12");
		*******************************************************************************************/
	}	
}

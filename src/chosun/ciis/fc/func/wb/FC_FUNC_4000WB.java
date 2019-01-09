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

public class FC_FUNC_4000WB extends chosun.ciis.co.base.wb.BaseWB {
	public void getDummyList(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_9999_LDataSet ds = null;
		FC_FUNC_9999_LDM dm = new FC_FUNC_9999_LDM();
		
		dm.cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
		
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
			FC_FUNC_4000EJBHome home = (FC_FUNC_4000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_4000EJB");
			FC_FUNC_4000EJB ejb = home.create();
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
	public void fc_func_4000_m(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_4000_MDataSet ds = null;
		FC_FUNC_4000_MDM dm = new FC_FUNC_4000_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.recp_dt = Util.checkString(req.getParameter("recp_dt"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_4000_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_FUNC_4000EJBHome home = (FC_FUNC_4000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_4000EJB");
			FC_FUNC_4000EJB ejb = home.create();

			ds = ejb.fc_func_4000_m(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
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
	public void fc_func_4001_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_4001_LDataSet ds = null;
		FC_FUNC_4001_LDM dm = new FC_FUNC_4001_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.recp_dt = Util.checkString(req.getParameter("recp_dt"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_4001_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_FUNC_4000EJBHome home = (FC_FUNC_4000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_4000EJB");
			FC_FUNC_4000EJB ejb = home.create();

			ds = ejb.fc_func_4001_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
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
	public void fc_func_4002_i(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_4002_IDataSet ds = null;
		FC_FUNC_4002_IDM dm = new FC_FUNC_4002_IDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.recp_dt = Util.checkString(req.getParameter("recp_dt"));
		dm.bgn_no = Util.checkString(req.getParameter("bgn_no"));
		dm.pch_count = Util.checkString(req.getParameter("pch_count"));
		dm.curacct_clsf_cd = Util.checkString(req.getParameter("curacct_clsf_cd"));
		dm.bank_cd = Util.checkString(req.getParameter("bank_cd"));
		dm.chg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.incmg_pers_ipadd = req.getRemoteAddr();

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_4002_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_FUNC_4000EJBHome home = (FC_FUNC_4000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_4000EJB");
			FC_FUNC_4000EJB ejb = home.create();

			ds = ejb.fc_func_4002_i(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
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
		dm.bgn_no = (String)hash.get("bgn_no");
		dm.pch_count = (String)hash.get("pch_count");
		dm.curacct_clsf_cd = (String)hash.get("curacct_clsf_cd");
		dm.bank_cd = (String)hash.get("bank_cd");
		dm.chg_pers = (String)hash.get("chg_pers");
		dm.incmg_pers_ipadd = (String)hash.get("incmg_pers_ipadd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.recp_dt = Util.getSessionParameterValue(req,"recp_dt",true);
		dm.bgn_no = Util.getSessionParameterValue(req,"bgn_no",true);
		dm.pch_count = Util.getSessionParameterValue(req,"pch_count",true);
		dm.curacct_clsf_cd = Util.getSessionParameterValue(req,"curacct_clsf_cd",true);
		dm.bank_cd = Util.getSessionParameterValue(req,"bank_cd",true);
		dm.chg_pers = Util.getSessionParameterValue(req,"chg_pers",true);
		dm.incmg_pers_ipadd = Util.getSessionParameterValue(req,"incmg_pers_ipadd",true);
		*******************************************************************************************/
	}
	public void fc_func_4003_i(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_4003_IDataSet ds = null;
		FC_FUNC_4003_IDM dm = new FC_FUNC_4003_IDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.recp_dt = Util.checkString(req.getParameter("recp_dt"));
		dm.bgn_no = Util.checkString(req.getParameter("bgn_no"));
		dm.pch_count = Util.checkString(req.getParameter("pch_count"));
		dm.curacct_clsf_cd = Util.checkString(req.getParameter("curacct_clsf_cd"));
		dm.bank_cd = Util.checkString(req.getParameter("bank_cd"));
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.incmg_pers_ipadd = req.getRemoteAddr();

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_4003_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_FUNC_4000EJBHome home = (FC_FUNC_4000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_4000EJB");
			FC_FUNC_4000EJB ejb = home.create();

			ds = ejb.fc_func_4003_i(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
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
		dm.bgn_no = (String)hash.get("bgn_no");
		dm.pch_count = (String)hash.get("pch_count");
		dm.curacct_clsf_cd = (String)hash.get("curacct_clsf_cd");
		dm.bank_cd = (String)hash.get("bank_cd");
		dm.incmg_pers = (String)hash.get("incmg_pers");
		dm.incmg_pers_ipadd = (String)hash.get("incmg_pers_ipadd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.recp_dt = Util.getSessionParameterValue(req,"recp_dt",true);
		dm.bgn_no = Util.getSessionParameterValue(req,"bgn_no",true);
		dm.pch_count = Util.getSessionParameterValue(req,"pch_count",true);
		dm.curacct_clsf_cd = Util.getSessionParameterValue(req,"curacct_clsf_cd",true);
		dm.bank_cd = Util.getSessionParameterValue(req,"bank_cd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"incmg_pers",true);
		dm.incmg_pers_ipadd = Util.getSessionParameterValue(req,"incmg_pers_ipadd",true);
		*******************************************************************************************/
	}
	public void fc_func_4004_a(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_4004_ADataSet ds = null;
		FC_FUNC_4004_ADM dm = new FC_FUNC_4004_ADM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);
		dm.mode 			= (String)hash.get("m");
		dm.recp_dt 			= (String)hash.get("recp_dt");
		dm.bgn_no 			= (String)hash.get("bgn_no");
		dm.pch_count 		= (String)hash.get("pch_count");
		dm.curacct_clsf_cd 	= (String)hash.get("curacct_clsf_cd");
		dm.bank_cd 			= (String)hash.get("bank_cd");

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_4004_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_FUNC_4000EJBHome home = (FC_FUNC_4000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_4000EJB");
			FC_FUNC_4000EJB ejb = home.create();

			ds = ejb.fc_func_4004_a(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
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
		dm.recp_dt = (String)hash.get("recp_dt");
		dm.bgn_no = (String)hash.get("bgn_no");
		dm.pch_count = (String)hash.get("pch_count");
		dm.curacct_clsf_cd = (String)hash.get("curacct_clsf_cd");
		dm.bank_cd = (String)hash.get("bank_cd");
		dm.incmg_pers = (String)hash.get("incmg_pers");
		dm.incmg_pers_ipadd = (String)hash.get("incmg_pers_ipadd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.mode = Util.getSessionParameterValue(req,"mode",true);
		dm.recp_dt = Util.getSessionParameterValue(req,"recp_dt",true);
		dm.bgn_no = Util.getSessionParameterValue(req,"bgn_no",true);
		dm.pch_count = Util.getSessionParameterValue(req,"pch_count",true);
		dm.curacct_clsf_cd = Util.getSessionParameterValue(req,"curacct_clsf_cd",true);
		dm.bank_cd = Util.getSessionParameterValue(req,"bank_cd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"incmg_pers",true);
		dm.incmg_pers_ipadd = Util.getSessionParameterValue(req,"incmg_pers_ipadd",true);
		*******************************************************************************************/
	}
	public void fc_func_4021_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_4021_LDataSet ds = null;
		FC_FUNC_4021_LDM dm = new FC_FUNC_4021_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.pay_note_no = Util.checkString(req.getParameter("pay_note_no"));
		dm.stat_cd = Util.checkString(req.getParameter("stat_cd"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_4021_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_FUNC_4000EJBHome home = (FC_FUNC_4000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_4000EJB");
			FC_FUNC_4000EJB ejb = home.create();

			ds = ejb.fc_func_4021_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
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
		dm.pay_note_no = (String)hash.get("pay_note_no");
		dm.stat_cd = (String)hash.get("stat_cd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.pay_note_no = Util.getSessionParameterValue(req,"pay_note_no",true);
		dm.stat_cd = Util.getSessionParameterValue(req,"stat_cd",true);
		*******************************************************************************************/
	}
	public void fc_func_4022_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_4022_LDataSet ds = null;
		FC_FUNC_4022_LDM dm = new FC_FUNC_4022_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.pay_note_no = Util.checkString(req.getParameter("pay_note_no"));

		dm.print();
		
		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_4022_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_FUNC_4000EJBHome home = (FC_FUNC_4000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_4000EJB");
			FC_FUNC_4000EJB ejb = home.create();

			ds = ejb.fc_func_4022_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
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
		dm.pay_note_no = (String)hash.get("pay_note_no");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.pay_note_no = Util.getSessionParameterValue(req,"pay_note_no",true);
		*******************************************************************************************/
	}
	public void fc_func_4023_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_4023_LDataSet ds = null;
		FC_FUNC_4023_LDM dm = new FC_FUNC_4023_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.pay_note_no = Util.checkString(req.getParameter("pay_note_no"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_4023_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_FUNC_4000EJBHome home = (FC_FUNC_4000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_4000EJB");
			FC_FUNC_4000EJB ejb = home.create();

			ds = ejb.fc_func_4023_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
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
		dm.pay_note_no = (String)hash.get("pay_note_no");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.pay_note_no = Util.getSessionParameterValue(req,"pay_note_no",true);
		*******************************************************************************************/
	}
	public void fc_func_4024_i(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_4024_IDataSet ds = null;
		FC_FUNC_4024_IDM dm = new FC_FUNC_4024_IDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.pay_note_no = Util.checkString(req.getParameter("pay_note_no"));
		dm.stat_cd = Util.checkString(req.getParameter("stat_cd"));
		dm.stat_dt = Util.checkString(req.getParameter("stat_dt"));
		dm.rmks = Util.checkString(req.getParameter("rmks"));
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.incmg_pers_ipadd = req.getRemoteAddr();

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_4024_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_FUNC_4000EJBHome home = (FC_FUNC_4000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_4000EJB");
			FC_FUNC_4000EJB ejb = home.create();

			ds = ejb.fc_func_4024_i(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
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
		dm.pay_note_no = (String)hash.get("pay_note_no");
		dm.stat_cd = (String)hash.get("stat_cd");
		dm.stat_dt = (String)hash.get("stat_dt");
		dm.rmks = (String)hash.get("rmks");
		dm.incmg_pers = (String)hash.get("incmg_pers");
		dm.incmg_pers_ipadd = (String)hash.get("incmg_pers_ipadd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.pay_note_no = Util.getSessionParameterValue(req,"pay_note_no",true);
		dm.stat_cd = Util.getSessionParameterValue(req,"stat_cd",true);
		dm.stat_dt = Util.getSessionParameterValue(req,"stat_dt",true);
		dm.rmks = Util.getSessionParameterValue(req,"rmks",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"incmg_pers",true);
		dm.incmg_pers_ipadd = Util.getSessionParameterValue(req,"incmg_pers_ipadd",true);
		*******************************************************************************************/
	}
	public void fc_func_4025_d(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_4025_DDataSet ds = null;
		FC_FUNC_4025_DDM dm = new FC_FUNC_4025_DDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.pay_note_no = Util.checkString(req.getParameter("pay_note_no"));
		dm.stat_cd = Util.checkString(req.getParameter("stat_cd"));
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.incmg_pers_ipadd = req.getRemoteAddr();

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_4025_DDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_FUNC_4000EJBHome home = (FC_FUNC_4000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_4000EJB");
			FC_FUNC_4000EJB ejb = home.create();

			ds = ejb.fc_func_4025_d(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
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
		dm.pay_note_no = (String)hash.get("pay_note_no");
		dm.stat_cd = (String)hash.get("stat_cd");
		dm.incmg_pers = (String)hash.get("incmg_pers");
		dm.incmg_pers_ipadd = (String)hash.get("incmg_pers_ipadd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.pay_note_no = Util.getSessionParameterValue(req,"pay_note_no",true);
		dm.stat_cd = Util.getSessionParameterValue(req,"stat_cd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"incmg_pers",true);
		dm.incmg_pers_ipadd = Util.getSessionParameterValue(req,"incmg_pers_ipadd",true);
		*******************************************************************************************/
	}
	
	public void fc_func_4026_m(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_4026_MDataSet ds = null;
		FC_FUNC_4026_MDM dm = new FC_FUNC_4026_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_4026_MDataSet)manager.executeCall(dm);

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
	
	public void fc_func_4040_m(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_4040_MDataSet ds = null;
		FC_FUNC_4040_MDM dm = new FC_FUNC_4040_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		
		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_4040_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_FUNC_4000EJBHome home = (FC_FUNC_4000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_4000EJB");
			FC_FUNC_4000EJB ejb = home.create();

			ds = ejb.fc_func_4040_m(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
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
	public void fc_func_4041_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_4041_LDataSet ds = null;
		FC_FUNC_4041_LDM dm = new FC_FUNC_4041_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.stat_cd = Util.checkString(req.getParameter("stat_cd"));
		dm.curacct_clsf_cd = Util.checkString(req.getParameter("curacct_clsf_cd"));
		dm.pch_cymd1fr = Util.checkString(req.getParameter("pch_cymd1fr"));
		dm.pch_cymd1to = Util.checkString(req.getParameter("pch_cymd1to"));
		dm.pch_cymd2fr = Util.checkString(req.getParameter("pch_cymd2fr"));
		dm.pch_cymd2to = Util.checkString(req.getParameter("pch_cymd2to"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_4041_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_FUNC_4000EJBHome home = (FC_FUNC_4000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_4000EJB");
			FC_FUNC_4000EJB ejb = home.create();

			ds = ejb.fc_func_4041_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
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
		dm.stat_cd = (String)hash.get("stat_cd");
		dm.curacct_clsf_cd = (String)hash.get("curacct_clsf_cd");
		dm.pch_cymd1fr = (String)hash.get("pch_cymd1fr");
		dm.pch_cymd1to = (String)hash.get("pch_cymd1to");
		dm.pch_cymd2fr = (String)hash.get("pch_cymd2fr");
		dm.pch_cymd2to = (String)hash.get("pch_cymd2to");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.stat_cd = Util.getSessionParameterValue(req,"stat_cd",true);
		dm.curacct_clsf_cd = Util.getSessionParameterValue(req,"curacct_clsf_cd",true);
		dm.pch_cymd1fr = Util.getSessionParameterValue(req,"pch_cymd1fr",true);
		dm.pch_cymd1to = Util.getSessionParameterValue(req,"pch_cymd1to",true);
		dm.pch_cymd2fr = Util.getSessionParameterValue(req,"pch_cymd2fr",true);
		dm.pch_cymd2to = Util.getSessionParameterValue(req,"pch_cymd2to",true);
		*******************************************************************************************/
	}
	public void fc_func_4042_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_4042_LDataSet ds = null;
		FC_FUNC_4042_LDM dm = new FC_FUNC_4042_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.stat_cd = Util.checkString(req.getParameter("stat_cd"));
		dm.curacct_clsf_cd = Util.checkString(req.getParameter("curacct_clsf_cd"));
		dm.pch_cymd1fr = Util.checkString(req.getParameter("pch_cymd1fr"));
		dm.pch_cymd1to = Util.checkString(req.getParameter("pch_cymd1to"));
		dm.pch_cymd2fr = Util.checkString(req.getParameter("pch_cymd2fr"));
		dm.pch_cymd2to = Util.checkString(req.getParameter("pch_cymd2to"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_4042_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_FUNC_4000EJBHome home = (FC_FUNC_4000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_4000EJB");
			FC_FUNC_4000EJB ejb = home.create();

			ds = ejb.fc_func_4042_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
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
		dm.stat_cd = (String)hash.get("stat_cd");
		dm.curacct_clsf_cd = (String)hash.get("curacct_clsf_cd");
		dm.pch_cymd1fr = (String)hash.get("pch_cymd1fr");
		dm.pch_cymd1to = (String)hash.get("pch_cymd1to");
		dm.pch_cymd2fr = (String)hash.get("pch_cymd2fr");
		dm.pch_cymd2to = (String)hash.get("pch_cymd2to");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.stat_cd = Util.getSessionParameterValue(req,"stat_cd",true);
		dm.curacct_clsf_cd = Util.getSessionParameterValue(req,"curacct_clsf_cd",true);
		dm.pch_cymd1fr = Util.getSessionParameterValue(req,"pch_cymd1fr",true);
		dm.pch_cymd1to = Util.getSessionParameterValue(req,"pch_cymd1to",true);
		dm.pch_cymd2fr = Util.getSessionParameterValue(req,"pch_cymd2fr",true);
		dm.pch_cymd2to = Util.getSessionParameterValue(req,"pch_cymd2to",true);
		*******************************************************************************************/
	}
	public void fc_func_4050_m(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_4050_MDataSet ds = null;
		FC_FUNC_4050_MDM dm = new FC_FUNC_4050_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_4050_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_FUNC_4000EJBHome home = (FC_FUNC_4000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_4000EJB");
			FC_FUNC_4000EJB ejb = home.create();

			ds = ejb.fc_func_4050_m(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
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
	public void fc_func_4051_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_4051_LDataSet ds = null;
		FC_FUNC_4051_LDM dm = new FC_FUNC_4051_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.curacct_clsf_cd = Util.checkString(req.getParameter("curacct_clsf_cd"));
		dm.pch_cymd1fr = Util.checkString(req.getParameter("pch_cymd1fr"));
		dm.pch_cymd1to = Util.checkString(req.getParameter("pch_cymd1to"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_4051_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_FUNC_4000EJBHome home = (FC_FUNC_4000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_4000EJB");
			FC_FUNC_4000EJB ejb = home.create();

			ds = ejb.fc_func_4051_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
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
		dm.curacct_clsf_cd = (String)hash.get("curacct_clsf_cd");
		dm.pch_cymd1fr = (String)hash.get("pch_cymd1fr");
		dm.pch_cymd1to = (String)hash.get("pch_cymd1to");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.curacct_clsf_cd = Util.getSessionParameterValue(req,"curacct_clsf_cd",true);
		dm.pch_cymd1fr = Util.getSessionParameterValue(req,"pch_cymd1fr",true);
		dm.pch_cymd1to = Util.getSessionParameterValue(req,"pch_cymd1to",true);
		*******************************************************************************************/
	}
	public void fc_func_4052_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_4052_LDataSet ds = null;
		FC_FUNC_4052_LDM dm = new FC_FUNC_4052_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.curacct_clsf_cd = Util.checkString(req.getParameter("curacct_clsf_cd"));
		dm.pch_cymd1fr = Util.checkString(req.getParameter("pch_cymd1fr"));
		dm.pch_cymd1to = Util.checkString(req.getParameter("pch_cymd1to"));
		dm.dlco_clsf_cd = Util.checkString(req.getParameter("dlco_clsf_cd"));
		dm.dlco_cd = Util.checkString(req.getParameter("dlco_cd"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_4052_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_FUNC_4000EJBHome home = (FC_FUNC_4000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_4000EJB");
			FC_FUNC_4000EJB ejb = home.create();

			ds = ejb.fc_func_4052_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
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
		dm.curacct_clsf_cd = (String)hash.get("curacct_clsf_cd");
		dm.pch_cymd1fr = (String)hash.get("pch_cymd1fr");
		dm.pch_cymd1to = (String)hash.get("pch_cymd1to");
		dm.dlco_clsf_cd = (String)hash.get("dlco_clsf_cd");
		dm.dlco_cd = (String)hash.get("dlco_cd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.curacct_clsf_cd = Util.getSessionParameterValue(req,"curacct_clsf_cd",true);
		dm.pch_cymd1fr = Util.getSessionParameterValue(req,"pch_cymd1fr",true);
		dm.pch_cymd1to = Util.getSessionParameterValue(req,"pch_cymd1to",true);
		dm.dlco_clsf_cd = Util.getSessionParameterValue(req,"dlco_clsf_cd",true);
		dm.dlco_cd = Util.getSessionParameterValue(req,"dlco_cd",true);
		*******************************************************************************************/
	}
	public void fc_func_4060_m(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_4060_MDataSet ds = null;
		FC_FUNC_4060_MDM dm = new FC_FUNC_4060_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_4060_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_FUNC_4000EJBHome home = (FC_FUNC_4000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_4000EJB");
			FC_FUNC_4000EJB ejb = home.create();

			ds = ejb.fc_func_4060_m(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
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
	public void fc_func_4032_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_4032_LDataSet ds = null;
		FC_FUNC_4032_LDM dm = new FC_FUNC_4032_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.stat_dt = Util.checkString(req.getParameter("stat_dt"));
		dm.curacct_clsf_cd = Util.checkString(req.getParameter("curacct_clsf_cd"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_4032_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_FUNC_4000EJBHome home = (FC_FUNC_4000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_4000EJB");
			FC_FUNC_4000EJB ejb = home.create();

			ds = ejb.fc_func_4032_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
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
		dm.mtry_dt = (String)hash.get("mtry_dt");
		dm.curacct_clsf_cd = (String)hash.get("curacct_clsf_cd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.mtry_dt = Util.getSessionParameterValue(req,"mtry_dt",true);
		dm.curacct_clsf_cd = Util.getSessionParameterValue(req,"curacct_clsf_cd",true);
		*******************************************************************************************/
	}
	public void fc_func_4034_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_4034_LDataSet ds = null;
		FC_FUNC_4034_LDM dm = new FC_FUNC_4034_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.curacct_clsf_cd = Util.checkString(req.getParameter("curacct_clsf_cd"));
		dm.mtry_dt = Util.checkString(req.getParameter("mtry_dt"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_4034_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_FUNC_4000EJBHome home = (FC_FUNC_4000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_4000EJB");
			FC_FUNC_4000EJB ejb = home.create();

			ds = ejb.fc_func_4034_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
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
		dm.curacct_clsf_cd = (String)hash.get("curacct_clsf_cd");
		dm.mtry_dt = (String)hash.get("mtry_dt");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.curacct_clsf_cd = Util.getSessionParameterValue(req,"curacct_clsf_cd",true);
		dm.mtry_dt = Util.getSessionParameterValue(req,"mtry_dt",true);
		*******************************************************************************************/
	}
	public void fc_func_4035_i(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_4035_IDataSet ds = null;
		FC_FUNC_4035_IDM dm = new FC_FUNC_4035_IDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.curacct_clsf_cd = Util.checkString(req.getParameter("curacct_clsf_cd"));
		dm.stat_dt = Util.checkString(req.getParameter("stat_dt"));
		dm.chg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.incmg_pers_ipadd = req.getRemoteAddr();

		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);
		
		dm.mtry_dt = (String)hash.get("mtry_dt");
		dm.pay_note_no = (String)hash.get("pay_note_no");
		dm.note_amt = (String)hash.get("note_amt");
		dm.comp_dt = (String)hash.get("comp_dt");
		dm.dlco_clsf_cd = (String)hash.get("dlco_clsf_cd");
		dm.dlco_cd = (String)hash.get("dlco_cd");
		dm.rmks1 = (String)hash.get("rmks1");
		dm.rmks2 = (String)hash.get("rmks2");
		
		dm.use_dept_cd = Util.getSessionParameterValue(req,"deptcd",true);
		
		
		dm.print();

		
		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_4035_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */		
		
		/* EJB 수정전 시작
		try {
			FC_FUNC_4000EJBHome home = (FC_FUNC_4000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_4000EJB");
			FC_FUNC_4000EJB ejb = home.create();

			ds = ejb.fc_func_4035_i(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
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
		dm.curacct_clsf_cd = (String)hash.get("curacct_clsf_cd");
		dm.stat_dt = (String)hash.get("stat_dt");
		dm.chg_pers = (String)hash.get("chg_pers");
		dm.incmg_pers_ipadd = (String)hash.get("incmg_pers_ipadd");
		dm.mtry_dt = (String)hash.get("mtry_dt");
		dm.pay_note_no = (String)hash.get("pay_note_no");
		dm.note_amt = (String)hash.get("note_amt");
		dm.comp_dt = (String)hash.get("comp_dt");
		dm.dlco_clsf_cd = (String)hash.get("dlco_clsf_cd");
		dm.dlco_cd = (String)hash.get("dlco_cd");
		dm.rmks1 = (String)hash.get("rmks1");
		dm.rmks2 = (String)hash.get("rmks2");
		dm.use_dept_cd = (String)hash.get("use_dept_cd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.curacct_clsf_cd = Util.getSessionParameterValue(req,"curacct_clsf_cd",true);
		dm.stat_dt = Util.getSessionParameterValue(req,"stat_dt",true);
		dm.chg_pers = Util.getSessionParameterValue(req,"chg_pers",true);
		dm.incmg_pers_ipadd = Util.getSessionParameterValue(req,"incmg_pers_ipadd",true);
		dm.mtry_dt = Util.getSessionParameterValue(req,"mtry_dt",true);
		dm.pay_note_no = Util.getSessionParameterValue(req,"pay_note_no",true);
		dm.note_amt = Util.getSessionParameterValue(req,"note_amt",true);
		dm.comp_dt = Util.getSessionParameterValue(req,"comp_dt",true);
		dm.dlco_clsf_cd = Util.getSessionParameterValue(req,"dlco_clsf_cd",true);
		dm.dlco_cd = Util.getSessionParameterValue(req,"dlco_cd",true);
		dm.rmks1 = Util.getSessionParameterValue(req,"rmks1",true);
		dm.rmks2 = Util.getSessionParameterValue(req,"rmks2",true);
		dm.use_dept_cd = Util.getSessionParameterValue(req,"use_dept_cd",true);
		*******************************************************************************************/
	}
	public void fc_func_4036_d(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_4036_DDataSet ds = null;
		FC_FUNC_4036_DDM dm = new FC_FUNC_4036_DDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.stat_dt = Util.checkString(req.getParameter("stat_dt"));
		dm.slip_occr_dt = Util.checkString(req.getParameter("slip_occr_dt"));
		dm.slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
		dm.slip_seq = Util.checkString(req.getParameter("slip_seq"));
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.incmg_pers_ipadd = req.getRemoteAddr();

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_4036_DDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_FUNC_4000EJBHome home = (FC_FUNC_4000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_4000EJB");
			FC_FUNC_4000EJB ejb = home.create();

			ds = ejb.fc_func_4036_d(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
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
		dm.slip_occr_dt = (String)hash.get("slip_occr_dt");
		dm.slip_clsf_cd = (String)hash.get("slip_clsf_cd");
		dm.slip_seq = (String)hash.get("slip_seq");
		dm.incmg_pers = (String)hash.get("incmg_pers");
		dm.incmg_pers_ipadd = (String)hash.get("incmg_pers_ipadd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.stat_dt = Util.getSessionParameterValue(req,"stat_dt",true);
		dm.slip_occr_dt = Util.getSessionParameterValue(req,"slip_occr_dt",true);
		dm.slip_clsf_cd = Util.getSessionParameterValue(req,"slip_clsf_cd",true);
		dm.slip_seq = Util.getSessionParameterValue(req,"slip_seq",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"incmg_pers",true);
		dm.incmg_pers_ipadd = Util.getSessionParameterValue(req,"incmg_pers_ipadd",true);
		*******************************************************************************************/
	}
	public void fc_func_4030_m(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_4030_MDataSet ds = null;
		FC_FUNC_4030_MDM dm = new FC_FUNC_4030_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);

		dm.print();
		
		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_4030_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_FUNC_4000EJBHome home = (FC_FUNC_4000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_4000EJB");
			FC_FUNC_4000EJB ejb = home.create();

			ds = ejb.fc_func_4030_m(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
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
	public void fc_func_4011_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_4011_LDataSet ds = null;
		FC_FUNC_4011_LDM dm = new FC_FUNC_4011_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.pay_note_no = Util.checkString(req.getParameter("pay_note_no"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_4011_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */	
		
		/* EJB 수정전 시작
		try {
			FC_FUNC_4000EJBHome home = (FC_FUNC_4000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_4000EJB");
			FC_FUNC_4000EJB ejb = home.create();

			ds = ejb.fc_func_4011_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
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
		dm.pay_note_no = (String)hash.get("pay_note_no");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.pay_note_no = Util.getSessionParameterValue(req,"pay_note_no",true);
		*******************************************************************************************/
	}
	public void fc_func_4012_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_4012_LDataSet ds = null;
		FC_FUNC_4012_LDM dm = new FC_FUNC_4012_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.pay_note_no = Util.checkString(req.getParameter("pay_note_no"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_4012_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */		
		
		/* EJB 수정전 시작
		try {
			FC_FUNC_4000EJBHome home = (FC_FUNC_4000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_4000EJB");
			FC_FUNC_4000EJB ejb = home.create();

			ds = ejb.fc_func_4012_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
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
		dm.pay_note_no = (String)hash.get("pay_note_no");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.pay_note_no = Util.getSessionParameterValue(req,"pay_note_no",true);
		*******************************************************************************************/
	}
	public void fc_func_4015_e(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_4015_EDataSet ds = null;
		FC_FUNC_4015_EDM dm = new FC_FUNC_4015_EDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.dlco_clsf_cd = Util.checkString(req.getParameter("dlco_clsf_cd"));
		dm.dlco_cd = Util.checkString(req.getParameter("dlco_cd"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_4015_EDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_FUNC_4000EJBHome home = (FC_FUNC_4000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_4000EJB");
			FC_FUNC_4000EJB ejb = home.create();

			ds = ejb.fc_func_4015_e(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
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
		dm.dlco_clsf_cd = (String)hash.get("dlco_clsf_cd");
		dm.dlco_cd = (String)hash.get("dlco_cd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.dlco_clsf_cd = Util.getSessionParameterValue(req,"dlco_clsf_cd",true);
		dm.dlco_cd = Util.getSessionParameterValue(req,"dlco_cd",true);
		*******************************************************************************************/
	}
	public void fc_func_4014_d(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_4014_DDataSet ds = null;
		FC_FUNC_4014_DDM dm = new FC_FUNC_4014_DDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.pay_note_no = Util.checkString(req.getParameter("pay_note_no"));
		dm.chg_pers =Util.getSessionParameterValue(req,"emp_no",true);
		dm.incmg_pers_ipadd = req.getRemoteAddr();

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_4014_DDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */		
		
		/* EJB 수정전 시작
		try {
			FC_FUNC_4000EJBHome home = (FC_FUNC_4000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_4000EJB");
			FC_FUNC_4000EJB ejb = home.create();

			ds = ejb.fc_func_4014_d(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
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
		dm.pay_note_no = (String)hash.get("pay_note_no");
		dm.chg_pers = (String)hash.get("chg_pers");
		dm.incmg_pers_ipadd = (String)hash.get("incmg_pers_ipadd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.pay_note_no = Util.getSessionParameterValue(req,"pay_note_no",true);
		dm.chg_pers = Util.getSessionParameterValue(req,"chg_pers",true);
		dm.incmg_pers_ipadd = Util.getSessionParameterValue(req,"incmg_pers_ipadd",true);
		*******************************************************************************************/
	}
	public void fc_func_4010_m(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_4010_MDataSet ds = null;
		FC_FUNC_4010_MDM dm = new FC_FUNC_4010_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_4010_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */		
		
		/* EJB 수정전 시작
		try {
			FC_FUNC_4000EJBHome home = (FC_FUNC_4000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_4000EJB");
			FC_FUNC_4000EJB ejb = home.create();

			ds = ejb.fc_func_4010_m(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
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
	public void fc_func_4013_i(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_FUNC_4013_IDataSet ds = null;
		FC_FUNC_4013_IDM dm = new FC_FUNC_4013_IDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.pay_note_no = Util.checkString(req.getParameter("pay_note_no"));
		dm.comp_dt = Util.checkString(req.getParameter("comp_dt"));
		dm.mtry_dt = Util.checkString(req.getParameter("mtry_dt"));
		dm.note_amt = Util.checkString(req.getParameter("note_amt"));
		dm.dlco_clsf_cd = Util.checkString(req.getParameter("dlco_clsf_cd"));
		dm.dlco_cd = Util.checkString(req.getParameter("dlco_cd"));
		dm.patr_budg_cd = Util.checkString(req.getParameter("patr_budg_cd"));
		dm.rmks1 = Util.checkString(req.getParameter("rmks1"));
		dm.rmks2 = Util.checkString(req.getParameter("rmks2"));
		dm.setoff_yn = Util.checkString(req.getParameter("setoff_yn"));
		dm.issu_clsf_cd = Util.checkString(req.getParameter("issu_clsf_cd"));
		dm.incm_tax = Util.checkString(req.getParameter("incm_tax"));
		dm.res_tax = Util.checkString(req.getParameter("res_tax"));
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		dm.dlco_nm = Util.checkString(req.getParameter("dlco_nm"));
		dm.use_dept_cd = Util.getSessionParameterValue(req,"deptcd",true);

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_FUNC_4013_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_FUNC_4000EJBHome home = (FC_FUNC_4000EJBHome)JNDIManager.getInstance().getHome("FC_FUNC_4000EJB");
			FC_FUNC_4000EJB ejb = home.create();

			ds = ejb.fc_func_4013_i(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
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
		dm.pay_note_no = (String)hash.get("pay_note_no");
		dm.comp_dt = (String)hash.get("comp_dt");
		dm.mtry_dt = (String)hash.get("mtry_dt");
		dm.note_amt = (String)hash.get("note_amt");
		dm.dlco_clsf_cd = (String)hash.get("dlco_clsf_cd");
		dm.dlco_cd = (String)hash.get("dlco_cd");
		dm.patr_budg_cd = (String)hash.get("patr_budg_cd");
		dm.rmks1 = (String)hash.get("rmks1");
		dm.rmks2 = (String)hash.get("rmks2");
		dm.setoff_yn = (String)hash.get("setoff_yn");
		dm.issu_clsf_cd = (String)hash.get("issu_clsf_cd");
		dm.incm_tax = (String)hash.get("incm_tax");
		dm.res_tax = (String)hash.get("res_tax");
		dm.incmg_pers = (String)hash.get("incmg_pers");
		dm.incmg_pers_ipadd = (String)hash.get("incmg_pers_ipadd");
		dm.dlco_nm = (String)hash.get("dlco_nm");
		dm.use_dept_cd = (String)hash.get("use_dept_cd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.pay_note_no = Util.getSessionParameterValue(req,"pay_note_no",true);
		dm.comp_dt = Util.getSessionParameterValue(req,"comp_dt",true);
		dm.mtry_dt = Util.getSessionParameterValue(req,"mtry_dt",true);
		dm.note_amt = Util.getSessionParameterValue(req,"note_amt",true);
		dm.dlco_clsf_cd = Util.getSessionParameterValue(req,"dlco_clsf_cd",true);
		dm.dlco_cd = Util.getSessionParameterValue(req,"dlco_cd",true);
		dm.patr_budg_cd = Util.getSessionParameterValue(req,"patr_budg_cd",true);
		dm.rmks1 = Util.getSessionParameterValue(req,"rmks1",true);
		dm.rmks2 = Util.getSessionParameterValue(req,"rmks2",true);
		dm.setoff_yn = Util.getSessionParameterValue(req,"setoff_yn",true);
		dm.issu_clsf_cd = Util.getSessionParameterValue(req,"issu_clsf_cd",true);
		dm.incm_tax = Util.getSessionParameterValue(req,"incm_tax",true);
		dm.res_tax = Util.getSessionParameterValue(req,"res_tax",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"incmg_pers",true);
		dm.incmg_pers_ipadd = Util.getSessionParameterValue(req,"incmg_pers_ipadd",true);
		dm.dlco_nm = Util.getSessionParameterValue(req,"dlco_nm",true);
		dm.use_dept_cd = Util.getSessionParameterValue(req,"use_dept_cd",true);
		*******************************************************************************************/
	}
	
	
}

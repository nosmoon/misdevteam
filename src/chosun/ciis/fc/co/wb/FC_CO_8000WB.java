package chosun.ciis.fc.co.wb;

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

import chosun.ciis.fc.co.dm.*;
import chosun.ciis.fc.co.ds.*;

public class FC_CO_8000WB extends chosun.ciis.co.base.wb.BaseWB {
	public void getDummyList(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_CO_9999_LDataSet ds = null;
		FC_CO_9999_LDM dm = new FC_CO_9999_LDM();
		
		dm.cmpy_cd = Util.checkString(req.getParameter("cmpycd"));
		
		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_CO_9999_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_CO_8000EJBHome home = (FC_CO_8000EJBHome)JNDIManager.getInstance().getHome("FC_CO_8000EJB");
			FC_CO_8000EJB ejb = home.create();
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
		FC_CO_9011_LDataSet ds = null;
		FC_CO_9011_LDM dm = new FC_CO_9011_LDM();
		
		dm.cmpy_cd = Util.checkString(req.getParameter("cmpycd"));
		
		dm.print();
		
		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_CO_9011_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_CO_8000EJBHome home = (FC_CO_8000EJBHome)JNDIManager.getInstance().getHome("FC_CO_8000EJB");
			FC_CO_8000EJB ejb = home.create();
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
	public void fc_co_8000_s(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_CO_8000_SDataSet ds = null;
		FC_CO_8000_SDM dm = new FC_CO_8000_SDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.job_clsf = Util.checkString(req.getParameter("job_clsf"));
		dm.cd_clsf = Util.checkString(req.getParameter("cd_clsf"));
		dm.cd = Util.checkString(req.getParameter("cd"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_CO_8000_SDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_CO_8000EJBHome home = (FC_CO_8000EJBHome)JNDIManager.getInstance().getHome("FC_CO_8000EJB");
			FC_CO_8000EJB ejb = home.create();

			ds = ejb.fc_co_8000_s(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
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
		dm.job_clsf = (String)hash.get("job_clsf");
		dm.cd_clsf = (String)hash.get("cd_clsf");
		dm.cd = (String)hash.get("cd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.job_clsf = Util.getSessionParameterValue(req,"job_clsf",true);
		dm.cd_clsf = Util.getSessionParameterValue(req,"cd_clsf",true);
		dm.cd = Util.getSessionParameterValue(req,"cd",true);
		*******************************************************************************************/
	}
	public void fc_co_8001_s(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_CO_8001_SDataSet ds = null;
		FC_CO_8001_SDM dm = new FC_CO_8001_SDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.budg_cd = Util.checkString(req.getParameter("budg_cd"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_CO_8001_SDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_CO_8000EJBHome home = (FC_CO_8000EJBHome)JNDIManager.getInstance().getHome("FC_CO_8000EJB");
			FC_CO_8000EJB ejb = home.create();

			ds = ejb.fc_co_8001_s(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
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
		dm.budg_cd = (String)hash.get("budg_cd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.budg_cd = Util.getSessionParameterValue(req,"budg_cd",true);
		*******************************************************************************************/
	}
	public void fc_co_8002_s(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_CO_8002_SDataSet ds = null;
		FC_CO_8002_SDM dm = new FC_CO_8002_SDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.cd = Util.checkString(req.getParameter("cd"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_CO_8002_SDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_CO_8000EJBHome home = (FC_CO_8000EJBHome)JNDIManager.getInstance().getHome("FC_CO_8000EJB");
			FC_CO_8000EJB ejb = home.create();

			ds = ejb.fc_co_8002_s(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
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
		dm.cd = (String)hash.get("cd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.cd = Util.getSessionParameterValue(req,"cd",true);
		*******************************************************************************************/
	}
	public void fc_co_8003_s(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_CO_8003_SDataSet ds = null;
		FC_CO_8003_SDM dm = new FC_CO_8003_SDM();

		dm.cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
		dm.acct_cd = Util.checkString(req.getParameter("acct_cd"));
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_CO_8003_SDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_CO_8000EJBHome home = (FC_CO_8000EJBHome)JNDIManager.getInstance().getHome("FC_CO_8000EJB");
			FC_CO_8000EJB ejb = home.create();

			ds = ejb.fc_co_8003_s(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
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
		dm.acct_cd = (String)hash.get("acct_cd");
		dm.dept_cd = (String)hash.get("dept_cd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.acct_cd = Util.getSessionParameterValue(req,"acct_cd",true);
		dm.dept_cd = Util.getSessionParameterValue(req,"dept_cd",true);
		*******************************************************************************************/
	}
	public void fc_co_8010_m(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_CO_8010_MDataSet ds = null;
		FC_CO_8010_MDM dm = new FC_CO_8010_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_CO_8010_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_CO_8000EJBHome home = (FC_CO_8000EJBHome)JNDIManager.getInstance().getHome("FC_CO_8000EJB");
			FC_CO_8000EJB ejb = home.create();

			ds = ejb.fc_co_8010_m(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
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
	public void fc_co_8011_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_CO_8011_LDataSet ds = null;
		FC_CO_8011_LDM dm = new FC_CO_8011_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.job_clsf = Util.checkString(req.getParameter("job_clsf"));
		dm.cd_clsf = Util.checkString(req.getParameter("cd_clsf"));
		dm.cd = Util.checkString(req.getParameter("cd"));
		dm.cd_abrv_nm = Util.checkString(req.getParameter("cd_abrv_nm"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_CO_8011_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_CO_8000EJBHome home = (FC_CO_8000EJBHome)JNDIManager.getInstance().getHome("FC_CO_8000EJB");
			FC_CO_8000EJB ejb = home.create();

			ds = ejb.fc_co_8011_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
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
		dm.job_clsf = (String)hash.get("job_clsf");
		dm.cd_clsf = (String)hash.get("cd_clsf");
		dm.cd = (String)hash.get("cd");
		dm.cd_abrv_nm = (String)hash.get("cd_abrv_nm");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.job_clsf = Util.getSessionParameterValue(req,"job_clsf",true);
		dm.cd_clsf = Util.getSessionParameterValue(req,"cd_clsf",true);
		dm.cd = Util.getSessionParameterValue(req,"cd",true);
		dm.cd_abrv_nm = Util.getSessionParameterValue(req,"cd_abrv_nm",true);
		*******************************************************************************************/
	}
	public void fc_co_8020_s(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_CO_8020_SDataSet ds = null;
		FC_CO_8020_SDM dm = new FC_CO_8020_SDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.cd = Util.checkString(req.getParameter("cd"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_CO_8020_SDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_CO_8000EJBHome home = (FC_CO_8000EJBHome)JNDIManager.getInstance().getHome("FC_CO_8000EJB");
			FC_CO_8000EJB ejb = home.create();

			ds = ejb.fc_co_8020_s(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
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
		dm.cd = (String)hash.get("cd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.cd = Util.getSessionParameterValue(req,"cd",true);
		*******************************************************************************************/
	}
	public void fc_co_8030_s(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_CO_8030_SDataSet ds = null;
		FC_CO_8030_SDM dm = new FC_CO_8030_SDM();

		dm.cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
		dm.cd = Util.checkString(req.getParameter("cd"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_CO_8030_SDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_CO_8000EJBHome home = (FC_CO_8000EJBHome)JNDIManager.getInstance().getHome("FC_CO_8000EJB");
			FC_CO_8000EJB ejb = home.create();

			ds = ejb.fc_co_8030_s(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
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
		dm.cd = (String)hash.get("cd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.cd = Util.getSessionParameterValue(req,"cd",true);
		*******************************************************************************************/
	}
	public void fc_co_8040_s(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_CO_8040_SDataSet ds = null;
		FC_CO_8040_SDM dm = new FC_CO_8040_SDM();

		dm.cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
		dm.cd = Util.checkString(req.getParameter("cd"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_CO_8040_SDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_CO_8000EJBHome home = (FC_CO_8000EJBHome)JNDIManager.getInstance().getHome("FC_CO_8000EJB");
			FC_CO_8000EJB ejb = home.create();

			ds = ejb.fc_co_8040_s(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
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
		dm.cd = (String)hash.get("cd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.cd = Util.getSessionParameterValue(req,"cd",true);
		*******************************************************************************************/
	}
	public void fc_co_8050_a(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_CO_8050_ADataSet ds = null;
		FC_CO_8050_ADM dm = new FC_CO_8050_ADM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.slip_occr_dt = Util.checkString(req.getParameter("slip_occr_dt"));
		dm.slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
		dm.slip_seq = Util.checkString(req.getParameter("slip_seq"));
		dm.slip_sub_seq = Util.checkString(req.getParameter("slip_sub_seq"));
		dm.draft_doc_no = Util.checkString(req.getParameter("draft_doc_no"));
		dm.draft_doc_dept_cd = Util.checkString(req.getParameter("draft_doc_dept_cd"));
		dm.draft_expn_amt = Util.checkString(req.getParameter("draft_expn_amt"));
		dm.draft_impt_amt = Util.checkString(req.getParameter("draft_impt_amt"));
		dm.chg_pers = Util.getSessionParameterValue(req,"emp_no",true);

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_CO_8050_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_CO_8000EJBHome home = (FC_CO_8000EJBHome)JNDIManager.getInstance().getHome("FC_CO_8000EJB");
			FC_CO_8000EJB ejb = home.create();

			ds = ejb.fc_co_8050_a(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
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
		dm.draft_doc_no = (String)hash.get("draft_doc_no");
		dm.draft_doc_dept_cd = (String)hash.get("draft_doc_dept_cd");
		dm.draft_expn_amt = (String)hash.get("draft_expn_amt");
		dm.draft_impt_amt = (String)hash.get("draft_impt_amt");
		dm.chg_pers = (String)hash.get("chg_pers");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.slip_occr_dt = Util.getSessionParameterValue(req,"slip_occr_dt",true);
		dm.slip_clsf_cd = Util.getSessionParameterValue(req,"slip_clsf_cd",true);
		dm.slip_seq = Util.getSessionParameterValue(req,"slip_seq",true);
		dm.slip_sub_seq = Util.getSessionParameterValue(req,"slip_sub_seq",true);
		dm.draft_doc_no = Util.getSessionParameterValue(req,"draft_doc_no",true);
		dm.draft_doc_dept_cd = Util.getSessionParameterValue(req,"draft_doc_dept_cd",true);
		dm.draft_expn_amt = Util.getSessionParameterValue(req,"draft_expn_amt",true);
		dm.draft_impt_amt = Util.getSessionParameterValue(req,"draft_impt_amt",true);
		dm.chg_pers = Util.getSessionParameterValue(req,"chg_pers",true);
		*******************************************************************************************/
	}	
	public void fc_co_8060_s(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_CO_8060_SDataSet ds = null;
		FC_CO_8060_SDM dm = new FC_CO_8060_SDM();

		dm.dlco_no = Util.checkString(req.getParameter("dlco_no"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_CO_8060_SDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_CO_8000EJBHome home = (FC_CO_8000EJBHome)JNDIManager.getInstance().getHome("FC_CO_8000EJB");
			FC_CO_8000EJB ejb = home.create();

			ds = ejb.fc_co_8060_s(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
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

		dm.dlco_no = (String)hash.get("dlco_no");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.dlco_no = Util.getSessionParameterValue(req,"dlco_no",true);
		*******************************************************************************************/
	}
	public void fc_co_8070_s(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_CO_8070_SDataSet ds = null;
		FC_CO_8070_SDM dm = new FC_CO_8070_SDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.erplace_cd = Util.checkString(req.getParameter("erplace_cd"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_CO_8070_SDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작		
		try {
			FC_CO_8000EJBHome home = (FC_CO_8000EJBHome)JNDIManager.getInstance().getHome("FC_CO_8000EJB");
			FC_CO_8000EJB ejb = home.create();

			ds = ejb.fc_co_8070_s(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
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
		dm.erplace_cd = (String)hash.get("erplace_cd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.erplace_cd = Util.getSessionParameterValue(req,"erplace_cd",true);
		*******************************************************************************************/
	}
	public void fc_co_8080_s(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_CO_8080_SDataSet ds = null;
		FC_CO_8080_SDM dm = new FC_CO_8080_SDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.job_clsf = Util.checkString(req.getParameter("job_clsf"));
		dm.cd_clsf = Util.checkString(req.getParameter("cd_clsf"));
		dm.cd = Util.checkString(req.getParameter("cd"));
		dm.mang_cd_3 = Util.checkString(req.getParameter("mang_cd_3"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_CO_8080_SDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_CO_8000EJBHome home = (FC_CO_8000EJBHome)JNDIManager.getInstance().getHome("FC_CO_8000EJB");
			FC_CO_8000EJB ejb = home.create();

			ds = ejb.fc_co_8080_s(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
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
		dm.job_clsf = (String)hash.get("job_clsf");
		dm.cd_clsf = (String)hash.get("cd_clsf");
		dm.cd = (String)hash.get("cd");
		dm.mang_cd_3 = (String)hash.get("mang_cd_3");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.job_clsf = Util.getSessionParameterValue(req,"job_clsf",true);
		dm.cd_clsf = Util.getSessionParameterValue(req,"cd_clsf",true);
		dm.cd = Util.getSessionParameterValue(req,"cd",true);
		dm.mang_cd_3 = Util.getSessionParameterValue(req,"mang_cd_3",true);
		*******************************************************************************************/
	}
	public void fc_co_8120_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_CO_8120_LDataSet ds = null;
		FC_CO_8120_LDM dm = new FC_CO_8120_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_CO_8120_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_CO_8000EJBHome home = (FC_CO_8000EJBHome)JNDIManager.getInstance().getHome("FC_CO_8000EJB");
			FC_CO_8000EJB ejb = home.create();

			ds = ejb.fc_co_8120_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
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
}

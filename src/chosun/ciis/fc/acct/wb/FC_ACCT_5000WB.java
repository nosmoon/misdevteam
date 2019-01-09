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

public class FC_ACCT_5000WB extends chosun.ciis.co.base.wb.BaseWB {
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
			FC_ACCT_5000EJBHome home = (FC_ACCT_5000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_5000EJB");
			FC_ACCT_5000EJB ejb = home.create();
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
	public void fc_acct_5001_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_5001_LDataSet ds = null;
		FC_ACCT_5001_LDM dm = new FC_ACCT_5001_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.clos_dt = Util.checkString(req.getParameter("clos_dt"));
		dm.clos_clsf = Util.checkString(req.getParameter("clos_clsf"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_5001_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/* EJB 수정전 시작
		try {
			FC_ACCT_5000EJBHome home = (FC_ACCT_5000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_5000EJB");
			FC_ACCT_5000EJB ejb = home.create();

			ds = ejb.fc_acct_5001_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
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
		dm.clos_dt = (String)hash.get("clos_dt");
		dm.clos_clsf = (String)hash.get("clos_clsf");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.clos_dt = Util.getSessionParameterValue(req,"clos_dt",true);
		dm.clos_clsf = Util.getSessionParameterValue(req,"clos_clsf",true);
		*******************************************************************************************/
	}	
	public void fc_acct_5002_a(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_5002_ADataSet ds = null;
		FC_ACCT_5002_ADM dm = new FC_ACCT_5002_ADM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_dt = Util.checkString(req.getParameter("incmg_dt"));
		dm.clos_clsf = Util.checkString(req.getParameter("clos_clsf"));
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.incmg_pers_ipadd = req.getRemoteAddr();

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_5002_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/* EJB 수정전 시작
		try {
			FC_ACCT_5000EJBHome home = (FC_ACCT_5000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_5000EJB");
			FC_ACCT_5000EJB ejb = home.create();

			ds = ejb.fc_acct_5002_a(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
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
		dm.incmg_dt = (String)hash.get("incmg_dt");
		dm.clos_clsf = (String)hash.get("clos_clsf");
		dm.incmg_pers = (String)hash.get("incmg_pers");
		dm.incmg_pers_ipadd = (String)hash.get("incmg_pers_ipadd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.incmg_dt = Util.getSessionParameterValue(req,"incmg_dt",true);
		dm.clos_clsf = Util.getSessionParameterValue(req,"clos_clsf",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"incmg_pers",true);
		dm.incmg_pers_ipadd = Util.getSessionParameterValue(req,"incmg_pers_ipadd",true);
		*******************************************************************************************/
	}	
	public void fc_acct_5003_s(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_5003_SDataSet ds = null;
		FC_ACCT_5003_SDM dm = new FC_ACCT_5003_SDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_dt = Util.checkString(req.getParameter("incmg_dt1"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_5003_SDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/* EJB 수정전 시작
		try {
			FC_ACCT_5000EJBHome home = (FC_ACCT_5000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_5000EJB");
			FC_ACCT_5000EJB ejb = home.create();

			ds = ejb.fc_acct_5003_s(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
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
		dm.incmg_dt = (String)hash.get("incmg_dt");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.incmg_dt = Util.getSessionParameterValue(req,"incmg_dt",true);
		*******************************************************************************************/
	}
	public void fc_acct_5004_s(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_5004_SDataSet ds = null;
		FC_ACCT_5004_SDM dm = new FC_ACCT_5004_SDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_dt = Util.checkString(req.getParameter("incmg_dt"));
		dm.clos_dt = Util.checkString(req.getParameter("clos_dt"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_5004_SDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/* EJB 수정전 시작
		try {
			FC_ACCT_5000EJBHome home = (FC_ACCT_5000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_5000EJB");
			FC_ACCT_5000EJB ejb = home.create();

			ds = ejb.fc_acct_5004_s(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
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
		dm.incmg_dt = (String)hash.get("incmg_dt");
		dm.clos_dt = (String)hash.get("clos_dt");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.incmg_dt = Util.getSessionParameterValue(req,"incmg_dt",true);
		dm.clos_dt = Util.getSessionParameterValue(req,"clos_dt",true);
		*******************************************************************************************/
	}
	public void fc_acct_5011_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_5011_LDataSet ds = null;
		FC_ACCT_5011_LDM dm = new FC_ACCT_5011_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.acct_cd = Util.checkString(req.getParameter("acct_cd"));
		dm.fisc_dt = Util.checkString(req.getParameter("fisc_dt"));
		dm.incmg_dt = Util.checkString(req.getParameter("incmg_dt"));
		dm.slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_5011_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/* EJB 수정전 시작
		try {
			FC_ACCT_5000EJBHome home = (FC_ACCT_5000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_5000EJB");
			FC_ACCT_5000EJB ejb = home.create();

			ds = ejb.fc_acct_5011_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
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
		dm.fisc_dt = (String)hash.get("fisc_dt");
		dm.incmg_dt = (String)hash.get("incmg_dt");
		dm.slip_clsf_cd = (String)hash.get("slip_clsf_cd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.acct_cd = Util.getSessionParameterValue(req,"acct_cd",true);
		dm.fisc_dt = Util.getSessionParameterValue(req,"fisc_dt",true);
		dm.incmg_dt = Util.getSessionParameterValue(req,"incmg_dt",true);
		dm.slip_clsf_cd = Util.getSessionParameterValue(req,"slip_clsf_cd",true);
		*******************************************************************************************/
	}
	public void fc_acct_5012_p(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_5012_PDataSet ds = null;
		FC_ACCT_5012_PDM dm = new FC_ACCT_5012_PDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_dt = Util.checkString(req.getParameter("incmg_dt"));
		dm.clsf_cd_fr = Util.checkString(req.getParameter("clsf_cd_fr"));
		dm.clsf_cd_to = Util.checkString(req.getParameter("clsf_cd_to"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_5012_PDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/* EJB 수정전 시작
		try {
			FC_ACCT_5000EJBHome home = (FC_ACCT_5000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_5000EJB");
			FC_ACCT_5000EJB ejb = home.create();

			ds = ejb.fc_acct_5012_p(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
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
		dm.incmg_dt = (String)hash.get("incmg_dt");
		dm.clsf_cd_fr = (String)hash.get("clsf_cd_fr");
		dm.clsf_cd_to = (String)hash.get("clsf_cd_to");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.incmg_dt = Util.getSessionParameterValue(req,"incmg_dt",true);
		dm.clsf_cd_fr = Util.getSessionParameterValue(req,"clsf_cd_fr",true);
		dm.clsf_cd_to = Util.getSessionParameterValue(req,"clsf_cd_to",true);
		*******************************************************************************************/
	}
	public void fc_acct_5020_m(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_5020_MDataSet ds = null;
		FC_ACCT_5020_MDM dm = new FC_ACCT_5020_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_5020_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/* EJB 수정전 시작
		try {
			FC_ACCT_5000EJBHome home = (FC_ACCT_5000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_5000EJB");
			FC_ACCT_5000EJB ejb = home.create();

			ds = ejb.fc_acct_5020_m(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
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
	public void fc_acct_5022_s(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_5022_SDataSet ds = null;
		FC_ACCT_5022_SDM dm = new FC_ACCT_5022_SDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_dt = Util.checkString(req.getParameter("incmg_dt"));
		dm.slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_5022_SDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/* EJB 수정전 시작
		try {
			FC_ACCT_5000EJBHome home = (FC_ACCT_5000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_5000EJB");
			FC_ACCT_5000EJB ejb = home.create();

			ds = ejb.fc_acct_5022_s(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
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
		dm.incmg_dt = (String)hash.get("incmg_dt");
		dm.slip_clsf_cd = (String)hash.get("slip_clsf_cd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.incmg_dt = Util.getSessionParameterValue(req,"incmg_dt",true);
		dm.slip_clsf_cd = Util.getSessionParameterValue(req,"slip_clsf_cd",true);
		*******************************************************************************************/
	}
	public void fc_acct_5030_m(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_5030_MDataSet ds = null;
		FC_ACCT_5030_MDM dm = new FC_ACCT_5030_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_5030_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/* EJB 수정전 시작
		try {
			FC_ACCT_5000EJBHome home = (FC_ACCT_5000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_5000EJB");
			FC_ACCT_5000EJB ejb = home.create();

			ds = ejb.fc_acct_5032_s(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
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
		dm.slip_clsf_cd2 = (String)hash.get("slip_clsf_cd2");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.slip_occr_dt = Util.getSessionParameterValue(req,"slip_occr_dt",true);
		dm.slip_clsf_cd = Util.getSessionParameterValue(req,"slip_clsf_cd",true);
		dm.slip_clsf_cd2 = Util.getSessionParameterValue(req,"slip_clsf_cd2",true);
		*******************************************************************************************/
	}
	public void fc_acct_5032_s(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_5032_SDataSet ds = null;
		FC_ACCT_5032_SDM dm = new FC_ACCT_5032_SDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.slip_occr_dt = Util.checkString(req.getParameter("slip_occr_dt"));
		dm.slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd1"));
		dm.slip_clsf_cd2 = Util.checkString(req.getParameter("slip_clsf_cd2"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_5032_SDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/* EJB 수정전 시작
		try {
			FC_ACCT_5000EJBHome home = (FC_ACCT_5000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_5000EJB");
			FC_ACCT_5000EJB ejb = home.create();

			ds = ejb.fc_acct_5032_s(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
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
		dm.slip_clsf_cd2 = (String)hash.get("slip_clsf_cd2");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.slip_occr_dt = Util.getSessionParameterValue(req,"slip_occr_dt",true);
		dm.slip_clsf_cd = Util.getSessionParameterValue(req,"slip_clsf_cd",true);
		dm.slip_clsf_cd2 = Util.getSessionParameterValue(req,"slip_clsf_cd2",true);
		*******************************************************************************************/
	}
	public void fc_acct_5040_s(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_5040_SDataSet ds = null;
		FC_ACCT_5040_SDM dm = new FC_ACCT_5040_SDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_dt = Util.checkString(req.getParameter("incmg_dt"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_5040_SDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/* EJB 수정전 시작
		try {
			FC_ACCT_5000EJBHome home = (FC_ACCT_5000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_5000EJB");
			FC_ACCT_5000EJB ejb = home.create();

			ds = ejb.fc_acct_5040_s(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
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
		dm.incmg_dt = (String)hash.get("incmg_dt");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.incmg_dt = Util.getSessionParameterValue(req,"incmg_dt",true);
		*******************************************************************************************/
	}
	public void fc_acct_5111_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_5111_LDataSet ds = null;
		FC_ACCT_5111_LDM dm = new FC_ACCT_5111_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.clos_dt = Util.checkString(req.getParameter("clos_dt"));
		dm.clos_clsf1 = Util.checkString(req.getParameter("clos_clsf1"));
		dm.clos_clsf2 = Util.checkString(req.getParameter("clos_clsf2"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_5111_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/* EJB 수정전 시작
		try {
			FC_ACCT_5000EJBHome home = (FC_ACCT_5000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_5000EJB");
			FC_ACCT_5000EJB ejb = home.create();

			ds = ejb.fc_acct_5111_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
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
		dm.clos_dt = (String)hash.get("clos_dt");
		dm.clos_clsf1 = (String)hash.get("clos_clsf1");
		dm.clos_clsf2 = (String)hash.get("clos_clsf2");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.clos_dt = Util.getSessionParameterValue(req,"clos_dt",true);
		dm.clos_clsf1 = Util.getSessionParameterValue(req,"clos_clsf1",true);
		dm.clos_clsf2 = Util.getSessionParameterValue(req,"clos_clsf2",true);
		*******************************************************************************************/
	}

	public void fc_acct_5112_a(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_5112_ADataSet ds = null;
		FC_ACCT_5112_ADM dm = new FC_ACCT_5112_ADM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.fisc_dt = Util.checkString(req.getParameter("fisc_dt"));
		dm.clos_clsf = Util.checkString(req.getParameter("clos_clsf"));
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.incmg_pers_ipadd = req.getRemoteAddr();

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_5112_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/* EJB 수정전 시작
		try {
			FC_ACCT_5000EJBHome home = (FC_ACCT_5000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_5000EJB");
			FC_ACCT_5000EJB ejb = home.create();

			ds = ejb.fc_acct_5112_a(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
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
		dm.fisc_dt = (String)hash.get("fisc_dt");
		dm.clos_clsf = (String)hash.get("clos_clsf");
		dm.incmg_pers = (String)hash.get("incmg_pers");
		dm.incmg_pers_ipadd = (String)hash.get("incmg_pers_ipadd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.fisc_dt = Util.getSessionParameterValue(req,"fisc_dt",true);
		dm.clos_clsf = Util.getSessionParameterValue(req,"clos_clsf",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"incmg_pers",true);
		dm.incmg_pers_ipadd = Util.getSessionParameterValue(req,"incmg_pers_ipadd",true);
		*******************************************************************************************/
	}	
	public void fc_acct_5300_m(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_5300_MDataSet ds = null;
		FC_ACCT_5300_MDM dm = new FC_ACCT_5300_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_5300_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/* EJB 수정전 시작
		try {
			FC_ACCT_5000EJBHome home = (FC_ACCT_5000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_5000EJB");
			FC_ACCT_5000EJB ejb = home.create();

			ds = ejb.fc_acct_5300_m(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
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
	public void fc_acct_5301_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_5301_LDataSet ds = null;
		FC_ACCT_5301_LDM dm = new FC_ACCT_5301_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.clos_mm = Util.checkString(req.getParameter("clos_mm"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_5301_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/* EJB 수정전 시작
		try {
			FC_ACCT_5000EJBHome home = (FC_ACCT_5000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_5000EJB");
			FC_ACCT_5000EJB ejb = home.create();

			ds = ejb.fc_acct_5301_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
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
		dm.clos_mm = (String)hash.get("clos_mm");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.clos_mm = Util.getSessionParameterValue(req,"clos_mm",true);
		*******************************************************************************************/
	}
	public void fc_acct_5303_a(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_5303_ADataSet ds = null;
		FC_ACCT_5303_ADM dm = new FC_ACCT_5303_ADM();
		
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);
		
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.mode = (String)hash.get("m");
		dm.slip_clsf_cd = (String)hash.get("slip_clsf_cd");
		dm.slip_dtls_clas = (String)hash.get("slip_dtls_clas");
		dm.clos_mm = (String)hash.get("clos_mm");
		dm.bgn_dt = (String)hash.get("bgn_dt");
		dm.end_dt = (String)hash.get("end_dt");
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.incmg_pers_ipadd = req.getRemoteAddr();

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_5303_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/* EJB 수정전 시작
		try {
			FC_ACCT_5000EJBHome home = (FC_ACCT_5000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_5000EJB");
			FC_ACCT_5000EJB ejb = home.create();

			ds = ejb.fc_acct_5303_a(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
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
		dm.slip_clsf_cd = (String)hash.get("slip_clsf_cd");
		dm.slip_dtls_clas = (String)hash.get("slip_dtls_clas");
		dm.clos_mm = (String)hash.get("clos_mm");
		dm.bgn_dt = (String)hash.get("bgn_dt");
		dm.end_dt = (String)hash.get("end_dt");
		dm.incmg_pers = (String)hash.get("incmg_pers");
		dm.incmg_pers_ipadd = (String)hash.get("incmg_pers_ipadd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.mode = Util.getSessionParameterValue(req,"mode",true);
		dm.slip_clsf_cd = Util.getSessionParameterValue(req,"slip_clsf_cd",true);
		dm.slip_dtls_clas = Util.getSessionParameterValue(req,"slip_dtls_clas",true);
		dm.clos_mm = Util.getSessionParameterValue(req,"clos_mm",true);
		dm.bgn_dt = Util.getSessionParameterValue(req,"bgn_dt",true);
		dm.end_dt = Util.getSessionParameterValue(req,"end_dt",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"incmg_pers",true);
		dm.incmg_pers_ipadd = Util.getSessionParameterValue(req,"incmg_pers_ipadd",true);
		*******************************************************************************************/
	}
	public void fc_acct_5310_m(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_5310_MDataSet ds = null;
		FC_ACCT_5310_MDM dm = new FC_ACCT_5310_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_5310_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/* EJB 수정전 시작
		try {
			FC_ACCT_5000EJBHome home = (FC_ACCT_5000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_5000EJB");
			FC_ACCT_5000EJB ejb = home.create();

			ds = ejb.fc_acct_5310_m(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
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
	public void fc_acct_5311_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_5311_LDataSet ds = null;
		FC_ACCT_5311_LDM dm = new FC_ACCT_5311_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.fr_fisc_dt = Util.checkString(req.getParameter("fr_fisc_dt"));
		dm.to_fisc_dt = Util.checkString(req.getParameter("to_fisc_dt"));
		dm.fr_medi_cd = Util.checkString(req.getParameter("fr_medi_cd"));
		dm.to_medi_cd = Util.checkString(req.getParameter("to_medi_cd"));
		dm.fisc_mm = Util.checkString(req.getParameter("fisc_mm"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_5311_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/* EJB 수정전 시작
		try {
			FC_ACCT_5000EJBHome home = (FC_ACCT_5000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_5000EJB");
			FC_ACCT_5000EJB ejb = home.create();

			ds = ejb.fc_acct_5311_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
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
		dm.fr_medi_cd = (String)hash.get("fr_medi_cd");
		dm.to_medi_cd = (String)hash.get("to_medi_cd");
		dm.fisc_mm = (String)hash.get("fisc_mm");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.fr_fisc_dt = Util.getSessionParameterValue(req,"fr_fisc_dt",true);
		dm.to_fisc_dt = Util.getSessionParameterValue(req,"to_fisc_dt",true);
		dm.fr_medi_cd = Util.getSessionParameterValue(req,"fr_medi_cd",true);
		dm.to_medi_cd = Util.getSessionParameterValue(req,"to_medi_cd",true);
		dm.fisc_mm = Util.getSessionParameterValue(req,"fisc_mm",true);
		*******************************************************************************************/
	}
	public void fc_acct_5312_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_5312_LDataSet ds = null;
		FC_ACCT_5312_LDM dm = new FC_ACCT_5312_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.slip_occr_dt = Util.checkString(req.getParameter("slip_occr_dt"));
		dm.slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
		dm.slip_seq = Util.checkString(req.getParameter("slip_seq"));
		dm.slip_sub_seq = Util.checkString(req.getParameter("slip_sub_seq"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_5312_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/* EJB 수정전 시작
		try {
			FC_ACCT_5000EJBHome home = (FC_ACCT_5000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_5000EJB");
			FC_ACCT_5000EJB ejb = home.create();

			ds = ejb.fc_acct_5312_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
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
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.slip_occr_dt = Util.getSessionParameterValue(req,"slip_occr_dt",true);
		dm.slip_clsf_cd = Util.getSessionParameterValue(req,"slip_clsf_cd",true);
		dm.slip_seq = Util.getSessionParameterValue(req,"slip_seq",true);
		dm.slip_sub_seq = Util.getSessionParameterValue(req,"slip_sub_seq",true);
		*******************************************************************************************/
	}
	public void fc_acct_5313_d(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_5313_DDataSet ds = null;
		FC_ACCT_5313_DDM dm = new FC_ACCT_5313_DDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.slip_occr_dt = Util.checkString(req.getParameter("slip_occr_dt"));
		dm.slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
		dm.slip_seq = Util.checkString(req.getParameter("slip_seq"));
		dm.chg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		dm.aprv_yn = Util.checkString(req.getParameter("aprv_yn"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_5313_DDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/* EJB 수정전 시작
		try {
			FC_ACCT_5000EJBHome home = (FC_ACCT_5000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_5000EJB");
			FC_ACCT_5000EJB ejb = home.create();

			ds = ejb.fc_acct_5313_d(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
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
		dm.chg_pers = (String)hash.get("chg_pers");
		dm.incmg_pers_ipadd = (String)hash.get("incmg_pers_ipadd");
		dm.aprv_yn = (String)hash.get("aprv_yn");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.slip_occr_dt = Util.getSessionParameterValue(req,"slip_occr_dt",true);
		dm.slip_clsf_cd = Util.getSessionParameterValue(req,"slip_clsf_cd",true);
		dm.slip_seq = Util.getSessionParameterValue(req,"slip_seq",true);
		dm.chg_pers = Util.getSessionParameterValue(req,"chg_pers",true);
		dm.incmg_pers_ipadd = Util.getSessionParameterValue(req,"incmg_pers_ipadd",true);
		dm.aprv_yn = Util.getSessionParameterValue(req,"aprv_yn",true);
		*******************************************************************************************/
	}	
	public void fc_acct_5314_i(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_5314_IDataSet ds = null;
		FC_ACCT_5314_IDM dm = new FC_ACCT_5314_IDM();

		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);
		
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.slip_occr_dt = (String)hash.get("slip_occr_dt");
		dm.slip_clsf_cd = (String)hash.get("slip_clsf_cd");
		dm.slip_seq = (String)hash.get("slip_seq");
		dm.slip_subseq = (String)hash.get("slip_sub_seq");
		dm.slip_arow_no = (String)hash.get("slip_arow_no");
		dm.acct_cd = (String)hash.get("acct_cd");
		dm.budg_cd = (String)hash.get("budg_cd");
		dm.dr_amt = (String)hash.get("dr_amt");
		dm.medi_cd = (String)hash.get("medi_cd");
		dm.dtls_medi_cd = (String)hash.get("dtls_medi_cd");
		dm.dlco_clsf_cd = (String)hash.get("dlco_clsf_cd");
		dm.dlco_cd = (String)hash.get("dlco_cd");
		dm.dlco_nm = (String)hash.get("dlco_nm");
		dm.clam_dept_cd = (String)hash.get("clam_dept_cd");
		dm.use_dept_cd = (String)hash.get("use_dept_cd");
		dm.rmks1 = (String)hash.get("rmks1");
		dm.rmks2 = (String)hash.get("rmks2");
		dm.boks_dlco_nm = (String)hash.get("boks_dlco_nm");
		dm.fisc_dt = Util.checkString(req.getParameter("fisc_dt"));
		dm.incmg_emp_no = Util.checkString(req.getParameter("incmg_emp_no"));
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		dm.in_sicsgb = Util.checkString(req.getParameter("in_sicsgb"));
		dm.pch_cymd1fr = Util.checkString(req.getParameter("pch_cymd1fr"));
		dm.pch_cymd1to = Util.checkString(req.getParameter("pch_cymd1to"));
		dm.incmg_dt = Util.checkString(req.getParameter("incmg_dt"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_5314_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/* EJB 수정전 시작
		try {
			FC_ACCT_5000EJBHome home = (FC_ACCT_5000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_5000EJB");
			FC_ACCT_5000EJB ejb = home.create();

			ds = ejb.fc_acct_5314_i(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
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
		dm.slip_subseq = (String)hash.get("slip_subseq");
		dm.slip_arow_no = (String)hash.get("slip_arow_no");
		dm.acct_cd = (String)hash.get("acct_cd");
		dm.budg_cd = (String)hash.get("budg_cd");
		dm.dr_amt = (String)hash.get("dr_amt");
		dm.medi_cd = (String)hash.get("medi_cd");
		dm.dtls_medi_cd = (String)hash.get("dtls_medi_cd");
		dm.dlco_clsf_cd = (String)hash.get("dlco_clsf_cd");
		dm.dlco_cd = (String)hash.get("dlco_cd");
		dm.dlco_nm = (String)hash.get("dlco_nm");
		dm.clam_dept_cd = (String)hash.get("clam_dept_cd");
		dm.use_dept_cd = (String)hash.get("use_dept_cd");
		dm.rmks1 = (String)hash.get("rmks1");
		dm.rmks2 = (String)hash.get("rmks2");
		dm.boks_dlco_nm = (String)hash.get("boks_dlco_nm");
		dm.fisc_dt = (String)hash.get("fisc_dt");
		dm.incmg_emp_no = (String)hash.get("incmg_emp_no");
		dm.incmg_pers = (String)hash.get("incmg_pers");
		dm.incmg_pers_ipadd = (String)hash.get("incmg_pers_ipadd");
		dm.in_sicsgb = (String)hash.get("in_sicsgb");
		dm.pch_cymd1fr = (String)hash.get("pch_cymd1fr");
		dm.pch_cymd1to = (String)hash.get("pch_cymd1to");
		dm.incmg_dt = (String)hash.get("incmg_dt");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.slip_occr_dt = Util.getSessionParameterValue(req,"slip_occr_dt",true);
		dm.slip_clsf_cd = Util.getSessionParameterValue(req,"slip_clsf_cd",true);
		dm.slip_seq = Util.getSessionParameterValue(req,"slip_seq",true);
		dm.slip_subseq = Util.getSessionParameterValue(req,"slip_subseq",true);
		dm.slip_arow_no = Util.getSessionParameterValue(req,"slip_arow_no",true);
		dm.acct_cd = Util.getSessionParameterValue(req,"acct_cd",true);
		dm.budg_cd = Util.getSessionParameterValue(req,"budg_cd",true);
		dm.dr_amt = Util.getSessionParameterValue(req,"dr_amt",true);
		dm.medi_cd = Util.getSessionParameterValue(req,"medi_cd",true);
		dm.dtls_medi_cd = Util.getSessionParameterValue(req,"dtls_medi_cd",true);
		dm.dlco_clsf_cd = Util.getSessionParameterValue(req,"dlco_clsf_cd",true);
		dm.dlco_cd = Util.getSessionParameterValue(req,"dlco_cd",true);
		dm.dlco_nm = Util.getSessionParameterValue(req,"dlco_nm",true);
		dm.clam_dept_cd = Util.getSessionParameterValue(req,"clam_dept_cd",true);
		dm.use_dept_cd = Util.getSessionParameterValue(req,"use_dept_cd",true);
		dm.rmks1 = Util.getSessionParameterValue(req,"rmks1",true);
		dm.rmks2 = Util.getSessionParameterValue(req,"rmks2",true);
		dm.boks_dlco_nm = Util.getSessionParameterValue(req,"boks_dlco_nm",true);
		dm.fisc_dt = Util.getSessionParameterValue(req,"fisc_dt",true);
		dm.incmg_emp_no = Util.getSessionParameterValue(req,"incmg_emp_no",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"incmg_pers",true);
		dm.incmg_pers_ipadd = Util.getSessionParameterValue(req,"incmg_pers_ipadd",true);
		dm.in_sicsgb = Util.getSessionParameterValue(req,"in_sicsgb",true);
		dm.pch_cymd1fr = Util.getSessionParameterValue(req,"pch_cymd1fr",true);
		dm.pch_cymd1to = Util.getSessionParameterValue(req,"pch_cymd1to",true);
		dm.incmg_dt = Util.getSessionParameterValue(req,"incmg_dt",true);
		*******************************************************************************************/
	}
	public void fc_acct_5320_m(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_5320_MDataSet ds = null;
		FC_ACCT_5320_MDM dm = new FC_ACCT_5320_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		
		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_5320_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/* EJB 수정전 시작
		try {
			FC_ACCT_5000EJBHome home = (FC_ACCT_5000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_5000EJB");
			FC_ACCT_5000EJB ejb = home.create();

			ds = ejb.fc_acct_5322_s(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
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
		dm.fisc_yymm = (String)hash.get("fisc_yymm");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.fisc_yymm = Util.getSessionParameterValue(req,"fisc_yymm",true);
		*******************************************************************************************/
	}	
	public void fc_acct_5322_s(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_5322_SDataSet ds = null;
		FC_ACCT_5322_SDM dm = new FC_ACCT_5322_SDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.fisc_yymm = Util.checkString(req.getParameter("fisc_yymm"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_5322_SDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/* EJB 수정전 시작
		try {
			FC_ACCT_5000EJBHome home = (FC_ACCT_5000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_5000EJB");
			FC_ACCT_5000EJB ejb = home.create();

			ds = ejb.fc_acct_5322_s(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
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
		dm.fisc_yymm = (String)hash.get("fisc_yymm");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.fisc_yymm = Util.getSessionParameterValue(req,"fisc_yymm",true);
		*******************************************************************************************/
	}	
	public void fc_acct_5331_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_5331_LDataSet ds = null;
		FC_ACCT_5331_LDM dm = new FC_ACCT_5331_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.acct_cd = Util.checkString(req.getParameter("acct_cd"));
		dm.fisc_mm = Util.checkString(req.getParameter("fisc_mm"));
		dm.slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_5331_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/* EJB 수정전 시작
		try {
			FC_ACCT_5000EJBHome home = (FC_ACCT_5000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_5000EJB");
			FC_ACCT_5000EJB ejb = home.create();

			ds = ejb.fc_acct_5331_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
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
		dm.fisc_mm = (String)hash.get("fisc_mm");
		dm.slip_clsf_cd = (String)hash.get("slip_clsf_cd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.acct_cd = Util.getSessionParameterValue(req,"acct_cd",true);
		dm.fisc_mm = Util.getSessionParameterValue(req,"fisc_mm",true);
		dm.slip_clsf_cd = Util.getSessionParameterValue(req,"slip_clsf_cd",true);
		*******************************************************************************************/
	}
	public void fc_acct_5332_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_5332_LDataSet ds = null;
		FC_ACCT_5332_LDM dm = new FC_ACCT_5332_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.fisc_mm = Util.checkString(req.getParameter("fisc_mm"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_5332_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/* EJB 수정전 시작
		try {
			FC_ACCT_5000EJBHome home = (FC_ACCT_5000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_5000EJB");
			FC_ACCT_5000EJB ejb = home.create();

			ds = ejb.fc_acct_5332_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
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
		dm.fisc_mm = (String)hash.get("fisc_mm");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.fisc_mm = Util.getSessionParameterValue(req,"fisc_mm",true);
		*******************************************************************************************/
	}
	public void fc_acct_5343_s(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_5343_SDataSet ds = null;
		FC_ACCT_5343_SDM dm = new FC_ACCT_5343_SDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.fisc_fr = Util.checkString(req.getParameter("fisc_fr"));
		dm.fisc_to = Util.checkString(req.getParameter("fisc_to"));
		dm.kind = Util.checkString(req.getParameter("kind"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_5343_SDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/* EJB 수정전 시작
		try {
			FC_ACCT_5000EJBHome home = (FC_ACCT_5000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_5000EJB");
			FC_ACCT_5000EJB ejb = home.create();

			ds = ejb.fc_acct_5343_s(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
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
		dm.fisc_fr = (String)hash.get("fisc_fr");
		dm.fisc_to = (String)hash.get("fisc_to");
		dm.kind = (String)hash.get("kind");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.fisc_fr = Util.getSessionParameterValue(req,"fisc_fr",true);
		dm.fisc_to = Util.getSessionParameterValue(req,"fisc_to",true);
		dm.kind = Util.getSessionParameterValue(req,"kind",true);
		*******************************************************************************************/
	}
	public void fc_acct_5352_s(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_5352_SDataSet ds = null;
		FC_ACCT_5352_SDM dm = new FC_ACCT_5352_SDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.fisc_fr = Util.checkString(req.getParameter("fisc_fr"));
		dm.fisc_to = Util.checkString(req.getParameter("fisc_to"));
		dm.insd_acct_fr = Util.checkString(req.getParameter("insd_acct_fr"));
		dm.insd_acct_to = Util.checkString(req.getParameter("insd_acct_to"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_5352_SDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/* EJB 수정전 시작
		try {
			FC_ACCT_5000EJBHome home = (FC_ACCT_5000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_5000EJB");
			FC_ACCT_5000EJB ejb = home.create();

			ds = ejb.fc_acct_5352_s(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
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
		dm.fisc_fr = (String)hash.get("fisc_fr");
		dm.fisc_to = (String)hash.get("fisc_to");
		dm.insd_acct_fr = (String)hash.get("insd_acct_fr");
		dm.insd_acct_to = (String)hash.get("insd_acct_to");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.fisc_fr = Util.getSessionParameterValue(req,"fisc_fr",true);
		dm.fisc_to = Util.getSessionParameterValue(req,"fisc_to",true);
		dm.insd_acct_fr = Util.getSessionParameterValue(req,"insd_acct_fr",true);
		dm.insd_acct_to = Util.getSessionParameterValue(req,"insd_acct_to",true);
		*******************************************************************************************/
	}
	public void fc_acct_5360_m(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_5360_MDataSet ds = null;
		FC_ACCT_5360_MDM dm = new FC_ACCT_5360_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		
		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_5360_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/* EJB 수정전 시작
		try {
			FC_ACCT_5000EJBHome home = (FC_ACCT_5000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_5000EJB");
			FC_ACCT_5000EJB ejb = home.create();

			ds = ejb.fc_acct_5360_m(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
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
	
	public void fc_acct_5361_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_5361_LDataSet ds = null;
		FC_ACCT_5361_LDM dm = new FC_ACCT_5361_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.fisc_fr = Util.checkString(req.getParameter("fisc_fr"));
		dm.fisc_to = Util.checkString(req.getParameter("fisc_to"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_5361_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/* EJB 수정전 시작
		try {
			FC_ACCT_5000EJBHome home = (FC_ACCT_5000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_5000EJB");
			FC_ACCT_5000EJB ejb = home.create();

			ds = ejb.fc_acct_5361_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
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
		dm.fisc_fr = (String)hash.get("fisc_fr");
		dm.fisc_to = (String)hash.get("fisc_to");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.fisc_fr = Util.getSessionParameterValue(req,"fisc_fr",true);
		dm.fisc_to = Util.getSessionParameterValue(req,"fisc_to",true);
		*******************************************************************************************/
	}	

	public void fc_acct_5362_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_5362_LDataSet ds = null;
		FC_ACCT_5362_LDM dm = new FC_ACCT_5362_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.slip_occr_dt = Util.checkString(req.getParameter("slip_occr_dt"));
		dm.slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
		dm.slip_seq = Util.checkString(req.getParameter("slip_seq"));
		dm.slip_sub_seq = Util.checkString(req.getParameter("slip_sub_seq"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_5362_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/* EJB 수정전 시작
		try {
			FC_ACCT_5000EJBHome home = (FC_ACCT_5000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_5000EJB");
			FC_ACCT_5000EJB ejb = home.create();

			ds = ejb.fc_acct_5362_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
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
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.slip_occr_dt = Util.getSessionParameterValue(req,"slip_occr_dt",true);
		dm.slip_clsf_cd = Util.getSessionParameterValue(req,"slip_clsf_cd",true);
		dm.slip_seq = Util.getSessionParameterValue(req,"slip_seq",true);
		dm.slip_sub_seq = Util.getSessionParameterValue(req,"slip_sub_seq",true);
		*******************************************************************************************/
	}	
	public void fc_acct_5363_d(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_5363_DDataSet ds = null;
		FC_ACCT_5363_DDM dm = new FC_ACCT_5363_DDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.slip_occr_dt = Util.checkString(req.getParameter("slip_occr_dt"));
		dm.slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
		dm.slip_seq = Util.checkString(req.getParameter("slip_seq"));
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		dm.sicsgb = Util.checkString(req.getParameter("sicsgb"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_5363_DDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/* EJB 수정전 시작
		try {
			FC_ACCT_5000EJBHome home = (FC_ACCT_5000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_5000EJB");
			FC_ACCT_5000EJB ejb = home.create();

			ds = ejb.fc_acct_5363_d(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
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
		dm.incmg_pers = (String)hash.get("incmg_pers");
		dm.incmg_pers_ipadd = (String)hash.get("incmg_pers_ipadd");
		dm.sicsgb = (String)hash.get("sicsgb");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.slip_occr_dt = Util.getSessionParameterValue(req,"slip_occr_dt",true);
		dm.slip_clsf_cd = Util.getSessionParameterValue(req,"slip_clsf_cd",true);
		dm.slip_seq = Util.getSessionParameterValue(req,"slip_seq",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"incmg_pers",true);
		dm.incmg_pers_ipadd = Util.getSessionParameterValue(req,"incmg_pers_ipadd",true);
		dm.sicsgb = Util.getSessionParameterValue(req,"sicsgb",true);
		*******************************************************************************************/
	}
	public void fc_acct_5364_i(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_5364_IDataSet ds = null;
		FC_ACCT_5364_IDM dm = new FC_ACCT_5364_IDM();

		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);
		
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.acct_cd = (String)hash.get("acct_cd");
		dm.budg_cd = (String)hash.get("budg_cd");
		dm.dr_amt = (String)hash.get("dr_amt");
		dm.medi_cd = (String)hash.get("medi_cd");
		dm.dtls_medi_cd = (String)hash.get("dtls_medi_cd");
		dm.clam_dept_cd = (String)hash.get("clam_dept_cd");
		dm.use_dept_cd = (String)hash.get("use_dept_cd");
		dm.pch_dept_nm = (String)hash.get("usebuseonm");
		dm.rmks1 = (String)hash.get("rmks1");
		dm.rmks2 = (String)hash.get("rmks2");				
		dm.fisc_dt = Util.checkString(req.getParameter("fisc_dt"));
		dm.occr_dt = Util.checkString(req.getParameter("occr_dt"));
		dm.incmg_emp_no = Util.checkString(req.getParameter("incmg_emp_no"));
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		dm.in_sicsgb = "S";
		dm.qunt = (String)hash.get("qunt");

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_5364_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/* EJB 수정전 시작
		try {
			FC_ACCT_5000EJBHome home = (FC_ACCT_5000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_5000EJB");
			FC_ACCT_5000EJB ejb = home.create();

			ds = ejb.fc_acct_5364_i(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
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
		dm.budg_cd = (String)hash.get("budg_cd");
		dm.dr_amt = (String)hash.get("dr_amt");
		dm.medi_cd = (String)hash.get("medi_cd");
		dm.dtls_medi_cd = (String)hash.get("dtls_medi_cd");
		dm.clam_dept_cd = (String)hash.get("clam_dept_cd");
		dm.use_dept_cd = (String)hash.get("use_dept_cd");
		dm.pch_dept_nm = (String)hash.get("pch_dept_nm");
		dm.rmks1 = (String)hash.get("rmks1");
		dm.rmks2 = (String)hash.get("rmks2");
		dm.fisc_dt = (String)hash.get("fisc_dt");
		dm.incmg_emp_no = (String)hash.get("incmg_emp_no");
		dm.incmg_pers = (String)hash.get("incmg_pers");
		dm.incmg_pers_ipadd = (String)hash.get("incmg_pers_ipadd");
		dm.in_sicsgb = (String)hash.get("in_sicsgb");
		dm.qunt = (String)hash.get("qunt");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.acct_cd = Util.getSessionParameterValue(req,"acct_cd",true);
		dm.budg_cd = Util.getSessionParameterValue(req,"budg_cd",true);
		dm.dr_amt = Util.getSessionParameterValue(req,"dr_amt",true);
		dm.medi_cd = Util.getSessionParameterValue(req,"medi_cd",true);
		dm.dtls_medi_cd = Util.getSessionParameterValue(req,"dtls_medi_cd",true);
		dm.clam_dept_cd = Util.getSessionParameterValue(req,"clam_dept_cd",true);
		dm.use_dept_cd = Util.getSessionParameterValue(req,"use_dept_cd",true);
		dm.pch_dept_nm = Util.getSessionParameterValue(req,"pch_dept_nm",true);
		dm.rmks1 = Util.getSessionParameterValue(req,"rmks1",true);
		dm.rmks2 = Util.getSessionParameterValue(req,"rmks2",true);
		dm.fisc_dt = Util.getSessionParameterValue(req,"fisc_dt",true);
		dm.incmg_emp_no = Util.getSessionParameterValue(req,"incmg_emp_no",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"incmg_pers",true);
		dm.incmg_pers_ipadd = Util.getSessionParameterValue(req,"incmg_pers_ipadd",true);
		dm.in_sicsgb = Util.getSessionParameterValue(req,"in_sicsgb",true);
		dm.qunt = Util.getSessionParameterValue(req,"qunt",true);
		*******************************************************************************************/
	}
	
	public void fc_acct_5365_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_5365_LDataSet ds = null;
		FC_ACCT_5365_LDM dm = new FC_ACCT_5365_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.fisc_fr = Util.checkString(req.getParameter("fisc_fr"));
		dm.fisc_to = Util.checkString(req.getParameter("fisc_to"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_5365_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/* EJB 수정전 시작
		try {
			FC_ACCT_5000EJBHome home = (FC_ACCT_5000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_5000EJB");
			FC_ACCT_5000EJB ejb = home.create();

			ds = ejb.fc_acct_5365_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
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
		dm.fisc_fr = (String)hash.get("fisc_fr");
		dm.fisc_to = (String)hash.get("fisc_to");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.fisc_fr = Util.getSessionParameterValue(req,"fisc_fr",true);
		dm.fisc_to = Util.getSessionParameterValue(req,"fisc_to",true);
		*******************************************************************************************/
	}	
	public void fc_acct_5382_s(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_5382_SDataSet ds = null;
		FC_ACCT_5382_SDM dm = new FC_ACCT_5382_SDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.from_fisc_dt = Util.checkString(req.getParameter("from_fisc_dt"));
		dm.to_fisc_dt = Util.checkString(req.getParameter("to_fisc_dt"));
		dm.from_acct_cd = Util.checkString(req.getParameter("from_acct_cd"));
		dm.to_acct_cd = Util.checkString(req.getParameter("to_acct_cd"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_5382_SDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/* EJB 수정전 시작
		try {
			FC_ACCT_5000EJBHome home = (FC_ACCT_5000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_5000EJB");
			FC_ACCT_5000EJB ejb = home.create();

			ds = ejb.fc_acct_5382_s(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
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
		dm.from_acct_cd = (String)hash.get("from_acct_cd");
		dm.to_acct_cd = (String)hash.get("to_acct_cd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.from_fisc_dt = Util.getSessionParameterValue(req,"from_fisc_dt",true);
		dm.to_fisc_dt = Util.getSessionParameterValue(req,"to_fisc_dt",true);
		dm.from_acct_cd = Util.getSessionParameterValue(req,"from_acct_cd",true);
		dm.to_acct_cd = Util.getSessionParameterValue(req,"to_acct_cd",true);
		*******************************************************************************************/
	}
	public void fc_acct_5394_s(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_5394_SDataSet ds = null;
		FC_ACCT_5394_SDM dm = new FC_ACCT_5394_SDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.from_fisc_dt = Util.checkString(req.getParameter("from_fisc_dt"));
		dm.to_fisc_dt = Util.checkString(req.getParameter("to_fisc_dt"));
		dm.from_acct_cd = Util.checkString(req.getParameter("from_acct_cd"));
		dm.to_acct_cd = Util.checkString(req.getParameter("to_acct_cd"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_5394_SDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/* EJB 수정전 시작
		try {
			FC_ACCT_5000EJBHome home = (FC_ACCT_5000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_5000EJB");
			FC_ACCT_5000EJB ejb = home.create();

			ds = ejb.fc_acct_5394_s(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
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
		dm.from_acct_cd = (String)hash.get("from_acct_cd");
		dm.to_acct_cd = (String)hash.get("to_acct_cd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.from_fisc_dt = Util.getSessionParameterValue(req,"from_fisc_dt",true);
		dm.to_fisc_dt = Util.getSessionParameterValue(req,"to_fisc_dt",true);
		dm.from_acct_cd = Util.getSessionParameterValue(req,"from_acct_cd",true);
		dm.to_acct_cd = Util.getSessionParameterValue(req,"to_acct_cd",true);
		*******************************************************************************************/
	}
	public void fc_acct_5402_s(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_5402_SDataSet ds = null;
		FC_ACCT_5402_SDM dm = new FC_ACCT_5402_SDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.slip_occr_dt = Util.checkString(req.getParameter("slip_occr_dt"));
		dm.slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
		dm.slip_seq = Util.checkString(req.getParameter("slip_seq"));
		dm.slip_sub_seq = Util.checkString(req.getParameter("slip_sub_seq"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_5402_SDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/* EJB 수정전 시작
		try {
			FC_ACCT_5000EJBHome home = (FC_ACCT_5000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_5000EJB");
			FC_ACCT_5000EJB ejb = home.create();

			ds = ejb.fc_acct_5402_s(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
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
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.slip_occr_dt = Util.getSessionParameterValue(req,"slip_occr_dt",true);
		dm.slip_clsf_cd = Util.getSessionParameterValue(req,"slip_clsf_cd",true);
		dm.slip_seq = Util.getSessionParameterValue(req,"slip_seq",true);
		dm.slip_sub_seq = Util.getSessionParameterValue(req,"slip_sub_seq",true);
		*******************************************************************************************/
	}
	public void fc_acct_5412_s(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_5412_SDataSet ds = null;
		FC_ACCT_5412_SDM dm = new FC_ACCT_5412_SDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.slip_occr_dt = Util.checkString(req.getParameter("slip_occr_dt"));
		dm.slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
		dm.slip_seq = Util.checkString(req.getParameter("slip_seq"));
		dm.slip_sub_seq = Util.checkString(req.getParameter("slip_sub_seq"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_5412_SDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/* EJB 수정전 시작
		try {
			FC_ACCT_5000EJBHome home = (FC_ACCT_5000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_5000EJB");
			FC_ACCT_5000EJB ejb = home.create();

			ds = ejb.fc_acct_5412_s(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
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
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.slip_occr_dt = Util.getSessionParameterValue(req,"slip_occr_dt",true);
		dm.slip_clsf_cd = Util.getSessionParameterValue(req,"slip_clsf_cd",true);
		dm.slip_seq = Util.getSessionParameterValue(req,"slip_seq",true);
		dm.slip_sub_seq = Util.getSessionParameterValue(req,"slip_sub_seq",true);
		*******************************************************************************************/
	}
	public void fc_acct_5501_a(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_5501_ADataSet ds = null;
		FC_ACCT_5501_ADM dm = new FC_ACCT_5501_ADM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.fisc_fryy = Util.checkString(req.getParameter("fisc_fryy"));
		dm.fisc_tomm = Util.checkString(req.getParameter("fisc_tomm"));
		dm.pch_x = Util.checkString(req.getParameter("pch_x"));
		dm.pch_x2 = Util.checkString(req.getParameter("pch_x2"));
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.incmg_pers_ipadd = req.getRemoteAddr();

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_5501_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/* EJB 수정전 시작
		try {
			FC_ACCT_5000EJBHome home = (FC_ACCT_5000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_5000EJB");
			FC_ACCT_5000EJB ejb = home.create();

			ds = ejb.fc_acct_5501_a(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
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
		dm.fisc_fryy = (String)hash.get("fisc_fryy");
		dm.fisc_tomm = (String)hash.get("fisc_tomm");
		dm.pch_x = (String)hash.get("pch_x");
		dm.pch_x2 = (String)hash.get("pch_x2");
		dm.incmg_pers = (String)hash.get("incmg_pers");
		dm.incmg_pers_ipadd = (String)hash.get("incmg_pers_ipadd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.fisc_fryy = Util.getSessionParameterValue(req,"fisc_fryy",true);
		dm.fisc_tomm = Util.getSessionParameterValue(req,"fisc_tomm",true);
		dm.pch_x = Util.getSessionParameterValue(req,"pch_x",true);
		dm.pch_x2 = Util.getSessionParameterValue(req,"pch_x2",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"incmg_pers",true);
		dm.incmg_pers_ipadd = Util.getSessionParameterValue(req,"incmg_pers_ipadd",true);
		*******************************************************************************************/
	}
	
	public void fc_acct_5510_p(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_5510_PDataSet ds = null;
		FC_ACCT_5510_PDM dm = new FC_ACCT_5510_PDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.fisc_yymm = Util.checkString(req.getParameter("fisc_yymm"));
		dm.from_insd_acct_cd = Util.checkString(req.getParameter("from_insd_acct_cd"));
		dm.to_insd_acct_cd = Util.checkString(req.getParameter("to_insd_acct_cd"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_5510_PDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/* EJB 수정전 시작
		try {
			FC_ACCT_5000EJBHome home = (FC_ACCT_5000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_5000EJB");
			FC_ACCT_5000EJB ejb = home.create();

			ds = ejb.fc_acct_5510_p(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
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
		dm.fisc_yymm = (String)hash.get("fisc_yymm");
		dm.from_insd_acct_cd = (String)hash.get("from_insd_acct_cd");
		dm.to_insd_acct_cd = (String)hash.get("to_insd_acct_cd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.fisc_yymm = Util.getSessionParameterValue(req,"fisc_yymm",true);
		dm.from_insd_acct_cd = Util.getSessionParameterValue(req,"from_insd_acct_cd",true);
		dm.to_insd_acct_cd = Util.getSessionParameterValue(req,"to_insd_acct_cd",true);
		*******************************************************************************************/
	}
	
	public void fc_acct_5520_p(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_5520_PDataSet ds = null;
		FC_ACCT_5520_PDM dm = new FC_ACCT_5520_PDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.fisc_yymm = Util.checkString(req.getParameter("fisc_yymm"));
		dm.dlco_clsf_cd = Util.checkString(req.getParameter("dlco_clsf_cd"));
		dm.dlco_cd_fr = Util.checkString(req.getParameter("dlco_cd_fr"));
		dm.dlco_cd_to = Util.checkString(req.getParameter("dlco_cd_to"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_5520_PDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/* EJB 수정전 시작
		try {
			FC_ACCT_5000EJBHome home = (FC_ACCT_5000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_5000EJB");
			FC_ACCT_5000EJB ejb = home.create();

			ds = ejb.fc_acct_5520_p(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
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
		dm.fisc_yymm = (String)hash.get("fisc_yymm");
		dm.dlco_clsf_cd = (String)hash.get("dlco_clsf_cd");
		dm.dlco_cd_fr = (String)hash.get("dlco_cd_fr");
		dm.dlco_cd_to = (String)hash.get("dlco_cd_to");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.fisc_yymm = Util.getSessionParameterValue(req,"fisc_yymm",true);
		dm.dlco_clsf_cd = Util.getSessionParameterValue(req,"dlco_clsf_cd",true);
		dm.dlco_cd_fr = Util.getSessionParameterValue(req,"dlco_cd_fr",true);
		dm.dlco_cd_to = Util.getSessionParameterValue(req,"dlco_cd_to",true);
		*******************************************************************************************/
	}
	
	public void fc_acct_5521_p(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_5521_PDataSet ds = null;
		FC_ACCT_5521_PDM dm = new FC_ACCT_5521_PDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.fisc_yymm = Util.checkString(req.getParameter("fisc_yymm"));
		dm.dlco_clsf_cd = Util.checkString(req.getParameter("dlco_clsf_cd"));
		dm.dlco_cd_fr = Util.checkString(req.getParameter("dlco_cd_fr"));
		dm.dlco_cd_to = Util.checkString(req.getParameter("dlco_cd_to"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_5521_PDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/* EJB 수정전 시작
		try {
			FC_ACCT_5000EJBHome home = (FC_ACCT_5000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_5000EJB");
			FC_ACCT_5000EJB ejb = home.create();

			ds = ejb.fc_acct_5521_p(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
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
		dm.fisc_yymm = (String)hash.get("fisc_yymm");
		dm.dlco_clsf_cd = (String)hash.get("dlco_clsf_cd");
		dm.dlco_cd_fr = (String)hash.get("dlco_cd_fr");
		dm.dlco_cd_to = (String)hash.get("dlco_cd_to");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.fisc_yymm = Util.getSessionParameterValue(req,"fisc_yymm",true);
		dm.dlco_clsf_cd = Util.getSessionParameterValue(req,"dlco_clsf_cd",true);
		dm.dlco_cd_fr = Util.getSessionParameterValue(req,"dlco_cd_fr",true);
		dm.dlco_cd_to = Util.getSessionParameterValue(req,"dlco_cd_to",true);
		*******************************************************************************************/
	}
	
	public void fc_acct_5530_p(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_5530_PDataSet ds = null;
		FC_ACCT_5530_PDM dm = new FC_ACCT_5530_PDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.fisc_yymm = Util.checkString(req.getParameter("fisc_yymm"));
		dm.dlco_clsf_cd = Util.checkString(req.getParameter("dlco_clsf_cd"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_5530_PDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/* EJB 수정전 시작
		try {
			FC_ACCT_5000EJBHome home = (FC_ACCT_5000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_5000EJB");
			FC_ACCT_5000EJB ejb = home.create();

			ds = ejb.fc_acct_5530_p(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
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
		dm.fisc_yymm = (String)hash.get("fisc_yymm");
		dm.dlco_clsf_cd = (String)hash.get("dlco_clsf_cd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.fisc_yymm = Util.getSessionParameterValue(req,"fisc_yymm",true);
		dm.dlco_clsf_cd = Util.getSessionParameterValue(req,"dlco_clsf_cd",true);
		*******************************************************************************************/
	}
	
	public void fc_acct_5540_p(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_5540_PDataSet ds = null;
		FC_ACCT_5540_PDM dm = new FC_ACCT_5540_PDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.fisc_yyyy = Util.checkString(req.getParameter("fisc_yyyy"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_5540_PDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/* EJB 수정전 시작
		try {
			FC_ACCT_5000EJBHome home = (FC_ACCT_5000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_5000EJB");
			FC_ACCT_5000EJB ejb = home.create();

			ds = ejb.fc_acct_5540_p(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
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
		dm.fisc_yyyy = (String)hash.get("fisc_yyyy");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.fisc_yyyy = Util.getSessionParameterValue(req,"fisc_yyyy",true);
		*******************************************************************************************/
	}
	
	public void fc_acct_5580_p(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_5580_PDataSet ds = null;
		FC_ACCT_5580_PDM dm = new FC_ACCT_5580_PDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.fisc_yymm = Util.checkString(req.getParameter("fisc_yymm"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_5580_PDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/* EJB 수정전 시작
		try {
			FC_ACCT_5000EJBHome home = (FC_ACCT_5000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_5000EJB");
			FC_ACCT_5000EJB ejb = home.create();

			ds = ejb.fc_acct_5580_p(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
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
		dm.fisc_yymm = (String)hash.get("fisc_yymm");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.fisc_yymm = Util.getSessionParameterValue(req,"fisc_yymm",true);
		*******************************************************************************************/
	}
	
	public void fc_acct_5600_p(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_5600_PDataSet ds = null;
		FC_ACCT_5600_PDM dm = new FC_ACCT_5600_PDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.slip_occr_dt = Util.checkString(req.getParameter("slip_occr_dt"));
		dm.slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
		dm.slip_seq = Util.checkString(req.getParameter("slip_seq"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_5600_PDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/* EJB 수정전 시작
		try {
			FC_ACCT_5000EJBHome home = (FC_ACCT_5000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_5000EJB");
			FC_ACCT_5000EJB ejb = home.create();

			ds = ejb.fc_acct_5600_p(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
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
	public void fc_acct_5601_m(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_5601_MDataSet ds = null;
		FC_ACCT_5601_MDM dm = new FC_ACCT_5601_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_5601_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/* EJB 수정전 시작
		try {
			FC_ACCT_5000EJBHome home = (FC_ACCT_5000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_5000EJB");
			FC_ACCT_5000EJB ejb = home.create();

			ds = ejb.fc_acct_5601_m(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
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
	
	public void fc_acct_5590_m(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_5590_MDataSet ds = null;
		FC_ACCT_5590_MDM dm = new FC_ACCT_5590_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_5590_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/* EJB 수정전 시작
		try {
			FC_ACCT_5000EJBHome home = (FC_ACCT_5000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_5000EJB");
			FC_ACCT_5000EJB ejb = home.create();

			ds = ejb.fc_acct_5590_m(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
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
	public void fc_acct_5591_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_5591_LDataSet ds = null;
		FC_ACCT_5591_LDM dm = new FC_ACCT_5591_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.slip_occr_dt = Util.checkString(req.getParameter("slip_occr_dt"));
		dm.slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
		dm.slip_seq = Util.checkString(req.getParameter("slip_seq"));
		dm.slip_sub_seq = Util.checkString(req.getParameter("slip_sub_seq"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_5591_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/* EJB 수정전 시작
		try {
			FC_ACCT_5000EJBHome home = (FC_ACCT_5000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_5000EJB");
			FC_ACCT_5000EJB ejb = home.create();

			ds = ejb.fc_acct_5591_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
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
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.slip_occr_dt = Util.getSessionParameterValue(req,"slip_occr_dt",true);
		dm.slip_clsf_cd = Util.getSessionParameterValue(req,"slip_clsf_cd",true);
		dm.slip_seq = Util.getSessionParameterValue(req,"slip_seq",true);
		dm.slip_sub_seq = Util.getSessionParameterValue(req,"slip_sub_seq",true);
		*******************************************************************************************/
	}	
	public void fc_acct_5592_d(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_5592_DDataSet ds = null;
		FC_ACCT_5592_DDM dm = new FC_ACCT_5592_DDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.slip_occr_dt = Util.checkString(req.getParameter("slip_occr_dt"));
		dm.slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
		dm.slip_seq = Util.checkString(req.getParameter("slip_seq"));
		dm.slip_sub_seq = Util.checkString(req.getParameter("slip_sub_seq"));
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		dm.aprv_yn = "C";

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_5592_DDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/* EJB 수정전 시작
		try {
			FC_ACCT_5000EJBHome home = (FC_ACCT_5000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_5000EJB");
			FC_ACCT_5000EJB ejb = home.create();

			ds = ejb.fc_acct_5592_d(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
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
		dm.incmg_pers = (String)hash.get("incmg_pers");
		dm.incmg_pers_ipadd = (String)hash.get("incmg_pers_ipadd");
		dm.aprv_yn = (String)hash.get("aprv_yn");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.slip_occr_dt = Util.getSessionParameterValue(req,"slip_occr_dt",true);
		dm.slip_clsf_cd = Util.getSessionParameterValue(req,"slip_clsf_cd",true);
		dm.slip_seq = Util.getSessionParameterValue(req,"slip_seq",true);
		dm.slip_sub_seq = Util.getSessionParameterValue(req,"slip_sub_seq",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"incmg_pers",true);
		dm.incmg_pers_ipadd = Util.getSessionParameterValue(req,"incmg_pers_ipadd",true);
		dm.aprv_yn = Util.getSessionParameterValue(req,"aprv_yn",true);
		*******************************************************************************************/
	}
	public void fc_acct_5593_i(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_5593_IDataSet ds = null;
		FC_ACCT_5593_IDM dm = new FC_ACCT_5593_IDM();

		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);
		
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.slip_occr_dt = Util.checkString(req.getParameter("slip_occr_dt"));
		dm.slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
		dm.mang_clsf_cd = (String)hash.get("mang_clsf_cd");
		dm.comp_dt = (String)hash.get("comp_dt");
		dm.rmks2 = (String)hash.get("rmks2");
		dm.dr_amt = (String)hash.get("dr_amt");		
		dm.incmg_emp_no = Util.checkString(req.getParameter("incmg_emp_no"));
		dm.incmg_dt = Util.checkString(req.getParameter("incmg_dt"));
		dm.fisc_dt = Util.checkString(req.getParameter("fisc_dt"));
		dm.rmks1 = Util.checkString(req.getParameter("rmks1"));
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		dm.aprv_yn = Util.checkString(req.getParameter("aprv_yn"));
		dm.dept_cd = Util.getSessionParameterValue(req,"deptcd",true);
		
		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_5593_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/* EJB 수정전 시작		
		try {
			FC_ACCT_5000EJBHome home = (FC_ACCT_5000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_5000EJB");
			FC_ACCT_5000EJB ejb = home.create();

			ds = ejb.fc_acct_5593_i(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
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
		dm.mang_clsf_cd = (String)hash.get("mang_clsf_cd");
		dm.comp_dt = (String)hash.get("comp_dt");
		dm.rmks2 = (String)hash.get("rmks2");
		dm.dr_amt = (String)hash.get("dr_amt");
		dm.incmg_emp_no = (String)hash.get("incmg_emp_no");
		dm.incmg_dt = (String)hash.get("incmg_dt");
		dm.fisc_dt = (String)hash.get("fisc_dt");
		dm.rmks1 = (String)hash.get("rmks1");
		dm.incmg_pers = (String)hash.get("incmg_pers");
		dm.incmg_pers_ipadd = (String)hash.get("incmg_pers_ipadd");
		dm.aprv_yn = (String)hash.get("aprv_yn");
		dm.dept_cd = (String)hash.get("dept_cd");		
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.slip_occr_dt = Util.getSessionParameterValue(req,"slip_occr_dt",true);
		dm.slip_clsf_cd = Util.getSessionParameterValue(req,"slip_clsf_cd",true);
		dm.mang_clsf_cd = Util.getSessionParameterValue(req,"mang_clsf_cd",true);
		dm.comp_dt = Util.getSessionParameterValue(req,"comp_dt",true);
		dm.rmks2 = Util.getSessionParameterValue(req,"rmks2",true);
		dm.dr_amt = Util.getSessionParameterValue(req,"dr_amt",true);
		dm.incmg_emp_no = Util.getSessionParameterValue(req,"incmg_emp_no",true);
		dm.incmg_dt = Util.getSessionParameterValue(req,"incmg_dt",true);
		dm.fisc_dt = Util.getSessionParameterValue(req,"fisc_dt",true);
		dm.rmks1 = Util.getSessionParameterValue(req,"rmks1",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"incmg_pers",true);
		dm.incmg_pers_ipadd = Util.getSessionParameterValue(req,"incmg_pers_ipadd",true);
		dm.aprv_yn = Util.getSessionParameterValue(req,"aprv_yn",true);
		dm.dept_cd = Util.getSessionParameterValue(req,"dept_cd",true);
		*******************************************************************************************/
	}
	public void fc_acct_5801_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_5801_LDataSet ds = null;
		FC_ACCT_5801_LDM dm = new FC_ACCT_5801_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.acct_cd_fr = Util.checkString(req.getParameter("acct_cd_fr"));
		dm.acct_cd_to = Util.checkString(req.getParameter("acct_cd_to"));
		dm.incmg_dt = Util.checkString(req.getParameter("incmg_dt"));
		dm.kind = Util.checkString(req.getParameter("kind"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_5801_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/* EJB 수정전 시작
		try {
			FC_ACCT_5000EJBHome home = (FC_ACCT_5000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_5000EJB");
			FC_ACCT_5000EJB ejb = home.create();

			ds = ejb.fc_acct_5801_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
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
		dm.acct_cd_fr = (String)hash.get("acct_cd_fr");
		dm.acct_cd_to = (String)hash.get("acct_cd_to");
		dm.incmg_dt = (String)hash.get("incmg_dt");
		dm.kind = (String)hash.get("kind");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.acct_cd_fr = Util.getSessionParameterValue(req,"acct_cd_fr",true);
		dm.acct_cd_to = Util.getSessionParameterValue(req,"acct_cd_to",true);
		dm.incmg_dt = Util.getSessionParameterValue(req,"incmg_dt",true);
		dm.kind = Util.getSessionParameterValue(req,"kind",true);
		*******************************************************************************************/
	}
	public void fc_acct_5802_s(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_5802_SDataSet ds = null;
		FC_ACCT_5802_SDM dm = new FC_ACCT_5802_SDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_5802_SDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/* EJB 수정전 시작
		try {
			FC_ACCT_5000EJBHome home = (FC_ACCT_5000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_5000EJB");
			FC_ACCT_5000EJB ejb = home.create();

			ds = ejb.fc_acct_5802_s(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
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
	public void fc_acct_5811_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_5811_LDataSet ds = null;
		FC_ACCT_5811_LDM dm = new FC_ACCT_5811_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.frbudg_cd = Util.checkString(req.getParameter("frbudg_cd"));
		dm.tobudg_cd = Util.checkString(req.getParameter("tobudg_cd"));
		dm.frfisc_dt = Util.checkString(req.getParameter("frfisc_dt"));
		dm.tofisc_dt = Util.checkString(req.getParameter("tofisc_dt"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_5811_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/* EJB 수정전 시작
		try {
			FC_ACCT_5000EJBHome home = (FC_ACCT_5000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_5000EJB");
			FC_ACCT_5000EJB ejb = home.create();

			ds = ejb.fc_acct_5831_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
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
		dm.incmg_dt = (String)hash.get("incmg_dt");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.incmg_dt = Util.getSessionParameterValue(req,"incmg_dt",true);
		*******************************************************************************************/
	}
	public void fc_acct_5812_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_5812_LDataSet ds = null;
		FC_ACCT_5812_LDM dm = new FC_ACCT_5812_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.frbudg_cd = Util.checkString(req.getParameter("frbudg_cd"));
		dm.tobudg_cd = Util.checkString(req.getParameter("tobudg_cd"));
		dm.frfisc_dt = Util.checkString(req.getParameter("frfisc_dt"));
		dm.tofisc_dt = Util.checkString(req.getParameter("tofisc_dt"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_5812_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
	}	
	
	public void fc_acct_5821_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_5821_LDataSet ds = null;
		FC_ACCT_5821_LDM dm = new FC_ACCT_5821_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.clsf_cd = Util.checkString(req.getParameter("clsf_cd"));
		dm.fisc_ym_fr = Util.checkString(req.getParameter("fisc_ym_fr"));
		dm.fisc_ym_to = Util.checkString(req.getParameter("fisc_ym_to"));
		dm.acct_cd_fr = Util.checkString(req.getParameter("acct_cd_fr"));
		dm.acct_cd_to = Util.checkString(req.getParameter("acct_cd_to"));
		dm.dlco_cd = Util.checkString(req.getParameter("dlco_cd"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_5821_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/* EJB 수정전 시작
		try {
			FC_ACCT_5000EJBHome home = (FC_ACCT_5000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_5000EJB");
			FC_ACCT_5000EJB ejb = home.create();

			ds = ejb.fc_acct_5891_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
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
		dm.clsf_cd = (String)hash.get("clsf_cd");
		dm.fisc_ym_fr = (String)hash.get("fisc_ym_fr");
		dm.fisc_ym_to = (String)hash.get("fisc_ym_to");
		dm.acct_cd_fr = (String)hash.get("acct_cd_fr");
		dm.acct_cd_to = (String)hash.get("acct_cd_to");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.clsf_cd = Util.getSessionParameterValue(req,"clsf_cd",true);
		dm.fisc_ym_fr = Util.getSessionParameterValue(req,"fisc_ym_fr",true);
		dm.fisc_ym_to = Util.getSessionParameterValue(req,"fisc_ym_to",true);
		dm.acct_cd_fr = Util.getSessionParameterValue(req,"acct_cd_fr",true);
		dm.acct_cd_to = Util.getSessionParameterValue(req,"acct_cd_to",true);
		*******************************************************************************************/
	}	

	public void fc_acct_5831_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_5831_LDataSet ds = null;
		FC_ACCT_5831_LDM dm = new FC_ACCT_5831_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_dt = Util.checkString(req.getParameter("incmg_dt"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_5831_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/* EJB 수정전 시작
		try {
			FC_ACCT_5000EJBHome home = (FC_ACCT_5000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_5000EJB");
			FC_ACCT_5000EJB ejb = home.create();

			ds = ejb.fc_acct_5831_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
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
		dm.incmg_dt = (String)hash.get("incmg_dt");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.incmg_dt = Util.getSessionParameterValue(req,"incmg_dt",true);
		*******************************************************************************************/
	}
	public void fc_acct_5832_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_5832_LDataSet ds = null;
		FC_ACCT_5832_LDM dm = new FC_ACCT_5832_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_5832_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/* EJB 수정전 시작
		try {
			FC_ACCT_5000EJBHome home = (FC_ACCT_5000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_5000EJB");
			FC_ACCT_5000EJB ejb = home.create();

			ds = ejb.fc_acct_5832_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
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
	public void fc_acct_5841_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_5841_LDataSet ds = null;
		FC_ACCT_5841_LDM dm = new FC_ACCT_5841_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_5841_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/* EJB 수정전 시작
		try {
			FC_ACCT_5000EJBHome home = (FC_ACCT_5000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_5000EJB");
			FC_ACCT_5000EJB ejb = home.create();

			ds = ejb.fc_acct_5841_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
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
	public void fc_acct_5842_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_5842_LDataSet ds = null;
		FC_ACCT_5842_LDM dm = new FC_ACCT_5842_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.fisc_mm_fr = Util.checkString(req.getParameter("fisc_mm_fr"));
		dm.fisc_mm_to = Util.checkString(req.getParameter("fisc_mm_to"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_5842_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/* EJB 수정전 시작
		try {
			FC_ACCT_5000EJBHome home = (FC_ACCT_5000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_5000EJB");
			FC_ACCT_5000EJB ejb = home.create();

			ds = ejb.fc_acct_5842_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
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
		dm.fisc_mm_fr = (String)hash.get("fisc_mm_fr");
		dm.fisc_mm_to = (String)hash.get("fisc_mm_to");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.fisc_mm_fr = Util.getSessionParameterValue(req,"fisc_mm_fr",true);
		dm.fisc_mm_to = Util.getSessionParameterValue(req,"fisc_mm_to",true);
		*******************************************************************************************/
	}
	public void fc_acct_5850_m(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_5850_MDataSet ds = null;
		FC_ACCT_5850_MDM dm = new FC_ACCT_5850_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		
		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_5850_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/* EJB 수정전 시작
		try {
			FC_ACCT_5000EJBHome home = (FC_ACCT_5000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_5000EJB");
			FC_ACCT_5000EJB ejb = home.create();

			ds = ejb.fc_acct_5851_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
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
		dm.fisc_dt = (String)hash.get("fisc_dt");
		dm.slip_clsf_cd1 = (String)hash.get("slip_clsf_cd1");
		dm.slip_clsf_cd2 = (String)hash.get("slip_clsf_cd2");
		dm.slip_clsf_cd3 = (String)hash.get("slip_clsf_cd3");
		dm.slip_clsf_cd4 = (String)hash.get("slip_clsf_cd4");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.fisc_dt = Util.getSessionParameterValue(req,"fisc_dt",true);
		dm.slip_clsf_cd1 = Util.getSessionParameterValue(req,"slip_clsf_cd1",true);
		dm.slip_clsf_cd2 = Util.getSessionParameterValue(req,"slip_clsf_cd2",true);
		dm.slip_clsf_cd3 = Util.getSessionParameterValue(req,"slip_clsf_cd3",true);
		dm.slip_clsf_cd4 = Util.getSessionParameterValue(req,"slip_clsf_cd4",true);
		*******************************************************************************************/
	}
	public void fc_acct_5851_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_5851_LDataSet ds = null;
		FC_ACCT_5851_LDM dm = new FC_ACCT_5851_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.fisc_dt = Util.checkString(req.getParameter("fisc_dt"));
		dm.slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
		//dm.slip_clsf_cd1 = Util.checkString(req.getParameter("slip_clsf_cd1"));
		//dm.slip_clsf_cd2 = Util.checkString(req.getParameter("slip_clsf_cd2"));
		//dm.slip_clsf_cd3 = Util.checkString(req.getParameter("slip_clsf_cd3"));
		//dm.slip_clsf_cd4 = Util.checkString(req.getParameter("slip_clsf_cd4"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_5851_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/* EJB 수정전 시작
		try {
			FC_ACCT_5000EJBHome home = (FC_ACCT_5000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_5000EJB");
			FC_ACCT_5000EJB ejb = home.create();

			ds = ejb.fc_acct_5851_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
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
		dm.fisc_dt = (String)hash.get("fisc_dt");
		dm.slip_clsf_cd1 = (String)hash.get("slip_clsf_cd1");
		dm.slip_clsf_cd2 = (String)hash.get("slip_clsf_cd2");
		dm.slip_clsf_cd3 = (String)hash.get("slip_clsf_cd3");
		dm.slip_clsf_cd4 = (String)hash.get("slip_clsf_cd4");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.fisc_dt = Util.getSessionParameterValue(req,"fisc_dt",true);
		dm.slip_clsf_cd1 = Util.getSessionParameterValue(req,"slip_clsf_cd1",true);
		dm.slip_clsf_cd2 = Util.getSessionParameterValue(req,"slip_clsf_cd2",true);
		dm.slip_clsf_cd3 = Util.getSessionParameterValue(req,"slip_clsf_cd3",true);
		dm.slip_clsf_cd4 = Util.getSessionParameterValue(req,"slip_clsf_cd4",true);
		*******************************************************************************************/
	}
	public void fc_acct_5852_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_5852_LDataSet ds = null;
		FC_ACCT_5852_LDM dm = new FC_ACCT_5852_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_5852_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/* EJB 수정전 시작
		try {
			FC_ACCT_5000EJBHome home = (FC_ACCT_5000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_5000EJB");
			FC_ACCT_5000EJB ejb = home.create();

			ds = ejb.fc_acct_5852_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
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
	public void fc_acct_5861_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_5861_LDataSet ds = null;
		FC_ACCT_5861_LDM dm = new FC_ACCT_5861_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.fisc_dt_fr = Util.checkString(req.getParameter("fisc_dt_fr"));
		dm.fisc_dt_to = Util.checkString(req.getParameter("fisc_dt_to"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_5861_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/* EJB 수정전 시작
		try {
			FC_ACCT_5000EJBHome home = (FC_ACCT_5000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_5000EJB");
			FC_ACCT_5000EJB ejb = home.create();

			ds = ejb.fc_acct_5861_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
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
		dm.fisc_dt_fr = (String)hash.get("fisc_dt_fr");
		dm.fisc_dt_to = (String)hash.get("fisc_dt_to");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.fisc_dt_fr = Util.getSessionParameterValue(req,"fisc_dt_fr",true);
		dm.fisc_dt_to = Util.getSessionParameterValue(req,"fisc_dt_to",true);
		*******************************************************************************************/
	}
	public void fc_acct_5862_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_5862_LDataSet ds = null;
		FC_ACCT_5862_LDM dm = new FC_ACCT_5862_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.fisc_dt_fr = Util.checkString(req.getParameter("fisc_dt_fr"));
		dm.fisc_dt_to = Util.checkString(req.getParameter("fisc_dt_to"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_5862_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/* EJB 수정전 시작
		try {
			FC_ACCT_5000EJBHome home = (FC_ACCT_5000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_5000EJB");
			FC_ACCT_5000EJB ejb = home.create();

			ds = ejb.fc_acct_5862_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
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
		dm.fisc_dt_fr = (String)hash.get("fisc_dt_fr");
		dm.fisc_dt_to = (String)hash.get("fisc_dt_to");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.fisc_dt_fr = Util.getSessionParameterValue(req,"fisc_dt_fr",true);
		dm.fisc_dt_to = Util.getSessionParameterValue(req,"fisc_dt_to",true);
		*******************************************************************************************/
	}	
	public void fc_acct_5863_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_5863_LDataSet ds = null;
		FC_ACCT_5863_LDM dm = new FC_ACCT_5863_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.fisc_dt_fr = Util.checkString(req.getParameter("fisc_dt_fr"));
		dm.fisc_dt_to = Util.checkString(req.getParameter("fisc_dt_to"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_5863_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/* EJB 수정전 시작
		try {
			FC_ACCT_5000EJBHome home = (FC_ACCT_5000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_5000EJB");
			FC_ACCT_5000EJB ejb = home.create();

			ds = ejb.fc_acct_5863_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
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
		dm.fisc_dt_fr = (String)hash.get("fisc_dt_fr");
		dm.fisc_dt_to = (String)hash.get("fisc_dt_to");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.fisc_dt_fr = Util.getSessionParameterValue(req,"fisc_dt_fr",true);
		dm.fisc_dt_to = Util.getSessionParameterValue(req,"fisc_dt_to",true);
		*******************************************************************************************/
	}	
	public void fc_acct_5864_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_5864_LDataSet ds = null;
		FC_ACCT_5864_LDM dm = new FC_ACCT_5864_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_5864_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/* EJB 수정전 시작
		try {
			FC_ACCT_5000EJBHome home = (FC_ACCT_5000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_5000EJB");
			FC_ACCT_5000EJB ejb = home.create();

			ds = ejb.fc_acct_5864_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
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
	public void fc_acct_5870_m(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_5870_MDataSet ds = null;
		FC_ACCT_5870_MDM dm = new FC_ACCT_5870_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_5870_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/* EJB 수정전 시작
		try {
			FC_ACCT_5000EJBHome home = (FC_ACCT_5000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_5000EJB");
			FC_ACCT_5000EJB ejb = home.create();

			ds = ejb.fc_acct_5871_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
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
		dm.fisc_dt_fr = (String)hash.get("fisc_dt_fr");
		dm.fisc_dt_to = (String)hash.get("fisc_dt_to");
		dm.fisc_dt = (String)hash.get("fisc_dt");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.fisc_dt_fr = Util.getSessionParameterValue(req,"fisc_dt_fr",true);
		dm.fisc_dt_to = Util.getSessionParameterValue(req,"fisc_dt_to",true);
		dm.fisc_dt = Util.getSessionParameterValue(req,"fisc_dt",true);
		*******************************************************************************************/
	}
	public void fc_acct_5871_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_5871_LDataSet ds = null;
		FC_ACCT_5871_LDM dm = new FC_ACCT_5871_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.fisc_dt_fr = Util.checkString(req.getParameter("fisc_dt_fr"));
		dm.fisc_dt_to = Util.checkString(req.getParameter("fisc_dt_to"));
		dm.fisc_dt = Util.checkString(req.getParameter("fisc_dt"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_5871_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/* EJB 수정전 시작
		try {
			FC_ACCT_5000EJBHome home = (FC_ACCT_5000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_5000EJB");
			FC_ACCT_5000EJB ejb = home.create();

			ds = ejb.fc_acct_5871_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
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
		dm.fisc_dt_fr = (String)hash.get("fisc_dt_fr");
		dm.fisc_dt_to = (String)hash.get("fisc_dt_to");
		dm.fisc_dt = (String)hash.get("fisc_dt");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.fisc_dt_fr = Util.getSessionParameterValue(req,"fisc_dt_fr",true);
		dm.fisc_dt_to = Util.getSessionParameterValue(req,"fisc_dt_to",true);
		dm.fisc_dt = Util.getSessionParameterValue(req,"fisc_dt",true);
		*******************************************************************************************/
	}
	public void fc_acct_5872_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_5872_LDataSet ds = null;
		FC_ACCT_5872_LDM dm = new FC_ACCT_5872_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.fisc_dt_fr = Util.checkString(req.getParameter("fisc_dt_fr"));
		dm.fisc_dt_to = Util.checkString(req.getParameter("fisc_dt_to"));
		dm.fisc_dt = Util.checkString(req.getParameter("fisc_dt"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_5872_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/* EJB 수정전 시작
		try {
			FC_ACCT_5000EJBHome home = (FC_ACCT_5000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_5000EJB");
			FC_ACCT_5000EJB ejb = home.create();

			ds = ejb.fc_acct_5872_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
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
		dm.fisc_dt_fr = (String)hash.get("fisc_dt_fr");
		dm.fisc_dt_to = (String)hash.get("fisc_dt_to");
		dm.fisc_dt = (String)hash.get("fisc_dt");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.fisc_dt_fr = Util.getSessionParameterValue(req,"fisc_dt_fr",true);
		dm.fisc_dt_to = Util.getSessionParameterValue(req,"fisc_dt_to",true);
		dm.fisc_dt = Util.getSessionParameterValue(req,"fisc_dt",true);
		*******************************************************************************************/
	}
	public void fc_acct_5873_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_5873_LDataSet ds = null;
		FC_ACCT_5873_LDM dm = new FC_ACCT_5873_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.fisc_dt_fr = Util.checkString(req.getParameter("fisc_dt_fr"));
		dm.fisc_dt_to = Util.checkString(req.getParameter("fisc_dt_to"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_5873_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/* EJB 수정전 시작
		try {
			FC_ACCT_5000EJBHome home = (FC_ACCT_5000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_5000EJB");
			FC_ACCT_5000EJB ejb = home.create();

			ds = ejb.fc_acct_5873_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
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
		dm.fisc_dt_fr = (String)hash.get("fisc_dt_fr");
		dm.fisc_dt_to = (String)hash.get("fisc_dt_to");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.fisc_dt_fr = Util.getSessionParameterValue(req,"fisc_dt_fr",true);
		dm.fisc_dt_to = Util.getSessionParameterValue(req,"fisc_dt_to",true);
		*******************************************************************************************/
	}	
	public void fc_acct_5874_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_5874_LDataSet ds = null;
		FC_ACCT_5874_LDM dm = new FC_ACCT_5874_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);

		dm.print();
		
		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_5874_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/* EJB 수정전 시작
		try {
			FC_ACCT_5000EJBHome home = (FC_ACCT_5000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_5000EJB");
			FC_ACCT_5000EJB ejb = home.create();

			ds = ejb.fc_acct_5874_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
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
	public void fc_acct_5875_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_5875_LDataSet ds = null;
		FC_ACCT_5875_LDM dm = new FC_ACCT_5875_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.fr_dt = Util.checkString(req.getParameter("fisc_dt"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_5875_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/* EJB 수정전 시작
		try {
			FC_ACCT_5000EJBHome home = (FC_ACCT_5000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_5000EJB");
			FC_ACCT_5000EJB ejb = home.create();

			ds = ejb.fc_acct_5875_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
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
		dm.fr_dt = (String)hash.get("fr_dt");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.fr_dt = Util.getSessionParameterValue(req,"fr_dt",true);
		*******************************************************************************************/
	}		
	public void fc_acct_5881_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_5881_LDataSet ds = null;
		FC_ACCT_5881_LDM dm = new FC_ACCT_5881_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.fisc_dt_fr = Util.checkString(req.getParameter("fisc_dt_fr"));
		dm.fisc_dt_to = Util.checkString(req.getParameter("fisc_dt_to"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_5881_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/* EJB 수정전 시작
		try {
			FC_ACCT_5000EJBHome home = (FC_ACCT_5000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_5000EJB");
			FC_ACCT_5000EJB ejb = home.create();

			ds = ejb.fc_acct_5881_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
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
		dm.fisc_dt_fr = (String)hash.get("fisc_dt_fr");
		dm.fisc_dt_to = (String)hash.get("fisc_dt_to");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.fisc_dt_fr = Util.getSessionParameterValue(req,"fisc_dt_fr",true);
		dm.fisc_dt_to = Util.getSessionParameterValue(req,"fisc_dt_to",true);
		*******************************************************************************************/
	}
	public void fc_acct_5882_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_5882_LDataSet ds = null;
		FC_ACCT_5882_LDM dm = new FC_ACCT_5882_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.fisc_ym_fr = Util.checkString(req.getParameter("fisc_ym_fr"));
		dm.fisc_ym_to = Util.checkString(req.getParameter("fisc_ym_to"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_5882_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/* EJB 수정전 시작
		try {
			FC_ACCT_5000EJBHome home = (FC_ACCT_5000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_5000EJB");
			FC_ACCT_5000EJB ejb = home.create();

			ds = ejb.fc_acct_5882_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
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
		dm.fisc_ym_fr = (String)hash.get("fisc_ym_fr");
		dm.fisc_ym_to = (String)hash.get("fisc_ym_to");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.fisc_ym_fr = Util.getSessionParameterValue(req,"fisc_ym_fr",true);
		dm.fisc_ym_to = Util.getSessionParameterValue(req,"fisc_ym_to",true);
		*******************************************************************************************/
	}	
	public void fc_acct_5883_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_5883_LDataSet ds = null;
		FC_ACCT_5883_LDM dm = new FC_ACCT_5883_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_5883_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/* EJB 수정전 시작
		try {
			FC_ACCT_5000EJBHome home = (FC_ACCT_5000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_5000EJB");
			FC_ACCT_5000EJB ejb = home.create();

			ds = ejb.fc_acct_5883_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
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
	public void fc_acct_5891_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_5891_LDataSet ds = null;
		FC_ACCT_5891_LDM dm = new FC_ACCT_5891_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.clsf_cd = Util.checkString(req.getParameter("clsf_cd"));
		dm.fisc_ym_fr = Util.checkString(req.getParameter("fisc_ym_fr"));
		dm.fisc_ym_to = Util.checkString(req.getParameter("fisc_ym_to"));
		dm.acct_cd_fr = Util.checkString(req.getParameter("acct_cd_fr"));
		dm.acct_cd_to = Util.checkString(req.getParameter("acct_cd_to"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_5891_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/* EJB 수정전 시작
		try {
			FC_ACCT_5000EJBHome home = (FC_ACCT_5000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_5000EJB");
			FC_ACCT_5000EJB ejb = home.create();

			ds = ejb.fc_acct_5891_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
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
		dm.clsf_cd = (String)hash.get("clsf_cd");
		dm.fisc_ym_fr = (String)hash.get("fisc_ym_fr");
		dm.fisc_ym_to = (String)hash.get("fisc_ym_to");
		dm.acct_cd_fr = (String)hash.get("acct_cd_fr");
		dm.acct_cd_to = (String)hash.get("acct_cd_to");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.clsf_cd = Util.getSessionParameterValue(req,"clsf_cd",true);
		dm.fisc_ym_fr = Util.getSessionParameterValue(req,"fisc_ym_fr",true);
		dm.fisc_ym_to = Util.getSessionParameterValue(req,"fisc_ym_to",true);
		dm.acct_cd_fr = Util.getSessionParameterValue(req,"acct_cd_fr",true);
		dm.acct_cd_to = Util.getSessionParameterValue(req,"acct_cd_to",true);
		*******************************************************************************************/
	}	
}

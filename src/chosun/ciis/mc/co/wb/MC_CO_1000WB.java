package chosun.ciis.mc.co.wb;

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

import chosun.ciis.fc.co.ds.FC_CO_9999_LDataSet;

import chosun.ciis.mc.co.dm.*;
import chosun.ciis.mc.co.ds.*;

public class MC_CO_1000WB extends chosun.ciis.co.base.wb.BaseWB {
	public void getDummyList(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_CO_9999_LDataSet ds = null;
		MC_CO_9999_LDM dm = new MC_CO_9999_LDM();
		
		dm.cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
		
		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_CO_9999_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_CO_1000EJBHome home = (MC_CO_1000EJBHome)JNDIManager.getInstance().getHome("MC_CO_1000EJB");
			MC_CO_1000EJB ejb = home.create();
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
	public void mc_co_1001_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_CO_1001_LDataSet ds = null;
		MC_CO_1001_LDM dm = new MC_CO_1001_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.cd = Util.checkString(req.getParameter("cd"));
		dm.cdnm = Util.checkString(req.getParameter("cdnm"));
		
		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_CO_1001_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_CO_1000EJBHome home = (MC_CO_1000EJBHome)JNDIManager.getInstance().getHome("MC_CO_1000EJB");
			MC_CO_1000EJB ejb = home.create();

			ds = ejb.mc_co_1001_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
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
	public void mc_co_1002_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_CO_1002_LDataSet ds = null;
		MC_CO_1002_LDM dm = new MC_CO_1002_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.cd = Util.checkString(req.getParameter("cd"));
		dm.cdnm = Util.checkString(req.getParameter("cdnm"));
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		
		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_CO_1002_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_CO_1000EJBHome home = (MC_CO_1000EJBHome)JNDIManager.getInstance().getHome("MC_CO_1000EJB");
			MC_CO_1000EJB ejb = home.create();

			ds = ejb.mc_co_1002_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
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
	public void mc_co_1003_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_CO_1003_LDataSet ds = null;
		MC_CO_1003_LDM dm = new MC_CO_1003_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.cd = Util.checkString(req.getParameter("cd"));
		dm.cdnm = Util.checkString(req.getParameter("cdnm"));
		dm.medi_cd = Util.checkString(req.getParameter("medi_cd"));
		
		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_CO_1003_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_CO_1000EJBHome home = (MC_CO_1000EJBHome)JNDIManager.getInstance().getHome("MC_CO_1000EJB");
			MC_CO_1000EJB ejb = home.create();

			ds = ejb.mc_co_1003_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
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
	public void mc_co_1004_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_CO_1004_LDataSet ds = null;
		MC_CO_1004_LDM dm = new MC_CO_1004_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.cd = Util.checkString(req.getParameter("cd"));
		dm.cdnm = Util.checkString(req.getParameter("cdnm"));
		dm.from_cd = Util.checkString(req.getParameter("from_cd"));
		dm.to_cd = Util.checkString(req.getParameter("to_cd"));
		dm.query = Util.checkString(req.getParameter("query"));
		
		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_CO_1004_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_CO_1000EJBHome home = (MC_CO_1000EJBHome)JNDIManager.getInstance().getHome("MC_CO_1000EJB");
			MC_CO_1000EJB ejb = home.create();

			ds = ejb.mc_co_1004_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
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
	public void mc_co_1005_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_CO_1005_LDataSet ds = null;
		MC_CO_1005_LDM dm = new MC_CO_1005_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.cd = Util.checkString(req.getParameter("cd"));
		dm.cdnm = Util.checkString(req.getParameter("cdnm"));
		dm.from_cd = Util.checkString(req.getParameter("from_cd"));
		dm.to_cd = Util.checkString(req.getParameter("to_cd"));
		dm.bgn_dt = Util.checkString(req.getParameter("bgn_dt"));
		dm.last_dt = Util.checkString(req.getParameter("last_dt"));
		
		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_CO_1005_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_CO_1000EJBHome home = (MC_CO_1000EJBHome)JNDIManager.getInstance().getHome("MC_CO_1000EJB");
			MC_CO_1000EJB ejb = home.create();

			ds = ejb.mc_co_1005_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
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
	public void mc_co_1006_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_CO_1006_LDataSet ds = null;
		MC_CO_1006_LDM dm = new MC_CO_1006_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.cd = Util.checkString(req.getParameter("cd"));
		dm.cdnm = Util.checkString(req.getParameter("cdnm"));
		
		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_CO_1006_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_CO_1000EJBHome home = (MC_CO_1000EJBHome)JNDIManager.getInstance().getHome("MC_CO_1000EJB");
			MC_CO_1000EJB ejb = home.create();

			ds = ejb.mc_co_1006_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
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
	public void mc_co_1007_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_CO_1007_LDataSet ds = null;
		MC_CO_1007_LDM dm = new MC_CO_1007_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.cd = Util.checkString(req.getParameter("cd"));
		dm.cdnm = Util.checkString(req.getParameter("cdnm"));
		dm.evnt_clsf_cd = Util.checkString(req.getParameter("evnt_clsf_cd"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_CO_1007_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_CO_1000EJBHome home = (MC_CO_1000EJBHome)JNDIManager.getInstance().getHome("MC_CO_1000EJB");
			MC_CO_1000EJB ejb = home.create();

			ds = ejb.mc_co_1007_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
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
		dm.cdnm = (String)hash.get("cdnm");
		dm.evnt_clsf_cd = (String)hash.get("evnt_clsf_cd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.cd = Util.getSessionParameterValue(req,"cd",true);
		dm.cdnm = Util.getSessionParameterValue(req,"cdnm",true);
		dm.evnt_clsf_cd = Util.getSessionParameterValue(req,"evnt_clsf_cd",true);
		*******************************************************************************************/
	}
	
	public void mc_co_1008_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_CO_1008_LDataSet ds = null;
		MC_CO_1008_LDM dm = new MC_CO_1008_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.cd = Util.checkString(req.getParameter("cd"));
		dm.cdnm = Util.checkString(req.getParameter("cdnm"));
		dm.job_clsf = Util.checkString(req.getParameter("job_clsf"));
		dm.cd_clsf = Util.checkString(req.getParameter("cd_clsf"));
		
		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_CO_1008_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_CO_1000EJBHome home = (MC_CO_1000EJBHome)JNDIManager.getInstance().getHome("MC_CO_1000EJB");
			MC_CO_1000EJB ejb = home.create();

			ds = ejb.mc_co_1008_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
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
	public void mc_co_1009_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_CO_1009_LDataSet ds = null;
		MC_CO_1009_LDM dm = new MC_CO_1009_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.cd = Util.checkString(req.getParameter("cd"));
		dm.cdnm = Util.checkString(req.getParameter("cdnm"));
		dm.job_clsf = Util.checkString(req.getParameter("job_clsf"));
		dm.cd_clsf = Util.checkString(req.getParameter("cd_clsf"));
		
		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_CO_1009_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_CO_1000EJBHome home = (MC_CO_1000EJBHome)JNDIManager.getInstance().getHome("MC_CO_1000EJB");
			MC_CO_1000EJB ejb = home.create();

			ds = ejb.mc_co_1009_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
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
	public void mc_co_1010i(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_CO_1010IDataSet ds = null;
		MC_CO_1010IDM dm = new MC_CO_1010IDM();
		
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.job_clsf_cd = Util.checkString(req.getParameter("job_clsf_cd"));
		dm.form_dept_cd = Util.checkString(req.getParameter("form_dept_cd"));
		dm.medi_cd = Util.checkString(req.getParameter("medi_cd"));
		dm.incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		
		dm.dtls_clsf_cd = (String)hash.get("dtls_clsf_cd");
		dm.dept_cd = (String)hash.get("dept_cd");
		dm.yymm = (String)hash.get("yymm");
		dm.ini_plan_qunt = (String)hash.get("ini_plan_qunt");
		dm.rmks = (String)hash.get("rmks");
		dm.mode = (String)hash.get("m");

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_CO_1010IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_CO_1000EJBHome home = (MC_CO_1000EJBHome)JNDIManager.getInstance().getHome("MC_CO_1000EJB");
			MC_CO_1000EJB ejb = home.create();

			ds = ejb.mc_co_1010i(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
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
		dm.yymm = (String)hash.get("yymm");
		dm.job_clsf_cd = (String)hash.get("job_clsf_cd");
		dm.dtls_clsf_cd = (String)hash.get("dtls_clsf_cd");
		dm.medi_cd = (String)hash.get("medi_cd");
		dm.dept_cd = (String)hash.get("dept_cd");
		dm.ini_plan_qunt = (String)hash.get("ini_plan_qunt");
		dm.rmks = (String)hash.get("rmks");
		dm.form_dept_cd = (String)hash.get("form_dept_cd");
		dm.incmg_pers = (String)hash.get("incmg_pers");
		dm.incmg_pers_ipadd = (String)hash.get("incmg_pers_ipadd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.mode = Util.getSessionParameterValue(req,"mode",true);
		dm.yymm = Util.getSessionParameterValue(req,"yymm",true);
		dm.job_clsf_cd = Util.getSessionParameterValue(req,"job_clsf_cd",true);
		dm.dtls_clsf_cd = Util.getSessionParameterValue(req,"dtls_clsf_cd",true);
		dm.medi_cd = Util.getSessionParameterValue(req,"medi_cd",true);
		dm.dept_cd = Util.getSessionParameterValue(req,"dept_cd",true);
		dm.ini_plan_qunt = Util.getSessionParameterValue(req,"ini_plan_qunt",true);
		dm.rmks = Util.getSessionParameterValue(req,"rmks",true);
		dm.form_dept_cd = Util.getSessionParameterValue(req,"form_dept_cd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"incmg_pers",true);
		dm.incmg_pers_ipadd = Util.getSessionParameterValue(req,"incmg_pers_ipadd",true);
		*******************************************************************************************/
	}
	public void mc_co_1011_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_CO_1011_LDataSet ds = null;
		MC_CO_1011_LDM dm = new MC_CO_1011_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.abrv_nm = Util.checkString(req.getParameter("abrv_nm"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_CO_1011_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_CO_1000EJBHome home = (MC_CO_1000EJBHome)JNDIManager.getInstance().getHome("MC_CO_1000EJB");
			MC_CO_1000EJB ejb = home.create();

			ds = ejb.mc_co_1011_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
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
	public void mc_co_1012_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_CO_1012_LDataSet ds = null;
		MC_CO_1012_LDM dm = new MC_CO_1012_LDM();

		dm.cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
		dm.cd = Util.checkString(req.getParameter("cd"));
		dm.cdnm = Util.checkString(req.getParameter("cdnm"));
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.clas_cd1 = Util.checkString(req.getParameter("clas_cd1"));
		dm.clas_cd2 = Util.checkString(req.getParameter("clas_cd2"));
		dm.clas_cd3 = Util.checkString(req.getParameter("clas_cd3"));
		dm.clas_cd4 = Util.checkString(req.getParameter("clas_cd4"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_CO_1012_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_CO_1000EJBHome home = (MC_CO_1000EJBHome)JNDIManager.getInstance().getHome("MC_CO_1000EJB");
			MC_CO_1000EJB ejb = home.create();

			ds = ejb.mc_co_1012_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
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
		dm.cdnm = (String)hash.get("cdnm");
		dm.dept_cd = (String)hash.get("dept_cd");
		dm.clas_cd1 = (String)hash.get("clas_cd1");
		dm.clas_cd2 = (String)hash.get("clas_cd2");
		dm.clas_cd3 = (String)hash.get("clas_cd3");
		dm.clas_cd4 = (String)hash.get("clas_cd4");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.cd = Util.getSessionParameterValue(req,"cd",true);
		dm.cdnm = Util.getSessionParameterValue(req,"cdnm",true);
		dm.dept_cd = Util.getSessionParameterValue(req,"dept_cd",true);
		dm.clas_cd1 = Util.getSessionParameterValue(req,"clas_cd1",true);
		dm.clas_cd2 = Util.getSessionParameterValue(req,"clas_cd2",true);
		dm.clas_cd3 = Util.getSessionParameterValue(req,"clas_cd3",true);
		dm.clas_cd4 = Util.getSessionParameterValue(req,"clas_cd4",true);
		*******************************************************************************************/
	}
	public void mc_co_1013_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_CO_1013_LDataSet ds = null;
		MC_CO_1013_LDM dm = new MC_CO_1013_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.cd = Util.checkString(req.getParameter("cd"));
		dm.cdnm = Util.checkString(req.getParameter("cdnm"));
		dm.evnt_cd = Util.checkString(req.getParameter("evnt_cd"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_CO_1013_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_CO_1000EJBHome home = (MC_CO_1000EJBHome)JNDIManager.getInstance().getHome("MC_CO_1000EJB");
			MC_CO_1000EJB ejb = home.create();

			ds = ejb.mc_co_1013_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
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
		dm.cdnm = (String)hash.get("cdnm");
		dm.evnt_cd = (String)hash.get("evnt_cd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.cd = Util.getSessionParameterValue(req,"cd",true);
		dm.cdnm = Util.getSessionParameterValue(req,"cdnm",true);
		dm.evnt_cd = Util.getSessionParameterValue(req,"evnt_cd",true);
		*******************************************************************************************/
	}	
	public void mc_co_1014_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_CO_1014_LDataSet ds = null;
		MC_CO_1014_LDM dm = new MC_CO_1014_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.cd = Util.checkString(req.getParameter("cd"));
		dm.cdnm = Util.checkString(req.getParameter("cdnm"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_CO_1014_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
	}	
	public void mc_co_1030_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_CO_1030_LDataSet ds = null;
		MC_CO_1030_LDM dm = new MC_CO_1030_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.cd = Util.checkString(req.getParameter("cd"));
		dm.cdnm = Util.checkString(req.getParameter("cdnm"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_CO_1030_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_CO_1000EJBHome home = (MC_CO_1000EJBHome)JNDIManager.getInstance().getHome("MC_CO_1000EJB");
			MC_CO_1000EJB ejb = home.create();

			ds = ejb.mc_co_1030_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
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
		dm.cdnm = (String)hash.get("cdnm");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.cd = Util.getSessionParameterValue(req,"cd",true);
		dm.cdnm = Util.getSessionParameterValue(req,"cdnm",true);
		*******************************************************************************************/
	}
}

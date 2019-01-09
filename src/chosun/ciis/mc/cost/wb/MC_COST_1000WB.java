package chosun.ciis.mc.cost.wb;

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

import chosun.ciis.fc.func.ds.FC_FUNC_2051_LDataSet;

import chosun.ciis.mc.cost.dm.*;
import chosun.ciis.mc.cost.ds.*;

public class MC_COST_1000WB extends chosun.ciis.co.base.wb.BaseWB {
	public void mc_cost_1000_m(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_COST_1000_MDataSet ds = null;
		MC_COST_1000_MDM dm = new MC_COST_1000_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_COST_1000_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_COST_1000EJBHome home = (MC_COST_1000EJBHome)JNDIManager.getInstance().getHome("MC_COST_1000EJB");
			MC_COST_1000EJB ejb = home.create();

			ds = ejb.mc_cost_1000_m(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
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
	public void mc_cost_1001_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_COST_1001_LDataSet ds = null;
		MC_COST_1001_LDM dm = new MC_COST_1001_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.like_cd = Util.checkString(req.getParameter("like_cd"));
		dm.cd_val = Util.checkString(req.getParameter("cd_val"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_COST_1001_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_COST_1000EJBHome home = (MC_COST_1000EJBHome)JNDIManager.getInstance().getHome("MC_COST_1000EJB");
			MC_COST_1000EJB ejb = home.create();

			ds = ejb.mc_cost_1001_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
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
		dm.like_cd = (String)hash.get("like_cd");
		dm.cd_val = (String)hash.get("cd_val");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.like_cd = Util.getSessionParameterValue(req,"like_cd",true);
		dm.cd_val = Util.getSessionParameterValue(req,"cd_val",true);
		*******************************************************************************************/
	}
	public void mc_cost_1002_i(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_COST_1002_IDataSet ds = null;
		MC_COST_1002_IDM dm = new MC_COST_1002_IDM();
		
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		
		dm.mode = (String)hash.get("m");
		dm.cd = (String)hash.get("cd");
		dm.cdnm = (String)hash.get("cdnm");
		dm.dept_cd = (String)hash.get("mang_cd_1");
		dm.if_system = (String)hash.get("mang_cd_2");
		dm.yb95 = (String)hash.get("mang_cd_3");

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_COST_1002_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_COST_1000EJBHome home = (MC_COST_1000EJBHome)JNDIManager.getInstance().getHome("MC_COST_1000EJB");
			MC_COST_1000EJB ejb = home.create();

			ds = ejb.mc_cost_1002_i(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
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
		dm.job_clsf = (String)hash.get("job_clsf");
		dm.cd_clsf = (String)hash.get("cd_clsf");
		dm.cd = (String)hash.get("cd");
		dm.cdnm = (String)hash.get("cdnm");
		dm.dept_cd = (String)hash.get("dept_cd");
		dm.if_system = (String)hash.get("if_system");
		dm.yb95 = (String)hash.get("yb95");
		dm.incmg_pers = (String)hash.get("incmg_pers");
		dm.incmg_pers_ipadd = (String)hash.get("incmg_pers_ipadd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.mode = Util.getSessionParameterValue(req,"mode",true);
		dm.job_clsf = Util.getSessionParameterValue(req,"job_clsf",true);
		dm.cd_clsf = Util.getSessionParameterValue(req,"cd_clsf",true);
		dm.cd = Util.getSessionParameterValue(req,"cd",true);
		dm.cdnm = Util.getSessionParameterValue(req,"cdnm",true);
		dm.dept_cd = Util.getSessionParameterValue(req,"dept_cd",true);
		dm.if_system = Util.getSessionParameterValue(req,"if_system",true);
		dm.yb95 = Util.getSessionParameterValue(req,"yb95",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"incmg_pers",true);
		dm.incmg_pers_ipadd = Util.getSessionParameterValue(req,"incmg_pers_ipadd",true);
		*******************************************************************************************/
	}
	public void mc_cost_1003_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_COST_1003_LDataSet ds = null;
		MC_COST_1003_LDM dm = new MC_COST_1003_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.cost_dstb_cd = Util.checkString(req.getParameter("cost_dstb_cd"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_COST_1003_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_COST_1000EJBHome home = (MC_COST_1000EJBHome)JNDIManager.getInstance().getHome("MC_COST_1000EJB");
			MC_COST_1000EJB ejb = home.create();

			ds = ejb.mc_cost_1003_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
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
		dm.cost_dstb_cd = (String)hash.get("cost_dstb_cd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.cost_dstb_cd = Util.getSessionParameterValue(req,"cost_dstb_cd",true);
		*******************************************************************************************/
	}
	public void mc_cost_1004_d(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_COST_1004_DDataSet ds = null;
		MC_COST_1004_DDM dm = new MC_COST_1004_DDM();
		
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.cost_dstb_cd = (String)hash.get("cd");

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_COST_1004_DDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_COST_1000EJBHome home = (MC_COST_1000EJBHome)JNDIManager.getInstance().getHome("MC_COST_1000EJB");
			MC_COST_1000EJB ejb = home.create();

			ds = ejb.mc_cost_1004_d(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
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
		dm.cost_dstb_cd = (String)hash.get("cost_dstb_cd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.cost_dstb_cd = Util.getSessionParameterValue(req,"cost_dstb_cd",true);
		*******************************************************************************************/
	}
	public void mc_cost_1010_m(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_COST_1010_MDataSet ds = null;
		MC_COST_1010_MDM dm = new MC_COST_1010_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_COST_1010_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_COST_1000EJBHome home = (MC_COST_1000EJBHome)JNDIManager.getInstance().getHome("MC_COST_1000EJB");
			MC_COST_1000EJB ejb = home.create();

			ds = ejb.mc_cost_1010_m(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
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
	public void mc_cost_1011_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_COST_1011_LDataSet ds = null;
		MC_COST_1011_LDM dm = new MC_COST_1011_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.dept_cd = Util.checkString(req.getParameter("srch_dept_cd"));
		dm.work_mm = Util.checkString(req.getParameter("work_cym"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_COST_1011_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_COST_1000EJBHome home = (MC_COST_1000EJBHome)JNDIManager.getInstance().getHome("MC_COST_1000EJB");
			MC_COST_1000EJB ejb = home.create();

			ds = ejb.mc_cost_1011_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
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
		dm.dept_cd = (String)hash.get("dept_cd");
		dm.work_mm = (String)hash.get("work_mm");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.dept_cd = Util.getSessionParameterValue(req,"dept_cd",true);
		dm.work_mm = Util.getSessionParameterValue(req,"work_mm",true);
		*******************************************************************************************/
	}
	public void mc_cost_1012_u(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_COST_1012_UDataSet ds = null;
		MC_COST_1012_UDM dm = new MC_COST_1012_UDM();

		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);
		
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		
		dm.cost_dstb_cd = (String)hash.get("cost_dstb_cd");
		dm.cost_dstb_cd_1 = (String)hash.get("cost_dstb_cd_1");
		dm.cost_dstb_cd_2 = (String)hash.get("cost_dstb_cd_2");
		dm.cost_dept_clsf = (String)hash.get("cost_dept_clsf");
		dm.prt_plac_yn = (String)hash.get("prt_plac_yn");
		dm.dept_cd = (String)hash.get("dept_cd");

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_COST_1012_UDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_COST_1000EJBHome home = (MC_COST_1000EJBHome)JNDIManager.getInstance().getHome("MC_COST_1000EJB");
			MC_COST_1000EJB ejb = home.create();

			ds = ejb.mc_cost_1012_u(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
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
		dm.cost_dstb_cd = (String)hash.get("cost_dstb_cd");
		dm.cost_dstb_cd_1 = (String)hash.get("cost_dstb_cd_1");
		dm.cost_dstb_cd_2 = (String)hash.get("cost_dstb_cd_2");
		dm.cost_dept_clsf = (String)hash.get("cost_dept_clsf");
		dm.prt_plac_yn = (String)hash.get("prt_plac_yn");
		dm.incmg_pers = (String)hash.get("incmg_pers");
		dm.dept_cd = (String)hash.get("dept_cd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.cost_dstb_cd = Util.getSessionParameterValue(req,"cost_dstb_cd",true);
		dm.cost_dstb_cd_1 = Util.getSessionParameterValue(req,"cost_dstb_cd_1",true);
		dm.cost_dstb_cd_2 = Util.getSessionParameterValue(req,"cost_dstb_cd_2",true);
		dm.cost_dept_clsf = Util.getSessionParameterValue(req,"cost_dept_clsf",true);
		dm.prt_plac_yn = Util.getSessionParameterValue(req,"prt_plac_yn",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"incmg_pers",true);
		dm.dept_cd = Util.getSessionParameterValue(req,"dept_cd",true);
		*******************************************************************************************/
	}
	public void mc_cost_1013_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_COST_1013_LDataSet ds = null;
		MC_COST_1013_LDM dm = new MC_COST_1013_LDM();

		dm.cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.work_mm = Util.checkString(req.getParameter("work_mm"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_COST_1013_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_COST_1000EJBHome home = (MC_COST_1000EJBHome)JNDIManager.getInstance().getHome("MC_COST_1000EJB");
			MC_COST_1000EJB ejb = home.create();

			ds = ejb.mc_cost_1013_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
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
		dm.dept_cd = (String)hash.get("dept_cd");
		dm.work_mm = (String)hash.get("work_mm");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.dept_cd = Util.getSessionParameterValue(req,"dept_cd",true);
		dm.work_mm = Util.getSessionParameterValue(req,"work_mm",true);
		*******************************************************************************************/
	}
	public void mc_cost_1020_m(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_COST_1020_MDataSet ds = null;
		MC_COST_1020_MDM dm = new MC_COST_1020_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_COST_1020_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_COST_1000EJBHome home = (MC_COST_1000EJBHome)JNDIManager.getInstance().getHome("MC_COST_1000EJB");
			MC_COST_1000EJB ejb = home.create();

			ds = ejb.mc_cost_1020_m(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
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
	public void mc_cost_1021_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_COST_1021_LDataSet ds = null;
		MC_COST_1021_LDM dm = new MC_COST_1021_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.budg_cd = Util.checkString(req.getParameter("srch_budg_cd"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_COST_1021_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_COST_1000EJBHome home = (MC_COST_1000EJBHome)JNDIManager.getInstance().getHome("MC_COST_1000EJB");
			MC_COST_1000EJB ejb = home.create();

			ds = ejb.mc_cost_1021_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
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
	public void mc_cost_1022_u(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_COST_1022_UDataSet ds = null;
		MC_COST_1022_UDM dm = new MC_COST_1022_UDM();
		
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		
		dm.budg_cd = (String)hash.get("budg_cd");
		dm.medi_dstb_cd = (String)hash.get("medi_dstb_cd");
		dm.whco_ndstb_cd = (String)hash.get("whco_ndstb_cd");
		dm.whco_comn_cost_yn = (String)hash.get("whco_comn_cost_yn");
		dm.dtls_medi_dstb_cd = (String)hash.get("dtls_medi_dstb_cd");

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_COST_1022_UDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_COST_1000EJBHome home = (MC_COST_1000EJBHome)JNDIManager.getInstance().getHome("MC_COST_1000EJB");
			MC_COST_1000EJB ejb = home.create();

			ds = ejb.mc_cost_1022_u(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
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
		dm.medi_dstb_cd = (String)hash.get("medi_dstb_cd");
		dm.whco_ndstb_cd = (String)hash.get("whco_ndstb_cd");
		dm.whco_comn_cost_yn = (String)hash.get("whco_comn_cost_yn");
		dm.incmg_pers = (String)hash.get("incmg_pers");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.budg_cd = Util.getSessionParameterValue(req,"budg_cd",true);
		dm.medi_dstb_cd = Util.getSessionParameterValue(req,"medi_dstb_cd",true);
		dm.whco_ndstb_cd = Util.getSessionParameterValue(req,"whco_ndstb_cd",true);
		dm.whco_comn_cost_yn = Util.getSessionParameterValue(req,"whco_comn_cost_yn",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"incmg_pers",true);
		*******************************************************************************************/
	}
	public void mc_cost_1023_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_COST_1023_LDataSet ds = null;
		MC_COST_1023_LDM dm = new MC_COST_1023_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_COST_1023_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_COST_1000EJBHome home = (MC_COST_1000EJBHome)JNDIManager.getInstance().getHome("MC_COST_1000EJB");
			MC_COST_1000EJB ejb = home.create();

			ds = ejb.mc_cost_1023_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
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
	public void mc_cost_1030_m(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_COST_1030_MDataSet ds = null;
		MC_COST_1030_MDM dm = new MC_COST_1030_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_COST_1030_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_COST_1000EJBHome home = (MC_COST_1000EJBHome)JNDIManager.getInstance().getHome("MC_COST_1000EJB");
			MC_COST_1000EJB ejb = home.create();

			ds = ejb.mc_cost_1030_m(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
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
	public void mc_cost_1031_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_COST_1031_LDataSet ds = null;
		MC_COST_1031_LDM dm = new MC_COST_1031_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.budg_cd = Util.checkString(req.getParameter("srch_budg_cd"));
		dm.dept_cd = Util.checkString(req.getParameter("srch_dept_cd"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_COST_1031_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_COST_1000EJBHome home = (MC_COST_1000EJBHome)JNDIManager.getInstance().getHome("MC_COST_1000EJB");
			MC_COST_1000EJB ejb = home.create();

			ds = ejb.mc_cost_1031_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
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
		dm.dept_cd = (String)hash.get("dept_cd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.budg_cd = Util.getSessionParameterValue(req,"budg_cd",true);
		dm.dept_cd = Util.getSessionParameterValue(req,"dept_cd",true);
		*******************************************************************************************/
	}
	public void mc_cost_1032_a(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_COST_1032_ADataSet ds = null;
		MC_COST_1032_ADM dm = new MC_COST_1032_ADM();
		
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		
		dm.mode = (String)hash.get("m");
		dm.dept_cd = (String)hash.get("dept_cd");
		dm.budg_cd = (String)hash.get("budg_cd");
		dm.excp_dstb_cd = (String)hash.get("excp_dstb_cd");

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_COST_1032_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_COST_1000EJBHome home = (MC_COST_1000EJBHome)JNDIManager.getInstance().getHome("MC_COST_1000EJB");
			MC_COST_1000EJB ejb = home.create();

			ds = ejb.mc_cost_1032_a(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
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
		dm.dept_cd = (String)hash.get("dept_cd");
		dm.budg_cd = (String)hash.get("budg_cd");
		dm.excp_dstb_cd = (String)hash.get("excp_dstb_cd");
		dm.incmg_pers_ipadd = (String)hash.get("incmg_pers_ipadd");
		dm.incmg_pers = (String)hash.get("incmg_pers");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.mode = Util.getSessionParameterValue(req,"mode",true);
		dm.dept_cd = Util.getSessionParameterValue(req,"dept_cd",true);
		dm.budg_cd = Util.getSessionParameterValue(req,"budg_cd",true);
		dm.excp_dstb_cd = Util.getSessionParameterValue(req,"excp_dstb_cd",true);
		dm.incmg_pers_ipadd = Util.getSessionParameterValue(req,"incmg_pers_ipadd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"incmg_pers",true);
		*******************************************************************************************/
	}
	public void mc_cost_1033_d(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_COST_1033_DDataSet ds = null;
		MC_COST_1033_DDM dm = new MC_COST_1033_DDM();
		
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		
		dm.dept_cd = (String)hash.get("dept_cd");
		dm.budg_cd = (String)hash.get("budg_cd");

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_COST_1033_DDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_COST_1000EJBHome home = (MC_COST_1000EJBHome)JNDIManager.getInstance().getHome("MC_COST_1000EJB");
			MC_COST_1000EJB ejb = home.create();

			ds = ejb.mc_cost_1033_d(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
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
		dm.dept_cd = (String)hash.get("dept_cd");
		dm.budg_cd = (String)hash.get("budg_cd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.dept_cd = Util.getSessionParameterValue(req,"dept_cd",true);
		dm.budg_cd = Util.getSessionParameterValue(req,"budg_cd",true);
		*******************************************************************************************/
	}
	public void mc_cost_1040_m(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_COST_1040_MDataSet ds = null;
		MC_COST_1040_MDM dm = new MC_COST_1040_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_COST_1040_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_COST_1000EJBHome home = (MC_COST_1000EJBHome)JNDIManager.getInstance().getHome("MC_COST_1000EJB");
			MC_COST_1000EJB ejb = home.create();

			ds = ejb.mc_cost_1040_m(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
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
	public void mc_cost_1041_m(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_COST_1041_MDataSet ds = null;
		MC_COST_1041_MDM dm = new MC_COST_1041_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_COST_1041_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_COST_1000EJBHome home = (MC_COST_1000EJBHome)JNDIManager.getInstance().getHome("MC_COST_1000EJB");
			MC_COST_1000EJB ejb = home.create();

			ds = ejb.mc_cost_1041_m(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
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
	public void mc_cost_1042_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_COST_1042_LDataSet ds = null;
		MC_COST_1042_LDM dm = new MC_COST_1042_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		
		dm.yymm = Util.checkString(req.getParameter("work_cym"));
		dm.cost_clsf = Util.checkString(req.getParameter("cost_clsf"));
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_COST_1042_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_COST_1000EJBHome home = (MC_COST_1000EJBHome)JNDIManager.getInstance().getHome("MC_COST_1000EJB");
			MC_COST_1000EJB ejb = home.create();

			ds = ejb.mc_cost_1042_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
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
		dm.yymm = (String)hash.get("yymm");
		dm.cost_clsf = (String)hash.get("cost_clsf");
		dm.dept_cd = (String)hash.get("dept_cd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.yymm = Util.getSessionParameterValue(req,"yymm",true);
		dm.cost_clsf = Util.getSessionParameterValue(req,"cost_clsf",true);
		dm.dept_cd = Util.getSessionParameterValue(req,"dept_cd",true);
		*******************************************************************************************/
	}
	public void mc_cost_1043_u(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_COST_1043_UDataSet ds = null;
		MC_COST_1043_UDM dm = new MC_COST_1043_UDM();
		
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		
		dm.yymm = Util.checkString(req.getParameter("work_cym"));
		dm.cost_clsf = Util.checkString(req.getParameter("cost_clsf"));
		
		dm.emp_no = (String)hash.get("emp_no");
		dm.dstb_cd = (String)hash.get("emp_cost_dstb_cd");

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_COST_1043_UDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_COST_1000EJBHome home = (MC_COST_1000EJBHome)JNDIManager.getInstance().getHome("MC_COST_1000EJB");
			MC_COST_1000EJB ejb = home.create();

			ds = ejb.mc_cost_1043_u(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
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
		dm.yymm = (String)hash.get("yymm");
		dm.emp_no = (String)hash.get("emp_no");
		dm.dstb_cd = (String)hash.get("dstb_cd");
		dm.incmg_pers = (String)hash.get("incmg_pers");
		dm.cost_clsf = (String)hash.get("cost_clsf");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.yymm = Util.getSessionParameterValue(req,"yymm",true);
		dm.emp_no = Util.getSessionParameterValue(req,"emp_no",true);
		dm.dstb_cd = Util.getSessionParameterValue(req,"dstb_cd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"incmg_pers",true);
		dm.cost_clsf = Util.getSessionParameterValue(req,"cost_clsf",true);
		*******************************************************************************************/
	}
	public void mc_cost_1044_u(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_COST_1044_UDataSet ds = null;
		MC_COST_1044_UDM dm = new MC_COST_1044_UDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		
		dm.yymm = Util.checkString(req.getParameter("work_cym"));
		dm.cd1 = Util.checkString(req.getParameter("cd1"));
		dm.cd2 = Util.checkString(req.getParameter("cd2"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_COST_1044_UDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_COST_1000EJBHome home = (MC_COST_1000EJBHome)JNDIManager.getInstance().getHome("MC_COST_1000EJB");
			MC_COST_1000EJB ejb = home.create();

			ds = ejb.mc_cost_1044_u(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
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
		dm.yymm = (String)hash.get("yymm");
		dm.cd1 = (String)hash.get("cd1");
		dm.cd2 = (String)hash.get("cd2");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.yymm = Util.getSessionParameterValue(req,"yymm",true);
		dm.cd1 = Util.getSessionParameterValue(req,"cd1",true);
		dm.cd2 = Util.getSessionParameterValue(req,"cd2",true);
		*******************************************************************************************/
	}
	public void mc_cost_1045_m(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_COST_1045_MDataSet ds = null;
		MC_COST_1045_MDM dm = new MC_COST_1045_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_COST_1045_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_COST_1000EJBHome home = (MC_COST_1000EJBHome)JNDIManager.getInstance().getHome("MC_COST_1000EJB");
			MC_COST_1000EJB ejb = home.create();

			ds = ejb.mc_cost_1045_m(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
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
	public void mc_cost_1046_m(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_COST_1046_MDataSet ds = null;
		MC_COST_1046_MDM dm = new MC_COST_1046_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.cd = Util.checkString(req.getParameter("cd"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_COST_1046_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_COST_1000EJBHome home = (MC_COST_1000EJBHome)JNDIManager.getInstance().getHome("MC_COST_1000EJB");
			MC_COST_1000EJB ejb = home.create();

			ds = ejb.mc_cost_1046_m(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
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
	public void mc_cost_1047_m(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_COST_1047_MDataSet ds = null;
		MC_COST_1047_MDM dm = new MC_COST_1047_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.dept_cd = Util.checkString(req.getParameter("offi_cd"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_COST_1047_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_COST_1000EJBHome home = (MC_COST_1000EJBHome)JNDIManager.getInstance().getHome("MC_COST_1000EJB");
			MC_COST_1000EJB ejb = home.create();

			ds = ejb.mc_cost_1047_m(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
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
		dm.dept_cd = (String)hash.get("dept_cd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.dept_cd = Util.getSessionParameterValue(req,"dept_cd",true);
		*******************************************************************************************/
	}
	public void getDummyList(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_COST_9999_LDataSet ds = null;
		MC_COST_9999_LDM dm = new MC_COST_9999_LDM();
		
		dm.cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
		
		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_COST_9999_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_COST_1000EJBHome home = (MC_COST_1000EJBHome)JNDIManager.getInstance().getHome("MC_COST_1000EJB");
			MC_COST_1000EJB ejb = home.create();
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
}

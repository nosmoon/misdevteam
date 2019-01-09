package chosun.ciis.mc.budg.wb;

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
import chosun.ciis.mc.budg.dm.*;
import chosun.ciis.mc.budg.ds.*;

public class MC_BUDG_5000WB extends chosun.ciis.co.base.wb.BaseWB {
	public void getDummyList(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_BUDG_9999_LDataSet ds = null;
		MC_BUDG_9999_LDM dm = new MC_BUDG_9999_LDM();
		
		dm.cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
		
		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_BUDG_9999_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_BUDG_5000EJBHome home = (MC_BUDG_5000EJBHome)JNDIManager.getInstance().getHome("MC_BUDG_5000EJB");
			MC_BUDG_5000EJB ejb = home.create();
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
	public void mc_budg_5011_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_BUDG_5011_LDataSet ds = null;
		MC_BUDG_5011_LDM dm = new MC_BUDG_5011_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.budg_yymm = Util.checkString(req.getParameter("budg_yymm"));
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.budg_cd = Util.checkString(req.getParameter("budg_cd"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_BUDG_5011_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_BUDG_5000EJBHome home = (MC_BUDG_5000EJBHome)JNDIManager.getInstance().getHome("MC_BUDG_5000EJB");
			MC_BUDG_5000EJB ejb = home.create();

			ds = ejb.mc_budg_5011_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
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
		dm.budg_yymm = (String)hash.get("budg_yymm");
		dm.dept_cd = (String)hash.get("dept_cd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.budg_yymm = Util.getSessionParameterValue(req,"budg_yymm",true);
		dm.dept_cd = Util.getSessionParameterValue(req,"dept_cd",true);
		*******************************************************************************************/
	}
	public void mc_budg_5031_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_BUDG_5031_LDataSet ds = null;
		MC_BUDG_5031_LDM dm = new MC_BUDG_5031_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.budg_yymm = Util.checkString(req.getParameter("budg_yymm"));
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.evnt_cd_fr = Util.checkString(req.getParameter("evnt_cd_fr"));
		dm.evnt_cd_to = Util.checkString(req.getParameter("evnt_cd_to"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_BUDG_5031_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_BUDG_5000EJBHome home = (MC_BUDG_5000EJBHome)JNDIManager.getInstance().getHome("MC_BUDG_5000EJB");
			MC_BUDG_5000EJB ejb = home.create();

			ds = ejb.mc_budg_5031_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
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
		dm.budg_yymm = (String)hash.get("budg_yymm");
		dm.dept_cd = (String)hash.get("dept_cd");
		dm.evnt_cd_fr = (String)hash.get("evnt_cd_fr");
		dm.evnt_cd_to = (String)hash.get("evnt_cd_to");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.budg_yymm = Util.getSessionParameterValue(req,"budg_yymm",true);
		dm.dept_cd = Util.getSessionParameterValue(req,"dept_cd",true);
		dm.evnt_cd_fr = Util.getSessionParameterValue(req,"evnt_cd_fr",true);
		dm.evnt_cd_to = Util.getSessionParameterValue(req,"evnt_cd_to",true);
		*******************************************************************************************/
	}
	public void mc_budg_5061_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_BUDG_5061_LDataSet ds = null;
		MC_BUDG_5061_LDM dm = new MC_BUDG_5061_LDM();

		dm.cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
		dm.fisc_mm = Util.checkString(req.getParameter("fisc_mm"));
		dm.sort = Util.checkString(req.getParameter("sort"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_BUDG_5061_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_BUDG_5000EJBHome home = (MC_BUDG_5000EJBHome)JNDIManager.getInstance().getHome("MC_BUDG_5000EJB");
			MC_BUDG_5000EJB ejb = home.create();

			ds = ejb.mc_budg_5061_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
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
		dm.sort = (String)hash.get("sort");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.fisc_mm = Util.getSessionParameterValue(req,"fisc_mm",true);
		dm.sort = Util.getSessionParameterValue(req,"sort",true);
		*******************************************************************************************/
	}
	public void mc_budg_5070_m(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_BUDG_5070_MDataSet ds = null;
		MC_BUDG_5070_MDM dm = new MC_BUDG_5070_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.budg_yy = Util.checkString(req.getParameter("budg_yy"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_BUDG_5070_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_BUDG_5000EJBHome home = (MC_BUDG_5000EJBHome)JNDIManager.getInstance().getHome("MC_BUDG_5000EJB");
			MC_BUDG_5000EJB ejb = home.create();

			ds = ejb.mc_budg_5070_m(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
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
		dm.budg_yy = (String)hash.get("budg_yy");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.budg_yy = Util.getSessionParameterValue(req,"budg_yy",true);
		*******************************************************************************************/
	}
	public void mc_budg_5062_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_BUDG_5062_LDataSet ds = null;
		MC_BUDG_5062_LDM dm = new MC_BUDG_5062_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.fisc_mm = Util.checkString(req.getParameter("fisc_mm"));
		dm.sort = Util.checkString(req.getParameter("sort"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_BUDG_5062_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_BUDG_5000EJBHome home = (MC_BUDG_5000EJBHome)JNDIManager.getInstance().getHome("MC_BUDG_5000EJB");
			MC_BUDG_5000EJB ejb = home.create();

			ds = ejb.mc_budg_5062_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
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
		dm.sort = (String)hash.get("sort");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.fisc_mm = Util.getSessionParameterValue(req,"fisc_mm",true);
		dm.sort = Util.getSessionParameterValue(req,"sort",true);
		*******************************************************************************************/
	}
	public void mc_budg_5071_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_BUDG_5071_LDataSet ds = null;
		MC_BUDG_5071_LDM dm = new MC_BUDG_5071_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.cls_len = Util.checkString(req.getParameter("cls_len"));
		dm.cls_zero = Util.checkString(req.getParameter("cls_zero"));
		dm.dept_len = Util.checkString(req.getParameter("dept_len"));
		dm.dept_zero = Util.checkString(req.getParameter("dept_zero"));
		dm.plan_bfr_yymm = Util.checkString(req.getParameter("plan_bfr_yymm"));
		dm.plan_fr_yymm = Util.checkString(req.getParameter("plan_fr_yymm"));
		dm.plan_to_yymm = Util.checkString(req.getParameter("plan_to_yymm"));
		dm.plan_bto_yymm = Util.checkString(req.getParameter("plan_bto_yymm"));
		dm.tms = Util.checkString(req.getParameter("tms"));
		dm.plan_dept_cd = Util.checkString(req.getParameter("plan_dept_cd"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_BUDG_5071_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_BUDG_5000EJBHome home = (MC_BUDG_5000EJBHome)JNDIManager.getInstance().getHome("MC_BUDG_5000EJB");
			MC_BUDG_5000EJB ejb = home.create();

			ds = ejb.mc_budg_5071_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
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
		dm.cls_len = (String)hash.get("cls_len");
		dm.cls_zero = (String)hash.get("cls_zero");
		dm.dept_len = (String)hash.get("dept_len");
		dm.dept_zero = (String)hash.get("dept_zero");
		dm.plan_bfr_yymm = (String)hash.get("plan_bfr_yymm");
		dm.plan_fr_yymm = (String)hash.get("plan_fr_yymm");
		dm.plan_to_yymm = (String)hash.get("plan_to_yymm");
		dm.plan_bto_yymm = (String)hash.get("plan_bto_yymm");
		dm.tms = (String)hash.get("tms");
		dm.plan_dept_cd = (String)hash.get("plan_dept_cd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.cls_len = Util.getSessionParameterValue(req,"cls_len",true);
		dm.cls_zero = Util.getSessionParameterValue(req,"cls_zero",true);
		dm.dept_len = Util.getSessionParameterValue(req,"dept_len",true);
		dm.dept_zero = Util.getSessionParameterValue(req,"dept_zero",true);
		dm.plan_bfr_yymm = Util.getSessionParameterValue(req,"plan_bfr_yymm",true);
		dm.plan_fr_yymm = Util.getSessionParameterValue(req,"plan_fr_yymm",true);
		dm.plan_to_yymm = Util.getSessionParameterValue(req,"plan_to_yymm",true);
		dm.plan_bto_yymm = Util.getSessionParameterValue(req,"plan_bto_yymm",true);
		dm.tms = Util.getSessionParameterValue(req,"tms",true);
		dm.plan_dept_cd = Util.getSessionParameterValue(req,"plan_dept_cd",true);
		*******************************************************************************************/
	}
	public void mc_budg_5151_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_BUDG_5151_LDataSet ds = null;
		MC_BUDG_5151_LDM dm = new MC_BUDG_5151_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.budg_fr_yymm = Util.checkString(req.getParameter("budg_fr_yymm"));
		dm.budg_to_yymm = Util.checkString(req.getParameter("budg_to_yymm"));
		dm.plan_bfr_yymm = Util.checkString(req.getParameter("plan_bfr_yymm"));
		dm.plan_bto_yymm = Util.checkString(req.getParameter("plan_bto_yymm"));
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.cls_cd = Util.checkString(req.getParameter("cls_cd"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_BUDG_5151_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_BUDG_5000EJBHome home = (MC_BUDG_5000EJBHome)JNDIManager.getInstance().getHome("MC_BUDG_5000EJB");
			MC_BUDG_5000EJB ejb = home.create();

			ds = ejb.mc_budg_5151_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
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
		dm.budg_fr_yymm = (String)hash.get("budg_fr_yymm");
		dm.budg_to_yymm = (String)hash.get("budg_to_yymm");
		dm.plan_bfr_yymm = (String)hash.get("plan_bfr_yymm");
		dm.plan_bto_yymm = (String)hash.get("plan_bto_yymm");
		dm.dept_cd = (String)hash.get("dept_cd");
		dm.cls_cd = (String)hash.get("cls_cd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.budg_fr_yymm = Util.getSessionParameterValue(req,"budg_fr_yymm",true);
		dm.budg_to_yymm = Util.getSessionParameterValue(req,"budg_to_yymm",true);
		dm.plan_bfr_yymm = Util.getSessionParameterValue(req,"plan_bfr_yymm",true);
		dm.plan_bto_yymm = Util.getSessionParameterValue(req,"plan_bto_yymm",true);
		dm.dept_cd = Util.getSessionParameterValue(req,"dept_cd",true);
		dm.cls_cd = Util.getSessionParameterValue(req,"cls_cd",true);
		*******************************************************************************************/
	}
	
	public void mc_budg_5020_m(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_BUDG_5020_MDataSet ds = null;
		MC_BUDG_5020_MDM dm = new MC_BUDG_5020_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_BUDG_5020_MDataSet)manager.executeCall(dm);

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
	
	public void mc_budg_5021_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_BUDG_5021_LDataSet ds = null;
		MC_BUDG_5021_LDM dm = new MC_BUDG_5021_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.kind = Util.checkString(req.getParameter("kind"));
		dm.budg_yymm_fr = Util.checkString(req.getParameter("budg_yymm_fr"));
		dm.budg_yymm_to = Util.checkString(req.getParameter("budg_yymm_to"));
		dm.budg_cd_fr = Util.checkString(req.getParameter("budg_cd_fr"));
		dm.budg_cd_to = Util.checkString(req.getParameter("budg_cd_to"));
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.evnt_cd_fr = Util.checkString(req.getParameter("evnt_cd_fr"));
		dm.evnt_cd_to = Util.checkString(req.getParameter("evnt_cd_to"));
		dm.sort = Util.checkString(req.getParameter("sort"));
		dm.dept_len = Util.checkString(req.getParameter("dept_len"));
		dm.dept_zero = Util.checkString(req.getParameter("dept_zero"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_BUDG_5021_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_BUDG_5000EJBHome home = (MC_BUDG_5000EJBHome)JNDIManager.getInstance().getHome("MC_BUDG_5000EJB");
			MC_BUDG_5000EJB ejb = home.create();

			ds = ejb.mc_budg_5021_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
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
		dm.kind = (String)hash.get("kind");
		dm.budg_yymm_fr = (String)hash.get("budg_yymm_fr");
		dm.budg_yymm_to = (String)hash.get("budg_yymm_to");
		dm.budg_cd_fr = (String)hash.get("budg_cd_fr");
		dm.budg_cd_to = (String)hash.get("budg_cd_to");
		dm.dept_cd = (String)hash.get("dept_cd");
		dm.evnt_cd_fr = (String)hash.get("evnt_cd_fr");
		dm.evnt_cd_to = (String)hash.get("evnt_cd_to");
		dm.sort = (String)hash.get("sort");
		dm.dept_len = (String)hash.get("dept_len");
		dm.dept_zero = (String)hash.get("dept_zero");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.kind = Util.getSessionParameterValue(req,"kind",true);
		dm.budg_yymm_fr = Util.getSessionParameterValue(req,"budg_yymm_fr",true);
		dm.budg_yymm_to = Util.getSessionParameterValue(req,"budg_yymm_to",true);
		dm.budg_cd_fr = Util.getSessionParameterValue(req,"budg_cd_fr",true);
		dm.budg_cd_to = Util.getSessionParameterValue(req,"budg_cd_to",true);
		dm.dept_cd = Util.getSessionParameterValue(req,"dept_cd",true);
		dm.evnt_cd_fr = Util.getSessionParameterValue(req,"evnt_cd_fr",true);
		dm.evnt_cd_to = Util.getSessionParameterValue(req,"evnt_cd_to",true);
		dm.sort = Util.getSessionParameterValue(req,"sort",true);
		dm.dept_len = Util.getSessionParameterValue(req,"dept_len",true);
		dm.dept_zero = Util.getSessionParameterValue(req,"dept_zero",true);
		*******************************************************************************************/
	}
	public void mc_budg_5072_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_BUDG_5072_LDataSet ds = null;
		MC_BUDG_5072_LDM dm = new MC_BUDG_5072_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.clam_dept_cd = Util.checkString(req.getParameter("clam_dept_cd"));
		dm.evnt_cd = Util.checkString(req.getParameter("evnt_cd"));
		dm.budg_cd = Util.checkString(req.getParameter("budg_cd"));
		dm.budg_yymm = Util.checkString(req.getParameter("budg_yymm"));
		dm.medi_cd = Util.checkString(req.getParameter("medi_cd"));
		dm.dtls_medi_cd = Util.checkString(req.getParameter("dtls_medi_cd"));
		dm.seq = Util.checkString(req.getParameter("seq"));
		
		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_BUDG_5072_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_BUDG_5000EJBHome home = (MC_BUDG_5000EJBHome)JNDIManager.getInstance().getHome("MC_BUDG_5000EJB");
			MC_BUDG_5000EJB ejb = home.create();

			ds = ejb.mc_budg_5072_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
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
		dm.evnt_cd = (String)hash.get("evnt_cd");
		dm.budg_cd = (String)hash.get("budg_cd");
		dm.budg_yymm = (String)hash.get("budg_yymm");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.clam_dept_cd = Util.getSessionParameterValue(req,"clam_dept_cd",true);
		dm.evnt_cd = Util.getSessionParameterValue(req,"evnt_cd",true);
		dm.budg_cd = Util.getSessionParameterValue(req,"budg_cd",true);
		dm.budg_yymm = Util.getSessionParameterValue(req,"budg_yymm",true);
		*******************************************************************************************/
	}
	
	public void mc_budg_5160_m(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_BUDG_5160_MDataSet ds = null;
		MC_BUDG_5160_MDM dm = new MC_BUDG_5160_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_BUDG_5160_MDataSet)manager.executeCall(dm);

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

	public void mc_budg_5161_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_BUDG_5161_LDataSet ds = null;
		MC_BUDG_5161_LDM dm = new MC_BUDG_5161_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.budg_yymm_fr = Util.checkString(req.getParameter("budg_yymm_fr"));
		dm.budg_yymm_to = Util.checkString(req.getParameter("budg_yymm_to"));
		dm.budg_cd_fr = Util.checkString(req.getParameter("budg_cd_fr"));
		dm.budg_cd_to = Util.checkString(req.getParameter("budg_cd_to"));
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.evnt_cd_fr = Util.checkString(req.getParameter("evnt_cd_fr"));
		dm.evnt_cd_to = Util.checkString(req.getParameter("evnt_cd_to"));
		dm.sort = Util.checkString(req.getParameter("sort"));
		dm.dept_len = Util.checkString(req.getParameter("dept_len"));
		dm.dept_zero = Util.checkString(req.getParameter("dept_zero"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_BUDG_5161_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_BUDG_5000EJBHome home = (MC_BUDG_5000EJBHome)JNDIManager.getInstance().getHome("MC_BUDG_5000EJB");
			MC_BUDG_5000EJB ejb = home.create();

			ds = ejb.mc_budg_5161_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
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
		dm.budg_yymm_fr = (String)hash.get("budg_yymm_fr");
		dm.budg_yymm_to = (String)hash.get("budg_yymm_to");
		dm.budg_cd_fr = (String)hash.get("budg_cd_fr");
		dm.budg_cd_to = (String)hash.get("budg_cd_to");
		dm.dept_cd = (String)hash.get("dept_cd");
		dm.evnt_cd_fr = (String)hash.get("evnt_cd_fr");
		dm.evnt_cd_to = (String)hash.get("evnt_cd_to");
		dm.sort = (String)hash.get("sort");
		dm.dept_len = (String)hash.get("dept_len");
		dm.dept_zero = (String)hash.get("dept_zero");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.budg_yymm_fr = Util.getSessionParameterValue(req,"budg_yymm_fr",true);
		dm.budg_yymm_to = Util.getSessionParameterValue(req,"budg_yymm_to",true);
		dm.budg_cd_fr = Util.getSessionParameterValue(req,"budg_cd_fr",true);
		dm.budg_cd_to = Util.getSessionParameterValue(req,"budg_cd_to",true);
		dm.dept_cd = Util.getSessionParameterValue(req,"dept_cd",true);
		dm.evnt_cd_fr = Util.getSessionParameterValue(req,"evnt_cd_fr",true);
		dm.evnt_cd_to = Util.getSessionParameterValue(req,"evnt_cd_to",true);
		dm.sort = Util.getSessionParameterValue(req,"sort",true);
		dm.dept_len = Util.getSessionParameterValue(req,"dept_len",true);
		dm.dept_zero = Util.getSessionParameterValue(req,"dept_zero",true);
		*******************************************************************************************/
	}

	public void mc_budg_5171_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_BUDG_5171_LDataSet ds = null;
		MC_BUDG_5171_LDM dm = new MC_BUDG_5171_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.budg_yymm = Util.checkString(req.getParameter("budg_yymm"));
		dm.subtot_clsf = Util.checkString(req.getParameter("subtot_clsf"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_BUDG_5171_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_BUDG_5000EJBHome home = (MC_BUDG_5000EJBHome)JNDIManager.getInstance().getHome("MC_BUDG_5000EJB");
			MC_BUDG_5000EJB ejb = home.create();

			ds = ejb.mc_budg_5161_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
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
		dm.budg_yymm_fr = (String)hash.get("budg_yymm_fr");
		dm.budg_yymm_to = (String)hash.get("budg_yymm_to");
		dm.budg_cd_fr = (String)hash.get("budg_cd_fr");
		dm.budg_cd_to = (String)hash.get("budg_cd_to");
		dm.dept_cd = (String)hash.get("dept_cd");
		dm.evnt_cd_fr = (String)hash.get("evnt_cd_fr");
		dm.evnt_cd_to = (String)hash.get("evnt_cd_to");
		dm.sort = (String)hash.get("sort");
		dm.dept_len = (String)hash.get("dept_len");
		dm.dept_zero = (String)hash.get("dept_zero");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.budg_yymm_fr = Util.getSessionParameterValue(req,"budg_yymm_fr",true);
		dm.budg_yymm_to = Util.getSessionParameterValue(req,"budg_yymm_to",true);
		dm.budg_cd_fr = Util.getSessionParameterValue(req,"budg_cd_fr",true);
		dm.budg_cd_to = Util.getSessionParameterValue(req,"budg_cd_to",true);
		dm.dept_cd = Util.getSessionParameterValue(req,"dept_cd",true);
		dm.evnt_cd_fr = Util.getSessionParameterValue(req,"evnt_cd_fr",true);
		dm.evnt_cd_to = Util.getSessionParameterValue(req,"evnt_cd_to",true);
		dm.sort = Util.getSessionParameterValue(req,"sort",true);
		dm.dept_len = Util.getSessionParameterValue(req,"dept_len",true);
		dm.dept_zero = Util.getSessionParameterValue(req,"dept_zero",true);
		*******************************************************************************************/
	}

	public void mc_budg_5172_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_BUDG_5172_LDataSet ds = null;
		MC_BUDG_5172_LDM dm = new MC_BUDG_5172_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.budg_yy = Util.checkString(req.getParameter("budg_yy"));
		dm.subtot_clsf = Util.checkString(req.getParameter("subtot_clsf"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_BUDG_5172_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_BUDG_5000EJBHome home = (MC_BUDG_5000EJBHome)JNDIManager.getInstance().getHome("MC_BUDG_5000EJB");
			MC_BUDG_5000EJB ejb = home.create();

			ds = ejb.mc_budg_5161_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
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
		dm.budg_yymm_fr = (String)hash.get("budg_yymm_fr");
		dm.budg_yymm_to = (String)hash.get("budg_yymm_to");
		dm.budg_cd_fr = (String)hash.get("budg_cd_fr");
		dm.budg_cd_to = (String)hash.get("budg_cd_to");
		dm.dept_cd = (String)hash.get("dept_cd");
		dm.evnt_cd_fr = (String)hash.get("evnt_cd_fr");
		dm.evnt_cd_to = (String)hash.get("evnt_cd_to");
		dm.sort = (String)hash.get("sort");
		dm.dept_len = (String)hash.get("dept_len");
		dm.dept_zero = (String)hash.get("dept_zero");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.budg_yymm_fr = Util.getSessionParameterValue(req,"budg_yymm_fr",true);
		dm.budg_yymm_to = Util.getSessionParameterValue(req,"budg_yymm_to",true);
		dm.budg_cd_fr = Util.getSessionParameterValue(req,"budg_cd_fr",true);
		dm.budg_cd_to = Util.getSessionParameterValue(req,"budg_cd_to",true);
		dm.dept_cd = Util.getSessionParameterValue(req,"dept_cd",true);
		dm.evnt_cd_fr = Util.getSessionParameterValue(req,"evnt_cd_fr",true);
		dm.evnt_cd_to = Util.getSessionParameterValue(req,"evnt_cd_to",true);
		dm.sort = Util.getSessionParameterValue(req,"sort",true);
		dm.dept_len = Util.getSessionParameterValue(req,"dept_len",true);
		dm.dept_zero = Util.getSessionParameterValue(req,"dept_zero",true);
		*******************************************************************************************/
	}
	
	public void mc_budg_5173_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_BUDG_5173_LDataSet ds = null;
		MC_BUDG_5173_LDM dm = new MC_BUDG_5173_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.budg_yy = Util.checkString(req.getParameter("budg_yy"));
		dm.subtot_clsf = Util.checkString(req.getParameter("subtot_clsf"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_BUDG_5173_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		
	}
	

	public void mc_budg_5043_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_BUDG_5043_LDataSet ds = null;
		MC_BUDG_5043_LDM dm = new MC_BUDG_5043_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.from_yymm = Util.checkString(req.getParameter("from_yymm"));
		dm.to_yymm = Util.checkString(req.getParameter("to_yymm"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_BUDG_5043_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_BUDG_5000EJBHome home = (MC_BUDG_5000EJBHome)JNDIManager.getInstance().getHome("MC_BUDG_5000EJB");
			MC_BUDG_5000EJB ejb = home.create();

			ds = ejb.mc_budg_5043_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
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
		dm.from_yymm = (String)hash.get("from_yymm");
		dm.to_yymm = (String)hash.get("to_yymm");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.dept_cd = Util.getSessionParameterValue(req,"dept_cd",true);
		dm.from_yymm = Util.getSessionParameterValue(req,"from_yymm",true);
		dm.to_yymm = Util.getSessionParameterValue(req,"to_yymm",true);
		*******************************************************************************************/
	}
	
	public void mc_budg_5098_m(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_BUDG_5098_MDataSet ds = null;
		MC_BUDG_5098_MDM dm = new MC_BUDG_5098_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.yyyy = Util.checkString(req.getParameter("yyyy"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_BUDG_5098_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_BUDG_5000EJBHome home = (MC_BUDG_5000EJBHome)JNDIManager.getInstance().getHome("MC_BUDG_5000EJB");
			MC_BUDG_5000EJB ejb = home.create();

			ds = ejb.mc_budg_5098_m(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
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
		dm.yyyy = (String)hash.get("yyyy");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.yyyy = Util.getSessionParameterValue(req,"yyyy",true);
		*******************************************************************************************/
	}
	
	public void mc_budg_5180_m(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_BUDG_5180_MDataSet ds = null;
		MC_BUDG_5180_MDM dm = new MC_BUDG_5180_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_BUDG_5180_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
	}
	
	public void mc_budg_5181_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_BUDG_5181_LDataSet ds = null;
		MC_BUDG_5181_LDM dm = new MC_BUDG_5181_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.budg_yymm = Util.checkString(req.getParameter("budg_yymm"));
		dm.subtot_clsf = Util.checkString(req.getParameter("subtot_clsf"));
		dm.medi_cd = Util.checkString(req.getParameter("medi_cd"));
		dm.dtls_medi_cd = Util.checkString(req.getParameter("dtls_medi_cd"));
		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_BUDG_5181_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
	}

	
}

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

public class MC_BUDG_4000WB extends chosun.ciis.co.base.wb.BaseWB {
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
			MC_BUDG_4000EJBHome home = (MC_BUDG_4000EJBHome)JNDIManager.getInstance().getHome("MC_BUDG_4000EJB");
			MC_BUDG_4000EJB ejb = home.create();
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
	
	public void mc_budg_4030_m(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_BUDG_4030_MDataSet ds = null;
		MC_BUDG_4030_MDM dm = new MC_BUDG_4030_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.work_dt = Util.checkString(req.getParameter("work_dt"));
		dm.clsf_cd = Util.checkString(req.getParameter("clsf_cd"));
		dm.crte_clsf = Util.checkString(req.getParameter("crte_clsf"));
		dm.hsty_no = Util.checkString(req.getParameter("hsty_no"));
		dm.kind = Util.checkString(req.getParameter("kind"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_BUDG_4030_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_BUDG_4000EJBHome home = (MC_BUDG_4000EJBHome)JNDIManager.getInstance().getHome("MC_BUDG_4000EJB");
			MC_BUDG_4000EJB ejb = home.create();

			ds = ejb.mc_budg_4030_m(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		EJB 수정전 끝 */
		

		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.work_dt = (String)hash.get("work_dt");
		dm.clsf_cd = (String)hash.get("clsf_cd");
		dm.crte_clsf = (String)hash.get("crte_clsf");
		dm.hsty_no = (String)hash.get("hsty_no");
		dm.kind = (String)hash.get("kind");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.work_dt = Util.getSessionParameterValue(req,"work_dt",true);
		dm.clsf_cd = Util.getSessionParameterValue(req,"clsf_cd",true);
		dm.crte_clsf = Util.getSessionParameterValue(req,"crte_clsf",true);
		dm.hsty_no = Util.getSessionParameterValue(req,"hsty_no",true);
		dm.kind = Util.getSessionParameterValue(req,"kind",true);
		*******************************************************************************************/
	}
	
	public void mc_budg_4031_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_BUDG_4031_LDataSet ds = null;
		MC_BUDG_4031_LDM dm = new MC_BUDG_4031_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.budg_dt_fr = Util.checkString(req.getParameter("budg_dt_fr"));
		dm.budg_dt_to = Util.checkString(req.getParameter("budg_dt_to"));
		dm.clsf_cd_fr = Util.checkString(req.getParameter("clsf_cd_fr"));
		dm.budg_fr = Util.checkString(req.getParameter("budg_fr"));
		dm.budg_to = Util.checkString(req.getParameter("budg_to"));
		dm.dept_fr = Util.checkString(req.getParameter("dept_fr"));
		dm.dept_to = Util.checkString(req.getParameter("dept_to"));
		dm.clsf_cd_to = Util.checkString(req.getParameter("clsf_cd_to"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_BUDG_4031_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_BUDG_4000EJBHome home = (MC_BUDG_4000EJBHome)JNDIManager.getInstance().getHome("MC_BUDG_4000EJB");
			MC_BUDG_4000EJB ejb = home.create();

			ds = ejb.mc_budg_4031_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		EJB 수정전 끝 */

		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.budg_dt_fr = (String)hash.get("budg_dt_fr");
		dm.budg_dt_to = (String)hash.get("budg_dt_to");
		dm.clsf_cd_fr = (String)hash.get("clsf_cd_fr");
		dm.budg_fr = (String)hash.get("budg_fr");
		dm.budg_to = (String)hash.get("budg_to");
		dm.dept_fr = (String)hash.get("dept_fr");
		dm.dept_to = (String)hash.get("dept_to");
		dm.clsf_cd_to = (String)hash.get("clsf_cd_to");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.budg_dt_fr = Util.getSessionParameterValue(req,"budg_dt_fr",true);
		dm.budg_dt_to = Util.getSessionParameterValue(req,"budg_dt_to",true);
		dm.clsf_cd_fr = Util.getSessionParameterValue(req,"clsf_cd_fr",true);
		dm.budg_fr = Util.getSessionParameterValue(req,"budg_fr",true);
		dm.budg_to = Util.getSessionParameterValue(req,"budg_to",true);
		dm.dept_fr = Util.getSessionParameterValue(req,"dept_fr",true);
		dm.dept_to = Util.getSessionParameterValue(req,"dept_to",true);
		dm.clsf_cd_to = Util.getSessionParameterValue(req,"clsf_cd_to",true);
		*******************************************************************************************/
	}
	
	public void mc_budg_4032_m(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_BUDG_4032_MDataSet ds = null;
		MC_BUDG_4032_MDM dm = new MC_BUDG_4032_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_BUDG_4032_MDataSet)manager.executeCall(dm);

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
	
	public void mc_budg_4041_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_BUDG_4041_LDataSet ds = null;
		MC_BUDG_4041_LDM dm = new MC_BUDG_4041_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.budg_yymm_fr = Util.checkString(req.getParameter("budg_yymm_fr"));
		dm.budg_yymm_to = Util.checkString(req.getParameter("budg_yymm_to"));
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.evnt_cd_fr = Util.checkString(req.getParameter("evnt_cd_fr"));
		dm.evnt_cd_to = Util.checkString(req.getParameter("evnt_cd_to"));
		dm.sql = Util.checkString(req.getParameter("sql"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_BUDG_4041_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/* EJB 수정전 시작
		try {
			MC_BUDG_4000EJBHome home = (MC_BUDG_4000EJBHome)JNDIManager.getInstance().getHome("MC_BUDG_4000EJB");
			MC_BUDG_4000EJB ejb = home.create();

			ds = ejb.mc_budg_4041_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
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
		dm.dept_cd = (String)hash.get("dept_cd");
		dm.evnt_cd_fr = (String)hash.get("evnt_cd_fr");
		dm.evnt_cd_to = (String)hash.get("evnt_cd_to");
		dm.sql = (String)hash.get("sql");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.budg_yymm_fr = Util.getSessionParameterValue(req,"budg_yymm_fr",true);
		dm.budg_yymm_to = Util.getSessionParameterValue(req,"budg_yymm_to",true);
		dm.dept_cd = Util.getSessionParameterValue(req,"dept_cd",true);
		dm.evnt_cd_fr = Util.getSessionParameterValue(req,"evnt_cd_fr",true);
		dm.evnt_cd_to = Util.getSessionParameterValue(req,"evnt_cd_to",true);
		dm.sql = Util.getSessionParameterValue(req,"sql",true);
		*******************************************************************************************/
	}
	
	public void mc_budg_4042_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_BUDG_4042_LDataSet ds = null;
		MC_BUDG_4042_LDM dm = new MC_BUDG_4042_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.amt_clsf = Util.checkString(req.getParameter("amt_clsf"));
		dm.budg_yymm_fr = Util.checkString(req.getParameter("budg_yymm_fr"));
		dm.budg_yymm_to = Util.checkString(req.getParameter("budg_yymm_to"));
		dm.budg_cd = Util.checkString(req.getParameter("budg_cd"));
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.evnt_cd = Util.checkString(req.getParameter("evnt_cd"));
		dm.sql = Util.checkString(req.getParameter("sql"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_BUDG_4042_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_BUDG_4000EJBHome home = (MC_BUDG_4000EJBHome)JNDIManager.getInstance().getHome("MC_BUDG_4000EJB");
			MC_BUDG_4000EJB ejb = home.create();

			ds = ejb.mc_budg_4042_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		EJB 수정전 끝 */

		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.amt_clsf = (String)hash.get("amt_clsf");
		dm.budg_yymm_fr = (String)hash.get("budg_yymm_fr");
		dm.budg_yymm_to = (String)hash.get("budg_yymm_to");
		dm.budg_cd = (String)hash.get("budg_cd");
		dm.dept_cd = (String)hash.get("dept_cd");
		dm.evnt_cd = (String)hash.get("evnt_cd");
		dm.sql = (String)hash.get("sql");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.amt_clsf = Util.getSessionParameterValue(req,"amt_clsf",true);
		dm.budg_yymm_fr = Util.getSessionParameterValue(req,"budg_yymm_fr",true);
		dm.budg_yymm_to = Util.getSessionParameterValue(req,"budg_yymm_to",true);
		dm.budg_cd = Util.getSessionParameterValue(req,"budg_cd",true);
		dm.dept_cd = Util.getSessionParameterValue(req,"dept_cd",true);
		dm.evnt_cd = Util.getSessionParameterValue(req,"evnt_cd",true);
		dm.sql = Util.getSessionParameterValue(req,"sql",true);
		*******************************************************************************************/
	}
	
	public void mc_budg_4070_m(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_BUDG_4070_MDataSet ds = null;
		MC_BUDG_4070_MDM dm = new MC_BUDG_4070_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		
		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_BUDG_4070_MDataSet)manager.executeCall(dm);

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

	public void mc_budg_4071_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_BUDG_4071_LDataSet ds = null;
		MC_BUDG_4071_LDM dm = new MC_BUDG_4071_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.date_fr = Util.checkString(req.getParameter("date_fr"));
		dm.date_to = Util.checkString(req.getParameter("date_to"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_BUDG_4071_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_BUDG_4000EJBHome home = (MC_BUDG_4000EJBHome)JNDIManager.getInstance().getHome("MC_BUDG_4000EJB");
			MC_BUDG_4000EJB ejb = home.create();

			ds = ejb.mc_budg_4071_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		EJB 수정전 끝 */

		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.date_fr = (String)hash.get("date_fr");
		dm.date_to = (String)hash.get("date_to");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.date_fr = Util.getSessionParameterValue(req,"date_fr",true);
		dm.date_to = Util.getSessionParameterValue(req,"date_to",true);
		*******************************************************************************************/
	}
	
	public void mc_budg_4072_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_BUDG_4072_LDataSet ds = null;
		MC_BUDG_4072_LDM dm = new MC_BUDG_4072_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.date_fr = Util.checkString(req.getParameter("date_fr"));
		dm.date_to = Util.checkString(req.getParameter("date_to"));
		dm.dept_fr = Util.checkString(req.getParameter("dept_fr"));
		dm.dept_to = Util.checkString(req.getParameter("dept_to"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_BUDG_4072_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_BUDG_4000EJBHome home = (MC_BUDG_4000EJBHome)JNDIManager.getInstance().getHome("MC_BUDG_4000EJB");
			MC_BUDG_4000EJB ejb = home.create();

			ds = ejb.mc_budg_4072_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		EJB 수정전 끝 */

		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.date_fr = (String)hash.get("date_fr");
		dm.date_to = (String)hash.get("date_to");
		dm.dept_fr = (String)hash.get("dept_fr");
		dm.dept_to = (String)hash.get("dept_to");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.date_fr = Util.getSessionParameterValue(req,"date_fr",true);
		dm.date_to = Util.getSessionParameterValue(req,"date_to",true);
		dm.dept_fr = Util.getSessionParameterValue(req,"dept_fr",true);
		dm.dept_to = Util.getSessionParameterValue(req,"dept_to",true);
		*******************************************************************************************/
	}
	public void mc_budg_4073_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_BUDG_4073_LDataSet ds = null;
		MC_BUDG_4073_LDM dm = new MC_BUDG_4073_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.date_fr = Util.checkString(req.getParameter("date_fr"));
		dm.date_to = Util.checkString(req.getParameter("date_to"));
		dm.dept_fr = Util.checkString(req.getParameter("dept_fr"));
		dm.dept_to = Util.checkString(req.getParameter("dept_to"));
		dm.clsf_cd = Util.checkString(req.getParameter("clsf_cd"));
		dm.crte_clsf = Util.checkString(req.getParameter("crte_clsf"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_BUDG_4073_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_BUDG_4000EJBHome home = (MC_BUDG_4000EJBHome)JNDIManager.getInstance().getHome("MC_BUDG_4000EJB");
			MC_BUDG_4000EJB ejb = home.create();

			ds = ejb.mc_budg_4073_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		EJB 수정전 끝 */

		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.date_fr = (String)hash.get("date_fr");
		dm.date_to = (String)hash.get("date_to");
		dm.dept_fr = (String)hash.get("dept_fr");
		dm.dept_to = (String)hash.get("dept_to");
		dm.clsf_cd = (String)hash.get("clsf_cd");
		dm.crte_clsf = (String)hash.get("crte_clsf");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.date_fr = Util.getSessionParameterValue(req,"date_fr",true);
		dm.date_to = Util.getSessionParameterValue(req,"date_to",true);
		dm.dept_fr = Util.getSessionParameterValue(req,"dept_fr",true);
		dm.dept_to = Util.getSessionParameterValue(req,"dept_to",true);
		dm.clsf_cd = Util.getSessionParameterValue(req,"clsf_cd",true);
		dm.crte_clsf = Util.getSessionParameterValue(req,"crte_clsf",true);
		*******************************************************************************************/
	}
	public void mc_budg_4074_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_BUDG_4074_LDataSet ds = null;
		MC_BUDG_4074_LDM dm = new MC_BUDG_4074_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.date_fr = Util.checkString(req.getParameter("date_fr"));
		dm.date_to = Util.checkString(req.getParameter("date_to"));
		dm.dept_fr = Util.checkString(req.getParameter("dept_fr"));
		dm.dept_to = Util.checkString(req.getParameter("dept_to"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_BUDG_4074_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_BUDG_4000EJBHome home = (MC_BUDG_4000EJBHome)JNDIManager.getInstance().getHome("MC_BUDG_4000EJB");
			MC_BUDG_4000EJB ejb = home.create();

			ds = ejb.mc_budg_4074_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		EJB 수정전 끝 */

		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.date_fr = (String)hash.get("date_fr");
		dm.date_to = (String)hash.get("date_to");
		dm.dept_fr = (String)hash.get("dept_fr");
		dm.dept_to = (String)hash.get("dept_to");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.date_fr = Util.getSessionParameterValue(req,"date_fr",true);
		dm.date_to = Util.getSessionParameterValue(req,"date_to",true);
		dm.dept_fr = Util.getSessionParameterValue(req,"dept_fr",true);
		dm.dept_to = Util.getSessionParameterValue(req,"dept_to",true);
		*******************************************************************************************/
	}
	public void mc_budg_4075_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_BUDG_4075_LDataSet ds = null;
		MC_BUDG_4075_LDM dm = new MC_BUDG_4075_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.date_fr = Util.checkString(req.getParameter("date_fr"));
		dm.date_to = Util.checkString(req.getParameter("date_to"));
		dm.dept_fr = Util.checkString(req.getParameter("dept_fr"));
		dm.dept_to = Util.checkString(req.getParameter("dept_to"));
		dm.clsf_cd = Util.checkString(req.getParameter("clsf_cd"));
		dm.crte_clsf = Util.checkString(req.getParameter("crte_clsf"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_BUDG_4075_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_BUDG_4000EJBHome home = (MC_BUDG_4000EJBHome)JNDIManager.getInstance().getHome("MC_BUDG_4000EJB");
			MC_BUDG_4000EJB ejb = home.create();

			ds = ejb.mc_budg_4075_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		EJB 수정전 끝 */

		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.date_fr = (String)hash.get("date_fr");
		dm.date_to = (String)hash.get("date_to");
		dm.dept_fr = (String)hash.get("dept_fr");
		dm.dept_to = (String)hash.get("dept_to");
		dm.clsf_cd = (String)hash.get("clsf_cd");
		dm.crte_clsf = (String)hash.get("crte_clsf");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.date_fr = Util.getSessionParameterValue(req,"date_fr",true);
		dm.date_to = Util.getSessionParameterValue(req,"date_to",true);
		dm.dept_fr = Util.getSessionParameterValue(req,"dept_fr",true);
		dm.dept_to = Util.getSessionParameterValue(req,"dept_to",true);
		dm.clsf_cd = Util.getSessionParameterValue(req,"clsf_cd",true);
		dm.crte_clsf = Util.getSessionParameterValue(req,"crte_clsf",true);
		*******************************************************************************************/
	}
	
	public void mc_budg_4080_m(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_BUDG_4080_MDataSet ds = null;
		MC_BUDG_4080_MDM dm = new MC_BUDG_4080_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_BUDG_4080_MDataSet)manager.executeCall(dm);

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
	
	public void mc_budg_4081_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_BUDG_4081_LDataSet ds = null;
		MC_BUDG_4081_LDM dm = new MC_BUDG_4081_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.evnt_cd = Util.checkString(req.getParameter("evnt_cd"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_BUDG_4081_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_BUDG_4000EJBHome home = (MC_BUDG_4000EJBHome)JNDIManager.getInstance().getHome("MC_BUDG_4000EJB");
			MC_BUDG_4000EJB ejb = home.create();

			ds = ejb.mc_budg_4081_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		EJB 수정전 끝 */

		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.evnt_cd = (String)hash.get("evnt_cd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.evnt_cd = Util.getSessionParameterValue(req,"evnt_cd",true);
		*******************************************************************************************/
	}
	public void mc_budg_4082_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_BUDG_4082_LDataSet ds = null;
		MC_BUDG_4082_LDM dm = new MC_BUDG_4082_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.evnt_cd = Util.checkString(req.getParameter("evnt_cd"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_BUDG_4082_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_BUDG_4000EJBHome home = (MC_BUDG_4000EJBHome)JNDIManager.getInstance().getHome("MC_BUDG_4000EJB");
			MC_BUDG_4000EJB ejb = home.create();

			ds = ejb.mc_budg_4082_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		EJB 수정전 끝 */

		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.evnt_cd = (String)hash.get("evnt_cd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.evnt_cd = Util.getSessionParameterValue(req,"evnt_cd",true);
		*******************************************************************************************/
	}
	public void mc_budg_4083_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_BUDG_4083_LDataSet ds = null;
		MC_BUDG_4083_LDM dm = new MC_BUDG_4083_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.evnt_cd = Util.checkString(req.getParameter("evnt_cd"));
		dm.clas_cd1 = Util.checkString(req.getParameter("clas_cd1"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_BUDG_4083_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_BUDG_4000EJBHome home = (MC_BUDG_4000EJBHome)JNDIManager.getInstance().getHome("MC_BUDG_4000EJB");
			MC_BUDG_4000EJB ejb = home.create();

			ds = ejb.mc_budg_4083_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		EJB 수정전 끝 */

		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.evnt_cd = (String)hash.get("evnt_cd");
		dm.clas_cd1 = (String)hash.get("clas_cd1");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.evnt_cd = Util.getSessionParameterValue(req,"evnt_cd",true);
		dm.clas_cd1 = Util.getSessionParameterValue(req,"clas_cd1",true);
		*******************************************************************************************/
	}
	public void mc_budg_4060_m(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_BUDG_4060_MDataSet ds = null;
		MC_BUDG_4060_MDM dm = new MC_BUDG_4060_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		
		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_BUDG_4060_MDataSet)manager.executeCall(dm);

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
	
	public void mc_budg_4061_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_BUDG_4061_LDataSet ds = null;
		MC_BUDG_4061_LDM dm = new MC_BUDG_4061_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.yymm = Util.checkString(req.getParameter("yymm"));
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.evnt_cd = Util.checkString(req.getParameter("evnt_cd"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_BUDG_4061_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_BUDG_4000EJBHome home = (MC_BUDG_4000EJBHome)JNDIManager.getInstance().getHome("MC_BUDG_4000EJB");
			MC_BUDG_4000EJB ejb = home.create();

			ds = ejb.mc_budg_4061_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
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
		dm.dept_cd = (String)hash.get("dept_cd");
		dm.evnt_cd = (String)hash.get("evnt_cd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.yymm = Util.getSessionParameterValue(req,"yymm",true);
		dm.dept_cd = Util.getSessionParameterValue(req,"dept_cd",true);
		dm.evnt_cd = Util.getSessionParameterValue(req,"evnt_cd",true);
		*******************************************************************************************/
	}
	public void mc_budg_4062_i(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_BUDG_4062_IDataSet ds = null;
		MC_BUDG_4062_IDM dm = new MC_BUDG_4062_IDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.yymm_fr = Util.checkString(req.getParameter("yymm_fr"));
		dm.yymm_to = Util.checkString(req.getParameter("yymm_to"));
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.evnt_cd = Util.checkString(req.getParameter("evnt_cd"));
		dm.crte_clsf = Util.checkString(req.getParameter("crte_clsf"));
		dm.work_dt = Util.checkString(req.getParameter("work_dt"));
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.incmg_pers_ipadd = req.getRemoteAddr();

		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);
		
		dm.budg_cd = (String)hash.get("budg_cd");
		dm.amt_fr = (String)hash.get("amt_fr");
		dm.rate = (String)hash.get("rate");
		
		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_BUDG_4062_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_BUDG_4000EJBHome home = (MC_BUDG_4000EJBHome)JNDIManager.getInstance().getHome("MC_BUDG_4000EJB");
			MC_BUDG_4000EJB ejb = home.create();

			ds = ejb.mc_budg_4062_i(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		EJB 수정전 끝 */

		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.yymm_fr = (String)hash.get("yymm_fr");
		dm.yymm_to = (String)hash.get("yymm_to");
		dm.dept_cd = (String)hash.get("dept_cd");
		dm.evnt_cd = (String)hash.get("evnt_cd");
		dm.budg_cd = (String)hash.get("budg_cd");
		dm.amt_fr = (String)hash.get("amt_fr");
		dm.rate = (String)hash.get("rate");
		dm.crte_clsf = (String)hash.get("crte_clsf");
		dm.work_dt = (String)hash.get("work_dt");
		dm.incmg_pers = (String)hash.get("incmg_pers");
		dm.incmg_pers_ipadd = (String)hash.get("incmg_pers_ipadd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.yymm_fr = Util.getSessionParameterValue(req,"yymm_fr",true);
		dm.yymm_to = Util.getSessionParameterValue(req,"yymm_to",true);
		dm.dept_cd = Util.getSessionParameterValue(req,"dept_cd",true);
		dm.evnt_cd = Util.getSessionParameterValue(req,"evnt_cd",true);
		dm.budg_cd = Util.getSessionParameterValue(req,"budg_cd",true);
		dm.amt_fr = Util.getSessionParameterValue(req,"amt_fr",true);
		dm.rate = Util.getSessionParameterValue(req,"rate",true);
		dm.crte_clsf = Util.getSessionParameterValue(req,"crte_clsf",true);
		dm.work_dt = Util.getSessionParameterValue(req,"work_dt",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"incmg_pers",true);
		dm.incmg_pers_ipadd = Util.getSessionParameterValue(req,"incmg_pers_ipadd",true);
		*******************************************************************************************/
	}
	public void mc_budg_4063_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_BUDG_4063_LDataSet ds = null;
		MC_BUDG_4063_LDM dm = new MC_BUDG_4063_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.yymm = Util.checkString(req.getParameter("yymm"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_BUDG_4063_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_BUDG_4000EJBHome home = (MC_BUDG_4000EJBHome)JNDIManager.getInstance().getHome("MC_BUDG_4000EJB");
			MC_BUDG_4000EJB ejb = home.create();

			ds = ejb.mc_budg_4063_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
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
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.yymm = Util.getSessionParameterValue(req,"yymm",true);
		*******************************************************************************************/
	}
	
	public void mc_budg_4000_m(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_BUDG_4000_MDataSet ds = null;
		MC_BUDG_4000_MDM dm = new MC_BUDG_4000_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_BUDG_4000_MDataSet)manager.executeCall(dm);

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
	
	public void mc_budg_4001_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_BUDG_4001_LDataSet ds = null;
		MC_BUDG_4001_LDM dm = new MC_BUDG_4001_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.budg_yymm_fr = Util.checkString(req.getParameter("budg_yymm_fr"));
		dm.budg_yymm_to = Util.checkString(req.getParameter("budg_yymm_to"));
		dm.budg_cd_fr = Util.checkString(req.getParameter("budg_cd_fr"));
		dm.budg_cd_to = Util.checkString(req.getParameter("budg_cd_to"));
		dm.dept_cd_fr = Util.checkString(req.getParameter("dept_cd_fr"));
		dm.dept_cd_to = Util.checkString(req.getParameter("dept_cd_to"));
		dm.evnt_cd_fr = Util.checkString(req.getParameter("evnt_cd_fr"));
		dm.evnt_cd_to = Util.checkString(req.getParameter("evnt_cd_to"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_BUDG_4001_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_BUDG_4000EJBHome home = (MC_BUDG_4000EJBHome)JNDIManager.getInstance().getHome("MC_BUDG_4000EJB");
			MC_BUDG_4000EJB ejb = home.create();

			ds = ejb.mc_budg_4001_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
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
		dm.dept_cd_fr = (String)hash.get("dept_cd_fr");
		dm.dept_cd_to = (String)hash.get("dept_cd_to");
		dm.evnt_cd_fr = (String)hash.get("evnt_cd_fr");
		dm.evnt_cd_to = (String)hash.get("evnt_cd_to");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.budg_yymm_fr = Util.getSessionParameterValue(req,"budg_yymm_fr",true);
		dm.budg_yymm_to = Util.getSessionParameterValue(req,"budg_yymm_to",true);
		dm.budg_cd_fr = Util.getSessionParameterValue(req,"budg_cd_fr",true);
		dm.budg_cd_to = Util.getSessionParameterValue(req,"budg_cd_to",true);
		dm.dept_cd_fr = Util.getSessionParameterValue(req,"dept_cd_fr",true);
		dm.dept_cd_to = Util.getSessionParameterValue(req,"dept_cd_to",true);
		dm.evnt_cd_fr = Util.getSessionParameterValue(req,"evnt_cd_fr",true);
		dm.evnt_cd_to = Util.getSessionParameterValue(req,"evnt_cd_to",true);
		*******************************************************************************************/
	}
	
	public void mc_budg_4002_e(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_BUDG_4002_EDataSet ds = null;
		MC_BUDG_4002_EDM dm = new MC_BUDG_4002_EDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.kind = Util.checkString(req.getParameter("kind"));
		dm.budg_yymm = Util.checkString(req.getParameter("budg_yymm"));
		dm.clsf_cd = Util.checkString(req.getParameter("clsf_cd"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_BUDG_4002_EDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_BUDG_4000EJBHome home = (MC_BUDG_4000EJBHome)JNDIManager.getInstance().getHome("MC_BUDG_4000EJB");
			MC_BUDG_4000EJB ejb = home.create();

			ds = ejb.mc_budg_4002_e(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
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
		dm.budg_yymm = (String)hash.get("budg_yymm");
		dm.clsf_cd = (String)hash.get("clsf_cd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.kind = Util.getSessionParameterValue(req,"kind",true);
		dm.budg_yymm = Util.getSessionParameterValue(req,"budg_yymm",true);
		dm.clsf_cd = Util.getSessionParameterValue(req,"clsf_cd",true);
		*******************************************************************************************/
	}
	
	public void mc_budg_4003_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_BUDG_4003_LDataSet ds = null;
		MC_BUDG_4003_LDM dm = new MC_BUDG_4003_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.budg_yymm = Util.checkString(req.getParameter("budg_yymm"));
		dm.budg_cd = Util.checkString(req.getParameter("budg_cd"));
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.evnt_cd = Util.checkString(req.getParameter("evnt_cd"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_BUDG_4003_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_BUDG_4000EJBHome home = (MC_BUDG_4000EJBHome)JNDIManager.getInstance().getHome("MC_BUDG_4000EJB");
			MC_BUDG_4000EJB ejb = home.create();

			ds = ejb.mc_budg_4003_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
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
		dm.budg_cd = (String)hash.get("budg_cd");
		dm.dept_cd = (String)hash.get("dept_cd");
		dm.evnt_cd = (String)hash.get("evnt_cd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.budg_yymm = Util.getSessionParameterValue(req,"budg_yymm",true);
		dm.budg_cd = Util.getSessionParameterValue(req,"budg_cd",true);
		dm.dept_cd = Util.getSessionParameterValue(req,"dept_cd",true);
		dm.evnt_cd = Util.getSessionParameterValue(req,"evnt_cd",true);
		*******************************************************************************************/
	}
	
	public void mc_budg_4004_i(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_BUDG_4004_IDataSet ds = null;
		MC_BUDG_4004_IDM dm = new MC_BUDG_4004_IDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.cnt = Util.checkString(req.getParameter("cnt"));
		dm.budg_yymm = Util.checkString(req.getParameter("budg_yymm"));
		dm.budg_cd = Util.checkString(req.getParameter("budg_cd"));
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.evnt_cd = Util.checkString(req.getParameter("evnt_cd"));

		dm.budg_yymm_to = Util.checkString(req.getParameter("budg_yymm_to"));
		dm.budg_cd_to = Util.checkString(req.getParameter("budg_cd_to"));
		dm.dept_cd_to = Util.checkString(req.getParameter("dept_cd_to"));
		dm.evnt_cd_to = Util.checkString(req.getParameter("evnt_cd_to"));
		
		dm.from_iwamt = Util.checkString(req.getParameter("from_iwamt"));
		dm.to_iwamt = Util.checkString(req.getParameter("to_iwamt"));
		dm.crte_clsf = Util.checkString(req.getParameter("crte_clsf"));
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.work_no = (String)hash.get("work_no");
		dm.seq = (String)hash.get("seq");
		dm.medi_cd = (String)hash.get("medi_cd");
		dm.use_dept_cd = (String)hash.get("use_dept_cd");
		dm.rmks = (String)hash.get("rmks");
		dm.fix_asin_amt = (String)hash.get("fix_asin_amt");
		dm.chg_asin_amt = (String)hash.get("fix_asin_uprc");
		
		multiUpdateData = Util.checkString(req.getParameter("multiUpdateData2"));
		hash = getHashMultiUpdateData(multiUpdateData);
		
		dm.work_no_1 = (String)hash.get("work_no");
		dm.seq_1 = (String)hash.get("seq");
		dm.medi_cd_1 = (String)hash.get("medi_cd");
		dm.use_dept_cd_1 = (String)hash.get("use_dept_cd");
		dm.rmks_1 = (String)hash.get("rmks_1");
		dm.fix_asin_amt_1 = (String)hash.get("fix_asin_amt");

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_BUDG_4004_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_BUDG_4000EJBHome home = (MC_BUDG_4000EJBHome)JNDIManager.getInstance().getHome("MC_BUDG_4000EJB");
			MC_BUDG_4000EJB ejb = home.create();

			ds = ejb.mc_budg_4004_i(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		EJB 수정전 끝 */

		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.cnt = (String)hash.get("cnt");
		dm.budg_yymm = (String)hash.get("budg_yymm");
		dm.budg_cd = (String)hash.get("budg_cd");
		dm.dept_cd = (String)hash.get("dept_cd");
		dm.evnt_cd = (String)hash.get("evnt_cd");
		dm.work_no = (String)hash.get("work_no");
		dm.seq = (String)hash.get("seq");
		dm.medi_cd = (String)hash.get("medi_cd");
		dm.use_dept_cd = (String)hash.get("use_dept_cd");
		dm.rmks = (String)hash.get("rmks");
		dm.fix_asin_amt = (String)hash.get("fix_asin_amt");
		dm.chg_asin_amt = (String)hash.get("chg_asin_amt");
		dm.work_no_1 = (String)hash.get("work_no_1");
		dm.seq_1 = (String)hash.get("seq_1");
		dm.medi_cd_1 = (String)hash.get("medi_cd_1");
		dm.use_dept_cd_1 = (String)hash.get("use_dept_cd_1");
		dm.rmks_1 = (String)hash.get("rmks_1");
		dm.fix_asin_amt_1 = (String)hash.get("fix_asin_amt_1");
		dm.from_iwamt = (String)hash.get("from_iwamt");
		dm.to_iwamt = (String)hash.get("to_iwamt");
		dm.crte_clsf = (String)hash.get("crte_clsf");
		dm.incmg_pers = (String)hash.get("incmg_pers");
		dm.incmg_pers_ipadd = (String)hash.get("incmg_pers_ipadd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.cnt = Util.getSessionParameterValue(req,"cnt",true);
		dm.budg_yymm = Util.getSessionParameterValue(req,"budg_yymm",true);
		dm.budg_cd = Util.getSessionParameterValue(req,"budg_cd",true);
		dm.dept_cd = Util.getSessionParameterValue(req,"dept_cd",true);
		dm.evnt_cd = Util.getSessionParameterValue(req,"evnt_cd",true);
		dm.work_no = Util.getSessionParameterValue(req,"work_no",true);
		dm.seq = Util.getSessionParameterValue(req,"seq",true);
		dm.medi_cd = Util.getSessionParameterValue(req,"medi_cd",true);
		dm.use_dept_cd = Util.getSessionParameterValue(req,"use_dept_cd",true);
		dm.rmks = Util.getSessionParameterValue(req,"rmks",true);
		dm.fix_asin_amt = Util.getSessionParameterValue(req,"fix_asin_amt",true);
		dm.chg_asin_amt = Util.getSessionParameterValue(req,"chg_asin_amt",true);
		dm.work_no_1 = Util.getSessionParameterValue(req,"work_no_1",true);
		dm.seq_1 = Util.getSessionParameterValue(req,"seq_1",true);
		dm.medi_cd_1 = Util.getSessionParameterValue(req,"medi_cd_1",true);
		dm.use_dept_cd_1 = Util.getSessionParameterValue(req,"use_dept_cd_1",true);
		dm.rmks_1 = Util.getSessionParameterValue(req,"rmks_1",true);
		dm.fix_asin_amt_1 = Util.getSessionParameterValue(req,"fix_asin_amt_1",true);
		dm.from_iwamt = Util.getSessionParameterValue(req,"from_iwamt",true);
		dm.to_iwamt = Util.getSessionParameterValue(req,"to_iwamt",true);
		dm.crte_clsf = Util.getSessionParameterValue(req,"crte_clsf",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"incmg_pers",true);
		dm.incmg_pers_ipadd = Util.getSessionParameterValue(req,"incmg_pers_ipadd",true);
		*******************************************************************************************/
	}
	
	public void mc_budg_4005_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_BUDG_4005_LDataSet ds = null;
		MC_BUDG_4005_LDM dm = new MC_BUDG_4005_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_BUDG_4005_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_BUDG_4000EJBHome home = (MC_BUDG_4000EJBHome)JNDIManager.getInstance().getHome("MC_BUDG_4000EJB");
			MC_BUDG_4000EJB ejb = home.create();

			ds = ejb.mc_budg_4005_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
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
	
	public void mc_budg_4006_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_BUDG_4006_LDataSet ds = null;
		MC_BUDG_4006_LDM dm = new MC_BUDG_4006_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.budg_cd = Util.checkString(req.getParameter("budg_cd"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_BUDG_4006_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_BUDG_4000EJBHome home = (MC_BUDG_4000EJBHome)JNDIManager.getInstance().getHome("MC_BUDG_4000EJB");
			MC_BUDG_4000EJB ejb = home.create();

			ds = ejb.mc_budg_4006_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
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
	
	public void mc_budg_4020_m(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_BUDG_4020_MDataSet ds = null;
		MC_BUDG_4020_MDM dm = new MC_BUDG_4020_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.work_dt = Util.checkString(req.getParameter("work_dt"));
		dm.clsf_cd = Util.checkString(req.getParameter("clsf_cd"));
		dm.crte_clsf = Util.checkString(req.getParameter("crte_clsf"));
		dm.hsty_no = Util.checkString(req.getParameter("hsty_no"));
		dm.kind = Util.checkString(req.getParameter("kind"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_BUDG_4020_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_BUDG_4000EJBHome home = (MC_BUDG_4000EJBHome)JNDIManager.getInstance().getHome("MC_BUDG_4000EJB");
			MC_BUDG_4000EJB ejb = home.create();

			ds = ejb.mc_budg_4020_m(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		EJB 수정전 끝 */

		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.work_dt = (String)hash.get("work_dt");
		dm.clsf_cd = (String)hash.get("clsf_cd");
		dm.crte_clsf = (String)hash.get("crte_clsf");
		dm.hsty_no = (String)hash.get("hsty_no");
		dm.kind = (String)hash.get("kind");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.work_dt = Util.getSessionParameterValue(req,"work_dt",true);
		dm.clsf_cd = Util.getSessionParameterValue(req,"clsf_cd",true);
		dm.crte_clsf = Util.getSessionParameterValue(req,"crte_clsf",true);
		dm.hsty_no = Util.getSessionParameterValue(req,"hsty_no",true);
		dm.kind = Util.getSessionParameterValue(req,"kind",true);
		*******************************************************************************************/
	}
	
	public void mc_budg_4021_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_BUDG_4021_LDataSet ds = null;
		MC_BUDG_4021_LDM dm = new MC_BUDG_4021_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.work_dt = Util.checkString(req.getParameter("work_dt"));
		dm.hsty_no = Util.checkString(req.getParameter("hsty_no"));
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_BUDG_4021_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_BUDG_4000EJBHome home = (MC_BUDG_4000EJBHome)JNDIManager.getInstance().getHome("MC_BUDG_4000EJB");
			MC_BUDG_4000EJB ejb = home.create();

			ds = ejb.mc_budg_4021_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		EJB 수정전 끝 */

		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.work_dt = (String)hash.get("work_dt");
		dm.hsty_no = (String)hash.get("hsty_no");
		dm.dept_cd = (String)hash.get("dept_cd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.work_dt = Util.getSessionParameterValue(req,"work_dt",true);
		dm.hsty_no = Util.getSessionParameterValue(req,"hsty_no",true);
		dm.dept_cd = Util.getSessionParameterValue(req,"dept_cd",true);
		*******************************************************************************************/
	}
	
	public void mc_budg_4024_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_BUDG_4024_LDataSet ds = null;
		MC_BUDG_4024_LDM dm = new MC_BUDG_4024_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.clsf_cd = Util.checkString(req.getParameter("clsf_cd"));
		dm.work_dt = Util.checkString(req.getParameter("work_dt"));
		dm.hsty_no = Util.checkString(req.getParameter("hsty_no"));
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_BUDG_4024_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_BUDG_4000EJBHome home = (MC_BUDG_4000EJBHome)JNDIManager.getInstance().getHome("MC_BUDG_4000EJB");
			MC_BUDG_4000EJB ejb = home.create();

			ds = ejb.mc_budg_4024_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
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
		dm.work_dt = (String)hash.get("work_dt");
		dm.hsty_no = (String)hash.get("hsty_no");
		dm.dept_cd = (String)hash.get("dept_cd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.clsf_cd = Util.getSessionParameterValue(req,"clsf_cd",true);
		dm.work_dt = Util.getSessionParameterValue(req,"work_dt",true);
		dm.hsty_no = Util.getSessionParameterValue(req,"hsty_no",true);
		dm.dept_cd = Util.getSessionParameterValue(req,"dept_cd",true);
		*******************************************************************************************/
	}
	
	public void mc_budg_4027_m(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_BUDG_4027_MDataSet ds = null;
		MC_BUDG_4027_MDM dm = new MC_BUDG_4027_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_BUDG_4027_MDataSet)manager.executeCall(dm);

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
	
	public void mc_budg_4010_m(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_BUDG_4010_MDataSet ds = null;
		MC_BUDG_4010_MDM dm = new MC_BUDG_4010_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);

		dm.work_dt = Util.checkString(req.getParameter("work_dt"));
		dm.clsf_cd = Util.checkString(req.getParameter("clsf_cd"));
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.crte_clsf = Util.checkString(req.getParameter("crte_clsf"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_BUDG_4010_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_BUDG_4000EJBHome home = (MC_BUDG_4000EJBHome)JNDIManager.getInstance().getHome("MC_BUDG_4000EJB");
			MC_BUDG_4000EJB ejb = home.create();

			ds = ejb.mc_budg_4010_m(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		EJB 수정전 끝 */

		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.work_dt = (String)hash.get("work_dt");
		dm.clsf_cd = (String)hash.get("clsf_cd");
		dm.dept_cd = (String)hash.get("dept_cd");
		dm.crte_clsf = (String)hash.get("crte_clsf");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.work_dt = Util.getSessionParameterValue(req,"work_dt",true);
		dm.clsf_cd = Util.getSessionParameterValue(req,"clsf_cd",true);
		dm.dept_cd = Util.getSessionParameterValue(req,"dept_cd",true);
		dm.crte_clsf = Util.getSessionParameterValue(req,"crte_clsf",true);
		*******************************************************************************************/
	}
	
	public void mc_budg_4011_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_BUDG_4011_LDataSet ds = null;
		MC_BUDG_4011_LDM dm = new MC_BUDG_4011_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.budg_yymm = Util.checkString(req.getParameter("budg_yymm"));
		dm.budg_cd = Util.checkString(req.getParameter("budg_cd"));
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.evnt_cd = Util.checkString(req.getParameter("evnt_cd"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_BUDG_4011_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_BUDG_4000EJBHome home = (MC_BUDG_4000EJBHome)JNDIManager.getInstance().getHome("MC_BUDG_4000EJB");
			MC_BUDG_4000EJB ejb = home.create();

			ds = ejb.mc_budg_4011_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
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
		dm.budg_cd = (String)hash.get("budg_cd");
		dm.dept_cd = (String)hash.get("dept_cd");
		dm.evnt_cd = (String)hash.get("evnt_cd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.budg_yymm = Util.getSessionParameterValue(req,"budg_yymm",true);
		dm.budg_cd = Util.getSessionParameterValue(req,"budg_cd",true);
		dm.dept_cd = Util.getSessionParameterValue(req,"dept_cd",true);
		dm.evnt_cd = Util.getSessionParameterValue(req,"evnt_cd",true);
		*******************************************************************************************/
	}
	
	public void mc_budg_4012_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_BUDG_4012_LDataSet ds = null;
		MC_BUDG_4012_LDM dm = new MC_BUDG_4012_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.work_dt = Util.checkString(req.getParameter("work_dt"));
		dm.hsty_no = Util.checkString(req.getParameter("hsty_no"));
		dm.budg_yymm = Util.checkString(req.getParameter("budg_yymm"));
		dm.budg_cd = Util.checkString(req.getParameter("budg_cd"));
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.evnt_cd = Util.checkString(req.getParameter("evnt_cd"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_BUDG_4012_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_BUDG_4000EJBHome home = (MC_BUDG_4000EJBHome)JNDIManager.getInstance().getHome("MC_BUDG_4000EJB");
			MC_BUDG_4000EJB ejb = home.create();

			ds = ejb.mc_budg_4012_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		EJB 수정전 끝 */

		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.work_dt = (String)hash.get("work_dt");
		dm.hsty_no = (String)hash.get("hsty_no");
		dm.budg_yymm = (String)hash.get("budg_yymm");
		dm.budg_cd = (String)hash.get("budg_cd");
		dm.dept_cd = (String)hash.get("dept_cd");
		dm.evnt_cd = (String)hash.get("evnt_cd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.work_dt = Util.getSessionParameterValue(req,"work_dt",true);
		dm.hsty_no = Util.getSessionParameterValue(req,"hsty_no",true);
		dm.budg_yymm = Util.getSessionParameterValue(req,"budg_yymm",true);
		dm.budg_cd = Util.getSessionParameterValue(req,"budg_cd",true);
		dm.dept_cd = Util.getSessionParameterValue(req,"dept_cd",true);
		dm.evnt_cd = Util.getSessionParameterValue(req,"evnt_cd",true);
		*******************************************************************************************/
	}
	
	public void mc_budg_4013_i(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_BUDG_4013_IDataSet ds = null;
		MC_BUDG_4013_IDM dm = new MC_BUDG_4013_IDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.work_dt = Util.checkString(req.getParameter("work_dt"));
		dm.budg_yy = Util.checkString(req.getParameter("budg_yy"));
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.rmks2 = Util.checkString(req.getParameter("rmks2"));
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.budg_yymm = (String)hash.get("budg_yymm");
		dm.budg_cd = (String)hash.get("budg_cd");
		dm.evnt_cd = (String)hash.get("evnt_cd");
		dm.use_dept_cd = (String)hash.get("use_dept_cd");
		dm.medi_cd = (String)hash.get("medi_cd");
		dm.rmks = (String)hash.get("rmks");
		dm.qunt = (String)hash.get("qunt");
		dm.uprc = (String)hash.get("uprc");
		dm.amt = (String)hash.get("amt");

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_BUDG_4013_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_BUDG_4000EJBHome home = (MC_BUDG_4000EJBHome)JNDIManager.getInstance().getHome("MC_BUDG_4000EJB");
			MC_BUDG_4000EJB ejb = home.create();

			ds = ejb.mc_budg_4013_i(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		EJB 수정전 끝 */

		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.work_dt = (String)hash.get("work_dt");
		dm.budg_yy = (String)hash.get("budg_yy");
		dm.budg_yymm = (String)hash.get("budg_yymm");
		dm.budg_cd = (String)hash.get("budg_cd");
		dm.dept_cd = (String)hash.get("dept_cd");
		dm.evnt_cd = (String)hash.get("evnt_cd");
		dm.rmks2 = (String)hash.get("rmks2");
		dm.use_dept_cd = (String)hash.get("use_dept_cd");
		dm.medi_cd = (String)hash.get("medi_cd");
		dm.rmks = (String)hash.get("rmks");
		dm.qunt = (String)hash.get("qunt");
		dm.uprc = (String)hash.get("uprc");
		dm.amt = (String)hash.get("amt");
		dm.incmg_pers_ipadd = (String)hash.get("incmg_pers_ipadd");
		dm.incmg_pers = (String)hash.get("incmg_pers");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.work_dt = Util.getSessionParameterValue(req,"work_dt",true);
		dm.budg_yy = Util.getSessionParameterValue(req,"budg_yy",true);
		dm.budg_yymm = Util.getSessionParameterValue(req,"budg_yymm",true);
		dm.budg_cd = Util.getSessionParameterValue(req,"budg_cd",true);
		dm.dept_cd = Util.getSessionParameterValue(req,"dept_cd",true);
		dm.evnt_cd = Util.getSessionParameterValue(req,"evnt_cd",true);
		dm.rmks2 = Util.getSessionParameterValue(req,"rmks2",true);
		dm.use_dept_cd = Util.getSessionParameterValue(req,"use_dept_cd",true);
		dm.medi_cd = Util.getSessionParameterValue(req,"medi_cd",true);
		dm.rmks = Util.getSessionParameterValue(req,"rmks",true);
		dm.qunt = Util.getSessionParameterValue(req,"qunt",true);
		dm.uprc = Util.getSessionParameterValue(req,"uprc",true);
		dm.amt = Util.getSessionParameterValue(req,"amt",true);
		dm.incmg_pers_ipadd = Util.getSessionParameterValue(req,"incmg_pers_ipadd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"incmg_pers",true);
		*******************************************************************************************/
	}
	
	public void mc_budg_4014_i(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_BUDG_4014_IDataSet ds = null;
		MC_BUDG_4014_IDM dm = new MC_BUDG_4014_IDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.budg_yy = Util.checkString(req.getParameter("budg_yy"));
		dm.work_dt = Util.checkString(req.getParameter("work_dt"));
		dm.hsty_no = Util.checkString(req.getParameter("hsty_no"));
		dm.budg_yymm = Util.checkString(req.getParameter("budg_yymm"));
		dm.budg_cd = Util.checkString(req.getParameter("budg_cd"));
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.evnt_cd = Util.checkString(req.getParameter("evnt_cd"));
		dm.rmks2 = Util.checkString(req.getParameter("rmks2"));
		dm.use_dept_cd = Util.checkString(req.getParameter("use_dept_cd"));
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.jobtag = (String)hash.get("select");
		dm.sub_no = (String)hash.get("sub_no");
		dm.use_dept_cd = (String)hash.get("use_dept_cd");
		dm.medi_cd = (String)hash.get("medi_cd");
		dm.rmks = (String)hash.get("rmks");
		dm.qunt = (String)hash.get("qunt");
		dm.uprc = (String)hash.get("uprc");
		dm.amt = (String)hash.get("amt");

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_BUDG_4014_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_BUDG_4000EJBHome home = (MC_BUDG_4000EJBHome)JNDIManager.getInstance().getHome("MC_BUDG_4000EJB");
			MC_BUDG_4000EJB ejb = home.create();

			ds = ejb.mc_budg_4014_i(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
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
		dm.jobtag = (String)hash.get("jobtag");
		dm.work_dt = (String)hash.get("work_dt");
		dm.hsty_no = (String)hash.get("hsty_no");
		dm.sub_no = (String)hash.get("sub_no");
		dm.budg_yymm = (String)hash.get("budg_yymm");
		dm.budg_cd = (String)hash.get("budg_cd");
		dm.dept_cd = (String)hash.get("dept_cd");
		dm.evnt_cd = (String)hash.get("evnt_cd");
		dm.rmks2 = (String)hash.get("rmks2");
		dm.use_dept_cd = (String)hash.get("use_dept_cd");
		dm.medi_cd = (String)hash.get("medi_cd");
		dm.rmks = (String)hash.get("rmks");
		dm.qunt = (String)hash.get("qunt");
		dm.uprc = (String)hash.get("uprc");
		dm.amt = (String)hash.get("amt");
		dm.incmg_pers = (String)hash.get("incmg_pers");
		dm.incmg_pers_ipadd = (String)hash.get("incmg_pers_ipadd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.budg_yy = Util.getSessionParameterValue(req,"budg_yy",true);
		dm.jobtag = Util.getSessionParameterValue(req,"jobtag",true);
		dm.work_dt = Util.getSessionParameterValue(req,"work_dt",true);
		dm.hsty_no = Util.getSessionParameterValue(req,"hsty_no",true);
		dm.sub_no = Util.getSessionParameterValue(req,"sub_no",true);
		dm.budg_yymm = Util.getSessionParameterValue(req,"budg_yymm",true);
		dm.budg_cd = Util.getSessionParameterValue(req,"budg_cd",true);
		dm.dept_cd = Util.getSessionParameterValue(req,"dept_cd",true);
		dm.evnt_cd = Util.getSessionParameterValue(req,"evnt_cd",true);
		dm.rmks2 = Util.getSessionParameterValue(req,"rmks2",true);
		dm.use_dept_cd = Util.getSessionParameterValue(req,"use_dept_cd",true);
		dm.medi_cd = Util.getSessionParameterValue(req,"medi_cd",true);
		dm.rmks = Util.getSessionParameterValue(req,"rmks",true);
		dm.qunt = Util.getSessionParameterValue(req,"qunt",true);
		dm.uprc = Util.getSessionParameterValue(req,"uprc",true);
		dm.amt = Util.getSessionParameterValue(req,"amt",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"incmg_pers",true);
		dm.incmg_pers_ipadd = Util.getSessionParameterValue(req,"incmg_pers_ipadd",true);
		*******************************************************************************************/
	}
	
	public void mc_budg_4015_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_BUDG_4015_LDataSet ds = null;
		MC_BUDG_4015_LDM dm = new MC_BUDG_4015_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.work_dt = Util.checkString(req.getParameter("work_dt"));
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.clsf_cd = Util.checkString(req.getParameter("clsf_cd"));
		dm.crte_clsf_cd = Util.checkString(req.getParameter("crte_clsf_cd"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_BUDG_4015_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_BUDG_4000EJBHome home = (MC_BUDG_4000EJBHome)JNDIManager.getInstance().getHome("MC_BUDG_4000EJB");
			MC_BUDG_4000EJB ejb = home.create();

			ds = ejb.mc_budg_4015_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		EJB 수정전 끝 */

		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.work_dt = (String)hash.get("work_dt");
		dm.dept_cd = (String)hash.get("dept_cd");
		dm.clsf_cd = (String)hash.get("clsf_cd");
		dm.crte_clsf_cd = (String)hash.get("crte_clsf_cd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.work_dt = Util.getSessionParameterValue(req,"work_dt",true);
		dm.dept_cd = Util.getSessionParameterValue(req,"dept_cd",true);
		dm.clsf_cd = Util.getSessionParameterValue(req,"clsf_cd",true);
		dm.crte_clsf_cd = Util.getSessionParameterValue(req,"crte_clsf_cd",true);
		*******************************************************************************************/
	}
	
	public void mc_budg_4016_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_BUDG_4016_LDataSet ds = null;
		MC_BUDG_4016_LDM dm = new MC_BUDG_4016_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.work_dt = Util.checkString(req.getParameter("work_dt"));
		dm.hsty_no = Util.checkString(req.getParameter("hsty_no"));
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_BUDG_4016_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_BUDG_4000EJBHome home = (MC_BUDG_4000EJBHome)JNDIManager.getInstance().getHome("MC_BUDG_4000EJB");
			MC_BUDG_4000EJB ejb = home.create();

			ds = ejb.mc_budg_4016_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		EJB 수정전 끝 */

		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.work_dt = (String)hash.get("work_dt");
		dm.hsty_no = (String)hash.get("hsty_no");
		dm.dept_cd = (String)hash.get("dept_cd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.work_dt = Util.getSessionParameterValue(req,"work_dt",true);
		dm.hsty_no = Util.getSessionParameterValue(req,"hsty_no",true);
		dm.dept_cd = Util.getSessionParameterValue(req,"dept_cd",true);
		*******************************************************************************************/
	}
	
	public void mc_budg_4017_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_BUDG_4017_LDataSet ds = null;
		MC_BUDG_4017_LDM dm = new MC_BUDG_4017_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.work_dt = Util.checkString(req.getParameter("work_dt"));
		dm.hsty_no = Util.checkString(req.getParameter("hsty_no"));
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_BUDG_4017_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_BUDG_4000EJBHome home = (MC_BUDG_4000EJBHome)JNDIManager.getInstance().getHome("MC_BUDG_4000EJB");
			MC_BUDG_4000EJB ejb = home.create();

			ds = ejb.mc_budg_4017_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		EJB 수정전 끝 */

		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.work_dt = (String)hash.get("work_dt");
		dm.hsty_no = (String)hash.get("hsty_no");
		dm.dept_cd = (String)hash.get("dept_cd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.work_dt = Util.getSessionParameterValue(req,"work_dt",true);
		dm.hsty_no = Util.getSessionParameterValue(req,"hsty_no",true);
		dm.dept_cd = Util.getSessionParameterValue(req,"dept_cd",true);
		*******************************************************************************************/
	}
	
	public void mc_budg_4018_d(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_BUDG_4018_DDataSet ds = null;
		MC_BUDG_4018_DDM dm = new MC_BUDG_4018_DDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.budg_yy = Util.checkString(req.getParameter("budg_yy"));
		dm.work_dt = Util.checkString(req.getParameter("work_dt"));
		dm.hsty_no = Util.checkString(req.getParameter("hsty_no"));
		
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.sub_no = (String)hash.get("sub_no");

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_BUDG_4018_DDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_BUDG_4000EJBHome home = (MC_BUDG_4000EJBHome)JNDIManager.getInstance().getHome("MC_BUDG_4000EJB");
			MC_BUDG_4000EJB ejb = home.create();

			ds = ejb.mc_budg_4018_d(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
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
		dm.work_dt = (String)hash.get("work_dt");
		dm.hsty_no = (String)hash.get("hsty_no");
		dm.sub_no = (String)hash.get("sub_no");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.budg_yy = Util.getSessionParameterValue(req,"budg_yy",true);
		dm.work_dt = Util.getSessionParameterValue(req,"work_dt",true);
		dm.hsty_no = Util.getSessionParameterValue(req,"hsty_no",true);
		dm.sub_no = Util.getSessionParameterValue(req,"sub_no",true);
		*******************************************************************************************/
	}
	
	public void mc_budg_4019_d(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_BUDG_4019_DDataSet ds = null;
		MC_BUDG_4019_DDM dm = new MC_BUDG_4019_DDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.budg_yy = Util.checkString(req.getParameter("budg_yy"));
		dm.work_dt = Util.checkString(req.getParameter("work_dt"));
		dm.hsty_no = Util.checkString(req.getParameter("hsty_no"));
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_BUDG_4019_DDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_BUDG_4000EJBHome home = (MC_BUDG_4000EJBHome)JNDIManager.getInstance().getHome("MC_BUDG_4000EJB");
			MC_BUDG_4000EJB ejb = home.create();

			ds = ejb.mc_budg_4019_d(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
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
		dm.work_dt = (String)hash.get("work_dt");
		dm.hsty_no = (String)hash.get("hsty_no");
		dm.dept_cd = (String)hash.get("dept_cd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.budg_yy = Util.getSessionParameterValue(req,"budg_yy",true);
		dm.work_dt = Util.getSessionParameterValue(req,"work_dt",true);
		dm.hsty_no = Util.getSessionParameterValue(req,"hsty_no",true);
		dm.dept_cd = Util.getSessionParameterValue(req,"dept_cd",true);
		*******************************************************************************************/
	}
	
	public void mc_budg_40500_m(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_BUDG_40500_MDataSet ds = null;
		MC_BUDG_40500_MDM dm = new MC_BUDG_40500_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		
		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_BUDG_40500_MDataSet)manager.executeCall(dm);

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
	
	public void mc_budg_4050_m(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_BUDG_4050_MDataSet ds = null;
		MC_BUDG_4050_MDM dm = new MC_BUDG_4050_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.abrv_nm = Util.checkString(req.getParameter("abrv_nm"));
		dm.work_dt = Util.checkString(req.getParameter("work_dt"));
		dm.clsf_cd = Util.checkString(req.getParameter("clsf_cd"));
		dm.crte_clsf = Util.checkString(req.getParameter("crte_clsf"));
		dm.clas_cd1 = Util.checkString(req.getParameter("clas_cd1"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_BUDG_4050_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_BUDG_4000EJBHome home = (MC_BUDG_4000EJBHome)JNDIManager.getInstance().getHome("MC_BUDG_4000EJB");
			MC_BUDG_4000EJB ejb = home.create();

			ds = ejb.mc_budg_4050_m(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
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
		dm.abrv_nm = (String)hash.get("abrv_nm");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.dept_cd = Util.getSessionParameterValue(req,"dept_cd",true);
		dm.abrv_nm = Util.getSessionParameterValue(req,"abrv_nm",true);
		*******************************************************************************************/
	}
	
	public void mc_budg_4051_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_BUDG_4051_LDataSet ds = null;
		MC_BUDG_4051_LDM dm = new MC_BUDG_4051_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.budg_yymm = Util.checkString(req.getParameter("budg_yymm"));
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.evnt_cd = Util.checkString(req.getParameter("evnt_cd"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_BUDG_4051_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_BUDG_4000EJBHome home = (MC_BUDG_4000EJBHome)JNDIManager.getInstance().getHome("MC_BUDG_4000EJB");
			MC_BUDG_4000EJB ejb = home.create();

			ds = ejb.mc_budg_4051_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
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
		dm.evnt_cd = (String)hash.get("evnt_cd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.budg_yymm = Util.getSessionParameterValue(req,"budg_yymm",true);
		dm.dept_cd = Util.getSessionParameterValue(req,"dept_cd",true);
		dm.evnt_cd = Util.getSessionParameterValue(req,"evnt_cd",true);
		*******************************************************************************************/
	}
	
	public void mc_budg_4052_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_BUDG_4052_LDataSet ds = null;
		MC_BUDG_4052_LDM dm = new MC_BUDG_4052_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.work_dt = Util.checkString(req.getParameter("work_dt"));
		dm.hsty_no = Util.checkString(req.getParameter("hsty_no"));
		dm.budg_yymm = Util.checkString(req.getParameter("budg_yymm"));
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.evnt_cd = Util.checkString(req.getParameter("evnt_cd"));
		dm.work_no = Util.checkString(req.getParameter("work_no"));
		dm.use_dept_cd = Util.checkString(req.getParameter("use_dept_cd"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_BUDG_4052_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_BUDG_4000EJBHome home = (MC_BUDG_4000EJBHome)JNDIManager.getInstance().getHome("MC_BUDG_4000EJB");
			MC_BUDG_4000EJB ejb = home.create();

			ds = ejb.mc_budg_4052_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		EJB 수정전 끝 */

		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.work_dt = (String)hash.get("work_dt");
		dm.hsty_no = (String)hash.get("hsty_no");
		dm.budg_yymm = (String)hash.get("budg_yymm");
		dm.dept_cd = (String)hash.get("dept_cd");
		dm.evnt_cd = (String)hash.get("evnt_cd");
		dm.work_no = (String)hash.get("work_no");
		dm.use_dept_cd = (String)hash.get("use_dept_cd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.work_dt = Util.getSessionParameterValue(req,"work_dt",true);
		dm.hsty_no = Util.getSessionParameterValue(req,"hsty_no",true);
		dm.budg_yymm = Util.getSessionParameterValue(req,"budg_yymm",true);
		dm.dept_cd = Util.getSessionParameterValue(req,"dept_cd",true);
		dm.evnt_cd = Util.getSessionParameterValue(req,"evnt_cd",true);
		dm.work_no = Util.getSessionParameterValue(req,"work_no",true);
		dm.use_dept_cd = Util.getSessionParameterValue(req,"use_dept_cd",true);
		*******************************************************************************************/
	}
	
	public void mc_budg_4053_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_BUDG_4053_LDataSet ds = null;
		MC_BUDG_4053_LDM dm = new MC_BUDG_4053_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.work_dt = Util.checkString(req.getParameter("work_dt"));
		dm.hsty_no = Util.checkString(req.getParameter("hsty_no"));
		dm.budg_yymm = Util.checkString(req.getParameter("budg_yymm"));
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.evnt_cd = Util.checkString(req.getParameter("evnt_cd"));
		dm.work_no = Util.checkString(req.getParameter("work_no"));
		dm.use_dept_cd = Util.checkString(req.getParameter("use_dept_cd"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_BUDG_4053_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_BUDG_4000EJBHome home = (MC_BUDG_4000EJBHome)JNDIManager.getInstance().getHome("MC_BUDG_4000EJB");
			MC_BUDG_4000EJB ejb = home.create();

			ds = ejb.mc_budg_4053_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		EJB 수정전 끝 */

		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.work_dt = (String)hash.get("work_dt");
		dm.hsty_no = (String)hash.get("hsty_no");
		dm.budg_yymm = (String)hash.get("budg_yymm");
		dm.dept_cd = (String)hash.get("dept_cd");
		dm.evnt_cd = (String)hash.get("evnt_cd");
		dm.work_no = (String)hash.get("work_no");
		dm.use_dept_cd = (String)hash.get("use_dept_cd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.work_dt = Util.getSessionParameterValue(req,"work_dt",true);
		dm.hsty_no = Util.getSessionParameterValue(req,"hsty_no",true);
		dm.budg_yymm = Util.getSessionParameterValue(req,"budg_yymm",true);
		dm.dept_cd = Util.getSessionParameterValue(req,"dept_cd",true);
		dm.evnt_cd = Util.getSessionParameterValue(req,"evnt_cd",true);
		dm.work_no = Util.getSessionParameterValue(req,"work_no",true);
		dm.use_dept_cd = Util.getSessionParameterValue(req,"use_dept_cd",true);
		*******************************************************************************************/
	}
	
	public void mc_budg_4054_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_BUDG_4054_LDataSet ds = null;
		MC_BUDG_4054_LDM dm = new MC_BUDG_4054_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.budg_yymm = Util.checkString(req.getParameter("budg_yymm"));
		dm.evnt_cd = Util.checkString(req.getParameter("evnt_cd"));
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.budg_cd = Util.checkString(req.getParameter("budg_cd"));
		dm.work_no = Util.checkString(req.getParameter("work_no"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_BUDG_4054_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_BUDG_4000EJBHome home = (MC_BUDG_4000EJBHome)JNDIManager.getInstance().getHome("MC_BUDG_4000EJB");
			MC_BUDG_4000EJB ejb = home.create();

			ds = ejb.mc_budg_4054_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
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
		dm.evnt_cd = (String)hash.get("evnt_cd");
		dm.dept_cd = (String)hash.get("dept_cd");
		dm.budg_cd = (String)hash.get("budg_cd");
		dm.work_no = (String)hash.get("work_no");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.budg_yymm = Util.getSessionParameterValue(req,"budg_yymm",true);
		dm.evnt_cd = Util.getSessionParameterValue(req,"evnt_cd",true);
		dm.dept_cd = Util.getSessionParameterValue(req,"dept_cd",true);
		dm.budg_cd = Util.getSessionParameterValue(req,"budg_cd",true);
		dm.work_no = Util.getSessionParameterValue(req,"work_no",true);
		*******************************************************************************************/
	}
	
	public void mc_budg_4055_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_BUDG_4055_LDataSet ds = null;
		MC_BUDG_4055_LDM dm = new MC_BUDG_4055_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.work_dt = Util.checkString(req.getParameter("work_dt"));
		dm.hsty_no = Util.checkString(req.getParameter("hsty_no"));
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_BUDG_4055_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_BUDG_4000EJBHome home = (MC_BUDG_4000EJBHome)JNDIManager.getInstance().getHome("MC_BUDG_4000EJB");
			MC_BUDG_4000EJB ejb = home.create();

			ds = ejb.mc_budg_4055_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
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
	
	public void mc_budg_4056_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_BUDG_4056_LDataSet ds = null;
		MC_BUDG_4056_LDM dm = new MC_BUDG_4056_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.work_dt = Util.checkString(req.getParameter("work_dt"));
		dm.hsty_no = Util.checkString(req.getParameter("hsty_no"));
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.work_no = Util.checkString(req.getParameter("work_no"));
		dm.evnt_cd = Util.checkString(req.getParameter("evnt_cd"));
		dm.budg_yymm = Util.checkString(req.getParameter("budg_yymm"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_BUDG_4056_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_BUDG_4000EJBHome home = (MC_BUDG_4000EJBHome)JNDIManager.getInstance().getHome("MC_BUDG_4000EJB");
			MC_BUDG_4000EJB ejb = home.create();

			ds = ejb.mc_budg_4056_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		EJB 수정전 끝 */

		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.work_dt = (String)hash.get("work_dt");
		dm.hsty_no = (String)hash.get("hsty_no");
		dm.dept_cd = (String)hash.get("dept_cd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.work_dt = Util.getSessionParameterValue(req,"work_dt",true);
		dm.hsty_no = Util.getSessionParameterValue(req,"hsty_no",true);
		dm.dept_cd = Util.getSessionParameterValue(req,"dept_cd",true);
		*******************************************************************************************/
	}
	
	public void mc_budg_4057_i(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_BUDG_4057_IDataSet ds = null;
		MC_BUDG_4057_IDM dm = new MC_BUDG_4057_IDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.work_dt = Util.checkString(req.getParameter("work_dt"));
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.budg_yymm = (String)hash.get("budg_yymm");
		dm.budg_cd = (String)hash.get("budg_cd");
		dm.evnt_cd = (String)hash.get("evnt_cd");
		dm.work_no = (String)hash.get("work_no");
		dm.rmks2 = (String)hash.get("rmks2");
		dm.use_dept_cd = (String)hash.get("use_dept_cd");
		dm.rmks = (String)hash.get("rmks");
		dm.amt = (String)hash.get("amt");

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_BUDG_4057_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_BUDG_4000EJBHome home = (MC_BUDG_4000EJBHome)JNDIManager.getInstance().getHome("MC_BUDG_4000EJB");
			MC_BUDG_4000EJB ejb = home.create();

			ds = ejb.mc_budg_4057_i(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		EJB 수정전 끝 */

		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.work_dt = (String)hash.get("work_dt");
		dm.budg_yymm = (String)hash.get("budg_yymm");
		dm.budg_cd = (String)hash.get("budg_cd");
		dm.dept_cd = (String)hash.get("dept_cd");
		dm.evnt_cd = (String)hash.get("evnt_cd");
		dm.work_no = (String)hash.get("work_no");
		dm.rmks2 = (String)hash.get("rmks2");
		dm.use_dept_cd = (String)hash.get("use_dept_cd");
		dm.rmks = (String)hash.get("rmks");
		dm.amt = (String)hash.get("amt");
		dm.incmg_pers = (String)hash.get("incmg_pers");
		dm.incmg_pers_ipadd = (String)hash.get("incmg_pers_ipadd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.work_dt = Util.getSessionParameterValue(req,"work_dt",true);
		dm.budg_yymm = Util.getSessionParameterValue(req,"budg_yymm",true);
		dm.budg_cd = Util.getSessionParameterValue(req,"budg_cd",true);
		dm.dept_cd = Util.getSessionParameterValue(req,"dept_cd",true);
		dm.evnt_cd = Util.getSessionParameterValue(req,"evnt_cd",true);
		dm.work_no = Util.getSessionParameterValue(req,"work_no",true);
		dm.rmks2 = Util.getSessionParameterValue(req,"rmks2",true);
		dm.use_dept_cd = Util.getSessionParameterValue(req,"use_dept_cd",true);
		dm.rmks = Util.getSessionParameterValue(req,"rmks",true);
		dm.amt = Util.getSessionParameterValue(req,"amt",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"incmg_pers",true);
		dm.incmg_pers_ipadd = Util.getSessionParameterValue(req,"incmg_pers_ipadd",true);
		*******************************************************************************************/
	}
	
	public void mc_budg_4058_i(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_BUDG_4058_IDataSet ds = null;
		MC_BUDG_4058_IDM dm = new MC_BUDG_4058_IDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.work_dt = Util.checkString(req.getParameter("work_dt"));
		dm.hsty_no = Util.checkString(req.getParameter("hsty_no"));
		dm.work_no = Util.checkString(req.getParameter("work_no"));
		dm.budg_yymm = Util.checkString(req.getParameter("budg_yymm"));
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.evnt_cd = Util.checkString(req.getParameter("evnt_cd"));
		dm.rmks2 = Util.checkString(req.getParameter("rmks2"));
		dm.use_dept_cd = Util.checkString(req.getParameter("use_dept_cd"));
		dm.incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.mode = (String)hash.get("select");
		dm.sub_no = (String)hash.get("sub_no");
		dm.budg_cd = (String)hash.get("budg_cd");
		dm.rmks = (String)hash.get("rmks");
		dm.amt = (String)hash.get("amt");

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_BUDG_4058_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_BUDG_4000EJBHome home = (MC_BUDG_4000EJBHome)JNDIManager.getInstance().getHome("MC_BUDG_4000EJB");
			MC_BUDG_4000EJB ejb = home.create();

			ds = ejb.mc_budg_4058_i(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
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
		dm.work_dt = (String)hash.get("work_dt");
		dm.hsty_no = (String)hash.get("hsty_no");
		dm.work_no = (String)hash.get("work_no");
		dm.sub_no = (String)hash.get("sub_no");
		dm.budg_yymm = (String)hash.get("budg_yymm");
		dm.budg_cd = (String)hash.get("budg_cd");
		dm.dept_cd = (String)hash.get("dept_cd");
		dm.evnt_cd = (String)hash.get("evnt_cd");
		dm.rmks2 = (String)hash.get("rmks2");
		dm.use_dept_cd = (String)hash.get("use_dept_cd");
		dm.rmks = (String)hash.get("rmks");
		dm.amt = (String)hash.get("amt");
		dm.incmg_pers = (String)hash.get("incmg_pers");
		dm.incmg_pers_ipadd = (String)hash.get("incmg_pers_ipadd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.mode = Util.getSessionParameterValue(req,"mode",true);
		dm.work_dt = Util.getSessionParameterValue(req,"work_dt",true);
		dm.hsty_no = Util.getSessionParameterValue(req,"hsty_no",true);
		dm.work_no = Util.getSessionParameterValue(req,"work_no",true);
		dm.sub_no = Util.getSessionParameterValue(req,"sub_no",true);
		dm.budg_yymm = Util.getSessionParameterValue(req,"budg_yymm",true);
		dm.budg_cd = Util.getSessionParameterValue(req,"budg_cd",true);
		dm.dept_cd = Util.getSessionParameterValue(req,"dept_cd",true);
		dm.evnt_cd = Util.getSessionParameterValue(req,"evnt_cd",true);
		dm.rmks2 = Util.getSessionParameterValue(req,"rmks2",true);
		dm.use_dept_cd = Util.getSessionParameterValue(req,"use_dept_cd",true);
		dm.rmks = Util.getSessionParameterValue(req,"rmks",true);
		dm.amt = Util.getSessionParameterValue(req,"amt",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"incmg_pers",true);
		dm.incmg_pers_ipadd = Util.getSessionParameterValue(req,"incmg_pers_ipadd",true);
		*******************************************************************************************/
	}
	
	public void mc_budg_4059_d(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_BUDG_4059_DDataSet ds = null;
		MC_BUDG_4059_DDM dm = new MC_BUDG_4059_DDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.yyyy = Util.checkString(req.getParameter("yyyy"));
		
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.work_dt = (String)hash.get("work_dt");
		dm.hsty_no = (String)hash.get("hsty_no");
		dm.sub_no = (String)hash.get("sub_no");

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_BUDG_4059_DDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_BUDG_4000EJBHome home = (MC_BUDG_4000EJBHome)JNDIManager.getInstance().getHome("MC_BUDG_4000EJB");
			MC_BUDG_4000EJB ejb = home.create();

			ds = ejb.mc_budg_4059_d(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
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
		dm.work_dt = (String)hash.get("work_dt");
		dm.hsty_no = (String)hash.get("hsty_no");
		dm.sub_no = (String)hash.get("sub_no");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.yyyy = Util.getSessionParameterValue(req,"yyyy",true);
		dm.work_dt = Util.getSessionParameterValue(req,"work_dt",true);
		dm.hsty_no = Util.getSessionParameterValue(req,"hsty_no",true);
		dm.sub_no = Util.getSessionParameterValue(req,"sub_no",true);
		*******************************************************************************************/
	}
	public void mc_budg_4100_i(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_BUDG_4100_IDataSet ds = null;
		MC_BUDG_4100_IDM dm = new MC_BUDG_4100_IDM();
		
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_emp_no = Util.checkString(req.getParameter("incmg_emp_no"));
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		dm.proc_yymm = Util.checkString(req.getParameter("proc_yymm"));
		dm.chg_prv_dept_cd = Util.checkString(req.getParameter("chg_prv_dept_cd"));
		
		dm.chg_aft_dept_cd = (String)hash.get("chg_aft_dept_cd");
		dm.chg_ratio = (String)hash.get("chg_ratio");
		dm.kind = (String)hash.get("kind");

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_BUDG_4100_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_BUDG_4000EJBHome home = (MC_BUDG_4000EJBHome)JNDIManager.getInstance().getHome("MC_BUDG_4000EJB");
			MC_BUDG_4000EJB ejb = home.create();

			ds = ejb.mc_budg_4100_i(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		EJB 수정전 끝 */

		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.incmg_emp_no = (String)hash.get("incmg_emp_no");
		dm.incmg_pers = (String)hash.get("incmg_pers");
		dm.incmg_pers_ipadd = (String)hash.get("incmg_pers_ipadd");
		dm.proc_yymm = (String)hash.get("proc_yymm");
		dm.chg_prv_dept_cd = (String)hash.get("chg_prv_dept_cd");
		dm.chg_aft_dept_cd = (String)hash.get("chg_aft_dept_cd");
		dm.chg_ratio = (String)hash.get("chg_ratio");
		dm.kind = (String)hash.get("kind");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.incmg_emp_no = Util.getSessionParameterValue(req,"incmg_emp_no",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"incmg_pers",true);
		dm.incmg_pers_ipadd = Util.getSessionParameterValue(req,"incmg_pers_ipadd",true);
		dm.proc_yymm = Util.getSessionParameterValue(req,"proc_yymm",true);
		dm.chg_prv_dept_cd = Util.getSessionParameterValue(req,"chg_prv_dept_cd",true);
		dm.chg_aft_dept_cd = Util.getSessionParameterValue(req,"chg_aft_dept_cd",true);
		dm.chg_ratio = Util.getSessionParameterValue(req,"chg_ratio",true);
		dm.kind = Util.getSessionParameterValue(req,"kind",true);
		*******************************************************************************************/
	}
	public void mc_budg_4101_i(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_BUDG_4101_IDataSet ds = null;
		MC_BUDG_4101_IDM dm = new MC_BUDG_4101_IDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.chg_prv_dept_cd = Util.checkString(req.getParameter("chg_prv_dept_cd"));
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_BUDG_4101_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_BUDG_4000EJBHome home = (MC_BUDG_4000EJBHome)JNDIManager.getInstance().getHome("MC_BUDG_4000EJB");
			MC_BUDG_4000EJB ejb = home.create();

			ds = ejb.mc_budg_4101_i(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		EJB 수정전 끝 */

		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.chg_prv_dept_cd = (String)hash.get("chg_prv_dept_cd");
		dm.incmg_pers_ipadd = (String)hash.get("incmg_pers_ipadd");
		dm.incmg_pers = (String)hash.get("incmg_pers");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.chg_prv_dept_cd = Util.getSessionParameterValue(req,"chg_prv_dept_cd",true);
		dm.incmg_pers_ipadd = Util.getSessionParameterValue(req,"incmg_pers_ipadd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"incmg_pers",true);
		*******************************************************************************************/
	}
	public void mc_budg_4102_d(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_BUDG_4102_DDataSet ds = null;
		MC_BUDG_4102_DDM dm = new MC_BUDG_4102_DDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.proc_yymm = Util.checkString(req.getParameter("proc_yymm"));
		dm.chg_prv_dept_cd = Util.checkString(req.getParameter("chg_prv_dept_cd"));
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.incmg_pers_ipadd = req.getRemoteAddr();

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_BUDG_4102_DDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_BUDG_4000EJBHome home = (MC_BUDG_4000EJBHome)JNDIManager.getInstance().getHome("MC_BUDG_4000EJB");
			MC_BUDG_4000EJB ejb = home.create();

			ds = ejb.mc_budg_4102_d(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		EJB 수정전 끝 */

		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.proc_yymm = (String)hash.get("proc_yymm");
		dm.chg_prv_dept_cd = (String)hash.get("chg_prv_dept_cd");
		dm.incmg_pers_ipadd = (String)hash.get("incmg_pers_ipadd");
		dm.incmg_pers = (String)hash.get("incmg_pers");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.proc_yymm = Util.getSessionParameterValue(req,"proc_yymm",true);
		dm.chg_prv_dept_cd = Util.getSessionParameterValue(req,"chg_prv_dept_cd",true);
		dm.incmg_pers_ipadd = Util.getSessionParameterValue(req,"incmg_pers_ipadd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"incmg_pers",true);
		*******************************************************************************************/
	}
	public void mc_budg_4103_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_BUDG_4103_LDataSet ds = null;
		MC_BUDG_4103_LDM dm = new MC_BUDG_4103_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.chg_prv_dept_cd = Util.checkString(req.getParameter("chg_prv_dept_cd"));
		dm.budg_cd = Util.checkString(req.getParameter("budg_cd"));
		dm.proc_yymm = Util.checkString(req.getParameter("proc_yymm"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_BUDG_4103_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_BUDG_4000EJBHome home = (MC_BUDG_4000EJBHome)JNDIManager.getInstance().getHome("MC_BUDG_4000EJB");
			MC_BUDG_4000EJB ejb = home.create();

			ds = ejb.mc_budg_4103_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		EJB 수정전 끝 */

		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.chg_prv_dept_cd = (String)hash.get("chg_prv_dept_cd");
		dm.budg_cd = (String)hash.get("budg_cd");
		dm.proc_yymm = (String)hash.get("proc_yymm");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.chg_prv_dept_cd = Util.getSessionParameterValue(req,"chg_prv_dept_cd",true);
		dm.budg_cd = Util.getSessionParameterValue(req,"budg_cd",true);
		dm.proc_yymm = Util.getSessionParameterValue(req,"proc_yymm",true);
		*******************************************************************************************/
	}
	public void mc_budg_4104_i(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_BUDG_4104_IDataSet ds = null;
		MC_BUDG_4104_IDM dm = new MC_BUDG_4104_IDM();
		
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.yymm = Util.checkString(req.getParameter("yymm"));
		dm.chg_prv_dept_cd = Util.checkString(req.getParameter("chg_prv_dept_cd"));
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		
		dm.chg_aft_dept_cd = (String)hash.get("dept_cd");
		dm.budg_cd = (String)hash.get("budg_cd");
		dm.chg_ratio = (String)hash.get("chg_ratio");

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_BUDG_4104_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_BUDG_4000EJBHome home = (MC_BUDG_4000EJBHome)JNDIManager.getInstance().getHome("MC_BUDG_4000EJB");
			MC_BUDG_4000EJB ejb = home.create();

			ds = ejb.mc_budg_4104_i(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
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
		dm.chg_prv_dept_cd = (String)hash.get("chg_prv_dept_cd");
		dm.incmg_pers = (String)hash.get("incmg_pers");
		dm.incmg_pers_ipadd = (String)hash.get("incmg_pers_ipadd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.yymm = Util.getSessionParameterValue(req,"yymm",true);
		dm.chg_prv_dept_cd = Util.getSessionParameterValue(req,"chg_prv_dept_cd",true);
		dm.chg_aft_dept_cd = Util.getSessionParameterValue(req,"chg_aft_dept_cd",true);
		dm.budg_cd = Util.getSessionParameterValue(req,"budg_cd",true);
		dm.ratio = Util.getSessionParameterValue(req,"ratio",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"incmg_pers",true);
		dm.incmg_pers_ipadd = Util.getSessionParameterValue(req,"incmg_pers_ipadd",true);
		*******************************************************************************************/
	}
	public void mc_budg_4105_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_BUDG_4105_LDataSet ds = null;
		MC_BUDG_4105_LDM dm = new MC_BUDG_4105_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_emp_no = Util.getSessionParameterValue(req,"emp_no",true);
		dm.proc_yymm = Util.checkString(req.getParameter("proc_yymm"));
		dm.chg_prv_dept_cd = Util.checkString(req.getParameter("chg_prv_dept_cd"));
		dm.budg_cd = Util.checkString(req.getParameter("budg_cd"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_BUDG_4105_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_BUDG_4000EJBHome home = (MC_BUDG_4000EJBHome)JNDIManager.getInstance().getHome("MC_BUDG_4000EJB");
			MC_BUDG_4000EJB ejb = home.create();

			ds = ejb.mc_budg_4105_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		EJB 수정전 끝 */

		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.incmg_emp_no = (String)hash.get("incmg_emp_no");
		dm.proc_yymm = (String)hash.get("proc_yymm");
		dm.chg_prv_dept_cd = (String)hash.get("chg_prv_dept_cd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.incmg_emp_no = Util.getSessionParameterValue(req,"incmg_emp_no",true);
		dm.proc_yymm = Util.getSessionParameterValue(req,"proc_yymm",true);
		dm.chg_prv_dept_cd = Util.getSessionParameterValue(req,"chg_prv_dept_cd",true);
		*******************************************************************************************/
	}
	public void mc_budg_4106_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_BUDG_4106_LDataSet ds = null;
		MC_BUDG_4106_LDM dm = new MC_BUDG_4106_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.proc_yymm = Util.checkString(req.getParameter("proc_yymm"));
		dm.chg_prv_dept_cd = Util.checkString(req.getParameter("chg_prv_dept_cd"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_BUDG_4106_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_BUDG_4000EJBHome home = (MC_BUDG_4000EJBHome)JNDIManager.getInstance().getHome("MC_BUDG_4000EJB");
			MC_BUDG_4000EJB ejb = home.create();

			ds = ejb.mc_budg_4106_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		EJB 수정전 끝 */

		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.proc_yymm = (String)hash.get("proc_yymm");
		dm.chg_prv_dept_cd = (String)hash.get("chg_prv_dept_cd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.proc_yymm = Util.getSessionParameterValue(req,"proc_yymm",true);
		dm.chg_prv_dept_cd = Util.getSessionParameterValue(req,"chg_prv_dept_cd",true);
		*******************************************************************************************/
	}
	public void mc_budg_4120_i(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_BUDG_4120_IDataSet ds = null;
		MC_BUDG_4120_IDM dm = new MC_BUDG_4120_IDM();
		
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.chg_aft_dept_cd = Util.checkString(req.getParameter("chg_aft_dept_cd"));
		dm.proc_yymm = Util.checkString(req.getParameter("proc_yymm"));
		
		dm.chg_prv_dept_cd = (String)hash.get("chg_prv_dept_cd");

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_BUDG_4120_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_BUDG_4000EJBHome home = (MC_BUDG_4000EJBHome)JNDIManager.getInstance().getHome("MC_BUDG_4000EJB");
			MC_BUDG_4000EJB ejb = home.create();

			ds = ejb.mc_budg_4120_i(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		EJB 수정전 끝 */

		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.incmg_pers = (String)hash.get("incmg_pers");
		dm.incmg_pers_ipadd = (String)hash.get("incmg_pers_ipadd");
		dm.proc_yymm = (String)hash.get("proc_yymm");
		dm.chg_prv_dept_cd = (String)hash.get("chg_prv_dept_cd");
		dm.chg_aft_dept_cd = (String)hash.get("chg_aft_dept_cd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"incmg_pers",true);
		dm.incmg_pers_ipadd = Util.getSessionParameterValue(req,"incmg_pers_ipadd",true);
		dm.proc_yymm = Util.getSessionParameterValue(req,"proc_yymm",true);
		dm.chg_prv_dept_cd = Util.getSessionParameterValue(req,"chg_prv_dept_cd",true);
		dm.chg_aft_dept_cd = Util.getSessionParameterValue(req,"chg_aft_dept_cd",true);
		*******************************************************************************************/
	}
	public void mc_budg_4122_d(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_BUDG_4122_DDataSet ds = null;
		MC_BUDG_4122_DDM dm = new MC_BUDG_4122_DDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.chg_aft_dept_cd = Util.checkString(req.getParameter("chg_aft_dept_cd"));
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.proc_yymm = Util.checkString(req.getParameter("proc_yymm"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_BUDG_4122_DDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_BUDG_4000EJBHome home = (MC_BUDG_4000EJBHome)JNDIManager.getInstance().getHome("MC_BUDG_4000EJB");
			MC_BUDG_4000EJB ejb = home.create();

			ds = ejb.mc_budg_4122_d(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		EJB 수정전 끝 */

		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.chg_aft_dept_cd = (String)hash.get("chg_aft_dept_cd");
		dm.incmg_pers_ipadd = (String)hash.get("incmg_pers_ipadd");
		dm.incmg_pers = (String)hash.get("incmg_pers");
		dm.proc_yymm = (String)hash.get("proc_yymm");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.chg_aft_dept_cd = Util.getSessionParameterValue(req,"chg_aft_dept_cd",true);
		dm.incmg_pers_ipadd = Util.getSessionParameterValue(req,"incmg_pers_ipadd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"incmg_pers",true);
		dm.proc_yymm = Util.getSessionParameterValue(req,"proc_yymm",true);
		*******************************************************************************************/
	}
	public void mc_budg_4123_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_BUDG_4123_LDataSet ds = null;
		MC_BUDG_4123_LDM dm = new MC_BUDG_4123_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.proc_yymm = Util.checkString(req.getParameter("proc_yymm"));
		dm.chg_aft_dept_cd = Util.checkString(req.getParameter("chg_aft_dept_cd"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_BUDG_4123_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_BUDG_4000EJBHome home = (MC_BUDG_4000EJBHome)JNDIManager.getInstance().getHome("MC_BUDG_4000EJB");
			MC_BUDG_4000EJB ejb = home.create();

			ds = ejb.mc_budg_4123_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		EJB 수정전 끝 */

		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.proc_yymm = (String)hash.get("proc_yymm");
		dm.chg_aft_dept_cd = (String)hash.get("chg_aft_dept_cd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.proc_yymm = Util.getSessionParameterValue(req,"proc_yymm",true);
		dm.chg_aft_dept_cd = Util.getSessionParameterValue(req,"chg_aft_dept_cd",true);
		*******************************************************************************************/
	}
	public void mc_budg_4130_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_BUDG_4130_LDataSet ds = null;
		MC_BUDG_4130_LDM dm = new MC_BUDG_4130_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.proc_yymm = Util.checkString(req.getParameter("proc_yymm"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_BUDG_4130_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_BUDG_4000EJBHome home = (MC_BUDG_4000EJBHome)JNDIManager.getInstance().getHome("MC_BUDG_4000EJB");
			MC_BUDG_4000EJB ejb = home.create();

			ds = ejb.mc_budg_4130_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		EJB 수정전 끝 */

		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.proc_yymm = (String)hash.get("proc_yymm");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.proc_yymm = Util.getSessionParameterValue(req,"proc_yymm",true);
		*******************************************************************************************/
	}
	
	public void mc_budg_4091_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_BUDG_4091_LDataSet ds = null;
		MC_BUDG_4091_LDM dm = new MC_BUDG_4091_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.work_dt = Util.checkString(req.getParameter("yyyymm"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_BUDG_4091_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_BUDG_4000EJBHome home = (MC_BUDG_4000EJBHome)JNDIManager.getInstance().getHome("MC_BUDG_4000EJB");
			MC_BUDG_4000EJB ejb = home.create();

			ds = ejb.mc_budg_4091_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		EJB 수정전 끝 */

		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.work_dt = (String)hash.get("work_dt");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.work_dt = Util.getSessionParameterValue(req,"work_dt",true);
		*******************************************************************************************/
	}
	
	public void mc_budg_4092_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_BUDG_4092_LDataSet ds = null;
		MC_BUDG_4092_LDM dm = new MC_BUDG_4092_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.work_dt = Util.checkString(req.getParameter("work_dt"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_BUDG_4092_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_BUDG_4000EJBHome home = (MC_BUDG_4000EJBHome)JNDIManager.getInstance().getHome("MC_BUDG_4000EJB");
			MC_BUDG_4000EJB ejb = home.create();

			ds = ejb.mc_budg_4092_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		EJB 수정전 끝 */

		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.work_dt = (String)hash.get("work_dt");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.work_dt = Util.getSessionParameterValue(req,"work_dt",true);
		*******************************************************************************************/
	}
}

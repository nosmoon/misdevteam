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

public class MC_COST_3000WB extends chosun.ciis.co.base.wb.BaseWB {
	public void getDummyList(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_COST_9999_DDataSet ds = null;
		MC_COST_9999_DDM dm = new MC_COST_9999_DDM();
		
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.yymm = Util.checkString(req.getParameter("yymm"));
		dm.incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
		
		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_COST_9999_DDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_COST_3000EJBHome home = (MC_COST_3000EJBHome)JNDIManager.getInstance().getHome("MC_COST_3000EJB");
			MC_COST_3000EJB ejb = home.create();
			ds = ejb.mc_cost_9999_d(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
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
		dm.incmg_pers = (String)hash.get("incmg_pers");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.yymm = Util.getSessionParameterValue(req,"yymm",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"incmg_pers",true);
		*******************************************************************************************/
	}
	public void mc_cost_3000_a(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_COST_3000_ADataSet ds = null;
		MC_COST_3000_ADM dm = new MC_COST_3000_ADM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.yymm = Util.checkString(req.getParameter("yymm"));
		dm.clos_clsf = Util.checkString(req.getParameter("clos_clsf"));
		dm.kind = Util.checkString(req.getParameter("kind"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_COST_3000_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_COST_3000EJBHome home = (MC_COST_3000EJBHome)JNDIManager.getInstance().getHome("MC_COST_3000EJB");
			MC_COST_3000EJB ejb = home.create();

			ds = ejb.mc_cost_3000_a(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
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
		dm.clos_clsf = (String)hash.get("clos_clsf");
		dm.kind = (String)hash.get("kind");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.yymm = Util.getSessionParameterValue(req,"yymm",true);
		dm.clos_clsf = Util.getSessionParameterValue(req,"clos_clsf",true);
		dm.kind = Util.getSessionParameterValue(req,"kind",true);
		*******************************************************************************************/
	}
	public void mc_cost_3001_i(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_COST_3001_IDataSet ds = null;
		MC_COST_3001_IDM dm = new MC_COST_3001_IDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.yymm = Util.checkString(req.getParameter("yymm"));
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.incmg_pers_ipadd = req.getRemoteAddr();

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_COST_3001_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_COST_3000EJBHome home = (MC_COST_3000EJBHome)JNDIManager.getInstance().getHome("MC_COST_3000EJB");
			MC_COST_3000EJB ejb = home.create();

			ds = ejb.mc_cost_3001_i(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
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
		dm.incmg_pers = (String)hash.get("incmg_pers");
		dm.incmg_pers_ipadd = (String)hash.get("incmg_pers_ipadd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.yymm = Util.getSessionParameterValue(req,"yymm",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"incmg_pers",true);
		dm.incmg_pers_ipadd = Util.getSessionParameterValue(req,"incmg_pers_ipadd",true);
		*******************************************************************************************/
	}
	public void mc_cost_3002_i(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_COST_3002_IDataSet ds = null;
		MC_COST_3002_IDM dm = new MC_COST_3002_IDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.yymm = Util.checkString(req.getParameter("yymm"));
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.incmg_pers_ipadd = req.getRemoteAddr();

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_COST_3002_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_COST_3000EJBHome home = (MC_COST_3000EJBHome)JNDIManager.getInstance().getHome("MC_COST_3000EJB");
			MC_COST_3000EJB ejb = home.create();

			ds = ejb.mc_cost_3002_i(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
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
		dm.incmg_pers = (String)hash.get("incmg_pers");
		dm.incmg_pers_ipadd = (String)hash.get("incmg_pers_ipadd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.yymm = Util.getSessionParameterValue(req,"yymm",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"incmg_pers",true);
		dm.incmg_pers_ipadd = Util.getSessionParameterValue(req,"incmg_pers_ipadd",true);
		*******************************************************************************************/
	}
	public void mc_cost_3003_i(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_COST_3003_IDataSet ds = null;
		MC_COST_3003_IDM dm = new MC_COST_3003_IDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.yymm = Util.checkString(req.getParameter("yymm"));
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		
		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_COST_3003_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_COST_3000EJBHome home = (MC_COST_3000EJBHome)JNDIManager.getInstance().getHome("MC_COST_3000EJB");
			MC_COST_3000EJB ejb = home.create();

			ds = ejb.mc_cost_3003_i(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
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
		dm.incmg_pers = (String)hash.get("incmg_pers");
		dm.incmg_pers_ipadd = (String)hash.get("incmg_pers_ipadd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.yymm = Util.getSessionParameterValue(req,"yymm",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"incmg_pers",true);
		dm.incmg_pers_ipadd = Util.getSessionParameterValue(req,"incmg_pers_ipadd",true);
		*******************************************************************************************/
	}
	public void mc_cost_3004_i(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_COST_3004_IDataSet ds = null;
		MC_COST_3004_IDM dm = new MC_COST_3004_IDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.yymm = Util.checkString(req.getParameter("yymm"));
		dm.tms_yb = Util.checkString(req.getParameter("tms_yb"));
		dm.tms = Util.unFormatInt(req.getParameter("tms"));
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.incmg_pers_ipadd = req.getRemoteAddr();

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_COST_3004_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_COST_3000EJBHome home = (MC_COST_3000EJBHome)JNDIManager.getInstance().getHome("MC_COST_3000EJB");
			MC_COST_3000EJB ejb = home.create();

			ds = ejb.mc_cost_3004_i(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
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
		dm.tms_yb = (String)hash.get("tms_yb");
		dm.tms = (String)hash.get("tms");
		dm.incmg_pers = (String)hash.get("incmg_pers");
		dm.incmg_pers_ipadd = (String)hash.get("incmg_pers_ipadd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.yymm = Util.getSessionParameterValue(req,"yymm",true);
		dm.tms_yb = Util.getSessionParameterValue(req,"tms_yb",true);
		dm.tms = Util.getSessionParameterValue(req,"tms",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"incmg_pers",true);
		dm.incmg_pers_ipadd = Util.getSessionParameterValue(req,"incmg_pers_ipadd",true);
		*******************************************************************************************/
	}
	public void mc_cost_3005_i(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_COST_3005_IDataSet ds = null;
		MC_COST_3005_IDM dm = new MC_COST_3005_IDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.yymm = Util.checkString(req.getParameter("yymm"));
		dm.tms = Util.unFormatInt(req.getParameter("tms"));
		dm.tms_yb = Util.checkString(req.getParameter("tms_yb"));
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.incmg_pers_ipadd = req.getRemoteAddr();

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_COST_3005_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_COST_3000EJBHome home = (MC_COST_3000EJBHome)JNDIManager.getInstance().getHome("MC_COST_3000EJB");
			MC_COST_3000EJB ejb = home.create();

			ds = ejb.mc_cost_3005_i(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
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
		dm.tms = (String)hash.get("tms");
		dm.tms_yb = (String)hash.get("tms_yb");
		dm.incmg_pers = (String)hash.get("incmg_pers");
		dm.incmg_pers_ipadd = (String)hash.get("incmg_pers_ipadd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.yymm = Util.getSessionParameterValue(req,"yymm",true);
		dm.tms = Util.getSessionParameterValue(req,"tms",true);
		dm.tms_yb = Util.getSessionParameterValue(req,"tms_yb",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"incmg_pers",true);
		dm.incmg_pers_ipadd = Util.getSessionParameterValue(req,"incmg_pers_ipadd",true);
		*******************************************************************************************/
	}
	public void mc_cost_3006_d(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_COST_3006_DDataSet ds = null;
		MC_COST_3006_DDM dm = new MC_COST_3006_DDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.yymm = Util.checkString(req.getParameter("yymm"));
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.incmg_pers_ipadd = req.getRemoteAddr();

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_COST_3006_DDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_COST_3000EJBHome home = (MC_COST_3000EJBHome)JNDIManager.getInstance().getHome("MC_COST_3000EJB");
			MC_COST_3000EJB ejb = home.create();

			ds = ejb.mc_cost_3006_d(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
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
		dm.incmg_pers = (String)hash.get("incmg_pers");
		dm.incmg_pers_ipadd = (String)hash.get("incmg_pers_ipadd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.yymm = Util.getSessionParameterValue(req,"yymm",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"incmg_pers",true);
		dm.incmg_pers_ipadd = Util.getSessionParameterValue(req,"incmg_pers_ipadd",true);
		*******************************************************************************************/
	}
	public void mc_cost_3007_d(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_COST_3007_DDataSet ds = null;
		MC_COST_3007_DDM dm = new MC_COST_3007_DDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.yymm = Util.checkString(req.getParameter("yymm"));
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.incmg_pers_ipadd = req.getRemoteAddr();

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_COST_3007_DDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_COST_3000EJBHome home = (MC_COST_3000EJBHome)JNDIManager.getInstance().getHome("MC_COST_3000EJB");
			MC_COST_3000EJB ejb = home.create();

			ds = ejb.mc_cost_3007_d(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
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
		dm.incmg_pers = (String)hash.get("incmg_pers");
		dm.incmg_pers_ipadd = (String)hash.get("incmg_pers_ipadd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.yymm = Util.getSessionParameterValue(req,"yymm",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"incmg_pers",true);
		dm.incmg_pers_ipadd = Util.getSessionParameterValue(req,"incmg_pers_ipadd",true);
		*******************************************************************************************/
	}
	public void mc_cost_3008_d(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_COST_3008_DDataSet ds = null;
		MC_COST_3008_DDM dm = new MC_COST_3008_DDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.yymm = Util.checkString(req.getParameter("yymm"));
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		
		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_COST_3008_DDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_COST_3000EJBHome home = (MC_COST_3000EJBHome)JNDIManager.getInstance().getHome("MC_COST_3000EJB");
			MC_COST_3000EJB ejb = home.create();

			ds = ejb.mc_cost_3008_d(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
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
		dm.incmg_pers = (String)hash.get("incmg_pers");
		dm.incmg_pers_ipadd = (String)hash.get("incmg_pers_ipadd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.yymm = Util.getSessionParameterValue(req,"yymm",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"incmg_pers",true);
		dm.incmg_pers_ipadd = Util.getSessionParameterValue(req,"incmg_pers_ipadd",true);
		*******************************************************************************************/
	}
	public void mc_cost_3009_d(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_COST_3009_DDataSet ds = null;
		MC_COST_3009_DDM dm = new MC_COST_3009_DDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.yymm = Util.checkString(req.getParameter("yymm"));
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		
		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_COST_3009_DDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_COST_3000EJBHome home = (MC_COST_3000EJBHome)JNDIManager.getInstance().getHome("MC_COST_3000EJB");
			MC_COST_3000EJB ejb = home.create();

			ds = ejb.mc_cost_3009_d(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
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
		dm.incmg_pers = (String)hash.get("incmg_pers");
		dm.incmg_pers_ipadd = (String)hash.get("incmg_pers_ipadd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.yymm = Util.getSessionParameterValue(req,"yymm",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"incmg_pers",true);
		dm.incmg_pers_ipadd = Util.getSessionParameterValue(req,"incmg_pers_ipadd",true);
		*******************************************************************************************/
	}
	public void mc_cost_3010_a(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_COST_3010_ADataSet ds = null;
		MC_COST_3010_ADM dm = new MC_COST_3010_ADM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.yymm = Util.checkString(req.getParameter("yymm"));
		dm.clos_clsf = Util.checkString(req.getParameter("clos_clsf"));
		dm.kind = Util.checkString(req.getParameter("kind"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_COST_3010_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_COST_3000EJBHome home = (MC_COST_3000EJBHome)JNDIManager.getInstance().getHome("MC_COST_3000EJB");
			MC_COST_3000EJB ejb = home.create();

			ds = ejb.mc_cost_3010_a(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
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
		dm.clos_clsf = (String)hash.get("clos_clsf");
		dm.kind = (String)hash.get("kind");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.yymm = Util.getSessionParameterValue(req,"yymm",true);
		dm.clos_clsf = Util.getSessionParameterValue(req,"clos_clsf",true);
		dm.kind = Util.getSessionParameterValue(req,"kind",true);
		*******************************************************************************************/
	}
	public void mc_cost_3011_i(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_COST_3011_IDataSet ds = null;
		MC_COST_3011_IDM dm = new MC_COST_3011_IDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.yymm = Util.checkString(req.getParameter("yymm"));
		dm.clos_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
		dm.incmg_dt = Util.checkString(req.getParameter("incmg_dt"));
		dm.fist_dt = Util.checkString(req.getParameter("fist_dt"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_COST_3011_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_COST_3000EJBHome home = (MC_COST_3000EJBHome)JNDIManager.getInstance().getHome("MC_COST_3000EJB");
			MC_COST_3000EJB ejb = home.create();

			ds = ejb.mc_cost_3011_i(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
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
		dm.clos_pers = (String)hash.get("clos_pers");
		dm.incmg_pers_ipadd = (String)hash.get("incmg_pers_ipadd");
		dm.dept_cd = (String)hash.get("dept_cd");
		dm.incmg_pers = (String)hash.get("incmg_pers");
		dm.incmg_dt = (String)hash.get("incmg_dt");
		dm.fist_dt = (String)hash.get("fist_dt");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.yymm = Util.getSessionParameterValue(req,"yymm",true);
		dm.clos_pers = Util.getSessionParameterValue(req,"clos_pers",true);
		dm.incmg_pers_ipadd = Util.getSessionParameterValue(req,"incmg_pers_ipadd",true);
		dm.dept_cd = Util.getSessionParameterValue(req,"dept_cd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"incmg_pers",true);
		dm.incmg_dt = Util.getSessionParameterValue(req,"incmg_dt",true);
		dm.fist_dt = Util.getSessionParameterValue(req,"fist_dt",true);
		*******************************************************************************************/
	}
	public void mc_cost_3012_d(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_COST_3012_DDataSet ds = null;
		MC_COST_3012_DDM dm = new MC_COST_3012_DDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.yymm = Util.checkString(req.getParameter("yymm"));
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.incmg_pers_ipadd = req.getRemoteAddr();

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_COST_3012_DDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_COST_3000EJBHome home = (MC_COST_3000EJBHome)JNDIManager.getInstance().getHome("MC_COST_3000EJB");
			MC_COST_3000EJB ejb = home.create();

			ds = ejb.mc_cost_3012_d(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
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
		dm.incmg_pers = (String)hash.get("incmg_pers");
		dm.incmg_pers_ipadd = (String)hash.get("incmg_pers_ipadd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.yymm = Util.getSessionParameterValue(req,"yymm",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"incmg_pers",true);
		dm.incmg_pers_ipadd = Util.getSessionParameterValue(req,"incmg_pers_ipadd",true);
		*******************************************************************************************/
	}
	public void mc_cost_3013_i(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_COST_3013_IDataSet ds = null;
		MC_COST_3013_IDM dm = new MC_COST_3013_IDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.yymm = Util.checkString(req.getParameter("yymm"));
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.incmg_pers_ipadd = req.getRemoteAddr();

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_COST_3013_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_COST_3000EJBHome home = (MC_COST_3000EJBHome)JNDIManager.getInstance().getHome("MC_COST_3000EJB");
			MC_COST_3000EJB ejb = home.create();

			ds = ejb.mc_cost_3013_i(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
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
		dm.incmg_pers = (String)hash.get("incmg_pers");
		dm.incmg_pers_ipadd = (String)hash.get("incmg_pers_ipadd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.yymm = Util.getSessionParameterValue(req,"yymm",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"incmg_pers",true);
		dm.incmg_pers_ipadd = Util.getSessionParameterValue(req,"incmg_pers_ipadd",true);
		*******************************************************************************************/
	}
	public void mc_cost_3014_d(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_COST_3014_DDataSet ds = null;
		MC_COST_3014_DDM dm = new MC_COST_3014_DDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.yymm = Util.checkString(req.getParameter("yymm"));
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.incmg_pers_ipadd = req.getRemoteAddr();

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_COST_3014_DDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_COST_3000EJBHome home = (MC_COST_3000EJBHome)JNDIManager.getInstance().getHome("MC_COST_3000EJB");
			MC_COST_3000EJB ejb = home.create();

			ds = ejb.mc_cost_3014_d(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
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
		dm.incmg_pers = (String)hash.get("incmg_pers");
		dm.incmg_pers_ipadd = (String)hash.get("incmg_pers_ipadd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.yymm = Util.getSessionParameterValue(req,"yymm",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"incmg_pers",true);
		dm.incmg_pers_ipadd = Util.getSessionParameterValue(req,"incmg_pers_ipadd",true);
		*******************************************************************************************/
	}
	public void mc_cost_3015_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_COST_3015_LDataSet ds = null;
		MC_COST_3015_LDM dm = new MC_COST_3015_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.yymm = Util.checkString(req.getParameter("yymm"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_COST_3015_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_COST_3000EJBHome home = (MC_COST_3000EJBHome)JNDIManager.getInstance().getHome("MC_COST_3000EJB");
			MC_COST_3000EJB ejb = home.create();

			ds = ejb.mc_cost_3015_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
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
	public void mc_cost_3016_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_COST_3016_LDataSet ds = null;
		MC_COST_3016_LDM dm = new MC_COST_3016_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.yymm = Util.checkString(req.getParameter("yymm"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_COST_3016_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_COST_3000EJBHome home = (MC_COST_3000EJBHome)JNDIManager.getInstance().getHome("MC_COST_3000EJB");
			MC_COST_3000EJB ejb = home.create();

			ds = ejb.mc_cost_3016_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
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
	public void mc_cost_3017_m(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_COST_3017_MDataSet ds = null;
		MC_COST_3017_MDM dm = new MC_COST_3017_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_COST_3017_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_COST_3000EJBHome home = (MC_COST_3000EJBHome)JNDIManager.getInstance().getHome("MC_COST_3000EJB");
			MC_COST_3000EJB ejb = home.create();

			ds = ejb.mc_cost_3017_m(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
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
	public void mc_cost_3018_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_COST_3018_LDataSet ds = null;
		MC_COST_3018_LDM dm = new MC_COST_3018_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.yymm = Util.checkString(req.getParameter("yymm"));
		dm.slip_clsf = Util.checkString(req.getParameter("slip_clsf"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_COST_3018_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_COST_3000EJBHome home = (MC_COST_3000EJBHome)JNDIManager.getInstance().getHome("MC_COST_3000EJB");
			MC_COST_3000EJB ejb = home.create();

			ds = ejb.mc_cost_3018_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
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
		dm.slip_clsf = (String)hash.get("slip_clsf");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.yymm = Util.getSessionParameterValue(req,"yymm",true);
		dm.slip_clsf = Util.getSessionParameterValue(req,"slip_clsf",true);
		*******************************************************************************************/
	}	
	public void mc_cost_3020_m(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_COST_3020_MDataSet ds = null;
		MC_COST_3020_MDM dm = new MC_COST_3020_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_COST_3020_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_COST_3000EJBHome home = (MC_COST_3000EJBHome)JNDIManager.getInstance().getHome("MC_COST_3000EJB");
			MC_COST_3000EJB ejb = home.create();

			ds = ejb.mc_cost_3020_m(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
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
	public void mc_cost_3021_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_COST_3021_LDataSet ds = null;
		MC_COST_3021_LDM dm = new MC_COST_3021_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.yymm = Util.checkString(req.getParameter("yymm"));
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.budg_cd = Util.checkString(req.getParameter("budg_cd"));
		dm.medi_cd = Util.checkString(req.getParameter("medi_cd"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_COST_3021_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_COST_3000EJBHome home = (MC_COST_3000EJBHome)JNDIManager.getInstance().getHome("MC_COST_3000EJB");
			MC_COST_3000EJB ejb = home.create();

			ds = ejb.mc_cost_3021_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
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
		dm.budg_cd = (String)hash.get("budg_cd");
		dm.medi_cd = (String)hash.get("medi_cd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.yymm = Util.getSessionParameterValue(req,"yymm",true);
		dm.dept_cd = Util.getSessionParameterValue(req,"dept_cd",true);
		dm.budg_cd = Util.getSessionParameterValue(req,"budg_cd",true);
		dm.medi_cd = Util.getSessionParameterValue(req,"medi_cd",true);
		*******************************************************************************************/
	}
	public void mc_cost_3022_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_COST_3022_LDataSet ds = null;
		MC_COST_3022_LDM dm = new MC_COST_3022_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.yymm = Util.checkString(req.getParameter("yymm"));
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.budg_cd = Util.checkString(req.getParameter("budg_cd"));
		dm.medi_cd = Util.checkString(req.getParameter("medi_cd"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_COST_3022_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_COST_3000EJBHome home = (MC_COST_3000EJBHome)JNDIManager.getInstance().getHome("MC_COST_3000EJB");
			MC_COST_3000EJB ejb = home.create();

			ds = ejb.mc_cost_3022_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
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
		dm.budg_cd = (String)hash.get("budg_cd");
		dm.medi_cd = (String)hash.get("medi_cd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.yymm = Util.getSessionParameterValue(req,"yymm",true);
		dm.dept_cd = Util.getSessionParameterValue(req,"dept_cd",true);
		dm.budg_cd = Util.getSessionParameterValue(req,"budg_cd",true);
		dm.medi_cd = Util.getSessionParameterValue(req,"medi_cd",true);
		*******************************************************************************************/
	}
	public void mc_cost_3023_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_COST_3023_LDataSet ds = null;
		MC_COST_3023_LDM dm = new MC_COST_3023_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.cd = Util.checkString(req.getParameter("cd"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_COST_3023_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_COST_3000EJBHome home = (MC_COST_3000EJBHome)JNDIManager.getInstance().getHome("MC_COST_3000EJB");
			MC_COST_3000EJB ejb = home.create();

			ds = ejb.mc_cost_3023_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
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
	public void mc_cost_3030_m(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_COST_3030_MDataSet ds = null;
		MC_COST_3030_MDM dm = new MC_COST_3030_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_COST_3030_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_COST_3000EJBHome home = (MC_COST_3000EJBHome)JNDIManager.getInstance().getHome("MC_COST_3000EJB");
			MC_COST_3000EJB ejb = home.create();

			ds = ejb.mc_cost_3030_m(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
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
	public void mc_cost_3031_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_COST_3031_LDataSet ds = null;
		MC_COST_3031_LDM dm = new MC_COST_3031_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.yymm = Util.checkString(req.getParameter("yymm"));
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_COST_3031_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_COST_3000EJBHome home = (MC_COST_3000EJBHome)JNDIManager.getInstance().getHome("MC_COST_3000EJB");
			MC_COST_3000EJB ejb = home.create();

			ds = ejb.mc_cost_3031_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
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
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.yymm = Util.getSessionParameterValue(req,"yymm",true);
		dm.dept_cd = Util.getSessionParameterValue(req,"dept_cd",true);
		*******************************************************************************************/
	}
	public void mc_cost_3040_m(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_COST_3040_MDataSet ds = null;
		MC_COST_3040_MDM dm = new MC_COST_3040_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_COST_3040_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_COST_3000EJBHome home = (MC_COST_3000EJBHome)JNDIManager.getInstance().getHome("MC_COST_3000EJB");
			MC_COST_3000EJB ejb = home.create();

			ds = ejb.mc_cost_3040_m(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
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
	public void mc_cost_3041_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_COST_3041_LDataSet ds = null;
		MC_COST_3041_LDM dm = new MC_COST_3041_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.yymm = Util.checkString(req.getParameter("yymm"));
		dm.tms = Util.checkString(req.getParameter("tms"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_COST_3041_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_COST_3000EJBHome home = (MC_COST_3000EJBHome)JNDIManager.getInstance().getHome("MC_COST_3000EJB");
			MC_COST_3000EJB ejb = home.create();

			ds = ejb.mc_cost_3041_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
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
		dm.tms = (String)hash.get("tms");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.yymm = Util.getSessionParameterValue(req,"yymm",true);
		dm.tms = Util.getSessionParameterValue(req,"tms",true);
		*******************************************************************************************/
	}
	public void mc_cost_3050_m(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_COST_3050_MDataSet ds = null;
		MC_COST_3050_MDM dm = new MC_COST_3050_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_COST_3050_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_COST_3000EJBHome home = (MC_COST_3000EJBHome)JNDIManager.getInstance().getHome("MC_COST_3000EJB");
			MC_COST_3000EJB ejb = home.create();

			ds = ejb.mc_cost_3050_m(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
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
	public void mc_cost_3051_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_COST_3051_LDataSet ds = null;
		MC_COST_3051_LDM dm = new MC_COST_3051_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.yymm = Util.checkString(req.getParameter("yymm"));
		dm.budg_cd = Util.checkString(req.getParameter("budg_cd"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_COST_3051_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_COST_3000EJBHome home = (MC_COST_3000EJBHome)JNDIManager.getInstance().getHome("MC_COST_3000EJB");
			MC_COST_3000EJB ejb = home.create();

			ds = ejb.mc_cost_3051_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
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
		dm.budg_cd = (String)hash.get("budg_cd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.yymm = Util.getSessionParameterValue(req,"yymm",true);
		dm.budg_cd = Util.getSessionParameterValue(req,"budg_cd",true);
		*******************************************************************************************/
	}
	public void mc_cost_3061_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_COST_3061_LDataSet ds = null;
		MC_COST_3061_LDM dm = new MC_COST_3061_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.yymm_fr = Util.checkString(req.getParameter("yymm_fr"));
		dm.yymm_to = Util.checkString(req.getParameter("yymm_to"));
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.len = Util.unFormatInt(req.getParameter("len"));
		
		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_COST_3061_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_COST_3000EJBHome home = (MC_COST_3000EJBHome)JNDIManager.getInstance().getHome("MC_COST_3000EJB");
			MC_COST_3000EJB ejb = home.create();

			ds = ejb.mc_cost_3061_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
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
		dm.len = (String)hash.get("len");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.yymm_fr = Util.getSessionParameterValue(req,"yymm_fr",true);
		dm.yymm_to = Util.getSessionParameterValue(req,"yymm_to",true);
		dm.dept_cd = Util.getSessionParameterValue(req,"dept_cd",true);
		dm.len = Util.getSessionParameterValue(req,"len",true);
		*******************************************************************************************/
	}
	public void mc_cost_3062_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_COST_3062_LDataSet ds = null;
		MC_COST_3062_LDM dm = new MC_COST_3062_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.yymm_fr = Util.checkString(req.getParameter("yymm_fr"));
		dm.yymm_to = Util.checkString(req.getParameter("yymm_to"));
		dm.dept_cd2 = Util.checkString(req.getParameter("dept_cd2"));
		dm.clas_len = Util.unFormatInt(req.getParameter("clas_len"));
		dm.dept_len = Util.unFormatInt(req.getParameter("dept_len"));
		dm.clas_zero = Util.checkString(req.getParameter("clas_zero"));
		dm.dept_zero = Util.checkString(req.getParameter("dept_zero"));		

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_COST_3062_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_COST_3000EJBHome home = (MC_COST_3000EJBHome)JNDIManager.getInstance().getHome("MC_COST_3000EJB");
			MC_COST_3000EJB ejb = home.create();

			ds = ejb.mc_cost_3062_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
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
		dm.dept_cd2 = (String)hash.get("dept_cd2");
		dm.clas_len = (String)hash.get("clas_len");
		dm.dept_len = (String)hash.get("dept_len");
		dm.clas_zero = (String)hash.get("clas_zero");
		dm.dept_zero = (String)hash.get("dept_zero");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.yymm_fr = Util.getSessionParameterValue(req,"yymm_fr",true);
		dm.yymm_to = Util.getSessionParameterValue(req,"yymm_to",true);
		dm.dept_cd2 = Util.getSessionParameterValue(req,"dept_cd2",true);
		dm.clas_len = Util.getSessionParameterValue(req,"clas_len",true);
		dm.dept_len = Util.getSessionParameterValue(req,"dept_len",true);
		dm.clas_zero = Util.getSessionParameterValue(req,"clas_zero",true);
		dm.dept_zero = Util.getSessionParameterValue(req,"dept_zero",true);
		*******************************************************************************************/
	}
	public void mc_cost_3071_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_COST_3071_LDataSet ds = null;
		MC_COST_3071_LDM dm = new MC_COST_3071_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.yymm_fr = Util.checkString(req.getParameter("yymm_fr"));
		dm.yymm_to = Util.checkString(req.getParameter("yymm_to"));
		dm.fix_yn = Util.checkString(req.getParameter("fix_yn"));
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.dept_len = Util.unFormatInt(req.getParameter("dept_len"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_COST_3071_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_COST_3000EJBHome home = (MC_COST_3000EJBHome)JNDIManager.getInstance().getHome("MC_COST_3000EJB");
			MC_COST_3000EJB ejb = home.create();

			ds = ejb.mc_cost_3071_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
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
		dm.fix_yn = (String)hash.get("fix_yn");
		dm.dept_cd = (String)hash.get("dept_cd");
		dm.dept_len = (String)hash.get("dept_len");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.yymm_fr = Util.getSessionParameterValue(req,"yymm_fr",true);
		dm.yymm_to = Util.getSessionParameterValue(req,"yymm_to",true);
		dm.fix_yn = Util.getSessionParameterValue(req,"fix_yn",true);
		dm.dept_cd = Util.getSessionParameterValue(req,"dept_cd",true);
		dm.dept_len = Util.getSessionParameterValue(req,"dept_len",true);
		*******************************************************************************************/
	}
	public void mc_cost_3072_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_COST_3072_LDataSet ds = null;
		MC_COST_3072_LDM dm = new MC_COST_3072_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.clas_len = Util.checkString(req.getParameter("clas_len"));
		dm.clas_zero = Util.checkString(req.getParameter("clas_zero"));
		dm.dept_len = Util.checkString(req.getParameter("dept_len"));
		dm.dept_zero = Util.checkString(req.getParameter("dept_zero"));
		dm.yymm_fr = Util.checkString(req.getParameter("yymm_fr"));
		dm.yymm_to = Util.checkString(req.getParameter("yymm_to"));
		dm.dept_cd2 = Util.checkString(req.getParameter("dept_cd2"));
		dm.fix_yn = Util.checkString(req.getParameter("fix_yn"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_COST_3072_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_COST_3000EJBHome home = (MC_COST_3000EJBHome)JNDIManager.getInstance().getHome("MC_COST_3000EJB");
			MC_COST_3000EJB ejb = home.create();

			ds = ejb.mc_cost_3072_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		EJB 수정전 끝 */

		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.clas_len = (String)hash.get("clas_len");
		dm.clas_zero = (String)hash.get("clas_zero");
		dm.dept_len = (String)hash.get("dept_len");
		dm.dept_zero = (String)hash.get("dept_zero");
		dm.yymm_fr = (String)hash.get("yymm_fr");
		dm.yymm_to = (String)hash.get("yymm_to");
		dm.dept_cd2 = (String)hash.get("dept_cd2");
		dm.fix_yn = (String)hash.get("fix_yn");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.clas_len = Util.getSessionParameterValue(req,"clas_len",true);
		dm.clas_zero = Util.getSessionParameterValue(req,"clas_zero",true);
		dm.dept_len = Util.getSessionParameterValue(req,"dept_len",true);
		dm.dept_zero = Util.getSessionParameterValue(req,"dept_zero",true);
		dm.yymm_fr = Util.getSessionParameterValue(req,"yymm_fr",true);
		dm.yymm_to = Util.getSessionParameterValue(req,"yymm_to",true);
		dm.dept_cd2 = Util.getSessionParameterValue(req,"dept_cd2",true);
		dm.fix_yn = Util.getSessionParameterValue(req,"fix_yn",true);
		*******************************************************************************************/
	}
	
	public void mc_cost_3080_m(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_COST_3080_MDataSet ds = null;
		MC_COST_3080_MDM dm = new MC_COST_3080_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_COST_3080_MDataSet)manager.executeCall(dm);

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
	
	public void mc_cost_3081_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_COST_3081_LDataSet ds = null;
		MC_COST_3081_LDM dm = new MC_COST_3081_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.yymm_fr = Util.checkString(req.getParameter("yymm_fr"));
		dm.yymm_to = Util.checkString(req.getParameter("yymm_to"));
		dm.dstb_clsf_cd = Util.checkString(req.getParameter("dstb_clsf_cd"));
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.dept_len = Util.unFormatInt(req.getParameter("dept_len"));
		dm.dept_cd2 = Util.getSessionParameterValue(req,"deptcd",true);

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_COST_3081_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_COST_3000EJBHome home = (MC_COST_3000EJBHome)JNDIManager.getInstance().getHome("MC_COST_3000EJB");
			MC_COST_3000EJB ejb = home.create();

			ds = ejb.mc_cost_3081_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
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
		dm.dstb_clsf_cd = (String)hash.get("dstb_clsf_cd");
		dm.dept_cd = (String)hash.get("dept_cd");
		dm.dept_len = (String)hash.get("dept_len");
		dm.dept_cd2 = (String)hash.get("dept_cd2");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.yymm_fr = Util.getSessionParameterValue(req,"yymm_fr",true);
		dm.yymm_to = Util.getSessionParameterValue(req,"yymm_to",true);
		dm.dstb_clsf_cd = Util.getSessionParameterValue(req,"dstb_clsf_cd",true);
		dm.dept_cd = Util.getSessionParameterValue(req,"dept_cd",true);
		dm.dept_len = Util.getSessionParameterValue(req,"dept_len",true);
		dm.dept_cd2 = Util.getSessionParameterValue(req,"dept_cd2",true);
		*******************************************************************************************/
	}
	public void mc_cost_3082_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_COST_3082_LDataSet ds = null;
		MC_COST_3082_LDM dm = new MC_COST_3082_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.clas_len = Util.checkString(req.getParameter("clas_len"));
		dm.clas_zero = Util.checkString(req.getParameter("clas_zero"));
		dm.dept_len = Util.checkString(req.getParameter("dept_len"));
		dm.dept_zero = Util.checkString(req.getParameter("dept_zero"));
		dm.yymm_fr = Util.checkString(req.getParameter("yymm_fr"));
		dm.yymm_to = Util.checkString(req.getParameter("yymm_to"));
		dm.dept_cd2 = Util.checkString(req.getParameter("dept_cd2"));
		dm.dstb_clsf_cd = Util.checkString(req.getParameter("dstb_clsf_cd"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_COST_3082_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_COST_3000EJBHome home = (MC_COST_3000EJBHome)JNDIManager.getInstance().getHome("MC_COST_3000EJB");
			MC_COST_3000EJB ejb = home.create();

			ds = ejb.mc_cost_3082_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		EJB 수정전 끝 */

		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.clas_len = (String)hash.get("clas_len");
		dm.clas_zero = (String)hash.get("clas_zero");
		dm.dept_len = (String)hash.get("dept_len");
		dm.dept_zero = (String)hash.get("dept_zero");
		dm.yymm_fr = (String)hash.get("yymm_fr");
		dm.yymm_to = (String)hash.get("yymm_to");
		dm.dept_cd2 = (String)hash.get("dept_cd2");
		dm.dstb_clsf_cd = (String)hash.get("dstb_clsf_cd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.clas_len = Util.getSessionParameterValue(req,"clas_len",true);
		dm.clas_zero = Util.getSessionParameterValue(req,"clas_zero",true);
		dm.dept_len = Util.getSessionParameterValue(req,"dept_len",true);
		dm.dept_zero = Util.getSessionParameterValue(req,"dept_zero",true);
		dm.yymm_fr = Util.getSessionParameterValue(req,"yymm_fr",true);
		dm.yymm_to = Util.getSessionParameterValue(req,"yymm_to",true);
		dm.dept_cd2 = Util.getSessionParameterValue(req,"dept_cd2",true);
		dm.dstb_clsf_cd = Util.getSessionParameterValue(req,"dstb_clsf_cd",true);
		*******************************************************************************************/
	}
	public void mc_cost_3161_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_COST_3161_LDataSet ds = null;
		MC_COST_3161_LDM dm = new MC_COST_3161_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.yymm = Util.checkString(req.getParameter("yymm"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_COST_3161_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_COST_3000EJBHome home = (MC_COST_3000EJBHome)JNDIManager.getInstance().getHome("MC_COST_3000EJB");
			MC_COST_3000EJB ejb = home.create();

			ds = ejb.mc_cost_3161_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
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
	public void mc_cost_3162_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_COST_3162_LDataSet ds = null;
		MC_COST_3162_LDM dm = new MC_COST_3162_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.yymm = Util.checkString(req.getParameter("yymm"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_COST_3162_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_COST_3000EJBHome home = (MC_COST_3000EJBHome)JNDIManager.getInstance().getHome("MC_COST_3000EJB");
			MC_COST_3000EJB ejb = home.create();

			ds = ejb.mc_cost_3162_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
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
	public void mc_cost_3163_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_COST_3163_LDataSet ds = null;
		MC_COST_3163_LDM dm = new MC_COST_3163_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.yymm = Util.checkString(req.getParameter("yymm"));

		dm.print();
		
		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_COST_3163_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작	
		try {
			MC_COST_3000EJBHome home = (MC_COST_3000EJBHome)JNDIManager.getInstance().getHome("MC_COST_3000EJB");
			MC_COST_3000EJB ejb = home.create();

			ds = ejb.mc_cost_3163_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
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
	public void mc_cost_3164_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_COST_3164_LDataSet ds = null;
		MC_COST_3164_LDM dm = new MC_COST_3164_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.yymm = Util.checkString(req.getParameter("yymm"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_COST_3164_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작		
		try {
			MC_COST_3000EJBHome home = (MC_COST_3000EJBHome)JNDIManager.getInstance().getHome("MC_COST_3000EJB");
			MC_COST_3000EJB ejb = home.create();

			ds = ejb.mc_cost_3164_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
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
	public void mc_cost_3165_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_COST_3165_LDataSet ds = null;
		MC_COST_3165_LDM dm = new MC_COST_3165_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.yymm = Util.checkString(req.getParameter("yymm"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_COST_3165_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작			
		try {
			MC_COST_3000EJBHome home = (MC_COST_3000EJBHome)JNDIManager.getInstance().getHome("MC_COST_3000EJB");
			MC_COST_3000EJB ejb = home.create();

			ds = ejb.mc_cost_3165_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
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
	public void mc_cost_3166_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_COST_3166_LDataSet ds = null;
		MC_COST_3166_LDM dm = new MC_COST_3166_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.yymm = Util.checkString(req.getParameter("yymm"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_COST_3166_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작			
		try {
			MC_COST_3000EJBHome home = (MC_COST_3000EJBHome)JNDIManager.getInstance().getHome("MC_COST_3000EJB");
			MC_COST_3000EJB ejb = home.create();

			ds = ejb.mc_cost_3166_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
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
	public void mc_cost_3171_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_COST_3171_LDataSet ds = null;
		MC_COST_3171_LDM dm = new MC_COST_3171_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.yymm_fr = Util.checkString(req.getParameter("yymm_fr"));
		dm.yymm_to = Util.checkString(req.getParameter("yymm_to"));
		dm.dept_cd2 = Util.checkString(req.getParameter("dept_cd2"));
		dm.clas_len = Util.checkString(req.getParameter("clas_len"));
		dm.dept_len = Util.checkString(req.getParameter("dept_len"));
		dm.clas_zero = Util.checkString(req.getParameter("clas_zero"));
		dm.dept_zero = Util.checkString(req.getParameter("dept_zero"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_COST_3171_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_COST_3000EJBHome home = (MC_COST_3000EJBHome)JNDIManager.getInstance().getHome("MC_COST_3000EJB");
			MC_COST_3000EJB ejb = home.create();

			ds = ejb.mc_cost_3171_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
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
		dm.dept_cd2 = (String)hash.get("dept_cd2");
		dm.clas_len = (String)hash.get("clas_len");
		dm.dept_len = (String)hash.get("dept_len");
		dm.clas_zero = (String)hash.get("clas_zero");
		dm.dept_zero = (String)hash.get("dept_zero");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.yymm_fr = Util.getSessionParameterValue(req,"yymm_fr",true);
		dm.yymm_to = Util.getSessionParameterValue(req,"yymm_to",true);
		dm.dept_cd2 = Util.getSessionParameterValue(req,"dept_cd2",true);
		dm.clas_len = Util.getSessionParameterValue(req,"clas_len",true);
		dm.dept_len = Util.getSessionParameterValue(req,"dept_len",true);
		dm.clas_zero = Util.getSessionParameterValue(req,"clas_zero",true);
		dm.dept_zero = Util.getSessionParameterValue(req,"dept_zero",true);
		*******************************************************************************************/
	}
	public void mc_cost_3172_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_COST_3172_LDataSet ds = null;
		MC_COST_3172_LDM dm = new MC_COST_3172_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.yymm_fr = Util.checkString(req.getParameter("yymm_fr"));
		dm.yymm_to = Util.checkString(req.getParameter("yymm_to"));
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.dept_len = Util.checkString(req.getParameter("len"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_COST_3172_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_COST_3000EJBHome home = (MC_COST_3000EJBHome)JNDIManager.getInstance().getHome("MC_COST_3000EJB");
			MC_COST_3000EJB ejb = home.create();

			ds = ejb.mc_cost_3172_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
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
		dm.dept_len = (String)hash.get("dept_len");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.yymm_fr = Util.getSessionParameterValue(req,"yymm_fr",true);
		dm.yymm_to = Util.getSessionParameterValue(req,"yymm_to",true);
		dm.dept_cd = Util.getSessionParameterValue(req,"dept_cd",true);
		dm.dept_len = Util.getSessionParameterValue(req,"dept_len",true);
		*******************************************************************************************/
	}
	public void mc_cost_3181_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_COST_3181_LDataSet ds = null;
		MC_COST_3181_LDM dm = new MC_COST_3181_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.kind = Util.checkString(req.getParameter("kind"));
		dm.yymm_fr = Util.checkString(req.getParameter("yymm_fr"));
		dm.yymm_to = Util.checkString(req.getParameter("yymm_to"));
		dm.dept_cd2 = Util.checkString(req.getParameter("dept_cd2"));
		dm.clas_cd = Util.checkString(req.getParameter("clas_cd"));
		dm.dept_len = Util.checkString(req.getParameter("dept_len"));
		dm.clas_len = Util.checkString(req.getParameter("clas_len"));
		dm.fixfee_yn = Util.checkString(req.getParameter("fixfee_yn"));
		dm.dstb_clsf_cd = Util.checkString(req.getParameter("dstb_clsf_cd"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_COST_3181_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_COST_3000EJBHome home = (MC_COST_3000EJBHome)JNDIManager.getInstance().getHome("MC_COST_3000EJB");
			MC_COST_3000EJB ejb = home.create();

			ds = ejb.mc_cost_3181_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
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
		dm.yymm_fr = (String)hash.get("yymm_fr");
		dm.yymm_to = (String)hash.get("yymm_to");
		dm.dept_cd2 = (String)hash.get("dept_cd2");
		dm.clas_cd = (String)hash.get("clas_cd");
		dm.dept_len = (String)hash.get("dept_len");
		dm.clas_len = (String)hash.get("clas_len");
		dm.fixfee_yn = (String)hash.get("fixfee_yn");
		dm.dstb_clsf_cd = (String)hash.get("dstb_clsf_cd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.kind = Util.getSessionParameterValue(req,"kind",true);
		dm.yymm_fr = Util.getSessionParameterValue(req,"yymm_fr",true);
		dm.yymm_to = Util.getSessionParameterValue(req,"yymm_to",true);
		dm.dept_cd2 = Util.getSessionParameterValue(req,"dept_cd2",true);
		dm.clas_cd = Util.getSessionParameterValue(req,"clas_cd",true);
		dm.dept_len = Util.getSessionParameterValue(req,"dept_len",true);
		dm.clas_len = Util.getSessionParameterValue(req,"clas_len",true);
		dm.fixfee_yn = Util.getSessionParameterValue(req,"fixfee_yn",true);
		dm.dstb_clsf_cd = Util.getSessionParameterValue(req,"dstb_clsf_cd",true);
		*******************************************************************************************/
	}
	public void mc_cost_3191_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_COST_3191_LDataSet ds = null;
		MC_COST_3191_LDM dm = new MC_COST_3191_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.yymm = Util.checkString(req.getParameter("yymm"));
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.budg_cd = Util.checkString(req.getParameter("budg_cd"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_COST_3191_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_COST_3000EJBHome home = (MC_COST_3000EJBHome)JNDIManager.getInstance().getHome("MC_COST_3000EJB");
			MC_COST_3000EJB ejb = home.create();

			ds = ejb.mc_cost_3191_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
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
		dm.budg_cd = (String)hash.get("budg_cd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.yymm = Util.getSessionParameterValue(req,"yymm",true);
		dm.dept_cd = Util.getSessionParameterValue(req,"dept_cd",true);
		dm.budg_cd = Util.getSessionParameterValue(req,"budg_cd",true);
		*******************************************************************************************/
	}
}

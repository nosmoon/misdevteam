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

public class MC_COST_2000WB extends chosun.ciis.co.base.wb.BaseWB {
	public void mc_cost_2000_m(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_COST_2000_MDataSet ds = null;
		MC_COST_2000_MDM dm = new MC_COST_2000_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_COST_2000_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_COST_2000EJBHome home = (MC_COST_2000EJBHome)JNDIManager.getInstance().getHome("MC_COST_2000EJB");
			MC_COST_2000EJB ejb = home.create();

			ds = ejb.mc_cost_2000_m(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
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
	public void mc_cost_2001_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_COST_2001_LDataSet ds = null;
		MC_COST_2001_LDM dm = new MC_COST_2001_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		
		dm.yymm = Util.checkString(req.getParameter("work_cym"));
		dm.cost_clsf = Util.checkString(req.getParameter("cost_clsf"));
		dm.cost_dstb_cd = Util.checkString(req.getParameter("dstb_cd"));
		dm.cost_dstb_cdfr = Util.checkString(req.getParameter("dstb_cdfr"));
		dm.cost_dstb_cdto = Util.checkString(req.getParameter("dstb_cdto"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_COST_2001_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_COST_2000EJBHome home = (MC_COST_2000EJBHome)JNDIManager.getInstance().getHome("MC_COST_2000EJB");
			MC_COST_2000EJB ejb = home.create();

			ds = ejb.mc_cost_2001_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
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
		dm.cost_dstb_cd = (String)hash.get("cost_dstb_cd");
		dm.cost_dstb_cdfr = (String)hash.get("cost_dstb_cdfr");
		dm.cost_dstb_cdto = (String)hash.get("cost_dstb_cdto");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.yymm = Util.getSessionParameterValue(req,"yymm",true);
		dm.cost_clsf = Util.getSessionParameterValue(req,"cost_clsf",true);
		dm.cost_dstb_cd = Util.getSessionParameterValue(req,"cost_dstb_cd",true);
		dm.cost_dstb_cdfr = Util.getSessionParameterValue(req,"cost_dstb_cdfr",true);
		dm.cost_dstb_cdto = Util.getSessionParameterValue(req,"cost_dstb_cdto",true);
		*******************************************************************************************/
	}
	public void mc_cost_2002_i(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_COST_2002_IDataSet ds = null;
		MC_COST_2002_IDM dm = new MC_COST_2002_IDM();
		
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		
		dm.yymm = Util.checkString(req.getParameter("work_cym"));
		dm.incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
		
		dm.mode = (String)hash.get("m");
		dm.cost_dstb_cd = (String)hash.get("cost_dstb_cd");
		dm.dept_cd = (String)hash.get("dept_cd");
		dm.medi_cd = (String)hash.get("medi_cd");
		dm.qty = (String)hash.get("qunt");
		dm.key_cost_cd = (String)hash.get("key_cost_dstb_cd");
		dm.key_dept_cd = (String)hash.get("key_dept_cd");

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_COST_2002_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_COST_2000EJBHome home = (MC_COST_2000EJBHome)JNDIManager.getInstance().getHome("MC_COST_2000EJB");
			MC_COST_2000EJB ejb = home.create();

			ds = ejb.mc_cost_2002_i(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
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
		dm.cost_dstb_cd = (String)hash.get("cost_dstb_cd");
		dm.dept_cd = (String)hash.get("dept_cd");
		dm.medi_cd = (String)hash.get("medi_cd");
		dm.qty = (String)hash.get("qty");
		dm.key_cost_cd = (String)hash.get("key_cost_cd");
		dm.key_dept_cd = (String)hash.get("key_dept_cd");
		dm.incmg_pers_ipadd = (String)hash.get("incmg_pers_ipadd");
		dm.incmg_pers = (String)hash.get("incmg_pers");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.mode = Util.getSessionParameterValue(req,"mode",true);
		dm.yymm = Util.getSessionParameterValue(req,"yymm",true);
		dm.cost_dstb_cd = Util.getSessionParameterValue(req,"cost_dstb_cd",true);
		dm.dept_cd = Util.getSessionParameterValue(req,"dept_cd",true);
		dm.medi_cd = Util.getSessionParameterValue(req,"medi_cd",true);
		dm.qty = Util.getSessionParameterValue(req,"qty",true);
		dm.key_cost_cd = Util.getSessionParameterValue(req,"key_cost_cd",true);
		dm.key_dept_cd = Util.getSessionParameterValue(req,"key_dept_cd",true);
		dm.incmg_pers_ipadd = Util.getSessionParameterValue(req,"incmg_pers_ipadd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"incmg_pers",true);
		*******************************************************************************************/
	}
	public void mc_cost_2003_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_COST_2003_LDataSet ds = null;
		MC_COST_2003_LDM dm = new MC_COST_2003_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		
		dm.yymm = Util.checkString(req.getParameter("work_cym"));
		dm.clos_clsf = Util.checkString(req.getParameter("clos_clsf"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_COST_2003_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_COST_2000EJBHome home = (MC_COST_2000EJBHome)JNDIManager.getInstance().getHome("MC_COST_2000EJB");
			MC_COST_2000EJB ejb = home.create();

			ds = ejb.mc_cost_2003_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
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
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.yymm = Util.getSessionParameterValue(req,"yymm",true);
		dm.clos_clsf = Util.getSessionParameterValue(req,"clos_clsf",true);
		*******************************************************************************************/
	}
	public void mc_cost_2004_d(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_COST_2004_DDataSet ds = null;
		MC_COST_2004_DDM dm = new MC_COST_2004_DDM();
		
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		
		dm.yymm = Util.checkString(req.getParameter("work_cym"));
		
		dm.cost_dstb_cd = (String)hash.get("cost_dstb_cd");
		dm.dept_cd = (String)hash.get("dept_cd");
		dm.medi_cd = (String)hash.get("medi_cd");

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_COST_2004_DDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_COST_2000EJBHome home = (MC_COST_2000EJBHome)JNDIManager.getInstance().getHome("MC_COST_2000EJB");
			MC_COST_2000EJB ejb = home.create();

			ds = ejb.mc_cost_2004_d(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
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
		dm.cost_dstb_cd = (String)hash.get("cost_dstb_cd");
		dm.dept_cd = (String)hash.get("dept_cd");
		dm.medi_cd = (String)hash.get("medi_cd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.yymm = Util.getSessionParameterValue(req,"yymm",true);
		dm.cost_dstb_cd = Util.getSessionParameterValue(req,"cost_dstb_cd",true);
		dm.dept_cd = Util.getSessionParameterValue(req,"dept_cd",true);
		dm.medi_cd = Util.getSessionParameterValue(req,"medi_cd",true);
		*******************************************************************************************/
	}
	public void mc_cost_2010_m(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_COST_2010_MDataSet ds = null;
		MC_COST_2010_MDM dm = new MC_COST_2010_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_COST_2010_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_COST_2000EJBHome home = (MC_COST_2000EJBHome)JNDIManager.getInstance().getHome("MC_COST_2000EJB");
			MC_COST_2000EJB ejb = home.create();

			ds = ejb.mc_cost_2010_m(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
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
	public void mc_cost_2011_m(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_COST_2011_MDataSet ds = null;
		MC_COST_2011_MDM dm = new MC_COST_2011_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_COST_2011_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_COST_2000EJBHome home = (MC_COST_2000EJBHome)JNDIManager.getInstance().getHome("MC_COST_2000EJB");
			MC_COST_2000EJB ejb = home.create();

			ds = ejb.mc_cost_2011_m(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
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
	public void mc_cost_2012_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_COST_2012_LDataSet ds = null;
		MC_COST_2012_LDM dm = new MC_COST_2012_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.yymm = Util.checkString(req.getParameter("work_cym"));
		dm.clsf_cd = Util.checkString(req.getParameter("clsf_cd"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_COST_2012_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_COST_2000EJBHome home = (MC_COST_2000EJBHome)JNDIManager.getInstance().getHome("MC_COST_2000EJB");
			MC_COST_2000EJB ejb = home.create();

			ds = ejb.mc_cost_2012_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
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
		dm.clsf_cd = (String)hash.get("clsf_cd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.yymm = Util.getSessionParameterValue(req,"yymm",true);
		dm.clsf_cd = Util.getSessionParameterValue(req,"clsf_cd",true);
		*******************************************************************************************/
	}
	public void mc_cost_2013_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_COST_2013_LDataSet ds = null;
		MC_COST_2013_LDM dm = new MC_COST_2013_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.yymm = Util.checkString(req.getParameter("yymm"));
		dm.cost_dstb_cd = Util.checkString(req.getParameter("cost_dstb_cd"));
		
		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_COST_2013_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_COST_2000EJBHome home = (MC_COST_2000EJBHome)JNDIManager.getInstance().getHome("MC_COST_2000EJB");
			MC_COST_2000EJB ejb = home.create();

			ds = ejb.mc_cost_2013_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
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
		dm.yymm = (String)hash.get("yymm");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.cost_dstb_cd = Util.getSessionParameterValue(req,"cost_dstb_cd",true);
		dm.yymm = Util.getSessionParameterValue(req,"yymm",true);
		*******************************************************************************************/
	}
	public void mc_cost_2014_d(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_COST_2014_DDataSet ds = null;
		MC_COST_2014_DDM dm = new MC_COST_2014_DDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.yymm = Util.checkString(req.getParameter("yymm"));
		dm.clsf_cd = Util.checkString(req.getParameter("cost_dstb_cd"));
		dm.yymm_fr = Util.checkString(req.getParameter("work_cym"));
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.incmg_pers_ipadd = req.getRemoteAddr();

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_COST_2014_DDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_COST_2000EJBHome home = (MC_COST_2000EJBHome)JNDIManager.getInstance().getHome("MC_COST_2000EJB");
			MC_COST_2000EJB ejb = home.create();

			ds = ejb.mc_cost_2014_d(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
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
		dm.clsf_cd = (String)hash.get("clsf_cd");
		dm.yymm_fr = (String)hash.get("yymm_fr");
		dm.incmg_pers_ipadd = (String)hash.get("incmg_pers_ipadd");
		dm.incmg_pers = (String)hash.get("incmg_pers");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.yymm = Util.getSessionParameterValue(req,"yymm",true);
		dm.clsf_cd = Util.getSessionParameterValue(req,"clsf_cd",true);
		dm.yymm_fr = Util.getSessionParameterValue(req,"yymm_fr",true);
		dm.incmg_pers_ipadd = Util.getSessionParameterValue(req,"incmg_pers_ipadd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"incmg_pers",true);
		*******************************************************************************************/
	}
	public void mc_cost_2015_i(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_COST_2015_IDataSet ds = null;
		MC_COST_2015_IDM dm = new MC_COST_2015_IDM();
		
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.yymm = Util.checkString(req.getParameter("yymm"));
		dm.clsf_cd = Util.checkString(req.getParameter("cost_dstb_cd"));
		dm.yymm_fr = Util.checkString(req.getParameter("work_cym"));
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.incmg_pers_ipadd = req.getRemoteAddr();

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_COST_2015_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_COST_2000EJBHome home = (MC_COST_2000EJBHome)JNDIManager.getInstance().getHome("MC_COST_2000EJB");
			MC_COST_2000EJB ejb = home.create();

			ds = ejb.mc_cost_2015_i(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
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
		dm.clsf_cd = (String)hash.get("clsf_cd");
		dm.yymm_fr = (String)hash.get("yymm_fr");
		dm.incmg_pers_ipadd = (String)hash.get("incmg_pers_ipadd");
		dm.incmg_pers = (String)hash.get("incmg_pers");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.yymm = Util.getSessionParameterValue(req,"yymm",true);
		dm.clsf_cd = Util.getSessionParameterValue(req,"clsf_cd",true);
		dm.yymm_fr = Util.getSessionParameterValue(req,"yymm_fr",true);
		dm.incmg_pers_ipadd = Util.getSessionParameterValue(req,"incmg_pers_ipadd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"incmg_pers",true);
		*******************************************************************************************/
	}
	public void mc_cost_2016_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_COST_2016_LDataSet ds = null;
		MC_COST_2016_LDM dm = new MC_COST_2016_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		
		dm.yymm = Util.checkString(req.getParameter("work_cym"));
		dm.cd = Util.checkString(req.getParameter("cost_dstb_cd"));
		dm.cost_dstb_cd = Util.checkString(req.getParameter("cost_dstb_cd"));
		dm.cost_dstb_fr = Util.checkString(req.getParameter("cost_dstb_fr"));
		dm.cost_dstb_to = Util.checkString(req.getParameter("cost_dstb_to"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_COST_2016_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_COST_2000EJBHome home = (MC_COST_2000EJBHome)JNDIManager.getInstance().getHome("MC_COST_2000EJB");
			MC_COST_2000EJB ejb = home.create();

			ds = ejb.mc_cost_2016_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
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
		dm.cd = (String)hash.get("cd");
		dm.cost_dstb_cd = (String)hash.get("cost_dstb_cd");
		dm.cost_dstb_fr = (String)hash.get("cost_dstb_fr");
		dm.cost_dstb_to = (String)hash.get("cost_dstb_to");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.yymm = Util.getSessionParameterValue(req,"yymm",true);
		dm.cd = Util.getSessionParameterValue(req,"cd",true);
		dm.cost_dstb_cd = Util.getSessionParameterValue(req,"cost_dstb_cd",true);
		dm.cost_dstb_fr = Util.getSessionParameterValue(req,"cost_dstb_fr",true);
		dm.cost_dstb_to = Util.getSessionParameterValue(req,"cost_dstb_to",true);
		*******************************************************************************************/
	}
	public void mc_cost_2017_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_COST_2017_LDataSet ds = null;
		MC_COST_2017_LDM dm = new MC_COST_2017_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_COST_2017_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_COST_2000EJBHome home = (MC_COST_2000EJBHome)JNDIManager.getInstance().getHome("MC_COST_2000EJB");
			MC_COST_2000EJB ejb = home.create();

			ds = ejb.mc_cost_2017_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
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
	
	public void mc_cost_2018_m(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_COST_2018_MDataSet ds = null;
		MC_COST_2018_MDM dm = new MC_COST_2018_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_COST_2018_MDataSet)manager.executeCall(dm);

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

	
	public void mc_cost_2020_m(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_COST_2020_MDataSet ds = null;
		MC_COST_2020_MDM dm = new MC_COST_2020_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_COST_2020_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_COST_2000EJBHome home = (MC_COST_2000EJBHome)JNDIManager.getInstance().getHome("MC_COST_2000EJB");
			MC_COST_2000EJB ejb = home.create();

			ds = ejb.mc_cost_2020_m(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
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
	public void mc_cost_2021_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_COST_2021_LDataSet ds = null;
		MC_COST_2021_LDM dm = new MC_COST_2021_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.yymm = Util.checkString(req.getParameter("work_cym"));
		dm.sql = Util.checkString(req.getParameter("mm_chk"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_COST_2021_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_COST_2000EJBHome home = (MC_COST_2000EJBHome)JNDIManager.getInstance().getHome("MC_COST_2000EJB");
			MC_COST_2000EJB ejb = home.create();

			ds = ejb.mc_cost_2021_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
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
		dm.sql = (String)hash.get("sql");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.yymm = Util.getSessionParameterValue(req,"yymm",true);
		dm.sql = Util.getSessionParameterValue(req,"sql",true);
		*******************************************************************************************/
	}
	public void mc_cost_2022_i(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_COST_2022_IDataSet ds = null;
		MC_COST_2022_IDM dm = new MC_COST_2022_IDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.yymm = Util.checkString(req.getParameter("work_cym"));
		dm.option = Util.checkString(req.getParameter("option"));
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.incmg_pers_ipadd = req.getRemoteAddr();

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_COST_2022_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_COST_2000EJBHome home = (MC_COST_2000EJBHome)JNDIManager.getInstance().getHome("MC_COST_2000EJB");
			MC_COST_2000EJB ejb = home.create();

			ds = ejb.mc_cost_2022_i(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
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
		dm.option = (String)hash.get("option");
		dm.incmg_pers = (String)hash.get("incmg_pers");
		dm.incmg_pers_ipadd = (String)hash.get("incmg_pers_ipadd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.yymm = Util.getSessionParameterValue(req,"yymm",true);
		dm.option = Util.getSessionParameterValue(req,"option",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"incmg_pers",true);
		dm.incmg_pers_ipadd = Util.getSessionParameterValue(req,"incmg_pers_ipadd",true);
		*******************************************************************************************/
	}
	public void mc_cost_2023_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_COST_2023_LDataSet ds = null;
		MC_COST_2023_LDM dm = new MC_COST_2023_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.yymm = Util.checkString(req.getParameter("work_cym"));
		dm.clos_clsf = Util.checkString(req.getParameter("clos_clsf"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_COST_2023_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_COST_2000EJBHome home = (MC_COST_2000EJBHome)JNDIManager.getInstance().getHome("MC_COST_2000EJB");
			MC_COST_2000EJB ejb = home.create();

			ds = ejb.mc_cost_2023_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
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
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.yymm = Util.getSessionParameterValue(req,"yymm",true);
		dm.clos_clsf = Util.getSessionParameterValue(req,"clos_clsf",true);
		*******************************************************************************************/
	}
	public void mc_cost_2030_m(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_COST_2030_MDataSet ds = null;
		MC_COST_2030_MDM dm = new MC_COST_2030_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_COST_2030_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_COST_2000EJBHome home = (MC_COST_2000EJBHome)JNDIManager.getInstance().getHome("MC_COST_2000EJB");
			MC_COST_2000EJB ejb = home.create();

			ds = ejb.mc_cost_2030_m(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
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
	public void mc_cost_2031_i(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_COST_2031_IDataSet ds = null;
		MC_COST_2031_IDM dm = new MC_COST_2031_IDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.yymm = Util.checkString(req.getParameter("work_cym"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_COST_2031_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_COST_2000EJBHome home = (MC_COST_2000EJBHome)JNDIManager.getInstance().getHome("MC_COST_2000EJB");
			MC_COST_2000EJB ejb = home.create();

			ds = ejb.mc_cost_2031_i(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
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
	public void mc_cost_2032_d(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_COST_2032_DDataSet ds = null;
		MC_COST_2032_DDM dm = new MC_COST_2032_DDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.yymm = Util.checkString(req.getParameter("work_cym"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_COST_2032_DDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_COST_2000EJBHome home = (MC_COST_2000EJBHome)JNDIManager.getInstance().getHome("MC_COST_2000EJB");
			MC_COST_2000EJB ejb = home.create();

			ds = ejb.mc_cost_2032_d(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
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
	public void mc_cost_2033_d(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_COST_2033_DDataSet ds = null;
		MC_COST_2033_DDM dm = new MC_COST_2033_DDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.yymm = Util.checkString(req.getParameter("work_cym"));
		dm.incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
		dm.incmg_pers_ipadd = req.getRemoteAddr();

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_COST_2033_DDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_COST_2000EJBHome home = (MC_COST_2000EJBHome)JNDIManager.getInstance().getHome("MC_COST_2000EJB");
			MC_COST_2000EJB ejb = home.create();

			ds = ejb.mc_cost_2033_d(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
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
	public void mc_cost_2034_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_COST_2034_LDataSet ds = null;
		MC_COST_2034_LDM dm = new MC_COST_2034_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.yymm = Util.checkString(req.getParameter("work_cym"));
		dm.clos_clsf = Util.checkString(req.getParameter("clos_clsf"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_COST_2034_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_COST_2000EJBHome home = (MC_COST_2000EJBHome)JNDIManager.getInstance().getHome("MC_COST_2000EJB");
			MC_COST_2000EJB ejb = home.create();

			ds = ejb.mc_cost_2034_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
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
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.yymm = Util.getSessionParameterValue(req,"yymm",true);
		dm.clos_clsf = Util.getSessionParameterValue(req,"clos_clsf",true);
		*******************************************************************************************/
	}
	public void mc_cost_2035_i(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_COST_2035_IDataSet ds = null;
		MC_COST_2035_IDM dm = new MC_COST_2035_IDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.yymm = Util.checkString(req.getParameter("work_cym"));
		dm.incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
		dm.incmg_pers_ipadd = req.getRemoteAddr();

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_COST_2035_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_COST_2000EJBHome home = (MC_COST_2000EJBHome)JNDIManager.getInstance().getHome("MC_COST_2000EJB");
			MC_COST_2000EJB ejb = home.create();

			ds = ejb.mc_cost_2035_i(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
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
	public void mc_cost_2036_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_COST_2036_LDataSet ds = null;
		MC_COST_2036_LDM dm = new MC_COST_2036_LDM();

//		dm.cmpy_cd = Util.checkString(req.getParameter("cmpycd"));
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
		dm.clos_mm = Util.checkString(req.getParameter("clos_mm"));
		dm.slip_dtls_clas = Util.checkString(req.getParameter("slip_dtls_clas"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_COST_2036_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_COST_2000EJBHome home = (MC_COST_2000EJBHome)JNDIManager.getInstance().getHome("MC_COST_2000EJB");
			MC_COST_2000EJB ejb = home.create();

			ds = ejb.mc_cost_2036_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		EJB 수정전 끝 */

		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.slip_clsf_cd = (String)hash.get("slip_clsf_cd");
		dm.clos_mm = (String)hash.get("clos_mm");
		dm.slip_dtls_clas = (String)hash.get("slip_dtls_clas");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.slip_clsf_cd = Util.getSessionParameterValue(req,"slip_clsf_cd",true);
		dm.clos_mm = Util.getSessionParameterValue(req,"clos_mm",true);
		dm.slip_dtls_clas = Util.getSessionParameterValue(req,"slip_dtls_clas",true);
		*******************************************************************************************/
	}
	public void mc_cost_2040_m(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_COST_2040_MDataSet ds = null;
		MC_COST_2040_MDM dm = new MC_COST_2040_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_COST_2040_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_COST_2000EJBHome home = (MC_COST_2000EJBHome)JNDIManager.getInstance().getHome("MC_COST_2000EJB");
			MC_COST_2000EJB ejb = home.create();

			ds = ejb.mc_cost_2040_m(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
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
	public void mc_cost_2041_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_COST_2041_LDataSet ds = null;
		MC_COST_2041_LDM dm = new MC_COST_2041_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.yymm = Util.checkString(req.getParameter("work_cym"));
		dm.cost_clsf = Util.checkString(req.getParameter("cost_clsf"));
		dm.cost_dstb_cd = Util.checkString(req.getParameter("cost_dstb_cd"));
		dm.cost_dstb_cdfr = Util.checkString(req.getParameter("cost_dstb_cdfr"));
		dm.cost_dstb_cdto = Util.checkString(req.getParameter("cost_dstb_cdto"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_COST_2041_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_COST_2000EJBHome home = (MC_COST_2000EJBHome)JNDIManager.getInstance().getHome("MC_COST_2000EJB");
			MC_COST_2000EJB ejb = home.create();

			ds = ejb.mc_cost_2041_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
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
		dm.cost_dstb_cd = (String)hash.get("cost_dstb_cd");
		dm.cost_dstb_cdfr = (String)hash.get("cost_dstb_cdfr");
		dm.cost_dstb_cdto = (String)hash.get("cost_dstb_cdto");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.yymm = Util.getSessionParameterValue(req,"yymm",true);
		dm.cost_clsf = Util.getSessionParameterValue(req,"cost_clsf",true);
		dm.cost_dstb_cd = Util.getSessionParameterValue(req,"cost_dstb_cd",true);
		dm.cost_dstb_cdfr = Util.getSessionParameterValue(req,"cost_dstb_cdfr",true);
		dm.cost_dstb_cdto = Util.getSessionParameterValue(req,"cost_dstb_cdto",true);
		*******************************************************************************************/
	}
	public void mc_cost_2042_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_COST_2042_LDataSet ds = null;
		MC_COST_2042_LDM dm = new MC_COST_2042_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.yymm = Util.checkString(req.getParameter("work_cym"));
		dm.dstb_cd = Util.checkString(req.getParameter("cost_dstb_cd_grid"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_COST_2042_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_COST_2000EJBHome home = (MC_COST_2000EJBHome)JNDIManager.getInstance().getHome("MC_COST_2000EJB");
			MC_COST_2000EJB ejb = home.create();

			ds = ejb.mc_cost_2042_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
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
		dm.dstb_cd = (String)hash.get("dstb_cd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.yymm = Util.getSessionParameterValue(req,"yymm",true);
		dm.dstb_cd = Util.getSessionParameterValue(req,"dstb_cd",true);
		*******************************************************************************************/
	}
	public void mc_cost_2043_d(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_COST_2043_DDataSet ds = null;
		MC_COST_2043_DDM dm = new MC_COST_2043_DDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.yymm = Util.checkString(req.getParameter("work_cym"));
		dm.dstb_cd = Util.checkString(req.getParameter("key_cost_dstb_cd"));
		dm.medi_cd = Util.checkString(req.getParameter("key_medi_cd"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_COST_2043_DDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_COST_2000EJBHome home = (MC_COST_2000EJBHome)JNDIManager.getInstance().getHome("MC_COST_2000EJB");
			MC_COST_2000EJB ejb = home.create();

			ds = ejb.mc_cost_2043_d(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
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
		dm.dstb_cd = (String)hash.get("dstb_cd");
		dm.medi_cd = (String)hash.get("medi_cd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.yymm = Util.getSessionParameterValue(req,"yymm",true);
		dm.dstb_cd = Util.getSessionParameterValue(req,"dstb_cd",true);
		dm.medi_cd = Util.getSessionParameterValue(req,"medi_cd",true);
		*******************************************************************************************/
	}
	public void mc_cost_2044_d(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_COST_2044_DDataSet ds = null;
		MC_COST_2044_DDM dm = new MC_COST_2044_DDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.yymm = Util.checkString(req.getParameter("work_cym"));
		dm.dstb_cd = Util.checkString(req.getParameter("key_cost_dstb_cd"));
		dm.dept_cd = Util.checkString(req.getParameter("key_dept_cd"));
		dm.medi_cd = Util.checkString(req.getParameter("key_medi_cd"));
		dm.incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
		dm.incmg_pers_ipadd = req.getRemoteAddr();

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_COST_2044_DDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_COST_2000EJBHome home = (MC_COST_2000EJBHome)JNDIManager.getInstance().getHome("MC_COST_2000EJB");
			MC_COST_2000EJB ejb = home.create();

			ds = ejb.mc_cost_2044_d(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
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
		dm.dstb_cd = (String)hash.get("dstb_cd");
		dm.dept_cd = (String)hash.get("dept_cd");
		dm.medi_cd = (String)hash.get("medi_cd");
		dm.incmg_pers = (String)hash.get("incmg_pers");
		dm.incmg_pers_ipadd = (String)hash.get("incmg_pers_ipadd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.yymm = Util.getSessionParameterValue(req,"yymm",true);
		dm.dstb_cd = Util.getSessionParameterValue(req,"dstb_cd",true);
		dm.dept_cd = Util.getSessionParameterValue(req,"dept_cd",true);
		dm.medi_cd = Util.getSessionParameterValue(req,"medi_cd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"incmg_pers",true);
		dm.incmg_pers_ipadd = Util.getSessionParameterValue(req,"incmg_pers_ipadd",true);
		*******************************************************************************************/
	}
	public void mc_cost_2045_d(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_COST_2045_DDataSet ds = null;
		MC_COST_2045_DDM dm = new MC_COST_2045_DDM();
		
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.yymm = Util.checkString(req.getParameter("work_cym"));
		
		dm.cost_dstb_cd = Util.checkString(req.getParameter("key_cost_dstb_cd"));
		dm.dept_cd = Util.checkString(req.getParameter("key_dept_cd"));
		dm.medi_cd = Util.checkString(req.getParameter("key_medi_cd"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_COST_2045_DDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_COST_2000EJBHome home = (MC_COST_2000EJBHome)JNDIManager.getInstance().getHome("MC_COST_2000EJB");
			MC_COST_2000EJB ejb = home.create();

			ds = ejb.mc_cost_2045_d(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
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
		dm.cost_dstb_cd = (String)hash.get("cost_dstb_cd");
		dm.dept_cd = (String)hash.get("dept_cd");
		dm.medi_cd = (String)hash.get("medi_cd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.yymm = Util.getSessionParameterValue(req,"yymm",true);
		dm.cost_dstb_cd = Util.getSessionParameterValue(req,"cost_dstb_cd",true);
		dm.dept_cd = Util.getSessionParameterValue(req,"dept_cd",true);
		dm.medi_cd = Util.getSessionParameterValue(req,"medi_cd",true);
		*******************************************************************************************/
	}
	public void mc_cost_2046_i(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_COST_2046_IDataSet ds = null;
		MC_COST_2046_IDM dm = new MC_COST_2046_IDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.yymm = Util.checkString(req.getParameter("work_cym"));
		dm.cost_dstb_cd = Util.checkString(req.getParameter("cost_dstb_cd"));
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.medi_cd = Util.checkString(req.getParameter("medi_cd"));
		dm.qty = Util.unFormatInt(req.getParameter("qunt"));
		dm.incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
		dm.incmg_pers_ipadd = req.getRemoteAddr();

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_COST_2046_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_COST_2000EJBHome home = (MC_COST_2000EJBHome)JNDIManager.getInstance().getHome("MC_COST_2000EJB");
			MC_COST_2000EJB ejb = home.create();

			ds = ejb.mc_cost_2046_i(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
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
		dm.cost_dstb_cd = (String)hash.get("cost_dstb_cd");
		dm.dept_cd = (String)hash.get("dept_cd");
		dm.medi_cd = (String)hash.get("medi_cd");
		dm.qty = (String)hash.get("qty");
		dm.incmg_pers = (String)hash.get("incmg_pers");
		dm.incmg_pers_ipadd = (String)hash.get("incmg_pers_ipadd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.yymm = Util.getSessionParameterValue(req,"yymm",true);
		dm.cost_dstb_cd = Util.getSessionParameterValue(req,"cost_dstb_cd",true);
		dm.dept_cd = Util.getSessionParameterValue(req,"dept_cd",true);
		dm.medi_cd = Util.getSessionParameterValue(req,"medi_cd",true);
		dm.qty = Util.getSessionParameterValue(req,"qty",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"incmg_pers",true);
		dm.incmg_pers_ipadd = Util.getSessionParameterValue(req,"incmg_pers_ipadd",true);
		*******************************************************************************************/
	}
	public void mc_cost_2047_i(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_COST_2047_IDataSet ds = null;
		MC_COST_2047_IDM dm = new MC_COST_2047_IDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.yymm = Util.checkString(req.getParameter("work_cym"));
		dm.cost_dstb_cd = Util.checkString(req.getParameter("cost_dstb_cd"));
		dm.medi_cd = Util.checkString(req.getParameter("medi_cd"));
		dm.qty = Util.unFormatInt(req.getParameter("qunt"));
		dm.incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
		dm.incmg_pers_ipadd = req.getRemoteAddr();

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_COST_2047_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_COST_2000EJBHome home = (MC_COST_2000EJBHome)JNDIManager.getInstance().getHome("MC_COST_2000EJB");
			MC_COST_2000EJB ejb = home.create();

			ds = ejb.mc_cost_2047_i(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
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
		dm.cost_dstb_cd = (String)hash.get("cost_dstb_cd");
		dm.medi_cd = (String)hash.get("medi_cd");
		dm.qty = (String)hash.get("qty");
		dm.incmg_pers = (String)hash.get("incmg_pers");
		dm.incmg_pers_ipadd = (String)hash.get("incmg_pers_ipadd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.yymm = Util.getSessionParameterValue(req,"yymm",true);
		dm.cost_dstb_cd = Util.getSessionParameterValue(req,"cost_dstb_cd",true);
		dm.medi_cd = Util.getSessionParameterValue(req,"medi_cd",true);
		dm.qty = Util.getSessionParameterValue(req,"qty",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"incmg_pers",true);
		dm.incmg_pers_ipadd = Util.getSessionParameterValue(req,"incmg_pers_ipadd",true);
		*******************************************************************************************/
	}
	public void mc_cost_2050_m(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_COST_2050_MDataSet ds = null;
		MC_COST_2050_MDM dm = new MC_COST_2050_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.ss_deptcd = Util.checkString(req.getParameter("ss_deptcd"));
		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_COST_2050_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_COST_2000EJBHome home = (MC_COST_2000EJBHome)JNDIManager.getInstance().getHome("MC_COST_2000EJB");
			MC_COST_2000EJB ejb = home.create();

			ds = ejb.mc_cost_2050_m(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
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
	public void mc_cost_2051_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_COST_2051_LDataSet ds = null;
		MC_COST_2051_LDM dm = new MC_COST_2051_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.yymm = Util.checkString(req.getParameter("work_cym"));
		dm.cost_clsf = Util.checkString(req.getParameter("cost_clsf"));
		dm.cost_dstb_cd = Util.checkString(req.getParameter("cost_dstb_cd"));
		dm.cost_dstb_cdfr = Util.checkString(req.getParameter("cost_dstb_cdfr"));
		dm.cost_dstb_cdto = Util.checkString(req.getParameter("cost_dstb_cdto"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_COST_2051_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_COST_2000EJBHome home = (MC_COST_2000EJBHome)JNDIManager.getInstance().getHome("MC_COST_2000EJB");
			MC_COST_2000EJB ejb = home.create();

			ds = ejb.mc_cost_2051_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
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
		dm.cost_dstb_cd = (String)hash.get("cost_dstb_cd");
		dm.cost_dstb_cdfr = (String)hash.get("cost_dstb_cdfr");
		dm.cost_dstb_cdto = (String)hash.get("cost_dstb_cdto");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.yymm = Util.getSessionParameterValue(req,"yymm",true);
		dm.cost_clsf = Util.getSessionParameterValue(req,"cost_clsf",true);
		dm.cost_dstb_cd = Util.getSessionParameterValue(req,"cost_dstb_cd",true);
		dm.cost_dstb_cdfr = Util.getSessionParameterValue(req,"cost_dstb_cdfr",true);
		dm.cost_dstb_cdto = Util.getSessionParameterValue(req,"cost_dstb_cdto",true);
		*******************************************************************************************/
	}
	public void mc_cost_2052_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_COST_2052_LDataSet ds = null;
		MC_COST_2052_LDM dm = new MC_COST_2052_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.yymm = Util.checkString(req.getParameter("work_cym"));
		dm.clos_clsf = Util.checkString(req.getParameter("clos_clsf"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_COST_2052_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_COST_2000EJBHome home = (MC_COST_2000EJBHome)JNDIManager.getInstance().getHome("MC_COST_2000EJB");
			MC_COST_2000EJB ejb = home.create();

			ds = ejb.mc_cost_2052_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
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
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.yymm = Util.getSessionParameterValue(req,"yymm",true);
		dm.clos_clsf = Util.getSessionParameterValue(req,"clos_clsf",true);
		*******************************************************************************************/
	}
	public void mc_cost_2053_u(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_COST_2053_UDataSet ds = null;
		MC_COST_2053_UDM dm = new MC_COST_2053_UDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.dstb_cd = Util.checkString(req.getParameter("cost_dstb_cd"));
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.qty = Util.unFormatInt(req.getParameter("qunt"));
		dm.incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
		dm.yymm = Util.checkString(req.getParameter("work_cym"));
		dm.key_dstb_cd = Util.checkString(req.getParameter("key_cost_dstb_cd"));
		dm.key_dept_cd = Util.checkString(req.getParameter("key_dept_cd"));
		dm.key_medi_cd = req.getParameter("key_medi_cd");

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_COST_2053_UDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_COST_2000EJBHome home = (MC_COST_2000EJBHome)JNDIManager.getInstance().getHome("MC_COST_2000EJB");
			MC_COST_2000EJB ejb = home.create();

			ds = ejb.mc_cost_2053_u(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		EJB 수정전 끝 */

		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.dstb_cd = (String)hash.get("dstb_cd");
		dm.dept_cd = (String)hash.get("dept_cd");
		dm.qty = (String)hash.get("qty");
		dm.incmg_pers = (String)hash.get("incmg_pers");
		dm.yymm = (String)hash.get("yymm");
		dm.key_dstb_cd = (String)hash.get("key_dstb_cd");
		dm.key_dept_cd = (String)hash.get("key_dept_cd");
		dm.key_medi_cd = (String)hash.get("key_medi_cd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.dstb_cd = Util.getSessionParameterValue(req,"dstb_cd",true);
		dm.dept_cd = Util.getSessionParameterValue(req,"dept_cd",true);
		dm.qty = Util.getSessionParameterValue(req,"qty",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"incmg_pers",true);
		dm.yymm = Util.getSessionParameterValue(req,"yymm",true);
		dm.key_dstb_cd = Util.getSessionParameterValue(req,"key_dstb_cd",true);
		dm.key_dept_cd = Util.getSessionParameterValue(req,"key_dept_cd",true);
		dm.key_medi_cd = Util.getSessionParameterValue(req,"key_medi_cd",true);
		*******************************************************************************************/
	}
	public void mc_cost_2054_i(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_COST_2054_IDataSet ds = null;
		MC_COST_2054_IDM dm = new MC_COST_2054_IDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.yymm = Util.checkString(req.getParameter("work_cym"));
		dm.dstb_cd = Util.checkString(req.getParameter("cost_dstb_cd"));
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.medi_cd = req.getParameter("medi_cd");
		dm.qty = Util.unFormatInt(req.getParameter("qunt"));
		dm.incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
		dm.incmg_pers_ipadd = req.getRemoteAddr();

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_COST_2054_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_COST_2000EJBHome home = (MC_COST_2000EJBHome)JNDIManager.getInstance().getHome("MC_COST_2000EJB");
			MC_COST_2000EJB ejb = home.create();

			ds = ejb.mc_cost_2054_i(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
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
		dm.dstb_cd = (String)hash.get("dstb_cd");
		dm.dept_cd = (String)hash.get("dept_cd");
		dm.medi_cd = (String)hash.get("medi_cd");
		dm.qty = (String)hash.get("qty");
		dm.incmg_pers = (String)hash.get("incmg_pers");
		dm.incmg_pers_ipadd = (String)hash.get("incmg_pers_ipadd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.yymm = Util.getSessionParameterValue(req,"yymm",true);
		dm.dstb_cd = Util.getSessionParameterValue(req,"dstb_cd",true);
		dm.dept_cd = Util.getSessionParameterValue(req,"dept_cd",true);
		dm.medi_cd = Util.getSessionParameterValue(req,"medi_cd",true);
		dm.qty = Util.getSessionParameterValue(req,"qty",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"incmg_pers",true);
		dm.incmg_pers_ipadd = Util.getSessionParameterValue(req,"incmg_pers_ipadd",true);
		*******************************************************************************************/
	}
	public void mc_cost_2055_d(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_COST_2055_DDataSet ds = null;
		MC_COST_2055_DDM dm = new MC_COST_2055_DDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.yymm = Util.checkString(req.getParameter("work_cym"));
		dm.dstb_cd = Util.checkString(req.getParameter("cost_dstb_cd"));
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.medi_cd = Util.checkString(req.getParameter("medi_cd"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_COST_2055_DDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_COST_2000EJBHome home = (MC_COST_2000EJBHome)JNDIManager.getInstance().getHome("MC_COST_2000EJB");
			MC_COST_2000EJB ejb = home.create();

			ds = ejb.mc_cost_2055_d(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
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
		dm.dstb_cd = (String)hash.get("dstb_cd");
		dm.dept_cd = (String)hash.get("dept_cd");
		dm.medi_cd = (String)hash.get("medi_cd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.yymm = Util.getSessionParameterValue(req,"yymm",true);
		dm.dstb_cd = Util.getSessionParameterValue(req,"dstb_cd",true);
		dm.dept_cd = Util.getSessionParameterValue(req,"dept_cd",true);
		dm.medi_cd = Util.getSessionParameterValue(req,"medi_cd",true);
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
			MC_COST_2000EJBHome home = (MC_COST_2000EJBHome)JNDIManager.getInstance().getHome("MC_COST_2000EJB");
			MC_COST_2000EJB ejb = home.create();
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

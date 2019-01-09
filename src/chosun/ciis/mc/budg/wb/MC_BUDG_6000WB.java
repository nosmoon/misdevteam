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

public class MC_BUDG_6000WB extends chosun.ciis.co.base.wb.BaseWB {
	public void mc_budg_6010_m(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_BUDG_6010_MDataSet ds = null;
		MC_BUDG_6010_MDM dm = new MC_BUDG_6010_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.yyyy = Util.checkString(req.getParameter("yyyy"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_BUDG_6010_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_BUDG_6000EJBHome home = (MC_BUDG_6000EJBHome)JNDIManager.getInstance().getHome("MC_BUDG_6000EJB");
			MC_BUDG_6000EJB ejb = home.create();

			ds = ejb.mc_budg_6010_m(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
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
	public void mc_budg_6011_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_BUDG_6011_LDataSet ds = null;
		MC_BUDG_6011_LDM dm = new MC_BUDG_6011_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.len = Util.checkString(req.getParameter("len"));
		dm.level = Util.checkString(req.getParameter("level"));
		dm.budg_clas_frcd = Util.checkString(req.getParameter("budg_clas_frcd"));
		dm.budg_clas_tocd = Util.checkString(req.getParameter("budg_clas_tocd"));
		dm.budg_frym = Util.checkString(req.getParameter("budg_frym"));
		dm.budg_toym = Util.checkString(req.getParameter("budg_toym"));
		dm.dept_frcd = Util.checkString(req.getParameter("dept_frcd"));
		dm.dept_tocd = Util.checkString(req.getParameter("dept_tocd"));
		dm.tms = Util.checkString(req.getParameter("tms"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_BUDG_6011_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/* EJB 수정전 시작
		try {
			MC_BUDG_6000EJBHome home = (MC_BUDG_6000EJBHome)JNDIManager.getInstance().getHome("MC_BUDG_6000EJB");
			MC_BUDG_6000EJB ejb = home.create();

			ds = ejb.mc_budg_6011_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		EJB 수정전 끝 */

		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.len = (String)hash.get("len");
		dm.level = (String)hash.get("level");
		dm.budg_clas_frcd = (String)hash.get("budg_clas_frcd");
		dm.budg_clas_tocd = (String)hash.get("budg_clas_tocd");
		dm.budg_frym = (String)hash.get("budg_frym");
		dm.budg_toym = (String)hash.get("budg_toym");
		dm.dept_frcd = (String)hash.get("dept_frcd");
		dm.dept_tocd = (String)hash.get("dept_tocd");
		dm.tms = (String)hash.get("tms");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.len = Util.getSessionParameterValue(req,"len",true);
		dm.level = Util.getSessionParameterValue(req,"level",true);
		dm.budg_clas_frcd = Util.getSessionParameterValue(req,"budg_clas_frcd",true);
		dm.budg_clas_tocd = Util.getSessionParameterValue(req,"budg_clas_tocd",true);
		dm.budg_frym = Util.getSessionParameterValue(req,"budg_frym",true);
		dm.budg_toym = Util.getSessionParameterValue(req,"budg_toym",true);
		dm.dept_frcd = Util.getSessionParameterValue(req,"dept_frcd",true);
		dm.dept_tocd = Util.getSessionParameterValue(req,"dept_tocd",true);
		dm.tms = Util.getSessionParameterValue(req,"tms",true);
		*******************************************************************************************/
	}
	public void mc_budg_6012_u(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_BUDG_6012_UDataSet ds = null;
		MC_BUDG_6012_UDM dm = new MC_BUDG_6012_UDM();
		
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.budg_yy = Util.checkString(req.getParameter("budg_yy"));
		dm.budg_frym = Util.checkString(req.getParameter("budg_frym"));
		dm.budg_toym = Util.checkString(req.getParameter("budg_toym"));
		dm.tms = Util.checkString(req.getParameter("tms"));
		dm.chg_pers =  Util.getSessionParameterValue(req,"emp_no",true);
		
		dm.dept_cd = (String)hash.get("buseocd");
		dm.rate = (String)hash.get("rate");
		dm.total = (String)hash.get("amt");
		dm.budg_clas_cd = (String)hash.get("budg_clas_cd");
		
		dm.print();
		
		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_BUDG_6012_UDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_BUDG_6000EJBHome home = (MC_BUDG_6000EJBHome)JNDIManager.getInstance().getHome("MC_BUDG_6000EJB");
			MC_BUDG_6000EJB ejb = home.create();

			ds = ejb.mc_budg_6012_u(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
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
		dm.budg_frym = (String)hash.get("budg_frym");
		dm.budg_toym = (String)hash.get("budg_toym");
		dm.tms = (String)hash.get("tms");
		dm.dept_cd = (String)hash.get("dept_cd");
		dm.rate = (String)hash.get("rate");
		dm.total = (String)hash.get("total");
		dm.budg_clas_cd = (String)hash.get("budg_clas_cd");
		dm.chg_pers = (String)hash.get("chg_pers");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.budg_yy = Util.getSessionParameterValue(req,"budg_yy",true);
		dm.budg_frym = Util.getSessionParameterValue(req,"budg_frym",true);
		dm.budg_toym = Util.getSessionParameterValue(req,"budg_toym",true);
		dm.tms = Util.getSessionParameterValue(req,"tms",true);
		dm.dept_cd = Util.getSessionParameterValue(req,"dept_cd",true);
		dm.rate = Util.getSessionParameterValue(req,"rate",true);
		dm.total = Util.getSessionParameterValue(req,"total",true);
		dm.budg_clas_cd = Util.getSessionParameterValue(req,"budg_clas_cd",true);
		dm.chg_pers = Util.getSessionParameterValue(req,"chg_pers",true);
		*******************************************************************************************/
	}
	public void mc_budg_6020_m(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_BUDG_6020_MDataSet ds = null;
		MC_BUDG_6020_MDM dm = new MC_BUDG_6020_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.yyyy = Util.checkString(req.getParameter("yyyy"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_BUDG_6020_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_BUDG_6000EJBHome home = (MC_BUDG_6000EJBHome)JNDIManager.getInstance().getHome("MC_BUDG_6000EJB");
			MC_BUDG_6000EJB ejb = home.create();

			ds = ejb.mc_budg_6020_m(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
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
	public void mc_budg_6021_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_BUDG_6021_LDataSet ds = null;
		MC_BUDG_6021_LDM dm = new MC_BUDG_6021_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.budg_frym = Util.checkString(req.getParameter("budg_frym"));
		dm.budg_toym = Util.checkString(req.getParameter("budg_toym"));
		dm.job_clsf_cd = Util.checkString(req.getParameter("job_clsf_cd"));
		dm.dtls_clsf_cd = Util.checkString(req.getParameter("dtls_clsf_cd"));
		dm.medi_cd = Util.checkString(req.getParameter("medi_cd"));
		dm.dept_frcd = Util.checkString(req.getParameter("dept_frcd"));
		dm.dept_tocd = Util.checkString(req.getParameter("dept_tocd"));
		dm.tms = Util.checkString(req.getParameter("tms"));
		dm.sort = Util.checkString(req.getParameter("sort"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_BUDG_6021_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_BUDG_6000EJBHome home = (MC_BUDG_6000EJBHome)JNDIManager.getInstance().getHome("MC_BUDG_6000EJB");
			MC_BUDG_6000EJB ejb = home.create();

			ds = ejb.mc_budg_6021_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		EJB 수정전 끝 */

		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.budg_frym = (String)hash.get("budg_frym");
		dm.budg_toym = (String)hash.get("budg_toym");
		dm.job_clsf_cd = (String)hash.get("job_clsf_cd");
		dm.dtls_clsf_cd = (String)hash.get("dtls_clsf_cd");
		dm.medi_cd = (String)hash.get("medi_cd");
		dm.dept_frcd = (String)hash.get("dept_frcd");
		dm.dept_tocd = (String)hash.get("dept_tocd");
		dm.tms = (String)hash.get("tms");
		dm.sort = (String)hash.get("sort");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.budg_frym = Util.getSessionParameterValue(req,"budg_frym",true);
		dm.budg_toym = Util.getSessionParameterValue(req,"budg_toym",true);
		dm.job_clsf_cd = Util.getSessionParameterValue(req,"job_clsf_cd",true);
		dm.dtls_clsf_cd = Util.getSessionParameterValue(req,"dtls_clsf_cd",true);
		dm.medi_cd = Util.getSessionParameterValue(req,"medi_cd",true);
		dm.dept_frcd = Util.getSessionParameterValue(req,"dept_frcd",true);
		dm.dept_tocd = Util.getSessionParameterValue(req,"dept_tocd",true);
		dm.tms = Util.getSessionParameterValue(req,"tms",true);
		dm.sort = Util.getSessionParameterValue(req,"sort",true);
		*******************************************************************************************/
	}
	public void mc_budg_6022_u(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_BUDG_6022_UDataSet ds = null;
		MC_BUDG_6022_UDM dm = new MC_BUDG_6022_UDM();

		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.budg_yy = Util.checkString(req.getParameter("budg_yy"));
		dm.budg_yymm = (String)hash.get("yymm");
		dm.job_clsf_cd = Util.checkString(req.getParameter("job_clsf_cd"));
		dm.dtls_clsf_cd = Util.checkString(req.getParameter("dtls_clsf_cd"));
		dm.medi_cd = Util.checkString(req.getParameter("medi_cd"));
		dm.dept_cd = (String)hash.get("dept_cd");
		dm.tms = Util.checkString(req.getParameter("tms"));
		dm.qunt = (String)hash.get("asin_qunt2");
		dm.chg_pers = Util.getSessionParameterValue(req,"emp_no",true);

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_BUDG_6022_UDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/* EJB 수정전 시작
		try {
			MC_BUDG_6000EJBHome home = (MC_BUDG_6000EJBHome)JNDIManager.getInstance().getHome("MC_BUDG_6000EJB");
			MC_BUDG_6000EJB ejb = home.create();

			ds = ejb.mc_budg_6022_u(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
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
		dm.budg_yymm = (String)hash.get("budg_yymm");
		dm.job_clsf_cd = (String)hash.get("job_clsf_cd");
		dm.dtls_clsf_cd = (String)hash.get("dtls_clsf_cd");
		dm.medi_cd = (String)hash.get("medi_cd");
		dm.dept_cd = (String)hash.get("dept_cd");
		dm.tms = (String)hash.get("tms");
		dm.qunt = (String)hash.get("qunt");
		dm.chg_pers = (String)hash.get("chg_pers");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.budg_yy = Util.getSessionParameterValue(req,"budg_yy",true);
		dm.budg_yymm = Util.getSessionParameterValue(req,"budg_yymm",true);
		dm.job_clsf_cd = Util.getSessionParameterValue(req,"job_clsf_cd",true);
		dm.dtls_clsf_cd = Util.getSessionParameterValue(req,"dtls_clsf_cd",true);
		dm.medi_cd = Util.getSessionParameterValue(req,"medi_cd",true);
		dm.dept_cd = Util.getSessionParameterValue(req,"dept_cd",true);
		dm.tms = Util.getSessionParameterValue(req,"tms",true);
		dm.qunt = Util.getSessionParameterValue(req,"qunt",true);
		dm.chg_pers = Util.getSessionParameterValue(req,"chg_pers",true);
		*******************************************************************************************/
	}
	public void mc_budg_6023_u(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_BUDG_6023_UDataSet ds = null;
		MC_BUDG_6023_UDM dm = new MC_BUDG_6023_UDM();

		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);
		
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.budg_yy = Util.checkString(req.getParameter("budg_yy"));
		dm.budg_yymm = (String)hash.get("yymm");
		dm.job_clsf_cd = Util.checkString(req.getParameter("job_clsf_cd"));
		dm.dtls_clsf_cd = Util.checkString(req.getParameter("dtls_clsf_cd"));
		dm.medi_cd = Util.checkString(req.getParameter("medi_cd"));
		dm.dept_cd = (String)hash.get("dept_cd");
		dm.tms = Util.checkString(req.getParameter("tms"));
		dm.chg_pers = Util.getSessionParameterValue(req,"emp_no",true);

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_BUDG_6023_UDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_BUDG_6000EJBHome home = (MC_BUDG_6000EJBHome)JNDIManager.getInstance().getHome("MC_BUDG_6000EJB");
			MC_BUDG_6000EJB ejb = home.create();

			ds = ejb.mc_budg_6023_u(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
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
		dm.budg_yymm = (String)hash.get("budg_yymm");
		dm.job_clsf_cd = (String)hash.get("job_clsf_cd");
		dm.dtls_clsf_cd = (String)hash.get("dtls_clsf_cd");
		dm.medi_cd = (String)hash.get("medi_cd");
		dm.dept_cd = (String)hash.get("dept_cd");
		dm.tms = (String)hash.get("tms");
		dm.chg_pers = (String)hash.get("chg_pers");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.budg_yy = Util.getSessionParameterValue(req,"budg_yy",true);
		dm.budg_yymm = Util.getSessionParameterValue(req,"budg_yymm",true);
		dm.job_clsf_cd = Util.getSessionParameterValue(req,"job_clsf_cd",true);
		dm.dtls_clsf_cd = Util.getSessionParameterValue(req,"dtls_clsf_cd",true);
		dm.medi_cd = Util.getSessionParameterValue(req,"medi_cd",true);
		dm.dept_cd = Util.getSessionParameterValue(req,"dept_cd",true);
		dm.tms = Util.getSessionParameterValue(req,"tms",true);
		dm.chg_pers = Util.getSessionParameterValue(req,"chg_pers",true);
		*******************************************************************************************/
	}
	public void mc_budg_6024_m(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_BUDG_6024_MDataSet ds = null;
		MC_BUDG_6024_MDM dm = new MC_BUDG_6024_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_BUDG_6024_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_BUDG_6000EJBHome home = (MC_BUDG_6000EJBHome)JNDIManager.getInstance().getHome("MC_BUDG_6000EJB");
			MC_BUDG_6000EJB ejb = home.create();

			ds = ejb.mc_budg_6024_m(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
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
	public void mc_budg_6025_m(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_BUDG_6025_MDataSet ds = null;
		MC_BUDG_6025_MDM dm = new MC_BUDG_6025_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.cd = Util.checkString(req.getParameter("cd"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_BUDG_6025_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_BUDG_6000EJBHome home = (MC_BUDG_6000EJBHome)JNDIManager.getInstance().getHome("MC_BUDG_6000EJB");
			MC_BUDG_6000EJB ejb = home.create();

			ds = ejb.mc_budg_6025_m(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
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
	public void mc_budg_6031_i(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_BUDG_6031_IDataSet ds = null;
		MC_BUDG_6031_IDM dm = new MC_BUDG_6031_IDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.budg_yy = Util.checkString(req.getParameter("budg_yy"));
		dm.from_tms = Util.checkString(req.getParameter("from_tms"));
		dm.from_btms = Util.checkString(req.getParameter("from_btms"));
		dm.to_tms = Util.checkString(req.getParameter("to_tms"));
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.incmg_pers_ipadd = req.getRemoteAddr();

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_BUDG_6031_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_BUDG_6000EJBHome home = (MC_BUDG_6000EJBHome)JNDIManager.getInstance().getHome("MC_BUDG_6000EJB");
			MC_BUDG_6000EJB ejb = home.create();

			ds = ejb.mc_budg_6031_i(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
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
		dm.from_tms = (String)hash.get("from_tms");
		dm.from_btms = (String)hash.get("from_btms");
		dm.to_tms = (String)hash.get("to_tms");
		dm.incmg_pers = (String)hash.get("incmg_pers");
		dm.incmg_pers_ipadd = (String)hash.get("incmg_pers_ipadd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.budg_yy = Util.getSessionParameterValue(req,"budg_yy",true);
		dm.from_tms = Util.getSessionParameterValue(req,"from_tms",true);
		dm.from_btms = Util.getSessionParameterValue(req,"from_btms",true);
		dm.to_tms = Util.getSessionParameterValue(req,"to_tms",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"incmg_pers",true);
		dm.incmg_pers_ipadd = Util.getSessionParameterValue(req,"incmg_pers_ipadd",true);
		*******************************************************************************************/
	}
	public void mc_budg_6032_d(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_BUDG_6032_DDataSet ds = null;
		MC_BUDG_6032_DDM dm = new MC_BUDG_6032_DDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.budg_yy = Util.checkString(req.getParameter("budg_yy"));
		dm.tms = Util.checkString(req.getParameter("tms"));
		dm.chg_pers = Util.getSessionParameterValue(req,"emp_no",true);

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_BUDG_6032_DDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_BUDG_6000EJBHome home = (MC_BUDG_6000EJBHome)JNDIManager.getInstance().getHome("MC_BUDG_6000EJB");
			MC_BUDG_6000EJB ejb = home.create();

			ds = ejb.mc_budg_6032_d(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
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
		dm.tms = (String)hash.get("tms");
		dm.chg_pers = (String)hash.get("chg_pers");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.budg_yy = Util.getSessionParameterValue(req,"budg_yy",true);
		dm.tms = Util.getSessionParameterValue(req,"tms",true);
		dm.chg_pers = Util.getSessionParameterValue(req,"chg_pers",true);
		*******************************************************************************************/
	}
	public void mc_budg_6033_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_BUDG_6033_LDataSet ds = null;
		MC_BUDG_6033_LDM dm = new MC_BUDG_6033_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_BUDG_6033_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_BUDG_6000EJBHome home = (MC_BUDG_6000EJBHome)JNDIManager.getInstance().getHome("MC_BUDG_6000EJB");
			MC_BUDG_6000EJB ejb = home.create();

			ds = ejb.mc_budg_6033_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
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
	public void mc_budg_6034_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_BUDG_6034_LDataSet ds = null;
		MC_BUDG_6034_LDM dm = new MC_BUDG_6034_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.yyyy = Util.checkString(req.getParameter("yyyy"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_BUDG_6034_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_BUDG_6000EJBHome home = (MC_BUDG_6000EJBHome)JNDIManager.getInstance().getHome("MC_BUDG_6000EJB");
			MC_BUDG_6000EJB ejb = home.create();

			ds = ejb.mc_budg_6034_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
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
	public void mc_budg_6035_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_BUDG_6035_LDataSet ds = null;
		MC_BUDG_6035_LDM dm = new MC_BUDG_6035_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.budg_yy = Util.checkString(req.getParameter("budg_yy"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_BUDG_6035_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_BUDG_6000EJBHome home = (MC_BUDG_6000EJBHome)JNDIManager.getInstance().getHome("MC_BUDG_6000EJB");
			MC_BUDG_6000EJB ejb = home.create();

			ds = ejb.mc_budg_6035_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
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
	
	public void mc_budg_6040_m(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_BUDG_6040_MDataSet ds = null;
		MC_BUDG_6040_MDM dm = new MC_BUDG_6040_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_BUDG_6040_MDataSet)manager.executeCall(dm);

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
	
	public void mc_budg_6041_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_BUDG_6041_LDataSet ds = null;
		MC_BUDG_6041_LDM dm = new MC_BUDG_6041_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.budg_yy = Util.checkString(req.getParameter("budg_yy"));
		dm.kind = Util.checkString(req.getParameter("kind"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_BUDG_6041_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_BUDG_6000EJBHome home = (MC_BUDG_6000EJBHome)JNDIManager.getInstance().getHome("MC_BUDG_6000EJB");
			MC_BUDG_6000EJB ejb = home.create();

			ds = ejb.mc_budg_6041_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
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
		dm.kind = (String)hash.get("kind");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.budg_yy = Util.getSessionParameterValue(req,"budg_yy",true);
		dm.kind = Util.getSessionParameterValue(req,"kind",true);
		*******************************************************************************************/
	}

	public void mc_budg_6042_i(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_BUDG_6042_IDataSet ds = null;
		MC_BUDG_6042_IDM dm = new MC_BUDG_6042_IDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.budg_yymm = Util.checkString(req.getParameter("budg_yymm"));
		dm.tms = Util.checkString(req.getParameter("tms"));
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_BUDG_6042_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_BUDG_6000EJBHome home = (MC_BUDG_6000EJBHome)JNDIManager.getInstance().getHome("MC_BUDG_6000EJB");
			MC_BUDG_6000EJB ejb = home.create();

			ds = ejb.mc_budg_6042_i(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
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
		dm.tms = (String)hash.get("tms");
		dm.incmg_pers_ipadd = (String)hash.get("incmg_pers_ipadd");
		dm.incmg_pers = (String)hash.get("incmg_pers");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.budg_yymm = Util.getSessionParameterValue(req,"budg_yymm",true);
		dm.tms = Util.getSessionParameterValue(req,"tms",true);
		dm.incmg_pers_ipadd = Util.getSessionParameterValue(req,"incmg_pers_ipadd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"incmg_pers",true);
		*******************************************************************************************/
	}	
	public void mc_budg_6043_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_BUDG_6043_LDataSet ds = null;
		MC_BUDG_6043_LDM dm = new MC_BUDG_6043_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.budg_yymm = Util.checkString(req.getParameter("budg_yymm"));
		dm.tms = Util.checkString(req.getParameter("tms"));
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_BUDG_6043_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_BUDG_6000EJBHome home = (MC_BUDG_6000EJBHome)JNDIManager.getInstance().getHome("MC_BUDG_6000EJB");
			MC_BUDG_6000EJB ejb = home.create();

			ds = ejb.mc_budg_6043_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
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
		dm.tms = (String)hash.get("tms");
		dm.incmg_pers_ipadd = (String)hash.get("incmg_pers_ipadd");
		dm.incmg_pers = (String)hash.get("incmg_pers");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.budg_yymm = Util.getSessionParameterValue(req,"budg_yymm",true);
		dm.tms = Util.getSessionParameterValue(req,"tms",true);
		dm.incmg_pers_ipadd = Util.getSessionParameterValue(req,"incmg_pers_ipadd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"incmg_pers",true);
		*******************************************************************************************/
	}
	public void mc_budg_6044_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_BUDG_6044_LDataSet ds = null;
		MC_BUDG_6044_LDM dm = new MC_BUDG_6044_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_BUDG_6044_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_BUDG_6000EJBHome home = (MC_BUDG_6000EJBHome)JNDIManager.getInstance().getHome("MC_BUDG_6000EJB");
			MC_BUDG_6000EJB ejb = home.create();

			ds = ejb.mc_budg_6044_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
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
	public void mc_budg_6045_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_BUDG_6045_LDataSet ds = null;
		MC_BUDG_6045_LDM dm = new MC_BUDG_6045_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_BUDG_6045_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_BUDG_6000EJBHome home = (MC_BUDG_6000EJBHome)JNDIManager.getInstance().getHome("MC_BUDG_6000EJB");
			MC_BUDG_6000EJB ejb = home.create();

			ds = ejb.mc_budg_6045_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
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
	public void mc_budg_6046_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_BUDG_6046_LDataSet ds = null;
		MC_BUDG_6046_LDM dm = new MC_BUDG_6046_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.budg_yymm = Util.checkString(req.getParameter("budg_yymm"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_BUDG_6046_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_BUDG_6000EJBHome home = (MC_BUDG_6000EJBHome)JNDIManager.getInstance().getHome("MC_BUDG_6000EJB");
			MC_BUDG_6000EJB ejb = home.create();

			ds = ejb.mc_budg_6046_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
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
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.budg_yymm = Util.getSessionParameterValue(req,"budg_yymm",true);
		*******************************************************************************************/
	}
	public void mc_budg_6047_i(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_BUDG_6047_IDataSet ds = null;
		MC_BUDG_6047_IDM dm = new MC_BUDG_6047_IDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.bugd_yymm = Util.checkString(req.getParameter("bugd_yymm"));
		dm.clos_yn = Util.checkString(req.getParameter("clos_yn"));
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_BUDG_6047_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/* EJB 수정전 시작
		try {
			MC_BUDG_6000EJBHome home = (MC_BUDG_6000EJBHome)JNDIManager.getInstance().getHome("MC_BUDG_6000EJB");
			MC_BUDG_6000EJB ejb = home.create();

			ds = ejb.mc_budg_6047_i(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		EJB 수정전 끝 */

		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.bugd_yymm = (String)hash.get("bugd_yymm");
		dm.clos_yn = (String)hash.get("clos_yn");
		dm.incmg_pers_ipadd = (String)hash.get("incmg_pers_ipadd");
		dm.incmg_pers = (String)hash.get("incmg_pers");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.bugd_yymm = Util.getSessionParameterValue(req,"bugd_yymm",true);
		dm.clos_yn = Util.getSessionParameterValue(req,"clos_yn",true);
		dm.incmg_pers_ipadd = Util.getSessionParameterValue(req,"incmg_pers_ipadd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"incmg_pers",true);
		*******************************************************************************************/
	}
	public void mc_budg_6048_d(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_BUDG_6048_DDataSet ds = null;
		MC_BUDG_6048_DDM dm = new MC_BUDG_6048_DDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.bugd_yymm = Util.checkString(req.getParameter("bugd_yymm"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_BUDG_6048_DDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_BUDG_6000EJBHome home = (MC_BUDG_6000EJBHome)JNDIManager.getInstance().getHome("MC_BUDG_6000EJB");
			MC_BUDG_6000EJB ejb = home.create();

			ds = ejb.mc_budg_6048_d(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		EJB 수정전 끝 */

		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.bugd_yymm = (String)hash.get("bugd_yymm");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.bugd_yymm = Util.getSessionParameterValue(req,"bugd_yymm",true);
		*******************************************************************************************/
	}
	public void mc_budg_6051_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_BUDG_6051_LDataSet ds = null;
		MC_BUDG_6051_LDM dm = new MC_BUDG_6051_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.budg_yymm = Util.checkString(req.getParameter("budg_yymm"));
		dm.tms = Util.checkString(req.getParameter("tms"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_BUDG_6051_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_BUDG_6000EJBHome home = (MC_BUDG_6000EJBHome)JNDIManager.getInstance().getHome("MC_BUDG_6000EJB");
			MC_BUDG_6000EJB ejb = home.create();

			ds = ejb.mc_budg_6051_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
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
		dm.tms = (String)hash.get("tms");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.budg_yymm = Util.getSessionParameterValue(req,"budg_yymm",true);
		dm.tms = Util.getSessionParameterValue(req,"tms",true);
		*******************************************************************************************/
	}
	public void mc_budg_6052_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_BUDG_6052_LDataSet ds = null;
		MC_BUDG_6052_LDM dm = new MC_BUDG_6052_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_BUDG_6052_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_BUDG_6000EJBHome home = (MC_BUDG_6000EJBHome)JNDIManager.getInstance().getHome("MC_BUDG_6000EJB");
			MC_BUDG_6000EJB ejb = home.create();

			ds = ejb.mc_budg_6052_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
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
	public void mc_budg_6053_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_BUDG_6053_LDataSet ds = null;
		MC_BUDG_6053_LDM dm = new MC_BUDG_6053_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.bulen = Util.checkString(req.getParameter("bulen"));
		dm.buzero = Util.checkString(req.getParameter("buzero"));
		dm.beyymm = Util.checkString(req.getParameter("beyymm"));
		dm.wayymm = Util.checkString(req.getParameter("wayymm"));
		dm.budg_yymm = Util.checkString(req.getParameter("budg_yymm"));
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_BUDG_6053_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_BUDG_6000EJBHome home = (MC_BUDG_6000EJBHome)JNDIManager.getInstance().getHome("MC_BUDG_6000EJB");
			MC_BUDG_6000EJB ejb = home.create();

			ds = ejb.mc_budg_6053_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		EJB 수정전 끝 */

		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.bulen = (String)hash.get("bulen");
		dm.buzero = (String)hash.get("buzero");
		dm.beyymm = (String)hash.get("beyymm");
		dm.wayymm = (String)hash.get("wayymm");
		dm.budg_yymm = (String)hash.get("budg_yymm");
		dm.dept_cd = (String)hash.get("dept_cd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.bulen = Util.getSessionParameterValue(req,"bulen",true);
		dm.buzero = Util.getSessionParameterValue(req,"buzero",true);
		dm.beyymm = Util.getSessionParameterValue(req,"beyymm",true);
		dm.wayymm = Util.getSessionParameterValue(req,"wayymm",true);
		dm.budg_yymm = Util.getSessionParameterValue(req,"budg_yymm",true);
		dm.dept_cd = Util.getSessionParameterValue(req,"dept_cd",true);
		*******************************************************************************************/
	}
	public void mc_budg_6054_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_BUDG_6054_LDataSet ds = null;
		MC_BUDG_6054_LDM dm = new MC_BUDG_6054_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.bulen = Util.checkString(req.getParameter("bulen"));
		dm.buzero = Util.checkString(req.getParameter("buzero"));
		dm.beyymm = Util.checkString(req.getParameter("beyymm"));
		dm.wayymm = Util.checkString(req.getParameter("wayymm"));
		dm.budg_yymm = Util.checkString(req.getParameter("budg_yymm"));
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.tms = Util.checkString(req.getParameter("tms"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_BUDG_6054_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_BUDG_6000EJBHome home = (MC_BUDG_6000EJBHome)JNDIManager.getInstance().getHome("MC_BUDG_6000EJB");
			MC_BUDG_6000EJB ejb = home.create();

			ds = ejb.mc_budg_6054_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		EJB 수정전 끝 */

		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.bulen = (String)hash.get("bulen");
		dm.buzero = (String)hash.get("buzero");
		dm.beyymm = (String)hash.get("beyymm");
		dm.wayymm = (String)hash.get("wayymm");
		dm.budg_yymm = (String)hash.get("budg_yymm");
		dm.dept_cd = (String)hash.get("dept_cd");
		dm.tms = (String)hash.get("tms");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.bulen = Util.getSessionParameterValue(req,"bulen",true);
		dm.buzero = Util.getSessionParameterValue(req,"buzero",true);
		dm.beyymm = Util.getSessionParameterValue(req,"beyymm",true);
		dm.wayymm = Util.getSessionParameterValue(req,"wayymm",true);
		dm.budg_yymm = Util.getSessionParameterValue(req,"budg_yymm",true);
		dm.dept_cd = Util.getSessionParameterValue(req,"dept_cd",true);
		dm.tms = Util.getSessionParameterValue(req,"tms",true);
		*******************************************************************************************/
	}
	public void mc_budg_6055_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_BUDG_6055_LDataSet ds = null;
		MC_BUDG_6055_LDM dm = new MC_BUDG_6055_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.bulen = Util.checkString(req.getParameter("bulen"));
		dm.buzero = Util.checkString(req.getParameter("buzero"));
		dm.beyymm = Util.checkString(req.getParameter("beyymm"));
		dm.wayymm = Util.checkString(req.getParameter("wayymm"));
		dm.budg_yymm = Util.checkString(req.getParameter("budg_yymm"));
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.tms = Util.checkString(req.getParameter("tms"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_BUDG_6055_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_BUDG_6000EJBHome home = (MC_BUDG_6000EJBHome)JNDIManager.getInstance().getHome("MC_BUDG_6000EJB");
			MC_BUDG_6000EJB ejb = home.create();

			ds = ejb.mc_budg_6055_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		EJB 수정전 끝 */

		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.bulen = (String)hash.get("bulen");
		dm.buzero = (String)hash.get("buzero");
		dm.beyymm = (String)hash.get("beyymm");
		dm.wayymm = (String)hash.get("wayymm");
		dm.budg_yymm = (String)hash.get("budg_yymm");
		dm.dept_cd = (String)hash.get("dept_cd");
		dm.tms = (String)hash.get("tms");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.bulen = Util.getSessionParameterValue(req,"bulen",true);
		dm.buzero = Util.getSessionParameterValue(req,"buzero",true);
		dm.beyymm = Util.getSessionParameterValue(req,"beyymm",true);
		dm.wayymm = Util.getSessionParameterValue(req,"wayymm",true);
		dm.budg_yymm = Util.getSessionParameterValue(req,"budg_yymm",true);
		dm.dept_cd = Util.getSessionParameterValue(req,"dept_cd",true);
		dm.tms = Util.getSessionParameterValue(req,"tms",true);
		*******************************************************************************************/
	}
	public void mc_budg_6056_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_BUDG_6056_LDataSet ds = null;
		MC_BUDG_6056_LDM dm = new MC_BUDG_6056_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.bulen = Util.checkString(req.getParameter("bulen"));
		dm.buzero = Util.checkString(req.getParameter("buzero"));
		dm.atms = Util.checkString(req.getParameter("atms"));
		dm.btms = Util.checkString(req.getParameter("btms"));
		dm.budg_yymm = Util.checkString(req.getParameter("budg_yymm"));
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_BUDG_6056_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_BUDG_6000EJBHome home = (MC_BUDG_6000EJBHome)JNDIManager.getInstance().getHome("MC_BUDG_6000EJB");
			MC_BUDG_6000EJB ejb = home.create();

			ds = ejb.mc_budg_6056_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		EJB 수정전 끝 */

		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.bulen = (String)hash.get("bulen");
		dm.buzero = (String)hash.get("buzero");
		dm.atms = (String)hash.get("atms");
		dm.btms = (String)hash.get("btms");
		dm.budg_yymm = (String)hash.get("budg_yymm");
		dm.dept_cd = (String)hash.get("dept_cd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.bulen = Util.getSessionParameterValue(req,"bulen",true);
		dm.buzero = Util.getSessionParameterValue(req,"buzero",true);
		dm.atms = Util.getSessionParameterValue(req,"atms",true);
		dm.btms = Util.getSessionParameterValue(req,"btms",true);
		dm.budg_yymm = Util.getSessionParameterValue(req,"budg_yymm",true);
		dm.dept_cd = Util.getSessionParameterValue(req,"dept_cd",true);
		*******************************************************************************************/
	}
	public void mc_budg_6057_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_BUDG_6057_LDataSet ds = null;
		MC_BUDG_6057_LDM dm = new MC_BUDG_6057_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.brlen = Util.unFormatInt(req.getParameter("brlen"));
		dm.brzero = Util.checkString(req.getParameter("brzero"));
		dm.bulen = Util.unFormatInt(req.getParameter("bulen"));
		dm.buzero = Util.checkString(req.getParameter("buzero"));
		dm.wbyymm = Util.checkString(req.getParameter("wbyymm"));
		dm.beyymm = Util.checkString(req.getParameter("beyymm"));
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.budg_yymm = Util.checkString(req.getParameter("budg_yymm"));
		dm.tms = Util.checkString(req.getParameter("tms"));
		dm.start_len1 = Util.unFormatInt(req.getParameter("start_len1"));
		dm.end_len1 = Util.unFormatInt(req.getParameter("end_len1"));
		dm.cond1 = Util.checkString(req.getParameter("cond1"));
		dm.start_len2 = Util.unFormatInt(req.getParameter("start_len2"));
		dm.end_len2 = Util.unFormatInt(req.getParameter("end_len2"));
		dm.cond2 = Util.checkString(req.getParameter("cond2"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_BUDG_6057_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_BUDG_6000EJBHome home = (MC_BUDG_6000EJBHome)JNDIManager.getInstance().getHome("MC_BUDG_6000EJB");
			MC_BUDG_6000EJB ejb = home.create();

			ds = ejb.mc_budg_6057_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		EJB 수정전 끝 */

		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.brlen = (String)hash.get("brlen");
		dm.brzero = (String)hash.get("brzero");
		dm.bulen = (String)hash.get("bulen");
		dm.buzero = (String)hash.get("buzero");
		dm.wbyymm = (String)hash.get("wbyymm");
		dm.beyymm = (String)hash.get("beyymm");
		dm.dept_cd = (String)hash.get("dept_cd");
		dm.budg_yymm = (String)hash.get("budg_yymm");
		dm.tms = (String)hash.get("tms");
		dm.start_len1 = (String)hash.get("start_len1");
		dm.end_len1 = (String)hash.get("end_len1");
		dm.cond1 = (String)hash.get("cond1");
		dm.start_len2 = (String)hash.get("start_len2");
		dm.end_len2 = (String)hash.get("end_len2");
		dm.cond2 = (String)hash.get("cond2");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.brlen = Util.getSessionParameterValue(req,"brlen",true);
		dm.brzero = Util.getSessionParameterValue(req,"brzero",true);
		dm.bulen = Util.getSessionParameterValue(req,"bulen",true);
		dm.buzero = Util.getSessionParameterValue(req,"buzero",true);
		dm.wbyymm = Util.getSessionParameterValue(req,"wbyymm",true);
		dm.beyymm = Util.getSessionParameterValue(req,"beyymm",true);
		dm.dept_cd = Util.getSessionParameterValue(req,"dept_cd",true);
		dm.budg_yymm = Util.getSessionParameterValue(req,"budg_yymm",true);
		dm.tms = Util.getSessionParameterValue(req,"tms",true);
		dm.start_len1 = Util.getSessionParameterValue(req,"start_len1",true);
		dm.end_len1 = Util.getSessionParameterValue(req,"end_len1",true);
		dm.cond1 = Util.getSessionParameterValue(req,"cond1",true);
		dm.start_len2 = Util.getSessionParameterValue(req,"start_len2",true);
		dm.end_len2 = Util.getSessionParameterValue(req,"end_len2",true);
		dm.cond2 = Util.getSessionParameterValue(req,"cond2",true);
		*******************************************************************************************/
	}
	public void mc_budg_6058_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_BUDG_6058_LDataSet ds = null;
		MC_BUDG_6058_LDM dm = new MC_BUDG_6058_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.brlen = Util.unFormatInt(req.getParameter("brlen"));
		dm.brzero = Util.checkString(req.getParameter("brzero"));
		dm.bulen = Util.unFormatInt(req.getParameter("bulen"));
		dm.buzero = Util.checkString(req.getParameter("buzero"));
		dm.atms = Util.checkString(req.getParameter("atms"));
		dm.btms = Util.checkString(req.getParameter("btms"));
		dm.budg_yymm = Util.checkString(req.getParameter("budg_yymm"));
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.start_len1 = Util.unFormatInt(req.getParameter("start_len1"));
		dm.end_len1 = Util.unFormatInt(req.getParameter("end_len1"));
		dm.cond1 = Util.checkString(req.getParameter("cond1"));
		dm.start_len2 = Util.unFormatInt(req.getParameter("start_len2"));
		dm.end_len2 = Util.unFormatInt(req.getParameter("end_len2"));
		dm.cond2 = Util.checkString(req.getParameter("cond2"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_BUDG_6058_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_BUDG_6000EJBHome home = (MC_BUDG_6000EJBHome)JNDIManager.getInstance().getHome("MC_BUDG_6000EJB");
			MC_BUDG_6000EJB ejb = home.create();

			ds = ejb.mc_budg_6058_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		EJB 수정전 끝 */

		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.brlen = (String)hash.get("brlen");
		dm.brzero = (String)hash.get("brzero");
		dm.bulen = (String)hash.get("bulen");
		dm.buzero = (String)hash.get("buzero");
		dm.atms = (String)hash.get("atms");
		dm.btms = (String)hash.get("btms");
		dm.budg_yymm = (String)hash.get("budg_yymm");
		dm.dept_cd = (String)hash.get("dept_cd");
		dm.start_len1 = (String)hash.get("start_len1");
		dm.end_len1 = (String)hash.get("end_len1");
		dm.cond1 = (String)hash.get("cond1");
		dm.start_len2 = (String)hash.get("start_len2");
		dm.end_len2 = (String)hash.get("end_len2");
		dm.cond2 = (String)hash.get("cond2");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.brlen = Util.getSessionParameterValue(req,"brlen",true);
		dm.brzero = Util.getSessionParameterValue(req,"brzero",true);
		dm.bulen = Util.getSessionParameterValue(req,"bulen",true);
		dm.buzero = Util.getSessionParameterValue(req,"buzero",true);
		dm.atms = Util.getSessionParameterValue(req,"atms",true);
		dm.btms = Util.getSessionParameterValue(req,"btms",true);
		dm.budg_yymm = Util.getSessionParameterValue(req,"budg_yymm",true);
		dm.dept_cd = Util.getSessionParameterValue(req,"dept_cd",true);
		dm.start_len1 = Util.getSessionParameterValue(req,"start_len1",true);
		dm.end_len1 = Util.getSessionParameterValue(req,"end_len1",true);
		dm.cond1 = Util.getSessionParameterValue(req,"cond1",true);
		dm.start_len2 = Util.getSessionParameterValue(req,"start_len2",true);
		dm.end_len2 = Util.getSessionParameterValue(req,"end_len2",true);
		dm.cond2 = Util.getSessionParameterValue(req,"cond2",true);
		*******************************************************************************************/
	}
	public void mc_budg_6111_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_BUDG_6111_LDataSet ds = null;
		MC_BUDG_6111_LDM dm = new MC_BUDG_6111_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.yyyy = Util.checkString(req.getParameter("yyyy"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_BUDG_6111_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_BUDG_6000EJBHome home = (MC_BUDG_6000EJBHome)JNDIManager.getInstance().getHome("MC_BUDG_6000EJB");
			MC_BUDG_6000EJB ejb = home.create();

			ds = ejb.mc_budg_6111_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
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
	public void mc_budg_6112_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_BUDG_6112_LDataSet ds = null;
		MC_BUDG_6112_LDM dm = new MC_BUDG_6112_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.yyyy = Util.checkString(req.getParameter("yyyy"));
		dm.tms = Util.checkString(req.getParameter("tms"));
		dm.last_yyyymm = Util.checkString(req.getParameter("last_yyyymm"));
		dm.clas_cd1 = Util.checkString(req.getParameter("clas_cd1"));
		dm.clas_cd2 = Util.checkString(req.getParameter("clas_cd2"));
		dm.clas_cd3 = Util.checkString(req.getParameter("clas_cd3"));
		dm.clas_cd4 = Util.checkString(req.getParameter("clas_cd4"));
		
		/*req.getRemoteAddr();*/

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_BUDG_6112_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_BUDG_6000EJBHome home = (MC_BUDG_6000EJBHome)JNDIManager.getInstance().getHome("MC_BUDG_6000EJB");
			MC_BUDG_6000EJB ejb = home.create();

			ds = ejb.mc_budg_6112_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
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
		dm.tms = (String)hash.get("tms");
		dm.last_yyyymm = (String)hash.get("last_yyyymm");
		dm.clas_cd1 = (String)hash.get("clas_cd1");
		dm.clas_cd2 = (String)hash.get("clas_cd2");
		dm.clas_cd3 = (String)hash.get("clas_cd3");
		dm.clas_cd4 = (String)hash.get("clas_cd4");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.yyyy = Util.getSessionParameterValue(req,"yyyy",true);
		dm.tms = Util.getSessionParameterValue(req,"tms",true);
		dm.last_yyyymm = Util.getSessionParameterValue(req,"last_yyyymm",true);
		dm.clas_cd1 = Util.getSessionParameterValue(req,"clas_cd1",true);
		dm.clas_cd2 = Util.getSessionParameterValue(req,"clas_cd2",true);
		dm.clas_cd3 = Util.getSessionParameterValue(req,"clas_cd3",true);
		dm.clas_cd4 = Util.getSessionParameterValue(req,"clas_cd4",true);
		*******************************************************************************************/
	}
	public void mc_budg_6113_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_BUDG_6113_LDataSet ds = null;
		MC_BUDG_6113_LDM dm = new MC_BUDG_6113_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.yyyy = Util.checkString(req.getParameter("yyyy"));
		dm.tms = Util.checkString(req.getParameter("tms"));
		dm.last_yyyymm = Util.checkString(req.getParameter("last_yyyymm"));
		dm.clas_cd1 = Util.checkString(req.getParameter("clas_cd1"));
		dm.clas_cd2 = Util.checkString(req.getParameter("clas_cd2"));
		dm.clas_cd3 = Util.checkString(req.getParameter("clas_cd3"));
		dm.clas_cd4 = Util.checkString(req.getParameter("clas_cd4"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_BUDG_6113_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_BUDG_6000EJBHome home = (MC_BUDG_6000EJBHome)JNDIManager.getInstance().getHome("MC_BUDG_6000EJB");
			MC_BUDG_6000EJB ejb = home.create();

			ds = ejb.mc_budg_6113_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
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
		dm.tms = (String)hash.get("tms");
		dm.last_yyyymm = (String)hash.get("last_yyyymm");
		dm.clas_cd1 = (String)hash.get("clas_cd1");
		dm.clas_cd2 = (String)hash.get("clas_cd2");
		dm.clas_cd3 = (String)hash.get("clas_cd3");
		dm.clas_cd4 = (String)hash.get("clas_cd4");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.yyyy = Util.getSessionParameterValue(req,"yyyy",true);
		dm.tms = Util.getSessionParameterValue(req,"tms",true);
		dm.last_yyyymm = Util.getSessionParameterValue(req,"last_yyyymm",true);
		dm.clas_cd1 = Util.getSessionParameterValue(req,"clas_cd1",true);
		dm.clas_cd2 = Util.getSessionParameterValue(req,"clas_cd2",true);
		dm.clas_cd3 = Util.getSessionParameterValue(req,"clas_cd3",true);
		dm.clas_cd4 = Util.getSessionParameterValue(req,"clas_cd4",true);
		*******************************************************************************************/
	}
	public void mc_budg_6115_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_BUDG_6115_LDataSet ds = null;
		MC_BUDG_6115_LDM dm = new MC_BUDG_6115_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.yyyy = Util.checkString(req.getParameter("yyyy"));
		dm.clas_cd1 = Util.checkString(req.getParameter("clas_cd1"));
		dm.clas_cd2 = Util.checkString(req.getParameter("clas_cd2"));
		dm.clas_cd3 = Util.checkString(req.getParameter("clas_cd3"));
		dm.clas_cd4 = Util.checkString(req.getParameter("clas_cd4"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_BUDG_6115_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_BUDG_6000EJBHome home = (MC_BUDG_6000EJBHome)JNDIManager.getInstance().getHome("MC_BUDG_6000EJB");
			MC_BUDG_6000EJB ejb = home.create();

			ds = ejb.mc_budg_6115_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
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
		dm.clas_cd1 = (String)hash.get("clas_cd1");
		dm.clas_cd2 = (String)hash.get("clas_cd2");
		dm.clas_cd3 = (String)hash.get("clas_cd3");
		dm.clas_cd4 = (String)hash.get("clas_cd4");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.yyyy = Util.getSessionParameterValue(req,"yyyy",true);
		dm.clas_cd1 = Util.getSessionParameterValue(req,"clas_cd1",true);
		dm.clas_cd2 = Util.getSessionParameterValue(req,"clas_cd2",true);
		dm.clas_cd3 = Util.getSessionParameterValue(req,"clas_cd3",true);
		dm.clas_cd4 = Util.getSessionParameterValue(req,"clas_cd4",true);
		*******************************************************************************************/
	}
	public void mc_budg_6116_i(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_BUDG_6116_IDataSet ds = null;
		MC_BUDG_6116_IDM dm = new MC_BUDG_6116_IDM();

		String multiUpdateData;
		Hashtable hash;
		
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		dm.yy = Util.checkString(req.getParameter("yyyy"));
		dm.rslt_aply_prd_bgn = Util.checkString(req.getParameter("fr_to_11"));
		dm.rslt_aply_prd_end = Util.checkString(req.getParameter("fr_to_12"));
		dm.expt_aply_prd_bgn = Util.checkString(req.getParameter("fr_to_21"));
		dm.expt_aply_prd_end = Util.checkString(req.getParameter("fr_to_22"));
		
		multiUpdateData = Util.checkString(req.getParameter("multiUpdateData1"));
		hash = getHashMultiUpdateData(multiUpdateData);
		
		dm.kind = (String)hash.get("kind");
		dm.budg_clas_cd = (String)hash.get("clas_cd_code");
		dm.mm_amt_1 = (String)hash.get("amt_01");
		dm.mm_amt_2 = (String)hash.get("amt_02");
		dm.mm_amt_3 = (String)hash.get("amt_03");
		dm.mm_amt_4 = (String)hash.get("amt_04");
		dm.mm_amt_5 = (String)hash.get("amt_05");
		dm.mm_amt_6 = (String)hash.get("amt_06");
		dm.mm_amt_7 = (String)hash.get("amt_07");
		dm.mm_amt_8 = (String)hash.get("amt_08");
		dm.mm_amt_9 = (String)hash.get("amt_09");
		dm.mm_amt_10 = (String)hash.get("amt_10");
		dm.mm_amt_11 = (String)hash.get("amt_11");
		dm.mm_amt_12 = (String)hash.get("amt_12");
		dm.prvyy_rslt_amt = (String)hash.get("pre_tot_amt");
		
		multiUpdateData = Util.checkString(req.getParameter("multiUpdateData2"));
		hash = getHashMultiUpdateData(multiUpdateData);
		
		dm.kind_2 = (String)hash.get("kind");
		dm.budg_clas_cd_2 = (String)hash.get("clas_cd_code");
		dm.mm_amt_1_2 = (String)hash.get("amt_01");
		dm.mm_amt_2_2 = (String)hash.get("amt_02");
		dm.mm_amt_3_2 = (String)hash.get("amt_03");
		dm.mm_amt_4_2 = (String)hash.get("amt_04");
		dm.mm_amt_5_2 = (String)hash.get("amt_05");
		dm.mm_amt_6_2 = (String)hash.get("amt_06");
		dm.mm_amt_7_2 = (String)hash.get("amt_07");
		dm.mm_amt_8_2 = (String)hash.get("amt_08");
		dm.mm_amt_9_2 = (String)hash.get("amt_09");
		dm.mm_amt_10_2 = (String)hash.get("amt_10");
		dm.mm_amt_11_2 = (String)hash.get("amt_11");
		dm.mm_amt_12_2 = (String)hash.get("amt_12");
		dm.prvyy_rslt_amt_2 = (String)hash.get("pre_tot_amt");

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_BUDG_6116_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_BUDG_6000EJBHome home = (MC_BUDG_6000EJBHome)JNDIManager.getInstance().getHome("MC_BUDG_6000EJB");
			MC_BUDG_6000EJB ejb = home.create();

			ds = ejb.mc_budg_6116_i(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		EJB 수정전 끝 */

		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.yy = (String)hash.get("yy");
		dm.kind = (String)hash.get("kind");
		dm.budg_clas_cd = (String)hash.get("budg_clas_cd");
		dm.mm_amt_1 = (String)hash.get("mm_amt_1");
		dm.mm_amt_2 = (String)hash.get("mm_amt_2");
		dm.mm_amt_3 = (String)hash.get("mm_amt_3");
		dm.mm_amt_4 = (String)hash.get("mm_amt_4");
		dm.mm_amt_5 = (String)hash.get("mm_amt_5");
		dm.mm_amt_6 = (String)hash.get("mm_amt_6");
		dm.mm_amt_7 = (String)hash.get("mm_amt_7");
		dm.mm_amt_8 = (String)hash.get("mm_amt_8");
		dm.mm_amt_9 = (String)hash.get("mm_amt_9");
		dm.mm_amt_10 = (String)hash.get("mm_amt_10");
		dm.mm_amt_11 = (String)hash.get("mm_amt_11");
		dm.mm_amt_12 = (String)hash.get("mm_amt_12");
		dm.prvyy_rslt_amt = (String)hash.get("prvyy_rslt_amt");
		dm.kind_2 = (String)hash.get("kind_2");
		dm.budg_clas_cd_2 = (String)hash.get("budg_clas_cd_2");
		dm.mm_amt_1_2 = (String)hash.get("mm_amt_1_2");
		dm.mm_amt_2_2 = (String)hash.get("mm_amt_2_2");
		dm.mm_amt_3_2 = (String)hash.get("mm_amt_3_2");
		dm.mm_amt_4_2 = (String)hash.get("mm_amt_4_2");
		dm.mm_amt_5_2 = (String)hash.get("mm_amt_5_2");
		dm.mm_amt_6_2 = (String)hash.get("mm_amt_6_2");
		dm.mm_amt_7_2 = (String)hash.get("mm_amt_7_2");
		dm.mm_amt_8_2 = (String)hash.get("mm_amt_8_2");
		dm.mm_amt_9_2 = (String)hash.get("mm_amt_9_2");
		dm.mm_amt_10_2 = (String)hash.get("mm_amt_10_2");
		dm.mm_amt_11_2 = (String)hash.get("mm_amt_11_2");
		dm.mm_amt_12_2 = (String)hash.get("mm_amt_12_2");
		dm.prvyy_rslt_amt_2 = (String)hash.get("prvyy_rslt_amt_2");
		dm.rslt_aply_prd_bgn = (String)hash.get("rslt_aply_prd_bgn");
		dm.rslt_aply_prd_end = (String)hash.get("rslt_aply_prd_end");
		dm.expt_aply_prd_bgn = (String)hash.get("expt_aply_prd_bgn");
		dm.expt_aply_prd_end = (String)hash.get("expt_aply_prd_end");
		dm.incmg_pers = (String)hash.get("incmg_pers");
		dm.incmg_pers_ipadd = (String)hash.get("incmg_pers_ipadd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.yy = Util.getSessionParameterValue(req,"yy",true);
		dm.kind = Util.getSessionParameterValue(req,"kind",true);
		dm.budg_clas_cd = Util.getSessionParameterValue(req,"budg_clas_cd",true);
		dm.mm_amt_1 = Util.getSessionParameterValue(req,"mm_amt_1",true);
		dm.mm_amt_2 = Util.getSessionParameterValue(req,"mm_amt_2",true);
		dm.mm_amt_3 = Util.getSessionParameterValue(req,"mm_amt_3",true);
		dm.mm_amt_4 = Util.getSessionParameterValue(req,"mm_amt_4",true);
		dm.mm_amt_5 = Util.getSessionParameterValue(req,"mm_amt_5",true);
		dm.mm_amt_6 = Util.getSessionParameterValue(req,"mm_amt_6",true);
		dm.mm_amt_7 = Util.getSessionParameterValue(req,"mm_amt_7",true);
		dm.mm_amt_8 = Util.getSessionParameterValue(req,"mm_amt_8",true);
		dm.mm_amt_9 = Util.getSessionParameterValue(req,"mm_amt_9",true);
		dm.mm_amt_10 = Util.getSessionParameterValue(req,"mm_amt_10",true);
		dm.mm_amt_11 = Util.getSessionParameterValue(req,"mm_amt_11",true);
		dm.mm_amt_12 = Util.getSessionParameterValue(req,"mm_amt_12",true);
		dm.prvyy_rslt_amt = Util.getSessionParameterValue(req,"prvyy_rslt_amt",true);
		dm.kind_2 = Util.getSessionParameterValue(req,"kind_2",true);
		dm.budg_clas_cd_2 = Util.getSessionParameterValue(req,"budg_clas_cd_2",true);
		dm.mm_amt_1_2 = Util.getSessionParameterValue(req,"mm_amt_1_2",true);
		dm.mm_amt_2_2 = Util.getSessionParameterValue(req,"mm_amt_2_2",true);
		dm.mm_amt_3_2 = Util.getSessionParameterValue(req,"mm_amt_3_2",true);
		dm.mm_amt_4_2 = Util.getSessionParameterValue(req,"mm_amt_4_2",true);
		dm.mm_amt_5_2 = Util.getSessionParameterValue(req,"mm_amt_5_2",true);
		dm.mm_amt_6_2 = Util.getSessionParameterValue(req,"mm_amt_6_2",true);
		dm.mm_amt_7_2 = Util.getSessionParameterValue(req,"mm_amt_7_2",true);
		dm.mm_amt_8_2 = Util.getSessionParameterValue(req,"mm_amt_8_2",true);
		dm.mm_amt_9_2 = Util.getSessionParameterValue(req,"mm_amt_9_2",true);
		dm.mm_amt_10_2 = Util.getSessionParameterValue(req,"mm_amt_10_2",true);
		dm.mm_amt_11_2 = Util.getSessionParameterValue(req,"mm_amt_11_2",true);
		dm.mm_amt_12_2 = Util.getSessionParameterValue(req,"mm_amt_12_2",true);
		dm.prvyy_rslt_amt_2 = Util.getSessionParameterValue(req,"prvyy_rslt_amt_2",true);
		dm.rslt_aply_prd_bgn = Util.getSessionParameterValue(req,"rslt_aply_prd_bgn",true);
		dm.rslt_aply_prd_end = Util.getSessionParameterValue(req,"rslt_aply_prd_end",true);
		dm.expt_aply_prd_bgn = Util.getSessionParameterValue(req,"expt_aply_prd_bgn",true);
		dm.expt_aply_prd_end = Util.getSessionParameterValue(req,"expt_aply_prd_end",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"incmg_pers",true);
		dm.incmg_pers_ipadd = Util.getSessionParameterValue(req,"incmg_pers_ipadd",true);
		*******************************************************************************************/
	}
	public void mc_budg_6130_m(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_BUDG_6130_MDataSet ds = null;
		MC_BUDG_6130_MDM dm = new MC_BUDG_6130_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.yy = Util.checkString(req.getParameter("yy"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_BUDG_6130_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_BUDG_6000EJBHome home = (MC_BUDG_6000EJBHome)JNDIManager.getInstance().getHome("MC_BUDG_6000EJB");
			MC_BUDG_6000EJB ejb = home.create();

			ds = ejb.mc_budg_6130_m(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		EJB 수정전 끝 */

		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.yy = (String)hash.get("yy");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.yy = Util.getSessionParameterValue(req,"yy",true);
		*******************************************************************************************/
	}
	public void mc_budg_6132_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_BUDG_6132_LDataSet ds = null;
		MC_BUDG_6132_LDM dm = new MC_BUDG_6132_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.yyyy_bf = Util.checkString(req.getParameter("yyyy_bf"));
		dm.tms_bf = Util.checkString(req.getParameter("tms_bf"));
		dm.yyyy_af = Util.checkString(req.getParameter("yyyy_af"));
		dm.tms_af = Util.checkString(req.getParameter("tms_af"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_BUDG_6132_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_BUDG_6000EJBHome home = (MC_BUDG_6000EJBHome)JNDIManager.getInstance().getHome("MC_BUDG_6000EJB");
			MC_BUDG_6000EJB ejb = home.create();

			ds = ejb.mc_budg_6132_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		EJB 수정전 끝 */

		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.yyyy_bf = (String)hash.get("yyyy_bf");
		dm.tms_bf = (String)hash.get("tms_bf");
		dm.yyyy_af = (String)hash.get("yyyy_af");
		dm.tms_af = (String)hash.get("tms_af");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.yyyy_bf = Util.getSessionParameterValue(req,"yyyy_bf",true);
		dm.tms_bf = Util.getSessionParameterValue(req,"tms_bf",true);
		dm.yyyy_af = Util.getSessionParameterValue(req,"yyyy_af",true);
		dm.tms_af = Util.getSessionParameterValue(req,"tms_af",true);
		*******************************************************************************************/
	}
	public void mc_budg_6140_m(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_BUDG_6140_MDataSet ds = null;
		MC_BUDG_6140_MDM dm = new MC_BUDG_6140_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.yymm = Util.checkString(req.getParameter("yyyy_tab2"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_BUDG_6140_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_BUDG_6000EJBHome home = (MC_BUDG_6000EJBHome)JNDIManager.getInstance().getHome("MC_BUDG_6000EJB");
			MC_BUDG_6000EJB ejb = home.create();

			ds = ejb.mc_budg_6140_m(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
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
	public void mc_budg_6141_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_BUDG_6141_LDataSet ds = null;
		MC_BUDG_6141_LDM dm = new MC_BUDG_6141_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.yymm = Util.checkString(req.getParameter("yymm"));
		dm.rate = req.getParameter("rate");
		dm.kind = Util.checkString(req.getParameter("kind"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_BUDG_6141_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_BUDG_6000EJBHome home = (MC_BUDG_6000EJBHome)JNDIManager.getInstance().getHome("MC_BUDG_6000EJB");
			MC_BUDG_6000EJB ejb = home.create();

			ds = ejb.mc_budg_6141_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
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
		dm.rate = (String)hash.get("rate");
		dm.kind = (String)hash.get("kind");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.yymm = Util.getSessionParameterValue(req,"yymm",true);
		dm.rate = Util.getSessionParameterValue(req,"rate",true);
		dm.kind = Util.getSessionParameterValue(req,"kind",true);
		*******************************************************************************************/
	}
	public void mc_budg_6142_i(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_BUDG_6142_IDataSet ds = null;
		MC_BUDG_6142_IDM dm = new MC_BUDG_6142_IDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.yymm = Util.checkString(req.getParameter("yymm"));
		dm.non_dduc_yn = Util.checkString(req.getParameter("non_dduc_yn"));
		dm.area_clsf = Util.checkString(req.getParameter("area_clsf"));
		dm.paper_amt = Util.checkString(req.getParameter("paper_amt"));
		dm.submat_amt = Util.checkString(req.getParameter("submat_amt"));
		dm.prt_amt = Util.checkString(req.getParameter("prt_amt"));
		dm.non_dduc_paper_amt = Util.checkString(req.getParameter("non_dduc_paper_amt"));
		dm.non_dduc_submat_amt = Util.checkString(req.getParameter("non_dduc_submat_amt"));
		dm.non_dduc_prt_amt = Util.checkString(req.getParameter("non_dduc_prt_amt"));
		dm.paper_amt_cost = Util.checkString(req.getParameter("paper_amt_cost"));
		dm.submat_amt_cost = Util.checkString(req.getParameter("submat_amt_cost"));
		dm.prt_amt_cost = Util.checkString(req.getParameter("prt_amt_cost"));
		dm.pcnt_cost = Util.checkString(req.getParameter("pcnt_cost"));
		dm.cho_issu_cnt = Util.checkString(req.getParameter("cho_issu_cnt"));
		dm.local_issu_cnt = Util.checkString(req.getParameter("local_issu_cnt"));
		dm.avg_cnt = Util.checkString(req.getParameter("avg_cnt"));
		dm.non_dduc_rate = Util.checkString(req.getParameter("non_dduc_rate"));
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.incmg_pers_ipadd = req.getRemoteAddr();

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_BUDG_6142_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_BUDG_6000EJBHome home = (MC_BUDG_6000EJBHome)JNDIManager.getInstance().getHome("MC_BUDG_6000EJB");
			MC_BUDG_6000EJB ejb = home.create();

			ds = ejb.mc_budg_6142_i(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
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
		dm.non_dduc_yn = (String)hash.get("non_dduc_yn");
		dm.area_clsf = (String)hash.get("area_clsf");
		dm.paper_amt = (String)hash.get("paper_amt");
		dm.submat_amt = (String)hash.get("submat_amt");
		dm.prt_amt = (String)hash.get("prt_amt");
		dm.non_dduc_paper_amt = (String)hash.get("non_dduc_paper_amt");
		dm.non_dduc_submat_amt = (String)hash.get("non_dduc_submat_amt");
		dm.non_dduc_prt_amt = (String)hash.get("non_dduc_prt_amt");
		dm.paper_amt_cost = (String)hash.get("paper_amt_cost");
		dm.submat_amt_cost = (String)hash.get("submat_amt_cost");
		dm.prt_amt_cost = (String)hash.get("prt_amt_cost");
		dm.pcnt_cost = (String)hash.get("pcnt_cost");
		dm.cho_issu_cnt = (String)hash.get("cho_issu_cnt");
		dm.local_issu_cnt = (String)hash.get("local_issu_cnt");
		dm.avg_cnt = (String)hash.get("avg_cnt");
		dm.non_dduc_rate = (String)hash.get("non_dduc_rate");
		dm.incmg_pers_ipadd = (String)hash.get("incmg_pers_ipadd");
		dm.incmg_pers = (String)hash.get("incmg_pers");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.yymm = Util.getSessionParameterValue(req,"yymm",true);
		dm.non_dduc_yn = Util.getSessionParameterValue(req,"non_dduc_yn",true);
		dm.area_clsf = Util.getSessionParameterValue(req,"area_clsf",true);
		dm.paper_amt = Util.getSessionParameterValue(req,"paper_amt",true);
		dm.submat_amt = Util.getSessionParameterValue(req,"submat_amt",true);
		dm.prt_amt = Util.getSessionParameterValue(req,"prt_amt",true);
		dm.non_dduc_paper_amt = Util.getSessionParameterValue(req,"non_dduc_paper_amt",true);
		dm.non_dduc_submat_amt = Util.getSessionParameterValue(req,"non_dduc_submat_amt",true);
		dm.non_dduc_prt_amt = Util.getSessionParameterValue(req,"non_dduc_prt_amt",true);
		dm.paper_amt_cost = Util.getSessionParameterValue(req,"paper_amt_cost",true);
		dm.submat_amt_cost = Util.getSessionParameterValue(req,"submat_amt_cost",true);
		dm.prt_amt_cost = Util.getSessionParameterValue(req,"prt_amt_cost",true);
		dm.pcnt_cost = Util.getSessionParameterValue(req,"pcnt_cost",true);
		dm.cho_issu_cnt = Util.getSessionParameterValue(req,"cho_issu_cnt",true);
		dm.local_issu_cnt = Util.getSessionParameterValue(req,"local_issu_cnt",true);
		dm.avg_cnt = Util.getSessionParameterValue(req,"avg_cnt",true);
		dm.non_dduc_rate = Util.getSessionParameterValue(req,"non_dduc_rate",true);
		dm.incmg_pers_ipadd = Util.getSessionParameterValue(req,"incmg_pers_ipadd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"incmg_pers",true);
		*******************************************************************************************/
	}
	public void mc_budg_6143_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_BUDG_6143_LDataSet ds = null;
		MC_BUDG_6143_LDM dm = new MC_BUDG_6143_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.yymm = Util.checkString(req.getParameter("yymm"));
		dm.kind = Util.checkString(req.getParameter("kind"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_BUDG_6143_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_BUDG_6000EJBHome home = (MC_BUDG_6000EJBHome)JNDIManager.getInstance().getHome("MC_BUDG_6000EJB");
			MC_BUDG_6000EJB ejb = home.create();

			ds = ejb.mc_budg_6143_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
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
		dm.kind = (String)hash.get("kind");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.yymm = Util.getSessionParameterValue(req,"yymm",true);
		dm.kind = Util.getSessionParameterValue(req,"kind",true);
		*******************************************************************************************/
	}
	public void mc_budg_6150_m(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {

		System.out.println("zzz");
		MC_BUDG_6150_MDataSet ds = null;
		MC_BUDG_6150_MDM dm = new MC_BUDG_6150_MDM();

		System.out.println("aaa");
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		System.out.println("bbb");
		dm.yymm = Util.checkString(req.getParameter("yyyy_tab2"));
		System.out.println("ccc");
		dm.print();
		System.out.println("ddd");
		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_BUDG_6150_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_BUDG_6000EJBHome home = (MC_BUDG_6000EJBHome)JNDIManager.getInstance().getHome("MC_BUDG_6000EJB");
			MC_BUDG_6000EJB ejb = home.create();

			ds = ejb.mc_budg_6140_m(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
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
	public void mc_budg_6151_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_BUDG_6151_LDataSet ds = null;
		MC_BUDG_6151_LDM dm = new MC_BUDG_6151_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.yymm_fr = Util.checkString(req.getParameter("yymm_fr"));
		dm.yymm_to = Util.checkString(req.getParameter("yymm_to"));
		dm.rate = req.getParameter("rate");
		dm.kind = Util.checkString(req.getParameter("kind"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_BUDG_6151_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_BUDG_6000EJBHome home = (MC_BUDG_6000EJBHome)JNDIManager.getInstance().getHome("MC_BUDG_6000EJB");
			MC_BUDG_6000EJB ejb = home.create();

			ds = ejb.mc_budg_6141_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
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
		dm.rate = (String)hash.get("rate");
		dm.kind = (String)hash.get("kind");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.yymm = Util.getSessionParameterValue(req,"yymm",true);
		dm.rate = Util.getSessionParameterValue(req,"rate",true);
		dm.kind = Util.getSessionParameterValue(req,"kind",true);
		*******************************************************************************************/
	}
	public void mc_budg_6152_i(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_BUDG_6152_IDataSet ds = null;
		MC_BUDG_6152_IDM dm = new MC_BUDG_6152_IDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.yymm = Util.checkString(req.getParameter("yymm_fr"));
		//dm.yymm_to = Util.checkString(req.getParameter("yymm_to"));
		dm.non_dduc_yn = Util.checkString(req.getParameter("non_dduc_yn"));
		dm.area_clsf = Util.checkString(req.getParameter("area_clsf"));
		dm.paper_amt = Util.checkString(req.getParameter("paper_amt"));
		dm.submat_amt = Util.checkString(req.getParameter("submat_amt"));
		dm.prt_amt = Util.checkString(req.getParameter("prt_amt"));
		dm.non_dduc_paper_amt = Util.checkString(req.getParameter("non_dduc_paper_amt"));
		dm.non_dduc_submat_amt = Util.checkString(req.getParameter("non_dduc_submat_amt"));
		dm.non_dduc_prt_amt = Util.checkString(req.getParameter("non_dduc_prt_amt"));
		dm.paper_amt_cost = Util.checkString(req.getParameter("paper_amt_cost"));
		dm.submat_amt_cost = Util.checkString(req.getParameter("submat_amt_cost"));
		dm.prt_amt_cost = Util.checkString(req.getParameter("prt_amt_cost"));
		dm.pcnt_cost = Util.checkString(req.getParameter("pcnt_cost"));
		dm.cho_issu_cnt = Util.checkString(req.getParameter("cho_issu_cnt"));
		dm.local_issu_cnt = Util.checkString(req.getParameter("local_issu_cnt"));
		dm.avg_cnt = Util.checkString(req.getParameter("avg_cnt"));
		dm.non_dduc_rate = Util.checkString(req.getParameter("non_dduc_rate"));
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.incmg_pers_ipadd = req.getRemoteAddr();

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_BUDG_6152_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_BUDG_6000EJBHome home = (MC_BUDG_6000EJBHome)JNDIManager.getInstance().getHome("MC_BUDG_6000EJB");
			MC_BUDG_6000EJB ejb = home.create();

			ds = ejb.mc_budg_6142_i(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
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
		dm.non_dduc_yn = (String)hash.get("non_dduc_yn");
		dm.area_clsf = (String)hash.get("area_clsf");
		dm.paper_amt = (String)hash.get("paper_amt");
		dm.submat_amt = (String)hash.get("submat_amt");
		dm.prt_amt = (String)hash.get("prt_amt");
		dm.non_dduc_paper_amt = (String)hash.get("non_dduc_paper_amt");
		dm.non_dduc_submat_amt = (String)hash.get("non_dduc_submat_amt");
		dm.non_dduc_prt_amt = (String)hash.get("non_dduc_prt_amt");
		dm.paper_amt_cost = (String)hash.get("paper_amt_cost");
		dm.submat_amt_cost = (String)hash.get("submat_amt_cost");
		dm.prt_amt_cost = (String)hash.get("prt_amt_cost");
		dm.pcnt_cost = (String)hash.get("pcnt_cost");
		dm.cho_issu_cnt = (String)hash.get("cho_issu_cnt");
		dm.local_issu_cnt = (String)hash.get("local_issu_cnt");
		dm.avg_cnt = (String)hash.get("avg_cnt");
		dm.non_dduc_rate = (String)hash.get("non_dduc_rate");
		dm.incmg_pers_ipadd = (String)hash.get("incmg_pers_ipadd");
		dm.incmg_pers = (String)hash.get("incmg_pers");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.yymm = Util.getSessionParameterValue(req,"yymm",true);
		dm.non_dduc_yn = Util.getSessionParameterValue(req,"non_dduc_yn",true);
		dm.area_clsf = Util.getSessionParameterValue(req,"area_clsf",true);
		dm.paper_amt = Util.getSessionParameterValue(req,"paper_amt",true);
		dm.submat_amt = Util.getSessionParameterValue(req,"submat_amt",true);
		dm.prt_amt = Util.getSessionParameterValue(req,"prt_amt",true);
		dm.non_dduc_paper_amt = Util.getSessionParameterValue(req,"non_dduc_paper_amt",true);
		dm.non_dduc_submat_amt = Util.getSessionParameterValue(req,"non_dduc_submat_amt",true);
		dm.non_dduc_prt_amt = Util.getSessionParameterValue(req,"non_dduc_prt_amt",true);
		dm.paper_amt_cost = Util.getSessionParameterValue(req,"paper_amt_cost",true);
		dm.submat_amt_cost = Util.getSessionParameterValue(req,"submat_amt_cost",true);
		dm.prt_amt_cost = Util.getSessionParameterValue(req,"prt_amt_cost",true);
		dm.pcnt_cost = Util.getSessionParameterValue(req,"pcnt_cost",true);
		dm.cho_issu_cnt = Util.getSessionParameterValue(req,"cho_issu_cnt",true);
		dm.local_issu_cnt = Util.getSessionParameterValue(req,"local_issu_cnt",true);
		dm.avg_cnt = Util.getSessionParameterValue(req,"avg_cnt",true);
		dm.non_dduc_rate = Util.getSessionParameterValue(req,"non_dduc_rate",true);
		dm.incmg_pers_ipadd = Util.getSessionParameterValue(req,"incmg_pers_ipadd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"incmg_pers",true);
		*******************************************************************************************/
	}
	public void mc_budg_6153_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_BUDG_6153_LDataSet ds = null;
		MC_BUDG_6153_LDM dm = new MC_BUDG_6153_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.yymm_fr = Util.checkString(req.getParameter("yymm_fr"));
		dm.yymm_to = Util.checkString(req.getParameter("yymm_to"));
		dm.kind = Util.checkString(req.getParameter("kind"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_BUDG_6153_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_BUDG_6000EJBHome home = (MC_BUDG_6000EJBHome)JNDIManager.getInstance().getHome("MC_BUDG_6000EJB");
			MC_BUDG_6000EJB ejb = home.create();

			ds = ejb.mc_budg_6143_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
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
		dm.kind = (String)hash.get("kind");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.yymm = Util.getSessionParameterValue(req,"yymm",true);
		dm.kind = Util.getSessionParameterValue(req,"kind",true);
		*******************************************************************************************/
	}
	public void mc_budg_6210_m(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_BUDG_6210_MDataSet ds = null;
		MC_BUDG_6210_MDM dm = new MC_BUDG_6210_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.yy = Util.checkString(req.getParameter("yyyy_tab2"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_BUDG_6210_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_BUDG_6000EJBHome home = (MC_BUDG_6000EJBHome)JNDIManager.getInstance().getHome("MC_BUDG_6000EJB");
			MC_BUDG_6000EJB ejb = home.create();

			ds = ejb.mc_budg_6210_m(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		EJB 수정전 끝 */

		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.yy = (String)hash.get("yy");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.yy = Util.getSessionParameterValue(req,"yy",true);
		*******************************************************************************************/
	}
	public void mc_budg_6211_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_BUDG_6211_LDataSet ds = null;
		MC_BUDG_6211_LDM dm = new MC_BUDG_6211_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.yy = Util.checkString(req.getParameter("yyyy_tab2"));
		dm.tms = Util.checkString(req.getParameter("tms_tab2"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_BUDG_6211_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_BUDG_6000EJBHome home = (MC_BUDG_6000EJBHome)JNDIManager.getInstance().getHome("MC_BUDG_6000EJB");
			MC_BUDG_6000EJB ejb = home.create();

			ds = ejb.mc_budg_6211_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		EJB 수정전 끝 */

		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.yy = (String)hash.get("yy");
		dm.tms = (String)hash.get("tms");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.yy = Util.getSessionParameterValue(req,"yy",true);
		dm.tms = Util.getSessionParameterValue(req,"tms",true);
		*******************************************************************************************/
	}
	public void mc_budg_6212_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_BUDG_6212_LDataSet ds = null;
		MC_BUDG_6212_LDM dm = new MC_BUDG_6212_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.yy = Util.checkString(req.getParameter("yyyy_tab2"));
		dm.tms = Util.checkString(req.getParameter("tms_tab2"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_BUDG_6212_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_BUDG_6000EJBHome home = (MC_BUDG_6000EJBHome)JNDIManager.getInstance().getHome("MC_BUDG_6000EJB");
			MC_BUDG_6000EJB ejb = home.create();

			ds = ejb.mc_budg_6212_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		EJB 수정전 끝 */

		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.yy = (String)hash.get("yy");
		dm.tms = (String)hash.get("tms");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.yy = Util.getSessionParameterValue(req,"yy",true);
		dm.tms = Util.getSessionParameterValue(req,"tms",true);
		*******************************************************************************************/
	}
	public void mc_budg_6213_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_BUDG_6213_LDataSet ds = null;
		MC_BUDG_6213_LDM dm = new MC_BUDG_6213_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.yy = Util.checkString(req.getParameter("yyyy_tab2"));
		dm.tms = Util.checkString(req.getParameter("tms_tab2"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_BUDG_6213_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_BUDG_6000EJBHome home = (MC_BUDG_6000EJBHome)JNDIManager.getInstance().getHome("MC_BUDG_6000EJB");
			MC_BUDG_6000EJB ejb = home.create();

			ds = ejb.mc_budg_6213_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		EJB 수정전 끝 */

		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.yy = (String)hash.get("yy");
		dm.tms = (String)hash.get("tms");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.yy = Util.getSessionParameterValue(req,"yy",true);
		dm.tms = Util.getSessionParameterValue(req,"tms",true);
		*******************************************************************************************/
	}
	public void mc_budg_6214_i(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_BUDG_6214_IDataSet ds = null;
		MC_BUDG_6214_IDM dm = new MC_BUDG_6214_IDM();

		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData_tab2"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);
		
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.yy = Util.checkString(req.getParameter("yyyy_tab2"));
		dm.tms = Util.checkString(req.getParameter("tms_tab2"));
		dm.clsf_cd = Util.checkString(req.getParameter("clsf_cd"));
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		
		dm.budg_clas_cd = (String)hash.get("budg_clas_cd");
		dm.mm_amt_1 = (String)hash.get("mm_amt_1");
		dm.mm_amt_2 = (String)hash.get("mm_amt_2");
		dm.mm_amt_3 = (String)hash.get("mm_amt_3");
		dm.mm_amt_4 = (String)hash.get("mm_amt_4");
		dm.mm_amt_5 = (String)hash.get("mm_amt_5");
		dm.mm_amt_6 = (String)hash.get("mm_amt_6");
		dm.mm_amt_7 = (String)hash.get("mm_amt_7");
		dm.mm_amt_8 = (String)hash.get("mm_amt_8");
		dm.mm_amt_9 = (String)hash.get("mm_amt_9");
		dm.mm_amt_10 = (String)hash.get("mm_amt_10");
		dm.mm_amt_11 = (String)hash.get("mm_amt_11");
		dm.mm_amt_12 = (String)hash.get("mm_amt_12");
		
		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_BUDG_6214_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_BUDG_6000EJBHome home = (MC_BUDG_6000EJBHome)JNDIManager.getInstance().getHome("MC_BUDG_6000EJB");
			MC_BUDG_6000EJB ejb = home.create();

			ds = ejb.mc_budg_6214_i(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		EJB 수정전 끝 */

		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.yy = (String)hash.get("yy");
		dm.tms = (String)hash.get("tms");
		dm.clsf_cd = (String)hash.get("clsf_cd");
		dm.budg_clas_cd = (String)hash.get("budg_clas_cd");
		dm.mm_amt_1 = (String)hash.get("mm_amt_1");
		dm.mm_amt_2 = (String)hash.get("mm_amt_2");
		dm.mm_amt_3 = (String)hash.get("mm_amt_3");
		dm.mm_amt_4 = (String)hash.get("mm_amt_4");
		dm.mm_amt_5 = (String)hash.get("mm_amt_5");
		dm.mm_amt_6 = (String)hash.get("mm_amt_6");
		dm.mm_amt_7 = (String)hash.get("mm_amt_7");
		dm.mm_amt_8 = (String)hash.get("mm_amt_8");
		dm.mm_amt_9 = (String)hash.get("mm_amt_9");
		dm.mm_amt_10 = (String)hash.get("mm_amt_10");
		dm.mm_amt_11 = (String)hash.get("mm_amt_11");
		dm.mm_amt_12 = (String)hash.get("mm_amt_12");
		dm.incmg_pers_ipadd = (String)hash.get("incmg_pers_ipadd");
		dm.incmg_pers = (String)hash.get("incmg_pers");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.yy = Util.getSessionParameterValue(req,"yy",true);
		dm.tms = Util.getSessionParameterValue(req,"tms",true);
		dm.clsf_cd = Util.getSessionParameterValue(req,"clsf_cd",true);
		dm.budg_clas_cd = Util.getSessionParameterValue(req,"budg_clas_cd",true);
		dm.mm_amt_1 = Util.getSessionParameterValue(req,"mm_amt_1",true);
		dm.mm_amt_2 = Util.getSessionParameterValue(req,"mm_amt_2",true);
		dm.mm_amt_3 = Util.getSessionParameterValue(req,"mm_amt_3",true);
		dm.mm_amt_4 = Util.getSessionParameterValue(req,"mm_amt_4",true);
		dm.mm_amt_5 = Util.getSessionParameterValue(req,"mm_amt_5",true);
		dm.mm_amt_6 = Util.getSessionParameterValue(req,"mm_amt_6",true);
		dm.mm_amt_7 = Util.getSessionParameterValue(req,"mm_amt_7",true);
		dm.mm_amt_8 = Util.getSessionParameterValue(req,"mm_amt_8",true);
		dm.mm_amt_9 = Util.getSessionParameterValue(req,"mm_amt_9",true);
		dm.mm_amt_10 = Util.getSessionParameterValue(req,"mm_amt_10",true);
		dm.mm_amt_11 = Util.getSessionParameterValue(req,"mm_amt_11",true);
		dm.mm_amt_12 = Util.getSessionParameterValue(req,"mm_amt_12",true);
		dm.incmg_pers_ipadd = Util.getSessionParameterValue(req,"incmg_pers_ipadd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"incmg_pers",true);
		*******************************************************************************************/
	}
	public void mc_budg_6271_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_BUDG_6271_LDataSet ds = null;
		MC_BUDG_6271_LDM dm = new MC_BUDG_6271_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.budg_cd = Util.checkString(req.getParameter("budg_cd"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_BUDG_6271_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_BUDG_6000EJBHome home = (MC_BUDG_6000EJBHome)JNDIManager.getInstance().getHome("MC_BUDG_6000EJB");
			MC_BUDG_6000EJB ejb = home.create();

			ds = ejb.mc_budg_6271_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
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
	public void mc_budg_6272_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_BUDG_6272_LDataSet ds = null;
		MC_BUDG_6272_LDM dm = new MC_BUDG_6272_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.bulen = Util.checkString(req.getParameter("bulen"));
		dm.buzero = Util.checkString(req.getParameter("buzero"));
		dm.tms1 = Util.checkString(req.getParameter("tms1"));
		dm.cls_cd = Util.checkString(req.getParameter("cls_cd"));
		dm.budg_yy = Util.checkString(req.getParameter("budg_yy"));
		dm.budg_cd = Util.checkString(req.getParameter("budg_cd"));
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.tms2 = Util.checkString(req.getParameter("tms2"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_BUDG_6272_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_BUDG_6000EJBHome home = (MC_BUDG_6000EJBHome)JNDIManager.getInstance().getHome("MC_BUDG_6000EJB");
			MC_BUDG_6000EJB ejb = home.create();

			ds = ejb.mc_budg_6272_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		EJB 수정전 끝 */

		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.bulen = (String)hash.get("bulen");
		dm.buzero = (String)hash.get("buzero");
		dm.tms1 = (String)hash.get("tms1");
		dm.cls_cd = (String)hash.get("cls_cd");
		dm.budg_yy = (String)hash.get("budg_yy");
		dm.budg_cd = (String)hash.get("budg_cd");
		dm.dept_cd = (String)hash.get("dept_cd");
		dm.tms2 = (String)hash.get("tms2");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.bulen = Util.getSessionParameterValue(req,"bulen",true);
		dm.buzero = Util.getSessionParameterValue(req,"buzero",true);
		dm.tms1 = Util.getSessionParameterValue(req,"tms1",true);
		dm.cls_cd = Util.getSessionParameterValue(req,"cls_cd",true);
		dm.budg_yy = Util.getSessionParameterValue(req,"budg_yy",true);
		dm.budg_cd = Util.getSessionParameterValue(req,"budg_cd",true);
		dm.dept_cd = Util.getSessionParameterValue(req,"dept_cd",true);
		dm.tms2 = Util.getSessionParameterValue(req,"tms2",true);
		*******************************************************************************************/
	}
	public void mc_budg_6273_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_BUDG_6273_LDataSet ds = null;
		MC_BUDG_6273_LDM dm = new MC_BUDG_6273_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.bulen = Util.checkString(req.getParameter("bulen"));
		dm.buzero = Util.checkString(req.getParameter("buzero"));
		dm.tms1 = Util.checkString(req.getParameter("tms1"));
		dm.cls_cd = Util.checkString(req.getParameter("cls_cd"));
		dm.budg_yy = Util.checkString(req.getParameter("budg_yy"));
		dm.budg_cd = Util.checkString(req.getParameter("budg_cd"));
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.tms2 = Util.checkString(req.getParameter("tms2"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_BUDG_6273_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_BUDG_6000EJBHome home = (MC_BUDG_6000EJBHome)JNDIManager.getInstance().getHome("MC_BUDG_6000EJB");
			MC_BUDG_6000EJB ejb = home.create();

			ds = ejb.mc_budg_6273_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		EJB 수정전 끝 */

		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.bulen = (String)hash.get("bulen");
		dm.buzero = (String)hash.get("buzero");
		dm.tms1 = (String)hash.get("tms1");
		dm.cls_cd = (String)hash.get("cls_cd");
		dm.budg_yy = (String)hash.get("budg_yy");
		dm.budg_cd = (String)hash.get("budg_cd");
		dm.dept_cd = (String)hash.get("dept_cd");
		dm.tms2 = (String)hash.get("tms2");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.bulen = Util.getSessionParameterValue(req,"bulen",true);
		dm.buzero = Util.getSessionParameterValue(req,"buzero",true);
		dm.tms1 = Util.getSessionParameterValue(req,"tms1",true);
		dm.cls_cd = Util.getSessionParameterValue(req,"cls_cd",true);
		dm.budg_yy = Util.getSessionParameterValue(req,"budg_yy",true);
		dm.budg_cd = Util.getSessionParameterValue(req,"budg_cd",true);
		dm.dept_cd = Util.getSessionParameterValue(req,"dept_cd",true);
		dm.tms2 = Util.getSessionParameterValue(req,"tms2",true);
		*******************************************************************************************/
	}
	public void mc_budg_6274_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_BUDG_6274_LDataSet ds = null;
		MC_BUDG_6274_LDM dm = new MC_BUDG_6274_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.budg_yy = Util.checkString(req.getParameter("budg_yy"));
		dm.bulen = Util.checkString(req.getParameter("bulen"));
		dm.buzero = Util.checkString(req.getParameter("buzero"));
		dm.budg_ym = Util.checkString(req.getParameter("budg_ym"));
		dm.budg_yy1 = Util.checkString(req.getParameter("budg_yy1"));
		dm.cls_cd = Util.checkString(req.getParameter("cls_cd"));
		dm.budg_by = Util.checkString(req.getParameter("budg_by"));
		dm.budg_cd = Util.checkString(req.getParameter("budg_cd"));
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_BUDG_6274_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_BUDG_6000EJBHome home = (MC_BUDG_6000EJBHome)JNDIManager.getInstance().getHome("MC_BUDG_6000EJB");
			MC_BUDG_6000EJB ejb = home.create();

			ds = ejb.mc_budg_6274_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
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
		dm.bulen = (String)hash.get("bulen");
		dm.buzero = (String)hash.get("buzero");
		dm.budg_ym = (String)hash.get("budg_ym");
		dm.budg_yy1 = (String)hash.get("budg_yy1");
		dm.cls_cd = (String)hash.get("cls_cd");
		dm.budg_by = (String)hash.get("budg_by");
		dm.budg_cd = (String)hash.get("budg_cd");
		dm.dept_cd = (String)hash.get("dept_cd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.budg_yy = Util.getSessionParameterValue(req,"budg_yy",true);
		dm.bulen = Util.getSessionParameterValue(req,"bulen",true);
		dm.buzero = Util.getSessionParameterValue(req,"buzero",true);
		dm.budg_ym = Util.getSessionParameterValue(req,"budg_ym",true);
		dm.budg_yy1 = Util.getSessionParameterValue(req,"budg_yy1",true);
		dm.cls_cd = Util.getSessionParameterValue(req,"cls_cd",true);
		dm.budg_by = Util.getSessionParameterValue(req,"budg_by",true);
		dm.budg_cd = Util.getSessionParameterValue(req,"budg_cd",true);
		dm.dept_cd = Util.getSessionParameterValue(req,"dept_cd",true);
		*******************************************************************************************/
	}
	public void mc_budg_6275_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_BUDG_6275_LDataSet ds = null;
		MC_BUDG_6275_LDM dm = new MC_BUDG_6275_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.budg_yy = Util.checkString(req.getParameter("budg_yy"));
		dm.bulen = Util.checkString(req.getParameter("bulen"));
		dm.buzero = Util.checkString(req.getParameter("buzero"));
		dm.budg_ym = Util.checkString(req.getParameter("budg_ym"));
		dm.cls_cd = Util.checkString(req.getParameter("cls_cd"));
		dm.budg_by = Util.checkString(req.getParameter("budg_by"));
		dm.budg_cd = Util.checkString(req.getParameter("budg_cd"));
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.tms = Util.checkString(req.getParameter("tms"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_BUDG_6275_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_BUDG_6000EJBHome home = (MC_BUDG_6000EJBHome)JNDIManager.getInstance().getHome("MC_BUDG_6000EJB");
			MC_BUDG_6000EJB ejb = home.create();

			ds = ejb.mc_budg_6275_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
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
		dm.bulen = (String)hash.get("bulen");
		dm.buzero = (String)hash.get("buzero");
		dm.budg_ym = (String)hash.get("budg_ym");
		dm.cls_cd = (String)hash.get("cls_cd");
		dm.budg_by = (String)hash.get("budg_by");
		dm.budg_cd = (String)hash.get("budg_cd");
		dm.dept_cd = (String)hash.get("dept_cd");
		dm.tms = (String)hash.get("tms");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.budg_yy = Util.getSessionParameterValue(req,"budg_yy",true);
		dm.bulen = Util.getSessionParameterValue(req,"bulen",true);
		dm.buzero = Util.getSessionParameterValue(req,"buzero",true);
		dm.budg_ym = Util.getSessionParameterValue(req,"budg_ym",true);
		dm.cls_cd = Util.getSessionParameterValue(req,"cls_cd",true);
		dm.budg_by = Util.getSessionParameterValue(req,"budg_by",true);
		dm.budg_cd = Util.getSessionParameterValue(req,"budg_cd",true);
		dm.dept_cd = Util.getSessionParameterValue(req,"dept_cd",true);
		dm.tms = Util.getSessionParameterValue(req,"tms",true);
		*******************************************************************************************/
	}
	
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
			MC_BUDG_6000EJBHome home = (MC_BUDG_6000EJBHome)JNDIManager.getInstance().getHome("MC_BUDG_6000EJB");
			MC_BUDG_6000EJB ejb = home.create();
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
	public void mc_budg_6241_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_BUDG_6241_LDataSet ds = null;
		MC_BUDG_6241_LDM dm = new MC_BUDG_6241_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.yymm = Util.checkString(req.getParameter("yymm"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_BUDG_6241_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_BUDG_6000EJBHome home = (MC_BUDG_6000EJBHome)JNDIManager.getInstance().getHome("MC_BUDG_6000EJB");
			MC_BUDG_6000EJB ejb = home.create();

			ds = ejb.mc_budg_6241_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
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
	public void mc_budg_6251_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_BUDG_6251_LDataSet ds = null;
		MC_BUDG_6251_LDM dm = new MC_BUDG_6251_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.yymm = Util.checkString(req.getParameter("yymm"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_BUDG_6251_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_BUDG_6000EJBHome home = (MC_BUDG_6000EJBHome)JNDIManager.getInstance().getHome("MC_BUDG_6000EJB");
			MC_BUDG_6000EJB ejb = home.create();

			ds = ejb.mc_budg_6251_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
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
	public void mc_budg_6261_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_BUDG_6261_LDataSet ds = null;
		MC_BUDG_6261_LDM dm = new MC_BUDG_6261_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.yymm = Util.checkString(req.getParameter("yymm"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_BUDG_6261_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_BUDG_6000EJBHome home = (MC_BUDG_6000EJBHome)JNDIManager.getInstance().getHome("MC_BUDG_6000EJB");
			MC_BUDG_6000EJB ejb = home.create();

			ds = ejb.mc_budg_6261_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
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
	public void mc_budg_6231_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_BUDG_6231_LDataSet ds = null;
		MC_BUDG_6231_LDM dm = new MC_BUDG_6231_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.yymm = Util.checkString(req.getParameter("yymm"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_BUDG_6231_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_BUDG_6000EJBHome home = (MC_BUDG_6000EJBHome)JNDIManager.getInstance().getHome("MC_BUDG_6000EJB");
			MC_BUDG_6000EJB ejb = home.create();

			ds = ejb.mc_budg_6231_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
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
	public void mc_budg_6232_i(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_BUDG_6232_IDataSet ds = null;
		MC_BUDG_6232_IDM dm = new MC_BUDG_6232_IDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.yymm = Util.checkString(req.getParameter("yymm"));
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.incmg_pers_ipadd = req.getRemoteAddr();

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_BUDG_6232_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_BUDG_6000EJBHome home = (MC_BUDG_6000EJBHome)JNDIManager.getInstance().getHome("MC_BUDG_6000EJB");
			MC_BUDG_6000EJB ejb = home.create();

			ds = ejb.mc_budg_6232_i(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
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
		dm.incmg_pers_ipadd = (String)hash.get("incmg_pers_ipadd");
		dm.incmg_pers = (String)hash.get("incmg_pers");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.yymm = Util.getSessionParameterValue(req,"yymm",true);
		dm.incmg_pers_ipadd = Util.getSessionParameterValue(req,"incmg_pers_ipadd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"incmg_pers",true);
		*******************************************************************************************/
	}
	public void mc_budg_6221_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_BUDG_6221_LDataSet ds = null;
		MC_BUDG_6221_LDM dm = new MC_BUDG_6221_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.yymm = Util.checkString(req.getParameter("yymm"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_BUDG_6221_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_BUDG_6000EJBHome home = (MC_BUDG_6000EJBHome)JNDIManager.getInstance().getHome("MC_BUDG_6000EJB");
			MC_BUDG_6000EJB ejb = home.create();

			ds = ejb.mc_budg_6221_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
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
	public void mc_budg_6222_i(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_BUDG_6222_IDataSet ds = null;
		MC_BUDG_6222_IDM dm = new MC_BUDG_6222_IDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.yymm = Util.checkString(req.getParameter("yymm"));
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);
		dm.mode = (String)hash.get("mode");
		dm.sect_cd = (String)hash.get("sect_cd");
		dm.pubc_side = (String)hash.get("sect_cdnm");
		dm.sect_nm_cd = (String)hash.get("sect_nm_cd");
		dm.excl_clsf = (String)hash.get("excl_clsf");

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_BUDG_6222_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_BUDG_6000EJBHome home = (MC_BUDG_6000EJBHome)JNDIManager.getInstance().getHome("MC_BUDG_6000EJB");
			MC_BUDG_6000EJB ejb = home.create();

			ds = ejb.mc_budg_6222_i(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
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
		dm.sect_cd = (String)hash.get("sect_cd");
		dm.pubc_side = (String)hash.get("pubc_side");
		dm.sect_nm_cd = (String)hash.get("sect_nm_cd");
		dm.excl_clsf = (String)hash.get("excl_clsf");
		dm.incmg_pers = (String)hash.get("incmg_pers");
		dm.incmg_pers_ipadd = (String)hash.get("incmg_pers_ipadd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.mode = Util.getSessionParameterValue(req,"mode",true);
		dm.yymm = Util.getSessionParameterValue(req,"yymm",true);
		dm.sect_cd = Util.getSessionParameterValue(req,"sect_cd",true);
		dm.pubc_side = Util.getSessionParameterValue(req,"pubc_side",true);
		dm.sect_nm_cd = Util.getSessionParameterValue(req,"sect_nm_cd",true);
		dm.excl_clsf = Util.getSessionParameterValue(req,"excl_clsf",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"incmg_pers",true);
		dm.incmg_pers_ipadd = Util.getSessionParameterValue(req,"incmg_pers_ipadd",true);
		*******************************************************************************************/
	}
	public void mc_budg_6000_m(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_BUDG_6000_MDataSet ds = null;
		MC_BUDG_6000_MDM dm = new MC_BUDG_6000_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.yyyy = Util.checkString(req.getParameter("yyyy"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_BUDG_6000_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_BUDG_6000EJBHome home = (MC_BUDG_6000EJBHome)JNDIManager.getInstance().getHome("MC_BUDG_6000EJB");
			MC_BUDG_6000EJB ejb = home.create();

			ds = ejb.mc_budg_6000_m(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
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
	public void mc_budg_6001_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_BUDG_6001_LDataSet ds = null;
		MC_BUDG_6001_LDM dm = new MC_BUDG_6001_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.tms = Util.checkString(req.getParameter("tms"));
		dm.budg_frym = Util.checkString(req.getParameter("budg_frym"));
		dm.budg_toym = Util.checkString(req.getParameter("budg_toym"));
		dm.budg_frcd = Util.checkString(req.getParameter("budg_frcd"));
		dm.budg_tocd = Util.checkString(req.getParameter("budg_tocd"));
		dm.dept_frcd = Util.checkString(req.getParameter("dept_frcd"));
		dm.dept_tocd = Util.checkString(req.getParameter("dept_tocd"));
		dm.evnt_frcd = Util.checkString(req.getParameter("evnt_frcd"));
		dm.evnt_tocd = Util.checkString(req.getParameter("evnt_tocd"));
		dm.sort = Util.checkString(req.getParameter("sort"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_BUDG_6001_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_BUDG_6000EJBHome home = (MC_BUDG_6000EJBHome)JNDIManager.getInstance().getHome("MC_BUDG_6000EJB");
			MC_BUDG_6000EJB ejb = home.create();

			ds = ejb.mc_budg_6001_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		EJB 수정전 끝 */

		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.tms = (String)hash.get("tms");
		dm.budg_frym = (String)hash.get("budg_frym");
		dm.budg_toym = (String)hash.get("budg_toym");
		dm.budg_frcd = (String)hash.get("budg_frcd");
		dm.budg_tocd = (String)hash.get("budg_tocd");
		dm.dept_frcd = (String)hash.get("dept_frcd");
		dm.dept_tocd = (String)hash.get("dept_tocd");
		dm.evnt_frcd = (String)hash.get("evnt_frcd");
		dm.evnt_tocd = (String)hash.get("evnt_tocd");
		dm.sort = (String)hash.get("sort");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.tms = Util.getSessionParameterValue(req,"tms",true);
		dm.budg_frym = Util.getSessionParameterValue(req,"budg_frym",true);
		dm.budg_toym = Util.getSessionParameterValue(req,"budg_toym",true);
		dm.budg_frcd = Util.getSessionParameterValue(req,"budg_frcd",true);
		dm.budg_tocd = Util.getSessionParameterValue(req,"budg_tocd",true);
		dm.dept_frcd = Util.getSessionParameterValue(req,"dept_frcd",true);
		dm.dept_tocd = Util.getSessionParameterValue(req,"dept_tocd",true);
		dm.evnt_frcd = Util.getSessionParameterValue(req,"evnt_frcd",true);
		dm.evnt_tocd = Util.getSessionParameterValue(req,"evnt_tocd",true);
		dm.sort = Util.getSessionParameterValue(req,"sort",true);
		*******************************************************************************************/
	}
	public void mc_budg_6002_i(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_BUDG_6002_IDataSet ds = null;
		MC_BUDG_6002_IDM dm = new MC_BUDG_6002_IDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.budg_yy = Util.checkString(req.getParameter("budg_yy"));
		dm.tms = Util.checkString(req.getParameter("tms"));
		
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);
		
		dm.budg_yymm = (String)hash.get("budg_yymm");
		dm.budg_cd = (String)hash.get("budg_cd");
		dm.dept_cd = (String)hash.get("dept_cd");
		dm.evnt_cd = (String)hash.get("evnt_cd");
		dm.work_no = (String)hash.get("work_no");
		dm.seq = (String)hash.get("seq");
		dm.asin_qunt = (String)hash.get("asin_qunt2");
		dm.req_uprc = (String)hash.get("asin_uprc2");
		dm.asin_amt = (String)hash.get("asin_amt2");
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_BUDG_6002_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_BUDG_6000EJBHome home = (MC_BUDG_6000EJBHome)JNDIManager.getInstance().getHome("MC_BUDG_6000EJB");
			MC_BUDG_6000EJB ejb = home.create();

			ds = ejb.mc_budg_6002_i(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
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
		dm.budg_yymm = (String)hash.get("budg_yymm");
		dm.budg_cd = (String)hash.get("budg_cd");
		dm.dept_cd = (String)hash.get("dept_cd");
		dm.evnt_cd = (String)hash.get("evnt_cd");
		dm.tms = (String)hash.get("tms");
		dm.work_no = (String)hash.get("work_no");
		dm.seq = (String)hash.get("seq");
		dm.asin_qunt = (String)hash.get("asin_qunt");
		dm.req_uprc = (String)hash.get("req_uprc");
		dm.asin_amt = (String)hash.get("asin_amt");
		dm.incmg_pers = (String)hash.get("incmg_pers");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.budg_yy = Util.getSessionParameterValue(req,"budg_yy",true);
		dm.budg_yymm = Util.getSessionParameterValue(req,"budg_yymm",true);
		dm.budg_cd = Util.getSessionParameterValue(req,"budg_cd",true);
		dm.dept_cd = Util.getSessionParameterValue(req,"dept_cd",true);
		dm.evnt_cd = Util.getSessionParameterValue(req,"evnt_cd",true);
		dm.tms = Util.getSessionParameterValue(req,"tms",true);
		dm.work_no = Util.getSessionParameterValue(req,"work_no",true);
		dm.seq = Util.getSessionParameterValue(req,"seq",true);
		dm.asin_qunt = Util.getSessionParameterValue(req,"asin_qunt",true);
		dm.req_uprc = Util.getSessionParameterValue(req,"req_uprc",true);
		dm.asin_amt = Util.getSessionParameterValue(req,"asin_amt",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"incmg_pers",true);
		*******************************************************************************************/
	}
	public void mc_budg_6003_i(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_BUDG_6003_IDataSet ds = null;
		MC_BUDG_6003_IDM dm = new MC_BUDG_6003_IDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.budg_yy = Util.checkString(req.getParameter("budg_yy"));
		dm.tms = Util.checkString(req.getParameter("tms"));
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.budg_yymm = (String)hash.get("budg_yymm");
		dm.budg_cd = (String)hash.get("budg_cd");
		dm.dept_cd = (String)hash.get("dept_cd");
		dm.evnt_cd = (String)hash.get("evnt_cd");
		dm.work_no = (String)hash.get("work_no");
		dm.seq = (String)hash.get("seq");

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_BUDG_6003_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_BUDG_6000EJBHome home = (MC_BUDG_6000EJBHome)JNDIManager.getInstance().getHome("MC_BUDG_6000EJB");
			MC_BUDG_6000EJB ejb = home.create();

			ds = ejb.mc_budg_6003_i(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
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
		dm.budg_yymm = (String)hash.get("budg_yymm");
		dm.budg_cd = (String)hash.get("budg_cd");
		dm.dept_cd = (String)hash.get("dept_cd");
		dm.evnt_cd = (String)hash.get("evnt_cd");
		dm.work_no = (String)hash.get("work_no");
		dm.seq = (String)hash.get("seq");
		dm.tms = (String)hash.get("tms");
		dm.incmg_pers = (String)hash.get("incmg_pers");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.budg_yy = Util.getSessionParameterValue(req,"budg_yy",true);
		dm.budg_yymm = Util.getSessionParameterValue(req,"budg_yymm",true);
		dm.budg_cd = Util.getSessionParameterValue(req,"budg_cd",true);
		dm.dept_cd = Util.getSessionParameterValue(req,"dept_cd",true);
		dm.evnt_cd = Util.getSessionParameterValue(req,"evnt_cd",true);
		dm.work_no = Util.getSessionParameterValue(req,"work_no",true);
		dm.seq = Util.getSessionParameterValue(req,"seq",true);
		dm.tms = Util.getSessionParameterValue(req,"tms",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"incmg_pers",true);
		*******************************************************************************************/
	}
	public void mc_budg_6281_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_BUDG_6281_LDataSet ds = null;
		MC_BUDG_6281_LDM dm = new MC_BUDG_6281_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.yymm = Util.checkString(req.getParameter("yymm"));
		dm.rate = Util.checkString(req.getParameter("rate"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_BUDG_6281_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_BUDG_6000EJBHome home = (MC_BUDG_6000EJBHome)JNDIManager.getInstance().getHome("MC_BUDG_6000EJB");
			MC_BUDG_6000EJB ejb = home.create();

			ds = ejb.mc_budg_6281_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
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
		dm.rate = (String)hash.get("rate");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.yymm = Util.getSessionParameterValue(req,"yymm",true);
		dm.rate = Util.getSessionParameterValue(req,"rate",true);
		*******************************************************************************************/
	}
	public void mc_budg_6290_m(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_BUDG_6290_MDataSet ds = null;
		MC_BUDG_6290_MDM dm = new MC_BUDG_6290_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.yymm = Util.checkString(req.getParameter("yymm2"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_BUDG_6290_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작		
		try {
			MC_BUDG_6000EJBHome home = (MC_BUDG_6000EJBHome)JNDIManager.getInstance().getHome("MC_BUDG_6000EJB");
			MC_BUDG_6000EJB ejb = home.create();

			ds = ejb.mc_budg_6290_m(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
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
	public void mc_budg_6291_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_BUDG_6291_LDataSet ds = null;
		MC_BUDG_6291_LDM dm = new MC_BUDG_6291_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.yymm = Util.checkString(req.getParameter("yymm"));
		dm.fix_fee = Util.checkString(req.getParameter("fix_fee"));
		dm.rate = Util.checkString(req.getParameter("aply_rate"));
		dm.chg_cost = Util.checkString(req.getParameter("chg_cost"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_BUDG_6291_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_BUDG_6000EJBHome home = (MC_BUDG_6000EJBHome)JNDIManager.getInstance().getHome("MC_BUDG_6000EJB");
			MC_BUDG_6000EJB ejb = home.create();

			ds = ejb.mc_budg_6291_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
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
		dm.fix_fee = (String)hash.get("fix_fee");
		dm.rate = (String)hash.get("rate");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.yymm = Util.getSessionParameterValue(req,"yymm",true);
		dm.fix_fee = Util.getSessionParameterValue(req,"fix_fee",true);
		dm.rate = Util.getSessionParameterValue(req,"rate",true);
		*******************************************************************************************/
	}
	public void mc_budg_6292_i(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_BUDG_6292_IDataSet ds = null;
		MC_BUDG_6292_IDM dm = new MC_BUDG_6292_IDM();

		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);
		
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.yymm = Util.checkString(req.getParameter("yymm"));
		dm.rate = Util.checkString(req.getParameter("rate"));
		dm.fix_fee = Util.checkString(req.getParameter("fix_fee"));
		dm.chg_cost = Util.checkString(req.getParameter("chg_cost"));
		dm.cost_clsf = Util.checkString(req.getParameter("cost_clsf"));
		dm.pcnt = (String)hash.get("pcnt1");
		dm.mm_amt = (String)hash.get("m_fee");
		dm.tms = Util.checkString(req.getParameter("tms"));		
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_BUDG_6292_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_BUDG_6000EJBHome home = (MC_BUDG_6000EJBHome)JNDIManager.getInstance().getHome("MC_BUDG_6000EJB");
			MC_BUDG_6000EJB ejb = home.create();

			ds = ejb.mc_budg_6292_i(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
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
		dm.rate = (String)hash.get("rate");
		dm.fix_fee = (String)hash.get("fix_fee");
		dm.chg_cost = (String)hash.get("chg_cost");
		dm.cost_clsf = (String)hash.get("cost_clsf");
		dm.pcnt = (String)hash.get("pcnt");
		dm.mm_amt = (String)hash.get("mm_amt");
		dm.tms = (String)hash.get("tms");
		dm.incmg_pers_ipadd = (String)hash.get("incmg_pers_ipadd");
		dm.incmg_pers = (String)hash.get("incmg_pers");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.yymm = Util.getSessionParameterValue(req,"yymm",true);
		dm.rate = Util.getSessionParameterValue(req,"rate",true);
		dm.fix_fee = Util.getSessionParameterValue(req,"fix_fee",true);
		dm.chg_cost = Util.getSessionParameterValue(req,"chg_cost",true);
		dm.cost_clsf = Util.getSessionParameterValue(req,"cost_clsf",true);
		dm.pcnt = Util.getSessionParameterValue(req,"pcnt",true);
		dm.mm_amt = Util.getSessionParameterValue(req,"mm_amt",true);
		dm.tms = Util.getSessionParameterValue(req,"tms",true);
		dm.incmg_pers_ipadd = Util.getSessionParameterValue(req,"incmg_pers_ipadd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"incmg_pers",true);
		*******************************************************************************************/
	}
	public void mc_budg_6293_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_BUDG_6293_LDataSet ds = null;
		MC_BUDG_6293_LDM dm = new MC_BUDG_6293_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.yymm = Util.checkString(req.getParameter("yymm"));
		dm.tms = Util.checkString(req.getParameter("tms"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_BUDG_6293_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_BUDG_6000EJBHome home = (MC_BUDG_6000EJBHome)JNDIManager.getInstance().getHome("MC_BUDG_6000EJB");
			MC_BUDG_6000EJB ejb = home.create();

			ds = ejb.mc_budg_6293_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
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
	public void mc_budg_6300_m(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_BUDG_6300_MDataSet ds = null;
		MC_BUDG_6300_MDM dm = new MC_BUDG_6300_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.yymm = Util.checkString(req.getParameter("yymm"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_BUDG_6300_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_BUDG_6000EJBHome home = (MC_BUDG_6000EJBHome)JNDIManager.getInstance().getHome("MC_BUDG_6000EJB");
			MC_BUDG_6000EJB ejb = home.create();

			ds = ejb.mc_budg_6300_m(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
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
	public void mc_budg_6301_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_BUDG_6301_LDataSet ds = null;
		MC_BUDG_6301_LDM dm = new MC_BUDG_6301_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.yymm = Util.checkString(req.getParameter("yymm"));
		dm.fix_fee = Util.checkString(req.getParameter("fix_fee"));
		dm.rate = Util.checkString(req.getParameter("rate"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_BUDG_6301_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_BUDG_6000EJBHome home = (MC_BUDG_6000EJBHome)JNDIManager.getInstance().getHome("MC_BUDG_6000EJB");
			MC_BUDG_6000EJB ejb = home.create();

			ds = ejb.mc_budg_6301_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
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
		dm.fix_fee = (String)hash.get("fix_fee");
		dm.rate = (String)hash.get("rate");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.yymm = Util.getSessionParameterValue(req,"yymm",true);
		dm.fix_fee = Util.getSessionParameterValue(req,"fix_fee",true);
		dm.rate = Util.getSessionParameterValue(req,"rate",true);
		*******************************************************************************************/
	}
	public void mc_budg_6302_i(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_BUDG_6302_IDataSet ds = null;
		MC_BUDG_6302_IDM dm = new MC_BUDG_6302_IDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.yymm = Util.checkString(req.getParameter("yymm"));
		dm.make_cost_mm = Util.checkString(req.getParameter("make_cost_mm"));
		dm.issu_pcnt = Util.checkString(req.getParameter("issu_pcnt"));
		dm.qty = Util.checkString(req.getParameter("qty"));
		dm.cho_rate = Util.checkString(req.getParameter("cho_rate"));
		dm.local_rate = Util.checkString(req.getParameter("local_rate"));
		dm.tms = Util.checkString(req.getParameter("tms"));
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.incmg_pers_ipadd = req.getRemoteAddr();

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_BUDG_6302_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_BUDG_6000EJBHome home = (MC_BUDG_6000EJBHome)JNDIManager.getInstance().getHome("MC_BUDG_6000EJB");
			MC_BUDG_6000EJB ejb = home.create();

			ds = ejb.mc_budg_6302_i(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
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
		dm.make_cost_mm = (String)hash.get("make_cost_mm");
		dm.issu_pcnt = (String)hash.get("issu_pcnt");
		dm.qty = (String)hash.get("qty");
		dm.cho_rate = (String)hash.get("cho_rate");
		dm.local_rate = (String)hash.get("local_rate");
		dm.tms = (String)hash.get("tms");
		dm.incmg_pers = (String)hash.get("incmg_pers");
		dm.incmg_pers_ipadd = (String)hash.get("incmg_pers_ipadd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.yymm = Util.getSessionParameterValue(req,"yymm",true);
		dm.make_cost_mm = Util.getSessionParameterValue(req,"make_cost_mm",true);
		dm.issu_pcnt = Util.getSessionParameterValue(req,"issu_pcnt",true);
		dm.qty = Util.getSessionParameterValue(req,"qty",true);
		dm.cho_rate = Util.getSessionParameterValue(req,"cho_rate",true);
		dm.local_rate = Util.getSessionParameterValue(req,"local_rate",true);
		dm.tms = Util.getSessionParameterValue(req,"tms",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"incmg_pers",true);
		dm.incmg_pers_ipadd = Util.getSessionParameterValue(req,"incmg_pers_ipadd",true);
		*******************************************************************************************/
	}
	public void mc_budg_6303_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_BUDG_6303_LDataSet ds = null;
		MC_BUDG_6303_LDM dm = new MC_BUDG_6303_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.yymm = Util.checkString(req.getParameter("yymm"));
		dm.tms = Util.checkString(req.getParameter("tms"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_BUDG_6303_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_BUDG_6000EJBHome home = (MC_BUDG_6000EJBHome)JNDIManager.getInstance().getHome("MC_BUDG_6000EJB");
			MC_BUDG_6000EJB ejb = home.create();

			ds = ejb.mc_budg_6303_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
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
	public void mc_budg_6304_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_BUDG_6304_LDataSet ds = null;
		MC_BUDG_6304_LDM dm = new MC_BUDG_6304_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.yymm = Util.checkString(req.getParameter("yymm"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_BUDG_6304_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_BUDG_6000EJBHome home = (MC_BUDG_6000EJBHome)JNDIManager.getInstance().getHome("MC_BUDG_6000EJB");
			MC_BUDG_6000EJB ejb = home.create();

			ds = ejb.mc_budg_6304_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
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
	public void mc_budg_6062_m(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_BUDG_6062_MDataSet ds = null;
		MC_BUDG_6062_MDM dm = new MC_BUDG_6062_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.yyyy = Util.checkString(req.getParameter("yyyy"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_BUDG_6062_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_BUDG_6000EJBHome home = (MC_BUDG_6000EJBHome)JNDIManager.getInstance().getHome("MC_BUDG_6000EJB");
			MC_BUDG_6000EJB ejb = home.create();

			ds = ejb.mc_budg_6062_m(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
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
	
	public void mc_budg_6082_m(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_BUDG_6082_MDataSet ds = null;
		MC_BUDG_6082_MDM dm = new MC_BUDG_6082_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_BUDG_6082_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_BUDG_6000EJBHome home = (MC_BUDG_6000EJBHome)JNDIManager.getInstance().getHome("MC_BUDG_6000EJB");
			MC_BUDG_6000EJB ejb = home.create();

			ds = ejb.mc_budg_6082_m(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
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

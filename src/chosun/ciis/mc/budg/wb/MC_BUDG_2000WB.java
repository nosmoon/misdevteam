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

public class MC_BUDG_2000WB extends chosun.ciis.co.base.wb.BaseWB {
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
			MC_BUDG_2000EJBHome home = (MC_BUDG_2000EJBHome)JNDIManager.getInstance().getHome("MC_BUDG_2000EJB");
			MC_BUDG_2000EJB ejb = home.create();
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
	public void mc_budg_2010_m(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_BUDG_2010_MDataSet ds = null;
		MC_BUDG_2010_MDM dm = new MC_BUDG_2010_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_BUDG_2010_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_BUDG_2000EJBHome home = (MC_BUDG_2000EJBHome)JNDIManager.getInstance().getHome("MC_BUDG_2000EJB");
			MC_BUDG_2000EJB ejb = home.create();

			ds = ejb.mc_budg_2010_m(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
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
	public void mc_budg_2011_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_BUDG_2011_LDataSet ds = null;
		MC_BUDG_2011_LDM dm = new MC_BUDG_2011_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.dtls_clsf_cd1 = Util.checkString(req.getParameter("dtls_clsf_cd1"));
		dm.dtls_clsf_cd2 = Util.checkString(req.getParameter("dtls_clsf_cd2"));
		dm.yymm = Util.checkString(req.getParameter("yyyy"));
		dm.medi_cd = Util.checkString(req.getParameter("medi_cd"));
		dm.job_clsf_cd = Util.checkString(req.getParameter("job_clsf_cd"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_BUDG_2011_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_BUDG_2000EJBHome home = (MC_BUDG_2000EJBHome)JNDIManager.getInstance().getHome("MC_BUDG_2000EJB");
			MC_BUDG_2000EJB ejb = home.create();

			ds = ejb.mc_budg_2011_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		EJB 수정전 끝 */

		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.dtls_clsf_cd1 = (String)hash.get("dtls_clsf_cd1");
		dm.dtls_clsf_cd2 = (String)hash.get("dtls_clsf_cd2");
		dm.yymm = (String)hash.get("yymm");
		dm.medi_cd = (String)hash.get("medi_cd");
		dm.job_clsf_cd = (String)hash.get("job_clsf_cd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.dtls_clsf_cd1 = Util.getSessionParameterValue(req,"dtls_clsf_cd1",true);
		dm.dtls_clsf_cd2 = Util.getSessionParameterValue(req,"dtls_clsf_cd2",true);
		dm.yymm = Util.getSessionParameterValue(req,"yymm",true);
		dm.medi_cd = Util.getSessionParameterValue(req,"medi_cd",true);
		dm.job_clsf_cd = Util.getSessionParameterValue(req,"job_clsf_cd",true);
		*******************************************************************************************/
	}
	public void mc_budg_2020_m(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_BUDG_2020_MDataSet ds = null;
		MC_BUDG_2020_MDM dm = new MC_BUDG_2020_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.kind = Util.checkString(req.getParameter("kind"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_BUDG_2020_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_BUDG_2000EJBHome home = (MC_BUDG_2000EJBHome)JNDIManager.getInstance().getHome("MC_BUDG_2000EJB");
			MC_BUDG_2000EJB ejb = home.create();

			ds = ejb.mc_budg_2020_m(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
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
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.kind = Util.getSessionParameterValue(req,"kind",true);
		*******************************************************************************************/
	}
	public void mc_budg_2021_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_BUDG_2021_LDataSet ds = null;
		MC_BUDG_2021_LDM dm = new MC_BUDG_2021_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.yyyy = Util.checkString(req.getParameter("yyyy"));
		dm.job_clsf_cd = Util.checkString(req.getParameter("job_clsf_cd"));
		dm.dtls_clsf_cd = Util.checkString(req.getParameter("dtls_clsf_cd"));
		dm.medi_cd = Util.checkString(req.getParameter("medi_cd"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_BUDG_2021_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_BUDG_2000EJBHome home = (MC_BUDG_2000EJBHome)JNDIManager.getInstance().getHome("MC_BUDG_2000EJB");
			MC_BUDG_2000EJB ejb = home.create();

			ds = ejb.mc_budg_2021_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
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
		dm.job_clsf_cd = (String)hash.get("job_clsf_cd");
		dm.dtls_clsf_cd = (String)hash.get("dtls_clsf_cd");
		dm.medi_cd = (String)hash.get("medi_cd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.yyyy = Util.getSessionParameterValue(req,"yyyy",true);
		dm.job_clsf_cd = Util.getSessionParameterValue(req,"job_clsf_cd",true);
		dm.dtls_clsf_cd = Util.getSessionParameterValue(req,"dtls_clsf_cd",true);
		dm.medi_cd = Util.getSessionParameterValue(req,"medi_cd",true);
		*******************************************************************************************/
	}
	public void mc_budg_2022_d(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_BUDG_2022_DDataSet ds = null;
		MC_BUDG_2022_DDM dm = new MC_BUDG_2022_DDM();
		
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.yymm = Util.checkString(req.getParameter("yymm"));
		dm.job_clsf_cd = Util.checkString(req.getParameter("job_clsf_cd"));
		dm.medi_cd = Util.checkString(req.getParameter("medi_cd"));
		dm.form_dept_cd = Util.checkString(req.getParameter("form_dept_cd"));
		
		dm.dtls_clsf_cd = (String)hash.get("dtls_clsf_cd");
		dm.dept_cd = (String)hash.get("dept_cd");
		

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_BUDG_2022_DDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_BUDG_2000EJBHome home = (MC_BUDG_2000EJBHome)JNDIManager.getInstance().getHome("MC_BUDG_2000EJB");
			MC_BUDG_2000EJB ejb = home.create();

			ds = ejb.mc_budg_2022_d(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
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
		dm.job_clsf_cd = (String)hash.get("job_clsf_cd");
		dm.dtls_clsf_cd = (String)hash.get("dtls_clsf_cd");
		dm.medi_cd = (String)hash.get("medi_cd");
		dm.dept_cd = (String)hash.get("dept_cd");
		dm.form_dept_cd = (String)hash.get("form_dept_cd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.yymm = Util.getSessionParameterValue(req,"yymm",true);
		dm.job_clsf_cd = Util.getSessionParameterValue(req,"job_clsf_cd",true);
		dm.dtls_clsf_cd = Util.getSessionParameterValue(req,"dtls_clsf_cd",true);
		dm.medi_cd = Util.getSessionParameterValue(req,"medi_cd",true);
		dm.dept_cd = Util.getSessionParameterValue(req,"dept_cd",true);
		dm.form_dept_cd = Util.getSessionParameterValue(req,"form_dept_cd",true);
		*******************************************************************************************/
	}
	public void mc_budg_2030_m(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_BUDG_2030_MDataSet ds = null;
		MC_BUDG_2030_MDM dm = new MC_BUDG_2030_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_BUDG_2030_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_BUDG_2000EJBHome home = (MC_BUDG_2000EJBHome)JNDIManager.getInstance().getHome("MC_BUDG_2000EJB");
			MC_BUDG_2000EJB ejb = home.create();

			ds = ejb.mc_budg_2030_m(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
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
	public void mc_budg_2031_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_BUDG_2031_LDataSet ds = null;
		MC_BUDG_2031_LDM dm = new MC_BUDG_2031_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.yyyy = Util.checkString(req.getParameter("yyyy"));
		dm.medi_cd = Util.checkString(req.getParameter("medi_cd"));
		dm.job_clsf_cd = Util.checkString(req.getParameter("job_clsf_cd"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_BUDG_2031_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_BUDG_2000EJBHome home = (MC_BUDG_2000EJBHome)JNDIManager.getInstance().getHome("MC_BUDG_2000EJB");
			MC_BUDG_2000EJB ejb = home.create();

			ds = ejb.mc_budg_2031_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
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
		dm.medi_cd = (String)hash.get("medi_cd");
		dm.job_clsf_cd = (String)hash.get("job_clsf_cd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.yyyy = Util.getSessionParameterValue(req,"yyyy",true);
		dm.medi_cd = Util.getSessionParameterValue(req,"medi_cd",true);
		dm.job_clsf_cd = Util.getSessionParameterValue(req,"job_clsf_cd",true);
		*******************************************************************************************/
	}
	public void mc_budg_2070_m(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_BUDG_2070_MDataSet ds = null;
		MC_BUDG_2070_MDM dm = new MC_BUDG_2070_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		
		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_BUDG_2070_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_BUDG_2000EJBHome home = (MC_BUDG_2000EJBHome)JNDIManager.getInstance().getHome("MC_BUDG_2000EJB");
			MC_BUDG_2000EJB ejb = home.create();

			ds = ejb.mc_budg_2070_m(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
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
	public void mc_budg_2071_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_BUDG_2071_LDataSet ds = null;
		MC_BUDG_2071_LDM dm = new MC_BUDG_2071_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.budg_yymm = Util.checkString(req.getParameter("budg_yymm"));
		dm.budg_cd = Util.checkString(req.getParameter("budg_cd"));
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.evnt_cd = Util.checkString(req.getParameter("evnt_cd"));
		dm.work_no = Util.checkString(req.getParameter("work_no"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_BUDG_2071_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작		
		try {
			MC_BUDG_2000EJBHome home = (MC_BUDG_2000EJBHome)JNDIManager.getInstance().getHome("MC_BUDG_2000EJB");
			MC_BUDG_2000EJB ejb = home.create();

			ds = ejb.mc_budg_2071_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
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
	public void mc_budg_2072_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_BUDG_2072_LDataSet ds = null;
		MC_BUDG_2072_LDM dm = new MC_BUDG_2072_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.budg_type_cd = Util.checkString(req.getParameter("budg_type_cd"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_BUDG_2072_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_BUDG_2000EJBHome home = (MC_BUDG_2000EJBHome)JNDIManager.getInstance().getHome("MC_BUDG_2000EJB");
			MC_BUDG_2000EJB ejb = home.create();

			ds = ejb.mc_budg_2072_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
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
	public void mc_budg_2073_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_BUDG_2073_LDataSet ds = null;
		MC_BUDG_2073_LDM dm = new MC_BUDG_2073_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.evnt_cd = Util.checkString(req.getParameter("evnt_cd"));
		dm.evnt_nm = Util.checkString(req.getParameter("evnt_nm"));
		dm.cd_gubun = Util.checkString(req.getParameter("cd_gubun"));
		dm.from_cd = Util.checkString(req.getParameter("from_cd"));
		dm.to_cd = Util.checkString(req.getParameter("to_cd"));
		dm.bgn_dt = Util.checkString(req.getParameter("bgn_dt"));
		dm.last_dt = Util.checkString(req.getParameter("last_dt"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_BUDG_2073_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_BUDG_2000EJBHome home = (MC_BUDG_2000EJBHome)JNDIManager.getInstance().getHome("MC_BUDG_2000EJB");
			MC_BUDG_2000EJB ejb = home.create();

			ds = ejb.mc_budg_2073_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
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
	public void mc_budg_2080_m(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_BUDG_2080_MDataSet ds = null;
		MC_BUDG_2080_MDM dm = new MC_BUDG_2080_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.budg_cd = Util.checkString(req.getParameter("budg_type_cd"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_BUDG_2080_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_BUDG_2000EJBHome home = (MC_BUDG_2000EJBHome)JNDIManager.getInstance().getHome("MC_BUDG_2000EJB");
			MC_BUDG_2000EJB ejb = home.create();

			ds = ejb.mc_budg_2080_m(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
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
	public void mc_budg_2081_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_BUDG_2081_LDataSet ds = null;
		MC_BUDG_2081_LDM dm = new MC_BUDG_2081_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.budg_cd = Util.checkString(req.getParameter("budg_cd"));
		dm.budg_yymm = Util.checkString(req.getParameter("budg_yymm"));
		dm.work_no = Util.checkString(req.getParameter("work_no"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_BUDG_2081_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_BUDG_2000EJBHome home = (MC_BUDG_2000EJBHome)JNDIManager.getInstance().getHome("MC_BUDG_2000EJB");
			MC_BUDG_2000EJB ejb = home.create();

			ds = ejb.mc_budg_2081_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
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
		dm.budg_yymm = (String)hash.get("budg_yymm");
		dm.work_no = (String)hash.get("work_no");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.dept_cd = Util.getSessionParameterValue(req,"dept_cd",true);
		dm.budg_cd = Util.getSessionParameterValue(req,"budg_cd",true);
		dm.budg_yymm = Util.getSessionParameterValue(req,"budg_yymm",true);
		dm.work_no = Util.getSessionParameterValue(req,"work_no",true);
		*******************************************************************************************/
	}
	public void mc_budg_2082_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_BUDG_2082_LDataSet ds = null;
		MC_BUDG_2082_LDM dm = new MC_BUDG_2082_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.budg_type_cd = Util.checkString(req.getParameter("budg_type_cd"));
		dm.budg_yymm = Util.checkString(req.getParameter("budg_yymm"));
		dm.budg_cd = Util.checkString(req.getParameter("budg_cd"));
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.work_no = Util.checkString(req.getParameter("work_no"));
		dm.seq = Util.checkString(req.getParameter("seq"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_BUDG_2082_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_BUDG_2000EJBHome home = (MC_BUDG_2000EJBHome)JNDIManager.getInstance().getHome("MC_BUDG_2000EJB");
			MC_BUDG_2000EJB ejb = home.create();

			ds = ejb.mc_budg_2082_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		EJB 수정전 끝 */

		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.budg_type_cd = (String)hash.get("budg_type_cd");
		dm.budg_yymm = (String)hash.get("budg_yymm");
		dm.budg_cd = (String)hash.get("budg_cd");
		dm.dept_cd = (String)hash.get("dept_cd");
		dm.work_no = (String)hash.get("work_no");
		dm.seq = (String)hash.get("seq");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.budg_type_cd = Util.getSessionParameterValue(req,"budg_type_cd",true);
		dm.budg_yymm = Util.getSessionParameterValue(req,"budg_yymm",true);
		dm.budg_cd = Util.getSessionParameterValue(req,"budg_cd",true);
		dm.dept_cd = Util.getSessionParameterValue(req,"dept_cd",true);
		dm.work_no = Util.getSessionParameterValue(req,"work_no",true);
		dm.seq = Util.getSessionParameterValue(req,"seq",true);
		*******************************************************************************************/
	}
	public void mc_budg_2083_i(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_BUDG_2083_IDataSet ds = null;
		MC_BUDG_2083_IDM dm = new MC_BUDG_2083_IDM();
		
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.tag = Util.checkString(req.getParameter("tag"));
		dm.budg_yy = Util.checkString(req.getParameter("budg_yy"));
		dm.budg_cd = Util.checkString(req.getParameter("budg_cd"));
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.evnt_cd = Util.checkString(req.getParameter("evnt_cd"));
		dm.work_no = Util.checkString(req.getParameter("work_no"));
		dm.seq = Util.checkString(req.getParameter("seq"));
		dm.medi_cd = Util.checkString(req.getParameter("medi_cd"));
		dm.use_dept_cd = Util.checkString(req.getParameter("use_dept_cd"));
		dm.rmks = Util.checkString(req.getParameter("rmks"));
		dm.chg_pers = Util.checkString(req.getParameter("chg_pers"));
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		
		dm.jobtag = (String)hash.get("jobtag");
		dm.budg_yymm = (String)hash.get("budg_yymm");
		dm.sqrt = (String)hash.get("req_qunt");
		dm.price = (String)hash.get("req_uprc");
		dm.tot_amt = (String)hash.get("req_amt");

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_BUDG_2083_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_BUDG_2000EJBHome home = (MC_BUDG_2000EJBHome)JNDIManager.getInstance().getHome("MC_BUDG_2000EJB");
			MC_BUDG_2000EJB ejb = home.create();

			ds = ejb.mc_budg_2083_i(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		EJB 수정전 끝 */

		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.tag = (String)hash.get("tag");
		dm.jobtag = (String)hash.get("jobtag");
		dm.budg_yy = (String)hash.get("budg_yy");
		dm.budg_cd = (String)hash.get("budg_cd");
		dm.dept_cd = (String)hash.get("dept_cd");
		dm.evnt_cd = (String)hash.get("evnt_cd");
		dm.work_no = (String)hash.get("work_no");
		dm.seq = (String)hash.get("seq");
		dm.medi_cd = (String)hash.get("medi_cd");
		dm.use_dept_cd = (String)hash.get("use_dept_cd");
		dm.sqrt = (String)hash.get("sqrt");
		dm.price = (String)hash.get("price");
		dm.tot_amt = (String)hash.get("tot_amt");
		dm.rmks = (String)hash.get("rmks");
		dm.incmg_pers = (String)hash.get("incmg_pers");
		dm.chg_pers = (String)hash.get("chg_pers");
		dm.incmg_pers_ipadd = (String)hash.get("incmg_pers_ipadd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.tag = Util.getSessionParameterValue(req,"tag",true);
		dm.jobtag = Util.getSessionParameterValue(req,"jobtag",true);
		dm.budg_yy = Util.getSessionParameterValue(req,"budg_yy",true);
		dm.budg_cd = Util.getSessionParameterValue(req,"budg_cd",true);
		dm.dept_cd = Util.getSessionParameterValue(req,"dept_cd",true);
		dm.evnt_cd = Util.getSessionParameterValue(req,"evnt_cd",true);
		dm.work_no = Util.getSessionParameterValue(req,"work_no",true);
		dm.seq = Util.getSessionParameterValue(req,"seq",true);
		dm.medi_cd = Util.getSessionParameterValue(req,"medi_cd",true);
		dm.use_dept_cd = Util.getSessionParameterValue(req,"use_dept_cd",true);
		dm.sqrt = Util.getSessionParameterValue(req,"sqrt",true);
		dm.price = Util.getSessionParameterValue(req,"price",true);
		dm.tot_amt = Util.getSessionParameterValue(req,"tot_amt",true);
		dm.rmks = Util.getSessionParameterValue(req,"rmks",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"incmg_pers",true);
		dm.chg_pers = Util.getSessionParameterValue(req,"chg_pers",true);
		dm.incmg_pers_ipadd = Util.getSessionParameterValue(req,"incmg_pers_ipadd",true);
		*******************************************************************************************/
	}
	public void mc_budg_2084_d(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_BUDG_2084_DDataSet ds = null;
		MC_BUDG_2084_DDM dm = new MC_BUDG_2084_DDM();
		
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.del_cnt = Util.checkString(req.getParameter("del_cnt"));
		dm.tag = Util.checkString(req.getParameter("tag"));
		dm.budg_yy = Util.checkString(req.getParameter("budg_yy"));
		dm.budg_cd = Util.checkString(req.getParameter("budg_cd"));
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.evnt_cd = Util.checkString(req.getParameter("evnt_cd"));
		dm.work_no = Util.checkString(req.getParameter("work_no"));
		dm.chg_pers = Util.checkString(req.getParameter("chg_pers"));
		
		dm.seq = (String)hash.get("seq");

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_BUDG_2084_DDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_BUDG_2000EJBHome home = (MC_BUDG_2000EJBHome)JNDIManager.getInstance().getHome("MC_BUDG_2000EJB");
			MC_BUDG_2000EJB ejb = home.create();

			ds = ejb.mc_budg_2084_d(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		EJB 수정전 끝 */

		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.del_cnt = (String)hash.get("del_cnt");
		dm.tag = (String)hash.get("tag");
		dm.budg_yy = (String)hash.get("budg_yy");
		dm.budg_cd = (String)hash.get("budg_cd");
		dm.dept_cd = (String)hash.get("dept_cd");
		dm.evnt_cd = (String)hash.get("evnt_cd");
		dm.work_no = (String)hash.get("work_no");
		dm.seq = (String)hash.get("seq");
		dm.chg_pers = (String)hash.get("chg_pers");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.del_cnt = Util.getSessionParameterValue(req,"del_cnt",true);
		dm.tag = Util.getSessionParameterValue(req,"tag",true);
		dm.budg_yy = Util.getSessionParameterValue(req,"budg_yy",true);
		dm.budg_cd = Util.getSessionParameterValue(req,"budg_cd",true);
		dm.dept_cd = Util.getSessionParameterValue(req,"dept_cd",true);
		dm.evnt_cd = Util.getSessionParameterValue(req,"evnt_cd",true);
		dm.work_no = Util.getSessionParameterValue(req,"work_no",true);
		dm.seq = Util.getSessionParameterValue(req,"seq",true);
		dm.chg_pers = Util.getSessionParameterValue(req,"chg_pers",true);
		*******************************************************************************************/
	}
	
	public void mc_budg_2085_m(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_BUDG_2085_MDataSet ds = null;
		MC_BUDG_2085_MDM dm = new MC_BUDG_2085_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_BUDG_2085_MDataSet)manager.executeCall(dm);

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
	
	public void mc_budg_2090_m(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_BUDG_2090_MDataSet ds = null;
		MC_BUDG_2090_MDM dm = new MC_BUDG_2090_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_BUDG_2090_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_BUDG_2000EJBHome home = (MC_BUDG_2000EJBHome)JNDIManager.getInstance().getHome("MC_BUDG_2000EJB");
			MC_BUDG_2000EJB ejb = home.create();

			ds = ejb.mc_budg_2090_m(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
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
	public void mc_budg_2091_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_BUDG_2091_LDataSet ds = null;
		MC_BUDG_2091_LDM dm = new MC_BUDG_2091_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.yymm = Util.checkString(req.getParameter("yymm"));
		dm.budg_cd = Util.checkString(req.getParameter("budg_cd"));
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.work_no = Util.checkString(req.getParameter("work_no"));
		dm.seq = Util.checkString(req.getParameter("seq"));
		dm.use_dept_cd = Util.checkString(req.getParameter("use_dept_cd"));
		dm.job_clsf_cd = Util.checkString(req.getParameter("job_clsf_cd"));
		dm.dtls_clsf_cd = Util.checkString(req.getParameter("dtls_clsf_cd"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_BUDG_2091_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_BUDG_2000EJBHome home = (MC_BUDG_2000EJBHome)JNDIManager.getInstance().getHome("MC_BUDG_2000EJB");
			MC_BUDG_2000EJB ejb = home.create();

			ds = ejb.mc_budg_2091_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
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
		dm.dept_cd = (String)hash.get("dept_cd");
		dm.work_no = (String)hash.get("work_no");
		dm.seq = (String)hash.get("seq");
		dm.use_dept_cd = (String)hash.get("use_dept_cd");
		dm.job_clsf_cd = (String)hash.get("job_clsf_cd");
		dm.dtls_clsf_cd = (String)hash.get("dtls_clsf_cd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.yymm = Util.getSessionParameterValue(req,"yymm",true);
		dm.budg_cd = Util.getSessionParameterValue(req,"budg_cd",true);
		dm.dept_cd = Util.getSessionParameterValue(req,"dept_cd",true);
		dm.work_no = Util.getSessionParameterValue(req,"work_no",true);
		dm.seq = Util.getSessionParameterValue(req,"seq",true);
		dm.use_dept_cd = Util.getSessionParameterValue(req,"use_dept_cd",true);
		dm.job_clsf_cd = Util.getSessionParameterValue(req,"job_clsf_cd",true);
		dm.dtls_clsf_cd = Util.getSessionParameterValue(req,"dtls_clsf_cd",true);
		*******************************************************************************************/
	}
	public void mc_budg_2092_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_BUDG_2092_LDataSet ds = null;
		MC_BUDG_2092_LDM dm = new MC_BUDG_2092_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.yymm = Util.checkString(req.getParameter("yymm"));
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.budg_cd = Util.checkString(req.getParameter("budg_cd"));
		dm.work_no = Util.checkString(req.getParameter("work_no"));
		dm.seq = Util.checkString(req.getParameter("seq"));
		dm.medi_cd = Util.checkString(req.getParameter("medi_cd"));
		dm.use_dept_cd = Util.checkString(req.getParameter("use_dept_cd"));
		dm.crte_clsf = Util.checkString(req.getParameter("crte_clsf"));
		dm.job_clsf_cd = Util.checkString(req.getParameter("job_clsf_cd"));
		dm.dtls_clsf_cd = Util.checkString(req.getParameter("dtls_clsf_cd"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_BUDG_2092_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_BUDG_2000EJBHome home = (MC_BUDG_2000EJBHome)JNDIManager.getInstance().getHome("MC_BUDG_2000EJB");
			MC_BUDG_2000EJB ejb = home.create();

			ds = ejb.mc_budg_2092_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
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
		dm.work_no = (String)hash.get("work_no");
		dm.seq = (String)hash.get("seq");
		dm.medi_cd = (String)hash.get("medi_cd");
		dm.use_dept_cd = (String)hash.get("use_dept_cd");
		dm.crte_clsf = (String)hash.get("crte_clsf");
		dm.job_clsf_cd = (String)hash.get("job_clsf_cd");
		dm.dtls_clsf_cd = (String)hash.get("dtls_clsf_cd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.yymm = Util.getSessionParameterValue(req,"yymm",true);
		dm.dept_cd = Util.getSessionParameterValue(req,"dept_cd",true);
		dm.budg_cd = Util.getSessionParameterValue(req,"budg_cd",true);
		dm.work_no = Util.getSessionParameterValue(req,"work_no",true);
		dm.seq = Util.getSessionParameterValue(req,"seq",true);
		dm.medi_cd = Util.getSessionParameterValue(req,"medi_cd",true);
		dm.use_dept_cd = Util.getSessionParameterValue(req,"use_dept_cd",true);
		dm.crte_clsf = Util.getSessionParameterValue(req,"crte_clsf",true);
		dm.job_clsf_cd = Util.getSessionParameterValue(req,"job_clsf_cd",true);
		dm.dtls_clsf_cd = Util.getSessionParameterValue(req,"dtls_clsf_cd",true);
		*******************************************************************************************/
	}
	public void mc_budg_2093_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_BUDG_2093_LDataSet ds = null;
		MC_BUDG_2093_LDM dm = new MC_BUDG_2093_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.yymm = Util.checkString(req.getParameter("yymm"));
		dm.budg_cd = Util.checkString(req.getParameter("budg_cd"));
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.work_no = Util.checkString(req.getParameter("work_no"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_BUDG_2093_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/* EJB 수정전 시작
		try {
			MC_BUDG_2000EJBHome home = (MC_BUDG_2000EJBHome)JNDIManager.getInstance().getHome("MC_BUDG_2000EJB");
			MC_BUDG_2000EJB ejb = home.create();

			ds = ejb.mc_budg_2093_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
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
		dm.dept_cd = (String)hash.get("dept_cd");
		dm.work_no = (String)hash.get("work_no");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.yymm = Util.getSessionParameterValue(req,"yymm",true);
		dm.budg_cd = Util.getSessionParameterValue(req,"budg_cd",true);
		dm.dept_cd = Util.getSessionParameterValue(req,"dept_cd",true);
		dm.work_no = Util.getSessionParameterValue(req,"work_no",true);
		*******************************************************************************************/
	}
	public void mc_budg_2094_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_BUDG_2094_LDataSet ds = null;
		MC_BUDG_2094_LDM dm = new MC_BUDG_2094_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.yymm = Util.checkString(req.getParameter("yymm"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_BUDG_2094_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_BUDG_2000EJBHome home = (MC_BUDG_2000EJBHome)JNDIManager.getInstance().getHome("MC_BUDG_2000EJB");
			MC_BUDG_2000EJB ejb = home.create();

			ds = ejb.mc_budg_2094_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
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
	public void mc_budg_2095_i(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_BUDG_2095_IDataSet ds = null;
		MC_BUDG_2095_IDM dm = new MC_BUDG_2095_IDM();
		
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.budg_yy = Util.checkString(req.getParameter("budg_yy"));
		dm.budg_cd = Util.checkString(req.getParameter("budg_cd"));
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.evnt_cd = Util.checkString(req.getParameter("evnt_cd"));
		dm.work_no = Util.checkString(req.getParameter("work_no"));
		dm.new_medi_cd = Util.checkString(req.getParameter("new_medi_cd"));
		dm.old_medi_cd = Util.checkString(req.getParameter("old_medi_cd"));
		dm.crte_clsf = Util.checkString(req.getParameter("crte_clsf"));
		dm.job_clsf = Util.checkString(req.getParameter("job_clsf"));
		dm.dtls_clsf = Util.checkString(req.getParameter("dtls_clsf"));
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		
		dm.budg_yymm = (String)hash.get("budg_yymm");
		dm.seq = (String)hash.get("seq");
		dm.use_dept_cd = (String)hash.get("use_dept_cd");
		dm.req_qunt = (String)hash.get("req_qunt");
		dm.req_uprc = (String)hash.get("req_uprc");
		dm.req_amt = (String)hash.get("req_amt");
		dm.rmks = (String)hash.get("rmks");
		dm.ini_plan_qunt = (String)hash.get("ini_plan_qunt");
		
		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_BUDG_2095_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_BUDG_2000EJBHome home = (MC_BUDG_2000EJBHome)JNDIManager.getInstance().getHome("MC_BUDG_2000EJB");
			MC_BUDG_2000EJB ejb = home.create();

			ds = ejb.mc_budg_2095_i(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
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
		dm.new_medi_cd = (String)hash.get("new_medi_cd");
		dm.old_medi_cd = (String)hash.get("old_medi_cd");
		dm.use_dept_cd = (String)hash.get("use_dept_cd");
		dm.req_qunt = (String)hash.get("req_qunt");
		dm.req_uprc = (String)hash.get("req_uprc");
		dm.req_amt = (String)hash.get("req_amt");
		dm.rmks = (String)hash.get("rmks");
		dm.crte_clsf = (String)hash.get("crte_clsf");
		dm.incmg_pers = (String)hash.get("incmg_pers");
		dm.job_clsf = (String)hash.get("job_clsf");
		dm.dtls_clsf = (String)hash.get("dtls_clsf");
		dm.ini_plan_qunt = (String)hash.get("ini_plan_qunt");
		dm.incmg_pers_ipadd = (String)hash.get("incmg_pers_ipadd");
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
		dm.new_medi_cd = Util.getSessionParameterValue(req,"new_medi_cd",true);
		dm.old_medi_cd = Util.getSessionParameterValue(req,"old_medi_cd",true);
		dm.use_dept_cd = Util.getSessionParameterValue(req,"use_dept_cd",true);
		dm.req_qunt = Util.getSessionParameterValue(req,"req_qunt",true);
		dm.req_uprc = Util.getSessionParameterValue(req,"req_uprc",true);
		dm.req_amt = Util.getSessionParameterValue(req,"req_amt",true);
		dm.rmks = Util.getSessionParameterValue(req,"rmks",true);
		dm.crte_clsf = Util.getSessionParameterValue(req,"crte_clsf",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"incmg_pers",true);
		dm.job_clsf = Util.getSessionParameterValue(req,"job_clsf",true);
		dm.dtls_clsf = Util.getSessionParameterValue(req,"dtls_clsf",true);
		dm.ini_plan_qunt = Util.getSessionParameterValue(req,"ini_plan_qunt",true);
		dm.incmg_pers_ipadd = Util.getSessionParameterValue(req,"incmg_pers_ipadd",true);
		*******************************************************************************************/
	}
	public void mc_budg_2096_u(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_BUDG_2096_UDataSet ds = null;
		MC_BUDG_2096_UDM dm = new MC_BUDG_2096_UDM();
		
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.budg_yy = Util.checkString(req.getParameter("budg_yy"));
		dm.budg_cd = Util.checkString(req.getParameter("budg_cd"));
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.evnt_cd = Util.checkString(req.getParameter("evnt_cd"));
		dm.work_no = Util.checkString(req.getParameter("work_no"));
		dm.new_medi_cd = Util.checkString(req.getParameter("new_medi_cd"));
		dm.old_medi_cd = Util.checkString(req.getParameter("old_medi_cd"));
		dm.crte_clsf = Util.checkString(req.getParameter("crte_clsf"));
		dm.job_clsf = Util.checkString(req.getParameter("job_clsf"));
		dm.dtls_clsf = Util.checkString(req.getParameter("dtls_clsf"));
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		
		dm.budg_yymm = (String)hash.get("budg_yymm");
		dm.seq = (String)hash.get("seq");
		dm.use_dept_cd = (String)hash.get("use_dept_cd");
		dm.req_qunt = (String)hash.get("req_qunt");
		dm.req_uprc = (String)hash.get("req_uprc");
		dm.req_amt = (String)hash.get("req_amt");
		dm.rmks = (String)hash.get("rmks");
		dm.ini_plan_qunt = (String)hash.get("ini_plan_qunt");

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_BUDG_2096_UDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_BUDG_2000EJBHome home = (MC_BUDG_2000EJBHome)JNDIManager.getInstance().getHome("MC_BUDG_2000EJB");
			MC_BUDG_2000EJB ejb = home.create();

			ds = ejb.mc_budg_2096_u(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
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
		dm.new_medi_cd = (String)hash.get("new_medi_cd");
		dm.old_medi_cd = (String)hash.get("old_medi_cd");
		dm.use_dept_cd = (String)hash.get("use_dept_cd");
		dm.req_qunt = (String)hash.get("req_qunt");
		dm.req_uprc = (String)hash.get("req_uprc");
		dm.req_amt = (String)hash.get("req_amt");
		dm.rmks = (String)hash.get("rmks");
		dm.crte_clsf = (String)hash.get("crte_clsf");
		dm.incmg_pers = (String)hash.get("incmg_pers");
		dm.job_clsf = (String)hash.get("job_clsf");
		dm.dtls_clsf = (String)hash.get("dtls_clsf");
		dm.ini_plan_qunt = (String)hash.get("ini_plan_qunt");
		dm.incmg_pers_ipadd = (String)hash.get("incmg_pers_ipadd");
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
		dm.new_medi_cd = Util.getSessionParameterValue(req,"new_medi_cd",true);
		dm.old_medi_cd = Util.getSessionParameterValue(req,"old_medi_cd",true);
		dm.use_dept_cd = Util.getSessionParameterValue(req,"use_dept_cd",true);
		dm.req_qunt = Util.getSessionParameterValue(req,"req_qunt",true);
		dm.req_uprc = Util.getSessionParameterValue(req,"req_uprc",true);
		dm.req_amt = Util.getSessionParameterValue(req,"req_amt",true);
		dm.rmks = Util.getSessionParameterValue(req,"rmks",true);
		dm.crte_clsf = Util.getSessionParameterValue(req,"crte_clsf",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"incmg_pers",true);
		dm.job_clsf = Util.getSessionParameterValue(req,"job_clsf",true);
		dm.dtls_clsf = Util.getSessionParameterValue(req,"dtls_clsf",true);
		dm.ini_plan_qunt = Util.getSessionParameterValue(req,"ini_plan_qunt",true);
		dm.incmg_pers_ipadd = Util.getSessionParameterValue(req,"incmg_pers_ipadd",true);
		*******************************************************************************************/
	}
	public void mc_budg_2097_d(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_BUDG_2097_DDataSet ds = null;
		MC_BUDG_2097_DDM dm = new MC_BUDG_2097_DDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.budg_yy = Util.checkString(req.getParameter("budg_yy"));
		dm.budg_cd = Util.checkString(req.getParameter("budg_cd"));
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.use_dept_cd = Util.checkString(req.getParameter("use_dept_cd"));
		dm.medi_cd = Util.checkString(req.getParameter("medi_cd"));
		dm.evnt_cd = Util.checkString(req.getParameter("evnt_cd"));
		dm.work_no = Util.checkString(req.getParameter("work_no"));
		dm.crte_clsf = Util.checkString(req.getParameter("crte_clsf"));
		dm.job_clsf = Util.checkString(req.getParameter("job_clsf"));
		dm.dtls_clsf = Util.checkString(req.getParameter("dtls_clsf"));
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.incmg_pers_ipadd = req.getRemoteAddr();

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_BUDG_2097_DDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_BUDG_2000EJBHome home = (MC_BUDG_2000EJBHome)JNDIManager.getInstance().getHome("MC_BUDG_2000EJB");
			MC_BUDG_2000EJB ejb = home.create();

			ds = ejb.mc_budg_2097_d(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
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
		dm.budg_cd = (String)hash.get("budg_cd");
		dm.dept_cd = (String)hash.get("dept_cd");
		dm.use_dept_cd = (String)hash.get("use_dept_cd");
		dm.medi_cd = (String)hash.get("medi_cd");
		dm.evnt_cd = (String)hash.get("evnt_cd");
		dm.work_no = (String)hash.get("work_no");
		dm.crte_clsf = (String)hash.get("crte_clsf");
		dm.incmg_pers = (String)hash.get("incmg_pers");
		dm.job_clsf = (String)hash.get("job_clsf");
		dm.dtls_clsf = (String)hash.get("dtls_clsf");
		dm.incmg_pers_ipadd = (String)hash.get("incmg_pers_ipadd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.budg_yy = Util.getSessionParameterValue(req,"budg_yy",true);
		dm.budg_cd = Util.getSessionParameterValue(req,"budg_cd",true);
		dm.dept_cd = Util.getSessionParameterValue(req,"dept_cd",true);
		dm.use_dept_cd = Util.getSessionParameterValue(req,"use_dept_cd",true);
		dm.medi_cd = Util.getSessionParameterValue(req,"medi_cd",true);
		dm.evnt_cd = Util.getSessionParameterValue(req,"evnt_cd",true);
		dm.work_no = Util.getSessionParameterValue(req,"work_no",true);
		dm.crte_clsf = Util.getSessionParameterValue(req,"crte_clsf",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"incmg_pers",true);
		dm.job_clsf = Util.getSessionParameterValue(req,"job_clsf",true);
		dm.dtls_clsf = Util.getSessionParameterValue(req,"dtls_clsf",true);
		dm.incmg_pers_ipadd = Util.getSessionParameterValue(req,"incmg_pers_ipadd",true);
		*******************************************************************************************/
	}
	public void mc_budg_2100_m(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_BUDG_2100_MDataSet ds = null;
		MC_BUDG_2100_MDM dm = new MC_BUDG_2100_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.budg_cd = Util.checkString(req.getParameter("budg_cd1"));
		dm.budg_cd1 = Util.checkString(req.getParameter("budg_cd2"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_BUDG_2100_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/* EJB 수정전 시작
		try {
			MC_BUDG_2000EJBHome home = (MC_BUDG_2000EJBHome)JNDIManager.getInstance().getHome("MC_BUDG_2000EJB");
			MC_BUDG_2000EJB ejb = home.create();

			ds = ejb.mc_budg_2100_m(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
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
		dm.budg_cd1 = (String)hash.get("budg_cd1");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.dept_cd = Util.getSessionParameterValue(req,"dept_cd",true);
		dm.budg_cd = Util.getSessionParameterValue(req,"budg_cd",true);
		dm.budg_cd1 = Util.getSessionParameterValue(req,"budg_cd1",true);
		*******************************************************************************************/
	}
	public void mc_budg_2101_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_BUDG_2101_LDataSet ds = null;
		MC_BUDG_2101_LDM dm = new MC_BUDG_2101_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.budg_type_cd = Util.checkString(req.getParameter("budg_type_cd"));
		dm.budg_yymm = Util.checkString(req.getParameter("budg_yymm"));
		dm.budg_cd = Util.checkString(req.getParameter("budg_cd"));
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.work_no = Util.checkString(req.getParameter("work_no"));
		dm.seq = Util.checkString(req.getParameter("seq"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_BUDG_2101_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_BUDG_2000EJBHome home = (MC_BUDG_2000EJBHome)JNDIManager.getInstance().getHome("MC_BUDG_2000EJB");
			MC_BUDG_2000EJB ejb = home.create();

			ds = ejb.mc_budg_2101_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		EJB 수정전 끝 */		

		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.budg_type_cd = (String)hash.get("budg_type_cd");
		dm.budg_yymm = (String)hash.get("budg_yymm");
		dm.budg_cd = (String)hash.get("budg_cd");
		dm.dept_cd = (String)hash.get("dept_cd");
		dm.work_no = (String)hash.get("work_no");
		dm.seq = (String)hash.get("seq");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.budg_type_cd = Util.getSessionParameterValue(req,"budg_type_cd",true);
		dm.budg_yymm = Util.getSessionParameterValue(req,"budg_yymm",true);
		dm.budg_cd = Util.getSessionParameterValue(req,"budg_cd",true);
		dm.dept_cd = Util.getSessionParameterValue(req,"dept_cd",true);
		dm.work_no = Util.getSessionParameterValue(req,"work_no",true);
		dm.seq = Util.getSessionParameterValue(req,"seq",true);
		*******************************************************************************************/
	}
	public void mc_budg_2102_i(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_BUDG_2102_IDataSet ds = null;
		MC_BUDG_2102_IDM dm = new MC_BUDG_2102_IDM();

		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData1"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);		

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.tag = Util.checkString(req.getParameter("tag"));
		dm.mode = (String)hash.get("m");
		dm.jobtag = (String)hash.get("jobtag");
		dm.budg_yy = Util.checkString(req.getParameter("budg_yy"));
		dm.budg_yymm = (String)hash.get("budg_yymm");
		dm.budg_cd = Util.checkString(req.getParameter("budg_cd"));
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.evnt_cd = Util.checkString(req.getParameter("evnt_cd"));
		dm.work_no = Util.checkString(req.getParameter("work_no"));
		dm.seq = (String)hash.get("seq");
		dm.medi_cd = Util.checkString(req.getParameter("medi_cd"));
		dm.use_dept_cd = (String)hash.get("use_dept_cd");
		dm.req_qunt = (String)hash.get("req_qunt");
		dm.req_uprc = (String)hash.get("req_uprc");
		dm.req_amt = (String)hash.get("req_amt");
		dm.rmks = (String)hash.get("rmks");
		dm.crte_clsf = Util.checkString(req.getParameter("crte_clsf"));
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.incmg_pers_ipadd = req.getRemoteAddr();

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_BUDG_2102_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_BUDG_2000EJBHome home = (MC_BUDG_2000EJBHome)JNDIManager.getInstance().getHome("MC_BUDG_2000EJB");
			MC_BUDG_2000EJB ejb = home.create();

			ds = ejb.mc_budg_2102_i(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		EJB 수정전 끝 */

		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.tag = (String)hash.get("tag");
		dm.mode = (String)hash.get("mode");
		dm.jobtag = (String)hash.get("jobtag");
		dm.budg_yy = (String)hash.get("budg_yy");
		dm.budg_yymm = (String)hash.get("budg_yymm");
		dm.budg_cd = (String)hash.get("budg_cd");
		dm.dept_cd = (String)hash.get("dept_cd");
		dm.evnt_cd = (String)hash.get("evnt_cd");
		dm.work_no = (String)hash.get("work_no");
		dm.seq = (String)hash.get("seq");
		dm.medi_cd = (String)hash.get("medi_cd");
		dm.use_dept_cd = (String)hash.get("use_dept_cd");
		dm.req_qunt = (String)hash.get("req_qunt");
		dm.req_uprc = (String)hash.get("req_uprc");
		dm.req_amt = (String)hash.get("req_amt");
		dm.rmks = (String)hash.get("rmks");
		dm.crte_clsf = (String)hash.get("crte_clsf");
		dm.incmg_pers = (String)hash.get("incmg_pers");
		dm.incmg_pers_ipadd = (String)hash.get("incmg_pers_ipadd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.tag = Util.getSessionParameterValue(req,"tag",true);
		dm.mode = Util.getSessionParameterValue(req,"mode",true);
		dm.jobtag = Util.getSessionParameterValue(req,"jobtag",true);
		dm.budg_yy = Util.getSessionParameterValue(req,"budg_yy",true);
		dm.budg_yymm = Util.getSessionParameterValue(req,"budg_yymm",true);
		dm.budg_cd = Util.getSessionParameterValue(req,"budg_cd",true);
		dm.dept_cd = Util.getSessionParameterValue(req,"dept_cd",true);
		dm.evnt_cd = Util.getSessionParameterValue(req,"evnt_cd",true);
		dm.work_no = Util.getSessionParameterValue(req,"work_no",true);
		dm.seq = Util.getSessionParameterValue(req,"seq",true);
		dm.medi_cd = Util.getSessionParameterValue(req,"medi_cd",true);
		dm.use_dept_cd = Util.getSessionParameterValue(req,"use_dept_cd",true);
		dm.req_qunt = Util.getSessionParameterValue(req,"req_qunt",true);
		dm.req_uprc = Util.getSessionParameterValue(req,"req_uprc",true);
		dm.req_amt = Util.getSessionParameterValue(req,"req_amt",true);
		dm.rmks = Util.getSessionParameterValue(req,"rmks",true);
		dm.crte_clsf = Util.getSessionParameterValue(req,"crte_clsf",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"incmg_pers",true);
		dm.incmg_pers_ipadd = Util.getSessionParameterValue(req,"incmg_pers_ipadd",true);
		*******************************************************************************************/
	}
	public void mc_budg_2103_m(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_BUDG_2103_MDataSet ds = null;
		MC_BUDG_2103_MDM dm = new MC_BUDG_2103_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_BUDG_2103_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_BUDG_2000EJBHome home = (MC_BUDG_2000EJBHome)JNDIManager.getInstance().getHome("MC_BUDG_2000EJB");
			MC_BUDG_2000EJB ejb = home.create();

			ds = ejb.mc_budg_2103_m(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
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
	public void mc_budg_2104_m(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_BUDG_2104_MDataSet ds = null;
		MC_BUDG_2104_MDM dm = new MC_BUDG_2104_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_BUDG_2104_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_BUDG_2000EJBHome home = (MC_BUDG_2000EJBHome)JNDIManager.getInstance().getHome("MC_BUDG_2000EJB");
			MC_BUDG_2000EJB ejb = home.create();

			ds = ejb.mc_budg_2104_m(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
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
	public void mc_budg_2105_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_BUDG_2105_LDataSet ds = null;
		MC_BUDG_2105_LDM dm = new MC_BUDG_2105_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.budg_yymm = Util.checkString(req.getParameter("budg_yymm"));
		dm.budg_cd = Util.checkString(req.getParameter("budg_cd"));
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.work_no = Util.checkString(req.getParameter("work_no"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_BUDG_2105_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_BUDG_2000EJBHome home = (MC_BUDG_2000EJBHome)JNDIManager.getInstance().getHome("MC_BUDG_2000EJB");
			MC_BUDG_2000EJB ejb = home.create();

			ds = ejb.mc_budg_2105_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
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
		dm.work_no = (String)hash.get("work_no");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.budg_yymm = Util.getSessionParameterValue(req,"budg_yymm",true);
		dm.budg_cd = Util.getSessionParameterValue(req,"budg_cd",true);
		dm.dept_cd = Util.getSessionParameterValue(req,"dept_cd",true);
		dm.work_no = Util.getSessionParameterValue(req,"work_no",true);
		*******************************************************************************************/
	}
	public void mc_budg_2106_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_BUDG_2106_LDataSet ds = null;
		MC_BUDG_2106_LDM dm = new MC_BUDG_2106_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.budg_yymm = Util.checkString(req.getParameter("budg_yymm"));
		dm.budg_cd = Util.checkString(req.getParameter("budg_cd"));
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.work_no = Util.checkString(req.getParameter("work_no"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_BUDG_2106_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_BUDG_2000EJBHome home = (MC_BUDG_2000EJBHome)JNDIManager.getInstance().getHome("MC_BUDG_2000EJB");
			MC_BUDG_2000EJB ejb = home.create();

			ds = ejb.mc_budg_2106_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
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
		dm.work_no = (String)hash.get("work_no");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.budg_yymm = Util.getSessionParameterValue(req,"budg_yymm",true);
		dm.budg_cd = Util.getSessionParameterValue(req,"budg_cd",true);
		dm.dept_cd = Util.getSessionParameterValue(req,"dept_cd",true);
		dm.work_no = Util.getSessionParameterValue(req,"work_no",true);
		*******************************************************************************************/
	}
	public void mc_budg_2107_d(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_BUDG_2107_DDataSet ds = null;
		MC_BUDG_2107_DDM dm = new MC_BUDG_2107_DDM();

		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData1"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		String multiUpdateData2 = Util.checkString(req.getParameter("multiUpdateData2"));
		Hashtable hash2 = getHashMultiUpdateData(multiUpdateData2);

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.tag = Util.checkString(req.getParameter("tag"));
		dm.cnt = Util.checkString(req.getParameter("cnt"));
		dm.budg_yymm = (String)hash.get("budg_yymm");
		dm.budg_cd = Util.checkString(req.getParameter("budg_cd"));
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.evnt_cd = Util.checkString(req.getParameter("evnt_cd"));
		dm.work_no = Util.checkString(req.getParameter("work_no"));
		dm.seq = (String)hash2.get("seq");
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.incmg_pers_ipadd = req.getRemoteAddr();

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_BUDG_2107_DDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_BUDG_2000EJBHome home = (MC_BUDG_2000EJBHome)JNDIManager.getInstance().getHome("MC_BUDG_2000EJB");
			MC_BUDG_2000EJB ejb = home.create();

			ds = ejb.mc_budg_2107_d(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		EJB 수정전 끝 */

		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.tag = (String)hash.get("tag");
		dm.cnt = (String)hash.get("cnt");
		dm.budg_yymm = (String)hash.get("budg_yymm");
		dm.budg_cd = (String)hash.get("budg_cd");
		dm.dept_cd = (String)hash.get("dept_cd");
		dm.evnt_cd = (String)hash.get("evnt_cd");
		dm.work_no = (String)hash.get("work_no");
		dm.seq = (String)hash.get("seq");
		dm.incmg_pers = (String)hash.get("incmg_pers");
		dm.incmg_pers_ipadd = (String)hash.get("incmg_pers_ipadd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.tag = Util.getSessionParameterValue(req,"tag",true);
		dm.cnt = Util.getSessionParameterValue(req,"cnt",true);
		dm.budg_yymm = Util.getSessionParameterValue(req,"budg_yymm",true);
		dm.budg_cd = Util.getSessionParameterValue(req,"budg_cd",true);
		dm.dept_cd = Util.getSessionParameterValue(req,"dept_cd",true);
		dm.evnt_cd = Util.getSessionParameterValue(req,"evnt_cd",true);
		dm.work_no = Util.getSessionParameterValue(req,"work_no",true);
		dm.seq = Util.getSessionParameterValue(req,"seq",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"incmg_pers",true);
		dm.incmg_pers_ipadd = Util.getSessionParameterValue(req,"incmg_pers_ipadd",true);
		*******************************************************************************************/
	}
	public void mc_budg_2111_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_BUDG_2111_LDataSet ds = null;
		MC_BUDG_2111_LDM dm = new MC_BUDG_2111_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.budg_yymm = Util.checkString(req.getParameter("budg_yymm"));
		dm.budg_cd = Util.checkString(req.getParameter("budg_cd"));
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.work_no = Util.checkString(req.getParameter("work_no"));
		dm.seq = Util.checkString(req.getParameter("seq"));
		dm.use_dept_cd = Util.checkString(req.getParameter("use_dept_cd"));
		dm.job_clsf = Util.checkString(req.getParameter("job_clsf"));
		dm.dtls_clsf = Util.checkString(req.getParameter("dtls_clsf"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_BUDG_2111_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_BUDG_2000EJBHome home = (MC_BUDG_2000EJBHome)JNDIManager.getInstance().getHome("MC_BUDG_2000EJB");
			MC_BUDG_2000EJB ejb = home.create();

			ds = ejb.mc_budg_2111_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
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
		dm.work_no = (String)hash.get("work_no");
		dm.seq = (String)hash.get("seq");
		dm.use_dept_cd = (String)hash.get("use_dept_cd");
		dm.job_clsf = (String)hash.get("job_clsf");
		dm.dtls_clsf = (String)hash.get("dtls_clsf");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.budg_yymm = Util.getSessionParameterValue(req,"budg_yymm",true);
		dm.budg_cd = Util.getSessionParameterValue(req,"budg_cd",true);
		dm.dept_cd = Util.getSessionParameterValue(req,"dept_cd",true);
		dm.work_no = Util.getSessionParameterValue(req,"work_no",true);
		dm.seq = Util.getSessionParameterValue(req,"seq",true);
		dm.use_dept_cd = Util.getSessionParameterValue(req,"use_dept_cd",true);
		dm.job_clsf = Util.getSessionParameterValue(req,"job_clsf",true);
		dm.dtls_clsf = Util.getSessionParameterValue(req,"dtls_clsf",true);
		*******************************************************************************************/
	}	
	public void mc_budg_2112_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_BUDG_2112_LDataSet ds = null;
		MC_BUDG_2112_LDM dm = new MC_BUDG_2112_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.budg_yymm = Util.checkString(req.getParameter("budg_yymm"));
		dm.budg_cd = Util.checkString(req.getParameter("budg_cd"));
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.work_no = Util.checkString(req.getParameter("work_no"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_BUDG_2112_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/* EJB 수정전 시작
		try {
			MC_BUDG_2000EJBHome home = (MC_BUDG_2000EJBHome)JNDIManager.getInstance().getHome("MC_BUDG_2000EJB");
			MC_BUDG_2000EJB ejb = home.create();

			ds = ejb.mc_budg_2112_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
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
		dm.work_no = (String)hash.get("work_no");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.budg_yymm = Util.getSessionParameterValue(req,"budg_yymm",true);
		dm.budg_cd = Util.getSessionParameterValue(req,"budg_cd",true);
		dm.dept_cd = Util.getSessionParameterValue(req,"dept_cd",true);
		dm.work_no = Util.getSessionParameterValue(req,"work_no",true);
		*******************************************************************************************/
	}
	public void mc_budg_2113_i(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_BUDG_2113_IDataSet ds = null;
		MC_BUDG_2113_IDM dm = new MC_BUDG_2113_IDM();

		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData1"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);
		
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.tag = Util.checkString(req.getParameter("tag"));
		dm.mode = (String)hash.get("m");
		dm.jobtag = (String)hash.get("jobtag");
		dm.budg_yy = Util.checkString(req.getParameter("budg_yy"));
		dm.budg_yymm = (String)hash.get("budg_yymm");
		dm.budg_cd = Util.checkString(req.getParameter("budg_cd"));
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.evnt_cd = Util.checkString(req.getParameter("evnt_cd"));
		dm.work_no = Util.checkString(req.getParameter("work_no"));
		dm.seq = (String)hash.get("seq");
		dm.new_medi_cd = Util.checkString(req.getParameter("new_medi_cd"));
		dm.old_medi_cd = Util.checkString(req.getParameter("old_medi_cd"));
		dm.use_dept_cd = (String)hash.get("use_dept_cd");
		dm.req_qunt = (String)hash.get("req_qunt");
		dm.req_uprc = (String)hash.get("req_uprc");
		dm.req_amt = (String)hash.get("req_amt");
		dm.rmks = (String)hash.get("rmks");
		dm.crte_clsf = Util.checkString(req.getParameter("crte_clsf"));
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.job_clsf = Util.checkString(req.getParameter("job_clsf"));
		dm.dtls_clsf = Util.checkString(req.getParameter("dtls_clsf"));
		dm.ini_plan_qunt = (String)hash.get("ini_plan_qunt");
		dm.incmg_pers_ipadd = req.getRemoteAddr();

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_BUDG_2113_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_BUDG_2000EJBHome home = (MC_BUDG_2000EJBHome)JNDIManager.getInstance().getHome("MC_BUDG_2000EJB");
			MC_BUDG_2000EJB ejb = home.create();

			ds = ejb.mc_budg_2113_i(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		EJB 수정전 끝 */

		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.tag = (String)hash.get("tag");
		dm.mode = (String)hash.get("mode");
		dm.jobtag = (String)hash.get("jobtag");
		dm.budg_yy = (String)hash.get("budg_yy");
		dm.budg_yymm = (String)hash.get("budg_yymm");
		dm.budg_cd = (String)hash.get("budg_cd");
		dm.dept_cd = (String)hash.get("dept_cd");
		dm.evnt_cd = (String)hash.get("evnt_cd");
		dm.work_no = (String)hash.get("work_no");
		dm.seq = (String)hash.get("seq");
		dm.new_medi_cd = (String)hash.get("new_medi_cd");
		dm.old_medi_cd = (String)hash.get("old_medi_cd");
		dm.use_dept_cd = (String)hash.get("use_dept_cd");
		dm.req_qunt = (String)hash.get("req_qunt");
		dm.req_uprc = (String)hash.get("req_uprc");
		dm.req_amt = (String)hash.get("req_amt");
		dm.rmks = (String)hash.get("rmks");
		dm.crte_clsf = (String)hash.get("crte_clsf");
		dm.incmg_pers = (String)hash.get("incmg_pers");
		dm.job_clsf = (String)hash.get("job_clsf");
		dm.dtls_clsf = (String)hash.get("dtls_clsf");
		dm.ini_plan_qunt = (String)hash.get("ini_plan_qunt");
		dm.incmg_pers_ipadd = (String)hash.get("incmg_pers_ipadd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.tag = Util.getSessionParameterValue(req,"tag",true);
		dm.mode = Util.getSessionParameterValue(req,"mode",true);
		dm.jobtag = Util.getSessionParameterValue(req,"jobtag",true);
		dm.budg_yy = Util.getSessionParameterValue(req,"budg_yy",true);
		dm.budg_yymm = Util.getSessionParameterValue(req,"budg_yymm",true);
		dm.budg_cd = Util.getSessionParameterValue(req,"budg_cd",true);
		dm.dept_cd = Util.getSessionParameterValue(req,"dept_cd",true);
		dm.evnt_cd = Util.getSessionParameterValue(req,"evnt_cd",true);
		dm.work_no = Util.getSessionParameterValue(req,"work_no",true);
		dm.seq = Util.getSessionParameterValue(req,"seq",true);
		dm.new_medi_cd = Util.getSessionParameterValue(req,"new_medi_cd",true);
		dm.old_medi_cd = Util.getSessionParameterValue(req,"old_medi_cd",true);
		dm.use_dept_cd = Util.getSessionParameterValue(req,"use_dept_cd",true);
		dm.req_qunt = Util.getSessionParameterValue(req,"req_qunt",true);
		dm.req_uprc = Util.getSessionParameterValue(req,"req_uprc",true);
		dm.req_amt = Util.getSessionParameterValue(req,"req_amt",true);
		dm.rmks = Util.getSessionParameterValue(req,"rmks",true);
		dm.crte_clsf = Util.getSessionParameterValue(req,"crte_clsf",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"incmg_pers",true);
		dm.job_clsf = Util.getSessionParameterValue(req,"job_clsf",true);
		dm.dtls_clsf = Util.getSessionParameterValue(req,"dtls_clsf",true);
		dm.ini_plan_qunt = Util.getSessionParameterValue(req,"ini_plan_qunt",true);
		dm.incmg_pers_ipadd = Util.getSessionParameterValue(req,"incmg_pers_ipadd",true);
		*******************************************************************************************/
	}	
	public void mc_budg_2114_d(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_BUDG_2114_DDataSet ds = null;
		MC_BUDG_2114_DDM dm = new MC_BUDG_2114_DDM();

		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData1"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		String multiUpdateData2 = Util.checkString(req.getParameter("multiUpdateData2"));
		Hashtable hash2 = getHashMultiUpdateData(multiUpdateData2);
		
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.tag = Util.checkString(req.getParameter("tag"));
		dm.cnt = Util.checkString(req.getParameter("cnt"));
		dm.budg_yy = Util.checkString(req.getParameter("budg_yy"));
		dm.budg_yymm = (String)hash.get("budg_yymm");
		dm.budg_cd = Util.checkString(req.getParameter("budg_cd"));
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.evnt_cd = Util.checkString(req.getParameter("evnt_cd"));
		dm.work_no = Util.checkString(req.getParameter("work_no"));
		dm.seq = (String)hash2.get("seq");
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.job_clsf = Util.checkString(req.getParameter("job_clsf"));
		dm.dtls_clsf_cd = Util.checkString(req.getParameter("dtls_clsf_cd"));
		dm.medi_cd = Util.checkString(req.getParameter("medi_cd"));
		dm.use_dept_cd = (String)hash.get("use_dept_cd");

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_BUDG_2114_DDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_BUDG_2000EJBHome home = (MC_BUDG_2000EJBHome)JNDIManager.getInstance().getHome("MC_BUDG_2000EJB");
			MC_BUDG_2000EJB ejb = home.create();

			ds = ejb.mc_budg_2114_d(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		EJB 수정전 끝 */

		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.tag = (String)hash.get("tag");
		dm.cnt = (String)hash.get("cnt");
		dm.budg_yy = (String)hash.get("budg_yy");
		dm.budg_yymm = (String)hash.get("budg_yymm");
		dm.budg_cd = (String)hash.get("budg_cd");
		dm.dept_cd = (String)hash.get("dept_cd");
		dm.evnt_cd = (String)hash.get("evnt_cd");
		dm.work_no = (String)hash.get("work_no");
		dm.seq = (String)hash.get("seq");
		dm.incmg_pers = (String)hash.get("incmg_pers");
		dm.job_clsf = (String)hash.get("job_clsf");
		dm.dtls_clsf_cd = (String)hash.get("dtls_clsf_cd");
		dm.medi_cd = (String)hash.get("medi_cd");
		dm.use_dept_cd = (String)hash.get("use_dept_cd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.tag = Util.getSessionParameterValue(req,"tag",true);
		dm.cnt = Util.getSessionParameterValue(req,"cnt",true);
		dm.budg_yy = Util.getSessionParameterValue(req,"budg_yy",true);
		dm.budg_yymm = Util.getSessionParameterValue(req,"budg_yymm",true);
		dm.budg_cd = Util.getSessionParameterValue(req,"budg_cd",true);
		dm.dept_cd = Util.getSessionParameterValue(req,"dept_cd",true);
		dm.evnt_cd = Util.getSessionParameterValue(req,"evnt_cd",true);
		dm.work_no = Util.getSessionParameterValue(req,"work_no",true);
		dm.seq = Util.getSessionParameterValue(req,"seq",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"incmg_pers",true);
		dm.job_clsf = Util.getSessionParameterValue(req,"job_clsf",true);
		dm.dtls_clsf_cd = Util.getSessionParameterValue(req,"dtls_clsf_cd",true);
		dm.medi_cd = Util.getSessionParameterValue(req,"medi_cd",true);
		dm.use_dept_cd = Util.getSessionParameterValue(req,"use_dept_cd",true);
		*******************************************************************************************/
	}
	public void mc_budg_2115_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_BUDG_2115_LDataSet ds = null;
		MC_BUDG_2115_LDM dm = new MC_BUDG_2115_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.budg_yy = Util.checkString(req.getParameter("budg_yy"));
		dm.budg_cd = Util.checkString(req.getParameter("budg_cd"));
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.medi_cd = Util.checkString(req.getParameter("medi_cd"));
		dm.job_clsf = Util.checkString(req.getParameter("job_clsf"));
		dm.dtls_clsf = Util.checkString(req.getParameter("dtls_clsf"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_BUDG_2115_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_BUDG_2000EJBHome home = (MC_BUDG_2000EJBHome)JNDIManager.getInstance().getHome("MC_BUDG_2000EJB");
			MC_BUDG_2000EJB ejb = home.create();

			ds = ejb.mc_budg_2115_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
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
		dm.budg_cd = (String)hash.get("budg_cd");
		dm.dept_cd = (String)hash.get("dept_cd");
		dm.medi_cd = (String)hash.get("medi_cd");
		dm.job_clsf = (String)hash.get("job_clsf");
		dm.dtls_clsf = (String)hash.get("dtls_clsf");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.budg_yy = Util.getSessionParameterValue(req,"budg_yy",true);
		dm.budg_cd = Util.getSessionParameterValue(req,"budg_cd",true);
		dm.dept_cd = Util.getSessionParameterValue(req,"dept_cd",true);
		dm.medi_cd = Util.getSessionParameterValue(req,"medi_cd",true);
		dm.job_clsf = Util.getSessionParameterValue(req,"job_clsf",true);
		dm.dtls_clsf = Util.getSessionParameterValue(req,"dtls_clsf",true);
		*******************************************************************************************/
	}
	public void mc_budg_2116_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_BUDG_2116_LDataSet ds = null;
		MC_BUDG_2116_LDM dm = new MC_BUDG_2116_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.budg_type_cd = Util.checkString(req.getParameter("budg_type_cd"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_BUDG_2116_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_BUDG_2000EJBHome home = (MC_BUDG_2000EJBHome)JNDIManager.getInstance().getHome("MC_BUDG_2000EJB");
			MC_BUDG_2000EJB ejb = home.create();

			ds = ejb.mc_budg_2116_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
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
		dm.budg_type_cd = (String)hash.get("budg_type_cd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.dept_cd = Util.getSessionParameterValue(req,"dept_cd",true);
		dm.budg_type_cd = Util.getSessionParameterValue(req,"budg_type_cd",true);
		*******************************************************************************************/
	}
	public void mc_budg_2117_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_BUDG_2117_LDataSet ds = null;
		MC_BUDG_2117_LDM dm = new MC_BUDG_2117_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.budg_cd = Util.checkString(req.getParameter("budg_cd"));
		dm.budg_cd1 = Util.checkString(req.getParameter("budg_cd1"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_BUDG_2117_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_BUDG_2000EJBHome home = (MC_BUDG_2000EJBHome)JNDIManager.getInstance().getHome("MC_BUDG_2000EJB");
			MC_BUDG_2000EJB ejb = home.create();

			ds = ejb.mc_budg_2117_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
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
		dm.budg_cd1 = (String)hash.get("budg_cd1");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.dept_cd = Util.getSessionParameterValue(req,"dept_cd",true);
		dm.budg_cd = Util.getSessionParameterValue(req,"budg_cd",true);
		dm.budg_cd1 = Util.getSessionParameterValue(req,"budg_cd1",true);
		*******************************************************************************************/
	}
	public void mc_budg_2118_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_BUDG_2118_LDataSet ds = null;
		MC_BUDG_2118_LDM dm = new MC_BUDG_2118_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.budg_yymm = Util.checkString(req.getParameter("budg_yymm"));
		dm.budg_cd = Util.checkString(req.getParameter("budg_cd"));
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.work_no = Util.checkString(req.getParameter("work_no"));
		dm.seq = Util.checkString(req.getParameter("seq"));
		dm.medi_cd = Util.checkString(req.getParameter("medi_cd"));
		dm.use_dept_cd = Util.checkString(req.getParameter("use_dept_cd"));
		dm.crte_clsf = Util.checkString(req.getParameter("crte_clsf"));
		dm.job_clsf = Util.checkString(req.getParameter("job_clsf"));
		dm.dtls_clsf = Util.checkString(req.getParameter("dtls_clsf"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_BUDG_2118_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_BUDG_2000EJBHome home = (MC_BUDG_2000EJBHome)JNDIManager.getInstance().getHome("MC_BUDG_2000EJB");
			MC_BUDG_2000EJB ejb = home.create();

			ds = ejb.mc_budg_2118_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
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
		dm.work_no = (String)hash.get("work_no");
		dm.seq = (String)hash.get("seq");
		dm.medi_cd = (String)hash.get("medi_cd");
		dm.use_dept_cd = (String)hash.get("use_dept_cd");
		dm.crte_clsf = (String)hash.get("crte_clsf");
		dm.job_clsf = (String)hash.get("job_clsf");
		dm.dtls_clsf = (String)hash.get("dtls_clsf");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.budg_yymm = Util.getSessionParameterValue(req,"budg_yymm",true);
		dm.budg_cd = Util.getSessionParameterValue(req,"budg_cd",true);
		dm.dept_cd = Util.getSessionParameterValue(req,"dept_cd",true);
		dm.work_no = Util.getSessionParameterValue(req,"work_no",true);
		dm.seq = Util.getSessionParameterValue(req,"seq",true);
		dm.medi_cd = Util.getSessionParameterValue(req,"medi_cd",true);
		dm.use_dept_cd = Util.getSessionParameterValue(req,"use_dept_cd",true);
		dm.crte_clsf = Util.getSessionParameterValue(req,"crte_clsf",true);
		dm.job_clsf = Util.getSessionParameterValue(req,"job_clsf",true);
		dm.dtls_clsf = Util.getSessionParameterValue(req,"dtls_clsf",true);
		*******************************************************************************************/
	}
	public void mc_budg_2121_s(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_BUDG_2121_SDataSet ds = null;
		MC_BUDG_2121_SDM dm = new MC_BUDG_2121_SDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.evnt_cd = Util.checkString(req.getParameter("evnt_cd"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_BUDG_2121_SDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_BUDG_2000EJBHome home = (MC_BUDG_2000EJBHome)JNDIManager.getInstance().getHome("MC_BUDG_2000EJB");
			MC_BUDG_2000EJB ejb = home.create();

			ds = ejb.mc_budg_2121_s(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
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
	public void mc_budg_2122_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_BUDG_2122_LDataSet ds = null;
		MC_BUDG_2122_LDM dm = new MC_BUDG_2122_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.clas_cd1 = Util.checkString(req.getParameter("clas_cd1"));
		dm.budg_yyyy = Util.checkString(req.getParameter("budg_yyyy"));
		dm.evnt_cd = Util.checkString(req.getParameter("evnt_cd"));
		dm.work_no = Util.checkString(req.getParameter("work_no"));
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.use_dept_cd = Util.checkString(req.getParameter("use_dept_cd"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_BUDG_2122_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_BUDG_2000EJBHome home = (MC_BUDG_2000EJBHome)JNDIManager.getInstance().getHome("MC_BUDG_2000EJB");
			MC_BUDG_2000EJB ejb = home.create();

			ds = ejb.mc_budg_2122_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		EJB 수정전 끝 */

		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.clas_cd1 = (String)hash.get("clas_cd1");
		dm.budg_yyyy = (String)hash.get("budg_yyyy");
		dm.evnt_cd = (String)hash.get("evnt_cd");
		dm.work_no = (String)hash.get("work_no");
		dm.dept_cd = (String)hash.get("dept_cd");
		dm.use_dept_cd = (String)hash.get("use_dept_cd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.clas_cd1 = Util.getSessionParameterValue(req,"clas_cd1",true);
		dm.budg_yyyy = Util.getSessionParameterValue(req,"budg_yyyy",true);
		dm.evnt_cd = Util.getSessionParameterValue(req,"evnt_cd",true);
		dm.work_no = Util.getSessionParameterValue(req,"work_no",true);
		dm.dept_cd = Util.getSessionParameterValue(req,"dept_cd",true);
		dm.use_dept_cd = Util.getSessionParameterValue(req,"use_dept_cd",true);
		*******************************************************************************************/
	}	
	public void mc_budg_2123_a(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_BUDG_2123_ADataSet ds = null;
		MC_BUDG_2123_ADM dm = new MC_BUDG_2123_ADM();
		
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.work_no_inc = Util.checkString(req.getParameter("work_no_inc"));
		dm.budg_yyyy = Util.checkString(req.getParameter("budg_yyyy"));
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.work_no = Util.checkString(req.getParameter("work_no"));
		dm.evnt_cd = Util.checkString(req.getParameter("evnt_cd"));
		dm.use_dept_cd = Util.checkString(req.getParameter("use_dept_cd"));
		dm.medi_cd = Util.checkString(req.getParameter("medi_cd"));
		dm.crte_clsf = Util.checkString(req.getParameter("crte_clsf"));
		dm.grid1_mode = (String)hash.get("m");
		dm.grid1_rownum = (String)hash.get("rownum");
		dm.grid1_seq = (String)hash.get("seq");
		dm.grid1_budg_cd = (String)hash.get("budg_cd");
		dm.grid1_rmks = (String)hash.get("rmks");
		dm.grid1_req_amt_01 = (String)hash.get("req_amt_01");
		dm.grid1_fix_amt_01 = (String)hash.get("req_amt_01");//(String)hash.get("fix_amt_01");
		dm.grid1_req_amt_02 = (String)hash.get("req_amt_02");
		dm.grid1_fix_amt_02 = (String)hash.get("req_amt_02");//(String)hash.get("fix_amt_02");
		dm.grid1_req_amt_03 = (String)hash.get("req_amt_03");
		dm.grid1_fix_amt_03 = (String)hash.get("req_amt_03");//(String)hash.get("fix_amt_03");
		dm.grid1_req_amt_04 = (String)hash.get("req_amt_04");
		dm.grid1_fix_amt_04 = (String)hash.get("req_amt_04");//(String)hash.get("fix_amt_04");
		dm.grid1_req_amt_05 = (String)hash.get("req_amt_05");
		dm.grid1_fix_amt_05 = (String)hash.get("req_amt_05");//(String)hash.get("fix_amt_05");
		dm.grid1_req_amt_06 = (String)hash.get("req_amt_06");
		dm.grid1_fix_amt_06 = (String)hash.get("req_amt_06");//(String)hash.get("fix_amt_06");
		dm.grid1_req_amt_07 = (String)hash.get("req_amt_07");
		dm.grid1_fix_amt_07 = (String)hash.get("req_amt_07");//(String)hash.get("fix_amt_07");
		dm.grid1_req_amt_08 = (String)hash.get("req_amt_08");
		dm.grid1_fix_amt_08 = (String)hash.get("req_amt_08");//(String)hash.get("fix_amt_08");
		dm.grid1_req_amt_09 = (String)hash.get("req_amt_09");
		dm.grid1_fix_amt_09 = (String)hash.get("req_amt_09");//(String)hash.get("fix_amt_09");
		dm.grid1_req_amt_10 = (String)hash.get("req_amt_10");
		dm.grid1_fix_amt_10 = (String)hash.get("req_amt_10");//(String)hash.get("fix_amt_10");
		dm.grid1_req_amt_11 = (String)hash.get("req_amt_11");
		dm.grid1_fix_amt_11 = (String)hash.get("req_amt_11");//(String)hash.get("fix_amt_11");
		dm.grid1_req_amt_12 = (String)hash.get("req_amt_12");
		dm.grid1_fix_amt_12 = (String)hash.get("req_amt_12");//(String)hash.get("fix_amt_12");
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.chg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.incmg_pers_ipadd = req.getRemoteAddr();

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_BUDG_2123_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_BUDG_2000EJBHome home = (MC_BUDG_2000EJBHome)JNDIManager.getInstance().getHome("MC_BUDG_2000EJB");
			MC_BUDG_2000EJB ejb = home.create();

			ds = ejb.mc_budg_2123_a(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		EJB 수정전 끝 */		

		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.work_no_inc = (String)hash.get("work_no_inc");
		dm.budg_yyyy = (String)hash.get("budg_yyyy");
		dm.dept_cd = (String)hash.get("dept_cd");
		dm.work_no = (String)hash.get("work_no");
		dm.evnt_cd = (String)hash.get("evnt_cd");
		dm.use_dept_cd = (String)hash.get("use_dept_cd");
		dm.medi_cd = (String)hash.get("medi_cd");
		dm.crte_clsf = (String)hash.get("crte_clsf");
		dm.grid1_mode = (String)hash.get("grid1_mode");
		dm.grid1_rownum = (String)hash.get("grid1_rownum");
		dm.grid1_seq = (String)hash.get("grid1_seq");
		dm.grid1_budg_cd = (String)hash.get("grid1_budg_cd");
		dm.grid1_rmks = (String)hash.get("grid1_rmks");
		dm.grid1_req_amt_01 = (String)hash.get("grid1_req_amt_01");
		dm.grid1_fix_amt_01 = (String)hash.get("grid1_fix_amt_01");
		dm.grid1_req_amt_02 = (String)hash.get("grid1_req_amt_02");
		dm.grid1_fix_amt_02 = (String)hash.get("grid1_fix_amt_02");
		dm.grid1_req_amt_03 = (String)hash.get("grid1_req_amt_03");
		dm.grid1_fix_amt_03 = (String)hash.get("grid1_fix_amt_03");
		dm.grid1_req_amt_04 = (String)hash.get("grid1_req_amt_04");
		dm.grid1_fix_amt_04 = (String)hash.get("grid1_fix_amt_04");
		dm.grid1_req_amt_05 = (String)hash.get("grid1_req_amt_05");
		dm.grid1_fix_amt_05 = (String)hash.get("grid1_fix_amt_05");
		dm.grid1_req_amt_06 = (String)hash.get("grid1_req_amt_06");
		dm.grid1_fix_amt_06 = (String)hash.get("grid1_fix_amt_06");
		dm.grid1_req_amt_07 = (String)hash.get("grid1_req_amt_07");
		dm.grid1_fix_amt_07 = (String)hash.get("grid1_fix_amt_07");
		dm.grid1_req_amt_08 = (String)hash.get("grid1_req_amt_08");
		dm.grid1_fix_amt_08 = (String)hash.get("grid1_fix_amt_08");
		dm.grid1_req_amt_09 = (String)hash.get("grid1_req_amt_09");
		dm.grid1_fix_amt_09 = (String)hash.get("grid1_fix_amt_09");
		dm.grid1_req_amt_10 = (String)hash.get("grid1_req_amt_10");
		dm.grid1_fix_amt_10 = (String)hash.get("grid1_fix_amt_10");
		dm.grid1_req_amt_11 = (String)hash.get("grid1_req_amt_11");
		dm.grid1_fix_amt_11 = (String)hash.get("grid1_fix_amt_11");
		dm.grid1_req_amt_12 = (String)hash.get("grid1_req_amt_12");
		dm.grid1_fix_amt_12 = (String)hash.get("grid1_fix_amt_12");
		dm.incmg_pers = (String)hash.get("incmg_pers");
		dm.chg_pers = (String)hash.get("chg_pers");
		dm.incmg_pers_ipadd = (String)hash.get("incmg_pers_ipadd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.work_no_inc = Util.getSessionParameterValue(req,"work_no_inc",true);
		dm.budg_yyyy = Util.getSessionParameterValue(req,"budg_yyyy",true);
		dm.dept_cd = Util.getSessionParameterValue(req,"dept_cd",true);
		dm.work_no = Util.getSessionParameterValue(req,"work_no",true);
		dm.evnt_cd = Util.getSessionParameterValue(req,"evnt_cd",true);
		dm.use_dept_cd = Util.getSessionParameterValue(req,"use_dept_cd",true);
		dm.medi_cd = Util.getSessionParameterValue(req,"medi_cd",true);
		dm.crte_clsf = Util.getSessionParameterValue(req,"crte_clsf",true);
		dm.grid1_mode = Util.getSessionParameterValue(req,"grid1_mode",true);
		dm.grid1_rownum = Util.getSessionParameterValue(req,"grid1_rownum",true);
		dm.grid1_seq = Util.getSessionParameterValue(req,"grid1_seq",true);
		dm.grid1_budg_cd = Util.getSessionParameterValue(req,"grid1_budg_cd",true);
		dm.grid1_rmks = Util.getSessionParameterValue(req,"grid1_rmks",true);
		dm.grid1_req_amt_01 = Util.getSessionParameterValue(req,"grid1_req_amt_01",true);
		dm.grid1_fix_amt_01 = Util.getSessionParameterValue(req,"grid1_fix_amt_01",true);
		dm.grid1_req_amt_02 = Util.getSessionParameterValue(req,"grid1_req_amt_02",true);
		dm.grid1_fix_amt_02 = Util.getSessionParameterValue(req,"grid1_fix_amt_02",true);
		dm.grid1_req_amt_03 = Util.getSessionParameterValue(req,"grid1_req_amt_03",true);
		dm.grid1_fix_amt_03 = Util.getSessionParameterValue(req,"grid1_fix_amt_03",true);
		dm.grid1_req_amt_04 = Util.getSessionParameterValue(req,"grid1_req_amt_04",true);
		dm.grid1_fix_amt_04 = Util.getSessionParameterValue(req,"grid1_fix_amt_04",true);
		dm.grid1_req_amt_05 = Util.getSessionParameterValue(req,"grid1_req_amt_05",true);
		dm.grid1_fix_amt_05 = Util.getSessionParameterValue(req,"grid1_fix_amt_05",true);
		dm.grid1_req_amt_06 = Util.getSessionParameterValue(req,"grid1_req_amt_06",true);
		dm.grid1_fix_amt_06 = Util.getSessionParameterValue(req,"grid1_fix_amt_06",true);
		dm.grid1_req_amt_07 = Util.getSessionParameterValue(req,"grid1_req_amt_07",true);
		dm.grid1_fix_amt_07 = Util.getSessionParameterValue(req,"grid1_fix_amt_07",true);
		dm.grid1_req_amt_08 = Util.getSessionParameterValue(req,"grid1_req_amt_08",true);
		dm.grid1_fix_amt_08 = Util.getSessionParameterValue(req,"grid1_fix_amt_08",true);
		dm.grid1_req_amt_09 = Util.getSessionParameterValue(req,"grid1_req_amt_09",true);
		dm.grid1_fix_amt_09 = Util.getSessionParameterValue(req,"grid1_fix_amt_09",true);
		dm.grid1_req_amt_10 = Util.getSessionParameterValue(req,"grid1_req_amt_10",true);
		dm.grid1_fix_amt_10 = Util.getSessionParameterValue(req,"grid1_fix_amt_10",true);
		dm.grid1_req_amt_11 = Util.getSessionParameterValue(req,"grid1_req_amt_11",true);
		dm.grid1_fix_amt_11 = Util.getSessionParameterValue(req,"grid1_fix_amt_11",true);
		dm.grid1_req_amt_12 = Util.getSessionParameterValue(req,"grid1_req_amt_12",true);
		dm.grid1_fix_amt_12 = Util.getSessionParameterValue(req,"grid1_fix_amt_12",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"incmg_pers",true);
		dm.chg_pers = Util.getSessionParameterValue(req,"chg_pers",true);
		dm.incmg_pers_ipadd = Util.getSessionParameterValue(req,"incmg_pers_ipadd",true);
		*******************************************************************************************/
	}	
	public void mc_budg_2124_s(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_BUDG_2124_SDataSet ds = null;
		MC_BUDG_2124_SDM dm = new MC_BUDG_2124_SDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.budg_yymm = Util.checkString(req.getParameter("budg_yymm"));
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.evnt_cd = Util.checkString(req.getParameter("evnt_cd"));
		dm.work_no = Util.checkString(req.getParameter("work_no"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_BUDG_2124_SDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_BUDG_2000EJBHome home = (MC_BUDG_2000EJBHome)JNDIManager.getInstance().getHome("MC_BUDG_2000EJB");
			MC_BUDG_2000EJB ejb = home.create();

			ds = ejb.mc_budg_2124_s(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
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
		dm.work_no = (String)hash.get("work_no");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.budg_yymm = Util.getSessionParameterValue(req,"budg_yymm",true);
		dm.dept_cd = Util.getSessionParameterValue(req,"dept_cd",true);
		dm.evnt_cd = Util.getSessionParameterValue(req,"evnt_cd",true);
		dm.work_no = Util.getSessionParameterValue(req,"work_no",true);
		*******************************************************************************************/
	}
	public void mc_budg_2125_d(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_BUDG_2125_DDataSet ds = null;
		MC_BUDG_2125_DDM dm = new MC_BUDG_2125_DDM();

		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);
		
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.work_tag = Util.checkString(req.getParameter("work_tag"));
		dm.budg_yyyy = Util.checkString(req.getParameter("budg_yyyy"));
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.work_no = Util.checkString(req.getParameter("work_no"));
		dm.evnt_cd = Util.checkString(req.getParameter("evnt_cd"));
		dm.use_dept_cd = Util.checkString(req.getParameter("use_dept_cd"));
		dm.grid1_mode = (String)hash.get("m");
		dm.grid1_rownum = (String)hash.get("rownum");
		dm.grid1_seq = (String)hash.get("seq");
		dm.grid1_budg_cd = (String)hash.get("budg_cd");
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.chg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.incmg_pers_ipadd = req.getRemoteAddr();

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_BUDG_2125_DDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_BUDG_2000EJBHome home = (MC_BUDG_2000EJBHome)JNDIManager.getInstance().getHome("MC_BUDG_2000EJB");
			MC_BUDG_2000EJB ejb = home.create();

			ds = ejb.mc_budg_2125_d(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		EJB 수정전 끝 */

		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.work_tag = (String)hash.get("work_tag");
		dm.budg_yyyy = (String)hash.get("budg_yyyy");
		dm.dept_cd = (String)hash.get("dept_cd");
		dm.work_no = (String)hash.get("work_no");
		dm.evnt_cd = (String)hash.get("evnt_cd");
		dm.use_dept_cd = (String)hash.get("use_dept_cd");
		dm.grid1_mode = (String)hash.get("grid1_mode");
		dm.grid1_rownum = (String)hash.get("grid1_rownum");
		dm.grid1_seq = (String)hash.get("grid1_seq");
		dm.grid1_budg_cd = (String)hash.get("grid1_budg_cd");
		dm.incmg_pers = (String)hash.get("incmg_pers");
		dm.chg_pers = (String)hash.get("chg_pers");
		dm.incmg_pers_ipadd = (String)hash.get("incmg_pers_ipadd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.work_tag = Util.getSessionParameterValue(req,"work_tag",true);
		dm.budg_yyyy = Util.getSessionParameterValue(req,"budg_yyyy",true);
		dm.dept_cd = Util.getSessionParameterValue(req,"dept_cd",true);
		dm.work_no = Util.getSessionParameterValue(req,"work_no",true);
		dm.evnt_cd = Util.getSessionParameterValue(req,"evnt_cd",true);
		dm.use_dept_cd = Util.getSessionParameterValue(req,"use_dept_cd",true);
		dm.grid1_mode = Util.getSessionParameterValue(req,"grid1_mode",true);
		dm.grid1_rownum = Util.getSessionParameterValue(req,"grid1_rownum",true);
		dm.grid1_seq = Util.getSessionParameterValue(req,"grid1_seq",true);
		dm.grid1_budg_cd = Util.getSessionParameterValue(req,"grid1_budg_cd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"incmg_pers",true);
		dm.chg_pers = Util.getSessionParameterValue(req,"chg_pers",true);
		dm.incmg_pers_ipadd = Util.getSessionParameterValue(req,"incmg_pers_ipadd",true);
		*******************************************************************************************/
	}
	public void mc_budg_2126_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_BUDG_2126_LDataSet ds = null;
		MC_BUDG_2126_LDM dm = new MC_BUDG_2126_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.from_budg_clas_cd = Util.checkString(req.getParameter("from_budg_clas_cd"));
		dm.to_budg_clas_cd = Util.checkString(req.getParameter("to_budg_clas_cd"));
		dm.evnt_cd = Util.checkString(req.getParameter("evnt_cd"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_BUDG_2126_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_BUDG_2000EJBHome home = (MC_BUDG_2000EJBHome)JNDIManager.getInstance().getHome("MC_BUDG_2000EJB");
			MC_BUDG_2000EJB ejb = home.create();

			ds = ejb.mc_budg_2126_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		EJB 수정전 끝 */

		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.from_budg_clas_cd = (String)hash.get("from_budg_clas_cd");
		dm.to_budg_clas_cd = (String)hash.get("to_budg_clas_cd");
		dm.evnt_cd = (String)hash.get("evnt_cd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.from_budg_clas_cd = Util.getSessionParameterValue(req,"from_budg_clas_cd",true);
		dm.to_budg_clas_cd = Util.getSessionParameterValue(req,"to_budg_clas_cd",true);
		dm.evnt_cd = Util.getSessionParameterValue(req,"evnt_cd",true);
		*******************************************************************************************/
	}
	public void mc_budg_2127_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_BUDG_2127_LDataSet ds = null;
		MC_BUDG_2127_LDM dm = new MC_BUDG_2127_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.budg_yyyy = Util.checkString(req.getParameter("budg_yyyy"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_BUDG_2127_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_BUDG_2000EJBHome home = (MC_BUDG_2000EJBHome)JNDIManager.getInstance().getHome("MC_BUDG_2000EJB");
			MC_BUDG_2000EJB ejb = home.create();

			ds = ejb.mc_budg_2127_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		EJB 수정전 끝 */

		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.budg_yyyy = (String)hash.get("budg_yyyy");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.budg_yyyy = Util.getSessionParameterValue(req,"budg_yyyy",true);
		*******************************************************************************************/
	}	
	public void mc_budg_2240_m(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_BUDG_2240_MDataSet ds = null;
		MC_BUDG_2240_MDM dm = new MC_BUDG_2240_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_BUDG_2240_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_BUDG_2000EJBHome home = (MC_BUDG_2000EJBHome)JNDIManager.getInstance().getHome("MC_BUDG_2000EJB");
			MC_BUDG_2000EJB ejb = home.create();

			ds = ejb.mc_budg_2240_m(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
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
	public void mc_budg_2241_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_BUDG_2241_LDataSet ds = null;
		MC_BUDG_2241_LDM dm = new MC_BUDG_2241_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.yyyy = Util.checkString(req.getParameter("yyyy"));
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.clos_yn = Util.checkString(req.getParameter("clos_yn"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_BUDG_2241_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_BUDG_2000EJBHome home = (MC_BUDG_2000EJBHome)JNDIManager.getInstance().getHome("MC_BUDG_2000EJB");
			MC_BUDG_2000EJB ejb = home.create();

			ds = ejb.mc_budg_2241_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
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
		dm.dept_cd = (String)hash.get("dept_cd");
		dm.clos_yn = (String)hash.get("clos_yn");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.yyyy = Util.getSessionParameterValue(req,"yyyy",true);
		dm.dept_cd = Util.getSessionParameterValue(req,"dept_cd",true);
		dm.clos_yn = Util.getSessionParameterValue(req,"clos_yn",true);
		*******************************************************************************************/
	}
	public void mc_budg_2242_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_BUDG_2242_LDataSet ds = null;
		MC_BUDG_2242_LDM dm = new MC_BUDG_2242_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.yyyy = Util.checkString(req.getParameter("yyyy"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_BUDG_2242_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_BUDG_2000EJBHome home = (MC_BUDG_2000EJBHome)JNDIManager.getInstance().getHome("MC_BUDG_2000EJB");
			MC_BUDG_2000EJB ejb = home.create();

			ds = ejb.mc_budg_2242_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
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
	public void mc_budg_2243_u(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_BUDG_2243_UDataSet ds = null;
		MC_BUDG_2243_UDM dm = new MC_BUDG_2243_UDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.clos_yn = Util.checkString(req.getParameter("clos_yn"));
		dm.yyyy = Util.checkString(req.getParameter("yyyy"));
		dm.incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
		
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);
		
		dm.dept_cd = (String)hash.get("exec_no");
		
		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_BUDG_2243_UDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_BUDG_2000EJBHome home = (MC_BUDG_2000EJBHome)JNDIManager.getInstance().getHome("MC_BUDG_2000EJB");
			MC_BUDG_2000EJB ejb = home.create();

			ds = ejb.mc_budg_2243_u(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		EJB 수정전 끝 */

		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.clos_yn = (String)hash.get("clos_yn");
		dm.yyyy = (String)hash.get("yyyy");
		dm.dept_cd = (String)hash.get("dept_cd");
		dm.incmg_pers = (String)hash.get("incmg_pers");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.clos_yn = Util.getSessionParameterValue(req,"clos_yn",true);
		dm.yyyy = Util.getSessionParameterValue(req,"yyyy",true);
		dm.dept_cd = Util.getSessionParameterValue(req,"dept_cd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"incmg_pers",true);
		*******************************************************************************************/
	}
	

	public void mc_budg_2244_m(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_BUDG_2244_MDataSet ds = null;
		MC_BUDG_2244_MDM dm = new MC_BUDG_2244_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_BUDG_2244_MDataSet)manager.executeCall(dm);

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
	
	public void mc_budg_2251_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_BUDG_2251_LDataSet ds = null;
		MC_BUDG_2251_LDM dm = new MC_BUDG_2251_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.yyyy = Util.checkString(req.getParameter("yyyy"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_BUDG_2251_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_BUDG_2000EJBHome home = (MC_BUDG_2000EJBHome)JNDIManager.getInstance().getHome("MC_BUDG_2000EJB");
			MC_BUDG_2000EJB ejb = home.create();

			ds = ejb.mc_budg_2251_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
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
	public void mc_budg_2252_u(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_BUDG_2252_UDataSet ds = null;
		MC_BUDG_2252_UDM dm = new MC_BUDG_2252_UDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.clos_yn = Util.checkString(req.getParameter("clos_yn"));
		dm.yyyy = Util.checkString(req.getParameter("yyyy"));
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_BUDG_2252_UDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_BUDG_2000EJBHome home = (MC_BUDG_2000EJBHome)JNDIManager.getInstance().getHome("MC_BUDG_2000EJB");
			MC_BUDG_2000EJB ejb = home.create();

			ds = ejb.mc_budg_2252_u(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		EJB 수정전 끝 */

		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.clos_yn = (String)hash.get("clos_yn");
		dm.yyyy = (String)hash.get("yyyy");
		dm.dept_cd = (String)hash.get("dept_cd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.clos_yn = Util.getSessionParameterValue(req,"clos_yn",true);
		dm.yyyy = Util.getSessionParameterValue(req,"yyyy",true);
		dm.dept_cd = Util.getSessionParameterValue(req,"dept_cd",true);
		*******************************************************************************************/
	}
	public void mc_budg_2253_u(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_BUDG_2253_UDataSet ds = null;
		MC_BUDG_2253_UDM dm = new MC_BUDG_2253_UDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.clos_yn = Util.checkString(req.getParameter("clos_yn"));
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.yyyy = Util.checkString(req.getParameter("yyyy"));
		dm.tms = Util.checkString(req.getParameter("tms"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_BUDG_2253_UDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_BUDG_2000EJBHome home = (MC_BUDG_2000EJBHome)JNDIManager.getInstance().getHome("MC_BUDG_2000EJB");
			MC_BUDG_2000EJB ejb = home.create();

			ds = ejb.mc_budg_2253_u(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		EJB 수정전 끝 */

		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.clos_yn = (String)hash.get("clos_yn");
		dm.incmg_pers = (String)hash.get("incmg_pers");
		dm.yyyy = (String)hash.get("yyyy");
		dm.tms = (String)hash.get("tms");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.clos_yn = Util.getSessionParameterValue(req,"clos_yn",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"incmg_pers",true);
		dm.yyyy = Util.getSessionParameterValue(req,"yyyy",true);
		dm.tms = Util.getSessionParameterValue(req,"tms",true);
		*******************************************************************************************/
	}
	public void mc_budg_2254_i(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_BUDG_2254_IDataSet ds = null;
		MC_BUDG_2254_IDM dm = new MC_BUDG_2254_IDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.yyyy = Util.checkString(req.getParameter("yyyy"));
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);
		
		dm.tms = (String)hash.get("exec_no");
		
		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_BUDG_2254_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_BUDG_2000EJBHome home = (MC_BUDG_2000EJBHome)JNDIManager.getInstance().getHome("MC_BUDG_2000EJB");
			MC_BUDG_2000EJB ejb = home.create();

			ds = ejb.mc_budg_2254_i(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
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
		dm.incmg_pers = (String)hash.get("incmg_pers");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.yyyy = Util.getSessionParameterValue(req,"yyyy",true);
		dm.tms = Util.getSessionParameterValue(req,"tms",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"incmg_pers",true);
		*******************************************************************************************/
	}
	public void mc_budg_2255_i(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_BUDG_2255_IDataSet ds = null;
		MC_BUDG_2255_IDM dm = new MC_BUDG_2255_IDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.yyyy = Util.checkString(req.getParameter("yyyy"));
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);
		
		dm.tms = (String)hash.get("exec_no");
		
		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_BUDG_2255_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_BUDG_2000EJBHome home = (MC_BUDG_2000EJBHome)JNDIManager.getInstance().getHome("MC_BUDG_2000EJB");
			MC_BUDG_2000EJB ejb = home.create();

			ds = ejb.mc_budg_2255_i(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
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
		dm.incmg_pers = (String)hash.get("incmg_pers");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.yyyy = Util.getSessionParameterValue(req,"yyyy",true);
		dm.tms = Util.getSessionParameterValue(req,"tms",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"incmg_pers",true);
		*******************************************************************************************/
	}
	public void mc_budg_2256_i(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_BUDG_2256_IDataSet ds = null;
		MC_BUDG_2256_IDM dm = new MC_BUDG_2256_IDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.yyyy = Util.checkString(req.getParameter("yyyy"));
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_BUDG_2256_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_BUDG_2000EJBHome home = (MC_BUDG_2000EJBHome)JNDIManager.getInstance().getHome("MC_BUDG_2000EJB");
			MC_BUDG_2000EJB ejb = home.create();

			ds = ejb.mc_budg_2256_i(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
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
		dm.incmg_pers_ipadd = (String)hash.get("incmg_pers_ipadd");
		dm.incmg_pers = (String)hash.get("incmg_pers");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.yyyy = Util.getSessionParameterValue(req,"yyyy",true);
		dm.incmg_pers_ipadd = Util.getSessionParameterValue(req,"incmg_pers_ipadd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"incmg_pers",true);
		*******************************************************************************************/
	}
	public void mc_budg_2257_d(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_BUDG_2257_DDataSet ds = null;
		MC_BUDG_2257_DDM dm = new MC_BUDG_2257_DDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.yyyy = Util.checkString(req.getParameter("yyyy"));

		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);
		
		dm.tms = (String)hash.get("exec_no");
		
		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_BUDG_2257_DDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_BUDG_2000EJBHome home = (MC_BUDG_2000EJBHome)JNDIManager.getInstance().getHome("MC_BUDG_2000EJB");
			MC_BUDG_2000EJB ejb = home.create();

			ds = ejb.mc_budg_2257_d(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
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
		dm.yyyy = (String)hash.get("yyyy");
		dm.tms = (String)hash.get("tms");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"incmg_pers",true);
		dm.yyyy = Util.getSessionParameterValue(req,"yyyy",true);
		dm.tms = Util.getSessionParameterValue(req,"tms",true);
		*******************************************************************************************/
	}
	public void mc_budg_2258_a(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_BUDG_2258_ADataSet ds = null;
		MC_BUDG_2258_ADM dm = new MC_BUDG_2258_ADM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.yyyy = Util.checkString(req.getParameter("yyyy"));
		dm.tms = Util.checkString(req.getParameter("tms"));
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_BUDG_2258_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_BUDG_2000EJBHome home = (MC_BUDG_2000EJBHome)JNDIManager.getInstance().getHome("MC_BUDG_2000EJB");
			MC_BUDG_2000EJB ejb = home.create();

			ds = ejb.mc_budg_2258_a(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
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
		dm.incmg_pers = (String)hash.get("incmg_pers");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.yyyy = Util.getSessionParameterValue(req,"yyyy",true);
		dm.tms = Util.getSessionParameterValue(req,"tms",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"incmg_pers",true);
		*******************************************************************************************/
	}
	
	public void mc_budg_2259_m(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_BUDG_2259_MDataSet ds = null;
		MC_BUDG_2259_MDM dm = new MC_BUDG_2259_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_BUDG_2259_MDataSet)manager.executeCall(dm);

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
	
	public void mc_budg_2281_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_BUDG_2281_LDataSet ds = null;
		MC_BUDG_2281_LDM dm = new MC_BUDG_2281_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.budg_yy = Util.checkString(req.getParameter("budg_yy"));
		dm.evnt_cd = Util.checkString(req.getParameter("evnt_cd"));
		dm.budg_cd = Util.checkString(req.getParameter("budg_cd"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_BUDG_2281_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_BUDG_2000EJBHome home = (MC_BUDG_2000EJBHome)JNDIManager.getInstance().getHome("MC_BUDG_2000EJB");
			MC_BUDG_2000EJB ejb = home.create();

			ds = ejb.mc_budg_2281_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
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
		dm.evnt_cd = (String)hash.get("evnt_cd");
		dm.budg_cd = (String)hash.get("budg_cd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.budg_yy = Util.getSessionParameterValue(req,"budg_yy",true);
		dm.evnt_cd = Util.getSessionParameterValue(req,"evnt_cd",true);
		dm.budg_cd = Util.getSessionParameterValue(req,"budg_cd",true);
		*******************************************************************************************/
	}
	
	public void mc_budg_2290_m(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_BUDG_2290_MDataSet ds = null;
		MC_BUDG_2290_MDM dm = new MC_BUDG_2290_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_BUDG_2290_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);

	}	
	
	public void mc_budg_2291_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_BUDG_2291_LDataSet ds = null;
		MC_BUDG_2291_LDM dm = new MC_BUDG_2291_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.budg_yymm_fr = Util.checkString(req.getParameter("budg_yymm_fr"));
		dm.budg_yymm_to = Util.checkString(req.getParameter("budg_yymm_to"));
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.in_bulen = Util.checkString(req.getParameter("in_bulen"));
		dm.budg_cd_fr = Util.checkString(req.getParameter("budg_cd_fr"));
		dm.budg_cd_to = Util.checkString(req.getParameter("budg_cd_to"));
		dm.medi_cd = Util.checkString(req.getParameter("medi_cd"));
		dm.dtls_medi_cd = Util.checkString(req.getParameter("dtls_medi_cd"));
		dm.rmks = Util.checkString(req.getParameter("rmks"));
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_BUDG_2291_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);

	}	
	
	public void mc_budg_2162_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_BUDG_2162_LDataSet ds = null;
		MC_BUDG_2162_LDM dm = new MC_BUDG_2162_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.yymm = Util.checkString(req.getParameter("budg_yymm_4"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_BUDG_2162_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_BUDG_2000EJBHome home = (MC_BUDG_2000EJBHome)JNDIManager.getInstance().getHome("MC_BUDG_2000EJB");
			MC_BUDG_2000EJB ejb = home.create();

			ds = ejb.mc_budg_2162_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
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
	public void mc_budg_2076_i(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_BUDG_2076_IDataSet ds = null;
		MC_BUDG_2076_IDM dm = new MC_BUDG_2076_IDM();
		
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.tag = Util.checkString(req.getParameter("tag"));
		dm.budg_yy = Util.checkString(req.getParameter("budg_yy"));
		dm.budg_cd = Util.checkString(req.getParameter("budg_cd"));
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.evnt_cd = Util.checkString(req.getParameter("evnt_cd"));
		dm.work_no = Util.checkString(req.getParameter("work_no"));
		dm.medi_cd = Util.checkString(req.getParameter("medi_cd"));
		dm.dtls_medi_cd = Util.checkString(req.getParameter("dtls_medi_cd"));
		dm.rmks = Util.checkString(req.getParameter("rmks"));
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.chg_pers = Util.checkString(req.getParameter("chg_pers"));
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		
		dm.jobtag = (String)hash.get("jobtag");
		dm.budg_yymm01 = (String)hash.get("budg_yymm01");
		dm.budg_yymm02 = (String)hash.get("budg_yymm02");
		dm.budg_yymm03 = (String)hash.get("budg_yymm03");
		dm.budg_yymm04 = (String)hash.get("budg_yymm04");
		dm.budg_yymm05 = (String)hash.get("budg_yymm05");
		dm.budg_yymm06 = (String)hash.get("budg_yymm06");
		dm.budg_yymm07 = (String)hash.get("budg_yymm07");
		dm.budg_yymm08 = (String)hash.get("budg_yymm08");
		dm.budg_yymm09 = (String)hash.get("budg_yymm09");
		dm.budg_yymm10 = (String)hash.get("budg_yymm10");
		dm.budg_yymm11 = (String)hash.get("budg_yymm11");
		dm.budg_yymm12 = (String)hash.get("budg_yymm12");
		dm.use_dept_cd = (String)hash.get("use_dept_cd");
		dm.seq = (String)hash.get("seq");
		
		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_BUDG_2076_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_BUDG_2000EJBHome home = (MC_BUDG_2000EJBHome)JNDIManager.getInstance().getHome("MC_BUDG_2000EJB");
			MC_BUDG_2000EJB ejb = home.create();

			ds = ejb.mc_budg_2076_i(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		EJB 수정전 끝 */

		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.tag = (String)hash.get("tag");
		dm.jobtag = (String)hash.get("jobtag");
		dm.budg_yy = (String)hash.get("budg_yy");
		dm.budg_yymm01 = (String)hash.get("budg_yymm01");
		dm.budg_yymm02 = (String)hash.get("budg_yymm02");
		dm.budg_yymm03 = (String)hash.get("budg_yymm03");
		dm.budg_yymm04 = (String)hash.get("budg_yymm04");
		dm.budg_yymm05 = (String)hash.get("budg_yymm05");
		dm.budg_yymm06 = (String)hash.get("budg_yymm06");
		dm.budg_yymm07 = (String)hash.get("budg_yymm07");
		dm.budg_yymm08 = (String)hash.get("budg_yymm08");
		dm.budg_yymm09 = (String)hash.get("budg_yymm09");
		dm.budg_yymm10 = (String)hash.get("budg_yymm10");
		dm.budg_yymm11 = (String)hash.get("budg_yymm11");
		dm.budg_yymm12 = (String)hash.get("budg_yymm12");
		dm.use_dept_cd = (String)hash.get("use_dept_cd");
		dm.budg_cd = (String)hash.get("budg_cd");
		dm.dept_cd = (String)hash.get("dept_cd");
		dm.evnt_cd = (String)hash.get("evnt_cd");
		dm.work_no = (String)hash.get("work_no");
		dm.seq = (String)hash.get("seq");
		dm.medi_cd = (String)hash.get("medi_cd");
		dm.rmks = (String)hash.get("rmks");
		dm.incmg_pers = (String)hash.get("incmg_pers");
		dm.chg_pers = (String)hash.get("chg_pers");
		dm.incmg_pers_ipadd = (String)hash.get("incmg_pers_ipadd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.tag = Util.getSessionParameterValue(req,"tag",true);
		dm.jobtag = Util.getSessionParameterValue(req,"jobtag",true);
		dm.budg_yy = Util.getSessionParameterValue(req,"budg_yy",true);
		dm.budg_yymm01 = Util.getSessionParameterValue(req,"budg_yymm01",true);
		dm.budg_yymm02 = Util.getSessionParameterValue(req,"budg_yymm02",true);
		dm.budg_yymm03 = Util.getSessionParameterValue(req,"budg_yymm03",true);
		dm.budg_yymm04 = Util.getSessionParameterValue(req,"budg_yymm04",true);
		dm.budg_yymm05 = Util.getSessionParameterValue(req,"budg_yymm05",true);
		dm.budg_yymm06 = Util.getSessionParameterValue(req,"budg_yymm06",true);
		dm.budg_yymm07 = Util.getSessionParameterValue(req,"budg_yymm07",true);
		dm.budg_yymm08 = Util.getSessionParameterValue(req,"budg_yymm08",true);
		dm.budg_yymm09 = Util.getSessionParameterValue(req,"budg_yymm09",true);
		dm.budg_yymm10 = Util.getSessionParameterValue(req,"budg_yymm10",true);
		dm.budg_yymm11 = Util.getSessionParameterValue(req,"budg_yymm11",true);
		dm.budg_yymm12 = Util.getSessionParameterValue(req,"budg_yymm12",true);
		dm.use_dept_cd = Util.getSessionParameterValue(req,"use_dept_cd",true);
		dm.budg_cd = Util.getSessionParameterValue(req,"budg_cd",true);
		dm.dept_cd = Util.getSessionParameterValue(req,"dept_cd",true);
		dm.evnt_cd = Util.getSessionParameterValue(req,"evnt_cd",true);
		dm.work_no = Util.getSessionParameterValue(req,"work_no",true);
		dm.seq = Util.getSessionParameterValue(req,"seq",true);
		dm.medi_cd = Util.getSessionParameterValue(req,"medi_cd",true);
		dm.rmks = Util.getSessionParameterValue(req,"rmks",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"incmg_pers",true);
		dm.chg_pers = Util.getSessionParameterValue(req,"chg_pers",true);
		dm.incmg_pers_ipadd = Util.getSessionParameterValue(req,"incmg_pers_ipadd",true);
		*******************************************************************************************/
	}
	public void mc_budg_2077_d(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_BUDG_2077_DDataSet ds = null;
		MC_BUDG_2077_DDM dm = new MC_BUDG_2077_DDM();
		
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.del_cnt = Util.checkString(req.getParameter("del_cnt"));
		dm.tag = Util.checkString(req.getParameter("tag"));
		dm.budg_yy = Util.checkString(req.getParameter("budg_yy"));
		dm.budg_cd = Util.checkString(req.getParameter("budg_cd"));
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.evnt_cd = Util.checkString(req.getParameter("evnt_cd"));
		dm.work_no = Util.checkString(req.getParameter("work_no"));
		dm.chg_pers = Util.checkString(req.getParameter("chg_pers"));
		
		dm.seq = (String)hash.get("seq");

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_BUDG_2077_DDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_BUDG_2000EJBHome home = (MC_BUDG_2000EJBHome)JNDIManager.getInstance().getHome("MC_BUDG_2000EJB");
			MC_BUDG_2000EJB ejb = home.create();

			ds = ejb.mc_budg_2077_d(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		EJB 수정전 끝 */

		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.del_cnt = (String)hash.get("del_cnt");
		dm.tag = (String)hash.get("tag");
		dm.budg_yy = (String)hash.get("budg_yy");
		dm.budg_cd = (String)hash.get("budg_cd");
		dm.dept_cd = (String)hash.get("dept_cd");
		dm.evnt_cd = (String)hash.get("evnt_cd");
		dm.work_no = (String)hash.get("work_no");
		dm.seq = (String)hash.get("seq");
		dm.chg_pers = (String)hash.get("chg_pers");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.del_cnt = Util.getSessionParameterValue(req,"del_cnt",true);
		dm.tag = Util.getSessionParameterValue(req,"tag",true);
		dm.budg_yy = Util.getSessionParameterValue(req,"budg_yy",true);
		dm.budg_cd = Util.getSessionParameterValue(req,"budg_cd",true);
		dm.dept_cd = Util.getSessionParameterValue(req,"dept_cd",true);
		dm.evnt_cd = Util.getSessionParameterValue(req,"evnt_cd",true);
		dm.work_no = Util.getSessionParameterValue(req,"work_no",true);
		dm.seq = Util.getSessionParameterValue(req,"seq",true);
		dm.chg_pers = Util.getSessionParameterValue(req,"chg_pers",true);
		*******************************************************************************************/
	}
	public void mc_budg_2061_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_BUDG_2061_LDataSet ds = null;
		MC_BUDG_2061_LDM dm = new MC_BUDG_2061_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_BUDG_2061_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_BUDG_2000EJBHome home = (MC_BUDG_2000EJBHome)JNDIManager.getInstance().getHome("MC_BUDG_2000EJB");
			MC_BUDG_2000EJB ejb = home.create();

			ds = ejb.mc_budg_2061_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
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
	public void mc_budg_2128_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_BUDG_2128_LDataSet ds = null;
		MC_BUDG_2128_LDM dm = new MC_BUDG_2128_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.evnt_cd = Util.checkString(req.getParameter("evnt_cd"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_BUDG_2128_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_BUDG_2000EJBHome home = (MC_BUDG_2000EJBHome)JNDIManager.getInstance().getHome("MC_BUDG_2000EJB");
			MC_BUDG_2000EJB ejb = home.create();

			ds = ejb.mc_budg_2128_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
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
}

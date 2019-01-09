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

import chosun.ciis.fc.func.ds.FC_FUNC_2051_LDataSet;

import chosun.ciis.mc.co.dm.*;
import chosun.ciis.mc.co.ds.*;

public class MC_CO_2000WB extends chosun.ciis.co.base.wb.BaseWB {
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
			MC_CO_2000EJBHome home = (MC_CO_2000EJBHome)JNDIManager.getInstance().getHome("MC_CO_2000EJB");
			MC_CO_2000EJB ejb = home.create();
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
	
	public void mc_co_2070_m(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_CO_2070_MDataSet ds = null;
		MC_CO_2070_MDM dm = new MC_CO_2070_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);

		dm.print();
		
		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_CO_2070_MDataSet)manager.executeCall(dm);

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
	
	public void mc_co_2071_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_CO_2071_LDataSet ds = null;
		MC_CO_2071_LDM dm = new MC_CO_2071_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.budg_type_cd = Util.checkString(req.getParameter("budg_type_cd"));
		dm.from_clas_cd1 = Util.checkString(req.getParameter("from_clas_cd1"));
		dm.to_clas_cd1 = Util.checkString(req.getParameter("to_clas_cd1"));
		dm.from_clas_cd2 = Util.checkString(req.getParameter("from_clas_cd2"));
		dm.to_clas_cd2 = Util.checkString(req.getParameter("to_clas_cd2"));
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.from_budg_cd = Util.checkString(req.getParameter("from_budg_cd"));
		dm.to_budg_cd = Util.checkString(req.getParameter("to_budg_cd"));
		dm.from_work_no = Util.checkString(req.getParameter("from_work_no"));
		dm.to_work_no = Util.checkString(req.getParameter("to_work_no"));
		dm.budg_yyyy = Util.checkString(req.getParameter("budg_yyyy"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_CO_2071_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_CO_2000EJBHome home = (MC_CO_2000EJBHome)JNDIManager.getInstance().getHome("MC_CO_2000EJB");
			MC_CO_2000EJB ejb = home.create();

			ds = ejb.mc_co_2071_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
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
	public void mc_co_2072_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		MC_CO_2072_LDataSet ds = null;
		MC_CO_2072_LDM dm = new MC_CO_2072_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.budg_type_cd = Util.checkString(req.getParameter("budg_type_cd"));
		dm.budg_cd1 = Util.checkString(req.getParameter("budg_cd1"));
		dm.budg_cd2 = Util.checkString(req.getParameter("budg_cd2"));
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.from_work_no = Util.checkString(req.getParameter("from_work_no"));
		dm.to_work_no = Util.checkString(req.getParameter("to_work_no"));
		dm.budg_yyyy = Util.checkString(req.getParameter("budg_yyyy"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (MC_CO_2072_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			MC_CO_2000EJBHome home = (MC_CO_2000EJBHome)JNDIManager.getInstance().getHome("MC_CO_2000EJB");
			MC_CO_2000EJB ejb = home.create();

			ds = ejb.mc_co_2072_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
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

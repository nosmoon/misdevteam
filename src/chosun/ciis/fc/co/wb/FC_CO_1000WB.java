package chosun.ciis.fc.co.wb;

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

import chosun.ciis.fc.co.dm.*;
import chosun.ciis.fc.co.ds.*;
import chosun.ciis.fc.func.ds.FC_FUNC_2051_LDataSet;

public class FC_CO_1000WB extends chosun.ciis.co.base.wb.BaseWB {
	public void getDummyList(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_CO_9999_LDataSet ds = null;
		FC_CO_9999_LDM dm = new FC_CO_9999_LDM();
		
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		
		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_CO_9999_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_CO_1000EJBHome home = (FC_CO_1000EJBHome)JNDIManager.getInstance().getHome("FC_CO_1000EJB"); 
			FC_CO_1000EJB ejb = home.create();
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
	public void fc_co_1001_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_CO_1001_LDataSet ds = null;
		FC_CO_1001_LDM dm = new FC_CO_1001_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.cd = Util.checkString(req.getParameter("cd"));
		dm.cdnm = Util.checkString(req.getParameter("cdnm"));
		
		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_CO_1001_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_CO_1000EJBHome home = (FC_CO_1000EJBHome)JNDIManager.getInstance().getHome("FC_CO_1000EJB");
		
			FC_CO_1000EJB ejb = home.create();
			ds = ejb.fc_co_1001_l(dm);		
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		EJB 수정전 끝 */

		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get(cmpy_cd");
		dm.cd = (String)hash.get(cd");
		dm.cdnm = (String)hash.get(cdnm");
		*******************************************************************************************/
	}
	public void fc_co_1002_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_CO_1002_LDataSet ds = null;
		FC_CO_1002_LDM dm = new FC_CO_1002_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.cd = Util.checkString(req.getParameter("cd"));
		dm.cdnm = Util.checkString(req.getParameter("cdnm"));
		
		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_CO_1002_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_CO_1000EJBHome home = (FC_CO_1000EJBHome)JNDIManager.getInstance().getHome("FC_CO_1000EJB");
			FC_CO_1000EJB ejb = home.create();

			ds = ejb.fc_co_1002_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		EJB 수정전 끝 */

		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get(cmpy_cd");
		dm.cd = (String)hash.get(cd");
		dm.cdnm = (String)hash.get(cdnm");
		*******************************************************************************************/
	}
	public void fc_co_1003_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_CO_1003_LDataSet ds = null;
		FC_CO_1003_LDM dm = new FC_CO_1003_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.cd = Util.checkString(req.getParameter("cd"));
		dm.cdnm = Util.checkString(req.getParameter("cdnm"));
		
		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_CO_1003_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_CO_1000EJBHome home = (FC_CO_1000EJBHome)JNDIManager.getInstance().getHome("FC_CO_1000EJB");
			FC_CO_1000EJB ejb = home.create();

			ds = ejb.fc_co_1003_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		EJB 수정전 끝 */

		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get(cmpy_cd");
		dm.cd = (String)hash.get(cd");
		dm.cdnm = (String)hash.get(cdnm");
		*******************************************************************************************/
	}	
	public void fc_co_1010_m(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_CO_1010_MDataSet ds = null;
		FC_CO_1010_MDM dm = new FC_CO_1010_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		
		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_CO_1010_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_CO_1000EJBHome home = (FC_CO_1000EJBHome)JNDIManager.getInstance().getHome("FC_CO_1000EJB");
			FC_CO_1000EJB ejb = home.create();

			ds = ejb.fc_co_1010_m(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
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
	}
	public void fc_co_1011_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_CO_1011_LDataSet ds = null;
		FC_CO_1011_LDM dm = new FC_CO_1011_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.deps_isav_clsf_cd = Util.checkString(req.getParameter("deps_isav_clsf_cd"));
		dm.deps_isav_stat_cd = Util.checkString(req.getParameter("deps_isav_stat_cd"));
		
		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_CO_1011_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_CO_1000EJBHome home = (FC_CO_1000EJBHome)JNDIManager.getInstance().getHome("FC_CO_1000EJB");
			FC_CO_1000EJB ejb = home.create();

			ds = ejb.fc_co_1011_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		EJB 수정전 끝 */

		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.deps_isav_clsf_cd = (String)hash.get("deps_isav_clsf_cd");
		dm.deps_isav_stat_cd = (String)hash.get("deps_isav_stat_cd");
		*******************************************************************************************/
	}	
	public void fc_co_1020_m(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_CO_1020_MDataSet ds = null;
		FC_CO_1020_MDM dm = new FC_CO_1020_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		
		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_CO_1020_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_CO_1000EJBHome home = (FC_CO_1000EJBHome)JNDIManager.getInstance().getHome("FC_CO_1000EJB");
			FC_CO_1000EJB ejb = home.create();

			ds = ejb.fc_co_1020_m(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
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
	}	
	public void fc_co_1021_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_CO_1021_LDataSet ds = null;
		FC_CO_1021_LDM dm = new FC_CO_1021_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.deps_isav_clsf_cd = Util.checkString(req.getParameter("deps_isav_clsf_cd"));
		dm.deps_isav_stat_cd = Util.checkString(req.getParameter("deps_isav_stat_cd"));
		
		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_CO_1021_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_CO_1000EJBHome home = (FC_CO_1000EJBHome)JNDIManager.getInstance().getHome("FC_CO_1000EJB");
			FC_CO_1000EJB ejb = home.create();

			ds = ejb.fc_co_1021_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		EJB 수정전 끝 */

		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.deps_isav_clsf_cd = (String)hash.get("deps_isav_clsf_cd");
		dm.deps_isav_stat_cd = (String)hash.get("deps_isav_stat_cd");
		*******************************************************************************************/
	}	
	public void fc_co_1030_m(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_CO_1030_MDataSet ds = null;
		FC_CO_1030_MDM dm = new FC_CO_1030_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		
		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_CO_1030_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_CO_1000EJBHome home = (FC_CO_1000EJBHome)JNDIManager.getInstance().getHome("FC_CO_1000EJB");
			FC_CO_1000EJB ejb = home.create();

			ds = ejb.fc_co_1030_m(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
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
	}
	public void fc_co_1031_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_CO_1031_LDataSet ds = null;
		FC_CO_1031_LDM dm = new FC_CO_1031_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.fund_mang_no = Util.checkString(req.getParameter("fund_mang_no"));
		dm.loan_repay_clsf_cd = Util.checkString(req.getParameter("loan_repay_clsf_cd"));
		
		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_CO_1031_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_CO_1000EJBHome home = (FC_CO_1000EJBHome)JNDIManager.getInstance().getHome("FC_CO_1000EJB");
			FC_CO_1000EJB ejb = home.create();

			ds = ejb.fc_co_1031_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
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
	public void fc_co_1040_m(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_CO_1040_MDataSet ds = null;
		FC_CO_1040_MDM dm = new FC_CO_1040_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		
		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_CO_1040_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_CO_1000EJBHome home = (FC_CO_1000EJBHome)JNDIManager.getInstance().getHome("FC_CO_1000EJB");
			FC_CO_1000EJB ejb = home.create();

			ds = ejb.fc_co_1040_m(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
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
	public void fc_co_1041_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_CO_1041_LDataSet ds = null;
		FC_CO_1041_LDM dm = new FC_CO_1041_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.seci_clsf_cd = Util.checkString(req.getParameter("seci_clsf_cd"));
		dm.seci_stat_cd = Util.checkString(req.getParameter("seci_stat_cd"));
		
		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_CO_1041_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_CO_1000EJBHome home = (FC_CO_1000EJBHome)JNDIManager.getInstance().getHome("FC_CO_1000EJB");
			FC_CO_1000EJB ejb = home.create();

			ds = ejb.fc_co_1041_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
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
	public void fc_co_1050_m(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_CO_1050_MDataSet ds = null;
		FC_CO_1050_MDM dm = new FC_CO_1050_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		
		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_CO_1050_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_CO_1000EJBHome home = (FC_CO_1000EJBHome)JNDIManager.getInstance().getHome("FC_CO_1000EJB");
			FC_CO_1000EJB ejb = home.create();

			ds = ejb.fc_co_1050_m(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
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
	public void fc_co_1051_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_CO_1051_LDataSet ds = null;
		FC_CO_1051_LDM dm = new FC_CO_1051_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.insr_clsf_cd = Util.checkString(req.getParameter("insr_clsf_cd"));
		dm.insr_stat_cd = Util.checkString(req.getParameter("insr_stat_cd"));
		
		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_CO_1051_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_CO_1000EJBHome home = (FC_CO_1000EJBHome)JNDIManager.getInstance().getHome("FC_CO_1000EJB");
			FC_CO_1000EJB ejb = home.create();

			ds = ejb.fc_co_1051_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
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
	public void fc_co_1060_m(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_CO_1060_MDataSet ds = null;
		FC_CO_1060_MDM dm = new FC_CO_1060_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		
		dm.print();
		
		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_CO_1060_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_CO_1000EJBHome home = (FC_CO_1000EJBHome)JNDIManager.getInstance().getHome("FC_CO_1000EJB");
			FC_CO_1000EJB ejb = home.create();

			ds = ejb.fc_co_1060_m(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
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
	public void fc_co_1061_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_CO_1061_LDataSet ds = null;
		FC_CO_1061_LDM dm = new FC_CO_1061_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.cntr_clsf_cd = Util.checkString(req.getParameter("cntr_clsf_cd"));
		dm.leas_stat_cd = Util.checkString(req.getParameter("leas_stat_cd"));

		dm.print();
		
		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_CO_1061_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_CO_1000EJBHome home = (FC_CO_1000EJBHome)JNDIManager.getInstance().getHome("FC_CO_1000EJB");
			FC_CO_1000EJB ejb = home.create();

			ds = ejb.fc_co_1061_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
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
	public void fc_co_1101_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_CO_1101_LDataSet ds = null;
		FC_CO_1101_LDM dm = new FC_CO_1101_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.abrv_nm = Util.checkString(req.getParameter("abrv_nm"));
		dm.select_ch = Util.checkString(req.getParameter("select_ch"));
		dm.use_end_dt = Util.checkString(req.getParameter("use_end_dt"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_CO_1101_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_CO_1000EJBHome home = (FC_CO_1000EJBHome)JNDIManager.getInstance().getHome("FC_CO_1000EJB");
			FC_CO_1000EJB ejb = home.create();

			ds = ejb.fc_co_1101_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
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
		dm.select_ch = (String)hash.get("select_ch");
		dm.use_end_dt = (String)hash.get("use_end_dt");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.dept_cd = Util.getSessionParameterValue(req,"dept_cd",true);
		dm.abrv_nm = Util.getSessionParameterValue(req,"abrv_nm",true);
		dm.select_ch = Util.getSessionParameterValue(req,"select_ch",true);
		dm.use_end_dt = Util.getSessionParameterValue(req,"use_end_dt",true);
		*******************************************************************************************/
	}
	public void fc_co_1080_m(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_CO_1080_MDataSet ds = null;
		FC_CO_1080_MDM dm = new FC_CO_1080_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		
		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_CO_1080_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_CO_1000EJBHome home = (FC_CO_1000EJBHome)JNDIManager.getInstance().getHome("FC_CO_1000EJB");
			FC_CO_1000EJB ejb = home.create();

			ds = ejb.fc_co_1010_m(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
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
	}
	public void fc_co_1081_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_CO_1081_LDataSet ds = null;
		FC_CO_1081_LDM dm = new FC_CO_1081_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.deps_isav_clsf_cd = Util.checkString(req.getParameter("deps_isav_clsf_cd"));
		dm.deps_isav_stat_cd = Util.checkString(req.getParameter("deps_isav_stat_cd"));
		
		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_CO_1081_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_CO_1000EJBHome home = (FC_CO_1000EJBHome)JNDIManager.getInstance().getHome("FC_CO_1000EJB");
			FC_CO_1000EJB ejb = home.create();

			ds = ejb.fc_co_1011_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		EJB 수정전 끝 */

		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.deps_isav_clsf_cd = (String)hash.get("deps_isav_clsf_cd");
		dm.deps_isav_stat_cd = (String)hash.get("deps_isav_stat_cd");
		*******************************************************************************************/
	}	
}

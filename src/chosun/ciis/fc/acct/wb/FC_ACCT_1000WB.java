package chosun.ciis.fc.acct.wb;

import java.rmi.*;
import java.util.*;
import java.sql.SQLException;

import javax.ejb.*;
import javax.servlet.http.*;

import somo.framework.db.DBManager;
import somo.framework.expt.*;
import somo.framework.lib.*;
import somo.framework.log.*;
import somo.framework.util.*;

import chosun.ciis.fc.acct.dm.*;
import chosun.ciis.fc.acct.ds.*;

public class FC_ACCT_1000WB extends chosun.ciis.co.base.wb.BaseWB {
	public void getDummyList(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_9999_LDataSet ds = null;
		FC_ACCT_9999_LDM dm = new FC_ACCT_9999_LDM();
		
		dm.cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
		
		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_9999_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작 
		try {
			FC_ACCT_1000EJBHome home = (FC_ACCT_1000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_1000EJB");
			FC_ACCT_1000EJB ejb = home.create();
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
	public void fc_acct_1011_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_1011_LDataSet ds = null;
		FC_ACCT_1011_LDM dm = new FC_ACCT_1011_LDM();
		System.out.println(Util.getSessionParameterValue(req,"cmpycd",true));
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.mang_item_cd = Util.checkString(req.getParameter("mang_item_cd"));

		
		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_1011_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/* EJB 수정전 시작
		try {
			FC_ACCT_1000EJBHome home = (FC_ACCT_1000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_1000EJB");
			FC_ACCT_1000EJB ejb = home.create();

			ds = ejb.fc_acct_1011_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		EJB 수정전 끝 */

		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.mang_item_cd = (String)hash.get("mang_item_cd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.mang_item_cd = Util.getSessionParameterValue(req,"mang_item_cd",true);
		*******************************************************************************************/
	}	
	public void fc_acct_1012_a(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_1012_ADataSet ds = null;
		FC_ACCT_1012_ADM dm = new FC_ACCT_1012_ADM();

		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);
		
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.mode = (String)hash.get("m");
		dm.mang_item_cd = (String)hash.get("mang_item_cd");
		dm.mang_item_cdnm = (String)hash.get("mang_item_cdnm");
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.incmg_pers_ipadd = req.getRemoteAddr();

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_1012_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_ACCT_1000EJBHome home = (FC_ACCT_1000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_1000EJB");
			FC_ACCT_1000EJB ejb = home.create();

			ds = ejb.fc_acct_1012_a(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
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
		dm.mang_item_cd = (String)hash.get("mang_item_cd");
		dm.mang_item_cdnm = (String)hash.get("mang_item_cdnm");
		dm.incmg_pers = (String)hash.get("incmg_pers");
		dm.incmg_pers_ipadd = (String)hash.get("incmg_pers_ipadd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.mode = Util.getSessionParameterValue(req,"mode",true);
		dm.mang_item_cd = Util.getSessionParameterValue(req,"mang_item_cd",true);
		dm.mang_item_cdnm = Util.getSessionParameterValue(req,"mang_item_cdnm",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"incmg_pers",true);
		dm.incmg_pers_ipadd = Util.getSessionParameterValue(req,"incmg_pers_ipadd",true);
		*******************************************************************************************/
	}
	public void fc_acct_1031_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_1031_LDataSet ds = null;
		FC_ACCT_1031_LDM dm = new FC_ACCT_1031_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.acct_cd = Util.checkString(req.getParameter("acct_cd"));
		dm.use_dt = Util.checkString(req.getParameter("use_dt"));
		dm.kind = Util.checkString(req.getParameter("kind"));

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_1031_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */		
		
		/* EJB 수정전 시작
		try {
			FC_ACCT_1000EJBHome home = (FC_ACCT_1000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_1000EJB");
			FC_ACCT_1000EJB ejb = home.create();

			ds = ejb.fc_acct_1031_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		EJB 수정전 끝 */
		
		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.acct_cd = (String)hash.get("acct_cd");
		dm.use_dt = (String)hash.get("use_dt");
		dm.kind = (String)hash.get("kind");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.acct_cd = Util.getSessionParameterValue(req,"acct_cd",true);
		dm.use_dt = Util.getSessionParameterValue(req,"use_dt",true);
		dm.kind = Util.getSessionParameterValue(req,"kind",true);
		*******************************************************************************************/
	}	
	public void fc_acct_1032_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_1032_LDataSet ds = null;
		FC_ACCT_1032_LDM dm = new FC_ACCT_1032_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.acct_cd = Util.checkString(req.getParameter("acct_cd1"));
		dm.use_dt = Util.checkString(req.getParameter("use_dt"));
		dm.kind = Util.checkString(req.getParameter("kind"));
		dm.insd_acct_cd = Util.checkString(req.getParameter("insd_acct_cd"));
		
		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_1032_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작		
		try {
			FC_ACCT_1000EJBHome home = (FC_ACCT_1000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_1000EJB");
			FC_ACCT_1000EJB ejb = home.create();

			ds = ejb.fc_acct_1032_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		EJB 수정전 끝 */
		
		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.acct_cd = (String)hash.get("acct_cd");
		dm.use_dt = (String)hash.get("use_dt");
		dm.kind = (String)hash.get("kind");
		dm.insd_acct_cd = (String)hash.get("insd_acct_cd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.acct_cd = Util.getSessionParameterValue(req,"acct_cd",true);
		dm.use_dt = Util.getSessionParameterValue(req,"use_dt",true);
		dm.kind = Util.getSessionParameterValue(req,"kind",true);
		dm.insd_acct_cd = Util.getSessionParameterValue(req,"insd_acct_cd",true);
		*******************************************************************************************/
	}	
	public void fc_acct_1033_s(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_1033_SDataSet ds = null;
		FC_ACCT_1033_SDM dm = new FC_ACCT_1033_SDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.acct_cd = Util.checkString(req.getParameter("acct_cd"));
		dm.kind = Util.checkString(req.getParameter("kind"));

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_1033_SDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_ACCT_1000EJBHome home = (FC_ACCT_1000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_1000EJB");
			FC_ACCT_1000EJB ejb = home.create();

			ds = ejb.fc_acct_1033_s(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		EJB 수정전 끝 */
		
		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.acct_cd = (String)hash.get("acct_cd");
		dm.kind = (String)hash.get("kind");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.acct_cd = Util.getSessionParameterValue(req,"acct_cd",true);
		dm.kind = Util.getSessionParameterValue(req,"kind",true);
		*******************************************************************************************/
	}
	public void fc_acct_1040_m(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_1040_MDataSet ds = null;
		FC_ACCT_1040_MDM dm = new FC_ACCT_1040_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_1040_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_ACCT_1000EJBHome home = (FC_ACCT_1000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_1000EJB");
			FC_ACCT_1000EJB ejb = home.create();

			ds = ejb.fc_acct_1040_m(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
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
	public void fc_acct_1041_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_1041_LDataSet ds = null;
		FC_ACCT_1041_LDM dm = new FC_ACCT_1041_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.acct_cd = Util.checkString(req.getParameter("acct_cd"));
		dm.use_dt = Util.checkString(req.getParameter("use_dt"));
		dm.kind = Util.checkString(req.getParameter("kind"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_1041_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_ACCT_1000EJBHome home = (FC_ACCT_1000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_1000EJB");
			FC_ACCT_1000EJB ejb = home.create();

			ds = ejb.fc_acct_1041_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		EJB 수정전 끝 */

		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.acct_cd = (String)hash.get("acct_cd");
		dm.use_dt = (String)hash.get("use_dt");
		dm.kind = (String)hash.get("kind");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.acct_cd = Util.getSessionParameterValue(req,"acct_cd",true);
		dm.use_dt = Util.getSessionParameterValue(req,"use_dt",true);
		dm.kind = Util.getSessionParameterValue(req,"kind",true);
		*******************************************************************************************/
	}

	/***************************************************************************************************
	* WB
	***************************************************************************************************/

	public void fc_acct_1042_a(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_1042_ADataSet ds = null;
		FC_ACCT_1042_ADM dm = new FC_ACCT_1042_ADM();

		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);
		
		dm.cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
		dm.proc_cmpy_cd = Util.checkString(req.getParameter("proc_cmpy_cd"));
		dm.kind = Util.checkString(req.getParameter("kind"));
		dm.mode = (String)hash.get("m");
		dm.acct_cd = (String)hash.get("acct_cd");
		dm.acct_subj_nm = (String)hash.get("acct_subj_nm");
		dm.insd_acct_cd = (String)hash.get("insd_acct_cd");		
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.incmg_pers_ipadd = req.getRemoteAddr();

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_1042_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_ACCT_1000EJBHome home = (FC_ACCT_1000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_1000EJB");
			FC_ACCT_1000EJB ejb = home.create();

			ds = ejb.fc_acct_1042_a(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		EJB 수정전 끝 */
		
		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.proc_cmpy_cd = (String)hash.get("proc_cmpy_cd");
		dm.mode = (String)hash.get("mode");
		dm.acct_cd = (String)hash.get("acct_cd");
		dm.acct_subj_nm = (String)hash.get("acct_subj_nm");
		dm.insd_acct_cd = (String)hash.get("insd_acct_cd");
		dm.incmg_pers = (String)hash.get("incmg_pers");
		dm.incmg_pers_ipadd = (String)hash.get("incmg_pers_ipadd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.proc_cmpy_cd = Util.getSessionParameterValue(req,"proc_cmpy_cd",true);
		dm.mode = Util.getSessionParameterValue(req,"mode",true);
		dm.acct_cd = Util.getSessionParameterValue(req,"acct_cd",true);
		dm.acct_subj_nm = Util.getSessionParameterValue(req,"acct_subj_nm",true);
		dm.insd_acct_cd = Util.getSessionParameterValue(req,"insd_acct_cd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"incmg_pers",true);
		dm.incmg_pers_ipadd = Util.getSessionParameterValue(req,"incmg_pers_ipadd",true);
		*******************************************************************************************/
	}

	public void fc_acct_1043_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_1043_LDataSet ds = null;
		FC_ACCT_1043_LDM dm = new FC_ACCT_1043_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_1043_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/* EJB 수정전 시작
		try {
			FC_ACCT_1000EJBHome home = (FC_ACCT_1000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_1000EJB");
			FC_ACCT_1000EJB ejb = home.create();

			ds = ejb.fc_acct_1043_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
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
	public void fc_acct_1044_d(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_1044_DDataSet ds = null;
		FC_ACCT_1044_DDM dm = new FC_ACCT_1044_DDM();

System.out.println("-------------------->");		
Enumeration ab = req.getParameterNames();
while(ab.hasMoreElements()){    	 
	String abs = (String)ab.nextElement();
	System.out.println("--------------------[" + abs + "]");
}	
System.out.println("params count=" + req.getParameterNames());
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.insd_acct_cd = Util.checkString(req.getParameter("insd_acct_cd"));
		dm.use_dt = Util.checkString(req.getParameter("use_dt"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_1044_DDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_ACCT_1000EJBHome home = (FC_ACCT_1000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_1000EJB");
			FC_ACCT_1000EJB ejb = home.create();

			ds = ejb.fc_acct_1044_d(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		EJB 수정전 끝 */

		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.insd_acct_cd = (String)hash.get("insd_acct_cd");
		dm.use_dt = (String)hash.get("use_dt");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.insd_acct_cd = Util.getSessionParameterValue(req,"insd_acct_cd",true);
		dm.use_dt = Util.getSessionParameterValue(req,"use_dt",true);
		*******************************************************************************************/
	}
	public void fc_acct_1045_i(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_1045_IDataSet ds = null;
		FC_ACCT_1045_IDM dm = new FC_ACCT_1045_IDM();

		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);
		
		dm.mode = (String)hash.get("m");
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.insd_acct_cd = Util.checkString(req.getParameter("insd_acct_cd"));
		dm.acct_cd = Util.checkString(req.getParameter("acct_cd"));
		dm.acct_subj_nm = Util.checkString(req.getParameter("acct_subj_nm"));
		dm.slip_incmg_exne = Util.checkString(req.getParameter("slip_incmg_exne"));
		dm.drcr_occr_clsf = Util.checkString(req.getParameter("drcr_occr_clsf"));
		dm.drcr_bal_clsf = Util.checkString(req.getParameter("drcr_bal_clsf"));
		dm.tbs_exne = Util.checkString(req.getParameter("tbs_exne"));
		dm.balsht_exne = Util.checkString(req.getParameter("balsht_exne"));
		dm.pfls_stat_exne = Util.checkString(req.getParameter("pfls_stat_exne"));
		dm.setoff_yn = Util.checkString(req.getParameter("setoff_yn"));
		dm.supr_acct_cd = Util.checkString(req.getParameter("supr_acct_cd"));
		dm.vip_aset_debt_exne = Util.checkString(req.getParameter("vip_aset_debt_exne"));
		dm.acct_levl = Util.checkString(req.getParameter("acct_levl"));
		dm.use_yn = Util.checkString(req.getParameter("use_yn"));
		dm.use_dt = Util.checkString(req.getParameter("use_dt"));
		dm.wste_dt = Util.checkString(req.getParameter("wste_dt"));
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		dm.acct_nm_styl = Util.checkString(req.getParameter("acct_nm_styl"));			
		dm.mang_item_cd = (String)hash.get("mang_item_cd");
		dm.drcr_clsf = (String)hash.get("drcr_clsf");
		dm.mand_reg_yn = (String)hash.get("mand_reg_yn");
		dm.bal_mang_clsf = (String)hash.get("bal_mang_clsf");
		dm.prty_rank = (String)hash.get("prty_rank");
		dm.acct_abrv_nm = Util.checkString(req.getParameter("acct_abrv_nm"));
		dm.mang_item_nm = (String)hash.get("mang_item_nm");
		dm.prty_rank2 = (String)hash.get("prty_rank2");
		
		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_1045_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_ACCT_1000EJBHome home = (FC_ACCT_1000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_1000EJB");
			FC_ACCT_1000EJB ejb = home.create();

			ds = ejb.fc_acct_1045_i(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		EJB 수정전 끝 */
		
		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.mode = (String)hash.get("mode");
		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.insd_acct_cd = (String)hash.get("insd_acct_cd");
		dm.acct_cd = (String)hash.get("acct_cd");
		dm.acct_subj_nm = (String)hash.get("acct_subj_nm");
		dm.slip_incmg_exne = (String)hash.get("slip_incmg_exne");
		dm.drcr_occr_clsf = (String)hash.get("drcr_occr_clsf");
		dm.drcr_bal_clsf = (String)hash.get("drcr_bal_clsf");
		dm.tbs_exne = (String)hash.get("tbs_exne");
		dm.balsht_exne = (String)hash.get("balsht_exne");
		dm.pfls_stat_exne = (String)hash.get("pfls_stat_exne");
		dm.setoff_yn = (String)hash.get("setoff_yn");
		dm.supr_acct_cd = (String)hash.get("supr_acct_cd");
		dm.vip_aset_debt_exne = (String)hash.get("vip_aset_debt_exne");
		dm.acct_levl = (String)hash.get("acct_levl");
		dm.use_yn = (String)hash.get("use_yn");
		dm.use_dt = (String)hash.get("use_dt");
		dm.wste_dt = (String)hash.get("wste_dt");
		dm.incmg_pers = (String)hash.get("incmg_pers");
		dm.incmg_pers_ipadd = (String)hash.get("incmg_pers_ipadd");
		dm.acct_nm_styl = (String)hash.get("acct_nm_styl");
		dm.mang_item_cd = (String)hash.get("mang_item_cd");
		dm.drcr_clsf = (String)hash.get("drcr_clsf");
		dm.mand_reg_yn = (String)hash.get("mand_reg_yn");
		dm.bal_mang_clsf = (String)hash.get("bal_mang_clsf");
		dm.prty_rank = (String)hash.get("prty_rank");
		dm.acct_abrv_nm = (String)hash.get("acct_abrv_nm");
		dm.mang_item_nm = (String)hash.get("mang_item_nm");
		dm.prty_rank2 = (String)hash.get("prty_rank2");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.mode = Util.getSessionParameterValue(req,"mode",true);
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.insd_acct_cd = Util.getSessionParameterValue(req,"insd_acct_cd",true);
		dm.acct_cd = Util.getSessionParameterValue(req,"acct_cd",true);
		dm.acct_subj_nm = Util.getSessionParameterValue(req,"acct_subj_nm",true);
		dm.slip_incmg_exne = Util.getSessionParameterValue(req,"slip_incmg_exne",true);
		dm.drcr_occr_clsf = Util.getSessionParameterValue(req,"drcr_occr_clsf",true);
		dm.drcr_bal_clsf = Util.getSessionParameterValue(req,"drcr_bal_clsf",true);
		dm.tbs_exne = Util.getSessionParameterValue(req,"tbs_exne",true);
		dm.balsht_exne = Util.getSessionParameterValue(req,"balsht_exne",true);
		dm.pfls_stat_exne = Util.getSessionParameterValue(req,"pfls_stat_exne",true);
		dm.setoff_yn = Util.getSessionParameterValue(req,"setoff_yn",true);
		dm.supr_acct_cd = Util.getSessionParameterValue(req,"supr_acct_cd",true);
		dm.vip_aset_debt_exne = Util.getSessionParameterValue(req,"vip_aset_debt_exne",true);
		dm.acct_levl = Util.getSessionParameterValue(req,"acct_levl",true);
		dm.use_yn = Util.getSessionParameterValue(req,"use_yn",true);
		dm.use_dt = Util.getSessionParameterValue(req,"use_dt",true);
		dm.wste_dt = Util.getSessionParameterValue(req,"wste_dt",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"incmg_pers",true);
		dm.incmg_pers_ipadd = Util.getSessionParameterValue(req,"incmg_pers_ipadd",true);
		dm.acct_nm_styl = Util.getSessionParameterValue(req,"acct_nm_styl",true);
		dm.mang_item_cd = Util.getSessionParameterValue(req,"mang_item_cd",true);
		dm.drcr_clsf = Util.getSessionParameterValue(req,"drcr_clsf",true);
		dm.mand_reg_yn = Util.getSessionParameterValue(req,"mand_reg_yn",true);
		dm.bal_mang_clsf = Util.getSessionParameterValue(req,"bal_mang_clsf",true);
		dm.prty_rank = Util.getSessionParameterValue(req,"prty_rank",true);
		dm.acct_abrv_nm = Util.getSessionParameterValue(req,"acct_abrv_nm",true);
		dm.mang_item_nm = Util.getSessionParameterValue(req,"mang_item_nm",true);
		dm.prty_rank2 = Util.getSessionParameterValue(req,"prty_rank2",true);
		*******************************************************************************************/
	}	
	public void fc_acct_1046_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_1046_LDataSet ds = null;
		FC_ACCT_1046_LDM dm = new FC_ACCT_1046_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.insd_acct_cd = Util.checkString(req.getParameter("insd_acct_cd"));
		dm.use_dt = Util.checkString(req.getParameter("use_dt"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_1046_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_ACCT_1000EJBHome home = (FC_ACCT_1000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_1000EJB");
			FC_ACCT_1000EJB ejb = home.create();

			ds = ejb.fc_acct_1046_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		EJB 수정전 끝 */

		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.insd_acct_cd = (String)hash.get("insd_acct_cd");
		dm.use_dt = (String)hash.get("use_dt");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.insd_acct_cd = Util.getSessionParameterValue(req,"insd_acct_cd",true);
		dm.use_dt = Util.getSessionParameterValue(req,"use_dt",true);
		*******************************************************************************************/
	}
	public void fc_acct_1047_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_1047_LDataSet ds = null;
		FC_ACCT_1047_LDM dm = new FC_ACCT_1047_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.insd_acct_cd = Util.checkString(req.getParameter("insd_acct_cd"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_1047_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		/* EJB 수정전 시작
		try {
			FC_ACCT_1000EJBHome home = (FC_ACCT_1000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_1000EJB");
			FC_ACCT_1000EJB ejb = home.create();

			ds = ejb.fc_acct_1047_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		EJB 수정전 끝 */
		
		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.insd_acct_cd = (String)hash.get("insd_acct_cd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.insd_acct_cd = Util.getSessionParameterValue(req,"insd_acct_cd",true);
		*******************************************************************************************/
	}
	public void fc_acct_1048_u(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_1048_UDataSet ds = null;
		FC_ACCT_1048_UDM dm = new FC_ACCT_1048_UDM();

		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);
		
		dm.mode = (String)hash.get("m");
		
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.acct_cd = Util.checkString(req.getParameter("acct_cd"));
		dm.acct_subj_nm = Util.checkString(req.getParameter("acct_subj_nm"));
		dm.acct_abrv_nm = Util.checkString(req.getParameter("acct_abrv_nm"));
		dm.slip_incmg_exne = Util.checkString(req.getParameter("slip_incmg_exne"));
		dm.drcr_occr_clsf = Util.checkString(req.getParameter("drcr_occr_clsf"));
		dm.drcr_bal_clsf = Util.checkString(req.getParameter("drcr_bal_clsf"));
		dm.tbs_exne = Util.checkString(req.getParameter("tbs_exne"));
		dm.balsht_exne = Util.checkString(req.getParameter("balsht_exne"));
		dm.pfls_stat_exne = Util.checkString(req.getParameter("pfls_stat_exne"));
		dm.setoff_yn = Util.checkString(req.getParameter("setoff_yn"));
		dm.supr_acct_cd = Util.checkString(req.getParameter("supr_acct_cd"));
		dm.vip_aset_debt_exne = Util.checkString(req.getParameter("vip_aset_debt_exne"));
		dm.acct_levl = Util.checkString(req.getParameter("acct_levl"));
		dm.use_yn = Util.checkString(req.getParameter("use_yn"));
		dm.use_dt = Util.checkString(req.getParameter("use_dt"));
		dm.wste_dt = Util.checkString(req.getParameter("wste_dt"));
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		dm.acct_nm_styl = Util.checkString(req.getParameter("acct_nm_styl"));
		dm.insd_acct_cd = Util.checkString(req.getParameter("insd_acct_cd"));
		dm.chg_dt = Util.checkString(req.getParameter("chg_dt"));
		
		dm.drcr_clsf = (String)hash.get("drcr_clsf");
		dm.mand_reg_yn = (String)hash.get("mand_reg_yn");
		dm.bal_mang_clsf = (String)hash.get("bal_mang_clsf");
		dm.prty_rank = (String)hash.get("prty_rank");
		dm.mang_item_cd = (String)hash.get("mang_item_cd");
		dm.pch_gwhmnm = (String)hash.get("cdnm");
		dm.mang_item_nm = (String)hash.get("mang_item_nm");
		dm.prty_rank2 = (String)hash.get("prty_rank2");		
		
		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_1048_UDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/* EJB 수정전 시작
		try {
			FC_ACCT_1000EJBHome home = (FC_ACCT_1000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_1000EJB");
			FC_ACCT_1000EJB ejb = home.create();

			ds = ejb.fc_acct_1048_u(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		EJB 수정전 끝 */
		
		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.mode = (String)hash.get("mode");
		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.acct_cd = (String)hash.get("acct_cd");
		dm.acct_subj_nm = (String)hash.get("acct_subj_nm");
		dm.acct_abrv_nm = (String)hash.get("acct_abrv_nm");
		dm.slip_incmg_exne = (String)hash.get("slip_incmg_exne");
		dm.drcr_occr_clsf = (String)hash.get("drcr_occr_clsf");
		dm.drcr_bal_clsf = (String)hash.get("drcr_bal_clsf");
		dm.tbs_exne = (String)hash.get("tbs_exne");
		dm.balsht_exne = (String)hash.get("balsht_exne");
		dm.pfls_stat_exne = (String)hash.get("pfls_stat_exne");
		dm.setoff_yn = (String)hash.get("setoff_yn");
		dm.supr_acct_cd = (String)hash.get("supr_acct_cd");
		dm.vip_aset_debt_exne = (String)hash.get("vip_aset_debt_exne");
		dm.acct_levl = (String)hash.get("acct_levl");
		dm.use_yn = (String)hash.get("use_yn");
		dm.use_dt = (String)hash.get("use_dt");
		dm.wste_dt = (String)hash.get("wste_dt");
		dm.incmg_pers = (String)hash.get("incmg_pers");
		dm.incmg_pers_ipadd = (String)hash.get("incmg_pers_ipadd");
		dm.acct_nm_styl = (String)hash.get("acct_nm_styl");
		dm.insd_acct_cd = (String)hash.get("insd_acct_cd");
		dm.chg_dt = (String)hash.get("chg_dt");
		dm.drcr_clsf = (String)hash.get("drcr_clsf");
		dm.mand_reg_yn = (String)hash.get("mand_reg_yn");
		dm.bal_mang_clsf = (String)hash.get("bal_mang_clsf");
		dm.prty_rank = (String)hash.get("prty_rank");
		dm.mang_item_cd = (String)hash.get("mang_item_cd");
		dm.pch_gwhmnm = (String)hash.get("pch_gwhmnm");
		dm.mang_item_nm = (String)hash.get("mang_item_nm");
		dm.prty_rank2 = (String)hash.get("prty_rank2");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.mode = Util.getSessionParameterValue(req,"mode",true);
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.acct_cd = Util.getSessionParameterValue(req,"acct_cd",true);
		dm.acct_subj_nm = Util.getSessionParameterValue(req,"acct_subj_nm",true);
		dm.acct_abrv_nm = Util.getSessionParameterValue(req,"acct_abrv_nm",true);
		dm.slip_incmg_exne = Util.getSessionParameterValue(req,"slip_incmg_exne",true);
		dm.drcr_occr_clsf = Util.getSessionParameterValue(req,"drcr_occr_clsf",true);
		dm.drcr_bal_clsf = Util.getSessionParameterValue(req,"drcr_bal_clsf",true);
		dm.tbs_exne = Util.getSessionParameterValue(req,"tbs_exne",true);
		dm.balsht_exne = Util.getSessionParameterValue(req,"balsht_exne",true);
		dm.pfls_stat_exne = Util.getSessionParameterValue(req,"pfls_stat_exne",true);
		dm.setoff_yn = Util.getSessionParameterValue(req,"setoff_yn",true);
		dm.supr_acct_cd = Util.getSessionParameterValue(req,"supr_acct_cd",true);
		dm.vip_aset_debt_exne = Util.getSessionParameterValue(req,"vip_aset_debt_exne",true);
		dm.acct_levl = Util.getSessionParameterValue(req,"acct_levl",true);
		dm.use_yn = Util.getSessionParameterValue(req,"use_yn",true);
		dm.use_dt = Util.getSessionParameterValue(req,"use_dt",true);
		dm.wste_dt = Util.getSessionParameterValue(req,"wste_dt",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"incmg_pers",true);
		dm.incmg_pers_ipadd = Util.getSessionParameterValue(req,"incmg_pers_ipadd",true);
		dm.acct_nm_styl = Util.getSessionParameterValue(req,"acct_nm_styl",true);
		dm.insd_acct_cd = Util.getSessionParameterValue(req,"insd_acct_cd",true);
		dm.chg_dt = Util.getSessionParameterValue(req,"chg_dt",true);
		dm.drcr_clsf = Util.getSessionParameterValue(req,"drcr_clsf",true);
		dm.mand_reg_yn = Util.getSessionParameterValue(req,"mand_reg_yn",true);
		dm.bal_mang_clsf = Util.getSessionParameterValue(req,"bal_mang_clsf",true);
		dm.prty_rank = Util.getSessionParameterValue(req,"prty_rank",true);
		dm.mang_item_cd = Util.getSessionParameterValue(req,"mang_item_cd",true);
		dm.pch_gwhmnm = Util.getSessionParameterValue(req,"pch_gwhmnm",true);
		dm.mang_item_nm = Util.getSessionParameterValue(req,"mang_item_nm",true);
		dm.prty_rank2 = Util.getSessionParameterValue(req,"prty_rank2",true);
		*******************************************************************************************/
	}	
	public void fc_acct_1049_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_1049_LDataSet ds = null;
		FC_ACCT_1049_LDM dm = new FC_ACCT_1049_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.acct_cd = Util.checkString(req.getParameter("acct_cd"));
		dm.use_dt = Util.checkString(req.getParameter("use_dt"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_1049_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/* EJB 수정전 시작		
		try {
			FC_ACCT_1000EJBHome home = (FC_ACCT_1000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_1000EJB");
			FC_ACCT_1000EJB ejb = home.create();

			ds = ejb.fc_acct_1049_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		EJB 수정전 끝 */		

		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.insd_acct_cd = (String)hash.get("insd_acct_cd");
		dm.use_dt = (String)hash.get("use_dt");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.insd_acct_cd = Util.getSessionParameterValue(req,"insd_acct_cd",true);
		dm.use_dt = Util.getSessionParameterValue(req,"use_dt",true);
		*******************************************************************************************/
	}
	public void fc_acct_1050_m(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_1050_MDataSet ds = null;
		FC_ACCT_1050_MDM dm = new FC_ACCT_1050_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.print();
		
		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_1050_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/* EJB 수정전 시작
		try {
			FC_ACCT_1000EJBHome home = (FC_ACCT_1000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_1000EJB");
			FC_ACCT_1000EJB ejb = home.create();

			ds = ejb.fc_acct_1051_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		EJB 수정전 끝 */		

		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.job_clsf = (String)hash.get("job_clsf");
		dm.cd_clsf = (String)hash.get("cd_clsf");
		dm.cd = (String)hash.get("cd");
		dm.cd_abrv_nm = (String)hash.get("cd_abrv_nm");
		dm.mang_cd_3 = (String)hash.get("mang_cd_3");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.job_clsf = Util.getSessionParameterValue(req,"job_clsf",true);
		dm.cd_clsf = Util.getSessionParameterValue(req,"cd_clsf",true);
		dm.cd = Util.getSessionParameterValue(req,"cd",true);
		dm.cd_abrv_nm = Util.getSessionParameterValue(req,"cd_abrv_nm",true);
		dm.mang_cd_3 = Util.getSessionParameterValue(req,"mang_cd_3",true);
		*******************************************************************************************/
	}
	public void fc_acct_1051_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_1051_LDataSet ds = null;
		FC_ACCT_1051_LDM dm = new FC_ACCT_1051_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.job_clsf = Util.checkString(req.getParameter("job_clsf"));
		dm.cd_clsf = Util.checkString(req.getParameter("cd_clsf"));
		dm.cd = Util.checkString(req.getParameter("cd"));
		dm.cd_abrv_nm = Util.checkString(req.getParameter("cd_abrv_nm"));
		dm.mang_cd_3 = Util.checkString(req.getParameter("mang_cd_3"));
		dm.print();
		
		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_1051_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/* EJB 수정전 시작
		try {
			FC_ACCT_1000EJBHome home = (FC_ACCT_1000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_1000EJB");
			FC_ACCT_1000EJB ejb = home.create();

			ds = ejb.fc_acct_1051_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		EJB 수정전 끝 */		

		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.job_clsf = (String)hash.get("job_clsf");
		dm.cd_clsf = (String)hash.get("cd_clsf");
		dm.cd = (String)hash.get("cd");
		dm.cd_abrv_nm = (String)hash.get("cd_abrv_nm");
		dm.mang_cd_3 = (String)hash.get("mang_cd_3");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.job_clsf = Util.getSessionParameterValue(req,"job_clsf",true);
		dm.cd_clsf = Util.getSessionParameterValue(req,"cd_clsf",true);
		dm.cd = Util.getSessionParameterValue(req,"cd",true);
		dm.cd_abrv_nm = Util.getSessionParameterValue(req,"cd_abrv_nm",true);
		dm.mang_cd_3 = Util.getSessionParameterValue(req,"mang_cd_3",true);
		*******************************************************************************************/
	}
	public void fc_acct_1052_a(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_1052_ADataSet ds = null;
		FC_ACCT_1052_ADM dm = new FC_ACCT_1052_ADM();

		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);
		
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);		
		dm.incmg_pers_ip = req.getRemoteAddr();		
		dm.mode = (String)hash.get("m");
		dm.cd = (String)hash.get("cd");
		dm.cdnm = (String)hash.get("cdnm");
		dm.remk = (String)hash.get("remk");
		dm.cd_abrv_nm = (String)hash.get("cd_abrv_nm");
		dm.mang_cd_1 = (String)hash.get("mang_cd_1");
		dm.mang_cd_2 = (String)hash.get("mang_cd_2");
		dm.use_yn = (String)hash.get("use_yn");
		dm.mang_cd_3 = (String)hash.get("mang_cd_3");		
		
		dm.print();
		
		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_1052_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/* EJB 수정전 시작
		try {
			FC_ACCT_1000EJBHome home = (FC_ACCT_1000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_1000EJB");
			FC_ACCT_1000EJB ejb = home.create();

			ds = ejb.fc_acct_1052_a(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
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
		dm.incmg_pers_ip = (String)hash.get("incmg_pers_ip");
		dm.mode = (String)hash.get("mode");
		dm.cd = (String)hash.get("cd");
		dm.cdnm = (String)hash.get("cdnm");
		dm.remk = (String)hash.get("remk");
		dm.cd_abrv_nm = (String)hash.get("cd_abrv_nm");
		dm.mang_cd_1 = (String)hash.get("mang_cd_1");
		dm.mang_cd_2 = (String)hash.get("mang_cd_2");
		dm.use_yn = (String)hash.get("use_yn");
		dm.mang_cd_3 = (String)hash.get("mang_cd_3");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"incmg_pers",true);
		dm.incmg_pers_ip = Util.getSessionParameterValue(req,"incmg_pers_ip",true);
		dm.mode = Util.getSessionParameterValue(req,"mode",true);
		dm.cd = Util.getSessionParameterValue(req,"cd",true);
		dm.cdnm = Util.getSessionParameterValue(req,"cdnm",true);
		dm.remk = Util.getSessionParameterValue(req,"remk",true);
		dm.cd_abrv_nm = Util.getSessionParameterValue(req,"cd_abrv_nm",true);
		dm.mang_cd_1 = Util.getSessionParameterValue(req,"mang_cd_1",true);
		dm.mang_cd_2 = Util.getSessionParameterValue(req,"mang_cd_2",true);
		dm.use_yn = Util.getSessionParameterValue(req,"use_yn",true);
		dm.mang_cd_3 = Util.getSessionParameterValue(req,"mang_cd_3",true);
		*******************************************************************************************/
	}	
	public void fc_acct_1053_s(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_1053_SDataSet ds = null;
		FC_ACCT_1053_SDM dm = new FC_ACCT_1053_SDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.mang_cd_2 = Util.checkString(req.getParameter("mang_cd_2"));

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_1053_SDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/* EJB 수정전 시작
		try {
			FC_ACCT_1000EJBHome home = (FC_ACCT_1000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_1000EJB");
			FC_ACCT_1000EJB ejb = home.create();

			ds = ejb.fc_acct_1053_s(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		EJB 수정전 끝 */

		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.mang_cd_2 = (String)hash.get("mang_cd_2");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.mang_cd_2 = Util.getSessionParameterValue(req,"mang_cd_2",true);
		*******************************************************************************************/
	}
	public void fc_acct_1060_m(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_1060_MDataSet ds = null;
		FC_ACCT_1060_MDM dm = new FC_ACCT_1060_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_1060_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/* EJB 수정전 시작
		try {
			FC_ACCT_1000EJBHome home = (FC_ACCT_1000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_1000EJB");
			FC_ACCT_1000EJB ejb = home.create();

			ds = ejb.fc_acct_1060_m(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
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
	public void fc_acct_1061_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_1061_LDataSet ds = null;
		FC_ACCT_1061_LDM dm = new FC_ACCT_1061_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.job_clsf = Util.checkString(req.getParameter("job_clsf"));
		dm.cd_clsf = Util.checkString(req.getParameter("cd_clsf"));
		dm.cd = Util.checkString(req.getParameter("cd"));

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_1061_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/* EJB 수정전 시작
		try {
			FC_ACCT_1000EJBHome home = (FC_ACCT_1000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_1000EJB");
			FC_ACCT_1000EJB ejb = home.create();

			ds = ejb.fc_acct_1061_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		EJB 수정전 끝 */
		
		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.job_clsf = (String)hash.get("job_clsf");
		dm.cd_clsf = (String)hash.get("cd_clsf");
		dm.cd = (String)hash.get("cd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.job_clsf = Util.getSessionParameterValue(req,"job_clsf",true);
		dm.cd_clsf = Util.getSessionParameterValue(req,"cd_clsf",true);
		dm.cd = Util.getSessionParameterValue(req,"cd",true);
		*******************************************************************************************/
	}
	public void fc_acct_1062_a(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_1062_ADataSet ds = null;
		FC_ACCT_1062_ADM dm = new FC_ACCT_1062_ADM();

		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);
		
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);		
		dm.incmg_pers_ip = req.getRemoteAddr();
		
		dm.mode = (String)hash.get("m");
		dm.cd = (String)hash.get("cd");
		dm.cdnm = (String)hash.get("cdnm");
		dm.remk = (String)hash.get("remk");
		dm.cd_abrv_nm = (String)hash.get("cd_abrv_nm");
		dm.use_yn = (String)hash.get("use_yn");
		dm.mang_cd_3 = (String)hash.get("mang_cd_3");

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_1062_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/* EJB 수정전 시작
		try {
			FC_ACCT_1000EJBHome home = (FC_ACCT_1000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_1000EJB");
			FC_ACCT_1000EJB ejb = home.create();

			ds = ejb.fc_acct_1062_a(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
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
		dm.incmg_pers_ip = (String)hash.get("incmg_pers_ip");
		dm.mode = (String)hash.get("mode");
		dm.cd = (String)hash.get("cd");
		dm.cdnm = (String)hash.get("cdnm");
		dm.remk = (String)hash.get("remk");
		dm.cd_abrv_nm = (String)hash.get("cd_abrv_nm");
		dm.use_yn = (String)hash.get("use_yn");
		dm.mang_cd_3 = (String)hash.get("mang_cd_3");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"incmg_pers",true);
		dm.incmg_pers_ip = Util.getSessionParameterValue(req,"incmg_pers_ip",true);
		dm.mode = Util.getSessionParameterValue(req,"mode",true);
		dm.cd = Util.getSessionParameterValue(req,"cd",true);
		dm.cdnm = Util.getSessionParameterValue(req,"cdnm",true);
		dm.remk = Util.getSessionParameterValue(req,"remk",true);
		dm.cd_abrv_nm = Util.getSessionParameterValue(req,"cd_abrv_nm",true);
		dm.use_yn = Util.getSessionParameterValue(req,"use_yn",true);
		dm.mang_cd_3 = Util.getSessionParameterValue(req,"mang_cd_3",true);
		*******************************************************************************************/
	}

	public void fc_acct_1071_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_1071_LDataSet ds = null;
		FC_ACCT_1071_LDM dm = new FC_ACCT_1071_LDM();
		
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.cccodeval = Util.checkString(req.getParameter("cccodeval"));
		dm.cccdynm = Util.checkString(req.getParameter("cccdynm"));
		
		dm.print();
		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_1071_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/* EJB 수정전 시작
		try {
			FC_ACCT_1000EJBHome home = (FC_ACCT_1000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_1000EJB");
			FC_ACCT_1000EJB ejb = home.create();

			ds = ejb.fc_acct_1071_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		EJB 수정전 끝 */
		
		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cccodeval = (String)hash.get("cccodeval");
		dm.cccdynm = (String)hash.get("cccdynm");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cccodeval = Util.getSessionParameterValue(req,"cccodeval",true);
		dm.cccdynm = Util.getSessionParameterValue(req,"cccdynm",true);
		*******************************************************************************************/
	}
	
	public void fc_acct_1081_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_1081_LDataSet ds = null;
		FC_ACCT_1081_LDM dm = new FC_ACCT_1081_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.cd = Util.checkString(req.getParameter("cd"));
		dm.cdnm = Util.checkString(req.getParameter("cdnm"));

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_1081_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/* EJB 수정전 시작
		try {
			FC_ACCT_1000EJBHome home = (FC_ACCT_1000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_1000EJB");
			FC_ACCT_1000EJB ejb = home.create();

			ds = ejb.fc_acct_1081_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
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
	public void fc_acct_1090_m(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_1090_MDataSet ds = null;
		FC_ACCT_1090_MDM dm = new FC_ACCT_1090_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);

		dm.print();
		
		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_1090_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/* EJB 수정전 시작
		try {
			FC_ACCT_1000EJBHome home = (FC_ACCT_1000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_1000EJB");
			FC_ACCT_1000EJB ejb = home.create();

			ds = ejb.fc_acct_1090_m(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
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
	public void fc_acct_1091_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_1091_LDataSet ds = null;
		FC_ACCT_1091_LDM dm = new FC_ACCT_1091_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.dlco_clsf_cd = Util.checkString(req.getParameter("dlco_clsf_cd"));
		dm.dlco_cd = Util.checkString(req.getParameter("dlco_cd"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_1091_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/* EJB 수정전 시작
		try {
			FC_ACCT_1000EJBHome home = (FC_ACCT_1000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_1000EJB");
			FC_ACCT_1000EJB ejb = home.create();

			ds = ejb.fc_acct_1091_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		EJB 수정전 끝 */
		
		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.dlco_clsf_cd = (String)hash.get("dlco_clsf_cd");
		dm.dlco_cd = (String)hash.get("dlco_cd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.dlco_clsf_cd = Util.getSessionParameterValue(req,"dlco_clsf_cd",true);
		dm.dlco_cd = Util.getSessionParameterValue(req,"dlco_cd",true);
		*******************************************************************************************/
	}
	public void fc_acct_1092_d(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_1092_DDataSet ds = null;
		FC_ACCT_1092_DDM dm = new FC_ACCT_1092_DDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.dlco_clsf_cd = Util.checkString(req.getParameter("dlco_clsf_cd"));
		dm.dlco_cd = Util.checkString(req.getParameter("dlco_cd"));

		dm.print();
		
		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_1092_DDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/* EJB 수정전 시작
		try {
			FC_ACCT_1000EJBHome home = (FC_ACCT_1000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_1000EJB");
			FC_ACCT_1000EJB ejb = home.create();

			ds = ejb.fc_acct_1092_d(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		EJB 수정전 끝 */

		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.dlco_clsf_cd = (String)hash.get("dlco_clsf_cd");
		dm.dlco_cd = (String)hash.get("dlco_cd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.dlco_clsf_cd = Util.getSessionParameterValue(req,"dlco_clsf_cd",true);
		dm.dlco_cd = Util.getSessionParameterValue(req,"dlco_cd",true);
		*******************************************************************************************/
	}
	public void fc_acct_1093_i(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_1093_IDataSet ds = null;
		FC_ACCT_1093_IDM dm = new FC_ACCT_1093_IDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.dlco_clsf_cd = Util.checkString(req.getParameter("dlco_clsf_cd"));
		dm.dlco_cd = Util.checkString(req.getParameter("dlco_cd"));
		dm.seq = Util.checkString(req.getParameter("seq"));
		
		dm.pay_amt_llmt = Util.unFormatLong(req.getParameter("pay_amt_llmt"));
		dm.pay_amt_hlmt = Util.unFormatLong(req.getParameter("pay_amt_hlmt"));
		dm.mtrymm_llmt = Util.unFormatLong(req.getParameter("mtrymm_llmt"));
		dm.mtrymm_hlmt = Util.unFormatLong(req.getParameter("mtrymm_hlmt"));
		dm.mtrydd_llmt = Util.unFormatLong(req.getParameter("mtrydd_llmt"));
		dm.mtrydd_hlmt = Util.unFormatLong(req.getParameter("mtrydd_hlmt"));
		dm.note_amt_llmt = Util.unFormatLong(req.getParameter("note_amt_llmt"));
		dm.note_amt_hlmt = Util.unFormatLong(req.getParameter("note_amt_hlmt"));
		dm.rem_cash_hlmt = Util.unFormatLong(req.getParameter("rem_cash_hlmt"));
		dm.chg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		dm.lump_setoff_excl_yn = Util.unFormatLong(req.getParameter("lump_setoff_excl_yn"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_1093_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/* EJB 수정전 시작
		try {
			FC_ACCT_1000EJBHome home = (FC_ACCT_1000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_1000EJB");
			FC_ACCT_1000EJB ejb = home.create();

			ds = ejb.fc_acct_1093_i(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		EJB 수정전 끝 */
		
		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.dlco_clsf_cd = (String)hash.get("dlco_clsf_cd");
		dm.dlco_cd = (String)hash.get("dlco_cd");
		dm.seq = (String)hash.get("seq");
		dm.pay_amt_llmt = (String)hash.get("pay_amt_llmt");
		dm.pay_amt_hlmt = (String)hash.get("pay_amt_hlmt");
		dm.mtrymm_llmt = (String)hash.get("mtrymm_llmt");
		dm.mtrymm_hlmt = (String)hash.get("mtrymm_hlmt");
		dm.mtrydd_llmt = (String)hash.get("mtrydd_llmt");
		dm.mtrydd_hlmt = (String)hash.get("mtrydd_hlmt");
		dm.note_amt_llmt = (String)hash.get("note_amt_llmt");
		dm.note_amt_hlmt = (String)hash.get("note_amt_hlmt");
		dm.rem_cash_hlmt = (String)hash.get("rem_cash_hlmt");
		dm.chg_pers = (String)hash.get("chg_pers");
		dm.incmg_pers_ipadd = (String)hash.get("incmg_pers_ipadd");
		dm.lump_setoff_excl_yn = (String)hash.get("lump_setoff_excl_yn");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.dlco_clsf_cd = Util.getSessionParameterValue(req,"dlco_clsf_cd",true);
		dm.dlco_cd = Util.getSessionParameterValue(req,"dlco_cd",true);
		dm.seq = Util.getSessionParameterValue(req,"seq",true);
		dm.pay_amt_llmt = Util.getSessionParameterValue(req,"pay_amt_llmt",true);
		dm.pay_amt_hlmt = Util.getSessionParameterValue(req,"pay_amt_hlmt",true);
		dm.mtrymm_llmt = Util.getSessionParameterValue(req,"mtrymm_llmt",true);
		dm.mtrymm_hlmt = Util.getSessionParameterValue(req,"mtrymm_hlmt",true);
		dm.mtrydd_llmt = Util.getSessionParameterValue(req,"mtrydd_llmt",true);
		dm.mtrydd_hlmt = Util.getSessionParameterValue(req,"mtrydd_hlmt",true);
		dm.note_amt_llmt = Util.getSessionParameterValue(req,"note_amt_llmt",true);
		dm.note_amt_hlmt = Util.getSessionParameterValue(req,"note_amt_hlmt",true);
		dm.rem_cash_hlmt = Util.getSessionParameterValue(req,"rem_cash_hlmt",true);
		dm.chg_pers = Util.getSessionParameterValue(req,"chg_pers",true);
		dm.incmg_pers_ipadd = Util.getSessionParameterValue(req,"incmg_pers_ipadd",true);
		dm.lump_setoff_excl_yn = Util.getSessionParameterValue(req,"lump_setoff_excl_yn",true);
		*******************************************************************************************/
	}
	public void fc_acct_1100_m(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_1100_MDataSet ds = null;
		FC_ACCT_1100_MDM dm = new FC_ACCT_1100_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_1100_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/* EJB 수정전 시작
		try {
			FC_ACCT_1000EJBHome home = (FC_ACCT_1000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_1000EJB");
			FC_ACCT_1000EJB ejb = home.create();

			ds = ejb.fc_acct_1100_m(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
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
	public void fc_acct_1101_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_1101_LDataSet ds = null;
		FC_ACCT_1101_LDM dm = new FC_ACCT_1101_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.dlco_clsf_cd = Util.checkString(req.getParameter("dlco_clsf_cd"));
		dm.dlco_cd = Util.checkString(req.getParameter("dlco_cd"));

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_1101_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/* EJB 수정전 시작
		try {
			FC_ACCT_1000EJBHome home = (FC_ACCT_1000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_1000EJB");
			FC_ACCT_1000EJB ejb = home.create();

			ds = ejb.fc_acct_1101_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		EJB 수정전 끝 */
		
		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.dlco_clsf_cd = (String)hash.get("dlco_clsf_cd");
		dm.dlco_cd = (String)hash.get("dlco_cd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.dlco_clsf_cd = Util.getSessionParameterValue(req,"dlco_clsf_cd",true);
		dm.dlco_cd = Util.getSessionParameterValue(req,"dlco_cd",true);
		*******************************************************************************************/
	}
	public void fc_acct_1111_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_1111_LDataSet ds = null;
		FC_ACCT_1111_LDM dm = new FC_ACCT_1111_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.busn_yymm = Util.checkString(req.getParameter("busn_yymm"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_1111_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/* EJB 수정전 시작
		try {
			FC_ACCT_1000EJBHome home = (FC_ACCT_1000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_1000EJB");
			FC_ACCT_1000EJB ejb = home.create();

			ds = ejb.fc_acct_1111_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		EJB 수정전 끝 */
		
		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.busn_yymm = (String)hash.get("busn_yymm");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.busn_yymm = Util.getSessionParameterValue(req,"busn_yymm",true);
		*******************************************************************************************/
	}
	public void fc_acct_1112_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_1112_LDataSet ds = null;
		FC_ACCT_1112_LDM dm = new FC_ACCT_1112_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.busn_yymm = Util.checkString(req.getParameter("busn_yymm"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_1112_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/* EJB 수정전 시작
		try {
			FC_ACCT_1000EJBHome home = (FC_ACCT_1000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_1000EJB");
			FC_ACCT_1000EJB ejb = home.create();

			ds = ejb.fc_acct_1112_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		EJB 수정전 끝 */

		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.busn_yymm = (String)hash.get("busn_yymm");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.busn_yymm = Util.getSessionParameterValue(req,"busn_yymm",true);
		*******************************************************************************************/
	}
	public void fc_acct_1113_d(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_1113_DDataSet ds = null;
		FC_ACCT_1113_DDM dm = new FC_ACCT_1113_DDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.busn_yymm = Util.checkString(req.getParameter("busn_yymm"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_1113_DDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/* EJB 수정전 시작
		try {
			FC_ACCT_1000EJBHome home = (FC_ACCT_1000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_1000EJB");
			FC_ACCT_1000EJB ejb = home.create();

			ds = ejb.fc_acct_1113_d(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		EJB 수정전 끝 */

		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.busn_yymm = (String)hash.get("busn_yymm");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.busn_yymm = Util.getSessionParameterValue(req,"busn_yymm",true);
		*******************************************************************************************/
	}
	public void fc_acct_1114_i(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_1114_IDataSet ds = null;
		FC_ACCT_1114_IDM dm = new FC_ACCT_1114_IDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.busn_yymm = Util.checkString(req.getParameter("busn_yymm"));
		dm.busn_dt = Util.checkString(req.getParameter("busn_dt"));
		dm.busn_dd_clsf_cd = Util.checkString(req.getParameter("busn_dd_clsf_cd"));
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_1114_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/* EJB 수정전 시작
		try {
			FC_ACCT_1000EJBHome home = (FC_ACCT_1000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_1000EJB");
			FC_ACCT_1000EJB ejb = home.create();

			ds = ejb.fc_acct_1114_i(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		EJB 수정전 끝 */
		
		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.busn_yymm = (String)hash.get("busn_yymm");
		dm.busn_dt = (String)hash.get("busn_dt");
		dm.busn_dd_clsf_cd = (String)hash.get("busn_dd_clsf_cd");
		dm.incmg_pers_ipadd = (String)hash.get("incmg_pers_ipadd");
		dm.incmg_pers = (String)hash.get("incmg_pers");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.busn_yymm = Util.getSessionParameterValue(req,"busn_yymm",true);
		dm.busn_dt = Util.getSessionParameterValue(req,"busn_dt",true);
		dm.busn_dd_clsf_cd = Util.getSessionParameterValue(req,"busn_dd_clsf_cd",true);
		dm.incmg_pers_ipadd = Util.getSessionParameterValue(req,"incmg_pers_ipadd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"incmg_pers",true);
		*******************************************************************************************/
	}
	public void fc_acct_1115_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_1115_LDataSet ds = null;
		FC_ACCT_1115_LDM dm = new FC_ACCT_1115_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.busn_yymm = Util.checkString(req.getParameter("busn_yymm"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_1115_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/* EJB 수정전 시작
		try {
			FC_ACCT_1000EJBHome home = (FC_ACCT_1000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_1000EJB");
			FC_ACCT_1000EJB ejb = home.create();

			ds = ejb.fc_acct_1115_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		EJB 수정전 끝 */

		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.busn_yymm = (String)hash.get("busn_yymm");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.busn_yymm = Util.getSessionParameterValue(req,"busn_yymm",true);
		*******************************************************************************************/
	}
	public void fc_acct_1116_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_1116_LDataSet ds = null;
		FC_ACCT_1116_LDM dm = new FC_ACCT_1116_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.busn_yymm = Util.checkString(req.getParameter("busn_yymm"));

		dm.print();
		
		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_1116_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/* EJB 수정전 시작
		try {
			FC_ACCT_1000EJBHome home = (FC_ACCT_1000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_1000EJB");
			FC_ACCT_1000EJB ejb = home.create();

			ds = ejb.fc_acct_1116_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		EJB 수정전 끝 */

		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.busn_yymm = (String)hash.get("busn_yymm");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.busn_yymm = Util.getSessionParameterValue(req,"busn_yymm",true);
		*******************************************************************************************/
	}
	public void fc_acct_1120_m(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_1120_MDataSet ds = null;
		FC_ACCT_1120_MDM dm = new FC_ACCT_1120_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		
		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_1120_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/* EJB 수정전 시작
		try {
			FC_ACCT_1000EJBHome home = (FC_ACCT_1000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_1000EJB");
			FC_ACCT_1000EJB ejb = home.create();

			ds = ejb.fc_acct_1120_m(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
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
	public void fc_acct_1121_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_1121_LDataSet ds = null;
		FC_ACCT_1121_LDM dm = new FC_ACCT_1121_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.impt_expn_clsf_cd = Util.checkString(req.getParameter("impt_expn_clsf_cd"));
		dm.pay_cycl_cd = Util.checkString(req.getParameter("pay_cycl_cd"));
		dm.use_yn = Util.checkString(req.getParameter("use_yn"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_1121_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/* EJB 수정전 시작
		try {
			FC_ACCT_1000EJBHome home = (FC_ACCT_1000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_1000EJB");
			FC_ACCT_1000EJB ejb = home.create();

			ds = ejb.fc_acct_1121_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		EJB 수정전 끝 */

		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.impt_expn_clsf_cd = (String)hash.get("impt_expn_clsf_cd");
		dm.pay_cycl_cd = (String)hash.get("pay_cycl_cd");
		dm.use_yn = (String)hash.get("use_yn");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.impt_expn_clsf_cd = Util.getSessionParameterValue(req,"impt_expn_clsf_cd",true);
		dm.pay_cycl_cd = Util.getSessionParameterValue(req,"pay_cycl_cd",true);
		dm.use_yn = Util.getSessionParameterValue(req,"use_yn",true);
		*******************************************************************************************/
	}
	public void fc_acct_1122_i(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_1122_IDataSet ds = null;
		FC_ACCT_1122_IDM dm = new FC_ACCT_1122_IDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.fund_cd = Util.checkString(req.getParameter("fund_cd"));
		dm.fund_cdnm = Util.checkString(req.getParameter("fund_cdnm"));
		dm.impt_expn_clsf_cd = Util.checkString(req.getParameter("impt_expn_clsf_cd"));
		dm.pay_cycl_cd = Util.checkString(req.getParameter("pay_cycl_cd"));
		dm.pay_wkdy = Util.checkString(req.getParameter("pay_wkdy"));
		dm.pay_dd = Util.checkString(req.getParameter("pay_dd"));
		dm.pay_dd2 = Util.checkString(req.getParameter("pay_dd2"));
		dm.repe_yn = Util.checkString(req.getParameter("repe_yn"));
		dm.repe_cycl = Util.checkString(req.getParameter("repe_cycl"));
		dm.use_yn = Util.checkString(req.getParameter("use_yn"));
		dm.hd_bsdd_afbf_flag = Util.checkString(req.getParameter("hd_bsdd_afbf_flag"));
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.incmg_pers_ipadd = req.getRemoteAddr();	

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_1122_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/* EJB 수정전 시작
		try {
			FC_ACCT_1000EJBHome home = (FC_ACCT_1000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_1000EJB");
			FC_ACCT_1000EJB ejb = home.create();

			ds = ejb.fc_acct_1122_i(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		EJB 수정전 끝 */

		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.fund_cd = (String)hash.get("fund_cd");
		dm.fund_cdnm = (String)hash.get("fund_cdnm");
		dm.impt_expn_clsf_cd = (String)hash.get("impt_expn_clsf_cd");
		dm.pay_cycl_cd = (String)hash.get("pay_cycl_cd");
		dm.pay_wkdy = (String)hash.get("pay_wkdy");
		dm.pay_dd = (String)hash.get("pay_dd");
		dm.pay_dd2 = (String)hash.get("pay_dd2");
		dm.repe_yn = (String)hash.get("repe_yn");
		dm.repe_cycl = (String)hash.get("repe_cycl");
		dm.use_yn = (String)hash.get("use_yn");
		dm.hd_bsdd_afbf_flag = (String)hash.get("hd_bsdd_afbf_flag");
		dm.incmg_pers = (String)hash.get("incmg_pers");
		dm.incmg_pers_ipadd = (String)hash.get("incmg_pers_ipadd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.fund_cd = Util.getSessionParameterValue(req,"fund_cd",true);
		dm.fund_cdnm = Util.getSessionParameterValue(req,"fund_cdnm",true);
		dm.impt_expn_clsf_cd = Util.getSessionParameterValue(req,"impt_expn_clsf_cd",true);
		dm.pay_cycl_cd = Util.getSessionParameterValue(req,"pay_cycl_cd",true);
		dm.pay_wkdy = Util.getSessionParameterValue(req,"pay_wkdy",true);
		dm.pay_dd = Util.getSessionParameterValue(req,"pay_dd",true);
		dm.pay_dd2 = Util.getSessionParameterValue(req,"pay_dd2",true);
		dm.repe_yn = Util.getSessionParameterValue(req,"repe_yn",true);
		dm.repe_cycl = Util.getSessionParameterValue(req,"repe_cycl",true);
		dm.use_yn = Util.getSessionParameterValue(req,"use_yn",true);
		dm.hd_bsdd_afbf_flag = Util.getSessionParameterValue(req,"hd_bsdd_afbf_flag",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"incmg_pers",true);
		dm.incmg_pers_ipadd = Util.getSessionParameterValue(req,"incmg_pers_ipadd",true);
		*******************************************************************************************/
	}
	public void fc_acct_1123_d(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_1123_DDataSet ds = null;
		FC_ACCT_1123_DDM dm = new FC_ACCT_1123_DDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.fund_cd = Util.checkString(req.getParameter("fund_cd"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_1123_DDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/* EJB 수정전 시작
		try {
			FC_ACCT_1000EJBHome home = (FC_ACCT_1000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_1000EJB");
			FC_ACCT_1000EJB ejb = home.create();

			ds = ejb.fc_acct_1123_d(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		EJB 수정전 끝 */

		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.fund_cd = (String)hash.get("fund_cd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.fund_cd = Util.getSessionParameterValue(req,"fund_cd",true);
		*******************************************************************************************/
	}
	public void fc_acct_1201_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_1201_LDataSet ds = null;
		FC_ACCT_1201_LDM dm = new FC_ACCT_1201_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_1201_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/* EJB 수정전 시작
		try {
			FC_ACCT_1000EJBHome home = (FC_ACCT_1000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_1000EJB");
			FC_ACCT_1000EJB ejb = home.create();

			ds = ejb.fc_acct_1201_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
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
	public void fc_acct_1202_i(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_1202_IDataSet ds = null;
		FC_ACCT_1202_IDM dm = new FC_ACCT_1202_IDM();

		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);
		
		dm.mode = (String)hash.get("m");
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.dept_cd = (String)hash.get("dept_cd");
		dm.abrv_nm = (String)hash.get("abrv_nm");
		dm.slip_clsf01 = (String)hash.get("slip_clsf01");
		dm.slip01 = (String)hash.get("slip01");
		dm.slip_clsf02 = (String)hash.get("slip_clsf02");
		dm.slip02 = (String)hash.get("slip02");
		dm.slip_clsf03 = (String)hash.get("slip_clsf03");
		dm.slip03 = (String)hash.get("slip03");
		dm.slip_clsf10 = (String)hash.get("slip_clsf10");
		dm.slip10 = (String)hash.get("slip10");
		dm.slip_clsf11 = (String)hash.get("slip_clsf11");
		dm.slip11 = (String)hash.get("slip11");
		dm.slip_clsf12 = (String)hash.get("slip_clsf12");
		dm.slip12 = (String)hash.get("slip12");
		dm.slip_clsf13 = (String)hash.get("slip_clsf13");
		dm.slip13 = (String)hash.get("slip13");
		dm.slip_clsf16 = (String)hash.get("slip_clsf16");
		dm.slip16 = (String)hash.get("slip16");
		dm.slip_clsf17 = (String)hash.get("slip_clsf17");
		dm.slip17 = (String)hash.get("slip17");
		dm.slip_clsf20 = (String)hash.get("slip_clsf20");
		dm.slip20 = (String)hash.get("slip20");
		dm.slip_clsf21 = (String)hash.get("slip_clsf21");
		dm.slip21 = (String)hash.get("slip21");
		dm.slip_clsf22 = (String)hash.get("slip_clsf22");
		dm.slip22 = (String)hash.get("slip22");
		dm.slip_clsf26 = (String)hash.get("slip_clsf26");
		dm.slip26 = (String)hash.get("slip26");
		dm.slip_clsf27 = (String)hash.get("slip_clsf27");
		dm.slip27 = (String)hash.get("slip27");
		dm.slip_clsf30 = (String)hash.get("slip_clsf30");
		dm.slip30 = (String)hash.get("slip30");
		dm.slip_clsf32 = (String)hash.get("slip_clsf32");
		dm.slip32 = (String)hash.get("slip32");
		dm.slip_clsf33 = (String)hash.get("slip_clsf33");
		dm.slip33 = (String)hash.get("slip33");
		dm.slip_clsf34 = (String)hash.get("slip_clsf34");
		dm.slip34 = (String)hash.get("slip34");
		dm.slip_clsf35 = (String)hash.get("slip_clsf35");
		dm.slip35 = (String)hash.get("slip35");
		dm.slip_clsf36 = (String)hash.get("slip_clsf36");
		dm.slip36 = (String)hash.get("slip36");
		dm.slip_clsf40 = (String)hash.get("slip_clsf40");
		dm.slip40 = (String)hash.get("slip40");
		dm.slip_clsf41 = (String)hash.get("slip_clsf41");
		dm.slip41 = (String)hash.get("slip41");
		dm.slip_clsf42 = (String)hash.get("slip_clsf42");
		dm.slip42 = (String)hash.get("slip42");
		dm.slip_clsf50 = (String)hash.get("slip_clsf50");
		dm.slip50 = (String)hash.get("slip50");
		dm.slip_clsf51 = (String)hash.get("slip_clsf51");
		dm.slip51 = (String)hash.get("slip51");
		dm.slip_clsf52 = (String)hash.get("slip_clsf52");
		dm.slip52 = (String)hash.get("slip52");
		dm.slip_clsf53 = (String)hash.get("slip_clsf53");
		dm.slip53 = (String)hash.get("slip53");
		dm.slip_clsf54 = (String)hash.get("slip_clsf54");
		dm.slip54 = (String)hash.get("slip54");
		dm.slip_clsf55 = (String)hash.get("slip_clsf55");
		dm.slip55 = (String)hash.get("slip55");
		dm.slip_clsf60 = (String)hash.get("slip_clsf60");
		dm.slip60 = (String)hash.get("slip60");
		dm.slip_clsf61 = (String)hash.get("slip_clsf61");
		dm.slip61 = (String)hash.get("slip61");
		dm.slip_clsf62 = (String)hash.get("slip_clsf62");
		dm.slip62 = (String)hash.get("slip62");
		dm.slip_clsf63 = (String)hash.get("slip_clsf63");
		dm.slip63 = (String)hash.get("slip63");
		dm.slip_clsf64 = (String)hash.get("slip_clsf64");
		dm.slip64 = (String)hash.get("slip64");
		dm.slip_clsf90 = (String)hash.get("slip_clsf90");
		dm.slip90 = (String)hash.get("slip90");
		dm.slip_clsf91 = (String)hash.get("slip_clsf91");
		dm.slip91 = (String)hash.get("slip91");
		dm.slip_clsf92 = (String)hash.get("slip_clsf92");
		dm.slip92 = (String)hash.get("slip92");
		dm.slip_clsf93 = (String)hash.get("slip_clsf93");
		dm.slip93 = (String)hash.get("slip93");
		dm.slip_clsf94 = (String)hash.get("slip_clsf94");
		dm.slip94 = (String)hash.get("slip94");
		dm.slip_clsf95 = (String)hash.get("slip_clsf95");
		dm.slip95 = (String)hash.get("slip95");
		dm.slip_clsf96 = (String)hash.get("slip_clsf96");
		dm.slip96 = (String)hash.get("slip96");
		dm.slip_clsf97 = (String)hash.get("slip_clsf97");
		dm.slip97 = (String)hash.get("slip97");
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.incmg_pers_ipadd = req.getRemoteAddr();

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_1202_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/* EJB 수정전 시작
		try {
			FC_ACCT_1000EJBHome home = (FC_ACCT_1000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_1000EJB");
			FC_ACCT_1000EJB ejb = home.create();

			ds = ejb.fc_acct_1202_i(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		EJB 수정전 끝 */

		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.mode = (String)hash.get("mode");
		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.dept_cd = (String)hash.get("dept_cd");
		dm.abrv_nm = (String)hash.get("abrv_nm");
		dm.slip_clsf01 = (String)hash.get("slip_clsf01");
		dm.slip01 = (String)hash.get("slip01");
		dm.slip_clsf02 = (String)hash.get("slip_clsf02");
		dm.slip02 = (String)hash.get("slip02");
		dm.slip_clsf03 = (String)hash.get("slip_clsf03");
		dm.slip03 = (String)hash.get("slip03");
		dm.slip_clsf10 = (String)hash.get("slip_clsf10");
		dm.slip10 = (String)hash.get("slip10");
		dm.slip_clsf11 = (String)hash.get("slip_clsf11");
		dm.slip11 = (String)hash.get("slip11");
		dm.slip_clsf12 = (String)hash.get("slip_clsf12");
		dm.slip12 = (String)hash.get("slip12");
		dm.slip_clsf13 = (String)hash.get("slip_clsf13");
		dm.slip13 = (String)hash.get("slip13");
		dm.slip_clsf16 = (String)hash.get("slip_clsf16");
		dm.slip16 = (String)hash.get("slip16");
		dm.slip_clsf17 = (String)hash.get("slip_clsf17");
		dm.slip17 = (String)hash.get("slip17");
		dm.slip_clsf20 = (String)hash.get("slip_clsf20");
		dm.slip20 = (String)hash.get("slip20");
		dm.slip_clsf21 = (String)hash.get("slip_clsf21");
		dm.slip21 = (String)hash.get("slip21");
		dm.slip_clsf22 = (String)hash.get("slip_clsf22");
		dm.slip22 = (String)hash.get("slip22");
		dm.slip_clsf26 = (String)hash.get("slip_clsf26");
		dm.slip26 = (String)hash.get("slip26");
		dm.slip_clsf27 = (String)hash.get("slip_clsf27");
		dm.slip27 = (String)hash.get("slip27");
		dm.slip_clsf30 = (String)hash.get("slip_clsf30");
		dm.slip30 = (String)hash.get("slip30");
		dm.slip_clsf32 = (String)hash.get("slip_clsf32");
		dm.slip32 = (String)hash.get("slip32");
		dm.slip_clsf33 = (String)hash.get("slip_clsf33");
		dm.slip33 = (String)hash.get("slip33");
		dm.slip_clsf34 = (String)hash.get("slip_clsf34");
		dm.slip34 = (String)hash.get("slip34");
		dm.slip_clsf35 = (String)hash.get("slip_clsf35");
		dm.slip35 = (String)hash.get("slip35");
		dm.slip_clsf36 = (String)hash.get("slip_clsf36");
		dm.slip36 = (String)hash.get("slip36");
		dm.slip_clsf40 = (String)hash.get("slip_clsf40");
		dm.slip40 = (String)hash.get("slip40");
		dm.slip_clsf41 = (String)hash.get("slip_clsf41");
		dm.slip41 = (String)hash.get("slip41");
		dm.slip_clsf42 = (String)hash.get("slip_clsf42");
		dm.slip42 = (String)hash.get("slip42");
		dm.slip_clsf50 = (String)hash.get("slip_clsf50");
		dm.slip50 = (String)hash.get("slip50");
		dm.slip_clsf51 = (String)hash.get("slip_clsf51");
		dm.slip51 = (String)hash.get("slip51");
		dm.slip_clsf52 = (String)hash.get("slip_clsf52");
		dm.slip52 = (String)hash.get("slip52");
		dm.slip_clsf53 = (String)hash.get("slip_clsf53");
		dm.slip53 = (String)hash.get("slip53");
		dm.slip_clsf54 = (String)hash.get("slip_clsf54");
		dm.slip54 = (String)hash.get("slip54");
		dm.slip_clsf55 = (String)hash.get("slip_clsf55");
		dm.slip55 = (String)hash.get("slip55");
		dm.slip_clsf60 = (String)hash.get("slip_clsf60");
		dm.slip60 = (String)hash.get("slip60");
		dm.slip_clsf61 = (String)hash.get("slip_clsf61");
		dm.slip61 = (String)hash.get("slip61");
		dm.slip_clsf62 = (String)hash.get("slip_clsf62");
		dm.slip62 = (String)hash.get("slip62");
		dm.slip_clsf63 = (String)hash.get("slip_clsf63");
		dm.slip63 = (String)hash.get("slip63");
		dm.slip_clsf64 = (String)hash.get("slip_clsf64");
		dm.slip64 = (String)hash.get("slip64");
		dm.slip_clsf90 = (String)hash.get("slip_clsf90");
		dm.slip90 = (String)hash.get("slip90");
		dm.slip_clsf91 = (String)hash.get("slip_clsf91");
		dm.slip91 = (String)hash.get("slip91");
		dm.slip_clsf92 = (String)hash.get("slip_clsf92");
		dm.slip92 = (String)hash.get("slip92");
		dm.slip_clsf93 = (String)hash.get("slip_clsf93");
		dm.slip93 = (String)hash.get("slip93");
		dm.slip_clsf94 = (String)hash.get("slip_clsf94");
		dm.slip94 = (String)hash.get("slip94");
		dm.slip_clsf95 = (String)hash.get("slip_clsf95");
		dm.slip95 = (String)hash.get("slip95");
		dm.slip_clsf96 = (String)hash.get("slip_clsf96");
		dm.slip96 = (String)hash.get("slip96");
		dm.slip_clsf97 = (String)hash.get("slip_clsf97");
		dm.slip97 = (String)hash.get("slip97");
		dm.incmg_pers = (String)hash.get("incmg_pers");
		dm.incmg_pers_ipadd = (String)hash.get("incmg_pers_ipadd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.mode = Util.getSessionParameterValue(req,"mode",true);
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.dept_cd = Util.getSessionParameterValue(req,"dept_cd",true);
		dm.abrv_nm = Util.getSessionParameterValue(req,"abrv_nm",true);
		dm.slip_clsf01 = Util.getSessionParameterValue(req,"slip_clsf01",true);
		dm.slip01 = Util.getSessionParameterValue(req,"slip01",true);
		dm.slip_clsf02 = Util.getSessionParameterValue(req,"slip_clsf02",true);
		dm.slip02 = Util.getSessionParameterValue(req,"slip02",true);
		dm.slip_clsf03 = Util.getSessionParameterValue(req,"slip_clsf03",true);
		dm.slip03 = Util.getSessionParameterValue(req,"slip03",true);
		dm.slip_clsf10 = Util.getSessionParameterValue(req,"slip_clsf10",true);
		dm.slip10 = Util.getSessionParameterValue(req,"slip10",true);
		dm.slip_clsf11 = Util.getSessionParameterValue(req,"slip_clsf11",true);
		dm.slip11 = Util.getSessionParameterValue(req,"slip11",true);
		dm.slip_clsf12 = Util.getSessionParameterValue(req,"slip_clsf12",true);
		dm.slip12 = Util.getSessionParameterValue(req,"slip12",true);
		dm.slip_clsf13 = Util.getSessionParameterValue(req,"slip_clsf13",true);
		dm.slip13 = Util.getSessionParameterValue(req,"slip13",true);
		dm.slip_clsf16 = Util.getSessionParameterValue(req,"slip_clsf16",true);
		dm.slip16 = Util.getSessionParameterValue(req,"slip16",true);
		dm.slip_clsf17 = Util.getSessionParameterValue(req,"slip_clsf17",true);
		dm.slip17 = Util.getSessionParameterValue(req,"slip17",true);
		dm.slip_clsf20 = Util.getSessionParameterValue(req,"slip_clsf20",true);
		dm.slip20 = Util.getSessionParameterValue(req,"slip20",true);
		dm.slip_clsf21 = Util.getSessionParameterValue(req,"slip_clsf21",true);
		dm.slip21 = Util.getSessionParameterValue(req,"slip21",true);
		dm.slip_clsf22 = Util.getSessionParameterValue(req,"slip_clsf22",true);
		dm.slip22 = Util.getSessionParameterValue(req,"slip22",true);
		dm.slip_clsf26 = Util.getSessionParameterValue(req,"slip_clsf26",true);
		dm.slip26 = Util.getSessionParameterValue(req,"slip26",true);
		dm.slip_clsf27 = Util.getSessionParameterValue(req,"slip_clsf27",true);
		dm.slip27 = Util.getSessionParameterValue(req,"slip27",true);
		dm.slip_clsf30 = Util.getSessionParameterValue(req,"slip_clsf30",true);
		dm.slip30 = Util.getSessionParameterValue(req,"slip30",true);
		dm.slip_clsf32 = Util.getSessionParameterValue(req,"slip_clsf32",true);
		dm.slip32 = Util.getSessionParameterValue(req,"slip32",true);
		dm.slip_clsf33 = Util.getSessionParameterValue(req,"slip_clsf33",true);
		dm.slip33 = Util.getSessionParameterValue(req,"slip33",true);
		dm.slip_clsf34 = Util.getSessionParameterValue(req,"slip_clsf34",true);
		dm.slip34 = Util.getSessionParameterValue(req,"slip34",true);
		dm.slip_clsf35 = Util.getSessionParameterValue(req,"slip_clsf35",true);
		dm.slip35 = Util.getSessionParameterValue(req,"slip35",true);
		dm.slip_clsf36 = Util.getSessionParameterValue(req,"slip_clsf36",true);
		dm.slip36 = Util.getSessionParameterValue(req,"slip36",true);
		dm.slip_clsf40 = Util.getSessionParameterValue(req,"slip_clsf40",true);
		dm.slip40 = Util.getSessionParameterValue(req,"slip40",true);
		dm.slip_clsf41 = Util.getSessionParameterValue(req,"slip_clsf41",true);
		dm.slip41 = Util.getSessionParameterValue(req,"slip41",true);
		dm.slip_clsf42 = Util.getSessionParameterValue(req,"slip_clsf42",true);
		dm.slip42 = Util.getSessionParameterValue(req,"slip42",true);
		dm.slip_clsf50 = Util.getSessionParameterValue(req,"slip_clsf50",true);
		dm.slip50 = Util.getSessionParameterValue(req,"slip50",true);
		dm.slip_clsf51 = Util.getSessionParameterValue(req,"slip_clsf51",true);
		dm.slip51 = Util.getSessionParameterValue(req,"slip51",true);
		dm.slip_clsf52 = Util.getSessionParameterValue(req,"slip_clsf52",true);
		dm.slip52 = Util.getSessionParameterValue(req,"slip52",true);
		dm.slip_clsf53 = Util.getSessionParameterValue(req,"slip_clsf53",true);
		dm.slip53 = Util.getSessionParameterValue(req,"slip53",true);
		dm.slip_clsf54 = Util.getSessionParameterValue(req,"slip_clsf54",true);
		dm.slip54 = Util.getSessionParameterValue(req,"slip54",true);
		dm.slip_clsf55 = Util.getSessionParameterValue(req,"slip_clsf55",true);
		dm.slip55 = Util.getSessionParameterValue(req,"slip55",true);
		dm.slip_clsf60 = Util.getSessionParameterValue(req,"slip_clsf60",true);
		dm.slip60 = Util.getSessionParameterValue(req,"slip60",true);
		dm.slip_clsf61 = Util.getSessionParameterValue(req,"slip_clsf61",true);
		dm.slip61 = Util.getSessionParameterValue(req,"slip61",true);
		dm.slip_clsf62 = Util.getSessionParameterValue(req,"slip_clsf62",true);
		dm.slip62 = Util.getSessionParameterValue(req,"slip62",true);
		dm.slip_clsf63 = Util.getSessionParameterValue(req,"slip_clsf63",true);
		dm.slip63 = Util.getSessionParameterValue(req,"slip63",true);
		dm.slip_clsf64 = Util.getSessionParameterValue(req,"slip_clsf64",true);
		dm.slip64 = Util.getSessionParameterValue(req,"slip64",true);
		dm.slip_clsf90 = Util.getSessionParameterValue(req,"slip_clsf90",true);
		dm.slip90 = Util.getSessionParameterValue(req,"slip90",true);
		dm.slip_clsf91 = Util.getSessionParameterValue(req,"slip_clsf91",true);
		dm.slip91 = Util.getSessionParameterValue(req,"slip91",true);
		dm.slip_clsf92 = Util.getSessionParameterValue(req,"slip_clsf92",true);
		dm.slip92 = Util.getSessionParameterValue(req,"slip92",true);
		dm.slip_clsf93 = Util.getSessionParameterValue(req,"slip_clsf93",true);
		dm.slip93 = Util.getSessionParameterValue(req,"slip93",true);
		dm.slip_clsf94 = Util.getSessionParameterValue(req,"slip_clsf94",true);
		dm.slip94 = Util.getSessionParameterValue(req,"slip94",true);
		dm.slip_clsf95 = Util.getSessionParameterValue(req,"slip_clsf95",true);
		dm.slip95 = Util.getSessionParameterValue(req,"slip95",true);
		dm.slip_clsf96 = Util.getSessionParameterValue(req,"slip_clsf96",true);
		dm.slip96 = Util.getSessionParameterValue(req,"slip96",true);
		dm.slip_clsf97 = Util.getSessionParameterValue(req,"slip_clsf97",true);
		dm.slip97 = Util.getSessionParameterValue(req,"slip97",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"incmg_pers",true);
		dm.incmg_pers_ipadd = Util.getSessionParameterValue(req,"incmg_pers_ipadd",true);
		*******************************************************************************************/
	}	
	public void fc_acct_1210_m(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_1210_MDataSet ds = null;
		FC_ACCT_1210_MDM dm = new FC_ACCT_1210_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_1210_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/* EJB 수정전 시작
		try {
			FC_ACCT_1000EJBHome home = (FC_ACCT_1000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_1000EJB");
			FC_ACCT_1000EJB ejb = home.create();

			ds = ejb.fc_acct_1211_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
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
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.slip_clsf_cd = Util.getSessionParameterValue(req,"slip_clsf_cd",true);
		*******************************************************************************************/
	}
	public void fc_acct_1211_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_1211_LDataSet ds = null;
		FC_ACCT_1211_LDM dm = new FC_ACCT_1211_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_1211_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/* EJB 수정전 시작
		try {
			FC_ACCT_1000EJBHome home = (FC_ACCT_1000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_1000EJB");
			FC_ACCT_1000EJB ejb = home.create();

			ds = ejb.fc_acct_1211_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
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
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.slip_clsf_cd = Util.getSessionParameterValue(req,"slip_clsf_cd",true);
		*******************************************************************************************/
	}
	public void fc_acct_1212_s(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_1212_SDataSet ds = null;
		FC_ACCT_1212_SDM dm = new FC_ACCT_1212_SDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_1212_SDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/* EJB 수정전 시작
		try {
			FC_ACCT_1000EJBHome home = (FC_ACCT_1000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_1000EJB");
			FC_ACCT_1000EJB ejb = home.create();

			ds = ejb.fc_acct_1212_s(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
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
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.slip_clsf_cd = Util.getSessionParameterValue(req,"slip_clsf_cd",true);
		*******************************************************************************************/
	}
	public void fc_acct_1213_i(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_1213_IDataSet ds = null;
		FC_ACCT_1213_IDM dm = new FC_ACCT_1213_IDM();

		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);
		
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);		
		dm.incmg_pers_ipadd = req.getRemoteAddr();		
		dm.mode = (String)hash.get("m");
		dm.slip_clsf_cd = (String)hash.get("slip_clsf_cd");
		dm.dr = (String)hash.get("dr");
		dm.cr = (String)hash.get("cr");
		
		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_1213_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/* EJB 수정전 시작
		try {
			FC_ACCT_1000EJBHome home = (FC_ACCT_1000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_1000EJB");
			FC_ACCT_1000EJB ejb = home.create();

			ds = ejb.fc_acct_1213_i(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
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
		dm.mode = (String)hash.get("mode");
		dm.slip_clsf_cd = (String)hash.get("slip_clsf_cd");
		dm.dr = (String)hash.get("dr");
		dm.cr = (String)hash.get("cr");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"incmg_pers",true);
		dm.incmg_pers_ipadd = Util.getSessionParameterValue(req,"incmg_pers_ipadd",true);
		dm.mode = Util.getSessionParameterValue(req,"mode",true);
		dm.slip_clsf_cd = Util.getSessionParameterValue(req,"slip_clsf_cd",true);
		dm.dr = Util.getSessionParameterValue(req,"dr",true);
		dm.cr = Util.getSessionParameterValue(req,"cr",true);
		*******************************************************************************************/
	}
	public void fc_acct_1214_d(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_1214_DDataSet ds = null;
		FC_ACCT_1214_DDM dm = new FC_ACCT_1214_DDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_1214_DDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/* EJB 수정전 시작
		try {
			FC_ACCT_1000EJBHome home = (FC_ACCT_1000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_1000EJB");
			FC_ACCT_1000EJB ejb = home.create();

			ds = ejb.fc_acct_1214_d(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
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
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.slip_clsf_cd = Util.getSessionParameterValue(req,"slip_clsf_cd",true);
		*******************************************************************************************/
	}	

	public void fc_acct_1181_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_1181_LDataSet ds = null;
		FC_ACCT_1181_LDM dm = new FC_ACCT_1181_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.clsf_cd = Util.checkString(req.getParameter("clsf_cd"));
		dm.cd_f = Util.checkString(req.getParameter("cd_f"));
		dm.cd_t = Util.checkString(req.getParameter("cd_t"));
		dm.cd_abrv_nm = Util.checkString(req.getParameter("cd_abrv_nm"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_1181_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/* EJB 수정전 시작
		try {
			FC_ACCT_1000EJBHome home = (FC_ACCT_1000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_1000EJB");
			FC_ACCT_1000EJB ejb = home.create();

			ds = ejb.fc_acct_1181_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
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
		dm.cd_f = (String)hash.get("cd_f");
		dm.cd_t = (String)hash.get("cd_t");
		dm.cd_abrv_nm = (String)hash.get("cd_abrv_nm");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.clsf_cd = Util.getSessionParameterValue(req,"clsf_cd",true);
		dm.cd_f = Util.getSessionParameterValue(req,"cd_f",true);
		dm.cd_t = Util.getSessionParameterValue(req,"cd_t",true);
		dm.cd_abrv_nm = Util.getSessionParameterValue(req,"cd_abrv_nm",true);
		*******************************************************************************************/
	}

	public void fc_acct_1180_m(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_1180_MDataSet ds = null;
		FC_ACCT_1180_MDM dm = new FC_ACCT_1180_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_1180_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/* EJB 수정전 시작
		try {
			FC_ACCT_1000EJBHome home = (FC_ACCT_1000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_1000EJB");
			FC_ACCT_1000EJB ejb = home.create();

			ds = ejb.fc_acct_1180_m(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
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
	public void fc_acct_1190_m(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_1190_MDataSet ds = null;
		FC_ACCT_1190_MDM dm = new FC_ACCT_1190_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		
		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_1190_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */

		/* EJB 수정전 시작
		try {
			FC_ACCT_1000EJBHome home = (FC_ACCT_1000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_1000EJB");
			FC_ACCT_1000EJB ejb = home.create();

			ds = ejb.fc_acct_1190_m(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
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
	
	
	public void fc_acct_1020_m(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_1020_MDataSet ds = null;
		FC_ACCT_1020_MDM dm = new FC_ACCT_1020_MDM();

		dm.cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
		dm.acct_type_cd = Util.checkString(req.getParameter("acct_type_cd"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_1020_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		
		/* EJB 수정전 시작
		try {
			FC_ACCT_1000EJBHome home = (FC_ACCT_1000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_1000EJB");
			FC_ACCT_1000EJB ejb = home.create();

			ds = ejb.fc_acct_1020_m(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
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
	
	
	public void fc_acct_1021_s(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_1021_SDataSet ds = null;
		FC_ACCT_1021_SDM dm = new FC_ACCT_1021_SDM();

		dm.cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
		dm.acct_cd = Util.checkString(req.getParameter("acct_cd"));
		dm.acct_type_cd = Util.checkString(req.getParameter("acct_type_cd"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_1021_SDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		
		/* EJB 수정전 시작
		try {
			FC_ACCT_1000EJBHome home = (FC_ACCT_1000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_1000EJB");
			FC_ACCT_1000EJB ejb = home.create();

			ds = ejb.fc_acct_1021_s(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		EJB 수정전 끝 */

		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.acct_cd = (String)hash.get("acct_cd");
		dm.acct_nm = (String)hash.get("acct_nm");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.acct_cd = Util.getSessionParameterValue(req,"acct_cd",true);
		dm.acct_nm = Util.getSessionParameterValue(req,"acct_nm",true);
		*******************************************************************************************/
	}
	
	public void fc_acct_1022_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_1022_LDataSet ds = null;
		FC_ACCT_1022_LDM dm = new FC_ACCT_1022_LDM();

		dm.cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
		dm.acct_cd = Util.checkString(req.getParameter("acct_cd"));
		dm.acct_nm = Util.checkString(req.getParameter("acct_nm"));
		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_1022_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		
		/* EJB 수정전 시작
		try {
			FC_ACCT_1000EJBHome home = (FC_ACCT_1000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_1000EJB");
			FC_ACCT_1000EJB ejb = home.create();

			ds = ejb.fc_acct_1022_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		EJB 수정전 끝 */

		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.acct_cd = (String)hash.get("acct_cd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.acct_cd = Util.getSessionParameterValue(req,"acct_cd",true);
		*******************************************************************************************/
	}

	public void fc_acct_1023_u(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_1023_UDataSet ds = null;
		FC_ACCT_1023_UDM dm = new FC_ACCT_1023_UDM();

		//dm.cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.acct_type_cd = Util.checkString(req.getParameter("acct_type_cd"));
		dm.acct_cd = Util.checkString(req.getParameter("acct_cd"));
		dm.acct_nm = Util.checkString(req.getParameter("acct_nm"));
		dm.logic = Util.checkString(req.getParameter("acct_logic"));
		dm.flag = Util.checkString(req.getParameter("flag"));
		dm.chg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		
		dm.print();
		
		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_1023_UDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		
		/* EJB 수정전 시작
		try {
			FC_ACCT_1000EJBHome home = (FC_ACCT_1000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_1000EJB");
			FC_ACCT_1000EJB ejb = home.create();

			ds = ejb.fc_acct_1023_u(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		EJB 수정전 끝 */

		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.acct_cd = (String)hash.get("acct_cd");
		dm.logic = (String)hash.get("logic");
		dm.chg_pers = (String)hash.get("chg_pers");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.acct_cd = Util.getSessionParameterValue(req,"acct_cd",true);
		dm.logic = Util.getSessionParameterValue(req,"logic",true);
		dm.chg_pers = Util.getSessionParameterValue(req,"chg_pers",true);
		*******************************************************************************************/
	}
	
	public void fc_acct_1024_s(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_1024_SDataSet ds = null;
		FC_ACCT_1024_SDM dm = new FC_ACCT_1024_SDM();

		dm.cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
		dm.acct_cd = Util.checkString(req.getParameter("acct_cd"));
		dm.acct_type_cd = Util.checkString(req.getParameter("acct_type_cd"));

		dm.print();

		
		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_1024_SDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		
		/* EJB 수정전 시작
		try {
			FC_ACCT_1000EJBHome home = (FC_ACCT_1000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_1000EJB");
			FC_ACCT_1000EJB ejb = home.create();

			ds = ejb.fc_acct_1024_s(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		EJB 수정전 끝 */

		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.acct_cd = (String)hash.get("acct_cd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.acct_cd = Util.getSessionParameterValue(req,"acct_cd",true);
		*******************************************************************************************/
	}
	
	public void fc_acct_1025_u(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_1025_UDataSet ds = null;
		FC_ACCT_1025_UDM dm = new FC_ACCT_1025_UDM();

		dm.cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
		dm.acct_cd = Util.checkString(req.getParameter("acct_cd"));
		dm.acct_type_cd = Util.checkString(req.getParameter("acct_type_cd"));
		dm.chg_pers = Util.checkString(req.getParameter("chg_pers"));

		dm.print();

		
		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_1025_UDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		
		/* EJB 수정전 시작
		try {
			FC_ACCT_1000EJBHome home = (FC_ACCT_1000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_1000EJB");
			FC_ACCT_1000EJB ejb = home.create();

			ds = ejb.fc_acct_1025_u(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		EJB 수정전 끝 */

		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.acct_cd = (String)hash.get("acct_cd");
		dm.chg_pers = (String)hash.get("chg_pers");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.acct_cd = Util.getSessionParameterValue(req,"acct_cd",true);
		dm.chg_pers = Util.getSessionParameterValue(req,"chg_pers",true);
		*******************************************************************************************/
	}
	
	public void fc_acct_1026_u(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_1026_UDataSet ds = null;
		FC_ACCT_1026_UDM dm = new FC_ACCT_1026_UDM();

		dm.cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
		dm.acct_type_cd = Util.checkString(req.getParameter("acct_type_cd"));
		dm.acct_cd = Util.checkString(req.getParameter("acct_cd"));
		dm.flag = Util.checkString(req.getParameter("flag"));
		dm.chg_pers = Util.checkString(req.getParameter("chg_pers"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_1026_UDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
		
		/* EJB 수정전 시작
		try {
			FC_ACCT_1000EJBHome home = (FC_ACCT_1000EJBHome)JNDIManager.getInstance().getHome("FC_ACCT_1000EJB");
			FC_ACCT_1000EJB ejb = home.create();

			ds = ejb.fc_acct_1026_u(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		EJB 수정전 끝 */
		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.acct_cd = (String)hash.get("acct_cd");
		dm.flag = (String)hash.get("flag");
		dm.chg_pers = (String)hash.get("chg_pers");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.acct_cd = Util.getSessionParameterValue(req,"acct_cd",true);
		dm.flag = Util.getSessionParameterValue(req,"flag",true);
		dm.chg_pers = Util.getSessionParameterValue(req,"chg_pers",true);
		*******************************************************************************************/
		
	}
	
	public void fc_acct_1027_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		FC_ACCT_1027_ADataSet ds = null;
		FC_ACCT_1027_ADM dm = new FC_ACCT_1027_ADM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.acct_type_cd = Util.checkString(req.getParameter("acct_type_cd"));
		dm.acct_cd = Util.checkString(req.getParameter("acct_cd"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISFNC");
		ds = (FC_ACCT_1027_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
	}
}

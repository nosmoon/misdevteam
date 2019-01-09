/***************************************************************************************************
* 파일명 :
* 기능 : 
 * 작성일자 : 
 * 작성자 : 
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/

package chosun.ciis.as.redm.wb;

import java.util.*;
import java.rmi.RemoteException;
import java.io.*;

import java.rmi.RemoteException;
import java.util.StringTokenizer;

import javax.ejb.CreateException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.multipart.*;

import chosun.ciis.co.base.wb.BaseWB;
import somo.framework.db.BaseDataSet;
import somo.framework.expt.AppException;
import somo.framework.expt.SysException;
import somo.framework.lib.JNDIManager;
import somo.framework.db.DBManager;
import somo.framework.log.LogManager;
import somo.framework.util.Util;
import chosun.ciis.as.leas.ds.AS_LEAS_1001_LDataSet;
import chosun.ciis.as.redm.dm.*;
import chosun.ciis.as.redm.ds.*;

/**
 * 
 */

public class AS_REDM_1000WB extends BaseWB {
    
	public void as_redm_1000_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		AS_REDM_1000_LDataSet ds = null;
		AS_REDM_1000_LDM dm = new AS_REDM_1000_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.redm_dt = Util.checkString(req.getParameter("redm_dt"));

//		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISAST");
		ds = (AS_REDM_1000_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */			
/*		
		try {
			AS_REDM_1000EJBHome home = (AS_REDM_1000EJBHome)JNDIManager.getInstance().getHome("AS_REDM_1000EJB");
			AS_REDM_1000EJB ejb = home.create();

			ds = ejb.as_redm_1000_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
*/
		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.redm_dt = (String)hash.get("redm_dt");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.redm_dt = Util.getSessionParameterValue(req,"redm_dt",true);
		*******************************************************************************************/
	}
	public void as_redm_1001_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
		AS_REDM_1001_MDataSet ds = null;
		AS_REDM_1001_MDM dm = new AS_REDM_1001_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);

//		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISAST");
		ds = (AS_REDM_1001_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */			
/*		
		try {
			AS_REDM_1000EJBHome home = (AS_REDM_1000EJBHome)JNDIManager.getInstance().getHome("AS_REDM_1000EJB");
			AS_REDM_1000EJB ejb = home.create();

			ds = ejb.as_redm_1001_m(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
*/
		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		*******************************************************************************************/
	}
	public void as_redm_1201_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		AS_REDM_1201_LDataSet ds = null;
		AS_REDM_1201_LDM dm = new AS_REDM_1201_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.redm_yymm = Util.checkString(req.getParameter("redm_yymm"));

//		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISAST");
		ds = (AS_REDM_1201_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */			
/*		
		try {
			AS_REDM_1000EJBHome home = (AS_REDM_1000EJBHome)JNDIManager.getInstance().getHome("AS_REDM_1000EJB");
			AS_REDM_1000EJB ejb = home.create();

			ds = ejb.as_redm_1201_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
*/
		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.redm_yymm = (String)hash.get("redm_yymm");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.redm_yymm = Util.getSessionParameterValue(req,"redm_yymm",true);
		*******************************************************************************************/
	}
	public void as_redm_1202_u(HttpServletRequest req, HttpServletResponse res) throws AppException {
		AS_REDM_1202_UDataSet ds = null;
		AS_REDM_1202_UDM dm = new AS_REDM_1202_UDM();

		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);
		System.out.println("=====================================================================================");
		System.out.println(multiUpdateData);
		System.out.println("=====================================================================================");

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.chg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.redm_yymm = Util.checkString(req.getParameter("redm_yymm"));
		
		dm.aset_no = (String)hash.get("aset_no");
		dm.meda_amt = (String)hash.get("meda_amt");
		
//		dm.print();
		
		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISAST");
		ds = (AS_REDM_1202_UDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */	
		
/*		
		try {
			AS_REDM_1000EJBHome home = (AS_REDM_1000EJBHome)JNDIManager.getInstance().getHome("AS_REDM_1000EJB");
			AS_REDM_1000EJB ejb = home.create();

			ds = ejb.as_redm_1202_u(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
*/
		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.redm_yymm = (String)hash.get("redm_yymm");
		dm.aset_no = (String)hash.get("aset_no");
		dm.meda_amt = (String)hash.get("meda_amt");
		dm.chg_pers = (String)hash.get("chg_pers");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.redm_yymm = Util.getSessionParameterValue(req,"redm_yymm",true);
		dm.aset_no = Util.getSessionParameterValue(req,"aset_no",true);
		dm.meda_amt = Util.getSessionParameterValue(req,"meda_amt",true);
		dm.chg_pers = Util.getSessionParameterValue(req,"chg_pers",true);
		*******************************************************************************************/
	}
	public void as_redm_1301_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
		AS_REDM_1301_MDataSet ds = null;
		AS_REDM_1301_MDM dm = new AS_REDM_1301_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);

//		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISAST");
		ds = (AS_REDM_1301_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */	
		
/*		
		try {
			AS_REDM_1000EJBHome home = (AS_REDM_1000EJBHome)JNDIManager.getInstance().getHome("AS_REDM_1000EJB");
			AS_REDM_1000EJB ejb = home.create();

			ds = ejb.as_redm_1301_m(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
*/
		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		*******************************************************************************************/
	}
    public void as_redm_1302_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		AS_REDM_1302_LDataSet ds = null;
		AS_REDM_1302_LDM dm = new AS_REDM_1302_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.aply_dt = Util.checkString(req.getParameter("aply_dt"));
		dm.redm_mthd_cd = Util.checkString(req.getParameter("redm_mthd_cd"));

//		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISAST");
		ds = (AS_REDM_1302_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */			
/*		
		try {
			AS_REDM_1000EJBHome home = (AS_REDM_1000EJBHome)JNDIManager.getInstance().getHome("AS_REDM_1000EJB");
			AS_REDM_1000EJB ejb = home.create();

			ds = ejb.as_redm_1302_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
*/
		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.aply_dt = (String)hash.get("aply_dt");
		dm.redm_mthd_cd = (String)hash.get("redm_mthd_cd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.aply_dt = Util.getSessionParameterValue(req,"aply_dt",true);
		dm.redm_mthd_cd = Util.getSessionParameterValue(req,"redm_mthd_cd",true);
		*******************************************************************************************/
	}
    public void as_redm_1303_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
		AS_REDM_1303_MDataSet ds = null;
		AS_REDM_1303_MDM dm = new AS_REDM_1303_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		
//		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISAST");
		ds = (AS_REDM_1303_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */			
/*		
		try {
			AS_REDM_1000EJBHome home = (AS_REDM_1000EJBHome)JNDIManager.getInstance().getHome("AS_REDM_1000EJB");
			AS_REDM_1000EJB ejb = home.create();

			ds = ejb.as_redm_1303_m(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
*/
		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		*******************************************************************************************/
	}
    public void as_redm_1304_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		AS_REDM_1304_ADataSet ds = null;
		AS_REDM_1304_ADM dm = new AS_REDM_1304_ADM();

		dm.mode = Util.checkString(req.getParameter("mode"));
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.aply_dt = Util.checkString(req.getParameter("aply_dt"));
		dm.redm_mthd_cd = Util.checkString(req.getParameter("redm_mthd_cd"));
		dm.cont_yys = Util.checkString(req.getParameter("cont_yys"));
		dm.redm_rate = Util.checkString(req.getParameter("redm_rate"));
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.chg_pers = Util.getSessionParameterValue(req, "emp_no", true);

//		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISAST");
		ds = (AS_REDM_1304_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */			
/*		
		try {
			AS_REDM_1000EJBHome home = (AS_REDM_1000EJBHome)JNDIManager.getInstance().getHome("AS_REDM_1000EJB");
			AS_REDM_1000EJB ejb = home.create();

			ds = ejb.as_redm_1304_a(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
*/
		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.mode = (String)hash.get("mode");
		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.aply_dt = (String)hash.get("aply_dt");
		dm.redm_mthd_cd = (String)hash.get("redm_mthd_cd");
		dm.cont_yys = (String)hash.get("cont_yys");
		dm.redm_rate = (String)hash.get("redm_rate");
		dm.incmg_pers_ipadd = (String)hash.get("incmg_pers_ipadd");
		dm.incmg_pers = (String)hash.get("incmg_pers");
		dm.chg_pers = (String)hash.get("chg_pers");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.mode = Util.getSessionParameterValue(req,"mode",true);
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.aply_dt = Util.getSessionParameterValue(req,"aply_dt",true);
		dm.redm_mthd_cd = Util.getSessionParameterValue(req,"redm_mthd_cd",true);
		dm.cont_yys = Util.getSessionParameterValue(req,"cont_yys",true);
		dm.redm_rate = Util.getSessionParameterValue(req,"redm_rate",true);
		dm.incmg_pers_ipadd = Util.getSessionParameterValue(req,"incmg_pers_ipadd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"incmg_pers",true);
		dm.chg_pers = Util.getSessionParameterValue(req,"chg_pers",true);
		*******************************************************************************************/
	}
    public void as_redm_1305_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
		AS_REDM_1305_MDataSet ds = null;
		AS_REDM_1305_MDM dm = new AS_REDM_1305_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);

//		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISAST");
		ds = (AS_REDM_1305_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */		
		
/*		
		try {
			AS_REDM_1000EJBHome home = (AS_REDM_1000EJBHome)JNDIManager.getInstance().getHome("AS_REDM_1000EJB");
			AS_REDM_1000EJB ejb = home.create();

			ds = ejb.as_redm_1305_m(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
*/
		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		*******************************************************************************************/
	}
    public void as_redm_1401_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
		AS_REDM_1401_MDataSet ds = null;
		AS_REDM_1401_MDM dm = new AS_REDM_1401_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);

//		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISAST");
		ds = (AS_REDM_1401_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */		
				
/*		
		try {
			AS_REDM_1000EJBHome home = (AS_REDM_1000EJBHome)JNDIManager.getInstance().getHome("AS_REDM_1000EJB");
			AS_REDM_1000EJB ejb = home.create();

			ds = ejb.as_redm_1401_m(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
*/
		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		*******************************************************************************************/
	}
    
	public void as_redm_1004_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		AS_REDM_1004_LDataSet ds = null;
		AS_REDM_1004_LDM dm = new AS_REDM_1004_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.redm_yymm = Util.checkString(req.getParameter("redm_dt"));
		dm.print();

//		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISAST");
		ds = (AS_REDM_1004_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */		
						
/*		
		try {
			AS_REDM_1000EJBHome home = (AS_REDM_1000EJBHome)JNDIManager.getInstance().getHome("AS_REDM_1000EJB");
			AS_REDM_1000EJB ejb = home.create();

			ds = ejb.as_redm_1004_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
*/
		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.redm_yymm = (String)hash.get("redm_yymm");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.redm_yymm = Util.getSessionParameterValue(req,"redm_yymm",true);
		*******************************************************************************************/
	}

	public void as_redm_1002_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		AS_REDM_1002_ADataSet ds = null;
		AS_REDM_1002_ADM dm = new AS_REDM_1002_ADM();

		dm.mst_mode = Util.checkString(req.getParameter("mst_mode"));
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.dept_cd = Util.getSessionParameterValue(req, "deptcd", true);
		dm.redm_dt = Util.checkString(req.getParameter("redm_dt"));
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.chg_pers = Util.getSessionParameterValue(req, "emp_no", true);

//		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISAST");
		ds = (AS_REDM_1002_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */		
								
/*		
		try {
			AS_REDM_1000EJBHome home = (AS_REDM_1000EJBHome)JNDIManager.getInstance().getHome("AS_REDM_1000EJB");
			AS_REDM_1000EJB ejb = home.create();

			ds = ejb.as_redm_1002_a(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
*/
		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.mst_mode = (String)hash.get("mst_mode");
		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.dept_cd = (String)hash.get("dept_cd");
		dm.redm_dt = (String)hash.get("redm_dt");
		dm.incmg_pers_ipadd = (String)hash.get("incmg_pers_ipadd");
		dm.incmg_pers = (String)hash.get("incmg_pers");
		dm.chg_pers = (String)hash.get("chg_pers");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.mst_mode = Util.getSessionParameterValue(req,"mst_mode",true);
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.dept_cd = Util.getSessionParameterValue(req,"dept_cd",true);
		dm.redm_dt = Util.getSessionParameterValue(req,"redm_dt",true);
		dm.incmg_pers_ipadd = Util.getSessionParameterValue(req,"incmg_pers_ipadd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"incmg_pers",true);
		dm.chg_pers = Util.getSessionParameterValue(req,"chg_pers",true);
		*******************************************************************************************/
	}	
	public void as_redm_1003_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		AS_REDM_1003_ADataSet ds = null;
		AS_REDM_1003_ADM dm = new AS_REDM_1003_ADM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.redm_dt = Util.checkString(req.getParameter("redm_dt"));
		dm.slip_no = Util.checkString(req.getParameter("slip_no"));		
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.chg_pers = Util.getSessionParameterValue(req, "emp_no", true);

//		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISAST");
		ds = (AS_REDM_1003_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */	
		
/*		
		try {
			AS_REDM_1000EJBHome home = (AS_REDM_1000EJBHome)JNDIManager.getInstance().getHome("AS_REDM_1000EJB");
			AS_REDM_1000EJB ejb = home.create();

			ds = ejb.as_redm_1003_a(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
*/
		
		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.redm_dt = (String)hash.get("redm_dt");
		dm.incmg_pers_ipadd = (String)hash.get("incmg_pers_ipadd");
		dm.incmg_pers = (String)hash.get("incmg_pers");
		dm.chg_pers = (String)hash.get("chg_pers");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.redm_dt = Util.getSessionParameterValue(req,"redm_dt",true);
		dm.incmg_pers_ipadd = Util.getSessionParameterValue(req,"incmg_pers_ipadd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"incmg_pers",true);
		dm.chg_pers = Util.getSessionParameterValue(req,"chg_pers",true);
		*******************************************************************************************/
	}	
	public void as_redm_1501_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
		AS_REDM_1501_MDataSet ds = null;
		AS_REDM_1501_MDM dm = new AS_REDM_1501_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);

//		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISAST");
		ds = (AS_REDM_1501_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		*******************************************************************************************/
	} 
	public void as_redm_1502_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		AS_REDM_1502_LDataSet ds = null;
		AS_REDM_1502_LDM dm = new AS_REDM_1502_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.redm_yymm = Util.checkString(req.getParameter("redm_yymm"));

//		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISAST");
		ds = (AS_REDM_1502_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */			
/*		
		try {
			AS_REDM_1000EJBHome home = (AS_REDM_1000EJBHome)JNDIManager.getInstance().getHome("AS_REDM_1000EJB");
			AS_REDM_1000EJB ejb = home.create();

			ds = ejb.as_redm_1000_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
*/
		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.redm_dt = (String)hash.get("redm_dt");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.redm_dt = Util.getSessionParameterValue(req,"redm_dt",true);
		*******************************************************************************************/
	}
	public void as_redm_1503_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		AS_REDM_1503_ADataSet ds = null;
		AS_REDM_1503_ADM dm = new AS_REDM_1503_ADM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.redm_yymm = Util.checkString(req.getParameter("redm_yymm"));
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.chg_pers = Util.getSessionParameterValue(req, "emp_no", true);

//		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISAST");
		ds = (AS_REDM_1503_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */		
								
/*		
		try {
			AS_REDM_1000EJBHome home = (AS_REDM_1000EJBHome)JNDIManager.getInstance().getHome("AS_REDM_1000EJB");
			AS_REDM_1000EJB ejb = home.create();

			ds = ejb.as_redm_1002_a(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
*/
		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.mst_mode = (String)hash.get("mst_mode");
		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.dept_cd = (String)hash.get("dept_cd");
		dm.redm_dt = (String)hash.get("redm_dt");
		dm.incmg_pers_ipadd = (String)hash.get("incmg_pers_ipadd");
		dm.incmg_pers = (String)hash.get("incmg_pers");
		dm.chg_pers = (String)hash.get("chg_pers");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.mst_mode = Util.getSessionParameterValue(req,"mst_mode",true);
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.dept_cd = Util.getSessionParameterValue(req,"dept_cd",true);
		dm.redm_dt = Util.getSessionParameterValue(req,"redm_dt",true);
		dm.incmg_pers_ipadd = Util.getSessionParameterValue(req,"incmg_pers_ipadd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"incmg_pers",true);
		dm.chg_pers = Util.getSessionParameterValue(req,"chg_pers",true);
		*******************************************************************************************/
	}	
}

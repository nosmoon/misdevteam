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

package chosun.ciis.as.lear.wb;

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
import chosun.ciis.as.lear.dm.*;
import chosun.ciis.as.lear.ds.*;

/**
 * 
 */

public class AS_LEAR_1000WB extends BaseWB {
    
	public void as_lear_1001_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
		AS_LEAR_1001_MDataSet ds = null;
		AS_LEAR_1001_MDM dm = new AS_LEAR_1001_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);

//		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISAST");
		ds = (AS_LEAR_1001_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */		
/*		
		try {
			AS_LEAR_1000EJBHome home = (AS_LEAR_1000EJBHome)JNDIManager.getInstance().getHome("AS_LEAR_1000EJB");
			AS_LEAR_1000EJB ejb = home.create();

			ds = ejb.as_lear_1001_m(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
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
	public void as_lear_1002_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		AS_LEAR_1002_LDataSet ds = null;
		AS_LEAR_1002_LDM dm = new AS_LEAR_1002_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.bldg_cd = Util.checkString(req.getParameter("bldg_cd"));
		dm.cntr_star = Util.checkString(req.getParameter("cntr_star"));
		
//		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISAST");
		ds = (AS_LEAR_1002_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */			
/*		
		try {
			AS_LEAR_1000EJBHome home = (AS_LEAR_1000EJBHome)JNDIManager.getInstance().getHome("AS_LEAR_1000EJB");
			AS_LEAR_1000EJB ejb = home.create();

			ds = ejb.as_lear_1002_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
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
		dm.bldg_cd = (String)hash.get("bldg_cd");
		dm.cntr_star = (String)hash.get("cntr_star");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.bldg_cd = Util.getSessionParameterValue(req,"bldg_cd",true);
		dm.cntr_star = Util.getSessionParameterValue(req,"cntr_star",true);
		*******************************************************************************************/
	}
	public void as_lear_1003_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		AS_LEAR_1003_LDataSet ds = null;
		AS_LEAR_1003_LDM dm = new AS_LEAR_1003_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.bldg_cd = Util.checkString(req.getParameter("bldg_cd"));
		dm.hire_dlco_ern = Util.checkString(req.getParameter("hire_dlco_ern"));
		dm.cntr_star = Util.checkString(req.getParameter("cntr_star"));
		
//		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISAST");
		ds = (AS_LEAR_1003_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */		
/*		
		try {
			AS_LEAR_1000EJBHome home = (AS_LEAR_1000EJBHome)JNDIManager.getInstance().getHome("AS_LEAR_1000EJB");
			AS_LEAR_1000EJB ejb = home.create();

			ds = ejb.as_lear_1003_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
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
		dm.bldg_cd = (String)hash.get("bldg_cd");
		dm.hire_dlco_ern = (String)hash.get("hire_dlco_ern");
		dm.cntr_star = (String)hash.get("cntr_star");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.bldg_cd = Util.getSessionParameterValue(req,"bldg_cd",true);
		dm.hire_dlco_ern = Util.getSessionParameterValue(req,"hire_dlco_ern",true);
		dm.cntr_star = Util.getSessionParameterValue(req,"cntr_star",true);
		*******************************************************************************************/
	}
	public void as_lear_1004_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		AS_LEAR_1004_LDataSet ds = null;
		AS_LEAR_1004_LDM dm = new AS_LEAR_1004_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.occr_dt_f = Util.checkString(req.getParameter("occr_dt_f"));
		dm.occr_dt_t = Util.checkString(req.getParameter("occr_dt_t"));
		dm.cntr_no = Util.checkString(req.getParameter("cntr_no"));
		dm.bldg_cd = Util.checkString(req.getParameter("bldg_cd"));
		dm.hire_dlco_ern = Util.checkString(req.getParameter("hire_dlco_ern"));

//		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISAST");
		ds = (AS_LEAR_1004_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */		
/*		
		try {
			AS_LEAR_1000EJBHome home = (AS_LEAR_1000EJBHome)JNDIManager.getInstance().getHome("AS_LEAR_1000EJB");
			AS_LEAR_1000EJB ejb = home.create();

			ds = ejb.as_lear_1004_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
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
		dm.occr_dt_f = (String)hash.get("occr_dt_f");
		dm.occr_dt_t = (String)hash.get("occr_dt_t");
		dm.cntr_no = (String)hash.get("cntr_no");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.occr_dt_f = Util.getSessionParameterValue(req,"occr_dt_f",true);
		dm.occr_dt_t = Util.getSessionParameterValue(req,"occr_dt_t",true);
		dm.cntr_no = Util.getSessionParameterValue(req,"cntr_no",true);
		*******************************************************************************************/
	}
	public void as_lear_1201_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		AS_LEAR_1201_LDataSet ds = null;
		AS_LEAR_1201_LDM dm = new AS_LEAR_1201_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.bldg_cd = Util.checkString(req.getParameter("bldg_cd"));
		dm.clam_yymm1 = Util.checkString(req.getParameter("clam_yymm1"));
		dm.clam_yymm2 = Util.checkString(req.getParameter("clam_yymm2"));
		dm.rcpm_dt = Util.checkString(req.getParameter("rcpm_dt"));
		dm.misu_clsf = Util.checkString(req.getParameter("misu_clsf"));

//		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISAST");
		ds = (AS_LEAR_1201_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */	
		
/*		
		try {
			AS_LEAR_1000EJBHome home = (AS_LEAR_1000EJBHome)JNDIManager.getInstance().getHome("AS_LEAR_1000EJB");
			AS_LEAR_1000EJB ejb = home.create();

			ds = ejb.as_lear_1201_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
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
		dm.bldg_cd = (String)hash.get("bldg_cd");
		dm.clam_yymm1 = (String)hash.get("clam_yymm1");
		dm.clam_yymm2 = (String)hash.get("clam_yymm2");
		dm.rcpm_dt = (String)hash.get("rcpm_dt");
		dm.misu_clsf = (String)hash.get("misu_clsf");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.bldg_cd = Util.getSessionParameterValue(req,"bldg_cd",true);
		dm.clam_yymm1 = Util.getSessionParameterValue(req,"clam_yymm1",true);
		dm.clam_yymm2 = Util.getSessionParameterValue(req,"clam_yymm2",true);
		dm.rcpm_dt = Util.getSessionParameterValue(req,"rcpm_dt",true);
		dm.misu_clsf = Util.getSessionParameterValue(req,"misu_clsf",true);
		*******************************************************************************************/
	}
	public void as_lear_1202_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
		AS_LEAR_1202_MDataSet ds = null;
		AS_LEAR_1202_MDM dm = new AS_LEAR_1202_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);

//		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISAST");
		ds = (AS_LEAR_1202_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */	
				
/*		
		try {
			AS_LEAR_1000EJBHome home = (AS_LEAR_1000EJBHome)JNDIManager.getInstance().getHome("AS_LEAR_1000EJB");
			AS_LEAR_1000EJB ejb = home.create();

			ds = ejb.as_lear_1202_m(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
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
	public void as_lear_1301_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		AS_LEAR_1301_LDataSet ds = null;
		AS_LEAR_1301_LDM dm = new AS_LEAR_1301_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.leas_fr_dt = Util.checkString(req.getParameter("leas_fr_dt"));
		dm.leas_to_dt = Util.checkString(req.getParameter("leas_to_dt"));
		dm.interest_rate = Util.checkString(req.getParameter("interest_rate"));

//		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISAST");
		ds = (AS_LEAR_1301_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */				
		
/*		
		try {
			AS_LEAR_1000EJBHome home = (AS_LEAR_1000EJBHome)JNDIManager.getInstance().getHome("AS_LEAR_1000EJB");
			AS_LEAR_1000EJB ejb = home.create();

			ds = ejb.as_lear_1301_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
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
		dm.leas_fr_dt = (String)hash.get("leas_fr_dt");
		dm.leas_to_dt = (String)hash.get("leas_to_dt");
		dm.interest_rate = (String)hash.get("interest_rate");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.leas_fr_dt = Util.getSessionParameterValue(req,"leas_fr_dt",true);
		dm.leas_to_dt = Util.getSessionParameterValue(req,"leas_to_dt",true);
		dm.interest_rate = Util.getSessionParameterValue(req,"interest_rate",true);
		*******************************************************************************************/
	}
	
	public void as_lear_1302_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
		AS_LEAR_1302_MDataSet ds = null;
		AS_LEAR_1302_MDM dm = new AS_LEAR_1302_MDM();

		dm.basi_yy = Util.checkString(req.getParameter("basi_yy"));
		dm.basi_qq = Util.checkString(req.getParameter("basi_qq"));

//		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISAST");
		ds = (AS_LEAR_1302_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */				
		
/*		
		try {
			AS_LEAR_1000EJBHome home = (AS_LEAR_1000EJBHome)JNDIManager.getInstance().getHome("AS_LEAR_1000EJB");
			AS_LEAR_1000EJB ejb = home.create();

			ds = ejb.as_lear_1302_m(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
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

		dm.basi_yy = (String)hash.get("basi_yy");
		dm.basi_qq = (String)hash.get("basi_qq");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.basi_yy = Util.getSessionParameterValue(req,"basi_yy",true);
		dm.basi_qq = Util.getSessionParameterValue(req,"basi_qq",true);
		*******************************************************************************************/
	}
	public void as_lear_1401_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		AS_LEAR_1401_LDataSet ds = null;
		AS_LEAR_1401_LDM dm = new AS_LEAR_1401_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.bldg_cd = Util.checkString(req.getParameter("bldg_cd"));
		dm.clam_fr_dt = Util.checkString(req.getParameter("clam_fr_dt"));
		dm.clam_to_dt = Util.checkString(req.getParameter("clam_to_dt"));

//		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISAST");
		ds = (AS_LEAR_1401_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */				
				
/*		
		try {
			AS_LEAR_1000EJBHome home = (AS_LEAR_1000EJBHome)JNDIManager.getInstance().getHome("AS_LEAR_1000EJB");
			AS_LEAR_1000EJB ejb = home.create();

			ds = ejb.as_lear_1401_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
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
		dm.bldg_cd = (String)hash.get("bldg_cd");
		dm.clam_fr_dt = (String)hash.get("clam_fr_dt");
		dm.clam_to_dt = (String)hash.get("clam_to_dt");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.bldg_cd = Util.getSessionParameterValue(req,"bldg_cd",true);
		dm.clam_fr_dt = Util.getSessionParameterValue(req,"clam_fr_dt",true);
		dm.clam_to_dt = Util.getSessionParameterValue(req,"clam_to_dt",true);
		*******************************************************************************************/
	}


	public void as_lear_1501_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		AS_LEAR_1501_LDataSet ds = null;
		AS_LEAR_1501_LDM dm = new AS_LEAR_1501_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.bldg_cd = Util.checkString(req.getParameter("bldg_cd"));
		dm.clam_yymm1 = Util.checkString(req.getParameter("clam_yymm1"));
		dm.clam_yymm2 = Util.checkString(req.getParameter("clam_yymm2"));
		dm.base_dt = Util.checkString(req.getParameter("base_dt"));
		dm.cntr_star = Util.checkString(req.getParameter("cntr_star"));

		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISAST");
		ds = (AS_LEAR_1501_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */		
		/*
		try {
			AS_LEAR_1000EJBHome home = (AS_LEAR_1000EJBHome)JNDIManager.getInstance().getHome("AS_LEAR_1000EJB");
			AS_LEAR_1000EJB ejb = home.create();

			ds = ejb.as_lear_1501_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
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
		dm.bldg_cd = (String)hash.get("bldg_cd");
		dm.clam_yymm1 = (String)hash.get("clam_yymm1");
		dm.clam_yymm2 = (String)hash.get("clam_yymm2");
		dm.base_dt = (String)hash.get("base_dt");
		dm.cntr_star = (String)hash.get("cntr_star");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.bldg_cd = Util.getSessionParameterValue(req,"bldg_cd",true);
		dm.clam_yymm1 = Util.getSessionParameterValue(req,"clam_yymm1",true);
		dm.clam_yymm2 = Util.getSessionParameterValue(req,"clam_yymm2",true);
		dm.base_dt = Util.getSessionParameterValue(req,"base_dt",true);
		dm.cntr_star = Util.getSessionParameterValue(req,"cntr_star",true);
		*******************************************************************************************/
	}	
    
}

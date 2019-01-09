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

package chosun.ciis.as.asrd.wb;

import java.rmi.RemoteException;
import java.util.StringTokenizer;

import javax.ejb.CreateException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import chosun.ciis.co.base.wb.BaseWB;
import somo.framework.db.BaseDataSet;
import somo.framework.expt.AppException;
import somo.framework.expt.SysException;
import somo.framework.lib.JNDIManager;
import somo.framework.db.DBManager;
import somo.framework.log.LogManager;
import somo.framework.util.Util;
import chosun.ciis.as.asrd.dm.*;
import chosun.ciis.as.asrd.ds.*;

/**
 * 
 */

public class AS_ASRD_1000WB extends BaseWB {
    
	
	public void as_asrd_1301_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
		AS_ASRD_1301_MDataSet ds = null;
		AS_ASRD_1301_MDM dm = new AS_ASRD_1301_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);

//		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISAST");
		ds = (AS_ASRD_1301_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */		
/*		
		try {
			AS_ASRD_1000EJBHome home = (AS_ASRD_1000EJBHome)JNDIManager.getInstance().getHome("AS_ASRD_1000EJB");
			AS_ASRD_1000EJB ejb = home.create();

			ds = ejb.as_asrd_1301_m(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
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
	
	public void as_asrd_1302_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		AS_ASRD_1302_LDataSet ds = null;
		AS_ASRD_1302_LDM dm = new AS_ASRD_1302_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.aset_no_fr = Util.checkString(req.getParameter("aset_no_fr"));
		dm.aset_no_to = Util.checkString(req.getParameter("aset_no_to"));
		dm.dept_cd_fr = Util.checkString(req.getParameter("dept_cd_fr"));
		dm.dept_cd_to = Util.checkString(req.getParameter("dept_cd_to"));
		dm.bund_cd_fr = Util.checkString(req.getParameter("bund_cd_fr"));
		dm.bund_cd_to = Util.checkString(req.getParameter("bund_cd_to"));
		dm.acqr_dt_fr = Util.checkString(req.getParameter("acqr_dt_fr"));
		dm.acqr_dt_to = Util.checkString(req.getParameter("acqr_dt_to"));
		dm.sale_dt_fr = Util.checkString(req.getParameter("sale_dt_fr"));
		dm.sale_dt_to = Util.checkString(req.getParameter("sale_dt_to"));
		dm.cur_acqr_amt_fr = Util.checkString(req.getParameter("cur_acqr_amt_fr"));
		dm.cur_acqr_amt_to = Util.checkString(req.getParameter("cur_acqr_amt_to"));
		dm.aset_stat = Util.checkString(req.getParameter("aset_stat"));
		dm.aset_usag = Util.checkString(req.getParameter("aset_usag"));
		dm.aset_size = Util.checkString(req.getParameter("aset_size"));
		dm.aset_loca = Util.checkString(req.getParameter("aset_loca"));
		dm.aset_nm = Util.checkString(req.getParameter("aset_nm"));	
		dm.use_emp_no = Util.checkString(req.getParameter("use_emp_no"));	
		dm.srch_total = Util.checkString(req.getParameter("srch_total"));		
		
//		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISAST");
		ds = (AS_ASRD_1302_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */				
/*		
		try {
			AS_ASRD_1000EJBHome home = (AS_ASRD_1000EJBHome)JNDIManager.getInstance().getHome("AS_ASRD_1000EJB");
			AS_ASRD_1000EJB ejb = home.create();

			ds = ejb.as_asrd_1302_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
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
	}
	
	public void as_asrd_1401_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		AS_ASRD_1401_LDataSet ds = null;
		AS_ASRD_1401_LDM dm = new AS_ASRD_1401_LDM();

		dm.cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISAST");
		ds = (AS_ASRD_1401_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */			
/*
		try {
			AS_ASRD_1000EJBHome home = (AS_ASRD_1000EJBHome)JNDIManager.getInstance().getHome("AS_ASRD_1000EJB");
			AS_ASRD_1000EJB ejb = home.create();

			ds = ejb.as_asrd_1401_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
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
	
	public void as_asrd_1402_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		AS_ASRD_1402_LDataSet ds = null;
		AS_ASRD_1402_LDM dm = new AS_ASRD_1402_LDM();

		dm.cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.chg_dt_fr  = Util.checkString(req.getParameter("chg_dt_fr"));
		dm.chg_dt_to  = Util.checkString(req.getParameter("chg_dt_to"));
		dm.chg_clsf   = Util.checkString(req.getParameter("chg_clsf"));
		dm.aset_no_fr = Util.checkString(req.getParameter("aset_no_fr"));
		dm.aset_no_to = Util.checkString(req.getParameter("aset_no_to"));
		dm.flag 	  = Util.checkString(req.getParameter("flag"));
		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISAST");
		ds = (AS_ASRD_1402_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */		
/*		
		try {
			AS_ASRD_1000EJBHome home = (AS_ASRD_1000EJBHome)JNDIManager.getInstance().getHome("AS_ASRD_1000EJB");
			AS_ASRD_1000EJB ejb = home.create();

			ds = ejb.as_asrd_1402_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
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
	}
    
	public void as_asrd_1501_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
		AS_ASRD_1501_MDataSet ds = null;
		AS_ASRD_1501_MDM dm = new AS_ASRD_1501_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
//		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISAST");
		ds = (AS_ASRD_1501_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */		
		
/*		
		try {
			AS_ASRD_1000EJBHome home = (AS_ASRD_1000EJBHome)JNDIManager.getInstance().getHome("AS_ASRD_1000EJB");
			AS_ASRD_1000EJB ejb = home.create();

			ds = ejb.as_asrd_1501_m(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
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
	}
		
	public void as_asrd_1600_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		AS_ASRD_1600_LDataSet ds = null;
		AS_ASRD_1600_LDM dm = new AS_ASRD_1600_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.search_tag = Util.checkString(req.getParameter("search_tag"));
		dm.aset_no = Util.checkString(req.getParameter("aset_no"));
		dm.aset_nm = Util.checkString(req.getParameter("aset_nm"));
		dm.leas_bldg_cd = Util.checkString(req.getParameter("leas_bldg_cd"));
//		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISAST");
		ds = (AS_ASRD_1600_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */		
				
/*		
		try {
			AS_ASRD_1000EJBHome home = (AS_ASRD_1000EJBHome)JNDIManager.getInstance().getHome("AS_ASRD_1000EJB");
			AS_ASRD_1000EJB ejb = home.create();

			ds = ejb.as_asrd_1600_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
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
		dm.search_tag = (String)hash.get("search_tag");
		dm.aset_no = (String)hash.get("aset_no");
		dm.aset_nm = (String)hash.get("aset_nm");
		dm.leas_bldg_cd = (String)hash.get("leas_bldg_cd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.search_tag = Util.getSessionParameterValue(req,"search_tag",true);
		dm.aset_no = Util.getSessionParameterValue(req,"aset_no",true);
		dm.aset_nm = Util.getSessionParameterValue(req,"aset_nm",true);
		dm.leas_bldg_cd = Util.getSessionParameterValue(req,"leas_bldg_cd",true);
		*******************************************************************************************/
	}
	
	public void as_asrd_1700_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		AS_ASRD_1700_LDataSet ds = null;
		AS_ASRD_1700_LDM dm = new AS_ASRD_1700_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.search_tag = Util.checkString(req.getParameter("search_tag"));
		dm.item_cd = Util.checkString(req.getParameter("item_cd"));
		dm.item_nm = Util.checkString(req.getParameter("item_nm"));
//		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISAST");
		ds = (AS_ASRD_1700_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */		
				
/*		
		try {
			AS_ASRD_1000EJBHome home = (AS_ASRD_1000EJBHome)JNDIManager.getInstance().getHome("AS_ASRD_1000EJB");
			AS_ASRD_1000EJB ejb = home.create();

			ds = ejb.as_asrd_1700_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
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
		dm.search_tag = (String)hash.get("search_tag");
		dm.item_cd = (String)hash.get("item_cd");
		dm.item_nm = (String)hash.get("item_nm");
		*******************************************************************************************/
	}
	public void as_asrd_1800_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		AS_ASRD_1800_LDataSet ds = null;
		AS_ASRD_1800_LDM dm = new AS_ASRD_1800_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.search_tag = Util.checkString(req.getParameter("search_tag"));
		dm.bund_cd = Util.checkString(req.getParameter("bund_cd"));
		dm.bund_nm = Util.checkString(req.getParameter("bund_nm"));
//		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISAST");
		ds = (AS_ASRD_1800_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */		
					
/*		
		try {
			AS_ASRD_1000EJBHome home = (AS_ASRD_1000EJBHome)JNDIManager.getInstance().getHome("AS_ASRD_1000EJB");
			AS_ASRD_1000EJB ejb = home.create();

			ds = ejb.as_asrd_1800_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
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
		dm.search_tag = (String)hash.get("search_tag");
		dm.bund_cd = (String)hash.get("bund_cd");
		dm.bund_nm = (String)hash.get("bund_nm");
		*******************************************************************************************/
	}

	public void as_asrd_1901_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		AS_ASRD_1901_LDataSet ds = null;
		AS_ASRD_1901_LDM dm = new AS_ASRD_1901_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.fr_aset_no = Util.checkString(req.getParameter("fr_aset_no"));
		dm.to_aset_no = Util.checkString(req.getParameter("to_aset_no"));
		dm.buy_clsf = Util.checkString(req.getParameter("buy_clsf"));
		dm.fr_dept_cd = Util.checkString(req.getParameter("fr_dept_cd"));
		dm.to_dept_cd = Util.checkString(req.getParameter("to_dept_cd"));
		dm.fr_acqr_dt = Util.checkString(req.getParameter("fr_acqr_dt"));
		dm.to_acqr_dt = Util.checkString(req.getParameter("to_acqr_dt"));
		dm.aset_no_list = Util.checkString(req.getParameter("aset_no_list"));
		dm.aset_no_clsf = Util.checkString(req.getParameter("aset_no_clsf"));
//		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISAST");
		ds = (AS_ASRD_1901_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */		
			
/*		
		try {
			AS_ASRD_1000EJBHome home = (AS_ASRD_1000EJBHome)JNDIManager.getInstance().getHome("AS_ASRD_1000EJB");
			AS_ASRD_1000EJB ejb = home.create();

			ds = ejb.as_asrd_1901_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
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
		dm.fr_aset_no = (String)hash.get("fr_aset_no");
		dm.to_aset_no = (String)hash.get("to_aset_no");
		dm.buy_clsf = (String)hash.get("buy_clsf");
		dm.fr_dept_cd = (String)hash.get("fr_dept_cd");
		dm.to_dept_cd = (String)hash.get("to_dept_cd");
		dm.fr_acqr_dt = (String)hash.get("fr_acqr_dt");
		dm.to_acqr_dt = (String)hash.get("to_acqr_dt");
		dm.aset_no_list = (String)hash.get("aset_no_list");
		dm.aset_no_clsf = (String)hash.get("aset_no_clsf");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.fr_aset_no = Util.getSessionParameterValue(req,"fr_aset_no",true);
		dm.to_aset_no = Util.getSessionParameterValue(req,"to_aset_no",true);
		dm.buy_clsf = Util.getSessionParameterValue(req,"buy_clsf",true);
		dm.fr_dept_cd = Util.getSessionParameterValue(req,"fr_dept_cd",true);
		dm.to_dept_cd = Util.getSessionParameterValue(req,"to_dept_cd",true);
		dm.fr_acqr_dt = Util.getSessionParameterValue(req,"fr_acqr_dt",true);
		dm.to_acqr_dt = Util.getSessionParameterValue(req,"to_acqr_dt",true);
		dm.aset_no_list = Util.getSessionParameterValue(req,"aset_no_list",true);
		dm.aset_no_clsf = Util.getSessionParameterValue(req,"aset_no_clsf",true);
		*******************************************************************************************/
	}

}

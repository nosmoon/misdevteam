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

package chosun.ciis.as.base.wb;

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
import chosun.ciis.as.base.dm.*;
import chosun.ciis.as.base.ds.*;

/**
 * 
 */

public class AS_BASE_1000WB extends BaseWB {
    /**
     * 멀티레코드처리 row 구분자
     */
//    public final String ROW_SEPARATOR = "|";
    /**
     * 멀티레코드처리 column 구분자
     */
//    public final String COL_SEPARATOR = "#";
    
    public void as_base_1001_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		AS_BASE_1001_LDataSet ds = null;
		AS_BASE_1001_LDM dm = new AS_BASE_1001_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);

//		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISAST");
		ds = (AS_BASE_1001_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */		
		
/*		
		try {
			AS_BASE_1000EJBHome home = (AS_BASE_1000EJBHome)JNDIManager.getInstance().getHome("AS_BASE_1000EJB");
			AS_BASE_1000EJB ejb = home.create();

			ds = ejb.as_base_1001_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
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
    
    public void as_base_1002_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		AS_BASE_1002_LDataSet ds = null;
		AS_BASE_1002_LDM dm = new AS_BASE_1002_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.item_cd = Util.checkString(req.getParameter("item_cd"));
		dm.item_nm = Util.checkString(req.getParameter("item_nm"));
		dm.budg_cd = Util.checkString(req.getParameter("budg_cd"));
//		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISAST");
		ds = (AS_BASE_1002_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */		
			
/*		
		try {
			AS_BASE_1000EJBHome home = (AS_BASE_1000EJBHome)JNDIManager.getInstance().getHome("AS_BASE_1000EJB");
			AS_BASE_1000EJB ejb = home.create();

			ds = ejb.as_base_1002_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
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
    
    public void as_base_1003_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		AS_BASE_1003_ADataSet ds = null;
		AS_BASE_1003_ADM dm = new AS_BASE_1003_ADM();

		dm.mode = Util.checkString(req.getParameter("mode"));
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		String item = Util.checkString(req.getParameter("item_cd"));
		dm.setItem_cd(item.toUpperCase());
		//dm.item_cd = Util.checkString(req.getParameter("item_cd"));
		dm.item_nm = Util.checkString(req.getParameter("item_nm"));
		dm.unit_cd = Util.checkString(req.getParameter("unit_cd"));
		dm.redm_clsf = Util.checkString(req.getParameter("redm_clsf"));
		dm.redm_mthd_cd = Util.checkString(req.getParameter("redm_mthd_cd"));
		dm.svc_yys_cnt = Util.checkString(req.getParameter("svc_yys_cnt"));
		dm.budg_cd = Util.checkString(req.getParameter("budg_cd"));
		dm.use_yn = Util.checkString(req.getParameter("use_yn"));
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.chg_pers = Util.getSessionParameterValue(req, "emp_no", true);
//		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISAST");
		ds = (AS_BASE_1003_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */		
					
/*		
		try {
			AS_BASE_1000EJBHome home = (AS_BASE_1000EJBHome)JNDIManager.getInstance().getHome("AS_BASE_1000EJB");
			AS_BASE_1000EJB ejb = home.create();

			ds = ejb.as_base_1003_a(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
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
    
    public void as_base_1101_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
		AS_BASE_1101_MDataSet ds = null;
		AS_BASE_1101_MDM dm = new AS_BASE_1101_MDM();
		
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
//		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISAST");
		ds = (AS_BASE_1101_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */		
/*
		try {
			AS_BASE_1000EJBHome home = (AS_BASE_1000EJBHome)JNDIManager.getInstance().getHome("AS_BASE_1000EJB");
			AS_BASE_1000EJB ejb = home.create();

			ds = ejb.as_base_1101_m(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
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
   
	public void as_base_1102_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		AS_BASE_1102_LDataSet ds = null;
		AS_BASE_1102_LDM dm = new AS_BASE_1102_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.bund_cd = Util.checkString(req.getParameter("bund_cd"));
		dm.bund_nm = Util.checkString(req.getParameter("bund_nm"));
//		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISAST");
		ds = (AS_BASE_1102_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */		
/*		
		try {
			AS_BASE_1000EJBHome home = (AS_BASE_1000EJBHome)JNDIManager.getInstance().getHome("AS_BASE_1000EJB");
			AS_BASE_1000EJB ejb = home.create();

			ds = ejb.as_base_1102_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
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
		dm.bund_cd = (String)hash.get("bund_cd");
		dm.bund_nm = (String)hash.get("bund_nm");
		*******************************************************************************************/
	}

	public void as_base_1103_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		AS_BASE_1103_ADataSet ds = null;
		AS_BASE_1103_ADM dm = new AS_BASE_1103_ADM();

		dm.mode = Util.checkString(req.getParameter("mode"));
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.bund_cd = Util.checkString(req.getParameter("bund_cd"));
		dm.bund_nm = Util.checkString(req.getParameter("bund_nm"));
		dm.mang_dt = Util.checkString(req.getParameter("mang_dt"));
		dm.usag = Util.checkString(req.getParameter("usag"));
		dm.supv_dept_cd = Util.checkString(req.getParameter("supv_dept_cd"));
		dm.dlvs_plac = Util.checkString(req.getParameter("dlvs_plac"));
		dm.tot_amt = Util.checkString(req.getParameter("tot_amt"));
		dm.mony_unit_cd = Util.checkString(req.getParameter("mony_unit_cd"));
		dm.ltrm_adpay_cost = Util.checkString(req.getParameter("ltrm_adpay_cost"));
		dm.leas_cmpy = Util.checkString(req.getParameter("leas_cmpy"));
		dm.leas_no = Util.checkString(req.getParameter("leas_no"));
		dm.leas_frdt = Util.checkString(req.getParameter("leas_frdt"));
		dm.leas_todt = Util.checkString(req.getParameter("leas_todt"));
		dm.re_leas_frdt = Util.checkString(req.getParameter("re_leas_frdt"));
		dm.re_leas_todt = Util.checkString(req.getParameter("re_leas_todt"));
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.chg_pers = Util.getSessionParameterValue(req, "emp_no", true);
//		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISAST");
		ds = (AS_BASE_1103_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */			
/*		
		try {
			AS_BASE_1000EJBHome home = (AS_BASE_1000EJBHome)JNDIManager.getInstance().getHome("AS_BASE_1000EJB");
			AS_BASE_1000EJB ejb = home.create();

			ds = ejb.as_base_1103_a(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
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
		dm.bund_cd = (String)hash.get("bund_cd");
		dm.bund_nm = (String)hash.get("bund_nm");
		dm.mang_dt = (String)hash.get("mang_dt");
		dm.usag = (String)hash.get("usag");
		dm.supv_dept_cd = (String)hash.get("supv_dept_cd");
		dm.dlvs_plac = (String)hash.get("dlvs_plac");
		dm.tot_amt = (String)hash.get("tot_amt");
		dm.mony_unit_cd = (String)hash.get("mony_unit_cd");
		dm.ltrm_adpay_cost = (String)hash.get("ltrm_adpay_cost");
		dm.leas_cmpy = (String)hash.get("leas_cmpy");
		dm.leas_no = (String)hash.get("leas_no");
		dm.leas_frdt = (String)hash.get("leas_frdt");
		dm.leas_todt = (String)hash.get("leas_todt");
		dm.re_leas_frdt = (String)hash.get("re_leas_frdt");
		dm.re_leas_todt = (String)hash.get("re_leas_todt");
		dm.incmg_pers_ipadd = (String)hash.get("incmg_pers_ipadd");
		dm.incmg_pers = (String)hash.get("incmg_pers");
		dm.chg_pers = (String)hash.get("chg_pers");
		*******************************************************************************************/
	}
    
}

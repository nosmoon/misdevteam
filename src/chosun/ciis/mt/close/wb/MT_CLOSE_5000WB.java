package chosun.ciis.mt.close.wb;

import java.rmi.RemoteException;
import java.util.Hashtable;

import javax.ejb.CreateException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.expt.SysException; 
import somo.framework.lib.JNDIManager;
import somo.framework.log.LogManager;
import somo.framework.util.Util;
import somo.framework.db.BaseDataSet;
import somo.framework.db.DBManager;
import chosun.ciis.co.base.wb.BaseWB;

import chosun.ciis.mt.close.dm.*;
import chosun.ciis.mt.close.ds.*;
 
public class MT_CLOSE_5000WB extends BaseWB {

    /**
     * 멀티레코드처리 row 구분자
     */
    public final String ROW_SEPARATOR = "|";
    /**
     * 멀티레코드처리 column 구분자
     */
    public final String COL_SEPARATOR = "#";

    /**
     * 필름기준정보관리 화면조회
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    
    public void mt_close_5001_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		MT_CLOSE_5001_LDataSet ds = null;
		MT_CLOSE_5001_LDM dm = new MT_CLOSE_5001_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.in_yymm = Util.checkString(req.getParameter("in_yymm"));
		dm.fac_clsf = Util.checkString(req.getParameter("fac_clsf"));
		dm.matr_cd = Util.checkString(req.getParameter("matr_cd"));

		dm.print();
		
		/* EJB 수정후 시작 */

		DBManager manager = new DBManager("MISMAT");

		ds = (MT_CLOSE_5001_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
         	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        
        req.setAttribute("ds", ds);
        
        /* EJB 수정후 끝 */

        /* EJB 수정전 시작		
		try {
			MT_CLOSE_5000EJBHome home = (MT_CLOSE_5000EJBHome)JNDIManager.getInstance().getHome("MT_CLOSE_5000EJB");
			MT_CLOSE_5000EJB ejb = home.create();

			ds = ejb.mt_close_5001_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
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
		dm.in_yymm = (String)hash.get("in_yymm");
		dm.fac_clsf = (String)hash.get("fac_clsf");
		dm.matr_cd = (String)hash.get("matr_cd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.in_yymm = Util.getSessionParameterValue(req,"in_yymm",true);
		dm.fac_clsf = Util.getSessionParameterValue(req,"fac_clsf",true);
		dm.matr_cd = Util.getSessionParameterValue(req,"matr_cd",true);
		*******************************************************************************************/
	}
    
    public void mt_close_5002_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		MT_CLOSE_5002_ADataSet ds = null;
		MT_CLOSE_5002_ADM dm = new MT_CLOSE_5002_ADM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.in_yymm = Util.checkString(req.getParameter("in_yymm"));
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);

		dm.print();
		
		/* EJB 수정후 시작 */

		DBManager manager = new DBManager("MISMAT");

		ds = (MT_CLOSE_5002_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
         	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        
        req.setAttribute("ds", ds);
        
        /* EJB 수정후 끝 */

        /* EJB 수정전 시작		
		try {
			MT_CLOSE_5000EJBHome home = (MT_CLOSE_5000EJBHome)JNDIManager.getInstance().getHome("MT_CLOSE_5000EJB");
			MT_CLOSE_5000EJB ejb = home.create();

			ds = ejb.mt_close_5002_a(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
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
		dm.in_yymm = (String)hash.get("in_yymm");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.in_yymm = Util.getSessionParameterValue(req,"in_yymm",true);
		*******************************************************************************************/
	}
    
    public void mt_close_5003_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		MT_CLOSE_5003_ADataSet ds = null;
		MT_CLOSE_5003_ADM dm = new MT_CLOSE_5003_ADM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.in_yymm = Util.checkString(req.getParameter("in_yymm"));
		dm.slip_ymd = Util.checkString(req.getParameter("slip_ymd"));
		dm.in_sabeon = Util.getSessionParameterValue(req,"emp_no",true);
		dm.in_ipaddress = req.getRemoteAddr();

		dm.print();
		
		/* EJB 수정후 시작 */

		DBManager manager = new DBManager("MISMAT");

		ds = (MT_CLOSE_5003_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
         	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        
        req.setAttribute("ds", ds);
        
        /* EJB 수정후 끝 */

        /* EJB 수정전 시작		
		try {
			MT_CLOSE_5000EJBHome home = (MT_CLOSE_5000EJBHome)JNDIManager.getInstance().getHome("MT_CLOSE_5000EJB");
			MT_CLOSE_5000EJB ejb = home.create();

			ds = ejb.mt_close_5003_a(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
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
		dm.in_yymm = (String)hash.get("in_yymm");
		dm.slip_ymd = (String)hash.get("slip_ymd");
		dm.in_sabeon = (String)hash.get("in_sabeon");
		dm.in_ipaddress = (String)hash.get("in_ipaddress");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.in_yymm = Util.getSessionParameterValue(req,"in_yymm",true);
		dm.slip_ymd = Util.getSessionParameterValue(req,"slip_ymd",true);
		dm.in_sabeon = Util.getSessionParameterValue(req,"in_sabeon",true);
		dm.in_ipaddress = Util.getSessionParameterValue(req,"in_ipaddress",true);
		*******************************************************************************************/
	}
        
    public void mt_close_5004_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		MT_CLOSE_5004_ADataSet ds = null;
		MT_CLOSE_5004_ADM dm = new MT_CLOSE_5004_ADM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.in_yymm = Util.checkString(req.getParameter("in_yymm"));
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);

		dm.print();
		
		/* EJB 수정후 시작 */

		DBManager manager = new DBManager("MISMAT");

		ds = (MT_CLOSE_5004_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
         	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        
        req.setAttribute("ds", ds);
        
        /* EJB 수정후 끝 */

        /* EJB 수정전 시작		
		try {
			MT_CLOSE_5000EJBHome home = (MT_CLOSE_5000EJBHome)JNDIManager.getInstance().getHome("MT_CLOSE_5000EJB");
			MT_CLOSE_5000EJB ejb = home.create();

			ds = ejb.mt_close_5004_a(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
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
		dm.in_yymm = (String)hash.get("in_yymm");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.in_yymm = Util.getSessionParameterValue(req,"in_yymm",true);
		*******************************************************************************************/
	}
    
    public void mt_close_5005_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		MT_CLOSE_5005_ADataSet ds = null;
		MT_CLOSE_5005_ADM dm = new MT_CLOSE_5005_ADM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.aply_dt = Util.checkString(req.getParameter("aply_dt"));
		dm.fac_clsf = Util.checkString(req.getParameter("fac_clsf"));
		dm.matr_cd = Util.checkString(req.getParameter("matr_cd"));
		dm.ewh_budg_cd = Util.checkString(req.getParameter("ewh_budg_cd"));
		dm.owh_budg_cd = Util.checkString(req.getParameter("owh_budg_cd"));
		dm.dstb_rat_cd = Util.checkString(req.getParameter("dstb_rat_cd"));
		dm.owh_dept = Util.checkString(req.getParameter("owh_dept"));
		dm.incmg_pers_ipaddr = req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.mode = (String)hash.get("m");
		dm.row = (String)hash.get("rownum");
		dm.medi_cd = (String)hash.get("medi_cd");
		dm.sect_cd = (String)hash.get("sect_cd");
		dm.qunt = (String)hash.get("qunt");
		dm.amt = (String)hash.get("amt");
		
		dm.print();
		
		/* EJB 수정후 시작 */

		DBManager manager = new DBManager("MISMAT");

		ds = (MT_CLOSE_5005_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
         	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        
        req.setAttribute("ds", ds);
        
        /* EJB 수정후 끝 */

        /* EJB 수정전 시작		
		try {
			MT_CLOSE_5000EJBHome home = (MT_CLOSE_5000EJBHome)JNDIManager.getInstance().getHome("MT_CLOSE_5000EJB");
			MT_CLOSE_5000EJB ejb = home.create();

			ds = ejb.mt_close_5005_a(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
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
		dm.row = (String)hash.get("row");
		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.aply_dt = (String)hash.get("aply_dt");
		dm.fac_clsf = (String)hash.get("fac_clsf");
		dm.matr_cd = (String)hash.get("matr_cd");
		dm.medi_cd = (String)hash.get("medi_cd");
		dm.sect_cd = (String)hash.get("sect_cd");
		dm.qunt = (String)hash.get("qunt");
		dm.amt = (String)hash.get("amt");
		dm.ewh_budg_cd = (String)hash.get("ewh_budg_cd");
		dm.owh_budg_cd = (String)hash.get("owh_budg_cd");
		dm.dstb_rat_cd = (String)hash.get("dstb_rat_cd");
		dm.owh_dept = (String)hash.get("owh_dept");
		dm.incmg_pers_ipaddr = (String)hash.get("incmg_pers_ipaddr");
		dm.incmg_pers = (String)hash.get("incmg_pers");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.mode = Util.getSessionParameterValue(req,"mode",true);
		dm.row = Util.getSessionParameterValue(req,"row",true);
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.aply_dt = Util.getSessionParameterValue(req,"aply_dt",true);
		dm.fac_clsf = Util.getSessionParameterValue(req,"fac_clsf",true);
		dm.matr_cd = Util.getSessionParameterValue(req,"matr_cd",true);
		dm.medi_cd = Util.getSessionParameterValue(req,"medi_cd",true);
		dm.sect_cd = Util.getSessionParameterValue(req,"sect_cd",true);
		dm.qunt = Util.getSessionParameterValue(req,"qunt",true);
		dm.amt = Util.getSessionParameterValue(req,"amt",true);
		dm.ewh_budg_cd = Util.getSessionParameterValue(req,"ewh_budg_cd",true);
		dm.owh_budg_cd = Util.getSessionParameterValue(req,"owh_budg_cd",true);
		dm.dstb_rat_cd = Util.getSessionParameterValue(req,"dstb_rat_cd",true);
		dm.owh_dept = Util.getSessionParameterValue(req,"owh_dept",true);
		dm.incmg_pers_ipaddr = Util.getSessionParameterValue(req,"incmg_pers_ipaddr",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"incmg_pers",true);
		*******************************************************************************************/
	}
    
    public void mt_close_5006_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		MT_CLOSE_5006_LDataSet ds = null;
		MT_CLOSE_5006_LDM dm = new MT_CLOSE_5006_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.in_yymm = Util.checkString(req.getParameter("in_yymm"));
		dm.fac_clsf = Util.checkString(req.getParameter("fac_clsf"));
		dm.matr_cd = Util.checkString(req.getParameter("matr_cd"));

		dm.print();
		
		/* EJB 수정후 시작 */

		DBManager manager = new DBManager("MISMAT");

		ds = (MT_CLOSE_5006_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
         	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        
        req.setAttribute("ds", ds);
        
        /* EJB 수정후 끝 */

        /* EJB 수정전 시작		
		try {
			MT_CLOSE_5000EJBHome home = (MT_CLOSE_5000EJBHome)JNDIManager.getInstance().getHome("MT_CLOSE_5000EJB");
			MT_CLOSE_5000EJB ejb = home.create();

			ds = ejb.mt_close_5006_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
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
		dm.in_yymm = (String)hash.get("in_yymm");
		dm.fac_clsf = (String)hash.get("fac_clsf");
		dm.matr_cd = (String)hash.get("matr_cd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.in_yymm = Util.getSessionParameterValue(req,"in_yymm",true);
		dm.fac_clsf = Util.getSessionParameterValue(req,"fac_clsf",true);
		dm.matr_cd = Util.getSessionParameterValue(req,"matr_cd",true);
		*******************************************************************************************/
	}
    
    public void mt_close_5007_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		MT_CLOSE_5007_LDataSet ds = null;
		MT_CLOSE_5007_LDM dm = new MT_CLOSE_5007_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);

		dm.print();
		
		/* EJB 수정후 시작 */

		DBManager manager = new DBManager("MISMAT");

		ds = (MT_CLOSE_5007_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
         	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        
        req.setAttribute("ds", ds);
        
        /* EJB 수정후 끝 */

        /* EJB 수정전 시작		
		try {
			MT_CLOSE_5000EJBHome home = (MT_CLOSE_5000EJBHome)JNDIManager.getInstance().getHome("MT_CLOSE_5000EJB");
			MT_CLOSE_5000EJB ejb = home.create();

			ds = ejb.mt_close_5007_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
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
    
    public void mt_close_5008_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		MT_CLOSE_5008_ADataSet ds = null;
		MT_CLOSE_5008_ADM dm = new MT_CLOSE_5008_ADM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.in_yymm = Util.checkString(req.getParameter("in_yymm"));
		dm.in_sabeon = Util.getSessionParameterValue(req,"emp_no",true);
		dm.in_ipaddress = req.getRemoteAddr();

		dm.print();
		
		/* EJB 수정후 시작 */

		DBManager manager = new DBManager("MISMAT");

		ds = (MT_CLOSE_5008_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
         	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        
        req.setAttribute("ds", ds);
        
        /* EJB 수정후 끝 */

        /* EJB 수정전 시작		
		try {
			MT_CLOSE_5000EJBHome home = (MT_CLOSE_5000EJBHome)JNDIManager.getInstance().getHome("MT_CLOSE_5000EJB");
			MT_CLOSE_5000EJB ejb = home.create();

			ds = ejb.mt_close_5008_a(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
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
		dm.in_yymm = (String)hash.get("in_yymm");
		dm.in_sabeon = (String)hash.get("in_sabeon");
		dm.in_ipaddress = (String)hash.get("in_ipaddress");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.in_yymm = Util.getSessionParameterValue(req,"in_yymm",true);
		dm.in_sabeon = Util.getSessionParameterValue(req,"in_sabeon",true);
		dm.in_ipaddress = Util.getSessionParameterValue(req,"in_ipaddress",true);
		*******************************************************************************************/
	}
    
    public void mt_close_5009_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		MT_CLOSE_5009_ADataSet ds = null;
		MT_CLOSE_5009_ADM dm = new MT_CLOSE_5009_ADM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.aply_dt = Util.checkString(req.getParameter("aply_dt"));
		dm.incmg_pers_ipaddr = req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);;
		
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.mode = (String)hash.get("m");
		dm.row = (String)hash.get("row");
		dm.fac_clsf = (String)hash.get("fac_clsf");
		dm.matr_cd = (String)hash.get("matr_cd");
		dm.medi_cd = (String)hash.get("medi_cd");
		dm.sect_cd = (String)hash.get("sect_cd");
		dm.shet_qunt = (String)hash.get("shet_qunt");

		dm.print();
		
		/* EJB 수정후 시작 */

		DBManager manager = new DBManager("MISMAT");

		ds = (MT_CLOSE_5009_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
         	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        
        req.setAttribute("ds", ds);
        
        /* EJB 수정후 끝 */

        /* EJB 수정전 시작		
		try {
			MT_CLOSE_5000EJBHome home = (MT_CLOSE_5000EJBHome)JNDIManager.getInstance().getHome("MT_CLOSE_5000EJB");
			MT_CLOSE_5000EJB ejb = home.create();

			ds = ejb.mt_close_5009_a(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
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
		dm.row = (String)hash.get("row");
		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.aply_dt = (String)hash.get("aply_dt");
		dm.fac_clsf = (String)hash.get("fac_clsf");
		dm.matr_cd = (String)hash.get("matr_cd");
		dm.medi_cd = (String)hash.get("medi_cd");
		dm.sect_cd = (String)hash.get("sect_cd");
		dm.shet_qunt = (String)hash.get("shet_qunt");
		dm.incmg_pers_ipaddr = (String)hash.get("incmg_pers_ipaddr");
		dm.incmg_pers = (String)hash.get("incmg_pers");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.mode = Util.getSessionParameterValue(req,"mode",true);
		dm.row = Util.getSessionParameterValue(req,"row",true);
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.aply_dt = Util.getSessionParameterValue(req,"aply_dt",true);
		dm.fac_clsf = Util.getSessionParameterValue(req,"fac_clsf",true);
		dm.matr_cd = Util.getSessionParameterValue(req,"matr_cd",true);
		dm.medi_cd = Util.getSessionParameterValue(req,"medi_cd",true);
		dm.sect_cd = Util.getSessionParameterValue(req,"sect_cd",true);
		dm.shet_qunt = Util.getSessionParameterValue(req,"shet_qunt",true);
		dm.incmg_pers_ipaddr = Util.getSessionParameterValue(req,"incmg_pers_ipaddr",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"incmg_pers",true);
		*******************************************************************************************/
	}
    
    public void mt_close_5011_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		MT_CLOSE_5011_LDataSet ds = null;
		MT_CLOSE_5011_LDM dm = new MT_CLOSE_5011_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.in_yymm = Util.checkString(req.getParameter("in_yymm"));

		dm.print();
		
		/* EJB 수정후 시작 */

		DBManager manager = new DBManager("MISMAT");

		ds = (MT_CLOSE_5011_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
         	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        
        req.setAttribute("ds", ds);
        
        /* EJB 수정후 끝 */

        /* EJB 수정전 시작		
		try {
			MT_CLOSE_5000EJBHome home = (MT_CLOSE_5000EJBHome)JNDIManager.getInstance().getHome("MT_CLOSE_5000EJB");
			MT_CLOSE_5000EJB ejb = home.create();

			ds = ejb.mt_close_5011_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
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
		dm.in_yymm = (String)hash.get("in_yymm");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.in_yymm = Util.getSessionParameterValue(req,"in_yymm",true);
		*******************************************************************************************/
	}
    
    public void mt_close_5101_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		MT_CLOSE_5101_LDataSet ds = null;
		MT_CLOSE_5101_LDM dm = new MT_CLOSE_5101_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.in_yymm = Util.checkString(req.getParameter("in_yymm"));
		
		dm.print();
		
		/* EJB 수정후 시작 */

		DBManager manager = new DBManager("MISMAT");

		ds = (MT_CLOSE_5101_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
         	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        
        req.setAttribute("ds", ds);
        
	}
    
}
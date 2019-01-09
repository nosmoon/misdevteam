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
import somo.framework.db.DBManager;
import chosun.ciis.co.base.wb.BaseWB;

import chosun.ciis.mt.close.dm.*;
import chosun.ciis.mt.close.ds.*;
 
public class MT_CLOSE_9000WB extends BaseWB {

    /**
     * 멀티레코드처리 row 구분자
     */
    public final String ROW_SEPARATOR = "|";
    /**
     * 멀티레코드처리 column 구분자
     */
    public final String COL_SEPARATOR = "#";

    public void mt_close_9001_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		MT_CLOSE_9001_LDataSet ds = null;
		MT_CLOSE_9001_LDM dm = new MT_CLOSE_9001_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.in_yymm = Util.checkString(req.getParameter("in_yymm"));
		dm.fac_clsf = Util.checkString(req.getParameter("fac_clsf"));
		dm.matr_cd = Util.checkString(req.getParameter("matr_cd"));

		dm.print();
		
		/* EJB 수정후 시작 */

		DBManager manager = new DBManager("MISMAT");

		ds = (MT_CLOSE_9001_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
         	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        
        req.setAttribute("ds", ds);
        
        /* EJB 수정후 끝 */
        
        /* EJB 수정전 시작	

		try {
			MT_CLOSE_9000EJBHome home = (MT_CLOSE_9000EJBHome)JNDIManager.getInstance().getHome("MT_CLOSE_9000EJB");
			MT_CLOSE_9000EJB ejb = home.create();

			ds = ejb.mt_close_9001_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
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
    
    public void mt_close_9002_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		MT_CLOSE_9002_LDataSet ds = null;
		MT_CLOSE_9002_LDM dm = new MT_CLOSE_9002_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.in_yymm = Util.checkString(req.getParameter("in_yymm"));
		dm.fac_clsf = Util.checkString(req.getParameter("fac_clsf"));
		dm.matr_cd = Util.checkString(req.getParameter("matr_cd"));

		dm.print();
		
		/* EJB 수정후 시작 */

		DBManager manager = new DBManager("MISMAT");

		ds = (MT_CLOSE_9002_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
         	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        
        req.setAttribute("ds", ds);
        
        /* EJB 수정후 끝 */
        
        /* EJB 수정전 시작	

		try {
			MT_CLOSE_9000EJBHome home = (MT_CLOSE_9000EJBHome)JNDIManager.getInstance().getHome("MT_CLOSE_9000EJB");
			MT_CLOSE_9000EJB ejb = home.create();

			ds = ejb.mt_close_9002_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
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
    
    public void mt_close_9003_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		MT_CLOSE_9003_ADataSet ds = null;
		MT_CLOSE_9003_ADM dm = new MT_CLOSE_9003_ADM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.aply_dt = Util.checkString(req.getParameter("aply_dt"));
		dm.fac_clsf = Util.checkString(req.getParameter("fac_clsf"));
		dm.matr_cd = Util.checkString(req.getParameter("matr_cd"));
		dm.incmg_pers_ipaddr = req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.chong_amt = Util.checkString(req.getParameter("chong_amt"));
		
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.mode = (String)hash.get("m");
		dm.row = (String)hash.get("row");
		dm.medi_cd = (String)hash.get("medi_cd");
		dm.sect_cd = (String)hash.get("sect_cd");
		dm.qunt = (String)hash.get("qunt");
		dm.amt = (String)hash.get("amt");
		dm.print();
		
		/* EJB 수정후 시작 */

		DBManager manager = new DBManager("MISMAT");

		ds = (MT_CLOSE_9003_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
         	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        
        req.setAttribute("ds", ds);
        
        /* EJB 수정후 끝 */
        
        /* EJB 수정전 시작	

		try {
			MT_CLOSE_9000EJBHome home = (MT_CLOSE_9000EJBHome)JNDIManager.getInstance().getHome("MT_CLOSE_9000EJB");
			MT_CLOSE_9000EJB ejb = home.create();

			ds = ejb.mt_close_9003_a(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
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
		dm.incmg_pers_ipaddr = Util.getSessionParameterValue(req,"incmg_pers_ipaddr",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"incmg_pers",true);
		*******************************************************************************************/
	}
    
    public void mt_close_9004_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		MT_CLOSE_9004_LDataSet ds = null;
		MT_CLOSE_9004_LDM dm = new MT_CLOSE_9004_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);

		dm.print();
		
		/* EJB 수정후 시작 */

		DBManager manager = new DBManager("MISMAT");

		ds = (MT_CLOSE_9004_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
         	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        
        req.setAttribute("ds", ds);
        
        /* EJB 수정후 끝 */
        
        /* EJB 수정전 시작	

		try {
			MT_CLOSE_9000EJBHome home = (MT_CLOSE_9000EJBHome)JNDIManager.getInstance().getHome("MT_CLOSE_9000EJB");
			MT_CLOSE_9000EJB ejb = home.create();

			ds = ejb.mt_close_9004_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
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
    
    public void mt_close_9005_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		MT_CLOSE_9005_ADataSet ds = null;
		MT_CLOSE_9005_ADM dm = new MT_CLOSE_9005_ADM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.aply_dt = Util.checkString(req.getParameter("aply_dt"));
		dm.incmg_pers_ipaddr = req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.chong_amt = Util.checkString(req.getParameter("chong_amt"));
		
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.mode = (String)hash.get("m");
		dm.row = (String)hash.get("row");
		dm.fac_clsf = (String)hash.get("fac_clsf");
		dm.matr_cd = (String)hash.get("matr_cd");
		dm.medi_cd = (String)hash.get("medi_cd");
		dm.sect_cd = (String)hash.get("sect_cd");
		dm.qunt = (String)hash.get("qunt");
		dm.amt = (String)hash.get("amt");
		
		dm.print();
		
		/* EJB 수정후 시작 */

		DBManager manager = new DBManager("MISMAT");

		ds = (MT_CLOSE_9005_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
         	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        
        req.setAttribute("ds", ds);
        
        /* EJB 수정후 끝 */
        
        /* EJB 수정전 시작	

		try {
			MT_CLOSE_9000EJBHome home = (MT_CLOSE_9000EJBHome)JNDIManager.getInstance().getHome("MT_CLOSE_9000EJB");
			MT_CLOSE_9000EJB ejb = home.create();

			ds = ejb.mt_close_9005_a(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
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
		dm.chong_amt = (String)hash.get("chong_amt");
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
		dm.chong_amt = Util.getSessionParameterValue(req,"chong_amt",true);
		dm.incmg_pers_ipaddr = Util.getSessionParameterValue(req,"incmg_pers_ipaddr",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"incmg_pers",true);
		*******************************************************************************************/
	}
    
}
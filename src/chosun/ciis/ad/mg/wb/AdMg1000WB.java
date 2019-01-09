/***************************************************************************************************
* 파일명 : AdMg1000WB.java
* 기능 : 
 * 작성일자 : 
 * 작성자 : 김태길
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/

package chosun.ciis.ad.mg.wb;

import java.rmi.RemoteException;

import javax.ejb.CreateException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.expt.SysException;
import somo.framework.lib.JNDIManager;
import somo.framework.log.LogManager;
import somo.framework.util.Util;
import chosun.ciis.ad.mg.dao.AdMg1000DAO;
import chosun.ciis.ad.mg.dm.AD_MG_1010_LDM;
import chosun.ciis.ad.mg.dm.AD_MG_1020_ADM;
import chosun.ciis.ad.mg.dm.AD_MG_1030_ADM;
import chosun.ciis.ad.mg.dm.AD_MG_1040_ADM;
import chosun.ciis.ad.mg.dm.AD_MG_1050_ADM;
import chosun.ciis.ad.mg.dm.AD_MG_1060_ADM;
import chosun.ciis.ad.mg.ds.AD_MG_1010_LDataSet;
import chosun.ciis.ad.mg.ds.AD_MG_1020_ADataSet;
import chosun.ciis.ad.mg.ds.AD_MG_1030_ADataSet;
import chosun.ciis.ad.mg.ds.AD_MG_1040_ADataSet;
import chosun.ciis.ad.mg.ds.AD_MG_1050_ADataSet;
import chosun.ciis.ad.mg.ds.AD_MG_1060_ADataSet;
import chosun.ciis.co.base.wb.BaseWB;
/**
 * 
 */

public class AdMg1000WB extends BaseWB {

    /**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void ad_mg_1010_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	AD_MG_1010_LDataSet ds = null;

    	String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);
    	String work_clsf = Util.checkString(req.getParameter("work_clsf"));
    	String clos_dt	 = Util.checkString(req.getParameter("clos_dt"));

    	// DM Setting
    	AD_MG_1010_LDM dm = new AD_MG_1010_LDM();
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setWork_clsf(work_clsf);
    	dm.setClos_dt(clos_dt);
    	
    	//dm.print();

        try {
        	AdMg1000DAO	dao = new AdMg1000DAO();
            ds = dao.ad_mg_1010_l(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        }  
//        
//        AdMg1000EJBHome home = (AdMg1000EJBHome) JNDIManager.getInstance().getHome("AdMg1000EJB");
//        try {
//        	AdMg1000EJB ejb = home.create();
//            ds = ejb.ad_mg_1010_l(dm);
//            req.setAttribute("ds", ds);
//        }
//        catch (CreateException e) {
//            SysException se = new SysException(e);
//            LogManager.getInstance().log(se);
//            throw se;
//        }
//        catch (RemoteException e) {
//            SysException se = new SysException(e);
//            LogManager.getInstance().log(se);
//            throw se;
//        }
    }    
   

    /**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void ad_mg_1020_a(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	AD_MG_1020_ADataSet ds = null;

    	String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);
    	String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
    	String work_clsf  = Util.checkString(req.getParameter("work_clsf"));
    	String clos_dt	  = Util.checkString(req.getParameter("clos_dt"));
    	String basi_dt = Util.checkString(req.getParameter("basi_dt"));
    	String exec_no = Util.checkString(req.getParameter("exec_no"));
    	String incmg_pers_ip = req.getRemoteAddr();

    	// DM Setting
    	AD_MG_1020_ADM dm = new AD_MG_1020_ADM();
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setWork_clsf(work_clsf);
    	dm.setClos_dt(clos_dt);
    	dm.setBasi_dt(basi_dt);
    	dm.setExec_no(exec_no);
    	dm.setIncmg_pers_ip(incmg_pers_ip);
    	dm.setIncmg_pers(incmg_pers);
    	
    	dm.print();

        try {
        	AdMg1000DAO	dao = new AdMg1000DAO();
            ds = dao.ad_mg_1020_a(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        }  
//        
//        AdMg1000EJBHome home = (AdMg1000EJBHome) JNDIManager.getInstance().getHome("AdMg1000EJB");
//        try {
//        	AdMg1000EJB ejb = home.create();
//            ds = ejb.ad_mg_1020_a(dm);
//            req.setAttribute("ds", ds);
//        }
//        catch (CreateException e) {
//            SysException se = new SysException(e);
//            LogManager.getInstance().log(se);
//            throw se;
//        }
//        catch (RemoteException e) {
//            SysException se = new SysException(e);
//            LogManager.getInstance().log(se);
//            throw se;
//        }
    }    

    /**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void ad_mg_1030_a(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	AD_MG_1030_ADataSet ds = null;

    	String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);
    	String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
    	String work_clsf  = Util.checkString(req.getParameter("work_clsf"));
    	String clos_dt	  = Util.checkString(req.getParameter("clos_dt"));
    	String basi_dt = Util.checkString(req.getParameter("basi_dt"));
    	String exec_no = Util.checkString(req.getParameter("exec_no"));
    	String incmg_pers_ip = req.getRemoteAddr();

    	// DM Setting
    	AD_MG_1030_ADM dm = new AD_MG_1030_ADM();
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setWork_clsf(work_clsf);
    	dm.setClos_dt(clos_dt);
    	dm.setBasi_dt(basi_dt);
    	dm.setExec_no(exec_no);
    	dm.setIncmg_pers_ip(incmg_pers_ip);
    	dm.setIncmg_pers(incmg_pers);
    	
    	//dm.print();

        try {
        	AdMg1000DAO	dao = new AdMg1000DAO();
            ds = dao.ad_mg_1030_a(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        }  
//        
//        AdMg1000EJBHome home = (AdMg1000EJBHome) JNDIManager.getInstance().getHome("AdMg1000EJB");
//        try {
//        	AdMg1000EJB ejb = home.create();
//            ds = ejb.ad_mg_1030_a(dm);
//            req.setAttribute("ds", ds);
//        }
//        catch (CreateException e) {
//            SysException se = new SysException(e);
//            LogManager.getInstance().log(se);
//            throw se;
//        }
//        catch (RemoteException e) {
//            SysException se = new SysException(e);
//            LogManager.getInstance().log(se);
//            throw se;
//        }
    }    

    /**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void ad_mg_1040_a(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	AD_MG_1040_ADataSet ds = null;

    	String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);
    	String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
    	String dlco_no = Util.checkString(req.getParameter("dlco_no"));
    	String exec_no = Util.checkString(req.getParameter("exec_no"));
    	String basi_dt = Util.checkString(req.getParameter("basi_dt"));
    	String incmg_pers_ip = req.getRemoteAddr();

    	// DM Setting
    	AD_MG_1040_ADM dm = new AD_MG_1040_ADM();
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setDlco_no(dlco_no);
    	dm.setExec_no(exec_no);
    	dm.setBasi_dt(basi_dt);
    	dm.setIncmg_pers_ip(incmg_pers_ip);
    	dm.setIncmg_pers(incmg_pers);
    	
    	//dm.print();

        try {
        	AdMg1000DAO	dao = new AdMg1000DAO();
            ds = dao.ad_mg_1040_a(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        }  
//        
//        AdMg1000EJBHome home = (AdMg1000EJBHome) JNDIManager.getInstance().getHome("AdMg1000EJB");
//        try {
//        	AdMg1000EJB ejb = home.create();
//            ds = ejb.ad_mg_1040_a(dm);
//            req.setAttribute("ds", ds);
//        }
//        catch (CreateException e) {
//            SysException se = new SysException(e);
//            LogManager.getInstance().log(se);
//            throw se;
//        }
//        catch (RemoteException e) {
//            SysException se = new SysException(e);
//            LogManager.getInstance().log(se);
//            throw se;
//        }
    }    

    /**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void ad_mg_1050_a(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	AD_MG_1050_ADataSet ds = null;

    	String cmpy_cd    	= Util.getSessionParameterValue(req, "cmpycd", true);
    	String incmg_pers 	= Util.getSessionParameterValue(req, "emp_no", true);
    	String dlco_no 		= Util.checkString(req.getParameter("dlco_no"));
    	String exec_no 		= Util.checkString(req.getParameter("exec_no"));
    	String basi_dt 		= Util.checkString(req.getParameter("basi_dt"));
    	String incmg_pers_ip = req.getRemoteAddr();

    	// DM Setting
    	AD_MG_1050_ADM dm = new AD_MG_1050_ADM();
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setDlco_no(dlco_no);
    	dm.setExec_no(exec_no);
    	dm.setBasi_dt(basi_dt);
    	dm.setIncmg_pers_ip(incmg_pers_ip);
    	dm.setIncmg_pers(incmg_pers);
    	
    	dm.print();

        try {
        	AdMg1000DAO	dao = new AdMg1000DAO();
            ds = dao.ad_mg_1050_a(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        }

//        
//        AdMg1000EJBHome home = (AdMg1000EJBHome) JNDIManager.getInstance().getHome("AdMg1000EJB");
//        try {
//        	AdMg1000EJB ejb = home.create();
//            ds = ejb.ad_mg_1050_a(dm);
//            req.setAttribute("ds", ds);
//        }
//        catch (CreateException e) {
//            SysException se = new SysException(e);
//            LogManager.getInstance().log(se);
//            throw se;
//        }
//        catch (RemoteException e) {
//            SysException se = new SysException(e);
//            LogManager.getInstance().log(se);
//            throw se;
//        }
    }    

    /**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void ad_mg_1060_a(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	AD_MG_1060_ADataSet ds = null;

    	String cmpy_cd    	= Util.getSessionParameterValue(req, "cmpycd", true);
    	String incmg_pers 	= Util.getSessionParameterValue(req, "emp_no", true);
    	String dlco_no 		= Util.checkString(req.getParameter("dlco_no"));
    	String exec_no 		= Util.checkString(req.getParameter("exec_no"));
    	String basi_dt 		= Util.checkString(req.getParameter("basi_dt"));
    	String incmg_pers_ip = req.getRemoteAddr();

    	// DM Setting
    	AD_MG_1060_ADM dm = new AD_MG_1060_ADM();
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setDlco_no(dlco_no);
    	dm.setExec_no(exec_no);
    	dm.setBasi_dt(basi_dt);
    	dm.setIncmg_pers_ip(incmg_pers_ip);
    	dm.setIncmg_pers(incmg_pers);
    	
    	//dm.print();

        try {
        	AdMg1000DAO	dao = new AdMg1000DAO();
            ds = dao.ad_mg_1060_a(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        }  
//        
//        AdMg1000EJBHome home = (AdMg1000EJBHome) JNDIManager.getInstance().getHome("AdMg1000EJB");
//        try {
//        	AdMg1000EJB ejb = home.create();
//            ds = ejb.ad_mg_1060_a(dm);
//            req.setAttribute("ds", ds);
//        }
//        catch (CreateException e) {
//            SysException se = new SysException(e);
//            LogManager.getInstance().log(se);
//            throw se;
//        }
//        catch (RemoteException e) {
//            SysException se = new SysException(e);
//            LogManager.getInstance().log(se);
//            throw se;
//        }
    }    
}

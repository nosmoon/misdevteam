/***************************************************************************************************
* 파일명 : AdDep2300WB.java
* 기능 : 
 * 작성일자 : 
 * 작성자 : 정호근
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/

package chosun.ciis.ad.dep.wb;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.util.Util;
import chosun.ciis.ad.dep.dao.AdDep2300DAO;
import chosun.ciis.ad.dep.dm.AD_DEP_2300_MDM;
import chosun.ciis.ad.dep.dm.AD_DEP_2310_LDM;
import chosun.ciis.ad.dep.dm.AD_DEP_2320_LDM;
import chosun.ciis.ad.dep.dm.AD_DEP_2330_LDM;
import chosun.ciis.ad.dep.dm.AD_DEP_2340_LDM;
import chosun.ciis.ad.dep.ds.AD_DEP_2300_MDataSet;
import chosun.ciis.ad.dep.ds.AD_DEP_2310_LDataSet;
import chosun.ciis.ad.dep.ds.AD_DEP_2320_LDataSet;
import chosun.ciis.ad.dep.ds.AD_DEP_2330_LDataSet;
import chosun.ciis.ad.dep.ds.AD_DEP_2340_LDataSet;
import chosun.ciis.co.base.wb.BaseWB;
/**
 * 
 */

public class AdDep2300WB extends BaseWB {

    /**
     * 
     *
     * @param req HttpServletRequest
     * @param pub HttpServletResponse
     * @throws AppException
     */
    public void ad_dep_2300_m(HttpServletRequest req, HttpServletResponse pub) throws   AppException {
    	
    	AD_DEP_2300_MDataSet ds = null;

        // DM Setting
    	String cmpy_cd        = Util.getSessionParameterValue(req, "cmpycd", true);
    	String dealmedicd     = Util.getSessionParameterValue(req, "dealmedicd", true);

    	AD_DEP_2300_MDM dm = new AD_DEP_2300_MDM();
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setDealmedicd(dealmedicd);
       
//        dm.print();

        try {
        	AdDep2300DAO	dao = new AdDep2300DAO();
            ds = dao.ad_dep_2300_m(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        }    
//        
//        AdDep2300EJBHome home = (AdDep2300EJBHome) JNDIManager.getInstance().getHome("AdDep2300EJB");
//        try {
//        	AdDep2300EJB ejb = home.create();
//            ds = ejb.ad_dep_2300_m(dm);
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
     * @param pub HttpServletResponse
     * @throws AppException
     */
    public void ad_dep_2310_l(HttpServletRequest req, HttpServletResponse pub) throws   AppException {
    	
    	AD_DEP_2310_LDataSet ds = null;

        // DM Setting
    	String cmpy_cd        = Util.getSessionParameterValue(req, "cmpycd", true);
    	String medi_cd        = Util.checkString(req.getParameter("medi_cd"));
    	String frdt           = Util.checkString(req.getParameter("frdt"));
    	String todt           = Util.checkString(req.getParameter("todt"));
    	String frdt2          = Util.checkString(req.getParameter("frdt2"));
    	String todt2          = Util.checkString(req.getParameter("todt2"));
    	
    	AD_DEP_2310_LDM dm = new AD_DEP_2310_LDM();
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setMedi_cd(medi_cd);
    	dm.setFrdt(frdt);
    	dm.setTodt(todt);
    	dm.setFrdt2(frdt2);
    	dm.setTodt2(todt2);
       
        //dm.print();  

        try {
        	AdDep2300DAO	dao = new AdDep2300DAO();
            ds = dao.ad_dep_2310_l(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        }    
//        
//        AdDep2300EJBHome home = (AdDep2300EJBHome) JNDIManager.getInstance().getHome("AdDep2300EJB");
//        try {
//        	AdDep2300EJB ejb = home.create();
//            ds = ejb.ad_dep_2310_l(dm);
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
     * @param pub HttpServletResponse
     * @throws AppException
     */
    public void ad_dep_2320_l(HttpServletRequest req, HttpServletResponse pub) throws   AppException {
    	
    	AD_DEP_2320_LDataSet ds = null;

        // DM Setting
    	String cmpy_cd        = Util.getSessionParameterValue(req, "cmpycd", true);
    	String dealmedicd     = Util.getSessionParameterValue(req, "dealmedicd", true); 
    	String rcpm_dt 		  = Util.checkString(req.getParameter("rcpm_dt"));
    	
    	AD_DEP_2320_LDM dm = new AD_DEP_2320_LDM();
    	
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setDealmedicd(dealmedicd);
    	dm.setRcpm_dt(rcpm_dt);
       
        dm.print();     

        try {
        	AdDep2300DAO	dao = new AdDep2300DAO();
            ds = dao.ad_dep_2320_l(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        }    
//        
//        AdDep2300EJBHome home = (AdDep2300EJBHome) JNDIManager.getInstance().getHome("AdDep2300EJB");
//        try {
//        	AdDep2300EJB ejb = home.create();
//            ds = ejb.ad_dep_2320_l(dm);
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
     * @param pub HttpServletResponse
     * @throws AppException
     */
    public void ad_dep_2330_l(HttpServletRequest req, HttpServletResponse pub) throws   AppException {
    	
    	AD_DEP_2330_LDataSet ds = null;

        // DM Setting
    	String cmpy_cd        = Util.getSessionParameterValue(req, "cmpycd", true);
    	String dealmedicd     = Util.getSessionParameterValue(req, "dealmedicd", true); 
    	String rcpm_dt 	  	  = Util.checkString(req.getParameter("rcpm_dt"));
    	
    	AD_DEP_2330_LDM dm = new AD_DEP_2330_LDM();
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setDealmedicd(dealmedicd);
    	dm.setRcpm_dt(rcpm_dt);
       
        //dm.print();  

        try {
        	AdDep2300DAO	dao = new AdDep2300DAO();
            ds = dao.ad_dep_2330_l(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        }    
//        
//        AdDep2300EJBHome home = (AdDep2300EJBHome) JNDIManager.getInstance().getHome("AdDep2300EJB");
//        try {
//        	AdDep2300EJB ejb = home.create();
//            ds = ejb.ad_dep_2330_l(dm);
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
     * @param pub HttpServletResponse
     * @throws AppException
     */
    public void ad_dep_2340_l(HttpServletRequest req, HttpServletResponse pub) throws   AppException {
    	
    	AD_DEP_2340_LDataSet ds = null;

        // DM Setting
    	String cmpy_cd        = Util.getSessionParameterValue(req, "cmpycd", true);
    	String dealmedicd     = Util.getSessionParameterValue(req, "dealmedicd", true); 
    	String frdt           = Util.checkString(req.getParameter("frdt"));
    	String todt           = Util.checkString(req.getParameter("todt"));
    	String frdt2          = Util.checkString(req.getParameter("ftdt2"));
    	String todt2          = Util.checkString(req.getParameter("todt2"));
    	
    	AD_DEP_2340_LDM dm = new AD_DEP_2340_LDM();
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setDealmedicd(dealmedicd);
    	dm.setFrdt(frdt);
    	dm.setTodt(todt);
    	dm.setFrdt2(frdt2);
    	dm.setTodt2(todt2);
       
        //dm.print();   

        try {
        	AdDep2300DAO	dao = new AdDep2300DAO();
            ds = dao.ad_dep_2340_l(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        }    
//        
//        AdDep2300EJBHome home = (AdDep2300EJBHome) JNDIManager.getInstance().getHome("AdDep2300EJB");
//        try {
//        	AdDep2300EJB ejb = home.create();
//            ds = ejb.ad_dep_2340_l(dm);
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

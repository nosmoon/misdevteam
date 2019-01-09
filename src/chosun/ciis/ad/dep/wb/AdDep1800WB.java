/***************************************************************************************************
* 파일명 : AdDep1800WB.java
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
import chosun.ciis.ad.dep.dao.AdDep1800DAO;
import chosun.ciis.ad.dep.dm.AD_DEP_1800_MDM;
import chosun.ciis.ad.dep.dm.AD_DEP_1810_LDM;
import chosun.ciis.ad.dep.dm.AD_DEP_1820_LDM;
import chosun.ciis.ad.dep.dm.AD_DEP_1830_LDM;
import chosun.ciis.ad.dep.dm.AD_DEP_1840_LDM;
import chosun.ciis.ad.dep.dm.AD_DEP_1850_LDM;
import chosun.ciis.ad.dep.ds.AD_DEP_1800_MDataSet;
import chosun.ciis.ad.dep.ds.AD_DEP_1810_LDataSet;
import chosun.ciis.ad.dep.ds.AD_DEP_1820_LDataSet;
import chosun.ciis.ad.dep.ds.AD_DEP_1830_LDataSet;
import chosun.ciis.ad.dep.ds.AD_DEP_1840_LDataSet;
import chosun.ciis.ad.dep.ds.AD_DEP_1850_LDataSet;
import chosun.ciis.co.base.wb.BaseWB;
/**
 * 
 */

public class AdDep1800WB extends BaseWB {

    /**
     * 
     *
     * @param req HttpServletRequest
     * @param pub HttpServletResponse
     * @throws AppException
     */
    public void ad_dep_1800_m(HttpServletRequest req, HttpServletResponse pub) throws   AppException {
    	
    	AD_DEP_1800_MDataSet ds = null;

        // DM Setting
    	String cmpy_cd        = Util.getSessionParameterValue(req, "cmpycd", true);
    	String medi_clsf      = Util.getSessionParameterValue(req, "dealmedicd", true);

    	
    	AD_DEP_1800_MDM dm = new AD_DEP_1800_MDM();
    	
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setMedi_clsf(medi_clsf);
       
        //dm.print();  

        try {
        	AdDep1800DAO	dao = new AdDep1800DAO();
            ds = dao.ad_dep_1800_m(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        }  
//        
//        AdDep1800EJBHome home = (AdDep1800EJBHome) JNDIManager.getInstance().getHome("AdDep1800EJB");
//        try {
//        	AdDep1800EJB ejb = home.create();
//            ds = ejb.ad_dep_1800_m(dm);
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
    public void ad_dep_1810_l(HttpServletRequest req, HttpServletResponse pub) throws   AppException {
    	
    	AD_DEP_1810_LDataSet ds = null;

        // DM Setting
    	String cmpy_cd        = Util.getSessionParameterValue(req, "cmpycd", true);
    	String hndl_clsf      = Util.checkString(req.getParameter("hndl_clsf"));
    	String dlco_no      = Util.checkString(req.getParameter("dlco_no"));
    	String frdt           = Util.checkString(req.getParameter("frdt"));
    	String todt           = Util.checkString(req.getParameter("todt"));
    	String mchrg_pers     = Util.checkString(req.getParameter("mchrg_pers"));
    	String month          = Util.checkString(req.getParameter("month"));

    	
    	AD_DEP_1810_LDM dm = new AD_DEP_1810_LDM();  
    	
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setHndl_clsf(hndl_clsf);
    	dm.setDlco_no(dlco_no);
    	dm.setFrdt(frdt);
    	dm.setTodt(todt);
    	dm.setMchrg_pers(mchrg_pers);
    	dm.setMonth(month);
       
        //dm.print();  

        try {
        	AdDep1800DAO	dao = new AdDep1800DAO();
            ds = dao.ad_dep_1810_l(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        }  
        
//        AdDep1800EJBHome home = (AdDep1800EJBHome) JNDIManager.getInstance().getHome("AdDep1800EJB");
//        try {
//        	AdDep1800EJB ejb = home.create();
//            ds = ejb.ad_dep_1810_l(dm);
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
    public void ad_dep_1820_l(HttpServletRequest req, HttpServletResponse pub) throws   AppException {
    	
    	AD_DEP_1820_LDataSet ds = null;

        // DM Setting
    	String cmpy_cd        = Util.getSessionParameterValue(req, "cmpycd", true);
    	String hndl_clsf      = Util.checkString(req.getParameter("hndl_clsf"));
    	String dlco_no        = Util.checkString(req.getParameter("dlco_no"));
    	String frdt           = Util.checkString(req.getParameter("frdt"));
    	String todt           = Util.checkString(req.getParameter("todt"));
    	
    	AD_DEP_1820_LDM dm = new AD_DEP_1820_LDM();
    	
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setHndl_clsf(hndl_clsf);
    	dm.setDlco_no(dlco_no);
    	dm.setFrdt(frdt);
    	dm.setTodt(todt);
       
        dm.print();    

        try {
        	AdDep1800DAO	dao = new AdDep1800DAO();
            ds = dao.ad_dep_1820_l(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        }          
//        
//        AdDep1800EJBHome home = (AdDep1800EJBHome) JNDIManager.getInstance().getHome("AdDep1800EJB");
//        try {
//        	AdDep1800EJB ejb = home.create();
//            ds = ejb.ad_dep_1820_l(dm);
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
    public void ad_dep_1830_l(HttpServletRequest req, HttpServletResponse pub) throws   AppException {
    	
    	AD_DEP_1830_LDataSet ds = null;

        // DM Setting
    	String cmpy_cd        = Util.getSessionParameterValue(req, "cmpycd", true);
    	String dlco_no        = Util.checkString(req.getParameter("dlco_no"));
    	String pubc_yymm      = Util.checkString(req.getParameter("pubc_yymm"));
    	String rcpm_frdt      = Util.checkString(req.getParameter("rcpm_frdt"));
    	String rcpm_todt      = Util.checkString(req.getParameter("rcpm_todt"));
    	
    	AD_DEP_1830_LDM dm = new AD_DEP_1830_LDM();
    	
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setDlco_no(dlco_no);
    	dm.setPubc_yymm(pubc_yymm);
    	dm.setRcpm_frdt(rcpm_frdt);
    	dm.setRcpm_todt(rcpm_todt);
       
        //dm.print(); 

        try {
        	AdDep1800DAO	dao = new AdDep1800DAO();
            ds = dao.ad_dep_1830_l(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        }          
//        
//        AdDep1800EJBHome home = (AdDep1800EJBHome) JNDIManager.getInstance().getHome("AdDep1800EJB");
//        try {
//        	AdDep1800EJB ejb = home.create();
//            ds = ejb.ad_dep_1830_l(dm);
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
    public void ad_dep_1840_l(HttpServletRequest req, HttpServletResponse pub) throws   AppException {
    	
    	AD_DEP_1840_LDataSet ds = null;

        // DM Setting
    	String cmpy_cd        = Util.getSessionParameterValue(req, "cmpycd", true);
    	String dlco_no        = Util.checkString(req.getParameter("dlco_no"));
    	String pubc_yymm      = Util.checkString(req.getParameter("pubc_yymm"));
    	String rcpm_frdt      = Util.checkString(req.getParameter("rcpm_frdt"));
    	String rcpm_todt      = Util.checkString(req.getParameter("rcpm_todt"));
    	
    	AD_DEP_1840_LDM dm = new AD_DEP_1840_LDM();
    	
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setDlco_no(dlco_no);
    	dm.setPubc_yymm(pubc_yymm);
    	dm.setRcpm_frdt(rcpm_frdt);
    	dm.setRcpm_todt(rcpm_todt);
       
        //dm.print();  

        try {
        	AdDep1800DAO	dao = new AdDep1800DAO();
            ds = dao.ad_dep_1840_l(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        }          
//        
//        AdDep1800EJBHome home = (AdDep1800EJBHome) JNDIManager.getInstance().getHome("AdDep1800EJB");
//        try {
//        	AdDep1800EJB ejb = home.create();
//            ds = ejb.ad_dep_1840_l(dm);
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
    public void ad_dep_1850_l(HttpServletRequest req, HttpServletResponse pub) throws   AppException {
    	
    	AD_DEP_1850_LDataSet ds = null;

        // DM Setting
    	String cmpy_cd        = Util.getSessionParameterValue(req, "cmpycd", true);
    	String dlco_no        = Util.checkString(req.getParameter("dlco_no"));
    	String frdt           = Util.checkString(req.getParameter("frdt"));
    	String rcpm_frdt      = Util.checkString(req.getParameter("rcpm_frdt"));
    	String rcpm_todt      = Util.checkString(req.getParameter("rcpm_todt"));
    	
    	AD_DEP_1850_LDM dm = new AD_DEP_1850_LDM();
    	
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setDlco_no(dlco_no);
    	dm.setFrdt(frdt);
    	dm.setRcpm_frdt(rcpm_frdt);
    	dm.setRcpm_todt(rcpm_todt);
       
        //dm.print();  

        try {
        	AdDep1800DAO	dao = new AdDep1800DAO();
            ds = dao.ad_dep_1850_l(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        }          
//        
//        AdDep1800EJBHome home = (AdDep1800EJBHome) JNDIManager.getInstance().getHome("AdDep1800EJB");
//        try {
//        	AdDep1800EJB ejb = home.create();
//            ds = ejb.ad_dep_1850_l(dm);
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

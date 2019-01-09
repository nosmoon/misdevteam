/***************************************************************************************************
* 파일명 : AdEis1400WB.java
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

package chosun.ciis.ad.eis.wb;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.util.Util;
import chosun.ciis.ad.eis.dao.AdEis1400DAO;
import chosun.ciis.ad.eis.dm.AD_EIS_1400_MDM;
import chosun.ciis.ad.eis.dm.AD_EIS_1410_LDM;
import chosun.ciis.ad.eis.dm.AD_EIS_1420_LDM;
import chosun.ciis.ad.eis.dm.AD_EIS_1425_LDM;
import chosun.ciis.ad.eis.dm.AD_EIS_1430_LDM;
import chosun.ciis.ad.eis.dm.AD_EIS_1440_LDM;
import chosun.ciis.ad.eis.dm.AD_EIS_1450_LDM;
import chosun.ciis.ad.eis.ds.AD_EIS_1400_MDataSet;
import chosun.ciis.ad.eis.ds.AD_EIS_1410_LDataSet;
import chosun.ciis.ad.eis.ds.AD_EIS_1420_LDataSet;
import chosun.ciis.ad.eis.ds.AD_EIS_1425_LDataSet;
import chosun.ciis.ad.eis.ds.AD_EIS_1430_LDataSet;
import chosun.ciis.ad.eis.ds.AD_EIS_1440_LDataSet;
import chosun.ciis.ad.eis.ds.AD_EIS_1450_LDataSet;
import chosun.ciis.co.base.wb.BaseWB;
/**
 * 
 */

public class AdEis1400WB extends BaseWB {

    /**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void ad_eis_1400_m(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	AD_EIS_1400_MDataSet ds = null;

    	String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);
    	
    	// DM Setting
    	AD_EIS_1400_MDM dm = new AD_EIS_1400_MDM();
    	dm.setCmpy_cd(cmpy_cd);

        try {
        	AdEis1400DAO	dao = new AdEis1400DAO();
            ds = dao.ad_eis_1400_m(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        }  
//        
//        AdEis1400EJBHome home = (AdEis1400EJBHome) JNDIManager.getInstance().getHome("AdEis1400EJB");
//        try {
//        	AdEis1400EJB ejb = home.create();
//            ds = ejb.ad_eis_1400_m(dm);
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
    public void ad_eis_1410_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	AD_EIS_1410_LDataSet ds = null;

    	String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);
    	String frdt = Util.checkString(req.getParameter("frdt"));
    	String todt = Util.checkString(req.getParameter("todt"));
    	
    	// DM Setting
    	AD_EIS_1410_LDM dm = new AD_EIS_1410_LDM();
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setFrdt(frdt);
    	dm.setTodt(todt);

        try {
        	AdEis1400DAO	dao = new AdEis1400DAO();
            ds = dao.ad_eis_1410_l(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        }  
//        
//        AdEis1400EJBHome home = (AdEis1400EJBHome) JNDIManager.getInstance().getHome("AdEis1400EJB");
//        try {
//        	AdEis1400EJB ejb = home.create();
//            ds = ejb.ad_eis_1410_l(dm);
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
    public void ad_eis_1420_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	AD_EIS_1420_LDataSet ds = null;

    	String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);
    	String frdt = Util.checkString(req.getParameter("frdt"));
    	String todt = Util.checkString(req.getParameter("todt"));
    	
    	// DM Setting
    	AD_EIS_1420_LDM dm = new AD_EIS_1420_LDM();
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setFrdt(frdt);
    	dm.setTodt(todt);

        try {
        	AdEis1400DAO	dao = new AdEis1400DAO();
            ds = dao.ad_eis_1420_l(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        }  
//        
//        AdEis1400EJBHome home = (AdEis1400EJBHome) JNDIManager.getInstance().getHome("AdEis1400EJB");
//        try {
//        	AdEis1400EJB ejb = home.create();
//            ds = ejb.ad_eis_1420_l(dm);
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
    public void ad_eis_1425_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	AD_EIS_1425_LDataSet ds = null;

    	String cmpy_cd    	= Util.getSessionParameterValue(req, "cmpycd", true);
    	String indt_lcls 	= Util.checkString(req.getParameter("indt_lcls"));
    	String frdt 		= Util.checkString(req.getParameter("frdt"));
    	String todt 		= Util.checkString(req.getParameter("todt"));
    	
    	// DM Setting
    	AD_EIS_1425_LDM dm = new AD_EIS_1425_LDM();
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setIndt_lcls(indt_lcls);
    	dm.setFrdt(frdt);
    	dm.setTodt(todt);
        
    	//dm.print();

        try {
        	AdEis1400DAO	dao = new AdEis1400DAO();
            ds = dao.ad_eis_1425_l(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        }  
//        
//        AdEis1400EJBHome home = (AdEis1400EJBHome) JNDIManager.getInstance().getHome("AdEis1400EJB");
//        try {
//        	AdEis1400EJB ejb = home.create();
//            ds = ejb.ad_eis_1425_l(dm);
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
    public void ad_eis_1430_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	AD_EIS_1430_LDataSet ds = null;

    	String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);
    	String frdt = Util.checkString(req.getParameter("frdt"));
    	String todt = Util.checkString(req.getParameter("todt"));
    	
    	// DM Setting
    	AD_EIS_1430_LDM dm = new AD_EIS_1430_LDM();
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setFrdt(frdt);
    	dm.setTodt(todt);

        try {
        	AdEis1400DAO	dao = new AdEis1400DAO();
            ds = dao.ad_eis_1430_l(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        }  
//        
//        AdEis1400EJBHome home = (AdEis1400EJBHome) JNDIManager.getInstance().getHome("AdEis1400EJB");
//        try {
//        	AdEis1400EJB ejb = home.create();
//            ds = ejb.ad_eis_1430_l(dm);
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
    public void ad_eis_1440_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	AD_EIS_1440_LDataSet ds = null;

    	String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);
    	String frdt = Util.checkString(req.getParameter("frdt"));
    	String todt = Util.checkString(req.getParameter("todt"));
    	
    	// DM Setting
    	AD_EIS_1440_LDM dm = new AD_EIS_1440_LDM();
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setFrdt(frdt);
    	dm.setTodt(todt);

        try {
        	AdEis1400DAO	dao = new AdEis1400DAO();
            ds = dao.ad_eis_1440_l(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        }  
//        
//        AdEis1400EJBHome home = (AdEis1400EJBHome) JNDIManager.getInstance().getHome("AdEis1400EJB");
//        try {
//        	AdEis1400EJB ejb = home.create();
//            ds = ejb.ad_eis_1440_l(dm);
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
    public void ad_eis_1450_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	AD_EIS_1450_LDataSet ds = null;

    	String cmpy_cd    	= Util.getSessionParameterValue(req, "cmpycd", true);
    	String frdt 		= Util.checkString(req.getParameter("frdt"));
    	String todt 		= Util.checkString(req.getParameter("todt"));
    	String grp_cmpy_cd 	= Util.checkString(req.getParameter("grp_cmpy_cd"));
    	
    	// DM Setting
    	AD_EIS_1450_LDM dm = new AD_EIS_1450_LDM();
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setFrdt(frdt);
    	dm.setTodt(todt);
    	dm.setGrp_cmpy_cd(grp_cmpy_cd);
    	
    	//dm.print();

        try {
        	AdEis1400DAO	dao = new AdEis1400DAO();
            ds = dao.ad_eis_1450_l(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        }  
//        
//        AdEis1400EJBHome home = (AdEis1400EJBHome) JNDIManager.getInstance().getHome("AdEis1400EJB");
//        try {
//        	AdEis1400EJB ejb = home.create();
//            ds = ejb.ad_eis_1450_l(dm);
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

/***************************************************************************************************
* 파일명 : AdDep1600WB.java
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
import chosun.ciis.ad.dep.dao.AdDep1600DAO;
import chosun.ciis.ad.dep.dm.AD_DEP_1600_MDM;
import chosun.ciis.ad.dep.dm.AD_DEP_1610_LDM;
import chosun.ciis.ad.dep.dm.AD_DEP_1620_LDM;
import chosun.ciis.ad.dep.ds.AD_DEP_1600_MDataSet;
import chosun.ciis.ad.dep.ds.AD_DEP_1610_LDataSet;
import chosun.ciis.ad.dep.ds.AD_DEP_1620_LDataSet;
import chosun.ciis.co.base.wb.BaseWB;
/**
 * 
 */

public class AdDep1600WB extends BaseWB {

    /**
     * 
     *
     * @param req HttpServletRequest
     * @param pub HttpServletResponse
     * @throws AppException
     */
    public void ad_dep_1600_m(HttpServletRequest req, HttpServletResponse pub) throws   AppException {
    	
    	AD_DEP_1600_MDataSet ds = null;

        // DM Setting
    	String cmpy_cd        = Util.getSessionParameterValue(req, "cmpycd", true);
    	String medi_clsf      = Util.getSessionParameterValue(req, "dealmedicd", true);
    	String dealmedicd     = Util.getSessionParameterValue(req, "dealmedicd", true);

    	AD_DEP_1600_MDM dm = new AD_DEP_1600_MDM();
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setMedi_clsf(medi_clsf);
    	dm.setDealmedicd(dealmedicd);
       
        //dm.print();     

        try {
        	AdDep1600DAO	dao = new AdDep1600DAO();
            ds = dao.ad_dep_1600_m(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        }  
//        
//        AdDep1600EJBHome home = (AdDep1600EJBHome) JNDIManager.getInstance().getHome("AdDep1600EJB");
//        try {
//        	AdDep1600EJB ejb = home.create();
//            ds = ejb.ad_dep_1600_m(dm);
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
    public void ad_dep_1610_l(HttpServletRequest req, HttpServletResponse pub) throws   AppException {
    	
    	AD_DEP_1610_LDataSet ds = null;

        // DM Setting
    	String cmpy_cd        = Util.getSessionParameterValue(req, "cmpycd", true);
    	String medi_cd        = Util.checkString(req.getParameter("medi_cd"));
    	String dlco_clsf      = Util.checkString(req.getParameter("dlco_clsf"));
    	String dlco_no        = Util.checkString(req.getParameter("dlco_no"));
    	String frdt           = Util.checkString(req.getParameter("frdt"));
    	String todt           = Util.checkString(req.getParameter("todt"));
    	String slcrg_pers     = Util.checkString(req.getParameter("slcrg_pers"));
    	
    	AD_DEP_1610_LDM dm = new AD_DEP_1610_LDM();

    	dm.setCmpy_cd(cmpy_cd);
    	dm.setMedi_cd(medi_cd);
    	dm.setDlco_clsf(dlco_clsf);
    	dm.setDlco_no(dlco_no);
    	dm.setFrdt(frdt);
    	dm.setTodt(todt);
    	dm.setSlcrg_pers(slcrg_pers);
       
        //dm.print();  

        try {
        	AdDep1600DAO	dao = new AdDep1600DAO();
            ds = dao.ad_dep_1610_l(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        }  
//        
//        AdDep1600EJBHome home = (AdDep1600EJBHome) JNDIManager.getInstance().getHome("AdDep1600EJB");
//        try {
//        	AdDep1600EJB ejb = home.create();
//            ds = ejb.ad_dep_1610_l(dm);
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
    public void ad_dep_1620_l(HttpServletRequest req, HttpServletResponse pub) throws   AppException {
    	
    	AD_DEP_1620_LDataSet ds = null;

        // DM Setting
    	String cmpy_cd        = Util.getSessionParameterValue(req, "cmpycd", true);
    	String medi_cd        = Util.checkString(req.getParameter("medi_cd"));
    	String dlco_clsf      = Util.checkString(req.getParameter("dlco_clsf"));
    	String dlco_no        = Util.checkString(req.getParameter("dlco_no"));
    	String frdt           = Util.checkString(req.getParameter("frdt"));
    	String todt           = Util.checkString(req.getParameter("todt"));
    	String slcrg_pers     = Util.checkString(req.getParameter("slcrg_pers"));
    	
    	AD_DEP_1620_LDM dm = new AD_DEP_1620_LDM();

    	dm.setCmpy_cd(cmpy_cd);
    	dm.setMedi_cd(medi_cd);
    	dm.setDlco_clsf(dlco_clsf);
    	dm.setDlco_no(dlco_no);
    	dm.setFrdt(frdt);
    	dm.setTodt(todt);
    	dm.setSlcrg_pers(slcrg_pers);
       
        //dm.print();

        try {
        	AdDep1600DAO	dao = new AdDep1600DAO();
            ds = dao.ad_dep_1620_l(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        }  
//        
//        AdDep1600EJBHome home = (AdDep1600EJBHome) JNDIManager.getInstance().getHome("AdDep1600EJB");
//        try {
//        	AdDep1600EJB ejb = home.create();
//            ds = ejb.ad_dep_1620_l(dm);
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

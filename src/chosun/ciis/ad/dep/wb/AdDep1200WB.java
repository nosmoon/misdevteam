/***************************************************************************************************
* 파일명 : AdDep1200WB.java
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

package chosun.ciis.ad.dep.wb;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.util.Util;
import chosun.ciis.ad.dep.dao.AdDep1200DAO;
import chosun.ciis.ad.dep.dm.AD_DEP_1200_MDM;
import chosun.ciis.ad.dep.dm.AD_DEP_1210_LDM;
import chosun.ciis.ad.dep.dm.AD_DEP_1220_ADM;
import chosun.ciis.ad.dep.dm.AD_DEP_1230_ADM;
import chosun.ciis.ad.dep.ds.AD_DEP_1200_MDataSet;
import chosun.ciis.ad.dep.ds.AD_DEP_1210_LDataSet;
import chosun.ciis.ad.dep.ds.AD_DEP_1220_ADataSet;
import chosun.ciis.ad.dep.ds.AD_DEP_1230_ADataSet;
import chosun.ciis.co.base.wb.BaseWB;
/**
 * 
 */

public class AdDep1200WB extends BaseWB {
	
	/**
     * 
     *
     * @param req HttpServletRequest
     * @param pub HttpServletResponse
     * @throws AppException
     */
    public void ad_dep_1200_m(HttpServletRequest req, HttpServletResponse pub) throws   AppException {
    	
    	AD_DEP_1200_MDataSet ds = null;

        // DM Setting
    	String cmpy_cd        = Util.getSessionParameterValue(req, "cmpycd", true);
    	String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
    	
    	AD_DEP_1200_MDM dm = new AD_DEP_1200_MDM();
    	dm.setCmpy_cd(cmpy_cd);
        dm.setIncmg_pers(incmg_pers);
        
        dm.print();        

        try {
        	AdDep1200DAO	dao = new AdDep1200DAO();
            ds = dao.ad_dep_1200_m(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        }  
//        
//        AdDep1200EJBHome home = (AdDep1200EJBHome) JNDIManager.getInstance().getHome("AdDep1200EJB");
//        try {
//        	AdDep1200EJB ejb = home.create();
//            ds = ejb.ad_dep_1210_l(dm);
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
    public void ad_dep_1210_l(HttpServletRequest req, HttpServletResponse pub) throws   AppException {
    	
    	AD_DEP_1210_LDataSet ds = null;

        // DM Setting
    	String cmpy_cd        = Util.getSessionParameterValue(req, "cmpycd", true);
    	String slip_clsf_cd   = Util.checkString(req.getParameter("slip_clsf_cd"));
    	String clos_fryy        = Util.checkString(req.getParameter("clos_fryy"));
    	String clos_toyy        = Util.checkString(req.getParameter("clos_toyy"));

    	AD_DEP_1210_LDM dm = new AD_DEP_1210_LDM();
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setSlip_clsf_cd(slip_clsf_cd);
    	dm.setClos_fryy(clos_fryy);
    	dm.setClos_toyy(clos_toyy);
       
        dm.print();        

        try {
        	AdDep1200DAO	dao = new AdDep1200DAO();
            ds = dao.ad_dep_1210_l(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        }  
//        
//        AdDep1200EJBHome home = (AdDep1200EJBHome) JNDIManager.getInstance().getHome("AdDep1200EJB");
//        try {
//        	AdDep1200EJB ejb = home.create();
//            ds = ejb.ad_dep_1210_l(dm);
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
    public void ad_dep_1220_a(HttpServletRequest req, HttpServletResponse pub) throws   AppException {
    	
    	AD_DEP_1220_ADataSet ds = null;

        // DM Setting
    	String cmpy_cd        = Util.getSessionParameterValue(req, "cmpycd", true);
    	String slip_clsf_cd   = Util.checkString(req.getParameter("slip_clsf_cd"));
    	String clos_dt        = Util.checkString(req.getParameter("clos_dt"));

    	String incmg_pers_ip = req.getRemoteAddr();
    	String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
    	

    	AD_DEP_1220_ADM dm = new AD_DEP_1220_ADM();

    	dm.setCmpy_cd(cmpy_cd);
    	dm.setSlip_clsf_cd(slip_clsf_cd);
    	dm.setClos_dt(clos_dt);
    	dm.setIncmg_pers_ip(incmg_pers_ip);
    	dm.setIncmg_pers(incmg_pers);
       
        dm.print();

        try {
        	AdDep1200DAO	dao = new AdDep1200DAO();
            ds = dao.ad_dep_1220_a(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        }  
//        
//        AdDep1200EJBHome home = (AdDep1200EJBHome) JNDIManager.getInstance().getHome("AdDep1200EJB");
//        try {
//        	AdDep1200EJB ejb = home.create();
//            ds = ejb.ad_dep_1220_a(dm); 
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
    public void ad_dep_1230_a(HttpServletRequest req, HttpServletResponse pub) throws   AppException {
    	
    	AD_DEP_1230_ADataSet ds = null;

        // DM Setting
    	String cmpy_cd       = Util.getSessionParameterValue(req, "cmpycd", true);
    	String incmg_pers 	 = Util.getSessionParameterValue(req, "emp_no", true);
    	String incmg_pers_ip = req.getRemoteAddr();
    	String slip_clsf_cd  = Util.checkString(req.getParameter("slip_clsf_cd"));
    	String clos_dt       = Util.checkString(req.getParameter("clos_dt"));
    	
    	AD_DEP_1230_ADM dm = new AD_DEP_1230_ADM();

    	dm.setCmpy_cd(cmpy_cd);
    	dm.setSlip_clsf_cd(slip_clsf_cd);
    	dm.setClos_dt(clos_dt);
    	dm.setIncmg_pers_ip(incmg_pers_ip);
    	dm.setIncmg_pers(incmg_pers);
       
        dm.print();
        try {
        	AdDep1200DAO	dao = new AdDep1200DAO();
            ds = dao.ad_dep_1230_a(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        }  
//        
//        AdDep1200EJBHome home = (AdDep1200EJBHome) JNDIManager.getInstance().getHome("AdDep1200EJB");
//        try {
//        	AdDep1200EJB ejb = home.create();
//            ds = ejb.ad_dep_1230_a(dm); 
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

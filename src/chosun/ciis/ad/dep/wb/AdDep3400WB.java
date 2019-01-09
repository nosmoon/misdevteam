/***************************************************************************************************
* 파일명 : AdDep3400WB.java
* 기능 : 
 * 작성일자 : 
 * 작성자 : 김상훈
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
import chosun.ciis.ad.dep.dao.AdDep3400DAO;
import chosun.ciis.ad.dep.dm.AD_DEP_3400_MDM;
import chosun.ciis.ad.dep.dm.AD_DEP_3410_LDM;
import chosun.ciis.ad.dep.dm.AD_DEP_3420_LDM;
import chosun.ciis.ad.dep.dm.AD_DEP_3430_LDM;
import chosun.ciis.ad.dep.ds.AD_DEP_3400_MDataSet;
import chosun.ciis.ad.dep.ds.AD_DEP_3410_LDataSet;
import chosun.ciis.ad.dep.ds.AD_DEP_3420_LDataSet;
import chosun.ciis.ad.dep.ds.AD_DEP_3430_LDataSet;
import chosun.ciis.co.base.wb.BaseWB;
/**
 * 
 */

public class AdDep3400WB extends BaseWB {

    /**
     * 
     *
     * @param req HttpServletRequest
     * @param pub HttpServletResponse
     * @throws AppException
     */
    public void ad_dep_3400_m(HttpServletRequest req, HttpServletResponse pub) throws   AppException {
    	
    	AD_DEP_3400_MDataSet ds = null;

        // DM Setting
    	String cmpy_cd        = Util.getSessionParameterValue(req, "cmpycd", true);

    	AD_DEP_3400_MDM dm = new AD_DEP_3400_MDM();
    	dm.setCmpy_cd(cmpy_cd);
        //dm.print();

        try {
        	AdDep3400DAO	dao = new AdDep3400DAO();
            ds = dao.ad_dep_3400_m(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        }    
//        
//        AdDep3400EJBHome home = (AdDep3400EJBHome) JNDIManager.getInstance().getHome("AdDep3400EJB");
//        try {
//        	AdDep3400EJB ejb = home.create();
//            ds = ejb.ad_dep_3400_m(dm);
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
    public void ad_dep_3410_l(HttpServletRequest req, HttpServletResponse pub) throws   AppException {
    	
    	AD_DEP_3410_LDataSet ds = null;

        // DM Setting
    	String cmpy_cd      = 	Util.getSessionParameterValue(req, "cmpycd", true);
    	String medi_cd  	= 	Util.checkString(req.getParameter("medi_cd"));
    	String vat 			= 	Util.checkString(req.getParameter("vat"));
    	String pubc_ym 		= 	Util.checkString(req.getParameter("pubc_ym"));
    	//String cd 			= 	Util.checkString(req.getParameter("cd"));

    	AD_DEP_3410_LDM dm = new AD_DEP_3410_LDM();
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setMedi_cd(medi_cd);
    	dm.setVat(vat);
    	dm.setPubc_ym(pubc_ym);
    	//dm.setCd(cd);
    	
    	//dm.print();

        try {
        	AdDep3400DAO	dao = new AdDep3400DAO();
            ds = dao.ad_dep_3410_l(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        }    
//        
//        
//    	AdDep3400EJBHome home = (AdDep3400EJBHome) JNDIManager.getInstance().getHome("AdDep3400EJB");
//        try {
//        	AdDep3400EJB ejb = home.create();
//            ds = ejb.ad_dep_3410_l(dm);
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
    public void ad_dep_3420_l(HttpServletRequest req, HttpServletResponse pub) throws   AppException {
    	
    	AD_DEP_3420_LDataSet ds = null;

        // DM Setting
    	String cmpy_cd      = 	Util.getSessionParameterValue(req, "cmpycd", true);
    	String medi_cd  	= 	Util.checkString(req.getParameter("medi_cd"));
    	String vat 			= 	Util.checkString(req.getParameter("vat"));
    	String pubc_ym 		= 	Util.checkString(req.getParameter("pubc_ym"));
    	//String cd 			= 	Util.checkString(req.getParameter("cd"));

    	AD_DEP_3420_LDM dm = new AD_DEP_3420_LDM();
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setMedi_cd(medi_cd);
    	dm.setVat(vat);
    	dm.setPubc_ym(pubc_ym);
    	//dm.setCd(cd);
    	
    	//dm.print();

        try {
        	AdDep3400DAO	dao = new AdDep3400DAO();
            ds = dao.ad_dep_3420_l(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        }    
//        
//        AdDep3400EJBHome home = (AdDep3400EJBHome) JNDIManager.getInstance().getHome("AdDep3400EJB");
//        try {
//        	AdDep3400EJB ejb = home.create();
//            ds = ejb.ad_dep_3420_l(dm);
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
    public void ad_dep_3430_l(HttpServletRequest req, HttpServletResponse pub) throws   AppException {
    	
    	AD_DEP_3430_LDataSet ds = null;

        // DM Setting
    	String cmpy_cd      = 	Util.getSessionParameterValue(req, "cmpycd", true);
    	String pubc_ym 		= 	Util.checkString(req.getParameter("pubc_ym"));
    	String medi_cd 		= 	Util.checkString(req.getParameter("medi_cd"));

    	AD_DEP_3430_LDM dm = new AD_DEP_3430_LDM();
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setPubc_ym(pubc_ym);
    	dm.setMedi_cd(medi_cd);
    	
    	//dm.print();

        try {
        	AdDep3400DAO	dao = new AdDep3400DAO();
            ds = dao.ad_dep_3430_l(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        }    
//        
//               
//        AdDep3400EJBHome home = (AdDep3400EJBHome) JNDIManager.getInstance().getHome("AdDep3400EJB");
//        try {
//        	AdDep3400EJB ejb = home.create();
//            ds = ejb.ad_dep_3430_l(dm);
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

/***************************************************************************************************
* 파일명 : AdPub1400WB.java
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

package chosun.ciis.ad.pub.wb;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.util.Util;
import chosun.ciis.ad.pub.dao.AdPub1400DAO;
import chosun.ciis.ad.pub.dm.AD_PUB_1400_MDM;
import chosun.ciis.ad.pub.dm.AD_PUB_1410_ADM;
import chosun.ciis.ad.pub.dm.AD_PUB_1420_ADM;
import chosun.ciis.ad.pub.dm.AD_PUB_1430_LDM;
import chosun.ciis.ad.pub.ds.AD_PUB_1400_MDataSet;
import chosun.ciis.ad.pub.ds.AD_PUB_1410_ADataSet;
import chosun.ciis.ad.pub.ds.AD_PUB_1420_ADataSet;
import chosun.ciis.ad.pub.ds.AD_PUB_1430_LDataSet;
import chosun.ciis.co.base.wb.BaseWB;
/**
 * 
 */

public class AdPub1400WB extends BaseWB {

    /**
     * 
     *
     * @param req HttpServletRequest
     * @param pub HttpServletResponse
     * @throws AppException
     */
    public void ad_pub_1400_m(HttpServletRequest req, HttpServletResponse pub) throws   AppException {
    	
    	AD_PUB_1400_MDataSet ds = null;

        // DM Setting
    	AD_PUB_1400_MDM dm = new AD_PUB_1400_MDM();
    	String cmpy_cd     = Util.getSessionParameterValue(req, "cmpycd", true);
    	String clos_yymm   = Util.checkString(req.getParameter("clos_yymm"));
    	String work_clsf   = Util.checkString(req.getParameter("work_clsf"));

        dm.setCmpy_cd(cmpy_cd);
        dm.setClos_yymm(clos_yymm.substring(0,6));    
        dm.setWork_clsf(work_clsf);       
       
        //dm.print();

        try {
        	AdPub1400DAO	dao = new AdPub1400DAO();
            ds = dao.ad_pub_1400_m(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        } 
//        
//        AdPub1400EJBHome home = (AdPub1400EJBHome) JNDIManager.getInstance().getHome("AdPub1400EJB");
//        try {
//        	AdPub1400EJB ejb = home.create();
//            ds = ejb.ad_pub_1400_m(dm);
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
    public void ad_pub_1410_a(HttpServletRequest req, HttpServletResponse pub) throws   AppException {
    	
    	AD_PUB_1410_ADataSet ds = null;

        // DM Setting
    	AD_PUB_1410_ADM dm = new AD_PUB_1410_ADM();
    	String cmpy_cd     = Util.getSessionParameterValue(req, "cmpycd", true);
    	String work_clsf   = Util.checkString(req.getParameter("work_clsf"));
    	String clos_dt     = Util.checkString(req.getParameter("clos_dt"));
    	
    	String incmg_pers_ip = req.getRemoteAddr();
    	String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
    	String incmg_dept_cd = Util.getSessionParameterValue(req, "deptcd", true);
    	
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setWork_clsf(work_clsf);
    	dm.setClos_dt(clos_dt);
    	dm.setIncmg_dept_cd(incmg_dept_cd);
    	dm.setIncmg_pers_ip(incmg_pers_ip);
    	dm.setIncmg_pers(incmg_pers);         
       
        //dm.print();

        try {
        	AdPub1400DAO	dao = new AdPub1400DAO();
            ds = dao.ad_pub_1410_a(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        } 
//        
//        AdPub1400EJBHome home = (AdPub1400EJBHome) JNDIManager.getInstance().getHome("AdPub1400EJB");
//        try {
//        	AdPub1400EJB ejb = home.create();
//            ds = ejb.ad_pub_1410_a(dm);
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
    public void ad_pub_1420_a(HttpServletRequest req, HttpServletResponse pub) throws   AppException {
    	
    	AD_PUB_1420_ADataSet ds = null;

        // DM Setting
    	AD_PUB_1420_ADM dm = new AD_PUB_1420_ADM();
    	String cmpy_cd     = Util.getSessionParameterValue(req, "cmpycd", true);
    	String work_clsf   = Util.checkString(req.getParameter("work_clsf"));
    	String clos_dt     = Util.checkString(req.getParameter("clos_dt"));
    	
    	String incmg_pers_ip = req.getRemoteAddr();
    	String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
    	
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setWork_clsf(work_clsf);
    	dm.setClos_dt(clos_dt);
    	dm.setIncmg_pers_ip(incmg_pers_ip);
    	dm.setIncmg_pers(incmg_pers);         
       
        //dm.print();

        try {
        	AdPub1400DAO	dao = new AdPub1400DAO();
            ds = dao.ad_pub_1420_a(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        } 
//        
//        AdPub1400EJBHome home = (AdPub1400EJBHome) JNDIManager.getInstance().getHome("AdPub1400EJB");
//        try {
//        	AdPub1400EJB ejb = home.create();
//            ds = ejb.ad_pub_1420_a(dm);
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
    public void ad_pub_1430_l(HttpServletRequest req, HttpServletResponse pub) throws   AppException {
    	
    	AD_PUB_1430_LDataSet ds = null;
    	String cmpy_cd     = Util.getSessionParameterValue(req, "cmpycd", true);
    	String work_clsf   = Util.checkString(req.getParameter("work_clsf"));
    	String pubc_dt = Util.checkString(req.getParameter("pubc_dt"));

        // DM Setting
    	AD_PUB_1430_LDM dm = new AD_PUB_1430_LDM();
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setWork_clsf(work_clsf);
    	dm.setPubc_dt(pubc_dt);        
       
        dm.print();

        try {
        	AdPub1400DAO	dao = new AdPub1400DAO();
            ds = dao.ad_pub_1430_l(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        } 
//        
//        AdPub1400EJBHome home = (AdPub1400EJBHome) JNDIManager.getInstance().getHome("AdPub1400EJB");
//        try {
//        	AdPub1400EJB ejb = home.create();
//            ds = ejb.ad_pub_1430_l(dm);  
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

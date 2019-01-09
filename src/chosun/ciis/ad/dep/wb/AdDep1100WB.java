/***************************************************************************************************
* 파일명 : AdDep1000WB.java
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
import chosun.ciis.ad.dep.dao.AdDep1100DAO;
import chosun.ciis.ad.dep.dm.AD_DEP_1100_MDM;
import chosun.ciis.ad.dep.dm.AD_DEP_1101_MDM;
import chosun.ciis.ad.dep.dm.AD_DEP_1110_ADM;
import chosun.ciis.ad.dep.dm.AD_DEP_1111_ADM;
import chosun.ciis.ad.dep.dm.AD_DEP_1120_ADM;
import chosun.ciis.ad.dep.dm.AD_DEP_1121_ADM;
import chosun.ciis.ad.dep.dm.AD_DEP_1130_ADM;
import chosun.ciis.ad.dep.ds.AD_DEP_1100_MDataSet;
import chosun.ciis.ad.dep.ds.AD_DEP_1101_MDataSet;
import chosun.ciis.ad.dep.ds.AD_DEP_1110_ADataSet;
import chosun.ciis.ad.dep.ds.AD_DEP_1111_ADataSet;
import chosun.ciis.ad.dep.ds.AD_DEP_1120_ADataSet;
import chosun.ciis.ad.dep.ds.AD_DEP_1121_ADataSet;
import chosun.ciis.ad.dep.ds.AD_DEP_1130_ADataSet;
import chosun.ciis.co.base.wb.BaseWB;
/**
 * 
 */
public class AdDep1100WB extends BaseWB {

    /**
     * 
     *
     * @param req HttpServletRequest
     * @param pub HttpServletResponse
     * @throws AppException
     */
    public void ad_dep_1100_m(HttpServletRequest req, HttpServletResponse pub) throws   AppException {
    	
    	AD_DEP_1100_MDataSet ds = null;

        // DM Setting
    	AD_DEP_1100_MDM dm = new AD_DEP_1100_MDM();
    	String cmpy_cd     = Util.getSessionParameterValue(req, "cmpycd", true);
    	String clos_yymm   = Util.checkString(req.getParameter("dd_clos_yymm"));
    	String work_clsf   = Util.checkString(req.getParameter("dd_work_clsf"));

        dm.setCmpy_cd(cmpy_cd);
        dm.setClos_yymm(clos_yymm.substring(0,6));   
        dm.setWork_clsf(work_clsf);         
       
        //dm.print();
        try {
        	AdDep1100DAO	dao = new AdDep1100DAO();
            ds = dao.ad_dep_1100_m(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        }  
//        
//        
//        AdDep1100EJBHome home = (AdDep1100EJBHome) JNDIManager.getInstance().getHome("AdDep1100EJB");
//        try {
//        	AdDep1100EJB ejb = home.create();
//            ds = ejb.ad_dep_1100_m(dm);
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
    public void ad_dep_1101_m(HttpServletRequest req, HttpServletResponse pub) throws   AppException {
    	
    	AD_DEP_1101_MDataSet ds = null;

        // DM Setting
    	AD_DEP_1101_MDM dm = new AD_DEP_1101_MDM();
    	String cmpy_cd     = Util.getSessionParameterValue(req, "cmpycd", true);
    	String incmg_pers 		= Util.getSessionParameterValue(req, "emp_no", true);

        dm.setCmpy_cd(cmpy_cd);
        dm.setIncmg_pers(incmg_pers);
        
        dm.print();
        try {
        	AdDep1100DAO	dao = new AdDep1100DAO();
            ds = dao.ad_dep_1101_m(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        }  
//        
//        
//        AdDep1100EJBHome home = (AdDep1100EJBHome) JNDIManager.getInstance().getHome("AdDep1100EJB");
//        try {
//        	AdDep1100EJB ejb = home.create();
//            ds = ejb.ad_dep_1100_m(dm);
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
    public void ad_dep_1110_a(HttpServletRequest req, HttpServletResponse pub) throws   AppException {
    	
    	AD_DEP_1110_ADataSet ds = null;

        // DM Setting
    	AD_DEP_1110_ADM dm = new AD_DEP_1110_ADM();
    	String cmpy_cd     = Util.getSessionParameterValue(req, "cmpycd", true);
    	String work_clsf   = Util.checkString(req.getParameter("dd_work_clsf"));
    	String clos_dt     = Util.checkString(req.getParameter("dd_clos_dt"));
    	
    	String incmg_pers_ip 	= req.getRemoteAddr();
    	String incmg_pers 		= Util.getSessionParameterValue(req, "emp_no", true);
    	String incmg_dept_cd 	= Util.getSessionParameterValue(req, "deptcd", true);
    	
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setWork_clsf(work_clsf);
    	dm.setClos_dt(clos_dt);
    	dm.setIncmg_dept_cd(incmg_dept_cd);
    	dm.setIncmg_pers_ip(incmg_pers_ip);
    	dm.setIncmg_pers(incmg_pers);         
       
        dm.print();
          

        try {
        	AdDep1100DAO	dao = new AdDep1100DAO();
            ds = dao.ad_dep_1110_a(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        }  
//        
//        AdDep1100EJBHome home = (AdDep1100EJBHome) JNDIManager.getInstance().getHome("AdDep1100EJB");
//        try {
//        	AdDep1100EJB ejb = home.create();
//            ds = ejb.ad_dep_1110_a(dm);
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
    
public void ad_dep_1111_a(HttpServletRequest req, HttpServletResponse pub) throws   AppException {
    	
    	AD_DEP_1111_ADataSet ds = null;

        // DM Setting
    	AD_DEP_1111_ADM dm = new AD_DEP_1111_ADM();
    	String cmpy_cd     = Util.getSessionParameterValue(req, "cmpycd", true);
    	String work_clsf   = Util.checkString(req.getParameter("dd_work_clsf"));
    	String clos_dt     = Util.checkString(req.getParameter("dd_clos_dt"));
    	
    	String incmg_pers_ip 	= req.getRemoteAddr();
    	String incmg_pers 		= Util.getSessionParameterValue(req, "emp_no", true);
    	String incmg_dept_cd 	= Util.getSessionParameterValue(req, "deptcd", true);
    	
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setWork_clsf(work_clsf);
    	dm.setClos_dt(clos_dt);
    	dm.setIncmg_dept_cd(incmg_dept_cd);
    	dm.setIncmg_pers_ip(incmg_pers_ip);
    	dm.setIncmg_pers(incmg_pers);         
       
        dm.print();

        try {
        	AdDep1100DAO	dao = new AdDep1100DAO();
            ds = dao.ad_dep_1111_a(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        }
    }    

    public void ad_dep_1120_a(HttpServletRequest req, HttpServletResponse pub) throws   AppException {
    	
    	AD_DEP_1120_ADataSet ds = null;

        // DM Setting
    	AD_DEP_1120_ADM dm = new AD_DEP_1120_ADM();
    	String cmpy_cd     = Util.getSessionParameterValue(req, "cmpycd", true);
    	String work_clsf   = Util.checkString(req.getParameter("dd_work_clsf"));
    	String clos_dt     = Util.checkString(req.getParameter("dd_clos_dt"));
    	
    	String incmg_pers_ip = req.getRemoteAddr();
    	String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
    	
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setWork_clsf(work_clsf);
    	dm.setClos_dt(clos_dt);
    	dm.setIncmg_pers_ip(incmg_pers_ip);
    	dm.setIncmg_pers(incmg_pers);         
       
        dm.print();

        try {
        	AdDep1100DAO	dao = new AdDep1100DAO();
            ds = dao.ad_dep_1120_a(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        }  
//        
//        AdDep1100EJBHome home = (AdDep1100EJBHome) JNDIManager.getInstance().getHome("AdDep1100EJB");
//        try {
//        	AdDep1100EJB ejb = home.create();
//            ds = ejb.ad_dep_1120_a(dm);
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
    
public void ad_dep_1121_a(HttpServletRequest req, HttpServletResponse pub) throws   AppException {
    	
    	AD_DEP_1121_ADataSet ds = null;

        // DM Setting
    	AD_DEP_1121_ADM dm = new AD_DEP_1121_ADM();
    	String cmpy_cd     = Util.getSessionParameterValue(req, "cmpycd", true);
    	String work_clsf   = Util.checkString(req.getParameter("dd_work_clsf"));
    	String clos_dt     = Util.checkString(req.getParameter("dd_clos_dt"));
    	
    	String incmg_pers_ip = req.getRemoteAddr();
    	String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
    	
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setWork_clsf(work_clsf);
    	dm.setClos_dt(clos_dt);
    	dm.setIncmg_pers_ip(incmg_pers_ip);
    	dm.setIncmg_pers(incmg_pers);         
       
        dm.print();

        try {
        	AdDep1100DAO	dao = new AdDep1100DAO();
            ds = dao.ad_dep_1121_a(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        } 
    }

    public void ad_dep_1130_a(HttpServletRequest req, HttpServletResponse pub) throws   AppException {
    	
    	AD_DEP_1130_ADataSet ds = null;

        // DM Setting
    	AD_DEP_1130_ADM dm = new AD_DEP_1130_ADM();
    	String cmpy_cd     = Util.getSessionParameterValue(req, "cmpycd", true);
    	String ym_clsf     = Util.checkString(req.getParameter("mm_ym_clsf"));
    	String work_clsf   = Util.checkString(req.getParameter("mm_work_clsf"));
    	String clos_dt     = Util.checkString(req.getParameter("mm_clos_dt"));
    	
    	String incmg_pers_ip = req.getRemoteAddr();
    	String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
    	
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setYm_clsf(ym_clsf);
    	dm.setWork_clsf(work_clsf);
    	dm.setClos_dt(clos_dt);
    	dm.setIncmg_pers_ip(incmg_pers_ip);
    	dm.setIncmg_pers(incmg_pers);         
       
        dm.print();

        try {
        	AdDep1100DAO	dao = new AdDep1100DAO();
            ds = dao.ad_dep_1130_a(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        }  
//        
//        AdDep1100EJBHome home = (AdDep1100EJBHome) JNDIManager.getInstance().getHome("AdDep1100EJB");
//        try {
//        	AdDep1100EJB ejb = home.create();
//            ds = ejb.ad_dep_1130_a(dm);
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

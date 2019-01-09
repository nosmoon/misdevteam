/***************************************************************************************************
* 파일명 : AdDep4200WB.java
* 기능 : 
 * 작성일자 : 
 * 작성자 : KBS
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/

package chosun.ciis.ad.dep.wb;

import java.util.Hashtable;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.util.Util;

import chosun.ciis.ad.dep.dao.AdDep4200DAO;

import chosun.ciis.ad.dep.dm.AD_DEP_4200_MDM;
import chosun.ciis.ad.dep.dm.AD_DEP_4210_LDM;
import chosun.ciis.ad.dep.dm.AD_DEP_4220_ADM;
import chosun.ciis.ad.dep.dm.AD_DEP_4221_UDM;

import chosun.ciis.ad.dep.ds.AD_DEP_4200_MDataSet;
import chosun.ciis.ad.dep.ds.AD_DEP_4210_LDataSet;
import chosun.ciis.ad.dep.ds.AD_DEP_4220_ADataSet;
import chosun.ciis.ad.dep.ds.AD_DEP_4221_UDataSet;
import chosun.ciis.co.base.wb.BaseWB;
/**
 * 
 */

public class AdDep4200WB extends BaseWB {

    /**
     * 
     *
     * @param req HttpServletRequest
     * @param pub HttpServletResponse
     * @throws AppException
     */
    public void ad_dep_4200_m(HttpServletRequest req, HttpServletResponse pub) throws   AppException {
    	
    	AD_DEP_4200_MDataSet ds = null;

        // DM Setting
    	String cmpy_cd        = Util.getSessionParameterValue(req, "cmpycd", true);
    	String dealmedicd     = Util.getSessionParameterValue(req, "dealmedicd", true);

    	AD_DEP_4200_MDM dm = new AD_DEP_4200_MDM();
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setMedi_clsf(dealmedicd);

        try {
        	AdDep4200DAO	dao = new AdDep4200DAO();
        	ds = dao.ad_dep_4200_m(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        }    
//        
//        AdDep3500EJBHome home = (AdDep3500EJBHome) JNDIManager.getInstance().getHome("AdDep3500EJB");
//        try {
//        	AdDep3500EJB ejb = home.create();
//            ds = ejb.ad_dep_3500_m(dm);
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
    public void ad_dep_4210_l(HttpServletRequest req, HttpServletResponse pub) throws   AppException {
    	
    	AD_DEP_4210_LDataSet ds = null;

        // DM Setting
    	AD_DEP_4210_LDM dm = new AD_DEP_4210_LDM();
    	
    	String cmpy_cd      = Util.getSessionParameterValue(req, "cmpycd", true);
    	String dlco_clsf 	= Util.checkString(req.getParameter("dlco_clsf"));
    	String dlco_no 		= Util.checkString(req.getParameter("dlco_no"));
    	String fr_dt 		= Util.checkString(req.getParameter("fr_dt"));
    	String to_dt 		= Util.checkString(req.getParameter("to_dt"));
    	String basi_dt 		= Util.checkString(req.getParameter("basi_dt"));
    	
    	dm.setCmpy_cd(cmpy_cd);    	
    	dm.setDlco_clsf(dlco_clsf);
    	dm.setDlco_no(dlco_no);
    	dm.setFr_dt(fr_dt);
    	dm.setTo_dt(to_dt);
    	dm.setBasi_dt(basi_dt);    	

        try {
        	AdDep4200DAO	dao = new AdDep4200DAO();
            ds = dao.ad_dep_4210_l(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        }    
//        
//        AdDep3500EJBHome home = (AdDep3500EJBHome) JNDIManager.getInstance().getHome("AdDep3500EJB");
//        try {
//        	AdDep3500EJB ejb = home.create();
//            ds = ejb.ad_dep_3510_l(dm);
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
    public void ad_dep_4220_a(HttpServletRequest req, HttpServletResponse pub) throws   AppException {
    	
    	AD_DEP_4220_ADataSet ds = null;

        // DM Setting
    	String cmpy_cd        	= Util.getSessionParameterValue(req, "cmpycd", true);
    	String incmg_pers 	  	= Util.getSessionParameterValue(req, "emp_no", true);
    	String incmg_pers_ip  	= req.getRemoteAddr();
    	
    	String fr_dt 			= Util.checkString(req.getParameter("fr_dt"));
    	String to_dt 			= Util.checkString(req.getParameter("to_dt"));
    	String basi_dt 			= Util.checkString(req.getParameter("basi_dt"));    	

    	AD_DEP_4220_ADM dm = new AD_DEP_4220_ADM();
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setFr_dt(fr_dt);
    	dm.setTo_dt(to_dt);
    	dm.setBasi_dt(basi_dt);
    	dm.setIncmg_pers_ip(incmg_pers_ip);
    	dm.setIncmg_pers(incmg_pers);
       
    	dm.print();
    	    	    	
        try {
        	AdDep4200DAO	dao = new AdDep4200DAO();
            ds = dao.ad_dep_4220_a(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        }    
//        
//        AdDep3500EJBHome home = (AdDep3500EJBHome) JNDIManager.getInstance().getHome("AdDep3500EJB");
//        try {
//        	AdDep3500EJB ejb = home.create();
//            ds = ejb.ad_dep_3530_a(dm);
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
    public void ad_dep_4221_u(HttpServletRequest req, HttpServletResponse pub) throws   AppException {
    	
    	AD_DEP_4221_UDataSet ds = null;

        // DM Setting
    	String cmpy_cd        	= Util.getSessionParameterValue(req, "cmpycd", true);
    	String incmg_pers_ip 	= req.getRemoteAddr();
    	String incmg_pers 		= Util.getSessionParameterValue(req, "emp_no", true);
    	String basi_dt 			= Util.checkString(req.getParameter("basi_dt"));

    	String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
    	
    	Hashtable hash = getHashMultiUpdateData(multiUpdateData);    	
    	String pk = Util.checkString((String)hash.get("pk"));    
    	
    	AD_DEP_4221_UDM dm = new AD_DEP_4221_UDM();
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setPK(pk);    	
    	dm.setIncmg_pers_ip(incmg_pers_ip);
    	dm.setIncmg_pers(incmg_pers);
    	dm.setBasi_dt(basi_dt);
       
    	//dm.print();

        try {
        	AdDep4200DAO	dao = new AdDep4200DAO();
            ds = dao.ad_dep_4221_u(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        }  
//        
//        AdDep3700EJBHome home = (AdDep3700EJBHome) JNDIManager.getInstance().getHome("AdDep3700EJB");
//        try {
//        	AdDep3700EJB ejb = home.create();
//            ds = ejb.ad_dep_3715_u(dm);
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

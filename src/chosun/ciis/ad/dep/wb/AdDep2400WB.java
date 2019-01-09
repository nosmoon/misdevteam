/***************************************************************************************************
* 파일명 : AdDep2400WB.java
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
import chosun.ciis.ad.dep.dao.AdDep2400DAO;
import chosun.ciis.ad.dep.dm.AD_DEP_2400_MDM;
import chosun.ciis.ad.dep.dm.AD_DEP_2410_LDM;
import chosun.ciis.ad.dep.dm.AD_DEP_2420_LDM;
import chosun.ciis.ad.dep.dm.AD_DEP_2430_LDM;
import chosun.ciis.ad.dep.dm.AD_DEP_2440_LDM;
import chosun.ciis.ad.dep.ds.AD_DEP_2400_MDataSet;
import chosun.ciis.ad.dep.ds.AD_DEP_2410_LDataSet;
import chosun.ciis.ad.dep.ds.AD_DEP_2420_LDataSet;
import chosun.ciis.ad.dep.ds.AD_DEP_2430_LDataSet;
import chosun.ciis.ad.dep.ds.AD_DEP_2440_LDataSet;
import chosun.ciis.co.base.wb.BaseWB;
/**
 * 
 */

public class AdDep2400WB extends BaseWB {

    /**
     * 
     *
     * @param req HttpServletRequest
     * @param pub HttpServletResponse
     * @throws AppException
     */
    public void ad_dep_2400_m(HttpServletRequest req, HttpServletResponse pub) throws   AppException {
    	
    	AD_DEP_2400_MDataSet ds = null;

        // DM Setting
    	String cmpy_cd        = Util.getSessionParameterValue(req, "cmpycd", true);
    	String dealmedicd     = Util.getSessionParameterValue(req, "dealmedicd", true);

    	AD_DEP_2400_MDM dm = new AD_DEP_2400_MDM();
    	
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setDealmedicd(dealmedicd);
       
        //dm.print();        

        try {
        	AdDep2400DAO	dao = new AdDep2400DAO();
            ds = dao.ad_dep_2400_m(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        }    
//        
//        AdDep2400EJBHome home = (AdDep2400EJBHome) JNDIManager.getInstance().getHome("AdDep2400EJB");
//        try {
//        	AdDep2400EJB ejb = home.create();
//            ds = ejb.ad_dep_2400_m(dm);
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
    public void ad_dep_2410_l(HttpServletRequest req, HttpServletResponse pub) throws   AppException {
    	
    	AD_DEP_2410_LDataSet ds = null;

        // DM Setting
    	String cmpy_cd      = Util.getSessionParameterValue(req, "cmpycd", true);
    	String rcpm_cd 		= Util.checkString(req.getParameter("rcpm_cd"));
    	String medi_cd 		= Util.checkString(req.getParameter("medi_cd"));
    	String note_clsf_cd = Util.checkString(req.getParameter("note_clsf_cd"));
    	String dlco_no 		= Util.checkString(req.getParameter("dlco_no"));
    	String frdt 		= Util.checkString(req.getParameter("frdt"));
    	String todt 		= Util.checkString(req.getParameter("todt"));
    	String note_no 		= Util.checkString(req.getParameter("note_no"));
    	String issu_pers_nm = Util.checkString(req.getParameter("issu_pers_nm"));
    	String mtry_dt 		= Util.checkString(req.getParameter("mtry_dt"));


    	AD_DEP_2410_LDM dm = new AD_DEP_2410_LDM();
    	
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setRcpm_cd(rcpm_cd);
    	dm.setMedi_cd(medi_cd);
    	dm.setNote_clsf_cd(note_clsf_cd);
    	dm.setDlco_no(dlco_no);
    	dm.setFrdt(frdt);
    	dm.setTodt(todt);
    	dm.setNote_no(note_no);
    	dm.setIssu_pers_nm(issu_pers_nm);
    	dm.setMtry_dt(mtry_dt);

       
        //dm.print(); 

        try {
        	AdDep2400DAO	dao = new AdDep2400DAO();
            ds = dao.ad_dep_2410_l(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        }    
//        
//        AdDep2400EJBHome home = (AdDep2400EJBHome) JNDIManager.getInstance().getHome("AdDep2400EJB");
//        try {
//        	AdDep2400EJB ejb = home.create();
//            ds = ejb.ad_dep_2410_l(dm);
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
    public void ad_dep_2420_l(HttpServletRequest req, HttpServletResponse pub) throws   AppException {
    	
    	AD_DEP_2420_LDataSet ds = null;

        // DM Setting
    	String cmpy_cd      = Util.getSessionParameterValue(req, "cmpycd", true);
    	String work_cd = Util.checkString(req.getParameter("work_cd"));
    	String dis_account = Util.checkString(req.getParameter("dis_account"));
    	String handle_clsf = Util.checkString(req.getParameter("handle_clsf"));
    	String frdt = Util.checkString(req.getParameter("frdt"));
    	String todt = Util.checkString(req.getParameter("todt"));
    	String dlco_clsf = Util.checkString(req.getParameter("dlco_clsf"));
    	String dlco_no = Util.checkString(req.getParameter("dlco_no"));


    	AD_DEP_2420_LDM dm = new AD_DEP_2420_LDM();
    	
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setWork_cd(work_cd);
    	dm.setDis_account(dis_account);
    	dm.setHandle_clsf(handle_clsf);
    	dm.setFrdt(frdt);
    	dm.setTodt(todt);
    	dm.setDlco_clsf(dlco_clsf);
    	dm.setDlco_no(dlco_no);
       
        //dm.print(); 

        try {
        	AdDep2400DAO	dao = new AdDep2400DAO();
            ds = dao.ad_dep_2420_l(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        }    
//        
//        AdDep2400EJBHome home = (AdDep2400EJBHome) JNDIManager.getInstance().getHome("AdDep2400EJB");
//        try {
//        	AdDep2400EJB ejb = home.create();
//            ds = ejb.ad_dep_2420_l(dm);
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
    public void ad_dep_2430_l(HttpServletRequest req, HttpServletResponse pub) throws   AppException {
    	
    	AD_DEP_2430_LDataSet ds = null;

        // DM Setting
    	String cmpy_cd      = Util.getSessionParameterValue(req, "cmpycd", true);
    	String bank_cd = Util.checkString(req.getParameter("bank_cd"));
    	String note_no = Util.checkString(req.getParameter("note_no"));
    	String note_seq = Util.checkString(req.getParameter("note_seq"));


    	AD_DEP_2430_LDM dm = new AD_DEP_2430_LDM();
    	
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setBank_cd(bank_cd);
    	dm.setNote_no(note_no);
    	dm.setNote_seq(note_seq);
       
        //dm.print(); 

        try {
        	AdDep2400DAO	dao = new AdDep2400DAO();
            ds = dao.ad_dep_2430_l(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        }    
//        
//        AdDep2400EJBHome home = (AdDep2400EJBHome) JNDIManager.getInstance().getHome("AdDep2400EJB");
//        try {
//        	AdDep2400EJB ejb = home.create();
//            ds = ejb.ad_dep_2430_l(dm);
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
    public void ad_dep_2440_l(HttpServletRequest req, HttpServletResponse pub) throws   AppException {
    	
    	AD_DEP_2440_LDataSet ds = null;

        // DM Setting
    	String cmpy_cd      = Util.getSessionParameterValue(req, "cmpycd", true);
    	String bank_cd = Util.checkString(req.getParameter("bank_cd"));
    	String note_no = Util.checkString(req.getParameter("note_no"));
    	String note_seq = Util.checkString(req.getParameter("note_seq"));


    	AD_DEP_2440_LDM dm = new AD_DEP_2440_LDM();
    	
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setBank_cd(bank_cd);
    	dm.setNote_no(note_no);
    	dm.setNote_seq(note_seq);
       
        //dm.print();  

        try {
        	AdDep2400DAO	dao = new AdDep2400DAO();
            ds = dao.ad_dep_2440_l(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        }    
//        
//        AdDep2400EJBHome home = (AdDep2400EJBHome) JNDIManager.getInstance().getHome("AdDep2400EJB");
//        try {
//        	AdDep2400EJB ejb = home.create();
//            ds = ejb.ad_dep_2440_l(dm);
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

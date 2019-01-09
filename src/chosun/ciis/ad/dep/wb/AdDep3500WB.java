/***************************************************************************************************
* 파일명 : AdDep3500WB.java
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

import java.util.Hashtable;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.util.Util;
import chosun.ciis.ad.dep.dao.AdDep3500DAO;
import chosun.ciis.ad.dep.dm.AD_DEP_3500_MDM;
import chosun.ciis.ad.dep.dm.AD_DEP_3510_LDM;
import chosun.ciis.ad.dep.dm.AD_DEP_3520_LDM;
import chosun.ciis.ad.dep.dm.AD_DEP_3530_ADM;
import chosun.ciis.ad.dep.dm.AD_DEP_3540_ADM;
import chosun.ciis.ad.dep.ds.AD_DEP_3500_MDataSet;
import chosun.ciis.ad.dep.ds.AD_DEP_3510_LDataSet;
import chosun.ciis.ad.dep.ds.AD_DEP_3520_LDataSet;
import chosun.ciis.ad.dep.ds.AD_DEP_3530_ADataSet;
import chosun.ciis.ad.dep.ds.AD_DEP_3540_ADataSet;
import chosun.ciis.co.base.wb.BaseWB;
/**
 * 
 */

public class AdDep3500WB extends BaseWB {

    /**
     * 
     *
     * @param req HttpServletRequest
     * @param pub HttpServletResponse
     * @throws AppException
     */
    public void ad_dep_3500_m(HttpServletRequest req, HttpServletResponse pub) throws   AppException {
    	
    	AD_DEP_3500_MDataSet ds = null;

        // DM Setting
    	String cmpy_cd        = Util.getSessionParameterValue(req, "cmpycd", true);
    	String dealmedicd     = Util.getSessionParameterValue(req, "dealmedicd", true);

    	AD_DEP_3500_MDM dm = new AD_DEP_3500_MDM();
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setMedi_clsf(dealmedicd);

        try {
        	AdDep3500DAO	dao = new AdDep3500DAO();
            ds = dao.ad_dep_3500_m(dm);
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
    public void ad_dep_3510_l(HttpServletRequest req, HttpServletResponse pub) throws   AppException {
    	
    	AD_DEP_3510_LDataSet ds = null;

        // DM Setting
    	String cmpy_cd        = Util.getSessionParameterValue(req, "cmpycd", true);
    	String medi_cd = Util.checkString(req.getParameter("medi_cd"));
    	String dlco_clsf = Util.checkString(req.getParameter("dlco_clsf"));
    	String dlco_no = Util.checkString(req.getParameter("dlco_no"));
    	String frdt = Util.checkString(req.getParameter("frdt"));
    	String todt = Util.checkString(req.getParameter("todt"));
    	String basi_dt = Util.checkString(req.getParameter("basi_dt"));
    	String eps_clsf = Util.checkString(req.getParameter("eps_clsf"));
    	String slcrg_pers = Util.checkString(req.getParameter("slcrg_pers"));
    	String mchrg_pers = Util.checkString(req.getParameter("mchrg_pers"));    	

    	AD_DEP_3510_LDM dm = new AD_DEP_3510_LDM();
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setMedi_cd(medi_cd);
    	dm.setDlco_clsf(dlco_clsf);
    	dm.setDlco_no(dlco_no);
    	dm.setFrdt(frdt);
    	dm.setTodt(todt);
    	dm.setBasi_dt(basi_dt);
    	dm.setEps_clsf(eps_clsf);
    	dm.setSlcrg_pers(slcrg_pers);
    	dm.setMchrg_pers(mchrg_pers);

        try {
        	AdDep3500DAO	dao = new AdDep3500DAO();
            ds = dao.ad_dep_3510_l(dm);
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
    public void ad_dep_3520_l(HttpServletRequest req, HttpServletResponse pub) throws   AppException {
    	
    	AD_DEP_3520_LDataSet ds = null;

        // DM Setting
    	String cmpy_cd        = Util.getSessionParameterValue(req, "cmpycd", true);
    	String medi_cd = Util.checkString(req.getParameter("medi_cd"));
    	String dlco_clsf = Util.checkString(req.getParameter("dlco_clsf"));
    	String dlco_no = Util.checkString(req.getParameter("dlco_no"));
    	String frdt = Util.checkString(req.getParameter("frdt"));
    	String todt = Util.checkString(req.getParameter("todt"));
    	String basi_dt = Util.checkString(req.getParameter("basi_dt"));
    	String eps_clsf = Util.checkString(req.getParameter("eps_clsf"));

    	AD_DEP_3520_LDM dm = new AD_DEP_3520_LDM();
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setMedi_cd(medi_cd);
    	dm.setDlco_clsf(dlco_clsf);
    	dm.setDlco_no(dlco_no);
    	dm.setFrdt(frdt);
    	dm.setTodt(todt);
    	dm.setBasi_dt(basi_dt);
    	dm.setEps_clsf(eps_clsf);
    	
    	dm.print();
    	

        try {
        	AdDep3500DAO	dao = new AdDep3500DAO();
            ds = dao.ad_dep_3520_l(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        }    
//       
//        AdDep3500EJBHome home = (AdDep3500EJBHome) JNDIManager.getInstance().getHome("AdDep3500EJB");
//        try {
//        	AdDep3500EJB ejb = home.create();
//            ds = ejb.ad_dep_3520_l(dm);
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
    public void ad_dep_3530_a(HttpServletRequest req, HttpServletResponse pub) throws   AppException {
    	
    	AD_DEP_3530_ADataSet ds = null;

        // DM Setting
    	String cmpy_cd        = Util.getSessionParameterValue(req, "cmpycd", true);
    	String incmg_pers 	  = Util.getSessionParameterValue(req, "emp_no", true);
    	String incmg_pers_ip  = req.getRemoteAddr();
    	
    	String medi_cd 	 	= Util.checkString(req.getParameter("medi_cd"));
    	String dlco_clsf 	= Util.checkString(req.getParameter("dlco_clsf"));
    	String dlco_no 	 	= Util.checkString(req.getParameter("dlco_no"));
    	String eps_clsf 	= Util.checkString(req.getParameter("eps_clsf"));
    	String enty_clsf 	= Util.checkString(req.getParameter("enty_clsf"));
    	String multiUpdateData   = Util.checkString(req.getParameter("multiUpdateData"));
    	
    	Hashtable hash = getHashMultiUpdateData(multiUpdateData);
    	
    	String pubc_dt 		  = Util.checkString((String)hash.get("pubc_dt"));
    	String pubc_slip_no   = Util.checkString((String)hash.get("pubc_slip_no"));
    	String pubc_tot_amt   = Util.checkString((String)hash.get("pubc_tot_amt"));
    	String rcpm_tot_amt   = Util.checkString((String)hash.get("rcpm_tot_amt"));    	

    	AD_DEP_3530_ADM dm = new AD_DEP_3530_ADM();
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setMedi_cd(medi_cd);
    	dm.setDlco_clsf(dlco_clsf);
    	dm.setDlco_no(dlco_no);
    	dm.setEps_clsf(eps_clsf);
    	dm.setEnty_clsf(enty_clsf);
    	dm.setPubc_dt(pubc_dt);
    	dm.setPubc_slip_no(pubc_slip_no);
    	dm.setPubc_tot_amt(pubc_tot_amt);
    	dm.setRcpm_tot_amt(rcpm_tot_amt);
    	dm.setIncmg_pers_ip(incmg_pers_ip);
    	dm.setIncmg_pers(incmg_pers);
       
    	dm.print();

        try {
        	AdDep3500DAO	dao = new AdDep3500DAO();
            ds = dao.ad_dep_3530_a(dm);
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
    public void ad_dep_3540_a(HttpServletRequest req, HttpServletResponse pub) throws   AppException {
    	
    	AD_DEP_3540_ADataSet ds = null;

        // DM Setting
    	String cmpy_cd        = Util.getSessionParameterValue(req, "cmpycd", true);
    	String incmg_pers 	  = Util.getSessionParameterValue(req, "emp_no", true);
    	String incmg_pers_ip  = req.getRemoteAddr();
    	
    	String medi_cd 	 	= Util.checkString(req.getParameter("medi_cd"));
    	String dlco_clsf 	= Util.checkString(req.getParameter("dlco_clsf"));
    	String dlco_no 	 	= Util.checkString(req.getParameter("dlco_no"));
    	String eps_clsf 	= Util.checkString(req.getParameter("eps_clsf"));
    	String enty_clsf 	= Util.checkString(req.getParameter("enty_clsf"));
    	String multiUpdateData   = Util.checkString(req.getParameter("multiUpdateData"));
    	
    	Hashtable hash = getHashMultiUpdateData(multiUpdateData);

    	String rcpm_slip_no = Util.checkString((String)hash.get("rcpm_slip_no"));
    	String bank_cd = Util.checkString((String)hash.get("bank_cd"));
    	String note_no = Util.checkString((String)hash.get("note_no"));
    	String note_seq = Util.checkString((String)hash.get("note_seq"));
    	String dhon_occr_dt = Util.checkString((String)hash.get("dhon_occr_dt"));
    	String dhon_amt = Util.checkString((String)hash.get("dhon_amt"));
    	String dhon_bal = Util.checkString((String)hash.get("dhon_bal"));
    	String issu_pers_nm = Util.checkString((String)hash.get("issu_pers_nm"));
    	
    	AD_DEP_3540_ADM dm = new AD_DEP_3540_ADM();
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setMedi_cd(medi_cd);
    	dm.setDlco_clsf(dlco_clsf);
    	dm.setDlco_no(dlco_no);
    	dm.setEps_clsf(eps_clsf);
    	dm.setEnty_clsf(enty_clsf);
    	dm.setRcpm_slip_no(rcpm_slip_no);
    	dm.setBank_cd(bank_cd);
    	dm.setNote_no(note_no);
    	dm.setNote_seq(note_seq);
    	dm.setDhon_occr_dt(dhon_occr_dt);
    	dm.setDhon_amt(dhon_amt);
    	dm.setDhon_bal(dhon_bal);
    	dm.setIssu_pers_nm(issu_pers_nm);
    	dm.setIncmg_pers_ip(incmg_pers_ip);
    	dm.setIncmg_pers(incmg_pers);
    	
    	dm.print();

        try {
        	AdDep3500DAO	dao = new AdDep3500DAO();
            ds = dao.ad_dep_3540_a(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        }    
//        
//        AdDep3500EJBHome home = (AdDep3500EJBHome) JNDIManager.getInstance().getHome("AdDep3500EJB");
//        try {
//        	AdDep3500EJB ejb = home.create();
//            ds = ejb.ad_dep_3540_a(dm);
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

/***************************************************************************************************
* 파일명 : AdNmd4300WB.java
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

package chosun.ciis.ad.nmd.wb;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.util.Util;
import chosun.ciis.ad.nmd.dao.AdNmd4300DAO;
import chosun.ciis.ad.nmd.dm.AD_NMD_4300_MDM;
import chosun.ciis.ad.nmd.dm.AD_NMD_4310_LDM;
import chosun.ciis.ad.nmd.dm.AD_NMD_4320_SDM;
import chosun.ciis.ad.nmd.dm.AD_NMD_4325_SDM;
import chosun.ciis.ad.nmd.dm.AD_NMD_4330_ADM;
import chosun.ciis.ad.nmd.dm.AD_NMD_4340_ADM;
import chosun.ciis.ad.nmd.ds.AD_NMD_4300_MDataSet;
import chosun.ciis.ad.nmd.ds.AD_NMD_4310_LDataSet;
import chosun.ciis.ad.nmd.ds.AD_NMD_4320_SDataSet;
import chosun.ciis.ad.nmd.ds.AD_NMD_4325_SDataSet;
import chosun.ciis.ad.nmd.ds.AD_NMD_4330_ADataSet;
import chosun.ciis.ad.nmd.ds.AD_NMD_4340_ADataSet;
import chosun.ciis.co.base.wb.BaseWB;
/**
 * 
 */

public class AdNmd4300WB extends BaseWB {

    /**
     * 
     *
     * @param req HttpServletRequest
     * @param pub HttpServletResponse
     * @throws AppException
     */
    public void ad_nmd_4300_m(HttpServletRequest req, HttpServletResponse pub) throws   AppException {
    	
    	AD_NMD_4300_MDataSet ds = null;

        // DM Setting
    	String cmpy_cd        = Util.getSessionParameterValue(req, "cmpycd", true);
    	String dealmedicd     = Util.getSessionParameterValue(req, "dealmedicd", true);

    	AD_NMD_4300_MDM dm = new AD_NMD_4300_MDM();
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setDealmedicd(dealmedicd);
       
        //dm.print();
        
        try {
        	AdNmd4300DAO	dao = new AdNmd4300DAO();
            ds = dao.ad_nmd_4300_m(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        }  
//        
//        AdDep1500EJBHome home = (AdDep1500EJBHome) JNDIManager.getInstance().getHome("AdDep1500EJB");
//        try {
//        	AdDep1500EJB ejb = home.create();
//            ds = ejb.ad_nmd_4300_m(dm);
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
    public void ad_nmd_4310_l(HttpServletRequest req, HttpServletResponse pub) throws   AppException {
    	
    	AD_NMD_4310_LDataSet ds = null;

        // DM Setting
    	String cmpy_cd        = Util.getSessionParameterValue(req, "cmpycd", true);
    	String drbk_clsf = Util.checkString(req.getParameter("drbk_clsf"));
    	String medi_cd 	= Util.checkString(req.getParameter("medi_cd"));
    	String proc_frdt = Util.checkString(req.getParameter("proc_frdt"));
    	String proc_todt = Util.checkString(req.getParameter("proc_todt"));
    	String hndl_clsf = Util.checkString(req.getParameter("hndl_clsf"));
    	String dlco_no = Util.checkString(req.getParameter("dlco_no"));

    	AD_NMD_4310_LDM dm = new AD_NMD_4310_LDM();
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setDrbk_clsf(drbk_clsf);
    	dm.setMedi_cd(medi_cd);
    	dm.setProc_frdt(proc_frdt);
    	dm.setProc_todt(proc_todt);
    	dm.setHndl_clsf(hndl_clsf);
    	dm.setDlco_no(dlco_no);
       
        dm.print();

        try {
        	AdNmd4300DAO	dao = new AdNmd4300DAO();
            ds = dao.ad_nmd_4310_l(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        }  
//        
//        AdDep1500EJBHome home = (AdDep1500EJBHome) JNDIManager.getInstance().getHome("AdDep1500EJB");
//        try {
//        	AdDep1500EJB ejb = home.create();
//            ds = ejb.ad_nmd_4310_l(dm);
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
    public void ad_nmd_4320_s(HttpServletRequest req, HttpServletResponse pub) throws   AppException {
    	
    	AD_NMD_4320_SDataSet ds = null;

        // DM Setting
    	String cmpy_cd        = Util.getSessionParameterValue(req, "cmpycd", true);
    	String payo_slip_no = Util.checkString(req.getParameter("payo_slip_no"));

    	AD_NMD_4320_SDM dm = new AD_NMD_4320_SDM();
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setPayo_slip_no(payo_slip_no);
       
        //dm.print();
        

        try {
        	AdNmd4300DAO	dao = new AdNmd4300DAO();
            ds = dao.ad_nmd_4320_s(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        }  
//        
//        AdDep1500EJBHome home = (AdDep1500EJBHome) JNDIManager.getInstance().getHome("AdDep1500EJB");
//        try {
//        	AdDep1500EJB ejb = home.create();
//            ds = ejb.ad_nmd_4320_s(dm);
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
    public void ad_nmd_4325_s(HttpServletRequest req, HttpServletResponse pub) throws   AppException {
    	
    	AD_NMD_4325_SDataSet ds = null;

        // DM Setting
    	String cmpy_cd      = Util.getSessionParameterValue(req, "cmpycd", true);
    	String drbk_clsf = Util.checkString(req.getParameter("drbk_clsf"));
    	String slip_occr_dt = Util.checkString(req.getParameter("rcpm_slip_occr_dt"));
    	String slip_clsf_cd = Util.checkString(req.getParameter("rcpm_slip_clsf_cd"));
    	String slip_seq = Util.checkString(req.getParameter("rcpm_slip_seq"));

    	AD_NMD_4325_SDM dm = new AD_NMD_4325_SDM();
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setDrbk_clsf(drbk_clsf);
    	dm.setSlip_occr_dt(slip_occr_dt);
    	dm.setSlip_clsf_cd(slip_clsf_cd);
    	dm.setSlip_seq(slip_seq);
       
        //dm.print();

        try {
        	AdNmd4300DAO	dao = new AdNmd4300DAO();
            ds = dao.ad_nmd_4325_s(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        }  
//        
//        AdDep1500EJBHome home = (AdDep1500EJBHome) JNDIManager.getInstance().getHome("AdDep1500EJB");
//        try {
//        	AdDep1500EJB ejb = home.create();
//            ds = ejb.ad_nmd_4325_s(dm);
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
    public void ad_nmd_4330_a(HttpServletRequest req, HttpServletResponse pub) throws   AppException {
    	
    	AD_NMD_4330_ADataSet ds = null;

        // DM Setting
    	String cmpy_cd       = Util.getSessionParameterValue(req, "cmpycd", true);
    	String incmg_pers_ip = req.getRemoteAddr();
    	String incmg_pers 	 = Util.getSessionParameterValue(req, "emp_no", true);

    	String flag			 = Util.checkString(req.getParameter("flag"));
    	String payo_clsf		 = Util.checkString(req.getParameter("drbk_clsf"));
    	String payo_slip_occr_dt = Util.checkString(req.getParameter("payo_slip_occr_dt"));
    	String payo_slip_clsf_cd = Util.checkString(req.getParameter("payo_slip_clsf_cd"));
    	String payo_slip_seq 	= Util.checkString(req.getParameter("payo_slip_seq"));
    	String rcpm_slip_occr_dt = Util.checkString(req.getParameter("rcpm_slip_occr_dt"));
    	String rcpm_slip_clsf_cd = Util.checkString(req.getParameter("rcpm_slip_clsf_cd"));
    	String rcpm_slip_seq = Util.checkString(req.getParameter("rcpm_slip_seq"));
    	String medi_cd = Util.checkString(req.getParameter("medi_cd"));
    	String hndl_clsf = Util.checkString(req.getParameter("hndl_clsf"));
    	String dlco_no = Util.checkString(req.getParameter("dlco_no"));
    	String dlco_nm = Util.checkString(req.getParameter("dlco_nm"));
    	String precpt_amt_bal = Util.checkString(req.getParameter("precpt_amt_bal"));
    	String occr_amt = Util.checkString(req.getParameter("occr_amt"));
    	String drbk_amt = Util.checkString(req.getParameter("drbk_amt"));

    	AD_NMD_4330_ADM dm = new AD_NMD_4330_ADM();
    	dm.setFlag(flag);
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setPayo_clsf(payo_clsf);
    	dm.setPayo_slip_occr_dt(payo_slip_occr_dt);
    	dm.setPayo_slip_clsf_cd(payo_slip_clsf_cd);
    	dm.setPayo_slip_seq(payo_slip_seq);
    	dm.setRcpm_slip_occr_dt(rcpm_slip_occr_dt);
    	dm.setRcpm_slip_clsf_cd(rcpm_slip_clsf_cd);
    	dm.setRcpm_slip_seq(rcpm_slip_seq);
    	dm.setMedi_cd(medi_cd);
    	dm.setHndl_clsf(hndl_clsf);
    	dm.setDlco_no(dlco_no);
    	dm.setDlco_nm(dlco_nm);
    	dm.setPrecpt_amt_bal(precpt_amt_bal);
    	dm.setOccr_amt(occr_amt);
    	dm.setDrbk_amt(drbk_amt);
    	dm.setIncmg_pers_ip(incmg_pers_ip);
    	dm.setIncmg_pers(incmg_pers);
       
        //dm.print();

        try {
        	AdNmd4300DAO	dao = new AdNmd4300DAO();
            ds = dao.ad_nmd_4330_a(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        }  
//        
//        AdDep1500EJBHome home = (AdDep1500EJBHome) JNDIManager.getInstance().getHome("AdDep1500EJB");
//        try {
//        	AdDep1500EJB ejb = home.create();
//            ds = ejb.ad_nmd_4330_a(dm);
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
    public void ad_nmd_4340_a(HttpServletRequest req, HttpServletResponse pub) throws   AppException {
    	
    	AD_NMD_4340_ADataSet ds = null;

        // DM Setting
    	String cmpy_cd       = Util.getSessionParameterValue(req, "cmpycd", true);
    	String incmg_pers_ip = req.getRemoteAddr();
    	String incmg_pers 	 = Util.getSessionParameterValue(req, "emp_no", true);
    	String incmg_dept_cd = Util.getSessionParameterValue(req, "deptcd", true);

    	String flag = Util.checkString(req.getParameter("flag"));
    	String payo_clsf = Util.checkString(req.getParameter("drbk_clsf"));
    	String slip_occr_dt = Util.checkString(req.getParameter("payo_slip_occr_dt"));
    	String slip_clsf_cd = Util.checkString(req.getParameter("payo_slip_clsf_cd"));
    	String slip_seq = Util.checkString(req.getParameter("payo_slip_seq"));
    	String medi_cd = Util.checkString(req.getParameter("medi_cd"));
    	String hndl_clsf = Util.checkString(req.getParameter("hndl_clsf"));
    	String dlco_no = Util.checkString(req.getParameter("dlco_no"));
    	String dlco_nm = Util.checkString(req.getParameter("dlco_nm"));
    	String drbk_amt = Util.checkString(req.getParameter("drbk_amt"));


    	AD_NMD_4340_ADM dm = new AD_NMD_4340_ADM();
    	dm.setFlag(flag);
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setPayo_clsf(payo_clsf);
    	dm.setSlip_occr_dt(slip_occr_dt);
    	dm.setSlip_clsf_cd(slip_clsf_cd);
    	dm.setSlip_seq(slip_seq);
    	dm.setMedi_cd(medi_cd);  
    	dm.setHndl_clsf(hndl_clsf);
    	dm.setDlco_no(dlco_no);
    	dm.setDlco_nm(dlco_nm);
    	dm.setDrbk_amt(drbk_amt);
    	dm.setIncmg_dept_cd(incmg_dept_cd);
    	dm.setIncmg_pers_ip(incmg_pers_ip);
    	dm.setIncmg_pers(incmg_pers);
       
        //dm.print();

        try {
        	AdNmd4300DAO	dao = new AdNmd4300DAO();
            ds = dao.ad_nmd_4340_a(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        }  
//        
//        AdDep1500EJBHome home = (AdDep1500EJBHome) JNDIManager.getInstance().getHome("AdDep1500EJB");
//        try {
//        	AdDep1500EJB ejb = home.create();
//            ds = ejb.ad_nmd_4340_a(dm);
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

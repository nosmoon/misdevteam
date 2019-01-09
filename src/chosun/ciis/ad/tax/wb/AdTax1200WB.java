/***************************************************************************************************
* 파일명 : AdTax120WB.java
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

package chosun.ciis.ad.tax.wb;

import java.util.Hashtable;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.util.Util;
import chosun.ciis.ad.tax.dao.AdTax1200DAO;
import chosun.ciis.ad.tax.dm.AD_TAX_1200_MDM;
import chosun.ciis.ad.tax.dm.AD_TAX_1210_SDM;
import chosun.ciis.ad.tax.dm.AD_TAX_1215_SDM;
import chosun.ciis.ad.tax.dm.AD_TAX_1220_ADM;
import chosun.ciis.ad.tax.dm.AD_TAX_1230_ADM;
import chosun.ciis.ad.tax.dm.AD_TAX_1250_LDM;
import chosun.ciis.ad.tax.ds.AD_TAX_1200_MDataSet;
import chosun.ciis.ad.tax.ds.AD_TAX_1210_SDataSet;
import chosun.ciis.ad.tax.ds.AD_TAX_1215_SDataSet;
import chosun.ciis.ad.tax.ds.AD_TAX_1220_ADataSet;
import chosun.ciis.ad.tax.ds.AD_TAX_1230_ADataSet;
import chosun.ciis.ad.tax.ds.AD_TAX_1250_LDataSet;
import chosun.ciis.co.base.util.StringUtil;
import chosun.ciis.co.base.wb.BaseWB;
/**
 * 
 */

public class AdTax1200WB extends BaseWB {

    /**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void ad_tax_1200_m(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	AD_TAX_1200_MDataSet ds = null;

        // DM Setting
    	String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);
    	String dealmedicd    = Util.getSessionParameterValue(req, "dealmedicd", true);
    	
    	AD_TAX_1200_MDM dm = new AD_TAX_1200_MDM();
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setDealmedicd(dealmedicd);

        try {
        	AdTax1200DAO	dao = new AdTax1200DAO();
            ds = dao.ad_tax_1200_m(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        } 
//        
//        AdTax1200EJBHome home = (AdTax1200EJBHome) JNDIManager.getInstance().getHome("AdTax1200EJB");
//        try {
//        	AdTax1200EJB ejb = home.create();
//            ds = ejb.ad_tax_1200_m(dm);
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
    public void ad_tax_1210_s(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	AD_TAX_1210_SDataSet ds = null;

        // DM Setting
    	String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);
    	String slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
    	String slip_occr_dt = Util.checkString(req.getParameter("slip_occr_dt"));
    	String slip_seq = Util.checkString(req.getParameter("slip_seq"));
    	String prof_type_cd = Util.checkString(req.getParameter("prof_type_cd"));
    	
    	AD_TAX_1210_SDM dm = new AD_TAX_1210_SDM();
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setSlip_clsf_cd(slip_clsf_cd);
    	dm.setSlip_occr_dt(slip_occr_dt);
    	dm.setSlip_seq(slip_seq);
    	dm.setProf_type_cd(prof_type_cd);
    	dm.print();
        try {
        	AdTax1200DAO	dao = new AdTax1200DAO();
            ds = dao.ad_tax_1210_s(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        } 
//        
//        AdTax1200EJBHome home = (AdTax1200EJBHome) JNDIManager.getInstance().getHome("AdTax1200EJB");
//        try {
//        	AdTax1200EJB ejb = home.create();
//            ds = ejb.ad_tax_1210_s(dm);
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
    public void ad_tax_1215_s(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	AD_TAX_1215_SDataSet ds = null;

        // DM Setting
    	String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);
    	String pubc_slip_no = Util.checkString(req.getParameter("pubc_slip_no"));
    	
    	AD_TAX_1215_SDM dm = new AD_TAX_1215_SDM();
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setPubc_slip_no(pubc_slip_no);
    	
    	dm.print();

        try {
        	AdTax1200DAO	dao = new AdTax1200DAO();
            ds = dao.ad_tax_1215_s(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        } 
//        
//        AdTax1200EJBHome home = (AdTax1200EJBHome) JNDIManager.getInstance().getHome("AdTax1200EJB");
//        try {
//        	AdTax1200EJB ejb = home.create();
//            ds = ejb.ad_tax_1215_s(dm);
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
    public void ad_tax_1220_a(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	AD_TAX_1220_ADataSet ds = null;

        // DM Setting
    	String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);
    	String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
    	String incmg_pers_ip = req.getRemoteAddr();
    	
    	String slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
    	String slip_occr_dt = Util.checkString(req.getParameter("slip_occr_dt"));
    	String slip_seq = Util.checkString(req.getParameter("slip_seq"));
    	String prof_type_cd = Util.checkString(req.getParameter("prof_type_cd"));
    	
    	String multiUpdateData1 = Util.checkString(req.getParameter("multiUpdateData1"));
    	
    	System.out.println("multiUpdateData1 = " + multiUpdateData1);
    	
    	Hashtable hash1 = getHashMultiUpdateData(multiUpdateData1);
    	String new_medi_cd = StringUtil.nvl((String)hash1.get("medi_cd")); 
    	String new_proc_dt = StringUtil.nvl((String)hash1.get("proc_dt")); 
    	String new_proc_seq = StringUtil.nvl((String)hash1.get("proc_seq")); 
    	
    	String multiUpdateData2 = Util.checkString(req.getParameter("multiUpdateData2"));
    	
    	System.out.println("multiUpdateData2 = " + multiUpdateData2);
    	
    	Hashtable hash2 = getHashMultiUpdateData(multiUpdateData2);
    	String del_medi_cd 	= StringUtil.nvl((String)hash2.get("medi_cd")); 
    	String del_proc_dt 	= StringUtil.nvl((String)hash2.get("proc_dt")); 
    	String del_proc_seq = StringUtil.nvl((String)hash2.get("proc_seq")); 
    	
    	AD_TAX_1220_ADM dm = new AD_TAX_1220_ADM();
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setSlip_clsf_cd(slip_clsf_cd);
    	dm.setSlip_occr_dt(slip_occr_dt);
    	dm.setSlip_seq(slip_seq);
    	dm.setProf_type_cd(prof_type_cd);
    	dm.setNew_medi_cd(new_medi_cd);
    	dm.setNew_proc_dt(new_proc_dt);
    	dm.setNew_proc_seq(new_proc_seq);
    	dm.setDel_medi_cd(del_medi_cd);
    	dm.setDel_proc_dt(del_proc_dt);
    	dm.setDel_proc_seq(del_proc_seq);
    	dm.setIncmg_pers_ip(incmg_pers_ip);
    	dm.setIncmg_pers(incmg_pers);
    	
    	//dm.print();

        try {
        	AdTax1200DAO	dao = new AdTax1200DAO();
            ds = dao.ad_tax_1220_a(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        } 
//        
//        AdTax1200EJBHome home = (AdTax1200EJBHome) JNDIManager.getInstance().getHome("AdTax1200EJB");
//        try {
//        	AdTax1200EJB ejb = home.create();
//            ds = ejb.ad_tax_1220_a(dm);
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
    public void ad_tax_1230_a(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	AD_TAX_1230_ADataSet ds = null;

        // DM Setting
    	String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);
    	String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
    	String incmg_pers_ip = req.getRemoteAddr();
    	String slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
    	String slip_occr_dt = Util.checkString(req.getParameter("slip_occr_dt"));
    	String slip_seq = Util.checkString(req.getParameter("slip_seq"));
    	String prof_type_cd = Util.checkString(req.getParameter("prof_type_cd"));
    	
    	
    	AD_TAX_1230_ADM dm = new AD_TAX_1230_ADM();
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setSlip_clsf_cd(slip_clsf_cd);
    	dm.setSlip_occr_dt(slip_occr_dt);
    	dm.setSlip_seq(slip_seq);
    	dm.setProf_type_cd(prof_type_cd);
    	dm.setIncmg_pers_ip(incmg_pers_ip);
    	dm.setIncmg_pers(incmg_pers);
    	
    	//dm.print();

        try {
        	AdTax1200DAO	dao = new AdTax1200DAO();
            ds = dao.ad_tax_1230_a(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        } 
//        
//        AdTax1200EJBHome home = (AdTax1200EJBHome) JNDIManager.getInstance().getHome("AdTax1200EJB");
//        try {
//        	AdTax1200EJB ejb = home.create();
//            ds = ejb.ad_tax_1230_a(dm);
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
    public void ad_tax_1250_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	AD_TAX_1250_LDataSet ds = null;

        // DM Setting
    	String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);
    	String slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
    	String slip_occr_dt = Util.checkString(req.getParameter("slip_occr_dt"));
    	String slip_seq = Util.checkString(req.getParameter("slip_seq"));
    	String prof_type_cd = Util.checkString(req.getParameter("prof_type_cd"));

    	
    	AD_TAX_1250_LDM dm = new AD_TAX_1250_LDM();
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setSlip_clsf_cd(slip_clsf_cd);
    	dm.setSlip_occr_dt(slip_occr_dt);
    	dm.setSlip_seq(slip_seq);
    	dm.setProf_type_cd(prof_type_cd);
    	
    	//dm.print();

        try {
        	AdTax1200DAO	dao = new AdTax1200DAO();
            ds = dao.ad_tax_1250_l(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        } 
//        
//        AdTax1200EJBHome home = (AdTax1200EJBHome) JNDIManager.getInstance().getHome("AdTax1200EJB");
//        try {
//        	AdTax1200EJB ejb = home.create();
//            ds = ejb.ad_tax_1250_l(dm);
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

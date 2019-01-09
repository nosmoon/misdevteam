/***************************************************************************************************
* 파일명 : AdTax1100WB.java
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
import chosun.ciis.ad.common.dm.AD_CO_9004_SDM;
import chosun.ciis.ad.common.ds.AD_CO_9004_SDataSet;
import chosun.ciis.ad.tax.dao.AdTax1100DAO;
import chosun.ciis.ad.tax.dm.AD_TAX_1100_MDM;
import chosun.ciis.ad.tax.dm.AD_TAX_1110_LDM;
import chosun.ciis.ad.tax.dm.AD_TAX_1120_ADM;
import chosun.ciis.ad.tax.dm.AD_TAX_1121_ADM;
import chosun.ciis.ad.tax.dm.AD_TAX_1122_ADM;
import chosun.ciis.ad.tax.dm.AD_TAX_1130_SDM;
import chosun.ciis.ad.tax.ds.AD_TAX_1100_MDataSet;
import chosun.ciis.ad.tax.ds.AD_TAX_1110_LDataSet;
import chosun.ciis.ad.tax.ds.AD_TAX_1120_ADataSet;
import chosun.ciis.ad.tax.ds.AD_TAX_1121_ADataSet;
import chosun.ciis.ad.tax.ds.AD_TAX_1122_ADataSet;
import chosun.ciis.ad.tax.ds.AD_TAX_1130_SDataSet;
import chosun.ciis.co.base.util.StringUtil;
import chosun.ciis.co.base.wb.BaseWB;
/**
 * 
 */

public class AdTax1100WB extends BaseWB {

    /**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void ad_tax_1100_m(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	AD_TAX_1100_MDataSet ds = null;

        // DM Setting
    	AD_TAX_1100_MDM dm = new AD_TAX_1100_MDM();
    	String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);
    	String dealmedicd    = Util.getSessionParameterValue(req, "dealmedicd", true);
    	
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setDealmedicd(dealmedicd);

        try {
        	AdTax1100DAO	dao = new AdTax1100DAO();
            ds = dao.ad_tax_1100_m(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        } 
//        
//        AdTax1100EJBHome home = (AdTax1100EJBHome) JNDIManager.getInstance().getHome("AdTax1100EJB");
//        try {
//        	AdTax1100EJB ejb = home.create();
//            ds = ejb.ad_tax_1100_m(dm);
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
    public void ad_tax_1105_s(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	AD_CO_9004_SDataSet ds = null;

        // DM Setting
    	AD_CO_9004_SDM dm = new AD_CO_9004_SDM();
    	String cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
    	String dlco_no = Util.checkString(req.getParameter("dlco_no"));

    	dm.setCmpy_cd(cmpy_cd);
    	dm.setDlco_no(dlco_no);

        try {
        	AdTax1100DAO	dao = new AdTax1100DAO();
            ds = dao.ad_tax_1105_s(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        } 
//        
//        AdTax1100EJBHome home = (AdTax1100EJBHome) JNDIManager.getInstance().getHome("AdTax1100EJB");
//        try {
//        	AdTax1100EJB ejb = home.create();
//            ds = ejb.ad_tax_1105_s(dm);
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
    public void ad_tax_1110_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	AD_TAX_1110_LDataSet ds = null;
  
        // DM Setting
    	String cmpy_cd   = Util.getSessionParameterValue(req, "cmpycd", true);
    	String medi_cd 	 = Util.checkString(req.getParameter("medi_cd"));
    	String hndl_clsf = Util.checkString(req.getParameter("hndl_clsf"));
    	String dlco_no = Util.checkString(req.getParameter("dlco_no"));
    	String pubc_frdt = Util.checkString(req.getParameter("pubc_frdt"));
    	String pubc_todt = Util.checkString(req.getParameter("pubc_todt"));
    	
    	AD_TAX_1110_LDM dm = new AD_TAX_1110_LDM();
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setMedi_cd(medi_cd);
    	dm.setHndl_clsf(hndl_clsf);
    	dm.setDlco_no(dlco_no);
    	dm.setPubc_frdt(pubc_frdt);
    	dm.setPubc_todt(pubc_todt);
    	
    	dm.print();
        try {
        	AdTax1100DAO	dao = new AdTax1100DAO();
            ds = dao.ad_tax_1110_l(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        } 
//        
//        AdTax1100EJBHome home = (AdTax1100EJBHome) JNDIManager.getInstance().getHome("AdTax1100EJB");
//        try {
//        	AdTax1100EJB ejb = home.create();
//            ds = ejb.ad_tax_1110_l(dm);
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
    public void ad_tax_1120_a(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	AD_TAX_1120_ADataSet ds = null;
  
        // DM Setting
    	String cmpy_cd   	= Util.getSessionParameterValue(req, "cmpycd", true);
    	String incmg_pers 	 = Util.getSessionParameterValue(req, "emp_no", true);
    	String incmg_pers_ip = req.getRemoteAddr();
    	
    	String slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
    	String slip_occr_dt = Util.checkString(req.getParameter("slip_occr_dt"));
    	String make_dt 		= Util.checkString(req.getParameter("make_dt"));
    	String suply_amt 	= Util.checkString(req.getParameter("suply_amt"));
    	String vat_amt 		= Util.checkString(req.getParameter("vat_amt"));
    	String ern 			= Util.checkString(req.getParameter("ern"));
    	String dlco_no 		= Util.checkString(req.getParameter("dlco_no"));
    	String dlco_nm 		= Util.checkString(req.getParameter("dlco_nm"));
    	String presi_nm 	= Util.checkString(req.getParameter("presi_nm"));
    	String addr 		= Util.checkString(req.getParameter("addr"));
    	String bizcond  	= Util.checkString(req.getParameter("bizcond"));
    	String item 		= Util.checkString(req.getParameter("item"));
    	String medi_cd 		= Util.checkString(req.getParameter("medi_cd"));
    	String pubc_frdt 	= Util.checkString(req.getParameter("pubc_frdt"));
    	String pubc_todt 	= Util.checkString(req.getParameter("pubc_todt"));
    	String hndl_clsf 	= Util.checkString(req.getParameter("hndl_clsf"));
    	String chnl_clsf 	= Util.checkString(req.getParameter("chnl_clsf"));
    	

    	String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
    	
    	Hashtable hash = getHashMultiUpdateData(multiUpdateData);

    	String checked = StringUtil.nvl((String)hash.get("checked")); 
    	String pubc_slip_no = StringUtil.nvl((String)hash.get("pubc_slip_no"));
    	
    	String email_id	= Util.checkString(req.getParameter("email_id")); 
    	String elec_tax_comp_cd	= Util.checkString(req.getParameter("elec_tax_comp_cd"));
    	String semuro_no = Util.checkString(req.getParameter("semuro_no"));
    	
    	AD_TAX_1120_ADM dm = new AD_TAX_1120_ADM();
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setHndl_clsf(hndl_clsf);
    	dm.setSlip_clsf_cd(slip_clsf_cd);
    	dm.setSlip_occr_dt(slip_occr_dt);
    	dm.setMake_dt(make_dt);
    	dm.setSuply_amt(suply_amt);
    	dm.setVat_amt(vat_amt);
    	dm.setErn(ern);
    	dm.setDlco_no(dlco_no);
    	dm.setDlco_nm(dlco_nm);
    	dm.setPresi_nm(presi_nm);
    	dm.setAddr(addr);
    	dm.setBizcond(bizcond);
    	dm.setItem(item);
    	dm.setMedi_cd(medi_cd);
    	dm.setPubc_frdt(pubc_frdt);
    	dm.setPubc_todt(pubc_todt);
    	dm.setChecked(checked);
    	dm.setPubc_slip_no(pubc_slip_no);
    	
    	dm.setEmail_id(email_id);
    	dm.setElec_tax_comp_cd(elec_tax_comp_cd);
    	dm.setSemuro_no(semuro_no);
    	
    	dm.setIncmg_pers_ip(incmg_pers_ip);
    	dm.setIncmg_pers(incmg_pers);
    	dm.setChnl_clsf(chnl_clsf);
    	
    	dm.print();

        try {
        	AdTax1100DAO	dao = new AdTax1100DAO();
            ds = dao.ad_tax_1120_a(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        } 
//        
//        AdTax1100EJBHome home = (AdTax1100EJBHome) JNDIManager.getInstance().getHome("AdTax1100EJB");
//        try {
//        	AdTax1100EJB ejb = home.create();
//            ds = ejb.ad_tax_1120_a(dm);
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
    public void ad_tax_1121_a(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	AD_TAX_1121_ADataSet ds = null;
  
        // DM Setting
    	String cmpy_cd   	= Util.getSessionParameterValue(req, "cmpycd", true);
    	String incmg_pers 	 = Util.getSessionParameterValue(req, "emp_no", true);
    	String incmg_pers_ip = req.getRemoteAddr();

    	String slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
    	String slip_occr_dt = Util.checkString(req.getParameter("slip_occr_dt"));
    	String slip_seq = Util.checkString(req.getParameter("slip_seq"));
    	String prof_type_cd = Util.checkString(req.getParameter("prof_type_cd"));
    	String medi_cd = Util.checkString(req.getParameter("medi_cd"));
    	String dlco_no = Util.checkString(req.getParameter("dlco_no"));
    	String make_dt = Util.checkString(req.getParameter("make_dt"));
    	String suply_amt = Util.checkString(req.getParameter("suply_amt"));
    	String vat_amt = Util.checkString(req.getParameter("vat_amt"));
    	String pubc_frdt = Util.checkString(req.getParameter("pubc_frdt"));
    	String pubc_todt = Util.checkString(req.getParameter("pubc_todt"));

    	String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
    	
    	Hashtable hash = getHashMultiUpdateData(multiUpdateData);

    	String checked = StringUtil.nvl((String)hash.get("checked")); 
    	String pubc_slip_no = StringUtil.nvl((String)hash.get("pubc_slip_no")); 
    	
    	AD_TAX_1121_ADM dm = new AD_TAX_1121_ADM();
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setSlip_clsf_cd(slip_clsf_cd);
    	dm.setSlip_occr_dt(slip_occr_dt);
    	dm.setSlip_seq(slip_seq);
    	dm.setProf_type_cd(prof_type_cd);
    	dm.setMedi_cd(medi_cd);
    	dm.setDlco_no(dlco_no);
    	dm.setMake_dt(make_dt);
    	dm.setSuply_amt(suply_amt);
    	dm.setVat_amt(vat_amt);
    	dm.setPubc_frdt(pubc_frdt);
    	dm.setPubc_todt(pubc_todt);
    	dm.setChecked(checked);
    	dm.setPubc_slip_no(pubc_slip_no);
    	dm.setIncmg_pers_ip(incmg_pers_ip);
    	dm.setIncmg_pers(incmg_pers);
    	
    	//dm.print();

        try {
        	AdTax1100DAO	dao = new AdTax1100DAO();
            ds = dao.ad_tax_1121_a(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        } 
//        
//        AdTax1100EJBHome home = (AdTax1100EJBHome) JNDIManager.getInstance().getHome("AdTax1100EJB");
//        try {
//        	AdTax1100EJB ejb = home.create();
//            ds = ejb.ad_tax_1121_a(dm);
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
    public void ad_tax_1122_a(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	AD_TAX_1122_ADataSet ds = null;
  
        // DM Setting
    	String cmpy_cd   	= Util.getSessionParameterValue(req, "cmpycd", true);
    	String incmg_pers 	 = Util.getSessionParameterValue(req, "emp_no", true);
    	String incmg_pers_ip = req.getRemoteAddr();

    	String slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
    	String slip_occr_dt = Util.checkString(req.getParameter("slip_occr_dt"));
    	String slip_seq = Util.checkString(req.getParameter("slip_seq"));
    	String prof_type_cd = Util.checkString(req.getParameter("prof_type_cd"));
    	String make_dt = Util.checkString(req.getParameter("make_dt"));
    	
    	AD_TAX_1122_ADM dm = new AD_TAX_1122_ADM();
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setSlip_clsf_cd(slip_clsf_cd);
    	dm.setSlip_occr_dt(slip_occr_dt);
    	dm.setSlip_seq(slip_seq);
    	dm.setProf_type_cd(prof_type_cd);
    	dm.setMake_dt(make_dt);
    	dm.setIncmg_pers_ip(incmg_pers_ip);
    	dm.setIncmg_pers(incmg_pers);
    	
    	//dm.print();

        try {
        	AdTax1100DAO	dao = new AdTax1100DAO();
            ds = dao.ad_tax_1122_a(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        } 
//        
//        AdTax1100EJBHome home = (AdTax1100EJBHome) JNDIManager.getInstance().getHome("AdTax1100EJB");
//        try {
//        	AdTax1100EJB ejb = home.create();
//            ds = ejb.ad_tax_1122_a(dm);
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
    public void ad_tax_1130_s(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	AD_TAX_1130_SDataSet ds = null;

        // DM Setting
    	String cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
    	String medi_clsf    = Util.getSessionParameterValue(req, "dealmedicd", true);
    	String slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
    	String slip_occr_dt = Util.checkString(req.getParameter("slip_occr_dt"));
    	String slip_seq = Util.checkString(req.getParameter("slip_seq"));
    	
    	AD_TAX_1130_SDM dm = new AD_TAX_1130_SDM();

    	dm.setCmpy_cd(cmpy_cd);
    	dm.setMedi_clsf(medi_clsf);
    	dm.setSlip_clsf_cd(slip_clsf_cd);
    	dm.setSlip_occr_dt(slip_occr_dt);
    	dm.setSlip_seq(slip_seq);
    	
    	dm.print();

        try {
        	AdTax1100DAO	dao = new AdTax1100DAO();
            ds = dao.ad_tax_1130_s(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        } 
//        
//        AdTax1100EJBHome home = (AdTax1100EJBHome) JNDIManager.getInstance().getHome("AdTax1100EJB");
//        try {
//        	AdTax1100EJB ejb = home.create();
//            ds = ejb.ad_tax_1130_s(dm);
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

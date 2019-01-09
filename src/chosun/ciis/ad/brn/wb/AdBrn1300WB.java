/***************************************************************************************************
* 파일명 : AdBrn1300WB.java
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

package chosun.ciis.ad.brn.wb;

import java.util.Hashtable;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.util.Util;
import chosun.ciis.ad.brn.dao.AdBrn1300DAO;
import chosun.ciis.ad.brn.dm.AD_BRN_1300_MDM;
import chosun.ciis.ad.brn.dm.AD_BRN_1310_LDM;
import chosun.ciis.ad.brn.dm.AD_BRN_1320_ADM;
import chosun.ciis.ad.brn.dm.AD_BRN_1321_ADM;
import chosun.ciis.ad.brn.dm.AD_BRN_1322_ADM;
import chosun.ciis.ad.brn.dm.AD_BRN_1330_SDM;
import chosun.ciis.ad.brn.ds.AD_BRN_1300_MDataSet;
import chosun.ciis.ad.brn.ds.AD_BRN_1310_LDataSet;
import chosun.ciis.ad.brn.ds.AD_BRN_1320_ADataSet;
import chosun.ciis.ad.brn.ds.AD_BRN_1321_ADataSet;
import chosun.ciis.ad.brn.ds.AD_BRN_1322_ADataSet;
import chosun.ciis.ad.brn.ds.AD_BRN_1330_SDataSet;
import chosun.ciis.ad.common.dm.AD_CO_9004_SDM;
import chosun.ciis.ad.common.ds.AD_CO_9004_SDataSet;
import chosun.ciis.co.base.util.StringUtil;
import chosun.ciis.co.base.wb.BaseWB;
/**
 * 
 */

public class AdBrn1300WB extends BaseWB {

	public static final String PRENG_ADVT_BO = "00038160";
	
    /**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void ad_brn_1300_m(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	AD_BRN_1300_MDataSet ds = null;

        // DM Setting
    	AD_BRN_1300_MDM dm = new AD_BRN_1300_MDM();
    	String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);
    	
    	dm.setCmpy_cd(cmpy_cd);

        try {
        	AdBrn1300DAO dao = new AdBrn1300DAO();
            ds = dao.ad_brn_1300_m(dm);
            req.setAttribute("ds", ds);
        }  
        catch (AppException e) {
            throw e;
        }  
//        
//        AdBrn1300EJBHome home = (AdBrn1300EJBHome) JNDIManager.getInstance().getHome("AdBrn1300EJB");
//        try {
//        	AdBrn1300EJB ejb = home.create();
//            ds = ejb.ad_brn_1300_m(dm);
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
    public void ad_brn_1310_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	AD_BRN_1310_LDataSet ds = null;

    	String cmpy_cd    		=  Util.getSessionParameterValue(req, "cmpycd", true);

        String preng_advt_bo = Util.getSessionParameterValue(req, "emp_no", true);
        if("209001".equals(preng_advt_bo))	preng_advt_bo = PRENG_ADVT_BO;
        
    	String medi_cd 			= Util.checkString(req.getParameter("medi_cd"));
    	String frdt 			= Util.checkString(req.getParameter("frdt"));
    	String todt 			= Util.checkString(req.getParameter("todt"));
    	String dlco_no 			= Util.checkString(req.getParameter("dlco_no"));

    	// DM Setting
    	AD_BRN_1310_LDM dm = new AD_BRN_1310_LDM();
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setMedi_cd(medi_cd);
    	dm.setFrdt(frdt);
    	dm.setTodt(todt);
    	dm.setDlco_no(dlco_no);
    	dm.setPreng_advt_bo(preng_advt_bo);
    	
    	dm.print();

        try {
        	AdBrn1300DAO dao = new AdBrn1300DAO();
            ds = dao.ad_brn_1310_l(dm);
            req.setAttribute("ds", ds);
        }  
        catch (AppException e) {
            throw e;
        }  
//        
//        AdBrn1300EJBHome home = (AdBrn1300EJBHome) JNDIManager.getInstance().getHome("AdBrn1300EJB");
//        try {
//        	AdBrn1300EJB ejb = home.create();
//            ds = ejb.ad_brn_1310_l(dm);
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
    public void ad_brn_1311_s(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	AD_CO_9004_SDataSet ds = null;

        // DM Setting
    	AD_CO_9004_SDM dm = new AD_CO_9004_SDM();
    	String cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
    	String dlco_no = Util.checkString(req.getParameter("dlco_no"));

    	dm.setCmpy_cd(cmpy_cd);
    	dm.setDlco_no(dlco_no);
    	
//    	//dm.print();

        try {
        	AdBrn1300DAO dao = new AdBrn1300DAO();
            ds = dao.ad_brn_1311_s(dm);
            req.setAttribute("ds", ds);
        }  
        catch (AppException e) {
            throw e;
        }  
//        
//        AdBrn1300EJBHome home = (AdBrn1300EJBHome) JNDIManager.getInstance().getHome("AdBrn1300EJB");
//        try {
//        	AdBrn1300EJB ejb = home.create();
//            ds = ejb.ad_brn_1311_s(dm);
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
    public void ad_brn_1320_a(HttpServletRequest req, HttpServletResponse res) throws   AppException {
 	
	 	AD_BRN_1320_ADataSet ds = null;
	
	     // DM Setting
	 	String cmpy_cd 			= Util.getSessionParameterValue(req, "cmpycd", true);
        String preng_advt_bo 	= Util.getSessionParameterValue(req, "emp_no", true);
        if("209001".equals(preng_advt_bo))	preng_advt_bo = PRENG_ADVT_BO;
        if("it0015".equals(preng_advt_bo))	preng_advt_bo = PRENG_ADVT_BO;
        
	 	//String incmg_pers 		= PRENG_ADVT_BO;//Util.getSessionParameterValue(req, "emp_no", true);
	 	String incmg_pers_ip 	= req.getRemoteAddr();
	
	 	String slip_clsf_cd 	= Util.checkString(req.getParameter("slip_clsf_cd"));
	 	String slip_occr_dt 	= Util.checkString(req.getParameter("slip_occr_dt"));
	 	String slip_seq 		= Util.checkString(req.getParameter("slip_seq"));
	 	String prof_type_cd 	= Util.checkString(req.getParameter("prof_type_cd"));
	 	String make_dt 			= Util.checkString(req.getParameter("make_dt"));
	 	String suply_amt 		= Util.checkString(req.getParameter("suply_amt"));
	 	String vat_amt 			= Util.checkString(req.getParameter("vat_amt"));
	 	String ern 				= Util.checkString(req.getParameter("demand_ern"));
	 	String dlco_no 			= Util.checkString(req.getParameter("demand_dlco_no"));
	 	String dlco_nm 			= Util.checkString(req.getParameter("demand_dlco_nm"));
	 	String presi_nm 		= Util.checkString(req.getParameter("demand_presi_nm"));
	 	String addr 			= Util.checkString(req.getParameter("demand_addr"));
	 	String bizcond 			= Util.checkString(req.getParameter("demand_bizcond"));
	 	String item 			= Util.checkString(req.getParameter("demand_item"));
	 	String dlco_clsf_cd 	= Util.checkString(req.getParameter("dlco_clsf_cd"));
	 	String medi_cd 			= Util.checkString(req.getParameter("medi_cd"));
	 	String re_issu_resn_cd 	= Util.checkString(req.getParameter("re_issu_resn_cd"));
	 	String issu_tms 		= Util.checkString(req.getParameter("issu_tms"));
	 	String tax_item 		= Util.checkString(req.getParameter("tax_item"));
	 	String multiUpdateData 	= Util.checkString(req.getParameter("multiUpdateData"));
	 	
	 	//String trust_dlco_no = preng_advt_bo;//Util.checkString(req.getParameter("trust_dlco_no"));
	 	String email_id = Util.checkString(req.getParameter("email_id"));
		String elec_tax_comp_cd = Util.checkString(req.getParameter("elec_tax_comp_cd"));
		String semuro_no = Util.checkString(req.getParameter("semuro_no"));
	 	
	 	Hashtable hash = getHashMultiUpdateData(multiUpdateData);
	
	 	String checked = StringUtil.nvl((String)hash.get("checked")); 
	 	String pubc_slip_no = StringUtil.nvl((String)hash.get("pubc_slip_no")); 
	 	String pubc_dt = StringUtil.nvl((String)hash.get("pubc_dt"));  
	 	
	 	AD_BRN_1320_ADM dm = new AD_BRN_1320_ADM();
	 	dm.setCmpy_cd(cmpy_cd);
	 	dm.setSlip_clsf_cd(slip_clsf_cd);
	 	dm.setSlip_occr_dt(slip_occr_dt);
	 	dm.setSlip_seq(slip_seq);
	 	dm.setProf_type_cd(prof_type_cd);
	 	dm.setMake_dt(make_dt);
	 	dm.setSuply_amt(suply_amt);
	 	dm.setVat_amt(vat_amt);
	 	dm.setErn(ern);
	 	dm.setDlco_clsf_cd(dlco_clsf_cd);
	 	dm.setDlco_no(dlco_no);
	 	dm.setDlco_nm(dlco_nm);
	 	dm.setPresi_nm(presi_nm);
	 	dm.setAddr(addr);
	 	dm.setBizcond(bizcond);
	 	dm.setItem(item);
	 	dm.setMedi_cd(medi_cd);
	 	dm.setRe_issu_resn_cd(re_issu_resn_cd);
	 	dm.setIssu_tms(issu_tms);
	 	dm.setTax_item(tax_item);
	 	dm.setChecked(checked);
	 	//dm.setTrust_dlco_no(trust_dlco_no);
	 	dm.setPubc_slip_no(pubc_slip_no);
	 	dm.setPubc_dt(pubc_dt);
	 	dm.setEmail_id(email_id);
		dm.setElec_tax_comp_cd(elec_tax_comp_cd);
		dm.setSemuro_no(semuro_no);
	 	dm.setIncmg_pers_ip(incmg_pers_ip);
	 	dm.setIncmg_pers(preng_advt_bo);
	 	
	 	dm.print();

        try {
        	AdBrn1300DAO dao = new AdBrn1300DAO();
            ds = dao.ad_brn_1320_a(dm);
            req.setAttribute("ds", ds);
        }  
        catch (AppException e) {
            throw e;
        }  
//        
//	     AdBrn1300EJBHome home = (AdBrn1300EJBHome) JNDIManager.getInstance().getHome("AdBrn1300EJB");
//	     try {
//	     	AdBrn1300EJB ejb = home.create();
//	         ds = ejb.ad_brn_1320_a(dm);
//	         req.setAttribute("ds", ds);
//	     }
//	     catch (CreateException e) {
//	         SysException se = new SysException(e);
//	         LogManager.getInstance().log(se);
//	         throw se;
//	     }
//	     catch (RemoteException e) {
//	         SysException se = new SysException(e);
//	         LogManager.getInstance().log(se);
//	         throw se;
//	     }
	 }
 
    

    /**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void ad_brn_1321_a(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	AD_BRN_1321_ADataSet ds = null;

        // DM Setting
    	String cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
        String preng_advt_bo 	= Util.getSessionParameterValue(req, "emp_no", true);
        if("209001".equals(preng_advt_bo))	preng_advt_bo = PRENG_ADVT_BO;
        
    	String incmg_pers_ip = req.getRemoteAddr();

    	String slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
    	String slip_occr_dt = Util.checkString(req.getParameter("slip_occr_dt"));
    	String slip_seq     = Util.checkString(req.getParameter("slip_seq"));
    	String prof_type_cd = Util.checkString(req.getParameter("prof_type_cd"));
    	String make_dt 		= Util.checkString(req.getParameter("make_dt"));
    	String tax_item 	= Util.checkString(req.getParameter("tax_item"));
    	String suply_amt 	= Util.checkString(req.getParameter("suply_amt"));
    	String vat_amt 		= Util.checkString(req.getParameter("vat_amt"));
    	
    	String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
    	
    	Hashtable hash = getHashMultiUpdateData(multiUpdateData);

    	String checked = StringUtil.nvl((String)hash.get("checked")); 
    	String pubc_slip_no = StringUtil.nvl((String)hash.get("pubc_slip_no")); 
    	String pubc_dt = StringUtil.nvl((String)hash.get("pubc_dt"));  
    	
    	AD_BRN_1321_ADM dm = new AD_BRN_1321_ADM();
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setSlip_clsf_cd(slip_clsf_cd);
    	dm.setSlip_occr_dt(slip_occr_dt);
    	dm.setSlip_seq(slip_seq);
    	dm.setProf_type_cd(prof_type_cd);
    	dm.setMake_dt(make_dt);
    	dm.setTax_item(tax_item);
    	dm.setSuply_amt(suply_amt);
    	dm.setVat_amt(vat_amt);
    	dm.setChecked(checked);
    	dm.setPubc_slip_no(pubc_slip_no);
    	dm.setPubc_dt(pubc_dt);
    	dm.setIncmg_pers_ip(incmg_pers_ip);
    	dm.setIncmg_pers(preng_advt_bo);
    	
//    	//dm.print();

        try {
        	AdBrn1300DAO dao = new AdBrn1300DAO();
            ds = dao.ad_brn_1321_a(dm);
            req.setAttribute("ds", ds);
        }  
        catch (AppException e) {
            throw e;
        }  
//        
//        AdBrn1300EJBHome home = (AdBrn1300EJBHome) JNDIManager.getInstance().getHome("AdBrn1300EJB");
//        try {
//        	AdBrn1300EJB ejb = home.create();
//            ds = ejb.ad_brn_1321_a(dm);
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
    public void ad_brn_1322_a(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	AD_BRN_1322_ADataSet ds = null;

        // DM Setting
    	String cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
        String preng_advt_bo 	= Util.getSessionParameterValue(req, "emp_no", true);
        if("209001".equals(preng_advt_bo))	preng_advt_bo = PRENG_ADVT_BO;
        
    	String incmg_pers_ip = req.getRemoteAddr();

    	String slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
    	String slip_occr_dt = Util.checkString(req.getParameter("slip_occr_dt"));
    	String slip_seq     = Util.checkString(req.getParameter("slip_seq"));
    	String prof_type_cd = Util.checkString(req.getParameter("prof_type_cd"));
    	String make_dt 		= Util.checkString(req.getParameter("make_dt"));

    	AD_BRN_1322_ADM dm = new AD_BRN_1322_ADM();
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setSlip_clsf_cd(slip_clsf_cd);
    	dm.setSlip_occr_dt(slip_occr_dt);
    	dm.setSlip_seq(slip_seq);
    	dm.setProf_type_cd(prof_type_cd);
    	dm.setMake_dt(make_dt);
    	dm.setIncmg_pers_ip(incmg_pers_ip);
    	dm.setIncmg_pers(preng_advt_bo);
    	
//    	//dm.print();

        try {
        	AdBrn1300DAO dao = new AdBrn1300DAO();
            ds = dao.ad_brn_1322_a(dm);
            req.setAttribute("ds", ds);
        }  
        catch (AppException e) {
            throw e;
        }  
//        
//        AdBrn1300EJBHome home = (AdBrn1300EJBHome) JNDIManager.getInstance().getHome("AdBrn1300EJB");
//        try {
//        	AdBrn1300EJB ejb = home.create();
//            ds = ejb.ad_brn_1322_a(dm);
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
    public void ad_brn_1330_s(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	AD_BRN_1330_SDataSet ds = null;

        // DM Setting
    	String cmpy_cd 		= Util.getSessionParameterValue(req, "cmpycd", true);
    	String hndl_clsf    = Util.checkString(req.getParameter("hndl_clsf"));
    	String prof_type_cd = Util.checkString(req.getParameter("prof_type_cd"));
    	String slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
    	String slip_occr_dt = Util.checkString(req.getParameter("slip_occr_dt"));
    	String slip_seq 	= Util.checkString(req.getParameter("slip_seq"));
    	
    	AD_BRN_1330_SDM dm = new AD_BRN_1330_SDM();

    	dm.setCmpy_cd(cmpy_cd);
    	dm.setHndl_clsf(hndl_clsf);
    	dm.setProf_type_cd(prof_type_cd);
    	dm.setSlip_clsf_cd(slip_clsf_cd);
    	dm.setSlip_occr_dt(slip_occr_dt);
    	dm.setSlip_seq(slip_seq);
    	
//    	//dm.print();

        try {
        	AdBrn1300DAO dao = new AdBrn1300DAO();
            ds = dao.ad_brn_1330_s(dm);
            req.setAttribute("ds", ds);
        }  
        catch (AppException e) {
            throw e;
        }  
//        
//        AdBrn1300EJBHome home = (AdBrn1300EJBHome) JNDIManager.getInstance().getHome("AdBrn1300EJB");
//        try {
//        	AdBrn1300EJB ejb = home.create();
//            ds = ejb.ad_brn_1330_s(dm);
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

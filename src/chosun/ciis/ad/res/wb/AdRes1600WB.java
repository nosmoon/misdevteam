/***************************************************************************************************
* 파일명 : AdRes1600WB.java
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

package chosun.ciis.ad.res.wb;

import java.util.Hashtable;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.util.Util;
import chosun.ciis.ad.res.dao.AdRes1600DAO;
import chosun.ciis.ad.res.dm.AD_RES_1600_MDM;
import chosun.ciis.ad.res.dm.AD_RES_1610_LDM;
import chosun.ciis.ad.res.dm.AD_RES_1620_LDM;
import chosun.ciis.ad.res.dm.AD_RES_1621_ADM;
import chosun.ciis.ad.res.ds.AD_RES_1600_MDataSet;
import chosun.ciis.ad.res.ds.AD_RES_1610_LDataSet;
import chosun.ciis.ad.res.ds.AD_RES_1620_LDataSet;
import chosun.ciis.ad.res.ds.AD_RES_1621_ADataSet;
import chosun.ciis.ad.tax.dm.AD_TAX_2750_ADM;
import chosun.ciis.co.base.wb.BaseWB;
/**
 * 
 */

public class AdRes1600WB extends BaseWB {

    /**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void ad_res_1600_m(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	AD_RES_1600_MDataSet ds = null;

        // DM Setting
    	AD_RES_1600_MDM dm = new AD_RES_1600_MDM();
    	String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);
    	String medi_clsf  = Util.getSessionParameterValue(req, "dealmedicd", true); //매체구분  1:신문광고, 2:출판광고, 3:재경국
    	String emp_no     = Util.getSessionParameterValue(req, "emp_no", true);

        dm.setCmpy_cd(cmpy_cd);
        dm.setMedi_clsf(medi_clsf);
        dm.setEmp_no(emp_no);

        try {
        	AdRes1600DAO	dao = new AdRes1600DAO();
            ds = dao.ad_res_1600_m(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        } 
//        
//        AdRes1600EJBHome home = (AdRes1600EJBHome) JNDIManager.getInstance().getHome("AdRes1600EJB");
//        try {
//        	AdRes1600EJB ejb = home.create();
//            ds = ejb.ad_res_1600_m(dm);
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
    public void ad_res_1610_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	AD_RES_1610_LDataSet ds = null;

    	String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);
    	String medi_cd = Util.checkString(req.getParameter("medi_cd"));
    	String frdt = Util.checkString(req.getParameter("frdt"));
    	String todt = Util.checkString(req.getParameter("todt"));
    	String slcrg_pers = Util.checkString(req.getParameter("slcrg_pers"));
    	String pubc_clsf = Util.checkString(req.getParameter("pubc_clsf"));
    	String indt_clsf = Util.checkString(req.getParameter("indt_clsf"));
    	String hndl_clsf = Util.checkString(req.getParameter("hndl_clsf"));
    	String dlco_no = Util.checkString(req.getParameter("dlco_no"));
    	String hndl_plac_cd = Util.checkString(req.getParameter("hndl_plac_cd"));
    	String grp_cmpy_cd = Util.checkString(req.getParameter("grp_cmpy_cd"));

        // DM Setting
    	AD_RES_1610_LDM dm = new AD_RES_1610_LDM();
        dm.setCmpy_cd(cmpy_cd);
        dm.setMedi_cd(medi_cd);
        dm.setFrdt(frdt);
        dm.setTodt(todt);
        dm.setSlcrg_pers(slcrg_pers);
        dm.setPubc_clsf(pubc_clsf);
        dm.setIndt_clsf(indt_clsf);
        dm.setHndl_clsf(hndl_clsf);
        dm.setDlco_no(dlco_no);
        dm.setHndl_plac_cd(hndl_plac_cd);
        dm.setGrp_cmpy_cd(grp_cmpy_cd);
        
        dm.print();

        try {
        	AdRes1600DAO	dao = new AdRes1600DAO();
            ds = dao.ad_res_1610_l(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        } 
//        
//        AdRes1600EJBHome home = (AdRes1600EJBHome) JNDIManager.getInstance().getHome("AdRes1600EJB");
//        try {
//        	AdRes1600EJB ejb = home.create();
//            ds = ejb.ad_res_1610_l(dm);
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
    public void ad_res_1620_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	AD_RES_1620_LDataSet ds = null;

    	String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);
    	String medi_cd = Util.checkString(req.getParameter("medi_cd"));
    	String frdt = Util.checkString(req.getParameter("frdt"));
    	String todt = Util.checkString(req.getParameter("todt"));
    	String slcrg_pers = Util.checkString(req.getParameter("slcrg_pers"));
    	String indt_clsf = Util.checkString(req.getParameter("indt_clsf"));
    	String hndl_clsf = Util.checkString(req.getParameter("hndl_clsf"));
    	String dlco_no = Util.checkString(req.getParameter("dlco_no"));
    	String hndl_plac_cd = Util.checkString(req.getParameter("hndl_plac_cd"));
    	String grp_cmpy_cd = Util.checkString(req.getParameter("grp_cmpy_cd"));

        // DM Setting
    	AD_RES_1620_LDM dm = new AD_RES_1620_LDM();
        dm.setCmpy_cd(cmpy_cd);
        dm.setMedi_cd(medi_cd);
        dm.setFrdt(frdt);
        dm.setTodt(todt);
        dm.setSlcrg_pers(slcrg_pers);
        dm.setIndt_clsf(indt_clsf);
        dm.setHndl_clsf(hndl_clsf);
        dm.setDlco_no(dlco_no);
        dm.setHndl_plac_cd(hndl_plac_cd);
        dm.setGrp_cmpy_cd(grp_cmpy_cd);
        
        dm.print();

        try {
        	AdRes1600DAO	dao = new AdRes1600DAO();
            ds = dao.ad_res_1620_l(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        } 
    }  
    public void ad_res_1621_a(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	AD_RES_1621_ADataSet ds = null;
    	String cmpy_cd       = Util.getSessionParameterValue(req, "cmpycd", true);
    	String incmg_pers    = Util.getSessionParameterValue(req, "emp_no", true);
    	String incmg_pers_ip = req.getRemoteAddr();

    	String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
    	
    	Hashtable hash = getHashMultiUpdateData(multiUpdateData);

    	String mode				= Util.checkString((String)hash.get("m"));
    	String medi_cd	        = Util.checkString((String)hash.get("medi_cd"));
    	String tax_clsf	        = Util.checkString((String)hash.get("tax_clsf"));
    	String preng_occr_dt 	= Util.checkString((String)hash.get("preng_occr_dt"));
    	String advt_clsf	   	= Util.checkString((String)hash.get("advt_clsf"));
    	String dlco_nm	   		= Util.checkString((String)hash.get("dlco_nm"));
    	//String dlco_no	   		= Util.checkString((String)hash.get("dlco_no"));
    	String advt_fee  	    = Util.checkString((String)hash.get("advt_fee"));
    	String agn              = Util.checkString((String)hash.get("agn"));
    	//String agn_nm           = Util.checkString((String)hash.get("agn_nm"));
    	String fee              = Util.checkString((String)hash.get("fee"));
    	String slcrg_pers	 	= Util.checkString((String)hash.get("slcrg_pers"));
    	String advt_cont	   	= Util.checkString((String)hash.get("advt_cont"));
    	String remk		   		= Util.checkString((String)hash.get("remk"));
    	String patr_chrg_info  	= Util.checkString((String)hash.get("patr_chrg_info"));
    	String tax_email   		= Util.checkString((String)hash.get("tax_email"));
    	
        // DM Setting
    	AD_RES_1621_ADM dm = new AD_RES_1621_ADM();
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setMode(mode);
    	dm.setMedi_cd(medi_cd);
    	dm.setTax_clsf(tax_clsf);
    	dm.setPreng_occr_dt(preng_occr_dt);
    	dm.setAdvt_clsf(advt_clsf);
    	dm.setDlco_nm(dlco_nm);
    	dm.setAdvt_fee(advt_fee);
    	dm.setAgn(agn);
    	dm.setFee(fee);
    	dm.setSlcrg_pers(slcrg_pers);
    	dm.setAdvt_cont(advt_cont);
        dm.setRemk(remk);
        dm.setPatr_chrg_info(patr_chrg_info);
        dm.setTax_email(tax_email);
        dm.setIncmg_pers_ip(incmg_pers_ip);
        dm.setIncmg_pers(incmg_pers);
        
        dm.print();

        try {
        	AdRes1600DAO	dao = new AdRes1600DAO();
            ds = dao.ad_res_1621_a(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        } 
    }     
}

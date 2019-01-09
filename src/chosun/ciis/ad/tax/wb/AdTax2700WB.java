/***************************************************************************************************
* 파일명 : AdTax2700WB.java
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

package chosun.ciis.ad.tax.wb;

import java.util.Hashtable;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.util.Util;
import chosun.ciis.ad.tax.dao.AdTax2700DAO;
import chosun.ciis.ad.tax.dm.AD_TAX_2700_MDM;
import chosun.ciis.ad.tax.dm.AD_TAX_2710_LDM;
import chosun.ciis.ad.tax.dm.AD_TAX_2751_LDM;
import chosun.ciis.ad.tax.dm.AD_TAX_2750_ADM;
import chosun.ciis.ad.tax.ds.AD_TAX_2700_MDataSet;
import chosun.ciis.ad.tax.ds.AD_TAX_2710_LDataSet;
import chosun.ciis.ad.tax.ds.AD_TAX_2750_ADataSet;
import chosun.ciis.ad.tax.ds.AD_TAX_2751_LDataSet;
import chosun.ciis.co.base.wb.BaseWB;
/**
 * 
 */

public class AdTax2700WB extends BaseWB {

    /**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void ad_tax_2700_m(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	AD_TAX_2700_MDataSet ds = null;

        // DM Setting
    	String cmpy_cd    	= Util.getSessionParameterValue(req, "cmpycd", true);
    	String dealmedicd   = Util.getSessionParameterValue(req, "dealmedicd", true);
    	String emp_no		= Util.getSessionParameterValue(req, "emp_no", true);
    	
    	AD_TAX_2700_MDM dm = new AD_TAX_2700_MDM();
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setDealmedicd(dealmedicd);    	

        try {
        	AdTax2700DAO	dao = new AdTax2700DAO();
            ds = dao.ad_tax_2700_m(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        } 
    }    

    /**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void ad_tax_2710_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	AD_TAX_2710_LDataSet ds = null;

        // DM Setting
    	String cmpy_cd    		= Util.getSessionParameterValue(req, "cmpycd", true);    	
    	String frdt 			= Util.checkString(req.getParameter("frdt"));
    	String todt 			= Util.checkString(req.getParameter("todt"));
    	String elec_tax_comp_cd = Util.checkString(req.getParameter("elec_tax_comp_cd"));
    	String approve_id		= Util.checkString(req.getParameter("approve_id"));
    	String byr_value		= Util.checkString(req.getParameter("byr_value"));
    	String byr_flag			= Util.checkString(req.getParameter("byr_flag"));
    	String broker_value		= Util.checkString(req.getParameter("broker_value"));
    	String broker_flag		= Util.checkString(req.getParameter("broker_flag"));
    	String incmg_pers		= Util.checkString(req.getParameter("incmg_pers"));
    	
    	AD_TAX_2710_LDM dm = new AD_TAX_2710_LDM();
    	dm.setCmpy_cd(cmpy_cd);    	
    	dm.setFrdt(frdt);
    	dm.setTodt(todt);
    	dm.setElec_tax_comp_cd(elec_tax_comp_cd);
    	dm.setApprove_id(approve_id);
    	dm.setByr_flag(byr_flag);
    	dm.setByr_value(byr_value);
    	dm.setBroker_flag(broker_flag);
    	dm.setBroker_value(broker_value);
    	dm.setIncmg_pers(incmg_pers);
    	
        try {
        	AdTax2700DAO	dao = new AdTax2700DAO();
            ds = dao.ad_tax_2710_l(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        } 
    }
    
    /**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void ad_tax_2750_a(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	AD_TAX_2750_ADataSet ds = null;

        // DM Setting
    	String cmpy_cd       = Util.getSessionParameterValue(req, "cmpycd", true);
    	String incmg_pers    = Util.getSessionParameterValue(req, "emp_no", true);
    	String incmg_pers_ip = req.getRemoteAddr();

    	//String flag  		   = Util.checkString(req.getParameter("flag"));
    	String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
    	
    	Hashtable hash = getHashMultiUpdateData(multiUpdateData);

    	String mode				= Util.checkString((String)hash.get("m"));
    	String elec_tax_comp_cd	= Util.checkString((String)hash.get("elec_tax_comp_cd"));
    	String make_dt 			= Util.checkString((String)hash.get("make_dt"));
    	String byr_dlco_nm	   	= Util.checkString((String)hash.get("byr_dlco_nm"));
    	String byr_ern	   		= Util.checkString((String)hash.get("byr_ern"));
    	String broker_dlco_nm  	= Util.checkString((String)hash.get("broker_dlco_nm"));
    	String broker_ern	 	= Util.checkString((String)hash.get("broker_ern"));
    	String suply_amt	   	= Util.checkString((String)hash.get("suply_amt"));
    	String vat_amt	   		= Util.checkString((String)hash.get("vat_amt"));
    	String approve_id	   	= Util.checkString((String)hash.get("approve_id"));
    	String byr_email   		= Util.checkString((String)hash.get("byr_email"));
    	String remk		   		= Util.checkString((String)hash.get("remk"));
    	
    	AD_TAX_2750_ADM dm = new AD_TAX_2750_ADM();
    	dm.setCmpy_cd(cmpy_cd);
//    	dm.setFlag(flag);
    	dm.setMode(mode.toUpperCase());
    	dm.setElec_tax_comp_cd(elec_tax_comp_cd);
    	dm.setMake_dt(make_dt);
    	dm.setByr_dlco_nm(byr_dlco_nm);
    	dm.setByr_ern(byr_ern);
    	dm.setByr_email(byr_email);
    	dm.setBroker_dlco_nm(broker_dlco_nm);
    	dm.setBroker_ern(broker_ern);
//    	dm.setBroker_email(broker_email);
    	dm.setSuply_amt(suply_amt);
    	dm.setVat_amt(vat_amt);
    	dm.setApprove_id(approve_id);
    	dm.setRemk(remk);
    	dm.setIncmg_pers_ip(incmg_pers_ip);
    	dm.setIncmg_pers(incmg_pers);
    	
    	//dm.print();

        try {
        	AdTax2700DAO	dao = new AdTax2700DAO();
            ds = dao.ad_tax_2750_a(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        } 
    }   
    
    public void ad_tax_2751_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	AD_TAX_2751_LDataSet ds = null;

        // DM Setting
    	String cmpy_cd    		= Util.getSessionParameterValue(req, "cmpycd", true);    	
    	String incmg_pers		= Util.getSessionParameterValue(req, "emp_no", true);
    	
    	AD_TAX_2751_LDM dm = new AD_TAX_2751_LDM();
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setIncmg_pers(incmg_pers);
    	
        try {
        	AdTax2700DAO	dao = new AdTax2700DAO();
            ds = dao.ad_tax_2751_l(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        } 
    }
}

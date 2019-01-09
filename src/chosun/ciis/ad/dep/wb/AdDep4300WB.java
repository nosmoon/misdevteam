/***************************************************************************************************
* 파일명 : AdDep4300WB.java
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

import chosun.ciis.ad.dep.dao.AdDep4300DAO;
import chosun.ciis.ad.dep.dm.AD_DEP_4300_MDM;
import chosun.ciis.ad.dep.dm.AD_DEP_4310_LDM;
import chosun.ciis.ad.dep.dm.AD_DEP_4350_ADM;
import chosun.ciis.ad.dep.ds.AD_DEP_4300_MDataSet;
import chosun.ciis.ad.dep.ds.AD_DEP_4310_LDataSet;
import chosun.ciis.ad.dep.ds.AD_DEP_4350_ADataSet;
import chosun.ciis.co.base.wb.BaseWB;
/**
 * 
 */

public class AdDep4300WB extends BaseWB {

    /**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void ad_dep_4300_m(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	AD_DEP_4300_MDataSet ds = null;

        // DM Setting
    	String cmpy_cd    	= Util.getSessionParameterValue(req, "cmpycd", true);
    	String dealmedicd   = Util.getSessionParameterValue(req, "dealmedicd", true);
    	String emp_no		= Util.getSessionParameterValue(req, "emp_no", true);
    	
    	AD_DEP_4300_MDM dm = new AD_DEP_4300_MDM();
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setDealmedicd(dealmedicd);
    	dm.setEmp_no(emp_no);

        try {
        	AdDep4300DAO	dao = new AdDep4300DAO();
            ds = dao.ad_dep_4300_m(dm);
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
    public void ad_dep_4310_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	AD_DEP_4310_LDataSet ds = null;

        // DM Setting
    	String cmpy_cd    		= Util.getSessionParameterValue(req, "cmpycd", true);    	
    	String frdt 			= Util.checkString(req.getParameter("frdt"));
    	String todt 			= Util.checkString(req.getParameter("todt"));
    	
    	String bank_cd 			= Util.checkString(req.getParameter("bank_cd"));
    	String note_clsf_cd		= Util.checkString(req.getParameter("note_clsf_cd"));
    	String issu_cmpy_clsf_cd= Util.checkString(req.getParameter("issu_cmpy_clsf_cd"));
    	String issu_pers_nm		= Util.checkString(req.getParameter("issu_pers_nm"));
    	String rcpm_acct		= Util.checkString(req.getParameter("rcpm_acct"));
    	String sale_aprv_no		= Util.checkString(req.getParameter("sale_aprv_no"));
    	String reg_yn			= Util.checkString(req.getParameter("reg_yn"));
    	
    	AD_DEP_4310_LDM dm = new AD_DEP_4310_LDM();
    	dm.setCmpy_cd(cmpy_cd);    	
    	dm.setFrdt(frdt);
    	dm.setTodt(todt);
    	dm.setBank_cd(bank_cd);
    	dm.setNote_clsf_cd(note_clsf_cd);
    	dm.setIssu_cmpy_clsf_cd(issu_cmpy_clsf_cd);
    	dm.setIssu_pers_nm(issu_pers_nm);
    	dm.setRcpm_acct(rcpm_acct);
    	dm.setSale_aprv_no(sale_aprv_no);
    	dm.setReg_yn(reg_yn);
    	
        try {
        	AdDep4300DAO	dao = new AdDep4300DAO();
            ds = dao.ad_dep_4310_l(dm);
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
    public void ad_dep_4350_a(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	AD_DEP_4350_ADataSet ds = null;

        // DM Setting
    	String cmpy_cd       = Util.getSessionParameterValue(req, "cmpycd", true);
    	String incmg_pers    = Util.getSessionParameterValue(req, "emp_no", true);
    	String incmg_pers_ip = req.getRemoteAddr();

    	//String flag  		   = Util.checkString(req.getParameter("flag"));
    	String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
    	
    	Hashtable hash = getHashMultiUpdateData(multiUpdateData);

    	String mode				= Util.checkString((String)hash.get("m"));
    	String occr_dt			= Util.checkString((String)hash.get("occr_dt"));
    	String bank_cd 			= Util.checkString((String)hash.get("bank_cd"));
    	String note_clsf_cd	   	= Util.checkString((String)hash.get("note_clsf_cd"));
    	String occr_seq	   		= Util.checkString((String)hash.get("occr_seq"));
    	
    	//String issu_cmpy_tmp	= (String)hash.get("issu_cmpy_clsf_cd");
    	//String issu_cmpy_clsf_cd= Util.checkString(issu_cmpy_tmp.substring(0,1));    	
    	String issu_cmpy_clsf_cd= Util.checkString((String)hash.get("issu_cmpy_clsf_cd"));
    	
    	String issu_pers_nm	 	= Util.checkString((String)hash.get("issu_pers_nm"));
    	String endorser_nm	 	= Util.checkString((String)hash.get("endorser_nm"));
    	String note_amt	   		= Util.checkString((String)hash.get("note_amt"));
    	String comp_dt	   		= Util.checkString((String)hash.get("comp_dt"));
    	String mtry_dt		   	= Util.checkString((String)hash.get("mtry_dt"));
    	
    	//String rcpm_acct_tmp	=(String)hash.get("rcpm_acct");
    	//String rcpm_acct   		= Util.checkString(rcpm_acct_tmp.substring(0,4));
    	String rcpm_acct   		= Util.checkString((String)hash.get("rcpm_acct"));
    	String sale_aprv_no		= Util.checkString((String)hash.get("sale_aprv_no"));
    	
    	AD_DEP_4350_ADM dm = new AD_DEP_4350_ADM();
    	dm.setCmpy_cd(cmpy_cd);
    	
    	dm.setOccr_dt(occr_dt);
    	dm.setBank_cd(bank_cd);
    	dm.setNote_clsf_cd(note_clsf_cd);
    	dm.setOccr_seq(occr_seq);
    	dm.setIssu_cmpy_clsf_cd(issu_cmpy_clsf_cd);
    	dm.setIssu_pers_nm(issu_pers_nm);
    	dm.setEndorser_nm(endorser_nm);
    	dm.setNote_amt(note_amt);
    	dm.setComp_dt(comp_dt);
    	dm.setMtry_dt(mtry_dt);
    	dm.setRcpm_acct(rcpm_acct);
    	dm.setSale_aprv_no(sale_aprv_no);
    	    	    	
    	dm.setIncmg_pers_ip(incmg_pers_ip);
    	dm.setIncmg_pers(incmg_pers);
    	dm.setMode(mode.toUpperCase());
    	
    	//dm.print();

        try {
        	AdDep4300DAO	dao = new AdDep4300DAO();
            ds = dao.ad_dep_4350_a(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        } 
    }
}

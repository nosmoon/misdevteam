/***************************************************************************************************
* 파일명 : AdTax1800WB.java
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
import chosun.ciis.ad.tax.dao.AdTax1800DAO;
import chosun.ciis.ad.tax.dm.AD_TAX_1800_MDM;
import chosun.ciis.ad.tax.dm.AD_TAX_1810_LDM;
import chosun.ciis.ad.tax.dm.AD_TAX_1820_ADM;
import chosun.ciis.ad.tax.ds.AD_TAX_1800_MDataSet;
import chosun.ciis.ad.tax.ds.AD_TAX_1810_LDataSet;
import chosun.ciis.ad.tax.ds.AD_TAX_1820_ADataSet;
import chosun.ciis.co.base.wb.BaseWB;
/**
 * 
 */

public class AdTax1800WB extends BaseWB {

    /**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void ad_tax_1800_m(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	AD_TAX_1800_MDataSet ds = null;

        // DM Setting
    	String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);
    	String dealmedicd    = Util.getSessionParameterValue(req, "dealmedicd", true);
    	
    	AD_TAX_1800_MDM dm = new AD_TAX_1800_MDM();
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setDealmedicd(dealmedicd);
    	dm.print();
        try {
        	AdTax1800DAO	dao = new AdTax1800DAO();
            ds = dao.ad_tax_1800_m(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        } 
//        
//        AdTax1800EJBHome home = (AdTax1800EJBHome) JNDIManager.getInstance().getHome("AdTax1800EJB");
//        try {
//        	AdTax1800EJB ejb = home.create();
//            ds = ejb.ad_tax_1800_m(dm);
//            req.setAttribute("ds", ds);
//        }
//        catch (CreateException e) {
//            SysException se = new SysException(e);
//            LogManager.gRetInstance().log(se);
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
    public void ad_tax_1810_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	AD_TAX_1810_LDataSet ds = null;

        // DM Setting
    	String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);
    	String medi_cd = Util.checkString(req.getParameter("medi_cd"));
    	String pay_clsf = Util.checkString(req.getParameter("pay_clsf"));
    	String tax_frdt = Util.checkString(req.getParameter("tax_frdt"));
    	String tax_todt = Util.checkString(req.getParameter("tax_todt"));
    	String rcpm_frdt = Util.checkString(req.getParameter("rcpm_frdt"));
    	String rcpm_todt = Util.checkString(req.getParameter("rcpm_todt"));
    	String agn = Util.checkString(req.getParameter("agn"));
    	
    	AD_TAX_1810_LDM dm = new AD_TAX_1810_LDM();
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setMedi_cd(medi_cd);
    	dm.setPay_clsf(pay_clsf);
    	dm.setTax_frdt(tax_frdt);
    	dm.setTax_todt(tax_todt);
    	dm.setRcpm_frdt(rcpm_frdt);
    	dm.setRcpm_todt(rcpm_todt);
    	dm.setAgn(agn);
    	
    	dm.print();

        try {
        	AdTax1800DAO	dao = new AdTax1800DAO();
            ds = dao.ad_tax_1810_l(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        }
//        
//        AdTax1800EJBHome home = (AdTax1800EJBHome) JNDIManager.getInstance().getHome("AdTax1800EJB");
//        try {
//        	AdTax1800EJB ejb = home.create();
//            ds = ejb.ad_tax_1810_l(dm);
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
    public void ad_tax_1820_a(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	AD_TAX_1820_ADataSet ds = null;

        // DM Setting
    	String cmpy_cd    	 = Util.getSessionParameterValue(req, "cmpycd", true);
    	String incmg_pers_ip = req.getRemoteAddr();
    	String incmg_pers 	 = Util.getSessionParameterValue(req, "emp_no", true);
    	String fee_pay_yn 	 = Util.checkString(req.getParameter("fee_pay_yn"));
    	String pay_clsf 	 = Util.checkString(req.getParameter("pay_clsf"));

    	String multiUpdateData1 = Util.checkString(req.getParameter("multiUpdateData1"));
    	Hashtable hash1 = getHashMultiUpdateData(multiUpdateData1);
    	
    	String multiUpdateData2 = Util.checkString(req.getParameter("multiUpdateData2"));
    	Hashtable hash2 = getHashMultiUpdateData(multiUpdateData2);
    	
    	String rcpm_slip_no = Util.checkString((String)hash1.get("rcpm_slip_no"));
    	
    	String slip_clsf_cd = Util.checkString((String)hash2.get("slip_clsf_cd"));
    	String slip_occr_dt = Util.checkString((String)hash2.get("slip_occr_dt"));
    	String slip_seq		= Util.checkString((String)hash2.get("slip_seq"));
    	
    	AD_TAX_1820_ADM dm = new AD_TAX_1820_ADM();
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setFee_pay_yn(fee_pay_yn);
    	dm.setPay_clsf(pay_clsf);
    	dm.setRcpm_slip_no(rcpm_slip_no);
    	dm.setSlip_clsf_cd(slip_clsf_cd);
    	dm.setSlip_occr_dt(slip_occr_dt);
    	dm.setSlip_seq(slip_seq);
    	dm.setIncmg_pers_ip(incmg_pers_ip);
    	dm.setIncmg_pers(incmg_pers);
    	
    	dm.print();

        try {
        	AdTax1800DAO	dao = new AdTax1800DAO();
            ds = dao.ad_tax_1820_a(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        }
//        
//        AdTax1800EJBHome home = (AdTax1800EJBHome) JNDIManager.getInstance().getHome("AdTax1800EJB");
//        try {
//        	AdTax1800EJB ejb = home.create();
//            ds = ejb.ad_tax_1820_a(dm);
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

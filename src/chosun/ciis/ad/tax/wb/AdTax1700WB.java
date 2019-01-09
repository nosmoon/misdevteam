/***************************************************************************************************
* 파일명 : AdTax1700WB.java
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
import chosun.ciis.ad.tax.dao.AdTax1700DAO;
import chosun.ciis.ad.tax.dm.AD_TAX_1700_MDM;
import chosun.ciis.ad.tax.dm.AD_TAX_1710_LDM;
import chosun.ciis.ad.tax.dm.AD_TAX_1720_ADM;
import chosun.ciis.ad.tax.dm.AD_TAX_1730_LDM;
import chosun.ciis.ad.tax.ds.AD_TAX_1700_MDataSet;
import chosun.ciis.ad.tax.ds.AD_TAX_1710_LDataSet;
import chosun.ciis.ad.tax.ds.AD_TAX_1720_ADataSet;
import chosun.ciis.ad.tax.ds.AD_TAX_1730_LDataSet;
import chosun.ciis.co.base.wb.BaseWB;
/**
 * 
 */

public class AdTax1700WB extends BaseWB {

	
	/**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void ad_tax_1700_m(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	AD_TAX_1700_MDataSet ds = null;

        // DM Setting
    	String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);;
    	
    	AD_TAX_1700_MDM dm = new AD_TAX_1700_MDM();
    	dm.setCmpy_cd(cmpy_cd);
    	
    	dm.print();

        try {
        	AdTax1700DAO	dao = new AdTax1700DAO();
            ds = dao.ad_tax_1700_m(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        } 
//        
//        AdTax1700EJBHome home = (AdTax1700EJBHome) JNDIManager.getInstance().getHome("AdTax1700EJB");
//        try {
//        	AdTax1700EJB ejb = home.create();
//            ds = ejb.ad_tax_1710_l(dm);
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
    public void ad_tax_1710_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	AD_TAX_1710_LDataSet ds = null;

        // DM Setting
    	String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);;
    	String frdt = Util.checkString(req.getParameter("frdt"));
    	String todt = Util.checkString(req.getParameter("todt"));
    	String medi_clsf = Util.checkString(req.getParameter("medi_clsf"));
    	String basi_dt = Util.checkString(req.getParameter("basi_dt"));
    	String pay_clsf = Util.checkString(req.getParameter("pay_clsf"));
    	
    	AD_TAX_1710_LDM dm = new AD_TAX_1710_LDM();
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setFrdt(frdt);
    	dm.setTodt(todt);
    	dm.setMedi_clsf(medi_clsf);
    	dm.setBasi_dt(basi_dt);
    	dm.setPay_clsf(pay_clsf);  
    	
    	dm.print();

        try {
        	AdTax1700DAO	dao = new AdTax1700DAO();
            ds = dao.ad_tax_1710_l(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        } 
//        
//        AdTax1700EJBHome home = (AdTax1700EJBHome) JNDIManager.getInstance().getHome("AdTax1700EJB");
//        try {
//        	AdTax1700EJB ejb = home.create();
//            ds = ejb.ad_tax_1710_l(dm);
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
    public void ad_tax_1720_a(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	AD_TAX_1720_ADataSet ds = null;

        // DM Setting
    	String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);
    	String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
    	String incmg_pers_ip = req.getRemoteAddr();
    	
    	String flag = Util.checkString(req.getParameter("flag"));
    	String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
    	
    	Hashtable hash = getHashMultiUpdateData(multiUpdateData);
    	
    	String tax_stmt_no 	= Util.checkString((String)hash.get("tax_stmt_no"));
    	String rcpm_mtry_dt = Util.checkString((String)hash.get("rcpm_mtry_dt"));
    	String mtry_dt 		= Util.checkString((String)hash.get("mtry_dt"));
    	String pay_dt 		= Util.checkString((String)hash.get("pay_dt"));
    	
    	AD_TAX_1720_ADM dm = new AD_TAX_1720_ADM();
    	dm.setFlag(flag);
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setTax_stmt_no(tax_stmt_no);
    	dm.setRcpm_mtry_dt(rcpm_mtry_dt);
    	dm.setMtry_dt(mtry_dt);
    	dm.setPay_dt(pay_dt);
    	dm.setIncmg_pers_ip(incmg_pers_ip);
    	dm.setIncmg_pers(incmg_pers);
    	
    	dm.print();

        try {
        	AdTax1700DAO	dao = new AdTax1700DAO();
            ds = dao.ad_tax_1720_a(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        } 
//        
//        AdTax1700EJBHome home = (AdTax1700EJBHome) JNDIManager.getInstance().getHome("AdTax1700EJB");
//        try {
//        	AdTax1700EJB ejb = home.create();
//            ds = ejb.ad_tax_1720_a(dm);
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
    public void ad_tax_1730_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	AD_TAX_1730_LDataSet ds = null;

        // DM Setting
    	String cmpy_cd    	= Util.getSessionParameterValue(req, "cmpycd", true);;
    	String frdt 		= Util.checkString(req.getParameter("frdt"));
    	String todt 		= Util.checkString(req.getParameter("todt"));
    	String medi_clsf 	= Util.checkString(req.getParameter("medi_clsf"));
    	String basi_dt 		= Util.checkString(req.getParameter("basi_dt"));
    	String pay_clsf 	= Util.checkString(req.getParameter("pay_clsf"));
    	
    	AD_TAX_1730_LDM dm = new AD_TAX_1730_LDM();
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setFrdt(frdt);
    	dm.setTodt(todt);
    	dm.setMedi_clsf(medi_clsf);
    	dm.setBasi_dt(basi_dt);
    	dm.setPay_clsf(pay_clsf);  
    	
    	dm.print();

        try {
        	AdTax1700DAO	dao = new AdTax1700DAO();
            ds = dao.ad_tax_1730_l(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        } 
//        
//        AdTax1700EJBHome home = (AdTax1700EJBHome) JNDIManager.getInstance().getHome("AdTax1700EJB");
//        try {
//        	AdTax1700EJB ejb = home.create();
//            ds = ejb.ad_tax_1710_l(dm);
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

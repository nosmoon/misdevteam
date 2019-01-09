/***************************************************************************************************
* 파일명 : AdTax1600WB.java
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
import chosun.ciis.ad.tax.dao.AdTax1600DAO;
import chosun.ciis.ad.tax.dm.AD_TAX_1600_MDM;
import chosun.ciis.ad.tax.dm.AD_TAX_1610_LDM;
import chosun.ciis.ad.tax.dm.AD_TAX_1620_ADM;
import chosun.ciis.ad.tax.ds.AD_TAX_1600_MDataSet;
import chosun.ciis.ad.tax.ds.AD_TAX_1610_LDataSet;
import chosun.ciis.ad.tax.ds.AD_TAX_1620_ADataSet;
import chosun.ciis.co.base.wb.BaseWB;
/**
 * 
 */

public class AdTax1600WB extends BaseWB {

    /**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void ad_tax_1600_m(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	AD_TAX_1600_MDataSet ds = null;

        // DM Setting
    	String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);
    	String dealmedicd    = Util.getSessionParameterValue(req, "dealmedicd", true);
    	
    	AD_TAX_1600_MDM dm = new AD_TAX_1600_MDM();
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setDealmedicd(dealmedicd);
    	
    	dm.print();
    	
        try {
        	AdTax1600DAO	dao = new AdTax1600DAO();
            ds = dao.ad_tax_1600_m(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        } 
//        
//        AdTax1600EJBHome home = (AdTax1600EJBHome) JNDIManager.getInstance().getHome("AdTax1600EJB");
//        try {
//        	AdTax1600EJB ejb = home.create();
//            ds = ejb.ad_tax_1600_m(dm);
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
    public void ad_tax_1610_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	AD_TAX_1610_LDataSet ds = null;

        // DM Setting
    	String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);
    	String medi_cd = Util.checkString(req.getParameter("medi_cd"));
    	String frdt = Util.checkString(req.getParameter("frdt"));
    	String todt = Util.checkString(req.getParameter("todt"));
    	
    	AD_TAX_1610_LDM dm = new AD_TAX_1610_LDM();
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setMedi_cd(medi_cd);
    	dm.setFrdt(frdt);
    	dm.setTodt(todt);

    	dm.print();
        try {
        	AdTax1600DAO	dao = new AdTax1600DAO();
            ds = dao.ad_tax_1610_l(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        } 
//        
//        AdTax1600EJBHome home = (AdTax1600EJBHome) JNDIManager.getInstance().getHome("AdTax1600EJB");
//        try {
//        	AdTax1600EJB ejb = home.create();
//            ds = ejb.ad_tax_1610_l(dm);
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
    public void ad_tax_1620_a(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	AD_TAX_1620_ADataSet ds = null;

        // DM Setting
    	String cmpy_cd       = Util.getSessionParameterValue(req, "cmpycd", true);
    	String incmg_pers    = Util.getSessionParameterValue(req, "emp_no", true);
    	String incmg_pers_ip = req.getRemoteAddr();

    	String flag  		   = Util.checkString(req.getParameter("flag"));
    	String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
    	
    	Hashtable hash = getHashMultiUpdateData(multiUpdateData);

    	String pubc_slip_no   = Util.checkString((String)hash.get("pubc_slip_no"));
    	String notaxrate_clsf = Util.checkString((String)hash.get("notaxrate_clsf"));
    	String notaxrate_dt   = Util.checkString((String)hash.get("notaxrate_dt"));
    	
    	AD_TAX_1620_ADM dm = new AD_TAX_1620_ADM();
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setFlag(flag);
    	dm.setPubc_slip_no(pubc_slip_no);
    	dm.setNotaxrate_clsf(notaxrate_clsf);
    	dm.setNotaxrate_dt(notaxrate_dt);
    	dm.setIncmg_pers_ip(incmg_pers_ip);
    	dm.setIncmg_pers(incmg_pers);
    	
    	dm.print();

        try {
        	AdTax1600DAO	dao = new AdTax1600DAO();
            ds = dao.ad_tax_1620_a(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        } 
//        
//        AdTax1600EJBHome home = (AdTax1600EJBHome) JNDIManager.getInstance().getHome("AdTax1600EJB");
//        try {
//        	AdTax1600EJB ejb = home.create();
//            ds = ejb.ad_tax_1620_a(dm);
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

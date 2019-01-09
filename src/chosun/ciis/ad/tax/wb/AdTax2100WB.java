/***************************************************************************************************
* 파일명 : AdTax2100WB.java
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

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.util.Util;
import chosun.ciis.ad.tax.dao.AdTax2100DAO;
import chosun.ciis.ad.tax.dm.AD_TAX_2100_MDM;
import chosun.ciis.ad.tax.dm.AD_TAX_2110_LDM;
import chosun.ciis.ad.tax.dm.AD_TAX_2120_ADM;
import chosun.ciis.ad.tax.ds.AD_TAX_2100_MDataSet;
import chosun.ciis.ad.tax.ds.AD_TAX_2110_LDataSet;
import chosun.ciis.ad.tax.ds.AD_TAX_2120_ADataSet;
import chosun.ciis.co.base.wb.BaseWB;
/**
 * 
 */

public class AdTax2100WB extends BaseWB {

    /**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void ad_tax_2100_m(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	AD_TAX_2100_MDataSet ds = null;

        // DM Setting
    	AD_TAX_2100_MDM dm = new AD_TAX_2100_MDM();
    	String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);
    	String dealmedicd    = Util.getSessionParameterValue(req, "dealmedicd", true);
    	
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setDealmedicd(dealmedicd);
    	
    	dm.print();

        try {
        	AdTax2100DAO	dao = new AdTax2100DAO();
            ds = dao.ad_tax_2100_m(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        }
//        
//        AdTax2100EJBHome home = (AdTax2100EJBHome) JNDIManager.getInstance().getHome("AdTax2100EJB");
//        try {
//        	AdTax2100EJB ejb = home.create();
//            ds = ejb.ad_tax_2100_m(dm);
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
    public void ad_tax_2110_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	AD_TAX_2110_LDataSet ds = null;

        // DM Setting
    	AD_TAX_2110_LDM dm = new AD_TAX_2110_LDM();
    	String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);
    	String dlco_no = Util.checkString(req.getParameter("dlco_no"));
    	String hndl_clsf = Util.checkString(req.getParameter("hndl_clsf"));
    	String medi_cd = Util.checkString(req.getParameter("medi_cd"));
    	String frdt = Util.checkString(req.getParameter("frdt"));
    	String todt = Util.checkString(req.getParameter("todt"));
    	String pay_clsf = Util.checkString(req.getParameter("pay_clsf"));
    	String basi_dt = Util.checkString(req.getParameter("basi_dt"));
    	
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setDlco_no(dlco_no);
    	dm.setHndl_clsf(hndl_clsf);
    	dm.setMedi_cd(medi_cd);
    	dm.setFrdt(frdt);
    	dm.setTodt(todt);
    	dm.setPay_clsf(pay_clsf);
    	dm.setBasi_dt(basi_dt);
        
    	dm.print();

        try {
        	AdTax2100DAO	dao = new AdTax2100DAO();
            ds = dao.ad_tax_2110_l(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        }
//        
//        AdTax2100EJBHome home = (AdTax2100EJBHome) JNDIManager.getInstance().getHome("AdTax2100EJB");
//        try {
//        	AdTax2100EJB ejb = home.create();
//            ds = ejb.ad_tax_2110_l(dm);
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
    public void ad_tax_2120_a(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	AD_TAX_2120_ADataSet ds = null;

        // DM Setting
    	String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);
    	String dlco_no = Util.checkString(req.getParameter("dlco_no"));
    	String fee_pay_stat = Util.checkString(req.getParameter("fee_pay_stat"));
    	
    	AD_TAX_2120_ADM dm = new AD_TAX_2120_ADM();
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setDlco_no(dlco_no);
    	dm.setFee_pay_stat(fee_pay_stat);
    	
    	//dm.print();

        try {
        	AdTax2100DAO	dao = new AdTax2100DAO();
            ds = dao.ad_tax_2120_a(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        }
//        
//        AdTax2100EJBHome home = (AdTax2100EJBHome) JNDIManager.getInstance().getHome("AdTax2100EJB");
//        try {
//        	AdTax2100EJB ejb = home.create();
//            ds = ejb.ad_tax_2120_a(dm);
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

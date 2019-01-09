/***************************************************************************************************
* 파일명 : AdTax1900WB.java
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
import chosun.ciis.ad.tax.dao.AdTax1900DAO;
import chosun.ciis.ad.tax.dm.AD_TAX_1900_MDM;
import chosun.ciis.ad.tax.dm.AD_TAX_1910_LDM;
import chosun.ciis.ad.tax.dm.AD_TAX_1920_LDM;
import chosun.ciis.ad.tax.ds.AD_TAX_1900_MDataSet;
import chosun.ciis.ad.tax.ds.AD_TAX_1910_LDataSet;
import chosun.ciis.ad.tax.ds.AD_TAX_1920_LDataSet;
import chosun.ciis.co.base.wb.BaseWB;
/**
 * 
 */

public class AdTax1900WB extends BaseWB {


    /**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void ad_tax_1900_m(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	AD_TAX_1900_MDataSet ds = null;

        // DM Setting
    	String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);;

    	AD_TAX_1900_MDM dm = new AD_TAX_1900_MDM();
    	dm.setCmpy_cd(cmpy_cd);

        try {
        	AdTax1900DAO	dao = new AdTax1900DAO();
            ds = dao.ad_tax_1900_m(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        }
//        
//        AdTax1900EJBHome home = (AdTax1900EJBHome) JNDIManager.getInstance().getHome("AdTax1900EJB");
//        try {
//        	AdTax1900EJB ejb = home.create();
//            ds = ejb.ad_tax_1900_m(dm);
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
    public void ad_tax_1910_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	AD_TAX_1910_LDataSet ds = null;

        // DM Setting
    	String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);;
    	String prof_type_cd = Util.checkString(req.getParameter("prof_type_cd"));
    	String slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
    	String occr_frdt = Util.checkString(req.getParameter("occr_frdt"));
    	String occr_todt = Util.checkString(req.getParameter("occr_todt"));
    	String slip_seq = Util.checkString(req.getParameter("slip_seq"));
    	String dlco_no = Util.checkString(req.getParameter("dlco_no"));
    	
    	AD_TAX_1910_LDM dm = new AD_TAX_1910_LDM();
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setProf_type_cd(prof_type_cd);
    	dm.setSlip_clsf_cd(slip_clsf_cd);
    	dm.setOccr_frdt(occr_frdt);
    	dm.setOccr_todt(occr_todt);
    	dm.setSlip_seq(slip_seq);
    	dm.setDlco_no(dlco_no);
    	
    	//dm.print();

        try {
        	AdTax1900DAO	dao = new AdTax1900DAO();
            ds = dao.ad_tax_1910_l(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        }
//        
//        AdTax1900EJBHome home = (AdTax1900EJBHome) JNDIManager.getInstance().getHome("AdTax1900EJB");
//        try {
//        	AdTax1900EJB ejb = home.create();
//            ds = ejb.ad_tax_1910_l(dm);
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
    public void ad_tax_1920_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	AD_TAX_1920_LDataSet ds = null;

        // DM Setting
    	String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);;
    	String slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
    	String slip_occr_dt = Util.checkString(req.getParameter("slip_occr_dt"));
    	String slip_seq = Util.checkString(req.getParameter("slip_seq"));
    	
    	AD_TAX_1920_LDM dm = new AD_TAX_1920_LDM();
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setSlip_clsf_cd(slip_clsf_cd);
    	dm.setSlip_occr_dt(slip_occr_dt);
    	dm.setSlip_seq(slip_seq);
    	
    	//dm.print();

        try {
        	AdTax1900DAO	dao = new AdTax1900DAO();
            ds = dao.ad_tax_1920_l(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        }
//        
//        AdTax1900EJBHome home = (AdTax1900EJBHome) JNDIManager.getInstance().getHome("AdTax1900EJB");
//        try {
//        	AdTax1900EJB ejb = home.create();
//            ds = ejb.ad_tax_1920_l(dm);
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

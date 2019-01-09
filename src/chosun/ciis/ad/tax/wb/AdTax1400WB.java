/***************************************************************************************************
* 파일명 : AdTax1400WB.java
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
import chosun.ciis.ad.tax.dao.AdTax1400DAO;
import chosun.ciis.ad.tax.dm.AD_TAX_1410_LDM;
import chosun.ciis.ad.tax.dm.AD_TAX_1400_MDM;
import chosun.ciis.ad.tax.dm.AD_TAX_1420_LDM;
import chosun.ciis.ad.tax.dm.AD_TAX_1430_LDM;
import chosun.ciis.ad.tax.dm.AD_TAX_1440_ADM;
import chosun.ciis.ad.tax.ds.AD_TAX_1400_MDataSet;
import chosun.ciis.ad.tax.ds.AD_TAX_1410_LDataSet;
import chosun.ciis.ad.tax.ds.AD_TAX_1420_LDataSet;
import chosun.ciis.ad.tax.ds.AD_TAX_1430_LDataSet;
import chosun.ciis.ad.tax.ds.AD_TAX_1440_ADataSet;
import chosun.ciis.co.base.wb.BaseWB;
/**
 * 
 */

public class AdTax1400WB extends BaseWB {

	
	public void ad_tax_1400_m(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	AD_TAX_1400_MDataSet ds = null;

        // DM Setting
    	String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);
    	
    	AD_TAX_1400_MDM dm = new AD_TAX_1400_MDM();
    	dm.setCmpy_cd(cmpy_cd);
        
    	dm.print();

        try {
        	AdTax1400DAO	dao = new AdTax1400DAO();
            ds = dao.ad_tax_1400_m(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        } 
//        
//        AdTax1400EJBHome home = (AdTax1400EJBHome) JNDIManager.getInstance().getHome("AdTax1400EJB");
//        try {
//        	AdTax1400EJB ejb = home.create();
//            ds = ejb.ad_tax_1410_l(dm);
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
    public void ad_tax_1410_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	AD_TAX_1410_LDataSet ds = null;

        // DM Setting
    	String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);
    	String work_clsf = Util.checkString(req.getParameter("work_clsf"));
    	String clos_year = Util.checkString(req.getParameter("clos_year"));
    	
    	AD_TAX_1410_LDM dm = new AD_TAX_1410_LDM();
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setWork_clsf(work_clsf);
    	dm.setClos_year(clos_year);
        
    	dm.print();

        try {
        	AdTax1400DAO	dao = new AdTax1400DAO();
            ds = dao.ad_tax_1410_l(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        } 
//        
//        AdTax1400EJBHome home = (AdTax1400EJBHome) JNDIManager.getInstance().getHome("AdTax1400EJB");
//        try {
//        	AdTax1400EJB ejb = home.create();
//            ds = ejb.ad_tax_1410_l(dm);
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
    public void ad_tax_1420_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	AD_TAX_1420_LDataSet ds = null;

        // DM Setting
    	String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);
    	String work_clsf = Util.checkString(req.getParameter("work_clsf"));
    	String clos_yymm = Util.checkString(req.getParameter("clos_yymm"));
    	
    	AD_TAX_1420_LDM dm = new AD_TAX_1420_LDM();
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setWork_clsf(work_clsf);
    	dm.setClos_yymm(clos_yymm);
        
    	dm.print();

        try {
        	AdTax1400DAO	dao = new AdTax1400DAO();
            ds = dao.ad_tax_1420_l(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        } 
//        
//        AdTax1400EJBHome home = (AdTax1400EJBHome) JNDIManager.getInstance().getHome("AdTax1400EJB");
//        try {
//        	AdTax1400EJB ejb = home.create();
//            ds = ejb.ad_tax_1420_l(dm);
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
    public void ad_tax_1430_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	AD_TAX_1430_LDataSet ds = null;

        // DM Setting
    	String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);
    	String quarter = Util.checkString(req.getParameter("quarter"));
    	String proc_clsf = Util.checkString(req.getParameter("proc_clsf"));
    	String clos_year = Util.checkString(req.getParameter("clos_year"));
    	
    	AD_TAX_1430_LDM dm = new AD_TAX_1430_LDM();
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setQuarter(quarter);
    	dm.setProc_clsf(proc_clsf);
    	dm.setClos_year(clos_year);
        
    	dm.print();

        try {
        	AdTax1400DAO	dao = new AdTax1400DAO();
            ds = dao.ad_tax_1430_l(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        } 
//        
//        AdTax1400EJBHome home = (AdTax1400EJBHome) JNDIManager.getInstance().getHome("AdTax1400EJB");
//        try {
//        	AdTax1400EJB ejb = home.create();
//            ds = ejb.ad_tax_1430_l(dm);
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
    public void ad_tax_1440_a(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	AD_TAX_1440_ADataSet ds = null;

        // DM Setting
    	String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);
    	String incmg_pers_ip = req.getRemoteAddr();
    	String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
    	String flag = Util.checkString(req.getParameter("flag"));
    	String work_clsf = Util.checkString(req.getParameter("work_clsf"));
    	String clos_dt = Util.checkString(req.getParameter("clos_dt"));
    	String mang_frdt = Util.checkString(req.getParameter("mang_frdt"));
    	String mang_todt = Util.checkString(req.getParameter("mang_todt"));
    	
    	AD_TAX_1440_ADM dm = new AD_TAX_1440_ADM();
    	dm.setFlag(flag);
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setWork_clsf(work_clsf);
    	dm.setClos_dt(clos_dt);
    	dm.setMang_frdt(mang_frdt);
    	dm.setMang_todt(mang_todt);
    	dm.setIncmg_pers_ip(incmg_pers_ip);
    	dm.setIncmg_pers(incmg_pers);
        
    	dm.print();

        try {
        	AdTax1400DAO	dao = new AdTax1400DAO();
            ds = dao.ad_tax_1440_a(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        } 
//        
//        AdTax1400EJBHome home = (AdTax1400EJBHome) JNDIManager.getInstance().getHome("AdTax1400EJB");
//        try {
//        	AdTax1400EJB ejb = home.create();
//            ds = ejb.ad_tax_1440_a(dm);
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

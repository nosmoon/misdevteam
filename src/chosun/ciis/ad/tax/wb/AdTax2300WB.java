/***************************************************************************************************
* 파일명 : AdTax2300WB.java
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
import chosun.ciis.ad.tax.dao.AdTax2300DAO;
import chosun.ciis.ad.tax.dm.AD_TAX_2300_MDM;
import chosun.ciis.ad.tax.dm.AD_TAX_2310_LDM;
import chosun.ciis.ad.tax.dm.AD_TAX_2320_LDM;
import chosun.ciis.ad.tax.dm.AD_TAX_2330_LDM;
import chosun.ciis.ad.tax.ds.AD_TAX_2300_MDataSet;
import chosun.ciis.ad.tax.ds.AD_TAX_2310_LDataSet;
import chosun.ciis.ad.tax.ds.AD_TAX_2320_LDataSet;
import chosun.ciis.ad.tax.ds.AD_TAX_2330_LDataSet;
import chosun.ciis.co.base.wb.BaseWB;
/**
 * 
 */

public class AdTax2300WB extends BaseWB
{

    /**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void ad_tax_2300_m(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	AD_TAX_2300_MDataSet ds = null;

        // DM Setting
    	AD_TAX_2300_MDM dm = new AD_TAX_2300_MDM();
    	String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);
    	String dealmedicd    = Util.getSessionParameterValue(req, "dealmedicd", true);
    	
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setDealmedicd(dealmedicd);

        try {
        	AdTax2300DAO	dao = new AdTax2300DAO();
            ds = dao.ad_tax_2300_m(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        }
//        
//        AdTax2300EJBHome home = (AdTax2300EJBHome) JNDIManager.getInstance().getHome("AdTax2300EJB");
//        try {
//        	AdTax2300EJB ejb = home.create();
//            ds = ejb.ad_tax_2300_m(dm);
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
    public void ad_tax_2310_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	AD_TAX_2310_LDataSet ds = null;

        // DM Setting
    	String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);
    	String medi_cd = Util.checkString(req.getParameter("medi_cd"));
    	String hndl_clsf = Util.checkString(req.getParameter("hndl_clsf"));
    	String dlco_no = Util.checkString(req.getParameter("dlco_no"));
    	String frdt = Util.checkString(req.getParameter("frdt"));
    	String todt = Util.checkString(req.getParameter("todt"));
    	String basi_dt = Util.checkString(req.getParameter("basi_dt"));
    	String emp_no = Util.getSessionParameterValue(req, "emp_no", true);

    	AD_TAX_2310_LDM dm = new AD_TAX_2310_LDM();
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setMedi_cd(medi_cd);
    	dm.setHndl_clsf(hndl_clsf);
    	dm.setDlco_no(dlco_no);
    	dm.setFrdt(frdt);
    	dm.setTodt(todt);
    	dm.setBasi_dt(basi_dt);
    	dm.setEmp_no(emp_no);
    	
    	//dm.print();

        try {
        	AdTax2300DAO	dao = new AdTax2300DAO(); 
            ds = dao.ad_tax_2310_l(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        }
//        
//        AdTax2300EJBHome home = (AdTax2300EJBHome) JNDIManager.getInstance().getHome("AdTax2300EJB");
//        try {
//        	AdTax2300EJB ejb = home.create();
//            ds = ejb.ad_tax_2310_l(dm);
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
    public void ad_tax_2320_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	AD_TAX_2320_LDataSet ds = null;

        // DM Setting
    	String cmpy_cd    	= Util.getSessionParameterValue(req, "cmpycd", true);
    	String medi_cd 		= Util.checkString(req.getParameter("medi_cd"));
    	String hndl_clsf 	= Util.checkString(req.getParameter("hndl_clsf"));
    	String dlco_no 		= Util.checkString(req.getParameter("dlco_no"));
    	String frdt			= Util.checkString(req.getParameter("frdt"));
    	String todt 		= Util.checkString(req.getParameter("todt"));
    	String basi_dt 		= Util.checkString(req.getParameter("basi_dt"));
    	String emp_no 		= Util.getSessionParameterValue(req, "emp_no", true);

    	AD_TAX_2320_LDM dm = new AD_TAX_2320_LDM();
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setMedi_cd(medi_cd);
    	dm.setHndl_clsf(hndl_clsf);
    	dm.setDlco_no(dlco_no);
    	dm.setFrdt(frdt);
    	dm.setTodt(todt);
    	dm.setBasi_dt(basi_dt);
    	dm.setEmp_no(emp_no);
    	
    	//dm.print();

        try {
        	AdTax2300DAO	dao = new AdTax2300DAO();
            ds = dao.ad_tax_2320_l(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        }
//        
//        AdTax2300EJBHome home = (AdTax2300EJBHome) JNDIManager.getInstance().getHome("AdTax2300EJB");
//        try {
//        	AdTax2300EJB ejb = home.create();
//            ds = ejb.ad_tax_2320_l(dm);
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
    
public void ad_tax_2330_l(HttpServletRequest req, HttpServletResponse res) throws   AppException
{   	
    	AD_TAX_2330_LDataSet ds = null;

        // DM Setting
    	String cmpy_cd    	= Util.getSessionParameterValue(req, "cmpycd", true);
    	String medi_cd 		= Util.checkString(req.getParameter("medi_cd"));
    	String hndl_clsf 	= Util.checkString(req.getParameter("hndl_clsf"));
    	String dlco_no 		= Util.checkString(req.getParameter("dlco_no"));
    	String frdt 		= Util.checkString(req.getParameter("frdt"));
    	String todt 		= Util.checkString(req.getParameter("todt"));
    	String basi_dt 		= Util.checkString(req.getParameter("basi_dt"));
    	String emp_no 		= Util.getSessionParameterValue(req, "emp_no", true);

    	AD_TAX_2330_LDM dm = new AD_TAX_2330_LDM();
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setMedi_cd(medi_cd);
    	dm.setHndl_clsf(hndl_clsf);
    	dm.setDlco_no(dlco_no);
    	dm.setFrdt(frdt);
    	dm.setTodt(todt);
    	dm.setBasi_dt(basi_dt);
    	dm.setEmp_no(emp_no);
    	
    	//dm.print();
        try
        {
        	AdTax2300DAO	dao = new AdTax2300DAO();
            ds = dao.ad_tax_2330_l(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e)
        {
            throw e;
        }
    } 
}

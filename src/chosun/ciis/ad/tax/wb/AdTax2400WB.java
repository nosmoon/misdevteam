/***************************************************************************************************
* 파일명 : AdTax2400WB.java
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
import chosun.ciis.ad.tax.dao.AdTax2400DAO;
import chosun.ciis.ad.tax.dm.AD_TAX_2400_MDM;
import chosun.ciis.ad.tax.dm.AD_TAX_2410_LDM;
import chosun.ciis.ad.tax.ds.AD_TAX_2400_MDataSet;
import chosun.ciis.ad.tax.ds.AD_TAX_2410_LDataSet;
import chosun.ciis.co.base.wb.BaseWB;
/**
 * 
 */

public class AdTax2400WB extends BaseWB {

    /**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void ad_tax_2400_m(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	AD_TAX_2400_MDataSet ds = null;

        // DM Setting
    	AD_TAX_2400_MDM dm = new AD_TAX_2400_MDM();
    	String cmpy_cd    	= Util.getSessionParameterValue(req, "cmpycd", true);
    	String dealmedicd   = Util.getSessionParameterValue(req, "dealmedicd", true);
    	String emp_no		= Util.getSessionParameterValue(req, "emp_no", true);
    	
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setDealmedicd(dealmedicd);
    	dm.setEmpno(emp_no);

        try
        {
        	AdTax2400DAO	dao = new AdTax2400DAO();
            ds = dao.ad_tax_2400_m(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e)
        {
            throw e;
        }
//        
//        AdTax2400EJBHome home = (AdTax2400EJBHome) JNDIManager.getInstance().getHome("AdTax2400EJB");
//        try {
//        	AdTax2400EJB ejb = home.create();
//            ds = ejb.ad_tax_2400_m(dm);
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
    public void ad_tax_2410_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	AD_TAX_2410_LDataSet ds = null;

    	String cmpy_cd    	= Util.getSessionParameterValue(req, "cmpycd", true);
    	String medi_cd 		= Util.checkString(req.getParameter("medi_cd"));
    	String frdt 		= Util.checkString(req.getParameter("frdt"));
    	String todt 		= Util.checkString(req.getParameter("todt"));
    	String dlco_no 		= Util.checkString(req.getParameter("dlco_no"));
    	String agn 			= Util.checkString(req.getParameter("agn"));
    	String slcrg_pers 	= Util.checkString(req.getParameter("slcrg_pers"));
    	
    	String emp_no    	= Util.getSessionParameterValue(req, "emp_no", true);

    	// DM Setting
    	AD_TAX_2410_LDM dm = new AD_TAX_2410_LDM();
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setMedi_cd(medi_cd);
    	dm.setFrdt(frdt);
    	dm.setTodt(todt);  
    	dm.setDlco_no(dlco_no);
    	dm.setAgn(agn);
    	dm.setSlcrg_pers(slcrg_pers);
    	dm.setEmp_no(emp_no);
        
    	//dm.print();

        try {
        	AdTax2400DAO	dao = new AdTax2400DAO();
            ds = dao.ad_tax_2410_l(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        }
//        
//        AdTax2400EJBHome home = (AdTax2400EJBHome) JNDIManager.getInstance().getHome("AdTax2400EJB");
//        try {
//        	AdTax2400EJB ejb = home.create();
//            ds = ejb.ad_tax_2410_l(dm);
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

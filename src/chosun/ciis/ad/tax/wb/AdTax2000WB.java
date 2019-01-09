/***************************************************************************************************
* 파일명 : AdTax2000WB.java
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
import chosun.ciis.ad.tax.dao.AdTax2000DAO;
import chosun.ciis.ad.tax.dm.AD_TAX_2000_MDM;
import chosun.ciis.ad.tax.dm.AD_TAX_2010_LDM;
import chosun.ciis.ad.tax.ds.AD_TAX_2000_MDataSet;
import chosun.ciis.ad.tax.ds.AD_TAX_2010_LDataSet;
import chosun.ciis.co.base.wb.BaseWB;
/**
 * 
 */

public class AdTax2000WB extends BaseWB {

	/**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void ad_tax_2000_m(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	AD_TAX_2000_MDataSet ds = null;

        // DM Setting
    	String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);;
    	
    	AD_TAX_2000_MDM dm = new AD_TAX_2000_MDM();
    	dm.setCmpy_cd(cmpy_cd);
    	
    	//dm.print();

        try {
        	AdTax2000DAO	dao = new AdTax2000DAO();
            ds = dao.ad_tax_2000_m(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        }
//        
//        AdTax2000EJBHome home = (AdTax2000EJBHome) JNDIManager.getInstance().getHome("AdTax2000EJB");
//        try {
//        	AdTax2000EJB ejb = home.create();
//            ds = ejb.ad_tax_2010_l(dm);
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
    public void ad_tax_2010_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	AD_TAX_2010_LDataSet ds = null;

        // DM Setting
    	String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);;
    	String medi_cd = Util.checkString(req.getParameter("medi_cd"));
    	String hndl_clsf = Util.checkString(req.getParameter("hndl_clsf"));
    	String frdt = Util.checkString(req.getParameter("frdt"));
    	String todt = Util.checkString(req.getParameter("todt"));
    	
    	AD_TAX_2010_LDM dm = new AD_TAX_2010_LDM();
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setMedi_cd(medi_cd);
    	dm.setHndl_clsf(hndl_clsf);
    	dm.setFrdt(frdt);
    	dm.setTodt(todt);
    	
    	dm.print();

        try {
        	AdTax2000DAO	dao = new AdTax2000DAO();
            ds = dao.ad_tax_2010_l(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        }
//        
//        AdTax2000EJBHome home = (AdTax2000EJBHome) JNDIManager.getInstance().getHome("AdTax2000EJB");
//        try {
//        	AdTax2000EJB ejb = home.create();
//            ds = ejb.ad_tax_2010_l(dm);
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

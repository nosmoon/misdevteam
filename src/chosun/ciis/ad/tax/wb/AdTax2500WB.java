/***************************************************************************************************
* 파일명 : AdTax2500WB.java
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
import chosun.ciis.ad.tax.dao.AdTax2500DAO;
import chosun.ciis.ad.tax.dm.AD_TAX_2500_MDM;
import chosun.ciis.ad.tax.ds.AD_TAX_2500_MDataSet;
import chosun.ciis.co.base.wb.BaseWB;
/**
 * 
 */

public class AdTax2500WB extends BaseWB {

    /**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void ad_tax_2500_m(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	AD_TAX_2500_MDataSet ds = null;

        // DM Setting
    	AD_TAX_2500_MDM dm = new AD_TAX_2500_MDM();
    	String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);
    	String dealmedicd    = Util.getSessionParameterValue(req, "dealmedicd", true);
    	
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setDealmedicd(dealmedicd);

        try {
        	AdTax2500DAO	dao = new AdTax2500DAO();
            ds = dao.ad_tax_2500_m(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        }
//        
//        AdTax2500EJBHome home = (AdTax2500EJBHome) JNDIManager.getInstance().getHome("AdTax2500EJB");
//        try {
//        	AdTax2500EJB ejb = home.create();
//            ds = ejb.ad_tax_2500_m(dm);
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

/***************************************************************************************************
* 파일명 : AdEis1300WB.java
* 기능 : 
 * 작성일자 : 
 * 작성자 : 정호근 
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/

package chosun.ciis.ad.eis.wb;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.util.Util;
import chosun.ciis.ad.eis.dao.AdEis1300DAO;
import chosun.ciis.ad.eis.dm.AD_EIS_1310_LDM;
import chosun.ciis.ad.eis.dm.AD_EIS_1320_LDM;
import chosun.ciis.ad.eis.ds.AD_EIS_1310_LDataSet;
import chosun.ciis.ad.eis.ds.AD_EIS_1320_LDataSet;
import chosun.ciis.co.base.wb.BaseWB;
/**
 * 
 */

public class AdEis1300WB extends BaseWB {

    /**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void ad_eis_1310_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	AD_EIS_1310_LDataSet ds = null;

    	String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);
    	String frdt       = Util.checkString(req.getParameter("frdt"));
    	String todt       = Util.checkString(req.getParameter("todt"));
    	String unit       = Util.checkString(req.getParameter("unit"));
    	String ad_self    = Util.checkString(req.getParameter("ad_self"));
    	
    	// DM Setting
    	AD_EIS_1310_LDM dm = new AD_EIS_1310_LDM();

    	dm.setCmpy_cd(cmpy_cd);
    	dm.setFrdt(frdt);
    	dm.setTodt(todt);
    	dm.setUnit(unit);
    	dm.setAd_self(ad_self);
        
    	//dm.print();

        try {
        	AdEis1300DAO	dao = new AdEis1300DAO();
            ds = dao.ad_eis_1310_l(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        }  
//        
//        AdEis1300EJBHome home = (AdEis1300EJBHome) JNDIManager.getInstance().getHome("AdEis1300EJB");
//        try {
//        	AdEis1300EJB ejb = home.create();
//            ds = ejb.ad_eis_1310_l(dm);
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
    public void ad_eis_1320_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	AD_EIS_1320_LDataSet ds = null;

    	String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);
    	String frdt       = Util.checkString(req.getParameter("frdt"));
    	String todt       = Util.checkString(req.getParameter("todt"));
    	String unit       = Util.checkString(req.getParameter("unit"));
    	String ad_self    = Util.checkString(req.getParameter("ad_self"));
    	
    	// DM Setting
    	AD_EIS_1320_LDM dm = new AD_EIS_1320_LDM();

    	dm.setCmpy_cd(cmpy_cd);
    	dm.setFrdt(frdt);
    	dm.setTodt(todt);
    	dm.setUnit(unit);
    	dm.setAd_self(ad_self);

        try {
        	AdEis1300DAO	dao = new AdEis1300DAO();
            ds = dao.ad_eis_1320_l(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        }  
//        
//        AdEis1300EJBHome home = (AdEis1300EJBHome) JNDIManager.getInstance().getHome("AdEis1300EJB");
//        try {
//        	AdEis1300EJB ejb = home.create();
//            ds = ejb.ad_eis_1320_l(dm);
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

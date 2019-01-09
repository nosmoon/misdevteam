/***************************************************************************************************
* 파일명 : AdEis1000WB.java
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

package chosun.ciis.ad.eis.wb;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.util.Util;
import chosun.ciis.ad.eis.dao.AdEis1000DAO;
import chosun.ciis.ad.eis.dm.AD_EIS_1010_LDM;
import chosun.ciis.ad.eis.dm.AD_EIS_1020_LDM;
import chosun.ciis.ad.eis.ds.AD_EIS_1010_LDataSet;
import chosun.ciis.ad.eis.ds.AD_EIS_1020_LDataSet;
import chosun.ciis.co.base.wb.BaseWB;
/**
 * 
 */

public class AdEis1000WB extends BaseWB {

    /**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void ad_eis_1010_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	AD_EIS_1010_LDataSet ds = null;

    	String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);
    	String frdt = Util.checkString(req.getParameter("frdt"));
    	String todt = Util.checkString(req.getParameter("todt"));
    	
    	// DM Setting
    	AD_EIS_1010_LDM dm = new AD_EIS_1010_LDM();
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setFrdt(frdt);
    	dm.setTodt(todt);

        try {
        	AdEis1000DAO	dao = new AdEis1000DAO();
            ds = dao.ad_eis_1010_l(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        }  
//        
//        AdEis1000EJBHome home = (AdEis1000EJBHome) JNDIManager.getInstance().getHome("AdEis1000EJB");
//        try {
//        	AdEis1000EJB ejb = home.create();
//            ds = ejb.ad_eis_1010_l(dm);
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
    public void ad_eis_1020_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	AD_EIS_1020_LDataSet ds = null;

    	String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);
    	String frdt = Util.checkString(req.getParameter("frdt"));
    	String todt = Util.checkString(req.getParameter("todt"));
    	
    	// DM Setting
    	AD_EIS_1020_LDM dm = new AD_EIS_1020_LDM();
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setFrdt(frdt);
    	dm.setTodt(todt);

        try {
        	AdEis1000DAO	dao = new AdEis1000DAO();
            ds = dao.ad_eis_1020_l(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        }  
//        
//        AdEis1000EJBHome home = (AdEis1000EJBHome) JNDIManager.getInstance().getHome("AdEis1000EJB");
//        try {
//        	AdEis1000EJB ejb = home.create();
//            ds = ejb.ad_eis_1020_l(dm);
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

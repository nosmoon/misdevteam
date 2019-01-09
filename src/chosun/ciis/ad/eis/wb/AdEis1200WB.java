/***************************************************************************************************
* 파일명 : AdEis1200WB.java
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
import chosun.ciis.ad.eis.dao.AdEis1200DAO;
import chosun.ciis.ad.eis.dm.AD_EIS_1200_MDM;
import chosun.ciis.ad.eis.dm.AD_EIS_1210_LDM;
import chosun.ciis.ad.eis.ds.AD_EIS_1200_MDataSet;
import chosun.ciis.ad.eis.ds.AD_EIS_1210_LDataSet;
import chosun.ciis.co.base.wb.BaseWB;
/**
 * 
 */

public class AdEis1200WB extends BaseWB {

    /**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void ad_eis_1200_m(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	AD_EIS_1200_MDataSet ds = null;

    	String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);
    	String frdt = Util.checkString(req.getParameter("frdt"));
    	String todt = Util.checkString(req.getParameter("todt"));
    	
    	// DM Setting
    	AD_EIS_1200_MDM dm = new AD_EIS_1200_MDM();
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setFrdt(frdt);
    	dm.setTodt(todt);
    	
    	//dm.print();

        try {
        	AdEis1200DAO	dao = new AdEis1200DAO();
            ds = dao.ad_eis_1200_m(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        }  
//        
//        AdEis1200EJBHome home = (AdEis1200EJBHome) JNDIManager.getInstance().getHome("AdEis1200EJB");
//        try {
//        	AdEis1200EJB ejb = home.create();
//            ds = ejb.ad_eis_1200_m(dm);
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
    public void ad_eis_1210_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	AD_EIS_1210_LDataSet ds = null;

    	String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);
    	String frdt = Util.checkString(req.getParameter("frdt"));
    	String todt = Util.checkString(req.getParameter("todt"));
    	
    	// DM Setting
    	AD_EIS_1210_LDM dm = new AD_EIS_1210_LDM();
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setFrdt(frdt);
    	dm.setTodt(todt);

        try {
        	AdEis1200DAO	dao = new AdEis1200DAO();
            ds = dao.ad_eis_1210_l(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        }  
//        
//        AdEis1200EJBHome home = (AdEis1200EJBHome) JNDIManager.getInstance().getHome("AdEis1200EJB");
//        try {
//        	AdEis1200EJB ejb = home.create();
//            ds = ejb.ad_eis_1210_l(dm);
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

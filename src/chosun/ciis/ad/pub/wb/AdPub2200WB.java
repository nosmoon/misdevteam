/***************************************************************************************************
* 파일명 : AdPub2200WB.java
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

package chosun.ciis.ad.pub.wb;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.util.Util;
import chosun.ciis.ad.pub.dao.AdPub2200DAO;
import chosun.ciis.ad.pub.dm.AD_PUB_2210_LDM;
import chosun.ciis.ad.pub.dm.AD_PUB_2220_LDM;
import chosun.ciis.ad.pub.ds.AD_PUB_2210_LDataSet;
import chosun.ciis.ad.pub.ds.AD_PUB_2220_LDataSet;
import chosun.ciis.co.base.wb.BaseWB;
/**
 * 
 */

public class AdPub2200WB extends BaseWB {

    /**
     * 
     *
     * @param req HttpServletRequest
     * @param pub HttpServletResponse
     * @throws AppException
     */
    public void ad_pub_2210_l(HttpServletRequest req, HttpServletResponse pub) throws   AppException {
    	
    	AD_PUB_2210_LDataSet ds = null;

        // DM Setting
    	AD_PUB_2210_LDM dm = new AD_PUB_2210_LDM();
    	String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);
    	String dt = Util.checkString(req.getParameter("dt"));
        
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setDt(dt);
        
    	//dm.print();

        try {
        	AdPub2200DAO	dao = new AdPub2200DAO();
            ds = dao.ad_pub_2210_l(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        } 
//        
//        AdPub2200EJBHome home = (AdPub2200EJBHome) JNDIManager.getInstance().getHome("AdPub2200EJB");
//        try {
//        	AdPub2200EJB ejb = home.create();
//            ds = ejb.ad_pub_2210_l(dm);
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
     * @param pub HttpServletResponse
     * @throws AppException
     */
    public void ad_pub_2220_l(HttpServletRequest req, HttpServletResponse pub) throws   AppException {
    	
    	AD_PUB_2220_LDataSet ds = null;

        // DM Setting
    	AD_PUB_2220_LDM dm = new AD_PUB_2220_LDM();
    	String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);
    	String dt = Util.checkString(req.getParameter("dt"));
        
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setDt(dt);
        
    	//dm.print();
        try {
        	AdPub2200DAO	dao = new AdPub2200DAO();
            ds = dao.ad_pub_2220_l(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        } 
//        
//        AdPub2200EJBHome home = (AdPub2200EJBHome) JNDIManager.getInstance().getHome("AdPub2200EJB");
//        try {
//        	AdPub2200EJB ejb = home.create();
//            ds = ejb.ad_pub_2220_l(dm);
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

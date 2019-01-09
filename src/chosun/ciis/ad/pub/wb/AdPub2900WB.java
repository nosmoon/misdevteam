/***************************************************************************************************
* 파일명 : AdPub2900WB.java
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
import chosun.ciis.ad.pub.dao.AdPub2900DAO;
import chosun.ciis.ad.pub.dm.AD_PUB_2900_MDM;
import chosun.ciis.ad.pub.dm.AD_PUB_2910_LDM;
import chosun.ciis.ad.pub.ds.AD_PUB_2900_MDataSet;
import chosun.ciis.ad.pub.ds.AD_PUB_2910_LDataSet;
import chosun.ciis.co.base.wb.BaseWB;
/**
 * 
 */

public class AdPub2900WB extends BaseWB {
		
	 /**
     * 
     *
     * @param req HttpServletRequest
     * @param pub HttpServletResponse
     * @throws AppException
     */
    public void ad_pub_2900_m(HttpServletRequest req, HttpServletResponse pub) throws   AppException {
    	
    	AD_PUB_2900_MDataSet ds = null;

        // DM Setting
    	AD_PUB_2900_MDM dm = new AD_PUB_2900_MDM();
    	String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);
    	
    	dm.setCmpy_cd(cmpy_cd);
        
        //dm.print();
        try {
        	AdPub2900DAO	dao = new AdPub2900DAO();
            ds = dao.ad_pub_2900_m(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        } 
//        
//        AdPub2900EJBHome home = (AdPub2900EJBHome) JNDIManager.getInstance().getHome("AdPub2900EJB");
//     
//        try {
//        	AdPub2900EJB ejb = home.create();
//            ds = ejb.ad_pub_2900_m(dm);
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
    public void ad_pub_2910_l(HttpServletRequest req, HttpServletResponse pub) throws   AppException {
    	
    	AD_PUB_2910_LDataSet ds = null;

        // DM Setting
    	AD_PUB_2910_LDM dm = new AD_PUB_2910_LDM();
    	String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);
    	String medi_cd    = Util.checkString(req.getParameter("medi_cd"));
    	String pubc_dt    = Util.checkString(req.getParameter("pubc_dt"));
    	
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setMedi_cd(medi_cd);
    	dm.setPubc_dt(pubc_dt);
        
       //dm.print();
        try {
        	AdPub2900DAO	dao = new AdPub2900DAO();
            ds = dao.ad_pub_2910_l(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        } 
//        
//        AdPub2900EJBHome home = (AdPub2900EJBHome) JNDIManager.getInstance().getHome("AdPub2900EJB");
//     
//        try {
//        	AdPub2900EJB ejb = home.create();
//            ds = ejb.ad_pub_2910_l(dm);
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

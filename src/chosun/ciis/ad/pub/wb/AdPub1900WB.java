/***************************************************************************************************
* 파일명 : AdPub1900WB.java
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
import chosun.ciis.ad.pub.dao.AdPub1900DAO;
import chosun.ciis.ad.pub.dm.AD_PUB_1900_MDM;
import chosun.ciis.ad.pub.dm.AD_PUB_1910_LDM;
import chosun.ciis.ad.pub.ds.AD_PUB_1900_MDataSet;
import chosun.ciis.ad.pub.ds.AD_PUB_1910_LDataSet;
import chosun.ciis.co.base.wb.BaseWB;
/**
 * 
 */

public class AdPub1900WB extends BaseWB {

	 /**
     * 
     *
     * @param req HttpServletRequest
     * @param pub HttpServletResponse
     * @throws AppException
     */
    public void ad_pub_1900_m(HttpServletRequest req, HttpServletResponse pub) throws   AppException {
    	
    	AD_PUB_1900_MDataSet ds = null;

        // DM Setting
    	AD_PUB_1900_MDM dm = new AD_PUB_1900_MDM();
    	String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);
        
        dm.setCmpy_cd(cmpy_cd);

        try {
        	AdPub1900DAO	dao = new AdPub1900DAO();
            ds = dao.ad_pub_1900_m(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        } 
//        
//        AdPub1900EJBHome home = (AdPub1900EJBHome) JNDIManager.getInstance().getHome("AdPub1900EJB");
//        try {
//        	AdPub1900EJB ejb = home.create();
//            ds = ejb.ad_pub_1900_m(dm);
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
    public void ad_pub_1910_l(HttpServletRequest req, HttpServletResponse pub) throws   AppException {
    	
    	AD_PUB_1910_LDataSet ds = null;

        // DM Setting
    	AD_PUB_1910_LDM dm = new AD_PUB_1910_LDM();
    	String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);
    	String medi_cd = Util.checkString(req.getParameter("medi_cd"));
    	String guid_sec_kind_cd = Util.checkString(req.getParameter("guid_sec_kind_cd"));
    	String frdt = Util.checkString(req.getParameter("frdt"));
    	String todt = Util.checkString(req.getParameter("todt"));
    	String advt_cont = Util.checkString(req.getParameter("advt_cont"));
    	String hndl_clsf = Util.checkString(req.getParameter("hndl_clsf"));
    	String hndl_plac_cd = Util.checkString(req.getParameter("hndl_plac_cd"));
        
        dm.setCmpy_cd(cmpy_cd);
        dm.setMedi_cd(medi_cd);
        dm.setGuid_sec_kind_cd(guid_sec_kind_cd);
        dm.setFrdt(frdt);
        dm.setTodt(todt);
        dm.setAdvt_cont(advt_cont);
        dm.setHndl_clsf(hndl_clsf);
        dm.setHndl_plac_cd(hndl_plac_cd);

        try {
        	AdPub1900DAO	dao = new AdPub1900DAO();
            ds = dao.ad_pub_1910_l(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        } 
//        
//        AdPub1900EJBHome home = (AdPub1900EJBHome) JNDIManager.getInstance().getHome("AdPub1900EJB");
//        try {
//        	AdPub1900EJB ejb = home.create();
//            ds = ejb.ad_pub_1910_l(dm);
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

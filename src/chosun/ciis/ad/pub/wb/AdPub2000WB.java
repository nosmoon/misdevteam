/***************************************************************************************************
* 파일명 : AdPub2000WB.java
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
import chosun.ciis.ad.pub.dao.AdPub2000DAO;
import chosun.ciis.ad.pub.dm.AD_PUB_2000_MDM;
import chosun.ciis.ad.pub.dm.AD_PUB_2010_LDM;
import chosun.ciis.ad.pub.ds.AD_PUB_2000_MDataSet;
import chosun.ciis.ad.pub.ds.AD_PUB_2010_LDataSet;
import chosun.ciis.co.base.wb.BaseWB;
/**
 * 
 */

public class AdPub2000WB extends BaseWB {

	 /**
     * 
     *
     * @param req HttpServletRequest
     * @param pub HttpServletResponse
     * @throws AppException
     */
    public void ad_pub_2000_m(HttpServletRequest req, HttpServletResponse pub) throws   AppException {
    	
    	AD_PUB_2000_MDataSet ds = null;

        // DM Setting
    	AD_PUB_2000_MDM dm = new AD_PUB_2000_MDM();
    	String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);
    	String medi_clsf  = Util.getSessionParameterValue(req, "dealmedicd", true);
        
        dm.setCmpy_cd(cmpy_cd);
        dm.setMedi_clsf(medi_clsf);

        try {
        	AdPub2000DAO	dao = new AdPub2000DAO();
            ds = dao.ad_pub_2000_m(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        } 
//        
//        AdPub2000EJBHome home = (AdPub2000EJBHome) JNDIManager.getInstance().getHome("AdPub2000EJB");
//        try {
//        	AdPub2000EJB ejb = home.create();
//            ds = ejb.ad_pub_2000_m(dm);
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
    public void ad_pub_2010_l(HttpServletRequest req, HttpServletResponse pub) throws   AppException {
    	
    	AD_PUB_2010_LDataSet ds = null;

        // DM Setting
    	AD_PUB_2010_LDM dm = new AD_PUB_2010_LDM();
    	String cmpy_cd    	= Util.getSessionParameterValue(req, "cmpycd", true);
    	String medi_cd 		= Util.checkString(req.getParameter("medi_cd"));
    	String frdt 		= Util.checkString(req.getParameter("frdt"));
    	String todt 		= Util.checkString(req.getParameter("todt"));
    	String slcrg_pers 	= Util.checkString(req.getParameter("slcrg_pers"));
    	String indt_clsf 	= Util.checkString(req.getParameter("indt_clsf"));
    	String indt_clsf2 	= Util.checkString(req.getParameter("indt_clsf2"));
    	String dlco_clsf 	= Util.checkString(req.getParameter("dlco_clsf"));
    	String dlco_no 		= Util.checkString(req.getParameter("dlco_no"));
        
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setMedi_cd(medi_cd);
    	dm.setFrdt(frdt);
    	dm.setTodt(todt);
    	dm.setSlcrg_pers(slcrg_pers);
    	dm.setIndt_clsf(indt_clsf);
    	dm.setIndt_clsf2(indt_clsf2);
    	dm.setDlco_clsf(dlco_clsf);
    	dm.setDlco_no(dlco_no);
        
    	//dm.print();

        try {
        	AdPub2000DAO	dao = new AdPub2000DAO();
            ds = dao.ad_pub_2010_l(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        } 
//        
//        AdPub2000EJBHome home = (AdPub2000EJBHome) JNDIManager.getInstance().getHome("AdPub2000EJB");
//        try {
//        	AdPub2000EJB ejb = home.create();
//            ds = ejb.ad_pub_2010_l(dm);
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

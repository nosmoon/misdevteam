/***************************************************************************************************
* 파일명 : AdPub2100WB.java
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
import chosun.ciis.ad.pub.dao.AdPub2100DAO;
import chosun.ciis.ad.pub.dm.AD_PUB_2100_MDM;
import chosun.ciis.ad.pub.dm.AD_PUB_2110_LDM;
import chosun.ciis.ad.pub.ds.AD_PUB_2100_MDataSet;
import chosun.ciis.ad.pub.ds.AD_PUB_2110_LDataSet;
import chosun.ciis.co.base.wb.BaseWB;
/**
 * 
 */

public class AdPub2100WB extends BaseWB { 

	 /**
     * 
     *
     * @param req HttpServletRequest
     * @param pub HttpServletResponse
     * @throws AppException
     */
    public void ad_pub_2100_m(HttpServletRequest req, HttpServletResponse pub) throws   AppException {
    	
    	AD_PUB_2100_MDataSet ds = null;

        // DM Setting
    	AD_PUB_2100_MDM dm = new AD_PUB_2100_MDM();
    	String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);
    	String medi_clsf  = Util.getSessionParameterValue(req, "dealmedicd", true);
        
        dm.setCmpy_cd(cmpy_cd);
        dm.setMedi_clsf(medi_clsf);
        
        //dm.print();

        try {
        	AdPub2100DAO	dao = new AdPub2100DAO();
            ds = dao.ad_pub_2100_m(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        } 
//        
//        AdPub2100EJBHome home = (AdPub2100EJBHome) JNDIManager.getInstance().getHome("AdPub2100EJB");
//        try {
//        	AdPub2100EJB ejb = home.create();
//            ds = ejb.ad_pub_2100_m(dm);
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
    public void ad_pub_2110_l(HttpServletRequest req, HttpServletResponse pub) throws   AppException {
    	
    	AD_PUB_2110_LDataSet ds = null;

        // DM Setting
    	AD_PUB_2110_LDM dm = new AD_PUB_2110_LDM();
    	String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);
    	String medi_clsf  = Util.getSessionParameterValue(req, "dealmedicd", true);
    	String medi_cd    = Util.checkString(req.getParameter("medi_cd"));
    	String frdt       = Util.checkString(req.getParameter("frdt"));
    	String todt       = Util.checkString(req.getParameter("todt"));
    	String dlco_clsf  = Util.checkString(req.getParameter("dlco_clsf"));
    	String advt_clas  = Util.checkString(req.getParameter("advt_clas"));
    	String ilbo_total  = Util.checkString(req.getParameter("ilbo_total"));
    	String grp_exct  = Util.checkString(req.getParameter("grp_exct"));
    	String indt_clsf  = Util.checkString(req.getParameter("indt_clsf")); 
        
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setMedi_clsf(medi_clsf);
    	dm.setMedi_cd(medi_cd);
    	dm.setFrdt(frdt);
    	dm.setTodt(todt);
    	dm.setDlco_clsf(dlco_clsf);
    	dm.setAdvt_clas(advt_clas);
    	dm.setIlbo_total(ilbo_total);
    	dm.setGrp_exct(grp_exct);
    	dm.setIndt_clsf(indt_clsf);
        
    	dm.print();
        try {
        	AdPub2100DAO	dao = new AdPub2100DAO();
            ds = dao.ad_pub_2110_l(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        } 
//        
//        AdPub2100EJBHome home = (AdPub2100EJBHome) JNDIManager.getInstance().getHome("AdPub2100EJB");
//        try {
//        	AdPub2100EJB ejb = home.create();
//            ds = ejb.ad_pub_2110_l(dm);
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

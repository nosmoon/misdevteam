/***************************************************************************************************
* 파일명 : AdRes1800WB.java
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

package chosun.ciis.ad.res.wb;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.util.Util;
import chosun.ciis.ad.res.dao.AdRes1800DAO;
import chosun.ciis.ad.res.dm.AD_RES_1800_MDM;
import chosun.ciis.ad.res.dm.AD_RES_1810_LDM;
import chosun.ciis.ad.res.ds.AD_RES_1800_MDataSet;
import chosun.ciis.ad.res.ds.AD_RES_1810_LDataSet;
import chosun.ciis.co.base.wb.BaseWB;
/**
 * 
 */

public class AdRes1800WB extends BaseWB {

    /**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void ad_res_1800_m(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	AD_RES_1800_MDataSet ds = null;

        // DM Setting
    	AD_RES_1800_MDM dm = new AD_RES_1800_MDM();
    	String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);
    	String medi_clsf  = Util.getSessionParameterValue(req, "dealmedicd", true);
        
        dm.setCmpy_cd(cmpy_cd);
        dm.setMedi_clsf(medi_clsf);

        try {
        	AdRes1800DAO	dao = new AdRes1800DAO();
            ds = dao.ad_res_1800_m(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        } 
//        
//        AdRes1800EJBHome home = (AdRes1800EJBHome) JNDIManager.getInstance().getHome("AdRes1800EJB");
//        try {
//        	AdRes1800EJB ejb = home.create();
//            ds = ejb.ad_res_1800_m(dm);
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
    public void ad_res_1810_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	AD_RES_1810_LDataSet ds = null;

        // DM Setting
    	AD_RES_1810_LDM dm = new AD_RES_1810_LDM();
    	String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);
    	String frdt = Util.checkString(req.getParameter("frdt"));
    	String todt = Util.checkString(req.getParameter("todt"));
    	String slcrg_pers = Util.checkString(req.getParameter("slcrg_pers"));

        dm.setCmpy_cd(cmpy_cd);
        dm.setFrdt(frdt);
        dm.setTodt(todt);
        dm.setSlcrg_pers(slcrg_pers);

        try {
        	AdRes1800DAO	dao = new AdRes1800DAO();
            ds = dao.ad_res_1810_l(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        } 
//        
//        AdRes1800EJBHome home = (AdRes1800EJBHome) JNDIManager.getInstance().getHome("AdRes1800EJB");
//        try {
//        	AdRes1800EJB ejb = home.create();
//            ds = ejb.ad_res_1810_l(dm);
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

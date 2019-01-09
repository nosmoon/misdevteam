/***************************************************************************************************
* 파일명 : AdRes21500WB.java
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
import chosun.ciis.ad.res.dao.AdRes1500DAO;
import chosun.ciis.ad.res.dm.AD_RES_1500_MDM;
import chosun.ciis.ad.res.dm.AD_RES_1510_LDM;
import chosun.ciis.ad.res.ds.AD_RES_1500_MDataSet;
import chosun.ciis.ad.res.ds.AD_RES_1510_LDataSet;
import chosun.ciis.co.base.wb.BaseWB;
/**
 * 
 */

public class AdRes1500WB extends BaseWB {

    /**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void ad_res_1500_m(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	AD_RES_1500_MDataSet ds = null;

        // DM Setting
    	AD_RES_1500_MDM dm = new AD_RES_1500_MDM();
    	String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);
    	String medi_clsf  = Util.getSessionParameterValue(req, "dealmedicd", true); //매체구분  1:신문광고, 2:출판광고, 3:재경국

        dm.setCmpy_cd(cmpy_cd);
        dm.setMedi_clsf(medi_clsf);

        try {
        	AdRes1500DAO	dao = new AdRes1500DAO();
            ds = dao.ad_res_1500_m(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        } 
//        
//        AdRes1500EJBHome home = (AdRes1500EJBHome) JNDIManager.getInstance().getHome("AdRes1500EJB");
//        try {
//        	AdRes1500EJB ejb = home.create();
//            ds = ejb.ad_res_1500_m(dm);
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
    public void ad_res_1510_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	AD_RES_1510_LDataSet ds = null;

        // DM Setting
    	AD_RES_1510_LDM dm = new AD_RES_1510_LDM();
    	String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);
    	String medi_cd = Util.checkString(req.getParameter("medi_cd"));
    	String frdt = Util.checkString(req.getParameter("frdt"));
    	String todt = Util.checkString(req.getParameter("todt"));
    	String slcrg_pers = Util.checkString(req.getParameter("slcrg_pers"));
    	String dlco_no = Util.checkString(req.getParameter("dlco_no"));

        dm.setCmpy_cd(cmpy_cd);
        dm.setMedi_cd(medi_cd);
        dm.setFrdt(frdt);
        dm.setTodt(todt);
        dm.setSlcrg_pers(slcrg_pers);
        dm.setDlco_no(dlco_no);

        try {
        	AdRes1500DAO	dao = new AdRes1500DAO();
            ds = dao.ad_res_1510_l(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        } 
//        
//        AdRes1500EJBHome home = (AdRes1500EJBHome) JNDIManager.getInstance().getHome("AdRes1500EJB");
//        try {
//        	AdRes1500EJB ejb = home.create();
//            ds = ejb.ad_res_1510_l(dm);
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

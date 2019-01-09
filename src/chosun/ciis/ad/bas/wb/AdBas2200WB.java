/***************************************************************************************************
* 파일명 : .java
* 기능 : 
 * 작성일자 : 
 * 작성자 : 
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/

package chosun.ciis.ad.bas.wb;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.util.Util;
import chosun.ciis.ad.bas.dao.AdBas2200DAO;
import chosun.ciis.ad.bas.dm.AD_BAS_2210_LDM;
import chosun.ciis.ad.bas.dm.AD_BAS_2220_LDM;
import chosun.ciis.ad.bas.ds.AD_BAS_2210_LDataSet;
import chosun.ciis.ad.bas.ds.AD_BAS_2220_LDataSet;
import chosun.ciis.co.base.wb.BaseWB;
/**
 * 
 */

public class AdBas2200WB extends BaseWB {


    /**
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void ad_bas_2210_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	AD_BAS_2210_LDataSet ds = null;

        // DM Setting
    	String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);
    	String slcrg_pers = Util.checkString(req.getParameter("slcrg_pers"));
    	String frdt = Util.checkString(req.getParameter("frdt"));
    	String todt = Util.checkString(req.getParameter("todt"));
    	
    	AD_BAS_2210_LDM dm = new AD_BAS_2210_LDM();
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setSlcrg_pers(slcrg_pers);
    	dm.setFrdt(frdt);
    	dm.setTodt(todt);
    	
    	dm.print();
    	

        try {
        	AdBas2200DAO dao = new AdBas2200DAO();
            ds = dao.ad_bas_2210_l(dm);
            req.setAttribute("ds", ds);
        }  
        catch (AppException e) {
            throw e;
        }  
//        
//        AdBas2200EJBHome home = (AdBas2200EJBHome) JNDIManager.getInstance().getHome("AdBas2200EJB");
//        try {
//        	AdBas2200EJB ejb = home.create();
//            ds = ejb.ad_bas_2210_l(dm);
//            req.setAttribute("ds", ds);
//        }
//        catch (CreateException e) {
//        	e.printStackTrace();
//            SysException se = new SysException(e);
//            LogManager.getInstance().log(se);
//            throw se;
//        }
//        catch (RemoteException e) {
//        	e.printStackTrace();
//            SysException se = new SysException(e);
//            LogManager.getInstance().log(se);
//            throw se;
//        }
    }   

    /**
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void ad_bas_2220_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	AD_BAS_2220_LDataSet ds = null;

        // DM Setting
    	String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);
    	String slcrg_pers = Util.checkString(req.getParameter("slcrg_pers"));
    	String frdt = Util.checkString(req.getParameter("frdt"));
    	String todt = Util.checkString(req.getParameter("todt"));
    	
    	AD_BAS_2220_LDM dm = new AD_BAS_2220_LDM();
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setSlcrg_pers(slcrg_pers);
    	dm.setFrdt(frdt);
    	dm.setTodt(todt);

        try {
        	AdBas2200DAO dao = new AdBas2200DAO();
            ds = dao.ad_bas_2220_l(dm);
            req.setAttribute("ds", ds);
        }  
        catch (AppException e) {
            throw e;
        }  
//        
//        AdBas2200EJBHome home = (AdBas2200EJBHome) JNDIManager.getInstance().getHome("AdBas2200EJB");
//        try {
//        	AdBas2200EJB ejb = home.create();
//            ds = ejb.ad_bas_2220_l(dm);
//            req.setAttribute("ds", ds);
//        }
//        catch (CreateException e) {
//        	e.printStackTrace();
//            SysException se = new SysException(e);
//            LogManager.getInstance().log(se);
//            throw se;
//        }
//        catch (RemoteException e) {
//        	e.printStackTrace();
//            SysException se = new SysException(e);
//            LogManager.getInstance().log(se);
//            throw se;
//        }
    }   
}

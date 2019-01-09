/***************************************************************************************************
* 파일명 : AdDep2500WB.java
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

package chosun.ciis.ad.dep.wb;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.util.Util;
import chosun.ciis.ad.dep.dao.AdDep2500DAO;
import chosun.ciis.ad.dep.dm.AD_DEP_2500_MDM;
import chosun.ciis.ad.dep.dm.AD_DEP_2510_LDM;
import chosun.ciis.ad.dep.ds.AD_DEP_2500_MDataSet;
import chosun.ciis.ad.dep.ds.AD_DEP_2510_LDataSet;
import chosun.ciis.co.base.wb.BaseWB;
/**
 * 
 */

public class AdDep2500WB extends BaseWB {
	
	/**
     * 
     *
     * @param req HttpServletRequest
     * @param pub HttpServletResponse
     * @throws AppException
     */
    public void ad_dep_2500_m(HttpServletRequest req, HttpServletResponse pub) throws   AppException {
    	
    	AD_DEP_2500_MDataSet ds = null;

        // DM Setting
    	String cmpy_cd        = Util.getSessionParameterValue(req, "cmpycd", true);
    	String incmg_pers 	  = Util.getSessionParameterValue(req, "emp_no", true);
    	
    	AD_DEP_2500_MDM dm = new AD_DEP_2500_MDM();
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setIncmg_pers(incmg_pers);
       
        dm.print();

        try {
        	AdDep2500DAO	dao = new AdDep2500DAO();
            ds = dao.ad_dep_2500_m(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        }    
//        
//        AdDep2500EJBHome home = (AdDep2500EJBHome) JNDIManager.getInstance().getHome("AdDep2500EJB");
//        try {
//        	AdDep2500EJB ejb = home.create();
//            ds = ejb.ad_dep_2510_l(dm);
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
    public void ad_dep_2510_l(HttpServletRequest req, HttpServletResponse pub) throws   AppException {
    	
    	AD_DEP_2510_LDataSet ds = null;

        // DM Setting
    	String cmpy_cd        = Util.getSessionParameterValue(req, "cmpycd", true);
    	String proc_yymm = Util.checkString(req.getParameter("proc_yymm"));
    	String slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
    	String basi_dt = Util.checkString(req.getParameter("basi_dt"));
    	
    	AD_DEP_2510_LDM dm = new AD_DEP_2510_LDM();
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setProc_yymm(proc_yymm);
    	dm.setSlip_clsf_cd(slip_clsf_cd);
    	dm.setBasi_dt(basi_dt);
       
        dm.print();

        try {
        	AdDep2500DAO	dao = new AdDep2500DAO();
            ds = dao.ad_dep_2510_l(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        }    
//        
//        AdDep2500EJBHome home = (AdDep2500EJBHome) JNDIManager.getInstance().getHome("AdDep2500EJB");
//        try {
//        	AdDep2500EJB ejb = home.create();
//            ds = ejb.ad_dep_2510_l(dm);
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

/***************************************************************************************************
* 파일명 : AdDep2100WB.java
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

package chosun.ciis.ad.dep.wb;

import java.util.Hashtable;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.util.Util;
import chosun.ciis.ad.dep.dao.AdDep2200DAO;
import chosun.ciis.ad.dep.dm.AD_DEP_2200_MDM;
import chosun.ciis.ad.dep.dm.AD_DEP_2210_LDM;
import chosun.ciis.ad.dep.dm.AD_DEP_2220_ADM;
import chosun.ciis.ad.dep.ds.AD_DEP_2200_MDataSet;
import chosun.ciis.ad.dep.ds.AD_DEP_2210_LDataSet;
import chosun.ciis.ad.dep.ds.AD_DEP_2220_ADataSet;
import chosun.ciis.co.base.wb.BaseWB;
/**
 * 
 */

public class AdDep2200WB extends BaseWB {

    /**
     * 
     *
     * @param req HttpServletRequest
     * @param pub HttpServletResponse
     * @throws AppException
     */
    public void ad_dep_2200_m(HttpServletRequest req, HttpServletResponse pub) throws   AppException {
    	
    	AD_DEP_2200_MDataSet ds = null;

        // DM Setting
		String cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		
    	AD_DEP_2200_MDM dm = new AD_DEP_2200_MDM();
    	
    	dm.setCmpy_cd(cmpy_cd);

        try {
        	AdDep2200DAO	dao = new AdDep2200DAO();
            ds = dao.ad_dep_2200_m(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        }    
//        
//        AdDep2200EJBHome home = (AdDep2200EJBHome) JNDIManager.getInstance().getHome("AdDep2200EJB");
//        
//        try {
//        	AdDep2200EJB ejb = home.create();
//            ds = ejb.ad_dep_2200_m(dm);
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
    public void ad_dep_2210_l(HttpServletRequest req, HttpServletResponse pub) throws   AppException {
    	
    	AD_DEP_2210_LDataSet ds = null;

        // DM Setting
		String cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		String dlco_no = Util.checkString(req.getParameter("dlco_no"));
		String setl_clsf = Util.checkString(req.getParameter("setl_clsf"));
		
    	AD_DEP_2210_LDM dm = new AD_DEP_2210_LDM();
    	
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setDlco_no(dlco_no);
    	dm.setSetl_clsf(setl_clsf);
    	
    	//dm.print();

        try {
        	AdDep2200DAO	dao = new AdDep2200DAO();
            ds = dao.ad_dep_2210_l(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        }    
//        
//        AdDep2200EJBHome home = (AdDep2200EJBHome) JNDIManager.getInstance().getHome("AdDep2200EJB");
//        
//        try {
//        	AdDep2200EJB ejb = home.create();
//            ds = ejb.ad_dep_2210_l(dm);
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
    public void ad_dep_2220_a(HttpServletRequest req, HttpServletResponse pub) throws   AppException {
    	
    	AD_DEP_2220_ADataSet ds = null;

        // DM Setting
    	AD_DEP_2220_ADM dm = new AD_DEP_2220_ADM(); 
    	
    	String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);
		String incmg_pers_ip = req.getRemoteAddr();
    	String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		
    	String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
    	//System.out.println("multiUpdateData = " + multiUpdateData);
    	
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setIncmg_pers_ip(incmg_pers_ip);
    	dm.setIncmg_pers(incmg_pers);

		Hashtable hash = getHashMultiUpdateData(multiUpdateData);
		
		String mode 		= Util.checkString((String)hash.get("m"));
		String setl_clsf 	= Util.checkString((String)hash.get("setl_clsf"));
		String dlco_no 		= Util.checkString((String)hash.get("dlco_no"));
		String dlco_clsf 	= Util.checkString((String)hash.get("dlco_clsf"));
		String bank_clsf 	= Util.checkString((String)hash.get("bank_clsf"));
		String rcpm_acct_no = Util.checkString((String)hash.get("rcpm_acct_no"));
		String chrg_pers 	= Util.checkString((String)hash.get("chrg_pers"));
		String strt_dt 		= Util.checkString((String)hash.get("strt_dt"));

    	dm.setMode(mode);
    	dm.setSetl_clsf(setl_clsf);
    	dm.setDlco_no(dlco_no);
    	dm.setDlco_clsf(dlco_clsf);
    	dm.setBank_clsf(bank_clsf);
    	dm.setRcpm_acct_no(rcpm_acct_no);
    	dm.setChrg_pers(chrg_pers);
    	dm.setStrt_dt(strt_dt);
    	dm.setIncmg_pers_ip(incmg_pers_ip);
    	
    	//dm.print();

        try {
        	AdDep2200DAO	dao = new AdDep2200DAO();
            ds = dao.ad_dep_2220_a(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        }    
//        
//        AdDep2200EJBHome home = (AdDep2200EJBHome) JNDIManager.getInstance().getHome("AdDep2200EJB");
//        
//        try {
//        	AdDep2200EJB ejb = home.create();
//            ds = ejb.ad_dep_2220_a(dm);
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

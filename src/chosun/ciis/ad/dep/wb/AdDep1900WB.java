/***************************************************************************************************
* 파일명 : AdDep1900WB.java
* 기능 : 
 * 작성일자 : 
 * 작성자 : 김태길
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
import chosun.ciis.ad.dep.dao.AdDep1900DAO;
import chosun.ciis.ad.dep.dm.AD_DEP_1900_MDM;
import chosun.ciis.ad.dep.dm.AD_DEP_1910_ADM;
import chosun.ciis.ad.dep.ds.AD_DEP_1900_MDataSet;
import chosun.ciis.ad.dep.ds.AD_DEP_1910_ADataSet;
import chosun.ciis.co.base.wb.BaseWB;
/**
 * 
 */

public class AdDep1900WB extends BaseWB {

    /**
     * 
     *
     * @param req HttpServletRequest
     * @param pub HttpServletResponse
     * @throws AppException
     */
    public void ad_dep_1900_m(HttpServletRequest req, HttpServletResponse pub) throws   AppException {
    	
    	AD_DEP_1900_MDataSet ds = null;

        // DM Setting
    	String cmpy_cd        = Util.getSessionParameterValue(req, "cmpycd", true);
    	String dealmedicd     = Util.getSessionParameterValue(req, "dealmedicd", true);

    	AD_DEP_1900_MDM dm = new AD_DEP_1900_MDM();
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setDealmedicd(dealmedicd);
       
        //dm.print();

        try {
        	AdDep1900DAO	dao = new AdDep1900DAO();
            ds = dao.ad_dep_1900_m(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        }    
//        
//        AdDep1900EJBHome home = (AdDep1900EJBHome) JNDIManager.getInstance().getHome("AdDep1900EJB");
//        try {
//        	AdDep1900EJB ejb = home.create();
//            ds = ejb.ad_dep_1900_m(dm);
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
    public void ad_dep_1910_a(HttpServletRequest req, HttpServletResponse pub) throws   AppException {
    	
    	AD_DEP_1910_ADataSet ds = null;

        // DM Setting
    	String cmpy_cd        = Util.getSessionParameterValue(req, "cmpycd", true);
    	String dealmedicd     = Util.getSessionParameterValue(req, "dealmedicd", true);
    	String incmg_pers_ip  = req.getRemoteAddr();
    	String incmg_pers     = Util.getSessionParameterValue(req, "emp_no", true);
    	
    	String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
    	Hashtable hash         = getHashMultiUpdateData(multiUpdateData);
    	
    	String rcpm_shet_no1 = Util.checkString((String)hash.get("rcpm_shet_no1"));
    	String rcpm_shet_no2 = Util.checkString((String)hash.get("rcpm_shet_no2"));
    	String proc_clsf = Util.checkString((String)hash.get("proc_clsf"));
    	String rmks = Util.checkString((String)hash.get("rmks"));

    	AD_DEP_1910_ADM dm = new AD_DEP_1910_ADM();
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setDealmedicd(dealmedicd);
    	dm.setRcpm_shet_no1(rcpm_shet_no1);
    	dm.setRcpm_shet_no2(rcpm_shet_no2);
    	dm.setProc_clsf(proc_clsf);
    	dm.setRmks(rmks);
    	dm.setIncmg_pers_ip(incmg_pers_ip);
    	dm.setIncmg_pers(incmg_pers);
       
        //dm.print();
        try {
        	AdDep1900DAO	dao = new AdDep1900DAO();
            ds = dao.ad_dep_1910_a(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        }    
//        
//        AdDep1900EJBHome home = (AdDep1900EJBHome) JNDIManager.getInstance().getHome("AdDep1900EJB");
//        try {
//        	AdDep1900EJB ejb = home.create();
//            ds = ejb.ad_dep_1910_a(dm);
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

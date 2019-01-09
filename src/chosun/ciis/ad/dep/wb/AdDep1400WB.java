/***************************************************************************************************
* 파일명 : AdDep1400WB.java
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

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.util.Util;
import chosun.ciis.ad.dep.dao.AdDep1400DAO;
import chosun.ciis.ad.dep.dm.AD_DEP_1400_MDM;
import chosun.ciis.ad.dep.dm.AD_DEP_1410_ADM;
import chosun.ciis.ad.dep.dm.AD_DEP_1420_ADM;
import chosun.ciis.ad.dep.ds.AD_DEP_1400_MDataSet;
import chosun.ciis.ad.dep.ds.AD_DEP_1410_ADataSet;
import chosun.ciis.ad.dep.ds.AD_DEP_1420_ADataSet;
import chosun.ciis.co.base.wb.BaseWB;
/**
 * 
 */

public class AdDep1400WB extends BaseWB {
	
	/**
     * 
     *
     * @param req HttpServletRequest
     * @param pub HttpServletResponse
     * @throws AppException
     */
    public void ad_dep_1400_m(HttpServletRequest req, HttpServletResponse pub) throws   AppException {
    	
    	AD_DEP_1400_MDataSet ds = null;

        // DM Setting
    	String cmpy_cd		= Util.getSessionParameterValue(req, "cmpycd", true);
    	String incmg_pers 	 = Util.getSessionParameterValue(req, "emp_no", true);

    	AD_DEP_1400_MDM dm = new AD_DEP_1400_MDM();
    	dm.setCmpy_cd(cmpy_cd);
        dm.setIncmg_pers(incmg_pers);
    	
        dm.print();
        
        try {
        	AdDep1400DAO	dao = new AdDep1400DAO();
            ds = dao.ad_dep_1400_m(dm);
            req.setAttribute("ds", ds); 
        }
        catch (AppException e) {
            throw e;
        }  
    }   
    /**
     * 
     *
     * @param req HttpServletRequest
     * @param pub HttpServletResponse
     * @throws AppException
     */
    public void ad_dep_1410_a(HttpServletRequest req, HttpServletResponse pub) throws   AppException {
    	
    	AD_DEP_1410_ADataSet ds = null;

        // DM Setting
    	String cmpy_cd		= Util.getSessionParameterValue(req, "cmpycd", true);
    	String incmg_pers_ip = req.getRemoteAddr();
    	String incmg_pers 	 = Util.getSessionParameterValue(req, "emp_no", true);
    	String incmg_dept_cd = Util.getSessionParameterValue(req, "deptcd", true);
    	String slip_clsf 	= Util.checkString(req.getParameter("slip_clsf"));
    	String occr_dt	 	= Util.checkString(req.getParameter("occr_dt"));
    	String frdt 		= Util.checkString(req.getParameter("frdt"));
    	String todt 		= Util.checkString(req.getParameter("todt"));
    	String bddb_clsf 	= Util.checkString(req.getParameter("bddb_clsf"));

    	AD_DEP_1410_ADM dm = new AD_DEP_1410_ADM();
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setSlip_clsf(slip_clsf);
    	dm.setOccr_dt(occr_dt);
    	dm.setFrdt(frdt);
    	dm.setTodt(todt);
    	dm.setBddb_clsf(bddb_clsf);
    	dm.setIncmg_dept_cd(incmg_dept_cd);
    	dm.setIncmg_pers_ip(incmg_pers_ip);
    	dm.setIncmg_pers(incmg_pers);
       
        dm.print();
        
        try {
        	AdDep1400DAO	dao = new AdDep1400DAO();
            ds = dao.ad_dep_1410_a(dm);
            req.setAttribute("ds", ds); 
            req.setAttribute("resultMsg", ds.proc_cnt + " 건이 처리되었습니다.");
        }
        catch (AppException e) {
            throw e;
        }  
//        
//        AdDep1400EJBHome home = (AdDep1400EJBHome) JNDIManager.getInstance().getHome("AdDep1400EJB");
//        try {
//        	AdDep1400EJB ejb = home.create();
//            ds = ejb.ad_dep_1410_a(dm);
//            req.setAttribute("ds", ds);
//            req.setAttribute("resultMsg", ds.proc_cnt + " 건이 처리되었습니다.");
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
    public void ad_dep_1420_a(HttpServletRequest req, HttpServletResponse pub) throws   AppException {
    	
    	AD_DEP_1420_ADataSet ds = null;

        // DM Setting
    	String cmpy_cd		= Util.getSessionParameterValue(req, "cmpycd", true);
    	String incmg_pers_ip = req.getRemoteAddr();
    	String incmg_pers 	 = Util.getSessionParameterValue(req, "emp_no", true);
    	String slip_clsf 	= Util.checkString(req.getParameter("slip_clsf"));
    	String occr_dt	 	= Util.checkString(req.getParameter("occr_dt"));
    	String frdt 		= Util.checkString(req.getParameter("frdt"));
    	String todt 		= Util.checkString(req.getParameter("todt"));
    	String bddb_clsf 	= Util.checkString(req.getParameter("bddb_clsf"));

    	AD_DEP_1420_ADM dm = new AD_DEP_1420_ADM();
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setSlip_clsf(slip_clsf);
    	dm.setOccr_dt(occr_dt);
    	dm.setFrdt(frdt);
    	dm.setTodt(todt);
    	dm.setBddb_clsf(bddb_clsf);
    	dm.setIncmg_pers_ip(incmg_pers_ip);
    	dm.setIncmg_pers(incmg_pers);
       
        //dm.print();

        try {
        	AdDep1400DAO	dao = new AdDep1400DAO();
            ds = dao.ad_dep_1420_a(dm);
            req.setAttribute("ds", ds);
            req.setAttribute("resultMsg", ds.proc_cnt + " 건이 처리되었습니다.");
        }
        catch (AppException e) {
            throw e;
        }  
        
//        AdDep1400EJBHome home = (AdDep1400EJBHome) JNDIManager.getInstance().getHome("AdDep1400EJB");
//        try {
//        	AdDep1400EJB ejb = home.create();
//            ds = ejb.ad_dep_1420_a(dm);
//            req.setAttribute("ds", ds);
//            req.setAttribute("resultMsg", ds.proc_cnt + " 건이 처리되었습니다.");
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

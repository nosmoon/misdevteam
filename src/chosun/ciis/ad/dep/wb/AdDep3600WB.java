/***************************************************************************************************
* 파일명 : AdDep3600WB.java
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
import chosun.ciis.ad.dep.dao.AdDep3600DAO;
import chosun.ciis.ad.dep.dm.AD_DEP_3610_SDM;
import chosun.ciis.ad.dep.dm.AD_DEP_3620_ADM;
import chosun.ciis.ad.dep.ds.AD_DEP_3610_SDataSet;
import chosun.ciis.ad.dep.ds.AD_DEP_3620_ADataSet;
import chosun.ciis.co.base.wb.BaseWB;
/**
 * 
 */

public class AdDep3600WB extends BaseWB {


    /**
     * 
     *
     * @param req HttpServletRequest
     * @param pub HttpServletResponse
     * @throws AppException
     */
    public void ad_dep_3610_s(HttpServletRequest req, HttpServletResponse pub) throws   AppException {
    	
    	AD_DEP_3610_SDataSet ds = null;

        // DM Setting
    	String cmpy_cd        = Util.getSessionParameterValue(req, "cmpycd", true);
    	String rept_no = Util.checkString(req.getParameter("rept_no"));

    	AD_DEP_3610_SDM dm = new AD_DEP_3610_SDM();
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setRept_no(rept_no);
    	
    	//dm.print();

        try {
        	AdDep3600DAO	dao = new AdDep3600DAO();
            ds = dao.ad_dep_3610_s(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        }    
//        
//        AdDep3600EJBHome home = (AdDep3600EJBHome) JNDIManager.getInstance().getHome("AdDep3600EJB");
//        try {
//        	AdDep3600EJB ejb = home.create();
//            ds = ejb.ad_dep_3610_s(dm);
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
    public void ad_dep_3620_a(HttpServletRequest req, HttpServletResponse pub) throws   AppException {
    	
    	AD_DEP_3620_ADataSet ds = null;

        // DM Setting
    	String cmpy_cd        = Util.getSessionParameterValue(req, "cmpycd", true);
    	String incmg_pers_ip = req.getRemoteAddr();
    	String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
    	String rept_no = Util.checkString(req.getParameter("rept_no"));

    	String flag = Util.checkString(req.getParameter("flag"));
    	String slcrg_pers = Util.checkString(req.getParameter("slcrg_pers"));
    	String mchrg_pers = Util.checkString(req.getParameter("mchrg_pers"));
    	String dlco_no = Util.checkString(req.getParameter("dlco_no"));
    	String advt_cont = Util.checkString(req.getParameter("advt_cont"));
    	String remk = Util.checkString(req.getParameter("remk"));
    	String tel_no = Util.checkString(req.getParameter("tel_no"));
    	String occr_caus_busn = Util.checkString(req.getParameter("occr_caus_busn"));
    	String occr_caus_mang = Util.checkString(req.getParameter("occr_caus_mang"));
    	String act_matt_busn = Util.checkString(req.getParameter("act_matt_busn"));
    	String act_matt_mang = Util.checkString(req.getParameter("act_matt_mang"));
    	String proc_plan_busn = Util.checkString(req.getParameter("proc_plan_busn"));
    	String proc_plan_mang = Util.checkString(req.getParameter("proc_plan_mang"));
    	
    	AD_DEP_3620_ADM dm = new AD_DEP_3620_ADM();
    	dm.setFlag(flag);
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setRept_no(rept_no);
    	dm.setDlco_no(dlco_no);
    	dm.setAdvt_cont(advt_cont);
    	dm.setRemk(remk);
    	dm.setTel_no(tel_no);
    	dm.setSlcrg_pers(slcrg_pers);
    	dm.setMchrg_pers(mchrg_pers);
    	dm.setOccr_caus_busn(occr_caus_busn);
    	dm.setOccr_caus_mang(occr_caus_mang);
    	dm.setAct_matt_busn(act_matt_busn);
    	dm.setAct_matt_mang(act_matt_mang);
    	dm.setProc_plan_busn(proc_plan_busn);
    	dm.setProc_plan_mang(proc_plan_mang);
    	dm.setIncmg_pers_ip(incmg_pers_ip);
    	dm.setIncmg_pers(incmg_pers);

        try {
        	AdDep3600DAO	dao = new AdDep3600DAO();
            ds = dao.ad_dep_3620_a(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        }  
//        
//        AdDep3600EJBHome home = (AdDep3600EJBHome) JNDIManager.getInstance().getHome("AdDep3600EJB");
//        try {
//        	AdDep3600EJB ejb = home.create();
//            ds = ejb.ad_dep_3620_a(dm);
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

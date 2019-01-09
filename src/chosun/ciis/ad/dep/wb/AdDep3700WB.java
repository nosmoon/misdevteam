/***************************************************************************************************
* 파일명 : AdDep3700WB.java
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

import java.util.Hashtable;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.util.Util;
import chosun.ciis.ad.dep.dao.AdDep3700DAO;
import chosun.ciis.ad.dep.dm.AD_DEP_3700_MDM;
import chosun.ciis.ad.dep.dm.AD_DEP_3710_LDM;
import chosun.ciis.ad.dep.dm.AD_DEP_3715_UDM;
import chosun.ciis.ad.dep.dm.AD_DEP_3720_SDM;
import chosun.ciis.ad.dep.dm.AD_DEP_3730_ADM;
import chosun.ciis.ad.dep.ds.AD_DEP_3700_MDataSet;
import chosun.ciis.ad.dep.ds.AD_DEP_3710_LDataSet;
import chosun.ciis.ad.dep.ds.AD_DEP_3715_UDataSet;
import chosun.ciis.ad.dep.ds.AD_DEP_3720_SDataSet;
import chosun.ciis.ad.dep.ds.AD_DEP_3730_ADataSet;
import chosun.ciis.co.base.util.StringUtil;
import chosun.ciis.co.base.wb.BaseWB;
/**
 * 
 */

public class AdDep3700WB extends BaseWB {

    /**
     * 
     *
     * @param req HttpServletRequest
     * @param pub HttpServletResponse
     * @throws AppException
     */
    public void ad_dep_3700_m(HttpServletRequest req, HttpServletResponse pub) throws   AppException {
    	
    	AD_DEP_3700_MDataSet ds = null;

        // DM Setting
    	String cmpy_cd        = Util.getSessionParameterValue(req, "cmpycd", true);
    	String dealmedicd     = Util.getSessionParameterValue(req, "dealmedicd", true);

    	AD_DEP_3700_MDM dm = new AD_DEP_3700_MDM();
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setDealmedicd(dealmedicd);

        try {
        	AdDep3700DAO	dao = new AdDep3700DAO();
            ds = dao.ad_dep_3700_m(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        }  
//        
//        AdDep3700EJBHome home = (AdDep3700EJBHome) JNDIManager.getInstance().getHome("AdDep3700EJB");
//        try {
//        	AdDep3700EJB ejb = home.create();
//            ds = ejb.ad_dep_3700_m(dm);
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
    public void ad_dep_3710_l(HttpServletRequest req, HttpServletResponse pub) throws   AppException {
    	
    	AD_DEP_3710_LDataSet ds = null;

        // DM Setting
    	String cmpy_cd        = Util.getSessionParameterValue(req, "cmpycd", true);
    	String medi_cd = Util.checkString(req.getParameter("medi_cd"));
    	String eps_clsf = Util.checkString(req.getParameter("eps_clsf"));
    	String enty_clsf = Util.checkString(req.getParameter("enty_clsf"));
    	String frdt 	= Util.checkString(req.getParameter("frdt"));
    	String todt 	= Util.checkString(req.getParameter("todt"));
    	String fpymt_yn = Util.checkString(req.getParameter("fpymt_yn"));
    	String prog_yn 	= Util.checkString(req.getParameter("prog_yn"));

    	AD_DEP_3710_LDM dm = new AD_DEP_3710_LDM();
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setMedi_cd(medi_cd);
    	dm.setEps_clsf(eps_clsf);
    	dm.setEnty_clsf(enty_clsf);
    	dm.setFrdt(frdt);
    	dm.setTodt(todt);
    	dm.setFpymt_yn(StringUtil.nvl(fpymt_yn, "N"));
    	dm.setProg_yn(StringUtil.nvl(prog_yn, "N"));
       
    	//dm.print();

        try {
        	AdDep3700DAO	dao = new AdDep3700DAO();
            ds = dao.ad_dep_3710_l(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        }  
//        
//        AdDep3700EJBHome home = (AdDep3700EJBHome) JNDIManager.getInstance().getHome("AdDep3700EJB");
//        try {
//        	AdDep3700EJB ejb = home.create();
//            ds = ejb.ad_dep_3710_l(dm);
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
    public void ad_dep_3715_u(HttpServletRequest req, HttpServletResponse pub) throws   AppException {
    	
    	AD_DEP_3715_UDataSet ds = null;

        // DM Setting
    	String cmpy_cd        = Util.getSessionParameterValue(req, "cmpycd", true);
    	String incmg_pers_ip = req.getRemoteAddr();
    	String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);

    	String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
    	
    	Hashtable hash = getHashMultiUpdateData(multiUpdateData);
    	
    	String rept_no = Util.checkString((String)hash.get("rept_no"));
    	String sue_chrg_pers = Util.checkString((String)hash.get("sue_chrg_pers"));
    	String dlay_rcpm_plan_dt = Util.checkString((String)hash.get("dlay_rcpm_plan_dt"));

    	AD_DEP_3715_UDM dm = new AD_DEP_3715_UDM();
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setRept_no(rept_no);
    	dm.setSue_chrg_pers(sue_chrg_pers);
    	dm.setDlay_rcpm_plan_dt(dlay_rcpm_plan_dt);
    	dm.setIncmg_pers_ip(incmg_pers_ip);
    	dm.setIncmg_pers(incmg_pers);
       
    	//dm.print();

        try {
        	AdDep3700DAO	dao = new AdDep3700DAO();
            ds = dao.ad_dep_3715_u(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        }  
//        
//        AdDep3700EJBHome home = (AdDep3700EJBHome) JNDIManager.getInstance().getHome("AdDep3700EJB");
//        try {
//        	AdDep3700EJB ejb = home.create();
//            ds = ejb.ad_dep_3715_u(dm);
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
    public void ad_dep_3720_s(HttpServletRequest req, HttpServletResponse pub) throws   AppException {
    	
    	AD_DEP_3720_SDataSet ds = null;

        // DM Setting
    	String cmpy_cd        = Util.getSessionParameterValue(req, "cmpycd", true);
    	String rept_no = Util.checkString(req.getParameter("rept_no"));
    	String chk_item = Util.checkString(req.getParameter("chk_item"));

    	AD_DEP_3720_SDM dm = new AD_DEP_3720_SDM();
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setRept_no(rept_no);
    	dm.setChk_item(chk_item);
       
    	//dm.print();

        try {
        	AdDep3700DAO	dao = new AdDep3700DAO();
            ds = dao.ad_dep_3720_s(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        }  
//        
//        AdDep3700EJBHome home = (AdDep3700EJBHome) JNDIManager.getInstance().getHome("AdDep3700EJB");
//        try {
//        	AdDep3700EJB ejb = home.create();
//            ds = ejb.ad_dep_3720_s(dm);
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
    public void ad_dep_3730_a(HttpServletRequest req, HttpServletResponse pub) throws   AppException {
    	
    	AD_DEP_3730_ADataSet ds = null;

        // DM Setting
    	String cmpy_cd        = Util.getSessionParameterValue(req, "cmpycd", true);
    	String incmg_pers_ip = req.getRemoteAddr();
    	String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
    	
    	String rept_no = Util.checkString(req.getParameter("rept_no"));
    	String chk_item = Util.checkString(req.getParameter("chk_item"));
    	String flag = Util.checkString(req.getParameter("flag"));
    	String chk_dt = Util.checkString(req.getParameter("chk_dt"));
    	String chk_cont = Util.checkString(req.getParameter("chk_cont"));
    	
    	AD_DEP_3730_ADM dm = new AD_DEP_3730_ADM();

    	dm.setFlag(flag);
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setRept_no(rept_no);
    	dm.setChk_item(chk_item);
    	dm.setChk_dt(chk_dt);
    	dm.setChk_cont(chk_cont);
    	dm.setIncmg_pers_ip(incmg_pers_ip);
    	dm.setIncmg_pers(incmg_pers);
       
    	//dm.print();

        try {
        	AdDep3700DAO	dao = new AdDep3700DAO();
            ds = dao.ad_dep_3730_a(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        }  
//        
//        AdDep3700EJBHome home = (AdDep3700EJBHome) JNDIManager.getInstance().getHome("AdDep3700EJB");
//        try {
//        	AdDep3700EJB ejb = home.create();
//            ds = ejb.ad_dep_3730_a(dm);
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

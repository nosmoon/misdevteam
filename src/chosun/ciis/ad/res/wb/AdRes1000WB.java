/***************************************************************************************************
* 파일명 : AdRes1000WB.java
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

package chosun.ciis.ad.res.wb;

import java.util.Hashtable;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.util.Util;
import chosun.ciis.ad.res.dao.AdRes1000DAO;
import chosun.ciis.ad.res.dm.AD_RES_1000_MDM;
import chosun.ciis.ad.res.dm.AD_RES_1010_SDM;
import chosun.ciis.ad.res.dm.AD_RES_1020_LDM;
import chosun.ciis.ad.res.dm.AD_RES_1025_LDM;
import chosun.ciis.ad.res.dm.AD_RES_1030_IDM;
import chosun.ciis.ad.res.dm.AD_RES_1040_ADM;
import chosun.ciis.ad.res.dm.AD_RES_1050_UDM;
import chosun.ciis.ad.res.dm.AD_RES_1060_UDM;
import chosun.ciis.ad.res.dm.AD_RES_1065_UDM;
import chosun.ciis.ad.res.ds.AD_RES_1000_MDataSet;
import chosun.ciis.ad.res.ds.AD_RES_1010_SDataSet;
import chosun.ciis.ad.res.ds.AD_RES_1020_LDataSet;
import chosun.ciis.ad.res.ds.AD_RES_1025_LDataSet;
import chosun.ciis.ad.res.ds.AD_RES_1030_IDataSet;
import chosun.ciis.ad.res.ds.AD_RES_1040_ADataSet;
import chosun.ciis.ad.res.ds.AD_RES_1050_UDataSet;
import chosun.ciis.ad.res.ds.AD_RES_1060_UDataSet;
import chosun.ciis.ad.res.ds.AD_RES_1065_UDataSet;
import chosun.ciis.co.base.util.StringUtil;
import chosun.ciis.co.base.wb.BaseWB;
/**
 * 
 */

public class AdRes1000WB extends BaseWB {

    /**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void ad_res_1000_m(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	AD_RES_1000_MDataSet ds = null;

        // DM Setting
    	AD_RES_1000_MDM dm = new AD_RES_1000_MDM();
    	String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);
    	String issu_yymm = Util.checkString(req.getParameter("issu_yymm"));
    	String medi_cd   = Util.checkString(req.getParameter("medi_cd"));

        dm.setCmpy_cd(cmpy_cd);
        dm.setIssu_yymm(issu_yymm);
        dm.setMedi_cd(medi_cd);
        

        try {
        	AdRes1000DAO	dao = new AdRes1000DAO();
            ds = dao.ad_res_1000_m(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        } 
//        
//        AdRes1000EJBHome home = (AdRes1000EJBHome) JNDIManager.getInstance().getHome("AdRes1000EJB");
//        try {
//        	AdRes1000EJB ejb = home.create();
//            ds = ejb.ad_res_1000_m(dm);
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
    public void ad_res_1010_s(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	AD_RES_1010_SDataSet ds = null;

        // DM Setting
    	AD_RES_1010_SDM dm = new AD_RES_1010_SDM();
    	String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);
    	String medi_cd = Util.checkString(req.getParameter("medi_cd"));
    	String issu_dt = Util.checkString(req.getParameter("issu_dt"));

        dm.setCmpy_cd(cmpy_cd);
        dm.setMedi_cd(medi_cd);
        dm.setIssu_dt(issu_dt);

        try {
        	AdRes1000DAO	dao = new AdRes1000DAO();
            ds = dao.ad_res_1010_s(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        } 
//        
//        AdRes1000EJBHome home = (AdRes1000EJBHome) JNDIManager.getInstance().getHome("AdRes1000EJB");
//        try {
//        	AdRes1000EJB ejb = home.create();
//            ds = ejb.ad_res_1010_s(dm);
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
    public void ad_res_1020_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	AD_RES_1020_LDataSet ds = null;

        // DM Setting
    	AD_RES_1020_LDM dm = new AD_RES_1020_LDM();
    	String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);
    	String medi_cd = Util.checkString(req.getParameter("medi_cd"));

        dm.setCmpy_cd(cmpy_cd);
        dm.setMedi_cd(medi_cd);

        try {
        	AdRes1000DAO	dao = new AdRes1000DAO();
            ds = dao.ad_res_1020_l(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        } 
//        
//        AdRes1000EJBHome home = (AdRes1000EJBHome) JNDIManager.getInstance().getHome("AdRes1000EJB");
//        try {
//        	AdRes1000EJB ejb = home.create();
//            ds = ejb.ad_res_1020_l(dm);
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
    public void ad_res_1025_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	AD_RES_1025_LDataSet ds = null;

        // DM Setting
    	AD_RES_1025_LDM dm = new AD_RES_1025_LDM();
    	String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);
    	String medi_cd = Util.checkString(req.getParameter("medi_cd"));

        dm.setCmpy_cd(cmpy_cd);
        dm.setMedi_cd(medi_cd);

        try {
        	AdRes1000DAO	dao = new AdRes1000DAO();
            ds = dao.ad_res_1025_l(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        } 
//        
//        AdRes1000EJBHome home = (AdRes1000EJBHome) JNDIManager.getInstance().getHome("AdRes1000EJB");
//        try {
//        	AdRes1000EJB ejb = home.create();
//            ds = ejb.ad_res_1025_l(dm);
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
    public void ad_res_1030_i(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	AD_RES_1030_IDataSet ds = null;

        // DM Setting
    	AD_RES_1030_IDM dm = new AD_RES_1030_IDM();
    	String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);
    	String issu_yymm = Util.checkString(req.getParameter("issu_yymm"));
    	String medi_cd = Util.checkString(req.getParameter("medi_cd"));
    	String incmg_pers_ip = req.getRemoteAddr();
    	String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);

        dm.setCmpy_cd(cmpy_cd);
        dm.setIssu_yymm(issu_yymm);
        dm.setMedi_cd(medi_cd);
        dm.setIncmg_pers_ip(incmg_pers_ip);
        dm.setIncmg_pers(incmg_pers);

        try {
        	AdRes1000DAO	dao = new AdRes1000DAO();
            ds = dao.ad_res_1030_i(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        } 
//        
//        AdRes1000EJBHome home = (AdRes1000EJBHome) JNDIManager.getInstance().getHome("AdRes1000EJB");
//        try {
//        	AdRes1000EJB ejb = home.create();
//            ds = ejb.ad_res_1030_i(dm);
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
    public void ad_res_1040_a(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	AD_RES_1040_ADataSet ds = null;

        // DM Setting
    	AD_RES_1040_ADM dm = new AD_RES_1040_ADM();
    	String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);
    	String medi_cd = Util.checkString(req.getParameter("medi_cd"));
    	String issu_dt = Util.checkString(req.getParameter("issu_dt"));
    	
    	String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
    	
    	Hashtable hash = getHashMultiUpdateData(multiUpdateData);

    	String mode 		= StringUtil.nvl((String)hash.get("m"));
    	String sect_clas_cd = StringUtil.nvl((String)hash.get("sect_clas_cd"));
    	String sect_nm_cd 	= StringUtil.nvl((String)hash.get("sect_nm_cd"));
    	String sect_cd 		= StringUtil.nvl((String)hash.get("sect_cd"));
    	String edt_clsf 	= StringUtil.nvl((String)hash.get("edt_clsf"));
    	String bgn_side 	= StringUtil.nvl((String)hash.get("bgn_side"));
    	String end_side 	= StringUtil.nvl((String)hash.get("end_side"));
    	String issu_cnt 	= StringUtil.nvl((String)hash.get("issu_cnt"));
    	String tabl_clsf 	= StringUtil.nvl((String)hash.get("tabl_clsf"));
    	String pre_sect_clas_cd = StringUtil.nvl((String)hash.get("pre_sect_clas_cd"));
    	String pre_sect_nm_cd 	= StringUtil.nvl((String)hash.get("pre_sect_nm_cd"));
    	
    	String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
    	
        dm.setCmpy_cd(cmpy_cd);
        dm.setMedi_cd(medi_cd);
        dm.setIssu_dt(issu_dt);
        dm.setMode(mode.toUpperCase());
        dm.setSect_clas_cd(sect_clas_cd);
        dm.setSect_nm_cd(sect_nm_cd);
        dm.setSect_cd(sect_cd);
        dm.setEdt_clsf(edt_clsf);
        dm.setBgn_side(bgn_side);
        dm.setEnd_side(end_side);
        dm.setIssu_cnt(issu_cnt);
        dm.setTabl_clsf(tabl_clsf);
        dm.setPre_sect_clas_cd(pre_sect_clas_cd);
        dm.setPre_sect_nm_cd(pre_sect_nm_cd);
        dm.setIncmg_pers_ip(req.getRemoteAddr());
        dm.setIncmg_pers(incmg_pers);
        
        dm.print();
        

        try {
        	AdRes1000DAO	dao = new AdRes1000DAO();
            ds = dao.ad_res_1040_a(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        } 
//        
//        AdRes1000EJBHome home = (AdRes1000EJBHome) JNDIManager.getInstance().getHome("AdRes1000EJB");
//        try {
//        	AdRes1000EJB ejb = home.create();
//            ds = ejb.ad_res_1040_a(dm);
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
    public void ad_res_1050_u(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	AD_RES_1050_UDataSet ds = null;

        // DM Setting
    	AD_RES_1050_UDM dm = new AD_RES_1050_UDM();
    	
    	String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);
    	String medi_cd = Util.checkString(req.getParameter("medi_cd"));
    	String issu_dt = Util.checkString(req.getParameter("issu_dt"));
    	String pcnt_clos_yn = Util.checkString(req.getParameter("pcnt_clos_yn"));
    	String incmg_pers_ip = Util.checkString(req.getParameter("incmg_pers_ip"));
    	String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);

        dm.setCmpy_cd(cmpy_cd);
        dm.setMedi_cd(medi_cd);
        dm.setIssu_dt(issu_dt);
        dm.setPcnt_clos_yn(pcnt_clos_yn);
        dm.setIncmg_pers_ip(req.getRemoteAddr());
        dm.setIncmg_pers(incmg_pers);

        try {
        	AdRes1000DAO	dao = new AdRes1000DAO();
            ds = dao.ad_res_1050_u(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        } 
//        
//        AdRes1000EJBHome home = (AdRes1000EJBHome) JNDIManager.getInstance().getHome("AdRes1000EJB");
//        try {
//        	AdRes1000EJB ejb = home.create();
//            ds = ejb.ad_res_1050_u(dm);
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
    public void ad_res_1060_u(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	AD_RES_1060_UDataSet ds = null;

        // DM Setting
    	AD_RES_1060_UDM dm = new AD_RES_1060_UDM();

    	String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);
    	String medi_cd = Util.checkString(req.getParameter("medi_cd"));
    	String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
    	
    	Hashtable hash = getHashMultiUpdateData(multiUpdateData);
    	
    	String wkdy 			= (String)hash.get("wkdy");
    	String sect_clas_cd1 	= (String)hash.get("sect_clas_cd1");
    	String sect_nm_cd1   	= (String)hash.get("sect_nm_cd1"); 
    	String sect_cd1 	 	= (String)hash.get("sect_cd1"); 
    	String bgn_side1     	= (String)hash.get("bgn_side1"); 
    	String end_side1 		= (String)hash.get("end_side1"); 
    	
    	String sect_clas_cd2 	= (String)hash.get("sect_clas_cd2"); 
    	String sect_nm_cd2 		= (String)hash.get("sect_nm_cd2"); 
    	String sect_cd2 		= (String)hash.get("sect_cd2"); 
    	String bgn_side2 		= (String)hash.get("bgn_side2"); 
    	String end_side2 		= (String)hash.get("end_side2"); 
    	
    	String sect_clas_cd3 	= (String)hash.get("sect_clas_cd3"); 
    	String sect_nm_cd3 		= (String)hash.get("sect_nm_cd3"); 
    	String sect_cd3 		= (String)hash.get("sect_cd3"); 
    	String bgn_side3 		= (String)hash.get("bgn_side3"); 
    	String end_side3 		= (String)hash.get("end_side3"); 
    	
    	String sect_clas_cd4 	= (String)hash.get("sect_clas_cd4"); 
    	String sect_nm_cd4	 	= (String)hash.get("sect_nm_cd4"); 
    	String sect_cd4 		= (String)hash.get("sect_cd4"); 
    	String bgn_side4 		= (String)hash.get("bgn_side4"); 
    	String end_side4 		= (String)hash.get("end_side4"); 
    	
    	String sect_clas_cd5 	= (String)hash.get("sect_clas_cd5"); 
    	String sect_nm_cd5 		= (String)hash.get("sect_nm_cd5"); 
    	String sect_cd5 		= (String)hash.get("sect_cd5"); 
    	String bgn_side5 		= (String)hash.get("bgn_side5"); 
    	String end_side5 		= (String)hash.get("end_side5"); 
    	
    	String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
    	
        dm.setCmpy_cd(cmpy_cd);
        dm.setMedi_cd(medi_cd);
        dm.setWkdy(wkdy);
        dm.setSect_clas_cd1(sect_clas_cd1);
        dm.setSect_nm_cd1(sect_nm_cd1);
        dm.setSect_cd1(sect_cd1);
        dm.setBgn_side1(bgn_side1);
        dm.setEnd_side1(end_side1);
        dm.setSect_clas_cd2(sect_clas_cd2);
        dm.setSect_nm_cd2(sect_nm_cd2);
        dm.setSect_cd2(sect_cd2);
        dm.setBgn_side2(bgn_side2);
        dm.setEnd_side2(end_side2);
        dm.setSect_clas_cd3(sect_clas_cd3);
        dm.setSect_nm_cd3(sect_nm_cd3);
        dm.setSect_cd3(sect_cd3);
        dm.setBgn_side3(bgn_side3);
        dm.setEnd_side3(end_side3);
        dm.setSect_clas_cd4(sect_clas_cd4);
        dm.setSect_nm_cd4(sect_nm_cd4);
        dm.setSect_cd4(sect_cd4);
        dm.setBgn_side4(bgn_side4);
        dm.setEnd_side4(end_side4);
        dm.setSect_clas_cd5(sect_clas_cd5);
        dm.setSect_nm_cd5(sect_nm_cd5);
        dm.setSect_cd5(sect_cd5);
        dm.setBgn_side5(bgn_side5);
        dm.setEnd_side5(end_side5);
        
        dm.setIncmg_pers_ip(req.getRemoteAddr());
        dm.setIncmg_pers(incmg_pers);
        
        //dm.print();

        try {
        	AdRes1000DAO	dao = new AdRes1000DAO();
            ds = dao.ad_res_1060_u(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        } 
//        
//        AdRes1000EJBHome home = (AdRes1000EJBHome) JNDIManager.getInstance().getHome("AdRes1000EJB");
//        try {
//        	AdRes1000EJB ejb = home.create();
//            ds = ejb.ad_res_1060_u(dm);
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
    public void ad_res_1065_u(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	AD_RES_1065_UDataSet ds = null;

        // DM Setting
    	AD_RES_1065_UDM dm = new AD_RES_1065_UDM();

    	String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);
    	String medi_cd = Util.checkString(req.getParameter("medi_cd"));
    	String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
    	
    	//System.out.println("multiUpdateData = " + multiUpdateData);
    	
    	Hashtable hash = getHashMultiUpdateData(multiUpdateData);
    	
    	String wkdy 			= (String)hash.get("wkdy");
    	String bgn_side1     	= (String)hash.get("bgn_side1"); 
    	String end_side1 		= (String)hash.get("end_side1"); 
    	String bgn_side2     	= (String)hash.get("bgn_side2"); 
    	String end_side2 		= (String)hash.get("end_side2");
    	String bgn_side3     	= (String)hash.get("bgn_side3"); 
    	String end_side3 		= (String)hash.get("end_side3");
    	String bgn_side4     	= (String)hash.get("bgn_side4"); 
    	String end_side4 		= (String)hash.get("end_side4");
    	String bgn_side5     	= (String)hash.get("bgn_side5"); 
    	String end_side5 		= (String)hash.get("end_side5");
    	
    	
    	String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
    	
        dm.setCmpy_cd(cmpy_cd);
        dm.setMedi_cd(medi_cd);
        dm.setWkdy(wkdy);
        dm.setBgn_side1(bgn_side1);
        dm.setEnd_side1(end_side1);
        dm.setBgn_side2(bgn_side2);
        dm.setEnd_side2(end_side2);
        dm.setBgn_side3(bgn_side3);
        dm.setEnd_side3(end_side3);
        dm.setBgn_side4(bgn_side4);
        dm.setEnd_side4(end_side4);
        dm.setBgn_side5(bgn_side5);
        dm.setEnd_side5(end_side5);
        dm.setIncmg_pers_ip(req.getRemoteAddr());
        dm.setIncmg_pers(incmg_pers);
        
        //dm.print();

        try {
        	AdRes1000DAO	dao = new AdRes1000DAO();
            ds = dao.ad_res_1065_u(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        } 
//        
//        AdRes1000EJBHome home = (AdRes1000EJBHome) JNDIManager.getInstance().getHome("AdRes1000EJB");
//        try {
//        	AdRes1000EJB ejb = home.create();
//            ds = ejb.ad_res_1065_u(dm);
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

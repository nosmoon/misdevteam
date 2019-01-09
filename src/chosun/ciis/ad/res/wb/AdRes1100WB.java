/***************************************************************************************************
* 파일명 : AdRes1100WB.java
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
import chosun.ciis.ad.res.dao.AdRes1100DAO;
import chosun.ciis.ad.res.dm.AD_RES_1100_MDM;
import chosun.ciis.ad.res.dm.AD_RES_1110_LDM;
import chosun.ciis.ad.res.dm.AD_RES_1120_UDM;
import chosun.ciis.ad.res.dm.AD_RES_1130_IDM;
import chosun.ciis.ad.res.ds.AD_RES_1100_MDataSet;
import chosun.ciis.ad.res.ds.AD_RES_1110_LDataSet;
import chosun.ciis.ad.res.ds.AD_RES_1120_UDataSet;
import chosun.ciis.ad.res.ds.AD_RES_1130_IDataSet;
import chosun.ciis.co.base.wb.BaseWB;
/**
 * 
 */

public class AdRes1100WB extends BaseWB {

    /**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void ad_res_1100_m(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	AD_RES_1100_MDataSet ds = null;

        // DM Setting
    	AD_RES_1100_MDM dm = new AD_RES_1100_MDM();
    	String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);

        dm.setCmpy_cd(cmpy_cd);

        try {
        	AdRes1100DAO	dao = new AdRes1100DAO();
            ds = dao.ad_res_1100_m(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        } 
//        
//        AdRes1100EJBHome home = (AdRes1100EJBHome) JNDIManager.getInstance().getHome("AdRes1100EJB");
//        try {
//        	AdRes1100EJB ejb = home.create();
//            ds = ejb.ad_res_1100_m(dm);
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
    public void ad_res_1110_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	AD_RES_1110_LDataSet ds = null;

    	String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);
    	String medi_cd = Util.checkString(req.getParameter("medi_cd"));
    	String issu_dt = Util.checkString(req.getParameter("issu_dt"));

    	// DM Setting
    	AD_RES_1110_LDM dm = new AD_RES_1110_LDM();
        dm.setCmpy_cd(cmpy_cd);
        dm.setMedi_cd(medi_cd);
        dm.setIssu_dt(issu_dt);
        

        try {
        	AdRes1100DAO	dao = new AdRes1100DAO();
            ds = dao.ad_res_1110_l(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        } 
//        
//        AdRes1100EJBHome home = (AdRes1100EJBHome) JNDIManager.getInstance().getHome("AdRes1100EJB");
//        try {
//        	AdRes1100EJB ejb = home.create();
//            ds = ejb.ad_res_1110_l(dm);
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
    public void ad_res_1120_u(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	AD_RES_1120_UDataSet ds = null;

    	String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);
    	String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
    	String medi_cd = Util.checkString(req.getParameter("medi_cd"));
    	String issu_dt = Util.checkString(req.getParameter("issu_dt"));
    	
    	String multiUpdateData1 = Util.checkString(req.getParameter("multiUpdateData1"));
    	String multiUpdateData2 = Util.checkString(req.getParameter("multiUpdateData2"));
    	String multiUpdateData3 = Util.checkString(req.getParameter("multiUpdateData3"));
    	String multiUpdateData4 = Util.checkString(req.getParameter("multiUpdateData4"));
    	String multiUpdateData5 = Util.checkString(req.getParameter("multiUpdateData5"));
    	String multiUpdateData6 = Util.checkString(req.getParameter("multiUpdateData6"));
    	String multiUpdateData7 = Util.checkString(req.getParameter("multiUpdateData7"));
    	String multiUpdateData8 = Util.checkString(req.getParameter("multiUpdateData8"));
    	
    	Hashtable hash1 = getHashMultiUpdateData(multiUpdateData1);
    	Hashtable hash2 = getHashMultiUpdateData(multiUpdateData2);
    	Hashtable hash3 = getHashMultiUpdateData(multiUpdateData3);
    	Hashtable hash4 = getHashMultiUpdateData(multiUpdateData4);
    	Hashtable hash5 = getHashMultiUpdateData(multiUpdateData5);
    	Hashtable hash6 = getHashMultiUpdateData(multiUpdateData6);
    	Hashtable hash7 = getHashMultiUpdateData(multiUpdateData7);
    	Hashtable hash8 = getHashMultiUpdateData(multiUpdateData8);
    	
    	String issu_side1 	= Util.checkString((String)hash1.get("issu_side"));
    	String cm1 			= Util.checkString((String)hash1.get("cm"));
    	String dn1 			= Util.checkString((String)hash1.get("dn"));
    	String color1 		= Util.checkString((String)hash1.get("bw_clr_yn"));
    	
    	String issu_side2 	= Util.checkString((String)hash2.get("issu_side"));
    	String cm2 			= Util.checkString((String)hash2.get("cm"));
    	String dn2 			= Util.checkString((String)hash2.get("dn"));
    	String color2 		= Util.checkString((String)hash2.get("bw_clr_yn"));
    	
    	String issu_side3 	= Util.checkString((String)hash3.get("issu_side"));
    	String cm3 			= Util.checkString((String)hash3.get("cm"));
    	String dn3 			= Util.checkString((String)hash3.get("dn"));
    	String color3 		= Util.checkString((String)hash3.get("bw_clr_yn"));
    	
    	String issu_side4 	= Util.checkString((String)hash4.get("issu_side"));
    	String cm4 			= Util.checkString((String)hash4.get("cm"));
    	String dn4 			= Util.checkString((String)hash4.get("dn"));
    	String color4 		= Util.checkString((String)hash4.get("bw_clr_yn"));
    	
    	String issu_side5 	= Util.checkString((String)hash5.get("issu_side"));
    	String cm5 			= Util.checkString((String)hash5.get("cm"));
    	String dn5 			= Util.checkString((String)hash5.get("dn"));
    	String color5 		= Util.checkString((String)hash5.get("bw_clr_yn"));

    	String issu_side6 	= Util.checkString((String)hash6.get("issu_side"));
    	String cm6 			= Util.checkString((String)hash6.get("cm"));
    	String dn6 			= Util.checkString((String)hash6.get("dn"));
    	String color6 		= Util.checkString((String)hash6.get("bw_clr_yn"));    	

    	String issu_side7 	= Util.checkString((String)hash7.get("issu_side"));
    	String cm7 			= Util.checkString((String)hash7.get("cm"));
    	String dn7 			= Util.checkString((String)hash7.get("dn"));
    	String color7 		= Util.checkString((String)hash7.get("bw_clr_yn"));  
    	
    	String issu_side8 	= Util.checkString((String)hash8.get("issu_side"));
    	String cm8 			= Util.checkString((String)hash8.get("cm"));
    	String dn8 			= Util.checkString((String)hash8.get("dn"));
    	String color8 		= Util.checkString((String)hash8.get("bw_clr_yn"));   

        // DM Setting
    	AD_RES_1120_UDM dm = new AD_RES_1120_UDM();
        dm.setCmpy_cd(cmpy_cd);
        dm.setMedi_cd(medi_cd);
        dm.setIssu_dt(issu_dt);
        dm.setIssu_side1(issu_side1);
        dm.setCm1(cm1);
        dm.setDn1(dn1);
        dm.setColor1(color1);
        dm.setIssu_side2(issu_side2);
        dm.setCm2(cm2);
        dm.setDn2(dn2);
        dm.setColor2(color2);
        dm.setIssu_side3(issu_side3);
        dm.setCm3(cm3);
        dm.setDn3(dn3);
        dm.setColor3(color3);
        dm.setIssu_side4(issu_side4);
        dm.setCm4(cm4);
        dm.setDn4(dn4);
        dm.setColor4(color4);
        dm.setIssu_side5(issu_side5);
        dm.setCm5(cm5);
        dm.setDn5(dn5);
        dm.setColor5(color5);
        
        dm.setIssu_side6(issu_side6);
        dm.setCm6(cm6);
        dm.setDn6(dn6);
        dm.setColor6(color6);
        
        dm.setIssu_side7(issu_side7);
        dm.setCm7(cm7);
        dm.setDn7(dn7);
        dm.setColor7(color7);

        dm.setIssu_side8(issu_side8);
        dm.setCm8(cm8);
        dm.setDn8(dn8);
        dm.setColor8(color8);

        dm.setIncmg_pers(incmg_pers);
        
        dm.print();
        

        try {
        	AdRes1100DAO	dao = new AdRes1100DAO();
            ds = dao.ad_res_1120_u(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        } 
//        
//        AdRes1100EJBHome home = (AdRes1100EJBHome) JNDIManager.getInstance().getHome("AdRes1100EJB");
//        try {
//        	AdRes1100EJB ejb = home.create();
//            ds = ejb.ad_res_1120_u(dm);
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
    public void ad_res_1130_i(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	AD_RES_1130_IDataSet ds = null;

        // DM Setting
    	AD_RES_1130_IDM dm = new AD_RES_1130_IDM();

    	String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);
    	String medi_cd = Util.checkString(req.getParameter("medi_cd"));
    	String sct_term = Util.checkString(req.getParameter("sct_term"));
    	String day_sdt = Util.checkString(req.getParameter("day_sdt"));
    	String day_tdt = Util.checkString(req.getParameter("day_tdt"));
    	String month_sdt = Util.checkString(req.getParameter("month_sdt"));
    	String month_tdt = Util.checkString(req.getParameter("month_tdt"));
    	String incmg_pers_ip = req.getRemoteAddr();
    	String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
    	
        dm.setCmpy_cd(cmpy_cd);
        dm.setMedi_cd(medi_cd);
        dm.setSct_term(sct_term);
        dm.setDay_sdt(day_sdt);
        dm.setDay_tdt(day_tdt);
        dm.setMonth_sdt(month_sdt);
        dm.setMonth_tdt(month_tdt);
        dm.setIncmg_pers_ip(incmg_pers_ip);
        dm.setIncmg_pers(incmg_pers);
        
//        dm.print();

        try {
        	AdRes1100DAO	dao = new AdRes1100DAO();
            ds = dao.ad_res_1130_i(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        } 
//        
//        AdRes1100EJBHome home = (AdRes1100EJBHome) JNDIManager.getInstance().getHome("AdRes1100EJB");
//        try {
//        	AdRes1100EJB ejb = home.create();
//            ds = ejb.ad_res_1130_i(dm);
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

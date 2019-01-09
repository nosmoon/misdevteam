/***************************************************************************************************
* 파일명 : AdRes1900WB.java
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

import java.util.Hashtable;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.util.Util;
import chosun.ciis.ad.res.dao.AdRes1900DAO;
import chosun.ciis.ad.res.dm.AD_RES_1900_MDM;
import chosun.ciis.ad.res.dm.AD_RES_1910_LDM;
import chosun.ciis.ad.res.dm.AD_RES_1911_LDM;
import chosun.ciis.ad.res.dm.AD_RES_1920_IDM;
import chosun.ciis.ad.res.dm.AD_RES_1921_IDM;
import chosun.ciis.ad.res.dm.AD_RES_1930_ADM;
import chosun.ciis.ad.res.dm.AD_RES_1940_LDM;
import chosun.ciis.ad.res.ds.AD_RES_1900_MDataSet;
import chosun.ciis.ad.res.ds.AD_RES_1910_LDataSet;
import chosun.ciis.ad.res.ds.AD_RES_1911_LDataSet;
import chosun.ciis.ad.res.ds.AD_RES_1920_IDataSet;
import chosun.ciis.ad.res.ds.AD_RES_1921_IDataSet;
import chosun.ciis.ad.res.ds.AD_RES_1930_ADataSet;
import chosun.ciis.ad.res.ds.AD_RES_1940_LDataSet;
import chosun.ciis.co.base.wb.BaseWB;
/**
 * 
 */

public class AdRes1900WB extends BaseWB {

    /**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void ad_res_1900_m(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	AD_RES_1900_MDataSet ds = null;

        // DM Setting
    	AD_RES_1900_MDM dm = new AD_RES_1900_MDM();
    	String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);
    	String medi_clsf  = Util.getSessionParameterValue(req, "dealmedicd", true); //매체구분  1:신문광고, 2:출판광고, 3:재경국
        
        dm.setCmpy_cd(cmpy_cd);
        dm.setMedi_clsf(medi_clsf);

        try {
        	AdRes1900DAO	dao = new AdRes1900DAO();
            ds = dao.ad_res_1900_m(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        } 
//        
//        AdRes1900EJBHome home = (AdRes1900EJBHome) JNDIManager.getInstance().getHome("AdRes1900EJB");
//        try {
//        	AdRes1900EJB ejb = home.create();
//            ds = ejb.ad_res_1900_m(dm);
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
    public void ad_res_1910_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	AD_RES_1910_LDataSet ds = null;

        // DM Setting
    	AD_RES_1910_LDM dm = new AD_RES_1910_LDM();
    	String cmpy_cd    	= Util.getSessionParameterValue(req, "cmpycd", true);
    	String medi_cd 		= Util.checkString(req.getParameter("medi_cd"));
    	String frdt 		= Util.checkString(req.getParameter("frdt"))+"01";
    	String todt 		= Util.checkString(req.getParameter("todt"))+"31";
    	String slcrg_pers 	= Util.checkString(req.getParameter("slcrg_pers"));
    	String dlco_no 		= Util.checkString(req.getParameter("dlco_no"));
        
        dm.setCmpy_cd(cmpy_cd);
        dm.setMedi_cd(medi_cd);
        dm.setFrdt(frdt);
        dm.setTodt(todt);
        dm.setSlcrg_pers(slcrg_pers);
        dm.setDlco_no(dlco_no);
        
        //dm.print();

        try {
        	AdRes1900DAO	dao = new AdRes1900DAO();
            ds = dao.ad_res_1910_l(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        } 
//        
//        AdRes1900EJBHome home = (AdRes1900EJBHome) JNDIManager.getInstance().getHome("AdRes1900EJB");
//        try {
//        	AdRes1900EJB ejb = home.create();
//            ds = ejb.ad_res_1910_l(dm);
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
    public void ad_res_1911_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	AD_RES_1911_LDataSet ds = null;

        // DM Setting
    	AD_RES_1911_LDM dm = new AD_RES_1911_LDM();
    	String cmpy_cd    	= Util.getSessionParameterValue(req, "cmpycd", true);
    	String medi_cd		= Util.checkString(req.getParameter("medi_cd"));
    	String frdt 		= Util.checkString(req.getParameter("frdt"))+"01";
    	String todt 		= Util.checkString(req.getParameter("todt"))+"31";
    	String slcrg_pers 	= Util.checkString(req.getParameter("slcrg_pers"));
    	String dlco_no 		= Util.checkString(req.getParameter("dlco_no"));
        
        dm.setCmpy_cd(cmpy_cd);
        dm.setMedi_cd(medi_cd);
        dm.setFrdt(frdt);
        dm.setTodt(todt);
        dm.setSlcrg_pers(slcrg_pers);
        dm.setDlco_no(dlco_no);

        try {
        	AdRes1900DAO	dao = new AdRes1900DAO();
            ds = dao.ad_res_1911_l(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        } 
//        
//        AdRes1900EJBHome home = (AdRes1900EJBHome) JNDIManager.getInstance().getHome("AdRes1900EJB");
//        try {
//        	AdRes1900EJB ejb = home.create();
//            ds = ejb.ad_res_1911_l(dm);
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
    public void ad_res_1920_i(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	AD_RES_1920_IDataSet ds = null;

    	String cmpy_cd      = Util.getSessionParameterValue(req, "cmpycd", true);
    	String medi_cd 		= Util.checkString(req.getParameter("medi_cd"));
    	String frdt 		= Util.checkString(req.getParameter("frdt"));
    	String todt 		= Util.checkString(req.getParameter("todt"));
    	String dlco_no 		= Util.checkString(req.getParameter("dlco_no"));
    	String advt_fee 	= Util.checkString(req.getParameter("advt_fee"));
    	String vat 			= Util.checkString(req.getParameter("vat"));
    	String rtax_yn = Util.checkString(req.getParameter("rtax_yn"));
    	String fee_rate 	= Util.checkString(req.getParameter("fee_rate"));
    	String fee 			= Util.checkString(req.getParameter("fee"));
    	String hndl_clsf 	= Util.checkString(req.getParameter("hndl_clsf"));
    	String agn 			= Util.checkString(req.getParameter("agn"));
    	String slcrg_pers 	= Util.checkString(req.getParameter("slcrg_pers"));
    	String mchrg_pers 	= Util.checkString(req.getParameter("mchrg_pers"));
    	String remk 		= Util.checkString(req.getParameter("remk"));
    	String incmg_pers   = Util.getSessionParameterValue(req, "emp_no", true);
    	String incmg_pers_ip   = req.getRemoteAddr();
    	String fee_vat		= Util.checkString(req.getParameter("fee_vat"));

        // DM Setting
    	AD_RES_1920_IDM dm  = new AD_RES_1920_IDM();
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setMedi_cd(medi_cd);
    	dm.setFrdt(frdt);
    	dm.setTodt(todt);
    	dm.setDlco_no(dlco_no);
    	dm.setAdvt_fee(advt_fee);
    	dm.setVat(vat);
    	dm.setRtax_yn(rtax_yn);
    	dm.setFee_rate(fee_rate);
    	dm.setFee(fee);
    	dm.setHndl_clsf(hndl_clsf);
    	dm.setAgn(agn);
    	dm.setSlcrg_pers(slcrg_pers);
    	dm.setMchrg_pers(mchrg_pers);
    	dm.setRemk(remk);
    	dm.setIncmg_pers_ip(incmg_pers_ip);
    	dm.setIncmg_pers(incmg_pers);
    	dm.setFee_vat(fee_vat);
        //dm.print();

        try {
        	AdRes1900DAO	dao = new AdRes1900DAO();
            ds = dao.ad_res_1920_i(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        } 
//        
//        AdRes1900EJBHome home = (AdRes1900EJBHome) JNDIManager.getInstance().getHome("AdRes1900EJB");
//        try {
//        	AdRes1900EJB ejb = home.create();
//            ds = ejb.ad_res_1920_i(dm);
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
    public void ad_res_1921_i(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	AD_RES_1921_IDataSet ds = null;

    	String cmpy_cd    		= Util.getSessionParameterValue(req, "cmpycd", true);
    	String medi_cd = Util.checkString(req.getParameter("medi_cd"));
    	String yymm = Util.checkString(req.getParameter("yymm"));
    	String dlco_no = Util.checkString(req.getParameter("dlco_no"));
    	String advt_fee = Util.checkString(req.getParameter("advt_fee"));
    	String vat = Util.checkString(req.getParameter("vat"));
    	String rtax_yn = Util.checkString(req.getParameter("rtax_yn"));
    	String fee_rate = Util.checkString(req.getParameter("fee_rate"));
    	String fee = Util.checkString(req.getParameter("fee"));
    	String fee_vat = Util.checkString(req.getParameter("fee_vat"));
    	String sect = Util.checkString(req.getParameter("sect"));
    	String dn = Util.checkString(req.getParameter("dn"));
    	String cm = Util.checkString(req.getParameter("cm"));
    	String hndl_clsf = Util.checkString(req.getParameter("hndl_clsf"));
    	String agn = Util.checkString(req.getParameter("agn"));
    	String slcrg_pers = Util.checkString(req.getParameter("slcrg_pers"));
    	String mchrg_pers = Util.checkString(req.getParameter("mchrg_pers"));
    	String remk = Util.checkString(req.getParameter("remk"));
    	String incmg_pers 		= Util.getSessionParameterValue(req, "emp_no", true);
    	String incmg_pers_ip	= req.getRemoteAddr();
    	
    	String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
    	    	
    	Hashtable hash 	= 	getHashMultiUpdateData(multiUpdateData);
    	
    	String sun		=	Util.checkString((String)hash.get("sun"));
    	String sun_yn	=	Util.checkString((String)hash.get("sun_yn"));
    	String mon		=	Util.checkString((String)hash.get("mon"));
    	String mon_yn	=	Util.checkString((String)hash.get("mon_yn"));	
    	String tue		=	Util.checkString((String)hash.get("tue"));
    	String tue_yn	=	Util.checkString((String)hash.get("tue_yn"));	
    	String wed		=	Util.checkString((String)hash.get("wed"));
    	String wed_yn	=	Util.checkString((String)hash.get("wed_yn"));	
    	String thr		=	Util.checkString((String)hash.get("thr"));
    	String thr_yn	=	Util.checkString((String)hash.get("thr_yn"));	
    	String fri		=	Util.checkString((String)hash.get("fri"));
    	String fri_yn	=	Util.checkString((String)hash.get("fri_yn"));	
    	String sat		=	Util.checkString((String)hash.get("sat"));
    	String sat_yn	=	Util.checkString((String)hash.get("sat_yn"));					
    	
    	
    	String sect_cd  = "";
    	String sect_seq = "";
    	
    	try{
    		sect_cd  = sect.substring(0,1);
    		sect_seq = sect.substring(1);
    	}catch(Exception ignore){
    		sect_cd  = "";
    		sect_seq = "";
    	}
    		  

        // DM Setting
    	AD_RES_1921_IDM dm = new AD_RES_1921_IDM();
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setMedi_cd(medi_cd);
    	dm.setYymm(yymm);
    	dm.setSun(sun);
    	dm.setSun_yn(sun_yn);
    	dm.setMon(mon);
    	dm.setMon_yn(mon_yn);
    	dm.setTue(tue);
    	dm.setTue_yn(tue_yn);
    	dm.setWed(wed);
    	dm.setWed_yn(wed_yn);
    	dm.setThr(thr);
    	dm.setThr_yn(thr_yn);
    	dm.setFri(fri);
    	dm.setFri_yn(fri_yn);
    	dm.setSat(sat);
    	dm.setSat_yn(sat_yn);
    	dm.setDlco_no(dlco_no);
    	dm.setAdvt_fee(advt_fee);
    	dm.setVat(vat);
    	dm.setRtax_yn(rtax_yn);
    	dm.setFee_rate(fee_rate);
    	dm.setFee(fee);
    	dm.setSect_cd(sect_cd);
    	dm.setSect_seq(sect_seq);
    	dm.setDn(dn);
    	dm.setCm(cm);
    	dm.setHndl_clsf(hndl_clsf);
    	dm.setAgn(agn);
    	dm.setSlcrg_pers(slcrg_pers);
    	dm.setMchrg_pers(mchrg_pers);
    	dm.setRemk(remk);
    	dm.setIncmg_pers_ip(incmg_pers_ip);
    	dm.setIncmg_pers(incmg_pers);
    	dm.setFee_vat(fee_vat);
    	
        dm.print();

        try {
        	AdRes1900DAO	dao = new AdRes1900DAO();
            ds = dao.ad_res_1921_i(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        } 
//        
//        AdRes1900EJBHome home = (AdRes1900EJBHome) JNDIManager.getInstance().getHome("AdRes1900EJB");
//        try {
//        	AdRes1900EJB ejb = home.create();
//            ds = ejb.ad_res_1921_i(dm);
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
    public void ad_res_1930_a(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	AD_RES_1930_ADataSet ds = null;

    	String cmpy_cd    	= Util.getSessionParameterValue(req, "cmpycd", true);
    	String chg_pers 	= Util.getSessionParameterValue(req, "emp_no", true);        
        
        String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
         
     	Hashtable hash = getHashMultiUpdateData(multiUpdateData);
     	
     	String mode 			= Util.checkString((String)hash.get("m")); 
        String seq	 			= Util.checkString((String)hash.get("seq")); 
        String preng_occr_dt	= Util.checkString((String)hash.get("preng_occr_dt"));
        String preng_occr_seq	= Util.checkString((String)hash.get("preng_occr_seq"));
    	String dlco_no 			= Util.checkString((String)hash.get("dlco_no"));
    	String advt_fee 		= Util.checkString((String)hash.get("advt_fee"));
    	String vat 				= Util.checkString((String)hash.get("vat"));
    	String coms_rate 		= Util.checkString((String)hash.get("coms_rate"));
    	String coms 			= Util.checkString((String)hash.get("coms"));
    	String coms_vat			= Util.checkString((String)hash.get("coms_vat"));
    	String agn 				= Util.checkString((String)hash.get("agn"));
    	String slcrg_pers 		= Util.checkString((String)hash.get("slcrg_pers"));
    	String medi_cd 			= Util.checkString((String)hash.get("medi_cd"));

        // DM Setting
    	AD_RES_1930_ADM dm = new AD_RES_1930_ADM();
        dm.setCmpy_cd(cmpy_cd);
        dm.setChg_pers(chg_pers);
        dm.setMode(mode.toUpperCase());
     	dm.setSeq(seq);
     	dm.setPreng_occr_dt(preng_occr_dt);
        dm.setPreng_occr_seq(preng_occr_seq);
        dm.setDlco_no(dlco_no);
        dm.setAdvt_fee(advt_fee);  
        dm.setVat(vat);
        dm.setComs_rate(coms_rate);
        dm.setComs(coms);
        dm.setAgn(agn);
        dm.setSlcrg_pers(slcrg_pers);
        dm.setMedi_cd(medi_cd);
        dm.setComs_vat(coms_vat);
     	
        dm.print();

        try {
        	AdRes1900DAO	dao = new AdRes1900DAO();
            ds = dao.ad_res_1930_a(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        } 
//        
//        AdRes1900EJBHome home = (AdRes1900EJBHome) JNDIManager.getInstance().getHome("AdRes1900EJB");
//        try {
//        	AdRes1900EJB ejb = home.create();
//            ds = ejb.ad_res_1930_a(dm);
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
    public void ad_res_1940_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	AD_RES_1940_LDataSet ds = null;

    	String cmpy_cd    	= Util.getSessionParameterValue(req, "cmpycd", true);
        String yymm 		= Util.checkString(req.getParameter("yymm"));

        // DM Setting
    	AD_RES_1940_LDM dm = new AD_RES_1940_LDM();
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setYymm(yymm);
     	
        dm.print();

        try {
        	AdRes1900DAO	dao = new AdRes1900DAO();
            ds = dao.ad_res_1940_l(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        } 
//        
//        AdRes1900EJBHome home = (AdRes1900EJBHome) JNDIManager.getInstance().getHome("AdRes1900EJB");
//        try {
//        	AdRes1900EJB ejb = home.create();
//            ds = ejb.ad_res_1940_l(dm);
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

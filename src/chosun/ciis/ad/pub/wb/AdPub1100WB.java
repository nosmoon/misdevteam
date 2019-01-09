/***************************************************************************************************
* 파일명 : AdPub1100WB.java
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

package chosun.ciis.ad.pub.wb;

import java.util.Hashtable;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.util.Util;
import chosun.ciis.ad.pub.dao.AdPub1100DAO;
import chosun.ciis.ad.pub.dm.AD_PUB_1100_MDM;
import chosun.ciis.ad.pub.dm.AD_PUB_1110_LDM;
import chosun.ciis.ad.pub.dm.AD_PUB_1115_LDM;
import chosun.ciis.ad.pub.dm.AD_PUB_1120_ADM;
import chosun.ciis.ad.pub.dm.AD_PUB_1125_ADM;
import chosun.ciis.ad.pub.dm.AD_PUB_1150_MDM;
import chosun.ciis.ad.pub.dm.AD_PUB_1160_SDM;
import chosun.ciis.ad.pub.dm.AD_PUB_1165_ADM;
import chosun.ciis.ad.pub.ds.AD_PUB_1100_MDataSet;
import chosun.ciis.ad.pub.ds.AD_PUB_1110_LDataSet;
import chosun.ciis.ad.pub.ds.AD_PUB_1115_LDataSet;
import chosun.ciis.ad.pub.ds.AD_PUB_1120_ADataSet;
import chosun.ciis.ad.pub.ds.AD_PUB_1125_ADataSet;
import chosun.ciis.ad.pub.ds.AD_PUB_1150_MDataSet;
import chosun.ciis.ad.pub.ds.AD_PUB_1160_SDataSet;
import chosun.ciis.ad.pub.ds.AD_PUB_1165_ADataSet;
import chosun.ciis.co.base.wb.BaseWB;
/**
 * 
 */

public class AdPub1100WB extends BaseWB {


    /**
     * 
     *
     * @param req HttpServletRequest
     * @param pub HttpServletResponse
     * @throws AppException
     */
    public void ad_pub_1100_m(HttpServletRequest req, HttpServletResponse pub) throws   AppException {
    	
    	AD_PUB_1100_MDataSet ds = null;

    	String cmpy_cd    	= 	Util.getSessionParameterValue(req, "cmpycd", true);

        // DM Setting
    	AD_PUB_1100_MDM dm = new AD_PUB_1100_MDM();
    	dm.setCmpy_cd(cmpy_cd);
    	

        try {
        	AdPub1100DAO	dao = new AdPub1100DAO();
            ds = dao.ad_pub_1100_m(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        }  
//        
//        AdPub1100EJBHome home = (AdPub1100EJBHome) JNDIManager.getInstance().getHome("AdPub1100EJB");
//        try {
//        	AdPub1100EJB ejb = home.create();
//            ds = ejb.ad_pub_1100_m(dm);
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
    public void ad_pub_1110_l(HttpServletRequest req, HttpServletResponse pub) throws   AppException {
    	
    	AD_PUB_1110_LDataSet ds = null;

    	String cmpy_cd    	= Util.getSessionParameterValue(req, "cmpycd", true);
    	String medi_cd 		= Util.checkString(req.getParameter("medi_cd"));
    	String proc_dt 		= Util.checkString(req.getParameter("proc_dt"));
    	String hndl_clsf 	= Util.checkString(req.getParameter("hndl_clsf"));
    	String hndl_plac_cd 	= Util.checkString(req.getParameter("hndl_plac_cd"));
    	String slcrg_pers = Util.checkString(req.getParameter("slcrg_pers"));
    	String mchrg_pers = Util.checkString(req.getParameter("mchrg_pers"));

        // DM Setting
    	AD_PUB_1110_LDM dm = new AD_PUB_1110_LDM();    
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setMedi_cd(medi_cd);
    	dm.setProc_dt(proc_dt);
    	dm.setHndl_clsf(hndl_clsf);
    	dm.setHndl_plac_cd(hndl_plac_cd);
    	dm.setSlcrg_pers(slcrg_pers);
    	dm.setMchrg_pers(mchrg_pers);
    	

        try {
        	AdPub1100DAO	dao = new AdPub1100DAO();
            ds = dao.ad_pub_1110_l(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        }  
//        
//        AdPub1100EJBHome home = (AdPub1100EJBHome) JNDIManager.getInstance().getHome("AdPub1100EJB");
//        try {
//        	AdPub1100EJB ejb = home.create();
//            ds = ejb.ad_pub_1110_l(dm);
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
    public void ad_pub_1115_l(HttpServletRequest req, HttpServletResponse pub) throws   AppException {
    	
    	AD_PUB_1115_LDataSet ds = null;

    	String cmpy_cd    	= Util.getSessionParameterValue(req, "cmpycd", true);
    	String medi_cd 		= Util.checkString(req.getParameter("medi_cd"));
    	String proc_dt 		= Util.checkString(req.getParameter("proc_dt"));
    	String hndl_clsf 	= Util.checkString(req.getParameter("hndl_clsf"));
    	String hndl_plac_cd 	= Util.checkString(req.getParameter("hndl_plac_cd"));
    	String slcrg_pers = Util.checkString(req.getParameter("slcrg_pers"));
    	String mchrg_pers = Util.checkString(req.getParameter("mchrg_pers"));

        // DM Setting
    	AD_PUB_1115_LDM dm = new AD_PUB_1115_LDM();    
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setMedi_cd(medi_cd);
    	dm.setProc_dt(proc_dt);
    	dm.setHndl_clsf(hndl_clsf);
    	dm.setHndl_plac_cd(hndl_plac_cd);
    	dm.setSlcrg_pers(slcrg_pers);
    	dm.setMchrg_pers(mchrg_pers);

        try {
        	AdPub1100DAO	dao = new AdPub1100DAO();
            ds = dao.ad_pub_1115_l(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        }  
//        
//        AdPub1100EJBHome home = (AdPub1100EJBHome) JNDIManager.getInstance().getHome("AdPub1100EJB");
//        try {
//        	AdPub1100EJB ejb = home.create();
//            ds = ejb.ad_pub_1115_l(dm);
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
    public void ad_pub_1120_a(HttpServletRequest req, HttpServletResponse pub) throws   AppException {
    	
    	AD_PUB_1120_ADataSet ds = null;

    	String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);
    	String flag		  = Util.checkString(req.getParameter("flag"));
    	String medi_cd 	  = Util.checkString(req.getParameter("medi_cd"));
    	String proc_dt 	  = Util.checkString(req.getParameter("proc_dt"));
    	String pubc_dt 	  = Util.checkString(req.getParameter("pubc_dt"));
    	String hndl_clsf  = Util.checkString(req.getParameter("hndl_clsf"));
    	String hndl_plac_cd = Util.checkString(req.getParameter("hndl_plac_cd"));
    	String slcrg_pers = Util.checkString(req.getParameter("slcrg_pers"));
    	String mchrg_pers = Util.checkString(req.getParameter("mchrg_pers"));
    	String fee_rate = Util.checkString(req.getParameter("fee_rate"));
    	
    	String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
    	
    	Hashtable hash = getHashMultiUpdateData(multiUpdateData);      	

    	String seq 			= Util.checkString((String)hash.get("seq"));
    	String advt_cont 	= Util.checkString((String)hash.get("advt_cont"));
    	String dlco_no 		= Util.checkString((String)hash.get("dlco_no"));
    	String pubc_side 	= Util.checkString((String)hash.get("pubc_side"));
    	String coms_rate 		= Util.checkString((String)hash.get("coms_rate"));
    	String sect_nm 		= Util.checkString((String)hash.get("sect_nm"));
    	String arow 		= Util.checkString((String)hash.get("arow"));
    	String uprc 		= Util.checkString((String)hash.get("uprc"));
    	String advt_fee 	= Util.checkString((String)hash.get("advt_fee"));
    	String vat 			= Util.checkString((String)hash.get("vat"));
    	String guid_sec_kind_cd = Util.checkString((String)hash.get("guid_sec_kind_cd"));
    	String pubc_slip_no = Util.checkString((String)hash.get("pubc_slip_no"));
    	String pubc_occr_dt = Util.checkString((String)hash.get("pubc_occr_dt"));
    	String pubc_occr_seq = Util.checkString((String)hash.get("pubc_occr_seq"));
    	
    	String incmg_pers	 = Util.getSessionParameterValue(req, "emp_no", true);
    	String incmg_pers_ip = req.getRemoteAddr();    	

    	String sect_cd  = "";
    	String sect_seq = "";
    	
    	if("110".equals(medi_cd)){
	    	try{
	    		sect_cd  = sect_nm.substring(0,1);
	    		sect_seq = sect_nm.substring(1);    		
	    	}catch(Exception ignore){}
    	}else{
//    		sect_cd 	= sect_nm;
    		sect_seq	= sect_nm;
    	}
    	
        // DM Setting
    	AD_PUB_1120_ADM dm = new AD_PUB_1120_ADM();

    	dm.setFlag(flag);
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setHndl_clsf(hndl_clsf);
    	dm.setProc_dt(proc_dt);
    	dm.setMedi_cd(medi_cd);
    	dm.setPubc_dt(pubc_dt);
    	dm.setHndl_plac_cd(hndl_plac_cd);
    	dm.setSlcrg_pers(slcrg_pers);  
    	dm.setMchrg_pers(mchrg_pers);
    	dm.setFee_rate(fee_rate);
    	dm.setSeq(seq);
    	dm.setAdvt_cont(advt_cont);  
    	dm.setDlco_no(dlco_no);
    	dm.setPubc_side(pubc_side);
    	dm.setComs_rate(coms_rate);
    	dm.setSect_nm(sect_nm);
    	dm.setArow(arow);
    	dm.setUprc(uprc);
    	dm.setAdvt_fee(advt_fee);
    	dm.setVat(vat);
    	dm.setGuid_sec_kind_cd(guid_sec_kind_cd);
    	dm.setPubc_slip_no(pubc_slip_no);
    	dm.setPubc_occr_dt(pubc_occr_dt);
    	dm.setPubc_occr_seq(pubc_occr_seq);
    	dm.setIncmg_pers_ip(incmg_pers_ip);
    	dm.setIncmg_pers(incmg_pers);
    	
    	dm.print();
        
        try {
        	AdPub1100DAO	dao = new AdPub1100DAO();
            ds = dao.ad_pub_1120_a(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        }  
//        
//        AdPub1100EJBHome home = (AdPub1100EJBHome) JNDIManager.getInstance().getHome("AdPub1100EJB");
//        try {
//        	AdPub1100EJB ejb = home.create();
//            ds = ejb.ad_pub_1120_a(dm);
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
    public void ad_pub_1125_a(HttpServletRequest req, HttpServletResponse pub) throws   AppException {
    	
    	AD_PUB_1125_ADataSet ds = null;

    	String cmpy_cd    	= Util.getSessionParameterValue(req, "cmpycd", true);
    	String flag		  	= Util.checkString(req.getParameter("flag"));
    	String medi_cd 	  	= Util.checkString(req.getParameter("medi_cd"));
    	String proc_dt 	  	= Util.checkString(req.getParameter("proc_dt"));
    	String pubc_dt 	  	= Util.checkString(req.getParameter("pubc_dt"));
    	String slcrg_pers 	= Util.checkString(req.getParameter("slcrg_pers"));
    	String mchrg_pers 	= Util.checkString(req.getParameter("mchrg_pers"));
    	String fee_rate 	= Util.checkString(req.getParameter("fee_rate"));
    	
    	String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
    	
    	Hashtable hash = getHashMultiUpdateData(multiUpdateData);      	

    	String advt_cont 	= Util.checkString((String)hash.get("advt_cont"));
    	String dlco_no 		= Util.checkString((String)hash.get("dlco_no"));
    	String pubc_side 	= Util.checkString((String)hash.get("pubc_side"));
    	String coms_rate 		= Util.checkString((String)hash.get("coms_rate"));
    	String sect_nm 		= Util.checkString((String)hash.get("sect_nm"));
    	String arow 		= Util.checkString((String)hash.get("arow"));
    	String uprc 		= Util.checkString((String)hash.get("uprc"));
    	String advt_fee 	= Util.checkString((String)hash.get("advt_fee"));
    	String vat 			= Util.checkString((String)hash.get("vat"));
    	String guid_sec_kind_cd = Util.checkString((String)hash.get("guid_sec_kind_cd"));
    	String preng_occr_dt = Util.checkString((String)hash.get("preng_occr_dt"));
    	String preng_occr_seq = Util.checkString((String)hash.get("preng_occr_seq"));
    	
    	String incmg_pers	 = Util.getSessionParameterValue(req, "emp_no", true);
    	String incmg_pers_ip = req.getRemoteAddr();    	

        // DM Setting
    	AD_PUB_1125_ADM dm = new AD_PUB_1125_ADM();

    	dm.setFlag(flag);
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setMedi_cd(medi_cd);
    	dm.setProc_dt(proc_dt);
    	dm.setPubc_dt(pubc_dt);
    	dm.setSlcrg_pers(slcrg_pers);
    	dm.setMchrg_pers(mchrg_pers);
    	dm.setFee_rate(fee_rate);
    	dm.setAdvt_cont(advt_cont);
    	dm.setDlco_no(dlco_no);
    	dm.setPubc_side(pubc_side);
    	dm.setComs_rate(coms_rate);
    	dm.setSect_nm(sect_nm);
    	dm.setArow(arow);
    	dm.setUprc(uprc);
    	dm.setAdvt_fee(advt_fee);
    	dm.setVat(vat);
    	dm.setGuid_sec_kind_cd(guid_sec_kind_cd);
    	dm.setPreng_occr_dt(preng_occr_dt);
    	dm.setPreng_occr_seq(preng_occr_seq);
    	dm.setIncmg_pers_ip(incmg_pers_ip);
    	dm.setIncmg_pers(incmg_pers);
    	
    	dm.print();

        try {
        	AdPub1100DAO	dao = new AdPub1100DAO();
            ds = dao.ad_pub_1125_a(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        }  
//        
//        AdPub1100EJBHome home = (AdPub1100EJBHome) JNDIManager.getInstance().getHome("AdPub1100EJB");
//        try {
//        	AdPub1100EJB ejb = home.create();
//            ds = ejb.ad_pub_1125_a(dm);
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
    public void ad_pub_1150_m(HttpServletRequest req, HttpServletResponse pub) throws   AppException {
    	
    	AD_PUB_1150_MDataSet ds = null;

    	String cmpy_cd    	= 	Util.getSessionParameterValue(req, "cmpycd", true);

        // DM Setting
    	AD_PUB_1150_MDM dm = new AD_PUB_1150_MDM();
    	dm.setCmpy_cd(cmpy_cd);

        try {
        	AdPub1100DAO	dao = new AdPub1100DAO();
            ds = dao.ad_pub_1150_m(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        }  
//        
//        AdPub1100EJBHome home = (AdPub1100EJBHome) JNDIManager.getInstance().getHome("AdPub1100EJB");
//        try {
//        	AdPub1100EJB ejb = home.create();
//            ds = ejb.ad_pub_1150_m(dm);
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
    public void ad_pub_1160_s(HttpServletRequest req, HttpServletResponse pub) throws   AppException {
    	
    	AD_PUB_1160_SDataSet ds = null;

    	String cmpy_cd    	 = 	Util.getSessionParameterValue(req, "cmpycd", true);
    	String medi_cd 		 = Util.checkString(req.getParameter("medi_cd"));
    	String proc_dt = Util.checkString(req.getParameter("proc_dt"));
    	String proc_seq = Util.checkString(req.getParameter("proc_seq"));

        // DM Setting
    	AD_PUB_1160_SDM dm = new AD_PUB_1160_SDM();
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setMedi_cd(medi_cd);
    	dm.setProc_dt(proc_dt);
    	dm.setProc_seq(proc_seq);
    	

        try {
        	AdPub1100DAO	dao = new AdPub1100DAO();
            ds = dao.ad_pub_1160_s(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        }  
//        
//        AdPub1100EJBHome home = (AdPub1100EJBHome) JNDIManager.getInstance().getHome("AdPub1100EJB");
//        try {
//        	AdPub1100EJB ejb = home.create();
//            ds = ejb.ad_pub_1160_s(dm);  
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
    public void ad_pub_1165_a(HttpServletRequest req, HttpServletResponse pub) throws   AppException {
    	
    	AD_PUB_1165_ADataSet ds = null;

    	String cmpy_cd    	 = 	Util.getSessionParameterValue(req, "cmpycd", true);
    	String incmg_pers	 = 	Util.getSessionParameterValue(req, "emp_no", true);
    	String incmg_pers_ip = 	req.getRemoteAddr();
    	
    	String medi_cd 		 = Util.checkString(req.getParameter("medi_cd"));
    	String flag 		= Util.checkString(req.getParameter("flag"));
    	String proc_dt 		= Util.checkString(req.getParameter("proc_dt"));
    	String pubc_occr_seq = Util.checkString(req.getParameter("pubc_occr_seq"));
    	String pubc_occr_dt = Util.checkString(req.getParameter("pubc_occr_dt"));
    	String hndl_clsf = Util.checkString(req.getParameter("hndl_clsf"));
    	String dlco_no = Util.checkString(req.getParameter("dlco_no"));
    	String advt_cont = Util.checkString(req.getParameter("advt_cont"));
    	String sect_nm = Util.checkString(req.getParameter("sect_nm"));
    	String uprc = Util.checkString(req.getParameter("uprc"));
    	String arow = Util.checkString(req.getParameter("arow"));
    	String advt_fee = Util.checkString(req.getParameter("advt_fee"));
    	String vat = Util.checkString(req.getParameter("vat"));
    	String pubc_tot_amt = Util.checkString(req.getParameter("pubc_tot_amt"));
    	String hndl_plac_cd = Util.checkString(req.getParameter("hndl_plac_cd"));
    	String coms_rate = Util.checkString(req.getParameter("coms_rate"));
    	String coms = Util.checkString(req.getParameter("coms"));
    	String slcrg_pers = Util.checkString(req.getParameter("slcrg_pers"));
    	String dept_cd = Util.checkString(req.getParameter("dept_cd"));
    	String mchrg_pers = Util.checkString(req.getParameter("mchrg_pers"));
    	String upd_resn = Util.checkString(req.getParameter("upd_resn"));
    	String upd_cont = Util.checkString(req.getParameter("upd_cont"));
    	String pubc_side = Util.checkString(req.getParameter("pubc_side"));
    	String guid_sec_kind_cd = Util.checkString(req.getParameter("guid_sec_kind_cd"));


    	String sect_cd  = "";
    	String sect_seq = "";
    	
    	if("110".equals(medi_cd)){
	    	try{
	    		sect_cd  = sect_nm.substring(0,1);
	    		sect_seq = sect_nm.substring(1);    		
	    	}catch(Exception ignore){}
    	}else{
    		sect_seq	= sect_nm;
    	}
    	
        // DM Setting
    	AD_PUB_1165_ADM dm = new AD_PUB_1165_ADM();
    	dm.setFlag(flag);
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setMedi_cd(medi_cd);
    	dm.setProc_dt(proc_dt);
    	dm.setPubc_occr_seq(pubc_occr_seq);
    	dm.setPubc_occr_dt(pubc_occr_dt);
    	dm.setHndl_clsf(hndl_clsf);
    	dm.setDlco_no(dlco_no);
    	dm.setAdvt_cont(advt_cont);
    	dm.setSect_cd(sect_cd);
    	dm.setSect_seq(sect_seq);
    	dm.setUprc(uprc);
    	dm.setArow(arow);
    	dm.setAdvt_fee(advt_fee);
    	dm.setVat(vat);
    	dm.setPubc_tot_amt(pubc_tot_amt);
    	dm.setHndl_plac_cd(hndl_plac_cd);
    	dm.setComs_rate(coms_rate);
    	dm.setComs(coms);
    	dm.setSlcrg_pers(slcrg_pers);
    	dm.setDept_cd(dept_cd);
    	dm.setMchrg_pers(mchrg_pers);
    	dm.setUpd_resn(upd_resn);
    	dm.setUpd_cont(upd_cont);
    	dm.setPubc_side(pubc_side);
    	dm.setGuid_sec_kind_cd(guid_sec_kind_cd);
    	dm.setIncmg_pers_ip(incmg_pers_ip);
    	dm.setIncmg_pers(incmg_pers);
    	
    	dm.print();

        try {
        	AdPub1100DAO	dao = new AdPub1100DAO();
            ds = dao.ad_pub_1165_a(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        }  
//        
//        AdPub1100EJBHome home = (AdPub1100EJBHome) JNDIManager.getInstance().getHome("AdPub1100EJB");
//        try {
//        	AdPub1100EJB ejb = home.create();
//            ds = ejb.ad_pub_1165_a(dm);  
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

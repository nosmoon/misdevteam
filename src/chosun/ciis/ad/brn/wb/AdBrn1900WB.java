/***************************************************************************************************
* 파일명 : AdBrn1900WB.java
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

package chosun.ciis.ad.brn.wb;

import java.util.Hashtable;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.util.Util;
import chosun.ciis.ad.brn.dao.AdBrn1900DAO;
import chosun.ciis.ad.brn.dm.AD_BRN_1900_MDM;
import chosun.ciis.ad.brn.dm.AD_BRN_1910_LDM;
import chosun.ciis.ad.brn.dm.AD_BRN_1920_ADM;
import chosun.ciis.ad.brn.ds.AD_BRN_1900_MDataSet;
import chosun.ciis.ad.brn.ds.AD_BRN_1910_LDataSet;
import chosun.ciis.ad.brn.ds.AD_BRN_1920_ADataSet;
import chosun.ciis.co.base.wb.BaseWB;
/**
 * 
 */

public class AdBrn1900WB extends BaseWB {


	public static final String PRENG_ADVT_BO = "00038160";
    /**
     * 
     *
     * @param req HttpServletRequest
     * @param pub HttpServletResponse
     * @throws AppException
     */
	public void ad_brn_1900_m(HttpServletRequest req, HttpServletResponse res) throws   AppException {
		
		AD_BRN_1900_MDataSet ds = null;
	
		String cmpy_cd    		= Util.getSessionParameterValue(req, "cmpycd", true);
		String preng_advt_bo 	= Util.getSessionParameterValue(req, "emp_no", true);
	    if("209001".equals(preng_advt_bo))	preng_advt_bo = PRENG_ADVT_BO;
	    
	    // DM Setting
		AD_BRN_1900_MDM dm = new AD_BRN_1900_MDM();
		dm.setCmpy_cd(cmpy_cd);
		dm.setPreng_advt_bo(preng_advt_bo);
	    
		//dm.print();
        try {
        	AdBrn1900DAO dao = new AdBrn1900DAO();
            ds = dao.ad_brn_1900_m(dm);
            req.setAttribute("ds", ds);
        }  
        catch (AppException e) {
            throw e;
        }  
//        
//	    AdBrn1900EJBHome home = (AdBrn1900EJBHome) JNDIManager.getInstance().getHome("AdBrn1900EJB");
//	    try {
//	    	AdBrn1900EJB ejb = home.create();
//	        ds = ejb.ad_brn_1900_m(dm);
//	        req.setAttribute("ds", ds);
//	    }
//	    catch (CreateException e) {
//	        SysException se = new SysException(e);
//	        LogManager.getInstance().log(se);
//	        throw se;
//	    }
//	    catch (RemoteException e) {
//	        SysException se = new SysException(e);
//	        LogManager.getInstance().log(se);
//	        throw se;
//	    }
	}    	
    
    /**
     * 
     *
     * @param req HttpServletRequest
     * @param pub HttpServletResponse
     * @throws AppException
     */
    public void ad_brn_1910_l(HttpServletRequest req, HttpServletResponse pub) throws   AppException {
    	
    	AD_BRN_1910_LDataSet ds = null;

    	String cmpy_cd    		= Util.getSessionParameterValue(req, "cmpycd", true);

        String preng_advt_bo 	= Util.getSessionParameterValue(req, "emp_no", true);
        if("209001".equals(preng_advt_bo))	preng_advt_bo = PRENG_ADVT_BO;
        
        String medi_cd 			= Util.checkString(req.getParameter("medi_cd"));
        String preng_occr_dt 	= Util.checkString(req.getParameter("preng_occr_dt"));
        String hndl_clsf 		= Util.checkString(req.getParameter("hndl_clsf"));

        // DM Setting
    	AD_BRN_1910_LDM dm = new AD_BRN_1910_LDM();    
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setPreng_advt_bo(preng_advt_bo);
    	dm.setMedi_cd(medi_cd);
    	dm.setPreng_occr_dt(preng_occr_dt);
    	dm.setHndl_clsf(hndl_clsf);
    	
    	dm.print();
        try {
        	AdBrn1900DAO dao = new AdBrn1900DAO();
            ds = dao.ad_brn_1910_l(dm);
            req.setAttribute("ds", ds);
        }  
        catch (AppException e) {
            throw e;
        }  
//        
//        AdBrn1900EJBHome home = (AdBrn1900EJBHome) JNDIManager.getInstance().getHome("AdBrn1900EJB");
//        try {
//        	AdBrn1900EJB ejb = home.create();
//            ds = ejb.ad_brn_1910_l(dm);
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
    public void ad_brn_1920_a(HttpServletRequest req, HttpServletResponse pub) throws   AppException {
    	
    	AD_BRN_1920_ADataSet ds = null;

    	String cmpy_cd    		=	Util.getSessionParameterValue(req, "cmpycd", true);

        String preng_advt_bo 	= Util.getSessionParameterValue(req, "emp_no", true);
        if("209001".equals(preng_advt_bo))	preng_advt_bo = PRENG_ADVT_BO;
        
    	String flag		 		= 	Util.checkString(req.getParameter("flag"));
    	String medi_cd 	  		= 	Util.checkString(req.getParameter("medi_cd"));
    	String pubc_dt 	  		= 	Util.checkString(req.getParameter("pubc_dt"));  
    	String preng_occr_dt 	= 	Util.checkString(req.getParameter("preng_occr_dt"));
    	String hndl_clsf 	 	= 	Util.checkString(req.getParameter("hndl_clsf"));
    	String hndl_plac_cd 	= 	Util.checkString(req.getParameter("hndl_plac_cd"));
    	String slcrg_pers 		= 	Util.checkString(req.getParameter("slcrg_pers"));
    	String mchrg_pers 		= 	Util.checkString(req.getParameter("mchrg_pers"));
    	String fee_rate 		= 	Util.checkString(req.getParameter("fee_rate"));
    	
    	String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
    	
    	Hashtable hash = getHashMultiUpdateData(multiUpdateData);      	

    	String bo_chrg_aprv		= Util.checkString((String)hash.get("bo_chrg_aprv"));
    	String preng_occr_seq	= Util.checkString((String)hash.get("preng_occr_seq"));
    	String advt_cont 		= Util.checkString((String)hash.get("advt_cont"));
    	String dlco_no 			= Util.checkString((String)hash.get("dlco_no"));
    	String pubc_side 		= Util.checkString((String)hash.get("pubc_side"));
    	String sect_nm 			= Util.checkString((String)hash.get("sect_nm"));
    	String arow 			= Util.checkString((String)hash.get("arow"));
    	String uprc 			= Util.checkString((String)hash.get("uprc"));
    	String advt_fee 		= Util.checkString((String)hash.get("advt_fee"));
    	String vat 				= Util.checkString((String)hash.get("vat"));
    	String guid_sec_kind_cd = Util.checkString((String)hash.get("guid_sec_kind_cd"));
    	
    	String incmg_pers	 	= preng_advt_bo;//Util.getSessionParameterValue(req, "emp_no", true);
    	String incmg_pers_ip 	= req.getRemoteAddr();    	

        // DM Setting
    	AD_BRN_1920_ADM dm = new AD_BRN_1920_ADM();

    	dm.setFlag(flag);
    	dm.setPreng_advt_bo(preng_advt_bo);
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setHndl_clsf(hndl_clsf);
    	dm.setPreng_occr_dt(preng_occr_dt);
    	dm.setMedi_cd(medi_cd);
    	dm.setPubc_dt(pubc_dt);
    	dm.setHndl_plac_cd(hndl_plac_cd);
    	dm.setSlcrg_pers(slcrg_pers);
    	dm.setMchrg_pers(mchrg_pers);
    	dm.setFee_rate(fee_rate);
    	dm.setBo_chrg_aprv(bo_chrg_aprv);
    	dm.setPreng_occr_seq(preng_occr_seq);
    	dm.setAdvt_cont(advt_cont);
    	dm.setDlco_no(dlco_no);
    	dm.setPubc_side(pubc_side);
    	dm.setSect_nm(sect_nm);
    	dm.setArow(arow);
    	dm.setUprc(uprc);
    	dm.setAdvt_fee(advt_fee);
    	dm.setVat(vat);
    	dm.setGuid_sec_kind_cd(guid_sec_kind_cd);
    	dm.setIncmg_pers_ip(incmg_pers_ip);
    	dm.setIncmg_pers(incmg_pers);
    	
//    	dm.print();

        try {
        	AdBrn1900DAO dao = new AdBrn1900DAO();
            ds = dao.ad_brn_1920_a(dm);
            req.setAttribute("ds", ds);
        }  
        catch (AppException e) {
            throw e;
        }  
//        
//        AdBrn1900EJBHome home = (AdBrn1900EJBHome) JNDIManager.getInstance().getHome("AdBrn1900EJB");
//        try {
//        	AdBrn1900EJB ejb = home.create();
//            ds = ejb.ad_brn_1920_a(dm);
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

/***************************************************************************************************
* 파일명 : AdBrn1600WB.java
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

package chosun.ciis.ad.brn.wb;

import java.util.Hashtable;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.util.Util;
import chosun.ciis.ad.brn.dao.AdBrn1600DAO;
import chosun.ciis.ad.brn.dm.AD_BRN_1600_MDM;
import chosun.ciis.ad.brn.dm.AD_BRN_1610_LDM;
import chosun.ciis.ad.brn.dm.AD_BRN_1620_SDM;
import chosun.ciis.ad.brn.dm.AD_BRN_1630_LDM;
import chosun.ciis.ad.brn.dm.AD_BRN_1650_ADM;
import chosun.ciis.ad.brn.ds.AD_BRN_1600_MDataSet;
import chosun.ciis.ad.brn.ds.AD_BRN_1610_LDataSet;
import chosun.ciis.ad.brn.ds.AD_BRN_1620_SDataSet;
import chosun.ciis.ad.brn.ds.AD_BRN_1630_LDataSet;
import chosun.ciis.ad.brn.ds.AD_BRN_1650_ADataSet;
import chosun.ciis.co.base.wb.BaseWB;
/**
 * 
 */

public class AdBrn1600WB extends BaseWB {
	
	public static final String PRENG_ADVT_BO = "00038160";
	/**
	 * 
	 *
	 * @param req HttpServletRequest
	 * @param res HttpServletResponse
	 * @throws AppException
	 */
	public void ad_brn_1600_m(HttpServletRequest req, HttpServletResponse res) throws   AppException {
		
		AD_BRN_1600_MDataSet ds = null;
	
		String cmpy_cd    		= Util.getSessionParameterValue(req, "cmpycd", true);
	
	    // DM Setting
		AD_BRN_1600_MDM dm = new AD_BRN_1600_MDM();
		dm.setCmpy_cd(cmpy_cd);
	    

        try {
        	AdBrn1600DAO dao = new AdBrn1600DAO();
            ds = dao.ad_brn_1600_m(dm);
            req.setAttribute("ds", ds);
        }  
        catch (AppException e) {
            throw e;
        }  
//        
//	    AdBrn1600EJBHome home = (AdBrn1600EJBHome) JNDIManager.getInstance().getHome("AdBrn1600EJB");
//	    try {
//	    	AdBrn1600EJB ejb = home.create();
//	        ds = ejb.ad_brn_1600_m(dm);
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
	 * @param res HttpServletResponse
	 * @throws AppException
	 */
	public void ad_brn_1610_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
		
		AD_BRN_1610_LDataSet ds = null;
	
		String cmpy_cd    		= Util.getSessionParameterValue(req, "cmpycd", true);

        String preng_advt_bo 	= Util.getSessionParameterValue(req, "emp_no", true);
        if("209001".equals(preng_advt_bo))	preng_advt_bo = PRENG_ADVT_BO;
        
		String medi_cd 			= Util.checkString(req.getParameter("medi_cd"));
		String frdt 			= Util.checkString(req.getParameter("frdt"));
		String todt 			= Util.checkString(req.getParameter("todt"));
		String icdc_clsf 		= Util.checkString(req.getParameter("icdc_clsf"));
		String dlco_no 			= Util.checkString(req.getParameter("dlco_no"));
	
	    // DM Setting
		AD_BRN_1610_LDM dm = new AD_BRN_1610_LDM();
		dm.setCmpy_cd(cmpy_cd);
		dm.setPreng_advt_no(preng_advt_bo);
		dm.setMedi_cd(medi_cd);
		dm.setFrdt(frdt);
		dm.setTodt(todt);
		dm.setIcdc_clsf(icdc_clsf);
		dm.setDlco_no(dlco_no);


        try {
        	AdBrn1600DAO dao = new AdBrn1600DAO();
            ds = dao.ad_brn_1610_l(dm);
            req.setAttribute("ds", ds);
        }  
        catch (AppException e) {
            throw e;
        }  
//        
//	    AdBrn1600EJBHome home = (AdBrn1600EJBHome) JNDIManager.getInstance().getHome("AdBrn1600EJB");
//	    try {
//	    	AdBrn1600EJB ejb = home.create();
//	        ds = ejb.ad_brn_1610_l(dm);
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
	 * @param res HttpServletResponse
	 * @throws AppException
	 */
	public void ad_brn_1620_s(HttpServletRequest req, HttpServletResponse res) throws   AppException {
		
		AD_BRN_1620_SDataSet ds = null;
	
		String cmpy_cd    		= Util.getSessionParameterValue(req, "cmpycd", true);
        
		String preng_advt_bo 	= Util.getSessionParameterValue(req, "emp_no", true);
        if("202041".equals(preng_advt_bo))	preng_advt_bo = PRENG_ADVT_BO;
        
		String medi_cd 			= Util.checkString(req.getParameter("medi_cd"));
		String seq 				= Util.checkString(req.getParameter("seq"));
	
	    // DM Setting
		AD_BRN_1620_SDM dm = new AD_BRN_1620_SDM();
		dm.setCmpy_cd(cmpy_cd);
		dm.setPreng_advt_bo(preng_advt_bo);
		dm.setMedi_cd(medi_cd);
		dm.setSeq(seq);
	    

        try {
        	AdBrn1600DAO dao = new AdBrn1600DAO();
            ds = dao.ad_brn_1620_s(dm);
            req.setAttribute("ds", ds);
        }  
        catch (AppException e) {
            throw e;
        }  
//        
//	    AdBrn1600EJBHome home = (AdBrn1600EJBHome) JNDIManager.getInstance().getHome("AdBrn1600EJB");
//	    try {
//	    	AdBrn1600EJB ejb = home.create();
//	        ds = ejb.ad_brn_1620_s(dm);
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
	 * @param res HttpServletResponse
	 * @throws AppException
	 */
	public void ad_brn_1630_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
		
		AD_BRN_1630_LDataSet ds = null;
	
		String cmpy_cd    		= Util.getSessionParameterValue(req, "cmpycd", true);
		String medi_cd 			= Util.checkString(req.getParameter("medi_cd"));
		String frdt 			= Util.checkString(req.getParameter("frdt"));
		String todt 			= Util.checkString(req.getParameter("todt"));
		String dlco_no 			= Util.checkString(req.getParameter("dlco_no"));
		String search_mode 			= Util.checkString(req.getParameter("search_mode"));
        
		String preng_advt_bo 	= Util.getSessionParameterValue(req, "emp_no", true);
        if("202041".equals(preng_advt_bo))	preng_advt_bo = PRENG_ADVT_BO;
        
		
	    // DM Setting
		AD_BRN_1630_LDM dm = new AD_BRN_1630_LDM();
		dm.setCmpy_cd(cmpy_cd);
		dm.setMedi_cd(medi_cd);
		dm.setFrdt(frdt);
		dm.setTodt(todt);
		dm.setDlco_no(dlco_no);
		dm.setPreng_advt_bo(preng_advt_bo);
		dm.setSearch_mode(search_mode);
	    
//		//dm.print();

        try {
        	AdBrn1600DAO dao = new AdBrn1600DAO();
            ds = dao.ad_brn_1630_l(dm);
            req.setAttribute("ds", ds);
        }  
        catch (AppException e) {
            throw e;
        }  
//        
//		
//	    AdBrn1600EJBHome home = (AdBrn1600EJBHome) JNDIManager.getInstance().getHome("AdBrn1600EJB");
//	    try {
//	    	AdBrn1600EJB ejb = home.create();
//	        ds = ejb.ad_brn_1630_l(dm);
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
	 * @param res HttpServletResponse
	 * @throws AppException
	 */
	public void ad_brn_1650_a(HttpServletRequest req, HttpServletResponse res) throws   AppException {
		
		AD_BRN_1650_ADataSet ds = null;
	
		String cmpy_cd    		= Util.getSessionParameterValue(req, "cmpycd", true);
		String incmg_pers	 	= Util.getSessionParameterValue(req, "emp_no", true);
		String incmg_pers_ip 	= req.getRemoteAddr();
		String medi_cd 			= Util.checkString(req.getParameter("medi_cd"));
		String dlco_no 			= Util.checkString(req.getParameter("dlco_no"));

        String preng_advt_bo 	= Util.getSessionParameterValue(req, "emp_no", true);
        if("209001".equals(preng_advt_bo))	preng_advt_bo = PRENG_ADVT_BO;
        
		String flag = Util.checkString(req.getParameter("flag"));
		String seq = Util.checkString(req.getParameter("seq"));
		String icdc_clsf = Util.checkString(req.getParameter("icdc_clsf"));
		String upd_prv_amt = Util.checkString(req.getParameter("upd_prv_amt"));
		String upd_aft_amt = Util.checkString(req.getParameter("upd_aft_amt"));
		String icdc_amt = Util.checkString(req.getParameter("icdc_amt"));
		String resn = Util.checkString(req.getParameter("resn"));
		String make_dt = Util.checkString(req.getParameter("make_dt"));
		
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);
		
		String checked		 	= Util.checkString((String)hash.get("checked"));
		String pubc_occr_dt 	= Util.checkString((String)hash.get("pubc_occr_dt"));
		String pubc_occr_seq 	= Util.checkString((String)hash.get("pubc_occr_seq"));
		
	    // DM Setting
		AD_BRN_1650_ADM dm = new AD_BRN_1650_ADM();
		dm.setPreng_advt_bo(preng_advt_bo);
		dm.setFlag(flag);
		dm.setSeq(seq);
		dm.setCmpy_cd(cmpy_cd);
		dm.setMedi_cd(medi_cd);
		dm.setChecked(checked);
		dm.setPubc_occr_dt(pubc_occr_dt);
		dm.setPubc_occr_seq(pubc_occr_seq);
		dm.setIcdc_clsf(icdc_clsf);
		dm.setUpd_prv_amt(upd_prv_amt);
		dm.setUpd_aft_amt(upd_aft_amt);
		dm.setIcdc_amt(icdc_amt);
		dm.setResn(resn);
		dm.setDlco_no(dlco_no);
		dm.setMake_dt(make_dt);
		dm.setIncmg_pers_ip(incmg_pers_ip);
		dm.setIncmg_pers(incmg_pers);

        try {
        	AdBrn1600DAO dao = new AdBrn1600DAO();
            ds = dao.ad_brn_1650_a(dm);
            req.setAttribute("ds", ds);
        }  
        catch (AppException e) {
            throw e;
        }  
//        
//	    AdBrn1600EJBHome home = (AdBrn1600EJBHome) JNDIManager.getInstance().getHome("AdBrn1600EJB");
//	    try {
//	    	AdBrn1600EJB ejb = home.create();
//	        ds = ejb.ad_brn_1650_a(dm);
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
		
}

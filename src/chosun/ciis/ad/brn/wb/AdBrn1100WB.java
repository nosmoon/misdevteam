/***************************************************************************************************
* 파일명 : AdBrn1000WB.java
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

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.util.Util;
import chosun.ciis.ad.brn.dao.AdBrn1100DAO;
import chosun.ciis.ad.brn.dm.AD_BRN_1110_LDM;
import chosun.ciis.ad.brn.dm.AD_BRN_1120_LDM;
import chosun.ciis.ad.brn.dm.AD_BRN_1130_LDM;
import chosun.ciis.ad.brn.ds.AD_BRN_1110_LDataSet;
import chosun.ciis.ad.brn.ds.AD_BRN_1120_LDataSet;
import chosun.ciis.ad.brn.ds.AD_BRN_1130_LDataSet;
import chosun.ciis.co.base.wb.BaseWB;
/**
 * 
 */

public class AdBrn1100WB extends BaseWB {

	public static final String PRENG_ADVT_BO = "00038160";
	
	/**
	 * 
	 *
	 * @param req HttpServletRequest
	 * @param res HttpServletResponse
	 * @throws AppException
	 */
	public void ad_brn_1110_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
		
		AD_BRN_1110_LDataSet ds = null;
	
		String cmpy_cd    		= Util.getSessionParameterValue(req, "cmpycd", true);
        String preng_advt_bo 	= Util.getSessionParameterValue(req, "emp_no", true);
        if("209001".equals(preng_advt_bo))	preng_advt_bo = PRENG_ADVT_BO;
        
		String medi_cd 	= Util.checkString(req.getParameter("medi_cd"));
		String frdt 	= Util.checkString(req.getParameter("frdt"));
		String todt 	= Util.checkString(req.getParameter("todt"));
		String dlco_no 	= Util.checkString(req.getParameter("dlco_no"));
	
	    // DM Setting
		AD_BRN_1110_LDM dm = new AD_BRN_1110_LDM();
		dm.setCmpy_cd(cmpy_cd);
		dm.setPreng_advt_bo(preng_advt_bo);
		dm.setMedi_cd(medi_cd);
		dm.setFrdt(frdt);
		dm.setTodt(todt);
		dm.setDlco_no(dlco_no);
	    
	    dm.print();

        try {
        	AdBrn1100DAO dao = new AdBrn1100DAO();
            ds = dao.ad_brn_1110_l(dm);
            req.setAttribute("ds", ds);
        }  
        catch (AppException e) {
            throw e;
        }  
//        
//	    AdBrn1100EJBHome home = (AdBrn1100EJBHome) JNDIManager.getInstance().getHome("AdBrn1100EJB");
//	    try {
//	    	AdBrn1100EJB ejb = home.create();
//	        ds = ejb.ad_brn_1110_l(dm);
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
	public void ad_brn_1120_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
		
		AD_BRN_1120_LDataSet ds = null;
	
		String cmpy_cd    		= Util.getSessionParameterValue(req, "cmpycd", true);
        String preng_advt_bo 	= Util.getSessionParameterValue(req, "emp_no", true);
        if("209001".equals(preng_advt_bo))	preng_advt_bo = PRENG_ADVT_BO;
        
		String medi_cd 	= Util.checkString(req.getParameter("medi_cd"));
		String frdt 	= Util.checkString(req.getParameter("frdt"));
		String todt 	= Util.checkString(req.getParameter("todt"));
		String dlco_no 	= Util.checkString(req.getParameter("dlco_no"));
	
	    // DM Setting
		AD_BRN_1120_LDM dm = new AD_BRN_1120_LDM();
		dm.setCmpy_cd(cmpy_cd);
		dm.setPreng_advt_bo(preng_advt_bo);
		dm.setMedi_cd(medi_cd);
		dm.setFrdt(frdt);
		dm.setTodt(todt);
		dm.setDlco_no(dlco_no);
	    
		dm.print();

        try {
        	AdBrn1100DAO dao = new AdBrn1100DAO();
            ds = dao.ad_brn_1120_l(dm);
            req.setAttribute("ds", ds);
        }  
        catch (AppException e) {
            throw e;
        }  
//        
//	    AdBrn1100EJBHome home = (AdBrn1100EJBHome) JNDIManager.getInstance().getHome("AdBrn1100EJB");
//	    try {
//	    	AdBrn1100EJB ejb = home.create();
//	        ds = ejb.ad_brn_1120_l(dm);
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
	public void ad_brn_1130_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
		
		AD_BRN_1130_LDataSet ds = null;
	
		String cmpy_cd    		= Util.getSessionParameterValue(req, "cmpycd", true);
        String preng_advt_bo 	= Util.getSessionParameterValue(req, "emp_no", true);
        if("209001".equals(preng_advt_bo))	preng_advt_bo = PRENG_ADVT_BO;
        
		String frdt 	= Util.checkString(req.getParameter("frdt"));
		String todt 	= Util.checkString(req.getParameter("todt"));
		String dlco_no 	= Util.checkString(req.getParameter("dlco_no"));
	
	    // DM Setting
		AD_BRN_1130_LDM dm = new AD_BRN_1130_LDM();
		dm.setCmpy_cd(cmpy_cd);
		dm.setPreng_advt_bo(preng_advt_bo);
		dm.setFrdt(frdt);
		dm.setTodt(todt);
		dm.setDlco_no(dlco_no);
	    
		dm.print();

        try {
        	AdBrn1100DAO dao = new AdBrn1100DAO();
            ds = dao.ad_brn_1130_l(dm);
            req.setAttribute("ds", ds);
        }  
        catch (AppException e) {
            throw e;
        }  
	} 	
}

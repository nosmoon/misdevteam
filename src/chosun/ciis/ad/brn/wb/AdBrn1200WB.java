/***************************************************************************************************
* 파일명 : AdBrn1200WB.java
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
import chosun.ciis.ad.brn.dao.AdBrn1200DAO;
import chosun.ciis.ad.brn.dm.AD_BRN_1200_MDM;
import chosun.ciis.ad.brn.dm.AD_BRN_1210_LDM;
import chosun.ciis.ad.brn.ds.AD_BRN_1200_MDataSet;
import chosun.ciis.ad.brn.ds.AD_BRN_1210_LDataSet;
import chosun.ciis.co.base.wb.BaseWB;
/**
 * 
 */

public class AdBrn1200WB extends BaseWB {

	public static final String PRENG_ADVT_BO = "00038160";
	/**
	 * 
	 *
	 * @param req HttpServletRequest
	 * @param res HttpServletResponse
	 * @throws AppException
	 */
	public void ad_brn_1200_m(HttpServletRequest req, HttpServletResponse res) throws   AppException {
		
		AD_BRN_1200_MDataSet ds = null;
	
		String cmpy_cd    		= Util.getSessionParameterValue(req, "cmpycd", true);
	
	    // DM Setting
		AD_BRN_1200_MDM dm = new AD_BRN_1200_MDM();
		dm.setCmpy_cd(cmpy_cd);

        try {
        	AdBrn1200DAO dao = new AdBrn1200DAO();
            ds = dao.ad_brn_1200_m(dm);
            req.setAttribute("ds", ds);
        }  
        catch (AppException e) {
            throw e;
        }  
//        
//	    AdBrn1200EJBHome home = (AdBrn1200EJBHome) JNDIManager.getInstance().getHome("AdBrn1200EJB");
//	    try {
//	    	AdBrn1200EJB ejb = home.create();
//	        ds = ejb.ad_brn_1200_m(dm);
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
	public void ad_brn_1210_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
		
		AD_BRN_1210_LDataSet ds = null;
	
		String cmpy_cd    		= Util.getSessionParameterValue(req, "cmpycd", true);
        
		String preng_advt_bo = Util.getSessionParameterValue(req, "emp_no", true);
        if("209001".equals(preng_advt_bo))	preng_advt_bo = PRENG_ADVT_BO;
        
		String medi_cd 			= Util.checkString(req.getParameter("medi_cd"));
		String frdt 			= Util.checkString(req.getParameter("frdt"));
		String todt 			= Util.checkString(req.getParameter("todt"));
		String dlco_no 			= Util.checkString(req.getParameter("dlco_no"));
		String make_dt 			= Util.checkString(req.getParameter("make_dt"));
	
	    // DM Setting
		AD_BRN_1210_LDM dm = new AD_BRN_1210_LDM();
		dm.setCmpy_cd(cmpy_cd);
		dm.setPreng_advt_bo(preng_advt_bo);
		dm.setMedi_cd(medi_cd);
		dm.setFrdt(frdt);
		dm.setTodt(todt);
		dm.setDlco_no(dlco_no);
		dm.setMake_dt(make_dt);
	    
//		//dm.print();
        try {
        	AdBrn1200DAO dao = new AdBrn1200DAO();
            ds = dao.ad_brn_1210_l(dm);
            req.setAttribute("ds", ds);
        }  
        catch (AppException e) {
            throw e;
        }  
//        
//		
//	    AdBrn1200EJBHome home = (AdBrn1200EJBHome) JNDIManager.getInstance().getHome("AdBrn1200EJB");
//	    try {
//	    	AdBrn1200EJB ejb = home.create();
//	        ds = ejb.ad_brn_1210_l(dm);
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

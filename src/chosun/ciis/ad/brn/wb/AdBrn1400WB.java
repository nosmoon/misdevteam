/***************************************************************************************************
* 파일명 : AdBrn1400WB.java
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
import chosun.ciis.ad.brn.dao.AdBrn1400DAO;
import chosun.ciis.ad.brn.dm.AD_BRN_1400_MDM;
import chosun.ciis.ad.brn.dm.AD_BRN_1410_LDM;
import chosun.ciis.ad.brn.ds.AD_BRN_1400_MDataSet;
import chosun.ciis.ad.brn.ds.AD_BRN_1410_LDataSet;
import chosun.ciis.co.base.wb.BaseWB;
/**
 * 
 */

public class AdBrn1400WB extends BaseWB {

	public static final String PRENG_ADVT_BO = "00038160";
	
	/**
	 * 
	 *
	 * @param req HttpServletRequest
	 * @param res HttpServletResponse
	 * @throws AppException
	 */
	public void ad_brn_1400_m(HttpServletRequest req, HttpServletResponse res) throws   AppException {
		
		AD_BRN_1400_MDataSet ds = null;
	
		String cmpy_cd    		= Util.getSessionParameterValue(req, "cmpycd", true);
	
	    // DM Setting
		AD_BRN_1400_MDM dm = new AD_BRN_1400_MDM();
		dm.setCmpy_cd(cmpy_cd);

        try {
        	AdBrn1400DAO dao = new AdBrn1400DAO();
            ds = dao.ad_brn_1400_m(dm);
            req.setAttribute("ds", ds);
        }  
        catch (AppException e) {
            throw e;
        }  
//        
//	    AdBrn1400EJBHome home = (AdBrn1400EJBHome) JNDIManager.getInstance().getHome("AdBrn1400EJB");
//	    try {
//	    	AdBrn1400EJB ejb = home.create();
//	        ds = ejb.ad_brn_1400_m(dm);
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
	public void ad_brn_1410_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
		
		AD_BRN_1410_LDataSet ds = null;
	
		String cmpy_cd    		= Util.getSessionParameterValue(req, "cmpycd", true);
        
		String preng_advt_bo 	= Util.getSessionParameterValue(req, "emp_no", true);
        if("209001".equals(preng_advt_bo))	preng_advt_bo = PRENG_ADVT_BO;
        
		String medi_cd = Util.checkString(req.getParameter("medi_cd"));
		String dlco_no = Util.checkString(req.getParameter("dlco_no"));
		String pubc_frdt = Util.checkString(req.getParameter("pubc_frdt"));
		String pubc_todt = Util.checkString(req.getParameter("pubc_todt"));
	
	    // DM Setting
		AD_BRN_1410_LDM dm = new AD_BRN_1410_LDM();
		dm.setCmpy_cd(cmpy_cd);
		dm.setPreng_advt_bo(preng_advt_bo);
		dm.setMedi_cd(medi_cd);
		dm.setDlco_no(dlco_no);
		dm.setPubc_frdt(pubc_frdt);
		dm.setPubc_todt(pubc_todt);
		
//		//dm.print();

        try {
        	AdBrn1400DAO dao = new AdBrn1400DAO();
            ds = dao.ad_brn_1410_l(dm);
            req.setAttribute("ds", ds);
        }  
        catch (AppException e) {
            throw e;
        }  
//        
//	    AdBrn1400EJBHome home = (AdBrn1400EJBHome) JNDIManager.getInstance().getHome("AdBrn1400EJB");
//	    try {
//	    	AdBrn1400EJB ejb = home.create();
//	        ds = ejb.ad_brn_1410_l(dm);
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

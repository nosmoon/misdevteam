package chosun.ciis.ad.bas.wb;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.util.Util;
import chosun.ciis.ad.bas.dao.AdBas3300DAO;
import chosun.ciis.ad.bas.dm.AD_BAS_3310_LDM;
import chosun.ciis.ad.bas.dm.AD_BAS_3320_LDM;
import chosun.ciis.ad.bas.ds.AD_BAS_3310_LDataSet;
import chosun.ciis.ad.bas.ds.AD_BAS_3320_LDataSet;
import chosun.ciis.co.base.wb.BaseWB;
/**
 * 광고관리-기초자료관리 광고주조회 WorkBean
 */
public class AdBas3300WB extends BaseWB {

		public void ad_bas_3310_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	AD_BAS_3310_LDataSet ds = null;
    	
    	String cmpy_cd    	= Util.getSessionParameterValue(req, "cmpycd", true);
    	String dlco_clsf 	= Util.checkString(req.getParameter("dlco_clsf"));
    	String dlco_no 		= Util.checkString(req.getParameter("dlco_no"));
    	String fr_dt        = Util.checkString(req.getParameter("fr_dt"));
    	String to_dt        = Util.checkString(req.getParameter("to_dt"));
    	
    	// DM Setting
    	AD_BAS_3310_LDM dm = new AD_BAS_3310_LDM();
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setDlco_clsf(dlco_clsf);
    	dm.setDlco_no(dlco_no);
    	dm.setFr_dt(fr_dt);
    	dm.setTo_dt(to_dt);
    	
    	dm.print();

        try {
        	AdBas3300DAO dao = new AdBas3300DAO();
            ds = dao.ad_bas_3310_l(dm);
            req.setAttribute("ds", ds);
        }  
        catch (AppException e) {
            throw e;
        }  
//        
//        AdBas3300EJBHome home = (AdBas3300EJBHome) JNDIManager.getInstance().getHome("AdBas3300EJB");
//        try {
//        	AdBas3300EJB ejb = home.create();
//            ds = ejb.ad_bas_3310_l(dm);
//            req.setAttribute("ds", ds);
//        }
//        catch (CreateException e) {
//        	e.printStackTrace();
//            SysException se = new SysException(e);
//            LogManager.getInstance().log(se);
//            throw se;
//        }
//        catch (RemoteException e) {
//        	e.printStackTrace();
//            SysException se = new SysException(e);
//            LogManager.getInstance().log(se);
//            throw se;
//        }
    }

	
	/**
	 * 광고관리-기초자료관리 대행사조회 WorkBean
	 */
	public void ad_bas_3320_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	AD_BAS_3320_LDataSet ds = null;

    	
    	String dlco_nm 		= Util.checkString(req.getParameter("dlco_nm"));
    	String yn_no 		= Util.checkString(req.getParameter("yn_no"));
    	String dlco_no 		= Util.checkString(req.getParameter("dlco_no"));
    	String cmpy_cd    	= Util.getSessionParameterValue(req, "cmpycd", true);

        // DM Setting
    	AD_BAS_3320_LDM dm = new AD_BAS_3320_LDM();
    	dm.setDlco_nm(dlco_nm);
    	dm.setYn_no(yn_no);
    	dm.setDlco_no(dlco_no);
    	dm.setCmpy_cd(cmpy_cd);
        try {
        	AdBas3300DAO dao = new AdBas3300DAO();
            ds = dao.ad_bas_3320_l(dm);
            req.setAttribute("ds", ds);
        }  
        catch (AppException e) {
            throw e;
        }  
//
//        AdBas3300EJBHome home = (AdBas3300EJBHome) JNDIManager.getInstance().getHome("AdBas3300EJB");
//        try {
//        	AdBas3300EJB ejb = home.create();
//            ds = ejb.ad_bas_3320_l(dm);
//            req.setAttribute("ds", ds);
//        }
//        catch (CreateException e) {
//        	e.printStackTrace();
//            SysException se = new SysException(e);
//            LogManager.getInstance().log(se);
//            throw se;
//        }
//        catch (RemoteException e) {
//        	e.printStackTrace();
//            SysException se = new SysException(e);
//            LogManager.getInstance().log(se);
//            throw se;
//        }
    }

}

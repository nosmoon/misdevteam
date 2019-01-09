package chosun.ciis.ad.bas.wb;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.util.Util;
import chosun.ciis.ad.bas.dao.AdBas2900DAO;
import chosun.ciis.ad.bas.dm.AD_BAS_2900_MDM;
import chosun.ciis.ad.bas.dm.AD_BAS_2910_LDM;
import chosun.ciis.ad.bas.dm.AD_BAS_2920_LDM;
import chosun.ciis.ad.bas.ds.AD_BAS_2900_MDataSet;
import chosun.ciis.ad.bas.ds.AD_BAS_2910_LDataSet;
import chosun.ciis.ad.bas.ds.AD_BAS_2920_LDataSet;
import chosun.ciis.co.base.wb.BaseWB;
/**
 */
public class AdBas2900WB extends BaseWB {


	public void ad_bas_2900_m(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	AD_BAS_2900_MDataSet ds = null;

        // DM Setting

    	String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);
    	
    	AD_BAS_2900_MDM dm = new AD_BAS_2900_MDM();
    	dm.setCmpy_cd(cmpy_cd);

        try {
        	AdBas2900DAO dao = new AdBas2900DAO();
            ds = dao.ad_bas_2900_m(dm);
            req.setAttribute("ds", ds);
        }  
        catch (AppException e) {
            throw e;
        } 
//        
//        AdBas2900EJBHome home = (AdBas2900EJBHome) JNDIManager.getInstance().getHome("AdBas2900EJB");
//        try {
//        	AdBas2900EJB ejb = home.create();
//            ds = ejb.ad_bas_2900_m(dm);
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
	
	public void ad_bas_2910_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	AD_BAS_2910_LDataSet ds = null;

        // DM Setting

    	String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);
    	String frdt = Util.checkString(req.getParameter("frdt"));
    	String todt = Util.checkString(req.getParameter("todt"));
    	String chrg_pers = Util.checkString(req.getParameter("chrg_pers"));
    	
    	AD_BAS_2910_LDM dm = new AD_BAS_2910_LDM();
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setFrdt(frdt);
    	dm.setTodt(todt);
    	dm.setChrg_pers(chrg_pers);
    	
//    	//dm.print();

        try {
        	AdBas2900DAO dao = new AdBas2900DAO();
            ds = dao.ad_bas_2910_l(dm);
            req.setAttribute("ds", ds);
        }  
        catch (AppException e) {
            throw e;
        } 
//        
//        AdBas2900EJBHome home = (AdBas2900EJBHome) JNDIManager.getInstance().getHome("AdBas2900EJB");
//        try {
//        	AdBas2900EJB ejb = home.create();
//            ds = ejb.ad_bas_2910_l(dm);
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


	public void ad_bas_2920_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	AD_BAS_2920_LDataSet ds = null;

        // DM Setting

    	String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);
    	String frdt = Util.checkString(req.getParameter("frdt"));
    	String todt = Util.checkString(req.getParameter("todt"));
    	String medi_cd = Util.checkString(req.getParameter("medi_cd"));
    	
    	AD_BAS_2920_LDM dm = new AD_BAS_2920_LDM();
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setFrdt(frdt);
    	dm.setTodt(todt);
    	dm.setMedi_cd(medi_cd);
    	
//    	//dm.print();
        try {
        	AdBas2900DAO dao = new AdBas2900DAO();
            ds = dao.ad_bas_2920_l(dm);
            req.setAttribute("ds", ds);
        }  
        catch (AppException e) {
            throw e;
        } 
//    	
//        AdBas2900EJBHome home = (AdBas2900EJBHome) JNDIManager.getInstance().getHome("AdBas2900EJB");
//        try {
//        	AdBas2900EJB ejb = home.create();
//            ds = ejb.ad_bas_2920_l(dm);
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

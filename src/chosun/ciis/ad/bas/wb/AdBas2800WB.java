package chosun.ciis.ad.bas.wb;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.util.Util;
import chosun.ciis.ad.bas.dao.AdBas2800DAO;
import chosun.ciis.ad.bas.dm.AD_BAS_2800_MDM;
import chosun.ciis.ad.bas.dm.AD_BAS_2810_LDM;
import chosun.ciis.ad.bas.dm.AD_BAS_2820_LDM;
import chosun.ciis.ad.bas.dm.AD_BAS_2830_LDM;
import chosun.ciis.ad.bas.ds.AD_BAS_2800_MDataSet;
import chosun.ciis.ad.bas.ds.AD_BAS_2810_LDataSet;
import chosun.ciis.ad.bas.ds.AD_BAS_2820_LDataSet;
import chosun.ciis.ad.bas.ds.AD_BAS_2830_LDataSet;
import chosun.ciis.co.base.wb.BaseWB;
/**
 */
public class AdBas2800WB extends BaseWB {


	public void ad_bas_2800_m(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	AD_BAS_2800_MDataSet ds = null;

        // DM Setting

    	String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);
    	
    	AD_BAS_2800_MDM dm = new AD_BAS_2800_MDM();
    	dm.setCmpy_cd(cmpy_cd);
    	

        try {
        	AdBas2800DAO dao = new AdBas2800DAO();
            ds = dao.ad_bas_2800_m(dm);
            req.setAttribute("ds", ds);
        }  
        catch (AppException e) {
            throw e;
        } 
//        
//        AdBas2800EJBHome home = (AdBas2800EJBHome) JNDIManager.getInstance().getHome("AdBas2800EJB");
//        try {
//        	AdBas2800EJB ejb = home.create();
//            ds = ejb.ad_bas_2800_m(dm);
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

	public void ad_bas_2810_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	AD_BAS_2810_LDataSet ds = null;

        // DM Setting

    	String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);
    	String dealmedicd = Util.getSessionParameterValue(req, "dealmedicd", true);
    	String frdt = Util.checkString(req.getParameter("frdt"));
    	String todt = Util.checkString(req.getParameter("todt"));
    	String chrg_pers = Util.checkString(req.getParameter("chrg_pers"));
    	String chrg_clsf = Util.checkString(req.getParameter("chrg_clsf"));
    	
    	AD_BAS_2810_LDM dm = new AD_BAS_2810_LDM();
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setDealmedicd(dealmedicd);
    	dm.setFrdt(frdt);
    	dm.setTodt(todt);
    	dm.setChrg_pers(chrg_pers);
    	dm.setChrg_clsf(chrg_clsf);
    	
//    	//dm.print();
        try {
        	AdBas2800DAO dao = new AdBas2800DAO();
            ds = dao.ad_bas_2810_l(dm);
            req.setAttribute("ds", ds);
        }  
        catch (AppException e) {
            throw e;
        } 
//    	
//        AdBas2800EJBHome home = (AdBas2800EJBHome) JNDIManager.getInstance().getHome("AdBas2800EJB");
//        try {
//        	AdBas2800EJB ejb = home.create();
//            ds = ejb.ad_bas_2810_l(dm);
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

	public void ad_bas_2820_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	AD_BAS_2820_LDataSet ds = null;

        // DM Setting

    	String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);
    	String dealmedicd = Util.getSessionParameterValue(req, "dealmedicd", true);
    	String frdt = Util.checkString(req.getParameter("frdt"));
    	String todt = Util.checkString(req.getParameter("todt"));
    	String part_cd = Util.checkString(req.getParameter("part_cd"));
    	
    	AD_BAS_2820_LDM dm = new AD_BAS_2820_LDM();
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setDealmedicd(dealmedicd);
    	dm.setFrdt(frdt);
    	dm.setTodt(todt);
    	dm.setPart_cd(part_cd);
    	
//    	//dm.print();

        try {
        	AdBas2800DAO dao = new AdBas2800DAO();
            ds = dao.ad_bas_2820_l(dm);
            req.setAttribute("ds", ds);
        }  
        catch (AppException e) {
            throw e;
        } 
//        
//        AdBas2800EJBHome home = (AdBas2800EJBHome) JNDIManager.getInstance().getHome("AdBas2800EJB");
//        try {
//        	AdBas2800EJB ejb = home.create();
//            ds = ejb.ad_bas_2820_l(dm);
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


	public void ad_bas_2830_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	AD_BAS_2830_LDataSet ds = null;

        // DM Setting

    	String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);
    	String dealmedicd = Util.getSessionParameterValue(req, "dealmedicd", true);
    	String frdt = Util.checkString(req.getParameter("frdt"));
    	String todt = Util.checkString(req.getParameter("todt"));
    	String team_cd = Util.checkString(req.getParameter("team_cd"));
    	
    	AD_BAS_2830_LDM dm = new AD_BAS_2830_LDM();
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setDealmedicd(dealmedicd);
    	dm.setFrdt(frdt);
    	dm.setTodt(todt);
    	dm.setTeam_cd(team_cd);
    	
//    	//dm.print();
        try {
        	AdBas2800DAO dao = new AdBas2800DAO();
            ds = dao.ad_bas_2830_l(dm);
            req.setAttribute("ds", ds);
        }  
        catch (AppException e) {
            throw e;
        } 
//    	
//        AdBas2800EJBHome home = (AdBas2800EJBHome) JNDIManager.getInstance().getHome("AdBas2800EJB");
//        try {
//        	AdBas2800EJB ejb = home.create();
//            ds = ejb.ad_bas_2830_l(dm);
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

package chosun.ciis.ad.bas.wb;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.util.Util;
import chosun.ciis.ad.bas.dao.AdBas3100DAO;
import chosun.ciis.ad.bas.dm.AD_BAS_3110_LDM;
import chosun.ciis.ad.bas.dm.AD_BAS_3120_LDM;
import chosun.ciis.ad.bas.dm.AD_BAS_3130_LDM;
import chosun.ciis.ad.bas.dm.AD_BAS_3140_LDM;
import chosun.ciis.ad.bas.dm.AD_BAS_3150_LDM;
import chosun.ciis.ad.bas.ds.AD_BAS_3110_LDataSet;
import chosun.ciis.ad.bas.ds.AD_BAS_3120_LDataSet;
import chosun.ciis.ad.bas.ds.AD_BAS_3130_LDataSet;
import chosun.ciis.ad.bas.ds.AD_BAS_3140_LDataSet;
import chosun.ciis.ad.bas.ds.AD_BAS_3150_LDataSet;
import chosun.ciis.co.base.wb.BaseWB;
/**
 */
public class AdBas3100WB extends BaseWB {


	public void ad_bas_3110_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	AD_BAS_3110_LDataSet ds = null;

        // DM Setting

    	String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);
    	String frdt = Util.checkString(req.getParameter("frdt"));
    	String todt = Util.checkString(req.getParameter("todt"));
    	String medi_cd = Util.checkString(req.getParameter("medi_cd"));
    	String spon_yn = Util.checkString(req.getParameter("spon_yn"));
    	String self_cmpy_yn = Util.checkString(req.getParameter("self_cmpy_yn"));
    	String plus_yn = Util.checkString(req.getParameter("plus_yn"));
    	
    	AD_BAS_3110_LDM dm = new AD_BAS_3110_LDM();
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setFrdt(frdt);
    	dm.setTodt(todt);
    	dm.setMedi_cd(medi_cd);
    	dm.setSpon_yn(spon_yn);
    	dm.setSelf_cmpy_yn(self_cmpy_yn);
    	dm.setPlus_yn(plus_yn);
    	
//    	//dm.print();  

        try {
        	AdBas3100DAO dao = new AdBas3100DAO();
            ds = dao.ad_bas_3110_l(dm);
            req.setAttribute("ds", ds);
        }  
        catch (AppException e) {
            throw e;
        } 
//        
//        AdBas3100EJBHome home = (AdBas3100EJBHome) JNDIManager.getInstance().getHome("AdBas3100EJB");
//        try {
//        	AdBas3100EJB ejb = home.create();
//            ds = ejb.ad_bas_3110_l(dm);
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


	public void ad_bas_3120_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	AD_BAS_3120_LDataSet ds = null;

        // DM Setting

    	String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);
    	String frdt = Util.checkString(req.getParameter("frdt"));
    	String todt = Util.checkString(req.getParameter("todt"));
    	String oth_clsf = Util.checkString(req.getParameter("oth_clsf"));
    	
    	AD_BAS_3120_LDM dm = new AD_BAS_3120_LDM();
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setFrdt(frdt);
    	dm.setTodt(todt);
    	dm.setOth_clsf(oth_clsf);
    	
//    	//dm.print();

        try {
        	AdBas3100DAO dao = new AdBas3100DAO();
            ds = dao.ad_bas_3120_l(dm);
            req.setAttribute("ds", ds);
        }  
        catch (AppException e) {
            throw e;
        } 
//        
//        AdBas3100EJBHome home = (AdBas3100EJBHome) JNDIManager.getInstance().getHome("AdBas3100EJB");
//        try {
//        	AdBas3100EJB ejb = home.create();
//            ds = ejb.ad_bas_3120_l(dm);
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


	public void ad_bas_3130_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	AD_BAS_3130_LDataSet ds = null;

        // DM Setting

    	String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);
    	String frdt = Util.checkString(req.getParameter("frdt"));
    	String todt = Util.checkString(req.getParameter("todt"));
    	String oth_clsf = Util.checkString(req.getParameter("oth_clsf"));
    	
    	AD_BAS_3130_LDM dm = new AD_BAS_3130_LDM();
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setFrdt(frdt);
    	dm.setTodt(todt);
    	dm.setOth_clsf(oth_clsf);
    	
    	dm.print();
    	
        try {
        	AdBas3100DAO dao = new AdBas3100DAO();
            ds = dao.ad_bas_3130_l(dm);
            req.setAttribute("ds", ds);
        }  
        catch (AppException e) {
            throw e;
        } 
//    	
//        AdBas3100EJBHome home = (AdBas3100EJBHome) JNDIManager.getInstance().getHome("AdBas3100EJB");
//        try {
//        	AdBas3100EJB ejb = home.create();
//            ds = ejb.ad_bas_3130_l(dm);
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


	public void ad_bas_3140_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	AD_BAS_3140_LDataSet ds = null;

        // DM Setting

    	String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);
    	String frdt = Util.checkString(req.getParameter("frdt"));
    	String todt = Util.checkString(req.getParameter("todt"));
    	
    	AD_BAS_3140_LDM dm = new AD_BAS_3140_LDM();
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setFrdt(frdt);
    	dm.setTodt(todt);
    	
//    	//dm.print();  

        try {
        	AdBas3100DAO dao = new AdBas3100DAO();
            ds = dao.ad_bas_3140_l(dm);
            req.setAttribute("ds", ds);
        }  
        catch (AppException e) {
            throw e;
        } 
//        
//        AdBas3100EJBHome home = (AdBas3100EJBHome) JNDIManager.getInstance().getHome("AdBas3100EJB");
//        try {
//        	AdBas3100EJB ejb = home.create();
//            ds = ejb.ad_bas_3140_l(dm);
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




	public void ad_bas_3150_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	AD_BAS_3150_LDataSet ds = null;

        // DM Setting

    	String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);
    	String frdt = Util.checkString(req.getParameter("frdt"));
    	String todt = Util.checkString(req.getParameter("todt"));
    	String out_yn = Util.checkString(req.getParameter("out_yn"));
    	
    	AD_BAS_3150_LDM dm = new AD_BAS_3150_LDM();
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setFrdt(frdt);
    	dm.setTodt(todt);
    	dm.setOut_yn(out_yn);
    	
//    	//dm.print(); 
        try {
        	AdBas3100DAO dao = new AdBas3100DAO();
            ds = dao.ad_bas_3150_l(dm);
            req.setAttribute("ds", ds);
        }  
        catch (AppException e) {
            throw e;
        }  
//    	
//        AdBas3100EJBHome home = (AdBas3100EJBHome) JNDIManager.getInstance().getHome("AdBas3100EJB");
//        try {
//        	AdBas3100EJB ejb = home.create();
//            ds = ejb.ad_bas_3150_l(dm);
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

package chosun.ciis.ad.bas.wb;

import java.util.Hashtable;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.util.Util;
import chosun.ciis.ad.bas.dao.AdBas3000DAO;
import chosun.ciis.ad.bas.dm.AD_BAS_3000_MDM;
import chosun.ciis.ad.bas.dm.AD_BAS_3010_LDM;
import chosun.ciis.ad.bas.dm.AD_BAS_3020_ADM;
import chosun.ciis.ad.bas.ds.AD_BAS_3000_MDataSet;
import chosun.ciis.ad.bas.ds.AD_BAS_3010_LDataSet;
import chosun.ciis.ad.bas.ds.AD_BAS_3020_ADataSet;
import chosun.ciis.co.base.util.StringUtil;
import chosun.ciis.co.base.wb.BaseWB;
/**
 * 광고관리-기초자료관리 광고주조회 WorkBean
 */
public class AdBas3000WB extends BaseWB {

	public void ad_bas_3010_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	AD_BAS_3010_LDataSet ds = null;

        // DM Setting

    	String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);
    	String oth_clsf = Util.checkString(req.getParameter("oth_clsf"));
    	String frdt = Util.checkString(req.getParameter("frdt"));
    	String todt = Util.checkString(req.getParameter("todt"));
    	String dlco_nm = Util.checkString(req.getParameter("dlco_nm"));
    	String advt_cont = Util.checkString(req.getParameter("advt_cont"));
    	String grp_cmpy = Util.checkString(req.getParameter("grp_cmpy"));
    	String indt_nm = Util.checkString(req.getParameter("indt_nm"));
    	String slcrg_pers = Util.checkString(req.getParameter("slcrg_pers"));    	
    	
    	AD_BAS_3010_LDM dm = new AD_BAS_3010_LDM();
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setOth_clsf(oth_clsf);
    	dm.setFrdt(frdt);
    	dm.setTodt(todt);
    	dm.setDlco_nm(dlco_nm);
    	dm.setAdvt_cont(advt_cont);
    	dm.setGrp_cmpy(grp_cmpy);
    	dm.setIndt_nm(indt_nm);
    	dm.setSlcrg_pers(slcrg_pers);
    	

        try {
        	AdBas3000DAO dao = new AdBas3000DAO();
            ds = dao.ad_bas_3010_l(dm);
            req.setAttribute("ds", ds);
        }  
        catch (AppException e) {
            throw e;
        } 
//        
//        AdBas3000EJBHome home = (AdBas3000EJBHome) JNDIManager.getInstance().getHome("AdBas3000EJB");
//        try {
//        	AdBas3000EJB ejb = home.create();
//            ds = ejb.ad_bas_3010_l(dm);
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


	public void ad_bas_3020_a(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	AD_BAS_3020_ADataSet ds = null;

        // DM Setting

    	String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);
    	String incmg_pers_ip = req.getRemoteAddr();
    	String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
    	
    	String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
    	
    	Hashtable hash = getHashMultiUpdateData(multiUpdateData);
    	
    	String mode = Util.checkString((String)hash.get("m"));
    	String oth_clsf = Util.checkString((String)hash.get("oth_clsf"));
    	String pubc_dt = StringUtil.strip(Util.checkString((String)hash.get("pubc_dt")), "-") ;
    	String pubc_seq = Util.checkString((String)hash.get("pubc_seq"));
    	String pubc_side = Util.checkString((String)hash.get("pubc_side"));
    	String advcs = Util.checkString((String)hash.get("advcs"));
    	String advt_cont = Util.checkString((String)hash.get("advt_cont"));
    	String grp_cmpy = Util.checkString((String)hash.get("grp_cmpy"));
    	String dn 				= Util.checkString((String)hash.get("dn"));
    	String cm 				= Util.checkString((String)hash.get("cm"));
    	String indt_clsf 		= Util.checkString((String)hash.get("indt_clsf"));
    	String slcrg_pers 		= Util.checkString((String)hash.get("slcrg_pers"));
    	String slcrg_pers_opn 	= Util.checkString((String)hash.get("slcrg_pers_opn"));
    	
    	AD_BAS_3020_ADM dm = new AD_BAS_3020_ADM();
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setMode(mode.toUpperCase());
    	dm.setOth_clsf(oth_clsf);
    	dm.setPubc_dt(pubc_dt);
    	dm.setPubc_seq(pubc_seq);
    	dm.setPubc_side(pubc_side);
    	dm.setAdvcs(advcs);
    	dm.setAdvt_cont(advt_cont);
    	dm.setGrp_cmpy(grp_cmpy);
    	dm.setDn(dn);
    	dm.setCm(cm);
    	dm.setIndt_type(indt_clsf);
    	dm.setSlcrg_pers(slcrg_pers);
    	dm.setSlcrg_pers_opn(slcrg_pers_opn);
    	dm.setIncmg_pers_ip(incmg_pers_ip);
    	dm.setIncmg_pers(incmg_pers);
    	
    	//dm.print();
        try {
        	AdBas3000DAO dao = new AdBas3000DAO();
            ds = dao.ad_bas_3020_a(dm);
            req.setAttribute("ds", ds);
        }  
        catch (AppException e) {
            throw e;
        } 
//    	
//        AdBas3000EJBHome home = (AdBas3000EJBHome) JNDIManager.getInstance().getHome("AdBas3000EJB");
//        try {
//        	AdBas3000EJB ejb = home.create();
//            ds = ejb.ad_bas_3020_a(dm);
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
	

	public void ad_bas_3000_m(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	AD_BAS_3000_MDataSet ds = null;

        // DM Setting

    	String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);
    	
    	AD_BAS_3000_MDM dm = new AD_BAS_3000_MDM();
    	dm.setCmpy_cd(cmpy_cd);

        try {
        	AdBas3000DAO dao = new AdBas3000DAO();
            ds = dao.ad_bas_3000_m(dm);
            req.setAttribute("ds", ds);
        }  
        catch (AppException e) {
            throw e;
        } 
//        
//        AdBas3000EJBHome home = (AdBas3000EJBHome) JNDIManager.getInstance().getHome("AdBas3000EJB");
//        try {
//        	AdBas3000EJB ejb = home.create();
//            ds = ejb.ad_bas_3000_m(dm);
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

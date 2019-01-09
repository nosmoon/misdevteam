/***************************************************************************************************
* 파일명 : AdPub2400WB.java
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

package chosun.ciis.ad.pub.wb;

import java.util.Hashtable;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.util.Util;
import chosun.ciis.ad.pub.dao.AdPub2400DAO;
import chosun.ciis.ad.pub.dm.AD_PUB_2400_MDM;
import chosun.ciis.ad.pub.dm.AD_PUB_2410_LDM;
import chosun.ciis.ad.pub.dm.AD_PUB_2420_LDM;
import chosun.ciis.ad.pub.dm.AD_PUB_2430_ADM;
import chosun.ciis.ad.pub.dm.AD_PUB_2440_LDM;
import chosun.ciis.ad.pub.dm.AD_PUB_2450_ADM;
import chosun.ciis.ad.pub.dm.AD_PUB_2460_LDM;
import chosun.ciis.ad.pub.dm.AD_PUB_2470_LDM;
import chosun.ciis.ad.pub.ds.AD_PUB_2400_MDataSet;
import chosun.ciis.ad.pub.ds.AD_PUB_2410_LDataSet;
import chosun.ciis.ad.pub.ds.AD_PUB_2420_LDataSet;
import chosun.ciis.ad.pub.ds.AD_PUB_2430_ADataSet;
import chosun.ciis.ad.pub.ds.AD_PUB_2440_LDataSet;
import chosun.ciis.ad.pub.ds.AD_PUB_2450_ADataSet;
import chosun.ciis.ad.pub.ds.AD_PUB_2460_LDataSet;
import chosun.ciis.ad.pub.ds.AD_PUB_2470_LDataSet;
import chosun.ciis.co.base.wb.BaseWB;
/**
 * 
 */

public class AdPub2400WB extends BaseWB {
		
	 /**
     * 
     *
     * @param req HttpServletRequest
     * @param pub HttpServletResponse
     * @throws AppException
     */
    public void ad_pub_2400_m(HttpServletRequest req, HttpServletResponse pub) throws   AppException {
    	
    	AD_PUB_2400_MDataSet ds = null;

        // DM Setting
    	AD_PUB_2400_MDM dm = new AD_PUB_2400_MDM();
    	String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);
        
        dm.setCmpy_cd(cmpy_cd);
        
        //dm.print();

        try {
        	AdPub2400DAO	dao = new AdPub2400DAO();
            ds = dao.ad_pub_2400_m(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        } 
        
//        AdPub2400EJBHome home = (AdPub2400EJBHome) JNDIManager.getInstance().getHome("AdPub2400EJB");
//        
//        try {
//        	AdPub2400EJB ejb = home.create();
//            ds = ejb.ad_pub_2400_m(dm);
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

    public void ad_pub_2430_a(HttpServletRequest req, HttpServletResponse pub) throws   AppException {
    	
    	AD_PUB_2430_ADataSet ds = null;
 
        String cmpy_cd	     = Util.getSessionParameterValue(req, "cmpycd", true);
    	String incmg_pers 	 = Util.getSessionParameterValue(req, "emp_no", true);
    	String incmg_pers_ip = req.getRemoteAddr();
    	
    	String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
    	
    	Hashtable hash = getHashMultiUpdateData(multiUpdateData);
    	
        String mode 				= Util.checkString((String)hash.get("m"));
        String medi_cd				= Util.checkString((String)hash.get("medi_cd"));
        String pubc_occr_dt 		= Util.checkString((String)hash.get("pubc_occr_dt"));
        String pubc_occr_seq		= Util.checkString((String)hash.get("pubc_occr_seq"));
        String nwsp_side_type		= Util.checkString((String)hash.get("nwsp_side_type"));
        String remk					= Util.checkString((String)hash.get("remk"));


    	// DM Setting
    	AD_PUB_2430_ADM dm = new AD_PUB_2430_ADM();
    	dm.setMode(mode.toUpperCase());
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setMedi_cd(medi_cd);
    	dm.setPubc_occr_dt(pubc_occr_dt);
    	dm.setPubc_occr_seq(pubc_occr_seq);
    	dm.setNwsp_side_type(nwsp_side_type);
    	dm.setRemk(remk);
        dm.setIncmg_pers_ip(incmg_pers_ip);
        dm.setIncmg_pers(incmg_pers);
        
        dm.print();    	

        try {
        	AdPub2400DAO	dao = new AdPub2400DAO();
            ds = dao.ad_pub_2430_a(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        } 
        
//        
//        AdPub2400EJBHome home = (AdPub2400EJBHome) JNDIManager.getInstance().getHome("AdPub2400EJB");
//        try {
//        	AdPub2400EJB ejb = home.create();
//            ds = ejb.ad_pub_2430_a(dm);
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

    public void ad_pub_2410_l(HttpServletRequest req, HttpServletResponse pub) throws   AppException {
    	
    	AD_PUB_2410_LDataSet ds = null;

        // DM Setting
    	AD_PUB_2410_LDM dm = new AD_PUB_2410_LDM();
    	
    	String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);
    	String medi_clsf  = Util.getSessionParameterValue(req, "dealmedicd", true);
    	String frdt = Util.Uni2Ksc(Util.checkString(req.getParameter("frdt")));
    	String todt = Util.Uni2Ksc(Util.checkString(req.getParameter("todt")));
        
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setMedi_clsf(medi_clsf);
    	dm.setFrdt(frdt);
    	dm.setTodt(todt);
        
        dm.print();

        try {
        	AdPub2400DAO	dao = new AdPub2400DAO();
            ds = dao.ad_pub_2410_l(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        } 
//        
//        AdPub2400EJBHome home = (AdPub2400EJBHome) JNDIManager.getInstance().getHome("AdPub2400EJB");
//        try {
//        	AdPub2400EJB ejb = home.create();
//            ds = ejb.ad_pub_2410_l(dm);
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
    public void ad_pub_2420_l(HttpServletRequest req, HttpServletResponse pub) throws   AppException {
    	
    	AD_PUB_2420_LDataSet ds = null;

        // DM Setting
    	AD_PUB_2420_LDM dm = new AD_PUB_2420_LDM();
    	
    	String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);
    	String frdt = Util.Uni2Ksc(Util.checkString(req.getParameter("frdt")));
    	String todt = Util.Uni2Ksc(Util.checkString(req.getParameter("todt")));
    	
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setFrdt(frdt);
    	dm.setTodt(todt);
        
        //dm.print();

        try {
        	AdPub2400DAO	dao = new AdPub2400DAO();
            ds = dao.ad_pub_2420_l(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        } 
//        
//        AdPub2400EJBHome home = (AdPub2400EJBHome) JNDIManager.getInstance().getHome("AdPub2400EJB");
//        try {
//        	AdPub2400EJB ejb = home.create();
//            ds = ejb.ad_pub_2420_l(dm);
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
    public void ad_pub_2440_l(HttpServletRequest req, HttpServletResponse pub) throws   AppException {
    	
    	AD_PUB_2440_LDataSet ds = null;

        // DM Setting
    	AD_PUB_2440_LDM dm = new AD_PUB_2440_LDM();
    	
    	String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);
    	String frdt = Util.Uni2Ksc(Util.checkString(req.getParameter("frdt")));
    	String todt = Util.Uni2Ksc(Util.checkString(req.getParameter("todt")));
    	String evnt_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("evnt_clsf")));
    	String spn_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("spn_clsf")));
    	
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setFrdt(frdt);
    	dm.setTodt(todt);
        dm.setEvnt_clsf(evnt_clsf);
        dm.setSpn_clsf(spn_clsf);
        //dm.print();

        try {
        	AdPub2400DAO	dao = new AdPub2400DAO();
            ds = dao.ad_pub_2440_l(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        } 
    } 
    public void ad_pub_2450_a(HttpServletRequest req, HttpServletResponse pub) throws   AppException {
    	
    	AD_PUB_2450_ADataSet ds = null;
 
        String cmpy_cd	     = Util.getSessionParameterValue(req, "cmpycd", true);
    	String incmg_pers    = Util.getSessionParameterValue(req, "emp_no", true);
    	String incmg_pers_ip = req.getRemoteAddr();
    	
    	String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
    	
    	Hashtable hash = getHashMultiUpdateData(multiUpdateData);
    	
        String mode             = Util.checkString((String)hash.get("m"));
        String medi_cd          = Util.checkString((String)hash.get("medi_cd"));
        String pubc_occr_dt     = Util.checkString((String)hash.get("pubc_occr_dt"));
        String pubc_occr_seq    = Util.checkString((String)hash.get("pubc_occr_seq"));
        String evnt_seq         = Util.checkString((String)hash.get("evnt_seq"));
        String evnt_cd          = Util.checkString((String)hash.get("evnt_cd"));
        String remk             = Util.checkString((String)hash.get("remk"));
        String spn_clsf         = Util.checkString((String)hash.get("spn_clsf"));


    	// DM Setting
    	AD_PUB_2450_ADM dm = new AD_PUB_2450_ADM();
    	dm.setMode(mode.toUpperCase());
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setMedi_cd(medi_cd);
    	dm.setPubc_occr_dt(pubc_occr_dt);
    	dm.setPubc_occr_seq(pubc_occr_seq);
    	dm.setEvnt_cd(evnt_cd);
    	dm.setEvnt_seq(evnt_seq);
    	dm.setRemk(remk);
    	dm.setSpn_clsf(spn_clsf);
        dm.setIncmg_pers_ip(incmg_pers_ip);
        dm.setIncmg_pers(incmg_pers);
        
        dm.print();    	

        try {
        	AdPub2400DAO	dao = new AdPub2400DAO();
            ds = dao.ad_pub_2450_a(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        } 
    }   
    public void ad_pub_2460_l(HttpServletRequest req, HttpServletResponse pub) throws   AppException {
    	
    	AD_PUB_2460_LDataSet ds = null;

        // DM Setting
    	AD_PUB_2460_LDM dm = new AD_PUB_2460_LDM();
    	
    	String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);
    	String frdt = Util.Uni2Ksc(Util.checkString(req.getParameter("frdt")));
    	String todt = Util.Uni2Ksc(Util.checkString(req.getParameter("todt")));
    	String evnt_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("evnt_clsf")));
    	String spn_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("spn_clsf")));
    	
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setFrdt(frdt);
    	dm.setTodt(todt);
        dm.setEvnt_clsf(evnt_clsf);
        dm.setSpn_clsf(spn_clsf);
        //dm.print();

        try {
        	AdPub2400DAO	dao = new AdPub2400DAO();
            ds = dao.ad_pub_2460_l(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        } 
    }   
    
    public void ad_pub_2470_l(HttpServletRequest req, HttpServletResponse pub) throws   AppException {
    	
    	AD_PUB_2470_LDataSet ds = null;

        // DM Setting
    	AD_PUB_2470_LDM dm = new AD_PUB_2470_LDM();
    	
    	String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);
    	String fr_mon = Util.Uni2Ksc(Util.checkString(req.getParameter("fr_mon")));
    	String to_mon = Util.Uni2Ksc(Util.checkString(req.getParameter("to_mon")));
    	String medi_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_clsf")));
    	
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setFrmon(fr_mon);
    	dm.setTomon(to_mon);
        dm.setMedi_clsf(medi_clsf);
        //dm.print();

        try {
        	AdPub2400DAO	dao = new AdPub2400DAO();
            ds = dao.ad_pub_2470_l(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        } 
    }    
}

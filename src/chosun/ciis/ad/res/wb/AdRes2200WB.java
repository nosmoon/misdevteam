/***************************************************************************************************
* 파일명 : AdRes2200WB.java
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

package chosun.ciis.ad.res.wb;

import java.util.Hashtable;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.util.Util;
import chosun.ciis.ad.res.dao.AdRes2200DAO;
import chosun.ciis.ad.res.dm.AD_RES_2200_MDM;
import chosun.ciis.ad.res.dm.AD_RES_2210_LDM;
import chosun.ciis.ad.res.dm.AD_RES_2220_UDM;
import chosun.ciis.ad.res.ds.AD_RES_2200_MDataSet;
import chosun.ciis.ad.res.ds.AD_RES_2210_LDataSet;
import chosun.ciis.ad.res.ds.AD_RES_2220_UDataSet;
import chosun.ciis.co.base.wb.BaseWB;
/**
 * 
 */

public class AdRes2200WB extends BaseWB {

    /**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void ad_res_2200_m(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	AD_RES_2200_MDataSet ds = null;

        // DM Setting
    	AD_RES_2200_MDM dm = new AD_RES_2200_MDM();
    	String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);
    	String medi_clsf  = "2";//Util.getSessionParameterValue(req, "dealmedicd", true);
    	String emp_no 	  = Util.getSessionParameterValue(req, "emp_no", true);

        dm.setCmpy_cd(cmpy_cd);
        dm.setMedi_clsf(medi_clsf);
        dm.setEmp_no(emp_no);
        
        //dm.print();

        try {
        	AdRes2200DAO	dao = new AdRes2200DAO();
            ds = dao.ad_res_2200_m(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        } 
//        
//        AdRes2200EJBHome home = (AdRes2200EJBHome) JNDIManager.getInstance().getHome("AdRes2200EJB");
//        try {
//        	AdRes2200EJB ejb = home.create();
//            ds = ejb.ad_res_2200_m(dm);
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
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void ad_res_2210_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	AD_RES_2210_LDataSet ds = null;

        // DM Setting
    	AD_RES_2210_LDM dm = new AD_RES_2210_LDM();
    	String cmpy_cd    	= Util.getSessionParameterValue(req, "cmpycd", true);
    	String medi_cd 		= "200";//Util.checkString(req.getParameter("medi_cd"));
    	String approval 	= Util.checkString(req.getParameter("approval"));
    	String frdt 		= Util.checkString(req.getParameter("frdt"));
    	String todt 		= Util.checkString(req.getParameter("todt"));
    	String slcrg_pers 	= Util.checkString(req.getParameter("slcrg_pers"));
    	String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);

        dm.setCmpy_cd(cmpy_cd);
        dm.setMedi_cd(medi_cd);
        dm.setApproval(approval);
        dm.setFrdt(frdt);
        dm.setTodt(todt);
        dm.setSlcrg_pers(slcrg_pers);
        dm.setIncmg_pers(incmg_pers);
        
        //dm.print();

        try {
        	AdRes2200DAO	dao = new AdRes2200DAO();
            ds = dao.ad_res_2210_l(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        } 
//        
//        AdRes2200EJBHome home = (AdRes2200EJBHome) JNDIManager.getInstance().getHome("AdRes2200EJB");
//        try {
//        	AdRes2200EJB ejb = home.create();
//            ds = ejb.ad_res_2210_l(dm);
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
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void ad_res_2220_u(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	AD_RES_2220_UDataSet ds = null;

        // DM Setting
    	AD_RES_2220_UDM dm = new AD_RES_2220_UDM();
    	String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);
    	String medi_cd = Util.checkString(req.getParameter("medi_cd"));
    	String auth = Util.checkString(req.getParameter("auth"));
    	String chg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        
        dm.setCmpy_cd(cmpy_cd);
        dm.setMedi_cd(medi_cd);
        dm.setAuth(auth);
        dm.setChg_pers(chg_pers);
    	
        String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
        //System.out.println("multiUpdateData = "+ multiUpdateData);
         
     	Hashtable hash = getHashMultiUpdateData(multiUpdateData);
        
     	//String mode 			= (String)hash.get("m"); 
        String seq	 			= Util.checkString((String)hash.get("seq")); 
        String preng_occr_dt    = Util.checkString((String)hash.get("preng_occr_dt")); 
        String preng_occr_seq   = Util.checkString((String)hash.get("preng_occr_seq")); 
        String chrg_aprv        = Util.checkString((String)hash.get("chrg_aprv")); 
        String team_chf_aprv 	= Util.checkString((String)hash.get("team_chf_aprv")); 
     	
     	//dm.setMode(mode.toUpperCase());
     	dm.setSeq(seq);
     	dm.setPreng_occr_dt(preng_occr_dt);
     	dm.setPreng_occr_seq(preng_occr_seq);
     	dm.setChrg_aprv(chrg_aprv);
    	dm.setTeam_chf_aprv(team_chf_aprv);

        //dm.print();

        try {
        	AdRes2200DAO	dao = new AdRes2200DAO();
            ds = dao.ad_res_2220_u(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        } 
//        
//        AdRes2200EJBHome home = (AdRes2200EJBHome) JNDIManager.getInstance().getHome("AdRes2200EJB");
//        try {
//        	AdRes2200EJB ejb = home.create();
//            ds = ejb.ad_res_2220_u(dm);
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
}

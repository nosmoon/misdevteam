/***************************************************************************************************
* 파일명 : AdRes1300WB.java
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
import chosun.ciis.ad.res.dao.AdRes1300DAO;
import chosun.ciis.ad.res.dm.AD_RES_1300_MDM;
import chosun.ciis.ad.res.dm.AD_RES_1310_LDM;
import chosun.ciis.ad.res.dm.AD_RES_1320_UDM;
import chosun.ciis.ad.res.ds.AD_RES_1300_MDataSet;
import chosun.ciis.ad.res.ds.AD_RES_1310_LDataSet;
import chosun.ciis.ad.res.ds.AD_RES_1320_UDataSet;
import chosun.ciis.co.base.wb.BaseWB;
/**
 * 
 */

public class AdRes1300WB extends BaseWB {

    /**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void ad_res_1300_m(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	AD_RES_1300_MDataSet ds = null;

        // DM Setting
    	AD_RES_1300_MDM dm = new AD_RES_1300_MDM();
    	String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);
    	String medi_clsf  = Util.getSessionParameterValue(req, "dealmedicd", true); //매체구분  1:신문광고, 2:출판광고, 3:재경국
    	String emp_no  = Util.getSessionParameterValue(req, "emp_no", true); //매체구분  1:신문광고, 2:출판광고, 3:재경국

        dm.setCmpy_cd(cmpy_cd);
        dm.setMedi_clsf(medi_clsf);
        dm.setEmp_no(emp_no);

        try {
        	AdRes1300DAO	dao = new AdRes1300DAO();
            ds = dao.ad_res_1300_m(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        } 
//        
//        AdRes1300EJBHome home = (AdRes1300EJBHome) JNDIManager.getInstance().getHome("AdRes1300EJB");
//        try {
//        	AdRes1300EJB ejb = home.create();
//            ds = ejb.ad_res_1300_m(dm);
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
    public void ad_res_1310_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	AD_RES_1310_LDataSet ds = null;

        // DM Setting
    	AD_RES_1310_LDM dm = new AD_RES_1310_LDM();
    	String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);
    	String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
    	String dept_cd 	= Util.getSessionParameterValue(req, "deptcd", true);
    	String medi_cd = Util.checkString(req.getParameter("medi_cd"));
    	String approval = Util.checkString(req.getParameter("approval"));
    	String frdt = Util.checkString(req.getParameter("frdt"));
    	String todt = Util.checkString(req.getParameter("todt"));
    	String slcrg_pers = Util.checkString(req.getParameter("slcrg_pers"));
    	String dlco_no = Util.checkString(req.getParameter("dlco_no"));
    	String dis_agre_yn = Util.checkString(req.getParameter("dis_agre_yn"));

        dm.setCmpy_cd(cmpy_cd);
        dm.setMedi_cd(medi_cd);
        dm.setApproval(approval);
        dm.setFrdt(frdt);
        dm.setTodt(todt);
        dm.setSlcrg_pers(slcrg_pers);
        dm.setDlco_no(dlco_no);
        dm.setDept_cd(dept_cd);
        dm.setIncmg_pers(incmg_pers);
        dm.setDis_agre_yn(dis_agre_yn);
        
        dm.print();  

        try {
        	AdRes1300DAO	dao = new AdRes1300DAO();
            ds = dao.ad_res_1310_l(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        } 
//        
//        AdRes1300EJBHome home = (AdRes1300EJBHome) JNDIManager.getInstance().getHome("AdRes1300EJB");
//        try {
//        	AdRes1300EJB ejb = home.create();
//            ds = ejb.ad_res_1310_l(dm);
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
    public void ad_res_1320_u(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	AD_RES_1320_UDataSet ds = null;

        // DM Setting
    	String cmpy_cd    	= Util.getSessionParameterValue(req, "cmpycd", true);
    	String auth 		= Util.checkString(req.getParameter("auth"));
    	String chg_pers 	= Util.getSessionParameterValue(req, "emp_no", true);

    	String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
        //System.out.println("multiUpdateData = "+ multiUpdateData);
         
     	Hashtable hash = getHashMultiUpdateData(multiUpdateData);

     	//String mode 			= (String)hash.get("m"); 
        String medi_cd	 		= Util.checkString((String)hash.get("medi_cd")); 
        String preng_occr_dt    = Util.checkString((String)hash.get("preng_occr_dt")); 
        String preng_occr_seq   = Util.checkString((String)hash.get("preng_occr_seq")); 
        String chrg_aprv        = Util.checkString((String)hash.get("chrg_aprv")); 
        String part_chf_aprv    = Util.checkString((String)hash.get("part_chf_aprv")); 
        String team_chf_aprv 	= Util.checkString((String)hash.get("team_chf_aprv")); 
     	String apr_advt_fee     = Util.checkString((String)hash.get("apr_advt_fee"));
     	//dm.setMode(mode.toUpperCase());
    	AD_RES_1320_UDM dm = new AD_RES_1320_UDM();
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setAuth(auth);
    	dm.setChg_pers(chg_pers);
     	dm.setMedi_cd(medi_cd);
     	dm.setPreng_occr_dt(preng_occr_dt);
     	dm.setPreng_occr_seq(preng_occr_seq);
     	dm.setChrg_aprv(chrg_aprv);
    	dm.setPart_chf_aprv(part_chf_aprv);
    	dm.setTeam_chf_aprv(team_chf_aprv);
    	dm.setApr_advt_fee(apr_advt_fee);
    	
    	dm.print();

        try {
        	AdRes1300DAO	dao = new AdRes1300DAO();
            ds = dao.ad_res_1320_u(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        } 
//        
//        AdRes1300EJBHome home = (AdRes1300EJBHome) JNDIManager.getInstance().getHome("AdRes1300EJB");
//        try {
//        	AdRes1300EJB ejb = home.create();
//            ds = ejb.ad_res_1320_u(dm);
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

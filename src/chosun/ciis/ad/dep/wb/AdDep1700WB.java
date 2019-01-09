/***************************************************************************************************
* 파일명 : AdDep1700WB.java
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

package chosun.ciis.ad.dep.wb;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.util.Util;
import chosun.ciis.ad.dep.dao.AdDep1700DAO;
import chosun.ciis.ad.dep.dm.AD_DEP_1700_MDM;
import chosun.ciis.ad.dep.dm.AD_DEP_1710_LDM;
import chosun.ciis.ad.dep.ds.AD_DEP_1700_MDataSet;
import chosun.ciis.ad.dep.ds.AD_DEP_1710_LDataSet;

import chosun.ciis.ad.dep.dm.AD_DEP_1750_MDM;
import chosun.ciis.ad.dep.dm.AD_DEP_1751_LDM;
import chosun.ciis.ad.dep.ds.AD_DEP_1750_MDataSet;
import chosun.ciis.ad.dep.ds.AD_DEP_1751_LDataSet;

import chosun.ciis.co.base.wb.BaseWB;
/**
 * 
 */

public class AdDep1700WB extends BaseWB {

    /**
     * 
     *
     * @param req HttpServletRequest
     * @param pub HttpServletResponse
     * @throws AppException
     */
    public void ad_dep_1700_m(HttpServletRequest req, HttpServletResponse pub) throws   AppException {
    	
    	AD_DEP_1700_MDataSet ds = null;

        // DM Setting
    	String cmpy_cd        = Util.getSessionParameterValue(req, "cmpycd", true);
    	String dealmedicd     = Util.getSessionParameterValue(req, "dealmedicd", true);

    	AD_DEP_1700_MDM dm = new AD_DEP_1700_MDM();
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setDealmedicd(dealmedicd);
       
        //dm.print();

        try {
        	AdDep1700DAO	dao = new AdDep1700DAO();
            ds = dao.ad_dep_1700_m(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        }  
//        
//        AdDep1700EJBHome home = (AdDep1700EJBHome) JNDIManager.getInstance().getHome("AdDep1700EJB");
//        try {
//        	AdDep1700EJB ejb = home.create();
//            ds = ejb.ad_dep_1700_m(dm);
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
    public void ad_dep_1710_l(HttpServletRequest req, HttpServletResponse pub) throws   AppException {
    	
    	AD_DEP_1710_LDataSet ds = null;

        // DM Setting
    	String cmpy_cd        	= Util.getSessionParameterValue(req, "cmpycd", true);
    	String dealmedicd     	= Util.getSessionParameterValue(req, "dealmedicd", true);
    	String medi_cd 			= Util.checkString(req.getParameter("medi_cd"));
    	String hndl_clsf 		= Util.checkString(req.getParameter("hndl_clsf"));
    	String dlco_no 			= Util.checkString(req.getParameter("dlco_no"));
    	String frdt 			= Util.checkString(req.getParameter("frdt"));
    	String todt 			= Util.checkString(req.getParameter("todt"));
    	String fr_rcpm_shet_no 	= Util.checkString(req.getParameter("fr_rcpm_shet_no"));
    	String to_rcpm_shet_no 	= Util.checkString(req.getParameter("to_rcpm_shet_no"));
    	String acct_cd 			= Util.checkString(req.getParameter("acct_cd"));
    	String rmtt_dt 			= Util.checkString(req.getParameter("rmtt_dt"));
    	String rmtt_amt 		= Util.checkString(req.getParameter("rmtt_amt"));
    	String rmtt_plac 		= Util.checkString(req.getParameter("rmtt_plac"));
    	String proc_clsf 		= Util.checkString(req.getParameter("proc_clsf"));

    	AD_DEP_1710_LDM dm = new AD_DEP_1710_LDM();
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setDealmedicd(dealmedicd);
    	dm.setMedi_cd(medi_cd);
    	dm.setHndl_clsf(hndl_clsf);
    	dm.setDlco_no(dlco_no);
    	dm.setFrdt(frdt);
    	dm.setTodt(todt);
    	dm.setFr_rcpm_shet_no(fr_rcpm_shet_no);
    	dm.setTo_rcpm_shet_no(to_rcpm_shet_no);
    	dm.setAcct_cd(acct_cd);
    	dm.setRmtt_dt(rmtt_dt);
    	dm.setRmtt_amt(rmtt_amt);
    	dm.setRmtt_plac(rmtt_plac);
    	dm.setProc_clsf(proc_clsf);
       
//        dm.print();
        
        try {
        	AdDep1700DAO	dao = new AdDep1700DAO();
            ds = dao.ad_dep_1710_l(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        }  
        
//        AdDep1700EJBHome home = (AdDep1700EJBHome) JNDIManager.getInstance().getHome("AdDep1700EJB");
//        try {
//        	AdDep1700EJB ejb = home.create();
//            ds = ejb.ad_dep_1710_l(dm);
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
    
    
    public void ad_dep_1750_m(HttpServletRequest req, HttpServletResponse pub) throws   AppException {
    	
    	AD_DEP_1750_MDataSet ds = null;

        // DM Setting
    	String cmpy_cd      = Util.getSessionParameterValue(req, "cmpycd", true);
    	String medi_clsf 	= Util.getSessionParameterValue(req, "dealmedicd", true);
    	String emp_no		= Util.getSessionParameterValue(req, "emp_no", true);

    	AD_DEP_1750_MDM dm = new AD_DEP_1750_MDM();
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setMedi_clsf(medi_clsf);
       
        try {
        	AdDep1700DAO	dao = new AdDep1700DAO();
            ds = dao.ad_dep_1750_m(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        }
    }

    public void ad_dep_1751_l(HttpServletRequest req, HttpServletResponse pub) throws   AppException {
    	
    	AD_DEP_1751_LDataSet ds = null;

        // DM Setting
    	String cmpy_cd        	= Util.getSessionParameterValue(req, "cmpycd", true);
    	String medi_clsf     	= Util.getSessionParameterValue(req, "dealmedicd", true);
    	String emp_no			= Util.getSessionParameterValue(req, "emp_no", true);
    	
    	String medi_cd 			= Util.checkString(req.getParameter("medi_cd"));
    	String date_clsf		= Util.checkString(req.getParameter("date_clsf"));
    	String frdt 			= Util.checkString(req.getParameter("frdt"));
    	String todt 			= Util.checkString(req.getParameter("todt"));
    	
    	String rcpm_plac_clsf	= Util.checkString(req.getParameter("rcpm_plac_clsf"));
    	String dlco_no 			= Util.checkString(req.getParameter("dlco_no"));
    	String dlco_nm 			= Util.checkString(req.getParameter("dlco_nm"));
    	
    	String rcpm_clsf		= Util.checkString(req.getParameter("rcpm_clsf"));
    	String note_clsf		= Util.checkString(req.getParameter("note_clsf"));
    	
    	String mchrg_pers		= Util.checkString(req.getParameter("mchrg_pers"));
    	String mchrg_pers_nm	= Util.checkString(req.getParameter("mchrg_pers_nm"));

    	AD_DEP_1751_LDM dm = new AD_DEP_1751_LDM();
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setMedi_clsf(medi_clsf);
    	dm.setEmp_no(emp_no);
    	dm.setMedi_cd(medi_cd);
    	dm.setDate_clsf(date_clsf);
    	dm.setFrdt(frdt);
    	dm.setTodt(todt);
    	dm.setRcpm_plac_clsf(rcpm_plac_clsf);
    	dm.setDlco_no(dlco_no);
    	dm.setDlco_nm(dlco_nm);
    	dm.setRcpm_clsf(rcpm_clsf);
    	dm.setNote_clsf(note_clsf);
    	dm.setMchrg_pers(mchrg_pers);
    	dm.setMchrg_pers_nm(mchrg_pers_nm);
        
        try {
        	AdDep1700DAO	dao = new AdDep1700DAO();
            ds = dao.ad_dep_1751_l(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        }
    }  
    
}

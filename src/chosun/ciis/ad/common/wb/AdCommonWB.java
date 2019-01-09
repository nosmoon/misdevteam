/***************************************************************************************************
* 파일명 : AdCommonWB.java
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

package chosun.ciis.ad.common.wb;

import java.util.Hashtable;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.util.Util;
import chosun.ciis.ad.common.dao.AdCommonDAO;
import chosun.ciis.ad.common.dm.AD_CO_1000_LDM;
import chosun.ciis.ad.common.dm.AD_CO_1001_LDM;
import chosun.ciis.ad.common.dm.AD_CO_1100_LDM;
import chosun.ciis.ad.common.dm.AD_CO_1101_LDM;
import chosun.ciis.ad.common.dm.AD_CO_1200_LDM;
import chosun.ciis.ad.common.dm.AD_CO_1300_LDM;
import chosun.ciis.ad.common.dm.AD_CO_1400_LDM;
import chosun.ciis.ad.common.dm.AD_CO_1410_ADM;
import chosun.ciis.ad.common.dm.AD_CO_1510_LDM;
import chosun.ciis.ad.common.dm.AD_CO_1600_MDM;
import chosun.ciis.ad.common.dm.AD_CO_1610_LDM;
import chosun.ciis.ad.common.dm.AD_CO_1700_LDM;
import chosun.ciis.ad.common.dm.AD_CO_1800_MDM;
import chosun.ciis.ad.common.dm.AD_CO_1810_SDM;
import chosun.ciis.ad.common.dm.AD_CO_1820_ADM;
import chosun.ciis.ad.common.dm.AD_CO_9000_SDM;
import chosun.ciis.ad.common.dm.AD_CO_9001_SDM;
import chosun.ciis.ad.common.dm.AD_CO_9002_SDM;
import chosun.ciis.ad.common.dm.AD_CO_9003_SDM;
import chosun.ciis.ad.common.dm.AD_CO_9007_SDM;
import chosun.ciis.ad.common.dm.AD_CO_9008_SDM;
import chosun.ciis.ad.common.dm.AD_CO_9009_SDM;
import chosun.ciis.ad.common.dm.AD_CO_9010_SDM;
import chosun.ciis.ad.common.dm.AD_CO_9100_SDM;

import chosun.ciis.ad.common.ds.AD_CO_1000_LDataSet;
import chosun.ciis.ad.common.ds.AD_CO_1001_LDataSet;
import chosun.ciis.ad.common.ds.AD_CO_1100_LDataSet;
import chosun.ciis.ad.common.ds.AD_CO_1101_LDataSet;
import chosun.ciis.ad.common.ds.AD_CO_1200_LDataSet;
import chosun.ciis.ad.common.ds.AD_CO_1300_LDataSet;
import chosun.ciis.ad.common.ds.AD_CO_1400_LDataSet;
import chosun.ciis.ad.common.ds.AD_CO_1410_ADataSet;
import chosun.ciis.ad.common.ds.AD_CO_1510_LDataSet;
import chosun.ciis.ad.common.ds.AD_CO_1600_MDataSet;
import chosun.ciis.ad.common.ds.AD_CO_1610_LDataSet;
import chosun.ciis.ad.common.ds.AD_CO_1700_LDataSet;
import chosun.ciis.ad.common.ds.AD_CO_1800_MDataSet;
import chosun.ciis.ad.common.ds.AD_CO_1810_SDataSet;
import chosun.ciis.ad.common.ds.AD_CO_1820_ADataSet;
import chosun.ciis.ad.common.ds.AD_CO_9000_SDataSet;
import chosun.ciis.ad.common.ds.AD_CO_9001_SDataSet;
import chosun.ciis.ad.common.ds.AD_CO_9002_SDataSet;
import chosun.ciis.ad.common.ds.AD_CO_9003_SDataSet;
import chosun.ciis.ad.common.ds.AD_CO_9007_SDataSet;
import chosun.ciis.ad.common.ds.AD_CO_9008_SDataSet;
import chosun.ciis.ad.common.ds.AD_CO_9009_SDataSet;
import chosun.ciis.ad.common.ds.AD_CO_9010_SDataSet;
import chosun.ciis.ad.common.ds.AD_CO_9100_SDataSet;
import chosun.ciis.co.base.util.PubcPrengInfo;
import chosun.ciis.co.base.wb.BaseWB;
/**
 * 
 */

public class AdCommonWB extends BaseWB {

    /**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void ad_co_1000_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	AD_CO_1000_LDataSet ds = null;

        // DM Setting
    	AD_CO_1000_LDM dm = new AD_CO_1000_LDM();
    	String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);

        dm.setCmpy_cd(cmpy_cd);
        
        try {
        	AdCommonDAO dao = new AdCommonDAO();
            ds = dao.ad_co_1000_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            throw e;
        }      
/*        
        AdCommonEJBHome home = (AdCommonEJBHome) JNDIManager.getInstance().getHome("AdCommonEJB");
        try {
        	AdCommonEJB ejb = home.create();
            ds = ejb.ad_co_1000_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (CreateException e) {
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        }
        catch (RemoteException e) {
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        }
*/        
    }    

    /**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void ad_co_1001_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	AD_CO_1001_LDataSet ds = null;

        // DM Setting
    	AD_CO_1001_LDM dm = new AD_CO_1001_LDM();
    	String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);
    	String major = Util.checkString(req.getParameter("major"));

        dm.setCmpy_cd(cmpy_cd);
        dm.setMajor(major);

        try {
        	AdCommonDAO dao = new AdCommonDAO();
            ds = dao.ad_co_1001_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            throw e;
        }   
/*        
        AdCommonEJBHome home = (AdCommonEJBHome) JNDIManager.getInstance().getHome("AdCommonEJB");
        try {
        	AdCommonEJB ejb = home.create();
            ds = ejb.ad_co_1001_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (CreateException e) {
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        }
        catch (RemoteException e) {
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        }
*/        
    }    



    /**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void ad_co_1100_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	AD_CO_1100_LDataSet ds = null;

        // DM Setting
    	AD_CO_1100_LDM dm = new AD_CO_1100_LDM();
    	String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);

        dm.setCmpy_cd(cmpy_cd);
  
        try {
        	AdCommonDAO dao = new AdCommonDAO();
            ds = dao.ad_co_1100_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            throw e;
        }     
/*        
        AdCommonEJBHome home = (AdCommonEJBHome) JNDIManager.getInstance().getHome("AdCommonEJB");
        try {
        	AdCommonEJB ejb = home.create();
            ds = ejb.ad_co_1100_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (CreateException e) {
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        }
        catch (RemoteException e) {
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        }
*/        
    }    

    /**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void ad_co_1101_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	AD_CO_1101_LDataSet ds = null;

        // DM Setting
    	AD_CO_1101_LDM dm = new AD_CO_1101_LDM();
    	String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);
    	String major = Util.checkString(req.getParameter("major"));

        dm.setCmpy_cd(cmpy_cd);
        dm.setMajor(major);
  
        try {
        	AdCommonDAO dao = new AdCommonDAO();
            ds = dao.ad_co_1101_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            throw e;
        }        
/*
        AdCommonEJBHome home = (AdCommonEJBHome) JNDIManager.getInstance().getHome("AdCommonEJB");
        try {
        	AdCommonEJB ejb = home.create();
            ds = ejb.ad_co_1101_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (CreateException e) {
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        }
        catch (RemoteException e) {
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        }
*/        
    }    
    

    /**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void ad_co_1200_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	AD_CO_1200_LDataSet ds = null;

        // DM Setting
    	AD_CO_1200_LDM dm = new AD_CO_1200_LDM();
    	String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);
    	String medi_clsf  = Util.getSessionParameterValue(req, "dealmedicd", true);
    	String dlco_no1 = Util.checkString(req.getParameter("dlco_no1"));
    	String dlco_no2 = Util.checkString(req.getParameter("dlco_no2"));
    	String dlco_nm = Util.checkString(req.getParameter("dlco_nm"));
    	String gnr_advcs_yn = Util.checkString(req.getParameter("gnr_advcs_yn"));
    	String arow_advcs_yn = Util.checkString(req.getParameter("arow_advcs_yn"));
    	String agn_yn = Util.checkString(req.getParameter("agn_yn"));
    	String advt_bo_yn = Util.checkString(req.getParameter("advt_bo_yn"));
    	String bo_bof_yn = Util.checkString(req.getParameter("bo_bof_yn"));
        
        dm.setCmpy_cd(cmpy_cd);
        dm.setMedi_clsf(medi_clsf);
        dm.setDlco_no1(dlco_no1);
        dm.setDlco_no2(dlco_no2);
        dm.setDlco_nm(dlco_nm);
        dm.setGnr_advcs_yn(gnr_advcs_yn);
        dm.setArow_advcs_yn(arow_advcs_yn);
        dm.setAgn_yn(agn_yn);
        dm.setAdvt_bo_yn(advt_bo_yn);
        dm.setBo_bof_yn(bo_bof_yn);
     
        try {
        	AdCommonDAO dao = new AdCommonDAO();
            ds = dao.ad_co_1200_l(dm);
            req.setAttribute("ds", ds);
        } 
        catch (AppException e) {
            throw e;
        }   
/*        
        AdCommonEJBHome home = (AdCommonEJBHome) JNDIManager.getInstance().getHome("AdCommonEJB");
        try {
        	AdCommonEJB ejb = home.create();
            ds = ejb.ad_co_1200_l(dm);
            req.setAttribute("ds", ds);
        } 
        catch (CreateException e) {
        	e.printStackTrace();
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        }
        catch (RemoteException e) {
        	e.printStackTrace();
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        }
*/        
    }       

    /**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void ad_co_1300_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	AD_CO_1300_LDataSet ds = null;

        // DM Setting
    	AD_CO_1300_LDM dm = new AD_CO_1300_LDM();
    	String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);
    	String dlco_no1 = Util.checkString(req.getParameter("dlco_no1"));
    	String dlco_no2 = Util.checkString(req.getParameter("dlco_no2"));
    	String dlco_nm = Util.checkString(req.getParameter("dlco_nm"));
    	String ern = Util.checkString(req.getParameter("ern"));
    	String dlco_abrv_nm = Util.checkString(req.getParameter("dlco_abrv_nm"));
    	String presi_nm = Util.checkString(req.getParameter("presi_nm"));
        
        dm.setCmpy_cd(cmpy_cd);
        dm.setDlco_no1(dlco_no1);
        dm.setDlco_no2(dlco_no2);
        dm.setDlco_nm(dlco_nm);
        dm.setErn(ern);
        dm.setDlco_abrv_nm(dlco_abrv_nm);
        dm.setPresi_nm(presi_nm);
        
        try {
        	AdCommonDAO dao = new AdCommonDAO();
            ds = dao.ad_co_1300_l(dm);
            req.setAttribute("ds", ds);
        } 
        catch (AppException e) {
            throw e;
        }   
/*        
        AdCommonEJBHome home = (AdCommonEJBHome) JNDIManager.getInstance().getHome("AdCommonEJB");
        try {
        	AdCommonEJB ejb = home.create();
            ds = ejb.ad_co_1300_l(dm);
            req.setAttribute("ds", ds);
        } 
        catch (CreateException e) {
        	e.printStackTrace();
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        }
        catch (RemoteException e) {
        	e.printStackTrace();
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        }
*/        
    }      
    
    /**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void ad_co_1400_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	AD_CO_1400_LDataSet ds = null;

        // DM Setting
    	AD_CO_1400_LDM dm = new AD_CO_1400_LDM();
    	String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);
        
        dm.setCmpy_cd(cmpy_cd);
      
        try {
        	AdCommonDAO dao = new AdCommonDAO();
            ds = dao.ad_co_1400_l(dm);
            req.setAttribute("ds", ds);
        } 
        catch (AppException e) {
            throw e;
        }   
        
//        AdCommonEJBHome home = (AdCommonEJBHome) JNDIManager.getInstance().getHome("AdCommonEJB");
//        try {
//        	AdCommonEJB ejb = home.create();
//            ds = ejb.ad_co_1400_l(dm);
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
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void ad_co_1410_a(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	AD_CO_1410_ADataSet ds = null;

    	String cmpy_cd    	 = Util.getSessionParameterValue(req, "cmpycd", true);
    	String incmg_pers_ip = req.getRemoteAddr();
    	String incmg_pers    = Util.getSessionParameterValue(req, "emp_no", true);
    	String flag			 = Util.checkString(req.getParameter("flag"));
        
        String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
         
     	Hashtable hash = getHashMultiUpdateData(multiUpdateData);
     	
     	String mode 				= Util.checkString((String)hash.get("m")); 
        String grp_cmpy_cd			= Util.checkString((String)hash.get("grp_cmpy_cd"));
        String dlco_no 				= Util.checkString((String)hash.get("dlco_no"));
        String old_grp_cmpy_cd		= Util.checkString((String)hash.get("old_grp_cmpy_cd"));
        String old_dlco_no 			= Util.checkString((String)hash.get("old_dlco_no"));
       
        // DM Setting
    	AD_CO_1410_ADM dm = new AD_CO_1410_ADM();
        dm.setCmpy_cd(cmpy_cd);
        dm.setMode(mode.toUpperCase());
     	dm.setGrp_cmpy_cd(grp_cmpy_cd);
        dm.setDlco_no(dlco_no);
        dm.setOld_grp_cmpy_cd(old_grp_cmpy_cd);
        dm.setOld_dlco_no(old_dlco_no);
        dm.setIncmg_pers_ip(incmg_pers_ip);
    	dm.setIncmg_pers(incmg_pers);  
    	dm.setFlag(flag);
        
        //dm.print();
        try {
        	AdCommonDAO dao = new AdCommonDAO();
            ds = dao.ad_co_1410_a(dm);
            req.setAttribute("ds", ds);
        } 
        catch (AppException e) {
            throw e;
        }   
        
//        AdCommonEJBHome home = (AdCommonEJBHome) JNDIManager.getInstance().getHome("AdCommonEJB");
//        try {
//        	AdCommonEJB ejb = home.create();
//            ds = ejb.ad_co_1410_a(dm);
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
    
    public void ad_co_1510_l(HttpServletRequest req, HttpServletResponse res) throws   AppException
    {	
    	AD_CO_1510_LDataSet ds = null;

        // DM Setting
    	AD_CO_1510_LDM dm = new AD_CO_1510_LDM();
    	String cmpy_cd    	= Util.getSessionParameterValue(req, "cmpycd", true);
    	String medi_clsf	= Util.checkString(req.getParameter("medi_clsf"));
    	String dlco_no		= Util.checkString(req.getParameter("dlco_no"));
    	String dlco_nm 		= Util.checkString(req.getParameter("dlco_nm"));
    	String cust_seq	 	= Util.checkString(req.getParameter("cust_seq"));
    	String cust_name 	= Util.checkString(req.getParameter("cust_name"));
    	
        dm.setCmpyCd(cmpy_cd);
        dm.setMediClsf(medi_clsf);
        dm.setDlcoNo(dlco_no);
        dm.setDlcoNm(dlco_nm);
        dm.setCustSeq(cust_seq);
        dm.setCustName(cust_name);
     
        try
        {
        	AdCommonDAO dao = new AdCommonDAO();
            ds = dao.ad_co_1510_l(dm);
            req.setAttribute("ds", ds);
        } 
        catch (AppException e)
        {
            throw e;
        }
	}
    
    public void ad_co_1600_m(HttpServletRequest req, HttpServletResponse res) throws   AppException
    {	
    	AD_CO_1600_MDataSet ds = null;

        // DM Setting
    	AD_CO_1600_MDM dm = new AD_CO_1600_MDM();
    	String cmpy_cd    	= Util.getSessionParameterValue(req, "cmpycd", true);
    	String dealmedicd   = Util.getSessionParameterValue(req, "dealmedicd", true);
    	String emp_no		= Util.getSessionParameterValue(req, "emp_no", true);
    	
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setDealmedicd(dealmedicd);
    	dm.setEmp_no(emp_no);
     
        try
        {
        	AdCommonDAO dao = new AdCommonDAO();
            ds = dao.ad_co_1600_m(dm);
            req.setAttribute("ds", ds);
        } 
        catch (AppException e)
        {
            throw e;
        }
	}
    
    public void ad_co_1610_l(HttpServletRequest req, HttpServletResponse res) throws   AppException
    {	
    	AD_CO_1610_LDataSet ds = null;

        // DM Setting
    	AD_CO_1610_LDM dm = new AD_CO_1610_LDM();
    	String cmpy_cd    		= Util.getSessionParameterValue(req, "cmpycd", true);    	
    	String frdt 			= Util.checkString(req.getParameter("frdt"));
    	String todt 			= Util.checkString(req.getParameter("todt"));
    	String bank_cd 			= Util.checkString(req.getParameter("bank_cd"));
    	String note_clsf_cd		= Util.checkString(req.getParameter("note_clsf_cd"));
    	String issu_pers_nm		= Util.checkString(req.getParameter("issu_pers_nm"));
    	String rcpm_acct		= Util.checkString(req.getParameter("rcpm_acct"));
    	String sale_aprv_no		= Util.checkString(req.getParameter("sale_aprv_no"));
    	String note_amt			= Util.checkString(req.getParameter("note_amt"));
    	
    	dm.setCmpy_cd(cmpy_cd);    	
    	dm.setFrdt(frdt);
    	dm.setTodt(todt);
    	dm.setBank_cd(bank_cd);
    	dm.setNote_clsf_cd(note_clsf_cd);
    	dm.setIssu_pers_nm(issu_pers_nm);
    	dm.setRcpm_acct(rcpm_acct);
    	dm.setSale_aprv_no(sale_aprv_no);
    	dm.setNote_amt(note_amt);
    	
        try
        {
        	AdCommonDAO dao = new AdCommonDAO();
            ds = dao.ad_co_1610_l(dm);
            req.setAttribute("ds", ds);
        } 
        catch (AppException e)
        {
            throw e;
        }
	}
    
    /**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void ad_co_1700_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	AD_CO_1700_LDataSet ds = null;

        // DM Setting
    	AD_CO_1700_LDM dm = new AD_CO_1700_LDM();
    	String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);
    	String medi_cd = Util.checkString(req.getParameter("medi_cd"));
    	String pubc_dt = Util.checkString(req.getParameter("pubc_dt"));
    	String gb_cd = Util.checkString(req.getParameter("gb_cd"));
    	String gb_cd2 = Util.checkString(req.getParameter("gb_cd2"));

        
        dm.setCmpy_cd(cmpy_cd);
        dm.setMedi_cd(medi_cd);
        dm.setPubc_dt(pubc_dt);
        dm.setGb_cd(gb_cd);
        dm.setGb_cd2(gb_cd2);
        dm.print();
        try {
        	AdCommonDAO dao = new AdCommonDAO();
            ds = dao.ad_co_1700_l(dm);
            req.setAttribute("ds", ds);
        } 
        catch (AppException e) {
            throw e;
        }   
    } 
    public void ad_co_1800_m(HttpServletRequest req, HttpServletResponse res) throws   AppException
    {	
    	AD_CO_1800_MDataSet ds = null;

        // DM Setting
    	AD_CO_1800_MDM dm = new AD_CO_1800_MDM();
    	String cmpy_cd    	= Util.getSessionParameterValue(req, "cmpycd", true);
    	
    	dm.setCmpy_cd(cmpy_cd);
     
        try
        {
        	AdCommonDAO dao = new AdCommonDAO();
            ds = dao.ad_co_1800_m(dm);
            req.setAttribute("ds", ds);
        } 
        catch (AppException e)
        {
            throw e;
        }
	} 
    public void ad_co_1810_s(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	AD_CO_1810_SDataSet ds = null;
    	System.out.println("1810wb start!");
        // DM Setting
    	AD_CO_1810_SDM dm = new AD_CO_1810_SDM();
    	String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);
        String pubc_dt    = Util.checkString(req.getParameter("pubc_dt"));
        String hndl_nm_cd = Util.checkString(req.getParameter("hndl_nm_cd"));    
        System.out.println("1810wb!::"+hndl_nm_cd);
        dm.setCmpy_cd(cmpy_cd);
        dm.setPubc_dt(pubc_dt);
        dm.setHndl_nm_cd(hndl_nm_cd);
        dm.print();
        try {
        	AdCommonDAO dao = new AdCommonDAO();
            ds = dao.ad_co_1810_s(dm);
            req.setAttribute("ds", ds);
        } 
        catch (AppException e) {
            throw e;
        }   
    }  

    public void ad_co_1820_a(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	AD_CO_1820_ADataSet ds = null;

    	String cmpy_cd    	 = Util.getSessionParameterValue(req, "cmpycd", true);
    	String incmg_pers_ip = req.getRemoteAddr();
    	String incmg_pers    = Util.getSessionParameterValue(req, "emp_no", true);
        
        String pubc_dt = Util.checkString(req.getParameter("pubc_dt"));
        String hndl_nm_cd = Util.checkString(req.getParameter("hndl_nm_cd"));
        String tot_comnt = Util.checkString(req.getParameter("tot_comnt"));
        System.out.println("tot_comnt::"+tot_comnt);
        // DM Setting
        AD_CO_1820_ADM dm = new AD_CO_1820_ADM();
        dm.setCmpy_cd(cmpy_cd);
        dm.setPubc_dt(pubc_dt);
        dm.setHndl_nm_cd(hndl_nm_cd);
        dm.setTot_comnt(tot_comnt);
        dm.setIncmg_pers_ip(incmg_pers_ip);
    	dm.setIncmg_pers(incmg_pers);  

        
        dm.print();
        try {
        	AdCommonDAO dao = new AdCommonDAO();
            ds = dao.ad_co_1820_a(dm);
            req.setAttribute("ds", ds);
        } 
        catch (AppException e) {
            throw e;
        }   
    }    
    /**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void ad_co_9000_s(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	AD_CO_9000_SDataSet ds = null;
    	
    	String action   = Util.checkString(req.getParameter("action"));
    	String cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
    	String srch_cd = Util.checkString(req.getParameter("srch_cd"));
    	String job_clsf = Util.checkString(req.getParameter("job_clsf"));
    	String cd_clsf = Util.checkString(req.getParameter("cd_clsf"));
    	
        // DM Setting
        AD_CO_9000_SDM dm = new AD_CO_9000_SDM();

        dm.setAction(action);
        dm.setCmpy_cd(cmpy_cd);
        dm.setSrch_cd(srch_cd);
        dm.setJob_clsf(job_clsf);
        dm.setCd_clsf(cd_clsf);
        
//        dm.print();
        try {
        	AdCommonDAO dao = new AdCommonDAO();
            ds = dao.ad_co_9000_s(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            throw e;
        }   
        
//        AdCommonEJBHome home = (AdCommonEJBHome) JNDIManager.getInstance().getHome("AdCommonEJB");
//        try {
//        	AdCommonEJB ejb = home.create();
//            ds = ejb.ad_co_9000_s(dm);
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
    public void ad_co_9001_s(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	AD_CO_9001_SDataSet ds = null;
    	String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);
    	String preng_occr_dt = Util.checkString(req.getParameter("preng_occr_dt"));
    	String mony_kind = Util.checkString(req.getParameter("mony_kind"));
    	
        // DM Setting
    	
        AD_CO_9001_SDM dm = new AD_CO_9001_SDM();

        dm.setCmpy_cd(cmpy_cd);
        dm.setPreng_occr_dt(preng_occr_dt);
        dm.setMony_kind(mony_kind);
        
        //dm.print();
        
        try {
        	AdCommonDAO dao = new AdCommonDAO();
            ds = dao.ad_co_9001_s(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            throw e;
        }   
        
//        AdCommonEJBHome home = (AdCommonEJBHome) JNDIManager.getInstance().getHome("AdCommonEJB");
//        try {
//        	AdCommonEJB ejb = home.create();
//            ds = ejb.ad_co_9001_s(dm);
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
    public void ad_co_9002_s(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	AD_CO_9002_SDataSet ds = null;
    	String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);;
    	String dlco_clsf  = Util.checkString(req.getParameter("dlco_clsf"));
    	String dlco_nm    = Util.checkString(req.getParameter("srch_dlco_nm"));
    	
        // DM Setting
    	
        AD_CO_9002_SDM dm = new AD_CO_9002_SDM();

        dm.setCmpy_cd(cmpy_cd);
        dm.setDlco_clsf(dlco_clsf);
        dm.setDlco_nm(dlco_nm.trim());
 
        try {
        	AdCommonDAO dao = new AdCommonDAO();
            ds = dao.ad_co_9002_s(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            throw e;
        }   
//        
//        AdCommonEJBHome home = (AdCommonEJBHome) JNDIManager.getInstance().getHome("AdCommonEJB");
//        try {
//        	AdCommonEJB ejb = home.create();
//            ds = ejb.ad_co_9002_s(dm);
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
    public void ad_co_9003_s(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	AD_CO_9003_SDataSet ds = null;
    	String cmpy_cd    		= Util.getSessionParameterValue(req, "cmpycd", true);
    	String medi_cd 			= Util.checkString(req.getParameter("medi_cd"));
    	String preng_occr_dt 	= Util.checkString(req.getParameter("preng_occr_dt"));
    	String sect_nm 			= Util.checkString(req.getParameter("sect_nm"));
    	
    	if( "130".equals(medi_cd) || "190".equals(medi_cd) || "120".equals(medi_cd) || "150".equals(medi_cd) ){
    		sect_nm = " "+sect_nm;
    	}
    	String sect_cd  = "";
    	String sect_seq = "";
    	
    	try{
    		sect_cd  = sect_nm.substring(0,1);
    		sect_seq = sect_nm.substring(1);    		
    	}catch(Exception ignore){
    	}

        // DM Setting
    	
        AD_CO_9003_SDM dm = new AD_CO_9003_SDM();

        dm.setCmpy_cd(cmpy_cd);
        dm.setMedi_cd(medi_cd);
        dm.setPreng_occr_dt(preng_occr_dt);
        dm.setSect_cd(sect_cd);
        dm.setSect_seq(sect_seq);
        
        dm.print();
  
        try {
        	AdCommonDAO dao = new AdCommonDAO();
            ds = dao.ad_co_9003_s(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            throw e;
        }   
        
//        AdCommonEJBHome home = (AdCommonEJBHome) JNDIManager.getInstance().getHome("AdCommonEJB");
//        try {
//        	AdCommonEJB ejb = home.create();
//            ds = ejb.ad_co_9003_s(dm);
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
    public void ad_co_9007_s(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	AD_CO_9007_SDataSet ds = null;
    	String cmpy_cd    		= Util.getSessionParameterValue(req, "cmpycd", true);
    	String dlco_no 			= Util.checkString(req.getParameter("dlco_no"));
    	
        // DM Setting
    	
        AD_CO_9007_SDM dm = new AD_CO_9007_SDM();
        dm.setCmpy_cd(cmpy_cd);
        dm.setDlco_no(dlco_no);
        
//        //dm.print();
        
        try {
        	AdCommonDAO dao = new AdCommonDAO();
            ds = dao.ad_co_9007_s(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        }   
        
//        AdCommonEJBHome home = (AdCommonEJBHome) JNDIManager.getInstance().getHome("AdCommonEJB");
//        try {
//        	AdCommonEJB ejb = home.create();
//            ds = ejb.ad_co_9007_s(dm);
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
    public void ad_co_9008_s(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	AD_CO_9008_SDataSet ds = null;
    	String cmpy_cd    		= Util.getSessionParameterValue(req, "cmpycd", true);
    	String action 			= Util.checkString(req.getParameter("action"));
    	String dlco_clsf 		= Util.checkString(req.getParameter("dlco_clsf"));
    	String srch_nm 			= Util.checkString(req.getParameter("srch_nm"));
    	
        // DM Setting
    	  
        AD_CO_9008_SDM dm = new AD_CO_9008_SDM();
        dm.setAction(action);
        dm.setCmpy_cd(cmpy_cd);    
        dm.setDlco_clsf(dlco_clsf);
        dm.setSrch_nm(srch_nm);
        
        dm.print();
   
        try {
        	AdCommonDAO dao = new AdCommonDAO();
            ds = dao.ad_co_9008_s(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        }   
        
//        AdCommonEJBHome home = (AdCommonEJBHome) JNDIManager.getInstance().getHome("AdCommonEJB");
//        try {
//        	AdCommonEJB ejb = home.create();
//            ds = ejb.ad_co_9008_s(dm);
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
    public void ad_co_9009_s(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	AD_CO_9009_SDataSet ds = null;
    	String cmpy_cd    	= Util.getSessionParameterValue(req, "cmpycd", true);
    	String emp_no 		= Util.checkString(req.getParameter("emp_no"));
    	String emp_nm 		= Util.checkString(req.getParameter("emp_nm"));
    	
        // DM Setting
    	  
        AD_CO_9009_SDM dm = new AD_CO_9009_SDM();
        dm.setCmpy_cd(cmpy_cd);    
        dm.setEmp_no(emp_no);
        dm.setEmp_nm(emp_nm);
        
        dm.print();
        
        try {
        	AdCommonDAO dao = new AdCommonDAO();
            ds = dao.ad_co_9009_s(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        }   
        
//        AdCommonEJBHome home = (AdCommonEJBHome) JNDIManager.getInstance().getHome("AdCommonEJB");
//        try {
//        	AdCommonEJB ejb = home.create();
//            ds = ejb.ad_co_9009_s(dm);
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
    public void ad_co_9010_s(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	AD_CO_9010_SDataSet ds = null;
    	String cmpy_cd    		= Util.getSessionParameterValue(req, "cmpycd", true);
    	String dlco_clsf		= Util.checkString(req.getParameter("dlco_clsf"));
    	String dlco_no 			= Util.checkString(req.getParameter("dlco_no"));
    	String dlco_nm 			= Util.checkString(req.getParameter("dlco_nm"));
    	String slcrg_pers 		= Util.checkString(req.getParameter("slcrg_pers"));
    	String slcrg_pers_nm	= Util.checkString(req.getParameter("slcrg_pers_nm"));
    	String mchrg_pers 		= Util.checkString(req.getParameter("mchrg_pers"));
    	String mchrg_pers_nm 	= Util.checkString(req.getParameter("mchrg_pers_nm"));
    	
        // DM Setting
    	  
        AD_CO_9010_SDM dm = new AD_CO_9010_SDM();
        dm.setCmpy_cd(cmpy_cd);
        dm.setDlco_clsf(dlco_clsf);
        dm.setDlco_no(dlco_no);
        dm.setDlco_nm(dlco_nm);
        dm.setSlcrg_pers(slcrg_pers);
        dm.setSlcrg_pers_nm(slcrg_pers_nm);
        dm.setMchrg_pers(mchrg_pers);
        dm.setMchrg_pers_nm(mchrg_pers_nm);
        
        dm.print();
        
        try {
            ds = PubcPrengInfo.instance().getDlcoInfo(dm);
            req.setAttribute("ds", ds); 
        }
        catch (AppException e) {
            throw e;
        }   

/*
        try {
        	AdCommonDAO	dao = new AdCommonDAO();
            ds = dao.ad_co_9010_s(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        }   
 */
        
/*
        AdCommonEJBHome home = (AdCommonEJBHome) JNDIManager.getInstance().getHome("AdCommonEJB");
        try {
        	AdCommonEJB ejb = home.create();
            ds = ejb.ad_co_9010_s(dm);
            req.setAttribute("ds", ds);  
        }
        catch (CreateException e) {
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        }
        catch (RemoteException e) {
            SysException se = new SysException(e);
            LogManager.getInstance().log(se);
            throw se;
        }
*/        
    }
    
    public void ad_co_9100_s(HttpServletRequest req, HttpServletResponse res) throws   AppException
    {	
    	AD_CO_9100_SDataSet ds 	= null;
    	String cmpy_cd    		= Util.getSessionParameterValue(req, "cmpycd", true);
    	String action 			= Util.checkString(req.getParameter("action"));
    	String medi_clsf 		= Util.checkString(req.getParameter("medi_clsf"));
    	String srch_dlco_no 	= Util.checkString(req.getParameter("srch_dlco_no"));
    	String srch_dlco_nm 	= Util.checkString(req.getParameter("srch_dlco_nm"));
    	String srch_cust_seq	= Util.checkString(req.getParameter("srch_cust_seq"));
    	String srch_cust_name	= Util.checkString(req.getParameter("srch_cust_name"));
    	
        // DM Setting
        AD_CO_9100_SDM dm = new AD_CO_9100_SDM();
        dm.setAction(action);
        dm.setCmpyCd(cmpy_cd);    
        dm.setMediClsf(medi_clsf);
        dm.setSrchDlcoNo(srch_dlco_no);
        dm.setSrchDlcoNm(srch_dlco_nm);
        dm.setSrchCustSeq(srch_cust_seq);
        dm.setSrchCustName(srch_cust_name);
        
        dm.print();
   
        try
        {
        	AdCommonDAO dao = new AdCommonDAO();
            ds = dao.ad_co_9100_s(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e)
        {
            throw e;
        }
    }
}

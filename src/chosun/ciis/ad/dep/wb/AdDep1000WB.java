/***************************************************************************************************
* 파일명 : AdDep1000WB.java
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

import java.sql.CallableStatement;
import java.sql.SQLException;
import java.util.Hashtable;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.db.DBManager;
import somo.framework.expt.AppException;
import somo.framework.expt.SysException;
import somo.framework.util.Util;
import chosun.ciis.ad.dep.dao.AdDep1000DAO;
import chosun.ciis.ad.dep.dm.AD_DEP_1000_MDM;
import chosun.ciis.ad.dep.dm.AD_DEP_1010_SDM;
import chosun.ciis.ad.dep.dm.AD_DEP_1011_LDM;
import chosun.ciis.ad.dep.dm.AD_DEP_1012_LDM;
import chosun.ciis.ad.dep.dm.AD_DEP_1013_LDM;
import chosun.ciis.ad.dep.dm.AD_DEP_1020_ADM;
import chosun.ciis.ad.dep.dm.AD_DEP_1030_ADM;
import chosun.ciis.ad.dep.dm.AD_DEP_1040_ADM;
import chosun.ciis.ad.dep.dm.AD_DEP_1050_MDM;
import chosun.ciis.ad.dep.dm.AD_DEP_1051_LDM;
import chosun.ciis.ad.dep.dm.AD_DEP_1055_ADM;
import chosun.ciis.ad.dep.ds.AD_DEP_1000_MDataSet;
import chosun.ciis.ad.dep.ds.AD_DEP_1010_SDataSet;
import chosun.ciis.ad.dep.ds.AD_DEP_1011_LDataSet;
import chosun.ciis.ad.dep.ds.AD_DEP_1012_LDataSet;
import chosun.ciis.ad.dep.ds.AD_DEP_1013_LDataSet;
import chosun.ciis.ad.dep.ds.AD_DEP_1020_ADataSet;
import chosun.ciis.ad.dep.ds.AD_DEP_1030_ADataSet;
import chosun.ciis.ad.dep.ds.AD_DEP_1040_ADataSet;
import chosun.ciis.ad.dep.ds.AD_DEP_1050_MDataSet;
import chosun.ciis.ad.dep.ds.AD_DEP_1051_LDataSet;
import chosun.ciis.ad.dep.ds.AD_DEP_1055_ADataSet;
import chosun.ciis.ad.pub.dm.AD_PUB_3620_ADM;
import chosun.ciis.ad.pub.ds.AD_PUB_3620_ADataSet;
import chosun.ciis.co.base.util.StringUtil;
import chosun.ciis.co.base.wb.BaseWB;
/**
 * 
 */

public class AdDep1000WB extends BaseWB {

    /**
     * 
     *
     * @param req HttpServletRequest
     * @param pub HttpServletResponse
     * @throws AppException
     */
    public void ad_dep_1000_m(HttpServletRequest req, HttpServletResponse pub) throws   AppException {
    	
    	AD_DEP_1000_MDataSet ds = null;

        // DM Setting
    	AD_DEP_1000_MDM dm = new AD_DEP_1000_MDM();
    	String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);
    	String medi_clsf   = Util.getSessionParameterValue(req, "dealmedicd", true);

        dm.setCmpy_cd(cmpy_cd);
        dm.setMedi_clsf(medi_clsf);         
       
        try {
        	AdDep1000DAO	dao = new AdDep1000DAO();
            ds = dao.ad_dep_1000_m(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        }  
//        
//        AdDep1000EJBHome home = (AdDep1000EJBHome) JNDIManager.getInstance().getHome("AdDep1000EJB");
//        try {
//        	AdDep1000EJB ejb = home.create();
//            ds = ejb.ad_dep_1000_m(dm);
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
    public void ad_dep_1010_s(HttpServletRequest req, HttpServletResponse pub) throws   AppException {
    	
    	AD_DEP_1010_SDataSet ds = null;

        // DM Setting
    	String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);
    	String medi_clsf  = Util.getSessionParameterValue(req, "dealmedicd", true);
    	String occr_dt 	  = Util.checkString(req.getParameter("occr_dt"));
    	String slip_clsf  = Util.checkString(req.getParameter("slip_clsf"));
    	String seq        = Util.checkString(req.getParameter("seq"));    	

        AD_DEP_1010_SDM dm = new AD_DEP_1010_SDM();
        dm.setCmpy_cd(cmpy_cd);
        dm.setMedi_clsf(medi_clsf);
        dm.setOccr_dt(occr_dt);
        dm.setSlip_clsf(slip_clsf);
        dm.setSeq(seq);

        try {
        	AdDep1000DAO	dao = new AdDep1000DAO();
            ds = dao.ad_dep_1010_s(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        }  
//        
//        AdDep1000EJBHome home = (AdDep1000EJBHome) JNDIManager.getInstance().getHome("AdDep1000EJB");
//        try {
//        	AdDep1000EJB ejb = home.create();
//            ds = ejb.ad_dep_1010_s(dm);
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
    public void ad_dep_1011_l(HttpServletRequest req, HttpServletResponse pub) throws   AppException {
    	
    	AD_DEP_1011_LDataSet ds = null;

        // DM Setting
    	String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);
    	String dlco_no = Util.checkString(req.getParameter("dlco_no"));    	

        AD_DEP_1011_LDM dm = new AD_DEP_1011_LDM();
        dm.setCmpy_cd(cmpy_cd);
        dm.setDlco_no(dlco_no);

        try {
        	AdDep1000DAO	dao = new AdDep1000DAO();
            ds = dao.ad_dep_1011_l(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        }  
//        
//        AdDep1000EJBHome home = (AdDep1000EJBHome) JNDIManager.getInstance().getHome("AdDep1000EJB");
//        try {
//        	AdDep1000EJB ejb = home.create();
//            ds = ejb.ad_dep_1011_l(dm);
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
    public void ad_dep_1012_l(HttpServletRequest req, HttpServletResponse pub) throws   AppException {
    	
    	AD_DEP_1012_LDataSet ds = null;

        // DM Setting
    	String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);
    	String dlco_no = Util.checkString(req.getParameter("dlco_no"));

        AD_DEP_1012_LDM dm = new AD_DEP_1012_LDM();
        dm.setCmpy_cd(cmpy_cd);
        dm.setDlco_no(dlco_no);
       

        try {
        	AdDep1000DAO	dao = new AdDep1000DAO();
            ds = dao.ad_dep_1012_l(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        }  
//        
//        AdDep1000EJBHome home = (AdDep1000EJBHome) JNDIManager.getInstance().getHome("AdDep1000EJB");
//        try {
//        	AdDep1000EJB ejb = home.create();
//            ds = ejb.ad_dep_1012_l(dm);
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
    public void ad_dep_1013_l(HttpServletRequest req, HttpServletResponse pub) throws   AppException {
    	
    	AD_DEP_1013_LDataSet ds = null;

        // DM Setting
    	String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);
    	String dlco_no = Util.checkString(req.getParameter("dlco_no"));    	

        AD_DEP_1013_LDM dm = new AD_DEP_1013_LDM();
        dm.setCmpy_cd(cmpy_cd);
        dm.setDlco_no(dlco_no);

        try {
        	AdDep1000DAO	dao = new AdDep1000DAO();
            ds = dao.ad_dep_1013_l(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        }  
//        
//        AdDep1000EJBHome home = (AdDep1000EJBHome) JNDIManager.getInstance().getHome("AdDep1000EJB");
//        try {
//        	AdDep1000EJB ejb = home.create();
//            ds = ejb.ad_dep_1013_l(dm);
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
    public void ad_dep_1020_a(HttpServletRequest req, HttpServletResponse pub) throws   AppException {
    	
    	AD_DEP_1020_ADataSet ds = null;

        // DM Setting

    	String medi_clsf 	= Util.getSessionParameterValue(req, "dealmedicd", true);
    	String cmpy_cd    	= Util.getSessionParameterValue(req, "cmpycd", true);
    	String occr_dt 		= Util.checkString(req.getParameter("occr_dt"));
    	String slip_clsf 	= Util.checkString(req.getParameter("slip_clsf"));
//    	String seq 		 	= Util.checkString(req.getParameter("seq")); 
    	String rcpm_shet_no = Util.checkString(req.getParameter("rcpm_shet_no"));
    	String self_cmpy_yn = Util.checkString(req.getParameter("self_cmpy_yn"));
    	String rcpm_acct = Util.checkString(req.getParameter("rcpm_acct"));
    	String rcpm_plac_clsf = Util.checkString(req.getParameter("rcpm_plac_clsf"));
    	String dlco_no = Util.checkString(req.getParameter("dlco_no"));
    	String medi_cd = Util.checkString(req.getParameter("medi_cd"));
    	String sale_aprv_no = Util.checkString(req.getParameter("sale_aprv_no"));
    	String dept_cd = Util.checkString(req.getParameter("dept_cd"));
    	String mchrg_pers = Util.checkString(req.getParameter("mchrg_pers"));
    	String advt_tot_amt = Util.checkString(req.getParameter("advt_tot_amt"));
    	String rcpm_tot_amt = Util.checkString(req.getParameter("rcpm_tot_amt"));
    	String cash_amt = Util.checkString(req.getParameter("cash_amt"));
    	String fee_amt = Util.checkString(req.getParameter("fee_amt"));
    	String chnl_clsf = Util.checkString(req.getParameter("chnl_clsf"));
    	
    	String multiUpdateData1 = Util.checkString(req.getParameter("multiUpdateData1"));
    	String multiUpdateData2 = Util.checkString(req.getParameter("multiUpdateData2"));
    	String multiUpdateData3 = Util.checkString(req.getParameter("multiUpdateData3"));
    	String multiUpdateData4 = Util.checkString(req.getParameter("multiUpdateData4"));
    	String multiUpdateData5 = Util.checkString(req.getParameter("multiUpdateData5"));
    	String multiUpdateData6 = Util.checkString(req.getParameter("multiUpdateData6"));
    	String multiUpdateData7 = Util.checkString(req.getParameter("multiUpdateData7"));
    	String multiUpdateData8 = Util.checkString(req.getParameter("multiUpdateData8"));
    	
    	Hashtable hash1 = getHashMultiUpdateData(multiUpdateData1);
    	Hashtable hash2 = getHashMultiUpdateData(multiUpdateData2);
    	Hashtable hash3 = getHashMultiUpdateData(multiUpdateData3);
    	Hashtable hash4 = getHashMultiUpdateData(multiUpdateData4);
    	Hashtable hash5 = getHashMultiUpdateData(multiUpdateData5);
    	Hashtable hash6 = getHashMultiUpdateData(multiUpdateData6);
    	Hashtable hash7 = getHashMultiUpdateData(multiUpdateData7);
    	Hashtable hash8 = getHashMultiUpdateData(multiUpdateData8);
    	
    	String note_no1 = Util.checkString((String)hash1.get("note_no"));
    	String bank_cd1 = Util.checkString((String)hash1.get("bank_cd"));
    	String note_clsf_cd1 = Util.checkString((String)hash1.get("note_clsf_cd"));
    	String comp_dt1 = Util.checkString((String)hash1.get("comp_dt"));
    	String mtry_dt1 = Util.checkString((String)hash1.get("mtry_dt"));
    	String note_amt1 = Util.checkString((String)hash1.get("note_amt"));
    	String sale_dscn_amt1 = Util.checkString((String)hash1.get("sale_dscn_amt"));
    	String issu_cmpy_clsf_cd1 = Util.checkString((String)hash1.get("issu_cmpy_clsf_cd"));
    	String issu_pers_nm1 = Util.checkString((String)hash1.get("issu_pers_nm"));
    	String elec_note_key = Util.checkString((String)hash1.get("elec_note_key"));

    	String mode2 = Util.checkString((String)hash2.get("m"));
    	String acct_mang_no2 = Util.checkString((String)hash2.get("acct_mang_no"));
    	String rmtt_dt2 = Util.checkString((String)hash2.get("rmtt_dt"));
    	String amt2 = Util.checkString((String)hash2.get("amt"));
    	String rmtt_coms2 = Util.checkString((String)hash2.get("rmtt_coms"));
    	String rmtt_plac2 = Util.checkString((String)hash2.get("rmtt_plac"));
    	
    	String biz_reg_no2 		= Util.checkString((String)hash2.get("biz_reg_no"));
    	String bank_id2 		= Util.checkString((String)hash2.get("bank_id"));
    	String acct_num2 		= Util.checkString((String)hash2.get("acct_num"));
    	String tran_date_seq2 	= Util.checkString((String)hash2.get("tran_date_seq"));
    	String current_clsf2 	= Util.checkString((String)hash2.get("current_clsf"));
    	String curc_clsf2 		= Util.checkString((String)hash2.get("acct_tonghwa"));
    	String frex_amt2 		= Util.checkString((String)hash2.get("frex_amt"));
    	String card_yn          = Util.checkString((String)hash2.get("card_yn"));

    	String mode3 = Util.checkString((String)hash3.get("m"));
    	String checked3 = Util.checkString((String)hash3.get("checked"));
    	String medi_cd3 = Util.checkString((String)hash3.get("medi_cd"));
    	String amt3 = Util.checkString((String)hash3.get("amt"));
    	String rcpm_slip_no3 = Util.checkString((String)hash3.get("rcpm_slip_no"));
    	String occr_dt3 = Util.checkString((String)hash3.get("occr_dt"));
    	String slip_clsf3 = Util.checkString((String)hash3.get("slip_clsf"));
    	String seq3 = Util.checkString((String)hash3.get("seq"));
    	String subseq3 = Util.checkString((String)hash3.get("subseq"));

    	String mode4 			= Util.checkString((String)hash4.get("m"));
    	String checked4 		= Util.checkString((String)hash4.get("checked"));
    	String swit_dlco4 		= Util.checkString((String)hash4.get("swit_dlco"));
    	String amt4 			= Util.checkString((String)hash4.get("amt"));
    	String rcpm_slip_no4 	= Util.checkString((String)hash4.get("rcpm_slip_no"));
    	String budg_cd4 		= Util.checkString((String)hash4.get("budg_cd"));
    	String occr_dt4 		= Util.checkString((String)hash4.get("occr_dt"));
    	String slip_clsf4 		= Util.checkString((String)hash4.get("slip_clsf"));
    	String seq4 			= Util.checkString((String)hash4.get("seq"));
    	String subseq4 			= Util.checkString((String)hash4.get("subseq"));

    	String mode5 = Util.checkString((String)hash5.get("m"));
    	String checked5 = Util.checkString((String)hash5.get("checked"));
    	String budg_cd5 = Util.checkString((String)hash5.get("budg_cd"));
    	String amt5 = Util.checkString((String)hash5.get("amt"));
    	//모바일상품권일경우 상계전표가 넘어옴
    	String rcpm_slip_no5 = "";
    	if(!"".equals(Util.checkString((String)hash5.get("setoff_slip_no")))){
    		rcpm_slip_no5 = Util.checkString((String)hash5.get("setoff_slip_no"));
    	}else{
    		rcpm_slip_no5 = Util.checkString((String)hash5.get("rcpm_slip_no"));
    	}
    	String occr_dt5 = Util.checkString((String)hash5.get("occr_dt"));
    	String slip_clsf5 = Util.checkString((String)hash5.get("slip_clsf"));
    	String seq5 = Util.checkString((String)hash5.get("seq"));
    	String subseq5 = Util.checkString((String)hash5.get("subseq"));
    	
    	String medi_cd6 = Util.checkString((String)hash6.get("medi_cd"));
    	String amt6 = Util.checkString((String)hash6.get("amt"));
    	
    	String depo_job_clsf7 = Util.checkString((String)hash7.get("depo_job_clsf"));
    	String amt7 = Util.checkString((String)hash7.get("amt"));
    	String swit_dlco7 = Util.checkString((String)hash7.get("swit_dlco"));
    	
    	String amt8 = Util.checkString((String)hash8.get("amt"));
    	String budg_cd8 = Util.checkString((String)hash8.get("budg_cd"));
    	
    	String incmg_pers_ip = req.getRemoteAddr();
    	String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
    	
        AD_DEP_1020_ADM dm = new AD_DEP_1020_ADM();
        
        dm.setMedi_clsf(medi_clsf);
        dm.setCmpy_cd(cmpy_cd);
        dm.setOccr_dt(occr_dt);
        dm.setSlip_clsf(slip_clsf);
//        dm.setSeq(seq);
        dm.setRcpm_shet_no(rcpm_shet_no);
        dm.setSelf_cmpy_yn(self_cmpy_yn);
        dm.setRcpm_acct(rcpm_acct);
        dm.setRcpm_plac_clsf(rcpm_plac_clsf);
        dm.setDlco_no(dlco_no);
        dm.setMedi_cd(medi_cd);
        dm.setSale_aprv_no(sale_aprv_no);
        dm.setDept_cd(dept_cd);
        dm.setMchrg_pers(mchrg_pers);
        dm.setAdvt_tot_amt(advt_tot_amt);
        dm.setRcpm_tot_amt(rcpm_tot_amt);
        dm.setCash_amt(cash_amt);
        dm.setFee_amt(fee_amt);
        
        dm.setNote_no1(note_no1);
        dm.setBank_cd1(bank_cd1);
        dm.setNote_clsf_cd1(note_clsf_cd1);
        dm.setComp_dt1(comp_dt1);
        dm.setMtry_dt1(mtry_dt1);
        dm.setNote_amt1(note_amt1);
        dm.setSale_dscn_amt1(sale_dscn_amt1);
        dm.setIssu_cmpy_clsf_cd1(issu_cmpy_clsf_cd1);
        dm.setIssu_pers_nm1(issu_pers_nm1);
        dm.setElec_note_key(elec_note_key);

        dm.setMode2(mode2.toUpperCase());
        dm.setAcct_mang_no2(acct_mang_no2);
        dm.setRmtt_dt2(rmtt_dt2);
        dm.setAmt2(amt2);
        dm.setRmtt_coms2(rmtt_coms2);
        dm.setRmtt_plac2(rmtt_plac2);
        dm.setBiz_reg_no2(biz_reg_no2);
        dm.setBank_id2(bank_id2);
        dm.setAcct_num2(acct_num2);
        dm.setTran_date_seq2(tran_date_seq2);
        dm.setCurrent_clsf2(current_clsf2);
        dm.setCurc_clsf2(curc_clsf2);
        dm.setFrex_amt2(StringUtil.strip(frex_amt2,","));
        dm.setCard_yn(card_yn);
        dm.setChnl_clsf(chnl_clsf);

        dm.setMode3(mode3.toUpperCase());
        dm.setChecked3(checked3);
        dm.setMedi_cd3(medi_cd3);
        dm.setAmt3(amt3);
        dm.setRcpm_slip_no3(rcpm_slip_no3);
        dm.setOccr_dt3(occr_dt3);
        dm.setSlip_clsf3(slip_clsf3);
        dm.setSeq3(seq3);
        dm.setSubseq3(subseq3);

        dm.setMode4(mode4.toUpperCase());
        dm.setChecked4(checked4);
        dm.setSwit_dlco4(swit_dlco4);
        dm.setAmt4(amt4);
        dm.setRcpm_slip_no4(rcpm_slip_no4);
        dm.setBudg_cd4(budg_cd4);
        dm.setOccr_dt4(occr_dt4);
        dm.setSlip_clsf4(slip_clsf4);
        dm.setSeq4(seq4);
        dm.setSubseq4(subseq4);

        dm.setMode5(mode5.toUpperCase());
        dm.setChecked5(checked5);
        dm.setBudg_cd5(budg_cd5);
        dm.setAmt5(amt5);
        dm.setRcpm_slip_no5(rcpm_slip_no5);
        dm.setOccr_dt5(occr_dt5);
        dm.setSlip_clsf5(slip_clsf5);
        dm.setSeq5(seq5);
        dm.setSubseq5(subseq5);
        
        dm.setMedi_cd6(medi_cd6);
        dm.setAmt6(amt6);
        
        dm.setDepo_job_clsf7(depo_job_clsf7);
        dm.setAmt7(amt7);
        dm.setSwit_dlco7(swit_dlco7);
        
        dm.setAmt8(amt8);
        dm.setBudg_cd8(budg_cd8);
        
        dm.setIncmg_pers_ip(incmg_pers_ip);
        dm.setIncmg_pers(incmg_pers);
        
        dm.print();

        try {
        	AdDep1000DAO	dao = new AdDep1000DAO();
            ds = dao.ad_dep_1020_a(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        }  
//        
//        AdDep1000EJBHome home = (AdDep1000EJBHome) JNDIManager.getInstance().getHome("AdDep1000EJB");
//        try {
//        	AdDep1000EJB ejb = home.create();
//            ds = ejb.ad_dep_1020_a(dm);
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
    public void ad_dep_1030_a(HttpServletRequest req, HttpServletResponse pub) throws   AppException {
    	
    	AD_DEP_1030_ADataSet ds = null;

        // DM Setting

    	String medi_clsf 		= Util.getSessionParameterValue(req, "dealmedicd", true);
    	String occr_dt 			= Util.checkString(req.getParameter("occr_dt"));
    	String slip_clsf 		= Util.checkString(req.getParameter("slip_clsf"));
    	String seq 				= Util.checkString(req.getParameter("seq"));
    	String rcpm_shet_no 	= Util.checkString(req.getParameter("rcpm_shet_no"));
    	String self_cmpy_yn 	= Util.checkString(req.getParameter("self_cmpy_yn"));
    	String rcpm_acct 		= Util.checkString(req.getParameter("rcpm_acct"));
    	String rcpm_plac_clsf 	= Util.checkString(req.getParameter("rcpm_plac_clsf"));
    	String dlco_no 			= Util.checkString(req.getParameter("dlco_no"));
    	String medi_cd 			= Util.checkString(req.getParameter("medi_cd"));
    	String sale_aprv_no 	= Util.checkString(req.getParameter("sale_aprv_no"));
    	String dept_cd 			= Util.checkString(req.getParameter("dept_cd"));
    	String mchrg_pers 		= Util.checkString(req.getParameter("mchrg_pers"));
    	String advt_tot_amt 	= Util.checkString(req.getParameter("advt_tot_amt"));
    	String rcpm_tot_amt 	= Util.checkString(req.getParameter("rcpm_tot_amt"));
//현금    	
    	String cash_amt 		= Util.checkString(req.getParameter("cash_amt"));
//대행료대체    	
    	String fee_amt 			= Util.checkString(req.getParameter("fee_amt")); 
    	
    	String multiUpdateData1 = Util.checkString(req.getParameter("multiUpdateData1"));
    	String multiUpdateData2 = Util.checkString(req.getParameter("multiUpdateData2"));
    	String multiUpdateData3 = Util.checkString(req.getParameter("multiUpdateData3"));
    	String multiUpdateData4 = Util.checkString(req.getParameter("multiUpdateData4"));
    	String multiUpdateData5 = Util.checkString(req.getParameter("multiUpdateData5"));
    	String multiUpdateData6 = Util.checkString(req.getParameter("multiUpdateData6"));
    	String multiUpdateData7 = Util.checkString(req.getParameter("multiUpdateData7"));
    	String multiUpdateData8 = Util.checkString(req.getParameter("multiUpdateData8"));
    	
    	Hashtable hash1 = getHashMultiUpdateData(multiUpdateData1);
    	Hashtable hash2 = getHashMultiUpdateData(multiUpdateData2);
    	Hashtable hash3 = getHashMultiUpdateData(multiUpdateData3);
    	Hashtable hash4 = getHashMultiUpdateData(multiUpdateData4);
    	Hashtable hash5 = getHashMultiUpdateData(multiUpdateData5);
    	Hashtable hash6 = getHashMultiUpdateData(multiUpdateData6);
    	Hashtable hash7 = getHashMultiUpdateData(multiUpdateData7);
    	Hashtable hash8 = getHashMultiUpdateData(multiUpdateData8);
//어음    	
    	String note_no1 		= Util.checkString((String)hash1.get("note_no"));
    	String bank_cd1 		= Util.checkString((String)hash1.get("bank_cd"));
    	String note_clsf_cd1 	= Util.checkString((String)hash1.get("note_clsf_cd"));
    	String comp_dt1 		= Util.checkString((String)hash1.get("comp_dt"));
    	String mtry_dt1 		= Util.checkString((String)hash1.get("mtry_dt"));
    	String note_amt1 		= Util.checkString((String)hash1.get("note_amt"));
    	String sale_dscn_amt1 	= Util.checkString((String)hash1.get("sale_dscn_amt"));
    	String issu_cmpy_clsf_cd1 = Util.checkString((String)hash1.get("issu_cmpy_clsf_cd"));
    	String issu_pers_nm1 	= Util.checkString((String)hash1.get("issu_pers_nm"));
    	String elec_note_key 	= Util.checkString((String)hash1.get("elec_note_key"));
//계좌입금내역
    	String mode2 			= Util.checkString((String)hash2.get("m"));
    	String acct_mang_no2 	= Util.checkString((String)hash2.get("acct_mang_no"));
    	String rmtt_dt2 		= Util.checkString((String)hash2.get("rmtt_dt"));
    	String amt2 			= Util.checkString((String)hash2.get("amt"));
    	String rmtt_coms2 		= Util.checkString((String)hash2.get("rmtt_coms"));
    	String rmtt_plac2 		= Util.checkString((String)hash2.get("rmtt_plac"));
    	String biz_reg_no2 		= Util.checkString((String)hash2.get("biz_reg_no"));
    	String bank_id2 		= Util.checkString((String)hash2.get("bank_id"));
    	String acct_num2 		= Util.checkString((String)hash2.get("acct_num"));
    	String tran_date_seq2 	= Util.checkString((String)hash2.get("tran_date_seq"));
    	String current_clsf2 	= Util.checkString((String)hash2.get("current_clsf"));
    	String curc_clsf2 		= Util.checkString((String)hash2.get("acct_tonghwa"));
    	String frex_amt2 		= Util.checkString((String)hash2.get("frex_amt"));
    	String card_yn          = Util.checkString((String)hash2.get("card_yn"));
    	String card_coms        = Util.checkString((String)hash2.get("rmtt_coms"));
    	String tax_no           = Util.checkString((String)hash2.get("tax_no"));    	
//선수금대체내역
    	String mode3 			= Util.checkString((String)hash3.get("m"));
    	String checked3 		= Util.checkString((String)hash3.get("checked"));
    	String medi_cd3 		= Util.checkString((String)hash3.get("medi_cd"));
    	String amt3 			= Util.checkString((String)hash3.get("amt"));
    	String rcpm_slip_no3 	= Util.checkString((String)hash3.get("rcpm_slip_no"));
    	String occr_dt3 		= Util.checkString((String)hash3.get("occr_dt"));
    	String slip_clsf3 		= Util.checkString((String)hash3.get("slip_clsf"));
    	String seq3 			= Util.checkString((String)hash3.get("seq"));
    	String subseq3 			= Util.checkString((String)hash3.get("subseq"));
//예수금대체
    	String mode4 			= Util.checkString((String)hash4.get("m"));
    	String checked4 		= Util.checkString((String)hash4.get("checked"));
    	String swit_dlco4 		= Util.checkString((String)hash4.get("swit_dlco"));
    	String amt4 			= Util.checkString((String)hash4.get("amt"));
    	String rcpm_slip_no4 	= Util.checkString((String)hash4.get("rcpm_slip_no"));
    	String budg_cd4 		= Util.checkString((String)hash4.get("budg_cd"));
    	String occr_dt4 		= Util.checkString((String)hash4.get("occr_dt"));
    	String slip_clsf4	 	= Util.checkString((String)hash4.get("slip_clsf"));
    	String seq4 			= Util.checkString((String)hash4.get("seq"));
    	String subseq4 			= Util.checkString((String)hash4.get("subseq"));
//기타입금대체
    	String mode5 			= Util.checkString((String)hash5.get("m"));
    	String checked5 		= Util.checkString((String)hash5.get("checked"));
    	String budg_cd5 		= Util.checkString((String)hash5.get("budg_cd"));
    	String amt5 			= Util.checkString((String)hash5.get("amt"));
    	//모바일상품권일경우 상계전표가 넘어옴
    	String rcpm_slip_no5 = "";
    	if(!"".equals(Util.checkString((String)hash5.get("setoff_slip_no")))){
    		rcpm_slip_no5 = Util.checkString((String)hash5.get("setoff_slip_no"));
    	}else{
    		rcpm_slip_no5 = Util.checkString((String)hash5.get("rcpm_slip_no"));
    	}    	
    	//String rcpm_slip_no5 	= Util.checkString((String)hash5.get("rcpm_slip_no"));
    	String occr_dt5 		= Util.checkString((String)hash5.get("occr_dt"));
    	String slip_clsf5 		= Util.checkString((String)hash5.get("slip_clsf"));
    	String seq5 			= Util.checkString((String)hash5.get("seq"));
    	String subseq5 			= Util.checkString((String)hash5.get("subseq"));
//선수금    	
    	String medi_cd6 		= Util.checkString((String)hash6.get("medi_cd"));
    	String amt6 			= Util.checkString((String)hash6.get("amt"));
//예수금    	
    	String depo_job_clsf7 	= Util.checkString((String)hash7.get("depo_job_clsf"));
    	String amt7 			= Util.checkString((String)hash7.get("amt"));
    	String swit_dlco7 		= Util.checkString((String)hash7.get("swit_dlco"));
//기타입금    	
    	String amt8 			= Util.checkString((String)hash8.get("amt"));
    	String budg_cd8 		= Util.checkString((String)hash8.get("budg_cd"));
    	
        String cmpy_cd    		= Util.getSessionParameterValue(req, "cmpycd", true);
        String incmg_pers 		= Util.getSessionParameterValue(req, "emp_no", true);
        String incmg_pers_ip 	= req.getRemoteAddr();
        String chnl_clsf 		= Util.checkString(req.getParameter("chnl_clsf"));
        
        AD_DEP_1030_ADM dm = new AD_DEP_1030_ADM();
        
        dm.setMedi_clsf(medi_clsf); 
        dm.setCmpy_cd(cmpy_cd);
        dm.setOccr_dt(occr_dt);
        dm.setSlip_clsf(slip_clsf);
        dm.setSeq(seq);
        dm.setRcpm_shet_no(rcpm_shet_no);
        dm.setSelf_cmpy_yn(self_cmpy_yn); 
        dm.setRcpm_acct(rcpm_acct);
        dm.setRcpm_plac_clsf(rcpm_plac_clsf);
        dm.setDlco_no(dlco_no);
        dm.setMedi_cd(medi_cd);
        dm.setSale_aprv_no(sale_aprv_no);
        dm.setDept_cd(dept_cd);
        dm.setMchrg_pers(mchrg_pers);
        dm.setAdvt_tot_amt(advt_tot_amt);
        dm.setRcpm_tot_amt(rcpm_tot_amt);
        dm.setCash_amt(cash_amt);
        dm.setFee_amt(fee_amt);
        
        dm.setNote_no1(note_no1);
        dm.setBank_cd1(bank_cd1);
        dm.setNote_clsf_cd1(note_clsf_cd1);
        dm.setComp_dt1(comp_dt1);
        dm.setMtry_dt1(mtry_dt1);
        dm.setNote_amt1(note_amt1);
        dm.setSale_dscn_amt1(sale_dscn_amt1);
        dm.setIssu_cmpy_clsf_cd1(issu_cmpy_clsf_cd1);
        dm.setIssu_pers_nm1(issu_pers_nm1);
        dm.setElec_note_key(elec_note_key);

        dm.setMode2(mode2.toUpperCase());
        dm.setAcct_mang_no2(acct_mang_no2);
        dm.setRmtt_dt2(rmtt_dt2);
        dm.setAmt2(amt2);
        dm.setRmtt_coms2(rmtt_coms2);
        dm.setRmtt_plac2(rmtt_plac2);
        dm.setBiz_reg_no2(biz_reg_no2);
        dm.setBank_id2(bank_id2);
        dm.setAcct_num2(acct_num2);
        dm.setTran_date_seq2(tran_date_seq2);
        dm.setCurrent_clsf2(current_clsf2);
        dm.setCurc_clsf2(curc_clsf2);
        dm.setFrex_amt2(frex_amt2);
//        dm.setCard_yn(card_yn);
//        dm.setCard_coms(card_coms);
//        dm.setTax_no(tax_no);
        
        dm.setMode3(mode3.toUpperCase());
        dm.setChecked3(checked3);
        dm.setMedi_cd3(medi_cd3);
        dm.setAmt3(amt3);
        dm.setRcpm_slip_no3(rcpm_slip_no3);
        dm.setOccr_dt3(occr_dt3);
        dm.setSlip_clsf3(slip_clsf3);
        dm.setSeq3(seq3);
        dm.setSubseq3(subseq3);

        dm.setMode4(mode4.toUpperCase());
        dm.setChecked4(checked4);
        dm.setSwit_dlco4(swit_dlco4);
        dm.setAmt4(amt4);
        dm.setRcpm_slip_no4(rcpm_slip_no4);
        dm.setBudg_cd4(budg_cd4);
        dm.setOccr_dt4(occr_dt4);
        dm.setSlip_clsf4(slip_clsf4);
        dm.setSeq4(seq4);
        dm.setSubseq4(subseq4);

        dm.setMode5(mode5.toUpperCase());
        dm.setChecked5(checked5);
        dm.setBudg_cd5(budg_cd5);
        dm.setAmt5(amt5);
        dm.setRcpm_slip_no5(rcpm_slip_no5);
        dm.setOccr_dt5(occr_dt5);
        dm.setSlip_clsf5(slip_clsf5);
        dm.setSeq5(seq5);
        dm.setSubseq5(subseq5);
        
        dm.setMedi_cd6(medi_cd6);
        dm.setAmt6(amt6);

        dm.setDepo_job_clsf7(depo_job_clsf7);
        dm.setAmt7(amt7);
        dm.setSwit_dlco7(swit_dlco7);
        
        dm.setAmt8(amt8);
        dm.setBudg_cd8(budg_cd8);
        
        dm.setIncmg_pers_ip(incmg_pers_ip); 
        dm.setIncmg_pers(incmg_pers);
        dm.setChnl_clsf(chnl_clsf);
//        dm.print();

        try {
        	AdDep1000DAO	dao = new AdDep1000DAO();
            ds = dao.ad_dep_1030_a(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        }  
//        
//        AdDep1000EJBHome home = (AdDep1000EJBHome) JNDIManager.getInstance().getHome("AdDep1000EJB");
//        try {
//        	AdDep1000EJB ejb = home.create();
//            ds = ejb.ad_dep_1030_a(dm);
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
    public void ad_dep_1040_a(HttpServletRequest req, HttpServletResponse pub) throws   AppException {
    	
    	AD_DEP_1040_ADataSet ds = null;

        // DM Setting

    	String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);
    	String medi_clsf = Util.getSessionParameterValue(req, "dealmedicd", true);
    	String occr_dt = Util.checkString(req.getParameter("occr_dt"));
    	String slip_clsf = Util.checkString(req.getParameter("slip_clsf"));
    	String seq = Util.checkString(req.getParameter("seq"));

    	String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);

        AD_DEP_1040_ADM dm = new AD_DEP_1040_ADM();
        
        dm.setMedi_clsf(medi_clsf); 
        dm.setCmpy_cd(cmpy_cd);
        dm.setOccr_dt(occr_dt);
        dm.setSlip_clsf(slip_clsf);
        dm.setSeq(seq);
        dm.setIncmg_pers(incmg_pers);
        
//        //dm.print();

        try {
        	AdDep1000DAO	dao = new AdDep1000DAO();
            ds = dao.ad_dep_1040_a(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        }  
//        
//        AdDep1000EJBHome home = (AdDep1000EJBHome) JNDIManager.getInstance().getHome("AdDep1000EJB");
//        try {
//        	AdDep1000EJB ejb = home.create();
//            ds = ejb.ad_dep_1040_a(dm);
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
    public void ad_dep_1050_m(HttpServletRequest req, HttpServletResponse pub) throws   AppException {
    	
    	AD_DEP_1050_MDataSet ds = null;

        // DM Setting
    	AD_DEP_1050_MDM dm = new AD_DEP_1050_MDM();
    	String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);
    	String medi_clsf   = Util.getSessionParameterValue(req, "dealmedicd", true);
    	
        dm.setCmpy_cd(cmpy_cd);
        dm.setMedi_clsf(medi_clsf);
        
//        //dm.print();

        try {
        	AdDep1000DAO	dao = new AdDep1000DAO();
            ds = dao.ad_dep_1050_m(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        }  
//        
//        AdDep1000EJBHome home = (AdDep1000EJBHome) JNDIManager.getInstance().getHome("AdDep1000EJB");
//        try {
//        	AdDep1000EJB ejb = home.create();
//            ds = ejb.ad_dep_1050_m(dm);
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
    public void ad_dep_1051_l(HttpServletRequest req, HttpServletResponse pub) throws   AppException {
    	
    	AD_DEP_1051_LDataSet ds = null;

        // DM Setting
    	AD_DEP_1051_LDM dm = new AD_DEP_1051_LDM();
    	String flag 	= Util.checkString(req.getParameter("flag"));
    	String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);
    	String occr_dt 	= Util.checkString(req.getParameter("occr_dt"));
    	String slip_clsf = Util.checkString(req.getParameter("slip_clsf"));
    	String seq = Util.checkString(req.getParameter("seq"));
    	String pubc_frdt = Util.checkString(req.getParameter("pubc_frdt"));
    	String pubc_todt = Util.checkString(req.getParameter("pubc_todt"));
    	String chnl_clsf = Util.checkString(req.getParameter("chnl_clsf"));
    	
        dm.setFlag(flag);
        dm.setCmpy_cd(cmpy_cd);
        dm.setOccr_dt(occr_dt);
        dm.setSlip_clsf(slip_clsf);
        dm.setSeq(seq);
        dm.setPubc_frdt(pubc_frdt);
        dm.setPubc_todt(pubc_todt);
        dm.setChnl_clsf(chnl_clsf);
         
       // dm.print();

        try {
        	AdDep1000DAO	dao = new AdDep1000DAO();
            ds = dao.ad_dep_1051_l(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        }  
//        
//        AdDep1000EJBHome home = (AdDep1000EJBHome) JNDIManager.getInstance().getHome("AdDep1000EJB");
//        try {
//        	AdDep1000EJB ejb = home.create();
//            ds = ejb.ad_dep_1051_l(dm);
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

    public void ad_dep_1055_a(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	DBManager manager        = null;
    	AD_DEP_1055_ADataSet ds = null;
		CallableStatement cstmt = null;
			
        // DM Setting
    	String flag = Util.checkString(req.getParameter("flag"));
    	String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);
    	String occr_dt = Util.checkString(req.getParameter("occr_dt"));
    	String slip_clsf = Util.checkString(req.getParameter("slip_clsf"));
    	String seq = Util.checkString(req.getParameter("seq"));
    	String rcpm_plac_clsf = Util.checkString(req.getParameter("rcpm_plac_clsf"));
    	String incmg_pers_ip = req.getRemoteAddr();
    	String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);

    	String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
    	
    	Hashtable hash = getHashMultiUpdateData(multiUpdateData);

    	String[] setoff_yn 	     =  Util.checkString((String)hash.get("setoff_yn")).split("#" );
    	String[] setoff_advt_fee =  Util.checkString((String)hash.get("setoff_advt_fee")).split("#" );
    	String[] setoff_advt_vat =  Util.checkString((String)hash.get("setoff_advt_vat")).split("#" );
    	String[] pubc_slip_no    =  Util.checkString((String)hash.get("pubc_slip_no")).split("#" );
    	String[] pubc_dt         =  Util.checkString((String)hash.get("pubc_dt")).split("#" );
    	
    	AD_DEP_1055_ADM dm = new AD_DEP_1055_ADM();

        try {
					//0.DB연결
    		manager = new DBManager("MISADV");
	       	manager.getConnection();
	       	manager.m_conn.setAutoCommit(false);        

			for( int row=0; row<pubc_slip_no.length; row++){
		        dm.setFlag(flag+(pubc_slip_no.length-1));
		        dm.setCmpy_cd(cmpy_cd);
		        dm.setOccr_dt(occr_dt);
		        dm.setSlip_clsf(slip_clsf);
		        dm.setSeq(seq);
		        dm.setRcpm_plac_clsf(rcpm_plac_clsf);
		        
		        dm.setSetoff_yn(setoff_yn[row]+row);
		        dm.setSetoff_advt_fee(setoff_advt_fee[row]);
		        dm.setSetoff_advt_vat(setoff_advt_vat[row]);
		        dm.setPubc_slip_no(pubc_slip_no[row]);
		        dm.setPubc_dt(pubc_dt[row]);
		        
		        dm.setIncmg_pers_ip(incmg_pers_ip);
		        dm.setIncmg_pers(incmg_pers);
			   	dm.print();
			    	
		     	cstmt = manager.m_conn.prepareCall(dm.getSQL());
		       	// 파라미터 설정
		       	dm.setParams(cstmt,dm);
		       	// 실행
		       	cstmt.execute();		       		

		        // 결과
		       	ds = (AD_DEP_1055_ADataSet) dm.createDataSetObject();
		       	ds.getValues(cstmt);
		       	cstmt.close();
		       	if (!"".equals(ds.errcode)) {
			            throw new AppException(ds.errcode, ds.errmsg);
		        }
	    		System.out.println("AD_DEP_1055_A 실행완료"+row);		 
			}//for  
			manager.commit();
        }
	    catch (AppException e) {
		      if (manager != null ){
		          manager.rollback();
		      }
             throw e;   
		}catch (SQLException e) {
		    if (manager != null)
		          manager.rollback();	
	    	  throw new SysException(e);
		}catch (Exception e) {
		      if (manager != null)
		          manager.rollback();	
	    	  throw new SysException(e);
	    } finally {	    	
		    if (manager != null)	
		    	manager.disConnection();
	    }
            req.setAttribute("ds", ds);         
    }
/*   
    public void ad_dep_1055_a(HttpServletRequest req, HttpServletResponse pub) throws   AppException {
    	
    	AD_DEP_1055_ADataSet ds = null;

        // DM Setting
    	String flag = Util.checkString(req.getParameter("flag"));
    	String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);
    	String occr_dt = Util.checkString(req.getParameter("occr_dt"));
    	String slip_clsf = Util.checkString(req.getParameter("slip_clsf"));
    	String seq = Util.checkString(req.getParameter("seq"));
    	String rcpm_plac_clsf = Util.checkString(req.getParameter("rcpm_plac_clsf"));
    	String incmg_pers_ip = req.getRemoteAddr();
    	String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);

    	String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
    	
    	Hashtable hash = getHashMultiUpdateData(multiUpdateData);
    	
    	String setoff_yn 	   = Util.checkString((String)hash.get("setoff_yn"));
    	String setoff_advt_fee = Util.checkString((String)hash.get("setoff_advt_fee"));
    	String setoff_advt_vat = Util.checkString((String)hash.get("setoff_advt_vat"));
    	String pubc_slip_no    = Util.checkString((String)hash.get("pubc_slip_no"));
    	String pubc_dt         = Util.checkString((String)hash.get("pubc_dt"));
    	
        AD_DEP_1055_ADM dm = new AD_DEP_1055_ADM();
        dm.setFlag(flag);
        dm.setCmpy_cd(cmpy_cd);
        dm.setOccr_dt(occr_dt);
        dm.setSlip_clsf(slip_clsf);
        dm.setSeq(seq);
        dm.setRcpm_plac_clsf(rcpm_plac_clsf);
        dm.setSetoff_yn(setoff_yn);
        dm.setSetoff_advt_fee(setoff_advt_fee);
        dm.setSetoff_advt_vat(setoff_advt_vat);
        dm.setPubc_slip_no(pubc_slip_no);
        dm.setPubc_dt(pubc_dt);
        dm.setIncmg_pers_ip(incmg_pers_ip);
        dm.setIncmg_pers(incmg_pers);
        
        dm.print();

        try {
        	AdDep1000DAO	dao = new AdDep1000DAO();
            ds = dao.ad_dep_1055_a(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        }  
    } 
    */       
}

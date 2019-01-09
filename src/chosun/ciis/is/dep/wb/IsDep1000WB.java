/***************************************************************************************************
* 파일명 : 
* 기능 : 
 * 작성일자 : 
 * 작성자 : 
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/

package chosun.ciis.is.dep.wb;

import java.util.Hashtable;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.util.Util;
import chosun.ciis.is.dep.dao.IsDep1000DAO;
import chosun.ciis.is.dep.dm.*;
import chosun.ciis.is.dep.ds.*;

import chosun.ciis.ad.dep.dao.AdDep1000DAO;
import chosun.ciis.ad.dep.dm.AD_DEP_1020_ADM;
import chosun.ciis.ad.dep.dm.AD_DEP_1030_ADM;
import chosun.ciis.ad.dep.dm.AD_DEP_1040_ADM;
import chosun.ciis.ad.dep.dm.AD_DEP_1050_MDM;
import chosun.ciis.ad.dep.dm.AD_DEP_4350_ADM;
import chosun.ciis.ad.dep.ds.AD_DEP_1020_ADataSet;
import chosun.ciis.ad.dep.ds.AD_DEP_1030_ADataSet;
import chosun.ciis.ad.dep.ds.AD_DEP_1040_ADataSet;
import chosun.ciis.ad.dep.ds.AD_DEP_1050_MDataSet;
import chosun.ciis.co.base.util.StringUtil;
import chosun.ciis.co.base.wb.BaseWB;
/**
 * 
 */

public class IsDep1000WB extends BaseWB {
	
	/**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void is_dep_1000_m(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_DEP_1000_MDataSet ds = null;

        // DM Setting
    	IS_DEP_1000_MDM dm = new IS_DEP_1000_MDM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
    	dm.medi_clsf = Util.checkString(req.getParameter("medi_clsf")); /**사용안함**/
        dm.print();
     
        try {
        	IsDep1000DAO dao = new IsDep1000DAO();
            ds = dao.is_dep_1000_m(dm);
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
    public void is_dep_1010_s(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_DEP_1010_SDataSet ds = null;

        // DM Setting
    	IS_DEP_1010_SDM dm = new IS_DEP_1010_SDM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.occr_dt = Util.checkString(req.getParameter("occr_dt"));
		dm.slip_clsf = Util.checkString(req.getParameter("slip_clsf"));
		dm.seq = Util.checkString(req.getParameter("seq"));
        dm.print();
     
        try {
        	IsDep1000DAO dao = new IsDep1000DAO();
        	 ds = dao.is_dep_1010_s(dm);
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
    public void is_dep_1011_l(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_DEP_1011_LDataSet ds = null;

        // DM Setting
    	IS_DEP_1011_LDM dm = new IS_DEP_1011_LDM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.dlco_no = Util.checkString(req.getParameter("dlco_no"));
        dm.print();
     
        try {
        	IsDep1000DAO dao = new IsDep1000DAO();
        	 ds = dao.is_dep_1011_l(dm);
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
    public void is_dep_1012_l(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_DEP_1012_LDataSet ds = null;

        // DM Setting
    	IS_DEP_1012_LDM dm = new IS_DEP_1012_LDM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.dlco_no = Util.checkString(req.getParameter("dlco_no"));
        dm.print();
     
        try {
        	IsDep1000DAO dao = new IsDep1000DAO();
        	 ds = dao.is_dep_1012_l(dm);
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
    public void is_dep_1013_l(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_DEP_1013_LDataSet ds = null;

        // DM Setting
    	IS_DEP_1013_LDM dm = new IS_DEP_1013_LDM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.dlco_no = Util.checkString(req.getParameter("dlco_no"));
        dm.print();
     
        try {
        	IsDep1000DAO dao = new IsDep1000DAO();
        	 ds = dao.is_dep_1013_l(dm);
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
    public void is_dep_1014_l(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_DEP_1014_LDataSet ds = null;

        // DM Setting
    	IS_DEP_1014_LDM dm = new IS_DEP_1014_LDM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
    	dm.slip_clsf = Util.checkString(req.getParameter("slip_clsf_p"));
		dm.slip_no = Util.checkString(req.getParameter("slip_no_p"));
        dm.print();
     
        try {
        	IsDep1000DAO dao = new IsDep1000DAO();
        	 ds = dao.is_dep_1014_l(dm);
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
     * @param pub HttpServletResponse
     * @throws AppException
     */
    public void is_dep_1020_a(HttpServletRequest req, HttpServletResponse pub) throws   AppException {
    	
    	IS_DEP_1020_ADataSet ds = null;

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
//    	String cash_amt = Util.checkString(req.getParameter("cash_amt"));
    	String fee_amt = Util.checkString(req.getParameter("fee_amt"));
    	
    	String multiUpdateData1 = Util.checkString(req.getParameter("multiUpdateData1"));
    	String multiUpdateData2 = Util.checkString(req.getParameter("multiUpdateData2"));
    	String multiUpdateData3 = Util.checkString(req.getParameter("multiUpdateData3"));
    	String multiUpdateData4 = Util.checkString(req.getParameter("multiUpdateData4"));
    	String multiUpdateData5 = Util.checkString(req.getParameter("multiUpdateData5"));
    	String multiUpdateData6 = Util.checkString(req.getParameter("multiUpdateData6"));
    	String multiUpdateData7 = Util.checkString(req.getParameter("multiUpdateData7"));
    	String multiUpdateData8 = Util.checkString(req.getParameter("multiUpdateData8"));
    	String multiUpdateData9 = Util.checkString(req.getParameter("multiUpdateData9"));
    	
    	Hashtable hash1 = getHashMultiUpdateData(multiUpdateData1);
    	Hashtable hash2 = getHashMultiUpdateData(multiUpdateData2);	/**통장입금**/
    	Hashtable hash3 = getHashMultiUpdateData(multiUpdateData3);
    	Hashtable hash4 = getHashMultiUpdateData(multiUpdateData4);
    	Hashtable hash5 = getHashMultiUpdateData(multiUpdateData5);
    	Hashtable hash6 = getHashMultiUpdateData(multiUpdateData6);
    	Hashtable hash7 = getHashMultiUpdateData(multiUpdateData7);
    	Hashtable hash8 = getHashMultiUpdateData(multiUpdateData8);
    	Hashtable hash9 = getHashMultiUpdateData(multiUpdateData9);
    	
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
/**통장입금  변수 시작**/
    	String mode2 = Util.checkString((String)hash2.get("m"));
    	String acct_mang_no2 = Util.checkString((String)hash2.get("acct_mang_no"));
    	String rmtt_dt2 = Util.checkString((String)hash2.get("rmtt_dt"));
    	String amt2 = Util.checkString((String)hash2.get("amt"));
    	String rmtt_coms2 = Util.checkString((String)hash2.get("rmtt_coms"));
    	String rmtt_plac2 = Util.checkString((String)hash2.get("rmtt_plac"));
    	String card_rcpm_yn2 = Util.checkString((String)hash2.get("card_rcpm_yn"));
    	String card_mang_no2 = Util.checkString((String)hash2.get("card_mang_no"));
    	
    	String biz_reg_no2 = Util.checkString((String)hash2.get("biz_reg_no"));
    	String bank_id2 = Util.checkString((String)hash2.get("bank_id"));
    	String acct_num2 = Util.checkString((String)hash2.get("acct_num"));
    	String tran_date_seq2 = Util.checkString((String)hash2.get("tran_date_seq"));
    	String current_clsf2 = Util.checkString((String)hash2.get("current_clsf"));
    	String curc_clsf2 = Util.checkString((String)hash2.get("acct_tonghwa"));
    	String frex_amt2 = Util.checkString((String)hash2.get("frex_amt"));
    	/**추가항목 시작 20120727**/
    	String cash_rcpt_use_yn2 = Util.checkString((String)hash2.get("cash_rcpt_use_yn"));
    	String cash_rcpt_acq_yn2 = Util.checkString((String)hash2.get("cash_rcpt_acq_yn"));
    	String deal_cd2 = Util.checkString((String)hash2.get("deal_cd"));
    	String tmnl_no2 = Util.checkString((String)hash2.get("tmnl_no"));
    	String aprv_no2 = Util.checkString((String)hash2.get("aprv_no"));
    	String card_aprv_dd2 = Util.checkString((String)hash2.get("card_aprv_dd"));
    	String decid_no2 = Util.checkString((String)hash2.get("decid_no"));
    	/**추가항목 종료 20120727**/
/**통장입금  변수 종료**/    	
    	
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
    	String rcpm_slip_no5 = Util.checkString((String)hash5.get("rcpm_slip_no"));
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
    	
    	/**현금**/
    	String mode0 = Util.checkString((String)hash9.get("m"));
    	String cash_amt0 = Util.checkString((String)hash9.get("amt"));
    	String cash_rcpt_use_yn0 = Util.checkString((String)hash9.get("cash_rcpt_use_yn"));
    	String cash_rcpt_acq_yn0 = Util.checkString((String)hash9.get("cash_rcpt_acq_yn"));
    	String deal_cd0 = Util.checkString((String)hash9.get("deal_cd"));
    	String tmnl_no0 = Util.checkString((String)hash9.get("tmnl_no"));
    	String aprv_no0 = Util.checkString((String)hash9.get("aprv_no"));
    	String card_aprv_dd0 = Util.checkString((String)hash9.get("card_aprv_dd"));
    	String decid_no0 = Util.checkString((String)hash9.get("decid_no"));
    	
    	
    	String incmg_pers_ip = req.getRemoteAddr();
    	String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
    	
        IS_DEP_1020_ADM dm = new IS_DEP_1020_ADM();
        
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
//        dm.setCash_amt(cash_amt);
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
/**통장입금 시작**/
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
        dm.setCard_rcpm_yn2(card_rcpm_yn2);
        dm.setCard_mang_no2(card_mang_no2);
        /**추가항목 시작 20120727**/
        dm.setCash_rcpt_use_yn2(cash_rcpt_use_yn2);
    	dm.setCash_rcpt_acq_yn2(cash_rcpt_acq_yn2);
    	dm.setDeal_cd2(deal_cd2);
    	dm.setTmnl_no2(tmnl_no2);
    	dm.setAprv_no2(aprv_no2);
    	dm.setCard_aprv_dd2(card_aprv_dd2);
    	dm.setDecid_no2(decid_no2);
        /**추가항목 종료 20120727**/

/**통장입금 종료**/
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
        
        dm.setMode0(mode0.toUpperCase());
        dm.setCash_amt0(cash_amt0);
        dm.setCash_rcpt_use_yn0(cash_rcpt_use_yn0);
        dm.setCash_rcpt_acq_yn0(cash_rcpt_acq_yn0);
        dm.setDeal_cd0(deal_cd0);
        dm.setTmnl_no0(tmnl_no0);
        dm.setAprv_no0(aprv_no0);
        dm.setCard_aprv_dd0(card_aprv_dd0);
        dm.setDecid_no0(decid_no0);
        
        dm.setIncmg_pers_ip(incmg_pers_ip);
        dm.setIncmg_pers(incmg_pers);
        
        dm.print();

        try {
        	IsDep1000DAO	dao = new IsDep1000DAO();
            ds = dao.is_dep_1020_a(dm);
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
     * @param pub HttpServletResponse
     * @throws AppException
     */
    public void is_dep_1030_a(HttpServletRequest req, HttpServletResponse pub) throws   AppException {
    	
    	IS_DEP_1030_ADataSet ds = null;

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
    	//String cash_amt 		= Util.checkString(req.getParameter("cash_amt"));
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
    	String multiUpdateData9 = Util.checkString(req.getParameter("multiUpdateData9"));
    	
    	Hashtable hash1 = getHashMultiUpdateData(multiUpdateData1);
    	Hashtable hash2 = getHashMultiUpdateData(multiUpdateData2);
    	Hashtable hash3 = getHashMultiUpdateData(multiUpdateData3);
    	Hashtable hash4 = getHashMultiUpdateData(multiUpdateData4);
    	Hashtable hash5 = getHashMultiUpdateData(multiUpdateData5);
    	Hashtable hash6 = getHashMultiUpdateData(multiUpdateData6);
    	Hashtable hash7 = getHashMultiUpdateData(multiUpdateData7);
    	Hashtable hash8 = getHashMultiUpdateData(multiUpdateData8);
    	Hashtable hash9 = getHashMultiUpdateData(multiUpdateData9);
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
    	String card_rcpm_yn2    = Util.checkString((String)hash2.get("card_rcpm_yn"));
    	String card_mang_no2    = Util.checkString((String)hash2.get("card_mang_no"));
    	/**추가항목 시작 20120727**/
    	String cash_rcpt_use_yn2 = Util.checkString((String)hash2.get("cash_rcpt_use_yn"));
    	String cash_rcpt_acq_yn2 = Util.checkString((String)hash2.get("cash_rcpt_acq_yn"));
    	String deal_cd2 = Util.checkString((String)hash2.get("deal_cd"));
    	String tmnl_no2 = Util.checkString((String)hash2.get("tmnl_no"));
    	String aprv_no2 = Util.checkString((String)hash2.get("aprv_no"));
    	String card_aprv_dd2 = Util.checkString((String)hash2.get("card_aprv_dd"));
    	String decid_no2 = Util.checkString((String)hash2.get("decid_no"));
    	/**추가항목 시작 20120727**/
    	
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
    	String rcpm_slip_no5 	= Util.checkString((String)hash5.get("rcpm_slip_no"));
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

    	/**현금**/
    	String mode0 = Util.checkString((String)hash9.get("m"));
    	String cash_amt0 = Util.checkString((String)hash9.get("amt"));
    	String cash_rcpt_use_yn0 = Util.checkString((String)hash9.get("cash_rcpt_use_yn"));
    	String cash_rcpt_acq_yn0 = Util.checkString((String)hash9.get("cash_rcpt_acq_yn"));
    	String deal_cd0 = Util.checkString((String)hash9.get("deal_cd"));
    	String tmnl_no0 = Util.checkString((String)hash9.get("tmnl_no"));
    	String aprv_no0 = Util.checkString((String)hash9.get("aprv_no"));
    	String card_aprv_dd0 = Util.checkString((String)hash9.get("card_aprv_dd"));
    	String decid_no0 = Util.checkString((String)hash9.get("decid_no"));
    	
        String cmpy_cd    		= Util.getSessionParameterValue(req, "cmpycd", true);
        String incmg_pers 		= Util.getSessionParameterValue(req, "emp_no", true);
        String incmg_pers_ip 	= req.getRemoteAddr();

        IS_DEP_1030_ADM dm = new IS_DEP_1030_ADM();
        
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
        //dm.setCash_amt(cash_amt);
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
        dm.setCard_rcpm_yn2(card_rcpm_yn2);
        dm.setCard_mang_no2(card_mang_no2);
        /**추가항목 시작 20120727**/	
        dm.setCash_rcpt_use_yn2(cash_rcpt_use_yn2);
    	dm.setCash_rcpt_acq_yn2(cash_rcpt_acq_yn2);
    	dm.setDeal_cd2(deal_cd2);
    	dm.setTmnl_no2(tmnl_no2);
    	dm.setAprv_no2(aprv_no2);
    	dm.setCard_aprv_dd2(card_aprv_dd2);
    	dm.setDecid_no2(decid_no2);
        /**추가항목 시작 20120727**/	
        
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
        
        dm.setMode0(mode0.toUpperCase());
        dm.setCash_amt0(cash_amt0);
        dm.setCash_rcpt_use_yn0(cash_rcpt_use_yn0);
        dm.setCash_rcpt_acq_yn0(cash_rcpt_acq_yn0);
        dm.setDeal_cd0(deal_cd0);
        dm.setTmnl_no0(tmnl_no0);
        dm.setAprv_no0(aprv_no0);
        dm.setCard_aprv_dd0(card_aprv_dd0);
        dm.setDecid_no0(decid_no0);
        
        
        dm.setIncmg_pers_ip(incmg_pers_ip); 
        dm.setIncmg_pers(incmg_pers);
        
        dm.print();

        try {
        	IsDep1000DAO	dao = new IsDep1000DAO();
            ds = dao.is_dep_1030_a(dm);
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
    public void is_dep_1040_a(HttpServletRequest req, HttpServletResponse pub) throws   AppException {
    	
    	IS_DEP_1040_ADataSet ds = null;

        // DM Setting

    	String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);
    	String medi_clsf = Util.getSessionParameterValue(req, "dealmedicd", true);
    	String occr_dt = Util.checkString(req.getParameter("occr_dt"));
    	String slip_clsf = Util.checkString(req.getParameter("slip_clsf"));
    	String seq = Util.checkString(req.getParameter("seq"));
    	String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);

    	IS_DEP_1040_ADM dm = new IS_DEP_1040_ADM();
        
        dm.setMedi_clsf(medi_clsf); 
        dm.setCmpy_cd(cmpy_cd);
        dm.setOccr_dt(occr_dt);
        dm.setSlip_clsf(slip_clsf);
        dm.setSeq(seq);
        dm.setIncmg_pers(incmg_pers);
        dm.print();

        try {
        	IsDep1000DAO	dao = new IsDep1000DAO();
            ds = dao.is_dep_1040_a(dm);
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
     * @param pub HttpServletResponse
     * @throws AppException
     */
    public void is_dep_1051_l(HttpServletRequest req, HttpServletResponse pub) throws   AppException {
    	
    	IS_DEP_1051_LDataSet ds = null;

        // DM Setting
    	IS_DEP_1051_LDM dm = new IS_DEP_1051_LDM();
    	dm.flag = Util.checkString(req.getParameter("flag"));
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.occr_dt = Util.checkString(req.getParameter("occr_dt"));
		dm.slip_clsf = Util.checkString(req.getParameter("slip_clsf"));
		dm.seq = Util.checkString(req.getParameter("seq"));
		dm.proc_frdt = Util.checkString(req.getParameter("pubc_frdt"));
		dm.proc_todt = Util.checkString(req.getParameter("pubc_todt"));
        dm.print();

        try {
        	IsDep1000DAO	dao = new IsDep1000DAO();
            ds = dao.is_dep_1051_l(dm);
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
     * @param pub HttpServletResponse
     * @throws AppException
     */
    public void is_dep_1055_a(HttpServletRequest req, HttpServletResponse pub) throws   AppException {
    	
    	IS_DEP_1055_ADataSet ds = null;
    	
    	String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
    	Hashtable hash = getHashMultiUpdateData(multiUpdateData);
    	
    	String setoff_yn 	    = Util.checkString((String)hash.get("setoff_yn"));
    	String setoff_suply_amt = Util.checkString((String)hash.get("rcpm_suply_amt"));
    	String setoff_vat_amt 	= Util.checkString((String)hash.get("rcpm_vat"));
    	String acwr_reg_dt    	= Util.checkString((String)hash.get("acwr_reg_dt"));
    	String acwr_reg_seq     = Util.checkString((String)hash.get("acwr_reg_seq"));
    	String sale_dlco_li_seq = Util.checkString((String)hash.get("sale_dlco_li_seq"));
    	

        // DM Setting
    	IS_DEP_1055_ADM dm = new IS_DEP_1055_ADM();
		dm.flag = Util.checkString(req.getParameter("flag"));
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.occr_dt = Util.checkString(req.getParameter("occr_dt"));
		dm.slip_clsf = Util.checkString(req.getParameter("slip_clsf"));
		dm.seq = Util.checkString(req.getParameter("seq"));
		dm.incmg_pers_ip = req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.setSetoff_yn(setoff_yn);
		dm.setSetoff_suply_amt(setoff_suply_amt);
		dm.setSetoff_vat_amt(setoff_vat_amt);
		dm.setAcwr_reg_dt(acwr_reg_dt);
		dm.setAcwr_reg_seq(acwr_reg_seq);
		dm.setSale_dlco_li_seq(sale_dlco_li_seq);
        dm.print();

        try {
        	IsDep1000DAO	dao = new IsDep1000DAO();
            ds = dao.is_dep_1055_a(dm);
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
    public void is_dep_1100_m(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_DEP_1100_MDataSet ds = null;

        // DM Setting
    	IS_DEP_1100_MDM dm = new IS_DEP_1100_MDM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.clos_yymm = Util.checkString(req.getParameter("dd_clos_yymm")).substring(0,6);
		dm.work_clsf = Util.checkString(req.getParameter("dd_work_clsf"));
        dm.print();
     
        try {
        	IsDep1000DAO dao = new IsDep1000DAO();
            ds = dao.is_dep_1100_m(dm);
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
    public void is_dep_1101_m(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_DEP_1101_MDataSet ds = null;

        // DM Setting
    	IS_DEP_1101_MDM dm = new IS_DEP_1101_MDM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.print();
     
        try {
        	IsDep1000DAO dao = new IsDep1000DAO();
            ds = dao.is_dep_1101_m(dm);
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
    public void is_dep_1110_a(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_DEP_1110_ADataSet ds = null;

        // DM Setting
    	IS_DEP_1110_ADM dm = new IS_DEP_1110_ADM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.work_clsf = Util.checkString(req.getParameter("dd_work_clsf"));
		dm.clos_dt = Util.checkString(req.getParameter("dd_clos_dt"));
		dm.incmg_dept_cd = Util.getSessionParameterValue(req, "deptcd", true);	/**Session 부서코드**/
		dm.incmg_pers_ip = req.getRemoteAddr();
    	dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.print();
     
        try {
        	IsDep1000DAO dao = new IsDep1000DAO();
            ds = dao.is_dep_1110_a(dm);
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
    public void is_dep_1111_a(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_DEP_1111_ADataSet ds = null;

        // DM Setting
    	IS_DEP_1111_ADM dm = new IS_DEP_1111_ADM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.work_clsf = Util.checkString(req.getParameter("dd_work_clsf"));
		dm.clos_dt = Util.checkString(req.getParameter("dd_clos_dt"));
		dm.incmg_dept_cd = Util.getSessionParameterValue(req, "deptcd", true);	/**Session 부서코드**/
		dm.incmg_pers_ip = req.getRemoteAddr();
    	dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.print();
     
        try {
        	IsDep1000DAO dao = new IsDep1000DAO();
            ds = dao.is_dep_1111_a(dm);
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
    public void is_dep_1120_a(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_DEP_1120_ADataSet ds = null;

        // DM Setting
    	IS_DEP_1120_ADM dm = new IS_DEP_1120_ADM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.work_clsf = Util.checkString(req.getParameter("dd_work_clsf"));
		dm.clos_dt = Util.checkString(req.getParameter("dd_clos_dt"));
		dm.incmg_pers_ip = req.getRemoteAddr();
    	dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.print();
     
        try {
        	IsDep1000DAO dao = new IsDep1000DAO();
            ds = dao.is_dep_1120_a(dm);
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
    public void is_dep_1121_a(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_DEP_1121_ADataSet ds = null;

        // DM Setting
    	IS_DEP_1121_ADM dm = new IS_DEP_1121_ADM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.work_clsf = Util.checkString(req.getParameter("dd_work_clsf"));
		dm.clos_dt = Util.checkString(req.getParameter("dd_clos_dt"));
		dm.incmg_pers_ip = req.getRemoteAddr();
    	dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.print();
     
        try {
        	IsDep1000DAO dao = new IsDep1000DAO();
            ds = dao.is_dep_1121_a(dm);
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
    public void is_dep_1200_m(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_DEP_1200_MDataSet ds = null;

        // DM Setting
    	IS_DEP_1200_MDM dm = new IS_DEP_1200_MDM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.print();
     
        try {
        	IsDep1000DAO dao = new IsDep1000DAO();
            ds = dao.is_dep_1200_m(dm);
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
    public void is_dep_1210_l(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_DEP_1210_LDataSet ds = null;

        // DM Setting
    	IS_DEP_1210_LDM dm = new IS_DEP_1210_LDM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
		dm.clos_fryy = Util.checkString(req.getParameter("clos_fryy"));
		dm.clos_toyy = Util.checkString(req.getParameter("clos_toyy"));
        dm.print();
     
        try {
        	IsDep1000DAO dao = new IsDep1000DAO();
            ds = dao.is_dep_1210_l(dm);
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
    public void is_dep_1220_a(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_DEP_1220_ADataSet ds = null;

        // DM Setting
    	IS_DEP_1220_ADM dm = new IS_DEP_1220_ADM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
		dm.clos_dt = Util.checkString(req.getParameter("clos_dt"));
		dm.incmg_pers_ip = req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.print();
     
        try {
        	IsDep1000DAO dao = new IsDep1000DAO();
            ds = dao.is_dep_1220_a(dm);
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
    public void is_dep_1230_a(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_DEP_1230_ADataSet ds = null;

        // DM Setting
    	IS_DEP_1230_ADM dm = new IS_DEP_1230_ADM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
		dm.clos_dt = Util.checkString(req.getParameter("clos_dt"));
		dm.incmg_pers_ip = req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.print();
     
        try {
        	IsDep1000DAO dao = new IsDep1000DAO();
            ds = dao.is_dep_1230_a(dm);
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
    public void is_dep_1310_l(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_DEP_1310_LDataSet ds = null;

        // DM Setting
    	IS_DEP_1310_LDM dm = new IS_DEP_1310_LDM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.dlco_no = Util.checkString(req.getParameter("dlco_no"));
		dm.proc_frdt = Util.checkString(req.getParameter("proc_frdt"));
		dm.proc_todt = Util.checkString(req.getParameter("proc_todt"));
		dm.basi_dt = Util.checkString(req.getParameter("basi_dt"));
		dm.bddb_proc_clsf = Util.checkString(req.getParameter("bddb_proc_clsf"));
        dm.print();
     
        try {
        	IsDep1000DAO dao = new IsDep1000DAO();
            ds = dao.is_dep_1310_l(dm);
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
    public void is_dep_1320_a(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_DEP_1320_ADataSet ds = null;
    	
    	String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
    	Hashtable hash = getHashMultiUpdateData(multiUpdateData);
    	
    	
    	String acwr_reg_dt = Util.checkString((String)hash.get("acwr_reg_dt"));
    	String acwr_reg_seq = Util.checkString((String)hash.get("acwr_reg_seq"));
    	String sale_dlco_li_seq = Util.checkString((String)hash.get("sale_dlco_li_seq"));
    	String suply_amt = Util.checkString((String)hash.get("suply_amt"));
    	String vat_amt = Util.checkString((String)hash.get("vat_amt"));
    	String unpaid_amt = Util.checkString((String)hash.get("unpaid_amt"));
    	String dlco_no = Util.checkString((String)hash.get("dlco_no"));
    	String bddb_proc_clsf = Util.checkString((String)hash.get("bddb_proc_clsf"));

        // DM Setting
    	IS_DEP_1320_ADM dm = new IS_DEP_1320_ADM();
    	
    	dm.flag =  Util.checkString(req.getParameter("flag"));
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
    	dm.setAcwr_reg_dt(acwr_reg_dt);
    	dm.setAcwr_reg_seq(acwr_reg_seq);
    	dm.setSale_dlco_li_seq(sale_dlco_li_seq);
    	dm.setSuply_amt(suply_amt);
    	dm.setVat_amt(vat_amt);
    	dm.setUnpaid_amt(unpaid_amt);
    	dm.setDlco_no(dlco_no);
    	dm.setBddb_proc_clsf(bddb_proc_clsf);
		dm.incmg_pers_ip = req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.print();
     
        try {
        	IsDep1000DAO dao = new IsDep1000DAO();
            ds = dao.is_dep_1320_a(dm);
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
    public void is_dep_1400_m(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_DEP_1400_MDataSet ds = null;

        // DM Setting
    	IS_DEP_1400_MDM dm = new IS_DEP_1400_MDM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.print();
     
        try {
        	IsDep1000DAO dao = new IsDep1000DAO();
            ds = dao.is_dep_1400_m(dm);
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
    public void is_dep_1410_a(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_DEP_1410_ADataSet ds = null;

        // DM Setting
    	IS_DEP_1410_ADM dm = new IS_DEP_1410_ADM();
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.slip_clsf = Util.checkString(req.getParameter("slip_clsf"));
		dm.occr_dt = Util.checkString(req.getParameter("occr_dt"));
		dm.frdt = Util.checkString(req.getParameter("frdt"));
		dm.todt = Util.checkString(req.getParameter("todt"));
		dm.bddb_clsf = Util.checkString(req.getParameter("bddb_clsf"));
		dm.incmg_dept_cd = Util.getSessionParameterValue(req, "deptcd", true);	/**Session 부서코드**/
		dm.incmg_pers_ip = req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.print();
     
        try {
        	IsDep1000DAO dao = new IsDep1000DAO();
            ds = dao.is_dep_1410_a(dm);
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
    public void is_dep_1420_a(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_DEP_1420_ADataSet ds = null;

        // DM Setting
    	IS_DEP_1420_ADM dm = new IS_DEP_1420_ADM();
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.slip_clsf = Util.checkString(req.getParameter("slip_clsf"));
		dm.occr_dt = Util.checkString(req.getParameter("occr_dt"));
		dm.frdt = Util.checkString(req.getParameter("frdt"));
		dm.todt = Util.checkString(req.getParameter("todt"));
		dm.bddb_clsf = Util.checkString(req.getParameter("bddb_clsf"));
		dm.incmg_pers_ip = req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.print();
     
        try {
        	IsDep1000DAO dao = new IsDep1000DAO();
            ds = dao.is_dep_1420_a(dm);
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
    public void is_dep_1500_m(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_DEP_1500_MDataSet ds = null;

        // DM Setting
    	IS_DEP_1500_MDM dm = new IS_DEP_1500_MDM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
        dm.print();
     
        try {
        	IsDep1000DAO dao = new IsDep1000DAO();
            ds = dao.is_dep_1500_m(dm);
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
    public void is_dep_1510_l(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_DEP_1510_LDataSet ds = null;

        // DM Setting
    	IS_DEP_1510_LDM dm = new IS_DEP_1510_LDM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.drbk_clsf = Util.checkString(req.getParameter("drbk_clsf"));
		dm.proc_frdt = Util.checkString(req.getParameter("proc_frdt"));
		dm.proc_todt = Util.checkString(req.getParameter("proc_todt"));
		dm.dlco_no = Util.checkString(req.getParameter("dlco_no"));
        dm.print();
     
        try {
        	IsDep1000DAO dao = new IsDep1000DAO();
            ds = dao.is_dep_1510_l(dm);
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
    public void is_dep_1520_s(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_DEP_1520_SDataSet ds = null;

        // DM Setting
    	IS_DEP_1520_SDM dm = new IS_DEP_1520_SDM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
    	dm.payo_slip_no = Util.checkString(req.getParameter("payo_slip_no"));
        dm.print();
     
        try {
        	IsDep1000DAO dao = new IsDep1000DAO();
            ds = dao.is_dep_1520_s(dm);
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
    public void is_dep_1525_s(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_DEP_1525_SDataSet ds = null;

        // DM Setting
    	IS_DEP_1525_SDM dm = new IS_DEP_1525_SDM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.drbk_clsf = Util.checkString(req.getParameter("drbk_clsf"));
		dm.slip_occr_dt = Util.checkString(req.getParameter("rcpm_slip_occr_dt"));
		dm.slip_clsf_cd = Util.checkString(req.getParameter("rcpm_slip_clsf_cd"));
		dm.slip_seq = Util.checkString(req.getParameter("rcpm_slip_seq"));
        dm.print();
     
        try {
        	IsDep1000DAO dao = new IsDep1000DAO();
            ds = dao.is_dep_1525_s(dm);
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
    public void is_dep_1530_a(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_DEP_1530_ADataSet ds = null;

        // DM Setting
    	IS_DEP_1530_ADM dm = new IS_DEP_1530_ADM();
		dm.flag = Util.checkString(req.getParameter("flag"));
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.payo_clsf = Util.checkString(req.getParameter("drbk_clsf"));
		dm.payo_slip_occr_dt = Util.checkString(req.getParameter("payo_slip_occr_dt"));
		dm.payo_slip_clsf_cd = Util.checkString(req.getParameter("payo_slip_clsf_cd"));
		dm.payo_slip_seq = Util.checkString(req.getParameter("payo_slip_seq"));
		dm.rcpm_slip_occr_dt = Util.checkString(req.getParameter("rcpm_slip_occr_dt"));
		dm.rcpm_slip_clsf_cd = Util.checkString(req.getParameter("rcpm_slip_clsf_cd"));
		dm.rcpm_slip_seq = Util.checkString(req.getParameter("rcpm_slip_seq"));
		dm.dlco_no = Util.checkString(req.getParameter("dlco_no"));
		dm.dlco_nm = Util.checkString(req.getParameter("dlco_nm"));
		dm.precpt_amt_bal = Util.checkString(req.getParameter("precpt_amt_bal"));
		dm.occr_amt = Util.checkString(req.getParameter("occr_amt"));
		dm.drbk_amt = Util.checkString(req.getParameter("drbk_amt"));
		dm.incmg_pers_ip = req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.print();
     
        try {
        	IsDep1000DAO dao = new IsDep1000DAO();
            ds = dao.is_dep_1530_a(dm);
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
    public void is_dep_1540_a(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_DEP_1540_ADataSet ds = null;

        // DM Setting
    	IS_DEP_1540_ADM dm = new IS_DEP_1540_ADM();
		dm.flag = Util.checkString(req.getParameter("flag"));
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.payo_clsf = Util.checkString(req.getParameter("drbk_clsf"));
		dm.slip_occr_dt = Util.checkString(req.getParameter("payo_slip_occr_dt"));
		dm.slip_clsf_cd = Util.checkString(req.getParameter("payo_slip_clsf_cd"));
		dm.slip_seq = Util.checkString(req.getParameter("payo_slip_seq"));
		dm.dlco_no = Util.checkString(req.getParameter("dlco_no"));
		dm.dlco_nm = Util.checkString(req.getParameter("dlco_nm"));
		dm.drbk_amt = Util.checkString(req.getParameter("drbk_amt"));
		dm.incmg_dept_cd = Util.checkString(req.getParameter("incmg_dept_cd"));
		dm.incmg_pers_ip = req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.print();
     
        try {
        	IsDep1000DAO dao = new IsDep1000DAO();
            ds = dao.is_dep_1540_a(dm);
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
    public void is_dep_1600_m(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_DEP_1600_MDataSet ds = null;

        // DM Setting
    	IS_DEP_1600_MDM dm = new IS_DEP_1600_MDM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
    	dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.print();
     
        try {
        	IsDep1000DAO dao = new IsDep1000DAO();
            ds = dao.is_dep_1600_m(dm);
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
    public void is_dep_1610_l(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_DEP_1610_LDataSet ds = null;

        // DM Setting
    	IS_DEP_1610_LDM dm = new IS_DEP_1610_LDM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.slip_clsf = Util.checkString(req.getParameter("slip_clsf"));
		dm.dlco_no = Util.checkString(req.getParameter("dlco_no"));
		dm.frdt = Util.checkString(req.getParameter("frdt"));
		dm.todt = Util.checkString(req.getParameter("todt"));
		dm.slcrg_pers = Util.checkString(req.getParameter("slcrg_pers"));
        dm.print();
     
        try {
        	IsDep1000DAO dao = new IsDep1000DAO();
            ds = dao.is_dep_1610_l(dm);
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
    public void is_dep_1620_l(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_DEP_1620_LDataSet ds = null;

        // DM Setting
    	IS_DEP_1620_LDM dm = new IS_DEP_1620_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.slip_clsf = Util.checkString(req.getParameter("slip_clsf"));
		dm.dlco_no = Util.checkString(req.getParameter("dlco_no"));
		dm.frdt = Util.checkString(req.getParameter("frdt"));
		dm.todt = Util.checkString(req.getParameter("todt"));
		dm.slcrg_pers = Util.checkString(req.getParameter("slcrg_pers"));
        dm.print();
     
        try {
        	IsDep1000DAO dao = new IsDep1000DAO();
            ds = dao.is_dep_1620_l(dm);
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
    public void is_dep_1750_m(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_DEP_1750_MDataSet ds = null;

        // DM Setting
    	IS_DEP_1750_MDM dm = new IS_DEP_1750_MDM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
    	dm.emp_no = Util.checkString(req.getParameter("emp_no"));
        dm.print();
     
        try {
        	IsDep1000DAO dao = new IsDep1000DAO();
            ds = dao.is_dep_1750_m(dm);
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
    public void is_dep_1751_l(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_DEP_1751_LDataSet ds = null;

        // DM Setting
    	IS_DEP_1751_LDM dm = new IS_DEP_1751_LDM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.slip_clsf = Util.checkString(req.getParameter("slip_clsf"));
		dm.date_clsf = Util.checkString(req.getParameter("date_clsf"));
		dm.frdt = Util.checkString(req.getParameter("frdt"));
		dm.todt = Util.checkString(req.getParameter("todt"));
		dm.dlco_no = Util.checkString(req.getParameter("dlco_no"));
		dm.rcpm_clsf = Util.checkString(req.getParameter("rcpm_clsf"));
		dm.note_clsf = Util.checkString(req.getParameter("note_clsf"));
		dm.mchrg_pers = Util.checkString(req.getParameter("mchrg_pers"));
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.print();
     
        try {
        	IsDep1000DAO dao = new IsDep1000DAO();
            ds = dao.is_dep_1751_l(dm);
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
    public void is_dep_1800_m(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_DEP_1800_MDataSet ds = null;

        // DM Setting
    	IS_DEP_1800_MDM dm = new IS_DEP_1800_MDM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.auth_gb = Util.checkString(req.getParameter("auth_gb"));
		dm.use_yn = Util.checkString(req.getParameter("use_yn"));
		dm.incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
		dm.base_dt = Util.checkString(req.getParameter("base_dt"));
        dm.print();
     
        try {
        	IsDep1000DAO dao = new IsDep1000DAO();
            ds = dao.is_dep_1800_m(dm);
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
    public void is_dep_1810_l(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_DEP_1810_LDataSet ds = null;

        // DM Setting
    	IS_DEP_1810_LDM dm = new IS_DEP_1810_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.sale_proc_frdt = Util.checkString(req.getParameter("sale_proc_frdt"));
		dm.sale_proc_todt = Util.checkString(req.getParameter("sale_proc_todt"));
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.sub_dept_cd = Util.checkString(req.getParameter("sub_dept_cd"));
		dm.chrg_pers = Util.checkString(req.getParameter("chrg_pers"));
		dm.dlco_no = Util.checkString(req.getParameter("dlco_no"));
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.print();
     
        try {
        	IsDep1000DAO dao = new IsDep1000DAO();
            ds = dao.is_dep_1810_l(dm);
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
    public void is_dep_1820_a(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_DEP_1820_ADataSet ds = null;

    	String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
    	Hashtable hash = getHashMultiUpdateData(multiUpdateData);
    	
    	String acwr_reg_dt = Util.checkString((String)hash.get("acwr_reg_dt"));
    	String acwr_reg_seq = Util.checkString((String)hash.get("acwr_reg_seq"));
    	String sale_dlco_li_seq = Util.checkString((String)hash.get("sale_dlco_li_seq"));
    	
        // DM Setting
    	IS_DEP_1820_ADM dm = new IS_DEP_1820_ADM();
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.setAcwr_reg_dt(acwr_reg_dt);
		dm.setAcwr_reg_seq(acwr_reg_seq);
		dm.setSale_dlco_li_seq(sale_dlco_li_seq);
		dm.aft_dept_cd = Util.checkString(req.getParameter("aft_dept_cd"));
		dm.aft_sub_dept_cd = Util.checkString(req.getParameter("aft_sub_dept_cd"));
		dm.aft_chrg_pers = Util.checkString(req.getParameter("aft_chrg_pers"));
		dm.incmg_pers_ip = req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.print();
     
        try {
        	IsDep1000DAO dao = new IsDep1000DAO();
            ds = dao.is_dep_1820_a(dm);
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
    public void is_dep_1830_l(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_DEP_1830_LDataSet ds = null;

        // DM Setting
    	IS_DEP_1830_LDM dm = new IS_DEP_1830_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.flag = Util.checkString(req.getParameter("flag"));
		dm.sale_proc_frdt = Util.checkString(req.getParameter("sale_proc_frdt"));
		dm.sale_proc_todt = Util.checkString(req.getParameter("sale_proc_todt"));
		dm.trc_reg_frdt = Util.checkString(req.getParameter("trc_reg_frdt"));
		dm.trc_reg_todt = Util.checkString(req.getParameter("trc_reg_todt"));
		dm.chg_prv_chrg_pers = Util.checkString(req.getParameter("chg_prv_chrg_pers"));
		dm.chrg_pers = Util.checkString(req.getParameter("chrg_pers"));
		dm.dlco_no = Util.checkString(req.getParameter("dlco_no"));
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.print();
     
        try {
        	IsDep1000DAO dao = new IsDep1000DAO();
            ds = dao.is_dep_1830_l(dm);
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
    public void is_dep_1900_m(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_DEP_1900_MDataSet ds = null;

        // DM Setting
    	IS_DEP_1900_MDM dm = new IS_DEP_1900_MDM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.auth_gb = Util.checkString(req.getParameter("auth_gb"));
		dm.use_yn = Util.checkString(req.getParameter("use_yn"));
		dm.incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
		dm.base_dt = Util.checkString(req.getParameter("base_dt"));
        dm.print();
     
        try {
        	IsDep1000DAO dao = new IsDep1000DAO();
            ds = dao.is_dep_1900_m(dm);
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
    public void is_dep_1910_l(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_DEP_1910_LDataSet ds = null;

        // DM Setting
    	IS_DEP_1910_LDM dm = new IS_DEP_1910_LDM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.occr_frdt = Util.checkString(req.getParameter("occr_frdt"));
		dm.occr_todt = Util.checkString(req.getParameter("occr_todt"));
		dm.chg_frdt = Util.checkString(req.getParameter("chg_frdt"));
		dm.chg_todt = Util.checkString(req.getParameter("chg_todt"));
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.sub_dept_cd = Util.checkString(req.getParameter("sub_dept_cd"));
		dm.chrg_pers = Util.checkString(req.getParameter("chrg_pers"));
		dm.dlco_no = Util.checkString(req.getParameter("dlco_no"));
		dm.trsm_yymm = Util.checkString(req.getParameter("trsm_yymm"));
		dm.sms_trsm_yn = Util.checkString(req.getParameter("sms_trsm_yn"));
		dm.card_rcpm_yn = Util.checkString(req.getParameter("card_rcpm_yn"));
        dm.print();
     
        try {
        	IsDep1000DAO dao = new IsDep1000DAO();
            ds = dao.is_dep_1910_l(dm);
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
    public void is_dep_1920_a(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_DEP_1920_ADataSet ds = null;
    	
    	String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
    	Hashtable hash = getHashMultiUpdateData(multiUpdateData);

    	String occr_dt = Util.checkString((String)hash.get("occr_dt"));
    	String slip_clsf = Util.checkString((String)hash.get("slip_clsf"));
    	String seq = Util.checkString((String)hash.get("seq"));
    	String subseq = Util.checkString((String)hash.get("subseq"));
    	
        // DM Setting
    	IS_DEP_1920_ADM dm = new IS_DEP_1920_ADM();    	
    	
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
    	dm.setOccr_dt(occr_dt);
    	dm.setSlip_clsf(slip_clsf);
    	dm.setSeq(seq);
    	dm.setSubseq(subseq);
    	dm.incmg_pers_ip = req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.print();
     
        try {
        	IsDep1000DAO dao = new IsDep1000DAO();
            ds = dao.is_dep_1920_a(dm);
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
    public void is_dep_1930_l(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_DEP_1930_LDataSet ds = null;

        // DM Setting
    	IS_DEP_1930_LDM dm = new IS_DEP_1930_LDM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.occr_frdt = Util.checkString(req.getParameter("occr_frdt"));
		dm.occr_todt = Util.checkString(req.getParameter("occr_todt"));
		dm.chg_frdt = Util.checkString(req.getParameter("chg_frdt"));
		dm.chg_todt = Util.checkString(req.getParameter("chg_todt"));
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.sub_dept_cd = Util.checkString(req.getParameter("sub_dept_cd"));
		dm.chrg_pers = Util.checkString(req.getParameter("chrg_pers"));
		dm.dlco_no = Util.checkString(req.getParameter("dlco_no"));
		dm.trsm_yymm = Util.checkString(req.getParameter("trsm_yymm"));
		dm.sms_trsm_yn = Util.checkString(req.getParameter("sms_trsm_yn"));
		dm.card_rcpm_yn = Util.checkString(req.getParameter("card_rcpm_yn"));
        dm.print();
     
        try {
        	IsDep1000DAO dao = new IsDep1000DAO();
            ds = dao.is_dep_1930_l(dm);
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
    public void is_dep_2400_m(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_DEP_2400_MDataSet ds = null;

        // DM Setting
    	IS_DEP_2400_MDM dm = new IS_DEP_2400_MDM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
    	dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.print();
     
        try {
        	IsDep1000DAO dao = new IsDep1000DAO();
            ds = dao.is_dep_2400_m(dm);
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
    public void is_dep_2410_l(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_DEP_2410_LDataSet ds = null;

        // DM Setting
    	IS_DEP_2410_LDM dm = new IS_DEP_2410_LDM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.note_clsf_cd = Util.checkString(req.getParameter("note_clsf_cd"));
		dm.slip_clsf = Util.checkString(req.getParameter("slip_clsf"));
		dm.dlco_no = Util.checkString(req.getParameter("dlco_no"));
		dm.frdt = Util.checkString(req.getParameter("frdt"));
		dm.todt = Util.checkString(req.getParameter("todt"));
		dm.note_no = Util.checkString(req.getParameter("note_no"));
		dm.issu_pers_nm = Util.checkString(req.getParameter("issu_pers_nm"));
		dm.mtry_dt = Util.checkString(req.getParameter("mtry_dt"));
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.print();
     
        try {
        	IsDep1000DAO dao = new IsDep1000DAO();
            ds = dao.is_dep_2410_l(dm);
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
    public void is_dep_2420_l(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_DEP_2420_LDataSet ds = null;

        // DM Setting
    	IS_DEP_2420_LDM dm = new IS_DEP_2420_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.slip_clsf = Util.checkString(req.getParameter("work_cd"));
		dm.dis_account = Util.checkString(req.getParameter("dis_account"));
		dm.handle_clsf = Util.checkString(req.getParameter("handle_clsf"));
		dm.frdt = Util.checkString(req.getParameter("frdt"));
		dm.todt = Util.checkString(req.getParameter("todt"));
		dm.dlco_no = Util.checkString(req.getParameter("dlco_no"));
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.print();
     
        try {
        	IsDep1000DAO dao = new IsDep1000DAO();
            ds = dao.is_dep_2420_l(dm);
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
    public void is_dep_2430_l(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_DEP_2430_LDataSet ds = null;

        // DM Setting
    	IS_DEP_2430_LDM dm = new IS_DEP_2430_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.bank_cd = Util.checkString(req.getParameter("bank_cd"));
		dm.note_no = Util.checkString(req.getParameter("note_no"));
		dm.note_seq = Util.checkString(req.getParameter("note_seq"));
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.print();
     
        try {
        	IsDep1000DAO dao = new IsDep1000DAO();
            ds = dao.is_dep_2430_l(dm);
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
    public void is_dep_2440_l(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_DEP_2440_LDataSet ds = null;

        // DM Setting
    	IS_DEP_2440_LDM dm = new IS_DEP_2440_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.bank_cd = Util.checkString(req.getParameter("bank_cd"));
		dm.note_no = Util.checkString(req.getParameter("note_no"));
		dm.note_seq = Util.checkString(req.getParameter("note_seq"));
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.print();
     
        try {
        	IsDep1000DAO dao = new IsDep1000DAO();
            ds = dao.is_dep_2440_l(dm);
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
    public void is_dep_2500_m(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_DEP_2500_MDataSet ds = null;

        // DM Setting
    	IS_DEP_2500_MDM dm = new IS_DEP_2500_MDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.print();
     
        try {
        	IsDep1000DAO dao = new IsDep1000DAO();
            ds = dao.is_dep_2500_m(dm);
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
    public void is_dep_2510_l(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_DEP_2510_LDataSet ds = null;

        // DM Setting
    	IS_DEP_2510_LDM dm = new IS_DEP_2510_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.proc_yymm = Util.checkString(req.getParameter("proc_yymm"));
		dm.slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
		dm.basi_dt = Util.checkString(req.getParameter("basi_dt"));
        dm.print();
     
        try {
        	IsDep1000DAO dao = new IsDep1000DAO();
            ds = dao.is_dep_2510_l(dm);
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
    public void is_dep_2600_m(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_DEP_2600_MDataSet ds = null;

        // DM Setting
    	IS_DEP_2600_MDM dm = new IS_DEP_2600_MDM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.auth_gb = Util.checkString(req.getParameter("auth_gb"));
		dm.use_yn = Util.checkString(req.getParameter("use_yn"));
		dm.incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
		dm.base_dt = Util.checkString(req.getParameter("base_dt"));
        dm.print();
     
        try {
        	IsDep1000DAO dao = new IsDep1000DAO();
            ds = dao.is_dep_2600_m(dm);
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
    public void is_dep_2610_l(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_DEP_2610_LDataSet ds = null;

        // DM Setting
    	IS_DEP_2610_LDM dm = new IS_DEP_2610_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.occr_dt = Util.checkString(req.getParameter("occr_dt"));
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.sub_dept_cd = Util.checkString(req.getParameter("sub_dept_cd"));
		dm.chrg_pers = Util.checkString(req.getParameter("chrg_pers"));
		dm.dlco_clsf_cd_seq = Util.checkString(req.getParameter("dlco_clsf_cd_seq"));
        dm.print();
     
        try {
        	IsDep1000DAO dao = new IsDep1000DAO();
            ds = dao.is_dep_2610_l(dm);
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
    public void is_dep_2620_l(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_DEP_2620_LDataSet ds = null;

        // DM Setting
    	IS_DEP_2620_LDM dm = new IS_DEP_2620_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.bill_no = Util.checkString(req.getParameter("bill_no"));
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.sub_dept_cd = Util.checkString(req.getParameter("sub_dept_cd"));
		dm.chrg_pers = Util.checkString(req.getParameter("chrg_pers"));
		dm.dlco_clsf_cd_seq = Util.checkString(req.getParameter("dlco_clsf_cd_seq"));
        dm.print();
     
        try {
        	IsDep1000DAO dao = new IsDep1000DAO();
            ds = dao.is_dep_2620_l(dm);
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
    public void is_dep_2700_m(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_DEP_2700_MDataSet ds = null;

        // DM Setting
    	IS_DEP_2700_MDM dm = new IS_DEP_2700_MDM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.auth_gb = Util.checkString(req.getParameter("auth_gb"));
		dm.use_yn = Util.checkString(req.getParameter("use_yn"));
		dm.incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
		dm.base_dt = Util.checkString(req.getParameter("base_dt"));
        dm.print();
     
        try {
        	IsDep1000DAO dao = new IsDep1000DAO();
            ds = dao.is_dep_2700_m(dm);
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
    public void is_dep_2710_l(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_DEP_2710_LDataSet ds = null;

        // DM Setting
    	IS_DEP_2710_LDM dm = new IS_DEP_2710_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.clsf = Util.checkString(req.getParameter("clsf"));
		dm.sale_proc_frdt = Util.checkString(req.getParameter("sale_proc_frdt"));
		dm.sale_proc_todt = Util.checkString(req.getParameter("sale_proc_todt"));
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.sub_dept_cd = Util.checkString(req.getParameter("sub_dept_cd"));
		dm.chrg_pers = Util.checkString(req.getParameter("chrg_pers"));
		dm.dlco_clsf_cd_seq = Util.checkString(req.getParameter("dlco_clsf_cd_seq"));
		dm.sale_clsf = Util.checkString(req.getParameter("sale_clsf"));
		dm.spc_sale_clsf = Util.checkString(req.getParameter("spc_sale_clsf"));
		dm.rvord_type = Util.checkString(req.getParameter("rvord_type"));
        dm.print();
     
        try {
        	IsDep1000DAO dao = new IsDep1000DAO();
            ds = dao.is_dep_2710_l(dm);
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
    public void is_dep_2720_l(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_DEP_2720_LDataSet ds = null;

        // DM Setting
    	IS_DEP_2720_LDM dm = new IS_DEP_2720_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.sale_proc_frdt = Util.checkString(req.getParameter("sale_proc_frdt"));
		dm.sale_proc_todt = Util.checkString(req.getParameter("sale_proc_todt"));
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.sub_dept_cd = Util.checkString(req.getParameter("sub_dept_cd"));
		dm.chrg_pers = Util.checkString(req.getParameter("chrg_pers"));
		dm.dlco_clsf_cd_seq = Util.checkString(req.getParameter("dlco_clsf_cd_seq"));
		dm.sale_clsf = Util.checkString(req.getParameter("sale_clsf"));
		dm.spc_sale_clsf = Util.checkString(req.getParameter("spc_sale_clsf"));
		dm.rvord_type = Util.checkString(req.getParameter("rvord_type"));
        dm.print();
     
        try {
        	IsDep1000DAO dao = new IsDep1000DAO();
            ds = dao.is_dep_2720_l(dm);
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
    public void is_dep_2800_m(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_DEP_2800_MDataSet ds = null;

        // DM Setting
    	IS_DEP_2800_MDM dm = new IS_DEP_2800_MDM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.auth_gb = Util.checkString(req.getParameter("auth_gb"));
		dm.use_yn = Util.checkString(req.getParameter("use_yn"));
		dm.incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
		dm.base_dt = Util.checkString(req.getParameter("base_dt"));
        dm.print();
     
        try {
        	IsDep1000DAO dao = new IsDep1000DAO();
            ds = dao.is_dep_2800_m(dm);
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
    public void is_dep_2810_l(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_DEP_2810_LDataSet ds = null;

        // DM Setting
    	IS_DEP_2810_LDM dm = new IS_DEP_2810_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.yyyymm = Util.checkString(req.getParameter("yyyymm"));
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.sub_dept_cd = Util.checkString(req.getParameter("sub_dept_cd"));
		dm.chrg_pers = Util.checkString(req.getParameter("chrg_pers"));
        dm.print();
     
        try {
        	IsDep1000DAO dao = new IsDep1000DAO();
            ds = dao.is_dep_2810_l(dm);
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
    public void is_dep_2900_m(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_DEP_2900_MDataSet ds = null;

        // DM Setting
    	IS_DEP_2900_MDM dm = new IS_DEP_2900_MDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.auth_gb = Util.checkString(req.getParameter("auth_gb"));
		dm.use_yn = Util.checkString(req.getParameter("use_yn"));
		dm.incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
		dm.base_dt = Util.checkString(req.getParameter("base_dt"));
        dm.print();
     
        try {
        	IsDep1000DAO dao = new IsDep1000DAO();
            ds = dao.is_dep_2900_m(dm);
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
    public void is_dep_2910_l(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_DEP_2910_LDataSet ds = null;

        // DM Setting
    	IS_DEP_2910_LDM dm = new IS_DEP_2910_LDM();
		dm.clsf = Util.checkString(req.getParameter("clsf"));
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.occr_frdt = Util.checkString(req.getParameter("occr_frdt"));
		dm.occr_todt = Util.checkString(req.getParameter("occr_todt"));
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.sub_dept_cd = Util.checkString(req.getParameter("sub_dept_cd"));
		dm.chrg_pers = Util.checkString(req.getParameter("chrg_pers"));
		dm.dlco_clsf_cd_seq = Util.checkString(req.getParameter("dlco_clsf_cd_seq"));
		dm.erplace_cd = Util.checkString(req.getParameter("erplace_cd"));
		dm.prof_type_cd = Util.checkString(req.getParameter("prof_type_cd"));
        dm.print();
     
        try {
        	IsDep1000DAO dao = new IsDep1000DAO();
            ds = dao.is_dep_2910_l(dm);
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
    public void is_dep_3500_m(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_DEP_3500_MDataSet ds = null;

        // DM Setting
    	IS_DEP_3500_MDM dm = new IS_DEP_3500_MDM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.medi_clsf = Util.checkString(req.getParameter("medi_clsf"));
        dm.print();
     
        try {
        	IsDep1000DAO dao = new IsDep1000DAO();
            ds = dao.is_dep_3500_m(dm);
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
    public void is_dep_3510_l(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_DEP_3510_LDataSet ds = null;

        // DM Setting
    	IS_DEP_3510_LDM dm = new IS_DEP_3510_LDM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.dlco_no = Util.checkString(req.getParameter("dlco_no"));
		dm.frdt = Util.checkString(req.getParameter("frdt"));
		dm.todt = Util.checkString(req.getParameter("todt"));
		dm.basi_dt = Util.checkString(req.getParameter("basi_dt"));
		dm.eps_clsf = Util.checkString(req.getParameter("eps_clsf"));
		dm.chrg_pers = Util.checkString(req.getParameter("chrg_pers"));
        dm.print();
     
        try {
        	IsDep1000DAO dao = new IsDep1000DAO();
            ds = dao.is_dep_3510_l(dm);
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
    public void is_dep_3520_l(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_DEP_3520_LDataSet ds = null;

        // DM Setting
    	IS_DEP_3520_LDM dm = new IS_DEP_3520_LDM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.dlco_no = Util.checkString(req.getParameter("dlco_no"));
		dm.frdt = Util.checkString(req.getParameter("frdt"));
		dm.todt = Util.checkString(req.getParameter("todt"));
		dm.basi_dt = Util.checkString(req.getParameter("basi_dt"));
		dm.eps_clsf = Util.checkString(req.getParameter("eps_clsf"));
        dm.print();
     
        try {
        	IsDep1000DAO dao = new IsDep1000DAO();
            ds = dao.is_dep_3520_l(dm);
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
    public void is_dep_3530_a(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_DEP_3530_ADataSet ds = null;

    	String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
    	Hashtable hash = getHashMultiUpdateData(multiUpdateData);
    	
    	
    	String sale_proc_dt	= Util.checkString((String)hash.get("sale_proc_dt"));
    	String acwr_reg_dt = Util.checkString((String)hash.get("acwr_reg_dt"));
    	String acwr_reg_seq = Util.checkString((String)hash.get("acwr_reg_seq"));
    	String sale_dlco_li_seq = Util.checkString((String)hash.get("sale_dlco_li_seq"));
    	String tot_rvord_amt = Util.checkString((String)hash.get("tot_rvord_amt"));
    	String rcpm_tot_amt = Util.checkString((String)hash.get("setoff_tot_rvord_amt")); /**입금총액**/

    	
        // DM Setting
    	IS_DEP_3530_ADM dm = new IS_DEP_3530_ADM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.dlco_no = Util.checkString(req.getParameter("dlco_no"));
		dm.incmg_pers_ip = req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.setSale_proc_dt(sale_proc_dt);
		dm.setAcwr_reg_dt(acwr_reg_dt);
		dm.setAcwr_reg_seq(acwr_reg_seq);
		dm.setSale_dlco_li_seq(sale_dlco_li_seq);
		dm.setTot_rvord_amt(tot_rvord_amt);
		dm.setRcpm_tot_amt(rcpm_tot_amt);
        dm.print();
     
        try {
        	IsDep1000DAO dao = new IsDep1000DAO();
            ds = dao.is_dep_3530_a(dm);
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
    public void is_dep_3540_a(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_DEP_3540_ADataSet ds = null;

    	String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
    	Hashtable hash = getHashMultiUpdateData(multiUpdateData);
    	
    	
    	String rcpm_slip_no = Util.checkString((String)hash.get("rcpm_slip_no"));
    	String bank_cd = Util.checkString((String)hash.get("bank_cd"));
    	String note_no = Util.checkString((String)hash.get("note_no"));
    	String note_seq = Util.checkString((String)hash.get("note_seq"));
    	String dhon_occr_dt = Util.checkString((String)hash.get("dhon_occr_dt"));
    	String dhon_amt = Util.checkString((String)hash.get("dhon_amt"));
    	String dhon_bal = Util.checkString((String)hash.get("dhon_bal"));
    	String issu_pers_nm = Util.checkString((String)hash.get("issu_pers_nm"));

    	
        // DM Setting
    	IS_DEP_3540_ADM dm = new IS_DEP_3540_ADM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.dlco_no = Util.checkString(req.getParameter("dlco_no"));
		dm.incmg_pers_ip = req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.setRcpm_slip_no(rcpm_slip_no);
		dm.setBank_cd(bank_cd);
		dm.setNote_no(note_no);
		dm.setNote_seq(note_seq);
		dm.setDhon_occr_dt(dhon_occr_dt);
		dm.setDhon_amt(dhon_amt);
		dm.setDhon_bal(dhon_bal);
		dm.setIssu_pers_nm(issu_pers_nm);
        dm.print();
     
        try {
        	IsDep1000DAO dao = new IsDep1000DAO();
            ds = dao.is_dep_3540_a(dm);
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
    public void is_dep_3700_m(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_DEP_3700_MDataSet ds = null;

        // DM Setting
    	IS_DEP_3700_MDM dm = new IS_DEP_3700_MDM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
        dm.print();
     
        try {
        	IsDep1000DAO dao = new IsDep1000DAO();
            ds = dao.is_dep_3700_m(dm);
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
    public void is_dep_3710_l(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_DEP_3710_LDataSet ds = null;

        // DM Setting
    	IS_DEP_3710_LDM dm = new IS_DEP_3710_LDM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.eps_clsf = Util.checkString(req.getParameter("eps_clsf"));
		dm.enty_clsf = Util.checkString(req.getParameter("enty_clsf"));
		dm.frdt = Util.checkString(req.getParameter("frdt"));
		dm.todt = Util.checkString(req.getParameter("todt"));
		dm.fpymt_yn = Util.checkString(req.getParameter("fpymt_yn"));
		dm.prog_yn = Util.checkString(req.getParameter("prog_yn"));
        dm.print();
     
        try {
        	IsDep1000DAO dao = new IsDep1000DAO();
            ds = dao.is_dep_3710_l(dm);
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
    public void is_dep_3715_u(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_DEP_3715_UDataSet ds = null;
    	
    	String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
    	Hashtable hash = getHashMultiUpdateData(multiUpdateData);
    	
    	String mode = Util.checkString((String)hash.get("m"));
    	String rept_no = Util.checkString((String)hash.get("rept_no"));
    	String sue_chrg_pers = Util.checkString((String)hash.get("sue_chrg_pers"));
    	String dlay_rcpm_plan_dt = Util.checkString((String)hash.get("dlay_rcpm_plan_dt"));
    	String clct_dt = Util.checkString((String)hash.get("clct_dt"));
    	String clct_amt = Util.checkString((String)hash.get("clct_amt"));
    	String loss_amt_inclu_yn = Util.checkString((String)hash.get("loss_amt_inclu_yn"));
    	String remk = Util.checkString((String)hash.get("remk"));
    	String remk_1 = Util.checkString((String)hash.get("remk_1"));
    	String remk_2 = Util.checkString((String)hash.get("remk_2"));

        // DM Setting
    	IS_DEP_3715_UDM dm = new IS_DEP_3715_UDM();
    	
    	
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
    	dm.setMode(mode.toUpperCase());
    	dm.setRept_no(rept_no);
    	dm.setSue_chrg_pers(sue_chrg_pers);
    	dm.setDlay_rcpm_plan_dt(dlay_rcpm_plan_dt);
    	dm.setClct_dt(clct_dt);
    	dm.setClct_amt(clct_amt);
    	dm.setLoss_amt_inclu_yn(loss_amt_inclu_yn);
    	dm.setRemk(remk);
    	dm.setRemk_1(remk_1);
    	dm.setRemk_2(remk_2);
    	
    	if(mode.equals("")){
    		dm.rept_no = Util.checkString(req.getParameter("rept_no"));
    	}
		dm.incmg_pers_ip = req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
    	dm.print();
     
        try {
        	IsDep1000DAO dao = new IsDep1000DAO();
            ds = dao.is_dep_3715_u(dm);
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
    public void is_dep_3720_s(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_DEP_3720_SDataSet ds = null;

        // DM Setting
    	IS_DEP_3720_SDM dm = new IS_DEP_3720_SDM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
    	dm.rept_no = Util.checkString(req.getParameter("rept_no"));
		dm.chk_item = Util.checkString(req.getParameter("chk_item"));
        dm.print();
     
        try {
        	IsDep1000DAO dao = new IsDep1000DAO();
            ds = dao.is_dep_3720_s(dm);
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
    public void is_dep_3730_a(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_DEP_3730_ADataSet ds = null;

        // DM Setting
    	IS_DEP_3730_ADM dm = new IS_DEP_3730_ADM();
		dm.flag = Util.checkString(req.getParameter("flag"));
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.rept_no = Util.checkString(req.getParameter("rept_no"));
		dm.chk_item = Util.checkString(req.getParameter("chk_item"));
		dm.chk_dt = Util.checkString(req.getParameter("chk_dt"));
		dm.chk_cont = Util.checkString(req.getParameter("chk_cont"));
		dm.incmg_pers_ip = req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.print();
     
        try {
        	IsDep1000DAO dao = new IsDep1000DAO();
            ds = dao.is_dep_3730_a(dm);
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
    public void is_dep_3810_l(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_DEP_3810_LDataSet ds = null;

        // DM Setting
    	IS_DEP_3810_LDM dm = new IS_DEP_3810_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.dlco_no = Util.checkString(req.getParameter("dlco_no"));
		dm.frdt = Util.checkString(req.getParameter("frdt"));
		dm.todt = Util.checkString(req.getParameter("todt"));
        dm.print();
     
        try {
        	IsDep1000DAO dao = new IsDep1000DAO();
            ds = dao.is_dep_3810_l(dm);
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
    public void is_dep_3820_a(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_DEP_3820_ADataSet ds = null;
    	
    	String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
    	Hashtable hash = getHashMultiUpdateData(multiUpdateData);
    	
    	String bddb_proc_clsf = Util.checkString((String)hash.get("bddb_proc_clsf"));
    	String acwr_reg_dt = Util.checkString((String)hash.get("acwr_reg_dt"));
    	String acwr_reg_seq = Util.checkString((String)hash.get("acwr_reg_seq"));
    	String sale_dlco_li_seq = Util.checkString((String)hash.get("sale_dlco_li_seq"));
    	String unrcp_vat_amt = Util.checkString((String)hash.get("unrcp_vat_amt"));

        // DM Setting
    	IS_DEP_3820_ADM dm = new IS_DEP_3820_ADM();
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.setBddb_proc_clsf(bddb_proc_clsf);
		dm.setAcwr_reg_dt(acwr_reg_dt);
		dm.setAcwr_reg_seq(acwr_reg_seq);
		dm.setSale_dlco_li_seq(sale_dlco_li_seq);
		dm.setUnrcp_vat_amt(unrcp_vat_amt);
		dm.incmg_pers_ip = req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.print();

        try {
        	IsDep1000DAO dao = new IsDep1000DAO();
            ds = dao.is_dep_3820_a(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            throw e;
        }
    } 
    
    
    
    /*********************************************************************************/
    
    
    /**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void is_dep_4000_m(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_DEP_4000_MDataSet ds = null;

        // DM Setting
    	IS_DEP_4000_MDM dm = new IS_DEP_4000_MDM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
    	dm.auth_gb = Util.checkString(req.getParameter("auth_gb"));
		dm.use_yn = Util.checkString(req.getParameter("use_yn"));		
		dm.incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
		dm.base_dt = Util.checkString(req.getParameter("base_dt"));
        dm.print();
        try {
        	IsDep1000DAO dao = new IsDep1000DAO();
            ds = dao.is_dep_4000_m(dm);
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
    public void is_dep_4010_l(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_DEP_4010_LDataSet ds = null;

        // DM Setting
    	IS_DEP_4010_LDM dm = new IS_DEP_4010_LDM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
    	dm.aprv_dt_fr = Util.checkString(req.getParameter("aprv_dt_fr"));
		dm.aprv_dt_to = Util.checkString(req.getParameter("aprv_dt_to"));
		dm.tmnl_no = Util.checkString(req.getParameter("tmnl_no"));
		dm.card_cmpy_cd = Util.checkString(req.getParameter("card_cmpy_cd"));	
		dm.proc_stat = Util.checkString(req.getParameter("proc_stat"));	
		dm.dlco_no = Util.checkString(req.getParameter("dlco_no"));	
		dm.sub_dept_cd = Util.checkString(req.getParameter("sub_dept_cd"));	
		dm.chrg_pers = Util.checkString(req.getParameter("chrg_pers"));	
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.print();
        try {
        	IsDep1000DAO dao = new IsDep1000DAO();
            ds = dao.is_dep_4010_l(dm);
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
    public void is_dep_4020_a(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
       	IS_DEP_4020_ADataSet ds = null;

       	String multiUpdateData1 = Util.checkString(req.getParameter("multiUpdateData1"));
    	Hashtable hash = getHashMultiUpdateData(multiUpdateData1);
       	
    	String mode = Util.checkString((String)hash.get("m"));
    	String card_rcpm_reg_dt	= Util.checkString((String)hash.get("card_rcpm_reg_dt"));
    	String card_rcpm_reg_seq = Util.checkString((String)hash.get("card_rcpm_reg_seq"));
    	String acct_mang_no = Util.checkString((String)hash.get("acct_mang_no"));
    	String dlco_no	= Util.checkString((String)hash.get("dlco_no"));
    	String dept_cd	= Util.checkString((String)hash.get("dept_cd"));
    	String sub_dept_cd	= Util.checkString((String)hash.get("sub_dept_cd"));
    	String chrg_pers = Util.checkString((String)hash.get("chrg_pers"));
    	String rcpm_slip_no	= Util.checkString((String)hash.get("rcpm_slip_no"));
    	
    	
        // DM Setting
    	IS_DEP_4020_ADM dm = new IS_DEP_4020_ADM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
    	dm.setMode(mode.toUpperCase());
    	dm.setCard_rcpm_reg_dt(card_rcpm_reg_dt);
    	dm.setCard_rcpm_reg_seq(card_rcpm_reg_seq);
    	dm.setAcct_mang_no(acct_mang_no);
    	dm.setDlco_no(dlco_no);
    	dm.setDept_cd(dept_cd);
    	dm.setSub_dept_cd(sub_dept_cd);
    	dm.setChrg_pers(chrg_pers);
    	dm.setRcpm_slip_no(rcpm_slip_no);
    	dm.incmg_pers_ip = req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.print();
        
        try {
        	IsDep1000DAO dao = new IsDep1000DAO();
            ds = dao.is_dep_4020_a(dm);
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
    public void is_dep_4025_a(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_DEP_4025_ADataSet ds = null;
    	
    	String multiUpdateData2 = Util.checkString(req.getParameter("multiUpdateData2"));
    	Hashtable hash = getHashMultiUpdateData(multiUpdateData2);

    	
    	String mode = Util.checkString((String)hash.get("m"));
    	String tmnl_no	= Util.checkString((String)hash.get("tmnl_no"));
    	String aprv_dt	= Util.checkString((String)hash.get("aprv_dt"));
    	String branch_nm	= Util.checkString((String)hash.get("branch_nm"));
    	String card_no	= Util.checkString((String)hash.get("card_no"));
    	String req_amt	= Util.checkString((String)hash.get("req_amt"));
    	String job_flg	= Util.checkString((String)hash.get("job_flg"));
    	String aprv_no	= Util.checkString((String)hash.get("aprv_no"));
    	String card_cmpy_cd_nm	= Util.checkString((String)hash.get("card_cmpy_cd_nm"));
    	String card_clsf_nm	= Util.checkString((String)hash.get("card_clsf_nm"));
    	
    	
        // DM Setting
    	IS_DEP_4025_ADM dm = new IS_DEP_4025_ADM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
    	dm.setMode(mode.toUpperCase());
    	dm.setTmnl_no(tmnl_no);
    	dm.setAprv_dt(aprv_dt);
    	dm.setBranch_nm(branch_nm);
    	dm.setCard_no(card_no);
    	dm.setReq_amt(req_amt);
    	dm.setJob_flg(job_flg);
    	dm.setAprv_no(aprv_no);
    	dm.setCard_cmpy_cd_nm(card_cmpy_cd_nm);
    	dm.setCard_clsf_nm(card_clsf_nm);
    	dm.incmg_pers_ip = req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.print();
     
        try {
        	IsDep1000DAO dao = new IsDep1000DAO();
            ds = dao.is_dep_4025_a(dm);
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
    public void is_dep_4030_a(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
       	IS_DEP_4030_ADataSet ds = null;
       	
       	String multiUpdateData3 = Util.checkString(req.getParameter("multiUpdateData3"));
    	Hashtable hash = getHashMultiUpdateData(multiUpdateData3);

    	String mode = Util.checkString((String)hash.get("m"));
    	String aprv_dt	= Util.checkString((String)hash.get("aprv_dt"));
    	String aprv_no	= Util.checkString((String)hash.get("aprv_no"));
    	String card_no	= Util.checkString((String)hash.get("card_no"));
    	String rcpm_amt	= Util.checkString((String)hash.get("rcpm_amt"));
    	String coms	= Util.checkString((String)hash.get("coms"));
    	String rcpm_dt	= Util.checkString((String)hash.get("rcpm_dt"));
    	
    	
        // DM Setting
    	IS_DEP_4030_ADM dm = new IS_DEP_4030_ADM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
    	dm.setMode(mode.toUpperCase());
    	dm.setAprv_dt(aprv_dt);
    	dm.setAprv_no(aprv_no);
    	dm.setCard_no(card_no);
    	dm.setRcpm_amt(rcpm_amt);
    	dm.setComs(coms);
    	dm.setRcpm_dt(rcpm_dt);
    	dm.incmg_pers_ip = req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.print();
     
        try {
        	IsDep1000DAO dao = new IsDep1000DAO();
            ds = dao.is_dep_4030_a(dm);
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
    public void is_dep_4040_a(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
      	IS_DEP_4040_ADataSet ds = null;
      	
      	String multiUpdateData4 = Util.checkString(req.getParameter("multiUpdateData4"));
    	Hashtable hash = getHashMultiUpdateData(multiUpdateData4);	
      	
    	String card_rcpm_reg_dt	= Util.checkString((String)hash.get("card_rcpm_reg_dt"));
    	String card_rcpm_reg_seq = Util.checkString((String)hash.get("card_rcpm_reg_seq"));
    	
      	
        // DM Setting
    	IS_DEP_4040_ADM dm = new IS_DEP_4040_ADM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
    	dm.setCard_rcpm_reg_dt(card_rcpm_reg_dt);
    	dm.setCard_rcpm_reg_seq(card_rcpm_reg_seq);
    	dm.incmg_pers_ip = req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.print();
     
        try {
        	IsDep1000DAO dao = new IsDep1000DAO();
            ds = dao.is_dep_4040_a(dm);
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
    public void is_dep_4045_a(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
      	IS_DEP_4045_ADataSet ds = null;
      	
      	String multiUpdateData4 = Util.checkString(req.getParameter("multiUpdateData4"));
    	Hashtable hash = getHashMultiUpdateData(multiUpdateData4);	
      	
    	String card_rcpm_reg_dt	= Util.checkString((String)hash.get("card_rcpm_reg_dt"));
    	String card_rcpm_reg_seq = Util.checkString((String)hash.get("card_rcpm_reg_seq"));
    	
        // DM Setting
    	IS_DEP_4045_ADM dm = new IS_DEP_4045_ADM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
    	dm.setCard_rcpm_reg_dt(card_rcpm_reg_dt);
    	dm.setCard_rcpm_reg_seq(card_rcpm_reg_seq);
    	dm.incmg_pers_ip = req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.print();
        try {
        	IsDep1000DAO dao = new IsDep1000DAO();
            ds = dao.is_dep_4045_a(dm);
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
    public void is_dep_4051_l(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_DEP_4051_LDataSet ds = null;

        // DM Setting
    	IS_DEP_4051_LDM dm 	= new IS_DEP_4051_LDM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
    	dm.flag = Util.checkString(req.getParameter("flag"));
    	dm.card_rcpm_reg_dt = Util.checkString(req.getParameter("card_rcpm_reg_dt"));
    	dm.card_rcpm_reg_seq = Util.checkString(req.getParameter("card_rcpm_reg_seq"));
    	dm.proc_frdt = Util.checkString(req.getParameter("proc_frdt"));
    	dm.proc_todt = Util.checkString(req.getParameter("proc_todt"));
        dm.print();
     
        try {
        	IsDep1000DAO dao = new IsDep1000DAO();
            ds = dao.is_dep_4051_l(dm);
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
    public void is_dep_4055_a(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
      	IS_DEP_4055_ADataSet ds = null;

      	String multiUpdateData1 = Util.checkString(req.getParameter("multiUpdateData1"));
    	Hashtable hash = getHashMultiUpdateData(multiUpdateData1);	
    	
     	
    	String setoff_yn = Util.checkString((String)hash.get("setoff_yn"));
    	String setoff_suply_amt	= Util.checkString((String)hash.get("rcpm_suply_amt")); /**상계광고료**/
    	String setoff_vat_amt = Util.checkString((String)hash.get("rcpm_vat"));	/**상계부가세**/
    	String acwr_reg_dt = Util.checkString((String)hash.get("acwr_reg_dt"));
    	String acwr_reg_seq	= Util.checkString((String)hash.get("acwr_reg_seq"));
    	String sale_dlco_li_seq	= Util.checkString((String)hash.get("sale_dlco_li_seq"));
    	
    	
        // DM Setting
    	IS_DEP_4055_ADM dm = new IS_DEP_4055_ADM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
    	dm.flag = Util.checkString(req.getParameter("flag"));
    	dm.card_rcpm_reg_dt = Util.checkString(req.getParameter("card_rcpm_reg_dt"));
    	dm.card_rcpm_reg_seq = Util.checkString(req.getParameter("card_rcpm_reg_seq"));
    	dm.setSetoff_yn(setoff_yn);
    	dm.setSetoff_suply_amt(setoff_suply_amt);
    	dm.setSetoff_vat_amt(setoff_vat_amt);
    	dm.setAcwr_reg_dt(acwr_reg_dt);
    	dm.setAcwr_reg_seq(acwr_reg_seq);
    	dm.setSale_dlco_li_seq(sale_dlco_li_seq);
    	dm.incmg_pers_ip = req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.print();
     
        try {
        	IsDep1000DAO dao = new IsDep1000DAO();
            ds = dao.is_dep_4055_a(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            throw e;
        }
    }
    
    
    
    /*********************************************************************************/
	/**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void is_dep_4300_m(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_DEP_4300_MDataSet ds = null;

        // DM Setting
    	IS_DEP_4300_MDM dm = new IS_DEP_4300_MDM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
    	dm.medi_clsf = Util.checkString(req.getParameter("medi_clsf"));
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
        dm.print();
     
        try {
        	IsDep1000DAO dao = new IsDep1000DAO();
            ds = dao.is_dep_4300_m(dm);
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
    public void is_dep_4310_l(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_DEP_4310_LDataSet ds = null;

        // DM Setting
    	IS_DEP_4310_LDM dm = new IS_DEP_4310_LDM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.frdt = Util.checkString(req.getParameter("frdt"));
		dm.todt = Util.checkString(req.getParameter("todt"));
		dm.bank_cd = Util.checkString(req.getParameter("bank_cd"));
		dm.note_clsf_cd = Util.checkString(req.getParameter("note_clsf_cd"));
		dm.issu_cmpy_clsf_cd = Util.checkString(req.getParameter("issu_cmpy_clsf_cd"));
		dm.issu_pers_nm = Util.checkString(req.getParameter("issu_pers_nm"));
		dm.rcpm_acct = Util.checkString(req.getParameter("rcpm_acct"));
		dm.sale_aprv_no = Util.checkString(req.getParameter("sale_aprv_no"));
		dm.reg_yn = Util.checkString(req.getParameter("reg_yn"));
        dm.print();
     
        try {
        	IsDep1000DAO dao = new IsDep1000DAO();
            ds = dao.is_dep_4310_l(dm);
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
    public void is_dep_4350_a(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_DEP_4350_ADataSet ds = null;
    	
    	// DM Setting
    	String cmpy_cd       = Util.getSessionParameterValue(req, "cmpycd", true);
    	String incmg_pers    = Util.getSessionParameterValue(req, "emp_no", true);
    	String incmg_pers_ip = req.getRemoteAddr();

    	//String flag  		   = Util.checkString(req.getParameter("flag"));
    	String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
    	Hashtable hash = getHashMultiUpdateData(multiUpdateData);

    	String mode				= Util.checkString((String)hash.get("m"));
    	String occr_dt			= Util.checkString((String)hash.get("occr_dt"));
    	String bank_cd 			= Util.checkString((String)hash.get("bank_cd"));
    	String note_clsf_cd	   	= Util.checkString((String)hash.get("note_clsf_cd"));
    	String occr_seq	   		= Util.checkString((String)hash.get("occr_seq"));
    	String issu_cmpy_clsf_cd= Util.checkString((String)hash.get("issu_cmpy_clsf_cd"));
    	String issu_pers_nm	 	= Util.checkString((String)hash.get("issu_pers_nm"));
    	String endorser_nm	 	= Util.checkString((String)hash.get("endorser_nm"));
    	String note_amt	   		= Util.checkString((String)hash.get("note_amt"));
    	String comp_dt	   		= Util.checkString((String)hash.get("comp_dt"));
    	String mtry_dt		   	= Util.checkString((String)hash.get("mtry_dt"));
    	String rcpm_acct   		= Util.checkString((String)hash.get("rcpm_acct"));
    	String sale_aprv_no		= Util.checkString((String)hash.get("sale_aprv_no"));
    	
    	IS_DEP_4350_ADM dm = new IS_DEP_4350_ADM();
    	
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setOccr_dt(occr_dt);
    	dm.setBank_cd(bank_cd);
    	dm.setNote_clsf_cd(note_clsf_cd);
    	dm.setOccr_seq(occr_seq);
    	dm.setIssu_cmpy_clsf_cd(issu_cmpy_clsf_cd);
    	dm.setIssu_pers_nm(issu_pers_nm);
    	dm.setEndorser_nm(endorser_nm);
    	dm.setNote_amt(note_amt);
    	dm.setComp_dt(comp_dt);
    	dm.setMtry_dt(mtry_dt);
    	dm.setRcpm_acct(rcpm_acct);
    	dm.setSale_aprv_no(sale_aprv_no);
    	dm.setIncmg_pers_ip(incmg_pers_ip);
    	dm.setIncmg_pers(incmg_pers);
    	dm.setMode(mode.toUpperCase());
        dm.print();
     
        try {
        	IsDep1000DAO dao = new IsDep1000DAO();
        	ds = dao.is_dep_4350_a(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            throw e;
        }
    } 
    /*********************************************************************************/
	/**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void is_dep_4500_m(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_DEP_4500_MDataSet ds = null;

        // DM Setting
    	IS_DEP_4500_MDM dm = new IS_DEP_4500_MDM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.auth_gb = Util.checkString(req.getParameter("auth_gb"));
		dm.use_yn = Util.checkString(req.getParameter("use_yn"));
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.base_dt = Util.checkString(req.getParameter("base_dt"));
        dm.print();
     
        try {
        	IsDep1000DAO dao = new IsDep1000DAO();
            ds = dao.is_dep_4500_m(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            throw e;
        }
    }    
    
    
    /*********************************************************************************/
    
    
    /**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void is_dep_4600_m(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_DEP_4600_MDataSet ds = null;

        // DM Setting
    	IS_DEP_4600_MDM dm = new IS_DEP_4600_MDM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
        dm.print();
        try {
        	IsDep1000DAO dao = new IsDep1000DAO();
            ds = dao.is_dep_4600_m(dm);
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
    public void is_dep_4610_l(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	IS_DEP_4610_LDataSet ds = null;

        // DM Setting
    	IS_DEP_4610_LDM dm = new IS_DEP_4610_LDM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
    	dm.work_clsf = Util.checkString(req.getParameter("work_clsf"));
		dm.clos_dt = Util.checkString(req.getParameter("clos_dt"));
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.print();
        try {
        	IsDep1000DAO dao = new IsDep1000DAO();
            ds = dao.is_dep_4610_l(dm);
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
    public void is_dep_4620_a(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
       	IS_DEP_4620_ADataSet ds = null;

        // DM Setting
    	IS_DEP_4620_ADM dm = new IS_DEP_4620_ADM();       	
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
    	dm.work_clsf = Util.checkString(req.getParameter("work_clsf"));
		dm.clos_dt = Util.checkString(req.getParameter("clos_dt"));
		dm.incmg_dept_cd = Util.getSessionParameterValue(req, "deptcd", true);	/**Session 부서코드**/
		dm.incmg_pers_ip = req.getRemoteAddr();
    	dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);

        dm.print();
        
        try {
        	IsDep1000DAO dao = new IsDep1000DAO();
            ds = dao.is_dep_4620_a(dm);
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
    public void is_dep_4630_a(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
       	IS_DEP_4630_ADataSet ds = null;
 
        // DM Setting
    	IS_DEP_4630_ADM dm = new IS_DEP_4630_ADM();       	
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
    	dm.work_clsf = Util.checkString(req.getParameter("work_clsf"));
		dm.clos_dt = Util.checkString(req.getParameter("clos_dt"));
		dm.actu_slip_no = Util.checkString(req.getParameter("actu_slip_no"));
		
		dm.incmg_pers_ip = req.getRemoteAddr();
    	dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);

        dm.print();
         
        try {
        	IsDep1000DAO dao = new IsDep1000DAO();
            ds = dao.is_dep_4630_a(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            throw e;
        }
    }      
    
}

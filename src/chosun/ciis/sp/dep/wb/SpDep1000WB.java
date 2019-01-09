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

package chosun.ciis.sp.dep.wb;

import java.sql.CallableStatement;
import java.util.Hashtable;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.db.DBManager;
import somo.framework.expt.AppException;
import somo.framework.util.Util;
import chosun.ciis.sp.dep.dao.SpDep1000DAO;
import chosun.ciis.sp.dep.dm.*;
import chosun.ciis.sp.dep.ds.*;

import chosun.ciis.co.base.util.StringUtil;
import chosun.ciis.co.base.wb.BaseWB;
import chosun.ciis.is.dep.dao.IsDep1000DAO;
import chosun.ciis.is.dep.dm.IS_DEP_1020_ADM;
import chosun.ciis.is.dep.dm.IS_DEP_1030_ADM;
import chosun.ciis.is.dep.dm.IS_DEP_1040_ADM;
import chosun.ciis.is.dep.dm.IS_DEP_1055_ADM;
import chosun.ciis.is.dep.dm.IS_DEP_4600_MDM;
import chosun.ciis.is.dep.ds.IS_DEP_1020_ADataSet;
import chosun.ciis.is.dep.ds.IS_DEP_1030_ADataSet;
import chosun.ciis.is.dep.ds.IS_DEP_1040_ADataSet;
import chosun.ciis.is.dep.ds.IS_DEP_4600_MDataSet;

import java.sql.SQLException;
import somo.framework.expt.SysException;
/**
 * 
 */

public class SpDep1000WB extends BaseWB {
	
	/*****************************************************************************************/
	/**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void sp_dep_1000_m(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	SP_DEP_1000_MDataSet ds = null;

        // DM Setting
    	SP_DEP_1000_MDM dm = new SP_DEP_1000_MDM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.auth_gb = Util.checkString(req.getParameter("auth_gb"));
		dm.use_yn = Util.checkString(req.getParameter("use_yn"));
		dm.base_dt = Util.checkString(req.getParameter("base_dt"));
		dm.medi_clsf = Util.checkString(req.getParameter("medi_clsf"));
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.print();
     
        try {
        	SpDep1000DAO dao = new SpDep1000DAO();
            ds = dao.sp_dep_1000_m(dm);
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
    public void sp_dep_1010_s(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	SP_DEP_1010_SDataSet ds = null;

        // DM Setting
    	SP_DEP_1010_SDM dm = new SP_DEP_1010_SDM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
    	dm.occr_dt = Util.checkString(req.getParameter("occr_dt"));
		dm.slip_clsf = Util.checkString(req.getParameter("slip_clsf"));
		dm.seq = Util.checkString(req.getParameter("seq"));
        dm.print();
     
        try {
        	SpDep1000DAO dao = new SpDep1000DAO();
            ds = dao.sp_dep_1010_s(dm);
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
    public void sp_dep_1011_l(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	SP_DEP_1011_LDataSet ds = null;

        // DM Setting
    	SP_DEP_1011_LDM dm = new SP_DEP_1011_LDM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
    	dm.dlco_no = Util.checkString(req.getParameter("dlco_no"));
        dm.print();
     
        try {
        	SpDep1000DAO dao = new SpDep1000DAO();
            ds = dao.sp_dep_1011_l(dm);
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
    public void sp_dep_1012_l(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	SP_DEP_1012_LDataSet ds = null;

        // DM Setting
    	SP_DEP_1012_LDM dm = new SP_DEP_1012_LDM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
    	dm.dlco_no = Util.checkString(req.getParameter("dlco_no"));
        dm.print();
     
        try {
        	SpDep1000DAO dao = new SpDep1000DAO();
            ds = dao.sp_dep_1012_l(dm);
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
    public void sp_dep_1013_l(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	SP_DEP_1013_LDataSet ds = null;

        // DM Setting
    	SP_DEP_1013_LDM dm = new SP_DEP_1013_LDM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
    	dm.dlco_no = Util.checkString(req.getParameter("dlco_no"));
        dm.print();
     
        try {
        	SpDep1000DAO dao = new SpDep1000DAO();
            ds = dao.sp_dep_1013_l(dm);
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
    public void sp_dep_1014_l(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	SP_DEP_1014_LDataSet ds = null;

        // DM Setting
    	SP_DEP_1014_LDM dm = new SP_DEP_1014_LDM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
    	dm.slip_clsf = Util.checkString(req.getParameter("slip_clsf_p"));
		dm.slip_no = Util.checkString(req.getParameter("slip_no_p"));
        dm.print();
     
        try {
        	SpDep1000DAO dao = new SpDep1000DAO();
            ds = dao.sp_dep_1014_l(dm);
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
    public void sp_dep_1020_a(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	SP_DEP_1020_ADataSet ds = null;

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
    	Hashtable hash2 = getHashMultiUpdateData(multiUpdateData2);
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

    	String mode2 = Util.checkString((String)hash2.get("m"));
    	String acct_mang_no2 = Util.checkString((String)hash2.get("acct_mang_no"));
    	String rmtt_dt2 = Util.checkString((String)hash2.get("rmtt_dt"));
    	String amt2 = Util.checkString((String)hash2.get("amt"));
    	String rmtt_coms2 = Util.checkString((String)hash2.get("rmtt_coms"));
    	String rmtt_plac2 = Util.checkString((String)hash2.get("rmtt_plac"));
    	String card_rcpm_yn2 = Util.checkString((String)hash2.get("card_rcpm_yn"));
    	String card_mang_no2 = Util.checkString((String)hash2.get("card_mang_no"));
    	
    	String biz_reg_no2 		= Util.checkString((String)hash2.get("biz_reg_no"));
    	String bank_id2 		= Util.checkString((String)hash2.get("bank_id"));
    	String acct_num2 		= Util.checkString((String)hash2.get("acct_num"));
    	String tran_date_seq2 	= Util.checkString((String)hash2.get("tran_date_seq"));
    	String current_clsf2 	= Util.checkString((String)hash2.get("current_clsf"));
    	String curc_clsf2 		= Util.checkString((String)hash2.get("acct_tonghwa"));
    	String frex_amt2 		= Util.checkString((String)hash2.get("frex_amt"));

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
    	
        SP_DEP_1020_ADM dm = new SP_DEP_1020_ADM();
        
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
        	SpDep1000DAO	dao = new SpDep1000DAO();
            ds = dao.sp_dep_1020_a(dm);
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
    public void sp_dep_1030_a(HttpServletRequest req, HttpServletResponse pub) throws   AppException {
    	
    	SP_DEP_1030_ADataSet ds = null;

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

        SP_DEP_1030_ADM dm = new SP_DEP_1030_ADM();
        
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
        	SpDep1000DAO	dao = new SpDep1000DAO();
            ds = dao.sp_dep_1030_a(dm);
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
    public void sp_dep_1040_a(HttpServletRequest req, HttpServletResponse pub) throws   AppException {
    	
    	SP_DEP_1040_ADataSet ds = null;

        // DM Setting

    	String cmpy_cd    = Util.getSessionParameterValue(req, "cmpycd", true);
    	String medi_clsf = Util.getSessionParameterValue(req, "dealmedicd", true);
    	String occr_dt = Util.checkString(req.getParameter("occr_dt"));
    	String slip_clsf = Util.checkString(req.getParameter("slip_clsf"));
    	String seq = Util.checkString(req.getParameter("seq"));
    	String incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);

    	SP_DEP_1040_ADM dm = new SP_DEP_1040_ADM();
        
        dm.setMedi_clsf(medi_clsf); 
        dm.setCmpy_cd(cmpy_cd);
        dm.setOccr_dt(occr_dt);
        dm.setSlip_clsf(slip_clsf);
        dm.setSeq(seq);
        dm.setIncmg_pers(incmg_pers);
        dm.print();

        try {
        	SpDep1000DAO	dao = new SpDep1000DAO();
            ds = dao.sp_dep_1040_a(dm);
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
    public void sp_dep_1051_l(HttpServletRequest req, HttpServletResponse pub) throws   AppException {
    	
    	SP_DEP_1051_LDataSet ds = null;

        // DM Setting
    	SP_DEP_1051_LDM dm = new SP_DEP_1051_LDM();
    	dm.flag = Util.checkString(req.getParameter("flag"));
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.occr_dt = Util.checkString(req.getParameter("occr_dt"));
		dm.slip_clsf = Util.checkString(req.getParameter("slip_clsf"));
		dm.seq = Util.checkString(req.getParameter("seq"));
		dm.proc_frdt = Util.checkString(req.getParameter("pubc_frdt")).substring(0, 6);
		dm.proc_todt = Util.checkString(req.getParameter("pubc_todt")).substring(0, 6);
		dm.sale_item_cd = Util.checkString(req.getParameter("sale_item_cd"));
        dm.print();

        try {
        	SpDep1000DAO	dao = new SpDep1000DAO();
            ds = dao.sp_dep_1051_l(dm);
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
    public void sp_dep_1055_a(HttpServletRequest req, HttpServletResponse pub) throws   AppException {
    	
    	SP_DEP_1055_ADataSet ds = null;

    	String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
    	Hashtable hash = getHashMultiUpdateData(multiUpdateData);
    	
    	String setoff_yn 	    = Util.checkString((String)hash.get("setoff_yn"));
    	String setoff_suply_amt = Util.checkString((String)hash.get("rcpm_suply_amt"));
    	String setoff_vat_amt 	= Util.checkString((String)hash.get("rcpm_vat"));
    	String sale_yymm    	= Util.checkString((String)hash.get("sale_yymm")); 	/**key1**/
    	String sale_seq     	= Util.checkString((String)hash.get("sale_seq"));	/**key2**/
    	
        // DM Setting
    	SP_DEP_1055_ADM dm = new SP_DEP_1055_ADM();
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
		dm.setSale_yymm(sale_yymm);
		dm.setSale_seq(sale_seq);
        dm.print();

        try {
        	SpDep1000DAO	dao = new SpDep1000DAO();
            ds = dao.sp_dep_1055_a(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        }  
    }
	/*****************************************************************************************/
    /**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void sp_dep_1100_m(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	SP_DEP_1100_MDataSet ds = null;

        // DM Setting
    	SP_DEP_1100_MDM dm = new SP_DEP_1100_MDM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
    	dm.clos_yymm = Util.checkString(req.getParameter("dd_clos_yymm")).substring(0,6);
		dm.work_clsf = Util.checkString(req.getParameter("dd_work_clsf"));
        dm.print();
     
        try {
        	SpDep1000DAO dao = new SpDep1000DAO();
            ds = dao.sp_dep_1100_m(dm);
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
    public void sp_dep_1101_m(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	SP_DEP_1101_MDataSet ds = null;

        // DM Setting
    	SP_DEP_1101_MDM dm = new SP_DEP_1101_MDM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
    	dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.print();
     
        try {
        	SpDep1000DAO dao = new SpDep1000DAO();
            ds = dao.sp_dep_1101_m(dm);
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
    public void sp_dep_1110_a(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	SP_DEP_1110_ADataSet ds = null;

        // DM Setting
    	SP_DEP_1110_ADM dm = new SP_DEP_1110_ADM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.work_clsf = Util.checkString(req.getParameter("dd_work_clsf"));
		dm.clos_dt = Util.checkString(req.getParameter("dd_clos_dt"));
		dm.incmg_dept_cd = Util.getSessionParameterValue(req, "deptcd", true);	/**Session 부서코드**/
		dm.incmg_pers_ip = req.getRemoteAddr();
    	dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.print();
     
        try {
        	SpDep1000DAO dao = new SpDep1000DAO();
            ds = dao.sp_dep_1110_a(dm);
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
    public void sp_dep_1111_a(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	SP_DEP_1111_ADataSet ds = null;

        // DM Setting
    	SP_DEP_1111_ADM dm = new SP_DEP_1111_ADM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.work_clsf = Util.checkString(req.getParameter("dd_work_clsf"));
		dm.clos_dt = Util.checkString(req.getParameter("dd_clos_dt"));
		dm.incmg_dept_cd = Util.getSessionParameterValue(req, "deptcd", true);	/**Session 부서코드**/
		dm.incmg_pers_ip = req.getRemoteAddr();
    	dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.print();
     
        try {
        	SpDep1000DAO dao = new SpDep1000DAO();
            ds = dao.sp_dep_1111_a(dm);
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
    public void sp_dep_1120_a(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	SP_DEP_1120_ADataSet ds = null;

        // DM Setting
    	SP_DEP_1120_ADM dm = new SP_DEP_1120_ADM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.work_clsf = Util.checkString(req.getParameter("dd_work_clsf"));
		dm.clos_dt = Util.checkString(req.getParameter("dd_clos_dt"));
		dm.incmg_pers_ip = req.getRemoteAddr();
    	dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.print();
     
        try {
        	SpDep1000DAO dao = new SpDep1000DAO();
            ds = dao.sp_dep_1120_a(dm);
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
    public void sp_dep_1121_a(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	SP_DEP_1121_ADataSet ds = null;

        // DM Setting
    	SP_DEP_1121_ADM dm = new SP_DEP_1121_ADM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.work_clsf = Util.checkString(req.getParameter("dd_work_clsf"));
		dm.clos_dt = Util.checkString(req.getParameter("dd_clos_dt"));
		dm.incmg_pers_ip = req.getRemoteAddr();
    	dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.print();
     
        try {
        	SpDep1000DAO dao = new SpDep1000DAO();
            ds = dao.sp_dep_1121_a(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            throw e;
        }
    }
    /*****************************************************************************************/
	/**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void sp_dep_1300_m(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	SP_DEP_1300_MDataSet ds = null;

        // DM Setting
    	SP_DEP_1300_MDM dm = new SP_DEP_1300_MDM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.print();
     
        try {
        	SpDep1000DAO dao = new SpDep1000DAO();
            ds = dao.sp_dep_1300_m(dm);
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
    public void sp_dep_1310_l(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	SP_DEP_1310_LDataSet ds = null;

        // DM Setting
    	SP_DEP_1310_LDM dm = new SP_DEP_1310_LDM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
    	dm.sale_item_cd = Util.checkString(req.getParameter("sale_item_cd"));
    	dm.basi_yymm    = Util.checkString(req.getParameter("basi_yymm"));    	
		dm.sp_comp_chrg_pers_emp_no = Util.checkString(req.getParameter("sp_comp_chrg_pers_emp_no"));
        dm.print();
     
        try {
        	SpDep1000DAO dao = new SpDep1000DAO();
            ds = dao.sp_dep_1310_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            throw e;
        }
    }
    
	/*****************************************************************************************/
    /**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void sp_dep_1510_a(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	SP_DEP_1510_ADataSet ds = null;

    	String multiUpdateData1 = Util.checkString(req.getParameter("multiUpdateData1")); 
    	Hashtable hash1 = getHashMultiUpdateData(multiUpdateData1);
    	
    	String dlco_no = Util.checkString((String )hash1.get("dlco_no"));
    	String sale_yymm = Util.checkString((String )hash1.get("sale_yymm"));      	
    	String sale_item_cd = Util.checkString((String )hash1.get("sale_item_cd"));    
    	String amt = Util.checkString((String )hash1.get("amt"));    
    	
        // DM Setting
    	SP_DEP_1510_ADM dm = new SP_DEP_1510_ADM();
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.reg_dt = Util.checkString(req.getParameter("reg_dt"));
		dm.occr_slip_clsf = Util.checkString(req.getParameter("slip_clsf_p"));
		dm.occr_slip = Util.checkString(req.getParameter("slip_no_p"));
		dm.setDlco_no(dlco_no);
		dm.setSale_yymm(sale_yymm);		
		dm.setSale_item_cd(sale_item_cd);
		dm.setAmt(amt);
		dm.incmg_dept_cd = Util.getSessionParameterValue(req, "deptcd", true);	/**Session 부서코드**/
		dm.incmg_pers_ip = req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        //dm.print();
     
        try {
        	SpDep1000DAO dao = new SpDep1000DAO();
            ds = dao.sp_dep_1510_a(dm);
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
    public void sp_dep_1520_l(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	SP_DEP_1520_LDataSet ds = null;

        // DM Setting
    	SP_DEP_1520_LDM dm = new SP_DEP_1520_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.reg_dt = Util.checkString(req.getParameter("reg_dt"));
		dm.reg_seq = Util.checkString(req.getParameter("reg_seq"));
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.print();
     
        try {
        	SpDep1000DAO dao = new SpDep1000DAO();
            ds = dao.sp_dep_1520_l(dm);
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
    public void sp_dep_1530_a(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	SP_DEP_1530_ADataSet ds = null;

        // DM Setting
    	SP_DEP_1530_ADM dm = new SP_DEP_1530_ADM();
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.reg_dt = Util.checkString(req.getParameter("reg_dt"));
		dm.reg_seq = Util.checkString(req.getParameter("reg_seq"));
		dm.incmg_dept_cd = Util.getSessionParameterValue(req, "deptcd", true);	/**Session 부서코드**/
		dm.incmg_pers_ip = req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.print();
     
        try {
        	SpDep1000DAO dao = new SpDep1000DAO();
            ds = dao.sp_dep_1530_a(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            throw e;
        }
    }
	/*****************************************************************************************/
    /**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void sp_dep_1750_m(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	SP_DEP_1750_MDataSet ds = null;

        // DM Setting
    	SP_DEP_1750_MDM dm = new SP_DEP_1750_MDM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = Util.getSessionParameterValue(req, "emp_no", true);
        dm.print();
     
        try {
        	SpDep1000DAO dao = new SpDep1000DAO();
            ds = dao.sp_dep_1750_m(dm);
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
    public void sp_dep_1751_l(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	SP_DEP_1751_LDataSet ds = null;

        // DM Setting
    	SP_DEP_1751_LDM dm = new SP_DEP_1751_LDM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
    	dm.slip_clsf = Util.checkString(req.getParameter("slip_clsf"));
		dm.date_clsf = Util.checkString(req.getParameter("date_clsf"));
		dm.frdt = Util.checkString(req.getParameter("frdt"));
		dm.todt = Util.checkString(req.getParameter("todt"));
		dm.dlco_no = Util.checkString(req.getParameter("dlco_no"));
		dm.rcpm_clsf = Util.checkString(req.getParameter("rcpm_clsf"));
		dm.note_clsf = Util.checkString(req.getParameter("note_clsf"));
		dm.dept_cd = Util.checkString(req.getParameter("dept_cd"));
		dm.mchrg_pers = Util.checkString(req.getParameter("mchrg_pers"));
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.print();
     
        try {
        	SpDep1000DAO dao = new SpDep1000DAO();
            ds = dao.sp_dep_1751_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            throw e;
        }
    }
    /**********************************************************************************************/    
    /**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void sp_dep_4600_m(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	SP_DEP_4600_MDataSet ds = null;

        // DM Setting
    	SP_DEP_4600_MDM dm = new SP_DEP_4600_MDM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
        dm.print();
        try {
        	SpDep1000DAO dao = new SpDep1000DAO();
            ds = dao.sp_dep_4600_m(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            throw e;
        }
    }    
    /**********************************************************************************************/

    /**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void sp_dep_4610_l(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
    	SP_DEP_4610_LDataSet ds = null;

        // DM Setting
    	SP_DEP_4610_LDM dm = new SP_DEP_4610_LDM();
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
    	dm.work_clsf = Util.checkString(req.getParameter("work_clsf"));
		dm.clos_dt = Util.checkString(req.getParameter("clos_dt"));
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
        dm.print();
        try {
        	SpDep1000DAO dao = new SpDep1000DAO();
            ds = dao.sp_dep_4610_l(dm);
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
    public void sp_dep_4620_a(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
       	SP_DEP_4620_ADataSet ds = null;

        // DM Setting
    	SP_DEP_4620_ADM dm = new SP_DEP_4620_ADM();       	
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
    	dm.work_clsf = Util.checkString(req.getParameter("work_clsf"));
		dm.clos_dt = Util.checkString(req.getParameter("clos_dt"));
		dm.incmg_dept_cd = Util.getSessionParameterValue(req, "deptcd", true);	/**Session 부서코드**/
		dm.incmg_pers_ip = req.getRemoteAddr();
    	dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);

        dm.print();
        
        try {
        	SpDep1000DAO dao = new SpDep1000DAO();
            ds = dao.sp_dep_4620_a(dm);
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
    public void sp_dep_4630_a(HttpServletRequest req, HttpServletResponse res) throws   AppException{
    	
       	SP_DEP_4630_ADataSet ds = null;
 
        // DM Setting
    	SP_DEP_4630_ADM dm = new SP_DEP_4630_ADM();       	
    	dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
    	dm.work_clsf = Util.checkString(req.getParameter("work_clsf"));
		dm.clos_dt = Util.checkString(req.getParameter("clos_dt"));
		dm.actu_slip_no = Util.checkString(req.getParameter("actu_slip_no"));
 
		dm.incmg_pers_ip = req.getRemoteAddr();
    	dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);

        dm.print();
         
        try {
        	SpDep1000DAO dao = new SpDep1000DAO();
            ds = dao.sp_dep_4630_a(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            throw e;
        }
    }  
    
}

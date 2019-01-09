/***************************************************************************************************
* 파일명 : .java
* 기능 : 독자우대-구독신청
* 작성일자 : 2007-05-22
* 작성자 : 김대섭
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.as.aset.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.as.aset.ds.*;
import chosun.ciis.as.aset.rec.*;

/**
 * 
 */


public class AS_ASET_1503_IDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String chg_dt;
	public String remk;
	public String dlco_clsf_cd;
	public String dlco_ern;
	public String slip_occr_dt;
	public String slip_clsf_cd;
	public String slip_seq;
	public String tax_stmt_no;
	public String draft_doc_no2;
	public String incmg_pers_ipadd;
	public String incmg_pers;
	public String chg_pers;
	public String aset_no;
	public String chg_amt;
	public String chg_vat_amt;
	public String sale_now_acqr_amt;
	public String sale_redm_tot_amt;
	public String sale_un_redm_amt;
	public String sale_pfls_amt;
	public String budg_cd;
	public String dtls_remk;
	public String cash_sub_seq;
	public String cash_rcpm_amt;
	public String deps_mode;
	public String deps_sub_seq;
	public String deps_rcpm_amt;
	public String deps_rmtt_dt;
	public String deps_rmtt_plac;
	public String deps_acct_mang_no;
	public String deps_coms_amt;
	public String deps_biz_reg_no;
	public String deps_bank_id;
	public String deps_acct_num;
	public String deps_tran_date;
	public String deps_tran_date_seq;
	public String note_mode;
	public String note_sub_seq;
	public String note_bank_cd;
	public String note_note_no;
	public String note_note_clsf_cd;
	public String note_comp_dt;
	public String note_mtry_dt;
	public String note_rcpm_amt;
	public String note_issu_cmpy_clsf;
	public String note_issu_pers_nm;
	public String note_rcpm_acct;
	public String note_sale_aprv_no;
	public String etc_mode;
	public String etc_sub_seq;
	public String etc_budg_cd;
	public String etc_rcpm_amt;
	public String etc_bal_occr_slip_clsf;
	public String etc_bal_occr_slip_no;
	public String dept_cd;
	public String rcpm_amt;
	public String rcpm_shet_no;

	public AS_ASET_1503_IDM(){}
	public AS_ASET_1503_IDM(String cmpy_cd, String chg_dt, String remk, String dlco_clsf_cd, String dlco_ern, String slip_occr_dt, String slip_clsf_cd, String slip_seq, String tax_stmt_no, String draft_doc_no2, String incmg_pers_ipadd, String incmg_pers, String chg_pers, String aset_no, String chg_amt, String chg_vat_amt, String sale_now_acqr_amt, String sale_redm_tot_amt, String sale_un_redm_amt, String sale_pfls_amt, String budg_cd, String dtls_remk, String cash_sub_seq, String cash_rcpm_amt, String deps_mode, String deps_sub_seq, String deps_rcpm_amt, String deps_rmtt_dt, String deps_rmtt_plac, String deps_acct_mang_no, String deps_coms_amt, String deps_biz_reg_no, String deps_bank_id, String deps_acct_num, String deps_tran_date, String deps_tran_date_seq, String note_mode, String note_sub_seq, String note_bank_cd, String note_note_no, String note_note_clsf_cd, String note_comp_dt, String note_mtry_dt, String note_rcpm_amt, String note_issu_cmpy_clsf, String note_issu_pers_nm, String note_rcpm_acct, String note_sale_aprv_no, String etc_mode, String etc_sub_seq, String etc_budg_cd, String etc_rcpm_amt, String etc_bal_occr_slip_clsf, String etc_bal_occr_slip_no, String dept_cd, String rcpm_amt, String rcpm_shet_no){
		this.cmpy_cd = cmpy_cd;
		this.chg_dt = chg_dt;
		this.remk = remk;
		this.dlco_clsf_cd = dlco_clsf_cd;
		this.dlco_ern = dlco_ern;
		this.slip_occr_dt = slip_occr_dt;
		this.slip_clsf_cd = slip_clsf_cd;
		this.slip_seq = slip_seq;
		this.tax_stmt_no = tax_stmt_no;
		this.draft_doc_no2 = draft_doc_no2;
		this.incmg_pers_ipadd = incmg_pers_ipadd;
		this.incmg_pers = incmg_pers;
		this.chg_pers = chg_pers;
		this.aset_no = aset_no;
		this.chg_amt = chg_amt;
		this.chg_vat_amt = chg_vat_amt;
		this.sale_now_acqr_amt = sale_now_acqr_amt;
		this.sale_redm_tot_amt = sale_redm_tot_amt;
		this.sale_un_redm_amt = sale_un_redm_amt;
		this.sale_pfls_amt = sale_pfls_amt;
		this.budg_cd = budg_cd;
		this.dtls_remk = dtls_remk;
		this.cash_sub_seq = cash_sub_seq;
		this.cash_rcpm_amt = cash_rcpm_amt;
		this.deps_mode = deps_mode;
		this.deps_sub_seq = deps_sub_seq;
		this.deps_rcpm_amt = deps_rcpm_amt;
		this.deps_rmtt_dt = deps_rmtt_dt;
		this.deps_rmtt_plac = deps_rmtt_plac;
		this.deps_acct_mang_no = deps_acct_mang_no;
		this.deps_coms_amt = deps_coms_amt;
		this.deps_biz_reg_no = deps_biz_reg_no;
		this.deps_bank_id = deps_bank_id;
		this.deps_acct_num = deps_acct_num;
		this.deps_tran_date = deps_tran_date;
		this.deps_tran_date_seq = deps_tran_date_seq;
		this.note_mode = note_mode;
		this.note_sub_seq = note_sub_seq;
		this.note_bank_cd = note_bank_cd;
		this.note_note_no = note_note_no;
		this.note_note_clsf_cd = note_note_clsf_cd;
		this.note_comp_dt = note_comp_dt;
		this.note_mtry_dt = note_mtry_dt;
		this.note_rcpm_amt = note_rcpm_amt;
		this.note_issu_cmpy_clsf = note_issu_cmpy_clsf;
		this.note_issu_pers_nm = note_issu_pers_nm;
		this.note_rcpm_acct = note_rcpm_acct;
		this.note_sale_aprv_no = note_sale_aprv_no;
		this.etc_mode = etc_mode;
		this.etc_sub_seq = etc_sub_seq;
		this.etc_budg_cd = etc_budg_cd;
		this.etc_rcpm_amt = etc_rcpm_amt;
		this.etc_bal_occr_slip_clsf = etc_bal_occr_slip_clsf;
		this.etc_bal_occr_slip_no = etc_bal_occr_slip_no;
		this.dept_cd = dept_cd;
		this.rcpm_amt = rcpm_amt;
		this.rcpm_shet_no = rcpm_shet_no;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setChg_dt(String chg_dt){
		this.chg_dt = chg_dt;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setDlco_clsf_cd(String dlco_clsf_cd){
		this.dlco_clsf_cd = dlco_clsf_cd;
	}

	public void setDlco_ern(String dlco_ern){
		this.dlco_ern = dlco_ern;
	}

	public void setSlip_occr_dt(String slip_occr_dt){
		this.slip_occr_dt = slip_occr_dt;
	}

	public void setSlip_clsf_cd(String slip_clsf_cd){
		this.slip_clsf_cd = slip_clsf_cd;
	}

	public void setSlip_seq(String slip_seq){
		this.slip_seq = slip_seq;
	}

	public void setTax_stmt_no(String tax_stmt_no){
		this.tax_stmt_no = tax_stmt_no;
	}

	public void setDraft_doc_no2(String draft_doc_no2){
		this.draft_doc_no2 = draft_doc_no2;
	}

	public void setIncmg_pers_ipadd(String incmg_pers_ipadd){
		this.incmg_pers_ipadd = incmg_pers_ipadd;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setChg_pers(String chg_pers){
		this.chg_pers = chg_pers;
	}

	public void setAset_no(String aset_no){
		this.aset_no = aset_no;
	}

	public void setChg_amt(String chg_amt){
		this.chg_amt = chg_amt;
	}

	public void setChg_vat_amt(String chg_vat_amt){
		this.chg_vat_amt = chg_vat_amt;
	}

	public void setSale_now_acqr_amt(String sale_now_acqr_amt){
		this.sale_now_acqr_amt = sale_now_acqr_amt;
	}

	public void setSale_redm_tot_amt(String sale_redm_tot_amt){
		this.sale_redm_tot_amt = sale_redm_tot_amt;
	}

	public void setSale_un_redm_amt(String sale_un_redm_amt){
		this.sale_un_redm_amt = sale_un_redm_amt;
	}

	public void setSale_pfls_amt(String sale_pfls_amt){
		this.sale_pfls_amt = sale_pfls_amt;
	}

	public void setBudg_cd(String budg_cd){
		this.budg_cd = budg_cd;
	}

	public void setDtls_remk(String dtls_remk){
		this.dtls_remk = dtls_remk;
	}

	public void setCash_sub_seq(String cash_sub_seq){
		this.cash_sub_seq = cash_sub_seq;
	}

	public void setCash_rcpm_amt(String cash_rcpm_amt){
		this.cash_rcpm_amt = cash_rcpm_amt;
	}

	public void setDeps_mode(String deps_mode){
		this.deps_mode = deps_mode;
	}

	public void setDeps_sub_seq(String deps_sub_seq){
		this.deps_sub_seq = deps_sub_seq;
	}

	public void setDeps_rcpm_amt(String deps_rcpm_amt){
		this.deps_rcpm_amt = deps_rcpm_amt;
	}

	public void setDeps_rmtt_dt(String deps_rmtt_dt){
		this.deps_rmtt_dt = deps_rmtt_dt;
	}

	public void setDeps_rmtt_plac(String deps_rmtt_plac){
		this.deps_rmtt_plac = deps_rmtt_plac;
	}

	public void setDeps_acct_mang_no(String deps_acct_mang_no){
		this.deps_acct_mang_no = deps_acct_mang_no;
	}

	public void setDeps_coms_amt(String deps_coms_amt){
		this.deps_coms_amt = deps_coms_amt;
	}

	public void setDeps_biz_reg_no(String deps_biz_reg_no){
		this.deps_biz_reg_no = deps_biz_reg_no;
	}

	public void setDeps_bank_id(String deps_bank_id){
		this.deps_bank_id = deps_bank_id;
	}

	public void setDeps_acct_num(String deps_acct_num){
		this.deps_acct_num = deps_acct_num;
	}

	public void setDeps_tran_date(String deps_tran_date){
		this.deps_tran_date = deps_tran_date;
	}

	public void setDeps_tran_date_seq(String deps_tran_date_seq){
		this.deps_tran_date_seq = deps_tran_date_seq;
	}

	public void setNote_mode(String note_mode){
		this.note_mode = note_mode;
	}

	public void setNote_sub_seq(String note_sub_seq){
		this.note_sub_seq = note_sub_seq;
	}

	public void setNote_bank_cd(String note_bank_cd){
		this.note_bank_cd = note_bank_cd;
	}

	public void setNote_note_no(String note_note_no){
		this.note_note_no = note_note_no;
	}

	public void setNote_note_clsf_cd(String note_note_clsf_cd){
		this.note_note_clsf_cd = note_note_clsf_cd;
	}

	public void setNote_comp_dt(String note_comp_dt){
		this.note_comp_dt = note_comp_dt;
	}

	public void setNote_mtry_dt(String note_mtry_dt){
		this.note_mtry_dt = note_mtry_dt;
	}

	public void setNote_rcpm_amt(String note_rcpm_amt){
		this.note_rcpm_amt = note_rcpm_amt;
	}

	public void setNote_issu_cmpy_clsf(String note_issu_cmpy_clsf){
		this.note_issu_cmpy_clsf = note_issu_cmpy_clsf;
	}

	public void setNote_issu_pers_nm(String note_issu_pers_nm){
		this.note_issu_pers_nm = note_issu_pers_nm;
	}

	public void setNote_rcpm_acct(String note_rcpm_acct){
		this.note_rcpm_acct = note_rcpm_acct;
	}

	public void setNote_sale_aprv_no(String note_sale_aprv_no){
		this.note_sale_aprv_no = note_sale_aprv_no;
	}

	public void setEtc_mode(String etc_mode){
		this.etc_mode = etc_mode;
	}

	public void setEtc_sub_seq(String etc_sub_seq){
		this.etc_sub_seq = etc_sub_seq;
	}

	public void setEtc_budg_cd(String etc_budg_cd){
		this.etc_budg_cd = etc_budg_cd;
	}

	public void setEtc_rcpm_amt(String etc_rcpm_amt){
		this.etc_rcpm_amt = etc_rcpm_amt;
	}

	public void setEtc_bal_occr_slip_clsf(String etc_bal_occr_slip_clsf){
		this.etc_bal_occr_slip_clsf = etc_bal_occr_slip_clsf;
	}

	public void setEtc_bal_occr_slip_no(String etc_bal_occr_slip_no){
		this.etc_bal_occr_slip_no = etc_bal_occr_slip_no;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setRcpm_amt(String rcpm_amt){
		this.rcpm_amt = rcpm_amt;
	}

	public void setRcpm_shet_no(String rcpm_shet_no){
		this.rcpm_shet_no = rcpm_shet_no;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getChg_dt(){
		return this.chg_dt;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getDlco_clsf_cd(){
		return this.dlco_clsf_cd;
	}

	public String getDlco_ern(){
		return this.dlco_ern;
	}

	public String getSlip_occr_dt(){
		return this.slip_occr_dt;
	}

	public String getSlip_clsf_cd(){
		return this.slip_clsf_cd;
	}

	public String getSlip_seq(){
		return this.slip_seq;
	}

	public String getTax_stmt_no(){
		return this.tax_stmt_no;
	}

	public String getDraft_doc_no2(){
		return this.draft_doc_no2;
	}

	public String getIncmg_pers_ipadd(){
		return this.incmg_pers_ipadd;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getChg_pers(){
		return this.chg_pers;
	}

	public String getAset_no(){
		return this.aset_no;
	}

	public String getChg_amt(){
		return this.chg_amt;
	}

	public String getChg_vat_amt(){
		return this.chg_vat_amt;
	}

	public String getSale_now_acqr_amt(){
		return this.sale_now_acqr_amt;
	}

	public String getSale_redm_tot_amt(){
		return this.sale_redm_tot_amt;
	}

	public String getSale_un_redm_amt(){
		return this.sale_un_redm_amt;
	}

	public String getSale_pfls_amt(){
		return this.sale_pfls_amt;
	}

	public String getBudg_cd(){
		return this.budg_cd;
	}

	public String getDtls_remk(){
		return this.dtls_remk;
	}

	public String getCash_sub_seq(){
		return this.cash_sub_seq;
	}

	public String getCash_rcpm_amt(){
		return this.cash_rcpm_amt;
	}

	public String getDeps_mode(){
		return this.deps_mode;
	}

	public String getDeps_sub_seq(){
		return this.deps_sub_seq;
	}

	public String getDeps_rcpm_amt(){
		return this.deps_rcpm_amt;
	}

	public String getDeps_rmtt_dt(){
		return this.deps_rmtt_dt;
	}

	public String getDeps_rmtt_plac(){
		return this.deps_rmtt_plac;
	}

	public String getDeps_acct_mang_no(){
		return this.deps_acct_mang_no;
	}

	public String getDeps_coms_amt(){
		return this.deps_coms_amt;
	}

	public String getDeps_biz_reg_no(){
		return this.deps_biz_reg_no;
	}

	public String getDeps_bank_id(){
		return this.deps_bank_id;
	}

	public String getDeps_acct_num(){
		return this.deps_acct_num;
	}

	public String getDeps_tran_date(){
		return this.deps_tran_date;
	}

	public String getDeps_tran_date_seq(){
		return this.deps_tran_date_seq;
	}

	public String getNote_mode(){
		return this.note_mode;
	}

	public String getNote_sub_seq(){
		return this.note_sub_seq;
	}

	public String getNote_bank_cd(){
		return this.note_bank_cd;
	}

	public String getNote_note_no(){
		return this.note_note_no;
	}

	public String getNote_note_clsf_cd(){
		return this.note_note_clsf_cd;
	}

	public String getNote_comp_dt(){
		return this.note_comp_dt;
	}

	public String getNote_mtry_dt(){
		return this.note_mtry_dt;
	}

	public String getNote_rcpm_amt(){
		return this.note_rcpm_amt;
	}

	public String getNote_issu_cmpy_clsf(){
		return this.note_issu_cmpy_clsf;
	}

	public String getNote_issu_pers_nm(){
		return this.note_issu_pers_nm;
	}

	public String getNote_rcpm_acct(){
		return this.note_rcpm_acct;
	}

	public String getNote_sale_aprv_no(){
		return this.note_sale_aprv_no;
	}

	public String getEtc_mode(){
		return this.etc_mode;
	}

	public String getEtc_sub_seq(){
		return this.etc_sub_seq;
	}

	public String getEtc_budg_cd(){
		return this.etc_budg_cd;
	}

	public String getEtc_rcpm_amt(){
		return this.etc_rcpm_amt;
	}

	public String getEtc_bal_occr_slip_clsf(){
		return this.etc_bal_occr_slip_clsf;
	}

	public String getEtc_bal_occr_slip_no(){
		return this.etc_bal_occr_slip_no;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getRcpm_amt(){
		return this.rcpm_amt;
	}

	public String getRcpm_shet_no(){
		return this.rcpm_shet_no;
	}

	public String getSQL(){
		 return "{ call MISAST.SP_AS_ASET_1503_I(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		AS_ASET_1503_IDM dm = (AS_ASET_1503_IDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.chg_dt);
		cstmt.setString(5, dm.remk);
		cstmt.setString(6, dm.dlco_clsf_cd);
		cstmt.setString(7, dm.dlco_ern);
		cstmt.setString(8, dm.slip_occr_dt);
		cstmt.setString(9, dm.slip_clsf_cd);
		cstmt.setString(10, dm.slip_seq);
		cstmt.setString(11, dm.tax_stmt_no);
		cstmt.setString(12, dm.draft_doc_no2);
		cstmt.setString(13, dm.incmg_pers_ipadd);
		cstmt.setString(14, dm.incmg_pers);
		cstmt.setString(15, dm.chg_pers);
		cstmt.setString(16, dm.aset_no);
		cstmt.setString(17, dm.chg_amt);
		cstmt.setString(18, dm.chg_vat_amt);
		cstmt.setString(19, dm.sale_now_acqr_amt);
		cstmt.setString(20, dm.sale_redm_tot_amt);
		cstmt.setString(21, dm.sale_un_redm_amt);
		cstmt.setString(22, dm.sale_pfls_amt);
		cstmt.setString(23, dm.budg_cd);
		cstmt.setString(24, dm.dtls_remk);
		cstmt.setString(25, dm.cash_sub_seq);
		cstmt.setString(26, dm.cash_rcpm_amt);
		cstmt.setString(27, dm.deps_mode);
		cstmt.setString(28, dm.deps_sub_seq);
		cstmt.setString(29, dm.deps_rcpm_amt);
		cstmt.setString(30, dm.deps_rmtt_dt);
		cstmt.setString(31, dm.deps_rmtt_plac);
		cstmt.setString(32, dm.deps_acct_mang_no);
		cstmt.setString(33, dm.deps_coms_amt);
		cstmt.setString(34, dm.deps_biz_reg_no);
		cstmt.setString(35, dm.deps_bank_id);
		cstmt.setString(36, dm.deps_acct_num);
		cstmt.setString(37, dm.deps_tran_date);
		cstmt.setString(38, dm.deps_tran_date_seq);
		cstmt.setString(39, dm.note_mode);
		cstmt.setString(40, dm.note_sub_seq);
		cstmt.setString(41, dm.note_bank_cd);
		cstmt.setString(42, dm.note_note_no);
		cstmt.setString(43, dm.note_note_clsf_cd);
		cstmt.setString(44, dm.note_comp_dt);
		cstmt.setString(45, dm.note_mtry_dt);
		cstmt.setString(46, dm.note_rcpm_amt);
		cstmt.setString(47, dm.note_issu_cmpy_clsf);
		cstmt.setString(48, dm.note_issu_pers_nm);
		cstmt.setString(49, dm.note_rcpm_acct);
		cstmt.setString(50, dm.note_sale_aprv_no);
		cstmt.setString(51, dm.etc_mode);
		cstmt.setString(52, dm.etc_sub_seq);
		cstmt.setString(53, dm.etc_budg_cd);
		cstmt.setString(54, dm.etc_rcpm_amt);
		cstmt.setString(55, dm.etc_bal_occr_slip_clsf);
		cstmt.setString(56, dm.etc_bal_occr_slip_no);
		cstmt.setString(57, dm.dept_cd);
		cstmt.setString(58, dm.rcpm_amt);
		cstmt.setString(59, dm.rcpm_shet_no);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.as.aset.ds.AS_ASET_1503_IDataSet();
	}



    public void print(){
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("chg_dt = " + getChg_dt());
        System.out.println("remk = " + getRemk());
        System.out.println("dlco_clsf_cd = " + getDlco_clsf_cd());
        System.out.println("dlco_ern = " + getDlco_ern());
        System.out.println("slip_occr_dt = " + getSlip_occr_dt());
        System.out.println("slip_clsf_cd = " + getSlip_clsf_cd());
        System.out.println("slip_seq = " + getSlip_seq());
        System.out.println("tax_stmt_no = " + getTax_stmt_no());
        System.out.println("draft_doc_no2 = " + getDraft_doc_no2());
        System.out.println("incmg_pers_ipadd = " + getIncmg_pers_ipadd());
        System.out.println("incmg_pers = " + getIncmg_pers());
        System.out.println("chg_pers = " + getChg_pers());
        System.out.println("aset_no = " + getAset_no());
        System.out.println("chg_amt = " + getChg_amt());
        System.out.println("chg_vat_amt = " + getChg_vat_amt());
        System.out.println("sale_now_acqr_amt = " + getSale_now_acqr_amt());
        System.out.println("sale_redm_tot_amt = " + getSale_redm_tot_amt());
        System.out.println("sale_un_redm_amt = " + getSale_un_redm_amt());
        System.out.println("sale_pfls_amt = " + getSale_pfls_amt());
        System.out.println("budg_cd = " + getBudg_cd());
        System.out.println("dtls_remk = " + getDtls_remk());
        System.out.println("cash_sub_seq = " + getCash_sub_seq());
        System.out.println("cash_rcpm_amt = " + getCash_rcpm_amt());
        System.out.println("deps_mode = " + getDeps_mode());
        System.out.println("deps_sub_seq = " + getDeps_sub_seq());
        System.out.println("deps_rcpm_amt = " + getDeps_rcpm_amt());
        System.out.println("deps_rmtt_dt = " + getDeps_rmtt_dt());
        System.out.println("deps_rmtt_plac = " + getDeps_rmtt_plac());
        System.out.println("deps_acct_mang_no = " + getDeps_acct_mang_no());
        System.out.println("deps_coms_amt = " + getDeps_coms_amt());
        System.out.println("deps_biz_reg_no = " + getDeps_biz_reg_no());
        System.out.println("deps_bank_id = " + getDeps_bank_id());
        System.out.println("deps_acct_num = " + getDeps_acct_num());
        System.out.println("deps_tran_date = " + getDeps_tran_date());
        System.out.println("deps_tran_date_seq = " + getDeps_tran_date_seq());
        System.out.println("note_mode = " + getNote_mode());
        System.out.println("note_sub_seq = " + getNote_sub_seq());
        System.out.println("note_bank_cd = " + getNote_bank_cd());
        System.out.println("note_note_no = " + getNote_note_no());
        System.out.println("note_note_clsf_cd = " + getNote_note_clsf_cd());
        System.out.println("note_comp_dt = " + getNote_comp_dt());
        System.out.println("note_mtry_dt = " + getNote_mtry_dt());
        System.out.println("note_rcpm_amt = " + getNote_rcpm_amt());
        System.out.println("note_issu_cmpy_clsf = " + getNote_issu_cmpy_clsf());
        System.out.println("note_issu_pers_nm = " + getNote_issu_pers_nm());
        System.out.println("note_rcpm_acct = " + getNote_rcpm_acct());
        System.out.println("note_sale_aprv_no = " + getNote_sale_aprv_no());
        System.out.println("etc_mode = " + getEtc_mode());
        System.out.println("etc_sub_seq = " + getEtc_sub_seq());
        System.out.println("etc_budg_cd = " + getEtc_budg_cd());
        System.out.println("etc_rcpm_amt = " + getEtc_rcpm_amt());
        System.out.println("etc_bal_occr_slip_clsf = " + getEtc_bal_occr_slip_clsf());
        System.out.println("etc_bal_occr_slip_no = " + getEtc_bal_occr_slip_no());
        System.out.println("dept_cd = " + getDept_cd());
        System.out.println("rcpm_amt = " + getRcpm_amt());
        System.out.println("rcpm_shet_no = " + getRcpm_shet_no());
    }
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String cmpy_cd = req.getParameter("cmpy_cd");
if( cmpy_cd == null){
	System.out.println(this.toString+" : cmpy_cd is null" );
}else{
	System.out.println(this.toString+" : cmpy_cd is "+cmpy_cd );
}
String chg_dt = req.getParameter("chg_dt");
if( chg_dt == null){
	System.out.println(this.toString+" : chg_dt is null" );
}else{
	System.out.println(this.toString+" : chg_dt is "+chg_dt );
}
String remk = req.getParameter("remk");
if( remk == null){
	System.out.println(this.toString+" : remk is null" );
}else{
	System.out.println(this.toString+" : remk is "+remk );
}
String dlco_clsf_cd = req.getParameter("dlco_clsf_cd");
if( dlco_clsf_cd == null){
	System.out.println(this.toString+" : dlco_clsf_cd is null" );
}else{
	System.out.println(this.toString+" : dlco_clsf_cd is "+dlco_clsf_cd );
}
String dlco_ern = req.getParameter("dlco_ern");
if( dlco_ern == null){
	System.out.println(this.toString+" : dlco_ern is null" );
}else{
	System.out.println(this.toString+" : dlco_ern is "+dlco_ern );
}
String slip_occr_dt = req.getParameter("slip_occr_dt");
if( slip_occr_dt == null){
	System.out.println(this.toString+" : slip_occr_dt is null" );
}else{
	System.out.println(this.toString+" : slip_occr_dt is "+slip_occr_dt );
}
String slip_clsf_cd = req.getParameter("slip_clsf_cd");
if( slip_clsf_cd == null){
	System.out.println(this.toString+" : slip_clsf_cd is null" );
}else{
	System.out.println(this.toString+" : slip_clsf_cd is "+slip_clsf_cd );
}
String slip_seq = req.getParameter("slip_seq");
if( slip_seq == null){
	System.out.println(this.toString+" : slip_seq is null" );
}else{
	System.out.println(this.toString+" : slip_seq is "+slip_seq );
}
String tax_stmt_no = req.getParameter("tax_stmt_no");
if( tax_stmt_no == null){
	System.out.println(this.toString+" : tax_stmt_no is null" );
}else{
	System.out.println(this.toString+" : tax_stmt_no is "+tax_stmt_no );
}
String draft_doc_no2 = req.getParameter("draft_doc_no2");
if( draft_doc_no2 == null){
	System.out.println(this.toString+" : draft_doc_no2 is null" );
}else{
	System.out.println(this.toString+" : draft_doc_no2 is "+draft_doc_no2 );
}
String incmg_pers_ipadd = req.getParameter("incmg_pers_ipadd");
if( incmg_pers_ipadd == null){
	System.out.println(this.toString+" : incmg_pers_ipadd is null" );
}else{
	System.out.println(this.toString+" : incmg_pers_ipadd is "+incmg_pers_ipadd );
}
String incmg_pers = req.getParameter("incmg_pers");
if( incmg_pers == null){
	System.out.println(this.toString+" : incmg_pers is null" );
}else{
	System.out.println(this.toString+" : incmg_pers is "+incmg_pers );
}
String chg_pers = req.getParameter("chg_pers");
if( chg_pers == null){
	System.out.println(this.toString+" : chg_pers is null" );
}else{
	System.out.println(this.toString+" : chg_pers is "+chg_pers );
}
String aset_no = req.getParameter("aset_no");
if( aset_no == null){
	System.out.println(this.toString+" : aset_no is null" );
}else{
	System.out.println(this.toString+" : aset_no is "+aset_no );
}
String chg_amt = req.getParameter("chg_amt");
if( chg_amt == null){
	System.out.println(this.toString+" : chg_amt is null" );
}else{
	System.out.println(this.toString+" : chg_amt is "+chg_amt );
}
String chg_vat_amt = req.getParameter("chg_vat_amt");
if( chg_vat_amt == null){
	System.out.println(this.toString+" : chg_vat_amt is null" );
}else{
	System.out.println(this.toString+" : chg_vat_amt is "+chg_vat_amt );
}
String sale_now_acqr_amt = req.getParameter("sale_now_acqr_amt");
if( sale_now_acqr_amt == null){
	System.out.println(this.toString+" : sale_now_acqr_amt is null" );
}else{
	System.out.println(this.toString+" : sale_now_acqr_amt is "+sale_now_acqr_amt );
}
String sale_redm_tot_amt = req.getParameter("sale_redm_tot_amt");
if( sale_redm_tot_amt == null){
	System.out.println(this.toString+" : sale_redm_tot_amt is null" );
}else{
	System.out.println(this.toString+" : sale_redm_tot_amt is "+sale_redm_tot_amt );
}
String sale_un_redm_amt = req.getParameter("sale_un_redm_amt");
if( sale_un_redm_amt == null){
	System.out.println(this.toString+" : sale_un_redm_amt is null" );
}else{
	System.out.println(this.toString+" : sale_un_redm_amt is "+sale_un_redm_amt );
}
String sale_pfls_amt = req.getParameter("sale_pfls_amt");
if( sale_pfls_amt == null){
	System.out.println(this.toString+" : sale_pfls_amt is null" );
}else{
	System.out.println(this.toString+" : sale_pfls_amt is "+sale_pfls_amt );
}
String budg_cd = req.getParameter("budg_cd");
if( budg_cd == null){
	System.out.println(this.toString+" : budg_cd is null" );
}else{
	System.out.println(this.toString+" : budg_cd is "+budg_cd );
}
String dtls_remk = req.getParameter("dtls_remk");
if( dtls_remk == null){
	System.out.println(this.toString+" : dtls_remk is null" );
}else{
	System.out.println(this.toString+" : dtls_remk is "+dtls_remk );
}
String cash_sub_seq = req.getParameter("cash_sub_seq");
if( cash_sub_seq == null){
	System.out.println(this.toString+" : cash_sub_seq is null" );
}else{
	System.out.println(this.toString+" : cash_sub_seq is "+cash_sub_seq );
}
String cash_rcpm_amt = req.getParameter("cash_rcpm_amt");
if( cash_rcpm_amt == null){
	System.out.println(this.toString+" : cash_rcpm_amt is null" );
}else{
	System.out.println(this.toString+" : cash_rcpm_amt is "+cash_rcpm_amt );
}
String deps_mode = req.getParameter("deps_mode");
if( deps_mode == null){
	System.out.println(this.toString+" : deps_mode is null" );
}else{
	System.out.println(this.toString+" : deps_mode is "+deps_mode );
}
String deps_sub_seq = req.getParameter("deps_sub_seq");
if( deps_sub_seq == null){
	System.out.println(this.toString+" : deps_sub_seq is null" );
}else{
	System.out.println(this.toString+" : deps_sub_seq is "+deps_sub_seq );
}
String deps_rcpm_amt = req.getParameter("deps_rcpm_amt");
if( deps_rcpm_amt == null){
	System.out.println(this.toString+" : deps_rcpm_amt is null" );
}else{
	System.out.println(this.toString+" : deps_rcpm_amt is "+deps_rcpm_amt );
}
String deps_rmtt_dt = req.getParameter("deps_rmtt_dt");
if( deps_rmtt_dt == null){
	System.out.println(this.toString+" : deps_rmtt_dt is null" );
}else{
	System.out.println(this.toString+" : deps_rmtt_dt is "+deps_rmtt_dt );
}
String deps_rmtt_plac = req.getParameter("deps_rmtt_plac");
if( deps_rmtt_plac == null){
	System.out.println(this.toString+" : deps_rmtt_plac is null" );
}else{
	System.out.println(this.toString+" : deps_rmtt_plac is "+deps_rmtt_plac );
}
String deps_acct_mang_no = req.getParameter("deps_acct_mang_no");
if( deps_acct_mang_no == null){
	System.out.println(this.toString+" : deps_acct_mang_no is null" );
}else{
	System.out.println(this.toString+" : deps_acct_mang_no is "+deps_acct_mang_no );
}
String deps_coms_amt = req.getParameter("deps_coms_amt");
if( deps_coms_amt == null){
	System.out.println(this.toString+" : deps_coms_amt is null" );
}else{
	System.out.println(this.toString+" : deps_coms_amt is "+deps_coms_amt );
}
String deps_biz_reg_no = req.getParameter("deps_biz_reg_no");
if( deps_biz_reg_no == null){
	System.out.println(this.toString+" : deps_biz_reg_no is null" );
}else{
	System.out.println(this.toString+" : deps_biz_reg_no is "+deps_biz_reg_no );
}
String deps_bank_id = req.getParameter("deps_bank_id");
if( deps_bank_id == null){
	System.out.println(this.toString+" : deps_bank_id is null" );
}else{
	System.out.println(this.toString+" : deps_bank_id is "+deps_bank_id );
}
String deps_acct_num = req.getParameter("deps_acct_num");
if( deps_acct_num == null){
	System.out.println(this.toString+" : deps_acct_num is null" );
}else{
	System.out.println(this.toString+" : deps_acct_num is "+deps_acct_num );
}
String deps_tran_date = req.getParameter("deps_tran_date");
if( deps_tran_date == null){
	System.out.println(this.toString+" : deps_tran_date is null" );
}else{
	System.out.println(this.toString+" : deps_tran_date is "+deps_tran_date );
}
String deps_tran_date_seq = req.getParameter("deps_tran_date_seq");
if( deps_tran_date_seq == null){
	System.out.println(this.toString+" : deps_tran_date_seq is null" );
}else{
	System.out.println(this.toString+" : deps_tran_date_seq is "+deps_tran_date_seq );
}
String note_mode = req.getParameter("note_mode");
if( note_mode == null){
	System.out.println(this.toString+" : note_mode is null" );
}else{
	System.out.println(this.toString+" : note_mode is "+note_mode );
}
String note_sub_seq = req.getParameter("note_sub_seq");
if( note_sub_seq == null){
	System.out.println(this.toString+" : note_sub_seq is null" );
}else{
	System.out.println(this.toString+" : note_sub_seq is "+note_sub_seq );
}
String note_bank_cd = req.getParameter("note_bank_cd");
if( note_bank_cd == null){
	System.out.println(this.toString+" : note_bank_cd is null" );
}else{
	System.out.println(this.toString+" : note_bank_cd is "+note_bank_cd );
}
String note_note_no = req.getParameter("note_note_no");
if( note_note_no == null){
	System.out.println(this.toString+" : note_note_no is null" );
}else{
	System.out.println(this.toString+" : note_note_no is "+note_note_no );
}
String note_note_clsf_cd = req.getParameter("note_note_clsf_cd");
if( note_note_clsf_cd == null){
	System.out.println(this.toString+" : note_note_clsf_cd is null" );
}else{
	System.out.println(this.toString+" : note_note_clsf_cd is "+note_note_clsf_cd );
}
String note_comp_dt = req.getParameter("note_comp_dt");
if( note_comp_dt == null){
	System.out.println(this.toString+" : note_comp_dt is null" );
}else{
	System.out.println(this.toString+" : note_comp_dt is "+note_comp_dt );
}
String note_mtry_dt = req.getParameter("note_mtry_dt");
if( note_mtry_dt == null){
	System.out.println(this.toString+" : note_mtry_dt is null" );
}else{
	System.out.println(this.toString+" : note_mtry_dt is "+note_mtry_dt );
}
String note_rcpm_amt = req.getParameter("note_rcpm_amt");
if( note_rcpm_amt == null){
	System.out.println(this.toString+" : note_rcpm_amt is null" );
}else{
	System.out.println(this.toString+" : note_rcpm_amt is "+note_rcpm_amt );
}
String note_issu_cmpy_clsf = req.getParameter("note_issu_cmpy_clsf");
if( note_issu_cmpy_clsf == null){
	System.out.println(this.toString+" : note_issu_cmpy_clsf is null" );
}else{
	System.out.println(this.toString+" : note_issu_cmpy_clsf is "+note_issu_cmpy_clsf );
}
String note_issu_pers_nm = req.getParameter("note_issu_pers_nm");
if( note_issu_pers_nm == null){
	System.out.println(this.toString+" : note_issu_pers_nm is null" );
}else{
	System.out.println(this.toString+" : note_issu_pers_nm is "+note_issu_pers_nm );
}
String note_rcpm_acct = req.getParameter("note_rcpm_acct");
if( note_rcpm_acct == null){
	System.out.println(this.toString+" : note_rcpm_acct is null" );
}else{
	System.out.println(this.toString+" : note_rcpm_acct is "+note_rcpm_acct );
}
String note_sale_aprv_no = req.getParameter("note_sale_aprv_no");
if( note_sale_aprv_no == null){
	System.out.println(this.toString+" : note_sale_aprv_no is null" );
}else{
	System.out.println(this.toString+" : note_sale_aprv_no is "+note_sale_aprv_no );
}
String etc_mode = req.getParameter("etc_mode");
if( etc_mode == null){
	System.out.println(this.toString+" : etc_mode is null" );
}else{
	System.out.println(this.toString+" : etc_mode is "+etc_mode );
}
String etc_sub_seq = req.getParameter("etc_sub_seq");
if( etc_sub_seq == null){
	System.out.println(this.toString+" : etc_sub_seq is null" );
}else{
	System.out.println(this.toString+" : etc_sub_seq is "+etc_sub_seq );
}
String etc_budg_cd = req.getParameter("etc_budg_cd");
if( etc_budg_cd == null){
	System.out.println(this.toString+" : etc_budg_cd is null" );
}else{
	System.out.println(this.toString+" : etc_budg_cd is "+etc_budg_cd );
}
String etc_rcpm_amt = req.getParameter("etc_rcpm_amt");
if( etc_rcpm_amt == null){
	System.out.println(this.toString+" : etc_rcpm_amt is null" );
}else{
	System.out.println(this.toString+" : etc_rcpm_amt is "+etc_rcpm_amt );
}
String etc_bal_occr_slip_clsf = req.getParameter("etc_bal_occr_slip_clsf");
if( etc_bal_occr_slip_clsf == null){
	System.out.println(this.toString+" : etc_bal_occr_slip_clsf is null" );
}else{
	System.out.println(this.toString+" : etc_bal_occr_slip_clsf is "+etc_bal_occr_slip_clsf );
}
String etc_bal_occr_slip_no = req.getParameter("etc_bal_occr_slip_no");
if( etc_bal_occr_slip_no == null){
	System.out.println(this.toString+" : etc_bal_occr_slip_no is null" );
}else{
	System.out.println(this.toString+" : etc_bal_occr_slip_no is "+etc_bal_occr_slip_no );
}
String dept_cd = req.getParameter("dept_cd");
if( dept_cd == null){
	System.out.println(this.toString+" : dept_cd is null" );
}else{
	System.out.println(this.toString+" : dept_cd is "+dept_cd );
}
String rcpm_amt = req.getParameter("rcpm_amt");
if( rcpm_amt == null){
	System.out.println(this.toString+" : rcpm_amt is null" );
}else{
	System.out.println(this.toString+" : rcpm_amt is "+rcpm_amt );
}
String rcpm_shet_no = req.getParameter("rcpm_shet_no");
if( rcpm_shet_no == null){
	System.out.println(this.toString+" : rcpm_shet_no is null" );
}else{
	System.out.println(this.toString+" : rcpm_shet_no is "+rcpm_shet_no );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String chg_dt = Util.checkString(req.getParameter("chg_dt"));
String remk = Util.checkString(req.getParameter("remk"));
String dlco_clsf_cd = Util.checkString(req.getParameter("dlco_clsf_cd"));
String dlco_ern = Util.checkString(req.getParameter("dlco_ern"));
String slip_occr_dt = Util.checkString(req.getParameter("slip_occr_dt"));
String slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
String slip_seq = Util.checkString(req.getParameter("slip_seq"));
String tax_stmt_no = Util.checkString(req.getParameter("tax_stmt_no"));
String draft_doc_no2 = Util.checkString(req.getParameter("draft_doc_no2"));
String incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String chg_pers = Util.checkString(req.getParameter("chg_pers"));
String aset_no = Util.checkString(req.getParameter("aset_no"));
String chg_amt = Util.checkString(req.getParameter("chg_amt"));
String chg_vat_amt = Util.checkString(req.getParameter("chg_vat_amt"));
String sale_now_acqr_amt = Util.checkString(req.getParameter("sale_now_acqr_amt"));
String sale_redm_tot_amt = Util.checkString(req.getParameter("sale_redm_tot_amt"));
String sale_un_redm_amt = Util.checkString(req.getParameter("sale_un_redm_amt"));
String sale_pfls_amt = Util.checkString(req.getParameter("sale_pfls_amt"));
String budg_cd = Util.checkString(req.getParameter("budg_cd"));
String dtls_remk = Util.checkString(req.getParameter("dtls_remk"));
String cash_sub_seq = Util.checkString(req.getParameter("cash_sub_seq"));
String cash_rcpm_amt = Util.checkString(req.getParameter("cash_rcpm_amt"));
String deps_mode = Util.checkString(req.getParameter("deps_mode"));
String deps_sub_seq = Util.checkString(req.getParameter("deps_sub_seq"));
String deps_rcpm_amt = Util.checkString(req.getParameter("deps_rcpm_amt"));
String deps_rmtt_dt = Util.checkString(req.getParameter("deps_rmtt_dt"));
String deps_rmtt_plac = Util.checkString(req.getParameter("deps_rmtt_plac"));
String deps_acct_mang_no = Util.checkString(req.getParameter("deps_acct_mang_no"));
String deps_coms_amt = Util.checkString(req.getParameter("deps_coms_amt"));
String deps_biz_reg_no = Util.checkString(req.getParameter("deps_biz_reg_no"));
String deps_bank_id = Util.checkString(req.getParameter("deps_bank_id"));
String deps_acct_num = Util.checkString(req.getParameter("deps_acct_num"));
String deps_tran_date = Util.checkString(req.getParameter("deps_tran_date"));
String deps_tran_date_seq = Util.checkString(req.getParameter("deps_tran_date_seq"));
String note_mode = Util.checkString(req.getParameter("note_mode"));
String note_sub_seq = Util.checkString(req.getParameter("note_sub_seq"));
String note_bank_cd = Util.checkString(req.getParameter("note_bank_cd"));
String note_note_no = Util.checkString(req.getParameter("note_note_no"));
String note_note_clsf_cd = Util.checkString(req.getParameter("note_note_clsf_cd"));
String note_comp_dt = Util.checkString(req.getParameter("note_comp_dt"));
String note_mtry_dt = Util.checkString(req.getParameter("note_mtry_dt"));
String note_rcpm_amt = Util.checkString(req.getParameter("note_rcpm_amt"));
String note_issu_cmpy_clsf = Util.checkString(req.getParameter("note_issu_cmpy_clsf"));
String note_issu_pers_nm = Util.checkString(req.getParameter("note_issu_pers_nm"));
String note_rcpm_acct = Util.checkString(req.getParameter("note_rcpm_acct"));
String note_sale_aprv_no = Util.checkString(req.getParameter("note_sale_aprv_no"));
String etc_mode = Util.checkString(req.getParameter("etc_mode"));
String etc_sub_seq = Util.checkString(req.getParameter("etc_sub_seq"));
String etc_budg_cd = Util.checkString(req.getParameter("etc_budg_cd"));
String etc_rcpm_amt = Util.checkString(req.getParameter("etc_rcpm_amt"));
String etc_bal_occr_slip_clsf = Util.checkString(req.getParameter("etc_bal_occr_slip_clsf"));
String etc_bal_occr_slip_no = Util.checkString(req.getParameter("etc_bal_occr_slip_no"));
String dept_cd = Util.checkString(req.getParameter("dept_cd"));
String rcpm_amt = Util.checkString(req.getParameter("rcpm_amt"));
String rcpm_shet_no = Util.checkString(req.getParameter("rcpm_shet_no"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String chg_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("chg_dt")));
String remk = Util.Uni2Ksc(Util.checkString(req.getParameter("remk")));
String dlco_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_clsf_cd")));
String dlco_ern = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_ern")));
String slip_occr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_occr_dt")));
String slip_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_clsf_cd")));
String slip_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_seq")));
String tax_stmt_no = Util.Uni2Ksc(Util.checkString(req.getParameter("tax_stmt_no")));
String draft_doc_no2 = Util.Uni2Ksc(Util.checkString(req.getParameter("draft_doc_no2")));
String incmg_pers_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipadd")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String chg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("chg_pers")));
String aset_no = Util.Uni2Ksc(Util.checkString(req.getParameter("aset_no")));
String chg_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("chg_amt")));
String chg_vat_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("chg_vat_amt")));
String sale_now_acqr_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("sale_now_acqr_amt")));
String sale_redm_tot_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("sale_redm_tot_amt")));
String sale_un_redm_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("sale_un_redm_amt")));
String sale_pfls_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("sale_pfls_amt")));
String budg_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("budg_cd")));
String dtls_remk = Util.Uni2Ksc(Util.checkString(req.getParameter("dtls_remk")));
String cash_sub_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("cash_sub_seq")));
String cash_rcpm_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("cash_rcpm_amt")));
String deps_mode = Util.Uni2Ksc(Util.checkString(req.getParameter("deps_mode")));
String deps_sub_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("deps_sub_seq")));
String deps_rcpm_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("deps_rcpm_amt")));
String deps_rmtt_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("deps_rmtt_dt")));
String deps_rmtt_plac = Util.Uni2Ksc(Util.checkString(req.getParameter("deps_rmtt_plac")));
String deps_acct_mang_no = Util.Uni2Ksc(Util.checkString(req.getParameter("deps_acct_mang_no")));
String deps_coms_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("deps_coms_amt")));
String deps_biz_reg_no = Util.Uni2Ksc(Util.checkString(req.getParameter("deps_biz_reg_no")));
String deps_bank_id = Util.Uni2Ksc(Util.checkString(req.getParameter("deps_bank_id")));
String deps_acct_num = Util.Uni2Ksc(Util.checkString(req.getParameter("deps_acct_num")));
String deps_tran_date = Util.Uni2Ksc(Util.checkString(req.getParameter("deps_tran_date")));
String deps_tran_date_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("deps_tran_date_seq")));
String note_mode = Util.Uni2Ksc(Util.checkString(req.getParameter("note_mode")));
String note_sub_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("note_sub_seq")));
String note_bank_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("note_bank_cd")));
String note_note_no = Util.Uni2Ksc(Util.checkString(req.getParameter("note_note_no")));
String note_note_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("note_note_clsf_cd")));
String note_comp_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("note_comp_dt")));
String note_mtry_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("note_mtry_dt")));
String note_rcpm_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("note_rcpm_amt")));
String note_issu_cmpy_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("note_issu_cmpy_clsf")));
String note_issu_pers_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("note_issu_pers_nm")));
String note_rcpm_acct = Util.Uni2Ksc(Util.checkString(req.getParameter("note_rcpm_acct")));
String note_sale_aprv_no = Util.Uni2Ksc(Util.checkString(req.getParameter("note_sale_aprv_no")));
String etc_mode = Util.Uni2Ksc(Util.checkString(req.getParameter("etc_mode")));
String etc_sub_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("etc_sub_seq")));
String etc_budg_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("etc_budg_cd")));
String etc_rcpm_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("etc_rcpm_amt")));
String etc_bal_occr_slip_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("etc_bal_occr_slip_clsf")));
String etc_bal_occr_slip_no = Util.Uni2Ksc(Util.checkString(req.getParameter("etc_bal_occr_slip_no")));
String dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dept_cd")));
String rcpm_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("rcpm_amt")));
String rcpm_shet_no = Util.Uni2Ksc(Util.checkString(req.getParameter("rcpm_shet_no")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setChg_dt(chg_dt);
dm.setRemk(remk);
dm.setDlco_clsf_cd(dlco_clsf_cd);
dm.setDlco_ern(dlco_ern);
dm.setSlip_occr_dt(slip_occr_dt);
dm.setSlip_clsf_cd(slip_clsf_cd);
dm.setSlip_seq(slip_seq);
dm.setTax_stmt_no(tax_stmt_no);
dm.setDraft_doc_no2(draft_doc_no2);
dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
dm.setIncmg_pers(incmg_pers);
dm.setChg_pers(chg_pers);
dm.setAset_no(aset_no);
dm.setChg_amt(chg_amt);
dm.setChg_vat_amt(chg_vat_amt);
dm.setSale_now_acqr_amt(sale_now_acqr_amt);
dm.setSale_redm_tot_amt(sale_redm_tot_amt);
dm.setSale_un_redm_amt(sale_un_redm_amt);
dm.setSale_pfls_amt(sale_pfls_amt);
dm.setBudg_cd(budg_cd);
dm.setDtls_remk(dtls_remk);
dm.setCash_sub_seq(cash_sub_seq);
dm.setCash_rcpm_amt(cash_rcpm_amt);
dm.setDeps_mode(deps_mode);
dm.setDeps_sub_seq(deps_sub_seq);
dm.setDeps_rcpm_amt(deps_rcpm_amt);
dm.setDeps_rmtt_dt(deps_rmtt_dt);
dm.setDeps_rmtt_plac(deps_rmtt_plac);
dm.setDeps_acct_mang_no(deps_acct_mang_no);
dm.setDeps_coms_amt(deps_coms_amt);
dm.setDeps_biz_reg_no(deps_biz_reg_no);
dm.setDeps_bank_id(deps_bank_id);
dm.setDeps_acct_num(deps_acct_num);
dm.setDeps_tran_date(deps_tran_date);
dm.setDeps_tran_date_seq(deps_tran_date_seq);
dm.setNote_mode(note_mode);
dm.setNote_sub_seq(note_sub_seq);
dm.setNote_bank_cd(note_bank_cd);
dm.setNote_note_no(note_note_no);
dm.setNote_note_clsf_cd(note_note_clsf_cd);
dm.setNote_comp_dt(note_comp_dt);
dm.setNote_mtry_dt(note_mtry_dt);
dm.setNote_rcpm_amt(note_rcpm_amt);
dm.setNote_issu_cmpy_clsf(note_issu_cmpy_clsf);
dm.setNote_issu_pers_nm(note_issu_pers_nm);
dm.setNote_rcpm_acct(note_rcpm_acct);
dm.setNote_sale_aprv_no(note_sale_aprv_no);
dm.setEtc_mode(etc_mode);
dm.setEtc_sub_seq(etc_sub_seq);
dm.setEtc_budg_cd(etc_budg_cd);
dm.setEtc_rcpm_amt(etc_rcpm_amt);
dm.setEtc_bal_occr_slip_clsf(etc_bal_occr_slip_clsf);
dm.setEtc_bal_occr_slip_no(etc_bal_occr_slip_no);
dm.setDept_cd(dept_cd);
dm.setRcpm_amt(rcpm_amt);
dm.setRcpm_shet_no(rcpm_shet_no);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed May 27 09:32:19 KST 2009 */
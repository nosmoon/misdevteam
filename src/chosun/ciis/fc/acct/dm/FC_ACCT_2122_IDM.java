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


package chosun.ciis.fc.acct.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.fc.acct.ds.*;
import chosun.ciis.fc.acct.rec.*;

/**
 * 
 */


public class FC_ACCT_2122_IDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String mode;
	public String reg_clsf;
	public String prof_type_cd;
	public String slip_clsf_cd;
	public String slip_occr_dt;
	public String slip_seq;
	public String make_dt;
	public String erplace_cd;
	public String dlco_clsf_cd;
	public String dlco_cd;
	public String deal_clsf;
	public String ern;
	public String dlco_nm;
	public String boks_dlco_nm;
	public String presi_nm;
	public String addr;
	public String bizcond;
	public String item;
	public String evnt_cd;
	public String suply_amt;
	public String vat_amt;
	public String tax_stmt_aprv_yn;
	public String rcpt_nosh;
	public String sg_budg_cd;
	public String ask_emp_no;
	public String ask_dept_cd;
	public String rcpm_plan_dd;
	public String incmg_pers;
	public String incmg_pers_ipadd;
	public String sgtitem;
	public String medi_cd;
	public String dtls_medi_cd;
	public String vexc_cmpy_cd;
	public String draft_doc_no;
	public String draft_impt_amt;
	public String draft_expn_amt;
	public String in_igyb;
	public String slip_rcpm_dt;
	public String rcpm_shet_kind;
	public String rcpm_shet_no;
	public String g0_rcpm_amt;
	public String g1_rcpm_slip_seq;
	public String g1_rcpm_dt;
	public String g1_rcpm_amt;
	public String g1_rcpm_pers_nm;
	public String g1_deps_psbk;
	public String g1_coms;
	public String g1_frex_clsf;
	public String g1_exrate;
	public String g1_frex_amt;
	public String biz_reg_no;
	public String bank_id;
	public String acct_num;
	public String tran_date_seq;
	public String g2_rcpm_sub_seq;
	public String g2_note_no;
	public String g2_rcpm_amt;
	public String g2_note_clsf_cd;
	public String g2_bank_cd;
	public String g2_bank_cd_nm;
	public String g2_issu_pers_nm;
	public String g2_issu_cmpy_clsf_cd;
	public String g2_comp_dt;
	public String g2_mtry_dt;
	public String g2_rcpm_acct;
	public String g2_sale_aprv_no;
	public String g3_rcpm_sub_seq;
	public String g3_budg_cd;
	public String g3_budg_cd_nm;
	public String g3_rcpm_amt;
	public String g3_whco_slip_clsf;
	public String g3_whco_slip_no;
	public String make_upd_dt;
	public String upd_tms;
	public String last_upd_dd;
	public String rcpm_slip_no;
	public String exrate_diff_yn;
	public String etc_in_yn;
	public String stmt_rmtt_yn;
	public String unit;
	public String qunt;
	public String code_cd;
	public String email;
	public String semuro_no;
	public String elec_tax_comp_cd;
	public String chnl_clsf_cd;

	public FC_ACCT_2122_IDM(){}
	public FC_ACCT_2122_IDM(String cmpy_cd, String mode, String reg_clsf, String prof_type_cd, String slip_clsf_cd, String slip_occr_dt, String slip_seq, String make_dt, String erplace_cd, String dlco_clsf_cd, String dlco_cd, String deal_clsf, String ern, String dlco_nm, String boks_dlco_nm, String presi_nm, String addr, String bizcond, String item, String evnt_cd, String suply_amt, String vat_amt, String tax_stmt_aprv_yn, String rcpt_nosh, String sg_budg_cd, String ask_emp_no, String ask_dept_cd, String rcpm_plan_dd, String incmg_pers, String incmg_pers_ipadd, String sgtitem, String medi_cd, String dtls_medi_cd, String vexc_cmpy_cd, String draft_doc_no, String draft_impt_amt, String draft_expn_amt, String in_igyb, String slip_rcpm_dt, String rcpm_shet_kind, String rcpm_shet_no, String g0_rcpm_amt, String g1_rcpm_slip_seq, String g1_rcpm_dt, String g1_rcpm_amt, String g1_rcpm_pers_nm, String g1_deps_psbk, String g1_coms, String g1_frex_clsf, String g1_exrate, String g1_frex_amt, String biz_reg_no, String bank_id, String acct_num, String tran_date_seq, String g2_rcpm_sub_seq, String g2_note_no, String g2_rcpm_amt, String g2_note_clsf_cd, String g2_bank_cd, String g2_bank_cd_nm, String g2_issu_pers_nm, String g2_issu_cmpy_clsf_cd, String g2_comp_dt, String g2_mtry_dt, String g2_rcpm_acct, String g2_sale_aprv_no, String g3_rcpm_sub_seq, String g3_budg_cd, String g3_budg_cd_nm, String g3_rcpm_amt, String g3_whco_slip_clsf, String g3_whco_slip_no, String make_upd_dt, String upd_tms, String last_upd_dd, String rcpm_slip_no, String exrate_diff_yn, String etc_in_yn, String stmt_rmtt_yn, String unit, String qunt, String code_cd, String email, String semuro_no, String elec_tax_comp_cd, String chnl_clsf_cd){
		this.cmpy_cd = cmpy_cd;
		this.mode = mode;
		this.reg_clsf = reg_clsf;
		this.prof_type_cd = prof_type_cd;
		this.slip_clsf_cd = slip_clsf_cd;
		this.slip_occr_dt = slip_occr_dt;
		this.slip_seq = slip_seq;
		this.make_dt = make_dt;
		this.erplace_cd = erplace_cd;
		this.dlco_clsf_cd = dlco_clsf_cd;
		this.dlco_cd = dlco_cd;
		this.deal_clsf = deal_clsf;
		this.ern = ern;
		this.dlco_nm = dlco_nm;
		this.boks_dlco_nm = boks_dlco_nm;
		this.presi_nm = presi_nm;
		this.addr = addr;
		this.bizcond = bizcond;
		this.item = item;
		this.evnt_cd = evnt_cd;
		this.suply_amt = suply_amt;
		this.vat_amt = vat_amt;
		this.tax_stmt_aprv_yn = tax_stmt_aprv_yn;
		this.rcpt_nosh = rcpt_nosh;
		this.sg_budg_cd = sg_budg_cd;
		this.ask_emp_no = ask_emp_no;
		this.ask_dept_cd = ask_dept_cd;
		this.rcpm_plan_dd = rcpm_plan_dd;
		this.incmg_pers = incmg_pers;
		this.incmg_pers_ipadd = incmg_pers_ipadd;
		this.sgtitem = sgtitem;
		this.medi_cd = medi_cd;
		this.dtls_medi_cd = dtls_medi_cd;
		this.vexc_cmpy_cd = vexc_cmpy_cd;
		this.draft_doc_no = draft_doc_no;
		this.draft_impt_amt = draft_impt_amt;
		this.draft_expn_amt = draft_expn_amt;
		this.in_igyb = in_igyb;
		this.slip_rcpm_dt = slip_rcpm_dt;
		this.rcpm_shet_kind = rcpm_shet_kind;
		this.rcpm_shet_no = rcpm_shet_no;
		this.g0_rcpm_amt = g0_rcpm_amt;
		this.g1_rcpm_slip_seq = g1_rcpm_slip_seq;
		this.g1_rcpm_dt = g1_rcpm_dt;
		this.g1_rcpm_amt = g1_rcpm_amt;
		this.g1_rcpm_pers_nm = g1_rcpm_pers_nm;
		this.g1_deps_psbk = g1_deps_psbk;
		this.g1_coms = g1_coms;
		this.g1_frex_clsf = g1_frex_clsf;
		this.g1_exrate = g1_exrate;
		this.g1_frex_amt = g1_frex_amt;
		this.biz_reg_no = biz_reg_no;
		this.bank_id = bank_id;
		this.acct_num = acct_num;
		this.tran_date_seq = tran_date_seq;
		this.g2_rcpm_sub_seq = g2_rcpm_sub_seq;
		this.g2_note_no = g2_note_no;
		this.g2_rcpm_amt = g2_rcpm_amt;
		this.g2_note_clsf_cd = g2_note_clsf_cd;
		this.g2_bank_cd = g2_bank_cd;
		this.g2_bank_cd_nm = g2_bank_cd_nm;
		this.g2_issu_pers_nm = g2_issu_pers_nm;
		this.g2_issu_cmpy_clsf_cd = g2_issu_cmpy_clsf_cd;
		this.g2_comp_dt = g2_comp_dt;
		this.g2_mtry_dt = g2_mtry_dt;
		this.g2_rcpm_acct = g2_rcpm_acct;
		this.g2_sale_aprv_no = g2_sale_aprv_no;
		this.g3_rcpm_sub_seq = g3_rcpm_sub_seq;
		this.g3_budg_cd = g3_budg_cd;
		this.g3_budg_cd_nm = g3_budg_cd_nm;
		this.g3_rcpm_amt = g3_rcpm_amt;
		this.g3_whco_slip_clsf = g3_whco_slip_clsf;
		this.g3_whco_slip_no = g3_whco_slip_no;
		this.make_upd_dt = make_upd_dt;
		this.upd_tms = upd_tms;
		this.last_upd_dd = last_upd_dd;
		this.rcpm_slip_no = rcpm_slip_no;
		this.exrate_diff_yn = exrate_diff_yn;
		this.etc_in_yn = etc_in_yn;
		this.stmt_rmtt_yn = stmt_rmtt_yn;
		this.unit = unit;
		this.qunt = qunt;
		this.code_cd = code_cd;
		this.email = email;
		this.semuro_no = semuro_no;
		this.elec_tax_comp_cd = elec_tax_comp_cd;
		this.chnl_clsf_cd = chnl_clsf_cd;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setMode(String mode){
		this.mode = mode;
	}

	public void setReg_clsf(String reg_clsf){
		this.reg_clsf = reg_clsf;
	}

	public void setProf_type_cd(String prof_type_cd){
		this.prof_type_cd = prof_type_cd;
	}

	public void setSlip_clsf_cd(String slip_clsf_cd){
		this.slip_clsf_cd = slip_clsf_cd;
	}

	public void setSlip_occr_dt(String slip_occr_dt){
		this.slip_occr_dt = slip_occr_dt;
	}

	public void setSlip_seq(String slip_seq){
		this.slip_seq = slip_seq;
	}

	public void setMake_dt(String make_dt){
		this.make_dt = make_dt;
	}

	public void setErplace_cd(String erplace_cd){
		this.erplace_cd = erplace_cd;
	}

	public void setDlco_clsf_cd(String dlco_clsf_cd){
		this.dlco_clsf_cd = dlco_clsf_cd;
	}

	public void setDlco_cd(String dlco_cd){
		this.dlco_cd = dlco_cd;
	}

	public void setDeal_clsf(String deal_clsf){
		this.deal_clsf = deal_clsf;
	}

	public void setErn(String ern){
		this.ern = ern;
	}

	public void setDlco_nm(String dlco_nm){
		this.dlco_nm = dlco_nm;
	}

	public void setBoks_dlco_nm(String boks_dlco_nm){
		this.boks_dlco_nm = boks_dlco_nm;
	}

	public void setPresi_nm(String presi_nm){
		this.presi_nm = presi_nm;
	}

	public void setAddr(String addr){
		this.addr = addr;
	}

	public void setBizcond(String bizcond){
		this.bizcond = bizcond;
	}

	public void setItem(String item){
		this.item = item;
	}

	public void setEvnt_cd(String evnt_cd){
		this.evnt_cd = evnt_cd;
	}

	public void setSuply_amt(String suply_amt){
		this.suply_amt = suply_amt;
	}

	public void setVat_amt(String vat_amt){
		this.vat_amt = vat_amt;
	}

	public void setTax_stmt_aprv_yn(String tax_stmt_aprv_yn){
		this.tax_stmt_aprv_yn = tax_stmt_aprv_yn;
	}

	public void setRcpt_nosh(String rcpt_nosh){
		this.rcpt_nosh = rcpt_nosh;
	}

	public void setSg_budg_cd(String sg_budg_cd){
		this.sg_budg_cd = sg_budg_cd;
	}

	public void setAsk_emp_no(String ask_emp_no){
		this.ask_emp_no = ask_emp_no;
	}

	public void setAsk_dept_cd(String ask_dept_cd){
		this.ask_dept_cd = ask_dept_cd;
	}

	public void setRcpm_plan_dd(String rcpm_plan_dd){
		this.rcpm_plan_dd = rcpm_plan_dd;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setIncmg_pers_ipadd(String incmg_pers_ipadd){
		this.incmg_pers_ipadd = incmg_pers_ipadd;
	}

	public void setSgtitem(String sgtitem){
		this.sgtitem = sgtitem;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setDtls_medi_cd(String dtls_medi_cd){
		this.dtls_medi_cd = dtls_medi_cd;
	}

	public void setVexc_cmpy_cd(String vexc_cmpy_cd){
		this.vexc_cmpy_cd = vexc_cmpy_cd;
	}

	public void setDraft_doc_no(String draft_doc_no){
		this.draft_doc_no = draft_doc_no;
	}

	public void setDraft_impt_amt(String draft_impt_amt){
		this.draft_impt_amt = draft_impt_amt;
	}

	public void setDraft_expn_amt(String draft_expn_amt){
		this.draft_expn_amt = draft_expn_amt;
	}

	public void setIn_igyb(String in_igyb){
		this.in_igyb = in_igyb;
	}

	public void setSlip_rcpm_dt(String slip_rcpm_dt){
		this.slip_rcpm_dt = slip_rcpm_dt;
	}

	public void setRcpm_shet_kind(String rcpm_shet_kind){
		this.rcpm_shet_kind = rcpm_shet_kind;
	}

	public void setRcpm_shet_no(String rcpm_shet_no){
		this.rcpm_shet_no = rcpm_shet_no;
	}

	public void setG0_rcpm_amt(String g0_rcpm_amt){
		this.g0_rcpm_amt = g0_rcpm_amt;
	}

	public void setG1_rcpm_slip_seq(String g1_rcpm_slip_seq){
		this.g1_rcpm_slip_seq = g1_rcpm_slip_seq;
	}

	public void setG1_rcpm_dt(String g1_rcpm_dt){
		this.g1_rcpm_dt = g1_rcpm_dt;
	}

	public void setG1_rcpm_amt(String g1_rcpm_amt){
		this.g1_rcpm_amt = g1_rcpm_amt;
	}

	public void setG1_rcpm_pers_nm(String g1_rcpm_pers_nm){
		this.g1_rcpm_pers_nm = g1_rcpm_pers_nm;
	}

	public void setG1_deps_psbk(String g1_deps_psbk){
		this.g1_deps_psbk = g1_deps_psbk;
	}

	public void setG1_coms(String g1_coms){
		this.g1_coms = g1_coms;
	}

	public void setG1_frex_clsf(String g1_frex_clsf){
		this.g1_frex_clsf = g1_frex_clsf;
	}

	public void setG1_exrate(String g1_exrate){
		this.g1_exrate = g1_exrate;
	}

	public void setG1_frex_amt(String g1_frex_amt){
		this.g1_frex_amt = g1_frex_amt;
	}

	public void setBiz_reg_no(String biz_reg_no){
		this.biz_reg_no = biz_reg_no;
	}

	public void setBank_id(String bank_id){
		this.bank_id = bank_id;
	}

	public void setAcct_num(String acct_num){
		this.acct_num = acct_num;
	}

	public void setTran_date_seq(String tran_date_seq){
		this.tran_date_seq = tran_date_seq;
	}

	public void setG2_rcpm_sub_seq(String g2_rcpm_sub_seq){
		this.g2_rcpm_sub_seq = g2_rcpm_sub_seq;
	}

	public void setG2_note_no(String g2_note_no){
		this.g2_note_no = g2_note_no;
	}

	public void setG2_rcpm_amt(String g2_rcpm_amt){
		this.g2_rcpm_amt = g2_rcpm_amt;
	}

	public void setG2_note_clsf_cd(String g2_note_clsf_cd){
		this.g2_note_clsf_cd = g2_note_clsf_cd;
	}

	public void setG2_bank_cd(String g2_bank_cd){
		this.g2_bank_cd = g2_bank_cd;
	}

	public void setG2_bank_cd_nm(String g2_bank_cd_nm){
		this.g2_bank_cd_nm = g2_bank_cd_nm;
	}

	public void setG2_issu_pers_nm(String g2_issu_pers_nm){
		this.g2_issu_pers_nm = g2_issu_pers_nm;
	}

	public void setG2_issu_cmpy_clsf_cd(String g2_issu_cmpy_clsf_cd){
		this.g2_issu_cmpy_clsf_cd = g2_issu_cmpy_clsf_cd;
	}

	public void setG2_comp_dt(String g2_comp_dt){
		this.g2_comp_dt = g2_comp_dt;
	}

	public void setG2_mtry_dt(String g2_mtry_dt){
		this.g2_mtry_dt = g2_mtry_dt;
	}

	public void setG2_rcpm_acct(String g2_rcpm_acct){
		this.g2_rcpm_acct = g2_rcpm_acct;
	}

	public void setG2_sale_aprv_no(String g2_sale_aprv_no){
		this.g2_sale_aprv_no = g2_sale_aprv_no;
	}

	public void setG3_rcpm_sub_seq(String g3_rcpm_sub_seq){
		this.g3_rcpm_sub_seq = g3_rcpm_sub_seq;
	}

	public void setG3_budg_cd(String g3_budg_cd){
		this.g3_budg_cd = g3_budg_cd;
	}

	public void setG3_budg_cd_nm(String g3_budg_cd_nm){
		this.g3_budg_cd_nm = g3_budg_cd_nm;
	}

	public void setG3_rcpm_amt(String g3_rcpm_amt){
		this.g3_rcpm_amt = g3_rcpm_amt;
	}

	public void setG3_whco_slip_clsf(String g3_whco_slip_clsf){
		this.g3_whco_slip_clsf = g3_whco_slip_clsf;
	}

	public void setG3_whco_slip_no(String g3_whco_slip_no){
		this.g3_whco_slip_no = g3_whco_slip_no;
	}

	public void setMake_upd_dt(String make_upd_dt){
		this.make_upd_dt = make_upd_dt;
	}

	public void setUpd_tms(String upd_tms){
		this.upd_tms = upd_tms;
	}

	public void setLast_upd_dd(String last_upd_dd){
		this.last_upd_dd = last_upd_dd;
	}

	public void setRcpm_slip_no(String rcpm_slip_no){
		this.rcpm_slip_no = rcpm_slip_no;
	}

	public void setExrate_diff_yn(String exrate_diff_yn){
		this.exrate_diff_yn = exrate_diff_yn;
	}

	public void setEtc_in_yn(String etc_in_yn){
		this.etc_in_yn = etc_in_yn;
	}

	public void setStmt_rmtt_yn(String stmt_rmtt_yn){
		this.stmt_rmtt_yn = stmt_rmtt_yn;
	}

	public void setUnit(String unit){
		this.unit = unit;
	}

	public void setQunt(String qunt){
		this.qunt = qunt;
	}

	public void setCode_cd(String code_cd){
		this.code_cd = code_cd;
	}

	public void setEmail(String email){
		this.email = email;
	}

	public void setSemuro_no(String semuro_no){
		this.semuro_no = semuro_no;
	}

	public void setElec_tax_comp_cd(String elec_tax_comp_cd){
		this.elec_tax_comp_cd = elec_tax_comp_cd;
	}

	public void setChnl_clsf_cd(String chnl_clsf_cd){
		this.chnl_clsf_cd = chnl_clsf_cd;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getMode(){
		return this.mode;
	}

	public String getReg_clsf(){
		return this.reg_clsf;
	}

	public String getProf_type_cd(){
		return this.prof_type_cd;
	}

	public String getSlip_clsf_cd(){
		return this.slip_clsf_cd;
	}

	public String getSlip_occr_dt(){
		return this.slip_occr_dt;
	}

	public String getSlip_seq(){
		return this.slip_seq;
	}

	public String getMake_dt(){
		return this.make_dt;
	}

	public String getErplace_cd(){
		return this.erplace_cd;
	}

	public String getDlco_clsf_cd(){
		return this.dlco_clsf_cd;
	}

	public String getDlco_cd(){
		return this.dlco_cd;
	}

	public String getDeal_clsf(){
		return this.deal_clsf;
	}

	public String getErn(){
		return this.ern;
	}

	public String getDlco_nm(){
		return this.dlco_nm;
	}

	public String getBoks_dlco_nm(){
		return this.boks_dlco_nm;
	}

	public String getPresi_nm(){
		return this.presi_nm;
	}

	public String getAddr(){
		return this.addr;
	}

	public String getBizcond(){
		return this.bizcond;
	}

	public String getItem(){
		return this.item;
	}

	public String getEvnt_cd(){
		return this.evnt_cd;
	}

	public String getSuply_amt(){
		return this.suply_amt;
	}

	public String getVat_amt(){
		return this.vat_amt;
	}

	public String getTax_stmt_aprv_yn(){
		return this.tax_stmt_aprv_yn;
	}

	public String getRcpt_nosh(){
		return this.rcpt_nosh;
	}

	public String getSg_budg_cd(){
		return this.sg_budg_cd;
	}

	public String getAsk_emp_no(){
		return this.ask_emp_no;
	}

	public String getAsk_dept_cd(){
		return this.ask_dept_cd;
	}

	public String getRcpm_plan_dd(){
		return this.rcpm_plan_dd;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getIncmg_pers_ipadd(){
		return this.incmg_pers_ipadd;
	}

	public String getSgtitem(){
		return this.sgtitem;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getDtls_medi_cd(){
		return this.dtls_medi_cd;
	}

	public String getVexc_cmpy_cd(){
		return this.vexc_cmpy_cd;
	}

	public String getDraft_doc_no(){
		return this.draft_doc_no;
	}

	public String getDraft_impt_amt(){
		return this.draft_impt_amt;
	}

	public String getDraft_expn_amt(){
		return this.draft_expn_amt;
	}

	public String getIn_igyb(){
		return this.in_igyb;
	}

	public String getSlip_rcpm_dt(){
		return this.slip_rcpm_dt;
	}

	public String getRcpm_shet_kind(){
		return this.rcpm_shet_kind;
	}

	public String getRcpm_shet_no(){
		return this.rcpm_shet_no;
	}

	public String getG0_rcpm_amt(){
		return this.g0_rcpm_amt;
	}

	public String getG1_rcpm_slip_seq(){
		return this.g1_rcpm_slip_seq;
	}

	public String getG1_rcpm_dt(){
		return this.g1_rcpm_dt;
	}

	public String getG1_rcpm_amt(){
		return this.g1_rcpm_amt;
	}

	public String getG1_rcpm_pers_nm(){
		return this.g1_rcpm_pers_nm;
	}

	public String getG1_deps_psbk(){
		return this.g1_deps_psbk;
	}

	public String getG1_coms(){
		return this.g1_coms;
	}

	public String getG1_frex_clsf(){
		return this.g1_frex_clsf;
	}

	public String getG1_exrate(){
		return this.g1_exrate;
	}

	public String getG1_frex_amt(){
		return this.g1_frex_amt;
	}

	public String getBiz_reg_no(){
		return this.biz_reg_no;
	}

	public String getBank_id(){
		return this.bank_id;
	}

	public String getAcct_num(){
		return this.acct_num;
	}

	public String getTran_date_seq(){
		return this.tran_date_seq;
	}

	public String getG2_rcpm_sub_seq(){
		return this.g2_rcpm_sub_seq;
	}

	public String getG2_note_no(){
		return this.g2_note_no;
	}

	public String getG2_rcpm_amt(){
		return this.g2_rcpm_amt;
	}

	public String getG2_note_clsf_cd(){
		return this.g2_note_clsf_cd;
	}

	public String getG2_bank_cd(){
		return this.g2_bank_cd;
	}

	public String getG2_bank_cd_nm(){
		return this.g2_bank_cd_nm;
	}

	public String getG2_issu_pers_nm(){
		return this.g2_issu_pers_nm;
	}

	public String getG2_issu_cmpy_clsf_cd(){
		return this.g2_issu_cmpy_clsf_cd;
	}

	public String getG2_comp_dt(){
		return this.g2_comp_dt;
	}

	public String getG2_mtry_dt(){
		return this.g2_mtry_dt;
	}

	public String getG2_rcpm_acct(){
		return this.g2_rcpm_acct;
	}

	public String getG2_sale_aprv_no(){
		return this.g2_sale_aprv_no;
	}

	public String getG3_rcpm_sub_seq(){
		return this.g3_rcpm_sub_seq;
	}

	public String getG3_budg_cd(){
		return this.g3_budg_cd;
	}

	public String getG3_budg_cd_nm(){
		return this.g3_budg_cd_nm;
	}

	public String getG3_rcpm_amt(){
		return this.g3_rcpm_amt;
	}

	public String getG3_whco_slip_clsf(){
		return this.g3_whco_slip_clsf;
	}

	public String getG3_whco_slip_no(){
		return this.g3_whco_slip_no;
	}

	public String getMake_upd_dt(){
		return this.make_upd_dt;
	}

	public String getUpd_tms(){
		return this.upd_tms;
	}

	public String getLast_upd_dd(){
		return this.last_upd_dd;
	}

	public String getRcpm_slip_no(){
		return this.rcpm_slip_no;
	}

	public String getExrate_diff_yn(){
		return this.exrate_diff_yn;
	}

	public String getEtc_in_yn(){
		return this.etc_in_yn;
	}

	public String getStmt_rmtt_yn(){
		return this.stmt_rmtt_yn;
	}

	public String getUnit(){
		return this.unit;
	}

	public String getQunt(){
		return this.qunt;
	}

	public String getCode_cd(){
		return this.code_cd;
	}

	public String getEmail(){
		return this.email;
	}

	public String getSemuro_no(){
		return this.semuro_no;
	}

	public String getElec_tax_comp_cd(){
		return this.elec_tax_comp_cd;
	}

	public String getChnl_clsf_cd(){
		return this.chnl_clsf_cd;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_FC_ACCT_2122_I(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		FC_ACCT_2122_IDM dm = (FC_ACCT_2122_IDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.registerOutParameter(3, Types.VARCHAR);
		cstmt.registerOutParameter(4, Types.VARCHAR);
		cstmt.registerOutParameter(5, Types.VARCHAR);
		cstmt.setString(6, dm.cmpy_cd);
		cstmt.setString(7, dm.mode);
		cstmt.setString(8, dm.reg_clsf);
		cstmt.setString(9, dm.prof_type_cd);
		cstmt.setString(10, dm.slip_clsf_cd);
		cstmt.setString(11, dm.slip_occr_dt);
		cstmt.setString(12, dm.slip_seq);
		cstmt.setString(13, dm.make_dt);
		cstmt.setString(14, dm.erplace_cd);
		cstmt.setString(15, dm.dlco_clsf_cd);
		cstmt.setString(16, dm.dlco_cd);
		cstmt.setString(17, dm.deal_clsf);
		cstmt.setString(18, dm.ern);
		cstmt.setString(19, dm.dlco_nm);
		cstmt.setString(20, dm.boks_dlco_nm);
		cstmt.setString(21, dm.presi_nm);
		cstmt.setString(22, dm.addr);
		cstmt.setString(23, dm.bizcond);
		cstmt.setString(24, dm.item);
		cstmt.setString(25, dm.evnt_cd);
		cstmt.setString(26, dm.suply_amt);
		cstmt.setString(27, dm.vat_amt);
		cstmt.setString(28, dm.tax_stmt_aprv_yn);
		cstmt.setString(29, dm.rcpt_nosh);
		cstmt.setString(30, dm.sg_budg_cd);
		cstmt.setString(31, dm.ask_emp_no);
		cstmt.setString(32, dm.ask_dept_cd);
		cstmt.setString(33, dm.rcpm_plan_dd);
		cstmt.setString(34, dm.incmg_pers);
		cstmt.setString(35, dm.incmg_pers_ipadd);
		cstmt.setString(36, dm.sgtitem);
		cstmt.setString(37, dm.medi_cd);
		cstmt.setString(38, dm.dtls_medi_cd);
		cstmt.setString(39, dm.vexc_cmpy_cd);
		cstmt.setString(40, dm.draft_doc_no);
		cstmt.setString(41, dm.draft_impt_amt);
		cstmt.setString(42, dm.draft_expn_amt);
		cstmt.setString(43, dm.in_igyb);
		cstmt.setString(44, dm.slip_rcpm_dt);
		cstmt.setString(45, dm.rcpm_shet_kind);
		cstmt.setString(46, dm.rcpm_shet_no);
		cstmt.setString(47, dm.g0_rcpm_amt);
		cstmt.setString(48, dm.g1_rcpm_slip_seq);
		cstmt.setString(49, dm.g1_rcpm_dt);
		cstmt.setString(50, dm.g1_rcpm_amt);
		cstmt.setString(51, dm.g1_rcpm_pers_nm);
		cstmt.setString(52, dm.g1_deps_psbk);
		cstmt.setString(53, dm.g1_coms);
		cstmt.setString(54, dm.g1_frex_clsf);
		cstmt.setString(55, dm.g1_exrate);
		cstmt.setString(56, dm.g1_frex_amt);
		cstmt.setString(57, dm.biz_reg_no);
		cstmt.setString(58, dm.bank_id);
		cstmt.setString(59, dm.acct_num);
		cstmt.setString(60, dm.tran_date_seq);
		cstmt.setString(61, dm.g2_rcpm_sub_seq);
		cstmt.setString(62, dm.g2_note_no);
		cstmt.setString(63, dm.g2_rcpm_amt);
		cstmt.setString(64, dm.g2_note_clsf_cd);
		cstmt.setString(65, dm.g2_bank_cd);
		cstmt.setString(66, dm.g2_bank_cd_nm);
		cstmt.setString(67, dm.g2_issu_pers_nm);
		cstmt.setString(68, dm.g2_issu_cmpy_clsf_cd);
		cstmt.setString(69, dm.g2_comp_dt);
		cstmt.setString(70, dm.g2_mtry_dt);
		cstmt.setString(71, dm.g2_rcpm_acct);
		cstmt.setString(72, dm.g2_sale_aprv_no);
		cstmt.setString(73, dm.g3_rcpm_sub_seq);
		cstmt.setString(74, dm.g3_budg_cd);
		cstmt.setString(75, dm.g3_budg_cd_nm);
		cstmt.setString(76, dm.g3_rcpm_amt);
		cstmt.setString(77, dm.g3_whco_slip_clsf);
		cstmt.setString(78, dm.g3_whco_slip_no);
		cstmt.setString(79, dm.make_upd_dt);
		cstmt.setString(80, dm.upd_tms);
		cstmt.setString(81, dm.last_upd_dd);
		cstmt.setString(82, dm.rcpm_slip_no);
		cstmt.setString(83, dm.exrate_diff_yn);
		cstmt.setString(84, dm.etc_in_yn);
		cstmt.setString(85, dm.stmt_rmtt_yn);
		cstmt.setString(86, dm.unit);
		cstmt.setString(87, dm.qunt);
		cstmt.setString(88, dm.code_cd);
		cstmt.setString(89, dm.email);
		cstmt.setString(90, dm.semuro_no);
		cstmt.setString(91, dm.elec_tax_comp_cd);
		cstmt.setString(92, dm.chnl_clsf_cd);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.fc.acct.ds.FC_ACCT_2122_IDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("mode = [" + getMode() + "]");
		System.out.println("reg_clsf = [" + getReg_clsf() + "]");
		System.out.println("prof_type_cd = [" + getProf_type_cd() + "]");
		System.out.println("slip_clsf_cd = [" + getSlip_clsf_cd() + "]");
		System.out.println("slip_occr_dt = [" + getSlip_occr_dt() + "]");
		System.out.println("slip_seq = [" + getSlip_seq() + "]");
		System.out.println("make_dt = [" + getMake_dt() + "]");
		System.out.println("erplace_cd = [" + getErplace_cd() + "]");
		System.out.println("dlco_clsf_cd = [" + getDlco_clsf_cd() + "]");
		System.out.println("dlco_cd = [" + getDlco_cd() + "]");
		System.out.println("deal_clsf = [" + getDeal_clsf() + "]");
		System.out.println("ern = [" + getErn() + "]");
		System.out.println("dlco_nm = [" + getDlco_nm() + "]");
		System.out.println("boks_dlco_nm = [" + getBoks_dlco_nm() + "]");
		System.out.println("presi_nm = [" + getPresi_nm() + "]");
		System.out.println("addr = [" + getAddr() + "]");
		System.out.println("bizcond = [" + getBizcond() + "]");
		System.out.println("item = [" + getItem() + "]");
		System.out.println("evnt_cd = [" + getEvnt_cd() + "]");
		System.out.println("suply_amt = [" + getSuply_amt() + "]");
		System.out.println("vat_amt = [" + getVat_amt() + "]");
		System.out.println("tax_stmt_aprv_yn = [" + getTax_stmt_aprv_yn() + "]");
		System.out.println("rcpt_nosh = [" + getRcpt_nosh() + "]");
		System.out.println("sg_budg_cd = [" + getSg_budg_cd() + "]");
		System.out.println("ask_emp_no = [" + getAsk_emp_no() + "]");
		System.out.println("ask_dept_cd = [" + getAsk_dept_cd() + "]");
		System.out.println("rcpm_plan_dd = [" + getRcpm_plan_dd() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("incmg_pers_ipadd = [" + getIncmg_pers_ipadd() + "]");
		System.out.println("sgtitem = [" + getSgtitem() + "]");
		System.out.println("medi_cd = [" + getMedi_cd() + "]");
		System.out.println("dtls_medi_cd = [" + getDtls_medi_cd() + "]");
		System.out.println("vexc_cmpy_cd = [" + getVexc_cmpy_cd() + "]");
		System.out.println("draft_doc_no = [" + getDraft_doc_no() + "]");
		System.out.println("draft_impt_amt = [" + getDraft_impt_amt() + "]");
		System.out.println("draft_expn_amt = [" + getDraft_expn_amt() + "]");
		System.out.println("in_igyb = [" + getIn_igyb() + "]");
		System.out.println("slip_rcpm_dt = [" + getSlip_rcpm_dt() + "]");
		System.out.println("rcpm_shet_kind = [" + getRcpm_shet_kind() + "]");
		System.out.println("rcpm_shet_no = [" + getRcpm_shet_no() + "]");
		System.out.println("g0_rcpm_amt = [" + getG0_rcpm_amt() + "]");
		System.out.println("g1_rcpm_slip_seq = [" + getG1_rcpm_slip_seq() + "]");
		System.out.println("g1_rcpm_dt = [" + getG1_rcpm_dt() + "]");
		System.out.println("g1_rcpm_amt = [" + getG1_rcpm_amt() + "]");
		System.out.println("g1_rcpm_pers_nm = [" + getG1_rcpm_pers_nm() + "]");
		System.out.println("g1_deps_psbk = [" + getG1_deps_psbk() + "]");
		System.out.println("g1_coms = [" + getG1_coms() + "]");
		System.out.println("g1_frex_clsf = [" + getG1_frex_clsf() + "]");
		System.out.println("g1_exrate = [" + getG1_exrate() + "]");
		System.out.println("g1_frex_amt = [" + getG1_frex_amt() + "]");
		System.out.println("biz_reg_no = [" + getBiz_reg_no() + "]");
		System.out.println("bank_id = [" + getBank_id() + "]");
		System.out.println("acct_num = [" + getAcct_num() + "]");
		System.out.println("tran_date_seq = [" + getTran_date_seq() + "]");
		System.out.println("g2_rcpm_sub_seq = [" + getG2_rcpm_sub_seq() + "]");
		System.out.println("g2_note_no = [" + getG2_note_no() + "]");
		System.out.println("g2_rcpm_amt = [" + getG2_rcpm_amt() + "]");
		System.out.println("g2_note_clsf_cd = [" + getG2_note_clsf_cd() + "]");
		System.out.println("g2_bank_cd = [" + getG2_bank_cd() + "]");
		System.out.println("g2_bank_cd_nm = [" + getG2_bank_cd_nm() + "]");
		System.out.println("g2_issu_pers_nm = [" + getG2_issu_pers_nm() + "]");
		System.out.println("g2_issu_cmpy_clsf_cd = [" + getG2_issu_cmpy_clsf_cd() + "]");
		System.out.println("g2_comp_dt = [" + getG2_comp_dt() + "]");
		System.out.println("g2_mtry_dt = [" + getG2_mtry_dt() + "]");
		System.out.println("g2_rcpm_acct = [" + getG2_rcpm_acct() + "]");
		System.out.println("g2_sale_aprv_no = [" + getG2_sale_aprv_no() + "]");
		System.out.println("g3_rcpm_sub_seq = [" + getG3_rcpm_sub_seq() + "]");
		System.out.println("g3_budg_cd = [" + getG3_budg_cd() + "]");
		System.out.println("g3_budg_cd_nm = [" + getG3_budg_cd_nm() + "]");
		System.out.println("g3_rcpm_amt = [" + getG3_rcpm_amt() + "]");
		System.out.println("g3_whco_slip_clsf = [" + getG3_whco_slip_clsf() + "]");
		System.out.println("g3_whco_slip_no = [" + getG3_whco_slip_no() + "]");
		System.out.println("make_upd_dt = [" + getMake_upd_dt() + "]");
		System.out.println("upd_tms = [" + getUpd_tms() + "]");
		System.out.println("last_upd_dd = [" + getLast_upd_dd() + "]");
		System.out.println("rcpm_slip_no = [" + getRcpm_slip_no() + "]");
		System.out.println("exrate_diff_yn = [" + getExrate_diff_yn() + "]");
		System.out.println("etc_in_yn = [" + getEtc_in_yn() + "]");
		System.out.println("stmt_rmtt_yn = [" + getStmt_rmtt_yn() + "]");
		System.out.println("unit = [" + getUnit() + "]");
		System.out.println("qunt = [" + getQunt() + "]");
		System.out.println("code_cd = [" + getCode_cd() + "]");
		System.out.println("email = [" + getEmail() + "]");
		System.out.println("semuro_no = [" + getSemuro_no() + "]");
		System.out.println("elec_tax_comp_cd = [" + getElec_tax_comp_cd() + "]");
		System.out.println("chnl_clsf_cd = [" + getChnl_clsf_cd() + "]");
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
String mode = req.getParameter("mode");
if( mode == null){
	System.out.println(this.toString+" : mode is null" );
}else{
	System.out.println(this.toString+" : mode is "+mode );
}
String reg_clsf = req.getParameter("reg_clsf");
if( reg_clsf == null){
	System.out.println(this.toString+" : reg_clsf is null" );
}else{
	System.out.println(this.toString+" : reg_clsf is "+reg_clsf );
}
String prof_type_cd = req.getParameter("prof_type_cd");
if( prof_type_cd == null){
	System.out.println(this.toString+" : prof_type_cd is null" );
}else{
	System.out.println(this.toString+" : prof_type_cd is "+prof_type_cd );
}
String slip_clsf_cd = req.getParameter("slip_clsf_cd");
if( slip_clsf_cd == null){
	System.out.println(this.toString+" : slip_clsf_cd is null" );
}else{
	System.out.println(this.toString+" : slip_clsf_cd is "+slip_clsf_cd );
}
String slip_occr_dt = req.getParameter("slip_occr_dt");
if( slip_occr_dt == null){
	System.out.println(this.toString+" : slip_occr_dt is null" );
}else{
	System.out.println(this.toString+" : slip_occr_dt is "+slip_occr_dt );
}
String slip_seq = req.getParameter("slip_seq");
if( slip_seq == null){
	System.out.println(this.toString+" : slip_seq is null" );
}else{
	System.out.println(this.toString+" : slip_seq is "+slip_seq );
}
String make_dt = req.getParameter("make_dt");
if( make_dt == null){
	System.out.println(this.toString+" : make_dt is null" );
}else{
	System.out.println(this.toString+" : make_dt is "+make_dt );
}
String erplace_cd = req.getParameter("erplace_cd");
if( erplace_cd == null){
	System.out.println(this.toString+" : erplace_cd is null" );
}else{
	System.out.println(this.toString+" : erplace_cd is "+erplace_cd );
}
String dlco_clsf_cd = req.getParameter("dlco_clsf_cd");
if( dlco_clsf_cd == null){
	System.out.println(this.toString+" : dlco_clsf_cd is null" );
}else{
	System.out.println(this.toString+" : dlco_clsf_cd is "+dlco_clsf_cd );
}
String dlco_cd = req.getParameter("dlco_cd");
if( dlco_cd == null){
	System.out.println(this.toString+" : dlco_cd is null" );
}else{
	System.out.println(this.toString+" : dlco_cd is "+dlco_cd );
}
String deal_clsf = req.getParameter("deal_clsf");
if( deal_clsf == null){
	System.out.println(this.toString+" : deal_clsf is null" );
}else{
	System.out.println(this.toString+" : deal_clsf is "+deal_clsf );
}
String ern = req.getParameter("ern");
if( ern == null){
	System.out.println(this.toString+" : ern is null" );
}else{
	System.out.println(this.toString+" : ern is "+ern );
}
String dlco_nm = req.getParameter("dlco_nm");
if( dlco_nm == null){
	System.out.println(this.toString+" : dlco_nm is null" );
}else{
	System.out.println(this.toString+" : dlco_nm is "+dlco_nm );
}
String boks_dlco_nm = req.getParameter("boks_dlco_nm");
if( boks_dlco_nm == null){
	System.out.println(this.toString+" : boks_dlco_nm is null" );
}else{
	System.out.println(this.toString+" : boks_dlco_nm is "+boks_dlco_nm );
}
String presi_nm = req.getParameter("presi_nm");
if( presi_nm == null){
	System.out.println(this.toString+" : presi_nm is null" );
}else{
	System.out.println(this.toString+" : presi_nm is "+presi_nm );
}
String addr = req.getParameter("addr");
if( addr == null){
	System.out.println(this.toString+" : addr is null" );
}else{
	System.out.println(this.toString+" : addr is "+addr );
}
String bizcond = req.getParameter("bizcond");
if( bizcond == null){
	System.out.println(this.toString+" : bizcond is null" );
}else{
	System.out.println(this.toString+" : bizcond is "+bizcond );
}
String item = req.getParameter("item");
if( item == null){
	System.out.println(this.toString+" : item is null" );
}else{
	System.out.println(this.toString+" : item is "+item );
}
String evnt_cd = req.getParameter("evnt_cd");
if( evnt_cd == null){
	System.out.println(this.toString+" : evnt_cd is null" );
}else{
	System.out.println(this.toString+" : evnt_cd is "+evnt_cd );
}
String suply_amt = req.getParameter("suply_amt");
if( suply_amt == null){
	System.out.println(this.toString+" : suply_amt is null" );
}else{
	System.out.println(this.toString+" : suply_amt is "+suply_amt );
}
String vat_amt = req.getParameter("vat_amt");
if( vat_amt == null){
	System.out.println(this.toString+" : vat_amt is null" );
}else{
	System.out.println(this.toString+" : vat_amt is "+vat_amt );
}
String tax_stmt_aprv_yn = req.getParameter("tax_stmt_aprv_yn");
if( tax_stmt_aprv_yn == null){
	System.out.println(this.toString+" : tax_stmt_aprv_yn is null" );
}else{
	System.out.println(this.toString+" : tax_stmt_aprv_yn is "+tax_stmt_aprv_yn );
}
String rcpt_nosh = req.getParameter("rcpt_nosh");
if( rcpt_nosh == null){
	System.out.println(this.toString+" : rcpt_nosh is null" );
}else{
	System.out.println(this.toString+" : rcpt_nosh is "+rcpt_nosh );
}
String sg_budg_cd = req.getParameter("sg_budg_cd");
if( sg_budg_cd == null){
	System.out.println(this.toString+" : sg_budg_cd is null" );
}else{
	System.out.println(this.toString+" : sg_budg_cd is "+sg_budg_cd );
}
String ask_emp_no = req.getParameter("ask_emp_no");
if( ask_emp_no == null){
	System.out.println(this.toString+" : ask_emp_no is null" );
}else{
	System.out.println(this.toString+" : ask_emp_no is "+ask_emp_no );
}
String ask_dept_cd = req.getParameter("ask_dept_cd");
if( ask_dept_cd == null){
	System.out.println(this.toString+" : ask_dept_cd is null" );
}else{
	System.out.println(this.toString+" : ask_dept_cd is "+ask_dept_cd );
}
String rcpm_plan_dd = req.getParameter("rcpm_plan_dd");
if( rcpm_plan_dd == null){
	System.out.println(this.toString+" : rcpm_plan_dd is null" );
}else{
	System.out.println(this.toString+" : rcpm_plan_dd is "+rcpm_plan_dd );
}
String incmg_pers = req.getParameter("incmg_pers");
if( incmg_pers == null){
	System.out.println(this.toString+" : incmg_pers is null" );
}else{
	System.out.println(this.toString+" : incmg_pers is "+incmg_pers );
}
String incmg_pers_ipadd = req.getParameter("incmg_pers_ipadd");
if( incmg_pers_ipadd == null){
	System.out.println(this.toString+" : incmg_pers_ipadd is null" );
}else{
	System.out.println(this.toString+" : incmg_pers_ipadd is "+incmg_pers_ipadd );
}
String sgtitem = req.getParameter("sgtitem");
if( sgtitem == null){
	System.out.println(this.toString+" : sgtitem is null" );
}else{
	System.out.println(this.toString+" : sgtitem is "+sgtitem );
}
String medi_cd = req.getParameter("medi_cd");
if( medi_cd == null){
	System.out.println(this.toString+" : medi_cd is null" );
}else{
	System.out.println(this.toString+" : medi_cd is "+medi_cd );
}
String dtls_medi_cd = req.getParameter("dtls_medi_cd");
if( dtls_medi_cd == null){
	System.out.println(this.toString+" : dtls_medi_cd is null" );
}else{
	System.out.println(this.toString+" : dtls_medi_cd is "+dtls_medi_cd );
}
String vexc_cmpy_cd = req.getParameter("vexc_cmpy_cd");
if( vexc_cmpy_cd == null){
	System.out.println(this.toString+" : vexc_cmpy_cd is null" );
}else{
	System.out.println(this.toString+" : vexc_cmpy_cd is "+vexc_cmpy_cd );
}
String draft_doc_no = req.getParameter("draft_doc_no");
if( draft_doc_no == null){
	System.out.println(this.toString+" : draft_doc_no is null" );
}else{
	System.out.println(this.toString+" : draft_doc_no is "+draft_doc_no );
}
String draft_impt_amt = req.getParameter("draft_impt_amt");
if( draft_impt_amt == null){
	System.out.println(this.toString+" : draft_impt_amt is null" );
}else{
	System.out.println(this.toString+" : draft_impt_amt is "+draft_impt_amt );
}
String draft_expn_amt = req.getParameter("draft_expn_amt");
if( draft_expn_amt == null){
	System.out.println(this.toString+" : draft_expn_amt is null" );
}else{
	System.out.println(this.toString+" : draft_expn_amt is "+draft_expn_amt );
}
String in_igyb = req.getParameter("in_igyb");
if( in_igyb == null){
	System.out.println(this.toString+" : in_igyb is null" );
}else{
	System.out.println(this.toString+" : in_igyb is "+in_igyb );
}
String slip_rcpm_dt = req.getParameter("slip_rcpm_dt");
if( slip_rcpm_dt == null){
	System.out.println(this.toString+" : slip_rcpm_dt is null" );
}else{
	System.out.println(this.toString+" : slip_rcpm_dt is "+slip_rcpm_dt );
}
String rcpm_shet_kind = req.getParameter("rcpm_shet_kind");
if( rcpm_shet_kind == null){
	System.out.println(this.toString+" : rcpm_shet_kind is null" );
}else{
	System.out.println(this.toString+" : rcpm_shet_kind is "+rcpm_shet_kind );
}
String rcpm_shet_no = req.getParameter("rcpm_shet_no");
if( rcpm_shet_no == null){
	System.out.println(this.toString+" : rcpm_shet_no is null" );
}else{
	System.out.println(this.toString+" : rcpm_shet_no is "+rcpm_shet_no );
}
String g0_rcpm_amt = req.getParameter("g0_rcpm_amt");
if( g0_rcpm_amt == null){
	System.out.println(this.toString+" : g0_rcpm_amt is null" );
}else{
	System.out.println(this.toString+" : g0_rcpm_amt is "+g0_rcpm_amt );
}
String g1_rcpm_slip_seq = req.getParameter("g1_rcpm_slip_seq");
if( g1_rcpm_slip_seq == null){
	System.out.println(this.toString+" : g1_rcpm_slip_seq is null" );
}else{
	System.out.println(this.toString+" : g1_rcpm_slip_seq is "+g1_rcpm_slip_seq );
}
String g1_rcpm_dt = req.getParameter("g1_rcpm_dt");
if( g1_rcpm_dt == null){
	System.out.println(this.toString+" : g1_rcpm_dt is null" );
}else{
	System.out.println(this.toString+" : g1_rcpm_dt is "+g1_rcpm_dt );
}
String g1_rcpm_amt = req.getParameter("g1_rcpm_amt");
if( g1_rcpm_amt == null){
	System.out.println(this.toString+" : g1_rcpm_amt is null" );
}else{
	System.out.println(this.toString+" : g1_rcpm_amt is "+g1_rcpm_amt );
}
String g1_rcpm_pers_nm = req.getParameter("g1_rcpm_pers_nm");
if( g1_rcpm_pers_nm == null){
	System.out.println(this.toString+" : g1_rcpm_pers_nm is null" );
}else{
	System.out.println(this.toString+" : g1_rcpm_pers_nm is "+g1_rcpm_pers_nm );
}
String g1_deps_psbk = req.getParameter("g1_deps_psbk");
if( g1_deps_psbk == null){
	System.out.println(this.toString+" : g1_deps_psbk is null" );
}else{
	System.out.println(this.toString+" : g1_deps_psbk is "+g1_deps_psbk );
}
String g1_coms = req.getParameter("g1_coms");
if( g1_coms == null){
	System.out.println(this.toString+" : g1_coms is null" );
}else{
	System.out.println(this.toString+" : g1_coms is "+g1_coms );
}
String g1_frex_clsf = req.getParameter("g1_frex_clsf");
if( g1_frex_clsf == null){
	System.out.println(this.toString+" : g1_frex_clsf is null" );
}else{
	System.out.println(this.toString+" : g1_frex_clsf is "+g1_frex_clsf );
}
String g1_exrate = req.getParameter("g1_exrate");
if( g1_exrate == null){
	System.out.println(this.toString+" : g1_exrate is null" );
}else{
	System.out.println(this.toString+" : g1_exrate is "+g1_exrate );
}
String g1_frex_amt = req.getParameter("g1_frex_amt");
if( g1_frex_amt == null){
	System.out.println(this.toString+" : g1_frex_amt is null" );
}else{
	System.out.println(this.toString+" : g1_frex_amt is "+g1_frex_amt );
}
String biz_reg_no = req.getParameter("biz_reg_no");
if( biz_reg_no == null){
	System.out.println(this.toString+" : biz_reg_no is null" );
}else{
	System.out.println(this.toString+" : biz_reg_no is "+biz_reg_no );
}
String bank_id = req.getParameter("bank_id");
if( bank_id == null){
	System.out.println(this.toString+" : bank_id is null" );
}else{
	System.out.println(this.toString+" : bank_id is "+bank_id );
}
String acct_num = req.getParameter("acct_num");
if( acct_num == null){
	System.out.println(this.toString+" : acct_num is null" );
}else{
	System.out.println(this.toString+" : acct_num is "+acct_num );
}
String tran_date_seq = req.getParameter("tran_date_seq");
if( tran_date_seq == null){
	System.out.println(this.toString+" : tran_date_seq is null" );
}else{
	System.out.println(this.toString+" : tran_date_seq is "+tran_date_seq );
}
String g2_rcpm_sub_seq = req.getParameter("g2_rcpm_sub_seq");
if( g2_rcpm_sub_seq == null){
	System.out.println(this.toString+" : g2_rcpm_sub_seq is null" );
}else{
	System.out.println(this.toString+" : g2_rcpm_sub_seq is "+g2_rcpm_sub_seq );
}
String g2_note_no = req.getParameter("g2_note_no");
if( g2_note_no == null){
	System.out.println(this.toString+" : g2_note_no is null" );
}else{
	System.out.println(this.toString+" : g2_note_no is "+g2_note_no );
}
String g2_rcpm_amt = req.getParameter("g2_rcpm_amt");
if( g2_rcpm_amt == null){
	System.out.println(this.toString+" : g2_rcpm_amt is null" );
}else{
	System.out.println(this.toString+" : g2_rcpm_amt is "+g2_rcpm_amt );
}
String g2_note_clsf_cd = req.getParameter("g2_note_clsf_cd");
if( g2_note_clsf_cd == null){
	System.out.println(this.toString+" : g2_note_clsf_cd is null" );
}else{
	System.out.println(this.toString+" : g2_note_clsf_cd is "+g2_note_clsf_cd );
}
String g2_bank_cd = req.getParameter("g2_bank_cd");
if( g2_bank_cd == null){
	System.out.println(this.toString+" : g2_bank_cd is null" );
}else{
	System.out.println(this.toString+" : g2_bank_cd is "+g2_bank_cd );
}
String g2_bank_cd_nm = req.getParameter("g2_bank_cd_nm");
if( g2_bank_cd_nm == null){
	System.out.println(this.toString+" : g2_bank_cd_nm is null" );
}else{
	System.out.println(this.toString+" : g2_bank_cd_nm is "+g2_bank_cd_nm );
}
String g2_issu_pers_nm = req.getParameter("g2_issu_pers_nm");
if( g2_issu_pers_nm == null){
	System.out.println(this.toString+" : g2_issu_pers_nm is null" );
}else{
	System.out.println(this.toString+" : g2_issu_pers_nm is "+g2_issu_pers_nm );
}
String g2_issu_cmpy_clsf_cd = req.getParameter("g2_issu_cmpy_clsf_cd");
if( g2_issu_cmpy_clsf_cd == null){
	System.out.println(this.toString+" : g2_issu_cmpy_clsf_cd is null" );
}else{
	System.out.println(this.toString+" : g2_issu_cmpy_clsf_cd is "+g2_issu_cmpy_clsf_cd );
}
String g2_comp_dt = req.getParameter("g2_comp_dt");
if( g2_comp_dt == null){
	System.out.println(this.toString+" : g2_comp_dt is null" );
}else{
	System.out.println(this.toString+" : g2_comp_dt is "+g2_comp_dt );
}
String g2_mtry_dt = req.getParameter("g2_mtry_dt");
if( g2_mtry_dt == null){
	System.out.println(this.toString+" : g2_mtry_dt is null" );
}else{
	System.out.println(this.toString+" : g2_mtry_dt is "+g2_mtry_dt );
}
String g2_rcpm_acct = req.getParameter("g2_rcpm_acct");
if( g2_rcpm_acct == null){
	System.out.println(this.toString+" : g2_rcpm_acct is null" );
}else{
	System.out.println(this.toString+" : g2_rcpm_acct is "+g2_rcpm_acct );
}
String g2_sale_aprv_no = req.getParameter("g2_sale_aprv_no");
if( g2_sale_aprv_no == null){
	System.out.println(this.toString+" : g2_sale_aprv_no is null" );
}else{
	System.out.println(this.toString+" : g2_sale_aprv_no is "+g2_sale_aprv_no );
}
String g3_rcpm_sub_seq = req.getParameter("g3_rcpm_sub_seq");
if( g3_rcpm_sub_seq == null){
	System.out.println(this.toString+" : g3_rcpm_sub_seq is null" );
}else{
	System.out.println(this.toString+" : g3_rcpm_sub_seq is "+g3_rcpm_sub_seq );
}
String g3_budg_cd = req.getParameter("g3_budg_cd");
if( g3_budg_cd == null){
	System.out.println(this.toString+" : g3_budg_cd is null" );
}else{
	System.out.println(this.toString+" : g3_budg_cd is "+g3_budg_cd );
}
String g3_budg_cd_nm = req.getParameter("g3_budg_cd_nm");
if( g3_budg_cd_nm == null){
	System.out.println(this.toString+" : g3_budg_cd_nm is null" );
}else{
	System.out.println(this.toString+" : g3_budg_cd_nm is "+g3_budg_cd_nm );
}
String g3_rcpm_amt = req.getParameter("g3_rcpm_amt");
if( g3_rcpm_amt == null){
	System.out.println(this.toString+" : g3_rcpm_amt is null" );
}else{
	System.out.println(this.toString+" : g3_rcpm_amt is "+g3_rcpm_amt );
}
String g3_whco_slip_clsf = req.getParameter("g3_whco_slip_clsf");
if( g3_whco_slip_clsf == null){
	System.out.println(this.toString+" : g3_whco_slip_clsf is null" );
}else{
	System.out.println(this.toString+" : g3_whco_slip_clsf is "+g3_whco_slip_clsf );
}
String g3_whco_slip_no = req.getParameter("g3_whco_slip_no");
if( g3_whco_slip_no == null){
	System.out.println(this.toString+" : g3_whco_slip_no is null" );
}else{
	System.out.println(this.toString+" : g3_whco_slip_no is "+g3_whco_slip_no );
}
String make_upd_dt = req.getParameter("make_upd_dt");
if( make_upd_dt == null){
	System.out.println(this.toString+" : make_upd_dt is null" );
}else{
	System.out.println(this.toString+" : make_upd_dt is "+make_upd_dt );
}
String upd_tms = req.getParameter("upd_tms");
if( upd_tms == null){
	System.out.println(this.toString+" : upd_tms is null" );
}else{
	System.out.println(this.toString+" : upd_tms is "+upd_tms );
}
String last_upd_dd = req.getParameter("last_upd_dd");
if( last_upd_dd == null){
	System.out.println(this.toString+" : last_upd_dd is null" );
}else{
	System.out.println(this.toString+" : last_upd_dd is "+last_upd_dd );
}
String rcpm_slip_no = req.getParameter("rcpm_slip_no");
if( rcpm_slip_no == null){
	System.out.println(this.toString+" : rcpm_slip_no is null" );
}else{
	System.out.println(this.toString+" : rcpm_slip_no is "+rcpm_slip_no );
}
String exrate_diff_yn = req.getParameter("exrate_diff_yn");
if( exrate_diff_yn == null){
	System.out.println(this.toString+" : exrate_diff_yn is null" );
}else{
	System.out.println(this.toString+" : exrate_diff_yn is "+exrate_diff_yn );
}
String etc_in_yn = req.getParameter("etc_in_yn");
if( etc_in_yn == null){
	System.out.println(this.toString+" : etc_in_yn is null" );
}else{
	System.out.println(this.toString+" : etc_in_yn is "+etc_in_yn );
}
String stmt_rmtt_yn = req.getParameter("stmt_rmtt_yn");
if( stmt_rmtt_yn == null){
	System.out.println(this.toString+" : stmt_rmtt_yn is null" );
}else{
	System.out.println(this.toString+" : stmt_rmtt_yn is "+stmt_rmtt_yn );
}
String unit = req.getParameter("unit");
if( unit == null){
	System.out.println(this.toString+" : unit is null" );
}else{
	System.out.println(this.toString+" : unit is "+unit );
}
String qunt = req.getParameter("qunt");
if( qunt == null){
	System.out.println(this.toString+" : qunt is null" );
}else{
	System.out.println(this.toString+" : qunt is "+qunt );
}
String code_cd = req.getParameter("code_cd");
if( code_cd == null){
	System.out.println(this.toString+" : code_cd is null" );
}else{
	System.out.println(this.toString+" : code_cd is "+code_cd );
}
String email = req.getParameter("email");
if( email == null){
	System.out.println(this.toString+" : email is null" );
}else{
	System.out.println(this.toString+" : email is "+email );
}
String semuro_no = req.getParameter("semuro_no");
if( semuro_no == null){
	System.out.println(this.toString+" : semuro_no is null" );
}else{
	System.out.println(this.toString+" : semuro_no is "+semuro_no );
}
String elec_tax_comp_cd = req.getParameter("elec_tax_comp_cd");
if( elec_tax_comp_cd == null){
	System.out.println(this.toString+" : elec_tax_comp_cd is null" );
}else{
	System.out.println(this.toString+" : elec_tax_comp_cd is "+elec_tax_comp_cd );
}
String chnl_clsf_cd = req.getParameter("chnl_clsf_cd");
if( chnl_clsf_cd == null){
	System.out.println(this.toString+" : chnl_clsf_cd is null" );
}else{
	System.out.println(this.toString+" : chnl_clsf_cd is "+chnl_clsf_cd );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String mode = Util.checkString(req.getParameter("mode"));
String reg_clsf = Util.checkString(req.getParameter("reg_clsf"));
String prof_type_cd = Util.checkString(req.getParameter("prof_type_cd"));
String slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
String slip_occr_dt = Util.checkString(req.getParameter("slip_occr_dt"));
String slip_seq = Util.checkString(req.getParameter("slip_seq"));
String make_dt = Util.checkString(req.getParameter("make_dt"));
String erplace_cd = Util.checkString(req.getParameter("erplace_cd"));
String dlco_clsf_cd = Util.checkString(req.getParameter("dlco_clsf_cd"));
String dlco_cd = Util.checkString(req.getParameter("dlco_cd"));
String deal_clsf = Util.checkString(req.getParameter("deal_clsf"));
String ern = Util.checkString(req.getParameter("ern"));
String dlco_nm = Util.checkString(req.getParameter("dlco_nm"));
String boks_dlco_nm = Util.checkString(req.getParameter("boks_dlco_nm"));
String presi_nm = Util.checkString(req.getParameter("presi_nm"));
String addr = Util.checkString(req.getParameter("addr"));
String bizcond = Util.checkString(req.getParameter("bizcond"));
String item = Util.checkString(req.getParameter("item"));
String evnt_cd = Util.checkString(req.getParameter("evnt_cd"));
String suply_amt = Util.checkString(req.getParameter("suply_amt"));
String vat_amt = Util.checkString(req.getParameter("vat_amt"));
String tax_stmt_aprv_yn = Util.checkString(req.getParameter("tax_stmt_aprv_yn"));
String rcpt_nosh = Util.checkString(req.getParameter("rcpt_nosh"));
String sg_budg_cd = Util.checkString(req.getParameter("sg_budg_cd"));
String ask_emp_no = Util.checkString(req.getParameter("ask_emp_no"));
String ask_dept_cd = Util.checkString(req.getParameter("ask_dept_cd"));
String rcpm_plan_dd = Util.checkString(req.getParameter("rcpm_plan_dd"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
String sgtitem = Util.checkString(req.getParameter("sgtitem"));
String medi_cd = Util.checkString(req.getParameter("medi_cd"));
String dtls_medi_cd = Util.checkString(req.getParameter("dtls_medi_cd"));
String vexc_cmpy_cd = Util.checkString(req.getParameter("vexc_cmpy_cd"));
String draft_doc_no = Util.checkString(req.getParameter("draft_doc_no"));
String draft_impt_amt = Util.checkString(req.getParameter("draft_impt_amt"));
String draft_expn_amt = Util.checkString(req.getParameter("draft_expn_amt"));
String in_igyb = Util.checkString(req.getParameter("in_igyb"));
String slip_rcpm_dt = Util.checkString(req.getParameter("slip_rcpm_dt"));
String rcpm_shet_kind = Util.checkString(req.getParameter("rcpm_shet_kind"));
String rcpm_shet_no = Util.checkString(req.getParameter("rcpm_shet_no"));
String g0_rcpm_amt = Util.checkString(req.getParameter("g0_rcpm_amt"));
String g1_rcpm_slip_seq = Util.checkString(req.getParameter("g1_rcpm_slip_seq"));
String g1_rcpm_dt = Util.checkString(req.getParameter("g1_rcpm_dt"));
String g1_rcpm_amt = Util.checkString(req.getParameter("g1_rcpm_amt"));
String g1_rcpm_pers_nm = Util.checkString(req.getParameter("g1_rcpm_pers_nm"));
String g1_deps_psbk = Util.checkString(req.getParameter("g1_deps_psbk"));
String g1_coms = Util.checkString(req.getParameter("g1_coms"));
String g1_frex_clsf = Util.checkString(req.getParameter("g1_frex_clsf"));
String g1_exrate = Util.checkString(req.getParameter("g1_exrate"));
String g1_frex_amt = Util.checkString(req.getParameter("g1_frex_amt"));
String biz_reg_no = Util.checkString(req.getParameter("biz_reg_no"));
String bank_id = Util.checkString(req.getParameter("bank_id"));
String acct_num = Util.checkString(req.getParameter("acct_num"));
String tran_date_seq = Util.checkString(req.getParameter("tran_date_seq"));
String g2_rcpm_sub_seq = Util.checkString(req.getParameter("g2_rcpm_sub_seq"));
String g2_note_no = Util.checkString(req.getParameter("g2_note_no"));
String g2_rcpm_amt = Util.checkString(req.getParameter("g2_rcpm_amt"));
String g2_note_clsf_cd = Util.checkString(req.getParameter("g2_note_clsf_cd"));
String g2_bank_cd = Util.checkString(req.getParameter("g2_bank_cd"));
String g2_bank_cd_nm = Util.checkString(req.getParameter("g2_bank_cd_nm"));
String g2_issu_pers_nm = Util.checkString(req.getParameter("g2_issu_pers_nm"));
String g2_issu_cmpy_clsf_cd = Util.checkString(req.getParameter("g2_issu_cmpy_clsf_cd"));
String g2_comp_dt = Util.checkString(req.getParameter("g2_comp_dt"));
String g2_mtry_dt = Util.checkString(req.getParameter("g2_mtry_dt"));
String g2_rcpm_acct = Util.checkString(req.getParameter("g2_rcpm_acct"));
String g2_sale_aprv_no = Util.checkString(req.getParameter("g2_sale_aprv_no"));
String g3_rcpm_sub_seq = Util.checkString(req.getParameter("g3_rcpm_sub_seq"));
String g3_budg_cd = Util.checkString(req.getParameter("g3_budg_cd"));
String g3_budg_cd_nm = Util.checkString(req.getParameter("g3_budg_cd_nm"));
String g3_rcpm_amt = Util.checkString(req.getParameter("g3_rcpm_amt"));
String g3_whco_slip_clsf = Util.checkString(req.getParameter("g3_whco_slip_clsf"));
String g3_whco_slip_no = Util.checkString(req.getParameter("g3_whco_slip_no"));
String make_upd_dt = Util.checkString(req.getParameter("make_upd_dt"));
String upd_tms = Util.checkString(req.getParameter("upd_tms"));
String last_upd_dd = Util.checkString(req.getParameter("last_upd_dd"));
String rcpm_slip_no = Util.checkString(req.getParameter("rcpm_slip_no"));
String exrate_diff_yn = Util.checkString(req.getParameter("exrate_diff_yn"));
String etc_in_yn = Util.checkString(req.getParameter("etc_in_yn"));
String stmt_rmtt_yn = Util.checkString(req.getParameter("stmt_rmtt_yn"));
String unit = Util.checkString(req.getParameter("unit"));
String qunt = Util.checkString(req.getParameter("qunt"));
String code_cd = Util.checkString(req.getParameter("code_cd"));
String email = Util.checkString(req.getParameter("email"));
String semuro_no = Util.checkString(req.getParameter("semuro_no"));
String elec_tax_comp_cd = Util.checkString(req.getParameter("elec_tax_comp_cd"));
String chnl_clsf_cd = Util.checkString(req.getParameter("chnl_clsf_cd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
String reg_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("reg_clsf")));
String prof_type_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("prof_type_cd")));
String slip_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_clsf_cd")));
String slip_occr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_occr_dt")));
String slip_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_seq")));
String make_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("make_dt")));
String erplace_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("erplace_cd")));
String dlco_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_clsf_cd")));
String dlco_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_cd")));
String deal_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("deal_clsf")));
String ern = Util.Uni2Ksc(Util.checkString(req.getParameter("ern")));
String dlco_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_nm")));
String boks_dlco_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("boks_dlco_nm")));
String presi_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("presi_nm")));
String addr = Util.Uni2Ksc(Util.checkString(req.getParameter("addr")));
String bizcond = Util.Uni2Ksc(Util.checkString(req.getParameter("bizcond")));
String item = Util.Uni2Ksc(Util.checkString(req.getParameter("item")));
String evnt_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("evnt_cd")));
String suply_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("suply_amt")));
String vat_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("vat_amt")));
String tax_stmt_aprv_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("tax_stmt_aprv_yn")));
String rcpt_nosh = Util.Uni2Ksc(Util.checkString(req.getParameter("rcpt_nosh")));
String sg_budg_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("sg_budg_cd")));
String ask_emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("ask_emp_no")));
String ask_dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("ask_dept_cd")));
String rcpm_plan_dd = Util.Uni2Ksc(Util.checkString(req.getParameter("rcpm_plan_dd")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String incmg_pers_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipadd")));
String sgtitem = Util.Uni2Ksc(Util.checkString(req.getParameter("sgtitem")));
String medi_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_cd")));
String dtls_medi_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dtls_medi_cd")));
String vexc_cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("vexc_cmpy_cd")));
String draft_doc_no = Util.Uni2Ksc(Util.checkString(req.getParameter("draft_doc_no")));
String draft_impt_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("draft_impt_amt")));
String draft_expn_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("draft_expn_amt")));
String in_igyb = Util.Uni2Ksc(Util.checkString(req.getParameter("in_igyb")));
String slip_rcpm_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_rcpm_dt")));
String rcpm_shet_kind = Util.Uni2Ksc(Util.checkString(req.getParameter("rcpm_shet_kind")));
String rcpm_shet_no = Util.Uni2Ksc(Util.checkString(req.getParameter("rcpm_shet_no")));
String g0_rcpm_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("g0_rcpm_amt")));
String g1_rcpm_slip_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("g1_rcpm_slip_seq")));
String g1_rcpm_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("g1_rcpm_dt")));
String g1_rcpm_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("g1_rcpm_amt")));
String g1_rcpm_pers_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("g1_rcpm_pers_nm")));
String g1_deps_psbk = Util.Uni2Ksc(Util.checkString(req.getParameter("g1_deps_psbk")));
String g1_coms = Util.Uni2Ksc(Util.checkString(req.getParameter("g1_coms")));
String g1_frex_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("g1_frex_clsf")));
String g1_exrate = Util.Uni2Ksc(Util.checkString(req.getParameter("g1_exrate")));
String g1_frex_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("g1_frex_amt")));
String biz_reg_no = Util.Uni2Ksc(Util.checkString(req.getParameter("biz_reg_no")));
String bank_id = Util.Uni2Ksc(Util.checkString(req.getParameter("bank_id")));
String acct_num = Util.Uni2Ksc(Util.checkString(req.getParameter("acct_num")));
String tran_date_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("tran_date_seq")));
String g2_rcpm_sub_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("g2_rcpm_sub_seq")));
String g2_note_no = Util.Uni2Ksc(Util.checkString(req.getParameter("g2_note_no")));
String g2_rcpm_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("g2_rcpm_amt")));
String g2_note_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("g2_note_clsf_cd")));
String g2_bank_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("g2_bank_cd")));
String g2_bank_cd_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("g2_bank_cd_nm")));
String g2_issu_pers_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("g2_issu_pers_nm")));
String g2_issu_cmpy_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("g2_issu_cmpy_clsf_cd")));
String g2_comp_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("g2_comp_dt")));
String g2_mtry_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("g2_mtry_dt")));
String g2_rcpm_acct = Util.Uni2Ksc(Util.checkString(req.getParameter("g2_rcpm_acct")));
String g2_sale_aprv_no = Util.Uni2Ksc(Util.checkString(req.getParameter("g2_sale_aprv_no")));
String g3_rcpm_sub_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("g3_rcpm_sub_seq")));
String g3_budg_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("g3_budg_cd")));
String g3_budg_cd_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("g3_budg_cd_nm")));
String g3_rcpm_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("g3_rcpm_amt")));
String g3_whco_slip_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("g3_whco_slip_clsf")));
String g3_whco_slip_no = Util.Uni2Ksc(Util.checkString(req.getParameter("g3_whco_slip_no")));
String make_upd_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("make_upd_dt")));
String upd_tms = Util.Uni2Ksc(Util.checkString(req.getParameter("upd_tms")));
String last_upd_dd = Util.Uni2Ksc(Util.checkString(req.getParameter("last_upd_dd")));
String rcpm_slip_no = Util.Uni2Ksc(Util.checkString(req.getParameter("rcpm_slip_no")));
String exrate_diff_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("exrate_diff_yn")));
String etc_in_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("etc_in_yn")));
String stmt_rmtt_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("stmt_rmtt_yn")));
String unit = Util.Uni2Ksc(Util.checkString(req.getParameter("unit")));
String qunt = Util.Uni2Ksc(Util.checkString(req.getParameter("qunt")));
String code_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("code_cd")));
String email = Util.Uni2Ksc(Util.checkString(req.getParameter("email")));
String semuro_no = Util.Uni2Ksc(Util.checkString(req.getParameter("semuro_no")));
String elec_tax_comp_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("elec_tax_comp_cd")));
String chnl_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("chnl_clsf_cd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setMode(mode);
dm.setReg_clsf(reg_clsf);
dm.setProf_type_cd(prof_type_cd);
dm.setSlip_clsf_cd(slip_clsf_cd);
dm.setSlip_occr_dt(slip_occr_dt);
dm.setSlip_seq(slip_seq);
dm.setMake_dt(make_dt);
dm.setErplace_cd(erplace_cd);
dm.setDlco_clsf_cd(dlco_clsf_cd);
dm.setDlco_cd(dlco_cd);
dm.setDeal_clsf(deal_clsf);
dm.setErn(ern);
dm.setDlco_nm(dlco_nm);
dm.setBoks_dlco_nm(boks_dlco_nm);
dm.setPresi_nm(presi_nm);
dm.setAddr(addr);
dm.setBizcond(bizcond);
dm.setItem(item);
dm.setEvnt_cd(evnt_cd);
dm.setSuply_amt(suply_amt);
dm.setVat_amt(vat_amt);
dm.setTax_stmt_aprv_yn(tax_stmt_aprv_yn);
dm.setRcpt_nosh(rcpt_nosh);
dm.setSg_budg_cd(sg_budg_cd);
dm.setAsk_emp_no(ask_emp_no);
dm.setAsk_dept_cd(ask_dept_cd);
dm.setRcpm_plan_dd(rcpm_plan_dd);
dm.setIncmg_pers(incmg_pers);
dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
dm.setSgtitem(sgtitem);
dm.setMedi_cd(medi_cd);
dm.setDtls_medi_cd(dtls_medi_cd);
dm.setVexc_cmpy_cd(vexc_cmpy_cd);
dm.setDraft_doc_no(draft_doc_no);
dm.setDraft_impt_amt(draft_impt_amt);
dm.setDraft_expn_amt(draft_expn_amt);
dm.setIn_igyb(in_igyb);
dm.setSlip_rcpm_dt(slip_rcpm_dt);
dm.setRcpm_shet_kind(rcpm_shet_kind);
dm.setRcpm_shet_no(rcpm_shet_no);
dm.setG0_rcpm_amt(g0_rcpm_amt);
dm.setG1_rcpm_slip_seq(g1_rcpm_slip_seq);
dm.setG1_rcpm_dt(g1_rcpm_dt);
dm.setG1_rcpm_amt(g1_rcpm_amt);
dm.setG1_rcpm_pers_nm(g1_rcpm_pers_nm);
dm.setG1_deps_psbk(g1_deps_psbk);
dm.setG1_coms(g1_coms);
dm.setG1_frex_clsf(g1_frex_clsf);
dm.setG1_exrate(g1_exrate);
dm.setG1_frex_amt(g1_frex_amt);
dm.setBiz_reg_no(biz_reg_no);
dm.setBank_id(bank_id);
dm.setAcct_num(acct_num);
dm.setTran_date_seq(tran_date_seq);
dm.setG2_rcpm_sub_seq(g2_rcpm_sub_seq);
dm.setG2_note_no(g2_note_no);
dm.setG2_rcpm_amt(g2_rcpm_amt);
dm.setG2_note_clsf_cd(g2_note_clsf_cd);
dm.setG2_bank_cd(g2_bank_cd);
dm.setG2_bank_cd_nm(g2_bank_cd_nm);
dm.setG2_issu_pers_nm(g2_issu_pers_nm);
dm.setG2_issu_cmpy_clsf_cd(g2_issu_cmpy_clsf_cd);
dm.setG2_comp_dt(g2_comp_dt);
dm.setG2_mtry_dt(g2_mtry_dt);
dm.setG2_rcpm_acct(g2_rcpm_acct);
dm.setG2_sale_aprv_no(g2_sale_aprv_no);
dm.setG3_rcpm_sub_seq(g3_rcpm_sub_seq);
dm.setG3_budg_cd(g3_budg_cd);
dm.setG3_budg_cd_nm(g3_budg_cd_nm);
dm.setG3_rcpm_amt(g3_rcpm_amt);
dm.setG3_whco_slip_clsf(g3_whco_slip_clsf);
dm.setG3_whco_slip_no(g3_whco_slip_no);
dm.setMake_upd_dt(make_upd_dt);
dm.setUpd_tms(upd_tms);
dm.setLast_upd_dd(last_upd_dd);
dm.setRcpm_slip_no(rcpm_slip_no);
dm.setExrate_diff_yn(exrate_diff_yn);
dm.setEtc_in_yn(etc_in_yn);
dm.setStmt_rmtt_yn(stmt_rmtt_yn);
dm.setUnit(unit);
dm.setQunt(qunt);
dm.setCode_cd(code_cd);
dm.setEmail(email);
dm.setSemuro_no(semuro_no);
dm.setElec_tax_comp_cd(elec_tax_comp_cd);
dm.setChnl_clsf_cd(chnl_clsf_cd);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Dec 19 15:12:07 KST 2014 */
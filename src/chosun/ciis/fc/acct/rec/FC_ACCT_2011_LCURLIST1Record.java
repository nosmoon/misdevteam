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


package chosun.ciis.fc.acct.rec;

import java.sql.*;
import chosun.ciis.fc.acct.dm.*;
import chosun.ciis.fc.acct.ds.*;

/**
 * 
 */


public class FC_ACCT_2011_LCURLIST1Record extends java.lang.Object implements java.io.Serializable{

	public String slip_sub_seq;
	public String slip_arow_no;
	public String budg_cd;
	public String drcr_clsf;
	public String dr_amt;
	public String crdt_amt;
	public String dlco_clsf_cd;
	public String dlco_cd;
	public String dlco_nm;
	public String boks_dlco_nm;
	public String mang_clsf_cd;
	public String mang_no;
	public String incm_clsf_cd;
	public String medi_cd;
	public String dtls_medi_cd;
	public String use_dept_cd;
	public String comp_dt;
	public String mtry_dt;
	public String unit;
	public String qunt;
	public String tax_stmt_no;
	public String setoff_slip_occr_dt;
	public String setoff_slip_clsf_cd;
	public String setoff_slip_seq;
	public String setoff_slip_sub_seq;
	public String setoff_slip_arow_no;
	public String etc_in;
	public String rmks2;
	public String make_dt;
	public String erplace_cd;
	public String ern;
	public String suply_amt;
	public String vat_amt;
	public String budg_cd_nm;
	public String use_dept_cd_nm;
	public String medi_cd_nm;
	public String dtls_medi_cd_nm;
	public String int_rate;
	public String pay_bank_cd;
	public String pay_bank_cd_nm;
	public String purc_amt;
	public String corp_tax_amt;
	public String issu_dt;
	public String insr_nm;
	public String intg_dlco_cd;
	public String prop_equip_cd;
	public String adpay_adjm_flag;
	public String bank_clsf;
	public String acct_no;
	public String deps_pers_nm;
	public String occr_slip_clsf;
	public String occr_slip;
	public String note_stat;
	public String vat_amt2;
	public String with_tax;
	public String incm_tax;
	public String res_tax;
	public String etc_in_amt;
	public String setoff_no;
	public String confirm_flag;
	public String draft_doc_no;
	public String draft_expn_amt;
	public String recp_pers_clsf;
	public String recp_pers;
	public String rn;
	public String draft_doc_dept_cd;
	public String semuro_occr_dt;
	public String semuro_seq;
	public String semuro_no;
	public String email_id;
	public String prop_equip_cd_nm;
	public String recp_pers1;
	public String recp_pers_nm1;

	public FC_ACCT_2011_LCURLIST1Record(){}

	public void setSlip_sub_seq(String slip_sub_seq){
		this.slip_sub_seq = slip_sub_seq;
	}

	public void setSlip_arow_no(String slip_arow_no){
		this.slip_arow_no = slip_arow_no;
	}

	public void setBudg_cd(String budg_cd){
		this.budg_cd = budg_cd;
	}

	public void setDrcr_clsf(String drcr_clsf){
		this.drcr_clsf = drcr_clsf;
	}

	public void setDr_amt(String dr_amt){
		this.dr_amt = dr_amt;
	}

	public void setCrdt_amt(String crdt_amt){
		this.crdt_amt = crdt_amt;
	}

	public void setDlco_clsf_cd(String dlco_clsf_cd){
		this.dlco_clsf_cd = dlco_clsf_cd;
	}

	public void setDlco_cd(String dlco_cd){
		this.dlco_cd = dlco_cd;
	}

	public void setDlco_nm(String dlco_nm){
		this.dlco_nm = dlco_nm;
	}

	public void setBoks_dlco_nm(String boks_dlco_nm){
		this.boks_dlco_nm = boks_dlco_nm;
	}

	public void setMang_clsf_cd(String mang_clsf_cd){
		this.mang_clsf_cd = mang_clsf_cd;
	}

	public void setMang_no(String mang_no){
		this.mang_no = mang_no;
	}

	public void setIncm_clsf_cd(String incm_clsf_cd){
		this.incm_clsf_cd = incm_clsf_cd;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setDtls_medi_cd(String dtls_medi_cd){
		this.dtls_medi_cd = dtls_medi_cd;
	}

	public void setUse_dept_cd(String use_dept_cd){
		this.use_dept_cd = use_dept_cd;
	}

	public void setComp_dt(String comp_dt){
		this.comp_dt = comp_dt;
	}

	public void setMtry_dt(String mtry_dt){
		this.mtry_dt = mtry_dt;
	}

	public void setUnit(String unit){
		this.unit = unit;
	}

	public void setQunt(String qunt){
		this.qunt = qunt;
	}

	public void setTax_stmt_no(String tax_stmt_no){
		this.tax_stmt_no = tax_stmt_no;
	}

	public void setSetoff_slip_occr_dt(String setoff_slip_occr_dt){
		this.setoff_slip_occr_dt = setoff_slip_occr_dt;
	}

	public void setSetoff_slip_clsf_cd(String setoff_slip_clsf_cd){
		this.setoff_slip_clsf_cd = setoff_slip_clsf_cd;
	}

	public void setSetoff_slip_seq(String setoff_slip_seq){
		this.setoff_slip_seq = setoff_slip_seq;
	}

	public void setSetoff_slip_sub_seq(String setoff_slip_sub_seq){
		this.setoff_slip_sub_seq = setoff_slip_sub_seq;
	}

	public void setSetoff_slip_arow_no(String setoff_slip_arow_no){
		this.setoff_slip_arow_no = setoff_slip_arow_no;
	}

	public void setEtc_in(String etc_in){
		this.etc_in = etc_in;
	}

	public void setRmks2(String rmks2){
		this.rmks2 = rmks2;
	}

	public void setMake_dt(String make_dt){
		this.make_dt = make_dt;
	}

	public void setErplace_cd(String erplace_cd){
		this.erplace_cd = erplace_cd;
	}

	public void setErn(String ern){
		this.ern = ern;
	}

	public void setSuply_amt(String suply_amt){
		this.suply_amt = suply_amt;
	}

	public void setVat_amt(String vat_amt){
		this.vat_amt = vat_amt;
	}

	public void setBudg_cd_nm(String budg_cd_nm){
		this.budg_cd_nm = budg_cd_nm;
	}

	public void setUse_dept_cd_nm(String use_dept_cd_nm){
		this.use_dept_cd_nm = use_dept_cd_nm;
	}

	public void setMedi_cd_nm(String medi_cd_nm){
		this.medi_cd_nm = medi_cd_nm;
	}

	public void setDtls_medi_cd_nm(String dtls_medi_cd_nm){
		this.dtls_medi_cd_nm = dtls_medi_cd_nm;
	}

	public void setInt_rate(String int_rate){
		this.int_rate = int_rate;
	}

	public void setPay_bank_cd(String pay_bank_cd){
		this.pay_bank_cd = pay_bank_cd;
	}

	public void setPay_bank_cd_nm(String pay_bank_cd_nm){
		this.pay_bank_cd_nm = pay_bank_cd_nm;
	}

	public void setPurc_amt(String purc_amt){
		this.purc_amt = purc_amt;
	}

	public void setCorp_tax_amt(String corp_tax_amt){
		this.corp_tax_amt = corp_tax_amt;
	}

	public void setIssu_dt(String issu_dt){
		this.issu_dt = issu_dt;
	}

	public void setInsr_nm(String insr_nm){
		this.insr_nm = insr_nm;
	}

	public void setIntg_dlco_cd(String intg_dlco_cd){
		this.intg_dlco_cd = intg_dlco_cd;
	}

	public void setProp_equip_cd(String prop_equip_cd){
		this.prop_equip_cd = prop_equip_cd;
	}

	public void setAdpay_adjm_flag(String adpay_adjm_flag){
		this.adpay_adjm_flag = adpay_adjm_flag;
	}

	public void setBank_clsf(String bank_clsf){
		this.bank_clsf = bank_clsf;
	}

	public void setAcct_no(String acct_no){
		this.acct_no = acct_no;
	}

	public void setDeps_pers_nm(String deps_pers_nm){
		this.deps_pers_nm = deps_pers_nm;
	}

	public void setOccr_slip_clsf(String occr_slip_clsf){
		this.occr_slip_clsf = occr_slip_clsf;
	}

	public void setOccr_slip(String occr_slip){
		this.occr_slip = occr_slip;
	}

	public void setNote_stat(String note_stat){
		this.note_stat = note_stat;
	}

	public void setVat_amt2(String vat_amt2){
		this.vat_amt2 = vat_amt2;
	}

	public void setWith_tax(String with_tax){
		this.with_tax = with_tax;
	}

	public void setIncm_tax(String incm_tax){
		this.incm_tax = incm_tax;
	}

	public void setRes_tax(String res_tax){
		this.res_tax = res_tax;
	}

	public void setEtc_in_amt(String etc_in_amt){
		this.etc_in_amt = etc_in_amt;
	}

	public void setSetoff_no(String setoff_no){
		this.setoff_no = setoff_no;
	}

	public void setConfirm_flag(String confirm_flag){
		this.confirm_flag = confirm_flag;
	}

	public void setDraft_doc_no(String draft_doc_no){
		this.draft_doc_no = draft_doc_no;
	}

	public void setDraft_expn_amt(String draft_expn_amt){
		this.draft_expn_amt = draft_expn_amt;
	}

	public void setRecp_pers_clsf(String recp_pers_clsf){
		this.recp_pers_clsf = recp_pers_clsf;
	}

	public void setRecp_pers(String recp_pers){
		this.recp_pers = recp_pers;
	}

	public void setRn(String rn){
		this.rn = rn;
	}

	public void setDraft_doc_dept_cd(String draft_doc_dept_cd){
		this.draft_doc_dept_cd = draft_doc_dept_cd;
	}

	public void setSemuro_occr_dt(String semuro_occr_dt){
		this.semuro_occr_dt = semuro_occr_dt;
	}

	public void setSemuro_seq(String semuro_seq){
		this.semuro_seq = semuro_seq;
	}

	public void setSemuro_no(String semuro_no){
		this.semuro_no = semuro_no;
	}

	public void setEmail_id(String email_id){
		this.email_id = email_id;
	}

	public void setProp_equip_cd_nm(String prop_equip_cd_nm){
		this.prop_equip_cd_nm = prop_equip_cd_nm;
	}

	public void setRecp_pers1(String recp_pers1){
		this.recp_pers1 = recp_pers1;
	}

	public void setRecp_pers_nm1(String recp_pers_nm1){
		this.recp_pers_nm1 = recp_pers_nm1;
	}

	public String getSlip_sub_seq(){
		return this.slip_sub_seq;
	}

	public String getSlip_arow_no(){
		return this.slip_arow_no;
	}

	public String getBudg_cd(){
		return this.budg_cd;
	}

	public String getDrcr_clsf(){
		return this.drcr_clsf;
	}

	public String getDr_amt(){
		return this.dr_amt;
	}

	public String getCrdt_amt(){
		return this.crdt_amt;
	}

	public String getDlco_clsf_cd(){
		return this.dlco_clsf_cd;
	}

	public String getDlco_cd(){
		return this.dlco_cd;
	}

	public String getDlco_nm(){
		return this.dlco_nm;
	}

	public String getBoks_dlco_nm(){
		return this.boks_dlco_nm;
	}

	public String getMang_clsf_cd(){
		return this.mang_clsf_cd;
	}

	public String getMang_no(){
		return this.mang_no;
	}

	public String getIncm_clsf_cd(){
		return this.incm_clsf_cd;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getDtls_medi_cd(){
		return this.dtls_medi_cd;
	}

	public String getUse_dept_cd(){
		return this.use_dept_cd;
	}

	public String getComp_dt(){
		return this.comp_dt;
	}

	public String getMtry_dt(){
		return this.mtry_dt;
	}

	public String getUnit(){
		return this.unit;
	}

	public String getQunt(){
		return this.qunt;
	}

	public String getTax_stmt_no(){
		return this.tax_stmt_no;
	}

	public String getSetoff_slip_occr_dt(){
		return this.setoff_slip_occr_dt;
	}

	public String getSetoff_slip_clsf_cd(){
		return this.setoff_slip_clsf_cd;
	}

	public String getSetoff_slip_seq(){
		return this.setoff_slip_seq;
	}

	public String getSetoff_slip_sub_seq(){
		return this.setoff_slip_sub_seq;
	}

	public String getSetoff_slip_arow_no(){
		return this.setoff_slip_arow_no;
	}

	public String getEtc_in(){
		return this.etc_in;
	}

	public String getRmks2(){
		return this.rmks2;
	}

	public String getMake_dt(){
		return this.make_dt;
	}

	public String getErplace_cd(){
		return this.erplace_cd;
	}

	public String getErn(){
		return this.ern;
	}

	public String getSuply_amt(){
		return this.suply_amt;
	}

	public String getVat_amt(){
		return this.vat_amt;
	}

	public String getBudg_cd_nm(){
		return this.budg_cd_nm;
	}

	public String getUse_dept_cd_nm(){
		return this.use_dept_cd_nm;
	}

	public String getMedi_cd_nm(){
		return this.medi_cd_nm;
	}

	public String getDtls_medi_cd_nm(){
		return this.dtls_medi_cd_nm;
	}

	public String getInt_rate(){
		return this.int_rate;
	}

	public String getPay_bank_cd(){
		return this.pay_bank_cd;
	}

	public String getPay_bank_cd_nm(){
		return this.pay_bank_cd_nm;
	}

	public String getPurc_amt(){
		return this.purc_amt;
	}

	public String getCorp_tax_amt(){
		return this.corp_tax_amt;
	}

	public String getIssu_dt(){
		return this.issu_dt;
	}

	public String getInsr_nm(){
		return this.insr_nm;
	}

	public String getIntg_dlco_cd(){
		return this.intg_dlco_cd;
	}

	public String getProp_equip_cd(){
		return this.prop_equip_cd;
	}

	public String getAdpay_adjm_flag(){
		return this.adpay_adjm_flag;
	}

	public String getBank_clsf(){
		return this.bank_clsf;
	}

	public String getAcct_no(){
		return this.acct_no;
	}

	public String getDeps_pers_nm(){
		return this.deps_pers_nm;
	}

	public String getOccr_slip_clsf(){
		return this.occr_slip_clsf;
	}

	public String getOccr_slip(){
		return this.occr_slip;
	}

	public String getNote_stat(){
		return this.note_stat;
	}

	public String getVat_amt2(){
		return this.vat_amt2;
	}

	public String getWith_tax(){
		return this.with_tax;
	}

	public String getIncm_tax(){
		return this.incm_tax;
	}

	public String getRes_tax(){
		return this.res_tax;
	}

	public String getEtc_in_amt(){
		return this.etc_in_amt;
	}

	public String getSetoff_no(){
		return this.setoff_no;
	}

	public String getConfirm_flag(){
		return this.confirm_flag;
	}

	public String getDraft_doc_no(){
		return this.draft_doc_no;
	}

	public String getDraft_expn_amt(){
		return this.draft_expn_amt;
	}

	public String getRecp_pers_clsf(){
		return this.recp_pers_clsf;
	}

	public String getRecp_pers(){
		return this.recp_pers;
	}

	public String getRn(){
		return this.rn;
	}

	public String getDraft_doc_dept_cd(){
		return this.draft_doc_dept_cd;
	}

	public String getSemuro_occr_dt(){
		return this.semuro_occr_dt;
	}

	public String getSemuro_seq(){
		return this.semuro_seq;
	}

	public String getSemuro_no(){
		return this.semuro_no;
	}

	public String getEmail_id(){
		return this.email_id;
	}

	public String getProp_equip_cd_nm(){
		return this.prop_equip_cd_nm;
	}

	public String getRecp_pers1(){
		return this.recp_pers1;
	}

	public String getRecp_pers_nm1(){
		return this.recp_pers_nm1;
	}
}

/* 작성시간 : Thu Dec 18 11:26:47 KST 2014 */
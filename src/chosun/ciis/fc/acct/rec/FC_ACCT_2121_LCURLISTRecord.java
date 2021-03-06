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


public class FC_ACCT_2121_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String prof_type_cd;
	public String slip_clsf_cd;
	public String slip_occr_dt;
	public String slip_seq;
	public String occr_slip_occr_dt;
	public String occr_slip_clsf_cd;
	public String occr_slip_seq;
	public String occr_slip_sub_seq;
	public String occr_slip_arow_no;
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
	public String presi_item;
	public String suply_amt;
	public String vat_amt;
	public String tax_stmt_aprv_yn;
	public String upd_tms;
	public String rcpt_nosh;
	public String budg_cd;
	public String budg_cd_nm;
	public String ask_emp_no;
	public String ask_emp_nm;
	public String ask_dept_cd;
	public String ask_dept_nm;
	public String rcpm_plan_dt;
	public String item;
	public String medi_cd;
	public String remk;
	public String evnt_cd;
	public String evnt_cd_nm;
	public String dtls_medi_cd;
	public String dtls_medi_cd_nm;
	public String draft_doc_no;
	public String draft_impt_amt;
	public String draft_expn_amt;
	public String rcpm_amt;
	public String vexc_cmpy_cd;
	public String vexc_cmpy_cd_ern;
	public String vexc_cmpy_cd_nm;
	public String reg_clsf;
	public String unit;
	public String qunt;
	public String mang_clsf_cd;
	public String email;
	public String semuro_no;
	public String elec_tax_comp_cd;
	public String chnl_clsf_cd;

	public FC_ACCT_2121_LCURLISTRecord(){}

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

	public void setOccr_slip_occr_dt(String occr_slip_occr_dt){
		this.occr_slip_occr_dt = occr_slip_occr_dt;
	}

	public void setOccr_slip_clsf_cd(String occr_slip_clsf_cd){
		this.occr_slip_clsf_cd = occr_slip_clsf_cd;
	}

	public void setOccr_slip_seq(String occr_slip_seq){
		this.occr_slip_seq = occr_slip_seq;
	}

	public void setOccr_slip_sub_seq(String occr_slip_sub_seq){
		this.occr_slip_sub_seq = occr_slip_sub_seq;
	}

	public void setOccr_slip_arow_no(String occr_slip_arow_no){
		this.occr_slip_arow_no = occr_slip_arow_no;
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

	public void setPresi_item(String presi_item){
		this.presi_item = presi_item;
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

	public void setUpd_tms(String upd_tms){
		this.upd_tms = upd_tms;
	}

	public void setRcpt_nosh(String rcpt_nosh){
		this.rcpt_nosh = rcpt_nosh;
	}

	public void setBudg_cd(String budg_cd){
		this.budg_cd = budg_cd;
	}

	public void setBudg_cd_nm(String budg_cd_nm){
		this.budg_cd_nm = budg_cd_nm;
	}

	public void setAsk_emp_no(String ask_emp_no){
		this.ask_emp_no = ask_emp_no;
	}

	public void setAsk_emp_nm(String ask_emp_nm){
		this.ask_emp_nm = ask_emp_nm;
	}

	public void setAsk_dept_cd(String ask_dept_cd){
		this.ask_dept_cd = ask_dept_cd;
	}

	public void setAsk_dept_nm(String ask_dept_nm){
		this.ask_dept_nm = ask_dept_nm;
	}

	public void setRcpm_plan_dt(String rcpm_plan_dt){
		this.rcpm_plan_dt = rcpm_plan_dt;
	}

	public void setItem(String item){
		this.item = item;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setEvnt_cd(String evnt_cd){
		this.evnt_cd = evnt_cd;
	}

	public void setEvnt_cd_nm(String evnt_cd_nm){
		this.evnt_cd_nm = evnt_cd_nm;
	}

	public void setDtls_medi_cd(String dtls_medi_cd){
		this.dtls_medi_cd = dtls_medi_cd;
	}

	public void setDtls_medi_cd_nm(String dtls_medi_cd_nm){
		this.dtls_medi_cd_nm = dtls_medi_cd_nm;
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

	public void setRcpm_amt(String rcpm_amt){
		this.rcpm_amt = rcpm_amt;
	}

	public void setVexc_cmpy_cd(String vexc_cmpy_cd){
		this.vexc_cmpy_cd = vexc_cmpy_cd;
	}

	public void setVexc_cmpy_cd_ern(String vexc_cmpy_cd_ern){
		this.vexc_cmpy_cd_ern = vexc_cmpy_cd_ern;
	}

	public void setVexc_cmpy_cd_nm(String vexc_cmpy_cd_nm){
		this.vexc_cmpy_cd_nm = vexc_cmpy_cd_nm;
	}

	public void setReg_clsf(String reg_clsf){
		this.reg_clsf = reg_clsf;
	}

	public void setUnit(String unit){
		this.unit = unit;
	}

	public void setQunt(String qunt){
		this.qunt = qunt;
	}

	public void setMang_clsf_cd(String mang_clsf_cd){
		this.mang_clsf_cd = mang_clsf_cd;
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

	public String getOccr_slip_occr_dt(){
		return this.occr_slip_occr_dt;
	}

	public String getOccr_slip_clsf_cd(){
		return this.occr_slip_clsf_cd;
	}

	public String getOccr_slip_seq(){
		return this.occr_slip_seq;
	}

	public String getOccr_slip_sub_seq(){
		return this.occr_slip_sub_seq;
	}

	public String getOccr_slip_arow_no(){
		return this.occr_slip_arow_no;
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

	public String getPresi_item(){
		return this.presi_item;
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

	public String getUpd_tms(){
		return this.upd_tms;
	}

	public String getRcpt_nosh(){
		return this.rcpt_nosh;
	}

	public String getBudg_cd(){
		return this.budg_cd;
	}

	public String getBudg_cd_nm(){
		return this.budg_cd_nm;
	}

	public String getAsk_emp_no(){
		return this.ask_emp_no;
	}

	public String getAsk_emp_nm(){
		return this.ask_emp_nm;
	}

	public String getAsk_dept_cd(){
		return this.ask_dept_cd;
	}

	public String getAsk_dept_nm(){
		return this.ask_dept_nm;
	}

	public String getRcpm_plan_dt(){
		return this.rcpm_plan_dt;
	}

	public String getItem(){
		return this.item;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getEvnt_cd(){
		return this.evnt_cd;
	}

	public String getEvnt_cd_nm(){
		return this.evnt_cd_nm;
	}

	public String getDtls_medi_cd(){
		return this.dtls_medi_cd;
	}

	public String getDtls_medi_cd_nm(){
		return this.dtls_medi_cd_nm;
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

	public String getRcpm_amt(){
		return this.rcpm_amt;
	}

	public String getVexc_cmpy_cd(){
		return this.vexc_cmpy_cd;
	}

	public String getVexc_cmpy_cd_ern(){
		return this.vexc_cmpy_cd_ern;
	}

	public String getVexc_cmpy_cd_nm(){
		return this.vexc_cmpy_cd_nm;
	}

	public String getReg_clsf(){
		return this.reg_clsf;
	}

	public String getUnit(){
		return this.unit;
	}

	public String getQunt(){
		return this.qunt;
	}

	public String getMang_clsf_cd(){
		return this.mang_clsf_cd;
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
}

/* 작성시간 : Fri Dec 19 14:30:10 KST 2014 */
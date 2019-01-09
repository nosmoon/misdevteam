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


public class FC_ACCT_2342_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String slip_occr_dt;
	public String slip_clsf_cd;
	public String slip_seq;
	public String slip_sub_seq;
	public String slip_arow_no;
	public String clam_dept_cd;
	public String cgbuseonm;
	public String slip_aprv_yn;
	public String chrg_emp_no;
	public String hjpddsabeonnm;
	public String budg_yymm;
	public String fisc_dt;
	public String budg_cd;
	public String hjpysnm;
	public String drcr_clsf;
	public String dr_amt;
	public String crdt_amt;
	public String evnt_cd;
	public String tax_stmt_no;
	public String setoff_slip_occr_dt;
	public String setoff_slip_clsf_cd;
	public String setoff_slip_seq;
	public String setoff_slip_sub_seq;
	public String setoff_slip_arow_no;
	public String obj_acct_cd;
	public String obj_dt;
	public String obj_amt;
	public String rmks1;
	public String rmks2;
	public String use_dept_cd;
	public String usebuseonm;
	public String incmg_emp_no;
	public String hjpinsabeonnm;
	public String dlco_clsf_cd;
	public String dlco_cd;
	public String dlco_nm;
	public String incm_clsf_cd;
	public String incmg_dt;
	public String etc_in;
	public String prop_equip_cd;
	public String boks_dlco_nm;
	public String prt_no;
	public String adpay_adjm_flag;
	public String note_stat;
	public String suply_amt;
	public String vat_amt;
	public String erplace_cd;
	public String make_dt;
	public String ern;
	public String dlco_clsf_cd2;
	public String dlco_cd2;
	public String dlco_nm2;
	public String usebuseonm2;
	public String dlco_cd3;
	public String dlco_nm3;
	public String setoff_slip_no;
	public String vat_amt2;
	public String draft_doc_no;
	public String evnt_nm;
	public String draft_doc_dept_cd;
	public String draft_expn_amt;

	public FC_ACCT_2342_LCURLISTRecord(){}

	public void setSlip_occr_dt(String slip_occr_dt){
		this.slip_occr_dt = slip_occr_dt;
	}

	public void setSlip_clsf_cd(String slip_clsf_cd){
		this.slip_clsf_cd = slip_clsf_cd;
	}

	public void setSlip_seq(String slip_seq){
		this.slip_seq = slip_seq;
	}

	public void setSlip_sub_seq(String slip_sub_seq){
		this.slip_sub_seq = slip_sub_seq;
	}

	public void setSlip_arow_no(String slip_arow_no){
		this.slip_arow_no = slip_arow_no;
	}

	public void setClam_dept_cd(String clam_dept_cd){
		this.clam_dept_cd = clam_dept_cd;
	}

	public void setCgbuseonm(String cgbuseonm){
		this.cgbuseonm = cgbuseonm;
	}

	public void setSlip_aprv_yn(String slip_aprv_yn){
		this.slip_aprv_yn = slip_aprv_yn;
	}

	public void setChrg_emp_no(String chrg_emp_no){
		this.chrg_emp_no = chrg_emp_no;
	}

	public void setHjpddsabeonnm(String hjpddsabeonnm){
		this.hjpddsabeonnm = hjpddsabeonnm;
	}

	public void setBudg_yymm(String budg_yymm){
		this.budg_yymm = budg_yymm;
	}

	public void setFisc_dt(String fisc_dt){
		this.fisc_dt = fisc_dt;
	}

	public void setBudg_cd(String budg_cd){
		this.budg_cd = budg_cd;
	}

	public void setHjpysnm(String hjpysnm){
		this.hjpysnm = hjpysnm;
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

	public void setEvnt_cd(String evnt_cd){
		this.evnt_cd = evnt_cd;
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

	public void setObj_acct_cd(String obj_acct_cd){
		this.obj_acct_cd = obj_acct_cd;
	}

	public void setObj_dt(String obj_dt){
		this.obj_dt = obj_dt;
	}

	public void setObj_amt(String obj_amt){
		this.obj_amt = obj_amt;
	}

	public void setRmks1(String rmks1){
		this.rmks1 = rmks1;
	}

	public void setRmks2(String rmks2){
		this.rmks2 = rmks2;
	}

	public void setUse_dept_cd(String use_dept_cd){
		this.use_dept_cd = use_dept_cd;
	}

	public void setUsebuseonm(String usebuseonm){
		this.usebuseonm = usebuseonm;
	}

	public void setIncmg_emp_no(String incmg_emp_no){
		this.incmg_emp_no = incmg_emp_no;
	}

	public void setHjpinsabeonnm(String hjpinsabeonnm){
		this.hjpinsabeonnm = hjpinsabeonnm;
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

	public void setIncm_clsf_cd(String incm_clsf_cd){
		this.incm_clsf_cd = incm_clsf_cd;
	}

	public void setIncmg_dt(String incmg_dt){
		this.incmg_dt = incmg_dt;
	}

	public void setEtc_in(String etc_in){
		this.etc_in = etc_in;
	}

	public void setProp_equip_cd(String prop_equip_cd){
		this.prop_equip_cd = prop_equip_cd;
	}

	public void setBoks_dlco_nm(String boks_dlco_nm){
		this.boks_dlco_nm = boks_dlco_nm;
	}

	public void setPrt_no(String prt_no){
		this.prt_no = prt_no;
	}

	public void setAdpay_adjm_flag(String adpay_adjm_flag){
		this.adpay_adjm_flag = adpay_adjm_flag;
	}

	public void setNote_stat(String note_stat){
		this.note_stat = note_stat;
	}

	public void setSuply_amt(String suply_amt){
		this.suply_amt = suply_amt;
	}

	public void setVat_amt(String vat_amt){
		this.vat_amt = vat_amt;
	}

	public void setErplace_cd(String erplace_cd){
		this.erplace_cd = erplace_cd;
	}

	public void setMake_dt(String make_dt){
		this.make_dt = make_dt;
	}

	public void setErn(String ern){
		this.ern = ern;
	}

	public void setDlco_clsf_cd2(String dlco_clsf_cd2){
		this.dlco_clsf_cd2 = dlco_clsf_cd2;
	}

	public void setDlco_cd2(String dlco_cd2){
		this.dlco_cd2 = dlco_cd2;
	}

	public void setDlco_nm2(String dlco_nm2){
		this.dlco_nm2 = dlco_nm2;
	}

	public void setUsebuseonm2(String usebuseonm2){
		this.usebuseonm2 = usebuseonm2;
	}

	public void setDlco_cd3(String dlco_cd3){
		this.dlco_cd3 = dlco_cd3;
	}

	public void setDlco_nm3(String dlco_nm3){
		this.dlco_nm3 = dlco_nm3;
	}

	public void setSetoff_slip_no(String setoff_slip_no){
		this.setoff_slip_no = setoff_slip_no;
	}

	public void setVat_amt2(String vat_amt2){
		this.vat_amt2 = vat_amt2;
	}

	public void setDraft_doc_no(String draft_doc_no){
		this.draft_doc_no = draft_doc_no;
	}

	public void setEvnt_nm(String evnt_nm){
		this.evnt_nm = evnt_nm;
	}

	public void setDraft_doc_dept_cd(String draft_doc_dept_cd){
		this.draft_doc_dept_cd = draft_doc_dept_cd;
	}

	public void setDraft_expn_amt(String draft_expn_amt){
		this.draft_expn_amt = draft_expn_amt;
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

	public String getSlip_sub_seq(){
		return this.slip_sub_seq;
	}

	public String getSlip_arow_no(){
		return this.slip_arow_no;
	}

	public String getClam_dept_cd(){
		return this.clam_dept_cd;
	}

	public String getCgbuseonm(){
		return this.cgbuseonm;
	}

	public String getSlip_aprv_yn(){
		return this.slip_aprv_yn;
	}

	public String getChrg_emp_no(){
		return this.chrg_emp_no;
	}

	public String getHjpddsabeonnm(){
		return this.hjpddsabeonnm;
	}

	public String getBudg_yymm(){
		return this.budg_yymm;
	}

	public String getFisc_dt(){
		return this.fisc_dt;
	}

	public String getBudg_cd(){
		return this.budg_cd;
	}

	public String getHjpysnm(){
		return this.hjpysnm;
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

	public String getEvnt_cd(){
		return this.evnt_cd;
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

	public String getObj_acct_cd(){
		return this.obj_acct_cd;
	}

	public String getObj_dt(){
		return this.obj_dt;
	}

	public String getObj_amt(){
		return this.obj_amt;
	}

	public String getRmks1(){
		return this.rmks1;
	}

	public String getRmks2(){
		return this.rmks2;
	}

	public String getUse_dept_cd(){
		return this.use_dept_cd;
	}

	public String getUsebuseonm(){
		return this.usebuseonm;
	}

	public String getIncmg_emp_no(){
		return this.incmg_emp_no;
	}

	public String getHjpinsabeonnm(){
		return this.hjpinsabeonnm;
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

	public String getIncm_clsf_cd(){
		return this.incm_clsf_cd;
	}

	public String getIncmg_dt(){
		return this.incmg_dt;
	}

	public String getEtc_in(){
		return this.etc_in;
	}

	public String getProp_equip_cd(){
		return this.prop_equip_cd;
	}

	public String getBoks_dlco_nm(){
		return this.boks_dlco_nm;
	}

	public String getPrt_no(){
		return this.prt_no;
	}

	public String getAdpay_adjm_flag(){
		return this.adpay_adjm_flag;
	}

	public String getNote_stat(){
		return this.note_stat;
	}

	public String getSuply_amt(){
		return this.suply_amt;
	}

	public String getVat_amt(){
		return this.vat_amt;
	}

	public String getErplace_cd(){
		return this.erplace_cd;
	}

	public String getMake_dt(){
		return this.make_dt;
	}

	public String getErn(){
		return this.ern;
	}

	public String getDlco_clsf_cd2(){
		return this.dlco_clsf_cd2;
	}

	public String getDlco_cd2(){
		return this.dlco_cd2;
	}

	public String getDlco_nm2(){
		return this.dlco_nm2;
	}

	public String getUsebuseonm2(){
		return this.usebuseonm2;
	}

	public String getDlco_cd3(){
		return this.dlco_cd3;
	}

	public String getDlco_nm3(){
		return this.dlco_nm3;
	}

	public String getSetoff_slip_no(){
		return this.setoff_slip_no;
	}

	public String getVat_amt2(){
		return this.vat_amt2;
	}

	public String getDraft_doc_no(){
		return this.draft_doc_no;
	}

	public String getEvnt_nm(){
		return this.evnt_nm;
	}

	public String getDraft_doc_dept_cd(){
		return this.draft_doc_dept_cd;
	}

	public String getDraft_expn_amt(){
		return this.draft_expn_amt;
	}
}

/* 작성시간 : Thu Jul 16 14:34:43 KST 2009 */
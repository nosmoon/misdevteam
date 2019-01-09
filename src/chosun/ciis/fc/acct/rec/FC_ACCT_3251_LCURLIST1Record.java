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


public class FC_ACCT_3251_LCURLIST1Record extends java.lang.Object implements java.io.Serializable{

	public String slip_arow_no;
	public String budg_cd;
	public String pch_sdysnm;
	public String dr_amt;
	public String crdt_amt;
	public String rmks1;
	public String rmks2;
	public String drcr_clsf;
	public String dlco_clsf_cd;
	public String dlco_cd;
	public String dlco_nm;
	public String boks_dlco_nm;
	public String mang_clsf_cd;
	public String mang_no;
	public String incm_clsf_cd;
	public String medi_cd;
	public String dtls_medi_cd;
	public String evnt_cd;
	public String pch_hsnm;
	public String use_dept_cd;
	public String pch_buseonm;
	public String comp_dt;
	public String mtry_dt;
	public String bank_cd;
	public String pch_banknm;
	public String unit;
	public String qunt;
	public String obj_acct_cd;
	public String pch_dsacctnm;
	public String obj_dt;
	public String obj_amt;
	public String frcr_clsf_cd;
	public String frcr_amt;
	public String exrate;
	public String note_stat;
	public String intg_dlco_cd;
	public String prop_equip_cd;
	public String tax_stmt_no;
	public String make_dt;
	public String erplace_cd;
	public String ern;
	public String suply_amt;
	public String setoff_slip_no;
	public String occr_slip_clsf;
	public String occr_slip;
	public String mang_clsf_nm;
	public String vat_amt;
	public String email_id;
	public String remk;
	public String item;
	public String re_issu_resn_cd;

	public FC_ACCT_3251_LCURLIST1Record(){}

	public void setSlip_arow_no(String slip_arow_no){
		this.slip_arow_no = slip_arow_no;
	}

	public void setBudg_cd(String budg_cd){
		this.budg_cd = budg_cd;
	}

	public void setPch_sdysnm(String pch_sdysnm){
		this.pch_sdysnm = pch_sdysnm;
	}

	public void setDr_amt(String dr_amt){
		this.dr_amt = dr_amt;
	}

	public void setCrdt_amt(String crdt_amt){
		this.crdt_amt = crdt_amt;
	}

	public void setRmks1(String rmks1){
		this.rmks1 = rmks1;
	}

	public void setRmks2(String rmks2){
		this.rmks2 = rmks2;
	}

	public void setDrcr_clsf(String drcr_clsf){
		this.drcr_clsf = drcr_clsf;
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

	public void setEvnt_cd(String evnt_cd){
		this.evnt_cd = evnt_cd;
	}

	public void setPch_hsnm(String pch_hsnm){
		this.pch_hsnm = pch_hsnm;
	}

	public void setUse_dept_cd(String use_dept_cd){
		this.use_dept_cd = use_dept_cd;
	}

	public void setPch_buseonm(String pch_buseonm){
		this.pch_buseonm = pch_buseonm;
	}

	public void setComp_dt(String comp_dt){
		this.comp_dt = comp_dt;
	}

	public void setMtry_dt(String mtry_dt){
		this.mtry_dt = mtry_dt;
	}

	public void setBank_cd(String bank_cd){
		this.bank_cd = bank_cd;
	}

	public void setPch_banknm(String pch_banknm){
		this.pch_banknm = pch_banknm;
	}

	public void setUnit(String unit){
		this.unit = unit;
	}

	public void setQunt(String qunt){
		this.qunt = qunt;
	}

	public void setObj_acct_cd(String obj_acct_cd){
		this.obj_acct_cd = obj_acct_cd;
	}

	public void setPch_dsacctnm(String pch_dsacctnm){
		this.pch_dsacctnm = pch_dsacctnm;
	}

	public void setObj_dt(String obj_dt){
		this.obj_dt = obj_dt;
	}

	public void setObj_amt(String obj_amt){
		this.obj_amt = obj_amt;
	}

	public void setFrcr_clsf_cd(String frcr_clsf_cd){
		this.frcr_clsf_cd = frcr_clsf_cd;
	}

	public void setFrcr_amt(String frcr_amt){
		this.frcr_amt = frcr_amt;
	}

	public void setExrate(String exrate){
		this.exrate = exrate;
	}

	public void setNote_stat(String note_stat){
		this.note_stat = note_stat;
	}

	public void setIntg_dlco_cd(String intg_dlco_cd){
		this.intg_dlco_cd = intg_dlco_cd;
	}

	public void setProp_equip_cd(String prop_equip_cd){
		this.prop_equip_cd = prop_equip_cd;
	}

	public void setTax_stmt_no(String tax_stmt_no){
		this.tax_stmt_no = tax_stmt_no;
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

	public void setSetoff_slip_no(String setoff_slip_no){
		this.setoff_slip_no = setoff_slip_no;
	}

	public void setOccr_slip_clsf(String occr_slip_clsf){
		this.occr_slip_clsf = occr_slip_clsf;
	}

	public void setOccr_slip(String occr_slip){
		this.occr_slip = occr_slip;
	}

	public void setMang_clsf_nm(String mang_clsf_nm){
		this.mang_clsf_nm = mang_clsf_nm;
	}

	public void setVat_amt(String vat_amt){
		this.vat_amt = vat_amt;
	}

	public void setEmail_id(String email_id){
		this.email_id = email_id;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setItem(String item){
		this.item = item;
	}

	public void setRe_issu_resn_cd(String re_issu_resn_cd){
		this.re_issu_resn_cd = re_issu_resn_cd;
	}

	public String getSlip_arow_no(){
		return this.slip_arow_no;
	}

	public String getBudg_cd(){
		return this.budg_cd;
	}

	public String getPch_sdysnm(){
		return this.pch_sdysnm;
	}

	public String getDr_amt(){
		return this.dr_amt;
	}

	public String getCrdt_amt(){
		return this.crdt_amt;
	}

	public String getRmks1(){
		return this.rmks1;
	}

	public String getRmks2(){
		return this.rmks2;
	}

	public String getDrcr_clsf(){
		return this.drcr_clsf;
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

	public String getEvnt_cd(){
		return this.evnt_cd;
	}

	public String getPch_hsnm(){
		return this.pch_hsnm;
	}

	public String getUse_dept_cd(){
		return this.use_dept_cd;
	}

	public String getPch_buseonm(){
		return this.pch_buseonm;
	}

	public String getComp_dt(){
		return this.comp_dt;
	}

	public String getMtry_dt(){
		return this.mtry_dt;
	}

	public String getBank_cd(){
		return this.bank_cd;
	}

	public String getPch_banknm(){
		return this.pch_banknm;
	}

	public String getUnit(){
		return this.unit;
	}

	public String getQunt(){
		return this.qunt;
	}

	public String getObj_acct_cd(){
		return this.obj_acct_cd;
	}

	public String getPch_dsacctnm(){
		return this.pch_dsacctnm;
	}

	public String getObj_dt(){
		return this.obj_dt;
	}

	public String getObj_amt(){
		return this.obj_amt;
	}

	public String getFrcr_clsf_cd(){
		return this.frcr_clsf_cd;
	}

	public String getFrcr_amt(){
		return this.frcr_amt;
	}

	public String getExrate(){
		return this.exrate;
	}

	public String getNote_stat(){
		return this.note_stat;
	}

	public String getIntg_dlco_cd(){
		return this.intg_dlco_cd;
	}

	public String getProp_equip_cd(){
		return this.prop_equip_cd;
	}

	public String getTax_stmt_no(){
		return this.tax_stmt_no;
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

	public String getSetoff_slip_no(){
		return this.setoff_slip_no;
	}

	public String getOccr_slip_clsf(){
		return this.occr_slip_clsf;
	}

	public String getOccr_slip(){
		return this.occr_slip;
	}

	public String getMang_clsf_nm(){
		return this.mang_clsf_nm;
	}

	public String getVat_amt(){
		return this.vat_amt;
	}

	public String getEmail_id(){
		return this.email_id;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getItem(){
		return this.item;
	}

	public String getRe_issu_resn_cd(){
		return this.re_issu_resn_cd;
	}
}

/* 작성시간 : Thu Sep 03 16:18:25 KST 2015 */
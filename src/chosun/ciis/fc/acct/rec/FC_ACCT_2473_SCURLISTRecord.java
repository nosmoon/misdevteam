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


public class FC_ACCT_2473_SCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String acct_cd;
	public String acct_nm;
	public String dlco_clsf_cd;
	public String dlco_cd;
	public String dlco_nm;
	public String boks_dlco_nm;
	public String medi_cd;
	public String medi_nm;
	public String mang_no;
	public String mang_clsf_cd;
	public String mang_clsf_nm;
	public String bank_cd;
	public String bank_nm;
	public String comp_dt;
	public String mtry_dt;
	public String unit;
	public String qunt;
	public String use_dept_cd;
	public String use_dept_nm;
	public String obj_acct_cd;
	public String obj_acct_nm;
	public String obj_amt;
	public String note_stat;
	public String note_stat_nm;
	public String frcr_clsf_cd;
	public String exrate;
	public String frcr_amt;
	public String obj_dt;
	public String dtls_medi_cd;
	public String evnt_cd;
	public String prop_equip_cd;
	public String incmg_dt;
	public String intg_dlco_cd;
	public String dtls_medi_nm;
	public String evnt_nm;

	public FC_ACCT_2473_SCURLISTRecord(){}

	public void setAcct_cd(String acct_cd){
		this.acct_cd = acct_cd;
	}

	public void setAcct_nm(String acct_nm){
		this.acct_nm = acct_nm;
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

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setMedi_nm(String medi_nm){
		this.medi_nm = medi_nm;
	}

	public void setMang_no(String mang_no){
		this.mang_no = mang_no;
	}

	public void setMang_clsf_cd(String mang_clsf_cd){
		this.mang_clsf_cd = mang_clsf_cd;
	}

	public void setMang_clsf_nm(String mang_clsf_nm){
		this.mang_clsf_nm = mang_clsf_nm;
	}

	public void setBank_cd(String bank_cd){
		this.bank_cd = bank_cd;
	}

	public void setBank_nm(String bank_nm){
		this.bank_nm = bank_nm;
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

	public void setUse_dept_cd(String use_dept_cd){
		this.use_dept_cd = use_dept_cd;
	}

	public void setUse_dept_nm(String use_dept_nm){
		this.use_dept_nm = use_dept_nm;
	}

	public void setObj_acct_cd(String obj_acct_cd){
		this.obj_acct_cd = obj_acct_cd;
	}

	public void setObj_acct_nm(String obj_acct_nm){
		this.obj_acct_nm = obj_acct_nm;
	}

	public void setObj_amt(String obj_amt){
		this.obj_amt = obj_amt;
	}

	public void setNote_stat(String note_stat){
		this.note_stat = note_stat;
	}

	public void setNote_stat_nm(String note_stat_nm){
		this.note_stat_nm = note_stat_nm;
	}

	public void setFrcr_clsf_cd(String frcr_clsf_cd){
		this.frcr_clsf_cd = frcr_clsf_cd;
	}

	public void setExrate(String exrate){
		this.exrate = exrate;
	}

	public void setFrcr_amt(String frcr_amt){
		this.frcr_amt = frcr_amt;
	}

	public void setObj_dt(String obj_dt){
		this.obj_dt = obj_dt;
	}

	public void setDtls_medi_cd(String dtls_medi_cd){
		this.dtls_medi_cd = dtls_medi_cd;
	}

	public void setEvnt_cd(String evnt_cd){
		this.evnt_cd = evnt_cd;
	}

	public void setProp_equip_cd(String prop_equip_cd){
		this.prop_equip_cd = prop_equip_cd;
	}

	public void setIncmg_dt(String incmg_dt){
		this.incmg_dt = incmg_dt;
	}

	public void setIntg_dlco_cd(String intg_dlco_cd){
		this.intg_dlco_cd = intg_dlco_cd;
	}

	public void setDtls_medi_nm(String dtls_medi_nm){
		this.dtls_medi_nm = dtls_medi_nm;
	}

	public void setEvnt_nm(String evnt_nm){
		this.evnt_nm = evnt_nm;
	}

	public String getAcct_cd(){
		return this.acct_cd;
	}

	public String getAcct_nm(){
		return this.acct_nm;
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

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getMedi_nm(){
		return this.medi_nm;
	}

	public String getMang_no(){
		return this.mang_no;
	}

	public String getMang_clsf_cd(){
		return this.mang_clsf_cd;
	}

	public String getMang_clsf_nm(){
		return this.mang_clsf_nm;
	}

	public String getBank_cd(){
		return this.bank_cd;
	}

	public String getBank_nm(){
		return this.bank_nm;
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

	public String getUse_dept_cd(){
		return this.use_dept_cd;
	}

	public String getUse_dept_nm(){
		return this.use_dept_nm;
	}

	public String getObj_acct_cd(){
		return this.obj_acct_cd;
	}

	public String getObj_acct_nm(){
		return this.obj_acct_nm;
	}

	public String getObj_amt(){
		return this.obj_amt;
	}

	public String getNote_stat(){
		return this.note_stat;
	}

	public String getNote_stat_nm(){
		return this.note_stat_nm;
	}

	public String getFrcr_clsf_cd(){
		return this.frcr_clsf_cd;
	}

	public String getExrate(){
		return this.exrate;
	}

	public String getFrcr_amt(){
		return this.frcr_amt;
	}

	public String getObj_dt(){
		return this.obj_dt;
	}

	public String getDtls_medi_cd(){
		return this.dtls_medi_cd;
	}

	public String getEvnt_cd(){
		return this.evnt_cd;
	}

	public String getProp_equip_cd(){
		return this.prop_equip_cd;
	}

	public String getIncmg_dt(){
		return this.incmg_dt;
	}

	public String getIntg_dlco_cd(){
		return this.intg_dlco_cd;
	}

	public String getDtls_medi_nm(){
		return this.dtls_medi_nm;
	}

	public String getEvnt_nm(){
		return this.evnt_nm;
	}
}

/* 작성시간 : Wed Jun 24 11:11:48 KST 2009 */
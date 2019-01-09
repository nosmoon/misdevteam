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


public class FC_ACCT_2382_LCURLIST1Record extends java.lang.Object implements java.io.Serializable{

	public String slip_arow_no;
	public String budg_cd;
	public String budg_nm;
	public String drcr_clsf;
	public String dr_amt;
	public String crdt_amt;
	public String intg_dlco_cd;
	public String dlco_clsf_cd;
	public String dlco_cd;
	public String dlco_nm;
	public String boks_dlco_nm;
	public String mang_clsf_cd;
	public String mang_no;
	public String incm_clsf_cd;
	public String medi_cd;
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
	public String obj_acct_cd;
	public String obj_acct_nm;
	public String obj_dt;
	public String obj_amt;
	public String rmks1;
	public String rmks2;
	public String etc_in;
	public String use_dept_cd;
	public String use_dept_nm;
	public String prop_equip_cd;

	public FC_ACCT_2382_LCURLIST1Record(){}

	public void setSlip_arow_no(String slip_arow_no){
		this.slip_arow_no = slip_arow_no;
	}

	public void setBudg_cd(String budg_cd){
		this.budg_cd = budg_cd;
	}

	public void setBudg_nm(String budg_nm){
		this.budg_nm = budg_nm;
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

	public void setIntg_dlco_cd(String intg_dlco_cd){
		this.intg_dlco_cd = intg_dlco_cd;
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

	public void setObj_acct_cd(String obj_acct_cd){
		this.obj_acct_cd = obj_acct_cd;
	}

	public void setObj_acct_nm(String obj_acct_nm){
		this.obj_acct_nm = obj_acct_nm;
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

	public void setEtc_in(String etc_in){
		this.etc_in = etc_in;
	}

	public void setUse_dept_cd(String use_dept_cd){
		this.use_dept_cd = use_dept_cd;
	}

	public void setUse_dept_nm(String use_dept_nm){
		this.use_dept_nm = use_dept_nm;
	}

	public void setProp_equip_cd(String prop_equip_cd){
		this.prop_equip_cd = prop_equip_cd;
	}

	public String getSlip_arow_no(){
		return this.slip_arow_no;
	}

	public String getBudg_cd(){
		return this.budg_cd;
	}

	public String getBudg_nm(){
		return this.budg_nm;
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

	public String getIntg_dlco_cd(){
		return this.intg_dlco_cd;
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

	public String getObj_acct_cd(){
		return this.obj_acct_cd;
	}

	public String getObj_acct_nm(){
		return this.obj_acct_nm;
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

	public String getEtc_in(){
		return this.etc_in;
	}

	public String getUse_dept_cd(){
		return this.use_dept_cd;
	}

	public String getUse_dept_nm(){
		return this.use_dept_nm;
	}

	public String getProp_equip_cd(){
		return this.prop_equip_cd;
	}
}

/* 작성시간 : Wed Feb 25 12:04:52 KST 2009 */
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


public class FC_ACCT_2171_LTAX_STMTLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String chk;
	public String prof_type_cd;
	public String prof_type_nm;
	public String slip_clsf_cd;
	public String slip_clsf_nm;
	public String slip_occr_dt;
	public String slip_seq;
	public String dlco_cd;
	public String dlco_nm;
	public String presi_nm;
	public String suply_amt;
	public String vat_amt;
	public String fisc_dt;
	public String issu_tms;
	public String issu_pers_emp_no;
	public String issu_pers_emp_nm;
	public String budg_cd;
	public String tax_stmt_aprv_yn;
	public String ask_dept_cd;
	public String slip_rcpm_dt;
	public String transmission_yn;
	public String tax_stmt;
	public String broker_issu_yn;
	public String make_dt;
	public String item;

	public FC_ACCT_2171_LTAX_STMTLISTRecord(){}

	public void setChk(String chk){
		this.chk = chk;
	}

	public void setProf_type_cd(String prof_type_cd){
		this.prof_type_cd = prof_type_cd;
	}

	public void setProf_type_nm(String prof_type_nm){
		this.prof_type_nm = prof_type_nm;
	}

	public void setSlip_clsf_cd(String slip_clsf_cd){
		this.slip_clsf_cd = slip_clsf_cd;
	}

	public void setSlip_clsf_nm(String slip_clsf_nm){
		this.slip_clsf_nm = slip_clsf_nm;
	}

	public void setSlip_occr_dt(String slip_occr_dt){
		this.slip_occr_dt = slip_occr_dt;
	}

	public void setSlip_seq(String slip_seq){
		this.slip_seq = slip_seq;
	}

	public void setDlco_cd(String dlco_cd){
		this.dlco_cd = dlco_cd;
	}

	public void setDlco_nm(String dlco_nm){
		this.dlco_nm = dlco_nm;
	}

	public void setPresi_nm(String presi_nm){
		this.presi_nm = presi_nm;
	}

	public void setSuply_amt(String suply_amt){
		this.suply_amt = suply_amt;
	}

	public void setVat_amt(String vat_amt){
		this.vat_amt = vat_amt;
	}

	public void setFisc_dt(String fisc_dt){
		this.fisc_dt = fisc_dt;
	}

	public void setIssu_tms(String issu_tms){
		this.issu_tms = issu_tms;
	}

	public void setIssu_pers_emp_no(String issu_pers_emp_no){
		this.issu_pers_emp_no = issu_pers_emp_no;
	}

	public void setIssu_pers_emp_nm(String issu_pers_emp_nm){
		this.issu_pers_emp_nm = issu_pers_emp_nm;
	}

	public void setBudg_cd(String budg_cd){
		this.budg_cd = budg_cd;
	}

	public void setTax_stmt_aprv_yn(String tax_stmt_aprv_yn){
		this.tax_stmt_aprv_yn = tax_stmt_aprv_yn;
	}

	public void setAsk_dept_cd(String ask_dept_cd){
		this.ask_dept_cd = ask_dept_cd;
	}

	public void setSlip_rcpm_dt(String slip_rcpm_dt){
		this.slip_rcpm_dt = slip_rcpm_dt;
	}

	public void setTransmission_yn(String transmission_yn){
		this.transmission_yn = transmission_yn;
	}

	public void setTax_stmt(String tax_stmt){
		this.tax_stmt = tax_stmt;
	}

	public void setBroker_issu_yn(String broker_issu_yn){
		this.broker_issu_yn = broker_issu_yn;
	}

	public void setMake_dt(String make_dt){
		this.make_dt = make_dt;
	}

	public void setItem(String item){
		this.item = item;
	}

	public String getChk(){
		return this.chk;
	}

	public String getProf_type_cd(){
		return this.prof_type_cd;
	}

	public String getProf_type_nm(){
		return this.prof_type_nm;
	}

	public String getSlip_clsf_cd(){
		return this.slip_clsf_cd;
	}

	public String getSlip_clsf_nm(){
		return this.slip_clsf_nm;
	}

	public String getSlip_occr_dt(){
		return this.slip_occr_dt;
	}

	public String getSlip_seq(){
		return this.slip_seq;
	}

	public String getDlco_cd(){
		return this.dlco_cd;
	}

	public String getDlco_nm(){
		return this.dlco_nm;
	}

	public String getPresi_nm(){
		return this.presi_nm;
	}

	public String getSuply_amt(){
		return this.suply_amt;
	}

	public String getVat_amt(){
		return this.vat_amt;
	}

	public String getFisc_dt(){
		return this.fisc_dt;
	}

	public String getIssu_tms(){
		return this.issu_tms;
	}

	public String getIssu_pers_emp_no(){
		return this.issu_pers_emp_no;
	}

	public String getIssu_pers_emp_nm(){
		return this.issu_pers_emp_nm;
	}

	public String getBudg_cd(){
		return this.budg_cd;
	}

	public String getTax_stmt_aprv_yn(){
		return this.tax_stmt_aprv_yn;
	}

	public String getAsk_dept_cd(){
		return this.ask_dept_cd;
	}

	public String getSlip_rcpm_dt(){
		return this.slip_rcpm_dt;
	}

	public String getTransmission_yn(){
		return this.transmission_yn;
	}

	public String getTax_stmt(){
		return this.tax_stmt;
	}

	public String getBroker_issu_yn(){
		return this.broker_issu_yn;
	}

	public String getMake_dt(){
		return this.make_dt;
	}

	public String getItem(){
		return this.item;
	}
}

/* 작성시간 : Tue Aug 11 14:12:17 KST 2015 */
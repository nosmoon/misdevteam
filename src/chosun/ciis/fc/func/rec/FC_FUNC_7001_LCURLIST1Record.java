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


package chosun.ciis.fc.func.rec;

import java.sql.*;
import chosun.ciis.fc.func.dm.*;
import chosun.ciis.fc.func.ds.*;

/**
 * 
 */


public class FC_FUNC_7001_LCURLIST1Record extends java.lang.Object implements java.io.Serializable{

	public String cmpy_cd;
	public String loan_nm;
	public String loan_amt;
	public String comp_dt;
	public String mtry_dt;
	public String loan_repay_clsf_cd;
	public String int_clsf_cd;
	public String dlco_clsf_cd;
	public String dlco_cd;
	public String loan_slip_no;
	public String loan_slip_occr_dt;
	public String loan_slip_clsf_cd;
	public String loan_slip_seq;
	public String loan_slip_sub_seq;
	public String loan_slip_arow_no;
	public String loan_patr_budg_cd;
	public String loan_deps_clsf_cd;
	public String colt_note_no;
	public String loan_rmks;
	public String prelae_pay_clsf_cd;
	public String dlco_nm;
	public String loan_repay_clsf_nm;
	public String int_rate;
	public String int_amt;

	public FC_FUNC_7001_LCURLIST1Record(){}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setLoan_nm(String loan_nm){
		this.loan_nm = loan_nm;
	}

	public void setLoan_amt(String loan_amt){
		this.loan_amt = loan_amt;
	}

	public void setComp_dt(String comp_dt){
		this.comp_dt = comp_dt;
	}

	public void setMtry_dt(String mtry_dt){
		this.mtry_dt = mtry_dt;
	}

	public void setLoan_repay_clsf_cd(String loan_repay_clsf_cd){
		this.loan_repay_clsf_cd = loan_repay_clsf_cd;
	}

	public void setInt_clsf_cd(String int_clsf_cd){
		this.int_clsf_cd = int_clsf_cd;
	}

	public void setDlco_clsf_cd(String dlco_clsf_cd){
		this.dlco_clsf_cd = dlco_clsf_cd;
	}

	public void setDlco_cd(String dlco_cd){
		this.dlco_cd = dlco_cd;
	}

	public void setLoan_slip_no(String loan_slip_no){
		this.loan_slip_no = loan_slip_no;
	}

	public void setLoan_slip_occr_dt(String loan_slip_occr_dt){
		this.loan_slip_occr_dt = loan_slip_occr_dt;
	}

	public void setLoan_slip_clsf_cd(String loan_slip_clsf_cd){
		this.loan_slip_clsf_cd = loan_slip_clsf_cd;
	}

	public void setLoan_slip_seq(String loan_slip_seq){
		this.loan_slip_seq = loan_slip_seq;
	}

	public void setLoan_slip_sub_seq(String loan_slip_sub_seq){
		this.loan_slip_sub_seq = loan_slip_sub_seq;
	}

	public void setLoan_slip_arow_no(String loan_slip_arow_no){
		this.loan_slip_arow_no = loan_slip_arow_no;
	}

	public void setLoan_patr_budg_cd(String loan_patr_budg_cd){
		this.loan_patr_budg_cd = loan_patr_budg_cd;
	}

	public void setLoan_deps_clsf_cd(String loan_deps_clsf_cd){
		this.loan_deps_clsf_cd = loan_deps_clsf_cd;
	}

	public void setColt_note_no(String colt_note_no){
		this.colt_note_no = colt_note_no;
	}

	public void setLoan_rmks(String loan_rmks){
		this.loan_rmks = loan_rmks;
	}

	public void setPrelae_pay_clsf_cd(String prelae_pay_clsf_cd){
		this.prelae_pay_clsf_cd = prelae_pay_clsf_cd;
	}

	public void setDlco_nm(String dlco_nm){
		this.dlco_nm = dlco_nm;
	}

	public void setLoan_repay_clsf_nm(String loan_repay_clsf_nm){
		this.loan_repay_clsf_nm = loan_repay_clsf_nm;
	}

	public void setInt_rate(String int_rate){
		this.int_rate = int_rate;
	}

	public void setInt_amt(String int_amt){
		this.int_amt = int_amt;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getLoan_nm(){
		return this.loan_nm;
	}

	public String getLoan_amt(){
		return this.loan_amt;
	}

	public String getComp_dt(){
		return this.comp_dt;
	}

	public String getMtry_dt(){
		return this.mtry_dt;
	}

	public String getLoan_repay_clsf_cd(){
		return this.loan_repay_clsf_cd;
	}

	public String getInt_clsf_cd(){
		return this.int_clsf_cd;
	}

	public String getDlco_clsf_cd(){
		return this.dlco_clsf_cd;
	}

	public String getDlco_cd(){
		return this.dlco_cd;
	}

	public String getLoan_slip_no(){
		return this.loan_slip_no;
	}

	public String getLoan_slip_occr_dt(){
		return this.loan_slip_occr_dt;
	}

	public String getLoan_slip_clsf_cd(){
		return this.loan_slip_clsf_cd;
	}

	public String getLoan_slip_seq(){
		return this.loan_slip_seq;
	}

	public String getLoan_slip_sub_seq(){
		return this.loan_slip_sub_seq;
	}

	public String getLoan_slip_arow_no(){
		return this.loan_slip_arow_no;
	}

	public String getLoan_patr_budg_cd(){
		return this.loan_patr_budg_cd;
	}

	public String getLoan_deps_clsf_cd(){
		return this.loan_deps_clsf_cd;
	}

	public String getColt_note_no(){
		return this.colt_note_no;
	}

	public String getLoan_rmks(){
		return this.loan_rmks;
	}

	public String getPrelae_pay_clsf_cd(){
		return this.prelae_pay_clsf_cd;
	}

	public String getDlco_nm(){
		return this.dlco_nm;
	}

	public String getLoan_repay_clsf_nm(){
		return this.loan_repay_clsf_nm;
	}

	public String getInt_rate(){
		return this.int_rate;
	}

	public String getInt_amt(){
		return this.int_amt;
	}
}

/* 작성시간 : Wed Apr 01 14:58:11 KST 2009 */
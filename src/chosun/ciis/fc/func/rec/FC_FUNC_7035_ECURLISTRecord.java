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


public class FC_FUNC_7035_ECURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String loan_nm;
	public String loan_amt;
	public String comp_dt;
	public String mtry_dt;
	public String dlco_clsf_cd;
	public String dlco_cd;
	public String int_clsf_cd;
	public String loan_rmks;
	public String loan_slip_occr_dt;
	public String loan_slip_clsf_cd;
	public String loan_slip_seq;
	public String loan_repay_clsf_cd;
	public String compgbnm;
	public String compnm;
	public String intgbnm;
	public String cishgbnm;
	public String int_rate;

	public FC_FUNC_7035_ECURLISTRecord(){}

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

	public void setDlco_clsf_cd(String dlco_clsf_cd){
		this.dlco_clsf_cd = dlco_clsf_cd;
	}

	public void setDlco_cd(String dlco_cd){
		this.dlco_cd = dlco_cd;
	}

	public void setInt_clsf_cd(String int_clsf_cd){
		this.int_clsf_cd = int_clsf_cd;
	}

	public void setLoan_rmks(String loan_rmks){
		this.loan_rmks = loan_rmks;
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

	public void setLoan_repay_clsf_cd(String loan_repay_clsf_cd){
		this.loan_repay_clsf_cd = loan_repay_clsf_cd;
	}

	public void setCompgbnm(String compgbnm){
		this.compgbnm = compgbnm;
	}

	public void setCompnm(String compnm){
		this.compnm = compnm;
	}

	public void setIntgbnm(String intgbnm){
		this.intgbnm = intgbnm;
	}

	public void setCishgbnm(String cishgbnm){
		this.cishgbnm = cishgbnm;
	}

	public void setInt_rate(String int_rate){
		this.int_rate = int_rate;
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

	public String getDlco_clsf_cd(){
		return this.dlco_clsf_cd;
	}

	public String getDlco_cd(){
		return this.dlco_cd;
	}

	public String getInt_clsf_cd(){
		return this.int_clsf_cd;
	}

	public String getLoan_rmks(){
		return this.loan_rmks;
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

	public String getLoan_repay_clsf_cd(){
		return this.loan_repay_clsf_cd;
	}

	public String getCompgbnm(){
		return this.compgbnm;
	}

	public String getCompnm(){
		return this.compnm;
	}

	public String getIntgbnm(){
		return this.intgbnm;
	}

	public String getCishgbnm(){
		return this.cishgbnm;
	}

	public String getInt_rate(){
		return this.int_rate;
	}
}

/* 작성시간 : Tue Apr 07 11:13:48 KST 2009 */
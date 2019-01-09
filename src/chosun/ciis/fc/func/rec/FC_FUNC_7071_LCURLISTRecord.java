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


public class FC_FUNC_7071_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String checked;
	public String fund_mang_no;
	public String loan_no;
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
	public String dlco_clsf_nm;
	public String dlco_nm;
	public String int_clsf_nm;
	public String loan_repay_clsf_nm;
	public String prelae_pay_clsf_cd;
	public String prelae_pay_clsfnm;
	public String cost_gain_stot;
	public String rcpay_amt_stot;
	public String rest_amt;
	public String repay_dt;
	public String repay_amt;
	public String repay_rmks;
	public String repay_slip_occr_dt;
	public String repay_slip_clsf_cd;
	public String repay_slip_seq;
	public String nomach_adpay_bal;
	public String cmpy_cd;

	public FC_FUNC_7071_LCURLISTRecord(){}

	public void setChecked(String checked){
		this.checked = checked;
	}

	public void setFund_mang_no(String fund_mang_no){
		this.fund_mang_no = fund_mang_no;
	}

	public void setLoan_no(String loan_no){
		this.loan_no = loan_no;
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

	public void setDlco_clsf_nm(String dlco_clsf_nm){
		this.dlco_clsf_nm = dlco_clsf_nm;
	}

	public void setDlco_nm(String dlco_nm){
		this.dlco_nm = dlco_nm;
	}

	public void setInt_clsf_nm(String int_clsf_nm){
		this.int_clsf_nm = int_clsf_nm;
	}

	public void setLoan_repay_clsf_nm(String loan_repay_clsf_nm){
		this.loan_repay_clsf_nm = loan_repay_clsf_nm;
	}

	public void setPrelae_pay_clsf_cd(String prelae_pay_clsf_cd){
		this.prelae_pay_clsf_cd = prelae_pay_clsf_cd;
	}

	public void setPrelae_pay_clsfnm(String prelae_pay_clsfnm){
		this.prelae_pay_clsfnm = prelae_pay_clsfnm;
	}

	public void setCost_gain_stot(String cost_gain_stot){
		this.cost_gain_stot = cost_gain_stot;
	}

	public void setRcpay_amt_stot(String rcpay_amt_stot){
		this.rcpay_amt_stot = rcpay_amt_stot;
	}

	public void setRest_amt(String rest_amt){
		this.rest_amt = rest_amt;
	}

	public void setRepay_dt(String repay_dt){
		this.repay_dt = repay_dt;
	}

	public void setRepay_amt(String repay_amt){
		this.repay_amt = repay_amt;
	}

	public void setRepay_rmks(String repay_rmks){
		this.repay_rmks = repay_rmks;
	}

	public void setRepay_slip_occr_dt(String repay_slip_occr_dt){
		this.repay_slip_occr_dt = repay_slip_occr_dt;
	}

	public void setRepay_slip_clsf_cd(String repay_slip_clsf_cd){
		this.repay_slip_clsf_cd = repay_slip_clsf_cd;
	}

	public void setRepay_slip_seq(String repay_slip_seq){
		this.repay_slip_seq = repay_slip_seq;
	}

	public void setNomach_adpay_bal(String nomach_adpay_bal){
		this.nomach_adpay_bal = nomach_adpay_bal;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public String getChecked(){
		return this.checked;
	}

	public String getFund_mang_no(){
		return this.fund_mang_no;
	}

	public String getLoan_no(){
		return this.loan_no;
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

	public String getDlco_clsf_nm(){
		return this.dlco_clsf_nm;
	}

	public String getDlco_nm(){
		return this.dlco_nm;
	}

	public String getInt_clsf_nm(){
		return this.int_clsf_nm;
	}

	public String getLoan_repay_clsf_nm(){
		return this.loan_repay_clsf_nm;
	}

	public String getPrelae_pay_clsf_cd(){
		return this.prelae_pay_clsf_cd;
	}

	public String getPrelae_pay_clsfnm(){
		return this.prelae_pay_clsfnm;
	}

	public String getCost_gain_stot(){
		return this.cost_gain_stot;
	}

	public String getRcpay_amt_stot(){
		return this.rcpay_amt_stot;
	}

	public String getRest_amt(){
		return this.rest_amt;
	}

	public String getRepay_dt(){
		return this.repay_dt;
	}

	public String getRepay_amt(){
		return this.repay_amt;
	}

	public String getRepay_rmks(){
		return this.repay_rmks;
	}

	public String getRepay_slip_occr_dt(){
		return this.repay_slip_occr_dt;
	}

	public String getRepay_slip_clsf_cd(){
		return this.repay_slip_clsf_cd;
	}

	public String getRepay_slip_seq(){
		return this.repay_slip_seq;
	}

	public String getNomach_adpay_bal(){
		return this.nomach_adpay_bal;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}
}

/* 작성시간 : Wed Apr 08 19:04:26 KST 2009 */
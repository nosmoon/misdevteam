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


public class FC_ACCT_8001_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String incm_clsf_cd;
	public String slip;
	public String slip_occr_dt;
	public String slip_clsf_cd;
	public String slip_seq;
	public String slip_sub_seq;
	public String slip_arow_no;
	public String pay_tot_amt;
	public String need_cost;
	public String incm_amt;
	public String rate;
	public String incm_tax;
	public String res_tax;
	public String use_dept_cd;
	public String incm_pers;
	public String incm_pers_prn;
	public String incm_pers_addr;
	public String budg_cd;
	public String dlco_clsf_cd;
	public String dlco_cd;
	public String fisc_dt;
	public String setoff_slip_occr_dt;
	public String setoff_slip_clsf_cd;
	public String setoff_slip_seq;
	public String setoff_slip_sub_seq;
	public String setoff_slip_arow_no;
	public String acct_cd;

	public FC_ACCT_8001_LCURLISTRecord(){}

	public void setIncm_clsf_cd(String incm_clsf_cd){
		this.incm_clsf_cd = incm_clsf_cd;
	}

	public void setSlip(String slip){
		this.slip = slip;
	}

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

	public void setPay_tot_amt(String pay_tot_amt){
		this.pay_tot_amt = pay_tot_amt;
	}

	public void setNeed_cost(String need_cost){
		this.need_cost = need_cost;
	}

	public void setIncm_amt(String incm_amt){
		this.incm_amt = incm_amt;
	}

	public void setRate(String rate){
		this.rate = rate;
	}

	public void setIncm_tax(String incm_tax){
		this.incm_tax = incm_tax;
	}

	public void setRes_tax(String res_tax){
		this.res_tax = res_tax;
	}

	public void setUse_dept_cd(String use_dept_cd){
		this.use_dept_cd = use_dept_cd;
	}

	public void setIncm_pers(String incm_pers){
		this.incm_pers = incm_pers;
	}

	public void setIncm_pers_prn(String incm_pers_prn){
		this.incm_pers_prn = incm_pers_prn;
	}

	public void setIncm_pers_addr(String incm_pers_addr){
		this.incm_pers_addr = incm_pers_addr;
	}

	public void setBudg_cd(String budg_cd){
		this.budg_cd = budg_cd;
	}

	public void setDlco_clsf_cd(String dlco_clsf_cd){
		this.dlco_clsf_cd = dlco_clsf_cd;
	}

	public void setDlco_cd(String dlco_cd){
		this.dlco_cd = dlco_cd;
	}

	public void setFisc_dt(String fisc_dt){
		this.fisc_dt = fisc_dt;
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

	public void setAcct_cd(String acct_cd){
		this.acct_cd = acct_cd;
	}

	public String getIncm_clsf_cd(){
		return this.incm_clsf_cd;
	}

	public String getSlip(){
		return this.slip;
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

	public String getPay_tot_amt(){
		return this.pay_tot_amt;
	}

	public String getNeed_cost(){
		return this.need_cost;
	}

	public String getIncm_amt(){
		return this.incm_amt;
	}

	public String getRate(){
		return this.rate;
	}

	public String getIncm_tax(){
		return this.incm_tax;
	}

	public String getRes_tax(){
		return this.res_tax;
	}

	public String getUse_dept_cd(){
		return this.use_dept_cd;
	}

	public String getIncm_pers(){
		return this.incm_pers;
	}

	public String getIncm_pers_prn(){
		return this.incm_pers_prn;
	}

	public String getIncm_pers_addr(){
		return this.incm_pers_addr;
	}

	public String getBudg_cd(){
		return this.budg_cd;
	}

	public String getDlco_clsf_cd(){
		return this.dlco_clsf_cd;
	}

	public String getDlco_cd(){
		return this.dlco_cd;
	}

	public String getFisc_dt(){
		return this.fisc_dt;
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

	public String getAcct_cd(){
		return this.acct_cd;
	}
}

/* 작성시간 : Thu Jul 30 10:21:50 KST 2009 */
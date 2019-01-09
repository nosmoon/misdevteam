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


public class FC_ACCT_3016_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String x;
	public String prelae_pay_clsf_cd;
	public String mang_clsf_cd;
	public String mang_no;
	public String comp_dt;
	public String mtry_dt;
	public String pymt_amt;
	public String cntr_bal;
	public String pymt_cnt;
	public String int_rate;
	public String prvmm_bal;
	public String thmm_dr;
	public String thmm_crdt;
	public String thmm_bal;
	public String slip_no;
	public String slip_sub_seq;
	public String slip_arow_no;
	public String prelae_pay_clsf_cd1;
	public String mang_clsf_cd1;

	public FC_ACCT_3016_LCURLISTRecord(){}

	public void setX(String x){
		this.x = x;
	}

	public void setPrelae_pay_clsf_cd(String prelae_pay_clsf_cd){
		this.prelae_pay_clsf_cd = prelae_pay_clsf_cd;
	}

	public void setMang_clsf_cd(String mang_clsf_cd){
		this.mang_clsf_cd = mang_clsf_cd;
	}

	public void setMang_no(String mang_no){
		this.mang_no = mang_no;
	}

	public void setComp_dt(String comp_dt){
		this.comp_dt = comp_dt;
	}

	public void setMtry_dt(String mtry_dt){
		this.mtry_dt = mtry_dt;
	}

	public void setPymt_amt(String pymt_amt){
		this.pymt_amt = pymt_amt;
	}

	public void setCntr_bal(String cntr_bal){
		this.cntr_bal = cntr_bal;
	}

	public void setPymt_cnt(String pymt_cnt){
		this.pymt_cnt = pymt_cnt;
	}

	public void setInt_rate(String int_rate){
		this.int_rate = int_rate;
	}

	public void setPrvmm_bal(String prvmm_bal){
		this.prvmm_bal = prvmm_bal;
	}

	public void setThmm_dr(String thmm_dr){
		this.thmm_dr = thmm_dr;
	}

	public void setThmm_crdt(String thmm_crdt){
		this.thmm_crdt = thmm_crdt;
	}

	public void setThmm_bal(String thmm_bal){
		this.thmm_bal = thmm_bal;
	}

	public void setSlip_no(String slip_no){
		this.slip_no = slip_no;
	}

	public void setSlip_sub_seq(String slip_sub_seq){
		this.slip_sub_seq = slip_sub_seq;
	}

	public void setSlip_arow_no(String slip_arow_no){
		this.slip_arow_no = slip_arow_no;
	}

	public void setPrelae_pay_clsf_cd1(String prelae_pay_clsf_cd1){
		this.prelae_pay_clsf_cd1 = prelae_pay_clsf_cd1;
	}

	public void setMang_clsf_cd1(String mang_clsf_cd1){
		this.mang_clsf_cd1 = mang_clsf_cd1;
	}

	public String getX(){
		return this.x;
	}

	public String getPrelae_pay_clsf_cd(){
		return this.prelae_pay_clsf_cd;
	}

	public String getMang_clsf_cd(){
		return this.mang_clsf_cd;
	}

	public String getMang_no(){
		return this.mang_no;
	}

	public String getComp_dt(){
		return this.comp_dt;
	}

	public String getMtry_dt(){
		return this.mtry_dt;
	}

	public String getPymt_amt(){
		return this.pymt_amt;
	}

	public String getCntr_bal(){
		return this.cntr_bal;
	}

	public String getPymt_cnt(){
		return this.pymt_cnt;
	}

	public String getInt_rate(){
		return this.int_rate;
	}

	public String getPrvmm_bal(){
		return this.prvmm_bal;
	}

	public String getThmm_dr(){
		return this.thmm_dr;
	}

	public String getThmm_crdt(){
		return this.thmm_crdt;
	}

	public String getThmm_bal(){
		return this.thmm_bal;
	}

	public String getSlip_no(){
		return this.slip_no;
	}

	public String getSlip_sub_seq(){
		return this.slip_sub_seq;
	}

	public String getSlip_arow_no(){
		return this.slip_arow_no;
	}

	public String getPrelae_pay_clsf_cd1(){
		return this.prelae_pay_clsf_cd1;
	}

	public String getMang_clsf_cd1(){
		return this.mang_clsf_cd1;
	}
}

/* 작성시간 : Tue Feb 17 16:28:02 KST 2009 */
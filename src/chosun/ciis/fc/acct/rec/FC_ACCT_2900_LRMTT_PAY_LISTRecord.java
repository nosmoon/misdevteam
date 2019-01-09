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


public class FC_ACCT_2900_LRMTT_PAY_LISTRecord extends java.lang.Object implements java.io.Serializable{

	public String check1;
	public String slip_no;
	public String slip_occr_dt;
	public String slip_clsf_cd;
	public String slip_seq;
	public String slip_sub_seq;
	public String clam_dept;
	public String ptcr;
	public String amt;
	public String src_tax;
	public String calc_amt;
	public String rmtt_cnt;
	public String cmpy_cd;

	public FC_ACCT_2900_LRMTT_PAY_LISTRecord(){}

	public void setCheck1(String check1){
		this.check1 = check1;
	}

	public void setSlip_no(String slip_no){
		this.slip_no = slip_no;
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

	public void setClam_dept(String clam_dept){
		this.clam_dept = clam_dept;
	}

	public void setPtcr(String ptcr){
		this.ptcr = ptcr;
	}

	public void setAmt(String amt){
		this.amt = amt;
	}

	public void setSrc_tax(String src_tax){
		this.src_tax = src_tax;
	}

	public void setCalc_amt(String calc_amt){
		this.calc_amt = calc_amt;
	}

	public void setRmtt_cnt(String rmtt_cnt){
		this.rmtt_cnt = rmtt_cnt;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public String getCheck1(){
		return this.check1;
	}

	public String getSlip_no(){
		return this.slip_no;
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

	public String getClam_dept(){
		return this.clam_dept;
	}

	public String getPtcr(){
		return this.ptcr;
	}

	public String getAmt(){
		return this.amt;
	}

	public String getSrc_tax(){
		return this.src_tax;
	}

	public String getCalc_amt(){
		return this.calc_amt;
	}

	public String getRmtt_cnt(){
		return this.rmtt_cnt;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}
}

/* 작성시간 : Thu Jun 18 11:11:53 KST 2009 */
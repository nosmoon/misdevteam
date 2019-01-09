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


public class FC_ACCT_4021_LCURLIST1Record extends java.lang.Object implements java.io.Serializable{

	public String acct_cd;
	public String slip_occr_dt;
	public String slip_clsf_cd;
	public String slip_seq;
	public String slip_sub_seq;
	public String slip_arow_no;
	public String occr_acct_cd;
	public String acctynm;
	public String rmks1;
	public String rmks2;
	public String extnc_acct_cd;
	public String occr_amt;
	public String adjm_amt;

	public FC_ACCT_4021_LCURLIST1Record(){}

	public void setAcct_cd(String acct_cd){
		this.acct_cd = acct_cd;
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

	public void setOccr_acct_cd(String occr_acct_cd){
		this.occr_acct_cd = occr_acct_cd;
	}

	public void setAcctynm(String acctynm){
		this.acctynm = acctynm;
	}

	public void setRmks1(String rmks1){
		this.rmks1 = rmks1;
	}

	public void setRmks2(String rmks2){
		this.rmks2 = rmks2;
	}

	public void setExtnc_acct_cd(String extnc_acct_cd){
		this.extnc_acct_cd = extnc_acct_cd;
	}

	public void setOccr_amt(String occr_amt){
		this.occr_amt = occr_amt;
	}

	public void setAdjm_amt(String adjm_amt){
		this.adjm_amt = adjm_amt;
	}

	public String getAcct_cd(){
		return this.acct_cd;
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

	public String getOccr_acct_cd(){
		return this.occr_acct_cd;
	}

	public String getAcctynm(){
		return this.acctynm;
	}

	public String getRmks1(){
		return this.rmks1;
	}

	public String getRmks2(){
		return this.rmks2;
	}

	public String getExtnc_acct_cd(){
		return this.extnc_acct_cd;
	}

	public String getOccr_amt(){
		return this.occr_amt;
	}

	public String getAdjm_amt(){
		return this.adjm_amt;
	}
}

/* 작성시간 : Fri Jul 03 11:19:26 KST 2009 */
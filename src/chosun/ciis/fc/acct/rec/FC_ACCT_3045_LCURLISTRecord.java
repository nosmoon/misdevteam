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


public class FC_ACCT_3045_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String x;
	public String prelae_pay_clsf_cd;
	public String mang_clsf_cd;
	public String mang_no;
	public String comp_dt;
	public String mtry_dt;
	public String won_amt;
	public String dds;
	public String pymt_dt;
	public String prvmm_bal;
	public String thmm_dr;
	public String thmm_crdt;
	public String thmm_bal;
	public String prelae_pay_clsf_cd1;
	public String mang_clsf_cd1;
	public String pch_count;

	public FC_ACCT_3045_LCURLISTRecord(){}

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

	public void setWon_amt(String won_amt){
		this.won_amt = won_amt;
	}

	public void setDds(String dds){
		this.dds = dds;
	}

	public void setPymt_dt(String pymt_dt){
		this.pymt_dt = pymt_dt;
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

	public void setPrelae_pay_clsf_cd1(String prelae_pay_clsf_cd1){
		this.prelae_pay_clsf_cd1 = prelae_pay_clsf_cd1;
	}

	public void setMang_clsf_cd1(String mang_clsf_cd1){
		this.mang_clsf_cd1 = mang_clsf_cd1;
	}

	public void setPch_count(String pch_count){
		this.pch_count = pch_count;
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

	public String getWon_amt(){
		return this.won_amt;
	}

	public String getDds(){
		return this.dds;
	}

	public String getPymt_dt(){
		return this.pymt_dt;
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

	public String getPrelae_pay_clsf_cd1(){
		return this.prelae_pay_clsf_cd1;
	}

	public String getMang_clsf_cd1(){
		return this.mang_clsf_cd1;
	}

	public String getPch_count(){
		return this.pch_count;
	}
}

/* 작성시간 : Tue Feb 10 20:39:07 KST 2009 */
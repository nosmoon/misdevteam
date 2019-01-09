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


public class FC_ACCT_1091_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String note_amt_llmt;
	public String note_amt_hlmt;
	public String incmg_pers_ipadd;
	public String rem_cash_hlmt;
	public String pay_amt_llmt;
	public String pay_amt_hlmt;
	public String mtrydd_llmt;
	public String mtrydd_hlmt;
	public String mtrymm_llmt;
	public String mtrymm_hlmt;
	public String seq;
	public String chg_dt_tm;
	public String chg_pers;
	public String lump_setoff_excl_yn;

	public FC_ACCT_1091_LCURLISTRecord(){}

	public void setNote_amt_llmt(String note_amt_llmt){
		this.note_amt_llmt = note_amt_llmt;
	}

	public void setNote_amt_hlmt(String note_amt_hlmt){
		this.note_amt_hlmt = note_amt_hlmt;
	}

	public void setIncmg_pers_ipadd(String incmg_pers_ipadd){
		this.incmg_pers_ipadd = incmg_pers_ipadd;
	}

	public void setRem_cash_hlmt(String rem_cash_hlmt){
		this.rem_cash_hlmt = rem_cash_hlmt;
	}

	public void setPay_amt_llmt(String pay_amt_llmt){
		this.pay_amt_llmt = pay_amt_llmt;
	}

	public void setPay_amt_hlmt(String pay_amt_hlmt){
		this.pay_amt_hlmt = pay_amt_hlmt;
	}

	public void setMtrydd_llmt(String mtrydd_llmt){
		this.mtrydd_llmt = mtrydd_llmt;
	}

	public void setMtrydd_hlmt(String mtrydd_hlmt){
		this.mtrydd_hlmt = mtrydd_hlmt;
	}

	public void setMtrymm_llmt(String mtrymm_llmt){
		this.mtrymm_llmt = mtrymm_llmt;
	}

	public void setMtrymm_hlmt(String mtrymm_hlmt){
		this.mtrymm_hlmt = mtrymm_hlmt;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setChg_dt_tm(String chg_dt_tm){
		this.chg_dt_tm = chg_dt_tm;
	}

	public void setChg_pers(String chg_pers){
		this.chg_pers = chg_pers;
	}

	public void setLump_setoff_excl_yn(String lump_setoff_excl_yn){
		this.lump_setoff_excl_yn = lump_setoff_excl_yn;
	}

	public String getNote_amt_llmt(){
		return this.note_amt_llmt;
	}

	public String getNote_amt_hlmt(){
		return this.note_amt_hlmt;
	}

	public String getIncmg_pers_ipadd(){
		return this.incmg_pers_ipadd;
	}

	public String getRem_cash_hlmt(){
		return this.rem_cash_hlmt;
	}

	public String getPay_amt_llmt(){
		return this.pay_amt_llmt;
	}

	public String getPay_amt_hlmt(){
		return this.pay_amt_hlmt;
	}

	public String getMtrydd_llmt(){
		return this.mtrydd_llmt;
	}

	public String getMtrydd_hlmt(){
		return this.mtrydd_hlmt;
	}

	public String getMtrymm_llmt(){
		return this.mtrymm_llmt;
	}

	public String getMtrymm_hlmt(){
		return this.mtrymm_hlmt;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getChg_dt_tm(){
		return this.chg_dt_tm;
	}

	public String getChg_pers(){
		return this.chg_pers;
	}

	public String getLump_setoff_excl_yn(){
		return this.lump_setoff_excl_yn;
	}
}

/* 작성시간 : Thu Mar 05 09:58:14 KST 2009 */
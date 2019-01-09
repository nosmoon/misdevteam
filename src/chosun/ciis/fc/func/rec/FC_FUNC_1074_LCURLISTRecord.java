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


public class FC_FUNC_1074_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String slip_no;
	public String mtry_dt;
	public String note_amt;
	public String bank_cd;
	public String note_no;
	public String note_seq;
	public String stat_dt;
	public String slip_occr_dt;
	public String slip_clsf_cd;
	public String slip_seq;

	public FC_FUNC_1074_LCURLISTRecord(){}

	public void setSlip_no(String slip_no){
		this.slip_no = slip_no;
	}

	public void setMtry_dt(String mtry_dt){
		this.mtry_dt = mtry_dt;
	}

	public void setNote_amt(String note_amt){
		this.note_amt = note_amt;
	}

	public void setBank_cd(String bank_cd){
		this.bank_cd = bank_cd;
	}

	public void setNote_no(String note_no){
		this.note_no = note_no;
	}

	public void setNote_seq(String note_seq){
		this.note_seq = note_seq;
	}

	public void setStat_dt(String stat_dt){
		this.stat_dt = stat_dt;
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

	public String getSlip_no(){
		return this.slip_no;
	}

	public String getMtry_dt(){
		return this.mtry_dt;
	}

	public String getNote_amt(){
		return this.note_amt;
	}

	public String getBank_cd(){
		return this.bank_cd;
	}

	public String getNote_no(){
		return this.note_no;
	}

	public String getNote_seq(){
		return this.note_seq;
	}

	public String getStat_dt(){
		return this.stat_dt;
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
}

/* 작성시간 : Wed Feb 18 14:18:24 KST 2009 */
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


public class FC_FUNC_1112_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String tms;
	public String rcpay_dt;
	public String rcpay_amt;
	public String bank_cd;
	public String note_no;
	public String note_seq;

	public FC_FUNC_1112_LCURLISTRecord(){}

	public void setTms(String tms){
		this.tms = tms;
	}

	public void setRcpay_dt(String rcpay_dt){
		this.rcpay_dt = rcpay_dt;
	}

	public void setRcpay_amt(String rcpay_amt){
		this.rcpay_amt = rcpay_amt;
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

	public String getTms(){
		return this.tms;
	}

	public String getRcpay_dt(){
		return this.rcpay_dt;
	}

	public String getRcpay_amt(){
		return this.rcpay_amt;
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
}

/* 작성시간 : Thu Feb 26 14:42:42 KST 2009 */
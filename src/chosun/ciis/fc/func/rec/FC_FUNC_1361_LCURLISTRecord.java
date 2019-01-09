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


public class FC_FUNC_1361_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String note_no;
	public String bank_cd;
	public String note_seq;
	public String comp_dt;
	public String mtry_dt;
	public String note_amt;

	public FC_FUNC_1361_LCURLISTRecord(){}

	public void setNote_no(String note_no){
		this.note_no = note_no;
	}

	public void setBank_cd(String bank_cd){
		this.bank_cd = bank_cd;
	}

	public void setNote_seq(String note_seq){
		this.note_seq = note_seq;
	}

	public void setComp_dt(String comp_dt){
		this.comp_dt = comp_dt;
	}

	public void setMtry_dt(String mtry_dt){
		this.mtry_dt = mtry_dt;
	}

	public void setNote_amt(String note_amt){
		this.note_amt = note_amt;
	}

	public String getNote_no(){
		return this.note_no;
	}

	public String getBank_cd(){
		return this.bank_cd;
	}

	public String getNote_seq(){
		return this.note_seq;
	}

	public String getComp_dt(){
		return this.comp_dt;
	}

	public String getMtry_dt(){
		return this.mtry_dt;
	}

	public String getNote_amt(){
		return this.note_amt;
	}
}

/* 작성시간 : Tue Feb 24 16:34:25 KST 2009 */
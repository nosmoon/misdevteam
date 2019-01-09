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


public class FC_ACCT_1101_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String dlco_clsf;
	public String rem_cash_hlmt;
	public String pay_amt_llmt;
	public String pay_amt_hlmt;
	public String mtrydate;
	public String note_amt_llmt;
	public String note_amt_hlmt;
	public String rem_cash_hlmt1;

	public FC_ACCT_1101_LCURLISTRecord(){}

	public void setDlco_clsf(String dlco_clsf){
		this.dlco_clsf = dlco_clsf;
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

	public void setMtrydate(String mtrydate){
		this.mtrydate = mtrydate;
	}

	public void setNote_amt_llmt(String note_amt_llmt){
		this.note_amt_llmt = note_amt_llmt;
	}

	public void setNote_amt_hlmt(String note_amt_hlmt){
		this.note_amt_hlmt = note_amt_hlmt;
	}

	public void setRem_cash_hlmt1(String rem_cash_hlmt1){
		this.rem_cash_hlmt1 = rem_cash_hlmt1;
	}

	public String getDlco_clsf(){
		return this.dlco_clsf;
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

	public String getMtrydate(){
		return this.mtrydate;
	}

	public String getNote_amt_llmt(){
		return this.note_amt_llmt;
	}

	public String getNote_amt_hlmt(){
		return this.note_amt_hlmt;
	}

	public String getRem_cash_hlmt1(){
		return this.rem_cash_hlmt1;
	}
}

/* 작성시간 : Mon Mar 02 14:46:59 KST 2009 */
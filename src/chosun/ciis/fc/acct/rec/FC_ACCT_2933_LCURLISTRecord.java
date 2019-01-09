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


public class FC_ACCT_2933_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String acct_no;
	public String dlco_nm;
	public String bank_clsf;
	public String amt;
	public String pch_count;

	public FC_ACCT_2933_LCURLISTRecord(){}

	public void setAcct_no(String acct_no){
		this.acct_no = acct_no;
	}

	public void setDlco_nm(String dlco_nm){
		this.dlco_nm = dlco_nm;
	}

	public void setBank_clsf(String bank_clsf){
		this.bank_clsf = bank_clsf;
	}

	public void setAmt(String amt){
		this.amt = amt;
	}

	public void setPch_count(String pch_count){
		this.pch_count = pch_count;
	}

	public String getAcct_no(){
		return this.acct_no;
	}

	public String getDlco_nm(){
		return this.dlco_nm;
	}

	public String getBank_clsf(){
		return this.bank_clsf;
	}

	public String getAmt(){
		return this.amt;
	}

	public String getPch_count(){
		return this.pch_count;
	}
}

/* 작성시간 : Fri Apr 24 17:06:36 KST 2009 */
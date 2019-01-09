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


public class FC_ACCT_2591_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String acct_num;
	public String acct_nm;
	public String mang_num;
	public String tran_remain;
	public String bef_amt;
	public String cha_amt;

	public FC_ACCT_2591_LCURLISTRecord(){}

	public void setAcct_num(String acct_num){
		this.acct_num = acct_num;
	}

	public void setAcct_nm(String acct_nm){
		this.acct_nm = acct_nm;
	}

	public void setMang_num(String mang_num){
		this.mang_num = mang_num;
	}

	public void setTran_remain(String tran_remain){
		this.tran_remain = tran_remain;
	}

	public void setBef_amt(String bef_amt){
		this.bef_amt = bef_amt;
	}

	public void setCha_amt(String cha_amt){
		this.cha_amt = cha_amt;
	}

	public String getAcct_num(){
		return this.acct_num;
	}

	public String getAcct_nm(){
		return this.acct_nm;
	}

	public String getMang_num(){
		return this.mang_num;
	}

	public String getTran_remain(){
		return this.tran_remain;
	}

	public String getBef_amt(){
		return this.bef_amt;
	}

	public String getCha_amt(){
		return this.cha_amt;
	}
}

/* 작성시간 : Mon Feb 13 09:21:13 KST 2012 */
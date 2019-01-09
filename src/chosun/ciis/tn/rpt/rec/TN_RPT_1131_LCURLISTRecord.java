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


package chosun.ciis.tn.rpt.rec;

import java.sql.*;
import chosun.ciis.tn.rpt.dm.*;
import chosun.ciis.tn.rpt.ds.*;

/**
 * 
 */


public class TN_RPT_1131_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String bank_name;
	public String acct_num;
	public String entr_dt;
	public String mtry_dt;
	public String int_rate;
	public String tran_remain;

	public TN_RPT_1131_LCURLISTRecord(){}

	public void setBank_name(String bank_name){
		this.bank_name = bank_name;
	}

	public void setAcct_num(String acct_num){
		this.acct_num = acct_num;
	}

	public void setEntr_dt(String entr_dt){
		this.entr_dt = entr_dt;
	}

	public void setMtry_dt(String mtry_dt){
		this.mtry_dt = mtry_dt;
	}

	public void setInt_rate(String int_rate){
		this.int_rate = int_rate;
	}

	public void setTran_remain(String tran_remain){
		this.tran_remain = tran_remain;
	}

	public String getBank_name(){
		return this.bank_name;
	}

	public String getAcct_num(){
		return this.acct_num;
	}

	public String getEntr_dt(){
		return this.entr_dt;
	}

	public String getMtry_dt(){
		return this.mtry_dt;
	}

	public String getInt_rate(){
		return this.int_rate;
	}

	public String getTran_remain(){
		return this.tran_remain;
	}
}

/* 작성시간 : Tue Aug 30 14:15:06 KST 2016 */
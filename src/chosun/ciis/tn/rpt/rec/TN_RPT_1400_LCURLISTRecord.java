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


public class TN_RPT_1400_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String partitiontype;
	public String paymethodname;
	public String promise_cnt;
	public String promise_price;
	public String payment_cnt;
	public String payment_price;
	public String pymt_rate;

	public TN_RPT_1400_LCURLISTRecord(){}

	public void setPartitiontype(String partitiontype){
		this.partitiontype = partitiontype;
	}

	public void setPaymethodname(String paymethodname){
		this.paymethodname = paymethodname;
	}

	public void setPromise_cnt(String promise_cnt){
		this.promise_cnt = promise_cnt;
	}

	public void setPromise_price(String promise_price){
		this.promise_price = promise_price;
	}

	public void setPayment_cnt(String payment_cnt){
		this.payment_cnt = payment_cnt;
	}

	public void setPayment_price(String payment_price){
		this.payment_price = payment_price;
	}

	public void setPymt_rate(String pymt_rate){
		this.pymt_rate = pymt_rate;
	}

	public String getPartitiontype(){
		return this.partitiontype;
	}

	public String getPaymethodname(){
		return this.paymethodname;
	}

	public String getPromise_cnt(){
		return this.promise_cnt;
	}

	public String getPromise_price(){
		return this.promise_price;
	}

	public String getPayment_cnt(){
		return this.payment_cnt;
	}

	public String getPayment_price(){
		return this.payment_price;
	}

	public String getPymt_rate(){
		return this.pymt_rate;
	}
}

/* 작성시간 : Wed Oct 19 14:41:05 KST 2016 */
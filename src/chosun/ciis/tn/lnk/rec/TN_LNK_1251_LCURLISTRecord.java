/***************************************************************************************************
* 파일명 : .java
* 기능 : 	   
* 작성일자 : 
* 작성자 : 
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.tn.lnk.rec;

import java.sql.*;
import chosun.ciis.tn.lnk.dm.*;
import chosun.ciis.tn.lnk.ds.*;

/**
 * 
 */


public class TN_LNK_1251_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String paymentidx;
	public String receiptidx;
	public String memberidx;
	public String name;
	public String regno;
	public String pay_cd;
	public String payprice;
	public String paydate;
	public String pay_methd_type;
	public String filedata;

	public TN_LNK_1251_LCURLISTRecord(){}

	public void setPaymentidx(String paymentidx){
		this.paymentidx = paymentidx;
	}

	public void setReceiptidx(String receiptidx){
		this.receiptidx = receiptidx;
	}

	public void setMemberidx(String memberidx){
		this.memberidx = memberidx;
	}

	public void setName(String name){
		this.name = name;
	}

	public void setRegno(String regno){
		this.regno = regno;
	}

	public void setPay_cd(String pay_cd){
		this.pay_cd = pay_cd;
	}

	public void setPayprice(String payprice){
		this.payprice = payprice;
	}

	public void setPaydate(String paydate){
		this.paydate = paydate;
	}

	public void setPay_methd_type(String pay_methd_type){
		this.pay_methd_type = pay_methd_type;
	}

	public void setFiledata(String filedata){
		this.filedata = filedata;
	}

	public String getPaymentidx(){
		return this.paymentidx;
	}

	public String getReceiptidx(){
		return this.receiptidx;
	}

	public String getMemberidx(){
		return this.memberidx;
	}

	public String getName(){
		return this.name;
	}

	public String getRegno(){
		return this.regno;
	}

	public String getPay_cd(){
		return this.pay_cd;
	}

	public String getPayprice(){
		return this.payprice;
	}

	public String getPaydate(){
		return this.paydate;
	}

	public String getPay_methd_type(){
		return this.pay_methd_type;
	}

	public String getFiledata(){
		return this.filedata;
	}
}

/* 작성시간 : Mon Jan 09 18:36:01 KST 2017 */
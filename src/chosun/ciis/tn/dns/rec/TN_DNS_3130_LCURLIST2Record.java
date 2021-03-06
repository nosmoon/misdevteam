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


package chosun.ciis.tn.dns.rec;

import java.sql.*;
import chosun.ciis.tn.dns.dm.*;
import chosun.ciis.tn.dns.ds.*;

/**
 * 
 */


public class TN_DNS_3130_LCURLIST2Record extends java.lang.Object implements java.io.Serializable{

	public String receiptbulkissueidx;
	public String issuname;
	public String donatorcategory;
	public String receiptcategory;
	public String price;
	public String memberidx;
	public String membercategorycode;
	public String receiptidx;
	public String name;
	public String paymenttype;
	public String receiptcode;

	public TN_DNS_3130_LCURLIST2Record(){}

	public void setReceiptbulkissueidx(String receiptbulkissueidx){
		this.receiptbulkissueidx = receiptbulkissueidx;
	}

	public void setIssuname(String issuname){
		this.issuname = issuname;
	}

	public void setDonatorcategory(String donatorcategory){
		this.donatorcategory = donatorcategory;
	}

	public void setReceiptcategory(String receiptcategory){
		this.receiptcategory = receiptcategory;
	}

	public void setPrice(String price){
		this.price = price;
	}

	public void setMemberidx(String memberidx){
		this.memberidx = memberidx;
	}

	public void setMembercategorycode(String membercategorycode){
		this.membercategorycode = membercategorycode;
	}

	public void setReceiptidx(String receiptidx){
		this.receiptidx = receiptidx;
	}

	public void setName(String name){
		this.name = name;
	}

	public void setPaymenttype(String paymenttype){
		this.paymenttype = paymenttype;
	}

	public void setReceiptcode(String receiptcode){
		this.receiptcode = receiptcode;
	}

	public String getReceiptbulkissueidx(){
		return this.receiptbulkissueidx;
	}

	public String getIssuname(){
		return this.issuname;
	}

	public String getDonatorcategory(){
		return this.donatorcategory;
	}

	public String getReceiptcategory(){
		return this.receiptcategory;
	}

	public String getPrice(){
		return this.price;
	}

	public String getMemberidx(){
		return this.memberidx;
	}

	public String getMembercategorycode(){
		return this.membercategorycode;
	}

	public String getReceiptidx(){
		return this.receiptidx;
	}

	public String getName(){
		return this.name;
	}

	public String getPaymenttype(){
		return this.paymenttype;
	}

	public String getReceiptcode(){
		return this.receiptcode;
	}
}

/* 작성시간 : Tue Aug 16 17:58:33 KST 2016 */
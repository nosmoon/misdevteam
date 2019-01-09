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


public class TN_RPT_1020_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String receiptidx;
	public String receiptcode;
	public String receiptyear;
	public String issuedate;
	public String receiptname;
	public String name;
	public String isanonymous;
	public String regno;
	public String issuecount;
	public String price;
	public String membertype;
	public String address;
	public String isreissue;
	public String donatorcategory;
	public String receiptcategory;
	public String paymentcount;
	public String mindate;
	public String maxdate;
	public String samepaymentcount;

	public TN_RPT_1020_LCURLISTRecord(){}

	public void setReceiptidx(String receiptidx){
		this.receiptidx = receiptidx;
	}

	public void setReceiptcode(String receiptcode){
		this.receiptcode = receiptcode;
	}

	public void setReceiptyear(String receiptyear){
		this.receiptyear = receiptyear;
	}

	public void setIssuedate(String issuedate){
		this.issuedate = issuedate;
	}

	public void setReceiptname(String receiptname){
		this.receiptname = receiptname;
	}

	public void setName(String name){
		this.name = name;
	}

	public void setIsanonymous(String isanonymous){
		this.isanonymous = isanonymous;
	}

	public void setRegno(String regno){
		this.regno = regno;
	}

	public void setIssuecount(String issuecount){
		this.issuecount = issuecount;
	}

	public void setPrice(String price){
		this.price = price;
	}

	public void setMembertype(String membertype){
		this.membertype = membertype;
	}

	public void setAddress(String address){
		this.address = address;
	}

	public void setIsreissue(String isreissue){
		this.isreissue = isreissue;
	}

	public void setDonatorcategory(String donatorcategory){
		this.donatorcategory = donatorcategory;
	}

	public void setReceiptcategory(String receiptcategory){
		this.receiptcategory = receiptcategory;
	}

	public void setPaymentcount(String paymentcount){
		this.paymentcount = paymentcount;
	}

	public void setMindate(String mindate){
		this.mindate = mindate;
	}

	public void setMaxdate(String maxdate){
		this.maxdate = maxdate;
	}

	public void setSamepaymentcount(String samepaymentcount){
		this.samepaymentcount = samepaymentcount;
	}

	public String getReceiptidx(){
		return this.receiptidx;
	}

	public String getReceiptcode(){
		return this.receiptcode;
	}

	public String getReceiptyear(){
		return this.receiptyear;
	}

	public String getIssuedate(){
		return this.issuedate;
	}

	public String getReceiptname(){
		return this.receiptname;
	}

	public String getName(){
		return this.name;
	}

	public String getIsanonymous(){
		return this.isanonymous;
	}

	public String getRegno(){
		return this.regno;
	}

	public String getIssuecount(){
		return this.issuecount;
	}

	public String getPrice(){
		return this.price;
	}

	public String getMembertype(){
		return this.membertype;
	}

	public String getAddress(){
		return this.address;
	}

	public String getIsreissue(){
		return this.isreissue;
	}

	public String getDonatorcategory(){
		return this.donatorcategory;
	}

	public String getReceiptcategory(){
		return this.receiptcategory;
	}

	public String getPaymentcount(){
		return this.paymentcount;
	}

	public String getMindate(){
		return this.mindate;
	}

	public String getMaxdate(){
		return this.maxdate;
	}

	public String getSamepaymentcount(){
		return this.samepaymentcount;
	}
}

/* 작성시간 : Mon Aug 29 11:14:43 KST 2016 */
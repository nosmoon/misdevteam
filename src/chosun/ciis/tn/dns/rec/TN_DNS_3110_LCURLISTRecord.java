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


public class TN_DNS_3110_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String receiptbulkissueidx;
	public String issuedeptidx;
	public String issuedeptname;
	public String paydate;
	public String paymentcount;
	public String price;
	public String issuecount;
	public String adminname;
	public String issuedate;

	
	public TN_DNS_3110_LCURLISTRecord(){}

	public void setReceiptbulkissueidx(String receiptbulkissueidx){
		this.receiptbulkissueidx = receiptbulkissueidx;
	}

	public void setIssuedeptidx(String issuedeptidx){
		this.issuedeptidx = issuedeptidx;
	}

	public void setIssuedeptname(String issuedeptname){
		this.issuedeptname = issuedeptname;
	}

	public void setPaydate(String paydate){
		this.paydate = paydate;
	}

	public void setPaymentcount(String paymentcount){
		this.paymentcount = paymentcount;
	}

	public void setPrice(String price){
		this.price = price;
	}

	public void setIssuecount(String issuecount){
		this.issuecount = issuecount;
	}

	public void setAdminname(String adminname){
		this.adminname = adminname;
	}

	public void setIssuedate(String issuedate) {
		this.issuedate = issuedate;
	}

	public String getReceiptbulkissueidx(){
		return this.receiptbulkissueidx;
	}

	public String getIssuedeptidx(){
		return this.issuedeptidx;
	}

	public String getIssuedeptname(){
		return this.issuedeptname;
	}

	public String getPaydate(){
		return this.paydate;
	}

	public String getPaymentcount(){
		return this.paymentcount;
	}

	public String getPrice(){
		return this.price;
	}

	public String getIssuecount(){
		return this.issuecount;
	}

	public String getAdminname(){
		return this.adminname;
	}
	
	public String getIssuedate() {
		return issuedate;
	}

}

/* 작성시간 : Tue Jun 28 19:58:28 KST 2016 */
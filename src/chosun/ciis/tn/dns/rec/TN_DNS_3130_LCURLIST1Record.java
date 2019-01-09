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


public class TN_DNS_3130_LCURLIST1Record extends java.lang.Object implements java.io.Serializable{

	public String receiptbulkissueidx;
	public String issuedeptidx;
	public String issuedeptname;
	public String startpaydate;
	public String endpaydate;
	public String includeissued;
	public String paymentcount;
	public String price;
	public String issuecount;
	public String adminname;
	public String issuedate;
	public String deptidx;

	public TN_DNS_3130_LCURLIST1Record(){}

	public void setReceiptbulkissueidx(String receiptbulkissueidx){
		this.receiptbulkissueidx = receiptbulkissueidx;
	}

	public void setIssuedeptidx(String issuedeptidx){
		this.issuedeptidx = issuedeptidx;
	}

	public void setIssuedeptname(String issuedeptname){
		this.issuedeptname = issuedeptname;
	}

	public void setStartpaydate(String startpaydate){
		this.startpaydate = startpaydate;
	}

	public void setEndpaydate(String endpaydate){
		this.endpaydate = endpaydate;
	}

	public void setIncludeissued(String includeissued){
		this.includeissued = includeissued;
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

	public void setIssuedate(String issuedate){
		this.issuedate = issuedate;
	}

	public void setDeptidx(String deptidx){
		this.deptidx = deptidx;
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

	public String getStartpaydate(){
		return this.startpaydate;
	}

	public String getEndpaydate(){
		return this.endpaydate;
	}

	public String getIncludeissued(){
		return this.includeissued;
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

	public String getIssuedate(){
		return this.issuedate;
	}

	public String getDeptidx(){
		return this.deptidx;
	}
}

/* 작성시간 : Tue Aug 16 17:58:33 KST 2016 */
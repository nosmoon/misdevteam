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


public class TN_DNS_3010_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String receiptidx;
	public String memberidx;
	public String deptidx;
	public String receiptcode;
	public String name;
	public String issuecategory;
	public String issuedate;
	public String donatorcategory;
	public String receiptcategory;
	public String price;
	public String membername;
	public String paymentissue;
	public String issuecount;
	public String isdeleted;

	public TN_DNS_3010_LCURLISTRecord(){}

	public void setReceiptidx(String receiptidx){
		this.receiptidx = receiptidx;
	}

	public void setMemberidx(String memberidx){
		this.memberidx = memberidx;
	}

	public void setDeptidx(String deptidx){
		this.deptidx = deptidx;
	}

	public void setReceiptcode(String receiptcode){
		this.receiptcode = receiptcode;
	}

	public void setName(String name){
		this.name = name;
	}

	public void setIssuecategory(String issuecategory){
		this.issuecategory = issuecategory;
	}

	public void setIssuedate(String issuedate){
		this.issuedate = issuedate;
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

	public void setMembername(String membername){
		this.membername = membername;
	}

	public void setPaymentissue(String paymentissue){
		this.paymentissue = paymentissue;
	}

	public void setIssuecount(String issuecount){
		this.issuecount = issuecount;
	}
	
	public void setIsdeleted(String isdeleted) {
		this.isdeleted = isdeleted;
	}
	
	public String getReceiptidx(){
		return this.receiptidx;
	}

	public String getMemberidx(){
		return this.memberidx;
	}

	public String getDeptidx(){
		return this.deptidx;
	}

	public String getReceiptcode(){
		return this.receiptcode;
	}

	public String getName(){
		return this.name;
	}

	public String getIssuecategory(){
		return this.issuecategory;
	}

	public String getIssuedate(){
		return this.issuedate;
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

	public String getMembername(){
		return this.membername;
	}

	public String getPaymentissue(){
		return this.paymentissue;
	}

	public String getIssuecount(){
		return this.issuecount;
	}
	
	public String getIsdeleted() {
		return isdeleted;
	}

	
}

/* 작성시간 : Tue Jun 21 19:16:21 KST 2016 */
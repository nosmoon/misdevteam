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


public class TN_DNS_3060_LCURLIST1Record extends java.lang.Object implements java.io.Serializable{

	public String memberidx;
	public String receiptcode;
	public String issuedate;
	public String issuecategory;
	public String donatorcategory;
	public String receiptcategory;
	public String name;
	public String address;
	public String regno;
	public String issuecount;
	public String issuedatecategory;
	public String deptidx;
	public String adminidx;
	public String memo;

	public TN_DNS_3060_LCURLIST1Record(){}

	public void setMemberidx(String memberidx){
		this.memberidx = memberidx;
	}

	public void setReceiptcode(String receiptcode){
		this.receiptcode = receiptcode;
	}

	public void setIssuedate(String issuedate){
		this.issuedate = issuedate;
	}

	public void setIssuecategory(String issuecategory){
		this.issuecategory = issuecategory;
	}

	public void setDonatorcategory(String donatorcategory){
		this.donatorcategory = donatorcategory;
	}

	public void setReceiptcategory(String receiptcategory){
		this.receiptcategory = receiptcategory;
	}

	public void setName(String name){
		this.name = name;
	}

	public void setAddress(String address){
		this.address = address;
	}

	public void setRegno(String regno){
		this.regno = regno;
	}

	public void setIssuecount(String issuecount){
		this.issuecount = issuecount;
	}

	public void setIssuedatecategory(String issuedatecategory){
		this.issuedatecategory = issuedatecategory;
	}

	public void setDeptidx(String deptidx){
		this.deptidx = deptidx;
	}

	public void setAdminidx(String adminidx){
		this.adminidx = adminidx;
	}

	public void setMemo(String memo){
		this.memo = memo;
	}

	public String getMemberidx(){
		return this.memberidx;
	}

	public String getReceiptcode(){
		return this.receiptcode;
	}

	public String getIssuedate(){
		return this.issuedate;
	}

	public String getIssuecategory(){
		return this.issuecategory;
	}

	public String getDonatorcategory(){
		return this.donatorcategory;
	}

	public String getReceiptcategory(){
		return this.receiptcategory;
	}

	public String getName(){
		return this.name;
	}

	public String getAddress(){
		return this.address;
	}

	public String getRegno(){
		return this.regno;
	}

	public String getIssuecount(){
		return this.issuecount;
	}

	public String getIssuedatecategory(){
		return this.issuedatecategory;
	}

	public String getDeptidx(){
		return this.deptidx;
	}

	public String getAdminidx(){
		return this.adminidx;
	}

	public String getMemo(){
		return this.memo;
	}
}

/* 작성시간 : Fri Aug 05 09:27:37 KST 2016 */
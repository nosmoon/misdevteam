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


public class TN_DNS_2010_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String membercode;
	public String memberidx;
	public String name;
	public String membertype;
	public String promisecode;
	public String promiseprice;
	public String payprice;
	public String payrate;
	public String fundtype;
	public String paymethodcode;
	public String issuedate;
	public String contactdate;
	public String senddate;
	public String cellphone;
	public String birthday;
	public String bankaccountowner;
	public String memo;
	public String promise_status;

	public TN_DNS_2010_LCURLISTRecord(){}

	public void setMembercode(String membercode){
		this.membercode = membercode;
	}

	public void setMemberidx(String memberidx){
		this.memberidx = memberidx;
	}

	public void setName(String name){
		this.name = name;
	}

	public void setMembertype(String membertype){
		this.membertype = membertype;
	}

	public void setPromisecode(String promisecode){
		this.promisecode = promisecode;
	}

	public void setPromiseprice(String promiseprice){
		this.promiseprice = promiseprice;
	}

	public void setPayprice(String payprice){
		this.payprice = payprice;
	}

	public void setPayrate(String payrate){
		this.payrate = payrate;
	}

	public void setFundtype(String fundtype){
		this.fundtype = fundtype;
	}

	public void setPaymethodcode(String paymethodcode){
		this.paymethodcode = paymethodcode;
	}

	public void setIssuedate(String issuedate){
		this.issuedate = issuedate;
	}

	public void setContactdate(String contactdate){
		this.contactdate = contactdate;
	}

	public void setSenddate(String senddate){
		this.senddate = senddate;
	}

	public void setCellphone(String cellphone){
		this.cellphone = cellphone;
	}

	public void setBirthday(String birthday){
		this.birthday = birthday;
	}

	public void setBankaccountowner(String bankaccountowner){
		this.bankaccountowner = bankaccountowner;
	}

	public void setMemo(String memo){
		this.memo = memo;
	}

	public void setPromise_status(String promise_status){
		this.promise_status = promise_status;
	}

	public String getMembercode(){
		return this.membercode;
	}

	public String getMemberidx(){
		return this.memberidx;
	}

	public String getName(){
		return this.name;
	}

	public String getMembertype(){
		return this.membertype;
	}

	public String getPromisecode(){
		return this.promisecode;
	}

	public String getPromiseprice(){
		return this.promiseprice;
	}

	public String getPayprice(){
		return this.payprice;
	}

	public String getPayrate(){
		return this.payrate;
	}

	public String getFundtype(){
		return this.fundtype;
	}

	public String getPaymethodcode(){
		return this.paymethodcode;
	}

	public String getIssuedate(){
		return this.issuedate;
	}

	public String getContactdate(){
		return this.contactdate;
	}

	public String getSenddate(){
		return this.senddate;
	}

	public String getCellphone(){
		return this.cellphone;
	}

	public String getBirthday(){
		return this.birthday;
	}

	public String getBankaccountowner(){
		return this.bankaccountowner;
	}

	public String getMemo(){
		return this.memo;
	}

	public String getPromise_status(){
		return this.promise_status;
	}
}

/* 작성시간 : Wed Jan 11 15:15:06 KST 2017 */
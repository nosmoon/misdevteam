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


public class TN_DNS_3060_LCURLIST2Record extends java.lang.Object implements java.io.Serializable{

	public String paymentcode;
	public String paydate;
	public String deptidx;
	public String fundidx;
	public String paymethodcode;
	public String payprice;
	public String receiptissue;

	public TN_DNS_3060_LCURLIST2Record(){}

	public void setPaymentcode(String paymentcode){
		this.paymentcode = paymentcode;
	}

	public void setPaydate(String paydate){
		this.paydate = paydate;
	}

	public void setDeptidx(String deptidx){
		this.deptidx = deptidx;
	}

	public void setFundidx(String fundidx){
		this.fundidx = fundidx;
	}

	public void setPaymethodcode(String paymethodcode){
		this.paymethodcode = paymethodcode;
	}

	public void setPayprice(String payprice){
		this.payprice = payprice;
	}

	public void setReceiptissue(String receiptissue){
		this.receiptissue = receiptissue;
	}

	public String getPaymentcode(){
		return this.paymentcode;
	}

	public String getPaydate(){
		return this.paydate;
	}

	public String getDeptidx(){
		return this.deptidx;
	}

	public String getFundidx(){
		return this.fundidx;
	}

	public String getPaymethodcode(){
		return this.paymethodcode;
	}

	public String getPayprice(){
		return this.payprice;
	}

	public String getReceiptissue(){
		return this.receiptissue;
	}
}

/* 작성시간 : Fri Aug 05 09:27:37 KST 2016 */
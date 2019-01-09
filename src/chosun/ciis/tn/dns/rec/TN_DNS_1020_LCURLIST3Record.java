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


public class TN_DNS_1020_LCURLIST3Record extends java.lang.Object implements java.io.Serializable{

	public String chk;
	public String paymentidx;
	public String paymentcode;
	public String paydate;
	public String promisecode;
	public String fundidx;
	public String supportidx;
	public String paymethodcode;
	public String promiseprice;
	public String payprice;
	public String sumpayprice;
	public String receiptissue;
	public String receiptcount;
	public String paymentmemo;
	public String bank_id;
	public String acct_num;
	public String tran_date;
	public String tran_date_seq;
	public String slip_no;

	public TN_DNS_1020_LCURLIST3Record(){}

	public void setChk(String chk){
		this.chk = chk;
	}

	public void setPaymentidx(String paymentidx){
		this.paymentidx = paymentidx;
	}

	public void setPaymentcode(String paymentcode){
		this.paymentcode = paymentcode;
	}

	public void setPaydate(String paydate){
		this.paydate = paydate;
	}

	public void setPromisecode(String promisecode){
		this.promisecode = promisecode;
	}

	public void setFundidx(String fundidx){
		this.fundidx = fundidx;
	}

	public void setSupportidx(String supportidx){
		this.supportidx = supportidx;
	}

	public void setPaymethodcode(String paymethodcode){
		this.paymethodcode = paymethodcode;
	}

	public void setPromiseprice(String promiseprice){
		this.promiseprice = promiseprice;
	}

	public void setPayprice(String payprice){
		this.payprice = payprice;
	}

	public void setSumpayprice(String sumpayprice){
		this.sumpayprice = sumpayprice;
	}

	public void setReceiptissue(String receiptissue){
		this.receiptissue = receiptissue;
	}

	public void setReceiptcount(String receiptcount){
		this.receiptcount = receiptcount;
	}

	public void setPaymentmemo(String paymentmemo){
		this.paymentmemo = paymentmemo;
	}

	public void setBank_id(String bank_id){
		this.bank_id = bank_id;
	}

	public void setAcct_num(String acct_num){
		this.acct_num = acct_num;
	}

	public void setTran_date(String tran_date){
		this.tran_date = tran_date;
	}

	public void setTran_date_seq(String tran_date_seq){
		this.tran_date_seq = tran_date_seq;
	}

	public void setSlip_no(String slip_no){
		this.slip_no = slip_no;
	}

	public String getChk(){
		return this.chk;
	}

	public String getPaymentidx(){
		return this.paymentidx;
	}

	public String getPaymentcode(){
		return this.paymentcode;
	}

	public String getPaydate(){
		return this.paydate;
	}

	public String getPromisecode(){
		return this.promisecode;
	}

	public String getFundidx(){
		return this.fundidx;
	}

	public String getSupportidx(){
		return this.supportidx;
	}

	public String getPaymethodcode(){
		return this.paymethodcode;
	}

	public String getPromiseprice(){
		return this.promiseprice;
	}

	public String getPayprice(){
		return this.payprice;
	}

	public String getSumpayprice(){
		return this.sumpayprice;
	}

	public String getReceiptissue(){
		return this.receiptissue;
	}

	public String getReceiptcount(){
		return this.receiptcount;
	}

	public String getPaymentmemo(){
		return this.paymentmemo;
	}

	public String getBank_id(){
		return this.bank_id;
	}

	public String getAcct_num(){
		return this.acct_num;
	}

	public String getTran_date(){
		return this.tran_date;
	}

	public String getTran_date_seq(){
		return this.tran_date_seq;
	}

	public String getSlip_no(){
		return this.slip_no;
	}
}

/* 작성시간 : Mon Dec 12 18:09:25 KST 2016 */
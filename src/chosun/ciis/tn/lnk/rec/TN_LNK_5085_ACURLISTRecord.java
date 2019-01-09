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


public class TN_LNK_5085_ACURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String seq;
	public String data_clsf;
	public String pymt_cd;
	public String memb_nm;
	public String sdsipaymentidx;
	public String cardcmpy;
	public String cardno;
	public String yyyy;
	public String mm;
	public String cardowner;
	public String reqprice;
	public String telno;
	public String email;
	public String acptdate;
	public String acptprice;
	public String fees;
	public String acptno;
	public String pymtmm;
	public String cnclokdate;
	public String result;
	public String resultcode;
	public String resultmsg;
	public String result_stat;
	public String pymtdd;
	public String paymentidx;
	public String isdelete;
	public String support;
	public String memb_cd;
	public String memberidx;
	public String promiseidx;
	public String sdsiidx;

	public TN_LNK_5085_ACURLISTRecord(){}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setData_clsf(String data_clsf){
		this.data_clsf = data_clsf;
	}

	public void setPymt_cd(String pymt_cd){
		this.pymt_cd = pymt_cd;
	}

	public void setMemb_nm(String memb_nm){
		this.memb_nm = memb_nm;
	}

	public void setSdsipaymentidx(String sdsipaymentidx){
		this.sdsipaymentidx = sdsipaymentidx;
	}

	public void setCardcmpy(String cardcmpy){
		this.cardcmpy = cardcmpy;
	}

	public void setCardno(String cardno){
		this.cardno = cardno;
	}

	public void setYyyy(String yyyy){
		this.yyyy = yyyy;
	}

	public void setMm(String mm){
		this.mm = mm;
	}

	public void setCardowner(String cardowner){
		this.cardowner = cardowner;
	}

	public void setReqprice(String reqprice){
		this.reqprice = reqprice;
	}

	public void setTelno(String telno){
		this.telno = telno;
	}

	public void setEmail(String email){
		this.email = email;
	}

	public void setAcptdate(String acptdate){
		this.acptdate = acptdate;
	}

	public void setAcptprice(String acptprice){
		this.acptprice = acptprice;
	}

	public void setFees(String fees){
		this.fees = fees;
	}

	public void setAcptno(String acptno){
		this.acptno = acptno;
	}

	public void setPymtmm(String pymtmm){
		this.pymtmm = pymtmm;
	}

	public void setCnclokdate(String cnclokdate){
		this.cnclokdate = cnclokdate;
	}

	public void setResult(String result){
		this.result = result;
	}

	public void setResultcode(String resultcode){
		this.resultcode = resultcode;
	}

	public void setResultmsg(String resultmsg){
		this.resultmsg = resultmsg;
	}

	public void setResult_stat(String result_stat){
		this.result_stat = result_stat;
	}

	public void setPymtdd(String pymtdd){
		this.pymtdd = pymtdd;
	}

	public void setPaymentidx(String paymentidx){
		this.paymentidx = paymentidx;
	}

	public void setIsdelete(String isdelete){
		this.isdelete = isdelete;
	}

	public void setSupport(String support){
		this.support = support;
	}

	public void setMemb_cd(String memb_cd){
		this.memb_cd = memb_cd;
	}

	public void setMemberidx(String memberidx){
		this.memberidx = memberidx;
	}

	public void setPromiseidx(String promiseidx){
		this.promiseidx = promiseidx;
	}

	public void setSdsiidx(String sdsiidx){
		this.sdsiidx = sdsiidx;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getData_clsf(){
		return this.data_clsf;
	}

	public String getPymt_cd(){
		return this.pymt_cd;
	}

	public String getMemb_nm(){
		return this.memb_nm;
	}

	public String getSdsipaymentidx(){
		return this.sdsipaymentidx;
	}

	public String getCardcmpy(){
		return this.cardcmpy;
	}

	public String getCardno(){
		return this.cardno;
	}

	public String getYyyy(){
		return this.yyyy;
	}

	public String getMm(){
		return this.mm;
	}

	public String getCardowner(){
		return this.cardowner;
	}

	public String getReqprice(){
		return this.reqprice;
	}

	public String getTelno(){
		return this.telno;
	}

	public String getEmail(){
		return this.email;
	}

	public String getAcptdate(){
		return this.acptdate;
	}

	public String getAcptprice(){
		return this.acptprice;
	}

	public String getFees(){
		return this.fees;
	}

	public String getAcptno(){
		return this.acptno;
	}

	public String getPymtmm(){
		return this.pymtmm;
	}

	public String getCnclokdate(){
		return this.cnclokdate;
	}

	public String getResult(){
		return this.result;
	}

	public String getResultcode(){
		return this.resultcode;
	}

	public String getResultmsg(){
		return this.resultmsg;
	}

	public String getResult_stat(){
		return this.result_stat;
	}

	public String getPymtdd(){
		return this.pymtdd;
	}

	public String getPaymentidx(){
		return this.paymentidx;
	}

	public String getIsdelete(){
		return this.isdelete;
	}

	public String getSupport(){
		return this.support;
	}

	public String getMemb_cd(){
		return this.memb_cd;
	}

	public String getMemberidx(){
		return this.memberidx;
	}

	public String getPromiseidx(){
		return this.promiseidx;
	}

	public String getSdsiidx(){
		return this.sdsiidx;
	}
}

/* 작성시간 : Thu Dec 22 11:12:44 KST 2016 */
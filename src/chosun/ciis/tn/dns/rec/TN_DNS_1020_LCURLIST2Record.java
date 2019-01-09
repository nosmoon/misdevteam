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


public class TN_DNS_1020_LCURLIST2Record extends java.lang.Object implements java.io.Serializable{

	public String promisecode;
	public String promisedate;
	public String promise_status;
	public String fundidx_nm;
	public String useoriginal_nm;
	public String paymethodcode_nm;
	public String promiseprice;
	public String payprice;
	public String payrate;
	public String promiseidx;
	public String memberidx;
	public String paystopped;
	public String contributormemo;
	public String promisememo;
	public String fundidx;
	public String supportidx_nm;
	public String supportidx;
	public String useoriginal;
	public String purposememo;
	public String paymethod;
	public String paymethodcode;
	public String bankaccountcode;
	public String partitiontype;
	public String paystartdate;
	public String payenddate;
	public String partitioncount;
	public String monthlypayday;
	public String monthlypayprice;
	public String excludenopay;
	public String ispromiseanonymous;
	public String itemname;
	public String itemqty;
	public String itemprice;
	public String itemremk;
	public String bankcode;
	public String bankaccount;
	public String bankaccountowner;
	public String bankownerclsf;
	public String bankowneridentity;
	public String cmsstatus;
	public String proofname;
	public String prooftype;
	public String stopdate;
	public String stopresn;
	public String cardcmpy;
	public String cardnumber;
	public String cardyymm;
	public String mobiaprvname;
	public String mobiaprvcmpy;
	public String mobiaprvnumber;
	public String mobiaprvprn;
	public String cmsstopped;
	public String cmsstopdate;
	public String cmsupdatedate;
	public String cardidentity;
	public String cardowner;
	public String cms_payment_status;
	public String cms_status;
	public String proofidx;

	public TN_DNS_1020_LCURLIST2Record(){}

	public void setPromisecode(String promisecode){
		this.promisecode = promisecode;
	}

	public void setPromisedate(String promisedate){
		this.promisedate = promisedate;
	}

	public void setPromise_status(String promise_status){
		this.promise_status = promise_status;
	}

	public void setFundidx_nm(String fundidx_nm){
		this.fundidx_nm = fundidx_nm;
	}

	public void setUseoriginal_nm(String useoriginal_nm){
		this.useoriginal_nm = useoriginal_nm;
	}

	public void setPaymethodcode_nm(String paymethodcode_nm){
		this.paymethodcode_nm = paymethodcode_nm;
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

	public void setPromiseidx(String promiseidx){
		this.promiseidx = promiseidx;
	}

	public void setMemberidx(String memberidx){
		this.memberidx = memberidx;
	}

	public void setPaystopped(String paystopped){
		this.paystopped = paystopped;
	}

	public void setContributormemo(String contributormemo){
		this.contributormemo = contributormemo;
	}

	public void setPromisememo(String promisememo){
		this.promisememo = promisememo;
	}

	public void setFundidx(String fundidx){
		this.fundidx = fundidx;
	}

	public void setSupportidx_nm(String supportidx_nm){
		this.supportidx_nm = supportidx_nm;
	}

	public void setSupportidx(String supportidx){
		this.supportidx = supportidx;
	}

	public void setUseoriginal(String useoriginal){
		this.useoriginal = useoriginal;
	}

	public void setPurposememo(String purposememo){
		this.purposememo = purposememo;
	}

	public void setPaymethod(String paymethod){
		this.paymethod = paymethod;
	}

	public void setPaymethodcode(String paymethodcode){
		this.paymethodcode = paymethodcode;
	}

	public void setBankaccountcode(String bankaccountcode){
		this.bankaccountcode = bankaccountcode;
	}

	public void setPartitiontype(String partitiontype){
		this.partitiontype = partitiontype;
	}

	public void setPaystartdate(String paystartdate){
		this.paystartdate = paystartdate;
	}

	public void setPayenddate(String payenddate){
		this.payenddate = payenddate;
	}

	public void setPartitioncount(String partitioncount){
		this.partitioncount = partitioncount;
	}

	public void setMonthlypayday(String monthlypayday){
		this.monthlypayday = monthlypayday;
	}

	public void setMonthlypayprice(String monthlypayprice){
		this.monthlypayprice = monthlypayprice;
	}

	public void setExcludenopay(String excludenopay){
		this.excludenopay = excludenopay;
	}

	public void setIspromiseanonymous(String ispromiseanonymous){
		this.ispromiseanonymous = ispromiseanonymous;
	}

	public void setItemname(String itemname){
		this.itemname = itemname;
	}

	public void setItemqty(String itemqty){
		this.itemqty = itemqty;
	}

	public void setItemprice(String itemprice){
		this.itemprice = itemprice;
	}

	public void setItemremk(String itemremk){
		this.itemremk = itemremk;
	}

	public void setBankcode(String bankcode){
		this.bankcode = bankcode;
	}

	public void setBankaccount(String bankaccount){
		this.bankaccount = bankaccount;
	}

	public void setBankaccountowner(String bankaccountowner){
		this.bankaccountowner = bankaccountowner;
	}

	public void setBankownerclsf(String bankownerclsf){
		this.bankownerclsf = bankownerclsf;
	}

	public void setBankowneridentity(String bankowneridentity){
		this.bankowneridentity = bankowneridentity;
	}

	public void setCmsstatus(String cmsstatus){
		this.cmsstatus = cmsstatus;
	}

	public void setProofname(String proofname){
		this.proofname = proofname;
	}

	public void setProoftype(String prooftype){
		this.prooftype = prooftype;
	}

	public void setStopdate(String stopdate){
		this.stopdate = stopdate;
	}

	public void setStopresn(String stopresn){
		this.stopresn = stopresn;
	}

	public void setCardcmpy(String cardcmpy){
		this.cardcmpy = cardcmpy;
	}

	public void setCardnumber(String cardnumber){
		this.cardnumber = cardnumber;
	}

	public void setCardyymm(String cardyymm){
		this.cardyymm = cardyymm;
	}

	public void setMobiaprvname(String mobiaprvname){
		this.mobiaprvname = mobiaprvname;
	}

	public void setMobiaprvcmpy(String mobiaprvcmpy){
		this.mobiaprvcmpy = mobiaprvcmpy;
	}

	public void setMobiaprvnumber(String mobiaprvnumber){
		this.mobiaprvnumber = mobiaprvnumber;
	}

	public void setMobiaprvprn(String mobiaprvprn){
		this.mobiaprvprn = mobiaprvprn;
	}

	public void setCmsstopped(String cmsstopped){
		this.cmsstopped = cmsstopped;
	}

	public void setCmsstopdate(String cmsstopdate){
		this.cmsstopdate = cmsstopdate;
	}

	public void setCmsupdatedate(String cmsupdatedate){
		this.cmsupdatedate = cmsupdatedate;
	}

	public void setCardidentity(String cardidentity){
		this.cardidentity = cardidentity;
	}

	public void setCardowner(String cardowner){
		this.cardowner = cardowner;
	}

	public void setCms_payment_status(String cms_payment_status){
		this.cms_payment_status = cms_payment_status;
	}

	public void setCms_status(String cms_status){
		this.cms_status = cms_status;
	}

	public void setProofidx(String proofidx){
		this.proofidx = proofidx;
	}

	public String getPromisecode(){
		return this.promisecode;
	}

	public String getPromisedate(){
		return this.promisedate;
	}

	public String getPromise_status(){
		return this.promise_status;
	}

	public String getFundidx_nm(){
		return this.fundidx_nm;
	}

	public String getUseoriginal_nm(){
		return this.useoriginal_nm;
	}

	public String getPaymethodcode_nm(){
		return this.paymethodcode_nm;
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

	public String getPromiseidx(){
		return this.promiseidx;
	}

	public String getMemberidx(){
		return this.memberidx;
	}

	public String getPaystopped(){
		return this.paystopped;
	}

	public String getContributormemo(){
		return this.contributormemo;
	}

	public String getPromisememo(){
		return this.promisememo;
	}

	public String getFundidx(){
		return this.fundidx;
	}

	public String getSupportidx_nm(){
		return this.supportidx_nm;
	}

	public String getSupportidx(){
		return this.supportidx;
	}

	public String getUseoriginal(){
		return this.useoriginal;
	}

	public String getPurposememo(){
		return this.purposememo;
	}

	public String getPaymethod(){
		return this.paymethod;
	}

	public String getPaymethodcode(){
		return this.paymethodcode;
	}

	public String getBankaccountcode(){
		return this.bankaccountcode;
	}

	public String getPartitiontype(){
		return this.partitiontype;
	}

	public String getPaystartdate(){
		return this.paystartdate;
	}

	public String getPayenddate(){
		return this.payenddate;
	}

	public String getPartitioncount(){
		return this.partitioncount;
	}

	public String getMonthlypayday(){
		return this.monthlypayday;
	}

	public String getMonthlypayprice(){
		return this.monthlypayprice;
	}

	public String getExcludenopay(){
		return this.excludenopay;
	}

	public String getIspromiseanonymous(){
		return this.ispromiseanonymous;
	}

	public String getItemname(){
		return this.itemname;
	}

	public String getItemqty(){
		return this.itemqty;
	}

	public String getItemprice(){
		return this.itemprice;
	}

	public String getItemremk(){
		return this.itemremk;
	}

	public String getBankcode(){
		return this.bankcode;
	}

	public String getBankaccount(){
		return this.bankaccount;
	}

	public String getBankaccountowner(){
		return this.bankaccountowner;
	}

	public String getBankownerclsf(){
		return this.bankownerclsf;
	}

	public String getBankowneridentity(){
		return this.bankowneridentity;
	}

	public String getCmsstatus(){
		return this.cmsstatus;
	}

	public String getProofname(){
		return this.proofname;
	}

	public String getProoftype(){
		return this.prooftype;
	}

	public String getStopdate(){
		return this.stopdate;
	}

	public String getStopresn(){
		return this.stopresn;
	}

	public String getCardcmpy(){
		return this.cardcmpy;
	}

	public String getCardnumber(){
		return this.cardnumber;
	}

	public String getCardyymm(){
		return this.cardyymm;
	}

	public String getMobiaprvname(){
		return this.mobiaprvname;
	}

	public String getMobiaprvcmpy(){
		return this.mobiaprvcmpy;
	}

	public String getMobiaprvnumber(){
		return this.mobiaprvnumber;
	}

	public String getMobiaprvprn(){
		return this.mobiaprvprn;
	}

	public String getCmsstopped(){
		return this.cmsstopped;
	}

	public String getCmsstopdate(){
		return this.cmsstopdate;
	}

	public String getCmsupdatedate(){
		return this.cmsupdatedate;
	}

	public String getCardidentity(){
		return this.cardidentity;
	}

	public String getCardowner(){
		return this.cardowner;
	}

	public String getCms_payment_status(){
		return this.cms_payment_status;
	}

	public String getCms_status(){
		return this.cms_status;
	}

	public String getProofidx(){
		return this.proofidx;
	}
}

/* 작성시간 : Mon Dec 12 18:09:25 KST 2016 */
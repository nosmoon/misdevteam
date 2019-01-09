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


public class TN_RPT_1520_LCURLIST2Record extends java.lang.Object implements java.io.Serializable{

	public String memberidx;
	public String promiseprice;
	public String useoriginal;
	public String paymethodcode;
	public String bankaccountcode;
	public String partitiontype;
	public String paystartdate;
	public String payenddate;
	public String partitioncount;
	public String monthlypayday;
	public String monthlypayprice;
	public String excludenopay;
	public String paystopped;
	public String contributormemo;
	public String promisememo;
	public String fundtype;
	public String fundidx;
	public String supporttype;
	public String supportidx;
	public String purposememo;
	public String itemname;
	public String itemqty;
	public String itemprice;
	public String itemremk;
	public String stopdate;
	public String stopresn;
	public String bankcode;
	public String bankaccount;
	public String bankaccountowner;
	public String bankowneridentity;
	public String bankownerclsf;
	public String cardcmpy;
	public String cardnumber;
	public String cardyymm;
	public String mobiaprvname;
	public String mobiaprvcmpy;
	public String mobiaprvnumber;
	public String mobiaprvprn;
	public String cmsstopped;
	public String cmsstopdate;
	public String cmsstatus;
	public String cmsupdatedate;
	public String cardidentity;
	public String cardowner;

	public TN_RPT_1520_LCURLIST2Record(){}

	public void setMemberidx(String memberidx){
		this.memberidx = memberidx;
	}

	public void setPromiseprice(String promiseprice){
		this.promiseprice = promiseprice;
	}

	public void setUseoriginal(String useoriginal){
		this.useoriginal = useoriginal;
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

	public void setPaystopped(String paystopped){
		this.paystopped = paystopped;
	}

	public void setContributormemo(String contributormemo){
		this.contributormemo = contributormemo;
	}

	public void setPromisememo(String promisememo){
		this.promisememo = promisememo;
	}

	public void setFundtype(String fundtype){
		this.fundtype = fundtype;
	}

	public void setFundidx(String fundidx){
		this.fundidx = fundidx;
	}

	public void setSupporttype(String supporttype){
		this.supporttype = supporttype;
	}

	public void setSupportidx(String supportidx){
		this.supportidx = supportidx;
	}

	public void setPurposememo(String purposememo){
		this.purposememo = purposememo;
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

	public void setStopdate(String stopdate){
		this.stopdate = stopdate;
	}

	public void setStopresn(String stopresn){
		this.stopresn = stopresn;
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

	public void setBankowneridentity(String bankowneridentity){
		this.bankowneridentity = bankowneridentity;
	}

	public void setBankownerclsf(String bankownerclsf){
		this.bankownerclsf = bankownerclsf;
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

	public void setCmsstatus(String cmsstatus){
		this.cmsstatus = cmsstatus;
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

	public String getMemberidx(){
		return this.memberidx;
	}

	public String getPromiseprice(){
		return this.promiseprice;
	}

	public String getUseoriginal(){
		return this.useoriginal;
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

	public String getPaystopped(){
		return this.paystopped;
	}

	public String getContributormemo(){
		return this.contributormemo;
	}

	public String getPromisememo(){
		return this.promisememo;
	}

	public String getFundtype(){
		return this.fundtype;
	}

	public String getFundidx(){
		return this.fundidx;
	}

	public String getSupporttype(){
		return this.supporttype;
	}

	public String getSupportidx(){
		return this.supportidx;
	}

	public String getPurposememo(){
		return this.purposememo;
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

	public String getStopdate(){
		return this.stopdate;
	}

	public String getStopresn(){
		return this.stopresn;
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

	public String getBankowneridentity(){
		return this.bankowneridentity;
	}

	public String getBankownerclsf(){
		return this.bankownerclsf;
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

	public String getCmsstatus(){
		return this.cmsstatus;
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
}

/* 작성시간 : Thu Nov 10 16:08:51 KST 2016 */
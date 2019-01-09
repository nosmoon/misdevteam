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


public class TN_RPT_1520_LCURLIST1Record extends java.lang.Object implements java.io.Serializable{

	public String his_memberidx;
	public String his_promiseprice;
	public String his_useoriginal;
	public String his_paymethodcode;
	public String his_bankaccountcode;
	public String his_partitiontype;
	public String his_paystartdate;
	public String his_payenddate;
	public String his_partitioncount;
	public String his_monthlypayday;
	public String his_monthlypayprice;
	public String his_excludenopay;
	public String his_paystopped;
	public String his_contributormemo;
	public String his_promisememo;
	public String his_fundtype;
	public String his_fundidx;
	public String his_supporttype;
	public String his_supportidx;
	public String his_purposememo;
	public String his_itemname;
	public String his_itemqty;
	public String his_itemprice;
	public String his_itemremk;
	public String his_stopdate;
	public String his_stopresn;
	public String his_bankcode;
	public String his_bankaccount;
	public String his_bankaccountowner;
	public String his_bankowneridentity;
	public String his_bankownerclsf;
	public String his_cardcmpy;
	public String his_cardnumber;
	public String his_cardyymm;
	public String his_mobiaprvname;
	public String his_mobiaprvcmpy;
	public String his_mobiaprvnumber;
	public String his_mobiaprvprn;
	public String his_cmsstopped;
	public String his_cmsstopdate;
	public String his_cmsstatus;
	public String his_cmsupdatedate;
	public String his_cardidentity;
	public String his_cardowner;

	public TN_RPT_1520_LCURLIST1Record(){}

	public void setHis_memberidx(String his_memberidx){
		this.his_memberidx = his_memberidx;
	}

	public void setHis_promiseprice(String his_promiseprice){
		this.his_promiseprice = his_promiseprice;
	}

	public void setHis_useoriginal(String his_useoriginal){
		this.his_useoriginal = his_useoriginal;
	}

	public void setHis_paymethodcode(String his_paymethodcode){
		this.his_paymethodcode = his_paymethodcode;
	}

	public void setHis_bankaccountcode(String his_bankaccountcode){
		this.his_bankaccountcode = his_bankaccountcode;
	}

	public void setHis_partitiontype(String his_partitiontype){
		this.his_partitiontype = his_partitiontype;
	}

	public void setHis_paystartdate(String his_paystartdate){
		this.his_paystartdate = his_paystartdate;
	}

	public void setHis_payenddate(String his_payenddate){
		this.his_payenddate = his_payenddate;
	}

	public void setHis_partitioncount(String his_partitioncount){
		this.his_partitioncount = his_partitioncount;
	}

	public void setHis_monthlypayday(String his_monthlypayday){
		this.his_monthlypayday = his_monthlypayday;
	}

	public void setHis_monthlypayprice(String his_monthlypayprice){
		this.his_monthlypayprice = his_monthlypayprice;
	}

	public void setHis_excludenopay(String his_excludenopay){
		this.his_excludenopay = his_excludenopay;
	}

	public void setHis_paystopped(String his_paystopped){
		this.his_paystopped = his_paystopped;
	}

	public void setHis_contributormemo(String his_contributormemo){
		this.his_contributormemo = his_contributormemo;
	}

	public void setHis_promisememo(String his_promisememo){
		this.his_promisememo = his_promisememo;
	}

	public void setHis_fundtype(String his_fundtype){
		this.his_fundtype = his_fundtype;
	}

	public void setHis_fundidx(String his_fundidx){
		this.his_fundidx = his_fundidx;
	}

	public void setHis_supporttype(String his_supporttype){
		this.his_supporttype = his_supporttype;
	}

	public void setHis_supportidx(String his_supportidx){
		this.his_supportidx = his_supportidx;
	}

	public void setHis_purposememo(String his_purposememo){
		this.his_purposememo = his_purposememo;
	}

	public void setHis_itemname(String his_itemname){
		this.his_itemname = his_itemname;
	}

	public void setHis_itemqty(String his_itemqty){
		this.his_itemqty = his_itemqty;
	}

	public void setHis_itemprice(String his_itemprice){
		this.his_itemprice = his_itemprice;
	}

	public void setHis_itemremk(String his_itemremk){
		this.his_itemremk = his_itemremk;
	}

	public void setHis_stopdate(String his_stopdate){
		this.his_stopdate = his_stopdate;
	}

	public void setHis_stopresn(String his_stopresn){
		this.his_stopresn = his_stopresn;
	}

	public void setHis_bankcode(String his_bankcode){
		this.his_bankcode = his_bankcode;
	}

	public void setHis_bankaccount(String his_bankaccount){
		this.his_bankaccount = his_bankaccount;
	}

	public void setHis_bankaccountowner(String his_bankaccountowner){
		this.his_bankaccountowner = his_bankaccountowner;
	}

	public void setHis_bankowneridentity(String his_bankowneridentity){
		this.his_bankowneridentity = his_bankowneridentity;
	}

	public void setHis_bankownerclsf(String his_bankownerclsf){
		this.his_bankownerclsf = his_bankownerclsf;
	}

	public void setHis_cardcmpy(String his_cardcmpy){
		this.his_cardcmpy = his_cardcmpy;
	}

	public void setHis_cardnumber(String his_cardnumber){
		this.his_cardnumber = his_cardnumber;
	}

	public void setHis_cardyymm(String his_cardyymm){
		this.his_cardyymm = his_cardyymm;
	}

	public void setHis_mobiaprvname(String his_mobiaprvname){
		this.his_mobiaprvname = his_mobiaprvname;
	}

	public void setHis_mobiaprvcmpy(String his_mobiaprvcmpy){
		this.his_mobiaprvcmpy = his_mobiaprvcmpy;
	}

	public void setHis_mobiaprvnumber(String his_mobiaprvnumber){
		this.his_mobiaprvnumber = his_mobiaprvnumber;
	}

	public void setHis_mobiaprvprn(String his_mobiaprvprn){
		this.his_mobiaprvprn = his_mobiaprvprn;
	}

	public void setHis_cmsstopped(String his_cmsstopped){
		this.his_cmsstopped = his_cmsstopped;
	}

	public void setHis_cmsstopdate(String his_cmsstopdate){
		this.his_cmsstopdate = his_cmsstopdate;
	}

	public void setHis_cmsstatus(String his_cmsstatus){
		this.his_cmsstatus = his_cmsstatus;
	}

	public void setHis_cmsupdatedate(String his_cmsupdatedate){
		this.his_cmsupdatedate = his_cmsupdatedate;
	}

	public void setHis_cardidentity(String his_cardidentity){
		this.his_cardidentity = his_cardidentity;
	}

	public void setHis_cardowner(String his_cardowner){
		this.his_cardowner = his_cardowner;
	}

	public String getHis_memberidx(){
		return this.his_memberidx;
	}

	public String getHis_promiseprice(){
		return this.his_promiseprice;
	}

	public String getHis_useoriginal(){
		return this.his_useoriginal;
	}

	public String getHis_paymethodcode(){
		return this.his_paymethodcode;
	}

	public String getHis_bankaccountcode(){
		return this.his_bankaccountcode;
	}

	public String getHis_partitiontype(){
		return this.his_partitiontype;
	}

	public String getHis_paystartdate(){
		return this.his_paystartdate;
	}

	public String getHis_payenddate(){
		return this.his_payenddate;
	}

	public String getHis_partitioncount(){
		return this.his_partitioncount;
	}

	public String getHis_monthlypayday(){
		return this.his_monthlypayday;
	}

	public String getHis_monthlypayprice(){
		return this.his_monthlypayprice;
	}

	public String getHis_excludenopay(){
		return this.his_excludenopay;
	}

	public String getHis_paystopped(){
		return this.his_paystopped;
	}

	public String getHis_contributormemo(){
		return this.his_contributormemo;
	}

	public String getHis_promisememo(){
		return this.his_promisememo;
	}

	public String getHis_fundtype(){
		return this.his_fundtype;
	}

	public String getHis_fundidx(){
		return this.his_fundidx;
	}

	public String getHis_supporttype(){
		return this.his_supporttype;
	}

	public String getHis_supportidx(){
		return this.his_supportidx;
	}

	public String getHis_purposememo(){
		return this.his_purposememo;
	}

	public String getHis_itemname(){
		return this.his_itemname;
	}

	public String getHis_itemqty(){
		return this.his_itemqty;
	}

	public String getHis_itemprice(){
		return this.his_itemprice;
	}

	public String getHis_itemremk(){
		return this.his_itemremk;
	}

	public String getHis_stopdate(){
		return this.his_stopdate;
	}

	public String getHis_stopresn(){
		return this.his_stopresn;
	}

	public String getHis_bankcode(){
		return this.his_bankcode;
	}

	public String getHis_bankaccount(){
		return this.his_bankaccount;
	}

	public String getHis_bankaccountowner(){
		return this.his_bankaccountowner;
	}

	public String getHis_bankowneridentity(){
		return this.his_bankowneridentity;
	}

	public String getHis_bankownerclsf(){
		return this.his_bankownerclsf;
	}

	public String getHis_cardcmpy(){
		return this.his_cardcmpy;
	}

	public String getHis_cardnumber(){
		return this.his_cardnumber;
	}

	public String getHis_cardyymm(){
		return this.his_cardyymm;
	}

	public String getHis_mobiaprvname(){
		return this.his_mobiaprvname;
	}

	public String getHis_mobiaprvcmpy(){
		return this.his_mobiaprvcmpy;
	}

	public String getHis_mobiaprvnumber(){
		return this.his_mobiaprvnumber;
	}

	public String getHis_mobiaprvprn(){
		return this.his_mobiaprvprn;
	}

	public String getHis_cmsstopped(){
		return this.his_cmsstopped;
	}

	public String getHis_cmsstopdate(){
		return this.his_cmsstopdate;
	}

	public String getHis_cmsstatus(){
		return this.his_cmsstatus;
	}

	public String getHis_cmsupdatedate(){
		return this.his_cmsupdatedate;
	}

	public String getHis_cardidentity(){
		return this.his_cardidentity;
	}

	public String getHis_cardowner(){
		return this.his_cardowner;
	}
}

/* 작성시간 : Thu Nov 10 16:08:51 KST 2016 */
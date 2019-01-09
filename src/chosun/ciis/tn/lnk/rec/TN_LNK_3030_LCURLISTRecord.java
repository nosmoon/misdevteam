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


public class TN_LNK_3030_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String pymtmm;
	public String pymtdd;
	public String memb_cd;
	public String memb_nm;
	public String pymt_cd;
	public String bankaccountowner;
	public String banknm;
	public String bankaccount;
	public String support;
	public String isdelete;
	public int scheduleprice;
	public int payprice;
	public String result_stat;
	public String paymentcode;
	public String memberidx;
	public String promiseidx;
	public String cmspaymentidx;
	public String paymentidx;
	public String cmsidx;

	public TN_LNK_3030_LCURLISTRecord(){}

	public void setPymtmm(String pymtmm){
		this.pymtmm = pymtmm;
	}

	public void setPymtdd(String pymtdd){
		this.pymtdd = pymtdd;
	}

	public void setMemb_cd(String memb_cd){
		this.memb_cd = memb_cd;
	}

	public void setMemb_nm(String memb_nm){
		this.memb_nm = memb_nm;
	}

	public void setPymt_cd(String pymt_cd){
		this.pymt_cd = pymt_cd;
	}

	public void setBankaccountowner(String bankaccountowner){
		this.bankaccountowner = bankaccountowner;
	}

	public void setBanknm(String banknm){
		this.banknm = banknm;
	}

	public void setBankaccount(String bankaccount){
		this.bankaccount = bankaccount;
	}

	public void setSupport(String support){
		this.support = support;
	}

	public void setIsdelete(String isdelete){
		this.isdelete = isdelete;
	}

	public void setScheduleprice(int scheduleprice){
		this.scheduleprice = scheduleprice;
	}

	public void setPayprice(int payprice){
		this.payprice = payprice;
	}

	public void setResult_stat(String result_stat){
		this.result_stat = result_stat;
	}

	public void setPaymentcode(String paymentcode){
		this.paymentcode = paymentcode;
	}

	public void setMemberidx(String memberidx){
		this.memberidx = memberidx;
	}

	public void setPromiseidx(String promiseidx){
		this.promiseidx = promiseidx;
	}

	public void setCmspaymentidx(String cmspaymentidx){
		this.cmspaymentidx = cmspaymentidx;
	}

	public void setPaymentidx(String paymentidx){
		this.paymentidx = paymentidx;
	}

	public void setCmsidx(String cmsidx){
		this.cmsidx = cmsidx;
	}

	public String getPymtmm(){
		return this.pymtmm;
	}

	public String getPymtdd(){
		return this.pymtdd;
	}

	public String getMemb_cd(){
		return this.memb_cd;
	}

	public String getMemb_nm(){
		return this.memb_nm;
	}

	public String getPymt_cd(){
		return this.pymt_cd;
	}

	public String getBankaccountowner(){
		return this.bankaccountowner;
	}

	public String getBanknm(){
		return this.banknm;
	}

	public String getBankaccount(){
		return this.bankaccount;
	}

	public String getSupport(){
		return this.support;
	}

	public String getIsdelete(){
		return this.isdelete;
	}

	public int getScheduleprice(){
		return this.scheduleprice;
	}

	public int getPayprice(){
		return this.payprice;
	}

	public String getResult_stat(){
		return this.result_stat;
	}

	public String getPaymentcode(){
		return this.paymentcode;
	}

	public String getMemberidx(){
		return this.memberidx;
	}

	public String getPromiseidx(){
		return this.promiseidx;
	}

	public String getCmspaymentidx(){
		return this.cmspaymentidx;
	}

	public String getPaymentidx(){
		return this.paymentidx;
	}

	public String getCmsidx(){
		return this.cmsidx;
	}
}

/* 작성시간 : Mon Aug 22 13:38:44 KST 2016 */
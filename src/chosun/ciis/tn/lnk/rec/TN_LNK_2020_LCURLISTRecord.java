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


public class TN_LNK_2020_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String requestdate;
	public String paydate;
	public String aplc_path;
	public String support;
	public String aplc_clsf;
	public String cmsstatus;
	public String memb_cd;
	public String memb_nm;
	public String pymt_cd;
	public String bankaccountowner;
	public String banknm;
	public String bankaccount;
	public String isdelete;
	public String proof_stat;
	public String result_stat;
	public String memberidx;
	public String promiseidx;
	public String cmsidx;

	public TN_LNK_2020_LCURLISTRecord(){}

	public void setRequestdate(String requestdate){
		this.requestdate = requestdate;
	}

	public void setPaydate(String paydate){
		this.paydate = paydate;
	}

	public void setAplc_path(String aplc_path){
		this.aplc_path = aplc_path;
	}

	public void setSupport(String support){
		this.support = support;
	}

	public void setAplc_clsf(String aplc_clsf){
		this.aplc_clsf = aplc_clsf;
	}

	public void setCmsstatus(String cmsstatus){
		this.cmsstatus = cmsstatus;
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

	public void setIsdelete(String isdelete){
		this.isdelete = isdelete;
	}

	public void setProof_stat(String proof_stat){
		this.proof_stat = proof_stat;
	}

	public void setResult_stat(String result_stat){
		this.result_stat = result_stat;
	}

	public void setMemberidx(String memberidx){
		this.memberidx = memberidx;
	}

	public void setPromiseidx(String promiseidx){
		this.promiseidx = promiseidx;
	}

	public void setCmsidx(String cmsidx){
		this.cmsidx = cmsidx;
	}

	public String getRequestdate(){
		return this.requestdate;
	}

	public String getPaydate(){
		return this.paydate;
	}

	public String getAplc_path(){
		return this.aplc_path;
	}

	public String getSupport(){
		return this.support;
	}

	public String getAplc_clsf(){
		return this.aplc_clsf;
	}

	public String getCmsstatus(){
		return this.cmsstatus;
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

	public String getIsdelete(){
		return this.isdelete;
	}

	public String getProof_stat(){
		return this.proof_stat;
	}

	public String getResult_stat(){
		return this.result_stat;
	}

	public String getMemberidx(){
		return this.memberidx;
	}

	public String getPromiseidx(){
		return this.promiseidx;
	}

	public String getCmsidx(){
		return this.cmsidx;
	}
}

/* 작성시간 : Thu Oct 13 15:18:18 KST 2016 */
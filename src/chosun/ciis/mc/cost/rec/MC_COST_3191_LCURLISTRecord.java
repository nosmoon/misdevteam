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


package chosun.ciis.mc.cost.rec;

import java.sql.*;
import chosun.ciis.mc.cost.dm.*;
import chosun.ciis.mc.cost.ds.*;

/**
 * 
 */


public class MC_COST_3191_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String use_dept_cd;
	public String use_dept_nm;
	public String budg_cd;
	public String budg_nm;
	public String medi_cd;
	public String medi_nm;
	public String dtls_medi_cd;
	public String dtls_medi_nm;
	public String acct_cd;
	public String acct_nm;
	public String dstb_dept_cd1;
	public String dstb_dept_nm1;
	public String dstb_dept_cd2;
	public String dstb_dept_nm2;
	public String dstb_medi_cd;
	public String dstb_medi_cdnm;
	public String amt;
	public String qunt;

	public MC_COST_3191_LCURLISTRecord(){}

	public void setUse_dept_cd(String use_dept_cd){
		this.use_dept_cd = use_dept_cd;
	}

	public void setUse_dept_nm(String use_dept_nm){
		this.use_dept_nm = use_dept_nm;
	}

	public void setBudg_cd(String budg_cd){
		this.budg_cd = budg_cd;
	}

	public void setBudg_nm(String budg_nm){
		this.budg_nm = budg_nm;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setMedi_nm(String medi_nm){
		this.medi_nm = medi_nm;
	}

	public void setDtls_medi_cd(String dtls_medi_cd){
		this.dtls_medi_cd = dtls_medi_cd;
	}

	public void setDtls_medi_nm(String dtls_medi_nm){
		this.dtls_medi_nm = dtls_medi_nm;
	}

	public void setAcct_cd(String acct_cd){
		this.acct_cd = acct_cd;
	}

	public void setAcct_nm(String acct_nm){
		this.acct_nm = acct_nm;
	}

	public void setDstb_dept_cd1(String dstb_dept_cd1){
		this.dstb_dept_cd1 = dstb_dept_cd1;
	}

	public void setDstb_dept_nm1(String dstb_dept_nm1){
		this.dstb_dept_nm1 = dstb_dept_nm1;
	}

	public void setDstb_dept_cd2(String dstb_dept_cd2){
		this.dstb_dept_cd2 = dstb_dept_cd2;
	}

	public void setDstb_dept_nm2(String dstb_dept_nm2){
		this.dstb_dept_nm2 = dstb_dept_nm2;
	}

	public void setDstb_medi_cd(String dstb_medi_cd){
		this.dstb_medi_cd = dstb_medi_cd;
	}

	public void setDstb_medi_cdnm(String dstb_medi_cdnm){
		this.dstb_medi_cdnm = dstb_medi_cdnm;
	}

	public void setAmt(String amt){
		this.amt = amt;
	}

	public void setQunt(String qunt){
		this.qunt = qunt;
	}

	public String getUse_dept_cd(){
		return this.use_dept_cd;
	}

	public String getUse_dept_nm(){
		return this.use_dept_nm;
	}

	public String getBudg_cd(){
		return this.budg_cd;
	}

	public String getBudg_nm(){
		return this.budg_nm;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getMedi_nm(){
		return this.medi_nm;
	}

	public String getDtls_medi_cd(){
		return this.dtls_medi_cd;
	}

	public String getDtls_medi_nm(){
		return this.dtls_medi_nm;
	}

	public String getAcct_cd(){
		return this.acct_cd;
	}

	public String getAcct_nm(){
		return this.acct_nm;
	}

	public String getDstb_dept_cd1(){
		return this.dstb_dept_cd1;
	}

	public String getDstb_dept_nm1(){
		return this.dstb_dept_nm1;
	}

	public String getDstb_dept_cd2(){
		return this.dstb_dept_cd2;
	}

	public String getDstb_dept_nm2(){
		return this.dstb_dept_nm2;
	}

	public String getDstb_medi_cd(){
		return this.dstb_medi_cd;
	}

	public String getDstb_medi_cdnm(){
		return this.dstb_medi_cdnm;
	}

	public String getAmt(){
		return this.amt;
	}

	public String getQunt(){
		return this.qunt;
	}
}

/* 작성시간 : Tue Aug 04 14:58:12 KST 2009 */
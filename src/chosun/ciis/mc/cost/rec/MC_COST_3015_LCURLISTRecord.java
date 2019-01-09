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


public class MC_COST_3015_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String yymm;
	public String use_dept_cd;
	public String use_dept_cdnm;
	public String budg_cd;
	public String budg_cdnm;
	public String medi_cd;
	public String dtls_medi_cd;
	public String dtls_medi_cdnm;
	public String dstb_dept_cd1;
	public String dstb_dept_cdnm1;
	public String dstb_dept_cd2;
	public String dstb_dept_cdnm2;
	public String dstb_medi_cd;
	public String acct_cd;
	public String acct_cdnm;
	public String amt;

	public MC_COST_3015_LCURLISTRecord(){}

	public void setYymm(String yymm){
		this.yymm = yymm;
	}

	public void setUse_dept_cd(String use_dept_cd){
		this.use_dept_cd = use_dept_cd;
	}

	public void setUse_dept_cdnm(String use_dept_cdnm){
		this.use_dept_cdnm = use_dept_cdnm;
	}

	public void setBudg_cd(String budg_cd){
		this.budg_cd = budg_cd;
	}

	public void setBudg_cdnm(String budg_cdnm){
		this.budg_cdnm = budg_cdnm;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setDtls_medi_cd(String dtls_medi_cd){
		this.dtls_medi_cd = dtls_medi_cd;
	}

	public void setDtls_medi_cdnm(String dtls_medi_cdnm){
		this.dtls_medi_cdnm = dtls_medi_cdnm;
	}

	public void setDstb_dept_cd1(String dstb_dept_cd1){
		this.dstb_dept_cd1 = dstb_dept_cd1;
	}

	public void setDstb_dept_cdnm1(String dstb_dept_cdnm1){
		this.dstb_dept_cdnm1 = dstb_dept_cdnm1;
	}

	public void setDstb_dept_cd2(String dstb_dept_cd2){
		this.dstb_dept_cd2 = dstb_dept_cd2;
	}

	public void setDstb_dept_cdnm2(String dstb_dept_cdnm2){
		this.dstb_dept_cdnm2 = dstb_dept_cdnm2;
	}

	public void setDstb_medi_cd(String dstb_medi_cd){
		this.dstb_medi_cd = dstb_medi_cd;
	}

	public void setAcct_cd(String acct_cd){
		this.acct_cd = acct_cd;
	}

	public void setAcct_cdnm(String acct_cdnm){
		this.acct_cdnm = acct_cdnm;
	}

	public void setAmt(String amt){
		this.amt = amt;
	}

	public String getYymm(){
		return this.yymm;
	}

	public String getUse_dept_cd(){
		return this.use_dept_cd;
	}

	public String getUse_dept_cdnm(){
		return this.use_dept_cdnm;
	}

	public String getBudg_cd(){
		return this.budg_cd;
	}

	public String getBudg_cdnm(){
		return this.budg_cdnm;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getDtls_medi_cd(){
		return this.dtls_medi_cd;
	}

	public String getDtls_medi_cdnm(){
		return this.dtls_medi_cdnm;
	}

	public String getDstb_dept_cd1(){
		return this.dstb_dept_cd1;
	}

	public String getDstb_dept_cdnm1(){
		return this.dstb_dept_cdnm1;
	}

	public String getDstb_dept_cd2(){
		return this.dstb_dept_cd2;
	}

	public String getDstb_dept_cdnm2(){
		return this.dstb_dept_cdnm2;
	}

	public String getDstb_medi_cd(){
		return this.dstb_medi_cd;
	}

	public String getAcct_cd(){
		return this.acct_cd;
	}

	public String getAcct_cdnm(){
		return this.acct_cdnm;
	}

	public String getAmt(){
		return this.amt;
	}
}

/* 작성시간 : Mon Aug 03 17:36:58 KST 2009 */
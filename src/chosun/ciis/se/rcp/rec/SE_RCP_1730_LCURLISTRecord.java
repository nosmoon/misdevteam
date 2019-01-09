/***************************************************************************************************
* 파일명 : .java
* 기능 : 판매시스템
* 작성일자 : 2009-02-18
* 작성자 : 배창희
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.se.rcp.rec;

import java.sql.*;
import chosun.ciis.se.rcp.dm.*;
import chosun.ciis.se.rcp.ds.*;

/**
 * 
 */


public class SE_RCP_1730_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String bo_cd;
	public String bo_seq;
	public String bo_nm;
	public String chrg_pers;
	public String sply_rem_amt;
	public String acct_rcpm_rem_amt;
	public String acpt_rcpm_reg_tot_amt;
	public String amt1;
	public String rmtt_dt;
	public String rmtt_plac;

	public SE_RCP_1730_LCURLISTRecord(){}

	public void setBo_cd(String bo_cd){
		this.bo_cd = bo_cd;
	}

	public void setBo_seq(String bo_seq){
		this.bo_seq = bo_seq;
	}

	public void setBo_nm(String bo_nm){
		this.bo_nm = bo_nm;
	}

	public void setChrg_pers(String chrg_pers){
		this.chrg_pers = chrg_pers;
	}

	public void setSply_rem_amt(String sply_rem_amt){
		this.sply_rem_amt = sply_rem_amt;
	}

	public void setAcct_rcpm_rem_amt(String acct_rcpm_rem_amt){
		this.acct_rcpm_rem_amt = acct_rcpm_rem_amt;
	}

	public void setAcpt_rcpm_reg_tot_amt(String acpt_rcpm_reg_tot_amt){
		this.acpt_rcpm_reg_tot_amt = acpt_rcpm_reg_tot_amt;
	}

	public void setAmt1(String amt1){
		this.amt1 = amt1;
	}

	public void setRmtt_dt(String rmtt_dt){
		this.rmtt_dt = rmtt_dt;
	}

	public void setRmtt_plac(String rmtt_plac){
		this.rmtt_plac = rmtt_plac;
	}

	public String getBo_cd(){
		return this.bo_cd;
	}

	public String getBo_seq(){
		return this.bo_seq;
	}

	public String getBo_nm(){
		return this.bo_nm;
	}

	public String getChrg_pers(){
		return this.chrg_pers;
	}

	public String getSply_rem_amt(){
		return this.sply_rem_amt;
	}

	public String getAcct_rcpm_rem_amt(){
		return this.acct_rcpm_rem_amt;
	}

	public String getAcpt_rcpm_reg_tot_amt(){
		return this.acpt_rcpm_reg_tot_amt;
	}

	public String getAmt1(){
		return this.amt1;
	}

	public String getRmtt_dt(){
		return this.rmtt_dt;
	}

	public String getRmtt_plac(){
		return this.rmtt_plac;
	}
}

/* 작성시간 : Mon Jun 22 16:10:06 KST 2009 */
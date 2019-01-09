/***************************************************************************************************
* 파일명 : 
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


package chosun.ciis.se.bns.rec;

import java.sql.*;
import chosun.ciis.se.bns.dm.*;
import chosun.ciis.se.bns.ds.*;

/**
 * 
 */


public class SE_BNS_2130_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String bo_cd;
	public String bo_seq;
	public String bo_nm;
	public String bo_head_nm;
	public String chrg_pers;
	public String bns_item_cd;
	public String bns_item_nm;
	public String divn_dt;
	public String ewh_seq;
	public String bal;
	public String acct_rcpm_rem_amt;
	public String acpt_rcpm_reg_tot_amt;
	public String rmtt_dt;
	public String rmtt_plac;

	public SE_BNS_2130_LCURLISTRecord(){}

	public void setBo_cd(String bo_cd){
		this.bo_cd = bo_cd;
	}

	public void setBo_seq(String bo_seq){
		this.bo_seq = bo_seq;
	}

	public void setBo_nm(String bo_nm){
		this.bo_nm = bo_nm;
	}

	public void setBo_head_nm(String bo_head_nm){
		this.bo_head_nm = bo_head_nm;
	}

	public void setChrg_pers(String chrg_pers){
		this.chrg_pers = chrg_pers;
	}

	public void setBns_item_cd(String bns_item_cd){
		this.bns_item_cd = bns_item_cd;
	}

	public void setBns_item_nm(String bns_item_nm){
		this.bns_item_nm = bns_item_nm;
	}

	public void setDivn_dt(String divn_dt){
		this.divn_dt = divn_dt;
	}

	public void setEwh_seq(String ewh_seq){
		this.ewh_seq = ewh_seq;
	}

	public void setBal(String bal){
		this.bal = bal;
	}

	public void setAcct_rcpm_rem_amt(String acct_rcpm_rem_amt){
		this.acct_rcpm_rem_amt = acct_rcpm_rem_amt;
	}

	public void setAcpt_rcpm_reg_tot_amt(String acpt_rcpm_reg_tot_amt){
		this.acpt_rcpm_reg_tot_amt = acpt_rcpm_reg_tot_amt;
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

	public String getBo_head_nm(){
		return this.bo_head_nm;
	}

	public String getChrg_pers(){
		return this.chrg_pers;
	}

	public String getBns_item_cd(){
		return this.bns_item_cd;
	}

	public String getBns_item_nm(){
		return this.bns_item_nm;
	}

	public String getDivn_dt(){
		return this.divn_dt;
	}

	public String getEwh_seq(){
		return this.ewh_seq;
	}

	public String getBal(){
		return this.bal;
	}

	public String getAcct_rcpm_rem_amt(){
		return this.acct_rcpm_rem_amt;
	}

	public String getAcpt_rcpm_reg_tot_amt(){
		return this.acpt_rcpm_reg_tot_amt;
	}

	public String getRmtt_dt(){
		return this.rmtt_dt;
	}

	public String getRmtt_plac(){
		return this.rmtt_plac;
	}
}

/* 작성시간 : Fri Aug 14 16:15:43 KST 2009 */
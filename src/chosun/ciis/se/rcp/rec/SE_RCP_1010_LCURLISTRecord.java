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


public class SE_RCP_1010_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cnfm_yn;
	public String area_nm;
	public String bo_cd;
	public String bo_seq;
	public String bo_nm;
	public String chrg_flnm;
	public String bo_head_nm;
	public String biz_reg_no;
	public String bank_id;
	public String acct_num;
	public String tran_date;
	public String tran_date_seq;
	public String tran_time;
	public String rcpm_pers;
	public String acct_no;
	public String tran_amt;
	public String cntr_stat_nm;
	public String rcpm_cnfm_dt;

	public SE_RCP_1010_LCURLISTRecord(){}

	public void setCnfm_yn(String cnfm_yn){
		this.cnfm_yn = cnfm_yn;
	}

	public void setArea_nm(String area_nm){
		this.area_nm = area_nm;
	}

	public void setBo_cd(String bo_cd){
		this.bo_cd = bo_cd;
	}

	public void setBo_seq(String bo_seq){
		this.bo_seq = bo_seq;
	}

	public void setBo_nm(String bo_nm){
		this.bo_nm = bo_nm;
	}

	public void setChrg_flnm(String chrg_flnm){
		this.chrg_flnm = chrg_flnm;
	}

	public void setBo_head_nm(String bo_head_nm){
		this.bo_head_nm = bo_head_nm;
	}

	public void setBiz_reg_no(String biz_reg_no){
		this.biz_reg_no = biz_reg_no;
	}

	public void setBank_id(String bank_id){
		this.bank_id = bank_id;
	}

	public void setAcct_num(String acct_num){
		this.acct_num = acct_num;
	}

	public void setTran_date(String tran_date){
		this.tran_date = tran_date;
	}

	public void setTran_date_seq(String tran_date_seq){
		this.tran_date_seq = tran_date_seq;
	}

	public void setTran_time(String tran_time){
		this.tran_time = tran_time;
	}

	public void setRcpm_pers(String rcpm_pers){
		this.rcpm_pers = rcpm_pers;
	}

	public void setAcct_no(String acct_no){
		this.acct_no = acct_no;
	}

	public void setTran_amt(String tran_amt){
		this.tran_amt = tran_amt;
	}

	public void setCntr_stat_nm(String cntr_stat_nm){
		this.cntr_stat_nm = cntr_stat_nm;
	}

	public void setRcpm_cnfm_dt(String rcpm_cnfm_dt){
		this.rcpm_cnfm_dt = rcpm_cnfm_dt;
	}

	public String getCnfm_yn(){
		return this.cnfm_yn;
	}

	public String getArea_nm(){
		return this.area_nm;
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

	public String getChrg_flnm(){
		return this.chrg_flnm;
	}

	public String getBo_head_nm(){
		return this.bo_head_nm;
	}

	public String getBiz_reg_no(){
		return this.biz_reg_no;
	}

	public String getBank_id(){
		return this.bank_id;
	}

	public String getAcct_num(){
		return this.acct_num;
	}

	public String getTran_date(){
		return this.tran_date;
	}

	public String getTran_date_seq(){
		return this.tran_date_seq;
	}

	public String getTran_time(){
		return this.tran_time;
	}

	public String getRcpm_pers(){
		return this.rcpm_pers;
	}

	public String getAcct_no(){
		return this.acct_no;
	}

	public String getTran_amt(){
		return this.tran_amt;
	}

	public String getCntr_stat_nm(){
		return this.cntr_stat_nm;
	}

	public String getRcpm_cnfm_dt(){
		return this.rcpm_cnfm_dt;
	}
}

/* 작성시간 : Tue May 12 17:43:31 KST 2009 */
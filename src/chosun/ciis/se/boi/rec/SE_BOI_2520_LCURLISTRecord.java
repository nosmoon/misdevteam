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


package chosun.ciis.se.boi.rec;

import java.sql.*;
import chosun.ciis.se.boi.dm.*;
import chosun.ciis.se.boi.ds.*;

/**
 * 
 */


public class SE_BOI_2520_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String area_cd;
	public String area_nm;
	public String bo_cd;
	public String bo_seq;
	public String bo_nm;
	public String chrg_pers;
	public String bo_head_nm;
	public String amt1;
	public String amt2;
	public String amt3;
	public String amt4;
	public String amt5;
	public String rcpm_shet_no;
	public String rmtt_dt;
	public String rmtt_plac;
	public String tran_amt;
	public String biz_reg_no;
	public String bank_id;
	public String acct_num;
	public String tran_date;
	public String tran_date_seq;

	public SE_BOI_2520_LCURLISTRecord(){}

	public void setArea_cd(String area_cd){
		this.area_cd = area_cd;
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

	public void setChrg_pers(String chrg_pers){
		this.chrg_pers = chrg_pers;
	}
	
	public void setBo_head_nm(String bo_head_nm){
		this.bo_head_nm = bo_head_nm;
	}

	public void setAmt1(String amt1){
		this.amt1 = amt1;
	}

	public void setAmt2(String amt2){
		this.amt2 = amt2;
	}

	public void setAmt3(String amt3){
		this.amt3 = amt3;
	}

	public void setAmt4(String amt4){
		this.amt4 = amt4;
	}

	public void setAmt5(String amt5){
		this.amt5 = amt5;
	}

	public void setRcpm_shet_no(String rcpm_shet_no){
		this.rcpm_shet_no = rcpm_shet_no;
	}

	public void setRmtt_dt(String rmtt_dt){
		this.rmtt_dt = rmtt_dt;
	}

	public void setRmtt_plac(String rmtt_plac){
		this.rmtt_plac = rmtt_plac;
	}

	public void setTran_amt(String tran_amt){
		this.tran_amt = tran_amt;
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

	public String getArea_cd(){
		return this.area_cd;
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

	public String getChrg_pers(){
		return this.chrg_pers;
	}
	
	public String getBo_head_nm(){
		return this.bo_head_nm;
	}
	
	public String getAmt1(){
		return this.amt1;
	}

	public String getAmt2(){
		return this.amt2;
	}

	public String getAmt3(){
		return this.amt3;
	}

	public String getAmt4(){
		return this.amt4;
	}

	public String getAmt5(){
		return this.amt5;
	}

	public String getRcpm_shet_no(){
		return this.rcpm_shet_no;
	}

	public String getRmtt_dt(){
		return this.rmtt_dt;
	}

	public String getRmtt_plac(){
		return this.rmtt_plac;
	}

	public String getTran_amt(){
		return this.tran_amt;
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
}

/* 작성시간 : Tue Jun 16 21:19:05 KST 2009 */
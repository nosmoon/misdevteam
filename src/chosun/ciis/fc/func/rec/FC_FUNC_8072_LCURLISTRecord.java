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


package chosun.ciis.fc.func.rec;

import java.sql.*;
import chosun.ciis.fc.func.dm.*;
import chosun.ciis.fc.func.ds.*;

/**
 * 
 */


public class FC_FUNC_8072_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String pymt_plan_dt;
	public String pay_cost_clsfnm;
	public String frex_cdnm;
	public String libiwgamtint;
	public String exrate;
	public String won_amt;
	public String fst_leas_no;

	public FC_FUNC_8072_LCURLISTRecord(){}

	public void setPymt_plan_dt(String pymt_plan_dt){
		this.pymt_plan_dt = pymt_plan_dt;
	}

	public void setPay_cost_clsfnm(String pay_cost_clsfnm){
		this.pay_cost_clsfnm = pay_cost_clsfnm;
	}

	public void setFrex_cdnm(String frex_cdnm){
		this.frex_cdnm = frex_cdnm;
	}

	public void setLibiwgamtint(String libiwgamtint){
		this.libiwgamtint = libiwgamtint;
	}

	public void setExrate(String exrate){
		this.exrate = exrate;
	}

	public void setWon_amt(String won_amt){
		this.won_amt = won_amt;
	}

	public void setFst_leas_no(String fst_leas_no){
		this.fst_leas_no = fst_leas_no;
	}

	public String getPymt_plan_dt(){
		return this.pymt_plan_dt;
	}

	public String getPay_cost_clsfnm(){
		return this.pay_cost_clsfnm;
	}

	public String getFrex_cdnm(){
		return this.frex_cdnm;
	}

	public String getLibiwgamtint(){
		return this.libiwgamtint;
	}

	public String getExrate(){
		return this.exrate;
	}

	public String getWon_amt(){
		return this.won_amt;
	}

	public String getFst_leas_no(){
		return this.fst_leas_no;
	}
}

/* 작성시간 : Wed Apr 08 13:50:32 KST 2009 */
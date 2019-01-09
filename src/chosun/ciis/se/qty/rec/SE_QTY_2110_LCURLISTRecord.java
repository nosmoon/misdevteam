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


package chosun.ciis.se.qty.rec;

import java.sql.*;
import chosun.ciis.se.qty.dm.*;
import chosun.ciis.se.qty.ds.*;

/**
 * 
 */


public class SE_QTY_2110_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String reg_dt;
	public String reg_seq;
	public String issu_dt;
	public String medi_nm;
	public int qty;
	public int amt;
	public String setl_acct_no;
	public String aplc_pers_nm;
	public String arvl_clsf_nm;
	public String stmt_issu_req_yn;
	public String cnfm_stat_clsf_nm;
	public String cnfm_msg;

	public SE_QTY_2110_LCURLISTRecord(){}

	public void setReg_dt(String reg_dt){
		this.reg_dt = reg_dt;
	}

	public void setReg_seq(String reg_seq){
		this.reg_seq = reg_seq;
	}

	public void setIssu_dt(String issu_dt){
		this.issu_dt = issu_dt;
	}

	public void setMedi_nm(String medi_nm){
		this.medi_nm = medi_nm;
	}

	public void setQty(int qty){
		this.qty = qty;
	}

	public void setAmt(int amt){
		this.amt = amt;
	}

	public void setSetl_acct_no(String setl_acct_no){
		this.setl_acct_no = setl_acct_no;
	}

	public void setAplc_pers_nm(String aplc_pers_nm){
		this.aplc_pers_nm = aplc_pers_nm;
	}

	public void setArvl_clsf_nm(String arvl_clsf_nm){
		this.arvl_clsf_nm = arvl_clsf_nm;
	}

	public void setStmt_issu_req_yn(String stmt_issu_req_yn){
		this.stmt_issu_req_yn = stmt_issu_req_yn;
	}

	public void setCnfm_stat_clsf_nm(String cnfm_stat_clsf_nm){
		this.cnfm_stat_clsf_nm = cnfm_stat_clsf_nm;
	}

	public void setCnfm_msg(String cnfm_msg){
		this.cnfm_msg = cnfm_msg;
	}

	public String getReg_dt(){
		return this.reg_dt;
	}

	public String getReg_seq(){
		return this.reg_seq;
	}

	public String getIssu_dt(){
		return this.issu_dt;
	}

	public String getMedi_nm(){
		return this.medi_nm;
	}

	public int getQty(){
		return this.qty;
	}

	public int getAmt(){
		return this.amt;
	}

	public String getSetl_acct_no(){
		return this.setl_acct_no;
	}

	public String getAplc_pers_nm(){
		return this.aplc_pers_nm;
	}

	public String getArvl_clsf_nm(){
		return this.arvl_clsf_nm;
	}

	public String getStmt_issu_req_yn(){
		return this.stmt_issu_req_yn;
	}

	public String getCnfm_stat_clsf_nm(){
		return this.cnfm_stat_clsf_nm;
	}

	public String getCnfm_msg(){
		return this.cnfm_msg;
	}
}

/* 작성시간 : Wed Mar 04 16:14:14 KST 2009 */
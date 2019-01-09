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


package chosun.ciis.fc.acct.rec;

import java.sql.*;
import chosun.ciis.fc.acct.dm.*;
import chosun.ciis.fc.acct.ds.*;

/**
 * 
 */


public class FC_ACCT_2125_SCURLIST1Record extends java.lang.Object implements java.io.Serializable{

	public String g1_rcpm_slip_seq;
	public String g1_rcpm_dt;
	public String g1_rcpm_amt;
	public String g1_rcpm_pers_nm;
	public String g1_deps_psbk;
	public String g1_coms;
	public String g1_frex_clsf;
	public String g1_exrate;
	public String g1_frex_amt;
	public String biz_reg_no;
	public String bank_id;
	public String acct_num;
	public String tran_date_seq;

	public FC_ACCT_2125_SCURLIST1Record(){}

	public void setG1_rcpm_slip_seq(String g1_rcpm_slip_seq){
		this.g1_rcpm_slip_seq = g1_rcpm_slip_seq;
	}

	public void setG1_rcpm_dt(String g1_rcpm_dt){
		this.g1_rcpm_dt = g1_rcpm_dt;
	}

	public void setG1_rcpm_amt(String g1_rcpm_amt){
		this.g1_rcpm_amt = g1_rcpm_amt;
	}

	public void setG1_rcpm_pers_nm(String g1_rcpm_pers_nm){
		this.g1_rcpm_pers_nm = g1_rcpm_pers_nm;
	}

	public void setG1_deps_psbk(String g1_deps_psbk){
		this.g1_deps_psbk = g1_deps_psbk;
	}

	public void setG1_coms(String g1_coms){
		this.g1_coms = g1_coms;
	}

	public void setG1_frex_clsf(String g1_frex_clsf){
		this.g1_frex_clsf = g1_frex_clsf;
	}

	public void setG1_exrate(String g1_exrate){
		this.g1_exrate = g1_exrate;
	}

	public void setG1_frex_amt(String g1_frex_amt){
		this.g1_frex_amt = g1_frex_amt;
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

	public void setTran_date_seq(String tran_date_seq){
		this.tran_date_seq = tran_date_seq;
	}

	public String getG1_rcpm_slip_seq(){
		return this.g1_rcpm_slip_seq;
	}

	public String getG1_rcpm_dt(){
		return this.g1_rcpm_dt;
	}

	public String getG1_rcpm_amt(){
		return this.g1_rcpm_amt;
	}

	public String getG1_rcpm_pers_nm(){
		return this.g1_rcpm_pers_nm;
	}

	public String getG1_deps_psbk(){
		return this.g1_deps_psbk;
	}

	public String getG1_coms(){
		return this.g1_coms;
	}

	public String getG1_frex_clsf(){
		return this.g1_frex_clsf;
	}

	public String getG1_exrate(){
		return this.g1_exrate;
	}

	public String getG1_frex_amt(){
		return this.g1_frex_amt;
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

	public String getTran_date_seq(){
		return this.tran_date_seq;
	}
}

/* 작성시간 : Fri Aug 14 15:33:11 KST 2009 */
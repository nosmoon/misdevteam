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


package chosun.ciis.as.aset.rec;

import java.sql.*;
import chosun.ciis.as.aset.dm.*;
import chosun.ciis.as.aset.ds.*;

/**
 * 
 */


public class AS_ASET_1501_LCURLIST4Record extends java.lang.Object implements java.io.Serializable{

	public String deps_rmtt_dt;
	public String deps_rcpm_amt;
	public String deps_rmtt_plac;
	public String deps_acct_mang_no;
	public String deps_acct_mang_nm;
	public String deps_coms_amt;
	public String deps_sub_seq;
	public String deps_biz_reg_no;
	public String deps_bank_id;
	public String deps_acct_num;
	public String deps_tran_date;
	public String deps_tran_date_seq;

	public AS_ASET_1501_LCURLIST4Record(){}

	public void setDeps_rmtt_dt(String deps_rmtt_dt){
		this.deps_rmtt_dt = deps_rmtt_dt;
	}

	public void setDeps_rcpm_amt(String deps_rcpm_amt){
		this.deps_rcpm_amt = deps_rcpm_amt;
	}

	public void setDeps_rmtt_plac(String deps_rmtt_plac){
		this.deps_rmtt_plac = deps_rmtt_plac;
	}

	public void setDeps_acct_mang_no(String deps_acct_mang_no){
		this.deps_acct_mang_no = deps_acct_mang_no;
	}

	public void setDeps_acct_mang_nm(String deps_acct_mang_nm){
		this.deps_acct_mang_nm = deps_acct_mang_nm;
	}

	public void setDeps_coms_amt(String deps_coms_amt){
		this.deps_coms_amt = deps_coms_amt;
	}

	public void setDeps_sub_seq(String deps_sub_seq){
		this.deps_sub_seq = deps_sub_seq;
	}

	public void setDeps_biz_reg_no(String deps_biz_reg_no){
		this.deps_biz_reg_no = deps_biz_reg_no;
	}

	public void setDeps_bank_id(String deps_bank_id){
		this.deps_bank_id = deps_bank_id;
	}

	public void setDeps_acct_num(String deps_acct_num){
		this.deps_acct_num = deps_acct_num;
	}

	public void setDeps_tran_date(String deps_tran_date){
		this.deps_tran_date = deps_tran_date;
	}

	public void setDeps_tran_date_seq(String deps_tran_date_seq){
		this.deps_tran_date_seq = deps_tran_date_seq;
	}

	public String getDeps_rmtt_dt(){
		return this.deps_rmtt_dt;
	}

	public String getDeps_rcpm_amt(){
		return this.deps_rcpm_amt;
	}

	public String getDeps_rmtt_plac(){
		return this.deps_rmtt_plac;
	}

	public String getDeps_acct_mang_no(){
		return this.deps_acct_mang_no;
	}

	public String getDeps_acct_mang_nm(){
		return this.deps_acct_mang_nm;
	}

	public String getDeps_coms_amt(){
		return this.deps_coms_amt;
	}

	public String getDeps_sub_seq(){
		return this.deps_sub_seq;
	}

	public String getDeps_biz_reg_no(){
		return this.deps_biz_reg_no;
	}

	public String getDeps_bank_id(){
		return this.deps_bank_id;
	}

	public String getDeps_acct_num(){
		return this.deps_acct_num;
	}

	public String getDeps_tran_date(){
		return this.deps_tran_date;
	}

	public String getDeps_tran_date_seq(){
		return this.deps_tran_date_seq;
	}
}

/* 작성시간 : Wed May 27 11:18:13 KST 2009 */
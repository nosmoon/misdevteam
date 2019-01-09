/***************************************************************************************************
* 파일명 : .java
* 기능 :  임대 입출금 관리 - 상세조회
* 작성일자 : 2010-06-07
* 작성자 : 노상현
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.as.leas.rec;

import java.sql.*;
import chosun.ciis.as.leas.dm.*;
import chosun.ciis.as.leas.ds.*;

/**
 * 임대입출금 관리 - 상세조회
 */


public class AS_LEAS_1303_SCURLIST3Record extends java.lang.Object implements java.io.Serializable{

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
	public String deps_current_clsf_ref;
	public String deps_acct_tonghwa_ref;
	public String deps_frex_amt;

	public AS_LEAS_1303_SCURLIST3Record(){}

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

	public void setDeps_current_clsf_ref(String deps_current_clsf_ref){
		this.deps_current_clsf_ref = deps_current_clsf_ref;
	}

	public void setDeps_acct_tonghwa_ref(String deps_acct_tonghwa_ref){
		this.deps_acct_tonghwa_ref = deps_acct_tonghwa_ref;
	}

	public void setDeps_frex_amt(String deps_frex_amt){
		this.deps_frex_amt = deps_frex_amt;
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

	public String getDeps_current_clsf_ref(){
		return this.deps_current_clsf_ref;
	}

	public String getDeps_acct_tonghwa_ref(){
		return this.deps_acct_tonghwa_ref;
	}

	public String getDeps_frex_amt(){
		return this.deps_frex_amt;
	}
}

/* 작성시간 : Mon Jun 14 19:56:40 KST 2010 */
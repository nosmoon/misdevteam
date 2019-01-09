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


public class FC_FUNC_1094_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String p_repl_amt;
	public String p_budg_cd;
	public String p_deps_clsf_cd;
	public String p_deps_dt;
	public String p_frex_cd;
	public String p_exrate;
	public String p_frex_amt;
	public String p_trufnd_slip_clsf;
	public String p_trufnd_slip_no;
	public String biz_reg_no;
	public String bank_id;
	public String acct_num;
	public String tran_date_seq;
	public String current_clsf;

	public FC_FUNC_1094_LCURLISTRecord(){}

	public void setP_repl_amt(String p_repl_amt){
		this.p_repl_amt = p_repl_amt;
	}

	public void setP_budg_cd(String p_budg_cd){
		this.p_budg_cd = p_budg_cd;
	}

	public void setP_deps_clsf_cd(String p_deps_clsf_cd){
		this.p_deps_clsf_cd = p_deps_clsf_cd;
	}

	public void setP_deps_dt(String p_deps_dt){
		this.p_deps_dt = p_deps_dt;
	}

	public void setP_frex_cd(String p_frex_cd){
		this.p_frex_cd = p_frex_cd;
	}

	public void setP_exrate(String p_exrate){
		this.p_exrate = p_exrate;
	}

	public void setP_frex_amt(String p_frex_amt){
		this.p_frex_amt = p_frex_amt;
	}

	public void setP_trufnd_slip_clsf(String p_trufnd_slip_clsf){
		this.p_trufnd_slip_clsf = p_trufnd_slip_clsf;
	}

	public void setP_trufnd_slip_no(String p_trufnd_slip_no){
		this.p_trufnd_slip_no = p_trufnd_slip_no;
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

	public void setCurrent_clsf(String current_clsf){
		this.current_clsf = current_clsf;
	}

	public String getP_repl_amt(){
		return this.p_repl_amt;
	}

	public String getP_budg_cd(){
		return this.p_budg_cd;
	}

	public String getP_deps_clsf_cd(){
		return this.p_deps_clsf_cd;
	}

	public String getP_deps_dt(){
		return this.p_deps_dt;
	}

	public String getP_frex_cd(){
		return this.p_frex_cd;
	}

	public String getP_exrate(){
		return this.p_exrate;
	}

	public String getP_frex_amt(){
		return this.p_frex_amt;
	}

	public String getP_trufnd_slip_clsf(){
		return this.p_trufnd_slip_clsf;
	}

	public String getP_trufnd_slip_no(){
		return this.p_trufnd_slip_no;
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

	public String getCurrent_clsf(){
		return this.current_clsf;
	}
}

/* 작성시간 : Mon Jul 20 17:19:51 KST 2009 */
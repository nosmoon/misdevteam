
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


package chosun.ciis.hd.yadjm.rec;

import java.sql.*;
import chosun.ciis.hd.yadjm.dm.*;
import chosun.ciis.hd.yadjm.ds.*;

/**
 * 
 */


public class HD_YADJM_1230_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cmpy_cd;
	public String adjm_rvrs_yy;
	public String adjm_clsf;
	public String emp_no;
	public String wedd_tms;
	public String movm_tms;
	public String fnrl_tms;
	public String prsn_pens_2000yy_aft;
	public String pens_low_out_2001yy_aft;
	public String crdt_non_pcc_use;
	public String cash_rcpt;
	public String edu_cost_giro_pymt_amt;
	public String invsm_cmpd_invsm_amt;
	public String emp_stok_ownr_out_pens;
	public String lvcmpy_pens_incm_dduc;
	public String plac_cmpy_plac_trad_authr_inc;
	public String ltrm_stok_type_savg_incm_dduc;
	public String hous_loan_amt_int;
	public String tax_paymt_cmpd_dduc;
	public String dona_polt_fund_10;
	public String forn_duty_plac;
	public String forn_duty_dty;
	public String forn_duty_prd_frdt;
	public String forn_duty_prd_todt;
	public String forn_duty_tot_saly;
	public String tax_paymt_offi_nm;
	public String tax_paymt_amt_frex;
	public String tax_paymt_amt_won;
	public String forn_duty_clsf;
	public String txn_obj_addm_amt;
	public String ltrm_stok_type_savg_incm_dduc1;
	public String ltrm_stok_type_savg_incm_dduc2;
	public String ltrm_stok_type_savg_incm_dduc3;
	public String hous_subc_savg;
	public String labr_hous_savg;
	public String ltrm_hous_savg;

	public HD_YADJM_1230_LCURLISTRecord(){}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setAdjm_rvrs_yy(String adjm_rvrs_yy){
		this.adjm_rvrs_yy = adjm_rvrs_yy;
	}

	public void setAdjm_clsf(String adjm_clsf){
		this.adjm_clsf = adjm_clsf;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setWedd_tms(String wedd_tms){
		this.wedd_tms = wedd_tms;
	}

	public void setMovm_tms(String movm_tms){
		this.movm_tms = movm_tms;
	}

	public void setFnrl_tms(String fnrl_tms){
		this.fnrl_tms = fnrl_tms;
	}

	public void setPrsn_pens_2000yy_aft(String prsn_pens_2000yy_aft){
		this.prsn_pens_2000yy_aft = prsn_pens_2000yy_aft;
	}

	public void setPens_low_out_2001yy_aft(String pens_low_out_2001yy_aft){
		this.pens_low_out_2001yy_aft = pens_low_out_2001yy_aft;
	}

	public void setCrdt_non_pcc_use(String crdt_non_pcc_use){
		this.crdt_non_pcc_use = crdt_non_pcc_use;
	}

	public void setCash_rcpt(String cash_rcpt){
		this.cash_rcpt = cash_rcpt;
	}

	public void setEdu_cost_giro_pymt_amt(String edu_cost_giro_pymt_amt){
		this.edu_cost_giro_pymt_amt = edu_cost_giro_pymt_amt;
	}

	public void setInvsm_cmpd_invsm_amt(String invsm_cmpd_invsm_amt){
		this.invsm_cmpd_invsm_amt = invsm_cmpd_invsm_amt;
	}

	public void setEmp_stok_ownr_out_pens(String emp_stok_ownr_out_pens){
		this.emp_stok_ownr_out_pens = emp_stok_ownr_out_pens;
	}

	public void setLvcmpy_pens_incm_dduc(String lvcmpy_pens_incm_dduc){
		this.lvcmpy_pens_incm_dduc = lvcmpy_pens_incm_dduc;
	}

	public void setPlac_cmpy_plac_trad_authr_inc(String plac_cmpy_plac_trad_authr_inc){
		this.plac_cmpy_plac_trad_authr_inc = plac_cmpy_plac_trad_authr_inc;
	}

	public void setLtrm_stok_type_savg_incm_dduc(String ltrm_stok_type_savg_incm_dduc){
		this.ltrm_stok_type_savg_incm_dduc = ltrm_stok_type_savg_incm_dduc;
	}

	public void setHous_loan_amt_int(String hous_loan_amt_int){
		this.hous_loan_amt_int = hous_loan_amt_int;
	}

	public void setTax_paymt_cmpd_dduc(String tax_paymt_cmpd_dduc){
		this.tax_paymt_cmpd_dduc = tax_paymt_cmpd_dduc;
	}

	public void setDona_polt_fund_10(String dona_polt_fund_10){
		this.dona_polt_fund_10 = dona_polt_fund_10;
	}

	public void setForn_duty_plac(String forn_duty_plac){
		this.forn_duty_plac = forn_duty_plac;
	}

	public void setForn_duty_dty(String forn_duty_dty){
		this.forn_duty_dty = forn_duty_dty;
	}

	public void setForn_duty_prd_frdt(String forn_duty_prd_frdt){
		this.forn_duty_prd_frdt = forn_duty_prd_frdt;
	}

	public void setForn_duty_prd_todt(String forn_duty_prd_todt){
		this.forn_duty_prd_todt = forn_duty_prd_todt;
	}

	public void setForn_duty_tot_saly(String forn_duty_tot_saly){
		this.forn_duty_tot_saly = forn_duty_tot_saly;
	}

	public void setTax_paymt_offi_nm(String tax_paymt_offi_nm){
		this.tax_paymt_offi_nm = tax_paymt_offi_nm;
	}

	public void setTax_paymt_amt_frex(String tax_paymt_amt_frex){
		this.tax_paymt_amt_frex = tax_paymt_amt_frex;
	}

	public void setTax_paymt_amt_won(String tax_paymt_amt_won){
		this.tax_paymt_amt_won = tax_paymt_amt_won;
	}

	public void setForn_duty_clsf(String forn_duty_clsf){
		this.forn_duty_clsf = forn_duty_clsf;
	}

	public void setTxn_obj_addm_amt(String txn_obj_addm_amt){
		this.txn_obj_addm_amt = txn_obj_addm_amt;
	}

	public void setLtrm_stok_type_savg_incm_dduc1(String ltrm_stok_type_savg_incm_dduc1){
		this.ltrm_stok_type_savg_incm_dduc1 = ltrm_stok_type_savg_incm_dduc1;
	}

	public void setLtrm_stok_type_savg_incm_dduc2(String ltrm_stok_type_savg_incm_dduc2){
		this.ltrm_stok_type_savg_incm_dduc2 = ltrm_stok_type_savg_incm_dduc2;
	}

	public void setLtrm_stok_type_savg_incm_dduc3(String ltrm_stok_type_savg_incm_dduc3){
		this.ltrm_stok_type_savg_incm_dduc3 = ltrm_stok_type_savg_incm_dduc3;
	}

	public void setHous_subc_savg(String hous_subc_savg){
		this.hous_subc_savg = hous_subc_savg;
	}

	public void setLabr_hous_savg(String labr_hous_savg){
		this.labr_hous_savg = labr_hous_savg;
	}

	public void setLtrm_hous_savg(String ltrm_hous_savg){
		this.ltrm_hous_savg = ltrm_hous_savg;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getAdjm_rvrs_yy(){
		return this.adjm_rvrs_yy;
	}

	public String getAdjm_clsf(){
		return this.adjm_clsf;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getWedd_tms(){
		return this.wedd_tms;
	}

	public String getMovm_tms(){
		return this.movm_tms;
	}

	public String getFnrl_tms(){
		return this.fnrl_tms;
	}

	public String getPrsn_pens_2000yy_aft(){
		return this.prsn_pens_2000yy_aft;
	}

	public String getPens_low_out_2001yy_aft(){
		return this.pens_low_out_2001yy_aft;
	}

	public String getCrdt_non_pcc_use(){
		return this.crdt_non_pcc_use;
	}

	public String getCash_rcpt(){
		return this.cash_rcpt;
	}

	public String getEdu_cost_giro_pymt_amt(){
		return this.edu_cost_giro_pymt_amt;
	}

	public String getInvsm_cmpd_invsm_amt(){
		return this.invsm_cmpd_invsm_amt;
	}

	public String getEmp_stok_ownr_out_pens(){
		return this.emp_stok_ownr_out_pens;
	}

	public String getLvcmpy_pens_incm_dduc(){
		return this.lvcmpy_pens_incm_dduc;
	}

	public String getPlac_cmpy_plac_trad_authr_inc(){
		return this.plac_cmpy_plac_trad_authr_inc;
	}

	public String getLtrm_stok_type_savg_incm_dduc(){
		return this.ltrm_stok_type_savg_incm_dduc;
	}

	public String getHous_loan_amt_int(){
		return this.hous_loan_amt_int;
	}

	public String getTax_paymt_cmpd_dduc(){
		return this.tax_paymt_cmpd_dduc;
	}

	public String getDona_polt_fund_10(){
		return this.dona_polt_fund_10;
	}

	public String getForn_duty_plac(){
		return this.forn_duty_plac;
	}

	public String getForn_duty_dty(){
		return this.forn_duty_dty;
	}

	public String getForn_duty_prd_frdt(){
		return this.forn_duty_prd_frdt;
	}

	public String getForn_duty_prd_todt(){
		return this.forn_duty_prd_todt;
	}

	public String getForn_duty_tot_saly(){
		return this.forn_duty_tot_saly;
	}

	public String getTax_paymt_offi_nm(){
		return this.tax_paymt_offi_nm;
	}

	public String getTax_paymt_amt_frex(){
		return this.tax_paymt_amt_frex;
	}

	public String getTax_paymt_amt_won(){
		return this.tax_paymt_amt_won;
	}

	public String getForn_duty_clsf(){
		return this.forn_duty_clsf;
	}

	public String getTxn_obj_addm_amt(){
		return this.txn_obj_addm_amt;
	}

	public String getLtrm_stok_type_savg_incm_dduc1(){
		return this.ltrm_stok_type_savg_incm_dduc1;
	}

	public String getLtrm_stok_type_savg_incm_dduc2(){
		return this.ltrm_stok_type_savg_incm_dduc2;
	}

	public String getLtrm_stok_type_savg_incm_dduc3(){
		return this.ltrm_stok_type_savg_incm_dduc3;
	}

	public String getHous_subc_savg(){
		return this.hous_subc_savg;
	}

	public String getLabr_hous_savg(){
		return this.labr_hous_savg;
	}

	public String getLtrm_hous_savg(){
		return this.ltrm_hous_savg;
	}
}

/* 작성시간 : Fri May 15 15:31:39 KST 2009 */
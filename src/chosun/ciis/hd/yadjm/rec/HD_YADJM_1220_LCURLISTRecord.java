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


public class HD_YADJM_1220_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cmpy_cd;
	public String adjm_rvrs_yy;
	public String adjm_clsf;
	public String emp_no;
	public String spos_exne;
	public String child_nops;
	public String oldg_nops;
	public String obcl_pers_nops;
	public String rspc_nops;
	public String rspc_nops_70;
	public String fml_hshd_yn;
	public String care_fee_nops;
	public String child_birth_in_qunt_nops;
	public String edu_fee_slf;
	public String edu_cost_slf_both_point;
	public String edu_fee_faml_ent_scl_prv;
	public String edu_fee_faml_ent_scl_prv_nops;
	public String edu_fee_faml_elmihi;
	public String edu_fee_faml_elmihi_nops;
	public String edu_fee_faml_univ;
	public String edu_fee_faml_univ_nops;
	public String obcl_pers_spc_edu_fee;
	public String obcl_pers_spc_edu_cost_nops;
	public String hosp_cost_slf_path_pers_obcl_p;
	public String gnr_fee_cost_slf_excep;
	public String gnr_asrc_prpn_insr_fee;
	public String obcl_pers_lesd_insr_fee;
	public String dona_amt_lgl;
	public String dona_amt_spc_case_dona_amt;
	public String emp_stok_ownr_cmpd_dona_amt;
	public String dona_phb_regu_boks_amt;
	public String relg_dona_amt;
	public String hous_hire_rcpm_won_li_amt_repa;
	public String ltrm_hous_mogg_loan_amt_int_re;
	public String hous_loan_amt_int;
	public String wedd_tms;
	public String wedd_fee;
	public String movm_tms;
	public String movm_fee;
	public String fnrl_tms;
	public String fnrl_fee;
	public String prsn_pens;
	public String pens_savg;
	public String crdt_non_pcc_use;
	public String cash_rcpt;
	public String edu_cost_giro_pymt_amt;
	public String invsm_cmpd_invsm_amt;
	public String emp_stok_ownr_out_pens;
	public String lvcmpy_pens_incm_dduc;
	public String plac_cmpy_plac_trad_authr_inc;
	public String ltrm_stok_type_savg_incm_dduc;
	public String tax_paymt_cmpd_dduc;
	public String dona_polt_fund;
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
	public String invsm_cmpd_invsm_amt_6;
	public String hous_loan_amt_int_1;
	public String tmp1;
	public String tmp2;

	public HD_YADJM_1220_LCURLISTRecord(){}

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

	public void setSpos_exne(String spos_exne){
		this.spos_exne = spos_exne;
	}

	public void setChild_nops(String child_nops){
		this.child_nops = child_nops;
	}

	public void setOldg_nops(String oldg_nops){
		this.oldg_nops = oldg_nops;
	}

	public void setObcl_pers_nops(String obcl_pers_nops){
		this.obcl_pers_nops = obcl_pers_nops;
	}

	public void setRspc_nops(String rspc_nops){
		this.rspc_nops = rspc_nops;
	}

	public void setRspc_nops_70(String rspc_nops_70){
		this.rspc_nops_70 = rspc_nops_70;
	}

	public void setFml_hshd_yn(String fml_hshd_yn){
		this.fml_hshd_yn = fml_hshd_yn;
	}

	public void setCare_fee_nops(String care_fee_nops){
		this.care_fee_nops = care_fee_nops;
	}

	public void setChild_birth_in_qunt_nops(String child_birth_in_qunt_nops){
		this.child_birth_in_qunt_nops = child_birth_in_qunt_nops;
	}

	public void setEdu_fee_slf(String edu_fee_slf){
		this.edu_fee_slf = edu_fee_slf;
	}

	public void setEdu_cost_slf_both_point(String edu_cost_slf_both_point){
		this.edu_cost_slf_both_point = edu_cost_slf_both_point;
	}

	public void setEdu_fee_faml_ent_scl_prv(String edu_fee_faml_ent_scl_prv){
		this.edu_fee_faml_ent_scl_prv = edu_fee_faml_ent_scl_prv;
	}

	public void setEdu_fee_faml_ent_scl_prv_nops(String edu_fee_faml_ent_scl_prv_nops){
		this.edu_fee_faml_ent_scl_prv_nops = edu_fee_faml_ent_scl_prv_nops;
	}

	public void setEdu_fee_faml_elmihi(String edu_fee_faml_elmihi){
		this.edu_fee_faml_elmihi = edu_fee_faml_elmihi;
	}

	public void setEdu_fee_faml_elmihi_nops(String edu_fee_faml_elmihi_nops){
		this.edu_fee_faml_elmihi_nops = edu_fee_faml_elmihi_nops;
	}

	public void setEdu_fee_faml_univ(String edu_fee_faml_univ){
		this.edu_fee_faml_univ = edu_fee_faml_univ;
	}

	public void setEdu_fee_faml_univ_nops(String edu_fee_faml_univ_nops){
		this.edu_fee_faml_univ_nops = edu_fee_faml_univ_nops;
	}

	public void setObcl_pers_spc_edu_fee(String obcl_pers_spc_edu_fee){
		this.obcl_pers_spc_edu_fee = obcl_pers_spc_edu_fee;
	}

	public void setObcl_pers_spc_edu_cost_nops(String obcl_pers_spc_edu_cost_nops){
		this.obcl_pers_spc_edu_cost_nops = obcl_pers_spc_edu_cost_nops;
	}

	public void setHosp_cost_slf_path_pers_obcl_p(String hosp_cost_slf_path_pers_obcl_p){
		this.hosp_cost_slf_path_pers_obcl_p = hosp_cost_slf_path_pers_obcl_p;
	}

	public void setGnr_fee_cost_slf_excep(String gnr_fee_cost_slf_excep){
		this.gnr_fee_cost_slf_excep = gnr_fee_cost_slf_excep;
	}

	public void setGnr_asrc_prpn_insr_fee(String gnr_asrc_prpn_insr_fee){
		this.gnr_asrc_prpn_insr_fee = gnr_asrc_prpn_insr_fee;
	}

	public void setObcl_pers_lesd_insr_fee(String obcl_pers_lesd_insr_fee){
		this.obcl_pers_lesd_insr_fee = obcl_pers_lesd_insr_fee;
	}

	public void setDona_amt_lgl(String dona_amt_lgl){
		this.dona_amt_lgl = dona_amt_lgl;
	}

	public void setDona_amt_spc_case_dona_amt(String dona_amt_spc_case_dona_amt){
		this.dona_amt_spc_case_dona_amt = dona_amt_spc_case_dona_amt;
	}

	public void setEmp_stok_ownr_cmpd_dona_amt(String emp_stok_ownr_cmpd_dona_amt){
		this.emp_stok_ownr_cmpd_dona_amt = emp_stok_ownr_cmpd_dona_amt;
	}

	public void setDona_phb_regu_boks_amt(String dona_phb_regu_boks_amt){
		this.dona_phb_regu_boks_amt = dona_phb_regu_boks_amt;
	}

	public void setRelg_dona_amt(String relg_dona_amt){
		this.relg_dona_amt = relg_dona_amt;
	}

	public void setHous_hire_rcpm_won_li_amt_repa(String hous_hire_rcpm_won_li_amt_repa){
		this.hous_hire_rcpm_won_li_amt_repa = hous_hire_rcpm_won_li_amt_repa;
	}

	public void setLtrm_hous_mogg_loan_amt_int_re(String ltrm_hous_mogg_loan_amt_int_re){
		this.ltrm_hous_mogg_loan_amt_int_re = ltrm_hous_mogg_loan_amt_int_re;
	}

	public void setHous_loan_amt_int(String hous_loan_amt_int){
		this.hous_loan_amt_int = hous_loan_amt_int;
	}

	public void setWedd_tms(String wedd_tms){
		this.wedd_tms = wedd_tms;
	}

	public void setWedd_fee(String wedd_fee){
		this.wedd_fee = wedd_fee;
	}

	public void setMovm_tms(String movm_tms){
		this.movm_tms = movm_tms;
	}

	public void setMovm_fee(String movm_fee){
		this.movm_fee = movm_fee;
	}

	public void setFnrl_tms(String fnrl_tms){
		this.fnrl_tms = fnrl_tms;
	}

	public void setFnrl_fee(String fnrl_fee){
		this.fnrl_fee = fnrl_fee;
	}

	public void setPrsn_pens(String prsn_pens){
		this.prsn_pens = prsn_pens;
	}

	public void setPens_savg(String pens_savg){
		this.pens_savg = pens_savg;
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

	public void setTax_paymt_cmpd_dduc(String tax_paymt_cmpd_dduc){
		this.tax_paymt_cmpd_dduc = tax_paymt_cmpd_dduc;
	}

	public void setDona_polt_fund(String dona_polt_fund){
		this.dona_polt_fund = dona_polt_fund;
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

	public void setInvsm_cmpd_invsm_amt_6(String invsm_cmpd_invsm_amt_6){
		this.invsm_cmpd_invsm_amt_6 = invsm_cmpd_invsm_amt_6;
	}

	public void setHous_loan_amt_int_1(String hous_loan_amt_int_1){
		this.hous_loan_amt_int_1 = hous_loan_amt_int_1;
	}

	public void setTmp1(String tmp1){
		this.tmp1 = tmp1;
	}

	public void setTmp2(String tmp2){
		this.tmp2 = tmp2;
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

	public String getSpos_exne(){
		return this.spos_exne;
	}

	public String getChild_nops(){
		return this.child_nops;
	}

	public String getOldg_nops(){
		return this.oldg_nops;
	}

	public String getObcl_pers_nops(){
		return this.obcl_pers_nops;
	}

	public String getRspc_nops(){
		return this.rspc_nops;
	}

	public String getRspc_nops_70(){
		return this.rspc_nops_70;
	}

	public String getFml_hshd_yn(){
		return this.fml_hshd_yn;
	}

	public String getCare_fee_nops(){
		return this.care_fee_nops;
	}

	public String getChild_birth_in_qunt_nops(){
		return this.child_birth_in_qunt_nops;
	}

	public String getEdu_fee_slf(){
		return this.edu_fee_slf;
	}

	public String getEdu_cost_slf_both_point(){
		return this.edu_cost_slf_both_point;
	}

	public String getEdu_fee_faml_ent_scl_prv(){
		return this.edu_fee_faml_ent_scl_prv;
	}

	public String getEdu_fee_faml_ent_scl_prv_nops(){
		return this.edu_fee_faml_ent_scl_prv_nops;
	}

	public String getEdu_fee_faml_elmihi(){
		return this.edu_fee_faml_elmihi;
	}

	public String getEdu_fee_faml_elmihi_nops(){
		return this.edu_fee_faml_elmihi_nops;
	}

	public String getEdu_fee_faml_univ(){
		return this.edu_fee_faml_univ;
	}

	public String getEdu_fee_faml_univ_nops(){
		return this.edu_fee_faml_univ_nops;
	}

	public String getObcl_pers_spc_edu_fee(){
		return this.obcl_pers_spc_edu_fee;
	}

	public String getObcl_pers_spc_edu_cost_nops(){
		return this.obcl_pers_spc_edu_cost_nops;
	}

	public String getHosp_cost_slf_path_pers_obcl_p(){
		return this.hosp_cost_slf_path_pers_obcl_p;
	}

	public String getGnr_fee_cost_slf_excep(){
		return this.gnr_fee_cost_slf_excep;
	}

	public String getGnr_asrc_prpn_insr_fee(){
		return this.gnr_asrc_prpn_insr_fee;
	}

	public String getObcl_pers_lesd_insr_fee(){
		return this.obcl_pers_lesd_insr_fee;
	}

	public String getDona_amt_lgl(){
		return this.dona_amt_lgl;
	}

	public String getDona_amt_spc_case_dona_amt(){
		return this.dona_amt_spc_case_dona_amt;
	}

	public String getEmp_stok_ownr_cmpd_dona_amt(){
		return this.emp_stok_ownr_cmpd_dona_amt;
	}

	public String getDona_phb_regu_boks_amt(){
		return this.dona_phb_regu_boks_amt;
	}

	public String getRelg_dona_amt(){
		return this.relg_dona_amt;
	}

	public String getHous_hire_rcpm_won_li_amt_repa(){
		return this.hous_hire_rcpm_won_li_amt_repa;
	}

	public String getLtrm_hous_mogg_loan_amt_int_re(){
		return this.ltrm_hous_mogg_loan_amt_int_re;
	}

	public String getHous_loan_amt_int(){
		return this.hous_loan_amt_int;
	}

	public String getWedd_tms(){
		return this.wedd_tms;
	}

	public String getWedd_fee(){
		return this.wedd_fee;
	}

	public String getMovm_tms(){
		return this.movm_tms;
	}

	public String getMovm_fee(){
		return this.movm_fee;
	}

	public String getFnrl_tms(){
		return this.fnrl_tms;
	}

	public String getFnrl_fee(){
		return this.fnrl_fee;
	}

	public String getPrsn_pens(){
		return this.prsn_pens;
	}

	public String getPens_savg(){
		return this.pens_savg;
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

	public String getTax_paymt_cmpd_dduc(){
		return this.tax_paymt_cmpd_dduc;
	}

	public String getDona_polt_fund(){
		return this.dona_polt_fund;
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

	public String getInvsm_cmpd_invsm_amt_6(){
		return this.invsm_cmpd_invsm_amt_6;
	}

	public String getHous_loan_amt_int_1(){
		return this.hous_loan_amt_int_1;
	}

	public String getTmp1(){
		return this.tmp1;
	}

	public String getTmp2(){
		return this.tmp2;
	}
}

/* 작성시간 : Thu Jan 14 20:47:15 KST 2010 */
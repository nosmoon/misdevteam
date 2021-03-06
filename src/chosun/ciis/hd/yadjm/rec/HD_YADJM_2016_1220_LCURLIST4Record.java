/***************************************************************************************************
* 파일명 : .java
* 기능 : 
* 작성일자 : 
* 작성자 : 이태식
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


public class HD_YADJM_2016_1220_LCURLIST4Record extends java.lang.Object implements java.io.Serializable{

	public String adjm_rvrs_yy;
	public String emp_no;
	public String faml_seq;
	public String base_dduc_yn;
	public String obcl_pers_dduc_yn;
	public String fml_hshd_dduc_yn;
	public String care_fee_dduc_yn;
	public String one_paren_dduc_yn;
	public String faml_rshp_cd;
	public String faml_flnm;
	public String faml_prn;
	public String adopt_dt;
	public String dth_dt;
	public String edu_suppamt;
	public String edu_fee_clsf_cd;
	public String edu_cost_onta;
	public String edu_cost_etc;
	public String edu_splen_pers_onta;
	public String edu_splen_pers_etc;
	public String heal_suppamt;
	public String hosp_cost_onta;
	public String hosp_cost_etc;
	public String asrc_prpn_insr_fee_onta;
	public String asrc_prpn_insr_fee_etc;
	public String obcl_pers_insr_onta;
	public String obcl_pers_insr_etc;
	public String nonprofit_dona_amt_etc;
	public String relg_appm_dona_amt_etc;
	public String appm_dona_amt_etc;
	public String lgl_dona_amt_etc;
	public String dduc_polt_fund;
	public String obcl_pers_clsf;
	public String spc_case_dona_amt_etc;
	public String ftyr_crdt_card_onta;
	public String ftyr_crdt_card_etc;
	public String ftyr_debit_card_onta;
	public String ftyr_debit_card_etc;
	public String ftyr_cash_rcpt_onta;
	public String ftyr_trad_amt_onta;
	public String ftyr_trad_amt_etc;
	public String ftyr_trans_amt_onta;
	public String ftyr_trans_amt_etc;
	public String crdt_card_incd_pre_onta;
	public String crdt_card_incd_pre_etc;
	public String debit_card_incd_pre_onta;
	public String debit_card_incd_pre_etc;
	public String cash_rcpt_incd_pre_onta;
	public String trad_pre_amt_onta;
	public String trad_pre_amt_etc;
	public String trans_pre_amt_onta;
	public String trans_pre_amt_etc;
	public String crdt_card_tot_amt_onta;
	public String crdt_card_tot_amt_etc;
	public String debit_card_1st_amt_onta;
	public String debit_card_2nd_amt_onta;
	public String debit_card_1st_amt_etc;
	public String debit_card_2nd_amt_etc;
	public String cash_rcpt_1st_onta;
	public String cash_rcpt_2nd_onta;
	public String trad_all_1st_amt_onta;
	public String trad_all_2nd_amt_onta;
	public String trad_all_1st_amt_etc;
	public String trad_all_2nd_amt_etc;
	public String trans_all_1st_amt_onta;
	public String trans_all_2nd_amt_onta;
	public String trans_all_1st_amt_etc;
	public String trans_all_2nd_amt_etc;

	public HD_YADJM_2016_1220_LCURLIST4Record(){}

	public void setAdjm_rvrs_yy(String adjm_rvrs_yy){
		this.adjm_rvrs_yy = adjm_rvrs_yy;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setFaml_seq(String faml_seq){
		this.faml_seq = faml_seq;
	}

	public void setBase_dduc_yn(String base_dduc_yn){
		this.base_dduc_yn = base_dduc_yn;
	}

	public void setObcl_pers_dduc_yn(String obcl_pers_dduc_yn){
		this.obcl_pers_dduc_yn = obcl_pers_dduc_yn;
	}

	public void setFml_hshd_dduc_yn(String fml_hshd_dduc_yn){
		this.fml_hshd_dduc_yn = fml_hshd_dduc_yn;
	}

	public void setCare_fee_dduc_yn(String care_fee_dduc_yn){
		this.care_fee_dduc_yn = care_fee_dduc_yn;
	}

	public void setOne_paren_dduc_yn(String one_paren_dduc_yn){
		this.one_paren_dduc_yn = one_paren_dduc_yn;
	}

	public void setFaml_rshp_cd(String faml_rshp_cd){
		this.faml_rshp_cd = faml_rshp_cd;
	}

	public void setFaml_flnm(String faml_flnm){
		this.faml_flnm = faml_flnm;
	}

	public void setFaml_prn(String faml_prn){
		this.faml_prn = faml_prn;
	}

	public void setAdopt_dt(String adopt_dt){
		this.adopt_dt = adopt_dt;
	}

	public void setDth_dt(String dth_dt){
		this.dth_dt = dth_dt;
	}

	public void setEdu_suppamt(String edu_suppamt){
		this.edu_suppamt = edu_suppamt;
	}

	public void setEdu_fee_clsf_cd(String edu_fee_clsf_cd){
		this.edu_fee_clsf_cd = edu_fee_clsf_cd;
	}

	public void setEdu_cost_onta(String edu_cost_onta){
		this.edu_cost_onta = edu_cost_onta;
	}

	public void setEdu_cost_etc(String edu_cost_etc){
		this.edu_cost_etc = edu_cost_etc;
	}

	public void setEdu_splen_pers_onta(String edu_splen_pers_onta){
		this.edu_splen_pers_onta = edu_splen_pers_onta;
	}

	public void setEdu_splen_pers_etc(String edu_splen_pers_etc){
		this.edu_splen_pers_etc = edu_splen_pers_etc;
	}

	public void setHeal_suppamt(String heal_suppamt){
		this.heal_suppamt = heal_suppamt;
	}

	public void setHosp_cost_onta(String hosp_cost_onta){
		this.hosp_cost_onta = hosp_cost_onta;
	}

	public void setHosp_cost_etc(String hosp_cost_etc){
		this.hosp_cost_etc = hosp_cost_etc;
	}

	public void setAsrc_prpn_insr_fee_onta(String asrc_prpn_insr_fee_onta){
		this.asrc_prpn_insr_fee_onta = asrc_prpn_insr_fee_onta;
	}

	public void setAsrc_prpn_insr_fee_etc(String asrc_prpn_insr_fee_etc){
		this.asrc_prpn_insr_fee_etc = asrc_prpn_insr_fee_etc;
	}

	public void setObcl_pers_insr_onta(String obcl_pers_insr_onta){
		this.obcl_pers_insr_onta = obcl_pers_insr_onta;
	}

	public void setObcl_pers_insr_etc(String obcl_pers_insr_etc){
		this.obcl_pers_insr_etc = obcl_pers_insr_etc;
	}

	public void setNonprofit_dona_amt_etc(String nonprofit_dona_amt_etc){
		this.nonprofit_dona_amt_etc = nonprofit_dona_amt_etc;
	}

	public void setRelg_appm_dona_amt_etc(String relg_appm_dona_amt_etc){
		this.relg_appm_dona_amt_etc = relg_appm_dona_amt_etc;
	}

	public void setAppm_dona_amt_etc(String appm_dona_amt_etc){
		this.appm_dona_amt_etc = appm_dona_amt_etc;
	}

	public void setLgl_dona_amt_etc(String lgl_dona_amt_etc){
		this.lgl_dona_amt_etc = lgl_dona_amt_etc;
	}

	public void setDduc_polt_fund(String dduc_polt_fund){
		this.dduc_polt_fund = dduc_polt_fund;
	}

	public void setObcl_pers_clsf(String obcl_pers_clsf){
		this.obcl_pers_clsf = obcl_pers_clsf;
	}

	public void setSpc_case_dona_amt_etc(String spc_case_dona_amt_etc){
		this.spc_case_dona_amt_etc = spc_case_dona_amt_etc;
	}

	public void setFtyr_crdt_card_onta(String ftyr_crdt_card_onta){
		this.ftyr_crdt_card_onta = ftyr_crdt_card_onta;
	}

	public void setFtyr_crdt_card_etc(String ftyr_crdt_card_etc){
		this.ftyr_crdt_card_etc = ftyr_crdt_card_etc;
	}

	public void setFtyr_debit_card_onta(String ftyr_debit_card_onta){
		this.ftyr_debit_card_onta = ftyr_debit_card_onta;
	}

	public void setFtyr_debit_card_etc(String ftyr_debit_card_etc){
		this.ftyr_debit_card_etc = ftyr_debit_card_etc;
	}

	public void setFtyr_cash_rcpt_onta(String ftyr_cash_rcpt_onta){
		this.ftyr_cash_rcpt_onta = ftyr_cash_rcpt_onta;
	}

	public void setFtyr_trad_amt_onta(String ftyr_trad_amt_onta){
		this.ftyr_trad_amt_onta = ftyr_trad_amt_onta;
	}

	public void setFtyr_trad_amt_etc(String ftyr_trad_amt_etc){
		this.ftyr_trad_amt_etc = ftyr_trad_amt_etc;
	}

	public void setFtyr_trans_amt_onta(String ftyr_trans_amt_onta){
		this.ftyr_trans_amt_onta = ftyr_trans_amt_onta;
	}

	public void setFtyr_trans_amt_etc(String ftyr_trans_amt_etc){
		this.ftyr_trans_amt_etc = ftyr_trans_amt_etc;
	}

	public void setCrdt_card_incd_pre_onta(String crdt_card_incd_pre_onta){
		this.crdt_card_incd_pre_onta = crdt_card_incd_pre_onta;
	}

	public void setCrdt_card_incd_pre_etc(String crdt_card_incd_pre_etc){
		this.crdt_card_incd_pre_etc = crdt_card_incd_pre_etc;
	}

	public void setDebit_card_incd_pre_onta(String debit_card_incd_pre_onta){
		this.debit_card_incd_pre_onta = debit_card_incd_pre_onta;
	}

	public void setDebit_card_incd_pre_etc(String debit_card_incd_pre_etc){
		this.debit_card_incd_pre_etc = debit_card_incd_pre_etc;
	}

	public void setCash_rcpt_incd_pre_onta(String cash_rcpt_incd_pre_onta){
		this.cash_rcpt_incd_pre_onta = cash_rcpt_incd_pre_onta;
	}

	public void setTrad_pre_amt_onta(String trad_pre_amt_onta){
		this.trad_pre_amt_onta = trad_pre_amt_onta;
	}

	public void setTrad_pre_amt_etc(String trad_pre_amt_etc){
		this.trad_pre_amt_etc = trad_pre_amt_etc;
	}

	public void setTrans_pre_amt_onta(String trans_pre_amt_onta){
		this.trans_pre_amt_onta = trans_pre_amt_onta;
	}

	public void setTrans_pre_amt_etc(String trans_pre_amt_etc){
		this.trans_pre_amt_etc = trans_pre_amt_etc;
	}

	public void setCrdt_card_tot_amt_onta(String crdt_card_tot_amt_onta){
		this.crdt_card_tot_amt_onta = crdt_card_tot_amt_onta;
	}

	public void setCrdt_card_tot_amt_etc(String crdt_card_tot_amt_etc){
		this.crdt_card_tot_amt_etc = crdt_card_tot_amt_etc;
	}

	public void setDebit_card_1st_amt_onta(String debit_card_1st_amt_onta){
		this.debit_card_1st_amt_onta = debit_card_1st_amt_onta;
	}

	public void setDebit_card_2nd_amt_onta(String debit_card_2nd_amt_onta){
		this.debit_card_2nd_amt_onta = debit_card_2nd_amt_onta;
	}

	public void setDebit_card_1st_amt_etc(String debit_card_1st_amt_etc){
		this.debit_card_1st_amt_etc = debit_card_1st_amt_etc;
	}

	public void setDebit_card_2nd_amt_etc(String debit_card_2nd_amt_etc){
		this.debit_card_2nd_amt_etc = debit_card_2nd_amt_etc;
	}

	public void setCash_rcpt_1st_onta(String cash_rcpt_1st_onta){
		this.cash_rcpt_1st_onta = cash_rcpt_1st_onta;
	}

	public void setCash_rcpt_2nd_onta(String cash_rcpt_2nd_onta){
		this.cash_rcpt_2nd_onta = cash_rcpt_2nd_onta;
	}

	public void setTrad_all_1st_amt_onta(String trad_all_1st_amt_onta){
		this.trad_all_1st_amt_onta = trad_all_1st_amt_onta;
	}

	public void setTrad_all_2nd_amt_onta(String trad_all_2nd_amt_onta){
		this.trad_all_2nd_amt_onta = trad_all_2nd_amt_onta;
	}

	public void setTrad_all_1st_amt_etc(String trad_all_1st_amt_etc){
		this.trad_all_1st_amt_etc = trad_all_1st_amt_etc;
	}

	public void setTrad_all_2nd_amt_etc(String trad_all_2nd_amt_etc){
		this.trad_all_2nd_amt_etc = trad_all_2nd_amt_etc;
	}

	public void setTrans_all_1st_amt_onta(String trans_all_1st_amt_onta){
		this.trans_all_1st_amt_onta = trans_all_1st_amt_onta;
	}

	public void setTrans_all_2nd_amt_onta(String trans_all_2nd_amt_onta){
		this.trans_all_2nd_amt_onta = trans_all_2nd_amt_onta;
	}

	public void setTrans_all_1st_amt_etc(String trans_all_1st_amt_etc){
		this.trans_all_1st_amt_etc = trans_all_1st_amt_etc;
	}

	public void setTrans_all_2nd_amt_etc(String trans_all_2nd_amt_etc){
		this.trans_all_2nd_amt_etc = trans_all_2nd_amt_etc;
	}

	public String getAdjm_rvrs_yy(){
		return this.adjm_rvrs_yy;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getFaml_seq(){
		return this.faml_seq;
	}

	public String getBase_dduc_yn(){
		return this.base_dduc_yn;
	}

	public String getObcl_pers_dduc_yn(){
		return this.obcl_pers_dduc_yn;
	}

	public String getFml_hshd_dduc_yn(){
		return this.fml_hshd_dduc_yn;
	}

	public String getCare_fee_dduc_yn(){
		return this.care_fee_dduc_yn;
	}

	public String getOne_paren_dduc_yn(){
		return this.one_paren_dduc_yn;
	}

	public String getFaml_rshp_cd(){
		return this.faml_rshp_cd;
	}

	public String getFaml_flnm(){
		return this.faml_flnm;
	}

	public String getFaml_prn(){
		return this.faml_prn;
	}

	public String getAdopt_dt(){
		return this.adopt_dt;
	}

	public String getDth_dt(){
		return this.dth_dt;
	}

	public String getEdu_suppamt(){
		return this.edu_suppamt;
	}

	public String getEdu_fee_clsf_cd(){
		return this.edu_fee_clsf_cd;
	}

	public String getEdu_cost_onta(){
		return this.edu_cost_onta;
	}

	public String getEdu_cost_etc(){
		return this.edu_cost_etc;
	}

	public String getEdu_splen_pers_onta(){
		return this.edu_splen_pers_onta;
	}

	public String getEdu_splen_pers_etc(){
		return this.edu_splen_pers_etc;
	}

	public String getHeal_suppamt(){
		return this.heal_suppamt;
	}

	public String getHosp_cost_onta(){
		return this.hosp_cost_onta;
	}

	public String getHosp_cost_etc(){
		return this.hosp_cost_etc;
	}

	public String getAsrc_prpn_insr_fee_onta(){
		return this.asrc_prpn_insr_fee_onta;
	}

	public String getAsrc_prpn_insr_fee_etc(){
		return this.asrc_prpn_insr_fee_etc;
	}

	public String getObcl_pers_insr_onta(){
		return this.obcl_pers_insr_onta;
	}

	public String getObcl_pers_insr_etc(){
		return this.obcl_pers_insr_etc;
	}

	public String getNonprofit_dona_amt_etc(){
		return this.nonprofit_dona_amt_etc;
	}

	public String getRelg_appm_dona_amt_etc(){
		return this.relg_appm_dona_amt_etc;
	}

	public String getAppm_dona_amt_etc(){
		return this.appm_dona_amt_etc;
	}

	public String getLgl_dona_amt_etc(){
		return this.lgl_dona_amt_etc;
	}

	public String getDduc_polt_fund(){
		return this.dduc_polt_fund;
	}

	public String getObcl_pers_clsf(){
		return this.obcl_pers_clsf;
	}

	public String getSpc_case_dona_amt_etc(){
		return this.spc_case_dona_amt_etc;
	}

	public String getFtyr_crdt_card_onta(){
		return this.ftyr_crdt_card_onta;
	}

	public String getFtyr_crdt_card_etc(){
		return this.ftyr_crdt_card_etc;
	}

	public String getFtyr_debit_card_onta(){
		return this.ftyr_debit_card_onta;
	}

	public String getFtyr_debit_card_etc(){
		return this.ftyr_debit_card_etc;
	}

	public String getFtyr_cash_rcpt_onta(){
		return this.ftyr_cash_rcpt_onta;
	}

	public String getFtyr_trad_amt_onta(){
		return this.ftyr_trad_amt_onta;
	}

	public String getFtyr_trad_amt_etc(){
		return this.ftyr_trad_amt_etc;
	}

	public String getFtyr_trans_amt_onta(){
		return this.ftyr_trans_amt_onta;
	}

	public String getFtyr_trans_amt_etc(){
		return this.ftyr_trans_amt_etc;
	}

	public String getCrdt_card_incd_pre_onta(){
		return this.crdt_card_incd_pre_onta;
	}

	public String getCrdt_card_incd_pre_etc(){
		return this.crdt_card_incd_pre_etc;
	}

	public String getDebit_card_incd_pre_onta(){
		return this.debit_card_incd_pre_onta;
	}

	public String getDebit_card_incd_pre_etc(){
		return this.debit_card_incd_pre_etc;
	}

	public String getCash_rcpt_incd_pre_onta(){
		return this.cash_rcpt_incd_pre_onta;
	}

	public String getTrad_pre_amt_onta(){
		return this.trad_pre_amt_onta;
	}

	public String getTrad_pre_amt_etc(){
		return this.trad_pre_amt_etc;
	}

	public String getTrans_pre_amt_onta(){
		return this.trans_pre_amt_onta;
	}

	public String getTrans_pre_amt_etc(){
		return this.trans_pre_amt_etc;
	}

	public String getCrdt_card_tot_amt_onta(){
		return this.crdt_card_tot_amt_onta;
	}

	public String getCrdt_card_tot_amt_etc(){
		return this.crdt_card_tot_amt_etc;
	}

	public String getDebit_card_1st_amt_onta(){
		return this.debit_card_1st_amt_onta;
	}

	public String getDebit_card_2nd_amt_onta(){
		return this.debit_card_2nd_amt_onta;
	}

	public String getDebit_card_1st_amt_etc(){
		return this.debit_card_1st_amt_etc;
	}

	public String getDebit_card_2nd_amt_etc(){
		return this.debit_card_2nd_amt_etc;
	}

	public String getCash_rcpt_1st_onta(){
		return this.cash_rcpt_1st_onta;
	}

	public String getCash_rcpt_2nd_onta(){
		return this.cash_rcpt_2nd_onta;
	}

	public String getTrad_all_1st_amt_onta(){
		return this.trad_all_1st_amt_onta;
	}

	public String getTrad_all_2nd_amt_onta(){
		return this.trad_all_2nd_amt_onta;
	}

	public String getTrad_all_1st_amt_etc(){
		return this.trad_all_1st_amt_etc;
	}

	public String getTrad_all_2nd_amt_etc(){
		return this.trad_all_2nd_amt_etc;
	}

	public String getTrans_all_1st_amt_onta(){
		return this.trans_all_1st_amt_onta;
	}

	public String getTrans_all_2nd_amt_onta(){
		return this.trans_all_2nd_amt_onta;
	}

	public String getTrans_all_1st_amt_etc(){
		return this.trans_all_1st_amt_etc;
	}

	public String getTrans_all_2nd_amt_etc(){
		return this.trans_all_2nd_amt_etc;
	}
}

/* 작성시간 : Fri Jan 15 10:37:28 KST 2016 */
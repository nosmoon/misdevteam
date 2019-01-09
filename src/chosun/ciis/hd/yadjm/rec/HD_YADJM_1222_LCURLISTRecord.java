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


public class HD_YADJM_1222_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String adjm_rvrs_yy;
	public String emp_no;
	public String faml_seq;
	public String faml_rshp_cd;
	public String faml_prn;
	public String faml_flnm;
	public String asrc_prpn_insr_fee_onta;
	public String asrc_prpn_insr_fee_etc;
	public String obcl_pers_insr_onta;
	public String obcl_pers_insr_etc;
	public String hosp_cost_slf_onta;
	public String hosp_cost_slf_etc;
	public String hosp_fee_onta;
	public String hosp_fee_etc;
	public String lgl_dona_amt_onta;
	public String lgl_dona_amt_etc;
	public String spc_case_dona_amt_onta;
	public String spc_case_dona_amt_etc;
	public String emp_stok_ownr_onta;
	public String emp_stok_ownr_etc;
	public String appm_dona_amt_onta;
	public String appm_dona_amt_etc;
	public String relg_appm_dona_amt_onta;
	public String relg_appm_dona_amt_etc;
	public String edu_cost_slf_sclgg_onta;
	public String edu_cost_slf_sclgg_etc;
	public String edu_cost_slf_onta;
	public String edu_cost_slf_etc;
	public String edu_cost_ent_scl_onta;
	public String edu_cost_ent_scl_etc;
	public String edu_cost_elmihi_onta;
	public String edu_cost_elmihi_etc;
	public String edu_cost_univ_onta;
	public String edu_cost_univ_etc;
	public String edu_splen_pers_onta;
	public String edu_splen_pers_etc;
	public String crdt_card_tot_amt_onta;
	public String crdt_card_tot_amt_etc;
	public String edu_cost_giro_pymt_onta;
	public String edu_cost_giro_pymt_etc;
	public String cash_rcpt_onta;

	public HD_YADJM_1222_LCURLISTRecord(){}

	public void setAdjm_rvrs_yy(String adjm_rvrs_yy){
		this.adjm_rvrs_yy = adjm_rvrs_yy;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setFaml_seq(String faml_seq){
		this.faml_seq = faml_seq;
	}

	public void setFaml_rshp_cd(String faml_rshp_cd){
		this.faml_rshp_cd = faml_rshp_cd;
	}

	public void setFaml_prn(String faml_prn){
		this.faml_prn = faml_prn;
	}

	public void setFaml_flnm(String faml_flnm){
		this.faml_flnm = faml_flnm;
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

	public void setHosp_cost_slf_onta(String hosp_cost_slf_onta){
		this.hosp_cost_slf_onta = hosp_cost_slf_onta;
	}

	public void setHosp_cost_slf_etc(String hosp_cost_slf_etc){
		this.hosp_cost_slf_etc = hosp_cost_slf_etc;
	}

	public void setHosp_fee_onta(String hosp_fee_onta){
		this.hosp_fee_onta = hosp_fee_onta;
	}

	public void setHosp_fee_etc(String hosp_fee_etc){
		this.hosp_fee_etc = hosp_fee_etc;
	}

	public void setLgl_dona_amt_onta(String lgl_dona_amt_onta){
		this.lgl_dona_amt_onta = lgl_dona_amt_onta;
	}

	public void setLgl_dona_amt_etc(String lgl_dona_amt_etc){
		this.lgl_dona_amt_etc = lgl_dona_amt_etc;
	}

	public void setSpc_case_dona_amt_onta(String spc_case_dona_amt_onta){
		this.spc_case_dona_amt_onta = spc_case_dona_amt_onta;
	}

	public void setSpc_case_dona_amt_etc(String spc_case_dona_amt_etc){
		this.spc_case_dona_amt_etc = spc_case_dona_amt_etc;
	}

	public void setEmp_stok_ownr_onta(String emp_stok_ownr_onta){
		this.emp_stok_ownr_onta = emp_stok_ownr_onta;
	}

	public void setEmp_stok_ownr_etc(String emp_stok_ownr_etc){
		this.emp_stok_ownr_etc = emp_stok_ownr_etc;
	}

	public void setAppm_dona_amt_onta(String appm_dona_amt_onta){
		this.appm_dona_amt_onta = appm_dona_amt_onta;
	}

	public void setAppm_dona_amt_etc(String appm_dona_amt_etc){
		this.appm_dona_amt_etc = appm_dona_amt_etc;
	}

	public void setRelg_appm_dona_amt_onta(String relg_appm_dona_amt_onta){
		this.relg_appm_dona_amt_onta = relg_appm_dona_amt_onta;
	}

	public void setRelg_appm_dona_amt_etc(String relg_appm_dona_amt_etc){
		this.relg_appm_dona_amt_etc = relg_appm_dona_amt_etc;
	}

	public void setEdu_cost_slf_sclgg_onta(String edu_cost_slf_sclgg_onta){
		this.edu_cost_slf_sclgg_onta = edu_cost_slf_sclgg_onta;
	}

	public void setEdu_cost_slf_sclgg_etc(String edu_cost_slf_sclgg_etc){
		this.edu_cost_slf_sclgg_etc = edu_cost_slf_sclgg_etc;
	}

	public void setEdu_cost_slf_onta(String edu_cost_slf_onta){
		this.edu_cost_slf_onta = edu_cost_slf_onta;
	}

	public void setEdu_cost_slf_etc(String edu_cost_slf_etc){
		this.edu_cost_slf_etc = edu_cost_slf_etc;
	}

	public void setEdu_cost_ent_scl_onta(String edu_cost_ent_scl_onta){
		this.edu_cost_ent_scl_onta = edu_cost_ent_scl_onta;
	}

	public void setEdu_cost_ent_scl_etc(String edu_cost_ent_scl_etc){
		this.edu_cost_ent_scl_etc = edu_cost_ent_scl_etc;
	}

	public void setEdu_cost_elmihi_onta(String edu_cost_elmihi_onta){
		this.edu_cost_elmihi_onta = edu_cost_elmihi_onta;
	}

	public void setEdu_cost_elmihi_etc(String edu_cost_elmihi_etc){
		this.edu_cost_elmihi_etc = edu_cost_elmihi_etc;
	}

	public void setEdu_cost_univ_onta(String edu_cost_univ_onta){
		this.edu_cost_univ_onta = edu_cost_univ_onta;
	}

	public void setEdu_cost_univ_etc(String edu_cost_univ_etc){
		this.edu_cost_univ_etc = edu_cost_univ_etc;
	}

	public void setEdu_splen_pers_onta(String edu_splen_pers_onta){
		this.edu_splen_pers_onta = edu_splen_pers_onta;
	}

	public void setEdu_splen_pers_etc(String edu_splen_pers_etc){
		this.edu_splen_pers_etc = edu_splen_pers_etc;
	}

	public void setCrdt_card_tot_amt_onta(String crdt_card_tot_amt_onta){
		this.crdt_card_tot_amt_onta = crdt_card_tot_amt_onta;
	}

	public void setCrdt_card_tot_amt_etc(String crdt_card_tot_amt_etc){
		this.crdt_card_tot_amt_etc = crdt_card_tot_amt_etc;
	}

	public void setEdu_cost_giro_pymt_onta(String edu_cost_giro_pymt_onta){
		this.edu_cost_giro_pymt_onta = edu_cost_giro_pymt_onta;
	}

	public void setEdu_cost_giro_pymt_etc(String edu_cost_giro_pymt_etc){
		this.edu_cost_giro_pymt_etc = edu_cost_giro_pymt_etc;
	}

	public void setCash_rcpt_onta(String cash_rcpt_onta){
		this.cash_rcpt_onta = cash_rcpt_onta;
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

	public String getFaml_rshp_cd(){
		return this.faml_rshp_cd;
	}

	public String getFaml_prn(){
		return this.faml_prn;
	}

	public String getFaml_flnm(){
		return this.faml_flnm;
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

	public String getHosp_cost_slf_onta(){
		return this.hosp_cost_slf_onta;
	}

	public String getHosp_cost_slf_etc(){
		return this.hosp_cost_slf_etc;
	}

	public String getHosp_fee_onta(){
		return this.hosp_fee_onta;
	}

	public String getHosp_fee_etc(){
		return this.hosp_fee_etc;
	}

	public String getLgl_dona_amt_onta(){
		return this.lgl_dona_amt_onta;
	}

	public String getLgl_dona_amt_etc(){
		return this.lgl_dona_amt_etc;
	}

	public String getSpc_case_dona_amt_onta(){
		return this.spc_case_dona_amt_onta;
	}

	public String getSpc_case_dona_amt_etc(){
		return this.spc_case_dona_amt_etc;
	}

	public String getEmp_stok_ownr_onta(){
		return this.emp_stok_ownr_onta;
	}

	public String getEmp_stok_ownr_etc(){
		return this.emp_stok_ownr_etc;
	}

	public String getAppm_dona_amt_onta(){
		return this.appm_dona_amt_onta;
	}

	public String getAppm_dona_amt_etc(){
		return this.appm_dona_amt_etc;
	}

	public String getRelg_appm_dona_amt_onta(){
		return this.relg_appm_dona_amt_onta;
	}

	public String getRelg_appm_dona_amt_etc(){
		return this.relg_appm_dona_amt_etc;
	}

	public String getEdu_cost_slf_sclgg_onta(){
		return this.edu_cost_slf_sclgg_onta;
	}

	public String getEdu_cost_slf_sclgg_etc(){
		return this.edu_cost_slf_sclgg_etc;
	}

	public String getEdu_cost_slf_onta(){
		return this.edu_cost_slf_onta;
	}

	public String getEdu_cost_slf_etc(){
		return this.edu_cost_slf_etc;
	}

	public String getEdu_cost_ent_scl_onta(){
		return this.edu_cost_ent_scl_onta;
	}

	public String getEdu_cost_ent_scl_etc(){
		return this.edu_cost_ent_scl_etc;
	}

	public String getEdu_cost_elmihi_onta(){
		return this.edu_cost_elmihi_onta;
	}

	public String getEdu_cost_elmihi_etc(){
		return this.edu_cost_elmihi_etc;
	}

	public String getEdu_cost_univ_onta(){
		return this.edu_cost_univ_onta;
	}

	public String getEdu_cost_univ_etc(){
		return this.edu_cost_univ_etc;
	}

	public String getEdu_splen_pers_onta(){
		return this.edu_splen_pers_onta;
	}

	public String getEdu_splen_pers_etc(){
		return this.edu_splen_pers_etc;
	}

	public String getCrdt_card_tot_amt_onta(){
		return this.crdt_card_tot_amt_onta;
	}

	public String getCrdt_card_tot_amt_etc(){
		return this.crdt_card_tot_amt_etc;
	}

	public String getEdu_cost_giro_pymt_onta(){
		return this.edu_cost_giro_pymt_onta;
	}

	public String getEdu_cost_giro_pymt_etc(){
		return this.edu_cost_giro_pymt_etc;
	}

	public String getCash_rcpt_onta(){
		return this.cash_rcpt_onta;
	}
}

/* 작성시간 : Sun Aug 23 17:01:03 KST 2009 */
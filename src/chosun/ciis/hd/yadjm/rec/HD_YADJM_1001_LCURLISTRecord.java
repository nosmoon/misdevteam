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


public class HD_YADJM_1001_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String adjm_yy;
	public String slf_dduc_amt;
	public String spos_dduc_amt;
	public String child_dduc_amt;
	public String child_dduc_basi_yy;
	public String prnt_dduc_amt_1;
	public String prnt_dduc_basi_yy_1;
	public String prnt_dduc_amt_2;
	public String prnt_dduc_basi_yy_2;
	public String brth_istt_amt_1;
	public String brth_istt_basi_yy_1;
	public String brth_istt_amt_2;
	public String brth_istt_basi_yy_2;
	public String brth_istt_amt_3;
	public String brth_istt_basi_yy_3;
	public String rspc_dduc_amt_1;
	public String rspc_dduc_basi_yy_1_fr;
	public String rspc_dduc_basi_yy_1_to;
	public String rspc_dduc_amt_2;
	public String rspc_dduc_basi_yy_2;
	public String obcl_pers_dduc_amt;
	public String fml_dduc_amt;
	public String child_care_fee_dduc_amt;
	public String mlt_chld_basi_dduc_amt;
	public String mlt_chld_pers_dduc_amt;
	public String mlt_chld_birth_dduc_amt;
	public String one_paren_dduc_amt;
	public String gnr_insr_limt_amt;
	public String obcl_pers_insr_limt_amt;
	public String hosp_fee_basi_ratio;
	public String hosp_fee_limt_amt;
	public String baby_edu_fee;
	public String elmihi_edu_fee;
	public String univ_edu_fee;
	public String hous_savg_aply_ratio;
	public String hous_savg_aply_limt_amt;
	public String hous_hire_aply_ratio;
	public String hous_hire_aply_limt_amt;
	public String ltrm_hous_loan_amt_limt_amt_1;
	public String ltrm_hous_loan_amt_limt_amt_2;
	public String ltrm_hous_loan_amt_limt_amt_3;
	public String wedd_fnrl_movm_widr_amt;
	public String wedd_fnrl_movm_tot_saly_amt;
	public String wedd_fnrl_movm_dduc_incm_amt;
	public String std_dduc_amt;
	public String prsn_pens_savg_ratio;
	public String prsn_pens_savg_limt_amt;
	public String pens_savg_limt_amt;
	public String invsm_cmpd_invsm_ratio;
	public String lvcmpy_pens_limt_amt;
	public String emp_stok_ownr_limt_amt;
	public String crdt_card_tot_saly_ratio;
	public String crdt_card_excs_amt_ratio;
	public String crdt_card_limt_amt;
	public String monthly_rent_amt_ratio;
	public String no_lar_sum_lease_limt_amt;
	public String no_lar_sum_lease_limt_ratio;

	public HD_YADJM_1001_LCURLISTRecord(){}

	public void setAdjm_yy(String adjm_yy){
		this.adjm_yy = adjm_yy;
	}

	public void setSlf_dduc_amt(String slf_dduc_amt){
		this.slf_dduc_amt = slf_dduc_amt;
	}

	public void setSpos_dduc_amt(String spos_dduc_amt){
		this.spos_dduc_amt = spos_dduc_amt;
	}

	public void setChild_dduc_amt(String child_dduc_amt){
		this.child_dduc_amt = child_dduc_amt;
	}

	public void setChild_dduc_basi_yy(String child_dduc_basi_yy){
		this.child_dduc_basi_yy = child_dduc_basi_yy;
	}

	public void setPrnt_dduc_amt_1(String prnt_dduc_amt_1){
		this.prnt_dduc_amt_1 = prnt_dduc_amt_1;
	}

	public void setPrnt_dduc_basi_yy_1(String prnt_dduc_basi_yy_1){
		this.prnt_dduc_basi_yy_1 = prnt_dduc_basi_yy_1;
	}

	public void setPrnt_dduc_amt_2(String prnt_dduc_amt_2){
		this.prnt_dduc_amt_2 = prnt_dduc_amt_2;
	}

	public void setPrnt_dduc_basi_yy_2(String prnt_dduc_basi_yy_2){
		this.prnt_dduc_basi_yy_2 = prnt_dduc_basi_yy_2;
	}

	public void setBrth_istt_amt_1(String brth_istt_amt_1){
		this.brth_istt_amt_1 = brth_istt_amt_1;
	}

	public void setBrth_istt_basi_yy_1(String brth_istt_basi_yy_1){
		this.brth_istt_basi_yy_1 = brth_istt_basi_yy_1;
	}

	public void setBrth_istt_amt_2(String brth_istt_amt_2){
		this.brth_istt_amt_2 = brth_istt_amt_2;
	}

	public void setBrth_istt_basi_yy_2(String brth_istt_basi_yy_2){
		this.brth_istt_basi_yy_2 = brth_istt_basi_yy_2;
	}

	public void setBrth_istt_amt_3(String brth_istt_amt_3){
		this.brth_istt_amt_3 = brth_istt_amt_3;
	}

	public void setBrth_istt_basi_yy_3(String brth_istt_basi_yy_3){
		this.brth_istt_basi_yy_3 = brth_istt_basi_yy_3;
	}

	public void setRspc_dduc_amt_1(String rspc_dduc_amt_1){
		this.rspc_dduc_amt_1 = rspc_dduc_amt_1;
	}

	public void setRspc_dduc_basi_yy_1_fr(String rspc_dduc_basi_yy_1_fr){
		this.rspc_dduc_basi_yy_1_fr = rspc_dduc_basi_yy_1_fr;
	}

	public void setRspc_dduc_basi_yy_1_to(String rspc_dduc_basi_yy_1_to){
		this.rspc_dduc_basi_yy_1_to = rspc_dduc_basi_yy_1_to;
	}

	public void setRspc_dduc_amt_2(String rspc_dduc_amt_2){
		this.rspc_dduc_amt_2 = rspc_dduc_amt_2;
	}

	public void setRspc_dduc_basi_yy_2(String rspc_dduc_basi_yy_2){
		this.rspc_dduc_basi_yy_2 = rspc_dduc_basi_yy_2;
	}

	public void setObcl_pers_dduc_amt(String obcl_pers_dduc_amt){
		this.obcl_pers_dduc_amt = obcl_pers_dduc_amt;
	}

	public void setFml_dduc_amt(String fml_dduc_amt){
		this.fml_dduc_amt = fml_dduc_amt;
	}

	public void setChild_care_fee_dduc_amt(String child_care_fee_dduc_amt){
		this.child_care_fee_dduc_amt = child_care_fee_dduc_amt;
	}

	public void setMlt_chld_basi_dduc_amt(String mlt_chld_basi_dduc_amt){
		this.mlt_chld_basi_dduc_amt = mlt_chld_basi_dduc_amt;
	}

	public void setMlt_chld_pers_dduc_amt(String mlt_chld_pers_dduc_amt){
		this.mlt_chld_pers_dduc_amt = mlt_chld_pers_dduc_amt;
	}

	public void setMlt_chld_birth_dduc_amt(String mlt_chld_birth_dduc_amt){
		this.mlt_chld_birth_dduc_amt = mlt_chld_birth_dduc_amt;
	}

	public void setOne_paren_dduc_amt(String one_paren_dduc_amt){
		this.one_paren_dduc_amt = one_paren_dduc_amt;
	}

	public void setGnr_insr_limt_amt(String gnr_insr_limt_amt){
		this.gnr_insr_limt_amt = gnr_insr_limt_amt;
	}

	public void setObcl_pers_insr_limt_amt(String obcl_pers_insr_limt_amt){
		this.obcl_pers_insr_limt_amt = obcl_pers_insr_limt_amt;
	}

	public void setHosp_fee_basi_ratio(String hosp_fee_basi_ratio){
		this.hosp_fee_basi_ratio = hosp_fee_basi_ratio;
	}

	public void setHosp_fee_limt_amt(String hosp_fee_limt_amt){
		this.hosp_fee_limt_amt = hosp_fee_limt_amt;
	}

	public void setBaby_edu_fee(String baby_edu_fee){
		this.baby_edu_fee = baby_edu_fee;
	}

	public void setElmihi_edu_fee(String elmihi_edu_fee){
		this.elmihi_edu_fee = elmihi_edu_fee;
	}

	public void setUniv_edu_fee(String univ_edu_fee){
		this.univ_edu_fee = univ_edu_fee;
	}

	public void setHous_savg_aply_ratio(String hous_savg_aply_ratio){
		this.hous_savg_aply_ratio = hous_savg_aply_ratio;
	}

	public void setHous_savg_aply_limt_amt(String hous_savg_aply_limt_amt){
		this.hous_savg_aply_limt_amt = hous_savg_aply_limt_amt;
	}

	public void setHous_hire_aply_ratio(String hous_hire_aply_ratio){
		this.hous_hire_aply_ratio = hous_hire_aply_ratio;
	}

	public void setHous_hire_aply_limt_amt(String hous_hire_aply_limt_amt){
		this.hous_hire_aply_limt_amt = hous_hire_aply_limt_amt;
	}

	public void setLtrm_hous_loan_amt_limt_amt_1(String ltrm_hous_loan_amt_limt_amt_1){
		this.ltrm_hous_loan_amt_limt_amt_1 = ltrm_hous_loan_amt_limt_amt_1;
	}

	public void setLtrm_hous_loan_amt_limt_amt_2(String ltrm_hous_loan_amt_limt_amt_2){
		this.ltrm_hous_loan_amt_limt_amt_2 = ltrm_hous_loan_amt_limt_amt_2;
	}

	public void setLtrm_hous_loan_amt_limt_amt_3(String ltrm_hous_loan_amt_limt_amt_3){
		this.ltrm_hous_loan_amt_limt_amt_3 = ltrm_hous_loan_amt_limt_amt_3;
	}

	public void setWedd_fnrl_movm_widr_amt(String wedd_fnrl_movm_widr_amt){
		this.wedd_fnrl_movm_widr_amt = wedd_fnrl_movm_widr_amt;
	}

	public void setWedd_fnrl_movm_tot_saly_amt(String wedd_fnrl_movm_tot_saly_amt){
		this.wedd_fnrl_movm_tot_saly_amt = wedd_fnrl_movm_tot_saly_amt;
	}

	public void setWedd_fnrl_movm_dduc_incm_amt(String wedd_fnrl_movm_dduc_incm_amt){
		this.wedd_fnrl_movm_dduc_incm_amt = wedd_fnrl_movm_dduc_incm_amt;
	}

	public void setStd_dduc_amt(String std_dduc_amt){
		this.std_dduc_amt = std_dduc_amt;
	}

	public void setPrsn_pens_savg_ratio(String prsn_pens_savg_ratio){
		this.prsn_pens_savg_ratio = prsn_pens_savg_ratio;
	}

	public void setPrsn_pens_savg_limt_amt(String prsn_pens_savg_limt_amt){
		this.prsn_pens_savg_limt_amt = prsn_pens_savg_limt_amt;
	}

	public void setPens_savg_limt_amt(String pens_savg_limt_amt){
		this.pens_savg_limt_amt = pens_savg_limt_amt;
	}

	public void setInvsm_cmpd_invsm_ratio(String invsm_cmpd_invsm_ratio){
		this.invsm_cmpd_invsm_ratio = invsm_cmpd_invsm_ratio;
	}

	public void setLvcmpy_pens_limt_amt(String lvcmpy_pens_limt_amt){
		this.lvcmpy_pens_limt_amt = lvcmpy_pens_limt_amt;
	}

	public void setEmp_stok_ownr_limt_amt(String emp_stok_ownr_limt_amt){
		this.emp_stok_ownr_limt_amt = emp_stok_ownr_limt_amt;
	}

	public void setCrdt_card_tot_saly_ratio(String crdt_card_tot_saly_ratio){
		this.crdt_card_tot_saly_ratio = crdt_card_tot_saly_ratio;
	}

	public void setCrdt_card_excs_amt_ratio(String crdt_card_excs_amt_ratio){
		this.crdt_card_excs_amt_ratio = crdt_card_excs_amt_ratio;
	}

	public void setCrdt_card_limt_amt(String crdt_card_limt_amt){
		this.crdt_card_limt_amt = crdt_card_limt_amt;
	}

	public void setMonthly_rent_amt_ratio(String monthly_rent_amt_ratio){
		this.monthly_rent_amt_ratio = monthly_rent_amt_ratio;
	}

	public void setNo_lar_sum_lease_limt_amt(String no_lar_sum_lease_limt_amt){
		this.no_lar_sum_lease_limt_amt = no_lar_sum_lease_limt_amt;
	}

	public void setNo_lar_sum_lease_limt_ratio(String no_lar_sum_lease_limt_ratio){
		this.no_lar_sum_lease_limt_ratio = no_lar_sum_lease_limt_ratio;
	}

	public String getAdjm_yy(){
		return this.adjm_yy;
	}

	public String getSlf_dduc_amt(){
		return this.slf_dduc_amt;
	}

	public String getSpos_dduc_amt(){
		return this.spos_dduc_amt;
	}

	public String getChild_dduc_amt(){
		return this.child_dduc_amt;
	}

	public String getChild_dduc_basi_yy(){
		return this.child_dduc_basi_yy;
	}

	public String getPrnt_dduc_amt_1(){
		return this.prnt_dduc_amt_1;
	}

	public String getPrnt_dduc_basi_yy_1(){
		return this.prnt_dduc_basi_yy_1;
	}

	public String getPrnt_dduc_amt_2(){
		return this.prnt_dduc_amt_2;
	}

	public String getPrnt_dduc_basi_yy_2(){
		return this.prnt_dduc_basi_yy_2;
	}

	public String getBrth_istt_amt_1(){
		return this.brth_istt_amt_1;
	}

	public String getBrth_istt_basi_yy_1(){
		return this.brth_istt_basi_yy_1;
	}

	public String getBrth_istt_amt_2(){
		return this.brth_istt_amt_2;
	}

	public String getBrth_istt_basi_yy_2(){
		return this.brth_istt_basi_yy_2;
	}

	public String getBrth_istt_amt_3(){
		return this.brth_istt_amt_3;
	}

	public String getBrth_istt_basi_yy_3(){
		return this.brth_istt_basi_yy_3;
	}

	public String getRspc_dduc_amt_1(){
		return this.rspc_dduc_amt_1;
	}

	public String getRspc_dduc_basi_yy_1_fr(){
		return this.rspc_dduc_basi_yy_1_fr;
	}

	public String getRspc_dduc_basi_yy_1_to(){
		return this.rspc_dduc_basi_yy_1_to;
	}

	public String getRspc_dduc_amt_2(){
		return this.rspc_dduc_amt_2;
	}

	public String getRspc_dduc_basi_yy_2(){
		return this.rspc_dduc_basi_yy_2;
	}

	public String getObcl_pers_dduc_amt(){
		return this.obcl_pers_dduc_amt;
	}

	public String getFml_dduc_amt(){
		return this.fml_dduc_amt;
	}

	public String getChild_care_fee_dduc_amt(){
		return this.child_care_fee_dduc_amt;
	}

	public String getMlt_chld_basi_dduc_amt(){
		return this.mlt_chld_basi_dduc_amt;
	}

	public String getMlt_chld_pers_dduc_amt(){
		return this.mlt_chld_pers_dduc_amt;
	}

	public String getMlt_chld_birth_dduc_amt(){
		return this.mlt_chld_birth_dduc_amt;
	}

	public String getOne_paren_dduc_amt(){
		return this.one_paren_dduc_amt;
	}

	public String getGnr_insr_limt_amt(){
		return this.gnr_insr_limt_amt;
	}

	public String getObcl_pers_insr_limt_amt(){
		return this.obcl_pers_insr_limt_amt;
	}

	public String getHosp_fee_basi_ratio(){
		return this.hosp_fee_basi_ratio;
	}

	public String getHosp_fee_limt_amt(){
		return this.hosp_fee_limt_amt;
	}

	public String getBaby_edu_fee(){
		return this.baby_edu_fee;
	}

	public String getElmihi_edu_fee(){
		return this.elmihi_edu_fee;
	}

	public String getUniv_edu_fee(){
		return this.univ_edu_fee;
	}

	public String getHous_savg_aply_ratio(){
		return this.hous_savg_aply_ratio;
	}

	public String getHous_savg_aply_limt_amt(){
		return this.hous_savg_aply_limt_amt;
	}

	public String getHous_hire_aply_ratio(){
		return this.hous_hire_aply_ratio;
	}

	public String getHous_hire_aply_limt_amt(){
		return this.hous_hire_aply_limt_amt;
	}

	public String getLtrm_hous_loan_amt_limt_amt_1(){
		return this.ltrm_hous_loan_amt_limt_amt_1;
	}

	public String getLtrm_hous_loan_amt_limt_amt_2(){
		return this.ltrm_hous_loan_amt_limt_amt_2;
	}

	public String getLtrm_hous_loan_amt_limt_amt_3(){
		return this.ltrm_hous_loan_amt_limt_amt_3;
	}

	public String getWedd_fnrl_movm_widr_amt(){
		return this.wedd_fnrl_movm_widr_amt;
	}

	public String getWedd_fnrl_movm_tot_saly_amt(){
		return this.wedd_fnrl_movm_tot_saly_amt;
	}

	public String getWedd_fnrl_movm_dduc_incm_amt(){
		return this.wedd_fnrl_movm_dduc_incm_amt;
	}

	public String getStd_dduc_amt(){
		return this.std_dduc_amt;
	}

	public String getPrsn_pens_savg_ratio(){
		return this.prsn_pens_savg_ratio;
	}

	public String getPrsn_pens_savg_limt_amt(){
		return this.prsn_pens_savg_limt_amt;
	}

	public String getPens_savg_limt_amt(){
		return this.pens_savg_limt_amt;
	}

	public String getInvsm_cmpd_invsm_ratio(){
		return this.invsm_cmpd_invsm_ratio;
	}

	public String getLvcmpy_pens_limt_amt(){
		return this.lvcmpy_pens_limt_amt;
	}

	public String getEmp_stok_ownr_limt_amt(){
		return this.emp_stok_ownr_limt_amt;
	}

	public String getCrdt_card_tot_saly_ratio(){
		return this.crdt_card_tot_saly_ratio;
	}

	public String getCrdt_card_excs_amt_ratio(){
		return this.crdt_card_excs_amt_ratio;
	}

	public String getCrdt_card_limt_amt(){
		return this.crdt_card_limt_amt;
	}

	public String getMonthly_rent_amt_ratio(){
		return this.monthly_rent_amt_ratio;
	}

	public String getNo_lar_sum_lease_limt_amt(){
		return this.no_lar_sum_lease_limt_amt;
	}

	public String getNo_lar_sum_lease_limt_ratio(){
		return this.no_lar_sum_lease_limt_ratio;
	}
}

/* 작성시간 : Mon Dec 23 13:50:22 KST 2013 */
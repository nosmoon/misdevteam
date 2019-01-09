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


package chosun.ciis.hd.yadjm.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.yadjm.ds.*;
import chosun.ciis.hd.yadjm.rec.*;

/**
 * 
 */


public class HD_YADJM_1000_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String adjm_yy;
	public String incmg_pers_ip;
	public String incmg_pers;
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
	public String one_paren_dduc_amt;
	public String mlt_chld_basi_dduc_amt;
	public String mlt_chld_pers_dduc_amt;
	public String mlt_chld_birth_dduc_amt;
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
	public String ltrm_hous_loan_limt_amt_1;
	public String ltrm_hous_loan_limt_amt_2;
	public String ltrm_hous_loan_limt_amt_3;
	public String wedd_fnrl_movm_widr_amt;
	public String wedd_fnrl_movm_tot_saly_amt;
	public String wedd_fnrl_movm_incm_amt;
	public String std_dduc_amt;
	public String monthly_rent_amt_ratio;
	public String prsn_pens_savg_ratio;
	public String prsn_pens_savg_limt_amt;
	public String pens_savg_limt_amt;
	public String invsm_cmpd_invsm_ratio;
	public String lvcmpy_pens_limt_amt;
	public String emp_stok_ownr_limt_amt;
	public String crdt_card_tot_saly_ratio;
	public String crdt_card_excs_amt_ratio;
	public String crdt_card_limt_amt;
	public String no_lar_sum_lease_limt_amt;
	public String no_lar_sum_lease_limt_ratio;

	public HD_YADJM_1000_ADM(){}
	public HD_YADJM_1000_ADM(String cmpy_cd, String adjm_yy, String incmg_pers_ip, String incmg_pers, String slf_dduc_amt, String spos_dduc_amt, String child_dduc_amt, String child_dduc_basi_yy, String prnt_dduc_amt_1, String prnt_dduc_basi_yy_1, String prnt_dduc_amt_2, String prnt_dduc_basi_yy_2, String brth_istt_amt_1, String brth_istt_basi_yy_1, String brth_istt_amt_2, String brth_istt_basi_yy_2, String brth_istt_amt_3, String brth_istt_basi_yy_3, String rspc_dduc_amt_1, String rspc_dduc_basi_yy_1_fr, String rspc_dduc_basi_yy_1_to, String rspc_dduc_amt_2, String rspc_dduc_basi_yy_2, String obcl_pers_dduc_amt, String fml_dduc_amt, String child_care_fee_dduc_amt, String one_paren_dduc_amt, String mlt_chld_basi_dduc_amt, String mlt_chld_pers_dduc_amt, String mlt_chld_birth_dduc_amt, String gnr_insr_limt_amt, String obcl_pers_insr_limt_amt, String hosp_fee_basi_ratio, String hosp_fee_limt_amt, String baby_edu_fee, String elmihi_edu_fee, String univ_edu_fee, String hous_savg_aply_ratio, String hous_savg_aply_limt_amt, String hous_hire_aply_ratio, String hous_hire_aply_limt_amt, String ltrm_hous_loan_limt_amt_1, String ltrm_hous_loan_limt_amt_2, String ltrm_hous_loan_limt_amt_3, String wedd_fnrl_movm_widr_amt, String wedd_fnrl_movm_tot_saly_amt, String wedd_fnrl_movm_incm_amt, String std_dduc_amt, String monthly_rent_amt_ratio, String prsn_pens_savg_ratio, String prsn_pens_savg_limt_amt, String pens_savg_limt_amt, String invsm_cmpd_invsm_ratio, String lvcmpy_pens_limt_amt, String emp_stok_ownr_limt_amt, String crdt_card_tot_saly_ratio, String crdt_card_excs_amt_ratio, String crdt_card_limt_amt, String no_lar_sum_lease_limt_amt, String no_lar_sum_lease_limt_ratio){
		this.cmpy_cd = cmpy_cd;
		this.adjm_yy = adjm_yy;
		this.incmg_pers_ip = incmg_pers_ip;
		this.incmg_pers = incmg_pers;
		this.slf_dduc_amt = slf_dduc_amt;
		this.spos_dduc_amt = spos_dduc_amt;
		this.child_dduc_amt = child_dduc_amt;
		this.child_dduc_basi_yy = child_dduc_basi_yy;
		this.prnt_dduc_amt_1 = prnt_dduc_amt_1;
		this.prnt_dduc_basi_yy_1 = prnt_dduc_basi_yy_1;
		this.prnt_dduc_amt_2 = prnt_dduc_amt_2;
		this.prnt_dduc_basi_yy_2 = prnt_dduc_basi_yy_2;
		this.brth_istt_amt_1 = brth_istt_amt_1;
		this.brth_istt_basi_yy_1 = brth_istt_basi_yy_1;
		this.brth_istt_amt_2 = brth_istt_amt_2;
		this.brth_istt_basi_yy_2 = brth_istt_basi_yy_2;
		this.brth_istt_amt_3 = brth_istt_amt_3;
		this.brth_istt_basi_yy_3 = brth_istt_basi_yy_3;
		this.rspc_dduc_amt_1 = rspc_dduc_amt_1;
		this.rspc_dduc_basi_yy_1_fr = rspc_dduc_basi_yy_1_fr;
		this.rspc_dduc_basi_yy_1_to = rspc_dduc_basi_yy_1_to;
		this.rspc_dduc_amt_2 = rspc_dduc_amt_2;
		this.rspc_dduc_basi_yy_2 = rspc_dduc_basi_yy_2;
		this.obcl_pers_dduc_amt = obcl_pers_dduc_amt;
		this.fml_dduc_amt = fml_dduc_amt;
		this.child_care_fee_dduc_amt = child_care_fee_dduc_amt;
		this.one_paren_dduc_amt = one_paren_dduc_amt;
		this.mlt_chld_basi_dduc_amt = mlt_chld_basi_dduc_amt;
		this.mlt_chld_pers_dduc_amt = mlt_chld_pers_dduc_amt;
		this.mlt_chld_birth_dduc_amt = mlt_chld_birth_dduc_amt;
		this.gnr_insr_limt_amt = gnr_insr_limt_amt;
		this.obcl_pers_insr_limt_amt = obcl_pers_insr_limt_amt;
		this.hosp_fee_basi_ratio = hosp_fee_basi_ratio;
		this.hosp_fee_limt_amt = hosp_fee_limt_amt;
		this.baby_edu_fee = baby_edu_fee;
		this.elmihi_edu_fee = elmihi_edu_fee;
		this.univ_edu_fee = univ_edu_fee;
		this.hous_savg_aply_ratio = hous_savg_aply_ratio;
		this.hous_savg_aply_limt_amt = hous_savg_aply_limt_amt;
		this.hous_hire_aply_ratio = hous_hire_aply_ratio;
		this.hous_hire_aply_limt_amt = hous_hire_aply_limt_amt;
		this.ltrm_hous_loan_limt_amt_1 = ltrm_hous_loan_limt_amt_1;
		this.ltrm_hous_loan_limt_amt_2 = ltrm_hous_loan_limt_amt_2;
		this.ltrm_hous_loan_limt_amt_3 = ltrm_hous_loan_limt_amt_3;
		this.wedd_fnrl_movm_widr_amt = wedd_fnrl_movm_widr_amt;
		this.wedd_fnrl_movm_tot_saly_amt = wedd_fnrl_movm_tot_saly_amt;
		this.wedd_fnrl_movm_incm_amt = wedd_fnrl_movm_incm_amt;
		this.std_dduc_amt = std_dduc_amt;
		this.monthly_rent_amt_ratio = monthly_rent_amt_ratio;
		this.prsn_pens_savg_ratio = prsn_pens_savg_ratio;
		this.prsn_pens_savg_limt_amt = prsn_pens_savg_limt_amt;
		this.pens_savg_limt_amt = pens_savg_limt_amt;
		this.invsm_cmpd_invsm_ratio = invsm_cmpd_invsm_ratio;
		this.lvcmpy_pens_limt_amt = lvcmpy_pens_limt_amt;
		this.emp_stok_ownr_limt_amt = emp_stok_ownr_limt_amt;
		this.crdt_card_tot_saly_ratio = crdt_card_tot_saly_ratio;
		this.crdt_card_excs_amt_ratio = crdt_card_excs_amt_ratio;
		this.crdt_card_limt_amt = crdt_card_limt_amt;
		this.no_lar_sum_lease_limt_amt = no_lar_sum_lease_limt_amt;
		this.no_lar_sum_lease_limt_ratio = no_lar_sum_lease_limt_ratio;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setAdjm_yy(String adjm_yy){
		this.adjm_yy = adjm_yy;
	}

	public void setIncmg_pers_ip(String incmg_pers_ip){
		this.incmg_pers_ip = incmg_pers_ip;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
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

	public void setOne_paren_dduc_amt(String one_paren_dduc_amt){
		this.one_paren_dduc_amt = one_paren_dduc_amt;
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

	public void setLtrm_hous_loan_limt_amt_1(String ltrm_hous_loan_limt_amt_1){
		this.ltrm_hous_loan_limt_amt_1 = ltrm_hous_loan_limt_amt_1;
	}

	public void setLtrm_hous_loan_limt_amt_2(String ltrm_hous_loan_limt_amt_2){
		this.ltrm_hous_loan_limt_amt_2 = ltrm_hous_loan_limt_amt_2;
	}

	public void setLtrm_hous_loan_limt_amt_3(String ltrm_hous_loan_limt_amt_3){
		this.ltrm_hous_loan_limt_amt_3 = ltrm_hous_loan_limt_amt_3;
	}

	public void setWedd_fnrl_movm_widr_amt(String wedd_fnrl_movm_widr_amt){
		this.wedd_fnrl_movm_widr_amt = wedd_fnrl_movm_widr_amt;
	}

	public void setWedd_fnrl_movm_tot_saly_amt(String wedd_fnrl_movm_tot_saly_amt){
		this.wedd_fnrl_movm_tot_saly_amt = wedd_fnrl_movm_tot_saly_amt;
	}

	public void setWedd_fnrl_movm_incm_amt(String wedd_fnrl_movm_incm_amt){
		this.wedd_fnrl_movm_incm_amt = wedd_fnrl_movm_incm_amt;
	}

	public void setStd_dduc_amt(String std_dduc_amt){
		this.std_dduc_amt = std_dduc_amt;
	}

	public void setMonthly_rent_amt_ratio(String monthly_rent_amt_ratio){
		this.monthly_rent_amt_ratio = monthly_rent_amt_ratio;
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

	public void setNo_lar_sum_lease_limt_amt(String no_lar_sum_lease_limt_amt){
		this.no_lar_sum_lease_limt_amt = no_lar_sum_lease_limt_amt;
	}

	public void setNo_lar_sum_lease_limt_ratio(String no_lar_sum_lease_limt_ratio){
		this.no_lar_sum_lease_limt_ratio = no_lar_sum_lease_limt_ratio;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getAdjm_yy(){
		return this.adjm_yy;
	}

	public String getIncmg_pers_ip(){
		return this.incmg_pers_ip;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
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

	public String getOne_paren_dduc_amt(){
		return this.one_paren_dduc_amt;
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

	public String getLtrm_hous_loan_limt_amt_1(){
		return this.ltrm_hous_loan_limt_amt_1;
	}

	public String getLtrm_hous_loan_limt_amt_2(){
		return this.ltrm_hous_loan_limt_amt_2;
	}

	public String getLtrm_hous_loan_limt_amt_3(){
		return this.ltrm_hous_loan_limt_amt_3;
	}

	public String getWedd_fnrl_movm_widr_amt(){
		return this.wedd_fnrl_movm_widr_amt;
	}

	public String getWedd_fnrl_movm_tot_saly_amt(){
		return this.wedd_fnrl_movm_tot_saly_amt;
	}

	public String getWedd_fnrl_movm_incm_amt(){
		return this.wedd_fnrl_movm_incm_amt;
	}

	public String getStd_dduc_amt(){
		return this.std_dduc_amt;
	}

	public String getMonthly_rent_amt_ratio(){
		return this.monthly_rent_amt_ratio;
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

	public String getNo_lar_sum_lease_limt_amt(){
		return this.no_lar_sum_lease_limt_amt;
	}

	public String getNo_lar_sum_lease_limt_ratio(){
		return this.no_lar_sum_lease_limt_ratio;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_YADJM_1000_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_YADJM_1000_ADM dm = (HD_YADJM_1000_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.adjm_yy);
		cstmt.setString(5, dm.incmg_pers_ip);
		cstmt.setString(6, dm.incmg_pers);
		cstmt.setString(7, dm.slf_dduc_amt);
		cstmt.setString(8, dm.spos_dduc_amt);
		cstmt.setString(9, dm.child_dduc_amt);
		cstmt.setString(10, dm.child_dduc_basi_yy);
		cstmt.setString(11, dm.prnt_dduc_amt_1);
		cstmt.setString(12, dm.prnt_dduc_basi_yy_1);
		cstmt.setString(13, dm.prnt_dduc_amt_2);
		cstmt.setString(14, dm.prnt_dduc_basi_yy_2);
		cstmt.setString(15, dm.brth_istt_amt_1);
		cstmt.setString(16, dm.brth_istt_basi_yy_1);
		cstmt.setString(17, dm.brth_istt_amt_2);
		cstmt.setString(18, dm.brth_istt_basi_yy_2);
		cstmt.setString(19, dm.brth_istt_amt_3);
		cstmt.setString(20, dm.brth_istt_basi_yy_3);
		cstmt.setString(21, dm.rspc_dduc_amt_1);
		cstmt.setString(22, dm.rspc_dduc_basi_yy_1_fr);
		cstmt.setString(23, dm.rspc_dduc_basi_yy_1_to);
		cstmt.setString(24, dm.rspc_dduc_amt_2);
		cstmt.setString(25, dm.rspc_dduc_basi_yy_2);
		cstmt.setString(26, dm.obcl_pers_dduc_amt);
		cstmt.setString(27, dm.fml_dduc_amt);
		cstmt.setString(28, dm.child_care_fee_dduc_amt);
		cstmt.setString(29, dm.one_paren_dduc_amt);
		cstmt.setString(30, dm.mlt_chld_basi_dduc_amt);
		cstmt.setString(31, dm.mlt_chld_pers_dduc_amt);
		cstmt.setString(32, dm.mlt_chld_birth_dduc_amt);
		cstmt.setString(33, dm.gnr_insr_limt_amt);
		cstmt.setString(34, dm.obcl_pers_insr_limt_amt);
		cstmt.setString(35, dm.hosp_fee_basi_ratio);
		cstmt.setString(36, dm.hosp_fee_limt_amt);
		cstmt.setString(37, dm.baby_edu_fee);
		cstmt.setString(38, dm.elmihi_edu_fee);
		cstmt.setString(39, dm.univ_edu_fee);
		cstmt.setString(40, dm.hous_savg_aply_ratio);
		cstmt.setString(41, dm.hous_savg_aply_limt_amt);
		cstmt.setString(42, dm.hous_hire_aply_ratio);
		cstmt.setString(43, dm.hous_hire_aply_limt_amt);
		cstmt.setString(44, dm.ltrm_hous_loan_limt_amt_1);
		cstmt.setString(45, dm.ltrm_hous_loan_limt_amt_2);
		cstmt.setString(46, dm.ltrm_hous_loan_limt_amt_3);
		cstmt.setString(47, dm.wedd_fnrl_movm_widr_amt);
		cstmt.setString(48, dm.wedd_fnrl_movm_tot_saly_amt);
		cstmt.setString(49, dm.wedd_fnrl_movm_incm_amt);
		cstmt.setString(50, dm.std_dduc_amt);
		cstmt.setString(51, dm.monthly_rent_amt_ratio);
		cstmt.setString(52, dm.prsn_pens_savg_ratio);
		cstmt.setString(53, dm.prsn_pens_savg_limt_amt);
		cstmt.setString(54, dm.pens_savg_limt_amt);
		cstmt.setString(55, dm.invsm_cmpd_invsm_ratio);
		cstmt.setString(56, dm.lvcmpy_pens_limt_amt);
		cstmt.setString(57, dm.emp_stok_ownr_limt_amt);
		cstmt.setString(58, dm.crdt_card_tot_saly_ratio);
		cstmt.setString(59, dm.crdt_card_excs_amt_ratio);
		cstmt.setString(60, dm.crdt_card_limt_amt);
		cstmt.setString(61, dm.no_lar_sum_lease_limt_amt);
		cstmt.setString(62, dm.no_lar_sum_lease_limt_ratio);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.yadjm.ds.HD_YADJM_1000_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("adjm_yy = [" + getAdjm_yy() + "]");
		System.out.println("incmg_pers_ip = [" + getIncmg_pers_ip() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("slf_dduc_amt = [" + getSlf_dduc_amt() + "]");
		System.out.println("spos_dduc_amt = [" + getSpos_dduc_amt() + "]");
		System.out.println("child_dduc_amt = [" + getChild_dduc_amt() + "]");
		System.out.println("child_dduc_basi_yy = [" + getChild_dduc_basi_yy() + "]");
		System.out.println("prnt_dduc_amt_1 = [" + getPrnt_dduc_amt_1() + "]");
		System.out.println("prnt_dduc_basi_yy_1 = [" + getPrnt_dduc_basi_yy_1() + "]");
		System.out.println("prnt_dduc_amt_2 = [" + getPrnt_dduc_amt_2() + "]");
		System.out.println("prnt_dduc_basi_yy_2 = [" + getPrnt_dduc_basi_yy_2() + "]");
		System.out.println("brth_istt_amt_1 = [" + getBrth_istt_amt_1() + "]");
		System.out.println("brth_istt_basi_yy_1 = [" + getBrth_istt_basi_yy_1() + "]");
		System.out.println("brth_istt_amt_2 = [" + getBrth_istt_amt_2() + "]");
		System.out.println("brth_istt_basi_yy_2 = [" + getBrth_istt_basi_yy_2() + "]");
		System.out.println("brth_istt_amt_3 = [" + getBrth_istt_amt_3() + "]");
		System.out.println("brth_istt_basi_yy_3 = [" + getBrth_istt_basi_yy_3() + "]");
		System.out.println("rspc_dduc_amt_1 = [" + getRspc_dduc_amt_1() + "]");
		System.out.println("rspc_dduc_basi_yy_1_fr = [" + getRspc_dduc_basi_yy_1_fr() + "]");
		System.out.println("rspc_dduc_basi_yy_1_to = [" + getRspc_dduc_basi_yy_1_to() + "]");
		System.out.println("rspc_dduc_amt_2 = [" + getRspc_dduc_amt_2() + "]");
		System.out.println("rspc_dduc_basi_yy_2 = [" + getRspc_dduc_basi_yy_2() + "]");
		System.out.println("obcl_pers_dduc_amt = [" + getObcl_pers_dduc_amt() + "]");
		System.out.println("fml_dduc_amt = [" + getFml_dduc_amt() + "]");
		System.out.println("child_care_fee_dduc_amt = [" + getChild_care_fee_dduc_amt() + "]");
		System.out.println("one_paren_dduc_amt = [" + getOne_paren_dduc_amt() + "]");
		System.out.println("mlt_chld_basi_dduc_amt = [" + getMlt_chld_basi_dduc_amt() + "]");
		System.out.println("mlt_chld_pers_dduc_amt = [" + getMlt_chld_pers_dduc_amt() + "]");
		System.out.println("mlt_chld_birth_dduc_amt = [" + getMlt_chld_birth_dduc_amt() + "]");
		System.out.println("gnr_insr_limt_amt = [" + getGnr_insr_limt_amt() + "]");
		System.out.println("obcl_pers_insr_limt_amt = [" + getObcl_pers_insr_limt_amt() + "]");
		System.out.println("hosp_fee_basi_ratio = [" + getHosp_fee_basi_ratio() + "]");
		System.out.println("hosp_fee_limt_amt = [" + getHosp_fee_limt_amt() + "]");
		System.out.println("baby_edu_fee = [" + getBaby_edu_fee() + "]");
		System.out.println("elmihi_edu_fee = [" + getElmihi_edu_fee() + "]");
		System.out.println("univ_edu_fee = [" + getUniv_edu_fee() + "]");
		System.out.println("hous_savg_aply_ratio = [" + getHous_savg_aply_ratio() + "]");
		System.out.println("hous_savg_aply_limt_amt = [" + getHous_savg_aply_limt_amt() + "]");
		System.out.println("hous_hire_aply_ratio = [" + getHous_hire_aply_ratio() + "]");
		System.out.println("hous_hire_aply_limt_amt = [" + getHous_hire_aply_limt_amt() + "]");
		System.out.println("ltrm_hous_loan_limt_amt_1 = [" + getLtrm_hous_loan_limt_amt_1() + "]");
		System.out.println("ltrm_hous_loan_limt_amt_2 = [" + getLtrm_hous_loan_limt_amt_2() + "]");
		System.out.println("ltrm_hous_loan_limt_amt_3 = [" + getLtrm_hous_loan_limt_amt_3() + "]");
		System.out.println("wedd_fnrl_movm_widr_amt = [" + getWedd_fnrl_movm_widr_amt() + "]");
		System.out.println("wedd_fnrl_movm_tot_saly_amt = [" + getWedd_fnrl_movm_tot_saly_amt() + "]");
		System.out.println("wedd_fnrl_movm_incm_amt = [" + getWedd_fnrl_movm_incm_amt() + "]");
		System.out.println("std_dduc_amt = [" + getStd_dduc_amt() + "]");
		System.out.println("monthly_rent_amt_ratio = [" + getMonthly_rent_amt_ratio() + "]");
		System.out.println("prsn_pens_savg_ratio = [" + getPrsn_pens_savg_ratio() + "]");
		System.out.println("prsn_pens_savg_limt_amt = [" + getPrsn_pens_savg_limt_amt() + "]");
		System.out.println("pens_savg_limt_amt = [" + getPens_savg_limt_amt() + "]");
		System.out.println("invsm_cmpd_invsm_ratio = [" + getInvsm_cmpd_invsm_ratio() + "]");
		System.out.println("lvcmpy_pens_limt_amt = [" + getLvcmpy_pens_limt_amt() + "]");
		System.out.println("emp_stok_ownr_limt_amt = [" + getEmp_stok_ownr_limt_amt() + "]");
		System.out.println("crdt_card_tot_saly_ratio = [" + getCrdt_card_tot_saly_ratio() + "]");
		System.out.println("crdt_card_excs_amt_ratio = [" + getCrdt_card_excs_amt_ratio() + "]");
		System.out.println("crdt_card_limt_amt = [" + getCrdt_card_limt_amt() + "]");
		System.out.println("no_lar_sum_lease_limt_amt = [" + getNo_lar_sum_lease_limt_amt() + "]");
		System.out.println("no_lar_sum_lease_limt_ratio = [" + getNo_lar_sum_lease_limt_ratio() + "]");
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String cmpy_cd = req.getParameter("cmpy_cd");
if( cmpy_cd == null){
	System.out.println(this.toString+" : cmpy_cd is null" );
}else{
	System.out.println(this.toString+" : cmpy_cd is "+cmpy_cd );
}
String adjm_yy = req.getParameter("adjm_yy");
if( adjm_yy == null){
	System.out.println(this.toString+" : adjm_yy is null" );
}else{
	System.out.println(this.toString+" : adjm_yy is "+adjm_yy );
}
String incmg_pers_ip = req.getParameter("incmg_pers_ip");
if( incmg_pers_ip == null){
	System.out.println(this.toString+" : incmg_pers_ip is null" );
}else{
	System.out.println(this.toString+" : incmg_pers_ip is "+incmg_pers_ip );
}
String incmg_pers = req.getParameter("incmg_pers");
if( incmg_pers == null){
	System.out.println(this.toString+" : incmg_pers is null" );
}else{
	System.out.println(this.toString+" : incmg_pers is "+incmg_pers );
}
String slf_dduc_amt = req.getParameter("slf_dduc_amt");
if( slf_dduc_amt == null){
	System.out.println(this.toString+" : slf_dduc_amt is null" );
}else{
	System.out.println(this.toString+" : slf_dduc_amt is "+slf_dduc_amt );
}
String spos_dduc_amt = req.getParameter("spos_dduc_amt");
if( spos_dduc_amt == null){
	System.out.println(this.toString+" : spos_dduc_amt is null" );
}else{
	System.out.println(this.toString+" : spos_dduc_amt is "+spos_dduc_amt );
}
String child_dduc_amt = req.getParameter("child_dduc_amt");
if( child_dduc_amt == null){
	System.out.println(this.toString+" : child_dduc_amt is null" );
}else{
	System.out.println(this.toString+" : child_dduc_amt is "+child_dduc_amt );
}
String child_dduc_basi_yy = req.getParameter("child_dduc_basi_yy");
if( child_dduc_basi_yy == null){
	System.out.println(this.toString+" : child_dduc_basi_yy is null" );
}else{
	System.out.println(this.toString+" : child_dduc_basi_yy is "+child_dduc_basi_yy );
}
String prnt_dduc_amt_1 = req.getParameter("prnt_dduc_amt_1");
if( prnt_dduc_amt_1 == null){
	System.out.println(this.toString+" : prnt_dduc_amt_1 is null" );
}else{
	System.out.println(this.toString+" : prnt_dduc_amt_1 is "+prnt_dduc_amt_1 );
}
String prnt_dduc_basi_yy_1 = req.getParameter("prnt_dduc_basi_yy_1");
if( prnt_dduc_basi_yy_1 == null){
	System.out.println(this.toString+" : prnt_dduc_basi_yy_1 is null" );
}else{
	System.out.println(this.toString+" : prnt_dduc_basi_yy_1 is "+prnt_dduc_basi_yy_1 );
}
String prnt_dduc_amt_2 = req.getParameter("prnt_dduc_amt_2");
if( prnt_dduc_amt_2 == null){
	System.out.println(this.toString+" : prnt_dduc_amt_2 is null" );
}else{
	System.out.println(this.toString+" : prnt_dduc_amt_2 is "+prnt_dduc_amt_2 );
}
String prnt_dduc_basi_yy_2 = req.getParameter("prnt_dduc_basi_yy_2");
if( prnt_dduc_basi_yy_2 == null){
	System.out.println(this.toString+" : prnt_dduc_basi_yy_2 is null" );
}else{
	System.out.println(this.toString+" : prnt_dduc_basi_yy_2 is "+prnt_dduc_basi_yy_2 );
}
String brth_istt_amt_1 = req.getParameter("brth_istt_amt_1");
if( brth_istt_amt_1 == null){
	System.out.println(this.toString+" : brth_istt_amt_1 is null" );
}else{
	System.out.println(this.toString+" : brth_istt_amt_1 is "+brth_istt_amt_1 );
}
String brth_istt_basi_yy_1 = req.getParameter("brth_istt_basi_yy_1");
if( brth_istt_basi_yy_1 == null){
	System.out.println(this.toString+" : brth_istt_basi_yy_1 is null" );
}else{
	System.out.println(this.toString+" : brth_istt_basi_yy_1 is "+brth_istt_basi_yy_1 );
}
String brth_istt_amt_2 = req.getParameter("brth_istt_amt_2");
if( brth_istt_amt_2 == null){
	System.out.println(this.toString+" : brth_istt_amt_2 is null" );
}else{
	System.out.println(this.toString+" : brth_istt_amt_2 is "+brth_istt_amt_2 );
}
String brth_istt_basi_yy_2 = req.getParameter("brth_istt_basi_yy_2");
if( brth_istt_basi_yy_2 == null){
	System.out.println(this.toString+" : brth_istt_basi_yy_2 is null" );
}else{
	System.out.println(this.toString+" : brth_istt_basi_yy_2 is "+brth_istt_basi_yy_2 );
}
String brth_istt_amt_3 = req.getParameter("brth_istt_amt_3");
if( brth_istt_amt_3 == null){
	System.out.println(this.toString+" : brth_istt_amt_3 is null" );
}else{
	System.out.println(this.toString+" : brth_istt_amt_3 is "+brth_istt_amt_3 );
}
String brth_istt_basi_yy_3 = req.getParameter("brth_istt_basi_yy_3");
if( brth_istt_basi_yy_3 == null){
	System.out.println(this.toString+" : brth_istt_basi_yy_3 is null" );
}else{
	System.out.println(this.toString+" : brth_istt_basi_yy_3 is "+brth_istt_basi_yy_3 );
}
String rspc_dduc_amt_1 = req.getParameter("rspc_dduc_amt_1");
if( rspc_dduc_amt_1 == null){
	System.out.println(this.toString+" : rspc_dduc_amt_1 is null" );
}else{
	System.out.println(this.toString+" : rspc_dduc_amt_1 is "+rspc_dduc_amt_1 );
}
String rspc_dduc_basi_yy_1_fr = req.getParameter("rspc_dduc_basi_yy_1_fr");
if( rspc_dduc_basi_yy_1_fr == null){
	System.out.println(this.toString+" : rspc_dduc_basi_yy_1_fr is null" );
}else{
	System.out.println(this.toString+" : rspc_dduc_basi_yy_1_fr is "+rspc_dduc_basi_yy_1_fr );
}
String rspc_dduc_basi_yy_1_to = req.getParameter("rspc_dduc_basi_yy_1_to");
if( rspc_dduc_basi_yy_1_to == null){
	System.out.println(this.toString+" : rspc_dduc_basi_yy_1_to is null" );
}else{
	System.out.println(this.toString+" : rspc_dduc_basi_yy_1_to is "+rspc_dduc_basi_yy_1_to );
}
String rspc_dduc_amt_2 = req.getParameter("rspc_dduc_amt_2");
if( rspc_dduc_amt_2 == null){
	System.out.println(this.toString+" : rspc_dduc_amt_2 is null" );
}else{
	System.out.println(this.toString+" : rspc_dduc_amt_2 is "+rspc_dduc_amt_2 );
}
String rspc_dduc_basi_yy_2 = req.getParameter("rspc_dduc_basi_yy_2");
if( rspc_dduc_basi_yy_2 == null){
	System.out.println(this.toString+" : rspc_dduc_basi_yy_2 is null" );
}else{
	System.out.println(this.toString+" : rspc_dduc_basi_yy_2 is "+rspc_dduc_basi_yy_2 );
}
String obcl_pers_dduc_amt = req.getParameter("obcl_pers_dduc_amt");
if( obcl_pers_dduc_amt == null){
	System.out.println(this.toString+" : obcl_pers_dduc_amt is null" );
}else{
	System.out.println(this.toString+" : obcl_pers_dduc_amt is "+obcl_pers_dduc_amt );
}
String fml_dduc_amt = req.getParameter("fml_dduc_amt");
if( fml_dduc_amt == null){
	System.out.println(this.toString+" : fml_dduc_amt is null" );
}else{
	System.out.println(this.toString+" : fml_dduc_amt is "+fml_dduc_amt );
}
String child_care_fee_dduc_amt = req.getParameter("child_care_fee_dduc_amt");
if( child_care_fee_dduc_amt == null){
	System.out.println(this.toString+" : child_care_fee_dduc_amt is null" );
}else{
	System.out.println(this.toString+" : child_care_fee_dduc_amt is "+child_care_fee_dduc_amt );
}
String one_paren_dduc_amt = req.getParameter("one_paren_dduc_amt");
if( one_paren_dduc_amt == null){
	System.out.println(this.toString+" : one_paren_dduc_amt is null" );
}else{
	System.out.println(this.toString+" : one_paren_dduc_amt is "+one_paren_dduc_amt );
}
String mlt_chld_basi_dduc_amt = req.getParameter("mlt_chld_basi_dduc_amt");
if( mlt_chld_basi_dduc_amt == null){
	System.out.println(this.toString+" : mlt_chld_basi_dduc_amt is null" );
}else{
	System.out.println(this.toString+" : mlt_chld_basi_dduc_amt is "+mlt_chld_basi_dduc_amt );
}
String mlt_chld_pers_dduc_amt = req.getParameter("mlt_chld_pers_dduc_amt");
if( mlt_chld_pers_dduc_amt == null){
	System.out.println(this.toString+" : mlt_chld_pers_dduc_amt is null" );
}else{
	System.out.println(this.toString+" : mlt_chld_pers_dduc_amt is "+mlt_chld_pers_dduc_amt );
}
String mlt_chld_birth_dduc_amt = req.getParameter("mlt_chld_birth_dduc_amt");
if( mlt_chld_birth_dduc_amt == null){
	System.out.println(this.toString+" : mlt_chld_birth_dduc_amt is null" );
}else{
	System.out.println(this.toString+" : mlt_chld_birth_dduc_amt is "+mlt_chld_birth_dduc_amt );
}
String gnr_insr_limt_amt = req.getParameter("gnr_insr_limt_amt");
if( gnr_insr_limt_amt == null){
	System.out.println(this.toString+" : gnr_insr_limt_amt is null" );
}else{
	System.out.println(this.toString+" : gnr_insr_limt_amt is "+gnr_insr_limt_amt );
}
String obcl_pers_insr_limt_amt = req.getParameter("obcl_pers_insr_limt_amt");
if( obcl_pers_insr_limt_amt == null){
	System.out.println(this.toString+" : obcl_pers_insr_limt_amt is null" );
}else{
	System.out.println(this.toString+" : obcl_pers_insr_limt_amt is "+obcl_pers_insr_limt_amt );
}
String hosp_fee_basi_ratio = req.getParameter("hosp_fee_basi_ratio");
if( hosp_fee_basi_ratio == null){
	System.out.println(this.toString+" : hosp_fee_basi_ratio is null" );
}else{
	System.out.println(this.toString+" : hosp_fee_basi_ratio is "+hosp_fee_basi_ratio );
}
String hosp_fee_limt_amt = req.getParameter("hosp_fee_limt_amt");
if( hosp_fee_limt_amt == null){
	System.out.println(this.toString+" : hosp_fee_limt_amt is null" );
}else{
	System.out.println(this.toString+" : hosp_fee_limt_amt is "+hosp_fee_limt_amt );
}
String baby_edu_fee = req.getParameter("baby_edu_fee");
if( baby_edu_fee == null){
	System.out.println(this.toString+" : baby_edu_fee is null" );
}else{
	System.out.println(this.toString+" : baby_edu_fee is "+baby_edu_fee );
}
String elmihi_edu_fee = req.getParameter("elmihi_edu_fee");
if( elmihi_edu_fee == null){
	System.out.println(this.toString+" : elmihi_edu_fee is null" );
}else{
	System.out.println(this.toString+" : elmihi_edu_fee is "+elmihi_edu_fee );
}
String univ_edu_fee = req.getParameter("univ_edu_fee");
if( univ_edu_fee == null){
	System.out.println(this.toString+" : univ_edu_fee is null" );
}else{
	System.out.println(this.toString+" : univ_edu_fee is "+univ_edu_fee );
}
String hous_savg_aply_ratio = req.getParameter("hous_savg_aply_ratio");
if( hous_savg_aply_ratio == null){
	System.out.println(this.toString+" : hous_savg_aply_ratio is null" );
}else{
	System.out.println(this.toString+" : hous_savg_aply_ratio is "+hous_savg_aply_ratio );
}
String hous_savg_aply_limt_amt = req.getParameter("hous_savg_aply_limt_amt");
if( hous_savg_aply_limt_amt == null){
	System.out.println(this.toString+" : hous_savg_aply_limt_amt is null" );
}else{
	System.out.println(this.toString+" : hous_savg_aply_limt_amt is "+hous_savg_aply_limt_amt );
}
String hous_hire_aply_ratio = req.getParameter("hous_hire_aply_ratio");
if( hous_hire_aply_ratio == null){
	System.out.println(this.toString+" : hous_hire_aply_ratio is null" );
}else{
	System.out.println(this.toString+" : hous_hire_aply_ratio is "+hous_hire_aply_ratio );
}
String hous_hire_aply_limt_amt = req.getParameter("hous_hire_aply_limt_amt");
if( hous_hire_aply_limt_amt == null){
	System.out.println(this.toString+" : hous_hire_aply_limt_amt is null" );
}else{
	System.out.println(this.toString+" : hous_hire_aply_limt_amt is "+hous_hire_aply_limt_amt );
}
String ltrm_hous_loan_limt_amt_1 = req.getParameter("ltrm_hous_loan_limt_amt_1");
if( ltrm_hous_loan_limt_amt_1 == null){
	System.out.println(this.toString+" : ltrm_hous_loan_limt_amt_1 is null" );
}else{
	System.out.println(this.toString+" : ltrm_hous_loan_limt_amt_1 is "+ltrm_hous_loan_limt_amt_1 );
}
String ltrm_hous_loan_limt_amt_2 = req.getParameter("ltrm_hous_loan_limt_amt_2");
if( ltrm_hous_loan_limt_amt_2 == null){
	System.out.println(this.toString+" : ltrm_hous_loan_limt_amt_2 is null" );
}else{
	System.out.println(this.toString+" : ltrm_hous_loan_limt_amt_2 is "+ltrm_hous_loan_limt_amt_2 );
}
String ltrm_hous_loan_limt_amt_3 = req.getParameter("ltrm_hous_loan_limt_amt_3");
if( ltrm_hous_loan_limt_amt_3 == null){
	System.out.println(this.toString+" : ltrm_hous_loan_limt_amt_3 is null" );
}else{
	System.out.println(this.toString+" : ltrm_hous_loan_limt_amt_3 is "+ltrm_hous_loan_limt_amt_3 );
}
String wedd_fnrl_movm_widr_amt = req.getParameter("wedd_fnrl_movm_widr_amt");
if( wedd_fnrl_movm_widr_amt == null){
	System.out.println(this.toString+" : wedd_fnrl_movm_widr_amt is null" );
}else{
	System.out.println(this.toString+" : wedd_fnrl_movm_widr_amt is "+wedd_fnrl_movm_widr_amt );
}
String wedd_fnrl_movm_tot_saly_amt = req.getParameter("wedd_fnrl_movm_tot_saly_amt");
if( wedd_fnrl_movm_tot_saly_amt == null){
	System.out.println(this.toString+" : wedd_fnrl_movm_tot_saly_amt is null" );
}else{
	System.out.println(this.toString+" : wedd_fnrl_movm_tot_saly_amt is "+wedd_fnrl_movm_tot_saly_amt );
}
String wedd_fnrl_movm_incm_amt = req.getParameter("wedd_fnrl_movm_incm_amt");
if( wedd_fnrl_movm_incm_amt == null){
	System.out.println(this.toString+" : wedd_fnrl_movm_incm_amt is null" );
}else{
	System.out.println(this.toString+" : wedd_fnrl_movm_incm_amt is "+wedd_fnrl_movm_incm_amt );
}
String std_dduc_amt = req.getParameter("std_dduc_amt");
if( std_dduc_amt == null){
	System.out.println(this.toString+" : std_dduc_amt is null" );
}else{
	System.out.println(this.toString+" : std_dduc_amt is "+std_dduc_amt );
}
String monthly_rent_amt_ratio = req.getParameter("monthly_rent_amt_ratio");
if( monthly_rent_amt_ratio == null){
	System.out.println(this.toString+" : monthly_rent_amt_ratio is null" );
}else{
	System.out.println(this.toString+" : monthly_rent_amt_ratio is "+monthly_rent_amt_ratio );
}
String prsn_pens_savg_ratio = req.getParameter("prsn_pens_savg_ratio");
if( prsn_pens_savg_ratio == null){
	System.out.println(this.toString+" : prsn_pens_savg_ratio is null" );
}else{
	System.out.println(this.toString+" : prsn_pens_savg_ratio is "+prsn_pens_savg_ratio );
}
String prsn_pens_savg_limt_amt = req.getParameter("prsn_pens_savg_limt_amt");
if( prsn_pens_savg_limt_amt == null){
	System.out.println(this.toString+" : prsn_pens_savg_limt_amt is null" );
}else{
	System.out.println(this.toString+" : prsn_pens_savg_limt_amt is "+prsn_pens_savg_limt_amt );
}
String pens_savg_limt_amt = req.getParameter("pens_savg_limt_amt");
if( pens_savg_limt_amt == null){
	System.out.println(this.toString+" : pens_savg_limt_amt is null" );
}else{
	System.out.println(this.toString+" : pens_savg_limt_amt is "+pens_savg_limt_amt );
}
String invsm_cmpd_invsm_ratio = req.getParameter("invsm_cmpd_invsm_ratio");
if( invsm_cmpd_invsm_ratio == null){
	System.out.println(this.toString+" : invsm_cmpd_invsm_ratio is null" );
}else{
	System.out.println(this.toString+" : invsm_cmpd_invsm_ratio is "+invsm_cmpd_invsm_ratio );
}
String lvcmpy_pens_limt_amt = req.getParameter("lvcmpy_pens_limt_amt");
if( lvcmpy_pens_limt_amt == null){
	System.out.println(this.toString+" : lvcmpy_pens_limt_amt is null" );
}else{
	System.out.println(this.toString+" : lvcmpy_pens_limt_amt is "+lvcmpy_pens_limt_amt );
}
String emp_stok_ownr_limt_amt = req.getParameter("emp_stok_ownr_limt_amt");
if( emp_stok_ownr_limt_amt == null){
	System.out.println(this.toString+" : emp_stok_ownr_limt_amt is null" );
}else{
	System.out.println(this.toString+" : emp_stok_ownr_limt_amt is "+emp_stok_ownr_limt_amt );
}
String crdt_card_tot_saly_ratio = req.getParameter("crdt_card_tot_saly_ratio");
if( crdt_card_tot_saly_ratio == null){
	System.out.println(this.toString+" : crdt_card_tot_saly_ratio is null" );
}else{
	System.out.println(this.toString+" : crdt_card_tot_saly_ratio is "+crdt_card_tot_saly_ratio );
}
String crdt_card_excs_amt_ratio = req.getParameter("crdt_card_excs_amt_ratio");
if( crdt_card_excs_amt_ratio == null){
	System.out.println(this.toString+" : crdt_card_excs_amt_ratio is null" );
}else{
	System.out.println(this.toString+" : crdt_card_excs_amt_ratio is "+crdt_card_excs_amt_ratio );
}
String crdt_card_limt_amt = req.getParameter("crdt_card_limt_amt");
if( crdt_card_limt_amt == null){
	System.out.println(this.toString+" : crdt_card_limt_amt is null" );
}else{
	System.out.println(this.toString+" : crdt_card_limt_amt is "+crdt_card_limt_amt );
}
String no_lar_sum_lease_limt_amt = req.getParameter("no_lar_sum_lease_limt_amt");
if( no_lar_sum_lease_limt_amt == null){
	System.out.println(this.toString+" : no_lar_sum_lease_limt_amt is null" );
}else{
	System.out.println(this.toString+" : no_lar_sum_lease_limt_amt is "+no_lar_sum_lease_limt_amt );
}
String no_lar_sum_lease_limt_ratio = req.getParameter("no_lar_sum_lease_limt_ratio");
if( no_lar_sum_lease_limt_ratio == null){
	System.out.println(this.toString+" : no_lar_sum_lease_limt_ratio is null" );
}else{
	System.out.println(this.toString+" : no_lar_sum_lease_limt_ratio is "+no_lar_sum_lease_limt_ratio );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String adjm_yy = Util.checkString(req.getParameter("adjm_yy"));
String incmg_pers_ip = Util.checkString(req.getParameter("incmg_pers_ip"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String slf_dduc_amt = Util.checkString(req.getParameter("slf_dduc_amt"));
String spos_dduc_amt = Util.checkString(req.getParameter("spos_dduc_amt"));
String child_dduc_amt = Util.checkString(req.getParameter("child_dduc_amt"));
String child_dduc_basi_yy = Util.checkString(req.getParameter("child_dduc_basi_yy"));
String prnt_dduc_amt_1 = Util.checkString(req.getParameter("prnt_dduc_amt_1"));
String prnt_dduc_basi_yy_1 = Util.checkString(req.getParameter("prnt_dduc_basi_yy_1"));
String prnt_dduc_amt_2 = Util.checkString(req.getParameter("prnt_dduc_amt_2"));
String prnt_dduc_basi_yy_2 = Util.checkString(req.getParameter("prnt_dduc_basi_yy_2"));
String brth_istt_amt_1 = Util.checkString(req.getParameter("brth_istt_amt_1"));
String brth_istt_basi_yy_1 = Util.checkString(req.getParameter("brth_istt_basi_yy_1"));
String brth_istt_amt_2 = Util.checkString(req.getParameter("brth_istt_amt_2"));
String brth_istt_basi_yy_2 = Util.checkString(req.getParameter("brth_istt_basi_yy_2"));
String brth_istt_amt_3 = Util.checkString(req.getParameter("brth_istt_amt_3"));
String brth_istt_basi_yy_3 = Util.checkString(req.getParameter("brth_istt_basi_yy_3"));
String rspc_dduc_amt_1 = Util.checkString(req.getParameter("rspc_dduc_amt_1"));
String rspc_dduc_basi_yy_1_fr = Util.checkString(req.getParameter("rspc_dduc_basi_yy_1_fr"));
String rspc_dduc_basi_yy_1_to = Util.checkString(req.getParameter("rspc_dduc_basi_yy_1_to"));
String rspc_dduc_amt_2 = Util.checkString(req.getParameter("rspc_dduc_amt_2"));
String rspc_dduc_basi_yy_2 = Util.checkString(req.getParameter("rspc_dduc_basi_yy_2"));
String obcl_pers_dduc_amt = Util.checkString(req.getParameter("obcl_pers_dduc_amt"));
String fml_dduc_amt = Util.checkString(req.getParameter("fml_dduc_amt"));
String child_care_fee_dduc_amt = Util.checkString(req.getParameter("child_care_fee_dduc_amt"));
String one_paren_dduc_amt = Util.checkString(req.getParameter("one_paren_dduc_amt"));
String mlt_chld_basi_dduc_amt = Util.checkString(req.getParameter("mlt_chld_basi_dduc_amt"));
String mlt_chld_pers_dduc_amt = Util.checkString(req.getParameter("mlt_chld_pers_dduc_amt"));
String mlt_chld_birth_dduc_amt = Util.checkString(req.getParameter("mlt_chld_birth_dduc_amt"));
String gnr_insr_limt_amt = Util.checkString(req.getParameter("gnr_insr_limt_amt"));
String obcl_pers_insr_limt_amt = Util.checkString(req.getParameter("obcl_pers_insr_limt_amt"));
String hosp_fee_basi_ratio = Util.checkString(req.getParameter("hosp_fee_basi_ratio"));
String hosp_fee_limt_amt = Util.checkString(req.getParameter("hosp_fee_limt_amt"));
String baby_edu_fee = Util.checkString(req.getParameter("baby_edu_fee"));
String elmihi_edu_fee = Util.checkString(req.getParameter("elmihi_edu_fee"));
String univ_edu_fee = Util.checkString(req.getParameter("univ_edu_fee"));
String hous_savg_aply_ratio = Util.checkString(req.getParameter("hous_savg_aply_ratio"));
String hous_savg_aply_limt_amt = Util.checkString(req.getParameter("hous_savg_aply_limt_amt"));
String hous_hire_aply_ratio = Util.checkString(req.getParameter("hous_hire_aply_ratio"));
String hous_hire_aply_limt_amt = Util.checkString(req.getParameter("hous_hire_aply_limt_amt"));
String ltrm_hous_loan_limt_amt_1 = Util.checkString(req.getParameter("ltrm_hous_loan_limt_amt_1"));
String ltrm_hous_loan_limt_amt_2 = Util.checkString(req.getParameter("ltrm_hous_loan_limt_amt_2"));
String ltrm_hous_loan_limt_amt_3 = Util.checkString(req.getParameter("ltrm_hous_loan_limt_amt_3"));
String wedd_fnrl_movm_widr_amt = Util.checkString(req.getParameter("wedd_fnrl_movm_widr_amt"));
String wedd_fnrl_movm_tot_saly_amt = Util.checkString(req.getParameter("wedd_fnrl_movm_tot_saly_amt"));
String wedd_fnrl_movm_incm_amt = Util.checkString(req.getParameter("wedd_fnrl_movm_incm_amt"));
String std_dduc_amt = Util.checkString(req.getParameter("std_dduc_amt"));
String monthly_rent_amt_ratio = Util.checkString(req.getParameter("monthly_rent_amt_ratio"));
String prsn_pens_savg_ratio = Util.checkString(req.getParameter("prsn_pens_savg_ratio"));
String prsn_pens_savg_limt_amt = Util.checkString(req.getParameter("prsn_pens_savg_limt_amt"));
String pens_savg_limt_amt = Util.checkString(req.getParameter("pens_savg_limt_amt"));
String invsm_cmpd_invsm_ratio = Util.checkString(req.getParameter("invsm_cmpd_invsm_ratio"));
String lvcmpy_pens_limt_amt = Util.checkString(req.getParameter("lvcmpy_pens_limt_amt"));
String emp_stok_ownr_limt_amt = Util.checkString(req.getParameter("emp_stok_ownr_limt_amt"));
String crdt_card_tot_saly_ratio = Util.checkString(req.getParameter("crdt_card_tot_saly_ratio"));
String crdt_card_excs_amt_ratio = Util.checkString(req.getParameter("crdt_card_excs_amt_ratio"));
String crdt_card_limt_amt = Util.checkString(req.getParameter("crdt_card_limt_amt"));
String no_lar_sum_lease_limt_amt = Util.checkString(req.getParameter("no_lar_sum_lease_limt_amt"));
String no_lar_sum_lease_limt_ratio = Util.checkString(req.getParameter("no_lar_sum_lease_limt_ratio"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String adjm_yy = Util.Uni2Ksc(Util.checkString(req.getParameter("adjm_yy")));
String incmg_pers_ip = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ip")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String slf_dduc_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("slf_dduc_amt")));
String spos_dduc_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("spos_dduc_amt")));
String child_dduc_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("child_dduc_amt")));
String child_dduc_basi_yy = Util.Uni2Ksc(Util.checkString(req.getParameter("child_dduc_basi_yy")));
String prnt_dduc_amt_1 = Util.Uni2Ksc(Util.checkString(req.getParameter("prnt_dduc_amt_1")));
String prnt_dduc_basi_yy_1 = Util.Uni2Ksc(Util.checkString(req.getParameter("prnt_dduc_basi_yy_1")));
String prnt_dduc_amt_2 = Util.Uni2Ksc(Util.checkString(req.getParameter("prnt_dduc_amt_2")));
String prnt_dduc_basi_yy_2 = Util.Uni2Ksc(Util.checkString(req.getParameter("prnt_dduc_basi_yy_2")));
String brth_istt_amt_1 = Util.Uni2Ksc(Util.checkString(req.getParameter("brth_istt_amt_1")));
String brth_istt_basi_yy_1 = Util.Uni2Ksc(Util.checkString(req.getParameter("brth_istt_basi_yy_1")));
String brth_istt_amt_2 = Util.Uni2Ksc(Util.checkString(req.getParameter("brth_istt_amt_2")));
String brth_istt_basi_yy_2 = Util.Uni2Ksc(Util.checkString(req.getParameter("brth_istt_basi_yy_2")));
String brth_istt_amt_3 = Util.Uni2Ksc(Util.checkString(req.getParameter("brth_istt_amt_3")));
String brth_istt_basi_yy_3 = Util.Uni2Ksc(Util.checkString(req.getParameter("brth_istt_basi_yy_3")));
String rspc_dduc_amt_1 = Util.Uni2Ksc(Util.checkString(req.getParameter("rspc_dduc_amt_1")));
String rspc_dduc_basi_yy_1_fr = Util.Uni2Ksc(Util.checkString(req.getParameter("rspc_dduc_basi_yy_1_fr")));
String rspc_dduc_basi_yy_1_to = Util.Uni2Ksc(Util.checkString(req.getParameter("rspc_dduc_basi_yy_1_to")));
String rspc_dduc_amt_2 = Util.Uni2Ksc(Util.checkString(req.getParameter("rspc_dduc_amt_2")));
String rspc_dduc_basi_yy_2 = Util.Uni2Ksc(Util.checkString(req.getParameter("rspc_dduc_basi_yy_2")));
String obcl_pers_dduc_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("obcl_pers_dduc_amt")));
String fml_dduc_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("fml_dduc_amt")));
String child_care_fee_dduc_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("child_care_fee_dduc_amt")));
String one_paren_dduc_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("one_paren_dduc_amt")));
String mlt_chld_basi_dduc_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("mlt_chld_basi_dduc_amt")));
String mlt_chld_pers_dduc_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("mlt_chld_pers_dduc_amt")));
String mlt_chld_birth_dduc_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("mlt_chld_birth_dduc_amt")));
String gnr_insr_limt_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("gnr_insr_limt_amt")));
String obcl_pers_insr_limt_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("obcl_pers_insr_limt_amt")));
String hosp_fee_basi_ratio = Util.Uni2Ksc(Util.checkString(req.getParameter("hosp_fee_basi_ratio")));
String hosp_fee_limt_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("hosp_fee_limt_amt")));
String baby_edu_fee = Util.Uni2Ksc(Util.checkString(req.getParameter("baby_edu_fee")));
String elmihi_edu_fee = Util.Uni2Ksc(Util.checkString(req.getParameter("elmihi_edu_fee")));
String univ_edu_fee = Util.Uni2Ksc(Util.checkString(req.getParameter("univ_edu_fee")));
String hous_savg_aply_ratio = Util.Uni2Ksc(Util.checkString(req.getParameter("hous_savg_aply_ratio")));
String hous_savg_aply_limt_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("hous_savg_aply_limt_amt")));
String hous_hire_aply_ratio = Util.Uni2Ksc(Util.checkString(req.getParameter("hous_hire_aply_ratio")));
String hous_hire_aply_limt_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("hous_hire_aply_limt_amt")));
String ltrm_hous_loan_limt_amt_1 = Util.Uni2Ksc(Util.checkString(req.getParameter("ltrm_hous_loan_limt_amt_1")));
String ltrm_hous_loan_limt_amt_2 = Util.Uni2Ksc(Util.checkString(req.getParameter("ltrm_hous_loan_limt_amt_2")));
String ltrm_hous_loan_limt_amt_3 = Util.Uni2Ksc(Util.checkString(req.getParameter("ltrm_hous_loan_limt_amt_3")));
String wedd_fnrl_movm_widr_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("wedd_fnrl_movm_widr_amt")));
String wedd_fnrl_movm_tot_saly_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("wedd_fnrl_movm_tot_saly_amt")));
String wedd_fnrl_movm_incm_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("wedd_fnrl_movm_incm_amt")));
String std_dduc_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("std_dduc_amt")));
String monthly_rent_amt_ratio = Util.Uni2Ksc(Util.checkString(req.getParameter("monthly_rent_amt_ratio")));
String prsn_pens_savg_ratio = Util.Uni2Ksc(Util.checkString(req.getParameter("prsn_pens_savg_ratio")));
String prsn_pens_savg_limt_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("prsn_pens_savg_limt_amt")));
String pens_savg_limt_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("pens_savg_limt_amt")));
String invsm_cmpd_invsm_ratio = Util.Uni2Ksc(Util.checkString(req.getParameter("invsm_cmpd_invsm_ratio")));
String lvcmpy_pens_limt_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("lvcmpy_pens_limt_amt")));
String emp_stok_ownr_limt_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_stok_ownr_limt_amt")));
String crdt_card_tot_saly_ratio = Util.Uni2Ksc(Util.checkString(req.getParameter("crdt_card_tot_saly_ratio")));
String crdt_card_excs_amt_ratio = Util.Uni2Ksc(Util.checkString(req.getParameter("crdt_card_excs_amt_ratio")));
String crdt_card_limt_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("crdt_card_limt_amt")));
String no_lar_sum_lease_limt_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("no_lar_sum_lease_limt_amt")));
String no_lar_sum_lease_limt_ratio = Util.Uni2Ksc(Util.checkString(req.getParameter("no_lar_sum_lease_limt_ratio")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setAdjm_yy(adjm_yy);
dm.setIncmg_pers_ip(incmg_pers_ip);
dm.setIncmg_pers(incmg_pers);
dm.setSlf_dduc_amt(slf_dduc_amt);
dm.setSpos_dduc_amt(spos_dduc_amt);
dm.setChild_dduc_amt(child_dduc_amt);
dm.setChild_dduc_basi_yy(child_dduc_basi_yy);
dm.setPrnt_dduc_amt_1(prnt_dduc_amt_1);
dm.setPrnt_dduc_basi_yy_1(prnt_dduc_basi_yy_1);
dm.setPrnt_dduc_amt_2(prnt_dduc_amt_2);
dm.setPrnt_dduc_basi_yy_2(prnt_dduc_basi_yy_2);
dm.setBrth_istt_amt_1(brth_istt_amt_1);
dm.setBrth_istt_basi_yy_1(brth_istt_basi_yy_1);
dm.setBrth_istt_amt_2(brth_istt_amt_2);
dm.setBrth_istt_basi_yy_2(brth_istt_basi_yy_2);
dm.setBrth_istt_amt_3(brth_istt_amt_3);
dm.setBrth_istt_basi_yy_3(brth_istt_basi_yy_3);
dm.setRspc_dduc_amt_1(rspc_dduc_amt_1);
dm.setRspc_dduc_basi_yy_1_fr(rspc_dduc_basi_yy_1_fr);
dm.setRspc_dduc_basi_yy_1_to(rspc_dduc_basi_yy_1_to);
dm.setRspc_dduc_amt_2(rspc_dduc_amt_2);
dm.setRspc_dduc_basi_yy_2(rspc_dduc_basi_yy_2);
dm.setObcl_pers_dduc_amt(obcl_pers_dduc_amt);
dm.setFml_dduc_amt(fml_dduc_amt);
dm.setChild_care_fee_dduc_amt(child_care_fee_dduc_amt);
dm.setOne_paren_dduc_amt(one_paren_dduc_amt);
dm.setMlt_chld_basi_dduc_amt(mlt_chld_basi_dduc_amt);
dm.setMlt_chld_pers_dduc_amt(mlt_chld_pers_dduc_amt);
dm.setMlt_chld_birth_dduc_amt(mlt_chld_birth_dduc_amt);
dm.setGnr_insr_limt_amt(gnr_insr_limt_amt);
dm.setObcl_pers_insr_limt_amt(obcl_pers_insr_limt_amt);
dm.setHosp_fee_basi_ratio(hosp_fee_basi_ratio);
dm.setHosp_fee_limt_amt(hosp_fee_limt_amt);
dm.setBaby_edu_fee(baby_edu_fee);
dm.setElmihi_edu_fee(elmihi_edu_fee);
dm.setUniv_edu_fee(univ_edu_fee);
dm.setHous_savg_aply_ratio(hous_savg_aply_ratio);
dm.setHous_savg_aply_limt_amt(hous_savg_aply_limt_amt);
dm.setHous_hire_aply_ratio(hous_hire_aply_ratio);
dm.setHous_hire_aply_limt_amt(hous_hire_aply_limt_amt);
dm.setLtrm_hous_loan_limt_amt_1(ltrm_hous_loan_limt_amt_1);
dm.setLtrm_hous_loan_limt_amt_2(ltrm_hous_loan_limt_amt_2);
dm.setLtrm_hous_loan_limt_amt_3(ltrm_hous_loan_limt_amt_3);
dm.setWedd_fnrl_movm_widr_amt(wedd_fnrl_movm_widr_amt);
dm.setWedd_fnrl_movm_tot_saly_amt(wedd_fnrl_movm_tot_saly_amt);
dm.setWedd_fnrl_movm_incm_amt(wedd_fnrl_movm_incm_amt);
dm.setStd_dduc_amt(std_dduc_amt);
dm.setMonthly_rent_amt_ratio(monthly_rent_amt_ratio);
dm.setPrsn_pens_savg_ratio(prsn_pens_savg_ratio);
dm.setPrsn_pens_savg_limt_amt(prsn_pens_savg_limt_amt);
dm.setPens_savg_limt_amt(pens_savg_limt_amt);
dm.setInvsm_cmpd_invsm_ratio(invsm_cmpd_invsm_ratio);
dm.setLvcmpy_pens_limt_amt(lvcmpy_pens_limt_amt);
dm.setEmp_stok_ownr_limt_amt(emp_stok_ownr_limt_amt);
dm.setCrdt_card_tot_saly_ratio(crdt_card_tot_saly_ratio);
dm.setCrdt_card_excs_amt_ratio(crdt_card_excs_amt_ratio);
dm.setCrdt_card_limt_amt(crdt_card_limt_amt);
dm.setNo_lar_sum_lease_limt_amt(no_lar_sum_lease_limt_amt);
dm.setNo_lar_sum_lease_limt_ratio(no_lar_sum_lease_limt_ratio);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Dec 23 13:49:23 KST 2013 */
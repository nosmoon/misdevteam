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


public class HD_YADJM_1500_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String labr_incm_impt_amt;
	public String labr_incm_dduc;
	public String labr_incm_amt;
	public String base_dduc_slf;
	public String base_dduc_spos;
	public String base_dduc_child;
	public String base_dduc_oldg;
	public String faml_nops;
	public String addm_dduc_rspc;
	public String rspc_nops;
	public String addm_dduc_obcl_pers;
	public String obcl_pers_nops;
	public String addm_dduc_fml_hshd;
	public String addm_dduc_care_fee;
	public String child_care_fee_nops;
	public String adopt_dduc;
	public String adopt_dduc_nops;
	public String multi_child_addm_dduc;
	public String multi_child_nops;
	public String pens_savg_incm_dduc;
	public String np_insr_fee_dduc;
	public String spc_dduc_insr_fee;
	public String spc_dduc_hosp_fee;
	public String spc_dduc_edu_fee;
	public String spc_dduc_hous_fund;
	public String spc_dduc_dona_amt;
	public String spc_dduc_wedd_etc;
	public String spc_dduc_stot;
	public String std_dduc_amt;
	public String crdt_card_use_amt;
	public String vent_invsm_1;
	public String vent_invsm_2;
	public String stock_save;
	public String tax_rl_dduc_prsn_pens;
	public String tax_rl_dduc_tech_manpwr;
	public String tax_rl_dduc_etc;
	public String txn_std_amt;
	public String calc_incm_tax;
	public String tax_amt_dduc_labr_incm;
	public String tax_amt_dduc_forn_pymt;
	public String tax_amt_dduc_hous_loan_amt_int;
	public String tax_amt_dduc_stok_savg;
	public String tax_amt_dduc_savg;
	public String tax_amt_dduc_hous_fund;
	public String tax_amt_dduc_ltrm_savg;
	public String tax_amt_dduc_polt_fund;
	public String tax_amt_dduc_etc;
	public String tax_amt_dduc_stot;
	public String tax_amt_redu_incm_tax_law;
	public String tax_amt_redu_tax_rl;
	public String tax_amt_redu_etc;
	public String tax_amt_redu_stot;
	public String deci_incm_tax;
	public String deci_farm_spc_tax;
	public String deci_res_tax;
	public String deci_tax_stot;
	public String befo_pymt_incm_tax;
	public String befo_pymt_farm_spc_tax;
	public String befo_pymt_res_tax;
	public String befo_pymt_tax_stot;
	public String now_pymt_incm_tax;
	public String now_pymt_farm_spc_tax;
	public String now_pymt_res_tax;
	public String now_pymt_tax_stot;
	public String dedu_labr_incm_amt;
	public String dedu_incm_tax;
	public String dedu_farm_spc_tax;
	public String dedu_res_tax;
	public String dedu_tax_stot;
	public String rvrs_prd_frdt;
	public String rvrs_prd_todt;
	public String redu_prd_frdt;
	public String redu_prd_todt;
	public String spc_dduc_won_li_amt;
	public String spc_dduc_mogg_loan_amt;

	public HD_YADJM_1500_LCURLISTRecord(){}

	public void setLabr_incm_impt_amt(String labr_incm_impt_amt){
		this.labr_incm_impt_amt = labr_incm_impt_amt;
	}

	public void setLabr_incm_dduc(String labr_incm_dduc){
		this.labr_incm_dduc = labr_incm_dduc;
	}

	public void setLabr_incm_amt(String labr_incm_amt){
		this.labr_incm_amt = labr_incm_amt;
	}

	public void setBase_dduc_slf(String base_dduc_slf){
		this.base_dduc_slf = base_dduc_slf;
	}

	public void setBase_dduc_spos(String base_dduc_spos){
		this.base_dduc_spos = base_dduc_spos;
	}

	public void setBase_dduc_child(String base_dduc_child){
		this.base_dduc_child = base_dduc_child;
	}

	public void setBase_dduc_oldg(String base_dduc_oldg){
		this.base_dduc_oldg = base_dduc_oldg;
	}

	public void setFaml_nops(String faml_nops){
		this.faml_nops = faml_nops;
	}

	public void setAddm_dduc_rspc(String addm_dduc_rspc){
		this.addm_dduc_rspc = addm_dduc_rspc;
	}

	public void setRspc_nops(String rspc_nops){
		this.rspc_nops = rspc_nops;
	}

	public void setAddm_dduc_obcl_pers(String addm_dduc_obcl_pers){
		this.addm_dduc_obcl_pers = addm_dduc_obcl_pers;
	}

	public void setObcl_pers_nops(String obcl_pers_nops){
		this.obcl_pers_nops = obcl_pers_nops;
	}

	public void setAddm_dduc_fml_hshd(String addm_dduc_fml_hshd){
		this.addm_dduc_fml_hshd = addm_dduc_fml_hshd;
	}

	public void setAddm_dduc_care_fee(String addm_dduc_care_fee){
		this.addm_dduc_care_fee = addm_dduc_care_fee;
	}

	public void setChild_care_fee_nops(String child_care_fee_nops){
		this.child_care_fee_nops = child_care_fee_nops;
	}

	public void setAdopt_dduc(String adopt_dduc){
		this.adopt_dduc = adopt_dduc;
	}

	public void setAdopt_dduc_nops(String adopt_dduc_nops){
		this.adopt_dduc_nops = adopt_dduc_nops;
	}

	public void setMulti_child_addm_dduc(String multi_child_addm_dduc){
		this.multi_child_addm_dduc = multi_child_addm_dduc;
	}

	public void setMulti_child_nops(String multi_child_nops){
		this.multi_child_nops = multi_child_nops;
	}

	public void setPens_savg_incm_dduc(String pens_savg_incm_dduc){
		this.pens_savg_incm_dduc = pens_savg_incm_dduc;
	}

	public void setNp_insr_fee_dduc(String np_insr_fee_dduc){
		this.np_insr_fee_dduc = np_insr_fee_dduc;
	}

	public void setSpc_dduc_insr_fee(String spc_dduc_insr_fee){
		this.spc_dduc_insr_fee = spc_dduc_insr_fee;
	}

	public void setSpc_dduc_hosp_fee(String spc_dduc_hosp_fee){
		this.spc_dduc_hosp_fee = spc_dduc_hosp_fee;
	}

	public void setSpc_dduc_edu_fee(String spc_dduc_edu_fee){
		this.spc_dduc_edu_fee = spc_dduc_edu_fee;
	}

	public void setSpc_dduc_hous_fund(String spc_dduc_hous_fund){
		this.spc_dduc_hous_fund = spc_dduc_hous_fund;
	}

	public void setSpc_dduc_dona_amt(String spc_dduc_dona_amt){
		this.spc_dduc_dona_amt = spc_dduc_dona_amt;
	}

	public void setSpc_dduc_wedd_etc(String spc_dduc_wedd_etc){
		this.spc_dduc_wedd_etc = spc_dduc_wedd_etc;
	}

	public void setSpc_dduc_stot(String spc_dduc_stot){
		this.spc_dduc_stot = spc_dduc_stot;
	}

	public void setStd_dduc_amt(String std_dduc_amt){
		this.std_dduc_amt = std_dduc_amt;
	}

	public void setCrdt_card_use_amt(String crdt_card_use_amt){
		this.crdt_card_use_amt = crdt_card_use_amt;
	}

	public void setVent_invsm_1(String vent_invsm_1){
		this.vent_invsm_1 = vent_invsm_1;
	}

	public void setVent_invsm_2(String vent_invsm_2){
		this.vent_invsm_2 = vent_invsm_2;
	}

	public void setStock_save(String stock_save){
		this.stock_save = stock_save;
	}

	public void setTax_rl_dduc_prsn_pens(String tax_rl_dduc_prsn_pens){
		this.tax_rl_dduc_prsn_pens = tax_rl_dduc_prsn_pens;
	}

	public void setTax_rl_dduc_tech_manpwr(String tax_rl_dduc_tech_manpwr){
		this.tax_rl_dduc_tech_manpwr = tax_rl_dduc_tech_manpwr;
	}

	public void setTax_rl_dduc_etc(String tax_rl_dduc_etc){
		this.tax_rl_dduc_etc = tax_rl_dduc_etc;
	}

	public void setTxn_std_amt(String txn_std_amt){
		this.txn_std_amt = txn_std_amt;
	}

	public void setCalc_incm_tax(String calc_incm_tax){
		this.calc_incm_tax = calc_incm_tax;
	}

	public void setTax_amt_dduc_labr_incm(String tax_amt_dduc_labr_incm){
		this.tax_amt_dduc_labr_incm = tax_amt_dduc_labr_incm;
	}

	public void setTax_amt_dduc_forn_pymt(String tax_amt_dduc_forn_pymt){
		this.tax_amt_dduc_forn_pymt = tax_amt_dduc_forn_pymt;
	}

	public void setTax_amt_dduc_hous_loan_amt_int(String tax_amt_dduc_hous_loan_amt_int){
		this.tax_amt_dduc_hous_loan_amt_int = tax_amt_dduc_hous_loan_amt_int;
	}

	public void setTax_amt_dduc_stok_savg(String tax_amt_dduc_stok_savg){
		this.tax_amt_dduc_stok_savg = tax_amt_dduc_stok_savg;
	}

	public void setTax_amt_dduc_savg(String tax_amt_dduc_savg){
		this.tax_amt_dduc_savg = tax_amt_dduc_savg;
	}

	public void setTax_amt_dduc_hous_fund(String tax_amt_dduc_hous_fund){
		this.tax_amt_dduc_hous_fund = tax_amt_dduc_hous_fund;
	}

	public void setTax_amt_dduc_ltrm_savg(String tax_amt_dduc_ltrm_savg){
		this.tax_amt_dduc_ltrm_savg = tax_amt_dduc_ltrm_savg;
	}

	public void setTax_amt_dduc_polt_fund(String tax_amt_dduc_polt_fund){
		this.tax_amt_dduc_polt_fund = tax_amt_dduc_polt_fund;
	}

	public void setTax_amt_dduc_etc(String tax_amt_dduc_etc){
		this.tax_amt_dduc_etc = tax_amt_dduc_etc;
	}

	public void setTax_amt_dduc_stot(String tax_amt_dduc_stot){
		this.tax_amt_dduc_stot = tax_amt_dduc_stot;
	}

	public void setTax_amt_redu_incm_tax_law(String tax_amt_redu_incm_tax_law){
		this.tax_amt_redu_incm_tax_law = tax_amt_redu_incm_tax_law;
	}

	public void setTax_amt_redu_tax_rl(String tax_amt_redu_tax_rl){
		this.tax_amt_redu_tax_rl = tax_amt_redu_tax_rl;
	}

	public void setTax_amt_redu_etc(String tax_amt_redu_etc){
		this.tax_amt_redu_etc = tax_amt_redu_etc;
	}

	public void setTax_amt_redu_stot(String tax_amt_redu_stot){
		this.tax_amt_redu_stot = tax_amt_redu_stot;
	}

	public void setDeci_incm_tax(String deci_incm_tax){
		this.deci_incm_tax = deci_incm_tax;
	}

	public void setDeci_farm_spc_tax(String deci_farm_spc_tax){
		this.deci_farm_spc_tax = deci_farm_spc_tax;
	}

	public void setDeci_res_tax(String deci_res_tax){
		this.deci_res_tax = deci_res_tax;
	}

	public void setDeci_tax_stot(String deci_tax_stot){
		this.deci_tax_stot = deci_tax_stot;
	}

	public void setBefo_pymt_incm_tax(String befo_pymt_incm_tax){
		this.befo_pymt_incm_tax = befo_pymt_incm_tax;
	}

	public void setBefo_pymt_farm_spc_tax(String befo_pymt_farm_spc_tax){
		this.befo_pymt_farm_spc_tax = befo_pymt_farm_spc_tax;
	}

	public void setBefo_pymt_res_tax(String befo_pymt_res_tax){
		this.befo_pymt_res_tax = befo_pymt_res_tax;
	}

	public void setBefo_pymt_tax_stot(String befo_pymt_tax_stot){
		this.befo_pymt_tax_stot = befo_pymt_tax_stot;
	}

	public void setNow_pymt_incm_tax(String now_pymt_incm_tax){
		this.now_pymt_incm_tax = now_pymt_incm_tax;
	}

	public void setNow_pymt_farm_spc_tax(String now_pymt_farm_spc_tax){
		this.now_pymt_farm_spc_tax = now_pymt_farm_spc_tax;
	}

	public void setNow_pymt_res_tax(String now_pymt_res_tax){
		this.now_pymt_res_tax = now_pymt_res_tax;
	}

	public void setNow_pymt_tax_stot(String now_pymt_tax_stot){
		this.now_pymt_tax_stot = now_pymt_tax_stot;
	}

	public void setDedu_labr_incm_amt(String dedu_labr_incm_amt){
		this.dedu_labr_incm_amt = dedu_labr_incm_amt;
	}

	public void setDedu_incm_tax(String dedu_incm_tax){
		this.dedu_incm_tax = dedu_incm_tax;
	}

	public void setDedu_farm_spc_tax(String dedu_farm_spc_tax){
		this.dedu_farm_spc_tax = dedu_farm_spc_tax;
	}

	public void setDedu_res_tax(String dedu_res_tax){
		this.dedu_res_tax = dedu_res_tax;
	}

	public void setDedu_tax_stot(String dedu_tax_stot){
		this.dedu_tax_stot = dedu_tax_stot;
	}

	public void setRvrs_prd_frdt(String rvrs_prd_frdt){
		this.rvrs_prd_frdt = rvrs_prd_frdt;
	}

	public void setRvrs_prd_todt(String rvrs_prd_todt){
		this.rvrs_prd_todt = rvrs_prd_todt;
	}

	public void setRedu_prd_frdt(String redu_prd_frdt){
		this.redu_prd_frdt = redu_prd_frdt;
	}

	public void setRedu_prd_todt(String redu_prd_todt){
		this.redu_prd_todt = redu_prd_todt;
	}

	public void setSpc_dduc_won_li_amt(String spc_dduc_won_li_amt){
		this.spc_dduc_won_li_amt = spc_dduc_won_li_amt;
	}

	public void setSpc_dduc_mogg_loan_amt(String spc_dduc_mogg_loan_amt){
		this.spc_dduc_mogg_loan_amt = spc_dduc_mogg_loan_amt;
	}

	public String getLabr_incm_impt_amt(){
		return this.labr_incm_impt_amt;
	}

	public String getLabr_incm_dduc(){
		return this.labr_incm_dduc;
	}

	public String getLabr_incm_amt(){
		return this.labr_incm_amt;
	}

	public String getBase_dduc_slf(){
		return this.base_dduc_slf;
	}

	public String getBase_dduc_spos(){
		return this.base_dduc_spos;
	}

	public String getBase_dduc_child(){
		return this.base_dduc_child;
	}

	public String getBase_dduc_oldg(){
		return this.base_dduc_oldg;
	}

	public String getFaml_nops(){
		return this.faml_nops;
	}

	public String getAddm_dduc_rspc(){
		return this.addm_dduc_rspc;
	}

	public String getRspc_nops(){
		return this.rspc_nops;
	}

	public String getAddm_dduc_obcl_pers(){
		return this.addm_dduc_obcl_pers;
	}

	public String getObcl_pers_nops(){
		return this.obcl_pers_nops;
	}

	public String getAddm_dduc_fml_hshd(){
		return this.addm_dduc_fml_hshd;
	}

	public String getAddm_dduc_care_fee(){
		return this.addm_dduc_care_fee;
	}

	public String getChild_care_fee_nops(){
		return this.child_care_fee_nops;
	}

	public String getAdopt_dduc(){
		return this.adopt_dduc;
	}

	public String getAdopt_dduc_nops(){
		return this.adopt_dduc_nops;
	}

	public String getMulti_child_addm_dduc(){
		return this.multi_child_addm_dduc;
	}

	public String getMulti_child_nops(){
		return this.multi_child_nops;
	}

	public String getPens_savg_incm_dduc(){
		return this.pens_savg_incm_dduc;
	}

	public String getNp_insr_fee_dduc(){
		return this.np_insr_fee_dduc;
	}

	public String getSpc_dduc_insr_fee(){
		return this.spc_dduc_insr_fee;
	}

	public String getSpc_dduc_hosp_fee(){
		return this.spc_dduc_hosp_fee;
	}

	public String getSpc_dduc_edu_fee(){
		return this.spc_dduc_edu_fee;
	}

	public String getSpc_dduc_hous_fund(){
		return this.spc_dduc_hous_fund;
	}

	public String getSpc_dduc_dona_amt(){
		return this.spc_dduc_dona_amt;
	}

	public String getSpc_dduc_wedd_etc(){
		return this.spc_dduc_wedd_etc;
	}

	public String getSpc_dduc_stot(){
		return this.spc_dduc_stot;
	}

	public String getStd_dduc_amt(){
		return this.std_dduc_amt;
	}

	public String getCrdt_card_use_amt(){
		return this.crdt_card_use_amt;
	}

	public String getVent_invsm_1(){
		return this.vent_invsm_1;
	}

	public String getVent_invsm_2(){
		return this.vent_invsm_2;
	}

	public String getStock_save(){
		return this.stock_save;
	}

	public String getTax_rl_dduc_prsn_pens(){
		return this.tax_rl_dduc_prsn_pens;
	}

	public String getTax_rl_dduc_tech_manpwr(){
		return this.tax_rl_dduc_tech_manpwr;
	}

	public String getTax_rl_dduc_etc(){
		return this.tax_rl_dduc_etc;
	}

	public String getTxn_std_amt(){
		return this.txn_std_amt;
	}

	public String getCalc_incm_tax(){
		return this.calc_incm_tax;
	}

	public String getTax_amt_dduc_labr_incm(){
		return this.tax_amt_dduc_labr_incm;
	}

	public String getTax_amt_dduc_forn_pymt(){
		return this.tax_amt_dduc_forn_pymt;
	}

	public String getTax_amt_dduc_hous_loan_amt_int(){
		return this.tax_amt_dduc_hous_loan_amt_int;
	}

	public String getTax_amt_dduc_stok_savg(){
		return this.tax_amt_dduc_stok_savg;
	}

	public String getTax_amt_dduc_savg(){
		return this.tax_amt_dduc_savg;
	}

	public String getTax_amt_dduc_hous_fund(){
		return this.tax_amt_dduc_hous_fund;
	}

	public String getTax_amt_dduc_ltrm_savg(){
		return this.tax_amt_dduc_ltrm_savg;
	}

	public String getTax_amt_dduc_polt_fund(){
		return this.tax_amt_dduc_polt_fund;
	}

	public String getTax_amt_dduc_etc(){
		return this.tax_amt_dduc_etc;
	}

	public String getTax_amt_dduc_stot(){
		return this.tax_amt_dduc_stot;
	}

	public String getTax_amt_redu_incm_tax_law(){
		return this.tax_amt_redu_incm_tax_law;
	}

	public String getTax_amt_redu_tax_rl(){
		return this.tax_amt_redu_tax_rl;
	}

	public String getTax_amt_redu_etc(){
		return this.tax_amt_redu_etc;
	}

	public String getTax_amt_redu_stot(){
		return this.tax_amt_redu_stot;
	}

	public String getDeci_incm_tax(){
		return this.deci_incm_tax;
	}

	public String getDeci_farm_spc_tax(){
		return this.deci_farm_spc_tax;
	}

	public String getDeci_res_tax(){
		return this.deci_res_tax;
	}

	public String getDeci_tax_stot(){
		return this.deci_tax_stot;
	}

	public String getBefo_pymt_incm_tax(){
		return this.befo_pymt_incm_tax;
	}

	public String getBefo_pymt_farm_spc_tax(){
		return this.befo_pymt_farm_spc_tax;
	}

	public String getBefo_pymt_res_tax(){
		return this.befo_pymt_res_tax;
	}

	public String getBefo_pymt_tax_stot(){
		return this.befo_pymt_tax_stot;
	}

	public String getNow_pymt_incm_tax(){
		return this.now_pymt_incm_tax;
	}

	public String getNow_pymt_farm_spc_tax(){
		return this.now_pymt_farm_spc_tax;
	}

	public String getNow_pymt_res_tax(){
		return this.now_pymt_res_tax;
	}

	public String getNow_pymt_tax_stot(){
		return this.now_pymt_tax_stot;
	}

	public String getDedu_labr_incm_amt(){
		return this.dedu_labr_incm_amt;
	}

	public String getDedu_incm_tax(){
		return this.dedu_incm_tax;
	}

	public String getDedu_farm_spc_tax(){
		return this.dedu_farm_spc_tax;
	}

	public String getDedu_res_tax(){
		return this.dedu_res_tax;
	}

	public String getDedu_tax_stot(){
		return this.dedu_tax_stot;
	}

	public String getRvrs_prd_frdt(){
		return this.rvrs_prd_frdt;
	}

	public String getRvrs_prd_todt(){
		return this.rvrs_prd_todt;
	}

	public String getRedu_prd_frdt(){
		return this.redu_prd_frdt;
	}

	public String getRedu_prd_todt(){
		return this.redu_prd_todt;
	}

	public String getSpc_dduc_won_li_amt(){
		return this.spc_dduc_won_li_amt;
	}

	public String getSpc_dduc_mogg_loan_amt(){
		return this.spc_dduc_mogg_loan_amt;
	}
}

/* 작성시간 : Mon Jan 18 09:14:01 KST 2010 */
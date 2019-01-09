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


public class HD_YADJM_2013_1250_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String deci_incm_tax;
	public String deci_res_tax;
	public String deci_farm_spc_tax;
	public String deci_tax_stot;
	public String befo_pymt_incm_tax;
	public String befo_pymt_res_tax;
	public String befo_pymt_farm_spc_tax;
	public String befo_pymt_tax_stot;
	public String now_pymt_incm_tax;
	public String now_pymt_res_tax;
	public String now_pymt_farm_spc_tax;
	public String now_pymt_tax_stot;
	public String dedu_incm_tax;
	public String dedu_res_tax;
	public String dedu_farm_spc_tax;
	public String dedu_tax_stot;
	public String labr_incm_impt_amt;
	public String labr_incm_dduc;
	public String labr_incm_amt;
	public String base_dduc_slf;
	public String base_dduc_spos;
	public String faml_nops;
	public String base_dduc_child_oldg;
	public String rspc_nops;
	public String addm_dduc_rspc;
	public String obcl_pers_nops;
	public String addm_dduc_obcl_pers;
	public String child_care_fee_nops;
	public String addm_dduc_care_fee;
	public String adopt_dduc_nops;
	public String adopt_dduc;
	public String addm_dduc_fml_hshd;
	public String addm_dduc_one_paren;
	public String multi_child_nops;
	public String multi_child_addm_dduc;
	public String np_insr_fee_dduc;
	public String tot_hlth_insr_fee;
	public String tot_emp_insr_fee;
	public String gnr_asrc_prpn_insr_fee;
	public String obcl_pers_lesd_insr_fee;
	public String spc_dduc_hosp_fee;
	public String spc_dduc_edu_fee;
	public String spc_dduc_won_li_amt;
	public String monthly_rent_amt;
	public String spc_dduc_mogg_loan_amt;
	public String spc_dduc_dona_amt;
	public String spc_dduc_stot;
	public String std_dduc_amt;
	public String dedu_labr_incm_amt;
	public String tax_rl_dduc_prsn_pens;
	public String pens_savg_incm_dduc;
	public String hous_subc_savg;
	public String multy_house_plan_savg;
	public String ltrm_hous_savg;
	public String labr_hous_savg;
	public String vent_invsm;
	public String crdt_card_use_amt;
	public String smallbiz_incm_dduc;
	public String stock_save;
	public String txn_std_amt;
	public String incm_dduc_tot_limt_excs_amt;
	public String calc_incm_tax;
	public String tax_amt_dduc_labr_incm;
	public String tax_amt_dduc_hous_loan_amt_int;
	public String tax_amt_dduc_polt_fund;
	public String tax_amt_dduc_forn_pymt;
	public String tax_amt_dduc_stot;
	public String deci_incm_tax2;
	public String lvcmpy_pens_dduc;

	public HD_YADJM_2013_1250_LCURLISTRecord(){}

	public void setDeci_incm_tax(String deci_incm_tax){
		this.deci_incm_tax = deci_incm_tax;
	}

	public void setDeci_res_tax(String deci_res_tax){
		this.deci_res_tax = deci_res_tax;
	}

	public void setDeci_farm_spc_tax(String deci_farm_spc_tax){
		this.deci_farm_spc_tax = deci_farm_spc_tax;
	}

	public void setDeci_tax_stot(String deci_tax_stot){
		this.deci_tax_stot = deci_tax_stot;
	}

	public void setBefo_pymt_incm_tax(String befo_pymt_incm_tax){
		this.befo_pymt_incm_tax = befo_pymt_incm_tax;
	}

	public void setBefo_pymt_res_tax(String befo_pymt_res_tax){
		this.befo_pymt_res_tax = befo_pymt_res_tax;
	}

	public void setBefo_pymt_farm_spc_tax(String befo_pymt_farm_spc_tax){
		this.befo_pymt_farm_spc_tax = befo_pymt_farm_spc_tax;
	}

	public void setBefo_pymt_tax_stot(String befo_pymt_tax_stot){
		this.befo_pymt_tax_stot = befo_pymt_tax_stot;
	}

	public void setNow_pymt_incm_tax(String now_pymt_incm_tax){
		this.now_pymt_incm_tax = now_pymt_incm_tax;
	}

	public void setNow_pymt_res_tax(String now_pymt_res_tax){
		this.now_pymt_res_tax = now_pymt_res_tax;
	}

	public void setNow_pymt_farm_spc_tax(String now_pymt_farm_spc_tax){
		this.now_pymt_farm_spc_tax = now_pymt_farm_spc_tax;
	}

	public void setNow_pymt_tax_stot(String now_pymt_tax_stot){
		this.now_pymt_tax_stot = now_pymt_tax_stot;
	}

	public void setDedu_incm_tax(String dedu_incm_tax){
		this.dedu_incm_tax = dedu_incm_tax;
	}

	public void setDedu_res_tax(String dedu_res_tax){
		this.dedu_res_tax = dedu_res_tax;
	}

	public void setDedu_farm_spc_tax(String dedu_farm_spc_tax){
		this.dedu_farm_spc_tax = dedu_farm_spc_tax;
	}

	public void setDedu_tax_stot(String dedu_tax_stot){
		this.dedu_tax_stot = dedu_tax_stot;
	}

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

	public void setFaml_nops(String faml_nops){
		this.faml_nops = faml_nops;
	}

	public void setBase_dduc_child_oldg(String base_dduc_child_oldg){
		this.base_dduc_child_oldg = base_dduc_child_oldg;
	}

	public void setRspc_nops(String rspc_nops){
		this.rspc_nops = rspc_nops;
	}

	public void setAddm_dduc_rspc(String addm_dduc_rspc){
		this.addm_dduc_rspc = addm_dduc_rspc;
	}

	public void setObcl_pers_nops(String obcl_pers_nops){
		this.obcl_pers_nops = obcl_pers_nops;
	}

	public void setAddm_dduc_obcl_pers(String addm_dduc_obcl_pers){
		this.addm_dduc_obcl_pers = addm_dduc_obcl_pers;
	}

	public void setChild_care_fee_nops(String child_care_fee_nops){
		this.child_care_fee_nops = child_care_fee_nops;
	}

	public void setAddm_dduc_care_fee(String addm_dduc_care_fee){
		this.addm_dduc_care_fee = addm_dduc_care_fee;
	}

	public void setAdopt_dduc_nops(String adopt_dduc_nops){
		this.adopt_dduc_nops = adopt_dduc_nops;
	}

	public void setAdopt_dduc(String adopt_dduc){
		this.adopt_dduc = adopt_dduc;
	}

	public void setAddm_dduc_fml_hshd(String addm_dduc_fml_hshd){
		this.addm_dduc_fml_hshd = addm_dduc_fml_hshd;
	}

	public void setAddm_dduc_one_paren(String addm_dduc_one_paren){
		this.addm_dduc_one_paren = addm_dduc_one_paren;
	}

	public void setMulti_child_nops(String multi_child_nops){
		this.multi_child_nops = multi_child_nops;
	}

	public void setMulti_child_addm_dduc(String multi_child_addm_dduc){
		this.multi_child_addm_dduc = multi_child_addm_dduc;
	}

	public void setNp_insr_fee_dduc(String np_insr_fee_dduc){
		this.np_insr_fee_dduc = np_insr_fee_dduc;
	}

	public void setTot_hlth_insr_fee(String tot_hlth_insr_fee){
		this.tot_hlth_insr_fee = tot_hlth_insr_fee;
	}

	public void setTot_emp_insr_fee(String tot_emp_insr_fee){
		this.tot_emp_insr_fee = tot_emp_insr_fee;
	}

	public void setGnr_asrc_prpn_insr_fee(String gnr_asrc_prpn_insr_fee){
		this.gnr_asrc_prpn_insr_fee = gnr_asrc_prpn_insr_fee;
	}

	public void setObcl_pers_lesd_insr_fee(String obcl_pers_lesd_insr_fee){
		this.obcl_pers_lesd_insr_fee = obcl_pers_lesd_insr_fee;
	}

	public void setSpc_dduc_hosp_fee(String spc_dduc_hosp_fee){
		this.spc_dduc_hosp_fee = spc_dduc_hosp_fee;
	}

	public void setSpc_dduc_edu_fee(String spc_dduc_edu_fee){
		this.spc_dduc_edu_fee = spc_dduc_edu_fee;
	}

	public void setSpc_dduc_won_li_amt(String spc_dduc_won_li_amt){
		this.spc_dduc_won_li_amt = spc_dduc_won_li_amt;
	}

	public void setMonthly_rent_amt(String monthly_rent_amt){
		this.monthly_rent_amt = monthly_rent_amt;
	}

	public void setSpc_dduc_mogg_loan_amt(String spc_dduc_mogg_loan_amt){
		this.spc_dduc_mogg_loan_amt = spc_dduc_mogg_loan_amt;
	}

	public void setSpc_dduc_dona_amt(String spc_dduc_dona_amt){
		this.spc_dduc_dona_amt = spc_dduc_dona_amt;
	}

	public void setSpc_dduc_stot(String spc_dduc_stot){
		this.spc_dduc_stot = spc_dduc_stot;
	}

	public void setStd_dduc_amt(String std_dduc_amt){
		this.std_dduc_amt = std_dduc_amt;
	}

	public void setDedu_labr_incm_amt(String dedu_labr_incm_amt){
		this.dedu_labr_incm_amt = dedu_labr_incm_amt;
	}

	public void setTax_rl_dduc_prsn_pens(String tax_rl_dduc_prsn_pens){
		this.tax_rl_dduc_prsn_pens = tax_rl_dduc_prsn_pens;
	}

	public void setPens_savg_incm_dduc(String pens_savg_incm_dduc){
		this.pens_savg_incm_dduc = pens_savg_incm_dduc;
	}

	public void setHous_subc_savg(String hous_subc_savg){
		this.hous_subc_savg = hous_subc_savg;
	}

	public void setMulty_house_plan_savg(String multy_house_plan_savg){
		this.multy_house_plan_savg = multy_house_plan_savg;
	}

	public void setLtrm_hous_savg(String ltrm_hous_savg){
		this.ltrm_hous_savg = ltrm_hous_savg;
	}

	public void setLabr_hous_savg(String labr_hous_savg){
		this.labr_hous_savg = labr_hous_savg;
	}

	public void setVent_invsm(String vent_invsm){
		this.vent_invsm = vent_invsm;
	}

	public void setCrdt_card_use_amt(String crdt_card_use_amt){
		this.crdt_card_use_amt = crdt_card_use_amt;
	}

	public void setSmallbiz_incm_dduc(String smallbiz_incm_dduc){
		this.smallbiz_incm_dduc = smallbiz_incm_dduc;
	}

	public void setStock_save(String stock_save){
		this.stock_save = stock_save;
	}

	public void setTxn_std_amt(String txn_std_amt){
		this.txn_std_amt = txn_std_amt;
	}

	public void setIncm_dduc_tot_limt_excs_amt(String incm_dduc_tot_limt_excs_amt){
		this.incm_dduc_tot_limt_excs_amt = incm_dduc_tot_limt_excs_amt;
	}

	public void setCalc_incm_tax(String calc_incm_tax){
		this.calc_incm_tax = calc_incm_tax;
	}

	public void setTax_amt_dduc_labr_incm(String tax_amt_dduc_labr_incm){
		this.tax_amt_dduc_labr_incm = tax_amt_dduc_labr_incm;
	}

	public void setTax_amt_dduc_hous_loan_amt_int(String tax_amt_dduc_hous_loan_amt_int){
		this.tax_amt_dduc_hous_loan_amt_int = tax_amt_dduc_hous_loan_amt_int;
	}

	public void setTax_amt_dduc_polt_fund(String tax_amt_dduc_polt_fund){
		this.tax_amt_dduc_polt_fund = tax_amt_dduc_polt_fund;
	}

	public void setTax_amt_dduc_forn_pymt(String tax_amt_dduc_forn_pymt){
		this.tax_amt_dduc_forn_pymt = tax_amt_dduc_forn_pymt;
	}

	public void setTax_amt_dduc_stot(String tax_amt_dduc_stot){
		this.tax_amt_dduc_stot = tax_amt_dduc_stot;
	}

	public void setDeci_incm_tax2(String deci_incm_tax2){
		this.deci_incm_tax2 = deci_incm_tax2;
	}

	public void setLvcmpy_pens_dduc(String lvcmpy_pens_dduc){
		this.lvcmpy_pens_dduc = lvcmpy_pens_dduc;
	}

	public String getDeci_incm_tax(){
		return this.deci_incm_tax;
	}

	public String getDeci_res_tax(){
		return this.deci_res_tax;
	}

	public String getDeci_farm_spc_tax(){
		return this.deci_farm_spc_tax;
	}

	public String getDeci_tax_stot(){
		return this.deci_tax_stot;
	}

	public String getBefo_pymt_incm_tax(){
		return this.befo_pymt_incm_tax;
	}

	public String getBefo_pymt_res_tax(){
		return this.befo_pymt_res_tax;
	}

	public String getBefo_pymt_farm_spc_tax(){
		return this.befo_pymt_farm_spc_tax;
	}

	public String getBefo_pymt_tax_stot(){
		return this.befo_pymt_tax_stot;
	}

	public String getNow_pymt_incm_tax(){
		return this.now_pymt_incm_tax;
	}

	public String getNow_pymt_res_tax(){
		return this.now_pymt_res_tax;
	}

	public String getNow_pymt_farm_spc_tax(){
		return this.now_pymt_farm_spc_tax;
	}

	public String getNow_pymt_tax_stot(){
		return this.now_pymt_tax_stot;
	}

	public String getDedu_incm_tax(){
		return this.dedu_incm_tax;
	}

	public String getDedu_res_tax(){
		return this.dedu_res_tax;
	}

	public String getDedu_farm_spc_tax(){
		return this.dedu_farm_spc_tax;
	}

	public String getDedu_tax_stot(){
		return this.dedu_tax_stot;
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

	public String getFaml_nops(){
		return this.faml_nops;
	}

	public String getBase_dduc_child_oldg(){
		return this.base_dduc_child_oldg;
	}

	public String getRspc_nops(){
		return this.rspc_nops;
	}

	public String getAddm_dduc_rspc(){
		return this.addm_dduc_rspc;
	}

	public String getObcl_pers_nops(){
		return this.obcl_pers_nops;
	}

	public String getAddm_dduc_obcl_pers(){
		return this.addm_dduc_obcl_pers;
	}

	public String getChild_care_fee_nops(){
		return this.child_care_fee_nops;
	}

	public String getAddm_dduc_care_fee(){
		return this.addm_dduc_care_fee;
	}

	public String getAdopt_dduc_nops(){
		return this.adopt_dduc_nops;
	}

	public String getAdopt_dduc(){
		return this.adopt_dduc;
	}

	public String getAddm_dduc_fml_hshd(){
		return this.addm_dduc_fml_hshd;
	}

	public String getAddm_dduc_one_paren(){
		return this.addm_dduc_one_paren;
	}

	public String getMulti_child_nops(){
		return this.multi_child_nops;
	}

	public String getMulti_child_addm_dduc(){
		return this.multi_child_addm_dduc;
	}

	public String getNp_insr_fee_dduc(){
		return this.np_insr_fee_dduc;
	}

	public String getTot_hlth_insr_fee(){
		return this.tot_hlth_insr_fee;
	}

	public String getTot_emp_insr_fee(){
		return this.tot_emp_insr_fee;
	}

	public String getGnr_asrc_prpn_insr_fee(){
		return this.gnr_asrc_prpn_insr_fee;
	}

	public String getObcl_pers_lesd_insr_fee(){
		return this.obcl_pers_lesd_insr_fee;
	}

	public String getSpc_dduc_hosp_fee(){
		return this.spc_dduc_hosp_fee;
	}

	public String getSpc_dduc_edu_fee(){
		return this.spc_dduc_edu_fee;
	}

	public String getSpc_dduc_won_li_amt(){
		return this.spc_dduc_won_li_amt;
	}

	public String getMonthly_rent_amt(){
		return this.monthly_rent_amt;
	}

	public String getSpc_dduc_mogg_loan_amt(){
		return this.spc_dduc_mogg_loan_amt;
	}

	public String getSpc_dduc_dona_amt(){
		return this.spc_dduc_dona_amt;
	}

	public String getSpc_dduc_stot(){
		return this.spc_dduc_stot;
	}

	public String getStd_dduc_amt(){
		return this.std_dduc_amt;
	}

	public String getDedu_labr_incm_amt(){
		return this.dedu_labr_incm_amt;
	}

	public String getTax_rl_dduc_prsn_pens(){
		return this.tax_rl_dduc_prsn_pens;
	}

	public String getPens_savg_incm_dduc(){
		return this.pens_savg_incm_dduc;
	}

	public String getHous_subc_savg(){
		return this.hous_subc_savg;
	}

	public String getMulty_house_plan_savg(){
		return this.multy_house_plan_savg;
	}

	public String getLtrm_hous_savg(){
		return this.ltrm_hous_savg;
	}

	public String getLabr_hous_savg(){
		return this.labr_hous_savg;
	}

	public String getVent_invsm(){
		return this.vent_invsm;
	}

	public String getCrdt_card_use_amt(){
		return this.crdt_card_use_amt;
	}

	public String getSmallbiz_incm_dduc(){
		return this.smallbiz_incm_dduc;
	}

	public String getStock_save(){
		return this.stock_save;
	}

	public String getTxn_std_amt(){
		return this.txn_std_amt;
	}

	public String getIncm_dduc_tot_limt_excs_amt(){
		return this.incm_dduc_tot_limt_excs_amt;
	}

	public String getCalc_incm_tax(){
		return this.calc_incm_tax;
	}

	public String getTax_amt_dduc_labr_incm(){
		return this.tax_amt_dduc_labr_incm;
	}

	public String getTax_amt_dduc_hous_loan_amt_int(){
		return this.tax_amt_dduc_hous_loan_amt_int;
	}

	public String getTax_amt_dduc_polt_fund(){
		return this.tax_amt_dduc_polt_fund;
	}

	public String getTax_amt_dduc_forn_pymt(){
		return this.tax_amt_dduc_forn_pymt;
	}

	public String getTax_amt_dduc_stot(){
		return this.tax_amt_dduc_stot;
	}

	public String getDeci_incm_tax2(){
		return this.deci_incm_tax2;
	}

	public String getLvcmpy_pens_dduc(){
		return this.lvcmpy_pens_dduc;
	}
}

/* 작성시간 : Thu Jan 09 16:02:08 KST 2014 */
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


package chosun.ciis.hd.lvcmpy.rec;

import java.sql.*;
import chosun.ciis.hd.lvcmpy.dm.*;
import chosun.ciis.hd.lvcmpy.ds.*;

/**
 * 
 */


public class HD_LVCMPY_2300_LCURLIST3Record extends java.lang.Object implements java.io.Serializable{

	public String adjm_rvrs_yy;
	public String labr_incm_amt;
	public String base_dduc_slf;
	public String base_dduc_spos;
	public String boks_qunt_faml_nops;
	public String rspc_nops;
	public String addm_dduc_obcl_pers;
	public String addm_dduc_fml_hshd;
	public String addm_dduc_care_fee;
	public String mj1birth_ibyang;
	public String multi_child_addm_dduc;
	public String np_insr_fee_dduc;
	public String temp1;
	public String temp2;
	public String spc_dduc_insr_fee;
	public String spc_dduc_hosp_fee;
	public String spc_dduc_hous_fund;
	public String hous_mogg_loan_amt_int;
	public String spc_dduc_dona_amt;
	public String spc_dduc_wedd_etc;
	public String spc_dduc_stot;
	public String std_dduc_amt;
	public String dedu_labr_incm_amt;
	public String prsn_pens_pymt_amt;
	public String pens_savg_pymt_amt;
	public String plac_cmpy_plac_trad_authr_inc;
	public String hous_fund_pymt_amt;
	public String invsm_cmpd_invsm_amt;
	public String emp_stok_ownr_cmpd_dona_amt_30;
	public String crdt_non_pcc_use;
	public String ltrm_stok_type_savg_incm_dduc;
	public String tax_amt_dduc_labr_incm;
	public String tax_amt_dduc_polt_fund;
	public String temp3;
	public String tax_amt_dduc_hous_loan_amt_int;
	public String tax_amt_dduc_forn_pymt;
	public String tax_amt_dduc_stot;

	public HD_LVCMPY_2300_LCURLIST3Record(){}

	public void setAdjm_rvrs_yy(String adjm_rvrs_yy){
		this.adjm_rvrs_yy = adjm_rvrs_yy;
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

	public void setBoks_qunt_faml_nops(String boks_qunt_faml_nops){
		this.boks_qunt_faml_nops = boks_qunt_faml_nops;
	}

	public void setRspc_nops(String rspc_nops){
		this.rspc_nops = rspc_nops;
	}

	public void setAddm_dduc_obcl_pers(String addm_dduc_obcl_pers){
		this.addm_dduc_obcl_pers = addm_dduc_obcl_pers;
	}

	public void setAddm_dduc_fml_hshd(String addm_dduc_fml_hshd){
		this.addm_dduc_fml_hshd = addm_dduc_fml_hshd;
	}

	public void setAddm_dduc_care_fee(String addm_dduc_care_fee){
		this.addm_dduc_care_fee = addm_dduc_care_fee;
	}

	public void setMj1birth_ibyang(String mj1birth_ibyang){
		this.mj1birth_ibyang = mj1birth_ibyang;
	}

	public void setMulti_child_addm_dduc(String multi_child_addm_dduc){
		this.multi_child_addm_dduc = multi_child_addm_dduc;
	}

	public void setNp_insr_fee_dduc(String np_insr_fee_dduc){
		this.np_insr_fee_dduc = np_insr_fee_dduc;
	}

	public void setTemp1(String temp1){
		this.temp1 = temp1;
	}

	public void setTemp2(String temp2){
		this.temp2 = temp2;
	}

	public void setSpc_dduc_insr_fee(String spc_dduc_insr_fee){
		this.spc_dduc_insr_fee = spc_dduc_insr_fee;
	}

	public void setSpc_dduc_hosp_fee(String spc_dduc_hosp_fee){
		this.spc_dduc_hosp_fee = spc_dduc_hosp_fee;
	}

	public void setSpc_dduc_hous_fund(String spc_dduc_hous_fund){
		this.spc_dduc_hous_fund = spc_dduc_hous_fund;
	}

	public void setHous_mogg_loan_amt_int(String hous_mogg_loan_amt_int){
		this.hous_mogg_loan_amt_int = hous_mogg_loan_amt_int;
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

	public void setDedu_labr_incm_amt(String dedu_labr_incm_amt){
		this.dedu_labr_incm_amt = dedu_labr_incm_amt;
	}

	public void setPrsn_pens_pymt_amt(String prsn_pens_pymt_amt){
		this.prsn_pens_pymt_amt = prsn_pens_pymt_amt;
	}

	public void setPens_savg_pymt_amt(String pens_savg_pymt_amt){
		this.pens_savg_pymt_amt = pens_savg_pymt_amt;
	}

	public void setPlac_cmpy_plac_trad_authr_inc(String plac_cmpy_plac_trad_authr_inc){
		this.plac_cmpy_plac_trad_authr_inc = plac_cmpy_plac_trad_authr_inc;
	}

	public void setHous_fund_pymt_amt(String hous_fund_pymt_amt){
		this.hous_fund_pymt_amt = hous_fund_pymt_amt;
	}

	public void setInvsm_cmpd_invsm_amt(String invsm_cmpd_invsm_amt){
		this.invsm_cmpd_invsm_amt = invsm_cmpd_invsm_amt;
	}

	public void setEmp_stok_ownr_cmpd_dona_amt_30(String emp_stok_ownr_cmpd_dona_amt_30){
		this.emp_stok_ownr_cmpd_dona_amt_30 = emp_stok_ownr_cmpd_dona_amt_30;
	}

	public void setCrdt_non_pcc_use(String crdt_non_pcc_use){
		this.crdt_non_pcc_use = crdt_non_pcc_use;
	}

	public void setLtrm_stok_type_savg_incm_dduc(String ltrm_stok_type_savg_incm_dduc){
		this.ltrm_stok_type_savg_incm_dduc = ltrm_stok_type_savg_incm_dduc;
	}

	public void setTax_amt_dduc_labr_incm(String tax_amt_dduc_labr_incm){
		this.tax_amt_dduc_labr_incm = tax_amt_dduc_labr_incm;
	}

	public void setTax_amt_dduc_polt_fund(String tax_amt_dduc_polt_fund){
		this.tax_amt_dduc_polt_fund = tax_amt_dduc_polt_fund;
	}

	public void setTemp3(String temp3){
		this.temp3 = temp3;
	}

	public void setTax_amt_dduc_hous_loan_amt_int(String tax_amt_dduc_hous_loan_amt_int){
		this.tax_amt_dduc_hous_loan_amt_int = tax_amt_dduc_hous_loan_amt_int;
	}

	public void setTax_amt_dduc_forn_pymt(String tax_amt_dduc_forn_pymt){
		this.tax_amt_dduc_forn_pymt = tax_amt_dduc_forn_pymt;
	}

	public void setTax_amt_dduc_stot(String tax_amt_dduc_stot){
		this.tax_amt_dduc_stot = tax_amt_dduc_stot;
	}

	public String getAdjm_rvrs_yy(){
		return this.adjm_rvrs_yy;
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

	public String getBoks_qunt_faml_nops(){
		return this.boks_qunt_faml_nops;
	}

	public String getRspc_nops(){
		return this.rspc_nops;
	}

	public String getAddm_dduc_obcl_pers(){
		return this.addm_dduc_obcl_pers;
	}

	public String getAddm_dduc_fml_hshd(){
		return this.addm_dduc_fml_hshd;
	}

	public String getAddm_dduc_care_fee(){
		return this.addm_dduc_care_fee;
	}

	public String getMj1birth_ibyang(){
		return this.mj1birth_ibyang;
	}

	public String getMulti_child_addm_dduc(){
		return this.multi_child_addm_dduc;
	}

	public String getNp_insr_fee_dduc(){
		return this.np_insr_fee_dduc;
	}

	public String getTemp1(){
		return this.temp1;
	}

	public String getTemp2(){
		return this.temp2;
	}

	public String getSpc_dduc_insr_fee(){
		return this.spc_dduc_insr_fee;
	}

	public String getSpc_dduc_hosp_fee(){
		return this.spc_dduc_hosp_fee;
	}

	public String getSpc_dduc_hous_fund(){
		return this.spc_dduc_hous_fund;
	}

	public String getHous_mogg_loan_amt_int(){
		return this.hous_mogg_loan_amt_int;
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

	public String getDedu_labr_incm_amt(){
		return this.dedu_labr_incm_amt;
	}

	public String getPrsn_pens_pymt_amt(){
		return this.prsn_pens_pymt_amt;
	}

	public String getPens_savg_pymt_amt(){
		return this.pens_savg_pymt_amt;
	}

	public String getPlac_cmpy_plac_trad_authr_inc(){
		return this.plac_cmpy_plac_trad_authr_inc;
	}

	public String getHous_fund_pymt_amt(){
		return this.hous_fund_pymt_amt;
	}

	public String getInvsm_cmpd_invsm_amt(){
		return this.invsm_cmpd_invsm_amt;
	}

	public String getEmp_stok_ownr_cmpd_dona_amt_30(){
		return this.emp_stok_ownr_cmpd_dona_amt_30;
	}

	public String getCrdt_non_pcc_use(){
		return this.crdt_non_pcc_use;
	}

	public String getLtrm_stok_type_savg_incm_dduc(){
		return this.ltrm_stok_type_savg_incm_dduc;
	}

	public String getTax_amt_dduc_labr_incm(){
		return this.tax_amt_dduc_labr_incm;
	}

	public String getTax_amt_dduc_polt_fund(){
		return this.tax_amt_dduc_polt_fund;
	}

	public String getTemp3(){
		return this.temp3;
	}

	public String getTax_amt_dduc_hous_loan_amt_int(){
		return this.tax_amt_dduc_hous_loan_amt_int;
	}

	public String getTax_amt_dduc_forn_pymt(){
		return this.tax_amt_dduc_forn_pymt;
	}

	public String getTax_amt_dduc_stot(){
		return this.tax_amt_dduc_stot;
	}
}

/* 작성시간 : Tue Aug 18 09:50:50 KST 2009 */
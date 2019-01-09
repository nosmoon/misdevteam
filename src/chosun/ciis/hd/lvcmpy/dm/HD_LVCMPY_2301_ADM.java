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


package chosun.ciis.hd.lvcmpy.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.lvcmpy.ds.*;
import chosun.ciis.hd.lvcmpy.rec.*;

/**
 * 
 */


public class HD_LVCMPY_2301_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String emp_no;
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
	public String spc_dduc_insr_fee;
	public String spc_dduc_hosp_fee;
	public String spc_dduc_hous_fund;
	public String spc_dduc_dona_amt;
	public String spc_dduc_wedd_etc;
	public String spc_dduc_stot;
	public String std_dduc_amt;
	public String dedu_labr_incm_amt;
	public String tax_amt_dduc_labr_incm;
	public String tax_amt_dduc_polt_fund;
	public String tax_amt_dduc_hous_loan_amt;
	public String tax_amt_dduc_forn_pymt;
	public String tax_amt_dduc_stot;
	public String hous_mogg_loan_amt_int;
	public String prsn_pens_pymt_amt;
	public String pens_savg_pymt_amt;
	public String plac_cmpy_plac_trad_authr;
	public String hous_fund_pymt_amt;
	public String invsm_cmpd_invsm_amt;
	public String emp_stok_ownr_cmpd_dona_amt;
	public String crdt_non_pcc_use;
	public String ltrm_stok_type_savg_incm;
	public String non_tax_frnc_01;
	public String non_tax_jrnst_01;
	public String non_tax_frnc_02;
	public String non_tax_jrnst_02;
	public String non_tax_frnc_03;
	public String non_tax_jrnst_03;
	public String non_tax_frnc_04;
	public String non_tax_jrnst_04;
	public String non_tax_frnc_05;
	public String non_tax_jrnst_05;
	public String non_tax_frnc_06;
	public String non_tax_jrnst_06;
	public String non_tax_frnc_07;
	public String non_tax_jrnst_07;
	public String non_tax_frnc_08;
	public String non_tax_jrnst_08;
	public String non_tax_frnc_09;
	public String non_tax_jrnst_09;
	public String non_tax_frnc_10;
	public String non_tax_jrnst_10;
	public String non_tax_frnc_11;
	public String non_tax_jrnst_11;
	public String non_tax_frnc_12;
	public String non_tax_jrnst_12;
	public String incmg_pers_ipadd;
	public String incmg_pers;

	public HD_LVCMPY_2301_ADM(){}
	public HD_LVCMPY_2301_ADM(String cmpy_cd, String emp_no, String adjm_rvrs_yy, String labr_incm_amt, String base_dduc_slf, String base_dduc_spos, String boks_qunt_faml_nops, String rspc_nops, String addm_dduc_obcl_pers, String addm_dduc_fml_hshd, String addm_dduc_care_fee, String mj1birth_ibyang, String multi_child_addm_dduc, String np_insr_fee_dduc, String spc_dduc_insr_fee, String spc_dduc_hosp_fee, String spc_dduc_hous_fund, String spc_dduc_dona_amt, String spc_dduc_wedd_etc, String spc_dduc_stot, String std_dduc_amt, String dedu_labr_incm_amt, String tax_amt_dduc_labr_incm, String tax_amt_dduc_polt_fund, String tax_amt_dduc_hous_loan_amt, String tax_amt_dduc_forn_pymt, String tax_amt_dduc_stot, String hous_mogg_loan_amt_int, String prsn_pens_pymt_amt, String pens_savg_pymt_amt, String plac_cmpy_plac_trad_authr, String hous_fund_pymt_amt, String invsm_cmpd_invsm_amt, String emp_stok_ownr_cmpd_dona_amt, String crdt_non_pcc_use, String ltrm_stok_type_savg_incm, String non_tax_frnc_01, String non_tax_jrnst_01, String non_tax_frnc_02, String non_tax_jrnst_02, String non_tax_frnc_03, String non_tax_jrnst_03, String non_tax_frnc_04, String non_tax_jrnst_04, String non_tax_frnc_05, String non_tax_jrnst_05, String non_tax_frnc_06, String non_tax_jrnst_06, String non_tax_frnc_07, String non_tax_jrnst_07, String non_tax_frnc_08, String non_tax_jrnst_08, String non_tax_frnc_09, String non_tax_jrnst_09, String non_tax_frnc_10, String non_tax_jrnst_10, String non_tax_frnc_11, String non_tax_jrnst_11, String non_tax_frnc_12, String non_tax_jrnst_12, String incmg_pers_ipadd, String incmg_pers){
		this.cmpy_cd = cmpy_cd;
		this.emp_no = emp_no;
		this.adjm_rvrs_yy = adjm_rvrs_yy;
		this.labr_incm_amt = labr_incm_amt;
		this.base_dduc_slf = base_dduc_slf;
		this.base_dduc_spos = base_dduc_spos;
		this.boks_qunt_faml_nops = boks_qunt_faml_nops;
		this.rspc_nops = rspc_nops;
		this.addm_dduc_obcl_pers = addm_dduc_obcl_pers;
		this.addm_dduc_fml_hshd = addm_dduc_fml_hshd;
		this.addm_dduc_care_fee = addm_dduc_care_fee;
		this.mj1birth_ibyang = mj1birth_ibyang;
		this.multi_child_addm_dduc = multi_child_addm_dduc;
		this.np_insr_fee_dduc = np_insr_fee_dduc;
		this.spc_dduc_insr_fee = spc_dduc_insr_fee;
		this.spc_dduc_hosp_fee = spc_dduc_hosp_fee;
		this.spc_dduc_hous_fund = spc_dduc_hous_fund;
		this.spc_dduc_dona_amt = spc_dduc_dona_amt;
		this.spc_dduc_wedd_etc = spc_dduc_wedd_etc;
		this.spc_dduc_stot = spc_dduc_stot;
		this.std_dduc_amt = std_dduc_amt;
		this.dedu_labr_incm_amt = dedu_labr_incm_amt;
		this.tax_amt_dduc_labr_incm = tax_amt_dduc_labr_incm;
		this.tax_amt_dduc_polt_fund = tax_amt_dduc_polt_fund;
		this.tax_amt_dduc_hous_loan_amt = tax_amt_dduc_hous_loan_amt;
		this.tax_amt_dduc_forn_pymt = tax_amt_dduc_forn_pymt;
		this.tax_amt_dduc_stot = tax_amt_dduc_stot;
		this.hous_mogg_loan_amt_int = hous_mogg_loan_amt_int;
		this.prsn_pens_pymt_amt = prsn_pens_pymt_amt;
		this.pens_savg_pymt_amt = pens_savg_pymt_amt;
		this.plac_cmpy_plac_trad_authr = plac_cmpy_plac_trad_authr;
		this.hous_fund_pymt_amt = hous_fund_pymt_amt;
		this.invsm_cmpd_invsm_amt = invsm_cmpd_invsm_amt;
		this.emp_stok_ownr_cmpd_dona_amt = emp_stok_ownr_cmpd_dona_amt;
		this.crdt_non_pcc_use = crdt_non_pcc_use;
		this.ltrm_stok_type_savg_incm = ltrm_stok_type_savg_incm;
		this.non_tax_frnc_01 = non_tax_frnc_01;
		this.non_tax_jrnst_01 = non_tax_jrnst_01;
		this.non_tax_frnc_02 = non_tax_frnc_02;
		this.non_tax_jrnst_02 = non_tax_jrnst_02;
		this.non_tax_frnc_03 = non_tax_frnc_03;
		this.non_tax_jrnst_03 = non_tax_jrnst_03;
		this.non_tax_frnc_04 = non_tax_frnc_04;
		this.non_tax_jrnst_04 = non_tax_jrnst_04;
		this.non_tax_frnc_05 = non_tax_frnc_05;
		this.non_tax_jrnst_05 = non_tax_jrnst_05;
		this.non_tax_frnc_06 = non_tax_frnc_06;
		this.non_tax_jrnst_06 = non_tax_jrnst_06;
		this.non_tax_frnc_07 = non_tax_frnc_07;
		this.non_tax_jrnst_07 = non_tax_jrnst_07;
		this.non_tax_frnc_08 = non_tax_frnc_08;
		this.non_tax_jrnst_08 = non_tax_jrnst_08;
		this.non_tax_frnc_09 = non_tax_frnc_09;
		this.non_tax_jrnst_09 = non_tax_jrnst_09;
		this.non_tax_frnc_10 = non_tax_frnc_10;
		this.non_tax_jrnst_10 = non_tax_jrnst_10;
		this.non_tax_frnc_11 = non_tax_frnc_11;
		this.non_tax_jrnst_11 = non_tax_jrnst_11;
		this.non_tax_frnc_12 = non_tax_frnc_12;
		this.non_tax_jrnst_12 = non_tax_jrnst_12;
		this.incmg_pers_ipadd = incmg_pers_ipadd;
		this.incmg_pers = incmg_pers;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

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

	public void setSpc_dduc_insr_fee(String spc_dduc_insr_fee){
		this.spc_dduc_insr_fee = spc_dduc_insr_fee;
	}

	public void setSpc_dduc_hosp_fee(String spc_dduc_hosp_fee){
		this.spc_dduc_hosp_fee = spc_dduc_hosp_fee;
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

	public void setDedu_labr_incm_amt(String dedu_labr_incm_amt){
		this.dedu_labr_incm_amt = dedu_labr_incm_amt;
	}

	public void setTax_amt_dduc_labr_incm(String tax_amt_dduc_labr_incm){
		this.tax_amt_dduc_labr_incm = tax_amt_dduc_labr_incm;
	}

	public void setTax_amt_dduc_polt_fund(String tax_amt_dduc_polt_fund){
		this.tax_amt_dduc_polt_fund = tax_amt_dduc_polt_fund;
	}

	public void setTax_amt_dduc_hous_loan_amt(String tax_amt_dduc_hous_loan_amt){
		this.tax_amt_dduc_hous_loan_amt = tax_amt_dduc_hous_loan_amt;
	}

	public void setTax_amt_dduc_forn_pymt(String tax_amt_dduc_forn_pymt){
		this.tax_amt_dduc_forn_pymt = tax_amt_dduc_forn_pymt;
	}

	public void setTax_amt_dduc_stot(String tax_amt_dduc_stot){
		this.tax_amt_dduc_stot = tax_amt_dduc_stot;
	}

	public void setHous_mogg_loan_amt_int(String hous_mogg_loan_amt_int){
		this.hous_mogg_loan_amt_int = hous_mogg_loan_amt_int;
	}

	public void setPrsn_pens_pymt_amt(String prsn_pens_pymt_amt){
		this.prsn_pens_pymt_amt = prsn_pens_pymt_amt;
	}

	public void setPens_savg_pymt_amt(String pens_savg_pymt_amt){
		this.pens_savg_pymt_amt = pens_savg_pymt_amt;
	}

	public void setPlac_cmpy_plac_trad_authr(String plac_cmpy_plac_trad_authr){
		this.plac_cmpy_plac_trad_authr = plac_cmpy_plac_trad_authr;
	}

	public void setHous_fund_pymt_amt(String hous_fund_pymt_amt){
		this.hous_fund_pymt_amt = hous_fund_pymt_amt;
	}

	public void setInvsm_cmpd_invsm_amt(String invsm_cmpd_invsm_amt){
		this.invsm_cmpd_invsm_amt = invsm_cmpd_invsm_amt;
	}

	public void setEmp_stok_ownr_cmpd_dona_amt(String emp_stok_ownr_cmpd_dona_amt){
		this.emp_stok_ownr_cmpd_dona_amt = emp_stok_ownr_cmpd_dona_amt;
	}

	public void setCrdt_non_pcc_use(String crdt_non_pcc_use){
		this.crdt_non_pcc_use = crdt_non_pcc_use;
	}

	public void setLtrm_stok_type_savg_incm(String ltrm_stok_type_savg_incm){
		this.ltrm_stok_type_savg_incm = ltrm_stok_type_savg_incm;
	}

	public void setNon_tax_frnc_01(String non_tax_frnc_01){
		this.non_tax_frnc_01 = non_tax_frnc_01;
	}

	public void setNon_tax_jrnst_01(String non_tax_jrnst_01){
		this.non_tax_jrnst_01 = non_tax_jrnst_01;
	}

	public void setNon_tax_frnc_02(String non_tax_frnc_02){
		this.non_tax_frnc_02 = non_tax_frnc_02;
	}

	public void setNon_tax_jrnst_02(String non_tax_jrnst_02){
		this.non_tax_jrnst_02 = non_tax_jrnst_02;
	}

	public void setNon_tax_frnc_03(String non_tax_frnc_03){
		this.non_tax_frnc_03 = non_tax_frnc_03;
	}

	public void setNon_tax_jrnst_03(String non_tax_jrnst_03){
		this.non_tax_jrnst_03 = non_tax_jrnst_03;
	}

	public void setNon_tax_frnc_04(String non_tax_frnc_04){
		this.non_tax_frnc_04 = non_tax_frnc_04;
	}

	public void setNon_tax_jrnst_04(String non_tax_jrnst_04){
		this.non_tax_jrnst_04 = non_tax_jrnst_04;
	}

	public void setNon_tax_frnc_05(String non_tax_frnc_05){
		this.non_tax_frnc_05 = non_tax_frnc_05;
	}

	public void setNon_tax_jrnst_05(String non_tax_jrnst_05){
		this.non_tax_jrnst_05 = non_tax_jrnst_05;
	}

	public void setNon_tax_frnc_06(String non_tax_frnc_06){
		this.non_tax_frnc_06 = non_tax_frnc_06;
	}

	public void setNon_tax_jrnst_06(String non_tax_jrnst_06){
		this.non_tax_jrnst_06 = non_tax_jrnst_06;
	}

	public void setNon_tax_frnc_07(String non_tax_frnc_07){
		this.non_tax_frnc_07 = non_tax_frnc_07;
	}

	public void setNon_tax_jrnst_07(String non_tax_jrnst_07){
		this.non_tax_jrnst_07 = non_tax_jrnst_07;
	}

	public void setNon_tax_frnc_08(String non_tax_frnc_08){
		this.non_tax_frnc_08 = non_tax_frnc_08;
	}

	public void setNon_tax_jrnst_08(String non_tax_jrnst_08){
		this.non_tax_jrnst_08 = non_tax_jrnst_08;
	}

	public void setNon_tax_frnc_09(String non_tax_frnc_09){
		this.non_tax_frnc_09 = non_tax_frnc_09;
	}

	public void setNon_tax_jrnst_09(String non_tax_jrnst_09){
		this.non_tax_jrnst_09 = non_tax_jrnst_09;
	}

	public void setNon_tax_frnc_10(String non_tax_frnc_10){
		this.non_tax_frnc_10 = non_tax_frnc_10;
	}

	public void setNon_tax_jrnst_10(String non_tax_jrnst_10){
		this.non_tax_jrnst_10 = non_tax_jrnst_10;
	}

	public void setNon_tax_frnc_11(String non_tax_frnc_11){
		this.non_tax_frnc_11 = non_tax_frnc_11;
	}

	public void setNon_tax_jrnst_11(String non_tax_jrnst_11){
		this.non_tax_jrnst_11 = non_tax_jrnst_11;
	}

	public void setNon_tax_frnc_12(String non_tax_frnc_12){
		this.non_tax_frnc_12 = non_tax_frnc_12;
	}

	public void setNon_tax_jrnst_12(String non_tax_jrnst_12){
		this.non_tax_jrnst_12 = non_tax_jrnst_12;
	}

	public void setIncmg_pers_ipadd(String incmg_pers_ipadd){
		this.incmg_pers_ipadd = incmg_pers_ipadd;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getEmp_no(){
		return this.emp_no;
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

	public String getSpc_dduc_insr_fee(){
		return this.spc_dduc_insr_fee;
	}

	public String getSpc_dduc_hosp_fee(){
		return this.spc_dduc_hosp_fee;
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

	public String getDedu_labr_incm_amt(){
		return this.dedu_labr_incm_amt;
	}

	public String getTax_amt_dduc_labr_incm(){
		return this.tax_amt_dduc_labr_incm;
	}

	public String getTax_amt_dduc_polt_fund(){
		return this.tax_amt_dduc_polt_fund;
	}

	public String getTax_amt_dduc_hous_loan_amt(){
		return this.tax_amt_dduc_hous_loan_amt;
	}

	public String getTax_amt_dduc_forn_pymt(){
		return this.tax_amt_dduc_forn_pymt;
	}

	public String getTax_amt_dduc_stot(){
		return this.tax_amt_dduc_stot;
	}

	public String getHous_mogg_loan_amt_int(){
		return this.hous_mogg_loan_amt_int;
	}

	public String getPrsn_pens_pymt_amt(){
		return this.prsn_pens_pymt_amt;
	}

	public String getPens_savg_pymt_amt(){
		return this.pens_savg_pymt_amt;
	}

	public String getPlac_cmpy_plac_trad_authr(){
		return this.plac_cmpy_plac_trad_authr;
	}

	public String getHous_fund_pymt_amt(){
		return this.hous_fund_pymt_amt;
	}

	public String getInvsm_cmpd_invsm_amt(){
		return this.invsm_cmpd_invsm_amt;
	}

	public String getEmp_stok_ownr_cmpd_dona_amt(){
		return this.emp_stok_ownr_cmpd_dona_amt;
	}

	public String getCrdt_non_pcc_use(){
		return this.crdt_non_pcc_use;
	}

	public String getLtrm_stok_type_savg_incm(){
		return this.ltrm_stok_type_savg_incm;
	}

	public String getNon_tax_frnc_01(){
		return this.non_tax_frnc_01;
	}

	public String getNon_tax_jrnst_01(){
		return this.non_tax_jrnst_01;
	}

	public String getNon_tax_frnc_02(){
		return this.non_tax_frnc_02;
	}

	public String getNon_tax_jrnst_02(){
		return this.non_tax_jrnst_02;
	}

	public String getNon_tax_frnc_03(){
		return this.non_tax_frnc_03;
	}

	public String getNon_tax_jrnst_03(){
		return this.non_tax_jrnst_03;
	}

	public String getNon_tax_frnc_04(){
		return this.non_tax_frnc_04;
	}

	public String getNon_tax_jrnst_04(){
		return this.non_tax_jrnst_04;
	}

	public String getNon_tax_frnc_05(){
		return this.non_tax_frnc_05;
	}

	public String getNon_tax_jrnst_05(){
		return this.non_tax_jrnst_05;
	}

	public String getNon_tax_frnc_06(){
		return this.non_tax_frnc_06;
	}

	public String getNon_tax_jrnst_06(){
		return this.non_tax_jrnst_06;
	}

	public String getNon_tax_frnc_07(){
		return this.non_tax_frnc_07;
	}

	public String getNon_tax_jrnst_07(){
		return this.non_tax_jrnst_07;
	}

	public String getNon_tax_frnc_08(){
		return this.non_tax_frnc_08;
	}

	public String getNon_tax_jrnst_08(){
		return this.non_tax_jrnst_08;
	}

	public String getNon_tax_frnc_09(){
		return this.non_tax_frnc_09;
	}

	public String getNon_tax_jrnst_09(){
		return this.non_tax_jrnst_09;
	}

	public String getNon_tax_frnc_10(){
		return this.non_tax_frnc_10;
	}

	public String getNon_tax_jrnst_10(){
		return this.non_tax_jrnst_10;
	}

	public String getNon_tax_frnc_11(){
		return this.non_tax_frnc_11;
	}

	public String getNon_tax_jrnst_11(){
		return this.non_tax_jrnst_11;
	}

	public String getNon_tax_frnc_12(){
		return this.non_tax_frnc_12;
	}

	public String getNon_tax_jrnst_12(){
		return this.non_tax_jrnst_12;
	}

	public String getIncmg_pers_ipadd(){
		return this.incmg_pers_ipadd;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_LVCMPY_2301_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_LVCMPY_2301_ADM dm = (HD_LVCMPY_2301_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.emp_no);
		cstmt.setString(5, dm.adjm_rvrs_yy);
		cstmt.setString(6, dm.labr_incm_amt);
		cstmt.setString(7, dm.base_dduc_slf);
		cstmt.setString(8, dm.base_dduc_spos);
		cstmt.setString(9, dm.boks_qunt_faml_nops);
		cstmt.setString(10, dm.rspc_nops);
		cstmt.setString(11, dm.addm_dduc_obcl_pers);
		cstmt.setString(12, dm.addm_dduc_fml_hshd);
		cstmt.setString(13, dm.addm_dduc_care_fee);
		cstmt.setString(14, dm.mj1birth_ibyang);
		cstmt.setString(15, dm.multi_child_addm_dduc);
		cstmt.setString(16, dm.np_insr_fee_dduc);
		cstmt.setString(17, dm.spc_dduc_insr_fee);
		cstmt.setString(18, dm.spc_dduc_hosp_fee);
		cstmt.setString(19, dm.spc_dduc_hous_fund);
		cstmt.setString(20, dm.spc_dduc_dona_amt);
		cstmt.setString(21, dm.spc_dduc_wedd_etc);
		cstmt.setString(22, dm.spc_dduc_stot);
		cstmt.setString(23, dm.std_dduc_amt);
		cstmt.setString(24, dm.dedu_labr_incm_amt);
		cstmt.setString(25, dm.tax_amt_dduc_labr_incm);
		cstmt.setString(26, dm.tax_amt_dduc_polt_fund);
		cstmt.setString(27, dm.tax_amt_dduc_hous_loan_amt);
		cstmt.setString(28, dm.tax_amt_dduc_forn_pymt);
		cstmt.setString(29, dm.tax_amt_dduc_stot);
		cstmt.setString(30, dm.hous_mogg_loan_amt_int);
		cstmt.setString(31, dm.prsn_pens_pymt_amt);
		cstmt.setString(32, dm.pens_savg_pymt_amt);
		cstmt.setString(33, dm.plac_cmpy_plac_trad_authr);
		cstmt.setString(34, dm.hous_fund_pymt_amt);
		cstmt.setString(35, dm.invsm_cmpd_invsm_amt);
		cstmt.setString(36, dm.emp_stok_ownr_cmpd_dona_amt);
		cstmt.setString(37, dm.crdt_non_pcc_use);
		cstmt.setString(38, dm.ltrm_stok_type_savg_incm);
		cstmt.setString(39, dm.non_tax_frnc_01);
		cstmt.setString(40, dm.non_tax_jrnst_01);
		cstmt.setString(41, dm.non_tax_frnc_02);
		cstmt.setString(42, dm.non_tax_jrnst_02);
		cstmt.setString(43, dm.non_tax_frnc_03);
		cstmt.setString(44, dm.non_tax_jrnst_03);
		cstmt.setString(45, dm.non_tax_frnc_04);
		cstmt.setString(46, dm.non_tax_jrnst_04);
		cstmt.setString(47, dm.non_tax_frnc_05);
		cstmt.setString(48, dm.non_tax_jrnst_05);
		cstmt.setString(49, dm.non_tax_frnc_06);
		cstmt.setString(50, dm.non_tax_jrnst_06);
		cstmt.setString(51, dm.non_tax_frnc_07);
		cstmt.setString(52, dm.non_tax_jrnst_07);
		cstmt.setString(53, dm.non_tax_frnc_08);
		cstmt.setString(54, dm.non_tax_jrnst_08);
		cstmt.setString(55, dm.non_tax_frnc_09);
		cstmt.setString(56, dm.non_tax_jrnst_09);
		cstmt.setString(57, dm.non_tax_frnc_10);
		cstmt.setString(58, dm.non_tax_jrnst_10);
		cstmt.setString(59, dm.non_tax_frnc_11);
		cstmt.setString(60, dm.non_tax_jrnst_11);
		cstmt.setString(61, dm.non_tax_frnc_12);
		cstmt.setString(62, dm.non_tax_jrnst_12);
		cstmt.setString(63, dm.incmg_pers_ipadd);
		cstmt.setString(64, dm.incmg_pers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.lvcmpy.ds.HD_LVCMPY_2301_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("emp_no = [" + getEmp_no() + "]");
		System.out.println("adjm_rvrs_yy = [" + getAdjm_rvrs_yy() + "]");
		System.out.println("labr_incm_amt = [" + getLabr_incm_amt() + "]");
		System.out.println("base_dduc_slf = [" + getBase_dduc_slf() + "]");
		System.out.println("base_dduc_spos = [" + getBase_dduc_spos() + "]");
		System.out.println("boks_qunt_faml_nops = [" + getBoks_qunt_faml_nops() + "]");
		System.out.println("rspc_nops = [" + getRspc_nops() + "]");
		System.out.println("addm_dduc_obcl_pers = [" + getAddm_dduc_obcl_pers() + "]");
		System.out.println("addm_dduc_fml_hshd = [" + getAddm_dduc_fml_hshd() + "]");
		System.out.println("addm_dduc_care_fee = [" + getAddm_dduc_care_fee() + "]");
		System.out.println("mj1birth_ibyang = [" + getMj1birth_ibyang() + "]");
		System.out.println("multi_child_addm_dduc = [" + getMulti_child_addm_dduc() + "]");
		System.out.println("np_insr_fee_dduc = [" + getNp_insr_fee_dduc() + "]");
		System.out.println("spc_dduc_insr_fee = [" + getSpc_dduc_insr_fee() + "]");
		System.out.println("spc_dduc_hosp_fee = [" + getSpc_dduc_hosp_fee() + "]");
		System.out.println("spc_dduc_hous_fund = [" + getSpc_dduc_hous_fund() + "]");
		System.out.println("spc_dduc_dona_amt = [" + getSpc_dduc_dona_amt() + "]");
		System.out.println("spc_dduc_wedd_etc = [" + getSpc_dduc_wedd_etc() + "]");
		System.out.println("spc_dduc_stot = [" + getSpc_dduc_stot() + "]");
		System.out.println("std_dduc_amt = [" + getStd_dduc_amt() + "]");
		System.out.println("dedu_labr_incm_amt = [" + getDedu_labr_incm_amt() + "]");
		System.out.println("tax_amt_dduc_labr_incm = [" + getTax_amt_dduc_labr_incm() + "]");
		System.out.println("tax_amt_dduc_polt_fund = [" + getTax_amt_dduc_polt_fund() + "]");
		System.out.println("tax_amt_dduc_hous_loan_amt = [" + getTax_amt_dduc_hous_loan_amt() + "]");
		System.out.println("tax_amt_dduc_forn_pymt = [" + getTax_amt_dduc_forn_pymt() + "]");
		System.out.println("tax_amt_dduc_stot = [" + getTax_amt_dduc_stot() + "]");
		System.out.println("hous_mogg_loan_amt_int = [" + getHous_mogg_loan_amt_int() + "]");
		System.out.println("prsn_pens_pymt_amt = [" + getPrsn_pens_pymt_amt() + "]");
		System.out.println("pens_savg_pymt_amt = [" + getPens_savg_pymt_amt() + "]");
		System.out.println("plac_cmpy_plac_trad_authr = [" + getPlac_cmpy_plac_trad_authr() + "]");
		System.out.println("hous_fund_pymt_amt = [" + getHous_fund_pymt_amt() + "]");
		System.out.println("invsm_cmpd_invsm_amt = [" + getInvsm_cmpd_invsm_amt() + "]");
		System.out.println("emp_stok_ownr_cmpd_dona_amt = [" + getEmp_stok_ownr_cmpd_dona_amt() + "]");
		System.out.println("crdt_non_pcc_use = [" + getCrdt_non_pcc_use() + "]");
		System.out.println("ltrm_stok_type_savg_incm = [" + getLtrm_stok_type_savg_incm() + "]");
		System.out.println("non_tax_frnc_01 = [" + getNon_tax_frnc_01() + "]");
		System.out.println("non_tax_jrnst_01 = [" + getNon_tax_jrnst_01() + "]");
		System.out.println("non_tax_frnc_02 = [" + getNon_tax_frnc_02() + "]");
		System.out.println("non_tax_jrnst_02 = [" + getNon_tax_jrnst_02() + "]");
		System.out.println("non_tax_frnc_03 = [" + getNon_tax_frnc_03() + "]");
		System.out.println("non_tax_jrnst_03 = [" + getNon_tax_jrnst_03() + "]");
		System.out.println("non_tax_frnc_04 = [" + getNon_tax_frnc_04() + "]");
		System.out.println("non_tax_jrnst_04 = [" + getNon_tax_jrnst_04() + "]");
		System.out.println("non_tax_frnc_05 = [" + getNon_tax_frnc_05() + "]");
		System.out.println("non_tax_jrnst_05 = [" + getNon_tax_jrnst_05() + "]");
		System.out.println("non_tax_frnc_06 = [" + getNon_tax_frnc_06() + "]");
		System.out.println("non_tax_jrnst_06 = [" + getNon_tax_jrnst_06() + "]");
		System.out.println("non_tax_frnc_07 = [" + getNon_tax_frnc_07() + "]");
		System.out.println("non_tax_jrnst_07 = [" + getNon_tax_jrnst_07() + "]");
		System.out.println("non_tax_frnc_08 = [" + getNon_tax_frnc_08() + "]");
		System.out.println("non_tax_jrnst_08 = [" + getNon_tax_jrnst_08() + "]");
		System.out.println("non_tax_frnc_09 = [" + getNon_tax_frnc_09() + "]");
		System.out.println("non_tax_jrnst_09 = [" + getNon_tax_jrnst_09() + "]");
		System.out.println("non_tax_frnc_10 = [" + getNon_tax_frnc_10() + "]");
		System.out.println("non_tax_jrnst_10 = [" + getNon_tax_jrnst_10() + "]");
		System.out.println("non_tax_frnc_11 = [" + getNon_tax_frnc_11() + "]");
		System.out.println("non_tax_jrnst_11 = [" + getNon_tax_jrnst_11() + "]");
		System.out.println("non_tax_frnc_12 = [" + getNon_tax_frnc_12() + "]");
		System.out.println("non_tax_jrnst_12 = [" + getNon_tax_jrnst_12() + "]");
		System.out.println("incmg_pers_ipadd = [" + getIncmg_pers_ipadd() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
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
String emp_no = req.getParameter("emp_no");
if( emp_no == null){
	System.out.println(this.toString+" : emp_no is null" );
}else{
	System.out.println(this.toString+" : emp_no is "+emp_no );
}
String adjm_rvrs_yy = req.getParameter("adjm_rvrs_yy");
if( adjm_rvrs_yy == null){
	System.out.println(this.toString+" : adjm_rvrs_yy is null" );
}else{
	System.out.println(this.toString+" : adjm_rvrs_yy is "+adjm_rvrs_yy );
}
String labr_incm_amt = req.getParameter("labr_incm_amt");
if( labr_incm_amt == null){
	System.out.println(this.toString+" : labr_incm_amt is null" );
}else{
	System.out.println(this.toString+" : labr_incm_amt is "+labr_incm_amt );
}
String base_dduc_slf = req.getParameter("base_dduc_slf");
if( base_dduc_slf == null){
	System.out.println(this.toString+" : base_dduc_slf is null" );
}else{
	System.out.println(this.toString+" : base_dduc_slf is "+base_dduc_slf );
}
String base_dduc_spos = req.getParameter("base_dduc_spos");
if( base_dduc_spos == null){
	System.out.println(this.toString+" : base_dduc_spos is null" );
}else{
	System.out.println(this.toString+" : base_dduc_spos is "+base_dduc_spos );
}
String boks_qunt_faml_nops = req.getParameter("boks_qunt_faml_nops");
if( boks_qunt_faml_nops == null){
	System.out.println(this.toString+" : boks_qunt_faml_nops is null" );
}else{
	System.out.println(this.toString+" : boks_qunt_faml_nops is "+boks_qunt_faml_nops );
}
String rspc_nops = req.getParameter("rspc_nops");
if( rspc_nops == null){
	System.out.println(this.toString+" : rspc_nops is null" );
}else{
	System.out.println(this.toString+" : rspc_nops is "+rspc_nops );
}
String addm_dduc_obcl_pers = req.getParameter("addm_dduc_obcl_pers");
if( addm_dduc_obcl_pers == null){
	System.out.println(this.toString+" : addm_dduc_obcl_pers is null" );
}else{
	System.out.println(this.toString+" : addm_dduc_obcl_pers is "+addm_dduc_obcl_pers );
}
String addm_dduc_fml_hshd = req.getParameter("addm_dduc_fml_hshd");
if( addm_dduc_fml_hshd == null){
	System.out.println(this.toString+" : addm_dduc_fml_hshd is null" );
}else{
	System.out.println(this.toString+" : addm_dduc_fml_hshd is "+addm_dduc_fml_hshd );
}
String addm_dduc_care_fee = req.getParameter("addm_dduc_care_fee");
if( addm_dduc_care_fee == null){
	System.out.println(this.toString+" : addm_dduc_care_fee is null" );
}else{
	System.out.println(this.toString+" : addm_dduc_care_fee is "+addm_dduc_care_fee );
}
String mj1birth_ibyang = req.getParameter("mj1birth_ibyang");
if( mj1birth_ibyang == null){
	System.out.println(this.toString+" : mj1birth_ibyang is null" );
}else{
	System.out.println(this.toString+" : mj1birth_ibyang is "+mj1birth_ibyang );
}
String multi_child_addm_dduc = req.getParameter("multi_child_addm_dduc");
if( multi_child_addm_dduc == null){
	System.out.println(this.toString+" : multi_child_addm_dduc is null" );
}else{
	System.out.println(this.toString+" : multi_child_addm_dduc is "+multi_child_addm_dduc );
}
String np_insr_fee_dduc = req.getParameter("np_insr_fee_dduc");
if( np_insr_fee_dduc == null){
	System.out.println(this.toString+" : np_insr_fee_dduc is null" );
}else{
	System.out.println(this.toString+" : np_insr_fee_dduc is "+np_insr_fee_dduc );
}
String spc_dduc_insr_fee = req.getParameter("spc_dduc_insr_fee");
if( spc_dduc_insr_fee == null){
	System.out.println(this.toString+" : spc_dduc_insr_fee is null" );
}else{
	System.out.println(this.toString+" : spc_dduc_insr_fee is "+spc_dduc_insr_fee );
}
String spc_dduc_hosp_fee = req.getParameter("spc_dduc_hosp_fee");
if( spc_dduc_hosp_fee == null){
	System.out.println(this.toString+" : spc_dduc_hosp_fee is null" );
}else{
	System.out.println(this.toString+" : spc_dduc_hosp_fee is "+spc_dduc_hosp_fee );
}
String spc_dduc_hous_fund = req.getParameter("spc_dduc_hous_fund");
if( spc_dduc_hous_fund == null){
	System.out.println(this.toString+" : spc_dduc_hous_fund is null" );
}else{
	System.out.println(this.toString+" : spc_dduc_hous_fund is "+spc_dduc_hous_fund );
}
String spc_dduc_dona_amt = req.getParameter("spc_dduc_dona_amt");
if( spc_dduc_dona_amt == null){
	System.out.println(this.toString+" : spc_dduc_dona_amt is null" );
}else{
	System.out.println(this.toString+" : spc_dduc_dona_amt is "+spc_dduc_dona_amt );
}
String spc_dduc_wedd_etc = req.getParameter("spc_dduc_wedd_etc");
if( spc_dduc_wedd_etc == null){
	System.out.println(this.toString+" : spc_dduc_wedd_etc is null" );
}else{
	System.out.println(this.toString+" : spc_dduc_wedd_etc is "+spc_dduc_wedd_etc );
}
String spc_dduc_stot = req.getParameter("spc_dduc_stot");
if( spc_dduc_stot == null){
	System.out.println(this.toString+" : spc_dduc_stot is null" );
}else{
	System.out.println(this.toString+" : spc_dduc_stot is "+spc_dduc_stot );
}
String std_dduc_amt = req.getParameter("std_dduc_amt");
if( std_dduc_amt == null){
	System.out.println(this.toString+" : std_dduc_amt is null" );
}else{
	System.out.println(this.toString+" : std_dduc_amt is "+std_dduc_amt );
}
String dedu_labr_incm_amt = req.getParameter("dedu_labr_incm_amt");
if( dedu_labr_incm_amt == null){
	System.out.println(this.toString+" : dedu_labr_incm_amt is null" );
}else{
	System.out.println(this.toString+" : dedu_labr_incm_amt is "+dedu_labr_incm_amt );
}
String tax_amt_dduc_labr_incm = req.getParameter("tax_amt_dduc_labr_incm");
if( tax_amt_dduc_labr_incm == null){
	System.out.println(this.toString+" : tax_amt_dduc_labr_incm is null" );
}else{
	System.out.println(this.toString+" : tax_amt_dduc_labr_incm is "+tax_amt_dduc_labr_incm );
}
String tax_amt_dduc_polt_fund = req.getParameter("tax_amt_dduc_polt_fund");
if( tax_amt_dduc_polt_fund == null){
	System.out.println(this.toString+" : tax_amt_dduc_polt_fund is null" );
}else{
	System.out.println(this.toString+" : tax_amt_dduc_polt_fund is "+tax_amt_dduc_polt_fund );
}
String tax_amt_dduc_hous_loan_amt = req.getParameter("tax_amt_dduc_hous_loan_amt");
if( tax_amt_dduc_hous_loan_amt == null){
	System.out.println(this.toString+" : tax_amt_dduc_hous_loan_amt is null" );
}else{
	System.out.println(this.toString+" : tax_amt_dduc_hous_loan_amt is "+tax_amt_dduc_hous_loan_amt );
}
String tax_amt_dduc_forn_pymt = req.getParameter("tax_amt_dduc_forn_pymt");
if( tax_amt_dduc_forn_pymt == null){
	System.out.println(this.toString+" : tax_amt_dduc_forn_pymt is null" );
}else{
	System.out.println(this.toString+" : tax_amt_dduc_forn_pymt is "+tax_amt_dduc_forn_pymt );
}
String tax_amt_dduc_stot = req.getParameter("tax_amt_dduc_stot");
if( tax_amt_dduc_stot == null){
	System.out.println(this.toString+" : tax_amt_dduc_stot is null" );
}else{
	System.out.println(this.toString+" : tax_amt_dduc_stot is "+tax_amt_dduc_stot );
}
String hous_mogg_loan_amt_int = req.getParameter("hous_mogg_loan_amt_int");
if( hous_mogg_loan_amt_int == null){
	System.out.println(this.toString+" : hous_mogg_loan_amt_int is null" );
}else{
	System.out.println(this.toString+" : hous_mogg_loan_amt_int is "+hous_mogg_loan_amt_int );
}
String prsn_pens_pymt_amt = req.getParameter("prsn_pens_pymt_amt");
if( prsn_pens_pymt_amt == null){
	System.out.println(this.toString+" : prsn_pens_pymt_amt is null" );
}else{
	System.out.println(this.toString+" : prsn_pens_pymt_amt is "+prsn_pens_pymt_amt );
}
String pens_savg_pymt_amt = req.getParameter("pens_savg_pymt_amt");
if( pens_savg_pymt_amt == null){
	System.out.println(this.toString+" : pens_savg_pymt_amt is null" );
}else{
	System.out.println(this.toString+" : pens_savg_pymt_amt is "+pens_savg_pymt_amt );
}
String plac_cmpy_plac_trad_authr = req.getParameter("plac_cmpy_plac_trad_authr");
if( plac_cmpy_plac_trad_authr == null){
	System.out.println(this.toString+" : plac_cmpy_plac_trad_authr is null" );
}else{
	System.out.println(this.toString+" : plac_cmpy_plac_trad_authr is "+plac_cmpy_plac_trad_authr );
}
String hous_fund_pymt_amt = req.getParameter("hous_fund_pymt_amt");
if( hous_fund_pymt_amt == null){
	System.out.println(this.toString+" : hous_fund_pymt_amt is null" );
}else{
	System.out.println(this.toString+" : hous_fund_pymt_amt is "+hous_fund_pymt_amt );
}
String invsm_cmpd_invsm_amt = req.getParameter("invsm_cmpd_invsm_amt");
if( invsm_cmpd_invsm_amt == null){
	System.out.println(this.toString+" : invsm_cmpd_invsm_amt is null" );
}else{
	System.out.println(this.toString+" : invsm_cmpd_invsm_amt is "+invsm_cmpd_invsm_amt );
}
String emp_stok_ownr_cmpd_dona_amt = req.getParameter("emp_stok_ownr_cmpd_dona_amt");
if( emp_stok_ownr_cmpd_dona_amt == null){
	System.out.println(this.toString+" : emp_stok_ownr_cmpd_dona_amt is null" );
}else{
	System.out.println(this.toString+" : emp_stok_ownr_cmpd_dona_amt is "+emp_stok_ownr_cmpd_dona_amt );
}
String crdt_non_pcc_use = req.getParameter("crdt_non_pcc_use");
if( crdt_non_pcc_use == null){
	System.out.println(this.toString+" : crdt_non_pcc_use is null" );
}else{
	System.out.println(this.toString+" : crdt_non_pcc_use is "+crdt_non_pcc_use );
}
String ltrm_stok_type_savg_incm = req.getParameter("ltrm_stok_type_savg_incm");
if( ltrm_stok_type_savg_incm == null){
	System.out.println(this.toString+" : ltrm_stok_type_savg_incm is null" );
}else{
	System.out.println(this.toString+" : ltrm_stok_type_savg_incm is "+ltrm_stok_type_savg_incm );
}
String non_tax_frnc_01 = req.getParameter("non_tax_frnc_01");
if( non_tax_frnc_01 == null){
	System.out.println(this.toString+" : non_tax_frnc_01 is null" );
}else{
	System.out.println(this.toString+" : non_tax_frnc_01 is "+non_tax_frnc_01 );
}
String non_tax_jrnst_01 = req.getParameter("non_tax_jrnst_01");
if( non_tax_jrnst_01 == null){
	System.out.println(this.toString+" : non_tax_jrnst_01 is null" );
}else{
	System.out.println(this.toString+" : non_tax_jrnst_01 is "+non_tax_jrnst_01 );
}
String non_tax_frnc_02 = req.getParameter("non_tax_frnc_02");
if( non_tax_frnc_02 == null){
	System.out.println(this.toString+" : non_tax_frnc_02 is null" );
}else{
	System.out.println(this.toString+" : non_tax_frnc_02 is "+non_tax_frnc_02 );
}
String non_tax_jrnst_02 = req.getParameter("non_tax_jrnst_02");
if( non_tax_jrnst_02 == null){
	System.out.println(this.toString+" : non_tax_jrnst_02 is null" );
}else{
	System.out.println(this.toString+" : non_tax_jrnst_02 is "+non_tax_jrnst_02 );
}
String non_tax_frnc_03 = req.getParameter("non_tax_frnc_03");
if( non_tax_frnc_03 == null){
	System.out.println(this.toString+" : non_tax_frnc_03 is null" );
}else{
	System.out.println(this.toString+" : non_tax_frnc_03 is "+non_tax_frnc_03 );
}
String non_tax_jrnst_03 = req.getParameter("non_tax_jrnst_03");
if( non_tax_jrnst_03 == null){
	System.out.println(this.toString+" : non_tax_jrnst_03 is null" );
}else{
	System.out.println(this.toString+" : non_tax_jrnst_03 is "+non_tax_jrnst_03 );
}
String non_tax_frnc_04 = req.getParameter("non_tax_frnc_04");
if( non_tax_frnc_04 == null){
	System.out.println(this.toString+" : non_tax_frnc_04 is null" );
}else{
	System.out.println(this.toString+" : non_tax_frnc_04 is "+non_tax_frnc_04 );
}
String non_tax_jrnst_04 = req.getParameter("non_tax_jrnst_04");
if( non_tax_jrnst_04 == null){
	System.out.println(this.toString+" : non_tax_jrnst_04 is null" );
}else{
	System.out.println(this.toString+" : non_tax_jrnst_04 is "+non_tax_jrnst_04 );
}
String non_tax_frnc_05 = req.getParameter("non_tax_frnc_05");
if( non_tax_frnc_05 == null){
	System.out.println(this.toString+" : non_tax_frnc_05 is null" );
}else{
	System.out.println(this.toString+" : non_tax_frnc_05 is "+non_tax_frnc_05 );
}
String non_tax_jrnst_05 = req.getParameter("non_tax_jrnst_05");
if( non_tax_jrnst_05 == null){
	System.out.println(this.toString+" : non_tax_jrnst_05 is null" );
}else{
	System.out.println(this.toString+" : non_tax_jrnst_05 is "+non_tax_jrnst_05 );
}
String non_tax_frnc_06 = req.getParameter("non_tax_frnc_06");
if( non_tax_frnc_06 == null){
	System.out.println(this.toString+" : non_tax_frnc_06 is null" );
}else{
	System.out.println(this.toString+" : non_tax_frnc_06 is "+non_tax_frnc_06 );
}
String non_tax_jrnst_06 = req.getParameter("non_tax_jrnst_06");
if( non_tax_jrnst_06 == null){
	System.out.println(this.toString+" : non_tax_jrnst_06 is null" );
}else{
	System.out.println(this.toString+" : non_tax_jrnst_06 is "+non_tax_jrnst_06 );
}
String non_tax_frnc_07 = req.getParameter("non_tax_frnc_07");
if( non_tax_frnc_07 == null){
	System.out.println(this.toString+" : non_tax_frnc_07 is null" );
}else{
	System.out.println(this.toString+" : non_tax_frnc_07 is "+non_tax_frnc_07 );
}
String non_tax_jrnst_07 = req.getParameter("non_tax_jrnst_07");
if( non_tax_jrnst_07 == null){
	System.out.println(this.toString+" : non_tax_jrnst_07 is null" );
}else{
	System.out.println(this.toString+" : non_tax_jrnst_07 is "+non_tax_jrnst_07 );
}
String non_tax_frnc_08 = req.getParameter("non_tax_frnc_08");
if( non_tax_frnc_08 == null){
	System.out.println(this.toString+" : non_tax_frnc_08 is null" );
}else{
	System.out.println(this.toString+" : non_tax_frnc_08 is "+non_tax_frnc_08 );
}
String non_tax_jrnst_08 = req.getParameter("non_tax_jrnst_08");
if( non_tax_jrnst_08 == null){
	System.out.println(this.toString+" : non_tax_jrnst_08 is null" );
}else{
	System.out.println(this.toString+" : non_tax_jrnst_08 is "+non_tax_jrnst_08 );
}
String non_tax_frnc_09 = req.getParameter("non_tax_frnc_09");
if( non_tax_frnc_09 == null){
	System.out.println(this.toString+" : non_tax_frnc_09 is null" );
}else{
	System.out.println(this.toString+" : non_tax_frnc_09 is "+non_tax_frnc_09 );
}
String non_tax_jrnst_09 = req.getParameter("non_tax_jrnst_09");
if( non_tax_jrnst_09 == null){
	System.out.println(this.toString+" : non_tax_jrnst_09 is null" );
}else{
	System.out.println(this.toString+" : non_tax_jrnst_09 is "+non_tax_jrnst_09 );
}
String non_tax_frnc_10 = req.getParameter("non_tax_frnc_10");
if( non_tax_frnc_10 == null){
	System.out.println(this.toString+" : non_tax_frnc_10 is null" );
}else{
	System.out.println(this.toString+" : non_tax_frnc_10 is "+non_tax_frnc_10 );
}
String non_tax_jrnst_10 = req.getParameter("non_tax_jrnst_10");
if( non_tax_jrnst_10 == null){
	System.out.println(this.toString+" : non_tax_jrnst_10 is null" );
}else{
	System.out.println(this.toString+" : non_tax_jrnst_10 is "+non_tax_jrnst_10 );
}
String non_tax_frnc_11 = req.getParameter("non_tax_frnc_11");
if( non_tax_frnc_11 == null){
	System.out.println(this.toString+" : non_tax_frnc_11 is null" );
}else{
	System.out.println(this.toString+" : non_tax_frnc_11 is "+non_tax_frnc_11 );
}
String non_tax_jrnst_11 = req.getParameter("non_tax_jrnst_11");
if( non_tax_jrnst_11 == null){
	System.out.println(this.toString+" : non_tax_jrnst_11 is null" );
}else{
	System.out.println(this.toString+" : non_tax_jrnst_11 is "+non_tax_jrnst_11 );
}
String non_tax_frnc_12 = req.getParameter("non_tax_frnc_12");
if( non_tax_frnc_12 == null){
	System.out.println(this.toString+" : non_tax_frnc_12 is null" );
}else{
	System.out.println(this.toString+" : non_tax_frnc_12 is "+non_tax_frnc_12 );
}
String non_tax_jrnst_12 = req.getParameter("non_tax_jrnst_12");
if( non_tax_jrnst_12 == null){
	System.out.println(this.toString+" : non_tax_jrnst_12 is null" );
}else{
	System.out.println(this.toString+" : non_tax_jrnst_12 is "+non_tax_jrnst_12 );
}
String incmg_pers_ipadd = req.getParameter("incmg_pers_ipadd");
if( incmg_pers_ipadd == null){
	System.out.println(this.toString+" : incmg_pers_ipadd is null" );
}else{
	System.out.println(this.toString+" : incmg_pers_ipadd is "+incmg_pers_ipadd );
}
String incmg_pers = req.getParameter("incmg_pers");
if( incmg_pers == null){
	System.out.println(this.toString+" : incmg_pers is null" );
}else{
	System.out.println(this.toString+" : incmg_pers is "+incmg_pers );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String emp_no = Util.checkString(req.getParameter("emp_no"));
String adjm_rvrs_yy = Util.checkString(req.getParameter("adjm_rvrs_yy"));
String labr_incm_amt = Util.checkString(req.getParameter("labr_incm_amt"));
String base_dduc_slf = Util.checkString(req.getParameter("base_dduc_slf"));
String base_dduc_spos = Util.checkString(req.getParameter("base_dduc_spos"));
String boks_qunt_faml_nops = Util.checkString(req.getParameter("boks_qunt_faml_nops"));
String rspc_nops = Util.checkString(req.getParameter("rspc_nops"));
String addm_dduc_obcl_pers = Util.checkString(req.getParameter("addm_dduc_obcl_pers"));
String addm_dduc_fml_hshd = Util.checkString(req.getParameter("addm_dduc_fml_hshd"));
String addm_dduc_care_fee = Util.checkString(req.getParameter("addm_dduc_care_fee"));
String mj1birth_ibyang = Util.checkString(req.getParameter("mj1birth_ibyang"));
String multi_child_addm_dduc = Util.checkString(req.getParameter("multi_child_addm_dduc"));
String np_insr_fee_dduc = Util.checkString(req.getParameter("np_insr_fee_dduc"));
String spc_dduc_insr_fee = Util.checkString(req.getParameter("spc_dduc_insr_fee"));
String spc_dduc_hosp_fee = Util.checkString(req.getParameter("spc_dduc_hosp_fee"));
String spc_dduc_hous_fund = Util.checkString(req.getParameter("spc_dduc_hous_fund"));
String spc_dduc_dona_amt = Util.checkString(req.getParameter("spc_dduc_dona_amt"));
String spc_dduc_wedd_etc = Util.checkString(req.getParameter("spc_dduc_wedd_etc"));
String spc_dduc_stot = Util.checkString(req.getParameter("spc_dduc_stot"));
String std_dduc_amt = Util.checkString(req.getParameter("std_dduc_amt"));
String dedu_labr_incm_amt = Util.checkString(req.getParameter("dedu_labr_incm_amt"));
String tax_amt_dduc_labr_incm = Util.checkString(req.getParameter("tax_amt_dduc_labr_incm"));
String tax_amt_dduc_polt_fund = Util.checkString(req.getParameter("tax_amt_dduc_polt_fund"));
String tax_amt_dduc_hous_loan_amt = Util.checkString(req.getParameter("tax_amt_dduc_hous_loan_amt"));
String tax_amt_dduc_forn_pymt = Util.checkString(req.getParameter("tax_amt_dduc_forn_pymt"));
String tax_amt_dduc_stot = Util.checkString(req.getParameter("tax_amt_dduc_stot"));
String hous_mogg_loan_amt_int = Util.checkString(req.getParameter("hous_mogg_loan_amt_int"));
String prsn_pens_pymt_amt = Util.checkString(req.getParameter("prsn_pens_pymt_amt"));
String pens_savg_pymt_amt = Util.checkString(req.getParameter("pens_savg_pymt_amt"));
String plac_cmpy_plac_trad_authr = Util.checkString(req.getParameter("plac_cmpy_plac_trad_authr"));
String hous_fund_pymt_amt = Util.checkString(req.getParameter("hous_fund_pymt_amt"));
String invsm_cmpd_invsm_amt = Util.checkString(req.getParameter("invsm_cmpd_invsm_amt"));
String emp_stok_ownr_cmpd_dona_amt = Util.checkString(req.getParameter("emp_stok_ownr_cmpd_dona_amt"));
String crdt_non_pcc_use = Util.checkString(req.getParameter("crdt_non_pcc_use"));
String ltrm_stok_type_savg_incm = Util.checkString(req.getParameter("ltrm_stok_type_savg_incm"));
String non_tax_frnc_01 = Util.checkString(req.getParameter("non_tax_frnc_01"));
String non_tax_jrnst_01 = Util.checkString(req.getParameter("non_tax_jrnst_01"));
String non_tax_frnc_02 = Util.checkString(req.getParameter("non_tax_frnc_02"));
String non_tax_jrnst_02 = Util.checkString(req.getParameter("non_tax_jrnst_02"));
String non_tax_frnc_03 = Util.checkString(req.getParameter("non_tax_frnc_03"));
String non_tax_jrnst_03 = Util.checkString(req.getParameter("non_tax_jrnst_03"));
String non_tax_frnc_04 = Util.checkString(req.getParameter("non_tax_frnc_04"));
String non_tax_jrnst_04 = Util.checkString(req.getParameter("non_tax_jrnst_04"));
String non_tax_frnc_05 = Util.checkString(req.getParameter("non_tax_frnc_05"));
String non_tax_jrnst_05 = Util.checkString(req.getParameter("non_tax_jrnst_05"));
String non_tax_frnc_06 = Util.checkString(req.getParameter("non_tax_frnc_06"));
String non_tax_jrnst_06 = Util.checkString(req.getParameter("non_tax_jrnst_06"));
String non_tax_frnc_07 = Util.checkString(req.getParameter("non_tax_frnc_07"));
String non_tax_jrnst_07 = Util.checkString(req.getParameter("non_tax_jrnst_07"));
String non_tax_frnc_08 = Util.checkString(req.getParameter("non_tax_frnc_08"));
String non_tax_jrnst_08 = Util.checkString(req.getParameter("non_tax_jrnst_08"));
String non_tax_frnc_09 = Util.checkString(req.getParameter("non_tax_frnc_09"));
String non_tax_jrnst_09 = Util.checkString(req.getParameter("non_tax_jrnst_09"));
String non_tax_frnc_10 = Util.checkString(req.getParameter("non_tax_frnc_10"));
String non_tax_jrnst_10 = Util.checkString(req.getParameter("non_tax_jrnst_10"));
String non_tax_frnc_11 = Util.checkString(req.getParameter("non_tax_frnc_11"));
String non_tax_jrnst_11 = Util.checkString(req.getParameter("non_tax_jrnst_11"));
String non_tax_frnc_12 = Util.checkString(req.getParameter("non_tax_frnc_12"));
String non_tax_jrnst_12 = Util.checkString(req.getParameter("non_tax_jrnst_12"));
String incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_no")));
String adjm_rvrs_yy = Util.Uni2Ksc(Util.checkString(req.getParameter("adjm_rvrs_yy")));
String labr_incm_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("labr_incm_amt")));
String base_dduc_slf = Util.Uni2Ksc(Util.checkString(req.getParameter("base_dduc_slf")));
String base_dduc_spos = Util.Uni2Ksc(Util.checkString(req.getParameter("base_dduc_spos")));
String boks_qunt_faml_nops = Util.Uni2Ksc(Util.checkString(req.getParameter("boks_qunt_faml_nops")));
String rspc_nops = Util.Uni2Ksc(Util.checkString(req.getParameter("rspc_nops")));
String addm_dduc_obcl_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("addm_dduc_obcl_pers")));
String addm_dduc_fml_hshd = Util.Uni2Ksc(Util.checkString(req.getParameter("addm_dduc_fml_hshd")));
String addm_dduc_care_fee = Util.Uni2Ksc(Util.checkString(req.getParameter("addm_dduc_care_fee")));
String mj1birth_ibyang = Util.Uni2Ksc(Util.checkString(req.getParameter("mj1birth_ibyang")));
String multi_child_addm_dduc = Util.Uni2Ksc(Util.checkString(req.getParameter("multi_child_addm_dduc")));
String np_insr_fee_dduc = Util.Uni2Ksc(Util.checkString(req.getParameter("np_insr_fee_dduc")));
String spc_dduc_insr_fee = Util.Uni2Ksc(Util.checkString(req.getParameter("spc_dduc_insr_fee")));
String spc_dduc_hosp_fee = Util.Uni2Ksc(Util.checkString(req.getParameter("spc_dduc_hosp_fee")));
String spc_dduc_hous_fund = Util.Uni2Ksc(Util.checkString(req.getParameter("spc_dduc_hous_fund")));
String spc_dduc_dona_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("spc_dduc_dona_amt")));
String spc_dduc_wedd_etc = Util.Uni2Ksc(Util.checkString(req.getParameter("spc_dduc_wedd_etc")));
String spc_dduc_stot = Util.Uni2Ksc(Util.checkString(req.getParameter("spc_dduc_stot")));
String std_dduc_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("std_dduc_amt")));
String dedu_labr_incm_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("dedu_labr_incm_amt")));
String tax_amt_dduc_labr_incm = Util.Uni2Ksc(Util.checkString(req.getParameter("tax_amt_dduc_labr_incm")));
String tax_amt_dduc_polt_fund = Util.Uni2Ksc(Util.checkString(req.getParameter("tax_amt_dduc_polt_fund")));
String tax_amt_dduc_hous_loan_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("tax_amt_dduc_hous_loan_amt")));
String tax_amt_dduc_forn_pymt = Util.Uni2Ksc(Util.checkString(req.getParameter("tax_amt_dduc_forn_pymt")));
String tax_amt_dduc_stot = Util.Uni2Ksc(Util.checkString(req.getParameter("tax_amt_dduc_stot")));
String hous_mogg_loan_amt_int = Util.Uni2Ksc(Util.checkString(req.getParameter("hous_mogg_loan_amt_int")));
String prsn_pens_pymt_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("prsn_pens_pymt_amt")));
String pens_savg_pymt_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("pens_savg_pymt_amt")));
String plac_cmpy_plac_trad_authr = Util.Uni2Ksc(Util.checkString(req.getParameter("plac_cmpy_plac_trad_authr")));
String hous_fund_pymt_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("hous_fund_pymt_amt")));
String invsm_cmpd_invsm_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("invsm_cmpd_invsm_amt")));
String emp_stok_ownr_cmpd_dona_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_stok_ownr_cmpd_dona_amt")));
String crdt_non_pcc_use = Util.Uni2Ksc(Util.checkString(req.getParameter("crdt_non_pcc_use")));
String ltrm_stok_type_savg_incm = Util.Uni2Ksc(Util.checkString(req.getParameter("ltrm_stok_type_savg_incm")));
String non_tax_frnc_01 = Util.Uni2Ksc(Util.checkString(req.getParameter("non_tax_frnc_01")));
String non_tax_jrnst_01 = Util.Uni2Ksc(Util.checkString(req.getParameter("non_tax_jrnst_01")));
String non_tax_frnc_02 = Util.Uni2Ksc(Util.checkString(req.getParameter("non_tax_frnc_02")));
String non_tax_jrnst_02 = Util.Uni2Ksc(Util.checkString(req.getParameter("non_tax_jrnst_02")));
String non_tax_frnc_03 = Util.Uni2Ksc(Util.checkString(req.getParameter("non_tax_frnc_03")));
String non_tax_jrnst_03 = Util.Uni2Ksc(Util.checkString(req.getParameter("non_tax_jrnst_03")));
String non_tax_frnc_04 = Util.Uni2Ksc(Util.checkString(req.getParameter("non_tax_frnc_04")));
String non_tax_jrnst_04 = Util.Uni2Ksc(Util.checkString(req.getParameter("non_tax_jrnst_04")));
String non_tax_frnc_05 = Util.Uni2Ksc(Util.checkString(req.getParameter("non_tax_frnc_05")));
String non_tax_jrnst_05 = Util.Uni2Ksc(Util.checkString(req.getParameter("non_tax_jrnst_05")));
String non_tax_frnc_06 = Util.Uni2Ksc(Util.checkString(req.getParameter("non_tax_frnc_06")));
String non_tax_jrnst_06 = Util.Uni2Ksc(Util.checkString(req.getParameter("non_tax_jrnst_06")));
String non_tax_frnc_07 = Util.Uni2Ksc(Util.checkString(req.getParameter("non_tax_frnc_07")));
String non_tax_jrnst_07 = Util.Uni2Ksc(Util.checkString(req.getParameter("non_tax_jrnst_07")));
String non_tax_frnc_08 = Util.Uni2Ksc(Util.checkString(req.getParameter("non_tax_frnc_08")));
String non_tax_jrnst_08 = Util.Uni2Ksc(Util.checkString(req.getParameter("non_tax_jrnst_08")));
String non_tax_frnc_09 = Util.Uni2Ksc(Util.checkString(req.getParameter("non_tax_frnc_09")));
String non_tax_jrnst_09 = Util.Uni2Ksc(Util.checkString(req.getParameter("non_tax_jrnst_09")));
String non_tax_frnc_10 = Util.Uni2Ksc(Util.checkString(req.getParameter("non_tax_frnc_10")));
String non_tax_jrnst_10 = Util.Uni2Ksc(Util.checkString(req.getParameter("non_tax_jrnst_10")));
String non_tax_frnc_11 = Util.Uni2Ksc(Util.checkString(req.getParameter("non_tax_frnc_11")));
String non_tax_jrnst_11 = Util.Uni2Ksc(Util.checkString(req.getParameter("non_tax_jrnst_11")));
String non_tax_frnc_12 = Util.Uni2Ksc(Util.checkString(req.getParameter("non_tax_frnc_12")));
String non_tax_jrnst_12 = Util.Uni2Ksc(Util.checkString(req.getParameter("non_tax_jrnst_12")));
String incmg_pers_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipadd")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setEmp_no(emp_no);
dm.setAdjm_rvrs_yy(adjm_rvrs_yy);
dm.setLabr_incm_amt(labr_incm_amt);
dm.setBase_dduc_slf(base_dduc_slf);
dm.setBase_dduc_spos(base_dduc_spos);
dm.setBoks_qunt_faml_nops(boks_qunt_faml_nops);
dm.setRspc_nops(rspc_nops);
dm.setAddm_dduc_obcl_pers(addm_dduc_obcl_pers);
dm.setAddm_dduc_fml_hshd(addm_dduc_fml_hshd);
dm.setAddm_dduc_care_fee(addm_dduc_care_fee);
dm.setMj1birth_ibyang(mj1birth_ibyang);
dm.setMulti_child_addm_dduc(multi_child_addm_dduc);
dm.setNp_insr_fee_dduc(np_insr_fee_dduc);
dm.setSpc_dduc_insr_fee(spc_dduc_insr_fee);
dm.setSpc_dduc_hosp_fee(spc_dduc_hosp_fee);
dm.setSpc_dduc_hous_fund(spc_dduc_hous_fund);
dm.setSpc_dduc_dona_amt(spc_dduc_dona_amt);
dm.setSpc_dduc_wedd_etc(spc_dduc_wedd_etc);
dm.setSpc_dduc_stot(spc_dduc_stot);
dm.setStd_dduc_amt(std_dduc_amt);
dm.setDedu_labr_incm_amt(dedu_labr_incm_amt);
dm.setTax_amt_dduc_labr_incm(tax_amt_dduc_labr_incm);
dm.setTax_amt_dduc_polt_fund(tax_amt_dduc_polt_fund);
dm.setTax_amt_dduc_hous_loan_amt(tax_amt_dduc_hous_loan_amt);
dm.setTax_amt_dduc_forn_pymt(tax_amt_dduc_forn_pymt);
dm.setTax_amt_dduc_stot(tax_amt_dduc_stot);
dm.setHous_mogg_loan_amt_int(hous_mogg_loan_amt_int);
dm.setPrsn_pens_pymt_amt(prsn_pens_pymt_amt);
dm.setPens_savg_pymt_amt(pens_savg_pymt_amt);
dm.setPlac_cmpy_plac_trad_authr(plac_cmpy_plac_trad_authr);
dm.setHous_fund_pymt_amt(hous_fund_pymt_amt);
dm.setInvsm_cmpd_invsm_amt(invsm_cmpd_invsm_amt);
dm.setEmp_stok_ownr_cmpd_dona_amt(emp_stok_ownr_cmpd_dona_amt);
dm.setCrdt_non_pcc_use(crdt_non_pcc_use);
dm.setLtrm_stok_type_savg_incm(ltrm_stok_type_savg_incm);
dm.setNon_tax_frnc_01(non_tax_frnc_01);
dm.setNon_tax_jrnst_01(non_tax_jrnst_01);
dm.setNon_tax_frnc_02(non_tax_frnc_02);
dm.setNon_tax_jrnst_02(non_tax_jrnst_02);
dm.setNon_tax_frnc_03(non_tax_frnc_03);
dm.setNon_tax_jrnst_03(non_tax_jrnst_03);
dm.setNon_tax_frnc_04(non_tax_frnc_04);
dm.setNon_tax_jrnst_04(non_tax_jrnst_04);
dm.setNon_tax_frnc_05(non_tax_frnc_05);
dm.setNon_tax_jrnst_05(non_tax_jrnst_05);
dm.setNon_tax_frnc_06(non_tax_frnc_06);
dm.setNon_tax_jrnst_06(non_tax_jrnst_06);
dm.setNon_tax_frnc_07(non_tax_frnc_07);
dm.setNon_tax_jrnst_07(non_tax_jrnst_07);
dm.setNon_tax_frnc_08(non_tax_frnc_08);
dm.setNon_tax_jrnst_08(non_tax_jrnst_08);
dm.setNon_tax_frnc_09(non_tax_frnc_09);
dm.setNon_tax_jrnst_09(non_tax_jrnst_09);
dm.setNon_tax_frnc_10(non_tax_frnc_10);
dm.setNon_tax_jrnst_10(non_tax_jrnst_10);
dm.setNon_tax_frnc_11(non_tax_frnc_11);
dm.setNon_tax_jrnst_11(non_tax_jrnst_11);
dm.setNon_tax_frnc_12(non_tax_frnc_12);
dm.setNon_tax_jrnst_12(non_tax_jrnst_12);
dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Aug 18 10:56:21 KST 2009 */
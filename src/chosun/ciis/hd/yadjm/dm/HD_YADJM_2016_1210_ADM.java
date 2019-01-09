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


public class HD_YADJM_2016_1210_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String mode;
	public String adjm_rvrs_yy;
	public String emp_no;
	public String faml_seq;
	public String faml_rshp_cd;
	public String faml_prn;
	public String faml_flnm;
	public String base_dduc_yn;
	public String obcl_pers_dduc_yn;
	public String fml_hshd_dduc_yn;
	public String care_fee_dduc_yn;
	public String one_paren_dduc_yn;
	public String adopt_dt;
	public String dth_dt;
	public String obcl_pers_clsf;
	public String edu_fee_clsf_cd;
	public String edu_cost_onta;
	public String edu_cost_etc;
	public String edu_splen_pers_onta;
	public String edu_splen_pers_etc;
	public String asrc_prpn_insr_fee_onta;
	public String asrc_prpn_insr_fee_etc;
	public String obcl_pers_insr_onta;
	public String obcl_pers_insr_etc;
	public String crdt_card_tot_amt_onta;
	public String crdt_card_tot_amt_etc;
	public String debit_card_tot_amt_onta;
	public String debit_card_tot_amt_etc;
	public String cash_rcpt_onta;
	public String trad_mrkt_onta;
	public String trad_mrkt_etc;
	public String public_trans_amt_onta;
	public String public_trans_amt_etc;
	public String prsn_pens;
	public String pens_savg;
	public String invsm_cmpd_invsm_amt_6;
	public String invsm_cmpd_invsm_amt;
	public String hous_subc_savg;
	public String multy_house_plan_savg;
	public String ltrm_hous_savg;
	public String labr_hous_savg;
	public String hous_rcpm_won_li_amt_repa;
	public String monthly_rent_amt;
	public String hous_loan_amt_int_1;
	public String ltrm_mogg_loan_amt_int_re;
	public String hous_loan_amt_int;
	public String hous_loan_amt_int_2012_1;
	public String hous_loan_amt_int_2012_2;
	public String ltrm_stok_savg_incm_dduc1;
	public String ltrm_stok_savg_incm_dduc2;
	public String ltrm_stok_savg_incm_dduc3;
	public String lvcmpy_pens;
	public String smallbiz_incm_dduc;
	public String larg_sum_no_lease_house;
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
	public String crdt_card_incd_pre_onta;
	public String crdt_card_incd_pre_etc;
	public String debit_card_incd_pre_onta;
	public String debit_card_incd_pre_etc;
	public String cash_rcpt_incd_pre_onta;
	public String trad_pre_amt_onta;
	public String trad_pre_amt_etc;
	public String trans_pre_amt_onta;
	public String trans_pre_amt_etc;
	public String ltrm_invsm_stock_amt;
	public String ftyr_crdt_card_onta;
	public String ftyr_crdt_card_etc;
	public String ftyr_debit_card_onta;
	public String ftyr_debit_card_etc;
	public String ftyr_cash_rcpt_onta;
	public String ftyr_trad_amt_onta;
	public String ftyr_trad_amt_etc;
	public String ftyr_trans_amt_onta;
	public String ftyr_trans_amt_etc;
	public String connect_ip;
	public String connect_userid;

	public HD_YADJM_2016_1210_ADM(){}
	public HD_YADJM_2016_1210_ADM(String cmpy_cd, String mode, String adjm_rvrs_yy, String emp_no, String faml_seq, String faml_rshp_cd, String faml_prn, String faml_flnm, String base_dduc_yn, String obcl_pers_dduc_yn, String fml_hshd_dduc_yn, String care_fee_dduc_yn, String one_paren_dduc_yn, String adopt_dt, String dth_dt, String obcl_pers_clsf, String edu_fee_clsf_cd, String edu_cost_onta, String edu_cost_etc, String edu_splen_pers_onta, String edu_splen_pers_etc, String asrc_prpn_insr_fee_onta, String asrc_prpn_insr_fee_etc, String obcl_pers_insr_onta, String obcl_pers_insr_etc, String crdt_card_tot_amt_onta, String crdt_card_tot_amt_etc, String debit_card_tot_amt_onta, String debit_card_tot_amt_etc, String cash_rcpt_onta, String trad_mrkt_onta, String trad_mrkt_etc, String public_trans_amt_onta, String public_trans_amt_etc, String prsn_pens, String pens_savg, String invsm_cmpd_invsm_amt_6, String invsm_cmpd_invsm_amt, String hous_subc_savg, String multy_house_plan_savg, String ltrm_hous_savg, String labr_hous_savg, String hous_rcpm_won_li_amt_repa, String monthly_rent_amt, String hous_loan_amt_int_1, String ltrm_mogg_loan_amt_int_re, String hous_loan_amt_int, String hous_loan_amt_int_2012_1, String hous_loan_amt_int_2012_2, String ltrm_stok_savg_incm_dduc1, String ltrm_stok_savg_incm_dduc2, String ltrm_stok_savg_incm_dduc3, String lvcmpy_pens, String smallbiz_incm_dduc, String larg_sum_no_lease_house, String debit_card_1st_amt_onta, String debit_card_2nd_amt_onta, String debit_card_1st_amt_etc, String debit_card_2nd_amt_etc, String cash_rcpt_1st_onta, String cash_rcpt_2nd_onta, String trad_all_1st_amt_onta, String trad_all_2nd_amt_onta, String trad_all_1st_amt_etc, String trad_all_2nd_amt_etc, String trans_all_1st_amt_onta, String trans_all_2nd_amt_onta, String trans_all_1st_amt_etc, String trans_all_2nd_amt_etc, String crdt_card_incd_pre_onta, String crdt_card_incd_pre_etc, String debit_card_incd_pre_onta, String debit_card_incd_pre_etc, String cash_rcpt_incd_pre_onta, String trad_pre_amt_onta, String trad_pre_amt_etc, String trans_pre_amt_onta, String trans_pre_amt_etc, String ltrm_invsm_stock_amt, String ftyr_crdt_card_onta, String ftyr_crdt_card_etc, String ftyr_debit_card_onta, String ftyr_debit_card_etc, String ftyr_cash_rcpt_onta, String ftyr_trad_amt_onta, String ftyr_trad_amt_etc, String ftyr_trans_amt_onta, String ftyr_trans_amt_etc, String connect_ip, String connect_userid){
		this.cmpy_cd = cmpy_cd;
		this.mode = mode;
		this.adjm_rvrs_yy = adjm_rvrs_yy;
		this.emp_no = emp_no;
		this.faml_seq = faml_seq;
		this.faml_rshp_cd = faml_rshp_cd;
		this.faml_prn = faml_prn;
		this.faml_flnm = faml_flnm;
		this.base_dduc_yn = base_dduc_yn;
		this.obcl_pers_dduc_yn = obcl_pers_dduc_yn;
		this.fml_hshd_dduc_yn = fml_hshd_dduc_yn;
		this.care_fee_dduc_yn = care_fee_dduc_yn;
		this.one_paren_dduc_yn = one_paren_dduc_yn;
		this.adopt_dt = adopt_dt;
		this.dth_dt = dth_dt;
		this.obcl_pers_clsf = obcl_pers_clsf;
		this.edu_fee_clsf_cd = edu_fee_clsf_cd;
		this.edu_cost_onta = edu_cost_onta;
		this.edu_cost_etc = edu_cost_etc;
		this.edu_splen_pers_onta = edu_splen_pers_onta;
		this.edu_splen_pers_etc = edu_splen_pers_etc;
		this.asrc_prpn_insr_fee_onta = asrc_prpn_insr_fee_onta;
		this.asrc_prpn_insr_fee_etc = asrc_prpn_insr_fee_etc;
		this.obcl_pers_insr_onta = obcl_pers_insr_onta;
		this.obcl_pers_insr_etc = obcl_pers_insr_etc;
		this.crdt_card_tot_amt_onta = crdt_card_tot_amt_onta;
		this.crdt_card_tot_amt_etc = crdt_card_tot_amt_etc;
		this.debit_card_tot_amt_onta = debit_card_tot_amt_onta;
		this.debit_card_tot_amt_etc = debit_card_tot_amt_etc;
		this.cash_rcpt_onta = cash_rcpt_onta;
		this.trad_mrkt_onta = trad_mrkt_onta;
		this.trad_mrkt_etc = trad_mrkt_etc;
		this.public_trans_amt_onta = public_trans_amt_onta;
		this.public_trans_amt_etc = public_trans_amt_etc;
		this.prsn_pens = prsn_pens;
		this.pens_savg = pens_savg;
		this.invsm_cmpd_invsm_amt_6 = invsm_cmpd_invsm_amt_6;
		this.invsm_cmpd_invsm_amt = invsm_cmpd_invsm_amt;
		this.hous_subc_savg = hous_subc_savg;
		this.multy_house_plan_savg = multy_house_plan_savg;
		this.ltrm_hous_savg = ltrm_hous_savg;
		this.labr_hous_savg = labr_hous_savg;
		this.hous_rcpm_won_li_amt_repa = hous_rcpm_won_li_amt_repa;
		this.monthly_rent_amt = monthly_rent_amt;
		this.hous_loan_amt_int_1 = hous_loan_amt_int_1;
		this.ltrm_mogg_loan_amt_int_re = ltrm_mogg_loan_amt_int_re;
		this.hous_loan_amt_int = hous_loan_amt_int;
		this.hous_loan_amt_int_2012_1 = hous_loan_amt_int_2012_1;
		this.hous_loan_amt_int_2012_2 = hous_loan_amt_int_2012_2;
		this.ltrm_stok_savg_incm_dduc1 = ltrm_stok_savg_incm_dduc1;
		this.ltrm_stok_savg_incm_dduc2 = ltrm_stok_savg_incm_dduc2;
		this.ltrm_stok_savg_incm_dduc3 = ltrm_stok_savg_incm_dduc3;
		this.lvcmpy_pens = lvcmpy_pens;
		this.smallbiz_incm_dduc = smallbiz_incm_dduc;
		this.larg_sum_no_lease_house = larg_sum_no_lease_house;
		this.debit_card_1st_amt_onta = debit_card_1st_amt_onta;
		this.debit_card_2nd_amt_onta = debit_card_2nd_amt_onta;
		this.debit_card_1st_amt_etc = debit_card_1st_amt_etc;
		this.debit_card_2nd_amt_etc = debit_card_2nd_amt_etc;
		this.cash_rcpt_1st_onta = cash_rcpt_1st_onta;
		this.cash_rcpt_2nd_onta = cash_rcpt_2nd_onta;
		this.trad_all_1st_amt_onta = trad_all_1st_amt_onta;
		this.trad_all_2nd_amt_onta = trad_all_2nd_amt_onta;
		this.trad_all_1st_amt_etc = trad_all_1st_amt_etc;
		this.trad_all_2nd_amt_etc = trad_all_2nd_amt_etc;
		this.trans_all_1st_amt_onta = trans_all_1st_amt_onta;
		this.trans_all_2nd_amt_onta = trans_all_2nd_amt_onta;
		this.trans_all_1st_amt_etc = trans_all_1st_amt_etc;
		this.trans_all_2nd_amt_etc = trans_all_2nd_amt_etc;
		this.crdt_card_incd_pre_onta = crdt_card_incd_pre_onta;
		this.crdt_card_incd_pre_etc = crdt_card_incd_pre_etc;
		this.debit_card_incd_pre_onta = debit_card_incd_pre_onta;
		this.debit_card_incd_pre_etc = debit_card_incd_pre_etc;
		this.cash_rcpt_incd_pre_onta = cash_rcpt_incd_pre_onta;
		this.trad_pre_amt_onta = trad_pre_amt_onta;
		this.trad_pre_amt_etc = trad_pre_amt_etc;
		this.trans_pre_amt_onta = trans_pre_amt_onta;
		this.trans_pre_amt_etc = trans_pre_amt_etc;
		this.ltrm_invsm_stock_amt = ltrm_invsm_stock_amt;
		this.ftyr_crdt_card_onta = ftyr_crdt_card_onta;
		this.ftyr_crdt_card_etc = ftyr_crdt_card_etc;
		this.ftyr_debit_card_onta = ftyr_debit_card_onta;
		this.ftyr_debit_card_etc = ftyr_debit_card_etc;
		this.ftyr_cash_rcpt_onta = ftyr_cash_rcpt_onta;
		this.ftyr_trad_amt_onta = ftyr_trad_amt_onta;
		this.ftyr_trad_amt_etc = ftyr_trad_amt_etc;
		this.ftyr_trans_amt_onta = ftyr_trans_amt_onta;
		this.ftyr_trans_amt_etc = ftyr_trans_amt_etc;
		this.connect_ip = connect_ip;
		this.connect_userid = connect_userid;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setMode(String mode){
		this.mode = mode;
	}

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

	public void setAdopt_dt(String adopt_dt){
		this.adopt_dt = adopt_dt;
	}

	public void setDth_dt(String dth_dt){
		this.dth_dt = dth_dt;
	}

	public void setObcl_pers_clsf(String obcl_pers_clsf){
		this.obcl_pers_clsf = obcl_pers_clsf;
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

	public void setCrdt_card_tot_amt_onta(String crdt_card_tot_amt_onta){
		this.crdt_card_tot_amt_onta = crdt_card_tot_amt_onta;
	}

	public void setCrdt_card_tot_amt_etc(String crdt_card_tot_amt_etc){
		this.crdt_card_tot_amt_etc = crdt_card_tot_amt_etc;
	}

	public void setDebit_card_tot_amt_onta(String debit_card_tot_amt_onta){
		this.debit_card_tot_amt_onta = debit_card_tot_amt_onta;
	}

	public void setDebit_card_tot_amt_etc(String debit_card_tot_amt_etc){
		this.debit_card_tot_amt_etc = debit_card_tot_amt_etc;
	}

	public void setCash_rcpt_onta(String cash_rcpt_onta){
		this.cash_rcpt_onta = cash_rcpt_onta;
	}

	public void setTrad_mrkt_onta(String trad_mrkt_onta){
		this.trad_mrkt_onta = trad_mrkt_onta;
	}

	public void setTrad_mrkt_etc(String trad_mrkt_etc){
		this.trad_mrkt_etc = trad_mrkt_etc;
	}

	public void setPublic_trans_amt_onta(String public_trans_amt_onta){
		this.public_trans_amt_onta = public_trans_amt_onta;
	}

	public void setPublic_trans_amt_etc(String public_trans_amt_etc){
		this.public_trans_amt_etc = public_trans_amt_etc;
	}

	public void setPrsn_pens(String prsn_pens){
		this.prsn_pens = prsn_pens;
	}

	public void setPens_savg(String pens_savg){
		this.pens_savg = pens_savg;
	}

	public void setInvsm_cmpd_invsm_amt_6(String invsm_cmpd_invsm_amt_6){
		this.invsm_cmpd_invsm_amt_6 = invsm_cmpd_invsm_amt_6;
	}

	public void setInvsm_cmpd_invsm_amt(String invsm_cmpd_invsm_amt){
		this.invsm_cmpd_invsm_amt = invsm_cmpd_invsm_amt;
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

	public void setHous_rcpm_won_li_amt_repa(String hous_rcpm_won_li_amt_repa){
		this.hous_rcpm_won_li_amt_repa = hous_rcpm_won_li_amt_repa;
	}

	public void setMonthly_rent_amt(String monthly_rent_amt){
		this.monthly_rent_amt = monthly_rent_amt;
	}

	public void setHous_loan_amt_int_1(String hous_loan_amt_int_1){
		this.hous_loan_amt_int_1 = hous_loan_amt_int_1;
	}

	public void setLtrm_mogg_loan_amt_int_re(String ltrm_mogg_loan_amt_int_re){
		this.ltrm_mogg_loan_amt_int_re = ltrm_mogg_loan_amt_int_re;
	}

	public void setHous_loan_amt_int(String hous_loan_amt_int){
		this.hous_loan_amt_int = hous_loan_amt_int;
	}

	public void setHous_loan_amt_int_2012_1(String hous_loan_amt_int_2012_1){
		this.hous_loan_amt_int_2012_1 = hous_loan_amt_int_2012_1;
	}

	public void setHous_loan_amt_int_2012_2(String hous_loan_amt_int_2012_2){
		this.hous_loan_amt_int_2012_2 = hous_loan_amt_int_2012_2;
	}

	public void setLtrm_stok_savg_incm_dduc1(String ltrm_stok_savg_incm_dduc1){
		this.ltrm_stok_savg_incm_dduc1 = ltrm_stok_savg_incm_dduc1;
	}

	public void setLtrm_stok_savg_incm_dduc2(String ltrm_stok_savg_incm_dduc2){
		this.ltrm_stok_savg_incm_dduc2 = ltrm_stok_savg_incm_dduc2;
	}

	public void setLtrm_stok_savg_incm_dduc3(String ltrm_stok_savg_incm_dduc3){
		this.ltrm_stok_savg_incm_dduc3 = ltrm_stok_savg_incm_dduc3;
	}

	public void setLvcmpy_pens(String lvcmpy_pens){
		this.lvcmpy_pens = lvcmpy_pens;
	}

	public void setSmallbiz_incm_dduc(String smallbiz_incm_dduc){
		this.smallbiz_incm_dduc = smallbiz_incm_dduc;
	}

	public void setLarg_sum_no_lease_house(String larg_sum_no_lease_house){
		this.larg_sum_no_lease_house = larg_sum_no_lease_house;
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

	public void setLtrm_invsm_stock_amt(String ltrm_invsm_stock_amt){
		this.ltrm_invsm_stock_amt = ltrm_invsm_stock_amt;
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

	public void setConnect_ip(String connect_ip){
		this.connect_ip = connect_ip;
	}

	public void setConnect_userid(String connect_userid){
		this.connect_userid = connect_userid;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getMode(){
		return this.mode;
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

	public String getAdopt_dt(){
		return this.adopt_dt;
	}

	public String getDth_dt(){
		return this.dth_dt;
	}

	public String getObcl_pers_clsf(){
		return this.obcl_pers_clsf;
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

	public String getCrdt_card_tot_amt_onta(){
		return this.crdt_card_tot_amt_onta;
	}

	public String getCrdt_card_tot_amt_etc(){
		return this.crdt_card_tot_amt_etc;
	}

	public String getDebit_card_tot_amt_onta(){
		return this.debit_card_tot_amt_onta;
	}

	public String getDebit_card_tot_amt_etc(){
		return this.debit_card_tot_amt_etc;
	}

	public String getCash_rcpt_onta(){
		return this.cash_rcpt_onta;
	}

	public String getTrad_mrkt_onta(){
		return this.trad_mrkt_onta;
	}

	public String getTrad_mrkt_etc(){
		return this.trad_mrkt_etc;
	}

	public String getPublic_trans_amt_onta(){
		return this.public_trans_amt_onta;
	}

	public String getPublic_trans_amt_etc(){
		return this.public_trans_amt_etc;
	}

	public String getPrsn_pens(){
		return this.prsn_pens;
	}

	public String getPens_savg(){
		return this.pens_savg;
	}

	public String getInvsm_cmpd_invsm_amt_6(){
		return this.invsm_cmpd_invsm_amt_6;
	}

	public String getInvsm_cmpd_invsm_amt(){
		return this.invsm_cmpd_invsm_amt;
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

	public String getHous_rcpm_won_li_amt_repa(){
		return this.hous_rcpm_won_li_amt_repa;
	}

	public String getMonthly_rent_amt(){
		return this.monthly_rent_amt;
	}

	public String getHous_loan_amt_int_1(){
		return this.hous_loan_amt_int_1;
	}

	public String getLtrm_mogg_loan_amt_int_re(){
		return this.ltrm_mogg_loan_amt_int_re;
	}

	public String getHous_loan_amt_int(){
		return this.hous_loan_amt_int;
	}

	public String getHous_loan_amt_int_2012_1(){
		return this.hous_loan_amt_int_2012_1;
	}

	public String getHous_loan_amt_int_2012_2(){
		return this.hous_loan_amt_int_2012_2;
	}

	public String getLtrm_stok_savg_incm_dduc1(){
		return this.ltrm_stok_savg_incm_dduc1;
	}

	public String getLtrm_stok_savg_incm_dduc2(){
		return this.ltrm_stok_savg_incm_dduc2;
	}

	public String getLtrm_stok_savg_incm_dduc3(){
		return this.ltrm_stok_savg_incm_dduc3;
	}

	public String getLvcmpy_pens(){
		return this.lvcmpy_pens;
	}

	public String getSmallbiz_incm_dduc(){
		return this.smallbiz_incm_dduc;
	}

	public String getLarg_sum_no_lease_house(){
		return this.larg_sum_no_lease_house;
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

	public String getLtrm_invsm_stock_amt(){
		return this.ltrm_invsm_stock_amt;
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

	public String getConnect_ip(){
		return this.connect_ip;
	}

	public String getConnect_userid(){
		return this.connect_userid;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_YADJM_2016_1210_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_YADJM_2016_1210_ADM dm = (HD_YADJM_2016_1210_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.mode);
		cstmt.setString(5, dm.adjm_rvrs_yy);
		cstmt.setString(6, dm.emp_no);
		cstmt.setString(7, dm.faml_seq);
		cstmt.setString(8, dm.faml_rshp_cd);
		cstmt.setString(9, dm.faml_prn);
		cstmt.setString(10, dm.faml_flnm);
		cstmt.setString(11, dm.base_dduc_yn);
		cstmt.setString(12, dm.obcl_pers_dduc_yn);
		cstmt.setString(13, dm.fml_hshd_dduc_yn);
		cstmt.setString(14, dm.care_fee_dduc_yn);
		cstmt.setString(15, dm.one_paren_dduc_yn);
		cstmt.setString(16, dm.adopt_dt);
		cstmt.setString(17, dm.dth_dt);
		cstmt.setString(18, dm.obcl_pers_clsf);
		cstmt.setString(19, dm.edu_fee_clsf_cd);
		cstmt.setString(20, dm.edu_cost_onta);
		cstmt.setString(21, dm.edu_cost_etc);
		cstmt.setString(22, dm.edu_splen_pers_onta);
		cstmt.setString(23, dm.edu_splen_pers_etc);
		cstmt.setString(24, dm.asrc_prpn_insr_fee_onta);
		cstmt.setString(25, dm.asrc_prpn_insr_fee_etc);
		cstmt.setString(26, dm.obcl_pers_insr_onta);
		cstmt.setString(27, dm.obcl_pers_insr_etc);
		cstmt.setString(28, dm.crdt_card_tot_amt_onta);
		cstmt.setString(29, dm.crdt_card_tot_amt_etc);
		cstmt.setString(30, dm.debit_card_tot_amt_onta);
		cstmt.setString(31, dm.debit_card_tot_amt_etc);
		cstmt.setString(32, dm.cash_rcpt_onta);
		cstmt.setString(33, dm.trad_mrkt_onta);
		cstmt.setString(34, dm.trad_mrkt_etc);
		cstmt.setString(35, dm.public_trans_amt_onta);
		cstmt.setString(36, dm.public_trans_amt_etc);
		cstmt.setString(37, dm.prsn_pens);
		cstmt.setString(38, dm.pens_savg);
		cstmt.setString(39, dm.invsm_cmpd_invsm_amt_6);
		cstmt.setString(40, dm.invsm_cmpd_invsm_amt);
		cstmt.setString(41, dm.hous_subc_savg);
		cstmt.setString(42, dm.multy_house_plan_savg);
		cstmt.setString(43, dm.ltrm_hous_savg);
		cstmt.setString(44, dm.labr_hous_savg);
		cstmt.setString(45, dm.hous_rcpm_won_li_amt_repa);
		cstmt.setString(46, dm.monthly_rent_amt);
		cstmt.setString(47, dm.hous_loan_amt_int_1);
		cstmt.setString(48, dm.ltrm_mogg_loan_amt_int_re);
		cstmt.setString(49, dm.hous_loan_amt_int);
		cstmt.setString(50, dm.hous_loan_amt_int_2012_1);
		cstmt.setString(51, dm.hous_loan_amt_int_2012_2);
		cstmt.setString(52, dm.ltrm_stok_savg_incm_dduc1);
		cstmt.setString(53, dm.ltrm_stok_savg_incm_dduc2);
		cstmt.setString(54, dm.ltrm_stok_savg_incm_dduc3);
		cstmt.setString(55, dm.lvcmpy_pens);
		cstmt.setString(56, dm.smallbiz_incm_dduc);
		cstmt.setString(57, dm.larg_sum_no_lease_house);
		cstmt.setString(58, dm.debit_card_1st_amt_onta);
		cstmt.setString(59, dm.debit_card_2nd_amt_onta);
		cstmt.setString(60, dm.debit_card_1st_amt_etc);
		cstmt.setString(61, dm.debit_card_2nd_amt_etc);
		cstmt.setString(62, dm.cash_rcpt_1st_onta);
		cstmt.setString(63, dm.cash_rcpt_2nd_onta);
		cstmt.setString(64, dm.trad_all_1st_amt_onta);
		cstmt.setString(65, dm.trad_all_2nd_amt_onta);
		cstmt.setString(66, dm.trad_all_1st_amt_etc);
		cstmt.setString(67, dm.trad_all_2nd_amt_etc);
		cstmt.setString(68, dm.trans_all_1st_amt_onta);
		cstmt.setString(69, dm.trans_all_2nd_amt_onta);
		cstmt.setString(70, dm.trans_all_1st_amt_etc);
		cstmt.setString(71, dm.trans_all_2nd_amt_etc);
		cstmt.setString(72, dm.crdt_card_incd_pre_onta);
		cstmt.setString(73, dm.crdt_card_incd_pre_etc);
		cstmt.setString(74, dm.debit_card_incd_pre_onta);
		cstmt.setString(75, dm.debit_card_incd_pre_etc);
		cstmt.setString(76, dm.cash_rcpt_incd_pre_onta);
		cstmt.setString(77, dm.trad_pre_amt_onta);
		cstmt.setString(78, dm.trad_pre_amt_etc);
		cstmt.setString(79, dm.trans_pre_amt_onta);
		cstmt.setString(80, dm.trans_pre_amt_etc);
		cstmt.setString(81, dm.ltrm_invsm_stock_amt);
		cstmt.setString(82, dm.ftyr_crdt_card_onta);
		cstmt.setString(83, dm.ftyr_crdt_card_etc);
		cstmt.setString(84, dm.ftyr_debit_card_onta);
		cstmt.setString(85, dm.ftyr_debit_card_etc);
		cstmt.setString(86, dm.ftyr_cash_rcpt_onta);
		cstmt.setString(87, dm.ftyr_trad_amt_onta);
		cstmt.setString(88, dm.ftyr_trad_amt_etc);
		cstmt.setString(89, dm.ftyr_trans_amt_onta);
		cstmt.setString(90, dm.ftyr_trans_amt_etc);
		cstmt.setString(91, dm.connect_ip);
		cstmt.setString(92, dm.connect_userid);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.yadjm.ds.HD_YADJM_2016_1210_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("mode = [" + getMode() + "]");
		System.out.println("adjm_rvrs_yy = [" + getAdjm_rvrs_yy() + "]");
		System.out.println("emp_no = [" + getEmp_no() + "]");
		System.out.println("faml_seq = [" + getFaml_seq() + "]");
		System.out.println("faml_rshp_cd = [" + getFaml_rshp_cd() + "]");
		System.out.println("faml_prn = [" + getFaml_prn() + "]");
		System.out.println("faml_flnm = [" + getFaml_flnm() + "]");
		System.out.println("base_dduc_yn = [" + getBase_dduc_yn() + "]");
		System.out.println("obcl_pers_dduc_yn = [" + getObcl_pers_dduc_yn() + "]");
		System.out.println("fml_hshd_dduc_yn = [" + getFml_hshd_dduc_yn() + "]");
		System.out.println("care_fee_dduc_yn = [" + getCare_fee_dduc_yn() + "]");
		System.out.println("one_paren_dduc_yn = [" + getOne_paren_dduc_yn() + "]");
		System.out.println("adopt_dt = [" + getAdopt_dt() + "]");
		System.out.println("dth_dt = [" + getDth_dt() + "]");
		System.out.println("obcl_pers_clsf = [" + getObcl_pers_clsf() + "]");
		System.out.println("edu_fee_clsf_cd = [" + getEdu_fee_clsf_cd() + "]");
		System.out.println("edu_cost_onta = [" + getEdu_cost_onta() + "]");
		System.out.println("edu_cost_etc = [" + getEdu_cost_etc() + "]");
		System.out.println("edu_splen_pers_onta = [" + getEdu_splen_pers_onta() + "]");
		System.out.println("edu_splen_pers_etc = [" + getEdu_splen_pers_etc() + "]");
		System.out.println("asrc_prpn_insr_fee_onta = [" + getAsrc_prpn_insr_fee_onta() + "]");
		System.out.println("asrc_prpn_insr_fee_etc = [" + getAsrc_prpn_insr_fee_etc() + "]");
		System.out.println("obcl_pers_insr_onta = [" + getObcl_pers_insr_onta() + "]");
		System.out.println("obcl_pers_insr_etc = [" + getObcl_pers_insr_etc() + "]");
		System.out.println("crdt_card_tot_amt_onta = [" + getCrdt_card_tot_amt_onta() + "]");
		System.out.println("crdt_card_tot_amt_etc = [" + getCrdt_card_tot_amt_etc() + "]");
		System.out.println("debit_card_tot_amt_onta = [" + getDebit_card_tot_amt_onta() + "]");
		System.out.println("debit_card_tot_amt_etc = [" + getDebit_card_tot_amt_etc() + "]");
		System.out.println("cash_rcpt_onta = [" + getCash_rcpt_onta() + "]");
		System.out.println("trad_mrkt_onta = [" + getTrad_mrkt_onta() + "]");
		System.out.println("trad_mrkt_etc = [" + getTrad_mrkt_etc() + "]");
		System.out.println("public_trans_amt_onta = [" + getPublic_trans_amt_onta() + "]");
		System.out.println("public_trans_amt_etc = [" + getPublic_trans_amt_etc() + "]");
		System.out.println("prsn_pens = [" + getPrsn_pens() + "]");
		System.out.println("pens_savg = [" + getPens_savg() + "]");
		System.out.println("invsm_cmpd_invsm_amt_6 = [" + getInvsm_cmpd_invsm_amt_6() + "]");
		System.out.println("invsm_cmpd_invsm_amt = [" + getInvsm_cmpd_invsm_amt() + "]");
		System.out.println("hous_subc_savg = [" + getHous_subc_savg() + "]");
		System.out.println("multy_house_plan_savg = [" + getMulty_house_plan_savg() + "]");
		System.out.println("ltrm_hous_savg = [" + getLtrm_hous_savg() + "]");
		System.out.println("labr_hous_savg = [" + getLabr_hous_savg() + "]");
		System.out.println("hous_rcpm_won_li_amt_repa = [" + getHous_rcpm_won_li_amt_repa() + "]");
		System.out.println("monthly_rent_amt = [" + getMonthly_rent_amt() + "]");
		System.out.println("hous_loan_amt_int_1 = [" + getHous_loan_amt_int_1() + "]");
		System.out.println("ltrm_mogg_loan_amt_int_re = [" + getLtrm_mogg_loan_amt_int_re() + "]");
		System.out.println("hous_loan_amt_int = [" + getHous_loan_amt_int() + "]");
		System.out.println("hous_loan_amt_int_2012_1 = [" + getHous_loan_amt_int_2012_1() + "]");
		System.out.println("hous_loan_amt_int_2012_2 = [" + getHous_loan_amt_int_2012_2() + "]");
		System.out.println("ltrm_stok_savg_incm_dduc1 = [" + getLtrm_stok_savg_incm_dduc1() + "]");
		System.out.println("ltrm_stok_savg_incm_dduc2 = [" + getLtrm_stok_savg_incm_dduc2() + "]");
		System.out.println("ltrm_stok_savg_incm_dduc3 = [" + getLtrm_stok_savg_incm_dduc3() + "]");
		System.out.println("lvcmpy_pens = [" + getLvcmpy_pens() + "]");
		System.out.println("smallbiz_incm_dduc = [" + getSmallbiz_incm_dduc() + "]");
		System.out.println("larg_sum_no_lease_house = [" + getLarg_sum_no_lease_house() + "]");
		System.out.println("debit_card_1st_amt_onta = [" + getDebit_card_1st_amt_onta() + "]");
		System.out.println("debit_card_2nd_amt_onta = [" + getDebit_card_2nd_amt_onta() + "]");
		System.out.println("debit_card_1st_amt_etc = [" + getDebit_card_1st_amt_etc() + "]");
		System.out.println("debit_card_2nd_amt_etc = [" + getDebit_card_2nd_amt_etc() + "]");
		System.out.println("cash_rcpt_1st_onta = [" + getCash_rcpt_1st_onta() + "]");
		System.out.println("cash_rcpt_2nd_onta = [" + getCash_rcpt_2nd_onta() + "]");
		System.out.println("trad_all_1st_amt_onta = [" + getTrad_all_1st_amt_onta() + "]");
		System.out.println("trad_all_2nd_amt_onta = [" + getTrad_all_2nd_amt_onta() + "]");
		System.out.println("trad_all_1st_amt_etc = [" + getTrad_all_1st_amt_etc() + "]");
		System.out.println("trad_all_2nd_amt_etc = [" + getTrad_all_2nd_amt_etc() + "]");
		System.out.println("trans_all_1st_amt_onta = [" + getTrans_all_1st_amt_onta() + "]");
		System.out.println("trans_all_2nd_amt_onta = [" + getTrans_all_2nd_amt_onta() + "]");
		System.out.println("trans_all_1st_amt_etc = [" + getTrans_all_1st_amt_etc() + "]");
		System.out.println("trans_all_2nd_amt_etc = [" + getTrans_all_2nd_amt_etc() + "]");
		System.out.println("crdt_card_incd_pre_onta = [" + getCrdt_card_incd_pre_onta() + "]");
		System.out.println("crdt_card_incd_pre_etc = [" + getCrdt_card_incd_pre_etc() + "]");
		System.out.println("debit_card_incd_pre_onta = [" + getDebit_card_incd_pre_onta() + "]");
		System.out.println("debit_card_incd_pre_etc = [" + getDebit_card_incd_pre_etc() + "]");
		System.out.println("cash_rcpt_incd_pre_onta = [" + getCash_rcpt_incd_pre_onta() + "]");
		System.out.println("trad_pre_amt_onta = [" + getTrad_pre_amt_onta() + "]");
		System.out.println("trad_pre_amt_etc = [" + getTrad_pre_amt_etc() + "]");
		System.out.println("trans_pre_amt_onta = [" + getTrans_pre_amt_onta() + "]");
		System.out.println("trans_pre_amt_etc = [" + getTrans_pre_amt_etc() + "]");
		System.out.println("ltrm_invsm_stock_amt = [" + getLtrm_invsm_stock_amt() + "]");
		System.out.println("ftyr_crdt_card_onta = [" + getFtyr_crdt_card_onta() + "]");
		System.out.println("ftyr_crdt_card_etc = [" + getFtyr_crdt_card_etc() + "]");
		System.out.println("ftyr_debit_card_onta = [" + getFtyr_debit_card_onta() + "]");
		System.out.println("ftyr_debit_card_etc = [" + getFtyr_debit_card_etc() + "]");
		System.out.println("ftyr_cash_rcpt_onta = [" + getFtyr_cash_rcpt_onta() + "]");
		System.out.println("ftyr_trad_amt_onta = [" + getFtyr_trad_amt_onta() + "]");
		System.out.println("ftyr_trad_amt_etc = [" + getFtyr_trad_amt_etc() + "]");
		System.out.println("ftyr_trans_amt_onta = [" + getFtyr_trans_amt_onta() + "]");
		System.out.println("ftyr_trans_amt_etc = [" + getFtyr_trans_amt_etc() + "]");
		System.out.println("connect_ip = [" + getConnect_ip() + "]");
		System.out.println("connect_userid = [" + getConnect_userid() + "]");
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
String mode = req.getParameter("mode");
if( mode == null){
	System.out.println(this.toString+" : mode is null" );
}else{
	System.out.println(this.toString+" : mode is "+mode );
}
String adjm_rvrs_yy = req.getParameter("adjm_rvrs_yy");
if( adjm_rvrs_yy == null){
	System.out.println(this.toString+" : adjm_rvrs_yy is null" );
}else{
	System.out.println(this.toString+" : adjm_rvrs_yy is "+adjm_rvrs_yy );
}
String emp_no = req.getParameter("emp_no");
if( emp_no == null){
	System.out.println(this.toString+" : emp_no is null" );
}else{
	System.out.println(this.toString+" : emp_no is "+emp_no );
}
String faml_seq = req.getParameter("faml_seq");
if( faml_seq == null){
	System.out.println(this.toString+" : faml_seq is null" );
}else{
	System.out.println(this.toString+" : faml_seq is "+faml_seq );
}
String faml_rshp_cd = req.getParameter("faml_rshp_cd");
if( faml_rshp_cd == null){
	System.out.println(this.toString+" : faml_rshp_cd is null" );
}else{
	System.out.println(this.toString+" : faml_rshp_cd is "+faml_rshp_cd );
}
String faml_prn = req.getParameter("faml_prn");
if( faml_prn == null){
	System.out.println(this.toString+" : faml_prn is null" );
}else{
	System.out.println(this.toString+" : faml_prn is "+faml_prn );
}
String faml_flnm = req.getParameter("faml_flnm");
if( faml_flnm == null){
	System.out.println(this.toString+" : faml_flnm is null" );
}else{
	System.out.println(this.toString+" : faml_flnm is "+faml_flnm );
}
String base_dduc_yn = req.getParameter("base_dduc_yn");
if( base_dduc_yn == null){
	System.out.println(this.toString+" : base_dduc_yn is null" );
}else{
	System.out.println(this.toString+" : base_dduc_yn is "+base_dduc_yn );
}
String obcl_pers_dduc_yn = req.getParameter("obcl_pers_dduc_yn");
if( obcl_pers_dduc_yn == null){
	System.out.println(this.toString+" : obcl_pers_dduc_yn is null" );
}else{
	System.out.println(this.toString+" : obcl_pers_dduc_yn is "+obcl_pers_dduc_yn );
}
String fml_hshd_dduc_yn = req.getParameter("fml_hshd_dduc_yn");
if( fml_hshd_dduc_yn == null){
	System.out.println(this.toString+" : fml_hshd_dduc_yn is null" );
}else{
	System.out.println(this.toString+" : fml_hshd_dduc_yn is "+fml_hshd_dduc_yn );
}
String care_fee_dduc_yn = req.getParameter("care_fee_dduc_yn");
if( care_fee_dduc_yn == null){
	System.out.println(this.toString+" : care_fee_dduc_yn is null" );
}else{
	System.out.println(this.toString+" : care_fee_dduc_yn is "+care_fee_dduc_yn );
}
String one_paren_dduc_yn = req.getParameter("one_paren_dduc_yn");
if( one_paren_dduc_yn == null){
	System.out.println(this.toString+" : one_paren_dduc_yn is null" );
}else{
	System.out.println(this.toString+" : one_paren_dduc_yn is "+one_paren_dduc_yn );
}
String adopt_dt = req.getParameter("adopt_dt");
if( adopt_dt == null){
	System.out.println(this.toString+" : adopt_dt is null" );
}else{
	System.out.println(this.toString+" : adopt_dt is "+adopt_dt );
}
String dth_dt = req.getParameter("dth_dt");
if( dth_dt == null){
	System.out.println(this.toString+" : dth_dt is null" );
}else{
	System.out.println(this.toString+" : dth_dt is "+dth_dt );
}
String obcl_pers_clsf = req.getParameter("obcl_pers_clsf");
if( obcl_pers_clsf == null){
	System.out.println(this.toString+" : obcl_pers_clsf is null" );
}else{
	System.out.println(this.toString+" : obcl_pers_clsf is "+obcl_pers_clsf );
}
String edu_fee_clsf_cd = req.getParameter("edu_fee_clsf_cd");
if( edu_fee_clsf_cd == null){
	System.out.println(this.toString+" : edu_fee_clsf_cd is null" );
}else{
	System.out.println(this.toString+" : edu_fee_clsf_cd is "+edu_fee_clsf_cd );
}
String edu_cost_onta = req.getParameter("edu_cost_onta");
if( edu_cost_onta == null){
	System.out.println(this.toString+" : edu_cost_onta is null" );
}else{
	System.out.println(this.toString+" : edu_cost_onta is "+edu_cost_onta );
}
String edu_cost_etc = req.getParameter("edu_cost_etc");
if( edu_cost_etc == null){
	System.out.println(this.toString+" : edu_cost_etc is null" );
}else{
	System.out.println(this.toString+" : edu_cost_etc is "+edu_cost_etc );
}
String edu_splen_pers_onta = req.getParameter("edu_splen_pers_onta");
if( edu_splen_pers_onta == null){
	System.out.println(this.toString+" : edu_splen_pers_onta is null" );
}else{
	System.out.println(this.toString+" : edu_splen_pers_onta is "+edu_splen_pers_onta );
}
String edu_splen_pers_etc = req.getParameter("edu_splen_pers_etc");
if( edu_splen_pers_etc == null){
	System.out.println(this.toString+" : edu_splen_pers_etc is null" );
}else{
	System.out.println(this.toString+" : edu_splen_pers_etc is "+edu_splen_pers_etc );
}
String asrc_prpn_insr_fee_onta = req.getParameter("asrc_prpn_insr_fee_onta");
if( asrc_prpn_insr_fee_onta == null){
	System.out.println(this.toString+" : asrc_prpn_insr_fee_onta is null" );
}else{
	System.out.println(this.toString+" : asrc_prpn_insr_fee_onta is "+asrc_prpn_insr_fee_onta );
}
String asrc_prpn_insr_fee_etc = req.getParameter("asrc_prpn_insr_fee_etc");
if( asrc_prpn_insr_fee_etc == null){
	System.out.println(this.toString+" : asrc_prpn_insr_fee_etc is null" );
}else{
	System.out.println(this.toString+" : asrc_prpn_insr_fee_etc is "+asrc_prpn_insr_fee_etc );
}
String obcl_pers_insr_onta = req.getParameter("obcl_pers_insr_onta");
if( obcl_pers_insr_onta == null){
	System.out.println(this.toString+" : obcl_pers_insr_onta is null" );
}else{
	System.out.println(this.toString+" : obcl_pers_insr_onta is "+obcl_pers_insr_onta );
}
String obcl_pers_insr_etc = req.getParameter("obcl_pers_insr_etc");
if( obcl_pers_insr_etc == null){
	System.out.println(this.toString+" : obcl_pers_insr_etc is null" );
}else{
	System.out.println(this.toString+" : obcl_pers_insr_etc is "+obcl_pers_insr_etc );
}
String crdt_card_tot_amt_onta = req.getParameter("crdt_card_tot_amt_onta");
if( crdt_card_tot_amt_onta == null){
	System.out.println(this.toString+" : crdt_card_tot_amt_onta is null" );
}else{
	System.out.println(this.toString+" : crdt_card_tot_amt_onta is "+crdt_card_tot_amt_onta );
}
String crdt_card_tot_amt_etc = req.getParameter("crdt_card_tot_amt_etc");
if( crdt_card_tot_amt_etc == null){
	System.out.println(this.toString+" : crdt_card_tot_amt_etc is null" );
}else{
	System.out.println(this.toString+" : crdt_card_tot_amt_etc is "+crdt_card_tot_amt_etc );
}
String debit_card_tot_amt_onta = req.getParameter("debit_card_tot_amt_onta");
if( debit_card_tot_amt_onta == null){
	System.out.println(this.toString+" : debit_card_tot_amt_onta is null" );
}else{
	System.out.println(this.toString+" : debit_card_tot_amt_onta is "+debit_card_tot_amt_onta );
}
String debit_card_tot_amt_etc = req.getParameter("debit_card_tot_amt_etc");
if( debit_card_tot_amt_etc == null){
	System.out.println(this.toString+" : debit_card_tot_amt_etc is null" );
}else{
	System.out.println(this.toString+" : debit_card_tot_amt_etc is "+debit_card_tot_amt_etc );
}
String cash_rcpt_onta = req.getParameter("cash_rcpt_onta");
if( cash_rcpt_onta == null){
	System.out.println(this.toString+" : cash_rcpt_onta is null" );
}else{
	System.out.println(this.toString+" : cash_rcpt_onta is "+cash_rcpt_onta );
}
String trad_mrkt_onta = req.getParameter("trad_mrkt_onta");
if( trad_mrkt_onta == null){
	System.out.println(this.toString+" : trad_mrkt_onta is null" );
}else{
	System.out.println(this.toString+" : trad_mrkt_onta is "+trad_mrkt_onta );
}
String trad_mrkt_etc = req.getParameter("trad_mrkt_etc");
if( trad_mrkt_etc == null){
	System.out.println(this.toString+" : trad_mrkt_etc is null" );
}else{
	System.out.println(this.toString+" : trad_mrkt_etc is "+trad_mrkt_etc );
}
String public_trans_amt_onta = req.getParameter("public_trans_amt_onta");
if( public_trans_amt_onta == null){
	System.out.println(this.toString+" : public_trans_amt_onta is null" );
}else{
	System.out.println(this.toString+" : public_trans_amt_onta is "+public_trans_amt_onta );
}
String public_trans_amt_etc = req.getParameter("public_trans_amt_etc");
if( public_trans_amt_etc == null){
	System.out.println(this.toString+" : public_trans_amt_etc is null" );
}else{
	System.out.println(this.toString+" : public_trans_amt_etc is "+public_trans_amt_etc );
}
String prsn_pens = req.getParameter("prsn_pens");
if( prsn_pens == null){
	System.out.println(this.toString+" : prsn_pens is null" );
}else{
	System.out.println(this.toString+" : prsn_pens is "+prsn_pens );
}
String pens_savg = req.getParameter("pens_savg");
if( pens_savg == null){
	System.out.println(this.toString+" : pens_savg is null" );
}else{
	System.out.println(this.toString+" : pens_savg is "+pens_savg );
}
String invsm_cmpd_invsm_amt_6 = req.getParameter("invsm_cmpd_invsm_amt_6");
if( invsm_cmpd_invsm_amt_6 == null){
	System.out.println(this.toString+" : invsm_cmpd_invsm_amt_6 is null" );
}else{
	System.out.println(this.toString+" : invsm_cmpd_invsm_amt_6 is "+invsm_cmpd_invsm_amt_6 );
}
String invsm_cmpd_invsm_amt = req.getParameter("invsm_cmpd_invsm_amt");
if( invsm_cmpd_invsm_amt == null){
	System.out.println(this.toString+" : invsm_cmpd_invsm_amt is null" );
}else{
	System.out.println(this.toString+" : invsm_cmpd_invsm_amt is "+invsm_cmpd_invsm_amt );
}
String hous_subc_savg = req.getParameter("hous_subc_savg");
if( hous_subc_savg == null){
	System.out.println(this.toString+" : hous_subc_savg is null" );
}else{
	System.out.println(this.toString+" : hous_subc_savg is "+hous_subc_savg );
}
String multy_house_plan_savg = req.getParameter("multy_house_plan_savg");
if( multy_house_plan_savg == null){
	System.out.println(this.toString+" : multy_house_plan_savg is null" );
}else{
	System.out.println(this.toString+" : multy_house_plan_savg is "+multy_house_plan_savg );
}
String ltrm_hous_savg = req.getParameter("ltrm_hous_savg");
if( ltrm_hous_savg == null){
	System.out.println(this.toString+" : ltrm_hous_savg is null" );
}else{
	System.out.println(this.toString+" : ltrm_hous_savg is "+ltrm_hous_savg );
}
String labr_hous_savg = req.getParameter("labr_hous_savg");
if( labr_hous_savg == null){
	System.out.println(this.toString+" : labr_hous_savg is null" );
}else{
	System.out.println(this.toString+" : labr_hous_savg is "+labr_hous_savg );
}
String hous_rcpm_won_li_amt_repa = req.getParameter("hous_rcpm_won_li_amt_repa");
if( hous_rcpm_won_li_amt_repa == null){
	System.out.println(this.toString+" : hous_rcpm_won_li_amt_repa is null" );
}else{
	System.out.println(this.toString+" : hous_rcpm_won_li_amt_repa is "+hous_rcpm_won_li_amt_repa );
}
String monthly_rent_amt = req.getParameter("monthly_rent_amt");
if( monthly_rent_amt == null){
	System.out.println(this.toString+" : monthly_rent_amt is null" );
}else{
	System.out.println(this.toString+" : monthly_rent_amt is "+monthly_rent_amt );
}
String hous_loan_amt_int_1 = req.getParameter("hous_loan_amt_int_1");
if( hous_loan_amt_int_1 == null){
	System.out.println(this.toString+" : hous_loan_amt_int_1 is null" );
}else{
	System.out.println(this.toString+" : hous_loan_amt_int_1 is "+hous_loan_amt_int_1 );
}
String ltrm_mogg_loan_amt_int_re = req.getParameter("ltrm_mogg_loan_amt_int_re");
if( ltrm_mogg_loan_amt_int_re == null){
	System.out.println(this.toString+" : ltrm_mogg_loan_amt_int_re is null" );
}else{
	System.out.println(this.toString+" : ltrm_mogg_loan_amt_int_re is "+ltrm_mogg_loan_amt_int_re );
}
String hous_loan_amt_int = req.getParameter("hous_loan_amt_int");
if( hous_loan_amt_int == null){
	System.out.println(this.toString+" : hous_loan_amt_int is null" );
}else{
	System.out.println(this.toString+" : hous_loan_amt_int is "+hous_loan_amt_int );
}
String hous_loan_amt_int_2012_1 = req.getParameter("hous_loan_amt_int_2012_1");
if( hous_loan_amt_int_2012_1 == null){
	System.out.println(this.toString+" : hous_loan_amt_int_2012_1 is null" );
}else{
	System.out.println(this.toString+" : hous_loan_amt_int_2012_1 is "+hous_loan_amt_int_2012_1 );
}
String hous_loan_amt_int_2012_2 = req.getParameter("hous_loan_amt_int_2012_2");
if( hous_loan_amt_int_2012_2 == null){
	System.out.println(this.toString+" : hous_loan_amt_int_2012_2 is null" );
}else{
	System.out.println(this.toString+" : hous_loan_amt_int_2012_2 is "+hous_loan_amt_int_2012_2 );
}
String ltrm_stok_savg_incm_dduc1 = req.getParameter("ltrm_stok_savg_incm_dduc1");
if( ltrm_stok_savg_incm_dduc1 == null){
	System.out.println(this.toString+" : ltrm_stok_savg_incm_dduc1 is null" );
}else{
	System.out.println(this.toString+" : ltrm_stok_savg_incm_dduc1 is "+ltrm_stok_savg_incm_dduc1 );
}
String ltrm_stok_savg_incm_dduc2 = req.getParameter("ltrm_stok_savg_incm_dduc2");
if( ltrm_stok_savg_incm_dduc2 == null){
	System.out.println(this.toString+" : ltrm_stok_savg_incm_dduc2 is null" );
}else{
	System.out.println(this.toString+" : ltrm_stok_savg_incm_dduc2 is "+ltrm_stok_savg_incm_dduc2 );
}
String ltrm_stok_savg_incm_dduc3 = req.getParameter("ltrm_stok_savg_incm_dduc3");
if( ltrm_stok_savg_incm_dduc3 == null){
	System.out.println(this.toString+" : ltrm_stok_savg_incm_dduc3 is null" );
}else{
	System.out.println(this.toString+" : ltrm_stok_savg_incm_dduc3 is "+ltrm_stok_savg_incm_dduc3 );
}
String lvcmpy_pens = req.getParameter("lvcmpy_pens");
if( lvcmpy_pens == null){
	System.out.println(this.toString+" : lvcmpy_pens is null" );
}else{
	System.out.println(this.toString+" : lvcmpy_pens is "+lvcmpy_pens );
}
String smallbiz_incm_dduc = req.getParameter("smallbiz_incm_dduc");
if( smallbiz_incm_dduc == null){
	System.out.println(this.toString+" : smallbiz_incm_dduc is null" );
}else{
	System.out.println(this.toString+" : smallbiz_incm_dduc is "+smallbiz_incm_dduc );
}
String larg_sum_no_lease_house = req.getParameter("larg_sum_no_lease_house");
if( larg_sum_no_lease_house == null){
	System.out.println(this.toString+" : larg_sum_no_lease_house is null" );
}else{
	System.out.println(this.toString+" : larg_sum_no_lease_house is "+larg_sum_no_lease_house );
}
String debit_card_1st_amt_onta = req.getParameter("debit_card_1st_amt_onta");
if( debit_card_1st_amt_onta == null){
	System.out.println(this.toString+" : debit_card_1st_amt_onta is null" );
}else{
	System.out.println(this.toString+" : debit_card_1st_amt_onta is "+debit_card_1st_amt_onta );
}
String debit_card_2nd_amt_onta = req.getParameter("debit_card_2nd_amt_onta");
if( debit_card_2nd_amt_onta == null){
	System.out.println(this.toString+" : debit_card_2nd_amt_onta is null" );
}else{
	System.out.println(this.toString+" : debit_card_2nd_amt_onta is "+debit_card_2nd_amt_onta );
}
String debit_card_1st_amt_etc = req.getParameter("debit_card_1st_amt_etc");
if( debit_card_1st_amt_etc == null){
	System.out.println(this.toString+" : debit_card_1st_amt_etc is null" );
}else{
	System.out.println(this.toString+" : debit_card_1st_amt_etc is "+debit_card_1st_amt_etc );
}
String debit_card_2nd_amt_etc = req.getParameter("debit_card_2nd_amt_etc");
if( debit_card_2nd_amt_etc == null){
	System.out.println(this.toString+" : debit_card_2nd_amt_etc is null" );
}else{
	System.out.println(this.toString+" : debit_card_2nd_amt_etc is "+debit_card_2nd_amt_etc );
}
String cash_rcpt_1st_onta = req.getParameter("cash_rcpt_1st_onta");
if( cash_rcpt_1st_onta == null){
	System.out.println(this.toString+" : cash_rcpt_1st_onta is null" );
}else{
	System.out.println(this.toString+" : cash_rcpt_1st_onta is "+cash_rcpt_1st_onta );
}
String cash_rcpt_2nd_onta = req.getParameter("cash_rcpt_2nd_onta");
if( cash_rcpt_2nd_onta == null){
	System.out.println(this.toString+" : cash_rcpt_2nd_onta is null" );
}else{
	System.out.println(this.toString+" : cash_rcpt_2nd_onta is "+cash_rcpt_2nd_onta );
}
String trad_all_1st_amt_onta = req.getParameter("trad_all_1st_amt_onta");
if( trad_all_1st_amt_onta == null){
	System.out.println(this.toString+" : trad_all_1st_amt_onta is null" );
}else{
	System.out.println(this.toString+" : trad_all_1st_amt_onta is "+trad_all_1st_amt_onta );
}
String trad_all_2nd_amt_onta = req.getParameter("trad_all_2nd_amt_onta");
if( trad_all_2nd_amt_onta == null){
	System.out.println(this.toString+" : trad_all_2nd_amt_onta is null" );
}else{
	System.out.println(this.toString+" : trad_all_2nd_amt_onta is "+trad_all_2nd_amt_onta );
}
String trad_all_1st_amt_etc = req.getParameter("trad_all_1st_amt_etc");
if( trad_all_1st_amt_etc == null){
	System.out.println(this.toString+" : trad_all_1st_amt_etc is null" );
}else{
	System.out.println(this.toString+" : trad_all_1st_amt_etc is "+trad_all_1st_amt_etc );
}
String trad_all_2nd_amt_etc = req.getParameter("trad_all_2nd_amt_etc");
if( trad_all_2nd_amt_etc == null){
	System.out.println(this.toString+" : trad_all_2nd_amt_etc is null" );
}else{
	System.out.println(this.toString+" : trad_all_2nd_amt_etc is "+trad_all_2nd_amt_etc );
}
String trans_all_1st_amt_onta = req.getParameter("trans_all_1st_amt_onta");
if( trans_all_1st_amt_onta == null){
	System.out.println(this.toString+" : trans_all_1st_amt_onta is null" );
}else{
	System.out.println(this.toString+" : trans_all_1st_amt_onta is "+trans_all_1st_amt_onta );
}
String trans_all_2nd_amt_onta = req.getParameter("trans_all_2nd_amt_onta");
if( trans_all_2nd_amt_onta == null){
	System.out.println(this.toString+" : trans_all_2nd_amt_onta is null" );
}else{
	System.out.println(this.toString+" : trans_all_2nd_amt_onta is "+trans_all_2nd_amt_onta );
}
String trans_all_1st_amt_etc = req.getParameter("trans_all_1st_amt_etc");
if( trans_all_1st_amt_etc == null){
	System.out.println(this.toString+" : trans_all_1st_amt_etc is null" );
}else{
	System.out.println(this.toString+" : trans_all_1st_amt_etc is "+trans_all_1st_amt_etc );
}
String trans_all_2nd_amt_etc = req.getParameter("trans_all_2nd_amt_etc");
if( trans_all_2nd_amt_etc == null){
	System.out.println(this.toString+" : trans_all_2nd_amt_etc is null" );
}else{
	System.out.println(this.toString+" : trans_all_2nd_amt_etc is "+trans_all_2nd_amt_etc );
}
String crdt_card_incd_pre_onta = req.getParameter("crdt_card_incd_pre_onta");
if( crdt_card_incd_pre_onta == null){
	System.out.println(this.toString+" : crdt_card_incd_pre_onta is null" );
}else{
	System.out.println(this.toString+" : crdt_card_incd_pre_onta is "+crdt_card_incd_pre_onta );
}
String crdt_card_incd_pre_etc = req.getParameter("crdt_card_incd_pre_etc");
if( crdt_card_incd_pre_etc == null){
	System.out.println(this.toString+" : crdt_card_incd_pre_etc is null" );
}else{
	System.out.println(this.toString+" : crdt_card_incd_pre_etc is "+crdt_card_incd_pre_etc );
}
String debit_card_incd_pre_onta = req.getParameter("debit_card_incd_pre_onta");
if( debit_card_incd_pre_onta == null){
	System.out.println(this.toString+" : debit_card_incd_pre_onta is null" );
}else{
	System.out.println(this.toString+" : debit_card_incd_pre_onta is "+debit_card_incd_pre_onta );
}
String debit_card_incd_pre_etc = req.getParameter("debit_card_incd_pre_etc");
if( debit_card_incd_pre_etc == null){
	System.out.println(this.toString+" : debit_card_incd_pre_etc is null" );
}else{
	System.out.println(this.toString+" : debit_card_incd_pre_etc is "+debit_card_incd_pre_etc );
}
String cash_rcpt_incd_pre_onta = req.getParameter("cash_rcpt_incd_pre_onta");
if( cash_rcpt_incd_pre_onta == null){
	System.out.println(this.toString+" : cash_rcpt_incd_pre_onta is null" );
}else{
	System.out.println(this.toString+" : cash_rcpt_incd_pre_onta is "+cash_rcpt_incd_pre_onta );
}
String trad_pre_amt_onta = req.getParameter("trad_pre_amt_onta");
if( trad_pre_amt_onta == null){
	System.out.println(this.toString+" : trad_pre_amt_onta is null" );
}else{
	System.out.println(this.toString+" : trad_pre_amt_onta is "+trad_pre_amt_onta );
}
String trad_pre_amt_etc = req.getParameter("trad_pre_amt_etc");
if( trad_pre_amt_etc == null){
	System.out.println(this.toString+" : trad_pre_amt_etc is null" );
}else{
	System.out.println(this.toString+" : trad_pre_amt_etc is "+trad_pre_amt_etc );
}
String trans_pre_amt_onta = req.getParameter("trans_pre_amt_onta");
if( trans_pre_amt_onta == null){
	System.out.println(this.toString+" : trans_pre_amt_onta is null" );
}else{
	System.out.println(this.toString+" : trans_pre_amt_onta is "+trans_pre_amt_onta );
}
String trans_pre_amt_etc = req.getParameter("trans_pre_amt_etc");
if( trans_pre_amt_etc == null){
	System.out.println(this.toString+" : trans_pre_amt_etc is null" );
}else{
	System.out.println(this.toString+" : trans_pre_amt_etc is "+trans_pre_amt_etc );
}
String ltrm_invsm_stock_amt = req.getParameter("ltrm_invsm_stock_amt");
if( ltrm_invsm_stock_amt == null){
	System.out.println(this.toString+" : ltrm_invsm_stock_amt is null" );
}else{
	System.out.println(this.toString+" : ltrm_invsm_stock_amt is "+ltrm_invsm_stock_amt );
}
String ftyr_crdt_card_onta = req.getParameter("ftyr_crdt_card_onta");
if( ftyr_crdt_card_onta == null){
	System.out.println(this.toString+" : ftyr_crdt_card_onta is null" );
}else{
	System.out.println(this.toString+" : ftyr_crdt_card_onta is "+ftyr_crdt_card_onta );
}
String ftyr_crdt_card_etc = req.getParameter("ftyr_crdt_card_etc");
if( ftyr_crdt_card_etc == null){
	System.out.println(this.toString+" : ftyr_crdt_card_etc is null" );
}else{
	System.out.println(this.toString+" : ftyr_crdt_card_etc is "+ftyr_crdt_card_etc );
}
String ftyr_debit_card_onta = req.getParameter("ftyr_debit_card_onta");
if( ftyr_debit_card_onta == null){
	System.out.println(this.toString+" : ftyr_debit_card_onta is null" );
}else{
	System.out.println(this.toString+" : ftyr_debit_card_onta is "+ftyr_debit_card_onta );
}
String ftyr_debit_card_etc = req.getParameter("ftyr_debit_card_etc");
if( ftyr_debit_card_etc == null){
	System.out.println(this.toString+" : ftyr_debit_card_etc is null" );
}else{
	System.out.println(this.toString+" : ftyr_debit_card_etc is "+ftyr_debit_card_etc );
}
String ftyr_cash_rcpt_onta = req.getParameter("ftyr_cash_rcpt_onta");
if( ftyr_cash_rcpt_onta == null){
	System.out.println(this.toString+" : ftyr_cash_rcpt_onta is null" );
}else{
	System.out.println(this.toString+" : ftyr_cash_rcpt_onta is "+ftyr_cash_rcpt_onta );
}
String ftyr_trad_amt_onta = req.getParameter("ftyr_trad_amt_onta");
if( ftyr_trad_amt_onta == null){
	System.out.println(this.toString+" : ftyr_trad_amt_onta is null" );
}else{
	System.out.println(this.toString+" : ftyr_trad_amt_onta is "+ftyr_trad_amt_onta );
}
String ftyr_trad_amt_etc = req.getParameter("ftyr_trad_amt_etc");
if( ftyr_trad_amt_etc == null){
	System.out.println(this.toString+" : ftyr_trad_amt_etc is null" );
}else{
	System.out.println(this.toString+" : ftyr_trad_amt_etc is "+ftyr_trad_amt_etc );
}
String ftyr_trans_amt_onta = req.getParameter("ftyr_trans_amt_onta");
if( ftyr_trans_amt_onta == null){
	System.out.println(this.toString+" : ftyr_trans_amt_onta is null" );
}else{
	System.out.println(this.toString+" : ftyr_trans_amt_onta is "+ftyr_trans_amt_onta );
}
String ftyr_trans_amt_etc = req.getParameter("ftyr_trans_amt_etc");
if( ftyr_trans_amt_etc == null){
	System.out.println(this.toString+" : ftyr_trans_amt_etc is null" );
}else{
	System.out.println(this.toString+" : ftyr_trans_amt_etc is "+ftyr_trans_amt_etc );
}
String connect_ip = req.getParameter("connect_ip");
if( connect_ip == null){
	System.out.println(this.toString+" : connect_ip is null" );
}else{
	System.out.println(this.toString+" : connect_ip is "+connect_ip );
}
String connect_userid = req.getParameter("connect_userid");
if( connect_userid == null){
	System.out.println(this.toString+" : connect_userid is null" );
}else{
	System.out.println(this.toString+" : connect_userid is "+connect_userid );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String mode = Util.checkString(req.getParameter("mode"));
String adjm_rvrs_yy = Util.checkString(req.getParameter("adjm_rvrs_yy"));
String emp_no = Util.checkString(req.getParameter("emp_no"));
String faml_seq = Util.checkString(req.getParameter("faml_seq"));
String faml_rshp_cd = Util.checkString(req.getParameter("faml_rshp_cd"));
String faml_prn = Util.checkString(req.getParameter("faml_prn"));
String faml_flnm = Util.checkString(req.getParameter("faml_flnm"));
String base_dduc_yn = Util.checkString(req.getParameter("base_dduc_yn"));
String obcl_pers_dduc_yn = Util.checkString(req.getParameter("obcl_pers_dduc_yn"));
String fml_hshd_dduc_yn = Util.checkString(req.getParameter("fml_hshd_dduc_yn"));
String care_fee_dduc_yn = Util.checkString(req.getParameter("care_fee_dduc_yn"));
String one_paren_dduc_yn = Util.checkString(req.getParameter("one_paren_dduc_yn"));
String adopt_dt = Util.checkString(req.getParameter("adopt_dt"));
String dth_dt = Util.checkString(req.getParameter("dth_dt"));
String obcl_pers_clsf = Util.checkString(req.getParameter("obcl_pers_clsf"));
String edu_fee_clsf_cd = Util.checkString(req.getParameter("edu_fee_clsf_cd"));
String edu_cost_onta = Util.checkString(req.getParameter("edu_cost_onta"));
String edu_cost_etc = Util.checkString(req.getParameter("edu_cost_etc"));
String edu_splen_pers_onta = Util.checkString(req.getParameter("edu_splen_pers_onta"));
String edu_splen_pers_etc = Util.checkString(req.getParameter("edu_splen_pers_etc"));
String asrc_prpn_insr_fee_onta = Util.checkString(req.getParameter("asrc_prpn_insr_fee_onta"));
String asrc_prpn_insr_fee_etc = Util.checkString(req.getParameter("asrc_prpn_insr_fee_etc"));
String obcl_pers_insr_onta = Util.checkString(req.getParameter("obcl_pers_insr_onta"));
String obcl_pers_insr_etc = Util.checkString(req.getParameter("obcl_pers_insr_etc"));
String crdt_card_tot_amt_onta = Util.checkString(req.getParameter("crdt_card_tot_amt_onta"));
String crdt_card_tot_amt_etc = Util.checkString(req.getParameter("crdt_card_tot_amt_etc"));
String debit_card_tot_amt_onta = Util.checkString(req.getParameter("debit_card_tot_amt_onta"));
String debit_card_tot_amt_etc = Util.checkString(req.getParameter("debit_card_tot_amt_etc"));
String cash_rcpt_onta = Util.checkString(req.getParameter("cash_rcpt_onta"));
String trad_mrkt_onta = Util.checkString(req.getParameter("trad_mrkt_onta"));
String trad_mrkt_etc = Util.checkString(req.getParameter("trad_mrkt_etc"));
String public_trans_amt_onta = Util.checkString(req.getParameter("public_trans_amt_onta"));
String public_trans_amt_etc = Util.checkString(req.getParameter("public_trans_amt_etc"));
String prsn_pens = Util.checkString(req.getParameter("prsn_pens"));
String pens_savg = Util.checkString(req.getParameter("pens_savg"));
String invsm_cmpd_invsm_amt_6 = Util.checkString(req.getParameter("invsm_cmpd_invsm_amt_6"));
String invsm_cmpd_invsm_amt = Util.checkString(req.getParameter("invsm_cmpd_invsm_amt"));
String hous_subc_savg = Util.checkString(req.getParameter("hous_subc_savg"));
String multy_house_plan_savg = Util.checkString(req.getParameter("multy_house_plan_savg"));
String ltrm_hous_savg = Util.checkString(req.getParameter("ltrm_hous_savg"));
String labr_hous_savg = Util.checkString(req.getParameter("labr_hous_savg"));
String hous_rcpm_won_li_amt_repa = Util.checkString(req.getParameter("hous_rcpm_won_li_amt_repa"));
String monthly_rent_amt = Util.checkString(req.getParameter("monthly_rent_amt"));
String hous_loan_amt_int_1 = Util.checkString(req.getParameter("hous_loan_amt_int_1"));
String ltrm_mogg_loan_amt_int_re = Util.checkString(req.getParameter("ltrm_mogg_loan_amt_int_re"));
String hous_loan_amt_int = Util.checkString(req.getParameter("hous_loan_amt_int"));
String hous_loan_amt_int_2012_1 = Util.checkString(req.getParameter("hous_loan_amt_int_2012_1"));
String hous_loan_amt_int_2012_2 = Util.checkString(req.getParameter("hous_loan_amt_int_2012_2"));
String ltrm_stok_savg_incm_dduc1 = Util.checkString(req.getParameter("ltrm_stok_savg_incm_dduc1"));
String ltrm_stok_savg_incm_dduc2 = Util.checkString(req.getParameter("ltrm_stok_savg_incm_dduc2"));
String ltrm_stok_savg_incm_dduc3 = Util.checkString(req.getParameter("ltrm_stok_savg_incm_dduc3"));
String lvcmpy_pens = Util.checkString(req.getParameter("lvcmpy_pens"));
String smallbiz_incm_dduc = Util.checkString(req.getParameter("smallbiz_incm_dduc"));
String larg_sum_no_lease_house = Util.checkString(req.getParameter("larg_sum_no_lease_house"));
String debit_card_1st_amt_onta = Util.checkString(req.getParameter("debit_card_1st_amt_onta"));
String debit_card_2nd_amt_onta = Util.checkString(req.getParameter("debit_card_2nd_amt_onta"));
String debit_card_1st_amt_etc = Util.checkString(req.getParameter("debit_card_1st_amt_etc"));
String debit_card_2nd_amt_etc = Util.checkString(req.getParameter("debit_card_2nd_amt_etc"));
String cash_rcpt_1st_onta = Util.checkString(req.getParameter("cash_rcpt_1st_onta"));
String cash_rcpt_2nd_onta = Util.checkString(req.getParameter("cash_rcpt_2nd_onta"));
String trad_all_1st_amt_onta = Util.checkString(req.getParameter("trad_all_1st_amt_onta"));
String trad_all_2nd_amt_onta = Util.checkString(req.getParameter("trad_all_2nd_amt_onta"));
String trad_all_1st_amt_etc = Util.checkString(req.getParameter("trad_all_1st_amt_etc"));
String trad_all_2nd_amt_etc = Util.checkString(req.getParameter("trad_all_2nd_amt_etc"));
String trans_all_1st_amt_onta = Util.checkString(req.getParameter("trans_all_1st_amt_onta"));
String trans_all_2nd_amt_onta = Util.checkString(req.getParameter("trans_all_2nd_amt_onta"));
String trans_all_1st_amt_etc = Util.checkString(req.getParameter("trans_all_1st_amt_etc"));
String trans_all_2nd_amt_etc = Util.checkString(req.getParameter("trans_all_2nd_amt_etc"));
String crdt_card_incd_pre_onta = Util.checkString(req.getParameter("crdt_card_incd_pre_onta"));
String crdt_card_incd_pre_etc = Util.checkString(req.getParameter("crdt_card_incd_pre_etc"));
String debit_card_incd_pre_onta = Util.checkString(req.getParameter("debit_card_incd_pre_onta"));
String debit_card_incd_pre_etc = Util.checkString(req.getParameter("debit_card_incd_pre_etc"));
String cash_rcpt_incd_pre_onta = Util.checkString(req.getParameter("cash_rcpt_incd_pre_onta"));
String trad_pre_amt_onta = Util.checkString(req.getParameter("trad_pre_amt_onta"));
String trad_pre_amt_etc = Util.checkString(req.getParameter("trad_pre_amt_etc"));
String trans_pre_amt_onta = Util.checkString(req.getParameter("trans_pre_amt_onta"));
String trans_pre_amt_etc = Util.checkString(req.getParameter("trans_pre_amt_etc"));
String ltrm_invsm_stock_amt = Util.checkString(req.getParameter("ltrm_invsm_stock_amt"));
String ftyr_crdt_card_onta = Util.checkString(req.getParameter("ftyr_crdt_card_onta"));
String ftyr_crdt_card_etc = Util.checkString(req.getParameter("ftyr_crdt_card_etc"));
String ftyr_debit_card_onta = Util.checkString(req.getParameter("ftyr_debit_card_onta"));
String ftyr_debit_card_etc = Util.checkString(req.getParameter("ftyr_debit_card_etc"));
String ftyr_cash_rcpt_onta = Util.checkString(req.getParameter("ftyr_cash_rcpt_onta"));
String ftyr_trad_amt_onta = Util.checkString(req.getParameter("ftyr_trad_amt_onta"));
String ftyr_trad_amt_etc = Util.checkString(req.getParameter("ftyr_trad_amt_etc"));
String ftyr_trans_amt_onta = Util.checkString(req.getParameter("ftyr_trans_amt_onta"));
String ftyr_trans_amt_etc = Util.checkString(req.getParameter("ftyr_trans_amt_etc"));
String connect_ip = Util.checkString(req.getParameter("connect_ip"));
String connect_userid = Util.checkString(req.getParameter("connect_userid"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
String adjm_rvrs_yy = Util.Uni2Ksc(Util.checkString(req.getParameter("adjm_rvrs_yy")));
String emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_no")));
String faml_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("faml_seq")));
String faml_rshp_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("faml_rshp_cd")));
String faml_prn = Util.Uni2Ksc(Util.checkString(req.getParameter("faml_prn")));
String faml_flnm = Util.Uni2Ksc(Util.checkString(req.getParameter("faml_flnm")));
String base_dduc_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("base_dduc_yn")));
String obcl_pers_dduc_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("obcl_pers_dduc_yn")));
String fml_hshd_dduc_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("fml_hshd_dduc_yn")));
String care_fee_dduc_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("care_fee_dduc_yn")));
String one_paren_dduc_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("one_paren_dduc_yn")));
String adopt_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("adopt_dt")));
String dth_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("dth_dt")));
String obcl_pers_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("obcl_pers_clsf")));
String edu_fee_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("edu_fee_clsf_cd")));
String edu_cost_onta = Util.Uni2Ksc(Util.checkString(req.getParameter("edu_cost_onta")));
String edu_cost_etc = Util.Uni2Ksc(Util.checkString(req.getParameter("edu_cost_etc")));
String edu_splen_pers_onta = Util.Uni2Ksc(Util.checkString(req.getParameter("edu_splen_pers_onta")));
String edu_splen_pers_etc = Util.Uni2Ksc(Util.checkString(req.getParameter("edu_splen_pers_etc")));
String asrc_prpn_insr_fee_onta = Util.Uni2Ksc(Util.checkString(req.getParameter("asrc_prpn_insr_fee_onta")));
String asrc_prpn_insr_fee_etc = Util.Uni2Ksc(Util.checkString(req.getParameter("asrc_prpn_insr_fee_etc")));
String obcl_pers_insr_onta = Util.Uni2Ksc(Util.checkString(req.getParameter("obcl_pers_insr_onta")));
String obcl_pers_insr_etc = Util.Uni2Ksc(Util.checkString(req.getParameter("obcl_pers_insr_etc")));
String crdt_card_tot_amt_onta = Util.Uni2Ksc(Util.checkString(req.getParameter("crdt_card_tot_amt_onta")));
String crdt_card_tot_amt_etc = Util.Uni2Ksc(Util.checkString(req.getParameter("crdt_card_tot_amt_etc")));
String debit_card_tot_amt_onta = Util.Uni2Ksc(Util.checkString(req.getParameter("debit_card_tot_amt_onta")));
String debit_card_tot_amt_etc = Util.Uni2Ksc(Util.checkString(req.getParameter("debit_card_tot_amt_etc")));
String cash_rcpt_onta = Util.Uni2Ksc(Util.checkString(req.getParameter("cash_rcpt_onta")));
String trad_mrkt_onta = Util.Uni2Ksc(Util.checkString(req.getParameter("trad_mrkt_onta")));
String trad_mrkt_etc = Util.Uni2Ksc(Util.checkString(req.getParameter("trad_mrkt_etc")));
String public_trans_amt_onta = Util.Uni2Ksc(Util.checkString(req.getParameter("public_trans_amt_onta")));
String public_trans_amt_etc = Util.Uni2Ksc(Util.checkString(req.getParameter("public_trans_amt_etc")));
String prsn_pens = Util.Uni2Ksc(Util.checkString(req.getParameter("prsn_pens")));
String pens_savg = Util.Uni2Ksc(Util.checkString(req.getParameter("pens_savg")));
String invsm_cmpd_invsm_amt_6 = Util.Uni2Ksc(Util.checkString(req.getParameter("invsm_cmpd_invsm_amt_6")));
String invsm_cmpd_invsm_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("invsm_cmpd_invsm_amt")));
String hous_subc_savg = Util.Uni2Ksc(Util.checkString(req.getParameter("hous_subc_savg")));
String multy_house_plan_savg = Util.Uni2Ksc(Util.checkString(req.getParameter("multy_house_plan_savg")));
String ltrm_hous_savg = Util.Uni2Ksc(Util.checkString(req.getParameter("ltrm_hous_savg")));
String labr_hous_savg = Util.Uni2Ksc(Util.checkString(req.getParameter("labr_hous_savg")));
String hous_rcpm_won_li_amt_repa = Util.Uni2Ksc(Util.checkString(req.getParameter("hous_rcpm_won_li_amt_repa")));
String monthly_rent_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("monthly_rent_amt")));
String hous_loan_amt_int_1 = Util.Uni2Ksc(Util.checkString(req.getParameter("hous_loan_amt_int_1")));
String ltrm_mogg_loan_amt_int_re = Util.Uni2Ksc(Util.checkString(req.getParameter("ltrm_mogg_loan_amt_int_re")));
String hous_loan_amt_int = Util.Uni2Ksc(Util.checkString(req.getParameter("hous_loan_amt_int")));
String hous_loan_amt_int_2012_1 = Util.Uni2Ksc(Util.checkString(req.getParameter("hous_loan_amt_int_2012_1")));
String hous_loan_amt_int_2012_2 = Util.Uni2Ksc(Util.checkString(req.getParameter("hous_loan_amt_int_2012_2")));
String ltrm_stok_savg_incm_dduc1 = Util.Uni2Ksc(Util.checkString(req.getParameter("ltrm_stok_savg_incm_dduc1")));
String ltrm_stok_savg_incm_dduc2 = Util.Uni2Ksc(Util.checkString(req.getParameter("ltrm_stok_savg_incm_dduc2")));
String ltrm_stok_savg_incm_dduc3 = Util.Uni2Ksc(Util.checkString(req.getParameter("ltrm_stok_savg_incm_dduc3")));
String lvcmpy_pens = Util.Uni2Ksc(Util.checkString(req.getParameter("lvcmpy_pens")));
String smallbiz_incm_dduc = Util.Uni2Ksc(Util.checkString(req.getParameter("smallbiz_incm_dduc")));
String larg_sum_no_lease_house = Util.Uni2Ksc(Util.checkString(req.getParameter("larg_sum_no_lease_house")));
String debit_card_1st_amt_onta = Util.Uni2Ksc(Util.checkString(req.getParameter("debit_card_1st_amt_onta")));
String debit_card_2nd_amt_onta = Util.Uni2Ksc(Util.checkString(req.getParameter("debit_card_2nd_amt_onta")));
String debit_card_1st_amt_etc = Util.Uni2Ksc(Util.checkString(req.getParameter("debit_card_1st_amt_etc")));
String debit_card_2nd_amt_etc = Util.Uni2Ksc(Util.checkString(req.getParameter("debit_card_2nd_amt_etc")));
String cash_rcpt_1st_onta = Util.Uni2Ksc(Util.checkString(req.getParameter("cash_rcpt_1st_onta")));
String cash_rcpt_2nd_onta = Util.Uni2Ksc(Util.checkString(req.getParameter("cash_rcpt_2nd_onta")));
String trad_all_1st_amt_onta = Util.Uni2Ksc(Util.checkString(req.getParameter("trad_all_1st_amt_onta")));
String trad_all_2nd_amt_onta = Util.Uni2Ksc(Util.checkString(req.getParameter("trad_all_2nd_amt_onta")));
String trad_all_1st_amt_etc = Util.Uni2Ksc(Util.checkString(req.getParameter("trad_all_1st_amt_etc")));
String trad_all_2nd_amt_etc = Util.Uni2Ksc(Util.checkString(req.getParameter("trad_all_2nd_amt_etc")));
String trans_all_1st_amt_onta = Util.Uni2Ksc(Util.checkString(req.getParameter("trans_all_1st_amt_onta")));
String trans_all_2nd_amt_onta = Util.Uni2Ksc(Util.checkString(req.getParameter("trans_all_2nd_amt_onta")));
String trans_all_1st_amt_etc = Util.Uni2Ksc(Util.checkString(req.getParameter("trans_all_1st_amt_etc")));
String trans_all_2nd_amt_etc = Util.Uni2Ksc(Util.checkString(req.getParameter("trans_all_2nd_amt_etc")));
String crdt_card_incd_pre_onta = Util.Uni2Ksc(Util.checkString(req.getParameter("crdt_card_incd_pre_onta")));
String crdt_card_incd_pre_etc = Util.Uni2Ksc(Util.checkString(req.getParameter("crdt_card_incd_pre_etc")));
String debit_card_incd_pre_onta = Util.Uni2Ksc(Util.checkString(req.getParameter("debit_card_incd_pre_onta")));
String debit_card_incd_pre_etc = Util.Uni2Ksc(Util.checkString(req.getParameter("debit_card_incd_pre_etc")));
String cash_rcpt_incd_pre_onta = Util.Uni2Ksc(Util.checkString(req.getParameter("cash_rcpt_incd_pre_onta")));
String trad_pre_amt_onta = Util.Uni2Ksc(Util.checkString(req.getParameter("trad_pre_amt_onta")));
String trad_pre_amt_etc = Util.Uni2Ksc(Util.checkString(req.getParameter("trad_pre_amt_etc")));
String trans_pre_amt_onta = Util.Uni2Ksc(Util.checkString(req.getParameter("trans_pre_amt_onta")));
String trans_pre_amt_etc = Util.Uni2Ksc(Util.checkString(req.getParameter("trans_pre_amt_etc")));
String ltrm_invsm_stock_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("ltrm_invsm_stock_amt")));
String ftyr_crdt_card_onta = Util.Uni2Ksc(Util.checkString(req.getParameter("ftyr_crdt_card_onta")));
String ftyr_crdt_card_etc = Util.Uni2Ksc(Util.checkString(req.getParameter("ftyr_crdt_card_etc")));
String ftyr_debit_card_onta = Util.Uni2Ksc(Util.checkString(req.getParameter("ftyr_debit_card_onta")));
String ftyr_debit_card_etc = Util.Uni2Ksc(Util.checkString(req.getParameter("ftyr_debit_card_etc")));
String ftyr_cash_rcpt_onta = Util.Uni2Ksc(Util.checkString(req.getParameter("ftyr_cash_rcpt_onta")));
String ftyr_trad_amt_onta = Util.Uni2Ksc(Util.checkString(req.getParameter("ftyr_trad_amt_onta")));
String ftyr_trad_amt_etc = Util.Uni2Ksc(Util.checkString(req.getParameter("ftyr_trad_amt_etc")));
String ftyr_trans_amt_onta = Util.Uni2Ksc(Util.checkString(req.getParameter("ftyr_trans_amt_onta")));
String ftyr_trans_amt_etc = Util.Uni2Ksc(Util.checkString(req.getParameter("ftyr_trans_amt_etc")));
String connect_ip = Util.Uni2Ksc(Util.checkString(req.getParameter("connect_ip")));
String connect_userid = Util.Uni2Ksc(Util.checkString(req.getParameter("connect_userid")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setMode(mode);
dm.setAdjm_rvrs_yy(adjm_rvrs_yy);
dm.setEmp_no(emp_no);
dm.setFaml_seq(faml_seq);
dm.setFaml_rshp_cd(faml_rshp_cd);
dm.setFaml_prn(faml_prn);
dm.setFaml_flnm(faml_flnm);
dm.setBase_dduc_yn(base_dduc_yn);
dm.setObcl_pers_dduc_yn(obcl_pers_dduc_yn);
dm.setFml_hshd_dduc_yn(fml_hshd_dduc_yn);
dm.setCare_fee_dduc_yn(care_fee_dduc_yn);
dm.setOne_paren_dduc_yn(one_paren_dduc_yn);
dm.setAdopt_dt(adopt_dt);
dm.setDth_dt(dth_dt);
dm.setObcl_pers_clsf(obcl_pers_clsf);
dm.setEdu_fee_clsf_cd(edu_fee_clsf_cd);
dm.setEdu_cost_onta(edu_cost_onta);
dm.setEdu_cost_etc(edu_cost_etc);
dm.setEdu_splen_pers_onta(edu_splen_pers_onta);
dm.setEdu_splen_pers_etc(edu_splen_pers_etc);
dm.setAsrc_prpn_insr_fee_onta(asrc_prpn_insr_fee_onta);
dm.setAsrc_prpn_insr_fee_etc(asrc_prpn_insr_fee_etc);
dm.setObcl_pers_insr_onta(obcl_pers_insr_onta);
dm.setObcl_pers_insr_etc(obcl_pers_insr_etc);
dm.setCrdt_card_tot_amt_onta(crdt_card_tot_amt_onta);
dm.setCrdt_card_tot_amt_etc(crdt_card_tot_amt_etc);
dm.setDebit_card_tot_amt_onta(debit_card_tot_amt_onta);
dm.setDebit_card_tot_amt_etc(debit_card_tot_amt_etc);
dm.setCash_rcpt_onta(cash_rcpt_onta);
dm.setTrad_mrkt_onta(trad_mrkt_onta);
dm.setTrad_mrkt_etc(trad_mrkt_etc);
dm.setPublic_trans_amt_onta(public_trans_amt_onta);
dm.setPublic_trans_amt_etc(public_trans_amt_etc);
dm.setPrsn_pens(prsn_pens);
dm.setPens_savg(pens_savg);
dm.setInvsm_cmpd_invsm_amt_6(invsm_cmpd_invsm_amt_6);
dm.setInvsm_cmpd_invsm_amt(invsm_cmpd_invsm_amt);
dm.setHous_subc_savg(hous_subc_savg);
dm.setMulty_house_plan_savg(multy_house_plan_savg);
dm.setLtrm_hous_savg(ltrm_hous_savg);
dm.setLabr_hous_savg(labr_hous_savg);
dm.setHous_rcpm_won_li_amt_repa(hous_rcpm_won_li_amt_repa);
dm.setMonthly_rent_amt(monthly_rent_amt);
dm.setHous_loan_amt_int_1(hous_loan_amt_int_1);
dm.setLtrm_mogg_loan_amt_int_re(ltrm_mogg_loan_amt_int_re);
dm.setHous_loan_amt_int(hous_loan_amt_int);
dm.setHous_loan_amt_int_2012_1(hous_loan_amt_int_2012_1);
dm.setHous_loan_amt_int_2012_2(hous_loan_amt_int_2012_2);
dm.setLtrm_stok_savg_incm_dduc1(ltrm_stok_savg_incm_dduc1);
dm.setLtrm_stok_savg_incm_dduc2(ltrm_stok_savg_incm_dduc2);
dm.setLtrm_stok_savg_incm_dduc3(ltrm_stok_savg_incm_dduc3);
dm.setLvcmpy_pens(lvcmpy_pens);
dm.setSmallbiz_incm_dduc(smallbiz_incm_dduc);
dm.setLarg_sum_no_lease_house(larg_sum_no_lease_house);
dm.setDebit_card_1st_amt_onta(debit_card_1st_amt_onta);
dm.setDebit_card_2nd_amt_onta(debit_card_2nd_amt_onta);
dm.setDebit_card_1st_amt_etc(debit_card_1st_amt_etc);
dm.setDebit_card_2nd_amt_etc(debit_card_2nd_amt_etc);
dm.setCash_rcpt_1st_onta(cash_rcpt_1st_onta);
dm.setCash_rcpt_2nd_onta(cash_rcpt_2nd_onta);
dm.setTrad_all_1st_amt_onta(trad_all_1st_amt_onta);
dm.setTrad_all_2nd_amt_onta(trad_all_2nd_amt_onta);
dm.setTrad_all_1st_amt_etc(trad_all_1st_amt_etc);
dm.setTrad_all_2nd_amt_etc(trad_all_2nd_amt_etc);
dm.setTrans_all_1st_amt_onta(trans_all_1st_amt_onta);
dm.setTrans_all_2nd_amt_onta(trans_all_2nd_amt_onta);
dm.setTrans_all_1st_amt_etc(trans_all_1st_amt_etc);
dm.setTrans_all_2nd_amt_etc(trans_all_2nd_amt_etc);
dm.setCrdt_card_incd_pre_onta(crdt_card_incd_pre_onta);
dm.setCrdt_card_incd_pre_etc(crdt_card_incd_pre_etc);
dm.setDebit_card_incd_pre_onta(debit_card_incd_pre_onta);
dm.setDebit_card_incd_pre_etc(debit_card_incd_pre_etc);
dm.setCash_rcpt_incd_pre_onta(cash_rcpt_incd_pre_onta);
dm.setTrad_pre_amt_onta(trad_pre_amt_onta);
dm.setTrad_pre_amt_etc(trad_pre_amt_etc);
dm.setTrans_pre_amt_onta(trans_pre_amt_onta);
dm.setTrans_pre_amt_etc(trans_pre_amt_etc);
dm.setLtrm_invsm_stock_amt(ltrm_invsm_stock_amt);
dm.setFtyr_crdt_card_onta(ftyr_crdt_card_onta);
dm.setFtyr_crdt_card_etc(ftyr_crdt_card_etc);
dm.setFtyr_debit_card_onta(ftyr_debit_card_onta);
dm.setFtyr_debit_card_etc(ftyr_debit_card_etc);
dm.setFtyr_cash_rcpt_onta(ftyr_cash_rcpt_onta);
dm.setFtyr_trad_amt_onta(ftyr_trad_amt_onta);
dm.setFtyr_trad_amt_etc(ftyr_trad_amt_etc);
dm.setFtyr_trans_amt_onta(ftyr_trans_amt_onta);
dm.setFtyr_trans_amt_etc(ftyr_trans_amt_etc);
dm.setConnect_ip(connect_ip);
dm.setConnect_userid(connect_userid);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Dec 18 15:07:15 KST 2015 */
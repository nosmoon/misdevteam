/***************************************************************************************************
* 파일명 : .java
* 기능 : 
* 작성일자 :
* 작성자 :
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.hd.saly.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.saly.ds.*;
import chosun.ciis.hd.saly.rec.*;

/**
 * 
 */


public class HD_SALY_3331_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String mode;
	public String cmpy_cd;
	public String emp_no;
	public String saly_yy;
	public String saly_no;
	public String flnm;
	public String saly_clsf;
	public String saly_pay_dt;
	public String dept_cd;
	public String base_saly;
	public String evngt_saly;
	public String supl_saly;
	public String posk_saly;
	public String rgla_saly;
	public String real_pay_rgla_saly;
	public String week_hody_base_alon;
	public String week_hody_cmpn_alon;
	public String lgl_hody_base_alon;
	public String lgl_hody_cmpn_alon;
	public String nissu_dd_alon;
	public String vgl_fee;
	public String non_regu_alon_stot;
	public String tot_pay_saly;
	public String non_tax_yn_frnc;
	public String non_tax_frnc;
	public String non_tax_yn_jrnst;
	public String non_tax_jrnst;
	public String non_tax_stot;
	public String impt_saly;
	public String labr_incm_dduc;
	public String labr_incm_amt;
	public String base_dduc_slf;
	public String base_dduc_spos;
	public String base_dduc_child;
	public String base_dduc_oldg;
	public String addm_dduc_rspc;
	public String addm_dduc_obcl_pers;
	public String addm_dduc_fml_hshd;
	public String addm_dduc_care_fee;
	public String addm_dduc_sml_num_dduc_pers;
	public String addm_dduc_etc;
	public String boks_qunt_faml_dduc_stot;
	public String txn_std_amt;
	public String calc_incm_tax;
	public String tax_amt_dduc_labr_incm;
	public String tax_amt_dduc_forn_pymt;
	public String tax_amt_dduc_hous_loan_amt;
	public String tax_amt_dduc_stok_savg;
	public String tax_amt_dduc_savg;
	public String tax_amt_dduc_hous_fund;
	public String tax_amt_dduc_etc;
	public String tax_amt_dduc_stot;
	public String deci_incm_tax;
	public String deci_res_tax;
	public String adjm_dedu_incm_tax;
	public String adjm_dedu_res_tax;
	public String np_slf_ctrb_amt;
	public String np_cmpy_burd_amt;
	public String hlth_insr_fee;
	public String hlth_insr_med_care_insr_fee;
	public String emp_insr_fee;
	public String cal_pay_amt;
	public String incmg_pers_ipadd;

	public HD_SALY_3331_ADM(){}
	public HD_SALY_3331_ADM(String mode, String cmpy_cd, String emp_no, String saly_yy, String saly_no, String flnm, String saly_clsf, String saly_pay_dt, String dept_cd, String base_saly, String evngt_saly, String supl_saly, String posk_saly, String rgla_saly, String real_pay_rgla_saly, String week_hody_base_alon, String week_hody_cmpn_alon, String lgl_hody_base_alon, String lgl_hody_cmpn_alon, String nissu_dd_alon, String vgl_fee, String non_regu_alon_stot, String tot_pay_saly, String non_tax_yn_frnc, String non_tax_frnc, String non_tax_yn_jrnst, String non_tax_jrnst, String non_tax_stot, String impt_saly, String labr_incm_dduc, String labr_incm_amt, String base_dduc_slf, String base_dduc_spos, String base_dduc_child, String base_dduc_oldg, String addm_dduc_rspc, String addm_dduc_obcl_pers, String addm_dduc_fml_hshd, String addm_dduc_care_fee, String addm_dduc_sml_num_dduc_pers, String addm_dduc_etc, String boks_qunt_faml_dduc_stot, String txn_std_amt, String calc_incm_tax, String tax_amt_dduc_labr_incm, String tax_amt_dduc_forn_pymt, String tax_amt_dduc_hous_loan_amt, String tax_amt_dduc_stok_savg, String tax_amt_dduc_savg, String tax_amt_dduc_hous_fund, String tax_amt_dduc_etc, String tax_amt_dduc_stot, String deci_incm_tax, String deci_res_tax, String adjm_dedu_incm_tax, String adjm_dedu_res_tax, String np_slf_ctrb_amt, String np_cmpy_burd_amt, String hlth_insr_fee, String hlth_insr_med_care_insr_fee, String emp_insr_fee, String cal_pay_amt, String incmg_pers_ipadd){
		this.mode = mode;
		this.cmpy_cd = cmpy_cd;
		this.emp_no = emp_no;
		this.saly_yy = saly_yy;
		this.saly_no = saly_no;
		this.flnm = flnm;
		this.saly_clsf = saly_clsf;
		this.saly_pay_dt = saly_pay_dt;
		this.dept_cd = dept_cd;
		this.base_saly = base_saly;
		this.evngt_saly = evngt_saly;
		this.supl_saly = supl_saly;
		this.posk_saly = posk_saly;
		this.rgla_saly = rgla_saly;
		this.real_pay_rgla_saly = real_pay_rgla_saly;
		this.week_hody_base_alon = week_hody_base_alon;
		this.week_hody_cmpn_alon = week_hody_cmpn_alon;
		this.lgl_hody_base_alon = lgl_hody_base_alon;
		this.lgl_hody_cmpn_alon = lgl_hody_cmpn_alon;
		this.nissu_dd_alon = nissu_dd_alon;
		this.vgl_fee = vgl_fee;
		this.non_regu_alon_stot = non_regu_alon_stot;
		this.tot_pay_saly = tot_pay_saly;
		this.non_tax_yn_frnc = non_tax_yn_frnc;
		this.non_tax_frnc = non_tax_frnc;
		this.non_tax_yn_jrnst = non_tax_yn_jrnst;
		this.non_tax_jrnst = non_tax_jrnst;
		this.non_tax_stot = non_tax_stot;
		this.impt_saly = impt_saly;
		this.labr_incm_dduc = labr_incm_dduc;
		this.labr_incm_amt = labr_incm_amt;
		this.base_dduc_slf = base_dduc_slf;
		this.base_dduc_spos = base_dduc_spos;
		this.base_dduc_child = base_dduc_child;
		this.base_dduc_oldg = base_dduc_oldg;
		this.addm_dduc_rspc = addm_dduc_rspc;
		this.addm_dduc_obcl_pers = addm_dduc_obcl_pers;
		this.addm_dduc_fml_hshd = addm_dduc_fml_hshd;
		this.addm_dduc_care_fee = addm_dduc_care_fee;
		this.addm_dduc_sml_num_dduc_pers = addm_dduc_sml_num_dduc_pers;
		this.addm_dduc_etc = addm_dduc_etc;
		this.boks_qunt_faml_dduc_stot = boks_qunt_faml_dduc_stot;
		this.txn_std_amt = txn_std_amt;
		this.calc_incm_tax = calc_incm_tax;
		this.tax_amt_dduc_labr_incm = tax_amt_dduc_labr_incm;
		this.tax_amt_dduc_forn_pymt = tax_amt_dduc_forn_pymt;
		this.tax_amt_dduc_hous_loan_amt = tax_amt_dduc_hous_loan_amt;
		this.tax_amt_dduc_stok_savg = tax_amt_dduc_stok_savg;
		this.tax_amt_dduc_savg = tax_amt_dduc_savg;
		this.tax_amt_dduc_hous_fund = tax_amt_dduc_hous_fund;
		this.tax_amt_dduc_etc = tax_amt_dduc_etc;
		this.tax_amt_dduc_stot = tax_amt_dduc_stot;
		this.deci_incm_tax = deci_incm_tax;
		this.deci_res_tax = deci_res_tax;
		this.adjm_dedu_incm_tax = adjm_dedu_incm_tax;
		this.adjm_dedu_res_tax = adjm_dedu_res_tax;
		this.np_slf_ctrb_amt = np_slf_ctrb_amt;
		this.np_cmpy_burd_amt = np_cmpy_burd_amt;
		this.hlth_insr_fee = hlth_insr_fee;
		this.hlth_insr_med_care_insr_fee = hlth_insr_med_care_insr_fee;
		this.emp_insr_fee = emp_insr_fee;
		this.cal_pay_amt = cal_pay_amt;
		this.incmg_pers_ipadd = incmg_pers_ipadd;
	}

	public void setMode(String mode){
		this.mode = mode;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setSaly_yy(String saly_yy){
		this.saly_yy = saly_yy;
	}

	public void setSaly_no(String saly_no){
		this.saly_no = saly_no;
	}

	public void setFlnm(String flnm){
		this.flnm = flnm;
	}

	public void setSaly_clsf(String saly_clsf){
		this.saly_clsf = saly_clsf;
	}

	public void setSaly_pay_dt(String saly_pay_dt){
		this.saly_pay_dt = saly_pay_dt;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setBase_saly(String base_saly){
		this.base_saly = base_saly;
	}

	public void setEvngt_saly(String evngt_saly){
		this.evngt_saly = evngt_saly;
	}

	public void setSupl_saly(String supl_saly){
		this.supl_saly = supl_saly;
	}

	public void setPosk_saly(String posk_saly){
		this.posk_saly = posk_saly;
	}

	public void setRgla_saly(String rgla_saly){
		this.rgla_saly = rgla_saly;
	}

	public void setReal_pay_rgla_saly(String real_pay_rgla_saly){
		this.real_pay_rgla_saly = real_pay_rgla_saly;
	}

	public void setWeek_hody_base_alon(String week_hody_base_alon){
		this.week_hody_base_alon = week_hody_base_alon;
	}

	public void setWeek_hody_cmpn_alon(String week_hody_cmpn_alon){
		this.week_hody_cmpn_alon = week_hody_cmpn_alon;
	}

	public void setLgl_hody_base_alon(String lgl_hody_base_alon){
		this.lgl_hody_base_alon = lgl_hody_base_alon;
	}

	public void setLgl_hody_cmpn_alon(String lgl_hody_cmpn_alon){
		this.lgl_hody_cmpn_alon = lgl_hody_cmpn_alon;
	}

	public void setNissu_dd_alon(String nissu_dd_alon){
		this.nissu_dd_alon = nissu_dd_alon;
	}

	public void setVgl_fee(String vgl_fee){
		this.vgl_fee = vgl_fee;
	}

	public void setNon_regu_alon_stot(String non_regu_alon_stot){
		this.non_regu_alon_stot = non_regu_alon_stot;
	}

	public void setTot_pay_saly(String tot_pay_saly){
		this.tot_pay_saly = tot_pay_saly;
	}

	public void setNon_tax_yn_frnc(String non_tax_yn_frnc){
		this.non_tax_yn_frnc = non_tax_yn_frnc;
	}

	public void setNon_tax_frnc(String non_tax_frnc){
		this.non_tax_frnc = non_tax_frnc;
	}

	public void setNon_tax_yn_jrnst(String non_tax_yn_jrnst){
		this.non_tax_yn_jrnst = non_tax_yn_jrnst;
	}

	public void setNon_tax_jrnst(String non_tax_jrnst){
		this.non_tax_jrnst = non_tax_jrnst;
	}

	public void setNon_tax_stot(String non_tax_stot){
		this.non_tax_stot = non_tax_stot;
	}

	public void setImpt_saly(String impt_saly){
		this.impt_saly = impt_saly;
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

	public void setAddm_dduc_rspc(String addm_dduc_rspc){
		this.addm_dduc_rspc = addm_dduc_rspc;
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

	public void setAddm_dduc_sml_num_dduc_pers(String addm_dduc_sml_num_dduc_pers){
		this.addm_dduc_sml_num_dduc_pers = addm_dduc_sml_num_dduc_pers;
	}

	public void setAddm_dduc_etc(String addm_dduc_etc){
		this.addm_dduc_etc = addm_dduc_etc;
	}

	public void setBoks_qunt_faml_dduc_stot(String boks_qunt_faml_dduc_stot){
		this.boks_qunt_faml_dduc_stot = boks_qunt_faml_dduc_stot;
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

	public void setTax_amt_dduc_hous_loan_amt(String tax_amt_dduc_hous_loan_amt){
		this.tax_amt_dduc_hous_loan_amt = tax_amt_dduc_hous_loan_amt;
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

	public void setTax_amt_dduc_etc(String tax_amt_dduc_etc){
		this.tax_amt_dduc_etc = tax_amt_dduc_etc;
	}

	public void setTax_amt_dduc_stot(String tax_amt_dduc_stot){
		this.tax_amt_dduc_stot = tax_amt_dduc_stot;
	}

	public void setDeci_incm_tax(String deci_incm_tax){
		this.deci_incm_tax = deci_incm_tax;
	}

	public void setDeci_res_tax(String deci_res_tax){
		this.deci_res_tax = deci_res_tax;
	}

	public void setAdjm_dedu_incm_tax(String adjm_dedu_incm_tax){
		this.adjm_dedu_incm_tax = adjm_dedu_incm_tax;
	}

	public void setAdjm_dedu_res_tax(String adjm_dedu_res_tax){
		this.adjm_dedu_res_tax = adjm_dedu_res_tax;
	}

	public void setNp_slf_ctrb_amt(String np_slf_ctrb_amt){
		this.np_slf_ctrb_amt = np_slf_ctrb_amt;
	}

	public void setNp_cmpy_burd_amt(String np_cmpy_burd_amt){
		this.np_cmpy_burd_amt = np_cmpy_burd_amt;
	}

	public void setHlth_insr_fee(String hlth_insr_fee){
		this.hlth_insr_fee = hlth_insr_fee;
	}

	public void setHlth_insr_med_care_insr_fee(String hlth_insr_med_care_insr_fee){
		this.hlth_insr_med_care_insr_fee = hlth_insr_med_care_insr_fee;
	}

	public void setEmp_insr_fee(String emp_insr_fee){
		this.emp_insr_fee = emp_insr_fee;
	}

	public void setCal_pay_amt(String cal_pay_amt){
		this.cal_pay_amt = cal_pay_amt;
	}

	public void setIncmg_pers_ipadd(String incmg_pers_ipadd){
		this.incmg_pers_ipadd = incmg_pers_ipadd;
	}

	public String getMode(){
		return this.mode;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getSaly_yy(){
		return this.saly_yy;
	}

	public String getSaly_no(){
		return this.saly_no;
	}

	public String getFlnm(){
		return this.flnm;
	}

	public String getSaly_clsf(){
		return this.saly_clsf;
	}

	public String getSaly_pay_dt(){
		return this.saly_pay_dt;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getBase_saly(){
		return this.base_saly;
	}

	public String getEvngt_saly(){
		return this.evngt_saly;
	}

	public String getSupl_saly(){
		return this.supl_saly;
	}

	public String getPosk_saly(){
		return this.posk_saly;
	}

	public String getRgla_saly(){
		return this.rgla_saly;
	}

	public String getReal_pay_rgla_saly(){
		return this.real_pay_rgla_saly;
	}

	public String getWeek_hody_base_alon(){
		return this.week_hody_base_alon;
	}

	public String getWeek_hody_cmpn_alon(){
		return this.week_hody_cmpn_alon;
	}

	public String getLgl_hody_base_alon(){
		return this.lgl_hody_base_alon;
	}

	public String getLgl_hody_cmpn_alon(){
		return this.lgl_hody_cmpn_alon;
	}

	public String getNissu_dd_alon(){
		return this.nissu_dd_alon;
	}

	public String getVgl_fee(){
		return this.vgl_fee;
	}

	public String getNon_regu_alon_stot(){
		return this.non_regu_alon_stot;
	}

	public String getTot_pay_saly(){
		return this.tot_pay_saly;
	}

	public String getNon_tax_yn_frnc(){
		return this.non_tax_yn_frnc;
	}

	public String getNon_tax_frnc(){
		return this.non_tax_frnc;
	}

	public String getNon_tax_yn_jrnst(){
		return this.non_tax_yn_jrnst;
	}

	public String getNon_tax_jrnst(){
		return this.non_tax_jrnst;
	}

	public String getNon_tax_stot(){
		return this.non_tax_stot;
	}

	public String getImpt_saly(){
		return this.impt_saly;
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

	public String getAddm_dduc_rspc(){
		return this.addm_dduc_rspc;
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

	public String getAddm_dduc_sml_num_dduc_pers(){
		return this.addm_dduc_sml_num_dduc_pers;
	}

	public String getAddm_dduc_etc(){
		return this.addm_dduc_etc;
	}

	public String getBoks_qunt_faml_dduc_stot(){
		return this.boks_qunt_faml_dduc_stot;
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

	public String getTax_amt_dduc_hous_loan_amt(){
		return this.tax_amt_dduc_hous_loan_amt;
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

	public String getTax_amt_dduc_etc(){
		return this.tax_amt_dduc_etc;
	}

	public String getTax_amt_dduc_stot(){
		return this.tax_amt_dduc_stot;
	}

	public String getDeci_incm_tax(){
		return this.deci_incm_tax;
	}

	public String getDeci_res_tax(){
		return this.deci_res_tax;
	}

	public String getAdjm_dedu_incm_tax(){
		return this.adjm_dedu_incm_tax;
	}

	public String getAdjm_dedu_res_tax(){
		return this.adjm_dedu_res_tax;
	}

	public String getNp_slf_ctrb_amt(){
		return this.np_slf_ctrb_amt;
	}

	public String getNp_cmpy_burd_amt(){
		return this.np_cmpy_burd_amt;
	}

	public String getHlth_insr_fee(){
		return this.hlth_insr_fee;
	}

	public String getHlth_insr_med_care_insr_fee(){
		return this.hlth_insr_med_care_insr_fee;
	}

	public String getEmp_insr_fee(){
		return this.emp_insr_fee;
	}

	public String getCal_pay_amt(){
		return this.cal_pay_amt;
	}

	public String getIncmg_pers_ipadd(){
		return this.incmg_pers_ipadd;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_SALY_3331_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_SALY_3331_ADM dm = (HD_SALY_3331_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.mode);
		cstmt.setString(4, dm.cmpy_cd);
		cstmt.setString(5, dm.emp_no);
		cstmt.setString(6, dm.saly_yy);
		cstmt.setString(7, dm.saly_no);
		cstmt.setString(8, dm.flnm);
		cstmt.setString(9, dm.saly_clsf);
		cstmt.setString(10, dm.saly_pay_dt);
		cstmt.setString(11, dm.dept_cd);
		cstmt.setString(12, dm.base_saly);
		cstmt.setString(13, dm.evngt_saly);
		cstmt.setString(14, dm.supl_saly);
		cstmt.setString(15, dm.posk_saly);
		cstmt.setString(16, dm.rgla_saly);
		cstmt.setString(17, dm.real_pay_rgla_saly);
		cstmt.setString(18, dm.week_hody_base_alon);
		cstmt.setString(19, dm.week_hody_cmpn_alon);
		cstmt.setString(20, dm.lgl_hody_base_alon);
		cstmt.setString(21, dm.lgl_hody_cmpn_alon);
		cstmt.setString(22, dm.nissu_dd_alon);
		cstmt.setString(23, dm.vgl_fee);
		cstmt.setString(24, dm.non_regu_alon_stot);
		cstmt.setString(25, dm.tot_pay_saly);
		cstmt.setString(26, dm.non_tax_yn_frnc);
		cstmt.setString(27, dm.non_tax_frnc);
		cstmt.setString(28, dm.non_tax_yn_jrnst);
		cstmt.setString(29, dm.non_tax_jrnst);
		cstmt.setString(30, dm.non_tax_stot);
		cstmt.setString(31, dm.impt_saly);
		cstmt.setString(32, dm.labr_incm_dduc);
		cstmt.setString(33, dm.labr_incm_amt);
		cstmt.setString(34, dm.base_dduc_slf);
		cstmt.setString(35, dm.base_dduc_spos);
		cstmt.setString(36, dm.base_dduc_child);
		cstmt.setString(37, dm.base_dduc_oldg);
		cstmt.setString(38, dm.addm_dduc_rspc);
		cstmt.setString(39, dm.addm_dduc_obcl_pers);
		cstmt.setString(40, dm.addm_dduc_fml_hshd);
		cstmt.setString(41, dm.addm_dduc_care_fee);
		cstmt.setString(42, dm.addm_dduc_sml_num_dduc_pers);
		cstmt.setString(43, dm.addm_dduc_etc);
		cstmt.setString(44, dm.boks_qunt_faml_dduc_stot);
		cstmt.setString(45, dm.txn_std_amt);
		cstmt.setString(46, dm.calc_incm_tax);
		cstmt.setString(47, dm.tax_amt_dduc_labr_incm);
		cstmt.setString(48, dm.tax_amt_dduc_forn_pymt);
		cstmt.setString(49, dm.tax_amt_dduc_hous_loan_amt);
		cstmt.setString(50, dm.tax_amt_dduc_stok_savg);
		cstmt.setString(51, dm.tax_amt_dduc_savg);
		cstmt.setString(52, dm.tax_amt_dduc_hous_fund);
		cstmt.setString(53, dm.tax_amt_dduc_etc);
		cstmt.setString(54, dm.tax_amt_dduc_stot);
		cstmt.setString(55, dm.deci_incm_tax);
		cstmt.setString(56, dm.deci_res_tax);
		cstmt.setString(57, dm.adjm_dedu_incm_tax);
		cstmt.setString(58, dm.adjm_dedu_res_tax);
		cstmt.setString(59, dm.np_slf_ctrb_amt);
		cstmt.setString(60, dm.np_cmpy_burd_amt);
		cstmt.setString(61, dm.hlth_insr_fee);
		cstmt.setString(62, dm.hlth_insr_med_care_insr_fee);
		cstmt.setString(63, dm.emp_insr_fee);
		cstmt.setString(64, dm.cal_pay_amt);
		cstmt.setString(65, dm.incmg_pers_ipadd);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.saly.ds.HD_SALY_3331_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("mode = [" + getMode() + "]");
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("emp_no = [" + getEmp_no() + "]");
		System.out.println("saly_yy = [" + getSaly_yy() + "]");
		System.out.println("saly_no = [" + getSaly_no() + "]");
		System.out.println("flnm = [" + getFlnm() + "]");
		System.out.println("saly_clsf = [" + getSaly_clsf() + "]");
		System.out.println("saly_pay_dt = [" + getSaly_pay_dt() + "]");
		System.out.println("dept_cd = [" + getDept_cd() + "]");
		System.out.println("base_saly = [" + getBase_saly() + "]");
		System.out.println("evngt_saly = [" + getEvngt_saly() + "]");
		System.out.println("supl_saly = [" + getSupl_saly() + "]");
		System.out.println("posk_saly = [" + getPosk_saly() + "]");
		System.out.println("rgla_saly = [" + getRgla_saly() + "]");
		System.out.println("real_pay_rgla_saly = [" + getReal_pay_rgla_saly() + "]");
		System.out.println("week_hody_base_alon = [" + getWeek_hody_base_alon() + "]");
		System.out.println("week_hody_cmpn_alon = [" + getWeek_hody_cmpn_alon() + "]");
		System.out.println("lgl_hody_base_alon = [" + getLgl_hody_base_alon() + "]");
		System.out.println("lgl_hody_cmpn_alon = [" + getLgl_hody_cmpn_alon() + "]");
		System.out.println("nissu_dd_alon = [" + getNissu_dd_alon() + "]");
		System.out.println("vgl_fee = [" + getVgl_fee() + "]");
		System.out.println("non_regu_alon_stot = [" + getNon_regu_alon_stot() + "]");
		System.out.println("tot_pay_saly = [" + getTot_pay_saly() + "]");
		System.out.println("non_tax_yn_frnc = [" + getNon_tax_yn_frnc() + "]");
		System.out.println("non_tax_frnc = [" + getNon_tax_frnc() + "]");
		System.out.println("non_tax_yn_jrnst = [" + getNon_tax_yn_jrnst() + "]");
		System.out.println("non_tax_jrnst = [" + getNon_tax_jrnst() + "]");
		System.out.println("non_tax_stot = [" + getNon_tax_stot() + "]");
		System.out.println("impt_saly = [" + getImpt_saly() + "]");
		System.out.println("labr_incm_dduc = [" + getLabr_incm_dduc() + "]");
		System.out.println("labr_incm_amt = [" + getLabr_incm_amt() + "]");
		System.out.println("base_dduc_slf = [" + getBase_dduc_slf() + "]");
		System.out.println("base_dduc_spos = [" + getBase_dduc_spos() + "]");
		System.out.println("base_dduc_child = [" + getBase_dduc_child() + "]");
		System.out.println("base_dduc_oldg = [" + getBase_dduc_oldg() + "]");
		System.out.println("addm_dduc_rspc = [" + getAddm_dduc_rspc() + "]");
		System.out.println("addm_dduc_obcl_pers = [" + getAddm_dduc_obcl_pers() + "]");
		System.out.println("addm_dduc_fml_hshd = [" + getAddm_dduc_fml_hshd() + "]");
		System.out.println("addm_dduc_care_fee = [" + getAddm_dduc_care_fee() + "]");
		System.out.println("addm_dduc_sml_num_dduc_pers = [" + getAddm_dduc_sml_num_dduc_pers() + "]");
		System.out.println("addm_dduc_etc = [" + getAddm_dduc_etc() + "]");
		System.out.println("boks_qunt_faml_dduc_stot = [" + getBoks_qunt_faml_dduc_stot() + "]");
		System.out.println("txn_std_amt = [" + getTxn_std_amt() + "]");
		System.out.println("calc_incm_tax = [" + getCalc_incm_tax() + "]");
		System.out.println("tax_amt_dduc_labr_incm = [" + getTax_amt_dduc_labr_incm() + "]");
		System.out.println("tax_amt_dduc_forn_pymt = [" + getTax_amt_dduc_forn_pymt() + "]");
		System.out.println("tax_amt_dduc_hous_loan_amt = [" + getTax_amt_dduc_hous_loan_amt() + "]");
		System.out.println("tax_amt_dduc_stok_savg = [" + getTax_amt_dduc_stok_savg() + "]");
		System.out.println("tax_amt_dduc_savg = [" + getTax_amt_dduc_savg() + "]");
		System.out.println("tax_amt_dduc_hous_fund = [" + getTax_amt_dduc_hous_fund() + "]");
		System.out.println("tax_amt_dduc_etc = [" + getTax_amt_dduc_etc() + "]");
		System.out.println("tax_amt_dduc_stot = [" + getTax_amt_dduc_stot() + "]");
		System.out.println("deci_incm_tax = [" + getDeci_incm_tax() + "]");
		System.out.println("deci_res_tax = [" + getDeci_res_tax() + "]");
		System.out.println("adjm_dedu_incm_tax = [" + getAdjm_dedu_incm_tax() + "]");
		System.out.println("adjm_dedu_res_tax = [" + getAdjm_dedu_res_tax() + "]");
		System.out.println("np_slf_ctrb_amt = [" + getNp_slf_ctrb_amt() + "]");
		System.out.println("np_cmpy_burd_amt = [" + getNp_cmpy_burd_amt() + "]");
		System.out.println("hlth_insr_fee = [" + getHlth_insr_fee() + "]");
		System.out.println("hlth_insr_med_care_insr_fee = [" + getHlth_insr_med_care_insr_fee() + "]");
		System.out.println("emp_insr_fee = [" + getEmp_insr_fee() + "]");
		System.out.println("cal_pay_amt = [" + getCal_pay_amt() + "]");
		System.out.println("incmg_pers_ipadd = [" + getIncmg_pers_ipadd() + "]");
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String mode = req.getParameter("mode");
if( mode == null){
	System.out.println(this.toString+" : mode is null" );
}else{
	System.out.println(this.toString+" : mode is "+mode );
}
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
String saly_yy = req.getParameter("saly_yy");
if( saly_yy == null){
	System.out.println(this.toString+" : saly_yy is null" );
}else{
	System.out.println(this.toString+" : saly_yy is "+saly_yy );
}
String saly_no = req.getParameter("saly_no");
if( saly_no == null){
	System.out.println(this.toString+" : saly_no is null" );
}else{
	System.out.println(this.toString+" : saly_no is "+saly_no );
}
String flnm = req.getParameter("flnm");
if( flnm == null){
	System.out.println(this.toString+" : flnm is null" );
}else{
	System.out.println(this.toString+" : flnm is "+flnm );
}
String saly_clsf = req.getParameter("saly_clsf");
if( saly_clsf == null){
	System.out.println(this.toString+" : saly_clsf is null" );
}else{
	System.out.println(this.toString+" : saly_clsf is "+saly_clsf );
}
String saly_pay_dt = req.getParameter("saly_pay_dt");
if( saly_pay_dt == null){
	System.out.println(this.toString+" : saly_pay_dt is null" );
}else{
	System.out.println(this.toString+" : saly_pay_dt is "+saly_pay_dt );
}
String dept_cd = req.getParameter("dept_cd");
if( dept_cd == null){
	System.out.println(this.toString+" : dept_cd is null" );
}else{
	System.out.println(this.toString+" : dept_cd is "+dept_cd );
}
String base_saly = req.getParameter("base_saly");
if( base_saly == null){
	System.out.println(this.toString+" : base_saly is null" );
}else{
	System.out.println(this.toString+" : base_saly is "+base_saly );
}
String evngt_saly = req.getParameter("evngt_saly");
if( evngt_saly == null){
	System.out.println(this.toString+" : evngt_saly is null" );
}else{
	System.out.println(this.toString+" : evngt_saly is "+evngt_saly );
}
String supl_saly = req.getParameter("supl_saly");
if( supl_saly == null){
	System.out.println(this.toString+" : supl_saly is null" );
}else{
	System.out.println(this.toString+" : supl_saly is "+supl_saly );
}
String posk_saly = req.getParameter("posk_saly");
if( posk_saly == null){
	System.out.println(this.toString+" : posk_saly is null" );
}else{
	System.out.println(this.toString+" : posk_saly is "+posk_saly );
}
String rgla_saly = req.getParameter("rgla_saly");
if( rgla_saly == null){
	System.out.println(this.toString+" : rgla_saly is null" );
}else{
	System.out.println(this.toString+" : rgla_saly is "+rgla_saly );
}
String real_pay_rgla_saly = req.getParameter("real_pay_rgla_saly");
if( real_pay_rgla_saly == null){
	System.out.println(this.toString+" : real_pay_rgla_saly is null" );
}else{
	System.out.println(this.toString+" : real_pay_rgla_saly is "+real_pay_rgla_saly );
}
String week_hody_base_alon = req.getParameter("week_hody_base_alon");
if( week_hody_base_alon == null){
	System.out.println(this.toString+" : week_hody_base_alon is null" );
}else{
	System.out.println(this.toString+" : week_hody_base_alon is "+week_hody_base_alon );
}
String week_hody_cmpn_alon = req.getParameter("week_hody_cmpn_alon");
if( week_hody_cmpn_alon == null){
	System.out.println(this.toString+" : week_hody_cmpn_alon is null" );
}else{
	System.out.println(this.toString+" : week_hody_cmpn_alon is "+week_hody_cmpn_alon );
}
String lgl_hody_base_alon = req.getParameter("lgl_hody_base_alon");
if( lgl_hody_base_alon == null){
	System.out.println(this.toString+" : lgl_hody_base_alon is null" );
}else{
	System.out.println(this.toString+" : lgl_hody_base_alon is "+lgl_hody_base_alon );
}
String lgl_hody_cmpn_alon = req.getParameter("lgl_hody_cmpn_alon");
if( lgl_hody_cmpn_alon == null){
	System.out.println(this.toString+" : lgl_hody_cmpn_alon is null" );
}else{
	System.out.println(this.toString+" : lgl_hody_cmpn_alon is "+lgl_hody_cmpn_alon );
}
String nissu_dd_alon = req.getParameter("nissu_dd_alon");
if( nissu_dd_alon == null){
	System.out.println(this.toString+" : nissu_dd_alon is null" );
}else{
	System.out.println(this.toString+" : nissu_dd_alon is "+nissu_dd_alon );
}
String vgl_fee = req.getParameter("vgl_fee");
if( vgl_fee == null){
	System.out.println(this.toString+" : vgl_fee is null" );
}else{
	System.out.println(this.toString+" : vgl_fee is "+vgl_fee );
}
String non_regu_alon_stot = req.getParameter("non_regu_alon_stot");
if( non_regu_alon_stot == null){
	System.out.println(this.toString+" : non_regu_alon_stot is null" );
}else{
	System.out.println(this.toString+" : non_regu_alon_stot is "+non_regu_alon_stot );
}
String tot_pay_saly = req.getParameter("tot_pay_saly");
if( tot_pay_saly == null){
	System.out.println(this.toString+" : tot_pay_saly is null" );
}else{
	System.out.println(this.toString+" : tot_pay_saly is "+tot_pay_saly );
}
String non_tax_yn_frnc = req.getParameter("non_tax_yn_frnc");
if( non_tax_yn_frnc == null){
	System.out.println(this.toString+" : non_tax_yn_frnc is null" );
}else{
	System.out.println(this.toString+" : non_tax_yn_frnc is "+non_tax_yn_frnc );
}
String non_tax_frnc = req.getParameter("non_tax_frnc");
if( non_tax_frnc == null){
	System.out.println(this.toString+" : non_tax_frnc is null" );
}else{
	System.out.println(this.toString+" : non_tax_frnc is "+non_tax_frnc );
}
String non_tax_yn_jrnst = req.getParameter("non_tax_yn_jrnst");
if( non_tax_yn_jrnst == null){
	System.out.println(this.toString+" : non_tax_yn_jrnst is null" );
}else{
	System.out.println(this.toString+" : non_tax_yn_jrnst is "+non_tax_yn_jrnst );
}
String non_tax_jrnst = req.getParameter("non_tax_jrnst");
if( non_tax_jrnst == null){
	System.out.println(this.toString+" : non_tax_jrnst is null" );
}else{
	System.out.println(this.toString+" : non_tax_jrnst is "+non_tax_jrnst );
}
String non_tax_stot = req.getParameter("non_tax_stot");
if( non_tax_stot == null){
	System.out.println(this.toString+" : non_tax_stot is null" );
}else{
	System.out.println(this.toString+" : non_tax_stot is "+non_tax_stot );
}
String impt_saly = req.getParameter("impt_saly");
if( impt_saly == null){
	System.out.println(this.toString+" : impt_saly is null" );
}else{
	System.out.println(this.toString+" : impt_saly is "+impt_saly );
}
String labr_incm_dduc = req.getParameter("labr_incm_dduc");
if( labr_incm_dduc == null){
	System.out.println(this.toString+" : labr_incm_dduc is null" );
}else{
	System.out.println(this.toString+" : labr_incm_dduc is "+labr_incm_dduc );
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
String base_dduc_child = req.getParameter("base_dduc_child");
if( base_dduc_child == null){
	System.out.println(this.toString+" : base_dduc_child is null" );
}else{
	System.out.println(this.toString+" : base_dduc_child is "+base_dduc_child );
}
String base_dduc_oldg = req.getParameter("base_dduc_oldg");
if( base_dduc_oldg == null){
	System.out.println(this.toString+" : base_dduc_oldg is null" );
}else{
	System.out.println(this.toString+" : base_dduc_oldg is "+base_dduc_oldg );
}
String addm_dduc_rspc = req.getParameter("addm_dduc_rspc");
if( addm_dduc_rspc == null){
	System.out.println(this.toString+" : addm_dduc_rspc is null" );
}else{
	System.out.println(this.toString+" : addm_dduc_rspc is "+addm_dduc_rspc );
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
String addm_dduc_sml_num_dduc_pers = req.getParameter("addm_dduc_sml_num_dduc_pers");
if( addm_dduc_sml_num_dduc_pers == null){
	System.out.println(this.toString+" : addm_dduc_sml_num_dduc_pers is null" );
}else{
	System.out.println(this.toString+" : addm_dduc_sml_num_dduc_pers is "+addm_dduc_sml_num_dduc_pers );
}
String addm_dduc_etc = req.getParameter("addm_dduc_etc");
if( addm_dduc_etc == null){
	System.out.println(this.toString+" : addm_dduc_etc is null" );
}else{
	System.out.println(this.toString+" : addm_dduc_etc is "+addm_dduc_etc );
}
String boks_qunt_faml_dduc_stot = req.getParameter("boks_qunt_faml_dduc_stot");
if( boks_qunt_faml_dduc_stot == null){
	System.out.println(this.toString+" : boks_qunt_faml_dduc_stot is null" );
}else{
	System.out.println(this.toString+" : boks_qunt_faml_dduc_stot is "+boks_qunt_faml_dduc_stot );
}
String txn_std_amt = req.getParameter("txn_std_amt");
if( txn_std_amt == null){
	System.out.println(this.toString+" : txn_std_amt is null" );
}else{
	System.out.println(this.toString+" : txn_std_amt is "+txn_std_amt );
}
String calc_incm_tax = req.getParameter("calc_incm_tax");
if( calc_incm_tax == null){
	System.out.println(this.toString+" : calc_incm_tax is null" );
}else{
	System.out.println(this.toString+" : calc_incm_tax is "+calc_incm_tax );
}
String tax_amt_dduc_labr_incm = req.getParameter("tax_amt_dduc_labr_incm");
if( tax_amt_dduc_labr_incm == null){
	System.out.println(this.toString+" : tax_amt_dduc_labr_incm is null" );
}else{
	System.out.println(this.toString+" : tax_amt_dduc_labr_incm is "+tax_amt_dduc_labr_incm );
}
String tax_amt_dduc_forn_pymt = req.getParameter("tax_amt_dduc_forn_pymt");
if( tax_amt_dduc_forn_pymt == null){
	System.out.println(this.toString+" : tax_amt_dduc_forn_pymt is null" );
}else{
	System.out.println(this.toString+" : tax_amt_dduc_forn_pymt is "+tax_amt_dduc_forn_pymt );
}
String tax_amt_dduc_hous_loan_amt = req.getParameter("tax_amt_dduc_hous_loan_amt");
if( tax_amt_dduc_hous_loan_amt == null){
	System.out.println(this.toString+" : tax_amt_dduc_hous_loan_amt is null" );
}else{
	System.out.println(this.toString+" : tax_amt_dduc_hous_loan_amt is "+tax_amt_dduc_hous_loan_amt );
}
String tax_amt_dduc_stok_savg = req.getParameter("tax_amt_dduc_stok_savg");
if( tax_amt_dduc_stok_savg == null){
	System.out.println(this.toString+" : tax_amt_dduc_stok_savg is null" );
}else{
	System.out.println(this.toString+" : tax_amt_dduc_stok_savg is "+tax_amt_dduc_stok_savg );
}
String tax_amt_dduc_savg = req.getParameter("tax_amt_dduc_savg");
if( tax_amt_dduc_savg == null){
	System.out.println(this.toString+" : tax_amt_dduc_savg is null" );
}else{
	System.out.println(this.toString+" : tax_amt_dduc_savg is "+tax_amt_dduc_savg );
}
String tax_amt_dduc_hous_fund = req.getParameter("tax_amt_dduc_hous_fund");
if( tax_amt_dduc_hous_fund == null){
	System.out.println(this.toString+" : tax_amt_dduc_hous_fund is null" );
}else{
	System.out.println(this.toString+" : tax_amt_dduc_hous_fund is "+tax_amt_dduc_hous_fund );
}
String tax_amt_dduc_etc = req.getParameter("tax_amt_dduc_etc");
if( tax_amt_dduc_etc == null){
	System.out.println(this.toString+" : tax_amt_dduc_etc is null" );
}else{
	System.out.println(this.toString+" : tax_amt_dduc_etc is "+tax_amt_dduc_etc );
}
String tax_amt_dduc_stot = req.getParameter("tax_amt_dduc_stot");
if( tax_amt_dduc_stot == null){
	System.out.println(this.toString+" : tax_amt_dduc_stot is null" );
}else{
	System.out.println(this.toString+" : tax_amt_dduc_stot is "+tax_amt_dduc_stot );
}
String deci_incm_tax = req.getParameter("deci_incm_tax");
if( deci_incm_tax == null){
	System.out.println(this.toString+" : deci_incm_tax is null" );
}else{
	System.out.println(this.toString+" : deci_incm_tax is "+deci_incm_tax );
}
String deci_res_tax = req.getParameter("deci_res_tax");
if( deci_res_tax == null){
	System.out.println(this.toString+" : deci_res_tax is null" );
}else{
	System.out.println(this.toString+" : deci_res_tax is "+deci_res_tax );
}
String adjm_dedu_incm_tax = req.getParameter("adjm_dedu_incm_tax");
if( adjm_dedu_incm_tax == null){
	System.out.println(this.toString+" : adjm_dedu_incm_tax is null" );
}else{
	System.out.println(this.toString+" : adjm_dedu_incm_tax is "+adjm_dedu_incm_tax );
}
String adjm_dedu_res_tax = req.getParameter("adjm_dedu_res_tax");
if( adjm_dedu_res_tax == null){
	System.out.println(this.toString+" : adjm_dedu_res_tax is null" );
}else{
	System.out.println(this.toString+" : adjm_dedu_res_tax is "+adjm_dedu_res_tax );
}
String np_slf_ctrb_amt = req.getParameter("np_slf_ctrb_amt");
if( np_slf_ctrb_amt == null){
	System.out.println(this.toString+" : np_slf_ctrb_amt is null" );
}else{
	System.out.println(this.toString+" : np_slf_ctrb_amt is "+np_slf_ctrb_amt );
}
String np_cmpy_burd_amt = req.getParameter("np_cmpy_burd_amt");
if( np_cmpy_burd_amt == null){
	System.out.println(this.toString+" : np_cmpy_burd_amt is null" );
}else{
	System.out.println(this.toString+" : np_cmpy_burd_amt is "+np_cmpy_burd_amt );
}
String hlth_insr_fee = req.getParameter("hlth_insr_fee");
if( hlth_insr_fee == null){
	System.out.println(this.toString+" : hlth_insr_fee is null" );
}else{
	System.out.println(this.toString+" : hlth_insr_fee is "+hlth_insr_fee );
}
String hlth_insr_med_care_insr_fee = req.getParameter("hlth_insr_med_care_insr_fee");
if( hlth_insr_med_care_insr_fee == null){
	System.out.println(this.toString+" : hlth_insr_med_care_insr_fee is null" );
}else{
	System.out.println(this.toString+" : hlth_insr_med_care_insr_fee is "+hlth_insr_med_care_insr_fee );
}
String emp_insr_fee = req.getParameter("emp_insr_fee");
if( emp_insr_fee == null){
	System.out.println(this.toString+" : emp_insr_fee is null" );
}else{
	System.out.println(this.toString+" : emp_insr_fee is "+emp_insr_fee );
}
String cal_pay_amt = req.getParameter("cal_pay_amt");
if( cal_pay_amt == null){
	System.out.println(this.toString+" : cal_pay_amt is null" );
}else{
	System.out.println(this.toString+" : cal_pay_amt is "+cal_pay_amt );
}
String incmg_pers_ipadd = req.getParameter("incmg_pers_ipadd");
if( incmg_pers_ipadd == null){
	System.out.println(this.toString+" : incmg_pers_ipadd is null" );
}else{
	System.out.println(this.toString+" : incmg_pers_ipadd is "+incmg_pers_ipadd );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String mode = Util.checkString(req.getParameter("mode"));
String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String emp_no = Util.checkString(req.getParameter("emp_no"));
String saly_yy = Util.checkString(req.getParameter("saly_yy"));
String saly_no = Util.checkString(req.getParameter("saly_no"));
String flnm = Util.checkString(req.getParameter("flnm"));
String saly_clsf = Util.checkString(req.getParameter("saly_clsf"));
String saly_pay_dt = Util.checkString(req.getParameter("saly_pay_dt"));
String dept_cd = Util.checkString(req.getParameter("dept_cd"));
String base_saly = Util.checkString(req.getParameter("base_saly"));
String evngt_saly = Util.checkString(req.getParameter("evngt_saly"));
String supl_saly = Util.checkString(req.getParameter("supl_saly"));
String posk_saly = Util.checkString(req.getParameter("posk_saly"));
String rgla_saly = Util.checkString(req.getParameter("rgla_saly"));
String real_pay_rgla_saly = Util.checkString(req.getParameter("real_pay_rgla_saly"));
String week_hody_base_alon = Util.checkString(req.getParameter("week_hody_base_alon"));
String week_hody_cmpn_alon = Util.checkString(req.getParameter("week_hody_cmpn_alon"));
String lgl_hody_base_alon = Util.checkString(req.getParameter("lgl_hody_base_alon"));
String lgl_hody_cmpn_alon = Util.checkString(req.getParameter("lgl_hody_cmpn_alon"));
String nissu_dd_alon = Util.checkString(req.getParameter("nissu_dd_alon"));
String vgl_fee = Util.checkString(req.getParameter("vgl_fee"));
String non_regu_alon_stot = Util.checkString(req.getParameter("non_regu_alon_stot"));
String tot_pay_saly = Util.checkString(req.getParameter("tot_pay_saly"));
String non_tax_yn_frnc = Util.checkString(req.getParameter("non_tax_yn_frnc"));
String non_tax_frnc = Util.checkString(req.getParameter("non_tax_frnc"));
String non_tax_yn_jrnst = Util.checkString(req.getParameter("non_tax_yn_jrnst"));
String non_tax_jrnst = Util.checkString(req.getParameter("non_tax_jrnst"));
String non_tax_stot = Util.checkString(req.getParameter("non_tax_stot"));
String impt_saly = Util.checkString(req.getParameter("impt_saly"));
String labr_incm_dduc = Util.checkString(req.getParameter("labr_incm_dduc"));
String labr_incm_amt = Util.checkString(req.getParameter("labr_incm_amt"));
String base_dduc_slf = Util.checkString(req.getParameter("base_dduc_slf"));
String base_dduc_spos = Util.checkString(req.getParameter("base_dduc_spos"));
String base_dduc_child = Util.checkString(req.getParameter("base_dduc_child"));
String base_dduc_oldg = Util.checkString(req.getParameter("base_dduc_oldg"));
String addm_dduc_rspc = Util.checkString(req.getParameter("addm_dduc_rspc"));
String addm_dduc_obcl_pers = Util.checkString(req.getParameter("addm_dduc_obcl_pers"));
String addm_dduc_fml_hshd = Util.checkString(req.getParameter("addm_dduc_fml_hshd"));
String addm_dduc_care_fee = Util.checkString(req.getParameter("addm_dduc_care_fee"));
String addm_dduc_sml_num_dduc_pers = Util.checkString(req.getParameter("addm_dduc_sml_num_dduc_pers"));
String addm_dduc_etc = Util.checkString(req.getParameter("addm_dduc_etc"));
String boks_qunt_faml_dduc_stot = Util.checkString(req.getParameter("boks_qunt_faml_dduc_stot"));
String txn_std_amt = Util.checkString(req.getParameter("txn_std_amt"));
String calc_incm_tax = Util.checkString(req.getParameter("calc_incm_tax"));
String tax_amt_dduc_labr_incm = Util.checkString(req.getParameter("tax_amt_dduc_labr_incm"));
String tax_amt_dduc_forn_pymt = Util.checkString(req.getParameter("tax_amt_dduc_forn_pymt"));
String tax_amt_dduc_hous_loan_amt = Util.checkString(req.getParameter("tax_amt_dduc_hous_loan_amt"));
String tax_amt_dduc_stok_savg = Util.checkString(req.getParameter("tax_amt_dduc_stok_savg"));
String tax_amt_dduc_savg = Util.checkString(req.getParameter("tax_amt_dduc_savg"));
String tax_amt_dduc_hous_fund = Util.checkString(req.getParameter("tax_amt_dduc_hous_fund"));
String tax_amt_dduc_etc = Util.checkString(req.getParameter("tax_amt_dduc_etc"));
String tax_amt_dduc_stot = Util.checkString(req.getParameter("tax_amt_dduc_stot"));
String deci_incm_tax = Util.checkString(req.getParameter("deci_incm_tax"));
String deci_res_tax = Util.checkString(req.getParameter("deci_res_tax"));
String adjm_dedu_incm_tax = Util.checkString(req.getParameter("adjm_dedu_incm_tax"));
String adjm_dedu_res_tax = Util.checkString(req.getParameter("adjm_dedu_res_tax"));
String np_slf_ctrb_amt = Util.checkString(req.getParameter("np_slf_ctrb_amt"));
String np_cmpy_burd_amt = Util.checkString(req.getParameter("np_cmpy_burd_amt"));
String hlth_insr_fee = Util.checkString(req.getParameter("hlth_insr_fee"));
String hlth_insr_med_care_insr_fee = Util.checkString(req.getParameter("hlth_insr_med_care_insr_fee"));
String emp_insr_fee = Util.checkString(req.getParameter("emp_insr_fee"));
String cal_pay_amt = Util.checkString(req.getParameter("cal_pay_amt"));
String incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_no")));
String saly_yy = Util.Uni2Ksc(Util.checkString(req.getParameter("saly_yy")));
String saly_no = Util.Uni2Ksc(Util.checkString(req.getParameter("saly_no")));
String flnm = Util.Uni2Ksc(Util.checkString(req.getParameter("flnm")));
String saly_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("saly_clsf")));
String saly_pay_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("saly_pay_dt")));
String dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dept_cd")));
String base_saly = Util.Uni2Ksc(Util.checkString(req.getParameter("base_saly")));
String evngt_saly = Util.Uni2Ksc(Util.checkString(req.getParameter("evngt_saly")));
String supl_saly = Util.Uni2Ksc(Util.checkString(req.getParameter("supl_saly")));
String posk_saly = Util.Uni2Ksc(Util.checkString(req.getParameter("posk_saly")));
String rgla_saly = Util.Uni2Ksc(Util.checkString(req.getParameter("rgla_saly")));
String real_pay_rgla_saly = Util.Uni2Ksc(Util.checkString(req.getParameter("real_pay_rgla_saly")));
String week_hody_base_alon = Util.Uni2Ksc(Util.checkString(req.getParameter("week_hody_base_alon")));
String week_hody_cmpn_alon = Util.Uni2Ksc(Util.checkString(req.getParameter("week_hody_cmpn_alon")));
String lgl_hody_base_alon = Util.Uni2Ksc(Util.checkString(req.getParameter("lgl_hody_base_alon")));
String lgl_hody_cmpn_alon = Util.Uni2Ksc(Util.checkString(req.getParameter("lgl_hody_cmpn_alon")));
String nissu_dd_alon = Util.Uni2Ksc(Util.checkString(req.getParameter("nissu_dd_alon")));
String vgl_fee = Util.Uni2Ksc(Util.checkString(req.getParameter("vgl_fee")));
String non_regu_alon_stot = Util.Uni2Ksc(Util.checkString(req.getParameter("non_regu_alon_stot")));
String tot_pay_saly = Util.Uni2Ksc(Util.checkString(req.getParameter("tot_pay_saly")));
String non_tax_yn_frnc = Util.Uni2Ksc(Util.checkString(req.getParameter("non_tax_yn_frnc")));
String non_tax_frnc = Util.Uni2Ksc(Util.checkString(req.getParameter("non_tax_frnc")));
String non_tax_yn_jrnst = Util.Uni2Ksc(Util.checkString(req.getParameter("non_tax_yn_jrnst")));
String non_tax_jrnst = Util.Uni2Ksc(Util.checkString(req.getParameter("non_tax_jrnst")));
String non_tax_stot = Util.Uni2Ksc(Util.checkString(req.getParameter("non_tax_stot")));
String impt_saly = Util.Uni2Ksc(Util.checkString(req.getParameter("impt_saly")));
String labr_incm_dduc = Util.Uni2Ksc(Util.checkString(req.getParameter("labr_incm_dduc")));
String labr_incm_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("labr_incm_amt")));
String base_dduc_slf = Util.Uni2Ksc(Util.checkString(req.getParameter("base_dduc_slf")));
String base_dduc_spos = Util.Uni2Ksc(Util.checkString(req.getParameter("base_dduc_spos")));
String base_dduc_child = Util.Uni2Ksc(Util.checkString(req.getParameter("base_dduc_child")));
String base_dduc_oldg = Util.Uni2Ksc(Util.checkString(req.getParameter("base_dduc_oldg")));
String addm_dduc_rspc = Util.Uni2Ksc(Util.checkString(req.getParameter("addm_dduc_rspc")));
String addm_dduc_obcl_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("addm_dduc_obcl_pers")));
String addm_dduc_fml_hshd = Util.Uni2Ksc(Util.checkString(req.getParameter("addm_dduc_fml_hshd")));
String addm_dduc_care_fee = Util.Uni2Ksc(Util.checkString(req.getParameter("addm_dduc_care_fee")));
String addm_dduc_sml_num_dduc_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("addm_dduc_sml_num_dduc_pers")));
String addm_dduc_etc = Util.Uni2Ksc(Util.checkString(req.getParameter("addm_dduc_etc")));
String boks_qunt_faml_dduc_stot = Util.Uni2Ksc(Util.checkString(req.getParameter("boks_qunt_faml_dduc_stot")));
String txn_std_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("txn_std_amt")));
String calc_incm_tax = Util.Uni2Ksc(Util.checkString(req.getParameter("calc_incm_tax")));
String tax_amt_dduc_labr_incm = Util.Uni2Ksc(Util.checkString(req.getParameter("tax_amt_dduc_labr_incm")));
String tax_amt_dduc_forn_pymt = Util.Uni2Ksc(Util.checkString(req.getParameter("tax_amt_dduc_forn_pymt")));
String tax_amt_dduc_hous_loan_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("tax_amt_dduc_hous_loan_amt")));
String tax_amt_dduc_stok_savg = Util.Uni2Ksc(Util.checkString(req.getParameter("tax_amt_dduc_stok_savg")));
String tax_amt_dduc_savg = Util.Uni2Ksc(Util.checkString(req.getParameter("tax_amt_dduc_savg")));
String tax_amt_dduc_hous_fund = Util.Uni2Ksc(Util.checkString(req.getParameter("tax_amt_dduc_hous_fund")));
String tax_amt_dduc_etc = Util.Uni2Ksc(Util.checkString(req.getParameter("tax_amt_dduc_etc")));
String tax_amt_dduc_stot = Util.Uni2Ksc(Util.checkString(req.getParameter("tax_amt_dduc_stot")));
String deci_incm_tax = Util.Uni2Ksc(Util.checkString(req.getParameter("deci_incm_tax")));
String deci_res_tax = Util.Uni2Ksc(Util.checkString(req.getParameter("deci_res_tax")));
String adjm_dedu_incm_tax = Util.Uni2Ksc(Util.checkString(req.getParameter("adjm_dedu_incm_tax")));
String adjm_dedu_res_tax = Util.Uni2Ksc(Util.checkString(req.getParameter("adjm_dedu_res_tax")));
String np_slf_ctrb_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("np_slf_ctrb_amt")));
String np_cmpy_burd_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("np_cmpy_burd_amt")));
String hlth_insr_fee = Util.Uni2Ksc(Util.checkString(req.getParameter("hlth_insr_fee")));
String hlth_insr_med_care_insr_fee = Util.Uni2Ksc(Util.checkString(req.getParameter("hlth_insr_med_care_insr_fee")));
String emp_insr_fee = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_insr_fee")));
String cal_pay_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("cal_pay_amt")));
String incmg_pers_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipadd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setMode(mode);
dm.setCmpy_cd(cmpy_cd);
dm.setEmp_no(emp_no);
dm.setSaly_yy(saly_yy);
dm.setSaly_no(saly_no);
dm.setFlnm(flnm);
dm.setSaly_clsf(saly_clsf);
dm.setSaly_pay_dt(saly_pay_dt);
dm.setDept_cd(dept_cd);
dm.setBase_saly(base_saly);
dm.setEvngt_saly(evngt_saly);
dm.setSupl_saly(supl_saly);
dm.setPosk_saly(posk_saly);
dm.setRgla_saly(rgla_saly);
dm.setReal_pay_rgla_saly(real_pay_rgla_saly);
dm.setWeek_hody_base_alon(week_hody_base_alon);
dm.setWeek_hody_cmpn_alon(week_hody_cmpn_alon);
dm.setLgl_hody_base_alon(lgl_hody_base_alon);
dm.setLgl_hody_cmpn_alon(lgl_hody_cmpn_alon);
dm.setNissu_dd_alon(nissu_dd_alon);
dm.setVgl_fee(vgl_fee);
dm.setNon_regu_alon_stot(non_regu_alon_stot);
dm.setTot_pay_saly(tot_pay_saly);
dm.setNon_tax_yn_frnc(non_tax_yn_frnc);
dm.setNon_tax_frnc(non_tax_frnc);
dm.setNon_tax_yn_jrnst(non_tax_yn_jrnst);
dm.setNon_tax_jrnst(non_tax_jrnst);
dm.setNon_tax_stot(non_tax_stot);
dm.setImpt_saly(impt_saly);
dm.setLabr_incm_dduc(labr_incm_dduc);
dm.setLabr_incm_amt(labr_incm_amt);
dm.setBase_dduc_slf(base_dduc_slf);
dm.setBase_dduc_spos(base_dduc_spos);
dm.setBase_dduc_child(base_dduc_child);
dm.setBase_dduc_oldg(base_dduc_oldg);
dm.setAddm_dduc_rspc(addm_dduc_rspc);
dm.setAddm_dduc_obcl_pers(addm_dduc_obcl_pers);
dm.setAddm_dduc_fml_hshd(addm_dduc_fml_hshd);
dm.setAddm_dduc_care_fee(addm_dduc_care_fee);
dm.setAddm_dduc_sml_num_dduc_pers(addm_dduc_sml_num_dduc_pers);
dm.setAddm_dduc_etc(addm_dduc_etc);
dm.setBoks_qunt_faml_dduc_stot(boks_qunt_faml_dduc_stot);
dm.setTxn_std_amt(txn_std_amt);
dm.setCalc_incm_tax(calc_incm_tax);
dm.setTax_amt_dduc_labr_incm(tax_amt_dduc_labr_incm);
dm.setTax_amt_dduc_forn_pymt(tax_amt_dduc_forn_pymt);
dm.setTax_amt_dduc_hous_loan_amt(tax_amt_dduc_hous_loan_amt);
dm.setTax_amt_dduc_stok_savg(tax_amt_dduc_stok_savg);
dm.setTax_amt_dduc_savg(tax_amt_dduc_savg);
dm.setTax_amt_dduc_hous_fund(tax_amt_dduc_hous_fund);
dm.setTax_amt_dduc_etc(tax_amt_dduc_etc);
dm.setTax_amt_dduc_stot(tax_amt_dduc_stot);
dm.setDeci_incm_tax(deci_incm_tax);
dm.setDeci_res_tax(deci_res_tax);
dm.setAdjm_dedu_incm_tax(adjm_dedu_incm_tax);
dm.setAdjm_dedu_res_tax(adjm_dedu_res_tax);
dm.setNp_slf_ctrb_amt(np_slf_ctrb_amt);
dm.setNp_cmpy_burd_amt(np_cmpy_burd_amt);
dm.setHlth_insr_fee(hlth_insr_fee);
dm.setHlth_insr_med_care_insr_fee(hlth_insr_med_care_insr_fee);
dm.setEmp_insr_fee(emp_insr_fee);
dm.setCal_pay_amt(cal_pay_amt);
dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Jan 26 17:10:27 KST 2012 */
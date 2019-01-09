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


package chosun.ciis.hd.emsy.rec;

import java.sql.*;
import chosun.ciis.hd.emsy.dm.*;
import chosun.ciis.hd.emsy.ds.*;

/**
 * 
 */


public class HD_EMSY_2010_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String prn;
	public String flnm;
	public String emp_no;
	public String dept_nm;
	public String posi_nm;
	public String shft_bank_nm;
	public String shft_acct_no;
	public String saly_pay_dt;
	public String base_saly;
	public String posk_saly;
	public String week_hody_base_alon;
	public String week_hody_cmpn_alon;
	public String lgl_hody_alon;
	public String nissu_dd_alon;
	public String vgl_fee;
	public String ovt_alon;
	public String corr_base_stay_fee;
	public String prvmm_mstk_dduc;
	public String yymm_alon;
	public String retr_saly;
	public String tot_pay_saly;
	public String deci_incm_tax;
	public String deci_res_tax;
	public String hlth_insr_fee;
	public String np_slf_ctrb_amt;
	public String emp_insr_fee;
	public String jnl_lon;
	public String welf_lon;
	public String vgl_fee_tm;
	public String ovt_alon_tm;
	public String corr_base_stay_fee_tm;
	public String paty_crc_dduc_amt;
	public String fitness_amt;
	public String labor_dduc_amt;
	public String park_fee_dduc;
	public String adv_dduc;
	public String seiz_dduc_amt;
	public String etc_dduc_amt;
	public String adjm_dedu_incm_tax;
	public String adjm_dedu_res_tax;
	public String adjm_dedu_farm_spc_tax;
	public String saly_dduc_stot;
	public String cal_pay_amt;
	public String emp_clsf;
	public String etcsaly_spc;
	public String prsn_pens_dduc;
	public String etc_dduc_remk;
	public String etc_dduc_nm1;
	public String etc_dduc_amt1;
	public String etc_dduc_nm2;
	public String etc_dduc_amt2;
	public String etc_dduc_nm3;
	public String etc_dduc_amt3;
	public String bns_saly;
	public String non_tax_food_alon;
	public String non_tax_auto_driv_alon;
	public String non_tax_jrnst;
	public String repay_scl_exps;
	public String evngt_saly;
	public String hlth_insr_med_care_insr_fee;
	public String congr_fee;
	public String etc_alon_saly;
	public String adpay_amt;
	public String hody_duty_alon;
	public String hlth_insr_fee_adjm;
	public String paty_dus_tot;
	public String welfare_fee;
	public String crc_dus_tot;
	public String dty_acty_fee;
	public String prvmm_mstk_saly;
	public String etc_dduc_nm4;
	public String etc_dduc_amt4;
	public String etc_dduc_nm5;
	public String etc_dduc_amt5;

	public HD_EMSY_2010_LCURLISTRecord(){}

	public void setPrn(String prn){
		this.prn = prn;
	}

	public void setFlnm(String flnm){
		this.flnm = flnm;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setDept_nm(String dept_nm){
		this.dept_nm = dept_nm;
	}

	public void setPosi_nm(String posi_nm){
		this.posi_nm = posi_nm;
	}

	public void setShft_bank_nm(String shft_bank_nm){
		this.shft_bank_nm = shft_bank_nm;
	}

	public void setShft_acct_no(String shft_acct_no){
		this.shft_acct_no = shft_acct_no;
	}

	public void setSaly_pay_dt(String saly_pay_dt){
		this.saly_pay_dt = saly_pay_dt;
	}

	public void setBase_saly(String base_saly){
		this.base_saly = base_saly;
	}

	public void setPosk_saly(String posk_saly){
		this.posk_saly = posk_saly;
	}

	public void setWeek_hody_base_alon(String week_hody_base_alon){
		this.week_hody_base_alon = week_hody_base_alon;
	}

	public void setWeek_hody_cmpn_alon(String week_hody_cmpn_alon){
		this.week_hody_cmpn_alon = week_hody_cmpn_alon;
	}

	public void setLgl_hody_alon(String lgl_hody_alon){
		this.lgl_hody_alon = lgl_hody_alon;
	}

	public void setNissu_dd_alon(String nissu_dd_alon){
		this.nissu_dd_alon = nissu_dd_alon;
	}

	public void setVgl_fee(String vgl_fee){
		this.vgl_fee = vgl_fee;
	}

	public void setOvt_alon(String ovt_alon){
		this.ovt_alon = ovt_alon;
	}

	public void setCorr_base_stay_fee(String corr_base_stay_fee){
		this.corr_base_stay_fee = corr_base_stay_fee;
	}

	public void setPrvmm_mstk_dduc(String prvmm_mstk_dduc){
		this.prvmm_mstk_dduc = prvmm_mstk_dduc;
	}

	public void setYymm_alon(String yymm_alon){
		this.yymm_alon = yymm_alon;
	}

	public void setRetr_saly(String retr_saly){
		this.retr_saly = retr_saly;
	}

	public void setTot_pay_saly(String tot_pay_saly){
		this.tot_pay_saly = tot_pay_saly;
	}

	public void setDeci_incm_tax(String deci_incm_tax){
		this.deci_incm_tax = deci_incm_tax;
	}

	public void setDeci_res_tax(String deci_res_tax){
		this.deci_res_tax = deci_res_tax;
	}

	public void setHlth_insr_fee(String hlth_insr_fee){
		this.hlth_insr_fee = hlth_insr_fee;
	}

	public void setNp_slf_ctrb_amt(String np_slf_ctrb_amt){
		this.np_slf_ctrb_amt = np_slf_ctrb_amt;
	}

	public void setEmp_insr_fee(String emp_insr_fee){
		this.emp_insr_fee = emp_insr_fee;
	}

	public void setJnl_lon(String jnl_lon){
		this.jnl_lon = jnl_lon;
	}

	public void setWelf_lon(String welf_lon){
		this.welf_lon = welf_lon;
	}

	public void setVgl_fee_tm(String vgl_fee_tm){
		this.vgl_fee_tm = vgl_fee_tm;
	}

	public void setOvt_alon_tm(String ovt_alon_tm){
		this.ovt_alon_tm = ovt_alon_tm;
	}

	public void setCorr_base_stay_fee_tm(String corr_base_stay_fee_tm){
		this.corr_base_stay_fee_tm = corr_base_stay_fee_tm;
	}

	public void setPaty_crc_dduc_amt(String paty_crc_dduc_amt){
		this.paty_crc_dduc_amt = paty_crc_dduc_amt;
	}

	public void setFitness_amt(String fitness_amt){
		this.fitness_amt = fitness_amt;
	}

	public void setLabor_dduc_amt(String labor_dduc_amt){
		this.labor_dduc_amt = labor_dduc_amt;
	}

	public void setPark_fee_dduc(String park_fee_dduc){
		this.park_fee_dduc = park_fee_dduc;
	}

	public void setAdv_dduc(String adv_dduc){
		this.adv_dduc = adv_dduc;
	}

	public void setSeiz_dduc_amt(String seiz_dduc_amt){
		this.seiz_dduc_amt = seiz_dduc_amt;
	}

	public void setEtc_dduc_amt(String etc_dduc_amt){
		this.etc_dduc_amt = etc_dduc_amt;
	}

	public void setAdjm_dedu_incm_tax(String adjm_dedu_incm_tax){
		this.adjm_dedu_incm_tax = adjm_dedu_incm_tax;
	}

	public void setAdjm_dedu_res_tax(String adjm_dedu_res_tax){
		this.adjm_dedu_res_tax = adjm_dedu_res_tax;
	}

	public void setAdjm_dedu_farm_spc_tax(String adjm_dedu_farm_spc_tax){
		this.adjm_dedu_farm_spc_tax = adjm_dedu_farm_spc_tax;
	}

	public void setSaly_dduc_stot(String saly_dduc_stot){
		this.saly_dduc_stot = saly_dduc_stot;
	}

	public void setCal_pay_amt(String cal_pay_amt){
		this.cal_pay_amt = cal_pay_amt;
	}

	public void setEmp_clsf(String emp_clsf){
		this.emp_clsf = emp_clsf;
	}

	public void setEtcsaly_spc(String etcsaly_spc){
		this.etcsaly_spc = etcsaly_spc;
	}

	public void setPrsn_pens_dduc(String prsn_pens_dduc){
		this.prsn_pens_dduc = prsn_pens_dduc;
	}

	public void setEtc_dduc_remk(String etc_dduc_remk){
		this.etc_dduc_remk = etc_dduc_remk;
	}

	public void setEtc_dduc_nm1(String etc_dduc_nm1){
		this.etc_dduc_nm1 = etc_dduc_nm1;
	}

	public void setEtc_dduc_amt1(String etc_dduc_amt1){
		this.etc_dduc_amt1 = etc_dduc_amt1;
	}

	public void setEtc_dduc_nm2(String etc_dduc_nm2){
		this.etc_dduc_nm2 = etc_dduc_nm2;
	}

	public void setEtc_dduc_amt2(String etc_dduc_amt2){
		this.etc_dduc_amt2 = etc_dduc_amt2;
	}

	public void setEtc_dduc_nm3(String etc_dduc_nm3){
		this.etc_dduc_nm3 = etc_dduc_nm3;
	}

	public void setEtc_dduc_amt3(String etc_dduc_amt3){
		this.etc_dduc_amt3 = etc_dduc_amt3;
	}

	public void setBns_saly(String bns_saly){
		this.bns_saly = bns_saly;
	}

	public void setNon_tax_food_alon(String non_tax_food_alon){
		this.non_tax_food_alon = non_tax_food_alon;
	}

	public void setNon_tax_auto_driv_alon(String non_tax_auto_driv_alon){
		this.non_tax_auto_driv_alon = non_tax_auto_driv_alon;
	}

	public void setNon_tax_jrnst(String non_tax_jrnst){
		this.non_tax_jrnst = non_tax_jrnst;
	}

	public void setRepay_scl_exps(String repay_scl_exps){
		this.repay_scl_exps = repay_scl_exps;
	}

	public void setEvngt_saly(String evngt_saly){
		this.evngt_saly = evngt_saly;
	}

	public void setHlth_insr_med_care_insr_fee(String hlth_insr_med_care_insr_fee){
		this.hlth_insr_med_care_insr_fee = hlth_insr_med_care_insr_fee;
	}

	public void setCongr_fee(String congr_fee){
		this.congr_fee = congr_fee;
	}

	public void setEtc_alon_saly(String etc_alon_saly){
		this.etc_alon_saly = etc_alon_saly;
	}

	public void setAdpay_amt(String adpay_amt){
		this.adpay_amt = adpay_amt;
	}

	public void setHody_duty_alon(String hody_duty_alon){
		this.hody_duty_alon = hody_duty_alon;
	}

	public void setHlth_insr_fee_adjm(String hlth_insr_fee_adjm){
		this.hlth_insr_fee_adjm = hlth_insr_fee_adjm;
	}

	public void setPaty_dus_tot(String paty_dus_tot){
		this.paty_dus_tot = paty_dus_tot;
	}

	public void setWelfare_fee(String welfare_fee){
		this.welfare_fee = welfare_fee;
	}

	public void setCrc_dus_tot(String crc_dus_tot){
		this.crc_dus_tot = crc_dus_tot;
	}

	public void setDty_acty_fee(String dty_acty_fee){
		this.dty_acty_fee = dty_acty_fee;
	}

	public void setPrvmm_mstk_saly(String prvmm_mstk_saly){
		this.prvmm_mstk_saly = prvmm_mstk_saly;
	}

	public void setEtc_dduc_nm4(String etc_dduc_nm4){
		this.etc_dduc_nm4 = etc_dduc_nm4;
	}

	public void setEtc_dduc_amt4(String etc_dduc_amt4){
		this.etc_dduc_amt4 = etc_dduc_amt4;
	}

	public void setEtc_dduc_nm5(String etc_dduc_nm5){
		this.etc_dduc_nm5 = etc_dduc_nm5;
	}

	public void setEtc_dduc_amt5(String etc_dduc_amt5){
		this.etc_dduc_amt5 = etc_dduc_amt5;
	}

	public String getPrn(){
		return this.prn;
	}

	public String getFlnm(){
		return this.flnm;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getDept_nm(){
		return this.dept_nm;
	}

	public String getPosi_nm(){
		return this.posi_nm;
	}

	public String getShft_bank_nm(){
		return this.shft_bank_nm;
	}

	public String getShft_acct_no(){
		return this.shft_acct_no;
	}

	public String getSaly_pay_dt(){
		return this.saly_pay_dt;
	}

	public String getBase_saly(){
		return this.base_saly;
	}

	public String getPosk_saly(){
		return this.posk_saly;
	}

	public String getWeek_hody_base_alon(){
		return this.week_hody_base_alon;
	}

	public String getWeek_hody_cmpn_alon(){
		return this.week_hody_cmpn_alon;
	}

	public String getLgl_hody_alon(){
		return this.lgl_hody_alon;
	}

	public String getNissu_dd_alon(){
		return this.nissu_dd_alon;
	}

	public String getVgl_fee(){
		return this.vgl_fee;
	}

	public String getOvt_alon(){
		return this.ovt_alon;
	}

	public String getCorr_base_stay_fee(){
		return this.corr_base_stay_fee;
	}

	public String getPrvmm_mstk_dduc(){
		return this.prvmm_mstk_dduc;
	}

	public String getYymm_alon(){
		return this.yymm_alon;
	}

	public String getRetr_saly(){
		return this.retr_saly;
	}

	public String getTot_pay_saly(){
		return this.tot_pay_saly;
	}

	public String getDeci_incm_tax(){
		return this.deci_incm_tax;
	}

	public String getDeci_res_tax(){
		return this.deci_res_tax;
	}

	public String getHlth_insr_fee(){
		return this.hlth_insr_fee;
	}

	public String getNp_slf_ctrb_amt(){
		return this.np_slf_ctrb_amt;
	}

	public String getEmp_insr_fee(){
		return this.emp_insr_fee;
	}

	public String getJnl_lon(){
		return this.jnl_lon;
	}

	public String getWelf_lon(){
		return this.welf_lon;
	}

	public String getVgl_fee_tm(){
		return this.vgl_fee_tm;
	}

	public String getOvt_alon_tm(){
		return this.ovt_alon_tm;
	}

	public String getCorr_base_stay_fee_tm(){
		return this.corr_base_stay_fee_tm;
	}

	public String getPaty_crc_dduc_amt(){
		return this.paty_crc_dduc_amt;
	}

	public String getFitness_amt(){
		return this.fitness_amt;
	}

	public String getLabor_dduc_amt(){
		return this.labor_dduc_amt;
	}

	public String getPark_fee_dduc(){
		return this.park_fee_dduc;
	}

	public String getAdv_dduc(){
		return this.adv_dduc;
	}

	public String getSeiz_dduc_amt(){
		return this.seiz_dduc_amt;
	}

	public String getEtc_dduc_amt(){
		return this.etc_dduc_amt;
	}

	public String getAdjm_dedu_incm_tax(){
		return this.adjm_dedu_incm_tax;
	}

	public String getAdjm_dedu_res_tax(){
		return this.adjm_dedu_res_tax;
	}

	public String getAdjm_dedu_farm_spc_tax(){
		return this.adjm_dedu_farm_spc_tax;
	}

	public String getSaly_dduc_stot(){
		return this.saly_dduc_stot;
	}

	public String getCal_pay_amt(){
		return this.cal_pay_amt;
	}

	public String getEmp_clsf(){
		return this.emp_clsf;
	}

	public String getEtcsaly_spc(){
		return this.etcsaly_spc;
	}

	public String getPrsn_pens_dduc(){
		return this.prsn_pens_dduc;
	}

	public String getEtc_dduc_remk(){
		return this.etc_dduc_remk;
	}

	public String getEtc_dduc_nm1(){
		return this.etc_dduc_nm1;
	}

	public String getEtc_dduc_amt1(){
		return this.etc_dduc_amt1;
	}

	public String getEtc_dduc_nm2(){
		return this.etc_dduc_nm2;
	}

	public String getEtc_dduc_amt2(){
		return this.etc_dduc_amt2;
	}

	public String getEtc_dduc_nm3(){
		return this.etc_dduc_nm3;
	}

	public String getEtc_dduc_amt3(){
		return this.etc_dduc_amt3;
	}

	public String getBns_saly(){
		return this.bns_saly;
	}

	public String getNon_tax_food_alon(){
		return this.non_tax_food_alon;
	}

	public String getNon_tax_auto_driv_alon(){
		return this.non_tax_auto_driv_alon;
	}

	public String getNon_tax_jrnst(){
		return this.non_tax_jrnst;
	}

	public String getRepay_scl_exps(){
		return this.repay_scl_exps;
	}

	public String getEvngt_saly(){
		return this.evngt_saly;
	}

	public String getHlth_insr_med_care_insr_fee(){
		return this.hlth_insr_med_care_insr_fee;
	}

	public String getCongr_fee(){
		return this.congr_fee;
	}

	public String getEtc_alon_saly(){
		return this.etc_alon_saly;
	}

	public String getAdpay_amt(){
		return this.adpay_amt;
	}

	public String getHody_duty_alon(){
		return this.hody_duty_alon;
	}

	public String getHlth_insr_fee_adjm(){
		return this.hlth_insr_fee_adjm;
	}

	public String getPaty_dus_tot(){
		return this.paty_dus_tot;
	}

	public String getWelfare_fee(){
		return this.welfare_fee;
	}

	public String getCrc_dus_tot(){
		return this.crc_dus_tot;
	}

	public String getDty_acty_fee(){
		return this.dty_acty_fee;
	}

	public String getPrvmm_mstk_saly(){
		return this.prvmm_mstk_saly;
	}

	public String getEtc_dduc_nm4(){
		return this.etc_dduc_nm4;
	}

	public String getEtc_dduc_amt4(){
		return this.etc_dduc_amt4;
	}

	public String getEtc_dduc_nm5(){
		return this.etc_dduc_nm5;
	}

	public String getEtc_dduc_amt5(){
		return this.etc_dduc_amt5;
	}
}

/* 작성시간 : Wed Jun 10 13:55:44 KST 2015 */
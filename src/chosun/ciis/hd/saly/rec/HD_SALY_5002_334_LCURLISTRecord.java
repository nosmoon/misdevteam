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


package chosun.ciis.hd.saly.rec;

import java.sql.*;
import chosun.ciis.hd.saly.dm.*;
import chosun.ciis.hd.saly.ds.*;

/**
 * 
 */


public class HD_SALY_5002_334_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String flnm;
	public String emp_no;
	public String dept_nm;
	public String posi_nm;
	public String shft_bank_nm;
	public String shft_acct_no;
	public String saly_pay_dt;
	public String base_saly;
	public String posk_saly;
	public String bns_saly;
	public String month_amt;
	public String year_amt;
	public String non_tax_food_alon;
	public String non_tax_auto_driv_alon;
	public String non_tax_jrnst;
	public String evngt_saly;
	public String congr_fee;
	public String etc_alon_saly;
	public String hody_duty_alon;
	public String welfare_fee;
	public String yymm_alon;
	public String prvmm_mstk_saly;
	public String retr_saly;
	public String tot_pay_saly;
	public String deci_incm_tax;
	public String deci_res_tax;
	public String hlth_insr_fee;
	public String np_slf_ctrb_amt;
	public String emp_insr_fee;
	public String jnl_lon;
	public String repay_scl_exps;
	public String hlth_insr_med_care_insr_fee;
	public String hlth_insr_fee_adjm;
	public String crc_dus_tot;
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
	public String adpay_amt;

	public HD_SALY_5002_334_LCURLISTRecord(){}

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

	public void setBns_saly(String bns_saly){
		this.bns_saly = bns_saly;
	}

	public void setMonth_amt(String month_amt){
		this.month_amt = month_amt;
	}

	public void setYear_amt(String year_amt){
		this.year_amt = year_amt;
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

	public void setEvngt_saly(String evngt_saly){
		this.evngt_saly = evngt_saly;
	}

	public void setCongr_fee(String congr_fee){
		this.congr_fee = congr_fee;
	}

	public void setEtc_alon_saly(String etc_alon_saly){
		this.etc_alon_saly = etc_alon_saly;
	}

	public void setHody_duty_alon(String hody_duty_alon){
		this.hody_duty_alon = hody_duty_alon;
	}

	public void setWelfare_fee(String welfare_fee){
		this.welfare_fee = welfare_fee;
	}

	public void setYymm_alon(String yymm_alon){
		this.yymm_alon = yymm_alon;
	}

	
	public void setPrvmm_mstk_saly(String prvmm_mstk_saly){
		this.prvmm_mstk_saly = prvmm_mstk_saly;
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

	public void setRepay_scl_exps(String repay_scl_exps){
		this.repay_scl_exps = repay_scl_exps;
	}

	public void setHlth_insr_med_care_insr_fee(String hlth_insr_med_care_insr_fee){
		this.hlth_insr_med_care_insr_fee = hlth_insr_med_care_insr_fee;
	}

	public void setHlth_insr_fee_adjm(String hlth_insr_fee_adjm){
		this.hlth_insr_fee_adjm = hlth_insr_fee_adjm;
	}

	public void setCrc_dus_tot(String crc_dus_tot){
		this.crc_dus_tot = crc_dus_tot;
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

	public void setAdpay_amt(String adpay_amt){
		this.adpay_amt = adpay_amt;
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

	public String getBns_saly(){
		return this.bns_saly;
	}

	public String getMonth_amt(){
		return this.month_amt;
	}

	public String getYear_amt(){
		return this.year_amt;
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

	public String getEvngt_saly(){
		return this.evngt_saly;
	}

	public String getCongr_fee(){
		return this.congr_fee;
	}

	public String getEtc_alon_saly(){
		return this.etc_alon_saly;
	}

	public String getHody_duty_alon(){
		return this.hody_duty_alon;
	}

	public String getWelfare_fee(){
		return this.welfare_fee;
	}

	public String getYymm_alon(){
		return this.yymm_alon;
	}

	
	public String getPrvmm_mstk_saly(){
		return this.prvmm_mstk_saly;
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

	public String getRepay_scl_exps(){
		return this.repay_scl_exps;
	}

	public String getHlth_insr_med_care_insr_fee(){
		return this.hlth_insr_med_care_insr_fee;
	}

	public String getHlth_insr_fee_adjm(){
		return this.hlth_insr_fee_adjm;
	}

	public String getCrc_dus_tot(){
		return this.crc_dus_tot;
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

	public String getAdpay_amt(){
		return this.adpay_amt;
	}
}

/* 작성시간 : Mon Jun 09 11:42:10 KST 2014 */
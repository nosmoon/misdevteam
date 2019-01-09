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


package chosun.ciis.hd.saly.rec;

import java.sql.*;
import chosun.ciis.hd.saly.dm.*;
import chosun.ciis.hd.saly.ds.*;

/**
 * 
 */


public class HD_SALY_1410_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String dept_cd;
	public String dept_nm;
	public String emp_cnt;
	public String mm_pay_amt;
	public String base_saly;
	public String posk_saly;
	public String rgla_saly;
	public String week_hody_base_alon;
	public String week_hody_cmpn_alon;
	public String lgl_hody_base_alon;
	public String lgl_hody_cmpn_alon;
	public String nissu_dd_alon;
	public String nissu_dd_base_alon;
	public String vgl_fee;
	public String erl_prsnt_alon;
	public String prvmm_mstk_alon;
	public String etc_duty_alon;
	public String non_regu_alon_stot;
	public String prvmm_mstk_saly;
	public String retr_saly;
	public String corr_base_stay_fee;
	public String tot_pay_amt;

	public HD_SALY_1410_LCURLISTRecord(){}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setDept_nm(String dept_nm){
		this.dept_nm = dept_nm;
	}

	public void setEmp_cnt(String emp_cnt){
		this.emp_cnt = emp_cnt;
	}

	public void setMm_pay_amt(String mm_pay_amt){
		this.mm_pay_amt = mm_pay_amt;
	}

	public void setBase_saly(String base_saly){
		this.base_saly = base_saly;
	}

	public void setPosk_saly(String posk_saly){
		this.posk_saly = posk_saly;
	}

	public void setRgla_saly(String rgla_saly){
		this.rgla_saly = rgla_saly;
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

	public void setNissu_dd_base_alon(String nissu_dd_base_alon){
		this.nissu_dd_base_alon = nissu_dd_base_alon;
	}

	public void setVgl_fee(String vgl_fee){
		this.vgl_fee = vgl_fee;
	}

	public void setErl_prsnt_alon(String erl_prsnt_alon){
		this.erl_prsnt_alon = erl_prsnt_alon;
	}

	public void setPrvmm_mstk_alon(String prvmm_mstk_alon){
		this.prvmm_mstk_alon = prvmm_mstk_alon;
	}

	public void setEtc_duty_alon(String etc_duty_alon){
		this.etc_duty_alon = etc_duty_alon;
	}

	public void setNon_regu_alon_stot(String non_regu_alon_stot){
		this.non_regu_alon_stot = non_regu_alon_stot;
	}

	public void setPrvmm_mstk_saly(String prvmm_mstk_saly){
		this.prvmm_mstk_saly = prvmm_mstk_saly;
	}

	public void setRetr_saly(String retr_saly){
		this.retr_saly = retr_saly;
	}

	public void setCorr_base_stay_fee(String corr_base_stay_fee){
		this.corr_base_stay_fee = corr_base_stay_fee;
	}

	public void setTot_pay_amt(String tot_pay_amt){
		this.tot_pay_amt = tot_pay_amt;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getDept_nm(){
		return this.dept_nm;
	}

	public String getEmp_cnt(){
		return this.emp_cnt;
	}

	public String getMm_pay_amt(){
		return this.mm_pay_amt;
	}

	public String getBase_saly(){
		return this.base_saly;
	}

	public String getPosk_saly(){
		return this.posk_saly;
	}

	public String getRgla_saly(){
		return this.rgla_saly;
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

	public String getNissu_dd_base_alon(){
		return this.nissu_dd_base_alon;
	}

	public String getVgl_fee(){
		return this.vgl_fee;
	}

	public String getErl_prsnt_alon(){
		return this.erl_prsnt_alon;
	}

	public String getPrvmm_mstk_alon(){
		return this.prvmm_mstk_alon;
	}

	public String getEtc_duty_alon(){
		return this.etc_duty_alon;
	}

	public String getNon_regu_alon_stot(){
		return this.non_regu_alon_stot;
	}

	public String getPrvmm_mstk_saly(){
		return this.prvmm_mstk_saly;
	}

	public String getRetr_saly(){
		return this.retr_saly;
	}

	public String getCorr_base_stay_fee(){
		return this.corr_base_stay_fee;
	}

	public String getTot_pay_amt(){
		return this.tot_pay_amt;
	}
}

/* 작성시간 : Mon May 11 18:59:15 KST 2015 */
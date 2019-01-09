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


public class HD_SALY_1210_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String dept_nm;
	public String week_hody_base_alon_dds;
	public String week_hody_base_alon;
	public String week_hody_cmpn_alon_dds;
	public String week_hody_cmpn_alon;
	public String lgl_hody_base_alon_dds;
	public String lgl_hody_base_alon;
	public String lgl_hody_cmpn_alon_dds;
	public String lgl_hody_cmpn_alon;
	public String nissu_dd_alon_dds;
	public String nissu_dd_alon;
	public String nissu_dd_base_alon_dds;
	public String nissu_dd_base_alon;
	public String prvmm_mstk_alon;
	public String alvc_use_rat;
	public String alon_tot;
	public String p_alon_tot;
	public String pp_alon_tot;
	public String vgl_fee_dds;
	public String vgl_fee;
	public String erl_prsnt_alon_dds;
	public String erl_prsnt_alon;

	public HD_SALY_1210_LCURLISTRecord(){}

	public void setDept_nm(String dept_nm){
		this.dept_nm = dept_nm;
	}

	public void setWeek_hody_base_alon_dds(String week_hody_base_alon_dds){
		this.week_hody_base_alon_dds = week_hody_base_alon_dds;
	}

	public void setWeek_hody_base_alon(String week_hody_base_alon){
		this.week_hody_base_alon = week_hody_base_alon;
	}

	public void setWeek_hody_cmpn_alon_dds(String week_hody_cmpn_alon_dds){
		this.week_hody_cmpn_alon_dds = week_hody_cmpn_alon_dds;
	}

	public void setWeek_hody_cmpn_alon(String week_hody_cmpn_alon){
		this.week_hody_cmpn_alon = week_hody_cmpn_alon;
	}

	public void setLgl_hody_base_alon_dds(String lgl_hody_base_alon_dds){
		this.lgl_hody_base_alon_dds = lgl_hody_base_alon_dds;
	}

	public void setLgl_hody_base_alon(String lgl_hody_base_alon){
		this.lgl_hody_base_alon = lgl_hody_base_alon;
	}

	public void setLgl_hody_cmpn_alon_dds(String lgl_hody_cmpn_alon_dds){
		this.lgl_hody_cmpn_alon_dds = lgl_hody_cmpn_alon_dds;
	}

	public void setLgl_hody_cmpn_alon(String lgl_hody_cmpn_alon){
		this.lgl_hody_cmpn_alon = lgl_hody_cmpn_alon;
	}

	public void setNissu_dd_alon_dds(String nissu_dd_alon_dds){
		this.nissu_dd_alon_dds = nissu_dd_alon_dds;
	}

	public void setNissu_dd_alon(String nissu_dd_alon){
		this.nissu_dd_alon = nissu_dd_alon;
	}

	public void setNissu_dd_base_alon_dds(String nissu_dd_base_alon_dds){
		this.nissu_dd_base_alon_dds = nissu_dd_base_alon_dds;
	}

	public void setNissu_dd_base_alon(String nissu_dd_base_alon){
		this.nissu_dd_base_alon = nissu_dd_base_alon;
	}

	public void setPrvmm_mstk_alon(String prvmm_mstk_alon){
		this.prvmm_mstk_alon = prvmm_mstk_alon;
	}

	public void setAlvc_use_rat(String alvc_use_rat){
		this.alvc_use_rat = alvc_use_rat;
	}

	public void setAlon_tot(String alon_tot){
		this.alon_tot = alon_tot;
	}

	public void setP_alon_tot(String p_alon_tot){
		this.p_alon_tot = p_alon_tot;
	}

	public void setPp_alon_tot(String pp_alon_tot){
		this.pp_alon_tot = pp_alon_tot;
	}

	public void setVgl_fee_dds(String vgl_fee_dds){
		this.vgl_fee_dds = vgl_fee_dds;
	}

	public void setVgl_fee(String vgl_fee){
		this.vgl_fee = vgl_fee;
	}

	public void setErl_prsnt_alon_dds(String erl_prsnt_alon_dds){
		this.erl_prsnt_alon_dds = erl_prsnt_alon_dds;
	}

	public void setErl_prsnt_alon(String erl_prsnt_alon){
		this.erl_prsnt_alon = erl_prsnt_alon;
	}

	public String getDept_nm(){
		return this.dept_nm;
	}

	public String getWeek_hody_base_alon_dds(){
		return this.week_hody_base_alon_dds;
	}

	public String getWeek_hody_base_alon(){
		return this.week_hody_base_alon;
	}

	public String getWeek_hody_cmpn_alon_dds(){
		return this.week_hody_cmpn_alon_dds;
	}

	public String getWeek_hody_cmpn_alon(){
		return this.week_hody_cmpn_alon;
	}

	public String getLgl_hody_base_alon_dds(){
		return this.lgl_hody_base_alon_dds;
	}

	public String getLgl_hody_base_alon(){
		return this.lgl_hody_base_alon;
	}

	public String getLgl_hody_cmpn_alon_dds(){
		return this.lgl_hody_cmpn_alon_dds;
	}

	public String getLgl_hody_cmpn_alon(){
		return this.lgl_hody_cmpn_alon;
	}

	public String getNissu_dd_alon_dds(){
		return this.nissu_dd_alon_dds;
	}

	public String getNissu_dd_alon(){
		return this.nissu_dd_alon;
	}

	public String getNissu_dd_base_alon_dds(){
		return this.nissu_dd_base_alon_dds;
	}

	public String getNissu_dd_base_alon(){
		return this.nissu_dd_base_alon;
	}

	public String getPrvmm_mstk_alon(){
		return this.prvmm_mstk_alon;
	}

	public String getAlvc_use_rat(){
		return this.alvc_use_rat;
	}

	public String getAlon_tot(){
		return this.alon_tot;
	}

	public String getP_alon_tot(){
		return this.p_alon_tot;
	}

	public String getPp_alon_tot(){
		return this.pp_alon_tot;
	}

	public String getVgl_fee_dds(){
		return this.vgl_fee_dds;
	}

	public String getVgl_fee(){
		return this.vgl_fee;
	}

	public String getErl_prsnt_alon_dds(){
		return this.erl_prsnt_alon_dds;
	}

	public String getErl_prsnt_alon(){
		return this.erl_prsnt_alon;
	}
}

/* 작성시간 : Mon May 11 16:38:59 KST 2015 */
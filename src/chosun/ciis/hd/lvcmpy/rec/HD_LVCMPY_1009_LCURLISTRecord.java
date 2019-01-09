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


package chosun.ciis.hd.lvcmpy.rec;

import java.sql.*;
import chosun.ciis.hd.lvcmpy.dm.*;
import chosun.ciis.hd.lvcmpy.ds.*;

/**
 * 
 */


public class HD_LVCMPY_1009_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String lvcmpy_dt;
	public String rvrs_prd_frdt;
	public String rvrs_prd_todt;
	public String dept_cd;
	public String dept_nm;
	public String in_cmpy_dt;
	public String last_midl_adjm_dt;
	public String real_lvcmpy_dt;
	public String cont_svc_yys;
	public String cont_svc_yy;
	public String cont_svc_dd;
	public String last_mm_saly_1;
	public String last_mm_saly_2;
	public String last_mm_saly_3;
	public String last_mm_saly_4;
	public String last_mm_saly_add;
	public String last_mm_alon_1;
	public String last_mm_alon_2;
	public String last_mm_alon_3;
	public String last_mm_alon_4;
	public String last_mm_alon_add;
	public String year_alon_pay_yymm;
	public String year_alon_pay_amt;
	public String mm_avg_charg_amt;
	public String lvcmpy_amt;
	public String lvcmpy_mm_saly;
	public String yymm_alon_1;
	public String year_cnt_1;
	public String duty_cnt_1;
	public String em_cnt_1;
	public String yy_alon_use_stot_1;
	public String yy_alon_2;
	public String year_cnt_2;
	public String duty_cnt_2;
	public String em_cnt_2;
	public String yy_alon_use_stot_2;
	public String un_pay_alon;
	public String lvcmpy_add_amt;
	public String nm_lvcmpy_add_amt;
	public String cont_svc_yys_2012;
	public String cont_svc_yys_2013;
	public String avg_wag_dt;
	public String last_mm_dty_acty_fee_1;
	public String last_mm_dty_acty_fee_2;
	public String last_mm_dty_acty_fee_3;
	public String last_mm_dty_acty_fee_4;
	public String last_mm_dty_acty_fee_add;

	public HD_LVCMPY_1009_LCURLISTRecord(){}

	public void setLvcmpy_dt(String lvcmpy_dt){
		this.lvcmpy_dt = lvcmpy_dt;
	}

	public void setRvrs_prd_frdt(String rvrs_prd_frdt){
		this.rvrs_prd_frdt = rvrs_prd_frdt;
	}

	public void setRvrs_prd_todt(String rvrs_prd_todt){
		this.rvrs_prd_todt = rvrs_prd_todt;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setDept_nm(String dept_nm){
		this.dept_nm = dept_nm;
	}

	public void setIn_cmpy_dt(String in_cmpy_dt){
		this.in_cmpy_dt = in_cmpy_dt;
	}

	public void setLast_midl_adjm_dt(String last_midl_adjm_dt){
		this.last_midl_adjm_dt = last_midl_adjm_dt;
	}

	public void setReal_lvcmpy_dt(String real_lvcmpy_dt){
		this.real_lvcmpy_dt = real_lvcmpy_dt;
	}

	public void setCont_svc_yys(String cont_svc_yys){
		this.cont_svc_yys = cont_svc_yys;
	}

	public void setCont_svc_yy(String cont_svc_yy){
		this.cont_svc_yy = cont_svc_yy;
	}

	public void setCont_svc_dd(String cont_svc_dd){
		this.cont_svc_dd = cont_svc_dd;
	}

	public void setLast_mm_saly_1(String last_mm_saly_1){
		this.last_mm_saly_1 = last_mm_saly_1;
	}

	public void setLast_mm_saly_2(String last_mm_saly_2){
		this.last_mm_saly_2 = last_mm_saly_2;
	}

	public void setLast_mm_saly_3(String last_mm_saly_3){
		this.last_mm_saly_3 = last_mm_saly_3;
	}

	public void setLast_mm_saly_4(String last_mm_saly_4){
		this.last_mm_saly_4 = last_mm_saly_4;
	}

	public void setLast_mm_saly_add(String last_mm_saly_add){
		this.last_mm_saly_add = last_mm_saly_add;
	}

	public void setLast_mm_alon_1(String last_mm_alon_1){
		this.last_mm_alon_1 = last_mm_alon_1;
	}

	public void setLast_mm_alon_2(String last_mm_alon_2){
		this.last_mm_alon_2 = last_mm_alon_2;
	}

	public void setLast_mm_alon_3(String last_mm_alon_3){
		this.last_mm_alon_3 = last_mm_alon_3;
	}

	public void setLast_mm_alon_4(String last_mm_alon_4){
		this.last_mm_alon_4 = last_mm_alon_4;
	}

	public void setLast_mm_alon_add(String last_mm_alon_add){
		this.last_mm_alon_add = last_mm_alon_add;
	}

	public void setYear_alon_pay_yymm(String year_alon_pay_yymm){
		this.year_alon_pay_yymm = year_alon_pay_yymm;
	}

	public void setYear_alon_pay_amt(String year_alon_pay_amt){
		this.year_alon_pay_amt = year_alon_pay_amt;
	}

	public void setMm_avg_charg_amt(String mm_avg_charg_amt){
		this.mm_avg_charg_amt = mm_avg_charg_amt;
	}

	public void setLvcmpy_amt(String lvcmpy_amt){
		this.lvcmpy_amt = lvcmpy_amt;
	}

	public void setLvcmpy_mm_saly(String lvcmpy_mm_saly){
		this.lvcmpy_mm_saly = lvcmpy_mm_saly;
	}

	public void setYymm_alon_1(String yymm_alon_1){
		this.yymm_alon_1 = yymm_alon_1;
	}

	public void setYear_cnt_1(String year_cnt_1){
		this.year_cnt_1 = year_cnt_1;
	}

	public void setDuty_cnt_1(String duty_cnt_1){
		this.duty_cnt_1 = duty_cnt_1;
	}

	public void setEm_cnt_1(String em_cnt_1){
		this.em_cnt_1 = em_cnt_1;
	}

	public void setYy_alon_use_stot_1(String yy_alon_use_stot_1){
		this.yy_alon_use_stot_1 = yy_alon_use_stot_1;
	}

	public void setYy_alon_2(String yy_alon_2){
		this.yy_alon_2 = yy_alon_2;
	}

	public void setYear_cnt_2(String year_cnt_2){
		this.year_cnt_2 = year_cnt_2;
	}

	public void setDuty_cnt_2(String duty_cnt_2){
		this.duty_cnt_2 = duty_cnt_2;
	}

	public void setEm_cnt_2(String em_cnt_2){
		this.em_cnt_2 = em_cnt_2;
	}

	public void setYy_alon_use_stot_2(String yy_alon_use_stot_2){
		this.yy_alon_use_stot_2 = yy_alon_use_stot_2;
	}

	public void setUn_pay_alon(String un_pay_alon){
		this.un_pay_alon = un_pay_alon;
	}

	public void setLvcmpy_add_amt(String lvcmpy_add_amt){
		this.lvcmpy_add_amt = lvcmpy_add_amt;
	}

	public void setNm_lvcmpy_add_amt(String nm_lvcmpy_add_amt){
		this.nm_lvcmpy_add_amt = nm_lvcmpy_add_amt;
	}

	public void setCont_svc_yys_2012(String cont_svc_yys_2012){
		this.cont_svc_yys_2012 = cont_svc_yys_2012;
	}

	public void setCont_svc_yys_2013(String cont_svc_yys_2013){
		this.cont_svc_yys_2013 = cont_svc_yys_2013;
	}

	public void setAvg_wag_dt(String avg_wag_dt){
		this.avg_wag_dt = avg_wag_dt;
	}

	public void setLast_mm_dty_acty_fee_1(String last_mm_dty_acty_fee_1){
		this.last_mm_dty_acty_fee_1 = last_mm_dty_acty_fee_1;
	}

	public void setLast_mm_dty_acty_fee_2(String last_mm_dty_acty_fee_2){
		this.last_mm_dty_acty_fee_2 = last_mm_dty_acty_fee_2;
	}

	public void setLast_mm_dty_acty_fee_3(String last_mm_dty_acty_fee_3){
		this.last_mm_dty_acty_fee_3 = last_mm_dty_acty_fee_3;
	}

	public void setLast_mm_dty_acty_fee_4(String last_mm_dty_acty_fee_4){
		this.last_mm_dty_acty_fee_4 = last_mm_dty_acty_fee_4;
	}

	public void setLast_mm_dty_acty_fee_add(String last_mm_dty_acty_fee_add){
		this.last_mm_dty_acty_fee_add = last_mm_dty_acty_fee_add;
	}

	public String getLvcmpy_dt(){
		return this.lvcmpy_dt;
	}

	public String getRvrs_prd_frdt(){
		return this.rvrs_prd_frdt;
	}

	public String getRvrs_prd_todt(){
		return this.rvrs_prd_todt;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getDept_nm(){
		return this.dept_nm;
	}

	public String getIn_cmpy_dt(){
		return this.in_cmpy_dt;
	}

	public String getLast_midl_adjm_dt(){
		return this.last_midl_adjm_dt;
	}

	public String getReal_lvcmpy_dt(){
		return this.real_lvcmpy_dt;
	}

	public String getCont_svc_yys(){
		return this.cont_svc_yys;
	}

	public String getCont_svc_yy(){
		return this.cont_svc_yy;
	}

	public String getCont_svc_dd(){
		return this.cont_svc_dd;
	}

	public String getLast_mm_saly_1(){
		return this.last_mm_saly_1;
	}

	public String getLast_mm_saly_2(){
		return this.last_mm_saly_2;
	}

	public String getLast_mm_saly_3(){
		return this.last_mm_saly_3;
	}

	public String getLast_mm_saly_4(){
		return this.last_mm_saly_4;
	}

	public String getLast_mm_saly_add(){
		return this.last_mm_saly_add;
	}

	public String getLast_mm_alon_1(){
		return this.last_mm_alon_1;
	}

	public String getLast_mm_alon_2(){
		return this.last_mm_alon_2;
	}

	public String getLast_mm_alon_3(){
		return this.last_mm_alon_3;
	}

	public String getLast_mm_alon_4(){
		return this.last_mm_alon_4;
	}

	public String getLast_mm_alon_add(){
		return this.last_mm_alon_add;
	}

	public String getYear_alon_pay_yymm(){
		return this.year_alon_pay_yymm;
	}

	public String getYear_alon_pay_amt(){
		return this.year_alon_pay_amt;
	}

	public String getMm_avg_charg_amt(){
		return this.mm_avg_charg_amt;
	}

	public String getLvcmpy_amt(){
		return this.lvcmpy_amt;
	}

	public String getLvcmpy_mm_saly(){
		return this.lvcmpy_mm_saly;
	}

	public String getYymm_alon_1(){
		return this.yymm_alon_1;
	}

	public String getYear_cnt_1(){
		return this.year_cnt_1;
	}

	public String getDuty_cnt_1(){
		return this.duty_cnt_1;
	}

	public String getEm_cnt_1(){
		return this.em_cnt_1;
	}

	public String getYy_alon_use_stot_1(){
		return this.yy_alon_use_stot_1;
	}

	public String getYy_alon_2(){
		return this.yy_alon_2;
	}

	public String getYear_cnt_2(){
		return this.year_cnt_2;
	}

	public String getDuty_cnt_2(){
		return this.duty_cnt_2;
	}

	public String getEm_cnt_2(){
		return this.em_cnt_2;
	}

	public String getYy_alon_use_stot_2(){
		return this.yy_alon_use_stot_2;
	}

	public String getUn_pay_alon(){
		return this.un_pay_alon;
	}

	public String getLvcmpy_add_amt(){
		return this.lvcmpy_add_amt;
	}

	public String getNm_lvcmpy_add_amt(){
		return this.nm_lvcmpy_add_amt;
	}

	public String getCont_svc_yys_2012(){
		return this.cont_svc_yys_2012;
	}

	public String getCont_svc_yys_2013(){
		return this.cont_svc_yys_2013;
	}

	public String getAvg_wag_dt(){
		return this.avg_wag_dt;
	}

	public String getLast_mm_dty_acty_fee_1(){
		return this.last_mm_dty_acty_fee_1;
	}

	public String getLast_mm_dty_acty_fee_2(){
		return this.last_mm_dty_acty_fee_2;
	}

	public String getLast_mm_dty_acty_fee_3(){
		return this.last_mm_dty_acty_fee_3;
	}

	public String getLast_mm_dty_acty_fee_4(){
		return this.last_mm_dty_acty_fee_4;
	}

	public String getLast_mm_dty_acty_fee_add(){
		return this.last_mm_dty_acty_fee_add;
	}
}

/* 작성시간 : Fri Mar 31 18:07:54 KST 2017 */
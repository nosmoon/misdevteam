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


package chosun.ciis.hd.trip.rec;

import java.sql.*;
import chosun.ciis.hd.trip.dm.*;
import chosun.ciis.hd.trip.ds.*;

/**
 * 
 */


public class HD_TRIP_1501_LCURLIST2Record extends java.lang.Object implements java.io.Serializable{

	public String g_cmpy_cd;
	public String g_emp_no;
	public String g_occr_dt;
	public String g_seq;
	public String g_with_seq;
	public String g_nm_korn;
	public String g_dept_cd;
	public String g_dept_nm;
	public String g_dty_cd;
	public String g_dty_nm;
	public String g_posi_cd;
	public String g_posi_nm;
	public String g_aviat_fee;
	public String g_fix_aviat_fee;
	public String g_adjm_aviat_fee;
	public String g_stay_fee;
	public String g_fix_stay_fee;
	public String g_adjm_stay_fee;
	public String g_dd_fee;
	public String g_fix_dd_fee;
	public String g_adjm_dd_fee;
	public String g_cost_fix_clsf;

	public HD_TRIP_1501_LCURLIST2Record(){}

	public void setG_cmpy_cd(String g_cmpy_cd){
		this.g_cmpy_cd = g_cmpy_cd;
	}

	public void setG_emp_no(String g_emp_no){
		this.g_emp_no = g_emp_no;
	}

	public void setG_occr_dt(String g_occr_dt){
		this.g_occr_dt = g_occr_dt;
	}

	public void setG_seq(String g_seq){
		this.g_seq = g_seq;
	}

	public void setG_with_seq(String g_with_seq){
		this.g_with_seq = g_with_seq;
	}

	public void setG_nm_korn(String g_nm_korn){
		this.g_nm_korn = g_nm_korn;
	}

	public void setG_dept_cd(String g_dept_cd){
		this.g_dept_cd = g_dept_cd;
	}

	public void setG_dept_nm(String g_dept_nm){
		this.g_dept_nm = g_dept_nm;
	}

	public void setG_dty_cd(String g_dty_cd){
		this.g_dty_cd = g_dty_cd;
	}

	public void setG_dty_nm(String g_dty_nm){
		this.g_dty_nm = g_dty_nm;
	}

	public void setG_posi_cd(String g_posi_cd){
		this.g_posi_cd = g_posi_cd;
	}

	public void setG_posi_nm(String g_posi_nm){
		this.g_posi_nm = g_posi_nm;
	}

	public void setG_aviat_fee(String g_aviat_fee){
		this.g_aviat_fee = g_aviat_fee;
	}

	public void setG_fix_aviat_fee(String g_fix_aviat_fee){
		this.g_fix_aviat_fee = g_fix_aviat_fee;
	}

	public void setG_adjm_aviat_fee(String g_adjm_aviat_fee){
		this.g_adjm_aviat_fee = g_adjm_aviat_fee;
	}

	public void setG_stay_fee(String g_stay_fee){
		this.g_stay_fee = g_stay_fee;
	}

	public void setG_fix_stay_fee(String g_fix_stay_fee){
		this.g_fix_stay_fee = g_fix_stay_fee;
	}

	public void setG_adjm_stay_fee(String g_adjm_stay_fee){
		this.g_adjm_stay_fee = g_adjm_stay_fee;
	}

	public void setG_dd_fee(String g_dd_fee){
		this.g_dd_fee = g_dd_fee;
	}

	public void setG_fix_dd_fee(String g_fix_dd_fee){
		this.g_fix_dd_fee = g_fix_dd_fee;
	}

	public void setG_adjm_dd_fee(String g_adjm_dd_fee){
		this.g_adjm_dd_fee = g_adjm_dd_fee;
	}

	public void setG_cost_fix_clsf(String g_cost_fix_clsf){
		this.g_cost_fix_clsf = g_cost_fix_clsf;
	}

	public String getG_cmpy_cd(){
		return this.g_cmpy_cd;
	}

	public String getG_emp_no(){
		return this.g_emp_no;
	}

	public String getG_occr_dt(){
		return this.g_occr_dt;
	}

	public String getG_seq(){
		return this.g_seq;
	}

	public String getG_with_seq(){
		return this.g_with_seq;
	}

	public String getG_nm_korn(){
		return this.g_nm_korn;
	}

	public String getG_dept_cd(){
		return this.g_dept_cd;
	}

	public String getG_dept_nm(){
		return this.g_dept_nm;
	}

	public String getG_dty_cd(){
		return this.g_dty_cd;
	}

	public String getG_dty_nm(){
		return this.g_dty_nm;
	}

	public String getG_posi_cd(){
		return this.g_posi_cd;
	}

	public String getG_posi_nm(){
		return this.g_posi_nm;
	}

	public String getG_aviat_fee(){
		return this.g_aviat_fee;
	}

	public String getG_fix_aviat_fee(){
		return this.g_fix_aviat_fee;
	}

	public String getG_adjm_aviat_fee(){
		return this.g_adjm_aviat_fee;
	}

	public String getG_stay_fee(){
		return this.g_stay_fee;
	}

	public String getG_fix_stay_fee(){
		return this.g_fix_stay_fee;
	}

	public String getG_adjm_stay_fee(){
		return this.g_adjm_stay_fee;
	}

	public String getG_dd_fee(){
		return this.g_dd_fee;
	}

	public String getG_fix_dd_fee(){
		return this.g_fix_dd_fee;
	}

	public String getG_adjm_dd_fee(){
		return this.g_adjm_dd_fee;
	}

	public String getG_cost_fix_clsf(){
		return this.g_cost_fix_clsf;
	}
}

/* 작성시간 : Mon May 11 18:19:53 KST 2009 */
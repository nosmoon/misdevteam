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


package chosun.ciis.hd.evlu.rec;

import java.sql.*;
import chosun.ciis.hd.evlu.dm.*;
import chosun.ciis.hd.evlu.ds.*;

/**
 * 
 */


public class HD_EVLU_5706_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String rnum;
	public String emp_no;
	public String nm_korn;
	public String up_insd_dept_cd;
	public String up_insd_dept_nm;
	public String dept_cd;
	public String abrv_nm;
	public String evlu_grp_cd;
	public String up_emp_no1;
	public String up_nm_korn1;
	public String up_emp_no2;
	public String up_nm_korn2;
	public String obj_excl_clsf;
	public String posk_clas_cd;
	public String posk_clas_cd_nm;
	public String in_cmpy_dt;
	public String bet_in_cmpy_dt;
	public String mtry_dt;

	public HD_EVLU_5706_LCURLISTRecord(){}

	public void setRnum(String rnum){
		this.rnum = rnum;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setNm_korn(String nm_korn){
		this.nm_korn = nm_korn;
	}

	public void setUp_insd_dept_cd(String up_insd_dept_cd){
		this.up_insd_dept_cd = up_insd_dept_cd;
	}

	public void setUp_insd_dept_nm(String up_insd_dept_nm){
		this.up_insd_dept_nm = up_insd_dept_nm;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setAbrv_nm(String abrv_nm){
		this.abrv_nm = abrv_nm;
	}

	public void setEvlu_grp_cd(String evlu_grp_cd){
		this.evlu_grp_cd = evlu_grp_cd;
	}

	public void setUp_emp_no1(String up_emp_no1){
		this.up_emp_no1 = up_emp_no1;
	}

	public void setUp_nm_korn1(String up_nm_korn1){
		this.up_nm_korn1 = up_nm_korn1;
	}

	public void setUp_emp_no2(String up_emp_no2){
		this.up_emp_no2 = up_emp_no2;
	}

	public void setUp_nm_korn2(String up_nm_korn2){
		this.up_nm_korn2 = up_nm_korn2;
	}

	public void setObj_excl_clsf(String obj_excl_clsf){
		this.obj_excl_clsf = obj_excl_clsf;
	}

	public void setPosk_clas_cd(String posk_clas_cd){
		this.posk_clas_cd = posk_clas_cd;
	}

	public void setPosk_clas_cd_nm(String posk_clas_cd_nm){
		this.posk_clas_cd_nm = posk_clas_cd_nm;
	}

	public void setIn_cmpy_dt(String in_cmpy_dt){
		this.in_cmpy_dt = in_cmpy_dt;
	}

	public void setBet_in_cmpy_dt(String bet_in_cmpy_dt){
		this.bet_in_cmpy_dt = bet_in_cmpy_dt;
	}

	public void setMtry_dt(String mtry_dt){
		this.mtry_dt = mtry_dt;
	}

	public String getRnum(){
		return this.rnum;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getNm_korn(){
		return this.nm_korn;
	}

	public String getUp_insd_dept_cd(){
		return this.up_insd_dept_cd;
	}

	public String getUp_insd_dept_nm(){
		return this.up_insd_dept_nm;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getAbrv_nm(){
		return this.abrv_nm;
	}

	public String getEvlu_grp_cd(){
		return this.evlu_grp_cd;
	}

	public String getUp_emp_no1(){
		return this.up_emp_no1;
	}

	public String getUp_nm_korn1(){
		return this.up_nm_korn1;
	}

	public String getUp_emp_no2(){
		return this.up_emp_no2;
	}

	public String getUp_nm_korn2(){
		return this.up_nm_korn2;
	}

	public String getObj_excl_clsf(){
		return this.obj_excl_clsf;
	}

	public String getPosk_clas_cd(){
		return this.posk_clas_cd;
	}

	public String getPosk_clas_cd_nm(){
		return this.posk_clas_cd_nm;
	}

	public String getIn_cmpy_dt(){
		return this.in_cmpy_dt;
	}

	public String getBet_in_cmpy_dt(){
		return this.bet_in_cmpy_dt;
	}

	public String getMtry_dt(){
		return this.mtry_dt;
	}
}

/* 작성시간 : Tue Jun 16 10:32:07 KST 2009 */
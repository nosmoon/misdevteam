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


package chosun.ciis.hd.evlu.rec;

import java.sql.*;
import chosun.ciis.hd.evlu.dm.*;
import chosun.ciis.hd.evlu.ds.*;

/**
 * 
 */


public class HD_EVLU_6200_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String rnum;
	public String evlu_grp_cd;
	public String evlu_grp_nm;
	public String up_insd_dept_nm;
	public String dept_cd;
	public String abrv_nm;
	public String emp_no;
	public String nm_korn;
	public String evlu_scor_1tms;
	public String evlu_scor_2tms;
	public String avg_scor;
	public String dept_avg;
	public String grp_avg;
	public String rvis_scor;
	public String rank;
	public String percentage;
	public String last_grad;
	public String up_nm_korn1;
	public String up_nm_korn2;
	public String rvis_end_yn;

	public HD_EVLU_6200_LCURLISTRecord(){}

	public void setRnum(String rnum){
		this.rnum = rnum;
	}

	public void setEvlu_grp_cd(String evlu_grp_cd){
		this.evlu_grp_cd = evlu_grp_cd;
	}

	public void setEvlu_grp_nm(String evlu_grp_nm){
		this.evlu_grp_nm = evlu_grp_nm;
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

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setNm_korn(String nm_korn){
		this.nm_korn = nm_korn;
	}

	public void setEvlu_scor_1tms(String evlu_scor_1tms){
		this.evlu_scor_1tms = evlu_scor_1tms;
	}

	public void setEvlu_scor_2tms(String evlu_scor_2tms){
		this.evlu_scor_2tms = evlu_scor_2tms;
	}

	public void setAvg_scor(String avg_scor){
		this.avg_scor = avg_scor;
	}

	public void setDept_avg(String dept_avg){
		this.dept_avg = dept_avg;
	}

	public void setGrp_avg(String grp_avg){
		this.grp_avg = grp_avg;
	}

	public void setRvis_scor(String rvis_scor){
		this.rvis_scor = rvis_scor;
	}

	public void setRank(String rank){
		this.rank = rank;
	}

	public void setPercentage(String percentage){
		this.percentage = percentage;
	}

	public void setLast_grad(String last_grad){
		this.last_grad = last_grad;
	}

	public void setUp_nm_korn1(String up_nm_korn1){
		this.up_nm_korn1 = up_nm_korn1;
	}

	public void setUp_nm_korn2(String up_nm_korn2){
		this.up_nm_korn2 = up_nm_korn2;
	}

	public void setRvis_end_yn(String rvis_end_yn){
		this.rvis_end_yn = rvis_end_yn;
	}

	public String getRnum(){
		return this.rnum;
	}

	public String getEvlu_grp_cd(){
		return this.evlu_grp_cd;
	}

	public String getEvlu_grp_nm(){
		return this.evlu_grp_nm;
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

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getNm_korn(){
		return this.nm_korn;
	}

	public String getEvlu_scor_1tms(){
		return this.evlu_scor_1tms;
	}

	public String getEvlu_scor_2tms(){
		return this.evlu_scor_2tms;
	}

	public String getAvg_scor(){
		return this.avg_scor;
	}

	public String getDept_avg(){
		return this.dept_avg;
	}

	public String getGrp_avg(){
		return this.grp_avg;
	}

	public String getRvis_scor(){
		return this.rvis_scor;
	}

	public String getRank(){
		return this.rank;
	}

	public String getPercentage(){
		return this.percentage;
	}

	public String getLast_grad(){
		return this.last_grad;
	}

	public String getUp_nm_korn1(){
		return this.up_nm_korn1;
	}

	public String getUp_nm_korn2(){
		return this.up_nm_korn2;
	}

	public String getRvis_end_yn(){
		return this.rvis_end_yn;
	}
}

/* 작성시간 : Mon Oct 12 17:58:26 KST 2015 */
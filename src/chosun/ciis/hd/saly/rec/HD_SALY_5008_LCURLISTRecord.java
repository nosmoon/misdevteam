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


public class HD_SALY_5008_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String emp_no_1;
	public String emp_impn_amt;
	public String emp_slf_burd_amt;
	public String emp_adjm_obj_amt;
	public String emp_ipymt_six_mm_amt;
	public String emp_mm_dduc_base_amt;
	public String emp_ipymt_amt;
	public String emp_mm_dduc_tot_amt;
	public String emp_befr_dduc_amt;
	public String emp_ipymt_months;
	public String emp_no_2;
	public String hlth_impn_amt;
	public String hlth_slf_burd_amt;
	public String hlth_adjm_obj_amt;
	public String hlth_ipymt_six_mm_amt;
	public String hlth_mm_dduc_base_amt;
	public String hlth_ipymt_amt;
	public String hlth_mm_dduc_tot_amt;
	public String hlth_befr_dduc_amt;
	public String hlth_ipymt_months;

	public HD_SALY_5008_LCURLISTRecord(){}

	public void setEmp_no_1(String emp_no_1){
		this.emp_no_1 = emp_no_1;
	}

	public void setEmp_impn_amt(String emp_impn_amt){
		this.emp_impn_amt = emp_impn_amt;
	}

	public void setEmp_slf_burd_amt(String emp_slf_burd_amt){
		this.emp_slf_burd_amt = emp_slf_burd_amt;
	}

	public void setEmp_adjm_obj_amt(String emp_adjm_obj_amt){
		this.emp_adjm_obj_amt = emp_adjm_obj_amt;
	}

	public void setEmp_ipymt_six_mm_amt(String emp_ipymt_six_mm_amt){
		this.emp_ipymt_six_mm_amt = emp_ipymt_six_mm_amt;
	}

	public void setEmp_mm_dduc_base_amt(String emp_mm_dduc_base_amt){
		this.emp_mm_dduc_base_amt = emp_mm_dduc_base_amt;
	}

	public void setEmp_ipymt_amt(String emp_ipymt_amt){
		this.emp_ipymt_amt = emp_ipymt_amt;
	}

	public void setEmp_mm_dduc_tot_amt(String emp_mm_dduc_tot_amt){
		this.emp_mm_dduc_tot_amt = emp_mm_dduc_tot_amt;
	}

	public void setEmp_befr_dduc_amt(String emp_befr_dduc_amt){
		this.emp_befr_dduc_amt = emp_befr_dduc_amt;
	}
	
	public void setEmp_ipymt_months(String emp_ipymt_months){
		this.emp_ipymt_months = emp_ipymt_months;
	}

	public void setEmp_no_2(String emp_no_2){
		this.emp_no_2 = emp_no_2;
	}

	public void setHlth_impn_amt(String hlth_impn_amt){
		this.hlth_impn_amt = hlth_impn_amt;
	}

	public void setHlth_slf_burd_amt(String hlth_slf_burd_amt){
		this.hlth_slf_burd_amt = hlth_slf_burd_amt;
	}

	public void setHlth_adjm_obj_amt(String hlth_adjm_obj_amt){
		this.hlth_adjm_obj_amt = hlth_adjm_obj_amt;
	}

	public void setHlth_ipymt_six_mm_amt(String hlth_ipymt_six_mm_amt){
		this.hlth_ipymt_six_mm_amt = hlth_ipymt_six_mm_amt;
	}

	public void setHlth_mm_dduc_base_amt(String hlth_mm_dduc_base_amt){
		this.hlth_mm_dduc_base_amt = hlth_mm_dduc_base_amt;
	}

	public void setHlth_ipymt_amt(String hlth_ipymt_amt){
		this.hlth_ipymt_amt = hlth_ipymt_amt;
	}

	public void setHlth_mm_dduc_tot_amt(String hlth_mm_dduc_tot_amt){
		this.hlth_mm_dduc_tot_amt = hlth_mm_dduc_tot_amt;
	}

	public void setHlth_befr_dduc_amt(String hlth_befr_dduc_amt){
		this.hlth_befr_dduc_amt = hlth_befr_dduc_amt;
	}

	public void setHlth_ipymt_months(String hlth_ipymt_months){
		this.hlth_ipymt_months = hlth_ipymt_months;
	}
	
	public String getEmp_no_1(){
		return this.emp_no_1;
	}

	public String getEmp_impn_amt(){
		return this.emp_impn_amt;
	}

	public String getEmp_slf_burd_amt(){
		return this.emp_slf_burd_amt;
	}

	public String getEmp_adjm_obj_amt(){
		return this.emp_adjm_obj_amt;
	}

	public String getEmp_ipymt_six_mm_amt(){
		return this.emp_ipymt_six_mm_amt;
	}

	public String getEmp_mm_dduc_base_amt(){
		return this.emp_mm_dduc_base_amt;
	}

	public String getEmp_ipymt_amt(){
		return this.emp_ipymt_amt;
	}

	public String getEmp_mm_dduc_tot_amt(){
		return this.emp_mm_dduc_tot_amt;
	}

	public String getEmp_befr_dduc_amt(){
		return this.emp_befr_dduc_amt;
	}

	public String getEmp_ipymt_months(){
		return this.emp_ipymt_months;
	} 
	
	public String getEmp_no_2(){
		return this.emp_no_2;
	}

	public String getHlth_impn_amt(){
		return this.hlth_impn_amt;
	}

	public String getHlth_slf_burd_amt(){
		return this.hlth_slf_burd_amt;
	}

	public String getHlth_adjm_obj_amt(){
		return this.hlth_adjm_obj_amt;
	}

	public String getHlth_ipymt_six_mm_amt(){
		return this.hlth_ipymt_six_mm_amt;
	}

	public String getHlth_mm_dduc_base_amt(){
		return this.hlth_mm_dduc_base_amt;
	}

	public String getHlth_ipymt_amt(){
		return this.hlth_ipymt_amt;
	}

	public String getHlth_mm_dduc_tot_amt(){
		return this.hlth_mm_dduc_tot_amt;
	}

	public String getHlth_befr_dduc_amt(){
		return this.hlth_befr_dduc_amt;
	}
	public String getHlth_ipymt_months(){
		return this.hlth_ipymt_months;
	} 
}

/* 작성시간 : Tue Apr 21 18:16:51 KST 2015 */
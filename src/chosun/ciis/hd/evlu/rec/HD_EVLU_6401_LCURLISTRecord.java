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


public class HD_EVLU_6401_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String evlu_grp_nm;
	public String dept_nm;
	public String tgt_evlu_pers_emp_no;
	public String tgt_evlu_pers_nm_korn;
	public String rvis_scor;
	public String rank;
	public String last_grad;
	public String evlu_pers_emp_no_1tms;
	public String evlu_pers_nm_korn1;
	public String evlu_pers_emp_no_2tms;
	public String evlu_pers_nm_korn2;
	public String grad_nm_1tms_10;
	public String grad_nm_1tms_20;
	public String grad_nm_1tms_30;
	public String grad_nm_1tms_40;
	public String grad_nm_1tms_50;
	public String grad_nm_1tms_60;
	public String grad_nm_1tms_70;
	public String grad_nm_2tms_10;
	public String grad_nm_2tms_20;
	public String grad_nm_2tms_30;
	public String grad_nm_2tms_40;
	public String grad_nm_2tms_50;
	public String grad_nm_2tms_60;
	public String grad_nm_2tms_70;
	public String tot_evlu_1tms;
	public String tot_evlu_2tms;

	public HD_EVLU_6401_LCURLISTRecord(){}

	public void setEvlu_grp_nm(String evlu_grp_nm){
		this.evlu_grp_nm = evlu_grp_nm;
	}

	public void setDept_nm(String dept_nm){
		this.dept_nm = dept_nm;
	}

	public void setTgt_evlu_pers_emp_no(String tgt_evlu_pers_emp_no){
		this.tgt_evlu_pers_emp_no = tgt_evlu_pers_emp_no;
	}

	public void setTgt_evlu_pers_nm_korn(String tgt_evlu_pers_nm_korn){
		this.tgt_evlu_pers_nm_korn = tgt_evlu_pers_nm_korn;
	}

	public void setRvis_scor(String rvis_scor){
		this.rvis_scor = rvis_scor;
	}

	public void setRank(String rank){
		this.rank = rank;
	}

	public void setLast_grad(String last_grad){
		this.last_grad = last_grad;
	}

	public void setEvlu_pers_emp_no_1tms(String evlu_pers_emp_no_1tms){
		this.evlu_pers_emp_no_1tms = evlu_pers_emp_no_1tms;
	}

	public void setEvlu_pers_nm_korn1(String evlu_pers_nm_korn1){
		this.evlu_pers_nm_korn1 = evlu_pers_nm_korn1;
	}

	public void setEvlu_pers_emp_no_2tms(String evlu_pers_emp_no_2tms){
		this.evlu_pers_emp_no_2tms = evlu_pers_emp_no_2tms;
	}

	public void setEvlu_pers_nm_korn2(String evlu_pers_nm_korn2){
		this.evlu_pers_nm_korn1 = evlu_pers_nm_korn1;
	}

	public void setGrad_nm_1tms_10(String grad_nm_1tms_10){
		this.grad_nm_1tms_10 = grad_nm_1tms_10;
	}

	public void setGrad_nm_1tms_20(String grad_nm_1tms_20){
		this.grad_nm_1tms_20 = grad_nm_1tms_20;
	}

	public void setGrad_nm_1tms_30(String grad_nm_1tms_30){
		this.grad_nm_1tms_30 = grad_nm_1tms_30;
	}

	public void setGrad_nm_1tms_40(String grad_nm_1tms_40){
		this.grad_nm_1tms_40 = grad_nm_1tms_40;
	}

	public void setGrad_nm_1tms_50(String grad_nm_1tms_50){
		this.grad_nm_1tms_50 = grad_nm_1tms_50;
	}

	public void setGrad_nm_1tms_60(String grad_nm_1tms_60){
		this.grad_nm_1tms_60 = grad_nm_1tms_60;
	}

	public void setGrad_nm_1tms_70(String grad_nm_1tms_70){
		this.grad_nm_1tms_70 = grad_nm_1tms_70;
	}

	public void setGrad_nm_2tms_10(String grad_nm_2tms_10){
		this.grad_nm_2tms_10 = grad_nm_2tms_10;
	}

	public void setGrad_nm_2tms_20(String grad_nm_2tms_20){
		this.grad_nm_2tms_20 = grad_nm_2tms_20;
	}

	public void setGrad_nm_2tms_30(String grad_nm_2tms_30){
		this.grad_nm_2tms_30 = grad_nm_2tms_30;
	}

	public void setGrad_nm_2tms_40(String grad_nm_2tms_40){
		this.grad_nm_2tms_40 = grad_nm_2tms_40;
	}

	public void setGrad_nm_2tms_50(String grad_nm_2tms_50){
		this.grad_nm_2tms_50 = grad_nm_2tms_50;
	}

	public void setGrad_nm_2tms_60(String grad_nm_2tms_60){
		this.grad_nm_2tms_60 = grad_nm_2tms_60;
	}

	public void setGrad_nm_2tms_70(String grad_nm_2tms_70){
		this.grad_nm_2tms_70 = grad_nm_2tms_70;
	}

	public void setTot_evlu_1tms(String tot_evlu_1tms){
		this.tot_evlu_1tms = tot_evlu_1tms;
	}

	public void setTot_evlu_2tms(String tot_evlu_2tms){
		this.tot_evlu_2tms = tot_evlu_2tms;
	}

	public String getEvlu_grp_nm(){
		return this.evlu_grp_nm;
	}

	public String getDept_nm(){
		return this.dept_nm;
	}

	public String getTgt_evlu_pers_emp_no(){
		return this.tgt_evlu_pers_emp_no;
	}

	public String getTgt_evlu_pers_nm_korn(){
		return this.tgt_evlu_pers_nm_korn;
	}

	public String getRvis_scor(){
		return this.rvis_scor;
	}

	public String getRank(){
		return this.rank;
	}

	public String getLast_grad(){
		return this.last_grad;
	}

	public String getEvlu_pers_emp_no_1tms(){
		return this.evlu_pers_emp_no_1tms;
	}

	public String getEvlu_pers_nm_korn1(){
		return this.evlu_pers_nm_korn1;
	}

	public String getEvlu_pers_emp_no_2tms(){
		return this.evlu_pers_emp_no_2tms;
	}

	public String getEvlu_pers_nm_korn2(){
		return this.evlu_pers_nm_korn2;
	}

	public String getGrad_nm_1tms_10(){
		return this.grad_nm_1tms_10;
	}

	public String getGrad_nm_1tms_20(){
		return this.grad_nm_1tms_20;
	}

	public String getGrad_nm_1tms_30(){
		return this.grad_nm_1tms_30;
	}

	public String getGrad_nm_1tms_40(){
		return this.grad_nm_1tms_40;
	}

	public String getGrad_nm_1tms_50(){
		return this.grad_nm_1tms_50;
	}

	public String getGrad_nm_1tms_60(){
		return this.grad_nm_1tms_60;
	}

	public String getGrad_nm_1tms_70(){
		return this.grad_nm_1tms_70;
	}

	public String getGrad_nm_2tms_10(){
		return this.grad_nm_2tms_10;
	}

	public String getGrad_nm_2tms_20(){
		return this.grad_nm_2tms_20;
	}

	public String getGrad_nm_2tms_30(){
		return this.grad_nm_2tms_30;
	}

	public String getGrad_nm_2tms_40(){
		return this.grad_nm_2tms_40;
	}

	public String getGrad_nm_2tms_50(){
		return this.grad_nm_2tms_50;
	}

	public String getGrad_nm_2tms_60(){
		return this.grad_nm_2tms_60;
	}

	public String getGrad_nm_2tms_70(){
		return this.grad_nm_2tms_70;
	}

	public String getTot_evlu_1tms(){
		return this.tot_evlu_1tms;
	}

	public String getTot_evlu_2tms(){
		return this.tot_evlu_2tms;
	}
}

/* 작성시간 : Wed Oct 14 15:51:41 KST 2015 */
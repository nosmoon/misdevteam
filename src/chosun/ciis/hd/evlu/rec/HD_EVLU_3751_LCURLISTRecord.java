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


public class HD_EVLU_3751_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String evlu_clsf;
	public String dept_nm;
	public String evlu_pers_deci_grad_2tms;
	public String asst_nm_korn;
	public String evlu_opn;
	public String tms1_nm_korn;
	public String evlu_cmpt_opn_1tms;
	public String evlu_pers_meda_opn_1tms;
	public String tms2_nm_korn;
	public String evlu_pers_meda_opn_2tms;

	public HD_EVLU_3751_LCURLISTRecord(){}

	public void setEvlu_clsf(String evlu_clsf){
		this.evlu_clsf = evlu_clsf;
	}
	
	public void setDept_nm(String dept_nm){
		this.dept_nm = dept_nm;
	}

	public void setEvlu_pers_deci_grad_2tms(String evlu_pers_deci_grad_2tms){
		this.evlu_pers_deci_grad_2tms = evlu_pers_deci_grad_2tms;
	}

	public void setAsst_nm_korn(String asst_nm_korn){
		this.asst_nm_korn = asst_nm_korn;
	}

	public void setEvlu_opn(String evlu_opn){
		this.evlu_opn = evlu_opn;
	}

	public void setTms1_nm_korn(String tms1_nm_korn){
		this.tms1_nm_korn = tms1_nm_korn;
	}

	public void setEvlu_cmpt_opn_1tms(String evlu_cmpt_opn_1tms){
		this.evlu_cmpt_opn_1tms = evlu_cmpt_opn_1tms;
	}

	public void setEvlu_pers_meda_opn_1tms(String evlu_pers_meda_opn_1tms){
		this.evlu_pers_meda_opn_1tms = evlu_pers_meda_opn_1tms;
	}

	public void setTms2_nm_korn(String tms2_nm_korn){
		this.tms2_nm_korn = tms2_nm_korn;
	}

	public void setEvlu_pers_meda_opn_2tms(String evlu_pers_meda_opn_2tms){
		this.evlu_pers_meda_opn_2tms = evlu_pers_meda_opn_2tms;
	}

	public String getEvlu_clsf(){
		return this.evlu_clsf;
	}
	
	public String getDept_nm(){
		return this.dept_nm;
	}
	

	public String getEvlu_pers_deci_grad_2tms(){
		return this.evlu_pers_deci_grad_2tms;
	}

	public String getAsst_nm_korn(){
		return this.asst_nm_korn;
	}

	public String getEvlu_opn(){
		return this.evlu_opn;
	}

	public String getTms1_nm_korn(){
		return this.tms1_nm_korn;
	}

	public String getEvlu_cmpt_opn_1tms(){
		return this.evlu_cmpt_opn_1tms;
	}

	public String getEvlu_pers_meda_opn_1tms(){
		return this.evlu_pers_meda_opn_1tms;
	}

	public String getTms2_nm_korn(){
		return this.tms2_nm_korn;
	}

	public String getEvlu_pers_meda_opn_2tms(){
		return this.evlu_pers_meda_opn_2tms;
	}
}

/* 작성시간 : Thu Apr 23 16:13:47 KST 2015 */
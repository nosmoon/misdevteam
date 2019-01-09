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


public class HD_EVLU_2457_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String evlu_yy;
	public String tms_clsf;
	public String emp_no;
	public String flnm;
	public String evlu_grp_cd;
	public String grp_nm;
	public String evlu_pers_emp_no_1tms;
	public String nm_korn_1tms;
	public String evlu_pers_emp_no_2tms;
	public String nm_korn_2tms;
	public String asst_evlu_pers_emp_no;

	public HD_EVLU_2457_LCURLISTRecord(){}

	public void setEvlu_yy(String evlu_yy){
		this.evlu_yy = evlu_yy;
	}

	public void setTms_clsf(String tms_clsf){
		this.tms_clsf = tms_clsf;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setFlnm(String flnm){
		this.flnm = flnm;
	}

	public void setEvlu_grp_cd(String evlu_grp_cd){
		this.evlu_grp_cd = evlu_grp_cd;
	}

	public void setGrp_nm(String grp_nm){
		this.grp_nm = grp_nm;
	}

	public void setEvlu_pers_emp_no_1tms(String evlu_pers_emp_no_1tms){
		this.evlu_pers_emp_no_1tms = evlu_pers_emp_no_1tms;
	}

	public void setNm_korn_1tms(String nm_korn_1tms){
		this.nm_korn_1tms = nm_korn_1tms;
	}

	public void setEvlu_pers_emp_no_2tms(String evlu_pers_emp_no_2tms){
		this.evlu_pers_emp_no_2tms = evlu_pers_emp_no_2tms;
	}

	public void setNm_korn_2tms(String nm_korn_2tms){
		this.nm_korn_2tms = nm_korn_2tms;
	}

	public void setAsst_evlu_pers_emp_no(String asst_evlu_pers_emp_no){
		this.asst_evlu_pers_emp_no = asst_evlu_pers_emp_no;
	}

	public String getEvlu_yy(){
		return this.evlu_yy;
	}

	public String getTms_clsf(){
		return this.tms_clsf;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getFlnm(){
		return this.flnm;
	}

	public String getEvlu_grp_cd(){
		return this.evlu_grp_cd;
	}

	public String getGrp_nm(){
		return this.grp_nm;
	}

	public String getEvlu_pers_emp_no_1tms(){
		return this.evlu_pers_emp_no_1tms;
	}

	public String getNm_korn_1tms(){
		return this.nm_korn_1tms;
	}

	public String getEvlu_pers_emp_no_2tms(){
		return this.evlu_pers_emp_no_2tms;
	}

	public String getNm_korn_2tms(){
		return this.nm_korn_2tms;
	}

	public String getAsst_evlu_pers_emp_no(){
		return this.asst_evlu_pers_emp_no;
	}
}

/* 작성시간 : Fri Nov 10 15:03:52 KST 2017 */
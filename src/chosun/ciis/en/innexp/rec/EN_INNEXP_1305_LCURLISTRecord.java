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


package chosun.ciis.en.innexp.rec;

import java.sql.*;
import chosun.ciis.en.innexp.dm.*;
import chosun.ciis.en.innexp.ds.*;

/**
 * 
 */


public class EN_INNEXP_1305_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String flag;
	public String occr_dt;
	public String clos_stat;
	public String clos_proc_dt;
	public String clos_pers_emp_nm;
	public String incmg_dt;
	public String incmg_pers_nm;
	public String chg_dt;
	public String chg_pers_nm;
	public String clos_yn;
	public String clos_type;

	public EN_INNEXP_1305_LCURLISTRecord(){}

	public void setFlag(String flag){
		this.flag = flag;
	}

	public void setOccr_dt(String occr_dt){
		this.occr_dt = occr_dt;
	}

	public void setClos_stat(String clos_stat){
		this.clos_stat = clos_stat;
	}

	public void setClos_proc_dt(String clos_proc_dt){
		this.clos_proc_dt = clos_proc_dt;
	}

	public void setClos_pers_emp_nm(String clos_pers_emp_nm){
		this.clos_pers_emp_nm = clos_pers_emp_nm;
	}

	public void setIncmg_dt(String incmg_dt){
		this.incmg_dt = incmg_dt;
	}

	public void setIncmg_pers_nm(String incmg_pers_nm){
		this.incmg_pers_nm = incmg_pers_nm;
	}

	public void setChg_dt(String chg_dt){
		this.chg_dt = chg_dt;
	}

	public void setChg_pers_nm(String chg_pers_nm){
		this.chg_pers_nm = chg_pers_nm;
	}

	public void setClos_yn(String clos_yn){
		this.clos_yn = clos_yn;
	}

	public void setClos_type(String clos_type){
		this.clos_type = clos_type;
	}

	public String getFlag(){
		return this.flag;
	}

	public String getOccr_dt(){
		return this.occr_dt;
	}

	public String getClos_stat(){
		return this.clos_stat;
	}

	public String getClos_proc_dt(){
		return this.clos_proc_dt;
	}

	public String getClos_pers_emp_nm(){
		return this.clos_pers_emp_nm;
	}

	public String getIncmg_dt(){
		return this.incmg_dt;
	}

	public String getIncmg_pers_nm(){
		return this.incmg_pers_nm;
	}

	public String getChg_dt(){
		return this.chg_dt;
	}

	public String getChg_pers_nm(){
		return this.chg_pers_nm;
	}

	public String getClos_yn(){
		return this.clos_yn;
	}

	public String getClos_type(){
		return this.clos_type;
	}
}

/* 작성시간 : Mon Sep 20 11:08:22 KST 2010 */
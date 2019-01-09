/***************************************************************************************************
* 파일명 : .java
* 기능 :  예산관리 - 행사코드등록수정
* 작성일자 : 2011-07-12
* 작성자 : 노상현
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 : 
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.mc.budg.rec;

import java.sql.*;
import chosun.ciis.mc.budg.dm.*;
import chosun.ciis.mc.budg.ds.*;

/**
 * 예산관리 - 행사코드등록수정
 */

public class MC_BUDG_1013_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String evnt_cd;
	public String evnt_cd_ch;
	public String evnt_nm;
	public String bgn_dt;
	public String last_dt;
	public String supv_dept_cd;
	public String buseonm;
	public String incmg_pers;
	public String a_igbhannm;
	public String evnt_nm1;
	public String evnt_nm2;

	public MC_BUDG_1013_LCURLISTRecord(){}

	public void setEvnt_cd(String evnt_cd){
		this.evnt_cd = evnt_cd;
	}

	public void setEvnt_cd_ch(String evnt_cd_ch){
		this.evnt_cd_ch = evnt_cd_ch;
	}

	public void setEvnt_nm(String evnt_nm){
		this.evnt_nm = evnt_nm;
	}

	public void setBgn_dt(String bgn_dt){
		this.bgn_dt = bgn_dt;
	}

	public void setLast_dt(String last_dt){
		this.last_dt = last_dt;
	}

	public void setSupv_dept_cd(String supv_dept_cd){
		this.supv_dept_cd = supv_dept_cd;
	}

	public void setBuseonm(String buseonm){
		this.buseonm = buseonm;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setA_igbhannm(String a_igbhannm){
		this.a_igbhannm = a_igbhannm;
	}

	public void setEvnt_nm1(String evnt_nm1){
		this.evnt_nm1 = evnt_nm1;
	}

	public void setEvnt_nm2(String evnt_nm2){
		this.evnt_nm2 = evnt_nm2;
	}

	public String getEvnt_cd(){
		return this.evnt_cd;
	}

	public String getEvnt_cd_ch(){
		return this.evnt_cd_ch;
	}

	public String getEvnt_nm(){
		return this.evnt_nm;
	}

	public String getBgn_dt(){
		return this.bgn_dt;
	}

	public String getLast_dt(){
		return this.last_dt;
	}

	public String getSupv_dept_cd(){
		return this.supv_dept_cd;
	}

	public String getBuseonm(){
		return this.buseonm;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getA_igbhannm(){
		return this.a_igbhannm;
	}

	public String getEvnt_nm1(){
		return this.evnt_nm1;
	}

	public String getEvnt_nm2(){
		return this.evnt_nm2;
	}
}

/* 작성시간 : Fri Nov 25 14:38:52 KST 2011 */
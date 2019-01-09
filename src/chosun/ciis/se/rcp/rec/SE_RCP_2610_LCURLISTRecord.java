/***************************************************************************************************
* 파일명 : .java
* 기능 : 판매시스템
* 작성일자 : 2009-02-18
* 작성자 : 배창희
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.se.rcp.rec;

import java.sql.*;
import chosun.ciis.se.rcp.dm.*;
import chosun.ciis.se.rcp.ds.*;

/**
 * 
 */


public class SE_RCP_2610_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String rcpm_dt;
	public String rcpm_no;
	public String drcr_clsf;
	public String name;
	public String amt;
	public String budg_cd;
	public String patr_budg_cd;
	public String dtlremk;

	public SE_RCP_2610_LCURLISTRecord(){}

	public void setRcpm_dt(String rcpm_dt){
		this.rcpm_dt = rcpm_dt;
	}

	public void setRcpm_no(String rcpm_no){
		this.rcpm_no = rcpm_no;
	}

	public void setDrcr_clsf(String drcr_clsf){
		this.drcr_clsf = drcr_clsf;
	}

	public void setName(String name){
		this.name = name;
	}

	public void setAmt(String amt){
		this.amt = amt;
	}

	public void setBudg_cd(String budg_cd){
		this.budg_cd = budg_cd;
	}

	public void setPatr_budg_cd(String patr_budg_cd){
		this.patr_budg_cd = patr_budg_cd;
	}

	public void setDtlremk(String dtlremk){
		this.dtlremk = dtlremk;
	}

	public String getRcpm_dt(){
		return this.rcpm_dt;
	}

	public String getRcpm_no(){
		return this.rcpm_no;
	}

	public String getDrcr_clsf(){
		return this.drcr_clsf;
	}

	public String getName(){
		return this.name;
	}

	public String getAmt(){
		return this.amt;
	}

	public String getBudg_cd(){
		return this.budg_cd;
	}

	public String getPatr_budg_cd(){
		return this.patr_budg_cd;
	}

	public String getDtlremk(){
		return this.dtlremk;
	}
}

/* 작성시간 : Fri Apr 24 10:55:47 KST 2009 */
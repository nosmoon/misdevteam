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


package chosun.ciis.mc.budg.rec;

import java.sql.*;
import chosun.ciis.mc.budg.dm.*;
import chosun.ciis.mc.budg.ds.*;

/**
 * 
 */


public class MC_BUDG_6021_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String chk;
	public String yymm;
	public String dept_cd;
	public String dept_nm;
	public String rmks;
	public String a_ini_plan_qunt;
	public String asin_qunt;
	public String asin_qunt2;
	public String a_form_dept_cd;
	public String a_form_dept_nm;

	public MC_BUDG_6021_LCURLISTRecord(){}

	public void setChk(String chk){
		this.chk = chk;
	}

	public void setYymm(String yymm){
		this.yymm = yymm;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setDept_nm(String dept_nm){
		this.dept_nm = dept_nm;
	}

	public void setRmks(String rmks){
		this.rmks = rmks;
	}

	public void setA_ini_plan_qunt(String a_ini_plan_qunt){
		this.a_ini_plan_qunt = a_ini_plan_qunt;
	}

	public void setAsin_qunt(String asin_qunt){
		this.asin_qunt = asin_qunt;
	}

	public void setAsin_qunt2(String asin_qunt2){
		this.asin_qunt2 = asin_qunt2;
	}

	public void setA_form_dept_cd(String a_form_dept_cd){
		this.a_form_dept_cd = a_form_dept_cd;
	}

	public void setA_form_dept_nm(String a_form_dept_nm){
		this.a_form_dept_nm = a_form_dept_nm;
	}

	public String getChk(){
		return this.chk;
	}

	public String getYymm(){
		return this.yymm;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getDept_nm(){
		return this.dept_nm;
	}

	public String getRmks(){
		return this.rmks;
	}

	public String getA_ini_plan_qunt(){
		return this.a_ini_plan_qunt;
	}

	public String getAsin_qunt(){
		return this.asin_qunt;
	}

	public String getAsin_qunt2(){
		return this.asin_qunt2;
	}

	public String getA_form_dept_cd(){
		return this.a_form_dept_cd;
	}

	public String getA_form_dept_nm(){
		return this.a_form_dept_nm;
	}
}

/* 작성시간 : Thu May 14 10:53:55 KST 2009 */
/***************************************************************************************************
* 파일명 : .java
* 기능 : 	   
* 작성일자 : 
* 작성자 : 
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.se.ang.rec;

import java.sql.*;
import chosun.ciis.se.ang.dm.*;
import chosun.ciis.se.ang.ds.*;

/**
 * 
 */


public class SE_ANG_1020_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String dept_cd;
	public String dept_nm;
	public String part_cd;
	public String part_nm;
	public String area_cd;
	public String area_nm;
	public String bo_cd;
	public String bo_nm;
	public String bo_seq;
	public int qty;
	public int uprc;
	public int amt;
	public String chg_pers;
	public String chg_dt;

	public SE_ANG_1020_LCURLISTRecord(){}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setDept_nm(String dept_nm){
		this.dept_nm = dept_nm;
	}

	public void setPart_cd(String part_cd){
		this.part_cd = part_cd;
	}

	public void setPart_nm(String part_nm){
		this.part_nm = part_nm;
	}

	public void setArea_cd(String area_cd){
		this.area_cd = area_cd;
	}

	public void setArea_nm(String area_nm){
		this.area_nm = area_nm;
	}

	public void setBo_cd(String bo_cd){
		this.bo_cd = bo_cd;
	}

	public void setBo_nm(String bo_nm){
		this.bo_nm = bo_nm;
	}

	public void setBo_seq(String bo_seq){
		this.bo_seq = bo_seq;
	}

	public void setQty(int qty){
		this.qty = qty;
	}

	public void setUprc(int uprc){
		this.uprc = uprc;
	}

	public void setAmt(int amt){
		this.amt = amt;
	}

	public void setChg_pers(String chg_pers){
		this.chg_pers = chg_pers;
	}

	public void setChg_dt(String chg_dt){
		this.chg_dt = chg_dt;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getDept_nm(){
		return this.dept_nm;
	}

	public String getPart_cd(){
		return this.part_cd;
	}

	public String getPart_nm(){
		return this.part_nm;
	}

	public String getArea_cd(){
		return this.area_cd;
	}

	public String getArea_nm(){
		return this.area_nm;
	}

	public String getBo_cd(){
		return this.bo_cd;
	}

	public String getBo_nm(){
		return this.bo_nm;
	}

	public String getBo_seq(){
		return this.bo_seq;
	}

	public int getQty(){
		return this.qty;
	}

	public int getUprc(){
		return this.uprc;
	}

	public int getAmt(){
		return this.amt;
	}

	public String getChg_pers(){
		return this.chg_pers;
	}

	public String getChg_dt(){
		return this.chg_dt;
	}
}

/* 작성시간 : Mon Sep 18 16:41:54 KST 2017 */
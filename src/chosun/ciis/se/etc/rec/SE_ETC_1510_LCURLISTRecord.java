/***************************************************************************************************
* 파일명 : .java
* 기능 : 판매 - 기타관리 - 본지일자별가판부수
* 작성일자 : 2010-05-26
* 작성자 : 이민효
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.se.etc.rec;

import java.sql.*;
import chosun.ciis.se.etc.dm.*;
import chosun.ciis.se.etc.ds.*;

/**
 * 
 */


public class SE_ETC_1510_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String issu_dt;
	public String dept_cd;
	public String dept_nm;
	public String part_cd;
	public String part_nm;
	public String area_cd;
	public String area_nm;
	public String bo_cd;
	public String bo_seq;
	public String bo_nm;
	public String stetsell_qty;
	public String issu_qty;
	public String medi_cd;

	public SE_ETC_1510_LCURLISTRecord(){}

	public void setIssu_dt(String issu_dt){
		this.issu_dt = issu_dt;
	}

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

	public void setBo_seq(String bo_seq){
		this.bo_seq = bo_seq;
	}

	public void setBo_nm(String bo_nm){
		this.bo_nm = bo_nm;
	}

	public void setStetsell_qty(String stetsell_qty){
		this.stetsell_qty = stetsell_qty;
	}

	public void setIssu_qty(String issu_qty){
		this.issu_qty = issu_qty;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public String getIssu_dt(){
		return this.issu_dt;
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

	public String getBo_seq(){
		return this.bo_seq;
	}

	public String getBo_nm(){
		return this.bo_nm;
	}

	public String getStetsell_qty(){
		return this.stetsell_qty;
	}

	public String getIssu_qty(){
		return this.issu_qty;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}
}

/* 작성시간 : Wed May 26 18:56:17 KST 2010 */
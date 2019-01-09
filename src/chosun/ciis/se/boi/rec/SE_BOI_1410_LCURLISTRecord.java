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


package chosun.ciis.se.boi.rec;

import java.sql.*;
import chosun.ciis.se.boi.dm.*;
import chosun.ciis.se.boi.ds.*;

/**
 * 
 */


public class SE_BOI_1410_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String area_nm;
	public String bo_cd;
	public String bo_seq;
	public String bo_nm;
	public String bo_head_nm;
	public String bo_head_prn;
	public String flnm;
	public String bo_telno;
	public String bo_cntr_dt;
	public String cntr_statnm;

	public SE_BOI_1410_LCURLISTRecord(){}

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

	public void setBo_head_nm(String bo_head_nm){
		this.bo_head_nm = bo_head_nm;
	}

	public void setBo_head_prn(String bo_head_prn){
		this.bo_head_prn = bo_head_prn;
	}

	public void setFlnm(String flnm){
		this.flnm = flnm;
	}

	public void setBo_telno(String bo_telno){
		this.bo_telno = bo_telno;
	}

	public void setBo_cntr_dt(String bo_cntr_dt){
		this.bo_cntr_dt = bo_cntr_dt;
	}

	public void setCntr_statnm(String cntr_statnm){
		this.cntr_statnm = cntr_statnm;
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

	public String getBo_head_nm(){
		return this.bo_head_nm;
	}

	public String getBo_head_prn(){
		return this.bo_head_prn;
	}

	public String getFlnm(){
		return this.flnm;
	}

	public String getBo_telno(){
		return this.bo_telno;
	}

	public String getBo_cntr_dt(){
		return this.bo_cntr_dt;
	}

	public String getCntr_statnm(){
		return this.cntr_statnm;
	}
}

/* 작성시간 : Fri Jun 12 10:39:02 KST 2009 */
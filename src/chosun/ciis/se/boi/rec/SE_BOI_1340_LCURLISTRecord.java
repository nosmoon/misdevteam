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


public class SE_BOI_1340_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String area_nm;
	public String bo_nm;
	public String bo_head_nm;
	public String cntr_stat_nm;
	public String leas_cntr_dt;
	public String midw_expy_dt;
	public String cntr_leas_amt;
	public String cntr_mang_amt;
	public String cntr_gurt_amt;
	public String leas_fr_dt;
	public String leas_to_dt;

	public SE_BOI_1340_LCURLISTRecord(){}

	public void setArea_nm(String area_nm){
		this.area_nm = area_nm;
	}

	public void setBo_nm(String bo_nm){
		this.bo_nm = bo_nm;
	}

	public void setBo_head_nm(String bo_head_nm){
		this.bo_head_nm = bo_head_nm;
	}

	public void setCntr_stat_nm(String cntr_stat_nm){
		this.cntr_stat_nm = cntr_stat_nm;
	}

	public void setLeas_cntr_dt(String leas_cntr_dt){
		this.leas_cntr_dt = leas_cntr_dt;
	}

	public void setMidw_expy_dt(String midw_expy_dt){
		this.midw_expy_dt = midw_expy_dt;
	}

	public void setCntr_leas_amt(String cntr_leas_amt){
		this.cntr_leas_amt = cntr_leas_amt;
	}

	public void setCntr_mang_amt(String cntr_mang_amt){
		this.cntr_mang_amt = cntr_mang_amt;
	}

	public void setCntr_gurt_amt(String cntr_gurt_amt){
		this.cntr_gurt_amt = cntr_gurt_amt;
	}

	public void setLeas_fr_dt(String leas_fr_dt){
		this.leas_fr_dt = leas_fr_dt;
	}

	public void setLeas_to_dt(String leas_to_dt){
		this.leas_to_dt = leas_to_dt;
	}

	public String getArea_nm(){
		return this.area_nm;
	}

	public String getBo_nm(){
		return this.bo_nm;
	}

	public String getBo_head_nm(){
		return this.bo_head_nm;
	}

	public String getCntr_stat_nm(){
		return this.cntr_stat_nm;
	}

	public String getLeas_cntr_dt(){
		return this.leas_cntr_dt;
	}

	public String getMidw_expy_dt(){
		return this.midw_expy_dt;
	}

	public String getCntr_leas_amt(){
		return this.cntr_leas_amt;
	}

	public String getCntr_mang_amt(){
		return this.cntr_mang_amt;
	}

	public String getCntr_gurt_amt(){
		return this.cntr_gurt_amt;
	}

	public String getLeas_fr_dt(){
		return this.leas_fr_dt;
	}

	public String getLeas_to_dt(){
		return this.leas_to_dt;
	}
}

/* 작성시간 : Mon Jun 08 11:17:55 KST 2009 */
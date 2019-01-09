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


public class SE_BOI_2130_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String bo_cd;
	public String bo_seq;
	public String bo_nm;
	public String bo_head_nm;
	public String area_cd;
	public String area_nm;
	public String chrg_pers;
	public String leas_sply_amt;
	public String leas_sply_amt_exch_in_amt;
	public String rem_amt;
	public String leas_sply_amt_unrcp_occr_dt;

	public SE_BOI_2130_LCURLISTRecord(){}

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

	public void setArea_cd(String area_cd){
		this.area_cd = area_cd;
	}

	public void setArea_nm(String area_nm){
		this.area_nm = area_nm;
	}

	public void setChrg_pers(String chrg_pers){
		this.chrg_pers = chrg_pers;
	}

	public void setLeas_sply_amt(String leas_sply_amt){
		this.leas_sply_amt = leas_sply_amt;
	}

	public void setLeas_sply_amt_exch_in_amt(String leas_sply_amt_exch_in_amt){
		this.leas_sply_amt_exch_in_amt = leas_sply_amt_exch_in_amt;
	}

	public void setRem_amt(String rem_amt){
		this.rem_amt = rem_amt;
	}

	public void setLeas_sply_amt_unrcp_occr_dt(String leas_sply_amt_unrcp_occr_dt){
		this.leas_sply_amt_unrcp_occr_dt = leas_sply_amt_unrcp_occr_dt;
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

	public String getArea_cd(){
		return this.area_cd;
	}

	public String getArea_nm(){
		return this.area_nm;
	}

	public String getChrg_pers(){
		return this.chrg_pers;
	}

	public String getLeas_sply_amt(){
		return this.leas_sply_amt;
	}

	public String getLeas_sply_amt_exch_in_amt(){
		return this.leas_sply_amt_exch_in_amt;
	}

	public String getRem_amt(){
		return this.rem_amt;
	}

	public String getLeas_sply_amt_unrcp_occr_dt(){
		return this.leas_sply_amt_unrcp_occr_dt;
	}
}

/* 작성시간 : Tue May 26 17:02:10 KST 2009 */
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


package chosun.ciis.se.boi.rec;

import java.sql.*;
import chosun.ciis.se.boi.dm.*;
import chosun.ciis.se.boi.ds.*;

/**
 * 
 */


public class SE_BOI_1330_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String area_nm;
	public String bo_nm;
	public String bo_head_nm;
	public String cntr_stat_nm;
	public String bo_cntr_dt;
	public String bo_expy_dt;
	public String out_gurt_amt;
	public String out_amt_dt;
	public String in_gurt_amt;
	public String in_amt_dt;
	public String leas_sply_amt_unrcp_occr_dt;
	public String leas_sply_amt_bal;

	public SE_BOI_1330_LCURLISTRecord(){}

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

	public void setBo_cntr_dt(String bo_cntr_dt){
		this.bo_cntr_dt = bo_cntr_dt;
	}

	public void setBo_expy_dt(String bo_expy_dt){
		this.bo_expy_dt = bo_expy_dt;
	}

	public void setOut_gurt_amt(String out_gurt_amt){
		this.out_gurt_amt = out_gurt_amt;
	}

	public void setOut_amt_dt(String out_amt_dt){
		this.out_amt_dt = out_amt_dt;
	}

	public void setIn_gurt_amt(String in_gurt_amt){
		this.in_gurt_amt = in_gurt_amt;
	}

	public void setIn_amt_dt(String in_amt_dt){
		this.in_amt_dt = in_amt_dt;
	}

	public void setLeas_sply_amt_unrcp_occr_dt(String leas_sply_amt_unrcp_occr_dt){
		this.leas_sply_amt_unrcp_occr_dt = leas_sply_amt_unrcp_occr_dt;
	}

	public void setLeas_sply_amt_bal(String leas_sply_amt_bal){
		this.leas_sply_amt_bal = leas_sply_amt_bal;
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

	public String getBo_cntr_dt(){
		return this.bo_cntr_dt;
	}

	public String getBo_expy_dt(){
		return this.bo_expy_dt;
	}

	public String getOut_gurt_amt(){
		return this.out_gurt_amt;
	}

	public String getOut_amt_dt(){
		return this.out_amt_dt;
	}

	public String getIn_gurt_amt(){
		return this.in_gurt_amt;
	}

	public String getIn_amt_dt(){
		return this.in_amt_dt;
	}

	public String getLeas_sply_amt_unrcp_occr_dt(){
		return this.leas_sply_amt_unrcp_occr_dt;
	}

	public String getLeas_sply_amt_bal(){
		return this.leas_sply_amt_bal;
	}
}

/* 작성시간 : Tue Feb 03 15:32:14 KST 2009 */
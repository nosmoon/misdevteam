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


package chosun.ciis.hd.trip.rec;

import java.sql.*;
import chosun.ciis.hd.trip.dm.*;
import chosun.ciis.hd.trip.ds.*;

/**
 * 
 */


public class HD_TRIP_1501_LCURLIST4Record extends java.lang.Object implements java.io.Serializable{

	public String e_cmpy_cd;
	public String e_emp_no;
	public String e_occr_dt;
	public String e_seq;
	public String e_sub_seq;
	public String e_with_seq;
	public String e_etc_cost_ptcr;
	public String e_etc_cost;
	public String e_fix_etc_cost;
	public String e_adjm_etc_cost;
	public String e_etc_cost_neces;

	public HD_TRIP_1501_LCURLIST4Record(){}

	public void setE_cmpy_cd(String e_cmpy_cd){
		this.e_cmpy_cd = e_cmpy_cd;
	}

	public void setE_emp_no(String e_emp_no){
		this.e_emp_no = e_emp_no;
	}

	public void setE_occr_dt(String e_occr_dt){
		this.e_occr_dt = e_occr_dt;
	}

	public void setE_seq(String e_seq){
		this.e_seq = e_seq;
	}

	public void setE_sub_seq(String e_sub_seq){
		this.e_sub_seq = e_sub_seq;
	}

	public void setE_with_seq(String e_with_seq){
		this.e_with_seq = e_with_seq;
	}

	public void setE_etc_cost_ptcr(String e_etc_cost_ptcr){
		this.e_etc_cost_ptcr = e_etc_cost_ptcr;
	}

	public void setE_etc_cost(String e_etc_cost){
		this.e_etc_cost = e_etc_cost;
	}

	public void setE_fix_etc_cost(String e_fix_etc_cost){
		this.e_fix_etc_cost = e_fix_etc_cost;
	}

	public void setE_adjm_etc_cost(String e_adjm_etc_cost){
		this.e_adjm_etc_cost = e_adjm_etc_cost;
	}

	public void setE_etc_cost_neces(String e_etc_cost_neces){
		this.e_etc_cost_neces = e_etc_cost_neces;
	}

	public String getE_cmpy_cd(){
		return this.e_cmpy_cd;
	}

	public String getE_emp_no(){
		return this.e_emp_no;
	}

	public String getE_occr_dt(){
		return this.e_occr_dt;
	}

	public String getE_seq(){
		return this.e_seq;
	}

	public String getE_sub_seq(){
		return this.e_sub_seq;
	}

	public String getE_with_seq(){
		return this.e_with_seq;
	}

	public String getE_etc_cost_ptcr(){
		return this.e_etc_cost_ptcr;
	}

	public String getE_etc_cost(){
		return this.e_etc_cost;
	}

	public String getE_fix_etc_cost(){
		return this.e_fix_etc_cost;
	}

	public String getE_adjm_etc_cost(){
		return this.e_adjm_etc_cost;
	}

	public String getE_etc_cost_neces(){
		return this.e_etc_cost_neces;
	}
}

/* 작성시간 : Tue May 12 11:27:55 KST 2009 */
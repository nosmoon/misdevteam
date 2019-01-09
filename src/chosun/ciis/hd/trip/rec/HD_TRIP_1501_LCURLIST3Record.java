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


public class HD_TRIP_1501_LCURLIST3Record extends java.lang.Object implements java.io.Serializable{

	public String d_cmpy_cd;
	public String d_emp_no;
	public String d_occr_dt;
	public String d_seq;
	public String d_sub_seq;
	public String d_with_seq;
	public String d_start_area;
	public String d_midl_start_dt;
	public String d_dest;
	public String d_busi_trip_cont;

	public HD_TRIP_1501_LCURLIST3Record(){}

	public void setD_cmpy_cd(String d_cmpy_cd){
		this.d_cmpy_cd = d_cmpy_cd;
	}

	public void setD_emp_no(String d_emp_no){
		this.d_emp_no = d_emp_no;
	}

	public void setD_occr_dt(String d_occr_dt){
		this.d_occr_dt = d_occr_dt;
	}

	public void setD_seq(String d_seq){
		this.d_seq = d_seq;
	}

	public void setD_sub_seq(String d_sub_seq){
		this.d_sub_seq = d_sub_seq;
	}

	public void setD_with_seq(String d_with_seq){
		this.d_with_seq = d_with_seq;
	}

	public void setD_start_area(String d_start_area){
		this.d_start_area = d_start_area;
	}

	public void setD_midl_start_dt(String d_midl_start_dt){
		this.d_midl_start_dt = d_midl_start_dt;
	}

	public void setD_dest(String d_dest){
		this.d_dest = d_dest;
	}

	public void setD_busi_trip_cont(String d_busi_trip_cont){
		this.d_busi_trip_cont = d_busi_trip_cont;
	}

	public String getD_cmpy_cd(){
		return this.d_cmpy_cd;
	}

	public String getD_emp_no(){
		return this.d_emp_no;
	}

	public String getD_occr_dt(){
		return this.d_occr_dt;
	}

	public String getD_seq(){
		return this.d_seq;
	}

	public String getD_sub_seq(){
		return this.d_sub_seq;
	}

	public String getD_with_seq(){
		return this.d_with_seq;
	}

	public String getD_start_area(){
		return this.d_start_area;
	}

	public String getD_midl_start_dt(){
		return this.d_midl_start_dt;
	}

	public String getD_dest(){
		return this.d_dest;
	}

	public String getD_busi_trip_cont(){
		return this.d_busi_trip_cont;
	}
}

/* 작성시간 : Tue May 12 11:27:55 KST 2009 */
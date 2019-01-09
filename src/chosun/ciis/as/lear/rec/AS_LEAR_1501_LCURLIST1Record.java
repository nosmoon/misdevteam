/***************************************************************************************************
* 파일명 : .java
* 기능 :  자산 - 임대사업 - 임대사업조회 - 임대사업현황
* 작성일자 : 2011-03-30
* 작성자 : 노상현
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 : 
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.as.lear.rec;

import java.sql.*;
import chosun.ciis.as.lear.dm.*;
import chosun.ciis.as.lear.ds.*;

/**
 * 자산 - 임대사업 - 임대사업조회 - 임대사업현황
 */


public class AS_LEAR_1501_LCURLIST1Record extends java.lang.Object implements java.io.Serializable{

	public String bldg_nm;
	public String hire_dlco_nm;
	public String addr;
	public String leas_fr_dt;
	public String leas_to_dt;
	public String leas_area_size;
	public String cntr_leas_amt;
	public String cntr_mang_amt;
	public String cntr_gurt_amt;
	public String leas_amt_tot;
	public String mon_clam_amt;
	public String year_clam_amt1;
	public String year_clam_amt2;
	public String cntr_star_nm;

	public AS_LEAR_1501_LCURLIST1Record(){}

	public void setBldg_nm(String bldg_nm){
		this.bldg_nm = bldg_nm;
	}

	public void setHire_dlco_nm(String hire_dlco_nm){
		this.hire_dlco_nm = hire_dlco_nm;
	}

	public void setAddr(String addr){
		this.addr = addr;
	}

	public void setLeas_fr_dt(String leas_fr_dt){
		this.leas_fr_dt = leas_fr_dt;
	}

	public void setLeas_to_dt(String leas_to_dt){
		this.leas_to_dt = leas_to_dt;
	}

	public void setLeas_area_size(String leas_area_size){
		this.leas_area_size = leas_area_size;
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

	public void setLeas_amt_tot(String leas_amt_tot){
		this.leas_amt_tot = leas_amt_tot;
	}

	public void setMon_clam_amt(String mon_clam_amt){
		this.mon_clam_amt = mon_clam_amt;
	}

	public void setYear_clam_amt1(String year_clam_amt1){
		this.year_clam_amt1 = year_clam_amt1;
	}

	public void setYear_clam_amt2(String year_clam_amt2){
		this.year_clam_amt2 = year_clam_amt2;
	}

	public void setCntr_star_nm(String cntr_star_nm){
		this.cntr_star_nm = cntr_star_nm;
	}

	public String getBldg_nm(){
		return this.bldg_nm;
	}

	public String getHire_dlco_nm(){
		return this.hire_dlco_nm;
	}

	public String getAddr(){
		return this.addr;
	}

	public String getLeas_fr_dt(){
		return this.leas_fr_dt;
	}

	public String getLeas_to_dt(){
		return this.leas_to_dt;
	}

	public String getLeas_area_size(){
		return this.leas_area_size;
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

	public String getLeas_amt_tot(){
		return this.leas_amt_tot;
	}

	public String getMon_clam_amt(){
		return this.mon_clam_amt;
	}

	public String getYear_clam_amt1(){
		return this.year_clam_amt1;
	}

	public String getYear_clam_amt2(){
		return this.year_clam_amt2;
	}

	public String getCntr_star_nm(){
		return this.cntr_star_nm;
	}
}

/* 작성시간 : Wed Mar 30 21:01:20 KST 2011 */
/***************************************************************************************************
* 파일명 : .java
* 기능 : 자산-임대사업-임대사업조회
* 작성일자 : 2009-10-09
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
 * 자산-임대사업-임대사업조회
 */


public class AS_LEAR_1004_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String occr_dt;
	public String occr_seq;
	public String rcpm_dt;
	public String bldg_nm;
	public String cntr_no;
	public String hire_dlco_ern;
	public String hire_dlco_nm;
	public String rcpm_tot_amt;
	public String clam_dt;
	public String gurt_rcpm_amt;
	public String leas_rcpm_amt;
	public String mang_rcpm_amt;
	public String vat_rcpm_amt;

	public AS_LEAR_1004_LCURLISTRecord(){}

	public void setOccr_dt(String occr_dt){
		this.occr_dt = occr_dt;
	}

	public void setOccr_seq(String occr_seq){
		this.occr_seq = occr_seq;
	}

	public void setRcpm_dt(String rcpm_dt){
		this.rcpm_dt = rcpm_dt;
	}

	public void setBldg_nm(String bldg_nm){
		this.bldg_nm = bldg_nm;
	}

	public void setCntr_no(String cntr_no){
		this.cntr_no = cntr_no;
	}

	public void setHire_dlco_ern(String hire_dlco_ern){
		this.hire_dlco_ern = hire_dlco_ern;
	}

	public void setHire_dlco_nm(String hire_dlco_nm){
		this.hire_dlco_nm = hire_dlco_nm;
	}

	public void setRcpm_tot_amt(String rcpm_tot_amt){
		this.rcpm_tot_amt = rcpm_tot_amt;
	}

	public void setClam_dt(String clam_dt){
		this.clam_dt = clam_dt;
	}

	public void setGurt_rcpm_amt(String gurt_rcpm_amt){
		this.gurt_rcpm_amt = gurt_rcpm_amt;
	}

	public void setLeas_rcpm_amt(String leas_rcpm_amt){
		this.leas_rcpm_amt = leas_rcpm_amt;
	}

	public void setMang_rcpm_amt(String mang_rcpm_amt){
		this.mang_rcpm_amt = mang_rcpm_amt;
	}

	public void setVat_rcpm_amt(String vat_rcpm_amt){
		this.vat_rcpm_amt = vat_rcpm_amt;
	}

	public String getOccr_dt(){
		return this.occr_dt;
	}

	public String getOccr_seq(){
		return this.occr_seq;
	}

	public String getRcpm_dt(){
		return this.rcpm_dt;
	}

	public String getBldg_nm(){
		return this.bldg_nm;
	}

	public String getCntr_no(){
		return this.cntr_no;
	}

	public String getHire_dlco_ern(){
		return this.hire_dlco_ern;
	}

	public String getHire_dlco_nm(){
		return this.hire_dlco_nm;
	}

	public String getRcpm_tot_amt(){
		return this.rcpm_tot_amt;
	}

	public String getClam_dt(){
		return this.clam_dt;
	}

	public String getGurt_rcpm_amt(){
		return this.gurt_rcpm_amt;
	}

	public String getLeas_rcpm_amt(){
		return this.leas_rcpm_amt;
	}

	public String getMang_rcpm_amt(){
		return this.mang_rcpm_amt;
	}

	public String getVat_rcpm_amt(){
		return this.vat_rcpm_amt;
	}
}

/* 작성시간 : Fri Oct 09 11:56:50 KST 2009 */
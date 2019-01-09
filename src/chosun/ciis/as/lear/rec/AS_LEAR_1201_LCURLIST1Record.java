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


package chosun.ciis.as.lear.rec;

import java.sql.*;
import chosun.ciis.as.lear.dm.*;
import chosun.ciis.as.lear.ds.*;

/**
 * 
 */


public class AS_LEAR_1201_LCURLIST1Record extends java.lang.Object implements java.io.Serializable{

	public String cmpy_cd;
	public String cntr_no;
	public String ser_no;
	public String leas_area_size;
	public String bldg_cd;
	public String cntr_yy;
	public String cntr_seq;
	public String clam_yymm;
	public String leas_clam_amt;
	public String mang_clam_amt;
	public String vat_clam_amt;
	public String clam_tot_amt;
	public String rcpm_tot_amt;
	public String misu_amt;
	public String bldg_nm;
	public String hire_dlco_ern;
	public String hire_dlco_ern_nm;
	public String leas_fr_dt;
	public String leas_to_dt;
	public String cntr_gurt_amt;
	public String cntr_leas_amt;
	public String cntr_mang_amt;
	public String cntr_star_nm;

	public AS_LEAR_1201_LCURLIST1Record(){}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setCntr_no(String cntr_no){
		this.cntr_no = cntr_no;
	}

	public void setSer_no(String ser_no){
		this.ser_no = ser_no;
	}

	public void setLeas_area_size(String leas_area_size){
		this.leas_area_size = leas_area_size;
	}

	public void setBldg_cd(String bldg_cd){
		this.bldg_cd = bldg_cd;
	}

	public void setCntr_yy(String cntr_yy){
		this.cntr_yy = cntr_yy;
	}

	public void setCntr_seq(String cntr_seq){
		this.cntr_seq = cntr_seq;
	}

	public void setClam_yymm(String clam_yymm){
		this.clam_yymm = clam_yymm;
	}

	public void setLeas_clam_amt(String leas_clam_amt){
		this.leas_clam_amt = leas_clam_amt;
	}

	public void setMang_clam_amt(String mang_clam_amt){
		this.mang_clam_amt = mang_clam_amt;
	}

	public void setVat_clam_amt(String vat_clam_amt){
		this.vat_clam_amt = vat_clam_amt;
	}

	public void setClam_tot_amt(String clam_tot_amt){
		this.clam_tot_amt = clam_tot_amt;
	}

	public void setRcpm_tot_amt(String rcpm_tot_amt){
		this.rcpm_tot_amt = rcpm_tot_amt;
	}

	public void setMisu_amt(String misu_amt){
		this.misu_amt = misu_amt;
	}

	public void setBldg_nm(String bldg_nm){
		this.bldg_nm = bldg_nm;
	}

	public void setHire_dlco_ern(String hire_dlco_ern){
		this.hire_dlco_ern = hire_dlco_ern;
	}

	public void setHire_dlco_ern_nm(String hire_dlco_ern_nm){
		this.hire_dlco_ern_nm = hire_dlco_ern_nm;
	}

	public void setLeas_fr_dt(String leas_fr_dt){
		this.leas_fr_dt = leas_fr_dt;
	}

	public void setLeas_to_dt(String leas_to_dt){
		this.leas_to_dt = leas_to_dt;
	}

	public void setCntr_gurt_amt(String cntr_gurt_amt){
		this.cntr_gurt_amt = cntr_gurt_amt;
	}

	public void setCntr_leas_amt(String cntr_leas_amt){
		this.cntr_leas_amt = cntr_leas_amt;
	}

	public void setCntr_mang_amt(String cntr_mang_amt){
		this.cntr_mang_amt = cntr_mang_amt;
	}

	public void setCntr_star_nm(String cntr_star_nm){
		this.cntr_star_nm = cntr_star_nm;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getCntr_no(){
		return this.cntr_no;
	}

	public String getSer_no(){
		return this.ser_no;
	}

	public String getLeas_area_size(){
		return this.leas_area_size;
	}

	public String getBldg_cd(){
		return this.bldg_cd;
	}

	public String getCntr_yy(){
		return this.cntr_yy;
	}

	public String getCntr_seq(){
		return this.cntr_seq;
	}

	public String getClam_yymm(){
		return this.clam_yymm;
	}

	public String getLeas_clam_amt(){
		return this.leas_clam_amt;
	}

	public String getMang_clam_amt(){
		return this.mang_clam_amt;
	}

	public String getVat_clam_amt(){
		return this.vat_clam_amt;
	}

	public String getClam_tot_amt(){
		return this.clam_tot_amt;
	}

	public String getRcpm_tot_amt(){
		return this.rcpm_tot_amt;
	}

	public String getMisu_amt(){
		return this.misu_amt;
	}

	public String getBldg_nm(){
		return this.bldg_nm;
	}

	public String getHire_dlco_ern(){
		return this.hire_dlco_ern;
	}

	public String getHire_dlco_ern_nm(){
		return this.hire_dlco_ern_nm;
	}

	public String getLeas_fr_dt(){
		return this.leas_fr_dt;
	}

	public String getLeas_to_dt(){
		return this.leas_to_dt;
	}

	public String getCntr_gurt_amt(){
		return this.cntr_gurt_amt;
	}

	public String getCntr_leas_amt(){
		return this.cntr_leas_amt;
	}

	public String getCntr_mang_amt(){
		return this.cntr_mang_amt;
	}

	public String getCntr_star_nm(){
		return this.cntr_star_nm;
	}
}

/* 작성시간 : Wed Apr 22 14:33:48 KST 2009 */
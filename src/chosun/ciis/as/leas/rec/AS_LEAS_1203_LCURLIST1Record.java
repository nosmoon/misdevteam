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


package chosun.ciis.as.leas.rec;

import java.sql.*;
import chosun.ciis.as.leas.dm.*;
import chosun.ciis.as.leas.ds.*;

/**
 * 
 */


public class AS_LEAS_1203_LCURLIST1Record extends java.lang.Object implements java.io.Serializable{

	public String clam_star;
	public String cmpy_cd;
	public String bldg_clsf;
	public String cntr_yy;
	public String cntr_seq;
	public String cntr_no;
	public String cntr_star_nm;
	public String hire_dlco_ern;
	public String hire_dlco_nm;
	public String leas_fr_dt;
	public String leas_to_dt;
	public String cntr_leas_amt;
	public String cntr_mang_amt;
	public String leas_clam_amt;
	public String mang_clam_amt;
	public String vat_clam_amt;
	public String leas_clam_cycl;
	public String mang_clam_cycl;
	public String last_leas_clam_dt;
	public String last_mang_clam_dt;
	public String bldg_cd;
	public String cntr_star;

	public AS_LEAS_1203_LCURLIST1Record(){}

	public void setClam_star(String clam_star){
		this.clam_star = clam_star;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setBldg_clsf(String bldg_clsf){
		this.bldg_clsf = bldg_clsf;
	}

	public void setCntr_yy(String cntr_yy){
		this.cntr_yy = cntr_yy;
	}

	public void setCntr_seq(String cntr_seq){
		this.cntr_seq = cntr_seq;
	}

	public void setCntr_no(String cntr_no){
		this.cntr_no = cntr_no;
	}

	public void setCntr_star_nm(String cntr_star_nm){
		this.cntr_star_nm = cntr_star_nm;
	}

	public void setHire_dlco_ern(String hire_dlco_ern){
		this.hire_dlco_ern = hire_dlco_ern;
	}

	public void setHire_dlco_nm(String hire_dlco_nm){
		this.hire_dlco_nm = hire_dlco_nm;
	}

	public void setLeas_fr_dt(String leas_fr_dt){
		this.leas_fr_dt = leas_fr_dt;
	}

	public void setLeas_to_dt(String leas_to_dt){
		this.leas_to_dt = leas_to_dt;
	}

	public void setCntr_leas_amt(String cntr_leas_amt){
		this.cntr_leas_amt = cntr_leas_amt;
	}

	public void setCntr_mang_amt(String cntr_mang_amt){
		this.cntr_mang_amt = cntr_mang_amt;
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

	public void setLeas_clam_cycl(String leas_clam_cycl){
		this.leas_clam_cycl = leas_clam_cycl;
	}

	public void setMang_clam_cycl(String mang_clam_cycl){
		this.mang_clam_cycl = mang_clam_cycl;
	}

	public void setLast_leas_clam_dt(String last_leas_clam_dt){
		this.last_leas_clam_dt = last_leas_clam_dt;
	}

	public void setLast_mang_clam_dt(String last_mang_clam_dt){
		this.last_mang_clam_dt = last_mang_clam_dt;
	}

	public void setBldg_cd(String bldg_cd){
		this.bldg_cd = bldg_cd;
	}

	public void setCntr_star(String cntr_star){
		this.cntr_star = cntr_star;
	}

	public String getClam_star(){
		return this.clam_star;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getBldg_clsf(){
		return this.bldg_clsf;
	}

	public String getCntr_yy(){
		return this.cntr_yy;
	}

	public String getCntr_seq(){
		return this.cntr_seq;
	}

	public String getCntr_no(){
		return this.cntr_no;
	}

	public String getCntr_star_nm(){
		return this.cntr_star_nm;
	}

	public String getHire_dlco_ern(){
		return this.hire_dlco_ern;
	}

	public String getHire_dlco_nm(){
		return this.hire_dlco_nm;
	}

	public String getLeas_fr_dt(){
		return this.leas_fr_dt;
	}

	public String getLeas_to_dt(){
		return this.leas_to_dt;
	}

	public String getCntr_leas_amt(){
		return this.cntr_leas_amt;
	}

	public String getCntr_mang_amt(){
		return this.cntr_mang_amt;
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

	public String getLeas_clam_cycl(){
		return this.leas_clam_cycl;
	}

	public String getMang_clam_cycl(){
		return this.mang_clam_cycl;
	}

	public String getLast_leas_clam_dt(){
		return this.last_leas_clam_dt;
	}

	public String getLast_mang_clam_dt(){
		return this.last_mang_clam_dt;
	}

	public String getBldg_cd(){
		return this.bldg_cd;
	}

	public String getCntr_star(){
		return this.cntr_star;
	}
}

/* 작성시간 : Mon May 18 16:51:33 KST 2009 */
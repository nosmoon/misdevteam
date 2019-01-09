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


public class AS_LEAS_1202_LCURLIST1Record extends java.lang.Object implements java.io.Serializable{

	public String clam_seq;
	public String cmpy_cd;
	public String bldg_clsf;
	public String cntr_yy;
	public String cntr_seq;
	public String clam_star;
	public String cntr_no;
	public String cntr_star_nm;
	public String hire_dlco_ern;
	public String hire_dlco_nm;
	public String leas_fr_dt;
	public String leas_to_dt;
	public String cntr_leas_amt;
	public String cntr_mang_amt;
	public String tax_stmt_no;
	public String slip_no;
	public String leas_clam_amt;
	public String mang_clam_amt;
	public String vat_clam_amt;
	public String clam_sum_amt;
	public String clam_yymm;
	public String clam_dt;
	public String leas_clam_cycl;
	public String mang_clam_cycl;
	public String upd_slip_yymm;
	public String upd_slip_dt;
	public String last_leas_clam_dt;
	public String last_mang_clam_dt;
	public String incmg_dt_tm;
	public String nm_korn;
	public String bldg_cd;
	public String cntr_star;

	public AS_LEAS_1202_LCURLIST1Record(){}

	public void setClam_seq(String clam_seq){
		this.clam_seq = clam_seq;
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

	public void setClam_star(String clam_star){
		this.clam_star = clam_star;
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

	public void setTax_stmt_no(String tax_stmt_no){
		this.tax_stmt_no = tax_stmt_no;
	}

	public void setSlip_no(String slip_no){
		this.slip_no = slip_no;
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

	public void setClam_sum_amt(String clam_sum_amt){
		this.clam_sum_amt = clam_sum_amt;
	}

	public void setClam_yymm(String clam_yymm){
		this.clam_yymm = clam_yymm;
	}

	public void setClam_dt(String clam_dt){
		this.clam_dt = clam_dt;
	}

	public void setLeas_clam_cycl(String leas_clam_cycl){
		this.leas_clam_cycl = leas_clam_cycl;
	}

	public void setMang_clam_cycl(String mang_clam_cycl){
		this.mang_clam_cycl = mang_clam_cycl;
	}

	public void setUpd_slip_yymm(String upd_slip_yymm){
		this.upd_slip_yymm = upd_slip_yymm;
	}

	public void setUpd_slip_dt(String upd_slip_dt){
		this.upd_slip_dt = upd_slip_dt;
	}

	public void setLast_leas_clam_dt(String last_leas_clam_dt){
		this.last_leas_clam_dt = last_leas_clam_dt;
	}

	public void setLast_mang_clam_dt(String last_mang_clam_dt){
		this.last_mang_clam_dt = last_mang_clam_dt;
	}

	public void setIncmg_dt_tm(String incmg_dt_tm){
		this.incmg_dt_tm = incmg_dt_tm;
	}

	public void setNm_korn(String nm_korn){
		this.nm_korn = nm_korn;
	}

	public void setBldg_cd(String bldg_cd){
		this.bldg_cd = bldg_cd;
	}

	public void setCntr_star(String cntr_star){
		this.cntr_star = cntr_star;
	}

	public String getClam_seq(){
		return this.clam_seq;
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

	public String getClam_star(){
		return this.clam_star;
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

	public String getTax_stmt_no(){
		return this.tax_stmt_no;
	}

	public String getSlip_no(){
		return this.slip_no;
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

	public String getClam_sum_amt(){
		return this.clam_sum_amt;
	}

	public String getClam_yymm(){
		return this.clam_yymm;
	}

	public String getClam_dt(){
		return this.clam_dt;
	}

	public String getLeas_clam_cycl(){
		return this.leas_clam_cycl;
	}

	public String getMang_clam_cycl(){
		return this.mang_clam_cycl;
	}

	public String getUpd_slip_yymm(){
		return this.upd_slip_yymm;
	}

	public String getUpd_slip_dt(){
		return this.upd_slip_dt;
	}

	public String getLast_leas_clam_dt(){
		return this.last_leas_clam_dt;
	}

	public String getLast_mang_clam_dt(){
		return this.last_mang_clam_dt;
	}

	public String getIncmg_dt_tm(){
		return this.incmg_dt_tm;
	}

	public String getNm_korn(){
		return this.nm_korn;
	}

	public String getBldg_cd(){
		return this.bldg_cd;
	}

	public String getCntr_star(){
		return this.cntr_star;
	}
}

/* 작성시간 : Mon May 25 14:44:40 KST 2009 */
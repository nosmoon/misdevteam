/***************************************************************************************************
* 파일명 : .java
* 기능 : 자산-입출금관리
* 작성일자 : 2009-09-22
* 작성자 : 노상현
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
 * 자산-입출금관리
 */


public class AS_LEAS_1301_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String clam_yymm;
	public String clam_seq;
	public String clam_dt;
	public String bldg_nm;
	public String hire_dlco_nm;
	public String leas_clam_amt;
	public String mang_clam_amt;
	public String vat_clam_amt;
	public String clam_tot_amt;
	public String leas_rcpm_amt;
	public String mang_rcpm_amt;
	public String vat_rcpm_amt;
	public String rcpm_tot_amt;
	public String upd_slip_dt;
	public String upd_slip_yn;
	public String bldg_cd;
	public String cntr_yy;
	public String cntr_seq;
	public String hire_dlco_ern;
	public String hire_dlco_clsf_cd;
	public String slip_dt;
	public String slip_clsf;
	public String slip_seq;
	public String slip_no;

	public AS_LEAS_1301_LCURLISTRecord(){}

	public void setClam_yymm(String clam_yymm){
		this.clam_yymm = clam_yymm;
	}

	public void setClam_seq(String clam_seq){
		this.clam_seq = clam_seq;
	}

	public void setClam_dt(String clam_dt){
		this.clam_dt = clam_dt;
	}

	public void setBldg_nm(String bldg_nm){
		this.bldg_nm = bldg_nm;
	}

	public void setHire_dlco_nm(String hire_dlco_nm){
		this.hire_dlco_nm = hire_dlco_nm;
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

	public void setLeas_rcpm_amt(String leas_rcpm_amt){
		this.leas_rcpm_amt = leas_rcpm_amt;
	}

	public void setMang_rcpm_amt(String mang_rcpm_amt){
		this.mang_rcpm_amt = mang_rcpm_amt;
	}

	public void setVat_rcpm_amt(String vat_rcpm_amt){
		this.vat_rcpm_amt = vat_rcpm_amt;
	}

	public void setRcpm_tot_amt(String rcpm_tot_amt){
		this.rcpm_tot_amt = rcpm_tot_amt;
	}

	public void setUpd_slip_dt(String upd_slip_dt){
		this.upd_slip_dt = upd_slip_dt;
	}

	public void setUpd_slip_yn(String upd_slip_yn){
		this.upd_slip_yn = upd_slip_yn;
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

	public void setHire_dlco_ern(String hire_dlco_ern){
		this.hire_dlco_ern = hire_dlco_ern;
	}

	public void setHire_dlco_clsf_cd(String hire_dlco_clsf_cd){
		this.hire_dlco_clsf_cd = hire_dlco_clsf_cd;
	}

	public void setSlip_dt(String slip_dt){
		this.slip_dt = slip_dt;
	}

	public void setSlip_clsf(String slip_clsf){
		this.slip_clsf = slip_clsf;
	}

	public void setSlip_seq(String slip_seq){
		this.slip_seq = slip_seq;
	}

	public void setSlip_no(String slip_no){
		this.slip_no = slip_no;
	}

	public String getClam_yymm(){
		return this.clam_yymm;
	}

	public String getClam_seq(){
		return this.clam_seq;
	}

	public String getClam_dt(){
		return this.clam_dt;
	}

	public String getBldg_nm(){
		return this.bldg_nm;
	}

	public String getHire_dlco_nm(){
		return this.hire_dlco_nm;
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

	public String getLeas_rcpm_amt(){
		return this.leas_rcpm_amt;
	}

	public String getMang_rcpm_amt(){
		return this.mang_rcpm_amt;
	}

	public String getVat_rcpm_amt(){
		return this.vat_rcpm_amt;
	}

	public String getRcpm_tot_amt(){
		return this.rcpm_tot_amt;
	}

	public String getUpd_slip_dt(){
		return this.upd_slip_dt;
	}

	public String getUpd_slip_yn(){
		return this.upd_slip_yn;
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

	public String getHire_dlco_ern(){
		return this.hire_dlco_ern;
	}

	public String getHire_dlco_clsf_cd(){
		return this.hire_dlco_clsf_cd;
	}

	public String getSlip_dt(){
		return this.slip_dt;
	}

	public String getSlip_clsf(){
		return this.slip_clsf;
	}

	public String getSlip_seq(){
		return this.slip_seq;
	}

	public String getSlip_no(){
		return this.slip_no;
	}
}

/* 작성시간 : Tue Sep 22 16:45:33 KST 2009 */
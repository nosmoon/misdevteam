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


package chosun.ciis.fc.acct.rec;

import java.sql.*;
import chosun.ciis.fc.acct.dm.*;
import chosun.ciis.fc.acct.ds.*;

/**
 * 
 */


public class FC_ACCT_6221_SCUR_RLESLEASPTCR_LIST_1Record extends java.lang.Object implements java.io.Serializable{

	public String seq;
	public String flor_cnt;
	public String ser_no;
	public String cntr_size;
	public String intg_dlco_cd;
	public String dlco_clsf_cd;
	public String dlco_cd;
	public String hire_firm_nm;
	public String hire_dlco_ern;
	public String leas_fr_dt;
	public String leas_to_dt;
	public String cntr_gurt_amt;
	public String cntr_leas_amt;
	public String cntr_mang_amt;
	public String rent_impt_amt;
	public String rent_gurt_amt_int;
	public String rent_mms_rcpm_amt;
	public String mang_rcpm_amt;
	public String nwsp_dn_yn;
	public String leas_dlco_ern;
	public String dong;
	public String renw_dt;

	public FC_ACCT_6221_SCUR_RLESLEASPTCR_LIST_1Record(){}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setFlor_cnt(String flor_cnt){
		this.flor_cnt = flor_cnt;
	}

	public void setSer_no(String ser_no){
		this.ser_no = ser_no;
	}

	public void setCntr_size(String cntr_size){
		this.cntr_size = cntr_size;
	}

	public void setIntg_dlco_cd(String intg_dlco_cd){
		this.intg_dlco_cd = intg_dlco_cd;
	}

	public void setDlco_clsf_cd(String dlco_clsf_cd){
		this.dlco_clsf_cd = dlco_clsf_cd;
	}

	public void setDlco_cd(String dlco_cd){
		this.dlco_cd = dlco_cd;
	}

	public void setHire_firm_nm(String hire_firm_nm){
		this.hire_firm_nm = hire_firm_nm;
	}

	public void setHire_dlco_ern(String hire_dlco_ern){
		this.hire_dlco_ern = hire_dlco_ern;
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

	public void setRent_impt_amt(String rent_impt_amt){
		this.rent_impt_amt = rent_impt_amt;
	}

	public void setRent_gurt_amt_int(String rent_gurt_amt_int){
		this.rent_gurt_amt_int = rent_gurt_amt_int;
	}

	public void setRent_mms_rcpm_amt(String rent_mms_rcpm_amt){
		this.rent_mms_rcpm_amt = rent_mms_rcpm_amt;
	}

	public void setMang_rcpm_amt(String mang_rcpm_amt){
		this.mang_rcpm_amt = mang_rcpm_amt;
	}

	public void setNwsp_dn_yn(String nwsp_dn_yn){
		this.nwsp_dn_yn = nwsp_dn_yn;
	}

	public void setLeas_dlco_ern(String leas_dlco_ern){
		this.leas_dlco_ern = leas_dlco_ern;
	}

	public void setDong(String dong){
		this.dong = dong;
	}

	public void setRenw_dt(String renw_dt){
		this.renw_dt = renw_dt;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getFlor_cnt(){
		return this.flor_cnt;
	}

	public String getSer_no(){
		return this.ser_no;
	}

	public String getCntr_size(){
		return this.cntr_size;
	}

	public String getIntg_dlco_cd(){
		return this.intg_dlco_cd;
	}

	public String getDlco_clsf_cd(){
		return this.dlco_clsf_cd;
	}

	public String getDlco_cd(){
		return this.dlco_cd;
	}

	public String getHire_firm_nm(){
		return this.hire_firm_nm;
	}

	public String getHire_dlco_ern(){
		return this.hire_dlco_ern;
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

	public String getRent_impt_amt(){
		return this.rent_impt_amt;
	}

	public String getRent_gurt_amt_int(){
		return this.rent_gurt_amt_int;
	}

	public String getRent_mms_rcpm_amt(){
		return this.rent_mms_rcpm_amt;
	}

	public String getMang_rcpm_amt(){
		return this.mang_rcpm_amt;
	}

	public String getNwsp_dn_yn(){
		return this.nwsp_dn_yn;
	}

	public String getLeas_dlco_ern(){
		return this.leas_dlco_ern;
	}

	public String getDong(){
		return this.dong;
	}

	public String getRenw_dt(){
		return this.renw_dt;
	}
}

/* 작성시간 : Sun Jun 22 15:14:06 KST 2014 */
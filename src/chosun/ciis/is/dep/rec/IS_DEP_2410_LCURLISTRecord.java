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


package chosun.ciis.is.dep.rec;

import java.sql.*;
import chosun.ciis.is.dep.dm.*;
import chosun.ciis.is.dep.ds.*;

/**
 * 
 */


public class IS_DEP_2410_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String rcpm_slip_no;
	public String rcpm_shet_no;
	public String note_no;
	public String now_note_stat_nm;
	public String mtry_dt;
	public String bank_cd;
	public String bank_nm;
	public String note_clsf_nm;
	public String note_amt;
	public String issu_pers_nm;
	public String mang_chrg_pers;
	public String rcpm_acct;
	public String sale_aprv_no;
	public String dlco_clsf_cd;
	public String dlco_nm;

	public IS_DEP_2410_LCURLISTRecord(){}

	public void setRcpm_slip_no(String rcpm_slip_no){
		this.rcpm_slip_no = rcpm_slip_no;
	}

	public void setRcpm_shet_no(String rcpm_shet_no){
		this.rcpm_shet_no = rcpm_shet_no;
	}

	public void setNote_no(String note_no){
		this.note_no = note_no;
	}

	public void setNow_note_stat_nm(String now_note_stat_nm){
		this.now_note_stat_nm = now_note_stat_nm;
	}

	public void setMtry_dt(String mtry_dt){
		this.mtry_dt = mtry_dt;
	}

	public void setBank_cd(String bank_cd){
		this.bank_cd = bank_cd;
	}

	public void setBank_nm(String bank_nm){
		this.bank_nm = bank_nm;
	}

	public void setNote_clsf_nm(String note_clsf_nm){
		this.note_clsf_nm = note_clsf_nm;
	}

	public void setNote_amt(String note_amt){
		this.note_amt = note_amt;
	}

	public void setIssu_pers_nm(String issu_pers_nm){
		this.issu_pers_nm = issu_pers_nm;
	}

	public void setMang_chrg_pers(String mang_chrg_pers){
		this.mang_chrg_pers = mang_chrg_pers;
	}

	public void setRcpm_acct(String rcpm_acct){
		this.rcpm_acct = rcpm_acct;
	}

	public void setSale_aprv_no(String sale_aprv_no){
		this.sale_aprv_no = sale_aprv_no;
	}

	public void setDlco_clsf_cd(String dlco_clsf_cd){
		this.dlco_clsf_cd = dlco_clsf_cd;
	}

	public void setDlco_nm(String dlco_nm){
		this.dlco_nm = dlco_nm;
	}

	public String getRcpm_slip_no(){
		return this.rcpm_slip_no;
	}

	public String getRcpm_shet_no(){
		return this.rcpm_shet_no;
	}

	public String getNote_no(){
		return this.note_no;
	}

	public String getNow_note_stat_nm(){
		return this.now_note_stat_nm;
	}

	public String getMtry_dt(){
		return this.mtry_dt;
	}

	public String getBank_cd(){
		return this.bank_cd;
	}

	public String getBank_nm(){
		return this.bank_nm;
	}

	public String getNote_clsf_nm(){
		return this.note_clsf_nm;
	}

	public String getNote_amt(){
		return this.note_amt;
	}

	public String getIssu_pers_nm(){
		return this.issu_pers_nm;
	}

	public String getMang_chrg_pers(){
		return this.mang_chrg_pers;
	}

	public String getRcpm_acct(){
		return this.rcpm_acct;
	}

	public String getSale_aprv_no(){
		return this.sale_aprv_no;
	}

	public String getDlco_clsf_cd(){
		return this.dlco_clsf_cd;
	}

	public String getDlco_nm(){
		return this.dlco_nm;
	}
}

/* 작성시간 : Tue May 22 13:32:22 KST 2012 */
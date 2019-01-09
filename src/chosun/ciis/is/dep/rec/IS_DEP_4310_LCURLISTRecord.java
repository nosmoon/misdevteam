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


public class IS_DEP_4310_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String reg_yn;
	public String occr_dt;
	public String bank_cd;
	public String note_clsf_cd;
	public String occr_seq;
	public String bank_nm;
	public String note_clsf_nm;
	public String issu_cmpy_clsf_cd;
	public String issu_pers_nm;
	public String endorser_nm;
	public String note_amt;
	public String comp_dt;
	public String mtry_dt;
	public String rcpm_acct;
	public String sale_aprv_no;
	public String note_no;
	public String note_seq;
	public String rcpm_slip_no;

	public IS_DEP_4310_LCURLISTRecord(){}

	public void setReg_yn(String reg_yn){
		this.reg_yn = reg_yn;
	}

	public void setOccr_dt(String occr_dt){
		this.occr_dt = occr_dt;
	}

	public void setBank_cd(String bank_cd){
		this.bank_cd = bank_cd;
	}

	public void setNote_clsf_cd(String note_clsf_cd){
		this.note_clsf_cd = note_clsf_cd;
	}

	public void setOccr_seq(String occr_seq){
		this.occr_seq = occr_seq;
	}

	public void setBank_nm(String bank_nm){
		this.bank_nm = bank_nm;
	}

	public void setNote_clsf_nm(String note_clsf_nm){
		this.note_clsf_nm = note_clsf_nm;
	}

	public void setIssu_cmpy_clsf_cd(String issu_cmpy_clsf_cd){
		this.issu_cmpy_clsf_cd = issu_cmpy_clsf_cd;
	}

	public void setIssu_pers_nm(String issu_pers_nm){
		this.issu_pers_nm = issu_pers_nm;
	}

	public void setEndorser_nm(String endorser_nm){
		this.endorser_nm = endorser_nm;
	}

	public void setNote_amt(String note_amt){
		this.note_amt = note_amt;
	}

	public void setComp_dt(String comp_dt){
		this.comp_dt = comp_dt;
	}

	public void setMtry_dt(String mtry_dt){
		this.mtry_dt = mtry_dt;
	}

	public void setRcpm_acct(String rcpm_acct){
		this.rcpm_acct = rcpm_acct;
	}

	public void setSale_aprv_no(String sale_aprv_no){
		this.sale_aprv_no = sale_aprv_no;
	}

	public void setNote_no(String note_no){
		this.note_no = note_no;
	}

	public void setNote_seq(String note_seq){
		this.note_seq = note_seq;
	}

	public void setRcpm_slip_no(String rcpm_slip_no){
		this.rcpm_slip_no = rcpm_slip_no;
	}

	public String getReg_yn(){
		return this.reg_yn;
	}

	public String getOccr_dt(){
		return this.occr_dt;
	}

	public String getBank_cd(){
		return this.bank_cd;
	}

	public String getNote_clsf_cd(){
		return this.note_clsf_cd;
	}

	public String getOccr_seq(){
		return this.occr_seq;
	}

	public String getBank_nm(){
		return this.bank_nm;
	}

	public String getNote_clsf_nm(){
		return this.note_clsf_nm;
	}

	public String getIssu_cmpy_clsf_cd(){
		return this.issu_cmpy_clsf_cd;
	}

	public String getIssu_pers_nm(){
		return this.issu_pers_nm;
	}

	public String getEndorser_nm(){
		return this.endorser_nm;
	}

	public String getNote_amt(){
		return this.note_amt;
	}

	public String getComp_dt(){
		return this.comp_dt;
	}

	public String getMtry_dt(){
		return this.mtry_dt;
	}

	public String getRcpm_acct(){
		return this.rcpm_acct;
	}

	public String getSale_aprv_no(){
		return this.sale_aprv_no;
	}

	public String getNote_no(){
		return this.note_no;
	}

	public String getNote_seq(){
		return this.note_seq;
	}

	public String getRcpm_slip_no(){
		return this.rcpm_slip_no;
	}
}

/* 작성시간 : Wed May 16 19:49:37 KST 2012 */
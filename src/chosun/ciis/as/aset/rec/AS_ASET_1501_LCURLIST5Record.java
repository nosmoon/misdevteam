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


package chosun.ciis.as.aset.rec;

import java.sql.*;
import chosun.ciis.as.aset.dm.*;
import chosun.ciis.as.aset.ds.*;

/**
 * 
 */


public class AS_ASET_1501_LCURLIST5Record extends java.lang.Object implements java.io.Serializable{

	public String note_note_no;
	public String note_rcpm_amt;
	public String note_note_clsf_cd;
	public String note_bank_cd;
	public String note_bank_nm;
	public String note_issu_pers_nm;
	public String note_issu_cmpy_clsf;
	public String note_comp_dt;
	public String note_mtry_dt;
	public String note_rcpm_acct;
	public String note_sale_aprv_no;
	public String note_sub_seq;

	public AS_ASET_1501_LCURLIST5Record(){}

	public void setNote_note_no(String note_note_no){
		this.note_note_no = note_note_no;
	}

	public void setNote_rcpm_amt(String note_rcpm_amt){
		this.note_rcpm_amt = note_rcpm_amt;
	}

	public void setNote_note_clsf_cd(String note_note_clsf_cd){
		this.note_note_clsf_cd = note_note_clsf_cd;
	}

	public void setNote_bank_cd(String note_bank_cd){
		this.note_bank_cd = note_bank_cd;
	}

	public void setNote_bank_nm(String note_bank_nm){
		this.note_bank_nm = note_bank_nm;
	}

	public void setNote_issu_pers_nm(String note_issu_pers_nm){
		this.note_issu_pers_nm = note_issu_pers_nm;
	}

	public void setNote_issu_cmpy_clsf(String note_issu_cmpy_clsf){
		this.note_issu_cmpy_clsf = note_issu_cmpy_clsf;
	}

	public void setNote_comp_dt(String note_comp_dt){
		this.note_comp_dt = note_comp_dt;
	}

	public void setNote_mtry_dt(String note_mtry_dt){
		this.note_mtry_dt = note_mtry_dt;
	}

	public void setNote_rcpm_acct(String note_rcpm_acct){
		this.note_rcpm_acct = note_rcpm_acct;
	}

	public void setNote_sale_aprv_no(String note_sale_aprv_no){
		this.note_sale_aprv_no = note_sale_aprv_no;
	}

	public void setNote_sub_seq(String note_sub_seq){
		this.note_sub_seq = note_sub_seq;
	}

	public String getNote_note_no(){
		return this.note_note_no;
	}

	public String getNote_rcpm_amt(){
		return this.note_rcpm_amt;
	}

	public String getNote_note_clsf_cd(){
		return this.note_note_clsf_cd;
	}

	public String getNote_bank_cd(){
		return this.note_bank_cd;
	}

	public String getNote_bank_nm(){
		return this.note_bank_nm;
	}

	public String getNote_issu_pers_nm(){
		return this.note_issu_pers_nm;
	}

	public String getNote_issu_cmpy_clsf(){
		return this.note_issu_cmpy_clsf;
	}

	public String getNote_comp_dt(){
		return this.note_comp_dt;
	}

	public String getNote_mtry_dt(){
		return this.note_mtry_dt;
	}

	public String getNote_rcpm_acct(){
		return this.note_rcpm_acct;
	}

	public String getNote_sale_aprv_no(){
		return this.note_sale_aprv_no;
	}

	public String getNote_sub_seq(){
		return this.note_sub_seq;
	}
}

/* 작성시간 : Wed May 27 11:18:13 KST 2009 */
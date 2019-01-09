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


public class FC_ACCT_2125_SCURLIST2Record extends java.lang.Object implements java.io.Serializable{

	public String g2_rcpm_sub_seq;
	public String g2_note_no;
	public String g2_rcpm_amt;
	public String g2_note_clsf_cd;
	public String g2_bank_cd;
	public String g2_bank_cd_nm;
	public String g2_issu_pers_nm;
	public String g2_issu_cmpy_clsf_cd;
	public String g2_comp_dt;
	public String g2_mtry_dt;
	public String g2_rcpm_acct;
	public String g2_sale_aprv_no;

	public FC_ACCT_2125_SCURLIST2Record(){}

	public void setG2_rcpm_sub_seq(String g2_rcpm_sub_seq){
		this.g2_rcpm_sub_seq = g2_rcpm_sub_seq;
	}

	public void setG2_note_no(String g2_note_no){
		this.g2_note_no = g2_note_no;
	}

	public void setG2_rcpm_amt(String g2_rcpm_amt){
		this.g2_rcpm_amt = g2_rcpm_amt;
	}

	public void setG2_note_clsf_cd(String g2_note_clsf_cd){
		this.g2_note_clsf_cd = g2_note_clsf_cd;
	}

	public void setG2_bank_cd(String g2_bank_cd){
		this.g2_bank_cd = g2_bank_cd;
	}

	public void setG2_bank_cd_nm(String g2_bank_cd_nm){
		this.g2_bank_cd_nm = g2_bank_cd_nm;
	}

	public void setG2_issu_pers_nm(String g2_issu_pers_nm){
		this.g2_issu_pers_nm = g2_issu_pers_nm;
	}

	public void setG2_issu_cmpy_clsf_cd(String g2_issu_cmpy_clsf_cd){
		this.g2_issu_cmpy_clsf_cd = g2_issu_cmpy_clsf_cd;
	}

	public void setG2_comp_dt(String g2_comp_dt){
		this.g2_comp_dt = g2_comp_dt;
	}

	public void setG2_mtry_dt(String g2_mtry_dt){
		this.g2_mtry_dt = g2_mtry_dt;
	}

	public void setG2_rcpm_acct(String g2_rcpm_acct){
		this.g2_rcpm_acct = g2_rcpm_acct;
	}

	public void setG2_sale_aprv_no(String g2_sale_aprv_no){
		this.g2_sale_aprv_no = g2_sale_aprv_no;
	}

	public String getG2_rcpm_sub_seq(){
		return this.g2_rcpm_sub_seq;
	}

	public String getG2_note_no(){
		return this.g2_note_no;
	}

	public String getG2_rcpm_amt(){
		return this.g2_rcpm_amt;
	}

	public String getG2_note_clsf_cd(){
		return this.g2_note_clsf_cd;
	}

	public String getG2_bank_cd(){
		return this.g2_bank_cd;
	}

	public String getG2_bank_cd_nm(){
		return this.g2_bank_cd_nm;
	}

	public String getG2_issu_pers_nm(){
		return this.g2_issu_pers_nm;
	}

	public String getG2_issu_cmpy_clsf_cd(){
		return this.g2_issu_cmpy_clsf_cd;
	}

	public String getG2_comp_dt(){
		return this.g2_comp_dt;
	}

	public String getG2_mtry_dt(){
		return this.g2_mtry_dt;
	}

	public String getG2_rcpm_acct(){
		return this.g2_rcpm_acct;
	}

	public String getG2_sale_aprv_no(){
		return this.g2_sale_aprv_no;
	}
}

/* 작성시간 : Fri Aug 14 15:33:11 KST 2009 */
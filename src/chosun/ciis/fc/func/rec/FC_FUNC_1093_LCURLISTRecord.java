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


package chosun.ciis.fc.func.rec;

import java.sql.*;
import chosun.ciis.fc.func.dm.*;
import chosun.ciis.fc.func.ds.*;

/**
 * 
 */


public class FC_FUNC_1093_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String a_nbn_no;
	public String a_note_clsf_cd;
	public String a_note_amt;
	public String a_comp_dt;
	public String a_mtry_dt;
	public String a_issu_cmpy_clsf_cd;
	public String a_issu_pers_nm;
	public String a_bank_cd_nm;
	public String a_note_no;
	public String a_note_seq;
	public String a_bank_cd;
	public String a_rcpm_acct;
	public String a_sale_aprv_no;
	public String a_note_clsf_cd2;

	public FC_FUNC_1093_LCURLISTRecord(){}

	public void setA_nbn_no(String a_nbn_no){
		this.a_nbn_no = a_nbn_no;
	}

	public void setA_note_clsf_cd(String a_note_clsf_cd){
		this.a_note_clsf_cd = a_note_clsf_cd;
	}

	public void setA_note_amt(String a_note_amt){
		this.a_note_amt = a_note_amt;
	}

	public void setA_comp_dt(String a_comp_dt){
		this.a_comp_dt = a_comp_dt;
	}

	public void setA_mtry_dt(String a_mtry_dt){
		this.a_mtry_dt = a_mtry_dt;
	}

	public void setA_issu_cmpy_clsf_cd(String a_issu_cmpy_clsf_cd){
		this.a_issu_cmpy_clsf_cd = a_issu_cmpy_clsf_cd;
	}

	public void setA_issu_pers_nm(String a_issu_pers_nm){
		this.a_issu_pers_nm = a_issu_pers_nm;
	}

	public void setA_bank_cd_nm(String a_bank_cd_nm){
		this.a_bank_cd_nm = a_bank_cd_nm;
	}

	public void setA_note_no(String a_note_no){
		this.a_note_no = a_note_no;
	}

	public void setA_note_seq(String a_note_seq){
		this.a_note_seq = a_note_seq;
	}

	public void setA_bank_cd(String a_bank_cd){
		this.a_bank_cd = a_bank_cd;
	}

	public void setA_rcpm_acct(String a_rcpm_acct){
		this.a_rcpm_acct = a_rcpm_acct;
	}

	public void setA_sale_aprv_no(String a_sale_aprv_no){
		this.a_sale_aprv_no = a_sale_aprv_no;
	}

	public void setA_note_clsf_cd2(String a_note_clsf_cd2){
		this.a_note_clsf_cd2 = a_note_clsf_cd2;
	}

	public String getA_nbn_no(){
		return this.a_nbn_no;
	}

	public String getA_note_clsf_cd(){
		return this.a_note_clsf_cd;
	}

	public String getA_note_amt(){
		return this.a_note_amt;
	}

	public String getA_comp_dt(){
		return this.a_comp_dt;
	}

	public String getA_mtry_dt(){
		return this.a_mtry_dt;
	}

	public String getA_issu_cmpy_clsf_cd(){
		return this.a_issu_cmpy_clsf_cd;
	}

	public String getA_issu_pers_nm(){
		return this.a_issu_pers_nm;
	}

	public String getA_bank_cd_nm(){
		return this.a_bank_cd_nm;
	}

	public String getA_note_no(){
		return this.a_note_no;
	}

	public String getA_note_seq(){
		return this.a_note_seq;
	}

	public String getA_bank_cd(){
		return this.a_bank_cd;
	}

	public String getA_rcpm_acct(){
		return this.a_rcpm_acct;
	}

	public String getA_sale_aprv_no(){
		return this.a_sale_aprv_no;
	}

	public String getA_note_clsf_cd2(){
		return this.a_note_clsf_cd2;
	}
}

/* 작성시간 : Mon Mar 26 15:02:47 KST 2018 */
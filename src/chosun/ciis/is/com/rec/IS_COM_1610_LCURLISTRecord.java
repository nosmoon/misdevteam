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


package chosun.ciis.is.com.rec;

import java.sql.*;
import chosun.ciis.is.com.dm.*;
import chosun.ciis.is.com.ds.*;

/**
 * 
 */


public class IS_COM_1610_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String bank_cd;
	public String bank_nm;
	public String note_clsf_cd;
	public String note_clsf_nm;
	public String note_amt;
	public String comp_dt;
	public String mtry_dt;
	public String issu_cmpy_clsf_cd;
	public String issu_pers_nm;
	public String endorser_nm;
	public String rcpm_acct;
	public String rcpm_acct_nm;
	public String sale_aprv_no;
	public String elec_note_key;

	public IS_COM_1610_LCURLISTRecord(){}

	public void setBank_cd(String bank_cd){
		this.bank_cd = bank_cd;
	}

	public void setBank_nm(String bank_nm){
		this.bank_nm = bank_nm;
	}

	public void setNote_clsf_cd(String note_clsf_cd){
		this.note_clsf_cd = note_clsf_cd;
	}

	public void setNote_clsf_nm(String note_clsf_nm){
		this.note_clsf_nm = note_clsf_nm;
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

	public void setIssu_cmpy_clsf_cd(String issu_cmpy_clsf_cd){
		this.issu_cmpy_clsf_cd = issu_cmpy_clsf_cd;
	}

	public void setIssu_pers_nm(String issu_pers_nm){
		this.issu_pers_nm = issu_pers_nm;
	}

	public void setEndorser_nm(String endorser_nm){
		this.endorser_nm = endorser_nm;
	}

	public void setRcpm_acct(String rcpm_acct){
		this.rcpm_acct = rcpm_acct;
	}

	public void setRcpm_acct_nm(String rcpm_acct_nm){
		this.rcpm_acct_nm = rcpm_acct_nm;
	}

	public void setSale_aprv_no(String sale_aprv_no){
		this.sale_aprv_no = sale_aprv_no;
	}

	public void setElec_note_key(String elec_note_key){
		this.elec_note_key = elec_note_key;
	}

	public String getBank_cd(){
		return this.bank_cd;
	}

	public String getBank_nm(){
		return this.bank_nm;
	}

	public String getNote_clsf_cd(){
		return this.note_clsf_cd;
	}

	public String getNote_clsf_nm(){
		return this.note_clsf_nm;
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

	public String getIssu_cmpy_clsf_cd(){
		return this.issu_cmpy_clsf_cd;
	}

	public String getIssu_pers_nm(){
		return this.issu_pers_nm;
	}

	public String getEndorser_nm(){
		return this.endorser_nm;
	}

	public String getRcpm_acct(){
		return this.rcpm_acct;
	}

	public String getRcpm_acct_nm(){
		return this.rcpm_acct_nm;
	}

	public String getSale_aprv_no(){
		return this.sale_aprv_no;
	}

	public String getElec_note_key(){
		return this.elec_note_key;
	}
}

/* 작성시간 : Thu May 17 21:26:47 KST 2012 */
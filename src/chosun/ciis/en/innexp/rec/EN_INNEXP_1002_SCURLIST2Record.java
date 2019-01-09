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


package chosun.ciis.en.innexp.rec;

import java.sql.*;
import chosun.ciis.en.innexp.dm.*;
import chosun.ciis.en.innexp.ds.*;

/**
 * 
 */


public class EN_INNEXP_1002_SCURLIST2Record extends java.lang.Object implements java.io.Serializable{

	public String budg_cd;
	public String budg_nm;
	public String amt;
	public String acct_mang_no;
	public String rmtt_dt;
	public String rmtt_plac;
	public String note_no;
	public String note_clsf_cd;
	public String bank_cd;
	public String bank_nm;
	public String issu_pers_nm;
	public String issu_cmpy_clsf_cd;
	public String comp_dt;
	public String mtry_dt;
	public String rcpm_acct;
	public String sale_aprv_no;
	public String bal_occr_slip_no;
	public String extnc_obj_slip_clsf;
	public String extnc_dlco_no;
	public String medi_cd;
	public String acct_mang_nm;
	public String biz_reg_no;
	public String bank_id;
	public String acct_num;
	public String tran_date;
	public String tran_date_seq;
	public String slip_no;

	public EN_INNEXP_1002_SCURLIST2Record(){}

	public void setBudg_cd(String budg_cd){
		this.budg_cd = budg_cd;
	}

	public void setBudg_nm(String budg_nm){
		this.budg_nm = budg_nm;
	}

	public void setAmt(String amt){
		this.amt = amt;
	}

	public void setAcct_mang_no(String acct_mang_no){
		this.acct_mang_no = acct_mang_no;
	}

	public void setRmtt_dt(String rmtt_dt){
		this.rmtt_dt = rmtt_dt;
	}

	public void setRmtt_plac(String rmtt_plac){
		this.rmtt_plac = rmtt_plac;
	}

	public void setNote_no(String note_no){
		this.note_no = note_no;
	}

	public void setNote_clsf_cd(String note_clsf_cd){
		this.note_clsf_cd = note_clsf_cd;
	}

	public void setBank_cd(String bank_cd){
		this.bank_cd = bank_cd;
	}

	public void setBank_nm(String bank_nm){
		this.bank_nm = bank_nm;
	}

	public void setIssu_pers_nm(String issu_pers_nm){
		this.issu_pers_nm = issu_pers_nm;
	}

	public void setIssu_cmpy_clsf_cd(String issu_cmpy_clsf_cd){
		this.issu_cmpy_clsf_cd = issu_cmpy_clsf_cd;
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

	public void setBal_occr_slip_no(String bal_occr_slip_no){
		this.bal_occr_slip_no = bal_occr_slip_no;
	}

	public void setExtnc_obj_slip_clsf(String extnc_obj_slip_clsf){
		this.extnc_obj_slip_clsf = extnc_obj_slip_clsf;
	}

	public void setExtnc_dlco_no(String extnc_dlco_no){
		this.extnc_dlco_no = extnc_dlco_no;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setAcct_mang_nm(String acct_mang_nm){
		this.acct_mang_nm = acct_mang_nm;
	}

	public void setBiz_reg_no(String biz_reg_no){
		this.biz_reg_no = biz_reg_no;
	}

	public void setBank_id(String bank_id){
		this.bank_id = bank_id;
	}

	public void setAcct_num(String acct_num){
		this.acct_num = acct_num;
	}

	public void setTran_date(String tran_date){
		this.tran_date = tran_date;
	}

	public void setTran_date_seq(String tran_date_seq){
		this.tran_date_seq = tran_date_seq;
	}

	public void setSlip_no(String slip_no){
		this.slip_no = slip_no;
	}

	public String getBudg_cd(){
		return this.budg_cd;
	}

	public String getBudg_nm(){
		return this.budg_nm;
	}

	public String getAmt(){
		return this.amt;
	}

	public String getAcct_mang_no(){
		return this.acct_mang_no;
	}

	public String getRmtt_dt(){
		return this.rmtt_dt;
	}

	public String getRmtt_plac(){
		return this.rmtt_plac;
	}

	public String getNote_no(){
		return this.note_no;
	}

	public String getNote_clsf_cd(){
		return this.note_clsf_cd;
	}

	public String getBank_cd(){
		return this.bank_cd;
	}

	public String getBank_nm(){
		return this.bank_nm;
	}

	public String getIssu_pers_nm(){
		return this.issu_pers_nm;
	}

	public String getIssu_cmpy_clsf_cd(){
		return this.issu_cmpy_clsf_cd;
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

	public String getBal_occr_slip_no(){
		return this.bal_occr_slip_no;
	}

	public String getExtnc_obj_slip_clsf(){
		return this.extnc_obj_slip_clsf;
	}

	public String getExtnc_dlco_no(){
		return this.extnc_dlco_no;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getAcct_mang_nm(){
		return this.acct_mang_nm;
	}

	public String getBiz_reg_no(){
		return this.biz_reg_no;
	}

	public String getBank_id(){
		return this.bank_id;
	}

	public String getAcct_num(){
		return this.acct_num;
	}

	public String getTran_date(){
		return this.tran_date;
	}

	public String getTran_date_seq(){
		return this.tran_date_seq;
	}

	public String getSlip_no(){
		return this.slip_no;
	}
}

/* 작성시간 : Fri May 22 14:20:59 KST 2009 */
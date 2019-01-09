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


package chosun.ciis.ad.dep.rec;

import java.sql.*;
import chosun.ciis.ad.dep.dm.*;
import chosun.ciis.ad.dep.ds.*;

/**
 * 
 */


public class AD_DEP_1010_SCURLIST2Record extends java.lang.Object implements java.io.Serializable{

	public String occr_dt;
	public String slip_clsf;
	public String seq;
	public String subseq;
	public String rcpm_dt;
	public String drcr_clsf;
	public String budg_cd;
	public String amt;
	public String occr_amt;
	public String rcpm_shet_no;
	public String actu_slip_no;
	public String acct_mang_no;
	public String acct_mang_nm;
	public String rmtt_dt;
	public String rmtt_plac;
	public String rmtt_coms;
	public String vat;
	public String rcpm_plac_clsf;
	public String dlco_no;
	public String dlco_nm;
	public String rcpm_slip_no;
	public String self_cmpy_yn;
	public String dept_cd;
	public String mang_chrg_pers;
	public String altn_yn;
	public String depo_job_clsf;
	public String clos_stat;
	public String curc_clsf;
	public String frex_amt;
	public String rcpm_clsf;
	public String current_clsf;
	public String medi_cd;
	public String medi_nm;
	public String occr_dlco_cd;
	public String occr_dlco_nm;
	public String biz_reg_no;
	public String bank_id;
	public String acct_num;
	public String tran_date;
	public String tran_date_seq;
	public String card_yn;

	public AD_DEP_1010_SCURLIST2Record(){}

	public void setOccr_dt(String occr_dt){
		this.occr_dt = occr_dt;
	}

	public void setSlip_clsf(String slip_clsf){
		this.slip_clsf = slip_clsf;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setSubseq(String subseq){
		this.subseq = subseq;
	}

	public void setRcpm_dt(String rcpm_dt){
		this.rcpm_dt = rcpm_dt;
	}

	public void setDrcr_clsf(String drcr_clsf){
		this.drcr_clsf = drcr_clsf;
	}

	public void setBudg_cd(String budg_cd){
		this.budg_cd = budg_cd;
	}

	public void setAmt(String amt){
		this.amt = amt;
	}

	public void setOccr_amt(String occr_amt){
		this.occr_amt = occr_amt;
	}

	public void setRcpm_shet_no(String rcpm_shet_no){
		this.rcpm_shet_no = rcpm_shet_no;
	}

	public void setActu_slip_no(String actu_slip_no){
		this.actu_slip_no = actu_slip_no;
	}

	public void setAcct_mang_no(String acct_mang_no){
		this.acct_mang_no = acct_mang_no;
	}

	public void setAcct_mang_nm(String acct_mang_nm){
		this.acct_mang_nm = acct_mang_nm;
	}

	public void setRmtt_dt(String rmtt_dt){
		this.rmtt_dt = rmtt_dt;
	}

	public void setRmtt_plac(String rmtt_plac){
		this.rmtt_plac = rmtt_plac;
	}

	public void setRmtt_coms(String rmtt_coms){
		this.rmtt_coms = rmtt_coms;
	}

	public void setVat(String vat){
		this.vat = vat;
	}

	public void setRcpm_plac_clsf(String rcpm_plac_clsf){
		this.rcpm_plac_clsf = rcpm_plac_clsf;
	}

	public void setDlco_no(String dlco_no){
		this.dlco_no = dlco_no;
	}

	public void setDlco_nm(String dlco_nm){
		this.dlco_nm = dlco_nm;
	}

	public void setRcpm_slip_no(String rcpm_slip_no){
		this.rcpm_slip_no = rcpm_slip_no;
	}

	public void setSelf_cmpy_yn(String self_cmpy_yn){
		this.self_cmpy_yn = self_cmpy_yn;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setMang_chrg_pers(String mang_chrg_pers){
		this.mang_chrg_pers = mang_chrg_pers;
	}

	public void setAltn_yn(String altn_yn){
		this.altn_yn = altn_yn;
	}

	public void setDepo_job_clsf(String depo_job_clsf){
		this.depo_job_clsf = depo_job_clsf;
	}

	public void setClos_stat(String clos_stat){
		this.clos_stat = clos_stat;
	}

	public void setCurc_clsf(String curc_clsf){
		this.curc_clsf = curc_clsf;
	}

	public void setFrex_amt(String frex_amt){
		this.frex_amt = frex_amt;
	}

	public void setRcpm_clsf(String rcpm_clsf){
		this.rcpm_clsf = rcpm_clsf;
	}

	public void setCurrent_clsf(String current_clsf){
		this.current_clsf = current_clsf;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setMedi_nm(String medi_nm){
		this.medi_nm = medi_nm;
	}

	public void setOccr_dlco_cd(String occr_dlco_cd){
		this.occr_dlco_cd = occr_dlco_cd;
	}

	public void setOccr_dlco_nm(String occr_dlco_nm){
		this.occr_dlco_nm = occr_dlco_nm;
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

	public void setCard_yn(String card_yn){
		this.card_yn = card_yn;
	}

	public String getOccr_dt(){
		return this.occr_dt;
	}

	public String getSlip_clsf(){
		return this.slip_clsf;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getSubseq(){
		return this.subseq;
	}

	public String getRcpm_dt(){
		return this.rcpm_dt;
	}

	public String getDrcr_clsf(){
		return this.drcr_clsf;
	}

	public String getBudg_cd(){
		return this.budg_cd;
	}

	public String getAmt(){
		return this.amt;
	}

	public String getOccr_amt(){
		return this.occr_amt;
	}

	public String getRcpm_shet_no(){
		return this.rcpm_shet_no;
	}

	public String getActu_slip_no(){
		return this.actu_slip_no;
	}

	public String getAcct_mang_no(){
		return this.acct_mang_no;
	}

	public String getAcct_mang_nm(){
		return this.acct_mang_nm;
	}

	public String getRmtt_dt(){
		return this.rmtt_dt;
	}

	public String getRmtt_plac(){
		return this.rmtt_plac;
	}

	public String getRmtt_coms(){
		return this.rmtt_coms;
	}

	public String getVat(){
		return this.vat;
	}

	public String getRcpm_plac_clsf(){
		return this.rcpm_plac_clsf;
	}

	public String getDlco_no(){
		return this.dlco_no;
	}

	public String getDlco_nm(){
		return this.dlco_nm;
	}

	public String getRcpm_slip_no(){
		return this.rcpm_slip_no;
	}

	public String getSelf_cmpy_yn(){
		return this.self_cmpy_yn;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getMang_chrg_pers(){
		return this.mang_chrg_pers;
	}

	public String getAltn_yn(){
		return this.altn_yn;
	}

	public String getDepo_job_clsf(){
		return this.depo_job_clsf;
	}

	public String getClos_stat(){
		return this.clos_stat;
	}

	public String getCurc_clsf(){
		return this.curc_clsf;
	}

	public String getFrex_amt(){
		return this.frex_amt;
	}

	public String getRcpm_clsf(){
		return this.rcpm_clsf;
	}

	public String getCurrent_clsf(){
		return this.current_clsf;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getMedi_nm(){
		return this.medi_nm;
	}

	public String getOccr_dlco_cd(){
		return this.occr_dlco_cd;
	}

	public String getOccr_dlco_nm(){
		return this.occr_dlco_nm;
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

	public String getCard_yn(){
		return this.card_yn;
	}
}

/* 작성시간 : Thu Feb 05 15:11:48 KST 2015 */
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


public class FC_FUNC_8001_SCURLIST1Record extends java.lang.Object implements java.io.Serializable{

	public String cmpy_cd;
	public String cntr_clsf_cd;
	public String leas_clsf_cd;
	public String leas_no;
	public String leas_sub_seq;
	public String leas_hire_clsf_cd;
	public String leas_nm;
	public String cntr_no;
	public String frcr_amt;
	public String won_amt;
	public String libo_int_rate;
	public String dedu_int_rate;
	public String comp_dt;
	public String mtry_dt;
	public String dlco_clsf_cd;
	public String dlco_cd;
	public String dlco_nm;
	public String use_dept_cd;
	public String use_dept_nm;
	public String medi_cd;
	public String medi_nm;
	public String dtls_medi_cd;
	public String re_leas_yn;
	public String frex_cd;
	public String exrate;
	public String rmks;
	public String pymt_cycl;
	public String pay_plan_tms;
	public String libo_yn;
	public String usag;
	public String loca;
	public String fst_leas_clsf_cd;
	public String fst_leas_no;
	public String int_calc_cd;
	public String good_curc;
	public String good_amt;
	public String end_aftr;
	public String leas_stat_cd;
	public String leas_stat_nm;
	public String end_dt;
	public String prelae_pay_clsf_cd;
	public String basi_int;
	public String leas_int_rate;
	public String prd_int_rate;
	public String tms_leas_amt;
	public String tot_leas_fee;
	public String decid_amt;
	public String prd_int;

	public FC_FUNC_8001_SCURLIST1Record(){}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setCntr_clsf_cd(String cntr_clsf_cd){
		this.cntr_clsf_cd = cntr_clsf_cd;
	}

	public void setLeas_clsf_cd(String leas_clsf_cd){
		this.leas_clsf_cd = leas_clsf_cd;
	}

	public void setLeas_no(String leas_no){
		this.leas_no = leas_no;
	}

	public void setLeas_sub_seq(String leas_sub_seq){
		this.leas_sub_seq = leas_sub_seq;
	}

	public void setLeas_hire_clsf_cd(String leas_hire_clsf_cd){
		this.leas_hire_clsf_cd = leas_hire_clsf_cd;
	}

	public void setLeas_nm(String leas_nm){
		this.leas_nm = leas_nm;
	}

	public void setCntr_no(String cntr_no){
		this.cntr_no = cntr_no;
	}

	public void setFrcr_amt(String frcr_amt){
		this.frcr_amt = frcr_amt;
	}

	public void setWon_amt(String won_amt){
		this.won_amt = won_amt;
	}

	public void setLibo_int_rate(String libo_int_rate){
		this.libo_int_rate = libo_int_rate;
	}

	public void setDedu_int_rate(String dedu_int_rate){
		this.dedu_int_rate = dedu_int_rate;
	}

	public void setComp_dt(String comp_dt){
		this.comp_dt = comp_dt;
	}

	public void setMtry_dt(String mtry_dt){
		this.mtry_dt = mtry_dt;
	}

	public void setDlco_clsf_cd(String dlco_clsf_cd){
		this.dlco_clsf_cd = dlco_clsf_cd;
	}

	public void setDlco_cd(String dlco_cd){
		this.dlco_cd = dlco_cd;
	}

	public void setDlco_nm(String dlco_nm){
		this.dlco_nm = dlco_nm;
	}

	public void setUse_dept_cd(String use_dept_cd){
		this.use_dept_cd = use_dept_cd;
	}

	public void setUse_dept_nm(String use_dept_nm){
		this.use_dept_nm = use_dept_nm;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setMedi_nm(String medi_nm){
		this.medi_nm = medi_nm;
	}

	public void setDtls_medi_cd(String dtls_medi_cd){
		this.dtls_medi_cd = dtls_medi_cd;
	}

	public void setRe_leas_yn(String re_leas_yn){
		this.re_leas_yn = re_leas_yn;
	}

	public void setFrex_cd(String frex_cd){
		this.frex_cd = frex_cd;
	}

	public void setExrate(String exrate){
		this.exrate = exrate;
	}

	public void setRmks(String rmks){
		this.rmks = rmks;
	}

	public void setPymt_cycl(String pymt_cycl){
		this.pymt_cycl = pymt_cycl;
	}

	public void setPay_plan_tms(String pay_plan_tms){
		this.pay_plan_tms = pay_plan_tms;
	}

	public void setLibo_yn(String libo_yn){
		this.libo_yn = libo_yn;
	}

	public void setUsag(String usag){
		this.usag = usag;
	}

	public void setLoca(String loca){
		this.loca = loca;
	}

	public void setFst_leas_clsf_cd(String fst_leas_clsf_cd){
		this.fst_leas_clsf_cd = fst_leas_clsf_cd;
	}

	public void setFst_leas_no(String fst_leas_no){
		this.fst_leas_no = fst_leas_no;
	}

	public void setInt_calc_cd(String int_calc_cd){
		this.int_calc_cd = int_calc_cd;
	}

	public void setGood_curc(String good_curc){
		this.good_curc = good_curc;
	}

	public void setGood_amt(String good_amt){
		this.good_amt = good_amt;
	}

	public void setEnd_aftr(String end_aftr){
		this.end_aftr = end_aftr;
	}

	public void setLeas_stat_cd(String leas_stat_cd){
		this.leas_stat_cd = leas_stat_cd;
	}

	public void setLeas_stat_nm(String leas_stat_nm){
		this.leas_stat_nm = leas_stat_nm;
	}

	public void setEnd_dt(String end_dt){
		this.end_dt = end_dt;
	}

	public void setPrelae_pay_clsf_cd(String prelae_pay_clsf_cd){
		this.prelae_pay_clsf_cd = prelae_pay_clsf_cd;
	}

	public void setBasi_int(String basi_int){
		this.basi_int = basi_int;
	}

	public void setLeas_int_rate(String leas_int_rate){
		this.leas_int_rate = leas_int_rate;
	}

	public void setPrd_int_rate(String prd_int_rate){
		this.prd_int_rate = prd_int_rate;
	}

	public void setTms_leas_amt(String tms_leas_amt){
		this.tms_leas_amt = tms_leas_amt;
	}

	public void setTot_leas_fee(String tot_leas_fee){
		this.tot_leas_fee = tot_leas_fee;
	}

	public void setDecid_amt(String decid_amt){
		this.decid_amt = decid_amt;
	}

	public void setPrd_int(String prd_int){
		this.prd_int = prd_int;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getCntr_clsf_cd(){
		return this.cntr_clsf_cd;
	}

	public String getLeas_clsf_cd(){
		return this.leas_clsf_cd;
	}

	public String getLeas_no(){
		return this.leas_no;
	}

	public String getLeas_sub_seq(){
		return this.leas_sub_seq;
	}

	public String getLeas_hire_clsf_cd(){
		return this.leas_hire_clsf_cd;
	}

	public String getLeas_nm(){
		return this.leas_nm;
	}

	public String getCntr_no(){
		return this.cntr_no;
	}

	public String getFrcr_amt(){
		return this.frcr_amt;
	}

	public String getWon_amt(){
		return this.won_amt;
	}

	public String getLibo_int_rate(){
		return this.libo_int_rate;
	}

	public String getDedu_int_rate(){
		return this.dedu_int_rate;
	}

	public String getComp_dt(){
		return this.comp_dt;
	}

	public String getMtry_dt(){
		return this.mtry_dt;
	}

	public String getDlco_clsf_cd(){
		return this.dlco_clsf_cd;
	}

	public String getDlco_cd(){
		return this.dlco_cd;
	}

	public String getDlco_nm(){
		return this.dlco_nm;
	}

	public String getUse_dept_cd(){
		return this.use_dept_cd;
	}

	public String getUse_dept_nm(){
		return this.use_dept_nm;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getMedi_nm(){
		return this.medi_nm;
	}

	public String getDtls_medi_cd(){
		return this.dtls_medi_cd;
	}

	public String getRe_leas_yn(){
		return this.re_leas_yn;
	}

	public String getFrex_cd(){
		return this.frex_cd;
	}

	public String getExrate(){
		return this.exrate;
	}

	public String getRmks(){
		return this.rmks;
	}

	public String getPymt_cycl(){
		return this.pymt_cycl;
	}

	public String getPay_plan_tms(){
		return this.pay_plan_tms;
	}

	public String getLibo_yn(){
		return this.libo_yn;
	}

	public String getUsag(){
		return this.usag;
	}

	public String getLoca(){
		return this.loca;
	}

	public String getFst_leas_clsf_cd(){
		return this.fst_leas_clsf_cd;
	}

	public String getFst_leas_no(){
		return this.fst_leas_no;
	}

	public String getInt_calc_cd(){
		return this.int_calc_cd;
	}

	public String getGood_curc(){
		return this.good_curc;
	}

	public String getGood_amt(){
		return this.good_amt;
	}

	public String getEnd_aftr(){
		return this.end_aftr;
	}

	public String getLeas_stat_cd(){
		return this.leas_stat_cd;
	}

	public String getLeas_stat_nm(){
		return this.leas_stat_nm;
	}

	public String getEnd_dt(){
		return this.end_dt;
	}

	public String getPrelae_pay_clsf_cd(){
		return this.prelae_pay_clsf_cd;
	}

	public String getBasi_int(){
		return this.basi_int;
	}

	public String getLeas_int_rate(){
		return this.leas_int_rate;
	}

	public String getPrd_int_rate(){
		return this.prd_int_rate;
	}

	public String getTms_leas_amt(){
		return this.tms_leas_amt;
	}

	public String getTot_leas_fee(){
		return this.tot_leas_fee;
	}

	public String getDecid_amt(){
		return this.decid_amt;
	}

	public String getPrd_int(){
		return this.prd_int;
	}
}

/* 작성시간 : Wed Mar 18 13:06:50 KST 2009 */
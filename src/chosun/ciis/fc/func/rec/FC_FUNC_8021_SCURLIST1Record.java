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


public class FC_FUNC_8021_SCURLIST1Record extends java.lang.Object implements java.io.Serializable{

	public String cmpy_cd;
	public String cntr_clsf_cd;
	public String leas_clsf_cd;
	public String leas_no;
	public String leas_sub_seq;
	public String leas_nm;
	public String cntr_no;
	public String frcr_amt;
	public String won_amt;
	public String libo_int_rate;
	public String dedu_int_rate;
	public String comp_dt;
	public String mtry_dt;
	public String re_leas_yn;
	public String frex_cd;
	public String exrate;
	public String rmks;
	public String pymt_cycl;
	public String pay_plan_tms;
	public String libo_yn;
	public String end_aftr;
	public String leas_stat_cd;
	public String leas_stat_nm;
	public String end_dt;
	public String basi_int;
	public String leas_int_rate;
	public String prd_int_rate;
	public String tms_leas_amt;
	public String tot_leas_fee;
	public String decid_amt;
	public String prd_int;
	public String usag;
	public String loca;
	public String int_calc_cdnm;
	public String good_curcnm;
	public String good_amt;
	public String prelae_pay_clsf_cdnm;
	public String fst_leas_no;
	public String fst_leas_nm;
	public String leas_hire_clsf_cdnm;
	public String dlco_cdnm;
	public String use_dept_cdnm;
	public String medi_cdnm;
	public String dtls_medi_cd;

	public FC_FUNC_8021_SCURLIST1Record(){}

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

	public void setUsag(String usag){
		this.usag = usag;
	}

	public void setLoca(String loca){
		this.loca = loca;
	}

	public void setInt_calc_cdnm(String int_calc_cdnm){
		this.int_calc_cdnm = int_calc_cdnm;
	}

	public void setGood_curcnm(String good_curcnm){
		this.good_curcnm = good_curcnm;
	}

	public void setGood_amt(String good_amt){
		this.good_amt = good_amt;
	}

	public void setPrelae_pay_clsf_cdnm(String prelae_pay_clsf_cdnm){
		this.prelae_pay_clsf_cdnm = prelae_pay_clsf_cdnm;
	}

	public void setFst_leas_no(String fst_leas_no){
		this.fst_leas_no = fst_leas_no;
	}

	public void setFst_leas_nm(String fst_leas_nm){
		this.fst_leas_nm = fst_leas_nm;
	}

	public void setLeas_hire_clsf_cdnm(String leas_hire_clsf_cdnm){
		this.leas_hire_clsf_cdnm = leas_hire_clsf_cdnm;
	}

	public void setDlco_cdnm(String dlco_cdnm){
		this.dlco_cdnm = dlco_cdnm;
	}

	public void setUse_dept_cdnm(String use_dept_cdnm){
		this.use_dept_cdnm = use_dept_cdnm;
	}

	public void setMedi_cdnm(String medi_cdnm){
		this.medi_cdnm = medi_cdnm;
	}

	public void setDtls_medi_cd(String dtls_medi_cd){
		this.dtls_medi_cd = dtls_medi_cd;
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

	public String getUsag(){
		return this.usag;
	}

	public String getLoca(){
		return this.loca;
	}

	public String getInt_calc_cdnm(){
		return this.int_calc_cdnm;
	}

	public String getGood_curcnm(){
		return this.good_curcnm;
	}

	public String getGood_amt(){
		return this.good_amt;
	}

	public String getPrelae_pay_clsf_cdnm(){
		return this.prelae_pay_clsf_cdnm;
	}

	public String getFst_leas_no(){
		return this.fst_leas_no;
	}

	public String getFst_leas_nm(){
		return this.fst_leas_nm;
	}

	public String getLeas_hire_clsf_cdnm(){
		return this.leas_hire_clsf_cdnm;
	}

	public String getDlco_cdnm(){
		return this.dlco_cdnm;
	}

	public String getUse_dept_cdnm(){
		return this.use_dept_cdnm;
	}

	public String getMedi_cdnm(){
		return this.medi_cdnm;
	}

	public String getDtls_medi_cd(){
		return this.dtls_medi_cd;
	}
}

/* 작성시간 : Fri Mar 27 15:44:14 KST 2009 */
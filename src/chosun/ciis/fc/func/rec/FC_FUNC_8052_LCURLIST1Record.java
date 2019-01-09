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


public class FC_FUNC_8052_LCURLIST1Record extends java.lang.Object implements java.io.Serializable{

	public String comp_dt1;
	public String mtry_dt1;
	public String won_amt;
	public String insr_nm;
	public String insr_amt;
	public String insr_rate;
	public String frex_cd;
	public String exrate;
	public String frcr_amt;
	public String won_amt1;
	public String comp_dt2;
	public String mtry_dt2;
	public String dlco_clsf_cd;
	public String dlco_cd;
	public String compnm;
	public String medi_cd;
	public String mcnm;
	public String dtls_medi_cd;
	public String use_dept_cd;
	public String buseonm;
	public String pymt_rmks;
	public String jpno;
	public String insr_stat_cdnm;
	public String pymt_dt;
	public String leas_nm;
	public String comp_dt;
	public String mtry_dt;
	public String pymt_slip_occr_dt;
	public String pymt_slip_clsf_cd;
	public String pymt_slip_seq;

	public FC_FUNC_8052_LCURLIST1Record(){}

	public void setComp_dt1(String comp_dt1){
		this.comp_dt1 = comp_dt1;
	}

	public void setMtry_dt1(String mtry_dt1){
		this.mtry_dt1 = mtry_dt1;
	}

	public void setWon_amt(String won_amt){
		this.won_amt = won_amt;
	}

	public void setInsr_nm(String insr_nm){
		this.insr_nm = insr_nm;
	}

	public void setInsr_amt(String insr_amt){
		this.insr_amt = insr_amt;
	}

	public void setInsr_rate(String insr_rate){
		this.insr_rate = insr_rate;
	}

	public void setFrex_cd(String frex_cd){
		this.frex_cd = frex_cd;
	}

	public void setExrate(String exrate){
		this.exrate = exrate;
	}

	public void setFrcr_amt(String frcr_amt){
		this.frcr_amt = frcr_amt;
	}

	public void setWon_amt1(String won_amt1){
		this.won_amt1 = won_amt1;
	}

	public void setComp_dt2(String comp_dt2){
		this.comp_dt2 = comp_dt2;
	}

	public void setMtry_dt2(String mtry_dt2){
		this.mtry_dt2 = mtry_dt2;
	}

	public void setDlco_clsf_cd(String dlco_clsf_cd){
		this.dlco_clsf_cd = dlco_clsf_cd;
	}

	public void setDlco_cd(String dlco_cd){
		this.dlco_cd = dlco_cd;
	}

	public void setCompnm(String compnm){
		this.compnm = compnm;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setMcnm(String mcnm){
		this.mcnm = mcnm;
	}

	public void setDtls_medi_cd(String dtls_medi_cd){
		this.dtls_medi_cd = dtls_medi_cd;
	}

	public void setUse_dept_cd(String use_dept_cd){
		this.use_dept_cd = use_dept_cd;
	}

	public void setBuseonm(String buseonm){
		this.buseonm = buseonm;
	}

	public void setPymt_rmks(String pymt_rmks){
		this.pymt_rmks = pymt_rmks;
	}

	public void setJpno(String jpno){
		this.jpno = jpno;
	}

	public void setInsr_stat_cdnm(String insr_stat_cdnm){
		this.insr_stat_cdnm = insr_stat_cdnm;
	}

	public void setPymt_dt(String pymt_dt){
		this.pymt_dt = pymt_dt;
	}

	public void setLeas_nm(String leas_nm){
		this.leas_nm = leas_nm;
	}

	public void setComp_dt(String comp_dt){
		this.comp_dt = comp_dt;
	}

	public void setMtry_dt(String mtry_dt){
		this.mtry_dt = mtry_dt;
	}

	public void setPymt_slip_occr_dt(String pymt_slip_occr_dt){
		this.pymt_slip_occr_dt = pymt_slip_occr_dt;
	}

	public void setPymt_slip_clsf_cd(String pymt_slip_clsf_cd){
		this.pymt_slip_clsf_cd = pymt_slip_clsf_cd;
	}

	public void setPymt_slip_seq(String pymt_slip_seq){
		this.pymt_slip_seq = pymt_slip_seq;
	}

	public String getComp_dt1(){
		return this.comp_dt1;
	}

	public String getMtry_dt1(){
		return this.mtry_dt1;
	}

	public String getWon_amt(){
		return this.won_amt;
	}

	public String getInsr_nm(){
		return this.insr_nm;
	}

	public String getInsr_amt(){
		return this.insr_amt;
	}

	public String getInsr_rate(){
		return this.insr_rate;
	}

	public String getFrex_cd(){
		return this.frex_cd;
	}

	public String getExrate(){
		return this.exrate;
	}

	public String getFrcr_amt(){
		return this.frcr_amt;
	}

	public String getWon_amt1(){
		return this.won_amt1;
	}

	public String getComp_dt2(){
		return this.comp_dt2;
	}

	public String getMtry_dt2(){
		return this.mtry_dt2;
	}

	public String getDlco_clsf_cd(){
		return this.dlco_clsf_cd;
	}

	public String getDlco_cd(){
		return this.dlco_cd;
	}

	public String getCompnm(){
		return this.compnm;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getMcnm(){
		return this.mcnm;
	}

	public String getDtls_medi_cd(){
		return this.dtls_medi_cd;
	}

	public String getUse_dept_cd(){
		return this.use_dept_cd;
	}

	public String getBuseonm(){
		return this.buseonm;
	}

	public String getPymt_rmks(){
		return this.pymt_rmks;
	}

	public String getJpno(){
		return this.jpno;
	}

	public String getInsr_stat_cdnm(){
		return this.insr_stat_cdnm;
	}

	public String getPymt_dt(){
		return this.pymt_dt;
	}

	public String getLeas_nm(){
		return this.leas_nm;
	}

	public String getComp_dt(){
		return this.comp_dt;
	}

	public String getMtry_dt(){
		return this.mtry_dt;
	}

	public String getPymt_slip_occr_dt(){
		return this.pymt_slip_occr_dt;
	}

	public String getPymt_slip_clsf_cd(){
		return this.pymt_slip_clsf_cd;
	}

	public String getPymt_slip_seq(){
		return this.pymt_slip_seq;
	}
}

/* 작성시간 : Fri Apr 10 20:18:51 KST 2009 */
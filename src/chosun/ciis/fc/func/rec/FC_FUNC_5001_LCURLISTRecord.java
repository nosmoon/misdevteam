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


public class FC_FUNC_5001_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String insr_nm;
	public String insr_amt;
	public String insr_rate;
	public String frex_cd;
	public String exrate;
	public String frcr_amt;
	public String won_amt;
	public String dlco_clsf_cd;
	public String dlco_cd;
	public String dlco_nm;
	public String mtry_dt;
	public String medi_cd;
	public String medi_nnm;
	public String dtls_medi_cd;
	public String use_dept_cd;
	public String use_dept_nm;
	public String pymt_rmks;
	public String slip_no;
	public String stat_nm;
	public String fisc_aprv_stat;

	public FC_FUNC_5001_LCURLISTRecord(){}

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

	public void setWon_amt(String won_amt){
		this.won_amt = won_amt;
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

	public void setMtry_dt(String mtry_dt){
		this.mtry_dt = mtry_dt;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setMedi_nnm(String medi_nnm){
		this.medi_nnm = medi_nnm;
	}

	public void setDtls_medi_cd(String dtls_medi_cd){
		this.dtls_medi_cd = dtls_medi_cd;
	}

	public void setUse_dept_cd(String use_dept_cd){
		this.use_dept_cd = use_dept_cd;
	}

	public void setUse_dept_nm(String use_dept_nm){
		this.use_dept_nm = use_dept_nm;
	}

	public void setPymt_rmks(String pymt_rmks){
		this.pymt_rmks = pymt_rmks;
	}

	public void setSlip_no(String slip_no){
		this.slip_no = slip_no;
	}

	public void setStat_nm(String stat_nm){
		this.stat_nm = stat_nm;
	}

	public void setFisc_aprv_stat(String fisc_aprv_stat){
		this.fisc_aprv_stat = fisc_aprv_stat;
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

	public String getWon_amt(){
		return this.won_amt;
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

	public String getMtry_dt(){
		return this.mtry_dt;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getMedi_nnm(){
		return this.medi_nnm;
	}

	public String getDtls_medi_cd(){
		return this.dtls_medi_cd;
	}

	public String getUse_dept_cd(){
		return this.use_dept_cd;
	}

	public String getUse_dept_nm(){
		return this.use_dept_nm;
	}

	public String getPymt_rmks(){
		return this.pymt_rmks;
	}

	public String getSlip_no(){
		return this.slip_no;
	}

	public String getStat_nm(){
		return this.stat_nm;
	}

	public String getFisc_aprv_stat(){
		return this.fisc_aprv_stat;
	}
}

/* 작성시간 : Tue Mar 31 17:51:11 KST 2009 */
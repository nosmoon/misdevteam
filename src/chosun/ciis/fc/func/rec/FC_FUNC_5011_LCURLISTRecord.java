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


public class FC_FUNC_5011_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cctr_dt;
	public String cctr_amt;
	public String cctr_rmks;
	public String nomach_adpay_bal;
	public String slip_no;
	public String cost_gain_stot;
	public String rcpay_amt_stot;
	public String bhbijanamt;
	public String bhshggbcdnm;
	public String insr_nm;
	public String bhwhncdnm;
	public String frcr_amt;
	public String won_amt;
	public String bhcompgbcdnm;
	public String dlco_cd;
	public String bhcompnm;
	public String mtry_dt;
	public String bhmcnm;
	public String dtls_medi_cd;
	public String bhusebuseocdnm;
	public String bhstcdnm;
	public String fisc_aprv_nm;
	public String cctr_slip_occr_dt;
	public String cctr_slip_clsf_cd;
	public String cctr_slip_seq;
	public String prelae_pay_clsf_cd;
	public String frex_cd;
	public String dlco_clsf_cd;
	public String medi_cd;
	public String fisc_aprv_stat;
	public String use_dept_cd;

	public FC_FUNC_5011_LCURLISTRecord(){}

	public void setCctr_dt(String cctr_dt){
		this.cctr_dt = cctr_dt;
	}

	public void setCctr_amt(String cctr_amt){
		this.cctr_amt = cctr_amt;
	}

	public void setCctr_rmks(String cctr_rmks){
		this.cctr_rmks = cctr_rmks;
	}

	public void setNomach_adpay_bal(String nomach_adpay_bal){
		this.nomach_adpay_bal = nomach_adpay_bal;
	}

	public void setSlip_no(String slip_no){
		this.slip_no = slip_no;
	}

	public void setCost_gain_stot(String cost_gain_stot){
		this.cost_gain_stot = cost_gain_stot;
	}

	public void setRcpay_amt_stot(String rcpay_amt_stot){
		this.rcpay_amt_stot = rcpay_amt_stot;
	}

	public void setBhbijanamt(String bhbijanamt){
		this.bhbijanamt = bhbijanamt;
	}

	public void setBhshggbcdnm(String bhshggbcdnm){
		this.bhshggbcdnm = bhshggbcdnm;
	}

	public void setInsr_nm(String insr_nm){
		this.insr_nm = insr_nm;
	}

	public void setBhwhncdnm(String bhwhncdnm){
		this.bhwhncdnm = bhwhncdnm;
	}

	public void setFrcr_amt(String frcr_amt){
		this.frcr_amt = frcr_amt;
	}

	public void setWon_amt(String won_amt){
		this.won_amt = won_amt;
	}

	public void setBhcompgbcdnm(String bhcompgbcdnm){
		this.bhcompgbcdnm = bhcompgbcdnm;
	}

	public void setDlco_cd(String dlco_cd){
		this.dlco_cd = dlco_cd;
	}

	public void setBhcompnm(String bhcompnm){
		this.bhcompnm = bhcompnm;
	}

	public void setMtry_dt(String mtry_dt){
		this.mtry_dt = mtry_dt;
	}

	public void setBhmcnm(String bhmcnm){
		this.bhmcnm = bhmcnm;
	}

	public void setDtls_medi_cd(String dtls_medi_cd){
		this.dtls_medi_cd = dtls_medi_cd;
	}

	public void setBhusebuseocdnm(String bhusebuseocdnm){
		this.bhusebuseocdnm = bhusebuseocdnm;
	}

	public void setBhstcdnm(String bhstcdnm){
		this.bhstcdnm = bhstcdnm;
	}

	public void setFisc_aprv_nm(String fisc_aprv_nm){
		this.fisc_aprv_nm = fisc_aprv_nm;
	}

	public void setCctr_slip_occr_dt(String cctr_slip_occr_dt){
		this.cctr_slip_occr_dt = cctr_slip_occr_dt;
	}

	public void setCctr_slip_clsf_cd(String cctr_slip_clsf_cd){
		this.cctr_slip_clsf_cd = cctr_slip_clsf_cd;
	}

	public void setCctr_slip_seq(String cctr_slip_seq){
		this.cctr_slip_seq = cctr_slip_seq;
	}

	public void setPrelae_pay_clsf_cd(String prelae_pay_clsf_cd){
		this.prelae_pay_clsf_cd = prelae_pay_clsf_cd;
	}

	public void setFrex_cd(String frex_cd){
		this.frex_cd = frex_cd;
	}

	public void setDlco_clsf_cd(String dlco_clsf_cd){
		this.dlco_clsf_cd = dlco_clsf_cd;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setFisc_aprv_stat(String fisc_aprv_stat){
		this.fisc_aprv_stat = fisc_aprv_stat;
	}

	public void setUse_dept_cd(String use_dept_cd){
		this.use_dept_cd = use_dept_cd;
	}

	public String getCctr_dt(){
		return this.cctr_dt;
	}

	public String getCctr_amt(){
		return this.cctr_amt;
	}

	public String getCctr_rmks(){
		return this.cctr_rmks;
	}

	public String getNomach_adpay_bal(){
		return this.nomach_adpay_bal;
	}

	public String getSlip_no(){
		return this.slip_no;
	}

	public String getCost_gain_stot(){
		return this.cost_gain_stot;
	}

	public String getRcpay_amt_stot(){
		return this.rcpay_amt_stot;
	}

	public String getBhbijanamt(){
		return this.bhbijanamt;
	}

	public String getBhshggbcdnm(){
		return this.bhshggbcdnm;
	}

	public String getInsr_nm(){
		return this.insr_nm;
	}

	public String getBhwhncdnm(){
		return this.bhwhncdnm;
	}

	public String getFrcr_amt(){
		return this.frcr_amt;
	}

	public String getWon_amt(){
		return this.won_amt;
	}

	public String getBhcompgbcdnm(){
		return this.bhcompgbcdnm;
	}

	public String getDlco_cd(){
		return this.dlco_cd;
	}

	public String getBhcompnm(){
		return this.bhcompnm;
	}

	public String getMtry_dt(){
		return this.mtry_dt;
	}

	public String getBhmcnm(){
		return this.bhmcnm;
	}

	public String getDtls_medi_cd(){
		return this.dtls_medi_cd;
	}

	public String getBhusebuseocdnm(){
		return this.bhusebuseocdnm;
	}

	public String getBhstcdnm(){
		return this.bhstcdnm;
	}

	public String getFisc_aprv_nm(){
		return this.fisc_aprv_nm;
	}

	public String getCctr_slip_occr_dt(){
		return this.cctr_slip_occr_dt;
	}

	public String getCctr_slip_clsf_cd(){
		return this.cctr_slip_clsf_cd;
	}

	public String getCctr_slip_seq(){
		return this.cctr_slip_seq;
	}

	public String getPrelae_pay_clsf_cd(){
		return this.prelae_pay_clsf_cd;
	}

	public String getFrex_cd(){
		return this.frex_cd;
	}

	public String getDlco_clsf_cd(){
		return this.dlco_clsf_cd;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getFisc_aprv_stat(){
		return this.fisc_aprv_stat;
	}

	public String getUse_dept_cd(){
		return this.use_dept_cd;
	}
}

/* 작성시간 : Tue Mar 31 19:57:10 KST 2009 */
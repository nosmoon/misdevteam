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


public class FC_FUNC_6531_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cost_gain_stot;
	public String rcpay_amt_stot;
	public String ijajanamt;
	public String prelae_pay_clsf_cd;
	public String deps_isav_nm;
	public String tot_pymt_amt;
	public String comp_dt;
	public String mtry_dt;
	public String dlco_clsf_cd;
	public String dlco_cd;
	public String dlco_nm;
	public String dlco_clsf_nm;
	public String rmks;
	public String jpno;
	public String slip_occr_dt;
	public String slip_clsf_cd;
	public String slip_seq;
	public String deps_isav_stat_cdnm;
	public String deps_isav_stat_cd;
	public String hy_cctr_dt;
	public String hy_impt_amt;
	public String hy_corp_tax_amt;
	public String hy_patr_budg_cd;
	public String hy_deps_clsf_cd;
	public String hy_rmks;
	public String hy_yejpno;
	public String hy_tot_int_amt;
	public String hy_unrcp_precpt_bal;
	public String int_rate;

	public FC_FUNC_6531_LCURLISTRecord(){}

	public void setCost_gain_stot(String cost_gain_stot){
		this.cost_gain_stot = cost_gain_stot;
	}

	public void setRcpay_amt_stot(String rcpay_amt_stot){
		this.rcpay_amt_stot = rcpay_amt_stot;
	}

	public void setIjajanamt(String ijajanamt){
		this.ijajanamt = ijajanamt;
	}

	public void setPrelae_pay_clsf_cd(String prelae_pay_clsf_cd){
		this.prelae_pay_clsf_cd = prelae_pay_clsf_cd;
	}

	public void setDeps_isav_nm(String deps_isav_nm){
		this.deps_isav_nm = deps_isav_nm;
	}

	public void setTot_pymt_amt(String tot_pymt_amt){
		this.tot_pymt_amt = tot_pymt_amt;
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

	public void setDlco_clsf_nm(String dlco_clsf_nm){
		this.dlco_clsf_nm = dlco_clsf_nm;
	}

	public void setRmks(String rmks){
		this.rmks = rmks;
	}

	public void setJpno(String jpno){
		this.jpno = jpno;
	}

	public void setSlip_occr_dt(String slip_occr_dt){
		this.slip_occr_dt = slip_occr_dt;
	}

	public void setSlip_clsf_cd(String slip_clsf_cd){
		this.slip_clsf_cd = slip_clsf_cd;
	}

	public void setSlip_seq(String slip_seq){
		this.slip_seq = slip_seq;
	}

	public void setDeps_isav_stat_cdnm(String deps_isav_stat_cdnm){
		this.deps_isav_stat_cdnm = deps_isav_stat_cdnm;
	}

	public void setDeps_isav_stat_cd(String deps_isav_stat_cd){
		this.deps_isav_stat_cd = deps_isav_stat_cd;
	}

	public void setHy_cctr_dt(String hy_cctr_dt){
		this.hy_cctr_dt = hy_cctr_dt;
	}

	public void setHy_impt_amt(String hy_impt_amt){
		this.hy_impt_amt = hy_impt_amt;
	}

	public void setHy_corp_tax_amt(String hy_corp_tax_amt){
		this.hy_corp_tax_amt = hy_corp_tax_amt;
	}

	public void setHy_patr_budg_cd(String hy_patr_budg_cd){
		this.hy_patr_budg_cd = hy_patr_budg_cd;
	}

	public void setHy_deps_clsf_cd(String hy_deps_clsf_cd){
		this.hy_deps_clsf_cd = hy_deps_clsf_cd;
	}

	public void setHy_rmks(String hy_rmks){
		this.hy_rmks = hy_rmks;
	}

	public void setHy_yejpno(String hy_yejpno){
		this.hy_yejpno = hy_yejpno;
	}

	public void setHy_tot_int_amt(String hy_tot_int_amt){
		this.hy_tot_int_amt = hy_tot_int_amt;
	}

	public void setHy_unrcp_precpt_bal(String hy_unrcp_precpt_bal){
		this.hy_unrcp_precpt_bal = hy_unrcp_precpt_bal;
	}

	public void setInt_rate(String int_rate){
		this.int_rate = int_rate;
	}

	public String getCost_gain_stot(){
		return this.cost_gain_stot;
	}

	public String getRcpay_amt_stot(){
		return this.rcpay_amt_stot;
	}

	public String getIjajanamt(){
		return this.ijajanamt;
	}

	public String getPrelae_pay_clsf_cd(){
		return this.prelae_pay_clsf_cd;
	}

	public String getDeps_isav_nm(){
		return this.deps_isav_nm;
	}

	public String getTot_pymt_amt(){
		return this.tot_pymt_amt;
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

	public String getDlco_clsf_nm(){
		return this.dlco_clsf_nm;
	}

	public String getRmks(){
		return this.rmks;
	}

	public String getJpno(){
		return this.jpno;
	}

	public String getSlip_occr_dt(){
		return this.slip_occr_dt;
	}

	public String getSlip_clsf_cd(){
		return this.slip_clsf_cd;
	}

	public String getSlip_seq(){
		return this.slip_seq;
	}

	public String getDeps_isav_stat_cdnm(){
		return this.deps_isav_stat_cdnm;
	}

	public String getDeps_isav_stat_cd(){
		return this.deps_isav_stat_cd;
	}

	public String getHy_cctr_dt(){
		return this.hy_cctr_dt;
	}

	public String getHy_impt_amt(){
		return this.hy_impt_amt;
	}

	public String getHy_corp_tax_amt(){
		return this.hy_corp_tax_amt;
	}

	public String getHy_patr_budg_cd(){
		return this.hy_patr_budg_cd;
	}

	public String getHy_deps_clsf_cd(){
		return this.hy_deps_clsf_cd;
	}

	public String getHy_rmks(){
		return this.hy_rmks;
	}

	public String getHy_yejpno(){
		return this.hy_yejpno;
	}

	public String getHy_tot_int_amt(){
		return this.hy_tot_int_amt;
	}

	public String getHy_unrcp_precpt_bal(){
		return this.hy_unrcp_precpt_bal;
	}

	public String getInt_rate(){
		return this.int_rate;
	}
}

/* 작성시간 : Wed Mar 18 14:10:03 KST 2009 */
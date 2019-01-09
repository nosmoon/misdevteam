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


public class FC_FUNC_6091_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cost_gain_stot;
	public String rcpay_amt_stot;
	public String ijajanamt;
	public String prelae_pay_clsf_cd;
	public String deps_isav_nm;
	public String cntr_amt;
	public String comp_dt;
	public String mtry_dt;
	public String dlco_clsf_cd;
	public String dlco_cd;
	public String dlco_nm;
	public String compnm;
	public String pymt_mm;
	public String pymt_amt;
	public String tot_pymt_amt;
	public String deps_isav_stat_cd;
	public String cctr_dt;
	public String impt_amt;
	public String corp_tax_amt;
	public String patr_budg_cd;
	public String deps_clsf_cd;
	public String rmks;
	public String yejpno;
	public String tot_int_amt;
	public String unrcp_precpt_bal;

	public FC_FUNC_6091_LCURLISTRecord(){}

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

	public void setCntr_amt(String cntr_amt){
		this.cntr_amt = cntr_amt;
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

	public void setCompnm(String compnm){
		this.compnm = compnm;
	}

	public void setPymt_mm(String pymt_mm){
		this.pymt_mm = pymt_mm;
	}

	public void setPymt_amt(String pymt_amt){
		this.pymt_amt = pymt_amt;
	}

	public void setTot_pymt_amt(String tot_pymt_amt){
		this.tot_pymt_amt = tot_pymt_amt;
	}

	public void setDeps_isav_stat_cd(String deps_isav_stat_cd){
		this.deps_isav_stat_cd = deps_isav_stat_cd;
	}

	public void setCctr_dt(String cctr_dt){
		this.cctr_dt = cctr_dt;
	}

	public void setImpt_amt(String impt_amt){
		this.impt_amt = impt_amt;
	}

	public void setCorp_tax_amt(String corp_tax_amt){
		this.corp_tax_amt = corp_tax_amt;
	}

	public void setPatr_budg_cd(String patr_budg_cd){
		this.patr_budg_cd = patr_budg_cd;
	}

	public void setDeps_clsf_cd(String deps_clsf_cd){
		this.deps_clsf_cd = deps_clsf_cd;
	}

	public void setRmks(String rmks){
		this.rmks = rmks;
	}

	public void setYejpno(String yejpno){
		this.yejpno = yejpno;
	}

	public void setTot_int_amt(String tot_int_amt){
		this.tot_int_amt = tot_int_amt;
	}

	public void setUnrcp_precpt_bal(String unrcp_precpt_bal){
		this.unrcp_precpt_bal = unrcp_precpt_bal;
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

	public String getCntr_amt(){
		return this.cntr_amt;
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

	public String getCompnm(){
		return this.compnm;
	}

	public String getPymt_mm(){
		return this.pymt_mm;
	}

	public String getPymt_amt(){
		return this.pymt_amt;
	}

	public String getTot_pymt_amt(){
		return this.tot_pymt_amt;
	}

	public String getDeps_isav_stat_cd(){
		return this.deps_isav_stat_cd;
	}

	public String getCctr_dt(){
		return this.cctr_dt;
	}

	public String getImpt_amt(){
		return this.impt_amt;
	}

	public String getCorp_tax_amt(){
		return this.corp_tax_amt;
	}

	public String getPatr_budg_cd(){
		return this.patr_budg_cd;
	}

	public String getDeps_clsf_cd(){
		return this.deps_clsf_cd;
	}

	public String getRmks(){
		return this.rmks;
	}

	public String getYejpno(){
		return this.yejpno;
	}

	public String getTot_int_amt(){
		return this.tot_int_amt;
	}

	public String getUnrcp_precpt_bal(){
		return this.unrcp_precpt_bal;
	}
}

/* 작성시간 : Mon Mar 09 14:11:50 KST 2009 */
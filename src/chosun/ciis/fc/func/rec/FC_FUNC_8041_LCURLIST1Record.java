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


public class FC_FUNC_8041_LCURLIST1Record extends java.lang.Object implements java.io.Serializable{

	public String leas_nm;
	public String dlco_clsf_cd;
	public String dlco_cd;
	public String leas_stat_cd;
	public String prelae_pay_clsf_cd;
	public String cost_gain_stot;
	public String rcpay_amt_stot;
	public String frcr_amt;
	public String pay_plan_tms;
	public String libo_yn;
	public String pch_amt1;
	public String pch_amt2;
	public String pch_count;
	public String pch_compgbnm;
	public String pch_compnm;
	public String pch_stnm;
	public String shggbnm;
	public String libo_int_rate;
	public String dedu_int_rate;
	public String int_calc_cd;
	public String frex_cd;
	public String frcr_cd_amt;
	public String leas_hire_clsf_cd;
	public String imchagbnm;

	public FC_FUNC_8041_LCURLIST1Record(){}

	public void setLeas_nm(String leas_nm){
		this.leas_nm = leas_nm;
	}

	public void setDlco_clsf_cd(String dlco_clsf_cd){
		this.dlco_clsf_cd = dlco_clsf_cd;
	}

	public void setDlco_cd(String dlco_cd){
		this.dlco_cd = dlco_cd;
	}

	public void setLeas_stat_cd(String leas_stat_cd){
		this.leas_stat_cd = leas_stat_cd;
	}

	public void setPrelae_pay_clsf_cd(String prelae_pay_clsf_cd){
		this.prelae_pay_clsf_cd = prelae_pay_clsf_cd;
	}

	public void setCost_gain_stot(String cost_gain_stot){
		this.cost_gain_stot = cost_gain_stot;
	}

	public void setRcpay_amt_stot(String rcpay_amt_stot){
		this.rcpay_amt_stot = rcpay_amt_stot;
	}

	public void setFrcr_amt(String frcr_amt){
		this.frcr_amt = frcr_amt;
	}

	public void setPay_plan_tms(String pay_plan_tms){
		this.pay_plan_tms = pay_plan_tms;
	}

	public void setLibo_yn(String libo_yn){
		this.libo_yn = libo_yn;
	}

	public void setPch_amt1(String pch_amt1){
		this.pch_amt1 = pch_amt1;
	}

	public void setPch_amt2(String pch_amt2){
		this.pch_amt2 = pch_amt2;
	}

	public void setPch_count(String pch_count){
		this.pch_count = pch_count;
	}

	public void setPch_compgbnm(String pch_compgbnm){
		this.pch_compgbnm = pch_compgbnm;
	}

	public void setPch_compnm(String pch_compnm){
		this.pch_compnm = pch_compnm;
	}

	public void setPch_stnm(String pch_stnm){
		this.pch_stnm = pch_stnm;
	}

	public void setShggbnm(String shggbnm){
		this.shggbnm = shggbnm;
	}

	public void setLibo_int_rate(String libo_int_rate){
		this.libo_int_rate = libo_int_rate;
	}

	public void setDedu_int_rate(String dedu_int_rate){
		this.dedu_int_rate = dedu_int_rate;
	}

	public void setInt_calc_cd(String int_calc_cd){
		this.int_calc_cd = int_calc_cd;
	}

	public void setFrex_cd(String frex_cd){
		this.frex_cd = frex_cd;
	}

	public void setFrcr_cd_amt(String frcr_cd_amt){
		this.frcr_cd_amt = frcr_cd_amt;
	}

	public void setLeas_hire_clsf_cd(String leas_hire_clsf_cd){
		this.leas_hire_clsf_cd = leas_hire_clsf_cd;
	}

	public void setImchagbnm(String imchagbnm){
		this.imchagbnm = imchagbnm;
	}

	public String getLeas_nm(){
		return this.leas_nm;
	}

	public String getDlco_clsf_cd(){
		return this.dlco_clsf_cd;
	}

	public String getDlco_cd(){
		return this.dlco_cd;
	}

	public String getLeas_stat_cd(){
		return this.leas_stat_cd;
	}

	public String getPrelae_pay_clsf_cd(){
		return this.prelae_pay_clsf_cd;
	}

	public String getCost_gain_stot(){
		return this.cost_gain_stot;
	}

	public String getRcpay_amt_stot(){
		return this.rcpay_amt_stot;
	}

	public String getFrcr_amt(){
		return this.frcr_amt;
	}

	public String getPay_plan_tms(){
		return this.pay_plan_tms;
	}

	public String getLibo_yn(){
		return this.libo_yn;
	}

	public String getPch_amt1(){
		return this.pch_amt1;
	}

	public String getPch_amt2(){
		return this.pch_amt2;
	}

	public String getPch_count(){
		return this.pch_count;
	}

	public String getPch_compgbnm(){
		return this.pch_compgbnm;
	}

	public String getPch_compnm(){
		return this.pch_compnm;
	}

	public String getPch_stnm(){
		return this.pch_stnm;
	}

	public String getShggbnm(){
		return this.shggbnm;
	}

	public String getLibo_int_rate(){
		return this.libo_int_rate;
	}

	public String getDedu_int_rate(){
		return this.dedu_int_rate;
	}

	public String getInt_calc_cd(){
		return this.int_calc_cd;
	}

	public String getFrex_cd(){
		return this.frex_cd;
	}

	public String getFrcr_cd_amt(){
		return this.frcr_cd_amt;
	}

	public String getLeas_hire_clsf_cd(){
		return this.leas_hire_clsf_cd;
	}

	public String getImchagbnm(){
		return this.imchagbnm;
	}
}

/* 작성시간 : Thu Apr 09 16:48:11 KST 2009 */
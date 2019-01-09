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


public class FC_FUNC_4023_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String recp_dt;
	public String bgn_no;
	public String comp_dt;
	public String mtry_dt;
	public String now_note_stat_cd;
	public String now_note_stat_dt;
	public String note_amt;
	public String dlco_clsf_cd;
	public String dlco_cd;
	public String bank_cd;
	public String slip_occr_dt;
	public String slip_clsf_cd;
	public String slip_seq;
	public String slip_no;
	public String slip_sub_seq;
	public String slip_arow_no;
	public String patr_budg_cd;
	public String rmks1;
	public String rmks2;
	public String setoff_yn;
	public String curacct_clsf_cd;
	public String issu_clsf_cd;
	public String incm_tax;
	public String res_tax;
	public String incmg_dt_tm;
	public String incmg_pers;
	public String incmg_pers_ipadd;
	public String eestnm;
	public String compgbnm;
	public String compnm;
	public String banknm;
	public String ysnm;
	public String djgbnm;
	public String bhgbnm;

	public FC_FUNC_4023_LCURLISTRecord(){}

	public void setRecp_dt(String recp_dt){
		this.recp_dt = recp_dt;
	}

	public void setBgn_no(String bgn_no){
		this.bgn_no = bgn_no;
	}

	public void setComp_dt(String comp_dt){
		this.comp_dt = comp_dt;
	}

	public void setMtry_dt(String mtry_dt){
		this.mtry_dt = mtry_dt;
	}

	public void setNow_note_stat_cd(String now_note_stat_cd){
		this.now_note_stat_cd = now_note_stat_cd;
	}

	public void setNow_note_stat_dt(String now_note_stat_dt){
		this.now_note_stat_dt = now_note_stat_dt;
	}

	public void setNote_amt(String note_amt){
		this.note_amt = note_amt;
	}

	public void setDlco_clsf_cd(String dlco_clsf_cd){
		this.dlco_clsf_cd = dlco_clsf_cd;
	}

	public void setDlco_cd(String dlco_cd){
		this.dlco_cd = dlco_cd;
	}

	public void setBank_cd(String bank_cd){
		this.bank_cd = bank_cd;
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

	public void setSlip_no(String slip_no){
		this.slip_no = slip_no;
	}

	public void setSlip_sub_seq(String slip_sub_seq){
		this.slip_sub_seq = slip_sub_seq;
	}

	public void setSlip_arow_no(String slip_arow_no){
		this.slip_arow_no = slip_arow_no;
	}

	public void setPatr_budg_cd(String patr_budg_cd){
		this.patr_budg_cd = patr_budg_cd;
	}

	public void setRmks1(String rmks1){
		this.rmks1 = rmks1;
	}

	public void setRmks2(String rmks2){
		this.rmks2 = rmks2;
	}

	public void setSetoff_yn(String setoff_yn){
		this.setoff_yn = setoff_yn;
	}

	public void setCuracct_clsf_cd(String curacct_clsf_cd){
		this.curacct_clsf_cd = curacct_clsf_cd;
	}

	public void setIssu_clsf_cd(String issu_clsf_cd){
		this.issu_clsf_cd = issu_clsf_cd;
	}

	public void setIncm_tax(String incm_tax){
		this.incm_tax = incm_tax;
	}

	public void setRes_tax(String res_tax){
		this.res_tax = res_tax;
	}

	public void setIncmg_dt_tm(String incmg_dt_tm){
		this.incmg_dt_tm = incmg_dt_tm;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setIncmg_pers_ipadd(String incmg_pers_ipadd){
		this.incmg_pers_ipadd = incmg_pers_ipadd;
	}

	public void setEestnm(String eestnm){
		this.eestnm = eestnm;
	}

	public void setCompgbnm(String compgbnm){
		this.compgbnm = compgbnm;
	}

	public void setCompnm(String compnm){
		this.compnm = compnm;
	}

	public void setBanknm(String banknm){
		this.banknm = banknm;
	}

	public void setYsnm(String ysnm){
		this.ysnm = ysnm;
	}

	public void setDjgbnm(String djgbnm){
		this.djgbnm = djgbnm;
	}

	public void setBhgbnm(String bhgbnm){
		this.bhgbnm = bhgbnm;
	}

	public String getRecp_dt(){
		return this.recp_dt;
	}

	public String getBgn_no(){
		return this.bgn_no;
	}

	public String getComp_dt(){
		return this.comp_dt;
	}

	public String getMtry_dt(){
		return this.mtry_dt;
	}

	public String getNow_note_stat_cd(){
		return this.now_note_stat_cd;
	}

	public String getNow_note_stat_dt(){
		return this.now_note_stat_dt;
	}

	public String getNote_amt(){
		return this.note_amt;
	}

	public String getDlco_clsf_cd(){
		return this.dlco_clsf_cd;
	}

	public String getDlco_cd(){
		return this.dlco_cd;
	}

	public String getBank_cd(){
		return this.bank_cd;
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

	public String getSlip_no(){
		return this.slip_no;
	}

	public String getSlip_sub_seq(){
		return this.slip_sub_seq;
	}

	public String getSlip_arow_no(){
		return this.slip_arow_no;
	}

	public String getPatr_budg_cd(){
		return this.patr_budg_cd;
	}

	public String getRmks1(){
		return this.rmks1;
	}

	public String getRmks2(){
		return this.rmks2;
	}

	public String getSetoff_yn(){
		return this.setoff_yn;
	}

	public String getCuracct_clsf_cd(){
		return this.curacct_clsf_cd;
	}

	public String getIssu_clsf_cd(){
		return this.issu_clsf_cd;
	}

	public String getIncm_tax(){
		return this.incm_tax;
	}

	public String getRes_tax(){
		return this.res_tax;
	}

	public String getIncmg_dt_tm(){
		return this.incmg_dt_tm;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getIncmg_pers_ipadd(){
		return this.incmg_pers_ipadd;
	}

	public String getEestnm(){
		return this.eestnm;
	}

	public String getCompgbnm(){
		return this.compgbnm;
	}

	public String getCompnm(){
		return this.compnm;
	}

	public String getBanknm(){
		return this.banknm;
	}

	public String getYsnm(){
		return this.ysnm;
	}

	public String getDjgbnm(){
		return this.djgbnm;
	}

	public String getBhgbnm(){
		return this.bhgbnm;
	}
}

/* 작성시간 : Fri Mar 06 17:09:49 KST 2009 */
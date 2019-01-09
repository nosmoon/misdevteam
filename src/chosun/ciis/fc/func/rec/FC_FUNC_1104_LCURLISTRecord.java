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


public class FC_FUNC_1104_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String bank_cd;
	public String note_no;
	public String note_seq;
	public String slip_clsf_cd;
	public String mtry_dt;
	public String note_clsf_cd;
	public String note_amt;
	public String issu_pers_nm;
	public String dlco_clsf_cd;
	public String dlco_cd;
	public String now_note_stat_cd;
	public String jpgbnm;
	public String eegbnm;
	public String compgbnm;
	public String compnm;
	public String eestnm;
	public String dlco_clsf_cd2;
	public String dlco_cd2;
	public String patr_budg_cd;
	public String deps_clsf_cd;
	public String deps_dt;
	public String dhon_resn_cd;
	public String dhon_occr_dt;
	public String rmks1;
	public String slip_occr_dt;
	public String slip_clsf_cd2;
	public String slip_seq;
	public String slip_no;
	public String escompnm;
	public String frex_cd;
	public String exrate;
	public String frex_amt;

	public FC_FUNC_1104_LCURLISTRecord(){}

	public void setBank_cd(String bank_cd){
		this.bank_cd = bank_cd;
	}

	public void setNote_no(String note_no){
		this.note_no = note_no;
	}

	public void setNote_seq(String note_seq){
		this.note_seq = note_seq;
	}

	public void setSlip_clsf_cd(String slip_clsf_cd){
		this.slip_clsf_cd = slip_clsf_cd;
	}

	public void setMtry_dt(String mtry_dt){
		this.mtry_dt = mtry_dt;
	}

	public void setNote_clsf_cd(String note_clsf_cd){
		this.note_clsf_cd = note_clsf_cd;
	}

	public void setNote_amt(String note_amt){
		this.note_amt = note_amt;
	}

	public void setIssu_pers_nm(String issu_pers_nm){
		this.issu_pers_nm = issu_pers_nm;
	}

	public void setDlco_clsf_cd(String dlco_clsf_cd){
		this.dlco_clsf_cd = dlco_clsf_cd;
	}

	public void setDlco_cd(String dlco_cd){
		this.dlco_cd = dlco_cd;
	}

	public void setNow_note_stat_cd(String now_note_stat_cd){
		this.now_note_stat_cd = now_note_stat_cd;
	}

	public void setJpgbnm(String jpgbnm){
		this.jpgbnm = jpgbnm;
	}

	public void setEegbnm(String eegbnm){
		this.eegbnm = eegbnm;
	}

	public void setCompgbnm(String compgbnm){
		this.compgbnm = compgbnm;
	}

	public void setCompnm(String compnm){
		this.compnm = compnm;
	}

	public void setEestnm(String eestnm){
		this.eestnm = eestnm;
	}

	public void setDlco_clsf_cd2(String dlco_clsf_cd2){
		this.dlco_clsf_cd2 = dlco_clsf_cd2;
	}

	public void setDlco_cd2(String dlco_cd2){
		this.dlco_cd2 = dlco_cd2;
	}

	public void setPatr_budg_cd(String patr_budg_cd){
		this.patr_budg_cd = patr_budg_cd;
	}

	public void setDeps_clsf_cd(String deps_clsf_cd){
		this.deps_clsf_cd = deps_clsf_cd;
	}

	public void setDeps_dt(String deps_dt){
		this.deps_dt = deps_dt;
	}

	public void setDhon_resn_cd(String dhon_resn_cd){
		this.dhon_resn_cd = dhon_resn_cd;
	}

	public void setDhon_occr_dt(String dhon_occr_dt){
		this.dhon_occr_dt = dhon_occr_dt;
	}

	public void setRmks1(String rmks1){
		this.rmks1 = rmks1;
	}

	public void setSlip_occr_dt(String slip_occr_dt){
		this.slip_occr_dt = slip_occr_dt;
	}

	public void setSlip_clsf_cd2(String slip_clsf_cd2){
		this.slip_clsf_cd2 = slip_clsf_cd2;
	}

	public void setSlip_seq(String slip_seq){
		this.slip_seq = slip_seq;
	}

	public void setSlip_no(String slip_no){
		this.slip_no = slip_no;
	}

	public void setEscompnm(String escompnm){
		this.escompnm = escompnm;
	}

	public void setFrex_cd(String frex_cd){
		this.frex_cd = frex_cd;
	}

	public void setExrate(String exrate){
		this.exrate = exrate;
	}

	public void setFrex_amt(String frex_amt){
		this.frex_amt = frex_amt;
	}

	public String getBank_cd(){
		return this.bank_cd;
	}

	public String getNote_no(){
		return this.note_no;
	}

	public String getNote_seq(){
		return this.note_seq;
	}

	public String getSlip_clsf_cd(){
		return this.slip_clsf_cd;
	}

	public String getMtry_dt(){
		return this.mtry_dt;
	}

	public String getNote_clsf_cd(){
		return this.note_clsf_cd;
	}

	public String getNote_amt(){
		return this.note_amt;
	}

	public String getIssu_pers_nm(){
		return this.issu_pers_nm;
	}

	public String getDlco_clsf_cd(){
		return this.dlco_clsf_cd;
	}

	public String getDlco_cd(){
		return this.dlco_cd;
	}

	public String getNow_note_stat_cd(){
		return this.now_note_stat_cd;
	}

	public String getJpgbnm(){
		return this.jpgbnm;
	}

	public String getEegbnm(){
		return this.eegbnm;
	}

	public String getCompgbnm(){
		return this.compgbnm;
	}

	public String getCompnm(){
		return this.compnm;
	}

	public String getEestnm(){
		return this.eestnm;
	}

	public String getDlco_clsf_cd2(){
		return this.dlco_clsf_cd2;
	}

	public String getDlco_cd2(){
		return this.dlco_cd2;
	}

	public String getPatr_budg_cd(){
		return this.patr_budg_cd;
	}

	public String getDeps_clsf_cd(){
		return this.deps_clsf_cd;
	}

	public String getDeps_dt(){
		return this.deps_dt;
	}

	public String getDhon_resn_cd(){
		return this.dhon_resn_cd;
	}

	public String getDhon_occr_dt(){
		return this.dhon_occr_dt;
	}

	public String getRmks1(){
		return this.rmks1;
	}

	public String getSlip_occr_dt(){
		return this.slip_occr_dt;
	}

	public String getSlip_clsf_cd2(){
		return this.slip_clsf_cd2;
	}

	public String getSlip_seq(){
		return this.slip_seq;
	}

	public String getSlip_no(){
		return this.slip_no;
	}

	public String getEscompnm(){
		return this.escompnm;
	}

	public String getFrex_cd(){
		return this.frex_cd;
	}

	public String getExrate(){
		return this.exrate;
	}

	public String getFrex_amt(){
		return this.frex_amt;
	}
}

/* 작성시간 : Tue Mar 10 11:01:44 KST 2009 */
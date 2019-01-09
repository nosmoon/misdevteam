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


public class FC_FUNC_1001_LCUR_NOTE_LISTRecord extends java.lang.Object implements java.io.Serializable{

	public String bank_cd;
	public String note_no;
	public String note_seq;
	public String rcpm_dt;
	public String rcpm_slip_clsf_cd;
	public String rcpm_seq;
	public String rcpm_sub_seq;
	public String note_clsf_cd;
	public String comp_dt;
	public String mtry_dt;
	public String note_amt;
	public String pay_plac_cd;
	public String note_clehous_cd;
	public String issu_cmpy_clsf_cd;
	public String issu_pers_nm;
	public String dlco_clsf_cd;
	public String dlco_cd;
	public String slip_occr_dt;
	public String slip_clsf_cd;
	public String slip_seq;
	public String slip_no;
	public String slip_sub_seq;
	public String slip_arow_no;
	public String now_note_stat_cd;
	public String now_note_stat_dt;
	public String fisc_aprv_stat;
	public String rmks1;
	public String rmks2;
	public String fisc_dt;
	public String chg_dt_tm;
	public String chg_pers;
	public String incmg_pers_ipadd;
	public String bank_nm;
	public String dlco_nm;
	public String sale_dscn_amt;
	public String note_clsf_cd2;

	public FC_FUNC_1001_LCUR_NOTE_LISTRecord(){}

	public void setBank_cd(String bank_cd){
		this.bank_cd = bank_cd;
	}

	public void setNote_no(String note_no){
		this.note_no = note_no;
	}

	public void setNote_seq(String note_seq){
		this.note_seq = note_seq;
	}

	public void setRcpm_dt(String rcpm_dt){
		this.rcpm_dt = rcpm_dt;
	}

	public void setRcpm_slip_clsf_cd(String rcpm_slip_clsf_cd){
		this.rcpm_slip_clsf_cd = rcpm_slip_clsf_cd;
	}

	public void setRcpm_seq(String rcpm_seq){
		this.rcpm_seq = rcpm_seq;
	}

	public void setRcpm_sub_seq(String rcpm_sub_seq){
		this.rcpm_sub_seq = rcpm_sub_seq;
	}

	public void setNote_clsf_cd(String note_clsf_cd){
		this.note_clsf_cd = note_clsf_cd;
	}

	public void setComp_dt(String comp_dt){
		this.comp_dt = comp_dt;
	}

	public void setMtry_dt(String mtry_dt){
		this.mtry_dt = mtry_dt;
	}

	public void setNote_amt(String note_amt){
		this.note_amt = note_amt;
	}

	public void setPay_plac_cd(String pay_plac_cd){
		this.pay_plac_cd = pay_plac_cd;
	}

	public void setNote_clehous_cd(String note_clehous_cd){
		this.note_clehous_cd = note_clehous_cd;
	}

	public void setIssu_cmpy_clsf_cd(String issu_cmpy_clsf_cd){
		this.issu_cmpy_clsf_cd = issu_cmpy_clsf_cd;
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

	public void setNow_note_stat_cd(String now_note_stat_cd){
		this.now_note_stat_cd = now_note_stat_cd;
	}

	public void setNow_note_stat_dt(String now_note_stat_dt){
		this.now_note_stat_dt = now_note_stat_dt;
	}

	public void setFisc_aprv_stat(String fisc_aprv_stat){
		this.fisc_aprv_stat = fisc_aprv_stat;
	}

	public void setRmks1(String rmks1){
		this.rmks1 = rmks1;
	}

	public void setRmks2(String rmks2){
		this.rmks2 = rmks2;
	}

	public void setFisc_dt(String fisc_dt){
		this.fisc_dt = fisc_dt;
	}

	public void setChg_dt_tm(String chg_dt_tm){
		this.chg_dt_tm = chg_dt_tm;
	}

	public void setChg_pers(String chg_pers){
		this.chg_pers = chg_pers;
	}

	public void setIncmg_pers_ipadd(String incmg_pers_ipadd){
		this.incmg_pers_ipadd = incmg_pers_ipadd;
	}

	public void setBank_nm(String bank_nm){
		this.bank_nm = bank_nm;
	}

	public void setDlco_nm(String dlco_nm){
		this.dlco_nm = dlco_nm;
	}

	public void setSale_dscn_amt(String sale_dscn_amt){
		this.sale_dscn_amt = sale_dscn_amt;
	}

	public void setNote_clsf_cd2(String note_clsf_cd2){
		this.note_clsf_cd2 = note_clsf_cd2;
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

	public String getRcpm_dt(){
		return this.rcpm_dt;
	}

	public String getRcpm_slip_clsf_cd(){
		return this.rcpm_slip_clsf_cd;
	}

	public String getRcpm_seq(){
		return this.rcpm_seq;
	}

	public String getRcpm_sub_seq(){
		return this.rcpm_sub_seq;
	}

	public String getNote_clsf_cd(){
		return this.note_clsf_cd;
	}

	public String getComp_dt(){
		return this.comp_dt;
	}

	public String getMtry_dt(){
		return this.mtry_dt;
	}

	public String getNote_amt(){
		return this.note_amt;
	}

	public String getPay_plac_cd(){
		return this.pay_plac_cd;
	}

	public String getNote_clehous_cd(){
		return this.note_clehous_cd;
	}

	public String getIssu_cmpy_clsf_cd(){
		return this.issu_cmpy_clsf_cd;
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

	public String getNow_note_stat_cd(){
		return this.now_note_stat_cd;
	}

	public String getNow_note_stat_dt(){
		return this.now_note_stat_dt;
	}

	public String getFisc_aprv_stat(){
		return this.fisc_aprv_stat;
	}

	public String getRmks1(){
		return this.rmks1;
	}

	public String getRmks2(){
		return this.rmks2;
	}

	public String getFisc_dt(){
		return this.fisc_dt;
	}

	public String getChg_dt_tm(){
		return this.chg_dt_tm;
	}

	public String getChg_pers(){
		return this.chg_pers;
	}

	public String getIncmg_pers_ipadd(){
		return this.incmg_pers_ipadd;
	}

	public String getBank_nm(){
		return this.bank_nm;
	}

	public String getDlco_nm(){
		return this.dlco_nm;
	}

	public String getSale_dscn_amt(){
		return this.sale_dscn_amt;
	}

	public String getNote_clsf_cd2(){
		return this.note_clsf_cd2;
	}
}

/* 작성시간 : Mon Mar 26 14:14:07 KST 2018 */
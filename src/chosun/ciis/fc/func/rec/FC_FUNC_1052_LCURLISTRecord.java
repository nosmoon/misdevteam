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


public class FC_FUNC_1052_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String note_clsf_cd_nm;
	public String note_no;
	public String mtry_dt;
	public String note_amt;
	public String frex_amt;
	public String rcpay_amt;
	public String coms;
	public String eeik_amt;
	public String slipno;
	public String issu_pers_nm;
	public String compnm2;
	public String note_clehous_cd_nm;
	public String now_note_stat_cd_nm;
	public String bank_nm;
	public String dlco_clsf_cd;
	public String dlco_cd;
	public String note_clehous_cd;
	public String now_note_stat_cd;
	public String compnm;
	public String note_clsf_cd;
	public String dlco_clsf_cd1;
	public String dlco_cd1;
	public String slip_occr_dt;
	public String slip_clsf_cd;
	public String slip_seq;
	public String slip_sub_seq;
	public String slip_arow_no;
	public String frex_cd;
	public String exrate;
	public String bank_cd;
	public String note_seq;
	public String biz_reg_no;
	public String bank_id;
	public String acct_num;
	public String tran_date_seq;
	public String current_clsf;

	public FC_FUNC_1052_LCURLISTRecord(){}

	public void setNote_clsf_cd_nm(String note_clsf_cd_nm){
		this.note_clsf_cd_nm = note_clsf_cd_nm;
	}

	public void setNote_no(String note_no){
		this.note_no = note_no;
	}

	public void setMtry_dt(String mtry_dt){
		this.mtry_dt = mtry_dt;
	}

	public void setNote_amt(String note_amt){
		this.note_amt = note_amt;
	}

	public void setFrex_amt(String frex_amt){
		this.frex_amt = frex_amt;
	}

	public void setRcpay_amt(String rcpay_amt){
		this.rcpay_amt = rcpay_amt;
	}

	public void setComs(String coms){
		this.coms = coms;
	}

	public void setEeik_amt(String eeik_amt){
		this.eeik_amt = eeik_amt;
	}

	public void setSlipno(String slipno){
		this.slipno = slipno;
	}

	public void setIssu_pers_nm(String issu_pers_nm){
		this.issu_pers_nm = issu_pers_nm;
	}

	public void setCompnm2(String compnm2){
		this.compnm2 = compnm2;
	}

	public void setNote_clehous_cd_nm(String note_clehous_cd_nm){
		this.note_clehous_cd_nm = note_clehous_cd_nm;
	}

	public void setNow_note_stat_cd_nm(String now_note_stat_cd_nm){
		this.now_note_stat_cd_nm = now_note_stat_cd_nm;
	}

	public void setBank_nm(String bank_nm){
		this.bank_nm = bank_nm;
	}

	public void setDlco_clsf_cd(String dlco_clsf_cd){
		this.dlco_clsf_cd = dlco_clsf_cd;
	}

	public void setDlco_cd(String dlco_cd){
		this.dlco_cd = dlco_cd;
	}

	public void setNote_clehous_cd(String note_clehous_cd){
		this.note_clehous_cd = note_clehous_cd;
	}

	public void setNow_note_stat_cd(String now_note_stat_cd){
		this.now_note_stat_cd = now_note_stat_cd;
	}

	public void setCompnm(String compnm){
		this.compnm = compnm;
	}

	public void setNote_clsf_cd(String note_clsf_cd){
		this.note_clsf_cd = note_clsf_cd;
	}

	public void setDlco_clsf_cd1(String dlco_clsf_cd1){
		this.dlco_clsf_cd1 = dlco_clsf_cd1;
	}

	public void setDlco_cd1(String dlco_cd1){
		this.dlco_cd1 = dlco_cd1;
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

	public void setSlip_sub_seq(String slip_sub_seq){
		this.slip_sub_seq = slip_sub_seq;
	}

	public void setSlip_arow_no(String slip_arow_no){
		this.slip_arow_no = slip_arow_no;
	}

	public void setFrex_cd(String frex_cd){
		this.frex_cd = frex_cd;
	}

	public void setExrate(String exrate){
		this.exrate = exrate;
	}

	public void setBank_cd(String bank_cd){
		this.bank_cd = bank_cd;
	}

	public void setNote_seq(String note_seq){
		this.note_seq = note_seq;
	}

	public void setBiz_reg_no(String biz_reg_no){
		this.biz_reg_no = biz_reg_no;
	}

	public void setBank_id(String bank_id){
		this.bank_id = bank_id;
	}

	public void setAcct_num(String acct_num){
		this.acct_num = acct_num;
	}

	public void setTran_date_seq(String tran_date_seq){
		this.tran_date_seq = tran_date_seq;
	}

	public void setCurrent_clsf(String current_clsf){
		this.current_clsf = current_clsf;
	}

	public String getNote_clsf_cd_nm(){
		return this.note_clsf_cd_nm;
	}

	public String getNote_no(){
		return this.note_no;
	}

	public String getMtry_dt(){
		return this.mtry_dt;
	}

	public String getNote_amt(){
		return this.note_amt;
	}

	public String getFrex_amt(){
		return this.frex_amt;
	}

	public String getRcpay_amt(){
		return this.rcpay_amt;
	}

	public String getComs(){
		return this.coms;
	}

	public String getEeik_amt(){
		return this.eeik_amt;
	}

	public String getSlipno(){
		return this.slipno;
	}

	public String getIssu_pers_nm(){
		return this.issu_pers_nm;
	}

	public String getCompnm2(){
		return this.compnm2;
	}

	public String getNote_clehous_cd_nm(){
		return this.note_clehous_cd_nm;
	}

	public String getNow_note_stat_cd_nm(){
		return this.now_note_stat_cd_nm;
	}

	public String getBank_nm(){
		return this.bank_nm;
	}

	public String getDlco_clsf_cd(){
		return this.dlco_clsf_cd;
	}

	public String getDlco_cd(){
		return this.dlco_cd;
	}

	public String getNote_clehous_cd(){
		return this.note_clehous_cd;
	}

	public String getNow_note_stat_cd(){
		return this.now_note_stat_cd;
	}

	public String getCompnm(){
		return this.compnm;
	}

	public String getNote_clsf_cd(){
		return this.note_clsf_cd;
	}

	public String getDlco_clsf_cd1(){
		return this.dlco_clsf_cd1;
	}

	public String getDlco_cd1(){
		return this.dlco_cd1;
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

	public String getSlip_sub_seq(){
		return this.slip_sub_seq;
	}

	public String getSlip_arow_no(){
		return this.slip_arow_no;
	}

	public String getFrex_cd(){
		return this.frex_cd;
	}

	public String getExrate(){
		return this.exrate;
	}

	public String getBank_cd(){
		return this.bank_cd;
	}

	public String getNote_seq(){
		return this.note_seq;
	}

	public String getBiz_reg_no(){
		return this.biz_reg_no;
	}

	public String getBank_id(){
		return this.bank_id;
	}

	public String getAcct_num(){
		return this.acct_num;
	}

	public String getTran_date_seq(){
		return this.tran_date_seq;
	}

	public String getCurrent_clsf(){
		return this.current_clsf;
	}
}

/* 작성시간 : Mon Aug 17 20:41:31 KST 2009 */
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


public class FC_FUNC_1063_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String note_clsf_cd_nm;
	public String note_no;
	public String rcpay_amt;
	public String mtry_dt;
	public String issu_pers_nm;
	public String slipno;
	public String dlco_cd;
	public String pch_compnm;
	public String pay_plac_cd_nm;
	public String now_note_stat_cd_nm;
	public String dlco_cd2;
	public String pch_smcompnm;
	public String note_clsf_cd;
	public String bank_cd;
	public String note_seq;
	public String slip_occr_dt;
	public String slip_clsf_cd;
	public String slip_seq;
	public String dlco_clsf_cd2;
	public String pay_plac_cd;
	public String now_note_stat_cd;
	public String dlco_clsf_cd;

	public FC_FUNC_1063_LCURLISTRecord(){}

	public void setNote_clsf_cd_nm(String note_clsf_cd_nm){
		this.note_clsf_cd_nm = note_clsf_cd_nm;
	}

	public void setNote_no(String note_no){
		this.note_no = note_no;
	}

	public void setRcpay_amt(String rcpay_amt){
		this.rcpay_amt = rcpay_amt;
	}

	public void setMtry_dt(String mtry_dt){
		this.mtry_dt = mtry_dt;
	}

	public void setIssu_pers_nm(String issu_pers_nm){
		this.issu_pers_nm = issu_pers_nm;
	}

	public void setSlipno(String slipno){
		this.slipno = slipno;
	}

	public void setDlco_cd(String dlco_cd){
		this.dlco_cd = dlco_cd;
	}

	public void setPch_compnm(String pch_compnm){
		this.pch_compnm = pch_compnm;
	}

	public void setPay_plac_cd_nm(String pay_plac_cd_nm){
		this.pay_plac_cd_nm = pay_plac_cd_nm;
	}

	public void setNow_note_stat_cd_nm(String now_note_stat_cd_nm){
		this.now_note_stat_cd_nm = now_note_stat_cd_nm;
	}

	public void setDlco_cd2(String dlco_cd2){
		this.dlco_cd2 = dlco_cd2;
	}

	public void setPch_smcompnm(String pch_smcompnm){
		this.pch_smcompnm = pch_smcompnm;
	}

	public void setNote_clsf_cd(String note_clsf_cd){
		this.note_clsf_cd = note_clsf_cd;
	}

	public void setBank_cd(String bank_cd){
		this.bank_cd = bank_cd;
	}

	public void setNote_seq(String note_seq){
		this.note_seq = note_seq;
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

	public void setDlco_clsf_cd2(String dlco_clsf_cd2){
		this.dlco_clsf_cd2 = dlco_clsf_cd2;
	}

	public void setPay_plac_cd(String pay_plac_cd){
		this.pay_plac_cd = pay_plac_cd;
	}

	public void setNow_note_stat_cd(String now_note_stat_cd){
		this.now_note_stat_cd = now_note_stat_cd;
	}

	public void setDlco_clsf_cd(String dlco_clsf_cd){
		this.dlco_clsf_cd = dlco_clsf_cd;
	}

	public String getNote_clsf_cd_nm(){
		return this.note_clsf_cd_nm;
	}

	public String getNote_no(){
		return this.note_no;
	}

	public String getRcpay_amt(){
		return this.rcpay_amt;
	}

	public String getMtry_dt(){
		return this.mtry_dt;
	}

	public String getIssu_pers_nm(){
		return this.issu_pers_nm;
	}

	public String getSlipno(){
		return this.slipno;
	}

	public String getDlco_cd(){
		return this.dlco_cd;
	}

	public String getPch_compnm(){
		return this.pch_compnm;
	}

	public String getPay_plac_cd_nm(){
		return this.pay_plac_cd_nm;
	}

	public String getNow_note_stat_cd_nm(){
		return this.now_note_stat_cd_nm;
	}

	public String getDlco_cd2(){
		return this.dlco_cd2;
	}

	public String getPch_smcompnm(){
		return this.pch_smcompnm;
	}

	public String getNote_clsf_cd(){
		return this.note_clsf_cd;
	}

	public String getBank_cd(){
		return this.bank_cd;
	}

	public String getNote_seq(){
		return this.note_seq;
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

	public String getDlco_clsf_cd2(){
		return this.dlco_clsf_cd2;
	}

	public String getPay_plac_cd(){
		return this.pay_plac_cd;
	}

	public String getNow_note_stat_cd(){
		return this.now_note_stat_cd;
	}

	public String getDlco_clsf_cd(){
		return this.dlco_clsf_cd;
	}
}

/* 작성시간 : Mon Feb 16 13:52:21 KST 2009 */
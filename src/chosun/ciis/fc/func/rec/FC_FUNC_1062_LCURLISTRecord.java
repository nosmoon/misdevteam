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


public class FC_FUNC_1062_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String note_clsf_cd_nm;
	public String note_no;
	public String note_amt;
	public String mtry_dt;
	public String issu_pers_nm;
	public String slipno;
	public String dlco_cd;
	public String pch_compnm;
	public String pay_plac_cd_nm;
	public String now_note_stat_cd_nm;
	public String dlco_clsf_cd;
	public String pch_compnm2;
	public String bank_cd;
	public String note_seq;
	public String pay_plac_cd;
	public String now_note_stat_cd;
	public String note_clsf_cd;

	public FC_FUNC_1062_LCURLISTRecord(){}

	public void setNote_clsf_cd_nm(String note_clsf_cd_nm){
		this.note_clsf_cd_nm = note_clsf_cd_nm;
	}

	public void setNote_no(String note_no){
		this.note_no = note_no;
	}

	public void setNote_amt(String note_amt){
		this.note_amt = note_amt;
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

	public void setDlco_clsf_cd(String dlco_clsf_cd){
		this.dlco_clsf_cd = dlco_clsf_cd;
	}

	public void setPch_compnm2(String pch_compnm2){
		this.pch_compnm2 = pch_compnm2;
	}

	public void setBank_cd(String bank_cd){
		this.bank_cd = bank_cd;
	}

	public void setNote_seq(String note_seq){
		this.note_seq = note_seq;
	}

	public void setPay_plac_cd(String pay_plac_cd){
		this.pay_plac_cd = pay_plac_cd;
	}

	public void setNow_note_stat_cd(String now_note_stat_cd){
		this.now_note_stat_cd = now_note_stat_cd;
	}

	public void setNote_clsf_cd(String note_clsf_cd){
		this.note_clsf_cd = note_clsf_cd;
	}

	public String getNote_clsf_cd_nm(){
		return this.note_clsf_cd_nm;
	}

	public String getNote_no(){
		return this.note_no;
	}

	public String getNote_amt(){
		return this.note_amt;
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

	public String getDlco_clsf_cd(){
		return this.dlco_clsf_cd;
	}

	public String getPch_compnm2(){
		return this.pch_compnm2;
	}

	public String getBank_cd(){
		return this.bank_cd;
	}

	public String getNote_seq(){
		return this.note_seq;
	}

	public String getPay_plac_cd(){
		return this.pay_plac_cd;
	}

	public String getNow_note_stat_cd(){
		return this.now_note_stat_cd;
	}

	public String getNote_clsf_cd(){
		return this.note_clsf_cd;
	}
}

/* 작성시간 : Mon Feb 16 14:54:59 KST 2009 */
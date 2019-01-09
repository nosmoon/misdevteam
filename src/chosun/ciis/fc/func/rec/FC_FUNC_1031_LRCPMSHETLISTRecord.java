/***************************************************************************************************
* 파일명 : .java
* 기능 : 자금관리-받을어음할인등록
* 작성일자 : 2009-02-19
* 작성자 : 노상현
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
 * 자금관리-받을어음할인등록
 */


public class FC_FUNC_1031_LRCPMSHETLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String note_clsf_cd;
	public String bank_cd;
	public String note_no;
	public String note_seq;
	public String mtry_dt;
	public String note_amt;
	public String issu_pers_nm;
	public String dlco_clsf_cd;
	public String dlco_cd;
	public String pay_plac_cd;
	public String now_note_stat_cd;
	public String now_note_stat_cdnm;
	public String compnm;
	public String pay_plac_cdnm;
	public String note_clsf_cdnm;
	public String coms;
	public String slip_occr_dt;
	public String slip_clsf_cd;
	public String slip_seq;
	public String slip_sub_seq;
	public String slip_arow_no;

	public FC_FUNC_1031_LRCPMSHETLISTRecord(){}

	public void setNote_clsf_cd(String note_clsf_cd){
		this.note_clsf_cd = note_clsf_cd;
	}

	public void setBank_cd(String bank_cd){
		this.bank_cd = bank_cd;
	}

	public void setNote_no(String note_no){
		this.note_no = note_no;
	}

	public void setNote_seq(String note_seq){
		this.note_seq = note_seq;
	}

	public void setMtry_dt(String mtry_dt){
		this.mtry_dt = mtry_dt;
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

	public void setPay_plac_cd(String pay_plac_cd){
		this.pay_plac_cd = pay_plac_cd;
	}

	public void setNow_note_stat_cd(String now_note_stat_cd){
		this.now_note_stat_cd = now_note_stat_cd;
	}

	public void setNow_note_stat_cdnm(String now_note_stat_cdnm){
		this.now_note_stat_cdnm = now_note_stat_cdnm;
	}

	public void setCompnm(String compnm){
		this.compnm = compnm;
	}

	public void setPay_plac_cdnm(String pay_plac_cdnm){
		this.pay_plac_cdnm = pay_plac_cdnm;
	}

	public void setNote_clsf_cdnm(String note_clsf_cdnm){
		this.note_clsf_cdnm = note_clsf_cdnm;
	}

	public void setComs(String coms){
		this.coms = coms;
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

	public String getNote_clsf_cd(){
		return this.note_clsf_cd;
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

	public String getMtry_dt(){
		return this.mtry_dt;
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

	public String getPay_plac_cd(){
		return this.pay_plac_cd;
	}

	public String getNow_note_stat_cd(){
		return this.now_note_stat_cd;
	}

	public String getNow_note_stat_cdnm(){
		return this.now_note_stat_cdnm;
	}

	public String getCompnm(){
		return this.compnm;
	}

	public String getPay_plac_cdnm(){
		return this.pay_plac_cdnm;
	}

	public String getNote_clsf_cdnm(){
		return this.note_clsf_cdnm;
	}

	public String getComs(){
		return this.coms;
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
}

/* 작성시간 : Wed Feb 25 16:28:39 KST 2009 */
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


public class FC_FUNC_1465_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String note_clsf_cdnm;
	public String note_full_no;
	public String note_amt;
	public String sale_dscn_amt;
	public String rcpay_amt;
	public String corp_tax;
	public String etc_prft;
	public String bank_cd_nm;
	public String rcpm_acct_nm2;
	public String slip_no;
	public String comp_dt;
	public String mtry_dt;
	public String issu_pers_nm;
	public String dlco_clsf_cd;
	public String dlco_cd;
	public String dlco_cdnm;
	public String pay_plac_cdnm;
	public String now_note_stat_cdnm;
	public String dlco_cdnm2;
	public String sale_aprv_no;
	public String coms;
	public String note_no1;

	public FC_FUNC_1465_LCURLISTRecord(){}

	public void setNote_clsf_cdnm(String note_clsf_cdnm){
		this.note_clsf_cdnm = note_clsf_cdnm;
	}

	public void setNote_full_no(String note_full_no){
		this.note_full_no = note_full_no;
	}

	public void setNote_amt(String note_amt){
		this.note_amt = note_amt;
	}

	public void setSale_dscn_amt(String sale_dscn_amt){
		this.sale_dscn_amt = sale_dscn_amt;
	}

	public void setRcpay_amt(String rcpay_amt){
		this.rcpay_amt = rcpay_amt;
	}

	public void setCorp_tax(String corp_tax){
		this.corp_tax = corp_tax;
	}

	public void setEtc_prft(String etc_prft){
		this.etc_prft = etc_prft;
	}

	public void setBank_cd_nm(String bank_cd_nm){
		this.bank_cd_nm = bank_cd_nm;
	}

	public void setRcpm_acct_nm2(String rcpm_acct_nm2){
		this.rcpm_acct_nm2 = rcpm_acct_nm2;
	}

	public void setSlip_no(String slip_no){
		this.slip_no = slip_no;
	}

	public void setComp_dt(String comp_dt){
		this.comp_dt = comp_dt;
	}

	public void setMtry_dt(String mtry_dt){
		this.mtry_dt = mtry_dt;
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

	public void setDlco_cdnm(String dlco_cdnm){
		this.dlco_cdnm = dlco_cdnm;
	}

	public void setPay_plac_cdnm(String pay_plac_cdnm){
		this.pay_plac_cdnm = pay_plac_cdnm;
	}

	public void setNow_note_stat_cdnm(String now_note_stat_cdnm){
		this.now_note_stat_cdnm = now_note_stat_cdnm;
	}

	public void setDlco_cdnm2(String dlco_cdnm2){
		this.dlco_cdnm2 = dlco_cdnm2;
	}

	public void setSale_aprv_no(String sale_aprv_no){
		this.sale_aprv_no = sale_aprv_no;
	}

	public void setComs(String coms){
		this.coms = coms;
	}

	public void setNote_no1(String note_no1){
		this.note_no1 = note_no1;
	}

	public String getNote_clsf_cdnm(){
		return this.note_clsf_cdnm;
	}

	public String getNote_full_no(){
		return this.note_full_no;
	}

	public String getNote_amt(){
		return this.note_amt;
	}

	public String getSale_dscn_amt(){
		return this.sale_dscn_amt;
	}

	public String getRcpay_amt(){
		return this.rcpay_amt;
	}

	public String getCorp_tax(){
		return this.corp_tax;
	}

	public String getEtc_prft(){
		return this.etc_prft;
	}

	public String getBank_cd_nm(){
		return this.bank_cd_nm;
	}

	public String getRcpm_acct_nm2(){
		return this.rcpm_acct_nm2;
	}

	public String getSlip_no(){
		return this.slip_no;
	}

	public String getComp_dt(){
		return this.comp_dt;
	}

	public String getMtry_dt(){
		return this.mtry_dt;
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

	public String getDlco_cdnm(){
		return this.dlco_cdnm;
	}

	public String getPay_plac_cdnm(){
		return this.pay_plac_cdnm;
	}

	public String getNow_note_stat_cdnm(){
		return this.now_note_stat_cdnm;
	}

	public String getDlco_cdnm2(){
		return this.dlco_cdnm2;
	}

	public String getSale_aprv_no(){
		return this.sale_aprv_no;
	}

	public String getComs(){
		return this.coms;
	}

	public String getNote_no1(){
		return this.note_no1;
	}
}

/* 작성시간 : Thu Aug 20 11:32:09 KST 2009 */
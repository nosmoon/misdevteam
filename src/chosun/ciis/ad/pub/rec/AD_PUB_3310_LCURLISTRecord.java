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


package chosun.ciis.ad.pub.rec;

import java.sql.*;
import chosun.ciis.ad.pub.dm.*;
import chosun.ciis.ad.pub.ds.*;

/**
 * 
 */


public class AD_PUB_3310_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String podr_yn;
	public String exct_yn;
	public String podr_ym;
	public String podr_clsf;
	public String dlco_nm;
	public String spl_dlco;
	public String brnd_nm;
	public String item_nm;
	public String podr_cnt;
	public String podr_uprc;
	public String podr_amt;
	public String exct_tot_cnt;
	public String exct_cnt2;
	public String exct_cnt1;
	public String exct_cnt;
	public String exct_uprc;
	public String exct_amt;
	public String ccon_fee;
	public String medi_fee;
	public String m_amt;
	public String easy_amt;
	public String occr_dt;
	public String occr_seq;
	public String incmg_pers_nm;
	public String podr_slip_no;
	public String exct_slip_no;
	public String status;
	public String remk;

	public AD_PUB_3310_LCURLISTRecord(){}

	public void setPodr_yn(String podr_yn){
		this.podr_yn = podr_yn;
	}

	public void setExct_yn(String exct_yn){
		this.exct_yn = exct_yn;
	}

	public void setPodr_ym(String podr_ym){
		this.podr_ym = podr_ym;
	}

	public void setPodr_clsf(String podr_clsf){
		this.podr_clsf = podr_clsf;
	}

	public void setDlco_nm(String dlco_nm){
		this.dlco_nm = dlco_nm;
	}

	public void setSpl_dlco(String spl_dlco){
		this.spl_dlco = spl_dlco;
	}

	public void setBrnd_nm(String brnd_nm){
		this.brnd_nm = brnd_nm;
	}

	public void setItem_nm(String item_nm){
		this.item_nm = item_nm;
	}

	public void setPodr_cnt(String podr_cnt){
		this.podr_cnt = podr_cnt;
	}

	public void setPodr_uprc(String podr_uprc){
		this.podr_uprc = podr_uprc;
	}

	public void setPodr_amt(String podr_amt){
		this.podr_amt = podr_amt;
	}

	public void setExct_tot_cnt(String exct_tot_cnt){
		this.exct_tot_cnt = exct_tot_cnt;
	}

	public void setExct_cnt2(String exct_cnt2){
		this.exct_cnt2 = exct_cnt2;
	}

	public void setExct_cnt1(String exct_cnt1){
		this.exct_cnt1 = exct_cnt1;
	}

	public void setExct_cnt(String exct_cnt){
		this.exct_cnt = exct_cnt;
	}

	public void setExct_uprc(String exct_uprc){
		this.exct_uprc = exct_uprc;
	}

	public void setExct_amt(String exct_amt){
		this.exct_amt = exct_amt;
	}

	public void setCcon_fee(String ccon_fee){
		this.ccon_fee = ccon_fee;
	}

	public void setMedi_fee(String medi_fee){
		this.medi_fee = medi_fee;
	}

	public void setM_amt(String m_amt){
		this.m_amt = m_amt;
	}

	public void setEasy_amt(String easy_amt){
		this.easy_amt = easy_amt;
	}

	public void setOccr_dt(String occr_dt){
		this.occr_dt = occr_dt;
	}

	public void setOccr_seq(String occr_seq){
		this.occr_seq = occr_seq;
	}

	public void setIncmg_pers_nm(String incmg_pers_nm){
		this.incmg_pers_nm = incmg_pers_nm;
	}

	public void setPodr_slip_no(String podr_slip_no){
		this.podr_slip_no = podr_slip_no;
	}

	public void setExct_slip_no(String exct_slip_no){
		this.exct_slip_no = exct_slip_no;
	}

	public void setStatus(String status){
		this.status = status;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public String getPodr_yn(){
		return this.podr_yn;
	}

	public String getExct_yn(){
		return this.exct_yn;
	}

	public String getPodr_ym(){
		return this.podr_ym;
	}

	public String getPodr_clsf(){
		return this.podr_clsf;
	}

	public String getDlco_nm(){
		return this.dlco_nm;
	}

	public String getSpl_dlco(){
		return this.spl_dlco;
	}

	public String getBrnd_nm(){
		return this.brnd_nm;
	}

	public String getItem_nm(){
		return this.item_nm;
	}

	public String getPodr_cnt(){
		return this.podr_cnt;
	}

	public String getPodr_uprc(){
		return this.podr_uprc;
	}

	public String getPodr_amt(){
		return this.podr_amt;
	}

	public String getExct_tot_cnt(){
		return this.exct_tot_cnt;
	}

	public String getExct_cnt2(){
		return this.exct_cnt2;
	}

	public String getExct_cnt1(){
		return this.exct_cnt1;
	}

	public String getExct_cnt(){
		return this.exct_cnt;
	}

	public String getExct_uprc(){
		return this.exct_uprc;
	}

	public String getExct_amt(){
		return this.exct_amt;
	}

	public String getCcon_fee(){
		return this.ccon_fee;
	}

	public String getMedi_fee(){
		return this.medi_fee;
	}

	public String getM_amt(){
		return this.m_amt;
	}

	public String getEasy_amt(){
		return this.easy_amt;
	}

	public String getOccr_dt(){
		return this.occr_dt;
	}

	public String getOccr_seq(){
		return this.occr_seq;
	}

	public String getIncmg_pers_nm(){
		return this.incmg_pers_nm;
	}

	public String getPodr_slip_no(){
		return this.podr_slip_no;
	}

	public String getExct_slip_no(){
		return this.exct_slip_no;
	}

	public String getStatus(){
		return this.status;
	}

	public String getRemk(){
		return this.remk;
	}
}

/* 작성시간 : Mon Sep 12 14:40:30 KST 2016 */
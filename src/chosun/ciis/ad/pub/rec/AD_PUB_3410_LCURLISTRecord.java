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


public class AD_PUB_3410_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String occr_dt;
	public String occr_seq;
	public String occr_arow;
	public String spl_dlco;
	public String brnd_cd;
	public String item_nm;
	public String podr_cnt;
	public String podr_uprc;
	public String podr_amt;
	public String uprc_fee;
	public String misu_amt;
	public String exct_yn;
	public String clamt_stat;
	public String mms_uprc;
	public String mms_cnt;
	public String mms_fee;
	public String mms_vat;
	public String expct_amt;

	public AD_PUB_3410_LCURLISTRecord(){}

	public void setOccr_dt(String occr_dt){
		this.occr_dt = occr_dt;
	}

	public void setOccr_seq(String occr_seq){
		this.occr_seq = occr_seq;
	}

	public void setOccr_arow(String occr_arow){
		this.occr_arow = occr_arow;
	}

	public void setSpl_dlco(String spl_dlco){
		this.spl_dlco = spl_dlco;
	}

	public void setBrnd_cd(String brnd_cd){
		this.brnd_cd = brnd_cd;
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

	public void setUprc_fee(String uprc_fee){
		this.uprc_fee = uprc_fee;
	}

	public void setMisu_amt(String misu_amt){
		this.misu_amt = misu_amt;
	}

	public void setExct_yn(String exct_yn){
		this.exct_yn = exct_yn;
	}

	public void setClamt_stat(String clamt_stat){
		this.clamt_stat = clamt_stat;
	}

	public void setMms_uprc(String mms_uprc){
		this.mms_uprc = mms_uprc;
	}

	public void setMms_cnt(String mms_cnt){
		this.mms_cnt = mms_cnt;
	}

	public void setMms_fee(String mms_fee){
		this.mms_fee = mms_fee;
	}

	public void setMms_vat(String mms_vat){
		this.mms_vat = mms_vat;
	}

	public void setExpct_amt(String expct_amt){
		this.expct_amt = expct_amt;
	}

	public String getOccr_dt(){
		return this.occr_dt;
	}

	public String getOccr_seq(){
		return this.occr_seq;
	}

	public String getOccr_arow(){
		return this.occr_arow;
	}

	public String getSpl_dlco(){
		return this.spl_dlco;
	}

	public String getBrnd_cd(){
		return this.brnd_cd;
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

	public String getUprc_fee(){
		return this.uprc_fee;
	}

	public String getMisu_amt(){
		return this.misu_amt;
	}

	public String getExct_yn(){
		return this.exct_yn;
	}

	public String getClamt_stat(){
		return this.clamt_stat;
	}

	public String getMms_uprc(){
		return this.mms_uprc;
	}

	public String getMms_cnt(){
		return this.mms_cnt;
	}

	public String getMms_fee(){
		return this.mms_fee;
	}

	public String getMms_vat(){
		return this.mms_vat;
	}

	public String getExpct_amt(){
		return this.expct_amt;
	}
}

/* 작성시간 : Thu Mar 12 11:16:26 KST 2015 */
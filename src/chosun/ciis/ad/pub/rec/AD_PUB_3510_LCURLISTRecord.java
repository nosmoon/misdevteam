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


public class AD_PUB_3510_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String podr_dt;
	public String podr_slip_no;
	public String occr_arow;
	public String medi_cd;
	public String spl_dlco;
	public String dlco_no;
	public String brnd_cd;
	public String item_nm;
	public String podr_uprc;
	public String uprc_fee;
	public String podr_cnt;
	public String podr_amt;
	public String misu_amt;
	public String mms_uprc;
	public String mms_cnt;
	public String mms_fee;
	public String expct_amt;
	public String exct_yn;
	public String sale_stmt_issu_yn;
	public String exct_dt;
	public String exct_uprc;
	public String exct_cnt;
	public String exct_amt;
	public String fee_rate;
	public String tot_fee;
	public String m_amt;
	public String easy_amt;
	public String sale_amt;
	public String slcrg_pers;
	public String mchrg_pers;

	public AD_PUB_3510_LCURLISTRecord(){}

	public void setPodr_dt(String podr_dt){
		this.podr_dt = podr_dt;
	}

	public void setPodr_slip_no(String podr_slip_no){
		this.podr_slip_no = podr_slip_no;
	}

	public void setOccr_arow(String occr_arow){
		this.occr_arow = occr_arow;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setSpl_dlco(String spl_dlco){
		this.spl_dlco = spl_dlco;
	}

	public void setDlco_no(String dlco_no){
		this.dlco_no = dlco_no;
	}

	public void setBrnd_cd(String brnd_cd){
		this.brnd_cd = brnd_cd;
	}

	public void setItem_nm(String item_nm){
		this.item_nm = item_nm;
	}

	public void setPodr_uprc(String podr_uprc){
		this.podr_uprc = podr_uprc;
	}

	public void setUprc_fee(String uprc_fee){
		this.uprc_fee = uprc_fee;
	}

	public void setPodr_cnt(String podr_cnt){
		this.podr_cnt = podr_cnt;
	}

	public void setPodr_amt(String podr_amt){
		this.podr_amt = podr_amt;
	}

	public void setMisu_amt(String misu_amt){
		this.misu_amt = misu_amt;
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

	public void setExpct_amt(String expct_amt){
		this.expct_amt = expct_amt;
	}

	public void setExct_yn(String exct_yn){
		this.exct_yn = exct_yn;
	}

	public void setSale_stmt_issu_yn(String sale_stmt_issu_yn){
		this.sale_stmt_issu_yn = sale_stmt_issu_yn;
	}

	public void setExct_dt(String exct_dt){
		this.exct_dt = exct_dt;
	}

	public void setExct_uprc(String exct_uprc){
		this.exct_uprc = exct_uprc;
	}

	public void setExct_cnt(String exct_cnt){
		this.exct_cnt = exct_cnt;
	}

	public void setExct_amt(String exct_amt){
		this.exct_amt = exct_amt;
	}

	public void setFee_rate(String fee_rate){
		this.fee_rate = fee_rate;
	}

	public void setTot_fee(String tot_fee){
		this.tot_fee = tot_fee;
	}

	public void setM_amt(String m_amt){
		this.m_amt = m_amt;
	}

	public void setEasy_amt(String easy_amt){
		this.easy_amt = easy_amt;
	}

	public void setSale_amt(String sale_amt){
		this.sale_amt = sale_amt;
	}

	public void setSlcrg_pers(String slcrg_pers){
		this.slcrg_pers = slcrg_pers;
	}

	public void setMchrg_pers(String mchrg_pers){
		this.mchrg_pers = mchrg_pers;
	}

	public String getPodr_dt(){
		return this.podr_dt;
	}

	public String getPodr_slip_no(){
		return this.podr_slip_no;
	}

	public String getOccr_arow(){
		return this.occr_arow;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getSpl_dlco(){
		return this.spl_dlco;
	}

	public String getDlco_no(){
		return this.dlco_no;
	}

	public String getBrnd_cd(){
		return this.brnd_cd;
	}

	public String getItem_nm(){
		return this.item_nm;
	}

	public String getPodr_uprc(){
		return this.podr_uprc;
	}

	public String getUprc_fee(){
		return this.uprc_fee;
	}

	public String getPodr_cnt(){
		return this.podr_cnt;
	}

	public String getPodr_amt(){
		return this.podr_amt;
	}

	public String getMisu_amt(){
		return this.misu_amt;
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

	public String getExpct_amt(){
		return this.expct_amt;
	}

	public String getExct_yn(){
		return this.exct_yn;
	}

	public String getSale_stmt_issu_yn(){
		return this.sale_stmt_issu_yn;
	}

	public String getExct_dt(){
		return this.exct_dt;
	}

	public String getExct_uprc(){
		return this.exct_uprc;
	}

	public String getExct_cnt(){
		return this.exct_cnt;
	}

	public String getExct_amt(){
		return this.exct_amt;
	}

	public String getFee_rate(){
		return this.fee_rate;
	}

	public String getTot_fee(){
		return this.tot_fee;
	}

	public String getM_amt(){
		return this.m_amt;
	}

	public String getEasy_amt(){
		return this.easy_amt;
	}

	public String getSale_amt(){
		return this.sale_amt;
	}

	public String getSlcrg_pers(){
		return this.slcrg_pers;
	}

	public String getMchrg_pers(){
		return this.mchrg_pers;
	}
}

/* 작성시간 : Thu Mar 26 19:34:19 KST 2015 */
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


package chosun.ciis.tn.rpt.rec;

import java.sql.*;
import chosun.ciis.tn.rpt.dm.*;
import chosun.ciis.tn.rpt.ds.*;

/**
 * 
 */


public class TN_RPT_1101_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String bank_cd;
	public String use_yn;
	public String bank_nm;
	public String cd_abrv_nm;
	public String bank_acct_no;
	public String bank_gb;
	public String mang_cd_3;
	public String mang_cd_4;
	public String mang_cd_5;
	public String mang_cd_6;
	public String mang_cd_7;
	public String mang_cd_8;
	public String mang_cd_9;
	public String mang_cd_10;
	public String mang_cd_11;
	public String mang_cd_12;
	public String tbl_nm;
	public String remk;
	public String upd_yn;
	public String incmg_pers_ip;
	public String incmg_pers;
	public String incmg_dt_tm;
	public String chg_pers;
	public String chg_dt_tm;

	public TN_RPT_1101_LCURLISTRecord(){}

	public void setBank_cd(String bank_cd){
		this.bank_cd = bank_cd;
	}

	public void setUse_yn(String use_yn){
		this.use_yn = use_yn;
	}

	public void setBank_nm(String bank_nm){
		this.bank_nm = bank_nm;
	}

	public void setCd_abrv_nm(String cd_abrv_nm){
		this.cd_abrv_nm = cd_abrv_nm;
	}

	public void setBank_acct_no(String bank_acct_no){
		this.bank_acct_no = bank_acct_no;
	}

	public void setBank_gb(String bank_gb){
		this.bank_gb = bank_gb;
	}

	public void setMang_cd_3(String mang_cd_3){
		this.mang_cd_3 = mang_cd_3;
	}

	public void setMang_cd_4(String mang_cd_4){
		this.mang_cd_4 = mang_cd_4;
	}

	public void setMang_cd_5(String mang_cd_5){
		this.mang_cd_5 = mang_cd_5;
	}

	public void setMang_cd_6(String mang_cd_6){
		this.mang_cd_6 = mang_cd_6;
	}

	public void setMang_cd_7(String mang_cd_7){
		this.mang_cd_7 = mang_cd_7;
	}

	public void setMang_cd_8(String mang_cd_8){
		this.mang_cd_8 = mang_cd_8;
	}

	public void setMang_cd_9(String mang_cd_9){
		this.mang_cd_9 = mang_cd_9;
	}

	public void setMang_cd_10(String mang_cd_10){
		this.mang_cd_10 = mang_cd_10;
	}

	public void setMang_cd_11(String mang_cd_11){
		this.mang_cd_11 = mang_cd_11;
	}

	public void setMang_cd_12(String mang_cd_12){
		this.mang_cd_12 = mang_cd_12;
	}

	public void setTbl_nm(String tbl_nm){
		this.tbl_nm = tbl_nm;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setUpd_yn(String upd_yn){
		this.upd_yn = upd_yn;
	}

	public void setIncmg_pers_ip(String incmg_pers_ip){
		this.incmg_pers_ip = incmg_pers_ip;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setIncmg_dt_tm(String incmg_dt_tm){
		this.incmg_dt_tm = incmg_dt_tm;
	}

	public void setChg_pers(String chg_pers){
		this.chg_pers = chg_pers;
	}

	public void setChg_dt_tm(String chg_dt_tm){
		this.chg_dt_tm = chg_dt_tm;
	}

	public String getBank_cd(){
		return this.bank_cd;
	}

	public String getUse_yn(){
		return this.use_yn;
	}

	public String getBank_nm(){
		return this.bank_nm;
	}

	public String getCd_abrv_nm(){
		return this.cd_abrv_nm;
	}

	public String getBank_acct_no(){
		return this.bank_acct_no;
	}

	public String getBank_gb(){
		return this.bank_gb;
	}

	public String getMang_cd_3(){
		return this.mang_cd_3;
	}

	public String getMang_cd_4(){
		return this.mang_cd_4;
	}

	public String getMang_cd_5(){
		return this.mang_cd_5;
	}

	public String getMang_cd_6(){
		return this.mang_cd_6;
	}

	public String getMang_cd_7(){
		return this.mang_cd_7;
	}

	public String getMang_cd_8(){
		return this.mang_cd_8;
	}

	public String getMang_cd_9(){
		return this.mang_cd_9;
	}

	public String getMang_cd_10(){
		return this.mang_cd_10;
	}

	public String getMang_cd_11(){
		return this.mang_cd_11;
	}

	public String getMang_cd_12(){
		return this.mang_cd_12;
	}

	public String getTbl_nm(){
		return this.tbl_nm;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getUpd_yn(){
		return this.upd_yn;
	}

	public String getIncmg_pers_ip(){
		return this.incmg_pers_ip;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getIncmg_dt_tm(){
		return this.incmg_dt_tm;
	}

	public String getChg_pers(){
		return this.chg_pers;
	}

	public String getChg_dt_tm(){
		return this.chg_dt_tm;
	}
}

/* 작성시간 : Tue Aug 23 11:21:35 KST 2016 */
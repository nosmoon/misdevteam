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


package chosun.ciis.hd.cost.rec;

import java.sql.*;
import chosun.ciis.hd.cost.dm.*;
import chosun.ciis.hd.cost.ds.*;

/**
 * 
 */


public class HD_COST_1200_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cmpy_cd;
	public String card_mang_no;
	public String carc_mang_no1;
	public String carc_mang_no2;
	public String memb_dnmn;
	public String card_no;
	public String dlco_cd;
	public String dlco_nm;
	public String use_pers_emp_no;
	public String nm_korn;
	public String issu_dt;
	public String mtry_dt;
	public String decid_dd;
	public String decid_bank_cd;
	public String bank_nm;
	public String wste_dt;
	public String use_yn;
	public String corp_card_clsf;
	public String hd_card_type;
	public String hd_card_stat;
	public String hd_mang_clsf;
	public String hd_mang_dty_nm;
	public String hd_oil_type;

	public HD_COST_1200_LCURLISTRecord(){}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setCard_mang_no(String card_mang_no){
		this.card_mang_no = card_mang_no;
	}

	public void setCarc_mang_no1(String carc_mang_no1){
		this.carc_mang_no1 = carc_mang_no1;
	}

	public void setCarc_mang_no2(String carc_mang_no2){
		this.carc_mang_no2 = carc_mang_no2;
	}

	public void setMemb_dnmn(String memb_dnmn){
		this.memb_dnmn = memb_dnmn;
	}

	public void setCard_no(String card_no){
		this.card_no = card_no;
	}

	public void setDlco_cd(String dlco_cd){
		this.dlco_cd = dlco_cd;
	}

	public void setDlco_nm(String dlco_nm){
		this.dlco_nm = dlco_nm;
	}

	public void setUse_pers_emp_no(String use_pers_emp_no){
		this.use_pers_emp_no = use_pers_emp_no;
	}

	public void setNm_korn(String nm_korn){
		this.nm_korn = nm_korn;
	}

	public void setIssu_dt(String issu_dt){
		this.issu_dt = issu_dt;
	}

	public void setMtry_dt(String mtry_dt){
		this.mtry_dt = mtry_dt;
	}

	public void setDecid_dd(String decid_dd){
		this.decid_dd = decid_dd;
	}

	public void setDecid_bank_cd(String decid_bank_cd){
		this.decid_bank_cd = decid_bank_cd;
	}

	public void setBank_nm(String bank_nm){
		this.bank_nm = bank_nm;
	}

	public void setWste_dt(String wste_dt){
		this.wste_dt = wste_dt;
	}

	public void setUse_yn(String use_yn){
		this.use_yn = use_yn;
	}

	public void setCorp_card_clsf(String corp_card_clsf){
		this.corp_card_clsf = corp_card_clsf;
	}

	public void setHd_card_type(String hd_card_type){
		this.hd_card_type = hd_card_type;
	}

	public void setHd_card_stat(String hd_card_stat){
		this.hd_card_stat = hd_card_stat;
	}

	public void setHd_mang_clsf(String hd_mang_clsf){
		this.hd_mang_clsf = hd_mang_clsf;
	}

	public void setHd_mang_dty_nm(String hd_mang_dty_nm){
		this.hd_mang_dty_nm = hd_mang_dty_nm;
	}

	public void setHd_oil_type(String hd_oil_type){
		this.hd_oil_type = hd_oil_type;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getCard_mang_no(){
		return this.card_mang_no;
	}

	public String getCarc_mang_no1(){
		return this.carc_mang_no1;
	}

	public String getCarc_mang_no2(){
		return this.carc_mang_no2;
	}

	public String getMemb_dnmn(){
		return this.memb_dnmn;
	}

	public String getCard_no(){
		return this.card_no;
	}

	public String getDlco_cd(){
		return this.dlco_cd;
	}

	public String getDlco_nm(){
		return this.dlco_nm;
	}

	public String getUse_pers_emp_no(){
		return this.use_pers_emp_no;
	}

	public String getNm_korn(){
		return this.nm_korn;
	}

	public String getIssu_dt(){
		return this.issu_dt;
	}

	public String getMtry_dt(){
		return this.mtry_dt;
	}

	public String getDecid_dd(){
		return this.decid_dd;
	}

	public String getDecid_bank_cd(){
		return this.decid_bank_cd;
	}

	public String getBank_nm(){
		return this.bank_nm;
	}

	public String getWste_dt(){
		return this.wste_dt;
	}

	public String getUse_yn(){
		return this.use_yn;
	}

	public String getCorp_card_clsf(){
		return this.corp_card_clsf;
	}

	public String getHd_card_type(){
		return this.hd_card_type;
	}

	public String getHd_card_stat(){
		return this.hd_card_stat;
	}

	public String getHd_mang_clsf(){
		return this.hd_mang_clsf;
	}

	public String getHd_mang_dty_nm(){
		return this.hd_mang_dty_nm;
	}

	public String getHd_oil_type(){
		return this.hd_oil_type;
	}
}

/* 작성시간 : Thu Aug 20 15:29:58 KST 2009 */
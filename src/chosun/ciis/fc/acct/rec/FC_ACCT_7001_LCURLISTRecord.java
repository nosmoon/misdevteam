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


package chosun.ciis.fc.acct.rec;

import java.sql.*;
import chosun.ciis.fc.acct.dm.*;
import chosun.ciis.fc.acct.ds.*;

/**
 * 
 */


public class FC_ACCT_7001_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String card_mang_no;
	public String card_no;
	public String use_pers_emp_no;
	public String use_pers_emp_nm;
	public String issu_dt;
	public String mtry_dt;
	public String decid_dd;
	public String wste_dt;
	public String dlco_cd;
	public String decid_bank_cd;
	public String bank_nm;
	public String memb_dnmn;
	public String use_yn;
	public String corp_card_clsf;

	public FC_ACCT_7001_LCURLISTRecord(){}

	public void setCard_mang_no(String card_mang_no){
		this.card_mang_no = card_mang_no;
	}

	public void setCard_no(String card_no){
		this.card_no = card_no;
	}

	public void setUse_pers_emp_no(String use_pers_emp_no){
		this.use_pers_emp_no = use_pers_emp_no;
	}

	public void setUse_pers_emp_nm(String use_pers_emp_nm){
		this.use_pers_emp_nm = use_pers_emp_nm;
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

	public void setWste_dt(String wste_dt){
		this.wste_dt = wste_dt;
	}

	public void setDlco_cd(String dlco_cd){
		this.dlco_cd = dlco_cd;
	}

	public void setDecid_bank_cd(String decid_bank_cd){
		this.decid_bank_cd = decid_bank_cd;
	}

	public void setBank_nm(String bank_nm){
		this.bank_nm = bank_nm;
	}

	public void setMemb_dnmn(String memb_dnmn){
		this.memb_dnmn = memb_dnmn;
	}

	public void setUse_yn(String use_yn){
		this.use_yn = use_yn;
	}

	public void setCorp_card_clsf(String corp_card_clsf){
		this.corp_card_clsf = corp_card_clsf;
	}

	public String getCard_mang_no(){
		return this.card_mang_no;
	}

	public String getCard_no(){
		return this.card_no;
	}

	public String getUse_pers_emp_no(){
		return this.use_pers_emp_no;
	}

	public String getUse_pers_emp_nm(){
		return this.use_pers_emp_nm;
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

	public String getWste_dt(){
		return this.wste_dt;
	}

	public String getDlco_cd(){
		return this.dlco_cd;
	}

	public String getDecid_bank_cd(){
		return this.decid_bank_cd;
	}

	public String getBank_nm(){
		return this.bank_nm;
	}

	public String getMemb_dnmn(){
		return this.memb_dnmn;
	}

	public String getUse_yn(){
		return this.use_yn;
	}

	public String getCorp_card_clsf(){
		return this.corp_card_clsf;
	}
}

/* 작성시간 : Fri Mar 06 13:21:09 KST 2009 */
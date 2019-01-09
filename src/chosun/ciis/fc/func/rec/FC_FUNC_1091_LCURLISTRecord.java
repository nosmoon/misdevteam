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


public class FC_FUNC_1091_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String b_note_clsf_cd_nm;
	public String b_nbn_no;
	public String b_pch_cymd1to;
	public String b_rcpay_amt;
	public String b_issu_pers_nm;
	public String b_dlco_clsf_cd_nm;
	public String b_pay_plac_cd_nm;
	public String b_now_note_stat_cd_nm;
	public String b_dlco_clsf_cd;
	public String b_dlco_cd;
	public String b_pay_plac_cd;
	public String b_now_note_stat_cd;
	public String b_note_clsf_cd;
	public String b_bank_cd;
	public String b_note_no;
	public String b_note_seq;

	public FC_FUNC_1091_LCURLISTRecord(){}

	public void setB_note_clsf_cd_nm(String b_note_clsf_cd_nm){
		this.b_note_clsf_cd_nm = b_note_clsf_cd_nm;
	}

	public void setB_nbn_no(String b_nbn_no){
		this.b_nbn_no = b_nbn_no;
	}

	public void setB_pch_cymd1to(String b_pch_cymd1to){
		this.b_pch_cymd1to = b_pch_cymd1to;
	}

	public void setB_rcpay_amt(String b_rcpay_amt){
		this.b_rcpay_amt = b_rcpay_amt;
	}

	public void setB_issu_pers_nm(String b_issu_pers_nm){
		this.b_issu_pers_nm = b_issu_pers_nm;
	}

	public void setB_dlco_clsf_cd_nm(String b_dlco_clsf_cd_nm){
		this.b_dlco_clsf_cd_nm = b_dlco_clsf_cd_nm;
	}

	public void setB_pay_plac_cd_nm(String b_pay_plac_cd_nm){
		this.b_pay_plac_cd_nm = b_pay_plac_cd_nm;
	}

	public void setB_now_note_stat_cd_nm(String b_now_note_stat_cd_nm){
		this.b_now_note_stat_cd_nm = b_now_note_stat_cd_nm;
	}

	public void setB_dlco_clsf_cd(String b_dlco_clsf_cd){
		this.b_dlco_clsf_cd = b_dlco_clsf_cd;
	}

	public void setB_dlco_cd(String b_dlco_cd){
		this.b_dlco_cd = b_dlco_cd;
	}

	public void setB_pay_plac_cd(String b_pay_plac_cd){
		this.b_pay_plac_cd = b_pay_plac_cd;
	}

	public void setB_now_note_stat_cd(String b_now_note_stat_cd){
		this.b_now_note_stat_cd = b_now_note_stat_cd;
	}

	public void setB_note_clsf_cd(String b_note_clsf_cd){
		this.b_note_clsf_cd = b_note_clsf_cd;
	}

	public void setB_bank_cd(String b_bank_cd){
		this.b_bank_cd = b_bank_cd;
	}

	public void setB_note_no(String b_note_no){
		this.b_note_no = b_note_no;
	}

	public void setB_note_seq(String b_note_seq){
		this.b_note_seq = b_note_seq;
	}

	public String getB_note_clsf_cd_nm(){
		return this.b_note_clsf_cd_nm;
	}

	public String getB_nbn_no(){
		return this.b_nbn_no;
	}

	public String getB_pch_cymd1to(){
		return this.b_pch_cymd1to;
	}

	public String getB_rcpay_amt(){
		return this.b_rcpay_amt;
	}

	public String getB_issu_pers_nm(){
		return this.b_issu_pers_nm;
	}

	public String getB_dlco_clsf_cd_nm(){
		return this.b_dlco_clsf_cd_nm;
	}

	public String getB_pay_plac_cd_nm(){
		return this.b_pay_plac_cd_nm;
	}

	public String getB_now_note_stat_cd_nm(){
		return this.b_now_note_stat_cd_nm;
	}

	public String getB_dlco_clsf_cd(){
		return this.b_dlco_clsf_cd;
	}

	public String getB_dlco_cd(){
		return this.b_dlco_cd;
	}

	public String getB_pay_plac_cd(){
		return this.b_pay_plac_cd;
	}

	public String getB_now_note_stat_cd(){
		return this.b_now_note_stat_cd;
	}

	public String getB_note_clsf_cd(){
		return this.b_note_clsf_cd;
	}

	public String getB_bank_cd(){
		return this.b_bank_cd;
	}

	public String getB_note_no(){
		return this.b_note_no;
	}

	public String getB_note_seq(){
		return this.b_note_seq;
	}
}

/* 작성시간 : Mon Jun 22 10:32:05 KST 2009 */
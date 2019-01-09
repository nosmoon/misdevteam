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


public class FC_FUNC_1452_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String reg_dt;
	public String note_ns;
	public String note_clsf_cd_nm;
	public String note_amt;
	public String bank_cd_nm;
	public String jpno;
	public String mtry_dt;
	public String issu_pers_nm;
	public String compnm;
	public String jgjnm;
	public String now_note_stat_cd_nm;
	public String comp_dt;
	public String note_no;
	public String note_seq;
	public String bank_cd;

	public FC_FUNC_1452_LCURLISTRecord(){}

	public void setReg_dt(String reg_dt){
		this.reg_dt = reg_dt;
	}

	public void setNote_ns(String note_ns){
		this.note_ns = note_ns;
	}

	public void setNote_clsf_cd_nm(String note_clsf_cd_nm){
		this.note_clsf_cd_nm = note_clsf_cd_nm;
	}

	public void setNote_amt(String note_amt){
		this.note_amt = note_amt;
	}

	public void setBank_cd_nm(String bank_cd_nm){
		this.bank_cd_nm = bank_cd_nm;
	}

	public void setJpno(String jpno){
		this.jpno = jpno;
	}

	public void setMtry_dt(String mtry_dt){
		this.mtry_dt = mtry_dt;
	}

	public void setIssu_pers_nm(String issu_pers_nm){
		this.issu_pers_nm = issu_pers_nm;
	}

	public void setCompnm(String compnm){
		this.compnm = compnm;
	}

	public void setJgjnm(String jgjnm){
		this.jgjnm = jgjnm;
	}

	public void setNow_note_stat_cd_nm(String now_note_stat_cd_nm){
		this.now_note_stat_cd_nm = now_note_stat_cd_nm;
	}

	public void setComp_dt(String comp_dt){
		this.comp_dt = comp_dt;
	}

	public void setNote_no(String note_no){
		this.note_no = note_no;
	}

	public void setNote_seq(String note_seq){
		this.note_seq = note_seq;
	}

	public void setBank_cd(String bank_cd){
		this.bank_cd = bank_cd;
	}

	public String getReg_dt(){
		return this.reg_dt;
	}

	public String getNote_ns(){
		return this.note_ns;
	}

	public String getNote_clsf_cd_nm(){
		return this.note_clsf_cd_nm;
	}

	public String getNote_amt(){
		return this.note_amt;
	}

	public String getBank_cd_nm(){
		return this.bank_cd_nm;
	}

	public String getJpno(){
		return this.jpno;
	}

	public String getMtry_dt(){
		return this.mtry_dt;
	}

	public String getIssu_pers_nm(){
		return this.issu_pers_nm;
	}

	public String getCompnm(){
		return this.compnm;
	}

	public String getJgjnm(){
		return this.jgjnm;
	}

	public String getNow_note_stat_cd_nm(){
		return this.now_note_stat_cd_nm;
	}

	public String getComp_dt(){
		return this.comp_dt;
	}

	public String getNote_no(){
		return this.note_no;
	}

	public String getNote_seq(){
		return this.note_seq;
	}

	public String getBank_cd(){
		return this.bank_cd;
	}
}

/* 작성시간 : Mon Apr 06 14:51:01 KST 2009 */
/***************************************************************************************************
* 파일명 : SP_CO_L_RDRCRTS_GRAD_APLC.java
* 기능 :  독자-독자인증요청 조회
* 작성일자 : 2004-05-17
* 작성자 : 전현표
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
 * 독자-독자인증요청 조회
 */

public class FC_FUNC_1130_LNOTE_STATRecord extends java.lang.Object implements java.io.Serializable{

	public String now_note_stat_cd;
	public String note_amt;
	public String comp_dt;
	public String mtry_dt;
	public String issu_cmpy_clsf_cd;
	public String issu_pers_nm;
	public String dlco_clsf_cd;
	public String dlco_cd;
	public String bank_nm;
	public String now_note_stat_nm;
	public String issu_cmpy_clsf_nm;
	public String compnm;

	public FC_FUNC_1130_LNOTE_STATRecord(){}

	public void setNow_note_stat_cd(String now_note_stat_cd){
		this.now_note_stat_cd = now_note_stat_cd;
	}

	public void setNote_amt(String note_amt){
		this.note_amt = note_amt;
	}

	public void setComp_dt(String comp_dt){
		this.comp_dt = comp_dt;
	}

	public void setMtry_dt(String mtry_dt){
		this.mtry_dt = mtry_dt;
	}

	public void setIssu_cmpy_clsf_cd(String issu_cmpy_clsf_cd){
		this.issu_cmpy_clsf_cd = issu_cmpy_clsf_cd;
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

	public void setBank_nm(String bank_nm){
		this.bank_nm = bank_nm;
	}

	public void setNow_note_stat_nm(String now_note_stat_nm){
		this.now_note_stat_nm = now_note_stat_nm;
	}

	public void setIssu_cmpy_clsf_nm(String issu_cmpy_clsf_nm){
		this.issu_cmpy_clsf_nm = issu_cmpy_clsf_nm;
	}

	public void setCompnm(String compnm){
		this.compnm = compnm;
	}

	public String getNow_note_stat_cd(){
		return this.now_note_stat_cd;
	}

	public String getNote_amt(){
		return this.note_amt;
	}

	public String getComp_dt(){
		return this.comp_dt;
	}

	public String getMtry_dt(){
		return this.mtry_dt;
	}

	public String getIssu_cmpy_clsf_cd(){
		return this.issu_cmpy_clsf_cd;
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

	public String getBank_nm(){
		return this.bank_nm;
	}

	public String getNow_note_stat_nm(){
		return this.now_note_stat_nm;
	}

	public String getIssu_cmpy_clsf_nm(){
		return this.issu_cmpy_clsf_nm;
	}

	public String getCompnm(){
		return this.compnm;
	}
}

/* 작성시간 : Tue Feb 03 17:07:40 KST 2009 */
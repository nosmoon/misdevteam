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


public class FC_FUNC_1040_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String note_clsf_cd;
	public String bank_cd;
	public String note_no;
	public String note_seq;
	public String mtry_dt;
	public String note_amt;
	public String issu_pers_nm;
	public String dlco_clsf_cd;
	public String dlco_cd;
	public String note_clehous_cd;
	public String now_note_stat_cd;
	public String compnm;
	public String eeghsnm;
	public String eestnm;
	public String eegbnm;
	public String comp_dt;
	public String coms;
	public String slip_no;

	public FC_FUNC_1040_LCURLISTRecord(){}

	public void setNote_clsf_cd(String note_clsf_cd){
		this.note_clsf_cd = note_clsf_cd;
	}

	public void setBank_cd(String bank_cd){
		this.bank_cd = bank_cd;
	}

	public void setNote_no(String note_no){
		this.note_no = note_no;
	}

	public void setNote_seq(String note_seq){
		this.note_seq = note_seq;
	}

	public void setMtry_dt(String mtry_dt){
		this.mtry_dt = mtry_dt;
	}

	public void setNote_amt(String note_amt){
		this.note_amt = note_amt;
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

	public void setNote_clehous_cd(String note_clehous_cd){
		this.note_clehous_cd = note_clehous_cd;
	}

	public void setNow_note_stat_cd(String now_note_stat_cd){
		this.now_note_stat_cd = now_note_stat_cd;
	}

	public void setCompnm(String compnm){
		this.compnm = compnm;
	}

	public void setEeghsnm(String eeghsnm){
		this.eeghsnm = eeghsnm;
	}

	public void setEestnm(String eestnm){
		this.eestnm = eestnm;
	}

	public void setEegbnm(String eegbnm){
		this.eegbnm = eegbnm;
	}

	public void setComp_dt(String comp_dt){
		this.comp_dt = comp_dt;
	}

	public void setComs(String coms){
		this.coms = coms;
	}

	public void setSlip_no(String slip_no){
		this.slip_no = slip_no;
	}

	public String getNote_clsf_cd(){
		return this.note_clsf_cd;
	}

	public String getBank_cd(){
		return this.bank_cd;
	}

	public String getNote_no(){
		return this.note_no;
	}

	public String getNote_seq(){
		return this.note_seq;
	}

	public String getMtry_dt(){
		return this.mtry_dt;
	}

	public String getNote_amt(){
		return this.note_amt;
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

	public String getNote_clehous_cd(){
		return this.note_clehous_cd;
	}

	public String getNow_note_stat_cd(){
		return this.now_note_stat_cd;
	}

	public String getCompnm(){
		return this.compnm;
	}

	public String getEeghsnm(){
		return this.eeghsnm;
	}

	public String getEestnm(){
		return this.eestnm;
	}

	public String getEegbnm(){
		return this.eegbnm;
	}

	public String getComp_dt(){
		return this.comp_dt;
	}

	public String getComs(){
		return this.coms;
	}

	public String getSlip_no(){
		return this.slip_no;
	}
}

/* 작성시간 : Thu Apr 02 13:28:08 KST 2009 */
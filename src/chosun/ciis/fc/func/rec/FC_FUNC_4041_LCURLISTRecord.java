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


public class FC_FUNC_4041_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String eestnm;
	public String mtry_dt;
	public String pay_note_no;
	public String note_amt;
	public String compnm;
	public String comp_dt;
	public String ysnm;
	public String rmks;
	public String patr_budg_cd;
	public String stat_cd;
	public String dlco_clsf_cd;
	public String dlco_cd;
	public String total;

	public FC_FUNC_4041_LCURLISTRecord(){}

	public void setEestnm(String eestnm){
		this.eestnm = eestnm;
	}

	public void setMtry_dt(String mtry_dt){
		this.mtry_dt = mtry_dt;
	}

	public void setPay_note_no(String pay_note_no){
		this.pay_note_no = pay_note_no;
	}

	public void setNote_amt(String note_amt){
		this.note_amt = note_amt;
	}

	public void setCompnm(String compnm){
		this.compnm = compnm;
	}

	public void setComp_dt(String comp_dt){
		this.comp_dt = comp_dt;
	}

	public void setYsnm(String ysnm){
		this.ysnm = ysnm;
	}

	public void setRmks(String rmks){
		this.rmks = rmks;
	}

	public void setPatr_budg_cd(String patr_budg_cd){
		this.patr_budg_cd = patr_budg_cd;
	}

	public void setStat_cd(String stat_cd){
		this.stat_cd = stat_cd;
	}

	public void setDlco_clsf_cd(String dlco_clsf_cd){
		this.dlco_clsf_cd = dlco_clsf_cd;
	}

	public void setDlco_cd(String dlco_cd){
		this.dlco_cd = dlco_cd;
	}

	public void setTotal(String total){
		this.total = total;
	}

	public String getEestnm(){
		return this.eestnm;
	}

	public String getMtry_dt(){
		return this.mtry_dt;
	}

	public String getPay_note_no(){
		return this.pay_note_no;
	}

	public String getNote_amt(){
		return this.note_amt;
	}

	public String getCompnm(){
		return this.compnm;
	}

	public String getComp_dt(){
		return this.comp_dt;
	}

	public String getYsnm(){
		return this.ysnm;
	}

	public String getRmks(){
		return this.rmks;
	}

	public String getPatr_budg_cd(){
		return this.patr_budg_cd;
	}

	public String getStat_cd(){
		return this.stat_cd;
	}

	public String getDlco_clsf_cd(){
		return this.dlco_clsf_cd;
	}

	public String getDlco_cd(){
		return this.dlco_cd;
	}

	public String getTotal(){
		return this.total;
	}
}

/* 작성시간 : Fri Mar 06 19:34:22 KST 2009 */
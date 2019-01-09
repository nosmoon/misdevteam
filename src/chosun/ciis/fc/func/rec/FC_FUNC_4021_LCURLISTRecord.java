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


public class FC_FUNC_4021_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String stat_dt;
	public String slip_occr_dt;
	public String slip_clsf_cd;
	public String slip_seq;
	public String slip_sub_seq;
	public String slip_arow_no;
	public String patr_budg_cd;
	public String rmks;
	public String rsrt_dt;
	public String befo_note_stat_cd;
	public String befo_note_stat_dt;
	public String incmg_dt_tm;
	public String incmg_pers;
	public String incmg_pers_ipadd;

	public FC_FUNC_4021_LCURLISTRecord(){}

	public void setStat_dt(String stat_dt){
		this.stat_dt = stat_dt;
	}

	public void setSlip_occr_dt(String slip_occr_dt){
		this.slip_occr_dt = slip_occr_dt;
	}

	public void setSlip_clsf_cd(String slip_clsf_cd){
		this.slip_clsf_cd = slip_clsf_cd;
	}

	public void setSlip_seq(String slip_seq){
		this.slip_seq = slip_seq;
	}

	public void setSlip_sub_seq(String slip_sub_seq){
		this.slip_sub_seq = slip_sub_seq;
	}

	public void setSlip_arow_no(String slip_arow_no){
		this.slip_arow_no = slip_arow_no;
	}

	public void setPatr_budg_cd(String patr_budg_cd){
		this.patr_budg_cd = patr_budg_cd;
	}

	public void setRmks(String rmks){
		this.rmks = rmks;
	}

	public void setRsrt_dt(String rsrt_dt){
		this.rsrt_dt = rsrt_dt;
	}

	public void setBefo_note_stat_cd(String befo_note_stat_cd){
		this.befo_note_stat_cd = befo_note_stat_cd;
	}

	public void setBefo_note_stat_dt(String befo_note_stat_dt){
		this.befo_note_stat_dt = befo_note_stat_dt;
	}

	public void setIncmg_dt_tm(String incmg_dt_tm){
		this.incmg_dt_tm = incmg_dt_tm;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setIncmg_pers_ipadd(String incmg_pers_ipadd){
		this.incmg_pers_ipadd = incmg_pers_ipadd;
	}

	public String getStat_dt(){
		return this.stat_dt;
	}

	public String getSlip_occr_dt(){
		return this.slip_occr_dt;
	}

	public String getSlip_clsf_cd(){
		return this.slip_clsf_cd;
	}

	public String getSlip_seq(){
		return this.slip_seq;
	}

	public String getSlip_sub_seq(){
		return this.slip_sub_seq;
	}

	public String getSlip_arow_no(){
		return this.slip_arow_no;
	}

	public String getPatr_budg_cd(){
		return this.patr_budg_cd;
	}

	public String getRmks(){
		return this.rmks;
	}

	public String getRsrt_dt(){
		return this.rsrt_dt;
	}

	public String getBefo_note_stat_cd(){
		return this.befo_note_stat_cd;
	}

	public String getBefo_note_stat_dt(){
		return this.befo_note_stat_dt;
	}

	public String getIncmg_dt_tm(){
		return this.incmg_dt_tm;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getIncmg_pers_ipadd(){
		return this.incmg_pers_ipadd;
	}
}

/* 작성시간 : Fri Mar 06 15:26:35 KST 2009 */
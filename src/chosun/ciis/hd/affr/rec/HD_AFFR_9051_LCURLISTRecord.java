/***************************************************************************************************
* 파일명 : .java
* 기능 : 
* 작성일자 : 
* 작성자 : 이태식
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 : 
* 수정자 : 
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.hd.affr.rec;

import java.sql.*;
import chosun.ciis.hd.affr.dm.*;
import chosun.ciis.hd.affr.ds.*;

/**
 * 
 */


public class HD_AFFR_9051_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cmpy_cd;
	public String basi_dt;
	public String usag_clsf_cd;
	public String usag_clsf_nm;
	public String journal_cd;
	public String journal_nm;
	public String qty;
	public String subs_pay;
	public String subs_tot_sum;
	public String mm_issu_tms;

	public HD_AFFR_9051_LCURLISTRecord(){}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setBasi_dt(String basi_dt){
		this.basi_dt = basi_dt;
	}

	public void setUsag_clsf_cd(String usag_clsf_cd){
		this.usag_clsf_cd = usag_clsf_cd;
	}

	public void setUsag_clsf_nm(String usag_clsf_nm){
		this.usag_clsf_nm = usag_clsf_nm;
	}

	public void setJournal_cd(String journal_cd){
		this.journal_cd = journal_cd;
	}

	public void setJournal_nm(String journal_nm){
		this.journal_nm = journal_nm;
	}

	public void setQty(String qty){
		this.qty = qty;
	}

	public void setSubs_pay(String subs_pay){
		this.subs_pay = subs_pay;
	}

	public void setSubs_tot_sum(String subs_tot_sum){
		this.subs_tot_sum = subs_tot_sum;
	}

	public void setMm_issu_tms(String mm_issu_tms){
		this.mm_issu_tms = mm_issu_tms;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getBasi_dt(){
		return this.basi_dt;
	}

	public String getUsag_clsf_cd(){
		return this.usag_clsf_cd;
	}

	public String getUsag_clsf_nm(){
		return this.usag_clsf_nm;
	}

	public String getJournal_cd(){
		return this.journal_cd;
	}

	public String getJournal_nm(){
		return this.journal_nm;
	}

	public String getQty(){
		return this.qty;
	}

	public String getSubs_pay(){
		return this.subs_pay;
	}

	public String getSubs_tot_sum(){
		return this.subs_tot_sum;
	}

	public String getMm_issu_tms(){
		return this.mm_issu_tms;
	}
}

/* 작성시간 : Mon Sep 12 10:47:01 KST 2016 */
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


package chosun.ciis.as.aset.rec;

import java.sql.*;
import chosun.ciis.as.aset.dm.*;
import chosun.ciis.as.aset.ds.*;

/**
 * 
 */


public class AS_ASET_1104_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String aset_no;
	public String aset_nm;
	public String befo_dept_nm;
	public String befo_loca;
	public String now_dept_nm;
	public String now_loca;
	public String remk;
	public String hsty_cnt;
	public String dlco_nm;
	public String chg_clsf;
	public String occr_dt;
	public String occr_seq;
	public String sub_seq;

	public AS_ASET_1104_LCURLISTRecord(){}

	public void setAset_no(String aset_no){
		this.aset_no = aset_no;
	}

	public void setAset_nm(String aset_nm){
		this.aset_nm = aset_nm;
	}

	public void setBefo_dept_nm(String befo_dept_nm){
		this.befo_dept_nm = befo_dept_nm;
	}

	public void setBefo_loca(String befo_loca){
		this.befo_loca = befo_loca;
	}

	public void setNow_dept_nm(String now_dept_nm){
		this.now_dept_nm = now_dept_nm;
	}

	public void setNow_loca(String now_loca){
		this.now_loca = now_loca;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setHsty_cnt(String hsty_cnt){
		this.hsty_cnt = hsty_cnt;
	}

	public void setDlco_nm(String dlco_nm){
		this.dlco_nm = dlco_nm;
	}

	public void setChg_clsf(String chg_clsf){
		this.chg_clsf = chg_clsf;
	}

	public void setOccr_dt(String occr_dt){
		this.occr_dt = occr_dt;
	}

	public void setOccr_seq(String occr_seq){
		this.occr_seq = occr_seq;
	}

	public void setSub_seq(String sub_seq){
		this.sub_seq = sub_seq;
	}

	public String getAset_no(){
		return this.aset_no;
	}

	public String getAset_nm(){
		return this.aset_nm;
	}

	public String getBefo_dept_nm(){
		return this.befo_dept_nm;
	}

	public String getBefo_loca(){
		return this.befo_loca;
	}

	public String getNow_dept_nm(){
		return this.now_dept_nm;
	}

	public String getNow_loca(){
		return this.now_loca;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getHsty_cnt(){
		return this.hsty_cnt;
	}

	public String getDlco_nm(){
		return this.dlco_nm;
	}

	public String getChg_clsf(){
		return this.chg_clsf;
	}

	public String getOccr_dt(){
		return this.occr_dt;
	}

	public String getOccr_seq(){
		return this.occr_seq;
	}

	public String getSub_seq(){
		return this.sub_seq;
	}
}

/* 작성시간 : Mon Mar 09 14:55:52 KST 2009 */
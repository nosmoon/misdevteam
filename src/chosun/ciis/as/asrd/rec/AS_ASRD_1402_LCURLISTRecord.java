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


package chosun.ciis.as.asrd.rec;

import java.sql.*;
import chosun.ciis.as.asrd.dm.*;
import chosun.ciis.as.asrd.ds.*;

/**
 * 
 */


public class AS_ASRD_1402_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cmpy_cd;
	public String chg_clsf;
	public String occr_dt;
	public String occr_seq;
	public String aset_no;
	public String aset_nm;
	public String chg_clsf_nm;
	public String chg_dt;
	public String aset_qunt_cnt;
	public String chg_amt;
	public String chg_vat_amt;
	public String dlco_ern;
	public String custnm;
	public String befo_dept_nm;
	public String now_dept_nm;
	public String now_loca;
	public String remk;

	public AS_ASRD_1402_LCURLISTRecord(){}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
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

	public void setAset_no(String aset_no){
		this.aset_no = aset_no;
	}

	public void setAset_nm(String aset_nm){
		this.aset_nm = aset_nm;
	}

	public void setChg_clsf_nm(String chg_clsf_nm){
		this.chg_clsf_nm = chg_clsf_nm;
	}

	public void setChg_dt(String chg_dt){
		this.chg_dt = chg_dt;
	}

	public void setAset_qunt_cnt(String aset_qunt_cnt){
		this.aset_qunt_cnt = aset_qunt_cnt;
	}

	public void setChg_amt(String chg_amt){
		this.chg_amt = chg_amt;
	}

	public void setChg_vat_amt(String chg_vat_amt){
		this.chg_vat_amt = chg_vat_amt;
	}

	public void setDlco_ern(String dlco_ern){
		this.dlco_ern = dlco_ern;
	}

	public void setCustnm(String custnm){
		this.custnm = custnm;
	}

	public void setBefo_dept_nm(String befo_dept_nm){
		this.befo_dept_nm = befo_dept_nm;
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

	public String getCmpy_cd(){
		return this.cmpy_cd;
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

	public String getAset_no(){
		return this.aset_no;
	}

	public String getAset_nm(){
		return this.aset_nm;
	}

	public String getChg_clsf_nm(){
		return this.chg_clsf_nm;
	}

	public String getChg_dt(){
		return this.chg_dt;
	}

	public String getAset_qunt_cnt(){
		return this.aset_qunt_cnt;
	}

	public String getChg_amt(){
		return this.chg_amt;
	}

	public String getChg_vat_amt(){
		return this.chg_vat_amt;
	}

	public String getDlco_ern(){
		return this.dlco_ern;
	}

	public String getCustnm(){
		return this.custnm;
	}

	public String getBefo_dept_nm(){
		return this.befo_dept_nm;
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
}

/* 작성시간 : Fri Jul 04 17:48:31 KST 2014 */
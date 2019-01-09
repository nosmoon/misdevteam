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


public class AS_ASET_1103_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String aset_no;
	public String aset_nm;
	public String chg_amt;
	public String chg_vat_amt;
	public String hsty_cnt;
	public String hsty_dlco_ern;
	public String dlco_nm;
	public String remk;
	public String cmpy_cd;
	public String chg_clsf;
	public String occr_dt;
	public String occr_seq;
	public String sub_seq;
	public String dept_cd;

	public AS_ASET_1103_LCURLISTRecord(){}

	public void setAset_no(String aset_no){
		this.aset_no = aset_no;
	}

	public void setAset_nm(String aset_nm){
		this.aset_nm = aset_nm;
	}

	public void setChg_amt(String chg_amt){
		this.chg_amt = chg_amt;
	}

	public void setChg_vat_amt(String chg_vat_amt){
		this.chg_vat_amt = chg_vat_amt;
	}

	public void setHsty_cnt(String hsty_cnt){
		this.hsty_cnt = hsty_cnt;
	}

	public void setHsty_dlco_ern(String hsty_dlco_ern){
		this.hsty_dlco_ern = hsty_dlco_ern;
	}

	public void setDlco_nm(String dlco_nm){
		this.dlco_nm = dlco_nm;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

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

	public void setSub_seq(String sub_seq){
		this.sub_seq = sub_seq;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public String getAset_no(){
		return this.aset_no;
	}

	public String getAset_nm(){
		return this.aset_nm;
	}

	public String getChg_amt(){
		return this.chg_amt;
	}

	public String getChg_vat_amt(){
		return this.chg_vat_amt;
	}

	public String getHsty_cnt(){
		return this.hsty_cnt;
	}

	public String getHsty_dlco_ern(){
		return this.hsty_dlco_ern;
	}

	public String getDlco_nm(){
		return this.dlco_nm;
	}

	public String getRemk(){
		return this.remk;
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

	public String getSub_seq(){
		return this.sub_seq;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}
}

/* 작성시간 : Wed Mar 11 18:50:12 KST 2009 */
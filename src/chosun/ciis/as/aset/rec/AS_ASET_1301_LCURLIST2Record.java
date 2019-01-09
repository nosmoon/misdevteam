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


public class AS_ASET_1301_LCURLIST2Record extends java.lang.Object implements java.io.Serializable{

	public String aset_no;
	public String aset_nm;
	public String befo_dept_cd;
	public String befo_loca;
	public String now_dept_cd;
	public String dept_nm;
	public String now_loca;
	public String dtls_remk;
	public String hsty_cnt;
	public String dlco_nm;
	public String cmpy_cd;
	public String chg_clsf;
	public String occr_dt;
	public String occr_seq;
	public String sub_seq;
	public String dept_cd;

	public AS_ASET_1301_LCURLIST2Record(){}

	public void setAset_no(String aset_no){
		this.aset_no = aset_no;
	}

	public void setAset_nm(String aset_nm){
		this.aset_nm = aset_nm;
	}

	public void setBefo_dept_cd(String befo_dept_cd){
		this.befo_dept_cd = befo_dept_cd;
	}

	public void setBefo_loca(String befo_loca){
		this.befo_loca = befo_loca;
	}

	public void setNow_dept_cd(String now_dept_cd){
		this.now_dept_cd = now_dept_cd;
	}

	public void setDept_nm(String dept_nm){
		this.dept_nm = dept_nm;
	}

	public void setNow_loca(String now_loca){
		this.now_loca = now_loca;
	}

	public void setDtls_remk(String dtls_remk){
		this.dtls_remk = dtls_remk;
	}

	public void setHsty_cnt(String hsty_cnt){
		this.hsty_cnt = hsty_cnt;
	}

	public void setDlco_nm(String dlco_nm){
		this.dlco_nm = dlco_nm;
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

	public String getBefo_dept_cd(){
		return this.befo_dept_cd;
	}

	public String getBefo_loca(){
		return this.befo_loca;
	}

	public String getNow_dept_cd(){
		return this.now_dept_cd;
	}

	public String getDept_nm(){
		return this.dept_nm;
	}

	public String getNow_loca(){
		return this.now_loca;
	}

	public String getDtls_remk(){
		return this.dtls_remk;
	}

	public String getHsty_cnt(){
		return this.hsty_cnt;
	}

	public String getDlco_nm(){
		return this.dlco_nm;
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

/* 작성시간 : Tue Mar 17 14:51:07 KST 2009 */
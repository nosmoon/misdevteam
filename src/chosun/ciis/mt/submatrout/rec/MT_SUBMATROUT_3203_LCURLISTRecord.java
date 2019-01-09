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


package chosun.ciis.mt.submatrout.rec;

import java.sql.*;
import chosun.ciis.mt.submatrout.dm.*;
import chosun.ciis.mt.submatrout.ds.*;

/**
 * 
 */


public class MT_SUBMATROUT_3203_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cmpy_cd;
	public String occr_dt;
	public String seq;
	public String ordr_dt;
	public String dlco_cd;
	public String dlco_nm;
	public String dlvs_dt;
	public String dlvs_fac_cd;
	public String dlvs_chrg_pers;
	public String chrg_pers_cntc_plac;
	public String chrg_pers_email;
	public String amt_pay_mthd;
	public String remk;
	public String ordr_yn;

	public MT_SUBMATROUT_3203_LCURLISTRecord(){}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setOccr_dt(String occr_dt){
		this.occr_dt = occr_dt;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setOrdr_dt(String ordr_dt){
		this.ordr_dt = ordr_dt;
	}

	public void setDlco_cd(String dlco_cd){
		this.dlco_cd = dlco_cd;
	}

	public void setDlco_nm(String dlco_nm){
		this.dlco_nm = dlco_nm;
	}

	public void setDlvs_dt(String dlvs_dt){
		this.dlvs_dt = dlvs_dt;
	}

	public void setDlvs_fac_cd(String dlvs_fac_cd){
		this.dlvs_fac_cd = dlvs_fac_cd;
	}

	public void setDlvs_chrg_pers(String dlvs_chrg_pers){
		this.dlvs_chrg_pers = dlvs_chrg_pers;
	}

	public void setChrg_pers_cntc_plac(String chrg_pers_cntc_plac){
		this.chrg_pers_cntc_plac = chrg_pers_cntc_plac;
	}

	public void setChrg_pers_email(String chrg_pers_email){
		this.chrg_pers_email = chrg_pers_email;
	}

	public void setAmt_pay_mthd(String amt_pay_mthd){
		this.amt_pay_mthd = amt_pay_mthd;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setOrdr_yn(String ordr_yn){
		this.ordr_yn = ordr_yn;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getOccr_dt(){
		return this.occr_dt;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getOrdr_dt(){
		return this.ordr_dt;
	}

	public String getDlco_cd(){
		return this.dlco_cd;
	}

	public String getDlco_nm(){
		return this.dlco_nm;
	}

	public String getDlvs_dt(){
		return this.dlvs_dt;
	}

	public String getDlvs_fac_cd(){
		return this.dlvs_fac_cd;
	}

	public String getDlvs_chrg_pers(){
		return this.dlvs_chrg_pers;
	}

	public String getChrg_pers_cntc_plac(){
		return this.chrg_pers_cntc_plac;
	}

	public String getChrg_pers_email(){
		return this.chrg_pers_email;
	}

	public String getAmt_pay_mthd(){
		return this.amt_pay_mthd;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getOrdr_yn(){
		return this.ordr_yn;
	}
}

/* 작성시간 : Thu May 07 09:22:25 KST 2009 */
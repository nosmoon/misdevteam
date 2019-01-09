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


package chosun.ciis.is.dep.rec;

import java.sql.*;
import chosun.ciis.is.dep.dm.*;
import chosun.ciis.is.dep.ds.*;

/**
 * 
 */


public class IS_DEP_1012_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String occr_dt;
	public String slip_clsf;
	public String seq;
	public String subseq;
	public String occr_dlco_cd;
	public String occr_dlco_nm;
	public String occr_amt;
	public String extnc_amt;
	public String occr_slip;
	public String budg_cd;

	public IS_DEP_1012_LCURLISTRecord(){}

	public void setOccr_dt(String occr_dt){
		this.occr_dt = occr_dt;
	}

	public void setSlip_clsf(String slip_clsf){
		this.slip_clsf = slip_clsf;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setSubseq(String subseq){
		this.subseq = subseq;
	}

	public void setOccr_dlco_cd(String occr_dlco_cd){
		this.occr_dlco_cd = occr_dlco_cd;
	}

	public void setOccr_dlco_nm(String occr_dlco_nm){
		this.occr_dlco_nm = occr_dlco_nm;
	}

	public void setOccr_amt(String occr_amt){
		this.occr_amt = occr_amt;
	}

	public void setExtnc_amt(String extnc_amt){
		this.extnc_amt = extnc_amt;
	}

	public void setOccr_slip(String occr_slip){
		this.occr_slip = occr_slip;
	}

	public void setBudg_cd(String budg_cd){
		this.budg_cd = budg_cd;
	}

	public String getOccr_dt(){
		return this.occr_dt;
	}

	public String getSlip_clsf(){
		return this.slip_clsf;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getSubseq(){
		return this.subseq;
	}

	public String getOccr_dlco_cd(){
		return this.occr_dlco_cd;
	}

	public String getOccr_dlco_nm(){
		return this.occr_dlco_nm;
	}

	public String getOccr_amt(){
		return this.occr_amt;
	}

	public String getExtnc_amt(){
		return this.extnc_amt;
	}

	public String getOccr_slip(){
		return this.occr_slip;
	}

	public String getBudg_cd(){
		return this.budg_cd;
	}
}

/* 작성시간 : Thu May 17 17:21:47 KST 2012 */
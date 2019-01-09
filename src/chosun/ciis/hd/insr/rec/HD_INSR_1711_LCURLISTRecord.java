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


package chosun.ciis.hd.insr.rec;

import java.sql.*;
import chosun.ciis.hd.insr.dm.*;
import chosun.ciis.hd.insr.ds.*;

/**
 * 
 */


public class HD_INSR_1711_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cmpy_cd;
	public String occr_dt;
	public String seq;
	public String rnum;
	public String tms;
	public String insr_entr_dt;
	public String insr_mtry_dt;
	public String insr_cmpy;
	public String pymt_insr_fee;
	public String recp_insr_amt;
	public String recp_minus_pymt;
	public String recp_insr_fee_stot;
	public String entr_nops;
	public String pymt_per_npos;

	public HD_INSR_1711_LCURLISTRecord(){}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setOccr_dt(String occr_dt){
		this.occr_dt = occr_dt;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setRnum(String rnum){
		this.rnum = rnum;
	}

	public void setTms(String tms){
		this.tms = tms;
	}

	public void setInsr_entr_dt(String insr_entr_dt){
		this.insr_entr_dt = insr_entr_dt;
	}

	public void setInsr_mtry_dt(String insr_mtry_dt){
		this.insr_mtry_dt = insr_mtry_dt;
	}

	public void setInsr_cmpy(String insr_cmpy){
		this.insr_cmpy = insr_cmpy;
	}

	public void setPymt_insr_fee(String pymt_insr_fee){
		this.pymt_insr_fee = pymt_insr_fee;
	}

	public void setRecp_insr_amt(String recp_insr_amt){
		this.recp_insr_amt = recp_insr_amt;
	}

	public void setRecp_minus_pymt(String recp_minus_pymt){
		this.recp_minus_pymt = recp_minus_pymt;
	}

	public void setRecp_insr_fee_stot(String recp_insr_fee_stot){
		this.recp_insr_fee_stot = recp_insr_fee_stot;
	}

	public void setEntr_nops(String entr_nops){
		this.entr_nops = entr_nops;
	}

	public void setPymt_per_npos(String pymt_per_npos){
		this.pymt_per_npos = pymt_per_npos;
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

	public String getRnum(){
		return this.rnum;
	}

	public String getTms(){
		return this.tms;
	}

	public String getInsr_entr_dt(){
		return this.insr_entr_dt;
	}

	public String getInsr_mtry_dt(){
		return this.insr_mtry_dt;
	}

	public String getInsr_cmpy(){
		return this.insr_cmpy;
	}

	public String getPymt_insr_fee(){
		return this.pymt_insr_fee;
	}

	public String getRecp_insr_amt(){
		return this.recp_insr_amt;
	}

	public String getRecp_minus_pymt(){
		return this.recp_minus_pymt;
	}

	public String getRecp_insr_fee_stot(){
		return this.recp_insr_fee_stot;
	}

	public String getEntr_nops(){
		return this.entr_nops;
	}

	public String getPymt_per_npos(){
		return this.pymt_per_npos;
	}
}

/* 작성시간 : Mon May 18 16:54:18 KST 2009 */
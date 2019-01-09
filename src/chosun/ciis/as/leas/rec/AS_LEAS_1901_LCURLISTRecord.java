/***************************************************************************************************
* 파일명 : .java
* 기능 : 자산-임대사업 - 입출금내역 정보확인
* 작성일자 : 2009-10-09
* 작성자 : 노상현
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.as.leas.rec;

import java.sql.*;
import chosun.ciis.as.leas.dm.*;
import chosun.ciis.as.leas.ds.*;

/**
 * 자산-임대사업 - 입출금내역 정보확인
 */


public class AS_LEAS_1901_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cntr_no;
	public String clam_yymm;
	public String clam_dt;
	public String clam_tot_amt;
	public String occr_dt;
	public String tot1;
	public String tot2;
	public String actu_slip_no;
	public String remk;
	public String clam_seq;
	public String in_gubun;
	public String hire_dlco_ern;
	public String hire_dlco_nm;
	public String rmtt_plac;
	public String rmtt_dt;

	public AS_LEAS_1901_LCURLISTRecord(){}

	public void setCntr_no(String cntr_no){
		this.cntr_no = cntr_no;
	}

	public void setClam_yymm(String clam_yymm){
		this.clam_yymm = clam_yymm;
	}

	public void setClam_dt(String clam_dt){
		this.clam_dt = clam_dt;
	}

	public void setClam_tot_amt(String clam_tot_amt){
		this.clam_tot_amt = clam_tot_amt;
	}

	public void setOccr_dt(String occr_dt){
		this.occr_dt = occr_dt;
	}

	public void setTot1(String tot1){
		this.tot1 = tot1;
	}

	public void setTot2(String tot2){
		this.tot2 = tot2;
	}

	public void setActu_slip_no(String actu_slip_no){
		this.actu_slip_no = actu_slip_no;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setClam_seq(String clam_seq){
		this.clam_seq = clam_seq;
	}

	public void setIn_gubun(String in_gubun){
		this.in_gubun = in_gubun;
	}

	public void setHire_dlco_ern(String hire_dlco_ern){
		this.hire_dlco_ern = hire_dlco_ern;
	}

	public void setHire_dlco_nm(String hire_dlco_nm){
		this.hire_dlco_nm = hire_dlco_nm;
	}

	public void setRmtt_plac(String rmtt_plac){
		this.rmtt_plac = rmtt_plac;
	}

	public void setRmtt_dt(String rmtt_dt){
		this.rmtt_dt = rmtt_dt;
	}

	public String getCntr_no(){
		return this.cntr_no;
	}

	public String getClam_yymm(){
		return this.clam_yymm;
	}

	public String getClam_dt(){
		return this.clam_dt;
	}

	public String getClam_tot_amt(){
		return this.clam_tot_amt;
	}

	public String getOccr_dt(){
		return this.occr_dt;
	}

	public String getTot1(){
		return this.tot1;
	}

	public String getTot2(){
		return this.tot2;
	}

	public String getActu_slip_no(){
		return this.actu_slip_no;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getClam_seq(){
		return this.clam_seq;
	}

	public String getIn_gubun(){
		return this.in_gubun;
	}

	public String getHire_dlco_ern(){
		return this.hire_dlco_ern;
	}

	public String getHire_dlco_nm(){
		return this.hire_dlco_nm;
	}

	public String getRmtt_plac(){
		return this.rmtt_plac;
	}

	public String getRmtt_dt(){
		return this.rmtt_dt;
	}
}

/* 작성시간 : Thu Dec 17 16:01:11 KST 2009 */
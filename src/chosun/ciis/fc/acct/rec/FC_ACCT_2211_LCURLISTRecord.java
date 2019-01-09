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


package chosun.ciis.fc.acct.rec;

import java.sql.*;
import chosun.ciis.fc.acct.dm.*;
import chosun.ciis.fc.acct.ds.*;

/**
 * 
 */


public class FC_ACCT_2211_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String budg_cd;
	public String pch_yscdnm;
	public String prof_type_cd;
	public String slip_clsf_cd;
	public String slip_occr_dt;
	public String slip_seq;
	public String occr_slip_occr_dt;
	public String occr_slip_clsf_cd;
	public String occr_slip_seq;
	public String occr_slip_sub_seq;
	public String occr_slip_arow_no;
	public String acntcymd;
	public String ern;
	public String pch_irjnm;
	public String dlco_nm;
	public String ask_emp_no;
	public String pch_erirjnm;
	public String ask_dept_cd;
	public String pch_cgbuseonm;
	public String remk;
	public String suply_amt;
	public String vat_amt;
	public String unrcp_excl_yn;
	public String igamt;
	public String janamt;
	public String slip_no;
	public String occr_slip_no;

	public FC_ACCT_2211_LCURLISTRecord(){}

	public void setBudg_cd(String budg_cd){
		this.budg_cd = budg_cd;
	}

	public void setPch_yscdnm(String pch_yscdnm){
		this.pch_yscdnm = pch_yscdnm;
	}

	public void setProf_type_cd(String prof_type_cd){
		this.prof_type_cd = prof_type_cd;
	}

	public void setSlip_clsf_cd(String slip_clsf_cd){
		this.slip_clsf_cd = slip_clsf_cd;
	}

	public void setSlip_occr_dt(String slip_occr_dt){
		this.slip_occr_dt = slip_occr_dt;
	}

	public void setSlip_seq(String slip_seq){
		this.slip_seq = slip_seq;
	}

	public void setOccr_slip_occr_dt(String occr_slip_occr_dt){
		this.occr_slip_occr_dt = occr_slip_occr_dt;
	}

	public void setOccr_slip_clsf_cd(String occr_slip_clsf_cd){
		this.occr_slip_clsf_cd = occr_slip_clsf_cd;
	}

	public void setOccr_slip_seq(String occr_slip_seq){
		this.occr_slip_seq = occr_slip_seq;
	}

	public void setOccr_slip_sub_seq(String occr_slip_sub_seq){
		this.occr_slip_sub_seq = occr_slip_sub_seq;
	}

	public void setOccr_slip_arow_no(String occr_slip_arow_no){
		this.occr_slip_arow_no = occr_slip_arow_no;
	}

	public void setAcntcymd(String acntcymd){
		this.acntcymd = acntcymd;
	}

	public void setErn(String ern){
		this.ern = ern;
	}

	public void setPch_irjnm(String pch_irjnm){
		this.pch_irjnm = pch_irjnm;
	}

	public void setDlco_nm(String dlco_nm){
		this.dlco_nm = dlco_nm;
	}

	public void setAsk_emp_no(String ask_emp_no){
		this.ask_emp_no = ask_emp_no;
	}

	public void setPch_erirjnm(String pch_erirjnm){
		this.pch_erirjnm = pch_erirjnm;
	}

	public void setAsk_dept_cd(String ask_dept_cd){
		this.ask_dept_cd = ask_dept_cd;
	}

	public void setPch_cgbuseonm(String pch_cgbuseonm){
		this.pch_cgbuseonm = pch_cgbuseonm;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setSuply_amt(String suply_amt){
		this.suply_amt = suply_amt;
	}

	public void setVat_amt(String vat_amt){
		this.vat_amt = vat_amt;
	}

	public void setUnrcp_excl_yn(String unrcp_excl_yn){
		this.unrcp_excl_yn = unrcp_excl_yn;
	}

	public void setIgamt(String igamt){
		this.igamt = igamt;
	}

	public void setJanamt(String janamt){
		this.janamt = janamt;
	}

	public void setSlip_no(String slip_no){
		this.slip_no = slip_no;
	}

	public void setOccr_slip_no(String occr_slip_no){
		this.occr_slip_no = occr_slip_no;
	}

	public String getBudg_cd(){
		return this.budg_cd;
	}

	public String getPch_yscdnm(){
		return this.pch_yscdnm;
	}

	public String getProf_type_cd(){
		return this.prof_type_cd;
	}

	public String getSlip_clsf_cd(){
		return this.slip_clsf_cd;
	}

	public String getSlip_occr_dt(){
		return this.slip_occr_dt;
	}

	public String getSlip_seq(){
		return this.slip_seq;
	}

	public String getOccr_slip_occr_dt(){
		return this.occr_slip_occr_dt;
	}

	public String getOccr_slip_clsf_cd(){
		return this.occr_slip_clsf_cd;
	}

	public String getOccr_slip_seq(){
		return this.occr_slip_seq;
	}

	public String getOccr_slip_sub_seq(){
		return this.occr_slip_sub_seq;
	}

	public String getOccr_slip_arow_no(){
		return this.occr_slip_arow_no;
	}

	public String getAcntcymd(){
		return this.acntcymd;
	}

	public String getErn(){
		return this.ern;
	}

	public String getPch_irjnm(){
		return this.pch_irjnm;
	}

	public String getDlco_nm(){
		return this.dlco_nm;
	}

	public String getAsk_emp_no(){
		return this.ask_emp_no;
	}

	public String getPch_erirjnm(){
		return this.pch_erirjnm;
	}

	public String getAsk_dept_cd(){
		return this.ask_dept_cd;
	}

	public String getPch_cgbuseonm(){
		return this.pch_cgbuseonm;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getSuply_amt(){
		return this.suply_amt;
	}

	public String getVat_amt(){
		return this.vat_amt;
	}

	public String getUnrcp_excl_yn(){
		return this.unrcp_excl_yn;
	}

	public String getIgamt(){
		return this.igamt;
	}

	public String getJanamt(){
		return this.janamt;
	}

	public String getSlip_no(){
		return this.slip_no;
	}

	public String getOccr_slip_no(){
		return this.occr_slip_no;
	}
}

/* 작성시간 : Tue Jan 24 17:20:35 KST 2017 */
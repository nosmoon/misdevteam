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


public class FC_ACCT_2301_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String pay_dt;
	public String type_cd;
	public String prof_type_cd;
	public String slip_clsf_cd;
	public String slip_occr_dt;
	public String slip_seq;
	public String medi_cd;
	public String sum_amt;
	public String suply_amt;
	public String vat_amt;
	public String mtry_dt;
	public String pch_mcnm;
	public String fisc_dt;
	public String occr_slip_occr_dt;
	public String occr_slip_clsf_cd;
	public String occr_slip_seq;

	public FC_ACCT_2301_LCURLISTRecord(){}

	public void setPay_dt(String pay_dt){
		this.pay_dt = pay_dt;
	}

	public void setType_cd(String type_cd){
		this.type_cd = type_cd;
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

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setSum_amt(String sum_amt){
		this.sum_amt = sum_amt;
	}

	public void setSuply_amt(String suply_amt){
		this.suply_amt = suply_amt;
	}

	public void setVat_amt(String vat_amt){
		this.vat_amt = vat_amt;
	}

	public void setMtry_dt(String mtry_dt){
		this.mtry_dt = mtry_dt;
	}

	public void setPch_mcnm(String pch_mcnm){
		this.pch_mcnm = pch_mcnm;
	}

	public void setFisc_dt(String fisc_dt){
		this.fisc_dt = fisc_dt;
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

	public String getPay_dt(){
		return this.pay_dt;
	}

	public String getType_cd(){
		return this.type_cd;
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

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getSum_amt(){
		return this.sum_amt;
	}

	public String getSuply_amt(){
		return this.suply_amt;
	}

	public String getVat_amt(){
		return this.vat_amt;
	}

	public String getMtry_dt(){
		return this.mtry_dt;
	}

	public String getPch_mcnm(){
		return this.pch_mcnm;
	}

	public String getFisc_dt(){
		return this.fisc_dt;
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
}

/* 작성시간 : Tue Apr 28 11:29:31 KST 2009 */
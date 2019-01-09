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


package chosun.ciis.fc.func.rec;

import java.sql.*;
import chosun.ciis.fc.func.dm.*;
import chosun.ciis.fc.func.ds.*;

/**
 * 
 */


public class FC_FUNC_7031_LCURLIST3Record extends java.lang.Object implements java.io.Serializable{

	public String pay_dt;
	public String comp_dt;
	public String mtry_dt;
	public String int_amt;
	public String slip_no;
	public String rmks;
	public String patr_budg_cd;
	public String deps_clsf_cd;
	public String slip_occr_dt;
	public String slip_clsf_cd;
	public String slip_seq;

	public FC_FUNC_7031_LCURLIST3Record(){}

	public void setPay_dt(String pay_dt){
		this.pay_dt = pay_dt;
	}

	public void setComp_dt(String comp_dt){
		this.comp_dt = comp_dt;
	}

	public void setMtry_dt(String mtry_dt){
		this.mtry_dt = mtry_dt;
	}

	public void setInt_amt(String int_amt){
		this.int_amt = int_amt;
	}

	public void setSlip_no(String slip_no){
		this.slip_no = slip_no;
	}

	public void setRmks(String rmks){
		this.rmks = rmks;
	}

	public void setPatr_budg_cd(String patr_budg_cd){
		this.patr_budg_cd = patr_budg_cd;
	}

	public void setDeps_clsf_cd(String deps_clsf_cd){
		this.deps_clsf_cd = deps_clsf_cd;
	}

	public void setSlip_occr_dt(String slip_occr_dt){
		this.slip_occr_dt = slip_occr_dt;
	}

	public void setSlip_clsf_cd(String slip_clsf_cd){
		this.slip_clsf_cd = slip_clsf_cd;
	}

	public void setSlip_seq(String slip_seq){
		this.slip_seq = slip_seq;
	}

	public String getPay_dt(){
		return this.pay_dt;
	}

	public String getComp_dt(){
		return this.comp_dt;
	}

	public String getMtry_dt(){
		return this.mtry_dt;
	}

	public String getInt_amt(){
		return this.int_amt;
	}

	public String getSlip_no(){
		return this.slip_no;
	}

	public String getRmks(){
		return this.rmks;
	}

	public String getPatr_budg_cd(){
		return this.patr_budg_cd;
	}

	public String getDeps_clsf_cd(){
		return this.deps_clsf_cd;
	}

	public String getSlip_occr_dt(){
		return this.slip_occr_dt;
	}

	public String getSlip_clsf_cd(){
		return this.slip_clsf_cd;
	}

	public String getSlip_seq(){
		return this.slip_seq;
	}
}

/* 작성시간 : Tue Apr 07 14:11:00 KST 2009 */
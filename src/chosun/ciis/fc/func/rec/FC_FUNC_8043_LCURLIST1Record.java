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


public class FC_FUNC_8043_LCURLIST1Record extends java.lang.Object implements java.io.Serializable{

	public String pymt_dt;
	public String exrate;
	public String libo_int_rate;
	public String dedu_int_rate;
	public String pymt_prcp;
	public String pymt_int;
	public String won_amt;
	public String rmks;
	public String nomach_adpay_bal;
	public String slip_occr_dt;
	public String slip_clsf_cd;
	public String slip_seq;
	public String slip_sub_seq;
	public String slip_arow_no;
	public String comp_dt;
	public String mtry_dt;

	public FC_FUNC_8043_LCURLIST1Record(){}

	public void setPymt_dt(String pymt_dt){
		this.pymt_dt = pymt_dt;
	}

	public void setExrate(String exrate){
		this.exrate = exrate;
	}

	public void setLibo_int_rate(String libo_int_rate){
		this.libo_int_rate = libo_int_rate;
	}

	public void setDedu_int_rate(String dedu_int_rate){
		this.dedu_int_rate = dedu_int_rate;
	}

	public void setPymt_prcp(String pymt_prcp){
		this.pymt_prcp = pymt_prcp;
	}

	public void setPymt_int(String pymt_int){
		this.pymt_int = pymt_int;
	}

	public void setWon_amt(String won_amt){
		this.won_amt = won_amt;
	}

	public void setRmks(String rmks){
		this.rmks = rmks;
	}

	public void setNomach_adpay_bal(String nomach_adpay_bal){
		this.nomach_adpay_bal = nomach_adpay_bal;
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

	public void setSlip_sub_seq(String slip_sub_seq){
		this.slip_sub_seq = slip_sub_seq;
	}

	public void setSlip_arow_no(String slip_arow_no){
		this.slip_arow_no = slip_arow_no;
	}

	public void setComp_dt(String comp_dt){
		this.comp_dt = comp_dt;
	}

	public void setMtry_dt(String mtry_dt){
		this.mtry_dt = mtry_dt;
	}

	public String getPymt_dt(){
		return this.pymt_dt;
	}

	public String getExrate(){
		return this.exrate;
	}

	public String getLibo_int_rate(){
		return this.libo_int_rate;
	}

	public String getDedu_int_rate(){
		return this.dedu_int_rate;
	}

	public String getPymt_prcp(){
		return this.pymt_prcp;
	}

	public String getPymt_int(){
		return this.pymt_int;
	}

	public String getWon_amt(){
		return this.won_amt;
	}

	public String getRmks(){
		return this.rmks;
	}

	public String getNomach_adpay_bal(){
		return this.nomach_adpay_bal;
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

	public String getSlip_sub_seq(){
		return this.slip_sub_seq;
	}

	public String getSlip_arow_no(){
		return this.slip_arow_no;
	}

	public String getComp_dt(){
		return this.comp_dt;
	}

	public String getMtry_dt(){
		return this.mtry_dt;
	}
}

/* 작성시간 : Thu Apr 09 15:11:08 KST 2009 */
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


public class FC_ACCT_2151_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String slip_clsf_cd;
	public String slip_occr_dt;
	public String slip_seq;
	public String slip;
	public String dlco_cd;
	public String dlco_nm;
	public String make_dt;
	public String item;
	public String occr_slip;
	public String occr_slip_occr_dt;
	public String occr_slip_clsf_cd;
	public String occr_slip_seq;
	public String occr_slip_sub_seq;
	public String sgamt;

	public FC_ACCT_2151_LCURLISTRecord(){}

	public void setSlip_clsf_cd(String slip_clsf_cd){
		this.slip_clsf_cd = slip_clsf_cd;
	}

	public void setSlip_occr_dt(String slip_occr_dt){
		this.slip_occr_dt = slip_occr_dt;
	}

	public void setSlip_seq(String slip_seq){
		this.slip_seq = slip_seq;
	}

	public void setSlip(String slip){
		this.slip = slip;
	}

	public void setDlco_cd(String dlco_cd){
		this.dlco_cd = dlco_cd;
	}

	public void setDlco_nm(String dlco_nm){
		this.dlco_nm = dlco_nm;
	}

	public void setMake_dt(String make_dt){
		this.make_dt = make_dt;
	}

	public void setItem(String item){
		this.item = item;
	}

	public void setOccr_slip(String occr_slip){
		this.occr_slip = occr_slip;
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

	public void setSgamt(String sgamt){
		this.sgamt = sgamt;
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

	public String getSlip(){
		return this.slip;
	}

	public String getDlco_cd(){
		return this.dlco_cd;
	}

	public String getDlco_nm(){
		return this.dlco_nm;
	}

	public String getMake_dt(){
		return this.make_dt;
	}

	public String getItem(){
		return this.item;
	}

	public String getOccr_slip(){
		return this.occr_slip;
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

	public String getSgamt(){
		return this.sgamt;
	}
}

/* 작성시간 : Tue Apr 28 16:45:02 KST 2009 */
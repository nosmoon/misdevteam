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


public class FC_ACCT_2144_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String slip_sub_seq;
	public String tax_slip_no;
	public String budg_cd;
	public String gtiysnm;
	public String dlco_cd;
	public String dlco_nm;
	public String rcpm_kind;
	public String rcpm_amt;
	public String coms;
	public String occr_slip_no;
	public String rcpm_slip_no;
	public String make_dt;

	public FC_ACCT_2144_LCURLISTRecord(){}

	public void setSlip_sub_seq(String slip_sub_seq){
		this.slip_sub_seq = slip_sub_seq;
	}

	public void setTax_slip_no(String tax_slip_no){
		this.tax_slip_no = tax_slip_no;
	}

	public void setBudg_cd(String budg_cd){
		this.budg_cd = budg_cd;
	}

	public void setGtiysnm(String gtiysnm){
		this.gtiysnm = gtiysnm;
	}

	public void setDlco_cd(String dlco_cd){
		this.dlco_cd = dlco_cd;
	}

	public void setDlco_nm(String dlco_nm){
		this.dlco_nm = dlco_nm;
	}

	public void setRcpm_kind(String rcpm_kind){
		this.rcpm_kind = rcpm_kind;
	}

	public void setRcpm_amt(String rcpm_amt){
		this.rcpm_amt = rcpm_amt;
	}

	public void setComs(String coms){
		this.coms = coms;
	}

	public void setOccr_slip_no(String occr_slip_no){
		this.occr_slip_no = occr_slip_no;
	}

	public void setRcpm_slip_no(String rcpm_slip_no){
		this.rcpm_slip_no = rcpm_slip_no;
	}

	public void setMake_dt(String make_dt){
		this.make_dt = make_dt;
	}

	public String getSlip_sub_seq(){
		return this.slip_sub_seq;
	}

	public String getTax_slip_no(){
		return this.tax_slip_no;
	}

	public String getBudg_cd(){
		return this.budg_cd;
	}

	public String getGtiysnm(){
		return this.gtiysnm;
	}

	public String getDlco_cd(){
		return this.dlco_cd;
	}

	public String getDlco_nm(){
		return this.dlco_nm;
	}

	public String getRcpm_kind(){
		return this.rcpm_kind;
	}

	public String getRcpm_amt(){
		return this.rcpm_amt;
	}

	public String getComs(){
		return this.coms;
	}

	public String getOccr_slip_no(){
		return this.occr_slip_no;
	}

	public String getRcpm_slip_no(){
		return this.rcpm_slip_no;
	}

	public String getMake_dt(){
		return this.make_dt;
	}
}

/* 작성시간 : Fri Apr 03 16:44:00 KST 2009 */
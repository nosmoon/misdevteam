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


public class FC_ACCT_2501_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String occr_slip;
	public String occr_slip_clsf;
	public String occr_amt;
	public String extnc_amt;
	public String amt1;
	public String extnc_slip_clsf;
	public String budg_cd;
	public String occr_dlco_nm;
	public String proc_clsf;
	public String medi_cd;
	public String extnc_dlco_nm;

	public FC_ACCT_2501_LCURLISTRecord(){}

	public void setOccr_slip(String occr_slip){
		this.occr_slip = occr_slip;
	}

	public void setOccr_slip_clsf(String occr_slip_clsf){
		this.occr_slip_clsf = occr_slip_clsf;
	}

	public void setOccr_amt(String occr_amt){
		this.occr_amt = occr_amt;
	}

	public void setExtnc_amt(String extnc_amt){
		this.extnc_amt = extnc_amt;
	}

	public void setAmt1(String amt1){
		this.amt1 = amt1;
	}

	public void setExtnc_slip_clsf(String extnc_slip_clsf){
		this.extnc_slip_clsf = extnc_slip_clsf;
	}

	public void setBudg_cd(String budg_cd){
		this.budg_cd = budg_cd;
	}

	public void setOccr_dlco_nm(String occr_dlco_nm){
		this.occr_dlco_nm = occr_dlco_nm;
	}

	public void setProc_clsf(String proc_clsf){
		this.proc_clsf = proc_clsf;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setExtnc_dlco_nm(String extnc_dlco_nm){
		this.extnc_dlco_nm = extnc_dlco_nm;
	}

	public String getOccr_slip(){
		return this.occr_slip;
	}

	public String getOccr_slip_clsf(){
		return this.occr_slip_clsf;
	}

	public String getOccr_amt(){
		return this.occr_amt;
	}

	public String getExtnc_amt(){
		return this.extnc_amt;
	}

	public String getAmt1(){
		return this.amt1;
	}

	public String getExtnc_slip_clsf(){
		return this.extnc_slip_clsf;
	}

	public String getBudg_cd(){
		return this.budg_cd;
	}

	public String getOccr_dlco_nm(){
		return this.occr_dlco_nm;
	}

	public String getProc_clsf(){
		return this.proc_clsf;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getExtnc_dlco_nm(){
		return this.extnc_dlco_nm;
	}
}

/* 작성시간 : Tue Mar 24 15:44:36 KST 2009 */
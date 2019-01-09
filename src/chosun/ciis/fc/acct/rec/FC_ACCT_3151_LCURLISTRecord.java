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


public class FC_ACCT_3151_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String evnt_cd;
	public String evnt_nm;
	public String slip_no;
	public String occr_amt;
	public String rmks;
	public String bal_amt;
	public String extnc_amt;
	public String obj_amt;
	public String obj_budg_cd;
	public String slip_no1;

	public FC_ACCT_3151_LCURLISTRecord(){}

	public void setEvnt_cd(String evnt_cd){
		this.evnt_cd = evnt_cd;
	}

	public void setEvnt_nm(String evnt_nm){
		this.evnt_nm = evnt_nm;
	}

	public void setSlip_no(String slip_no){
		this.slip_no = slip_no;
	}

	public void setOccr_amt(String occr_amt){
		this.occr_amt = occr_amt;
	}

	public void setRmks(String rmks){
		this.rmks = rmks;
	}

	public void setBal_amt(String bal_amt){
		this.bal_amt = bal_amt;
	}

	public void setExtnc_amt(String extnc_amt){
		this.extnc_amt = extnc_amt;
	}

	public void setObj_amt(String obj_amt){
		this.obj_amt = obj_amt;
	}

	public void setObj_budg_cd(String obj_budg_cd){
		this.obj_budg_cd = obj_budg_cd;
	}

	public void setSlip_no1(String slip_no1){
		this.slip_no1 = slip_no1;
	}

	public String getEvnt_cd(){
		return this.evnt_cd;
	}

	public String getEvnt_nm(){
		return this.evnt_nm;
	}

	public String getSlip_no(){
		return this.slip_no;
	}

	public String getOccr_amt(){
		return this.occr_amt;
	}

	public String getRmks(){
		return this.rmks;
	}

	public String getBal_amt(){
		return this.bal_amt;
	}

	public String getExtnc_amt(){
		return this.extnc_amt;
	}

	public String getObj_amt(){
		return this.obj_amt;
	}

	public String getObj_budg_cd(){
		return this.obj_budg_cd;
	}

	public String getSlip_no1(){
		return this.slip_no1;
	}
}

/* 작성시간 : Tue Dec 09 17:23:07 KST 2014 */
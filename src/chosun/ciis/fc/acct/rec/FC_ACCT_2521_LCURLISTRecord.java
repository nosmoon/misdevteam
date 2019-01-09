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


public class FC_ACCT_2521_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String fisc_dt;
	public String slip_no;
	public String rmks1;
	public String rmks2;
	public String dlco_cd;
	public String dlco_nm;
	public String dr_amt;
	public String vat_amt;
	public String crdt_amt;
	public String unit;
	public String qunt;
	public String use_dept_cd;
	public String mang_clsf_cd;
	public String mang_no;
	public String insd_acct_cd;
	public String insd_acct_cd1;
	public String obj_acct_cd;

	public FC_ACCT_2521_LCURLISTRecord(){}

	public void setFisc_dt(String fisc_dt){
		this.fisc_dt = fisc_dt;
	}

	public void setSlip_no(String slip_no){
		this.slip_no = slip_no;
	}

	public void setRmks1(String rmks1){
		this.rmks1 = rmks1;
	}

	public void setRmks2(String rmks2){
		this.rmks2 = rmks2;
	}

	public void setDlco_cd(String dlco_cd){
		this.dlco_cd = dlco_cd;
	}

	public void setDlco_nm(String dlco_nm){
		this.dlco_nm = dlco_nm;
	}

	public void setDr_amt(String dr_amt){
		this.dr_amt = dr_amt;
	}

	public void setVat_amt(String vat_amt){
		this.vat_amt = vat_amt;
	}

	public void setCrdt_amt(String crdt_amt){
		this.crdt_amt = crdt_amt;
	}

	public void setUnit(String unit){
		this.unit = unit;
	}

	public void setQunt(String qunt){
		this.qunt = qunt;
	}

	public void setUse_dept_cd(String use_dept_cd){
		this.use_dept_cd = use_dept_cd;
	}

	public void setMang_clsf_cd(String mang_clsf_cd){
		this.mang_clsf_cd = mang_clsf_cd;
	}

	public void setMang_no(String mang_no){
		this.mang_no = mang_no;
	}

	public void setInsd_acct_cd(String insd_acct_cd){
		this.insd_acct_cd = insd_acct_cd;
	}

	public void setInsd_acct_cd1(String insd_acct_cd1){
		this.insd_acct_cd1 = insd_acct_cd1;
	}

	public void setObj_acct_cd(String obj_acct_cd){
		this.obj_acct_cd = obj_acct_cd;
	}

	public String getFisc_dt(){
		return this.fisc_dt;
	}

	public String getSlip_no(){
		return this.slip_no;
	}

	public String getRmks1(){
		return this.rmks1;
	}

	public String getRmks2(){
		return this.rmks2;
	}

	public String getDlco_cd(){
		return this.dlco_cd;
	}

	public String getDlco_nm(){
		return this.dlco_nm;
	}

	public String getDr_amt(){
		return this.dr_amt;
	}

	public String getVat_amt(){
		return this.vat_amt;
	}

	public String getCrdt_amt(){
		return this.crdt_amt;
	}

	public String getUnit(){
		return this.unit;
	}

	public String getQunt(){
		return this.qunt;
	}

	public String getUse_dept_cd(){
		return this.use_dept_cd;
	}

	public String getMang_clsf_cd(){
		return this.mang_clsf_cd;
	}

	public String getMang_no(){
		return this.mang_no;
	}

	public String getInsd_acct_cd(){
		return this.insd_acct_cd;
	}

	public String getInsd_acct_cd1(){
		return this.insd_acct_cd1;
	}

	public String getObj_acct_cd(){
		return this.obj_acct_cd;
	}
}

/* 작성시간 : Mon Apr 13 15:38:11 KST 2009 */
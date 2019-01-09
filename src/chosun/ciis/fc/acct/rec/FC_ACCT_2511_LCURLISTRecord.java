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


public class FC_ACCT_2511_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String fisc_dt;
	public String slip_no;
	public String rmks;
	public String dr_amt;
	public String crdt_amt;
	public String mang_clsf_cd;
	public String comp_dt;
	public String mang_no;
	public String dlco_clsf_cd;
	public String dlco_cd;
	public String dlco_nm;
	public String boks_dlco_nm;
	public String incmg_emp_no;
	public String clam_dept_cd;

	public FC_ACCT_2511_LCURLISTRecord(){}

	public void setFisc_dt(String fisc_dt){
		this.fisc_dt = fisc_dt;
	}

	public void setSlip_no(String slip_no){
		this.slip_no = slip_no;
	}

	public void setRmks(String rmks){
		this.rmks = rmks;
	}

	public void setDr_amt(String dr_amt){
		this.dr_amt = dr_amt;
	}

	public void setCrdt_amt(String crdt_amt){
		this.crdt_amt = crdt_amt;
	}

	public void setMang_clsf_cd(String mang_clsf_cd){
		this.mang_clsf_cd = mang_clsf_cd;
	}

	public void setComp_dt(String comp_dt){
		this.comp_dt = comp_dt;
	}

	public void setMang_no(String mang_no){
		this.mang_no = mang_no;
	}

	public void setDlco_clsf_cd(String dlco_clsf_cd){
		this.dlco_clsf_cd = dlco_clsf_cd;
	}

	public void setDlco_cd(String dlco_cd){
		this.dlco_cd = dlco_cd;
	}

	public void setDlco_nm(String dlco_nm){
		this.dlco_nm = dlco_nm;
	}

	public void setBoks_dlco_nm(String boks_dlco_nm){
		this.boks_dlco_nm = boks_dlco_nm;
	}

	public void setIncmg_emp_no(String incmg_emp_no){
		this.incmg_emp_no = incmg_emp_no;
	}

	public void setClam_dept_cd(String clam_dept_cd){
		this.clam_dept_cd = clam_dept_cd;
	}

	public String getFisc_dt(){
		return this.fisc_dt;
	}

	public String getSlip_no(){
		return this.slip_no;
	}

	public String getRmks(){
		return this.rmks;
	}

	public String getDr_amt(){
		return this.dr_amt;
	}

	public String getCrdt_amt(){
		return this.crdt_amt;
	}

	public String getMang_clsf_cd(){
		return this.mang_clsf_cd;
	}

	public String getComp_dt(){
		return this.comp_dt;
	}

	public String getMang_no(){
		return this.mang_no;
	}

	public String getDlco_clsf_cd(){
		return this.dlco_clsf_cd;
	}

	public String getDlco_cd(){
		return this.dlco_cd;
	}

	public String getDlco_nm(){
		return this.dlco_nm;
	}

	public String getBoks_dlco_nm(){
		return this.boks_dlco_nm;
	}

	public String getIncmg_emp_no(){
		return this.incmg_emp_no;
	}

	public String getClam_dept_cd(){
		return this.clam_dept_cd;
	}
}

/* 작성시간 : Wed Feb 11 16:20:15 KST 2009 */
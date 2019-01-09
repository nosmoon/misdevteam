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


public class FC_ACCT_2031_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String slip_occr_dt;
	public String slip_clsf_cd;
	public String slip_seq;
	public String budg_yymm;
	public String clam_dept_cd;
	public String chrg_emp_no;
	public String chrg_emp_no_nm;
	public String rmks;
	public String clam_amt;
	public String hj_incmg_emp_no;
	public String hj_incmg_emp_no_nm;
	public String hj_slip_aprv_yn;
	public String slip_arow_no;
	public String emp_no;
	public String emp_no_nm;
	public String emp_dept_cd_nm;
	public String dest;
	public String amt;

	public FC_ACCT_2031_LCURLISTRecord(){}

	public void setSlip_occr_dt(String slip_occr_dt){
		this.slip_occr_dt = slip_occr_dt;
	}

	public void setSlip_clsf_cd(String slip_clsf_cd){
		this.slip_clsf_cd = slip_clsf_cd;
	}

	public void setSlip_seq(String slip_seq){
		this.slip_seq = slip_seq;
	}

	public void setBudg_yymm(String budg_yymm){
		this.budg_yymm = budg_yymm;
	}

	public void setClam_dept_cd(String clam_dept_cd){
		this.clam_dept_cd = clam_dept_cd;
	}

	public void setChrg_emp_no(String chrg_emp_no){
		this.chrg_emp_no = chrg_emp_no;
	}

	public void setChrg_emp_no_nm(String chrg_emp_no_nm){
		this.chrg_emp_no_nm = chrg_emp_no_nm;
	}

	public void setRmks(String rmks){
		this.rmks = rmks;
	}

	public void setClam_amt(String clam_amt){
		this.clam_amt = clam_amt;
	}

	public void setHj_incmg_emp_no(String hj_incmg_emp_no){
		this.hj_incmg_emp_no = hj_incmg_emp_no;
	}

	public void setHj_incmg_emp_no_nm(String hj_incmg_emp_no_nm){
		this.hj_incmg_emp_no_nm = hj_incmg_emp_no_nm;
	}

	public void setHj_slip_aprv_yn(String hj_slip_aprv_yn){
		this.hj_slip_aprv_yn = hj_slip_aprv_yn;
	}

	public void setSlip_arow_no(String slip_arow_no){
		this.slip_arow_no = slip_arow_no;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setEmp_no_nm(String emp_no_nm){
		this.emp_no_nm = emp_no_nm;
	}

	public void setEmp_dept_cd_nm(String emp_dept_cd_nm){
		this.emp_dept_cd_nm = emp_dept_cd_nm;
	}

	public void setDest(String dest){
		this.dest = dest;
	}

	public void setAmt(String amt){
		this.amt = amt;
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

	public String getBudg_yymm(){
		return this.budg_yymm;
	}

	public String getClam_dept_cd(){
		return this.clam_dept_cd;
	}

	public String getChrg_emp_no(){
		return this.chrg_emp_no;
	}

	public String getChrg_emp_no_nm(){
		return this.chrg_emp_no_nm;
	}

	public String getRmks(){
		return this.rmks;
	}

	public String getClam_amt(){
		return this.clam_amt;
	}

	public String getHj_incmg_emp_no(){
		return this.hj_incmg_emp_no;
	}

	public String getHj_incmg_emp_no_nm(){
		return this.hj_incmg_emp_no_nm;
	}

	public String getHj_slip_aprv_yn(){
		return this.hj_slip_aprv_yn;
	}

	public String getSlip_arow_no(){
		return this.slip_arow_no;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getEmp_no_nm(){
		return this.emp_no_nm;
	}

	public String getEmp_dept_cd_nm(){
		return this.emp_dept_cd_nm;
	}

	public String getDest(){
		return this.dest;
	}

	public String getAmt(){
		return this.amt;
	}
}

/* 작성시간 : Mon Jul 06 14:32:44 KST 2009 */
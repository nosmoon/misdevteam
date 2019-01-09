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


public class FC_ACCT_3256_LSLIP_LISTRecord extends java.lang.Object implements java.io.Serializable{

	public String slip_occr_dt;
	public String slip_seq;
	public String slip_sub_seq;
	public String rmks1;
	public String slip_clsf_cd;
	public String slip_no;
	public String sum_dr_amt;
	public String sum_crdt_amt;
	public String diff_amt;
	public String clam_dept_cd;
	public String clam_dept_nm;
	public String incmg_emp_no;
	public String incmg_emp_nm;
	public String fisc_dt;
	public String incmg_dt;
	public String setoff_slip_clsf_cd;
	public String fisc_seq;
	public String fisc_no;
	public String reso_amt;
	public String slip_aprv_yn;

	public FC_ACCT_3256_LSLIP_LISTRecord(){}

	public void setSlip_occr_dt(String slip_occr_dt){
		this.slip_occr_dt = slip_occr_dt;
	}

	public void setSlip_seq(String slip_seq){
		this.slip_seq = slip_seq;
	}

	public void setSlip_sub_seq(String slip_sub_seq){
		this.slip_sub_seq = slip_sub_seq;
	}

	public void setRmks1(String rmks1){
		this.rmks1 = rmks1;
	}

	public void setSlip_clsf_cd(String slip_clsf_cd){
		this.slip_clsf_cd = slip_clsf_cd;
	}

	public void setSlip_no(String slip_no){
		this.slip_no = slip_no;
	}

	public void setSum_dr_amt(String sum_dr_amt){
		this.sum_dr_amt = sum_dr_amt;
	}

	public void setSum_crdt_amt(String sum_crdt_amt){
		this.sum_crdt_amt = sum_crdt_amt;
	}

	public void setDiff_amt(String diff_amt){
		this.diff_amt = diff_amt;
	}

	public void setClam_dept_cd(String clam_dept_cd){
		this.clam_dept_cd = clam_dept_cd;
	}

	public void setClam_dept_nm(String clam_dept_nm){
		this.clam_dept_nm = clam_dept_nm;
	}

	public void setIncmg_emp_no(String incmg_emp_no){
		this.incmg_emp_no = incmg_emp_no;
	}

	public void setIncmg_emp_nm(String incmg_emp_nm){
		this.incmg_emp_nm = incmg_emp_nm;
	}

	public void setFisc_dt(String fisc_dt){
		this.fisc_dt = fisc_dt;
	}

	public void setIncmg_dt(String incmg_dt){
		this.incmg_dt = incmg_dt;
	}

	public void setSetoff_slip_clsf_cd(String setoff_slip_clsf_cd){
		this.setoff_slip_clsf_cd = setoff_slip_clsf_cd;
	}

	public void setFisc_seq(String fisc_seq){
		this.fisc_seq = fisc_seq;
	}

	public void setFisc_no(String fisc_no){
		this.fisc_no = fisc_no;
	}

	public void setReso_amt(String reso_amt){
		this.reso_amt = reso_amt;
	}

	public void setSlip_aprv_yn(String slip_aprv_yn){
		this.slip_aprv_yn = slip_aprv_yn;
	}

	public String getSlip_occr_dt(){
		return this.slip_occr_dt;
	}

	public String getSlip_seq(){
		return this.slip_seq;
	}

	public String getSlip_sub_seq(){
		return this.slip_sub_seq;
	}

	public String getRmks1(){
		return this.rmks1;
	}

	public String getSlip_clsf_cd(){
		return this.slip_clsf_cd;
	}

	public String getSlip_no(){
		return this.slip_no;
	}

	public String getSum_dr_amt(){
		return this.sum_dr_amt;
	}

	public String getSum_crdt_amt(){
		return this.sum_crdt_amt;
	}

	public String getDiff_amt(){
		return this.diff_amt;
	}

	public String getClam_dept_cd(){
		return this.clam_dept_cd;
	}

	public String getClam_dept_nm(){
		return this.clam_dept_nm;
	}

	public String getIncmg_emp_no(){
		return this.incmg_emp_no;
	}

	public String getIncmg_emp_nm(){
		return this.incmg_emp_nm;
	}

	public String getFisc_dt(){
		return this.fisc_dt;
	}

	public String getIncmg_dt(){
		return this.incmg_dt;
	}

	public String getSetoff_slip_clsf_cd(){
		return this.setoff_slip_clsf_cd;
	}

	public String getFisc_seq(){
		return this.fisc_seq;
	}

	public String getFisc_no(){
		return this.fisc_no;
	}

	public String getReso_amt(){
		return this.reso_amt;
	}

	public String getSlip_aprv_yn(){
		return this.slip_aprv_yn;
	}
}

/* 작성시간 : Thu Aug 21 16:44:53 KST 2014 */
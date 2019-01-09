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


package chosun.ciis.hd.ddemp.rec;

import java.sql.*;
import chosun.ciis.hd.ddemp.dm.*;
import chosun.ciis.hd.ddemp.ds.*;

/**
 * 
 */


public class HD_DDEMP_3000_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String duty_yymm;
	public String prn;
	public String flnm;
	public String studt_wk_yn;
	public String emp_insr_dduc_yn;
	public String proc_nm;
	public String nm_korn;
	public String pay_amt;
	public String dept_nm;
	public String hd_decid_pers;
	public String hd_decid_dt_tm;
	public String clos_yn;
	public String all_insr_dduc_yn;

	public HD_DDEMP_3000_LCURLISTRecord(){}

	public void setDuty_yymm(String duty_yymm){
		this.duty_yymm = duty_yymm;
	}

	public void setPrn(String prn){
		this.prn = prn;
	}

	public void setFlnm(String flnm){
		this.flnm = flnm;
	}

	public void setStudt_wk_yn(String studt_wk_yn){
		this.studt_wk_yn = studt_wk_yn;
	}

	public void setEmp_insr_dduc_yn(String emp_insr_dduc_yn){
		this.emp_insr_dduc_yn = emp_insr_dduc_yn;
	}

	public void setProc_nm(String proc_nm){
		this.proc_nm = proc_nm;
	}

	public void setNm_korn(String nm_korn){
		this.nm_korn = nm_korn;
	}

	public void setPay_amt(String pay_amt){
		this.pay_amt = pay_amt;
	}

	public void setDept_nm(String dept_nm){
		this.dept_nm = dept_nm;
	}

	public void setHd_decid_pers(String hd_decid_pers){
		this.hd_decid_pers = hd_decid_pers;
	}

	public void setHd_decid_dt_tm(String hd_decid_dt_tm){
		this.hd_decid_dt_tm = hd_decid_dt_tm;
	}

	public void setClos_yn(String clos_yn){
		this.clos_yn = clos_yn;
	}

	public void setAll_insr_dduc_yn(String all_insr_dduc_yn){
		this.all_insr_dduc_yn = all_insr_dduc_yn;
	}

	public String getDuty_yymm(){
		return this.duty_yymm;
	}

	public String getPrn(){
		return this.prn;
	}

	public String getFlnm(){
		return this.flnm;
	}

	public String getStudt_wk_yn(){
		return this.studt_wk_yn;
	}

	public String getEmp_insr_dduc_yn(){
		return this.emp_insr_dduc_yn;
	}

	public String getProc_nm(){
		return this.proc_nm;
	}

	public String getNm_korn(){
		return this.nm_korn;
	}

	public String getPay_amt(){
		return this.pay_amt;
	}

	public String getDept_nm(){
		return this.dept_nm;
	}

	public String getHd_decid_pers(){
		return this.hd_decid_pers;
	}

	public String getHd_decid_dt_tm(){
		return this.hd_decid_dt_tm;
	}

	public String getClos_yn(){
		return this.clos_yn;
	}

	public String getAll_insr_dduc_yn(){
		return this.all_insr_dduc_yn;
	}
}

/* 작성시간 : Fri Dec 01 18:07:12 KST 2017 */
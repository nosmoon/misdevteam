/***************************************************************************************************
* 파일명		: 
* 기능		:
* 작성일자	: 
* 작성자		: 
***************************************************************************************************/
/***************************************************************************************************
* 수정내역	: 
* 수정자		:   
* 수정일자	: 
* 백업		: 
***************************************************************************************************/


package chosun.ciis.hd.dwnwrk.rec;

import java.sql.*;
import chosun.ciis.hd.dwnwrk.dm.*;
import chosun.ciis.hd.dwnwrk.ds.*;

/**
 *
 */

public class HD_DWNWRK_1300_LCURLIST1Record extends java.lang.Object implements java.io.Serializable{

	public String s_cmpy_cd;
	public String s_emp_no;
	public String s_flnm;
	public String s_dept_cd;
	public String s_total_alon_amt;
	public String s_pay_dt;
	public String s_duty_dds;
	public String s_total_amt;
	public String s_total_peple;
	public String actu_slip_no;
	public String slip_occr_dt;
	public String slip_clsf_cd;
	public String slip_seq;
	public String incmg_pres;
	public String incmg_pres_ipadd;
	public String proc_stat;

	public HD_DWNWRK_1300_LCURLIST1Record(){}

	public void setS_cmpy_cd(String s_cmpy_cd){
		this.s_cmpy_cd = s_cmpy_cd;
	}

	public void setS_emp_no(String s_emp_no){
		this.s_emp_no = s_emp_no;
	}

	public void setS_flnm(String s_flnm){
		this.s_flnm = s_flnm;
	}

	public void setS_dept_cd(String s_dept_cd){
		this.s_dept_cd = s_dept_cd;
	}

	public void setS_total_alon_amt(String s_total_alon_amt){
		this.s_total_alon_amt = s_total_alon_amt;
	}

	public void setS_pay_dt(String s_pay_dt){
		this.s_pay_dt = s_pay_dt;
	}

	public void setS_duty_dds(String s_duty_dds){
		this.s_duty_dds = s_duty_dds;
	}

	public void setS_total_amt(String s_total_amt){
		this.s_total_amt = s_total_amt;
	}

	public void setS_total_peple(String s_total_peple){
		this.s_total_peple = s_total_peple;
	}

	public void setActu_slip_no(String actu_slip_no){
		this.actu_slip_no = actu_slip_no;
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

	public void setIncmg_pres(String incmg_pres){
		this.incmg_pres = incmg_pres;
	}

	public void setIncmg_pres_ipadd(String incmg_pres_ipadd){
		this.incmg_pres_ipadd = incmg_pres_ipadd;
	}

	public void setProc_stat(String proc_stat){
		this.proc_stat = proc_stat;
	}

	public String getS_cmpy_cd(){
		return this.s_cmpy_cd;
	}

	public String getS_emp_no(){
		return this.s_emp_no;
	}

	public String getS_flnm(){
		return this.s_flnm;
	}

	public String getS_dept_cd(){
		return this.s_dept_cd;
	}

	public String getS_total_alon_amt(){
		return this.s_total_alon_amt;
	}

	public String getS_pay_dt(){
		return this.s_pay_dt;
	}

	public String getS_duty_dds(){
		return this.s_duty_dds;
	}

	public String getS_total_amt(){
		return this.s_total_amt;
	}

	public String getS_total_peple(){
		return this.s_total_peple;
	}

	public String getActu_slip_no(){
		return this.actu_slip_no;
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

	public String getIncmg_pres(){
		return this.incmg_pres;
	}

	public String getIncmg_pres_ipadd(){
		return this.incmg_pres_ipadd;
	}

	public String getProc_stat(){
		return this.proc_stat;
	}
}

/* 작성시간 : Tue Jul 07 17:12:39 KST 2009 */
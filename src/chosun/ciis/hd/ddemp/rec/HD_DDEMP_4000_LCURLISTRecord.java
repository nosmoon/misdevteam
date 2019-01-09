

package chosun.ciis.hd.ddemp.rec;

import java.sql.*;
import chosun.ciis.hd.ddemp.dm.*;
import chosun.ciis.hd.ddemp.ds.*;

/**
 * 
 */


public class HD_DDEMP_4000_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String duty_yymm;
	public String mang_no;
	public String flnm;
	public String prn;
	public String ptph_no;
	public String octgr_cd;
	public String octgr_cd_nm;
	public String lve_job_resn_cd;
	public String lve_job_resn_cd_nm;
	public String duty_dds;
	public String pay_amt;
	public String dd_amt;
	public String time_amt;
	public String incm_tax;
	public String res_tax;
	public String fisc_dt;
	public String emp_insr_fee;
	public String hlth_insr_fee;
	public String np_fee;
	public String budg_cd;
	public String budg_nm;
	public String rmks;
	public String actu_slip_no;
	public String proc_stat;
	public String proc_stat_nm;
	public String use_dept_cd;
	public String use_dept_nm;

	public HD_DDEMP_4000_LCURLISTRecord(){}

	public void setDuty_yymm(String duty_yymm){
		this.duty_yymm = duty_yymm;
	}

	public void setMang_no(String mang_no){
		this.mang_no = mang_no;
	}

	public void setFlnm(String flnm){
		this.flnm = flnm;
	}

	public void setPrn(String prn){
		this.prn = prn;
	}

	public void setPtph_no(String ptph_no){
		this.ptph_no = ptph_no;
	}

	public void setOctgr_cd(String octgr_cd){
		this.octgr_cd = octgr_cd;
	}

	public void setOctgr_cd_nm(String octgr_cd_nm){
		this.octgr_cd_nm = octgr_cd_nm;
	}

	public void setLve_job_resn_cd(String lve_job_resn_cd){
		this.lve_job_resn_cd = lve_job_resn_cd;
	}

	public void setLve_job_resn_cd_nm(String lve_job_resn_cd_nm){
		this.lve_job_resn_cd_nm = lve_job_resn_cd_nm;
	}

	public void setDuty_dds(String duty_dds){
		this.duty_dds = duty_dds;
	}

	public void setPay_amt(String pay_amt){
		this.pay_amt = pay_amt;
	}

	public void setDd_amt(String dd_amt){
		this.dd_amt = dd_amt;
	}

	public void setTime_amt(String time_amt){
		this.time_amt = time_amt;
	}

	public void setIncm_tax(String incm_tax){
		this.incm_tax = incm_tax;
	}

	public void setRes_tax(String res_tax){
		this.res_tax = res_tax;
	}

	public void setFisc_dt(String fisc_dt){
		this.fisc_dt = fisc_dt;
	}

	public void setEmp_insr_fee(String emp_insr_fee){
		this.emp_insr_fee = emp_insr_fee;
	}

	public void setHlth_insr_fee(String hlth_insr_fee){
		this.hlth_insr_fee = hlth_insr_fee;
	}

	public void setNp_fee(String np_fee){
		this.np_fee = np_fee;
	}

	public void setBudg_cd(String budg_cd){
		this.budg_cd = budg_cd;
	}

	public void setBudg_nm(String budg_nm){
		this.budg_nm = budg_nm;
	}

	public void setRmks(String rmks){
		this.rmks = rmks;
	}

	public void setActu_slip_no(String actu_slip_no){
		this.actu_slip_no = actu_slip_no;
	}

	public void setProc_stat(String proc_stat){
		this.proc_stat = proc_stat;
	}

	public void setProc_stat_nm(String proc_stat_nm){
		this.proc_stat_nm = proc_stat_nm;
	}

	public void setUse_dept_cd(String use_dept_cd){
		this.use_dept_cd = use_dept_cd;
	}

	public void setUse_dept_nm(String use_dept_nm){
		this.use_dept_nm = use_dept_nm;
	}

	public String getDuty_yymm(){
		return this.duty_yymm;
	}

	public String getMang_no(){
		return this.mang_no;
	}

	public String getFlnm(){
		return this.flnm;
	}

	public String getPrn(){
		return this.prn;
	}

	public String getPtph_no(){
		return this.ptph_no;
	}

	public String getOctgr_cd(){
		return this.octgr_cd;
	}

	public String getOctgr_cd_nm(){
		return this.octgr_cd_nm;
	}

	public String getLve_job_resn_cd(){
		return this.lve_job_resn_cd;
	}

	public String getLve_job_resn_cd_nm(){
		return this.lve_job_resn_cd_nm;
	}

	public String getDuty_dds(){
		return this.duty_dds;
	}

	public String getPay_amt(){
		return this.pay_amt;
	}

	public String getDd_amt(){
		return this.dd_amt;
	}

	public String getTime_amt(){
		return this.time_amt;
	}

	public String getIncm_tax(){
		return this.incm_tax;
	}

	public String getRes_tax(){
		return this.res_tax;
	}

	public String getFisc_dt(){
		return this.fisc_dt;
	}

	public String getEmp_insr_fee(){
		return this.emp_insr_fee;
	}

	public String getHlth_insr_fee(){
		return this.hlth_insr_fee;
	}

	public String getNp_fee(){
		return this.np_fee;
	}

	public String getBudg_cd(){
		return this.budg_cd;
	}

	public String getBudg_nm(){
		return this.budg_nm;
	}

	public String getRmks(){
		return this.rmks;
	}

	public String getActu_slip_no(){
		return this.actu_slip_no;
	}

	public String getProc_stat(){
		return this.proc_stat;
	}

	public String getProc_stat_nm(){
		return this.proc_stat_nm;
	}

	public String getUse_dept_cd(){
		return this.use_dept_cd;
	}

	public String getUse_dept_nm(){
		return this.use_dept_nm;
	}
}

/* 작성시간 : Tue Feb 08 19:38:00 KST 2011 */
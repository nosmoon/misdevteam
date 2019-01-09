

package chosun.ciis.hd.dwnwrk.rec;

import java.sql.*;
import chosun.ciis.hd.dwnwrk.dm.*;
import chosun.ciis.hd.dwnwrk.ds.*;

/**
 * 
 */


public class HD_DWNWRK_1103_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String dept_cd;
	public String dept_nm;
	public String emp_no;
	public String nm_korn;
	public String posi_nm;
	public String duty_dt;
	public String erl_prsnt_bgn_tm;
	public String erl_prsnt_end_tm;
	public String erl_prsnt_duty_tm;
	public String prsnt_tm;
	public String finish_tm;
	public String duty_resn;
	public String proc_stat;
	public String proc_stat_nm;
	public String finish_dd_clsf;
	public String finish_dd_clsf_nm;
	public String slip_proc_mang_dt;
	public String slip_proc_mang_seq;

	public HD_DWNWRK_1103_LCURLISTRecord(){}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setDept_nm(String dept_nm){
		this.dept_nm = dept_nm;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setNm_korn(String nm_korn){
		this.nm_korn = nm_korn;
	}

	public void setPosi_nm(String posi_nm){
		this.posi_nm = posi_nm;
	}

	public void setDuty_dt(String duty_dt){
		this.duty_dt = duty_dt;
	}

	public void setErl_prsnt_bgn_tm(String erl_prsnt_bgn_tm){
		this.erl_prsnt_bgn_tm = erl_prsnt_bgn_tm;
	}

	public void setErl_prsnt_end_tm(String erl_prsnt_end_tm){
		this.erl_prsnt_end_tm = erl_prsnt_end_tm;
	}

	public void setErl_prsnt_duty_tm(String erl_prsnt_duty_tm){
		this.erl_prsnt_duty_tm = erl_prsnt_duty_tm;
	}

	public void setPrsnt_tm(String prsnt_tm){
		this.prsnt_tm = prsnt_tm;
	}

	public void setFinish_tm(String finish_tm){
		this.finish_tm = finish_tm;
	}

	public void setDuty_resn(String duty_resn){
		this.duty_resn = duty_resn;
	}

	public void setProc_stat(String proc_stat){
		this.proc_stat = proc_stat;
	}

	public void setProc_stat_nm(String proc_stat_nm){
		this.proc_stat_nm = proc_stat_nm;
	}

	public void setFinish_dd_clsf(String finish_dd_clsf){
		this.finish_dd_clsf = finish_dd_clsf;
	}

	public void setFinish_dd_clsf_nm(String finish_dd_clsf_nm){
		this.finish_dd_clsf_nm = finish_dd_clsf_nm;
	}

	public void setSlip_proc_mang_dt(String slip_proc_mang_dt){
		this.slip_proc_mang_dt = slip_proc_mang_dt;
	}

	public void setSlip_proc_mang_seq(String slip_proc_mang_seq){
		this.slip_proc_mang_seq = slip_proc_mang_seq;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getDept_nm(){
		return this.dept_nm;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getNm_korn(){
		return this.nm_korn;
	}

	public String getPosi_nm(){
		return this.posi_nm;
	}

	public String getDuty_dt(){
		return this.duty_dt;
	}

	public String getErl_prsnt_bgn_tm(){
		return this.erl_prsnt_bgn_tm;
	}

	public String getErl_prsnt_end_tm(){
		return this.erl_prsnt_end_tm;
	}

	public String getErl_prsnt_duty_tm(){
		return this.erl_prsnt_duty_tm;
	}

	public String getPrsnt_tm(){
		return this.prsnt_tm;
	}

	public String getFinish_tm(){
		return this.finish_tm;
	}

	public String getDuty_resn(){
		return this.duty_resn;
	}

	public String getProc_stat(){
		return this.proc_stat;
	}

	public String getProc_stat_nm(){
		return this.proc_stat_nm;
	}

	public String getFinish_dd_clsf(){
		return this.finish_dd_clsf;
	}

	public String getFinish_dd_clsf_nm(){
		return this.finish_dd_clsf_nm;
	}

	public String getSlip_proc_mang_dt(){
		return this.slip_proc_mang_dt;
	}

	public String getSlip_proc_mang_seq(){
		return this.slip_proc_mang_seq;
	}
}

/* 작성시간 : Mon Apr 26 14:26:26 KST 2010 */
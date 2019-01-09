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


package chosun.ciis.hd.duty.rec;

import java.sql.*;
import chosun.ciis.hd.duty.dm.*;
import chosun.ciis.hd.duty.ds.*;

/**
 * 
 */


public class HD_DUTY_1109_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String emp_no;
	public String duty_dt;
	public String prsnt_tm;
	public String finish_tm;
	public String finish_dd_clsf;
	public String hody_clsf;
	public String hody_clsf_nm;
	public String duty_proc_stat;
	public String duty_proc_stat_nm;
	public String vaca_proc_stat;
	public String vaca_proc_stat_nm;
	public String alvc_plan_dt;
	public String alvc_plan_resn;
	public String addm_rest_minute;
	public String duty_clsf;

	public HD_DUTY_1109_LCURLISTRecord(){}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setDuty_dt(String duty_dt){
		this.duty_dt = duty_dt;
	}

	public void setPrsnt_tm(String prsnt_tm){
		this.prsnt_tm = prsnt_tm;
	}

	public void setFinish_tm(String finish_tm){
		this.finish_tm = finish_tm;
	}

	public void setFinish_dd_clsf(String finish_dd_clsf){
		this.finish_dd_clsf = finish_dd_clsf;
	}

	public void setHody_clsf(String hody_clsf){
		this.hody_clsf = hody_clsf;
	}

	public void setHody_clsf_nm(String hody_clsf_nm){
		this.hody_clsf_nm = hody_clsf_nm;
	}

	public void setDuty_proc_stat(String duty_proc_stat){
		this.duty_proc_stat = duty_proc_stat;
	}

	public void setDuty_proc_stat_nm(String duty_proc_stat_nm){
		this.duty_proc_stat_nm = duty_proc_stat_nm;
	}

	public void setVaca_proc_stat(String vaca_proc_stat){
		this.vaca_proc_stat = vaca_proc_stat;
	}

	public void setVaca_proc_stat_nm(String vaca_proc_stat_nm){
		this.vaca_proc_stat_nm = vaca_proc_stat_nm;
	}

	public void setAlvc_plan_dt(String alvc_plan_dt){
		this.alvc_plan_dt = alvc_plan_dt;
	}

	public void setAlvc_plan_resn(String alvc_plan_resn){
		this.alvc_plan_resn = alvc_plan_resn;
	}

	public void setAddm_rest_minute(String addm_rest_minute){
		this.addm_rest_minute = addm_rest_minute;
	}

	public void setDuty_clsf(String duty_clsf){
		this.duty_clsf = duty_clsf;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getDuty_dt(){
		return this.duty_dt;
	}

	public String getPrsnt_tm(){
		return this.prsnt_tm;
	}

	public String getFinish_tm(){
		return this.finish_tm;
	}

	public String getFinish_dd_clsf(){
		return this.finish_dd_clsf;
	}

	public String getHody_clsf(){
		return this.hody_clsf;
	}

	public String getHody_clsf_nm(){
		return this.hody_clsf_nm;
	}

	public String getDuty_proc_stat(){
		return this.duty_proc_stat;
	}

	public String getDuty_proc_stat_nm(){
		return this.duty_proc_stat_nm;
	}

	public String getVaca_proc_stat(){
		return this.vaca_proc_stat;
	}

	public String getVaca_proc_stat_nm(){
		return this.vaca_proc_stat_nm;
	}

	public String getAlvc_plan_dt(){
		return this.alvc_plan_dt;
	}

	public String getAlvc_plan_resn(){
		return this.alvc_plan_resn;
	}

	public String getAddm_rest_minute(){
		return this.addm_rest_minute;
	}

	public String getDuty_clsf(){
		return this.duty_clsf;
	}
}

/* 작성시간 : Mon Jul 02 17:07:30 KST 2018 */
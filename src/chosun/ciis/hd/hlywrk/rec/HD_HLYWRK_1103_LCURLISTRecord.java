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


package chosun.ciis.hd.hlywrk.rec;

import java.sql.*;
import chosun.ciis.hd.hlywrk.dm.*;
import chosun.ciis.hd.hlywrk.ds.*;

/**
 * 
 */


public class HD_HLYWRK_1103_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cmpy_cd;
	public String duty_dt;
	public String emp_no;
	public String nm_korn;
	public String dept_cd;
	public String dept_nm;
	public String posi_nm;
	public String obj_clsf;
	public String obj_clsf_nm;
	public String hody_clsf;
	public String hody_clsf_nm;
	public String prsnt_tm;
	public String finish_dd_clsf;
	public String finish_dd_clsf_nm;
	public String finish_tm;
	public String tot_duty_tm;
	public String alvc_use_dt;
	public String alvc_use_yn;
	public String alvc_plan_dt;
	public String proc_stat;
	public String proc_stat_nm;
	public String paidhody_ck;

	public HD_HLYWRK_1103_LCURLISTRecord(){}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setDuty_dt(String duty_dt){
		this.duty_dt = duty_dt;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setNm_korn(String nm_korn){
		this.nm_korn = nm_korn;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setDept_nm(String dept_nm){
		this.dept_nm = dept_nm;
	}

	public void setPosi_nm(String posi_nm){
		this.posi_nm = posi_nm;
	}

	public void setObj_clsf(String obj_clsf){
		this.obj_clsf = obj_clsf;
	}

	public void setObj_clsf_nm(String obj_clsf_nm){
		this.obj_clsf_nm = obj_clsf_nm;
	}

	public void setHody_clsf(String hody_clsf){
		this.hody_clsf = hody_clsf;
	}

	public void setHody_clsf_nm(String hody_clsf_nm){
		this.hody_clsf_nm = hody_clsf_nm;
	}

	public void setPrsnt_tm(String prsnt_tm){
		this.prsnt_tm = prsnt_tm;
	}

	public void setFinish_dd_clsf(String finish_dd_clsf){
		this.finish_dd_clsf = finish_dd_clsf;
	}

	public void setFinish_dd_clsf_nm(String finish_dd_clsf_nm){
		this.finish_dd_clsf_nm = finish_dd_clsf_nm;
	}

	public void setFinish_tm(String finish_tm){
		this.finish_tm = finish_tm;
	}

	public void setTot_duty_tm(String tot_duty_tm){
		this.tot_duty_tm = tot_duty_tm;
	}

	public void setAlvc_use_dt(String alvc_use_dt){
		this.alvc_use_dt = alvc_use_dt;
	}

	public void setAlvc_use_yn(String alvc_use_yn){
		this.alvc_use_yn = alvc_use_yn;
	}

	public void setAlvc_plan_dt(String alvc_plan_dt){
		this.alvc_plan_dt = alvc_plan_dt;
	}

	public void setProc_stat(String proc_stat){
		this.proc_stat = proc_stat;
	}

	public void setProc_stat_nm(String proc_stat_nm){
		this.proc_stat_nm = proc_stat_nm;
	}

	public void setPaidhody_ck(String paidhody_ck){
		this.paidhody_ck = paidhody_ck;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getDuty_dt(){
		return this.duty_dt;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getNm_korn(){
		return this.nm_korn;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getDept_nm(){
		return this.dept_nm;
	}

	public String getPosi_nm(){
		return this.posi_nm;
	}

	public String getObj_clsf(){
		return this.obj_clsf;
	}

	public String getObj_clsf_nm(){
		return this.obj_clsf_nm;
	}

	public String getHody_clsf(){
		return this.hody_clsf;
	}

	public String getHody_clsf_nm(){
		return this.hody_clsf_nm;
	}

	public String getPrsnt_tm(){
		return this.prsnt_tm;
	}

	public String getFinish_dd_clsf(){
		return this.finish_dd_clsf;
	}

	public String getFinish_dd_clsf_nm(){
		return this.finish_dd_clsf_nm;
	}

	public String getFinish_tm(){
		return this.finish_tm;
	}

	public String getTot_duty_tm(){
		return this.tot_duty_tm;
	}

	public String getAlvc_use_dt(){
		return this.alvc_use_dt;
	}

	public String getAlvc_use_yn(){
		return this.alvc_use_yn;
	}

	public String getAlvc_plan_dt(){
		return this.alvc_plan_dt;
	}

	public String getProc_stat(){
		return this.proc_stat;
	}

	public String getProc_stat_nm(){
		return this.proc_stat_nm;
	}

	public String getPaidhody_ck(){
		return this.paidhody_ck;
	}
}

/* 작성시간 : Fri Nov 02 11:02:26 KST 2012 */
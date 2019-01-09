/***************************************************************************************************
* 파일명 : .java
* 기능 : 판매시스템
* 작성일자 : 2009-02-18
* 작성자 : 배창희
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.co.work.rec;

import java.sql.*;
import chosun.ciis.co.work.dm.*;
import chosun.ciis.co.work.ds.*;

/**
 * 
 */


public class CO_WORK_1010_LJOBLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cmpy_cd;
	public String job_clsf;
	public String cd_clsf;
	public String cd;
	public String sub_cd;
	public String exec_no;
	public String cd_clsf_nm;
	public String cd_nm;
	public String basi_dt;
	public String mang_frdt;
	public String mang_todt;
	public String clos_pers_emp_nm;
	public String clos_proc_dt;
	public String clos_yn;
	public String fix_yn;
	public String dept_nm;
	public String medi_nm;
	public String tms;
	public String base_data_src_tms;
	public String budg_plan_src_tms;
	public String work_remk_1;
	public String work_remk_2;
	public String chg_dt_tm;
	public String chg_pers;

	public CO_WORK_1010_LJOBLISTRecord(){}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setJob_clsf(String job_clsf){
		this.job_clsf = job_clsf;
	}

	public void setCd_clsf(String cd_clsf){
		this.cd_clsf = cd_clsf;
	}

	public void setCd(String cd){
		this.cd = cd;
	}

	public void setSub_cd(String sub_cd){
		this.sub_cd = sub_cd;
	}

	public void setExec_no(String exec_no){
		this.exec_no = exec_no;
	}

	public void setCd_clsf_nm(String cd_clsf_nm){
		this.cd_clsf_nm = cd_clsf_nm;
	}

	public void setCd_nm(String cd_nm){
		this.cd_nm = cd_nm;
	}

	public void setBasi_dt(String basi_dt){
		this.basi_dt = basi_dt;
	}

	public void setMang_frdt(String mang_frdt){
		this.mang_frdt = mang_frdt;
	}

	public void setMang_todt(String mang_todt){
		this.mang_todt = mang_todt;
	}

	public void setClos_pers_emp_nm(String clos_pers_emp_nm){
		this.clos_pers_emp_nm = clos_pers_emp_nm;
	}

	public void setClos_proc_dt(String clos_proc_dt){
		this.clos_proc_dt = clos_proc_dt;
	}

	public void setClos_yn(String clos_yn){
		this.clos_yn = clos_yn;
	}

	public void setFix_yn(String fix_yn){
		this.fix_yn = fix_yn;
	}

	public void setDept_nm(String dept_nm){
		this.dept_nm = dept_nm;
	}

	public void setMedi_nm(String medi_nm){
		this.medi_nm = medi_nm;
	}

	public void setTms(String tms){
		this.tms = tms;
	}

	public void setBase_data_src_tms(String base_data_src_tms){
		this.base_data_src_tms = base_data_src_tms;
	}

	public void setBudg_plan_src_tms(String budg_plan_src_tms){
		this.budg_plan_src_tms = budg_plan_src_tms;
	}

	public void setWork_remk_1(String work_remk_1){
		this.work_remk_1 = work_remk_1;
	}

	public void setWork_remk_2(String work_remk_2){
		this.work_remk_2 = work_remk_2;
	}

	public void setChg_dt_tm(String chg_dt_tm){
		this.chg_dt_tm = chg_dt_tm;
	}

	public void setChg_pers(String chg_pers){
		this.chg_pers = chg_pers;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getJob_clsf(){
		return this.job_clsf;
	}

	public String getCd_clsf(){
		return this.cd_clsf;
	}

	public String getCd(){
		return this.cd;
	}

	public String getSub_cd(){
		return this.sub_cd;
	}

	public String getExec_no(){
		return this.exec_no;
	}

	public String getCd_clsf_nm(){
		return this.cd_clsf_nm;
	}

	public String getCd_nm(){
		return this.cd_nm;
	}

	public String getBasi_dt(){
		return this.basi_dt;
	}

	public String getMang_frdt(){
		return this.mang_frdt;
	}

	public String getMang_todt(){
		return this.mang_todt;
	}

	public String getClos_pers_emp_nm(){
		return this.clos_pers_emp_nm;
	}

	public String getClos_proc_dt(){
		return this.clos_proc_dt;
	}

	public String getClos_yn(){
		return this.clos_yn;
	}

	public String getFix_yn(){
		return this.fix_yn;
	}

	public String getDept_nm(){
		return this.dept_nm;
	}

	public String getMedi_nm(){
		return this.medi_nm;
	}

	public String getTms(){
		return this.tms;
	}

	public String getBase_data_src_tms(){
		return this.base_data_src_tms;
	}

	public String getBudg_plan_src_tms(){
		return this.budg_plan_src_tms;
	}

	public String getWork_remk_1(){
		return this.work_remk_1;
	}

	public String getWork_remk_2(){
		return this.work_remk_2;
	}

	public String getChg_dt_tm(){
		return this.chg_dt_tm;
	}

	public String getChg_pers(){
		return this.chg_pers;
	}
}

/* 작성시간 : Thu Jun 04 17:51:37 KST 2009 */
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


public class HD_DUTY_1111_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String emp_no;
	public String flnm;
	public String duty_proc_stat;
	public String duty_proc_stat_nm;
	public String cancel_yn;
	public String duty_dt;
	public String clndr_wkdy;
	public String hody_clsf;
	public String hody_clsf_nm;
	public String prsnt_tm;
	public String finish_dd_clsf;
	public String finish_dd_clsf_nm;
	public String finish_dt;
	public String finish_tm;
	public String addm_rest_minute;
	public String hody_proc_stat;
	public String snkfee_proc_stat;
	public String ddsub1_proc_stat;
	public String ddsub2_proc_stat;
	public String vglfee_proc_stat;
	public String duty_clsf;
	public String duty_clsf_nm;

	public HD_DUTY_1111_LCURLISTRecord(){}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setFlnm(String flnm){
		this.flnm = flnm;
	}

	public void setDuty_proc_stat(String duty_proc_stat){
		this.duty_proc_stat = duty_proc_stat;
	}

	public void setDuty_proc_stat_nm(String duty_proc_stat_nm){
		this.duty_proc_stat_nm = duty_proc_stat_nm;
	}

	public void setCancel_yn(String cancel_yn){
		this.cancel_yn = cancel_yn;
	}

	public void setDuty_dt(String duty_dt){
		this.duty_dt = duty_dt;
	}

	public void setClndr_wkdy(String clndr_wkdy){
		this.clndr_wkdy = clndr_wkdy;
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

	public void setFinish_dt(String finish_dt){
		this.finish_dt = finish_dt;
	}

	public void setFinish_tm(String finish_tm){
		this.finish_tm = finish_tm;
	}

	public void setAddm_rest_minute(String addm_rest_minute){
		this.addm_rest_minute = addm_rest_minute;
	}

	public void setHody_proc_stat(String hody_proc_stat){
		this.hody_proc_stat = hody_proc_stat;
	}

	public void setSnkfee_proc_stat(String snkfee_proc_stat){
		this.snkfee_proc_stat = snkfee_proc_stat;
	}

	public void setDdsub1_proc_stat(String ddsub1_proc_stat){
		this.ddsub1_proc_stat = ddsub1_proc_stat;
	}

	public void setDdsub2_proc_stat(String ddsub2_proc_stat){
		this.ddsub2_proc_stat = ddsub2_proc_stat;
	}

	public void setVglfee_proc_stat(String vglfee_proc_stat){
		this.vglfee_proc_stat = vglfee_proc_stat;
	}

	public void setDuty_clsf(String duty_clsf){
		this.duty_clsf = duty_clsf;
	}

	public void setDuty_clsf_nm(String duty_clsf_nm){
		this.duty_clsf_nm = duty_clsf_nm;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getFlnm(){
		return this.flnm;
	}

	public String getDuty_proc_stat(){
		return this.duty_proc_stat;
	}

	public String getDuty_proc_stat_nm(){
		return this.duty_proc_stat_nm;
	}

	public String getCancel_yn(){
		return this.cancel_yn;
	}

	public String getDuty_dt(){
		return this.duty_dt;
	}

	public String getClndr_wkdy(){
		return this.clndr_wkdy;
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

	public String getFinish_dt(){
		return this.finish_dt;
	}

	public String getFinish_tm(){
		return this.finish_tm;
	}

	public String getAddm_rest_minute(){
		return this.addm_rest_minute;
	}

	public String getHody_proc_stat(){
		return this.hody_proc_stat;
	}

	public String getSnkfee_proc_stat(){
		return this.snkfee_proc_stat;
	}

	public String getDdsub1_proc_stat(){
		return this.ddsub1_proc_stat;
	}

	public String getDdsub2_proc_stat(){
		return this.ddsub2_proc_stat;
	}

	public String getVglfee_proc_stat(){
		return this.vglfee_proc_stat;
	}

	public String getDuty_clsf(){
		return this.duty_clsf;
	}

	public String getDuty_clsf_nm(){
		return this.duty_clsf_nm;
	}
}

/* 작성시간 : Thu Aug 09 18:38:42 KST 2018 */
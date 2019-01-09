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


public class HD_DUTY_1500_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String duty_behv_yymm;
	public String dept_nm;
	public String emp_no;
	public String nm_korn;
	public String dty_nm;
	public String posi_nm;
	public String fix_labr_dds;
	public String week_hody_duty_dds;
	public String nissu_dd_duty_dds;
	public String lgl_hody_duty_dds;
	public String duty_dds_stot;
	public String edu_dds;
	public String busi_trip_dds;
	public String temp_dds;
	public String vaca_use_dds_stot;
	public String year_use_dds;
	public String alvc_use_dds;
	public String congr_condl_vaca_use_dds;
	public String offi_vaca_use_dds;
	public String sick_vaca_use_dds;
	public String hlth_vaca_use_dds;
	public String rest_vaca_use_dds;
	public String etc_vaca_use_dds;

	public HD_DUTY_1500_LCURLISTRecord(){}

	public void setDuty_behv_yymm(String duty_behv_yymm){
		this.duty_behv_yymm = duty_behv_yymm;
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

	public void setDty_nm(String dty_nm){
		this.dty_nm = dty_nm;
	}

	public void setPosi_nm(String posi_nm){
		this.posi_nm = posi_nm;
	}

	public void setFix_labr_dds(String fix_labr_dds){
		this.fix_labr_dds = fix_labr_dds;
	}

	public void setWeek_hody_duty_dds(String week_hody_duty_dds){
		this.week_hody_duty_dds = week_hody_duty_dds;
	}

	public void setNissu_dd_duty_dds(String nissu_dd_duty_dds){
		this.nissu_dd_duty_dds = nissu_dd_duty_dds;
	}

	public void setLgl_hody_duty_dds(String lgl_hody_duty_dds){
		this.lgl_hody_duty_dds = lgl_hody_duty_dds;
	}

	public void setDuty_dds_stot(String duty_dds_stot){
		this.duty_dds_stot = duty_dds_stot;
	}

	public void setEdu_dds(String edu_dds){
		this.edu_dds = edu_dds;
	}

	public void setBusi_trip_dds(String busi_trip_dds){
		this.busi_trip_dds = busi_trip_dds;
	}

	public void setTemp_dds(String temp_dds){
		this.temp_dds = temp_dds;
	}

	public void setVaca_use_dds_stot(String vaca_use_dds_stot){
		this.vaca_use_dds_stot = vaca_use_dds_stot;
	}

	public void setYear_use_dds(String year_use_dds){
		this.year_use_dds = year_use_dds;
	}

	public void setAlvc_use_dds(String alvc_use_dds){
		this.alvc_use_dds = alvc_use_dds;
	}

	public void setCongr_condl_vaca_use_dds(String congr_condl_vaca_use_dds){
		this.congr_condl_vaca_use_dds = congr_condl_vaca_use_dds;
	}

	public void setOffi_vaca_use_dds(String offi_vaca_use_dds){
		this.offi_vaca_use_dds = offi_vaca_use_dds;
	}

	public void setSick_vaca_use_dds(String sick_vaca_use_dds){
		this.sick_vaca_use_dds = sick_vaca_use_dds;
	}

	public void setHlth_vaca_use_dds(String hlth_vaca_use_dds){
		this.hlth_vaca_use_dds = hlth_vaca_use_dds;
	}

	public void setRest_vaca_use_dds(String rest_vaca_use_dds){
		this.rest_vaca_use_dds = rest_vaca_use_dds;
	}

	public void setEtc_vaca_use_dds(String etc_vaca_use_dds){
		this.etc_vaca_use_dds = etc_vaca_use_dds;
	}

	public String getDuty_behv_yymm(){
		return this.duty_behv_yymm;
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

	public String getDty_nm(){
		return this.dty_nm;
	}

	public String getPosi_nm(){
		return this.posi_nm;
	}

	public String getFix_labr_dds(){
		return this.fix_labr_dds;
	}

	public String getWeek_hody_duty_dds(){
		return this.week_hody_duty_dds;
	}

	public String getNissu_dd_duty_dds(){
		return this.nissu_dd_duty_dds;
	}

	public String getLgl_hody_duty_dds(){
		return this.lgl_hody_duty_dds;
	}

	public String getDuty_dds_stot(){
		return this.duty_dds_stot;
	}

	public String getEdu_dds(){
		return this.edu_dds;
	}

	public String getBusi_trip_dds(){
		return this.busi_trip_dds;
	}

	public String getTemp_dds(){
		return this.temp_dds;
	}

	public String getVaca_use_dds_stot(){
		return this.vaca_use_dds_stot;
	}

	public String getYear_use_dds(){
		return this.year_use_dds;
	}

	public String getAlvc_use_dds(){
		return this.alvc_use_dds;
	}

	public String getCongr_condl_vaca_use_dds(){
		return this.congr_condl_vaca_use_dds;
	}

	public String getOffi_vaca_use_dds(){
		return this.offi_vaca_use_dds;
	}

	public String getSick_vaca_use_dds(){
		return this.sick_vaca_use_dds;
	}

	public String getHlth_vaca_use_dds(){
		return this.hlth_vaca_use_dds;
	}

	public String getRest_vaca_use_dds(){
		return this.rest_vaca_use_dds;
	}

	public String getEtc_vaca_use_dds(){
		return this.etc_vaca_use_dds;
	}
}

/* 작성시간 : Tue Mar 31 15:55:52 KST 2009 */
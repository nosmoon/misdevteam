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


package chosun.ciis.hd.vaca.rec;

import java.sql.*;
import chosun.ciis.hd.vaca.dm.*;
import chosun.ciis.hd.vaca.ds.*;

/**
 * 
 */


public class HD_VACA_3210_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cmpy_cd;
	public String emp_no;
	public String aply_yymm;
	public String week;
	public String nm_korn;
	public String dept_cd;
	public String dept_nm;
	public String posi_cd;
	public String posi_nm;
	public String dty_cd;
	public String dty_nm;
	public String mon_ck;
	public String tue_ck;
	public String wed_ck;
	public String thu_ck;
	public String fri_ck;
	public String sat_ck;
	public String sun_ck;
	public String wkdy;
	public String frdt;
	public String todt;
	public String hody_plan_dt_mon;
	public String hody_plan_dt_tue;
	public String hody_plan_dt_wed;
	public String hody_plan_dt_thu;
	public String hody_plan_dt_fri;
	public String hody_plan_dt_sat;
	public String hody_plan_dt_sun;
	public String proc_stat;
	public String proc_nm;

	public HD_VACA_3210_LCURLISTRecord(){}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setAply_yymm(String aply_yymm){
		this.aply_yymm = aply_yymm;
	}

	public void setWeek(String week){
		this.week = week;
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

	public void setPosi_cd(String posi_cd){
		this.posi_cd = posi_cd;
	}

	public void setPosi_nm(String posi_nm){
		this.posi_nm = posi_nm;
	}

	public void setDty_cd(String dty_cd){
		this.dty_cd = dty_cd;
	}

	public void setDty_nm(String dty_nm){
		this.dty_nm = dty_nm;
	}

	public void setMon_ck(String mon_ck){
		this.mon_ck = mon_ck;
	}

	public void setTue_ck(String tue_ck){
		this.tue_ck = tue_ck;
	}

	public void setWed_ck(String wed_ck){
		this.wed_ck = wed_ck;
	}

	public void setThu_ck(String thu_ck){
		this.thu_ck = thu_ck;
	}

	public void setFri_ck(String fri_ck){
		this.fri_ck = fri_ck;
	}

	public void setSat_ck(String sat_ck){
		this.sat_ck = sat_ck;
	}

	public void setSun_ck(String sun_ck){
		this.sun_ck = sun_ck;
	}

	public void setWkdy(String wkdy){
		this.wkdy = wkdy;
	}

	public void setFrdt(String frdt){
		this.frdt = frdt;
	}

	public void setTodt(String todt){
		this.todt = todt;
	}

	public void setHody_plan_dt_mon(String hody_plan_dt_mon){
		this.hody_plan_dt_mon = hody_plan_dt_mon;
	}

	public void setHody_plan_dt_tue(String hody_plan_dt_tue){
		this.hody_plan_dt_tue = hody_plan_dt_tue;
	}

	public void setHody_plan_dt_wed(String hody_plan_dt_wed){
		this.hody_plan_dt_wed = hody_plan_dt_wed;
	}

	public void setHody_plan_dt_thu(String hody_plan_dt_thu){
		this.hody_plan_dt_thu = hody_plan_dt_thu;
	}

	public void setHody_plan_dt_fri(String hody_plan_dt_fri){
		this.hody_plan_dt_fri = hody_plan_dt_fri;
	}

	public void setHody_plan_dt_sat(String hody_plan_dt_sat){
		this.hody_plan_dt_sat = hody_plan_dt_sat;
	}

	public void setHody_plan_dt_sun(String hody_plan_dt_sun){
		this.hody_plan_dt_sun = hody_plan_dt_sun;
	}

	public void setProc_stat(String proc_stat){
		this.proc_stat = proc_stat;
	}

	public void setProc_nm(String proc_nm){
		this.proc_nm = proc_nm;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getAply_yymm(){
		return this.aply_yymm;
	}

	public String getWeek(){
		return this.week;
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

	public String getPosi_cd(){
		return this.posi_cd;
	}

	public String getPosi_nm(){
		return this.posi_nm;
	}

	public String getDty_cd(){
		return this.dty_cd;
	}

	public String getDty_nm(){
		return this.dty_nm;
	}

	public String getMon_ck(){
		return this.mon_ck;
	}

	public String getTue_ck(){
		return this.tue_ck;
	}

	public String getWed_ck(){
		return this.wed_ck;
	}

	public String getThu_ck(){
		return this.thu_ck;
	}

	public String getFri_ck(){
		return this.fri_ck;
	}

	public String getSat_ck(){
		return this.sat_ck;
	}

	public String getSun_ck(){
		return this.sun_ck;
	}

	public String getWkdy(){
		return this.wkdy;
	}

	public String getFrdt(){
		return this.frdt;
	}

	public String getTodt(){
		return this.todt;
	}

	public String getHody_plan_dt_mon(){
		return this.hody_plan_dt_mon;
	}

	public String getHody_plan_dt_tue(){
		return this.hody_plan_dt_tue;
	}

	public String getHody_plan_dt_wed(){
		return this.hody_plan_dt_wed;
	}

	public String getHody_plan_dt_thu(){
		return this.hody_plan_dt_thu;
	}

	public String getHody_plan_dt_fri(){
		return this.hody_plan_dt_fri;
	}

	public String getHody_plan_dt_sat(){
		return this.hody_plan_dt_sat;
	}

	public String getHody_plan_dt_sun(){
		return this.hody_plan_dt_sun;
	}

	public String getProc_stat(){
		return this.proc_stat;
	}

	public String getProc_nm(){
		return this.proc_nm;
	}
}

/* 작성시간 : Wed Sep 02 09:51:56 KST 2015 */
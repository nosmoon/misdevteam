/***************************************************************************************************
* 파일명 : .java
* 기능 : 	   
* 작성일자 : 
* 작성자 : 
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.as.mach.rec;

import java.sql.*;
import chosun.ciis.as.mach.dm.*;
import chosun.ciis.as.mach.ds.*;

/**
 * 
 */


public class AS_MACH_1010_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cmpy_cd;
	public String mach_seq;
	public String work_clsf;
	public String work_clsf_nm;
	public String mach_clsf;
	public String mach_clsf_nm;
	public String bldg_clsf;
	public String bldg_clsf_nm;
	public String mach_name;
	public String model_name;
	public String stnd;
	public String usag;
	public String loca;
	public String life_year;
	public String make_comp;
	public String inst_comp;
	public int inst_fee;
	public String inst_dt;
	public String exp_dt;
	public String as_comp;
	public int as_fee;
	public String as_tel;

	public AS_MACH_1010_LCURLISTRecord(){}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setMach_seq(String mach_seq){
		this.mach_seq = mach_seq;
	}

	public void setWork_clsf(String work_clsf){
		this.work_clsf = work_clsf;
	}

	public void setWork_clsf_nm(String work_clsf_nm){
		this.work_clsf_nm = work_clsf_nm;
	}

	public void setMach_clsf(String mach_clsf){
		this.mach_clsf = mach_clsf;
	}

	public void setMach_clsf_nm(String mach_clsf_nm){
		this.mach_clsf_nm = mach_clsf_nm;
	}

	public void setBldg_clsf(String bldg_clsf){
		this.bldg_clsf = bldg_clsf;
	}

	public void setBldg_clsf_nm(String bldg_clsf_nm){
		this.bldg_clsf_nm = bldg_clsf_nm;
	}

	public void setMach_name(String mach_name){
		this.mach_name = mach_name;
	}

	public void setModel_name(String model_name){
		this.model_name = model_name;
	}

	public void setStnd(String stnd){
		this.stnd = stnd;
	}

	public void setUsag(String usag){
		this.usag = usag;
	}

	public void setLoca(String loca){
		this.loca = loca;
	}

	public void setLife_year(String life_year){
		this.life_year = life_year;
	}

	public void setMake_comp(String make_comp){
		this.make_comp = make_comp;
	}

	public void setInst_comp(String inst_comp){
		this.inst_comp = inst_comp;
	}

	public void setInst_fee(int inst_fee){
		this.inst_fee = inst_fee;
	}

	public void setInst_dt(String inst_dt){
		this.inst_dt = inst_dt;
	}

	public void setExp_dt(String exp_dt){
		this.exp_dt = exp_dt;
	}

	public void setAs_comp(String as_comp){
		this.as_comp = as_comp;
	}

	public void setAs_fee(int as_fee){
		this.as_fee = as_fee;
	}

	public void setAs_tel(String as_tel){
		this.as_tel = as_tel;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getMach_seq(){
		return this.mach_seq;
	}

	public String getWork_clsf(){
		return this.work_clsf;
	}

	public String getWork_clsf_nm(){
		return this.work_clsf_nm;
	}

	public String getMach_clsf(){
		return this.mach_clsf;
	}

	public String getMach_clsf_nm(){
		return this.mach_clsf_nm;
	}

	public String getBldg_clsf(){
		return this.bldg_clsf;
	}

	public String getBldg_clsf_nm(){
		return this.bldg_clsf_nm;
	}

	public String getMach_name(){
		return this.mach_name;
	}

	public String getModel_name(){
		return this.model_name;
	}

	public String getStnd(){
		return this.stnd;
	}

	public String getUsag(){
		return this.usag;
	}

	public String getLoca(){
		return this.loca;
	}

	public String getLife_year(){
		return this.life_year;
	}

	public String getMake_comp(){
		return this.make_comp;
	}

	public String getInst_comp(){
		return this.inst_comp;
	}

	public int getInst_fee(){
		return this.inst_fee;
	}

	public String getInst_dt(){
		return this.inst_dt;
	}

	public String getExp_dt(){
		return this.exp_dt;
	}

	public String getAs_comp(){
		return this.as_comp;
	}

	public int getAs_fee(){
		return this.as_fee;
	}

	public String getAs_tel(){
		return this.as_tel;
	}
}

/* 작성시간 : Fri Jul 10 13:59:12 KST 2015 */
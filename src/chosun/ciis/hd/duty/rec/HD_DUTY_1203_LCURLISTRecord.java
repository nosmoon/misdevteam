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


public class HD_DUTY_1203_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cmpy_cd;
	public String emp_no;
	public String nm_korn;
	public String dept_cd;
	public String dept_nm;
	public String posi_cd;
	public String posi_nm;
	public String duty_dt;
	public String prsnt_tm;
	public String finish_dd_clsf;
	public String finish_dd_nm;
	public String finish_tm;
	public String proc_stat;
	public String proc_nm;
	public String addm_rest_minute;
	public String hody_clsf;
	public String hody_nm;
	public String vaca_cd;
	public String vaca_nm;
	public String duty_clsf;

	public HD_DUTY_1203_LCURLISTRecord(){}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
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

	public void setPosi_cd(String posi_cd){
		this.posi_cd = posi_cd;
	}

	public void setPosi_nm(String posi_nm){
		this.posi_nm = posi_nm;
	}

	public void setDuty_dt(String duty_dt){
		this.duty_dt = duty_dt;
	}

	public void setPrsnt_tm(String prsnt_tm){
		this.prsnt_tm = prsnt_tm;
	}

	public void setFinish_dd_clsf(String finish_dd_clsf){
		this.finish_dd_clsf = finish_dd_clsf;
	}

	public void setFinish_dd_nm(String finish_dd_nm){
		this.finish_dd_nm = finish_dd_nm;
	}

	public void setFinish_tm(String finish_tm){
		this.finish_tm = finish_tm;
	}

	public void setProc_stat(String proc_stat){
		this.proc_stat = proc_stat;
	}

	public void setProc_nm(String proc_nm){
		this.proc_nm = proc_nm;
	}

	public void setAddm_rest_minute(String addm_rest_minute){
		this.addm_rest_minute = addm_rest_minute;
	}

	public void setHody_clsf(String hody_clsf){
		this.hody_clsf = hody_clsf;
	}

	public void setHody_nm(String hody_nm){
		this.hody_nm = hody_nm;
	}

	public void setVaca_cd(String vaca_cd){
		this.vaca_cd = vaca_cd;
	}

	public void setVaca_nm(String vaca_nm){
		this.vaca_nm = vaca_nm;
	}

	public void setDuty_clsf(String duty_clsf){
		this.duty_clsf = duty_clsf;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
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

	public String getPosi_cd(){
		return this.posi_cd;
	}

	public String getPosi_nm(){
		return this.posi_nm;
	}

	public String getDuty_dt(){
		return this.duty_dt;
	}

	public String getPrsnt_tm(){
		return this.prsnt_tm;
	}

	public String getFinish_dd_clsf(){
		return this.finish_dd_clsf;
	}

	public String getFinish_dd_nm(){
		return this.finish_dd_nm;
	}

	public String getFinish_tm(){
		return this.finish_tm;
	}

	public String getProc_stat(){
		return this.proc_stat;
	}

	public String getProc_nm(){
		return this.proc_nm;
	}

	public String getAddm_rest_minute(){
		return this.addm_rest_minute;
	}

	public String getHody_clsf(){
		return this.hody_clsf;
	}

	public String getHody_nm(){
		return this.hody_nm;
	}

	public String getVaca_cd(){
		return this.vaca_cd;
	}

	public String getVaca_nm(){
		return this.vaca_nm;
	}

	public String getDuty_clsf(){
		return this.duty_clsf;
	}
}

/* 작성시간 : Thu Aug 09 13:43:07 KST 2018 */
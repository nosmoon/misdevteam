/***************************************************************************************************
* ���ϸ� : .java
* ��� : ���ڿ��-������û
* �ۼ����� : 2007-05-22
* �ۼ��� : ��뼷
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.hd.duty.rec;

import java.sql.*;
import chosun.ciis.hd.duty.dm.*;
import chosun.ciis.hd.duty.ds.*;

/**
 * 
 */


public class HD_DUTY_1700_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cmpy_cd;
	public String dept_cd;
	public String dept_nm;
	public String emp_no;
	public String nm_korn;
	public String posi_nm;
	public String duty_dt;
	public String prsnt_tm;
	public String finish_dd_nm;
	public String finish_tm;
	public String proc_stat_nm;
	public String proc_stat;
	public String hody_clsf_nm;
	public String alon_pay_mm;
	public String addm_rest_minute;
	public String duty_clsf_nm;

	public HD_DUTY_1700_LCURLISTRecord(){}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

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

	public void setPrsnt_tm(String prsnt_tm){
		this.prsnt_tm = prsnt_tm;
	}

	public void setFinish_dd_nm(String finish_dd_nm){
		this.finish_dd_nm = finish_dd_nm;
	}

	public void setFinish_tm(String finish_tm){
		this.finish_tm = finish_tm;
	}

	public void setProc_stat_nm(String proc_stat_nm){
		this.proc_stat_nm = proc_stat_nm;
	}

	public void setProc_stat(String proc_stat){
		this.proc_stat = proc_stat;
	}

	public void setHody_clsf_nm(String hody_clsf_nm){
		this.hody_clsf_nm = hody_clsf_nm;
	}

	public void setAlon_pay_mm(String alon_pay_mm){
		this.alon_pay_mm = alon_pay_mm;
	}

	public void setAddm_rest_minute(String addm_rest_minute){
		this.addm_rest_minute = addm_rest_minute;
	}

	public void setDuty_clsf_nm(String duty_clsf_nm){
		this.duty_clsf_nm = duty_clsf_nm;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
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

	public String getPrsnt_tm(){
		return this.prsnt_tm;
	}

	public String getFinish_dd_nm(){
		return this.finish_dd_nm;
	}

	public String getFinish_tm(){
		return this.finish_tm;
	}

	public String getProc_stat_nm(){
		return this.proc_stat_nm;
	}

	public String getProc_stat(){
		return this.proc_stat;
	}

	public String getHody_clsf_nm(){
		return this.hody_clsf_nm;
	}

	public String getAlon_pay_mm(){
		return this.alon_pay_mm;
	}

	public String getAddm_rest_minute(){
		return this.addm_rest_minute;
	}

	public String getDuty_clsf_nm(){
		return this.duty_clsf_nm;
	}
}

/* �ۼ��ð� : Mon Jul 02 18:31:30 KST 2018 */
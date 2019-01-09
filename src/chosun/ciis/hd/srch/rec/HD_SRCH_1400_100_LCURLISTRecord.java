/***************************************************************************************************
* 파일명 : .java
* 기능 : 
* 작성일자 : 
* 작성자 : 이태식
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 : 
* 수정자 : 
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.hd.srch.rec;

import java.sql.*;
import chosun.ciis.hd.srch.dm.*;
import chosun.ciis.hd.srch.ds.*;

/**
 * 
 */


public class HD_SRCH_1400_100_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cmpy_cd;
	public String emp_no;
	public String nm_korn;
	public String cd_nm;
	public String dept_nm;
	public String dty_nm;
	public String posi_nm;
	public String in_cmpy_dt;
	public String last_upgrd_dt;
	public String pick_start_dt;
	public String down_percent;
	public String tot_saly;
	public String pick_salary;
	public String minus_salary;
	public String limit_age_due_date;
	public String basi_age;
	public String emp_birthday;

	public HD_SRCH_1400_100_LCURLISTRecord(){}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setNm_korn(String nm_korn){
		this.nm_korn = nm_korn;
	}

	public void setCd_nm(String cd_nm){
		this.cd_nm = cd_nm;
	}

	public void setDept_nm(String dept_nm){
		this.dept_nm = dept_nm;
	}

	public void setDty_nm(String dty_nm){
		this.dty_nm = dty_nm;
	}

	public void setPosi_nm(String posi_nm){
		this.posi_nm = posi_nm;
	}

	public void setIn_cmpy_dt(String in_cmpy_dt){
		this.in_cmpy_dt = in_cmpy_dt;
	}

	public void setLast_upgrd_dt(String last_upgrd_dt){
		this.last_upgrd_dt = last_upgrd_dt;
	}

	public void setPick_start_dt(String pick_start_dt){
		this.pick_start_dt = pick_start_dt;
	}

	public void setDown_percent(String down_percent){
		this.down_percent = down_percent;
	}

	public void setTot_saly(String tot_saly){
		this.tot_saly = tot_saly;
	}

	public void setPick_salary(String pick_salary){
		this.pick_salary = pick_salary;
	}

	public void setMinus_salary(String minus_salary){
		this.minus_salary = minus_salary;
	}

	public void setLimit_age_due_date(String limit_age_due_date){
		this.limit_age_due_date = limit_age_due_date;
	}

	public void setBasi_age(String basi_age){
		this.basi_age = basi_age;
	}

	public void setEmp_birthday(String emp_birthday){
		this.emp_birthday = emp_birthday;
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

	public String getCd_nm(){
		return this.cd_nm;
	}

	public String getDept_nm(){
		return this.dept_nm;
	}

	public String getDty_nm(){
		return this.dty_nm;
	}

	public String getPosi_nm(){
		return this.posi_nm;
	}

	public String getIn_cmpy_dt(){
		return this.in_cmpy_dt;
	}

	public String getLast_upgrd_dt(){
		return this.last_upgrd_dt;
	}

	public String getPick_start_dt(){
		return this.pick_start_dt;
	}

	public String getDown_percent(){
		return this.down_percent;
	}

	public String getTot_saly(){
		return this.tot_saly;
	}

	public String getPick_salary(){
		return this.pick_salary;
	}

	public String getMinus_salary(){
		return this.minus_salary;
	}

	public String getLimit_age_due_date(){
		return this.limit_age_due_date;
	}

	public String getBasi_age(){
		return this.basi_age;
	}

	public String getEmp_birthday(){
		return this.emp_birthday;
	}
}

/* 작성시간 : Tue Dec 20 11:18:26 KST 2016 */
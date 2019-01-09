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


public class HD_SRCH_1300_100_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String up_dept_cd;
	public String up_dept_nm;
	public String dept_cd;
	public String dept_nm;
	public String emp_no;
	public String nm_korn;
	public String dty_nm;
	public String posi_nm;
	public String emp_clsf_nm;
	public String in_cmpy_dt;
	public String birth_yyyymmdd;
	public String t1;
	public String last_upgrd_dt;
	public String limit_age_due_date;

	public HD_SRCH_1300_100_LCURLISTRecord(){}

	public void setUp_dept_cd(String up_dept_cd){
		this.up_dept_cd = up_dept_cd;
	}

	public void setUp_dept_nm(String up_dept_nm){
		this.up_dept_nm = up_dept_nm;
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

	public void setDty_nm(String dty_nm){
		this.dty_nm = dty_nm;
	}

	public void setPosi_nm(String posi_nm){
		this.posi_nm = posi_nm;
	}

	public void setEmp_clsf_nm(String emp_clsf_nm){
		this.emp_clsf_nm = emp_clsf_nm;
	}

	public void setIn_cmpy_dt(String in_cmpy_dt){
		this.in_cmpy_dt = in_cmpy_dt;
	}

	public void setBirth_yyyymmdd(String birth_yyyymmdd){
		this.birth_yyyymmdd = birth_yyyymmdd;
	}

	public void setT1(String t1){
		this.t1 = t1;
	}

	public void setLast_upgrd_dt(String last_upgrd_dt){
		this.last_upgrd_dt = last_upgrd_dt;
	}

	public void setLimit_age_due_date(String limit_age_due_date){
		this.limit_age_due_date = limit_age_due_date;
	}

	public String getUp_dept_cd(){
		return this.up_dept_cd;
	}

	public String getUp_dept_nm(){
		return this.up_dept_nm;
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

	public String getDty_nm(){
		return this.dty_nm;
	}

	public String getPosi_nm(){
		return this.posi_nm;
	}

	public String getEmp_clsf_nm(){
		return this.emp_clsf_nm;
	}

	public String getIn_cmpy_dt(){
		return this.in_cmpy_dt;
	}

	public String getBirth_yyyymmdd(){
		return this.birth_yyyymmdd;
	}

	public String getT1(){
		return this.t1;
	}

	public String getLast_upgrd_dt(){
		return this.last_upgrd_dt;
	}

	public String getLimit_age_due_date(){
		return this.limit_age_due_date;
	}
}

/* 작성시간 : Thu Dec 15 11:20:13 KST 2016 */
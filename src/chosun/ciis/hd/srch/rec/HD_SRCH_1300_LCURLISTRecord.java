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


package chosun.ciis.hd.srch.rec;

import java.sql.*;
import chosun.ciis.hd.srch.dm.*;
import chosun.ciis.hd.srch.ds.*;

/**
 * 
 */


public class HD_SRCH_1300_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String up_dept_nm;
	public String dept_cd;
	public String dept_nm;
	public String emp_no;
	public String nm_korn;
	public String dty_nm;
	public String posi_nm;
	public String emp_clsf_nm;
	public String s1;
	public String in_cmpy_dt;
	public String birth_yyyymmdd;
	public String t1;
	public String last_upgrd_dt;
	public String t2;
	public String s2;

	public HD_SRCH_1300_LCURLISTRecord(){}

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

	public void setS1(String s1){
		this.s1 = s1;
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

	public void setT2(String t2){
		this.t2 = t2;
	}

	public void setS2(String s2){
		this.s2 = s2;
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

	public String getS1(){
		return this.s1;
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

	public String getT2(){
		return this.t2;
	}

	public String getS2(){
		return this.s2;
	}
}

/* 작성시간 : Wed Aug 12 20:02:07 KST 2009 */
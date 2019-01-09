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


package chosun.ciis.mc.budg.rec;

import java.sql.*;
import chosun.ciis.mc.budg.dm.*;
import chosun.ciis.mc.budg.ds.*;

/**
 * 
 */


public class MC_BUDG_2073_LCURLIST1Record extends java.lang.Object implements java.io.Serializable{

	public String evnt_cd;
	public String evnt_nm;
	public String bgn_dt;
	public String last_dt;
	public String supv_dept_cd;
	public String supv_dept_nm;
	public String emp_no;
	public String emp_nm;

	public MC_BUDG_2073_LCURLIST1Record(){}

	public void setEvnt_cd(String evnt_cd){
		this.evnt_cd = evnt_cd;
	}

	public void setEvnt_nm(String evnt_nm){
		this.evnt_nm = evnt_nm;
	}

	public void setBgn_dt(String bgn_dt){
		this.bgn_dt = bgn_dt;
	}

	public void setLast_dt(String last_dt){
		this.last_dt = last_dt;
	}

	public void setSupv_dept_cd(String supv_dept_cd){
		this.supv_dept_cd = supv_dept_cd;
	}

	public void setSupv_dept_nm(String supv_dept_nm){
		this.supv_dept_nm = supv_dept_nm;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setEmp_nm(String emp_nm){
		this.emp_nm = emp_nm;
	}

	public String getEvnt_cd(){
		return this.evnt_cd;
	}

	public String getEvnt_nm(){
		return this.evnt_nm;
	}

	public String getBgn_dt(){
		return this.bgn_dt;
	}

	public String getLast_dt(){
		return this.last_dt;
	}

	public String getSupv_dept_cd(){
		return this.supv_dept_cd;
	}

	public String getSupv_dept_nm(){
		return this.supv_dept_nm;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getEmp_nm(){
		return this.emp_nm;
	}
}

/* 작성시간 : Wed Apr 15 15:28:51 KST 2009 */
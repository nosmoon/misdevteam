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


package chosun.ciis.fc.acct.rec;

import java.sql.*;
import chosun.ciis.fc.acct.dm.*;
import chosun.ciis.fc.acct.ds.*;

/**
 * 
 */


public class FC_ACCT_5001_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String clos_dt;
	public String clos_clsf;
	public String clos_tbl;
	public String clos_proc_dt_tm;
	public String clos_proc_ms;
	public String clos_pers_emp_no;
	public String clos_pers_emp_nm;

	public FC_ACCT_5001_LCURLISTRecord(){}

	public void setClos_dt(String clos_dt){
		this.clos_dt = clos_dt;
	}

	public void setClos_clsf(String clos_clsf){
		this.clos_clsf = clos_clsf;
	}

	public void setClos_tbl(String clos_tbl){
		this.clos_tbl = clos_tbl;
	}

	public void setClos_proc_dt_tm(String clos_proc_dt_tm){
		this.clos_proc_dt_tm = clos_proc_dt_tm;
	}

	public void setClos_proc_ms(String clos_proc_ms){
		this.clos_proc_ms = clos_proc_ms;
	}

	public void setClos_pers_emp_no(String clos_pers_emp_no){
		this.clos_pers_emp_no = clos_pers_emp_no;
	}

	public void setClos_pers_emp_nm(String clos_pers_emp_nm){
		this.clos_pers_emp_nm = clos_pers_emp_nm;
	}

	public String getClos_dt(){
		return this.clos_dt;
	}

	public String getClos_clsf(){
		return this.clos_clsf;
	}

	public String getClos_tbl(){
		return this.clos_tbl;
	}

	public String getClos_proc_dt_tm(){
		return this.clos_proc_dt_tm;
	}

	public String getClos_proc_ms(){
		return this.clos_proc_ms;
	}

	public String getClos_pers_emp_no(){
		return this.clos_pers_emp_no;
	}

	public String getClos_pers_emp_nm(){
		return this.clos_pers_emp_nm;
	}
}

/* 작성시간 : Mon Mar 09 11:54:50 KST 2009 */
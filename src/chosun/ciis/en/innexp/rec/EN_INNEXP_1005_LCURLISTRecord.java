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


package chosun.ciis.en.innexp.rec;

import java.sql.*;
import chosun.ciis.en.innexp.dm.*;
import chosun.ciis.en.innexp.ds.*;

/**
 * 
 */


public class EN_INNEXP_1005_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String evnt_nm;
	public String chrg_dept_cd;
	public String chrg_dept_nm;
	public String chrg_pers_emp_no;
	public String chrg_pers_emp_nm;

	public EN_INNEXP_1005_LCURLISTRecord(){}

	public void setEvnt_nm(String evnt_nm){
		this.evnt_nm = evnt_nm;
	}

	public void setChrg_dept_cd(String chrg_dept_cd){
		this.chrg_dept_cd = chrg_dept_cd;
	}

	public void setChrg_dept_nm(String chrg_dept_nm){
		this.chrg_dept_nm = chrg_dept_nm;
	}

	public void setChrg_pers_emp_no(String chrg_pers_emp_no){
		this.chrg_pers_emp_no = chrg_pers_emp_no;
	}

	public void setChrg_pers_emp_nm(String chrg_pers_emp_nm){
		this.chrg_pers_emp_nm = chrg_pers_emp_nm;
	}

	public String getEvnt_nm(){
		return this.evnt_nm;
	}

	public String getChrg_dept_cd(){
		return this.chrg_dept_cd;
	}

	public String getChrg_dept_nm(){
		return this.chrg_dept_nm;
	}

	public String getChrg_pers_emp_no(){
		return this.chrg_pers_emp_no;
	}

	public String getChrg_pers_emp_nm(){
		return this.chrg_pers_emp_nm;
	}
}

/* 작성시간 : Fri Apr 17 11:54:29 KST 2009 */
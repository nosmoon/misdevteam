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


public class FC_ACCT_2111_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String supr_dept_nm;
	public String dept_nm;
	public String emp_nm;
	public String emp_no;
	public String dty_nm;
	public String posi_nm;
	public String in_cmpy_dt;
	public String lv_cmpy_dt;
	public String sply_basi_cd;
	public String sply_basi_amt;

	public FC_ACCT_2111_LCURLISTRecord(){}

	public void setSupr_dept_nm(String supr_dept_nm){
		this.supr_dept_nm = supr_dept_nm;
	}

	public void setDept_nm(String dept_nm){
		this.dept_nm = dept_nm;
	}

	public void setEmp_nm(String emp_nm){
		this.emp_nm = emp_nm;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
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

	public void setLv_cmpy_dt(String lv_cmpy_dt){
		this.lv_cmpy_dt = lv_cmpy_dt;
	}

	public void setSply_basi_cd(String sply_basi_cd){
		this.sply_basi_cd = sply_basi_cd;
	}

	public void setSply_basi_amt(String sply_basi_amt){
		this.sply_basi_amt = sply_basi_amt;
	}

	public String getSupr_dept_nm(){
		return this.supr_dept_nm;
	}

	public String getDept_nm(){
		return this.dept_nm;
	}

	public String getEmp_nm(){
		return this.emp_nm;
	}

	public String getEmp_no(){
		return this.emp_no;
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

	public String getLv_cmpy_dt(){
		return this.lv_cmpy_dt;
	}

	public String getSply_basi_cd(){
		return this.sply_basi_cd;
	}

	public String getSply_basi_amt(){
		return this.sply_basi_amt;
	}
}

/* 작성시간 : Wed May 22 15:27:46 KST 2013 */
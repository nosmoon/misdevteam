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


package chosun.ciis.hd.lvcmpy.rec;

import java.sql.*;
import chosun.ciis.hd.lvcmpy.dm.*;
import chosun.ciis.hd.lvcmpy.ds.*;

/**
 * 
 */


public class HD_LVCMPY_3600_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String dept_cd;
	public String dept_nm;
	public String emp_no;
	public String nm_korn;
	public String priv_lvcmpy_saly_estm_amt;
	public String this_month_out_amt;
	public String lvcmpy_saly_estm_amt;
	public String set_amt;
	public String last_month_sum;
	public String diff_amt;
	public String this_month_in_amt;
	public String this_year_sum;
	public String total_year_sum;

	public HD_LVCMPY_3600_LCURLISTRecord(){}

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

	public void setPriv_lvcmpy_saly_estm_amt(String priv_lvcmpy_saly_estm_amt){
		this.priv_lvcmpy_saly_estm_amt = priv_lvcmpy_saly_estm_amt;
	}

	public void setThis_month_out_amt(String this_month_out_amt){
		this.this_month_out_amt = this_month_out_amt;
	}

	public void setLvcmpy_saly_estm_amt(String lvcmpy_saly_estm_amt){
		this.lvcmpy_saly_estm_amt = lvcmpy_saly_estm_amt;
	}

	public void setSet_amt(String set_amt){
		this.set_amt = set_amt;
	}

	public void setLast_month_sum(String last_month_sum){
		this.last_month_sum = last_month_sum;
	}

	public void setDiff_amt(String diff_amt){
		this.diff_amt = diff_amt;
	}

	public void setThis_month_in_amt(String this_month_in_amt){
		this.this_month_in_amt = this_month_in_amt;
	}

	public void setThis_year_sum(String this_year_sum){
		this.this_year_sum = this_year_sum;
	}

	public void setTotal_year_sum(String total_year_sum){
		this.total_year_sum = total_year_sum;
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

	public String getPriv_lvcmpy_saly_estm_amt(){
		return this.priv_lvcmpy_saly_estm_amt;
	}

	public String getThis_month_out_amt(){
		return this.this_month_out_amt;
	}

	public String getLvcmpy_saly_estm_amt(){
		return this.lvcmpy_saly_estm_amt;
	}

	public String getSet_amt(){
		return this.set_amt;
	}

	public String getLast_month_sum(){
		return this.last_month_sum;
	}

	public String getDiff_amt(){
		return this.diff_amt;
	}

	public String getThis_month_in_amt(){
		return this.this_month_in_amt;
	}

	public String getThis_year_sum(){
		return this.this_year_sum;
	}

	public String getTotal_year_sum(){
		return this.total_year_sum;
	}
}

/* 작성시간 : Mon Apr 09 15:05:55 KST 2012 */
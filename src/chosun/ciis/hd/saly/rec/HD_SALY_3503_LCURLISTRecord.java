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


package chosun.ciis.hd.saly.rec;

import java.sql.*;
import chosun.ciis.hd.saly.dm.*;
import chosun.ciis.hd.saly.ds.*;

/**
 * 
 */


public class HD_SALY_3503_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String occr_dt;
	public String dept_cd;
	public String dept_nm;
	public String emp_cnt;
	public String total_amt;
	public String incm_tax;
	public String res_tax;
	public String emp_insr_fee;
	public String total_fee;
	public String cal_pay_amt;
	public String cmpy_cd;
	public String insd_dept_cd;

	public HD_SALY_3503_LCURLISTRecord(){}

	public void setOccr_dt(String occr_dt){
		this.occr_dt = occr_dt;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setDept_nm(String dept_nm){
		this.dept_nm = dept_nm;
	}

	public void setEmp_cnt(String emp_cnt){
		this.emp_cnt = emp_cnt;
	}

	public void setTotal_amt(String total_amt){
		this.total_amt = total_amt;
	}

	public void setIncm_tax(String incm_tax){
		this.incm_tax = incm_tax;
	}

	public void setRes_tax(String res_tax){
		this.res_tax = res_tax;
	}

	public void setEmp_insr_fee(String emp_insr_fee){
		this.emp_insr_fee = emp_insr_fee;
	}

	public void setTotal_fee(String total_fee){
		this.total_fee = total_fee;
	}

	public void setCal_pay_amt(String cal_pay_amt){
		this.cal_pay_amt = cal_pay_amt;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setInsd_dept_cd(String insd_dept_cd){
		this.insd_dept_cd = insd_dept_cd;
	}

	public String getOccr_dt(){
		return this.occr_dt;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getDept_nm(){
		return this.dept_nm;
	}

	public String getEmp_cnt(){
		return this.emp_cnt;
	}

	public String getTotal_amt(){
		return this.total_amt;
	}

	public String getIncm_tax(){
		return this.incm_tax;
	}

	public String getRes_tax(){
		return this.res_tax;
	}

	public String getEmp_insr_fee(){
		return this.emp_insr_fee;
	}

	public String getTotal_fee(){
		return this.total_fee;
	}

	public String getCal_pay_amt(){
		return this.cal_pay_amt;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getInsd_dept_cd(){
		return this.insd_dept_cd;
	}
}

/* 작성시간 : Fri Oct 23 15:39:44 KST 2009 */
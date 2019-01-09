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


public class HD_SALY_3502_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String occr_dt;
	public String total_amt;
	public String incm_tax;
	public String res_tax;
	public String emp_insr_fee;
	public String total_fee;
	public String cal_pay_amt;
	public String cmpy_cd;
	public String gugcd;
	public String gugcd_nm;
	public String bucd;
	public String bucd_nm;
	public String dept_cd;
	public String dept_nm;
	public String emp_no;
	public String flnm;
	public String emp_flnm;

	public HD_SALY_3502_LCURLISTRecord(){}

	public void setOccr_dt(String occr_dt){
		this.occr_dt = occr_dt;
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

	public void setGugcd(String gugcd){
		this.gugcd = gugcd;
	}

	public void setGugcd_nm(String gugcd_nm){
		this.gugcd_nm = gugcd_nm;
	}

	public void setBucd(String bucd){
		this.bucd = bucd;
	}

	public void setBucd_nm(String bucd_nm){
		this.bucd_nm = bucd_nm;
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

	public void setFlnm(String flnm){
		this.flnm = flnm;
	}

	public void setEmp_flnm(String emp_flnm){
		this.emp_flnm = emp_flnm;
	}

	public String getOccr_dt(){
		return this.occr_dt;
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

	public String getGugcd(){
		return this.gugcd;
	}

	public String getGugcd_nm(){
		return this.gugcd_nm;
	}

	public String getBucd(){
		return this.bucd;
	}

	public String getBucd_nm(){
		return this.bucd_nm;
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

	public String getFlnm(){
		return this.flnm;
	}

	public String getEmp_flnm(){
		return this.emp_flnm;
	}
}

/* 작성시간 : Fri Oct 23 15:51:00 KST 2009 */
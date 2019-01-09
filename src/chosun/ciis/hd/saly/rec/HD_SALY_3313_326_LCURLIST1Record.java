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


public class HD_SALY_3313_326_LCURLIST1Record extends java.lang.Object implements java.io.Serializable{

	public String cmpy_cd;
	public String emp_no;
	public String dept_cd;
	public String dept_nm;
	public String flnm;
	public String etc_saly_nm;
	public String etc_saly_cd;
	public String etc_saly_amt;
	public String incm_tax;
	public String res_tax;
	public String cal_pay_amt;
	public String emp_insr_fee;
	public String np_fee;
	public String hlth_insr_fee;

	public HD_SALY_3313_326_LCURLIST1Record(){}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setDept_nm(String dept_nm){
		this.dept_nm = dept_nm;
	}

	public void setFlnm(String flnm){
		this.flnm = flnm;
	}

	public void setEtc_saly_nm(String etc_saly_nm){
		this.etc_saly_nm = etc_saly_nm;
	}

	public void setEtc_saly_cd(String etc_saly_cd){
		this.etc_saly_cd = etc_saly_cd;
	}

	public void setEtc_saly_amt(String etc_saly_amt){
		this.etc_saly_amt = etc_saly_amt;
	}

	public void setIncm_tax(String incm_tax){
		this.incm_tax = incm_tax;
	}

	public void setRes_tax(String res_tax){
		this.res_tax = res_tax;
	}

	public void setCal_pay_amt(String cal_pay_amt){
		this.cal_pay_amt = cal_pay_amt;
	}

	public void setEmp_insr_fee(String emp_insr_fee){
		this.emp_insr_fee = emp_insr_fee;
	}

	public void setNp_fee(String np_fee){
		this.np_fee = np_fee;
	}

	public void setHlth_insr_fee(String hlth_insr_fee){
		this.hlth_insr_fee = hlth_insr_fee;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getDept_nm(){
		return this.dept_nm;
	}

	public String getFlnm(){
		return this.flnm;
	}

	public String getEtc_saly_nm(){
		return this.etc_saly_nm;
	}

	public String getEtc_saly_cd(){
		return this.etc_saly_cd;
	}

	public String getEtc_saly_amt(){
		return this.etc_saly_amt;
	}

	public String getIncm_tax(){
		return this.incm_tax;
	}

	public String getRes_tax(){
		return this.res_tax;
	}

	public String getCal_pay_amt(){
		return this.cal_pay_amt;
	}

	public String getEmp_insr_fee(){
		return this.emp_insr_fee;
	}

	public String getNp_fee(){
		return this.np_fee;
	}

	public String getHlth_insr_fee(){
		return this.hlth_insr_fee;
	}
}

/* 작성시간 : Tue Apr 28 16:36:55 KST 2015 */
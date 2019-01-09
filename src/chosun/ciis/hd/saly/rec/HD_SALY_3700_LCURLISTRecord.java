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


package chosun.ciis.hd.saly.rec;

import java.sql.*;
import chosun.ciis.hd.saly.dm.*;
import chosun.ciis.hd.saly.ds.*;

/**
 * 
 */


public class HD_SALY_3700_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String dept_nm;
	public String emp_no;
	public String flnm;
	public String occr_dt;
	public String etc_saly_amt;
	public String incm_tax;
	public String res_tax;
	public String total_fee;
	public String total_amt;

	public HD_SALY_3700_LCURLISTRecord(){}

	public void setDept_nm(String dept_nm){
		this.dept_nm = dept_nm;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setFlnm(String flnm){
		this.flnm = flnm;
	}

	public void setOccr_dt(String occr_dt){
		this.occr_dt = occr_dt;
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

	public void setTotal_fee(String total_fee){
		this.total_fee = total_fee;
	}

	public void setTotal_amt(String total_amt){
		this.total_amt = total_amt;
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

	public String getOccr_dt(){
		return this.occr_dt;
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

	public String getTotal_fee(){
		return this.total_fee;
	}

	public String getTotal_amt(){
		return this.total_amt;
	}
}

/* 작성시간 : Fri Sep 22 15:39:05 KST 2017 */
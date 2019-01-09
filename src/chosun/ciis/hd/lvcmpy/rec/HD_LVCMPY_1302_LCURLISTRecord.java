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


package chosun.ciis.hd.lvcmpy.rec;

import java.sql.*;
import chosun.ciis.hd.lvcmpy.dm.*;
import chosun.ciis.hd.lvcmpy.ds.*;

/**
 * 
 */


public class HD_LVCMPY_1302_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String lvcmpy_mm_np;
	public String lvcmpy_mm_hlth_insr;
	public String lvcmpy_mm_emp_insr;
	public String emp_insr_fee_drbk_amt;
	public String cnt;

	public HD_LVCMPY_1302_LCURLISTRecord(){}

	public void setLvcmpy_mm_np(String lvcmpy_mm_np){
		this.lvcmpy_mm_np = lvcmpy_mm_np;
	}

	public void setLvcmpy_mm_hlth_insr(String lvcmpy_mm_hlth_insr){
		this.lvcmpy_mm_hlth_insr = lvcmpy_mm_hlth_insr;
	}

	public void setLvcmpy_mm_emp_insr(String lvcmpy_mm_emp_insr){
		this.lvcmpy_mm_emp_insr = lvcmpy_mm_emp_insr;
	}

	public void setEmp_insr_fee_drbk_amt(String emp_insr_fee_drbk_amt){
		this.emp_insr_fee_drbk_amt = emp_insr_fee_drbk_amt;
	}

	public void setCnt(String cnt){
		this.cnt = cnt;
	}

	public String getLvcmpy_mm_np(){
		return this.lvcmpy_mm_np;
	}

	public String getLvcmpy_mm_hlth_insr(){
		return this.lvcmpy_mm_hlth_insr;
	}

	public String getLvcmpy_mm_emp_insr(){
		return this.lvcmpy_mm_emp_insr;
	}

	public String getEmp_insr_fee_drbk_amt(){
		return this.emp_insr_fee_drbk_amt;
	}

	public String getCnt(){
		return this.cnt;
	}
}

/* 작성시간 : Mon Sep 07 22:29:44 KST 2009 */
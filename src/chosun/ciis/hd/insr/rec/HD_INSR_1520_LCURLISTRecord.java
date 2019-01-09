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


package chosun.ciis.hd.insr.rec;

import java.sql.*;
import chosun.ciis.hd.insr.dm.*;
import chosun.ciis.hd.insr.ds.*;

/**
 * 
 */


public class HD_INSR_1520_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String emp_no;
	public String slf_burd_amt;
	public String cmpy_burd_amt;
	public String emp_insr_fee;

	public HD_INSR_1520_LCURLISTRecord(){}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setSlf_burd_amt(String slf_burd_amt){
		this.slf_burd_amt = slf_burd_amt;
	}

	public void setCmpy_burd_amt(String cmpy_burd_amt){
		this.cmpy_burd_amt = cmpy_burd_amt;
	}

	public void setEmp_insr_fee(String emp_insr_fee){
		this.emp_insr_fee = emp_insr_fee;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getSlf_burd_amt(){
		return this.slf_burd_amt;
	}

	public String getCmpy_burd_amt(){
		return this.cmpy_burd_amt;
	}

	public String getEmp_insr_fee(){
		return this.emp_insr_fee;
	}
}

/* 작성시간 : Fri Oct 04 14:34:46 KST 2013 */
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


public class HD_LVCMPY_2606_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String emp_no;
	public String ernm;
	public String ern_no;
	public String acct_no;
	public String lgl_rcpm_amt;
	public String rcpm_amt;
	public String rcpm_dt;
	public String mtry_dt;
	public String irp_amt;

	public HD_LVCMPY_2606_LCURLISTRecord(){}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setErnm(String ernm){
		this.ernm = ernm;
	}

	public void setErn_no(String ern_no){
		this.ern_no = ern_no;
	}

	public void setAcct_no(String acct_no){
		this.acct_no = acct_no;
	}

	public void setLgl_rcpm_amt(String lgl_rcpm_amt){
		this.lgl_rcpm_amt = lgl_rcpm_amt;
	}

	public void setRcpm_amt(String rcpm_amt){
		this.rcpm_amt = rcpm_amt;
	}

	public void setRcpm_dt(String rcpm_dt){
		this.rcpm_dt = rcpm_dt;
	}

	public void setMtry_dt(String mtry_dt){
		this.mtry_dt = mtry_dt;
	}

	public void setIrp_amt(String irp_amt){
		this.irp_amt = irp_amt;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getErnm(){
		return this.ernm;
	}

	public String getErn_no(){
		return this.ern_no;
	}

	public String getAcct_no(){
		return this.acct_no;
	}

	public String getLgl_rcpm_amt(){
		return this.lgl_rcpm_amt;
	}

	public String getRcpm_amt(){
		return this.rcpm_amt;
	}

	public String getRcpm_dt(){
		return this.rcpm_dt;
	}

	public String getMtry_dt(){
		return this.mtry_dt;
	}

	public String getIrp_amt(){
		return this.irp_amt;
	}
}

/* 작성시간 : Tue Mar 12 20:43:21 KST 2013 */
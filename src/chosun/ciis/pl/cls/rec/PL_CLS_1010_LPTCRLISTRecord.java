/***************************************************************************************************
* 파일명 : 
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


package chosun.ciis.pl.cls.rec;

import java.sql.*;
import chosun.ciis.pl.cls.dm.*;
import chosun.ciis.pl.cls.ds.*;

/**
 * 
 */


public class PL_CLS_1010_LPTCRLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String basi_dt;
	public String slip_no;
	public String rcpm_amt;
	public String retn_amt;
	public String meda_amt;
	public String clos_yn;
	public String clos_pers_emp_no;

	public PL_CLS_1010_LPTCRLISTRecord(){}

	public void setBasi_dt(String basi_dt){
		this.basi_dt = basi_dt;
	}

	public void setSlip_no(String slip_no){
		this.slip_no = slip_no;
	}

	public void setRcpm_amt(String rcpm_amt){
		this.rcpm_amt = rcpm_amt;
	}

	public void setRetn_amt(String retn_amt){
		this.retn_amt = retn_amt;
	}

	public void setMeda_amt(String meda_amt){
		this.meda_amt = meda_amt;
	}

	public void setClos_yn(String clos_yn){
		this.clos_yn = clos_yn;
	}

	public void setClos_pers_emp_no(String clos_pers_emp_no){
		this.clos_pers_emp_no = clos_pers_emp_no;
	}

	public String getBasi_dt(){
		return this.basi_dt;
	}

	public String getSlip_no(){
		return this.slip_no;
	}

	public String getRcpm_amt(){
		return this.rcpm_amt;
	}

	public String getRetn_amt(){
		return this.retn_amt;
	}

	public String getMeda_amt(){
		return this.meda_amt;
	}

	public String getClos_yn(){
		return this.clos_yn;
	}

	public String getClos_pers_emp_no(){
		return this.clos_pers_emp_no;
	}
}

/* 작성시간 : Wed Sep 16 16:46:24 KST 2009 */
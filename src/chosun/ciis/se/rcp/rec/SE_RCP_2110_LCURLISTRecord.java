/***************************************************************************************************
* 파일명 : .java
* 기능 : 판매시스템
* 작성일자 : 2009-02-18
* 작성자 : 배창희
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.se.rcp.rec;

import java.sql.*;
import chosun.ciis.se.rcp.dm.*;
import chosun.ciis.se.rcp.ds.*;

/**
 * 
 */


public class SE_RCP_2110_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String rcpm_dt;
	public String slip_number;
	public String bo_nm;
	public String budg_nm1;
	public String d_amt;
	public String budg_nm2;
	public String c_amt;
	public String bank_nm;
	public String rcpm_shet_no;

	public SE_RCP_2110_LCURLISTRecord(){}

	public void setRcpm_dt(String rcpm_dt){
		this.rcpm_dt = rcpm_dt;
	}

	public void setSlip_number(String slip_number){
		this.slip_number = slip_number;
	}

	public void setBo_nm(String bo_nm){
		this.bo_nm = bo_nm;
	}

	public void setBudg_nm1(String budg_nm1){
		this.budg_nm1 = budg_nm1;
	}

	public void setD_amt(String d_amt){
		this.d_amt = d_amt;
	}

	public void setBudg_nm2(String budg_nm2){
		this.budg_nm2 = budg_nm2;
	}

	public void setC_amt(String c_amt){
		this.c_amt = c_amt;
	}

	public void setBank_nm(String bank_nm){
		this.bank_nm = bank_nm;
	}

	public void setRcpm_shet_no(String rcpm_shet_no){
		this.rcpm_shet_no = rcpm_shet_no;
	}

	public String getRcpm_dt(){
		return this.rcpm_dt;
	}

	public String getSlip_number(){
		return this.slip_number;
	}

	public String getBo_nm(){
		return this.bo_nm;
	}

	public String getBudg_nm1(){
		return this.budg_nm1;
	}

	public String getD_amt(){
		return this.d_amt;
	}

	public String getBudg_nm2(){
		return this.budg_nm2;
	}

	public String getC_amt(){
		return this.c_amt;
	}

	public String getBank_nm(){
		return this.bank_nm;
	}

	public String getRcpm_shet_no(){
		return this.rcpm_shet_no;
	}
}

/* 작성시간 : Thu May 07 17:38:48 KST 2009 */
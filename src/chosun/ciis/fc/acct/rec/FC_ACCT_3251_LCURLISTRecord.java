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


package chosun.ciis.fc.acct.rec;

import java.sql.*;
import chosun.ciis.fc.acct.dm.*;
import chosun.ciis.fc.acct.ds.*;

/**
 * 
 */


public class FC_ACCT_3251_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String clam_dept_cd;
	public String pch_cgbuseonm;
	public String incmg_emp_no;
	public String pch_irjnm;
	public String incmg_dt;
	public String fisc_dt;
	public String reso_amt;
	public String reso_amt_ch;

	public FC_ACCT_3251_LCURLISTRecord(){}

	public void setClam_dept_cd(String clam_dept_cd){
		this.clam_dept_cd = clam_dept_cd;
	}

	public void setPch_cgbuseonm(String pch_cgbuseonm){
		this.pch_cgbuseonm = pch_cgbuseonm;
	}

	public void setIncmg_emp_no(String incmg_emp_no){
		this.incmg_emp_no = incmg_emp_no;
	}

	public void setPch_irjnm(String pch_irjnm){
		this.pch_irjnm = pch_irjnm;
	}

	public void setIncmg_dt(String incmg_dt){
		this.incmg_dt = incmg_dt;
	}

	public void setFisc_dt(String fisc_dt){
		this.fisc_dt = fisc_dt;
	}

	public void setReso_amt(String reso_amt){
		this.reso_amt = reso_amt;
	}

	public void setReso_amt_ch(String reso_amt_ch){
		this.reso_amt_ch = reso_amt_ch;
	}

	public String getClam_dept_cd(){
		return this.clam_dept_cd;
	}

	public String getPch_cgbuseonm(){
		return this.pch_cgbuseonm;
	}

	public String getIncmg_emp_no(){
		return this.incmg_emp_no;
	}

	public String getPch_irjnm(){
		return this.pch_irjnm;
	}

	public String getIncmg_dt(){
		return this.incmg_dt;
	}

	public String getFisc_dt(){
		return this.fisc_dt;
	}

	public String getReso_amt(){
		return this.reso_amt;
	}

	public String getReso_amt_ch(){
		return this.reso_amt_ch;
	}
}

/* 작성시간 : Thu Sep 03 16:18:25 KST 2015 */
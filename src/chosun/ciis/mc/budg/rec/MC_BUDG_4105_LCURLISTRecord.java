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


package chosun.ciis.mc.budg.rec;

import java.sql.*;
import chosun.ciis.mc.budg.dm.*;
import chosun.ciis.mc.budg.ds.*;

/**
 * 
 */


public class MC_BUDG_4105_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String dept_nm;
	public String budg_cd;
	public String budg_req_amt;
	public String fix_asin_amt;
	public String last_asin_amt;
	public String budg_ask_amt;
	public String budg_cndt_amt;

	public MC_BUDG_4105_LCURLISTRecord(){}

	public void setDept_nm(String dept_nm){
		this.dept_nm = dept_nm;
	}

	public void setBudg_cd(String budg_cd){
		this.budg_cd = budg_cd;
	}

	public void setBudg_req_amt(String budg_req_amt){
		this.budg_req_amt = budg_req_amt;
	}

	public void setFix_asin_amt(String fix_asin_amt){
		this.fix_asin_amt = fix_asin_amt;
	}

	public void setLast_asin_amt(String last_asin_amt){
		this.last_asin_amt = last_asin_amt;
	}

	public void setBudg_ask_amt(String budg_ask_amt){
		this.budg_ask_amt = budg_ask_amt;
	}

	public void setBudg_cndt_amt(String budg_cndt_amt){
		this.budg_cndt_amt = budg_cndt_amt;
	}

	public String getDept_nm(){
		return this.dept_nm;
	}

	public String getBudg_cd(){
		return this.budg_cd;
	}

	public String getBudg_req_amt(){
		return this.budg_req_amt;
	}

	public String getFix_asin_amt(){
		return this.fix_asin_amt;
	}

	public String getLast_asin_amt(){
		return this.last_asin_amt;
	}

	public String getBudg_ask_amt(){
		return this.budg_ask_amt;
	}

	public String getBudg_cndt_amt(){
		return this.budg_cndt_amt;
	}
}

/* 작성시간 : Tue Jun 02 16:07:15 KST 2009 */
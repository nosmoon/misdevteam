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


package chosun.ciis.mc.cost.rec;

import java.sql.*;
import chosun.ciis.mc.cost.dm.*;
import chosun.ciis.mc.cost.ds.*;

/**
 * 
 */


public class MC_COST_3000_ACURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String clas_nm;
	public String budg_cd;
	public String budg_nm;
	public String acct_cd;
	public String medi_cd;
	public String medi_nm;
	public String use_dept_cd;
	public String use_dept_nm;
	public String amt;
	public String qty;

	public MC_COST_3000_ACURLISTRecord(){}

	public void setClas_nm(String clas_nm){
		this.clas_nm = clas_nm;
	}

	public void setBudg_cd(String budg_cd){
		this.budg_cd = budg_cd;
	}

	public void setBudg_nm(String budg_nm){
		this.budg_nm = budg_nm;
	}

	public void setAcct_cd(String acct_cd){
		this.acct_cd = acct_cd;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setMedi_nm(String medi_nm){
		this.medi_nm = medi_nm;
	}

	public void setUse_dept_cd(String use_dept_cd){
		this.use_dept_cd = use_dept_cd;
	}

	public void setUse_dept_nm(String use_dept_nm){
		this.use_dept_nm = use_dept_nm;
	}

	public void setAmt(String amt){
		this.amt = amt;
	}

	public void setQty(String qty){
		this.qty = qty;
	}

	public String getClas_nm(){
		return this.clas_nm;
	}

	public String getBudg_cd(){
		return this.budg_cd;
	}

	public String getBudg_nm(){
		return this.budg_nm;
	}

	public String getAcct_cd(){
		return this.acct_cd;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getMedi_nm(){
		return this.medi_nm;
	}

	public String getUse_dept_cd(){
		return this.use_dept_cd;
	}

	public String getUse_dept_nm(){
		return this.use_dept_nm;
	}

	public String getAmt(){
		return this.amt;
	}

	public String getQty(){
		return this.qty;
	}
}

/* 작성시간 : Fri May 08 14:31:01 KST 2009 */
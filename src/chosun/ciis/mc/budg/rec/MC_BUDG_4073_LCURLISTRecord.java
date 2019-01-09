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


public class MC_BUDG_4073_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String dept_cd;
	public String work_dt;
	public String hsty_no;
	public String rmks2;
	public String sub_no;
	public String evnt_cd;
	public String budg_cd;
	public String budg_yymm;
	public String use_dept_cd;
	public String medi_cd;
	public String rmks;
	public String yramt;
	public String amt;

	public MC_BUDG_4073_LCURLISTRecord(){}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setWork_dt(String work_dt){
		this.work_dt = work_dt;
	}

	public void setHsty_no(String hsty_no){
		this.hsty_no = hsty_no;
	}

	public void setRmks2(String rmks2){
		this.rmks2 = rmks2;
	}

	public void setSub_no(String sub_no){
		this.sub_no = sub_no;
	}

	public void setEvnt_cd(String evnt_cd){
		this.evnt_cd = evnt_cd;
	}

	public void setBudg_cd(String budg_cd){
		this.budg_cd = budg_cd;
	}

	public void setBudg_yymm(String budg_yymm){
		this.budg_yymm = budg_yymm;
	}

	public void setUse_dept_cd(String use_dept_cd){
		this.use_dept_cd = use_dept_cd;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setRmks(String rmks){
		this.rmks = rmks;
	}

	public void setYramt(String yramt){
		this.yramt = yramt;
	}

	public void setAmt(String amt){
		this.amt = amt;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getWork_dt(){
		return this.work_dt;
	}

	public String getHsty_no(){
		return this.hsty_no;
	}

	public String getRmks2(){
		return this.rmks2;
	}

	public String getSub_no(){
		return this.sub_no;
	}

	public String getEvnt_cd(){
		return this.evnt_cd;
	}

	public String getBudg_cd(){
		return this.budg_cd;
	}

	public String getBudg_yymm(){
		return this.budg_yymm;
	}

	public String getUse_dept_cd(){
		return this.use_dept_cd;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getRmks(){
		return this.rmks;
	}

	public String getYramt(){
		return this.yramt;
	}

	public String getAmt(){
		return this.amt;
	}
}

/* 작성시간 : Mon May 11 20:24:17 KST 2009 */
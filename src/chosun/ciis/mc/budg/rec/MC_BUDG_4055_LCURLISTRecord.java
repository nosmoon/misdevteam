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


public class MC_BUDG_4055_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String evnt_cd;
	public String evnt_nm;
	public String work_no;
	public String budg_yymm;
	public String use_dept_cd;
	public String dept_cdnm;
	public String yramt;
	public String amt;

	public MC_BUDG_4055_LCURLISTRecord(){}

	public void setEvnt_cd(String evnt_cd){
		this.evnt_cd = evnt_cd;
	}

	public void setEvnt_nm(String evnt_nm){
		this.evnt_nm = evnt_nm;
	}

	public void setWork_no(String work_no){
		this.work_no = work_no;
	}

	public void setBudg_yymm(String budg_yymm){
		this.budg_yymm = budg_yymm;
	}

	public void setUse_dept_cd(String use_dept_cd){
		this.use_dept_cd = use_dept_cd;
	}

	public void setDept_cdnm(String dept_cdnm){
		this.dept_cdnm = dept_cdnm;
	}

	public void setYramt(String yramt){
		this.yramt = yramt;
	}

	public void setAmt(String amt){
		this.amt = amt;
	}

	public String getEvnt_cd(){
		return this.evnt_cd;
	}

	public String getEvnt_nm(){
		return this.evnt_nm;
	}

	public String getWork_no(){
		return this.work_no;
	}

	public String getBudg_yymm(){
		return this.budg_yymm;
	}

	public String getUse_dept_cd(){
		return this.use_dept_cd;
	}

	public String getDept_cdnm(){
		return this.dept_cdnm;
	}

	public String getYramt(){
		return this.yramt;
	}

	public String getAmt(){
		return this.amt;
	}
}

/* 작성시간 : Mon Jun 01 19:26:45 KST 2009 */
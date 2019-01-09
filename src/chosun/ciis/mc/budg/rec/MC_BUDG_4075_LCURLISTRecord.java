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


public class MC_BUDG_4075_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String dept_cd;
	public String work_dt;
	public String hsty_no;
	public String rmks2;
	public String yramt;
	public String amt;

	public MC_BUDG_4075_LCURLISTRecord(){}

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

	public String getYramt(){
		return this.yramt;
	}

	public String getAmt(){
		return this.amt;
	}
}

/* 작성시간 : Mon May 11 20:24:17 KST 2009 */
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


public class MC_BUDG_4021_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String rmks2;
	public String budg_yymm;
	public String budg_cd;
	public String budg_nm;
	public String evnt_cd;
	public String evnt_nm;
	public String incmg_pers;
	public String yramt;
	public String amt;

	public MC_BUDG_4021_LCURLISTRecord(){}

	public void setRmks2(String rmks2){
		this.rmks2 = rmks2;
	}

	public void setBudg_yymm(String budg_yymm){
		this.budg_yymm = budg_yymm;
	}

	public void setBudg_cd(String budg_cd){
		this.budg_cd = budg_cd;
	}

	public void setBudg_nm(String budg_nm){
		this.budg_nm = budg_nm;
	}

	public void setEvnt_cd(String evnt_cd){
		this.evnt_cd = evnt_cd;
	}

	public void setEvnt_nm(String evnt_nm){
		this.evnt_nm = evnt_nm;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setYramt(String yramt){
		this.yramt = yramt;
	}

	public void setAmt(String amt){
		this.amt = amt;
	}

	public String getRmks2(){
		return this.rmks2;
	}

	public String getBudg_yymm(){
		return this.budg_yymm;
	}

	public String getBudg_cd(){
		return this.budg_cd;
	}

	public String getBudg_nm(){
		return this.budg_nm;
	}

	public String getEvnt_cd(){
		return this.evnt_cd;
	}

	public String getEvnt_nm(){
		return this.evnt_nm;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getYramt(){
		return this.yramt;
	}

	public String getAmt(){
		return this.amt;
	}
}

/* 작성시간 : Fri May 22 10:20:54 KST 2009 */
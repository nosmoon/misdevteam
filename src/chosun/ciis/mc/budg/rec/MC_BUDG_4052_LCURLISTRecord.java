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


public class MC_BUDG_4052_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String amt_s;
	public String work_dt;
	public String budg_cd;
	public String budg_nm;
	public String rmks;
	public String yramt;
	public String amt;
	public String hsty_no;
	public String sub_no;
	public String fix_asin_amt;

	public MC_BUDG_4052_LCURLISTRecord(){}

	public void setAmt_s(String amt_s){
		this.amt_s = amt_s;
	}

	public void setWork_dt(String work_dt){
		this.work_dt = work_dt;
	}

	public void setBudg_cd(String budg_cd){
		this.budg_cd = budg_cd;
	}

	public void setBudg_nm(String budg_nm){
		this.budg_nm = budg_nm;
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

	public void setHsty_no(String hsty_no){
		this.hsty_no = hsty_no;
	}

	public void setSub_no(String sub_no){
		this.sub_no = sub_no;
	}

	public void setFix_asin_amt(String fix_asin_amt){
		this.fix_asin_amt = fix_asin_amt;
	}

	public String getAmt_s(){
		return this.amt_s;
	}

	public String getWork_dt(){
		return this.work_dt;
	}

	public String getBudg_cd(){
		return this.budg_cd;
	}

	public String getBudg_nm(){
		return this.budg_nm;
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

	public String getHsty_no(){
		return this.hsty_no;
	}

	public String getSub_no(){
		return this.sub_no;
	}

	public String getFix_asin_amt(){
		return this.fix_asin_amt;
	}
}

/* 작성시간 : Tue Jun 02 10:54:36 KST 2009 */
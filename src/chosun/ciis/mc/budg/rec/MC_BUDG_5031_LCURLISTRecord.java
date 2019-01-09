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


public class MC_BUDG_5031_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String chk1;
	public String budg_cd;
	public String budg_nm;
	public String evnt_cd;
	public String evnt_nm;
	public String last_asin_amt;
	public String budg_ask_amt;
	public String budg_cndt_amt;
	public String amt1;
	public String amt2;

	public MC_BUDG_5031_LCURLISTRecord(){}

	public void setChk1(String chk1){
		this.chk1 = chk1;
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

	public void setLast_asin_amt(String last_asin_amt){
		this.last_asin_amt = last_asin_amt;
	}

	public void setBudg_ask_amt(String budg_ask_amt){
		this.budg_ask_amt = budg_ask_amt;
	}

	public void setBudg_cndt_amt(String budg_cndt_amt){
		this.budg_cndt_amt = budg_cndt_amt;
	}

	public void setAmt1(String amt1){
		this.amt1 = amt1;
	}

	public void setAmt2(String amt2){
		this.amt2 = amt2;
	}

	public String getChk1(){
		return this.chk1;
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

	public String getLast_asin_amt(){
		return this.last_asin_amt;
	}

	public String getBudg_ask_amt(){
		return this.budg_ask_amt;
	}

	public String getBudg_cndt_amt(){
		return this.budg_cndt_amt;
	}

	public String getAmt1(){
		return this.amt1;
	}

	public String getAmt2(){
		return this.amt2;
	}
}

/* 작성시간 : Mon Jul 13 15:28:19 KST 2009 */
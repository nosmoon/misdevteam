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


public class MC_BUDG_6011_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String chk_col1;
	public String budg_clas_cd;
	public String ycbrnm;
	public String chk_col4;
	public String buseocd;
	public String buseocdnm;
	public String budg_req_amt;
	public String in_amt;
	public String amt;
	public String amt2;
	public String rate;

	public MC_BUDG_6011_LCURLISTRecord(){}

	public void setChk_col1(String chk_col1){
		this.chk_col1 = chk_col1;
	}

	public void setBudg_clas_cd(String budg_clas_cd){
		this.budg_clas_cd = budg_clas_cd;
	}

	public void setYcbrnm(String ycbrnm){
		this.ycbrnm = ycbrnm;
	}

	public void setChk_col4(String chk_col4){
		this.chk_col4 = chk_col4;
	}

	public void setBuseocd(String buseocd){
		this.buseocd = buseocd;
	}

	public void setBuseocdnm(String buseocdnm){
		this.buseocdnm = buseocdnm;
	}

	public void setBudg_req_amt(String budg_req_amt){
		this.budg_req_amt = budg_req_amt;
	}

	public void setIn_amt(String in_amt){
		this.in_amt = in_amt;
	}

	public void setAmt(String amt){
		this.amt = amt;
	}

	public void setAmt2(String amt2){
		this.amt2 = amt2;
	}

	public void setRate(String rate){
		this.rate = rate;
	}

	public String getChk_col1(){
		return this.chk_col1;
	}

	public String getBudg_clas_cd(){
		return this.budg_clas_cd;
	}

	public String getYcbrnm(){
		return this.ycbrnm;
	}

	public String getChk_col4(){
		return this.chk_col4;
	}

	public String getBuseocd(){
		return this.buseocd;
	}

	public String getBuseocdnm(){
		return this.buseocdnm;
	}

	public String getBudg_req_amt(){
		return this.budg_req_amt;
	}

	public String getIn_amt(){
		return this.in_amt;
	}

	public String getAmt(){
		return this.amt;
	}

	public String getAmt2(){
		return this.amt2;
	}

	public String getRate(){
		return this.rate;
	}
}

/* 작성시간 : Wed Jul 01 11:53:50 KST 2009 */
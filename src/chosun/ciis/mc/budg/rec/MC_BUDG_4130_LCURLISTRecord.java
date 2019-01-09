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


public class MC_BUDG_4130_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String kind;
	public String budg_yymm;
	public String chg_prv_dept_cd;
	public String chg_aft_dept_cd;
	public String budg_cd;
	public String budg_cdnm;
	public String chg_ratio;
	public String budg_req_amt;
	public String fix_asin_amt;
	public String last_asin_amt;
	public String budg_ask_amt;
	public String budg_cndt_amt;
	public String budg_req_amt_1;
	public String fix_asin_amt_1;
	public String last_asin_amt_1;
	public String budg_ask_amt_1;
	public String budg_cndt_amt_1;

	public MC_BUDG_4130_LCURLISTRecord(){}

	public void setKind(String kind){
		this.kind = kind;
	}

	public void setBudg_yymm(String budg_yymm){
		this.budg_yymm = budg_yymm;
	}

	public void setChg_prv_dept_cd(String chg_prv_dept_cd){
		this.chg_prv_dept_cd = chg_prv_dept_cd;
	}

	public void setChg_aft_dept_cd(String chg_aft_dept_cd){
		this.chg_aft_dept_cd = chg_aft_dept_cd;
	}

	public void setBudg_cd(String budg_cd){
		this.budg_cd = budg_cd;
	}

	public void setBudg_cdnm(String budg_cdnm){
		this.budg_cdnm = budg_cdnm;
	}

	public void setChg_ratio(String chg_ratio){
		this.chg_ratio = chg_ratio;
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

	public void setBudg_req_amt_1(String budg_req_amt_1){
		this.budg_req_amt_1 = budg_req_amt_1;
	}

	public void setFix_asin_amt_1(String fix_asin_amt_1){
		this.fix_asin_amt_1 = fix_asin_amt_1;
	}

	public void setLast_asin_amt_1(String last_asin_amt_1){
		this.last_asin_amt_1 = last_asin_amt_1;
	}

	public void setBudg_ask_amt_1(String budg_ask_amt_1){
		this.budg_ask_amt_1 = budg_ask_amt_1;
	}

	public void setBudg_cndt_amt_1(String budg_cndt_amt_1){
		this.budg_cndt_amt_1 = budg_cndt_amt_1;
	}

	public String getKind(){
		return this.kind;
	}

	public String getBudg_yymm(){
		return this.budg_yymm;
	}

	public String getChg_prv_dept_cd(){
		return this.chg_prv_dept_cd;
	}

	public String getChg_aft_dept_cd(){
		return this.chg_aft_dept_cd;
	}

	public String getBudg_cd(){
		return this.budg_cd;
	}

	public String getBudg_cdnm(){
		return this.budg_cdnm;
	}

	public String getChg_ratio(){
		return this.chg_ratio;
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

	public String getBudg_req_amt_1(){
		return this.budg_req_amt_1;
	}

	public String getFix_asin_amt_1(){
		return this.fix_asin_amt_1;
	}

	public String getLast_asin_amt_1(){
		return this.last_asin_amt_1;
	}

	public String getBudg_ask_amt_1(){
		return this.budg_ask_amt_1;
	}

	public String getBudg_cndt_amt_1(){
		return this.budg_cndt_amt_1;
	}
}

/* 작성시간 : Tue Aug 25 21:12:11 KST 2009 */
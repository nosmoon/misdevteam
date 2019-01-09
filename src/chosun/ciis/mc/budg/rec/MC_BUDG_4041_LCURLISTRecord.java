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


public class MC_BUDG_4041_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String budg_yymm;
	public String evnt_cd;
	public String evnt_nm;
	public String budg_cd;
	public String ys_ysnm_ghyscd;
	public String budg_req_amt;
	public String last_asin_amt;
	public String fix_asin_amt;
	public String divycamt;
	public String divhjamt;

	public MC_BUDG_4041_LCURLISTRecord(){}

	public void setBudg_yymm(String budg_yymm){
		this.budg_yymm = budg_yymm;
	}

	public void setEvnt_cd(String evnt_cd){
		this.evnt_cd = evnt_cd;
	}

	public void setEvnt_nm(String evnt_nm){
		this.evnt_nm = evnt_nm;
	}

	public void setBudg_cd(String budg_cd){
		this.budg_cd = budg_cd;
	}

	public void setYs_ysnm_ghyscd(String ys_ysnm_ghyscd){
		this.ys_ysnm_ghyscd = ys_ysnm_ghyscd;
	}

	public void setBudg_req_amt(String budg_req_amt){
		this.budg_req_amt = budg_req_amt;
	}

	public void setLast_asin_amt(String last_asin_amt){
		this.last_asin_amt = last_asin_amt;
	}

	public void setFix_asin_amt(String fix_asin_amt){
		this.fix_asin_amt = fix_asin_amt;
	}

	public void setDivycamt(String divycamt){
		this.divycamt = divycamt;
	}

	public void setDivhjamt(String divhjamt){
		this.divhjamt = divhjamt;
	}

	public String getBudg_yymm(){
		return this.budg_yymm;
	}

	public String getEvnt_cd(){
		return this.evnt_cd;
	}

	public String getEvnt_nm(){
		return this.evnt_nm;
	}

	public String getBudg_cd(){
		return this.budg_cd;
	}

	public String getYs_ysnm_ghyscd(){
		return this.ys_ysnm_ghyscd;
	}

	public String getBudg_req_amt(){
		return this.budg_req_amt;
	}

	public String getLast_asin_amt(){
		return this.last_asin_amt;
	}

	public String getFix_asin_amt(){
		return this.fix_asin_amt;
	}

	public String getDivycamt(){
		return this.divycamt;
	}

	public String getDivhjamt(){
		return this.divhjamt;
	}
}

/* 작성시간 : Thu Apr 16 15:39:23 KST 2009 */
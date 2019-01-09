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


package chosun.ciis.en.innexp.rec;

import java.sql.*;
import chosun.ciis.en.innexp.dm.*;
import chosun.ciis.en.innexp.ds.*;

/**
 * 
 */


public class EN_INNEXP_1501_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String evnt_cd;
	public String evnt_nm;
	public String chrg_pers_nm;
	public String reven_occr_no;
	public String titl;
	public String budg_cd_dr;
	public String budg_nm_dr;
	public String amt_dr;
	public String budg_cd_cr;
	public String budg_nm_cr;
	public String amt_cr;

	public EN_INNEXP_1501_LCURLISTRecord(){}

	public void setEvnt_cd(String evnt_cd){
		this.evnt_cd = evnt_cd;
	}

	public void setEvnt_nm(String evnt_nm){
		this.evnt_nm = evnt_nm;
	}

	public void setChrg_pers_nm(String chrg_pers_nm){
		this.chrg_pers_nm = chrg_pers_nm;
	}

	public void setReven_occr_no(String reven_occr_no){
		this.reven_occr_no = reven_occr_no;
	}

	public void setTitl(String titl){
		this.titl = titl;
	}

	public void setBudg_cd_dr(String budg_cd_dr){
		this.budg_cd_dr = budg_cd_dr;
	}

	public void setBudg_nm_dr(String budg_nm_dr){
		this.budg_nm_dr = budg_nm_dr;
	}

	public void setAmt_dr(String amt_dr){
		this.amt_dr = amt_dr;
	}

	public void setBudg_cd_cr(String budg_cd_cr){
		this.budg_cd_cr = budg_cd_cr;
	}

	public void setBudg_nm_cr(String budg_nm_cr){
		this.budg_nm_cr = budg_nm_cr;
	}

	public void setAmt_cr(String amt_cr){
		this.amt_cr = amt_cr;
	}

	public String getEvnt_cd(){
		return this.evnt_cd;
	}

	public String getEvnt_nm(){
		return this.evnt_nm;
	}

	public String getChrg_pers_nm(){
		return this.chrg_pers_nm;
	}

	public String getReven_occr_no(){
		return this.reven_occr_no;
	}

	public String getTitl(){
		return this.titl;
	}

	public String getBudg_cd_dr(){
		return this.budg_cd_dr;
	}

	public String getBudg_nm_dr(){
		return this.budg_nm_dr;
	}

	public String getAmt_dr(){
		return this.amt_dr;
	}

	public String getBudg_cd_cr(){
		return this.budg_cd_cr;
	}

	public String getBudg_nm_cr(){
		return this.budg_nm_cr;
	}

	public String getAmt_cr(){
		return this.amt_cr;
	}
}

/* 작성시간 : Sun Apr 26 13:09:27 KST 2009 */
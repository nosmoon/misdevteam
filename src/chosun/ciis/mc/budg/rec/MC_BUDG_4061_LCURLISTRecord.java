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


public class MC_BUDG_4061_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String checked;
	public String budg_cd;
	public String budg_cdnm;
	public String amt_fr;
	public String fix_asin_amt;
	public String budg_ask_amt;
	public String budg_cndt_amt;
	public String rate;

	public MC_BUDG_4061_LCURLISTRecord(){}

	public void setChecked(String checked){
		this.checked = checked;
	}

	public void setBudg_cd(String budg_cd){
		this.budg_cd = budg_cd;
	}

	public void setBudg_cdnm(String budg_cdnm){
		this.budg_cdnm = budg_cdnm;
	}

	public void setAmt_fr(String amt_fr){
		this.amt_fr = amt_fr;
	}

	public void setFix_asin_amt(String fix_asin_amt){
		this.fix_asin_amt = fix_asin_amt;
	}

	public void setBudg_ask_amt(String budg_ask_amt){
		this.budg_ask_amt = budg_ask_amt;
	}

	public void setBudg_cndt_amt(String budg_cndt_amt){
		this.budg_cndt_amt = budg_cndt_amt;
	}

	public void setRate(String rate){
		this.rate = rate;
	}

	public String getChecked(){
		return this.checked;
	}

	public String getBudg_cd(){
		return this.budg_cd;
	}

	public String getBudg_cdnm(){
		return this.budg_cdnm;
	}

	public String getAmt_fr(){
		return this.amt_fr;
	}

	public String getFix_asin_amt(){
		return this.fix_asin_amt;
	}

	public String getBudg_ask_amt(){
		return this.budg_ask_amt;
	}

	public String getBudg_cndt_amt(){
		return this.budg_cndt_amt;
	}

	public String getRate(){
		return this.rate;
	}
}

/* 작성시간 : Tue May 19 10:26:51 KST 2009 */
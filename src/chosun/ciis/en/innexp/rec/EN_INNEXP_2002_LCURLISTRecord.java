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


public class EN_INNEXP_2002_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String budg_cd;
	public String budg_nm;
	public String budg_amt;
	public String stlm_amt;
	public String bal_amt;

	public EN_INNEXP_2002_LCURLISTRecord(){}

	public void setBudg_cd(String budg_cd){
		this.budg_cd = budg_cd;
	}

	public void setBudg_nm(String budg_nm){
		this.budg_nm = budg_nm;
	}

	public void setBudg_amt(String budg_amt){
		this.budg_amt = budg_amt;
	}

	public void setStlm_amt(String stlm_amt){
		this.stlm_amt = stlm_amt;
	}

	public void setBal_amt(String bal_amt){
		this.bal_amt = bal_amt;
	}

	public String getBudg_cd(){
		return this.budg_cd;
	}

	public String getBudg_nm(){
		return this.budg_nm;
	}

	public String getBudg_amt(){
		return this.budg_amt;
	}

	public String getStlm_amt(){
		return this.stlm_amt;
	}

	public String getBal_amt(){
		return this.bal_amt;
	}
}

/* 작성시간 : Wed Apr 29 18:05:10 KST 2009 */
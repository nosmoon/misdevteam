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


public class EN_INNEXP_1504_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String occr_no;
	public String titl;
	public String budg_cd;
	public String budg_nm;
	public String dr_amt;
	public String cr_amt;

	public EN_INNEXP_1504_LCURLISTRecord(){}

	public void setOccr_no(String occr_no){
		this.occr_no = occr_no;
	}

	public void setTitl(String titl){
		this.titl = titl;
	}

	public void setBudg_cd(String budg_cd){
		this.budg_cd = budg_cd;
	}

	public void setBudg_nm(String budg_nm){
		this.budg_nm = budg_nm;
	}

	public void setDr_amt(String dr_amt){
		this.dr_amt = dr_amt;
	}

	public void setCr_amt(String cr_amt){
		this.cr_amt = cr_amt;
	}

	public String getOccr_no(){
		return this.occr_no;
	}

	public String getTitl(){
		return this.titl;
	}

	public String getBudg_cd(){
		return this.budg_cd;
	}

	public String getBudg_nm(){
		return this.budg_nm;
	}

	public String getDr_amt(){
		return this.dr_amt;
	}

	public String getCr_amt(){
		return this.cr_amt;
	}
}

/* 작성시간 : Fri Apr 24 13:12:52 KST 2009 */
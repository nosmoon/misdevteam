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


public class EN_INNEXP_1502_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String occr_no;
	public String evnt_nm;
	public String dlco_nm;
	public String titl;
	public String dr_budg_cd;
	public String dr_budg_nm;
	public String dr_amt;
	public String cr_budg_cd;
	public String cr_budg_nm;
	public String cr_amt;

	public EN_INNEXP_1502_LCURLISTRecord(){}

	public void setOccr_no(String occr_no){
		this.occr_no = occr_no;
	}

	public void setEvnt_nm(String evnt_nm){
		this.evnt_nm = evnt_nm;
	}

	public void setDlco_nm(String dlco_nm){
		this.dlco_nm = dlco_nm;
	}

	public void setTitl(String titl){
		this.titl = titl;
	}

	public void setDr_budg_cd(String dr_budg_cd){
		this.dr_budg_cd = dr_budg_cd;
	}

	public void setDr_budg_nm(String dr_budg_nm){
		this.dr_budg_nm = dr_budg_nm;
	}

	public void setDr_amt(String dr_amt){
		this.dr_amt = dr_amt;
	}

	public void setCr_budg_cd(String cr_budg_cd){
		this.cr_budg_cd = cr_budg_cd;
	}

	public void setCr_budg_nm(String cr_budg_nm){
		this.cr_budg_nm = cr_budg_nm;
	}

	public void setCr_amt(String cr_amt){
		this.cr_amt = cr_amt;
	}

	public String getOccr_no(){
		return this.occr_no;
	}

	public String getEvnt_nm(){
		return this.evnt_nm;
	}

	public String getDlco_nm(){
		return this.dlco_nm;
	}

	public String getTitl(){
		return this.titl;
	}

	public String getDr_budg_cd(){
		return this.dr_budg_cd;
	}

	public String getDr_budg_nm(){
		return this.dr_budg_nm;
	}

	public String getDr_amt(){
		return this.dr_amt;
	}

	public String getCr_budg_cd(){
		return this.cr_budg_cd;
	}

	public String getCr_budg_nm(){
		return this.cr_budg_nm;
	}

	public String getCr_amt(){
		return this.cr_amt;
	}
}

/* 작성시간 : Fri Apr 24 09:48:07 KST 2009 */
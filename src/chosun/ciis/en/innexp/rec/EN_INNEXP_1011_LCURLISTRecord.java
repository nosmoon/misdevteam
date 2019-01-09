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


public class EN_INNEXP_1011_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String evnt_code;
	public String evnt_nm;
	public String dlco_clsf_cd_nm;
	public String dlco_no;
	public String dlco_nm;
	public String chrg_pers_emp_no;
	public String chrg_pers_emp_nm;
	public String misu_amt;
	public String evnt_yy;
	public String evnt_cd;
	public String evnt_seq;
	public String budg_cd;
	public String budg_nm;

	public EN_INNEXP_1011_LCURLISTRecord(){}

	public void setEvnt_code(String evnt_code){
		this.evnt_code = evnt_code;
	}

	public void setEvnt_nm(String evnt_nm){
		this.evnt_nm = evnt_nm;
	}

	public void setDlco_clsf_cd_nm(String dlco_clsf_cd_nm){
		this.dlco_clsf_cd_nm = dlco_clsf_cd_nm;
	}

	public void setDlco_no(String dlco_no){
		this.dlco_no = dlco_no;
	}

	public void setDlco_nm(String dlco_nm){
		this.dlco_nm = dlco_nm;
	}

	public void setChrg_pers_emp_no(String chrg_pers_emp_no){
		this.chrg_pers_emp_no = chrg_pers_emp_no;
	}

	public void setChrg_pers_emp_nm(String chrg_pers_emp_nm){
		this.chrg_pers_emp_nm = chrg_pers_emp_nm;
	}

	public void setMisu_amt(String misu_amt){
		this.misu_amt = misu_amt;
	}

	public void setEvnt_yy(String evnt_yy){
		this.evnt_yy = evnt_yy;
	}

	public void setEvnt_cd(String evnt_cd){
		this.evnt_cd = evnt_cd;
	}

	public void setEvnt_seq(String evnt_seq){
		this.evnt_seq = evnt_seq;
	}

	public void setBudg_cd(String budg_cd){
		this.budg_cd = budg_cd;
	}

	public void setBudg_nm(String budg_nm){
		this.budg_nm = budg_nm;
	}

	public String getEvnt_code(){
		return this.evnt_code;
	}

	public String getEvnt_nm(){
		return this.evnt_nm;
	}

	public String getDlco_clsf_cd_nm(){
		return this.dlco_clsf_cd_nm;
	}

	public String getDlco_no(){
		return this.dlco_no;
	}

	public String getDlco_nm(){
		return this.dlco_nm;
	}

	public String getChrg_pers_emp_no(){
		return this.chrg_pers_emp_no;
	}

	public String getChrg_pers_emp_nm(){
		return this.chrg_pers_emp_nm;
	}

	public String getMisu_amt(){
		return this.misu_amt;
	}

	public String getEvnt_yy(){
		return this.evnt_yy;
	}

	public String getEvnt_cd(){
		return this.evnt_cd;
	}

	public String getEvnt_seq(){
		return this.evnt_seq;
	}

	public String getBudg_cd(){
		return this.budg_cd;
	}

	public String getBudg_nm(){
		return this.budg_nm;
	}
}

/* 작성시간 : Tue Apr 14 16:26:35 KST 2009 */
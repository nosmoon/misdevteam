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


public class EN_INNEXP_1012_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String budg_cd;
	public String budg_nm;
	public String occr_amt;
	public String extnc_amt;
	public String extnc_obj_slip_clsf;
	public String medi_cd;
	public String extnc_dlco_no;
	public String extnc_dlco_nm;

	public EN_INNEXP_1012_LCURLISTRecord(){}

	public void setBudg_cd(String budg_cd){
		this.budg_cd = budg_cd;
	}

	public void setBudg_nm(String budg_nm){
		this.budg_nm = budg_nm;
	}

	public void setOccr_amt(String occr_amt){
		this.occr_amt = occr_amt;
	}

	public void setExtnc_amt(String extnc_amt){
		this.extnc_amt = extnc_amt;
	}

	public void setExtnc_obj_slip_clsf(String extnc_obj_slip_clsf){
		this.extnc_obj_slip_clsf = extnc_obj_slip_clsf;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setExtnc_dlco_no(String extnc_dlco_no){
		this.extnc_dlco_no = extnc_dlco_no;
	}

	public void setExtnc_dlco_nm(String extnc_dlco_nm){
		this.extnc_dlco_nm = extnc_dlco_nm;
	}

	public String getBudg_cd(){
		return this.budg_cd;
	}

	public String getBudg_nm(){
		return this.budg_nm;
	}

	public String getOccr_amt(){
		return this.occr_amt;
	}

	public String getExtnc_amt(){
		return this.extnc_amt;
	}

	public String getExtnc_obj_slip_clsf(){
		return this.extnc_obj_slip_clsf;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getExtnc_dlco_no(){
		return this.extnc_dlco_no;
	}

	public String getExtnc_dlco_nm(){
		return this.extnc_dlco_nm;
	}
}

/* 작성시간 : Thu Apr 16 19:44:38 KST 2009 */
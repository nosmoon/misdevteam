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


public class EN_INNEXP_3004_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String evnt_cd;
	public String evnt_nm;
	public String dlco_no;
	public String dlco_nm;
	public String p_upd_occr_dt;
	public String misu_amt;
	public String chrg_pers_emp_nm;

	public EN_INNEXP_3004_LCURLISTRecord(){}

	public void setEvnt_cd(String evnt_cd){
		this.evnt_cd = evnt_cd;
	}

	public void setEvnt_nm(String evnt_nm){
		this.evnt_nm = evnt_nm;
	}

	public void setDlco_no(String dlco_no){
		this.dlco_no = dlco_no;
	}

	public void setDlco_nm(String dlco_nm){
		this.dlco_nm = dlco_nm;
	}

	public void setP_upd_occr_dt(String p_upd_occr_dt){
		this.p_upd_occr_dt = p_upd_occr_dt;
	}

	public void setMisu_amt(String misu_amt){
		this.misu_amt = misu_amt;
	}

	public void setChrg_pers_emp_nm(String chrg_pers_emp_nm){
		this.chrg_pers_emp_nm = chrg_pers_emp_nm;
	}

	public String getEvnt_cd(){
		return this.evnt_cd;
	}

	public String getEvnt_nm(){
		return this.evnt_nm;
	}

	public String getDlco_no(){
		return this.dlco_no;
	}

	public String getDlco_nm(){
		return this.dlco_nm;
	}

	public String getP_upd_occr_dt(){
		return this.p_upd_occr_dt;
	}

	public String getMisu_amt(){
		return this.misu_amt;
	}

	public String getChrg_pers_emp_nm(){
		return this.chrg_pers_emp_nm;
	}
}

/* 작성시간 : Tue Apr 28 09:53:38 KST 2009 */
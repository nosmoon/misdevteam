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


public class EN_INNEXP_3201_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String evnt_cd;
	public String evnt_nm;
	public String chrg_pers_emp_nm;
	public String stlm_yn;
	public String spon_amt;
	public String advt_amt;
	public String entr_amt;
	public String join_amt;
	public String etc_amt;
	public String reven_amt;
	public String expn_amt;
	public String bal_amt;
	public String unrcp_amt;
	public String budg_reven_amt;
	public String budg_expn_amt;
	public String budg_bal_amt;

	public EN_INNEXP_3201_LCURLISTRecord(){}

	public void setEvnt_cd(String evnt_cd){
		this.evnt_cd = evnt_cd;
	}

	public void setEvnt_nm(String evnt_nm){
		this.evnt_nm = evnt_nm;
	}

	public void setChrg_pers_emp_nm(String chrg_pers_emp_nm){
		this.chrg_pers_emp_nm = chrg_pers_emp_nm;
	}

	public void setStlm_yn(String stlm_yn){
		this.stlm_yn = stlm_yn;
	}

	public void setSpon_amt(String spon_amt){
		this.spon_amt = spon_amt;
	}

	public void setAdvt_amt(String advt_amt){
		this.advt_amt = advt_amt;
	}

	public void setEntr_amt(String entr_amt){
		this.entr_amt = entr_amt;
	}

	public void setJoin_amt(String join_amt){
		this.join_amt = join_amt;
	}

	public void setEtc_amt(String etc_amt){
		this.etc_amt = etc_amt;
	}

	public void setReven_amt(String reven_amt){
		this.reven_amt = reven_amt;
	}

	public void setExpn_amt(String expn_amt){
		this.expn_amt = expn_amt;
	}

	public void setBal_amt(String bal_amt){
		this.bal_amt = bal_amt;
	}

	public void setUnrcp_amt(String unrcp_amt){
		this.unrcp_amt = unrcp_amt;
	}

	public void setBudg_reven_amt(String budg_reven_amt){
		this.budg_reven_amt = budg_reven_amt;
	}

	public void setBudg_expn_amt(String budg_expn_amt){
		this.budg_expn_amt = budg_expn_amt;
	}

	public void setBudg_bal_amt(String budg_bal_amt){
		this.budg_bal_amt = budg_bal_amt;
	}

	public String getEvnt_cd(){
		return this.evnt_cd;
	}

	public String getEvnt_nm(){
		return this.evnt_nm;
	}

	public String getChrg_pers_emp_nm(){
		return this.chrg_pers_emp_nm;
	}

	public String getStlm_yn(){
		return this.stlm_yn;
	}

	public String getSpon_amt(){
		return this.spon_amt;
	}

	public String getAdvt_amt(){
		return this.advt_amt;
	}

	public String getEntr_amt(){
		return this.entr_amt;
	}

	public String getJoin_amt(){
		return this.join_amt;
	}

	public String getEtc_amt(){
		return this.etc_amt;
	}

	public String getReven_amt(){
		return this.reven_amt;
	}

	public String getExpn_amt(){
		return this.expn_amt;
	}

	public String getBal_amt(){
		return this.bal_amt;
	}

	public String getUnrcp_amt(){
		return this.unrcp_amt;
	}

	public String getBudg_reven_amt(){
		return this.budg_reven_amt;
	}

	public String getBudg_expn_amt(){
		return this.budg_expn_amt;
	}

	public String getBudg_bal_amt(){
		return this.budg_bal_amt;
	}
}

/* 작성시간 : Mon May 11 18:29:55 KST 2009 */
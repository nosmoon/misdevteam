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


package chosun.ciis.fc.acct.rec;

import java.sql.*;
import chosun.ciis.fc.acct.dm.*;
import chosun.ciis.fc.acct.ds.*;

/**
 * 
 */


public class FC_ACCT_2901_LSRC_TAX_LISTRecord extends java.lang.Object implements java.io.Serializable{

	public String check1;
	public String dlco_nm;
	public String dlco_cd;
	public String atic_fee;
	public String incm_clsf_nm;
	public String incm_tax;
	public String res_tax;
	public String cal_pay_amt;

	public FC_ACCT_2901_LSRC_TAX_LISTRecord(){}

	public void setCheck1(String check1){
		this.check1 = check1;
	}

	public void setDlco_nm(String dlco_nm){
		this.dlco_nm = dlco_nm;
	}

	public void setDlco_cd(String dlco_cd){
		this.dlco_cd = dlco_cd;
	}

	public void setAtic_fee(String atic_fee){
		this.atic_fee = atic_fee;
	}

	public void setIncm_clsf_nm(String incm_clsf_nm){
		this.incm_clsf_nm = incm_clsf_nm;
	}

	public void setIncm_tax(String incm_tax){
		this.incm_tax = incm_tax;
	}

	public void setRes_tax(String res_tax){
		this.res_tax = res_tax;
	}

	public void setCal_pay_amt(String cal_pay_amt){
		this.cal_pay_amt = cal_pay_amt;
	}

	public String getCheck1(){
		return this.check1;
	}

	public String getDlco_nm(){
		return this.dlco_nm;
	}

	public String getDlco_cd(){
		return this.dlco_cd;
	}

	public String getAtic_fee(){
		return this.atic_fee;
	}

	public String getIncm_clsf_nm(){
		return this.incm_clsf_nm;
	}

	public String getIncm_tax(){
		return this.incm_tax;
	}

	public String getRes_tax(){
		return this.res_tax;
	}

	public String getCal_pay_amt(){
		return this.cal_pay_amt;
	}
}

/* 작성시간 : Thu Jun 18 10:18:59 KST 2009 */
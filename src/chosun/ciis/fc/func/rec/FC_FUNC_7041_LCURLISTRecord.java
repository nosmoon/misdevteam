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


package chosun.ciis.fc.func.rec;

import java.sql.*;
import chosun.ciis.fc.func.dm.*;
import chosun.ciis.fc.func.ds.*;

/**
 * 
 */


public class FC_FUNC_7041_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String fund_mang_no;
	public String loan_no;
	public String dlco_clsf_cd;
	public String dlco_cd;
	public String loan_amt;
	public String comp_dt;
	public String mtry_dt;
	public String iyul;
	public String totint;
	public String dlco_nm;
	public String cigbnm;

	public FC_FUNC_7041_LCURLISTRecord(){}

	public void setFund_mang_no(String fund_mang_no){
		this.fund_mang_no = fund_mang_no;
	}

	public void setLoan_no(String loan_no){
		this.loan_no = loan_no;
	}

	public void setDlco_clsf_cd(String dlco_clsf_cd){
		this.dlco_clsf_cd = dlco_clsf_cd;
	}

	public void setDlco_cd(String dlco_cd){
		this.dlco_cd = dlco_cd;
	}

	public void setLoan_amt(String loan_amt){
		this.loan_amt = loan_amt;
	}

	public void setComp_dt(String comp_dt){
		this.comp_dt = comp_dt;
	}

	public void setMtry_dt(String mtry_dt){
		this.mtry_dt = mtry_dt;
	}

	public void setIyul(String iyul){
		this.iyul = iyul;
	}

	public void setTotint(String totint){
		this.totint = totint;
	}

	public void setDlco_nm(String dlco_nm){
		this.dlco_nm = dlco_nm;
	}

	public void setCigbnm(String cigbnm){
		this.cigbnm = cigbnm;
	}

	public String getFund_mang_no(){
		return this.fund_mang_no;
	}

	public String getLoan_no(){
		return this.loan_no;
	}

	public String getDlco_clsf_cd(){
		return this.dlco_clsf_cd;
	}

	public String getDlco_cd(){
		return this.dlco_cd;
	}

	public String getLoan_amt(){
		return this.loan_amt;
	}

	public String getComp_dt(){
		return this.comp_dt;
	}

	public String getMtry_dt(){
		return this.mtry_dt;
	}

	public String getIyul(){
		return this.iyul;
	}

	public String getTotint(){
		return this.totint;
	}

	public String getDlco_nm(){
		return this.dlco_nm;
	}

	public String getCigbnm(){
		return this.cigbnm;
	}
}

/* 작성시간 : Thu Apr 02 10:37:11 KST 2009 */
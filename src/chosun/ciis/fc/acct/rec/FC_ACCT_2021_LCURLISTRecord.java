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


public class FC_ACCT_2021_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cost_clsf;
	public String clam_amt;
	public String clam_dept_cd;
	public String chrg_emp_no;
	public String titl;
	public String budg_cd;
	public String budg_yymm;
	public String medi_cd;
	public String fisc_dt;
	public String pch_buseonm;
	public String pch_mcnm;
	public String pch_ddjnm;
	public String adpay_expn_no;
	public String end_yn;
	public String dtls_medi_cd;
	public String draft_doc_no;
	public String draft_expn_amt;
	public String draft_doc_dept_cd;

	public FC_ACCT_2021_LCURLISTRecord(){}

	public void setCost_clsf(String cost_clsf){
		this.cost_clsf = cost_clsf;
	}

	public void setClam_amt(String clam_amt){
		this.clam_amt = clam_amt;
	}

	public void setClam_dept_cd(String clam_dept_cd){
		this.clam_dept_cd = clam_dept_cd;
	}

	public void setChrg_emp_no(String chrg_emp_no){
		this.chrg_emp_no = chrg_emp_no;
	}

	public void setTitl(String titl){
		this.titl = titl;
	}

	public void setBudg_cd(String budg_cd){
		this.budg_cd = budg_cd;
	}

	public void setBudg_yymm(String budg_yymm){
		this.budg_yymm = budg_yymm;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setFisc_dt(String fisc_dt){
		this.fisc_dt = fisc_dt;
	}

	public void setPch_buseonm(String pch_buseonm){
		this.pch_buseonm = pch_buseonm;
	}

	public void setPch_mcnm(String pch_mcnm){
		this.pch_mcnm = pch_mcnm;
	}

	public void setPch_ddjnm(String pch_ddjnm){
		this.pch_ddjnm = pch_ddjnm;
	}

	public void setAdpay_expn_no(String adpay_expn_no){
		this.adpay_expn_no = adpay_expn_no;
	}

	public void setEnd_yn(String end_yn){
		this.end_yn = end_yn;
	}

	public void setDtls_medi_cd(String dtls_medi_cd){
		this.dtls_medi_cd = dtls_medi_cd;
	}

	public void setDraft_doc_no(String draft_doc_no){
		this.draft_doc_no = draft_doc_no;
	}

	public void setDraft_expn_amt(String draft_expn_amt){
		this.draft_expn_amt = draft_expn_amt;
	}

	public void setDraft_doc_dept_cd(String draft_doc_dept_cd){
		this.draft_doc_dept_cd = draft_doc_dept_cd;
	}

	public String getCost_clsf(){
		return this.cost_clsf;
	}

	public String getClam_amt(){
		return this.clam_amt;
	}

	public String getClam_dept_cd(){
		return this.clam_dept_cd;
	}

	public String getChrg_emp_no(){
		return this.chrg_emp_no;
	}

	public String getTitl(){
		return this.titl;
	}

	public String getBudg_cd(){
		return this.budg_cd;
	}

	public String getBudg_yymm(){
		return this.budg_yymm;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getFisc_dt(){
		return this.fisc_dt;
	}

	public String getPch_buseonm(){
		return this.pch_buseonm;
	}

	public String getPch_mcnm(){
		return this.pch_mcnm;
	}

	public String getPch_ddjnm(){
		return this.pch_ddjnm;
	}

	public String getAdpay_expn_no(){
		return this.adpay_expn_no;
	}

	public String getEnd_yn(){
		return this.end_yn;
	}

	public String getDtls_medi_cd(){
		return this.dtls_medi_cd;
	}

	public String getDraft_doc_no(){
		return this.draft_doc_no;
	}

	public String getDraft_expn_amt(){
		return this.draft_expn_amt;
	}

	public String getDraft_doc_dept_cd(){
		return this.draft_doc_dept_cd;
	}
}

/* 작성시간 : Thu Jul 09 16:56:00 KST 2009 */
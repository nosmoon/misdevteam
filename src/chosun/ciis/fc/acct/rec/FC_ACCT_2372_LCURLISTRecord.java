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


public class FC_ACCT_2372_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String check1;
	public String slip_occr_dt;
	public String slip_clsf_cd;
	public String slip_seq;
	public String slip_sub_seq;
	public String clam_dept_cd;
	public String rmks1;
	public String sum_cbamt;
	public String sum_dbamt;
	public String slip_no;
	public String tax_stmt_no;
	public String draft_doc_no;
	public String draft_expn_amt;
	public String draft_impt_amt;
	public String draft_doc_dept_cd;

	public FC_ACCT_2372_LCURLISTRecord(){}

	public void setCheck1(String check1){
		this.check1 = check1;
	}

	public void setSlip_occr_dt(String slip_occr_dt){
		this.slip_occr_dt = slip_occr_dt;
	}

	public void setSlip_clsf_cd(String slip_clsf_cd){
		this.slip_clsf_cd = slip_clsf_cd;
	}

	public void setSlip_seq(String slip_seq){
		this.slip_seq = slip_seq;
	}

	public void setSlip_sub_seq(String slip_sub_seq){
		this.slip_sub_seq = slip_sub_seq;
	}

	public void setClam_dept_cd(String clam_dept_cd){
		this.clam_dept_cd = clam_dept_cd;
	}

	public void setRmks1(String rmks1){
		this.rmks1 = rmks1;
	}

	public void setSum_cbamt(String sum_cbamt){
		this.sum_cbamt = sum_cbamt;
	}

	public void setSum_dbamt(String sum_dbamt){
		this.sum_dbamt = sum_dbamt;
	}

	public void setSlip_no(String slip_no){
		this.slip_no = slip_no;
	}

	public void setTax_stmt_no(String tax_stmt_no){
		this.tax_stmt_no = tax_stmt_no;
	}

	public void setDraft_doc_no(String draft_doc_no){
		this.draft_doc_no = draft_doc_no;
	}

	public void setDraft_expn_amt(String draft_expn_amt){
		this.draft_expn_amt = draft_expn_amt;
	}

	public void setDraft_impt_amt(String draft_impt_amt){
		this.draft_impt_amt = draft_impt_amt;
	}

	public void setDraft_doc_dept_cd(String draft_doc_dept_cd){
		this.draft_doc_dept_cd = draft_doc_dept_cd;
	}

	public String getCheck1(){
		return this.check1;
	}

	public String getSlip_occr_dt(){
		return this.slip_occr_dt;
	}

	public String getSlip_clsf_cd(){
		return this.slip_clsf_cd;
	}

	public String getSlip_seq(){
		return this.slip_seq;
	}

	public String getSlip_sub_seq(){
		return this.slip_sub_seq;
	}

	public String getClam_dept_cd(){
		return this.clam_dept_cd;
	}

	public String getRmks1(){
		return this.rmks1;
	}

	public String getSum_cbamt(){
		return this.sum_cbamt;
	}

	public String getSum_dbamt(){
		return this.sum_dbamt;
	}

	public String getSlip_no(){
		return this.slip_no;
	}

	public String getTax_stmt_no(){
		return this.tax_stmt_no;
	}

	public String getDraft_doc_no(){
		return this.draft_doc_no;
	}

	public String getDraft_expn_amt(){
		return this.draft_expn_amt;
	}

	public String getDraft_impt_amt(){
		return this.draft_impt_amt;
	}

	public String getDraft_doc_dept_cd(){
		return this.draft_doc_dept_cd;
	}
}

/* 작성시간 : Mon Apr 09 18:54:34 KST 2018 */
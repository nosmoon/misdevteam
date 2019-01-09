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


public class FC_ACCT_2354_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String slip_seq;
	public String slip_sub_seq;
	public String acct_cd;
	public String acctynm;
	public String incmg_dt;
	public String fisc_dt;
	public String incmg_emp_no;
	public String igbhannm;
	public String slip_aprv_yn;
	public String dr_amt;
	public String crdt_amt;
	public String seq;
	public String draft_doc_no;
	public String draft_expn_amt;
	public String draft_impt_amt;
	public String draft_doc_dept_cd;

	public FC_ACCT_2354_LCURLISTRecord(){}

	public void setSlip_seq(String slip_seq){
		this.slip_seq = slip_seq;
	}

	public void setSlip_sub_seq(String slip_sub_seq){
		this.slip_sub_seq = slip_sub_seq;
	}

	public void setAcct_cd(String acct_cd){
		this.acct_cd = acct_cd;
	}

	public void setAcctynm(String acctynm){
		this.acctynm = acctynm;
	}

	public void setIncmg_dt(String incmg_dt){
		this.incmg_dt = incmg_dt;
	}

	public void setFisc_dt(String fisc_dt){
		this.fisc_dt = fisc_dt;
	}

	public void setIncmg_emp_no(String incmg_emp_no){
		this.incmg_emp_no = incmg_emp_no;
	}

	public void setIgbhannm(String igbhannm){
		this.igbhannm = igbhannm;
	}

	public void setSlip_aprv_yn(String slip_aprv_yn){
		this.slip_aprv_yn = slip_aprv_yn;
	}

	public void setDr_amt(String dr_amt){
		this.dr_amt = dr_amt;
	}

	public void setCrdt_amt(String crdt_amt){
		this.crdt_amt = crdt_amt;
	}

	public void setSeq(String seq){
		this.seq = seq;
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

	public String getSlip_seq(){
		return this.slip_seq;
	}

	public String getSlip_sub_seq(){
		return this.slip_sub_seq;
	}

	public String getAcct_cd(){
		return this.acct_cd;
	}

	public String getAcctynm(){
		return this.acctynm;
	}

	public String getIncmg_dt(){
		return this.incmg_dt;
	}

	public String getFisc_dt(){
		return this.fisc_dt;
	}

	public String getIncmg_emp_no(){
		return this.incmg_emp_no;
	}

	public String getIgbhannm(){
		return this.igbhannm;
	}

	public String getSlip_aprv_yn(){
		return this.slip_aprv_yn;
	}

	public String getDr_amt(){
		return this.dr_amt;
	}

	public String getCrdt_amt(){
		return this.crdt_amt;
	}

	public String getSeq(){
		return this.seq;
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

/* 작성시간 : Fri Jul 17 17:10:46 KST 2009 */
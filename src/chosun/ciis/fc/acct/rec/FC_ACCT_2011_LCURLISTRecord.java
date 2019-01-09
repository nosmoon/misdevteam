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


public class FC_ACCT_2011_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String titl;
	public String reso_amt;
	public String expn_clsf;
	public String expn_hope_dt;
	public String clam_dept_cd;
	public String budg_yymm;
	public String chrg_emp_no;
	public String evnt_cd;
	public String clam_dept_cd_nm;
	public String chrg_emp_no_nm;
	public String slip_aprv_yn;
	public String fisc_dt;
	public String evnt_cd_nm;
	public String evnt_cd_seq;
	public String draft_doc_no;
	public String draft_doc_dept_cd;
	public String draft_expn_amt;
	public String medi_cd;
	public String medi_cd_nm;
	public String dtls_medi_cd;
	public String dtls_medi_cd_nm;
	public String chnl_clsf_cd;

	public FC_ACCT_2011_LCURLISTRecord(){}

	public void setTitl(String titl){
		this.titl = titl;
	}

	public void setReso_amt(String reso_amt){
		this.reso_amt = reso_amt;
	}

	public void setExpn_clsf(String expn_clsf){
		this.expn_clsf = expn_clsf;
	}

	public void setExpn_hope_dt(String expn_hope_dt){
		this.expn_hope_dt = expn_hope_dt;
	}

	public void setClam_dept_cd(String clam_dept_cd){
		this.clam_dept_cd = clam_dept_cd;
	}

	public void setBudg_yymm(String budg_yymm){
		this.budg_yymm = budg_yymm;
	}

	public void setChrg_emp_no(String chrg_emp_no){
		this.chrg_emp_no = chrg_emp_no;
	}

	public void setEvnt_cd(String evnt_cd){
		this.evnt_cd = evnt_cd;
	}

	public void setClam_dept_cd_nm(String clam_dept_cd_nm){
		this.clam_dept_cd_nm = clam_dept_cd_nm;
	}

	public void setChrg_emp_no_nm(String chrg_emp_no_nm){
		this.chrg_emp_no_nm = chrg_emp_no_nm;
	}

	public void setSlip_aprv_yn(String slip_aprv_yn){
		this.slip_aprv_yn = slip_aprv_yn;
	}

	public void setFisc_dt(String fisc_dt){
		this.fisc_dt = fisc_dt;
	}

	public void setEvnt_cd_nm(String evnt_cd_nm){
		this.evnt_cd_nm = evnt_cd_nm;
	}

	public void setEvnt_cd_seq(String evnt_cd_seq){
		this.evnt_cd_seq = evnt_cd_seq;
	}

	public void setDraft_doc_no(String draft_doc_no){
		this.draft_doc_no = draft_doc_no;
	}

	public void setDraft_doc_dept_cd(String draft_doc_dept_cd){
		this.draft_doc_dept_cd = draft_doc_dept_cd;
	}

	public void setDraft_expn_amt(String draft_expn_amt){
		this.draft_expn_amt = draft_expn_amt;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setMedi_cd_nm(String medi_cd_nm){
		this.medi_cd_nm = medi_cd_nm;
	}

	public void setDtls_medi_cd(String dtls_medi_cd){
		this.dtls_medi_cd = dtls_medi_cd;
	}

	public void setDtls_medi_cd_nm(String dtls_medi_cd_nm){
		this.dtls_medi_cd_nm = dtls_medi_cd_nm;
	}

	public void setChnl_clsf_cd(String chnl_clsf_cd){
		this.chnl_clsf_cd = chnl_clsf_cd;
	}

	public String getTitl(){
		return this.titl;
	}

	public String getReso_amt(){
		return this.reso_amt;
	}

	public String getExpn_clsf(){
		return this.expn_clsf;
	}

	public String getExpn_hope_dt(){
		return this.expn_hope_dt;
	}

	public String getClam_dept_cd(){
		return this.clam_dept_cd;
	}

	public String getBudg_yymm(){
		return this.budg_yymm;
	}

	public String getChrg_emp_no(){
		return this.chrg_emp_no;
	}

	public String getEvnt_cd(){
		return this.evnt_cd;
	}

	public String getClam_dept_cd_nm(){
		return this.clam_dept_cd_nm;
	}

	public String getChrg_emp_no_nm(){
		return this.chrg_emp_no_nm;
	}

	public String getSlip_aprv_yn(){
		return this.slip_aprv_yn;
	}

	public String getFisc_dt(){
		return this.fisc_dt;
	}

	public String getEvnt_cd_nm(){
		return this.evnt_cd_nm;
	}

	public String getEvnt_cd_seq(){
		return this.evnt_cd_seq;
	}

	public String getDraft_doc_no(){
		return this.draft_doc_no;
	}

	public String getDraft_doc_dept_cd(){
		return this.draft_doc_dept_cd;
	}

	public String getDraft_expn_amt(){
		return this.draft_expn_amt;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getMedi_cd_nm(){
		return this.medi_cd_nm;
	}

	public String getDtls_medi_cd(){
		return this.dtls_medi_cd;
	}

	public String getDtls_medi_cd_nm(){
		return this.dtls_medi_cd_nm;
	}

	public String getChnl_clsf_cd(){
		return this.chnl_clsf_cd;
	}
}

/* 작성시간 : Thu Dec 18 11:26:47 KST 2014 */
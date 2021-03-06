/***************************************************************************************************
* 파일명 : .java
* 기능 : 연결재무제표-채권채무 확정대상연결 (목록조회)
* 작성일자 : 2015.01.05
* 작성자 : 이혁
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


public class FC_ACCT_2641_LCURLIST2Record extends java.lang.Object implements java.io.Serializable{

	public String fisc_dt;
	public String slip_no;
	public String rmks;
	public int dr_amt;
	public int crdt_amt;
	public String mang_clsf_cd_nm;
	public String mang_no;
	public String clas_nm;
	public String budg_cd;
	public String budg_nm;
	public String acct_cd;
	public String acct_nm;
	public String dlco_clsf_cd_nm;
	public String dlco_cd;
	public String dlco_nm;
	public String boks_dlco_nm;
	public String medi_cd_nm;
	public String dtls_medi_cdnm;
	public String evnt_cd_nm;
	public String clam_dept_cd_nm;
	public String obj_acct_cd_nm;
	public int obj_amt;
	public String bank_cd;
	public String bank_cd_nm;
	public String cfs_seq;
	public String clos_clsf;
	public String conn_grp;
	public String conn_seq;
	public String budg_clsf_cd;

	public FC_ACCT_2641_LCURLIST2Record(){}

	public void setFisc_dt(String fisc_dt){
		this.fisc_dt = fisc_dt;
	}

	public void setSlip_no(String slip_no){
		this.slip_no = slip_no;
	}

	public void setRmks(String rmks){
		this.rmks = rmks;
	}

	public void setDr_amt(int dr_amt){
		this.dr_amt = dr_amt;
	}

	public void setCrdt_amt(int crdt_amt){
		this.crdt_amt = crdt_amt;
	}

	public void setMang_clsf_cd_nm(String mang_clsf_cd_nm){
		this.mang_clsf_cd_nm = mang_clsf_cd_nm;
	}

	public void setMang_no(String mang_no){
		this.mang_no = mang_no;
	}

	public void setClas_nm(String clas_nm){
		this.clas_nm = clas_nm;
	}

	public void setBudg_cd(String budg_cd){
		this.budg_cd = budg_cd;
	}

	public void setBudg_nm(String budg_nm){
		this.budg_nm = budg_nm;
	}

	public void setAcct_cd(String acct_cd){
		this.acct_cd = acct_cd;
	}

	public void setAcct_nm(String acct_nm){
		this.acct_nm = acct_nm;
	}

	public void setDlco_clsf_cd_nm(String dlco_clsf_cd_nm){
		this.dlco_clsf_cd_nm = dlco_clsf_cd_nm;
	}

	public void setDlco_cd(String dlco_cd){
		this.dlco_cd = dlco_cd;
	}

	public void setDlco_nm(String dlco_nm){
		this.dlco_nm = dlco_nm;
	}

	public void setBoks_dlco_nm(String boks_dlco_nm){
		this.boks_dlco_nm = boks_dlco_nm;
	}

	public void setMedi_cd_nm(String medi_cd_nm){
		this.medi_cd_nm = medi_cd_nm;
	}

	public void setDtls_medi_cdnm(String dtls_medi_cdnm){
		this.dtls_medi_cdnm = dtls_medi_cdnm;
	}

	public void setEvnt_cd_nm(String evnt_cd_nm){
		this.evnt_cd_nm = evnt_cd_nm;
	}

	public void setClam_dept_cd_nm(String clam_dept_cd_nm){
		this.clam_dept_cd_nm = clam_dept_cd_nm;
	}

	public void setObj_acct_cd_nm(String obj_acct_cd_nm){
		this.obj_acct_cd_nm = obj_acct_cd_nm;
	}

	public void setObj_amt(int obj_amt){
		this.obj_amt = obj_amt;
	}

	public void setBank_cd(String bank_cd){
		this.bank_cd = bank_cd;
	}

	public void setBank_cd_nm(String bank_cd_nm){
		this.bank_cd_nm = bank_cd_nm;
	}

	public void setCfs_seq(String cfs_seq){
		this.cfs_seq = cfs_seq;
	}

	public void setClos_clsf(String clos_clsf){
		this.clos_clsf = clos_clsf;
	}

	public void setConn_grp(String conn_grp){
		this.conn_grp = conn_grp;
	}

	public void setConn_seq(String conn_seq){
		this.conn_seq = conn_seq;
	}

	public void setBudg_clsf_cd(String budg_clsf_cd){
		this.budg_clsf_cd = budg_clsf_cd;
	}

	public String getFisc_dt(){
		return this.fisc_dt;
	}

	public String getSlip_no(){
		return this.slip_no;
	}

	public String getRmks(){
		return this.rmks;
	}

	public int getDr_amt(){
		return this.dr_amt;
	}

	public int getCrdt_amt(){
		return this.crdt_amt;
	}

	public String getMang_clsf_cd_nm(){
		return this.mang_clsf_cd_nm;
	}

	public String getMang_no(){
		return this.mang_no;
	}

	public String getClas_nm(){
		return this.clas_nm;
	}

	public String getBudg_cd(){
		return this.budg_cd;
	}

	public String getBudg_nm(){
		return this.budg_nm;
	}

	public String getAcct_cd(){
		return this.acct_cd;
	}

	public String getAcct_nm(){
		return this.acct_nm;
	}

	public String getDlco_clsf_cd_nm(){
		return this.dlco_clsf_cd_nm;
	}

	public String getDlco_cd(){
		return this.dlco_cd;
	}

	public String getDlco_nm(){
		return this.dlco_nm;
	}

	public String getBoks_dlco_nm(){
		return this.boks_dlco_nm;
	}

	public String getMedi_cd_nm(){
		return this.medi_cd_nm;
	}

	public String getDtls_medi_cdnm(){
		return this.dtls_medi_cdnm;
	}

	public String getEvnt_cd_nm(){
		return this.evnt_cd_nm;
	}

	public String getClam_dept_cd_nm(){
		return this.clam_dept_cd_nm;
	}

	public String getObj_acct_cd_nm(){
		return this.obj_acct_cd_nm;
	}

	public int getObj_amt(){
		return this.obj_amt;
	}

	public String getBank_cd(){
		return this.bank_cd;
	}

	public String getBank_cd_nm(){
		return this.bank_cd_nm;
	}

	public String getCfs_seq(){
		return this.cfs_seq;
	}

	public String getClos_clsf(){
		return this.clos_clsf;
	}

	public String getConn_grp(){
		return this.conn_grp;
	}

	public String getConn_seq(){
		return this.conn_seq;
	}

	public String getBudg_clsf_cd(){
		return this.budg_clsf_cd;
	}
}

/* 작성시간 : Mon Jan 05 17:39:06 KST 2015 */
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


public class FC_ACCT_6022_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String acct_cd;
	public String acct_nm;
	public String budg_cd;
	public String clam_dept_cd;
	public String use_dept_cd;
	public String medi_cd;
	public String obj_amt;
	public String vat_amt;
	public String ndduc_rate;
	public String ndduc_amt;
	public String orgy_ndduc_amt;
	public String comn_ndduc_amt;
	public String non_dduc_stot;
	public String orgy_dduc_amt;
	public String comn_dduc_amt;
	public String dduc_stot;
	public String acml_amt1;
	public String acml_amt2;
	public String slip_mang_clsf;
	public String slip_mang_clsf_nm;
	public String slip_occr_dt;
	public String slip_clsf_cd;
	public String slip_seq;
	public String slip_sub_seq;
	public String slip_arow_no;
	public String slip_occr_dt1;
	public String slip_clsf_cd1;
	public String slip_seq1;
	public String slip_sub_seq1;
	public String slip_arow_no1;

	public FC_ACCT_6022_LCURLISTRecord(){}

	public void setAcct_cd(String acct_cd){
		this.acct_cd = acct_cd;
	}

	public void setAcct_nm(String acct_nm){
		this.acct_nm = acct_nm;
	}

	public void setBudg_cd(String budg_cd){
		this.budg_cd = budg_cd;
	}

	public void setClam_dept_cd(String clam_dept_cd){
		this.clam_dept_cd = clam_dept_cd;
	}

	public void setUse_dept_cd(String use_dept_cd){
		this.use_dept_cd = use_dept_cd;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setObj_amt(String obj_amt){
		this.obj_amt = obj_amt;
	}

	public void setVat_amt(String vat_amt){
		this.vat_amt = vat_amt;
	}

	public void setNdduc_rate(String ndduc_rate){
		this.ndduc_rate = ndduc_rate;
	}

	public void setNdduc_amt(String ndduc_amt){
		this.ndduc_amt = ndduc_amt;
	}

	public void setOrgy_ndduc_amt(String orgy_ndduc_amt){
		this.orgy_ndduc_amt = orgy_ndduc_amt;
	}

	public void setComn_ndduc_amt(String comn_ndduc_amt){
		this.comn_ndduc_amt = comn_ndduc_amt;
	}

	public void setNon_dduc_stot(String non_dduc_stot){
		this.non_dduc_stot = non_dduc_stot;
	}

	public void setOrgy_dduc_amt(String orgy_dduc_amt){
		this.orgy_dduc_amt = orgy_dduc_amt;
	}

	public void setComn_dduc_amt(String comn_dduc_amt){
		this.comn_dduc_amt = comn_dduc_amt;
	}

	public void setDduc_stot(String dduc_stot){
		this.dduc_stot = dduc_stot;
	}

	public void setAcml_amt1(String acml_amt1){
		this.acml_amt1 = acml_amt1;
	}

	public void setAcml_amt2(String acml_amt2){
		this.acml_amt2 = acml_amt2;
	}

	public void setSlip_mang_clsf(String slip_mang_clsf){
		this.slip_mang_clsf = slip_mang_clsf;
	}

	public void setSlip_mang_clsf_nm(String slip_mang_clsf_nm){
		this.slip_mang_clsf_nm = slip_mang_clsf_nm;
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

	public void setSlip_arow_no(String slip_arow_no){
		this.slip_arow_no = slip_arow_no;
	}

	public void setSlip_occr_dt1(String slip_occr_dt1){
		this.slip_occr_dt1 = slip_occr_dt1;
	}

	public void setSlip_clsf_cd1(String slip_clsf_cd1){
		this.slip_clsf_cd1 = slip_clsf_cd1;
	}

	public void setSlip_seq1(String slip_seq1){
		this.slip_seq1 = slip_seq1;
	}

	public void setSlip_sub_seq1(String slip_sub_seq1){
		this.slip_sub_seq1 = slip_sub_seq1;
	}

	public void setSlip_arow_no1(String slip_arow_no1){
		this.slip_arow_no1 = slip_arow_no1;
	}

	public String getAcct_cd(){
		return this.acct_cd;
	}

	public String getAcct_nm(){
		return this.acct_nm;
	}

	public String getBudg_cd(){
		return this.budg_cd;
	}

	public String getClam_dept_cd(){
		return this.clam_dept_cd;
	}

	public String getUse_dept_cd(){
		return this.use_dept_cd;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getObj_amt(){
		return this.obj_amt;
	}

	public String getVat_amt(){
		return this.vat_amt;
	}

	public String getNdduc_rate(){
		return this.ndduc_rate;
	}

	public String getNdduc_amt(){
		return this.ndduc_amt;
	}

	public String getOrgy_ndduc_amt(){
		return this.orgy_ndduc_amt;
	}

	public String getComn_ndduc_amt(){
		return this.comn_ndduc_amt;
	}

	public String getNon_dduc_stot(){
		return this.non_dduc_stot;
	}

	public String getOrgy_dduc_amt(){
		return this.orgy_dduc_amt;
	}

	public String getComn_dduc_amt(){
		return this.comn_dduc_amt;
	}

	public String getDduc_stot(){
		return this.dduc_stot;
	}

	public String getAcml_amt1(){
		return this.acml_amt1;
	}

	public String getAcml_amt2(){
		return this.acml_amt2;
	}

	public String getSlip_mang_clsf(){
		return this.slip_mang_clsf;
	}

	public String getSlip_mang_clsf_nm(){
		return this.slip_mang_clsf_nm;
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

	public String getSlip_arow_no(){
		return this.slip_arow_no;
	}

	public String getSlip_occr_dt1(){
		return this.slip_occr_dt1;
	}

	public String getSlip_clsf_cd1(){
		return this.slip_clsf_cd1;
	}

	public String getSlip_seq1(){
		return this.slip_seq1;
	}

	public String getSlip_sub_seq1(){
		return this.slip_sub_seq1;
	}

	public String getSlip_arow_no1(){
		return this.slip_arow_no1;
	}
}

/* 작성시간 : Fri Mar 06 09:44:30 KST 2009 */
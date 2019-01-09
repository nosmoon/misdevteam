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


public class FC_ACCT_6092_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String prof_type_cd;
	public String taxstmt_no;
	public String dlco_cd;
	public String ern;
	public String dlco_nm;
	public String suply_amt;
	public String vat_amt;
	public String rmks;
	public String budg_cd;
	public String fisc_dt;
	public String slip_no;
	public String erplace_cd;
	public String make_dt;
	public String vexc_cmpy_cd;
	public String suply_total;
	public String vat_total;
	public String elec_tax_comp_nm;

	public FC_ACCT_6092_LCURLISTRecord(){}

	public void setProf_type_cd(String prof_type_cd){
		this.prof_type_cd = prof_type_cd;
	}

	public void setTaxstmt_no(String taxstmt_no){
		this.taxstmt_no = taxstmt_no;
	}

	public void setDlco_cd(String dlco_cd){
		this.dlco_cd = dlco_cd;
	}

	public void setErn(String ern){
		this.ern = ern;
	}

	public void setDlco_nm(String dlco_nm){
		this.dlco_nm = dlco_nm;
	}

	public void setSuply_amt(String suply_amt){
		this.suply_amt = suply_amt;
	}

	public void setVat_amt(String vat_amt){
		this.vat_amt = vat_amt;
	}

	public void setRmks(String rmks){
		this.rmks = rmks;
	}

	public void setBudg_cd(String budg_cd){
		this.budg_cd = budg_cd;
	}

	public void setFisc_dt(String fisc_dt){
		this.fisc_dt = fisc_dt;
	}

	public void setSlip_no(String slip_no){
		this.slip_no = slip_no;
	}

	public void setErplace_cd(String erplace_cd){
		this.erplace_cd = erplace_cd;
	}

	public void setMake_dt(String make_dt){
		this.make_dt = make_dt;
	}

	public void setVexc_cmpy_cd(String vexc_cmpy_cd){
		this.vexc_cmpy_cd = vexc_cmpy_cd;
	}

	public void setSuply_total(String suply_total){
		this.suply_total = suply_total;
	}

	public void setVat_total(String vat_total){
		this.vat_total = vat_total;
	}

	public void setElec_tax_comp_nm(String elec_tax_comp_nm){
		this.elec_tax_comp_nm = elec_tax_comp_nm;
	}

	public String getProf_type_cd(){
		return this.prof_type_cd;
	}

	public String getTaxstmt_no(){
		return this.taxstmt_no;
	}

	public String getDlco_cd(){
		return this.dlco_cd;
	}

	public String getErn(){
		return this.ern;
	}

	public String getDlco_nm(){
		return this.dlco_nm;
	}

	public String getSuply_amt(){
		return this.suply_amt;
	}

	public String getVat_amt(){
		return this.vat_amt;
	}

	public String getRmks(){
		return this.rmks;
	}

	public String getBudg_cd(){
		return this.budg_cd;
	}

	public String getFisc_dt(){
		return this.fisc_dt;
	}

	public String getSlip_no(){
		return this.slip_no;
	}

	public String getErplace_cd(){
		return this.erplace_cd;
	}

	public String getMake_dt(){
		return this.make_dt;
	}

	public String getVexc_cmpy_cd(){
		return this.vexc_cmpy_cd;
	}

	public String getSuply_total(){
		return this.suply_total;
	}

	public String getVat_total(){
		return this.vat_total;
	}

	public String getElec_tax_comp_nm(){
		return this.elec_tax_comp_nm;
	}
}

/* 작성시간 : Wed Sep 23 14:16:25 KST 2015 */
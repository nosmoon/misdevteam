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


public class FC_ACCT_2540_LCURLIST1Record extends java.lang.Object implements java.io.Serializable{

	public String fisc_dt;
	public String slip_no;
	public String slip_occr_dt;
	public String slip_clsf_cd;
	public String slip_seq;
	public String slip_sub_seq;
	public String slip_arow_no;
	public String rmks;
	public String dr_amt;
	public String crdt_amt;
	public String mang_clsf_cd;
	public String pch_gwgbnm;
	public String mang_no;
	public String dlco_clsf_cd;
	public String pch_compgbnm;
	public String dlco_cd;
	public String dlco_nm;
	public String boks_dlco_nm;
	public String medi_cd;
	public String pch_mccdnm;
	public String insd_acct_cd;
	public String evnt_cd;
	public String pch_hsnm;
	public String obj_amt;
	public String pch_cgbsnm;
	public String pch_dsacctnm;

	public FC_ACCT_2540_LCURLIST1Record(){}

	public void setFisc_dt(String fisc_dt){
		this.fisc_dt = fisc_dt;
	}

	public void setSlip_no(String slip_no){
		this.slip_no = slip_no;
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

	public void setRmks(String rmks){
		this.rmks = rmks;
	}

	public void setDr_amt(String dr_amt){
		this.dr_amt = dr_amt;
	}

	public void setCrdt_amt(String crdt_amt){
		this.crdt_amt = crdt_amt;
	}

	public void setMang_clsf_cd(String mang_clsf_cd){
		this.mang_clsf_cd = mang_clsf_cd;
	}

	public void setPch_gwgbnm(String pch_gwgbnm){
		this.pch_gwgbnm = pch_gwgbnm;
	}

	public void setMang_no(String mang_no){
		this.mang_no = mang_no;
	}

	public void setDlco_clsf_cd(String dlco_clsf_cd){
		this.dlco_clsf_cd = dlco_clsf_cd;
	}

	public void setPch_compgbnm(String pch_compgbnm){
		this.pch_compgbnm = pch_compgbnm;
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

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setPch_mccdnm(String pch_mccdnm){
		this.pch_mccdnm = pch_mccdnm;
	}

	public void setInsd_acct_cd(String insd_acct_cd){
		this.insd_acct_cd = insd_acct_cd;
	}

	public void setEvnt_cd(String evnt_cd){
		this.evnt_cd = evnt_cd;
	}

	public void setPch_hsnm(String pch_hsnm){
		this.pch_hsnm = pch_hsnm;
	}

	public void setObj_amt(String obj_amt){
		this.obj_amt = obj_amt;
	}

	public void setPch_cgbsnm(String pch_cgbsnm){
		this.pch_cgbsnm = pch_cgbsnm;
	}

	public void setPch_dsacctnm(String pch_dsacctnm){
		this.pch_dsacctnm = pch_dsacctnm;
	}

	public String getFisc_dt(){
		return this.fisc_dt;
	}

	public String getSlip_no(){
		return this.slip_no;
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

	public String getRmks(){
		return this.rmks;
	}

	public String getDr_amt(){
		return this.dr_amt;
	}

	public String getCrdt_amt(){
		return this.crdt_amt;
	}

	public String getMang_clsf_cd(){
		return this.mang_clsf_cd;
	}

	public String getPch_gwgbnm(){
		return this.pch_gwgbnm;
	}

	public String getMang_no(){
		return this.mang_no;
	}

	public String getDlco_clsf_cd(){
		return this.dlco_clsf_cd;
	}

	public String getPch_compgbnm(){
		return this.pch_compgbnm;
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

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getPch_mccdnm(){
		return this.pch_mccdnm;
	}

	public String getInsd_acct_cd(){
		return this.insd_acct_cd;
	}

	public String getEvnt_cd(){
		return this.evnt_cd;
	}

	public String getPch_hsnm(){
		return this.pch_hsnm;
	}

	public String getObj_amt(){
		return this.obj_amt;
	}

	public String getPch_cgbsnm(){
		return this.pch_cgbsnm;
	}

	public String getPch_dsacctnm(){
		return this.pch_dsacctnm;
	}
}

/* 작성시간 : Fri May 29 18:02:12 KST 2009 */
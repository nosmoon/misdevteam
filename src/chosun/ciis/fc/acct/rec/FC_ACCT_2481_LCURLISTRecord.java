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


public class FC_ACCT_2481_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String budg_cd;
	public String budg_cd_nm;
	public String fisc_dt;
	public String slip_occr_dt;
	public String slip_clsf_cd;
	public String slip_seq;
	public String slip_sub_seq;
	public String slip_arow_no;
	public String rmks1;
	public String rmks2;
	public String dr_amt;
	public String crdt_amt;
	public String mang_clsf_cd;
	public String mang_clsf_cd_nm;
	public String mang_no;
	public String dlco_clsf_cd;
	public String dlco_clsf_cd_nm;
	public String dlco_cd;
	public String dlco_nm;
	public String boks_dlco_nm;
	public String medi_cd;
	public String medi_cd_nm;
	public String prop_equip_cd;
	public String use_dept_cd;
	public String evnt_cd;
	public String evnt_cd_nm;
	public String obj_amt;
	public String clam_dept_cd_nm;
	public String obj_acct_cd_nm;
	public String dtls_medi_cd;
	public String dtls_medi_cdnm;
	public String incm_clsf_cd_nm;
	public String chnl_clsf_cd;

	public FC_ACCT_2481_LCURLISTRecord(){}

	public void setBudg_cd(String budg_cd){
		this.budg_cd = budg_cd;
	}

	public void setBudg_cd_nm(String budg_cd_nm){
		this.budg_cd_nm = budg_cd_nm;
	}

	public void setFisc_dt(String fisc_dt){
		this.fisc_dt = fisc_dt;
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

	public void setRmks1(String rmks1){
		this.rmks1 = rmks1;
	}

	public void setRmks2(String rmks2){
		this.rmks2 = rmks2;
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

	public void setMang_clsf_cd_nm(String mang_clsf_cd_nm){
		this.mang_clsf_cd_nm = mang_clsf_cd_nm;
	}

	public void setMang_no(String mang_no){
		this.mang_no = mang_no;
	}

	public void setDlco_clsf_cd(String dlco_clsf_cd){
		this.dlco_clsf_cd = dlco_clsf_cd;
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

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setMedi_cd_nm(String medi_cd_nm){
		this.medi_cd_nm = medi_cd_nm;
	}

	public void setProp_equip_cd(String prop_equip_cd){
		this.prop_equip_cd = prop_equip_cd;
	}

	public void setUse_dept_cd(String use_dept_cd){
		this.use_dept_cd = use_dept_cd;
	}

	public void setEvnt_cd(String evnt_cd){
		this.evnt_cd = evnt_cd;
	}

	public void setEvnt_cd_nm(String evnt_cd_nm){
		this.evnt_cd_nm = evnt_cd_nm;
	}

	public void setObj_amt(String obj_amt){
		this.obj_amt = obj_amt;
	}

	public void setClam_dept_cd_nm(String clam_dept_cd_nm){
		this.clam_dept_cd_nm = clam_dept_cd_nm;
	}

	public void setObj_acct_cd_nm(String obj_acct_cd_nm){
		this.obj_acct_cd_nm = obj_acct_cd_nm;
	}

	public void setDtls_medi_cd(String dtls_medi_cd){
		this.dtls_medi_cd = dtls_medi_cd;
	}

	public void setDtls_medi_cdnm(String dtls_medi_cdnm){
		this.dtls_medi_cdnm = dtls_medi_cdnm;
	}

	public void setIncm_clsf_cd_nm(String incm_clsf_cd_nm){
		this.incm_clsf_cd_nm = incm_clsf_cd_nm;
	}

	public void setChnl_clsf_cd(String chnl_clsf_cd){
		this.chnl_clsf_cd = chnl_clsf_cd;
	}

	public String getBudg_cd(){
		return this.budg_cd;
	}

	public String getBudg_cd_nm(){
		return this.budg_cd_nm;
	}

	public String getFisc_dt(){
		return this.fisc_dt;
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

	public String getRmks1(){
		return this.rmks1;
	}

	public String getRmks2(){
		return this.rmks2;
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

	public String getMang_clsf_cd_nm(){
		return this.mang_clsf_cd_nm;
	}

	public String getMang_no(){
		return this.mang_no;
	}

	public String getDlco_clsf_cd(){
		return this.dlco_clsf_cd;
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

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getMedi_cd_nm(){
		return this.medi_cd_nm;
	}

	public String getProp_equip_cd(){
		return this.prop_equip_cd;
	}

	public String getUse_dept_cd(){
		return this.use_dept_cd;
	}

	public String getEvnt_cd(){
		return this.evnt_cd;
	}

	public String getEvnt_cd_nm(){
		return this.evnt_cd_nm;
	}

	public String getObj_amt(){
		return this.obj_amt;
	}

	public String getClam_dept_cd_nm(){
		return this.clam_dept_cd_nm;
	}

	public String getObj_acct_cd_nm(){
		return this.obj_acct_cd_nm;
	}

	public String getDtls_medi_cd(){
		return this.dtls_medi_cd;
	}

	public String getDtls_medi_cdnm(){
		return this.dtls_medi_cdnm;
	}

	public String getIncm_clsf_cd_nm(){
		return this.incm_clsf_cd_nm;
	}

	public String getChnl_clsf_cd(){
		return this.chnl_clsf_cd;
	}
}

/* 작성시간 : Fri Feb 24 17:55:47 KST 2017 */
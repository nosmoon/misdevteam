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


public class FC_ACCT_2491_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String budg_cd;
	public String budg_cd_nm;
	public String fisc_dt;
	public String slip_no;
	public String rmks;
	public String dr_amt;
	public String crdt_amt;
	public String mang_clsf_cd;
	public String mang_no;
	public String dlco_clsf_cd;
	public String dlco_cd;
	public String dlco_nm;
	public String boks_dlco_nm;
	public String medi_cd;
	public String prop_equip_cd;
	public String use_dept_cd;
	public String evnt_cd;
	public String dlco_clsf_cd_nm;
	public String obj_amt;
	public String clam_dept_cd;
	public String obj_acct_cd;
	public String dtls_medi_cd;
	public String incm_clsf_cd_nm;
	public String chnl_clsf_cd;

	public FC_ACCT_2491_LCURLISTRecord(){}

	public void setBudg_cd(String budg_cd){
		this.budg_cd = budg_cd;
	}

	public void setBudg_cd_nm(String budg_cd_nm){
		this.budg_cd_nm = budg_cd_nm;
	}

	public void setFisc_dt(String fisc_dt){
		this.fisc_dt = fisc_dt;
	}

	public void setSlip_no(String slip_no){
		this.slip_no = slip_no;
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

	public void setMang_no(String mang_no){
		this.mang_no = mang_no;
	}

	public void setDlco_clsf_cd(String dlco_clsf_cd){
		this.dlco_clsf_cd = dlco_clsf_cd;
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

	public void setProp_equip_cd(String prop_equip_cd){
		this.prop_equip_cd = prop_equip_cd;
	}

	public void setUse_dept_cd(String use_dept_cd){
		this.use_dept_cd = use_dept_cd;
	}

	public void setEvnt_cd(String evnt_cd){
		this.evnt_cd = evnt_cd;
	}

	public void setDlco_clsf_cd_nm(String dlco_clsf_cd_nm){
		this.dlco_clsf_cd_nm = dlco_clsf_cd_nm;
	}

	public void setObj_amt(String obj_amt){
		this.obj_amt = obj_amt;
	}

	public void setClam_dept_cd(String clam_dept_cd){
		this.clam_dept_cd = clam_dept_cd;
	}

	public void setObj_acct_cd(String obj_acct_cd){
		this.obj_acct_cd = obj_acct_cd;
	}

	public void setDtls_medi_cd(String dtls_medi_cd){
		this.dtls_medi_cd = dtls_medi_cd;
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

	public String getSlip_no(){
		return this.slip_no;
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

	public String getMang_no(){
		return this.mang_no;
	}

	public String getDlco_clsf_cd(){
		return this.dlco_clsf_cd;
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

	public String getProp_equip_cd(){
		return this.prop_equip_cd;
	}

	public String getUse_dept_cd(){
		return this.use_dept_cd;
	}

	public String getEvnt_cd(){
		return this.evnt_cd;
	}

	public String getDlco_clsf_cd_nm(){
		return this.dlco_clsf_cd_nm;
	}

	public String getObj_amt(){
		return this.obj_amt;
	}

	public String getClam_dept_cd(){
		return this.clam_dept_cd;
	}

	public String getObj_acct_cd(){
		return this.obj_acct_cd;
	}

	public String getDtls_medi_cd(){
		return this.dtls_medi_cd;
	}

	public String getIncm_clsf_cd_nm(){
		return this.incm_clsf_cd_nm;
	}

	public String getChnl_clsf_cd(){
		return this.chnl_clsf_cd;
	}
}

/* 작성시간 : Fri Mar 30 17:47:19 KST 2018 */
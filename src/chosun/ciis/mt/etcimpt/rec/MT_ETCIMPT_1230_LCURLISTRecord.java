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


package chosun.ciis.mt.etcimpt.rec;

import java.sql.*;
import chosun.ciis.mt.etcimpt.dm.*;
import chosun.ciis.mt.etcimpt.ds.*;

/**
 * 
 */


public class MT_ETCIMPT_1230_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String slip_occr_dt;
	public String slip_clsf_cd;
	public String prenum;
	public String slip_seq;
	public String slip_sub_seq;
	public String slip_arow_no;
	public String budg_cd;
	public String budg_nm;
	public String dr_amt;
	public String crdt_amt;
	public String rmks1;
	public String rmks2;
	public String boks_dlco_nm;
	public String use_dept_cd;
	public String prop_equip_cd;
	public String medi_cd;
	public String medi_nm;
	public String dtls_medi_cd;
	public String budg_yymm;
	public String clam_dept_cd;
	public String clam_dept_nm;
	public String chrg_emp_no;
	public String chrg_emp_nm;
	public String incmg_dt;
	public String fisc_dt;
	public String fisc_seq;

	public MT_ETCIMPT_1230_LCURLISTRecord(){}

	public void setSlip_occr_dt(String slip_occr_dt){
		this.slip_occr_dt = slip_occr_dt;
	}

	public void setSlip_clsf_cd(String slip_clsf_cd){
		this.slip_clsf_cd = slip_clsf_cd;
	}

	public void setPrenum(String prenum){
		this.prenum = prenum;
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

	public void setBudg_cd(String budg_cd){
		this.budg_cd = budg_cd;
	}

	public void setBudg_nm(String budg_nm){
		this.budg_nm = budg_nm;
	}

	public void setDr_amt(String dr_amt){
		this.dr_amt = dr_amt;
	}

	public void setCrdt_amt(String crdt_amt){
		this.crdt_amt = crdt_amt;
	}

	public void setRmks1(String rmks1){
		this.rmks1 = rmks1;
	}

	public void setRmks2(String rmks2){
		this.rmks2 = rmks2;
	}

	public void setBoks_dlco_nm(String boks_dlco_nm){
		this.boks_dlco_nm = boks_dlco_nm;
	}

	public void setUse_dept_cd(String use_dept_cd){
		this.use_dept_cd = use_dept_cd;
	}

	public void setProp_equip_cd(String prop_equip_cd){
		this.prop_equip_cd = prop_equip_cd;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setMedi_nm(String medi_nm){
		this.medi_nm = medi_nm;
	}

	public void setDtls_medi_cd(String dtls_medi_cd){
		this.dtls_medi_cd = dtls_medi_cd;
	}

	public void setBudg_yymm(String budg_yymm){
		this.budg_yymm = budg_yymm;
	}

	public void setClam_dept_cd(String clam_dept_cd){
		this.clam_dept_cd = clam_dept_cd;
	}

	public void setClam_dept_nm(String clam_dept_nm){
		this.clam_dept_nm = clam_dept_nm;
	}

	public void setChrg_emp_no(String chrg_emp_no){
		this.chrg_emp_no = chrg_emp_no;
	}

	public void setChrg_emp_nm(String chrg_emp_nm){
		this.chrg_emp_nm = chrg_emp_nm;
	}

	public void setIncmg_dt(String incmg_dt){
		this.incmg_dt = incmg_dt;
	}

	public void setFisc_dt(String fisc_dt){
		this.fisc_dt = fisc_dt;
	}

	public void setFisc_seq(String fisc_seq){
		this.fisc_seq = fisc_seq;
	}

	public String getSlip_occr_dt(){
		return this.slip_occr_dt;
	}

	public String getSlip_clsf_cd(){
		return this.slip_clsf_cd;
	}

	public String getPrenum(){
		return this.prenum;
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

	public String getBudg_cd(){
		return this.budg_cd;
	}

	public String getBudg_nm(){
		return this.budg_nm;
	}

	public String getDr_amt(){
		return this.dr_amt;
	}

	public String getCrdt_amt(){
		return this.crdt_amt;
	}

	public String getRmks1(){
		return this.rmks1;
	}

	public String getRmks2(){
		return this.rmks2;
	}

	public String getBoks_dlco_nm(){
		return this.boks_dlco_nm;
	}

	public String getUse_dept_cd(){
		return this.use_dept_cd;
	}

	public String getProp_equip_cd(){
		return this.prop_equip_cd;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getMedi_nm(){
		return this.medi_nm;
	}

	public String getDtls_medi_cd(){
		return this.dtls_medi_cd;
	}

	public String getBudg_yymm(){
		return this.budg_yymm;
	}

	public String getClam_dept_cd(){
		return this.clam_dept_cd;
	}

	public String getClam_dept_nm(){
		return this.clam_dept_nm;
	}

	public String getChrg_emp_no(){
		return this.chrg_emp_no;
	}

	public String getChrg_emp_nm(){
		return this.chrg_emp_nm;
	}

	public String getIncmg_dt(){
		return this.incmg_dt;
	}

	public String getFisc_dt(){
		return this.fisc_dt;
	}

	public String getFisc_seq(){
		return this.fisc_seq;
	}
}

/* 작성시간 : Thu May 28 10:01:31 KST 2009 */
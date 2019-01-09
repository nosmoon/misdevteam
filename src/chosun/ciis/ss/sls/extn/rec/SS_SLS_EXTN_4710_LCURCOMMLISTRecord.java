/***************************************************************************************************
* 파일명 : .java
* 기능 : 
* 작성일자 : 
* 작성자 : 심정보
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.ss.sls.extn.rec;

import java.sql.*;
import chosun.ciis.ss.sls.extn.dm.*;
import chosun.ciis.ss.sls.extn.ds.*;

/**
 * 
 */


public class SS_SLS_EXTN_4710_LCURCOMMLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String dncomp;
	public String dncompnm;
	public String ern;
	public String dlco_nm;
	public String make_dt;
	public String suply_amt;
	public String vat_amt;
	public String sum_amt;
	public String prx_amt;
	public String net_inc_amt;
	public String exp_slip_no;
	public String tax_no;
	public String ask_dept_cd;
	public String budg_cd;
	public String budg_nm;
	public String prof_type_cd;
	public String trans_yn;
	public String email;
	public String semuro_no;
	public String rcpm_amt;
	public String misu_amt;
	public String slip_clsf_cd;
	public String slip_occr_dt;
	public String slip_seq;
	public String exp_slip_clsf_cd;
	public String exp_slip_occr_dt;
	public String exp_slip_seq;
	public String aprv;
	public String boks_dlco_nm;
	public String medi_cd;

	public SS_SLS_EXTN_4710_LCURCOMMLISTRecord(){}

	public void setDncomp(String dncomp){
		this.dncomp = dncomp;
	}

	public void setDncompnm(String dncompnm){
		this.dncompnm = dncompnm;
	}

	public void setErn(String ern){
		this.ern = ern;
	}

	public void setDlco_nm(String dlco_nm){
		this.dlco_nm = dlco_nm;
	}

	public void setMake_dt(String make_dt){
		this.make_dt = make_dt;
	}

	public void setSuply_amt(String suply_amt){
		this.suply_amt = suply_amt;
	}

	public void setVat_amt(String vat_amt){
		this.vat_amt = vat_amt;
	}

	public void setSum_amt(String sum_amt){
		this.sum_amt = sum_amt;
	}

	public void setPrx_amt(String prx_amt){
		this.prx_amt = prx_amt;
	}

	public void setNet_inc_amt(String net_inc_amt){
		this.net_inc_amt = net_inc_amt;
	}

	public void setExp_slip_no(String exp_slip_no){
		this.exp_slip_no = exp_slip_no;
	}

	public void setTax_no(String tax_no){
		this.tax_no = tax_no;
	}

	public void setAsk_dept_cd(String ask_dept_cd){
		this.ask_dept_cd = ask_dept_cd;
	}

	public void setBudg_cd(String budg_cd){
		this.budg_cd = budg_cd;
	}

	public void setBudg_nm(String budg_nm){
		this.budg_nm = budg_nm;
	}

	public void setProf_type_cd(String prof_type_cd){
		this.prof_type_cd = prof_type_cd;
	}

	public void setTrans_yn(String trans_yn){
		this.trans_yn = trans_yn;
	}

	public void setEmail(String email){
		this.email = email;
	}

	public void setSemuro_no(String semuro_no){
		this.semuro_no = semuro_no;
	}

	public void setRcpm_amt(String rcpm_amt){
		this.rcpm_amt = rcpm_amt;
	}

	public void setMisu_amt(String misu_amt){
		this.misu_amt = misu_amt;
	}

	public void setSlip_clsf_cd(String slip_clsf_cd){
		this.slip_clsf_cd = slip_clsf_cd;
	}

	public void setSlip_occr_dt(String slip_occr_dt){
		this.slip_occr_dt = slip_occr_dt;
	}

	public void setSlip_seq(String slip_seq){
		this.slip_seq = slip_seq;
	}

	public void setExp_slip_clsf_cd(String exp_slip_clsf_cd){
		this.exp_slip_clsf_cd = exp_slip_clsf_cd;
	}

	public void setExp_slip_occr_dt(String exp_slip_occr_dt){
		this.exp_slip_occr_dt = exp_slip_occr_dt;
	}

	public void setExp_slip_seq(String exp_slip_seq){
		this.exp_slip_seq = exp_slip_seq;
	}

	public void setAprv(String aprv){
		this.aprv = aprv;
	}

	public void setBoks_dlco_nm(String boks_dlco_nm){
		this.boks_dlco_nm = boks_dlco_nm;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public String getDncomp(){
		return this.dncomp;
	}

	public String getDncompnm(){
		return this.dncompnm;
	}

	public String getErn(){
		return this.ern;
	}

	public String getDlco_nm(){
		return this.dlco_nm;
	}

	public String getMake_dt(){
		return this.make_dt;
	}

	public String getSuply_amt(){
		return this.suply_amt;
	}

	public String getVat_amt(){
		return this.vat_amt;
	}

	public String getSum_amt(){
		return this.sum_amt;
	}

	public String getPrx_amt(){
		return this.prx_amt;
	}

	public String getNet_inc_amt(){
		return this.net_inc_amt;
	}

	public String getExp_slip_no(){
		return this.exp_slip_no;
	}

	public String getTax_no(){
		return this.tax_no;
	}

	public String getAsk_dept_cd(){
		return this.ask_dept_cd;
	}

	public String getBudg_cd(){
		return this.budg_cd;
	}

	public String getBudg_nm(){
		return this.budg_nm;
	}

	public String getProf_type_cd(){
		return this.prof_type_cd;
	}

	public String getTrans_yn(){
		return this.trans_yn;
	}

	public String getEmail(){
		return this.email;
	}

	public String getSemuro_no(){
		return this.semuro_no;
	}

	public String getRcpm_amt(){
		return this.rcpm_amt;
	}

	public String getMisu_amt(){
		return this.misu_amt;
	}

	public String getSlip_clsf_cd(){
		return this.slip_clsf_cd;
	}

	public String getSlip_occr_dt(){
		return this.slip_occr_dt;
	}

	public String getSlip_seq(){
		return this.slip_seq;
	}

	public String getExp_slip_clsf_cd(){
		return this.exp_slip_clsf_cd;
	}

	public String getExp_slip_occr_dt(){
		return this.exp_slip_occr_dt;
	}

	public String getExp_slip_seq(){
		return this.exp_slip_seq;
	}

	public String getAprv(){
		return this.aprv;
	}

	public String getBoks_dlco_nm(){
		return this.boks_dlco_nm;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}
}

/* 작성시간 : Thu Jun 23 17:01:46 KST 2016 */
/***************************************************************************************************
* ���ϸ� : .java
* ��� : ���ڿ��-������û
* �ۼ����� : 2007-05-22
* �ۼ��� : ��뼷
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.sp.sal.rec;

import java.sql.*;
import chosun.ciis.sp.sal.dm.*;
import chosun.ciis.sp.sal.ds.*;

/**
 * 
 */


public class SP_SAL_3610_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String elec_trsm_yn;
	public String dlco_cd;
	public String dlco_nm;
	public String vat_gubun;
	public String presi_nm;
	public String ern;
	public String suply_amt;
	public String vat_amt;
	public String amt;
	public String semuro_no;
	public String email_id;
	public String ernm;
	public String slip_clsf_cd;
	public String slip_occr_dt;
	public String slip_seq;
	public String make_dt;
	public String prof_type_cd;

	public SP_SAL_3610_LCURLISTRecord(){}

	public void setElec_trsm_yn(String elec_trsm_yn){
		this.elec_trsm_yn = elec_trsm_yn;
	}

	public void setDlco_cd(String dlco_cd){
		this.dlco_cd = dlco_cd;
	}

	public void setDlco_nm(String dlco_nm){
		this.dlco_nm = dlco_nm;
	}

	public void setVat_gubun(String vat_gubun){
		this.vat_gubun = vat_gubun;
	}

	public void setPresi_nm(String presi_nm){
		this.presi_nm = presi_nm;
	}

	public void setErn(String ern){
		this.ern = ern;
	}

	public void setSuply_amt(String suply_amt){
		this.suply_amt = suply_amt;
	}

	public void setVat_amt(String vat_amt){
		this.vat_amt = vat_amt;
	}

	public void setAmt(String amt){
		this.amt = amt;
	}

	public void setSemuro_no(String semuro_no){
		this.semuro_no = semuro_no;
	}

	public void setEmail_id(String email_id){
		this.email_id = email_id;
	}

	public void setErnm(String ernm){
		this.ernm = ernm;
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

	public void setMake_dt(String make_dt){
		this.make_dt = make_dt;
	}

	public void setProf_type_cd(String prof_type_cd){
		this.prof_type_cd = prof_type_cd;
	}

	public String getElec_trsm_yn(){
		return this.elec_trsm_yn;
	}

	public String getDlco_cd(){
		return this.dlco_cd;
	}

	public String getDlco_nm(){
		return this.dlco_nm;
	}

	public String getVat_gubun(){
		return this.vat_gubun;
	}

	public String getPresi_nm(){
		return this.presi_nm;
	}

	public String getErn(){
		return this.ern;
	}

	public String getSuply_amt(){
		return this.suply_amt;
	}

	public String getVat_amt(){
		return this.vat_amt;
	}

	public String getAmt(){
		return this.amt;
	}

	public String getSemuro_no(){
		return this.semuro_no;
	}

	public String getEmail_id(){
		return this.email_id;
	}

	public String getErnm(){
		return this.ernm;
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

	public String getMake_dt(){
		return this.make_dt;
	}

	public String getProf_type_cd(){
		return this.prof_type_cd;
	}
}

/* �ۼ��ð� : Fri Jul 27 21:27:16 KST 2012 */
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


package chosun.ciis.sp.sal.rec;

import java.sql.*;
import chosun.ciis.sp.sal.dm.*;
import chosun.ciis.sp.sal.ds.*;

/**
 * 
 */


public class SP_SAL_3820_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String slip_clsf_cd;
	public String slip_occr_dt;
	public String slip_seq;
	public String make_dt;
	public String prof_type_cd;
	public String prof_type_cd_nm;
	public String dlco_cd;
	public String dlco_nm;
	public String presi_nm;
	public String ern;
	public String suply_amt;
	public String vat_amt;
	public String amt;
	public String trans_yn;
	public String occr_slip_no;
	public String ernm;

	public SP_SAL_3820_LCURLISTRecord(){}

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

	public void setProf_type_cd_nm(String prof_type_cd_nm){
		this.prof_type_cd_nm = prof_type_cd_nm;
	}

	public void setDlco_cd(String dlco_cd){
		this.dlco_cd = dlco_cd;
	}

	public void setDlco_nm(String dlco_nm){
		this.dlco_nm = dlco_nm;
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

	public void setTrans_yn(String trans_yn){
		this.trans_yn = trans_yn;
	}

	public void setOccr_slip_no(String occr_slip_no){
		this.occr_slip_no = occr_slip_no;
	}

	public void setErnm(String ernm){
		this.ernm = ernm;
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

	public String getProf_type_cd_nm(){
		return this.prof_type_cd_nm;
	}

	public String getDlco_cd(){
		return this.dlco_cd;
	}

	public String getDlco_nm(){
		return this.dlco_nm;
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

	public String getTrans_yn(){
		return this.trans_yn;
	}

	public String getOccr_slip_no(){
		return this.occr_slip_no;
	}

	public String getErnm(){
		return this.ernm;
	}
}

/* 작성시간 : Thu Aug 02 17:32:16 KST 2012 */
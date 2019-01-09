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


package chosun.ciis.co.semuro.rec;

import java.sql.*;
import chosun.ciis.co.semuro.dm.*;
import chosun.ciis.co.semuro.ds.*;

/**
 * 
 */


public class CO_SEMURO_1900_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String occr_dt;
	public String seq;
	public String slip_occr_dt;
	public String slip_occr_cd;
	public String slip_seq;
	public String stat_clsf;
	public String rmsg_pers_eps_no;
	public String semuro_no;
	public String rmsg_pers_presi_nm;
	public String rmsg_pers_nm;
	public String rmsg_pers_email;
	public String tot_suply_amt;
	public String tot_tax_amt;
	public String tot_amt;

	public CO_SEMURO_1900_LCURLISTRecord(){}

	public void setOccr_dt(String occr_dt){
		this.occr_dt = occr_dt;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setSlip_occr_dt(String slip_occr_dt){
		this.slip_occr_dt = slip_occr_dt;
	}

	public void setSlip_occr_cd(String slip_occr_cd){
		this.slip_occr_cd = slip_occr_cd;
	}

	public void setSlip_seq(String slip_seq){
		this.slip_seq = slip_seq;
	}

	public void setStat_clsf(String stat_clsf){
		this.stat_clsf = stat_clsf;
	}

	public void setRmsg_pers_eps_no(String rmsg_pers_eps_no){
		this.rmsg_pers_eps_no = rmsg_pers_eps_no;
	}

	public void setSemuro_no(String semuro_no){
		this.semuro_no = semuro_no;
	}

	public void setRmsg_pers_presi_nm(String rmsg_pers_presi_nm){
		this.rmsg_pers_presi_nm = rmsg_pers_presi_nm;
	}

	public void setRmsg_pers_nm(String rmsg_pers_nm){
		this.rmsg_pers_nm = rmsg_pers_nm;
	}

	public void setRmsg_pers_email(String rmsg_pers_email){
		this.rmsg_pers_email = rmsg_pers_email;
	}

	public void setTot_suply_amt(String tot_suply_amt){
		this.tot_suply_amt = tot_suply_amt;
	}

	public void setTot_tax_amt(String tot_tax_amt){
		this.tot_tax_amt = tot_tax_amt;
	}

	public void setTot_amt(String tot_amt){
		this.tot_amt = tot_amt;
	}

	public String getOccr_dt(){
		return this.occr_dt;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getSlip_occr_dt(){
		return this.slip_occr_dt;
	}

	public String getSlip_occr_cd(){
		return this.slip_occr_cd;
	}

	public String getSlip_seq(){
		return this.slip_seq;
	}

	public String getStat_clsf(){
		return this.stat_clsf;
	}

	public String getRmsg_pers_eps_no(){
		return this.rmsg_pers_eps_no;
	}

	public String getSemuro_no(){
		return this.semuro_no;
	}

	public String getRmsg_pers_presi_nm(){
		return this.rmsg_pers_presi_nm;
	}

	public String getRmsg_pers_nm(){
		return this.rmsg_pers_nm;
	}

	public String getRmsg_pers_email(){
		return this.rmsg_pers_email;
	}

	public String getTot_suply_amt(){
		return this.tot_suply_amt;
	}

	public String getTot_tax_amt(){
		return this.tot_tax_amt;
	}

	public String getTot_amt(){
		return this.tot_amt;
	}
}

/* 작성시간 : Tue Mar 17 11:58:19 KST 2009 */
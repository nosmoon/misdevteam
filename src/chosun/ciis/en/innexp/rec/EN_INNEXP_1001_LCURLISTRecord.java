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


package chosun.ciis.en.innexp.rec;

import java.sql.*;
import chosun.ciis.en.innexp.dm.*;
import chosun.ciis.en.innexp.ds.*;

/**
 * 
 */


public class EN_INNEXP_1001_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String reven_no;
	public String evnt_nm;
	public String titl;
	public String dlco_nm;
	public String reven_dt;
	public String reven_amt;
	public String vat_amt;
	public String rcpm_amt;
	public String stmt_no;
	public String actu_slip_no;
	public String chrg_pers_nm;
	public String chrg_dept_nm;
	public String incmg_pers_nm;
	public String incmg_dt;
	public String occr_dt;
	public String slip_clsf_cd;
	public String occr_seq;
	public String evnt_yy;
	public String evnt_cd;
	public String evnt_seq;

	public EN_INNEXP_1001_LCURLISTRecord(){}

	public void setReven_no(String reven_no){
		this.reven_no = reven_no;
	}

	public void setEvnt_nm(String evnt_nm){
		this.evnt_nm = evnt_nm;
	}

	public void setTitl(String titl){
		this.titl = titl;
	}

	public void setDlco_nm(String dlco_nm){
		this.dlco_nm = dlco_nm;
	}

	public void setReven_dt(String reven_dt){
		this.reven_dt = reven_dt;
	}

	public void setReven_amt(String reven_amt){
		this.reven_amt = reven_amt;
	}

	public void setVat_amt(String vat_amt){
		this.vat_amt = vat_amt;
	}

	public void setRcpm_amt(String rcpm_amt){
		this.rcpm_amt = rcpm_amt;
	}

	public void setStmt_no(String stmt_no){
		this.stmt_no = stmt_no;
	}

	public void setActu_slip_no(String actu_slip_no){
		this.actu_slip_no = actu_slip_no;
	}

	public void setChrg_pers_nm(String chrg_pers_nm){
		this.chrg_pers_nm = chrg_pers_nm;
	}

	public void setChrg_dept_nm(String chrg_dept_nm){
		this.chrg_dept_nm = chrg_dept_nm;
	}

	public void setIncmg_pers_nm(String incmg_pers_nm){
		this.incmg_pers_nm = incmg_pers_nm;
	}

	public void setIncmg_dt(String incmg_dt){
		this.incmg_dt = incmg_dt;
	}

	public void setOccr_dt(String occr_dt){
		this.occr_dt = occr_dt;
	}

	public void setSlip_clsf_cd(String slip_clsf_cd){
		this.slip_clsf_cd = slip_clsf_cd;
	}

	public void setOccr_seq(String occr_seq){
		this.occr_seq = occr_seq;
	}

	public void setEvnt_yy(String evnt_yy){
		this.evnt_yy = evnt_yy;
	}

	public void setEvnt_cd(String evnt_cd){
		this.evnt_cd = evnt_cd;
	}

	public void setEvnt_seq(String evnt_seq){
		this.evnt_seq = evnt_seq;
	}

	public String getReven_no(){
		return this.reven_no;
	}

	public String getEvnt_nm(){
		return this.evnt_nm;
	}

	public String getTitl(){
		return this.titl;
	}

	public String getDlco_nm(){
		return this.dlco_nm;
	}

	public String getReven_dt(){
		return this.reven_dt;
	}

	public String getReven_amt(){
		return this.reven_amt;
	}

	public String getVat_amt(){
		return this.vat_amt;
	}

	public String getRcpm_amt(){
		return this.rcpm_amt;
	}

	public String getStmt_no(){
		return this.stmt_no;
	}

	public String getActu_slip_no(){
		return this.actu_slip_no;
	}

	public String getChrg_pers_nm(){
		return this.chrg_pers_nm;
	}

	public String getChrg_dept_nm(){
		return this.chrg_dept_nm;
	}

	public String getIncmg_pers_nm(){
		return this.incmg_pers_nm;
	}

	public String getIncmg_dt(){
		return this.incmg_dt;
	}

	public String getOccr_dt(){
		return this.occr_dt;
	}

	public String getSlip_clsf_cd(){
		return this.slip_clsf_cd;
	}

	public String getOccr_seq(){
		return this.occr_seq;
	}

	public String getEvnt_yy(){
		return this.evnt_yy;
	}

	public String getEvnt_cd(){
		return this.evnt_cd;
	}

	public String getEvnt_seq(){
		return this.evnt_seq;
	}
}

/* 작성시간 : Tue May 19 21:31:31 KST 2009 */
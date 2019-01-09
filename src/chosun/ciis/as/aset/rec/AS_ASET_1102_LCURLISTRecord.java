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


package chosun.ciis.as.aset.rec;

import java.sql.*;
import chosun.ciis.as.aset.dm.*;
import chosun.ciis.as.aset.ds.*;

/**
 * 
 */


public class AS_ASET_1102_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String selected;
	public String chg_dt;
	public String chg_clsf_nm;
	public String remk;
	public String chg_tot_amt;
	public String vat_tot_amt;
	public String rcpm_tot_amt;
	public String dlco_nm;
	public String tax_stmt_no;
	public String slip_no;
	public String incmg_pers;
	public String incmg_dt_tm;
	public String chg_clsf;
	public String occr_dt;
	public String occr_seq;
	public String ndduc_year;
	public String ndduc_prd_clsf;

	public AS_ASET_1102_LCURLISTRecord(){}

	public void setSelected(String selected){
		this.selected = selected;
	}

	public void setChg_dt(String chg_dt){
		this.chg_dt = chg_dt;
	}

	public void setChg_clsf_nm(String chg_clsf_nm){
		this.chg_clsf_nm = chg_clsf_nm;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setChg_tot_amt(String chg_tot_amt){
		this.chg_tot_amt = chg_tot_amt;
	}

	public void setVat_tot_amt(String vat_tot_amt){
		this.vat_tot_amt = vat_tot_amt;
	}

	public void setRcpm_tot_amt(String rcpm_tot_amt){
		this.rcpm_tot_amt = rcpm_tot_amt;
	}

	public void setDlco_nm(String dlco_nm){
		this.dlco_nm = dlco_nm;
	}

	public void setTax_stmt_no(String tax_stmt_no){
		this.tax_stmt_no = tax_stmt_no;
	}

	public void setSlip_no(String slip_no){
		this.slip_no = slip_no;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setIncmg_dt_tm(String incmg_dt_tm){
		this.incmg_dt_tm = incmg_dt_tm;
	}

	public void setChg_clsf(String chg_clsf){
		this.chg_clsf = chg_clsf;
	}

	public void setOccr_dt(String occr_dt){
		this.occr_dt = occr_dt;
	}

	public void setOccr_seq(String occr_seq){
		this.occr_seq = occr_seq;
	}

	public void setNdduc_year(String ndduc_year){
		this.ndduc_year = ndduc_year;
	}

	public void setNdduc_prd_clsf(String ndduc_prd_clsf){
		this.ndduc_prd_clsf = ndduc_prd_clsf;
	}

	public String getSelected(){
		return this.selected;
	}

	public String getChg_dt(){
		return this.chg_dt;
	}

	public String getChg_clsf_nm(){
		return this.chg_clsf_nm;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getChg_tot_amt(){
		return this.chg_tot_amt;
	}

	public String getVat_tot_amt(){
		return this.vat_tot_amt;
	}

	public String getRcpm_tot_amt(){
		return this.rcpm_tot_amt;
	}

	public String getDlco_nm(){
		return this.dlco_nm;
	}

	public String getTax_stmt_no(){
		return this.tax_stmt_no;
	}

	public String getSlip_no(){
		return this.slip_no;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getIncmg_dt_tm(){
		return this.incmg_dt_tm;
	}

	public String getChg_clsf(){
		return this.chg_clsf;
	}

	public String getOccr_dt(){
		return this.occr_dt;
	}

	public String getOccr_seq(){
		return this.occr_seq;
	}

	public String getNdduc_year(){
		return this.ndduc_year;
	}

	public String getNdduc_prd_clsf(){
		return this.ndduc_prd_clsf;
	}
}

/* 작성시간 : Thu Mar 26 17:52:31 KST 2009 */
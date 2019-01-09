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


public class EN_INNEXP_1002_SCURLIST1Record extends java.lang.Object implements java.io.Serializable{

	public String occr_dt;
	public String slip_clsf_cd;
	public String occr_seq;
	public String reven_dt;
	public String dlco_clsf_cd;
	public String dlco_no;
	public String dlco_nm;
	public String boks_dlco_nm;
	public String titl;
	public String reven_amt;
	public String vat_amt;
	public String rcpm_amt;
	public String rcpm_shet_kind;
	public String rcpm_shet_no;
	public String prof_type_cd;
	public String stmt_occr_dt;
	public String stmt_occr_seq;
	public String chrg_dept_cd;
	public String chrg_dept_nm;
	public String chrg_pers_emp_no;
	public String chrg_pers_emp_nm;
	public String evnt_yy;
	public String evnt_cd;
	public String evnt_nm;
	public String evnt_seq;
	public String remk;
	public String payo_clsf;
	public String rcpm_occr_dt;
	public String rcpm_occr_seq;
	public String p_upd_occr_dt;
	public String p_upd_occr_seq;

	public EN_INNEXP_1002_SCURLIST1Record(){}

	public void setOccr_dt(String occr_dt){
		this.occr_dt = occr_dt;
	}

	public void setSlip_clsf_cd(String slip_clsf_cd){
		this.slip_clsf_cd = slip_clsf_cd;
	}

	public void setOccr_seq(String occr_seq){
		this.occr_seq = occr_seq;
	}

	public void setReven_dt(String reven_dt){
		this.reven_dt = reven_dt;
	}

	public void setDlco_clsf_cd(String dlco_clsf_cd){
		this.dlco_clsf_cd = dlco_clsf_cd;
	}

	public void setDlco_no(String dlco_no){
		this.dlco_no = dlco_no;
	}

	public void setDlco_nm(String dlco_nm){
		this.dlco_nm = dlco_nm;
	}

	public void setBoks_dlco_nm(String boks_dlco_nm){
		this.boks_dlco_nm = boks_dlco_nm;
	}

	public void setTitl(String titl){
		this.titl = titl;
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

	public void setRcpm_shet_kind(String rcpm_shet_kind){
		this.rcpm_shet_kind = rcpm_shet_kind;
	}

	public void setRcpm_shet_no(String rcpm_shet_no){
		this.rcpm_shet_no = rcpm_shet_no;
	}

	public void setProf_type_cd(String prof_type_cd){
		this.prof_type_cd = prof_type_cd;
	}

	public void setStmt_occr_dt(String stmt_occr_dt){
		this.stmt_occr_dt = stmt_occr_dt;
	}

	public void setStmt_occr_seq(String stmt_occr_seq){
		this.stmt_occr_seq = stmt_occr_seq;
	}

	public void setChrg_dept_cd(String chrg_dept_cd){
		this.chrg_dept_cd = chrg_dept_cd;
	}

	public void setChrg_dept_nm(String chrg_dept_nm){
		this.chrg_dept_nm = chrg_dept_nm;
	}

	public void setChrg_pers_emp_no(String chrg_pers_emp_no){
		this.chrg_pers_emp_no = chrg_pers_emp_no;
	}

	public void setChrg_pers_emp_nm(String chrg_pers_emp_nm){
		this.chrg_pers_emp_nm = chrg_pers_emp_nm;
	}

	public void setEvnt_yy(String evnt_yy){
		this.evnt_yy = evnt_yy;
	}

	public void setEvnt_cd(String evnt_cd){
		this.evnt_cd = evnt_cd;
	}

	public void setEvnt_nm(String evnt_nm){
		this.evnt_nm = evnt_nm;
	}

	public void setEvnt_seq(String evnt_seq){
		this.evnt_seq = evnt_seq;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setPayo_clsf(String payo_clsf){
		this.payo_clsf = payo_clsf;
	}

	public void setRcpm_occr_dt(String rcpm_occr_dt){
		this.rcpm_occr_dt = rcpm_occr_dt;
	}

	public void setRcpm_occr_seq(String rcpm_occr_seq){
		this.rcpm_occr_seq = rcpm_occr_seq;
	}

	public void setP_upd_occr_dt(String p_upd_occr_dt){
		this.p_upd_occr_dt = p_upd_occr_dt;
	}

	public void setP_upd_occr_seq(String p_upd_occr_seq){
		this.p_upd_occr_seq = p_upd_occr_seq;
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

	public String getReven_dt(){
		return this.reven_dt;
	}

	public String getDlco_clsf_cd(){
		return this.dlco_clsf_cd;
	}

	public String getDlco_no(){
		return this.dlco_no;
	}

	public String getDlco_nm(){
		return this.dlco_nm;
	}

	public String getBoks_dlco_nm(){
		return this.boks_dlco_nm;
	}

	public String getTitl(){
		return this.titl;
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

	public String getRcpm_shet_kind(){
		return this.rcpm_shet_kind;
	}

	public String getRcpm_shet_no(){
		return this.rcpm_shet_no;
	}

	public String getProf_type_cd(){
		return this.prof_type_cd;
	}

	public String getStmt_occr_dt(){
		return this.stmt_occr_dt;
	}

	public String getStmt_occr_seq(){
		return this.stmt_occr_seq;
	}

	public String getChrg_dept_cd(){
		return this.chrg_dept_cd;
	}

	public String getChrg_dept_nm(){
		return this.chrg_dept_nm;
	}

	public String getChrg_pers_emp_no(){
		return this.chrg_pers_emp_no;
	}

	public String getChrg_pers_emp_nm(){
		return this.chrg_pers_emp_nm;
	}

	public String getEvnt_yy(){
		return this.evnt_yy;
	}

	public String getEvnt_cd(){
		return this.evnt_cd;
	}

	public String getEvnt_nm(){
		return this.evnt_nm;
	}

	public String getEvnt_seq(){
		return this.evnt_seq;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getPayo_clsf(){
		return this.payo_clsf;
	}

	public String getRcpm_occr_dt(){
		return this.rcpm_occr_dt;
	}

	public String getRcpm_occr_seq(){
		return this.rcpm_occr_seq;
	}

	public String getP_upd_occr_dt(){
		return this.p_upd_occr_dt;
	}

	public String getP_upd_occr_seq(){
		return this.p_upd_occr_seq;
	}
}

/* 작성시간 : Fri May 22 14:20:59 KST 2009 */
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


public class EN_INNEXP_1101_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String slip_occr_no;
	public String make_dt;
	public String ern;
	public String dlco_nm;
	public String presi_nm;
	public String tax_stmt_aprv_yn;
	public String tax_suply_amt;
	public String tax_vat_amt;
	public String tot_amt;
	public String slip_occr_dt;
	public String slip_seq;
	public String slip_clsf_cd;
	public String prof_type_cd;
	public String dlco_clsf_cd;
	public String dlco_cd;
	public String erplace_cd;
	public String deal_clsf;
	public String addr;
	public String bizcond;
	public String item;
	public String titl;
	public String canc_dt;
	public String vexc_cmpy_cd;
	public String issu_pers_emp_no;
	public String issu_pers_emp_nm;
	public String evnt_cd;
	public String evnt_nm;
	public String remk;
	public String ask_emp_no;
	public String ask_dept_cd;
	public String re_issu_resn_cd;
	public String issu_tms;
	public String chg_dt;
	public String chg_pers;
	public String chg_pers_nm;

	public EN_INNEXP_1101_LCURLISTRecord(){}

	public void setSlip_occr_no(String slip_occr_no){
		this.slip_occr_no = slip_occr_no;
	}

	public void setMake_dt(String make_dt){
		this.make_dt = make_dt;
	}

	public void setErn(String ern){
		this.ern = ern;
	}

	public void setDlco_nm(String dlco_nm){
		this.dlco_nm = dlco_nm;
	}

	public void setPresi_nm(String presi_nm){
		this.presi_nm = presi_nm;
	}

	public void setTax_stmt_aprv_yn(String tax_stmt_aprv_yn){
		this.tax_stmt_aprv_yn = tax_stmt_aprv_yn;
	}

	public void setTax_suply_amt(String tax_suply_amt){
		this.tax_suply_amt = tax_suply_amt;
	}

	public void setTax_vat_amt(String tax_vat_amt){
		this.tax_vat_amt = tax_vat_amt;
	}

	public void setTot_amt(String tot_amt){
		this.tot_amt = tot_amt;
	}

	public void setSlip_occr_dt(String slip_occr_dt){
		this.slip_occr_dt = slip_occr_dt;
	}

	public void setSlip_seq(String slip_seq){
		this.slip_seq = slip_seq;
	}

	public void setSlip_clsf_cd(String slip_clsf_cd){
		this.slip_clsf_cd = slip_clsf_cd;
	}

	public void setProf_type_cd(String prof_type_cd){
		this.prof_type_cd = prof_type_cd;
	}

	public void setDlco_clsf_cd(String dlco_clsf_cd){
		this.dlco_clsf_cd = dlco_clsf_cd;
	}

	public void setDlco_cd(String dlco_cd){
		this.dlco_cd = dlco_cd;
	}

	public void setErplace_cd(String erplace_cd){
		this.erplace_cd = erplace_cd;
	}

	public void setDeal_clsf(String deal_clsf){
		this.deal_clsf = deal_clsf;
	}

	public void setAddr(String addr){
		this.addr = addr;
	}

	public void setBizcond(String bizcond){
		this.bizcond = bizcond;
	}

	public void setItem(String item){
		this.item = item;
	}

	public void setTitl(String titl){
		this.titl = titl;
	}

	public void setCanc_dt(String canc_dt){
		this.canc_dt = canc_dt;
	}

	public void setVexc_cmpy_cd(String vexc_cmpy_cd){
		this.vexc_cmpy_cd = vexc_cmpy_cd;
	}

	public void setIssu_pers_emp_no(String issu_pers_emp_no){
		this.issu_pers_emp_no = issu_pers_emp_no;
	}

	public void setIssu_pers_emp_nm(String issu_pers_emp_nm){
		this.issu_pers_emp_nm = issu_pers_emp_nm;
	}

	public void setEvnt_cd(String evnt_cd){
		this.evnt_cd = evnt_cd;
	}

	public void setEvnt_nm(String evnt_nm){
		this.evnt_nm = evnt_nm;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setAsk_emp_no(String ask_emp_no){
		this.ask_emp_no = ask_emp_no;
	}

	public void setAsk_dept_cd(String ask_dept_cd){
		this.ask_dept_cd = ask_dept_cd;
	}

	public void setRe_issu_resn_cd(String re_issu_resn_cd){
		this.re_issu_resn_cd = re_issu_resn_cd;
	}

	public void setIssu_tms(String issu_tms){
		this.issu_tms = issu_tms;
	}

	public void setChg_dt(String chg_dt){
		this.chg_dt = chg_dt;
	}

	public void setChg_pers(String chg_pers){
		this.chg_pers = chg_pers;
	}

	public void setChg_pers_nm(String chg_pers_nm){
		this.chg_pers_nm = chg_pers_nm;
	}

	public String getSlip_occr_no(){
		return this.slip_occr_no;
	}

	public String getMake_dt(){
		return this.make_dt;
	}

	public String getErn(){
		return this.ern;
	}

	public String getDlco_nm(){
		return this.dlco_nm;
	}

	public String getPresi_nm(){
		return this.presi_nm;
	}

	public String getTax_stmt_aprv_yn(){
		return this.tax_stmt_aprv_yn;
	}

	public String getTax_suply_amt(){
		return this.tax_suply_amt;
	}

	public String getTax_vat_amt(){
		return this.tax_vat_amt;
	}

	public String getTot_amt(){
		return this.tot_amt;
	}

	public String getSlip_occr_dt(){
		return this.slip_occr_dt;
	}

	public String getSlip_seq(){
		return this.slip_seq;
	}

	public String getSlip_clsf_cd(){
		return this.slip_clsf_cd;
	}

	public String getProf_type_cd(){
		return this.prof_type_cd;
	}

	public String getDlco_clsf_cd(){
		return this.dlco_clsf_cd;
	}

	public String getDlco_cd(){
		return this.dlco_cd;
	}

	public String getErplace_cd(){
		return this.erplace_cd;
	}

	public String getDeal_clsf(){
		return this.deal_clsf;
	}

	public String getAddr(){
		return this.addr;
	}

	public String getBizcond(){
		return this.bizcond;
	}

	public String getItem(){
		return this.item;
	}

	public String getTitl(){
		return this.titl;
	}

	public String getCanc_dt(){
		return this.canc_dt;
	}

	public String getVexc_cmpy_cd(){
		return this.vexc_cmpy_cd;
	}

	public String getIssu_pers_emp_no(){
		return this.issu_pers_emp_no;
	}

	public String getIssu_pers_emp_nm(){
		return this.issu_pers_emp_nm;
	}

	public String getEvnt_cd(){
		return this.evnt_cd;
	}

	public String getEvnt_nm(){
		return this.evnt_nm;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getAsk_emp_no(){
		return this.ask_emp_no;
	}

	public String getAsk_dept_cd(){
		return this.ask_dept_cd;
	}

	public String getRe_issu_resn_cd(){
		return this.re_issu_resn_cd;
	}

	public String getIssu_tms(){
		return this.issu_tms;
	}

	public String getChg_dt(){
		return this.chg_dt;
	}

	public String getChg_pers(){
		return this.chg_pers;
	}

	public String getChg_pers_nm(){
		return this.chg_pers_nm;
	}
}

/* 작성시간 : Wed Apr 22 16:21:53 KST 2009 */
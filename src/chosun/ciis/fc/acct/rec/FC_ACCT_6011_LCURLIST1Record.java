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


public class FC_ACCT_6011_LCURLIST1Record extends java.lang.Object implements java.io.Serializable{

	public String cmpy_cd;
	public String prof_type_cd;
	public String slip_clsf_cd;
	public String slip_occr_dt;
	public String slip_seq;
	public String occr_slip_occr_dt;
	public String occr_slip_clsf_cd;
	public String occr_slip_seq;
	public String occr_slip_sub_seq;
	public String occr_slip_arow_no;
	public String make_dt;
	public String erplace_cd;
	public String dlco_clsf_cd;
	public String dlco_cd;
	public String dlco_nm;
	public String suply_amt;
	public String vat_amt;
	public String tax_stmt_aprv_yn;
	public String decl_yn;
	public String decl_qq;
	public String fisc_dt;
	public String deal_clsf;
	public String ern;
	public String presi_nm;
	public String addr;
	public String bizcond;
	public String item;
	public String canc_yn;
	public String canc_dt;
	public String del_resn;
	public String elec_tax_bill_yn;
	public String elec_tax_issu_dt;
	public String slip_no;
	public String incmg_pgm_id;
	public String semuro_no;
	public String elec_tax_comp_cd;
	public String elec_tax_comp_cd_nm;
	public String email_id;
	public String budg_cd;
	public String budg_cd_nm;
	public String biz_plc_cd;
	public String remk1;

	public FC_ACCT_6011_LCURLIST1Record(){}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setProf_type_cd(String prof_type_cd){
		this.prof_type_cd = prof_type_cd;
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

	public void setOccr_slip_occr_dt(String occr_slip_occr_dt){
		this.occr_slip_occr_dt = occr_slip_occr_dt;
	}

	public void setOccr_slip_clsf_cd(String occr_slip_clsf_cd){
		this.occr_slip_clsf_cd = occr_slip_clsf_cd;
	}

	public void setOccr_slip_seq(String occr_slip_seq){
		this.occr_slip_seq = occr_slip_seq;
	}

	public void setOccr_slip_sub_seq(String occr_slip_sub_seq){
		this.occr_slip_sub_seq = occr_slip_sub_seq;
	}

	public void setOccr_slip_arow_no(String occr_slip_arow_no){
		this.occr_slip_arow_no = occr_slip_arow_no;
	}

	public void setMake_dt(String make_dt){
		this.make_dt = make_dt;
	}

	public void setErplace_cd(String erplace_cd){
		this.erplace_cd = erplace_cd;
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

	public void setSuply_amt(String suply_amt){
		this.suply_amt = suply_amt;
	}

	public void setVat_amt(String vat_amt){
		this.vat_amt = vat_amt;
	}

	public void setTax_stmt_aprv_yn(String tax_stmt_aprv_yn){
		this.tax_stmt_aprv_yn = tax_stmt_aprv_yn;
	}

	public void setDecl_yn(String decl_yn){
		this.decl_yn = decl_yn;
	}

	public void setDecl_qq(String decl_qq){
		this.decl_qq = decl_qq;
	}

	public void setFisc_dt(String fisc_dt){
		this.fisc_dt = fisc_dt;
	}

	public void setDeal_clsf(String deal_clsf){
		this.deal_clsf = deal_clsf;
	}

	public void setErn(String ern){
		this.ern = ern;
	}

	public void setPresi_nm(String presi_nm){
		this.presi_nm = presi_nm;
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

	public void setCanc_yn(String canc_yn){
		this.canc_yn = canc_yn;
	}

	public void setCanc_dt(String canc_dt){
		this.canc_dt = canc_dt;
	}

	public void setDel_resn(String del_resn){
		this.del_resn = del_resn;
	}

	public void setElec_tax_bill_yn(String elec_tax_bill_yn){
		this.elec_tax_bill_yn = elec_tax_bill_yn;
	}

	public void setElec_tax_issu_dt(String elec_tax_issu_dt){
		this.elec_tax_issu_dt = elec_tax_issu_dt;
	}

	public void setSlip_no(String slip_no){
		this.slip_no = slip_no;
	}

	public void setIncmg_pgm_id(String incmg_pgm_id){
		this.incmg_pgm_id = incmg_pgm_id;
	}

	public void setSemuro_no(String semuro_no){
		this.semuro_no = semuro_no;
	}

	public void setElec_tax_comp_cd(String elec_tax_comp_cd){
		this.elec_tax_comp_cd = elec_tax_comp_cd;
	}

	public void setElec_tax_comp_cd_nm(String elec_tax_comp_cd_nm){
		this.elec_tax_comp_cd_nm = elec_tax_comp_cd_nm;
	}

	public void setEmail_id(String email_id){
		this.email_id = email_id;
	}

	public void setBudg_cd(String budg_cd){
		this.budg_cd = budg_cd;
	}

	public void setBudg_cd_nm(String budg_cd_nm){
		this.budg_cd_nm = budg_cd_nm;
	}

	public void setBiz_plc_cd(String biz_plc_cd){
		this.biz_plc_cd = biz_plc_cd;
	}

	public void setRemk1(String remk1){
		this.remk1 = remk1;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getProf_type_cd(){
		return this.prof_type_cd;
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

	public String getOccr_slip_occr_dt(){
		return this.occr_slip_occr_dt;
	}

	public String getOccr_slip_clsf_cd(){
		return this.occr_slip_clsf_cd;
	}

	public String getOccr_slip_seq(){
		return this.occr_slip_seq;
	}

	public String getOccr_slip_sub_seq(){
		return this.occr_slip_sub_seq;
	}

	public String getOccr_slip_arow_no(){
		return this.occr_slip_arow_no;
	}

	public String getMake_dt(){
		return this.make_dt;
	}

	public String getErplace_cd(){
		return this.erplace_cd;
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

	public String getSuply_amt(){
		return this.suply_amt;
	}

	public String getVat_amt(){
		return this.vat_amt;
	}

	public String getTax_stmt_aprv_yn(){
		return this.tax_stmt_aprv_yn;
	}

	public String getDecl_yn(){
		return this.decl_yn;
	}

	public String getDecl_qq(){
		return this.decl_qq;
	}

	public String getFisc_dt(){
		return this.fisc_dt;
	}

	public String getDeal_clsf(){
		return this.deal_clsf;
	}

	public String getErn(){
		return this.ern;
	}

	public String getPresi_nm(){
		return this.presi_nm;
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

	public String getCanc_yn(){
		return this.canc_yn;
	}

	public String getCanc_dt(){
		return this.canc_dt;
	}

	public String getDel_resn(){
		return this.del_resn;
	}

	public String getElec_tax_bill_yn(){
		return this.elec_tax_bill_yn;
	}

	public String getElec_tax_issu_dt(){
		return this.elec_tax_issu_dt;
	}

	public String getSlip_no(){
		return this.slip_no;
	}

	public String getIncmg_pgm_id(){
		return this.incmg_pgm_id;
	}

	public String getSemuro_no(){
		return this.semuro_no;
	}

	public String getElec_tax_comp_cd(){
		return this.elec_tax_comp_cd;
	}

	public String getElec_tax_comp_cd_nm(){
		return this.elec_tax_comp_cd_nm;
	}

	public String getEmail_id(){
		return this.email_id;
	}

	public String getBudg_cd(){
		return this.budg_cd;
	}

	public String getBudg_cd_nm(){
		return this.budg_cd_nm;
	}

	public String getBiz_plc_cd(){
		return this.biz_plc_cd;
	}

	public String getRemk1(){
		return this.remk1;
	}
}

/* 작성시간 : Thu May 03 14:22:18 KST 2018 */
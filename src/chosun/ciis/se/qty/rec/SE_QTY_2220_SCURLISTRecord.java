/***************************************************************************************************
* 파일명 : .java
* 기능 : 판매시스템
* 작성일자 : 2009-02-18
* 작성자 : 배창희
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.se.qty.rec;

import java.sql.*;
import chosun.ciis.se.qty.dm.*;
import chosun.ciis.se.qty.ds.*;

/**
 * 
 */


public class SE_QTY_2220_SCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String reg_dt;
	public String reg_seq;
	public String medi_cd;
	public String qty;
	public String prt_rfl_qty;
	public String aplc_pers_nm;
	public String aplc_pers_tel_no_1;
	public String aplc_pers_tel_no_2;
	public String aplc_pers_tel_no_3;
	public String aplc_pers_ptph_no_1;
	public String aplc_pers_ptph_no_2;
	public String aplc_pers_ptph_no_3;
	public String dlv_zip_1;
	public String dlv_zip_2;
	public String dlv_addr;
	public String dlv_dtls_addr;
	public String stmt_issu_req_yn;
	public String sell_clsf;
	public String rcpm_pers;
	public String setl_acct_no;
	public String amt;
	public String acpn_chrg_pers_nm;
	public String acpn_chrg_pers_cntc_plac;
	public String acpn_chrg_pers_dept_nm;
	public String cnfm_stat_clsf;
	public String cnfm_msg;
	public String cnfm_chrg_flnm;
	public String cnfm_dt;
	public String arvl_clsf;
	public String bo_cd;
	public String send_plac_nm;
	public String send_plac_seq;
	public String clos_yn;
	public String issu_dt;

	public SE_QTY_2220_SCURLISTRecord(){}

	public void setReg_dt(String reg_dt){
		this.reg_dt = reg_dt;
	}

	public void setReg_seq(String reg_seq){
		this.reg_seq = reg_seq;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setQty(String qty){
		this.qty = qty;
	}

	public void setPrt_rfl_qty(String prt_rfl_qty){
		this.prt_rfl_qty = prt_rfl_qty;
	}

	public void setAplc_pers_nm(String aplc_pers_nm){
		this.aplc_pers_nm = aplc_pers_nm;
	}

	public void setAplc_pers_tel_no_1(String aplc_pers_tel_no_1){
		this.aplc_pers_tel_no_1 = aplc_pers_tel_no_1;
	}

	public void setAplc_pers_tel_no_2(String aplc_pers_tel_no_2){
		this.aplc_pers_tel_no_2 = aplc_pers_tel_no_2;
	}

	public void setAplc_pers_tel_no_3(String aplc_pers_tel_no_3){
		this.aplc_pers_tel_no_3 = aplc_pers_tel_no_3;
	}

	public void setAplc_pers_ptph_no_1(String aplc_pers_ptph_no_1){
		this.aplc_pers_ptph_no_1 = aplc_pers_ptph_no_1;
	}

	public void setAplc_pers_ptph_no_2(String aplc_pers_ptph_no_2){
		this.aplc_pers_ptph_no_2 = aplc_pers_ptph_no_2;
	}

	public void setAplc_pers_ptph_no_3(String aplc_pers_ptph_no_3){
		this.aplc_pers_ptph_no_3 = aplc_pers_ptph_no_3;
	}

	public void setDlv_zip_1(String dlv_zip_1){
		this.dlv_zip_1 = dlv_zip_1;
	}

	public void setDlv_zip_2(String dlv_zip_2){
		this.dlv_zip_2 = dlv_zip_2;
	}

	public void setDlv_addr(String dlv_addr){
		this.dlv_addr = dlv_addr;
	}

	public void setDlv_dtls_addr(String dlv_dtls_addr){
		this.dlv_dtls_addr = dlv_dtls_addr;
	}

	public void setStmt_issu_req_yn(String stmt_issu_req_yn){
		this.stmt_issu_req_yn = stmt_issu_req_yn;
	}

	public void setSell_clsf(String sell_clsf){
		this.sell_clsf = sell_clsf;
	}

	public void setRcpm_pers(String rcpm_pers){
		this.rcpm_pers = rcpm_pers;
	}

	public void setSetl_acct_no(String setl_acct_no){
		this.setl_acct_no = setl_acct_no;
	}

	public void setAmt(String amt){
		this.amt = amt;
	}

	public void setAcpn_chrg_pers_nm(String acpn_chrg_pers_nm){
		this.acpn_chrg_pers_nm = acpn_chrg_pers_nm;
	}

	public void setAcpn_chrg_pers_cntc_plac(String acpn_chrg_pers_cntc_plac){
		this.acpn_chrg_pers_cntc_plac = acpn_chrg_pers_cntc_plac;
	}

	public void setAcpn_chrg_pers_dept_nm(String acpn_chrg_pers_dept_nm){
		this.acpn_chrg_pers_dept_nm = acpn_chrg_pers_dept_nm;
	}

	public void setCnfm_stat_clsf(String cnfm_stat_clsf){
		this.cnfm_stat_clsf = cnfm_stat_clsf;
	}

	public void setCnfm_msg(String cnfm_msg){
		this.cnfm_msg = cnfm_msg;
	}

	public void setCnfm_chrg_flnm(String cnfm_chrg_flnm){
		this.cnfm_chrg_flnm = cnfm_chrg_flnm;
	}

	public void setCnfm_dt(String cnfm_dt){
		this.cnfm_dt = cnfm_dt;
	}

	public void setArvl_clsf(String arvl_clsf){
		this.arvl_clsf = arvl_clsf;
	}

	public void setBo_cd(String bo_cd){
		this.bo_cd = bo_cd;
	}

	public void setSend_plac_nm(String send_plac_nm){
		this.send_plac_nm = send_plac_nm;
	}

	public void setSend_plac_seq(String send_plac_seq){
		this.send_plac_seq = send_plac_seq;
	}

	public void setClos_yn(String clos_yn){
		this.clos_yn = clos_yn;
	}

	public void setIssu_dt(String issu_dt){
		this.issu_dt = issu_dt;
	}

	public String getReg_dt(){
		return this.reg_dt;
	}

	public String getReg_seq(){
		return this.reg_seq;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getQty(){
		return this.qty;
	}

	public String getPrt_rfl_qty(){
		return this.prt_rfl_qty;
	}

	public String getAplc_pers_nm(){
		return this.aplc_pers_nm;
	}

	public String getAplc_pers_tel_no_1(){
		return this.aplc_pers_tel_no_1;
	}

	public String getAplc_pers_tel_no_2(){
		return this.aplc_pers_tel_no_2;
	}

	public String getAplc_pers_tel_no_3(){
		return this.aplc_pers_tel_no_3;
	}

	public String getAplc_pers_ptph_no_1(){
		return this.aplc_pers_ptph_no_1;
	}

	public String getAplc_pers_ptph_no_2(){
		return this.aplc_pers_ptph_no_2;
	}

	public String getAplc_pers_ptph_no_3(){
		return this.aplc_pers_ptph_no_3;
	}

	public String getDlv_zip_1(){
		return this.dlv_zip_1;
	}

	public String getDlv_zip_2(){
		return this.dlv_zip_2;
	}

	public String getDlv_addr(){
		return this.dlv_addr;
	}

	public String getDlv_dtls_addr(){
		return this.dlv_dtls_addr;
	}

	public String getStmt_issu_req_yn(){
		return this.stmt_issu_req_yn;
	}

	public String getSell_clsf(){
		return this.sell_clsf;
	}

	public String getRcpm_pers(){
		return this.rcpm_pers;
	}

	public String getSetl_acct_no(){
		return this.setl_acct_no;
	}

	public String getAmt(){
		return this.amt;
	}

	public String getAcpn_chrg_pers_nm(){
		return this.acpn_chrg_pers_nm;
	}

	public String getAcpn_chrg_pers_cntc_plac(){
		return this.acpn_chrg_pers_cntc_plac;
	}

	public String getAcpn_chrg_pers_dept_nm(){
		return this.acpn_chrg_pers_dept_nm;
	}

	public String getCnfm_stat_clsf(){
		return this.cnfm_stat_clsf;
	}

	public String getCnfm_msg(){
		return this.cnfm_msg;
	}

	public String getCnfm_chrg_flnm(){
		return this.cnfm_chrg_flnm;
	}

	public String getCnfm_dt(){
		return this.cnfm_dt;
	}

	public String getArvl_clsf(){
		return this.arvl_clsf;
	}

	public String getBo_cd(){
		return this.bo_cd;
	}

	public String getSend_plac_nm(){
		return this.send_plac_nm;
	}

	public String getSend_plac_seq(){
		return this.send_plac_seq;
	}

	public String getClos_yn(){
		return this.clos_yn;
	}

	public String getIssu_dt(){
		return this.issu_dt;
	}
}

/* 작성시간 : Thu Mar 05 15:30:44 KST 2009 */
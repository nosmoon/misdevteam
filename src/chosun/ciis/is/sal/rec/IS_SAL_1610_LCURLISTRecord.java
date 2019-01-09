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


package chosun.ciis.is.sal.rec;

import java.sql.*;
import chosun.ciis.is.sal.dm.*;
import chosun.ciis.is.sal.ds.*;

/**
 * 
 */


public class IS_SAL_1610_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String purc_adjm_reg_dt;
	public String purc_adjm_reg_seq;
	public String slip_clsf_cd;
	public String slip_occr_dt;
	public String slip_seq;
	public String asnt_dstc_cd;
	public String asnt_dstc_cd_nm;
	public String dlco_clsf_cd_seq;
	public String dlco_nm;
	public String adjm_dt;
	public String pay_plan_dd_pers;
	public String txn_clsf;
	public String suply_amt;
	public String vat_amt;
	public String dduc_amt;
	public String comp_amt;
	public String prom_amt;
	public String gds_vol_amt;
	public String etc_amt;
	public String stot_amt;
	public String clos_yn;
	public String actu_slip_no;
	public String setl_bank_nm;
	public String acct_no;
	public String rcpm_main_nm;
	public String ern;
	public String sup_ern;
	public String chg_pers;

	public IS_SAL_1610_LCURLISTRecord(){}

	public void setPurc_adjm_reg_dt(String purc_adjm_reg_dt){
		this.purc_adjm_reg_dt = purc_adjm_reg_dt;
	}

	public void setPurc_adjm_reg_seq(String purc_adjm_reg_seq){
		this.purc_adjm_reg_seq = purc_adjm_reg_seq;
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

	public void setAsnt_dstc_cd(String asnt_dstc_cd){
		this.asnt_dstc_cd = asnt_dstc_cd;
	}

	public void setAsnt_dstc_cd_nm(String asnt_dstc_cd_nm){
		this.asnt_dstc_cd_nm = asnt_dstc_cd_nm;
	}

	public void setDlco_clsf_cd_seq(String dlco_clsf_cd_seq){
		this.dlco_clsf_cd_seq = dlco_clsf_cd_seq;
	}

	public void setDlco_nm(String dlco_nm){
		this.dlco_nm = dlco_nm;
	}

	public void setAdjm_dt(String adjm_dt){
		this.adjm_dt = adjm_dt;
	}

	public void setPay_plan_dd_pers(String pay_plan_dd_pers){
		this.pay_plan_dd_pers = pay_plan_dd_pers;
	}

	public void setTxn_clsf(String txn_clsf){
		this.txn_clsf = txn_clsf;
	}

	public void setSuply_amt(String suply_amt){
		this.suply_amt = suply_amt;
	}

	public void setVat_amt(String vat_amt){
		this.vat_amt = vat_amt;
	}

	public void setDduc_amt(String dduc_amt){
		this.dduc_amt = dduc_amt;
	}

	public void setComp_amt(String comp_amt){
		this.comp_amt = comp_amt;
	}

	public void setProm_amt(String prom_amt){
		this.prom_amt = prom_amt;
	}

	public void setGds_vol_amt(String gds_vol_amt){
		this.gds_vol_amt = gds_vol_amt;
	}

	public void setEtc_amt(String etc_amt){
		this.etc_amt = etc_amt;
	}

	public void setStot_amt(String stot_amt){
		this.stot_amt = stot_amt;
	}

	public void setClos_yn(String clos_yn){
		this.clos_yn = clos_yn;
	}

	public void setActu_slip_no(String actu_slip_no){
		this.actu_slip_no = actu_slip_no;
	}

	public void setSetl_bank_nm(String setl_bank_nm){
		this.setl_bank_nm = setl_bank_nm;
	}

	public void setAcct_no(String acct_no){
		this.acct_no = acct_no;
	}

	public void setRcpm_main_nm(String rcpm_main_nm){
		this.rcpm_main_nm = rcpm_main_nm;
	}

	public void setErn(String ern){
		this.ern = ern;
	}

	public void setSup_ern(String sup_ern){
		this.sup_ern = sup_ern;
	}

	public void setChg_pers(String chg_pers){
		this.chg_pers = chg_pers;
	}

	public String getPurc_adjm_reg_dt(){
		return this.purc_adjm_reg_dt;
	}

	public String getPurc_adjm_reg_seq(){
		return this.purc_adjm_reg_seq;
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

	public String getAsnt_dstc_cd(){
		return this.asnt_dstc_cd;
	}

	public String getAsnt_dstc_cd_nm(){
		return this.asnt_dstc_cd_nm;
	}

	public String getDlco_clsf_cd_seq(){
		return this.dlco_clsf_cd_seq;
	}

	public String getDlco_nm(){
		return this.dlco_nm;
	}

	public String getAdjm_dt(){
		return this.adjm_dt;
	}

	public String getPay_plan_dd_pers(){
		return this.pay_plan_dd_pers;
	}

	public String getTxn_clsf(){
		return this.txn_clsf;
	}

	public String getSuply_amt(){
		return this.suply_amt;
	}

	public String getVat_amt(){
		return this.vat_amt;
	}

	public String getDduc_amt(){
		return this.dduc_amt;
	}

	public String getComp_amt(){
		return this.comp_amt;
	}

	public String getProm_amt(){
		return this.prom_amt;
	}

	public String getGds_vol_amt(){
		return this.gds_vol_amt;
	}

	public String getEtc_amt(){
		return this.etc_amt;
	}

	public String getStot_amt(){
		return this.stot_amt;
	}

	public String getClos_yn(){
		return this.clos_yn;
	}

	public String getActu_slip_no(){
		return this.actu_slip_no;
	}

	public String getSetl_bank_nm(){
		return this.setl_bank_nm;
	}

	public String getAcct_no(){
		return this.acct_no;
	}

	public String getRcpm_main_nm(){
		return this.rcpm_main_nm;
	}

	public String getErn(){
		return this.ern;
	}

	public String getSup_ern(){
		return this.sup_ern;
	}

	public String getChg_pers(){
		return this.chg_pers;
	}
}

/* 작성시간 : Mon May 21 13:56:28 KST 2012 */
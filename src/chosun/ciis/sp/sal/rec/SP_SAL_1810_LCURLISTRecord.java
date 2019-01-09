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


public class SP_SAL_1810_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String rdr_extn_yymm;
	public String seq;
	public String staf_no;
	public String staf_nm;
	public String ptph_no;
	public String acty_area;
	public String prn;
	public String a_hous_rdr_extn_qty;
	public String a_apt_rdr_extn_qty;
	public String a_shop_rdr_extn_qty;
	public String a_hous_ufth_qty;
	public String a_apt_ufth_qty;
	public String a_shop_ufth_qty;
	public String a_hous_fix_qty;
	public String a_apt_fix_qty;
	public String a_shop_fix_qty;
	public String b_hous_rdr_extn_qty;
	public String b_apt_rdr_extn_qty;
	public String b_shop_rdr_extn_qty;
	public String b_hous_ufth_qty;
	public String b_apt_ufth_qty;
	public String b_shop_ufth_qty;
	public String b_hous_fix_qty;
	public String b_apt_fix_qty;
	public String b_shop_fix_qty;
	public String a_tot;
	public String rdr_extn_alon;
	public String leader_alon;
	public String jungbuhonam_spc_acty_cost;
	public String mvin_team_spc_acty_cost;
	public String no_val_shrt_fee;
	public String rdr_extn_sctn_clsi_fee;
	public String etc_alon_1;
	public String etc_alon_2;
	public String etc_alon_3;
	public String pre_pay_dduc;
	public String tax_amt_dduc;
	public String res_tax_dduc;
	public String etc_dduc_1;
	public String etc_dduc_2;
	public String etc_dduc_3;
	public String stot_amt;
	public String real_pay_amt;
	public String wclam_subm_yn;
	public String clos_yn;
	public String dlco_clsf_cd;
	public String dlco_cd;
	public String dlco_nm;
	public String setl_bank_nm;
	public String rcpm_main_nm;
	public String acct_no;
	public String pay_plan_dt;
	public String actu_slip_no;
	public String remk;

	public SP_SAL_1810_LCURLISTRecord(){}

	public void setRdr_extn_yymm(String rdr_extn_yymm){
		this.rdr_extn_yymm = rdr_extn_yymm;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setStaf_no(String staf_no){
		this.staf_no = staf_no;
	}

	public void setStaf_nm(String staf_nm){
		this.staf_nm = staf_nm;
	}

	public void setPtph_no(String ptph_no){
		this.ptph_no = ptph_no;
	}

	public void setActy_area(String acty_area){
		this.acty_area = acty_area;
	}

	public void setPrn(String prn){
		this.prn = prn;
	}

	public void setA_hous_rdr_extn_qty(String a_hous_rdr_extn_qty){
		this.a_hous_rdr_extn_qty = a_hous_rdr_extn_qty;
	}

	public void setA_apt_rdr_extn_qty(String a_apt_rdr_extn_qty){
		this.a_apt_rdr_extn_qty = a_apt_rdr_extn_qty;
	}

	public void setA_shop_rdr_extn_qty(String a_shop_rdr_extn_qty){
		this.a_shop_rdr_extn_qty = a_shop_rdr_extn_qty;
	}

	public void setA_hous_ufth_qty(String a_hous_ufth_qty){
		this.a_hous_ufth_qty = a_hous_ufth_qty;
	}

	public void setA_apt_ufth_qty(String a_apt_ufth_qty){
		this.a_apt_ufth_qty = a_apt_ufth_qty;
	}

	public void setA_shop_ufth_qty(String a_shop_ufth_qty){
		this.a_shop_ufth_qty = a_shop_ufth_qty;
	}

	public void setA_hous_fix_qty(String a_hous_fix_qty){
		this.a_hous_fix_qty = a_hous_fix_qty;
	}

	public void setA_apt_fix_qty(String a_apt_fix_qty){
		this.a_apt_fix_qty = a_apt_fix_qty;
	}

	public void setA_shop_fix_qty(String a_shop_fix_qty){
		this.a_shop_fix_qty = a_shop_fix_qty;
	}

	public void setB_hous_rdr_extn_qty(String b_hous_rdr_extn_qty){
		this.b_hous_rdr_extn_qty = b_hous_rdr_extn_qty;
	}

	public void setB_apt_rdr_extn_qty(String b_apt_rdr_extn_qty){
		this.b_apt_rdr_extn_qty = b_apt_rdr_extn_qty;
	}

	public void setB_shop_rdr_extn_qty(String b_shop_rdr_extn_qty){
		this.b_shop_rdr_extn_qty = b_shop_rdr_extn_qty;
	}

	public void setB_hous_ufth_qty(String b_hous_ufth_qty){
		this.b_hous_ufth_qty = b_hous_ufth_qty;
	}

	public void setB_apt_ufth_qty(String b_apt_ufth_qty){
		this.b_apt_ufth_qty = b_apt_ufth_qty;
	}

	public void setB_shop_ufth_qty(String b_shop_ufth_qty){
		this.b_shop_ufth_qty = b_shop_ufth_qty;
	}

	public void setB_hous_fix_qty(String b_hous_fix_qty){
		this.b_hous_fix_qty = b_hous_fix_qty;
	}

	public void setB_apt_fix_qty(String b_apt_fix_qty){
		this.b_apt_fix_qty = b_apt_fix_qty;
	}

	public void setB_shop_fix_qty(String b_shop_fix_qty){
		this.b_shop_fix_qty = b_shop_fix_qty;
	}

	public void setA_tot(String a_tot){
		this.a_tot = a_tot;
	}

	public void setRdr_extn_alon(String rdr_extn_alon){
		this.rdr_extn_alon = rdr_extn_alon;
	}

	public void setLeader_alon(String leader_alon){
		this.leader_alon = leader_alon;
	}

	public void setJungbuhonam_spc_acty_cost(String jungbuhonam_spc_acty_cost){
		this.jungbuhonam_spc_acty_cost = jungbuhonam_spc_acty_cost;
	}

	public void setMvin_team_spc_acty_cost(String mvin_team_spc_acty_cost){
		this.mvin_team_spc_acty_cost = mvin_team_spc_acty_cost;
	}

	public void setNo_val_shrt_fee(String no_val_shrt_fee){
		this.no_val_shrt_fee = no_val_shrt_fee;
	}

	public void setRdr_extn_sctn_clsi_fee(String rdr_extn_sctn_clsi_fee){
		this.rdr_extn_sctn_clsi_fee = rdr_extn_sctn_clsi_fee;
	}

	public void setEtc_alon_1(String etc_alon_1){
		this.etc_alon_1 = etc_alon_1;
	}

	public void setEtc_alon_2(String etc_alon_2){
		this.etc_alon_2 = etc_alon_2;
	}

	public void setEtc_alon_3(String etc_alon_3){
		this.etc_alon_3 = etc_alon_3;
	}

	public void setPre_pay_dduc(String pre_pay_dduc){
		this.pre_pay_dduc = pre_pay_dduc;
	}

	public void setTax_amt_dduc(String tax_amt_dduc){
		this.tax_amt_dduc = tax_amt_dduc;
	}

	public void setRes_tax_dduc(String res_tax_dduc){
		this.res_tax_dduc = res_tax_dduc;
	}

	public void setEtc_dduc_1(String etc_dduc_1){
		this.etc_dduc_1 = etc_dduc_1;
	}

	public void setEtc_dduc_2(String etc_dduc_2){
		this.etc_dduc_2 = etc_dduc_2;
	}

	public void setEtc_dduc_3(String etc_dduc_3){
		this.etc_dduc_3 = etc_dduc_3;
	}

	public void setStot_amt(String stot_amt){
		this.stot_amt = stot_amt;
	}

	public void setReal_pay_amt(String real_pay_amt){
		this.real_pay_amt = real_pay_amt;
	}

	public void setWclam_subm_yn(String wclam_subm_yn){
		this.wclam_subm_yn = wclam_subm_yn;
	}

	public void setClos_yn(String clos_yn){
		this.clos_yn = clos_yn;
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

	public void setSetl_bank_nm(String setl_bank_nm){
		this.setl_bank_nm = setl_bank_nm;
	}

	public void setRcpm_main_nm(String rcpm_main_nm){
		this.rcpm_main_nm = rcpm_main_nm;
	}

	public void setAcct_no(String acct_no){
		this.acct_no = acct_no;
	}

	public void setPay_plan_dt(String pay_plan_dt){
		this.pay_plan_dt = pay_plan_dt;
	}

	public void setActu_slip_no(String actu_slip_no){
		this.actu_slip_no = actu_slip_no;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public String getRdr_extn_yymm(){
		return this.rdr_extn_yymm;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getStaf_no(){
		return this.staf_no;
	}

	public String getStaf_nm(){
		return this.staf_nm;
	}

	public String getPtph_no(){
		return this.ptph_no;
	}

	public String getActy_area(){
		return this.acty_area;
	}

	public String getPrn(){
		return this.prn;
	}

	public String getA_hous_rdr_extn_qty(){
		return this.a_hous_rdr_extn_qty;
	}

	public String getA_apt_rdr_extn_qty(){
		return this.a_apt_rdr_extn_qty;
	}

	public String getA_shop_rdr_extn_qty(){
		return this.a_shop_rdr_extn_qty;
	}

	public String getA_hous_ufth_qty(){
		return this.a_hous_ufth_qty;
	}

	public String getA_apt_ufth_qty(){
		return this.a_apt_ufth_qty;
	}

	public String getA_shop_ufth_qty(){
		return this.a_shop_ufth_qty;
	}

	public String getA_hous_fix_qty(){
		return this.a_hous_fix_qty;
	}

	public String getA_apt_fix_qty(){
		return this.a_apt_fix_qty;
	}

	public String getA_shop_fix_qty(){
		return this.a_shop_fix_qty;
	}

	public String getB_hous_rdr_extn_qty(){
		return this.b_hous_rdr_extn_qty;
	}

	public String getB_apt_rdr_extn_qty(){
		return this.b_apt_rdr_extn_qty;
	}

	public String getB_shop_rdr_extn_qty(){
		return this.b_shop_rdr_extn_qty;
	}

	public String getB_hous_ufth_qty(){
		return this.b_hous_ufth_qty;
	}

	public String getB_apt_ufth_qty(){
		return this.b_apt_ufth_qty;
	}

	public String getB_shop_ufth_qty(){
		return this.b_shop_ufth_qty;
	}

	public String getB_hous_fix_qty(){
		return this.b_hous_fix_qty;
	}

	public String getB_apt_fix_qty(){
		return this.b_apt_fix_qty;
	}

	public String getB_shop_fix_qty(){
		return this.b_shop_fix_qty;
	}

	public String getA_tot(){
		return this.a_tot;
	}

	public String getRdr_extn_alon(){
		return this.rdr_extn_alon;
	}

	public String getLeader_alon(){
		return this.leader_alon;
	}

	public String getJungbuhonam_spc_acty_cost(){
		return this.jungbuhonam_spc_acty_cost;
	}

	public String getMvin_team_spc_acty_cost(){
		return this.mvin_team_spc_acty_cost;
	}

	public String getNo_val_shrt_fee(){
		return this.no_val_shrt_fee;
	}

	public String getRdr_extn_sctn_clsi_fee(){
		return this.rdr_extn_sctn_clsi_fee;
	}

	public String getEtc_alon_1(){
		return this.etc_alon_1;
	}

	public String getEtc_alon_2(){
		return this.etc_alon_2;
	}

	public String getEtc_alon_3(){
		return this.etc_alon_3;
	}

	public String getPre_pay_dduc(){
		return this.pre_pay_dduc;
	}

	public String getTax_amt_dduc(){
		return this.tax_amt_dduc;
	}

	public String getRes_tax_dduc(){
		return this.res_tax_dduc;
	}

	public String getEtc_dduc_1(){
		return this.etc_dduc_1;
	}

	public String getEtc_dduc_2(){
		return this.etc_dduc_2;
	}

	public String getEtc_dduc_3(){
		return this.etc_dduc_3;
	}

	public String getStot_amt(){
		return this.stot_amt;
	}

	public String getReal_pay_amt(){
		return this.real_pay_amt;
	}

	public String getWclam_subm_yn(){
		return this.wclam_subm_yn;
	}

	public String getClos_yn(){
		return this.clos_yn;
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

	public String getSetl_bank_nm(){
		return this.setl_bank_nm;
	}

	public String getRcpm_main_nm(){
		return this.rcpm_main_nm;
	}

	public String getAcct_no(){
		return this.acct_no;
	}

	public String getPay_plan_dt(){
		return this.pay_plan_dt;
	}

	public String getActu_slip_no(){
		return this.actu_slip_no;
	}

	public String getRemk(){
		return this.remk;
	}
}

/* 작성시간 : Mon Jul 30 17:07:31 KST 2012 */
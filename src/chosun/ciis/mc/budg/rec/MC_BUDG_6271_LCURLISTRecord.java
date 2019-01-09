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


package chosun.ciis.mc.budg.rec;

import java.sql.*;
import chosun.ciis.mc.budg.dm.*;
import chosun.ciis.mc.budg.ds.*;

/**
 * 
 */


public class MC_BUDG_6271_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String budg_clas_cd;
	public String prt_clsf_cd;
	public String gf_commcdnm_prt_clsf_cd;
	public String budg_type_cd;
	public String budg_cdnm;
	public String budg_abrv_nm;
	public String clas_cd1;
	public String yf_brnm_budg_clas_cd1;
	public String clas_cd2;
	public String yf_budg_clas_cd2;
	public String clas_cd3;
	public String yf_budg_clas_cd3;
	public String clas_cd4;
	public String yf_budg_clas_cd4;
	public String cyov_yn;
	public String lesd_yn;
	public String advc_cndt_yn;
	public String limt_chk_yn;
	public String posbfee_yn;
	public String fixfee_yn;
	public String medi_dstb_cd;
	public String gf_commcdnm_medi_dstb_cd;
	public String whco_ndstb_cd;
	public String gf_commcdnm_ycjsbbcd;
	public String whco_comn_cost_yn;
	public String via_dept_cd;
	public String if_buseonm_dept_cd;
	public String dstb_acct_cd;
	public String drcr_bal_clsf;
	public String use_bgn_dt;
	public String use_end_dt;
	public String use_yn;
	public String dlco_clsf;
	public String ycentdate;

	public MC_BUDG_6271_LCURLISTRecord(){}

	public void setBudg_clas_cd(String budg_clas_cd){
		this.budg_clas_cd = budg_clas_cd;
	}

	public void setPrt_clsf_cd(String prt_clsf_cd){
		this.prt_clsf_cd = prt_clsf_cd;
	}

	public void setGf_commcdnm_prt_clsf_cd(String gf_commcdnm_prt_clsf_cd){
		this.gf_commcdnm_prt_clsf_cd = gf_commcdnm_prt_clsf_cd;
	}

	public void setBudg_type_cd(String budg_type_cd){
		this.budg_type_cd = budg_type_cd;
	}

	public void setBudg_cdnm(String budg_cdnm){
		this.budg_cdnm = budg_cdnm;
	}

	public void setBudg_abrv_nm(String budg_abrv_nm){
		this.budg_abrv_nm = budg_abrv_nm;
	}

	public void setClas_cd1(String clas_cd1){
		this.clas_cd1 = clas_cd1;
	}

	public void setYf_brnm_budg_clas_cd1(String yf_brnm_budg_clas_cd1){
		this.yf_brnm_budg_clas_cd1 = yf_brnm_budg_clas_cd1;
	}

	public void setClas_cd2(String clas_cd2){
		this.clas_cd2 = clas_cd2;
	}

	public void setYf_budg_clas_cd2(String yf_budg_clas_cd2){
		this.yf_budg_clas_cd2 = yf_budg_clas_cd2;
	}

	public void setClas_cd3(String clas_cd3){
		this.clas_cd3 = clas_cd3;
	}

	public void setYf_budg_clas_cd3(String yf_budg_clas_cd3){
		this.yf_budg_clas_cd3 = yf_budg_clas_cd3;
	}

	public void setClas_cd4(String clas_cd4){
		this.clas_cd4 = clas_cd4;
	}

	public void setYf_budg_clas_cd4(String yf_budg_clas_cd4){
		this.yf_budg_clas_cd4 = yf_budg_clas_cd4;
	}

	public void setCyov_yn(String cyov_yn){
		this.cyov_yn = cyov_yn;
	}

	public void setLesd_yn(String lesd_yn){
		this.lesd_yn = lesd_yn;
	}

	public void setAdvc_cndt_yn(String advc_cndt_yn){
		this.advc_cndt_yn = advc_cndt_yn;
	}

	public void setLimt_chk_yn(String limt_chk_yn){
		this.limt_chk_yn = limt_chk_yn;
	}

	public void setPosbfee_yn(String posbfee_yn){
		this.posbfee_yn = posbfee_yn;
	}

	public void setFixfee_yn(String fixfee_yn){
		this.fixfee_yn = fixfee_yn;
	}

	public void setMedi_dstb_cd(String medi_dstb_cd){
		this.medi_dstb_cd = medi_dstb_cd;
	}

	public void setGf_commcdnm_medi_dstb_cd(String gf_commcdnm_medi_dstb_cd){
		this.gf_commcdnm_medi_dstb_cd = gf_commcdnm_medi_dstb_cd;
	}

	public void setWhco_ndstb_cd(String whco_ndstb_cd){
		this.whco_ndstb_cd = whco_ndstb_cd;
	}

	public void setGf_commcdnm_ycjsbbcd(String gf_commcdnm_ycjsbbcd){
		this.gf_commcdnm_ycjsbbcd = gf_commcdnm_ycjsbbcd;
	}

	public void setWhco_comn_cost_yn(String whco_comn_cost_yn){
		this.whco_comn_cost_yn = whco_comn_cost_yn;
	}

	public void setVia_dept_cd(String via_dept_cd){
		this.via_dept_cd = via_dept_cd;
	}

	public void setIf_buseonm_dept_cd(String if_buseonm_dept_cd){
		this.if_buseonm_dept_cd = if_buseonm_dept_cd;
	}

	public void setDstb_acct_cd(String dstb_acct_cd){
		this.dstb_acct_cd = dstb_acct_cd;
	}

	public void setDrcr_bal_clsf(String drcr_bal_clsf){
		this.drcr_bal_clsf = drcr_bal_clsf;
	}

	public void setUse_bgn_dt(String use_bgn_dt){
		this.use_bgn_dt = use_bgn_dt;
	}

	public void setUse_end_dt(String use_end_dt){
		this.use_end_dt = use_end_dt;
	}

	public void setUse_yn(String use_yn){
		this.use_yn = use_yn;
	}

	public void setDlco_clsf(String dlco_clsf){
		this.dlco_clsf = dlco_clsf;
	}

	public void setYcentdate(String ycentdate){
		this.ycentdate = ycentdate;
	}

	public String getBudg_clas_cd(){
		return this.budg_clas_cd;
	}

	public String getPrt_clsf_cd(){
		return this.prt_clsf_cd;
	}

	public String getGf_commcdnm_prt_clsf_cd(){
		return this.gf_commcdnm_prt_clsf_cd;
	}

	public String getBudg_type_cd(){
		return this.budg_type_cd;
	}

	public String getBudg_cdnm(){
		return this.budg_cdnm;
	}

	public String getBudg_abrv_nm(){
		return this.budg_abrv_nm;
	}

	public String getClas_cd1(){
		return this.clas_cd1;
	}

	public String getYf_brnm_budg_clas_cd1(){
		return this.yf_brnm_budg_clas_cd1;
	}

	public String getClas_cd2(){
		return this.clas_cd2;
	}

	public String getYf_budg_clas_cd2(){
		return this.yf_budg_clas_cd2;
	}

	public String getClas_cd3(){
		return this.clas_cd3;
	}

	public String getYf_budg_clas_cd3(){
		return this.yf_budg_clas_cd3;
	}

	public String getClas_cd4(){
		return this.clas_cd4;
	}

	public String getYf_budg_clas_cd4(){
		return this.yf_budg_clas_cd4;
	}

	public String getCyov_yn(){
		return this.cyov_yn;
	}

	public String getLesd_yn(){
		return this.lesd_yn;
	}

	public String getAdvc_cndt_yn(){
		return this.advc_cndt_yn;
	}

	public String getLimt_chk_yn(){
		return this.limt_chk_yn;
	}

	public String getPosbfee_yn(){
		return this.posbfee_yn;
	}

	public String getFixfee_yn(){
		return this.fixfee_yn;
	}

	public String getMedi_dstb_cd(){
		return this.medi_dstb_cd;
	}

	public String getGf_commcdnm_medi_dstb_cd(){
		return this.gf_commcdnm_medi_dstb_cd;
	}

	public String getWhco_ndstb_cd(){
		return this.whco_ndstb_cd;
	}

	public String getGf_commcdnm_ycjsbbcd(){
		return this.gf_commcdnm_ycjsbbcd;
	}

	public String getWhco_comn_cost_yn(){
		return this.whco_comn_cost_yn;
	}

	public String getVia_dept_cd(){
		return this.via_dept_cd;
	}

	public String getIf_buseonm_dept_cd(){
		return this.if_buseonm_dept_cd;
	}

	public String getDstb_acct_cd(){
		return this.dstb_acct_cd;
	}

	public String getDrcr_bal_clsf(){
		return this.drcr_bal_clsf;
	}

	public String getUse_bgn_dt(){
		return this.use_bgn_dt;
	}

	public String getUse_end_dt(){
		return this.use_end_dt;
	}

	public String getUse_yn(){
		return this.use_yn;
	}

	public String getDlco_clsf(){
		return this.dlco_clsf;
	}

	public String getYcentdate(){
		return this.ycentdate;
	}
}

/* 작성시간 : Wed May 13 12:09:14 KST 2009 */
/***************************************************************************************************
* 파일명 :
* 기능 :
* 작성일자 : 2015-10-21
* 작성자 : 장 선 희
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/


package chosun.ciis.se.boi.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.se.boi.dm.*;
import chosun.ciis.se.boi.rec.*;

/**
 *
 */


public class SE_BOI_1020_SDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList commcdcur9 = new ArrayList();
	public ArrayList commcdcur8 = new ArrayList();
	public ArrayList commcdcur7 = new ArrayList();
	public ArrayList commcdcur6 = new ArrayList();
	public ArrayList commcdcur10 = new ArrayList();
	public ArrayList commcdcur5 = new ArrayList();
	public ArrayList commcdcur4 = new ArrayList();
	public ArrayList commcdcur3 = new ArrayList();
	public ArrayList commcdcur2 = new ArrayList();
	public ArrayList commcdcur1 = new ArrayList();
	public String errcode;
	public String errmsg;
	public String orgn_clsf;
	public String bo_cd;
	public String bo_seq;
	public String bo_nm;
	public String area_cd;
	public String srt_seq;
	public String div_motr_bo_cd;
	public String div_motr_bo_seq;
	public String div_motr_bo_nm;
	public String ref_bo_cd;
	public String ref_bo_seq;
	public String ref_bo_nm;
	public String chrg_pers;
	public String chrg_pers_nm;
	public String bo_cntr_dt;
	public String bo_expy_dt;
	public String bo_spcf_clsf;
	public String cntr_doc_1;
	public String cntr_doc_2;
	public String cntr_stat_clsf;
	public String jont_debtgurt_limt_amt;
	public String chg_dt_tm;
	public String dlco_no;
	public String ern;
	public String incmg_dt_tm;
	public String bo_head_nm;
	public String bo_head_prn;
	public String tel_no_1_0;
	public String tel_no_1_1;
	public String tel_no_1_2;
	public String tel_no_1_3;
	public String tel_no_2_0;
	public String tel_no_2_1;
	public String tel_no_2_2;
	public String tel_no_2_3;
	public String bo_zip_1;
	public String bo_zip_2;
	public String bo_addr;
	public String bo_dtls_addr;
	public String jd_zip_1;
	public String jd_zip_2;
	public String jd_addr;
	public String jd_dtls_addr;
	public String bo_jurs_nwsp_zip_1;
	public String bo_jurs_nwsp_zip_2;
	public String bo_jurs_nwsp_addr;
	public String bo_feat_clsf;
	public String bo_mang_grad_clas;
	public String stmt_crte_clsf;
	public String jd_sell_net_clsf;
	public String qty_sell_net_clsf;
	public String invsg_obj_bo;
	public String jd_clam;
	public String clam_grp;
	public String add_snd_bo_cd;
	public String add_snd_bo_seq;
	public String add_snd_bo_nm;
	public String adms_dstc_cd;
	public String adms_unit_clsf;
	public String sido_gugun_cd;
	public String sido_gugun_nm;
	public String bo_mang_type;
	public String dmang_yn;
	public String bo_resv_reg_dt;
	public String bo_reg_dt;
	public String elec_tax_stmt_yn;
	public String email;
	public String bogurt_clsf;
	public String acct_no;

	public SE_BOI_1020_SDataSet(){}
	public SE_BOI_1020_SDataSet(String errcode, String errmsg, String orgn_clsf, String bo_cd, String bo_seq, String bo_nm, String area_cd, String srt_seq, String div_motr_bo_cd, String div_motr_bo_seq, String div_motr_bo_nm, String ref_bo_cd, String ref_bo_seq, String ref_bo_nm, String chrg_pers, String chrg_pers_nm, String bo_cntr_dt, String bo_expy_dt, String bo_spcf_clsf, String cntr_doc_1, String cntr_doc_2, String cntr_stat_clsf, String jont_debtgurt_limt_amt, String chg_dt_tm, String dlco_no, String ern, String incmg_dt_tm, String bo_head_nm, String bo_head_prn, String tel_no_1_0, String tel_no_1_1, String tel_no_1_2, String tel_no_1_3, String tel_no_2_0, String tel_no_2_1, String tel_no_2_2, String tel_no_2_3, String bo_zip_1, String bo_zip_2, String bo_addr, String bo_dtls_addr, String jd_zip_1, String jd_zip_2, String jd_addr, String jd_dtls_addr, String bo_jurs_nwsp_zip_1, String bo_jurs_nwsp_zip_2, String bo_jurs_nwsp_addr, String bo_feat_clsf, String bo_mang_grad_clas, String stmt_crte_clsf, String jd_sell_net_clsf, String qty_sell_net_clsf, String invsg_obj_bo, String jd_clam, String clam_grp, String add_snd_bo_cd, String add_snd_bo_seq, String add_snd_bo_nm, String adms_dstc_cd, String adms_unit_clsf, String sido_gugun_cd, String sido_gugun_nm, String bo_mang_type, String dmang_yn, String bo_resv_reg_dt, String bo_reg_dt, String elec_tax_stmt_yn, String email, String bogurt_clsf, String acct_no){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.orgn_clsf = orgn_clsf;
		this.bo_cd = bo_cd;
		this.bo_seq = bo_seq;
		this.bo_nm = bo_nm;
		this.area_cd = area_cd;
		this.srt_seq = srt_seq;
		this.div_motr_bo_cd = div_motr_bo_cd;
		this.div_motr_bo_seq = div_motr_bo_seq;
		this.div_motr_bo_nm = div_motr_bo_nm;
		this.ref_bo_cd = ref_bo_cd;
		this.ref_bo_seq = ref_bo_seq;
		this.ref_bo_nm = ref_bo_nm;
		this.chrg_pers = chrg_pers;
		this.chrg_pers_nm = chrg_pers_nm;
		this.bo_cntr_dt = bo_cntr_dt;
		this.bo_expy_dt = bo_expy_dt;
		this.bo_spcf_clsf = bo_spcf_clsf;
		this.cntr_doc_1 = cntr_doc_1;
		this.cntr_doc_2 = cntr_doc_2;
		this.cntr_stat_clsf = cntr_stat_clsf;
		this.jont_debtgurt_limt_amt = jont_debtgurt_limt_amt;
		this.chg_dt_tm = chg_dt_tm;
		this.dlco_no = dlco_no;
		this.ern = ern;
		this.incmg_dt_tm = incmg_dt_tm;
		this.bo_head_nm = bo_head_nm;
		this.bo_head_prn = bo_head_prn;
		this.tel_no_1_0 = tel_no_1_0;
		this.tel_no_1_1 = tel_no_1_1;
		this.tel_no_1_2 = tel_no_1_2;
		this.tel_no_1_3 = tel_no_1_3;
		this.tel_no_2_0 = tel_no_2_0;
		this.tel_no_2_1 = tel_no_2_1;
		this.tel_no_2_2 = tel_no_2_2;
		this.tel_no_2_3 = tel_no_2_3;
		this.bo_zip_1 = bo_zip_1;
		this.bo_zip_2 = bo_zip_2;
		this.bo_addr = bo_addr;
		this.bo_dtls_addr = bo_dtls_addr;
		this.jd_zip_1 = jd_zip_1;
		this.jd_zip_2 = jd_zip_2;
		this.jd_addr = jd_addr;
		this.jd_dtls_addr = jd_dtls_addr;
		this.bo_jurs_nwsp_zip_1 = bo_jurs_nwsp_zip_1;
		this.bo_jurs_nwsp_zip_2 = bo_jurs_nwsp_zip_2;
		this.bo_jurs_nwsp_addr = bo_jurs_nwsp_addr;
		this.bo_feat_clsf = bo_feat_clsf;
		this.bo_mang_grad_clas = bo_mang_grad_clas;
		this.stmt_crte_clsf = stmt_crte_clsf;
		this.jd_sell_net_clsf = jd_sell_net_clsf;
		this.qty_sell_net_clsf = qty_sell_net_clsf;
		this.invsg_obj_bo = invsg_obj_bo;
		this.jd_clam = jd_clam;
		this.clam_grp = clam_grp;
		this.add_snd_bo_cd = add_snd_bo_cd;
		this.add_snd_bo_seq = add_snd_bo_seq;
		this.add_snd_bo_nm = add_snd_bo_nm;
		this.adms_dstc_cd = adms_dstc_cd;
		this.adms_unit_clsf = adms_unit_clsf;
		this.sido_gugun_cd = sido_gugun_cd;
		this.sido_gugun_nm = sido_gugun_nm;
		this.bo_mang_type = bo_mang_type;
		this.dmang_yn = dmang_yn;
		this.bo_resv_reg_dt = bo_resv_reg_dt;
		this.bo_reg_dt = bo_reg_dt;
		this.elec_tax_stmt_yn = elec_tax_stmt_yn;
		this.email = email;
		this.bogurt_clsf = bogurt_clsf;
		this.acct_no = acct_no;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setOrgn_clsf(String orgn_clsf){
		this.orgn_clsf = orgn_clsf;
	}

	public void setBo_cd(String bo_cd){
		this.bo_cd = bo_cd;
	}

	public void setBo_seq(String bo_seq){
		this.bo_seq = bo_seq;
	}

	public void setBo_nm(String bo_nm){
		this.bo_nm = bo_nm;
	}

	public void setArea_cd(String area_cd){
		this.area_cd = area_cd;
	}

	public void setSrt_seq(String srt_seq){
		this.srt_seq = srt_seq;
	}

	public void setDiv_motr_bo_cd(String div_motr_bo_cd){
		this.div_motr_bo_cd = div_motr_bo_cd;
	}

	public void setDiv_motr_bo_seq(String div_motr_bo_seq){
		this.div_motr_bo_seq = div_motr_bo_seq;
	}

	public void setDiv_motr_bo_nm(String div_motr_bo_nm){
		this.div_motr_bo_nm = div_motr_bo_nm;
	}

	public void setRef_bo_cd(String ref_bo_cd){
		this.ref_bo_cd = ref_bo_cd;
	}

	public void setRef_bo_seq(String ref_bo_seq){
		this.ref_bo_seq = ref_bo_seq;
	}

	public void setRef_bo_nm(String ref_bo_nm){
		this.ref_bo_nm = ref_bo_nm;
	}

	public void setChrg_pers(String chrg_pers){
		this.chrg_pers = chrg_pers;
	}

	public void setChrg_pers_nm(String chrg_pers_nm){
		this.chrg_pers_nm = chrg_pers_nm;
	}

	public void setBo_cntr_dt(String bo_cntr_dt){
		this.bo_cntr_dt = bo_cntr_dt;
	}

	public void setBo_expy_dt(String bo_expy_dt){
		this.bo_expy_dt = bo_expy_dt;
	}

	public void setBo_spcf_clsf(String bo_spcf_clsf){
		this.bo_spcf_clsf = bo_spcf_clsf;
	}

	public void setCntr_doc_1(String cntr_doc_1){
		this.cntr_doc_1 = cntr_doc_1;
	}

	public void setCntr_doc_2(String cntr_doc_2){
		this.cntr_doc_2 = cntr_doc_2;
	}

	public void setCntr_stat_clsf(String cntr_stat_clsf){
		this.cntr_stat_clsf = cntr_stat_clsf;
	}

	public void setJont_debtgurt_limt_amt(String jont_debtgurt_limt_amt){
		this.jont_debtgurt_limt_amt = jont_debtgurt_limt_amt;
	}

	public void setChg_dt_tm(String chg_dt_tm){
		this.chg_dt_tm = chg_dt_tm;
	}

	public void setDlco_no(String dlco_no){
		this.dlco_no = dlco_no;
	}

	public void setErn(String ern){
		this.ern = ern;
	}

	public void setIncmg_dt_tm(String incmg_dt_tm){
		this.incmg_dt_tm = incmg_dt_tm;
	}

	public void setBo_head_nm(String bo_head_nm){
		this.bo_head_nm = bo_head_nm;
	}

	public void setBo_head_prn(String bo_head_prn){
		this.bo_head_prn = bo_head_prn;
	}

	public void setTel_no_1_0(String tel_no_1_0){
		this.tel_no_1_0 = tel_no_1_0;
	}

	public void setTel_no_1_1(String tel_no_1_1){
		this.tel_no_1_1 = tel_no_1_1;
	}

	public void setTel_no_1_2(String tel_no_1_2){
		this.tel_no_1_2 = tel_no_1_2;
	}

	public void setTel_no_1_3(String tel_no_1_3){
		this.tel_no_1_3 = tel_no_1_3;
	}

	public void setTel_no_2_0(String tel_no_2_0){
		this.tel_no_2_0 = tel_no_2_0;
	}

	public void setTel_no_2_1(String tel_no_2_1){
		this.tel_no_2_1 = tel_no_2_1;
	}

	public void setTel_no_2_2(String tel_no_2_2){
		this.tel_no_2_2 = tel_no_2_2;
	}

	public void setTel_no_2_3(String tel_no_2_3){
		this.tel_no_2_3 = tel_no_2_3;
	}

	public void setBo_zip_1(String bo_zip_1){
		this.bo_zip_1 = bo_zip_1;
	}

	public void setBo_zip_2(String bo_zip_2){
		this.bo_zip_2 = bo_zip_2;
	}

	public void setBo_addr(String bo_addr){
		this.bo_addr = bo_addr;
	}

	public void setBo_dtls_addr(String bo_dtls_addr){
		this.bo_dtls_addr = bo_dtls_addr;
	}

	public void setJd_zip_1(String jd_zip_1){
		this.jd_zip_1 = jd_zip_1;
	}

	public void setJd_zip_2(String jd_zip_2){
		this.jd_zip_2 = jd_zip_2;
	}

	public void setJd_addr(String jd_addr){
		this.jd_addr = jd_addr;
	}

	public void setJd_dtls_addr(String jd_dtls_addr){
		this.jd_dtls_addr = jd_dtls_addr;
	}

	public void setBo_jurs_nwsp_zip_1(String bo_jurs_nwsp_zip_1){
		this.bo_jurs_nwsp_zip_1 = bo_jurs_nwsp_zip_1;
	}

	public void setBo_jurs_nwsp_zip_2(String bo_jurs_nwsp_zip_2){
		this.bo_jurs_nwsp_zip_2 = bo_jurs_nwsp_zip_2;
	}

	public void setBo_jurs_nwsp_addr(String bo_jurs_nwsp_addr){
		this.bo_jurs_nwsp_addr = bo_jurs_nwsp_addr;
	}

	public void setBo_feat_clsf(String bo_feat_clsf){
		this.bo_feat_clsf = bo_feat_clsf;
	}

	public void setBo_mang_grad_clas(String bo_mang_grad_clas){
		this.bo_mang_grad_clas = bo_mang_grad_clas;
	}

	public void setStmt_crte_clsf(String stmt_crte_clsf){
		this.stmt_crte_clsf = stmt_crte_clsf;
	}

	public void setJd_sell_net_clsf(String jd_sell_net_clsf){
		this.jd_sell_net_clsf = jd_sell_net_clsf;
	}

	public void setQty_sell_net_clsf(String qty_sell_net_clsf){
		this.qty_sell_net_clsf = qty_sell_net_clsf;
	}

	public void setInvsg_obj_bo(String invsg_obj_bo){
		this.invsg_obj_bo = invsg_obj_bo;
	}

	public void setJd_clam(String jd_clam){
		this.jd_clam = jd_clam;
	}

	public void setClam_grp(String clam_grp){
		this.clam_grp = clam_grp;
	}

	public void setAdd_snd_bo_cd(String add_snd_bo_cd){
		this.add_snd_bo_cd = add_snd_bo_cd;
	}

	public void setAdd_snd_bo_seq(String add_snd_bo_seq){
		this.add_snd_bo_seq = add_snd_bo_seq;
	}

	public void setAdd_snd_bo_nm(String add_snd_bo_nm){
		this.add_snd_bo_nm = add_snd_bo_nm;
	}

	public void setAdms_dstc_cd(String adms_dstc_cd){
		this.adms_dstc_cd = adms_dstc_cd;
	}

	public void setAdms_unit_clsf(String adms_unit_clsf){
		this.adms_unit_clsf = adms_unit_clsf;
	}

	public void setSido_gugun_cd(String sido_gugun_cd){
		this.sido_gugun_cd = sido_gugun_cd;
	}

	public void setSido_gugun_nm(String sido_gugun_nm){
		this.sido_gugun_nm = sido_gugun_nm;
	}

	public void setBo_mang_type(String bo_mang_type){
		this.bo_mang_type = bo_mang_type;
	}

	public void setDmang_yn(String dmang_yn){
		this.dmang_yn = dmang_yn;
	}

	public void setBo_resv_reg_dt(String bo_resv_reg_dt){
		this.bo_resv_reg_dt = bo_resv_reg_dt;
	}

	public void setBo_reg_dt(String bo_reg_dt){
		this.bo_reg_dt = bo_reg_dt;
	}

	public void setElec_tax_stmt_yn(String elec_tax_stmt_yn){
		this.elec_tax_stmt_yn = elec_tax_stmt_yn;
	}

	public void setEmail(String email){
		this.email = email;
	}

	public void setBogurt_clsf(String bogurt_clsf){
		this.bogurt_clsf = bogurt_clsf;
	}

	public void setAcct_no(String acct_no){
		this.acct_no = acct_no;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getOrgn_clsf(){
		return this.orgn_clsf;
	}

	public String getBo_cd(){
		return this.bo_cd;
	}

	public String getBo_seq(){
		return this.bo_seq;
	}

	public String getBo_nm(){
		return this.bo_nm;
	}

	public String getArea_cd(){
		return this.area_cd;
	}

	public String getSrt_seq(){
		return this.srt_seq;
	}

	public String getDiv_motr_bo_cd(){
		return this.div_motr_bo_cd;
	}

	public String getDiv_motr_bo_seq(){
		return this.div_motr_bo_seq;
	}

	public String getDiv_motr_bo_nm(){
		return this.div_motr_bo_nm;
	}

	public String getRef_bo_cd(){
		return this.ref_bo_cd;
	}

	public String getRef_bo_seq(){
		return this.ref_bo_seq;
	}

	public String getRef_bo_nm(){
		return this.ref_bo_nm;
	}

	public String getChrg_pers(){
		return this.chrg_pers;
	}

	public String getChrg_pers_nm(){
		return this.chrg_pers_nm;
	}

	public String getBo_cntr_dt(){
		return this.bo_cntr_dt;
	}

	public String getBo_expy_dt(){
		return this.bo_expy_dt;
	}

	public String getBo_spcf_clsf(){
		return this.bo_spcf_clsf;
	}

	public String getCntr_doc_1(){
		return this.cntr_doc_1;
	}

	public String getCntr_doc_2(){
		return this.cntr_doc_2;
	}

	public String getCntr_stat_clsf(){
		return this.cntr_stat_clsf;
	}

	public String getJont_debtgurt_limt_amt(){
		return this.jont_debtgurt_limt_amt;
	}

	public String getChg_dt_tm(){
		return this.chg_dt_tm;
	}

	public String getDlco_no(){
		return this.dlco_no;
	}

	public String getErn(){
		return this.ern;
	}

	public String getIncmg_dt_tm(){
		return this.incmg_dt_tm;
	}

	public String getBo_head_nm(){
		return this.bo_head_nm;
	}

	public String getBo_head_prn(){
		return this.bo_head_prn;
	}

	public String getTel_no_1_0(){
		return this.tel_no_1_0;
	}

	public String getTel_no_1_1(){
		return this.tel_no_1_1;
	}

	public String getTel_no_1_2(){
		return this.tel_no_1_2;
	}

	public String getTel_no_1_3(){
		return this.tel_no_1_3;
	}

	public String getTel_no_2_0(){
		return this.tel_no_2_0;
	}

	public String getTel_no_2_1(){
		return this.tel_no_2_1;
	}

	public String getTel_no_2_2(){
		return this.tel_no_2_2;
	}

	public String getTel_no_2_3(){
		return this.tel_no_2_3;
	}

	public String getBo_zip_1(){
		return this.bo_zip_1;
	}

	public String getBo_zip_2(){
		return this.bo_zip_2;
	}

	public String getBo_addr(){
		return this.bo_addr;
	}

	public String getBo_dtls_addr(){
		return this.bo_dtls_addr;
	}

	public String getJd_zip_1(){
		return this.jd_zip_1;
	}

	public String getJd_zip_2(){
		return this.jd_zip_2;
	}

	public String getJd_addr(){
		return this.jd_addr;
	}

	public String getJd_dtls_addr(){
		return this.jd_dtls_addr;
	}

	public String getBo_jurs_nwsp_zip_1(){
		return this.bo_jurs_nwsp_zip_1;
	}

	public String getBo_jurs_nwsp_zip_2(){
		return this.bo_jurs_nwsp_zip_2;
	}

	public String getBo_jurs_nwsp_addr(){
		return this.bo_jurs_nwsp_addr;
	}

	public String getBo_feat_clsf(){
		return this.bo_feat_clsf;
	}

	public String getBo_mang_grad_clas(){
		return this.bo_mang_grad_clas;
	}

	public String getStmt_crte_clsf(){
		return this.stmt_crte_clsf;
	}

	public String getJd_sell_net_clsf(){
		return this.jd_sell_net_clsf;
	}

	public String getQty_sell_net_clsf(){
		return this.qty_sell_net_clsf;
	}

	public String getInvsg_obj_bo(){
		return this.invsg_obj_bo;
	}

	public String getJd_clam(){
		return this.jd_clam;
	}

	public String getClam_grp(){
		return this.clam_grp;
	}

	public String getAdd_snd_bo_cd(){
		return this.add_snd_bo_cd;
	}

	public String getAdd_snd_bo_seq(){
		return this.add_snd_bo_seq;
	}

	public String getAdd_snd_bo_nm(){
		return this.add_snd_bo_nm;
	}

	public String getAdms_dstc_cd(){
		return this.adms_dstc_cd;
	}

	public String getAdms_unit_clsf(){
		return this.adms_unit_clsf;
	}

	public String getSido_gugun_cd(){
		return this.sido_gugun_cd;
	}

	public String getSido_gugun_nm(){
		return this.sido_gugun_nm;
	}

	public String getBo_mang_type(){
		return this.bo_mang_type;
	}

	public String getDmang_yn(){
		return this.dmang_yn;
	}

	public String getBo_resv_reg_dt(){
		return this.bo_resv_reg_dt;
	}

	public String getBo_reg_dt(){
		return this.bo_reg_dt;
	}

	public String getElec_tax_stmt_yn(){
		return this.elec_tax_stmt_yn;
	}

	public String getEmail(){
		return this.email;
	}

	public String getBogurt_clsf(){
		return this.bogurt_clsf;
	}

	public String getAcct_no(){
		return this.acct_no;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){			return;		}
		this.orgn_clsf = Util.checkString(cstmt.getString(6));
		this.bo_cd = Util.checkString(cstmt.getString(7));
		this.bo_seq = Util.checkString(cstmt.getString(8));
		this.bo_nm = Util.checkString(cstmt.getString(9));
		this.area_cd = Util.checkString(cstmt.getString(10));
		this.srt_seq = Util.checkString(cstmt.getString(11));
		this.div_motr_bo_cd = Util.checkString(cstmt.getString(12));
		this.div_motr_bo_seq = Util.checkString(cstmt.getString(13));
		this.div_motr_bo_nm = Util.checkString(cstmt.getString(14));
		this.ref_bo_cd = Util.checkString(cstmt.getString(15));
		this.ref_bo_seq = Util.checkString(cstmt.getString(16));
		this.ref_bo_nm = Util.checkString(cstmt.getString(17));
		this.chrg_pers = Util.checkString(cstmt.getString(18));
		this.chrg_pers_nm = Util.checkString(cstmt.getString(19));
		this.bo_cntr_dt = Util.checkString(cstmt.getString(20));
		this.bo_expy_dt = Util.checkString(cstmt.getString(21));
		this.bo_spcf_clsf = Util.checkString(cstmt.getString(22));
		this.cntr_doc_1 = Util.checkString(cstmt.getString(23));
		this.cntr_doc_2 = Util.checkString(cstmt.getString(24));
		this.cntr_stat_clsf = Util.checkString(cstmt.getString(25));
		this.jont_debtgurt_limt_amt = Util.checkString(cstmt.getString(26));
		this.chg_dt_tm = Util.checkString(cstmt.getString(27));
		this.dlco_no = Util.checkString(cstmt.getString(28));
		this.ern = Util.checkString(cstmt.getString(29));
		this.incmg_dt_tm = Util.checkString(cstmt.getString(30));
		this.bo_head_nm = Util.checkString(cstmt.getString(31));
		this.bo_head_prn = Util.checkString(cstmt.getString(32));
		this.tel_no_1_0 = Util.checkString(cstmt.getString(33));
		this.tel_no_1_1 = Util.checkString(cstmt.getString(34));
		this.tel_no_1_2 = Util.checkString(cstmt.getString(35));
		this.tel_no_1_3 = Util.checkString(cstmt.getString(36));
		this.tel_no_2_0 = Util.checkString(cstmt.getString(37));
		this.tel_no_2_1 = Util.checkString(cstmt.getString(38));
		this.tel_no_2_2 = Util.checkString(cstmt.getString(39));
		this.tel_no_2_3 = Util.checkString(cstmt.getString(40));
		this.bo_zip_1 = Util.checkString(cstmt.getString(41));
		this.bo_zip_2 = Util.checkString(cstmt.getString(42));
		this.bo_addr = Util.checkString(cstmt.getString(43));
		this.bo_dtls_addr = Util.checkString(cstmt.getString(44));
		this.jd_zip_1 = Util.checkString(cstmt.getString(45));
		this.jd_zip_2 = Util.checkString(cstmt.getString(46));
		this.jd_addr = Util.checkString(cstmt.getString(47));
		this.jd_dtls_addr = Util.checkString(cstmt.getString(48));
		this.bo_jurs_nwsp_zip_1 = Util.checkString(cstmt.getString(49));
		this.bo_jurs_nwsp_zip_2 = Util.checkString(cstmt.getString(50));
		this.bo_jurs_nwsp_addr = Util.checkString(cstmt.getString(51));
		this.bo_feat_clsf = Util.checkString(cstmt.getString(52));
		this.bo_mang_grad_clas = Util.checkString(cstmt.getString(53));
		this.stmt_crte_clsf = Util.checkString(cstmt.getString(54));
		this.jd_sell_net_clsf = Util.checkString(cstmt.getString(55));
		this.qty_sell_net_clsf = Util.checkString(cstmt.getString(56));
		this.invsg_obj_bo = Util.checkString(cstmt.getString(57));
		this.jd_clam = Util.checkString(cstmt.getString(58));
		this.clam_grp = Util.checkString(cstmt.getString(59));
		this.add_snd_bo_cd = Util.checkString(cstmt.getString(60));
		this.add_snd_bo_seq = Util.checkString(cstmt.getString(61));
		this.add_snd_bo_nm = Util.checkString(cstmt.getString(62));
		this.adms_dstc_cd = Util.checkString(cstmt.getString(63));
		this.adms_unit_clsf = Util.checkString(cstmt.getString(64));
		this.sido_gugun_cd = Util.checkString(cstmt.getString(65));
		this.sido_gugun_nm = Util.checkString(cstmt.getString(66));
		this.bo_mang_type = Util.checkString(cstmt.getString(67));
		this.dmang_yn = Util.checkString(cstmt.getString(68));
		this.bo_resv_reg_dt = Util.checkString(cstmt.getString(69));
		this.bo_reg_dt = Util.checkString(cstmt.getString(70));
		this.elec_tax_stmt_yn = Util.checkString(cstmt.getString(71));
		this.email = Util.checkString(cstmt.getString(72));
		this.bogurt_clsf = Util.checkString(cstmt.getString(73));
		this.acct_no = Util.checkString(cstmt.getString(74));
		ResultSet rset0 = (ResultSet) cstmt.getObject(75);
		while(rset0.next()){
			SE_BOI_1020_SCOMMCDCUR1Record rec = new SE_BOI_1020_SCOMMCDCUR1Record();
			rec.cd = Util.checkString(rset0.getString("cd"));
			rec.cdnm = Util.checkString(rset0.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset0.getString("cd_abrv_nm"));
			this.commcdcur1.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(76);
		while(rset1.next()){
			SE_BOI_1020_SCOMMCDCUR2Record rec = new SE_BOI_1020_SCOMMCDCUR2Record();
			rec.cd = Util.checkString(rset1.getString("cd"));
			rec.cdnm = Util.checkString(rset1.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset1.getString("cd_abrv_nm"));
			this.commcdcur2.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(77);
		while(rset2.next()){
			SE_BOI_1020_SCOMMCDCUR3Record rec = new SE_BOI_1020_SCOMMCDCUR3Record();
			rec.cd = Util.checkString(rset2.getString("cd"));
			rec.cdnm = Util.checkString(rset2.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset2.getString("cd_abrv_nm"));
			this.commcdcur3.add(rec);
		}
		ResultSet rset3 = (ResultSet) cstmt.getObject(78);
		while(rset3.next()){
			SE_BOI_1020_SCOMMCDCUR4Record rec = new SE_BOI_1020_SCOMMCDCUR4Record();
			rec.cd = Util.checkString(rset3.getString("cd"));
			rec.cdnm = Util.checkString(rset3.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset3.getString("cd_abrv_nm"));
			this.commcdcur4.add(rec);
		}
		ResultSet rset4 = (ResultSet) cstmt.getObject(79);
		while(rset4.next()){
			SE_BOI_1020_SCOMMCDCUR5Record rec = new SE_BOI_1020_SCOMMCDCUR5Record();
			rec.cd = Util.checkString(rset4.getString("cd"));
			rec.cdnm = Util.checkString(rset4.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset4.getString("cd_abrv_nm"));
			this.commcdcur5.add(rec);
		}
		ResultSet rset5 = (ResultSet) cstmt.getObject(80);
		while(rset5.next()){
			SE_BOI_1020_SCOMMCDCUR6Record rec = new SE_BOI_1020_SCOMMCDCUR6Record();
			rec.cd = Util.checkString(rset5.getString("cd"));
			rec.cdnm = Util.checkString(rset5.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset5.getString("cd_abrv_nm"));
			this.commcdcur6.add(rec);
		}
		ResultSet rset6 = (ResultSet) cstmt.getObject(81);
		while(rset6.next()){
			SE_BOI_1020_SCOMMCDCUR7Record rec = new SE_BOI_1020_SCOMMCDCUR7Record();
			rec.cd = Util.checkString(rset6.getString("cd"));
			rec.cdnm = Util.checkString(rset6.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset6.getString("cd_abrv_nm"));
			this.commcdcur7.add(rec);
		}
		ResultSet rset7 = (ResultSet) cstmt.getObject(82);
		while(rset7.next()){
			SE_BOI_1020_SCOMMCDCUR8Record rec = new SE_BOI_1020_SCOMMCDCUR8Record();
			rec.cd = Util.checkString(rset7.getString("cd"));
			rec.cdnm = Util.checkString(rset7.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset7.getString("cd_abrv_nm"));
			this.commcdcur8.add(rec);
		}
		ResultSet rset8 = (ResultSet) cstmt.getObject(83);
		while(rset8.next()){
			SE_BOI_1020_SCOMMCDCUR9Record rec = new SE_BOI_1020_SCOMMCDCUR9Record();
			rec.cd = Util.checkString(rset8.getString("cd"));
			rec.cdnm = Util.checkString(rset8.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset8.getString("cd_abrv_nm"));
			this.commcdcur9.add(rec);
		}
		ResultSet rset9 = (ResultSet) cstmt.getObject(84);
		while(rset9.next()){
			SE_BOI_1020_SCOMMCDCUR10Record rec = new SE_BOI_1020_SCOMMCDCUR10Record();
			rec.cd = Util.checkString(rset9.getString("cd"));
			rec.cdnm = Util.checkString(rset9.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset9.getString("cd_abrv_nm"));
			this.commcdcur10.add(rec);
		}
	}

	public String commcdcur1OptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = commcdcur1.size();
		for(int i=0; i<size; i++){
			SE_BOI_1020_SCOMMCDCUR1Record rec = (SE_BOI_1020_SCOMMCDCUR1Record)commcdcur1.get(i);


			String code = rec.cd;
			String name = rec.cdnm;

			sb.append("<option value=\"");
			sb.append(code);
			sb.append("\"");
			if(code.equals(selected)){
				sb.append(" selected ");
			}
			sb.append(">");
			sb.append(name);
			sb.append("</option>");
		}
		return sb.toString();
	}

	public String commcdcur2OptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = commcdcur2.size();
		for(int i=0; i<size; i++){
			SE_BOI_1020_SCOMMCDCUR2Record rec = (SE_BOI_1020_SCOMMCDCUR2Record)commcdcur2.get(i);


			String code = rec.cd;
			String name = rec.cdnm;

			sb.append("<option value=\"");
			sb.append(code);
			sb.append("\"");
			if(code.equals(selected)){
				sb.append(" selected ");
			}
			sb.append(">");
			sb.append(name);
			sb.append("</option>");
		}
		return sb.toString();
	}

	public String commcdcur3OptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = commcdcur3.size();
		for(int i=0; i<size; i++){
			SE_BOI_1020_SCOMMCDCUR3Record rec = (SE_BOI_1020_SCOMMCDCUR3Record)commcdcur3.get(i);


			String code = rec.cd;
			String name = rec.cdnm;

			sb.append("<option value=\"");
			sb.append(code);
			sb.append("\"");
			if(code.equals(selected)){
				sb.append(" selected ");
			}
			sb.append(">");
			sb.append(name);
			sb.append("</option>");
		}
		return sb.toString();
	}

	public String commcdcur4OptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = commcdcur4.size();
		for(int i=0; i<size; i++){
			SE_BOI_1020_SCOMMCDCUR4Record rec = (SE_BOI_1020_SCOMMCDCUR4Record)commcdcur4.get(i);


			String code = rec.cd;
			String name = rec.cdnm;

			sb.append("<option value=\"");
			sb.append(code);
			sb.append("\"");
			if(code.equals(selected)){
				sb.append(" selected ");
			}
			sb.append(">");
			sb.append(name);
			sb.append("</option>");
		}
		return sb.toString();
	}

	public String commcdcur5OptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = commcdcur5.size();
		for(int i=0; i<size; i++){
			SE_BOI_1020_SCOMMCDCUR5Record rec = (SE_BOI_1020_SCOMMCDCUR5Record)commcdcur5.get(i);


			String code = rec.cd;
			String name = rec.cdnm;

			sb.append("<option value=\"");
			sb.append(code);
			sb.append("\"");
			if(code.equals(selected)){
				sb.append(" selected ");
			}
			sb.append(">");
			sb.append(name);
			sb.append("</option>");
		}
		return sb.toString();
	}

	public String commcdcur6OptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = commcdcur6.size();
		for(int i=0; i<size; i++){
			SE_BOI_1020_SCOMMCDCUR6Record rec = (SE_BOI_1020_SCOMMCDCUR6Record)commcdcur6.get(i);


			String code = rec.cd;
			String name = rec.cdnm;

			sb.append("<option value=\"");
			sb.append(code);
			sb.append("\"");
			if(code.equals(selected)){
				sb.append(" selected ");
			}
			sb.append(">");
			sb.append(name);
			sb.append("</option>");
		}
		return sb.toString();
	}

	public String commcdcur7OptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = commcdcur7.size();
		for(int i=0; i<size; i++){
			SE_BOI_1020_SCOMMCDCUR7Record rec = (SE_BOI_1020_SCOMMCDCUR7Record)commcdcur7.get(i);


			String code = rec.cd;
			String name = rec.cdnm;

			sb.append("<option value=\"");
			sb.append(code);
			sb.append("\"");
			if(code.equals(selected)){
				sb.append(" selected ");
			}
			sb.append(">");
			sb.append(name);
			sb.append("</option>");
		}
		return sb.toString();
	}

	public String commcdcur8OptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = commcdcur8.size();
		for(int i=0; i<size; i++){
			SE_BOI_1020_SCOMMCDCUR8Record rec = (SE_BOI_1020_SCOMMCDCUR8Record)commcdcur8.get(i);


			String code = rec.cd;
			String name = rec.cdnm;

			sb.append("<option value=\"");
			sb.append(code);
			sb.append("\"");
			if(code.equals(selected)){
				sb.append(" selected ");
			}
			sb.append(">");
			sb.append(name);
			sb.append("</option>");
		}
		return sb.toString();
	}

	public String commcdcur9OptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = commcdcur9.size();
		for(int i=0; i<size; i++){
			SE_BOI_1020_SCOMMCDCUR9Record rec = (SE_BOI_1020_SCOMMCDCUR9Record)commcdcur9.get(i);


			String code = rec.cd;
			String name = rec.cdnm;

			sb.append("<option value=\"");
			sb.append(code);
			sb.append("\"");
			if(code.equals(selected)){
				sb.append(" selected ");
			}
			sb.append(">");
			sb.append(name);
			sb.append("</option>");
		}
		return sb.toString();
	}

	public String commcdcur10OptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = commcdcur10.size();
		for(int i=0; i<size; i++){
			SE_BOI_1020_SCOMMCDCUR10Record rec = (SE_BOI_1020_SCOMMCDCUR10Record)commcdcur10.get(i);


			String code = rec.cd;
			String name = rec.cdnm;

			sb.append("<option value=\"");
			sb.append(code);
			sb.append("\"");
			if(code.equals(selected)){
				sb.append(" selected ");
			}
			sb.append(">");
			sb.append(name);
			sb.append("</option>");
		}
		return sb.toString();
	}

	public String commcdcur1ChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = commcdcur1.size();
		for(int i=0; i<size; i++){
			SE_BOI_1020_SCOMMCDCUR1Record rec = (SE_BOI_1020_SCOMMCDCUR1Record)commcdcur1.get(i);


			String code = rec.cd;
			String name = rec.cdnm;

			sb.append("<input name=\"");
			sb.append("cd");
			sb.append("\" type=\"checkbox\" value=\"");
			sb.append(code);
			sb.append("\"");
			if(code.equals(selected)){
				sb.append(" checked ");
			}
			sb.append(">");
			sb.append(name);
			sb.append("</input>");
		}
		return sb.toString();
	}

	public String commcdcur2ChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = commcdcur2.size();
		for(int i=0; i<size; i++){
			SE_BOI_1020_SCOMMCDCUR2Record rec = (SE_BOI_1020_SCOMMCDCUR2Record)commcdcur2.get(i);


			String code = rec.cd;
			String name = rec.cdnm;

			sb.append("<input name=\"");
			sb.append("cd");
			sb.append("\" type=\"checkbox\" value=\"");
			sb.append(code);
			sb.append("\"");
			if(code.equals(selected)){
				sb.append(" checked ");
			}
			sb.append(">");
			sb.append(name);
			sb.append("</input>");
		}
		return sb.toString();
	}

	public String commcdcur3ChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = commcdcur3.size();
		for(int i=0; i<size; i++){
			SE_BOI_1020_SCOMMCDCUR3Record rec = (SE_BOI_1020_SCOMMCDCUR3Record)commcdcur3.get(i);


			String code = rec.cd;
			String name = rec.cdnm;

			sb.append("<input name=\"");
			sb.append("cd");
			sb.append("\" type=\"checkbox\" value=\"");
			sb.append(code);
			sb.append("\"");
			if(code.equals(selected)){
				sb.append(" checked ");
			}
			sb.append(">");
			sb.append(name);
			sb.append("</input>");
		}
		return sb.toString();
	}

	public String commcdcur4ChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = commcdcur4.size();
		for(int i=0; i<size; i++){
			SE_BOI_1020_SCOMMCDCUR4Record rec = (SE_BOI_1020_SCOMMCDCUR4Record)commcdcur4.get(i);


			String code = rec.cd;
			String name = rec.cdnm;

			sb.append("<input name=\"");
			sb.append("cd");
			sb.append("\" type=\"checkbox\" value=\"");
			sb.append(code);
			sb.append("\"");
			if(code.equals(selected)){
				sb.append(" checked ");
			}
			sb.append(">");
			sb.append(name);
			sb.append("</input>");
		}
		return sb.toString();
	}

	public String commcdcur5ChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = commcdcur5.size();
		for(int i=0; i<size; i++){
			SE_BOI_1020_SCOMMCDCUR5Record rec = (SE_BOI_1020_SCOMMCDCUR5Record)commcdcur5.get(i);


			String code = rec.cd;
			String name = rec.cdnm;

			sb.append("<input name=\"");
			sb.append("cd");
			sb.append("\" type=\"checkbox\" value=\"");
			sb.append(code);
			sb.append("\"");
			if(code.equals(selected)){
				sb.append(" checked ");
			}
			sb.append(">");
			sb.append(name);
			sb.append("</input>");
		}
		return sb.toString();
	}

	public String commcdcur6ChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = commcdcur6.size();
		for(int i=0; i<size; i++){
			SE_BOI_1020_SCOMMCDCUR6Record rec = (SE_BOI_1020_SCOMMCDCUR6Record)commcdcur6.get(i);


			String code = rec.cd;
			String name = rec.cdnm;

			sb.append("<input name=\"");
			sb.append("cd");
			sb.append("\" type=\"checkbox\" value=\"");
			sb.append(code);
			sb.append("\"");
			if(code.equals(selected)){
				sb.append(" checked ");
			}
			sb.append(">");
			sb.append(name);
			sb.append("</input>");
		}
		return sb.toString();
	}

	public String commcdcur7ChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = commcdcur7.size();
		for(int i=0; i<size; i++){
			SE_BOI_1020_SCOMMCDCUR7Record rec = (SE_BOI_1020_SCOMMCDCUR7Record)commcdcur7.get(i);


			String code = rec.cd;
			String name = rec.cdnm;

			sb.append("<input name=\"");
			sb.append("cd");
			sb.append("\" type=\"checkbox\" value=\"");
			sb.append(code);
			sb.append("\"");
			if(code.equals(selected)){
				sb.append(" checked ");
			}
			sb.append(">");
			sb.append(name);
			sb.append("</input>");
		}
		return sb.toString();
	}

	public String commcdcur8ChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = commcdcur8.size();
		for(int i=0; i<size; i++){
			SE_BOI_1020_SCOMMCDCUR8Record rec = (SE_BOI_1020_SCOMMCDCUR8Record)commcdcur8.get(i);


			String code = rec.cd;
			String name = rec.cdnm;

			sb.append("<input name=\"");
			sb.append("cd");
			sb.append("\" type=\"checkbox\" value=\"");
			sb.append(code);
			sb.append("\"");
			if(code.equals(selected)){
				sb.append(" checked ");
			}
			sb.append(">");
			sb.append(name);
			sb.append("</input>");
		}
		return sb.toString();
	}

	public String commcdcur9ChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = commcdcur9.size();
		for(int i=0; i<size; i++){
			SE_BOI_1020_SCOMMCDCUR9Record rec = (SE_BOI_1020_SCOMMCDCUR9Record)commcdcur9.get(i);


			String code = rec.cd;
			String name = rec.cdnm;

			sb.append("<input name=\"");
			sb.append("cd");
			sb.append("\" type=\"checkbox\" value=\"");
			sb.append(code);
			sb.append("\"");
			if(code.equals(selected)){
				sb.append(" checked ");
			}
			sb.append(">");
			sb.append(name);
			sb.append("</input>");
		}
		return sb.toString();
	}

	public String commcdcur10ChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = commcdcur10.size();
		for(int i=0; i<size; i++){
			SE_BOI_1020_SCOMMCDCUR10Record rec = (SE_BOI_1020_SCOMMCDCUR10Record)commcdcur10.get(i);


			String code = rec.cd;
			String name = rec.cdnm;

			sb.append("<input name=\"");
			sb.append("cd");
			sb.append("\" type=\"checkbox\" value=\"");
			sb.append(code);
			sb.append("\"");
			if(code.equals(selected)){
				sb.append(" checked ");
			}
			sb.append(">");
			sb.append(name);
			sb.append("</input>");
		}
		return sb.toString();
	}

	public String commcdcur1RdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = commcdcur1.size();
		for(int i=0; i<size; i++){
			SE_BOI_1020_SCOMMCDCUR1Record rec = (SE_BOI_1020_SCOMMCDCUR1Record)commcdcur1.get(i);


			String code = rec.cd;
			String name = rec.cdnm;

			sb.append("<input name=\"");
			sb.append("cd");
			sb.append("\" type=\"radio\" value=\"");
			sb.append(code);
			sb.append("\"");
			if(code.equals(selected)){
				sb.append(" checked ");
			}
			sb.append(">");
			sb.append(name);
			sb.append("</input>");
		}
		return sb.toString();
	}

	public String commcdcur2RdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = commcdcur2.size();
		for(int i=0; i<size; i++){
			SE_BOI_1020_SCOMMCDCUR2Record rec = (SE_BOI_1020_SCOMMCDCUR2Record)commcdcur2.get(i);


			String code = rec.cd;
			String name = rec.cdnm;

			sb.append("<input name=\"");
			sb.append("cd");
			sb.append("\" type=\"radio\" value=\"");
			sb.append(code);
			sb.append("\"");
			if(code.equals(selected)){
				sb.append(" checked ");
			}
			sb.append(">");
			sb.append(name);
			sb.append("</input>");
		}
		return sb.toString();
	}

	public String commcdcur3RdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = commcdcur3.size();
		for(int i=0; i<size; i++){
			SE_BOI_1020_SCOMMCDCUR3Record rec = (SE_BOI_1020_SCOMMCDCUR3Record)commcdcur3.get(i);


			String code = rec.cd;
			String name = rec.cdnm;

			sb.append("<input name=\"");
			sb.append("cd");
			sb.append("\" type=\"radio\" value=\"");
			sb.append(code);
			sb.append("\"");
			if(code.equals(selected)){
				sb.append(" checked ");
			}
			sb.append(">");
			sb.append(name);
			sb.append("</input>");
		}
		return sb.toString();
	}

	public String commcdcur4RdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = commcdcur4.size();
		for(int i=0; i<size; i++){
			SE_BOI_1020_SCOMMCDCUR4Record rec = (SE_BOI_1020_SCOMMCDCUR4Record)commcdcur4.get(i);


			String code = rec.cd;
			String name = rec.cdnm;

			sb.append("<input name=\"");
			sb.append("cd");
			sb.append("\" type=\"radio\" value=\"");
			sb.append(code);
			sb.append("\"");
			if(code.equals(selected)){
				sb.append(" checked ");
			}
			sb.append(">");
			sb.append(name);
			sb.append("</input>");
		}
		return sb.toString();
	}

	public String commcdcur5RdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = commcdcur5.size();
		for(int i=0; i<size; i++){
			SE_BOI_1020_SCOMMCDCUR5Record rec = (SE_BOI_1020_SCOMMCDCUR5Record)commcdcur5.get(i);


			String code = rec.cd;
			String name = rec.cdnm;

			sb.append("<input name=\"");
			sb.append("cd");
			sb.append("\" type=\"radio\" value=\"");
			sb.append(code);
			sb.append("\"");
			if(code.equals(selected)){
				sb.append(" checked ");
			}
			sb.append(">");
			sb.append(name);
			sb.append("</input>");
		}
		return sb.toString();
	}

	public String commcdcur6RdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = commcdcur6.size();
		for(int i=0; i<size; i++){
			SE_BOI_1020_SCOMMCDCUR6Record rec = (SE_BOI_1020_SCOMMCDCUR6Record)commcdcur6.get(i);


			String code = rec.cd;
			String name = rec.cdnm;

			sb.append("<input name=\"");
			sb.append("cd");
			sb.append("\" type=\"radio\" value=\"");
			sb.append(code);
			sb.append("\"");
			if(code.equals(selected)){
				sb.append(" checked ");
			}
			sb.append(">");
			sb.append(name);
			sb.append("</input>");
		}
		return sb.toString();
	}

	public String commcdcur7RdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = commcdcur7.size();
		for(int i=0; i<size; i++){
			SE_BOI_1020_SCOMMCDCUR7Record rec = (SE_BOI_1020_SCOMMCDCUR7Record)commcdcur7.get(i);


			String code = rec.cd;
			String name = rec.cdnm;

			sb.append("<input name=\"");
			sb.append("cd");
			sb.append("\" type=\"radio\" value=\"");
			sb.append(code);
			sb.append("\"");
			if(code.equals(selected)){
				sb.append(" checked ");
			}
			sb.append(">");
			sb.append(name);
			sb.append("</input>");
		}
		return sb.toString();
	}

	public String commcdcur8RdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = commcdcur8.size();
		for(int i=0; i<size; i++){
			SE_BOI_1020_SCOMMCDCUR8Record rec = (SE_BOI_1020_SCOMMCDCUR8Record)commcdcur8.get(i);


			String code = rec.cd;
			String name = rec.cdnm;

			sb.append("<input name=\"");
			sb.append("cd");
			sb.append("\" type=\"radio\" value=\"");
			sb.append(code);
			sb.append("\"");
			if(code.equals(selected)){
				sb.append(" checked ");
			}
			sb.append(">");
			sb.append(name);
			sb.append("</input>");
		}
		return sb.toString();
	}

	public String commcdcur9RdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = commcdcur9.size();
		for(int i=0; i<size; i++){
			SE_BOI_1020_SCOMMCDCUR9Record rec = (SE_BOI_1020_SCOMMCDCUR9Record)commcdcur9.get(i);


			String code = rec.cd;
			String name = rec.cdnm;

			sb.append("<input name=\"");
			sb.append("cd");
			sb.append("\" type=\"radio\" value=\"");
			sb.append(code);
			sb.append("\"");
			if(code.equals(selected)){
				sb.append(" checked ");
			}
			sb.append(">");
			sb.append(name);
			sb.append("</input>");
		}
		return sb.toString();
	}

	public String commcdcur10RdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = commcdcur10.size();
		for(int i=0; i<size; i++){
			SE_BOI_1020_SCOMMCDCUR10Record rec = (SE_BOI_1020_SCOMMCDCUR10Record)commcdcur10.get(i);


			String code = rec.cd;
			String name = rec.cdnm;

			sb.append("<input name=\"");
			sb.append("cd");
			sb.append("\" type=\"radio\" value=\"");
			sb.append(code);
			sb.append("\"");
			if(code.equals(selected)){
				sb.append(" checked ");
			}
			sb.append(">");
			sb.append(name);
			sb.append("</input>");
		}
		return sb.toString();
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SE_BOI_1020_SDataSet ds = (SE_BOI_1020_SDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.commcdcur1.size(); i++){
		SE_BOI_1020_SCOMMCDCUR1Record commcdcur1Rec = (SE_BOI_1020_SCOMMCDCUR1Record)ds.commcdcur1.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.commcdcur2.size(); i++){
		SE_BOI_1020_SCOMMCDCUR2Record commcdcur2Rec = (SE_BOI_1020_SCOMMCDCUR2Record)ds.commcdcur2.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.commcdcur3.size(); i++){
		SE_BOI_1020_SCOMMCDCUR3Record commcdcur3Rec = (SE_BOI_1020_SCOMMCDCUR3Record)ds.commcdcur3.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.commcdcur4.size(); i++){
		SE_BOI_1020_SCOMMCDCUR4Record commcdcur4Rec = (SE_BOI_1020_SCOMMCDCUR4Record)ds.commcdcur4.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.commcdcur5.size(); i++){
		SE_BOI_1020_SCOMMCDCUR5Record commcdcur5Rec = (SE_BOI_1020_SCOMMCDCUR5Record)ds.commcdcur5.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.commcdcur6.size(); i++){
		SE_BOI_1020_SCOMMCDCUR6Record commcdcur6Rec = (SE_BOI_1020_SCOMMCDCUR6Record)ds.commcdcur6.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.commcdcur7.size(); i++){
		SE_BOI_1020_SCOMMCDCUR7Record commcdcur7Rec = (SE_BOI_1020_SCOMMCDCUR7Record)ds.commcdcur7.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.commcdcur8.size(); i++){
		SE_BOI_1020_SCOMMCDCUR8Record commcdcur8Rec = (SE_BOI_1020_SCOMMCDCUR8Record)ds.commcdcur8.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.commcdcur9.size(); i++){
		SE_BOI_1020_SCOMMCDCUR9Record commcdcur9Rec = (SE_BOI_1020_SCOMMCDCUR9Record)ds.commcdcur9.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.commcdcur10.size(); i++){
		SE_BOI_1020_SCOMMCDCUR10Record commcdcur10Rec = (SE_BOI_1020_SCOMMCDCUR10Record)ds.commcdcur10.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getOrgn_clsf()%>
<%= ds.getBo_cd()%>
<%= ds.getBo_seq()%>
<%= ds.getBo_nm()%>
<%= ds.getArea_cd()%>
<%= ds.getSrt_seq()%>
<%= ds.getDiv_motr_bo_cd()%>
<%= ds.getDiv_motr_bo_seq()%>
<%= ds.getDiv_motr_bo_nm()%>
<%= ds.getRef_bo_cd()%>
<%= ds.getRef_bo_seq()%>
<%= ds.getRef_bo_nm()%>
<%= ds.getChrg_pers()%>
<%= ds.getChrg_pers_nm()%>
<%= ds.getBo_cntr_dt()%>
<%= ds.getBo_expy_dt()%>
<%= ds.getBo_spcf_clsf()%>
<%= ds.getCntr_doc_1()%>
<%= ds.getCntr_doc_2()%>
<%= ds.getCntr_stat_clsf()%>
<%= ds.getJont_debtgurt_limt_amt()%>
<%= ds.getChg_dt_tm()%>
<%= ds.getDlco_no()%>
<%= ds.getErn()%>
<%= ds.getIncmg_dt_tm()%>
<%= ds.getBo_head_nm()%>
<%= ds.getBo_head_prn()%>
<%= ds.getTel_no_1_0()%>
<%= ds.getTel_no_1_1()%>
<%= ds.getTel_no_1_2()%>
<%= ds.getTel_no_1_3()%>
<%= ds.getTel_no_2_0()%>
<%= ds.getTel_no_2_1()%>
<%= ds.getTel_no_2_2()%>
<%= ds.getTel_no_2_3()%>
<%= ds.getBo_zip_1()%>
<%= ds.getBo_zip_2()%>
<%= ds.getBo_addr()%>
<%= ds.getBo_dtls_addr()%>
<%= ds.getJd_zip_1()%>
<%= ds.getJd_zip_2()%>
<%= ds.getJd_addr()%>
<%= ds.getJd_dtls_addr()%>
<%= ds.getBo_jurs_nwsp_zip_1()%>
<%= ds.getBo_jurs_nwsp_zip_2()%>
<%= ds.getBo_jurs_nwsp_addr()%>
<%= ds.getBo_feat_clsf()%>
<%= ds.getBo_mang_grad_clas()%>
<%= ds.getStmt_crte_clsf()%>
<%= ds.getJd_sell_net_clsf()%>
<%= ds.getQty_sell_net_clsf()%>
<%= ds.getInvsg_obj_bo()%>
<%= ds.getJd_clam()%>
<%= ds.getClam_grp()%>
<%= ds.getAdd_snd_bo_cd()%>
<%= ds.getAdd_snd_bo_seq()%>
<%= ds.getAdd_snd_bo_nm()%>
<%= ds.getAdms_dstc_cd()%>
<%= ds.getAdms_unit_clsf()%>
<%= ds.getSido_gugun_cd()%>
<%= ds.getSido_gugun_nm()%>
<%= ds.getBo_mang_type()%>
<%= ds.getDmang_yn()%>
<%= ds.getBo_resv_reg_dt()%>
<%= ds.getBo_reg_dt()%>
<%= ds.getElec_tax_stmt_yn()%>
<%= ds.getEmail()%>
<%= ds.getBogurt_clsf()%>
<%= ds.getAcct_no()%>
<%= ds.getCommcdcur1()%>
<%= ds.getCommcdcur2()%>
<%= ds.getCommcdcur3()%>
<%= ds.getCommcdcur4()%>
<%= ds.getCommcdcur5()%>
<%= ds.getCommcdcur6()%>
<%= ds.getCommcdcur7()%>
<%= ds.getCommcdcur8()%>
<%= ds.getCommcdcur9()%>
<%= ds.getCommcdcur10()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= commcdcur1Rec.cd%>
<%= commcdcur1Rec.cdnm%>
<%= commcdcur1Rec.cd_abrv_nm%>
<%= commcdcur2Rec.cd%>
<%= commcdcur2Rec.cdnm%>
<%= commcdcur2Rec.cd_abrv_nm%>
<%= commcdcur3Rec.cd%>
<%= commcdcur3Rec.cdnm%>
<%= commcdcur3Rec.cd_abrv_nm%>
<%= commcdcur4Rec.cd%>
<%= commcdcur4Rec.cdnm%>
<%= commcdcur4Rec.cd_abrv_nm%>
<%= commcdcur5Rec.cd%>
<%= commcdcur5Rec.cdnm%>
<%= commcdcur5Rec.cd_abrv_nm%>
<%= commcdcur6Rec.cd%>
<%= commcdcur6Rec.cdnm%>
<%= commcdcur6Rec.cd_abrv_nm%>
<%= commcdcur7Rec.cd%>
<%= commcdcur7Rec.cdnm%>
<%= commcdcur7Rec.cd_abrv_nm%>
<%= commcdcur8Rec.cd%>
<%= commcdcur8Rec.cdnm%>
<%= commcdcur8Rec.cd_abrv_nm%>
<%= commcdcur9Rec.cd%>
<%= commcdcur9Rec.cdnm%>
<%= commcdcur9Rec.cd_abrv_nm%>
<%= commcdcur10Rec.cd%>
<%= commcdcur10Rec.cdnm%>
<%= commcdcur10Rec.cd_abrv_nm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Dec 07 15:16:14 KST 2016 */
/***************************************************************************************************
* 파일명 : .java
* 기능 : 
* 작성일자 : 
* 작성자 : 심정보
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.se.boi.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.se.boi.ds.*;
import chosun.ciis.se.boi.rec.*;

/**
 * 
 */


public class SE_BOI_1060_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String accflag;
	public String cmpy_cd;
	public String orgn_clsf;
	public String bo_cd;
	public String bo_seq;
	public String bo_nm;
	public String area_cd;
	public String srt_seq;
	public String div_motr_bo_cd;
	public String div_motr_bo_seq;
	public String ref_bo_cd;
	public String ref_bo_seq;
	public String chrg_pers;
	public String bo_cntr_dt;
	public String bo_expy_dt;
	public String bo_spcf_clsf;
	public String cntr_doc_1;
	public String cntr_doc_2;
	public String cntr_stat_clsf;
	public String jont_debtgurt_limt_amt;
	public String dlco_no;
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
	public String adms_dstc_cd;
	public String adms_unit_clsf;
	public String sido_gugun_cd;
	public String bo_mang_type;
	public String dmang_yn;
	public String incmgpers;
	public String incmg_pers_ip;
	public String bo_reg_clsf;
	public String elec_tax_stmt_yn;
	public String email;
	public String bogurt_clsf;

	public SE_BOI_1060_ADM(){}
	public SE_BOI_1060_ADM(String accflag, String cmpy_cd, String orgn_clsf, String bo_cd, String bo_seq, String bo_nm, String area_cd, String srt_seq, String div_motr_bo_cd, String div_motr_bo_seq, String ref_bo_cd, String ref_bo_seq, String chrg_pers, String bo_cntr_dt, String bo_expy_dt, String bo_spcf_clsf, String cntr_doc_1, String cntr_doc_2, String cntr_stat_clsf, String jont_debtgurt_limt_amt, String dlco_no, String bo_head_nm, String bo_head_prn, String tel_no_1_0, String tel_no_1_1, String tel_no_1_2, String tel_no_1_3, String tel_no_2_0, String tel_no_2_1, String tel_no_2_2, String tel_no_2_3, String bo_zip_1, String bo_zip_2, String bo_addr, String bo_dtls_addr, String jd_zip_1, String jd_zip_2, String jd_addr, String jd_dtls_addr, String bo_jurs_nwsp_zip_1, String bo_jurs_nwsp_zip_2, String bo_jurs_nwsp_addr, String bo_feat_clsf, String bo_mang_grad_clas, String stmt_crte_clsf, String jd_sell_net_clsf, String qty_sell_net_clsf, String invsg_obj_bo, String jd_clam, String clam_grp, String add_snd_bo_cd, String add_snd_bo_seq, String adms_dstc_cd, String adms_unit_clsf, String sido_gugun_cd, String bo_mang_type, String dmang_yn, String incmgpers, String incmg_pers_ip, String bo_reg_clsf, String elec_tax_stmt_yn, String email, String bogurt_clsf){
		this.accflag = accflag;
		this.cmpy_cd = cmpy_cd;
		this.orgn_clsf = orgn_clsf;
		this.bo_cd = bo_cd;
		this.bo_seq = bo_seq;
		this.bo_nm = bo_nm;
		this.area_cd = area_cd;
		this.srt_seq = srt_seq;
		this.div_motr_bo_cd = div_motr_bo_cd;
		this.div_motr_bo_seq = div_motr_bo_seq;
		this.ref_bo_cd = ref_bo_cd;
		this.ref_bo_seq = ref_bo_seq;
		this.chrg_pers = chrg_pers;
		this.bo_cntr_dt = bo_cntr_dt;
		this.bo_expy_dt = bo_expy_dt;
		this.bo_spcf_clsf = bo_spcf_clsf;
		this.cntr_doc_1 = cntr_doc_1;
		this.cntr_doc_2 = cntr_doc_2;
		this.cntr_stat_clsf = cntr_stat_clsf;
		this.jont_debtgurt_limt_amt = jont_debtgurt_limt_amt;
		this.dlco_no = dlco_no;
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
		this.adms_dstc_cd = adms_dstc_cd;
		this.adms_unit_clsf = adms_unit_clsf;
		this.sido_gugun_cd = sido_gugun_cd;
		this.bo_mang_type = bo_mang_type;
		this.dmang_yn = dmang_yn;
		this.incmgpers = incmgpers;
		this.incmg_pers_ip = incmg_pers_ip;
		this.bo_reg_clsf = bo_reg_clsf;
		this.elec_tax_stmt_yn = elec_tax_stmt_yn;
		this.email = email;
		this.bogurt_clsf = bogurt_clsf;
	}

	public void setAccflag(String accflag){
		this.accflag = accflag;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
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

	public void setRef_bo_cd(String ref_bo_cd){
		this.ref_bo_cd = ref_bo_cd;
	}

	public void setRef_bo_seq(String ref_bo_seq){
		this.ref_bo_seq = ref_bo_seq;
	}

	public void setChrg_pers(String chrg_pers){
		this.chrg_pers = chrg_pers;
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

	public void setDlco_no(String dlco_no){
		this.dlco_no = dlco_no;
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

	public void setAdms_dstc_cd(String adms_dstc_cd){
		this.adms_dstc_cd = adms_dstc_cd;
	}

	public void setAdms_unit_clsf(String adms_unit_clsf){
		this.adms_unit_clsf = adms_unit_clsf;
	}

	public void setSido_gugun_cd(String sido_gugun_cd){
		this.sido_gugun_cd = sido_gugun_cd;
	}

	public void setBo_mang_type(String bo_mang_type){
		this.bo_mang_type = bo_mang_type;
	}

	public void setDmang_yn(String dmang_yn){
		this.dmang_yn = dmang_yn;
	}

	public void setIncmgpers(String incmgpers){
		this.incmgpers = incmgpers;
	}

	public void setIncmg_pers_ip(String incmg_pers_ip){
		this.incmg_pers_ip = incmg_pers_ip;
	}

	public void setBo_reg_clsf(String bo_reg_clsf){
		this.bo_reg_clsf = bo_reg_clsf;
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

	public String getAccflag(){
		return this.accflag;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
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

	public String getRef_bo_cd(){
		return this.ref_bo_cd;
	}

	public String getRef_bo_seq(){
		return this.ref_bo_seq;
	}

	public String getChrg_pers(){
		return this.chrg_pers;
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

	public String getDlco_no(){
		return this.dlco_no;
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

	public String getAdms_dstc_cd(){
		return this.adms_dstc_cd;
	}

	public String getAdms_unit_clsf(){
		return this.adms_unit_clsf;
	}

	public String getSido_gugun_cd(){
		return this.sido_gugun_cd;
	}

	public String getBo_mang_type(){
		return this.bo_mang_type;
	}

	public String getDmang_yn(){
		return this.dmang_yn;
	}

	public String getIncmgpers(){
		return this.incmgpers;
	}

	public String getIncmg_pers_ip(){
		return this.incmg_pers_ip;
	}

	public String getBo_reg_clsf(){
		return this.bo_reg_clsf;
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

	public String getSQL(){
		 return "{ call CRMSAL_COM.SP_SE_BOI_1060_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SE_BOI_1060_ADM dm = (SE_BOI_1060_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.accflag);
		cstmt.setString(4, dm.cmpy_cd);
		cstmt.setString(5, dm.orgn_clsf);
		cstmt.setString(6, dm.bo_cd);
		cstmt.setString(7, dm.bo_seq);
		cstmt.setString(8, dm.bo_nm);
		cstmt.setString(9, dm.area_cd);
		cstmt.setString(10, dm.srt_seq);
		cstmt.setString(11, dm.div_motr_bo_cd);
		cstmt.setString(12, dm.div_motr_bo_seq);
		cstmt.setString(13, dm.ref_bo_cd);
		cstmt.setString(14, dm.ref_bo_seq);
		cstmt.setString(15, dm.chrg_pers);
		cstmt.setString(16, dm.bo_cntr_dt);
		cstmt.setString(17, dm.bo_expy_dt);
		cstmt.setString(18, dm.bo_spcf_clsf);
		cstmt.setString(19, dm.cntr_doc_1);
		cstmt.setString(20, dm.cntr_doc_2);
		cstmt.setString(21, dm.cntr_stat_clsf);
		cstmt.setString(22, dm.jont_debtgurt_limt_amt);
		cstmt.setString(23, dm.dlco_no);
		cstmt.setString(24, dm.bo_head_nm);
		cstmt.setString(25, dm.bo_head_prn);
		cstmt.setString(26, dm.tel_no_1_0);
		cstmt.setString(27, dm.tel_no_1_1);
		cstmt.setString(28, dm.tel_no_1_2);
		cstmt.setString(29, dm.tel_no_1_3);
		cstmt.setString(30, dm.tel_no_2_0);
		cstmt.setString(31, dm.tel_no_2_1);
		cstmt.setString(32, dm.tel_no_2_2);
		cstmt.setString(33, dm.tel_no_2_3);
		cstmt.setString(34, dm.bo_zip_1);
		cstmt.setString(35, dm.bo_zip_2);
		cstmt.setString(36, dm.bo_addr);
		cstmt.setString(37, dm.bo_dtls_addr);
		cstmt.setString(38, dm.jd_zip_1);
		cstmt.setString(39, dm.jd_zip_2);
		cstmt.setString(40, dm.jd_addr);
		cstmt.setString(41, dm.jd_dtls_addr);
		cstmt.setString(42, dm.bo_jurs_nwsp_zip_1);
		cstmt.setString(43, dm.bo_jurs_nwsp_zip_2);
		cstmt.setString(44, dm.bo_jurs_nwsp_addr);
		cstmt.setString(45, dm.bo_feat_clsf);
		cstmt.setString(46, dm.bo_mang_grad_clas);
		cstmt.setString(47, dm.stmt_crte_clsf);
		cstmt.setString(48, dm.jd_sell_net_clsf);
		cstmt.setString(49, dm.qty_sell_net_clsf);
		cstmt.setString(50, dm.invsg_obj_bo);
		cstmt.setString(51, dm.jd_clam);
		cstmt.setString(52, dm.clam_grp);
		cstmt.setString(53, dm.add_snd_bo_cd);
		cstmt.setString(54, dm.add_snd_bo_seq);
		cstmt.setString(55, dm.adms_dstc_cd);
		cstmt.setString(56, dm.adms_unit_clsf);
		cstmt.setString(57, dm.sido_gugun_cd);
		cstmt.setString(58, dm.bo_mang_type);
		cstmt.setString(59, dm.dmang_yn);
		cstmt.setString(60, dm.incmgpers);
		cstmt.setString(61, dm.incmg_pers_ip);
		cstmt.setString(62, dm.bo_reg_clsf);
		cstmt.setString(63, dm.elec_tax_stmt_yn);
		cstmt.setString(64, dm.email);
		cstmt.setString(65, dm.bogurt_clsf);
		cstmt.registerOutParameter(66, Types.VARCHAR);
		cstmt.registerOutParameter(67, Types.VARCHAR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.se.boi.ds.SE_BOI_1060_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("accflag = [" + getAccflag() + "]");
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("orgn_clsf = [" + getOrgn_clsf() + "]");
		System.out.println("bo_cd = [" + getBo_cd() + "]");
		System.out.println("bo_seq = [" + getBo_seq() + "]");
		System.out.println("bo_nm = [" + getBo_nm() + "]");
		System.out.println("area_cd = [" + getArea_cd() + "]");
		System.out.println("srt_seq = [" + getSrt_seq() + "]");
		System.out.println("div_motr_bo_cd = [" + getDiv_motr_bo_cd() + "]");
		System.out.println("div_motr_bo_seq = [" + getDiv_motr_bo_seq() + "]");
		System.out.println("ref_bo_cd = [" + getRef_bo_cd() + "]");
		System.out.println("ref_bo_seq = [" + getRef_bo_seq() + "]");
		System.out.println("chrg_pers = [" + getChrg_pers() + "]");
		System.out.println("bo_cntr_dt = [" + getBo_cntr_dt() + "]");
		System.out.println("bo_expy_dt = [" + getBo_expy_dt() + "]");
		System.out.println("bo_spcf_clsf = [" + getBo_spcf_clsf() + "]");
		System.out.println("cntr_doc_1 = [" + getCntr_doc_1() + "]");
		System.out.println("cntr_doc_2 = [" + getCntr_doc_2() + "]");
		System.out.println("cntr_stat_clsf = [" + getCntr_stat_clsf() + "]");
		System.out.println("jont_debtgurt_limt_amt = [" + getJont_debtgurt_limt_amt() + "]");
		System.out.println("dlco_no = [" + getDlco_no() + "]");
		System.out.println("bo_head_nm = [" + getBo_head_nm() + "]");
		System.out.println("bo_head_prn = [" + getBo_head_prn() + "]");
		System.out.println("tel_no_1_0 = [" + getTel_no_1_0() + "]");
		System.out.println("tel_no_1_1 = [" + getTel_no_1_1() + "]");
		System.out.println("tel_no_1_2 = [" + getTel_no_1_2() + "]");
		System.out.println("tel_no_1_3 = [" + getTel_no_1_3() + "]");
		System.out.println("tel_no_2_0 = [" + getTel_no_2_0() + "]");
		System.out.println("tel_no_2_1 = [" + getTel_no_2_1() + "]");
		System.out.println("tel_no_2_2 = [" + getTel_no_2_2() + "]");
		System.out.println("tel_no_2_3 = [" + getTel_no_2_3() + "]");
		System.out.println("bo_zip_1 = [" + getBo_zip_1() + "]");
		System.out.println("bo_zip_2 = [" + getBo_zip_2() + "]");
		System.out.println("bo_addr = [" + getBo_addr() + "]");
		System.out.println("bo_dtls_addr = [" + getBo_dtls_addr() + "]");
		System.out.println("jd_zip_1 = [" + getJd_zip_1() + "]");
		System.out.println("jd_zip_2 = [" + getJd_zip_2() + "]");
		System.out.println("jd_addr = [" + getJd_addr() + "]");
		System.out.println("jd_dtls_addr = [" + getJd_dtls_addr() + "]");
		System.out.println("bo_jurs_nwsp_zip_1 = [" + getBo_jurs_nwsp_zip_1() + "]");
		System.out.println("bo_jurs_nwsp_zip_2 = [" + getBo_jurs_nwsp_zip_2() + "]");
		System.out.println("bo_jurs_nwsp_addr = [" + getBo_jurs_nwsp_addr() + "]");
		System.out.println("bo_feat_clsf = [" + getBo_feat_clsf() + "]");
		System.out.println("bo_mang_grad_clas = [" + getBo_mang_grad_clas() + "]");
		System.out.println("stmt_crte_clsf = [" + getStmt_crte_clsf() + "]");
		System.out.println("jd_sell_net_clsf = [" + getJd_sell_net_clsf() + "]");
		System.out.println("qty_sell_net_clsf = [" + getQty_sell_net_clsf() + "]");
		System.out.println("invsg_obj_bo = [" + getInvsg_obj_bo() + "]");
		System.out.println("jd_clam = [" + getJd_clam() + "]");
		System.out.println("clam_grp = [" + getClam_grp() + "]");
		System.out.println("add_snd_bo_cd = [" + getAdd_snd_bo_cd() + "]");
		System.out.println("add_snd_bo_seq = [" + getAdd_snd_bo_seq() + "]");
		System.out.println("adms_dstc_cd = [" + getAdms_dstc_cd() + "]");
		System.out.println("adms_unit_clsf = [" + getAdms_unit_clsf() + "]");
		System.out.println("sido_gugun_cd = [" + getSido_gugun_cd() + "]");
		System.out.println("bo_mang_type = [" + getBo_mang_type() + "]");
		System.out.println("dmang_yn = [" + getDmang_yn() + "]");
		System.out.println("incmgpers = [" + getIncmgpers() + "]");
		System.out.println("incmg_pers_ip = [" + getIncmg_pers_ip() + "]");
		System.out.println("bo_reg_clsf = [" + getBo_reg_clsf() + "]");
		System.out.println("elec_tax_stmt_yn = [" + getElec_tax_stmt_yn() + "]");
		System.out.println("email = [" + getEmail() + "]");
		System.out.println("bogurt_clsf = [" + getBogurt_clsf() + "]");
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String accflag = req.getParameter("accflag");
if( accflag == null){
	System.out.println(this.toString+" : accflag is null" );
}else{
	System.out.println(this.toString+" : accflag is "+accflag );
}
String cmpy_cd = req.getParameter("cmpy_cd");
if( cmpy_cd == null){
	System.out.println(this.toString+" : cmpy_cd is null" );
}else{
	System.out.println(this.toString+" : cmpy_cd is "+cmpy_cd );
}
String orgn_clsf = req.getParameter("orgn_clsf");
if( orgn_clsf == null){
	System.out.println(this.toString+" : orgn_clsf is null" );
}else{
	System.out.println(this.toString+" : orgn_clsf is "+orgn_clsf );
}
String bo_cd = req.getParameter("bo_cd");
if( bo_cd == null){
	System.out.println(this.toString+" : bo_cd is null" );
}else{
	System.out.println(this.toString+" : bo_cd is "+bo_cd );
}
String bo_seq = req.getParameter("bo_seq");
if( bo_seq == null){
	System.out.println(this.toString+" : bo_seq is null" );
}else{
	System.out.println(this.toString+" : bo_seq is "+bo_seq );
}
String bo_nm = req.getParameter("bo_nm");
if( bo_nm == null){
	System.out.println(this.toString+" : bo_nm is null" );
}else{
	System.out.println(this.toString+" : bo_nm is "+bo_nm );
}
String area_cd = req.getParameter("area_cd");
if( area_cd == null){
	System.out.println(this.toString+" : area_cd is null" );
}else{
	System.out.println(this.toString+" : area_cd is "+area_cd );
}
String srt_seq = req.getParameter("srt_seq");
if( srt_seq == null){
	System.out.println(this.toString+" : srt_seq is null" );
}else{
	System.out.println(this.toString+" : srt_seq is "+srt_seq );
}
String div_motr_bo_cd = req.getParameter("div_motr_bo_cd");
if( div_motr_bo_cd == null){
	System.out.println(this.toString+" : div_motr_bo_cd is null" );
}else{
	System.out.println(this.toString+" : div_motr_bo_cd is "+div_motr_bo_cd );
}
String div_motr_bo_seq = req.getParameter("div_motr_bo_seq");
if( div_motr_bo_seq == null){
	System.out.println(this.toString+" : div_motr_bo_seq is null" );
}else{
	System.out.println(this.toString+" : div_motr_bo_seq is "+div_motr_bo_seq );
}
String ref_bo_cd = req.getParameter("ref_bo_cd");
if( ref_bo_cd == null){
	System.out.println(this.toString+" : ref_bo_cd is null" );
}else{
	System.out.println(this.toString+" : ref_bo_cd is "+ref_bo_cd );
}
String ref_bo_seq = req.getParameter("ref_bo_seq");
if( ref_bo_seq == null){
	System.out.println(this.toString+" : ref_bo_seq is null" );
}else{
	System.out.println(this.toString+" : ref_bo_seq is "+ref_bo_seq );
}
String chrg_pers = req.getParameter("chrg_pers");
if( chrg_pers == null){
	System.out.println(this.toString+" : chrg_pers is null" );
}else{
	System.out.println(this.toString+" : chrg_pers is "+chrg_pers );
}
String bo_cntr_dt = req.getParameter("bo_cntr_dt");
if( bo_cntr_dt == null){
	System.out.println(this.toString+" : bo_cntr_dt is null" );
}else{
	System.out.println(this.toString+" : bo_cntr_dt is "+bo_cntr_dt );
}
String bo_expy_dt = req.getParameter("bo_expy_dt");
if( bo_expy_dt == null){
	System.out.println(this.toString+" : bo_expy_dt is null" );
}else{
	System.out.println(this.toString+" : bo_expy_dt is "+bo_expy_dt );
}
String bo_spcf_clsf = req.getParameter("bo_spcf_clsf");
if( bo_spcf_clsf == null){
	System.out.println(this.toString+" : bo_spcf_clsf is null" );
}else{
	System.out.println(this.toString+" : bo_spcf_clsf is "+bo_spcf_clsf );
}
String cntr_doc_1 = req.getParameter("cntr_doc_1");
if( cntr_doc_1 == null){
	System.out.println(this.toString+" : cntr_doc_1 is null" );
}else{
	System.out.println(this.toString+" : cntr_doc_1 is "+cntr_doc_1 );
}
String cntr_doc_2 = req.getParameter("cntr_doc_2");
if( cntr_doc_2 == null){
	System.out.println(this.toString+" : cntr_doc_2 is null" );
}else{
	System.out.println(this.toString+" : cntr_doc_2 is "+cntr_doc_2 );
}
String cntr_stat_clsf = req.getParameter("cntr_stat_clsf");
if( cntr_stat_clsf == null){
	System.out.println(this.toString+" : cntr_stat_clsf is null" );
}else{
	System.out.println(this.toString+" : cntr_stat_clsf is "+cntr_stat_clsf );
}
String jont_debtgurt_limt_amt = req.getParameter("jont_debtgurt_limt_amt");
if( jont_debtgurt_limt_amt == null){
	System.out.println(this.toString+" : jont_debtgurt_limt_amt is null" );
}else{
	System.out.println(this.toString+" : jont_debtgurt_limt_amt is "+jont_debtgurt_limt_amt );
}
String dlco_no = req.getParameter("dlco_no");
if( dlco_no == null){
	System.out.println(this.toString+" : dlco_no is null" );
}else{
	System.out.println(this.toString+" : dlco_no is "+dlco_no );
}
String bo_head_nm = req.getParameter("bo_head_nm");
if( bo_head_nm == null){
	System.out.println(this.toString+" : bo_head_nm is null" );
}else{
	System.out.println(this.toString+" : bo_head_nm is "+bo_head_nm );
}
String bo_head_prn = req.getParameter("bo_head_prn");
if( bo_head_prn == null){
	System.out.println(this.toString+" : bo_head_prn is null" );
}else{
	System.out.println(this.toString+" : bo_head_prn is "+bo_head_prn );
}
String tel_no_1_0 = req.getParameter("tel_no_1_0");
if( tel_no_1_0 == null){
	System.out.println(this.toString+" : tel_no_1_0 is null" );
}else{
	System.out.println(this.toString+" : tel_no_1_0 is "+tel_no_1_0 );
}
String tel_no_1_1 = req.getParameter("tel_no_1_1");
if( tel_no_1_1 == null){
	System.out.println(this.toString+" : tel_no_1_1 is null" );
}else{
	System.out.println(this.toString+" : tel_no_1_1 is "+tel_no_1_1 );
}
String tel_no_1_2 = req.getParameter("tel_no_1_2");
if( tel_no_1_2 == null){
	System.out.println(this.toString+" : tel_no_1_2 is null" );
}else{
	System.out.println(this.toString+" : tel_no_1_2 is "+tel_no_1_2 );
}
String tel_no_1_3 = req.getParameter("tel_no_1_3");
if( tel_no_1_3 == null){
	System.out.println(this.toString+" : tel_no_1_3 is null" );
}else{
	System.out.println(this.toString+" : tel_no_1_3 is "+tel_no_1_3 );
}
String tel_no_2_0 = req.getParameter("tel_no_2_0");
if( tel_no_2_0 == null){
	System.out.println(this.toString+" : tel_no_2_0 is null" );
}else{
	System.out.println(this.toString+" : tel_no_2_0 is "+tel_no_2_0 );
}
String tel_no_2_1 = req.getParameter("tel_no_2_1");
if( tel_no_2_1 == null){
	System.out.println(this.toString+" : tel_no_2_1 is null" );
}else{
	System.out.println(this.toString+" : tel_no_2_1 is "+tel_no_2_1 );
}
String tel_no_2_2 = req.getParameter("tel_no_2_2");
if( tel_no_2_2 == null){
	System.out.println(this.toString+" : tel_no_2_2 is null" );
}else{
	System.out.println(this.toString+" : tel_no_2_2 is "+tel_no_2_2 );
}
String tel_no_2_3 = req.getParameter("tel_no_2_3");
if( tel_no_2_3 == null){
	System.out.println(this.toString+" : tel_no_2_3 is null" );
}else{
	System.out.println(this.toString+" : tel_no_2_3 is "+tel_no_2_3 );
}
String bo_zip_1 = req.getParameter("bo_zip_1");
if( bo_zip_1 == null){
	System.out.println(this.toString+" : bo_zip_1 is null" );
}else{
	System.out.println(this.toString+" : bo_zip_1 is "+bo_zip_1 );
}
String bo_zip_2 = req.getParameter("bo_zip_2");
if( bo_zip_2 == null){
	System.out.println(this.toString+" : bo_zip_2 is null" );
}else{
	System.out.println(this.toString+" : bo_zip_2 is "+bo_zip_2 );
}
String bo_addr = req.getParameter("bo_addr");
if( bo_addr == null){
	System.out.println(this.toString+" : bo_addr is null" );
}else{
	System.out.println(this.toString+" : bo_addr is "+bo_addr );
}
String bo_dtls_addr = req.getParameter("bo_dtls_addr");
if( bo_dtls_addr == null){
	System.out.println(this.toString+" : bo_dtls_addr is null" );
}else{
	System.out.println(this.toString+" : bo_dtls_addr is "+bo_dtls_addr );
}
String jd_zip_1 = req.getParameter("jd_zip_1");
if( jd_zip_1 == null){
	System.out.println(this.toString+" : jd_zip_1 is null" );
}else{
	System.out.println(this.toString+" : jd_zip_1 is "+jd_zip_1 );
}
String jd_zip_2 = req.getParameter("jd_zip_2");
if( jd_zip_2 == null){
	System.out.println(this.toString+" : jd_zip_2 is null" );
}else{
	System.out.println(this.toString+" : jd_zip_2 is "+jd_zip_2 );
}
String jd_addr = req.getParameter("jd_addr");
if( jd_addr == null){
	System.out.println(this.toString+" : jd_addr is null" );
}else{
	System.out.println(this.toString+" : jd_addr is "+jd_addr );
}
String jd_dtls_addr = req.getParameter("jd_dtls_addr");
if( jd_dtls_addr == null){
	System.out.println(this.toString+" : jd_dtls_addr is null" );
}else{
	System.out.println(this.toString+" : jd_dtls_addr is "+jd_dtls_addr );
}
String bo_jurs_nwsp_zip_1 = req.getParameter("bo_jurs_nwsp_zip_1");
if( bo_jurs_nwsp_zip_1 == null){
	System.out.println(this.toString+" : bo_jurs_nwsp_zip_1 is null" );
}else{
	System.out.println(this.toString+" : bo_jurs_nwsp_zip_1 is "+bo_jurs_nwsp_zip_1 );
}
String bo_jurs_nwsp_zip_2 = req.getParameter("bo_jurs_nwsp_zip_2");
if( bo_jurs_nwsp_zip_2 == null){
	System.out.println(this.toString+" : bo_jurs_nwsp_zip_2 is null" );
}else{
	System.out.println(this.toString+" : bo_jurs_nwsp_zip_2 is "+bo_jurs_nwsp_zip_2 );
}
String bo_jurs_nwsp_addr = req.getParameter("bo_jurs_nwsp_addr");
if( bo_jurs_nwsp_addr == null){
	System.out.println(this.toString+" : bo_jurs_nwsp_addr is null" );
}else{
	System.out.println(this.toString+" : bo_jurs_nwsp_addr is "+bo_jurs_nwsp_addr );
}
String bo_feat_clsf = req.getParameter("bo_feat_clsf");
if( bo_feat_clsf == null){
	System.out.println(this.toString+" : bo_feat_clsf is null" );
}else{
	System.out.println(this.toString+" : bo_feat_clsf is "+bo_feat_clsf );
}
String bo_mang_grad_clas = req.getParameter("bo_mang_grad_clas");
if( bo_mang_grad_clas == null){
	System.out.println(this.toString+" : bo_mang_grad_clas is null" );
}else{
	System.out.println(this.toString+" : bo_mang_grad_clas is "+bo_mang_grad_clas );
}
String stmt_crte_clsf = req.getParameter("stmt_crte_clsf");
if( stmt_crte_clsf == null){
	System.out.println(this.toString+" : stmt_crte_clsf is null" );
}else{
	System.out.println(this.toString+" : stmt_crte_clsf is "+stmt_crte_clsf );
}
String jd_sell_net_clsf = req.getParameter("jd_sell_net_clsf");
if( jd_sell_net_clsf == null){
	System.out.println(this.toString+" : jd_sell_net_clsf is null" );
}else{
	System.out.println(this.toString+" : jd_sell_net_clsf is "+jd_sell_net_clsf );
}
String qty_sell_net_clsf = req.getParameter("qty_sell_net_clsf");
if( qty_sell_net_clsf == null){
	System.out.println(this.toString+" : qty_sell_net_clsf is null" );
}else{
	System.out.println(this.toString+" : qty_sell_net_clsf is "+qty_sell_net_clsf );
}
String invsg_obj_bo = req.getParameter("invsg_obj_bo");
if( invsg_obj_bo == null){
	System.out.println(this.toString+" : invsg_obj_bo is null" );
}else{
	System.out.println(this.toString+" : invsg_obj_bo is "+invsg_obj_bo );
}
String jd_clam = req.getParameter("jd_clam");
if( jd_clam == null){
	System.out.println(this.toString+" : jd_clam is null" );
}else{
	System.out.println(this.toString+" : jd_clam is "+jd_clam );
}
String clam_grp = req.getParameter("clam_grp");
if( clam_grp == null){
	System.out.println(this.toString+" : clam_grp is null" );
}else{
	System.out.println(this.toString+" : clam_grp is "+clam_grp );
}
String add_snd_bo_cd = req.getParameter("add_snd_bo_cd");
if( add_snd_bo_cd == null){
	System.out.println(this.toString+" : add_snd_bo_cd is null" );
}else{
	System.out.println(this.toString+" : add_snd_bo_cd is "+add_snd_bo_cd );
}
String add_snd_bo_seq = req.getParameter("add_snd_bo_seq");
if( add_snd_bo_seq == null){
	System.out.println(this.toString+" : add_snd_bo_seq is null" );
}else{
	System.out.println(this.toString+" : add_snd_bo_seq is "+add_snd_bo_seq );
}
String adms_dstc_cd = req.getParameter("adms_dstc_cd");
if( adms_dstc_cd == null){
	System.out.println(this.toString+" : adms_dstc_cd is null" );
}else{
	System.out.println(this.toString+" : adms_dstc_cd is "+adms_dstc_cd );
}
String adms_unit_clsf = req.getParameter("adms_unit_clsf");
if( adms_unit_clsf == null){
	System.out.println(this.toString+" : adms_unit_clsf is null" );
}else{
	System.out.println(this.toString+" : adms_unit_clsf is "+adms_unit_clsf );
}
String sido_gugun_cd = req.getParameter("sido_gugun_cd");
if( sido_gugun_cd == null){
	System.out.println(this.toString+" : sido_gugun_cd is null" );
}else{
	System.out.println(this.toString+" : sido_gugun_cd is "+sido_gugun_cd );
}
String bo_mang_type = req.getParameter("bo_mang_type");
if( bo_mang_type == null){
	System.out.println(this.toString+" : bo_mang_type is null" );
}else{
	System.out.println(this.toString+" : bo_mang_type is "+bo_mang_type );
}
String dmang_yn = req.getParameter("dmang_yn");
if( dmang_yn == null){
	System.out.println(this.toString+" : dmang_yn is null" );
}else{
	System.out.println(this.toString+" : dmang_yn is "+dmang_yn );
}
String incmgpers = req.getParameter("incmgpers");
if( incmgpers == null){
	System.out.println(this.toString+" : incmgpers is null" );
}else{
	System.out.println(this.toString+" : incmgpers is "+incmgpers );
}
String incmg_pers_ip = req.getParameter("incmg_pers_ip");
if( incmg_pers_ip == null){
	System.out.println(this.toString+" : incmg_pers_ip is null" );
}else{
	System.out.println(this.toString+" : incmg_pers_ip is "+incmg_pers_ip );
}
String bo_reg_clsf = req.getParameter("bo_reg_clsf");
if( bo_reg_clsf == null){
	System.out.println(this.toString+" : bo_reg_clsf is null" );
}else{
	System.out.println(this.toString+" : bo_reg_clsf is "+bo_reg_clsf );
}
String elec_tax_stmt_yn = req.getParameter("elec_tax_stmt_yn");
if( elec_tax_stmt_yn == null){
	System.out.println(this.toString+" : elec_tax_stmt_yn is null" );
}else{
	System.out.println(this.toString+" : elec_tax_stmt_yn is "+elec_tax_stmt_yn );
}
String email = req.getParameter("email");
if( email == null){
	System.out.println(this.toString+" : email is null" );
}else{
	System.out.println(this.toString+" : email is "+email );
}
String bogurt_clsf = req.getParameter("bogurt_clsf");
if( bogurt_clsf == null){
	System.out.println(this.toString+" : bogurt_clsf is null" );
}else{
	System.out.println(this.toString+" : bogurt_clsf is "+bogurt_clsf );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String accflag = Util.checkString(req.getParameter("accflag"));
String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String orgn_clsf = Util.checkString(req.getParameter("orgn_clsf"));
String bo_cd = Util.checkString(req.getParameter("bo_cd"));
String bo_seq = Util.checkString(req.getParameter("bo_seq"));
String bo_nm = Util.checkString(req.getParameter("bo_nm"));
String area_cd = Util.checkString(req.getParameter("area_cd"));
String srt_seq = Util.checkString(req.getParameter("srt_seq"));
String div_motr_bo_cd = Util.checkString(req.getParameter("div_motr_bo_cd"));
String div_motr_bo_seq = Util.checkString(req.getParameter("div_motr_bo_seq"));
String ref_bo_cd = Util.checkString(req.getParameter("ref_bo_cd"));
String ref_bo_seq = Util.checkString(req.getParameter("ref_bo_seq"));
String chrg_pers = Util.checkString(req.getParameter("chrg_pers"));
String bo_cntr_dt = Util.checkString(req.getParameter("bo_cntr_dt"));
String bo_expy_dt = Util.checkString(req.getParameter("bo_expy_dt"));
String bo_spcf_clsf = Util.checkString(req.getParameter("bo_spcf_clsf"));
String cntr_doc_1 = Util.checkString(req.getParameter("cntr_doc_1"));
String cntr_doc_2 = Util.checkString(req.getParameter("cntr_doc_2"));
String cntr_stat_clsf = Util.checkString(req.getParameter("cntr_stat_clsf"));
String jont_debtgurt_limt_amt = Util.checkString(req.getParameter("jont_debtgurt_limt_amt"));
String dlco_no = Util.checkString(req.getParameter("dlco_no"));
String bo_head_nm = Util.checkString(req.getParameter("bo_head_nm"));
String bo_head_prn = Util.checkString(req.getParameter("bo_head_prn"));
String tel_no_1_0 = Util.checkString(req.getParameter("tel_no_1_0"));
String tel_no_1_1 = Util.checkString(req.getParameter("tel_no_1_1"));
String tel_no_1_2 = Util.checkString(req.getParameter("tel_no_1_2"));
String tel_no_1_3 = Util.checkString(req.getParameter("tel_no_1_3"));
String tel_no_2_0 = Util.checkString(req.getParameter("tel_no_2_0"));
String tel_no_2_1 = Util.checkString(req.getParameter("tel_no_2_1"));
String tel_no_2_2 = Util.checkString(req.getParameter("tel_no_2_2"));
String tel_no_2_3 = Util.checkString(req.getParameter("tel_no_2_3"));
String bo_zip_1 = Util.checkString(req.getParameter("bo_zip_1"));
String bo_zip_2 = Util.checkString(req.getParameter("bo_zip_2"));
String bo_addr = Util.checkString(req.getParameter("bo_addr"));
String bo_dtls_addr = Util.checkString(req.getParameter("bo_dtls_addr"));
String jd_zip_1 = Util.checkString(req.getParameter("jd_zip_1"));
String jd_zip_2 = Util.checkString(req.getParameter("jd_zip_2"));
String jd_addr = Util.checkString(req.getParameter("jd_addr"));
String jd_dtls_addr = Util.checkString(req.getParameter("jd_dtls_addr"));
String bo_jurs_nwsp_zip_1 = Util.checkString(req.getParameter("bo_jurs_nwsp_zip_1"));
String bo_jurs_nwsp_zip_2 = Util.checkString(req.getParameter("bo_jurs_nwsp_zip_2"));
String bo_jurs_nwsp_addr = Util.checkString(req.getParameter("bo_jurs_nwsp_addr"));
String bo_feat_clsf = Util.checkString(req.getParameter("bo_feat_clsf"));
String bo_mang_grad_clas = Util.checkString(req.getParameter("bo_mang_grad_clas"));
String stmt_crte_clsf = Util.checkString(req.getParameter("stmt_crte_clsf"));
String jd_sell_net_clsf = Util.checkString(req.getParameter("jd_sell_net_clsf"));
String qty_sell_net_clsf = Util.checkString(req.getParameter("qty_sell_net_clsf"));
String invsg_obj_bo = Util.checkString(req.getParameter("invsg_obj_bo"));
String jd_clam = Util.checkString(req.getParameter("jd_clam"));
String clam_grp = Util.checkString(req.getParameter("clam_grp"));
String add_snd_bo_cd = Util.checkString(req.getParameter("add_snd_bo_cd"));
String add_snd_bo_seq = Util.checkString(req.getParameter("add_snd_bo_seq"));
String adms_dstc_cd = Util.checkString(req.getParameter("adms_dstc_cd"));
String adms_unit_clsf = Util.checkString(req.getParameter("adms_unit_clsf"));
String sido_gugun_cd = Util.checkString(req.getParameter("sido_gugun_cd"));
String bo_mang_type = Util.checkString(req.getParameter("bo_mang_type"));
String dmang_yn = Util.checkString(req.getParameter("dmang_yn"));
String incmgpers = Util.checkString(req.getParameter("incmgpers"));
String incmg_pers_ip = Util.checkString(req.getParameter("incmg_pers_ip"));
String bo_reg_clsf = Util.checkString(req.getParameter("bo_reg_clsf"));
String elec_tax_stmt_yn = Util.checkString(req.getParameter("elec_tax_stmt_yn"));
String email = Util.checkString(req.getParameter("email"));
String bogurt_clsf = Util.checkString(req.getParameter("bogurt_clsf"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String accflag = Util.Uni2Ksc(Util.checkString(req.getParameter("accflag")));
String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String orgn_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("orgn_clsf")));
String bo_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("bo_cd")));
String bo_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("bo_seq")));
String bo_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("bo_nm")));
String area_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("area_cd")));
String srt_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("srt_seq")));
String div_motr_bo_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("div_motr_bo_cd")));
String div_motr_bo_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("div_motr_bo_seq")));
String ref_bo_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("ref_bo_cd")));
String ref_bo_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("ref_bo_seq")));
String chrg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("chrg_pers")));
String bo_cntr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("bo_cntr_dt")));
String bo_expy_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("bo_expy_dt")));
String bo_spcf_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("bo_spcf_clsf")));
String cntr_doc_1 = Util.Uni2Ksc(Util.checkString(req.getParameter("cntr_doc_1")));
String cntr_doc_2 = Util.Uni2Ksc(Util.checkString(req.getParameter("cntr_doc_2")));
String cntr_stat_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("cntr_stat_clsf")));
String jont_debtgurt_limt_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("jont_debtgurt_limt_amt")));
String dlco_no = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_no")));
String bo_head_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("bo_head_nm")));
String bo_head_prn = Util.Uni2Ksc(Util.checkString(req.getParameter("bo_head_prn")));
String tel_no_1_0 = Util.Uni2Ksc(Util.checkString(req.getParameter("tel_no_1_0")));
String tel_no_1_1 = Util.Uni2Ksc(Util.checkString(req.getParameter("tel_no_1_1")));
String tel_no_1_2 = Util.Uni2Ksc(Util.checkString(req.getParameter("tel_no_1_2")));
String tel_no_1_3 = Util.Uni2Ksc(Util.checkString(req.getParameter("tel_no_1_3")));
String tel_no_2_0 = Util.Uni2Ksc(Util.checkString(req.getParameter("tel_no_2_0")));
String tel_no_2_1 = Util.Uni2Ksc(Util.checkString(req.getParameter("tel_no_2_1")));
String tel_no_2_2 = Util.Uni2Ksc(Util.checkString(req.getParameter("tel_no_2_2")));
String tel_no_2_3 = Util.Uni2Ksc(Util.checkString(req.getParameter("tel_no_2_3")));
String bo_zip_1 = Util.Uni2Ksc(Util.checkString(req.getParameter("bo_zip_1")));
String bo_zip_2 = Util.Uni2Ksc(Util.checkString(req.getParameter("bo_zip_2")));
String bo_addr = Util.Uni2Ksc(Util.checkString(req.getParameter("bo_addr")));
String bo_dtls_addr = Util.Uni2Ksc(Util.checkString(req.getParameter("bo_dtls_addr")));
String jd_zip_1 = Util.Uni2Ksc(Util.checkString(req.getParameter("jd_zip_1")));
String jd_zip_2 = Util.Uni2Ksc(Util.checkString(req.getParameter("jd_zip_2")));
String jd_addr = Util.Uni2Ksc(Util.checkString(req.getParameter("jd_addr")));
String jd_dtls_addr = Util.Uni2Ksc(Util.checkString(req.getParameter("jd_dtls_addr")));
String bo_jurs_nwsp_zip_1 = Util.Uni2Ksc(Util.checkString(req.getParameter("bo_jurs_nwsp_zip_1")));
String bo_jurs_nwsp_zip_2 = Util.Uni2Ksc(Util.checkString(req.getParameter("bo_jurs_nwsp_zip_2")));
String bo_jurs_nwsp_addr = Util.Uni2Ksc(Util.checkString(req.getParameter("bo_jurs_nwsp_addr")));
String bo_feat_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("bo_feat_clsf")));
String bo_mang_grad_clas = Util.Uni2Ksc(Util.checkString(req.getParameter("bo_mang_grad_clas")));
String stmt_crte_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("stmt_crte_clsf")));
String jd_sell_net_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("jd_sell_net_clsf")));
String qty_sell_net_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("qty_sell_net_clsf")));
String invsg_obj_bo = Util.Uni2Ksc(Util.checkString(req.getParameter("invsg_obj_bo")));
String jd_clam = Util.Uni2Ksc(Util.checkString(req.getParameter("jd_clam")));
String clam_grp = Util.Uni2Ksc(Util.checkString(req.getParameter("clam_grp")));
String add_snd_bo_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("add_snd_bo_cd")));
String add_snd_bo_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("add_snd_bo_seq")));
String adms_dstc_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("adms_dstc_cd")));
String adms_unit_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("adms_unit_clsf")));
String sido_gugun_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("sido_gugun_cd")));
String bo_mang_type = Util.Uni2Ksc(Util.checkString(req.getParameter("bo_mang_type")));
String dmang_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("dmang_yn")));
String incmgpers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmgpers")));
String incmg_pers_ip = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ip")));
String bo_reg_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("bo_reg_clsf")));
String elec_tax_stmt_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("elec_tax_stmt_yn")));
String email = Util.Uni2Ksc(Util.checkString(req.getParameter("email")));
String bogurt_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("bogurt_clsf")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setAccflag(accflag);
dm.setCmpy_cd(cmpy_cd);
dm.setOrgn_clsf(orgn_clsf);
dm.setBo_cd(bo_cd);
dm.setBo_seq(bo_seq);
dm.setBo_nm(bo_nm);
dm.setArea_cd(area_cd);
dm.setSrt_seq(srt_seq);
dm.setDiv_motr_bo_cd(div_motr_bo_cd);
dm.setDiv_motr_bo_seq(div_motr_bo_seq);
dm.setRef_bo_cd(ref_bo_cd);
dm.setRef_bo_seq(ref_bo_seq);
dm.setChrg_pers(chrg_pers);
dm.setBo_cntr_dt(bo_cntr_dt);
dm.setBo_expy_dt(bo_expy_dt);
dm.setBo_spcf_clsf(bo_spcf_clsf);
dm.setCntr_doc_1(cntr_doc_1);
dm.setCntr_doc_2(cntr_doc_2);
dm.setCntr_stat_clsf(cntr_stat_clsf);
dm.setJont_debtgurt_limt_amt(jont_debtgurt_limt_amt);
dm.setDlco_no(dlco_no);
dm.setBo_head_nm(bo_head_nm);
dm.setBo_head_prn(bo_head_prn);
dm.setTel_no_1_0(tel_no_1_0);
dm.setTel_no_1_1(tel_no_1_1);
dm.setTel_no_1_2(tel_no_1_2);
dm.setTel_no_1_3(tel_no_1_3);
dm.setTel_no_2_0(tel_no_2_0);
dm.setTel_no_2_1(tel_no_2_1);
dm.setTel_no_2_2(tel_no_2_2);
dm.setTel_no_2_3(tel_no_2_3);
dm.setBo_zip_1(bo_zip_1);
dm.setBo_zip_2(bo_zip_2);
dm.setBo_addr(bo_addr);
dm.setBo_dtls_addr(bo_dtls_addr);
dm.setJd_zip_1(jd_zip_1);
dm.setJd_zip_2(jd_zip_2);
dm.setJd_addr(jd_addr);
dm.setJd_dtls_addr(jd_dtls_addr);
dm.setBo_jurs_nwsp_zip_1(bo_jurs_nwsp_zip_1);
dm.setBo_jurs_nwsp_zip_2(bo_jurs_nwsp_zip_2);
dm.setBo_jurs_nwsp_addr(bo_jurs_nwsp_addr);
dm.setBo_feat_clsf(bo_feat_clsf);
dm.setBo_mang_grad_clas(bo_mang_grad_clas);
dm.setStmt_crte_clsf(stmt_crte_clsf);
dm.setJd_sell_net_clsf(jd_sell_net_clsf);
dm.setQty_sell_net_clsf(qty_sell_net_clsf);
dm.setInvsg_obj_bo(invsg_obj_bo);
dm.setJd_clam(jd_clam);
dm.setClam_grp(clam_grp);
dm.setAdd_snd_bo_cd(add_snd_bo_cd);
dm.setAdd_snd_bo_seq(add_snd_bo_seq);
dm.setAdms_dstc_cd(adms_dstc_cd);
dm.setAdms_unit_clsf(adms_unit_clsf);
dm.setSido_gugun_cd(sido_gugun_cd);
dm.setBo_mang_type(bo_mang_type);
dm.setDmang_yn(dmang_yn);
dm.setIncmgpers(incmgpers);
dm.setIncmg_pers_ip(incmg_pers_ip);
dm.setBo_reg_clsf(bo_reg_clsf);
dm.setElec_tax_stmt_yn(elec_tax_stmt_yn);
dm.setEmail(email);
dm.setBogurt_clsf(bogurt_clsf);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Oct 31 15:35:15 KST 2016 */
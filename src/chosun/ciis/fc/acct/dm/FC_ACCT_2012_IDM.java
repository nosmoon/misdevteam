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


package chosun.ciis.fc.acct.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.fc.acct.ds.*;
import chosun.ciis.fc.acct.rec.*;

/**
 * 
 */


public class FC_ACCT_2012_IDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String inupd_flag;
	public String cmpy_cd;
	public String slip_occr_dt;
	public String slip_clsf_cd;
	public String slip_seq;
	public String rece_exp_aplc_yn;
	public String titl;
	public String reso_amt;
	public String expn_hope_dt;
	public String expn_clsf;
	public String clam_dept_cd;
	public String evnt_cd;
	public String budg_yymm;
	public String chrg_emp_no;
	public String chg_pers;
	public String incmg_pers_ipadd;
	public String slip_sub_seq;
	public String slip_arow_no;
	public String budg_cd;
	public String use_dept_cd;
	public String rmks2;
	public String dlco_clsf_cd;
	public String dlco_cd;
	public String dlco_nm;
	public String boks_dlco_nm;
	public String mang_clsf_cd;
	public String mang_no;
	public String incm_clsf_cd;
	public String etc_in;
	public String setoff_slip_occr_dt;
	public String medi_cd;
	public String dtls_medi_cd;
	public String comp_dt;
	public String mtry_dt;
	public String unit;
	public String qunt;
	public String tax_stmt_no;
	public String make_dt;
	public String erplace_cd;
	public String ern;
	public String tax_suply_amt;
	public String tax_vat_amt;
	public String suply_amt;
	public String vat_amt;
	public String with_tax;
	public String incm_tax;
	public String res_tax;
	public String purc_amt;
	public String int_rate;
	public String pay_bank_cd;
	public String corp_tax_amt;
	public String issu_dt;
	public String insr_nm;
	public String adpay_adjm_count;
	public String adpay_adjm_sgno;
	public String adpay_adjm_x;
	public String adpay_adjm_amt;
	public String evnt_cd_seq;
	public String prop_equip_cd;
	public String rcpt_prof_clsf;
	public String bank_clsf;
	public String acct_no;
	public String deps_pers_nm;
	public String draft_doc_no;
	public String draft_expn_amt;
	public String recp_pers_clsf;
	public String recp_pers;
	public String draft_doc_dept_cd;
	public String semuro_occr_dt;
	public String semuro_seq;
	public String semuro_no;
	public String email_id;
	public String recp_pers_clsf1;
	public String recp_pers1;
	public String recp_pers_nm1;
	public String chnl_clsf_cd;

	public FC_ACCT_2012_IDM(){}
	public FC_ACCT_2012_IDM(String inupd_flag, String cmpy_cd, String slip_occr_dt, String slip_clsf_cd, String slip_seq, String rece_exp_aplc_yn, String titl, String reso_amt, String expn_hope_dt, String expn_clsf, String clam_dept_cd, String evnt_cd, String budg_yymm, String chrg_emp_no, String chg_pers, String incmg_pers_ipadd, String slip_sub_seq, String slip_arow_no, String budg_cd, String use_dept_cd, String rmks2, String dlco_clsf_cd, String dlco_cd, String dlco_nm, String boks_dlco_nm, String mang_clsf_cd, String mang_no, String incm_clsf_cd, String etc_in, String setoff_slip_occr_dt, String medi_cd, String dtls_medi_cd, String comp_dt, String mtry_dt, String unit, String qunt, String tax_stmt_no, String make_dt, String erplace_cd, String ern, String tax_suply_amt, String tax_vat_amt, String suply_amt, String vat_amt, String with_tax, String incm_tax, String res_tax, String purc_amt, String int_rate, String pay_bank_cd, String corp_tax_amt, String issu_dt, String insr_nm, String adpay_adjm_count, String adpay_adjm_sgno, String adpay_adjm_x, String adpay_adjm_amt, String evnt_cd_seq, String prop_equip_cd, String rcpt_prof_clsf, String bank_clsf, String acct_no, String deps_pers_nm, String draft_doc_no, String draft_expn_amt, String recp_pers_clsf, String recp_pers, String draft_doc_dept_cd, String semuro_occr_dt, String semuro_seq, String semuro_no, String email_id, String recp_pers_clsf1, String recp_pers1, String recp_pers_nm1, String chnl_clsf_cd){
		this.inupd_flag = inupd_flag;
		this.cmpy_cd = cmpy_cd;
		this.slip_occr_dt = slip_occr_dt;
		this.slip_clsf_cd = slip_clsf_cd;
		this.slip_seq = slip_seq;
		this.rece_exp_aplc_yn = rece_exp_aplc_yn;
		this.titl = titl;
		this.reso_amt = reso_amt;
		this.expn_hope_dt = expn_hope_dt;
		this.expn_clsf = expn_clsf;
		this.clam_dept_cd = clam_dept_cd;
		this.evnt_cd = evnt_cd;
		this.budg_yymm = budg_yymm;
		this.chrg_emp_no = chrg_emp_no;
		this.chg_pers = chg_pers;
		this.incmg_pers_ipadd = incmg_pers_ipadd;
		this.slip_sub_seq = slip_sub_seq;
		this.slip_arow_no = slip_arow_no;
		this.budg_cd = budg_cd;
		this.use_dept_cd = use_dept_cd;
		this.rmks2 = rmks2;
		this.dlco_clsf_cd = dlco_clsf_cd;
		this.dlco_cd = dlco_cd;
		this.dlco_nm = dlco_nm;
		this.boks_dlco_nm = boks_dlco_nm;
		this.mang_clsf_cd = mang_clsf_cd;
		this.mang_no = mang_no;
		this.incm_clsf_cd = incm_clsf_cd;
		this.etc_in = etc_in;
		this.setoff_slip_occr_dt = setoff_slip_occr_dt;
		this.medi_cd = medi_cd;
		this.dtls_medi_cd = dtls_medi_cd;
		this.comp_dt = comp_dt;
		this.mtry_dt = mtry_dt;
		this.unit = unit;
		this.qunt = qunt;
		this.tax_stmt_no = tax_stmt_no;
		this.make_dt = make_dt;
		this.erplace_cd = erplace_cd;
		this.ern = ern;
		this.tax_suply_amt = tax_suply_amt;
		this.tax_vat_amt = tax_vat_amt;
		this.suply_amt = suply_amt;
		this.vat_amt = vat_amt;
		this.with_tax = with_tax;
		this.incm_tax = incm_tax;
		this.res_tax = res_tax;
		this.purc_amt = purc_amt;
		this.int_rate = int_rate;
		this.pay_bank_cd = pay_bank_cd;
		this.corp_tax_amt = corp_tax_amt;
		this.issu_dt = issu_dt;
		this.insr_nm = insr_nm;
		this.adpay_adjm_count = adpay_adjm_count;
		this.adpay_adjm_sgno = adpay_adjm_sgno;
		this.adpay_adjm_x = adpay_adjm_x;
		this.adpay_adjm_amt = adpay_adjm_amt;
		this.evnt_cd_seq = evnt_cd_seq;
		this.prop_equip_cd = prop_equip_cd;
		this.rcpt_prof_clsf = rcpt_prof_clsf;
		this.bank_clsf = bank_clsf;
		this.acct_no = acct_no;
		this.deps_pers_nm = deps_pers_nm;
		this.draft_doc_no = draft_doc_no;
		this.draft_expn_amt = draft_expn_amt;
		this.recp_pers_clsf = recp_pers_clsf;
		this.recp_pers = recp_pers;
		this.draft_doc_dept_cd = draft_doc_dept_cd;
		this.semuro_occr_dt = semuro_occr_dt;
		this.semuro_seq = semuro_seq;
		this.semuro_no = semuro_no;
		this.email_id = email_id;
		this.recp_pers_clsf1 = recp_pers_clsf1;
		this.recp_pers1 = recp_pers1;
		this.recp_pers_nm1 = recp_pers_nm1;
		this.chnl_clsf_cd = chnl_clsf_cd;
	}

	public void setInupd_flag(String inupd_flag){
		this.inupd_flag = inupd_flag;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setSlip_occr_dt(String slip_occr_dt){
		this.slip_occr_dt = slip_occr_dt;
	}

	public void setSlip_clsf_cd(String slip_clsf_cd){
		this.slip_clsf_cd = slip_clsf_cd;
	}

	public void setSlip_seq(String slip_seq){
		this.slip_seq = slip_seq;
	}

	public void setRece_exp_aplc_yn(String rece_exp_aplc_yn){
		this.rece_exp_aplc_yn = rece_exp_aplc_yn;
	}

	public void setTitl(String titl){
		this.titl = titl;
	}

	public void setReso_amt(String reso_amt){
		this.reso_amt = reso_amt;
	}

	public void setExpn_hope_dt(String expn_hope_dt){
		this.expn_hope_dt = expn_hope_dt;
	}

	public void setExpn_clsf(String expn_clsf){
		this.expn_clsf = expn_clsf;
	}

	public void setClam_dept_cd(String clam_dept_cd){
		this.clam_dept_cd = clam_dept_cd;
	}

	public void setEvnt_cd(String evnt_cd){
		this.evnt_cd = evnt_cd;
	}

	public void setBudg_yymm(String budg_yymm){
		this.budg_yymm = budg_yymm;
	}

	public void setChrg_emp_no(String chrg_emp_no){
		this.chrg_emp_no = chrg_emp_no;
	}

	public void setChg_pers(String chg_pers){
		this.chg_pers = chg_pers;
	}

	public void setIncmg_pers_ipadd(String incmg_pers_ipadd){
		this.incmg_pers_ipadd = incmg_pers_ipadd;
	}

	public void setSlip_sub_seq(String slip_sub_seq){
		this.slip_sub_seq = slip_sub_seq;
	}

	public void setSlip_arow_no(String slip_arow_no){
		this.slip_arow_no = slip_arow_no;
	}

	public void setBudg_cd(String budg_cd){
		this.budg_cd = budg_cd;
	}

	public void setUse_dept_cd(String use_dept_cd){
		this.use_dept_cd = use_dept_cd;
	}

	public void setRmks2(String rmks2){
		this.rmks2 = rmks2;
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

	public void setBoks_dlco_nm(String boks_dlco_nm){
		this.boks_dlco_nm = boks_dlco_nm;
	}

	public void setMang_clsf_cd(String mang_clsf_cd){
		this.mang_clsf_cd = mang_clsf_cd;
	}

	public void setMang_no(String mang_no){
		this.mang_no = mang_no;
	}

	public void setIncm_clsf_cd(String incm_clsf_cd){
		this.incm_clsf_cd = incm_clsf_cd;
	}

	public void setEtc_in(String etc_in){
		this.etc_in = etc_in;
	}

	public void setSetoff_slip_occr_dt(String setoff_slip_occr_dt){
		this.setoff_slip_occr_dt = setoff_slip_occr_dt;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setDtls_medi_cd(String dtls_medi_cd){
		this.dtls_medi_cd = dtls_medi_cd;
	}

	public void setComp_dt(String comp_dt){
		this.comp_dt = comp_dt;
	}

	public void setMtry_dt(String mtry_dt){
		this.mtry_dt = mtry_dt;
	}

	public void setUnit(String unit){
		this.unit = unit;
	}

	public void setQunt(String qunt){
		this.qunt = qunt;
	}

	public void setTax_stmt_no(String tax_stmt_no){
		this.tax_stmt_no = tax_stmt_no;
	}

	public void setMake_dt(String make_dt){
		this.make_dt = make_dt;
	}

	public void setErplace_cd(String erplace_cd){
		this.erplace_cd = erplace_cd;
	}

	public void setErn(String ern){
		this.ern = ern;
	}

	public void setTax_suply_amt(String tax_suply_amt){
		this.tax_suply_amt = tax_suply_amt;
	}

	public void setTax_vat_amt(String tax_vat_amt){
		this.tax_vat_amt = tax_vat_amt;
	}

	public void setSuply_amt(String suply_amt){
		this.suply_amt = suply_amt;
	}

	public void setVat_amt(String vat_amt){
		this.vat_amt = vat_amt;
	}

	public void setWith_tax(String with_tax){
		this.with_tax = with_tax;
	}

	public void setIncm_tax(String incm_tax){
		this.incm_tax = incm_tax;
	}

	public void setRes_tax(String res_tax){
		this.res_tax = res_tax;
	}

	public void setPurc_amt(String purc_amt){
		this.purc_amt = purc_amt;
	}

	public void setInt_rate(String int_rate){
		this.int_rate = int_rate;
	}

	public void setPay_bank_cd(String pay_bank_cd){
		this.pay_bank_cd = pay_bank_cd;
	}

	public void setCorp_tax_amt(String corp_tax_amt){
		this.corp_tax_amt = corp_tax_amt;
	}

	public void setIssu_dt(String issu_dt){
		this.issu_dt = issu_dt;
	}

	public void setInsr_nm(String insr_nm){
		this.insr_nm = insr_nm;
	}

	public void setAdpay_adjm_count(String adpay_adjm_count){
		this.adpay_adjm_count = adpay_adjm_count;
	}

	public void setAdpay_adjm_sgno(String adpay_adjm_sgno){
		this.adpay_adjm_sgno = adpay_adjm_sgno;
	}

	public void setAdpay_adjm_x(String adpay_adjm_x){
		this.adpay_adjm_x = adpay_adjm_x;
	}

	public void setAdpay_adjm_amt(String adpay_adjm_amt){
		this.adpay_adjm_amt = adpay_adjm_amt;
	}

	public void setEvnt_cd_seq(String evnt_cd_seq){
		this.evnt_cd_seq = evnt_cd_seq;
	}

	public void setProp_equip_cd(String prop_equip_cd){
		this.prop_equip_cd = prop_equip_cd;
	}

	public void setRcpt_prof_clsf(String rcpt_prof_clsf){
		this.rcpt_prof_clsf = rcpt_prof_clsf;
	}

	public void setBank_clsf(String bank_clsf){
		this.bank_clsf = bank_clsf;
	}

	public void setAcct_no(String acct_no){
		this.acct_no = acct_no;
	}

	public void setDeps_pers_nm(String deps_pers_nm){
		this.deps_pers_nm = deps_pers_nm;
	}

	public void setDraft_doc_no(String draft_doc_no){
		this.draft_doc_no = draft_doc_no;
	}

	public void setDraft_expn_amt(String draft_expn_amt){
		this.draft_expn_amt = draft_expn_amt;
	}

	public void setRecp_pers_clsf(String recp_pers_clsf){
		this.recp_pers_clsf = recp_pers_clsf;
	}

	public void setRecp_pers(String recp_pers){
		this.recp_pers = recp_pers;
	}

	public void setDraft_doc_dept_cd(String draft_doc_dept_cd){
		this.draft_doc_dept_cd = draft_doc_dept_cd;
	}

	public void setSemuro_occr_dt(String semuro_occr_dt){
		this.semuro_occr_dt = semuro_occr_dt;
	}

	public void setSemuro_seq(String semuro_seq){
		this.semuro_seq = semuro_seq;
	}

	public void setSemuro_no(String semuro_no){
		this.semuro_no = semuro_no;
	}

	public void setEmail_id(String email_id){
		this.email_id = email_id;
	}

	public void setRecp_pers_clsf1(String recp_pers_clsf1){
		this.recp_pers_clsf1 = recp_pers_clsf1;
	}

	public void setRecp_pers1(String recp_pers1){
		this.recp_pers1 = recp_pers1;
	}

	public void setRecp_pers_nm1(String recp_pers_nm1){
		this.recp_pers_nm1 = recp_pers_nm1;
	}

	public void setChnl_clsf_cd(String chnl_clsf_cd){
		this.chnl_clsf_cd = chnl_clsf_cd;
	}

	public String getInupd_flag(){
		return this.inupd_flag;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getSlip_occr_dt(){
		return this.slip_occr_dt;
	}

	public String getSlip_clsf_cd(){
		return this.slip_clsf_cd;
	}

	public String getSlip_seq(){
		return this.slip_seq;
	}

	public String getRece_exp_aplc_yn(){
		return this.rece_exp_aplc_yn;
	}

	public String getTitl(){
		return this.titl;
	}

	public String getReso_amt(){
		return this.reso_amt;
	}

	public String getExpn_hope_dt(){
		return this.expn_hope_dt;
	}

	public String getExpn_clsf(){
		return this.expn_clsf;
	}

	public String getClam_dept_cd(){
		return this.clam_dept_cd;
	}

	public String getEvnt_cd(){
		return this.evnt_cd;
	}

	public String getBudg_yymm(){
		return this.budg_yymm;
	}

	public String getChrg_emp_no(){
		return this.chrg_emp_no;
	}

	public String getChg_pers(){
		return this.chg_pers;
	}

	public String getIncmg_pers_ipadd(){
		return this.incmg_pers_ipadd;
	}

	public String getSlip_sub_seq(){
		return this.slip_sub_seq;
	}

	public String getSlip_arow_no(){
		return this.slip_arow_no;
	}

	public String getBudg_cd(){
		return this.budg_cd;
	}

	public String getUse_dept_cd(){
		return this.use_dept_cd;
	}

	public String getRmks2(){
		return this.rmks2;
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

	public String getBoks_dlco_nm(){
		return this.boks_dlco_nm;
	}

	public String getMang_clsf_cd(){
		return this.mang_clsf_cd;
	}

	public String getMang_no(){
		return this.mang_no;
	}

	public String getIncm_clsf_cd(){
		return this.incm_clsf_cd;
	}

	public String getEtc_in(){
		return this.etc_in;
	}

	public String getSetoff_slip_occr_dt(){
		return this.setoff_slip_occr_dt;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getDtls_medi_cd(){
		return this.dtls_medi_cd;
	}

	public String getComp_dt(){
		return this.comp_dt;
	}

	public String getMtry_dt(){
		return this.mtry_dt;
	}

	public String getUnit(){
		return this.unit;
	}

	public String getQunt(){
		return this.qunt;
	}

	public String getTax_stmt_no(){
		return this.tax_stmt_no;
	}

	public String getMake_dt(){
		return this.make_dt;
	}

	public String getErplace_cd(){
		return this.erplace_cd;
	}

	public String getErn(){
		return this.ern;
	}

	public String getTax_suply_amt(){
		return this.tax_suply_amt;
	}

	public String getTax_vat_amt(){
		return this.tax_vat_amt;
	}

	public String getSuply_amt(){
		return this.suply_amt;
	}

	public String getVat_amt(){
		return this.vat_amt;
	}

	public String getWith_tax(){
		return this.with_tax;
	}

	public String getIncm_tax(){
		return this.incm_tax;
	}

	public String getRes_tax(){
		return this.res_tax;
	}

	public String getPurc_amt(){
		return this.purc_amt;
	}

	public String getInt_rate(){
		return this.int_rate;
	}

	public String getPay_bank_cd(){
		return this.pay_bank_cd;
	}

	public String getCorp_tax_amt(){
		return this.corp_tax_amt;
	}

	public String getIssu_dt(){
		return this.issu_dt;
	}

	public String getInsr_nm(){
		return this.insr_nm;
	}

	public String getAdpay_adjm_count(){
		return this.adpay_adjm_count;
	}

	public String getAdpay_adjm_sgno(){
		return this.adpay_adjm_sgno;
	}

	public String getAdpay_adjm_x(){
		return this.adpay_adjm_x;
	}

	public String getAdpay_adjm_amt(){
		return this.adpay_adjm_amt;
	}

	public String getEvnt_cd_seq(){
		return this.evnt_cd_seq;
	}

	public String getProp_equip_cd(){
		return this.prop_equip_cd;
	}

	public String getRcpt_prof_clsf(){
		return this.rcpt_prof_clsf;
	}

	public String getBank_clsf(){
		return this.bank_clsf;
	}

	public String getAcct_no(){
		return this.acct_no;
	}

	public String getDeps_pers_nm(){
		return this.deps_pers_nm;
	}

	public String getDraft_doc_no(){
		return this.draft_doc_no;
	}

	public String getDraft_expn_amt(){
		return this.draft_expn_amt;
	}

	public String getRecp_pers_clsf(){
		return this.recp_pers_clsf;
	}

	public String getRecp_pers(){
		return this.recp_pers;
	}

	public String getDraft_doc_dept_cd(){
		return this.draft_doc_dept_cd;
	}

	public String getSemuro_occr_dt(){
		return this.semuro_occr_dt;
	}

	public String getSemuro_seq(){
		return this.semuro_seq;
	}

	public String getSemuro_no(){
		return this.semuro_no;
	}

	public String getEmail_id(){
		return this.email_id;
	}

	public String getRecp_pers_clsf1(){
		return this.recp_pers_clsf1;
	}

	public String getRecp_pers1(){
		return this.recp_pers1;
	}

	public String getRecp_pers_nm1(){
		return this.recp_pers_nm1;
	}

	public String getChnl_clsf_cd(){
		return this.chnl_clsf_cd;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_FC_ACCT_2012_I(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		FC_ACCT_2012_IDM dm = (FC_ACCT_2012_IDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.registerOutParameter(3, Types.VARCHAR);
		cstmt.setString(4, dm.inupd_flag);
		cstmt.setString(5, dm.cmpy_cd);
		cstmt.setString(6, dm.slip_occr_dt);
		cstmt.setString(7, dm.slip_clsf_cd);
		cstmt.setString(8, dm.slip_seq);
		cstmt.setString(9, dm.rece_exp_aplc_yn);
		cstmt.setString(10, dm.titl);
		cstmt.setString(11, dm.reso_amt);
		cstmt.setString(12, dm.expn_hope_dt);
		cstmt.setString(13, dm.expn_clsf);
		cstmt.setString(14, dm.clam_dept_cd);
		cstmt.setString(15, dm.evnt_cd);
		cstmt.setString(16, dm.budg_yymm);
		cstmt.setString(17, dm.chrg_emp_no);
		cstmt.setString(18, dm.chg_pers);
		cstmt.setString(19, dm.incmg_pers_ipadd);
		cstmt.setString(20, dm.slip_sub_seq);
		cstmt.setString(21, dm.slip_arow_no);
		cstmt.setString(22, dm.budg_cd);
		cstmt.setString(23, dm.use_dept_cd);
		cstmt.setString(24, dm.rmks2);
		cstmt.setString(25, dm.dlco_clsf_cd);
		cstmt.setString(26, dm.dlco_cd);
		cstmt.setString(27, dm.dlco_nm);
		cstmt.setString(28, dm.boks_dlco_nm);
		cstmt.setString(29, dm.mang_clsf_cd);
		cstmt.setString(30, dm.mang_no);
		cstmt.setString(31, dm.incm_clsf_cd);
		cstmt.setString(32, dm.etc_in);
		cstmt.setString(33, dm.setoff_slip_occr_dt);
		cstmt.setString(34, dm.medi_cd);
		cstmt.setString(35, dm.dtls_medi_cd);
		cstmt.setString(36, dm.comp_dt);
		cstmt.setString(37, dm.mtry_dt);
		cstmt.setString(38, dm.unit);
		cstmt.setString(39, dm.qunt);
		cstmt.setString(40, dm.tax_stmt_no);
		cstmt.setString(41, dm.make_dt);
		cstmt.setString(42, dm.erplace_cd);
		cstmt.setString(43, dm.ern);
		cstmt.setString(44, dm.tax_suply_amt);
		cstmt.setString(45, dm.tax_vat_amt);
		cstmt.setString(46, dm.suply_amt);
		cstmt.setString(47, dm.vat_amt);
		cstmt.setString(48, dm.with_tax);
		cstmt.setString(49, dm.incm_tax);
		cstmt.setString(50, dm.res_tax);
		cstmt.setString(51, dm.purc_amt);
		cstmt.setString(52, dm.int_rate);
		cstmt.setString(53, dm.pay_bank_cd);
		cstmt.setString(54, dm.corp_tax_amt);
		cstmt.setString(55, dm.issu_dt);
		cstmt.setString(56, dm.insr_nm);
		cstmt.setString(57, dm.adpay_adjm_count);
		cstmt.setString(58, dm.adpay_adjm_sgno);
		cstmt.setString(59, dm.adpay_adjm_x);
		cstmt.setString(60, dm.adpay_adjm_amt);
		cstmt.setString(61, dm.evnt_cd_seq);
		cstmt.setString(62, dm.prop_equip_cd);
		cstmt.setString(63, dm.rcpt_prof_clsf);
		cstmt.setString(64, dm.bank_clsf);
		cstmt.setString(65, dm.acct_no);
		cstmt.setString(66, dm.deps_pers_nm);
		cstmt.setString(67, dm.draft_doc_no);
		cstmt.setString(68, dm.draft_expn_amt);
		cstmt.setString(69, dm.recp_pers_clsf);
		cstmt.setString(70, dm.recp_pers);
		cstmt.setString(71, dm.draft_doc_dept_cd);
		cstmt.setString(72, dm.semuro_occr_dt);
		cstmt.setString(73, dm.semuro_seq);
		cstmt.setString(74, dm.semuro_no);
		cstmt.setString(75, dm.email_id);
		cstmt.setString(76, dm.recp_pers_clsf1);
		cstmt.setString(77, dm.recp_pers1);
		cstmt.setString(78, dm.recp_pers_nm1);
		cstmt.setString(79, dm.chnl_clsf_cd);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.fc.acct.ds.FC_ACCT_2012_IDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("inupd_flag = [" + getInupd_flag() + "]");
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("slip_occr_dt = [" + getSlip_occr_dt() + "]");
		System.out.println("slip_clsf_cd = [" + getSlip_clsf_cd() + "]");
		System.out.println("slip_seq = [" + getSlip_seq() + "]");
		System.out.println("rece_exp_aplc_yn = [" + getRece_exp_aplc_yn() + "]");
		System.out.println("titl = [" + getTitl() + "]");
		System.out.println("reso_amt = [" + getReso_amt() + "]");
		System.out.println("expn_hope_dt = [" + getExpn_hope_dt() + "]");
		System.out.println("expn_clsf = [" + getExpn_clsf() + "]");
		System.out.println("clam_dept_cd = [" + getClam_dept_cd() + "]");
		System.out.println("evnt_cd = [" + getEvnt_cd() + "]");
		System.out.println("budg_yymm = [" + getBudg_yymm() + "]");
		System.out.println("chrg_emp_no = [" + getChrg_emp_no() + "]");
		System.out.println("chg_pers = [" + getChg_pers() + "]");
		System.out.println("incmg_pers_ipadd = [" + getIncmg_pers_ipadd() + "]");
		System.out.println("slip_sub_seq = [" + getSlip_sub_seq() + "]");
		System.out.println("slip_arow_no = [" + getSlip_arow_no() + "]");
		System.out.println("budg_cd = [" + getBudg_cd() + "]");
		System.out.println("use_dept_cd = [" + getUse_dept_cd() + "]");
		System.out.println("rmks2 = [" + getRmks2() + "]");
		System.out.println("dlco_clsf_cd = [" + getDlco_clsf_cd() + "]");
		System.out.println("dlco_cd = [" + getDlco_cd() + "]");
		System.out.println("dlco_nm = [" + getDlco_nm() + "]");
		System.out.println("boks_dlco_nm = [" + getBoks_dlco_nm() + "]");
		System.out.println("mang_clsf_cd = [" + getMang_clsf_cd() + "]");
		System.out.println("mang_no = [" + getMang_no() + "]");
		System.out.println("incm_clsf_cd = [" + getIncm_clsf_cd() + "]");
		System.out.println("etc_in = [" + getEtc_in() + "]");
		System.out.println("setoff_slip_occr_dt = [" + getSetoff_slip_occr_dt() + "]");
		System.out.println("medi_cd = [" + getMedi_cd() + "]");
		System.out.println("dtls_medi_cd = [" + getDtls_medi_cd() + "]");
		System.out.println("comp_dt = [" + getComp_dt() + "]");
		System.out.println("mtry_dt = [" + getMtry_dt() + "]");
		System.out.println("unit = [" + getUnit() + "]");
		System.out.println("qunt = [" + getQunt() + "]");
		System.out.println("tax_stmt_no = [" + getTax_stmt_no() + "]");
		System.out.println("make_dt = [" + getMake_dt() + "]");
		System.out.println("erplace_cd = [" + getErplace_cd() + "]");
		System.out.println("ern = [" + getErn() + "]");
		System.out.println("tax_suply_amt = [" + getTax_suply_amt() + "]");
		System.out.println("tax_vat_amt = [" + getTax_vat_amt() + "]");
		System.out.println("suply_amt = [" + getSuply_amt() + "]");
		System.out.println("vat_amt = [" + getVat_amt() + "]");
		System.out.println("with_tax = [" + getWith_tax() + "]");
		System.out.println("incm_tax = [" + getIncm_tax() + "]");
		System.out.println("res_tax = [" + getRes_tax() + "]");
		System.out.println("purc_amt = [" + getPurc_amt() + "]");
		System.out.println("int_rate = [" + getInt_rate() + "]");
		System.out.println("pay_bank_cd = [" + getPay_bank_cd() + "]");
		System.out.println("corp_tax_amt = [" + getCorp_tax_amt() + "]");
		System.out.println("issu_dt = [" + getIssu_dt() + "]");
		System.out.println("insr_nm = [" + getInsr_nm() + "]");
		System.out.println("adpay_adjm_count = [" + getAdpay_adjm_count() + "]");
		System.out.println("adpay_adjm_sgno = [" + getAdpay_adjm_sgno() + "]");
		System.out.println("adpay_adjm_x = [" + getAdpay_adjm_x() + "]");
		System.out.println("adpay_adjm_amt = [" + getAdpay_adjm_amt() + "]");
		System.out.println("evnt_cd_seq = [" + getEvnt_cd_seq() + "]");
		System.out.println("prop_equip_cd = [" + getProp_equip_cd() + "]");
		System.out.println("rcpt_prof_clsf = [" + getRcpt_prof_clsf() + "]");
		System.out.println("bank_clsf = [" + getBank_clsf() + "]");
		System.out.println("acct_no = [" + getAcct_no() + "]");
		System.out.println("deps_pers_nm = [" + getDeps_pers_nm() + "]");
		System.out.println("draft_doc_no = [" + getDraft_doc_no() + "]");
		System.out.println("draft_expn_amt = [" + getDraft_expn_amt() + "]");
		System.out.println("recp_pers_clsf = [" + getRecp_pers_clsf() + "]");
		System.out.println("recp_pers = [" + getRecp_pers() + "]");
		System.out.println("draft_doc_dept_cd = [" + getDraft_doc_dept_cd() + "]");
		System.out.println("semuro_occr_dt = [" + getSemuro_occr_dt() + "]");
		System.out.println("semuro_seq = [" + getSemuro_seq() + "]");
		System.out.println("semuro_no = [" + getSemuro_no() + "]");
		System.out.println("email_id = [" + getEmail_id() + "]");
		System.out.println("recp_pers_clsf1 = [" + getRecp_pers_clsf1() + "]");
		System.out.println("recp_pers1 = [" + getRecp_pers1() + "]");
		System.out.println("recp_pers_nm1 = [" + getRecp_pers_nm1() + "]");
		System.out.println("chnl_clsf_cd = [" + getChnl_clsf_cd() + "]");
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String inupd_flag = req.getParameter("inupd_flag");
if( inupd_flag == null){
	System.out.println(this.toString+" : inupd_flag is null" );
}else{
	System.out.println(this.toString+" : inupd_flag is "+inupd_flag );
}
String cmpy_cd = req.getParameter("cmpy_cd");
if( cmpy_cd == null){
	System.out.println(this.toString+" : cmpy_cd is null" );
}else{
	System.out.println(this.toString+" : cmpy_cd is "+cmpy_cd );
}
String slip_occr_dt = req.getParameter("slip_occr_dt");
if( slip_occr_dt == null){
	System.out.println(this.toString+" : slip_occr_dt is null" );
}else{
	System.out.println(this.toString+" : slip_occr_dt is "+slip_occr_dt );
}
String slip_clsf_cd = req.getParameter("slip_clsf_cd");
if( slip_clsf_cd == null){
	System.out.println(this.toString+" : slip_clsf_cd is null" );
}else{
	System.out.println(this.toString+" : slip_clsf_cd is "+slip_clsf_cd );
}
String slip_seq = req.getParameter("slip_seq");
if( slip_seq == null){
	System.out.println(this.toString+" : slip_seq is null" );
}else{
	System.out.println(this.toString+" : slip_seq is "+slip_seq );
}
String rece_exp_aplc_yn = req.getParameter("rece_exp_aplc_yn");
if( rece_exp_aplc_yn == null){
	System.out.println(this.toString+" : rece_exp_aplc_yn is null" );
}else{
	System.out.println(this.toString+" : rece_exp_aplc_yn is "+rece_exp_aplc_yn );
}
String titl = req.getParameter("titl");
if( titl == null){
	System.out.println(this.toString+" : titl is null" );
}else{
	System.out.println(this.toString+" : titl is "+titl );
}
String reso_amt = req.getParameter("reso_amt");
if( reso_amt == null){
	System.out.println(this.toString+" : reso_amt is null" );
}else{
	System.out.println(this.toString+" : reso_amt is "+reso_amt );
}
String expn_hope_dt = req.getParameter("expn_hope_dt");
if( expn_hope_dt == null){
	System.out.println(this.toString+" : expn_hope_dt is null" );
}else{
	System.out.println(this.toString+" : expn_hope_dt is "+expn_hope_dt );
}
String expn_clsf = req.getParameter("expn_clsf");
if( expn_clsf == null){
	System.out.println(this.toString+" : expn_clsf is null" );
}else{
	System.out.println(this.toString+" : expn_clsf is "+expn_clsf );
}
String clam_dept_cd = req.getParameter("clam_dept_cd");
if( clam_dept_cd == null){
	System.out.println(this.toString+" : clam_dept_cd is null" );
}else{
	System.out.println(this.toString+" : clam_dept_cd is "+clam_dept_cd );
}
String evnt_cd = req.getParameter("evnt_cd");
if( evnt_cd == null){
	System.out.println(this.toString+" : evnt_cd is null" );
}else{
	System.out.println(this.toString+" : evnt_cd is "+evnt_cd );
}
String budg_yymm = req.getParameter("budg_yymm");
if( budg_yymm == null){
	System.out.println(this.toString+" : budg_yymm is null" );
}else{
	System.out.println(this.toString+" : budg_yymm is "+budg_yymm );
}
String chrg_emp_no = req.getParameter("chrg_emp_no");
if( chrg_emp_no == null){
	System.out.println(this.toString+" : chrg_emp_no is null" );
}else{
	System.out.println(this.toString+" : chrg_emp_no is "+chrg_emp_no );
}
String chg_pers = req.getParameter("chg_pers");
if( chg_pers == null){
	System.out.println(this.toString+" : chg_pers is null" );
}else{
	System.out.println(this.toString+" : chg_pers is "+chg_pers );
}
String incmg_pers_ipadd = req.getParameter("incmg_pers_ipadd");
if( incmg_pers_ipadd == null){
	System.out.println(this.toString+" : incmg_pers_ipadd is null" );
}else{
	System.out.println(this.toString+" : incmg_pers_ipadd is "+incmg_pers_ipadd );
}
String slip_sub_seq = req.getParameter("slip_sub_seq");
if( slip_sub_seq == null){
	System.out.println(this.toString+" : slip_sub_seq is null" );
}else{
	System.out.println(this.toString+" : slip_sub_seq is "+slip_sub_seq );
}
String slip_arow_no = req.getParameter("slip_arow_no");
if( slip_arow_no == null){
	System.out.println(this.toString+" : slip_arow_no is null" );
}else{
	System.out.println(this.toString+" : slip_arow_no is "+slip_arow_no );
}
String budg_cd = req.getParameter("budg_cd");
if( budg_cd == null){
	System.out.println(this.toString+" : budg_cd is null" );
}else{
	System.out.println(this.toString+" : budg_cd is "+budg_cd );
}
String use_dept_cd = req.getParameter("use_dept_cd");
if( use_dept_cd == null){
	System.out.println(this.toString+" : use_dept_cd is null" );
}else{
	System.out.println(this.toString+" : use_dept_cd is "+use_dept_cd );
}
String rmks2 = req.getParameter("rmks2");
if( rmks2 == null){
	System.out.println(this.toString+" : rmks2 is null" );
}else{
	System.out.println(this.toString+" : rmks2 is "+rmks2 );
}
String dlco_clsf_cd = req.getParameter("dlco_clsf_cd");
if( dlco_clsf_cd == null){
	System.out.println(this.toString+" : dlco_clsf_cd is null" );
}else{
	System.out.println(this.toString+" : dlco_clsf_cd is "+dlco_clsf_cd );
}
String dlco_cd = req.getParameter("dlco_cd");
if( dlco_cd == null){
	System.out.println(this.toString+" : dlco_cd is null" );
}else{
	System.out.println(this.toString+" : dlco_cd is "+dlco_cd );
}
String dlco_nm = req.getParameter("dlco_nm");
if( dlco_nm == null){
	System.out.println(this.toString+" : dlco_nm is null" );
}else{
	System.out.println(this.toString+" : dlco_nm is "+dlco_nm );
}
String boks_dlco_nm = req.getParameter("boks_dlco_nm");
if( boks_dlco_nm == null){
	System.out.println(this.toString+" : boks_dlco_nm is null" );
}else{
	System.out.println(this.toString+" : boks_dlco_nm is "+boks_dlco_nm );
}
String mang_clsf_cd = req.getParameter("mang_clsf_cd");
if( mang_clsf_cd == null){
	System.out.println(this.toString+" : mang_clsf_cd is null" );
}else{
	System.out.println(this.toString+" : mang_clsf_cd is "+mang_clsf_cd );
}
String mang_no = req.getParameter("mang_no");
if( mang_no == null){
	System.out.println(this.toString+" : mang_no is null" );
}else{
	System.out.println(this.toString+" : mang_no is "+mang_no );
}
String incm_clsf_cd = req.getParameter("incm_clsf_cd");
if( incm_clsf_cd == null){
	System.out.println(this.toString+" : incm_clsf_cd is null" );
}else{
	System.out.println(this.toString+" : incm_clsf_cd is "+incm_clsf_cd );
}
String etc_in = req.getParameter("etc_in");
if( etc_in == null){
	System.out.println(this.toString+" : etc_in is null" );
}else{
	System.out.println(this.toString+" : etc_in is "+etc_in );
}
String setoff_slip_occr_dt = req.getParameter("setoff_slip_occr_dt");
if( setoff_slip_occr_dt == null){
	System.out.println(this.toString+" : setoff_slip_occr_dt is null" );
}else{
	System.out.println(this.toString+" : setoff_slip_occr_dt is "+setoff_slip_occr_dt );
}
String medi_cd = req.getParameter("medi_cd");
if( medi_cd == null){
	System.out.println(this.toString+" : medi_cd is null" );
}else{
	System.out.println(this.toString+" : medi_cd is "+medi_cd );
}
String dtls_medi_cd = req.getParameter("dtls_medi_cd");
if( dtls_medi_cd == null){
	System.out.println(this.toString+" : dtls_medi_cd is null" );
}else{
	System.out.println(this.toString+" : dtls_medi_cd is "+dtls_medi_cd );
}
String comp_dt = req.getParameter("comp_dt");
if( comp_dt == null){
	System.out.println(this.toString+" : comp_dt is null" );
}else{
	System.out.println(this.toString+" : comp_dt is "+comp_dt );
}
String mtry_dt = req.getParameter("mtry_dt");
if( mtry_dt == null){
	System.out.println(this.toString+" : mtry_dt is null" );
}else{
	System.out.println(this.toString+" : mtry_dt is "+mtry_dt );
}
String unit = req.getParameter("unit");
if( unit == null){
	System.out.println(this.toString+" : unit is null" );
}else{
	System.out.println(this.toString+" : unit is "+unit );
}
String qunt = req.getParameter("qunt");
if( qunt == null){
	System.out.println(this.toString+" : qunt is null" );
}else{
	System.out.println(this.toString+" : qunt is "+qunt );
}
String tax_stmt_no = req.getParameter("tax_stmt_no");
if( tax_stmt_no == null){
	System.out.println(this.toString+" : tax_stmt_no is null" );
}else{
	System.out.println(this.toString+" : tax_stmt_no is "+tax_stmt_no );
}
String make_dt = req.getParameter("make_dt");
if( make_dt == null){
	System.out.println(this.toString+" : make_dt is null" );
}else{
	System.out.println(this.toString+" : make_dt is "+make_dt );
}
String erplace_cd = req.getParameter("erplace_cd");
if( erplace_cd == null){
	System.out.println(this.toString+" : erplace_cd is null" );
}else{
	System.out.println(this.toString+" : erplace_cd is "+erplace_cd );
}
String ern = req.getParameter("ern");
if( ern == null){
	System.out.println(this.toString+" : ern is null" );
}else{
	System.out.println(this.toString+" : ern is "+ern );
}
String tax_suply_amt = req.getParameter("tax_suply_amt");
if( tax_suply_amt == null){
	System.out.println(this.toString+" : tax_suply_amt is null" );
}else{
	System.out.println(this.toString+" : tax_suply_amt is "+tax_suply_amt );
}
String tax_vat_amt = req.getParameter("tax_vat_amt");
if( tax_vat_amt == null){
	System.out.println(this.toString+" : tax_vat_amt is null" );
}else{
	System.out.println(this.toString+" : tax_vat_amt is "+tax_vat_amt );
}
String suply_amt = req.getParameter("suply_amt");
if( suply_amt == null){
	System.out.println(this.toString+" : suply_amt is null" );
}else{
	System.out.println(this.toString+" : suply_amt is "+suply_amt );
}
String vat_amt = req.getParameter("vat_amt");
if( vat_amt == null){
	System.out.println(this.toString+" : vat_amt is null" );
}else{
	System.out.println(this.toString+" : vat_amt is "+vat_amt );
}
String with_tax = req.getParameter("with_tax");
if( with_tax == null){
	System.out.println(this.toString+" : with_tax is null" );
}else{
	System.out.println(this.toString+" : with_tax is "+with_tax );
}
String incm_tax = req.getParameter("incm_tax");
if( incm_tax == null){
	System.out.println(this.toString+" : incm_tax is null" );
}else{
	System.out.println(this.toString+" : incm_tax is "+incm_tax );
}
String res_tax = req.getParameter("res_tax");
if( res_tax == null){
	System.out.println(this.toString+" : res_tax is null" );
}else{
	System.out.println(this.toString+" : res_tax is "+res_tax );
}
String purc_amt = req.getParameter("purc_amt");
if( purc_amt == null){
	System.out.println(this.toString+" : purc_amt is null" );
}else{
	System.out.println(this.toString+" : purc_amt is "+purc_amt );
}
String int_rate = req.getParameter("int_rate");
if( int_rate == null){
	System.out.println(this.toString+" : int_rate is null" );
}else{
	System.out.println(this.toString+" : int_rate is "+int_rate );
}
String pay_bank_cd = req.getParameter("pay_bank_cd");
if( pay_bank_cd == null){
	System.out.println(this.toString+" : pay_bank_cd is null" );
}else{
	System.out.println(this.toString+" : pay_bank_cd is "+pay_bank_cd );
}
String corp_tax_amt = req.getParameter("corp_tax_amt");
if( corp_tax_amt == null){
	System.out.println(this.toString+" : corp_tax_amt is null" );
}else{
	System.out.println(this.toString+" : corp_tax_amt is "+corp_tax_amt );
}
String issu_dt = req.getParameter("issu_dt");
if( issu_dt == null){
	System.out.println(this.toString+" : issu_dt is null" );
}else{
	System.out.println(this.toString+" : issu_dt is "+issu_dt );
}
String insr_nm = req.getParameter("insr_nm");
if( insr_nm == null){
	System.out.println(this.toString+" : insr_nm is null" );
}else{
	System.out.println(this.toString+" : insr_nm is "+insr_nm );
}
String adpay_adjm_count = req.getParameter("adpay_adjm_count");
if( adpay_adjm_count == null){
	System.out.println(this.toString+" : adpay_adjm_count is null" );
}else{
	System.out.println(this.toString+" : adpay_adjm_count is "+adpay_adjm_count );
}
String adpay_adjm_sgno = req.getParameter("adpay_adjm_sgno");
if( adpay_adjm_sgno == null){
	System.out.println(this.toString+" : adpay_adjm_sgno is null" );
}else{
	System.out.println(this.toString+" : adpay_adjm_sgno is "+adpay_adjm_sgno );
}
String adpay_adjm_x = req.getParameter("adpay_adjm_x");
if( adpay_adjm_x == null){
	System.out.println(this.toString+" : adpay_adjm_x is null" );
}else{
	System.out.println(this.toString+" : adpay_adjm_x is "+adpay_adjm_x );
}
String adpay_adjm_amt = req.getParameter("adpay_adjm_amt");
if( adpay_adjm_amt == null){
	System.out.println(this.toString+" : adpay_adjm_amt is null" );
}else{
	System.out.println(this.toString+" : adpay_adjm_amt is "+adpay_adjm_amt );
}
String evnt_cd_seq = req.getParameter("evnt_cd_seq");
if( evnt_cd_seq == null){
	System.out.println(this.toString+" : evnt_cd_seq is null" );
}else{
	System.out.println(this.toString+" : evnt_cd_seq is "+evnt_cd_seq );
}
String prop_equip_cd = req.getParameter("prop_equip_cd");
if( prop_equip_cd == null){
	System.out.println(this.toString+" : prop_equip_cd is null" );
}else{
	System.out.println(this.toString+" : prop_equip_cd is "+prop_equip_cd );
}
String rcpt_prof_clsf = req.getParameter("rcpt_prof_clsf");
if( rcpt_prof_clsf == null){
	System.out.println(this.toString+" : rcpt_prof_clsf is null" );
}else{
	System.out.println(this.toString+" : rcpt_prof_clsf is "+rcpt_prof_clsf );
}
String bank_clsf = req.getParameter("bank_clsf");
if( bank_clsf == null){
	System.out.println(this.toString+" : bank_clsf is null" );
}else{
	System.out.println(this.toString+" : bank_clsf is "+bank_clsf );
}
String acct_no = req.getParameter("acct_no");
if( acct_no == null){
	System.out.println(this.toString+" : acct_no is null" );
}else{
	System.out.println(this.toString+" : acct_no is "+acct_no );
}
String deps_pers_nm = req.getParameter("deps_pers_nm");
if( deps_pers_nm == null){
	System.out.println(this.toString+" : deps_pers_nm is null" );
}else{
	System.out.println(this.toString+" : deps_pers_nm is "+deps_pers_nm );
}
String draft_doc_no = req.getParameter("draft_doc_no");
if( draft_doc_no == null){
	System.out.println(this.toString+" : draft_doc_no is null" );
}else{
	System.out.println(this.toString+" : draft_doc_no is "+draft_doc_no );
}
String draft_expn_amt = req.getParameter("draft_expn_amt");
if( draft_expn_amt == null){
	System.out.println(this.toString+" : draft_expn_amt is null" );
}else{
	System.out.println(this.toString+" : draft_expn_amt is "+draft_expn_amt );
}
String recp_pers_clsf = req.getParameter("recp_pers_clsf");
if( recp_pers_clsf == null){
	System.out.println(this.toString+" : recp_pers_clsf is null" );
}else{
	System.out.println(this.toString+" : recp_pers_clsf is "+recp_pers_clsf );
}
String recp_pers = req.getParameter("recp_pers");
if( recp_pers == null){
	System.out.println(this.toString+" : recp_pers is null" );
}else{
	System.out.println(this.toString+" : recp_pers is "+recp_pers );
}
String draft_doc_dept_cd = req.getParameter("draft_doc_dept_cd");
if( draft_doc_dept_cd == null){
	System.out.println(this.toString+" : draft_doc_dept_cd is null" );
}else{
	System.out.println(this.toString+" : draft_doc_dept_cd is "+draft_doc_dept_cd );
}
String semuro_occr_dt = req.getParameter("semuro_occr_dt");
if( semuro_occr_dt == null){
	System.out.println(this.toString+" : semuro_occr_dt is null" );
}else{
	System.out.println(this.toString+" : semuro_occr_dt is "+semuro_occr_dt );
}
String semuro_seq = req.getParameter("semuro_seq");
if( semuro_seq == null){
	System.out.println(this.toString+" : semuro_seq is null" );
}else{
	System.out.println(this.toString+" : semuro_seq is "+semuro_seq );
}
String semuro_no = req.getParameter("semuro_no");
if( semuro_no == null){
	System.out.println(this.toString+" : semuro_no is null" );
}else{
	System.out.println(this.toString+" : semuro_no is "+semuro_no );
}
String email_id = req.getParameter("email_id");
if( email_id == null){
	System.out.println(this.toString+" : email_id is null" );
}else{
	System.out.println(this.toString+" : email_id is "+email_id );
}
String recp_pers_clsf1 = req.getParameter("recp_pers_clsf1");
if( recp_pers_clsf1 == null){
	System.out.println(this.toString+" : recp_pers_clsf1 is null" );
}else{
	System.out.println(this.toString+" : recp_pers_clsf1 is "+recp_pers_clsf1 );
}
String recp_pers1 = req.getParameter("recp_pers1");
if( recp_pers1 == null){
	System.out.println(this.toString+" : recp_pers1 is null" );
}else{
	System.out.println(this.toString+" : recp_pers1 is "+recp_pers1 );
}
String recp_pers_nm1 = req.getParameter("recp_pers_nm1");
if( recp_pers_nm1 == null){
	System.out.println(this.toString+" : recp_pers_nm1 is null" );
}else{
	System.out.println(this.toString+" : recp_pers_nm1 is "+recp_pers_nm1 );
}
String chnl_clsf_cd = req.getParameter("chnl_clsf_cd");
if( chnl_clsf_cd == null){
	System.out.println(this.toString+" : chnl_clsf_cd is null" );
}else{
	System.out.println(this.toString+" : chnl_clsf_cd is "+chnl_clsf_cd );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String inupd_flag = Util.checkString(req.getParameter("inupd_flag"));
String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String slip_occr_dt = Util.checkString(req.getParameter("slip_occr_dt"));
String slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
String slip_seq = Util.checkString(req.getParameter("slip_seq"));
String rece_exp_aplc_yn = Util.checkString(req.getParameter("rece_exp_aplc_yn"));
String titl = Util.checkString(req.getParameter("titl"));
String reso_amt = Util.checkString(req.getParameter("reso_amt"));
String expn_hope_dt = Util.checkString(req.getParameter("expn_hope_dt"));
String expn_clsf = Util.checkString(req.getParameter("expn_clsf"));
String clam_dept_cd = Util.checkString(req.getParameter("clam_dept_cd"));
String evnt_cd = Util.checkString(req.getParameter("evnt_cd"));
String budg_yymm = Util.checkString(req.getParameter("budg_yymm"));
String chrg_emp_no = Util.checkString(req.getParameter("chrg_emp_no"));
String chg_pers = Util.checkString(req.getParameter("chg_pers"));
String incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
String slip_sub_seq = Util.checkString(req.getParameter("slip_sub_seq"));
String slip_arow_no = Util.checkString(req.getParameter("slip_arow_no"));
String budg_cd = Util.checkString(req.getParameter("budg_cd"));
String use_dept_cd = Util.checkString(req.getParameter("use_dept_cd"));
String rmks2 = Util.checkString(req.getParameter("rmks2"));
String dlco_clsf_cd = Util.checkString(req.getParameter("dlco_clsf_cd"));
String dlco_cd = Util.checkString(req.getParameter("dlco_cd"));
String dlco_nm = Util.checkString(req.getParameter("dlco_nm"));
String boks_dlco_nm = Util.checkString(req.getParameter("boks_dlco_nm"));
String mang_clsf_cd = Util.checkString(req.getParameter("mang_clsf_cd"));
String mang_no = Util.checkString(req.getParameter("mang_no"));
String incm_clsf_cd = Util.checkString(req.getParameter("incm_clsf_cd"));
String etc_in = Util.checkString(req.getParameter("etc_in"));
String setoff_slip_occr_dt = Util.checkString(req.getParameter("setoff_slip_occr_dt"));
String medi_cd = Util.checkString(req.getParameter("medi_cd"));
String dtls_medi_cd = Util.checkString(req.getParameter("dtls_medi_cd"));
String comp_dt = Util.checkString(req.getParameter("comp_dt"));
String mtry_dt = Util.checkString(req.getParameter("mtry_dt"));
String unit = Util.checkString(req.getParameter("unit"));
String qunt = Util.checkString(req.getParameter("qunt"));
String tax_stmt_no = Util.checkString(req.getParameter("tax_stmt_no"));
String make_dt = Util.checkString(req.getParameter("make_dt"));
String erplace_cd = Util.checkString(req.getParameter("erplace_cd"));
String ern = Util.checkString(req.getParameter("ern"));
String tax_suply_amt = Util.checkString(req.getParameter("tax_suply_amt"));
String tax_vat_amt = Util.checkString(req.getParameter("tax_vat_amt"));
String suply_amt = Util.checkString(req.getParameter("suply_amt"));
String vat_amt = Util.checkString(req.getParameter("vat_amt"));
String with_tax = Util.checkString(req.getParameter("with_tax"));
String incm_tax = Util.checkString(req.getParameter("incm_tax"));
String res_tax = Util.checkString(req.getParameter("res_tax"));
String purc_amt = Util.checkString(req.getParameter("purc_amt"));
String int_rate = Util.checkString(req.getParameter("int_rate"));
String pay_bank_cd = Util.checkString(req.getParameter("pay_bank_cd"));
String corp_tax_amt = Util.checkString(req.getParameter("corp_tax_amt"));
String issu_dt = Util.checkString(req.getParameter("issu_dt"));
String insr_nm = Util.checkString(req.getParameter("insr_nm"));
String adpay_adjm_count = Util.checkString(req.getParameter("adpay_adjm_count"));
String adpay_adjm_sgno = Util.checkString(req.getParameter("adpay_adjm_sgno"));
String adpay_adjm_x = Util.checkString(req.getParameter("adpay_adjm_x"));
String adpay_adjm_amt = Util.checkString(req.getParameter("adpay_adjm_amt"));
String evnt_cd_seq = Util.checkString(req.getParameter("evnt_cd_seq"));
String prop_equip_cd = Util.checkString(req.getParameter("prop_equip_cd"));
String rcpt_prof_clsf = Util.checkString(req.getParameter("rcpt_prof_clsf"));
String bank_clsf = Util.checkString(req.getParameter("bank_clsf"));
String acct_no = Util.checkString(req.getParameter("acct_no"));
String deps_pers_nm = Util.checkString(req.getParameter("deps_pers_nm"));
String draft_doc_no = Util.checkString(req.getParameter("draft_doc_no"));
String draft_expn_amt = Util.checkString(req.getParameter("draft_expn_amt"));
String recp_pers_clsf = Util.checkString(req.getParameter("recp_pers_clsf"));
String recp_pers = Util.checkString(req.getParameter("recp_pers"));
String draft_doc_dept_cd = Util.checkString(req.getParameter("draft_doc_dept_cd"));
String semuro_occr_dt = Util.checkString(req.getParameter("semuro_occr_dt"));
String semuro_seq = Util.checkString(req.getParameter("semuro_seq"));
String semuro_no = Util.checkString(req.getParameter("semuro_no"));
String email_id = Util.checkString(req.getParameter("email_id"));
String recp_pers_clsf1 = Util.checkString(req.getParameter("recp_pers_clsf1"));
String recp_pers1 = Util.checkString(req.getParameter("recp_pers1"));
String recp_pers_nm1 = Util.checkString(req.getParameter("recp_pers_nm1"));
String chnl_clsf_cd = Util.checkString(req.getParameter("chnl_clsf_cd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String inupd_flag = Util.Uni2Ksc(Util.checkString(req.getParameter("inupd_flag")));
String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String slip_occr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_occr_dt")));
String slip_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_clsf_cd")));
String slip_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_seq")));
String rece_exp_aplc_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("rece_exp_aplc_yn")));
String titl = Util.Uni2Ksc(Util.checkString(req.getParameter("titl")));
String reso_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("reso_amt")));
String expn_hope_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("expn_hope_dt")));
String expn_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("expn_clsf")));
String clam_dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("clam_dept_cd")));
String evnt_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("evnt_cd")));
String budg_yymm = Util.Uni2Ksc(Util.checkString(req.getParameter("budg_yymm")));
String chrg_emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("chrg_emp_no")));
String chg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("chg_pers")));
String incmg_pers_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipadd")));
String slip_sub_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_sub_seq")));
String slip_arow_no = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_arow_no")));
String budg_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("budg_cd")));
String use_dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("use_dept_cd")));
String rmks2 = Util.Uni2Ksc(Util.checkString(req.getParameter("rmks2")));
String dlco_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_clsf_cd")));
String dlco_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_cd")));
String dlco_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_nm")));
String boks_dlco_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("boks_dlco_nm")));
String mang_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("mang_clsf_cd")));
String mang_no = Util.Uni2Ksc(Util.checkString(req.getParameter("mang_no")));
String incm_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("incm_clsf_cd")));
String etc_in = Util.Uni2Ksc(Util.checkString(req.getParameter("etc_in")));
String setoff_slip_occr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("setoff_slip_occr_dt")));
String medi_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_cd")));
String dtls_medi_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dtls_medi_cd")));
String comp_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("comp_dt")));
String mtry_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("mtry_dt")));
String unit = Util.Uni2Ksc(Util.checkString(req.getParameter("unit")));
String qunt = Util.Uni2Ksc(Util.checkString(req.getParameter("qunt")));
String tax_stmt_no = Util.Uni2Ksc(Util.checkString(req.getParameter("tax_stmt_no")));
String make_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("make_dt")));
String erplace_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("erplace_cd")));
String ern = Util.Uni2Ksc(Util.checkString(req.getParameter("ern")));
String tax_suply_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("tax_suply_amt")));
String tax_vat_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("tax_vat_amt")));
String suply_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("suply_amt")));
String vat_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("vat_amt")));
String with_tax = Util.Uni2Ksc(Util.checkString(req.getParameter("with_tax")));
String incm_tax = Util.Uni2Ksc(Util.checkString(req.getParameter("incm_tax")));
String res_tax = Util.Uni2Ksc(Util.checkString(req.getParameter("res_tax")));
String purc_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("purc_amt")));
String int_rate = Util.Uni2Ksc(Util.checkString(req.getParameter("int_rate")));
String pay_bank_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("pay_bank_cd")));
String corp_tax_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("corp_tax_amt")));
String issu_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("issu_dt")));
String insr_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("insr_nm")));
String adpay_adjm_count = Util.Uni2Ksc(Util.checkString(req.getParameter("adpay_adjm_count")));
String adpay_adjm_sgno = Util.Uni2Ksc(Util.checkString(req.getParameter("adpay_adjm_sgno")));
String adpay_adjm_x = Util.Uni2Ksc(Util.checkString(req.getParameter("adpay_adjm_x")));
String adpay_adjm_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("adpay_adjm_amt")));
String evnt_cd_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("evnt_cd_seq")));
String prop_equip_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("prop_equip_cd")));
String rcpt_prof_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("rcpt_prof_clsf")));
String bank_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("bank_clsf")));
String acct_no = Util.Uni2Ksc(Util.checkString(req.getParameter("acct_no")));
String deps_pers_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("deps_pers_nm")));
String draft_doc_no = Util.Uni2Ksc(Util.checkString(req.getParameter("draft_doc_no")));
String draft_expn_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("draft_expn_amt")));
String recp_pers_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("recp_pers_clsf")));
String recp_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("recp_pers")));
String draft_doc_dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("draft_doc_dept_cd")));
String semuro_occr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("semuro_occr_dt")));
String semuro_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("semuro_seq")));
String semuro_no = Util.Uni2Ksc(Util.checkString(req.getParameter("semuro_no")));
String email_id = Util.Uni2Ksc(Util.checkString(req.getParameter("email_id")));
String recp_pers_clsf1 = Util.Uni2Ksc(Util.checkString(req.getParameter("recp_pers_clsf1")));
String recp_pers1 = Util.Uni2Ksc(Util.checkString(req.getParameter("recp_pers1")));
String recp_pers_nm1 = Util.Uni2Ksc(Util.checkString(req.getParameter("recp_pers_nm1")));
String chnl_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("chnl_clsf_cd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setInupd_flag(inupd_flag);
dm.setCmpy_cd(cmpy_cd);
dm.setSlip_occr_dt(slip_occr_dt);
dm.setSlip_clsf_cd(slip_clsf_cd);
dm.setSlip_seq(slip_seq);
dm.setRece_exp_aplc_yn(rece_exp_aplc_yn);
dm.setTitl(titl);
dm.setReso_amt(reso_amt);
dm.setExpn_hope_dt(expn_hope_dt);
dm.setExpn_clsf(expn_clsf);
dm.setClam_dept_cd(clam_dept_cd);
dm.setEvnt_cd(evnt_cd);
dm.setBudg_yymm(budg_yymm);
dm.setChrg_emp_no(chrg_emp_no);
dm.setChg_pers(chg_pers);
dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
dm.setSlip_sub_seq(slip_sub_seq);
dm.setSlip_arow_no(slip_arow_no);
dm.setBudg_cd(budg_cd);
dm.setUse_dept_cd(use_dept_cd);
dm.setRmks2(rmks2);
dm.setDlco_clsf_cd(dlco_clsf_cd);
dm.setDlco_cd(dlco_cd);
dm.setDlco_nm(dlco_nm);
dm.setBoks_dlco_nm(boks_dlco_nm);
dm.setMang_clsf_cd(mang_clsf_cd);
dm.setMang_no(mang_no);
dm.setIncm_clsf_cd(incm_clsf_cd);
dm.setEtc_in(etc_in);
dm.setSetoff_slip_occr_dt(setoff_slip_occr_dt);
dm.setMedi_cd(medi_cd);
dm.setDtls_medi_cd(dtls_medi_cd);
dm.setComp_dt(comp_dt);
dm.setMtry_dt(mtry_dt);
dm.setUnit(unit);
dm.setQunt(qunt);
dm.setTax_stmt_no(tax_stmt_no);
dm.setMake_dt(make_dt);
dm.setErplace_cd(erplace_cd);
dm.setErn(ern);
dm.setTax_suply_amt(tax_suply_amt);
dm.setTax_vat_amt(tax_vat_amt);
dm.setSuply_amt(suply_amt);
dm.setVat_amt(vat_amt);
dm.setWith_tax(with_tax);
dm.setIncm_tax(incm_tax);
dm.setRes_tax(res_tax);
dm.setPurc_amt(purc_amt);
dm.setInt_rate(int_rate);
dm.setPay_bank_cd(pay_bank_cd);
dm.setCorp_tax_amt(corp_tax_amt);
dm.setIssu_dt(issu_dt);
dm.setInsr_nm(insr_nm);
dm.setAdpay_adjm_count(adpay_adjm_count);
dm.setAdpay_adjm_sgno(adpay_adjm_sgno);
dm.setAdpay_adjm_x(adpay_adjm_x);
dm.setAdpay_adjm_amt(adpay_adjm_amt);
dm.setEvnt_cd_seq(evnt_cd_seq);
dm.setProp_equip_cd(prop_equip_cd);
dm.setRcpt_prof_clsf(rcpt_prof_clsf);
dm.setBank_clsf(bank_clsf);
dm.setAcct_no(acct_no);
dm.setDeps_pers_nm(deps_pers_nm);
dm.setDraft_doc_no(draft_doc_no);
dm.setDraft_expn_amt(draft_expn_amt);
dm.setRecp_pers_clsf(recp_pers_clsf);
dm.setRecp_pers(recp_pers);
dm.setDraft_doc_dept_cd(draft_doc_dept_cd);
dm.setSemuro_occr_dt(semuro_occr_dt);
dm.setSemuro_seq(semuro_seq);
dm.setSemuro_no(semuro_no);
dm.setEmail_id(email_id);
dm.setRecp_pers_clsf1(recp_pers_clsf1);
dm.setRecp_pers1(recp_pers1);
dm.setRecp_pers_nm1(recp_pers_nm1);
dm.setChnl_clsf_cd(chnl_clsf_cd);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Dec 18 15:26:14 KST 2014 */
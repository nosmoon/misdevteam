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


package chosun.ciis.en.innexp.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.en.innexp.ds.*;
import chosun.ciis.en.innexp.rec.*;

/**
 * 
 */


public class EN_INNEXP_1020_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String mst_mode;
	public String incmg_pers_ip;
	public String incmg_pers;
	public String chg_pers;
	public String cmpy_cd;
	public String occr_dt;
	public String occr_seq;
	public String reven_dt;
	public String dlco_clsf_cd;
	public String dlco_no;
	public String boks_dlco_nm;
	public String titl;
	public String rcpm_shet_kind;
	public String rcpm_shet_no;
	public String reven_amt;
	public String vat_amt;
	public String rcpm_amt;
	public String stmt_occr_dt;
	public String stmt_occr_seq;
	public String p_upd_occr_dt;
	public String p_upd_occr_seq;
	public String chrg_dept_cd;
	public String chrg_pers_emp_no;
	public String evnt_yy;
	public String evnt_cd;
	public String evnt_seq;
	public String payo_clsf;
	public String rcpm_occr_dt;
	public String rcpm_occr_seq;
	public String remk;
	public String drcr_clsf;
	public String budg_cd;
	public String amt;
	public String acct_mang_no;
	public String rmtt_dt;
	public String rmtt_plac;
	public String note_no;
	public String note_clsf_cd;
	public String bank_cd;
	public String issu_pers_nm;
	public String issu_cmpy_clsf_cd;
	public String comp_dt;
	public String mtry_dt;
	public String sale_aprv_no;
	public String rcpm_acct;
	public String bal_occr_slip_no;
	public String extnc_obj_slip_clsf;
	public String extnc_dlco_no;
	public String medi_cd;
	public String biz_reg_no;
	public String bank_id;
	public String acct_num;
	public String tran_date;
	public String tran_date_seq;
	public String slip_no;
	public String vitl_biz_reg_no;
	public String vitl_bank_id;
	public String vitl_acct_num;
	public String vitl_tran_date;
	public String vitl_tran_date_seq;
	public String vitl_slip_no;
	public String vitl_extnc_amt;
	public String chg_unrcp_amt;
	public String chk_note_no;
	public String chk_bank_cd;

	public EN_INNEXP_1020_ADM(){}
	public EN_INNEXP_1020_ADM(String mst_mode, String incmg_pers_ip, String incmg_pers, String chg_pers, String cmpy_cd, String occr_dt, String occr_seq, String reven_dt, String dlco_clsf_cd, String dlco_no, String boks_dlco_nm, String titl, String rcpm_shet_kind, String rcpm_shet_no, String reven_amt, String vat_amt, String rcpm_amt, String stmt_occr_dt, String stmt_occr_seq, String p_upd_occr_dt, String p_upd_occr_seq, String chrg_dept_cd, String chrg_pers_emp_no, String evnt_yy, String evnt_cd, String evnt_seq, String payo_clsf, String rcpm_occr_dt, String rcpm_occr_seq, String remk, String drcr_clsf, String budg_cd, String amt, String acct_mang_no, String rmtt_dt, String rmtt_plac, String note_no, String note_clsf_cd, String bank_cd, String issu_pers_nm, String issu_cmpy_clsf_cd, String comp_dt, String mtry_dt, String sale_aprv_no, String rcpm_acct, String bal_occr_slip_no, String extnc_obj_slip_clsf, String extnc_dlco_no, String medi_cd, String biz_reg_no, String bank_id, String acct_num, String tran_date, String tran_date_seq, String slip_no, String vitl_biz_reg_no, String vitl_bank_id, String vitl_acct_num, String vitl_tran_date, String vitl_tran_date_seq, String vitl_slip_no, String vitl_extnc_amt, String chg_unrcp_amt, String chk_note_no, String chk_bank_cd){
		this.mst_mode = mst_mode;
		this.incmg_pers_ip = incmg_pers_ip;
		this.incmg_pers = incmg_pers;
		this.chg_pers = chg_pers;
		this.cmpy_cd = cmpy_cd;
		this.occr_dt = occr_dt;
		this.occr_seq = occr_seq;
		this.reven_dt = reven_dt;
		this.dlco_clsf_cd = dlco_clsf_cd;
		this.dlco_no = dlco_no;
		this.boks_dlco_nm = boks_dlco_nm;
		this.titl = titl;
		this.rcpm_shet_kind = rcpm_shet_kind;
		this.rcpm_shet_no = rcpm_shet_no;
		this.reven_amt = reven_amt;
		this.vat_amt = vat_amt;
		this.rcpm_amt = rcpm_amt;
		this.stmt_occr_dt = stmt_occr_dt;
		this.stmt_occr_seq = stmt_occr_seq;
		this.p_upd_occr_dt = p_upd_occr_dt;
		this.p_upd_occr_seq = p_upd_occr_seq;
		this.chrg_dept_cd = chrg_dept_cd;
		this.chrg_pers_emp_no = chrg_pers_emp_no;
		this.evnt_yy = evnt_yy;
		this.evnt_cd = evnt_cd;
		this.evnt_seq = evnt_seq;
		this.payo_clsf = payo_clsf;
		this.rcpm_occr_dt = rcpm_occr_dt;
		this.rcpm_occr_seq = rcpm_occr_seq;
		this.remk = remk;
		this.drcr_clsf = drcr_clsf;
		this.budg_cd = budg_cd;
		this.amt = amt;
		this.acct_mang_no = acct_mang_no;
		this.rmtt_dt = rmtt_dt;
		this.rmtt_plac = rmtt_plac;
		this.note_no = note_no;
		this.note_clsf_cd = note_clsf_cd;
		this.bank_cd = bank_cd;
		this.issu_pers_nm = issu_pers_nm;
		this.issu_cmpy_clsf_cd = issu_cmpy_clsf_cd;
		this.comp_dt = comp_dt;
		this.mtry_dt = mtry_dt;
		this.sale_aprv_no = sale_aprv_no;
		this.rcpm_acct = rcpm_acct;
		this.bal_occr_slip_no = bal_occr_slip_no;
		this.extnc_obj_slip_clsf = extnc_obj_slip_clsf;
		this.extnc_dlco_no = extnc_dlco_no;
		this.medi_cd = medi_cd;
		this.biz_reg_no = biz_reg_no;
		this.bank_id = bank_id;
		this.acct_num = acct_num;
		this.tran_date = tran_date;
		this.tran_date_seq = tran_date_seq;
		this.slip_no = slip_no;
		this.vitl_biz_reg_no = vitl_biz_reg_no;
		this.vitl_bank_id = vitl_bank_id;
		this.vitl_acct_num = vitl_acct_num;
		this.vitl_tran_date = vitl_tran_date;
		this.vitl_tran_date_seq = vitl_tran_date_seq;
		this.vitl_slip_no = vitl_slip_no;
		this.vitl_extnc_amt = vitl_extnc_amt;
		this.chg_unrcp_amt = chg_unrcp_amt;
		this.chk_note_no = chk_note_no;
		this.chk_bank_cd = chk_bank_cd;
	}

	public void setMst_mode(String mst_mode){
		this.mst_mode = mst_mode;
	}

	public void setIncmg_pers_ip(String incmg_pers_ip){
		this.incmg_pers_ip = incmg_pers_ip;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setChg_pers(String chg_pers){
		this.chg_pers = chg_pers;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setOccr_dt(String occr_dt){
		this.occr_dt = occr_dt;
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

	public void setBoks_dlco_nm(String boks_dlco_nm){
		this.boks_dlco_nm = boks_dlco_nm;
	}

	public void setTitl(String titl){
		this.titl = titl;
	}

	public void setRcpm_shet_kind(String rcpm_shet_kind){
		this.rcpm_shet_kind = rcpm_shet_kind;
	}

	public void setRcpm_shet_no(String rcpm_shet_no){
		this.rcpm_shet_no = rcpm_shet_no;
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

	public void setStmt_occr_dt(String stmt_occr_dt){
		this.stmt_occr_dt = stmt_occr_dt;
	}

	public void setStmt_occr_seq(String stmt_occr_seq){
		this.stmt_occr_seq = stmt_occr_seq;
	}

	public void setP_upd_occr_dt(String p_upd_occr_dt){
		this.p_upd_occr_dt = p_upd_occr_dt;
	}

	public void setP_upd_occr_seq(String p_upd_occr_seq){
		this.p_upd_occr_seq = p_upd_occr_seq;
	}

	public void setChrg_dept_cd(String chrg_dept_cd){
		this.chrg_dept_cd = chrg_dept_cd;
	}

	public void setChrg_pers_emp_no(String chrg_pers_emp_no){
		this.chrg_pers_emp_no = chrg_pers_emp_no;
	}

	public void setEvnt_yy(String evnt_yy){
		this.evnt_yy = evnt_yy;
	}

	public void setEvnt_cd(String evnt_cd){
		this.evnt_cd = evnt_cd;
	}

	public void setEvnt_seq(String evnt_seq){
		this.evnt_seq = evnt_seq;
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

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setDrcr_clsf(String drcr_clsf){
		this.drcr_clsf = drcr_clsf;
	}

	public void setBudg_cd(String budg_cd){
		this.budg_cd = budg_cd;
	}

	public void setAmt(String amt){
		this.amt = amt;
	}

	public void setAcct_mang_no(String acct_mang_no){
		this.acct_mang_no = acct_mang_no;
	}

	public void setRmtt_dt(String rmtt_dt){
		this.rmtt_dt = rmtt_dt;
	}

	public void setRmtt_plac(String rmtt_plac){
		this.rmtt_plac = rmtt_plac;
	}

	public void setNote_no(String note_no){
		this.note_no = note_no;
	}

	public void setNote_clsf_cd(String note_clsf_cd){
		this.note_clsf_cd = note_clsf_cd;
	}

	public void setBank_cd(String bank_cd){
		this.bank_cd = bank_cd;
	}

	public void setIssu_pers_nm(String issu_pers_nm){
		this.issu_pers_nm = issu_pers_nm;
	}

	public void setIssu_cmpy_clsf_cd(String issu_cmpy_clsf_cd){
		this.issu_cmpy_clsf_cd = issu_cmpy_clsf_cd;
	}

	public void setComp_dt(String comp_dt){
		this.comp_dt = comp_dt;
	}

	public void setMtry_dt(String mtry_dt){
		this.mtry_dt = mtry_dt;
	}

	public void setSale_aprv_no(String sale_aprv_no){
		this.sale_aprv_no = sale_aprv_no;
	}

	public void setRcpm_acct(String rcpm_acct){
		this.rcpm_acct = rcpm_acct;
	}

	public void setBal_occr_slip_no(String bal_occr_slip_no){
		this.bal_occr_slip_no = bal_occr_slip_no;
	}

	public void setExtnc_obj_slip_clsf(String extnc_obj_slip_clsf){
		this.extnc_obj_slip_clsf = extnc_obj_slip_clsf;
	}

	public void setExtnc_dlco_no(String extnc_dlco_no){
		this.extnc_dlco_no = extnc_dlco_no;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setBiz_reg_no(String biz_reg_no){
		this.biz_reg_no = biz_reg_no;
	}

	public void setBank_id(String bank_id){
		this.bank_id = bank_id;
	}

	public void setAcct_num(String acct_num){
		this.acct_num = acct_num;
	}

	public void setTran_date(String tran_date){
		this.tran_date = tran_date;
	}

	public void setTran_date_seq(String tran_date_seq){
		this.tran_date_seq = tran_date_seq;
	}

	public void setSlip_no(String slip_no){
		this.slip_no = slip_no;
	}

	public void setVitl_biz_reg_no(String vitl_biz_reg_no){
		this.vitl_biz_reg_no = vitl_biz_reg_no;
	}

	public void setVitl_bank_id(String vitl_bank_id){
		this.vitl_bank_id = vitl_bank_id;
	}

	public void setVitl_acct_num(String vitl_acct_num){
		this.vitl_acct_num = vitl_acct_num;
	}

	public void setVitl_tran_date(String vitl_tran_date){
		this.vitl_tran_date = vitl_tran_date;
	}

	public void setVitl_tran_date_seq(String vitl_tran_date_seq){
		this.vitl_tran_date_seq = vitl_tran_date_seq;
	}

	public void setVitl_slip_no(String vitl_slip_no){
		this.vitl_slip_no = vitl_slip_no;
	}

	public void setVitl_extnc_amt(String vitl_extnc_amt){
		this.vitl_extnc_amt = vitl_extnc_amt;
	}

	public void setChg_unrcp_amt(String chg_unrcp_amt){
		this.chg_unrcp_amt = chg_unrcp_amt;
	}

	public void setChk_note_no(String chk_note_no){
		this.chk_note_no = chk_note_no;
	}

	public void setChk_bank_cd(String chk_bank_cd){
		this.chk_bank_cd = chk_bank_cd;
	}

	public String getMst_mode(){
		return this.mst_mode;
	}

	public String getIncmg_pers_ip(){
		return this.incmg_pers_ip;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getChg_pers(){
		return this.chg_pers;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getOccr_dt(){
		return this.occr_dt;
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

	public String getBoks_dlco_nm(){
		return this.boks_dlco_nm;
	}

	public String getTitl(){
		return this.titl;
	}

	public String getRcpm_shet_kind(){
		return this.rcpm_shet_kind;
	}

	public String getRcpm_shet_no(){
		return this.rcpm_shet_no;
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

	public String getStmt_occr_dt(){
		return this.stmt_occr_dt;
	}

	public String getStmt_occr_seq(){
		return this.stmt_occr_seq;
	}

	public String getP_upd_occr_dt(){
		return this.p_upd_occr_dt;
	}

	public String getP_upd_occr_seq(){
		return this.p_upd_occr_seq;
	}

	public String getChrg_dept_cd(){
		return this.chrg_dept_cd;
	}

	public String getChrg_pers_emp_no(){
		return this.chrg_pers_emp_no;
	}

	public String getEvnt_yy(){
		return this.evnt_yy;
	}

	public String getEvnt_cd(){
		return this.evnt_cd;
	}

	public String getEvnt_seq(){
		return this.evnt_seq;
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

	public String getRemk(){
		return this.remk;
	}

	public String getDrcr_clsf(){
		return this.drcr_clsf;
	}

	public String getBudg_cd(){
		return this.budg_cd;
	}

	public String getAmt(){
		return this.amt;
	}

	public String getAcct_mang_no(){
		return this.acct_mang_no;
	}

	public String getRmtt_dt(){
		return this.rmtt_dt;
	}

	public String getRmtt_plac(){
		return this.rmtt_plac;
	}

	public String getNote_no(){
		return this.note_no;
	}

	public String getNote_clsf_cd(){
		return this.note_clsf_cd;
	}

	public String getBank_cd(){
		return this.bank_cd;
	}

	public String getIssu_pers_nm(){
		return this.issu_pers_nm;
	}

	public String getIssu_cmpy_clsf_cd(){
		return this.issu_cmpy_clsf_cd;
	}

	public String getComp_dt(){
		return this.comp_dt;
	}

	public String getMtry_dt(){
		return this.mtry_dt;
	}

	public String getSale_aprv_no(){
		return this.sale_aprv_no;
	}

	public String getRcpm_acct(){
		return this.rcpm_acct;
	}

	public String getBal_occr_slip_no(){
		return this.bal_occr_slip_no;
	}

	public String getExtnc_obj_slip_clsf(){
		return this.extnc_obj_slip_clsf;
	}

	public String getExtnc_dlco_no(){
		return this.extnc_dlco_no;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getBiz_reg_no(){
		return this.biz_reg_no;
	}

	public String getBank_id(){
		return this.bank_id;
	}

	public String getAcct_num(){
		return this.acct_num;
	}

	public String getTran_date(){
		return this.tran_date;
	}

	public String getTran_date_seq(){
		return this.tran_date_seq;
	}

	public String getSlip_no(){
		return this.slip_no;
	}

	public String getVitl_biz_reg_no(){
		return this.vitl_biz_reg_no;
	}

	public String getVitl_bank_id(){
		return this.vitl_bank_id;
	}

	public String getVitl_acct_num(){
		return this.vitl_acct_num;
	}

	public String getVitl_tran_date(){
		return this.vitl_tran_date;
	}

	public String getVitl_tran_date_seq(){
		return this.vitl_tran_date_seq;
	}

	public String getVitl_slip_no(){
		return this.vitl_slip_no;
	}

	public String getVitl_extnc_amt(){
		return this.vitl_extnc_amt;
	}

	public String getChg_unrcp_amt(){
		return this.chg_unrcp_amt;
	}

	public String getChk_note_no(){
		return this.chk_note_no;
	}

	public String getChk_bank_cd(){
		return this.chk_bank_cd;
	}

	public String getSQL(){
		 return "{ call MISENP.SP_EN_INNEXP_1020_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		EN_INNEXP_1020_ADM dm = (EN_INNEXP_1020_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.mst_mode);
		cstmt.setString(4, dm.incmg_pers_ip);
		cstmt.setString(5, dm.incmg_pers);
		cstmt.setString(6, dm.chg_pers);
		cstmt.setString(7, dm.cmpy_cd);
		cstmt.setString(8, dm.occr_dt);
		cstmt.setString(9, dm.occr_seq);
		cstmt.setString(10, dm.reven_dt);
		cstmt.setString(11, dm.dlco_clsf_cd);
		cstmt.setString(12, dm.dlco_no);
		cstmt.setString(13, dm.boks_dlco_nm);
		cstmt.setString(14, dm.titl);
		cstmt.setString(15, dm.rcpm_shet_kind);
		cstmt.setString(16, dm.rcpm_shet_no);
		cstmt.setString(17, dm.reven_amt);
		cstmt.setString(18, dm.vat_amt);
		cstmt.setString(19, dm.rcpm_amt);
		cstmt.setString(20, dm.stmt_occr_dt);
		cstmt.setString(21, dm.stmt_occr_seq);
		cstmt.setString(22, dm.p_upd_occr_dt);
		cstmt.setString(23, dm.p_upd_occr_seq);
		cstmt.setString(24, dm.chrg_dept_cd);
		cstmt.setString(25, dm.chrg_pers_emp_no);
		cstmt.setString(26, dm.evnt_yy);
		cstmt.setString(27, dm.evnt_cd);
		cstmt.setString(28, dm.evnt_seq);
		cstmt.setString(29, dm.payo_clsf);
		cstmt.setString(30, dm.rcpm_occr_dt);
		cstmt.setString(31, dm.rcpm_occr_seq);
		cstmt.setString(32, dm.remk);
		cstmt.setString(33, dm.drcr_clsf);
		cstmt.setString(34, dm.budg_cd);
		cstmt.setString(35, dm.amt);
		cstmt.setString(36, dm.acct_mang_no);
		cstmt.setString(37, dm.rmtt_dt);
		cstmt.setString(38, dm.rmtt_plac);
		cstmt.setString(39, dm.note_no);
		cstmt.setString(40, dm.note_clsf_cd);
		cstmt.setString(41, dm.bank_cd);
		cstmt.setString(42, dm.issu_pers_nm);
		cstmt.setString(43, dm.issu_cmpy_clsf_cd);
		cstmt.setString(44, dm.comp_dt);
		cstmt.setString(45, dm.mtry_dt);
		cstmt.setString(46, dm.sale_aprv_no);
		cstmt.setString(47, dm.rcpm_acct);
		cstmt.setString(48, dm.bal_occr_slip_no);
		cstmt.setString(49, dm.extnc_obj_slip_clsf);
		cstmt.setString(50, dm.extnc_dlco_no);
		cstmt.setString(51, dm.medi_cd);
		cstmt.setString(52, dm.biz_reg_no);
		cstmt.setString(53, dm.bank_id);
		cstmt.setString(54, dm.acct_num);
		cstmt.setString(55, dm.tran_date);
		cstmt.setString(56, dm.tran_date_seq);
		cstmt.setString(57, dm.slip_no);
		cstmt.setString(58, dm.vitl_biz_reg_no);
		cstmt.setString(59, dm.vitl_bank_id);
		cstmt.setString(60, dm.vitl_acct_num);
		cstmt.setString(61, dm.vitl_tran_date);
		cstmt.setString(62, dm.vitl_tran_date_seq);
		cstmt.setString(63, dm.vitl_slip_no);
		cstmt.setString(64, dm.vitl_extnc_amt);
		cstmt.setString(65, dm.chg_unrcp_amt);
		cstmt.setString(66, dm.chk_note_no);
		cstmt.setString(67, dm.chk_bank_cd);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.en.innexp.ds.EN_INNEXP_1020_ADataSet();
	}



    public void print(){
        System.out.println("mst_mode = " + getMst_mode());
        System.out.println("incmg_pers_ip = " + getIncmg_pers_ip());
        System.out.println("incmg_pers = " + getIncmg_pers());
        System.out.println("chg_pers = " + getChg_pers());
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("occr_dt = " + getOccr_dt());
        System.out.println("occr_seq = " + getOccr_seq());
        System.out.println("reven_dt = " + getReven_dt());
        System.out.println("dlco_clsf_cd = " + getDlco_clsf_cd());
        System.out.println("dlco_no = " + getDlco_no());
        System.out.println("boks_dlco_nm = " + getBoks_dlco_nm());
        System.out.println("titl = " + getTitl());
        System.out.println("rcpm_shet_kind = " + getRcpm_shet_kind());
        System.out.println("rcpm_shet_no = " + getRcpm_shet_no());
        System.out.println("reven_amt = " + getReven_amt());
        System.out.println("vat_amt = " + getVat_amt());
        System.out.println("rcpm_amt = " + getRcpm_amt());
        System.out.println("stmt_occr_dt = " + getStmt_occr_dt());
        System.out.println("stmt_occr_seq = " + getStmt_occr_seq());
        System.out.println("p_upd_occr_dt = " + getP_upd_occr_dt());
        System.out.println("p_upd_occr_seq = " + getP_upd_occr_seq());
        System.out.println("chrg_dept_cd = " + getChrg_dept_cd());
        System.out.println("chrg_pers_emp_no = " + getChrg_pers_emp_no());
        System.out.println("evnt_yy = " + getEvnt_yy());
        System.out.println("evnt_cd = " + getEvnt_cd());
        System.out.println("evnt_seq = " + getEvnt_seq());
        System.out.println("payo_clsf = " + getPayo_clsf());
        System.out.println("rcpm_occr_dt = " + getRcpm_occr_dt());
        System.out.println("rcpm_occr_seq = " + getRcpm_occr_seq());
        System.out.println("remk = " + getRemk());
        System.out.println("drcr_clsf = " + getDrcr_clsf());
        System.out.println("budg_cd = " + getBudg_cd());
        System.out.println("amt = " + getAmt());
        System.out.println("acct_mang_no = " + getAcct_mang_no());
        System.out.println("rmtt_dt = " + getRmtt_dt());
        System.out.println("rmtt_plac = " + getRmtt_plac());
        System.out.println("note_no = " + getNote_no());
        System.out.println("note_clsf_cd = " + getNote_clsf_cd());
        System.out.println("bank_cd = " + getBank_cd());
        System.out.println("issu_pers_nm = " + getIssu_pers_nm());
        System.out.println("issu_cmpy_clsf_cd = " + getIssu_cmpy_clsf_cd());
        System.out.println("comp_dt = " + getComp_dt());
        System.out.println("mtry_dt = " + getMtry_dt());
        System.out.println("sale_aprv_no = " + getSale_aprv_no());
        System.out.println("rcpm_acct = " + getRcpm_acct());
        System.out.println("bal_occr_slip_no = " + getBal_occr_slip_no());
        System.out.println("extnc_obj_slip_clsf = " + getExtnc_obj_slip_clsf());
        System.out.println("extnc_dlco_no = " + getExtnc_dlco_no());
        System.out.println("medi_cd = " + getMedi_cd());
        System.out.println("biz_reg_no = " + getBiz_reg_no());
        System.out.println("bank_id = " + getBank_id());
        System.out.println("acct_num = " + getAcct_num());
        System.out.println("tran_date = " + getTran_date());
        System.out.println("tran_date_seq = " + getTran_date_seq());
        System.out.println("slip_no = " + getSlip_no());
        System.out.println("vitl_biz_reg_no = " + getVitl_biz_reg_no());
        System.out.println("vitl_bank_id = " + getVitl_bank_id());
        System.out.println("vitl_acct_num = " + getVitl_acct_num());
        System.out.println("vitl_tran_date = " + getVitl_tran_date());
        System.out.println("vitl_tran_date_seq = " + getVitl_tran_date_seq());
        System.out.println("vitl_slip_no = " + getVitl_slip_no());
        System.out.println("vitl_extnc_amt = " + getVitl_extnc_amt());
        System.out.println("chg_unrcp_amt = " + getChg_unrcp_amt());
        System.out.println("chk_note_no = " + getChk_note_no());
        System.out.println("chk_bank_cd = " + getChk_bank_cd());
    }
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String mst_mode = req.getParameter("mst_mode");
if( mst_mode == null){
	System.out.println(this.toString+" : mst_mode is null" );
}else{
	System.out.println(this.toString+" : mst_mode is "+mst_mode );
}
String incmg_pers_ip = req.getParameter("incmg_pers_ip");
if( incmg_pers_ip == null){
	System.out.println(this.toString+" : incmg_pers_ip is null" );
}else{
	System.out.println(this.toString+" : incmg_pers_ip is "+incmg_pers_ip );
}
String incmg_pers = req.getParameter("incmg_pers");
if( incmg_pers == null){
	System.out.println(this.toString+" : incmg_pers is null" );
}else{
	System.out.println(this.toString+" : incmg_pers is "+incmg_pers );
}
String chg_pers = req.getParameter("chg_pers");
if( chg_pers == null){
	System.out.println(this.toString+" : chg_pers is null" );
}else{
	System.out.println(this.toString+" : chg_pers is "+chg_pers );
}
String cmpy_cd = req.getParameter("cmpy_cd");
if( cmpy_cd == null){
	System.out.println(this.toString+" : cmpy_cd is null" );
}else{
	System.out.println(this.toString+" : cmpy_cd is "+cmpy_cd );
}
String occr_dt = req.getParameter("occr_dt");
if( occr_dt == null){
	System.out.println(this.toString+" : occr_dt is null" );
}else{
	System.out.println(this.toString+" : occr_dt is "+occr_dt );
}
String occr_seq = req.getParameter("occr_seq");
if( occr_seq == null){
	System.out.println(this.toString+" : occr_seq is null" );
}else{
	System.out.println(this.toString+" : occr_seq is "+occr_seq );
}
String reven_dt = req.getParameter("reven_dt");
if( reven_dt == null){
	System.out.println(this.toString+" : reven_dt is null" );
}else{
	System.out.println(this.toString+" : reven_dt is "+reven_dt );
}
String dlco_clsf_cd = req.getParameter("dlco_clsf_cd");
if( dlco_clsf_cd == null){
	System.out.println(this.toString+" : dlco_clsf_cd is null" );
}else{
	System.out.println(this.toString+" : dlco_clsf_cd is "+dlco_clsf_cd );
}
String dlco_no = req.getParameter("dlco_no");
if( dlco_no == null){
	System.out.println(this.toString+" : dlco_no is null" );
}else{
	System.out.println(this.toString+" : dlco_no is "+dlco_no );
}
String boks_dlco_nm = req.getParameter("boks_dlco_nm");
if( boks_dlco_nm == null){
	System.out.println(this.toString+" : boks_dlco_nm is null" );
}else{
	System.out.println(this.toString+" : boks_dlco_nm is "+boks_dlco_nm );
}
String titl = req.getParameter("titl");
if( titl == null){
	System.out.println(this.toString+" : titl is null" );
}else{
	System.out.println(this.toString+" : titl is "+titl );
}
String rcpm_shet_kind = req.getParameter("rcpm_shet_kind");
if( rcpm_shet_kind == null){
	System.out.println(this.toString+" : rcpm_shet_kind is null" );
}else{
	System.out.println(this.toString+" : rcpm_shet_kind is "+rcpm_shet_kind );
}
String rcpm_shet_no = req.getParameter("rcpm_shet_no");
if( rcpm_shet_no == null){
	System.out.println(this.toString+" : rcpm_shet_no is null" );
}else{
	System.out.println(this.toString+" : rcpm_shet_no is "+rcpm_shet_no );
}
String reven_amt = req.getParameter("reven_amt");
if( reven_amt == null){
	System.out.println(this.toString+" : reven_amt is null" );
}else{
	System.out.println(this.toString+" : reven_amt is "+reven_amt );
}
String vat_amt = req.getParameter("vat_amt");
if( vat_amt == null){
	System.out.println(this.toString+" : vat_amt is null" );
}else{
	System.out.println(this.toString+" : vat_amt is "+vat_amt );
}
String rcpm_amt = req.getParameter("rcpm_amt");
if( rcpm_amt == null){
	System.out.println(this.toString+" : rcpm_amt is null" );
}else{
	System.out.println(this.toString+" : rcpm_amt is "+rcpm_amt );
}
String stmt_occr_dt = req.getParameter("stmt_occr_dt");
if( stmt_occr_dt == null){
	System.out.println(this.toString+" : stmt_occr_dt is null" );
}else{
	System.out.println(this.toString+" : stmt_occr_dt is "+stmt_occr_dt );
}
String stmt_occr_seq = req.getParameter("stmt_occr_seq");
if( stmt_occr_seq == null){
	System.out.println(this.toString+" : stmt_occr_seq is null" );
}else{
	System.out.println(this.toString+" : stmt_occr_seq is "+stmt_occr_seq );
}
String p_upd_occr_dt = req.getParameter("p_upd_occr_dt");
if( p_upd_occr_dt == null){
	System.out.println(this.toString+" : p_upd_occr_dt is null" );
}else{
	System.out.println(this.toString+" : p_upd_occr_dt is "+p_upd_occr_dt );
}
String p_upd_occr_seq = req.getParameter("p_upd_occr_seq");
if( p_upd_occr_seq == null){
	System.out.println(this.toString+" : p_upd_occr_seq is null" );
}else{
	System.out.println(this.toString+" : p_upd_occr_seq is "+p_upd_occr_seq );
}
String chrg_dept_cd = req.getParameter("chrg_dept_cd");
if( chrg_dept_cd == null){
	System.out.println(this.toString+" : chrg_dept_cd is null" );
}else{
	System.out.println(this.toString+" : chrg_dept_cd is "+chrg_dept_cd );
}
String chrg_pers_emp_no = req.getParameter("chrg_pers_emp_no");
if( chrg_pers_emp_no == null){
	System.out.println(this.toString+" : chrg_pers_emp_no is null" );
}else{
	System.out.println(this.toString+" : chrg_pers_emp_no is "+chrg_pers_emp_no );
}
String evnt_yy = req.getParameter("evnt_yy");
if( evnt_yy == null){
	System.out.println(this.toString+" : evnt_yy is null" );
}else{
	System.out.println(this.toString+" : evnt_yy is "+evnt_yy );
}
String evnt_cd = req.getParameter("evnt_cd");
if( evnt_cd == null){
	System.out.println(this.toString+" : evnt_cd is null" );
}else{
	System.out.println(this.toString+" : evnt_cd is "+evnt_cd );
}
String evnt_seq = req.getParameter("evnt_seq");
if( evnt_seq == null){
	System.out.println(this.toString+" : evnt_seq is null" );
}else{
	System.out.println(this.toString+" : evnt_seq is "+evnt_seq );
}
String payo_clsf = req.getParameter("payo_clsf");
if( payo_clsf == null){
	System.out.println(this.toString+" : payo_clsf is null" );
}else{
	System.out.println(this.toString+" : payo_clsf is "+payo_clsf );
}
String rcpm_occr_dt = req.getParameter("rcpm_occr_dt");
if( rcpm_occr_dt == null){
	System.out.println(this.toString+" : rcpm_occr_dt is null" );
}else{
	System.out.println(this.toString+" : rcpm_occr_dt is "+rcpm_occr_dt );
}
String rcpm_occr_seq = req.getParameter("rcpm_occr_seq");
if( rcpm_occr_seq == null){
	System.out.println(this.toString+" : rcpm_occr_seq is null" );
}else{
	System.out.println(this.toString+" : rcpm_occr_seq is "+rcpm_occr_seq );
}
String remk = req.getParameter("remk");
if( remk == null){
	System.out.println(this.toString+" : remk is null" );
}else{
	System.out.println(this.toString+" : remk is "+remk );
}
String drcr_clsf = req.getParameter("drcr_clsf");
if( drcr_clsf == null){
	System.out.println(this.toString+" : drcr_clsf is null" );
}else{
	System.out.println(this.toString+" : drcr_clsf is "+drcr_clsf );
}
String budg_cd = req.getParameter("budg_cd");
if( budg_cd == null){
	System.out.println(this.toString+" : budg_cd is null" );
}else{
	System.out.println(this.toString+" : budg_cd is "+budg_cd );
}
String amt = req.getParameter("amt");
if( amt == null){
	System.out.println(this.toString+" : amt is null" );
}else{
	System.out.println(this.toString+" : amt is "+amt );
}
String acct_mang_no = req.getParameter("acct_mang_no");
if( acct_mang_no == null){
	System.out.println(this.toString+" : acct_mang_no is null" );
}else{
	System.out.println(this.toString+" : acct_mang_no is "+acct_mang_no );
}
String rmtt_dt = req.getParameter("rmtt_dt");
if( rmtt_dt == null){
	System.out.println(this.toString+" : rmtt_dt is null" );
}else{
	System.out.println(this.toString+" : rmtt_dt is "+rmtt_dt );
}
String rmtt_plac = req.getParameter("rmtt_plac");
if( rmtt_plac == null){
	System.out.println(this.toString+" : rmtt_plac is null" );
}else{
	System.out.println(this.toString+" : rmtt_plac is "+rmtt_plac );
}
String note_no = req.getParameter("note_no");
if( note_no == null){
	System.out.println(this.toString+" : note_no is null" );
}else{
	System.out.println(this.toString+" : note_no is "+note_no );
}
String note_clsf_cd = req.getParameter("note_clsf_cd");
if( note_clsf_cd == null){
	System.out.println(this.toString+" : note_clsf_cd is null" );
}else{
	System.out.println(this.toString+" : note_clsf_cd is "+note_clsf_cd );
}
String bank_cd = req.getParameter("bank_cd");
if( bank_cd == null){
	System.out.println(this.toString+" : bank_cd is null" );
}else{
	System.out.println(this.toString+" : bank_cd is "+bank_cd );
}
String issu_pers_nm = req.getParameter("issu_pers_nm");
if( issu_pers_nm == null){
	System.out.println(this.toString+" : issu_pers_nm is null" );
}else{
	System.out.println(this.toString+" : issu_pers_nm is "+issu_pers_nm );
}
String issu_cmpy_clsf_cd = req.getParameter("issu_cmpy_clsf_cd");
if( issu_cmpy_clsf_cd == null){
	System.out.println(this.toString+" : issu_cmpy_clsf_cd is null" );
}else{
	System.out.println(this.toString+" : issu_cmpy_clsf_cd is "+issu_cmpy_clsf_cd );
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
String sale_aprv_no = req.getParameter("sale_aprv_no");
if( sale_aprv_no == null){
	System.out.println(this.toString+" : sale_aprv_no is null" );
}else{
	System.out.println(this.toString+" : sale_aprv_no is "+sale_aprv_no );
}
String rcpm_acct = req.getParameter("rcpm_acct");
if( rcpm_acct == null){
	System.out.println(this.toString+" : rcpm_acct is null" );
}else{
	System.out.println(this.toString+" : rcpm_acct is "+rcpm_acct );
}
String bal_occr_slip_no = req.getParameter("bal_occr_slip_no");
if( bal_occr_slip_no == null){
	System.out.println(this.toString+" : bal_occr_slip_no is null" );
}else{
	System.out.println(this.toString+" : bal_occr_slip_no is "+bal_occr_slip_no );
}
String extnc_obj_slip_clsf = req.getParameter("extnc_obj_slip_clsf");
if( extnc_obj_slip_clsf == null){
	System.out.println(this.toString+" : extnc_obj_slip_clsf is null" );
}else{
	System.out.println(this.toString+" : extnc_obj_slip_clsf is "+extnc_obj_slip_clsf );
}
String extnc_dlco_no = req.getParameter("extnc_dlco_no");
if( extnc_dlco_no == null){
	System.out.println(this.toString+" : extnc_dlco_no is null" );
}else{
	System.out.println(this.toString+" : extnc_dlco_no is "+extnc_dlco_no );
}
String medi_cd = req.getParameter("medi_cd");
if( medi_cd == null){
	System.out.println(this.toString+" : medi_cd is null" );
}else{
	System.out.println(this.toString+" : medi_cd is "+medi_cd );
}
String biz_reg_no = req.getParameter("biz_reg_no");
if( biz_reg_no == null){
	System.out.println(this.toString+" : biz_reg_no is null" );
}else{
	System.out.println(this.toString+" : biz_reg_no is "+biz_reg_no );
}
String bank_id = req.getParameter("bank_id");
if( bank_id == null){
	System.out.println(this.toString+" : bank_id is null" );
}else{
	System.out.println(this.toString+" : bank_id is "+bank_id );
}
String acct_num = req.getParameter("acct_num");
if( acct_num == null){
	System.out.println(this.toString+" : acct_num is null" );
}else{
	System.out.println(this.toString+" : acct_num is "+acct_num );
}
String tran_date = req.getParameter("tran_date");
if( tran_date == null){
	System.out.println(this.toString+" : tran_date is null" );
}else{
	System.out.println(this.toString+" : tran_date is "+tran_date );
}
String tran_date_seq = req.getParameter("tran_date_seq");
if( tran_date_seq == null){
	System.out.println(this.toString+" : tran_date_seq is null" );
}else{
	System.out.println(this.toString+" : tran_date_seq is "+tran_date_seq );
}
String slip_no = req.getParameter("slip_no");
if( slip_no == null){
	System.out.println(this.toString+" : slip_no is null" );
}else{
	System.out.println(this.toString+" : slip_no is "+slip_no );
}
String vitl_biz_reg_no = req.getParameter("vitl_biz_reg_no");
if( vitl_biz_reg_no == null){
	System.out.println(this.toString+" : vitl_biz_reg_no is null" );
}else{
	System.out.println(this.toString+" : vitl_biz_reg_no is "+vitl_biz_reg_no );
}
String vitl_bank_id = req.getParameter("vitl_bank_id");
if( vitl_bank_id == null){
	System.out.println(this.toString+" : vitl_bank_id is null" );
}else{
	System.out.println(this.toString+" : vitl_bank_id is "+vitl_bank_id );
}
String vitl_acct_num = req.getParameter("vitl_acct_num");
if( vitl_acct_num == null){
	System.out.println(this.toString+" : vitl_acct_num is null" );
}else{
	System.out.println(this.toString+" : vitl_acct_num is "+vitl_acct_num );
}
String vitl_tran_date = req.getParameter("vitl_tran_date");
if( vitl_tran_date == null){
	System.out.println(this.toString+" : vitl_tran_date is null" );
}else{
	System.out.println(this.toString+" : vitl_tran_date is "+vitl_tran_date );
}
String vitl_tran_date_seq = req.getParameter("vitl_tran_date_seq");
if( vitl_tran_date_seq == null){
	System.out.println(this.toString+" : vitl_tran_date_seq is null" );
}else{
	System.out.println(this.toString+" : vitl_tran_date_seq is "+vitl_tran_date_seq );
}
String vitl_slip_no = req.getParameter("vitl_slip_no");
if( vitl_slip_no == null){
	System.out.println(this.toString+" : vitl_slip_no is null" );
}else{
	System.out.println(this.toString+" : vitl_slip_no is "+vitl_slip_no );
}
String vitl_extnc_amt = req.getParameter("vitl_extnc_amt");
if( vitl_extnc_amt == null){
	System.out.println(this.toString+" : vitl_extnc_amt is null" );
}else{
	System.out.println(this.toString+" : vitl_extnc_amt is "+vitl_extnc_amt );
}
String chg_unrcp_amt = req.getParameter("chg_unrcp_amt");
if( chg_unrcp_amt == null){
	System.out.println(this.toString+" : chg_unrcp_amt is null" );
}else{
	System.out.println(this.toString+" : chg_unrcp_amt is "+chg_unrcp_amt );
}
String chk_note_no = req.getParameter("chk_note_no");
if( chk_note_no == null){
	System.out.println(this.toString+" : chk_note_no is null" );
}else{
	System.out.println(this.toString+" : chk_note_no is "+chk_note_no );
}
String chk_bank_cd = req.getParameter("chk_bank_cd");
if( chk_bank_cd == null){
	System.out.println(this.toString+" : chk_bank_cd is null" );
}else{
	System.out.println(this.toString+" : chk_bank_cd is "+chk_bank_cd );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String mst_mode = Util.checkString(req.getParameter("mst_mode"));
String incmg_pers_ip = Util.checkString(req.getParameter("incmg_pers_ip"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String chg_pers = Util.checkString(req.getParameter("chg_pers"));
String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String occr_dt = Util.checkString(req.getParameter("occr_dt"));
String occr_seq = Util.checkString(req.getParameter("occr_seq"));
String reven_dt = Util.checkString(req.getParameter("reven_dt"));
String dlco_clsf_cd = Util.checkString(req.getParameter("dlco_clsf_cd"));
String dlco_no = Util.checkString(req.getParameter("dlco_no"));
String boks_dlco_nm = Util.checkString(req.getParameter("boks_dlco_nm"));
String titl = Util.checkString(req.getParameter("titl"));
String rcpm_shet_kind = Util.checkString(req.getParameter("rcpm_shet_kind"));
String rcpm_shet_no = Util.checkString(req.getParameter("rcpm_shet_no"));
String reven_amt = Util.checkString(req.getParameter("reven_amt"));
String vat_amt = Util.checkString(req.getParameter("vat_amt"));
String rcpm_amt = Util.checkString(req.getParameter("rcpm_amt"));
String stmt_occr_dt = Util.checkString(req.getParameter("stmt_occr_dt"));
String stmt_occr_seq = Util.checkString(req.getParameter("stmt_occr_seq"));
String p_upd_occr_dt = Util.checkString(req.getParameter("p_upd_occr_dt"));
String p_upd_occr_seq = Util.checkString(req.getParameter("p_upd_occr_seq"));
String chrg_dept_cd = Util.checkString(req.getParameter("chrg_dept_cd"));
String chrg_pers_emp_no = Util.checkString(req.getParameter("chrg_pers_emp_no"));
String evnt_yy = Util.checkString(req.getParameter("evnt_yy"));
String evnt_cd = Util.checkString(req.getParameter("evnt_cd"));
String evnt_seq = Util.checkString(req.getParameter("evnt_seq"));
String payo_clsf = Util.checkString(req.getParameter("payo_clsf"));
String rcpm_occr_dt = Util.checkString(req.getParameter("rcpm_occr_dt"));
String rcpm_occr_seq = Util.checkString(req.getParameter("rcpm_occr_seq"));
String remk = Util.checkString(req.getParameter("remk"));
String drcr_clsf = Util.checkString(req.getParameter("drcr_clsf"));
String budg_cd = Util.checkString(req.getParameter("budg_cd"));
String amt = Util.checkString(req.getParameter("amt"));
String acct_mang_no = Util.checkString(req.getParameter("acct_mang_no"));
String rmtt_dt = Util.checkString(req.getParameter("rmtt_dt"));
String rmtt_plac = Util.checkString(req.getParameter("rmtt_plac"));
String note_no = Util.checkString(req.getParameter("note_no"));
String note_clsf_cd = Util.checkString(req.getParameter("note_clsf_cd"));
String bank_cd = Util.checkString(req.getParameter("bank_cd"));
String issu_pers_nm = Util.checkString(req.getParameter("issu_pers_nm"));
String issu_cmpy_clsf_cd = Util.checkString(req.getParameter("issu_cmpy_clsf_cd"));
String comp_dt = Util.checkString(req.getParameter("comp_dt"));
String mtry_dt = Util.checkString(req.getParameter("mtry_dt"));
String sale_aprv_no = Util.checkString(req.getParameter("sale_aprv_no"));
String rcpm_acct = Util.checkString(req.getParameter("rcpm_acct"));
String bal_occr_slip_no = Util.checkString(req.getParameter("bal_occr_slip_no"));
String extnc_obj_slip_clsf = Util.checkString(req.getParameter("extnc_obj_slip_clsf"));
String extnc_dlco_no = Util.checkString(req.getParameter("extnc_dlco_no"));
String medi_cd = Util.checkString(req.getParameter("medi_cd"));
String biz_reg_no = Util.checkString(req.getParameter("biz_reg_no"));
String bank_id = Util.checkString(req.getParameter("bank_id"));
String acct_num = Util.checkString(req.getParameter("acct_num"));
String tran_date = Util.checkString(req.getParameter("tran_date"));
String tran_date_seq = Util.checkString(req.getParameter("tran_date_seq"));
String slip_no = Util.checkString(req.getParameter("slip_no"));
String vitl_biz_reg_no = Util.checkString(req.getParameter("vitl_biz_reg_no"));
String vitl_bank_id = Util.checkString(req.getParameter("vitl_bank_id"));
String vitl_acct_num = Util.checkString(req.getParameter("vitl_acct_num"));
String vitl_tran_date = Util.checkString(req.getParameter("vitl_tran_date"));
String vitl_tran_date_seq = Util.checkString(req.getParameter("vitl_tran_date_seq"));
String vitl_slip_no = Util.checkString(req.getParameter("vitl_slip_no"));
String vitl_extnc_amt = Util.checkString(req.getParameter("vitl_extnc_amt"));
String chg_unrcp_amt = Util.checkString(req.getParameter("chg_unrcp_amt"));
String chk_note_no = Util.checkString(req.getParameter("chk_note_no"));
String chk_bank_cd = Util.checkString(req.getParameter("chk_bank_cd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String mst_mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mst_mode")));
String incmg_pers_ip = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ip")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String chg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("chg_pers")));
String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String occr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("occr_dt")));
String occr_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("occr_seq")));
String reven_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("reven_dt")));
String dlco_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_clsf_cd")));
String dlco_no = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_no")));
String boks_dlco_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("boks_dlco_nm")));
String titl = Util.Uni2Ksc(Util.checkString(req.getParameter("titl")));
String rcpm_shet_kind = Util.Uni2Ksc(Util.checkString(req.getParameter("rcpm_shet_kind")));
String rcpm_shet_no = Util.Uni2Ksc(Util.checkString(req.getParameter("rcpm_shet_no")));
String reven_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("reven_amt")));
String vat_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("vat_amt")));
String rcpm_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("rcpm_amt")));
String stmt_occr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("stmt_occr_dt")));
String stmt_occr_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("stmt_occr_seq")));
String p_upd_occr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("p_upd_occr_dt")));
String p_upd_occr_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("p_upd_occr_seq")));
String chrg_dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("chrg_dept_cd")));
String chrg_pers_emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("chrg_pers_emp_no")));
String evnt_yy = Util.Uni2Ksc(Util.checkString(req.getParameter("evnt_yy")));
String evnt_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("evnt_cd")));
String evnt_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("evnt_seq")));
String payo_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("payo_clsf")));
String rcpm_occr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("rcpm_occr_dt")));
String rcpm_occr_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("rcpm_occr_seq")));
String remk = Util.Uni2Ksc(Util.checkString(req.getParameter("remk")));
String drcr_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("drcr_clsf")));
String budg_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("budg_cd")));
String amt = Util.Uni2Ksc(Util.checkString(req.getParameter("amt")));
String acct_mang_no = Util.Uni2Ksc(Util.checkString(req.getParameter("acct_mang_no")));
String rmtt_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("rmtt_dt")));
String rmtt_plac = Util.Uni2Ksc(Util.checkString(req.getParameter("rmtt_plac")));
String note_no = Util.Uni2Ksc(Util.checkString(req.getParameter("note_no")));
String note_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("note_clsf_cd")));
String bank_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("bank_cd")));
String issu_pers_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("issu_pers_nm")));
String issu_cmpy_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("issu_cmpy_clsf_cd")));
String comp_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("comp_dt")));
String mtry_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("mtry_dt")));
String sale_aprv_no = Util.Uni2Ksc(Util.checkString(req.getParameter("sale_aprv_no")));
String rcpm_acct = Util.Uni2Ksc(Util.checkString(req.getParameter("rcpm_acct")));
String bal_occr_slip_no = Util.Uni2Ksc(Util.checkString(req.getParameter("bal_occr_slip_no")));
String extnc_obj_slip_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("extnc_obj_slip_clsf")));
String extnc_dlco_no = Util.Uni2Ksc(Util.checkString(req.getParameter("extnc_dlco_no")));
String medi_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_cd")));
String biz_reg_no = Util.Uni2Ksc(Util.checkString(req.getParameter("biz_reg_no")));
String bank_id = Util.Uni2Ksc(Util.checkString(req.getParameter("bank_id")));
String acct_num = Util.Uni2Ksc(Util.checkString(req.getParameter("acct_num")));
String tran_date = Util.Uni2Ksc(Util.checkString(req.getParameter("tran_date")));
String tran_date_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("tran_date_seq")));
String slip_no = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_no")));
String vitl_biz_reg_no = Util.Uni2Ksc(Util.checkString(req.getParameter("vitl_biz_reg_no")));
String vitl_bank_id = Util.Uni2Ksc(Util.checkString(req.getParameter("vitl_bank_id")));
String vitl_acct_num = Util.Uni2Ksc(Util.checkString(req.getParameter("vitl_acct_num")));
String vitl_tran_date = Util.Uni2Ksc(Util.checkString(req.getParameter("vitl_tran_date")));
String vitl_tran_date_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("vitl_tran_date_seq")));
String vitl_slip_no = Util.Uni2Ksc(Util.checkString(req.getParameter("vitl_slip_no")));
String vitl_extnc_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("vitl_extnc_amt")));
String chg_unrcp_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("chg_unrcp_amt")));
String chk_note_no = Util.Uni2Ksc(Util.checkString(req.getParameter("chk_note_no")));
String chk_bank_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("chk_bank_cd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setMst_mode(mst_mode);
dm.setIncmg_pers_ip(incmg_pers_ip);
dm.setIncmg_pers(incmg_pers);
dm.setChg_pers(chg_pers);
dm.setCmpy_cd(cmpy_cd);
dm.setOccr_dt(occr_dt);
dm.setOccr_seq(occr_seq);
dm.setReven_dt(reven_dt);
dm.setDlco_clsf_cd(dlco_clsf_cd);
dm.setDlco_no(dlco_no);
dm.setBoks_dlco_nm(boks_dlco_nm);
dm.setTitl(titl);
dm.setRcpm_shet_kind(rcpm_shet_kind);
dm.setRcpm_shet_no(rcpm_shet_no);
dm.setReven_amt(reven_amt);
dm.setVat_amt(vat_amt);
dm.setRcpm_amt(rcpm_amt);
dm.setStmt_occr_dt(stmt_occr_dt);
dm.setStmt_occr_seq(stmt_occr_seq);
dm.setP_upd_occr_dt(p_upd_occr_dt);
dm.setP_upd_occr_seq(p_upd_occr_seq);
dm.setChrg_dept_cd(chrg_dept_cd);
dm.setChrg_pers_emp_no(chrg_pers_emp_no);
dm.setEvnt_yy(evnt_yy);
dm.setEvnt_cd(evnt_cd);
dm.setEvnt_seq(evnt_seq);
dm.setPayo_clsf(payo_clsf);
dm.setRcpm_occr_dt(rcpm_occr_dt);
dm.setRcpm_occr_seq(rcpm_occr_seq);
dm.setRemk(remk);
dm.setDrcr_clsf(drcr_clsf);
dm.setBudg_cd(budg_cd);
dm.setAmt(amt);
dm.setAcct_mang_no(acct_mang_no);
dm.setRmtt_dt(rmtt_dt);
dm.setRmtt_plac(rmtt_plac);
dm.setNote_no(note_no);
dm.setNote_clsf_cd(note_clsf_cd);
dm.setBank_cd(bank_cd);
dm.setIssu_pers_nm(issu_pers_nm);
dm.setIssu_cmpy_clsf_cd(issu_cmpy_clsf_cd);
dm.setComp_dt(comp_dt);
dm.setMtry_dt(mtry_dt);
dm.setSale_aprv_no(sale_aprv_no);
dm.setRcpm_acct(rcpm_acct);
dm.setBal_occr_slip_no(bal_occr_slip_no);
dm.setExtnc_obj_slip_clsf(extnc_obj_slip_clsf);
dm.setExtnc_dlco_no(extnc_dlco_no);
dm.setMedi_cd(medi_cd);
dm.setBiz_reg_no(biz_reg_no);
dm.setBank_id(bank_id);
dm.setAcct_num(acct_num);
dm.setTran_date(tran_date);
dm.setTran_date_seq(tran_date_seq);
dm.setSlip_no(slip_no);
dm.setVitl_biz_reg_no(vitl_biz_reg_no);
dm.setVitl_bank_id(vitl_bank_id);
dm.setVitl_acct_num(vitl_acct_num);
dm.setVitl_tran_date(vitl_tran_date);
dm.setVitl_tran_date_seq(vitl_tran_date_seq);
dm.setVitl_slip_no(vitl_slip_no);
dm.setVitl_extnc_amt(vitl_extnc_amt);
dm.setChg_unrcp_amt(chg_unrcp_amt);
dm.setChk_note_no(chk_note_no);
dm.setChk_bank_cd(chk_bank_cd);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri May 22 13:12:51 KST 2009 */
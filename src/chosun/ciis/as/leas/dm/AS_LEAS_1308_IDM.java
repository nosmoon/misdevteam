/***************************************************************************************************
* 파일명 : .java
* 기능 :  임대사업-입출금관리
* 작성일자 : 2010-06-07
* 작성자 : 노상현
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.as.leas.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.as.leas.ds.*;
import chosun.ciis.as.leas.rec.*;

/**
 * 임대사업-입출금관리
 */


public class AS_LEAS_1308_IDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String incmg_pers_ipadd;
	public String incmg_pers;
	public String chg_pers;
	public String rcpm_shet_no;
	public String dlco_clsf_cd;
	public String dlco_ern;
	public String inout_clsf;
	public String inout_acct_clsf;
	public String gurt_payo_clsf;
	public String remk;
	public String bldg_cd;
	public String cntr_yy;
	public String cntr_seq;
	public String gurt_rcpm_amt;
	public String precpt_rcpm_amt;
	public String trufnd_rcpm_amt;
	public String trufnd_dlco_clsf_cd;
	public String trufnd_dlco_ern;
	public String trufnd_slip_clsf_cd;
	public String cash_sub_seq;
	public String cash_rcpm_amt;
	public String deps_mode;
	public String deps_sub_seq;
	public String deps_rcpm_amt;
	public String deps_rmtt_dt;
	public String deps_rmtt_plac;
	public String deps_acct_mang_no;
	public String deps_coms_amt;
	public String deps_biz_reg_no;
	public String deps_bank_id;
	public String deps_acct_num;
	public String deps_tran_date;
	public String deps_tran_date_seq;
	public String deps_acct_tonghwa_ref;
	public String deps_frex_amt;
	public String note_mode;
	public String note_sub_seq;
	public String note_bank_cd;
	public String note_note_no;
	public String note_note_clsf_cd;
	public String note_comp_dt;
	public String note_mtry_dt;
	public String note_rcpm_amt;
	public String note_issu_cmpy_clsf;
	public String note_issu_pers_nm;
	public String note_rcpm_acct;
	public String note_sale_aprv_no;
	public String etc_mode;
	public String etc_sub_seq;
	public String etc_budg_cd;
	public String etc_rcpm_amt;
	public String etc_bal_occr_slip_clsf;
	public String etc_bal_occr_slip_no;

	public AS_LEAS_1308_IDM(){}
	public AS_LEAS_1308_IDM(String cmpy_cd, String incmg_pers_ipadd, String incmg_pers, String chg_pers, String rcpm_shet_no, String dlco_clsf_cd, String dlco_ern, String inout_clsf, String inout_acct_clsf, String gurt_payo_clsf, String remk, String bldg_cd, String cntr_yy, String cntr_seq, String gurt_rcpm_amt, String precpt_rcpm_amt, String trufnd_rcpm_amt, String trufnd_dlco_clsf_cd, String trufnd_dlco_ern, String trufnd_slip_clsf_cd, String cash_sub_seq, String cash_rcpm_amt, String deps_mode, String deps_sub_seq, String deps_rcpm_amt, String deps_rmtt_dt, String deps_rmtt_plac, String deps_acct_mang_no, String deps_coms_amt, String deps_biz_reg_no, String deps_bank_id, String deps_acct_num, String deps_tran_date, String deps_tran_date_seq, String deps_acct_tonghwa_ref, String deps_frex_amt, String note_mode, String note_sub_seq, String note_bank_cd, String note_note_no, String note_note_clsf_cd, String note_comp_dt, String note_mtry_dt, String note_rcpm_amt, String note_issu_cmpy_clsf, String note_issu_pers_nm, String note_rcpm_acct, String note_sale_aprv_no, String etc_mode, String etc_sub_seq, String etc_budg_cd, String etc_rcpm_amt, String etc_bal_occr_slip_clsf, String etc_bal_occr_slip_no){
		this.cmpy_cd = cmpy_cd;
		this.incmg_pers_ipadd = incmg_pers_ipadd;
		this.incmg_pers = incmg_pers;
		this.chg_pers = chg_pers;
		this.rcpm_shet_no = rcpm_shet_no;
		this.dlco_clsf_cd = dlco_clsf_cd;
		this.dlco_ern = dlco_ern;
		this.inout_clsf = inout_clsf;
		this.inout_acct_clsf = inout_acct_clsf;
		this.gurt_payo_clsf = gurt_payo_clsf;
		this.remk = remk;
		this.bldg_cd = bldg_cd;
		this.cntr_yy = cntr_yy;
		this.cntr_seq = cntr_seq;
		this.gurt_rcpm_amt = gurt_rcpm_amt;
		this.precpt_rcpm_amt = precpt_rcpm_amt;
		this.trufnd_rcpm_amt = trufnd_rcpm_amt;
		this.trufnd_dlco_clsf_cd = trufnd_dlco_clsf_cd;
		this.trufnd_dlco_ern = trufnd_dlco_ern;
		this.trufnd_slip_clsf_cd = trufnd_slip_clsf_cd;
		this.cash_sub_seq = cash_sub_seq;
		this.cash_rcpm_amt = cash_rcpm_amt;
		this.deps_mode = deps_mode;
		this.deps_sub_seq = deps_sub_seq;
		this.deps_rcpm_amt = deps_rcpm_amt;
		this.deps_rmtt_dt = deps_rmtt_dt;
		this.deps_rmtt_plac = deps_rmtt_plac;
		this.deps_acct_mang_no = deps_acct_mang_no;
		this.deps_coms_amt = deps_coms_amt;
		this.deps_biz_reg_no = deps_biz_reg_no;
		this.deps_bank_id = deps_bank_id;
		this.deps_acct_num = deps_acct_num;
		this.deps_tran_date = deps_tran_date;
		this.deps_tran_date_seq = deps_tran_date_seq;
		this.deps_acct_tonghwa_ref = deps_acct_tonghwa_ref;
		this.deps_frex_amt = deps_frex_amt;
		this.note_mode = note_mode;
		this.note_sub_seq = note_sub_seq;
		this.note_bank_cd = note_bank_cd;
		this.note_note_no = note_note_no;
		this.note_note_clsf_cd = note_note_clsf_cd;
		this.note_comp_dt = note_comp_dt;
		this.note_mtry_dt = note_mtry_dt;
		this.note_rcpm_amt = note_rcpm_amt;
		this.note_issu_cmpy_clsf = note_issu_cmpy_clsf;
		this.note_issu_pers_nm = note_issu_pers_nm;
		this.note_rcpm_acct = note_rcpm_acct;
		this.note_sale_aprv_no = note_sale_aprv_no;
		this.etc_mode = etc_mode;
		this.etc_sub_seq = etc_sub_seq;
		this.etc_budg_cd = etc_budg_cd;
		this.etc_rcpm_amt = etc_rcpm_amt;
		this.etc_bal_occr_slip_clsf = etc_bal_occr_slip_clsf;
		this.etc_bal_occr_slip_no = etc_bal_occr_slip_no;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setIncmg_pers_ipadd(String incmg_pers_ipadd){
		this.incmg_pers_ipadd = incmg_pers_ipadd;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setChg_pers(String chg_pers){
		this.chg_pers = chg_pers;
	}

	public void setRcpm_shet_no(String rcpm_shet_no){
		this.rcpm_shet_no = rcpm_shet_no;
	}

	public void setDlco_clsf_cd(String dlco_clsf_cd){
		this.dlco_clsf_cd = dlco_clsf_cd;
	}

	public void setDlco_ern(String dlco_ern){
		this.dlco_ern = dlco_ern;
	}

	public void setInout_clsf(String inout_clsf){
		this.inout_clsf = inout_clsf;
	}

	public void setInout_acct_clsf(String inout_acct_clsf){
		this.inout_acct_clsf = inout_acct_clsf;
	}

	public void setGurt_payo_clsf(String gurt_payo_clsf){
		this.gurt_payo_clsf = gurt_payo_clsf;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setBldg_cd(String bldg_cd){
		this.bldg_cd = bldg_cd;
	}

	public void setCntr_yy(String cntr_yy){
		this.cntr_yy = cntr_yy;
	}

	public void setCntr_seq(String cntr_seq){
		this.cntr_seq = cntr_seq;
	}

	public void setGurt_rcpm_amt(String gurt_rcpm_amt){
		this.gurt_rcpm_amt = gurt_rcpm_amt;
	}

	public void setPrecpt_rcpm_amt(String precpt_rcpm_amt){
		this.precpt_rcpm_amt = precpt_rcpm_amt;
	}

	public void setTrufnd_rcpm_amt(String trufnd_rcpm_amt){
		this.trufnd_rcpm_amt = trufnd_rcpm_amt;
	}

	public void setTrufnd_dlco_clsf_cd(String trufnd_dlco_clsf_cd){
		this.trufnd_dlco_clsf_cd = trufnd_dlco_clsf_cd;
	}

	public void setTrufnd_dlco_ern(String trufnd_dlco_ern){
		this.trufnd_dlco_ern = trufnd_dlco_ern;
	}

	public void setTrufnd_slip_clsf_cd(String trufnd_slip_clsf_cd){
		this.trufnd_slip_clsf_cd = trufnd_slip_clsf_cd;
	}

	public void setCash_sub_seq(String cash_sub_seq){
		this.cash_sub_seq = cash_sub_seq;
	}

	public void setCash_rcpm_amt(String cash_rcpm_amt){
		this.cash_rcpm_amt = cash_rcpm_amt;
	}

	public void setDeps_mode(String deps_mode){
		this.deps_mode = deps_mode;
	}

	public void setDeps_sub_seq(String deps_sub_seq){
		this.deps_sub_seq = deps_sub_seq;
	}

	public void setDeps_rcpm_amt(String deps_rcpm_amt){
		this.deps_rcpm_amt = deps_rcpm_amt;
	}

	public void setDeps_rmtt_dt(String deps_rmtt_dt){
		this.deps_rmtt_dt = deps_rmtt_dt;
	}

	public void setDeps_rmtt_plac(String deps_rmtt_plac){
		this.deps_rmtt_plac = deps_rmtt_plac;
	}

	public void setDeps_acct_mang_no(String deps_acct_mang_no){
		this.deps_acct_mang_no = deps_acct_mang_no;
	}

	public void setDeps_coms_amt(String deps_coms_amt){
		this.deps_coms_amt = deps_coms_amt;
	}

	public void setDeps_biz_reg_no(String deps_biz_reg_no){
		this.deps_biz_reg_no = deps_biz_reg_no;
	}

	public void setDeps_bank_id(String deps_bank_id){
		this.deps_bank_id = deps_bank_id;
	}

	public void setDeps_acct_num(String deps_acct_num){
		this.deps_acct_num = deps_acct_num;
	}

	public void setDeps_tran_date(String deps_tran_date){
		this.deps_tran_date = deps_tran_date;
	}

	public void setDeps_tran_date_seq(String deps_tran_date_seq){
		this.deps_tran_date_seq = deps_tran_date_seq;
	}

	public void setDeps_acct_tonghwa_ref(String deps_acct_tonghwa_ref){
		this.deps_acct_tonghwa_ref = deps_acct_tonghwa_ref;
	}

	public void setDeps_frex_amt(String deps_frex_amt){
		this.deps_frex_amt = deps_frex_amt;
	}

	public void setNote_mode(String note_mode){
		this.note_mode = note_mode;
	}

	public void setNote_sub_seq(String note_sub_seq){
		this.note_sub_seq = note_sub_seq;
	}

	public void setNote_bank_cd(String note_bank_cd){
		this.note_bank_cd = note_bank_cd;
	}

	public void setNote_note_no(String note_note_no){
		this.note_note_no = note_note_no;
	}

	public void setNote_note_clsf_cd(String note_note_clsf_cd){
		this.note_note_clsf_cd = note_note_clsf_cd;
	}

	public void setNote_comp_dt(String note_comp_dt){
		this.note_comp_dt = note_comp_dt;
	}

	public void setNote_mtry_dt(String note_mtry_dt){
		this.note_mtry_dt = note_mtry_dt;
	}

	public void setNote_rcpm_amt(String note_rcpm_amt){
		this.note_rcpm_amt = note_rcpm_amt;
	}

	public void setNote_issu_cmpy_clsf(String note_issu_cmpy_clsf){
		this.note_issu_cmpy_clsf = note_issu_cmpy_clsf;
	}

	public void setNote_issu_pers_nm(String note_issu_pers_nm){
		this.note_issu_pers_nm = note_issu_pers_nm;
	}

	public void setNote_rcpm_acct(String note_rcpm_acct){
		this.note_rcpm_acct = note_rcpm_acct;
	}

	public void setNote_sale_aprv_no(String note_sale_aprv_no){
		this.note_sale_aprv_no = note_sale_aprv_no;
	}

	public void setEtc_mode(String etc_mode){
		this.etc_mode = etc_mode;
	}

	public void setEtc_sub_seq(String etc_sub_seq){
		this.etc_sub_seq = etc_sub_seq;
	}

	public void setEtc_budg_cd(String etc_budg_cd){
		this.etc_budg_cd = etc_budg_cd;
	}

	public void setEtc_rcpm_amt(String etc_rcpm_amt){
		this.etc_rcpm_amt = etc_rcpm_amt;
	}

	public void setEtc_bal_occr_slip_clsf(String etc_bal_occr_slip_clsf){
		this.etc_bal_occr_slip_clsf = etc_bal_occr_slip_clsf;
	}

	public void setEtc_bal_occr_slip_no(String etc_bal_occr_slip_no){
		this.etc_bal_occr_slip_no = etc_bal_occr_slip_no;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getIncmg_pers_ipadd(){
		return this.incmg_pers_ipadd;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getChg_pers(){
		return this.chg_pers;
	}

	public String getRcpm_shet_no(){
		return this.rcpm_shet_no;
	}

	public String getDlco_clsf_cd(){
		return this.dlco_clsf_cd;
	}

	public String getDlco_ern(){
		return this.dlco_ern;
	}

	public String getInout_clsf(){
		return this.inout_clsf;
	}

	public String getInout_acct_clsf(){
		return this.inout_acct_clsf;
	}

	public String getGurt_payo_clsf(){
		return this.gurt_payo_clsf;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getBldg_cd(){
		return this.bldg_cd;
	}

	public String getCntr_yy(){
		return this.cntr_yy;
	}

	public String getCntr_seq(){
		return this.cntr_seq;
	}

	public String getGurt_rcpm_amt(){
		return this.gurt_rcpm_amt;
	}

	public String getPrecpt_rcpm_amt(){
		return this.precpt_rcpm_amt;
	}

	public String getTrufnd_rcpm_amt(){
		return this.trufnd_rcpm_amt;
	}

	public String getTrufnd_dlco_clsf_cd(){
		return this.trufnd_dlco_clsf_cd;
	}

	public String getTrufnd_dlco_ern(){
		return this.trufnd_dlco_ern;
	}

	public String getTrufnd_slip_clsf_cd(){
		return this.trufnd_slip_clsf_cd;
	}

	public String getCash_sub_seq(){
		return this.cash_sub_seq;
	}

	public String getCash_rcpm_amt(){
		return this.cash_rcpm_amt;
	}

	public String getDeps_mode(){
		return this.deps_mode;
	}

	public String getDeps_sub_seq(){
		return this.deps_sub_seq;
	}

	public String getDeps_rcpm_amt(){
		return this.deps_rcpm_amt;
	}

	public String getDeps_rmtt_dt(){
		return this.deps_rmtt_dt;
	}

	public String getDeps_rmtt_plac(){
		return this.deps_rmtt_plac;
	}

	public String getDeps_acct_mang_no(){
		return this.deps_acct_mang_no;
	}

	public String getDeps_coms_amt(){
		return this.deps_coms_amt;
	}

	public String getDeps_biz_reg_no(){
		return this.deps_biz_reg_no;
	}

	public String getDeps_bank_id(){
		return this.deps_bank_id;
	}

	public String getDeps_acct_num(){
		return this.deps_acct_num;
	}

	public String getDeps_tran_date(){
		return this.deps_tran_date;
	}

	public String getDeps_tran_date_seq(){
		return this.deps_tran_date_seq;
	}

	public String getDeps_acct_tonghwa_ref(){
		return this.deps_acct_tonghwa_ref;
	}

	public String getDeps_frex_amt(){
		return this.deps_frex_amt;
	}

	public String getNote_mode(){
		return this.note_mode;
	}

	public String getNote_sub_seq(){
		return this.note_sub_seq;
	}

	public String getNote_bank_cd(){
		return this.note_bank_cd;
	}

	public String getNote_note_no(){
		return this.note_note_no;
	}

	public String getNote_note_clsf_cd(){
		return this.note_note_clsf_cd;
	}

	public String getNote_comp_dt(){
		return this.note_comp_dt;
	}

	public String getNote_mtry_dt(){
		return this.note_mtry_dt;
	}

	public String getNote_rcpm_amt(){
		return this.note_rcpm_amt;
	}

	public String getNote_issu_cmpy_clsf(){
		return this.note_issu_cmpy_clsf;
	}

	public String getNote_issu_pers_nm(){
		return this.note_issu_pers_nm;
	}

	public String getNote_rcpm_acct(){
		return this.note_rcpm_acct;
	}

	public String getNote_sale_aprv_no(){
		return this.note_sale_aprv_no;
	}

	public String getEtc_mode(){
		return this.etc_mode;
	}

	public String getEtc_sub_seq(){
		return this.etc_sub_seq;
	}

	public String getEtc_budg_cd(){
		return this.etc_budg_cd;
	}

	public String getEtc_rcpm_amt(){
		return this.etc_rcpm_amt;
	}

	public String getEtc_bal_occr_slip_clsf(){
		return this.etc_bal_occr_slip_clsf;
	}

	public String getEtc_bal_occr_slip_no(){
		return this.etc_bal_occr_slip_no;
	}

	public String getSQL(){
		 return "{ call MISAST.SP_AS_LEAS_1308_I(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		AS_LEAS_1308_IDM dm = (AS_LEAS_1308_IDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.incmg_pers_ipadd);
		cstmt.setString(5, dm.incmg_pers);
		cstmt.setString(6, dm.chg_pers);
		cstmt.setString(7, dm.rcpm_shet_no);
		cstmt.setString(8, dm.dlco_clsf_cd);
		cstmt.setString(9, dm.dlco_ern);
		cstmt.setString(10, dm.inout_clsf);
		cstmt.setString(11, dm.inout_acct_clsf);
		cstmt.setString(12, dm.gurt_payo_clsf);
		cstmt.setString(13, dm.remk);
		cstmt.setString(14, dm.bldg_cd);
		cstmt.setString(15, dm.cntr_yy);
		cstmt.setString(16, dm.cntr_seq);
		cstmt.setString(17, dm.gurt_rcpm_amt);
		cstmt.setString(18, dm.precpt_rcpm_amt);
		cstmt.setString(19, dm.trufnd_rcpm_amt);
		cstmt.setString(20, dm.trufnd_dlco_clsf_cd);
		cstmt.setString(21, dm.trufnd_dlco_ern);
		cstmt.setString(22, dm.trufnd_slip_clsf_cd);
		cstmt.setString(23, dm.cash_sub_seq);
		cstmt.setString(24, dm.cash_rcpm_amt);
		cstmt.setString(25, dm.deps_mode);
		cstmt.setString(26, dm.deps_sub_seq);
		cstmt.setString(27, dm.deps_rcpm_amt);
		cstmt.setString(28, dm.deps_rmtt_dt);
		cstmt.setString(29, dm.deps_rmtt_plac);
		cstmt.setString(30, dm.deps_acct_mang_no);
		cstmt.setString(31, dm.deps_coms_amt);
		cstmt.setString(32, dm.deps_biz_reg_no);
		cstmt.setString(33, dm.deps_bank_id);
		cstmt.setString(34, dm.deps_acct_num);
		cstmt.setString(35, dm.deps_tran_date);
		cstmt.setString(36, dm.deps_tran_date_seq);
		cstmt.setString(37, dm.deps_acct_tonghwa_ref);
		cstmt.setString(38, dm.deps_frex_amt);
		cstmt.setString(39, dm.note_mode);
		cstmt.setString(40, dm.note_sub_seq);
		cstmt.setString(41, dm.note_bank_cd);
		cstmt.setString(42, dm.note_note_no);
		cstmt.setString(43, dm.note_note_clsf_cd);
		cstmt.setString(44, dm.note_comp_dt);
		cstmt.setString(45, dm.note_mtry_dt);
		cstmt.setString(46, dm.note_rcpm_amt);
		cstmt.setString(47, dm.note_issu_cmpy_clsf);
		cstmt.setString(48, dm.note_issu_pers_nm);
		cstmt.setString(49, dm.note_rcpm_acct);
		cstmt.setString(50, dm.note_sale_aprv_no);
		cstmt.setString(51, dm.etc_mode);
		cstmt.setString(52, dm.etc_sub_seq);
		cstmt.setString(53, dm.etc_budg_cd);
		cstmt.setString(54, dm.etc_rcpm_amt);
		cstmt.setString(55, dm.etc_bal_occr_slip_clsf);
		cstmt.setString(56, dm.etc_bal_occr_slip_no);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.as.leas.ds.AS_LEAS_1308_IDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("incmg_pers_ipadd = [" + getIncmg_pers_ipadd() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("chg_pers = [" + getChg_pers() + "]");
		System.out.println("rcpm_shet_no = [" + getRcpm_shet_no() + "]");
		System.out.println("dlco_clsf_cd = [" + getDlco_clsf_cd() + "]");
		System.out.println("dlco_ern = [" + getDlco_ern() + "]");
		System.out.println("inout_clsf = [" + getInout_clsf() + "]");
		System.out.println("inout_acct_clsf = [" + getInout_acct_clsf() + "]");
		System.out.println("gurt_payo_clsf = [" + getGurt_payo_clsf() + "]");
		System.out.println("remk = [" + getRemk() + "]");
		System.out.println("bldg_cd = [" + getBldg_cd() + "]");
		System.out.println("cntr_yy = [" + getCntr_yy() + "]");
		System.out.println("cntr_seq = [" + getCntr_seq() + "]");
		System.out.println("gurt_rcpm_amt = [" + getGurt_rcpm_amt() + "]");
		System.out.println("precpt_rcpm_amt = [" + getPrecpt_rcpm_amt() + "]");
		System.out.println("trufnd_rcpm_amt = [" + getTrufnd_rcpm_amt() + "]");
		System.out.println("trufnd_dlco_clsf_cd = [" + getTrufnd_dlco_clsf_cd() + "]");
		System.out.println("trufnd_dlco_ern = [" + getTrufnd_dlco_ern() + "]");
		System.out.println("trufnd_slip_clsf_cd = [" + getTrufnd_slip_clsf_cd() + "]");
		System.out.println("cash_sub_seq = [" + getCash_sub_seq() + "]");
		System.out.println("cash_rcpm_amt = [" + getCash_rcpm_amt() + "]");
		System.out.println("deps_mode = [" + getDeps_mode() + "]");
		System.out.println("deps_sub_seq = [" + getDeps_sub_seq() + "]");
		System.out.println("deps_rcpm_amt = [" + getDeps_rcpm_amt() + "]");
		System.out.println("deps_rmtt_dt = [" + getDeps_rmtt_dt() + "]");
		System.out.println("deps_rmtt_plac = [" + getDeps_rmtt_plac() + "]");
		System.out.println("deps_acct_mang_no = [" + getDeps_acct_mang_no() + "]");
		System.out.println("deps_coms_amt = [" + getDeps_coms_amt() + "]");
		System.out.println("deps_biz_reg_no = [" + getDeps_biz_reg_no() + "]");
		System.out.println("deps_bank_id = [" + getDeps_bank_id() + "]");
		System.out.println("deps_acct_num = [" + getDeps_acct_num() + "]");
		System.out.println("deps_tran_date = [" + getDeps_tran_date() + "]");
		System.out.println("deps_tran_date_seq = [" + getDeps_tran_date_seq() + "]");
		System.out.println("deps_acct_tonghwa_ref = [" + getDeps_acct_tonghwa_ref() + "]");
		System.out.println("deps_frex_amt = [" + getDeps_frex_amt() + "]");
		System.out.println("note_mode = [" + getNote_mode() + "]");
		System.out.println("note_sub_seq = [" + getNote_sub_seq() + "]");
		System.out.println("note_bank_cd = [" + getNote_bank_cd() + "]");
		System.out.println("note_note_no = [" + getNote_note_no() + "]");
		System.out.println("note_note_clsf_cd = [" + getNote_note_clsf_cd() + "]");
		System.out.println("note_comp_dt = [" + getNote_comp_dt() + "]");
		System.out.println("note_mtry_dt = [" + getNote_mtry_dt() + "]");
		System.out.println("note_rcpm_amt = [" + getNote_rcpm_amt() + "]");
		System.out.println("note_issu_cmpy_clsf = [" + getNote_issu_cmpy_clsf() + "]");
		System.out.println("note_issu_pers_nm = [" + getNote_issu_pers_nm() + "]");
		System.out.println("note_rcpm_acct = [" + getNote_rcpm_acct() + "]");
		System.out.println("note_sale_aprv_no = [" + getNote_sale_aprv_no() + "]");
		System.out.println("etc_mode = [" + getEtc_mode() + "]");
		System.out.println("etc_sub_seq = [" + getEtc_sub_seq() + "]");
		System.out.println("etc_budg_cd = [" + getEtc_budg_cd() + "]");
		System.out.println("etc_rcpm_amt = [" + getEtc_rcpm_amt() + "]");
		System.out.println("etc_bal_occr_slip_clsf = [" + getEtc_bal_occr_slip_clsf() + "]");
		System.out.println("etc_bal_occr_slip_no = [" + getEtc_bal_occr_slip_no() + "]");
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String cmpy_cd = req.getParameter("cmpy_cd");
if( cmpy_cd == null){
	System.out.println(this.toString+" : cmpy_cd is null" );
}else{
	System.out.println(this.toString+" : cmpy_cd is "+cmpy_cd );
}
String incmg_pers_ipadd = req.getParameter("incmg_pers_ipadd");
if( incmg_pers_ipadd == null){
	System.out.println(this.toString+" : incmg_pers_ipadd is null" );
}else{
	System.out.println(this.toString+" : incmg_pers_ipadd is "+incmg_pers_ipadd );
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
String rcpm_shet_no = req.getParameter("rcpm_shet_no");
if( rcpm_shet_no == null){
	System.out.println(this.toString+" : rcpm_shet_no is null" );
}else{
	System.out.println(this.toString+" : rcpm_shet_no is "+rcpm_shet_no );
}
String dlco_clsf_cd = req.getParameter("dlco_clsf_cd");
if( dlco_clsf_cd == null){
	System.out.println(this.toString+" : dlco_clsf_cd is null" );
}else{
	System.out.println(this.toString+" : dlco_clsf_cd is "+dlco_clsf_cd );
}
String dlco_ern = req.getParameter("dlco_ern");
if( dlco_ern == null){
	System.out.println(this.toString+" : dlco_ern is null" );
}else{
	System.out.println(this.toString+" : dlco_ern is "+dlco_ern );
}
String inout_clsf = req.getParameter("inout_clsf");
if( inout_clsf == null){
	System.out.println(this.toString+" : inout_clsf is null" );
}else{
	System.out.println(this.toString+" : inout_clsf is "+inout_clsf );
}
String inout_acct_clsf = req.getParameter("inout_acct_clsf");
if( inout_acct_clsf == null){
	System.out.println(this.toString+" : inout_acct_clsf is null" );
}else{
	System.out.println(this.toString+" : inout_acct_clsf is "+inout_acct_clsf );
}
String gurt_payo_clsf = req.getParameter("gurt_payo_clsf");
if( gurt_payo_clsf == null){
	System.out.println(this.toString+" : gurt_payo_clsf is null" );
}else{
	System.out.println(this.toString+" : gurt_payo_clsf is "+gurt_payo_clsf );
}
String remk = req.getParameter("remk");
if( remk == null){
	System.out.println(this.toString+" : remk is null" );
}else{
	System.out.println(this.toString+" : remk is "+remk );
}
String bldg_cd = req.getParameter("bldg_cd");
if( bldg_cd == null){
	System.out.println(this.toString+" : bldg_cd is null" );
}else{
	System.out.println(this.toString+" : bldg_cd is "+bldg_cd );
}
String cntr_yy = req.getParameter("cntr_yy");
if( cntr_yy == null){
	System.out.println(this.toString+" : cntr_yy is null" );
}else{
	System.out.println(this.toString+" : cntr_yy is "+cntr_yy );
}
String cntr_seq = req.getParameter("cntr_seq");
if( cntr_seq == null){
	System.out.println(this.toString+" : cntr_seq is null" );
}else{
	System.out.println(this.toString+" : cntr_seq is "+cntr_seq );
}
String gurt_rcpm_amt = req.getParameter("gurt_rcpm_amt");
if( gurt_rcpm_amt == null){
	System.out.println(this.toString+" : gurt_rcpm_amt is null" );
}else{
	System.out.println(this.toString+" : gurt_rcpm_amt is "+gurt_rcpm_amt );
}
String precpt_rcpm_amt = req.getParameter("precpt_rcpm_amt");
if( precpt_rcpm_amt == null){
	System.out.println(this.toString+" : precpt_rcpm_amt is null" );
}else{
	System.out.println(this.toString+" : precpt_rcpm_amt is "+precpt_rcpm_amt );
}
String trufnd_rcpm_amt = req.getParameter("trufnd_rcpm_amt");
if( trufnd_rcpm_amt == null){
	System.out.println(this.toString+" : trufnd_rcpm_amt is null" );
}else{
	System.out.println(this.toString+" : trufnd_rcpm_amt is "+trufnd_rcpm_amt );
}
String trufnd_dlco_clsf_cd = req.getParameter("trufnd_dlco_clsf_cd");
if( trufnd_dlco_clsf_cd == null){
	System.out.println(this.toString+" : trufnd_dlco_clsf_cd is null" );
}else{
	System.out.println(this.toString+" : trufnd_dlco_clsf_cd is "+trufnd_dlco_clsf_cd );
}
String trufnd_dlco_ern = req.getParameter("trufnd_dlco_ern");
if( trufnd_dlco_ern == null){
	System.out.println(this.toString+" : trufnd_dlco_ern is null" );
}else{
	System.out.println(this.toString+" : trufnd_dlco_ern is "+trufnd_dlco_ern );
}
String trufnd_slip_clsf_cd = req.getParameter("trufnd_slip_clsf_cd");
if( trufnd_slip_clsf_cd == null){
	System.out.println(this.toString+" : trufnd_slip_clsf_cd is null" );
}else{
	System.out.println(this.toString+" : trufnd_slip_clsf_cd is "+trufnd_slip_clsf_cd );
}
String cash_sub_seq = req.getParameter("cash_sub_seq");
if( cash_sub_seq == null){
	System.out.println(this.toString+" : cash_sub_seq is null" );
}else{
	System.out.println(this.toString+" : cash_sub_seq is "+cash_sub_seq );
}
String cash_rcpm_amt = req.getParameter("cash_rcpm_amt");
if( cash_rcpm_amt == null){
	System.out.println(this.toString+" : cash_rcpm_amt is null" );
}else{
	System.out.println(this.toString+" : cash_rcpm_amt is "+cash_rcpm_amt );
}
String deps_mode = req.getParameter("deps_mode");
if( deps_mode == null){
	System.out.println(this.toString+" : deps_mode is null" );
}else{
	System.out.println(this.toString+" : deps_mode is "+deps_mode );
}
String deps_sub_seq = req.getParameter("deps_sub_seq");
if( deps_sub_seq == null){
	System.out.println(this.toString+" : deps_sub_seq is null" );
}else{
	System.out.println(this.toString+" : deps_sub_seq is "+deps_sub_seq );
}
String deps_rcpm_amt = req.getParameter("deps_rcpm_amt");
if( deps_rcpm_amt == null){
	System.out.println(this.toString+" : deps_rcpm_amt is null" );
}else{
	System.out.println(this.toString+" : deps_rcpm_amt is "+deps_rcpm_amt );
}
String deps_rmtt_dt = req.getParameter("deps_rmtt_dt");
if( deps_rmtt_dt == null){
	System.out.println(this.toString+" : deps_rmtt_dt is null" );
}else{
	System.out.println(this.toString+" : deps_rmtt_dt is "+deps_rmtt_dt );
}
String deps_rmtt_plac = req.getParameter("deps_rmtt_plac");
if( deps_rmtt_plac == null){
	System.out.println(this.toString+" : deps_rmtt_plac is null" );
}else{
	System.out.println(this.toString+" : deps_rmtt_plac is "+deps_rmtt_plac );
}
String deps_acct_mang_no = req.getParameter("deps_acct_mang_no");
if( deps_acct_mang_no == null){
	System.out.println(this.toString+" : deps_acct_mang_no is null" );
}else{
	System.out.println(this.toString+" : deps_acct_mang_no is "+deps_acct_mang_no );
}
String deps_coms_amt = req.getParameter("deps_coms_amt");
if( deps_coms_amt == null){
	System.out.println(this.toString+" : deps_coms_amt is null" );
}else{
	System.out.println(this.toString+" : deps_coms_amt is "+deps_coms_amt );
}
String deps_biz_reg_no = req.getParameter("deps_biz_reg_no");
if( deps_biz_reg_no == null){
	System.out.println(this.toString+" : deps_biz_reg_no is null" );
}else{
	System.out.println(this.toString+" : deps_biz_reg_no is "+deps_biz_reg_no );
}
String deps_bank_id = req.getParameter("deps_bank_id");
if( deps_bank_id == null){
	System.out.println(this.toString+" : deps_bank_id is null" );
}else{
	System.out.println(this.toString+" : deps_bank_id is "+deps_bank_id );
}
String deps_acct_num = req.getParameter("deps_acct_num");
if( deps_acct_num == null){
	System.out.println(this.toString+" : deps_acct_num is null" );
}else{
	System.out.println(this.toString+" : deps_acct_num is "+deps_acct_num );
}
String deps_tran_date = req.getParameter("deps_tran_date");
if( deps_tran_date == null){
	System.out.println(this.toString+" : deps_tran_date is null" );
}else{
	System.out.println(this.toString+" : deps_tran_date is "+deps_tran_date );
}
String deps_tran_date_seq = req.getParameter("deps_tran_date_seq");
if( deps_tran_date_seq == null){
	System.out.println(this.toString+" : deps_tran_date_seq is null" );
}else{
	System.out.println(this.toString+" : deps_tran_date_seq is "+deps_tran_date_seq );
}
String deps_acct_tonghwa_ref = req.getParameter("deps_acct_tonghwa_ref");
if( deps_acct_tonghwa_ref == null){
	System.out.println(this.toString+" : deps_acct_tonghwa_ref is null" );
}else{
	System.out.println(this.toString+" : deps_acct_tonghwa_ref is "+deps_acct_tonghwa_ref );
}
String deps_frex_amt = req.getParameter("deps_frex_amt");
if( deps_frex_amt == null){
	System.out.println(this.toString+" : deps_frex_amt is null" );
}else{
	System.out.println(this.toString+" : deps_frex_amt is "+deps_frex_amt );
}
String note_mode = req.getParameter("note_mode");
if( note_mode == null){
	System.out.println(this.toString+" : note_mode is null" );
}else{
	System.out.println(this.toString+" : note_mode is "+note_mode );
}
String note_sub_seq = req.getParameter("note_sub_seq");
if( note_sub_seq == null){
	System.out.println(this.toString+" : note_sub_seq is null" );
}else{
	System.out.println(this.toString+" : note_sub_seq is "+note_sub_seq );
}
String note_bank_cd = req.getParameter("note_bank_cd");
if( note_bank_cd == null){
	System.out.println(this.toString+" : note_bank_cd is null" );
}else{
	System.out.println(this.toString+" : note_bank_cd is "+note_bank_cd );
}
String note_note_no = req.getParameter("note_note_no");
if( note_note_no == null){
	System.out.println(this.toString+" : note_note_no is null" );
}else{
	System.out.println(this.toString+" : note_note_no is "+note_note_no );
}
String note_note_clsf_cd = req.getParameter("note_note_clsf_cd");
if( note_note_clsf_cd == null){
	System.out.println(this.toString+" : note_note_clsf_cd is null" );
}else{
	System.out.println(this.toString+" : note_note_clsf_cd is "+note_note_clsf_cd );
}
String note_comp_dt = req.getParameter("note_comp_dt");
if( note_comp_dt == null){
	System.out.println(this.toString+" : note_comp_dt is null" );
}else{
	System.out.println(this.toString+" : note_comp_dt is "+note_comp_dt );
}
String note_mtry_dt = req.getParameter("note_mtry_dt");
if( note_mtry_dt == null){
	System.out.println(this.toString+" : note_mtry_dt is null" );
}else{
	System.out.println(this.toString+" : note_mtry_dt is "+note_mtry_dt );
}
String note_rcpm_amt = req.getParameter("note_rcpm_amt");
if( note_rcpm_amt == null){
	System.out.println(this.toString+" : note_rcpm_amt is null" );
}else{
	System.out.println(this.toString+" : note_rcpm_amt is "+note_rcpm_amt );
}
String note_issu_cmpy_clsf = req.getParameter("note_issu_cmpy_clsf");
if( note_issu_cmpy_clsf == null){
	System.out.println(this.toString+" : note_issu_cmpy_clsf is null" );
}else{
	System.out.println(this.toString+" : note_issu_cmpy_clsf is "+note_issu_cmpy_clsf );
}
String note_issu_pers_nm = req.getParameter("note_issu_pers_nm");
if( note_issu_pers_nm == null){
	System.out.println(this.toString+" : note_issu_pers_nm is null" );
}else{
	System.out.println(this.toString+" : note_issu_pers_nm is "+note_issu_pers_nm );
}
String note_rcpm_acct = req.getParameter("note_rcpm_acct");
if( note_rcpm_acct == null){
	System.out.println(this.toString+" : note_rcpm_acct is null" );
}else{
	System.out.println(this.toString+" : note_rcpm_acct is "+note_rcpm_acct );
}
String note_sale_aprv_no = req.getParameter("note_sale_aprv_no");
if( note_sale_aprv_no == null){
	System.out.println(this.toString+" : note_sale_aprv_no is null" );
}else{
	System.out.println(this.toString+" : note_sale_aprv_no is "+note_sale_aprv_no );
}
String etc_mode = req.getParameter("etc_mode");
if( etc_mode == null){
	System.out.println(this.toString+" : etc_mode is null" );
}else{
	System.out.println(this.toString+" : etc_mode is "+etc_mode );
}
String etc_sub_seq = req.getParameter("etc_sub_seq");
if( etc_sub_seq == null){
	System.out.println(this.toString+" : etc_sub_seq is null" );
}else{
	System.out.println(this.toString+" : etc_sub_seq is "+etc_sub_seq );
}
String etc_budg_cd = req.getParameter("etc_budg_cd");
if( etc_budg_cd == null){
	System.out.println(this.toString+" : etc_budg_cd is null" );
}else{
	System.out.println(this.toString+" : etc_budg_cd is "+etc_budg_cd );
}
String etc_rcpm_amt = req.getParameter("etc_rcpm_amt");
if( etc_rcpm_amt == null){
	System.out.println(this.toString+" : etc_rcpm_amt is null" );
}else{
	System.out.println(this.toString+" : etc_rcpm_amt is "+etc_rcpm_amt );
}
String etc_bal_occr_slip_clsf = req.getParameter("etc_bal_occr_slip_clsf");
if( etc_bal_occr_slip_clsf == null){
	System.out.println(this.toString+" : etc_bal_occr_slip_clsf is null" );
}else{
	System.out.println(this.toString+" : etc_bal_occr_slip_clsf is "+etc_bal_occr_slip_clsf );
}
String etc_bal_occr_slip_no = req.getParameter("etc_bal_occr_slip_no");
if( etc_bal_occr_slip_no == null){
	System.out.println(this.toString+" : etc_bal_occr_slip_no is null" );
}else{
	System.out.println(this.toString+" : etc_bal_occr_slip_no is "+etc_bal_occr_slip_no );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String chg_pers = Util.checkString(req.getParameter("chg_pers"));
String rcpm_shet_no = Util.checkString(req.getParameter("rcpm_shet_no"));
String dlco_clsf_cd = Util.checkString(req.getParameter("dlco_clsf_cd"));
String dlco_ern = Util.checkString(req.getParameter("dlco_ern"));
String inout_clsf = Util.checkString(req.getParameter("inout_clsf"));
String inout_acct_clsf = Util.checkString(req.getParameter("inout_acct_clsf"));
String gurt_payo_clsf = Util.checkString(req.getParameter("gurt_payo_clsf"));
String remk = Util.checkString(req.getParameter("remk"));
String bldg_cd = Util.checkString(req.getParameter("bldg_cd"));
String cntr_yy = Util.checkString(req.getParameter("cntr_yy"));
String cntr_seq = Util.checkString(req.getParameter("cntr_seq"));
String gurt_rcpm_amt = Util.checkString(req.getParameter("gurt_rcpm_amt"));
String precpt_rcpm_amt = Util.checkString(req.getParameter("precpt_rcpm_amt"));
String trufnd_rcpm_amt = Util.checkString(req.getParameter("trufnd_rcpm_amt"));
String trufnd_dlco_clsf_cd = Util.checkString(req.getParameter("trufnd_dlco_clsf_cd"));
String trufnd_dlco_ern = Util.checkString(req.getParameter("trufnd_dlco_ern"));
String trufnd_slip_clsf_cd = Util.checkString(req.getParameter("trufnd_slip_clsf_cd"));
String cash_sub_seq = Util.checkString(req.getParameter("cash_sub_seq"));
String cash_rcpm_amt = Util.checkString(req.getParameter("cash_rcpm_amt"));
String deps_mode = Util.checkString(req.getParameter("deps_mode"));
String deps_sub_seq = Util.checkString(req.getParameter("deps_sub_seq"));
String deps_rcpm_amt = Util.checkString(req.getParameter("deps_rcpm_amt"));
String deps_rmtt_dt = Util.checkString(req.getParameter("deps_rmtt_dt"));
String deps_rmtt_plac = Util.checkString(req.getParameter("deps_rmtt_plac"));
String deps_acct_mang_no = Util.checkString(req.getParameter("deps_acct_mang_no"));
String deps_coms_amt = Util.checkString(req.getParameter("deps_coms_amt"));
String deps_biz_reg_no = Util.checkString(req.getParameter("deps_biz_reg_no"));
String deps_bank_id = Util.checkString(req.getParameter("deps_bank_id"));
String deps_acct_num = Util.checkString(req.getParameter("deps_acct_num"));
String deps_tran_date = Util.checkString(req.getParameter("deps_tran_date"));
String deps_tran_date_seq = Util.checkString(req.getParameter("deps_tran_date_seq"));
String deps_acct_tonghwa_ref = Util.checkString(req.getParameter("deps_acct_tonghwa_ref"));
String deps_frex_amt = Util.checkString(req.getParameter("deps_frex_amt"));
String note_mode = Util.checkString(req.getParameter("note_mode"));
String note_sub_seq = Util.checkString(req.getParameter("note_sub_seq"));
String note_bank_cd = Util.checkString(req.getParameter("note_bank_cd"));
String note_note_no = Util.checkString(req.getParameter("note_note_no"));
String note_note_clsf_cd = Util.checkString(req.getParameter("note_note_clsf_cd"));
String note_comp_dt = Util.checkString(req.getParameter("note_comp_dt"));
String note_mtry_dt = Util.checkString(req.getParameter("note_mtry_dt"));
String note_rcpm_amt = Util.checkString(req.getParameter("note_rcpm_amt"));
String note_issu_cmpy_clsf = Util.checkString(req.getParameter("note_issu_cmpy_clsf"));
String note_issu_pers_nm = Util.checkString(req.getParameter("note_issu_pers_nm"));
String note_rcpm_acct = Util.checkString(req.getParameter("note_rcpm_acct"));
String note_sale_aprv_no = Util.checkString(req.getParameter("note_sale_aprv_no"));
String etc_mode = Util.checkString(req.getParameter("etc_mode"));
String etc_sub_seq = Util.checkString(req.getParameter("etc_sub_seq"));
String etc_budg_cd = Util.checkString(req.getParameter("etc_budg_cd"));
String etc_rcpm_amt = Util.checkString(req.getParameter("etc_rcpm_amt"));
String etc_bal_occr_slip_clsf = Util.checkString(req.getParameter("etc_bal_occr_slip_clsf"));
String etc_bal_occr_slip_no = Util.checkString(req.getParameter("etc_bal_occr_slip_no"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String incmg_pers_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipadd")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String chg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("chg_pers")));
String rcpm_shet_no = Util.Uni2Ksc(Util.checkString(req.getParameter("rcpm_shet_no")));
String dlco_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_clsf_cd")));
String dlco_ern = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_ern")));
String inout_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("inout_clsf")));
String inout_acct_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("inout_acct_clsf")));
String gurt_payo_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("gurt_payo_clsf")));
String remk = Util.Uni2Ksc(Util.checkString(req.getParameter("remk")));
String bldg_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("bldg_cd")));
String cntr_yy = Util.Uni2Ksc(Util.checkString(req.getParameter("cntr_yy")));
String cntr_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("cntr_seq")));
String gurt_rcpm_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("gurt_rcpm_amt")));
String precpt_rcpm_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("precpt_rcpm_amt")));
String trufnd_rcpm_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("trufnd_rcpm_amt")));
String trufnd_dlco_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("trufnd_dlco_clsf_cd")));
String trufnd_dlco_ern = Util.Uni2Ksc(Util.checkString(req.getParameter("trufnd_dlco_ern")));
String trufnd_slip_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("trufnd_slip_clsf_cd")));
String cash_sub_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("cash_sub_seq")));
String cash_rcpm_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("cash_rcpm_amt")));
String deps_mode = Util.Uni2Ksc(Util.checkString(req.getParameter("deps_mode")));
String deps_sub_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("deps_sub_seq")));
String deps_rcpm_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("deps_rcpm_amt")));
String deps_rmtt_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("deps_rmtt_dt")));
String deps_rmtt_plac = Util.Uni2Ksc(Util.checkString(req.getParameter("deps_rmtt_plac")));
String deps_acct_mang_no = Util.Uni2Ksc(Util.checkString(req.getParameter("deps_acct_mang_no")));
String deps_coms_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("deps_coms_amt")));
String deps_biz_reg_no = Util.Uni2Ksc(Util.checkString(req.getParameter("deps_biz_reg_no")));
String deps_bank_id = Util.Uni2Ksc(Util.checkString(req.getParameter("deps_bank_id")));
String deps_acct_num = Util.Uni2Ksc(Util.checkString(req.getParameter("deps_acct_num")));
String deps_tran_date = Util.Uni2Ksc(Util.checkString(req.getParameter("deps_tran_date")));
String deps_tran_date_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("deps_tran_date_seq")));
String deps_acct_tonghwa_ref = Util.Uni2Ksc(Util.checkString(req.getParameter("deps_acct_tonghwa_ref")));
String deps_frex_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("deps_frex_amt")));
String note_mode = Util.Uni2Ksc(Util.checkString(req.getParameter("note_mode")));
String note_sub_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("note_sub_seq")));
String note_bank_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("note_bank_cd")));
String note_note_no = Util.Uni2Ksc(Util.checkString(req.getParameter("note_note_no")));
String note_note_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("note_note_clsf_cd")));
String note_comp_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("note_comp_dt")));
String note_mtry_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("note_mtry_dt")));
String note_rcpm_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("note_rcpm_amt")));
String note_issu_cmpy_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("note_issu_cmpy_clsf")));
String note_issu_pers_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("note_issu_pers_nm")));
String note_rcpm_acct = Util.Uni2Ksc(Util.checkString(req.getParameter("note_rcpm_acct")));
String note_sale_aprv_no = Util.Uni2Ksc(Util.checkString(req.getParameter("note_sale_aprv_no")));
String etc_mode = Util.Uni2Ksc(Util.checkString(req.getParameter("etc_mode")));
String etc_sub_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("etc_sub_seq")));
String etc_budg_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("etc_budg_cd")));
String etc_rcpm_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("etc_rcpm_amt")));
String etc_bal_occr_slip_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("etc_bal_occr_slip_clsf")));
String etc_bal_occr_slip_no = Util.Uni2Ksc(Util.checkString(req.getParameter("etc_bal_occr_slip_no")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
dm.setIncmg_pers(incmg_pers);
dm.setChg_pers(chg_pers);
dm.setRcpm_shet_no(rcpm_shet_no);
dm.setDlco_clsf_cd(dlco_clsf_cd);
dm.setDlco_ern(dlco_ern);
dm.setInout_clsf(inout_clsf);
dm.setInout_acct_clsf(inout_acct_clsf);
dm.setGurt_payo_clsf(gurt_payo_clsf);
dm.setRemk(remk);
dm.setBldg_cd(bldg_cd);
dm.setCntr_yy(cntr_yy);
dm.setCntr_seq(cntr_seq);
dm.setGurt_rcpm_amt(gurt_rcpm_amt);
dm.setPrecpt_rcpm_amt(precpt_rcpm_amt);
dm.setTrufnd_rcpm_amt(trufnd_rcpm_amt);
dm.setTrufnd_dlco_clsf_cd(trufnd_dlco_clsf_cd);
dm.setTrufnd_dlco_ern(trufnd_dlco_ern);
dm.setTrufnd_slip_clsf_cd(trufnd_slip_clsf_cd);
dm.setCash_sub_seq(cash_sub_seq);
dm.setCash_rcpm_amt(cash_rcpm_amt);
dm.setDeps_mode(deps_mode);
dm.setDeps_sub_seq(deps_sub_seq);
dm.setDeps_rcpm_amt(deps_rcpm_amt);
dm.setDeps_rmtt_dt(deps_rmtt_dt);
dm.setDeps_rmtt_plac(deps_rmtt_plac);
dm.setDeps_acct_mang_no(deps_acct_mang_no);
dm.setDeps_coms_amt(deps_coms_amt);
dm.setDeps_biz_reg_no(deps_biz_reg_no);
dm.setDeps_bank_id(deps_bank_id);
dm.setDeps_acct_num(deps_acct_num);
dm.setDeps_tran_date(deps_tran_date);
dm.setDeps_tran_date_seq(deps_tran_date_seq);
dm.setDeps_acct_tonghwa_ref(deps_acct_tonghwa_ref);
dm.setDeps_frex_amt(deps_frex_amt);
dm.setNote_mode(note_mode);
dm.setNote_sub_seq(note_sub_seq);
dm.setNote_bank_cd(note_bank_cd);
dm.setNote_note_no(note_note_no);
dm.setNote_note_clsf_cd(note_note_clsf_cd);
dm.setNote_comp_dt(note_comp_dt);
dm.setNote_mtry_dt(note_mtry_dt);
dm.setNote_rcpm_amt(note_rcpm_amt);
dm.setNote_issu_cmpy_clsf(note_issu_cmpy_clsf);
dm.setNote_issu_pers_nm(note_issu_pers_nm);
dm.setNote_rcpm_acct(note_rcpm_acct);
dm.setNote_sale_aprv_no(note_sale_aprv_no);
dm.setEtc_mode(etc_mode);
dm.setEtc_sub_seq(etc_sub_seq);
dm.setEtc_budg_cd(etc_budg_cd);
dm.setEtc_rcpm_amt(etc_rcpm_amt);
dm.setEtc_bal_occr_slip_clsf(etc_bal_occr_slip_clsf);
dm.setEtc_bal_occr_slip_no(etc_bal_occr_slip_no);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Jun 09 17:06:09 KST 2010 */
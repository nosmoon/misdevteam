/***************************************************************************************************
* 파일명 : .java
* 기능 :  재무회계 - 전표관리 - 수입결의관리 - 공통수입결의등록
* 작성일자 : 2011-04-27
* 작성자 : 노상현
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
 * 재무회계 - 전표관리 - 수입결의관리 - 공통수입결의등록
 */

public class FC_ACCT_2123_UDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String reg_clsf;
	public String prof_type_cd;
	public String slip_clsf_cd;
	public String slip_occr_dt;
	public String slip_seq;
	public String make_dt;
	public String erplace_cd;
	public String dlco_clsf_cd;
	public String dlco_cd;
	public String deal_clsf;
	public String ern;
	public String dlco_nm;
	public String presi_nm;
	public String addr;
	public String bizcond;
	public String item;
	public String evnt_cd;
	public String suply_amt;
	public String vat_amt;
	public String tax_stmt_aprv_yn;
	public String make_upd_dt;
	public String upd_tms;
	public String last_upd_dd;
	public String rcpt_nosh;
	public String sg_budg_cd;
	public String ask_emp_no;
	public String ask_dept_cd;
	public String rcpm_plan_dd;
	public String incmg_pers;
	public String incmg_pers_ipadd;
	public String sgtitem;
	public String slip_rcpm_dt;
	public String slip_sub_seq;
	public String gt_budg_cd;
	public String rcpm_amt;
	public String rcpm_dt;
	public String deps_psbk;
	public String coms;
	public String rcpm_pers_nm;
	public String gt_note_no;
	public String gt_bank_cd;
	public String note_clsf_cd;
	public String comp_dt;
	public String mtry_dt;
	public String note_amt;
	public String issu_cmpy_clsf_cd;
	public String issu_pers_nm;
	public String ee_bank_cd;
	public String ee_note_no;
	public String in_igyb;
	public String rcpm_shet_kind;
	public String rcpm_shet_no;
	public String whco_slip_clsf;
	public String whco_slip_no;
	public String medi_cd;
	public String semuro_no;
	public String elec_tax_comp_cd;

	public FC_ACCT_2123_UDM(){}
	public FC_ACCT_2123_UDM(String cmpy_cd, String reg_clsf, String prof_type_cd, String slip_clsf_cd, String slip_occr_dt, String slip_seq, String make_dt, String erplace_cd, String dlco_clsf_cd, String dlco_cd, String deal_clsf, String ern, String dlco_nm, String presi_nm, String addr, String bizcond, String item, String evnt_cd, String suply_amt, String vat_amt, String tax_stmt_aprv_yn, String make_upd_dt, String upd_tms, String last_upd_dd, String rcpt_nosh, String sg_budg_cd, String ask_emp_no, String ask_dept_cd, String rcpm_plan_dd, String incmg_pers, String incmg_pers_ipadd, String sgtitem, String slip_rcpm_dt, String slip_sub_seq, String gt_budg_cd, String rcpm_amt, String rcpm_dt, String deps_psbk, String coms, String rcpm_pers_nm, String gt_note_no, String gt_bank_cd, String note_clsf_cd, String comp_dt, String mtry_dt, String note_amt, String issu_cmpy_clsf_cd, String issu_pers_nm, String ee_bank_cd, String ee_note_no, String in_igyb, String rcpm_shet_kind, String rcpm_shet_no, String whco_slip_clsf, String whco_slip_no, String medi_cd, String semuro_no, String elec_tax_comp_cd){
		this.cmpy_cd = cmpy_cd;
		this.reg_clsf = reg_clsf;
		this.prof_type_cd = prof_type_cd;
		this.slip_clsf_cd = slip_clsf_cd;
		this.slip_occr_dt = slip_occr_dt;
		this.slip_seq = slip_seq;
		this.make_dt = make_dt;
		this.erplace_cd = erplace_cd;
		this.dlco_clsf_cd = dlco_clsf_cd;
		this.dlco_cd = dlco_cd;
		this.deal_clsf = deal_clsf;
		this.ern = ern;
		this.dlco_nm = dlco_nm;
		this.presi_nm = presi_nm;
		this.addr = addr;
		this.bizcond = bizcond;
		this.item = item;
		this.evnt_cd = evnt_cd;
		this.suply_amt = suply_amt;
		this.vat_amt = vat_amt;
		this.tax_stmt_aprv_yn = tax_stmt_aprv_yn;
		this.make_upd_dt = make_upd_dt;
		this.upd_tms = upd_tms;
		this.last_upd_dd = last_upd_dd;
		this.rcpt_nosh = rcpt_nosh;
		this.sg_budg_cd = sg_budg_cd;
		this.ask_emp_no = ask_emp_no;
		this.ask_dept_cd = ask_dept_cd;
		this.rcpm_plan_dd = rcpm_plan_dd;
		this.incmg_pers = incmg_pers;
		this.incmg_pers_ipadd = incmg_pers_ipadd;
		this.sgtitem = sgtitem;
		this.slip_rcpm_dt = slip_rcpm_dt;
		this.slip_sub_seq = slip_sub_seq;
		this.gt_budg_cd = gt_budg_cd;
		this.rcpm_amt = rcpm_amt;
		this.rcpm_dt = rcpm_dt;
		this.deps_psbk = deps_psbk;
		this.coms = coms;
		this.rcpm_pers_nm = rcpm_pers_nm;
		this.gt_note_no = gt_note_no;
		this.gt_bank_cd = gt_bank_cd;
		this.note_clsf_cd = note_clsf_cd;
		this.comp_dt = comp_dt;
		this.mtry_dt = mtry_dt;
		this.note_amt = note_amt;
		this.issu_cmpy_clsf_cd = issu_cmpy_clsf_cd;
		this.issu_pers_nm = issu_pers_nm;
		this.ee_bank_cd = ee_bank_cd;
		this.ee_note_no = ee_note_no;
		this.in_igyb = in_igyb;
		this.rcpm_shet_kind = rcpm_shet_kind;
		this.rcpm_shet_no = rcpm_shet_no;
		this.whco_slip_clsf = whco_slip_clsf;
		this.whco_slip_no = whco_slip_no;
		this.medi_cd = medi_cd;
		this.semuro_no = semuro_no;
		this.elec_tax_comp_cd = elec_tax_comp_cd;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setReg_clsf(String reg_clsf){
		this.reg_clsf = reg_clsf;
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

	public void setDeal_clsf(String deal_clsf){
		this.deal_clsf = deal_clsf;
	}

	public void setErn(String ern){
		this.ern = ern;
	}

	public void setDlco_nm(String dlco_nm){
		this.dlco_nm = dlco_nm;
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

	public void setEvnt_cd(String evnt_cd){
		this.evnt_cd = evnt_cd;
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

	public void setMake_upd_dt(String make_upd_dt){
		this.make_upd_dt = make_upd_dt;
	}

	public void setUpd_tms(String upd_tms){
		this.upd_tms = upd_tms;
	}

	public void setLast_upd_dd(String last_upd_dd){
		this.last_upd_dd = last_upd_dd;
	}

	public void setRcpt_nosh(String rcpt_nosh){
		this.rcpt_nosh = rcpt_nosh;
	}

	public void setSg_budg_cd(String sg_budg_cd){
		this.sg_budg_cd = sg_budg_cd;
	}

	public void setAsk_emp_no(String ask_emp_no){
		this.ask_emp_no = ask_emp_no;
	}

	public void setAsk_dept_cd(String ask_dept_cd){
		this.ask_dept_cd = ask_dept_cd;
	}

	public void setRcpm_plan_dd(String rcpm_plan_dd){
		this.rcpm_plan_dd = rcpm_plan_dd;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setIncmg_pers_ipadd(String incmg_pers_ipadd){
		this.incmg_pers_ipadd = incmg_pers_ipadd;
	}

	public void setSgtitem(String sgtitem){
		this.sgtitem = sgtitem;
	}

	public void setSlip_rcpm_dt(String slip_rcpm_dt){
		this.slip_rcpm_dt = slip_rcpm_dt;
	}

	public void setSlip_sub_seq(String slip_sub_seq){
		this.slip_sub_seq = slip_sub_seq;
	}

	public void setGt_budg_cd(String gt_budg_cd){
		this.gt_budg_cd = gt_budg_cd;
	}

	public void setRcpm_amt(String rcpm_amt){
		this.rcpm_amt = rcpm_amt;
	}

	public void setRcpm_dt(String rcpm_dt){
		this.rcpm_dt = rcpm_dt;
	}

	public void setDeps_psbk(String deps_psbk){
		this.deps_psbk = deps_psbk;
	}

	public void setComs(String coms){
		this.coms = coms;
	}

	public void setRcpm_pers_nm(String rcpm_pers_nm){
		this.rcpm_pers_nm = rcpm_pers_nm;
	}

	public void setGt_note_no(String gt_note_no){
		this.gt_note_no = gt_note_no;
	}

	public void setGt_bank_cd(String gt_bank_cd){
		this.gt_bank_cd = gt_bank_cd;
	}

	public void setNote_clsf_cd(String note_clsf_cd){
		this.note_clsf_cd = note_clsf_cd;
	}

	public void setComp_dt(String comp_dt){
		this.comp_dt = comp_dt;
	}

	public void setMtry_dt(String mtry_dt){
		this.mtry_dt = mtry_dt;
	}

	public void setNote_amt(String note_amt){
		this.note_amt = note_amt;
	}

	public void setIssu_cmpy_clsf_cd(String issu_cmpy_clsf_cd){
		this.issu_cmpy_clsf_cd = issu_cmpy_clsf_cd;
	}

	public void setIssu_pers_nm(String issu_pers_nm){
		this.issu_pers_nm = issu_pers_nm;
	}

	public void setEe_bank_cd(String ee_bank_cd){
		this.ee_bank_cd = ee_bank_cd;
	}

	public void setEe_note_no(String ee_note_no){
		this.ee_note_no = ee_note_no;
	}

	public void setIn_igyb(String in_igyb){
		this.in_igyb = in_igyb;
	}

	public void setRcpm_shet_kind(String rcpm_shet_kind){
		this.rcpm_shet_kind = rcpm_shet_kind;
	}

	public void setRcpm_shet_no(String rcpm_shet_no){
		this.rcpm_shet_no = rcpm_shet_no;
	}

	public void setWhco_slip_clsf(String whco_slip_clsf){
		this.whco_slip_clsf = whco_slip_clsf;
	}

	public void setWhco_slip_no(String whco_slip_no){
		this.whco_slip_no = whco_slip_no;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setSemuro_no(String semuro_no){
		this.semuro_no = semuro_no;
	}

	public void setElec_tax_comp_cd(String elec_tax_comp_cd){
		this.elec_tax_comp_cd = elec_tax_comp_cd;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getReg_clsf(){
		return this.reg_clsf;
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

	public String getDeal_clsf(){
		return this.deal_clsf;
	}

	public String getErn(){
		return this.ern;
	}

	public String getDlco_nm(){
		return this.dlco_nm;
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

	public String getEvnt_cd(){
		return this.evnt_cd;
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

	public String getMake_upd_dt(){
		return this.make_upd_dt;
	}

	public String getUpd_tms(){
		return this.upd_tms;
	}

	public String getLast_upd_dd(){
		return this.last_upd_dd;
	}

	public String getRcpt_nosh(){
		return this.rcpt_nosh;
	}

	public String getSg_budg_cd(){
		return this.sg_budg_cd;
	}

	public String getAsk_emp_no(){
		return this.ask_emp_no;
	}

	public String getAsk_dept_cd(){
		return this.ask_dept_cd;
	}

	public String getRcpm_plan_dd(){
		return this.rcpm_plan_dd;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getIncmg_pers_ipadd(){
		return this.incmg_pers_ipadd;
	}

	public String getSgtitem(){
		return this.sgtitem;
	}

	public String getSlip_rcpm_dt(){
		return this.slip_rcpm_dt;
	}

	public String getSlip_sub_seq(){
		return this.slip_sub_seq;
	}

	public String getGt_budg_cd(){
		return this.gt_budg_cd;
	}

	public String getRcpm_amt(){
		return this.rcpm_amt;
	}

	public String getRcpm_dt(){
		return this.rcpm_dt;
	}

	public String getDeps_psbk(){
		return this.deps_psbk;
	}

	public String getComs(){
		return this.coms;
	}

	public String getRcpm_pers_nm(){
		return this.rcpm_pers_nm;
	}

	public String getGt_note_no(){
		return this.gt_note_no;
	}

	public String getGt_bank_cd(){
		return this.gt_bank_cd;
	}

	public String getNote_clsf_cd(){
		return this.note_clsf_cd;
	}

	public String getComp_dt(){
		return this.comp_dt;
	}

	public String getMtry_dt(){
		return this.mtry_dt;
	}

	public String getNote_amt(){
		return this.note_amt;
	}

	public String getIssu_cmpy_clsf_cd(){
		return this.issu_cmpy_clsf_cd;
	}

	public String getIssu_pers_nm(){
		return this.issu_pers_nm;
	}

	public String getEe_bank_cd(){
		return this.ee_bank_cd;
	}

	public String getEe_note_no(){
		return this.ee_note_no;
	}

	public String getIn_igyb(){
		return this.in_igyb;
	}

	public String getRcpm_shet_kind(){
		return this.rcpm_shet_kind;
	}

	public String getRcpm_shet_no(){
		return this.rcpm_shet_no;
	}

	public String getWhco_slip_clsf(){
		return this.whco_slip_clsf;
	}

	public String getWhco_slip_no(){
		return this.whco_slip_no;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getSemuro_no(){
		return this.semuro_no;
	}

	public String getElec_tax_comp_cd(){
		return this.elec_tax_comp_cd;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_FC_ACCT_2123_U(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		FC_ACCT_2123_UDM dm = (FC_ACCT_2123_UDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.reg_clsf);
		cstmt.setString(5, dm.prof_type_cd);
		cstmt.setString(6, dm.slip_clsf_cd);
		cstmt.setString(7, dm.slip_occr_dt);
		cstmt.setString(8, dm.slip_seq);
		cstmt.setString(9, dm.make_dt);
		cstmt.setString(10, dm.erplace_cd);
		cstmt.setString(11, dm.dlco_clsf_cd);
		cstmt.setString(12, dm.dlco_cd);
		cstmt.setString(13, dm.deal_clsf);
		cstmt.setString(14, dm.ern);
		cstmt.setString(15, dm.dlco_nm);
		cstmt.setString(16, dm.presi_nm);
		cstmt.setString(17, dm.addr);
		cstmt.setString(18, dm.bizcond);
		cstmt.setString(19, dm.item);
		cstmt.setString(20, dm.evnt_cd);
		cstmt.setString(21, dm.suply_amt);
		cstmt.setString(22, dm.vat_amt);
		cstmt.setString(23, dm.tax_stmt_aprv_yn);
		cstmt.setString(24, dm.make_upd_dt);
		cstmt.setString(25, dm.upd_tms);
		cstmt.setString(26, dm.last_upd_dd);
		cstmt.setString(27, dm.rcpt_nosh);
		cstmt.setString(28, dm.sg_budg_cd);
		cstmt.setString(29, dm.ask_emp_no);
		cstmt.setString(30, dm.ask_dept_cd);
		cstmt.setString(31, dm.rcpm_plan_dd);
		cstmt.setString(32, dm.incmg_pers);
		cstmt.setString(33, dm.incmg_pers_ipadd);
		cstmt.setString(34, dm.sgtitem);
		cstmt.setString(35, dm.slip_rcpm_dt);
		cstmt.setString(36, dm.slip_sub_seq);
		cstmt.setString(37, dm.gt_budg_cd);
		cstmt.setString(38, dm.rcpm_amt);
		cstmt.setString(39, dm.rcpm_dt);
		cstmt.setString(40, dm.deps_psbk);
		cstmt.setString(41, dm.coms);
		cstmt.setString(42, dm.rcpm_pers_nm);
		cstmt.setString(43, dm.gt_note_no);
		cstmt.setString(44, dm.gt_bank_cd);
		cstmt.setString(45, dm.note_clsf_cd);
		cstmt.setString(46, dm.comp_dt);
		cstmt.setString(47, dm.mtry_dt);
		cstmt.setString(48, dm.note_amt);
		cstmt.setString(49, dm.issu_cmpy_clsf_cd);
		cstmt.setString(50, dm.issu_pers_nm);
		cstmt.setString(51, dm.ee_bank_cd);
		cstmt.setString(52, dm.ee_note_no);
		cstmt.setString(53, dm.in_igyb);
		cstmt.setString(54, dm.rcpm_shet_kind);
		cstmt.setString(55, dm.rcpm_shet_no);
		cstmt.setString(56, dm.whco_slip_clsf);
		cstmt.setString(57, dm.whco_slip_no);
		cstmt.setString(58, dm.medi_cd);
		cstmt.setString(59, dm.semuro_no);
		cstmt.setString(60, dm.elec_tax_comp_cd);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.fc.acct.ds.FC_ACCT_2123_UDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("reg_clsf = [" + getReg_clsf() + "]");
		System.out.println("prof_type_cd = [" + getProf_type_cd() + "]");
		System.out.println("slip_clsf_cd = [" + getSlip_clsf_cd() + "]");
		System.out.println("slip_occr_dt = [" + getSlip_occr_dt() + "]");
		System.out.println("slip_seq = [" + getSlip_seq() + "]");
		System.out.println("make_dt = [" + getMake_dt() + "]");
		System.out.println("erplace_cd = [" + getErplace_cd() + "]");
		System.out.println("dlco_clsf_cd = [" + getDlco_clsf_cd() + "]");
		System.out.println("dlco_cd = [" + getDlco_cd() + "]");
		System.out.println("deal_clsf = [" + getDeal_clsf() + "]");
		System.out.println("ern = [" + getErn() + "]");
		System.out.println("dlco_nm = [" + getDlco_nm() + "]");
		System.out.println("presi_nm = [" + getPresi_nm() + "]");
		System.out.println("addr = [" + getAddr() + "]");
		System.out.println("bizcond = [" + getBizcond() + "]");
		System.out.println("item = [" + getItem() + "]");
		System.out.println("evnt_cd = [" + getEvnt_cd() + "]");
		System.out.println("suply_amt = [" + getSuply_amt() + "]");
		System.out.println("vat_amt = [" + getVat_amt() + "]");
		System.out.println("tax_stmt_aprv_yn = [" + getTax_stmt_aprv_yn() + "]");
		System.out.println("make_upd_dt = [" + getMake_upd_dt() + "]");
		System.out.println("upd_tms = [" + getUpd_tms() + "]");
		System.out.println("last_upd_dd = [" + getLast_upd_dd() + "]");
		System.out.println("rcpt_nosh = [" + getRcpt_nosh() + "]");
		System.out.println("sg_budg_cd = [" + getSg_budg_cd() + "]");
		System.out.println("ask_emp_no = [" + getAsk_emp_no() + "]");
		System.out.println("ask_dept_cd = [" + getAsk_dept_cd() + "]");
		System.out.println("rcpm_plan_dd = [" + getRcpm_plan_dd() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("incmg_pers_ipadd = [" + getIncmg_pers_ipadd() + "]");
		System.out.println("sgtitem = [" + getSgtitem() + "]");
		System.out.println("slip_rcpm_dt = [" + getSlip_rcpm_dt() + "]");
		System.out.println("slip_sub_seq = [" + getSlip_sub_seq() + "]");
		System.out.println("gt_budg_cd = [" + getGt_budg_cd() + "]");
		System.out.println("rcpm_amt = [" + getRcpm_amt() + "]");
		System.out.println("rcpm_dt = [" + getRcpm_dt() + "]");
		System.out.println("deps_psbk = [" + getDeps_psbk() + "]");
		System.out.println("coms = [" + getComs() + "]");
		System.out.println("rcpm_pers_nm = [" + getRcpm_pers_nm() + "]");
		System.out.println("gt_note_no = [" + getGt_note_no() + "]");
		System.out.println("gt_bank_cd = [" + getGt_bank_cd() + "]");
		System.out.println("note_clsf_cd = [" + getNote_clsf_cd() + "]");
		System.out.println("comp_dt = [" + getComp_dt() + "]");
		System.out.println("mtry_dt = [" + getMtry_dt() + "]");
		System.out.println("note_amt = [" + getNote_amt() + "]");
		System.out.println("issu_cmpy_clsf_cd = [" + getIssu_cmpy_clsf_cd() + "]");
		System.out.println("issu_pers_nm = [" + getIssu_pers_nm() + "]");
		System.out.println("ee_bank_cd = [" + getEe_bank_cd() + "]");
		System.out.println("ee_note_no = [" + getEe_note_no() + "]");
		System.out.println("in_igyb = [" + getIn_igyb() + "]");
		System.out.println("rcpm_shet_kind = [" + getRcpm_shet_kind() + "]");
		System.out.println("rcpm_shet_no = [" + getRcpm_shet_no() + "]");
		System.out.println("whco_slip_clsf = [" + getWhco_slip_clsf() + "]");
		System.out.println("whco_slip_no = [" + getWhco_slip_no() + "]");
		System.out.println("medi_cd = [" + getMedi_cd() + "]");
		System.out.println("semuro_no = [" + getSemuro_no() + "]");
		System.out.println("elec_tax_comp_cd = [" + getElec_tax_comp_cd() + "]");
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
String reg_clsf = req.getParameter("reg_clsf");
if( reg_clsf == null){
	System.out.println(this.toString+" : reg_clsf is null" );
}else{
	System.out.println(this.toString+" : reg_clsf is "+reg_clsf );
}
String prof_type_cd = req.getParameter("prof_type_cd");
if( prof_type_cd == null){
	System.out.println(this.toString+" : prof_type_cd is null" );
}else{
	System.out.println(this.toString+" : prof_type_cd is "+prof_type_cd );
}
String slip_clsf_cd = req.getParameter("slip_clsf_cd");
if( slip_clsf_cd == null){
	System.out.println(this.toString+" : slip_clsf_cd is null" );
}else{
	System.out.println(this.toString+" : slip_clsf_cd is "+slip_clsf_cd );
}
String slip_occr_dt = req.getParameter("slip_occr_dt");
if( slip_occr_dt == null){
	System.out.println(this.toString+" : slip_occr_dt is null" );
}else{
	System.out.println(this.toString+" : slip_occr_dt is "+slip_occr_dt );
}
String slip_seq = req.getParameter("slip_seq");
if( slip_seq == null){
	System.out.println(this.toString+" : slip_seq is null" );
}else{
	System.out.println(this.toString+" : slip_seq is "+slip_seq );
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
String deal_clsf = req.getParameter("deal_clsf");
if( deal_clsf == null){
	System.out.println(this.toString+" : deal_clsf is null" );
}else{
	System.out.println(this.toString+" : deal_clsf is "+deal_clsf );
}
String ern = req.getParameter("ern");
if( ern == null){
	System.out.println(this.toString+" : ern is null" );
}else{
	System.out.println(this.toString+" : ern is "+ern );
}
String dlco_nm = req.getParameter("dlco_nm");
if( dlco_nm == null){
	System.out.println(this.toString+" : dlco_nm is null" );
}else{
	System.out.println(this.toString+" : dlco_nm is "+dlco_nm );
}
String presi_nm = req.getParameter("presi_nm");
if( presi_nm == null){
	System.out.println(this.toString+" : presi_nm is null" );
}else{
	System.out.println(this.toString+" : presi_nm is "+presi_nm );
}
String addr = req.getParameter("addr");
if( addr == null){
	System.out.println(this.toString+" : addr is null" );
}else{
	System.out.println(this.toString+" : addr is "+addr );
}
String bizcond = req.getParameter("bizcond");
if( bizcond == null){
	System.out.println(this.toString+" : bizcond is null" );
}else{
	System.out.println(this.toString+" : bizcond is "+bizcond );
}
String item = req.getParameter("item");
if( item == null){
	System.out.println(this.toString+" : item is null" );
}else{
	System.out.println(this.toString+" : item is "+item );
}
String evnt_cd = req.getParameter("evnt_cd");
if( evnt_cd == null){
	System.out.println(this.toString+" : evnt_cd is null" );
}else{
	System.out.println(this.toString+" : evnt_cd is "+evnt_cd );
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
String tax_stmt_aprv_yn = req.getParameter("tax_stmt_aprv_yn");
if( tax_stmt_aprv_yn == null){
	System.out.println(this.toString+" : tax_stmt_aprv_yn is null" );
}else{
	System.out.println(this.toString+" : tax_stmt_aprv_yn is "+tax_stmt_aprv_yn );
}
String make_upd_dt = req.getParameter("make_upd_dt");
if( make_upd_dt == null){
	System.out.println(this.toString+" : make_upd_dt is null" );
}else{
	System.out.println(this.toString+" : make_upd_dt is "+make_upd_dt );
}
String upd_tms = req.getParameter("upd_tms");
if( upd_tms == null){
	System.out.println(this.toString+" : upd_tms is null" );
}else{
	System.out.println(this.toString+" : upd_tms is "+upd_tms );
}
String last_upd_dd = req.getParameter("last_upd_dd");
if( last_upd_dd == null){
	System.out.println(this.toString+" : last_upd_dd is null" );
}else{
	System.out.println(this.toString+" : last_upd_dd is "+last_upd_dd );
}
String rcpt_nosh = req.getParameter("rcpt_nosh");
if( rcpt_nosh == null){
	System.out.println(this.toString+" : rcpt_nosh is null" );
}else{
	System.out.println(this.toString+" : rcpt_nosh is "+rcpt_nosh );
}
String sg_budg_cd = req.getParameter("sg_budg_cd");
if( sg_budg_cd == null){
	System.out.println(this.toString+" : sg_budg_cd is null" );
}else{
	System.out.println(this.toString+" : sg_budg_cd is "+sg_budg_cd );
}
String ask_emp_no = req.getParameter("ask_emp_no");
if( ask_emp_no == null){
	System.out.println(this.toString+" : ask_emp_no is null" );
}else{
	System.out.println(this.toString+" : ask_emp_no is "+ask_emp_no );
}
String ask_dept_cd = req.getParameter("ask_dept_cd");
if( ask_dept_cd == null){
	System.out.println(this.toString+" : ask_dept_cd is null" );
}else{
	System.out.println(this.toString+" : ask_dept_cd is "+ask_dept_cd );
}
String rcpm_plan_dd = req.getParameter("rcpm_plan_dd");
if( rcpm_plan_dd == null){
	System.out.println(this.toString+" : rcpm_plan_dd is null" );
}else{
	System.out.println(this.toString+" : rcpm_plan_dd is "+rcpm_plan_dd );
}
String incmg_pers = req.getParameter("incmg_pers");
if( incmg_pers == null){
	System.out.println(this.toString+" : incmg_pers is null" );
}else{
	System.out.println(this.toString+" : incmg_pers is "+incmg_pers );
}
String incmg_pers_ipadd = req.getParameter("incmg_pers_ipadd");
if( incmg_pers_ipadd == null){
	System.out.println(this.toString+" : incmg_pers_ipadd is null" );
}else{
	System.out.println(this.toString+" : incmg_pers_ipadd is "+incmg_pers_ipadd );
}
String sgtitem = req.getParameter("sgtitem");
if( sgtitem == null){
	System.out.println(this.toString+" : sgtitem is null" );
}else{
	System.out.println(this.toString+" : sgtitem is "+sgtitem );
}
String slip_rcpm_dt = req.getParameter("slip_rcpm_dt");
if( slip_rcpm_dt == null){
	System.out.println(this.toString+" : slip_rcpm_dt is null" );
}else{
	System.out.println(this.toString+" : slip_rcpm_dt is "+slip_rcpm_dt );
}
String slip_sub_seq = req.getParameter("slip_sub_seq");
if( slip_sub_seq == null){
	System.out.println(this.toString+" : slip_sub_seq is null" );
}else{
	System.out.println(this.toString+" : slip_sub_seq is "+slip_sub_seq );
}
String gt_budg_cd = req.getParameter("gt_budg_cd");
if( gt_budg_cd == null){
	System.out.println(this.toString+" : gt_budg_cd is null" );
}else{
	System.out.println(this.toString+" : gt_budg_cd is "+gt_budg_cd );
}
String rcpm_amt = req.getParameter("rcpm_amt");
if( rcpm_amt == null){
	System.out.println(this.toString+" : rcpm_amt is null" );
}else{
	System.out.println(this.toString+" : rcpm_amt is "+rcpm_amt );
}
String rcpm_dt = req.getParameter("rcpm_dt");
if( rcpm_dt == null){
	System.out.println(this.toString+" : rcpm_dt is null" );
}else{
	System.out.println(this.toString+" : rcpm_dt is "+rcpm_dt );
}
String deps_psbk = req.getParameter("deps_psbk");
if( deps_psbk == null){
	System.out.println(this.toString+" : deps_psbk is null" );
}else{
	System.out.println(this.toString+" : deps_psbk is "+deps_psbk );
}
String coms = req.getParameter("coms");
if( coms == null){
	System.out.println(this.toString+" : coms is null" );
}else{
	System.out.println(this.toString+" : coms is "+coms );
}
String rcpm_pers_nm = req.getParameter("rcpm_pers_nm");
if( rcpm_pers_nm == null){
	System.out.println(this.toString+" : rcpm_pers_nm is null" );
}else{
	System.out.println(this.toString+" : rcpm_pers_nm is "+rcpm_pers_nm );
}
String gt_note_no = req.getParameter("gt_note_no");
if( gt_note_no == null){
	System.out.println(this.toString+" : gt_note_no is null" );
}else{
	System.out.println(this.toString+" : gt_note_no is "+gt_note_no );
}
String gt_bank_cd = req.getParameter("gt_bank_cd");
if( gt_bank_cd == null){
	System.out.println(this.toString+" : gt_bank_cd is null" );
}else{
	System.out.println(this.toString+" : gt_bank_cd is "+gt_bank_cd );
}
String note_clsf_cd = req.getParameter("note_clsf_cd");
if( note_clsf_cd == null){
	System.out.println(this.toString+" : note_clsf_cd is null" );
}else{
	System.out.println(this.toString+" : note_clsf_cd is "+note_clsf_cd );
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
String note_amt = req.getParameter("note_amt");
if( note_amt == null){
	System.out.println(this.toString+" : note_amt is null" );
}else{
	System.out.println(this.toString+" : note_amt is "+note_amt );
}
String issu_cmpy_clsf_cd = req.getParameter("issu_cmpy_clsf_cd");
if( issu_cmpy_clsf_cd == null){
	System.out.println(this.toString+" : issu_cmpy_clsf_cd is null" );
}else{
	System.out.println(this.toString+" : issu_cmpy_clsf_cd is "+issu_cmpy_clsf_cd );
}
String issu_pers_nm = req.getParameter("issu_pers_nm");
if( issu_pers_nm == null){
	System.out.println(this.toString+" : issu_pers_nm is null" );
}else{
	System.out.println(this.toString+" : issu_pers_nm is "+issu_pers_nm );
}
String ee_bank_cd = req.getParameter("ee_bank_cd");
if( ee_bank_cd == null){
	System.out.println(this.toString+" : ee_bank_cd is null" );
}else{
	System.out.println(this.toString+" : ee_bank_cd is "+ee_bank_cd );
}
String ee_note_no = req.getParameter("ee_note_no");
if( ee_note_no == null){
	System.out.println(this.toString+" : ee_note_no is null" );
}else{
	System.out.println(this.toString+" : ee_note_no is "+ee_note_no );
}
String in_igyb = req.getParameter("in_igyb");
if( in_igyb == null){
	System.out.println(this.toString+" : in_igyb is null" );
}else{
	System.out.println(this.toString+" : in_igyb is "+in_igyb );
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
String whco_slip_clsf = req.getParameter("whco_slip_clsf");
if( whco_slip_clsf == null){
	System.out.println(this.toString+" : whco_slip_clsf is null" );
}else{
	System.out.println(this.toString+" : whco_slip_clsf is "+whco_slip_clsf );
}
String whco_slip_no = req.getParameter("whco_slip_no");
if( whco_slip_no == null){
	System.out.println(this.toString+" : whco_slip_no is null" );
}else{
	System.out.println(this.toString+" : whco_slip_no is "+whco_slip_no );
}
String medi_cd = req.getParameter("medi_cd");
if( medi_cd == null){
	System.out.println(this.toString+" : medi_cd is null" );
}else{
	System.out.println(this.toString+" : medi_cd is "+medi_cd );
}
String semuro_no = req.getParameter("semuro_no");
if( semuro_no == null){
	System.out.println(this.toString+" : semuro_no is null" );
}else{
	System.out.println(this.toString+" : semuro_no is "+semuro_no );
}
String elec_tax_comp_cd = req.getParameter("elec_tax_comp_cd");
if( elec_tax_comp_cd == null){
	System.out.println(this.toString+" : elec_tax_comp_cd is null" );
}else{
	System.out.println(this.toString+" : elec_tax_comp_cd is "+elec_tax_comp_cd );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String reg_clsf = Util.checkString(req.getParameter("reg_clsf"));
String prof_type_cd = Util.checkString(req.getParameter("prof_type_cd"));
String slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
String slip_occr_dt = Util.checkString(req.getParameter("slip_occr_dt"));
String slip_seq = Util.checkString(req.getParameter("slip_seq"));
String make_dt = Util.checkString(req.getParameter("make_dt"));
String erplace_cd = Util.checkString(req.getParameter("erplace_cd"));
String dlco_clsf_cd = Util.checkString(req.getParameter("dlco_clsf_cd"));
String dlco_cd = Util.checkString(req.getParameter("dlco_cd"));
String deal_clsf = Util.checkString(req.getParameter("deal_clsf"));
String ern = Util.checkString(req.getParameter("ern"));
String dlco_nm = Util.checkString(req.getParameter("dlco_nm"));
String presi_nm = Util.checkString(req.getParameter("presi_nm"));
String addr = Util.checkString(req.getParameter("addr"));
String bizcond = Util.checkString(req.getParameter("bizcond"));
String item = Util.checkString(req.getParameter("item"));
String evnt_cd = Util.checkString(req.getParameter("evnt_cd"));
String suply_amt = Util.checkString(req.getParameter("suply_amt"));
String vat_amt = Util.checkString(req.getParameter("vat_amt"));
String tax_stmt_aprv_yn = Util.checkString(req.getParameter("tax_stmt_aprv_yn"));
String make_upd_dt = Util.checkString(req.getParameter("make_upd_dt"));
String upd_tms = Util.checkString(req.getParameter("upd_tms"));
String last_upd_dd = Util.checkString(req.getParameter("last_upd_dd"));
String rcpt_nosh = Util.checkString(req.getParameter("rcpt_nosh"));
String sg_budg_cd = Util.checkString(req.getParameter("sg_budg_cd"));
String ask_emp_no = Util.checkString(req.getParameter("ask_emp_no"));
String ask_dept_cd = Util.checkString(req.getParameter("ask_dept_cd"));
String rcpm_plan_dd = Util.checkString(req.getParameter("rcpm_plan_dd"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
String sgtitem = Util.checkString(req.getParameter("sgtitem"));
String slip_rcpm_dt = Util.checkString(req.getParameter("slip_rcpm_dt"));
String slip_sub_seq = Util.checkString(req.getParameter("slip_sub_seq"));
String gt_budg_cd = Util.checkString(req.getParameter("gt_budg_cd"));
String rcpm_amt = Util.checkString(req.getParameter("rcpm_amt"));
String rcpm_dt = Util.checkString(req.getParameter("rcpm_dt"));
String deps_psbk = Util.checkString(req.getParameter("deps_psbk"));
String coms = Util.checkString(req.getParameter("coms"));
String rcpm_pers_nm = Util.checkString(req.getParameter("rcpm_pers_nm"));
String gt_note_no = Util.checkString(req.getParameter("gt_note_no"));
String gt_bank_cd = Util.checkString(req.getParameter("gt_bank_cd"));
String note_clsf_cd = Util.checkString(req.getParameter("note_clsf_cd"));
String comp_dt = Util.checkString(req.getParameter("comp_dt"));
String mtry_dt = Util.checkString(req.getParameter("mtry_dt"));
String note_amt = Util.checkString(req.getParameter("note_amt"));
String issu_cmpy_clsf_cd = Util.checkString(req.getParameter("issu_cmpy_clsf_cd"));
String issu_pers_nm = Util.checkString(req.getParameter("issu_pers_nm"));
String ee_bank_cd = Util.checkString(req.getParameter("ee_bank_cd"));
String ee_note_no = Util.checkString(req.getParameter("ee_note_no"));
String in_igyb = Util.checkString(req.getParameter("in_igyb"));
String rcpm_shet_kind = Util.checkString(req.getParameter("rcpm_shet_kind"));
String rcpm_shet_no = Util.checkString(req.getParameter("rcpm_shet_no"));
String whco_slip_clsf = Util.checkString(req.getParameter("whco_slip_clsf"));
String whco_slip_no = Util.checkString(req.getParameter("whco_slip_no"));
String medi_cd = Util.checkString(req.getParameter("medi_cd"));
String semuro_no = Util.checkString(req.getParameter("semuro_no"));
String elec_tax_comp_cd = Util.checkString(req.getParameter("elec_tax_comp_cd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String reg_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("reg_clsf")));
String prof_type_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("prof_type_cd")));
String slip_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_clsf_cd")));
String slip_occr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_occr_dt")));
String slip_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_seq")));
String make_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("make_dt")));
String erplace_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("erplace_cd")));
String dlco_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_clsf_cd")));
String dlco_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_cd")));
String deal_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("deal_clsf")));
String ern = Util.Uni2Ksc(Util.checkString(req.getParameter("ern")));
String dlco_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_nm")));
String presi_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("presi_nm")));
String addr = Util.Uni2Ksc(Util.checkString(req.getParameter("addr")));
String bizcond = Util.Uni2Ksc(Util.checkString(req.getParameter("bizcond")));
String item = Util.Uni2Ksc(Util.checkString(req.getParameter("item")));
String evnt_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("evnt_cd")));
String suply_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("suply_amt")));
String vat_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("vat_amt")));
String tax_stmt_aprv_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("tax_stmt_aprv_yn")));
String make_upd_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("make_upd_dt")));
String upd_tms = Util.Uni2Ksc(Util.checkString(req.getParameter("upd_tms")));
String last_upd_dd = Util.Uni2Ksc(Util.checkString(req.getParameter("last_upd_dd")));
String rcpt_nosh = Util.Uni2Ksc(Util.checkString(req.getParameter("rcpt_nosh")));
String sg_budg_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("sg_budg_cd")));
String ask_emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("ask_emp_no")));
String ask_dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("ask_dept_cd")));
String rcpm_plan_dd = Util.Uni2Ksc(Util.checkString(req.getParameter("rcpm_plan_dd")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String incmg_pers_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipadd")));
String sgtitem = Util.Uni2Ksc(Util.checkString(req.getParameter("sgtitem")));
String slip_rcpm_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_rcpm_dt")));
String slip_sub_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_sub_seq")));
String gt_budg_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("gt_budg_cd")));
String rcpm_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("rcpm_amt")));
String rcpm_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("rcpm_dt")));
String deps_psbk = Util.Uni2Ksc(Util.checkString(req.getParameter("deps_psbk")));
String coms = Util.Uni2Ksc(Util.checkString(req.getParameter("coms")));
String rcpm_pers_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("rcpm_pers_nm")));
String gt_note_no = Util.Uni2Ksc(Util.checkString(req.getParameter("gt_note_no")));
String gt_bank_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("gt_bank_cd")));
String note_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("note_clsf_cd")));
String comp_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("comp_dt")));
String mtry_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("mtry_dt")));
String note_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("note_amt")));
String issu_cmpy_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("issu_cmpy_clsf_cd")));
String issu_pers_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("issu_pers_nm")));
String ee_bank_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("ee_bank_cd")));
String ee_note_no = Util.Uni2Ksc(Util.checkString(req.getParameter("ee_note_no")));
String in_igyb = Util.Uni2Ksc(Util.checkString(req.getParameter("in_igyb")));
String rcpm_shet_kind = Util.Uni2Ksc(Util.checkString(req.getParameter("rcpm_shet_kind")));
String rcpm_shet_no = Util.Uni2Ksc(Util.checkString(req.getParameter("rcpm_shet_no")));
String whco_slip_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("whco_slip_clsf")));
String whco_slip_no = Util.Uni2Ksc(Util.checkString(req.getParameter("whco_slip_no")));
String medi_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_cd")));
String semuro_no = Util.Uni2Ksc(Util.checkString(req.getParameter("semuro_no")));
String elec_tax_comp_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("elec_tax_comp_cd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setReg_clsf(reg_clsf);
dm.setProf_type_cd(prof_type_cd);
dm.setSlip_clsf_cd(slip_clsf_cd);
dm.setSlip_occr_dt(slip_occr_dt);
dm.setSlip_seq(slip_seq);
dm.setMake_dt(make_dt);
dm.setErplace_cd(erplace_cd);
dm.setDlco_clsf_cd(dlco_clsf_cd);
dm.setDlco_cd(dlco_cd);
dm.setDeal_clsf(deal_clsf);
dm.setErn(ern);
dm.setDlco_nm(dlco_nm);
dm.setPresi_nm(presi_nm);
dm.setAddr(addr);
dm.setBizcond(bizcond);
dm.setItem(item);
dm.setEvnt_cd(evnt_cd);
dm.setSuply_amt(suply_amt);
dm.setVat_amt(vat_amt);
dm.setTax_stmt_aprv_yn(tax_stmt_aprv_yn);
dm.setMake_upd_dt(make_upd_dt);
dm.setUpd_tms(upd_tms);
dm.setLast_upd_dd(last_upd_dd);
dm.setRcpt_nosh(rcpt_nosh);
dm.setSg_budg_cd(sg_budg_cd);
dm.setAsk_emp_no(ask_emp_no);
dm.setAsk_dept_cd(ask_dept_cd);
dm.setRcpm_plan_dd(rcpm_plan_dd);
dm.setIncmg_pers(incmg_pers);
dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
dm.setSgtitem(sgtitem);
dm.setSlip_rcpm_dt(slip_rcpm_dt);
dm.setSlip_sub_seq(slip_sub_seq);
dm.setGt_budg_cd(gt_budg_cd);
dm.setRcpm_amt(rcpm_amt);
dm.setRcpm_dt(rcpm_dt);
dm.setDeps_psbk(deps_psbk);
dm.setComs(coms);
dm.setRcpm_pers_nm(rcpm_pers_nm);
dm.setGt_note_no(gt_note_no);
dm.setGt_bank_cd(gt_bank_cd);
dm.setNote_clsf_cd(note_clsf_cd);
dm.setComp_dt(comp_dt);
dm.setMtry_dt(mtry_dt);
dm.setNote_amt(note_amt);
dm.setIssu_cmpy_clsf_cd(issu_cmpy_clsf_cd);
dm.setIssu_pers_nm(issu_pers_nm);
dm.setEe_bank_cd(ee_bank_cd);
dm.setEe_note_no(ee_note_no);
dm.setIn_igyb(in_igyb);
dm.setRcpm_shet_kind(rcpm_shet_kind);
dm.setRcpm_shet_no(rcpm_shet_no);
dm.setWhco_slip_clsf(whco_slip_clsf);
dm.setWhco_slip_no(whco_slip_no);
dm.setMedi_cd(medi_cd);
dm.setSemuro_no(semuro_no);
dm.setElec_tax_comp_cd(elec_tax_comp_cd);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Jun 16 19:23:01 KST 2011 */
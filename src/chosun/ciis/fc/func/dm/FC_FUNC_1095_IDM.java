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


package chosun.ciis.fc.func.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.fc.func.ds.*;
import chosun.ciis.fc.func.rec.*;

/**
 * 
 */


public class FC_FUNC_1095_IDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String stat_dt;
	public String dlco_clsf_cd;
	public String dlco_cd;
	public String pch_compnm;
	public String rmks1;
	public String incmg_pers;
	public String incmg_pers_ipadd;
	public String b_bank_cd;
	public String b_note_no;
	public String b_note_seq;
	public String b_rcpay_amt;
	public String b_pch_cymd1to;
	public String a_bank_cd;
	public String a_note_no;
	public String a_note_clsf_cd;
	public String a_note_amt;
	public String a_comp_dt;
	public String a_mtry_dt;
	public String a_issu_cmpy_clsf_cd;
	public String a_issu_pers_nm;
	public String a_rcpm_acct;
	public String a_sale_aprv_no;
	public String a_note_clsf_cd2;
	public String use_dept_cd;
	public String c_budg_cd;
	public String c_repl_amt;
	public String c_deps_clsf_cd;
	public String c_deps_dt;
	public String c_frex_cd;
	public String c_exrate;
	public String c_frex_amt;
	public String c_trufnd_slip_clsf;
	public String c_trufnd_slip_no;
	public String p_budg_cd;
	public String p_repl_amt;
	public String p_deps_clsf_cd;
	public String p_deps_dt;
	public String p_frex_cd;
	public String p_exrate;
	public String p_frex_amt;
	public String p_trufnd_slip_clsf;
	public String p_trufnd_slip_no;
	public String biz_reg_no;
	public String bank_id;
	public String acct_num;
	public String tran_date_seq;
	public String y_budg_cd;
	public String y_repl_amt;
	public String y_deps_clsf_cd;
	public String y_deps_dt;
	public String y_frex_cd;
	public String y_exrate;
	public String y_frex_amt;
	public String y_trufnd_slip_clsf;
	public String y_trufnd_slip_no;
	public String jobamt;

	public FC_FUNC_1095_IDM(){}
	public FC_FUNC_1095_IDM(String cmpy_cd, String stat_dt, String dlco_clsf_cd, String dlco_cd, String pch_compnm, String rmks1, String incmg_pers, String incmg_pers_ipadd, String b_bank_cd, String b_note_no, String b_note_seq, String b_rcpay_amt, String b_pch_cymd1to, String a_bank_cd, String a_note_no, String a_note_clsf_cd, String a_note_amt, String a_comp_dt, String a_mtry_dt, String a_issu_cmpy_clsf_cd, String a_issu_pers_nm, String a_rcpm_acct, String a_sale_aprv_no, String a_note_clsf_cd2, String use_dept_cd, String c_budg_cd, String c_repl_amt, String c_deps_clsf_cd, String c_deps_dt, String c_frex_cd, String c_exrate, String c_frex_amt, String c_trufnd_slip_clsf, String c_trufnd_slip_no, String p_budg_cd, String p_repl_amt, String p_deps_clsf_cd, String p_deps_dt, String p_frex_cd, String p_exrate, String p_frex_amt, String p_trufnd_slip_clsf, String p_trufnd_slip_no, String biz_reg_no, String bank_id, String acct_num, String tran_date_seq, String y_budg_cd, String y_repl_amt, String y_deps_clsf_cd, String y_deps_dt, String y_frex_cd, String y_exrate, String y_frex_amt, String y_trufnd_slip_clsf, String y_trufnd_slip_no, String jobamt){
		this.cmpy_cd = cmpy_cd;
		this.stat_dt = stat_dt;
		this.dlco_clsf_cd = dlco_clsf_cd;
		this.dlco_cd = dlco_cd;
		this.pch_compnm = pch_compnm;
		this.rmks1 = rmks1;
		this.incmg_pers = incmg_pers;
		this.incmg_pers_ipadd = incmg_pers_ipadd;
		this.b_bank_cd = b_bank_cd;
		this.b_note_no = b_note_no;
		this.b_note_seq = b_note_seq;
		this.b_rcpay_amt = b_rcpay_amt;
		this.b_pch_cymd1to = b_pch_cymd1to;
		this.a_bank_cd = a_bank_cd;
		this.a_note_no = a_note_no;
		this.a_note_clsf_cd = a_note_clsf_cd;
		this.a_note_amt = a_note_amt;
		this.a_comp_dt = a_comp_dt;
		this.a_mtry_dt = a_mtry_dt;
		this.a_issu_cmpy_clsf_cd = a_issu_cmpy_clsf_cd;
		this.a_issu_pers_nm = a_issu_pers_nm;
		this.a_rcpm_acct = a_rcpm_acct;
		this.a_sale_aprv_no = a_sale_aprv_no;
		this.a_note_clsf_cd2 = a_note_clsf_cd2;
		this.use_dept_cd = use_dept_cd;
		this.c_budg_cd = c_budg_cd;
		this.c_repl_amt = c_repl_amt;
		this.c_deps_clsf_cd = c_deps_clsf_cd;
		this.c_deps_dt = c_deps_dt;
		this.c_frex_cd = c_frex_cd;
		this.c_exrate = c_exrate;
		this.c_frex_amt = c_frex_amt;
		this.c_trufnd_slip_clsf = c_trufnd_slip_clsf;
		this.c_trufnd_slip_no = c_trufnd_slip_no;
		this.p_budg_cd = p_budg_cd;
		this.p_repl_amt = p_repl_amt;
		this.p_deps_clsf_cd = p_deps_clsf_cd;
		this.p_deps_dt = p_deps_dt;
		this.p_frex_cd = p_frex_cd;
		this.p_exrate = p_exrate;
		this.p_frex_amt = p_frex_amt;
		this.p_trufnd_slip_clsf = p_trufnd_slip_clsf;
		this.p_trufnd_slip_no = p_trufnd_slip_no;
		this.biz_reg_no = biz_reg_no;
		this.bank_id = bank_id;
		this.acct_num = acct_num;
		this.tran_date_seq = tran_date_seq;
		this.y_budg_cd = y_budg_cd;
		this.y_repl_amt = y_repl_amt;
		this.y_deps_clsf_cd = y_deps_clsf_cd;
		this.y_deps_dt = y_deps_dt;
		this.y_frex_cd = y_frex_cd;
		this.y_exrate = y_exrate;
		this.y_frex_amt = y_frex_amt;
		this.y_trufnd_slip_clsf = y_trufnd_slip_clsf;
		this.y_trufnd_slip_no = y_trufnd_slip_no;
		this.jobamt = jobamt;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setStat_dt(String stat_dt){
		this.stat_dt = stat_dt;
	}

	public void setDlco_clsf_cd(String dlco_clsf_cd){
		this.dlco_clsf_cd = dlco_clsf_cd;
	}

	public void setDlco_cd(String dlco_cd){
		this.dlco_cd = dlco_cd;
	}

	public void setPch_compnm(String pch_compnm){
		this.pch_compnm = pch_compnm;
	}

	public void setRmks1(String rmks1){
		this.rmks1 = rmks1;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setIncmg_pers_ipadd(String incmg_pers_ipadd){
		this.incmg_pers_ipadd = incmg_pers_ipadd;
	}

	public void setB_bank_cd(String b_bank_cd){
		this.b_bank_cd = b_bank_cd;
	}

	public void setB_note_no(String b_note_no){
		this.b_note_no = b_note_no;
	}

	public void setB_note_seq(String b_note_seq){
		this.b_note_seq = b_note_seq;
	}

	public void setB_rcpay_amt(String b_rcpay_amt){
		this.b_rcpay_amt = b_rcpay_amt;
	}

	public void setB_pch_cymd1to(String b_pch_cymd1to){
		this.b_pch_cymd1to = b_pch_cymd1to;
	}

	public void setA_bank_cd(String a_bank_cd){
		this.a_bank_cd = a_bank_cd;
	}

	public void setA_note_no(String a_note_no){
		this.a_note_no = a_note_no;
	}

	public void setA_note_clsf_cd(String a_note_clsf_cd){
		this.a_note_clsf_cd = a_note_clsf_cd;
	}

	public void setA_note_amt(String a_note_amt){
		this.a_note_amt = a_note_amt;
	}

	public void setA_comp_dt(String a_comp_dt){
		this.a_comp_dt = a_comp_dt;
	}

	public void setA_mtry_dt(String a_mtry_dt){
		this.a_mtry_dt = a_mtry_dt;
	}

	public void setA_issu_cmpy_clsf_cd(String a_issu_cmpy_clsf_cd){
		this.a_issu_cmpy_clsf_cd = a_issu_cmpy_clsf_cd;
	}

	public void setA_issu_pers_nm(String a_issu_pers_nm){
		this.a_issu_pers_nm = a_issu_pers_nm;
	}

	public void setA_rcpm_acct(String a_rcpm_acct){
		this.a_rcpm_acct = a_rcpm_acct;
	}

	public void setA_sale_aprv_no(String a_sale_aprv_no){
		this.a_sale_aprv_no = a_sale_aprv_no;
	}

	public void setA_note_clsf_cd2(String a_note_clsf_cd2){
		this.a_note_clsf_cd2 = a_note_clsf_cd2;
	}

	public void setUse_dept_cd(String use_dept_cd){
		this.use_dept_cd = use_dept_cd;
	}

	public void setC_budg_cd(String c_budg_cd){
		this.c_budg_cd = c_budg_cd;
	}

	public void setC_repl_amt(String c_repl_amt){
		this.c_repl_amt = c_repl_amt;
	}

	public void setC_deps_clsf_cd(String c_deps_clsf_cd){
		this.c_deps_clsf_cd = c_deps_clsf_cd;
	}

	public void setC_deps_dt(String c_deps_dt){
		this.c_deps_dt = c_deps_dt;
	}

	public void setC_frex_cd(String c_frex_cd){
		this.c_frex_cd = c_frex_cd;
	}

	public void setC_exrate(String c_exrate){
		this.c_exrate = c_exrate;
	}

	public void setC_frex_amt(String c_frex_amt){
		this.c_frex_amt = c_frex_amt;
	}

	public void setC_trufnd_slip_clsf(String c_trufnd_slip_clsf){
		this.c_trufnd_slip_clsf = c_trufnd_slip_clsf;
	}

	public void setC_trufnd_slip_no(String c_trufnd_slip_no){
		this.c_trufnd_slip_no = c_trufnd_slip_no;
	}

	public void setP_budg_cd(String p_budg_cd){
		this.p_budg_cd = p_budg_cd;
	}

	public void setP_repl_amt(String p_repl_amt){
		this.p_repl_amt = p_repl_amt;
	}

	public void setP_deps_clsf_cd(String p_deps_clsf_cd){
		this.p_deps_clsf_cd = p_deps_clsf_cd;
	}

	public void setP_deps_dt(String p_deps_dt){
		this.p_deps_dt = p_deps_dt;
	}

	public void setP_frex_cd(String p_frex_cd){
		this.p_frex_cd = p_frex_cd;
	}

	public void setP_exrate(String p_exrate){
		this.p_exrate = p_exrate;
	}

	public void setP_frex_amt(String p_frex_amt){
		this.p_frex_amt = p_frex_amt;
	}

	public void setP_trufnd_slip_clsf(String p_trufnd_slip_clsf){
		this.p_trufnd_slip_clsf = p_trufnd_slip_clsf;
	}

	public void setP_trufnd_slip_no(String p_trufnd_slip_no){
		this.p_trufnd_slip_no = p_trufnd_slip_no;
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

	public void setTran_date_seq(String tran_date_seq){
		this.tran_date_seq = tran_date_seq;
	}

	public void setY_budg_cd(String y_budg_cd){
		this.y_budg_cd = y_budg_cd;
	}

	public void setY_repl_amt(String y_repl_amt){
		this.y_repl_amt = y_repl_amt;
	}

	public void setY_deps_clsf_cd(String y_deps_clsf_cd){
		this.y_deps_clsf_cd = y_deps_clsf_cd;
	}

	public void setY_deps_dt(String y_deps_dt){
		this.y_deps_dt = y_deps_dt;
	}

	public void setY_frex_cd(String y_frex_cd){
		this.y_frex_cd = y_frex_cd;
	}

	public void setY_exrate(String y_exrate){
		this.y_exrate = y_exrate;
	}

	public void setY_frex_amt(String y_frex_amt){
		this.y_frex_amt = y_frex_amt;
	}

	public void setY_trufnd_slip_clsf(String y_trufnd_slip_clsf){
		this.y_trufnd_slip_clsf = y_trufnd_slip_clsf;
	}

	public void setY_trufnd_slip_no(String y_trufnd_slip_no){
		this.y_trufnd_slip_no = y_trufnd_slip_no;
	}

	public void setJobamt(String jobamt){
		this.jobamt = jobamt;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getStat_dt(){
		return this.stat_dt;
	}

	public String getDlco_clsf_cd(){
		return this.dlco_clsf_cd;
	}

	public String getDlco_cd(){
		return this.dlco_cd;
	}

	public String getPch_compnm(){
		return this.pch_compnm;
	}

	public String getRmks1(){
		return this.rmks1;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getIncmg_pers_ipadd(){
		return this.incmg_pers_ipadd;
	}

	public String getB_bank_cd(){
		return this.b_bank_cd;
	}

	public String getB_note_no(){
		return this.b_note_no;
	}

	public String getB_note_seq(){
		return this.b_note_seq;
	}

	public String getB_rcpay_amt(){
		return this.b_rcpay_amt;
	}

	public String getB_pch_cymd1to(){
		return this.b_pch_cymd1to;
	}

	public String getA_bank_cd(){
		return this.a_bank_cd;
	}

	public String getA_note_no(){
		return this.a_note_no;
	}

	public String getA_note_clsf_cd(){
		return this.a_note_clsf_cd;
	}

	public String getA_note_amt(){
		return this.a_note_amt;
	}

	public String getA_comp_dt(){
		return this.a_comp_dt;
	}

	public String getA_mtry_dt(){
		return this.a_mtry_dt;
	}

	public String getA_issu_cmpy_clsf_cd(){
		return this.a_issu_cmpy_clsf_cd;
	}

	public String getA_issu_pers_nm(){
		return this.a_issu_pers_nm;
	}

	public String getA_rcpm_acct(){
		return this.a_rcpm_acct;
	}

	public String getA_sale_aprv_no(){
		return this.a_sale_aprv_no;
	}

	public String getA_note_clsf_cd2(){
		return this.a_note_clsf_cd2;
	}

	public String getUse_dept_cd(){
		return this.use_dept_cd;
	}

	public String getC_budg_cd(){
		return this.c_budg_cd;
	}

	public String getC_repl_amt(){
		return this.c_repl_amt;
	}

	public String getC_deps_clsf_cd(){
		return this.c_deps_clsf_cd;
	}

	public String getC_deps_dt(){
		return this.c_deps_dt;
	}

	public String getC_frex_cd(){
		return this.c_frex_cd;
	}

	public String getC_exrate(){
		return this.c_exrate;
	}

	public String getC_frex_amt(){
		return this.c_frex_amt;
	}

	public String getC_trufnd_slip_clsf(){
		return this.c_trufnd_slip_clsf;
	}

	public String getC_trufnd_slip_no(){
		return this.c_trufnd_slip_no;
	}

	public String getP_budg_cd(){
		return this.p_budg_cd;
	}

	public String getP_repl_amt(){
		return this.p_repl_amt;
	}

	public String getP_deps_clsf_cd(){
		return this.p_deps_clsf_cd;
	}

	public String getP_deps_dt(){
		return this.p_deps_dt;
	}

	public String getP_frex_cd(){
		return this.p_frex_cd;
	}

	public String getP_exrate(){
		return this.p_exrate;
	}

	public String getP_frex_amt(){
		return this.p_frex_amt;
	}

	public String getP_trufnd_slip_clsf(){
		return this.p_trufnd_slip_clsf;
	}

	public String getP_trufnd_slip_no(){
		return this.p_trufnd_slip_no;
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

	public String getTran_date_seq(){
		return this.tran_date_seq;
	}

	public String getY_budg_cd(){
		return this.y_budg_cd;
	}

	public String getY_repl_amt(){
		return this.y_repl_amt;
	}

	public String getY_deps_clsf_cd(){
		return this.y_deps_clsf_cd;
	}

	public String getY_deps_dt(){
		return this.y_deps_dt;
	}

	public String getY_frex_cd(){
		return this.y_frex_cd;
	}

	public String getY_exrate(){
		return this.y_exrate;
	}

	public String getY_frex_amt(){
		return this.y_frex_amt;
	}

	public String getY_trufnd_slip_clsf(){
		return this.y_trufnd_slip_clsf;
	}

	public String getY_trufnd_slip_no(){
		return this.y_trufnd_slip_no;
	}

	public String getJobamt(){
		return this.jobamt;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_FC_FUNC_1095_I(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		FC_FUNC_1095_IDM dm = (FC_FUNC_1095_IDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.stat_dt);
		cstmt.setString(5, dm.dlco_clsf_cd);
		cstmt.setString(6, dm.dlco_cd);
		cstmt.setString(7, dm.pch_compnm);
		cstmt.setString(8, dm.rmks1);
		cstmt.setString(9, dm.incmg_pers);
		cstmt.setString(10, dm.incmg_pers_ipadd);
		cstmt.setString(11, dm.b_bank_cd);
		cstmt.setString(12, dm.b_note_no);
		cstmt.setString(13, dm.b_note_seq);
		cstmt.setString(14, dm.b_rcpay_amt);
		cstmt.setString(15, dm.b_pch_cymd1to);
		cstmt.setString(16, dm.a_bank_cd);
		cstmt.setString(17, dm.a_note_no);
		cstmt.setString(18, dm.a_note_clsf_cd);
		cstmt.setString(19, dm.a_note_amt);
		cstmt.setString(20, dm.a_comp_dt);
		cstmt.setString(21, dm.a_mtry_dt);
		cstmt.setString(22, dm.a_issu_cmpy_clsf_cd);
		cstmt.setString(23, dm.a_issu_pers_nm);
		cstmt.setString(24, dm.a_rcpm_acct);
		cstmt.setString(25, dm.a_sale_aprv_no);
		cstmt.setString(26, dm.a_note_clsf_cd2);
		cstmt.setString(27, dm.use_dept_cd);
		cstmt.setString(28, dm.c_budg_cd);
		cstmt.setString(29, dm.c_repl_amt);
		cstmt.setString(30, dm.c_deps_clsf_cd);
		cstmt.setString(31, dm.c_deps_dt);
		cstmt.setString(32, dm.c_frex_cd);
		cstmt.setString(33, dm.c_exrate);
		cstmt.setString(34, dm.c_frex_amt);
		cstmt.setString(35, dm.c_trufnd_slip_clsf);
		cstmt.setString(36, dm.c_trufnd_slip_no);
		cstmt.setString(37, dm.p_budg_cd);
		cstmt.setString(38, dm.p_repl_amt);
		cstmt.setString(39, dm.p_deps_clsf_cd);
		cstmt.setString(40, dm.p_deps_dt);
		cstmt.setString(41, dm.p_frex_cd);
		cstmt.setString(42, dm.p_exrate);
		cstmt.setString(43, dm.p_frex_amt);
		cstmt.setString(44, dm.p_trufnd_slip_clsf);
		cstmt.setString(45, dm.p_trufnd_slip_no);
		cstmt.setString(46, dm.biz_reg_no);
		cstmt.setString(47, dm.bank_id);
		cstmt.setString(48, dm.acct_num);
		cstmt.setString(49, dm.tran_date_seq);
		cstmt.setString(50, dm.y_budg_cd);
		cstmt.setString(51, dm.y_repl_amt);
		cstmt.setString(52, dm.y_deps_clsf_cd);
		cstmt.setString(53, dm.y_deps_dt);
		cstmt.setString(54, dm.y_frex_cd);
		cstmt.setString(55, dm.y_exrate);
		cstmt.setString(56, dm.y_frex_amt);
		cstmt.setString(57, dm.y_trufnd_slip_clsf);
		cstmt.setString(58, dm.y_trufnd_slip_no);
		cstmt.setString(59, dm.jobamt);
		cstmt.registerOutParameter(60, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.fc.func.ds.FC_FUNC_1095_IDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("stat_dt = [" + getStat_dt() + "]");
		System.out.println("dlco_clsf_cd = [" + getDlco_clsf_cd() + "]");
		System.out.println("dlco_cd = [" + getDlco_cd() + "]");
		System.out.println("pch_compnm = [" + getPch_compnm() + "]");
		System.out.println("rmks1 = [" + getRmks1() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("incmg_pers_ipadd = [" + getIncmg_pers_ipadd() + "]");
		System.out.println("b_bank_cd = [" + getB_bank_cd() + "]");
		System.out.println("b_note_no = [" + getB_note_no() + "]");
		System.out.println("b_note_seq = [" + getB_note_seq() + "]");
		System.out.println("b_rcpay_amt = [" + getB_rcpay_amt() + "]");
		System.out.println("b_pch_cymd1to = [" + getB_pch_cymd1to() + "]");
		System.out.println("a_bank_cd = [" + getA_bank_cd() + "]");
		System.out.println("a_note_no = [" + getA_note_no() + "]");
		System.out.println("a_note_clsf_cd = [" + getA_note_clsf_cd() + "]");
		System.out.println("a_note_amt = [" + getA_note_amt() + "]");
		System.out.println("a_comp_dt = [" + getA_comp_dt() + "]");
		System.out.println("a_mtry_dt = [" + getA_mtry_dt() + "]");
		System.out.println("a_issu_cmpy_clsf_cd = [" + getA_issu_cmpy_clsf_cd() + "]");
		System.out.println("a_issu_pers_nm = [" + getA_issu_pers_nm() + "]");
		System.out.println("a_rcpm_acct = [" + getA_rcpm_acct() + "]");
		System.out.println("a_sale_aprv_no = [" + getA_sale_aprv_no() + "]");
		System.out.println("a_note_clsf_cd2 = [" + getA_note_clsf_cd2() + "]");
		System.out.println("use_dept_cd = [" + getUse_dept_cd() + "]");
		System.out.println("c_budg_cd = [" + getC_budg_cd() + "]");
		System.out.println("c_repl_amt = [" + getC_repl_amt() + "]");
		System.out.println("c_deps_clsf_cd = [" + getC_deps_clsf_cd() + "]");
		System.out.println("c_deps_dt = [" + getC_deps_dt() + "]");
		System.out.println("c_frex_cd = [" + getC_frex_cd() + "]");
		System.out.println("c_exrate = [" + getC_exrate() + "]");
		System.out.println("c_frex_amt = [" + getC_frex_amt() + "]");
		System.out.println("c_trufnd_slip_clsf = [" + getC_trufnd_slip_clsf() + "]");
		System.out.println("c_trufnd_slip_no = [" + getC_trufnd_slip_no() + "]");
		System.out.println("p_budg_cd = [" + getP_budg_cd() + "]");
		System.out.println("p_repl_amt = [" + getP_repl_amt() + "]");
		System.out.println("p_deps_clsf_cd = [" + getP_deps_clsf_cd() + "]");
		System.out.println("p_deps_dt = [" + getP_deps_dt() + "]");
		System.out.println("p_frex_cd = [" + getP_frex_cd() + "]");
		System.out.println("p_exrate = [" + getP_exrate() + "]");
		System.out.println("p_frex_amt = [" + getP_frex_amt() + "]");
		System.out.println("p_trufnd_slip_clsf = [" + getP_trufnd_slip_clsf() + "]");
		System.out.println("p_trufnd_slip_no = [" + getP_trufnd_slip_no() + "]");
		System.out.println("biz_reg_no = [" + getBiz_reg_no() + "]");
		System.out.println("bank_id = [" + getBank_id() + "]");
		System.out.println("acct_num = [" + getAcct_num() + "]");
		System.out.println("tran_date_seq = [" + getTran_date_seq() + "]");
		System.out.println("y_budg_cd = [" + getY_budg_cd() + "]");
		System.out.println("y_repl_amt = [" + getY_repl_amt() + "]");
		System.out.println("y_deps_clsf_cd = [" + getY_deps_clsf_cd() + "]");
		System.out.println("y_deps_dt = [" + getY_deps_dt() + "]");
		System.out.println("y_frex_cd = [" + getY_frex_cd() + "]");
		System.out.println("y_exrate = [" + getY_exrate() + "]");
		System.out.println("y_frex_amt = [" + getY_frex_amt() + "]");
		System.out.println("y_trufnd_slip_clsf = [" + getY_trufnd_slip_clsf() + "]");
		System.out.println("y_trufnd_slip_no = [" + getY_trufnd_slip_no() + "]");
		System.out.println("jobamt = [" + getJobamt() + "]");
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
String stat_dt = req.getParameter("stat_dt");
if( stat_dt == null){
	System.out.println(this.toString+" : stat_dt is null" );
}else{
	System.out.println(this.toString+" : stat_dt is "+stat_dt );
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
String pch_compnm = req.getParameter("pch_compnm");
if( pch_compnm == null){
	System.out.println(this.toString+" : pch_compnm is null" );
}else{
	System.out.println(this.toString+" : pch_compnm is "+pch_compnm );
}
String rmks1 = req.getParameter("rmks1");
if( rmks1 == null){
	System.out.println(this.toString+" : rmks1 is null" );
}else{
	System.out.println(this.toString+" : rmks1 is "+rmks1 );
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
String b_bank_cd = req.getParameter("b_bank_cd");
if( b_bank_cd == null){
	System.out.println(this.toString+" : b_bank_cd is null" );
}else{
	System.out.println(this.toString+" : b_bank_cd is "+b_bank_cd );
}
String b_note_no = req.getParameter("b_note_no");
if( b_note_no == null){
	System.out.println(this.toString+" : b_note_no is null" );
}else{
	System.out.println(this.toString+" : b_note_no is "+b_note_no );
}
String b_note_seq = req.getParameter("b_note_seq");
if( b_note_seq == null){
	System.out.println(this.toString+" : b_note_seq is null" );
}else{
	System.out.println(this.toString+" : b_note_seq is "+b_note_seq );
}
String b_rcpay_amt = req.getParameter("b_rcpay_amt");
if( b_rcpay_amt == null){
	System.out.println(this.toString+" : b_rcpay_amt is null" );
}else{
	System.out.println(this.toString+" : b_rcpay_amt is "+b_rcpay_amt );
}
String b_pch_cymd1to = req.getParameter("b_pch_cymd1to");
if( b_pch_cymd1to == null){
	System.out.println(this.toString+" : b_pch_cymd1to is null" );
}else{
	System.out.println(this.toString+" : b_pch_cymd1to is "+b_pch_cymd1to );
}
String a_bank_cd = req.getParameter("a_bank_cd");
if( a_bank_cd == null){
	System.out.println(this.toString+" : a_bank_cd is null" );
}else{
	System.out.println(this.toString+" : a_bank_cd is "+a_bank_cd );
}
String a_note_no = req.getParameter("a_note_no");
if( a_note_no == null){
	System.out.println(this.toString+" : a_note_no is null" );
}else{
	System.out.println(this.toString+" : a_note_no is "+a_note_no );
}
String a_note_clsf_cd = req.getParameter("a_note_clsf_cd");
if( a_note_clsf_cd == null){
	System.out.println(this.toString+" : a_note_clsf_cd is null" );
}else{
	System.out.println(this.toString+" : a_note_clsf_cd is "+a_note_clsf_cd );
}
String a_note_amt = req.getParameter("a_note_amt");
if( a_note_amt == null){
	System.out.println(this.toString+" : a_note_amt is null" );
}else{
	System.out.println(this.toString+" : a_note_amt is "+a_note_amt );
}
String a_comp_dt = req.getParameter("a_comp_dt");
if( a_comp_dt == null){
	System.out.println(this.toString+" : a_comp_dt is null" );
}else{
	System.out.println(this.toString+" : a_comp_dt is "+a_comp_dt );
}
String a_mtry_dt = req.getParameter("a_mtry_dt");
if( a_mtry_dt == null){
	System.out.println(this.toString+" : a_mtry_dt is null" );
}else{
	System.out.println(this.toString+" : a_mtry_dt is "+a_mtry_dt );
}
String a_issu_cmpy_clsf_cd = req.getParameter("a_issu_cmpy_clsf_cd");
if( a_issu_cmpy_clsf_cd == null){
	System.out.println(this.toString+" : a_issu_cmpy_clsf_cd is null" );
}else{
	System.out.println(this.toString+" : a_issu_cmpy_clsf_cd is "+a_issu_cmpy_clsf_cd );
}
String a_issu_pers_nm = req.getParameter("a_issu_pers_nm");
if( a_issu_pers_nm == null){
	System.out.println(this.toString+" : a_issu_pers_nm is null" );
}else{
	System.out.println(this.toString+" : a_issu_pers_nm is "+a_issu_pers_nm );
}
String a_rcpm_acct = req.getParameter("a_rcpm_acct");
if( a_rcpm_acct == null){
	System.out.println(this.toString+" : a_rcpm_acct is null" );
}else{
	System.out.println(this.toString+" : a_rcpm_acct is "+a_rcpm_acct );
}
String a_sale_aprv_no = req.getParameter("a_sale_aprv_no");
if( a_sale_aprv_no == null){
	System.out.println(this.toString+" : a_sale_aprv_no is null" );
}else{
	System.out.println(this.toString+" : a_sale_aprv_no is "+a_sale_aprv_no );
}
String a_note_clsf_cd2 = req.getParameter("a_note_clsf_cd2");
if( a_note_clsf_cd2 == null){
	System.out.println(this.toString+" : a_note_clsf_cd2 is null" );
}else{
	System.out.println(this.toString+" : a_note_clsf_cd2 is "+a_note_clsf_cd2 );
}
String use_dept_cd = req.getParameter("use_dept_cd");
if( use_dept_cd == null){
	System.out.println(this.toString+" : use_dept_cd is null" );
}else{
	System.out.println(this.toString+" : use_dept_cd is "+use_dept_cd );
}
String c_budg_cd = req.getParameter("c_budg_cd");
if( c_budg_cd == null){
	System.out.println(this.toString+" : c_budg_cd is null" );
}else{
	System.out.println(this.toString+" : c_budg_cd is "+c_budg_cd );
}
String c_repl_amt = req.getParameter("c_repl_amt");
if( c_repl_amt == null){
	System.out.println(this.toString+" : c_repl_amt is null" );
}else{
	System.out.println(this.toString+" : c_repl_amt is "+c_repl_amt );
}
String c_deps_clsf_cd = req.getParameter("c_deps_clsf_cd");
if( c_deps_clsf_cd == null){
	System.out.println(this.toString+" : c_deps_clsf_cd is null" );
}else{
	System.out.println(this.toString+" : c_deps_clsf_cd is "+c_deps_clsf_cd );
}
String c_deps_dt = req.getParameter("c_deps_dt");
if( c_deps_dt == null){
	System.out.println(this.toString+" : c_deps_dt is null" );
}else{
	System.out.println(this.toString+" : c_deps_dt is "+c_deps_dt );
}
String c_frex_cd = req.getParameter("c_frex_cd");
if( c_frex_cd == null){
	System.out.println(this.toString+" : c_frex_cd is null" );
}else{
	System.out.println(this.toString+" : c_frex_cd is "+c_frex_cd );
}
String c_exrate = req.getParameter("c_exrate");
if( c_exrate == null){
	System.out.println(this.toString+" : c_exrate is null" );
}else{
	System.out.println(this.toString+" : c_exrate is "+c_exrate );
}
String c_frex_amt = req.getParameter("c_frex_amt");
if( c_frex_amt == null){
	System.out.println(this.toString+" : c_frex_amt is null" );
}else{
	System.out.println(this.toString+" : c_frex_amt is "+c_frex_amt );
}
String c_trufnd_slip_clsf = req.getParameter("c_trufnd_slip_clsf");
if( c_trufnd_slip_clsf == null){
	System.out.println(this.toString+" : c_trufnd_slip_clsf is null" );
}else{
	System.out.println(this.toString+" : c_trufnd_slip_clsf is "+c_trufnd_slip_clsf );
}
String c_trufnd_slip_no = req.getParameter("c_trufnd_slip_no");
if( c_trufnd_slip_no == null){
	System.out.println(this.toString+" : c_trufnd_slip_no is null" );
}else{
	System.out.println(this.toString+" : c_trufnd_slip_no is "+c_trufnd_slip_no );
}
String p_budg_cd = req.getParameter("p_budg_cd");
if( p_budg_cd == null){
	System.out.println(this.toString+" : p_budg_cd is null" );
}else{
	System.out.println(this.toString+" : p_budg_cd is "+p_budg_cd );
}
String p_repl_amt = req.getParameter("p_repl_amt");
if( p_repl_amt == null){
	System.out.println(this.toString+" : p_repl_amt is null" );
}else{
	System.out.println(this.toString+" : p_repl_amt is "+p_repl_amt );
}
String p_deps_clsf_cd = req.getParameter("p_deps_clsf_cd");
if( p_deps_clsf_cd == null){
	System.out.println(this.toString+" : p_deps_clsf_cd is null" );
}else{
	System.out.println(this.toString+" : p_deps_clsf_cd is "+p_deps_clsf_cd );
}
String p_deps_dt = req.getParameter("p_deps_dt");
if( p_deps_dt == null){
	System.out.println(this.toString+" : p_deps_dt is null" );
}else{
	System.out.println(this.toString+" : p_deps_dt is "+p_deps_dt );
}
String p_frex_cd = req.getParameter("p_frex_cd");
if( p_frex_cd == null){
	System.out.println(this.toString+" : p_frex_cd is null" );
}else{
	System.out.println(this.toString+" : p_frex_cd is "+p_frex_cd );
}
String p_exrate = req.getParameter("p_exrate");
if( p_exrate == null){
	System.out.println(this.toString+" : p_exrate is null" );
}else{
	System.out.println(this.toString+" : p_exrate is "+p_exrate );
}
String p_frex_amt = req.getParameter("p_frex_amt");
if( p_frex_amt == null){
	System.out.println(this.toString+" : p_frex_amt is null" );
}else{
	System.out.println(this.toString+" : p_frex_amt is "+p_frex_amt );
}
String p_trufnd_slip_clsf = req.getParameter("p_trufnd_slip_clsf");
if( p_trufnd_slip_clsf == null){
	System.out.println(this.toString+" : p_trufnd_slip_clsf is null" );
}else{
	System.out.println(this.toString+" : p_trufnd_slip_clsf is "+p_trufnd_slip_clsf );
}
String p_trufnd_slip_no = req.getParameter("p_trufnd_slip_no");
if( p_trufnd_slip_no == null){
	System.out.println(this.toString+" : p_trufnd_slip_no is null" );
}else{
	System.out.println(this.toString+" : p_trufnd_slip_no is "+p_trufnd_slip_no );
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
String tran_date_seq = req.getParameter("tran_date_seq");
if( tran_date_seq == null){
	System.out.println(this.toString+" : tran_date_seq is null" );
}else{
	System.out.println(this.toString+" : tran_date_seq is "+tran_date_seq );
}
String y_budg_cd = req.getParameter("y_budg_cd");
if( y_budg_cd == null){
	System.out.println(this.toString+" : y_budg_cd is null" );
}else{
	System.out.println(this.toString+" : y_budg_cd is "+y_budg_cd );
}
String y_repl_amt = req.getParameter("y_repl_amt");
if( y_repl_amt == null){
	System.out.println(this.toString+" : y_repl_amt is null" );
}else{
	System.out.println(this.toString+" : y_repl_amt is "+y_repl_amt );
}
String y_deps_clsf_cd = req.getParameter("y_deps_clsf_cd");
if( y_deps_clsf_cd == null){
	System.out.println(this.toString+" : y_deps_clsf_cd is null" );
}else{
	System.out.println(this.toString+" : y_deps_clsf_cd is "+y_deps_clsf_cd );
}
String y_deps_dt = req.getParameter("y_deps_dt");
if( y_deps_dt == null){
	System.out.println(this.toString+" : y_deps_dt is null" );
}else{
	System.out.println(this.toString+" : y_deps_dt is "+y_deps_dt );
}
String y_frex_cd = req.getParameter("y_frex_cd");
if( y_frex_cd == null){
	System.out.println(this.toString+" : y_frex_cd is null" );
}else{
	System.out.println(this.toString+" : y_frex_cd is "+y_frex_cd );
}
String y_exrate = req.getParameter("y_exrate");
if( y_exrate == null){
	System.out.println(this.toString+" : y_exrate is null" );
}else{
	System.out.println(this.toString+" : y_exrate is "+y_exrate );
}
String y_frex_amt = req.getParameter("y_frex_amt");
if( y_frex_amt == null){
	System.out.println(this.toString+" : y_frex_amt is null" );
}else{
	System.out.println(this.toString+" : y_frex_amt is "+y_frex_amt );
}
String y_trufnd_slip_clsf = req.getParameter("y_trufnd_slip_clsf");
if( y_trufnd_slip_clsf == null){
	System.out.println(this.toString+" : y_trufnd_slip_clsf is null" );
}else{
	System.out.println(this.toString+" : y_trufnd_slip_clsf is "+y_trufnd_slip_clsf );
}
String y_trufnd_slip_no = req.getParameter("y_trufnd_slip_no");
if( y_trufnd_slip_no == null){
	System.out.println(this.toString+" : y_trufnd_slip_no is null" );
}else{
	System.out.println(this.toString+" : y_trufnd_slip_no is "+y_trufnd_slip_no );
}
String jobamt = req.getParameter("jobamt");
if( jobamt == null){
	System.out.println(this.toString+" : jobamt is null" );
}else{
	System.out.println(this.toString+" : jobamt is "+jobamt );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String stat_dt = Util.checkString(req.getParameter("stat_dt"));
String dlco_clsf_cd = Util.checkString(req.getParameter("dlco_clsf_cd"));
String dlco_cd = Util.checkString(req.getParameter("dlco_cd"));
String pch_compnm = Util.checkString(req.getParameter("pch_compnm"));
String rmks1 = Util.checkString(req.getParameter("rmks1"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
String b_bank_cd = Util.checkString(req.getParameter("b_bank_cd"));
String b_note_no = Util.checkString(req.getParameter("b_note_no"));
String b_note_seq = Util.checkString(req.getParameter("b_note_seq"));
String b_rcpay_amt = Util.checkString(req.getParameter("b_rcpay_amt"));
String b_pch_cymd1to = Util.checkString(req.getParameter("b_pch_cymd1to"));
String a_bank_cd = Util.checkString(req.getParameter("a_bank_cd"));
String a_note_no = Util.checkString(req.getParameter("a_note_no"));
String a_note_clsf_cd = Util.checkString(req.getParameter("a_note_clsf_cd"));
String a_note_amt = Util.checkString(req.getParameter("a_note_amt"));
String a_comp_dt = Util.checkString(req.getParameter("a_comp_dt"));
String a_mtry_dt = Util.checkString(req.getParameter("a_mtry_dt"));
String a_issu_cmpy_clsf_cd = Util.checkString(req.getParameter("a_issu_cmpy_clsf_cd"));
String a_issu_pers_nm = Util.checkString(req.getParameter("a_issu_pers_nm"));
String a_rcpm_acct = Util.checkString(req.getParameter("a_rcpm_acct"));
String a_sale_aprv_no = Util.checkString(req.getParameter("a_sale_aprv_no"));
String a_note_clsf_cd2 = Util.checkString(req.getParameter("a_note_clsf_cd2"));
String use_dept_cd = Util.checkString(req.getParameter("use_dept_cd"));
String c_budg_cd = Util.checkString(req.getParameter("c_budg_cd"));
String c_repl_amt = Util.checkString(req.getParameter("c_repl_amt"));
String c_deps_clsf_cd = Util.checkString(req.getParameter("c_deps_clsf_cd"));
String c_deps_dt = Util.checkString(req.getParameter("c_deps_dt"));
String c_frex_cd = Util.checkString(req.getParameter("c_frex_cd"));
String c_exrate = Util.checkString(req.getParameter("c_exrate"));
String c_frex_amt = Util.checkString(req.getParameter("c_frex_amt"));
String c_trufnd_slip_clsf = Util.checkString(req.getParameter("c_trufnd_slip_clsf"));
String c_trufnd_slip_no = Util.checkString(req.getParameter("c_trufnd_slip_no"));
String p_budg_cd = Util.checkString(req.getParameter("p_budg_cd"));
String p_repl_amt = Util.checkString(req.getParameter("p_repl_amt"));
String p_deps_clsf_cd = Util.checkString(req.getParameter("p_deps_clsf_cd"));
String p_deps_dt = Util.checkString(req.getParameter("p_deps_dt"));
String p_frex_cd = Util.checkString(req.getParameter("p_frex_cd"));
String p_exrate = Util.checkString(req.getParameter("p_exrate"));
String p_frex_amt = Util.checkString(req.getParameter("p_frex_amt"));
String p_trufnd_slip_clsf = Util.checkString(req.getParameter("p_trufnd_slip_clsf"));
String p_trufnd_slip_no = Util.checkString(req.getParameter("p_trufnd_slip_no"));
String biz_reg_no = Util.checkString(req.getParameter("biz_reg_no"));
String bank_id = Util.checkString(req.getParameter("bank_id"));
String acct_num = Util.checkString(req.getParameter("acct_num"));
String tran_date_seq = Util.checkString(req.getParameter("tran_date_seq"));
String y_budg_cd = Util.checkString(req.getParameter("y_budg_cd"));
String y_repl_amt = Util.checkString(req.getParameter("y_repl_amt"));
String y_deps_clsf_cd = Util.checkString(req.getParameter("y_deps_clsf_cd"));
String y_deps_dt = Util.checkString(req.getParameter("y_deps_dt"));
String y_frex_cd = Util.checkString(req.getParameter("y_frex_cd"));
String y_exrate = Util.checkString(req.getParameter("y_exrate"));
String y_frex_amt = Util.checkString(req.getParameter("y_frex_amt"));
String y_trufnd_slip_clsf = Util.checkString(req.getParameter("y_trufnd_slip_clsf"));
String y_trufnd_slip_no = Util.checkString(req.getParameter("y_trufnd_slip_no"));
String jobamt = Util.checkString(req.getParameter("jobamt"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String stat_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("stat_dt")));
String dlco_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_clsf_cd")));
String dlco_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_cd")));
String pch_compnm = Util.Uni2Ksc(Util.checkString(req.getParameter("pch_compnm")));
String rmks1 = Util.Uni2Ksc(Util.checkString(req.getParameter("rmks1")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String incmg_pers_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipadd")));
String b_bank_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("b_bank_cd")));
String b_note_no = Util.Uni2Ksc(Util.checkString(req.getParameter("b_note_no")));
String b_note_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("b_note_seq")));
String b_rcpay_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("b_rcpay_amt")));
String b_pch_cymd1to = Util.Uni2Ksc(Util.checkString(req.getParameter("b_pch_cymd1to")));
String a_bank_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("a_bank_cd")));
String a_note_no = Util.Uni2Ksc(Util.checkString(req.getParameter("a_note_no")));
String a_note_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("a_note_clsf_cd")));
String a_note_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("a_note_amt")));
String a_comp_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("a_comp_dt")));
String a_mtry_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("a_mtry_dt")));
String a_issu_cmpy_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("a_issu_cmpy_clsf_cd")));
String a_issu_pers_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("a_issu_pers_nm")));
String a_rcpm_acct = Util.Uni2Ksc(Util.checkString(req.getParameter("a_rcpm_acct")));
String a_sale_aprv_no = Util.Uni2Ksc(Util.checkString(req.getParameter("a_sale_aprv_no")));
String a_note_clsf_cd2 = Util.Uni2Ksc(Util.checkString(req.getParameter("a_note_clsf_cd2")));
String use_dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("use_dept_cd")));
String c_budg_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("c_budg_cd")));
String c_repl_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("c_repl_amt")));
String c_deps_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("c_deps_clsf_cd")));
String c_deps_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("c_deps_dt")));
String c_frex_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("c_frex_cd")));
String c_exrate = Util.Uni2Ksc(Util.checkString(req.getParameter("c_exrate")));
String c_frex_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("c_frex_amt")));
String c_trufnd_slip_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("c_trufnd_slip_clsf")));
String c_trufnd_slip_no = Util.Uni2Ksc(Util.checkString(req.getParameter("c_trufnd_slip_no")));
String p_budg_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("p_budg_cd")));
String p_repl_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("p_repl_amt")));
String p_deps_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("p_deps_clsf_cd")));
String p_deps_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("p_deps_dt")));
String p_frex_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("p_frex_cd")));
String p_exrate = Util.Uni2Ksc(Util.checkString(req.getParameter("p_exrate")));
String p_frex_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("p_frex_amt")));
String p_trufnd_slip_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("p_trufnd_slip_clsf")));
String p_trufnd_slip_no = Util.Uni2Ksc(Util.checkString(req.getParameter("p_trufnd_slip_no")));
String biz_reg_no = Util.Uni2Ksc(Util.checkString(req.getParameter("biz_reg_no")));
String bank_id = Util.Uni2Ksc(Util.checkString(req.getParameter("bank_id")));
String acct_num = Util.Uni2Ksc(Util.checkString(req.getParameter("acct_num")));
String tran_date_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("tran_date_seq")));
String y_budg_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("y_budg_cd")));
String y_repl_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("y_repl_amt")));
String y_deps_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("y_deps_clsf_cd")));
String y_deps_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("y_deps_dt")));
String y_frex_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("y_frex_cd")));
String y_exrate = Util.Uni2Ksc(Util.checkString(req.getParameter("y_exrate")));
String y_frex_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("y_frex_amt")));
String y_trufnd_slip_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("y_trufnd_slip_clsf")));
String y_trufnd_slip_no = Util.Uni2Ksc(Util.checkString(req.getParameter("y_trufnd_slip_no")));
String jobamt = Util.Uni2Ksc(Util.checkString(req.getParameter("jobamt")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setStat_dt(stat_dt);
dm.setDlco_clsf_cd(dlco_clsf_cd);
dm.setDlco_cd(dlco_cd);
dm.setPch_compnm(pch_compnm);
dm.setRmks1(rmks1);
dm.setIncmg_pers(incmg_pers);
dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
dm.setB_bank_cd(b_bank_cd);
dm.setB_note_no(b_note_no);
dm.setB_note_seq(b_note_seq);
dm.setB_rcpay_amt(b_rcpay_amt);
dm.setB_pch_cymd1to(b_pch_cymd1to);
dm.setA_bank_cd(a_bank_cd);
dm.setA_note_no(a_note_no);
dm.setA_note_clsf_cd(a_note_clsf_cd);
dm.setA_note_amt(a_note_amt);
dm.setA_comp_dt(a_comp_dt);
dm.setA_mtry_dt(a_mtry_dt);
dm.setA_issu_cmpy_clsf_cd(a_issu_cmpy_clsf_cd);
dm.setA_issu_pers_nm(a_issu_pers_nm);
dm.setA_rcpm_acct(a_rcpm_acct);
dm.setA_sale_aprv_no(a_sale_aprv_no);
dm.setA_note_clsf_cd2(a_note_clsf_cd2);
dm.setUse_dept_cd(use_dept_cd);
dm.setC_budg_cd(c_budg_cd);
dm.setC_repl_amt(c_repl_amt);
dm.setC_deps_clsf_cd(c_deps_clsf_cd);
dm.setC_deps_dt(c_deps_dt);
dm.setC_frex_cd(c_frex_cd);
dm.setC_exrate(c_exrate);
dm.setC_frex_amt(c_frex_amt);
dm.setC_trufnd_slip_clsf(c_trufnd_slip_clsf);
dm.setC_trufnd_slip_no(c_trufnd_slip_no);
dm.setP_budg_cd(p_budg_cd);
dm.setP_repl_amt(p_repl_amt);
dm.setP_deps_clsf_cd(p_deps_clsf_cd);
dm.setP_deps_dt(p_deps_dt);
dm.setP_frex_cd(p_frex_cd);
dm.setP_exrate(p_exrate);
dm.setP_frex_amt(p_frex_amt);
dm.setP_trufnd_slip_clsf(p_trufnd_slip_clsf);
dm.setP_trufnd_slip_no(p_trufnd_slip_no);
dm.setBiz_reg_no(biz_reg_no);
dm.setBank_id(bank_id);
dm.setAcct_num(acct_num);
dm.setTran_date_seq(tran_date_seq);
dm.setY_budg_cd(y_budg_cd);
dm.setY_repl_amt(y_repl_amt);
dm.setY_deps_clsf_cd(y_deps_clsf_cd);
dm.setY_deps_dt(y_deps_dt);
dm.setY_frex_cd(y_frex_cd);
dm.setY_exrate(y_exrate);
dm.setY_frex_amt(y_frex_amt);
dm.setY_trufnd_slip_clsf(y_trufnd_slip_clsf);
dm.setY_trufnd_slip_no(y_trufnd_slip_no);
dm.setJobamt(jobamt);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Apr 06 09:58:47 KST 2018 */
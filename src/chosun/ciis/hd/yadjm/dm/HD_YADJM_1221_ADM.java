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


package chosun.ciis.hd.yadjm.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.yadjm.ds.*;
import chosun.ciis.hd.yadjm.rec.*;

/**
 * 
 */


public class HD_YADJM_1221_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String adjm_rvrs_yy;
	public String emp_no;
	public String hous_hire_rcpm_won_li_amt;
	public String ltrm_hous_mogg_loan_amt_int;
	public String wedd_tms;
	public String wedd_fee;
	public String movm_tms;
	public String movm_fee;
	public String fnrl_tms;
	public String fnrl_fee;
	public String prsn_pens;
	public String pens_savg;
	public String invsm_cmpd_invsm_amt;
	public String invsm_cmpd_invsm_amt_6;
	public String emp_stok_ownr_out_pens;
	public String lvcmpy_pens_incm_dduc;
	public String plac_cmpy_trad_authr_inc;
	public String ltrm_stok_savg_incm_dduc;
	public String hous_loan_amt_int;
	public String hous_loan_amt_int_1;
	public String tax_paymt_cmpd_dduc;
	public String dona_polt_fund;
	public String forn_duty_plac;
	public String forn_duty_dty;
	public String forn_duty_prd_frdt;
	public String forn_duty_prd_todt;
	public String forn_duty_tot_saly;
	public String tax_paymt_offi_nm;
	public String tax_paymt_amt_frex;
	public String tax_paymt_amt_won;
	public String forn_duty_clsf;
	public String txn_obj_addm_amt;
	public String ltrm_stok_savg_incm_dduc1;
	public String ltrm_stok_savg_incm_dduc2;
	public String ltrm_stok_savg_incm_dduc3;
	public String hous_subc_savg;
	public String labr_hous_savg;
	public String ltrm_hous_savg;
	public String incmg_pers_ipadd;
	public String incmg_pers;

	public HD_YADJM_1221_ADM(){}
	public HD_YADJM_1221_ADM(String cmpy_cd, String adjm_rvrs_yy, String emp_no, String hous_hire_rcpm_won_li_amt, String ltrm_hous_mogg_loan_amt_int, String wedd_tms, String wedd_fee, String movm_tms, String movm_fee, String fnrl_tms, String fnrl_fee, String prsn_pens, String pens_savg, String invsm_cmpd_invsm_amt, String invsm_cmpd_invsm_amt_6, String emp_stok_ownr_out_pens, String lvcmpy_pens_incm_dduc, String plac_cmpy_trad_authr_inc, String ltrm_stok_savg_incm_dduc, String hous_loan_amt_int, String hous_loan_amt_int_1, String tax_paymt_cmpd_dduc, String dona_polt_fund, String forn_duty_plac, String forn_duty_dty, String forn_duty_prd_frdt, String forn_duty_prd_todt, String forn_duty_tot_saly, String tax_paymt_offi_nm, String tax_paymt_amt_frex, String tax_paymt_amt_won, String forn_duty_clsf, String txn_obj_addm_amt, String ltrm_stok_savg_incm_dduc1, String ltrm_stok_savg_incm_dduc2, String ltrm_stok_savg_incm_dduc3, String hous_subc_savg, String labr_hous_savg, String ltrm_hous_savg, String incmg_pers_ipadd, String incmg_pers){
		this.cmpy_cd = cmpy_cd;
		this.adjm_rvrs_yy = adjm_rvrs_yy;
		this.emp_no = emp_no;
		this.hous_hire_rcpm_won_li_amt = hous_hire_rcpm_won_li_amt;
		this.ltrm_hous_mogg_loan_amt_int = ltrm_hous_mogg_loan_amt_int;
		this.wedd_tms = wedd_tms;
		this.wedd_fee = wedd_fee;
		this.movm_tms = movm_tms;
		this.movm_fee = movm_fee;
		this.fnrl_tms = fnrl_tms;
		this.fnrl_fee = fnrl_fee;
		this.prsn_pens = prsn_pens;
		this.pens_savg = pens_savg;
		this.invsm_cmpd_invsm_amt = invsm_cmpd_invsm_amt;
		this.invsm_cmpd_invsm_amt_6 = invsm_cmpd_invsm_amt_6;
		this.emp_stok_ownr_out_pens = emp_stok_ownr_out_pens;
		this.lvcmpy_pens_incm_dduc = lvcmpy_pens_incm_dduc;
		this.plac_cmpy_trad_authr_inc = plac_cmpy_trad_authr_inc;
		this.ltrm_stok_savg_incm_dduc = ltrm_stok_savg_incm_dduc;
		this.hous_loan_amt_int = hous_loan_amt_int;
		this.hous_loan_amt_int_1 = hous_loan_amt_int_1;
		this.tax_paymt_cmpd_dduc = tax_paymt_cmpd_dduc;
		this.dona_polt_fund = dona_polt_fund;
		this.forn_duty_plac = forn_duty_plac;
		this.forn_duty_dty = forn_duty_dty;
		this.forn_duty_prd_frdt = forn_duty_prd_frdt;
		this.forn_duty_prd_todt = forn_duty_prd_todt;
		this.forn_duty_tot_saly = forn_duty_tot_saly;
		this.tax_paymt_offi_nm = tax_paymt_offi_nm;
		this.tax_paymt_amt_frex = tax_paymt_amt_frex;
		this.tax_paymt_amt_won = tax_paymt_amt_won;
		this.forn_duty_clsf = forn_duty_clsf;
		this.txn_obj_addm_amt = txn_obj_addm_amt;
		this.ltrm_stok_savg_incm_dduc1 = ltrm_stok_savg_incm_dduc1;
		this.ltrm_stok_savg_incm_dduc2 = ltrm_stok_savg_incm_dduc2;
		this.ltrm_stok_savg_incm_dduc3 = ltrm_stok_savg_incm_dduc3;
		this.hous_subc_savg = hous_subc_savg;
		this.labr_hous_savg = labr_hous_savg;
		this.ltrm_hous_savg = ltrm_hous_savg;
		this.incmg_pers_ipadd = incmg_pers_ipadd;
		this.incmg_pers = incmg_pers;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setAdjm_rvrs_yy(String adjm_rvrs_yy){
		this.adjm_rvrs_yy = adjm_rvrs_yy;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setHous_hire_rcpm_won_li_amt(String hous_hire_rcpm_won_li_amt){
		this.hous_hire_rcpm_won_li_amt = hous_hire_rcpm_won_li_amt;
	}

	public void setLtrm_hous_mogg_loan_amt_int(String ltrm_hous_mogg_loan_amt_int){
		this.ltrm_hous_mogg_loan_amt_int = ltrm_hous_mogg_loan_amt_int;
	}

	public void setWedd_tms(String wedd_tms){
		this.wedd_tms = wedd_tms;
	}

	public void setWedd_fee(String wedd_fee){
		this.wedd_fee = wedd_fee;
	}

	public void setMovm_tms(String movm_tms){
		this.movm_tms = movm_tms;
	}

	public void setMovm_fee(String movm_fee){
		this.movm_fee = movm_fee;
	}

	public void setFnrl_tms(String fnrl_tms){
		this.fnrl_tms = fnrl_tms;
	}

	public void setFnrl_fee(String fnrl_fee){
		this.fnrl_fee = fnrl_fee;
	}

	public void setPrsn_pens(String prsn_pens){
		this.prsn_pens = prsn_pens;
	}

	public void setPens_savg(String pens_savg){
		this.pens_savg = pens_savg;
	}

	public void setInvsm_cmpd_invsm_amt(String invsm_cmpd_invsm_amt){
		this.invsm_cmpd_invsm_amt = invsm_cmpd_invsm_amt;
	}

	public void setInvsm_cmpd_invsm_amt_6(String invsm_cmpd_invsm_amt_6){
		this.invsm_cmpd_invsm_amt_6 = invsm_cmpd_invsm_amt_6;
	}

	public void setEmp_stok_ownr_out_pens(String emp_stok_ownr_out_pens){
		this.emp_stok_ownr_out_pens = emp_stok_ownr_out_pens;
	}

	public void setLvcmpy_pens_incm_dduc(String lvcmpy_pens_incm_dduc){
		this.lvcmpy_pens_incm_dduc = lvcmpy_pens_incm_dduc;
	}

	public void setPlac_cmpy_trad_authr_inc(String plac_cmpy_trad_authr_inc){
		this.plac_cmpy_trad_authr_inc = plac_cmpy_trad_authr_inc;
	}

	public void setLtrm_stok_savg_incm_dduc(String ltrm_stok_savg_incm_dduc){
		this.ltrm_stok_savg_incm_dduc = ltrm_stok_savg_incm_dduc;
	}

	public void setHous_loan_amt_int(String hous_loan_amt_int){
		this.hous_loan_amt_int = hous_loan_amt_int;
	}

	public void setHous_loan_amt_int_1(String hous_loan_amt_int_1){
		this.hous_loan_amt_int_1 = hous_loan_amt_int_1;
	}

	public void setTax_paymt_cmpd_dduc(String tax_paymt_cmpd_dduc){
		this.tax_paymt_cmpd_dduc = tax_paymt_cmpd_dduc;
	}

	public void setDona_polt_fund(String dona_polt_fund){
		this.dona_polt_fund = dona_polt_fund;
	}

	public void setForn_duty_plac(String forn_duty_plac){
		this.forn_duty_plac = forn_duty_plac;
	}

	public void setForn_duty_dty(String forn_duty_dty){
		this.forn_duty_dty = forn_duty_dty;
	}

	public void setForn_duty_prd_frdt(String forn_duty_prd_frdt){
		this.forn_duty_prd_frdt = forn_duty_prd_frdt;
	}

	public void setForn_duty_prd_todt(String forn_duty_prd_todt){
		this.forn_duty_prd_todt = forn_duty_prd_todt;
	}

	public void setForn_duty_tot_saly(String forn_duty_tot_saly){
		this.forn_duty_tot_saly = forn_duty_tot_saly;
	}

	public void setTax_paymt_offi_nm(String tax_paymt_offi_nm){
		this.tax_paymt_offi_nm = tax_paymt_offi_nm;
	}

	public void setTax_paymt_amt_frex(String tax_paymt_amt_frex){
		this.tax_paymt_amt_frex = tax_paymt_amt_frex;
	}

	public void setTax_paymt_amt_won(String tax_paymt_amt_won){
		this.tax_paymt_amt_won = tax_paymt_amt_won;
	}

	public void setForn_duty_clsf(String forn_duty_clsf){
		this.forn_duty_clsf = forn_duty_clsf;
	}

	public void setTxn_obj_addm_amt(String txn_obj_addm_amt){
		this.txn_obj_addm_amt = txn_obj_addm_amt;
	}

	public void setLtrm_stok_savg_incm_dduc1(String ltrm_stok_savg_incm_dduc1){
		this.ltrm_stok_savg_incm_dduc1 = ltrm_stok_savg_incm_dduc1;
	}

	public void setLtrm_stok_savg_incm_dduc2(String ltrm_stok_savg_incm_dduc2){
		this.ltrm_stok_savg_incm_dduc2 = ltrm_stok_savg_incm_dduc2;
	}

	public void setLtrm_stok_savg_incm_dduc3(String ltrm_stok_savg_incm_dduc3){
		this.ltrm_stok_savg_incm_dduc3 = ltrm_stok_savg_incm_dduc3;
	}

	public void setHous_subc_savg(String hous_subc_savg){
		this.hous_subc_savg = hous_subc_savg;
	}

	public void setLabr_hous_savg(String labr_hous_savg){
		this.labr_hous_savg = labr_hous_savg;
	}

	public void setLtrm_hous_savg(String ltrm_hous_savg){
		this.ltrm_hous_savg = ltrm_hous_savg;
	}

	public void setIncmg_pers_ipadd(String incmg_pers_ipadd){
		this.incmg_pers_ipadd = incmg_pers_ipadd;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getAdjm_rvrs_yy(){
		return this.adjm_rvrs_yy;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getHous_hire_rcpm_won_li_amt(){
		return this.hous_hire_rcpm_won_li_amt;
	}

	public String getLtrm_hous_mogg_loan_amt_int(){
		return this.ltrm_hous_mogg_loan_amt_int;
	}

	public String getWedd_tms(){
		return this.wedd_tms;
	}

	public String getWedd_fee(){
		return this.wedd_fee;
	}

	public String getMovm_tms(){
		return this.movm_tms;
	}

	public String getMovm_fee(){
		return this.movm_fee;
	}

	public String getFnrl_tms(){
		return this.fnrl_tms;
	}

	public String getFnrl_fee(){
		return this.fnrl_fee;
	}

	public String getPrsn_pens(){
		return this.prsn_pens;
	}

	public String getPens_savg(){
		return this.pens_savg;
	}

	public String getInvsm_cmpd_invsm_amt(){
		return this.invsm_cmpd_invsm_amt;
	}

	public String getInvsm_cmpd_invsm_amt_6(){
		return this.invsm_cmpd_invsm_amt_6;
	}

	public String getEmp_stok_ownr_out_pens(){
		return this.emp_stok_ownr_out_pens;
	}

	public String getLvcmpy_pens_incm_dduc(){
		return this.lvcmpy_pens_incm_dduc;
	}

	public String getPlac_cmpy_trad_authr_inc(){
		return this.plac_cmpy_trad_authr_inc;
	}

	public String getLtrm_stok_savg_incm_dduc(){
		return this.ltrm_stok_savg_incm_dduc;
	}

	public String getHous_loan_amt_int(){
		return this.hous_loan_amt_int;
	}

	public String getHous_loan_amt_int_1(){
		return this.hous_loan_amt_int_1;
	}

	public String getTax_paymt_cmpd_dduc(){
		return this.tax_paymt_cmpd_dduc;
	}

	public String getDona_polt_fund(){
		return this.dona_polt_fund;
	}

	public String getForn_duty_plac(){
		return this.forn_duty_plac;
	}

	public String getForn_duty_dty(){
		return this.forn_duty_dty;
	}

	public String getForn_duty_prd_frdt(){
		return this.forn_duty_prd_frdt;
	}

	public String getForn_duty_prd_todt(){
		return this.forn_duty_prd_todt;
	}

	public String getForn_duty_tot_saly(){
		return this.forn_duty_tot_saly;
	}

	public String getTax_paymt_offi_nm(){
		return this.tax_paymt_offi_nm;
	}

	public String getTax_paymt_amt_frex(){
		return this.tax_paymt_amt_frex;
	}

	public String getTax_paymt_amt_won(){
		return this.tax_paymt_amt_won;
	}

	public String getForn_duty_clsf(){
		return this.forn_duty_clsf;
	}

	public String getTxn_obj_addm_amt(){
		return this.txn_obj_addm_amt;
	}

	public String getLtrm_stok_savg_incm_dduc1(){
		return this.ltrm_stok_savg_incm_dduc1;
	}

	public String getLtrm_stok_savg_incm_dduc2(){
		return this.ltrm_stok_savg_incm_dduc2;
	}

	public String getLtrm_stok_savg_incm_dduc3(){
		return this.ltrm_stok_savg_incm_dduc3;
	}

	public String getHous_subc_savg(){
		return this.hous_subc_savg;
	}

	public String getLabr_hous_savg(){
		return this.labr_hous_savg;
	}

	public String getLtrm_hous_savg(){
		return this.ltrm_hous_savg;
	}

	public String getIncmg_pers_ipadd(){
		return this.incmg_pers_ipadd;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_YADJM_1221_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_YADJM_1221_ADM dm = (HD_YADJM_1221_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.adjm_rvrs_yy);
		cstmt.setString(5, dm.emp_no);
		cstmt.setString(6, dm.hous_hire_rcpm_won_li_amt);
		cstmt.setString(7, dm.ltrm_hous_mogg_loan_amt_int);
		cstmt.setString(8, dm.wedd_tms);
		cstmt.setString(9, dm.wedd_fee);
		cstmt.setString(10, dm.movm_tms);
		cstmt.setString(11, dm.movm_fee);
		cstmt.setString(12, dm.fnrl_tms);
		cstmt.setString(13, dm.fnrl_fee);
		cstmt.setString(14, dm.prsn_pens);
		cstmt.setString(15, dm.pens_savg);
		cstmt.setString(16, dm.invsm_cmpd_invsm_amt);
		cstmt.setString(17, dm.invsm_cmpd_invsm_amt_6);
		cstmt.setString(18, dm.emp_stok_ownr_out_pens);
		cstmt.setString(19, dm.lvcmpy_pens_incm_dduc);
		cstmt.setString(20, dm.plac_cmpy_trad_authr_inc);
		cstmt.setString(21, dm.ltrm_stok_savg_incm_dduc);
		cstmt.setString(22, dm.hous_loan_amt_int);
		cstmt.setString(23, dm.hous_loan_amt_int_1);
		cstmt.setString(24, dm.tax_paymt_cmpd_dduc);
		cstmt.setString(25, dm.dona_polt_fund);
		cstmt.setString(26, dm.forn_duty_plac);
		cstmt.setString(27, dm.forn_duty_dty);
		cstmt.setString(28, dm.forn_duty_prd_frdt);
		cstmt.setString(29, dm.forn_duty_prd_todt);
		cstmt.setString(30, dm.forn_duty_tot_saly);
		cstmt.setString(31, dm.tax_paymt_offi_nm);
		cstmt.setString(32, dm.tax_paymt_amt_frex);
		cstmt.setString(33, dm.tax_paymt_amt_won);
		cstmt.setString(34, dm.forn_duty_clsf);
		cstmt.setString(35, dm.txn_obj_addm_amt);
		cstmt.setString(36, dm.ltrm_stok_savg_incm_dduc1);
		cstmt.setString(37, dm.ltrm_stok_savg_incm_dduc2);
		cstmt.setString(38, dm.ltrm_stok_savg_incm_dduc3);
		cstmt.setString(39, dm.hous_subc_savg);
		cstmt.setString(40, dm.labr_hous_savg);
		cstmt.setString(41, dm.ltrm_hous_savg);
		cstmt.setString(42, dm.incmg_pers_ipadd);
		cstmt.setString(43, dm.incmg_pers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.yadjm.ds.HD_YADJM_1221_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("adjm_rvrs_yy = [" + getAdjm_rvrs_yy() + "]");
		System.out.println("emp_no = [" + getEmp_no() + "]");
		System.out.println("hous_hire_rcpm_won_li_amt = [" + getHous_hire_rcpm_won_li_amt() + "]");
		System.out.println("ltrm_hous_mogg_loan_amt_int = [" + getLtrm_hous_mogg_loan_amt_int() + "]");
		System.out.println("wedd_tms = [" + getWedd_tms() + "]");
		System.out.println("wedd_fee = [" + getWedd_fee() + "]");
		System.out.println("movm_tms = [" + getMovm_tms() + "]");
		System.out.println("movm_fee = [" + getMovm_fee() + "]");
		System.out.println("fnrl_tms = [" + getFnrl_tms() + "]");
		System.out.println("fnrl_fee = [" + getFnrl_fee() + "]");
		System.out.println("prsn_pens = [" + getPrsn_pens() + "]");
		System.out.println("pens_savg = [" + getPens_savg() + "]");
		System.out.println("invsm_cmpd_invsm_amt = [" + getInvsm_cmpd_invsm_amt() + "]");
		System.out.println("invsm_cmpd_invsm_amt_6 = [" + getInvsm_cmpd_invsm_amt_6() + "]");
		System.out.println("emp_stok_ownr_out_pens = [" + getEmp_stok_ownr_out_pens() + "]");
		System.out.println("lvcmpy_pens_incm_dduc = [" + getLvcmpy_pens_incm_dduc() + "]");
		System.out.println("plac_cmpy_trad_authr_inc = [" + getPlac_cmpy_trad_authr_inc() + "]");
		System.out.println("ltrm_stok_savg_incm_dduc = [" + getLtrm_stok_savg_incm_dduc() + "]");
		System.out.println("hous_loan_amt_int = [" + getHous_loan_amt_int() + "]");
		System.out.println("hous_loan_amt_int_1 = [" + getHous_loan_amt_int_1() + "]");
		System.out.println("tax_paymt_cmpd_dduc = [" + getTax_paymt_cmpd_dduc() + "]");
		System.out.println("dona_polt_fund = [" + getDona_polt_fund() + "]");
		System.out.println("forn_duty_plac = [" + getForn_duty_plac() + "]");
		System.out.println("forn_duty_dty = [" + getForn_duty_dty() + "]");
		System.out.println("forn_duty_prd_frdt = [" + getForn_duty_prd_frdt() + "]");
		System.out.println("forn_duty_prd_todt = [" + getForn_duty_prd_todt() + "]");
		System.out.println("forn_duty_tot_saly = [" + getForn_duty_tot_saly() + "]");
		System.out.println("tax_paymt_offi_nm = [" + getTax_paymt_offi_nm() + "]");
		System.out.println("tax_paymt_amt_frex = [" + getTax_paymt_amt_frex() + "]");
		System.out.println("tax_paymt_amt_won = [" + getTax_paymt_amt_won() + "]");
		System.out.println("forn_duty_clsf = [" + getForn_duty_clsf() + "]");
		System.out.println("txn_obj_addm_amt = [" + getTxn_obj_addm_amt() + "]");
		System.out.println("ltrm_stok_savg_incm_dduc1 = [" + getLtrm_stok_savg_incm_dduc1() + "]");
		System.out.println("ltrm_stok_savg_incm_dduc2 = [" + getLtrm_stok_savg_incm_dduc2() + "]");
		System.out.println("ltrm_stok_savg_incm_dduc3 = [" + getLtrm_stok_savg_incm_dduc3() + "]");
		System.out.println("hous_subc_savg = [" + getHous_subc_savg() + "]");
		System.out.println("labr_hous_savg = [" + getLabr_hous_savg() + "]");
		System.out.println("ltrm_hous_savg = [" + getLtrm_hous_savg() + "]");
		System.out.println("incmg_pers_ipadd = [" + getIncmg_pers_ipadd() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
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
String adjm_rvrs_yy = req.getParameter("adjm_rvrs_yy");
if( adjm_rvrs_yy == null){
	System.out.println(this.toString+" : adjm_rvrs_yy is null" );
}else{
	System.out.println(this.toString+" : adjm_rvrs_yy is "+adjm_rvrs_yy );
}
String emp_no = req.getParameter("emp_no");
if( emp_no == null){
	System.out.println(this.toString+" : emp_no is null" );
}else{
	System.out.println(this.toString+" : emp_no is "+emp_no );
}
String hous_hire_rcpm_won_li_amt = req.getParameter("hous_hire_rcpm_won_li_amt");
if( hous_hire_rcpm_won_li_amt == null){
	System.out.println(this.toString+" : hous_hire_rcpm_won_li_amt is null" );
}else{
	System.out.println(this.toString+" : hous_hire_rcpm_won_li_amt is "+hous_hire_rcpm_won_li_amt );
}
String ltrm_hous_mogg_loan_amt_int = req.getParameter("ltrm_hous_mogg_loan_amt_int");
if( ltrm_hous_mogg_loan_amt_int == null){
	System.out.println(this.toString+" : ltrm_hous_mogg_loan_amt_int is null" );
}else{
	System.out.println(this.toString+" : ltrm_hous_mogg_loan_amt_int is "+ltrm_hous_mogg_loan_amt_int );
}
String wedd_tms = req.getParameter("wedd_tms");
if( wedd_tms == null){
	System.out.println(this.toString+" : wedd_tms is null" );
}else{
	System.out.println(this.toString+" : wedd_tms is "+wedd_tms );
}
String wedd_fee = req.getParameter("wedd_fee");
if( wedd_fee == null){
	System.out.println(this.toString+" : wedd_fee is null" );
}else{
	System.out.println(this.toString+" : wedd_fee is "+wedd_fee );
}
String movm_tms = req.getParameter("movm_tms");
if( movm_tms == null){
	System.out.println(this.toString+" : movm_tms is null" );
}else{
	System.out.println(this.toString+" : movm_tms is "+movm_tms );
}
String movm_fee = req.getParameter("movm_fee");
if( movm_fee == null){
	System.out.println(this.toString+" : movm_fee is null" );
}else{
	System.out.println(this.toString+" : movm_fee is "+movm_fee );
}
String fnrl_tms = req.getParameter("fnrl_tms");
if( fnrl_tms == null){
	System.out.println(this.toString+" : fnrl_tms is null" );
}else{
	System.out.println(this.toString+" : fnrl_tms is "+fnrl_tms );
}
String fnrl_fee = req.getParameter("fnrl_fee");
if( fnrl_fee == null){
	System.out.println(this.toString+" : fnrl_fee is null" );
}else{
	System.out.println(this.toString+" : fnrl_fee is "+fnrl_fee );
}
String prsn_pens = req.getParameter("prsn_pens");
if( prsn_pens == null){
	System.out.println(this.toString+" : prsn_pens is null" );
}else{
	System.out.println(this.toString+" : prsn_pens is "+prsn_pens );
}
String pens_savg = req.getParameter("pens_savg");
if( pens_savg == null){
	System.out.println(this.toString+" : pens_savg is null" );
}else{
	System.out.println(this.toString+" : pens_savg is "+pens_savg );
}
String invsm_cmpd_invsm_amt = req.getParameter("invsm_cmpd_invsm_amt");
if( invsm_cmpd_invsm_amt == null){
	System.out.println(this.toString+" : invsm_cmpd_invsm_amt is null" );
}else{
	System.out.println(this.toString+" : invsm_cmpd_invsm_amt is "+invsm_cmpd_invsm_amt );
}
String invsm_cmpd_invsm_amt_6 = req.getParameter("invsm_cmpd_invsm_amt_6");
if( invsm_cmpd_invsm_amt_6 == null){
	System.out.println(this.toString+" : invsm_cmpd_invsm_amt_6 is null" );
}else{
	System.out.println(this.toString+" : invsm_cmpd_invsm_amt_6 is "+invsm_cmpd_invsm_amt_6 );
}
String emp_stok_ownr_out_pens = req.getParameter("emp_stok_ownr_out_pens");
if( emp_stok_ownr_out_pens == null){
	System.out.println(this.toString+" : emp_stok_ownr_out_pens is null" );
}else{
	System.out.println(this.toString+" : emp_stok_ownr_out_pens is "+emp_stok_ownr_out_pens );
}
String lvcmpy_pens_incm_dduc = req.getParameter("lvcmpy_pens_incm_dduc");
if( lvcmpy_pens_incm_dduc == null){
	System.out.println(this.toString+" : lvcmpy_pens_incm_dduc is null" );
}else{
	System.out.println(this.toString+" : lvcmpy_pens_incm_dduc is "+lvcmpy_pens_incm_dduc );
}
String plac_cmpy_trad_authr_inc = req.getParameter("plac_cmpy_trad_authr_inc");
if( plac_cmpy_trad_authr_inc == null){
	System.out.println(this.toString+" : plac_cmpy_trad_authr_inc is null" );
}else{
	System.out.println(this.toString+" : plac_cmpy_trad_authr_inc is "+plac_cmpy_trad_authr_inc );
}
String ltrm_stok_savg_incm_dduc = req.getParameter("ltrm_stok_savg_incm_dduc");
if( ltrm_stok_savg_incm_dduc == null){
	System.out.println(this.toString+" : ltrm_stok_savg_incm_dduc is null" );
}else{
	System.out.println(this.toString+" : ltrm_stok_savg_incm_dduc is "+ltrm_stok_savg_incm_dduc );
}
String hous_loan_amt_int = req.getParameter("hous_loan_amt_int");
if( hous_loan_amt_int == null){
	System.out.println(this.toString+" : hous_loan_amt_int is null" );
}else{
	System.out.println(this.toString+" : hous_loan_amt_int is "+hous_loan_amt_int );
}
String hous_loan_amt_int_1 = req.getParameter("hous_loan_amt_int_1");
if( hous_loan_amt_int_1 == null){
	System.out.println(this.toString+" : hous_loan_amt_int_1 is null" );
}else{
	System.out.println(this.toString+" : hous_loan_amt_int_1 is "+hous_loan_amt_int_1 );
}
String tax_paymt_cmpd_dduc = req.getParameter("tax_paymt_cmpd_dduc");
if( tax_paymt_cmpd_dduc == null){
	System.out.println(this.toString+" : tax_paymt_cmpd_dduc is null" );
}else{
	System.out.println(this.toString+" : tax_paymt_cmpd_dduc is "+tax_paymt_cmpd_dduc );
}
String dona_polt_fund = req.getParameter("dona_polt_fund");
if( dona_polt_fund == null){
	System.out.println(this.toString+" : dona_polt_fund is null" );
}else{
	System.out.println(this.toString+" : dona_polt_fund is "+dona_polt_fund );
}
String forn_duty_plac = req.getParameter("forn_duty_plac");
if( forn_duty_plac == null){
	System.out.println(this.toString+" : forn_duty_plac is null" );
}else{
	System.out.println(this.toString+" : forn_duty_plac is "+forn_duty_plac );
}
String forn_duty_dty = req.getParameter("forn_duty_dty");
if( forn_duty_dty == null){
	System.out.println(this.toString+" : forn_duty_dty is null" );
}else{
	System.out.println(this.toString+" : forn_duty_dty is "+forn_duty_dty );
}
String forn_duty_prd_frdt = req.getParameter("forn_duty_prd_frdt");
if( forn_duty_prd_frdt == null){
	System.out.println(this.toString+" : forn_duty_prd_frdt is null" );
}else{
	System.out.println(this.toString+" : forn_duty_prd_frdt is "+forn_duty_prd_frdt );
}
String forn_duty_prd_todt = req.getParameter("forn_duty_prd_todt");
if( forn_duty_prd_todt == null){
	System.out.println(this.toString+" : forn_duty_prd_todt is null" );
}else{
	System.out.println(this.toString+" : forn_duty_prd_todt is "+forn_duty_prd_todt );
}
String forn_duty_tot_saly = req.getParameter("forn_duty_tot_saly");
if( forn_duty_tot_saly == null){
	System.out.println(this.toString+" : forn_duty_tot_saly is null" );
}else{
	System.out.println(this.toString+" : forn_duty_tot_saly is "+forn_duty_tot_saly );
}
String tax_paymt_offi_nm = req.getParameter("tax_paymt_offi_nm");
if( tax_paymt_offi_nm == null){
	System.out.println(this.toString+" : tax_paymt_offi_nm is null" );
}else{
	System.out.println(this.toString+" : tax_paymt_offi_nm is "+tax_paymt_offi_nm );
}
String tax_paymt_amt_frex = req.getParameter("tax_paymt_amt_frex");
if( tax_paymt_amt_frex == null){
	System.out.println(this.toString+" : tax_paymt_amt_frex is null" );
}else{
	System.out.println(this.toString+" : tax_paymt_amt_frex is "+tax_paymt_amt_frex );
}
String tax_paymt_amt_won = req.getParameter("tax_paymt_amt_won");
if( tax_paymt_amt_won == null){
	System.out.println(this.toString+" : tax_paymt_amt_won is null" );
}else{
	System.out.println(this.toString+" : tax_paymt_amt_won is "+tax_paymt_amt_won );
}
String forn_duty_clsf = req.getParameter("forn_duty_clsf");
if( forn_duty_clsf == null){
	System.out.println(this.toString+" : forn_duty_clsf is null" );
}else{
	System.out.println(this.toString+" : forn_duty_clsf is "+forn_duty_clsf );
}
String txn_obj_addm_amt = req.getParameter("txn_obj_addm_amt");
if( txn_obj_addm_amt == null){
	System.out.println(this.toString+" : txn_obj_addm_amt is null" );
}else{
	System.out.println(this.toString+" : txn_obj_addm_amt is "+txn_obj_addm_amt );
}
String ltrm_stok_savg_incm_dduc1 = req.getParameter("ltrm_stok_savg_incm_dduc1");
if( ltrm_stok_savg_incm_dduc1 == null){
	System.out.println(this.toString+" : ltrm_stok_savg_incm_dduc1 is null" );
}else{
	System.out.println(this.toString+" : ltrm_stok_savg_incm_dduc1 is "+ltrm_stok_savg_incm_dduc1 );
}
String ltrm_stok_savg_incm_dduc2 = req.getParameter("ltrm_stok_savg_incm_dduc2");
if( ltrm_stok_savg_incm_dduc2 == null){
	System.out.println(this.toString+" : ltrm_stok_savg_incm_dduc2 is null" );
}else{
	System.out.println(this.toString+" : ltrm_stok_savg_incm_dduc2 is "+ltrm_stok_savg_incm_dduc2 );
}
String ltrm_stok_savg_incm_dduc3 = req.getParameter("ltrm_stok_savg_incm_dduc3");
if( ltrm_stok_savg_incm_dduc3 == null){
	System.out.println(this.toString+" : ltrm_stok_savg_incm_dduc3 is null" );
}else{
	System.out.println(this.toString+" : ltrm_stok_savg_incm_dduc3 is "+ltrm_stok_savg_incm_dduc3 );
}
String hous_subc_savg = req.getParameter("hous_subc_savg");
if( hous_subc_savg == null){
	System.out.println(this.toString+" : hous_subc_savg is null" );
}else{
	System.out.println(this.toString+" : hous_subc_savg is "+hous_subc_savg );
}
String labr_hous_savg = req.getParameter("labr_hous_savg");
if( labr_hous_savg == null){
	System.out.println(this.toString+" : labr_hous_savg is null" );
}else{
	System.out.println(this.toString+" : labr_hous_savg is "+labr_hous_savg );
}
String ltrm_hous_savg = req.getParameter("ltrm_hous_savg");
if( ltrm_hous_savg == null){
	System.out.println(this.toString+" : ltrm_hous_savg is null" );
}else{
	System.out.println(this.toString+" : ltrm_hous_savg is "+ltrm_hous_savg );
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
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String adjm_rvrs_yy = Util.checkString(req.getParameter("adjm_rvrs_yy"));
String emp_no = Util.checkString(req.getParameter("emp_no"));
String hous_hire_rcpm_won_li_amt = Util.checkString(req.getParameter("hous_hire_rcpm_won_li_amt"));
String ltrm_hous_mogg_loan_amt_int = Util.checkString(req.getParameter("ltrm_hous_mogg_loan_amt_int"));
String wedd_tms = Util.checkString(req.getParameter("wedd_tms"));
String wedd_fee = Util.checkString(req.getParameter("wedd_fee"));
String movm_tms = Util.checkString(req.getParameter("movm_tms"));
String movm_fee = Util.checkString(req.getParameter("movm_fee"));
String fnrl_tms = Util.checkString(req.getParameter("fnrl_tms"));
String fnrl_fee = Util.checkString(req.getParameter("fnrl_fee"));
String prsn_pens = Util.checkString(req.getParameter("prsn_pens"));
String pens_savg = Util.checkString(req.getParameter("pens_savg"));
String invsm_cmpd_invsm_amt = Util.checkString(req.getParameter("invsm_cmpd_invsm_amt"));
String invsm_cmpd_invsm_amt_6 = Util.checkString(req.getParameter("invsm_cmpd_invsm_amt_6"));
String emp_stok_ownr_out_pens = Util.checkString(req.getParameter("emp_stok_ownr_out_pens"));
String lvcmpy_pens_incm_dduc = Util.checkString(req.getParameter("lvcmpy_pens_incm_dduc"));
String plac_cmpy_trad_authr_inc = Util.checkString(req.getParameter("plac_cmpy_trad_authr_inc"));
String ltrm_stok_savg_incm_dduc = Util.checkString(req.getParameter("ltrm_stok_savg_incm_dduc"));
String hous_loan_amt_int = Util.checkString(req.getParameter("hous_loan_amt_int"));
String hous_loan_amt_int_1 = Util.checkString(req.getParameter("hous_loan_amt_int_1"));
String tax_paymt_cmpd_dduc = Util.checkString(req.getParameter("tax_paymt_cmpd_dduc"));
String dona_polt_fund = Util.checkString(req.getParameter("dona_polt_fund"));
String forn_duty_plac = Util.checkString(req.getParameter("forn_duty_plac"));
String forn_duty_dty = Util.checkString(req.getParameter("forn_duty_dty"));
String forn_duty_prd_frdt = Util.checkString(req.getParameter("forn_duty_prd_frdt"));
String forn_duty_prd_todt = Util.checkString(req.getParameter("forn_duty_prd_todt"));
String forn_duty_tot_saly = Util.checkString(req.getParameter("forn_duty_tot_saly"));
String tax_paymt_offi_nm = Util.checkString(req.getParameter("tax_paymt_offi_nm"));
String tax_paymt_amt_frex = Util.checkString(req.getParameter("tax_paymt_amt_frex"));
String tax_paymt_amt_won = Util.checkString(req.getParameter("tax_paymt_amt_won"));
String forn_duty_clsf = Util.checkString(req.getParameter("forn_duty_clsf"));
String txn_obj_addm_amt = Util.checkString(req.getParameter("txn_obj_addm_amt"));
String ltrm_stok_savg_incm_dduc1 = Util.checkString(req.getParameter("ltrm_stok_savg_incm_dduc1"));
String ltrm_stok_savg_incm_dduc2 = Util.checkString(req.getParameter("ltrm_stok_savg_incm_dduc2"));
String ltrm_stok_savg_incm_dduc3 = Util.checkString(req.getParameter("ltrm_stok_savg_incm_dduc3"));
String hous_subc_savg = Util.checkString(req.getParameter("hous_subc_savg"));
String labr_hous_savg = Util.checkString(req.getParameter("labr_hous_savg"));
String ltrm_hous_savg = Util.checkString(req.getParameter("ltrm_hous_savg"));
String incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String adjm_rvrs_yy = Util.Uni2Ksc(Util.checkString(req.getParameter("adjm_rvrs_yy")));
String emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_no")));
String hous_hire_rcpm_won_li_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("hous_hire_rcpm_won_li_amt")));
String ltrm_hous_mogg_loan_amt_int = Util.Uni2Ksc(Util.checkString(req.getParameter("ltrm_hous_mogg_loan_amt_int")));
String wedd_tms = Util.Uni2Ksc(Util.checkString(req.getParameter("wedd_tms")));
String wedd_fee = Util.Uni2Ksc(Util.checkString(req.getParameter("wedd_fee")));
String movm_tms = Util.Uni2Ksc(Util.checkString(req.getParameter("movm_tms")));
String movm_fee = Util.Uni2Ksc(Util.checkString(req.getParameter("movm_fee")));
String fnrl_tms = Util.Uni2Ksc(Util.checkString(req.getParameter("fnrl_tms")));
String fnrl_fee = Util.Uni2Ksc(Util.checkString(req.getParameter("fnrl_fee")));
String prsn_pens = Util.Uni2Ksc(Util.checkString(req.getParameter("prsn_pens")));
String pens_savg = Util.Uni2Ksc(Util.checkString(req.getParameter("pens_savg")));
String invsm_cmpd_invsm_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("invsm_cmpd_invsm_amt")));
String invsm_cmpd_invsm_amt_6 = Util.Uni2Ksc(Util.checkString(req.getParameter("invsm_cmpd_invsm_amt_6")));
String emp_stok_ownr_out_pens = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_stok_ownr_out_pens")));
String lvcmpy_pens_incm_dduc = Util.Uni2Ksc(Util.checkString(req.getParameter("lvcmpy_pens_incm_dduc")));
String plac_cmpy_trad_authr_inc = Util.Uni2Ksc(Util.checkString(req.getParameter("plac_cmpy_trad_authr_inc")));
String ltrm_stok_savg_incm_dduc = Util.Uni2Ksc(Util.checkString(req.getParameter("ltrm_stok_savg_incm_dduc")));
String hous_loan_amt_int = Util.Uni2Ksc(Util.checkString(req.getParameter("hous_loan_amt_int")));
String hous_loan_amt_int_1 = Util.Uni2Ksc(Util.checkString(req.getParameter("hous_loan_amt_int_1")));
String tax_paymt_cmpd_dduc = Util.Uni2Ksc(Util.checkString(req.getParameter("tax_paymt_cmpd_dduc")));
String dona_polt_fund = Util.Uni2Ksc(Util.checkString(req.getParameter("dona_polt_fund")));
String forn_duty_plac = Util.Uni2Ksc(Util.checkString(req.getParameter("forn_duty_plac")));
String forn_duty_dty = Util.Uni2Ksc(Util.checkString(req.getParameter("forn_duty_dty")));
String forn_duty_prd_frdt = Util.Uni2Ksc(Util.checkString(req.getParameter("forn_duty_prd_frdt")));
String forn_duty_prd_todt = Util.Uni2Ksc(Util.checkString(req.getParameter("forn_duty_prd_todt")));
String forn_duty_tot_saly = Util.Uni2Ksc(Util.checkString(req.getParameter("forn_duty_tot_saly")));
String tax_paymt_offi_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("tax_paymt_offi_nm")));
String tax_paymt_amt_frex = Util.Uni2Ksc(Util.checkString(req.getParameter("tax_paymt_amt_frex")));
String tax_paymt_amt_won = Util.Uni2Ksc(Util.checkString(req.getParameter("tax_paymt_amt_won")));
String forn_duty_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("forn_duty_clsf")));
String txn_obj_addm_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("txn_obj_addm_amt")));
String ltrm_stok_savg_incm_dduc1 = Util.Uni2Ksc(Util.checkString(req.getParameter("ltrm_stok_savg_incm_dduc1")));
String ltrm_stok_savg_incm_dduc2 = Util.Uni2Ksc(Util.checkString(req.getParameter("ltrm_stok_savg_incm_dduc2")));
String ltrm_stok_savg_incm_dduc3 = Util.Uni2Ksc(Util.checkString(req.getParameter("ltrm_stok_savg_incm_dduc3")));
String hous_subc_savg = Util.Uni2Ksc(Util.checkString(req.getParameter("hous_subc_savg")));
String labr_hous_savg = Util.Uni2Ksc(Util.checkString(req.getParameter("labr_hous_savg")));
String ltrm_hous_savg = Util.Uni2Ksc(Util.checkString(req.getParameter("ltrm_hous_savg")));
String incmg_pers_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipadd")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setAdjm_rvrs_yy(adjm_rvrs_yy);
dm.setEmp_no(emp_no);
dm.setHous_hire_rcpm_won_li_amt(hous_hire_rcpm_won_li_amt);
dm.setLtrm_hous_mogg_loan_amt_int(ltrm_hous_mogg_loan_amt_int);
dm.setWedd_tms(wedd_tms);
dm.setWedd_fee(wedd_fee);
dm.setMovm_tms(movm_tms);
dm.setMovm_fee(movm_fee);
dm.setFnrl_tms(fnrl_tms);
dm.setFnrl_fee(fnrl_fee);
dm.setPrsn_pens(prsn_pens);
dm.setPens_savg(pens_savg);
dm.setInvsm_cmpd_invsm_amt(invsm_cmpd_invsm_amt);
dm.setInvsm_cmpd_invsm_amt_6(invsm_cmpd_invsm_amt_6);
dm.setEmp_stok_ownr_out_pens(emp_stok_ownr_out_pens);
dm.setLvcmpy_pens_incm_dduc(lvcmpy_pens_incm_dduc);
dm.setPlac_cmpy_trad_authr_inc(plac_cmpy_trad_authr_inc);
dm.setLtrm_stok_savg_incm_dduc(ltrm_stok_savg_incm_dduc);
dm.setHous_loan_amt_int(hous_loan_amt_int);
dm.setHous_loan_amt_int_1(hous_loan_amt_int_1);
dm.setTax_paymt_cmpd_dduc(tax_paymt_cmpd_dduc);
dm.setDona_polt_fund(dona_polt_fund);
dm.setForn_duty_plac(forn_duty_plac);
dm.setForn_duty_dty(forn_duty_dty);
dm.setForn_duty_prd_frdt(forn_duty_prd_frdt);
dm.setForn_duty_prd_todt(forn_duty_prd_todt);
dm.setForn_duty_tot_saly(forn_duty_tot_saly);
dm.setTax_paymt_offi_nm(tax_paymt_offi_nm);
dm.setTax_paymt_amt_frex(tax_paymt_amt_frex);
dm.setTax_paymt_amt_won(tax_paymt_amt_won);
dm.setForn_duty_clsf(forn_duty_clsf);
dm.setTxn_obj_addm_amt(txn_obj_addm_amt);
dm.setLtrm_stok_savg_incm_dduc1(ltrm_stok_savg_incm_dduc1);
dm.setLtrm_stok_savg_incm_dduc2(ltrm_stok_savg_incm_dduc2);
dm.setLtrm_stok_savg_incm_dduc3(ltrm_stok_savg_incm_dduc3);
dm.setHous_subc_savg(hous_subc_savg);
dm.setLabr_hous_savg(labr_hous_savg);
dm.setLtrm_hous_savg(ltrm_hous_savg);
dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Dec 01 21:41:13 KST 2009 */
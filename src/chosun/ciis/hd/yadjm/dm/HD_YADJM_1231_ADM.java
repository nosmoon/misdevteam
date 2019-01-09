
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


public class HD_YADJM_1231_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String adjm_rvrs_yy;
	public String emp_no;
	public String connect_ip;
	public String connect_userid;
	public String wedd_tms;
	public String movm_tms;
	public String fnrl_tms;
	public String prsn_pens_2000yy_aft;
	public String pens_low_out_2001yy_aft;
	public String invsm_cmpd_invsm_amt;
	public String emp_stok_ownr_out_pens;
	public String lvcmpy_pens_incm_dduc;
	public String plac_inc;
	public String ltrm_dduc;
	public String hous_loan_amt_int;
	public String tax_paymt_cmpd_dduc;
	public String dona_polt_fund_10;
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
	public String ltrm_dduc1;
	public String ltrm_dduc2;
	public String ltrm_dduc3;
	public String hous_subc_savg;
	public String labr_hous_savg;
	public String ltrm_hous_savg;

	public HD_YADJM_1231_ADM(){}
	public HD_YADJM_1231_ADM(String cmpy_cd, String adjm_rvrs_yy, String emp_no, String connect_ip, String connect_userid, String wedd_tms, String movm_tms, String fnrl_tms, String prsn_pens_2000yy_aft, String pens_low_out_2001yy_aft, String invsm_cmpd_invsm_amt, String emp_stok_ownr_out_pens, String lvcmpy_pens_incm_dduc, String plac_inc, String ltrm_dduc, String hous_loan_amt_int, String tax_paymt_cmpd_dduc, String dona_polt_fund_10, String forn_duty_plac, String forn_duty_dty, String forn_duty_prd_frdt, String forn_duty_prd_todt, String forn_duty_tot_saly, String tax_paymt_offi_nm, String tax_paymt_amt_frex, String tax_paymt_amt_won, String forn_duty_clsf, String txn_obj_addm_amt, String ltrm_dduc1, String ltrm_dduc2, String ltrm_dduc3, String hous_subc_savg, String labr_hous_savg, String ltrm_hous_savg){
		this.cmpy_cd = cmpy_cd;
		this.adjm_rvrs_yy = adjm_rvrs_yy;
		this.emp_no = emp_no;
		this.connect_ip = connect_ip;
		this.connect_userid = connect_userid;
		this.wedd_tms = wedd_tms;
		this.movm_tms = movm_tms;
		this.fnrl_tms = fnrl_tms;
		this.prsn_pens_2000yy_aft = prsn_pens_2000yy_aft;
		this.pens_low_out_2001yy_aft = pens_low_out_2001yy_aft;
		this.invsm_cmpd_invsm_amt = invsm_cmpd_invsm_amt;
		this.emp_stok_ownr_out_pens = emp_stok_ownr_out_pens;
		this.lvcmpy_pens_incm_dduc = lvcmpy_pens_incm_dduc;
		this.plac_inc = plac_inc;
		this.ltrm_dduc = ltrm_dduc;
		this.hous_loan_amt_int = hous_loan_amt_int;
		this.tax_paymt_cmpd_dduc = tax_paymt_cmpd_dduc;
		this.dona_polt_fund_10 = dona_polt_fund_10;
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
		this.ltrm_dduc1 = ltrm_dduc1;
		this.ltrm_dduc2 = ltrm_dduc2;
		this.ltrm_dduc3 = ltrm_dduc3;
		this.hous_subc_savg = hous_subc_savg;
		this.labr_hous_savg = labr_hous_savg;
		this.ltrm_hous_savg = ltrm_hous_savg;
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

	public void setConnect_ip(String connect_ip){
		this.connect_ip = connect_ip;
	}

	public void setConnect_userid(String connect_userid){
		this.connect_userid = connect_userid;
	}

	public void setWedd_tms(String wedd_tms){
		this.wedd_tms = wedd_tms;
	}

	public void setMovm_tms(String movm_tms){
		this.movm_tms = movm_tms;
	}

	public void setFnrl_tms(String fnrl_tms){
		this.fnrl_tms = fnrl_tms;
	}

	public void setPrsn_pens_2000yy_aft(String prsn_pens_2000yy_aft){
		this.prsn_pens_2000yy_aft = prsn_pens_2000yy_aft;
	}

	public void setPens_low_out_2001yy_aft(String pens_low_out_2001yy_aft){
		this.pens_low_out_2001yy_aft = pens_low_out_2001yy_aft;
	}

	public void setInvsm_cmpd_invsm_amt(String invsm_cmpd_invsm_amt){
		this.invsm_cmpd_invsm_amt = invsm_cmpd_invsm_amt;
	}

	public void setEmp_stok_ownr_out_pens(String emp_stok_ownr_out_pens){
		this.emp_stok_ownr_out_pens = emp_stok_ownr_out_pens;
	}

	public void setLvcmpy_pens_incm_dduc(String lvcmpy_pens_incm_dduc){
		this.lvcmpy_pens_incm_dduc = lvcmpy_pens_incm_dduc;
	}

	public void setPlac_inc(String plac_inc){
		this.plac_inc = plac_inc;
	}

	public void setLtrm_dduc(String ltrm_dduc){
		this.ltrm_dduc = ltrm_dduc;
	}

	public void setHous_loan_amt_int(String hous_loan_amt_int){
		this.hous_loan_amt_int = hous_loan_amt_int;
	}

	public void setTax_paymt_cmpd_dduc(String tax_paymt_cmpd_dduc){
		this.tax_paymt_cmpd_dduc = tax_paymt_cmpd_dduc;
	}

	public void setDona_polt_fund_10(String dona_polt_fund_10){
		this.dona_polt_fund_10 = dona_polt_fund_10;
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

	public void setLtrm_dduc1(String ltrm_dduc1){
		this.ltrm_dduc1 = ltrm_dduc1;
	}

	public void setLtrm_dduc2(String ltrm_dduc2){
		this.ltrm_dduc2 = ltrm_dduc2;
	}

	public void setLtrm_dduc3(String ltrm_dduc3){
		this.ltrm_dduc3 = ltrm_dduc3;
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

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getAdjm_rvrs_yy(){
		return this.adjm_rvrs_yy;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getConnect_ip(){
		return this.connect_ip;
	}

	public String getConnect_userid(){
		return this.connect_userid;
	}

	public String getWedd_tms(){
		return this.wedd_tms;
	}

	public String getMovm_tms(){
		return this.movm_tms;
	}

	public String getFnrl_tms(){
		return this.fnrl_tms;
	}

	public String getPrsn_pens_2000yy_aft(){
		return this.prsn_pens_2000yy_aft;
	}

	public String getPens_low_out_2001yy_aft(){
		return this.pens_low_out_2001yy_aft;
	}

	public String getInvsm_cmpd_invsm_amt(){
		return this.invsm_cmpd_invsm_amt;
	}

	public String getEmp_stok_ownr_out_pens(){
		return this.emp_stok_ownr_out_pens;
	}

	public String getLvcmpy_pens_incm_dduc(){
		return this.lvcmpy_pens_incm_dduc;
	}

	public String getPlac_inc(){
		return this.plac_inc;
	}

	public String getLtrm_dduc(){
		return this.ltrm_dduc;
	}

	public String getHous_loan_amt_int(){
		return this.hous_loan_amt_int;
	}

	public String getTax_paymt_cmpd_dduc(){
		return this.tax_paymt_cmpd_dduc;
	}

	public String getDona_polt_fund_10(){
		return this.dona_polt_fund_10;
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

	public String getLtrm_dduc1(){
		return this.ltrm_dduc1;
	}

	public String getLtrm_dduc2(){
		return this.ltrm_dduc2;
	}

	public String getLtrm_dduc3(){
		return this.ltrm_dduc3;
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

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_YADJM_1231_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_YADJM_1231_ADM dm = (HD_YADJM_1231_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.registerOutParameter(3, Types.VARCHAR);
		cstmt.setString(4, dm.cmpy_cd);
		cstmt.setString(5, dm.adjm_rvrs_yy);
		cstmt.setString(6, dm.emp_no);
		cstmt.setString(7, dm.connect_ip);
		cstmt.setString(8, dm.connect_userid);
		cstmt.setString(9, dm.wedd_tms);
		cstmt.setString(10, dm.movm_tms);
		cstmt.setString(11, dm.fnrl_tms);
		cstmt.setString(12, dm.prsn_pens_2000yy_aft);
		cstmt.setString(13, dm.pens_low_out_2001yy_aft);
		cstmt.setString(14, dm.invsm_cmpd_invsm_amt);
		cstmt.setString(15, dm.emp_stok_ownr_out_pens);
		cstmt.setString(16, dm.lvcmpy_pens_incm_dduc);
		cstmt.setString(17, dm.plac_inc);
		cstmt.setString(18, dm.ltrm_dduc);
		cstmt.setString(19, dm.hous_loan_amt_int);
		cstmt.setString(20, dm.tax_paymt_cmpd_dduc);
		cstmt.setString(21, dm.dona_polt_fund_10);
		cstmt.setString(22, dm.forn_duty_plac);
		cstmt.setString(23, dm.forn_duty_dty);
		cstmt.setString(24, dm.forn_duty_prd_frdt);
		cstmt.setString(25, dm.forn_duty_prd_todt);
		cstmt.setString(26, dm.forn_duty_tot_saly);
		cstmt.setString(27, dm.tax_paymt_offi_nm);
		cstmt.setString(28, dm.tax_paymt_amt_frex);
		cstmt.setString(29, dm.tax_paymt_amt_won);
		cstmt.setString(30, dm.forn_duty_clsf);
		cstmt.setString(31, dm.txn_obj_addm_amt);
		cstmt.setString(32, dm.ltrm_dduc1);
		cstmt.setString(33, dm.ltrm_dduc2);
		cstmt.setString(34, dm.ltrm_dduc3);
		cstmt.setString(35, dm.hous_subc_savg);
		cstmt.setString(36, dm.labr_hous_savg);
		cstmt.setString(37, dm.ltrm_hous_savg);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.yadjm.ds.HD_YADJM_1231_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("adjm_rvrs_yy = [" + getAdjm_rvrs_yy() + "]");
		System.out.println("emp_no = [" + getEmp_no() + "]");
		System.out.println("connect_ip = [" + getConnect_ip() + "]");
		System.out.println("connect_userid = [" + getConnect_userid() + "]");
		System.out.println("wedd_tms = [" + getWedd_tms() + "]");
		System.out.println("movm_tms = [" + getMovm_tms() + "]");
		System.out.println("fnrl_tms = [" + getFnrl_tms() + "]");
		System.out.println("prsn_pens_2000yy_aft = [" + getPrsn_pens_2000yy_aft() + "]");
		System.out.println("pens_low_out_2001yy_aft = [" + getPens_low_out_2001yy_aft() + "]");
		System.out.println("invsm_cmpd_invsm_amt = [" + getInvsm_cmpd_invsm_amt() + "]");
		System.out.println("emp_stok_ownr_out_pens = [" + getEmp_stok_ownr_out_pens() + "]");
		System.out.println("lvcmpy_pens_incm_dduc = [" + getLvcmpy_pens_incm_dduc() + "]");
		System.out.println("plac_inc = [" + getPlac_inc() + "]");
		System.out.println("ltrm_dduc = [" + getLtrm_dduc() + "]");
		System.out.println("hous_loan_amt_int = [" + getHous_loan_amt_int() + "]");
		System.out.println("tax_paymt_cmpd_dduc = [" + getTax_paymt_cmpd_dduc() + "]");
		System.out.println("dona_polt_fund_10 = [" + getDona_polt_fund_10() + "]");
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
		System.out.println("ltrm_dduc1 = [" + getLtrm_dduc1() + "]");
		System.out.println("ltrm_dduc2 = [" + getLtrm_dduc2() + "]");
		System.out.println("ltrm_dduc3 = [" + getLtrm_dduc3() + "]");
		System.out.println("hous_subc_savg = [" + getHous_subc_savg() + "]");
		System.out.println("labr_hous_savg = [" + getLabr_hous_savg() + "]");
		System.out.println("ltrm_hous_savg = [" + getLtrm_hous_savg() + "]");
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
String connect_ip = req.getParameter("connect_ip");
if( connect_ip == null){
	System.out.println(this.toString+" : connect_ip is null" );
}else{
	System.out.println(this.toString+" : connect_ip is "+connect_ip );
}
String connect_userid = req.getParameter("connect_userid");
if( connect_userid == null){
	System.out.println(this.toString+" : connect_userid is null" );
}else{
	System.out.println(this.toString+" : connect_userid is "+connect_userid );
}
String wedd_tms = req.getParameter("wedd_tms");
if( wedd_tms == null){
	System.out.println(this.toString+" : wedd_tms is null" );
}else{
	System.out.println(this.toString+" : wedd_tms is "+wedd_tms );
}
String movm_tms = req.getParameter("movm_tms");
if( movm_tms == null){
	System.out.println(this.toString+" : movm_tms is null" );
}else{
	System.out.println(this.toString+" : movm_tms is "+movm_tms );
}
String fnrl_tms = req.getParameter("fnrl_tms");
if( fnrl_tms == null){
	System.out.println(this.toString+" : fnrl_tms is null" );
}else{
	System.out.println(this.toString+" : fnrl_tms is "+fnrl_tms );
}
String prsn_pens_2000yy_aft = req.getParameter("prsn_pens_2000yy_aft");
if( prsn_pens_2000yy_aft == null){
	System.out.println(this.toString+" : prsn_pens_2000yy_aft is null" );
}else{
	System.out.println(this.toString+" : prsn_pens_2000yy_aft is "+prsn_pens_2000yy_aft );
}
String pens_low_out_2001yy_aft = req.getParameter("pens_low_out_2001yy_aft");
if( pens_low_out_2001yy_aft == null){
	System.out.println(this.toString+" : pens_low_out_2001yy_aft is null" );
}else{
	System.out.println(this.toString+" : pens_low_out_2001yy_aft is "+pens_low_out_2001yy_aft );
}
String invsm_cmpd_invsm_amt = req.getParameter("invsm_cmpd_invsm_amt");
if( invsm_cmpd_invsm_amt == null){
	System.out.println(this.toString+" : invsm_cmpd_invsm_amt is null" );
}else{
	System.out.println(this.toString+" : invsm_cmpd_invsm_amt is "+invsm_cmpd_invsm_amt );
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
String plac_inc = req.getParameter("plac_inc");
if( plac_inc == null){
	System.out.println(this.toString+" : plac_inc is null" );
}else{
	System.out.println(this.toString+" : plac_inc is "+plac_inc );
}
String ltrm_dduc = req.getParameter("ltrm_dduc");
if( ltrm_dduc == null){
	System.out.println(this.toString+" : ltrm_dduc is null" );
}else{
	System.out.println(this.toString+" : ltrm_dduc is "+ltrm_dduc );
}
String hous_loan_amt_int = req.getParameter("hous_loan_amt_int");
if( hous_loan_amt_int == null){
	System.out.println(this.toString+" : hous_loan_amt_int is null" );
}else{
	System.out.println(this.toString+" : hous_loan_amt_int is "+hous_loan_amt_int );
}
String tax_paymt_cmpd_dduc = req.getParameter("tax_paymt_cmpd_dduc");
if( tax_paymt_cmpd_dduc == null){
	System.out.println(this.toString+" : tax_paymt_cmpd_dduc is null" );
}else{
	System.out.println(this.toString+" : tax_paymt_cmpd_dduc is "+tax_paymt_cmpd_dduc );
}
String dona_polt_fund_10 = req.getParameter("dona_polt_fund_10");
if( dona_polt_fund_10 == null){
	System.out.println(this.toString+" : dona_polt_fund_10 is null" );
}else{
	System.out.println(this.toString+" : dona_polt_fund_10 is "+dona_polt_fund_10 );
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
String ltrm_dduc1 = req.getParameter("ltrm_dduc1");
if( ltrm_dduc1 == null){
	System.out.println(this.toString+" : ltrm_dduc1 is null" );
}else{
	System.out.println(this.toString+" : ltrm_dduc1 is "+ltrm_dduc1 );
}
String ltrm_dduc2 = req.getParameter("ltrm_dduc2");
if( ltrm_dduc2 == null){
	System.out.println(this.toString+" : ltrm_dduc2 is null" );
}else{
	System.out.println(this.toString+" : ltrm_dduc2 is "+ltrm_dduc2 );
}
String ltrm_dduc3 = req.getParameter("ltrm_dduc3");
if( ltrm_dduc3 == null){
	System.out.println(this.toString+" : ltrm_dduc3 is null" );
}else{
	System.out.println(this.toString+" : ltrm_dduc3 is "+ltrm_dduc3 );
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
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String adjm_rvrs_yy = Util.checkString(req.getParameter("adjm_rvrs_yy"));
String emp_no = Util.checkString(req.getParameter("emp_no"));
String connect_ip = Util.checkString(req.getParameter("connect_ip"));
String connect_userid = Util.checkString(req.getParameter("connect_userid"));
String wedd_tms = Util.checkString(req.getParameter("wedd_tms"));
String movm_tms = Util.checkString(req.getParameter("movm_tms"));
String fnrl_tms = Util.checkString(req.getParameter("fnrl_tms"));
String prsn_pens_2000yy_aft = Util.checkString(req.getParameter("prsn_pens_2000yy_aft"));
String pens_low_out_2001yy_aft = Util.checkString(req.getParameter("pens_low_out_2001yy_aft"));
String invsm_cmpd_invsm_amt = Util.checkString(req.getParameter("invsm_cmpd_invsm_amt"));
String emp_stok_ownr_out_pens = Util.checkString(req.getParameter("emp_stok_ownr_out_pens"));
String lvcmpy_pens_incm_dduc = Util.checkString(req.getParameter("lvcmpy_pens_incm_dduc"));
String plac_inc = Util.checkString(req.getParameter("plac_inc"));
String ltrm_dduc = Util.checkString(req.getParameter("ltrm_dduc"));
String hous_loan_amt_int = Util.checkString(req.getParameter("hous_loan_amt_int"));
String tax_paymt_cmpd_dduc = Util.checkString(req.getParameter("tax_paymt_cmpd_dduc"));
String dona_polt_fund_10 = Util.checkString(req.getParameter("dona_polt_fund_10"));
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
String ltrm_dduc1 = Util.checkString(req.getParameter("ltrm_dduc1"));
String ltrm_dduc2 = Util.checkString(req.getParameter("ltrm_dduc2"));
String ltrm_dduc3 = Util.checkString(req.getParameter("ltrm_dduc3"));
String hous_subc_savg = Util.checkString(req.getParameter("hous_subc_savg"));
String labr_hous_savg = Util.checkString(req.getParameter("labr_hous_savg"));
String ltrm_hous_savg = Util.checkString(req.getParameter("ltrm_hous_savg"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String adjm_rvrs_yy = Util.Uni2Ksc(Util.checkString(req.getParameter("adjm_rvrs_yy")));
String emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_no")));
String connect_ip = Util.Uni2Ksc(Util.checkString(req.getParameter("connect_ip")));
String connect_userid = Util.Uni2Ksc(Util.checkString(req.getParameter("connect_userid")));
String wedd_tms = Util.Uni2Ksc(Util.checkString(req.getParameter("wedd_tms")));
String movm_tms = Util.Uni2Ksc(Util.checkString(req.getParameter("movm_tms")));
String fnrl_tms = Util.Uni2Ksc(Util.checkString(req.getParameter("fnrl_tms")));
String prsn_pens_2000yy_aft = Util.Uni2Ksc(Util.checkString(req.getParameter("prsn_pens_2000yy_aft")));
String pens_low_out_2001yy_aft = Util.Uni2Ksc(Util.checkString(req.getParameter("pens_low_out_2001yy_aft")));
String invsm_cmpd_invsm_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("invsm_cmpd_invsm_amt")));
String emp_stok_ownr_out_pens = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_stok_ownr_out_pens")));
String lvcmpy_pens_incm_dduc = Util.Uni2Ksc(Util.checkString(req.getParameter("lvcmpy_pens_incm_dduc")));
String plac_inc = Util.Uni2Ksc(Util.checkString(req.getParameter("plac_inc")));
String ltrm_dduc = Util.Uni2Ksc(Util.checkString(req.getParameter("ltrm_dduc")));
String hous_loan_amt_int = Util.Uni2Ksc(Util.checkString(req.getParameter("hous_loan_amt_int")));
String tax_paymt_cmpd_dduc = Util.Uni2Ksc(Util.checkString(req.getParameter("tax_paymt_cmpd_dduc")));
String dona_polt_fund_10 = Util.Uni2Ksc(Util.checkString(req.getParameter("dona_polt_fund_10")));
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
String ltrm_dduc1 = Util.Uni2Ksc(Util.checkString(req.getParameter("ltrm_dduc1")));
String ltrm_dduc2 = Util.Uni2Ksc(Util.checkString(req.getParameter("ltrm_dduc2")));
String ltrm_dduc3 = Util.Uni2Ksc(Util.checkString(req.getParameter("ltrm_dduc3")));
String hous_subc_savg = Util.Uni2Ksc(Util.checkString(req.getParameter("hous_subc_savg")));
String labr_hous_savg = Util.Uni2Ksc(Util.checkString(req.getParameter("labr_hous_savg")));
String ltrm_hous_savg = Util.Uni2Ksc(Util.checkString(req.getParameter("ltrm_hous_savg")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setAdjm_rvrs_yy(adjm_rvrs_yy);
dm.setEmp_no(emp_no);
dm.setConnect_ip(connect_ip);
dm.setConnect_userid(connect_userid);
dm.setWedd_tms(wedd_tms);
dm.setMovm_tms(movm_tms);
dm.setFnrl_tms(fnrl_tms);
dm.setPrsn_pens_2000yy_aft(prsn_pens_2000yy_aft);
dm.setPens_low_out_2001yy_aft(pens_low_out_2001yy_aft);
dm.setInvsm_cmpd_invsm_amt(invsm_cmpd_invsm_amt);
dm.setEmp_stok_ownr_out_pens(emp_stok_ownr_out_pens);
dm.setLvcmpy_pens_incm_dduc(lvcmpy_pens_incm_dduc);
dm.setPlac_inc(plac_inc);
dm.setLtrm_dduc(ltrm_dduc);
dm.setHous_loan_amt_int(hous_loan_amt_int);
dm.setTax_paymt_cmpd_dduc(tax_paymt_cmpd_dduc);
dm.setDona_polt_fund_10(dona_polt_fund_10);
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
dm.setLtrm_dduc1(ltrm_dduc1);
dm.setLtrm_dduc2(ltrm_dduc2);
dm.setLtrm_dduc3(ltrm_dduc3);
dm.setHous_subc_savg(hous_subc_savg);
dm.setLabr_hous_savg(labr_hous_savg);
dm.setLtrm_hous_savg(ltrm_hous_savg);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri May 15 17:24:27 KST 2009 */
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


public class FC_ACCT_2024_UDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String slip_occr_dt;
	public String slip_clsf_cd;
	public String slip_seq;
	public String clam_dept_cd;
	public String clam_amt;
	public String titl;
	public String medi_cd;
	public String cost_clsf;
	public String budg_yymm;
	public String chrg_emp_no;
	public String budg_cd;
	public String incmg_pers;
	public String incmg_pers_ipadd;
	public String old_dlco_clsf_cd;
	public String old_dlco_cd;
	public String pch_compnm;
	public String pubc_dt;
	public String nosh;
	public String uprc;
	public String atic_fee;
	public String incm_clsf_cd;
	public String incm_tax;
	public String res_tax;
	public String coms;
	public String atic_nm;
	public String with_tax;
	public String pubc_side;
	public String cal_pay_amt;
	public String bank_clsf;
	public String acct_no;
	public String deps_pers_nm;
	public String dtls_medi_cd;
	public String adpay_expn_no;
	public String end_yn;
	public String draft_doc_no;
	public String draft_doc_dept_cd;
	public String draft_expn_amt;

	public FC_ACCT_2024_UDM(){}
	public FC_ACCT_2024_UDM(String cmpy_cd, String slip_occr_dt, String slip_clsf_cd, String slip_seq, String clam_dept_cd, String clam_amt, String titl, String medi_cd, String cost_clsf, String budg_yymm, String chrg_emp_no, String budg_cd, String incmg_pers, String incmg_pers_ipadd, String old_dlco_clsf_cd, String old_dlco_cd, String pch_compnm, String pubc_dt, String nosh, String uprc, String atic_fee, String incm_clsf_cd, String incm_tax, String res_tax, String coms, String atic_nm, String with_tax, String pubc_side, String cal_pay_amt, String bank_clsf, String acct_no, String deps_pers_nm, String dtls_medi_cd, String adpay_expn_no, String end_yn, String draft_doc_no, String draft_doc_dept_cd, String draft_expn_amt){
		this.cmpy_cd = cmpy_cd;
		this.slip_occr_dt = slip_occr_dt;
		this.slip_clsf_cd = slip_clsf_cd;
		this.slip_seq = slip_seq;
		this.clam_dept_cd = clam_dept_cd;
		this.clam_amt = clam_amt;
		this.titl = titl;
		this.medi_cd = medi_cd;
		this.cost_clsf = cost_clsf;
		this.budg_yymm = budg_yymm;
		this.chrg_emp_no = chrg_emp_no;
		this.budg_cd = budg_cd;
		this.incmg_pers = incmg_pers;
		this.incmg_pers_ipadd = incmg_pers_ipadd;
		this.old_dlco_clsf_cd = old_dlco_clsf_cd;
		this.old_dlco_cd = old_dlco_cd;
		this.pch_compnm = pch_compnm;
		this.pubc_dt = pubc_dt;
		this.nosh = nosh;
		this.uprc = uprc;
		this.atic_fee = atic_fee;
		this.incm_clsf_cd = incm_clsf_cd;
		this.incm_tax = incm_tax;
		this.res_tax = res_tax;
		this.coms = coms;
		this.atic_nm = atic_nm;
		this.with_tax = with_tax;
		this.pubc_side = pubc_side;
		this.cal_pay_amt = cal_pay_amt;
		this.bank_clsf = bank_clsf;
		this.acct_no = acct_no;
		this.deps_pers_nm = deps_pers_nm;
		this.dtls_medi_cd = dtls_medi_cd;
		this.adpay_expn_no = adpay_expn_no;
		this.end_yn = end_yn;
		this.draft_doc_no = draft_doc_no;
		this.draft_doc_dept_cd = draft_doc_dept_cd;
		this.draft_expn_amt = draft_expn_amt;
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

	public void setClam_dept_cd(String clam_dept_cd){
		this.clam_dept_cd = clam_dept_cd;
	}

	public void setClam_amt(String clam_amt){
		this.clam_amt = clam_amt;
	}

	public void setTitl(String titl){
		this.titl = titl;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setCost_clsf(String cost_clsf){
		this.cost_clsf = cost_clsf;
	}

	public void setBudg_yymm(String budg_yymm){
		this.budg_yymm = budg_yymm;
	}

	public void setChrg_emp_no(String chrg_emp_no){
		this.chrg_emp_no = chrg_emp_no;
	}

	public void setBudg_cd(String budg_cd){
		this.budg_cd = budg_cd;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setIncmg_pers_ipadd(String incmg_pers_ipadd){
		this.incmg_pers_ipadd = incmg_pers_ipadd;
	}

	public void setOld_dlco_clsf_cd(String old_dlco_clsf_cd){
		this.old_dlco_clsf_cd = old_dlco_clsf_cd;
	}

	public void setOld_dlco_cd(String old_dlco_cd){
		this.old_dlco_cd = old_dlco_cd;
	}

	public void setPch_compnm(String pch_compnm){
		this.pch_compnm = pch_compnm;
	}

	public void setPubc_dt(String pubc_dt){
		this.pubc_dt = pubc_dt;
	}

	public void setNosh(String nosh){
		this.nosh = nosh;
	}

	public void setUprc(String uprc){
		this.uprc = uprc;
	}

	public void setAtic_fee(String atic_fee){
		this.atic_fee = atic_fee;
	}

	public void setIncm_clsf_cd(String incm_clsf_cd){
		this.incm_clsf_cd = incm_clsf_cd;
	}

	public void setIncm_tax(String incm_tax){
		this.incm_tax = incm_tax;
	}

	public void setRes_tax(String res_tax){
		this.res_tax = res_tax;
	}

	public void setComs(String coms){
		this.coms = coms;
	}

	public void setAtic_nm(String atic_nm){
		this.atic_nm = atic_nm;
	}

	public void setWith_tax(String with_tax){
		this.with_tax = with_tax;
	}

	public void setPubc_side(String pubc_side){
		this.pubc_side = pubc_side;
	}

	public void setCal_pay_amt(String cal_pay_amt){
		this.cal_pay_amt = cal_pay_amt;
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

	public void setDtls_medi_cd(String dtls_medi_cd){
		this.dtls_medi_cd = dtls_medi_cd;
	}

	public void setAdpay_expn_no(String adpay_expn_no){
		this.adpay_expn_no = adpay_expn_no;
	}

	public void setEnd_yn(String end_yn){
		this.end_yn = end_yn;
	}

	public void setDraft_doc_no(String draft_doc_no){
		this.draft_doc_no = draft_doc_no;
	}

	public void setDraft_doc_dept_cd(String draft_doc_dept_cd){
		this.draft_doc_dept_cd = draft_doc_dept_cd;
	}

	public void setDraft_expn_amt(String draft_expn_amt){
		this.draft_expn_amt = draft_expn_amt;
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

	public String getClam_dept_cd(){
		return this.clam_dept_cd;
	}

	public String getClam_amt(){
		return this.clam_amt;
	}

	public String getTitl(){
		return this.titl;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getCost_clsf(){
		return this.cost_clsf;
	}

	public String getBudg_yymm(){
		return this.budg_yymm;
	}

	public String getChrg_emp_no(){
		return this.chrg_emp_no;
	}

	public String getBudg_cd(){
		return this.budg_cd;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getIncmg_pers_ipadd(){
		return this.incmg_pers_ipadd;
	}

	public String getOld_dlco_clsf_cd(){
		return this.old_dlco_clsf_cd;
	}

	public String getOld_dlco_cd(){
		return this.old_dlco_cd;
	}

	public String getPch_compnm(){
		return this.pch_compnm;
	}

	public String getPubc_dt(){
		return this.pubc_dt;
	}

	public String getNosh(){
		return this.nosh;
	}

	public String getUprc(){
		return this.uprc;
	}

	public String getAtic_fee(){
		return this.atic_fee;
	}

	public String getIncm_clsf_cd(){
		return this.incm_clsf_cd;
	}

	public String getIncm_tax(){
		return this.incm_tax;
	}

	public String getRes_tax(){
		return this.res_tax;
	}

	public String getComs(){
		return this.coms;
	}

	public String getAtic_nm(){
		return this.atic_nm;
	}

	public String getWith_tax(){
		return this.with_tax;
	}

	public String getPubc_side(){
		return this.pubc_side;
	}

	public String getCal_pay_amt(){
		return this.cal_pay_amt;
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

	public String getDtls_medi_cd(){
		return this.dtls_medi_cd;
	}

	public String getAdpay_expn_no(){
		return this.adpay_expn_no;
	}

	public String getEnd_yn(){
		return this.end_yn;
	}

	public String getDraft_doc_no(){
		return this.draft_doc_no;
	}

	public String getDraft_doc_dept_cd(){
		return this.draft_doc_dept_cd;
	}

	public String getDraft_expn_amt(){
		return this.draft_expn_amt;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_FC_ACCT_2024_U(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		FC_ACCT_2024_UDM dm = (FC_ACCT_2024_UDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.slip_occr_dt);
		cstmt.setString(5, dm.slip_clsf_cd);
		cstmt.setString(6, dm.slip_seq);
		cstmt.setString(7, dm.clam_dept_cd);
		cstmt.setString(8, dm.clam_amt);
		cstmt.setString(9, dm.titl);
		cstmt.setString(10, dm.medi_cd);
		cstmt.setString(11, dm.cost_clsf);
		cstmt.setString(12, dm.budg_yymm);
		cstmt.setString(13, dm.chrg_emp_no);
		cstmt.setString(14, dm.budg_cd);
		cstmt.setString(15, dm.incmg_pers);
		cstmt.setString(16, dm.incmg_pers_ipadd);
		cstmt.setString(17, dm.old_dlco_clsf_cd);
		cstmt.setString(18, dm.old_dlco_cd);
		cstmt.setString(19, dm.pch_compnm);
		cstmt.setString(20, dm.pubc_dt);
		cstmt.setString(21, dm.nosh);
		cstmt.setString(22, dm.uprc);
		cstmt.setString(23, dm.atic_fee);
		cstmt.setString(24, dm.incm_clsf_cd);
		cstmt.setString(25, dm.incm_tax);
		cstmt.setString(26, dm.res_tax);
		cstmt.setString(27, dm.coms);
		cstmt.setString(28, dm.atic_nm);
		cstmt.setString(29, dm.with_tax);
		cstmt.setString(30, dm.pubc_side);
		cstmt.setString(31, dm.cal_pay_amt);
		cstmt.setString(32, dm.bank_clsf);
		cstmt.setString(33, dm.acct_no);
		cstmt.setString(34, dm.deps_pers_nm);
		cstmt.setString(35, dm.dtls_medi_cd);
		cstmt.setString(36, dm.adpay_expn_no);
		cstmt.setString(37, dm.end_yn);
		cstmt.setString(38, dm.draft_doc_no);
		cstmt.setString(39, dm.draft_doc_dept_cd);
		cstmt.setString(40, dm.draft_expn_amt);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.fc.acct.ds.FC_ACCT_2024_UDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("slip_occr_dt = [" + getSlip_occr_dt() + "]");
		System.out.println("slip_clsf_cd = [" + getSlip_clsf_cd() + "]");
		System.out.println("slip_seq = [" + getSlip_seq() + "]");
		System.out.println("clam_dept_cd = [" + getClam_dept_cd() + "]");
		System.out.println("clam_amt = [" + getClam_amt() + "]");
		System.out.println("titl = [" + getTitl() + "]");
		System.out.println("medi_cd = [" + getMedi_cd() + "]");
		System.out.println("cost_clsf = [" + getCost_clsf() + "]");
		System.out.println("budg_yymm = [" + getBudg_yymm() + "]");
		System.out.println("chrg_emp_no = [" + getChrg_emp_no() + "]");
		System.out.println("budg_cd = [" + getBudg_cd() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("incmg_pers_ipadd = [" + getIncmg_pers_ipadd() + "]");
		System.out.println("old_dlco_clsf_cd = [" + getOld_dlco_clsf_cd() + "]");
		System.out.println("old_dlco_cd = [" + getOld_dlco_cd() + "]");
		System.out.println("pch_compnm = [" + getPch_compnm() + "]");
		System.out.println("pubc_dt = [" + getPubc_dt() + "]");
		System.out.println("nosh = [" + getNosh() + "]");
		System.out.println("uprc = [" + getUprc() + "]");
		System.out.println("atic_fee = [" + getAtic_fee() + "]");
		System.out.println("incm_clsf_cd = [" + getIncm_clsf_cd() + "]");
		System.out.println("incm_tax = [" + getIncm_tax() + "]");
		System.out.println("res_tax = [" + getRes_tax() + "]");
		System.out.println("coms = [" + getComs() + "]");
		System.out.println("atic_nm = [" + getAtic_nm() + "]");
		System.out.println("with_tax = [" + getWith_tax() + "]");
		System.out.println("pubc_side = [" + getPubc_side() + "]");
		System.out.println("cal_pay_amt = [" + getCal_pay_amt() + "]");
		System.out.println("bank_clsf = [" + getBank_clsf() + "]");
		System.out.println("acct_no = [" + getAcct_no() + "]");
		System.out.println("deps_pers_nm = [" + getDeps_pers_nm() + "]");
		System.out.println("dtls_medi_cd = [" + getDtls_medi_cd() + "]");
		System.out.println("adpay_expn_no = [" + getAdpay_expn_no() + "]");
		System.out.println("end_yn = [" + getEnd_yn() + "]");
		System.out.println("draft_doc_no = [" + getDraft_doc_no() + "]");
		System.out.println("draft_doc_dept_cd = [" + getDraft_doc_dept_cd() + "]");
		System.out.println("draft_expn_amt = [" + getDraft_expn_amt() + "]");
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
String clam_dept_cd = req.getParameter("clam_dept_cd");
if( clam_dept_cd == null){
	System.out.println(this.toString+" : clam_dept_cd is null" );
}else{
	System.out.println(this.toString+" : clam_dept_cd is "+clam_dept_cd );
}
String clam_amt = req.getParameter("clam_amt");
if( clam_amt == null){
	System.out.println(this.toString+" : clam_amt is null" );
}else{
	System.out.println(this.toString+" : clam_amt is "+clam_amt );
}
String titl = req.getParameter("titl");
if( titl == null){
	System.out.println(this.toString+" : titl is null" );
}else{
	System.out.println(this.toString+" : titl is "+titl );
}
String medi_cd = req.getParameter("medi_cd");
if( medi_cd == null){
	System.out.println(this.toString+" : medi_cd is null" );
}else{
	System.out.println(this.toString+" : medi_cd is "+medi_cd );
}
String cost_clsf = req.getParameter("cost_clsf");
if( cost_clsf == null){
	System.out.println(this.toString+" : cost_clsf is null" );
}else{
	System.out.println(this.toString+" : cost_clsf is "+cost_clsf );
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
String budg_cd = req.getParameter("budg_cd");
if( budg_cd == null){
	System.out.println(this.toString+" : budg_cd is null" );
}else{
	System.out.println(this.toString+" : budg_cd is "+budg_cd );
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
String old_dlco_clsf_cd = req.getParameter("old_dlco_clsf_cd");
if( old_dlco_clsf_cd == null){
	System.out.println(this.toString+" : old_dlco_clsf_cd is null" );
}else{
	System.out.println(this.toString+" : old_dlco_clsf_cd is "+old_dlco_clsf_cd );
}
String old_dlco_cd = req.getParameter("old_dlco_cd");
if( old_dlco_cd == null){
	System.out.println(this.toString+" : old_dlco_cd is null" );
}else{
	System.out.println(this.toString+" : old_dlco_cd is "+old_dlco_cd );
}
String pch_compnm = req.getParameter("pch_compnm");
if( pch_compnm == null){
	System.out.println(this.toString+" : pch_compnm is null" );
}else{
	System.out.println(this.toString+" : pch_compnm is "+pch_compnm );
}
String pubc_dt = req.getParameter("pubc_dt");
if( pubc_dt == null){
	System.out.println(this.toString+" : pubc_dt is null" );
}else{
	System.out.println(this.toString+" : pubc_dt is "+pubc_dt );
}
String nosh = req.getParameter("nosh");
if( nosh == null){
	System.out.println(this.toString+" : nosh is null" );
}else{
	System.out.println(this.toString+" : nosh is "+nosh );
}
String uprc = req.getParameter("uprc");
if( uprc == null){
	System.out.println(this.toString+" : uprc is null" );
}else{
	System.out.println(this.toString+" : uprc is "+uprc );
}
String atic_fee = req.getParameter("atic_fee");
if( atic_fee == null){
	System.out.println(this.toString+" : atic_fee is null" );
}else{
	System.out.println(this.toString+" : atic_fee is "+atic_fee );
}
String incm_clsf_cd = req.getParameter("incm_clsf_cd");
if( incm_clsf_cd == null){
	System.out.println(this.toString+" : incm_clsf_cd is null" );
}else{
	System.out.println(this.toString+" : incm_clsf_cd is "+incm_clsf_cd );
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
String coms = req.getParameter("coms");
if( coms == null){
	System.out.println(this.toString+" : coms is null" );
}else{
	System.out.println(this.toString+" : coms is "+coms );
}
String atic_nm = req.getParameter("atic_nm");
if( atic_nm == null){
	System.out.println(this.toString+" : atic_nm is null" );
}else{
	System.out.println(this.toString+" : atic_nm is "+atic_nm );
}
String with_tax = req.getParameter("with_tax");
if( with_tax == null){
	System.out.println(this.toString+" : with_tax is null" );
}else{
	System.out.println(this.toString+" : with_tax is "+with_tax );
}
String pubc_side = req.getParameter("pubc_side");
if( pubc_side == null){
	System.out.println(this.toString+" : pubc_side is null" );
}else{
	System.out.println(this.toString+" : pubc_side is "+pubc_side );
}
String cal_pay_amt = req.getParameter("cal_pay_amt");
if( cal_pay_amt == null){
	System.out.println(this.toString+" : cal_pay_amt is null" );
}else{
	System.out.println(this.toString+" : cal_pay_amt is "+cal_pay_amt );
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
String dtls_medi_cd = req.getParameter("dtls_medi_cd");
if( dtls_medi_cd == null){
	System.out.println(this.toString+" : dtls_medi_cd is null" );
}else{
	System.out.println(this.toString+" : dtls_medi_cd is "+dtls_medi_cd );
}
String adpay_expn_no = req.getParameter("adpay_expn_no");
if( adpay_expn_no == null){
	System.out.println(this.toString+" : adpay_expn_no is null" );
}else{
	System.out.println(this.toString+" : adpay_expn_no is "+adpay_expn_no );
}
String end_yn = req.getParameter("end_yn");
if( end_yn == null){
	System.out.println(this.toString+" : end_yn is null" );
}else{
	System.out.println(this.toString+" : end_yn is "+end_yn );
}
String draft_doc_no = req.getParameter("draft_doc_no");
if( draft_doc_no == null){
	System.out.println(this.toString+" : draft_doc_no is null" );
}else{
	System.out.println(this.toString+" : draft_doc_no is "+draft_doc_no );
}
String draft_doc_dept_cd = req.getParameter("draft_doc_dept_cd");
if( draft_doc_dept_cd == null){
	System.out.println(this.toString+" : draft_doc_dept_cd is null" );
}else{
	System.out.println(this.toString+" : draft_doc_dept_cd is "+draft_doc_dept_cd );
}
String draft_expn_amt = req.getParameter("draft_expn_amt");
if( draft_expn_amt == null){
	System.out.println(this.toString+" : draft_expn_amt is null" );
}else{
	System.out.println(this.toString+" : draft_expn_amt is "+draft_expn_amt );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String slip_occr_dt = Util.checkString(req.getParameter("slip_occr_dt"));
String slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
String slip_seq = Util.checkString(req.getParameter("slip_seq"));
String clam_dept_cd = Util.checkString(req.getParameter("clam_dept_cd"));
String clam_amt = Util.checkString(req.getParameter("clam_amt"));
String titl = Util.checkString(req.getParameter("titl"));
String medi_cd = Util.checkString(req.getParameter("medi_cd"));
String cost_clsf = Util.checkString(req.getParameter("cost_clsf"));
String budg_yymm = Util.checkString(req.getParameter("budg_yymm"));
String chrg_emp_no = Util.checkString(req.getParameter("chrg_emp_no"));
String budg_cd = Util.checkString(req.getParameter("budg_cd"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
String old_dlco_clsf_cd = Util.checkString(req.getParameter("old_dlco_clsf_cd"));
String old_dlco_cd = Util.checkString(req.getParameter("old_dlco_cd"));
String pch_compnm = Util.checkString(req.getParameter("pch_compnm"));
String pubc_dt = Util.checkString(req.getParameter("pubc_dt"));
String nosh = Util.checkString(req.getParameter("nosh"));
String uprc = Util.checkString(req.getParameter("uprc"));
String atic_fee = Util.checkString(req.getParameter("atic_fee"));
String incm_clsf_cd = Util.checkString(req.getParameter("incm_clsf_cd"));
String incm_tax = Util.checkString(req.getParameter("incm_tax"));
String res_tax = Util.checkString(req.getParameter("res_tax"));
String coms = Util.checkString(req.getParameter("coms"));
String atic_nm = Util.checkString(req.getParameter("atic_nm"));
String with_tax = Util.checkString(req.getParameter("with_tax"));
String pubc_side = Util.checkString(req.getParameter("pubc_side"));
String cal_pay_amt = Util.checkString(req.getParameter("cal_pay_amt"));
String bank_clsf = Util.checkString(req.getParameter("bank_clsf"));
String acct_no = Util.checkString(req.getParameter("acct_no"));
String deps_pers_nm = Util.checkString(req.getParameter("deps_pers_nm"));
String dtls_medi_cd = Util.checkString(req.getParameter("dtls_medi_cd"));
String adpay_expn_no = Util.checkString(req.getParameter("adpay_expn_no"));
String end_yn = Util.checkString(req.getParameter("end_yn"));
String draft_doc_no = Util.checkString(req.getParameter("draft_doc_no"));
String draft_doc_dept_cd = Util.checkString(req.getParameter("draft_doc_dept_cd"));
String draft_expn_amt = Util.checkString(req.getParameter("draft_expn_amt"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String slip_occr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_occr_dt")));
String slip_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_clsf_cd")));
String slip_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_seq")));
String clam_dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("clam_dept_cd")));
String clam_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("clam_amt")));
String titl = Util.Uni2Ksc(Util.checkString(req.getParameter("titl")));
String medi_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_cd")));
String cost_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("cost_clsf")));
String budg_yymm = Util.Uni2Ksc(Util.checkString(req.getParameter("budg_yymm")));
String chrg_emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("chrg_emp_no")));
String budg_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("budg_cd")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String incmg_pers_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipadd")));
String old_dlco_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("old_dlco_clsf_cd")));
String old_dlco_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("old_dlco_cd")));
String pch_compnm = Util.Uni2Ksc(Util.checkString(req.getParameter("pch_compnm")));
String pubc_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("pubc_dt")));
String nosh = Util.Uni2Ksc(Util.checkString(req.getParameter("nosh")));
String uprc = Util.Uni2Ksc(Util.checkString(req.getParameter("uprc")));
String atic_fee = Util.Uni2Ksc(Util.checkString(req.getParameter("atic_fee")));
String incm_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("incm_clsf_cd")));
String incm_tax = Util.Uni2Ksc(Util.checkString(req.getParameter("incm_tax")));
String res_tax = Util.Uni2Ksc(Util.checkString(req.getParameter("res_tax")));
String coms = Util.Uni2Ksc(Util.checkString(req.getParameter("coms")));
String atic_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("atic_nm")));
String with_tax = Util.Uni2Ksc(Util.checkString(req.getParameter("with_tax")));
String pubc_side = Util.Uni2Ksc(Util.checkString(req.getParameter("pubc_side")));
String cal_pay_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("cal_pay_amt")));
String bank_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("bank_clsf")));
String acct_no = Util.Uni2Ksc(Util.checkString(req.getParameter("acct_no")));
String deps_pers_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("deps_pers_nm")));
String dtls_medi_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dtls_medi_cd")));
String adpay_expn_no = Util.Uni2Ksc(Util.checkString(req.getParameter("adpay_expn_no")));
String end_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("end_yn")));
String draft_doc_no = Util.Uni2Ksc(Util.checkString(req.getParameter("draft_doc_no")));
String draft_doc_dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("draft_doc_dept_cd")));
String draft_expn_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("draft_expn_amt")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setSlip_occr_dt(slip_occr_dt);
dm.setSlip_clsf_cd(slip_clsf_cd);
dm.setSlip_seq(slip_seq);
dm.setClam_dept_cd(clam_dept_cd);
dm.setClam_amt(clam_amt);
dm.setTitl(titl);
dm.setMedi_cd(medi_cd);
dm.setCost_clsf(cost_clsf);
dm.setBudg_yymm(budg_yymm);
dm.setChrg_emp_no(chrg_emp_no);
dm.setBudg_cd(budg_cd);
dm.setIncmg_pers(incmg_pers);
dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
dm.setOld_dlco_clsf_cd(old_dlco_clsf_cd);
dm.setOld_dlco_cd(old_dlco_cd);
dm.setPch_compnm(pch_compnm);
dm.setPubc_dt(pubc_dt);
dm.setNosh(nosh);
dm.setUprc(uprc);
dm.setAtic_fee(atic_fee);
dm.setIncm_clsf_cd(incm_clsf_cd);
dm.setIncm_tax(incm_tax);
dm.setRes_tax(res_tax);
dm.setComs(coms);
dm.setAtic_nm(atic_nm);
dm.setWith_tax(with_tax);
dm.setPubc_side(pubc_side);
dm.setCal_pay_amt(cal_pay_amt);
dm.setBank_clsf(bank_clsf);
dm.setAcct_no(acct_no);
dm.setDeps_pers_nm(deps_pers_nm);
dm.setDtls_medi_cd(dtls_medi_cd);
dm.setAdpay_expn_no(adpay_expn_no);
dm.setEnd_yn(end_yn);
dm.setDraft_doc_no(draft_doc_no);
dm.setDraft_doc_dept_cd(draft_doc_dept_cd);
dm.setDraft_expn_amt(draft_expn_amt);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Jul 09 17:49:30 KST 2009 */
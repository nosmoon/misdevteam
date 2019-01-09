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


public class FC_ACCT_2132_IDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String prof_type_cd;
	public String slip_clsf_cd;
	public String slip_occr_dt;
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
	public String rcpt_nosh;
	public String budg_cd;
	public String ask_emp_no;
	public String ask_dept_cd;
	public String rcpm_plan_dt;
	public String item2;
	public String slip_rcpm_dt;
	public String rcpm_sub_seq;
	public String budg_cd2;
	public String rcpm_amt;
	public String rcpm_dt;
	public String deps_psbk;
	public String coms;
	public String rcpm_pers_nm;
	public String gtieeno;
	public String gtibankcd;
	public String medi_cd;
	public String chg_pers;
	public String incmg_pers_ipadd;

	public FC_ACCT_2132_IDM(){}
	public FC_ACCT_2132_IDM(String cmpy_cd, String prof_type_cd, String slip_clsf_cd, String slip_occr_dt, String make_dt, String erplace_cd, String dlco_clsf_cd, String dlco_cd, String deal_clsf, String ern, String dlco_nm, String presi_nm, String addr, String bizcond, String item, String evnt_cd, String suply_amt, String vat_amt, String tax_stmt_aprv_yn, String rcpt_nosh, String budg_cd, String ask_emp_no, String ask_dept_cd, String rcpm_plan_dt, String item2, String slip_rcpm_dt, String rcpm_sub_seq, String budg_cd2, String rcpm_amt, String rcpm_dt, String deps_psbk, String coms, String rcpm_pers_nm, String gtieeno, String gtibankcd, String medi_cd, String chg_pers, String incmg_pers_ipadd){
		this.cmpy_cd = cmpy_cd;
		this.prof_type_cd = prof_type_cd;
		this.slip_clsf_cd = slip_clsf_cd;
		this.slip_occr_dt = slip_occr_dt;
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
		this.rcpt_nosh = rcpt_nosh;
		this.budg_cd = budg_cd;
		this.ask_emp_no = ask_emp_no;
		this.ask_dept_cd = ask_dept_cd;
		this.rcpm_plan_dt = rcpm_plan_dt;
		this.item2 = item2;
		this.slip_rcpm_dt = slip_rcpm_dt;
		this.rcpm_sub_seq = rcpm_sub_seq;
		this.budg_cd2 = budg_cd2;
		this.rcpm_amt = rcpm_amt;
		this.rcpm_dt = rcpm_dt;
		this.deps_psbk = deps_psbk;
		this.coms = coms;
		this.rcpm_pers_nm = rcpm_pers_nm;
		this.gtieeno = gtieeno;
		this.gtibankcd = gtibankcd;
		this.medi_cd = medi_cd;
		this.chg_pers = chg_pers;
		this.incmg_pers_ipadd = incmg_pers_ipadd;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
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

	public void setRcpt_nosh(String rcpt_nosh){
		this.rcpt_nosh = rcpt_nosh;
	}

	public void setBudg_cd(String budg_cd){
		this.budg_cd = budg_cd;
	}

	public void setAsk_emp_no(String ask_emp_no){
		this.ask_emp_no = ask_emp_no;
	}

	public void setAsk_dept_cd(String ask_dept_cd){
		this.ask_dept_cd = ask_dept_cd;
	}

	public void setRcpm_plan_dt(String rcpm_plan_dt){
		this.rcpm_plan_dt = rcpm_plan_dt;
	}

	public void setItem2(String item2){
		this.item2 = item2;
	}

	public void setSlip_rcpm_dt(String slip_rcpm_dt){
		this.slip_rcpm_dt = slip_rcpm_dt;
	}

	public void setRcpm_sub_seq(String rcpm_sub_seq){
		this.rcpm_sub_seq = rcpm_sub_seq;
	}

	public void setBudg_cd2(String budg_cd2){
		this.budg_cd2 = budg_cd2;
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

	public void setGtieeno(String gtieeno){
		this.gtieeno = gtieeno;
	}

	public void setGtibankcd(String gtibankcd){
		this.gtibankcd = gtibankcd;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setChg_pers(String chg_pers){
		this.chg_pers = chg_pers;
	}

	public void setIncmg_pers_ipadd(String incmg_pers_ipadd){
		this.incmg_pers_ipadd = incmg_pers_ipadd;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
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

	public String getRcpt_nosh(){
		return this.rcpt_nosh;
	}

	public String getBudg_cd(){
		return this.budg_cd;
	}

	public String getAsk_emp_no(){
		return this.ask_emp_no;
	}

	public String getAsk_dept_cd(){
		return this.ask_dept_cd;
	}

	public String getRcpm_plan_dt(){
		return this.rcpm_plan_dt;
	}

	public String getItem2(){
		return this.item2;
	}

	public String getSlip_rcpm_dt(){
		return this.slip_rcpm_dt;
	}

	public String getRcpm_sub_seq(){
		return this.rcpm_sub_seq;
	}

	public String getBudg_cd2(){
		return this.budg_cd2;
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

	public String getGtieeno(){
		return this.gtieeno;
	}

	public String getGtibankcd(){
		return this.gtibankcd;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getChg_pers(){
		return this.chg_pers;
	}

	public String getIncmg_pers_ipadd(){
		return this.incmg_pers_ipadd;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_FC_ACCT_2132_I(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		FC_ACCT_2132_IDM dm = (FC_ACCT_2132_IDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.prof_type_cd);
		cstmt.setString(5, dm.slip_clsf_cd);
		cstmt.setString(6, dm.slip_occr_dt);
		cstmt.setString(7, dm.make_dt);
		cstmt.setString(8, dm.erplace_cd);
		cstmt.setString(9, dm.dlco_clsf_cd);
		cstmt.setString(10, dm.dlco_cd);
		cstmt.setString(11, dm.deal_clsf);
		cstmt.setString(12, dm.ern);
		cstmt.setString(13, dm.dlco_nm);
		cstmt.setString(14, dm.presi_nm);
		cstmt.setString(15, dm.addr);
		cstmt.setString(16, dm.bizcond);
		cstmt.setString(17, dm.item);
		cstmt.setString(18, dm.evnt_cd);
		cstmt.setString(19, dm.suply_amt);
		cstmt.setString(20, dm.vat_amt);
		cstmt.setString(21, dm.tax_stmt_aprv_yn);
		cstmt.setString(22, dm.rcpt_nosh);
		cstmt.setString(23, dm.budg_cd);
		cstmt.setString(24, dm.ask_emp_no);
		cstmt.setString(25, dm.ask_dept_cd);
		cstmt.setString(26, dm.rcpm_plan_dt);
		cstmt.setString(27, dm.item2);
		cstmt.setString(28, dm.slip_rcpm_dt);
		cstmt.setString(29, dm.rcpm_sub_seq);
		cstmt.setString(30, dm.budg_cd2);
		cstmt.setString(31, dm.rcpm_amt);
		cstmt.setString(32, dm.rcpm_dt);
		cstmt.setString(33, dm.deps_psbk);
		cstmt.setString(34, dm.coms);
		cstmt.setString(35, dm.rcpm_pers_nm);
		cstmt.setString(36, dm.gtieeno);
		cstmt.setString(37, dm.gtibankcd);
		cstmt.setString(38, dm.medi_cd);
		cstmt.setString(39, dm.chg_pers);
		cstmt.setString(40, dm.incmg_pers_ipadd);
		cstmt.registerOutParameter(41, Types.VARCHAR);
		cstmt.registerOutParameter(42, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.fc.acct.ds.FC_ACCT_2132_IDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("prof_type_cd = [" + getProf_type_cd() + "]");
		System.out.println("slip_clsf_cd = [" + getSlip_clsf_cd() + "]");
		System.out.println("slip_occr_dt = [" + getSlip_occr_dt() + "]");
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
		System.out.println("rcpt_nosh = [" + getRcpt_nosh() + "]");
		System.out.println("budg_cd = [" + getBudg_cd() + "]");
		System.out.println("ask_emp_no = [" + getAsk_emp_no() + "]");
		System.out.println("ask_dept_cd = [" + getAsk_dept_cd() + "]");
		System.out.println("rcpm_plan_dt = [" + getRcpm_plan_dt() + "]");
		System.out.println("item2 = [" + getItem2() + "]");
		System.out.println("slip_rcpm_dt = [" + getSlip_rcpm_dt() + "]");
		System.out.println("rcpm_sub_seq = [" + getRcpm_sub_seq() + "]");
		System.out.println("budg_cd2 = [" + getBudg_cd2() + "]");
		System.out.println("rcpm_amt = [" + getRcpm_amt() + "]");
		System.out.println("rcpm_dt = [" + getRcpm_dt() + "]");
		System.out.println("deps_psbk = [" + getDeps_psbk() + "]");
		System.out.println("coms = [" + getComs() + "]");
		System.out.println("rcpm_pers_nm = [" + getRcpm_pers_nm() + "]");
		System.out.println("gtieeno = [" + getGtieeno() + "]");
		System.out.println("gtibankcd = [" + getGtibankcd() + "]");
		System.out.println("medi_cd = [" + getMedi_cd() + "]");
		System.out.println("chg_pers = [" + getChg_pers() + "]");
		System.out.println("incmg_pers_ipadd = [" + getIncmg_pers_ipadd() + "]");
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
String rcpt_nosh = req.getParameter("rcpt_nosh");
if( rcpt_nosh == null){
	System.out.println(this.toString+" : rcpt_nosh is null" );
}else{
	System.out.println(this.toString+" : rcpt_nosh is "+rcpt_nosh );
}
String budg_cd = req.getParameter("budg_cd");
if( budg_cd == null){
	System.out.println(this.toString+" : budg_cd is null" );
}else{
	System.out.println(this.toString+" : budg_cd is "+budg_cd );
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
String rcpm_plan_dt = req.getParameter("rcpm_plan_dt");
if( rcpm_plan_dt == null){
	System.out.println(this.toString+" : rcpm_plan_dt is null" );
}else{
	System.out.println(this.toString+" : rcpm_plan_dt is "+rcpm_plan_dt );
}
String item2 = req.getParameter("item2");
if( item2 == null){
	System.out.println(this.toString+" : item2 is null" );
}else{
	System.out.println(this.toString+" : item2 is "+item2 );
}
String slip_rcpm_dt = req.getParameter("slip_rcpm_dt");
if( slip_rcpm_dt == null){
	System.out.println(this.toString+" : slip_rcpm_dt is null" );
}else{
	System.out.println(this.toString+" : slip_rcpm_dt is "+slip_rcpm_dt );
}
String rcpm_sub_seq = req.getParameter("rcpm_sub_seq");
if( rcpm_sub_seq == null){
	System.out.println(this.toString+" : rcpm_sub_seq is null" );
}else{
	System.out.println(this.toString+" : rcpm_sub_seq is "+rcpm_sub_seq );
}
String budg_cd2 = req.getParameter("budg_cd2");
if( budg_cd2 == null){
	System.out.println(this.toString+" : budg_cd2 is null" );
}else{
	System.out.println(this.toString+" : budg_cd2 is "+budg_cd2 );
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
String gtieeno = req.getParameter("gtieeno");
if( gtieeno == null){
	System.out.println(this.toString+" : gtieeno is null" );
}else{
	System.out.println(this.toString+" : gtieeno is "+gtieeno );
}
String gtibankcd = req.getParameter("gtibankcd");
if( gtibankcd == null){
	System.out.println(this.toString+" : gtibankcd is null" );
}else{
	System.out.println(this.toString+" : gtibankcd is "+gtibankcd );
}
String medi_cd = req.getParameter("medi_cd");
if( medi_cd == null){
	System.out.println(this.toString+" : medi_cd is null" );
}else{
	System.out.println(this.toString+" : medi_cd is "+medi_cd );
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
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String prof_type_cd = Util.checkString(req.getParameter("prof_type_cd"));
String slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
String slip_occr_dt = Util.checkString(req.getParameter("slip_occr_dt"));
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
String rcpt_nosh = Util.checkString(req.getParameter("rcpt_nosh"));
String budg_cd = Util.checkString(req.getParameter("budg_cd"));
String ask_emp_no = Util.checkString(req.getParameter("ask_emp_no"));
String ask_dept_cd = Util.checkString(req.getParameter("ask_dept_cd"));
String rcpm_plan_dt = Util.checkString(req.getParameter("rcpm_plan_dt"));
String item2 = Util.checkString(req.getParameter("item2"));
String slip_rcpm_dt = Util.checkString(req.getParameter("slip_rcpm_dt"));
String rcpm_sub_seq = Util.checkString(req.getParameter("rcpm_sub_seq"));
String budg_cd2 = Util.checkString(req.getParameter("budg_cd2"));
String rcpm_amt = Util.checkString(req.getParameter("rcpm_amt"));
String rcpm_dt = Util.checkString(req.getParameter("rcpm_dt"));
String deps_psbk = Util.checkString(req.getParameter("deps_psbk"));
String coms = Util.checkString(req.getParameter("coms"));
String rcpm_pers_nm = Util.checkString(req.getParameter("rcpm_pers_nm"));
String gtieeno = Util.checkString(req.getParameter("gtieeno"));
String gtibankcd = Util.checkString(req.getParameter("gtibankcd"));
String medi_cd = Util.checkString(req.getParameter("medi_cd"));
String chg_pers = Util.checkString(req.getParameter("chg_pers"));
String incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String prof_type_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("prof_type_cd")));
String slip_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_clsf_cd")));
String slip_occr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_occr_dt")));
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
String rcpt_nosh = Util.Uni2Ksc(Util.checkString(req.getParameter("rcpt_nosh")));
String budg_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("budg_cd")));
String ask_emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("ask_emp_no")));
String ask_dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("ask_dept_cd")));
String rcpm_plan_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("rcpm_plan_dt")));
String item2 = Util.Uni2Ksc(Util.checkString(req.getParameter("item2")));
String slip_rcpm_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_rcpm_dt")));
String rcpm_sub_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("rcpm_sub_seq")));
String budg_cd2 = Util.Uni2Ksc(Util.checkString(req.getParameter("budg_cd2")));
String rcpm_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("rcpm_amt")));
String rcpm_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("rcpm_dt")));
String deps_psbk = Util.Uni2Ksc(Util.checkString(req.getParameter("deps_psbk")));
String coms = Util.Uni2Ksc(Util.checkString(req.getParameter("coms")));
String rcpm_pers_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("rcpm_pers_nm")));
String gtieeno = Util.Uni2Ksc(Util.checkString(req.getParameter("gtieeno")));
String gtibankcd = Util.Uni2Ksc(Util.checkString(req.getParameter("gtibankcd")));
String medi_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_cd")));
String chg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("chg_pers")));
String incmg_pers_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipadd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setProf_type_cd(prof_type_cd);
dm.setSlip_clsf_cd(slip_clsf_cd);
dm.setSlip_occr_dt(slip_occr_dt);
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
dm.setRcpt_nosh(rcpt_nosh);
dm.setBudg_cd(budg_cd);
dm.setAsk_emp_no(ask_emp_no);
dm.setAsk_dept_cd(ask_dept_cd);
dm.setRcpm_plan_dt(rcpm_plan_dt);
dm.setItem2(item2);
dm.setSlip_rcpm_dt(slip_rcpm_dt);
dm.setRcpm_sub_seq(rcpm_sub_seq);
dm.setBudg_cd2(budg_cd2);
dm.setRcpm_amt(rcpm_amt);
dm.setRcpm_dt(rcpm_dt);
dm.setDeps_psbk(deps_psbk);
dm.setComs(coms);
dm.setRcpm_pers_nm(rcpm_pers_nm);
dm.setGtieeno(gtieeno);
dm.setGtibankcd(gtibankcd);
dm.setMedi_cd(medi_cd);
dm.setChg_pers(chg_pers);
dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Jun 16 11:17:07 KST 2009 */
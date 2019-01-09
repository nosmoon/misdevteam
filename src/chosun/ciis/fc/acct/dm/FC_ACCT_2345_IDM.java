/***************************************************************************************************
* 파일명 : .java
* 기능 :  전표관리 - 전표승인관리 - 공통지출결의 승인처리
* 작성일자 : 2011-07-12
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
 * 전표관리 - 전표승인관리 - 공통지출결의 승인처리
 */

public class FC_ACCT_2345_IDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String slip_occr_dt;
	public String slip_clsf_cd;
	public String slip_seq;
	public String slip_sub_seq;
	public String incmg_emp_no;
	public String hjpdacntcymd;
	public String hjpjacntcymd;
	public String chg_pers;
	public String incmg_pers_ipadd;
	public String hjpdsyscd;
	public String mang_clsf_cd;
	public String hjnjcgb;
	public String rmks1;
	public String in_sicsgb;
	public String pch_jwdwgb;
	public String slip_arow_no;
	public String pch_jbtype;
	public String dr_amt;
	public String dlco_clsf_cd;
	public String dlco_cd;
	public String dlco_nm;
	public String tax_stmt_no;
	public String pch_vat;
	public String budg_cd;
	public String use_dept_cd;
	public String pch_sgchk;
	public String pch_buseonm;
	public String incm_clsf_cd;
	public String incmg_dt;
	public String etc_in;
	public String boks_dlco_nm;
	public String prt_no;
	public String rmks2;
	public String draft_doc_no;
	public String draft_dept_cd;
	public String draft_expn_amt;
	public String current_clsf;
	public String biz_reg_no;
	public String bank_id;
	public String acct_num;
	public String tran_date;
	public String tran_date_seq;
	public String tran_amt;
	public String acct_mang_no;
	public String tran_content;
	public String acct_tonghwa;
	public String frex_amt;

	public FC_ACCT_2345_IDM(){}
	public FC_ACCT_2345_IDM(String cmpy_cd, String slip_occr_dt, String slip_clsf_cd, String slip_seq, String slip_sub_seq, String incmg_emp_no, String hjpdacntcymd, String hjpjacntcymd, String chg_pers, String incmg_pers_ipadd, String hjpdsyscd, String mang_clsf_cd, String hjnjcgb, String rmks1, String in_sicsgb, String pch_jwdwgb, String slip_arow_no, String pch_jbtype, String dr_amt, String dlco_clsf_cd, String dlco_cd, String dlco_nm, String tax_stmt_no, String pch_vat, String budg_cd, String use_dept_cd, String pch_sgchk, String pch_buseonm, String incm_clsf_cd, String incmg_dt, String etc_in, String boks_dlco_nm, String prt_no, String rmks2, String draft_doc_no, String draft_dept_cd, String draft_expn_amt, String current_clsf, String biz_reg_no, String bank_id, String acct_num, String tran_date, String tran_date_seq, String tran_amt, String acct_mang_no, String tran_content, String acct_tonghwa, String frex_amt){
		this.cmpy_cd = cmpy_cd;
		this.slip_occr_dt = slip_occr_dt;
		this.slip_clsf_cd = slip_clsf_cd;
		this.slip_seq = slip_seq;
		this.slip_sub_seq = slip_sub_seq;
		this.incmg_emp_no = incmg_emp_no;
		this.hjpdacntcymd = hjpdacntcymd;
		this.hjpjacntcymd = hjpjacntcymd;
		this.chg_pers = chg_pers;
		this.incmg_pers_ipadd = incmg_pers_ipadd;
		this.hjpdsyscd = hjpdsyscd;
		this.mang_clsf_cd = mang_clsf_cd;
		this.hjnjcgb = hjnjcgb;
		this.rmks1 = rmks1;
		this.in_sicsgb = in_sicsgb;
		this.pch_jwdwgb = pch_jwdwgb;
		this.slip_arow_no = slip_arow_no;
		this.pch_jbtype = pch_jbtype;
		this.dr_amt = dr_amt;
		this.dlco_clsf_cd = dlco_clsf_cd;
		this.dlco_cd = dlco_cd;
		this.dlco_nm = dlco_nm;
		this.tax_stmt_no = tax_stmt_no;
		this.pch_vat = pch_vat;
		this.budg_cd = budg_cd;
		this.use_dept_cd = use_dept_cd;
		this.pch_sgchk = pch_sgchk;
		this.pch_buseonm = pch_buseonm;
		this.incm_clsf_cd = incm_clsf_cd;
		this.incmg_dt = incmg_dt;
		this.etc_in = etc_in;
		this.boks_dlco_nm = boks_dlco_nm;
		this.prt_no = prt_no;
		this.rmks2 = rmks2;
		this.draft_doc_no = draft_doc_no;
		this.draft_dept_cd = draft_dept_cd;
		this.draft_expn_amt = draft_expn_amt;
		this.current_clsf = current_clsf;
		this.biz_reg_no = biz_reg_no;
		this.bank_id = bank_id;
		this.acct_num = acct_num;
		this.tran_date = tran_date;
		this.tran_date_seq = tran_date_seq;
		this.tran_amt = tran_amt;
		this.acct_mang_no = acct_mang_no;
		this.tran_content = tran_content;
		this.acct_tonghwa = acct_tonghwa;
		this.frex_amt = frex_amt;
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

	public void setSlip_sub_seq(String slip_sub_seq){
		this.slip_sub_seq = slip_sub_seq;
	}

	public void setIncmg_emp_no(String incmg_emp_no){
		this.incmg_emp_no = incmg_emp_no;
	}

	public void setHjpdacntcymd(String hjpdacntcymd){
		this.hjpdacntcymd = hjpdacntcymd;
	}

	public void setHjpjacntcymd(String hjpjacntcymd){
		this.hjpjacntcymd = hjpjacntcymd;
	}

	public void setChg_pers(String chg_pers){
		this.chg_pers = chg_pers;
	}

	public void setIncmg_pers_ipadd(String incmg_pers_ipadd){
		this.incmg_pers_ipadd = incmg_pers_ipadd;
	}

	public void setHjpdsyscd(String hjpdsyscd){
		this.hjpdsyscd = hjpdsyscd;
	}

	public void setMang_clsf_cd(String mang_clsf_cd){
		this.mang_clsf_cd = mang_clsf_cd;
	}

	public void setHjnjcgb(String hjnjcgb){
		this.hjnjcgb = hjnjcgb;
	}

	public void setRmks1(String rmks1){
		this.rmks1 = rmks1;
	}

	public void setIn_sicsgb(String in_sicsgb){
		this.in_sicsgb = in_sicsgb;
	}

	public void setPch_jwdwgb(String pch_jwdwgb){
		this.pch_jwdwgb = pch_jwdwgb;
	}

	public void setSlip_arow_no(String slip_arow_no){
		this.slip_arow_no = slip_arow_no;
	}

	public void setPch_jbtype(String pch_jbtype){
		this.pch_jbtype = pch_jbtype;
	}

	public void setDr_amt(String dr_amt){
		this.dr_amt = dr_amt;
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

	public void setTax_stmt_no(String tax_stmt_no){
		this.tax_stmt_no = tax_stmt_no;
	}

	public void setPch_vat(String pch_vat){
		this.pch_vat = pch_vat;
	}

	public void setBudg_cd(String budg_cd){
		this.budg_cd = budg_cd;
	}

	public void setUse_dept_cd(String use_dept_cd){
		this.use_dept_cd = use_dept_cd;
	}

	public void setPch_sgchk(String pch_sgchk){
		this.pch_sgchk = pch_sgchk;
	}

	public void setPch_buseonm(String pch_buseonm){
		this.pch_buseonm = pch_buseonm;
	}

	public void setIncm_clsf_cd(String incm_clsf_cd){
		this.incm_clsf_cd = incm_clsf_cd;
	}

	public void setIncmg_dt(String incmg_dt){
		this.incmg_dt = incmg_dt;
	}

	public void setEtc_in(String etc_in){
		this.etc_in = etc_in;
	}

	public void setBoks_dlco_nm(String boks_dlco_nm){
		this.boks_dlco_nm = boks_dlco_nm;
	}

	public void setPrt_no(String prt_no){
		this.prt_no = prt_no;
	}

	public void setRmks2(String rmks2){
		this.rmks2 = rmks2;
	}

	public void setDraft_doc_no(String draft_doc_no){
		this.draft_doc_no = draft_doc_no;
	}

	public void setDraft_dept_cd(String draft_dept_cd){
		this.draft_dept_cd = draft_dept_cd;
	}

	public void setDraft_expn_amt(String draft_expn_amt){
		this.draft_expn_amt = draft_expn_amt;
	}

	public void setCurrent_clsf(String current_clsf){
		this.current_clsf = current_clsf;
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

	public void setTran_amt(String tran_amt){
		this.tran_amt = tran_amt;
	}

	public void setAcct_mang_no(String acct_mang_no){
		this.acct_mang_no = acct_mang_no;
	}

	public void setTran_content(String tran_content){
		this.tran_content = tran_content;
	}

	public void setAcct_tonghwa(String acct_tonghwa){
		this.acct_tonghwa = acct_tonghwa;
	}

	public void setFrex_amt(String frex_amt){
		this.frex_amt = frex_amt;
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

	public String getSlip_sub_seq(){
		return this.slip_sub_seq;
	}

	public String getIncmg_emp_no(){
		return this.incmg_emp_no;
	}

	public String getHjpdacntcymd(){
		return this.hjpdacntcymd;
	}

	public String getHjpjacntcymd(){
		return this.hjpjacntcymd;
	}

	public String getChg_pers(){
		return this.chg_pers;
	}

	public String getIncmg_pers_ipadd(){
		return this.incmg_pers_ipadd;
	}

	public String getHjpdsyscd(){
		return this.hjpdsyscd;
	}

	public String getMang_clsf_cd(){
		return this.mang_clsf_cd;
	}

	public String getHjnjcgb(){
		return this.hjnjcgb;
	}

	public String getRmks1(){
		return this.rmks1;
	}

	public String getIn_sicsgb(){
		return this.in_sicsgb;
	}

	public String getPch_jwdwgb(){
		return this.pch_jwdwgb;
	}

	public String getSlip_arow_no(){
		return this.slip_arow_no;
	}

	public String getPch_jbtype(){
		return this.pch_jbtype;
	}

	public String getDr_amt(){
		return this.dr_amt;
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

	public String getTax_stmt_no(){
		return this.tax_stmt_no;
	}

	public String getPch_vat(){
		return this.pch_vat;
	}

	public String getBudg_cd(){
		return this.budg_cd;
	}

	public String getUse_dept_cd(){
		return this.use_dept_cd;
	}

	public String getPch_sgchk(){
		return this.pch_sgchk;
	}

	public String getPch_buseonm(){
		return this.pch_buseonm;
	}

	public String getIncm_clsf_cd(){
		return this.incm_clsf_cd;
	}

	public String getIncmg_dt(){
		return this.incmg_dt;
	}

	public String getEtc_in(){
		return this.etc_in;
	}

	public String getBoks_dlco_nm(){
		return this.boks_dlco_nm;
	}

	public String getPrt_no(){
		return this.prt_no;
	}

	public String getRmks2(){
		return this.rmks2;
	}

	public String getDraft_doc_no(){
		return this.draft_doc_no;
	}

	public String getDraft_dept_cd(){
		return this.draft_dept_cd;
	}

	public String getDraft_expn_amt(){
		return this.draft_expn_amt;
	}

	public String getCurrent_clsf(){
		return this.current_clsf;
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

	public String getTran_amt(){
		return this.tran_amt;
	}

	public String getAcct_mang_no(){
		return this.acct_mang_no;
	}

	public String getTran_content(){
		return this.tran_content;
	}

	public String getAcct_tonghwa(){
		return this.acct_tonghwa;
	}

	public String getFrex_amt(){
		return this.frex_amt;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_FC_ACCT_2345_I(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		FC_ACCT_2345_IDM dm = (FC_ACCT_2345_IDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.slip_occr_dt);
		cstmt.setString(5, dm.slip_clsf_cd);
		cstmt.setString(6, dm.slip_seq);
		cstmt.setString(7, dm.slip_sub_seq);
		cstmt.setString(8, dm.incmg_emp_no);
		cstmt.setString(9, dm.hjpdacntcymd);
		cstmt.setString(10, dm.hjpjacntcymd);
		cstmt.setString(11, dm.chg_pers);
		cstmt.setString(12, dm.incmg_pers_ipadd);
		cstmt.setString(13, dm.hjpdsyscd);
		cstmt.setString(14, dm.mang_clsf_cd);
		cstmt.setString(15, dm.hjnjcgb);
		cstmt.setString(16, dm.rmks1);
		cstmt.setString(17, dm.in_sicsgb);
		cstmt.setString(18, dm.pch_jwdwgb);
		cstmt.setString(19, dm.slip_arow_no);
		cstmt.setString(20, dm.pch_jbtype);
		cstmt.setString(21, dm.dr_amt);
		cstmt.setString(22, dm.dlco_clsf_cd);
		cstmt.setString(23, dm.dlco_cd);
		cstmt.setString(24, dm.dlco_nm);
		cstmt.setString(25, dm.tax_stmt_no);
		cstmt.setString(26, dm.pch_vat);
		cstmt.setString(27, dm.budg_cd);
		cstmt.setString(28, dm.use_dept_cd);
		cstmt.setString(29, dm.pch_sgchk);
		cstmt.setString(30, dm.pch_buseonm);
		cstmt.setString(31, dm.incm_clsf_cd);
		cstmt.setString(32, dm.incmg_dt);
		cstmt.setString(33, dm.etc_in);
		cstmt.setString(34, dm.boks_dlco_nm);
		cstmt.setString(35, dm.prt_no);
		cstmt.setString(36, dm.rmks2);
		cstmt.setString(37, dm.draft_doc_no);
		cstmt.setString(38, dm.draft_dept_cd);
		cstmt.setString(39, dm.draft_expn_amt);
		cstmt.setString(40, dm.current_clsf);
		cstmt.setString(41, dm.biz_reg_no);
		cstmt.setString(42, dm.bank_id);
		cstmt.setString(43, dm.acct_num);
		cstmt.setString(44, dm.tran_date);
		cstmt.setString(45, dm.tran_date_seq);
		cstmt.setString(46, dm.tran_amt);
		cstmt.setString(47, dm.acct_mang_no);
		cstmt.setString(48, dm.tran_content);
		cstmt.setString(49, dm.acct_tonghwa);
		cstmt.setString(50, dm.frex_amt);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.fc.acct.ds.FC_ACCT_2345_IDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("slip_occr_dt = [" + getSlip_occr_dt() + "]");
		System.out.println("slip_clsf_cd = [" + getSlip_clsf_cd() + "]");
		System.out.println("slip_seq = [" + getSlip_seq() + "]");
		System.out.println("slip_sub_seq = [" + getSlip_sub_seq() + "]");
		System.out.println("incmg_emp_no = [" + getIncmg_emp_no() + "]");
		System.out.println("hjpdacntcymd = [" + getHjpdacntcymd() + "]");
		System.out.println("hjpjacntcymd = [" + getHjpjacntcymd() + "]");
		System.out.println("chg_pers = [" + getChg_pers() + "]");
		System.out.println("incmg_pers_ipadd = [" + getIncmg_pers_ipadd() + "]");
		System.out.println("hjpdsyscd = [" + getHjpdsyscd() + "]");
		System.out.println("mang_clsf_cd = [" + getMang_clsf_cd() + "]");
		System.out.println("hjnjcgb = [" + getHjnjcgb() + "]");
		System.out.println("rmks1 = [" + getRmks1() + "]");
		System.out.println("in_sicsgb = [" + getIn_sicsgb() + "]");
		System.out.println("pch_jwdwgb = [" + getPch_jwdwgb() + "]");
		System.out.println("slip_arow_no = [" + getSlip_arow_no() + "]");
		System.out.println("pch_jbtype = [" + getPch_jbtype() + "]");
		System.out.println("dr_amt = [" + getDr_amt() + "]");
		System.out.println("dlco_clsf_cd = [" + getDlco_clsf_cd() + "]");
		System.out.println("dlco_cd = [" + getDlco_cd() + "]");
		System.out.println("dlco_nm = [" + getDlco_nm() + "]");
		System.out.println("tax_stmt_no = [" + getTax_stmt_no() + "]");
		System.out.println("pch_vat = [" + getPch_vat() + "]");
		System.out.println("budg_cd = [" + getBudg_cd() + "]");
		System.out.println("use_dept_cd = [" + getUse_dept_cd() + "]");
		System.out.println("pch_sgchk = [" + getPch_sgchk() + "]");
		System.out.println("pch_buseonm = [" + getPch_buseonm() + "]");
		System.out.println("incm_clsf_cd = [" + getIncm_clsf_cd() + "]");
		System.out.println("incmg_dt = [" + getIncmg_dt() + "]");
		System.out.println("etc_in = [" + getEtc_in() + "]");
		System.out.println("boks_dlco_nm = [" + getBoks_dlco_nm() + "]");
		System.out.println("prt_no = [" + getPrt_no() + "]");
		System.out.println("rmks2 = [" + getRmks2() + "]");
		System.out.println("draft_doc_no = [" + getDraft_doc_no() + "]");
		System.out.println("draft_dept_cd = [" + getDraft_dept_cd() + "]");
		System.out.println("draft_expn_amt = [" + getDraft_expn_amt() + "]");
		System.out.println("current_clsf = [" + getCurrent_clsf() + "]");
		System.out.println("biz_reg_no = [" + getBiz_reg_no() + "]");
		System.out.println("bank_id = [" + getBank_id() + "]");
		System.out.println("acct_num = [" + getAcct_num() + "]");
		System.out.println("tran_date = [" + getTran_date() + "]");
		System.out.println("tran_date_seq = [" + getTran_date_seq() + "]");
		System.out.println("tran_amt = [" + getTran_amt() + "]");
		System.out.println("acct_mang_no = [" + getAcct_mang_no() + "]");
		System.out.println("tran_content = [" + getTran_content() + "]");
		System.out.println("acct_tonghwa = [" + getAcct_tonghwa() + "]");
		System.out.println("frex_amt = [" + getFrex_amt() + "]");
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
String slip_sub_seq = req.getParameter("slip_sub_seq");
if( slip_sub_seq == null){
	System.out.println(this.toString+" : slip_sub_seq is null" );
}else{
	System.out.println(this.toString+" : slip_sub_seq is "+slip_sub_seq );
}
String incmg_emp_no = req.getParameter("incmg_emp_no");
if( incmg_emp_no == null){
	System.out.println(this.toString+" : incmg_emp_no is null" );
}else{
	System.out.println(this.toString+" : incmg_emp_no is "+incmg_emp_no );
}
String hjpdacntcymd = req.getParameter("hjpdacntcymd");
if( hjpdacntcymd == null){
	System.out.println(this.toString+" : hjpdacntcymd is null" );
}else{
	System.out.println(this.toString+" : hjpdacntcymd is "+hjpdacntcymd );
}
String hjpjacntcymd = req.getParameter("hjpjacntcymd");
if( hjpjacntcymd == null){
	System.out.println(this.toString+" : hjpjacntcymd is null" );
}else{
	System.out.println(this.toString+" : hjpjacntcymd is "+hjpjacntcymd );
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
String hjpdsyscd = req.getParameter("hjpdsyscd");
if( hjpdsyscd == null){
	System.out.println(this.toString+" : hjpdsyscd is null" );
}else{
	System.out.println(this.toString+" : hjpdsyscd is "+hjpdsyscd );
}
String mang_clsf_cd = req.getParameter("mang_clsf_cd");
if( mang_clsf_cd == null){
	System.out.println(this.toString+" : mang_clsf_cd is null" );
}else{
	System.out.println(this.toString+" : mang_clsf_cd is "+mang_clsf_cd );
}
String hjnjcgb = req.getParameter("hjnjcgb");
if( hjnjcgb == null){
	System.out.println(this.toString+" : hjnjcgb is null" );
}else{
	System.out.println(this.toString+" : hjnjcgb is "+hjnjcgb );
}
String rmks1 = req.getParameter("rmks1");
if( rmks1 == null){
	System.out.println(this.toString+" : rmks1 is null" );
}else{
	System.out.println(this.toString+" : rmks1 is "+rmks1 );
}
String in_sicsgb = req.getParameter("in_sicsgb");
if( in_sicsgb == null){
	System.out.println(this.toString+" : in_sicsgb is null" );
}else{
	System.out.println(this.toString+" : in_sicsgb is "+in_sicsgb );
}
String pch_jwdwgb = req.getParameter("pch_jwdwgb");
if( pch_jwdwgb == null){
	System.out.println(this.toString+" : pch_jwdwgb is null" );
}else{
	System.out.println(this.toString+" : pch_jwdwgb is "+pch_jwdwgb );
}
String slip_arow_no = req.getParameter("slip_arow_no");
if( slip_arow_no == null){
	System.out.println(this.toString+" : slip_arow_no is null" );
}else{
	System.out.println(this.toString+" : slip_arow_no is "+slip_arow_no );
}
String pch_jbtype = req.getParameter("pch_jbtype");
if( pch_jbtype == null){
	System.out.println(this.toString+" : pch_jbtype is null" );
}else{
	System.out.println(this.toString+" : pch_jbtype is "+pch_jbtype );
}
String dr_amt = req.getParameter("dr_amt");
if( dr_amt == null){
	System.out.println(this.toString+" : dr_amt is null" );
}else{
	System.out.println(this.toString+" : dr_amt is "+dr_amt );
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
String tax_stmt_no = req.getParameter("tax_stmt_no");
if( tax_stmt_no == null){
	System.out.println(this.toString+" : tax_stmt_no is null" );
}else{
	System.out.println(this.toString+" : tax_stmt_no is "+tax_stmt_no );
}
String pch_vat = req.getParameter("pch_vat");
if( pch_vat == null){
	System.out.println(this.toString+" : pch_vat is null" );
}else{
	System.out.println(this.toString+" : pch_vat is "+pch_vat );
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
String pch_sgchk = req.getParameter("pch_sgchk");
if( pch_sgchk == null){
	System.out.println(this.toString+" : pch_sgchk is null" );
}else{
	System.out.println(this.toString+" : pch_sgchk is "+pch_sgchk );
}
String pch_buseonm = req.getParameter("pch_buseonm");
if( pch_buseonm == null){
	System.out.println(this.toString+" : pch_buseonm is null" );
}else{
	System.out.println(this.toString+" : pch_buseonm is "+pch_buseonm );
}
String incm_clsf_cd = req.getParameter("incm_clsf_cd");
if( incm_clsf_cd == null){
	System.out.println(this.toString+" : incm_clsf_cd is null" );
}else{
	System.out.println(this.toString+" : incm_clsf_cd is "+incm_clsf_cd );
}
String incmg_dt = req.getParameter("incmg_dt");
if( incmg_dt == null){
	System.out.println(this.toString+" : incmg_dt is null" );
}else{
	System.out.println(this.toString+" : incmg_dt is "+incmg_dt );
}
String etc_in = req.getParameter("etc_in");
if( etc_in == null){
	System.out.println(this.toString+" : etc_in is null" );
}else{
	System.out.println(this.toString+" : etc_in is "+etc_in );
}
String boks_dlco_nm = req.getParameter("boks_dlco_nm");
if( boks_dlco_nm == null){
	System.out.println(this.toString+" : boks_dlco_nm is null" );
}else{
	System.out.println(this.toString+" : boks_dlco_nm is "+boks_dlco_nm );
}
String prt_no = req.getParameter("prt_no");
if( prt_no == null){
	System.out.println(this.toString+" : prt_no is null" );
}else{
	System.out.println(this.toString+" : prt_no is "+prt_no );
}
String rmks2 = req.getParameter("rmks2");
if( rmks2 == null){
	System.out.println(this.toString+" : rmks2 is null" );
}else{
	System.out.println(this.toString+" : rmks2 is "+rmks2 );
}
String draft_doc_no = req.getParameter("draft_doc_no");
if( draft_doc_no == null){
	System.out.println(this.toString+" : draft_doc_no is null" );
}else{
	System.out.println(this.toString+" : draft_doc_no is "+draft_doc_no );
}
String draft_dept_cd = req.getParameter("draft_dept_cd");
if( draft_dept_cd == null){
	System.out.println(this.toString+" : draft_dept_cd is null" );
}else{
	System.out.println(this.toString+" : draft_dept_cd is "+draft_dept_cd );
}
String draft_expn_amt = req.getParameter("draft_expn_amt");
if( draft_expn_amt == null){
	System.out.println(this.toString+" : draft_expn_amt is null" );
}else{
	System.out.println(this.toString+" : draft_expn_amt is "+draft_expn_amt );
}
String current_clsf = req.getParameter("current_clsf");
if( current_clsf == null){
	System.out.println(this.toString+" : current_clsf is null" );
}else{
	System.out.println(this.toString+" : current_clsf is "+current_clsf );
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
String tran_amt = req.getParameter("tran_amt");
if( tran_amt == null){
	System.out.println(this.toString+" : tran_amt is null" );
}else{
	System.out.println(this.toString+" : tran_amt is "+tran_amt );
}
String acct_mang_no = req.getParameter("acct_mang_no");
if( acct_mang_no == null){
	System.out.println(this.toString+" : acct_mang_no is null" );
}else{
	System.out.println(this.toString+" : acct_mang_no is "+acct_mang_no );
}
String tran_content = req.getParameter("tran_content");
if( tran_content == null){
	System.out.println(this.toString+" : tran_content is null" );
}else{
	System.out.println(this.toString+" : tran_content is "+tran_content );
}
String acct_tonghwa = req.getParameter("acct_tonghwa");
if( acct_tonghwa == null){
	System.out.println(this.toString+" : acct_tonghwa is null" );
}else{
	System.out.println(this.toString+" : acct_tonghwa is "+acct_tonghwa );
}
String frex_amt = req.getParameter("frex_amt");
if( frex_amt == null){
	System.out.println(this.toString+" : frex_amt is null" );
}else{
	System.out.println(this.toString+" : frex_amt is "+frex_amt );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String slip_occr_dt = Util.checkString(req.getParameter("slip_occr_dt"));
String slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
String slip_seq = Util.checkString(req.getParameter("slip_seq"));
String slip_sub_seq = Util.checkString(req.getParameter("slip_sub_seq"));
String incmg_emp_no = Util.checkString(req.getParameter("incmg_emp_no"));
String hjpdacntcymd = Util.checkString(req.getParameter("hjpdacntcymd"));
String hjpjacntcymd = Util.checkString(req.getParameter("hjpjacntcymd"));
String chg_pers = Util.checkString(req.getParameter("chg_pers"));
String incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
String hjpdsyscd = Util.checkString(req.getParameter("hjpdsyscd"));
String mang_clsf_cd = Util.checkString(req.getParameter("mang_clsf_cd"));
String hjnjcgb = Util.checkString(req.getParameter("hjnjcgb"));
String rmks1 = Util.checkString(req.getParameter("rmks1"));
String in_sicsgb = Util.checkString(req.getParameter("in_sicsgb"));
String pch_jwdwgb = Util.checkString(req.getParameter("pch_jwdwgb"));
String slip_arow_no = Util.checkString(req.getParameter("slip_arow_no"));
String pch_jbtype = Util.checkString(req.getParameter("pch_jbtype"));
String dr_amt = Util.checkString(req.getParameter("dr_amt"));
String dlco_clsf_cd = Util.checkString(req.getParameter("dlco_clsf_cd"));
String dlco_cd = Util.checkString(req.getParameter("dlco_cd"));
String dlco_nm = Util.checkString(req.getParameter("dlco_nm"));
String tax_stmt_no = Util.checkString(req.getParameter("tax_stmt_no"));
String pch_vat = Util.checkString(req.getParameter("pch_vat"));
String budg_cd = Util.checkString(req.getParameter("budg_cd"));
String use_dept_cd = Util.checkString(req.getParameter("use_dept_cd"));
String pch_sgchk = Util.checkString(req.getParameter("pch_sgchk"));
String pch_buseonm = Util.checkString(req.getParameter("pch_buseonm"));
String incm_clsf_cd = Util.checkString(req.getParameter("incm_clsf_cd"));
String incmg_dt = Util.checkString(req.getParameter("incmg_dt"));
String etc_in = Util.checkString(req.getParameter("etc_in"));
String boks_dlco_nm = Util.checkString(req.getParameter("boks_dlco_nm"));
String prt_no = Util.checkString(req.getParameter("prt_no"));
String rmks2 = Util.checkString(req.getParameter("rmks2"));
String draft_doc_no = Util.checkString(req.getParameter("draft_doc_no"));
String draft_dept_cd = Util.checkString(req.getParameter("draft_dept_cd"));
String draft_expn_amt = Util.checkString(req.getParameter("draft_expn_amt"));
String current_clsf = Util.checkString(req.getParameter("current_clsf"));
String biz_reg_no = Util.checkString(req.getParameter("biz_reg_no"));
String bank_id = Util.checkString(req.getParameter("bank_id"));
String acct_num = Util.checkString(req.getParameter("acct_num"));
String tran_date = Util.checkString(req.getParameter("tran_date"));
String tran_date_seq = Util.checkString(req.getParameter("tran_date_seq"));
String tran_amt = Util.checkString(req.getParameter("tran_amt"));
String acct_mang_no = Util.checkString(req.getParameter("acct_mang_no"));
String tran_content = Util.checkString(req.getParameter("tran_content"));
String acct_tonghwa = Util.checkString(req.getParameter("acct_tonghwa"));
String frex_amt = Util.checkString(req.getParameter("frex_amt"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String slip_occr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_occr_dt")));
String slip_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_clsf_cd")));
String slip_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_seq")));
String slip_sub_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_sub_seq")));
String incmg_emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_emp_no")));
String hjpdacntcymd = Util.Uni2Ksc(Util.checkString(req.getParameter("hjpdacntcymd")));
String hjpjacntcymd = Util.Uni2Ksc(Util.checkString(req.getParameter("hjpjacntcymd")));
String chg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("chg_pers")));
String incmg_pers_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipadd")));
String hjpdsyscd = Util.Uni2Ksc(Util.checkString(req.getParameter("hjpdsyscd")));
String mang_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("mang_clsf_cd")));
String hjnjcgb = Util.Uni2Ksc(Util.checkString(req.getParameter("hjnjcgb")));
String rmks1 = Util.Uni2Ksc(Util.checkString(req.getParameter("rmks1")));
String in_sicsgb = Util.Uni2Ksc(Util.checkString(req.getParameter("in_sicsgb")));
String pch_jwdwgb = Util.Uni2Ksc(Util.checkString(req.getParameter("pch_jwdwgb")));
String slip_arow_no = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_arow_no")));
String pch_jbtype = Util.Uni2Ksc(Util.checkString(req.getParameter("pch_jbtype")));
String dr_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("dr_amt")));
String dlco_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_clsf_cd")));
String dlco_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_cd")));
String dlco_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_nm")));
String tax_stmt_no = Util.Uni2Ksc(Util.checkString(req.getParameter("tax_stmt_no")));
String pch_vat = Util.Uni2Ksc(Util.checkString(req.getParameter("pch_vat")));
String budg_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("budg_cd")));
String use_dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("use_dept_cd")));
String pch_sgchk = Util.Uni2Ksc(Util.checkString(req.getParameter("pch_sgchk")));
String pch_buseonm = Util.Uni2Ksc(Util.checkString(req.getParameter("pch_buseonm")));
String incm_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("incm_clsf_cd")));
String incmg_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_dt")));
String etc_in = Util.Uni2Ksc(Util.checkString(req.getParameter("etc_in")));
String boks_dlco_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("boks_dlco_nm")));
String prt_no = Util.Uni2Ksc(Util.checkString(req.getParameter("prt_no")));
String rmks2 = Util.Uni2Ksc(Util.checkString(req.getParameter("rmks2")));
String draft_doc_no = Util.Uni2Ksc(Util.checkString(req.getParameter("draft_doc_no")));
String draft_dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("draft_dept_cd")));
String draft_expn_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("draft_expn_amt")));
String current_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("current_clsf")));
String biz_reg_no = Util.Uni2Ksc(Util.checkString(req.getParameter("biz_reg_no")));
String bank_id = Util.Uni2Ksc(Util.checkString(req.getParameter("bank_id")));
String acct_num = Util.Uni2Ksc(Util.checkString(req.getParameter("acct_num")));
String tran_date = Util.Uni2Ksc(Util.checkString(req.getParameter("tran_date")));
String tran_date_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("tran_date_seq")));
String tran_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("tran_amt")));
String acct_mang_no = Util.Uni2Ksc(Util.checkString(req.getParameter("acct_mang_no")));
String tran_content = Util.Uni2Ksc(Util.checkString(req.getParameter("tran_content")));
String acct_tonghwa = Util.Uni2Ksc(Util.checkString(req.getParameter("acct_tonghwa")));
String frex_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("frex_amt")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setSlip_occr_dt(slip_occr_dt);
dm.setSlip_clsf_cd(slip_clsf_cd);
dm.setSlip_seq(slip_seq);
dm.setSlip_sub_seq(slip_sub_seq);
dm.setIncmg_emp_no(incmg_emp_no);
dm.setHjpdacntcymd(hjpdacntcymd);
dm.setHjpjacntcymd(hjpjacntcymd);
dm.setChg_pers(chg_pers);
dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
dm.setHjpdsyscd(hjpdsyscd);
dm.setMang_clsf_cd(mang_clsf_cd);
dm.setHjnjcgb(hjnjcgb);
dm.setRmks1(rmks1);
dm.setIn_sicsgb(in_sicsgb);
dm.setPch_jwdwgb(pch_jwdwgb);
dm.setSlip_arow_no(slip_arow_no);
dm.setPch_jbtype(pch_jbtype);
dm.setDr_amt(dr_amt);
dm.setDlco_clsf_cd(dlco_clsf_cd);
dm.setDlco_cd(dlco_cd);
dm.setDlco_nm(dlco_nm);
dm.setTax_stmt_no(tax_stmt_no);
dm.setPch_vat(pch_vat);
dm.setBudg_cd(budg_cd);
dm.setUse_dept_cd(use_dept_cd);
dm.setPch_sgchk(pch_sgchk);
dm.setPch_buseonm(pch_buseonm);
dm.setIncm_clsf_cd(incm_clsf_cd);
dm.setIncmg_dt(incmg_dt);
dm.setEtc_in(etc_in);
dm.setBoks_dlco_nm(boks_dlco_nm);
dm.setPrt_no(prt_no);
dm.setRmks2(rmks2);
dm.setDraft_doc_no(draft_doc_no);
dm.setDraft_dept_cd(draft_dept_cd);
dm.setDraft_expn_amt(draft_expn_amt);
dm.setCurrent_clsf(current_clsf);
dm.setBiz_reg_no(biz_reg_no);
dm.setBank_id(bank_id);
dm.setAcct_num(acct_num);
dm.setTran_date(tran_date);
dm.setTran_date_seq(tran_date_seq);
dm.setTran_amt(tran_amt);
dm.setAcct_mang_no(acct_mang_no);
dm.setTran_content(tran_content);
dm.setAcct_tonghwa(acct_tonghwa);
dm.setFrex_amt(frex_amt);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Jul 12 19:15:14 KST 2011 */
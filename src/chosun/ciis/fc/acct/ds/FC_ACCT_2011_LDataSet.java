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


package chosun.ciis.fc.acct.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.fc.acct.dm.*;
import chosun.ciis.fc.acct.rec.*;

/**
 * 
 */


public class FC_ACCT_2011_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist1 = new ArrayList();
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public FC_ACCT_2011_LDataSet(){}
	public FC_ACCT_2011_LDataSet(String errcode, String errmsg){
		this.errcode = errcode;
		this.errmsg = errmsg;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		ResultSet rset0 = (ResultSet) cstmt.getObject(8);
		while(rset0.next()){
			FC_ACCT_2011_LCURLISTRecord rec = new FC_ACCT_2011_LCURLISTRecord();
			rec.titl = Util.checkString(rset0.getString("titl"));
			rec.reso_amt = Util.checkString(rset0.getString("reso_amt"));
			rec.expn_clsf = Util.checkString(rset0.getString("expn_clsf"));
			rec.expn_hope_dt = Util.checkString(rset0.getString("expn_hope_dt"));
			rec.clam_dept_cd = Util.checkString(rset0.getString("clam_dept_cd"));
			rec.budg_yymm = Util.checkString(rset0.getString("budg_yymm"));
			rec.chrg_emp_no = Util.checkString(rset0.getString("chrg_emp_no"));
			rec.evnt_cd = Util.checkString(rset0.getString("evnt_cd"));
			rec.clam_dept_cd_nm = Util.checkString(rset0.getString("clam_dept_cd_nm"));
			rec.chrg_emp_no_nm = Util.checkString(rset0.getString("chrg_emp_no_nm"));
			rec.slip_aprv_yn = Util.checkString(rset0.getString("slip_aprv_yn"));
			rec.fisc_dt = Util.checkString(rset0.getString("fisc_dt"));
			rec.evnt_cd_nm = Util.checkString(rset0.getString("evnt_cd_nm"));
			rec.evnt_cd_seq = Util.checkString(rset0.getString("evnt_cd_seq"));
			rec.draft_doc_no = Util.checkString(rset0.getString("draft_doc_no"));
			rec.draft_doc_dept_cd = Util.checkString(rset0.getString("draft_doc_dept_cd"));
			rec.draft_expn_amt = Util.checkString(rset0.getString("draft_expn_amt"));
			rec.medi_cd = Util.checkString(rset0.getString("medi_cd"));
			rec.medi_cd_nm = Util.checkString(rset0.getString("medi_cd_nm"));
			rec.dtls_medi_cd = Util.checkString(rset0.getString("dtls_medi_cd"));
			rec.dtls_medi_cd_nm = Util.checkString(rset0.getString("dtls_medi_cd_nm"));
			rec.chnl_clsf_cd = Util.checkString(rset0.getString("chnl_clsf_cd"));
			this.curlist.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(9);
		while(rset1.next()){
			FC_ACCT_2011_LCURLIST1Record rec = new FC_ACCT_2011_LCURLIST1Record();
			rec.slip_sub_seq = Util.checkString(rset1.getString("slip_sub_seq"));
			rec.slip_arow_no = Util.checkString(rset1.getString("slip_arow_no"));
			rec.budg_cd = Util.checkString(rset1.getString("budg_cd"));
			rec.drcr_clsf = Util.checkString(rset1.getString("drcr_clsf"));
			rec.dr_amt = Util.checkString(rset1.getString("dr_amt"));
			rec.crdt_amt = Util.checkString(rset1.getString("crdt_amt"));
			rec.dlco_clsf_cd = Util.checkString(rset1.getString("dlco_clsf_cd"));
			rec.dlco_cd = Util.checkString(rset1.getString("dlco_cd"));
			rec.dlco_nm = Util.checkString(rset1.getString("dlco_nm"));
			rec.boks_dlco_nm = Util.checkString(rset1.getString("boks_dlco_nm"));
			rec.mang_clsf_cd = Util.checkString(rset1.getString("mang_clsf_cd"));
			rec.mang_no = Util.checkString(rset1.getString("mang_no"));
			rec.incm_clsf_cd = Util.checkString(rset1.getString("incm_clsf_cd"));
			rec.medi_cd = Util.checkString(rset1.getString("medi_cd"));
			rec.dtls_medi_cd = Util.checkString(rset1.getString("dtls_medi_cd"));
			rec.use_dept_cd = Util.checkString(rset1.getString("use_dept_cd"));
			rec.comp_dt = Util.checkString(rset1.getString("comp_dt"));
			rec.mtry_dt = Util.checkString(rset1.getString("mtry_dt"));
			rec.unit = Util.checkString(rset1.getString("unit"));
			rec.qunt = Util.checkString(rset1.getString("qunt"));
			rec.tax_stmt_no = Util.checkString(rset1.getString("tax_stmt_no"));
			rec.setoff_slip_occr_dt = Util.checkString(rset1.getString("setoff_slip_occr_dt"));
			rec.setoff_slip_clsf_cd = Util.checkString(rset1.getString("setoff_slip_clsf_cd"));
			rec.setoff_slip_seq = Util.checkString(rset1.getString("setoff_slip_seq"));
			rec.setoff_slip_sub_seq = Util.checkString(rset1.getString("setoff_slip_sub_seq"));
			rec.setoff_slip_arow_no = Util.checkString(rset1.getString("setoff_slip_arow_no"));
			rec.etc_in = Util.checkString(rset1.getString("etc_in"));
			rec.rmks2 = Util.checkString(rset1.getString("rmks2"));
			rec.make_dt = Util.checkString(rset1.getString("make_dt"));
			rec.erplace_cd = Util.checkString(rset1.getString("erplace_cd"));
			rec.ern = Util.checkString(rset1.getString("ern"));
			rec.suply_amt = Util.checkString(rset1.getString("suply_amt"));
			rec.vat_amt = Util.checkString(rset1.getString("vat_amt"));
			rec.budg_cd_nm = Util.checkString(rset1.getString("budg_cd_nm"));
			rec.use_dept_cd_nm = Util.checkString(rset1.getString("use_dept_cd_nm"));
			rec.medi_cd_nm = Util.checkString(rset1.getString("medi_cd_nm"));
			rec.dtls_medi_cd_nm = Util.checkString(rset1.getString("dtls_medi_cd_nm"));
			rec.int_rate = Util.checkString(rset1.getString("int_rate"));
			rec.pay_bank_cd = Util.checkString(rset1.getString("pay_bank_cd"));
			rec.pay_bank_cd_nm = Util.checkString(rset1.getString("pay_bank_cd_nm"));
			rec.purc_amt = Util.checkString(rset1.getString("purc_amt"));
			rec.corp_tax_amt = Util.checkString(rset1.getString("corp_tax_amt"));
			rec.issu_dt = Util.checkString(rset1.getString("issu_dt"));
			rec.insr_nm = Util.checkString(rset1.getString("insr_nm"));
			rec.intg_dlco_cd = Util.checkString(rset1.getString("intg_dlco_cd"));
			rec.prop_equip_cd = Util.checkString(rset1.getString("prop_equip_cd"));
			rec.adpay_adjm_flag = Util.checkString(rset1.getString("adpay_adjm_flag"));
			rec.bank_clsf = Util.checkString(rset1.getString("bank_clsf"));
			rec.acct_no = Util.checkString(rset1.getString("acct_no"));
			rec.deps_pers_nm = Util.checkString(rset1.getString("deps_pers_nm"));
			rec.occr_slip_clsf = Util.checkString(rset1.getString("occr_slip_clsf"));
			rec.occr_slip = Util.checkString(rset1.getString("occr_slip"));
			rec.note_stat = Util.checkString(rset1.getString("note_stat"));
			rec.vat_amt2 = Util.checkString(rset1.getString("vat_amt2"));
			rec.with_tax = Util.checkString(rset1.getString("with_tax"));
			rec.incm_tax = Util.checkString(rset1.getString("incm_tax"));
			rec.res_tax = Util.checkString(rset1.getString("res_tax"));
			rec.etc_in_amt = Util.checkString(rset1.getString("etc_in_amt"));
			rec.setoff_no = Util.checkString(rset1.getString("setoff_no"));
			rec.confirm_flag = Util.checkString(rset1.getString("confirm_flag"));
			rec.draft_doc_no = Util.checkString(rset1.getString("draft_doc_no"));
			rec.draft_expn_amt = Util.checkString(rset1.getString("draft_expn_amt"));
			rec.recp_pers_clsf = Util.checkString(rset1.getString("recp_pers_clsf"));
			rec.recp_pers = Util.checkString(rset1.getString("recp_pers"));
			rec.rn = Util.checkString(rset1.getString("rn"));
			rec.draft_doc_dept_cd = Util.checkString(rset1.getString("draft_doc_dept_cd"));
			rec.semuro_occr_dt = Util.checkString(rset1.getString("semuro_occr_dt"));
			rec.semuro_seq = Util.checkString(rset1.getString("semuro_seq"));
			rec.semuro_no = Util.checkString(rset1.getString("semuro_no"));
			rec.email_id = Util.checkString(rset1.getString("email_id"));
			rec.prop_equip_cd_nm = Util.checkString(rset1.getString("prop_equip_cd_nm"));
			rec.recp_pers1 = Util.checkString(rset1.getString("recp_pers1"));
			rec.recp_pers_nm1 = Util.checkString(rset1.getString("recp_pers_nm1"));
			this.curlist1.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	FC_ACCT_2011_LDataSet ds = (FC_ACCT_2011_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		FC_ACCT_2011_LCURLISTRecord curlistRec = (FC_ACCT_2011_LCURLISTRecord)ds.curlist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		FC_ACCT_2011_LCURLIST1Record curlist1Rec = (FC_ACCT_2011_LCURLIST1Record)ds.curlist1.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist()%>
<%= ds.getCurlist1()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlistRec.titl%>
<%= curlistRec.reso_amt%>
<%= curlistRec.expn_clsf%>
<%= curlistRec.expn_hope_dt%>
<%= curlistRec.clam_dept_cd%>
<%= curlistRec.budg_yymm%>
<%= curlistRec.chrg_emp_no%>
<%= curlistRec.evnt_cd%>
<%= curlistRec.clam_dept_cd_nm%>
<%= curlistRec.chrg_emp_no_nm%>
<%= curlistRec.slip_aprv_yn%>
<%= curlistRec.fisc_dt%>
<%= curlistRec.evnt_cd_nm%>
<%= curlistRec.evnt_cd_seq%>
<%= curlistRec.draft_doc_no%>
<%= curlistRec.draft_doc_dept_cd%>
<%= curlistRec.draft_expn_amt%>
<%= curlistRec.medi_cd%>
<%= curlistRec.medi_cd_nm%>
<%= curlistRec.dtls_medi_cd%>
<%= curlistRec.dtls_medi_cd_nm%>
<%= curlistRec.chnl_clsf_cd%>
<%= curlist1Rec.slip_sub_seq%>
<%= curlist1Rec.slip_arow_no%>
<%= curlist1Rec.budg_cd%>
<%= curlist1Rec.drcr_clsf%>
<%= curlist1Rec.dr_amt%>
<%= curlist1Rec.crdt_amt%>
<%= curlist1Rec.dlco_clsf_cd%>
<%= curlist1Rec.dlco_cd%>
<%= curlist1Rec.dlco_nm%>
<%= curlist1Rec.boks_dlco_nm%>
<%= curlist1Rec.mang_clsf_cd%>
<%= curlist1Rec.mang_no%>
<%= curlist1Rec.incm_clsf_cd%>
<%= curlist1Rec.medi_cd%>
<%= curlist1Rec.dtls_medi_cd%>
<%= curlist1Rec.use_dept_cd%>
<%= curlist1Rec.comp_dt%>
<%= curlist1Rec.mtry_dt%>
<%= curlist1Rec.unit%>
<%= curlist1Rec.qunt%>
<%= curlist1Rec.tax_stmt_no%>
<%= curlist1Rec.setoff_slip_occr_dt%>
<%= curlist1Rec.setoff_slip_clsf_cd%>
<%= curlist1Rec.setoff_slip_seq%>
<%= curlist1Rec.setoff_slip_sub_seq%>
<%= curlist1Rec.setoff_slip_arow_no%>
<%= curlist1Rec.etc_in%>
<%= curlist1Rec.rmks2%>
<%= curlist1Rec.make_dt%>
<%= curlist1Rec.erplace_cd%>
<%= curlist1Rec.ern%>
<%= curlist1Rec.suply_amt%>
<%= curlist1Rec.vat_amt%>
<%= curlist1Rec.budg_cd_nm%>
<%= curlist1Rec.use_dept_cd_nm%>
<%= curlist1Rec.medi_cd_nm%>
<%= curlist1Rec.dtls_medi_cd_nm%>
<%= curlist1Rec.int_rate%>
<%= curlist1Rec.pay_bank_cd%>
<%= curlist1Rec.pay_bank_cd_nm%>
<%= curlist1Rec.purc_amt%>
<%= curlist1Rec.corp_tax_amt%>
<%= curlist1Rec.issu_dt%>
<%= curlist1Rec.insr_nm%>
<%= curlist1Rec.intg_dlco_cd%>
<%= curlist1Rec.prop_equip_cd%>
<%= curlist1Rec.adpay_adjm_flag%>
<%= curlist1Rec.bank_clsf%>
<%= curlist1Rec.acct_no%>
<%= curlist1Rec.deps_pers_nm%>
<%= curlist1Rec.occr_slip_clsf%>
<%= curlist1Rec.occr_slip%>
<%= curlist1Rec.note_stat%>
<%= curlist1Rec.vat_amt2%>
<%= curlist1Rec.with_tax%>
<%= curlist1Rec.incm_tax%>
<%= curlist1Rec.res_tax%>
<%= curlist1Rec.etc_in_amt%>
<%= curlist1Rec.setoff_no%>
<%= curlist1Rec.confirm_flag%>
<%= curlist1Rec.draft_doc_no%>
<%= curlist1Rec.draft_expn_amt%>
<%= curlist1Rec.recp_pers_clsf%>
<%= curlist1Rec.recp_pers%>
<%= curlist1Rec.rn%>
<%= curlist1Rec.draft_doc_dept_cd%>
<%= curlist1Rec.semuro_occr_dt%>
<%= curlist1Rec.semuro_seq%>
<%= curlist1Rec.semuro_no%>
<%= curlist1Rec.email_id%>
<%= curlist1Rec.prop_equip_cd_nm%>
<%= curlist1Rec.recp_pers1%>
<%= curlist1Rec.recp_pers_nm1%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Dec 18 11:26:48 KST 2014 */
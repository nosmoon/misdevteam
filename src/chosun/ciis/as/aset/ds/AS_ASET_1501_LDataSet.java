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


package chosun.ciis.as.aset.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.as.aset.dm.*;
import chosun.ciis.as.aset.rec.*;

/**
 * 
 */


public class AS_ASET_1501_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist4 = new ArrayList();
	public ArrayList curlist3 = new ArrayList();
	public ArrayList curlist2 = new ArrayList();
	public ArrayList curlist1 = new ArrayList();
	public ArrayList curlist6 = new ArrayList();
	public ArrayList curlist5 = new ArrayList();
	public String errcode;
	public String errmsg;

	public AS_ASET_1501_LDataSet(){}
	public AS_ASET_1501_LDataSet(String errcode, String errmsg){
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
		if(!"".equals(this.errcode)){			return;		}
		ResultSet rset0 = (ResultSet) cstmt.getObject(6);
		while(rset0.next()){
			AS_ASET_1501_LCURLIST1Record rec = new AS_ASET_1501_LCURLIST1Record();
			rec.chg_dt = Util.checkString(rset0.getString("chg_dt"));
			rec.remk = Util.checkString(rset0.getString("remk"));
			rec.draft_doc_no2 = Util.checkString(rset0.getString("draft_doc_no2"));
			rec.slip_no = Util.checkString(rset0.getString("slip_no"));
			rec.slip_occr_dt = Util.checkString(rset0.getString("slip_occr_dt"));
			rec.slip_clsf_cd = Util.checkString(rset0.getString("slip_clsf_cd"));
			rec.slip_seq = Util.checkString(rset0.getString("slip_seq"));
			rec.tax_stmt_no = Util.checkString(rset0.getString("tax_stmt_no"));
			rec.dlco_clsf_cd = Util.checkString(rset0.getString("dlco_clsf_cd"));
			rec.dlco_ern = Util.checkString(rset0.getString("dlco_ern"));
			rec.dlco_nm = Util.checkString(rset0.getString("dlco_nm"));
			this.curlist1.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(7);
		while(rset1.next()){
			AS_ASET_1501_LCURLIST2Record rec = new AS_ASET_1501_LCURLIST2Record();
			rec.aset_no = Util.checkString(rset1.getString("aset_no"));
			rec.aset_nm = Util.checkString(rset1.getString("aset_nm"));
			rec.sale_now_acqr_amt = Util.checkString(rset1.getString("sale_now_acqr_amt"));
			rec.sale_redm_tot_amt = Util.checkString(rset1.getString("sale_redm_tot_amt"));
			rec.sale_un_redm_amt = Util.checkString(rset1.getString("sale_un_redm_amt"));
			rec.chg_amt = Util.checkString(rset1.getString("chg_amt"));
			rec.chg_vat_amt = Util.checkString(rset1.getString("chg_vat_amt"));
			rec.sale_pfls_amt = Util.checkString(rset1.getString("sale_pfls_amt"));
			rec.chg_clsf_nm = Util.checkString(rset1.getString("chg_clsf_nm"));
			rec.chg_dt = Util.checkString(rset1.getString("chg_dt"));
			rec.occr_dt = Util.checkString(rset1.getString("occr_dt"));
			rec.occr_seq = Util.checkString(rset1.getString("occr_seq"));
			rec.dept_cd = Util.checkString(rset1.getString("dept_cd"));
			rec.budg_cd = Util.checkString(rset1.getString("budg_cd"));
			rec.sub_seq = Util.checkString(rset1.getString("sub_seq"));
			rec.dtls_remk = Util.checkString(rset1.getString("dtls_remk"));
			this.curlist2.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(8);
		while(rset2.next()){
			AS_ASET_1501_LCURLIST3Record rec = new AS_ASET_1501_LCURLIST3Record();
			rec.cash_sub_seq = Util.checkString(rset2.getString("cash_sub_seq"));
			rec.cash_rcpm_amt = Util.checkString(rset2.getString("cash_rcpm_amt"));
			this.curlist3.add(rec);
		}
		ResultSet rset3 = (ResultSet) cstmt.getObject(9);
		while(rset3.next()){
			AS_ASET_1501_LCURLIST4Record rec = new AS_ASET_1501_LCURLIST4Record();
			rec.deps_rmtt_dt = Util.checkString(rset3.getString("deps_rmtt_dt"));
			rec.deps_rcpm_amt = Util.checkString(rset3.getString("deps_rcpm_amt"));
			rec.deps_rmtt_plac = Util.checkString(rset3.getString("deps_rmtt_plac"));
			rec.deps_acct_mang_no = Util.checkString(rset3.getString("deps_acct_mang_no"));
			rec.deps_acct_mang_nm = Util.checkString(rset3.getString("deps_acct_mang_nm"));
			rec.deps_coms_amt = Util.checkString(rset3.getString("deps_coms_amt"));
			rec.deps_sub_seq = Util.checkString(rset3.getString("deps_sub_seq"));
			rec.deps_biz_reg_no = Util.checkString(rset3.getString("deps_biz_reg_no"));
			rec.deps_bank_id = Util.checkString(rset3.getString("deps_bank_id"));
			rec.deps_acct_num = Util.checkString(rset3.getString("deps_acct_num"));
			rec.deps_tran_date = Util.checkString(rset3.getString("deps_tran_date"));
			rec.deps_tran_date_seq = Util.checkString(rset3.getString("deps_tran_date_seq"));
			this.curlist4.add(rec);
		}
		ResultSet rset4 = (ResultSet) cstmt.getObject(10);
		while(rset4.next()){
			AS_ASET_1501_LCURLIST5Record rec = new AS_ASET_1501_LCURLIST5Record();
			rec.note_note_no = Util.checkString(rset4.getString("note_note_no"));
			rec.note_rcpm_amt = Util.checkString(rset4.getString("note_rcpm_amt"));
			rec.note_note_clsf_cd = Util.checkString(rset4.getString("note_note_clsf_cd"));
			rec.note_bank_cd = Util.checkString(rset4.getString("note_bank_cd"));
			rec.note_bank_nm = Util.checkString(rset4.getString("note_bank_nm"));
			rec.note_issu_pers_nm = Util.checkString(rset4.getString("note_issu_pers_nm"));
			rec.note_issu_cmpy_clsf = Util.checkString(rset4.getString("note_issu_cmpy_clsf"));
			rec.note_comp_dt = Util.checkString(rset4.getString("note_comp_dt"));
			rec.note_mtry_dt = Util.checkString(rset4.getString("note_mtry_dt"));
			rec.note_rcpm_acct = Util.checkString(rset4.getString("note_rcpm_acct"));
			rec.note_sale_aprv_no = Util.checkString(rset4.getString("note_sale_aprv_no"));
			rec.note_sub_seq = Util.checkString(rset4.getString("note_sub_seq"));
			this.curlist5.add(rec);
		}
		ResultSet rset5 = (ResultSet) cstmt.getObject(11);
		while(rset5.next()){
			AS_ASET_1501_LCURLIST6Record rec = new AS_ASET_1501_LCURLIST6Record();
			rec.etc_budg_cd = Util.checkString(rset5.getString("etc_budg_cd"));
			rec.etc_budg_nm = Util.checkString(rset5.getString("etc_budg_nm"));
			rec.etc_rcpm_amt = Util.checkString(rset5.getString("etc_rcpm_amt"));
			rec.etc_bal_occr_slip_clsf = Util.checkString(rset5.getString("etc_bal_occr_slip_clsf"));
			rec.etc_bal_occr_slip_no = Util.checkString(rset5.getString("etc_bal_occr_slip_no"));
			rec.etc_sub_seq = Util.checkString(rset5.getString("etc_sub_seq"));
			this.curlist6.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	AS_ASET_1501_LDataSet ds = (AS_ASET_1501_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		AS_ASET_1501_LCURLIST1Record curlist1Rec = (AS_ASET_1501_LCURLIST1Record)ds.curlist1.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist2.size(); i++){
		AS_ASET_1501_LCURLIST2Record curlist2Rec = (AS_ASET_1501_LCURLIST2Record)ds.curlist2.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist3.size(); i++){
		AS_ASET_1501_LCURLIST3Record curlist3Rec = (AS_ASET_1501_LCURLIST3Record)ds.curlist3.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist4.size(); i++){
		AS_ASET_1501_LCURLIST4Record curlist4Rec = (AS_ASET_1501_LCURLIST4Record)ds.curlist4.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist5.size(); i++){
		AS_ASET_1501_LCURLIST5Record curlist5Rec = (AS_ASET_1501_LCURLIST5Record)ds.curlist5.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist6.size(); i++){
		AS_ASET_1501_LCURLIST6Record curlist6Rec = (AS_ASET_1501_LCURLIST6Record)ds.curlist6.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist1()%>
<%= ds.getCurlist2()%>
<%= ds.getCurlist3()%>
<%= ds.getCurlist4()%>
<%= ds.getCurlist5()%>
<%= ds.getCurlist6()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlist1Rec.chg_dt%>
<%= curlist1Rec.remk%>
<%= curlist1Rec.draft_doc_no2%>
<%= curlist1Rec.slip_no%>
<%= curlist1Rec.slip_occr_dt%>
<%= curlist1Rec.slip_clsf_cd%>
<%= curlist1Rec.slip_seq%>
<%= curlist1Rec.tax_stmt_no%>
<%= curlist1Rec.dlco_clsf_cd%>
<%= curlist1Rec.dlco_ern%>
<%= curlist1Rec.dlco_nm%>
<%= curlist2Rec.aset_no%>
<%= curlist2Rec.aset_nm%>
<%= curlist2Rec.sale_now_acqr_amt%>
<%= curlist2Rec.sale_redm_tot_amt%>
<%= curlist2Rec.sale_un_redm_amt%>
<%= curlist2Rec.chg_amt%>
<%= curlist2Rec.chg_vat_amt%>
<%= curlist2Rec.sale_pfls_amt%>
<%= curlist2Rec.chg_clsf_nm%>
<%= curlist2Rec.chg_dt%>
<%= curlist2Rec.occr_dt%>
<%= curlist2Rec.occr_seq%>
<%= curlist2Rec.dept_cd%>
<%= curlist2Rec.budg_cd%>
<%= curlist2Rec.sub_seq%>
<%= curlist2Rec.dtls_remk%>
<%= curlist3Rec.cash_sub_seq%>
<%= curlist3Rec.cash_rcpm_amt%>
<%= curlist4Rec.deps_rmtt_dt%>
<%= curlist4Rec.deps_rcpm_amt%>
<%= curlist4Rec.deps_rmtt_plac%>
<%= curlist4Rec.deps_acct_mang_no%>
<%= curlist4Rec.deps_acct_mang_nm%>
<%= curlist4Rec.deps_coms_amt%>
<%= curlist4Rec.deps_sub_seq%>
<%= curlist4Rec.deps_biz_reg_no%>
<%= curlist4Rec.deps_bank_id%>
<%= curlist4Rec.deps_acct_num%>
<%= curlist4Rec.deps_tran_date%>
<%= curlist4Rec.deps_tran_date_seq%>
<%= curlist5Rec.note_note_no%>
<%= curlist5Rec.note_rcpm_amt%>
<%= curlist5Rec.note_note_clsf_cd%>
<%= curlist5Rec.note_bank_cd%>
<%= curlist5Rec.note_bank_nm%>
<%= curlist5Rec.note_issu_pers_nm%>
<%= curlist5Rec.note_issu_cmpy_clsf%>
<%= curlist5Rec.note_comp_dt%>
<%= curlist5Rec.note_mtry_dt%>
<%= curlist5Rec.note_rcpm_acct%>
<%= curlist5Rec.note_sale_aprv_no%>
<%= curlist5Rec.note_sub_seq%>
<%= curlist6Rec.etc_budg_cd%>
<%= curlist6Rec.etc_budg_nm%>
<%= curlist6Rec.etc_rcpm_amt%>
<%= curlist6Rec.etc_bal_occr_slip_clsf%>
<%= curlist6Rec.etc_bal_occr_slip_no%>
<%= curlist6Rec.etc_sub_seq%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed May 27 11:18:13 KST 2009 */
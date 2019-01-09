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


public class AS_ASET_1704_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist4 = new ArrayList();
	public ArrayList curlist3 = new ArrayList();
	public ArrayList curlist2 = new ArrayList();
	public ArrayList curlist1 = new ArrayList();
	public String errcode;
	public String errmsg;

	public AS_ASET_1704_LDataSet(){}
	public AS_ASET_1704_LDataSet(String errcode, String errmsg){
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
			AS_ASET_1704_LCURLIST1Record rec = new AS_ASET_1704_LCURLIST1Record();
			rec.cash_sub_seq = Util.checkString(rset0.getString("cash_sub_seq"));
			rec.cash_rcpm_amt = Util.checkString(rset0.getString("cash_rcpm_amt"));
			this.curlist1.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(7);
		while(rset1.next()){
			AS_ASET_1704_LCURLIST2Record rec = new AS_ASET_1704_LCURLIST2Record();
			rec.deps_rmtt_dt = Util.checkString(rset1.getString("deps_rmtt_dt"));
			rec.deps_rcpm_amt = Util.checkString(rset1.getString("deps_rcpm_amt"));
			rec.deps_rmtt_plac = Util.checkString(rset1.getString("deps_rmtt_plac"));
			rec.deps_acct_mang_no = Util.checkString(rset1.getString("deps_acct_mang_no"));
			rec.deps_acct_mang_nm = Util.checkString(rset1.getString("deps_acct_mang_nm"));
			rec.deps_coms_amt = Util.checkString(rset1.getString("deps_coms_amt"));
			rec.deps_sub_seq = Util.checkString(rset1.getString("deps_sub_seq"));
			rec.deps_biz_reg_no = Util.checkString(rset1.getString("deps_biz_reg_no"));
			rec.deps_bank_id = Util.checkString(rset1.getString("deps_bank_id"));
			rec.deps_acct_num = Util.checkString(rset1.getString("deps_acct_num"));
			rec.deps_tran_date = Util.checkString(rset1.getString("deps_tran_date"));
			rec.deps_tran_date_seq = Util.checkString(rset1.getString("deps_tran_date_seq"));
			this.curlist2.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(8);
		while(rset2.next()){
			AS_ASET_1704_LCURLIST3Record rec = new AS_ASET_1704_LCURLIST3Record();
			rec.note_note_no = Util.checkString(rset2.getString("note_note_no"));
			rec.note_rcpm_amt = Util.checkString(rset2.getString("note_rcpm_amt"));
			rec.note_note_clsf_cd = Util.checkString(rset2.getString("note_note_clsf_cd"));
			rec.note_bank_cd = Util.checkString(rset2.getString("note_bank_cd"));
			rec.note_bank_nm = Util.checkString(rset2.getString("note_bank_nm"));
			rec.note_issu_pers_nm = Util.checkString(rset2.getString("note_issu_pers_nm"));
			rec.note_issu_cmpy_clsf = Util.checkString(rset2.getString("note_issu_cmpy_clsf"));
			rec.note_comp_dt = Util.checkString(rset2.getString("note_comp_dt"));
			rec.note_mtry_dt = Util.checkString(rset2.getString("note_mtry_dt"));
			rec.note_rcpm_acct = Util.checkString(rset2.getString("note_rcpm_acct"));
			rec.note_sale_aprv_no = Util.checkString(rset2.getString("note_sale_aprv_no"));
			rec.note_sub_seq = Util.checkString(rset2.getString("note_sub_seq"));
			this.curlist3.add(rec);
		}
		ResultSet rset3 = (ResultSet) cstmt.getObject(9);
		while(rset3.next()){
			AS_ASET_1704_LCURLIST4Record rec = new AS_ASET_1704_LCURLIST4Record();
			rec.etc_budg_cd = Util.checkString(rset3.getString("etc_budg_cd"));
			rec.etc_budg_nm = Util.checkString(rset3.getString("etc_budg_nm"));
			rec.etc_rcpm_amt = Util.checkString(rset3.getString("etc_rcpm_amt"));
			rec.etc_bal_occr_slip_clsf = Util.checkString(rset3.getString("etc_bal_occr_slip_clsf"));
			rec.etc_bal_occr_slip_no = Util.checkString(rset3.getString("etc_bal_occr_slip_no"));
			rec.etc_sub_seq = Util.checkString(rset3.getString("etc_sub_seq"));
			this.curlist4.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	AS_ASET_1704_LDataSet ds = (AS_ASET_1704_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		AS_ASET_1704_LCURLIST1Record curlist1Rec = (AS_ASET_1704_LCURLIST1Record)ds.curlist1.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist2.size(); i++){
		AS_ASET_1704_LCURLIST2Record curlist2Rec = (AS_ASET_1704_LCURLIST2Record)ds.curlist2.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist3.size(); i++){
		AS_ASET_1704_LCURLIST3Record curlist3Rec = (AS_ASET_1704_LCURLIST3Record)ds.curlist3.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist4.size(); i++){
		AS_ASET_1704_LCURLIST4Record curlist4Rec = (AS_ASET_1704_LCURLIST4Record)ds.curlist4.get(i);%>
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
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlist1Rec.cash_sub_seq%>
<%= curlist1Rec.cash_rcpm_amt%>
<%= curlist2Rec.deps_rmtt_dt%>
<%= curlist2Rec.deps_rcpm_amt%>
<%= curlist2Rec.deps_rmtt_plac%>
<%= curlist2Rec.deps_acct_mang_no%>
<%= curlist2Rec.deps_acct_mang_nm%>
<%= curlist2Rec.deps_coms_amt%>
<%= curlist2Rec.deps_sub_seq%>
<%= curlist2Rec.deps_biz_reg_no%>
<%= curlist2Rec.deps_bank_id%>
<%= curlist2Rec.deps_acct_num%>
<%= curlist2Rec.deps_tran_date%>
<%= curlist2Rec.deps_tran_date_seq%>
<%= curlist3Rec.note_note_no%>
<%= curlist3Rec.note_rcpm_amt%>
<%= curlist3Rec.note_note_clsf_cd%>
<%= curlist3Rec.note_bank_cd%>
<%= curlist3Rec.note_bank_nm%>
<%= curlist3Rec.note_issu_pers_nm%>
<%= curlist3Rec.note_issu_cmpy_clsf%>
<%= curlist3Rec.note_comp_dt%>
<%= curlist3Rec.note_mtry_dt%>
<%= curlist3Rec.note_rcpm_acct%>
<%= curlist3Rec.note_sale_aprv_no%>
<%= curlist3Rec.note_sub_seq%>
<%= curlist4Rec.etc_budg_cd%>
<%= curlist4Rec.etc_budg_nm%>
<%= curlist4Rec.etc_rcpm_amt%>
<%= curlist4Rec.etc_bal_occr_slip_clsf%>
<%= curlist4Rec.etc_bal_occr_slip_no%>
<%= curlist4Rec.etc_sub_seq%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue May 26 19:09:49 KST 2009 */
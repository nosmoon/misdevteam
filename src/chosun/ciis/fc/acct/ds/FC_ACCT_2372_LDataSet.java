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


public class FC_ACCT_2372_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public String note_yn;

	public FC_ACCT_2372_LDataSet(){}
	public FC_ACCT_2372_LDataSet(String errcode, String errmsg, String note_yn){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.note_yn = note_yn;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setNote_yn(String note_yn){
		this.note_yn = note_yn;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getNote_yn(){
		return this.note_yn;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		ResultSet rset0 = (ResultSet) cstmt.getObject(9);
		while(rset0.next()){
			FC_ACCT_2372_LCURLISTRecord rec = new FC_ACCT_2372_LCURLISTRecord();
			rec.check1 = Util.checkString(rset0.getString("check1"));
			rec.slip_occr_dt = Util.checkString(rset0.getString("slip_occr_dt"));
			rec.slip_clsf_cd = Util.checkString(rset0.getString("slip_clsf_cd"));
			rec.slip_seq = Util.checkString(rset0.getString("slip_seq"));
			rec.slip_sub_seq = Util.checkString(rset0.getString("slip_sub_seq"));
			rec.clam_dept_cd = Util.checkString(rset0.getString("clam_dept_cd"));
			rec.rmks1 = Util.checkString(rset0.getString("rmks1"));
			rec.sum_cbamt = Util.checkString(rset0.getString("sum_cbamt"));
			rec.sum_dbamt = Util.checkString(rset0.getString("sum_dbamt"));
			rec.slip_no = Util.checkString(rset0.getString("slip_no"));
			rec.tax_stmt_no = Util.checkString(rset0.getString("tax_stmt_no"));
			rec.draft_doc_no = Util.checkString(rset0.getString("draft_doc_no"));
			rec.draft_expn_amt = Util.checkString(rset0.getString("draft_expn_amt"));
			rec.draft_impt_amt = Util.checkString(rset0.getString("draft_impt_amt"));
			rec.draft_doc_dept_cd = Util.checkString(rset0.getString("draft_doc_dept_cd"));
			this.curlist.add(rec);
		}
		this.note_yn = Util.checkString(cstmt.getString(10));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	FC_ACCT_2372_LDataSet ds = (FC_ACCT_2372_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		FC_ACCT_2372_LCURLISTRecord curlistRec = (FC_ACCT_2372_LCURLISTRecord)ds.curlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist()%>
<%= ds.getNote_yn()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlistRec.check1%>
<%= curlistRec.slip_occr_dt%>
<%= curlistRec.slip_clsf_cd%>
<%= curlistRec.slip_seq%>
<%= curlistRec.slip_sub_seq%>
<%= curlistRec.clam_dept_cd%>
<%= curlistRec.rmks1%>
<%= curlistRec.sum_cbamt%>
<%= curlistRec.sum_dbamt%>
<%= curlistRec.slip_no%>
<%= curlistRec.tax_stmt_no%>
<%= curlistRec.draft_doc_no%>
<%= curlistRec.draft_expn_amt%>
<%= curlistRec.draft_impt_amt%>
<%= curlistRec.draft_doc_dept_cd%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Apr 09 18:54:34 KST 2018 */
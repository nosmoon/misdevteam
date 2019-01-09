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


public class FC_ACCT_2021_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public FC_ACCT_2021_LDataSet(){}
	public FC_ACCT_2021_LDataSet(String errcode, String errmsg){
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
			FC_ACCT_2021_LCURLISTRecord rec = new FC_ACCT_2021_LCURLISTRecord();
			rec.cost_clsf = Util.checkString(rset0.getString("cost_clsf"));
			rec.clam_amt = Util.checkString(rset0.getString("clam_amt"));
			rec.clam_dept_cd = Util.checkString(rset0.getString("clam_dept_cd"));
			rec.chrg_emp_no = Util.checkString(rset0.getString("chrg_emp_no"));
			rec.titl = Util.checkString(rset0.getString("titl"));
			rec.budg_cd = Util.checkString(rset0.getString("budg_cd"));
			rec.budg_yymm = Util.checkString(rset0.getString("budg_yymm"));
			rec.medi_cd = Util.checkString(rset0.getString("medi_cd"));
			rec.fisc_dt = Util.checkString(rset0.getString("fisc_dt"));
			rec.pch_buseonm = Util.checkString(rset0.getString("pch_buseonm"));
			rec.pch_mcnm = Util.checkString(rset0.getString("pch_mcnm"));
			rec.pch_ddjnm = Util.checkString(rset0.getString("pch_ddjnm"));
			rec.adpay_expn_no = Util.checkString(rset0.getString("adpay_expn_no"));
			rec.end_yn = Util.checkString(rset0.getString("end_yn"));
			rec.dtls_medi_cd = Util.checkString(rset0.getString("dtls_medi_cd"));
			rec.draft_doc_no = Util.checkString(rset0.getString("draft_doc_no"));
			rec.draft_expn_amt = Util.checkString(rset0.getString("draft_expn_amt"));
			rec.draft_doc_dept_cd = Util.checkString(rset0.getString("draft_doc_dept_cd"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	FC_ACCT_2021_LDataSet ds = (FC_ACCT_2021_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		FC_ACCT_2021_LCURLISTRecord curlistRec = (FC_ACCT_2021_LCURLISTRecord)ds.curlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlistRec.cost_clsf%>
<%= curlistRec.clam_amt%>
<%= curlistRec.clam_dept_cd%>
<%= curlistRec.chrg_emp_no%>
<%= curlistRec.titl%>
<%= curlistRec.budg_cd%>
<%= curlistRec.budg_yymm%>
<%= curlistRec.medi_cd%>
<%= curlistRec.fisc_dt%>
<%= curlistRec.pch_buseonm%>
<%= curlistRec.pch_mcnm%>
<%= curlistRec.pch_ddjnm%>
<%= curlistRec.adpay_expn_no%>
<%= curlistRec.end_yn%>
<%= curlistRec.dtls_medi_cd%>
<%= curlistRec.draft_doc_no%>
<%= curlistRec.draft_expn_amt%>
<%= curlistRec.draft_doc_dept_cd%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Jul 09 16:56:00 KST 2009 */
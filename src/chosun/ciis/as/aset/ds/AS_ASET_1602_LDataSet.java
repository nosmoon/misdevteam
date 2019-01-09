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


public class AS_ASET_1602_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist2 = new ArrayList();
	public ArrayList curlist1 = new ArrayList();
	public String errcode;
	public String errmsg;

	public AS_ASET_1602_LDataSet(){}
	public AS_ASET_1602_LDataSet(String errcode, String errmsg){
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
			AS_ASET_1602_LCURLIST1Record rec = new AS_ASET_1602_LCURLIST1Record();
			rec.aset_no = Util.checkString(rset0.getString("aset_no"));
			rec.aset_nm = Util.checkString(rset0.getString("aset_nm"));
			rec.chg_clsf_nm = Util.checkString(rset0.getString("chg_clsf_nm"));
			rec.chg_dt = Util.checkString(rset0.getString("chg_dt"));
			rec.occr_dt = Util.checkString(rset0.getString("occr_dt"));
			rec.occr_seq = Util.checkString(rset0.getString("occr_seq"));
			rec.sub_seq = Util.checkString(rset0.getString("sub_seq"));
			rec.dept_cd = Util.checkString(rset0.getString("dept_cd"));
			rec.budg_cd = Util.checkString(rset0.getString("budg_cd"));
			rec.sale_now_acqr_amt = Util.checkString(rset0.getString("sale_now_acqr_amt"));
			rec.sale_redm_tot_amt = Util.checkString(rset0.getString("sale_redm_tot_amt"));
			rec.sale_un_redm_amt = Util.checkString(rset0.getString("sale_un_redm_amt"));
			rec.sale_pfls_amt = Util.checkString(rset0.getString("sale_pfls_amt"));
			rec.remk_dtls = Util.checkString(rset0.getString("remk_dtls"));
			this.curlist1.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(7);
		while(rset1.next()){
			AS_ASET_1602_LCURLIST2Record rec = new AS_ASET_1602_LCURLIST2Record();
			rec.chg_dt = Util.checkString(rset1.getString("chg_dt"));
			rec.remk = Util.checkString(rset1.getString("remk"));
			rec.draft_doc_no2 = Util.checkString(rset1.getString("draft_doc_no2"));
			rec.slip_no = Util.checkString(rset1.getString("slip_no"));
			this.curlist2.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	AS_ASET_1602_LDataSet ds = (AS_ASET_1602_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		AS_ASET_1602_LCURLIST1Record curlist1Rec = (AS_ASET_1602_LCURLIST1Record)ds.curlist1.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist2.size(); i++){
		AS_ASET_1602_LCURLIST2Record curlist2Rec = (AS_ASET_1602_LCURLIST2Record)ds.curlist2.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist1()%>
<%= ds.getCurlist2()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlist1Rec.aset_no%>
<%= curlist1Rec.aset_nm%>
<%= curlist1Rec.chg_clsf_nm%>
<%= curlist1Rec.chg_dt%>
<%= curlist1Rec.occr_dt%>
<%= curlist1Rec.occr_seq%>
<%= curlist1Rec.sub_seq%>
<%= curlist1Rec.dept_cd%>
<%= curlist1Rec.budg_cd%>
<%= curlist1Rec.sale_now_acqr_amt%>
<%= curlist1Rec.sale_redm_tot_amt%>
<%= curlist1Rec.sale_un_redm_amt%>
<%= curlist1Rec.sale_pfls_amt%>
<%= curlist1Rec.remk_dtls%>
<%= curlist2Rec.chg_dt%>
<%= curlist2Rec.remk%>
<%= curlist2Rec.draft_doc_no2%>
<%= curlist2Rec.slip_no%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Mar 26 17:26:35 KST 2009 */
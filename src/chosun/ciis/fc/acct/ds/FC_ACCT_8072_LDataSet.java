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


public class FC_ACCT_8072_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist2 = new ArrayList();
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public FC_ACCT_8072_LDataSet(){}
	public FC_ACCT_8072_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(7);
		while(rset0.next()){
			FC_ACCT_8072_LCURLISTRecord rec = new FC_ACCT_8072_LCURLISTRecord();
			rec.inwoncnt = Util.checkString(rset0.getString("inwoncnt"));
			rec.w_tcnt = Util.checkString(rset0.getString("w_tcnt"));
			rec.totamt = Util.checkString(rset0.getString("totamt"));
			rec.sdstotamt = Util.checkString(rset0.getString("sdstotamt"));
			rec.jmstotamt = Util.checkString(rset0.getString("jmstotamt"));
			rec.wctotamt = Util.checkString(rset0.getString("wctotamt"));
			rec.pytotamt = Util.checkString(rset0.getString("pytotamt"));
			rec.sdtotamt = Util.checkString(rset0.getString("sdtotamt"));
			this.curlist.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(8);
		while(rset1.next()){
			FC_ACCT_8072_LCURLIST2Record rec = new FC_ACCT_8072_LCURLIST2Record();
			rec.dlco_clsf_cd = Util.checkString(rset1.getString("dlco_clsf_cd"));
			rec.dlco_cd = Util.checkString(rset1.getString("dlco_cd"));
			rec.cucustnm = Util.checkString(rset1.getString("cucustnm"));
			rec.totamt = Util.checkString(rset1.getString("totamt"));
			rec.sdstotamt = Util.checkString(rset1.getString("sdstotamt"));
			rec.jmstotamt = Util.checkString(rset1.getString("jmstotamt"));
			rec.wctotamt = Util.checkString(rset1.getString("wctotamt"));
			rec.pytotamt = Util.checkString(rset1.getString("pytotamt"));
			rec.sdtotamt = Util.checkString(rset1.getString("sdtotamt"));
			rec.inwoncnt = Util.checkString(rset1.getString("inwoncnt"));
			rec.w_tcnt = Util.checkString(rset1.getString("w_tcnt"));
			this.curlist2.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	FC_ACCT_8072_LDataSet ds = (FC_ACCT_8072_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		FC_ACCT_8072_LCURLISTRecord curlistRec = (FC_ACCT_8072_LCURLISTRecord)ds.curlist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist2.size(); i++){
		FC_ACCT_8072_LCURLIST2Record curlist2Rec = (FC_ACCT_8072_LCURLIST2Record)ds.curlist2.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist()%>
<%= ds.getCurlist2()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlistRec.inwoncnt%>
<%= curlistRec.w_tcnt%>
<%= curlistRec.totamt%>
<%= curlistRec.sdstotamt%>
<%= curlistRec.jmstotamt%>
<%= curlistRec.wctotamt%>
<%= curlistRec.pytotamt%>
<%= curlistRec.sdtotamt%>
<%= curlist2Rec.dlco_clsf_cd%>
<%= curlist2Rec.dlco_cd%>
<%= curlist2Rec.cucustnm%>
<%= curlist2Rec.totamt%>
<%= curlist2Rec.sdstotamt%>
<%= curlist2Rec.jmstotamt%>
<%= curlist2Rec.wctotamt%>
<%= curlist2Rec.pytotamt%>
<%= curlist2Rec.sdtotamt%>
<%= curlist2Rec.inwoncnt%>
<%= curlist2Rec.w_tcnt%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Jul 09 13:17:12 KST 2015 */
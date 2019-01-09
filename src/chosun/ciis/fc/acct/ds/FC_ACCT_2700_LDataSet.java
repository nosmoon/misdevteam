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


public class FC_ACCT_2700_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist2 = new ArrayList();
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public FC_ACCT_2700_LDataSet(){}
	public FC_ACCT_2700_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(5);
		while(rset0.next()){
			FC_ACCT_2700_LCURLISTRecord rec = new FC_ACCT_2700_LCURLISTRecord();
			rec.dlco_cd = Util.checkString(rset0.getString("dlco_cd"));
			rec.dlco_nm = Util.checkString(rset0.getString("dlco_nm"));
			rec.before_amt = Util.checkString(rset0.getString("before_amt"));
			rec.dd_amt1 = Util.checkString(rset0.getString("dd_amt1"));
			rec.dd_amt2 = Util.checkString(rset0.getString("dd_amt2"));
			rec.dd_amt3 = Util.checkString(rset0.getString("dd_amt3"));
			this.curlist.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(6);
		while(rset1.next()){
			FC_ACCT_2700_LCURLIST2Record rec = new FC_ACCT_2700_LCURLIST2Record();
			rec.dlco_cd = Util.checkString(rset1.getString("dlco_cd"));
			rec.dlco_nm = Util.checkString(rset1.getString("dlco_nm"));
			rec.before_amt = Util.checkString(rset1.getString("before_amt"));
			rec.dd_amt1 = Util.checkString(rset1.getString("dd_amt1"));
			rec.dd_amt2 = Util.checkString(rset1.getString("dd_amt2"));
			rec.dd_amt3 = Util.checkString(rset1.getString("dd_amt3"));
			this.curlist2.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	FC_ACCT_2700_LDataSet ds = (FC_ACCT_2700_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		FC_ACCT_2700_LCURLISTRecord curlistRec = (FC_ACCT_2700_LCURLISTRecord)ds.curlist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist2.size(); i++){
		FC_ACCT_2700_LCURLIST2Record curlist2Rec = (FC_ACCT_2700_LCURLIST2Record)ds.curlist2.get(i);%>
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

<%= curlistRec.dlco_cd%>
<%= curlistRec.dlco_nm%>
<%= curlistRec.before_amt%>
<%= curlistRec.dd_amt1%>
<%= curlistRec.dd_amt2%>
<%= curlistRec.dd_amt3%>
<%= curlist2Rec.dlco_cd%>
<%= curlist2Rec.dlco_nm%>
<%= curlist2Rec.before_amt%>
<%= curlist2Rec.dd_amt1%>
<%= curlist2Rec.dd_amt2%>
<%= curlist2Rec.dd_amt3%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Oct 24 15:37:56 KST 2014 */
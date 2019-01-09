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


public class FC_ACCT_2421_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public ArrayList curamt = new ArrayList();
	public String errcode;
	public String errmsg;

	public FC_ACCT_2421_LDataSet(){}
	public FC_ACCT_2421_LDataSet(String errcode, String errmsg){
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
		ResultSet rset0 = (ResultSet) cstmt.getObject(10);
		while(rset0.next()){
			FC_ACCT_2421_LCURLISTRecord rec = new FC_ACCT_2421_LCURLISTRecord();
			rec.acct_cd_nm = Util.checkString(rset0.getString("acct_cd_nm"));
			rec.fisc_dt = Util.checkString(rset0.getString("fisc_dt"));
			rec.slip_no = Util.checkString(rset0.getString("slip_no"));
			rec.rmks = Util.checkString(rset0.getString("rmks"));
			rec.dr_amt = Util.checkString(rset0.getString("dr_amt"));
			rec.crdt_amt = Util.checkString(rset0.getString("crdt_amt"));
			this.curlist.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(11);
		while(rset1.next()){
			FC_ACCT_2421_LCURAMTRecord rec = new FC_ACCT_2421_LCURAMTRecord();
			rec.fajcbamt = Util.checkString(rset1.getString("fajcbamt"));
			rec.fajdbamt = Util.checkString(rset1.getString("fajdbamt"));
			rec.fdajcbamt = Util.checkString(rset1.getString("fdajcbamt"));
			rec.fdajdbamt = Util.checkString(rset1.getString("fdajdbamt"));
			rec.fcbjan = Util.checkString(rset1.getString("fcbjan"));
			rec.fdbjan = Util.checkString(rset1.getString("fdbjan"));
			this.curamt.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	FC_ACCT_2421_LDataSet ds = (FC_ACCT_2421_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		FC_ACCT_2421_LCURLISTRecord curlistRec = (FC_ACCT_2421_LCURLISTRecord)ds.curlist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curamt.size(); i++){
		FC_ACCT_2421_LCURAMTRecord curamtRec = (FC_ACCT_2421_LCURAMTRecord)ds.curamt.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist()%>
<%= ds.getCuramt()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlistRec.acct_cd_nm%>
<%= curlistRec.fisc_dt%>
<%= curlistRec.slip_no%>
<%= curlistRec.rmks%>
<%= curlistRec.dr_amt%>
<%= curlistRec.crdt_amt%>
<%= curamtRec.fajcbamt%>
<%= curamtRec.fajdbamt%>
<%= curamtRec.fdajcbamt%>
<%= curamtRec.fdajdbamt%>
<%= curamtRec.fcbjan%>
<%= curamtRec.fdbjan%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Feb 23 12:17:17 KST 2009 */
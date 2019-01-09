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


package chosun.ciis.tn.dns.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.tn.dns.dm.*;
import chosun.ciis.tn.dns.rec.*;

/**
 * 
 */


public class TN_DNS_3110_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public TN_DNS_3110_LDataSet(){}
	public TN_DNS_3110_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(4);
		while(rset0.next()){
			TN_DNS_3110_LCURLISTRecord rec = new TN_DNS_3110_LCURLISTRecord();
			rec.receiptbulkissueidx = Util.checkString(rset0.getString("receiptbulkissueidx"));
			rec.issuedeptidx = Util.checkString(rset0.getString("issuedeptidx"));
			rec.issuedeptname = Util.checkString(rset0.getString("issuedeptname"));
			rec.paydate = Util.checkString(rset0.getString("paydate"));
			rec.paymentcount = Util.checkString(rset0.getString("paymentcount"));
			rec.price = Util.checkString(rset0.getString("price"));
			rec.issuecount = Util.checkString(rset0.getString("issuecount"));
			rec.adminname = Util.checkString(rset0.getString("adminname"));
			rec.issuedate = Util.checkString(rset0.getString("issuedate"));			
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	TN_DNS_3110_LDataSet ds = (TN_DNS_3110_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		TN_DNS_3110_LCURLISTRecord curlistRec = (TN_DNS_3110_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.receiptbulkissueidx%>
<%= curlistRec.issuedeptidx%>
<%= curlistRec.issuedeptname%>
<%= curlistRec.paydate%>
<%= curlistRec.paymentcount%>
<%= curlistRec.price%>
<%= curlistRec.issucount%>
<%= curlistRec.adminname%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Jun 28 19:58:28 KST 2016 */
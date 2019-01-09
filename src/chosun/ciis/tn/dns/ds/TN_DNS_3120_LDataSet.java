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


public class TN_DNS_3120_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
//	public ArrayList curlist3 = new ArrayList();
//	public ArrayList curlist2 = new ArrayList();
	public ArrayList curlist1 = new ArrayList();
	public String errcode;
	public String errmsg;

	public TN_DNS_3120_LDataSet(){}
	public TN_DNS_3120_LDataSet(String errcode, String errmsg){
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
			TN_DNS_3120_LCURLIST1Record rec = new TN_DNS_3120_LCURLIST1Record();
			rec.receiptbulkissueidx = Util.checkString(rset0.getString("receiptbulkissueidx"));
			rec.issuedeptidx = Util.checkString(rset0.getString("issuedeptidx"));
			rec.issuedeptname = Util.checkString(rset0.getString("issuedeptname"));
			rec.startpaydate = Util.checkString(rset0.getString("startpaydate"));
			rec.endpaydate = Util.checkString(rset0.getString("endpaydate"));
			rec.includeissued = Util.checkString(rset0.getString("includeissued"));
			rec.paymentcount = Util.checkString(rset0.getString("paymentcount"));
			rec.price = Util.checkString(rset0.getString("price"));
			rec.issuecount = Util.checkString(rset0.getString("issuecount"));
			rec.adminname = Util.checkString(rset0.getString("adminname"));
			rec.issuedate = Util.checkString(rset0.getString("issuedate"));
			rec.deptidx = Util.checkString(rset0.getString("deptidx"));
			this.curlist1.add(rec);
		}
		/*ResultSet rset1 = (ResultSet) cstmt.getObject(6);
		while(rset1.next()){
			TN_DNS_3120_LCURLIST2Record rec = new TN_DNS_3120_LCURLIST2Record();
			rec.receiptbulkissueidx = Util.checkString(rset1.getString("receiptbulkissueidx"));
			rec.issuname = Util.checkString(rset1.getString("issuname"));
			rec.donatorcategory = Util.checkString(rset1.getString("donatorcategory"));
			rec.receiptcategory = Util.checkString(rset1.getString("receiptcategory"));
			rec.price = Util.checkString(rset1.getString("price"));
			rec.memberidx = Util.checkString(rset1.getString("memberidx"));
			rec.membercategorycode = Util.checkString(rset1.getString("membercategorycode"));
			rec.receiptidx = Util.checkString(rset1.getString("receiptidx"));
			rec.name = Util.checkString(rset1.getString("name"));
			rec.paymenttype = Util.checkString(rset1.getString("paymenttype"));
			rec.receiptcode = Util.checkString(rset1.getString("receiptcode"));
			this.curlist2.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(7);
		while(rset2.next()){
			TN_DNS_3120_LCURLIST3Record rec = new TN_DNS_3120_LCURLIST3Record();
			rec.receiptbulkissueidx = Util.checkString(rset2.getString("receiptbulkissueidx"));
			rec.issuname = Util.checkString(rset2.getString("issuname"));
			rec.donatorcategory = Util.checkString(rset2.getString("donatorcategory"));
			rec.receiptcategory = Util.checkString(rset2.getString("receiptcategory"));
			rec.price = Util.checkString(rset2.getString("price"));
			rec.memberidx = Util.checkString(rset2.getString("memberidx"));
			rec.membercategorycode = Util.checkString(rset2.getString("membercategorycode"));
			rec.name = Util.checkString(rset2.getString("name"));
			rec.paymenttype = Util.checkString(rset2.getString("paymenttype"));
			rec.status = Util.checkString(rset2.getString("status"));
			this.curlist3.add(rec);
		}*/
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	TN_DNS_3120_LDataSet ds = (TN_DNS_3120_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		TN_DNS_3120_LCURLIST1Record curlist1Rec = (TN_DNS_3120_LCURLIST1Record)ds.curlist1.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist2.size(); i++){
		TN_DNS_3120_LCURLIST2Record curlist2Rec = (TN_DNS_3120_LCURLIST2Record)ds.curlist2.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist3.size(); i++){
		TN_DNS_3120_LCURLIST3Record curlist3Rec = (TN_DNS_3120_LCURLIST3Record)ds.curlist3.get(i);%>
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
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlist1Rec.receiptbulkissueidx%>
<%= curlist1Rec.issuedeptidx%>
<%= curlist1Rec.issuedeptname%>
<%= curlist1Rec.startpaydate%>
<%= curlist1Rec.endpaydate%>
<%= curlist1Rec.includeissued%>
<%= curlist1Rec.paymentcount%>
<%= curlist1Rec.price%>
<%= curlist1Rec.issuecount%>
<%= curlist1Rec.adminname%>
<%= curlist1Rec.issuedate%>
<%= curlist1Rec.deptidx%>
<%= curlist2Rec.receiptbulkissueidx%>
<%= curlist2Rec.issuname%>
<%= curlist2Rec.donatorcategory%>
<%= curlist2Rec.receiptcategory%>
<%= curlist2Rec.price%>
<%= curlist2Rec.memberidx%>
<%= curlist2Rec.membercategorycode%>
<%= curlist2Rec.receiptidx%>
<%= curlist2Rec.name%>
<%= curlist2Rec.paymenttype%>
<%= curlist2Rec.receiptcode%>
<%= curlist3Rec.receiptbulkissueidx%>
<%= curlist3Rec.issuname%>
<%= curlist3Rec.donatorcategory%>
<%= curlist3Rec.receiptcategory%>
<%= curlist3Rec.price%>
<%= curlist3Rec.memberidx%>
<%= curlist3Rec.membercategorycode%>
<%= curlist3Rec.name%>
<%= curlist3Rec.paymenttype%>
<%= curlist3Rec.status%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Aug 08 20:00:55 KST 2016 */
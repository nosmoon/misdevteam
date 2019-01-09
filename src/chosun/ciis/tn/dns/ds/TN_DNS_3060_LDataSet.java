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


public class TN_DNS_3060_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist2 = new ArrayList();
	public ArrayList curlist1 = new ArrayList();
	public String errcode;
	public String errmsg;

	public TN_DNS_3060_LDataSet(){}
	public TN_DNS_3060_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(6);
		while(rset0.next()){
			TN_DNS_3060_LCURLIST1Record rec = new TN_DNS_3060_LCURLIST1Record();
			rec.memberidx = Util.checkString(rset0.getString("memberidx"));
			rec.receiptcode = Util.checkString(rset0.getString("receiptcode"));
			rec.issuedate = Util.checkString(rset0.getString("issuedate"));
			rec.issuecategory = Util.checkString(rset0.getString("issuecategory"));
			rec.donatorcategory = Util.checkString(rset0.getString("donatorcategory"));
			rec.receiptcategory = Util.checkString(rset0.getString("receiptcategory"));
			rec.name = Util.checkString(rset0.getString("name"));
			rec.address = Util.checkString(rset0.getString("address"));
			rec.regno = Util.checkString(rset0.getString("regno"));
			rec.issuecount = Util.checkString(rset0.getString("issuecount"));
			rec.issuedatecategory = Util.checkString(rset0.getString("issuedatecategory"));
			rec.deptidx = Util.checkString(rset0.getString("deptidx"));
			rec.adminidx = Util.checkString(rset0.getString("adminidx"));
			rec.memo = Util.checkString(rset0.getString("memo"));
			this.curlist1.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(7);
		while(rset1.next()){
			TN_DNS_3060_LCURLIST2Record rec = new TN_DNS_3060_LCURLIST2Record();
			rec.paymentcode = Util.checkString(rset1.getString("paymentcode"));
			rec.paydate = Util.checkString(rset1.getString("paydate"));
			rec.deptidx = Util.checkString(rset1.getString("deptidx"));
			rec.fundidx = Util.checkString(rset1.getString("fundidx"));
			rec.paymethodcode = Util.checkString(rset1.getString("paymethodcode"));
			rec.payprice = Util.checkString(rset1.getString("payprice"));
			rec.receiptissue = Util.checkString(rset1.getString("receiptissue"));
			this.curlist2.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	TN_DNS_3060_LDataSet ds = (TN_DNS_3060_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		TN_DNS_3060_LCURLIST1Record curlist1Rec = (TN_DNS_3060_LCURLIST1Record)ds.curlist1.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist2.size(); i++){
		TN_DNS_3060_LCURLIST2Record curlist2Rec = (TN_DNS_3060_LCURLIST2Record)ds.curlist2.get(i);%>
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

<%= curlist1Rec.memberidx%>
<%= curlist1Rec.receiptcode%>
<%= curlist1Rec.issuedate%>
<%= curlist1Rec.issuecategory%>
<%= curlist1Rec.donatorcategory%>
<%= curlist1Rec.receiptcategory%>
<%= curlist1Rec.name%>
<%= curlist1Rec.address%>
<%= curlist1Rec.regno%>
<%= curlist1Rec.issuecount%>
<%= curlist1Rec.issuedatecategory%>
<%= curlist1Rec.deptidx%>
<%= curlist1Rec.deptidx%>
<%= curlist1Rec.adminidx%>
<%= curlist1Rec.memo%>
<%= curlist2Rec.paymentcode%>
<%= curlist2Rec.paydate%>
<%= curlist2Rec.deptidx%>
<%= curlist2Rec.fundidx%>
<%= curlist2Rec.paymethodcode%>
<%= curlist2Rec.payprice%>
<%= curlist2Rec.receiptissue%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Aug 05 09:27:37 KST 2016 */
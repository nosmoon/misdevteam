/***************************************************************************************************
* ���ϸ� : .java
* ��� : ���ڿ��-������û
* �ۼ����� : 2007-05-22
* �ۼ��� : ��뼷
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.tn.rpt.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.tn.rpt.dm.*;
import chosun.ciis.tn.rpt.rec.*;

/**
 * 
 */


public class TN_RPT_1020_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public TN_RPT_1020_LDataSet(){}
	public TN_RPT_1020_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(9);
		while(rset0.next()){
			TN_RPT_1020_LCURLISTRecord rec = new TN_RPT_1020_LCURLISTRecord();
			rec.receiptidx = Util.checkString(rset0.getString("receiptidx"));
			rec.receiptcode = Util.checkString(rset0.getString("receiptcode"));
			rec.receiptyear = Util.checkString(rset0.getString("receiptyear"));
			rec.issuedate = Util.checkString(rset0.getString("issuedate"));
			rec.receiptname = Util.checkString(rset0.getString("receiptname"));
			rec.name = Util.checkString(rset0.getString("name"));
			rec.isanonymous = Util.checkString(rset0.getString("isanonymous"));
			rec.regno = Util.checkString(rset0.getString("regno"));
			rec.issuecount = Util.checkString(rset0.getString("issuecount"));
			rec.price = Util.checkString(rset0.getString("price"));
			rec.membertype = Util.checkString(rset0.getString("membertype"));
			rec.address = Util.checkString(rset0.getString("address"));
			rec.isreissue = Util.checkString(rset0.getString("isreissue"));
			rec.donatorcategory = Util.checkString(rset0.getString("donatorcategory"));
			rec.receiptcategory = Util.checkString(rset0.getString("receiptcategory"));
			rec.paymentcount = Util.checkString(rset0.getString("paymentcount"));
			rec.mindate = Util.checkString(rset0.getString("mindate"));
			rec.maxdate = Util.checkString(rset0.getString("maxdate"));
			rec.samepaymentcount = Util.checkString(rset0.getString("samepaymentcount"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	TN_RPT_1020_LDataSet ds = (TN_RPT_1020_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		TN_RPT_1020_LCURLISTRecord curlistRec = (TN_RPT_1020_LCURLISTRecord)ds.curlist.get(i);%>
HTML �ڵ��....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= curlistRec.receiptidx%>
<%= curlistRec.receiptcode%>
<%= curlistRec.receiptyear%>
<%= curlistRec.issuedate%>
<%= curlistRec.receiptname%>
<%= curlistRec.name%>
<%= curlistRec.isanonymous%>
<%= curlistRec.regno%>
<%= curlistRec.issuecount%>
<%= curlistRec.price%>
<%= curlistRec.membertype%>
<%= curlistRec.address%>
<%= curlistRec.isreissue%>
<%= curlistRec.donatorcategory%>
<%= curlistRec.receiptcategory%>
<%= curlistRec.paymentcount%>
<%= curlistRec.mindate%>
<%= curlistRec.maxdate%>
<%= curlistRec.samepaymentcount%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Mon Aug 29 11:14:43 KST 2016 */
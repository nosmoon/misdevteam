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


public class TN_DNS_3010_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public TN_DNS_3010_LDataSet(){}
	public TN_DNS_3010_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(11);
		while(rset0.next()){
			TN_DNS_3010_LCURLISTRecord rec = new TN_DNS_3010_LCURLISTRecord();
			rec.receiptidx = Util.checkString(rset0.getString("receiptidx"));
			rec.memberidx = Util.checkString(rset0.getString("memberidx"));
			rec.deptidx = Util.checkString(rset0.getString("deptidx"));
			rec.receiptcode = Util.checkString(rset0.getString("receiptcode"));
			rec.name = Util.checkString(rset0.getString("name"));
			rec.issuecategory = Util.checkString(rset0.getString("issuecategory"));
			rec.issuedate = Util.checkString(rset0.getString("issuedate"));
			rec.donatorcategory = Util.checkString(rset0.getString("donatorcategory"));
			rec.receiptcategory = Util.checkString(rset0.getString("receiptcategory"));
			rec.price = Util.checkString(rset0.getString("price"));
			rec.membername = Util.checkString(rset0.getString("membername"));
			rec.paymentissue = Util.checkString(rset0.getString("paymentissue"));
			rec.issuecount = Util.checkString(rset0.getString("issuecount"));
			rec.isdeleted = Util.checkString(rset0.getString("isdeleted"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	TN_DNS_3010_LDataSet ds = (TN_DNS_3010_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		TN_DNS_3010_LCURLISTRecord curlistRec = (TN_DNS_3010_LCURLISTRecord)ds.curlist.get(i);%>
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
<%= curlistRec.memberidx%>
<%= curlistRec.deptidx%>
<%= curlistRec.receiptcode%>
<%= curlistRec.name%>
<%= curlistRec.issuecategory%>
<%= curlistRec.issuedate%>
<%= curlistRec.donatorcategory%>
<%= curlistRec.membertype%>
<%= curlistRec.price%>
<%= curlistRec.membername%>
<%= curlistRec.paymentissue%>
<%= curlistRec.issuecount%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Tue Jun 21 19:16:21 KST 2016 */
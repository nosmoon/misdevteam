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


public class TN_DNS_3160_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public TN_DNS_3160_LDataSet(){}
	public TN_DNS_3160_LDataSet(String errcode, String errmsg){
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
			TN_DNS_3160_LCURLISTRecord rec = new TN_DNS_3160_LCURLISTRecord();
			rec.receiptbulkissueidx = Util.checkString(rset0.getString("receiptbulkissueidx"));
			rec.issuname = Util.checkString(rset0.getString("issuname"));
			rec.donatorcategory = Util.checkString(rset0.getString("donatorcategory"));
			rec.receiptcategory = Util.checkString(rset0.getString("receiptcategory"));
			rec.price = Util.checkString(rset0.getString("price"));
			rec.memberidx = Util.checkString(rset0.getString("memberidx"));
			rec.membercategorycode = Util.checkString(rset0.getString("membercategorycode"));
			rec.receiptidx = Util.checkString(rset0.getString("receiptidx"));
			rec.name = Util.checkString(rset0.getString("name"));
			rec.paymenttype = Util.checkString(rset0.getString("paymenttype"));
			rec.receiptcode = Util.checkString(rset0.getString("receiptcode"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	TN_DNS_3160_LDataSet ds = (TN_DNS_3160_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		TN_DNS_3160_LCURLISTRecord curlistRec = (TN_DNS_3160_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.receiptbulkissueidx%>
<%= curlistRec.issuname%>
<%= curlistRec.donatorcategory%>
<%= curlistRec.receiptcategory%>
<%= curlistRec.price%>
<%= curlistRec.memberidx%>
<%= curlistRec.membercategorycode%>
<%= curlistRec.receiptidx%>
<%= curlistRec.name%>
<%= curlistRec.paymenttype%>
<%= curlistRec.receiptcode%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Tue Dec 13 19:46:12 KST 2016 */
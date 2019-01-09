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


public class TN_DNS_2010_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public TN_DNS_2010_LDataSet(){}
	public TN_DNS_2010_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(26);
		while(rset0.next()){
			TN_DNS_2010_LCURLISTRecord rec = new TN_DNS_2010_LCURLISTRecord();
			rec.membercode = Util.checkString(rset0.getString("membercode"));
			rec.memberidx = Util.checkString(rset0.getString("memberidx"));
			rec.name = Util.checkString(rset0.getString("name"));
			rec.membertype = Util.checkString(rset0.getString("membertype"));
			rec.promisecode = Util.checkString(rset0.getString("promisecode"));
			rec.promiseprice = Util.checkString(rset0.getString("promiseprice"));
			rec.payprice = Util.checkString(rset0.getString("payprice"));
			rec.payrate = Util.checkString(rset0.getString("payrate"));
			rec.fundtype = Util.checkString(rset0.getString("fundtype"));
			rec.paymethodcode = Util.checkString(rset0.getString("paymethodcode"));
			rec.issuedate = Util.checkString(rset0.getString("issuedate"));
			rec.contactdate = Util.checkString(rset0.getString("contactdate"));
			rec.senddate = Util.checkString(rset0.getString("senddate"));
			rec.cellphone = Util.checkString(rset0.getString("cellphone"));
			rec.birthday = Util.checkString(rset0.getString("birthday"));
			rec.bankaccountowner = Util.checkString(rset0.getString("bankaccountowner"));
			rec.memo = Util.checkString(rset0.getString("memo"));
			rec.promise_status = Util.checkString(rset0.getString("promise_status"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	TN_DNS_2010_LDataSet ds = (TN_DNS_2010_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		TN_DNS_2010_LCURLISTRecord curlistRec = (TN_DNS_2010_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.membercode%>
<%= curlistRec.memberidx%>
<%= curlistRec.name%>
<%= curlistRec.membertype%>
<%= curlistRec.promisecode%>
<%= curlistRec.promiseprice%>
<%= curlistRec.payprice%>
<%= curlistRec.payrate%>
<%= curlistRec.fundtype%>
<%= curlistRec.paymethodcode%>
<%= curlistRec.issuedate%>
<%= curlistRec.contactdate%>
<%= curlistRec.senddate%>
<%= curlistRec.cellphone%>
<%= curlistRec.birthday%>
<%= curlistRec.bankaccountowner%>
<%= curlistRec.memo%>
<%= curlistRec.promise_status%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Wed Jan 11 15:15:06 KST 2017 */
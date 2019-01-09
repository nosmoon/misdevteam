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


package chosun.ciis.tn.lnk.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.tn.lnk.dm.*;
import chosun.ciis.tn.lnk.rec.*;

/**
 * 
 */


public class TN_LNK_4110_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public TN_LNK_4110_LDataSet(){}
	public TN_LNK_4110_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(8);
		while(rset0.next()){
			TN_LNK_4110_LCURLISTRecord rec = new TN_LNK_4110_LCURLISTRecord();
			rec.umsidx = Util.checkString(rset0.getString("umsidx"));
			rec.deptidx = Util.checkString(rset0.getString("deptidx"));
			rec.status = Util.checkString(rset0.getString("status"));
			rec.purpose = Util.checkString(rset0.getString("purpose"));
			rec.sendtype = Util.checkString(rset0.getString("sendtype"));
			rec.title = Util.checkString(rset0.getString("title"));
			rec.startdate = Util.checkString(rset0.getString("startdate"));
			rec.receiver = Util.checkString(rset0.getString("receiver"));
			rec.receiver_s = Util.checkString(rset0.getString("receiver_s"));
			rec.receiver_f = Util.checkString(rset0.getString("receiver_f"));
			rec.writedate = Util.checkString(rset0.getString("writedate"));
			this.curlist.add(rec);
		} 
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	TN_LNK_4110_LDataSet ds = (TN_LNK_4110_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		TN_LNK_4110_LCURLISTRecord curlistRec = (TN_LNK_4110_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.umsidx%>
<%= curlistRec.deptidx%>
<%= curlistRec.status%>
<%= curlistRec.purpose%>
<%= curlistRec.sendtype%>
<%= curlistRec.startdate%>
<%= curlistRec.receiver%>
<%= curlistRec.receiver_s%>
<%= curlistRec.receiver_s%>
<%= curlistRec.receiver_f%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Thu Aug 18 20:21:21 KST 2016 */
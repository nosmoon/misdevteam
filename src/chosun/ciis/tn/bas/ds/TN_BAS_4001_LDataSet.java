/***************************************************************************************************
* ���ϸ� : .java
* ��� : 
* �ۼ����� : 
* �ۼ��� : ���½�
***************************************************************************************************/
/***************************************************************************************************
* �������� : 
* ������ : 
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.tn.bas.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.tn.bas.dm.*;
import chosun.ciis.tn.bas.rec.*;

/**
 * 
 */


public class TN_BAS_4001_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist2 = new ArrayList();
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public TN_BAS_4001_LDataSet(){}
	public TN_BAS_4001_LDataSet(String errcode, String errmsg){
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
			TN_BAS_4001_LCURLISTRecord rec = new TN_BAS_4001_LCURLISTRecord();
			rec.receiptcodeidx = Util.checkString(rset0.getString("receiptcodeidx"));
			rec.category = Util.checkString(rset0.getString("category"));
			rec.receiptcode = Util.checkString(rset0.getString("receiptcode"));
			rec.receiptcodetype = Util.checkString(rset0.getString("receiptcodetype"));
			rec.description = Util.checkString(rset0.getString("description"));
			rec.useinsert = Util.checkString(rset0.getString("useinsert"));
			this.curlist.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(5);
		while(rset1.next()){
			TN_BAS_4001_LCURLIST2Record rec = new TN_BAS_4001_LCURLIST2Record();
			rec.receiptcodeidx = Util.checkString(rset1.getString("receiptcodeidx"));
			rec.category = Util.checkString(rset1.getString("category"));
			rec.receiptcode = Util.checkString(rset1.getString("receiptcode"));
			rec.receiptcodetype = Util.checkString(rset1.getString("receiptcodetype"));
			rec.description = Util.checkString(rset1.getString("description"));
			rec.useinsert = Util.checkString(rset1.getString("useinsert"));
			this.curlist2.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	TN_BAS_4001_LDataSet ds = (TN_BAS_4001_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		TN_BAS_4001_LCURLISTRecord curlistRec = (TN_BAS_4001_LCURLISTRecord)ds.curlist.get(i);%>
HTML �ڵ��....
	<%}%>

<%
	for(int i=0; i<ds.curlist2.size(); i++){
		TN_BAS_4001_LCURLIST2Record curlist2Rec = (TN_BAS_4001_LCURLIST2Record)ds.curlist2.get(i);%>
HTML �ڵ��....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist()%>
<%= ds.getCurlist2()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= curlistRec.receiptcodeidx%>
<%= curlistRec.category%>
<%= curlistRec.receiptcode%>
<%= curlistRec.receiptcodetype%>
<%= curlistRec.description%>
<%= curlistRec.useinsert%>
<%= curlist2Rec.receiptcodeidx%>
<%= curlist2Rec.category%>
<%= curlist2Rec.receiptcode%>
<%= curlist2Rec.receiptcodetype%>
<%= curlist2Rec.description%>
<%= curlist2Rec.useinsert%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Thu Jun 30 14:08:53 KST 2016 */
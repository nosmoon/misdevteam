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


public class FC_ACCT_5040_SDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist4 = new ArrayList();
	public ArrayList curlist3 = new ArrayList();
	public ArrayList curlist2 = new ArrayList();
	public ArrayList curlist1 = new ArrayList();
	public ArrayList curlist7 = new ArrayList();
	public ArrayList curlist6 = new ArrayList();
	public ArrayList curlist5 = new ArrayList();
	public String errcode;
	public String errmsg;

	public FC_ACCT_5040_SDataSet(){}
	public FC_ACCT_5040_SDataSet(String errcode, String errmsg){
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
			FC_ACCT_5040_SCURLIST1Record rec = new FC_ACCT_5040_SCURLIST1Record();
			rec.cnt = Util.checkString(rset0.getString("cnt"));
			this.curlist1.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(6);
		while(rset1.next()){
			FC_ACCT_5040_SCURLIST2Record rec = new FC_ACCT_5040_SCURLIST2Record();
			rec.cnt = Util.checkString(rset1.getString("cnt"));
			this.curlist2.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(7);
		while(rset2.next()){
			FC_ACCT_5040_SCURLIST3Record rec = new FC_ACCT_5040_SCURLIST3Record();
			rec.cnt = Util.checkString(rset2.getString("cnt"));
			this.curlist3.add(rec);
		}
		ResultSet rset3 = (ResultSet) cstmt.getObject(8);
		while(rset3.next()){
			FC_ACCT_5040_SCURLIST4Record rec = new FC_ACCT_5040_SCURLIST4Record();
			rec.cnt = Util.checkString(rset3.getString("cnt"));
			this.curlist4.add(rec);
		}
		ResultSet rset4 = (ResultSet) cstmt.getObject(9);
		while(rset4.next()){
			FC_ACCT_5040_SCURLIST5Record rec = new FC_ACCT_5040_SCURLIST5Record();
			rec.cnt = Util.checkString(rset4.getString("cnt"));
			this.curlist5.add(rec);
		}
		ResultSet rset5 = (ResultSet) cstmt.getObject(10);
		while(rset5.next()){
			FC_ACCT_5040_SCURLIST6Record rec = new FC_ACCT_5040_SCURLIST6Record();
			rec.cnt = Util.checkString(rset5.getString("cnt"));
			this.curlist6.add(rec);
		}
		ResultSet rset6 = (ResultSet) cstmt.getObject(11);
		while(rset6.next()){
			FC_ACCT_5040_SCURLIST7Record rec = new FC_ACCT_5040_SCURLIST7Record();
			rec.cnt = Util.checkString(rset6.getString("cnt"));
			this.curlist7.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	FC_ACCT_5040_SDataSet ds = (FC_ACCT_5040_SDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		FC_ACCT_5040_SCURLIST1Record curlist1Rec = (FC_ACCT_5040_SCURLIST1Record)ds.curlist1.get(i);%>
HTML �ڵ��....
	<%}%>

<%
	for(int i=0; i<ds.curlist2.size(); i++){
		FC_ACCT_5040_SCURLIST2Record curlist2Rec = (FC_ACCT_5040_SCURLIST2Record)ds.curlist2.get(i);%>
HTML �ڵ��....
	<%}%>

<%
	for(int i=0; i<ds.curlist3.size(); i++){
		FC_ACCT_5040_SCURLIST3Record curlist3Rec = (FC_ACCT_5040_SCURLIST3Record)ds.curlist3.get(i);%>
HTML �ڵ��....
	<%}%>

<%
	for(int i=0; i<ds.curlist4.size(); i++){
		FC_ACCT_5040_SCURLIST4Record curlist4Rec = (FC_ACCT_5040_SCURLIST4Record)ds.curlist4.get(i);%>
HTML �ڵ��....
	<%}%>

<%
	for(int i=0; i<ds.curlist5.size(); i++){
		FC_ACCT_5040_SCURLIST5Record curlist5Rec = (FC_ACCT_5040_SCURLIST5Record)ds.curlist5.get(i);%>
HTML �ڵ��....
	<%}%>

<%
	for(int i=0; i<ds.curlist6.size(); i++){
		FC_ACCT_5040_SCURLIST6Record curlist6Rec = (FC_ACCT_5040_SCURLIST6Record)ds.curlist6.get(i);%>
HTML �ڵ��....
	<%}%>

<%
	for(int i=0; i<ds.curlist7.size(); i++){
		FC_ACCT_5040_SCURLIST7Record curlist7Rec = (FC_ACCT_5040_SCURLIST7Record)ds.curlist7.get(i);%>
HTML �ڵ��....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist1()%>
<%= ds.getCurlist2()%>
<%= ds.getCurlist3()%>
<%= ds.getCurlist4()%>
<%= ds.getCurlist5()%>
<%= ds.getCurlist6()%>
<%= ds.getCurlist7()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= curlist1Rec.cnt%>
<%= curlist2Rec.cnt%>
<%= curlist3Rec.cnt%>
<%= curlist4Rec.cnt%>
<%= curlist5Rec.cnt%>
<%= curlist6Rec.cnt%>
<%= curlist7Rec.cnt%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Tue Jul 28 19:51:49 KST 2009 */
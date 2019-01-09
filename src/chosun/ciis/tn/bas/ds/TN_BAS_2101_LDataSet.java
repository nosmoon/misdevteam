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


public class TN_BAS_2101_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist_3 = new ArrayList();
	public ArrayList curlist_2 = new ArrayList();
	public ArrayList curlist_1 = new ArrayList();
	public String errcode;
	public String errmsg;

	public TN_BAS_2101_LDataSet(){}
	public TN_BAS_2101_LDataSet(String errcode, String errmsg){
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
			TN_BAS_2101_LCURLIST_1Record rec = new TN_BAS_2101_LCURLIST_1Record();
			rec.relationidx = Util.checkString(rset0.getString("relationidx"));
			rec.relationtype = Util.checkString(rset0.getString("relationtype"));
			rec.relationtype_nm = Util.checkString(rset0.getString("relationtype_nm"));
			rec.relation1 = Util.checkString(rset0.getString("relation1"));
			rec.relation2 = Util.checkString(rset0.getString("relation2"));
			rec.displayorder = Util.checkString(rset0.getString("displayorder"));
			this.curlist_1.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(5);
		while(rset1.next()){
			TN_BAS_2101_LCURLIST_2Record rec = new TN_BAS_2101_LCURLIST_2Record();
			rec.relationidx = Util.checkString(rset1.getString("relationidx"));
			rec.relationtype = Util.checkString(rset1.getString("relationtype"));
			rec.relationtype_nm = Util.checkString(rset1.getString("relationtype_nm"));
			rec.relation1 = Util.checkString(rset1.getString("relation1"));
			rec.relation2 = Util.checkString(rset1.getString("relation2"));
			rec.displayorder = Util.checkString(rset1.getString("displayorder"));
			this.curlist_2.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(6);
		while(rset2.next()){
			TN_BAS_2101_LCURLIST_3Record rec = new TN_BAS_2101_LCURLIST_3Record();
			rec.relationidx = Util.checkString(rset2.getString("relationidx"));
			rec.relationtype = Util.checkString(rset2.getString("relationtype"));
			rec.relationtype_nm = Util.checkString(rset2.getString("relationtype_nm"));
			rec.relation1 = Util.checkString(rset2.getString("relation1"));
			rec.relation2 = Util.checkString(rset2.getString("relation2"));
			rec.displayorder = Util.checkString(rset2.getString("displayorder"));
			this.curlist_3.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	TN_BAS_2101_LDataSet ds = (TN_BAS_2101_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist_1.size(); i++){
		TN_BAS_2101_LCURLIST_1Record curlist_1Rec = (TN_BAS_2101_LCURLIST_1Record)ds.curlist_1.get(i);%>
HTML �ڵ��....
	<%}%>

<%
	for(int i=0; i<ds.curlist_2.size(); i++){
		TN_BAS_2101_LCURLIST_2Record curlist_2Rec = (TN_BAS_2101_LCURLIST_2Record)ds.curlist_2.get(i);%>
HTML �ڵ��....
	<%}%>

<%
	for(int i=0; i<ds.curlist_3.size(); i++){
		TN_BAS_2101_LCURLIST_3Record curlist_3Rec = (TN_BAS_2101_LCURLIST_3Record)ds.curlist_3.get(i);%>
HTML �ڵ��....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist_1()%>
<%= ds.getCurlist_2()%>
<%= ds.getCurlist_3()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= curlist_1Rec.relationidx%>
<%= curlist_1Rec.relationtype%>
<%= curlist_1Rec.relationtype_nm%>
<%= curlist_1Rec.relation1%>
<%= curlist_1Rec.relation2%>
<%= curlist_1Rec.displayorder%>
<%= curlist_2Rec.relationidx%>
<%= curlist_2Rec.relationtype%>
<%= curlist_2Rec.relationtype_nm%>
<%= curlist_2Rec.relation1%>
<%= curlist_2Rec.relation2%>
<%= curlist_2Rec.displayorder%>
<%= curlist_3Rec.relationidx%>
<%= curlist_3Rec.relationtype%>
<%= curlist_3Rec.relationtype_nm%>
<%= curlist_3Rec.relation1%>
<%= curlist_3Rec.relation2%>
<%= curlist_3Rec.displayorder%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Thu Jul 14 14:03:37 KST 2016 */
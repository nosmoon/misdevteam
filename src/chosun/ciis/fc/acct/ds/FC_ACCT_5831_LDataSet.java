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


public class FC_ACCT_5831_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public FC_ACCT_5831_LDataSet(){}
	public FC_ACCT_5831_LDataSet(String errcode, String errmsg){
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
		if(!"".equals(this.errcode)){			return;		}
		ResultSet rset0 = (ResultSet) cstmt.getObject(5);
		while(rset0.next()){
			FC_ACCT_5831_LCURLISTRecord rec = new FC_ACCT_5831_LCURLISTRecord();
			rec.acct_cd = Util.checkString(rset0.getString("acct_cd"));
			rec.acacctnm = Util.checkString(rset0.getString("acacctnm"));
			rec.mang_clsf_cd = Util.checkString(rset0.getString("mang_clsf_cd"));
			rec.jbgwgbnm = Util.checkString(rset0.getString("jbgwgbnm"));
			rec.kind = Util.checkString(rset0.getString("kind"));
			rec.prvdd_bal = Util.checkString(rset0.getString("prvdd_bal"));
			rec.dr_amt = Util.checkString(rset0.getString("dr_amt"));
			rec.crdt_amt = Util.checkString(rset0.getString("crdt_amt"));
			rec.curdd_bal = Util.checkString(rset0.getString("curdd_bal"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	FC_ACCT_5831_LDataSet ds = (FC_ACCT_5831_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		FC_ACCT_5831_LCURLISTRecord curlistRec = (FC_ACCT_5831_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.acct_cd%>
<%= curlistRec.acacctnm%>
<%= curlistRec.mang_clsf_cd%>
<%= curlistRec.jbgwgbnm%>
<%= curlistRec.kind%>
<%= curlistRec.prvdd_bal%>
<%= curlistRec.dr_amt%>
<%= curlistRec.crdt_amt%>
<%= curlistRec.curdd_bal%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Tue Mar 10 21:19:09 KST 2009 */
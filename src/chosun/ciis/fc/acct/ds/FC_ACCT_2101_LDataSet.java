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


public class FC_ACCT_2101_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public FC_ACCT_2101_LDataSet(){}
	public FC_ACCT_2101_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(7);
		while(rset0.next()){
			FC_ACCT_2101_LCURLISTRecord rec = new FC_ACCT_2101_LCURLISTRecord();
			rec.slip_no = Util.checkString(rset0.getString("slip_no"));
			rec.rmks1 = Util.checkString(rset0.getString("rmks1"));
			rec.rmks2 = Util.checkString(rset0.getString("rmks2"));
			rec.fisc_dt = Util.checkString(rset0.getString("fisc_dt"));
			rec.incmg_dt = Util.checkString(rset0.getString("incmg_dt"));
			rec.draft_impt_amt1 = Util.checkString(rset0.getString("draft_impt_amt1"));
			rec.draft_expn_amt1 = Util.checkString(rset0.getString("draft_expn_amt1"));
			rec.draft_impt_amt2 = Util.checkString(rset0.getString("draft_impt_amt2"));
			rec.draft_expn_amt2 = Util.checkString(rset0.getString("draft_expn_amt2"));
			rec.draft_impt_amt = Util.checkString(rset0.getString("draft_impt_amt"));
			rec.draft_expn_amt = Util.checkString(rset0.getString("draft_expn_amt"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	FC_ACCT_2101_LDataSet ds = (FC_ACCT_2101_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		FC_ACCT_2101_LCURLISTRecord curlistRec = (FC_ACCT_2101_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.slip_no%>
<%= curlistRec.rmks1%>
<%= curlistRec.rmks2%>
<%= curlistRec.fisc_dt%>
<%= curlistRec.incmg_dt%>
<%= curlistRec.draft_impt_amt1%>
<%= curlistRec.draft_expn_amt1%>
<%= curlistRec.draft_impt_amt2%>
<%= curlistRec.draft_expn_amt2%>
<%= curlistRec.draft_impt_amt%>
<%= curlistRec.draft_expn_amt%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Mon Jul 06 17:18:23 KST 2009 */
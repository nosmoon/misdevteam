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


public class TN_BAS_3301_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public TN_BAS_3301_LDataSet(){}
	public TN_BAS_3301_LDataSet(String errcode, String errmsg){
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

		ResultSet rset8 = (ResultSet) cstmt.getObject(4);
		while(rset8.next()){
			TN_BAS_3301_LCURLISTRecord rec = new TN_BAS_3301_LCURLISTRecord();
			rec.bankaccountcode = Util.checkString(rset8.getString("bankaccountcode"));
			rec.bankcode = Util.checkString(rset8.getString("bankcode"));
			rec.bank = Util.checkString(rset8.getString("bank"));
			rec.branch = Util.checkString(rset8.getString("branch"));
			rec.bankaccount = Util.checkString(rset8.getString("bankaccount"));
			rec.bankaccountowner = Util.checkString(rset8.getString("bankaccountowner"));
			rec.memo = Util.checkString(rset8.getString("memo"));
			rec.useinsert = Util.checkString(rset8.getString("useinsert"));
			rec.useinsert_nm = Util.checkString(rset8.getString("useinsert_nm"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	TN_BAS_3301_LDataSet ds = (TN_BAS_3301_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		TN_BAS_3301_LCURLISTRecord curlistRec = (TN_BAS_3301_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.bankaccountcode%>
<%= curlistRec.bankcode%>
<%= curlistRec.bank%>
<%= curlistRec.branch%>
<%= curlistRec.bankaccount%>
<%= curlistRec.bankaccountowner%>
<%= curlistRec.memo%>
<%= curlistRec.useinsert%>
<%= curlistRec.useinsert_nm%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Wed Jun 22 18:08:41 KST 2016 */
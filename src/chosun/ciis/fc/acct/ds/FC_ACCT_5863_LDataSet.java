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


public class FC_ACCT_5863_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public FC_ACCT_5863_LDataSet(){}
	public FC_ACCT_5863_LDataSet(String errcode, String errmsg){
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
		ResultSet rset2 = (ResultSet) cstmt.getObject(6);
		while(rset2.next()){
			FC_ACCT_5863_LCURLISTRecord rec = new FC_ACCT_5863_LCURLISTRecord();
			rec.slip_clsf_cd = Util.checkString(rset2.getString("slip_clsf_cd"));
			rec.pch_amt1 = Util.checkString(rset2.getString("pch_amt1"));
			rec.pch_amt2 = Util.checkString(rset2.getString("pch_amt2"));
			rec.pch_amt3 = Util.checkString(rset2.getString("pch_amt3"));
			rec.pch_amt4 = Util.checkString(rset2.getString("pch_amt4"));
			rec.pch_amt5 = Util.checkString(rset2.getString("pch_amt5"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	FC_ACCT_5863_LDataSet ds = (FC_ACCT_5863_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		FC_ACCT_5863_LCURLISTRecord curlistRec = (FC_ACCT_5863_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.slip_clsf_cd%>
<%= curlistRec.pch_amt1%>
<%= curlistRec.pch_amt2%>
<%= curlistRec.pch_amt3%>
<%= curlistRec.pch_amt4%>
<%= curlistRec.pch_amt5%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Wed Mar 11 12:06:55 KST 2009 */
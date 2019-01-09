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


public class FC_ACCT_5530_PDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curacctsum = new ArrayList();
	public ArrayList curcommlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public FC_ACCT_5530_PDataSet(){}
	public FC_ACCT_5530_PDataSet(String errcode, String errmsg){
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

		ResultSet rset3 = (ResultSet) cstmt.getObject(6);
		while(rset3.next()){
			FC_ACCT_5530_PCURCOMMLISTRecord rec = new FC_ACCT_5530_PCURCOMMLISTRecord();
			this.curcommlist.add(rec);
		}
		ResultSet rset4 = (ResultSet) cstmt.getObject(7);
		while(rset4.next()){
			FC_ACCT_5530_PCURACCTSUMRecord rec = new FC_ACCT_5530_PCURACCTSUMRecord();
			this.curacctsum.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	FC_ACCT_5530_PDataSet ds = (FC_ACCT_5530_PDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curcommlist.size(); i++){
		FC_ACCT_5530_PCURCOMMLISTRecord curcommlistRec = (FC_ACCT_5530_PCURCOMMLISTRecord)ds.curcommlist.get(i);%>
HTML �ڵ��....
	<%}%>

<%
	for(int i=0; i<ds.curacctsum.size(); i++){
		FC_ACCT_5530_PCURACCTSUMRecord curacctsumRec = (FC_ACCT_5530_PCURACCTSUMRecord)ds.curacctsum.get(i);%>
HTML �ڵ��....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurcommlist()%>
<%= ds.getCuracctsum()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Mon Aug 10 16:00:46 KST 2009 */
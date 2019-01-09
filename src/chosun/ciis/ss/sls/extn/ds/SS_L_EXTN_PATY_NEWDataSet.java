/***************************************************************************************************
* ���ϸ� : .java
* ��� : �Ǹ�-��������-�̻絶�ڼ�����Ȳ
* �ۼ����� : 2011-12-05
* �ۼ��� : �̱⿵
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.ss.sls.extn.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.extn.dm.*;
import chosun.ciis.ss.sls.extn.rec.*;

/**
 * 
 */


public class SS_L_EXTN_PATY_NEWDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList userlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public SS_L_EXTN_PATY_NEWDataSet(){}
	public SS_L_EXTN_PATY_NEWDataSet(String errcode, String errmsg){
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
			SS_L_EXTN_PATY_NEWUSERLISTRecord rec = new SS_L_EXTN_PATY_NEWUSERLISTRecord();
			rec.empseq = Util.checkString(rset0.getString("empseq"));
			rec.cmpycd = Util.checkString(rset0.getString("cmpycd"));
			rec.prn = Util.checkString(rset0.getString("prn"));
			rec.empnm = Util.checkString(rset0.getString("empnm"));
			rec.deptnm = Util.checkString(rset0.getString("deptnm"));
			this.userlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	SS_L_EXTN_PATY_NEWDataSet ds = (SS_L_EXTN_PATY_NEWDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.userlist.size(); i++){
		SS_L_EXTN_PATY_NEWUSERLISTRecord userlistRec = (SS_L_EXTN_PATY_NEWUSERLISTRecord)ds.userlist.get(i);%>
HTML �ڵ��....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getUserlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= userlistRec.nm%>
<%= userlistRec.deptnm%>
<%= userlistRec.acct_cd%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Mon May 21 15:49:34 KST 2012 */
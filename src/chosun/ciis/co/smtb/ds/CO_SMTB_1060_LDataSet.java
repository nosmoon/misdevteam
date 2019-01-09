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


package chosun.ciis.co.smtb.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.co.smtb.dm.*;
import chosun.ciis.co.smtb.rec.*;

/**
 * 
 */


public class CO_SMTB_1060_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList cert_stmtlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public CO_SMTB_1060_LDataSet(){}
	public CO_SMTB_1060_LDataSet(String errcode, String errmsg){
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
		this.errcode = Util.checkString(cstmt.getString(2));
		this.errmsg = Util.checkString(cstmt.getString(3));
		if(!"".equals(this.errcode)){
			return;
		}

		ResultSet rset0 = (ResultSet) cstmt.getObject(4);
		while(rset0.next()){
			CO_SMTB_1060_LCERT_STMTLISTRecord rec = new CO_SMTB_1060_LCERT_STMTLISTRecord();
			rec.cert_regno = Util.checkString(rset0.getString("cert_regno"));
			rec.cert_comname = Util.checkString(rset0.getString("cert_comname"));
			rec.userdn = Util.checkString(rset0.getString("userdn"));
			rec.userinfo = Util.checkString(rset0.getString("userinfo"));
			rec.userinfoyn = Util.checkString(rset0.getString("userinfoyn"));
			rec.expiration_dt = Util.checkString(rset0.getString("expiration_dt"));
			this.cert_stmtlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	CO_SMTB_1060_LDataSet ds = (CO_SMTB_1060_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.cert_stmtlist.size(); i++){
		CO_SMTB_1060_LCERT_STMTLISTRecord cert_stmtlistRec = (CO_SMTB_1060_LCERT_STMTLISTRecord)ds.cert_stmtlist.get(i);%>
HTML �ڵ��....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCert_stmtlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= cert_stmtlistRec.cert_regno%>
<%= cert_stmtlistRec.cert_comname%>
<%= cert_stmtlistRec.userdn%>
<%= cert_stmtlistRec.userinfo%>
<%= cert_stmtlistRec.userinfoyn%>
<%= cert_stmtlistRec.expiration_dt%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Wed Dec 05 11:17:28 KST 2012 */
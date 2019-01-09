/***************************************************************************************************
* ���ϸ� : .java
* ��� : ���� - ���ݰ�꼭 ����� ��ȸ
* �ۼ����� : 2011-05-16
* �ۼ��� : ������
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
 * ���� - ���ݰ�꼭 �������ȸ
 */


public class CO_SMTB_1070_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList fnd_userlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public CO_SMTB_1070_LDataSet(){}
	public CO_SMTB_1070_LDataSet(String errcode, String errmsg){
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
			CO_SMTB_1070_LFND_USERLISTRecord rec = new CO_SMTB_1070_LFND_USERLISTRecord();
			rec.fnd_user = Util.checkString(rset0.getString("fnd_user"));
			rec.fnd_regno = Util.checkString(rset0.getString("fnd_regno"));
			rec.fnd_user_name = Util.checkString(rset0.getString("fnd_user_name"));
			rec.smart_id = Util.checkString(rset0.getString("smart_id"));
			rec.smart_password = Util.checkString(rset0.getString("smart_password"));
			rec.smart_email = Util.checkString(rset0.getString("smart_email"));
			this.fnd_userlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	CO_SMTB_1070_LDataSet ds = (CO_SMTB_1070_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.fnd_userlist.size(); i++){
		CO_SMTB_1070_LFND_USERLISTRecord fnd_userlistRec = (CO_SMTB_1070_LFND_USERLISTRecord)ds.fnd_userlist.get(i);%>
HTML �ڵ��....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getFnd_userlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= fnd_userlistRec.fnd_user%>
<%= fnd_userlistRec.fnd_regno%>
<%= fnd_userlistRec.fnd_user_name%>
<%= fnd_userlistRec.smart_id%>
<%= fnd_userlistRec.smart_email%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Mon May 16 10:50:31 KST 2011 */
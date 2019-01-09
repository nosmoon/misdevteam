/***************************************************************************************************
* ���ϸ� : .java
* ��� : Ȯ����Ȳ/��üȮ��/���ã��  
* �ۼ����� : 2009-06-02
* �ۼ��� : ������
***************************************************************************************************/


package chosun.ciis.ss.sls.extn.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.extn.dm.*;
import chosun.ciis.ss.sls.extn.rec.*;

/**
 * Ȯ����Ȳ/��üȮ��/���ã��
 */

public class SS_L_EXTN_PATYDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList userlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public SS_L_EXTN_PATYDataSet(){}
	public SS_L_EXTN_PATYDataSet(String errcode, String errmsg){
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
			SS_L_EXTN_PATYUSERLISTRecord rec = new SS_L_EXTN_PATYUSERLISTRecord();
			rec.flnm = Util.checkString(rset0.getString("flnm"));
			rec.dept_cd = Util.checkString(rset0.getString("dept_cd"));
			rec.dept_nm = Util.checkString(rset0.getString("dept_nm"));
			rec.bank_nm = Util.checkString(rset0.getString("bank_nm"));
			rec.acct_no = Util.checkString(rset0.getString("acct_no"));
			this.userlist.add(rec);
		}
	}

	public String userlistOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = userlist.size();
		for(int i=0; i<size; i++){
			SS_L_EXTN_PATYUSERLISTRecord rec = (SS_L_EXTN_PATYUSERLISTRecord)userlist.get(i);
			
			
			String code = rec.flnm;
			String name = rec.dept_cd;
			
			sb.append("<option value=\"");
			sb.append(code);
			sb.append("\"");
			if(code.equals(selected)){
				sb.append(" selected ");
			}
			sb.append(">");
			sb.append(name);
			sb.append("</option>");
		}
		return sb.toString();
	}

	public String userlistChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = userlist.size();
		for(int i=0; i<size; i++){
			SS_L_EXTN_PATYUSERLISTRecord rec = (SS_L_EXTN_PATYUSERLISTRecord)userlist.get(i);
			
			
			String code = rec.flnm;
			String name = rec.dept_cd;
			
			sb.append("<input name=\"");
			sb.append("flnm");
			sb.append("\" type=\"checkbox\" value=\"");
			sb.append(code);
			sb.append("\"");
			if(code.equals(selected)){
				sb.append(" checked ");
			}
			sb.append(">");
			sb.append(name);
			sb.append("</input>");
		}
		return sb.toString();
	}

	public String userlistRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = userlist.size();
		for(int i=0; i<size; i++){
			SS_L_EXTN_PATYUSERLISTRecord rec = (SS_L_EXTN_PATYUSERLISTRecord)userlist.get(i);
			
			
			String code = rec.flnm;
			String name = rec.dept_cd;
			
			sb.append("<input name=\"");
			sb.append("flnm");
			sb.append("\" type=\"radio\" value=\"");
			sb.append(code);
			sb.append("\"");
			if(code.equals(selected)){
				sb.append(" checked ");
			}
			sb.append(">");
			sb.append(name);
			sb.append("</input>");
		}
		return sb.toString();
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	SS_L_EXTN_PATYDataSet ds = (SS_L_EXTN_PATYDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.userlist.size(); i++){
		SS_L_EXTN_PATYUSERLISTRecord userlistRec = (SS_L_EXTN_PATYUSERLISTRecord)ds.userlist.get(i);%>
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

<%= userlistRec.flnm%>
<%= userlistRec.dept_cd%>
<%= userlistRec.dept_nm%>
<%= userlistRec.bank_nm%>
<%= userlistRec.acct_no%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Tue Jun 02 17:41:22 KST 2009 */
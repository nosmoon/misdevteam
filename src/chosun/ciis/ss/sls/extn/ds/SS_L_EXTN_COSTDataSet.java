/***************************************************************************************************
* ���ϸ� : .java
* ��� : ���Ȯ������ ��ȸ
* �ۼ����� : 2009-05-29
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
 * ���Ȯ������ ��ȸ
 */

public class SS_L_EXTN_COSTDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList costlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public SS_L_EXTN_COSTDataSet(){}
	public SS_L_EXTN_COSTDataSet(String errcode, String errmsg){
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
		ResultSet rset0 = (ResultSet) cstmt.getObject(6);
		while(rset0.next()){
			SS_L_EXTN_COSTCOSTLISTRecord rec = new SS_L_EXTN_COSTCOSTLISTRecord();
			rec.medinm = Util.checkString(rset0.getString("medinm"));
			rec.rdr_extnbgndd = Util.checkString(rset0.getString("rdr_extnbgndd"));
			rec.rdr_extnto_dd = Util.checkString(rset0.getString("rdr_extnto_dd"));
			rec.rdr_extncampnm = Util.checkString(rset0.getString("rdr_extncampnm"));
			rec.rdr_extncost = Util.checkString(rset0.getString("rdr_extncost"));
			rec.remk = Util.checkString(rset0.getString("remk"));
			this.costlist.add(rec);
		}
	}

	public String costlistOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = costlist.size();
		for(int i=0; i<size; i++){
			SS_L_EXTN_COSTCOSTLISTRecord rec = (SS_L_EXTN_COSTCOSTLISTRecord)costlist.get(i);
			
			
			String code = rec.medinm;
			String name = rec.rdr_extnbgndd;
			
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

	public String costlistChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = costlist.size();
		for(int i=0; i<size; i++){
			SS_L_EXTN_COSTCOSTLISTRecord rec = (SS_L_EXTN_COSTCOSTLISTRecord)costlist.get(i);
			
			
			String code = rec.medinm;
			String name = rec.rdr_extnbgndd;
			
			sb.append("<input name=\"");
			sb.append("medinm");
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

	public String costlistRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = costlist.size();
		for(int i=0; i<size; i++){
			SS_L_EXTN_COSTCOSTLISTRecord rec = (SS_L_EXTN_COSTCOSTLISTRecord)costlist.get(i);
			
			
			String code = rec.medinm;
			String name = rec.rdr_extnbgndd;
			
			sb.append("<input name=\"");
			sb.append("medinm");
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
	SS_L_EXTN_COSTDataSet ds = (SS_L_EXTN_COSTDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.costlist.size(); i++){
		SS_L_EXTN_COSTCOSTLISTRecord costlistRec = (SS_L_EXTN_COSTCOSTLISTRecord)ds.costlist.get(i);%>
HTML �ڵ��....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCostlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= costlistRec.medinm%>
<%= costlistRec.rdr_extnbgndd%>
<%= costlistRec.rdr_extnto_dd%>
<%= costlistRec.rdr_extncampnm%>
<%= costlistRec.rdr_extncost%>
<%= costlistRec.remk%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Fri May 29 17:54:22 KST 2009 */
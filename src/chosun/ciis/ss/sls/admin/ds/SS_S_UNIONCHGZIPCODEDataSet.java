/***************************************************************************************************
* ���ϸ� : .java
* ��� : ������-��纰 �����ȣ ����ó�� ������ȸ
* �ۼ����� : 2009-05-01
* �ۼ��� : ������
***************************************************************************************************/


package chosun.ciis.ss.sls.admin.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.admin.dm.*;
import chosun.ciis.ss.sls.admin.rec.*;

/**
 * ������-��纰 �����ȣ ����ó�� ������ȸ
 */

public class SS_S_UNIONCHGZIPCODEDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList detaillist = new ArrayList();
	public String errcode;
	public String errmsg;

	public SS_S_UNIONCHGZIPCODEDataSet(){}
	public SS_S_UNIONCHGZIPCODEDataSet(String errcode, String errmsg){
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
		ResultSet rset0 = (ResultSet) cstmt.getObject(9);
		while(rset0.next()){
			SS_S_UNIONCHGZIPCODEDETAILLISTRecord rec = new SS_S_UNIONCHGZIPCODEDETAILLISTRecord();
			rec.zipcode = Util.checkString(rset0.getString("zipcode"));
			rec.newaddr1 = Util.checkString(rset0.getString("newaddr1"));
			rec.newaddr2 = Util.checkString(rset0.getString("newaddr2"));
			rec.newaddr3 = Util.checkString(rset0.getString("newaddr3"));
			rec.newaddr4 = Util.checkString(rset0.getString("newaddr4"));
			rec.newbgnbnji = Util.checkString(rset0.getString("newbgnbnji"));
			rec.newendbnji = Util.checkString(rset0.getString("newendbnji"));
			rec.bocd = Util.checkString(rset0.getString("bocd"));
			rec.bonm = Util.checkString(rset0.getString("bonm"));
			this.detaillist.add(rec);
		}
	}

	public String detaillistOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = detaillist.size();
		for(int i=0; i<size; i++){
			SS_S_UNIONCHGZIPCODEDETAILLISTRecord rec = (SS_S_UNIONCHGZIPCODEDETAILLISTRecord)detaillist.get(i);
			
			
			String code = rec.zipcode;
			String name = rec.newaddr1;
			
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

	public String detaillistChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = detaillist.size();
		for(int i=0; i<size; i++){
			SS_S_UNIONCHGZIPCODEDETAILLISTRecord rec = (SS_S_UNIONCHGZIPCODEDETAILLISTRecord)detaillist.get(i);
			
			
			String code = rec.zipcode;
			String name = rec.newaddr1;
			
			sb.append("<input name=\"");
			sb.append("zipcode");
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

	public String detaillistRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = detaillist.size();
		for(int i=0; i<size; i++){
			SS_S_UNIONCHGZIPCODEDETAILLISTRecord rec = (SS_S_UNIONCHGZIPCODEDETAILLISTRecord)detaillist.get(i);
			
			
			String code = rec.zipcode;
			String name = rec.newaddr1;
			
			sb.append("<input name=\"");
			sb.append("zipcode");
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
	SS_S_UNIONCHGZIPCODEDataSet ds = (SS_S_UNIONCHGZIPCODEDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.detaillist.size(); i++){
		SS_S_UNIONCHGZIPCODEDETAILLISTRecord detaillistRec = (SS_S_UNIONCHGZIPCODEDETAILLISTRecord)ds.detaillist.get(i);%>
HTML �ڵ��....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getDetaillist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= detaillistRec.zipcode%>
<%= detaillistRec.newaddr1%>
<%= detaillistRec.newaddr2%>
<%= detaillistRec.newaddr3%>
<%= detaillistRec.newaddr4%>
<%= detaillistRec.newbgnbnji%>
<%= detaillistRec.newendbnji%>
<%= detaillistRec.bocd%>
<%= detaillistRec.bonm%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Fri May 01 11:18:04 KST 2009 */
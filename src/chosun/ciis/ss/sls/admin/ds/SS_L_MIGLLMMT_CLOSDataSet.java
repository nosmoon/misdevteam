/***************************************************************************************************
* ���ϸ� : SS_L_MIGLLMMT_CLOSDataSet.java
* ��� : ������-���ϸ���-����-����� ���� DataSet
* �ۼ����� : 2004-03-20
* �ۼ��� : ��뼷
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/

package chosun.ciis.ss.sls.admin.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.admin.dm.*;
import chosun.ciis.ss.sls.admin.rec.*;

/**
 * ������-���ϸ���-����-����� ���� DataSet
 */

public class SS_L_MIGLLMMT_CLOSDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curcommlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public long totalcnt;

	public SS_L_MIGLLMMT_CLOSDataSet(){}
	public SS_L_MIGLLMMT_CLOSDataSet(String errcode, String errmsg, long totalcnt){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.totalcnt = totalcnt;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setTotalcnt(long totalcnt){
		this.totalcnt = totalcnt;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public long getTotalcnt(){
		return this.totalcnt;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){			return;		}
		ResultSet rset0 = (ResultSet) cstmt.getObject(7);
		while(rset0.next()){
			SS_L_MIGLLMMT_CLOSCURCOMMLISTRecord rec = new SS_L_MIGLLMMT_CLOSCURCOMMLISTRecord();
			rec.basidt = Util.checkString(rset0.getString("basidt"));
			rec.frdt = Util.checkString(rset0.getString("frdt"));
			rec.todt = Util.checkString(rset0.getString("todt"));
			rec.closdt = Util.checkString(rset0.getString("closdt"));
			this.curcommlist.add(rec);
		}
		this.totalcnt = cstmt.getLong(8);
	}

	public String curcommlistOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curcommlist.size();
		for(int i=0; i<size; i++){
			SS_L_MIGLLMMT_CLOSCURCOMMLISTRecord rec = (SS_L_MIGLLMMT_CLOSCURCOMMLISTRecord)curcommlist.get(i);
			
			
			String code = rec.basidt;
			String name = rec.frdt;
			
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

	public String curcommlistChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curcommlist.size();
		for(int i=0; i<size; i++){
			SS_L_MIGLLMMT_CLOSCURCOMMLISTRecord rec = (SS_L_MIGLLMMT_CLOSCURCOMMLISTRecord)curcommlist.get(i);
			
			
			String code = rec.basidt;
			String name = rec.frdt;
			
			sb.append("<input name=\"");
			sb.append("basidt");
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

	public String curcommlistRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curcommlist.size();
		for(int i=0; i<size; i++){
			SS_L_MIGLLMMT_CLOSCURCOMMLISTRecord rec = (SS_L_MIGLLMMT_CLOSCURCOMMLISTRecord)curcommlist.get(i);
			
			
			String code = rec.basidt;
			String name = rec.frdt;
			
			sb.append("<input name=\"");
			sb.append("basidt");
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
	SS_L_MIGLLMMT_CLOSDataSet ds = (SS_L_MIGLLMMT_CLOSDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curcommlist.size(); i++){
		SS_L_MIGLLMMT_CLOSCURCOMMLISTRecord curcommlistRec = (SS_L_MIGLLMMT_CLOSCURCOMMLISTRecord)ds.curcommlist.get(i);%>
HTML �ڵ��....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurcommlist()%>
<%= ds.getTotalcnt()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= curcommlistRec.basidt%>
<%= curcommlistRec.frdt%>
<%= curcommlistRec.todt%>
<%= curcommlistRec.closdt%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Mon Mar 22 11:37:23 KST 2004 */
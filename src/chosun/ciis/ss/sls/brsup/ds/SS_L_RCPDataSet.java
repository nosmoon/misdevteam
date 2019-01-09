/***************************************************************************************************
* ���ϸ� : .java
* ��� : *��������-����-����������-��Ȳ-���
* �ۼ����� : 2009-04-10
* �ۼ��� : �輼��
***************************************************************************************************/


package chosun.ciis.ss.sls.brsup.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.brsup.dm.*;
import chosun.ciis.ss.sls.brsup.rec.*;

/**
 * ��������-����-����������-��Ȳ-���
 */

public class SS_L_RCPDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curcommlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public long totalcnt;

	public SS_L_RCPDataSet(){}
	public SS_L_RCPDataSet(String errcode, String errmsg, long totalcnt){
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
		ResultSet rset0 = (ResultSet) cstmt.getObject(11);
		while(rset0.next()){
			SS_L_RCPCURCOMMLISTRecord rec = new SS_L_RCPCURCOMMLISTRecord();
			rec.basidt = Util.checkString(rset0.getString("basidt"));
			rec.bocd = Util.checkString(rset0.getString("bocd"));
			rec.bonm = Util.checkString(rset0.getString("bonm"));
			rec.clamtmthd = Util.checkString(rset0.getString("clamtmthd"));
			rec.noit = rset0.getInt("noit");
			rec.clamt = rset0.getInt("clamt");
			rec.insttcoms = rset0.getInt("insttcoms");
			rec.bocoms = rset0.getInt("bocoms");
			rec.comstot = rset0.getInt("comstot");
			this.curcommlist.add(rec);
		}
		this.totalcnt = cstmt.getLong(12);
	}

	public String curcommlistOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curcommlist.size();
		for(int i=0; i<size; i++){
			SS_L_RCPCURCOMMLISTRecord rec = (SS_L_RCPCURCOMMLISTRecord)curcommlist.get(i);
			
			
			String code = rec.basidt;
			String name = rec.bocd;
			
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
			SS_L_RCPCURCOMMLISTRecord rec = (SS_L_RCPCURCOMMLISTRecord)curcommlist.get(i);
			
			
			String code = rec.basidt;
			String name = rec.bocd;
			
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
			SS_L_RCPCURCOMMLISTRecord rec = (SS_L_RCPCURCOMMLISTRecord)curcommlist.get(i);
			
			
			String code = rec.basidt;
			String name = rec.bocd;
			
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
	SS_L_RCPDataSet ds = (SS_L_RCPDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curcommlist.size(); i++){
		SS_L_RCPCURCOMMLISTRecord curcommlistRec = (SS_L_RCPCURCOMMLISTRecord)ds.curcommlist.get(i);%>
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
<%= curcommlistRec.bocd%>
<%= curcommlistRec.bonm%>
<%= curcommlistRec.clamtmthd%>
<%= curcommlistRec.noit%>
<%= curcommlistRec.clamt%>
<%= curcommlistRec.insttcoms%>
<%= curcommlistRec.bocoms%>
<%= curcommlistRec.comstot%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Fri Apr 10 13:46:19 KST 2009 */
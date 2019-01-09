/***************************************************************************************************
* ���ϸ� : 
* ��� :  �߼�-���Ϲ߼� �߼�ó��
* �ۼ����� : 2004-03-02
* �ۼ��� : ���ȯ
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.ps.pbs.send.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ps.pbs.send.dm.*;
import chosun.ciis.ps.pbs.send.rec.*;

/**
 * �߼�-���Ϲ߼� �߼�ó��
 *
 */

public class PS_L_SEND_DD_PROC_DTLSDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curcommlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public long totalcnt;

	public PS_L_SEND_DD_PROC_DTLSDataSet(){}
	public PS_L_SEND_DD_PROC_DTLSDataSet(String errcode, String errmsg, long totalcnt){
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
		this.totalcnt = cstmt.getLong(11);
		ResultSet rset0 = (ResultSet) cstmt.getObject(12);
		while(rset0.next()){
			PS_L_SEND_DD_PROC_DTLSCURCOMMLISTRecord rec = new PS_L_SEND_DD_PROC_DTLSCURCOMMLISTRecord();
			rec.rdrno = Util.checkString(rset0.getString("rdrno"));
			rec.acqnm = Util.checkString(rset0.getString("acqnm"));
			rec.prn = Util.checkString(rset0.getString("prn"));
			rec.rdrtel = Util.checkString(rset0.getString("rdrtel"));
			rec.subsno = Util.checkString(rset0.getString("subsno"));
			rec.dlvzip = Util.checkString(rset0.getString("dlvzip"));
			rec.addr = Util.checkString(rset0.getString("addr"));
			this.curcommlist.add(rec);
		}
	}

	public String curcommlistOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curcommlist.size();
		for(int i=0; i<size; i++){
			PS_L_SEND_DD_PROC_DTLSCURCOMMLISTRecord rec = (PS_L_SEND_DD_PROC_DTLSCURCOMMLISTRecord)curcommlist.get(i);
			
			
			String code = rec.rdrno;
			String name = rec.acqnm;
			
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
			PS_L_SEND_DD_PROC_DTLSCURCOMMLISTRecord rec = (PS_L_SEND_DD_PROC_DTLSCURCOMMLISTRecord)curcommlist.get(i);
			
			
			String code = rec.rdrno;
			String name = rec.acqnm;
			
			sb.append("<input name=\"");
			sb.append("rdrno");
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
			PS_L_SEND_DD_PROC_DTLSCURCOMMLISTRecord rec = (PS_L_SEND_DD_PROC_DTLSCURCOMMLISTRecord)curcommlist.get(i);
			
			
			String code = rec.rdrno;
			String name = rec.acqnm;
			
			sb.append("<input name=\"");
			sb.append("rdrno");
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
	PS_L_SEND_DD_PROC_DTLSDataSet ds = (PS_L_SEND_DD_PROC_DTLSDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curcommlist.size(); i++){
		PS_L_SEND_DD_PROC_DTLSCURCOMMLISTRecord curcommlistRec = (PS_L_SEND_DD_PROC_DTLSCURCOMMLISTRecord)ds.curcommlist.get(i);%>
HTML �ڵ��....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getTotalcnt()%>
<%= ds.getCurcommlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= curcommlistRec.rdrno%>
<%= curcommlistRec.acqnm%>
<%= curcommlistRec.prn%>
<%= curcommlistRec.rdrtel%>
<%= curcommlistRec.subsno%>
<%= curcommlistRec.dlvzip%>
<%= curcommlistRec.addr%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Thu Dec 23 13:52:36 KST 2004 */
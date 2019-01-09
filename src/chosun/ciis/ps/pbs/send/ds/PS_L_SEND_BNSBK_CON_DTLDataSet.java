/***************************************************************************************************
* ���ϸ� : SP_PS_L_SEND_BNSBK_CON_DTL.java
* ��� :   �߼�-���ʽ��Ϲ߼� �߼�ó�� �󼼳��� ��ȸȭ�� 
* �ۼ����� : 2004-02-28
* �ۼ��� : ���ȣ 
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
 * �߼�-���ʽ��Ϲ߼�  �߼�ó�� �󼼳��� ��ȸȭ�� 
 *
 */ 

 

public class PS_L_SEND_BNSBK_CON_DTLDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curcommlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public long totalcnt;

	public PS_L_SEND_BNSBK_CON_DTLDataSet(){}
	public PS_L_SEND_BNSBK_CON_DTLDataSet(String errcode, String errmsg, long totalcnt){
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
		this.totalcnt = cstmt.getLong(10);
		ResultSet rset0 = (ResultSet) cstmt.getObject(11);
		while(rset0.next()){
			PS_L_SEND_BNSBK_CON_DTLCURCOMMLISTRecord rec = new PS_L_SEND_BNSBK_CON_DTLCURCOMMLISTRecord();
			rec.rdr_no = Util.checkString(rset0.getString("rdr_no"));
			rec.rdrnm = Util.checkString(rset0.getString("rdrnm"));
			rec.prn = Util.checkString(rset0.getString("prn"));
			rec.bnsbk = Util.checkString(rset0.getString("bnsbk"));
			rec.rdrtel_no = Util.checkString(rset0.getString("rdrtel_no"));
			rec.dlvzip = Util.checkString(rset0.getString("dlvzip"));
			rec.dlvaddr = Util.checkString(rset0.getString("dlvaddr"));
			rec.dlvdtlsaddr = Util.checkString(rset0.getString("dlvdtlsaddr"));
			this.curcommlist.add(rec);
		}
	}

	public String curcommlistOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curcommlist.size();
		for(int i=0; i<size; i++){
			PS_L_SEND_BNSBK_CON_DTLCURCOMMLISTRecord rec = (PS_L_SEND_BNSBK_CON_DTLCURCOMMLISTRecord)curcommlist.get(i);
			
			
			String code = rec.rdr_no;
			String name = rec.rdrnm;
			
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
			PS_L_SEND_BNSBK_CON_DTLCURCOMMLISTRecord rec = (PS_L_SEND_BNSBK_CON_DTLCURCOMMLISTRecord)curcommlist.get(i);
			
			
			String code = rec.rdr_no;
			String name = rec.rdrnm;
			
			sb.append("<input name=\"");
			sb.append("rdr_no");
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
			PS_L_SEND_BNSBK_CON_DTLCURCOMMLISTRecord rec = (PS_L_SEND_BNSBK_CON_DTLCURCOMMLISTRecord)curcommlist.get(i);
			
			
			String code = rec.rdr_no;
			String name = rec.rdrnm;
			
			sb.append("<input name=\"");
			sb.append("rdr_no");
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
	PS_L_SEND_BNSBK_CON_DTLDataSet ds = (PS_L_SEND_BNSBK_CON_DTLDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curcommlist.size(); i++){
		PS_L_SEND_BNSBK_CON_DTLCURCOMMLISTRecord curcommlistRec = (PS_L_SEND_BNSBK_CON_DTLCURCOMMLISTRecord)ds.curcommlist.get(i);%>
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

<%= curcommlistRec.rdr_no%>
<%= curcommlistRec.rdrnm%>
<%= curcommlistRec.prn%>
<%= curcommlistRec.bnsbk%>
<%= curcommlistRec.rdrtel_no%>
<%= curcommlistRec.dlvzip%>
<%= curcommlistRec.dlvaddr%>
<%= curcommlistRec.dlvdtlsaddr%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Thu Mar 04 16:39:49 KST 2004 */
/***************************************************************************************************
* ���ϸ� : SS_L_PSTCDDataSet.java
* ��� : ������-�����ȣ-����� ���� DataSet
* �ۼ����� : 2004-04-24
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
 * ������-�����ȣ-����� ���� DataSet
 */


public class SS_L_PSTCDDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curcommlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public long totalcnt;

	public SS_L_PSTCDDataSet(){}
	public SS_L_PSTCDDataSet(String errcode, String errmsg, long totalcnt){
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
		this.totalcnt = cstmt.getLong(12);
		ResultSet rset0 = (ResultSet) cstmt.getObject(13);
		while(rset0.next()){
			SS_L_PSTCDCURCOMMLISTRecord rec = new SS_L_PSTCDCURCOMMLISTRecord();
			rec.zip1 = Util.checkString(rset0.getString("zip1"));
			rec.zip2 = Util.checkString(rset0.getString("zip2"));
			rec.zip3 = Util.checkString(rset0.getString("zip3"));
			rec.addr1 = Util.checkString(rset0.getString("addr1"));
			rec.addr2 = Util.checkString(rset0.getString("addr2"));
			rec.addr3 = Util.checkString(rset0.getString("addr3"));
			rec.largedlvplac = Util.checkString(rset0.getString("largedlvplac"));
			rec.bgnn = Util.checkString(rset0.getString("bgnn"));
			rec.endn = Util.checkString(rset0.getString("endn"));
			this.curcommlist.add(rec);
		}
	}

	public String curcommlistOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curcommlist.size();
		for(int i=0; i<size; i++){
			SS_L_PSTCDCURCOMMLISTRecord rec = (SS_L_PSTCDCURCOMMLISTRecord)curcommlist.get(i);
			
			
			String code = rec.zip1;
			String name = rec.zip2;
			
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
			SS_L_PSTCDCURCOMMLISTRecord rec = (SS_L_PSTCDCURCOMMLISTRecord)curcommlist.get(i);
			
			
			String code = rec.zip1;
			String name = rec.zip2;
			
			sb.append("<input name=\"");
			sb.append("zip1");
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
			SS_L_PSTCDCURCOMMLISTRecord rec = (SS_L_PSTCDCURCOMMLISTRecord)curcommlist.get(i);
			
			
			String code = rec.zip1;
			String name = rec.zip2;
			
			sb.append("<input name=\"");
			sb.append("zip1");
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
	SS_L_PSTCDDataSet ds = (SS_L_PSTCDDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curcommlist.size(); i++){
		SS_L_PSTCDCURCOMMLISTRecord curcommlistRec = (SS_L_PSTCDCURCOMMLISTRecord)ds.curcommlist.get(i);%>
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

<%= curcommlistRec.zip1%>
<%= curcommlistRec.zip2%>
<%= curcommlistRec.zip3%>
<%= curcommlistRec.addr1%>
<%= curcommlistRec.addr2%>
<%= curcommlistRec.addr3%>
<%= curcommlistRec.largedlvplac%>
<%= curcommlistRec.bgnn%>
<%= curcommlistRec.endn%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Wed Jul 07 14:13:26 KST 2004 */
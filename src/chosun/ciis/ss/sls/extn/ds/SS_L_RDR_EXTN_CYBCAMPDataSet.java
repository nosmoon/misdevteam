/***************************************************************************************************
* ���ϸ� : SS_L_RDR_EXTN_CYBCAMPDataSet.java
* ��� : Ȯ����Ȳ-���̹�Ȯ��-��ȸ����-���
* �ۼ����� : 2004-04-06
* �ۼ��� : ����ȫ
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.ss.sls.extn.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.extn.dm.*;
import chosun.ciis.ss.sls.extn.rec.*;

/**
 * Ȯ����Ȳ-���̹�Ȯ��-��ȸ����-���
 *
 */

public class SS_L_RDR_EXTN_CYBCAMPDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curcommlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public long totalcnt;

	public SS_L_RDR_EXTN_CYBCAMPDataSet(){}
	public SS_L_RDR_EXTN_CYBCAMPDataSet(String errcode, String errmsg, long totalcnt){
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
		this.totalcnt = cstmt.getLong(7);
		ResultSet rset0 = (ResultSet) cstmt.getObject(8);
		while(rset0.next()){
			SS_L_RDR_EXTN_CYBCAMPCURCOMMLISTRecord rec = new SS_L_RDR_EXTN_CYBCAMPCURCOMMLISTRecord();
			rec.rdr_extncampno = Util.checkString(rset0.getString("rdr_extncampno"));
			rec.campnm = Util.checkString(rset0.getString("campnm"));
			rec.frdt = Util.checkString(rset0.getString("frdt"));
			rec.todt = Util.checkString(rset0.getString("todt"));
			rec.closdt = Util.checkString(rset0.getString("closdt"));
			this.curcommlist.add(rec);
		}
	}

	public String curcommlistOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curcommlist.size();
		for(int i=0; i<size; i++){
			SS_L_RDR_EXTN_CYBCAMPCURCOMMLISTRecord rec = (SS_L_RDR_EXTN_CYBCAMPCURCOMMLISTRecord)curcommlist.get(i);
			
			
			String code = rec.rdr_extncampno;
			String name = rec.campnm;
			
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
			SS_L_RDR_EXTN_CYBCAMPCURCOMMLISTRecord rec = (SS_L_RDR_EXTN_CYBCAMPCURCOMMLISTRecord)curcommlist.get(i);
			
			
			String code = rec.rdr_extncampno;
			String name = rec.campnm;
			
			sb.append("<input name=\"");
			sb.append("rdr_extncampno");
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
			SS_L_RDR_EXTN_CYBCAMPCURCOMMLISTRecord rec = (SS_L_RDR_EXTN_CYBCAMPCURCOMMLISTRecord)curcommlist.get(i);
			
			
			String code = rec.rdr_extncampno;
			String name = rec.campnm;
			
			sb.append("<input name=\"");
			sb.append("rdr_extncampno");
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
	SS_L_RDR_EXTN_CYBCAMPDataSet ds = (SS_L_RDR_EXTN_CYBCAMPDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curcommlist.size(); i++){
		SS_L_RDR_EXTN_CYBCAMPCURCOMMLISTRecord curcommlistRec = (SS_L_RDR_EXTN_CYBCAMPCURCOMMLISTRecord)ds.curcommlist.get(i);%>
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

<%= curcommlistRec.rdr_extncampno%>
<%= curcommlistRec.campnm%>
<%= curcommlistRec.frdt%>
<%= curcommlistRec.todt%>
<%= curcommlistRec.closdt%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Tue Apr 06 19:23:52 KST 2004 */
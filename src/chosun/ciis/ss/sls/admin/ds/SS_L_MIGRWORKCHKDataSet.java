/***************************************************************************************************
* ���ϸ�	:
* ���		:
* �ۼ�����	: 2004-01-13
* �ۼ���	: �����
***************************************************************************************************/
/***************************************************************************************************
* ��������	:
* ������	:
* ��������	:
* ���		:
***************************************************************************************************/


package chosun.ciis.ss.sls.admin.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.admin.dm.*;
import chosun.ciis.ss.sls.admin.rec.*;

/**
 *
 *
 */


public class SS_L_MIGRWORKCHKDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curcommlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public long totalcnt;

	public SS_L_MIGRWORKCHKDataSet(){}
	public SS_L_MIGRWORKCHKDataSet(String errcode, String errmsg, long totalcnt){
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
		ResultSet rset0 = (ResultSet) cstmt.getObject(9);
		while(rset0.next()){
			SS_L_MIGRWORKCHKCURCOMMLISTRecord rec = new SS_L_MIGRWORKCHKCURCOMMLISTRecord();
			rec.deptnm = Util.checkString(rset0.getString("deptnm"));
			rec.areanm = Util.checkString(rset0.getString("areanm"));
			rec.bocd = Util.checkString(rset0.getString("bocd"));
			rec.bonm = Util.checkString(rset0.getString("bonm"));
			rec.bodbuptodt = Util.checkString(rset0.getString("bodbuptodt"));
			rec.billdbuptodt = Util.checkString(rset0.getString("billdbuptodt"));
			rec.boswittodt = Util.checkString(rset0.getString("boswittodt"));
			rec.billswittodt = Util.checkString(rset0.getString("billswittodt"));
			rec.endcnfmyn = Util.checkString(rset0.getString("endcnfmyn"));
			rec.endcnfmdt = Util.checkString(rset0.getString("endcnfmdt"));
			this.curcommlist.add(rec);
		}
		this.totalcnt = cstmt.getLong(10);
	}

	public String curcommlistOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curcommlist.size();
		for(int i=0; i<size; i++){
			SS_L_MIGRWORKCHKCURCOMMLISTRecord rec = (SS_L_MIGRWORKCHKCURCOMMLISTRecord)curcommlist.get(i);


			String code = rec.deptnm;
			String name = rec.areanm;

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
			SS_L_MIGRWORKCHKCURCOMMLISTRecord rec = (SS_L_MIGRWORKCHKCURCOMMLISTRecord)curcommlist.get(i);


			String code = rec.deptnm;
			String name = rec.areanm;

			sb.append("<input name=\"");
			sb.append("deptnm");
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
			SS_L_MIGRWORKCHKCURCOMMLISTRecord rec = (SS_L_MIGRWORKCHKCURCOMMLISTRecord)curcommlist.get(i);


			String code = rec.deptnm;
			String name = rec.areanm;

			sb.append("<input name=\"");
			sb.append("deptnm");
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
	SS_L_MIGRWORKCHKDataSet ds = (SS_L_MIGRWORKCHKDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curcommlist.size(); i++){
		SS_L_MIGRWORKCHKCURCOMMLISTRecord curcommlistRec = (SS_L_MIGRWORKCHKCURCOMMLISTRecord)ds.curcommlist.get(i);%>
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

<%= curcommlistRec.deptnm%>
<%= curcommlistRec.areanm%>
<%= curcommlistRec.bocd%>
<%= curcommlistRec.bonm%>
<%= curcommlistRec.bodbuptodt%>
<%= curcommlistRec.billdbuptodt%>
<%= curcommlistRec.boswittodt%>
<%= curcommlistRec.billswittodt%>
<%= curcommlistRec.endcnfmyn%>
<%= curcommlistRec.endcnfmdt%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Fri Mar 19 16:41:18 KST 2004 */
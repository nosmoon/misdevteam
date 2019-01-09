/***************************************************************************************************
* ���ϸ� : PS_L_BNSBK.java
* ��� :   �ڵ����-���ʽ��� ��ȸȭ��
* �ۼ����� : 2007-05-21
* �ۼ��� : ����ǥ
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� :
***************************************************************************************************/


package chosun.ciis.ps.pbs.code.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ps.pbs.code.dm.*;
import chosun.ciis.ps.pbs.code.rec.*;

/**
 * �ڵ����-���ʽ��ϳ��� ��ȸȭ��
 *
 */

public class PS_L_BNSBKDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curcommlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public long totalcnt;

	public PS_L_BNSBKDataSet(){}
	public PS_L_BNSBKDataSet(String errcode, String errmsg, long totalcnt){
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
			PS_L_BNSBKCURCOMMLISTRecord rec = new PS_L_BNSBKCURCOMMLISTRecord();
			rec.cmpynm = Util.checkString(rset0.getString("cmpynm"));
			rec.bns_bookcd = Util.checkString(rset0.getString("bns_bookcd"));
			rec.bns_booknm = Util.checkString(rset0.getString("bns_booknm"));
			rec.medicd = Util.checkString(rset0.getString("medicd"));
			rec.medinm = Util.checkString(rset0.getString("medinm"));
			rec.bgnvdtydt = Util.checkString(rset0.getString("bgnvdtydt"));
			rec.endvdtydt = Util.checkString(rset0.getString("endvdtydt"));
			rec.remk = Util.replace(Util.checkString(rset0.getString("remk")), "&nbsp;", "");
			rec.vipcont = Util.replace(Util.checkString(rset0.getString("vipcont")), "&nbsp;", "");
			this.curcommlist.add(rec);
		}
	}

	public String curcommlistOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curcommlist.size();
		for(int i=0; i<size; i++){
			PS_L_BNSBKCURCOMMLISTRecord rec = (PS_L_BNSBKCURCOMMLISTRecord)curcommlist.get(i);
			
			
			String code = rec.cmpynm;
			String name = rec.bns_bookcd;
			
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
			PS_L_BNSBKCURCOMMLISTRecord rec = (PS_L_BNSBKCURCOMMLISTRecord)curcommlist.get(i);
			
			
			String code = rec.cmpynm;
			String name = rec.bns_bookcd;
			
			sb.append("<input name=\"");
			sb.append("cmpynm");
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
			PS_L_BNSBKCURCOMMLISTRecord rec = (PS_L_BNSBKCURCOMMLISTRecord)curcommlist.get(i);
			
			
			String code = rec.cmpynm;
			String name = rec.bns_bookcd;
			
			sb.append("<input name=\"");
			sb.append("cmpynm");
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
	PS_L_BNSBKDataSet ds = (PS_L_BNSBKDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curcommlist.size(); i++){
		PS_L_BNSBKCURCOMMLISTRecord curcommlistRec = (PS_L_BNSBKCURCOMMLISTRecord)ds.curcommlist.get(i);%>
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

<%= curcommlistRec.cmpynm%>
<%= curcommlistRec.bns_bookcd%>
<%= curcommlistRec.bns_booknm%>
<%= curcommlistRec.medicd%>
<%= curcommlistRec.medinm%>
<%= curcommlistRec.bgnvdtydt%>
<%= curcommlistRec.endvdtydt%>
<%= curcommlistRec.remk%>
<%= curcommlistRec.vipcont%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Mon May 21 17:36:18 KST 2007 */
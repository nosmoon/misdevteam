/***************************************************************************************************
* ���ϸ� : .java
* ��� : ������-�ϰ� �����ȣ ����ó��-��ȸ
* �ۼ����� : 2009-05-08
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
 * ������-�ϰ� �����ȣ ����ó��-��ȸ
 */

public class SS_L_BATZIPCODEDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList addrlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public SS_L_BATZIPCODEDataSet(){}
	public SS_L_BATZIPCODEDataSet(String errcode, String errmsg){
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
		ResultSet rset0 = (ResultSet) cstmt.getObject(8);
		while(rset0.next()){
			SS_L_BATZIPCODEADDRLISTRecord rec = new SS_L_BATZIPCODEADDRLISTRecord();
			rec.newzip1 = Util.checkString(rset0.getString("newzip1"));
			rec.newzip2 = Util.checkString(rset0.getString("newzip2"));
			rec.newzip3 = Util.checkString(rset0.getString("newzip3"));
			rec.newzip4 = Util.checkString(rset0.getString("newzip4"));
			rec.zipcode = Util.checkString(rset0.getString("zipcode"));
			rec.dtladdr = Util.checkString(rset0.getString("dtladdr"));
			rec.newbgnbnji = Util.checkString(rset0.getString("newbgnbnji"));
			rec.newendbnji = Util.checkString(rset0.getString("newendbnji"));
			rec.bocd = Util.checkString(rset0.getString("bocd"));
			rec.bonm = Util.checkString(rset0.getString("bonm"));
			rec.chgresn = Util.checkString(rset0.getString("chgresn"));
			this.addrlist.add(rec);
		}
	}

	public String addrlistOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = addrlist.size();
		for(int i=0; i<size; i++){
			SS_L_BATZIPCODEADDRLISTRecord rec = (SS_L_BATZIPCODEADDRLISTRecord)addrlist.get(i);
			
			
			String code = rec.newzip1;
			String name = rec.newzip2;
			
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

	public String addrlistChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = addrlist.size();
		for(int i=0; i<size; i++){
			SS_L_BATZIPCODEADDRLISTRecord rec = (SS_L_BATZIPCODEADDRLISTRecord)addrlist.get(i);
			
			
			String code = rec.newzip1;
			String name = rec.newzip2;
			
			sb.append("<input name=\"");
			sb.append("newzip1");
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

	public String addrlistRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = addrlist.size();
		for(int i=0; i<size; i++){
			SS_L_BATZIPCODEADDRLISTRecord rec = (SS_L_BATZIPCODEADDRLISTRecord)addrlist.get(i);
			
			
			String code = rec.newzip1;
			String name = rec.newzip2;
			
			sb.append("<input name=\"");
			sb.append("newzip1");
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
	SS_L_BATZIPCODEDataSet ds = (SS_L_BATZIPCODEDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.addrlist.size(); i++){
		SS_L_BATZIPCODEADDRLISTRecord addrlistRec = (SS_L_BATZIPCODEADDRLISTRecord)ds.addrlist.get(i);%>
HTML �ڵ��....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getAddrlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= addrlistRec.newzip1%>
<%= addrlistRec.newzip2%>
<%= addrlistRec.newzip3%>
<%= addrlistRec.newzip4%>
<%= addrlistRec.zipcode%>
<%= addrlistRec.dtladdr%>
<%= addrlistRec.newbgnbnji%>
<%= addrlistRec.newendbnji%>
<%= addrlistRec.bocd%>
<%= addrlistRec.bonm%>
<%= addrlistRec.chgresn%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Fri May 08 14:33:51 KST 2009 */
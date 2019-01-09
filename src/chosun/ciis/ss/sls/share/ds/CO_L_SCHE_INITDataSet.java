/***************************************************************************************************
* ���ϸ� : CO_L_SCHE_INITDataSet.java
* ��� : ��������-����-����� ���� DataSet
* �ۼ����� : 2004-04-24
* �ۼ��� : ��뼷
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/

package chosun.ciis.ss.sls.share.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.share.dm.*;
import chosun.ciis.ss.sls.share.rec.*;

/**
 * ��������-����-����� ���� DataSet
 */

public class CO_L_SCHE_INITDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curcommlist2 = new ArrayList();
	public ArrayList curcommlist3 = new ArrayList();
	public String errcode;
	public String errmsg;

	public CO_L_SCHE_INITDataSet(){}
	public CO_L_SCHE_INITDataSet(String errcode, String errmsg){
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
		ResultSet rset0 = (ResultSet) cstmt.getObject(3);
		while(rset0.next()){
			CO_L_SCHE_INITCURCOMMLIST2Record rec = new CO_L_SCHE_INITCURCOMMLIST2Record();
			rec.cicodeval = Util.checkString(rset0.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset0.getString("cicdnm"));
			rec.ciymgbcd = Util.checkString(rset0.getString("ciymgbcd"));
			rec.cicdgb = Util.checkString(rset0.getString("cicdgb"));
			rec.cicdynm = Util.checkString(rset0.getString("cicdynm"));
			this.curcommlist2.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(4);
		while(rset1.next()){
			CO_L_SCHE_INITCURCOMMLIST3Record rec = new CO_L_SCHE_INITCURCOMMLIST3Record();
			rec.cicodeval = Util.checkString(rset1.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset1.getString("cicdnm"));
			rec.ciymgbcd = Util.checkString(rset1.getString("ciymgbcd"));
			rec.cicdgb = Util.checkString(rset1.getString("cicdgb"));
			rec.cicdynm = Util.checkString(rset1.getString("cicdynm"));
			this.curcommlist3.add(rec);
		}
	}

	public String curcommlist2OptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curcommlist2.size();
		for(int i=0; i<size; i++){
			CO_L_SCHE_INITCURCOMMLIST2Record rec = (CO_L_SCHE_INITCURCOMMLIST2Record)curcommlist2.get(i);
			
			
			String code = rec.cicodeval;
			String name = rec.cicdnm;
			
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

	public String curcommlist3OptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curcommlist3.size();
		for(int i=0; i<size; i++){
			CO_L_SCHE_INITCURCOMMLIST3Record rec = (CO_L_SCHE_INITCURCOMMLIST3Record)curcommlist3.get(i);
			
			
			String code = rec.cicodeval;
			String name = rec.cicdnm;
			
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

	public String curcommlist2ChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curcommlist2.size();
		for(int i=0; i<size; i++){
			CO_L_SCHE_INITCURCOMMLIST2Record rec = (CO_L_SCHE_INITCURCOMMLIST2Record)curcommlist2.get(i);
			
			
			String code = rec.cicodeval;
			String name = rec.cicdnm;
			
			sb.append("<input name=\"");
			sb.append("cicodeval");
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

	public String curcommlist3ChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curcommlist3.size();
		for(int i=0; i<size; i++){
			CO_L_SCHE_INITCURCOMMLIST3Record rec = (CO_L_SCHE_INITCURCOMMLIST3Record)curcommlist3.get(i);
			
			
			String code = rec.cicodeval;
			String name = rec.cicdnm;
			
			sb.append("<input name=\"");
			sb.append("cicodeval");
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

	public String curcommlist2RdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curcommlist2.size();
		for(int i=0; i<size; i++){
			CO_L_SCHE_INITCURCOMMLIST2Record rec = (CO_L_SCHE_INITCURCOMMLIST2Record)curcommlist2.get(i);
			
			
			String code = rec.cicodeval;
			String name = rec.cicdnm;
			
			sb.append("<input name=\"");
			sb.append("cicodeval");
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

	public String curcommlist3RdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curcommlist3.size();
		for(int i=0; i<size; i++){
			CO_L_SCHE_INITCURCOMMLIST3Record rec = (CO_L_SCHE_INITCURCOMMLIST3Record)curcommlist3.get(i);
			
			
			String code = rec.cicodeval;
			String name = rec.cicdnm;
			
			sb.append("<input name=\"");
			sb.append("cicodeval");
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
	CO_L_SCHE_INITDataSet ds = (CO_L_SCHE_INITDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curcommlist2.size(); i++){
		CO_L_SCHE_INITCURCOMMLIST2Record curcommlist2Rec = (CO_L_SCHE_INITCURCOMMLIST2Record)ds.curcommlist2.get(i);%>
HTML �ڵ��....
	<%}%>

<%
	for(int i=0; i<ds.curcommlist3.size(); i++){
		CO_L_SCHE_INITCURCOMMLIST3Record curcommlist3Rec = (CO_L_SCHE_INITCURCOMMLIST3Record)ds.curcommlist3.get(i);%>
HTML �ڵ��....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurcommlist2()%>
<%= ds.getCurcommlist3()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= curcommlist2Rec.cicodeval%>
<%= curcommlist2Rec.cicdnm%>
<%= curcommlist2Rec.ciymgbcd%>
<%= curcommlist2Rec.cicdgb%>
<%= curcommlist2Rec.cicdynm%>
<%= curcommlist3Rec.cicodeval%>
<%= curcommlist3Rec.cicdnm%>
<%= curcommlist3Rec.ciymgbcd%>
<%= curcommlist3Rec.cicdgb%>
<%= curcommlist3Rec.cicdynm%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Sat Jun 05 22:19:40 KST 2004 */
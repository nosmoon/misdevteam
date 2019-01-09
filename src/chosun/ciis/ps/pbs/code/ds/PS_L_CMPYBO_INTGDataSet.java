/***************************************************************************************************
* ���ϸ� : SP_PS_L_CMPYBO_INTG.java
* �ڵ�-���纰 �����ڵ���� ��ȸȭ�� 
* �ۼ����� : 2004-03-08
* �ۼ��� : ���ȣ 
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
 * �ڵ�-���纰 �����ڵ���� ��ȸȭ��           
 *
 */

  

public class PS_L_CMPYBO_INTGDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curcommlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public PS_L_CMPYBO_INTGDataSet(){}
	public PS_L_CMPYBO_INTGDataSet(String errcode, String errmsg){
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
		ResultSet rset0 = (ResultSet) cstmt.getObject(5);
		while(rset0.next()){
			PS_L_CMPYBO_INTGCURCOMMLISTRecord rec = new PS_L_CMPYBO_INTGCURCOMMLISTRecord();
			rec.bocd = Util.checkString(rset0.getString("bocd"));
			rec.bonm = Util.checkString(rset0.getString("bonm"));
			rec.sendintgyn = Util.checkString(rset0.getString("sendintgyn"));
			rec.clamtintgyn = Util.checkString(rset0.getString("clamtintgyn"));
			rec.alonintgyn = Util.checkString(rset0.getString("alonintgyn"));
			rec.intgaftboalonpaypoint = Util.checkString(rset0.getString("intgaftboalonpaypoint"));
			rec.boalonpaynm = Util.checkString(rset0.getString("boalonpaynm"));
			rec.intgafthdqtalonpaypoint = Util.checkString(rset0.getString("intgafthdqtalonpaypoint"));
			rec.hdqtalonpaynm = Util.checkString(rset0.getString("hdqtalonpaynm"));
			this.curcommlist.add(rec);
		}
	}

	public String curcommlistOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curcommlist.size();
		for(int i=0; i<size; i++){
			PS_L_CMPYBO_INTGCURCOMMLISTRecord rec = (PS_L_CMPYBO_INTGCURCOMMLISTRecord)curcommlist.get(i);
			
			
			String code = rec.bocd;
			String name = rec.bonm;
			
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
			PS_L_CMPYBO_INTGCURCOMMLISTRecord rec = (PS_L_CMPYBO_INTGCURCOMMLISTRecord)curcommlist.get(i);
			
			
			String code = rec.bocd;
			String name = rec.bonm;
			
			sb.append("<input name=\"");
			sb.append("bocd");
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
			PS_L_CMPYBO_INTGCURCOMMLISTRecord rec = (PS_L_CMPYBO_INTGCURCOMMLISTRecord)curcommlist.get(i);
			
			
			String code = rec.bocd;
			String name = rec.bonm;
			
			sb.append("<input name=\"");
			sb.append("bocd");
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
	PS_L_CMPYBO_INTGDataSet ds = (PS_L_CMPYBO_INTGDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curcommlist.size(); i++){
		PS_L_CMPYBO_INTGCURCOMMLISTRecord curcommlistRec = (PS_L_CMPYBO_INTGCURCOMMLISTRecord)ds.curcommlist.get(i);%>
HTML �ڵ��....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurcommlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= curcommlistRec.bocd%>
<%= curcommlistRec.bonm%>
<%= curcommlistRec.sendintgyn%>
<%= curcommlistRec.clamtintgyn%>
<%= curcommlistRec.alonintgyn%>
<%= curcommlistRec.intgaftboalonpaypoint%>
<%= curcommlistRec.boalonpaynm%>
<%= curcommlistRec.intgafthdqtalonpaypoint%>
<%= curcommlistRec.hdqtalonpaynm%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Mon Mar 15 21:14:26 KST 2004 */
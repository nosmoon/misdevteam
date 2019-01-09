/***************************************************************************************************
* ���ϸ� : SS_L_MO_SVYDataSet.java
* ��� : 
* �ۼ����� : 2015.11.11
* �ۼ��� : �弱��
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
 * 
 */


public class SS_L_MO_SVYDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList svycur = new ArrayList();
	public String errcode;
	public String errmsg;
	public long totalcnt;

	public SS_L_MO_SVYDataSet(){}
	public SS_L_MO_SVYDataSet(String errcode, String errmsg, long totalcnt){
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
			SS_L_MO_SVYSVYCURRecord rec = new SS_L_MO_SVYSVYCURRecord();
			rec.svyid = Util.checkString(rset0.getString("svyid"));
			rec.svynm = Util.checkString(rset0.getString("svynm"));
			rec.sttdt = Util.checkString(rset0.getString("sttdt"));
			rec.enddt = Util.checkString(rset0.getString("enddt"));
			rec.qstsnum = rset0.getInt("qstsnum");
			rec.url = Util.checkString(rset0.getString("url"));
			rec.stat = Util.checkString(rset0.getString("stat"));
			rec.camptype = Util.checkString(rset0.getString("camptype"));
			rec.basicdt = Util.checkString(rset0.getString("basicdt"));
			this.svycur.add(rec);
		}
		this.totalcnt = cstmt.getLong(10);
	}

	public String svycurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = svycur.size();
		for(int i=0; i<size; i++){
			SS_L_MO_SVYSVYCURRecord rec = (SS_L_MO_SVYSVYCURRecord)svycur.get(i);
			
			
			String code = rec.svyid;
			String name = rec.svynm;
			
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

	public String svycurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = svycur.size();
		for(int i=0; i<size; i++){
			SS_L_MO_SVYSVYCURRecord rec = (SS_L_MO_SVYSVYCURRecord)svycur.get(i);
			
			
			String code = rec.svyid;
			String name = rec.svynm;
			
			sb.append("<input name=\"");
			sb.append("svyid");
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

	public String svycurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = svycur.size();
		for(int i=0; i<size; i++){
			SS_L_MO_SVYSVYCURRecord rec = (SS_L_MO_SVYSVYCURRecord)svycur.get(i);
			
			
			String code = rec.svyid;
			String name = rec.svynm;
			
			sb.append("<input name=\"");
			sb.append("svyid");
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
	SS_L_MO_SVYDataSet ds = (SS_L_MO_SVYDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.svycur.size(); i++){
		SS_L_MO_SVYSVYCURRecord svycurRec = (SS_L_MO_SVYSVYCURRecord)ds.svycur.get(i);%>
HTML �ڵ��....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getSvycur()%>
<%= ds.getTotalcnt()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= svycurRec.svyid%>
<%= svycurRec.svynm%>
<%= svycurRec.sttdt%>
<%= svycurRec.enddt%>
<%= svycurRec.qstsnum%>
<%= svycurRec.url%>
<%= svycurRec.stat%>
<%= svycurRec.camptype%>
<%= svycurRec.basicdt%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Thu Nov 26 13:56:17 KST 2015 */
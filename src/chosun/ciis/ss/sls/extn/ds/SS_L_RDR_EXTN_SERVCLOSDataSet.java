/***************************************************************************************************
* ���ϸ� : SS_L_RDR_EXTN_SERVCLOSDataSet.java
* ��� : Ȯ��뿪��븶�� ����� ���� DataSet
* �ۼ����� : 2003-12-20
* �ۼ��� : ��뼷
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
 * class definition
 *
 */


public class SS_L_RDR_EXTN_SERVCLOSDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curcommlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public long totalcnt;

	public SS_L_RDR_EXTN_SERVCLOSDataSet(){}
	public SS_L_RDR_EXTN_SERVCLOSDataSet(String errcode, String errmsg, long totalcnt){
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
		ResultSet rset3 = (ResultSet) cstmt.getObject(7);
		while(rset3.next()){
			SS_L_RDR_EXTN_SERVCLOSCURCOMMLISTRecord rec = new SS_L_RDR_EXTN_SERVCLOSCURCOMMLISTRecord();
			rec.basidt = Util.checkString(rset3.getString("basidt"));
			rec.frdt = Util.checkString(rset3.getString("frdt"));
			rec.todt = Util.checkString(rset3.getString("todt"));
			rec.closdt = Util.checkString(rset3.getString("closdt"));
			this.curcommlist.add(rec);
		}
		this.totalcnt = cstmt.getLong(8);
	}

	public String curcommlistOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curcommlist.size();
		for(int i=0; i<size; i++){
			SS_L_RDR_EXTN_SERVCLOSCURCOMMLISTRecord rec = (SS_L_RDR_EXTN_SERVCLOSCURCOMMLISTRecord)curcommlist.get(i);
			
			
			String code = rec.basidt;
			String name = rec.frdt;
			
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
			SS_L_RDR_EXTN_SERVCLOSCURCOMMLISTRecord rec = (SS_L_RDR_EXTN_SERVCLOSCURCOMMLISTRecord)curcommlist.get(i);
			
			
			String code = rec.basidt;
			String name = rec.frdt;
			
			sb.append("<input name=\"");
			sb.append("basidt");
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
			SS_L_RDR_EXTN_SERVCLOSCURCOMMLISTRecord rec = (SS_L_RDR_EXTN_SERVCLOSCURCOMMLISTRecord)curcommlist.get(i);
			
			
			String code = rec.basidt;
			String name = rec.frdt;
			
			sb.append("<input name=\"");
			sb.append("basidt");
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
	SS_L_RDR_EXTN_SERVCLOSDataSet ds = (SS_L_RDR_EXTN_SERVCLOSDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curcommlist.size(); i++){
		SS_L_RDR_EXTN_SERVCLOSCURCOMMLISTRecord curcommlistRec = (SS_L_RDR_EXTN_SERVCLOSCURCOMMLISTRecord)ds.curcommlist.get(i);%>
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

<%= curcommlistRec.basidt%>
<%= curcommlistRec.frdt%>
<%= curcommlistRec.todt%>
<%= curcommlistRec.closdt%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Sat Dec 20 20:31:44 KST 2003 */
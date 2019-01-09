/***************************************************************************************************
* ���ϸ� : SS_S_INSRAPLCDataSet.java
* ��� : ��������-���غ���-�űԽ�û-�󼼸���� ���� DataSet
* �ۼ����� : 2004-02-19
* �ۼ��� : ��뼷
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/

package chosun.ciis.ss.sls.brsup.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.brsup.dm.*;
import chosun.ciis.ss.sls.brsup.rec.*;

/**
 * ��������-���غ���-�űԽ�û-�󼼸���� ���� DataSet
 */

public class SS_S_INSRAPLCDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curcommlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public SS_S_INSRAPLCDataSet(){}
	public SS_S_INSRAPLCDataSet(String errcode, String errmsg){
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
			SS_S_INSRAPLCCURCOMMLISTRecord rec = new SS_S_INSRAPLCCURCOMMLISTRecord();
			rec.flnm = Util.checkString(rset0.getString("flnm"));
			rec.prn = Util.checkString(rset0.getString("prn"));
			rec.dutynm = Util.checkString(rset0.getString("dutynm"));
			rec.insrnm = Util.checkString(rset0.getString("insrnm"));
			this.curcommlist.add(rec);
		}
	}

	public String curcommlistOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curcommlist.size();
		for(int i=0; i<size; i++){
			SS_S_INSRAPLCCURCOMMLISTRecord rec = (SS_S_INSRAPLCCURCOMMLISTRecord)curcommlist.get(i);
			
			
			String code = rec.flnm;
			String name = rec.prn;
			
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
			SS_S_INSRAPLCCURCOMMLISTRecord rec = (SS_S_INSRAPLCCURCOMMLISTRecord)curcommlist.get(i);
			
			
			String code = rec.flnm;
			String name = rec.prn;
			
			sb.append("<input name=\"");
			sb.append("flnm");
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
			SS_S_INSRAPLCCURCOMMLISTRecord rec = (SS_S_INSRAPLCCURCOMMLISTRecord)curcommlist.get(i);
			
			
			String code = rec.flnm;
			String name = rec.prn;
			
			sb.append("<input name=\"");
			sb.append("flnm");
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
	SS_S_INSRAPLCDataSet ds = (SS_S_INSRAPLCDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curcommlist.size(); i++){
		SS_S_INSRAPLCCURCOMMLISTRecord curcommlistRec = (SS_S_INSRAPLCCURCOMMLISTRecord)ds.curcommlist.get(i);%>
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

<%= curcommlistRec.flnm%>
<%= curcommlistRec.prn%>
<%= curcommlistRec.dutynm%>
<%= curcommlistRec.insrnm%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Thu Feb 19 19:09:38 KST 2004 */
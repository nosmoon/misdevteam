/***************************************************************************************************
* ���ϸ� : SS_L_INSRDataSet.java
* ��� : ��������-���غ���-����� ���� DataSet
* �ۼ����� : 2004-02-10
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
 * ��������-���غ���-��� ���� DataSet
 */

public class SS_L_INSRDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curcommlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public long totalcnt;

	public SS_L_INSRDataSet(){}
	public SS_L_INSRDataSet(String errcode, String errmsg, long totalcnt){
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
		ResultSet rset0 = (ResultSet) cstmt.getObject(7);
		while(rset0.next()){
			SS_L_INSRCURCOMMLISTRecord rec = new SS_L_INSRCURCOMMLISTRecord();
			rec.cntryy = Util.checkString(rset0.getString("cntryy"));
			rec.insrnm = Util.checkString(rset0.getString("insrnm"));
			rec.insrcmpynm = Util.checkString(rset0.getString("insrcmpynm"));
			rec.aplcfrdt = Util.checkString(rset0.getString("aplcfrdt"));
			rec.aplctodt = Util.checkString(rset0.getString("aplctodt"));
			this.curcommlist.add(rec);
		}
		this.totalcnt = cstmt.getLong(8);
	}

	public String curcommlistOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curcommlist.size();
		for(int i=0; i<size; i++){
			SS_L_INSRCURCOMMLISTRecord rec = (SS_L_INSRCURCOMMLISTRecord)curcommlist.get(i);
			
			
			String code = rec.cntryy;
			String name = rec.insrnm;
			
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
			SS_L_INSRCURCOMMLISTRecord rec = (SS_L_INSRCURCOMMLISTRecord)curcommlist.get(i);
			
			
			String code = rec.cntryy;
			String name = rec.insrnm;
			
			sb.append("<input name=\"");
			sb.append("cntryy");
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
			SS_L_INSRCURCOMMLISTRecord rec = (SS_L_INSRCURCOMMLISTRecord)curcommlist.get(i);
			
			
			String code = rec.cntryy;
			String name = rec.insrnm;
			
			sb.append("<input name=\"");
			sb.append("cntryy");
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
	SS_L_INSRDataSet ds = (SS_L_INSRDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curcommlist.size(); i++){
		SS_L_INSRCURCOMMLISTRecord curcommlistRec = (SS_L_INSRCURCOMMLISTRecord)ds.curcommlist.get(i);%>
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

<%= curcommlistRec.cntryy%>
<%= curcommlistRec.insrnm%>
<%= curcommlistRec.insrcmpynm%>
<%= curcommlistRec.aplcfrdt%>
<%= curcommlistRec.aplctodt%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Mon Feb 16 13:13:33 KST 2004 */
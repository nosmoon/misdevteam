/***************************************************************************************************
* ���ϸ� : SS_L_MIGRWORKHISTDataSet.java
* ��� : ������-�۾�-���̱׷��̼�-���(�̷�)�� ���� DataSet
* �ۼ����� : 2004-03-12
* �ۼ��� : ��뼷
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/

package chosun.ciis.ss.sls.admin.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.admin.dm.*;
import chosun.ciis.ss.sls.admin.rec.*;

/**
 * ������-�۾�-���̱׷��̼�-���(�̷�)�� ���� DataSet
 */

public class SS_L_MIGRWORKHISTDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curcommlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public long totalcnt;

	public SS_L_MIGRWORKHISTDataSet(){}
	public SS_L_MIGRWORKHISTDataSet(String errcode, String errmsg, long totalcnt){
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
			SS_L_MIGRWORKHISTCURCOMMLISTRecord rec = new SS_L_MIGRWORKHISTCURCOMMLISTRecord();
			rec.workclsf = Util.checkString(rset0.getString("workclsf"));
			rec.workno = Util.checkString(rset0.getString("workno"));
			rec.workfrdt = rset0.getTimestamp("workfrdt");
			rec.worktodt = rset0.getTimestamp("worktodt");
			rec.work_pers = Util.checkString(rset0.getString("work_pers"));
			rec.workremk = Util.checkString(rset0.getString("workremk"));
			this.curcommlist.add(rec);
		}
		this.totalcnt = cstmt.getLong(8);
	}

	public String curcommlistOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curcommlist.size();
		for(int i=0; i<size; i++){
			SS_L_MIGRWORKHISTCURCOMMLISTRecord rec = (SS_L_MIGRWORKHISTCURCOMMLISTRecord)curcommlist.get(i);
			
			
			String code = rec.workclsf;
			String name = rec.workno;
			
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
			SS_L_MIGRWORKHISTCURCOMMLISTRecord rec = (SS_L_MIGRWORKHISTCURCOMMLISTRecord)curcommlist.get(i);
			
			
			String code = rec.workclsf;
			String name = rec.workno;
			
			sb.append("<input name=\"");
			sb.append("workclsf");
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
			SS_L_MIGRWORKHISTCURCOMMLISTRecord rec = (SS_L_MIGRWORKHISTCURCOMMLISTRecord)curcommlist.get(i);
			
			
			String code = rec.workclsf;
			String name = rec.workno;
			
			sb.append("<input name=\"");
			sb.append("workclsf");
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
	SS_L_MIGRWORKHISTDataSet ds = (SS_L_MIGRWORKHISTDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curcommlist.size(); i++){
		SS_L_MIGRWORKHISTCURCOMMLISTRecord curcommlistRec = (SS_L_MIGRWORKHISTCURCOMMLISTRecord)ds.curcommlist.get(i);%>
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

<%= curcommlistRec.workclsf%>
<%= curcommlistRec.workno%>
<%= curcommlistRec.workfrdt%>
<%= curcommlistRec.worktodt%>
<%= curcommlistRec.work_pers%>
<%= curcommlistRec.workremk%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Sat Mar 13 14:13:00 KST 2004 */
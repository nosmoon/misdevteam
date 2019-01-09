/***************************************************************************************************
* ���ϸ� : SS_L_MIGRWORKPTCRDataSet.java
* ��� : ������-�۾�-���̱׷��̼�-���(����)�� ���� DataSet
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
 * ������-�۾�-���̱׷��̼�-���(����)�� ���� DataSet
 */

public class SS_L_MIGRWORKPTCRDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curcommlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public long totalcnt;

	public SS_L_MIGRWORKPTCRDataSet(){}
	public SS_L_MIGRWORKPTCRDataSet(String errcode, String errmsg, long totalcnt){
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
		ResultSet rset0 = (ResultSet) cstmt.getObject(8);
		while(rset0.next()){
			SS_L_MIGRWORKPTCRCURCOMMLISTRecord rec = new SS_L_MIGRWORKPTCRCURCOMMLISTRecord();
			rec.workclsf = Util.checkString(rset0.getString("workclsf"));
			rec.workno = Util.checkString(rset0.getString("workno"));
			rec.dtlsworkno = Util.checkString(rset0.getString("dtlsworkno"));
			rec.workdescri = Util.checkString(rset0.getString("workdescri"));
			rec.workfrdt = rset0.getTimestamp("workfrdt");
			rec.worktodt = rset0.getTimestamp("worktodt");
			rec.srctbl = Util.checkString(rset0.getString("srctbl"));
			rec.targtbl = Util.checkString(rset0.getString("targtbl"));
			rec.abstrnoit = rset0.getInt("abstrnoit");
			rec.switnoit = rset0.getInt("switnoit");
			rec.errcd = Util.checkString(rset0.getString("errcd"));
			rec.errmsg = Util.checkString(rset0.getString("errmsg"));
			this.curcommlist.add(rec);
		}
		this.totalcnt = cstmt.getLong(9);
	}

	public String curcommlistOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curcommlist.size();
		for(int i=0; i<size; i++){
			SS_L_MIGRWORKPTCRCURCOMMLISTRecord rec = (SS_L_MIGRWORKPTCRCURCOMMLISTRecord)curcommlist.get(i);
			
			
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
			SS_L_MIGRWORKPTCRCURCOMMLISTRecord rec = (SS_L_MIGRWORKPTCRCURCOMMLISTRecord)curcommlist.get(i);
			
			
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
			SS_L_MIGRWORKPTCRCURCOMMLISTRecord rec = (SS_L_MIGRWORKPTCRCURCOMMLISTRecord)curcommlist.get(i);
			
			
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
	SS_L_MIGRWORKPTCRDataSet ds = (SS_L_MIGRWORKPTCRDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curcommlist.size(); i++){
		SS_L_MIGRWORKPTCRCURCOMMLISTRecord curcommlistRec = (SS_L_MIGRWORKPTCRCURCOMMLISTRecord)ds.curcommlist.get(i);%>
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
<%= curcommlistRec.dtlsworkno%>
<%= curcommlistRec.workdescri%>
<%= curcommlistRec.workfrdt%>
<%= curcommlistRec.worktodt%>
<%= curcommlistRec.srctbl%>
<%= curcommlistRec.targtbl%>
<%= curcommlistRec.abstrnoit%>
<%= curcommlistRec.switnoit%>
<%= curcommlistRec.errcd%>
<%= curcommlistRec.errmsg%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Mon Mar 15 13:15:14 KST 2004 */
/***************************************************************************************************
* ���ϸ� : SS_L_BO_HEADIDEADataSet.java
* ��� : ����Info-������-������Ұ� ����� ���� DataSet
* �ۼ����� : 2004-04-24
* �ۼ��� : ��뼷
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/

package chosun.ciis.ss.sls.brinfo.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.brinfo.dm.*;
import chosun.ciis.ss.sls.brinfo.rec.*;

/**
 * ����Info-������-������Ұ� ����� ���� DataSet
 */

public class SS_L_BO_HEADIDEADataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curcommlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public long totalcnt;

	public SS_L_BO_HEADIDEADataSet(){}
	public SS_L_BO_HEADIDEADataSet(String errcode, String errmsg, long totalcnt){
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
		this.totalcnt = cstmt.getLong(9);
		ResultSet rset0 = (ResultSet) cstmt.getObject(10);
		while(rset0.next()){
			SS_L_BO_HEADIDEACURCOMMLISTRecord rec = new SS_L_BO_HEADIDEACURCOMMLISTRecord();
			rec.prn = Util.checkString(rset0.getString("prn"));
			rec.seq = Util.checkString(rset0.getString("seq"));
			rec.makedt = Util.checkString(rset0.getString("makedt"));
			rec.makepersnm = Util.checkString(rset0.getString("makepersnm"));
			rec.idea1 = Util.checkString(rset0.getString("idea1"));
			this.curcommlist.add(rec);
		}
	}

	public String curcommlistOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curcommlist.size();
		for(int i=0; i<size; i++){
			SS_L_BO_HEADIDEACURCOMMLISTRecord rec = (SS_L_BO_HEADIDEACURCOMMLISTRecord)curcommlist.get(i);
			
			
			String code = rec.prn;
			String name = rec.seq;
			
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
			SS_L_BO_HEADIDEACURCOMMLISTRecord rec = (SS_L_BO_HEADIDEACURCOMMLISTRecord)curcommlist.get(i);
			
			
			String code = rec.prn;
			String name = rec.seq;
			
			sb.append("<input name=\"");
			sb.append("prn");
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
			SS_L_BO_HEADIDEACURCOMMLISTRecord rec = (SS_L_BO_HEADIDEACURCOMMLISTRecord)curcommlist.get(i);
			
			
			String code = rec.prn;
			String name = rec.seq;
			
			sb.append("<input name=\"");
			sb.append("prn");
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
	SS_L_BO_HEADIDEADataSet ds = (SS_L_BO_HEADIDEADataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curcommlist.size(); i++){
		SS_L_BO_HEADIDEACURCOMMLISTRecord curcommlistRec = (SS_L_BO_HEADIDEACURCOMMLISTRecord)ds.curcommlist.get(i);%>
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

<%= curcommlistRec.prn%>
<%= curcommlistRec.seq%>
<%= curcommlistRec.makedt%>
<%= curcommlistRec.makepersnm%>
<%= curcommlistRec.idea1%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Fri May 21 15:01:42 KST 2004 */
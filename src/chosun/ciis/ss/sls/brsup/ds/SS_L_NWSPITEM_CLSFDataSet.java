/***************************************************************************************************
* ���ϸ� : SS_L_NWSPITEM_CLSFDataSet.java
* ��� : ��������-�Ź�������ǰ-��ǰ����� ���� DataSet
* �ۼ����� : 2004-01-20
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
 * ��������-�Ź�������ǰ-��ǰ����� ���� DataSet
 */

public class SS_L_NWSPITEM_CLSFDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curcommlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public SS_L_NWSPITEM_CLSFDataSet(){}
	public SS_L_NWSPITEM_CLSFDataSet(String errcode, String errmsg){
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
		ResultSet rset6 = (ResultSet) cstmt.getObject(4);
		while(rset6.next()){
			SS_L_NWSPITEM_CLSFCURCOMMLISTRecord rec = new SS_L_NWSPITEM_CLSFCURCOMMLISTRecord();
			rec.itemcd = Util.checkString(rset6.getString("itemcd"));
			rec.itemnm = Util.checkString(rset6.getString("itemnm"));
			this.curcommlist.add(rec);
		}
	}

	public String curcommlistOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curcommlist.size();
		for(int i=0; i<size; i++){
			SS_L_NWSPITEM_CLSFCURCOMMLISTRecord rec = (SS_L_NWSPITEM_CLSFCURCOMMLISTRecord)curcommlist.get(i);


			String code = rec.itemcd;
			String name = rec.itemnm;

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
			SS_L_NWSPITEM_CLSFCURCOMMLISTRecord rec = (SS_L_NWSPITEM_CLSFCURCOMMLISTRecord)curcommlist.get(i);


			String code = rec.itemcd;
			String name = rec.itemnm;

			sb.append("<input name=\"");
			sb.append("itemcd");
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
			SS_L_NWSPITEM_CLSFCURCOMMLISTRecord rec = (SS_L_NWSPITEM_CLSFCURCOMMLISTRecord)curcommlist.get(i);


			String code = rec.itemcd;
			String name = rec.itemnm;

			sb.append("<input name=\"");
			sb.append("itemcd");
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
	SS_L_NWSPITEM_CLSFDataSet ds = (SS_L_NWSPITEM_CLSFDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curcommlist.size(); i++){
		SS_L_NWSPITEM_CLSFCURCOMMLISTRecord curcommlistRec = (SS_L_NWSPITEM_CLSFCURCOMMLISTRecord)ds.curcommlist.get(i);%>
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

<%= curcommlistRec.itemcd%>
<%= curcommlistRec.itemnm%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Wed Jan 28 20:45:07 KST 2004 */
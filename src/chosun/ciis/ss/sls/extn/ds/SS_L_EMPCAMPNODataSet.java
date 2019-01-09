/***************************************************************************************************
* ���ϸ� : SS_L_EMPCAMPNODataSet.java
* ��� : ���Ȯ���ȸ ��ȣ,��ȸ���� ���� DataSet
* �ۼ����� : 2003-12-15
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


public class SS_L_EMPCAMPNODataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curcommlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public SS_L_EMPCAMPNODataSet(){}
	public SS_L_EMPCAMPNODataSet(String errcode, String errmsg){
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
			SS_L_EMPCAMPNOCURCOMMLISTRecord rec = new SS_L_EMPCAMPNOCURCOMMLISTRecord();
			rec.rdr_extncampno = Util.checkString(rset0.getString("rdr_extncampno"));
			rec.campnm = Util.checkString(rset0.getString("campnm"));
			this.curcommlist.add(rec);
		}
	}

	public String curcommlistOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curcommlist.size();
		for(int i=0; i<size; i++){
			SS_L_EMPCAMPNOCURCOMMLISTRecord rec = (SS_L_EMPCAMPNOCURCOMMLISTRecord)curcommlist.get(i);


			String code = rec.rdr_extncampno;
			String name = rec.campnm;

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
			SS_L_EMPCAMPNOCURCOMMLISTRecord rec = (SS_L_EMPCAMPNOCURCOMMLISTRecord)curcommlist.get(i);


			String code = rec.rdr_extncampno;
			String name = rec.campnm;

			sb.append("<input name=\"");
			sb.append("rdr_extncampno");
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
			SS_L_EMPCAMPNOCURCOMMLISTRecord rec = (SS_L_EMPCAMPNOCURCOMMLISTRecord)curcommlist.get(i);


			String code = rec.rdr_extncampno;
			String name = rec.campnm;

			sb.append("<input name=\"");
			sb.append("rdr_extncampno");
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
	SS_L_EMPCAMPNODataSet ds = (SS_L_EMPCAMPNODataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curcommlist.size(); i++){
		SS_L_EMPCAMPNOCURCOMMLISTRecord curcommlistRec = (SS_L_EMPCAMPNOCURCOMMLISTRecord)ds.curcommlist.get(i);%>
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

<%= curcommlistRec.rdr_extncampno%>
<%= curcommlistRec.campnm%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Mon Dec 15 20:59:39 KST 2003 */
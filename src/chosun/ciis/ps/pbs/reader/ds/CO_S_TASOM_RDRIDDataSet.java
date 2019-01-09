/***************************************************************************************************
* ���ϸ�   : CO_S_TASOM_RDRID.java
* ���     : ����-����÷��� ȸ�� ����Ʈ
* �ۼ����� : 2005-09-15
* �ۼ���   : ����ǥ
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� :
***************************************************************************************************/


package chosun.ciis.ps.pbs.reader.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ps.pbs.reader.dm.*;
import chosun.ciis.ps.pbs.reader.rec.*;

/**
 *  ����-����÷��� ȸ�� ����Ʈ
 *
 **/

public class CO_S_TASOM_RDRIDDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList tasom_rdridlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public CO_S_TASOM_RDRIDDataSet(){}
	public CO_S_TASOM_RDRIDDataSet(String errcode, String errmsg){
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
		ResultSet rset0 = (ResultSet) cstmt.getObject(6);
		while(rset0.next()){
			CO_S_TASOM_RDRIDTASOM_RDRIDLISTRecord rec = new CO_S_TASOM_RDRIDTASOM_RDRIDLISTRecord();
			rec.memb_nm_korn = Util.checkString(rset0.getString("memb_nm_korn"));
			rec.onlmembid = Util.checkString(rset0.getString("onlmembid"));
			rec.tel = Util.checkString(rset0.getString("tel"));
			rec.address = Util.checkString(rset0.getString("address"));
			this.tasom_rdridlist.add(rec);
		}
	}

	public String tasom_rdridlistOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = tasom_rdridlist.size();
		for(int i=0; i<size; i++){
			CO_S_TASOM_RDRIDTASOM_RDRIDLISTRecord rec = (CO_S_TASOM_RDRIDTASOM_RDRIDLISTRecord)tasom_rdridlist.get(i);
			
			
			String code = rec.memb_nm_korn;
			String name = rec.onlmembid;
			
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

	public String tasom_rdridlistChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = tasom_rdridlist.size();
		for(int i=0; i<size; i++){
			CO_S_TASOM_RDRIDTASOM_RDRIDLISTRecord rec = (CO_S_TASOM_RDRIDTASOM_RDRIDLISTRecord)tasom_rdridlist.get(i);
			
			
			String code = rec.memb_nm_korn;
			String name = rec.onlmembid;
			
			sb.append("<input name=\"");
			sb.append("memb_nm_korn");
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

	public String tasom_rdridlistRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = tasom_rdridlist.size();
		for(int i=0; i<size; i++){
			CO_S_TASOM_RDRIDTASOM_RDRIDLISTRecord rec = (CO_S_TASOM_RDRIDTASOM_RDRIDLISTRecord)tasom_rdridlist.get(i);
			
			
			String code = rec.memb_nm_korn;
			String name = rec.onlmembid;
			
			sb.append("<input name=\"");
			sb.append("memb_nm_korn");
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
	CO_S_TASOM_RDRIDDataSet ds = (CO_S_TASOM_RDRIDDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.tasom_rdridlist.size(); i++){
		CO_S_TASOM_RDRIDTASOM_RDRIDLISTRecord tasom_rdridlistRec = (CO_S_TASOM_RDRIDTASOM_RDRIDLISTRecord)ds.tasom_rdridlist.get(i);%>
HTML �ڵ��....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getTasom_rdridlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= tasom_rdridlistRec.memb_nm_korn%>
<%= tasom_rdridlistRec.onlmembid%>
<%= tasom_rdridlistRec.tel%>
<%= tasom_rdridlistRec.address%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Thu Sep 15 11:25:29 KST 2005 */
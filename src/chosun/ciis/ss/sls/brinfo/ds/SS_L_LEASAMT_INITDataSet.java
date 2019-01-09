/***************************************************************************************************
* ���ϸ� : SS_L_LEASAMT_INITDataSet.java
* ��� : ����INFO-������������ȭ-�ʱ� ȭ��(�μ��ڵ���ȸ)
* �ۼ����� : 2004-02-09
* �ۼ��� : �輺��
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
 * ����INFO-������������Ȳ-�ʱ� ȭ��(�μ���ȸ)
 *
 */


public class SS_L_LEASAMT_INITDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList deptlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public SS_L_LEASAMT_INITDataSet(){}
	public SS_L_LEASAMT_INITDataSet(String errcode, String errmsg){
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
			SS_L_LEASAMT_INITDEPTLISTRecord rec = new SS_L_LEASAMT_INITDEPTLISTRecord();
			rec.deptcd = Util.checkString(rset0.getString("deptcd"));
			rec.boksnm = Util.checkString(rset0.getString("boksnm"));
			this.deptlist.add(rec);
		}
	}

	public String deptlistOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = deptlist.size();
		for(int i=0; i<size; i++){
			SS_L_LEASAMT_INITDEPTLISTRecord rec = (SS_L_LEASAMT_INITDEPTLISTRecord)deptlist.get(i);


			String code = rec.deptcd;
			String name = rec.boksnm;

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

	public String deptlistChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = deptlist.size();
		for(int i=0; i<size; i++){
			SS_L_LEASAMT_INITDEPTLISTRecord rec = (SS_L_LEASAMT_INITDEPTLISTRecord)deptlist.get(i);


			String code = rec.deptcd;
			String name = rec.boksnm;

			sb.append("<input name=\"");
			sb.append("deptcd");
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

	public String deptlistRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = deptlist.size();
		for(int i=0; i<size; i++){
			SS_L_LEASAMT_INITDEPTLISTRecord rec = (SS_L_LEASAMT_INITDEPTLISTRecord)deptlist.get(i);


			String code = rec.deptcd;
			String name = rec.boksnm;

			sb.append("<input name=\"");
			sb.append("deptcd");
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
	SS_L_LEASAMT_INITDataSet ds = (SS_L_LEASAMT_INITDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.deptlist.size(); i++){
		SS_L_LEASAMT_INITDEPTLISTRecord deptlistRec = (SS_L_LEASAMT_INITDEPTLISTRecord)ds.deptlist.get(i);%>
HTML �ڵ��....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getDeptlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= deptlistRec.deptcd%>
<%= deptlistRec.boksnm%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Mon Feb 09 16:39:26 KST 2004 */
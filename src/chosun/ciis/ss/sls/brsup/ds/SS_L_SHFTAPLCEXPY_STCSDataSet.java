/***************************************************************************************************
* ���ϸ� : .java
* ��� : ������������-Billing�ڵ���ü-��û/�������-�����ȸ
* �ۼ����� : 2005-01-11
* �ۼ��� : �迵��
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
 * ������������-Billing�ڵ���ü-��û/�������-�����ȸ
 */


public class SS_L_SHFTAPLCEXPY_STCSDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList rsltcur = new ArrayList();
	public String errcode;
	public String errmsg;
	public long totalcnt;

	public SS_L_SHFTAPLCEXPY_STCSDataSet(){}
	public SS_L_SHFTAPLCEXPY_STCSDataSet(String errcode, String errmsg, long totalcnt){
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
		this.totalcnt = cstmt.getLong(13);
		ResultSet rset0 = (ResultSet) cstmt.getObject(14);
		while(rset0.next()){
			SS_L_SHFTAPLCEXPY_STCSRSLTCURRecord rec = new SS_L_SHFTAPLCEXPY_STCSRSLTCURRecord();
			rec.title1 = Util.checkString(rset0.getString("title1"));
			rec.title2 = Util.checkString(rset0.getString("title2"));
			rec.aplc_ok = rset0.getInt("aplc_ok");
			rec.aplc_err = rset0.getInt("aplc_err");
			rec.aplc_sum = rset0.getInt("aplc_sum");
			rec.aplc_no = rset0.getInt("aplc_no");
			rec.total = rset0.getInt("total");
			this.rsltcur.add(rec);
		}
	}

	public String rsltcurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = rsltcur.size();
		for(int i=0; i<size; i++){
			SS_L_SHFTAPLCEXPY_STCSRSLTCURRecord rec = (SS_L_SHFTAPLCEXPY_STCSRSLTCURRecord)rsltcur.get(i);


			String code = rec.title1;
			String name = rec.title2;

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

	public String rsltcurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = rsltcur.size();
		for(int i=0; i<size; i++){
			SS_L_SHFTAPLCEXPY_STCSRSLTCURRecord rec = (SS_L_SHFTAPLCEXPY_STCSRSLTCURRecord)rsltcur.get(i);


			String code = rec.title1;
			String name = rec.title2;

			sb.append("<input name=\"");
			sb.append("title1");
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

	public String rsltcurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = rsltcur.size();
		for(int i=0; i<size; i++){
			SS_L_SHFTAPLCEXPY_STCSRSLTCURRecord rec = (SS_L_SHFTAPLCEXPY_STCSRSLTCURRecord)rsltcur.get(i);


			String code = rec.title1;
			String name = rec.title2;

			sb.append("<input name=\"");
			sb.append("title1");
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
	SS_L_SHFTAPLCEXPY_STCSDataSet ds = (SS_L_SHFTAPLCEXPY_STCSDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.rsltcur.size(); i++){
		SS_L_SHFTAPLCEXPY_STCSRSLTCURRecord rsltcurRec = (SS_L_SHFTAPLCEXPY_STCSRSLTCURRecord)ds.rsltcur.get(i);%>
HTML �ڵ��....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getTotalcnt()%>
<%= ds.getRsltcur()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= rsltcurRec.title1%>
<%= rsltcurRec.title2%>
<%= rsltcurRec.aplc_ok%>
<%= rsltcurRec.aplc_err%>
<%= rsltcurRec.aplc_sum%>
<%= rsltcurRec.aplc_no%>
<%= rsltcurRec.total%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Tue Jan 11 20:20:30 KST 2005 */

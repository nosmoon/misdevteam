/***************************************************************************************************
* ���ϸ� : SS_L_EDI_RECP_RJCTDataSet.java
* ��� : ����EDI Reject�����ȸ
* �ۼ����� : 2004-03-10
* �ۼ��� : ���
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
 * ����EDI Reject�����ȸ
 *
 */


public class SS_L_EDI_RECP_RJCTDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList rsltcur = new ArrayList();
	public String errcode;
	public String errmsg;

	public SS_L_EDI_RECP_RJCTDataSet(){}
	public SS_L_EDI_RECP_RJCTDataSet(String errcode, String errmsg){
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
			SS_L_EDI_RECP_RJCTRSLTCURRecord rec = new SS_L_EDI_RECP_RJCTRSLTCURRecord();
			rec.acqdt = Util.checkString(rset0.getString("acqdt"));
			rec.acqno = Util.checkString(rset0.getString("acqno"));
			rec.girono = Util.checkString(rset0.getString("girono"));
			rec.seq = Util.checkString(rset0.getString("seq"));
			rec.recpdt = Util.checkString(rset0.getString("recpdt"));
			rec.amt = rset0.getInt("amt");
			rec.recpclsf = Util.checkString(rset0.getString("recpclsf"));
			rec.custbrwsno = Util.checkString(rset0.getString("custbrwsno"));
			this.rsltcur.add(rec);
		}
	}

	public String rsltcurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = rsltcur.size();
		for(int i=0; i<size; i++){
			SS_L_EDI_RECP_RJCTRSLTCURRecord rec = (SS_L_EDI_RECP_RJCTRSLTCURRecord)rsltcur.get(i);


			String code = rec.acqdt;
			String name = rec.acqno;

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
			SS_L_EDI_RECP_RJCTRSLTCURRecord rec = (SS_L_EDI_RECP_RJCTRSLTCURRecord)rsltcur.get(i);


			String code = rec.acqdt;
			String name = rec.acqno;

			sb.append("<input name=\"");
			sb.append("acqdt");
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
			SS_L_EDI_RECP_RJCTRSLTCURRecord rec = (SS_L_EDI_RECP_RJCTRSLTCURRecord)rsltcur.get(i);


			String code = rec.acqdt;
			String name = rec.acqno;

			sb.append("<input name=\"");
			sb.append("acqdt");
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
	SS_L_EDI_RECP_RJCTDataSet ds = (SS_L_EDI_RECP_RJCTDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.rsltcur.size(); i++){
		SS_L_EDI_RECP_RJCTRSLTCURRecord rsltcurRec = (SS_L_EDI_RECP_RJCTRSLTCURRecord)ds.rsltcur.get(i);%>
HTML �ڵ��....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getRsltcur()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= rsltcurRec.acqdt%>
<%= rsltcurRec.acqno%>
<%= rsltcurRec.girono%>
<%= rsltcurRec.seq%>
<%= rsltcurRec.recpdt%>
<%= rsltcurRec.amt%>
<%= rsltcurRec.recpclsf%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Wed Mar 10 17:04:02 KST 2004 */
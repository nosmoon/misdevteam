/***************************************************************************************************
* ���ϸ� : .java
* ��� : *������������-Billing�ڵ���ü-û������-��ü���к� û�����
* �ۼ����� : 2009-04-14
* �ۼ��� : �輼��
***************************************************************************************************/


package chosun.ciis.ss.sls.brsup.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.brsup.dm.*;
import chosun.ciis.ss.sls.brsup.rec.*;

/**
 * ������������-Billing�ڵ���ü-û������-��ü���к� û�����
 */

public class SS_L_SHFT_CLAMDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList rsltcur = new ArrayList();
	public String errcode;
	public String errmsg;
	public long totalcnt;

	public SS_L_SHFT_CLAMDataSet(){}
	public SS_L_SHFT_CLAMDataSet(String errcode, String errmsg, long totalcnt){
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
		this.totalcnt = cstmt.getLong(10);
		ResultSet rset0 = (ResultSet) cstmt.getObject(11);
		while(rset0.next()){
			SS_L_SHFT_CLAMRSLTCURRecord rec = new SS_L_SHFT_CLAMRSLTCURRecord();
			rec.bonm = Util.checkString(rset0.getString("bonm"));
			rec.areanm = Util.checkString(rset0.getString("areanm"));
			rec.giroclamnoit = rset0.getInt("giroclamnoit");
			rec.giroclamtotamt = rset0.getInt("giroclamtotamt");
			rec.girorecpnoit = rset0.getInt("girorecpnoit");
			rec.girorecptotamt = rset0.getInt("girorecptotamt");
			rec.docardclamnoit = rset0.getInt("docardclamnoit");
			rec.docardclamtotamt = rset0.getInt("docardclamtotamt");
			rec.docardrecpnoit = rset0.getInt("docardrecpnoit");
			rec.docardrecptotamt = rset0.getInt("docardrecptotamt");
			rec.cardclamnoit = rset0.getInt("cardclamnoit");
			rec.cardclamtotamt = rset0.getInt("cardclamtotamt");
			rec.cardrecpnoit = rset0.getInt("cardrecpnoit");
			rec.cardrecptotamt = rset0.getInt("cardrecptotamt");
			this.rsltcur.add(rec);
		}
	}

	public String rsltcurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = rsltcur.size();
		for(int i=0; i<size; i++){
			SS_L_SHFT_CLAMRSLTCURRecord rec = (SS_L_SHFT_CLAMRSLTCURRecord)rsltcur.get(i);
			
			
			String code = rec.bonm;
			String name = rec.areanm;
			
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
			SS_L_SHFT_CLAMRSLTCURRecord rec = (SS_L_SHFT_CLAMRSLTCURRecord)rsltcur.get(i);
			
			
			String code = rec.bonm;
			String name = rec.areanm;
			
			sb.append("<input name=\"");
			sb.append("bonm");
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
			SS_L_SHFT_CLAMRSLTCURRecord rec = (SS_L_SHFT_CLAMRSLTCURRecord)rsltcur.get(i);
			
			
			String code = rec.bonm;
			String name = rec.areanm;
			
			sb.append("<input name=\"");
			sb.append("bonm");
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
	SS_L_SHFT_CLAMDataSet ds = (SS_L_SHFT_CLAMDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.rsltcur.size(); i++){
		SS_L_SHFT_CLAMRSLTCURRecord rsltcurRec = (SS_L_SHFT_CLAMRSLTCURRecord)ds.rsltcur.get(i);%>
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

<%= rsltcurRec.bonm%>
<%= rsltcurRec.areanm%>
<%= rsltcurRec.giroclamnoit%>
<%= rsltcurRec.giroclamtotamt%>
<%= rsltcurRec.girorecpnoit%>
<%= rsltcurRec.girorecptotamt%>
<%= rsltcurRec.docardclamnoit%>
<%= rsltcurRec.docardclamtotamt%>
<%= rsltcurRec.docardrecpnoit%>
<%= rsltcurRec.docardrecptotamt%>
<%= rsltcurRec.cardclamnoit%>
<%= rsltcurRec.cardclamtotamt%>
<%= rsltcurRec.cardrecpnoit%>
<%= rsltcurRec.cardrecptotamt%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Tue Apr 14 14:50:31 KST 2009 */
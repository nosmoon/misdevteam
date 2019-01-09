/***************************************************************************************************
* ���ϸ� : SS_L_SHFT_PYMT_LOGDataSet.java
* ��� : ������������-Billing�ڵ���ü-�����ڰ���-���������� �α׳���
* �ۼ����� : 2004-04-12
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
 * ������������-Billing�ڵ���ü-�����ڰ���-���������� �α׳���
 *
 */


public class SS_L_SHFT_PYMT_LOGDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList rsltcur = new ArrayList();
	public String errcode;
	public String errmsg;
	public long totalcnt;

	public SS_L_SHFT_PYMT_LOGDataSet(){}
	public SS_L_SHFT_PYMT_LOGDataSet(String errcode, String errmsg, long totalcnt){
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
		this.totalcnt = cstmt.getLong(6);
		ResultSet rset0 = (ResultSet) cstmt.getObject(7);
		while(rset0.next()){
			SS_L_SHFT_PYMT_LOGRSLTCURRecord rec = new SS_L_SHFT_PYMT_LOGRSLTCURRecord();
			rec.pymtseq = Util.checkString(rset0.getString("pymtseq"));
			rec.shftclsf = Util.checkString(rset0.getString("shftclsf"));
			rec.shftclsfnm = Util.checkString(rset0.getString("shftclsfnm"));
			rec.prn = Util.checkString(rset0.getString("prn"));
			rec.pymtnm = Util.checkString(rset0.getString("pymtnm"));
			rec.email = Util.checkString(rset0.getString("email"));
			rec.tel1 = Util.checkString(rset0.getString("tel1"));
			rec.tel2 = Util.checkString(rset0.getString("tel2"));
			rec.tel3 = Util.checkString(rset0.getString("tel3"));
			rec.zip = Util.checkString(rset0.getString("zip"));
			rec.addr = Util.checkString(rset0.getString("addr"));
			rec.addrdtls = Util.checkString(rset0.getString("addrdtls"));
			rec.bankcd = Util.checkString(rset0.getString("bankcd"));
			rec.banknm = Util.checkString(rset0.getString("banknm"));
			rec.acctno = Util.checkString(rset0.getString("acctno"));
			rec.cardcmpycd = Util.checkString(rset0.getString("cardcmpycd"));
			rec.cardno = Util.checkString(rset0.getString("cardno"));
			this.rsltcur.add(rec);
		}
	}

	public String rsltcurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = rsltcur.size();
		for(int i=0; i<size; i++){
			SS_L_SHFT_PYMT_LOGRSLTCURRecord rec = (SS_L_SHFT_PYMT_LOGRSLTCURRecord)rsltcur.get(i);


			String code = rec.pymtseq;
			String name = rec.shftclsf;

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
			SS_L_SHFT_PYMT_LOGRSLTCURRecord rec = (SS_L_SHFT_PYMT_LOGRSLTCURRecord)rsltcur.get(i);


			String code = rec.pymtseq;
			String name = rec.shftclsf;

			sb.append("<input name=\"");
			sb.append("pymtseq");
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
			SS_L_SHFT_PYMT_LOGRSLTCURRecord rec = (SS_L_SHFT_PYMT_LOGRSLTCURRecord)rsltcur.get(i);


			String code = rec.pymtseq;
			String name = rec.shftclsf;

			sb.append("<input name=\"");
			sb.append("pymtseq");
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
	SS_L_SHFT_PYMT_LOGDataSet ds = (SS_L_SHFT_PYMT_LOGDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.rsltcur.size(); i++){
		SS_L_SHFT_PYMT_LOGRSLTCURRecord rsltcurRec = (SS_L_SHFT_PYMT_LOGRSLTCURRecord)ds.rsltcur.get(i);%>
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

<%= rsltcurRec.pymtseq%>
<%= rsltcurRec.shftclsf%>
<%= rsltcurRec.shftclsfnm%>
<%= rsltcurRec.prn%>
<%= rsltcurRec.pymtnm%>
<%= rsltcurRec.email%>
<%= rsltcurRec.tel1%>
<%= rsltcurRec.tel2%>
<%= rsltcurRec.tel3%>
<%= rsltcurRec.zip%>
<%= rsltcurRec.addr%>
<%= rsltcurRec.addrdtls%>
<%= rsltcurRec.bankcd%>
<%= rsltcurRec.banknm%>
<%= rsltcurRec.acctno%>
<%= rsltcurRec.cardcmpycd%>
<%= rsltcurRec.cardno%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Mon Apr 12 10:22:42 KST 2004 */
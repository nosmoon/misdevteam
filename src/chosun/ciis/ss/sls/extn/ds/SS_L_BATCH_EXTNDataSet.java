/***************************************************************************************************
 * ���ϸ�   : SSExtn2280.java
 * ���     : �ϰ�Ȯ�� ���
 * �ۼ����� : 2011-03-30
 * �ۼ���   : ������
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
 * 
 */


public class SS_L_BATCH_EXTNDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList rsltcur = new ArrayList();
	public String errcode;
	public String errmsg;

	public SS_L_BATCH_EXTNDataSet(){}
	public SS_L_BATCH_EXTNDataSet(String errcode, String errmsg){
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
		ResultSet rset0 = (ResultSet) cstmt.getObject(4);
		while(rset0.next()){
			SS_L_BATCH_EXTNRSLTCURRecord rec = new SS_L_BATCH_EXTNRSLTCURRecord();
			rec.rdr_no = Util.checkString(rset0.getString("rdr_no"));
			rec.valqty = Util.checkString(rset0.getString("valqty"));
			rec.extndt = Util.checkString(rset0.getString("extndt"));
			rec.extnno = Util.checkString(rset0.getString("extnno"));
			rec.extnnm = Util.checkString(rset0.getString("extnnm"));
			rec.extnaddr = Util.checkString(rset0.getString("extnaddr"));
			rec.extntel = Util.checkString(rset0.getString("extntel"));
			this.rsltcur.add(rec);
		}
	}

	public String rsltcurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = rsltcur.size();
		for(int i=0; i<size; i++){
			SS_L_BATCH_EXTNRSLTCURRecord rec = (SS_L_BATCH_EXTNRSLTCURRecord)rsltcur.get(i);
			
			
			String code = rec.rdr_no;
			String name = rec.valqty;
			
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
			SS_L_BATCH_EXTNRSLTCURRecord rec = (SS_L_BATCH_EXTNRSLTCURRecord)rsltcur.get(i);
			
			
			String code = rec.rdr_no;
			String name = rec.valqty;
			
			sb.append("<input name=\"");
			sb.append("rdr_no");
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
			SS_L_BATCH_EXTNRSLTCURRecord rec = (SS_L_BATCH_EXTNRSLTCURRecord)rsltcur.get(i);
			
			
			String code = rec.rdr_no;
			String name = rec.valqty;
			
			sb.append("<input name=\"");
			sb.append("rdr_no");
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
	SS_L_BATCH_EXTNDataSet ds = (SS_L_BATCH_EXTNDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.rsltcur.size(); i++){
		SS_L_BATCH_EXTNRSLTCURRecord rsltcurRec = (SS_L_BATCH_EXTNRSLTCURRecord)ds.rsltcur.get(i);%>
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

<%= rsltcurRec.rdr_no%>
<%= rsltcurRec.valqty%>
<%= rsltcurRec.extndt%>
<%= rsltcurRec.extnno%>
<%= rsltcurRec.extnnm%>
<%= rsltcurRec.extnaddr%>
<%= rsltcurRec.extntel%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Tue Apr 05 10:56:32 KST 2011 */
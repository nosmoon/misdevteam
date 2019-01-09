/***************************************************************************************************
 * ���ϸ�   : SS_L_EDI_RECP_CATLDataSet.java
 * ���     : ��������-����-����EDI ����������(header)
 * �ۼ����� : 2007/02/21
 * �ۼ���   : ����
 **************************************************************************************************/
 


package chosun.ciis.ss.sls.brsup.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.brsup.dm.*;
import chosun.ciis.ss.sls.brsup.rec.*;

/**
**  SP_SS_L_EDI_RECP_CATL
**/

public class SS_L_EDI_RECP_CATLDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList rsltcur = new ArrayList();
	public String errcode;
	public String errmsg;
	public long totalcnt;

	public SS_L_EDI_RECP_CATLDataSet(){}
	public SS_L_EDI_RECP_CATLDataSet(String errcode, String errmsg, long totalcnt){
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
		this.totalcnt = cstmt.getLong(8);
		ResultSet rset0 = (ResultSet) cstmt.getObject(9);
		while(rset0.next()){
			SS_L_EDI_RECP_CATLRSLTCURRecord rec = new SS_L_EDI_RECP_CATLRSLTCURRecord();
			rec.acqdt = Util.checkString(rset0.getString("acqdt"));
			rec.acqno = Util.checkString(rset0.getString("acqno"));
			rec.girono = Util.checkString(rset0.getString("girono"));
			rec.totalamt = rset0.getInt("totalamt");
			rec.normamt = rset0.getInt("normamt");
			rec.normnoit = rset0.getInt("normnoit");
			rec.rejectnoit = rset0.getInt("rejectnoit");
			rec.girocoms = rset0.getInt("girocoms");
			rec.recpclsfnm = Util.checkString(rset0.getString("recpclsfnm"));
			rec.rcpmrflendyn = Util.checkString(rset0.getString("rcpmrflendyn"));
			this.rsltcur.add(rec);
		}
	}

	public String rsltcurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = rsltcur.size();
		for(int i=0; i<size; i++){
			SS_L_EDI_RECP_CATLRSLTCURRecord rec = (SS_L_EDI_RECP_CATLRSLTCURRecord)rsltcur.get(i);
			
			
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
			SS_L_EDI_RECP_CATLRSLTCURRecord rec = (SS_L_EDI_RECP_CATLRSLTCURRecord)rsltcur.get(i);
			
			
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
			SS_L_EDI_RECP_CATLRSLTCURRecord rec = (SS_L_EDI_RECP_CATLRSLTCURRecord)rsltcur.get(i);
			
			
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
	SS_L_EDI_RECP_CATLDataSet ds = (SS_L_EDI_RECP_CATLDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.rsltcur.size(); i++){
		SS_L_EDI_RECP_CATLRSLTCURRecord rsltcurRec = (SS_L_EDI_RECP_CATLRSLTCURRecord)ds.rsltcur.get(i);%>
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

<%= rsltcurRec.acqdt%>
<%= rsltcurRec.acqno%>
<%= rsltcurRec.girono%>
<%= rsltcurRec.totalamt%>
<%= rsltcurRec.normamt%>
<%= rsltcurRec.normnoit%>
<%= rsltcurRec.rejectnoit%>
<%= rsltcurRec.girocoms%>
<%= rsltcurRec.recpclsfnm%>
<%= rsltcurRec.rcpmrflendyn%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Wed Feb 21 11:40:15 KST 2007 */
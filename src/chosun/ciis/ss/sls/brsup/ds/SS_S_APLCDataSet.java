/***************************************************************************************************
* ���ϸ� : SS_S_APLCDataSet.java
* ��� : ������������-Billing�ڵ���ü-��û����-������(����)����
* �ۼ����� : 2004-06-06
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
 * ������������-Billing�ڵ���ü-��û����-������(����)����
 *
 */


public class SS_S_APLCDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList rsltcur = new ArrayList();
	public String errcode;
	public String errmsg;

	public SS_S_APLCDataSet(){}
	public SS_S_APLCDataSet(String errcode, String errmsg){
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
		ResultSet rset0 = (ResultSet) cstmt.getObject(7);
		while(rset0.next()){
			SS_S_APLCRSLTCURRecord rec = new SS_S_APLCRSLTCURRecord();
			rec.aplcdt = Util.checkString(rset0.getString("aplcdt"));
			rec.shftclsf = Util.checkString(rset0.getString("shftclsf"));
			rec.shftclsfnm = Util.checkString(rset0.getString("shftclsfnm"));
			rec.pymtno_2 = Util.checkString(rset0.getString("pymtno_2"));
			rec.pymtnm = Util.checkString(rset0.getString("pymtnm"));
			rec.rdrnm = Util.checkString(rset0.getString("rdrnm"));
			rec.zip = Util.checkString(rset0.getString("zip"));
			rec.dlvaddr = Util.checkString(rset0.getString("dlvaddr"));
			rec.dlvaddrdtls = Util.checkString(rset0.getString("dlvaddrdtls"));
			rec.rdrtel1 = Util.checkString(rset0.getString("rdrtel1"));
			rec.rdrtel2 = Util.checkString(rset0.getString("rdrtel2"));
			rec.rdrtel3 = Util.checkString(rset0.getString("rdrtel3"));
			rec.aplyyymm = Util.checkString(rset0.getString("aplyyymm"));
			rec.rdr_no = Util.checkString(rset0.getString("rdr_no"));
			rec.medicd = Util.checkString(rset0.getString("medicd"));
			rec.medinm = Util.checkString(rset0.getString("medinm"));
			rec.dlvqty = rset0.getInt("dlvqty");
			rec.realsubsamt = rset0.getInt("realsubsamt");
			rec.migryn = Util.checkString(rset0.getString("migryn"));
			rec.rdrnatvno = Util.checkString(rset0.getString("rdrnatvno"));
			this.rsltcur.add(rec);
		}
	}

	public String rsltcurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = rsltcur.size();
		for(int i=0; i<size; i++){
			SS_S_APLCRSLTCURRecord rec = (SS_S_APLCRSLTCURRecord)rsltcur.get(i);


			String code = rec.aplcdt;
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
			SS_S_APLCRSLTCURRecord rec = (SS_S_APLCRSLTCURRecord)rsltcur.get(i);


			String code = rec.aplcdt;
			String name = rec.shftclsf;

			sb.append("<input name=\"");
			sb.append("aplcdt");
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
			SS_S_APLCRSLTCURRecord rec = (SS_S_APLCRSLTCURRecord)rsltcur.get(i);


			String code = rec.aplcdt;
			String name = rec.shftclsf;

			sb.append("<input name=\"");
			sb.append("aplcdt");
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
	SS_S_APLCDataSet ds = (SS_S_APLCDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.rsltcur.size(); i++){
		SS_S_APLCRSLTCURRecord rsltcurRec = (SS_S_APLCRSLTCURRecord)ds.rsltcur.get(i);%>
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

<%= rsltcurRec.aplcdt%>
<%= rsltcurRec.shftclsf%>
<%= rsltcurRec.shftclsfnm%>
<%= rsltcurRec.pymtno_2%>
<%= rsltcurRec.pymtnm%>
<%= rsltcurRec.rdrnm%>
<%= rsltcurRec.zip%>
<%= rsltcurRec.dlvaddr%>
<%= rsltcurRec.dlvaddrdtls%>
<%= rsltcurRec.rdrtel1%>
<%= rsltcurRec.rdrtel2%>
<%= rsltcurRec.rdrtel3%>
<%= rsltcurRec.aplyyymm%>
<%= rsltcurRec.rdr_no%>
<%= rsltcurRec.medicd%>
<%= rsltcurRec.medinm%>
<%= rsltcurRec.dlvqty%>
<%= rsltcurRec.realsubsamt%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Sun Jun 06 21:52:41 KST 2004 */
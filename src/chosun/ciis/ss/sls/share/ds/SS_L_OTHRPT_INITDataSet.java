/***************************************************************************************************
* ���ϸ� : SS_L_OTHRPT_INITDataSet.java
* ��� : ��������-�����׺���-Ÿ�絿�⺸��-�ʱ�ȭ���� ���� DataSet
* �ۼ����� : 2004-04-24
* �ۼ��� : ��뼷
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� :
***************************************************************************************************/


package chosun.ciis.ss.sls.share.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.share.dm.*;
import chosun.ciis.ss.sls.share.rec.*;

/**
 * ��������-�����׺���-Ÿ�絿�⺸��-�ʱ�ȭ���� ���� DataSet
 */


public class SS_L_OTHRPT_INITDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList othrptlist = new ArrayList();
	public ArrayList buseolist = new ArrayList();
	public String errcode;
	public String errmsg;
	public long totalcnt;

	public SS_L_OTHRPT_INITDataSet(){}
	public SS_L_OTHRPT_INITDataSet(String errcode, String errmsg, long totalcnt){
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
			SS_L_OTHRPT_INITOTHRPTLISTRecord rec = new SS_L_OTHRPT_INITOTHRPTLISTRecord();
			rec.seq = rset0.getInt("seq");
			rec.makedt = Util.checkString(rset0.getString("makedt"));
			rec.makepersid = Util.checkString(rset0.getString("makepersid"));
			rec.makepersnm = Util.checkString(rset0.getString("makepersnm"));
			rec.brwscnt = rset0.getInt("brwscnt");
			rec.dwloadcnt = rset0.getInt("dwloadcnt");
			rec.deptcd = Util.checkString(rset0.getString("deptcd"));
			rec.deptnm = Util.checkString(rset0.getString("deptnm"));
			rec.filenm = Util.checkString(rset0.getString("filenm"));
			rec.filesize = Util.checkString(rset0.getString("filesize"));
			this.othrptlist.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(15);
		while(rset1.next()){
			SS_L_OTHRPT_INITBUSEOLISTRecord rec = new SS_L_OTHRPT_INITBUSEOLISTRecord();
			rec.deptcd = Util.checkString(rset1.getString("deptcd"));
			rec.boksnm = Util.checkString(rset1.getString("boksnm"));
			this.buseolist.add(rec);
		}
	}

	public String buseolistOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = buseolist.size();
		for(int i=0; i<size; i++){
			SS_L_OTHRPT_INITBUSEOLISTRecord rec = (SS_L_OTHRPT_INITBUSEOLISTRecord)buseolist.get(i);


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

	public String buseolistChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = buseolist.size();
		for(int i=0; i<size; i++){
			SS_L_OTHRPT_INITBUSEOLISTRecord rec = (SS_L_OTHRPT_INITBUSEOLISTRecord)buseolist.get(i);


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

	public String buseolistRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = buseolist.size();
		for(int i=0; i<size; i++){
			SS_L_OTHRPT_INITBUSEOLISTRecord rec = (SS_L_OTHRPT_INITBUSEOLISTRecord)buseolist.get(i);


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
	SS_L_OTHRPT_INITDataSet ds = (SS_L_OTHRPT_INITDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.othrptlist.size(); i++){
		SS_L_OTHRPT_INITOTHRPTLISTRecord othrptlistRec = (SS_L_OTHRPT_INITOTHRPTLISTRecord)ds.othrptlist.get(i);%>
HTML �ڵ��....
	<%}%>

<%
	for(int i=0; i<ds.buseolist.size(); i++){
		SS_L_OTHRPT_INITBUSEOLISTRecord buseolistRec = (SS_L_OTHRPT_INITBUSEOLISTRecord)ds.buseolist.get(i);%>
HTML �ڵ��....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getTotalcnt()%>
<%= ds.getOthrptlist()%>
<%= ds.getBuseolist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= othrptlistRec.seq%>
<%= othrptlistRec.makedt%>
<%= othrptlistRec.makepersid%>
<%= othrptlistRec.makepersnm%>
<%= othrptlistRec.brwscnt%>
<%= othrptlistRec.dwloadcnt%>
<%= othrptlistRec.deptcd%>
<%= othrptlistRec.deptnm%>
<%= othrptlistRec.filenm%>
<%= othrptlistRec.filesize%>
<%= buseolistRec.deptcd%>
<%= buseolistRec.boksnm%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Fri Jun 11 20:16:17 KST 2004 */
/***************************************************************************************************
* ���ϸ� : SS_L_JOBREC_SRCHDataSet.java
* ��� : ��������-�����׺���-���Ͼ�������-����� ���� DataSet
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
 * ��������-�����׺���-���Ͼ�������-����� ���� DataSet
 */

public class SS_L_JOBREC_SRCHDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList buseolist = new ArrayList();
	public ArrayList jobreclist = new ArrayList();
	public String errcode;
	public String errmsg;
	public long totalcnt;

	public SS_L_JOBREC_SRCHDataSet(){}
	public SS_L_JOBREC_SRCHDataSet(String errcode, String errmsg, long totalcnt){
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
		this.totalcnt = cstmt.getLong(18);
		ResultSet rset0 = (ResultSet) cstmt.getObject(19);
		while(rset0.next()){
			SS_L_JOBREC_SRCHJOBRECLISTRecord rec = new SS_L_JOBREC_SRCHJOBRECLISTRecord();
			rec.makedt = Util.checkString(rset0.getString("makedt"));
			rec.makepersid = Util.checkString(rset0.getString("makepersid"));
			rec.makepersnm = Util.checkString(rset0.getString("makepersnm"));
			rec.brwscnt = rset0.getInt("brwscnt");
			rec.dwloadcnt = rset0.getInt("dwloadcnt");
			rec.deptcd = Util.checkString(rset0.getString("deptcd"));
			rec.deptnm = Util.checkString(rset0.getString("deptnm"));
			rec.filenm = Util.checkString(rset0.getString("filenm"));
			rec.filesize = Util.checkString(rset0.getString("filesize"));
			this.jobreclist.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(20);
		while(rset1.next()){
			SS_L_JOBREC_SRCHBUSEOLISTRecord rec = new SS_L_JOBREC_SRCHBUSEOLISTRecord();
			rec.deptcd = Util.checkString(rset1.getString("deptcd"));
			rec.boksnm = Util.checkString(rset1.getString("boksnm"));
			this.buseolist.add(rec);
		}
	}

	public String jobreclistOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = jobreclist.size();
		for(int i=0; i<size; i++){
			SS_L_JOBREC_SRCHJOBRECLISTRecord rec = (SS_L_JOBREC_SRCHJOBRECLISTRecord)jobreclist.get(i);
			
			
			String code = rec.makedt;
			String name = rec.makepersid;
			
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

	public String buseolistOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = buseolist.size();
		for(int i=0; i<size; i++){
			SS_L_JOBREC_SRCHBUSEOLISTRecord rec = (SS_L_JOBREC_SRCHBUSEOLISTRecord)buseolist.get(i);
			
			
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

	public String jobreclistChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = jobreclist.size();
		for(int i=0; i<size; i++){
			SS_L_JOBREC_SRCHJOBRECLISTRecord rec = (SS_L_JOBREC_SRCHJOBRECLISTRecord)jobreclist.get(i);
			
			
			String code = rec.makedt;
			String name = rec.makepersid;
			
			sb.append("<input name=\"");
			sb.append("makedt");
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

	public String buseolistChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = buseolist.size();
		for(int i=0; i<size; i++){
			SS_L_JOBREC_SRCHBUSEOLISTRecord rec = (SS_L_JOBREC_SRCHBUSEOLISTRecord)buseolist.get(i);
			
			
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

	public String jobreclistRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = jobreclist.size();
		for(int i=0; i<size; i++){
			SS_L_JOBREC_SRCHJOBRECLISTRecord rec = (SS_L_JOBREC_SRCHJOBRECLISTRecord)jobreclist.get(i);
			
			
			String code = rec.makedt;
			String name = rec.makepersid;
			
			sb.append("<input name=\"");
			sb.append("makedt");
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

	public String buseolistRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = buseolist.size();
		for(int i=0; i<size; i++){
			SS_L_JOBREC_SRCHBUSEOLISTRecord rec = (SS_L_JOBREC_SRCHBUSEOLISTRecord)buseolist.get(i);
			
			
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
	SS_L_JOBREC_SRCHDataSet ds = (SS_L_JOBREC_SRCHDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.jobreclist.size(); i++){
		SS_L_JOBREC_SRCHJOBRECLISTRecord jobreclistRec = (SS_L_JOBREC_SRCHJOBRECLISTRecord)ds.jobreclist.get(i);%>
HTML �ڵ��....
	<%}%>

<%
	for(int i=0; i<ds.buseolist.size(); i++){
		SS_L_JOBREC_SRCHBUSEOLISTRecord buseolistRec = (SS_L_JOBREC_SRCHBUSEOLISTRecord)ds.buseolist.get(i);%>
HTML �ڵ��....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getTotalcnt()%>
<%= ds.getJobreclist()%>
<%= ds.getBuseolist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= jobreclistRec.makedt%>
<%= jobreclistRec.makepersid%>
<%= jobreclistRec.makepersnm%>
<%= jobreclistRec.brwscnt%>
<%= jobreclistRec.dwloadcnt%>
<%= jobreclistRec.deptcd%>
<%= jobreclistRec.deptnm%>
<%= jobreclistRec.filenm%>
<%= jobreclistRec.filesize%>
<%= buseolistRec.deptcd%>
<%= buseolistRec.boksnm%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Thu Jun 10 22:45:04 KST 2004 */
/***************************************************************************************************
* ���ϸ� : SP_PS_L_EMPCAMP_SEARCH.java
* ����-ķ���ΰ��� ķ���μ��� ������ȸ
* �ۼ����� : 2004-03-08
* �ۼ��� : ���ȣ 
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :   
* ��� :   
***************************************************************************************************/


package chosun.ciis.ps.pbs.allow.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ps.pbs.allow.dm.*;
import chosun.ciis.ps.pbs.allow.rec.*;

/**
 * ����-ķ���ΰ��� ķ���μ��系�� ��ȸ
 *
 */

  

public class PS_L_EMPCAMP_SEARCHDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList empcampcur = new ArrayList();
	public String errcode;
	public String errmsg;
	public long totalcnt;

	public PS_L_EMPCAMP_SEARCHDataSet(){}
	public PS_L_EMPCAMP_SEARCHDataSet(String errcode, String errmsg, long totalcnt){
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
		this.totalcnt = cstmt.getLong(12);
		ResultSet rset0 = (ResultSet) cstmt.getObject(13);
		while(rset0.next()){
			PS_L_EMPCAMP_SEARCHEMPCAMPCURRecord rec = new PS_L_EMPCAMP_SEARCHEMPCAMPCURRecord();
			rec.cmpycd = Util.checkString(rset0.getString("cmpycd"));
			rec.bocd = Util.checkString(rset0.getString("bocd"));
			rec.bonm = Util.checkString(rset0.getString("bonm"));
			rec.boemp_no = Util.checkString(rset0.getString("boemp_no"));
			rec.boemp_nm = Util.checkString(rset0.getString("boemp_nm"));
			rec.dept_nm = Util.checkString(rset0.getString("dept_nm"));
			rec.aloncd = Util.checkString(rset0.getString("aloncd"));
			rec.campseq = Util.checkString(rset0.getString("campseq"));
			rec.amt = rset0.getInt("amt");
			rec.deptcd = Util.checkString(rset0.getString("deptcd"));
			rec.rnum = rset0.getInt("rnum");
			this.empcampcur.add(rec);
		}
	}

	public String empcampcurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = empcampcur.size();
		for(int i=0; i<size; i++){
			PS_L_EMPCAMP_SEARCHEMPCAMPCURRecord rec = (PS_L_EMPCAMP_SEARCHEMPCAMPCURRecord)empcampcur.get(i);
			
			
			String code = rec.cmpycd;
			String name = rec.bocd;
			
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

	public String empcampcurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = empcampcur.size();
		for(int i=0; i<size; i++){
			PS_L_EMPCAMP_SEARCHEMPCAMPCURRecord rec = (PS_L_EMPCAMP_SEARCHEMPCAMPCURRecord)empcampcur.get(i);
			
			
			String code = rec.cmpycd;
			String name = rec.bocd;
			
			sb.append("<input name=\"");
			sb.append("cmpycd");
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

	public String empcampcurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = empcampcur.size();
		for(int i=0; i<size; i++){
			PS_L_EMPCAMP_SEARCHEMPCAMPCURRecord rec = (PS_L_EMPCAMP_SEARCHEMPCAMPCURRecord)empcampcur.get(i);
			
			
			String code = rec.cmpycd;
			String name = rec.bocd;
			
			sb.append("<input name=\"");
			sb.append("cmpycd");
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
	PS_L_EMPCAMP_SEARCHDataSet ds = (PS_L_EMPCAMP_SEARCHDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.empcampcur.size(); i++){
		PS_L_EMPCAMP_SEARCHEMPCAMPCURRecord empcampcurRec = (PS_L_EMPCAMP_SEARCHEMPCAMPCURRecord)ds.empcampcur.get(i);%>
HTML �ڵ��....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getTotalcnt()%>
<%= ds.getEmpcampcur()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= empcampcurRec.cmpycd%>
<%= empcampcurRec.bocd%>
<%= empcampcurRec.bonm%>
<%= empcampcurRec.boemp_no%>
<%= empcampcurRec.boemp_nm%>
<%= empcampcurRec.dept_nm%>
<%= empcampcurRec.aloncd%>
<%= empcampcurRec.campseq%>
<%= empcampcurRec.amt%>
<%= empcampcurRec.deptcd%>
<%= empcampcurRec.rnum%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Thu Mar 11 17:51:23 KST 2004 */
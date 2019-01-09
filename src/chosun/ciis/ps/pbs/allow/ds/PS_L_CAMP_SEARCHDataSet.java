/***************************************************************************************************
* ���ϸ� : SP_PS_L_CAMP_SEARCH.java
* ����-ķ���ΰ��� ķ������ȸ 
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
 * ����-ķ���ΰ��� ķ������ȸ          
 *
 */

  

public class PS_L_CAMP_SEARCHDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList camplistcur = new ArrayList();
	public String errcode;
	public String errmsg;
	public long totalcnt;

	public PS_L_CAMP_SEARCHDataSet(){}
	public PS_L_CAMP_SEARCHDataSet(String errcode, String errmsg, long totalcnt){
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
		this.totalcnt = cstmt.getLong(11);
		ResultSet rset0 = (ResultSet) cstmt.getObject(12);
		while(rset0.next()){
			PS_L_CAMP_SEARCHCAMPLISTCURRecord rec = new PS_L_CAMP_SEARCHCAMPLISTCURRecord();
			rec.cmpycd = Util.checkString(rset0.getString("cmpycd"));
			rec.cmpynm = Util.checkString(rset0.getString("cmpynm"));
			rec.bocd = Util.checkString(rset0.getString("bocd"));
			rec.bonm = Util.checkString(rset0.getString("bonm"));
			rec.campseq = Util.checkString(rset0.getString("campseq"));
			rec.campnm = Util.checkString(rset0.getString("campnm"));
			rec.bgncampdt = Util.checkString(rset0.getString("bgncampdt"));
			rec.endcampdt = Util.checkString(rset0.getString("endcampdt"));
			rec.cont = Util.checkString(rset0.getString("cont"));
			rec.rnum = rset0.getInt("rnum");
			this.camplistcur.add(rec);
		}
	}

	public String camplistcurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = camplistcur.size();
		for(int i=0; i<size; i++){
			PS_L_CAMP_SEARCHCAMPLISTCURRecord rec = (PS_L_CAMP_SEARCHCAMPLISTCURRecord)camplistcur.get(i);
			
			
			String code = rec.cmpycd;
			String name = rec.cmpynm;
			
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

	public String camplistcurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = camplistcur.size();
		for(int i=0; i<size; i++){
			PS_L_CAMP_SEARCHCAMPLISTCURRecord rec = (PS_L_CAMP_SEARCHCAMPLISTCURRecord)camplistcur.get(i);
			
			
			String code = rec.cmpycd;
			String name = rec.cmpynm;
			
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

	public String camplistcurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = camplistcur.size();
		for(int i=0; i<size; i++){
			PS_L_CAMP_SEARCHCAMPLISTCURRecord rec = (PS_L_CAMP_SEARCHCAMPLISTCURRecord)camplistcur.get(i);
			
			
			String code = rec.cmpycd;
			String name = rec.cmpynm;
			
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
	PS_L_CAMP_SEARCHDataSet ds = (PS_L_CAMP_SEARCHDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.camplistcur.size(); i++){
		PS_L_CAMP_SEARCHCAMPLISTCURRecord camplistcurRec = (PS_L_CAMP_SEARCHCAMPLISTCURRecord)ds.camplistcur.get(i);%>
HTML �ڵ��....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getTotalcnt()%>
<%= ds.getCamplistcur()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= camplistcurRec.cmpycd%>
<%= camplistcurRec.cmpynm%>
<%= camplistcurRec.bocd%>
<%= camplistcurRec.bonm%>
<%= camplistcurRec.campseq%>
<%= camplistcurRec.campnm%>
<%= camplistcurRec.bgncampdt%>
<%= camplistcurRec.endcampdt%>
<%= camplistcurRec.cont%>
<%= camplistcurRec.rnum%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Mon Mar 15 10:13:40 KST 2004 */
/***************************************************************************************************
* 파일명 : .java
* 기능 : *지국지원-빌링-지로 수납현황-목록엑셀저장
* 작성일자 : 2009-04-16
* 작성자 : 김세웅
***************************************************************************************************/


package chosun.ciis.ss.sls.brsup.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.brsup.dm.*;
import chosun.ciis.ss.sls.brsup.rec.*;

/**
 * 지국지원-빌링-지로 수납현황-목록엑셀저장
 */

public class SS_L_GIRORECP_PRINTDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList rsltcur = new ArrayList();
	public String errcode;
	public String errmsg;
	public long totalcnt;

	public SS_L_GIRORECP_PRINTDataSet(){}
	public SS_L_GIRORECP_PRINTDataSet(String errcode, String errmsg, long totalcnt){
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
			SS_L_GIRORECP_PRINTRSLTCURRecord rec = new SS_L_GIRORECP_PRINTRSLTCURRecord();
			rec.reqdt = Util.checkString(rset0.getString("reqdt"));
			rec.bocd = Util.checkString(rset0.getString("bocd"));
			rec.bonm = Util.checkString(rset0.getString("bonm"));
			rec.girono = Util.checkString(rset0.getString("girono"));
			rec.recpclsfcd = Util.checkString(rset0.getString("recpclsfcd"));
			rec.recpclsfnm = Util.checkString(rset0.getString("recpclsfnm"));
			rec.recpbankcd = Util.checkString(rset0.getString("recpbankcd"));
			rec.recpbanknm = Util.checkString(rset0.getString("recpbanknm"));
			rec.cnt = rset0.getInt("cnt");
			rec.amt = rset0.getInt("amt");
			rec.fee = rset0.getInt("fee");
			this.rsltcur.add(rec);
		}
	}

	public String rsltcurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = rsltcur.size();
		for(int i=0; i<size; i++){
			SS_L_GIRORECP_PRINTRSLTCURRecord rec = (SS_L_GIRORECP_PRINTRSLTCURRecord)rsltcur.get(i);
			
			
			String code = rec.reqdt;
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

	public String rsltcurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = rsltcur.size();
		for(int i=0; i<size; i++){
			SS_L_GIRORECP_PRINTRSLTCURRecord rec = (SS_L_GIRORECP_PRINTRSLTCURRecord)rsltcur.get(i);
			
			
			String code = rec.reqdt;
			String name = rec.bocd;
			
			sb.append("<input name=\"");
			sb.append("reqdt");
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
			SS_L_GIRORECP_PRINTRSLTCURRecord rec = (SS_L_GIRORECP_PRINTRSLTCURRecord)rsltcur.get(i);
			
			
			String code = rec.reqdt;
			String name = rec.bocd;
			
			sb.append("<input name=\"");
			sb.append("reqdt");
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
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SS_L_GIRORECP_PRINTDataSet ds = (SS_L_GIRORECP_PRINTDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.rsltcur.size(); i++){
		SS_L_GIRORECP_PRINTRSLTCURRecord rsltcurRec = (SS_L_GIRORECP_PRINTRSLTCURRecord)ds.rsltcur.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getTotalcnt()%>
<%= ds.getRsltcur()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= rsltcurRec.reqdt%>
<%= rsltcurRec.bocd%>
<%= rsltcurRec.bonm%>
<%= rsltcurRec.girono%>
<%= rsltcurRec.recpclsfcd%>
<%= rsltcurRec.recpclsfnm%>
<%= rsltcurRec.recpbankcd%>
<%= rsltcurRec.recpbanknm%>
<%= rsltcurRec.cnt%>
<%= rsltcurRec.amt%>
<%= rsltcurRec.fee%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Apr 16 17:18:32 KST 2009 */
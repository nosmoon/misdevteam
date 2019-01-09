/***************************************************************************************************
 * 파일명   : SS_L_PROMSTAF_CYEXTN_PRINTDataSet.java
 * 기능     : 확장현황-사이버확장-요원관리-인쇄
 * 작성일자 : 2006/01/04
 * 작성자   : 이혁
 **************************************************************************************************/
 


package chosun.ciis.ss.sls.extn.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.extn.dm.*;
import chosun.ciis.ss.sls.extn.rec.*;

/**
**  확장현황-사이버확장-요원관리-인쇄
**/

public class SS_L_PROMSTAF_CYEXTN_PRINTDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curcommlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public long totalcnt;

	public SS_L_PROMSTAF_CYEXTN_PRINTDataSet(){}
	public SS_L_PROMSTAF_CYEXTN_PRINTDataSet(String errcode, String errmsg, long totalcnt){
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
			SS_L_PROMSTAF_CYEXTN_PRINTCURCOMMLISTRecord rec = new SS_L_PROMSTAF_CYEXTN_PRINTCURCOMMLISTRecord();
			rec.in_cmpydt = Util.checkString(rset0.getString("in_cmpydt"));
			rec.stafclsfcd = Util.checkString(rset0.getString("stafclsfcd"));
			rec.stafclsfnm = Util.checkString(rset0.getString("stafclsfnm"));
			rec.stafno = Util.checkString(rset0.getString("stafno"));
			rec.stafnm = Util.checkString(rset0.getString("stafnm"));
			rec.blngteamnm = Util.checkString(rset0.getString("blngteamnm"));
			rec.prn = Util.checkString(rset0.getString("prn"));
			rec.ernno = Util.checkString(rset0.getString("ernno"));
			rec.zip = Util.checkString(rset0.getString("zip"));
			rec.addr = Util.checkString(rset0.getString("addr"));
			rec.dtlsaddr = Util.checkString(rset0.getString("dtlsaddr"));
			rec.tel_no1 = Util.checkString(rset0.getString("tel_no1"));
			rec.tel_no2 = Util.checkString(rset0.getString("tel_no2"));
			rec.tel_no3 = Util.checkString(rset0.getString("tel_no3"));
			rec.ptph_no1 = Util.checkString(rset0.getString("ptph_no1"));
			rec.ptph_no2 = Util.checkString(rset0.getString("ptph_no2"));
			rec.ptph_no3 = Util.checkString(rset0.getString("ptph_no3"));
			rec.email = Util.checkString(rset0.getString("email"));
			rec.acctno = Util.checkString(rset0.getString("acctno"));
			rec.acctbank = Util.checkString(rset0.getString("acctbank"));
			rec.acctdeps_pers = Util.checkString(rset0.getString("acctdeps_pers"));
			rec.cnvsstafno = Util.checkString(rset0.getString("cnvsstafno"));
			rec.cnvsstafnm = Util.checkString(rset0.getString("cnvsstafnm"));
			rec.cntrstatcd = Util.checkString(rset0.getString("cntrstatcd"));
			this.curcommlist.add(rec);
		}
	}

	public String curcommlistOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curcommlist.size();
		for(int i=0; i<size; i++){
			SS_L_PROMSTAF_CYEXTN_PRINTCURCOMMLISTRecord rec = (SS_L_PROMSTAF_CYEXTN_PRINTCURCOMMLISTRecord)curcommlist.get(i);
			
			
			String code = rec.in_cmpydt;
			String name = rec.stafclsfcd;
			
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

	public String curcommlistChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curcommlist.size();
		for(int i=0; i<size; i++){
			SS_L_PROMSTAF_CYEXTN_PRINTCURCOMMLISTRecord rec = (SS_L_PROMSTAF_CYEXTN_PRINTCURCOMMLISTRecord)curcommlist.get(i);
			
			
			String code = rec.in_cmpydt;
			String name = rec.stafclsfcd;
			
			sb.append("<input name=\"");
			sb.append("in_cmpydt");
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

	public String curcommlistRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curcommlist.size();
		for(int i=0; i<size; i++){
			SS_L_PROMSTAF_CYEXTN_PRINTCURCOMMLISTRecord rec = (SS_L_PROMSTAF_CYEXTN_PRINTCURCOMMLISTRecord)curcommlist.get(i);
			
			
			String code = rec.in_cmpydt;
			String name = rec.stafclsfcd;
			
			sb.append("<input name=\"");
			sb.append("in_cmpydt");
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
	SS_L_PROMSTAF_CYEXTN_PRINTDataSet ds = (SS_L_PROMSTAF_CYEXTN_PRINTDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curcommlist.size(); i++){
		SS_L_PROMSTAF_CYEXTN_PRINTCURCOMMLISTRecord curcommlistRec = (SS_L_PROMSTAF_CYEXTN_PRINTCURCOMMLISTRecord)ds.curcommlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getTotalcnt()%>
<%= ds.getCurcommlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curcommlistRec.in_cmpydt%>
<%= curcommlistRec.stafclsfcd%>
<%= curcommlistRec.stafclsfnm%>
<%= curcommlistRec.stafno%>
<%= curcommlistRec.stafnm%>
<%= curcommlistRec.blngteamnm%>
<%= curcommlistRec.prn%>
<%= curcommlistRec.ernno%>
<%= curcommlistRec.zip%>
<%= curcommlistRec.addr%>
<%= curcommlistRec.dtlsaddr%>
<%= curcommlistRec.tel_no1%>
<%= curcommlistRec.tel_no2%>
<%= curcommlistRec.tel_no3%>
<%= curcommlistRec.ptph_no1%>
<%= curcommlistRec.ptph_no2%>
<%= curcommlistRec.ptph_no3%>
<%= curcommlistRec.email%>
<%= curcommlistRec.acctno%>
<%= curcommlistRec.acctbank%>
<%= curcommlistRec.acctdeps_pers%>
<%= curcommlistRec.cnvsstafno%>
<%= curcommlistRec.cnvsstafnm%>
<%= curcommlistRec.cntrstatcd%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Jan 04 15:28:59 KST 2006 */
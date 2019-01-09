/***************************************************************************************************
* 파일명 : .java
* 기능 : *지국지원-상해보험-변경-목록
* 작성일자 : 2009-04-09
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
 * 지국지원-상해보험-변경-목록
 */

public class SS_L_INSRAPLC_CHGDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curcommlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public long totalcnt;

	public SS_L_INSRAPLC_CHGDataSet(){}
	public SS_L_INSRAPLC_CHGDataSet(String errcode, String errmsg, long totalcnt){
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
		ResultSet rset0 = (ResultSet) cstmt.getObject(15);
		while(rset0.next()){
			SS_L_INSRAPLC_CHGCURCOMMLISTRecord rec = new SS_L_INSRAPLC_CHGCURCOMMLISTRecord();
			rec.aplcdt = Util.checkString(rset0.getString("aplcdt"));
			rec.deptnm = Util.checkString(rset0.getString("deptnm"));
			rec.areanm = Util.checkString(rset0.getString("areanm"));
			rec.bonm = Util.checkString(rset0.getString("bonm"));
			rec.prvflnm = Util.checkString(rset0.getString("prvflnm"));
			rec.prvprn = Util.checkString(rset0.getString("prvprn"));
			rec.flnm = Util.checkString(rset0.getString("flnm"));
			rec.prn = Util.checkString(rset0.getString("prn"));
			rec.compdt = Util.checkString(rset0.getString("compdt"));
			rec.exprdt = Util.checkString(rset0.getString("exprdt"));
			this.curcommlist.add(rec);
		}
		this.totalcnt = cstmt.getLong(16);
	}

	public String curcommlistOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curcommlist.size();
		for(int i=0; i<size; i++){
			SS_L_INSRAPLC_CHGCURCOMMLISTRecord rec = (SS_L_INSRAPLC_CHGCURCOMMLISTRecord)curcommlist.get(i);
			
			
			String code = rec.aplcdt;
			String name = rec.deptnm;
			
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
			SS_L_INSRAPLC_CHGCURCOMMLISTRecord rec = (SS_L_INSRAPLC_CHGCURCOMMLISTRecord)curcommlist.get(i);
			
			
			String code = rec.aplcdt;
			String name = rec.deptnm;
			
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

	public String curcommlistRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curcommlist.size();
		for(int i=0; i<size; i++){
			SS_L_INSRAPLC_CHGCURCOMMLISTRecord rec = (SS_L_INSRAPLC_CHGCURCOMMLISTRecord)curcommlist.get(i);
			
			
			String code = rec.aplcdt;
			String name = rec.deptnm;
			
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
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SS_L_INSRAPLC_CHGDataSet ds = (SS_L_INSRAPLC_CHGDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curcommlist.size(); i++){
		SS_L_INSRAPLC_CHGCURCOMMLISTRecord curcommlistRec = (SS_L_INSRAPLC_CHGCURCOMMLISTRecord)ds.curcommlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurcommlist()%>
<%= ds.getTotalcnt()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curcommlistRec.aplcdt%>
<%= curcommlistRec.deptnm%>
<%= curcommlistRec.areanm%>
<%= curcommlistRec.bonm%>
<%= curcommlistRec.prvflnm%>
<%= curcommlistRec.prvprn%>
<%= curcommlistRec.flnm%>
<%= curcommlistRec.prn%>
<%= curcommlistRec.compdt%>
<%= curcommlistRec.exprdt%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Apr 09 17:16:04 KST 2009 */
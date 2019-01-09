/***************************************************************************************************
* 파일명 : .java
* 기능 : *지국지원-상해보험-사고-목록
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
 * 지국지원-상해보험-사고-목록
 */

public class SS_L_INSRACCDDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curcommlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public long totalcnt;

	public SS_L_INSRACCDDataSet(){}
	public SS_L_INSRACCDDataSet(String errcode, String errmsg, long totalcnt){
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
		ResultSet rset0 = (ResultSet) cstmt.getObject(14);
		while(rset0.next()){
			SS_L_INSRACCDCURCOMMLISTRecord rec = new SS_L_INSRACCDCURCOMMLISTRecord();
			rec.acpndt = Util.checkString(rset0.getString("acpndt"));
			rec.accdacpnno = Util.checkString(rset0.getString("accdacpnno"));
			rec.boemp_no = Util.checkString(rset0.getString("boemp_no"));
			rec.flnm = Util.checkString(rset0.getString("flnm"));
			rec.dutynm = Util.checkString(rset0.getString("dutynm"));
			rec.prn = Util.checkString(rset0.getString("prn"));
			rec.deptnm = Util.checkString(rset0.getString("deptnm"));
			rec.areanm = Util.checkString(rset0.getString("areanm"));
			rec.bonm = Util.checkString(rset0.getString("bonm"));
			rec.accddt = Util.checkString(rset0.getString("accddt"));
			rec.procstat = Util.checkString(rset0.getString("procstat"));
			rec.procdt = Util.checkString(rset0.getString("procdt"));
			this.curcommlist.add(rec);
		}
		this.totalcnt = cstmt.getLong(15);
	}

	public String curcommlistOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curcommlist.size();
		for(int i=0; i<size; i++){
			SS_L_INSRACCDCURCOMMLISTRecord rec = (SS_L_INSRACCDCURCOMMLISTRecord)curcommlist.get(i);
			
			
			String code = rec.acpndt;
			String name = rec.accdacpnno;
			
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
			SS_L_INSRACCDCURCOMMLISTRecord rec = (SS_L_INSRACCDCURCOMMLISTRecord)curcommlist.get(i);
			
			
			String code = rec.acpndt;
			String name = rec.accdacpnno;
			
			sb.append("<input name=\"");
			sb.append("acpndt");
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
			SS_L_INSRACCDCURCOMMLISTRecord rec = (SS_L_INSRACCDCURCOMMLISTRecord)curcommlist.get(i);
			
			
			String code = rec.acpndt;
			String name = rec.accdacpnno;
			
			sb.append("<input name=\"");
			sb.append("acpndt");
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
	SS_L_INSRACCDDataSet ds = (SS_L_INSRACCDDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curcommlist.size(); i++){
		SS_L_INSRACCDCURCOMMLISTRecord curcommlistRec = (SS_L_INSRACCDCURCOMMLISTRecord)ds.curcommlist.get(i);%>
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

<%= curcommlistRec.acpndt%>
<%= curcommlistRec.accdacpnno%>
<%= curcommlistRec.boemp_no%>
<%= curcommlistRec.flnm%>
<%= curcommlistRec.dutynm%>
<%= curcommlistRec.prn%>
<%= curcommlistRec.deptnm%>
<%= curcommlistRec.areanm%>
<%= curcommlistRec.bonm%>
<%= curcommlistRec.accddt%>
<%= curcommlistRec.procstat%>
<%= curcommlistRec.procdt%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Apr 09 19:41:39 KST 2009 */
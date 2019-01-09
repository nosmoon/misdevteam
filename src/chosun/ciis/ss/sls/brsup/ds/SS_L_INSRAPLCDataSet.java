/***************************************************************************************************
* 파일명 : .java
* 기능 : *지국지원-상해보험-신청-목록
* 작성일자 : 2009-09-06
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
 * 지국지원-상해보험-신청-목록
 */

public class SS_L_INSRAPLCDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curcommlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public long totalcnt;
	public long totalboempcnt;
	public long totalaplcqunt;

	public SS_L_INSRAPLCDataSet(){}
	public SS_L_INSRAPLCDataSet(String errcode, String errmsg, long totalcnt, long totalboempcnt, long totalaplcqunt){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.totalcnt = totalcnt;
		this.totalboempcnt = totalboempcnt;
		this.totalaplcqunt = totalaplcqunt;
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

	public void setTotalboempcnt(long totalboempcnt){
		this.totalboempcnt = totalboempcnt;
	}

	public void setTotalaplcqunt(long totalaplcqunt){
		this.totalaplcqunt = totalaplcqunt;
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

	public long getTotalboempcnt(){
		return this.totalboempcnt;
	}

	public long getTotalaplcqunt(){
		return this.totalaplcqunt;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){			return;		}
		ResultSet rset0 = (ResultSet) cstmt.getObject(9);
		while(rset0.next()){
			SS_L_INSRAPLCCURCOMMLISTRecord rec = new SS_L_INSRAPLCCURCOMMLISTRecord();
			rec.insrnm = Util.checkString(rset0.getString("insrnm"));
			rec.insrcmpynm = Util.checkString(rset0.getString("insrcmpynm"));
			rec.iygwygbs = rset0.getInt("iygwygbs");
			rec.deptnm = Util.checkString(rset0.getString("deptnm"));
			rec.partnm = Util.checkString(rset0.getString("partnm"));
			rec.areanm = Util.checkString(rset0.getString("areanm"));
			rec.bonm = Util.checkString(rset0.getString("bonm"));
			rec.cntryy = Util.checkString(rset0.getString("cntryy"));
			rec.bocd = Util.checkString(rset0.getString("bocd"));
			rec.boempqunt = rset0.getInt("boempqunt");
			rec.aplcqunt = rset0.getInt("aplcqunt");
			rec.hdqtsplyqunt = rset0.getInt("hdqtsplyqunt");
			rec.splychrgprocyn = Util.checkString(rset0.getString("splychrgprocyn"));
			this.curcommlist.add(rec);
		}
		this.totalcnt = cstmt.getLong(10);
		this.totalboempcnt = cstmt.getLong(11);
		this.totalaplcqunt = cstmt.getLong(12);
	}

	public String curcommlistOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curcommlist.size();
		for(int i=0; i<size; i++){
			SS_L_INSRAPLCCURCOMMLISTRecord rec = (SS_L_INSRAPLCCURCOMMLISTRecord)curcommlist.get(i);
			
			
			String code = rec.insrnm;
			String name = rec.insrcmpynm;
			
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
			SS_L_INSRAPLCCURCOMMLISTRecord rec = (SS_L_INSRAPLCCURCOMMLISTRecord)curcommlist.get(i);
			
			
			String code = rec.insrnm;
			String name = rec.insrcmpynm;
			
			sb.append("<input name=\"");
			sb.append("insrnm");
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
			SS_L_INSRAPLCCURCOMMLISTRecord rec = (SS_L_INSRAPLCCURCOMMLISTRecord)curcommlist.get(i);
			
			
			String code = rec.insrnm;
			String name = rec.insrcmpynm;
			
			sb.append("<input name=\"");
			sb.append("insrnm");
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
	SS_L_INSRAPLCDataSet ds = (SS_L_INSRAPLCDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curcommlist.size(); i++){
		SS_L_INSRAPLCCURCOMMLISTRecord curcommlistRec = (SS_L_INSRAPLCCURCOMMLISTRecord)ds.curcommlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurcommlist()%>
<%= ds.getTotalcnt()%>
<%= ds.getTotalboempcnt()%>
<%= ds.getTotalaplcqunt()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curcommlistRec.insrnm%>
<%= curcommlistRec.insrcmpynm%>
<%= curcommlistRec.iygwygbs%>
<%= curcommlistRec.deptnm%>
<%= curcommlistRec.partnm%>
<%= curcommlistRec.areanm%>
<%= curcommlistRec.bonm%>
<%= curcommlistRec.cntryy%>
<%= curcommlistRec.bocd%>
<%= curcommlistRec.boempqunt%>
<%= curcommlistRec.aplcqunt%>
<%= curcommlistRec.hdqtsplyqunt%>
<%= curcommlistRec.splychrgprocyn%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Sun Sep 06 19:35:43 KST 2009 */
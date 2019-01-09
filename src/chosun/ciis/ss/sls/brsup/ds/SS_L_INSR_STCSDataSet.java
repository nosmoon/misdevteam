/***************************************************************************************************
* 파일명 : .java
* 기능 : *지국지원-상해보험-가입현황-목록
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
 * 지국지원-상해보험-가입현황-목록
 */

public class SS_L_INSR_STCSDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curcommlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public long totalcnt;
	public long totalaplcqunt;
	public long totalhdqtsplyqunt;
	public long totaltotamt;
	public long totalsplyamt;
	public long totalclamamt;

	public SS_L_INSR_STCSDataSet(){}
	public SS_L_INSR_STCSDataSet(String errcode, String errmsg, long totalcnt, long totalaplcqunt, long totalhdqtsplyqunt, long totaltotamt, long totalsplyamt, long totalclamamt){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.totalcnt = totalcnt;
		this.totalaplcqunt = totalaplcqunt;
		this.totalhdqtsplyqunt = totalhdqtsplyqunt;
		this.totaltotamt = totaltotamt;
		this.totalsplyamt = totalsplyamt;
		this.totalclamamt = totalclamamt;
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

	public void setTotalaplcqunt(long totalaplcqunt){
		this.totalaplcqunt = totalaplcqunt;
	}

	public void setTotalhdqtsplyqunt(long totalhdqtsplyqunt){
		this.totalhdqtsplyqunt = totalhdqtsplyqunt;
	}

	public void setTotaltotamt(long totaltotamt){
		this.totaltotamt = totaltotamt;
	}

	public void setTotalsplyamt(long totalsplyamt){
		this.totalsplyamt = totalsplyamt;
	}

	public void setTotalclamamt(long totalclamamt){
		this.totalclamamt = totalclamamt;
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

	public long getTotalaplcqunt(){
		return this.totalaplcqunt;
	}

	public long getTotalhdqtsplyqunt(){
		return this.totalhdqtsplyqunt;
	}

	public long getTotaltotamt(){
		return this.totaltotamt;
	}

	public long getTotalsplyamt(){
		return this.totalsplyamt;
	}

	public long getTotalclamamt(){
		return this.totalclamamt;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){			return;		}
		ResultSet rset0 = (ResultSet) cstmt.getObject(10);
		while(rset0.next()){
			SS_L_INSR_STCSCURCOMMLISTRecord rec = new SS_L_INSR_STCSCURCOMMLISTRecord();
			rec.deptnm = Util.checkString(rset0.getString("deptnm"));
			rec.areanm = Util.checkString(rset0.getString("areanm"));
			rec.bonm = Util.checkString(rset0.getString("bonm"));
			rec.aplcqunt = rset0.getInt("aplcqunt");
			rec.hdqtsplyqunt = rset0.getInt("hdqtsplyqunt");
			rec.totamt = rset0.getInt("totamt");
			rec.splyamt = rset0.getInt("splyamt");
			rec.clamamt = rset0.getInt("clamamt");
			this.curcommlist.add(rec);
		}
		this.totalcnt = cstmt.getLong(11);
		this.totalaplcqunt = cstmt.getLong(12);
		this.totalhdqtsplyqunt = cstmt.getLong(13);
		this.totaltotamt = cstmt.getLong(14);
		this.totalsplyamt = cstmt.getLong(15);
		this.totalclamamt = cstmt.getLong(16);
	}

	public String curcommlistOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curcommlist.size();
		for(int i=0; i<size; i++){
			SS_L_INSR_STCSCURCOMMLISTRecord rec = (SS_L_INSR_STCSCURCOMMLISTRecord)curcommlist.get(i);
			
			
			String code = rec.deptnm;
			String name = rec.areanm;
			
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
			SS_L_INSR_STCSCURCOMMLISTRecord rec = (SS_L_INSR_STCSCURCOMMLISTRecord)curcommlist.get(i);
			
			
			String code = rec.deptnm;
			String name = rec.areanm;
			
			sb.append("<input name=\"");
			sb.append("deptnm");
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
			SS_L_INSR_STCSCURCOMMLISTRecord rec = (SS_L_INSR_STCSCURCOMMLISTRecord)curcommlist.get(i);
			
			
			String code = rec.deptnm;
			String name = rec.areanm;
			
			sb.append("<input name=\"");
			sb.append("deptnm");
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
	SS_L_INSR_STCSDataSet ds = (SS_L_INSR_STCSDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curcommlist.size(); i++){
		SS_L_INSR_STCSCURCOMMLISTRecord curcommlistRec = (SS_L_INSR_STCSCURCOMMLISTRecord)ds.curcommlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurcommlist()%>
<%= ds.getTotalcnt()%>
<%= ds.getTotalaplcqunt()%>
<%= ds.getTotalhdqtsplyqunt()%>
<%= ds.getTotaltotamt()%>
<%= ds.getTotalsplyamt()%>
<%= ds.getTotalclamamt()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curcommlistRec.deptnm%>
<%= curcommlistRec.areanm%>
<%= curcommlistRec.bonm%>
<%= curcommlistRec.aplcqunt%>
<%= curcommlistRec.hdqtsplyqunt%>
<%= curcommlistRec.totamt%>
<%= curcommlistRec.splyamt%>
<%= curcommlistRec.clamamt%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Apr 09 20:44:33 KST 2009 */
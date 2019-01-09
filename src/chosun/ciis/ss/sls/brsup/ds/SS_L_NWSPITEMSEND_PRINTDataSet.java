/***************************************************************************************************
* 파일명 : .java
* 기능 : *지국지원-신문지원물품-신청-인쇄
* 작성일자 : 2009-04-07
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
 * 지국지원-신문지원물품-신청-인쇄
 */

public class SS_L_NWSPITEMSEND_PRINTDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curcommlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public long totalcnt;
	public long totalsendqunt;
	public long totalaccdqunt;

	public SS_L_NWSPITEMSEND_PRINTDataSet(){}
	public SS_L_NWSPITEMSEND_PRINTDataSet(String errcode, String errmsg, long totalcnt, long totalsendqunt, long totalaccdqunt){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.totalcnt = totalcnt;
		this.totalsendqunt = totalsendqunt;
		this.totalaccdqunt = totalaccdqunt;
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

	public void setTotalsendqunt(long totalsendqunt){
		this.totalsendqunt = totalsendqunt;
	}

	public void setTotalaccdqunt(long totalaccdqunt){
		this.totalaccdqunt = totalaccdqunt;
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

	public long getTotalsendqunt(){
		return this.totalsendqunt;
	}

	public long getTotalaccdqunt(){
		return this.totalaccdqunt;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){			return;		}
		ResultSet rset0 = (ResultSet) cstmt.getObject(14);
		while(rset0.next()){
			SS_L_NWSPITEMSEND_PRINTCURCOMMLISTRecord rec = new SS_L_NWSPITEMSEND_PRINTCURCOMMLISTRecord();
			rec.sendplacnm = Util.checkString(rset0.getString("sendplacnm"));
			rec.nbisc = Util.checkString(rset0.getString("nbisc"));
			rec.deptnm = Util.checkString(rset0.getString("deptnm"));
			rec.areanm = Util.checkString(rset0.getString("areanm"));
			rec.bonm = Util.checkString(rset0.getString("bonm"));
			rec.itemnm = Util.checkString(rset0.getString("itemnm"));
			rec.itemclsfnm = Util.checkString(rset0.getString("itemclsfnm"));
			rec.aplcqunt = rset0.getInt("aplcqunt");
			rec.accdqunt = rset0.getInt("accdqunt");
			rec.uprc = rset0.getInt("uprc");
			rec.amt = rset0.getInt("amt");
			rec.senddt = Util.checkString(rset0.getString("senddt"));
			rec.aplcdt = Util.checkString(rset0.getString("aplcdt"));
			this.curcommlist.add(rec);
		}
		this.totalcnt = cstmt.getLong(15);
		this.totalsendqunt = cstmt.getLong(16);
		this.totalaccdqunt = cstmt.getLong(17);
	}

	public String curcommlistOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curcommlist.size();
		for(int i=0; i<size; i++){
			SS_L_NWSPITEMSEND_PRINTCURCOMMLISTRecord rec = (SS_L_NWSPITEMSEND_PRINTCURCOMMLISTRecord)curcommlist.get(i);
			
			
			String code = rec.sendplacnm;
			String name = rec.nbisc;
			
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
			SS_L_NWSPITEMSEND_PRINTCURCOMMLISTRecord rec = (SS_L_NWSPITEMSEND_PRINTCURCOMMLISTRecord)curcommlist.get(i);
			
			
			String code = rec.sendplacnm;
			String name = rec.nbisc;
			
			sb.append("<input name=\"");
			sb.append("sendplacnm");
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
			SS_L_NWSPITEMSEND_PRINTCURCOMMLISTRecord rec = (SS_L_NWSPITEMSEND_PRINTCURCOMMLISTRecord)curcommlist.get(i);
			
			
			String code = rec.sendplacnm;
			String name = rec.nbisc;
			
			sb.append("<input name=\"");
			sb.append("sendplacnm");
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
	SS_L_NWSPITEMSEND_PRINTDataSet ds = (SS_L_NWSPITEMSEND_PRINTDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curcommlist.size(); i++){
		SS_L_NWSPITEMSEND_PRINTCURCOMMLISTRecord curcommlistRec = (SS_L_NWSPITEMSEND_PRINTCURCOMMLISTRecord)ds.curcommlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurcommlist()%>
<%= ds.getTotalcnt()%>
<%= ds.getTotalsendqunt()%>
<%= ds.getTotalaccdqunt()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curcommlistRec.sendplacnm%>
<%= curcommlistRec.nbisc%>
<%= curcommlistRec.deptnm%>
<%= curcommlistRec.areanm%>
<%= curcommlistRec.bonm%>
<%= curcommlistRec.itemnm%>
<%= curcommlistRec.itemclsfnm%>
<%= curcommlistRec.aplcqunt%>
<%= curcommlistRec.accdqunt%>
<%= curcommlistRec.uprc%>
<%= curcommlistRec.amt%>
<%= curcommlistRec.senddt%>
<%= curcommlistRec.aplcdt%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Apr 07 18:04:34 KST 2009 */
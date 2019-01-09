/***************************************************************************************************
* 파일명 : .java
* 기능 : *지국지원-전단현황-리스트
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
 * 지국지원-전단현황-리스트
 */

public class SS_L_ISLEAF_SCATDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curadvtlist = new ArrayList();
	public ArrayList curcommlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public long istotalcnt;
	public long adtotalcnt;
	public long totalcnt;
	public long istotalamt;
	public long adtotalamt;
	public long totalamt;

	public SS_L_ISLEAF_SCATDataSet(){}
	public SS_L_ISLEAF_SCATDataSet(String errcode, String errmsg, long istotalcnt, long adtotalcnt, long totalcnt, long istotalamt, long adtotalamt, long totalamt){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.istotalcnt = istotalcnt;
		this.adtotalcnt = adtotalcnt;
		this.totalcnt = totalcnt;
		this.istotalamt = istotalamt;
		this.adtotalamt = adtotalamt;
		this.totalamt = totalamt;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setIstotalcnt(long istotalcnt){
		this.istotalcnt = istotalcnt;
	}

	public void setAdtotalcnt(long adtotalcnt){
		this.adtotalcnt = adtotalcnt;
	}

	public void setTotalcnt(long totalcnt){
		this.totalcnt = totalcnt;
	}

	public void setIstotalamt(long istotalamt){
		this.istotalamt = istotalamt;
	}

	public void setAdtotalamt(long adtotalamt){
		this.adtotalamt = adtotalamt;
	}

	public void setTotalamt(long totalamt){
		this.totalamt = totalamt;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public long getIstotalcnt(){
		return this.istotalcnt;
	}

	public long getAdtotalcnt(){
		return this.adtotalcnt;
	}

	public long getTotalcnt(){
		return this.totalcnt;
	}

	public long getIstotalamt(){
		return this.istotalamt;
	}

	public long getAdtotalamt(){
		return this.adtotalamt;
	}

	public long getTotalamt(){
		return this.totalamt;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){			return;		}
		this.istotalcnt = cstmt.getLong(13);
		this.adtotalcnt = cstmt.getLong(14);
		this.totalcnt = cstmt.getLong(15);
		this.istotalamt = cstmt.getLong(16);
		this.adtotalamt = cstmt.getLong(17);
		this.totalamt = cstmt.getLong(18);
		ResultSet rset0 = (ResultSet) cstmt.getObject(19);
		while(rset0.next()){
			SS_L_ISLEAF_SCATCURCOMMLISTRecord rec = new SS_L_ISLEAF_SCATCURCOMMLISTRecord();
			rec.deptnm = Util.checkString(rset0.getString("deptnm"));
			rec.partnm = Util.checkString(rset0.getString("partnm"));
			rec.areanm = Util.checkString(rset0.getString("areanm"));
			rec.bonm = Util.checkString(rset0.getString("bonm"));
			rec.feeddt = Util.checkString(rset0.getString("feeddt"));
			rec.advtmain = Util.checkString(rset0.getString("advtmain"));
			rec.advtnm = Util.checkString(rset0.getString("advtnm"));
			rec.std = Util.checkString(rset0.getString("std"));
			rec.qunt = rset0.getInt("qunt");
			rec.uprc = rset0.getInt("uprc");
			rec.amt = rset0.getInt("amt");
			rec.compnm = Util.checkString(rset0.getString("compnm"));
			this.curcommlist.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(20);
		while(rset1.next()){
			SS_L_ISLEAF_SCATCURADVTLISTRecord rec = new SS_L_ISLEAF_SCATCURADVTLISTRecord();
			rec.advtlist = Util.checkString(rset1.getString("advtlist"));
			rec.advttemp = Util.checkString(rset1.getString("advttemp"));
			this.curadvtlist.add(rec);
		}
	}

	public String curcommlistOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curcommlist.size();
		for(int i=0; i<size; i++){
			SS_L_ISLEAF_SCATCURCOMMLISTRecord rec = (SS_L_ISLEAF_SCATCURCOMMLISTRecord)curcommlist.get(i);
			
			
			String code = rec.deptnm;
			String name = rec.partnm;
			
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

	public String curadvtlistOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curadvtlist.size();
		for(int i=0; i<size; i++){
			SS_L_ISLEAF_SCATCURADVTLISTRecord rec = (SS_L_ISLEAF_SCATCURADVTLISTRecord)curadvtlist.get(i);
			
			
			String code = rec.advtlist;
			String name = rec.advttemp;
			
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
			SS_L_ISLEAF_SCATCURCOMMLISTRecord rec = (SS_L_ISLEAF_SCATCURCOMMLISTRecord)curcommlist.get(i);
			
			
			String code = rec.deptnm;
			String name = rec.partnm;
			
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

	public String curadvtlistChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curadvtlist.size();
		for(int i=0; i<size; i++){
			SS_L_ISLEAF_SCATCURADVTLISTRecord rec = (SS_L_ISLEAF_SCATCURADVTLISTRecord)curadvtlist.get(i);
			
			
			String code = rec.advtlist;
			String name = rec.advttemp;
			
			sb.append("<input name=\"");
			sb.append("advtlist");
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
			SS_L_ISLEAF_SCATCURCOMMLISTRecord rec = (SS_L_ISLEAF_SCATCURCOMMLISTRecord)curcommlist.get(i);
			
			
			String code = rec.deptnm;
			String name = rec.partnm;
			
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

	public String curadvtlistRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curadvtlist.size();
		for(int i=0; i<size; i++){
			SS_L_ISLEAF_SCATCURADVTLISTRecord rec = (SS_L_ISLEAF_SCATCURADVTLISTRecord)curadvtlist.get(i);
			
			
			String code = rec.advtlist;
			String name = rec.advttemp;
			
			sb.append("<input name=\"");
			sb.append("advtlist");
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
	SS_L_ISLEAF_SCATDataSet ds = (SS_L_ISLEAF_SCATDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curcommlist.size(); i++){
		SS_L_ISLEAF_SCATCURCOMMLISTRecord curcommlistRec = (SS_L_ISLEAF_SCATCURCOMMLISTRecord)ds.curcommlist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curadvtlist.size(); i++){
		SS_L_ISLEAF_SCATCURADVTLISTRecord curadvtlistRec = (SS_L_ISLEAF_SCATCURADVTLISTRecord)ds.curadvtlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getIstotalcnt()%>
<%= ds.getAdtotalcnt()%>
<%= ds.getTotalcnt()%>
<%= ds.getIstotalamt()%>
<%= ds.getAdtotalamt()%>
<%= ds.getTotalamt()%>
<%= ds.getCurcommlist()%>
<%= ds.getCuradvtlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curcommlistRec.deptnm%>
<%= curcommlistRec.partnm%>
<%= curcommlistRec.areanm%>
<%= curcommlistRec.bonm%>
<%= curcommlistRec.feeddt%>
<%= curcommlistRec.advtmain%>
<%= curcommlistRec.advtnm%>
<%= curcommlistRec.std%>
<%= curcommlistRec.qunt%>
<%= curcommlistRec.uprc%>
<%= curcommlistRec.amt%>
<%= curcommlistRec.compnm%>
<%= curadvtlistRec.advtlist%>
<%= curadvtlistRec.advttemp%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Sun Sep 06 17:07:28 KST 2009 */
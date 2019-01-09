/***************************************************************************************************
* 파일명 : .java
* 기능 : 통합정보지원시스템-판촉물재고현황-상세조회화면
* 작성일자 :009/05/04
* 작성자 : 김용욱
***************************************************************************************************/


package chosun.ciis.ss.sls.brsup.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.brsup.dm.*;
import chosun.ciis.ss.sls.brsup.rec.*;

/**
 * 통합정보지원시스템-판촉물재고현황-상세조회화면
 */

public class SS_S_DETASLM_BNSITEMINOUTDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList detailsearch = new ArrayList();
	public String errcode;
	public String errmsg;

	public SS_S_DETASLM_BNSITEMINOUTDataSet(){}
	public SS_S_DETASLM_BNSITEMINOUTDataSet(String errcode, String errmsg){
		this.errcode = errcode;
		this.errmsg = errmsg;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){			return;		}
		ResultSet rset0 = (ResultSet) cstmt.getObject(9);
		while(rset0.next()){
			SS_S_DETASLM_BNSITEMINOUTDETAILSEARCHRecord rec = new SS_S_DETASLM_BNSITEMINOUTDETAILSEARCHRecord();
			rec.cmpycd = Util.checkString(rset0.getString("cmpycd"));
			rec.itemcd = Util.checkString(rset0.getString("itemcd"));
			rec.bns_itemcd = Util.checkString(rset0.getString("bns_itemcd"));
			rec.itemnm = Util.checkString(rset0.getString("itemnm"));
			rec.bonm = Util.checkString(rset0.getString("bonm"));
			rec.inoutdt = Util.checkString(rset0.getString("inoutdt"));
			rec.aftdivnclsf = Util.checkString(rset0.getString("aftdivnclsf"));
			rec.aftdivnclsfnm = Util.checkString(rset0.getString("aftdivnclsfnm"));
			rec.unit = Util.checkString(rset0.getString("unit"));
			rec.uprc = rset0.getInt("uprc");
			rec.qunt = rset0.getDouble("qunt");
			rec.team = Util.checkString(rset0.getString("team"));
			rec.part = Util.checkString(rset0.getString("part"));
			rec.area = Util.checkString(rset0.getString("area"));
			rec.bo = Util.checkString(rset0.getString("bo"));
			rec.no_valqunt = rset0.getDouble("no_valqunt");
			rec.valqunt = rset0.getDouble("valqunt");
			rec.mainware = Util.checkString(rset0.getString("mainware"));
			rec.pyungware = Util.checkString(rset0.getString("pyungware"));
			rec.sungware = Util.checkString(rset0.getString("sungware"));
			rec.remk = Util.checkString(rset0.getString("remk"));
			rec.seq = rset0.getInt("seq");
			this.detailsearch.add(rec);
		}
	}

	public String detailsearchOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = detailsearch.size();
		for(int i=0; i<size; i++){
			SS_S_DETASLM_BNSITEMINOUTDETAILSEARCHRecord rec = (SS_S_DETASLM_BNSITEMINOUTDETAILSEARCHRecord)detailsearch.get(i);
			
			
			String code = rec.cmpycd;
			String name = rec.itemcd;
			
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

	public String detailsearchChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = detailsearch.size();
		for(int i=0; i<size; i++){
			SS_S_DETASLM_BNSITEMINOUTDETAILSEARCHRecord rec = (SS_S_DETASLM_BNSITEMINOUTDETAILSEARCHRecord)detailsearch.get(i);
			
			
			String code = rec.cmpycd;
			String name = rec.itemcd;
			
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

	public String detailsearchRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = detailsearch.size();
		for(int i=0; i<size; i++){
			SS_S_DETASLM_BNSITEMINOUTDETAILSEARCHRecord rec = (SS_S_DETASLM_BNSITEMINOUTDETAILSEARCHRecord)detailsearch.get(i);
			
			
			String code = rec.cmpycd;
			String name = rec.itemcd;
			
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
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SS_S_DETASLM_BNSITEMINOUTDataSet ds = (SS_S_DETASLM_BNSITEMINOUTDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.detailsearch.size(); i++){
		SS_S_DETASLM_BNSITEMINOUTDETAILSEARCHRecord detailsearchRec = (SS_S_DETASLM_BNSITEMINOUTDETAILSEARCHRecord)ds.detailsearch.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getDetailsearch()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= detailsearchRec.cmpycd%>
<%= detailsearchRec.itemcd%>
<%= detailsearchRec.bns_itemcd%>
<%= detailsearchRec.itemnm%>
<%= detailsearchRec.bonm%>
<%= detailsearchRec.inoutdt%>
<%= detailsearchRec.aftdivnclsf%>
<%= detailsearchRec.aftdivnclsfnm%>
<%= detailsearchRec.unit%>
<%= detailsearchRec.uprc%>
<%= detailsearchRec.qunt%>
<%= detailsearchRec.team%>
<%= detailsearchRec.part%>
<%= detailsearchRec.area%>
<%= detailsearchRec.bo%>
<%= detailsearchRec.no_valqunt%>
<%= detailsearchRec.valqunt%>
<%= detailsearchRec.mainware%>
<%= detailsearchRec.pyungware%>
<%= detailsearchRec.sungware%>
<%= detailsearchRec.remk%>
<%= detailsearchRec.seq%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Jul 02 10:50:55 PDT 2009 */
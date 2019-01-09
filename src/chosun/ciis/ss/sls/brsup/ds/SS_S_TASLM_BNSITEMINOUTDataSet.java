/***************************************************************************************************
* 파일명 : .java
* 기능 : 통합정보지원시스템 판촉물재고현황 상세조회
* 작성일자 :2009/05/01
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
 * 통합정보지원시스템 판촉물재고현황 상세조회
 */

public class SS_S_TASLM_BNSITEMINOUTDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList detailinout = new ArrayList();
	public String errcode;
	public String errmsg;

	public SS_S_TASLM_BNSITEMINOUTDataSet(){}
	public SS_S_TASLM_BNSITEMINOUTDataSet(String errcode, String errmsg){
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
		ResultSet rset0 = (ResultSet) cstmt.getObject(15);
		while(rset0.next()){
			SS_S_TASLM_BNSITEMINOUTDETAILINOUTRecord rec = new SS_S_TASLM_BNSITEMINOUTDETAILINOUTRecord();
			rec.itemcd = Util.checkString(rset0.getString("itemcd"));
			rec.bns_itemcd = Util.checkString(rset0.getString("bns_itemcd"));
			rec.itemnm = Util.checkString(rset0.getString("itemnm"));
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
			rec.bonm = Util.checkString(rset0.getString("bonm"));
			rec.dept_nm = Util.checkString(rset0.getString("dept_nm"));
			rec.part_nm = Util.checkString(rset0.getString("part_nm"));
			rec.area_nm = Util.checkString(rset0.getString("area_nm"));
			rec.no_valqunt = rset0.getDouble("no_valqunt");
			rec.valqunt = rset0.getDouble("valqunt");
			rec.mainware = Util.checkString(rset0.getString("mainware"));
			rec.pyungware = Util.checkString(rset0.getString("pyungware"));
			rec.sungware = Util.checkString(rset0.getString("sungware"));
			rec.remk = Util.checkString(rset0.getString("remk"));
			rec.seq = rset0.getInt("seq");
			rec.cmpycd = Util.checkString(rset0.getString("cmpycd"));
			rec.incmgpers = Util.checkString(rset0.getString("incmgpers"));
			rec.chgpers = Util.checkString(rset0.getString("chgpers"));
			rec.whcd = Util.checkString(rset0.getString("whcd"));
			this.detailinout.add(rec);
		}
	}

	public String detailinoutOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = detailinout.size();
		for(int i=0; i<size; i++){
			SS_S_TASLM_BNSITEMINOUTDETAILINOUTRecord rec = (SS_S_TASLM_BNSITEMINOUTDETAILINOUTRecord)detailinout.get(i);
			
			
			String code = rec.itemcd;
			String name = rec.bns_itemcd;
			
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

	public String detailinoutChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = detailinout.size();
		for(int i=0; i<size; i++){
			SS_S_TASLM_BNSITEMINOUTDETAILINOUTRecord rec = (SS_S_TASLM_BNSITEMINOUTDETAILINOUTRecord)detailinout.get(i);
			
			
			String code = rec.itemcd;
			String name = rec.bns_itemcd;
			
			sb.append("<input name=\"");
			sb.append("itemcd");
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

	public String detailinoutRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = detailinout.size();
		for(int i=0; i<size; i++){
			SS_S_TASLM_BNSITEMINOUTDETAILINOUTRecord rec = (SS_S_TASLM_BNSITEMINOUTDETAILINOUTRecord)detailinout.get(i);
			
			
			String code = rec.itemcd;
			String name = rec.bns_itemcd;
			
			sb.append("<input name=\"");
			sb.append("itemcd");
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
	SS_S_TASLM_BNSITEMINOUTDataSet ds = (SS_S_TASLM_BNSITEMINOUTDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.detailinout.size(); i++){
		SS_S_TASLM_BNSITEMINOUTDETAILINOUTRecord detailinoutRec = (SS_S_TASLM_BNSITEMINOUTDETAILINOUTRecord)ds.detailinout.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getDetailinout()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= detailinoutRec.itemcd%>
<%= detailinoutRec.bns_itemcd%>
<%= detailinoutRec.itemnm%>
<%= detailinoutRec.inoutdt%>
<%= detailinoutRec.aftdivnclsf%>
<%= detailinoutRec.aftdivnclsfnm%>
<%= detailinoutRec.unit%>
<%= detailinoutRec.uprc%>
<%= detailinoutRec.qunt%>
<%= detailinoutRec.team%>
<%= detailinoutRec.part%>
<%= detailinoutRec.area%>
<%= detailinoutRec.bo%>
<%= detailinoutRec.bonm%>
<%= detailinoutRec.dept_nm%>
<%= detailinoutRec.part_nm%>
<%= detailinoutRec.area_nm%>
<%= detailinoutRec.no_valqunt%>
<%= detailinoutRec.valqunt%>
<%= detailinoutRec.mainware%>
<%= detailinoutRec.pyungware%>
<%= detailinoutRec.sungware%>
<%= detailinoutRec.remk%>
<%= detailinoutRec.seq%>
<%= detailinoutRec.cmpycd%>
<%= detailinoutRec.incmgpers%>
<%= detailinoutRec.chgpers%>
<%= detailinoutRec.whcd%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Jul 02 09:53:09 PDT 2009 */
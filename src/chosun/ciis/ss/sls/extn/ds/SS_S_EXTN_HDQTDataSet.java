/***************************************************************************************************
* 파일명 : .java
* 기능 : 확장현황-본사확장- 유형별 상세  
* 작성일자 : 2009-05-25
* 작성자 : 권정윤
***************************************************************************************************/


package chosun.ciis.ss.sls.extn.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.extn.dm.*;
import chosun.ciis.ss.sls.extn.rec.*;

/**
 * 확장현황-본사확장- 유형별 상세  
 */

public class SS_S_EXTN_HDQTDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList detaillist = new ArrayList();
	public String errcode;
	public String errmsg;

	public SS_S_EXTN_HDQTDataSet(){}
	public SS_S_EXTN_HDQTDataSet(String errcode, String errmsg){
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
		ResultSet rset0 = (ResultSet) cstmt.getObject(7);
		while(rset0.next()){
			SS_S_EXTN_HDQTDETAILLISTRecord rec = new SS_S_EXTN_HDQTDETAILLISTRecord();
			rec.rdr_extntypenm = Util.checkString(rset0.getString("rdr_extntypenm"));
			rec.aplcpathnm = Util.checkString(rset0.getString("aplcpathnm"));
			rec.advtpathnm = Util.checkString(rset0.getString("advtpathnm"));
			rec.medinm = Util.checkString(rset0.getString("medinm"));
			rec.qty = Util.checkString(rset0.getString("qty"));
			rec.sellnetclsfnm = Util.checkString(rset0.getString("sellnetclsfnm"));
			rec.extnflnm = Util.checkString(rset0.getString("extnflnm"));
			rec.extnblngnm = Util.checkString(rset0.getString("extnblngnm"));
			rec.alonadjmyn = Util.checkString(rset0.getString("alonadjmyn"));
			rec.shftbgnmm = Util.checkString(rset0.getString("shftbgnmm"));
			rec.clamtmm = Util.checkString(rset0.getString("clamtmm"));
			rec.clamtyn = Util.checkString(rset0.getString("clamtyn"));
			rec.aplcpersnm = Util.checkString(rset0.getString("aplcpersnm"));
			rec.aplcperstel_no1 = Util.checkString(rset0.getString("aplcperstel_no1"));
			rec.aplcperstel_no2 = Util.checkString(rset0.getString("aplcperstel_no2"));
			rec.aplcperstel_no3 = Util.checkString(rset0.getString("aplcperstel_no3"));
			rec.aplcperstel_detail = Util.checkString(rset0.getString("aplcperstel_detail"));
			rec.aplcpersptph_no1 = Util.checkString(rset0.getString("aplcpersptph_no1"));
			rec.aplcpersptph_no2 = Util.checkString(rset0.getString("aplcpersptph_no2"));
			rec.aplcpersptph_no3 = Util.checkString(rset0.getString("aplcpersptph_no3"));
			rec.aplcpersptph_detail = Util.checkString(rset0.getString("aplcpersptph_detail"));
			rec.aplcpersemail = Util.checkString(rset0.getString("aplcpersemail"));
			rec.rshpclsfnm = Util.checkString(rset0.getString("rshpclsfnm"));
			rec.rdrnm = Util.checkString(rset0.getString("rdrnm"));
			rec.rdrtel_no1 = Util.checkString(rset0.getString("rdrtel_no1"));
			rec.rdrtel_no2 = Util.checkString(rset0.getString("rdrtel_no2"));
			rec.rdrtel_no3 = Util.checkString(rset0.getString("rdrtel_no3"));
			rec.rdrtel_detail = Util.checkString(rset0.getString("rdrtel_detail"));
			rec.rdrptph_no1 = Util.checkString(rset0.getString("rdrptph_no1"));
			rec.rdrptph_no2 = Util.checkString(rset0.getString("rdrptph_no2"));
			rec.rdrptph_no3 = Util.checkString(rset0.getString("rdrptph_no3"));
			rec.rdrptph_detail = Util.checkString(rset0.getString("rdrptph_detail"));
			rec.rdr_no = Util.checkString(rset0.getString("rdr_no"));
			rec.rdremail = Util.checkString(rset0.getString("rdremail"));
			rec.onlmembid = Util.checkString(rset0.getString("onlmembid"));
			rec.valmm = Util.checkString(rset0.getString("valmm"));
			rec.freeday = Util.checkString(rset0.getString("freeday"));
			rec.sellnetclsfyn = Util.checkString(rset0.getString("sellnetclsfyn"));
			rec.subsuprc = Util.checkString(rset0.getString("subsuprc"));
			rec.clamtmthdnm = Util.checkString(rset0.getString("clamtmthdnm"));
			rec.agrmnt_prd = Util.checkString(rset0.getString("agrmnt_prd"));
			rec.bns_itemnm = Util.checkString(rset0.getString("bns_itemnm"));
			rec.shftaplcclsfnm = Util.checkString(rset0.getString("shftaplcclsfnm"));
			rec.clamt_month = Util.checkString(rset0.getString("clamt_month"));
			rec.dlvzip = Util.checkString(rset0.getString("dlvzip"));
			rec.dlvaddr = Util.checkString(rset0.getString("dlvaddr"));
			rec.dlvdtlsaddr = Util.checkString(rset0.getString("dlvdtlsaddr"));
			rec.addr_detail = Util.checkString(rset0.getString("addr_detail"));
			rec.bonm = Util.checkString(rset0.getString("bonm"));
			rec.tel_no11 = Util.checkString(rset0.getString("tel_no11"));
			rec.tel_no12 = Util.checkString(rset0.getString("tel_no12"));
			rec.tel_no13 = Util.checkString(rset0.getString("tel_no13"));
			rec.tel_detail = Util.checkString(rset0.getString("tel_detail"));
			rec.post_dlvyn = Util.checkString(rset0.getString("post_dlvyn"));
			rec.dlvhopedt = Util.checkString(rset0.getString("dlvhopedt"));
			rec.resiclsfnm = Util.checkString(rset0.getString("resiclsfnm"));
			rec.resitypenm = Util.checkString(rset0.getString("resitypenm"));
			rec.aplcpersremk = Util.checkString(rset0.getString("aplcpersremk"));
			rec.bo_headcnfmyn = Util.checkString(rset0.getString("bo_headcnfmyn"));
			rec.bo_headcnfmdt = Util.checkString(rset0.getString("bo_headcnfmdt"));
			rec.subscnfmstatnm = Util.checkString(rset0.getString("subscnfmstatnm"));
			rec.prcmsg = Util.checkString(rset0.getString("prcmsg"));
			rec.cns_empnm = Util.checkString(rset0.getString("cns_empnm"));
			rec.cns_empcnfmstatcd = Util.checkString(rset0.getString("cns_empcnfmstatcd"));
			rec.cns_empprocdt = Util.checkString(rset0.getString("cns_empprocdt"));
			rec.remk = Util.checkString(rset0.getString("remk"));
			this.detaillist.add(rec);
		}
	}

	public String detaillistOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = detaillist.size();
		for(int i=0; i<size; i++){
			SS_S_EXTN_HDQTDETAILLISTRecord rec = (SS_S_EXTN_HDQTDETAILLISTRecord)detaillist.get(i);
			
			
			String code = rec.rdr_extntypenm;
			String name = rec.aplcpathnm;
			
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

	public String detaillistChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = detaillist.size();
		for(int i=0; i<size; i++){
			SS_S_EXTN_HDQTDETAILLISTRecord rec = (SS_S_EXTN_HDQTDETAILLISTRecord)detaillist.get(i);
			
			
			String code = rec.rdr_extntypenm;
			String name = rec.aplcpathnm;
			
			sb.append("<input name=\"");
			sb.append("rdr_extntypenm");
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

	public String detaillistRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = detaillist.size();
		for(int i=0; i<size; i++){
			SS_S_EXTN_HDQTDETAILLISTRecord rec = (SS_S_EXTN_HDQTDETAILLISTRecord)detaillist.get(i);
			
			
			String code = rec.rdr_extntypenm;
			String name = rec.aplcpathnm;
			
			sb.append("<input name=\"");
			sb.append("rdr_extntypenm");
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
	SS_S_EXTN_HDQTDataSet ds = (SS_S_EXTN_HDQTDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.detaillist.size(); i++){
		SS_S_EXTN_HDQTDETAILLISTRecord detaillistRec = (SS_S_EXTN_HDQTDETAILLISTRecord)ds.detaillist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getDetaillist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= detaillistRec.rdr_extntypenm%>
<%= detaillistRec.aplcpathnm%>
<%= detaillistRec.advtpathnm%>
<%= detaillistRec.medinm%>
<%= detaillistRec.qty%>
<%= detaillistRec.sellnetclsfnm%>
<%= detaillistRec.extnflnm%>
<%= detaillistRec.extnblngnm%>
<%= detaillistRec.alonadjmyn%>
<%= detaillistRec.shftbgnmm%>
<%= detaillistRec.clamtmm%>
<%= detaillistRec.clamtyn%>
<%= detaillistRec.aplcpersnm%>
<%= detaillistRec.aplcperstel_no1%>
<%= detaillistRec.aplcperstel_no2%>
<%= detaillistRec.aplcperstel_no3%>
<%= detaillistRec.aplcperstel_detail%>
<%= detaillistRec.aplcpersptph_no1%>
<%= detaillistRec.aplcpersptph_no2%>
<%= detaillistRec.aplcpersptph_no3%>
<%= detaillistRec.aplcpersptph_detail%>
<%= detaillistRec.aplcpersemail%>
<%= detaillistRec.rshpclsfnm%>
<%= detaillistRec.rdrnm%>
<%= detaillistRec.rdrtel_no1%>
<%= detaillistRec.rdrtel_no2%>
<%= detaillistRec.rdrtel_no3%>
<%= detaillistRec.rdrtel_detail%>
<%= detaillistRec.rdrptph_no1%>
<%= detaillistRec.rdrptph_no2%>
<%= detaillistRec.rdrptph_no3%>
<%= detaillistRec.rdrptph_detail%>
<%= detaillistRec.rdr_no%>
<%= detaillistRec.rdremail%>
<%= detaillistRec.onlmembid%>
<%= detaillistRec.valmm%>
<%= detaillistRec.freeday%>
<%= detaillistRec.sellnetclsfyn%>
<%= detaillistRec.subsuprc%>
<%= detaillistRec.clamtmthdnm%>
<%= detaillistRec.agrmnt_prd%>
<%= detaillistRec.bns_itemnm%>
<%= detaillistRec.shftaplcclsfnm%>
<%= detaillistRec.clamt_month%>
<%= detaillistRec.dlvzip%>
<%= detaillistRec.dlvaddr%>
<%= detaillistRec.dlvdtlsaddr%>
<%= detaillistRec.addr_detail%>
<%= detaillistRec.bonm%>
<%= detaillistRec.tel_no11%>
<%= detaillistRec.tel_no12%>
<%= detaillistRec.tel_no13%>
<%= detaillistRec.tel_detail%>
<%= detaillistRec.post_dlvyn%>
<%= detaillistRec.dlvhopedt%>
<%= detaillistRec.resiclsfnm%>
<%= detaillistRec.resitypenm%>
<%= detaillistRec.aplcpersremk%>
<%= detaillistRec.bo_headcnfmyn%>
<%= detaillistRec.bo_headcnfmdt%>
<%= detaillistRec.subscnfmstatnm%>
<%= detaillistRec.prcmsg%>
<%= detaillistRec.cns_empnm%>
<%= detaillistRec.cns_empcnfmstatcd%>
<%= detaillistRec.cns_empprocdt%>
<%= detaillistRec.remk%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Jun 08 11:31:41 KST 2009 */
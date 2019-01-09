/***************************************************************************************************
* 파일명 : .java
* 기능 : 지국지원-빌링_자동이체-이체신청개선 상세조회 
* 작성일자 :2009/05/21 
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
 * 지국지원-빌링_자동이체-이체신청개선 상세조회 
 */

public class SS_S_SHFTAPLCDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList shftaplcdetail = new ArrayList();
	public String errcode;
	public String errmsg;

	public SS_S_SHFTAPLCDataSet(){}
	public SS_S_SHFTAPLCDataSet(String errcode, String errmsg){
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
			SS_S_SHFTAPLCSHFTAPLCDETAILRecord rec = new SS_S_SHFTAPLCSHFTAPLCDETAILRecord();
			rec.sysid = Util.checkString(rset0.getString("sysid"));
			rec.basidt = Util.checkString(rset0.getString("basidt"));
			rec.svctype = Util.checkString(rset0.getString("svctype"));
			rec.aplcclsf = Util.checkString(rset0.getString("aplcclsf"));
			rec.seq = rset0.getInt("seq");
			rec.insttcd = Util.checkString(rset0.getString("insttcd"));
			rec.aplcdt = Util.checkString(rset0.getString("aplcdt"));
			rec.shftaplcclsf = Util.checkString(rset0.getString("shftaplcclsf"));
			rec.pymtno1 = Util.checkString(rset0.getString("pymtno1"));
			rec.pymtno2 = Util.checkString(rset0.getString("pymtno2"));
			rec.pymthopedt = Util.checkString(rset0.getString("pymthopedt"));
			rec.feekind = Util.checkString(rset0.getString("feekind"));
			rec.recpinstt = Util.checkString(rset0.getString("recpinstt"));
			rec.acctno = Util.checkString(rset0.getString("acctno"));
			rec.vdtydt = Util.checkString(rset0.getString("vdtydt"));
			rec.prn = Util.checkString(rset0.getString("prn"));
			rec.nm = Util.checkString(rset0.getString("nm"));
			rec.tel_no = Util.checkString(rset0.getString("tel_no"));
			rec.rdrnm = Util.checkString(rset0.getString("rdrnm"));
			rec.rdrtel = Util.checkString(rset0.getString("rdrtel"));
			rec.rdrprn = Util.checkString(rset0.getString("rdrprn"));
			rec.zipseq = Util.checkString(rset0.getString("zipseq"));
			rec.zip1 = Util.checkString(rset0.getString("zip1"));
			rec.zip2 = Util.checkString(rset0.getString("zip2"));
			rec.zip3 = Util.checkString(rset0.getString("zip3"));
			rec.dlvplacno = Util.checkString(rset0.getString("dlvplacno"));
			rec.brchptel = Util.checkString(rset0.getString("brchptel"));
			rec.reqbrchcd = Util.checkString(rset0.getString("reqbrchcd"));
			rec.fststrtdt = Util.checkString(rset0.getString("fststrtdt"));
			rec.reqplacclsf = Util.checkString(rset0.getString("reqplacclsf"));
			rec.elecreqno = Util.checkString(rset0.getString("elecreqno"));
			rec.ocomcd = Util.checkString(rset0.getString("ocomcd"));
			rec.ocomresn = Util.checkString(rset0.getString("ocomresn"));
			rec.remk = Util.checkString(rset0.getString("remk"));
			this.shftaplcdetail.add(rec);
		}
	}

	public String shftaplcdetailOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = shftaplcdetail.size();
		for(int i=0; i<size; i++){
			SS_S_SHFTAPLCSHFTAPLCDETAILRecord rec = (SS_S_SHFTAPLCSHFTAPLCDETAILRecord)shftaplcdetail.get(i);
			
			
			String code = rec.sysid;
			String name = rec.basidt;
			
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

	public String shftaplcdetailChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = shftaplcdetail.size();
		for(int i=0; i<size; i++){
			SS_S_SHFTAPLCSHFTAPLCDETAILRecord rec = (SS_S_SHFTAPLCSHFTAPLCDETAILRecord)shftaplcdetail.get(i);
			
			
			String code = rec.sysid;
			String name = rec.basidt;
			
			sb.append("<input name=\"");
			sb.append("sysid");
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

	public String shftaplcdetailRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = shftaplcdetail.size();
		for(int i=0; i<size; i++){
			SS_S_SHFTAPLCSHFTAPLCDETAILRecord rec = (SS_S_SHFTAPLCSHFTAPLCDETAILRecord)shftaplcdetail.get(i);
			
			
			String code = rec.sysid;
			String name = rec.basidt;
			
			sb.append("<input name=\"");
			sb.append("sysid");
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
	SS_S_SHFTAPLCDataSet ds = (SS_S_SHFTAPLCDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.shftaplcdetail.size(); i++){
		SS_S_SHFTAPLCSHFTAPLCDETAILRecord shftaplcdetailRec = (SS_S_SHFTAPLCSHFTAPLCDETAILRecord)ds.shftaplcdetail.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getShftaplcdetail()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= shftaplcdetailRec.sysid%>
<%= shftaplcdetailRec.basidt%>
<%= shftaplcdetailRec.svctype%>
<%= shftaplcdetailRec.aplcclsf%>
<%= shftaplcdetailRec.seq%>
<%= shftaplcdetailRec.insttcd%>
<%= shftaplcdetailRec.aplcdt%>
<%= shftaplcdetailRec.shftaplcclsf%>
<%= shftaplcdetailRec.pymtno1%>
<%= shftaplcdetailRec.pymtno2%>
<%= shftaplcdetailRec.pymthopedt%>
<%= shftaplcdetailRec.feekind%>
<%= shftaplcdetailRec.recpinstt%>
<%= shftaplcdetailRec.acctno%>
<%= shftaplcdetailRec.vdtydt%>
<%= shftaplcdetailRec.prn%>
<%= shftaplcdetailRec.nm%>
<%= shftaplcdetailRec.tel_no%>
<%= shftaplcdetailRec.rdrnm%>
<%= shftaplcdetailRec.rdrtel%>
<%= shftaplcdetailRec.rdrprn%>
<%= shftaplcdetailRec.zipseq%>
<%= shftaplcdetailRec.zip1%>
<%= shftaplcdetailRec.zip2%>
<%= shftaplcdetailRec.zip3%>
<%= shftaplcdetailRec.dlvplacno%>
<%= shftaplcdetailRec.brchptel%>
<%= shftaplcdetailRec.reqbrchcd%>
<%= shftaplcdetailRec.fststrtdt%>
<%= shftaplcdetailRec.reqplacclsf%>
<%= shftaplcdetailRec.elecreqno%>
<%= shftaplcdetailRec.ocomcd%>
<%= shftaplcdetailRec.ocomresn%>
<%= shftaplcdetailRec.remk%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu May 21 17:55:54 PDT 2009 */
/***************************************************************************************************
* 파일명 : .java
* 기능 : 상담원-불편접수검색
* 작성일자 : 2008-07-11
* 작성자 : 노상현
***************************************************************************************************/


package chosun.ciis.ss.sls.cns.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.cns.dm.*;
import chosun.ciis.ss.sls.cns.rec.*;

/**
 *상담원-불편접수검색
*/
public class SS_L_RDR_DSCTDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curcommlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public long totalcnt;

	public SS_L_RDR_DSCTDataSet(){}
	public SS_L_RDR_DSCTDataSet(String errcode, String errmsg, long totalcnt){
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
		this.totalcnt = cstmt.getLong(21);
		ResultSet rset0 = (ResultSet) cstmt.getObject(22);
		while(rset0.next()){
			SS_L_RDR_DSCTCURCOMMLISTRecord rec = new SS_L_RDR_DSCTCURCOMMLISTRecord();
			rec.regdt = Util.checkString(rset0.getString("regdt"));
			rec.regno = Util.checkString(rset0.getString("regno"));
			rec.rdr_no = Util.checkString(rset0.getString("rdr_no"));
			rec.rdrnm = Util.checkString(rset0.getString("rdrnm"));
			rec.acpndt = rset0.getTimestamp("acpndt");
			rec.boksnm = Util.checkString(rset0.getString("boksnm"));
			rec.areanm = Util.checkString(rset0.getString("areanm"));
			rec.bonm = Util.checkString(rset0.getString("bonm"));
			rec.dscttypecdnm = Util.checkString(rset0.getString("dscttypecdnm"));
			rec.acpnpathcdnm = Util.checkString(rset0.getString("acpnpathcdnm"));
			rec.bocnfmyn = Util.checkString(rset0.getString("bocnfmyn"));
			rec.titl = Util.checkString(rset0.getString("titl"));
			rec.cns_empid = Util.checkString(rset0.getString("cns_empid"));
			rec.cns_empnm = Util.checkString(rset0.getString("cns_empnm"));
			rec.procpers = Util.checkString(rset0.getString("procpers"));
			rec.boprocdt = rset0.getTimestamp("boprocdt");
			this.curcommlist.add(rec);
		}
	}

	public String curcommlistOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curcommlist.size();
		for(int i=0; i<size; i++){
			SS_L_RDR_DSCTCURCOMMLISTRecord rec = (SS_L_RDR_DSCTCURCOMMLISTRecord)curcommlist.get(i);
			
			
			String code = rec.regdt;
			String name = rec.regno;
			
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
			SS_L_RDR_DSCTCURCOMMLISTRecord rec = (SS_L_RDR_DSCTCURCOMMLISTRecord)curcommlist.get(i);
			
			
			String code = rec.regdt;
			String name = rec.regno;
			
			sb.append("<input name=\"");
			sb.append("regdt");
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
			SS_L_RDR_DSCTCURCOMMLISTRecord rec = (SS_L_RDR_DSCTCURCOMMLISTRecord)curcommlist.get(i);
			
			
			String code = rec.regdt;
			String name = rec.regno;
			
			sb.append("<input name=\"");
			sb.append("regdt");
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
	SS_L_RDR_DSCTDataSet ds = (SS_L_RDR_DSCTDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curcommlist.size(); i++){
		SS_L_RDR_DSCTCURCOMMLISTRecord curcommlistRec = (SS_L_RDR_DSCTCURCOMMLISTRecord)ds.curcommlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getTotalcnt()%>
<%= ds.getCurcommlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curcommlistRec.regdt%>
<%= curcommlistRec.regno%>
<%= curcommlistRec.rdr_no%>
<%= curcommlistRec.rdrnm%>
<%= curcommlistRec.acpndt%>
<%= curcommlistRec.boksnm%>
<%= curcommlistRec.areanm%>
<%= curcommlistRec.bonm%>
<%= curcommlistRec.dscttypecdnm%>
<%= curcommlistRec.acpnpathcdnm%>
<%= curcommlistRec.bocnfmyn%>
<%= curcommlistRec.titl%>
<%= curcommlistRec.cns_empid%>
<%= curcommlistRec.cns_empnm%>
<%= curcommlistRec.procpers%>
<%= curcommlistRec.boprocdt%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Jul 11 15:36:57 KST 2008 */
/***************************************************************************************************
* 파일명 : .java
* 기능 : 관리자-담당별 우편번호 변경처리 조회
* 작성일자 : 2009-04-29
* 작성자 : 권정윤
***************************************************************************************************/


package chosun.ciis.ss.sls.admin.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.admin.dm.*;
import chosun.ciis.ss.sls.admin.rec.*;

/**
 * 관리자-담당별 우편번호 변경처리 조회
 */

public class SS_L_CHGZIPCODEDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList addrlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public SS_L_CHGZIPCODEDataSet(){}
	public SS_L_CHGZIPCODEDataSet(String errcode, String errmsg){
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
			SS_L_CHGZIPCODEADDRLISTRecord rec = new SS_L_CHGZIPCODEADDRLISTRecord();
			rec.chgclsf = Util.checkString(rset0.getString("chgclsf"));
			rec.chgclsfnm = Util.checkString(rset0.getString("chgclsfnm"));
			rec.zip1 = Util.checkString(rset0.getString("zip1"));
			rec.zip2 = Util.checkString(rset0.getString("zip2"));
			rec.zip3 = Util.checkString(rset0.getString("zip3"));
			rec.newzipcode = Util.checkString(rset0.getString("newzipcode"));
			rec.newaddr = Util.checkString(rset0.getString("newaddr"));
			rec.oldzipcode = Util.checkString(rset0.getString("oldzipcode"));
			rec.oldaddr = Util.checkString(rset0.getString("oldaddr"));
			rec.stat = Util.checkString(rset0.getString("stat"));
			rec.statnm = Util.checkString(rset0.getString("statnm"));
			rec.chgresn = Util.checkString(rset0.getString("chgresn"));
			rec.incmgpers = Util.checkString(rset0.getString("incmgpers"));
			rec.incmgtm = rset0.getTimestamp("incmgtm");
			rec.chgpers = Util.checkString(rset0.getString("chgpers"));
			rec.chgtm = rset0.getTimestamp("chgtm");
			this.addrlist.add(rec);
		}
	}

	public String addrlistOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = addrlist.size();
		for(int i=0; i<size; i++){
			SS_L_CHGZIPCODEADDRLISTRecord rec = (SS_L_CHGZIPCODEADDRLISTRecord)addrlist.get(i);
			
			
			String code = rec.chgclsf;
			String name = rec.chgclsfnm;
			
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

	public String addrlistChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = addrlist.size();
		for(int i=0; i<size; i++){
			SS_L_CHGZIPCODEADDRLISTRecord rec = (SS_L_CHGZIPCODEADDRLISTRecord)addrlist.get(i);
			
			
			String code = rec.chgclsf;
			String name = rec.chgclsfnm;
			
			sb.append("<input name=\"");
			sb.append("chgclsf");
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

	public String addrlistRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = addrlist.size();
		for(int i=0; i<size; i++){
			SS_L_CHGZIPCODEADDRLISTRecord rec = (SS_L_CHGZIPCODEADDRLISTRecord)addrlist.get(i);
			
			
			String code = rec.chgclsf;
			String name = rec.chgclsfnm;
			
			sb.append("<input name=\"");
			sb.append("chgclsf");
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
	SS_L_CHGZIPCODEDataSet ds = (SS_L_CHGZIPCODEDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.addrlist.size(); i++){
		SS_L_CHGZIPCODEADDRLISTRecord addrlistRec = (SS_L_CHGZIPCODEADDRLISTRecord)ds.addrlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getAddrlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= addrlistRec.chgclsf%>
<%= addrlistRec.chgclsfnm%>
<%= addrlistRec.zip1%>
<%= addrlistRec.zip2%>
<%= addrlistRec.zip3%>
<%= addrlistRec.newzipcode%>
<%= addrlistRec.newaddr%>
<%= addrlistRec.oldzipcode%>
<%= addrlistRec.oldaddr%>
<%= addrlistRec.stat%>
<%= addrlistRec.statnm%>
<%= addrlistRec.chgresn%>
<%= addrlistRec.incmgpers%>
<%= addrlistRec.incmgtm%>
<%= addrlistRec.chgpers%>
<%= addrlistRec.chgtm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Apr 30 14:32:24 KST 2009 */
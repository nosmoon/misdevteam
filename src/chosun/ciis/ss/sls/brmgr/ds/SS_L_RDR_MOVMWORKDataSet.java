/***************************************************************************************************
* 파일명 : .java
* 기능 : *지국경영-관할지국조정-목록
* 작성일자 : 2009-03-12
* 작성자 : 김세웅
***************************************************************************************************/


package chosun.ciis.ss.sls.brmgr.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.brmgr.dm.*;
import chosun.ciis.ss.sls.brmgr.rec.*;

/**
 * 지국경영-관할지국조정-목록
 */

public class SS_L_RDR_MOVMWORKDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curcommlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public long totalcnt;

	public SS_L_RDR_MOVMWORKDataSet(){}
	public SS_L_RDR_MOVMWORKDataSet(String errcode, String errmsg, long totalcnt){
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
		this.totalcnt = cstmt.getLong(13);
		ResultSet rset0 = (ResultSet) cstmt.getObject(14);
		while(rset0.next()){
			SS_L_RDR_MOVMWORKCURCOMMLISTRecord rec = new SS_L_RDR_MOVMWORKCURCOMMLISTRecord();
			rec.regdt = Util.checkString(rset0.getString("regdt"));
			rec.regno = Util.checkString(rset0.getString("regno"));
			rec.trsfdt_tm = Util.checkString(rset0.getString("trsfdt_tm"));
			rec.trsfbocd = Util.checkString(rset0.getString("trsfbocd"));
			rec.trsfbonm = Util.checkString(rset0.getString("trsfbonm"));
			rec.acptbocd = Util.checkString(rset0.getString("acptbocd"));
			rec.acptbonm = Util.checkString(rset0.getString("acptbonm"));
			rec.rdrcnt = rset0.getInt("rdrcnt");
			rec.medabasidt = Util.checkString(rset0.getString("medabasidt"));
			rec.chrgcnfmdt_tm = Util.checkString(rset0.getString("chrgcnfmdt_tm"));
			rec.acptdt_tm = Util.checkString(rset0.getString("acptdt_tm"));
			rec.procstat = Util.checkString(rset0.getString("procstat"));
			rec.procstatnm = Util.checkString(rset0.getString("procstatnm"));
			this.curcommlist.add(rec);
		}
	}

	public String curcommlistOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curcommlist.size();
		for(int i=0; i<size; i++){
			SS_L_RDR_MOVMWORKCURCOMMLISTRecord rec = (SS_L_RDR_MOVMWORKCURCOMMLISTRecord)curcommlist.get(i);
			
			
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
			SS_L_RDR_MOVMWORKCURCOMMLISTRecord rec = (SS_L_RDR_MOVMWORKCURCOMMLISTRecord)curcommlist.get(i);
			
			
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
			SS_L_RDR_MOVMWORKCURCOMMLISTRecord rec = (SS_L_RDR_MOVMWORKCURCOMMLISTRecord)curcommlist.get(i);
			
			
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
	SS_L_RDR_MOVMWORKDataSet ds = (SS_L_RDR_MOVMWORKDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curcommlist.size(); i++){
		SS_L_RDR_MOVMWORKCURCOMMLISTRecord curcommlistRec = (SS_L_RDR_MOVMWORKCURCOMMLISTRecord)ds.curcommlist.get(i);%>
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
<%= curcommlistRec.trsfdt_tm%>
<%= curcommlistRec.trsfbocd%>
<%= curcommlistRec.trsfbonm%>
<%= curcommlistRec.acptbocd%>
<%= curcommlistRec.acptbonm%>
<%= curcommlistRec.rdrcnt%>
<%= curcommlistRec.medabasidt%>
<%= curcommlistRec.chrgcnfmdt_tm%>
<%= curcommlistRec.acptdt_tm%>
<%= curcommlistRec.procstat%>
<%= curcommlistRec.procstatnm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Mar 12 20:26:12 KST 2009 */
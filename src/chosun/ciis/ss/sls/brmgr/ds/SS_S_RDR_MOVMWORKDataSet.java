/***************************************************************************************************
* 파일명 : SS_S_RDR_MOVMWORKDataSet.java
* 기능 : 지국경영-관할지국조정-상세
* 작성일자 : 2004-03-19
* 작성자 : 김영윤
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
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
 *
 */


public class SS_S_RDR_MOVMWORKDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curcommlist2 = new ArrayList();
	public ArrayList curcommlist1 = new ArrayList();
	public String errcode;
	public String errmsg;

	public SS_S_RDR_MOVMWORKDataSet(){}
	public SS_S_RDR_MOVMWORKDataSet(String errcode, String errmsg){
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
		ResultSet rset0 = (ResultSet) cstmt.getObject(5);
		while(rset0.next()){
			SS_S_RDR_MOVMWORKCURCOMMLIST1Record rec = new SS_S_RDR_MOVMWORKCURCOMMLIST1Record();
			rec.dstccd = Util.checkString(rset0.getString("dstccd"));
			rec.dstcnm = Util.checkString(rset0.getString("dstcnm"));
			rec.rdrcnt = rset0.getInt("rdrcnt");
			rec.bgndlvno = Util.checkString(rset0.getString("bgndlvno"));
			rec.enddlvno = Util.checkString(rset0.getString("enddlvno"));
			this.curcommlist1.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(6);
		while(rset1.next()){
			SS_S_RDR_MOVMWORKCURCOMMLIST2Record rec = new SS_S_RDR_MOVMWORKCURCOMMLIST2Record();
			rec.medicd = Util.checkString(rset1.getString("medicd"));
			rec.medinm = Util.checkString(rset1.getString("medinm"));
			rec.valqty = rset1.getInt("valqty");
			rec.pre_valqty = rset1.getInt("pre_valqty");
			rec.no_valqty = rset1.getInt("no_valqty");
			this.curcommlist2.add(rec);
		}
	}

	public String curcommlist1OptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curcommlist1.size();
		for(int i=0; i<size; i++){
			SS_S_RDR_MOVMWORKCURCOMMLIST1Record rec = (SS_S_RDR_MOVMWORKCURCOMMLIST1Record)curcommlist1.get(i);
			
			
			String code = rec.dstccd;
			String name = rec.dstcnm;
			
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

	public String curcommlist2OptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curcommlist2.size();
		for(int i=0; i<size; i++){
			SS_S_RDR_MOVMWORKCURCOMMLIST2Record rec = (SS_S_RDR_MOVMWORKCURCOMMLIST2Record)curcommlist2.get(i);
			
			
			String code = rec.medicd;
			String name = rec.medinm;
			
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

	public String curcommlist1ChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curcommlist1.size();
		for(int i=0; i<size; i++){
			SS_S_RDR_MOVMWORKCURCOMMLIST1Record rec = (SS_S_RDR_MOVMWORKCURCOMMLIST1Record)curcommlist1.get(i);
			
			
			String code = rec.dstccd;
			String name = rec.dstcnm;
			
			sb.append("<input name=\"");
			sb.append("dstccd");
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

	public String curcommlist2ChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curcommlist2.size();
		for(int i=0; i<size; i++){
			SS_S_RDR_MOVMWORKCURCOMMLIST2Record rec = (SS_S_RDR_MOVMWORKCURCOMMLIST2Record)curcommlist2.get(i);
			
			
			String code = rec.medicd;
			String name = rec.medinm;
			
			sb.append("<input name=\"");
			sb.append("medicd");
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

	public String curcommlist1RdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curcommlist1.size();
		for(int i=0; i<size; i++){
			SS_S_RDR_MOVMWORKCURCOMMLIST1Record rec = (SS_S_RDR_MOVMWORKCURCOMMLIST1Record)curcommlist1.get(i);
			
			
			String code = rec.dstccd;
			String name = rec.dstcnm;
			
			sb.append("<input name=\"");
			sb.append("dstccd");
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

	public String curcommlist2RdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curcommlist2.size();
		for(int i=0; i<size; i++){
			SS_S_RDR_MOVMWORKCURCOMMLIST2Record rec = (SS_S_RDR_MOVMWORKCURCOMMLIST2Record)curcommlist2.get(i);
			
			
			String code = rec.medicd;
			String name = rec.medinm;
			
			sb.append("<input name=\"");
			sb.append("medicd");
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
	SS_S_RDR_MOVMWORKDataSet ds = (SS_S_RDR_MOVMWORKDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curcommlist1.size(); i++){
		SS_S_RDR_MOVMWORKCURCOMMLIST1Record curcommlist1Rec = (SS_S_RDR_MOVMWORKCURCOMMLIST1Record)ds.curcommlist1.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curcommlist2.size(); i++){
		SS_S_RDR_MOVMWORKCURCOMMLIST2Record curcommlist2Rec = (SS_S_RDR_MOVMWORKCURCOMMLIST2Record)ds.curcommlist2.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurcommlist1()%>
<%= ds.getCurcommlist2()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curcommlist1Rec.dstccd%>
<%= curcommlist1Rec.dstcnm%>
<%= curcommlist1Rec.rdrcnt%>
<%= curcommlist1Rec.bgndlvno%>
<%= curcommlist1Rec.enddlvno%>
<%= curcommlist2Rec.medicd%>
<%= curcommlist2Rec.medinm%>
<%= curcommlist2Rec.valqty%>
<%= curcommlist2Rec.pre_valqty%>
<%= curcommlist2Rec.no_valqty%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Sat Mar 20 13:52:25 KST 2004 */
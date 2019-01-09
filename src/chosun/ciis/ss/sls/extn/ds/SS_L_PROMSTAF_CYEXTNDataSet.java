/***************************************************************************************************
* 파일명 : SS_L_PROMSTAF_CYEXTN.java
* 기능 :   확장현황-사이버확장-요원-목록조회
* 작성일자 : 2004-10-13
* 작성자 : 노상현
***************************************************************************************************/
/***************************************************************************************************
* 수정내역	: 
* 수정자	: 
* 수정일자	:
* 백업		: 
***************************************************************************************************/


package chosun.ciis.ss.sls.extn.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.extn.dm.*;
import chosun.ciis.ss.sls.extn.rec.*;

/**
 * 확장현황-사이버확장-요원-목록조회
 *
 */


public class SS_L_PROMSTAF_CYEXTNDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curcommlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public long totalcnt;

	public SS_L_PROMSTAF_CYEXTNDataSet(){}
	public SS_L_PROMSTAF_CYEXTNDataSet(String errcode, String errmsg, long totalcnt){
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
		this.totalcnt = cstmt.getLong(10);
		ResultSet rset0 = (ResultSet) cstmt.getObject(11);
		while(rset0.next()){
			SS_L_PROMSTAF_CYEXTNCURCOMMLISTRecord rec = new SS_L_PROMSTAF_CYEXTNCURCOMMLISTRecord();
			rec.stafclsfcd = Util.checkString(rset0.getString("stafclsfcd"));
			rec.stafno = Util.checkString(rset0.getString("stafno"));
			rec.stafnm = Util.checkString(rset0.getString("stafnm"));
			rec.cnvsstafno = Util.checkString(rset0.getString("cnvsstafno"));
			rec.cnvsstafnm = Util.checkString(rset0.getString("cnvsstafnm"));
			rec.in_cmpydt = Util.checkString(rset0.getString("in_cmpydt"));
			rec.ptph_no1 = Util.checkString(rset0.getString("ptph_no1"));
			rec.ptph_no2 = Util.checkString(rset0.getString("ptph_no2"));
			rec.ptph_no3 = Util.checkString(rset0.getString("ptph_no3"));
			rec.email = Util.checkString(rset0.getString("email"));
			this.curcommlist.add(rec);
		}
	}

	public String curcommlistOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curcommlist.size();
		for(int i=0; i<size; i++){
			SS_L_PROMSTAF_CYEXTNCURCOMMLISTRecord rec = (SS_L_PROMSTAF_CYEXTNCURCOMMLISTRecord)curcommlist.get(i);
			
			
			String code = rec.stafclsfcd;
			String name = rec.stafno;
			
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
			SS_L_PROMSTAF_CYEXTNCURCOMMLISTRecord rec = (SS_L_PROMSTAF_CYEXTNCURCOMMLISTRecord)curcommlist.get(i);
			
			
			String code = rec.stafclsfcd;
			String name = rec.stafno;
			
			sb.append("<input name=\"");
			sb.append("stafclsfcd");
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
			SS_L_PROMSTAF_CYEXTNCURCOMMLISTRecord rec = (SS_L_PROMSTAF_CYEXTNCURCOMMLISTRecord)curcommlist.get(i);
			
			
			String code = rec.stafclsfcd;
			String name = rec.stafno;
			
			sb.append("<input name=\"");
			sb.append("stafclsfcd");
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
	SS_L_PROMSTAF_CYEXTNDataSet ds = (SS_L_PROMSTAF_CYEXTNDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curcommlist.size(); i++){
		SS_L_PROMSTAF_CYEXTNCURCOMMLISTRecord curcommlistRec = (SS_L_PROMSTAF_CYEXTNCURCOMMLISTRecord)ds.curcommlist.get(i);%>
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

<%= curcommlistRec.stafclsfcd%>
<%= curcommlistRec.stafno%>
<%= curcommlistRec.stafnm%>
<%= curcommlistRec.cnvsstafno%>
<%= curcommlistRec.cnvsstafnm%>
<%= curcommlistRec.in_cmpydt%>
<%= curcommlistRec.ptph_no1%>
<%= curcommlistRec.ptph_no2%>
<%= curcommlistRec.ptph_no3%>
<%= curcommlistRec.email%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Oct 12 21:24:45 KST 2004 */
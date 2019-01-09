/***************************************************************************************************
* 파일명 : .java
* 기능 : 관리자-담당별 우편번호 변경처리 상세조회
* 작성일자 : 2009-05-01
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
 * 관리자-담당별 우편번호 변경처리 상세조회
 */

public class SS_S_CHGZIPCODEDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList detaillist = new ArrayList();
	public String errcode;
	public String errmsg;

	public SS_S_CHGZIPCODEDataSet(){}
	public SS_S_CHGZIPCODEDataSet(String errcode, String errmsg){
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
			SS_S_CHGZIPCODEDETAILLISTRecord rec = new SS_S_CHGZIPCODEDETAILLISTRecord();
			rec.newzip1 = Util.checkString(rset0.getString("newzip1"));
			rec.newzip2 = Util.checkString(rset0.getString("newzip2"));
			rec.newzip3 = Util.checkString(rset0.getString("newzip3"));
			rec.zipcode = Util.checkString(rset0.getString("zipcode"));
			rec.newaddr1 = Util.checkString(rset0.getString("newaddr1"));
			rec.newaddr2 = Util.checkString(rset0.getString("newaddr2"));
			rec.newaddr3 = Util.checkString(rset0.getString("newaddr3"));
			rec.newaddr4 = Util.checkString(rset0.getString("newaddr4"));
			rec.newbgnbnji = Util.checkString(rset0.getString("newbgnbnji"));
			rec.newendbnji = Util.checkString(rset0.getString("newendbnji"));
			rec.bocd = Util.checkString(rset0.getString("bocd"));
			rec.bonm = Util.checkString(rset0.getString("bonm"));
			this.detaillist.add(rec);
		}
	}

	public String detaillistOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = detaillist.size();
		for(int i=0; i<size; i++){
			SS_S_CHGZIPCODEDETAILLISTRecord rec = (SS_S_CHGZIPCODEDETAILLISTRecord)detaillist.get(i);
			
			
			String code = rec.newzip1;
			String name = rec.newzip2;
			
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
			SS_S_CHGZIPCODEDETAILLISTRecord rec = (SS_S_CHGZIPCODEDETAILLISTRecord)detaillist.get(i);
			
			
			String code = rec.newzip1;
			String name = rec.newzip2;
			
			sb.append("<input name=\"");
			sb.append("newzip1");
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
			SS_S_CHGZIPCODEDETAILLISTRecord rec = (SS_S_CHGZIPCODEDETAILLISTRecord)detaillist.get(i);
			
			
			String code = rec.newzip1;
			String name = rec.newzip2;
			
			sb.append("<input name=\"");
			sb.append("newzip1");
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
	SS_S_CHGZIPCODEDataSet ds = (SS_S_CHGZIPCODEDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.detaillist.size(); i++){
		SS_S_CHGZIPCODEDETAILLISTRecord detaillistRec = (SS_S_CHGZIPCODEDETAILLISTRecord)ds.detaillist.get(i);%>
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

<%= detaillistRec.newzip1%>
<%= detaillistRec.newzip2%>
<%= detaillistRec.newzip3%>
<%= detaillistRec.zipcode%>
<%= detaillistRec.newaddr1%>
<%= detaillistRec.newaddr2%>
<%= detaillistRec.newaddr3%>
<%= detaillistRec.newaddr4%>
<%= detaillistRec.newbgnbnji%>
<%= detaillistRec.newendbnji%>
<%= detaillistRec.bocd%>
<%= detaillistRec.bonm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed May 06 16:18:06 KST 2009 */
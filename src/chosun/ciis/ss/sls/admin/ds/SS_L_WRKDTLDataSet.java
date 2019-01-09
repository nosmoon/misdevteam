/***************************************************************************************************
* 파일명 : SS_L_WRKDTLDataSet.java
* 기능 : 관리자-작업-작업이력-목록(내역) 을 위한 DataSet
* 작성일자 : 2004-04-10
* 작성자 : 김대섭
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/

package chosun.ciis.ss.sls.admin.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.admin.dm.*;
import chosun.ciis.ss.sls.admin.rec.*;

/**
 * 관리자-작업-작업이력-목록(내역) 을 위한 DataSet
 */

public class SS_L_WRKDTLDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curcommlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public long totalcnt;

	public SS_L_WRKDTLDataSet(){}
	public SS_L_WRKDTLDataSet(String errcode, String errmsg, long totalcnt){
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
		ResultSet rset0 = (ResultSet) cstmt.getObject(7);
		while(rset0.next()){
			SS_L_WRKDTLCURCOMMLISTRecord rec = new SS_L_WRKDTLCURCOMMLISTRecord();
			rec.id = Util.checkString(rset0.getString("id"));
			rec.execno = Util.checkString(rset0.getString("execno"));
			rec.execdtlsno = Util.checkString(rset0.getString("execdtlsno"));
			rec.workdescri = Util.checkString(rset0.getString("workdescri"));
			rec.workfrdt = rset0.getTimestamp("workfrdt");
			rec.worktodt = rset0.getTimestamp("worktodt");
			rec.srctbl = Util.checkString(rset0.getString("srctbl"));
			rec.targtbl = Util.checkString(rset0.getString("targtbl"));
			rec.noit1 = rset0.getInt("noit1");
			rec.noit2 = rset0.getInt("noit2");
			rec.errcd = Util.checkString(rset0.getString("errcd"));
			rec.errmsg = Util.checkString(rset0.getString("errmsg"));
			this.curcommlist.add(rec);
		}
		this.totalcnt = cstmt.getLong(8);
	}

	public String curcommlistOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curcommlist.size();
		for(int i=0; i<size; i++){
			SS_L_WRKDTLCURCOMMLISTRecord rec = (SS_L_WRKDTLCURCOMMLISTRecord)curcommlist.get(i);
			
			
			String code = rec.id;
			String name = rec.execno;
			
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
			SS_L_WRKDTLCURCOMMLISTRecord rec = (SS_L_WRKDTLCURCOMMLISTRecord)curcommlist.get(i);
			
			
			String code = rec.id;
			String name = rec.execno;
			
			sb.append("<input name=\"");
			sb.append("id");
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
			SS_L_WRKDTLCURCOMMLISTRecord rec = (SS_L_WRKDTLCURCOMMLISTRecord)curcommlist.get(i);
			
			
			String code = rec.id;
			String name = rec.execno;
			
			sb.append("<input name=\"");
			sb.append("id");
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
	SS_L_WRKDTLDataSet ds = (SS_L_WRKDTLDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curcommlist.size(); i++){
		SS_L_WRKDTLCURCOMMLISTRecord curcommlistRec = (SS_L_WRKDTLCURCOMMLISTRecord)ds.curcommlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurcommlist()%>
<%= ds.getTotalcnt()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curcommlistRec.id%>
<%= curcommlistRec.execno%>
<%= curcommlistRec.execdtlsno%>
<%= curcommlistRec.workdescri%>
<%= curcommlistRec.workfrdt%>
<%= curcommlistRec.worktodt%>
<%= curcommlistRec.srctbl%>
<%= curcommlistRec.targtbl%>
<%= curcommlistRec.noit1%>
<%= curcommlistRec.noit2%>
<%= curcommlistRec.errcd%>
<%= curcommlistRec.errmsg%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Apr 12 11:46:05 KST 2004 */
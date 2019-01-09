/***************************************************************************************************
* 파일명 : SS_L_WRKHISTDataSet.java
* 기능 : 관리자-작업이력-목록을 위한 DataSet
* 작성일자 : 2004-04-24
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
 * 관리자-작업이력-목록을 위한 DataSet
 */


public class SS_L_WRKHISTDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curcommlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public long totalcnt;

	public SS_L_WRKHISTDataSet(){}
	public SS_L_WRKHISTDataSet(String errcode, String errmsg, long totalcnt){
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
		ResultSet rset0 = (ResultSet) cstmt.getObject(8);
		while(rset0.next()){
			SS_L_WRKHISTCURCOMMLISTRecord rec = new SS_L_WRKHISTCURCOMMLISTRecord();
			rec.id = Util.checkString(rset0.getString("id"));
			rec.execno = Util.checkString(rset0.getString("execno"));
			rec.descri = Util.checkString(rset0.getString("descri"));
			rec.workfrdt = rset0.getTimestamp("workfrdt");
			rec.worktodt = rset0.getTimestamp("worktodt");
			rec.execocom = Util.checkString(rset0.getString("execocom"));
			rec.workremk1 = Util.checkString(rset0.getString("workremk1"));
			rec.work_pers = Util.checkString(rset0.getString("work_pers"));
			this.curcommlist.add(rec);
		}
		this.totalcnt = cstmt.getLong(9);
	}

	public String curcommlistOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curcommlist.size();
		for(int i=0; i<size; i++){
			SS_L_WRKHISTCURCOMMLISTRecord rec = (SS_L_WRKHISTCURCOMMLISTRecord)curcommlist.get(i);
			
			
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
			SS_L_WRKHISTCURCOMMLISTRecord rec = (SS_L_WRKHISTCURCOMMLISTRecord)curcommlist.get(i);
			
			
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
			SS_L_WRKHISTCURCOMMLISTRecord rec = (SS_L_WRKHISTCURCOMMLISTRecord)curcommlist.get(i);
			
			
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
	SS_L_WRKHISTDataSet ds = (SS_L_WRKHISTDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curcommlist.size(); i++){
		SS_L_WRKHISTCURCOMMLISTRecord curcommlistRec = (SS_L_WRKHISTCURCOMMLISTRecord)ds.curcommlist.get(i);%>
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
<%= curcommlistRec.descri%>
<%= curcommlistRec.workfrdt%>
<%= curcommlistRec.worktodt%>
<%= curcommlistRec.execocom%>
<%= curcommlistRec.workremk1%>
<%= curcommlistRec.work_pers%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Jul 06 14:29:55 KST 2004 */
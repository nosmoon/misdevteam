/***************************************************************************************************
* 파일명 : .java
* 기능 : 우편번호 리스트 
* 작성일자 : 2009-08-27
* 작성자 : 권정윤
***************************************************************************************************/


package chosun.ciis.co.post.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.co.post.dm.*;
import chosun.ciis.co.post.rec.*;

/**
 * 우편번호 리스트 
 */

public class CO_L_ZIP_ALLDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curcommlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public long totalcnt;

	public CO_L_ZIP_ALLDataSet(){}
	public CO_L_ZIP_ALLDataSet(String errcode, String errmsg, long totalcnt){
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
		this.totalcnt = cstmt.getLong(8);
		ResultSet rset0 = (ResultSet) cstmt.getObject(9);
		while(rset0.next()){
			CO_L_ZIP_ALLCURCOMMLISTRecord rec = new CO_L_ZIP_ALLCURCOMMLISTRecord();
			rec.zip = Util.checkString(rset0.getString("zip"));
			rec.addr = Util.checkString(rset0.getString("addr"));
			rec.bgnn = Util.checkString(rset0.getString("bgnn"));
			rec.endn = Util.checkString(rset0.getString("endn"));
			rec.bocd = Util.checkString(rset0.getString("bocd"));
			rec.bonm = Util.checkString(rset0.getString("bonm"));
			rec.telno1 = Util.checkString(rset0.getString("telno1"));
			rec.telno2 = Util.checkString(rset0.getString("telno2"));
			rec.telno3 = Util.checkString(rset0.getString("telno3"));
			this.curcommlist.add(rec);
		}
	}

	public String curcommlistOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curcommlist.size();
		for(int i=0; i<size; i++){
			CO_L_ZIP_ALLCURCOMMLISTRecord rec = (CO_L_ZIP_ALLCURCOMMLISTRecord)curcommlist.get(i);
			
			
			String code = rec.zip;
			String name = rec.addr;
			
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
			CO_L_ZIP_ALLCURCOMMLISTRecord rec = (CO_L_ZIP_ALLCURCOMMLISTRecord)curcommlist.get(i);
			
			
			String code = rec.zip;
			String name = rec.addr;
			
			sb.append("<input name=\"");
			sb.append("zip");
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
			CO_L_ZIP_ALLCURCOMMLISTRecord rec = (CO_L_ZIP_ALLCURCOMMLISTRecord)curcommlist.get(i);
			
			
			String code = rec.zip;
			String name = rec.addr;
			
			sb.append("<input name=\"");
			sb.append("zip");
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
	CO_L_ZIP_ALLDataSet ds = (CO_L_ZIP_ALLDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curcommlist.size(); i++){
		CO_L_ZIP_ALLCURCOMMLISTRecord curcommlistRec = (CO_L_ZIP_ALLCURCOMMLISTRecord)ds.curcommlist.get(i);%>
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

<%= curcommlistRec.zip%>
<%= curcommlistRec.addr%>
<%= curcommlistRec.bgnn%>
<%= curcommlistRec.endn%>
<%= curcommlistRec.bocd%>
<%= curcommlistRec.bonm%>
<%= curcommlistRec.telno1%>
<%= curcommlistRec.telno2%>
<%= curcommlistRec.telno3%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Aug 27 11:53:48 KST 2009 */
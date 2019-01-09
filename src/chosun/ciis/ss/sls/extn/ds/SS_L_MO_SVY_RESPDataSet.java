/***************************************************************************************************
* 파일명 : SS_L_MO_SVY_RESPDataSet.java
* 기능 : 
* 작성일자 : 2015.12.07
* 작성자 : 장선희
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.ss.sls.extn.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.extn.dm.*;
import chosun.ciis.ss.sls.extn.rec.*;

/**
 * 
 */


public class SS_L_MO_SVY_RESPDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList resplist = new ArrayList();
	public String errcode;
	public String errmsg;

	public SS_L_MO_SVY_RESPDataSet(){}
	public SS_L_MO_SVY_RESPDataSet(String errcode, String errmsg){
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
			SS_L_MO_SVY_RESPRESPLISTRecord rec = new SS_L_MO_SVY_RESPRESPLISTRecord();
			rec.qstnum = Util.checkString(rset0.getString("qstnum"));
			rec.rdr_no = Util.checkString(rset0.getString("rdr_no"));
			rec.basicdt = Util.checkString(rset0.getString("basicdt"));
			rec.cont = Util.checkString(rset0.getString("cont"));
			rec.response = Util.checkString(rset0.getString("response"));
			rec.priority = Util.checkString(rset0.getString("priority"));
			rec.qstid = Util.checkString(rset0.getString("qstid"));
			this.resplist.add(rec);
		}
	}

	public String resplistOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = resplist.size();
		for(int i=0; i<size; i++){
			SS_L_MO_SVY_RESPRESPLISTRecord rec = (SS_L_MO_SVY_RESPRESPLISTRecord)resplist.get(i);
			
			
			String code = rec.qstnum;
			String name = rec.rdr_no;
			
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

	public String resplistChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = resplist.size();
		for(int i=0; i<size; i++){
			SS_L_MO_SVY_RESPRESPLISTRecord rec = (SS_L_MO_SVY_RESPRESPLISTRecord)resplist.get(i);
			
			
			String code = rec.qstnum;
			String name = rec.rdr_no;
			
			sb.append("<input name=\"");
			sb.append("qstnum");
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

	public String resplistRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = resplist.size();
		for(int i=0; i<size; i++){
			SS_L_MO_SVY_RESPRESPLISTRecord rec = (SS_L_MO_SVY_RESPRESPLISTRecord)resplist.get(i);
			
			
			String code = rec.qstnum;
			String name = rec.rdr_no;
			
			sb.append("<input name=\"");
			sb.append("qstnum");
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
	SS_L_MO_SVY_RESPDataSet ds = (SS_L_MO_SVY_RESPDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.resplist.size(); i++){
		SS_L_MO_SVY_RESPRESPLISTRecord resplistRec = (SS_L_MO_SVY_RESPRESPLISTRecord)ds.resplist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getResplist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= resplistRec.qstnum%>
<%= resplistRec.rdr_no%>
<%= resplistRec.basicdt%>
<%= resplistRec.cont%>
<%= resplistRec.response%>
<%= resplistRec.priority%>
<%= resplistRec.qstid%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Dec 07 10:23:11 KST 2015 */
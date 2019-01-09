/***************************************************************************************************
* 파일명 : .java
* 기능 : 확장현황/단체확장/사람찾기  
* 작성일자 : 2009-06-02
* 작성자 : 권정윤
***************************************************************************************************/


package chosun.ciis.ss.sls.extn.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.extn.dm.*;
import chosun.ciis.ss.sls.extn.rec.*;

/**
 * 확장현황/단체확장/사람찾기
 */

public class SS_L_EXTN_PATYDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList userlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public SS_L_EXTN_PATYDataSet(){}
	public SS_L_EXTN_PATYDataSet(String errcode, String errmsg){
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
			SS_L_EXTN_PATYUSERLISTRecord rec = new SS_L_EXTN_PATYUSERLISTRecord();
			rec.flnm = Util.checkString(rset0.getString("flnm"));
			rec.dept_cd = Util.checkString(rset0.getString("dept_cd"));
			rec.dept_nm = Util.checkString(rset0.getString("dept_nm"));
			rec.bank_nm = Util.checkString(rset0.getString("bank_nm"));
			rec.acct_no = Util.checkString(rset0.getString("acct_no"));
			this.userlist.add(rec);
		}
	}

	public String userlistOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = userlist.size();
		for(int i=0; i<size; i++){
			SS_L_EXTN_PATYUSERLISTRecord rec = (SS_L_EXTN_PATYUSERLISTRecord)userlist.get(i);
			
			
			String code = rec.flnm;
			String name = rec.dept_cd;
			
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

	public String userlistChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = userlist.size();
		for(int i=0; i<size; i++){
			SS_L_EXTN_PATYUSERLISTRecord rec = (SS_L_EXTN_PATYUSERLISTRecord)userlist.get(i);
			
			
			String code = rec.flnm;
			String name = rec.dept_cd;
			
			sb.append("<input name=\"");
			sb.append("flnm");
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

	public String userlistRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = userlist.size();
		for(int i=0; i<size; i++){
			SS_L_EXTN_PATYUSERLISTRecord rec = (SS_L_EXTN_PATYUSERLISTRecord)userlist.get(i);
			
			
			String code = rec.flnm;
			String name = rec.dept_cd;
			
			sb.append("<input name=\"");
			sb.append("flnm");
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
	SS_L_EXTN_PATYDataSet ds = (SS_L_EXTN_PATYDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.userlist.size(); i++){
		SS_L_EXTN_PATYUSERLISTRecord userlistRec = (SS_L_EXTN_PATYUSERLISTRecord)ds.userlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getUserlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= userlistRec.flnm%>
<%= userlistRec.dept_cd%>
<%= userlistRec.dept_nm%>
<%= userlistRec.bank_nm%>
<%= userlistRec.acct_no%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Jun 02 17:41:22 KST 2009 */
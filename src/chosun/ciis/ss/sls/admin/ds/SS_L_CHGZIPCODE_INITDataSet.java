/***************************************************************************************************
* 파일명 : .java
* 기능 : 관리자-담당별 우편번호 변경처리-초기화면
* 작성일자 : 2009-04-28
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
 * 관리자-담당별 우편번호 변경처리-초기화면
 */

public class SS_L_CHGZIPCODE_INITDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curdatelist = new ArrayList();
	public String errcode;
	public String errmsg;

	public SS_L_CHGZIPCODE_INITDataSet(){}
	public SS_L_CHGZIPCODE_INITDataSet(String errcode, String errmsg){
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
		ResultSet rset0 = (ResultSet) cstmt.getObject(3);
		while(rset0.next()){
			SS_L_CHGZIPCODE_INITCURDATELISTRecord rec = new SS_L_CHGZIPCODE_INITCURDATELISTRecord();
			rec.workver = Util.checkString(rset0.getString("workver"));
			rec.workvernm = Util.checkString(rset0.getString("workvernm"));
			this.curdatelist.add(rec);
		}
	}

	public String curdatelistOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curdatelist.size();
		for(int i=0; i<size; i++){
			SS_L_CHGZIPCODE_INITCURDATELISTRecord rec = (SS_L_CHGZIPCODE_INITCURDATELISTRecord)curdatelist.get(i);
			
			
			String code = rec.workver;
			String name = rec.workvernm;
			
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

	public String curdatelistChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curdatelist.size();
		for(int i=0; i<size; i++){
			SS_L_CHGZIPCODE_INITCURDATELISTRecord rec = (SS_L_CHGZIPCODE_INITCURDATELISTRecord)curdatelist.get(i);
			
			
			String code = rec.workver;
			String name = rec.workvernm;
			
			sb.append("<input name=\"");
			sb.append("workver");
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

	public String curdatelistRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curdatelist.size();
		for(int i=0; i<size; i++){
			SS_L_CHGZIPCODE_INITCURDATELISTRecord rec = (SS_L_CHGZIPCODE_INITCURDATELISTRecord)curdatelist.get(i);
			
			
			String code = rec.workver;
			String name = rec.workvernm;
			
			sb.append("<input name=\"");
			sb.append("workver");
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
	SS_L_CHGZIPCODE_INITDataSet ds = (SS_L_CHGZIPCODE_INITDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curdatelist.size(); i++){
		SS_L_CHGZIPCODE_INITCURDATELISTRecord curdatelistRec = (SS_L_CHGZIPCODE_INITCURDATELISTRecord)ds.curdatelist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurdatelist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curdatelistRec.workver%>
<%= curdatelistRec.workvernm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Apr 28 09:46:54 KST 2009 */
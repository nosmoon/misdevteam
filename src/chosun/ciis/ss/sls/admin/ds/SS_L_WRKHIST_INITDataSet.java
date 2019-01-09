/***************************************************************************************************
 * 파일명   : SP_SS_L_WRKHIST_INIT
 * 기능     : 관리자-작업-작업이력-초기화면
 * 작성일자 : 2007/05/18
 * 작성자   : 이혁
 **************************************************************************************************/
 


package chosun.ciis.ss.sls.admin.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.admin.dm.*;
import chosun.ciis.ss.sls.admin.rec.*;

/**
**  SP_SS_L_WRKHIST_INIT
**/

public class SS_L_WRKHIST_INITDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList wrklist = new ArrayList();
	public String errcode;
	public String errmsg;

	public SS_L_WRKHIST_INITDataSet(){}
	public SS_L_WRKHIST_INITDataSet(String errcode, String errmsg){
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
			SS_L_WRKHIST_INITWRKLISTRecord rec = new SS_L_WRKHIST_INITWRKLISTRecord();
			rec.id = Util.checkString(rset0.getString("id"));
			rec.descri = Util.checkString(rset0.getString("descri"));
			rec.cycl = Util.checkString(rset0.getString("cycl"));
			rec.pgmnm = Util.checkString(rset0.getString("pgmnm"));
			this.wrklist.add(rec);
		}
	}

	public String wrklistOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = wrklist.size();
		for(int i=0; i<size; i++){
			SS_L_WRKHIST_INITWRKLISTRecord rec = (SS_L_WRKHIST_INITWRKLISTRecord)wrklist.get(i);
			
			
			String code = rec.id;
			String name = rec.descri;
			
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

	public String wrklistChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = wrklist.size();
		for(int i=0; i<size; i++){
			SS_L_WRKHIST_INITWRKLISTRecord rec = (SS_L_WRKHIST_INITWRKLISTRecord)wrklist.get(i);
			
			
			String code = rec.id;
			String name = rec.descri;
			
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

	public String wrklistRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = wrklist.size();
		for(int i=0; i<size; i++){
			SS_L_WRKHIST_INITWRKLISTRecord rec = (SS_L_WRKHIST_INITWRKLISTRecord)wrklist.get(i);
			
			
			String code = rec.id;
			String name = rec.descri;
			
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
	SS_L_WRKHIST_INITDataSet ds = (SS_L_WRKHIST_INITDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.wrklist.size(); i++){
		SS_L_WRKHIST_INITWRKLISTRecord wrklistRec = (SS_L_WRKHIST_INITWRKLISTRecord)ds.wrklist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getWrklist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= wrklistRec.id%>
<%= wrklistRec.descri%>
<%= wrklistRec.cycl%>
<%= wrklistRec.pgmnm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri May 18 15:04:48 KST 2007 */
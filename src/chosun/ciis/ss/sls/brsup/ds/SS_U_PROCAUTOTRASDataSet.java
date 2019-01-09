/***************************************************************************************************
* 파일명 : .java
* 기능 : 판매지국-빌링 
* 작성일자 : 2009-08-28
* 작성자 : 권정윤
***************************************************************************************************/


package chosun.ciis.ss.sls.brsup.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.brsup.dm.*;
import chosun.ciis.ss.sls.brsup.rec.*;

/**
 * 판매지국-빌링  //
 */

public class SS_U_PROCAUTOTRASDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList allstr = new ArrayList();
	public String errcode;
	public String errmsg;

	public SS_U_PROCAUTOTRASDataSet(){}
	public SS_U_PROCAUTOTRASDataSet(String errcode, String errmsg){
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
			SS_U_PROCAUTOTRASALLSTRRecord rec = new SS_U_PROCAUTOTRASALLSTRRecord();
			rec.allstr = rset0.getString("allstr");
			rec.temp = rset0.getString("temp");
			this.allstr.add(rec);
		}
		rset0.close();
		cstmt.close();
	}

	public String allstrOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = allstr.size();
		for(int i=0; i<size; i++){
			SS_U_PROCAUTOTRASALLSTRRecord rec = (SS_U_PROCAUTOTRASALLSTRRecord)allstr.get(i);
			
			
			String code = rec.allstr;
			String name = rec.temp;
			
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

	public String allstrChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = allstr.size();
		for(int i=0; i<size; i++){
			SS_U_PROCAUTOTRASALLSTRRecord rec = (SS_U_PROCAUTOTRASALLSTRRecord)allstr.get(i);
			
			
			String code = rec.allstr;
			String name = rec.temp;
			
			sb.append("<input name=\"");
			sb.append("allstr");
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

	public String allstrRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = allstr.size();
		for(int i=0; i<size; i++){
			SS_U_PROCAUTOTRASALLSTRRecord rec = (SS_U_PROCAUTOTRASALLSTRRecord)allstr.get(i);
			
			
			String code = rec.allstr;
			String name = rec.temp;
			
			sb.append("<input name=\"");
			sb.append("allstr");
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
	SS_U_PROCAUTOTRASDataSet ds = (SS_U_PROCAUTOTRASDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.allstr.size(); i++){
		SS_U_PROCAUTOTRASALLSTRRecord allstrRec = (SS_U_PROCAUTOTRASALLSTRRecord)ds.allstr.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getAllstr()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= allstrRec.allstr%>
<%= allstrRec.temp%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Aug 28 22:09:53 KST 2009 */
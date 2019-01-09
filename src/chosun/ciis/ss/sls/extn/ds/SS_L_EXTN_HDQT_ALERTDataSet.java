/***************************************************************************************************
* 파일명 : .java
* 기능 : 확장현황-본사확장- 지역담당자 공지내용
* 작성일자 : 2009-06-09
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
 * 확장현황-본사확장- 지역담당자 공지내용  
 */

public class SS_L_EXTN_HDQT_ALERTDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList alonlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public SS_L_EXTN_HDQT_ALERTDataSet(){}
	public SS_L_EXTN_HDQT_ALERTDataSet(String errcode, String errmsg){
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
			SS_L_EXTN_HDQT_ALERTALONLISTRecord rec = new SS_L_EXTN_HDQT_ALERTALONLISTRecord();
			rec.bonm = Util.checkString(rset0.getString("bonm"));
			rec.count = Util.checkString(rset0.getString("count"));
			rec.sum = Util.checkString(rset0.getString("sum"));
			this.alonlist.add(rec);
		}
	}

	public String alonlistOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = alonlist.size();
		for(int i=0; i<size; i++){
			SS_L_EXTN_HDQT_ALERTALONLISTRecord rec = (SS_L_EXTN_HDQT_ALERTALONLISTRecord)alonlist.get(i);
			
			
			String code = rec.bonm;
			String name = rec.count;
			
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

	public String alonlistChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = alonlist.size();
		for(int i=0; i<size; i++){
			SS_L_EXTN_HDQT_ALERTALONLISTRecord rec = (SS_L_EXTN_HDQT_ALERTALONLISTRecord)alonlist.get(i);
			
			
			String code = rec.bonm;
			String name = rec.count;
			
			sb.append("<input name=\"");
			sb.append("bonm");
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

	public String alonlistRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = alonlist.size();
		for(int i=0; i<size; i++){
			SS_L_EXTN_HDQT_ALERTALONLISTRecord rec = (SS_L_EXTN_HDQT_ALERTALONLISTRecord)alonlist.get(i);
			
			
			String code = rec.bonm;
			String name = rec.count;
			
			sb.append("<input name=\"");
			sb.append("bonm");
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
	SS_L_EXTN_HDQT_ALERTDataSet ds = (SS_L_EXTN_HDQT_ALERTDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.alonlist.size(); i++){
		SS_L_EXTN_HDQT_ALERTALONLISTRecord alonlistRec = (SS_L_EXTN_HDQT_ALERTALONLISTRecord)ds.alonlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getAlonlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= alonlistRec.bonm%>
<%= alonlistRec.count%>
<%= alonlistRec.sum%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Jun 12 11:56:45 KST 2009 */
/***************************************************************************************************
* 파일명 : SS_S_INSRAPLCDataSet.java
* 기능 : 지국지원-상해보험-신규신청-상세목록을 위한 DataSet
* 작성일자 : 2004-02-19
* 작성자 : 김대섭
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/

package chosun.ciis.ss.sls.brsup.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.brsup.dm.*;
import chosun.ciis.ss.sls.brsup.rec.*;

/**
 * 지국지원-상해보험-신규신청-상세목록을 위한 DataSet
 */

public class SS_S_INSRAPLCDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curcommlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public SS_S_INSRAPLCDataSet(){}
	public SS_S_INSRAPLCDataSet(String errcode, String errmsg){
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
			SS_S_INSRAPLCCURCOMMLISTRecord rec = new SS_S_INSRAPLCCURCOMMLISTRecord();
			rec.flnm = Util.checkString(rset0.getString("flnm"));
			rec.prn = Util.checkString(rset0.getString("prn"));
			rec.dutynm = Util.checkString(rset0.getString("dutynm"));
			rec.insrnm = Util.checkString(rset0.getString("insrnm"));
			this.curcommlist.add(rec);
		}
	}

	public String curcommlistOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curcommlist.size();
		for(int i=0; i<size; i++){
			SS_S_INSRAPLCCURCOMMLISTRecord rec = (SS_S_INSRAPLCCURCOMMLISTRecord)curcommlist.get(i);
			
			
			String code = rec.flnm;
			String name = rec.prn;
			
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
			SS_S_INSRAPLCCURCOMMLISTRecord rec = (SS_S_INSRAPLCCURCOMMLISTRecord)curcommlist.get(i);
			
			
			String code = rec.flnm;
			String name = rec.prn;
			
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

	public String curcommlistRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curcommlist.size();
		for(int i=0; i<size; i++){
			SS_S_INSRAPLCCURCOMMLISTRecord rec = (SS_S_INSRAPLCCURCOMMLISTRecord)curcommlist.get(i);
			
			
			String code = rec.flnm;
			String name = rec.prn;
			
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
	SS_S_INSRAPLCDataSet ds = (SS_S_INSRAPLCDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curcommlist.size(); i++){
		SS_S_INSRAPLCCURCOMMLISTRecord curcommlistRec = (SS_S_INSRAPLCCURCOMMLISTRecord)ds.curcommlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurcommlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curcommlistRec.flnm%>
<%= curcommlistRec.prn%>
<%= curcommlistRec.dutynm%>
<%= curcommlistRec.insrnm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Feb 19 19:09:38 KST 2004 */
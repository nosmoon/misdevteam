/***************************************************************************************************
* 파일명 : SS_L_SHFTAPLC_INIT_TMDataSet.java
* 기능 : 상담원-자동이체관련-초기화면을 위한 DataSet
* 작성일자 : 2004-04-24
* 작성자 : 김대섭
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.ss.sls.cns.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.cns.dm.*;
import chosun.ciis.ss.sls.cns.rec.*;

/**
 * 상담원-자동이체관련-초기화면을 위한 DataSet
 */


public class SS_L_SHFTAPLC_INIT_TMDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curcardcd = new ArrayList();
	public ArrayList curbankcd = new ArrayList();
	public String errcode;
	public String errmsg;

	public SS_L_SHFTAPLC_INIT_TMDataSet(){}
	public SS_L_SHFTAPLC_INIT_TMDataSet(String errcode, String errmsg){
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
			SS_L_SHFTAPLC_INIT_TMCURBANKCDRecord rec = new SS_L_SHFTAPLC_INIT_TMCURBANKCDRecord();
			rec.cicodeval = Util.checkString(rset0.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset0.getString("cicdnm"));
			rec.ciymgbcd = Util.checkString(rset0.getString("ciymgbcd"));
			rec.cicdgb = Util.checkString(rset0.getString("cicdgb"));
			rec.cicdynm = Util.checkString(rset0.getString("cicdynm"));
			this.curbankcd.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(4);
		while(rset1.next()){
			SS_L_SHFTAPLC_INIT_TMCURCARDCDRecord rec = new SS_L_SHFTAPLC_INIT_TMCURCARDCDRecord();
			rec.cicodeval = Util.checkString(rset1.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset1.getString("cicdnm"));
			rec.ciymgbcd = Util.checkString(rset1.getString("ciymgbcd"));
			rec.cicdgb = Util.checkString(rset1.getString("cicdgb"));
			rec.cicdynm = Util.checkString(rset1.getString("cicdynm"));
			this.curcardcd.add(rec);
		}
	}

	public String curbankcdOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curbankcd.size();
		for(int i=0; i<size; i++){
			SS_L_SHFTAPLC_INIT_TMCURBANKCDRecord rec = (SS_L_SHFTAPLC_INIT_TMCURBANKCDRecord)curbankcd.get(i);
			
			
			String code = rec.cicodeval;
			String name = rec.cicdnm;
			
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

	public String curcardcdOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curcardcd.size();
		for(int i=0; i<size; i++){
			SS_L_SHFTAPLC_INIT_TMCURCARDCDRecord rec = (SS_L_SHFTAPLC_INIT_TMCURCARDCDRecord)curcardcd.get(i);
			
			
			String code = rec.cicodeval;
			String name = rec.cicdnm;
			
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

	public String curbankcdChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curbankcd.size();
		for(int i=0; i<size; i++){
			SS_L_SHFTAPLC_INIT_TMCURBANKCDRecord rec = (SS_L_SHFTAPLC_INIT_TMCURBANKCDRecord)curbankcd.get(i);
			
			
			String code = rec.cicodeval;
			String name = rec.cicdnm;
			
			sb.append("<input name=\"");
			sb.append("cicodeval");
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

	public String curcardcdChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curcardcd.size();
		for(int i=0; i<size; i++){
			SS_L_SHFTAPLC_INIT_TMCURCARDCDRecord rec = (SS_L_SHFTAPLC_INIT_TMCURCARDCDRecord)curcardcd.get(i);
			
			
			String code = rec.cicodeval;
			String name = rec.cicdnm;
			
			sb.append("<input name=\"");
			sb.append("cicodeval");
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

	public String curbankcdRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curbankcd.size();
		for(int i=0; i<size; i++){
			SS_L_SHFTAPLC_INIT_TMCURBANKCDRecord rec = (SS_L_SHFTAPLC_INIT_TMCURBANKCDRecord)curbankcd.get(i);
			
			
			String code = rec.cicodeval;
			String name = rec.cicdnm;
			
			sb.append("<input name=\"");
			sb.append("cicodeval");
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

	public String curcardcdRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curcardcd.size();
		for(int i=0; i<size; i++){
			SS_L_SHFTAPLC_INIT_TMCURCARDCDRecord rec = (SS_L_SHFTAPLC_INIT_TMCURCARDCDRecord)curcardcd.get(i);
			
			
			String code = rec.cicodeval;
			String name = rec.cicdnm;
			
			sb.append("<input name=\"");
			sb.append("cicodeval");
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
	SS_L_SHFTAPLC_INIT_TMDataSet ds = (SS_L_SHFTAPLC_INIT_TMDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curbankcd.size(); i++){
		SS_L_SHFTAPLC_INIT_TMCURBANKCDRecord curbankcdRec = (SS_L_SHFTAPLC_INIT_TMCURBANKCDRecord)ds.curbankcd.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curcardcd.size(); i++){
		SS_L_SHFTAPLC_INIT_TMCURCARDCDRecord curcardcdRec = (SS_L_SHFTAPLC_INIT_TMCURCARDCDRecord)ds.curcardcd.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurbankcd()%>
<%= ds.getCurcardcd()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curbankcdRec.cicodeval%>
<%= curbankcdRec.cicdnm%>
<%= curbankcdRec.ciymgbcd%>
<%= curbankcdRec.cicdgb%>
<%= curbankcdRec.cicdynm%>
<%= curcardcdRec.cicodeval%>
<%= curcardcdRec.cicdnm%>
<%= curcardcdRec.ciymgbcd%>
<%= curcardcdRec.cicdgb%>
<%= curcardcdRec.cicdynm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Jul 16 20:50:05 KST 2004 */
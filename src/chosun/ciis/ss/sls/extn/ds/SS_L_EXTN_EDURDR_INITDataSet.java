/***************************************************************************************************
* 파일명 : .java
* 기능 : 에듀/제휴 확장 독자 등록 초기화면(팝업) 
* 작성일자 : 2009-05-26
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
 * 에듀/제휴 확장 독자 등록 초기화면(팝업) 
 */

public class SS_L_EXTN_EDURDR_INITDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curmedicd = new ArrayList();
	public ArrayList curinstcd = new ArrayList();
	public String errcode;
	public String errmsg;

	public SS_L_EXTN_EDURDR_INITDataSet(){}
	public SS_L_EXTN_EDURDR_INITDataSet(String errcode, String errmsg){
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
			SS_L_EXTN_EDURDR_INITCURINSTCDRecord rec = new SS_L_EXTN_EDURDR_INITCURINSTCDRecord();
			rec.insttcd = Util.checkString(rset0.getString("insttcd"));
			rec.insttnm = Util.checkString(rset0.getString("insttnm"));
			this.curinstcd.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(4);
		while(rset1.next()){
			SS_L_EXTN_EDURDR_INITCURMEDICDRecord rec = new SS_L_EXTN_EDURDR_INITCURMEDICDRecord();
			rec.cicodeval = Util.checkString(rset1.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset1.getString("cicdnm"));
			rec.ciymgbcd = Util.checkString(rset1.getString("ciymgbcd"));
			rec.cicdgb = Util.checkString(rset1.getString("cicdgb"));
			rec.cicdynm = Util.checkString(rset1.getString("cicdynm"));
			this.curmedicd.add(rec);
		}
	}

	public String curinstcdOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curinstcd.size();
		for(int i=0; i<size; i++){
			SS_L_EXTN_EDURDR_INITCURINSTCDRecord rec = (SS_L_EXTN_EDURDR_INITCURINSTCDRecord)curinstcd.get(i);
			
			
			String code = rec.insttcd;
			String name = rec.insttnm;
			
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

	public String curmedicdOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curmedicd.size();
		for(int i=0; i<size; i++){
			SS_L_EXTN_EDURDR_INITCURMEDICDRecord rec = (SS_L_EXTN_EDURDR_INITCURMEDICDRecord)curmedicd.get(i);
			
			
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

	public String curinstcdChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curinstcd.size();
		for(int i=0; i<size; i++){
			SS_L_EXTN_EDURDR_INITCURINSTCDRecord rec = (SS_L_EXTN_EDURDR_INITCURINSTCDRecord)curinstcd.get(i);
			
			
			String code = rec.insttcd;
			String name = rec.insttnm;
			
			sb.append("<input name=\"");
			sb.append("insttcd");
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

	public String curmedicdChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curmedicd.size();
		for(int i=0; i<size; i++){
			SS_L_EXTN_EDURDR_INITCURMEDICDRecord rec = (SS_L_EXTN_EDURDR_INITCURMEDICDRecord)curmedicd.get(i);
			
			
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

	public String curinstcdRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curinstcd.size();
		for(int i=0; i<size; i++){
			SS_L_EXTN_EDURDR_INITCURINSTCDRecord rec = (SS_L_EXTN_EDURDR_INITCURINSTCDRecord)curinstcd.get(i);
			
			
			String code = rec.insttcd;
			String name = rec.insttnm;
			
			sb.append("<input name=\"");
			sb.append("insttcd");
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

	public String curmedicdRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curmedicd.size();
		for(int i=0; i<size; i++){
			SS_L_EXTN_EDURDR_INITCURMEDICDRecord rec = (SS_L_EXTN_EDURDR_INITCURMEDICDRecord)curmedicd.get(i);
			
			
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
	SS_L_EXTN_EDURDR_INITDataSet ds = (SS_L_EXTN_EDURDR_INITDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curinstcd.size(); i++){
		SS_L_EXTN_EDURDR_INITCURINSTCDRecord curinstcdRec = (SS_L_EXTN_EDURDR_INITCURINSTCDRecord)ds.curinstcd.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curmedicd.size(); i++){
		SS_L_EXTN_EDURDR_INITCURMEDICDRecord curmedicdRec = (SS_L_EXTN_EDURDR_INITCURMEDICDRecord)ds.curmedicd.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurinstcd()%>
<%= ds.getCurmedicd()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curinstcdRec.insttcd%>
<%= curinstcdRec.insttnm%>
<%= curmedicdRec.cicodeval%>
<%= curmedicdRec.cicdnm%>
<%= curmedicdRec.ciymgbcd%>
<%= curmedicdRec.cicdgb%>
<%= curmedicdRec.cicdynm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu May 28 14:40:01 KST 2009 */
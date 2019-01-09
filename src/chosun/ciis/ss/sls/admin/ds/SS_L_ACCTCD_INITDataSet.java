/***************************************************************************************************
* 파일명 : SS_L_ACCTCD_INITDataSet.java
* 기능 : 관리자-계정코드-초기화면을 위한 DataSet
* 작성일자 : 2004-04-24
* 작성자 : 김대섭
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.ss.sls.admin.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.admin.dm.*;
import chosun.ciis.ss.sls.admin.rec.*;

/**
 * 관리자-계정코드-초기화면을 위한 DataSet
 */


public class SS_L_ACCTCD_INITDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList imptexpnclsfcur = new ArrayList();
	public String errcode;
	public String errmsg;

	public SS_L_ACCTCD_INITDataSet(){}
	public SS_L_ACCTCD_INITDataSet(String errcode, String errmsg){
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
			SS_L_ACCTCD_INITIMPTEXPNCLSFCURRecord rec = new SS_L_ACCTCD_INITIMPTEXPNCLSFCURRecord();
			rec.cicodeval = Util.checkString(rset0.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset0.getString("cicdnm"));
			rec.ciymgbcd = Util.checkString(rset0.getString("ciymgbcd"));
			rec.cicdgb = Util.checkString(rset0.getString("cicdgb"));
			rec.cicdynm = Util.checkString(rset0.getString("cicdynm"));
			this.imptexpnclsfcur.add(rec);
		}
	}

	public String imptexpnclsfcurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = imptexpnclsfcur.size();
		for(int i=0; i<size; i++){
			SS_L_ACCTCD_INITIMPTEXPNCLSFCURRecord rec = (SS_L_ACCTCD_INITIMPTEXPNCLSFCURRecord)imptexpnclsfcur.get(i);
			
			
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

	public String imptexpnclsfcurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = imptexpnclsfcur.size();
		for(int i=0; i<size; i++){
			SS_L_ACCTCD_INITIMPTEXPNCLSFCURRecord rec = (SS_L_ACCTCD_INITIMPTEXPNCLSFCURRecord)imptexpnclsfcur.get(i);
			
			
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

	public String imptexpnclsfcurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = imptexpnclsfcur.size();
		for(int i=0; i<size; i++){
			SS_L_ACCTCD_INITIMPTEXPNCLSFCURRecord rec = (SS_L_ACCTCD_INITIMPTEXPNCLSFCURRecord)imptexpnclsfcur.get(i);
			
			
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
	SS_L_ACCTCD_INITDataSet ds = (SS_L_ACCTCD_INITDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.imptexpnclsfcur.size(); i++){
		SS_L_ACCTCD_INITIMPTEXPNCLSFCURRecord imptexpnclsfcurRec = (SS_L_ACCTCD_INITIMPTEXPNCLSFCURRecord)ds.imptexpnclsfcur.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getImptexpnclsfcur()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= imptexpnclsfcurRec.cicodeval%>
<%= imptexpnclsfcurRec.cicdnm%>
<%= imptexpnclsfcurRec.ciymgbcd%>
<%= imptexpnclsfcurRec.cicdgb%>
<%= imptexpnclsfcurRec.cicdynm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Sat Jul 03 17:12:04 KST 2004 */
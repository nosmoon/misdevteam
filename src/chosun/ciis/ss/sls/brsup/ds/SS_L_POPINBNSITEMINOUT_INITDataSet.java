/***************************************************************************************************
* 파일명 : .java
* 기능 : 통합정보지원시스템-판촉물재고현황-조회화면-입고추가 팝업
* 작성일자 : 2009-05-06
* 작성자 : 김용욱
***************************************************************************************************/


package chosun.ciis.ss.sls.brsup.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.brsup.dm.*;
import chosun.ciis.ss.sls.brsup.rec.*;

/**
 * 통합정보지원시스템-판촉물재고현황-조회화면-입고추가 팝업
 */

public class SS_L_POPINBNSITEMINOUT_INITDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList popinlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public SS_L_POPINBNSITEMINOUT_INITDataSet(){}
	public SS_L_POPINBNSITEMINOUT_INITDataSet(String errcode, String errmsg){
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
			SS_L_POPINBNSITEMINOUT_INITPOPINLISTRecord rec = new SS_L_POPINBNSITEMINOUT_INITPOPINLISTRecord();
			rec.cicdnm = Util.checkString(rset0.getString("cicdnm"));
			rec.cicodeval = Util.checkString(rset0.getString("cicodeval"));
			this.popinlist.add(rec);
		}
	}

	public String popinlistOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = popinlist.size();
		for(int i=0; i<size; i++){
			SS_L_POPINBNSITEMINOUT_INITPOPINLISTRecord rec = (SS_L_POPINBNSITEMINOUT_INITPOPINLISTRecord)popinlist.get(i);
			
			
			String code = rec.cicdnm;
			String name = rec.cicodeval;
			
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

	public String popinlistChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = popinlist.size();
		for(int i=0; i<size; i++){
			SS_L_POPINBNSITEMINOUT_INITPOPINLISTRecord rec = (SS_L_POPINBNSITEMINOUT_INITPOPINLISTRecord)popinlist.get(i);
			
			
			String code = rec.cicdnm;
			String name = rec.cicodeval;
			
			sb.append("<input name=\"");
			sb.append("cicdnm");
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

	public String popinlistRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = popinlist.size();
		for(int i=0; i<size; i++){
			SS_L_POPINBNSITEMINOUT_INITPOPINLISTRecord rec = (SS_L_POPINBNSITEMINOUT_INITPOPINLISTRecord)popinlist.get(i);
			
			
			String code = rec.cicdnm;
			String name = rec.cicodeval;
			
			sb.append("<input name=\"");
			sb.append("cicdnm");
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
	SS_L_POPINBNSITEMINOUT_INITDataSet ds = (SS_L_POPINBNSITEMINOUT_INITDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.popinlist.size(); i++){
		SS_L_POPINBNSITEMINOUT_INITPOPINLISTRecord popinlistRec = (SS_L_POPINBNSITEMINOUT_INITPOPINLISTRecord)ds.popinlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getPopinlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= popinlistRec.cicdnm%>
<%= popinlistRec.cicodeval%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed May 06 13:36:24 PDT 2009 */
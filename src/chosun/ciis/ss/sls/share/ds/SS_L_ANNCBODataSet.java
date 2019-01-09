/***************************************************************************************************
* 파일명 : .java
* 기능 : 정보공유-실시간공지-지국공지 리스트(조회)
* 작성일자 : 2009-04-16
* 작성자 : 권정윤
***************************************************************************************************/


package chosun.ciis.ss.sls.share.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.share.dm.*;
import chosun.ciis.ss.sls.share.rec.*;

/**
 * 정보공유-실시간공지-지국공지 리스트(조회)
 */

public class SS_L_ANNCBODataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList anncbolist = new ArrayList();
	public String errcode;
	public String errmsg;

	public SS_L_ANNCBODataSet(){}
	public SS_L_ANNCBODataSet(String errcode, String errmsg){
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
		ResultSet rset0 = (ResultSet) cstmt.getObject(13);
		while(rset0.next()){
			SS_L_ANNCBOANNCBOLISTRecord rec = new SS_L_ANNCBOANNCBOLISTRecord();
			rec.seq = rset0.getInt("seq");
			rec.makepersid = Util.checkString(rset0.getString("makepersid"));
			rec.makepersnm = Util.checkString(rset0.getString("makepersnm"));
			rec.posicd = Util.checkString(rset0.getString("posicd"));
			rec.posinm = Util.checkString(rset0.getString("posinm"));
			rec.deptcd = Util.checkString(rset0.getString("deptcd"));
			rec.deptnm = Util.checkString(rset0.getString("deptnm"));
			rec.rmsgclsf = Util.checkString(rset0.getString("rmsgclsf"));
			rec.rmsgdept = Util.checkString(rset0.getString("rmsgdept"));
			rec.rmsgdeptnm = Util.checkString(rset0.getString("rmsgdeptnm"));
			rec.rmsgarea = Util.checkString(rset0.getString("rmsgarea"));
			rec.rmsgareanm = Util.checkString(rset0.getString("rmsgareanm"));
			rec.anncbgntm = Util.checkString(rset0.getString("anncbgntm"));
			rec.anncendtm = Util.checkString(rset0.getString("anncendtm"));
			rec.annctitl = Util.checkString(rset0.getString("annctitl"));
			rec.annccont = Util.checkString(rset0.getString("annccont"));
			rec.incmgpers = Util.checkString(rset0.getString("incmgpers"));
			rec.incmgdt = Util.checkString(rset0.getString("incmgdt"));
			rec.chgpers = Util.checkString(rset0.getString("chgpers"));
			rec.chgdt = Util.checkString(rset0.getString("chgdt"));
			this.anncbolist.add(rec);
		}
	}

	public String anncbolistOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = anncbolist.size();
		for(int i=0; i<size; i++){
			SS_L_ANNCBOANNCBOLISTRecord rec = (SS_L_ANNCBOANNCBOLISTRecord)anncbolist.get(i);
			
			
			String code = Integer.toString(rec.seq);
			String name = rec.makepersid;
			
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

	public String anncbolistChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = anncbolist.size();
		for(int i=0; i<size; i++){
			SS_L_ANNCBOANNCBOLISTRecord rec = (SS_L_ANNCBOANNCBOLISTRecord)anncbolist.get(i);
			
			
			String code = Integer.toString(rec.seq);
			String name = rec.makepersid;
			
			sb.append("<input name=\"");
			sb.append("seq");
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

	public String anncbolistRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = anncbolist.size();
		for(int i=0; i<size; i++){
			SS_L_ANNCBOANNCBOLISTRecord rec = (SS_L_ANNCBOANNCBOLISTRecord)anncbolist.get(i);
			
			
			String code = Integer.toString(rec.seq);
			String name = rec.makepersid;
			
			sb.append("<input name=\"");
			sb.append("seq");
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
	SS_L_ANNCBODataSet ds = (SS_L_ANNCBODataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.anncbolist.size(); i++){
		SS_L_ANNCBOANNCBOLISTRecord anncbolistRec = (SS_L_ANNCBOANNCBOLISTRecord)ds.anncbolist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getAnncbolist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= anncbolistRec.seq%>
<%= anncbolistRec.makepersid%>
<%= anncbolistRec.makepersnm%>
<%= anncbolistRec.posicd%>
<%= anncbolistRec.posinm%>
<%= anncbolistRec.deptcd%>
<%= anncbolistRec.deptnm%>
<%= anncbolistRec.rmsgclsf%>
<%= anncbolistRec.rmsgdept%>
<%= anncbolistRec.rmsgdeptnm%>
<%= anncbolistRec.rmsgarea%>
<%= anncbolistRec.rmsgareanm%>
<%= anncbolistRec.anncbgntm%>
<%= anncbolistRec.anncendtm%>
<%= anncbolistRec.annctitl%>
<%= anncbolistRec.annccont%>
<%= anncbolistRec.incmgpers%>
<%= anncbolistRec.incmgdt%>
<%= anncbolistRec.chgpers%>
<%= anncbolistRec.chgdt%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Apr 16 19:59:05 KST 2009 */
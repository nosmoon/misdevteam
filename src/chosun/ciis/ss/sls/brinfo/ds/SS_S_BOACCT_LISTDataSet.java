/***************************************************************************************************
* 파일명 : 
* 기능 : 
* 작성일자 : 2015-09-30
* 작성자 : 장 선 희 
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 : 
* 수정자 :  
* 수정일자 : 
* 백업 : 
***************************************************************************************************/


package chosun.ciis.ss.sls.brinfo.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.brinfo.dm.*;
import chosun.ciis.ss.sls.brinfo.rec.*;

/**
 * 
 */


public class SS_S_BOACCT_LISTDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList histlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public SS_S_BOACCT_LISTDataSet(){}
	public SS_S_BOACCT_LISTDataSet(String errcode, String errmsg){
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
		ResultSet rset0 = (ResultSet) cstmt.getObject(4);
		while(rset0.next()){
			SS_S_BOACCT_LISTHISTLISTRecord rec = new SS_S_BOACCT_LISTHISTLISTRecord();
			rec.bocd = Util.checkString(rset0.getString("bocd"));
			rec.deptnm = Util.checkString(rset0.getString("deptnm"));
			rec.areanm = Util.checkString(rset0.getString("areanm"));
			rec.bonm = Util.checkString(rset0.getString("bonm"));
			rec.seq = Util.checkString(rset0.getString("seq"));
			rec.acctitem = Util.checkString(rset0.getString("acctitem"));
			rec.acctitem_nm = Util.checkString(rset0.getString("acctitem_nm"));
			rec.depskind = Util.checkString(rset0.getString("depskind"));
			rec.bankcd = Util.checkString(rset0.getString("bankcd"));
			rec.bankcd_nm = Util.checkString(rset0.getString("bankcd_nm"));
			rec.deps_persnm = Util.checkString(rset0.getString("deps_persnm"));
			rec.acctno = Util.checkString(rset0.getString("acctno"));
			rec.remk = Util.checkString(rset0.getString("remk"));
			rec.incmgpers = Util.checkString(rset0.getString("incmgpers"));
			rec.incmgdt = Util.checkString(rset0.getString("incmgdt"));
			rec.chgpers = Util.checkString(rset0.getString("chgpers"));
			rec.chgdt = Util.checkString(rset0.getString("chgdt"));
			rec.girono = Util.checkString(rset0.getString("girono"));
			rec.chgno = Util.checkString(rset0.getString("chgno"));
			rec.delyn = Util.checkString(rset0.getString("delyn"));
			this.histlist.add(rec);
		}
	}

	public String histlistOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = histlist.size();
		for(int i=0; i<size; i++){
			SS_S_BOACCT_LISTHISTLISTRecord rec = (SS_S_BOACCT_LISTHISTLISTRecord)histlist.get(i);
			
			
			String code = rec.bocd;
			String name = rec.deptnm;
			
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

	public String histlistChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = histlist.size();
		for(int i=0; i<size; i++){
			SS_S_BOACCT_LISTHISTLISTRecord rec = (SS_S_BOACCT_LISTHISTLISTRecord)histlist.get(i);
			
			
			String code = rec.bocd;
			String name = rec.deptnm;
			
			sb.append("<input name=\"");
			sb.append("bocd");
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

	public String histlistRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = histlist.size();
		for(int i=0; i<size; i++){
			SS_S_BOACCT_LISTHISTLISTRecord rec = (SS_S_BOACCT_LISTHISTLISTRecord)histlist.get(i);
			
			
			String code = rec.bocd;
			String name = rec.deptnm;
			
			sb.append("<input name=\"");
			sb.append("bocd");
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
	SS_S_BOACCT_LISTDataSet ds = (SS_S_BOACCT_LISTDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.histlist.size(); i++){
		SS_S_BOACCT_LISTHISTLISTRecord histlistRec = (SS_S_BOACCT_LISTHISTLISTRecord)ds.histlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getHistlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= histlistRec.bocd%>
<%= histlistRec.deptnm%>
<%= histlistRec.areanm%>
<%= histlistRec.bonm%>
<%= histlistRec.seq%>
<%= histlistRec.acctitem%>
<%= histlistRec.acctitem_nm%>
<%= histlistRec.depskind%>
<%= histlistRec.bankcd%>
<%= histlistRec.bankcd_nm%>
<%= histlistRec.deps_persnm%>
<%= histlistRec.acctno%>
<%= histlistRec.remk%>
<%= histlistRec.incmgpers%>
<%= histlistRec.incmgdt%>
<%= histlistRec.chgpers%>
<%= histlistRec.chgdt%>
<%= histlistRec.girono%>
<%= histlistRec.chgno%>
<%= histlistRec.delyn%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Sep 30 18:04:36 KST 2015 */
/***************************************************************************************************
 * 파일명   : SP_SS_L_WEEKSND_CLOS_PRINT
 * 기능     : 지국지원-주간조선관리-송금목록 엑셀저장 
 * 작성일자 : 2007/05/14
 * 작성자   : 이혁
 **************************************************************************************************/
 


package chosun.ciis.ss.sls.brsup.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.brsup.dm.*;
import chosun.ciis.ss.sls.brsup.rec.*;

/**
**  SP_SS_L_WEEKSND_CLOS_PRINT
**/

public class SS_L_WEEKSND_CLOS_PRINTDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList rsltcur = new ArrayList();
	public String errcode;
	public String errmsg;

	public SS_L_WEEKSND_CLOS_PRINTDataSet(){}
	public SS_L_WEEKSND_CLOS_PRINTDataSet(String errcode, String errmsg){
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
			SS_L_WEEKSND_CLOS_PRINTRSLTCURRecord rec = new SS_L_WEEKSND_CLOS_PRINTRSLTCURRecord();
			rec.banknm = Util.checkString(rset0.getString("banknm"));
			rec.bankcd = Util.checkString(rset0.getString("bankcd"));
			rec.acctno = Util.checkString(rset0.getString("acctno"));
			rec.deps_persnm = Util.checkString(rset0.getString("deps_persnm"));
			rec.bonm = Util.checkString(rset0.getString("bonm"));
			rec.bocd = Util.checkString(rset0.getString("bocd"));
			rec.deptnm = Util.checkString(rset0.getString("deptnm"));
			rec.areanm = Util.checkString(rset0.getString("areanm"));
			rec.totcnt = rset0.getInt("totcnt");
			rec.dlvamt = rset0.getInt("dlvamt");
			this.rsltcur.add(rec);
		}
	}

	public String rsltcurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = rsltcur.size();
		for(int i=0; i<size; i++){
			SS_L_WEEKSND_CLOS_PRINTRSLTCURRecord rec = (SS_L_WEEKSND_CLOS_PRINTRSLTCURRecord)rsltcur.get(i);
			
			
			String code = rec.banknm;
			String name = rec.bankcd;
			
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

	public String rsltcurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = rsltcur.size();
		for(int i=0; i<size; i++){
			SS_L_WEEKSND_CLOS_PRINTRSLTCURRecord rec = (SS_L_WEEKSND_CLOS_PRINTRSLTCURRecord)rsltcur.get(i);
			
			
			String code = rec.banknm;
			String name = rec.bankcd;
			
			sb.append("<input name=\"");
			sb.append("banknm");
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

	public String rsltcurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = rsltcur.size();
		for(int i=0; i<size; i++){
			SS_L_WEEKSND_CLOS_PRINTRSLTCURRecord rec = (SS_L_WEEKSND_CLOS_PRINTRSLTCURRecord)rsltcur.get(i);
			
			
			String code = rec.banknm;
			String name = rec.bankcd;
			
			sb.append("<input name=\"");
			sb.append("banknm");
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
	SS_L_WEEKSND_CLOS_PRINTDataSet ds = (SS_L_WEEKSND_CLOS_PRINTDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.rsltcur.size(); i++){
		SS_L_WEEKSND_CLOS_PRINTRSLTCURRecord rsltcurRec = (SS_L_WEEKSND_CLOS_PRINTRSLTCURRecord)ds.rsltcur.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getRsltcur()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= rsltcurRec.banknm%>
<%= rsltcurRec.bankcd%>
<%= rsltcurRec.acctno%>
<%= rsltcurRec.deps_persnm%>
<%= rsltcurRec.bonm%>
<%= rsltcurRec.bocd%>
<%= rsltcurRec.deptnm%>
<%= rsltcurRec.areanm%>
<%= rsltcurRec.totcnt%>
<%= rsltcurRec.dlvamt%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed May 16 11:16:39 KST 2007 */
/***************************************************************************************************
* 파일명 : SS_L_SHFT_PYMTDataSet.java
* 기능 : 지국업무지원-Billing자동이체-납부자관리-납부자목록
* 작성일자 : 2004-04-01
* 작성자 : 김상열
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
 * 지국업무지원-Billing자동이체-납부자관리-납부자목록
 *
 */


public class SS_L_SHFT_PYMTDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList rsltcur = new ArrayList();
	public String errcode;
	public String errmsg;

	public SS_L_SHFT_PYMTDataSet(){}
	public SS_L_SHFT_PYMTDataSet(String errcode, String errmsg){
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
			SS_L_SHFT_PYMTRSLTCURRecord rec = new SS_L_SHFT_PYMTRSLTCURRecord();
			rec.pymtseq = Util.checkString(rset0.getString("pymtseq"));
			rec.shftclsf = Util.checkString(rset0.getString("shftclsf"));
			rec.shftclsfnm = Util.checkString(rset0.getString("shftclsfnm"));
			rec.prn = Util.checkString(rset0.getString("prn"));
			rec.pymtnm = Util.checkString(rset0.getString("pymtnm"));
			rec.acctno = Util.checkString(rset0.getString("acctno"));
			rec.cardno = Util.checkString(rset0.getString("cardno"));
			rec.cnfm = Util.checkString(rset0.getString("cnfm"));
			this.rsltcur.add(rec);
		}
	}

	public String rsltcurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = rsltcur.size();
		for(int i=0; i<size; i++){
			SS_L_SHFT_PYMTRSLTCURRecord rec = (SS_L_SHFT_PYMTRSLTCURRecord)rsltcur.get(i);


			String code = rec.pymtseq;
			String name = rec.shftclsf;

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
			SS_L_SHFT_PYMTRSLTCURRecord rec = (SS_L_SHFT_PYMTRSLTCURRecord)rsltcur.get(i);


			String code = rec.pymtseq;
			String name = rec.shftclsf;

			sb.append("<input name=\"");
			sb.append("pymtseq");
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
			SS_L_SHFT_PYMTRSLTCURRecord rec = (SS_L_SHFT_PYMTRSLTCURRecord)rsltcur.get(i);


			String code = rec.pymtseq;
			String name = rec.shftclsf;

			sb.append("<input name=\"");
			sb.append("pymtseq");
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
	SS_L_SHFT_PYMTDataSet ds = (SS_L_SHFT_PYMTDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.rsltcur.size(); i++){
		SS_L_SHFT_PYMTRSLTCURRecord rsltcurRec = (SS_L_SHFT_PYMTRSLTCURRecord)ds.rsltcur.get(i);%>
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

<%= rsltcurRec.pymtseq%>
<%= rsltcurRec.shftclsf%>
<%= rsltcurRec.shftclsfnm%>
<%= rsltcurRec.prn%>
<%= rsltcurRec.pymtnm%>
<%= rsltcurRec.acctno%>
<%= rsltcurRec.cardno%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Apr 09 13:58:55 KST 2004 */
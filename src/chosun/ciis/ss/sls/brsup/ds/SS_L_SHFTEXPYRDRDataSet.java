/***************************************************************************************************
* 파일명 : .java
* 기능 : 지국업무지원-Billing자동이체-해지독자-목록조회
* 작성일자 : 2005-01-14
* 작성자 : 김영윤
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
 * 지국업무지원-Billing자동이체-해지독자-목록조회
 */


public class SS_L_SHFTEXPYRDRDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList rsltcur = new ArrayList();
	public String errcode;
	public String errmsg;
	public long totalcnt;

	public SS_L_SHFTEXPYRDRDataSet(){}
	public SS_L_SHFTEXPYRDRDataSet(String errcode, String errmsg, long totalcnt){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.totalcnt = totalcnt;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setTotalcnt(long totalcnt){
		this.totalcnt = totalcnt;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public long getTotalcnt(){
		return this.totalcnt;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){			return;		}
		this.totalcnt = cstmt.getLong(12);
		ResultSet rset0 = (ResultSet) cstmt.getObject(13);
		while(rset0.next()){
			SS_L_SHFTEXPYRDRRSLTCURRecord rec = new SS_L_SHFTEXPYRDRRSLTCURRecord();
			rec.areanm = Util.checkString(rset0.getString("areanm"));
			rec.bonm = Util.checkString(rset0.getString("bonm"));
			rec.rdrnm = Util.checkString(rset0.getString("rdrnm"));
			rec.medinm = Util.checkString(rset0.getString("medinm"));
			rec.pymtnm = Util.checkString(rset0.getString("pymtnm"));
			rec.prn = Util.checkString(rset0.getString("prn"));
			rec.acctno = Util.checkString(rset0.getString("acctno"));
			rec.rdrtel_no = Util.checkString(rset0.getString("rdrtel_no"));
			rec.pymttel_no = Util.checkString(rset0.getString("pymttel_no"));
			rec.rdraddr = Util.checkString(rset0.getString("rdraddr"));
			rec.aplcdt = Util.checkString(rset0.getString("aplcdt"));
			rec.expydt = Util.checkString(rset0.getString("expydt"));
			rec.expystat = Util.checkString(rset0.getString("expystat"));
			rec.shftclsf = Util.checkString(rset0.getString("shftclsf"));
			this.rsltcur.add(rec);
		}
	}

	public String rsltcurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = rsltcur.size();
		for(int i=0; i<size; i++){
			SS_L_SHFTEXPYRDRRSLTCURRecord rec = (SS_L_SHFTEXPYRDRRSLTCURRecord)rsltcur.get(i);


			String code = rec.areanm;
			String name = rec.bonm;

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
			SS_L_SHFTEXPYRDRRSLTCURRecord rec = (SS_L_SHFTEXPYRDRRSLTCURRecord)rsltcur.get(i);


			String code = rec.areanm;
			String name = rec.bonm;

			sb.append("<input name=\"");
			sb.append("areanm");
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
			SS_L_SHFTEXPYRDRRSLTCURRecord rec = (SS_L_SHFTEXPYRDRRSLTCURRecord)rsltcur.get(i);


			String code = rec.areanm;
			String name = rec.bonm;

			sb.append("<input name=\"");
			sb.append("areanm");
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
	SS_L_SHFTEXPYRDRDataSet ds = (SS_L_SHFTEXPYRDRDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.rsltcur.size(); i++){
		SS_L_SHFTEXPYRDRRSLTCURRecord rsltcurRec = (SS_L_SHFTEXPYRDRRSLTCURRecord)ds.rsltcur.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getTotalcnt()%>
<%= ds.getRsltcur()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= rsltcurRec.areanm%>
<%= rsltcurRec.bonm%>
<%= rsltcurRec.rdrnm%>
<%= rsltcurRec.medinm%>
<%= rsltcurRec.pymtnm%>
<%= rsltcurRec.prn%>
<%= rsltcurRec.acctno%>
<%= rsltcurRec.rdrtel_no%>
<%= rsltcurRec.pymttel_no%>
<%= rsltcurRec.rdraddr%>
<%= rsltcurRec.aplcdt%>
<%= rsltcurRec.expydt%>
<%= rsltcurRec.expystat%>
<%= rsltcurRec.shftclsf%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Jan 14 19:21:56 KST 2005 */

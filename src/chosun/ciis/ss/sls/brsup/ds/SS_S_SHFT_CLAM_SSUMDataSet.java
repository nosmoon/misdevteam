/***************************************************************************************************
 * 파일명   : aaaa.java
 * 기능     : 지국업무지원-Billing자동이체-청구관리-이체구분별 청구목록
 * 작성일자 : 2004/04/16
 * 작성자   : 김상열
 **************************************************************************************************/
 /**************************************************************************************************
 * 수정내역 : 이체방법별 지국수 가져오도록 수정
 * 수정자   : 이혁
 * 수정일자 : 2005-03-28
 * 백업     :
 **************************************************************************************************/


package chosun.ciis.ss.sls.brsup.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.brsup.dm.*;
import chosun.ciis.ss.sls.brsup.rec.*;

/**
 * 지국업무지원-Billing자동이체-청구관리-이체구분별 청구목록
 */

public class SS_S_SHFT_CLAM_SSUMDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList rsltcur = new ArrayList();
	public String errcode;
	public String errmsg;

	public SS_S_SHFT_CLAM_SSUMDataSet(){}
	public SS_S_SHFT_CLAM_SSUMDataSet(String errcode, String errmsg){
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
			SS_S_SHFT_CLAM_SSUMRSLTCURRecord rec = new SS_S_SHFT_CLAM_SSUMRSLTCURRecord();
			rec.basidt = Util.checkString(rset0.getString("basidt"));
			rec.pymtdt = Util.checkString(rset0.getString("pymtdt"));
			rec.shftclsfcd = Util.checkString(rset0.getString("shftclsfcd"));
			rec.shftclsfnm = Util.checkString(rset0.getString("shftclsfnm"));
			rec.clamnoit = rset0.getInt("clamnoit");
			rec.clamtotamt = rset0.getLong("clamtotamt");
			rec.recpnoit = rset0.getInt("recpnoit");
			rec.recptotamt = rset0.getLong("recptotamt");
			rec.billcoms = rset0.getInt("billcoms");
			rec.clamcrtedt = Util.checkString(rset0.getString("clamcrtedt"));
			rec.clamreqdt = Util.checkString(rset0.getString("clamreqdt"));
			rec.recprmsgdt = Util.checkString(rset0.getString("recprmsgdt"));
			rec.clamstat = Util.checkString(rset0.getString("clamstat"));
			rec.clamstatnm = Util.checkString(rset0.getString("clamstatnm"));
			rec.bocnt = rset0.getInt("bocnt");
			this.rsltcur.add(rec);
		}
	}

	public String rsltcurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = rsltcur.size();
		for(int i=0; i<size; i++){
			SS_S_SHFT_CLAM_SSUMRSLTCURRecord rec = (SS_S_SHFT_CLAM_SSUMRSLTCURRecord)rsltcur.get(i);


			String code = rec.basidt;
			String name = rec.pymtdt;

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
			SS_S_SHFT_CLAM_SSUMRSLTCURRecord rec = (SS_S_SHFT_CLAM_SSUMRSLTCURRecord)rsltcur.get(i);


			String code = rec.basidt;
			String name = rec.pymtdt;

			sb.append("<input name=\"");
			sb.append("basidt");
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
			SS_S_SHFT_CLAM_SSUMRSLTCURRecord rec = (SS_S_SHFT_CLAM_SSUMRSLTCURRecord)rsltcur.get(i);


			String code = rec.basidt;
			String name = rec.pymtdt;

			sb.append("<input name=\"");
			sb.append("basidt");
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
	SS_S_SHFT_CLAM_SSUMDataSet ds = (SS_S_SHFT_CLAM_SSUMDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.rsltcur.size(); i++){
		SS_S_SHFT_CLAM_SSUMRSLTCURRecord rsltcurRec = (SS_S_SHFT_CLAM_SSUMRSLTCURRecord)ds.rsltcur.get(i);%>
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

<%= rsltcurRec.basidt%>
<%= rsltcurRec.pymtdt%>
<%= rsltcurRec.shftclsfcd%>
<%= rsltcurRec.shftclsfnm%>
<%= rsltcurRec.clamnoit%>
<%= rsltcurRec.clamtotamt%>
<%= rsltcurRec.recpnoit%>
<%= rsltcurRec.recptotamt%>
<%= rsltcurRec.billcoms%>
<%= rsltcurRec.clamcrtedt%>
<%= rsltcurRec.clamreqdt%>
<%= rsltcurRec.recprmsgdt%>
<%= rsltcurRec.clamstat%>
<%= rsltcurRec.clamstatnm%>
<%= rsltcurRec.bocnt%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Mar 29 13:39:07 KST 2005 */

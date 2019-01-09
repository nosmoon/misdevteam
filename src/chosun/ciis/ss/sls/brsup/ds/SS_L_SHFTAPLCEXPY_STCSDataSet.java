/***************************************************************************************************
* 파일명 : .java
* 기능 : 지국업무지원-Billing자동이체-신청/해지통계-목록조회
* 작성일자 : 2005-01-11
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
 * 지국업무지원-Billing자동이체-신청/해지통계-목록조회
 */


public class SS_L_SHFTAPLCEXPY_STCSDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList rsltcur = new ArrayList();
	public String errcode;
	public String errmsg;
	public long totalcnt;

	public SS_L_SHFTAPLCEXPY_STCSDataSet(){}
	public SS_L_SHFTAPLCEXPY_STCSDataSet(String errcode, String errmsg, long totalcnt){
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
		this.totalcnt = cstmt.getLong(13);
		ResultSet rset0 = (ResultSet) cstmt.getObject(14);
		while(rset0.next()){
			SS_L_SHFTAPLCEXPY_STCSRSLTCURRecord rec = new SS_L_SHFTAPLCEXPY_STCSRSLTCURRecord();
			rec.title1 = Util.checkString(rset0.getString("title1"));
			rec.title2 = Util.checkString(rset0.getString("title2"));
			rec.aplc_ok = rset0.getInt("aplc_ok");
			rec.aplc_err = rset0.getInt("aplc_err");
			rec.aplc_sum = rset0.getInt("aplc_sum");
			rec.aplc_no = rset0.getInt("aplc_no");
			rec.total = rset0.getInt("total");
			this.rsltcur.add(rec);
		}
	}

	public String rsltcurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = rsltcur.size();
		for(int i=0; i<size; i++){
			SS_L_SHFTAPLCEXPY_STCSRSLTCURRecord rec = (SS_L_SHFTAPLCEXPY_STCSRSLTCURRecord)rsltcur.get(i);


			String code = rec.title1;
			String name = rec.title2;

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
			SS_L_SHFTAPLCEXPY_STCSRSLTCURRecord rec = (SS_L_SHFTAPLCEXPY_STCSRSLTCURRecord)rsltcur.get(i);


			String code = rec.title1;
			String name = rec.title2;

			sb.append("<input name=\"");
			sb.append("title1");
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
			SS_L_SHFTAPLCEXPY_STCSRSLTCURRecord rec = (SS_L_SHFTAPLCEXPY_STCSRSLTCURRecord)rsltcur.get(i);


			String code = rec.title1;
			String name = rec.title2;

			sb.append("<input name=\"");
			sb.append("title1");
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
	SS_L_SHFTAPLCEXPY_STCSDataSet ds = (SS_L_SHFTAPLCEXPY_STCSDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.rsltcur.size(); i++){
		SS_L_SHFTAPLCEXPY_STCSRSLTCURRecord rsltcurRec = (SS_L_SHFTAPLCEXPY_STCSRSLTCURRecord)ds.rsltcur.get(i);%>
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

<%= rsltcurRec.title1%>
<%= rsltcurRec.title2%>
<%= rsltcurRec.aplc_ok%>
<%= rsltcurRec.aplc_err%>
<%= rsltcurRec.aplc_sum%>
<%= rsltcurRec.aplc_no%>
<%= rsltcurRec.total%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Jan 11 20:20:30 KST 2005 */

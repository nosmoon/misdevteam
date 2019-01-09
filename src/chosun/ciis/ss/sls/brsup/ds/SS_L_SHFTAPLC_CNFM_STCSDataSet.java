/***************************************************************************************************
* 파일명 : .java
* 기능 : *지국업무지원-Billing자동이체-신청확인통계-목록조회
* 작성일자 : 2009-04-13
* 작성자 : 김세웅
***************************************************************************************************/


package chosun.ciis.ss.sls.brsup.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.brsup.dm.*;
import chosun.ciis.ss.sls.brsup.rec.*;

/**
 * 지국업무지원-Billing자동이체-신청확인통계-목록조회
 */

public class SS_L_SHFTAPLC_CNFM_STCSDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList rsltcur = new ArrayList();
	public String errcode;
	public String errmsg;
	public long totalcnt;

	public SS_L_SHFTAPLC_CNFM_STCSDataSet(){}
	public SS_L_SHFTAPLC_CNFM_STCSDataSet(String errcode, String errmsg, long totalcnt){
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
		this.totalcnt = cstmt.getLong(14);
		ResultSet rset0 = (ResultSet) cstmt.getObject(15);
		while(rset0.next()){
			SS_L_SHFTAPLC_CNFM_STCSRSLTCURRecord rec = new SS_L_SHFTAPLC_CNFM_STCSRSLTCURRecord();
			rec.areacd = Util.checkString(rset0.getString("areacd"));
			rec.areanm = Util.checkString(rset0.getString("areanm"));
			rec.bocd = Util.checkString(rset0.getString("bocd"));
			rec.bonm = Util.checkString(rset0.getString("bonm"));
			rec.tel_no = Util.checkString(rset0.getString("tel_no"));
			rec.jd_a_cnt = rset0.getInt("jd_a_cnt");
			rec.jd_b_cnt = rset0.getInt("jd_b_cnt");
			rec.jd_c_cnt = rset0.getInt("jd_c_cnt");
			rec.dd_a_cnt = rset0.getInt("dd_a_cnt");
			rec.dd_b_cnt = rset0.getInt("dd_b_cnt");
			rec.dd_c_cnt = rset0.getInt("dd_c_cnt");
			rec.pd_a_cnt = rset0.getInt("pd_a_cnt");
			rec.pd_b_cnt = rset0.getInt("pd_b_cnt");
			rec.pd_c_cnt = rset0.getInt("pd_c_cnt");
			this.rsltcur.add(rec);
		}
	}

	public String rsltcurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = rsltcur.size();
		for(int i=0; i<size; i++){
			SS_L_SHFTAPLC_CNFM_STCSRSLTCURRecord rec = (SS_L_SHFTAPLC_CNFM_STCSRSLTCURRecord)rsltcur.get(i);
			
			
			String code = rec.areacd;
			String name = rec.areanm;
			
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
			SS_L_SHFTAPLC_CNFM_STCSRSLTCURRecord rec = (SS_L_SHFTAPLC_CNFM_STCSRSLTCURRecord)rsltcur.get(i);
			
			
			String code = rec.areacd;
			String name = rec.areanm;
			
			sb.append("<input name=\"");
			sb.append("areacd");
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
			SS_L_SHFTAPLC_CNFM_STCSRSLTCURRecord rec = (SS_L_SHFTAPLC_CNFM_STCSRSLTCURRecord)rsltcur.get(i);
			
			
			String code = rec.areacd;
			String name = rec.areanm;
			
			sb.append("<input name=\"");
			sb.append("areacd");
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
	SS_L_SHFTAPLC_CNFM_STCSDataSet ds = (SS_L_SHFTAPLC_CNFM_STCSDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.rsltcur.size(); i++){
		SS_L_SHFTAPLC_CNFM_STCSRSLTCURRecord rsltcurRec = (SS_L_SHFTAPLC_CNFM_STCSRSLTCURRecord)ds.rsltcur.get(i);%>
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

<%= rsltcurRec.areacd%>
<%= rsltcurRec.areanm%>
<%= rsltcurRec.bocd%>
<%= rsltcurRec.bonm%>
<%= rsltcurRec.tel_no%>
<%= rsltcurRec.jd_a_cnt%>
<%= rsltcurRec.jd_b_cnt%>
<%= rsltcurRec.jd_c_cnt%>
<%= rsltcurRec.dd_a_cnt%>
<%= rsltcurRec.dd_b_cnt%>
<%= rsltcurRec.dd_c_cnt%>
<%= rsltcurRec.pd_a_cnt%>
<%= rsltcurRec.pd_b_cnt%>
<%= rsltcurRec.pd_c_cnt%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Apr 13 21:53:44 KST 2009 */
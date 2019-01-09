/***************************************************************************************************
* 파일명 : SS_L_SHFTAPLC_STCSDataSet.java
* 기능 : 지국업무지원-Billing자동이체-신청통계
* 작성일자 : 2004-06-07
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
 * 지국업무지원-Billing자동이체-신청통계
 *
 */


public class SS_L_SHFTAPLC_STCSDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList rsltcur = new ArrayList();
	public String errcode;
	public String errmsg;
	public long totalcnt;
	public long a_cnt;
	public long b_cnt;
	public long c_cnt;
	public long d_cnt;
	public long e_cnt;
	public long f_cnt;
	public long g_cnt;
	public long tot_cnt;

	public SS_L_SHFTAPLC_STCSDataSet(){}
	public SS_L_SHFTAPLC_STCSDataSet(String errcode, String errmsg, long totalcnt, long a_cnt, long b_cnt, long c_cnt, long d_cnt, long e_cnt, long f_cnt, long g_cnt, long tot_cnt){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.totalcnt = totalcnt;
		this.a_cnt = a_cnt;
		this.b_cnt = b_cnt;
		this.c_cnt = c_cnt;
		this.d_cnt = d_cnt;
		this.e_cnt = e_cnt;
		this.f_cnt = f_cnt;
		this.g_cnt = g_cnt;
		this.tot_cnt = tot_cnt;
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

	public void setA_cnt(long a_cnt){
		this.a_cnt = a_cnt;
	}

	public void setB_cnt(long b_cnt){
		this.b_cnt = b_cnt;
	}

	public void setC_cnt(long c_cnt){
		this.c_cnt = c_cnt;
	}

	public void setD_cnt(long d_cnt){
		this.d_cnt = d_cnt;
	}

	public void setE_cnt(long e_cnt){
		this.e_cnt = e_cnt;
	}

	public void setF_cnt(long f_cnt){
		this.f_cnt = f_cnt;
	}

	public void setG_cnt(long g_cnt){
		this.g_cnt = g_cnt;
	}

	public void setTot_cnt(long tot_cnt){
		this.tot_cnt = tot_cnt;
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

	public long getA_cnt(){
		return this.a_cnt;
	}

	public long getB_cnt(){
		return this.b_cnt;
	}

	public long getC_cnt(){
		return this.c_cnt;
	}

	public long getD_cnt(){
		return this.d_cnt;
	}

	public long getE_cnt(){
		return this.e_cnt;
	}

	public long getF_cnt(){
		return this.f_cnt;
	}

	public long getG_cnt(){
		return this.g_cnt;
	}

	public long getTot_cnt(){
		return this.tot_cnt;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){			return;		}
		this.totalcnt = cstmt.getLong(13);
		this.a_cnt = cstmt.getLong(14);
		this.b_cnt = cstmt.getLong(15);
		this.c_cnt = cstmt.getLong(16);
		this.d_cnt = cstmt.getLong(17);
		this.e_cnt = cstmt.getLong(18);
		this.f_cnt = cstmt.getLong(19);
		this.g_cnt = cstmt.getLong(20);
		this.tot_cnt = cstmt.getLong(21);
		ResultSet rset0 = (ResultSet) cstmt.getObject(22);
		while(rset0.next()){
			SS_L_SHFTAPLC_STCSRSLTCURRecord rec = new SS_L_SHFTAPLC_STCSRSLTCURRecord();
			rec.clsf1 = Util.checkString(rset0.getString("clsf1"));
			rec.clsf2 = Util.checkString(rset0.getString("clsf2"));
			rec.a_cnt = rset0.getInt("a_cnt");
			rec.b_cnt = rset0.getInt("b_cnt");
			rec.c_cnt = rset0.getInt("c_cnt");
			rec.d_cnt = rset0.getInt("d_cnt");
			rec.e_cnt = rset0.getInt("e_cnt");
			rec.f_cnt = rset0.getInt("f_cnt");
			rec.g_cnt = rset0.getInt("g_cnt");
			rec.tot_cnt = rset0.getInt("tot_cnt");
			this.rsltcur.add(rec);
		}
	}

	public String rsltcurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = rsltcur.size();
		for(int i=0; i<size; i++){
			SS_L_SHFTAPLC_STCSRSLTCURRecord rec = (SS_L_SHFTAPLC_STCSRSLTCURRecord)rsltcur.get(i);
			
			
			String code = rec.clsf1;
			String name = rec.clsf2;
			
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
			SS_L_SHFTAPLC_STCSRSLTCURRecord rec = (SS_L_SHFTAPLC_STCSRSLTCURRecord)rsltcur.get(i);
			
			
			String code = rec.clsf1;
			String name = rec.clsf2;
			
			sb.append("<input name=\"");
			sb.append("clsf1");
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
			SS_L_SHFTAPLC_STCSRSLTCURRecord rec = (SS_L_SHFTAPLC_STCSRSLTCURRecord)rsltcur.get(i);
			
			
			String code = rec.clsf1;
			String name = rec.clsf2;
			
			sb.append("<input name=\"");
			sb.append("clsf1");
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
	SS_L_SHFTAPLC_STCSDataSet ds = (SS_L_SHFTAPLC_STCSDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.rsltcur.size(); i++){
		SS_L_SHFTAPLC_STCSRSLTCURRecord rsltcurRec = (SS_L_SHFTAPLC_STCSRSLTCURRecord)ds.rsltcur.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getTotalcnt()%>
<%= ds.getA_cnt()%>
<%= ds.getB_cnt()%>
<%= ds.getC_cnt()%>
<%= ds.getD_cnt()%>
<%= ds.getE_cnt()%>
<%= ds.getF_cnt()%>
<%= ds.getG_cnt()%>
<%= ds.getTot_cnt()%>
<%= ds.getRsltcur()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= rsltcurRec.clsf1%>
<%= rsltcurRec.clsf2%>
<%= rsltcurRec.a_cnt%>
<%= rsltcurRec.b_cnt%>
<%= rsltcurRec.c_cnt%>
<%= rsltcurRec.d_cnt%>
<%= rsltcurRec.e_cnt%>
<%= rsltcurRec.f_cnt%>
<%= rsltcurRec.g_cnt%>
<%= rsltcurRec.tot_cnt%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Jun 09 01:26:58 KST 2004 */
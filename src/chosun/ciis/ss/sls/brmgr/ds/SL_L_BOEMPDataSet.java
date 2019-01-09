/***************************************************************************************************
 * 파일명   : SL_L_BOEMPDataSet.java
 * 기능     : 지국경영-아파트투입율-직원검색 직원목록조회
 * 작성일자 : 2005/10/14
 * 작성자   : 이혁
 **************************************************************************************************/
 


package chosun.ciis.ss.sls.brmgr.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.brmgr.dm.*;
import chosun.ciis.ss.sls.brmgr.rec.*;

/**
**  지국경영-아파트투입율-직원검색 직원목록조회
**/

public class SL_L_BOEMPDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList flnmcur = new ArrayList();
	public ArrayList rsltcur = new ArrayList();
	public String errcode;
	public String errmsg;
	public long totalcnt;

	public SL_L_BOEMPDataSet(){}
	public SL_L_BOEMPDataSet(String errcode, String errmsg, long totalcnt){
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
		this.totalcnt = cstmt.getLong(9);
		ResultSet rset0 = (ResultSet) cstmt.getObject(10);
		while(rset0.next()){
			SL_L_BOEMPRSLTCURRecord rec = new SL_L_BOEMPRSLTCURRecord();
			rec.boemp_no = Util.checkString(rset0.getString("boemp_no"));
			rec.flnm = Util.checkString(rset0.getString("flnm"));
			rec.empnm = Util.checkString(rset0.getString("empnm"));
			rec.tel1 = Util.checkString(rset0.getString("tel1"));
			rec.tel2 = Util.checkString(rset0.getString("tel2"));
			rec.tel3 = Util.checkString(rset0.getString("tel3"));
			rec.in_cmpy_dt = Util.checkString(rset0.getString("in_cmpy_dt"));
			this.rsltcur.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(11);
		while(rset1.next()){
			SL_L_BOEMPFLNMCURRecord rec = new SL_L_BOEMPFLNMCURRecord();
			rec.cicodeval = Util.checkString(rset1.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset1.getString("cicdnm"));
			this.flnmcur.add(rec);
		}
	}

	public String rsltcurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = rsltcur.size();
		for(int i=0; i<size; i++){
			SL_L_BOEMPRSLTCURRecord rec = (SL_L_BOEMPRSLTCURRecord)rsltcur.get(i);
			
			
			String code = rec.boemp_no;
			String name = rec.flnm;
			
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

	public String flnmcurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = flnmcur.size();
		for(int i=0; i<size; i++){
			SL_L_BOEMPFLNMCURRecord rec = (SL_L_BOEMPFLNMCURRecord)flnmcur.get(i);
			
			
			String code = rec.cicodeval;
			String name = rec.cicdnm;
			
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
			SL_L_BOEMPRSLTCURRecord rec = (SL_L_BOEMPRSLTCURRecord)rsltcur.get(i);
			
			
			String code = rec.boemp_no;
			String name = rec.flnm;
			
			sb.append("<input name=\"");
			sb.append("boemp_no");
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

	public String flnmcurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = flnmcur.size();
		for(int i=0; i<size; i++){
			SL_L_BOEMPFLNMCURRecord rec = (SL_L_BOEMPFLNMCURRecord)flnmcur.get(i);
			
			
			String code = rec.cicodeval;
			String name = rec.cicdnm;
			
			sb.append("<input name=\"");
			sb.append("cicodeval");
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
			SL_L_BOEMPRSLTCURRecord rec = (SL_L_BOEMPRSLTCURRecord)rsltcur.get(i);
			
			
			String code = rec.boemp_no;
			String name = rec.flnm;
			
			sb.append("<input name=\"");
			sb.append("boemp_no");
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

	public String flnmcurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = flnmcur.size();
		for(int i=0; i<size; i++){
			SL_L_BOEMPFLNMCURRecord rec = (SL_L_BOEMPFLNMCURRecord)flnmcur.get(i);
			
			
			String code = rec.cicodeval;
			String name = rec.cicdnm;
			
			sb.append("<input name=\"");
			sb.append("cicodeval");
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
	SL_L_BOEMPDataSet ds = (SL_L_BOEMPDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.rsltcur.size(); i++){
		SL_L_BOEMPRSLTCURRecord rsltcurRec = (SL_L_BOEMPRSLTCURRecord)ds.rsltcur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.flnmcur.size(); i++){
		SL_L_BOEMPFLNMCURRecord flnmcurRec = (SL_L_BOEMPFLNMCURRecord)ds.flnmcur.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getTotalcnt()%>
<%= ds.getRsltcur()%>
<%= ds.getFlnmcur()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= rsltcurRec.boemp_no%>
<%= rsltcurRec.flnm%>
<%= rsltcurRec.empnm%>
<%= rsltcurRec.tel1%>
<%= rsltcurRec.tel2%>
<%= rsltcurRec.tel3%>
<%= rsltcurRec.in_cmpy_dt%>
<%= flnmcurRec.cicodeval%>
<%= flnmcurRec.cicdnm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Oct 14 15:23:20 KST 2005 */
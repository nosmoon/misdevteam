/***************************************************************************************************
 * 파일명   : CO_L_RDRCRTS_APLC_CMPRDataSet.java
 * 기능     : 독자현황-독자등급관리-구독자비교대상검색을 위한 DataSet
 * 작성일자 : 2004-04-26
 * 작성자   : 김대섭
 **************************************************************************************************/
 /**************************************************************************************************
 * 수정내역 :
 * 수정자   :
 * 수정일자 :
 * 백업     : 
 **************************************************************************************************/


package chosun.ciis.ss.sls.rdr.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.rdr.dm.*;
import chosun.ciis.ss.sls.rdr.rec.*;

/**
 * 독자현황-독자등급관리-구독자비교대상검색을 위한 DataSet
 */

public class CO_L_RDRCRTS_APLC_CMPRDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList rdrcmprcur = new ArrayList();
	public ArrayList medicdcur = new ArrayList();
	public String errcode;
	public String errmsg;
	public long totalcnt;

	public CO_L_RDRCRTS_APLC_CMPRDataSet(){}
	public CO_L_RDRCRTS_APLC_CMPRDataSet(String errcode, String errmsg, long totalcnt){
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
		this.totalcnt = cstmt.getLong(15);
		ResultSet rset0 = (ResultSet) cstmt.getObject(16);
		while(rset0.next()){
			CO_L_RDRCRTS_APLC_CMPRMEDICDCURRecord rec = new CO_L_RDRCRTS_APLC_CMPRMEDICDCURRecord();
			rec.cicodeval = Util.checkString(rset0.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset0.getString("cicdnm"));
			this.medicdcur.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(17);
		while(rset1.next()){
			CO_L_RDRCRTS_APLC_CMPRRDRCMPRCURRecord rec = new CO_L_RDRCRTS_APLC_CMPRRDRCMPRCURRecord();
			rec.rdr_no = Util.checkString(rset1.getString("rdr_no"));
			rec.onlmembid = Util.checkString(rset1.getString("onlmembid"));
			rec.onlmembseq = Util.checkString(rset1.getString("onlmembseq"));
			rec.rdrnm = Util.checkString(rset1.getString("rdrnm"));
			rec.prn = Util.checkString(rset1.getString("prn"));
			rec.email = Util.checkString(rset1.getString("email"));
			rec.rdrgrad = Util.checkString(rset1.getString("rdrgrad"));
			rec.subsdt = Util.checkString(rset1.getString("subsdt"));
			rec.suspdt = Util.checkString(rset1.getString("suspdt"));
			rec.medicd = Util.checkString(rset1.getString("medicd"));
			rec.medinm = Util.checkString(rset1.getString("medinm"));
			rec.termsubsno = Util.checkString(rset1.getString("termsubsno"));
			rec.bocd = Util.checkString(rset1.getString("bocd"));
			rec.bonm = Util.checkString(rset1.getString("bonm"));
			rec.aplcdt = Util.checkString(rset1.getString("aplcdt"));
			rec.subsfrser_no = Util.checkString(rset1.getString("subsfrser_no"));
			rec.substoser_no = Util.checkString(rset1.getString("substoser_no"));
			rec.rdrtel_no1 = Util.checkString(rset1.getString("rdrtel_no1"));
			rec.rdrtel_no2 = Util.checkString(rset1.getString("rdrtel_no2"));
			rec.rdrtel_no3 = Util.checkString(rset1.getString("rdrtel_no3"));
			rec.rdrptph_no1 = Util.checkString(rset1.getString("rdrptph_no1"));
			rec.rdrptph_no2 = Util.checkString(rset1.getString("rdrptph_no2"));
			rec.rdrptph_no3 = Util.checkString(rset1.getString("rdrptph_no3"));
			rec.rdroffinm = Util.checkString(rset1.getString("rdroffinm"));
			rec.rdroffitel_no1 = Util.checkString(rset1.getString("rdroffitel_no1"));
			rec.rdroffitel_no2 = Util.checkString(rset1.getString("rdroffitel_no2"));
			rec.rdroffitel_no3 = Util.checkString(rset1.getString("rdroffitel_no3"));
			rec.dlvzip = Util.checkString(rset1.getString("dlvzip"));
			rec.dlvaddr = Util.checkString(rset1.getString("dlvaddr"));
			rec.dlvdtlsaddr = Util.checkString(rset1.getString("dlvdtlsaddr"));
			rec.rnum = Util.checkString(rset1.getString("rnum"));
			this.rdrcmprcur.add(rec);
		}
	}

	public String medicdcurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = medicdcur.size();
		for(int i=0; i<size; i++){
			CO_L_RDRCRTS_APLC_CMPRMEDICDCURRecord rec = (CO_L_RDRCRTS_APLC_CMPRMEDICDCURRecord)medicdcur.get(i);
			
			
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

	public String rdrcmprcurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = rdrcmprcur.size();
		for(int i=0; i<size; i++){
			CO_L_RDRCRTS_APLC_CMPRRDRCMPRCURRecord rec = (CO_L_RDRCRTS_APLC_CMPRRDRCMPRCURRecord)rdrcmprcur.get(i);
			
			
			String code = rec.rdr_no;
			String name = rec.onlmembid;
			
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

	public String medicdcurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = medicdcur.size();
		for(int i=0; i<size; i++){
			CO_L_RDRCRTS_APLC_CMPRMEDICDCURRecord rec = (CO_L_RDRCRTS_APLC_CMPRMEDICDCURRecord)medicdcur.get(i);
			
			
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

	public String rdrcmprcurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = rdrcmprcur.size();
		for(int i=0; i<size; i++){
			CO_L_RDRCRTS_APLC_CMPRRDRCMPRCURRecord rec = (CO_L_RDRCRTS_APLC_CMPRRDRCMPRCURRecord)rdrcmprcur.get(i);
			
			
			String code = rec.rdr_no;
			String name = rec.onlmembid;
			
			sb.append("<input name=\"");
			sb.append("rdr_no");
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

	public String medicdcurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = medicdcur.size();
		for(int i=0; i<size; i++){
			CO_L_RDRCRTS_APLC_CMPRMEDICDCURRecord rec = (CO_L_RDRCRTS_APLC_CMPRMEDICDCURRecord)medicdcur.get(i);
			
			
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

	public String rdrcmprcurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = rdrcmprcur.size();
		for(int i=0; i<size; i++){
			CO_L_RDRCRTS_APLC_CMPRRDRCMPRCURRecord rec = (CO_L_RDRCRTS_APLC_CMPRRDRCMPRCURRecord)rdrcmprcur.get(i);
			
			
			String code = rec.rdr_no;
			String name = rec.onlmembid;
			
			sb.append("<input name=\"");
			sb.append("rdr_no");
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
	CO_L_RDRCRTS_APLC_CMPRDataSet ds = (CO_L_RDRCRTS_APLC_CMPRDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.medicdcur.size(); i++){
		CO_L_RDRCRTS_APLC_CMPRMEDICDCURRecord medicdcurRec = (CO_L_RDRCRTS_APLC_CMPRMEDICDCURRecord)ds.medicdcur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.rdrcmprcur.size(); i++){
		CO_L_RDRCRTS_APLC_CMPRRDRCMPRCURRecord rdrcmprcurRec = (CO_L_RDRCRTS_APLC_CMPRRDRCMPRCURRecord)ds.rdrcmprcur.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getTotalcnt()%>
<%= ds.getMedicdcur()%>
<%= ds.getRdrcmprcur()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= medicdcurRec.cicodeval%>
<%= medicdcurRec.cicdnm%>
<%= rdrcmprcurRec.rdr_no%>
<%= rdrcmprcurRec.onlmembid%>
<%= rdrcmprcurRec.onlmembseq%>
<%= rdrcmprcurRec.rdrnm%>
<%= rdrcmprcurRec.prn%>
<%= rdrcmprcurRec.email%>
<%= rdrcmprcurRec.rdrgrad%>
<%= rdrcmprcurRec.subsdt%>
<%= rdrcmprcurRec.suspdt%>
<%= rdrcmprcurRec.medicd%>
<%= rdrcmprcurRec.medinm%>
<%= rdrcmprcurRec.termsubsno%>
<%= rdrcmprcurRec.bocd%>
<%= rdrcmprcurRec.bonm%>
<%= rdrcmprcurRec.aplcdt%>
<%= rdrcmprcurRec.subsfrser_no%>
<%= rdrcmprcurRec.substoser_no%>
<%= rdrcmprcurRec.rdrtel_no1%>
<%= rdrcmprcurRec.rdrtel_no2%>
<%= rdrcmprcurRec.rdrtel_no3%>
<%= rdrcmprcurRec.rdrptph_no1%>
<%= rdrcmprcurRec.rdrptph_no2%>
<%= rdrcmprcurRec.rdrptph_no3%>
<%= rdrcmprcurRec.rdroffinm%>
<%= rdrcmprcurRec.rdroffitel_no1%>
<%= rdrcmprcurRec.rdroffitel_no2%>
<%= rdrcmprcurRec.rdroffitel_no3%>
<%= rdrcmprcurRec.dlvzip%>
<%= rdrcmprcurRec.dlvaddr%>
<%= rdrcmprcurRec.dlvdtlsaddr%>
<%= rdrcmprcurRec.rnum%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Apr 23 16:36:20 KST 2004 */
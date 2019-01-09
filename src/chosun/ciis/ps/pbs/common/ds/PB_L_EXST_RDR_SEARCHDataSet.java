/***************************************************************************************************
 * 파일명   : PB_L_EXST_RDR_SEARCHDataSet.java
 * 기능     : 공통-출판 기존독자 검색
 * 작성일자 : 2004-02-16
 * 작성자   : 김상옥
 **************************************************************************************************/
 /**************************************************************************************************
 * 수정내역 :
 * 수정자   :
 * 수정일자 :
 * 백업     :
 **************************************************************************************************/


package chosun.ciis.ps.pbs.common.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ps.pbs.common.dm.*;
import chosun.ciis.ps.pbs.common.rec.*;

/**
 * 공통-출판 기존독자 검색
 */

public class PB_L_EXST_RDR_SEARCHDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList exstrdrlistcur = new ArrayList();
	public String errcode;
	public String errmsg;
	public long totalcnt;

	public PB_L_EXST_RDR_SEARCHDataSet(){}
	public PB_L_EXST_RDR_SEARCHDataSet(String errcode, String errmsg, long totalcnt){
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
		this.totalcnt = cstmt.getLong(19);
		ResultSet rset0 = (ResultSet) cstmt.getObject(20);
		while(rset0.next()){
			PB_L_EXST_RDR_SEARCHEXSTRDRLISTCURRecord rec = new PB_L_EXST_RDR_SEARCHEXSTRDRLISTCURRecord();
			rec.rdr_no = Util.checkString(rset0.getString("rdr_no"));
			rec.rdrnm = Util.checkString(rset0.getString("rdrnm"));
			rec.prn = Util.checkString(rset0.getString("prn"));
			rec.email = Util.checkString(rset0.getString("email"));
			rec.dlvaddr = Util.checkString(rset0.getString("dlvaddr"));
			rec.rdrtel_no = Util.checkString(rset0.getString("rdrtel_no"));
			rec.rdrptph_no = Util.checkString(rset0.getString("rdrptph_no"));
			rec.rnum = rset0.getInt("rnum");
			this.exstrdrlistcur.add(rec);
		}
	}

	public String exstrdrlistcurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = exstrdrlistcur.size();
		for(int i=0; i<size; i++){
			PB_L_EXST_RDR_SEARCHEXSTRDRLISTCURRecord rec = (PB_L_EXST_RDR_SEARCHEXSTRDRLISTCURRecord)exstrdrlistcur.get(i);


			String code = rec.rdr_no;
			String name = rec.rdrnm;

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

	public String exstrdrlistcurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = exstrdrlistcur.size();
		for(int i=0; i<size; i++){
			PB_L_EXST_RDR_SEARCHEXSTRDRLISTCURRecord rec = (PB_L_EXST_RDR_SEARCHEXSTRDRLISTCURRecord)exstrdrlistcur.get(i);


			String code = rec.rdr_no;
			String name = rec.rdrnm;

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

	public String exstrdrlistcurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = exstrdrlistcur.size();
		for(int i=0; i<size; i++){
			PB_L_EXST_RDR_SEARCHEXSTRDRLISTCURRecord rec = (PB_L_EXST_RDR_SEARCHEXSTRDRLISTCURRecord)exstrdrlistcur.get(i);


			String code = rec.rdr_no;
			String name = rec.rdrnm;

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
	PB_L_EXST_RDR_SEARCHDataSet ds = (PB_L_EXST_RDR_SEARCHDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.exstrdrlistcur.size(); i++){
		PB_L_EXST_RDR_SEARCHEXSTRDRLISTCURRecord exstrdrlistcurRec = (PB_L_EXST_RDR_SEARCHEXSTRDRLISTCURRecord)ds.exstrdrlistcur.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getTotalcnt()%>
<%= ds.getExstrdrlistcur()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= exstrdrlistcurRec.rdr_no%>
<%= exstrdrlistcurRec.rdrnm%>
<%= exstrdrlistcurRec.prn%>
<%= exstrdrlistcurRec.email%>
<%= exstrdrlistcurRec.dlvaddr%>
<%= exstrdrlistcurRec.rdrtel_no%>
<%= exstrdrlistcurRec.rdrptph_no%>
<%= exstrdrlistcurRec.rnum%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Feb 16 16:28:41 KST 2004 */
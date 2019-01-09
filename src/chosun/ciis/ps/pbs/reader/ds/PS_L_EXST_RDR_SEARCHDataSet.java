/***************************************************************************************************
 * 파일명   : PS_L_EXST_RDR_SEARCHDataSet.java
 * 기능     : 독자-지사배정처리 기존독자비교대상
 * 작성일자 : 2004-03-02
 * 작성자   : 김상옥
 **************************************************************************************************/
 /**************************************************************************************************
 * 수정내역 :
 * 수정자   :
 * 수정일자 :
 * 백업     :
 **************************************************************************************************/


package chosun.ciis.ps.pbs.reader.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ps.pbs.reader.dm.*;
import chosun.ciis.ps.pbs.reader.rec.*;

/**
 * 독자-지사배정처리 기존독자비교대상
 */

public class PS_L_EXST_RDR_SEARCHDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList exstrdrlistcur = new ArrayList();
	public String errcode;
	public String errmsg;

	public PS_L_EXST_RDR_SEARCHDataSet(){}
	public PS_L_EXST_RDR_SEARCHDataSet(String errcode, String errmsg){
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
		ResultSet rset0 = (ResultSet) cstmt.getObject(7);
		while(rset0.next()){
			PS_L_EXST_RDR_SEARCHEXSTRDRLISTCURRecord rec = new PS_L_EXST_RDR_SEARCHEXSTRDRLISTCURRecord();
			rec.rdr_no = Util.checkString(rset0.getString("rdr_no"));
			rec.medicd = Util.checkString(rset0.getString("medicd"));
			rec.termsubsno = Util.checkString(rset0.getString("termsubsno"));
			rec.bocd = Util.checkString(rset0.getString("bocd"));
			rec.bonm = Util.checkString(rset0.getString("bonm"));
			rec.rdrnm = Util.checkString(rset0.getString("rdrnm"));
			rec.subs_no = Util.checkString(rset0.getString("subs_no"));
			rec.prn = Util.checkString(rset0.getString("prn"));
			rec.email = Util.checkString(rset0.getString("email"));
			rec.rdrtel_no1 = Util.checkString(rset0.getString("rdrtel_no1"));
			rec.rdrtel_no2 = Util.checkString(rset0.getString("rdrtel_no2"));
			rec.rdrtel_no3 = Util.checkString(rset0.getString("rdrtel_no3"));
			rec.rdrptph_no1 = Util.checkString(rset0.getString("rdrptph_no1"));
			rec.rdrptph_no2 = Util.checkString(rset0.getString("rdrptph_no2"));
			rec.rdrptph_no3 = Util.checkString(rset0.getString("rdrptph_no3"));
			rec.rdroffitel_no1 = Util.checkString(rset0.getString("rdroffitel_no1"));
			rec.rdroffitel_no2 = Util.checkString(rset0.getString("rdroffitel_no2"));
			rec.rdroffitel_no3 = Util.checkString(rset0.getString("rdroffitel_no3"));
			rec.dlvzip = Util.checkString(rset0.getString("dlvzip"));
			rec.dlvaddr = Util.checkString(rset0.getString("dlvaddr"));
			rec.dlvdtlsaddr = Util.checkString(rset0.getString("dlvdtlsaddr"));
			this.exstrdrlistcur.add(rec);
		}
	}

	public String exstrdrlistcurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = exstrdrlistcur.size();
		for(int i=0; i<size; i++){
			PS_L_EXST_RDR_SEARCHEXSTRDRLISTCURRecord rec = (PS_L_EXST_RDR_SEARCHEXSTRDRLISTCURRecord)exstrdrlistcur.get(i);
			
			
			String code = rec.rdr_no;
			String name = rec.medicd;
			
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
			PS_L_EXST_RDR_SEARCHEXSTRDRLISTCURRecord rec = (PS_L_EXST_RDR_SEARCHEXSTRDRLISTCURRecord)exstrdrlistcur.get(i);
			
			
			String code = rec.rdr_no;
			String name = rec.medicd;
			
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
			PS_L_EXST_RDR_SEARCHEXSTRDRLISTCURRecord rec = (PS_L_EXST_RDR_SEARCHEXSTRDRLISTCURRecord)exstrdrlistcur.get(i);
			
			
			String code = rec.rdr_no;
			String name = rec.medicd;
			
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
	PS_L_EXST_RDR_SEARCHDataSet ds = (PS_L_EXST_RDR_SEARCHDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.exstrdrlistcur.size(); i++){
		PS_L_EXST_RDR_SEARCHEXSTRDRLISTCURRecord exstrdrlistcurRec = (PS_L_EXST_RDR_SEARCHEXSTRDRLISTCURRecord)ds.exstrdrlistcur.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getExstrdrlistcur()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= exstrdrlistcurRec.rdr_no%>
<%= exstrdrlistcurRec.medicd%>
<%= exstrdrlistcurRec.termsubsno%>
<%= exstrdrlistcurRec.bocd%>
<%= exstrdrlistcurRec.bonm%>
<%= exstrdrlistcurRec.rdrnm%>
<%= exstrdrlistcurRec.subs_no%>
<%= exstrdrlistcurRec.prn%>
<%= exstrdrlistcurRec.email%>
<%= exstrdrlistcurRec.rdrtel_no1%>
<%= exstrdrlistcurRec.rdrtel_no2%>
<%= exstrdrlistcurRec.rdrtel_no3%>
<%= exstrdrlistcurRec.rdrptph_no1%>
<%= exstrdrlistcurRec.rdrptph_no2%>
<%= exstrdrlistcurRec.rdrptph_no3%>
<%= exstrdrlistcurRec.rdroffitel_no1%>
<%= exstrdrlistcurRec.rdroffitel_no2%>
<%= exstrdrlistcurRec.rdroffitel_no3%>
<%= exstrdrlistcurRec.dlvzip%>
<%= exstrdrlistcurRec.dlvaddr%>
<%= exstrdrlistcurRec.dlvdtlsaddr%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Apr 12 11:11:51 KST 2005 */
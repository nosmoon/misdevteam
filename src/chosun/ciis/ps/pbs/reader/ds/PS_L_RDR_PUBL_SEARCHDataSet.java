/***************************************************************************************************
* 파일명 : SP_PS_L_RDR_PUBL_SEARCH.java
* 기능 :   독자-독자조회 조회화면
* 작성일자 : 2004-02-28
* 작성자 : 김건호 
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :   
* 백업 :   
***************************************************************************************************/


package chosun.ciis.ps.pbs.reader.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ps.pbs.reader.dm.*;
import chosun.ciis.ps.pbs.reader.rec.*;

/**
 * 독자-독자조회 조회화면
 *
 */

public class PS_L_RDR_PUBL_SEARCHDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList rdr_publcur = new ArrayList();
	public String errcode;
	public String errmsg;
	public long totalcnt;

	public PS_L_RDR_PUBL_SEARCHDataSet(){}
	public PS_L_RDR_PUBL_SEARCHDataSet(String errcode, String errmsg, long totalcnt){
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
		this.totalcnt = cstmt.getLong(24);
		ResultSet rset0 = (ResultSet) cstmt.getObject(25);
		while(rset0.next()){
			PS_L_RDR_PUBL_SEARCHRDR_PUBLCURRecord rec = new PS_L_RDR_PUBL_SEARCHRDR_PUBLCURRecord();
			rec.rdr_no = Util.checkString(rset0.getString("rdr_no"));
			rec.medicd = Util.checkString(rset0.getString("medicd"));
			rec.termsubsno = Util.checkString(rset0.getString("termsubsno"));
			rec.bonm = Util.checkString(rset0.getString("bonm"));
			rec.rdrnm = Util.checkString(rset0.getString("rdrnm"));
			rec.medinm = Util.checkString(rset0.getString("medinm"));
			rec.subsfrser_no = Util.checkString(rset0.getString("subsfrser_no"));
			rec.rdrtel_no = Util.checkString(rset0.getString("rdrtel_no"));
			rec.dlvzip = Util.checkString(rset0.getString("dlvzip"));
			rec.dlvaddr = Util.checkString(rset0.getString("dlvaddr"));
			rec.dlvdtlsaddr = Util.checkString(rset0.getString("dlvdtlsaddr"));
			rec.email = Util.checkString(rset0.getString("email"));
			rec.acpntypenm = Util.checkString(rset0.getString("acpntypenm"));
			rec.sendyncdflag = Util.checkString(rset0.getString("sendyncdflag"));
			this.rdr_publcur.add(rec);
		}
	}

	public String rdr_publcurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = rdr_publcur.size();
		for(int i=0; i<size; i++){
			PS_L_RDR_PUBL_SEARCHRDR_PUBLCURRecord rec = (PS_L_RDR_PUBL_SEARCHRDR_PUBLCURRecord)rdr_publcur.get(i);
			
			
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

	public String rdr_publcurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = rdr_publcur.size();
		for(int i=0; i<size; i++){
			PS_L_RDR_PUBL_SEARCHRDR_PUBLCURRecord rec = (PS_L_RDR_PUBL_SEARCHRDR_PUBLCURRecord)rdr_publcur.get(i);
			
			
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

	public String rdr_publcurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = rdr_publcur.size();
		for(int i=0; i<size; i++){
			PS_L_RDR_PUBL_SEARCHRDR_PUBLCURRecord rec = (PS_L_RDR_PUBL_SEARCHRDR_PUBLCURRecord)rdr_publcur.get(i);
			
			
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
	PS_L_RDR_PUBL_SEARCHDataSet ds = (PS_L_RDR_PUBL_SEARCHDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.rdr_publcur.size(); i++){
		PS_L_RDR_PUBL_SEARCHRDR_PUBLCURRecord rdr_publcurRec = (PS_L_RDR_PUBL_SEARCHRDR_PUBLCURRecord)ds.rdr_publcur.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getTotalcnt()%>
<%= ds.getRdr_publcur()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= rdr_publcurRec.rdr_no%>
<%= rdr_publcurRec.medicd%>
<%= rdr_publcurRec.termsubsno%>
<%= rdr_publcurRec.bonm%>
<%= rdr_publcurRec.rdrnm%>
<%= rdr_publcurRec.medinm%>
<%= rdr_publcurRec.subsfrser_no%>
<%= rdr_publcurRec.rdrtel_no%>
<%= rdr_publcurRec.dlvzip%>
<%= rdr_publcurRec.dlvaddr%>
<%= rdr_publcurRec.dlvdtlsaddr%>
<%= rdr_publcurRec.email%>
<%= rdr_publcurRec.acpntypenm%>
<%= rdr_publcurRec.sendyncdflag%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Dec 07 16:42:16 KST 2007 */
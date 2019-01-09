/***************************************************************************************************
* 파일명 : SS_L_RDR_TMDataSet.java
* 기능 : 상담원-출판독자검색을 위한 DataSet
* 작성일자 : 2004-04-24
* 작성자 : 김대섭
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.ss.sls.cns.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.cns.dm.*;
import chosun.ciis.ss.sls.cns.rec.*;

/**
 * 상담원-출판독자검색을 위한 DataSet
 */


public class SS_L_RDR_TMDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList readerlistcur = new ArrayList();
	public String errcode;
	public String errmsg;

	public SS_L_RDR_TMDataSet(){}
	public SS_L_RDR_TMDataSet(String errcode, String errmsg){
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
		ResultSet rset0 = (ResultSet) cstmt.getObject(6);
		while(rset0.next()){
			SS_L_RDR_TMREADERLISTCURRecord rec = new SS_L_RDR_TMREADERLISTCURRecord();
			rec.rdr_no = Util.checkString(rset0.getString("rdr_no"));
			rec.rdrnm = Util.checkString(rset0.getString("rdrnm"));
			rec.medicd = Util.checkString(rset0.getString("medicd"));
			rec.medicd_nm = Util.checkString(rset0.getString("medicd_nm"));
			rec.termsubsno = Util.checkString(rset0.getString("termsubsno"));
			rec.bocd = Util.checkString(rset0.getString("bocd"));
			rec.bonm = Util.checkString(rset0.getString("bonm"));
			rec.subsfrser_no = Util.checkString(rset0.getString("subsfrser_no"));
			rec.substoser_no = Util.checkString(rset0.getString("substoser_no"));
			rec.rdrtel_no = Util.checkString(rset0.getString("rdrtel_no"));
			rec.rdrptph_no = Util.checkString(rset0.getString("rdrptph_no"));
			rec.dlvzip = Util.checkString(rset0.getString("dlvzip"));
			rec.dlvaddr = Util.checkString(rset0.getString("dlvaddr"));
			rec.dlvdtlsaddr = Util.checkString(rset0.getString("dlvdtlsaddr"));
			rec.prn = Util.checkString(rset0.getString("prn"));
			rec.email = Util.checkString(rset0.getString("email"));
			this.readerlistcur.add(rec);
		}
	}

	public String readerlistcurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = readerlistcur.size();
		for(int i=0; i<size; i++){
			SS_L_RDR_TMREADERLISTCURRecord rec = (SS_L_RDR_TMREADERLISTCURRecord)readerlistcur.get(i);
			
			
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

	public String readerlistcurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = readerlistcur.size();
		for(int i=0; i<size; i++){
			SS_L_RDR_TMREADERLISTCURRecord rec = (SS_L_RDR_TMREADERLISTCURRecord)readerlistcur.get(i);
			
			
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

	public String readerlistcurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = readerlistcur.size();
		for(int i=0; i<size; i++){
			SS_L_RDR_TMREADERLISTCURRecord rec = (SS_L_RDR_TMREADERLISTCURRecord)readerlistcur.get(i);
			
			
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
	SS_L_RDR_TMDataSet ds = (SS_L_RDR_TMDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.readerlistcur.size(); i++){
		SS_L_RDR_TMREADERLISTCURRecord readerlistcurRec = (SS_L_RDR_TMREADERLISTCURRecord)ds.readerlistcur.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getReaderlistcur()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= readerlistcurRec.rdr_no%>
<%= readerlistcurRec.rdrnm%>
<%= readerlistcurRec.medicd%>
<%= readerlistcurRec.medicd_nm%>
<%= readerlistcurRec.termsubsno%>
<%= readerlistcurRec.bocd%>
<%= readerlistcurRec.bonm%>
<%= readerlistcurRec.subsfrser_no%>
<%= readerlistcurRec.substoser_no%>
<%= readerlistcurRec.rdrtel_no%>
<%= readerlistcurRec.rdrptph_no%>
<%= readerlistcurRec.dlvzip%>
<%= readerlistcurRec.dlvaddr%>
<%= readerlistcurRec.dlvdtlsaddr%>
<%= readerlistcurRec.prn%>
<%= readerlistcurRec.email%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Jul 14 11:10:47 KST 2004 */
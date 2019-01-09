/***************************************************************************************************
 * 파일명   : SP_SS_L_BO_READER_SEARCH
 * 기능     : 지국경영-주간조선 독자조회
 * 작성일자 : 2007/06/15
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
**  SP_SS_L_BO_READER_SEARCH
**/

public class SS_L_BO_READER_SEARCHDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList readerlistcur = new ArrayList();
	public String errcode;
	public String errmsg;
	public long totalcnt;

	public SS_L_BO_READER_SEARCHDataSet(){}
	public SS_L_BO_READER_SEARCHDataSet(String errcode, String errmsg, long totalcnt){
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
		this.totalcnt = cstmt.getLong(20);
		ResultSet rset0 = (ResultSet) cstmt.getObject(21);
		while(rset0.next()){
			SS_L_BO_READER_SEARCHREADERLISTCURRecord rec = new SS_L_BO_READER_SEARCHREADERLISTCURRecord();
			rec.rdr_no = Util.checkString(rset0.getString("rdr_no"));
			rec.medicd = Util.checkString(rset0.getString("medicd"));
			rec.termsubsno = Util.checkString(rset0.getString("termsubsno"));
			rec.bocd = Util.checkString(rset0.getString("bocd"));
			rec.bonm = Util.checkString(rset0.getString("bonm"));
			rec.acq_bocd = Util.checkString(rset0.getString("acq_bocd"));
			rec.acq_bonm = Util.checkString(rset0.getString("acq_bonm"));
			rec.subsfrser_no = Util.checkString(rset0.getString("subsfrser_no"));
			rec.substoser_no = Util.checkString(rset0.getString("substoser_no"));
			rec.acqnm = Util.checkString(rset0.getString("acqnm"));
			rec.rdrtel_no1 = Util.checkString(rset0.getString("rdrtel_no1"));
			rec.rdrtel_no2 = Util.checkString(rset0.getString("rdrtel_no2"));
			rec.rdrtel_no3 = Util.checkString(rset0.getString("rdrtel_no3"));
			rec.rdrptph_no1 = Util.checkString(rset0.getString("rdrptph_no1"));
			rec.rdrptph_no2 = Util.checkString(rset0.getString("rdrptph_no2"));
			rec.rdrptph_no3 = Util.checkString(rset0.getString("rdrptph_no3"));
			rec.rdroffinm = Util.checkString(rset0.getString("rdroffinm"));
			rec.rdrposi = Util.checkString(rset0.getString("rdrposi"));
			rec.rdroffitel_no1 = Util.checkString(rset0.getString("rdroffitel_no1"));
			rec.rdroffitel_no2 = Util.checkString(rset0.getString("rdroffitel_no2"));
			rec.rdroffitel_no3 = Util.checkString(rset0.getString("rdroffitel_no3"));
			rec.dlvzip = Util.checkString(rset0.getString("dlvzip"));
			rec.dlvaddr = Util.checkString(rset0.getString("dlvaddr"));
			rec.dlvdtlsaddr = Util.checkString(rset0.getString("dlvdtlsaddr"));
			rec.sendmthd = Util.checkString(rset0.getString("sendmthd"));
			rec.sendyncd = Util.checkString(rset0.getString("sendyncd"));
			rec.sendynprocdt = Util.checkString(rset0.getString("sendynprocdt"));
			rec.dstccd = Util.checkString(rset0.getString("dstccd"));
			rec.dlvno = Util.checkString(rset0.getString("dlvno"));
			rec.boprocyn = Util.checkString(rset0.getString("boprocyn"));
			rec.boprocdt = Util.checkString(rset0.getString("boprocdt"));
			rec.rnum = rset0.getInt("rnum");
			this.readerlistcur.add(rec);
		}
	}

	public String readerlistcurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = readerlistcur.size();
		for(int i=0; i<size; i++){
			SS_L_BO_READER_SEARCHREADERLISTCURRecord rec = (SS_L_BO_READER_SEARCHREADERLISTCURRecord)readerlistcur.get(i);
			
			
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

	public String readerlistcurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = readerlistcur.size();
		for(int i=0; i<size; i++){
			SS_L_BO_READER_SEARCHREADERLISTCURRecord rec = (SS_L_BO_READER_SEARCHREADERLISTCURRecord)readerlistcur.get(i);
			
			
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

	public String readerlistcurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = readerlistcur.size();
		for(int i=0; i<size; i++){
			SS_L_BO_READER_SEARCHREADERLISTCURRecord rec = (SS_L_BO_READER_SEARCHREADERLISTCURRecord)readerlistcur.get(i);
			
			
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
	SS_L_BO_READER_SEARCHDataSet ds = (SS_L_BO_READER_SEARCHDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.readerlistcur.size(); i++){
		SS_L_BO_READER_SEARCHREADERLISTCURRecord readerlistcurRec = (SS_L_BO_READER_SEARCHREADERLISTCURRecord)ds.readerlistcur.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getTotalcnt()%>
<%= ds.getReaderlistcur()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= readerlistcurRec.rdr_no%>
<%= readerlistcurRec.medicd%>
<%= readerlistcurRec.termsubsno%>
<%= readerlistcurRec.bocd%>
<%= readerlistcurRec.bonm%>
<%= readerlistcurRec.acq_bocd%>
<%= readerlistcurRec.acq_bonm%>
<%= readerlistcurRec.subsfrser_no%>
<%= readerlistcurRec.substoser_no%>
<%= readerlistcurRec.acqnm%>
<%= readerlistcurRec.rdrtel_no1%>
<%= readerlistcurRec.rdrtel_no2%>
<%= readerlistcurRec.rdrtel_no3%>
<%= readerlistcurRec.rdrptph_no1%>
<%= readerlistcurRec.rdrptph_no2%>
<%= readerlistcurRec.rdrptph_no3%>
<%= readerlistcurRec.rdroffinm%>
<%= readerlistcurRec.rdrposi%>
<%= readerlistcurRec.rdroffitel_no1%>
<%= readerlistcurRec.rdroffitel_no2%>
<%= readerlistcurRec.rdroffitel_no3%>
<%= readerlistcurRec.dlvzip%>
<%= readerlistcurRec.dlvaddr%>
<%= readerlistcurRec.dlvdtlsaddr%>
<%= readerlistcurRec.sendmthd%>
<%= readerlistcurRec.sendyncd%>
<%= readerlistcurRec.sendynprocdt%>
<%= readerlistcurRec.dstccd%>
<%= readerlistcurRec.dlvno%>
<%= readerlistcurRec.boprocyn%>
<%= readerlistcurRec.boprocdt%>
<%= readerlistcurRec.rnum%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Jun 15 14:48:02 KST 2007 */
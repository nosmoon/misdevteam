/***************************************************************************************************
 * 파일명   : SP_SS_L_CVSRECP_LIST
 * 기능     : 지국지원-빌링-편의점수납현황
 * 작성일자 : 2007/04/20
 * 작성자   : 이혁
 **************************************************************************************************/
 


package chosun.ciis.ss.sls.brsup.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.brsup.dm.*;
import chosun.ciis.ss.sls.brsup.rec.*;

/**
**  SP_SS_L_CVSRECP_LIST
**/

public class SS_L_CVSRECP_LISTDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList rsltcur = new ArrayList();
	public String errcode;
	public String errmsg;
	public long totalcnt;
	public long totalrecpamt;
	public long totalrecpfee;

	public SS_L_CVSRECP_LISTDataSet(){}
	public SS_L_CVSRECP_LISTDataSet(String errcode, String errmsg, long totalcnt, long totalrecpamt, long totalrecpfee){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.totalcnt = totalcnt;
		this.totalrecpamt = totalrecpamt;
		this.totalrecpfee = totalrecpfee;
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

	public void setTotalrecpamt(long totalrecpamt){
		this.totalrecpamt = totalrecpamt;
	}

	public void setTotalrecpfee(long totalrecpfee){
		this.totalrecpfee = totalrecpfee;
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

	public long getTotalrecpamt(){
		return this.totalrecpamt;
	}

	public long getTotalrecpfee(){
		return this.totalrecpfee;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){			return;		}
		this.totalcnt = cstmt.getLong(10);
		this.totalrecpamt = cstmt.getLong(11);
		this.totalrecpfee = cstmt.getLong(12);
		ResultSet rset0 = (ResultSet) cstmt.getObject(13);
		while(rset0.next()){
			SS_L_CVSRECP_LISTRSLTCURRecord rec = new SS_L_CVSRECP_LISTRSLTCURRecord();
			rec.acqdt = Util.checkString(rset0.getString("acqdt"));
			rec.bocd = Util.checkString(rset0.getString("bocd"));
			rec.bonm = Util.checkString(rset0.getString("bonm"));
			rec.girono = Util.checkString(rset0.getString("girono"));
			rec.rdr_no = Util.checkString(rset0.getString("rdr_no"));
			rec.medicd = Util.checkString(rset0.getString("medicd"));
			rec.subsmappli = Util.checkString(rset0.getString("subsmappli"));
			rec.custbrwsno = Util.checkString(rset0.getString("custbrwsno"));
			rec.amt = rset0.getInt("amt");
			rec.fee = rset0.getInt("fee");
			rec.recpbankcd = Util.checkString(rset0.getString("recpbankcd"));
			rec.recpbanknm = Util.checkString(rset0.getString("recpbanknm"));
			rec.recpbrchcd = Util.checkString(rset0.getString("recpbrchcd"));
			rec.recpdt = Util.checkString(rset0.getString("recpdt"));
			rec.rcpmrflyn = Util.checkString(rset0.getString("rcpmrflyn"));
			rec.rcpmrfldescri = Util.checkString(rset0.getString("rcpmrfldescri"));
			this.rsltcur.add(rec);
		}
	}

	public String rsltcurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = rsltcur.size();
		for(int i=0; i<size; i++){
			SS_L_CVSRECP_LISTRSLTCURRecord rec = (SS_L_CVSRECP_LISTRSLTCURRecord)rsltcur.get(i);
			
			
			String code = rec.acqdt;
			String name = rec.bocd;
			
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
			SS_L_CVSRECP_LISTRSLTCURRecord rec = (SS_L_CVSRECP_LISTRSLTCURRecord)rsltcur.get(i);
			
			
			String code = rec.acqdt;
			String name = rec.bocd;
			
			sb.append("<input name=\"");
			sb.append("acqdt");
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
			SS_L_CVSRECP_LISTRSLTCURRecord rec = (SS_L_CVSRECP_LISTRSLTCURRecord)rsltcur.get(i);
			
			
			String code = rec.acqdt;
			String name = rec.bocd;
			
			sb.append("<input name=\"");
			sb.append("acqdt");
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
	SS_L_CVSRECP_LISTDataSet ds = (SS_L_CVSRECP_LISTDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.rsltcur.size(); i++){
		SS_L_CVSRECP_LISTRSLTCURRecord rsltcurRec = (SS_L_CVSRECP_LISTRSLTCURRecord)ds.rsltcur.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getTotalcnt()%>
<%= ds.getTotalrecpamt()%>
<%= ds.getTotalrecpfee()%>
<%= ds.getRsltcur()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= rsltcurRec.acqdt%>
<%= rsltcurRec.bocd%>
<%= rsltcurRec.bonm%>
<%= rsltcurRec.girono%>
<%= rsltcurRec.rdr_no%>
<%= rsltcurRec.medicd%>
<%= rsltcurRec.subsmappli%>
<%= rsltcurRec.custbrwsno%>
<%= rsltcurRec.amt%>
<%= rsltcurRec.fee%>
<%= rsltcurRec.recpbankcd%>
<%= rsltcurRec.recpbanknm%>
<%= rsltcurRec.recpbrchcd%>
<%= rsltcurRec.recpdt%>
<%= rsltcurRec.rcpmrflyn%>
<%= rsltcurRec.rcpmrfldescri%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Apr 20 16:48:01 KST 2007 */
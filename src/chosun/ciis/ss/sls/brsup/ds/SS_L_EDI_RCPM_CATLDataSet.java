/***************************************************************************************************
* 파일명 : SS_L_EDI_RCPM_CATLDataSet.java
* 기능 : 지로EDI 입금처리결과 목록조회
* 작성일자 : 2004-03-10
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
 * 지로EDI 입금처리결과 목록조회
 *
 */


public class SS_L_EDI_RCPM_CATLDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList rsltcur = new ArrayList();
	public String errcode;
	public String errmsg;
	public long totalcnt;
	public long errcnt;
	public long rcpmcnt;
	public long totalamt;

	public SS_L_EDI_RCPM_CATLDataSet(){}
	public SS_L_EDI_RCPM_CATLDataSet(String errcode, String errmsg, long totalcnt, long errcnt, long rcpmcnt, long totalamt){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.totalcnt = totalcnt;
		this.errcnt = errcnt;
		this.rcpmcnt = rcpmcnt;
		this.totalamt = totalamt;
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

	public void setErrcnt(long errcnt){
		this.errcnt = errcnt;
	}

	public void setRcpmcnt(long rcpmcnt){
		this.rcpmcnt = rcpmcnt;
	}

	public void setTotalamt(long totalamt){
		this.totalamt = totalamt;
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

	public long getErrcnt(){
		return this.errcnt;
	}

	public long getRcpmcnt(){
		return this.rcpmcnt;
	}

	public long getTotalamt(){
		return this.totalamt;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){			return;		}
		this.totalcnt = cstmt.getLong(5);
		this.errcnt = cstmt.getLong(6);
		this.rcpmcnt = cstmt.getLong(7);
		this.totalamt = cstmt.getLong(8);
		ResultSet rset0 = (ResultSet) cstmt.getObject(9);
		while(rset0.next()){
			SS_L_EDI_RCPM_CATLRSLTCURRecord rec = new SS_L_EDI_RCPM_CATLRSLTCURRecord();
			rec.acqdt = Util.checkString(rset0.getString("acqdt"));
			rec.recpdt = Util.checkString(rset0.getString("recpdt"));
			rec.rdr_no = Util.checkString(rset0.getString("rdr_no"));
			rec.rdrnm = Util.checkString(rset0.getString("rdrnm"));
			rec.medinm = Util.checkString(rset0.getString("medinm"));
			rec.subsmappli = Util.checkString(rset0.getString("subsmappli"));
			rec.amt = rset0.getInt("amt");
			rec.rcpmstat = Util.checkString(rset0.getString("rcpmstat"));
			rec.remk = Util.checkString(rset0.getString("remk"));
			this.rsltcur.add(rec);
		}
	}

	public String rsltcurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = rsltcur.size();
		for(int i=0; i<size; i++){
			SS_L_EDI_RCPM_CATLRSLTCURRecord rec = (SS_L_EDI_RCPM_CATLRSLTCURRecord)rsltcur.get(i);


			String code = rec.acqdt;
			String name = rec.recpdt;

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
			SS_L_EDI_RCPM_CATLRSLTCURRecord rec = (SS_L_EDI_RCPM_CATLRSLTCURRecord)rsltcur.get(i);


			String code = rec.acqdt;
			String name = rec.recpdt;

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
			SS_L_EDI_RCPM_CATLRSLTCURRecord rec = (SS_L_EDI_RCPM_CATLRSLTCURRecord)rsltcur.get(i);


			String code = rec.acqdt;
			String name = rec.recpdt;

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
	SS_L_EDI_RCPM_CATLDataSet ds = (SS_L_EDI_RCPM_CATLDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.rsltcur.size(); i++){
		SS_L_EDI_RCPM_CATLRSLTCURRecord rsltcurRec = (SS_L_EDI_RCPM_CATLRSLTCURRecord)ds.rsltcur.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getTotalcnt()%>
<%= ds.getErrcnt()%>
<%= ds.getRcpmcnt()%>
<%= ds.getTotalamt()%>
<%= ds.getRsltcur()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= rsltcurRec.acqdt%>
<%= rsltcurRec.recpdt%>
<%= rsltcurRec.rdr_no%>
<%= rsltcurRec.rdrnm%>
<%= rsltcurRec.medinm%>
<%= rsltcurRec.subsmappli%>
<%= rsltcurRec.amt%>
<%= rsltcurRec.rcpmstat%>
<%= rsltcurRec.remk%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Mar 10 15:47:12 KST 2004 */
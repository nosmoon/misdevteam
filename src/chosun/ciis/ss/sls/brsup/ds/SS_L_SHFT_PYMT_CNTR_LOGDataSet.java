/***************************************************************************************************
* 파일명 : SS_L_SHFT_PYMT_CNTR_LOGDataSet.java
* 기능 : 지국업무지원-Billing자동이체-납부자관리-납부계약 로그내역
* 작성일자 : 2004-04-12
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
 * 지국업무지원-Billing자동이체-납부자관리-납부계약 로그내역
 *
 */


public class SS_L_SHFT_PYMT_CNTR_LOGDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList rsltcur = new ArrayList();
	public String errcode;
	public String errmsg;
	public long totalcnt;

	public SS_L_SHFT_PYMT_CNTR_LOGDataSet(){}
	public SS_L_SHFT_PYMT_CNTR_LOGDataSet(String errcode, String errmsg, long totalcnt){
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
		this.totalcnt = cstmt.getLong(6);
		ResultSet rset0 = (ResultSet) cstmt.getObject(7);
		while(rset0.next()){
			SS_L_SHFT_PYMT_CNTR_LOGRSLTCURRecord rec = new SS_L_SHFT_PYMT_CNTR_LOGRSLTCURRecord();
			rec.bonm = Util.checkString(rset0.getString("bonm"));
			rec.bocd = Util.checkString(rset0.getString("bocd"));
			rec.rdr_no = Util.checkString(rset0.getString("rdr_no"));
			rec.rdrnm = Util.checkString(rset0.getString("rdrnm"));
			rec.medicd = Util.checkString(rset0.getString("medicd"));
			rec.mediynm = Util.checkString(rset0.getString("mediynm"));
			rec.dlvqty = rset0.getInt("dlvqty");
			rec.realsubsamt = rset0.getInt("realsubsamt");
			rec.pymtno = Util.checkString(rset0.getString("pymtno"));
			rec.shftbgnyymm = Util.checkString(rset0.getString("shftbgnyymm"));
			rec.shftstatclsfcd = Util.checkString(rset0.getString("shftstatclsfcd"));
			rec.shftstatclsfnm = Util.checkString(rset0.getString("shftstatclsfnm"));
			rec.subsstat = Util.checkString(rset0.getString("subsstat"));
			this.rsltcur.add(rec);
		}
	}

	public String rsltcurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = rsltcur.size();
		for(int i=0; i<size; i++){
			SS_L_SHFT_PYMT_CNTR_LOGRSLTCURRecord rec = (SS_L_SHFT_PYMT_CNTR_LOGRSLTCURRecord)rsltcur.get(i);


			String code = rec.bonm;
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
			SS_L_SHFT_PYMT_CNTR_LOGRSLTCURRecord rec = (SS_L_SHFT_PYMT_CNTR_LOGRSLTCURRecord)rsltcur.get(i);


			String code = rec.bonm;
			String name = rec.bocd;

			sb.append("<input name=\"");
			sb.append("bonm");
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
			SS_L_SHFT_PYMT_CNTR_LOGRSLTCURRecord rec = (SS_L_SHFT_PYMT_CNTR_LOGRSLTCURRecord)rsltcur.get(i);


			String code = rec.bonm;
			String name = rec.bocd;

			sb.append("<input name=\"");
			sb.append("bonm");
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
	SS_L_SHFT_PYMT_CNTR_LOGDataSet ds = (SS_L_SHFT_PYMT_CNTR_LOGDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.rsltcur.size(); i++){
		SS_L_SHFT_PYMT_CNTR_LOGRSLTCURRecord rsltcurRec = (SS_L_SHFT_PYMT_CNTR_LOGRSLTCURRecord)ds.rsltcur.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getTotalcnt()%>
<%= ds.getRsltcur()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= rsltcurRec.bonm%>
<%= rsltcurRec.bocd%>
<%= rsltcurRec.rdr_no%>
<%= rsltcurRec.rdrnm%>
<%= rsltcurRec.medicd%>
<%= rsltcurRec.mediynm%>
<%= rsltcurRec.dlvqty%>
<%= rsltcurRec.realsubsamt%>
<%= rsltcurRec.pymtno%>
<%= rsltcurRec.shftbgnyymm%>
<%= rsltcurRec.shftstatclsfcd%>
<%= rsltcurRec.shftstatclsfnm%>
<%= rsltcurRec.subsstat%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Apr 12 10:24:30 KST 2004 */
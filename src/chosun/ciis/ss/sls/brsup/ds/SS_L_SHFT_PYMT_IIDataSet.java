/***************************************************************************************************
* 파일명 : SS_L_SHFT_PYMT_II.java
* 기능 :   지국지원-빌링-자동이체-납부자2-납부자목록조회
* 작성일자 : 2004-10-03
* 작성자 : 노상현
***************************************************************************************************/
/***************************************************************************************************
* 수정내역	: 
* 수정자	: 
* 수정일자	:
* 백업		: 
***************************************************************************************************/


package chosun.ciis.ss.sls.brsup.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.brsup.dm.*;
import chosun.ciis.ss.sls.brsup.rec.*;

/**
 * 지국지원-빌링-자동이체-납부자2-납부자목록조회
 *
 */


public class SS_L_SHFT_PYMT_IIDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList rsltcur = new ArrayList();
	public String errcode;
	public String errmsg;

	public SS_L_SHFT_PYMT_IIDataSet(){}
	public SS_L_SHFT_PYMT_IIDataSet(String errcode, String errmsg){
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
		ResultSet rset0 = (ResultSet) cstmt.getObject(5);
		while(rset0.next()){
			SS_L_SHFT_PYMT_IIRSLTCURRecord rec = new SS_L_SHFT_PYMT_IIRSLTCURRecord();
			rec.pymtseq = Util.checkString(rset0.getString("pymtseq"));
			rec.shftclsf = Util.checkString(rset0.getString("shftclsf"));
			rec.shftclsfnm = Util.checkString(rset0.getString("shftclsfnm"));
			rec.prn = Util.checkString(rset0.getString("prn"));
			rec.pymtnm = Util.checkString(rset0.getString("pymtnm"));
			rec.acctno = Util.checkString(rset0.getString("acctno"));
			rec.cardno = Util.checkString(rset0.getString("cardno"));
			rec.cnfm = Util.checkString(rset0.getString("cnfm"));
			rec.bonm = Util.checkString(rset0.getString("bonm"));
			rec.bocd = Util.checkString(rset0.getString("bocd"));
			rec.rdr_no = Util.checkString(rset0.getString("rdr_no"));
			rec.rdrnm = Util.checkString(rset0.getString("rdrnm"));
			rec.medicd = Util.checkString(rset0.getString("medicd"));
			rec.mediynm = Util.checkString(rset0.getString("mediynm"));
			rec.dlvqty = Util.checkString(rset0.getString("dlvqty"));
			rec.realsubsamt = Util.checkString(rset0.getString("realsubsamt"));
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
			SS_L_SHFT_PYMT_IIRSLTCURRecord rec = (SS_L_SHFT_PYMT_IIRSLTCURRecord)rsltcur.get(i);
			
			
			String code = rec.pymtseq;
			String name = rec.shftclsf;
			
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
			SS_L_SHFT_PYMT_IIRSLTCURRecord rec = (SS_L_SHFT_PYMT_IIRSLTCURRecord)rsltcur.get(i);
			
			
			String code = rec.pymtseq;
			String name = rec.shftclsf;
			
			sb.append("<input name=\"");
			sb.append("pymtseq");
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
			SS_L_SHFT_PYMT_IIRSLTCURRecord rec = (SS_L_SHFT_PYMT_IIRSLTCURRecord)rsltcur.get(i);
			
			
			String code = rec.pymtseq;
			String name = rec.shftclsf;
			
			sb.append("<input name=\"");
			sb.append("pymtseq");
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
	SS_L_SHFT_PYMT_IIDataSet ds = (SS_L_SHFT_PYMT_IIDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.rsltcur.size(); i++){
		SS_L_SHFT_PYMT_IIRSLTCURRecord rsltcurRec = (SS_L_SHFT_PYMT_IIRSLTCURRecord)ds.rsltcur.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getRsltcur()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= rsltcurRec.pymtseq%>
<%= rsltcurRec.shftclsf%>
<%= rsltcurRec.shftclsfnm%>
<%= rsltcurRec.prn%>
<%= rsltcurRec.pymtnm%>
<%= rsltcurRec.acctno%>
<%= rsltcurRec.cardno%>
<%= rsltcurRec.cnfm%>
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


/* 작성시간 : Sun Oct 03 20:23:30 KST 2004 */
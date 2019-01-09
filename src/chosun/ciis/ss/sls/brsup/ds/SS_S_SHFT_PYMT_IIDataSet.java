/***************************************************************************************************
* 파일명 : SS_L_SHFT_PYMT_II.java
* 기능 :   지국지원-빌링-자동이체-납부자2-납부자상세조회
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
 * 지국지원-빌링-자동이체-납부자2-납부자상세조회
 *
 */


public class SS_S_SHFT_PYMT_IIDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList cntrcur = new ArrayList();
	public ArrayList rsltcur = new ArrayList();
	public String errcode;
	public String errmsg;

	public SS_S_SHFT_PYMT_IIDataSet(){}
	public SS_S_SHFT_PYMT_IIDataSet(String errcode, String errmsg){
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
			SS_S_SHFT_PYMT_IIRSLTCURRecord rec = new SS_S_SHFT_PYMT_IIRSLTCURRecord();
			rec.pymtseq = Util.checkString(rset0.getString("pymtseq"));
			rec.shftclsf = Util.checkString(rset0.getString("shftclsf"));
			rec.shftclsfnm = Util.checkString(rset0.getString("shftclsfnm"));
			rec.prn = Util.checkString(rset0.getString("prn"));
			rec.pymtnm = Util.checkString(rset0.getString("pymtnm"));
			rec.email = Util.checkString(rset0.getString("email"));
			rec.tel1 = Util.checkString(rset0.getString("tel1"));
			rec.tel2 = Util.checkString(rset0.getString("tel2"));
			rec.tel3 = Util.checkString(rset0.getString("tel3"));
			rec.zip = Util.checkString(rset0.getString("zip"));
			rec.addr = Util.checkString(rset0.getString("addr"));
			rec.addrdtls = Util.checkString(rset0.getString("addrdtls"));
			rec.bankcd = Util.checkString(rset0.getString("bankcd"));
			rec.banknm = Util.checkString(rset0.getString("banknm"));
			rec.acctno = Util.checkString(rset0.getString("acctno"));
			rec.cardcmpycd = Util.checkString(rset0.getString("cardcmpycd"));
			rec.cardno = Util.checkString(rset0.getString("cardno"));
			rec.vdtyprd = Util.checkString(rset0.getString("vdtyprd"));
			rec.rdrnm = Util.checkString(rset0.getString("rdrnm"));
			rec.pymtno = Util.checkString(rset0.getString("pymtno"));
			rec.bocd = Util.checkString(rset0.getString("bocd"));
			rec.bonm = Util.checkString(rset0.getString("bonm"));
			rec.aplyyymm = Util.checkString(rset0.getString("aplyyymm"));
			rec.rdrtel1 = Util.checkString(rset0.getString("rdrtel1"));
			rec.rdrtel2 = Util.checkString(rset0.getString("rdrtel2"));
			rec.rdrtel3 = Util.checkString(rset0.getString("rdrtel3"));
			this.rsltcur.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(6);
		while(rset1.next()){
			SS_S_SHFT_PYMT_IICNTRCURRecord rec = new SS_S_SHFT_PYMT_IICNTRCURRecord();
			rec.aplcdt = Util.checkString(rset1.getString("aplcdt"));
			rec.shftclsf = Util.checkString(rset1.getString("shftclsf"));
			rec.rdr_no = Util.checkString(rset1.getString("rdr_no"));
			rec.mediynm = Util.checkString(rset1.getString("mediynm"));
			rec.subsstat = Util.checkString(rset1.getString("subsstat"));
			this.cntrcur.add(rec);
		}
	}

	public String rsltcurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = rsltcur.size();
		for(int i=0; i<size; i++){
			SS_S_SHFT_PYMT_IIRSLTCURRecord rec = (SS_S_SHFT_PYMT_IIRSLTCURRecord)rsltcur.get(i);
			
			
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

	public String cntrcurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = cntrcur.size();
		for(int i=0; i<size; i++){
			SS_S_SHFT_PYMT_IICNTRCURRecord rec = (SS_S_SHFT_PYMT_IICNTRCURRecord)cntrcur.get(i);
			
			
			String code = rec.aplcdt;
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
			SS_S_SHFT_PYMT_IIRSLTCURRecord rec = (SS_S_SHFT_PYMT_IIRSLTCURRecord)rsltcur.get(i);
			
			
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

	public String cntrcurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = cntrcur.size();
		for(int i=0; i<size; i++){
			SS_S_SHFT_PYMT_IICNTRCURRecord rec = (SS_S_SHFT_PYMT_IICNTRCURRecord)cntrcur.get(i);
			
			
			String code = rec.aplcdt;
			String name = rec.shftclsf;
			
			sb.append("<input name=\"");
			sb.append("aplcdt");
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
			SS_S_SHFT_PYMT_IIRSLTCURRecord rec = (SS_S_SHFT_PYMT_IIRSLTCURRecord)rsltcur.get(i);
			
			
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

	public String cntrcurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = cntrcur.size();
		for(int i=0; i<size; i++){
			SS_S_SHFT_PYMT_IICNTRCURRecord rec = (SS_S_SHFT_PYMT_IICNTRCURRecord)cntrcur.get(i);
			
			
			String code = rec.aplcdt;
			String name = rec.shftclsf;
			
			sb.append("<input name=\"");
			sb.append("aplcdt");
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
	SS_S_SHFT_PYMT_IIDataSet ds = (SS_S_SHFT_PYMT_IIDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.rsltcur.size(); i++){
		SS_S_SHFT_PYMT_IIRSLTCURRecord rsltcurRec = (SS_S_SHFT_PYMT_IIRSLTCURRecord)ds.rsltcur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.cntrcur.size(); i++){
		SS_S_SHFT_PYMT_IICNTRCURRecord cntrcurRec = (SS_S_SHFT_PYMT_IICNTRCURRecord)ds.cntrcur.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getRsltcur()%>
<%= ds.getCntrcur()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= rsltcurRec.pymtseq%>
<%= rsltcurRec.shftclsf%>
<%= rsltcurRec.shftclsfnm%>
<%= rsltcurRec.prn%>
<%= rsltcurRec.pymtnm%>
<%= rsltcurRec.email%>
<%= rsltcurRec.tel1%>
<%= rsltcurRec.tel2%>
<%= rsltcurRec.tel3%>
<%= rsltcurRec.zip%>
<%= rsltcurRec.addr%>
<%= rsltcurRec.addrdtls%>
<%= rsltcurRec.bankcd%>
<%= rsltcurRec.banknm%>
<%= rsltcurRec.acctno%>
<%= rsltcurRec.cardcmpycd%>
<%= rsltcurRec.cardno%>
<%= rsltcurRec.vdtyprd%>
<%= rsltcurRec.rdrnm%>
<%= rsltcurRec.pymtno%>
<%= rsltcurRec.bocd%>
<%= rsltcurRec.bonm%>
<%= rsltcurRec.aplyyymm%>
<%= rsltcurRec.rdrtel1%>
<%= rsltcurRec.rdrtel2%>
<%= rsltcurRec.rdrtel3%>
<%= cntrcurRec.aplcdt%>
<%= cntrcurRec.shftclsf%>
<%= cntrcurRec.rdr_no%>
<%= cntrcurRec.mediynm%>
<%= cntrcurRec.subsstat%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Sun Oct 03 20:39:16 KST 2004 */
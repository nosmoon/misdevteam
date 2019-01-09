/***************************************************************************************************
* 파일명 : PS_S_APLC.java
* 기능   : 자동이체신청 상세조회
* 작성일자 : 2006-04-19
* 작성자 : 전현표
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.ps.pbs.bill.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ps.pbs.bill.dm.*;
import chosun.ciis.ps.pbs.bill.rec.*;

/**
 * 출판국 -자동이체신청 상세조회
 *
 */

public class PS_S_APLCDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList rsltcur = new ArrayList();
	public String errcode;
	public String errmsg;

	public PS_S_APLCDataSet(){}
	public PS_S_APLCDataSet(String errcode, String errmsg){
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
			PS_S_APLCRSLTCURRecord rec = new PS_S_APLCRSLTCURRecord();
			rec.aplcdt = Util.checkString(rset0.getString("aplcdt"));
			rec.shftclsf = Util.checkString(rset0.getString("shftclsf"));
			rec.aplcno = Util.checkString(rset0.getString("aplcno"));
			rec.shftclsfnm = Util.checkString(rset0.getString("shftclsfnm"));
			rec.pymtno_2 = Util.checkString(rset0.getString("pymtno_2"));
			rec.pymtnm = Util.checkString(rset0.getString("pymtnm"));
			rec.rdrnm = Util.checkString(rset0.getString("rdrnm"));
			rec.zip = Util.checkString(rset0.getString("zip"));
			rec.dlvaddr = Util.checkString(rset0.getString("dlvaddr"));
			rec.dlvaddrdtls = Util.checkString(rset0.getString("dlvaddrdtls"));
			rec.rdrtel1 = Util.checkString(rset0.getString("rdrtel1"));
			rec.rdrtel2 = Util.checkString(rset0.getString("rdrtel2"));
			rec.rdrtel3 = Util.checkString(rset0.getString("rdrtel3"));
			rec.aplyyymm = Util.checkString(rset0.getString("aplyyymm"));
			rec.rdr_no = Util.checkString(rset0.getString("rdr_no"));
			rec.medicd = Util.checkString(rset0.getString("medicd"));
			rec.medinm = Util.checkString(rset0.getString("medinm"));
			rec.termsubsno = Util.checkString(rset0.getString("termsubsno"));
			rec.realsellamt = rset0.getInt("realsellamt");
			rec.agrmnt_list = Util.checkString(rset0.getString("agrmnt_list"));
			rec.clamt_list = Util.checkString(rset0.getString("clamt_list"));
			rec.remk = Util.checkString(rset0.getString("remk"));
			rec.bocd = Util.checkString(rset0.getString("bocd"));
			rec.bonm = Util.checkString(rset0.getString("bonm"));
			rec.subsfrser_no = Util.checkString(rset0.getString("subsfrser_no"));
			rec.substoser_no = Util.checkString(rset0.getString("substoser_no"));
			rec.cardcmpycd = Util.checkString(rset0.getString("cardcmpycd"));
			rec.cardno = Util.checkString(rset0.getString("cardno"));
			rec.vdtyprd = Util.checkString(rset0.getString("vdtyprd"));
			rec.pymttel1 = Util.checkString(rset0.getString("pymttel1"));
			rec.pymttel2 = Util.checkString(rset0.getString("pymttel2"));
			rec.pymttel3 = Util.checkString(rset0.getString("pymttel3"));
			rec.recpinstt = Util.checkString(rset0.getString("recpinstt"));
			rec.acctno = Util.checkString(rset0.getString("acctno"));
			rec.prn = Util.checkString(rset0.getString("prn"));
			rec.email = Util.checkString(rset0.getString("email"));
			rec.aplcpathcd = Util.checkString(rset0.getString("aplcpathcd"));
			rec.acpnpointcd = Util.checkString(rset0.getString("acpnpointcd"));
			rec.acpnplacclsfcd = Util.checkString(rset0.getString("acpnplacclsfcd"));
			rec.camptypecd = Util.checkString(rset0.getString("camptypecd"));
			rec.campid = Util.checkString(rset0.getString("campid"));
			rec.campexecclsfcd = Util.checkString(rset0.getString("campexecclsfcd"));
			rec.campobjid = Util.checkString(rset0.getString("campobjid"));
			rec.campchnlcd = Util.checkString(rset0.getString("campchnlcd"));
			rec.aplcclsf = Util.checkString(rset0.getString("aplcclsf"));
			this.rsltcur.add(rec);
		}
	}

	public String rsltcurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = rsltcur.size();
		for(int i=0; i<size; i++){
			PS_S_APLCRSLTCURRecord rec = (PS_S_APLCRSLTCURRecord)rsltcur.get(i);
			
			
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
			PS_S_APLCRSLTCURRecord rec = (PS_S_APLCRSLTCURRecord)rsltcur.get(i);
			
			
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
			PS_S_APLCRSLTCURRecord rec = (PS_S_APLCRSLTCURRecord)rsltcur.get(i);
			
			
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
	PS_S_APLCDataSet ds = (PS_S_APLCDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.rsltcur.size(); i++){
		PS_S_APLCRSLTCURRecord rsltcurRec = (PS_S_APLCRSLTCURRecord)ds.rsltcur.get(i);%>
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

<%= rsltcurRec.aplcdt%>
<%= rsltcurRec.shftclsf%>
<%= rsltcurRec.aplcno%>
<%= rsltcurRec.shftclsfnm%>
<%= rsltcurRec.pymtno_2%>
<%= rsltcurRec.pymtnm%>
<%= rsltcurRec.rdrnm%>
<%= rsltcurRec.zip%>
<%= rsltcurRec.dlvaddr%>
<%= rsltcurRec.dlvaddrdtls%>
<%= rsltcurRec.rdrtel1%>
<%= rsltcurRec.rdrtel2%>
<%= rsltcurRec.rdrtel3%>
<%= rsltcurRec.aplyyymm%>
<%= rsltcurRec.rdr_no%>
<%= rsltcurRec.medicd%>
<%= rsltcurRec.medinm%>
<%= rsltcurRec.termsubsno%>
<%= rsltcurRec.realsellamt%>
<%= rsltcurRec.agrmnt_list%>
<%= rsltcurRec.clamt_list%>
<%= rsltcurRec.remk%>
<%= rsltcurRec.bocd%>
<%= rsltcurRec.bonm%>
<%= rsltcurRec.subsfrser_no%>
<%= rsltcurRec.substoser_no%>
<%= rsltcurRec.cardcmpycd%>
<%= rsltcurRec.cardno%>
<%= rsltcurRec.vdtyprd%>
<%= rsltcurRec.pymttel1%>
<%= rsltcurRec.pymttel2%>
<%= rsltcurRec.pymttel3%>
<%= rsltcurRec.recpinstt%>
<%= rsltcurRec.acctno%>
<%= rsltcurRec.prn%>
<%= rsltcurRec.email%>
<%= rsltcurRec.aplcpathcd%>
<%= rsltcurRec.acpnpointcd%>
<%= rsltcurRec.acpnplacclsfcd%>
<%= rsltcurRec.camptypecd%>
<%= rsltcurRec.campid%>
<%= rsltcurRec.campexecclsfcd%>
<%= rsltcurRec.campobjid%>
<%= rsltcurRec.campchnlcd%>
<%= rsltcurRec.aplcclsf%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Sep 29 11:15:37 KST 2006 */
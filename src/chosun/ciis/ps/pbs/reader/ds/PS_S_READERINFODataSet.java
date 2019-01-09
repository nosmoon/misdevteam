/***************************************************************************************************
* 파일명   : PS_S_READERINFO.java
* 기능     : 독자-구독자 상세조회
* 작성일자 : 2004-07-24
* 작성자   : 김상옥
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
 * 독자-구독자 상세조회 
 */

public class PS_S_READERINFODataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList bns_bookaplccur = new ArrayList();
	public ArrayList readinfocur = new ArrayList();
	public String errcode;
	public String errmsg;
	public String sysdate;

	public PS_S_READERINFODataSet(){}
	public PS_S_READERINFODataSet(String errcode, String errmsg, String sysdate){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.sysdate = sysdate;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setSysdate(String sysdate){
		this.sysdate = sysdate;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getSysdate(){
		return this.sysdate;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){			return;		}
		this.sysdate = Util.checkString(cstmt.getString(7));
		ResultSet rset0 = (ResultSet) cstmt.getObject(8);
		while(rset0.next()){
			PS_S_READERINFOREADINFOCURRecord rec = new PS_S_READERINFOREADINFOCURRecord();
			rec.rdr_no = Util.checkString(rset0.getString("rdr_no"));
			rec.rdrnm = Util.checkString(rset0.getString("rdrnm"));
			rec.medicd = Util.checkString(rset0.getString("medicd"));
			rec.bocd = Util.checkString(rset0.getString("bocd"));
			rec.bonm = Util.checkString(rset0.getString("bonm"));
			rec.aplcdt = Util.checkString(rset0.getString("aplcdt"));
			rec.delidt = Util.checkString(rset0.getString("delidt"));
			rec.subsyys = Util.checkString(rset0.getString("subsyys"));
			rec.subs_serno = Util.checkString(rset0.getString("subs_serno"));
			rec.acqnm = Util.checkString(rset0.getString("acqnm"));
			rec.rdrtel_no = Util.checkString(rset0.getString("rdrtel_no"));
			rec.rdrptph_no = Util.checkString(rset0.getString("rdrptph_no"));
			rec.rdroffinm = Util.checkString(rset0.getString("rdroffinm"));
			rec.rdroffitel_no = Util.checkString(rset0.getString("rdroffitel_no"));
			rec.rdrposi = Util.checkString(rset0.getString("rdrposi"));
			rec.prn = Util.checkString(rset0.getString("prn"));
			rec.email = Util.checkString(rset0.getString("email"));
			rec.bidt = Util.checkString(rset0.getString("bidt"));
			rec.weddyn = Util.checkString(rset0.getString("weddyn"));
			rec.ocpnclsfcd = Util.checkString(rset0.getString("ocpnclsfcd"));
			rec.resiclsfcd = Util.checkString(rset0.getString("resiclsfcd"));
			rec.resitypecd = Util.checkString(rset0.getString("resitypecd"));
			rec.rshpclsfcd = Util.checkString(rset0.getString("rshpclsfcd"));
			rec.dlvaddr = Util.checkString(rset0.getString("dlvaddr"));
			rec.paty_clsfcd = Util.checkString(rset0.getString("paty_clsfcd"));
			rec.sendmthd = Util.checkString(rset0.getString("sendmthd"));
			rec.recpclsf = Util.checkString(rset0.getString("recpclsf"));
			rec.aplc_persflnm = Util.checkString(rset0.getString("aplc_persflnm"));
			rec.aplc_persoffinm = Util.checkString(rset0.getString("aplc_persoffinm"));
			rec.aplc_persposi = Util.checkString(rset0.getString("aplc_persposi"));
			rec.aplc_perstel_no = Util.checkString(rset0.getString("aplc_perstel_no"));
			rec.aplc_persptph_no = Util.checkString(rset0.getString("aplc_persptph_no"));
			rec.clamplflnm = Util.checkString(rset0.getString("clamplflnm"));
			rec.clamploffinm = Util.checkString(rset0.getString("clamploffinm"));
			rec.clamplposi = Util.checkString(rset0.getString("clamplposi"));
			rec.clampltel_no = Util.checkString(rset0.getString("clampltel_no"));
			rec.clamplptph_no = Util.checkString(rset0.getString("clamplptph_no"));
			rec.clampladdr = Util.checkString(rset0.getString("clampladdr"));
			rec.acpntypeclsf = Util.checkString(rset0.getString("acpntypeclsf"));
			rec.sendyncd = Util.checkString(rset0.getString("sendyncd"));
			rec.alonpaycd = Util.checkString(rset0.getString("alonpaycd"));
			rec.alonpaypointcd = Util.checkString(rset0.getString("alonpaypointcd"));
			rec.amno = Util.checkString(rset0.getString("amno"));
			rec.mang_empno = Util.checkString(rset0.getString("mang_empno"));
			rec.hdqtemp_no = Util.checkString(rset0.getString("hdqtemp_no"));
			rec.rdr_extnno = Util.checkString(rset0.getString("rdr_extnno"));
			rec.arbtno = Util.checkString(rset0.getString("arbtno"));
			rec.taxstmtexne = Util.checkString(rset0.getString("taxstmtexne"));
			rec.taxstmtissudt = Util.checkString(rset0.getString("taxstmtissudt"));
			rec.memo = Util.checkString(rset0.getString("memo"));
			rec.sellamt = Util.checkString(rset0.getString("sellamt"));
			rec.dcamt = Util.checkString(rset0.getString("dcamt"));
			rec.realsellamt = Util.checkString(rset0.getString("realsellamt"));
			rec.ttl_rcpmamt = Util.checkString(rset0.getString("ttl_rcpmamt"));
			rec.un_clamtamt = Util.checkString(rset0.getString("un_clamtamt"));
			rec.rcpmmthd = Util.checkString(rset0.getString("rcpmmthd"));
			rec.rcpmenddt = Util.checkString(rset0.getString("rcpmenddt"));
			rec.payalonamt = Util.checkString(rset0.getString("payalonamt"));
			rec.rcpm_list = Util.checkString(rset0.getString("rcpm_list"));
			rec.rdrgrad_dt = Util.checkString(rset0.getString("rdrgrad_dt"));
			rec.aplcpathnm = Util.checkString(rset0.getString("aplcpathnm"));
			rec.rdr_extntypenm = Util.checkString(rset0.getString("rdr_extntypenm"));
			rec.suspresnnm = Util.checkString(rset0.getString("suspresnnm"));
			rec.acq_bonm = Util.checkString(rset0.getString("acq_bonm"));
			rec.boprocdt = rset0.getTimestamp("boprocdt");
			rec.deli_empno = Util.checkString(rset0.getString("deli_empno"));
			this.readinfocur.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(9);
		while(rset1.next()){
			PS_S_READERINFOBNS_BOOKAPLCCURRecord rec = new PS_S_READERINFOBNS_BOOKAPLCCURRecord();
			rec.rdr_no = Util.checkString(rset1.getString("rdr_no"));
			rec.medicd = Util.checkString(rset1.getString("medicd"));
			rec.termsubsno = Util.checkString(rset1.getString("termsubsno"));
			rec.aplcseq = Util.checkString(rset1.getString("aplcseq"));
			rec.recppersnm = Util.checkString(rset1.getString("recppersnm"));
			rec.recpperszip = Util.checkString(rset1.getString("recpperszip"));
			rec.recppersaddr = Util.checkString(rset1.getString("recppersaddr"));
			rec.recppersdtlsaddr = Util.checkString(rset1.getString("recppersdtlsaddr"));
			rec.rptvaddryn = Util.checkString(rset1.getString("rptvaddryn"));
			rec.memo = Util.checkString(rset1.getString("memo"));
			rec.bns_booksendtype = Util.checkString(rset1.getString("bns_booksendtype"));
			rec.bns_booksendtypenm = Util.checkString(rset1.getString("bns_booksendtypenm"));
			rec.sendmthd = Util.checkString(rset1.getString("sendmthd"));
			rec.sendmthdnm = Util.checkString(rset1.getString("sendmthdnm"));
			rec.bosendyn = Util.checkString(rset1.getString("bosendyn"));
			rec.brch_offisend_dt = Util.checkString(rset1.getString("brch_offisend_dt"));
			rec.hdqtsendyn = Util.checkString(rset1.getString("hdqtsendyn"));
			rec.hdqtsend_dt = Util.checkString(rset1.getString("hdqtsend_dt"));
			rec.bns_booknm = Util.checkString(rset1.getString("bns_booknm"));
			rec.incmgpersnm = Util.checkString(rset1.getString("incmgpersnm"));
			this.bns_bookaplccur.add(rec);
		}
	}

	public String readinfocurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = readinfocur.size();
		for(int i=0; i<size; i++){
			PS_S_READERINFOREADINFOCURRecord rec = (PS_S_READERINFOREADINFOCURRecord)readinfocur.get(i);
			
			
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

	public String bns_bookaplccurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = bns_bookaplccur.size();
		for(int i=0; i<size; i++){
			PS_S_READERINFOBNS_BOOKAPLCCURRecord rec = (PS_S_READERINFOBNS_BOOKAPLCCURRecord)bns_bookaplccur.get(i);
			
			
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

	public String readinfocurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = readinfocur.size();
		for(int i=0; i<size; i++){
			PS_S_READERINFOREADINFOCURRecord rec = (PS_S_READERINFOREADINFOCURRecord)readinfocur.get(i);
			
			
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

	public String bns_bookaplccurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = bns_bookaplccur.size();
		for(int i=0; i<size; i++){
			PS_S_READERINFOBNS_BOOKAPLCCURRecord rec = (PS_S_READERINFOBNS_BOOKAPLCCURRecord)bns_bookaplccur.get(i);
			
			
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

	public String readinfocurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = readinfocur.size();
		for(int i=0; i<size; i++){
			PS_S_READERINFOREADINFOCURRecord rec = (PS_S_READERINFOREADINFOCURRecord)readinfocur.get(i);
			
			
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

	public String bns_bookaplccurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = bns_bookaplccur.size();
		for(int i=0; i<size; i++){
			PS_S_READERINFOBNS_BOOKAPLCCURRecord rec = (PS_S_READERINFOBNS_BOOKAPLCCURRecord)bns_bookaplccur.get(i);
			
			
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
	PS_S_READERINFODataSet ds = (PS_S_READERINFODataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.readinfocur.size(); i++){
		PS_S_READERINFOREADINFOCURRecord readinfocurRec = (PS_S_READERINFOREADINFOCURRecord)ds.readinfocur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.bns_bookaplccur.size(); i++){
		PS_S_READERINFOBNS_BOOKAPLCCURRecord bns_bookaplccurRec = (PS_S_READERINFOBNS_BOOKAPLCCURRecord)ds.bns_bookaplccur.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getSysdate()%>
<%= ds.getReadinfocur()%>
<%= ds.getBns_bookaplccur()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= readinfocurRec.rdr_no%>
<%= readinfocurRec.rdrnm%>
<%= readinfocurRec.medicd%>
<%= readinfocurRec.bocd%>
<%= readinfocurRec.bonm%>
<%= readinfocurRec.aplcdt%>
<%= readinfocurRec.delidt%>
<%= readinfocurRec.subsyys%>
<%= readinfocurRec.subs_serno%>
<%= readinfocurRec.acqnm%>
<%= readinfocurRec.rdrtel_no%>
<%= readinfocurRec.rdrptph_no%>
<%= readinfocurRec.rdroffinm%>
<%= readinfocurRec.rdroffitel_no%>
<%= readinfocurRec.rdrposi%>
<%= readinfocurRec.prn%>
<%= readinfocurRec.email%>
<%= readinfocurRec.bidt%>
<%= readinfocurRec.weddyn%>
<%= readinfocurRec.ocpnclsfcd%>
<%= readinfocurRec.resiclsfcd%>
<%= readinfocurRec.resitypecd%>
<%= readinfocurRec.rshpclsfcd%>
<%= readinfocurRec.dlvaddr%>
<%= readinfocurRec.paty_clsfcd%>
<%= readinfocurRec.sendmthd%>
<%= readinfocurRec.recpclsf%>
<%= readinfocurRec.aplc_persflnm%>
<%= readinfocurRec.aplc_persoffinm%>
<%= readinfocurRec.aplc_persposi%>
<%= readinfocurRec.aplc_perstel_no%>
<%= readinfocurRec.aplc_persptph_no%>
<%= readinfocurRec.clamplflnm%>
<%= readinfocurRec.clamploffinm%>
<%= readinfocurRec.clamplposi%>
<%= readinfocurRec.clampltel_no%>
<%= readinfocurRec.clamplptph_no%>
<%= readinfocurRec.clampladdr%>
<%= readinfocurRec.acpntypeclsf%>
<%= readinfocurRec.sendyncd%>
<%= readinfocurRec.alonpaycd%>
<%= readinfocurRec.alonpaypointcd%>
<%= readinfocurRec.amno%>
<%= readinfocurRec.mang_empno%>
<%= readinfocurRec.hdqtemp_no%>
<%= readinfocurRec.rdr_extnno%>
<%= readinfocurRec.arbtno%>
<%= readinfocurRec.taxstmtexne%>
<%= readinfocurRec.taxstmtissudt%>
<%= readinfocurRec.memo%>
<%= readinfocurRec.sellamt%>
<%= readinfocurRec.dcamt%>
<%= readinfocurRec.realsellamt%>
<%= readinfocurRec.ttl_rcpmamt%>
<%= readinfocurRec.un_clamtamt%>
<%= readinfocurRec.rcpmmthd%>
<%= readinfocurRec.rcpmenddt%>
<%= readinfocurRec.payalonamt%>
<%= readinfocurRec.rcpm_list%>
<%= readinfocurRec.rdrgrad_dt%>
<%= readinfocurRec.aplcpathnm%>
<%= readinfocurRec.rdr_extntypenm%>
<%= readinfocurRec.suspresnnm%>
<%= readinfocurRec.acq_bonm%>
<%= readinfocurRec.boprocdt%>
<%= readinfocurRec.deli_empno%>
<%= bns_bookaplccurRec.rdr_no%>
<%= bns_bookaplccurRec.medicd%>
<%= bns_bookaplccurRec.termsubsno%>
<%= bns_bookaplccurRec.aplcseq%>
<%= bns_bookaplccurRec.recppersnm%>
<%= bns_bookaplccurRec.recpperszip%>
<%= bns_bookaplccurRec.recppersaddr%>
<%= bns_bookaplccurRec.recppersdtlsaddr%>
<%= bns_bookaplccurRec.rptvaddryn%>
<%= bns_bookaplccurRec.memo%>
<%= bns_bookaplccurRec.bns_booksendtype%>
<%= bns_bookaplccurRec.bns_booksendtypenm%>
<%= bns_bookaplccurRec.sendmthd%>
<%= bns_bookaplccurRec.sendmthdnm%>
<%= bns_bookaplccurRec.bosendyn%>
<%= bns_bookaplccurRec.brch_offisend_dt%>
<%= bns_bookaplccurRec.hdqtsendyn%>
<%= bns_bookaplccurRec.hdqtsend_dt%>
<%= bns_bookaplccurRec.bns_booknm%>
<%= bns_bookaplccurRec.incmgpersnm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Jun 30 15:58:28 KST 2008 */
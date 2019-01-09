/***************************************************************************************************
* 파일명 : SL_L_RDR_DTLS_SECH.java
* 기능 : 독자 목록조회(수금형) ( 독자+매체 ) 조회
* 작성일자 : 2003-12-20
* 작성자 : 김영윤
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 : 수금내역조회 여부 추가
* 수정자 : 노상현
* 수정일자 : 2005-10-31
* 백업 :
***************************************************************************************************/


package chosun.ciis.ss.sal.common.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sal.common.dm.*;
import chosun.ciis.ss.sal.common.rec.*;

/**
 *공통-독자목록상세조회(수금형)
 */

public class SL_L_RDR_DTLS_SECHDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList rdrdtlscur = new ArrayList();
	public ArrayList mmcur = new ArrayList();
	public String errcode;
	public String errmsg;
	public long totalcnt;

	public SL_L_RDR_DTLS_SECHDataSet(){}
	public SL_L_RDR_DTLS_SECHDataSet(String errcode, String errmsg, long totalcnt){
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
		this.totalcnt = cstmt.getLong(12);
		ResultSet rset0 = (ResultSet) cstmt.getObject(13);
		while(rset0.next()){
			SL_L_RDR_DTLS_SECHMMCURRecord rec = new SL_L_RDR_DTLS_SECHMMCURRecord();
			rec.m1 = Util.checkString(rset0.getString("m1"));
			rec.m2 = Util.checkString(rset0.getString("m2"));
			rec.m3 = Util.checkString(rset0.getString("m3"));
			rec.m4 = Util.checkString(rset0.getString("m4"));
			rec.m5 = Util.checkString(rset0.getString("m5"));
			rec.m6 = Util.checkString(rset0.getString("m6"));
			rec.m7 = Util.checkString(rset0.getString("m7"));
			rec.m8 = Util.checkString(rset0.getString("m8"));
			rec.m9 = Util.checkString(rset0.getString("m9"));
			rec.m10 = Util.checkString(rset0.getString("m10"));
			rec.m11 = Util.checkString(rset0.getString("m11"));
			rec.m12 = Util.checkString(rset0.getString("m12"));
			this.mmcur.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(14);
		while(rset1.next()){
			SL_L_RDR_DTLS_SECHRDRDTLSCURRecord rec = new SL_L_RDR_DTLS_SECHRDRDTLSCURRecord();
			rec.rdr_no = Util.checkString(rset1.getString("rdr_no"));
			rec.paty_clsfcd = Util.checkString(rset1.getString("paty_clsfcd"));
			rec.natnclsfcd = Util.checkString(rset1.getString("natnclsfcd"));
			rec.onlmembid = Util.checkString(rset1.getString("onlmembid"));
			rec.rdrnm = Util.checkString(rset1.getString("rdrnm"));
			rec.prn = Util.checkString(rset1.getString("prn"));
			rec.ernno = Util.checkString(rset1.getString("ernno"));
			rec.email = Util.checkString(rset1.getString("email"));
			rec.dlvzip = Util.checkString(rset1.getString("dlvzip"));
			rec.dlvcd = Util.checkString(rset1.getString("dlvcd"));
			rec.dlvaddr = Util.checkString(rset1.getString("dlvaddr"));
			rec.dlvdtlsaddr = Util.checkString(rset1.getString("dlvdtlsaddr"));
			rec.dlvdong = Util.checkString(rset1.getString("dlvdong"));
			rec.dlvser_no = Util.checkString(rset1.getString("dlvser_no"));
			rec.dlvbnji = Util.checkString(rset1.getString("dlvbnji"));
			rec.dlvteamcd = Util.checkString(rset1.getString("dlvteamcd"));
			rec.dlvdstccd = Util.checkString(rset1.getString("dlvdstccd"));
			rec.dlvno = Util.checkString(rset1.getString("dlvno"));
			rec.dlvintvno = Util.checkString(rset1.getString("dlvintvno"));
			rec.dlvmthdcd = Util.checkString(rset1.getString("dlvmthdcd"));
			rec.dlvqty = Util.checkString(rset1.getString("dlvqty"));
			rec.rdrtel_no1 = Util.checkString(rset1.getString("rdrtel_no1"));
			rec.rdrtel_no2 = Util.checkString(rset1.getString("rdrtel_no2"));
			rec.rdrtel_no3 = Util.checkString(rset1.getString("rdrtel_no3"));
			rec.rdrptph_no1 = Util.checkString(rset1.getString("rdrptph_no1"));
			rec.rdrptph_no2 = Util.checkString(rset1.getString("rdrptph_no2"));
			rec.rdrptph_no3 = Util.checkString(rset1.getString("rdrptph_no3"));
			rec.realsubsamt = rset1.getInt("realsubsamt");
			rec.subsamt = rset1.getInt("subsamt");
			rec.dscnamt = rset1.getInt("dscnamt");
			rec.rptvsubsdt = Util.checkString(rset1.getString("rptvsubsdt"));
			rec.rptvrdr_extndt = Util.checkString(rset1.getString("rptvrdr_extndt"));
			rec.rptvrdr_extntype = Util.checkString(rset1.getString("rptvrdr_extntype"));
			rec.addrnm = Util.checkString(rset1.getString("addrnm"));
			rec.medicd = Util.checkString(rset1.getString("medicd"));
			rec.cimgtcd2 = Util.checkString(rset1.getString("cimgtcd2"));
			rec.valqty = rset1.getInt("valqty");
			rec.no_valqty = rset1.getInt("no_valqty");
			rec.pre_valqty = rset1.getInt("pre_valqty");
			rec.clamtmthdcd = Util.checkString(rset1.getString("clamtmthdcd"));
			rec.m1 = Util.checkString(rset1.getString("m1"));
			rec.m2 = Util.checkString(rset1.getString("m2"));
			rec.m3 = Util.checkString(rset1.getString("m3"));
			rec.m4 = Util.checkString(rset1.getString("m4"));
			rec.m5 = Util.checkString(rset1.getString("m5"));
			rec.m6 = Util.checkString(rset1.getString("m6"));
			rec.m7 = Util.checkString(rset1.getString("m7"));
			rec.m8 = Util.checkString(rset1.getString("m8"));
			rec.m9 = Util.checkString(rset1.getString("m9"));
			rec.m10 = Util.checkString(rset1.getString("m10"));
			rec.m11 = Util.checkString(rset1.getString("m11"));
			rec.m12 = Util.checkString(rset1.getString("m12"));
			rec.rptvvalmm = Util.checkString(rset1.getString("rptvvalmm"));
			this.rdrdtlscur.add(rec);
		}
	}

	public String mmcurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = mmcur.size();
		for(int i=0; i<size; i++){
			SL_L_RDR_DTLS_SECHMMCURRecord rec = (SL_L_RDR_DTLS_SECHMMCURRecord)mmcur.get(i);
			
			
			String code = rec.m1;
			String name = rec.m2;
			
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

	public String rdrdtlscurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = rdrdtlscur.size();
		for(int i=0; i<size; i++){
			SL_L_RDR_DTLS_SECHRDRDTLSCURRecord rec = (SL_L_RDR_DTLS_SECHRDRDTLSCURRecord)rdrdtlscur.get(i);
			
			
			String code = rec.rdr_no;
			String name = rec.paty_clsfcd;
			
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

	public String mmcurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = mmcur.size();
		for(int i=0; i<size; i++){
			SL_L_RDR_DTLS_SECHMMCURRecord rec = (SL_L_RDR_DTLS_SECHMMCURRecord)mmcur.get(i);
			
			
			String code = rec.m1;
			String name = rec.m2;
			
			sb.append("<input name=\"");
			sb.append("m1");
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

	public String rdrdtlscurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = rdrdtlscur.size();
		for(int i=0; i<size; i++){
			SL_L_RDR_DTLS_SECHRDRDTLSCURRecord rec = (SL_L_RDR_DTLS_SECHRDRDTLSCURRecord)rdrdtlscur.get(i);
			
			
			String code = rec.rdr_no;
			String name = rec.paty_clsfcd;
			
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

	public String mmcurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = mmcur.size();
		for(int i=0; i<size; i++){
			SL_L_RDR_DTLS_SECHMMCURRecord rec = (SL_L_RDR_DTLS_SECHMMCURRecord)mmcur.get(i);
			
			
			String code = rec.m1;
			String name = rec.m2;
			
			sb.append("<input name=\"");
			sb.append("m1");
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

	public String rdrdtlscurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = rdrdtlscur.size();
		for(int i=0; i<size; i++){
			SL_L_RDR_DTLS_SECHRDRDTLSCURRecord rec = (SL_L_RDR_DTLS_SECHRDRDTLSCURRecord)rdrdtlscur.get(i);
			
			
			String code = rec.rdr_no;
			String name = rec.paty_clsfcd;
			
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
	SL_L_RDR_DTLS_SECHDataSet ds = (SL_L_RDR_DTLS_SECHDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.mmcur.size(); i++){
		SL_L_RDR_DTLS_SECHMMCURRecord mmcurRec = (SL_L_RDR_DTLS_SECHMMCURRecord)ds.mmcur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.rdrdtlscur.size(); i++){
		SL_L_RDR_DTLS_SECHRDRDTLSCURRecord rdrdtlscurRec = (SL_L_RDR_DTLS_SECHRDRDTLSCURRecord)ds.rdrdtlscur.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getTotalcnt()%>
<%= ds.getMmcur()%>
<%= ds.getRdrdtlscur()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= mmcurRec.m1%>
<%= mmcurRec.m2%>
<%= mmcurRec.m3%>
<%= mmcurRec.m4%>
<%= mmcurRec.m5%>
<%= mmcurRec.m6%>
<%= mmcurRec.m7%>
<%= mmcurRec.m8%>
<%= mmcurRec.m9%>
<%= mmcurRec.m10%>
<%= mmcurRec.m11%>
<%= mmcurRec.m12%>
<%= rdrdtlscurRec.rdr_no%>
<%= rdrdtlscurRec.paty_clsfcd%>
<%= rdrdtlscurRec.natnclsfcd%>
<%= rdrdtlscurRec.onlmembid%>
<%= rdrdtlscurRec.rdrnm%>
<%= rdrdtlscurRec.prn%>
<%= rdrdtlscurRec.ernno%>
<%= rdrdtlscurRec.email%>
<%= rdrdtlscurRec.dlvzip%>
<%= rdrdtlscurRec.dlvcd%>
<%= rdrdtlscurRec.dlvaddr%>
<%= rdrdtlscurRec.dlvdtlsaddr%>
<%= rdrdtlscurRec.dlvdong%>
<%= rdrdtlscurRec.dlvser_no%>
<%= rdrdtlscurRec.dlvbnji%>
<%= rdrdtlscurRec.dlvteamcd%>
<%= rdrdtlscurRec.dlvdstccd%>
<%= rdrdtlscurRec.dlvno%>
<%= rdrdtlscurRec.dlvintvno%>
<%= rdrdtlscurRec.dlvmthdcd%>
<%= rdrdtlscurRec.dlvqty%>
<%= rdrdtlscurRec.rdrtel_no1%>
<%= rdrdtlscurRec.rdrtel_no2%>
<%= rdrdtlscurRec.rdrtel_no3%>
<%= rdrdtlscurRec.rdrptph_no1%>
<%= rdrdtlscurRec.rdrptph_no2%>
<%= rdrdtlscurRec.rdrptph_no3%>
<%= rdrdtlscurRec.realsubsamt%>
<%= rdrdtlscurRec.subsamt%>
<%= rdrdtlscurRec.dscnamt%>
<%= rdrdtlscurRec.rptvsubsdt%>
<%= rdrdtlscurRec.rptvrdr_extndt%>
<%= rdrdtlscurRec.rptvrdr_extntype%>
<%= rdrdtlscurRec.addrnm%>
<%= rdrdtlscurRec.medicd%>
<%= rdrdtlscurRec.cimgtcd2%>
<%= rdrdtlscurRec.valqty%>
<%= rdrdtlscurRec.no_valqty%>
<%= rdrdtlscurRec.pre_valqty%>
<%= rdrdtlscurRec.clamtmthdcd%>
<%= rdrdtlscurRec.m1%>
<%= rdrdtlscurRec.m2%>
<%= rdrdtlscurRec.m3%>
<%= rdrdtlscurRec.m4%>
<%= rdrdtlscurRec.m5%>
<%= rdrdtlscurRec.m6%>
<%= rdrdtlscurRec.m7%>
<%= rdrdtlscurRec.m8%>
<%= rdrdtlscurRec.m9%>
<%= rdrdtlscurRec.m10%>
<%= rdrdtlscurRec.m11%>
<%= rdrdtlscurRec.m12%>
<%= rdrdtlscurRec.rptvvalmm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Oct 31 16:43:31 KST 2005 */
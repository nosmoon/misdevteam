/***************************************************************************************************
* 파일명 : SL_S_NWSPSUBSCNTRDataSet.java
* 기능 : 독자정보관리(구독추가변경팝업-구독상세보기)
* 작성일자 : 2004-06-30
* 작성자 : 김영윤
***************************************************************************************************/
/***************************************************************************************************
* 수정내역	: 
* 수정자	: 
* 수정일자	: 
* 백업		: 
***************************************************************************************************/



package chosun.ciis.ss.sal.rdr.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sal.rdr.dm.*;
import chosun.ciis.ss.sal.rdr.rec.*;

/**
 * 독자정보관리(구독추가변경팝업-구독상세보기)
 */

public class SL_S_NWSPSUBSCNTRDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList rdr_extntypecdcur = new ArrayList();
	public ArrayList bomedicdcur = new ArrayList();
	public ArrayList freeclsfcdcur = new ArrayList();
	public ArrayList nwspsubscntrcur = new ArrayList();
	public ArrayList clamtmthdcdcur = new ArrayList();
	public String errcode;
	public String errmsg;

	public SL_S_NWSPSUBSCNTRDataSet(){}
	public SL_S_NWSPSUBSCNTRDataSet(String errcode, String errmsg){
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
		ResultSet rset0 = (ResultSet) cstmt.getObject(8);
		while(rset0.next()){
			SL_S_NWSPSUBSCNTRNWSPSUBSCNTRCURRecord rec = new SL_S_NWSPSUBSCNTRNWSPSUBSCNTRCURRecord();
			rec.rdr_extndt = Util.checkString(rset0.getString("rdr_extndt"));
			rec.rdr_no = Util.checkString(rset0.getString("rdr_no"));
			rec.medicd = Util.checkString(rset0.getString("medicd"));
			rec.cntrno = Util.checkString(rset0.getString("cntrno"));
			rec.mangno = Util.checkString(rset0.getString("mangno"));
			rec.rdr_extnno = Util.checkString(rset0.getString("rdr_extnno"));
			rec.rdr_extntypecd = Util.checkString(rset0.getString("rdr_extntypecd"));
			rec.extnnm = Util.checkString(rset0.getString("extnnm"));
			rec.rdr_extncost = rset0.getInt("rdr_extncost");
			rec.subsfr_dt = Util.checkString(rset0.getString("subsfr_dt"));
			rec.freeyn = Util.checkString(rset0.getString("freeyn"));
			rec.freeclsf = Util.checkString(rset0.getString("freeclsf"));
			rec.valmm = Util.checkString(rset0.getString("valmm"));
			rec.subsuprc = rset0.getInt("subsuprc");
			rec.subsqty = rset0.getInt("subsqty");
			rec.dscnamt = rset0.getInt("dscnamt");
			rec.post_dlvfee = rset0.getInt("post_dlvfee");
			rec.extnblngcd = Util.checkString(rset0.getString("extnblngcd"));
			rec.bodutycd = Util.checkString(rset0.getString("bodutycd"));
			rec.boposicd = Util.checkString(rset0.getString("boposicd"));
			rec.stafclsfcd = Util.checkString(rset0.getString("stafclsfcd"));
			rec.stafno = Util.checkString(rset0.getString("stafno"));
			rec.rdr_extnbocd = Util.checkString(rset0.getString("rdr_extnbocd"));
			rec.boemp_no = Util.checkString(rset0.getString("boemp_no"));
			rec.extnid = Util.checkString(rset0.getString("extnid"));
			rec.extnflnm = Util.checkString(rset0.getString("extnflnm"));
			rec.extntel1 = Util.checkString(rset0.getString("extntel1"));
			rec.extntel2 = Util.checkString(rset0.getString("extntel2"));
			rec.extntel3 = Util.checkString(rset0.getString("extntel3"));
			rec.extnptph_no1 = Util.checkString(rset0.getString("extnptph_no1"));
			rec.extnptph_no2 = Util.checkString(rset0.getString("extnptph_no2"));
			rec.extnptph_no3 = Util.checkString(rset0.getString("extnptph_no3"));
			rec.extnprn = Util.checkString(rset0.getString("extnprn"));
			rec.extnemail = Util.checkString(rset0.getString("extnemail"));
			rec.aplcpathcd = Util.checkString(rset0.getString("aplcpathcd"));
			rec.bns_itemcd = Util.checkString(rset0.getString("bns_itemcd"));
			rec.bns_itemnm = Util.checkString(rset0.getString("bns_itemnm"));
			rec.remk = Util.checkString(rset0.getString("remk"));
			rec.incmgdt = Util.checkString(rset0.getString("incmgdt"));
			this.nwspsubscntrcur.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(9);
		while(rset1.next()){
			SL_S_NWSPSUBSCNTRBOMEDICDCURRecord rec = new SL_S_NWSPSUBSCNTRBOMEDICDCURRecord();
			rec.medicd = Util.checkString(rset1.getString("medicd"));
			rec.cicdnm = Util.checkString(rset1.getString("cicdnm"));
			rec.remk = Util.checkString(rset1.getString("remk"));
			rec.areanwspyn = Util.checkString(rset1.getString("areanwspyn"));
			rec.subsuprc = rset1.getInt("subsuprc");
			rec.ciymgbcd = Util.checkString(rset1.getString("ciymgbcd"));
			rec.cicdgb = Util.checkString(rset1.getString("cicdgb"));
			this.bomedicdcur.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(10);
		while(rset2.next()){
			SL_S_NWSPSUBSCNTRRDR_EXTNTYPECDCURRecord rec = new SL_S_NWSPSUBSCNTRRDR_EXTNTYPECDCURRecord();
			rec.cicodeval = Util.checkString(rset2.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset2.getString("cicdnm"));
			rec.cicdynm = Util.checkString(rset2.getString("cicdynm"));
			rec.ciymgbcd = Util.checkString(rset2.getString("ciymgbcd"));
			rec.cicdgb = Util.checkString(rset2.getString("cicdgb"));
			this.rdr_extntypecdcur.add(rec);
		}
		ResultSet rset3 = (ResultSet) cstmt.getObject(11);
		while(rset3.next()){
			SL_S_NWSPSUBSCNTRCLAMTMTHDCDCURRecord rec = new SL_S_NWSPSUBSCNTRCLAMTMTHDCDCURRecord();
			rec.cicodeval = Util.checkString(rset3.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset3.getString("cicdnm"));
			rec.cicdynm = Util.checkString(rset3.getString("cicdynm"));
			rec.ciymgbcd = Util.checkString(rset3.getString("ciymgbcd"));
			rec.cicdgb = Util.checkString(rset3.getString("cicdgb"));
			this.clamtmthdcdcur.add(rec);
		}
		ResultSet rset4 = (ResultSet) cstmt.getObject(12);
		while(rset4.next()){
			SL_S_NWSPSUBSCNTRFREECLSFCDCURRecord rec = new SL_S_NWSPSUBSCNTRFREECLSFCDCURRecord();
			rec.cicodeval = Util.checkString(rset4.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset4.getString("cicdnm"));
			rec.cicdynm = Util.checkString(rset4.getString("cicdynm"));
			rec.ciymgbcd = Util.checkString(rset4.getString("ciymgbcd"));
			rec.cicdgb = Util.checkString(rset4.getString("cicdgb"));
			this.freeclsfcdcur.add(rec);
		}
	}

	public String nwspsubscntrcurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = nwspsubscntrcur.size();
		for(int i=0; i<size; i++){
			SL_S_NWSPSUBSCNTRNWSPSUBSCNTRCURRecord rec = (SL_S_NWSPSUBSCNTRNWSPSUBSCNTRCURRecord)nwspsubscntrcur.get(i);
			
			
			String code = rec.rdr_extndt;
			String name = rec.rdr_no;
			
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

	public String bomedicdcurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = bomedicdcur.size();
		for(int i=0; i<size; i++){
			SL_S_NWSPSUBSCNTRBOMEDICDCURRecord rec = (SL_S_NWSPSUBSCNTRBOMEDICDCURRecord)bomedicdcur.get(i);
			
			
			String code = rec.medicd;
			String name = rec.cicdnm;
			
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

	public String rdr_extntypecdcurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = rdr_extntypecdcur.size();
		for(int i=0; i<size; i++){
			SL_S_NWSPSUBSCNTRRDR_EXTNTYPECDCURRecord rec = (SL_S_NWSPSUBSCNTRRDR_EXTNTYPECDCURRecord)rdr_extntypecdcur.get(i);
			
			
			String code = rec.cicodeval;
			String name = rec.cicdnm;
			
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

	public String clamtmthdcdcurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = clamtmthdcdcur.size();
		for(int i=0; i<size; i++){
			SL_S_NWSPSUBSCNTRCLAMTMTHDCDCURRecord rec = (SL_S_NWSPSUBSCNTRCLAMTMTHDCDCURRecord)clamtmthdcdcur.get(i);
			
			
			String code = rec.cicodeval;
			String name = rec.cicdnm;
			
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

	public String freeclsfcdcurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = freeclsfcdcur.size();
		for(int i=0; i<size; i++){
			SL_S_NWSPSUBSCNTRFREECLSFCDCURRecord rec = (SL_S_NWSPSUBSCNTRFREECLSFCDCURRecord)freeclsfcdcur.get(i);
			
			
			String code = rec.cicodeval;
			String name = rec.cicdnm;
			
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

	public String nwspsubscntrcurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = nwspsubscntrcur.size();
		for(int i=0; i<size; i++){
			SL_S_NWSPSUBSCNTRNWSPSUBSCNTRCURRecord rec = (SL_S_NWSPSUBSCNTRNWSPSUBSCNTRCURRecord)nwspsubscntrcur.get(i);
			
			
			String code = rec.rdr_extndt;
			String name = rec.rdr_no;
			
			sb.append("<input name=\"");
			sb.append("rdr_extndt");
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

	public String bomedicdcurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = bomedicdcur.size();
		for(int i=0; i<size; i++){
			SL_S_NWSPSUBSCNTRBOMEDICDCURRecord rec = (SL_S_NWSPSUBSCNTRBOMEDICDCURRecord)bomedicdcur.get(i);
			
			
			String code = rec.medicd;
			String name = rec.cicdnm;
			
			sb.append("<input name=\"");
			sb.append("medicd");
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

	public String rdr_extntypecdcurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = rdr_extntypecdcur.size();
		for(int i=0; i<size; i++){
			SL_S_NWSPSUBSCNTRRDR_EXTNTYPECDCURRecord rec = (SL_S_NWSPSUBSCNTRRDR_EXTNTYPECDCURRecord)rdr_extntypecdcur.get(i);
			
			
			String code = rec.cicodeval;
			String name = rec.cicdnm;
			
			sb.append("<input name=\"");
			sb.append("cicodeval");
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

	public String clamtmthdcdcurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = clamtmthdcdcur.size();
		for(int i=0; i<size; i++){
			SL_S_NWSPSUBSCNTRCLAMTMTHDCDCURRecord rec = (SL_S_NWSPSUBSCNTRCLAMTMTHDCDCURRecord)clamtmthdcdcur.get(i);
			
			
			String code = rec.cicodeval;
			String name = rec.cicdnm;
			
			sb.append("<input name=\"");
			sb.append("cicodeval");
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

	public String freeclsfcdcurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = freeclsfcdcur.size();
		for(int i=0; i<size; i++){
			SL_S_NWSPSUBSCNTRFREECLSFCDCURRecord rec = (SL_S_NWSPSUBSCNTRFREECLSFCDCURRecord)freeclsfcdcur.get(i);
			
			
			String code = rec.cicodeval;
			String name = rec.cicdnm;
			
			sb.append("<input name=\"");
			sb.append("cicodeval");
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

	public String nwspsubscntrcurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = nwspsubscntrcur.size();
		for(int i=0; i<size; i++){
			SL_S_NWSPSUBSCNTRNWSPSUBSCNTRCURRecord rec = (SL_S_NWSPSUBSCNTRNWSPSUBSCNTRCURRecord)nwspsubscntrcur.get(i);
			
			
			String code = rec.rdr_extndt;
			String name = rec.rdr_no;
			
			sb.append("<input name=\"");
			sb.append("rdr_extndt");
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

	public String bomedicdcurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = bomedicdcur.size();
		for(int i=0; i<size; i++){
			SL_S_NWSPSUBSCNTRBOMEDICDCURRecord rec = (SL_S_NWSPSUBSCNTRBOMEDICDCURRecord)bomedicdcur.get(i);
			
			
			String code = rec.medicd;
			String name = rec.cicdnm;
			
			sb.append("<input name=\"");
			sb.append("medicd");
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

	public String rdr_extntypecdcurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = rdr_extntypecdcur.size();
		for(int i=0; i<size; i++){
			SL_S_NWSPSUBSCNTRRDR_EXTNTYPECDCURRecord rec = (SL_S_NWSPSUBSCNTRRDR_EXTNTYPECDCURRecord)rdr_extntypecdcur.get(i);
			
			
			String code = rec.cicodeval;
			String name = rec.cicdnm;
			
			sb.append("<input name=\"");
			sb.append("cicodeval");
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

	public String clamtmthdcdcurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = clamtmthdcdcur.size();
		for(int i=0; i<size; i++){
			SL_S_NWSPSUBSCNTRCLAMTMTHDCDCURRecord rec = (SL_S_NWSPSUBSCNTRCLAMTMTHDCDCURRecord)clamtmthdcdcur.get(i);
			
			
			String code = rec.cicodeval;
			String name = rec.cicdnm;
			
			sb.append("<input name=\"");
			sb.append("cicodeval");
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

	public String freeclsfcdcurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = freeclsfcdcur.size();
		for(int i=0; i<size; i++){
			SL_S_NWSPSUBSCNTRFREECLSFCDCURRecord rec = (SL_S_NWSPSUBSCNTRFREECLSFCDCURRecord)freeclsfcdcur.get(i);
			
			
			String code = rec.cicodeval;
			String name = rec.cicdnm;
			
			sb.append("<input name=\"");
			sb.append("cicodeval");
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
	SL_S_NWSPSUBSCNTRDataSet ds = (SL_S_NWSPSUBSCNTRDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.nwspsubscntrcur.size(); i++){
		SL_S_NWSPSUBSCNTRNWSPSUBSCNTRCURRecord nwspsubscntrcurRec = (SL_S_NWSPSUBSCNTRNWSPSUBSCNTRCURRecord)ds.nwspsubscntrcur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.bomedicdcur.size(); i++){
		SL_S_NWSPSUBSCNTRBOMEDICDCURRecord bomedicdcurRec = (SL_S_NWSPSUBSCNTRBOMEDICDCURRecord)ds.bomedicdcur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.rdr_extntypecdcur.size(); i++){
		SL_S_NWSPSUBSCNTRRDR_EXTNTYPECDCURRecord rdr_extntypecdcurRec = (SL_S_NWSPSUBSCNTRRDR_EXTNTYPECDCURRecord)ds.rdr_extntypecdcur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.clamtmthdcdcur.size(); i++){
		SL_S_NWSPSUBSCNTRCLAMTMTHDCDCURRecord clamtmthdcdcurRec = (SL_S_NWSPSUBSCNTRCLAMTMTHDCDCURRecord)ds.clamtmthdcdcur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.freeclsfcdcur.size(); i++){
		SL_S_NWSPSUBSCNTRFREECLSFCDCURRecord freeclsfcdcurRec = (SL_S_NWSPSUBSCNTRFREECLSFCDCURRecord)ds.freeclsfcdcur.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getNwspsubscntrcur()%>
<%= ds.getBomedicdcur()%>
<%= ds.getRdr_extntypecdcur()%>
<%= ds.getClamtmthdcdcur()%>
<%= ds.getFreeclsfcdcur()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= nwspsubscntrcurRec.rdr_extndt%>
<%= nwspsubscntrcurRec.rdr_no%>
<%= nwspsubscntrcurRec.medicd%>
<%= nwspsubscntrcurRec.cntrno%>
<%= nwspsubscntrcurRec.mangno%>
<%= nwspsubscntrcurRec.rdr_extnno%>
<%= nwspsubscntrcurRec.rdr_extntypecd%>
<%= nwspsubscntrcurRec.extnnm%>
<%= nwspsubscntrcurRec.rdr_extncost%>
<%= nwspsubscntrcurRec.subsfr_dt%>
<%= nwspsubscntrcurRec.freeyn%>
<%= nwspsubscntrcurRec.freeclsf%>
<%= nwspsubscntrcurRec.valmm%>
<%= nwspsubscntrcurRec.subsuprc%>
<%= nwspsubscntrcurRec.subsqty%>
<%= nwspsubscntrcurRec.dscnamt%>
<%= nwspsubscntrcurRec.post_dlvfee%>
<%= nwspsubscntrcurRec.extnblngcd%>
<%= nwspsubscntrcurRec.bodutycd%>
<%= nwspsubscntrcurRec.boposicd%>
<%= nwspsubscntrcurRec.stafclsfcd%>
<%= nwspsubscntrcurRec.stafno%>
<%= nwspsubscntrcurRec.rdr_extnbocd%>
<%= nwspsubscntrcurRec.boemp_no%>
<%= nwspsubscntrcurRec.extnid%>
<%= nwspsubscntrcurRec.extnflnm%>
<%= nwspsubscntrcurRec.extntel1%>
<%= nwspsubscntrcurRec.extntel2%>
<%= nwspsubscntrcurRec.extntel3%>
<%= nwspsubscntrcurRec.extnptph_no1%>
<%= nwspsubscntrcurRec.extnptph_no2%>
<%= nwspsubscntrcurRec.extnptph_no3%>
<%= nwspsubscntrcurRec.extnprn%>
<%= nwspsubscntrcurRec.extnemail%>
<%= nwspsubscntrcurRec.aplcpathcd%>
<%= nwspsubscntrcurRec.bns_itemcd%>
<%= nwspsubscntrcurRec.bns_itemnm%>
<%= nwspsubscntrcurRec.remk%>
<%= nwspsubscntrcurRec.incmgdt%>
<%= bomedicdcurRec.medicd%>
<%= bomedicdcurRec.cicdnm%>
<%= bomedicdcurRec.remk%>
<%= bomedicdcurRec.areanwspyn%>
<%= bomedicdcurRec.subsuprc%>
<%= bomedicdcurRec.ciymgbcd%>
<%= bomedicdcurRec.cicdgb%>
<%= rdr_extntypecdcurRec.cicodeval%>
<%= rdr_extntypecdcurRec.cicdnm%>
<%= rdr_extntypecdcurRec.cicdynm%>
<%= rdr_extntypecdcurRec.ciymgbcd%>
<%= rdr_extntypecdcurRec.cicdgb%>
<%= clamtmthdcdcurRec.cicodeval%>
<%= clamtmthdcdcurRec.cicdnm%>
<%= clamtmthdcdcurRec.cicdynm%>
<%= clamtmthdcdcurRec.ciymgbcd%>
<%= clamtmthdcdcurRec.cicdgb%>
<%= freeclsfcdcurRec.cicodeval%>
<%= freeclsfcdcurRec.cicdnm%>
<%= freeclsfcdcurRec.cicdynm%>
<%= freeclsfcdcurRec.ciymgbcd%>
<%= freeclsfcdcurRec.cicdgb%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Mar 15 16:44:52 KST 2007 */
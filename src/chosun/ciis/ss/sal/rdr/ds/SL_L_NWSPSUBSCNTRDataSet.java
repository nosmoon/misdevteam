/***************************************************************************************************
* 파일명 : SL_L_NWSPSUBSCNTRDataSet.java
* 기능 : 독자정보관리(구독추가변경팝업-구독계약목록조회)
* 작성일자 : 2004-05-20
* 작성자 : 김영윤
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.ss.sal.rdr.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sal.rdr.dm.*;
import chosun.ciis.ss.sal.rdr.rec.*;

/**
 * 독자정보관리(구독추가변경팝업-구독계약목록조회)
 *
 */

public class SL_L_NWSPSUBSCNTRDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList rdr_extntypecdcur = new ArrayList();
	public ArrayList bomedicdcur = new ArrayList();
	public ArrayList nwspsubscntrcur = new ArrayList();
	public ArrayList freeclsfcdcur = new ArrayList();
	public ArrayList medicur = new ArrayList();
	public ArrayList clamtmthdcdcur = new ArrayList();
	public String errcode;
	public String errmsg;

	public SL_L_NWSPSUBSCNTRDataSet(){}
	public SL_L_NWSPSUBSCNTRDataSet(String errcode, String errmsg){
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
		ResultSet rset0 = (ResultSet) cstmt.getObject(6);
		while(rset0.next()){
			SL_L_NWSPSUBSCNTRMEDICURRecord rec = new SL_L_NWSPSUBSCNTRMEDICURRecord();
			rec.medicd = Util.checkString(rset0.getString("medicd"));
			rec.abrv = Util.checkString(rset0.getString("abrv"));
			rec.dlvqty = rset0.getInt("dlvqty");
			this.medicur.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(7);
		while(rset1.next()){
			SL_L_NWSPSUBSCNTRBOMEDICDCURRecord rec = new SL_L_NWSPSUBSCNTRBOMEDICDCURRecord();
			rec.medicd = Util.checkString(rset1.getString("medicd"));
			rec.cicdnm = Util.checkString(rset1.getString("cicdnm"));
			rec.remk = Util.checkString(rset1.getString("remk"));
			rec.areanwspyn = Util.checkString(rset1.getString("areanwspyn"));
			rec.subsuprc = rset1.getInt("subsuprc");
			rec.ciymgbcd = Util.checkString(rset1.getString("ciymgbcd"));
			rec.cicdgb = Util.checkString(rset1.getString("cicdgb"));
			this.bomedicdcur.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(8);
		while(rset2.next()){
			SL_L_NWSPSUBSCNTRRDR_EXTNTYPECDCURRecord rec = new SL_L_NWSPSUBSCNTRRDR_EXTNTYPECDCURRecord();
			rec.cicodeval = Util.checkString(rset2.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset2.getString("cicdnm"));
			rec.cicdynm = Util.checkString(rset2.getString("cicdynm"));
			rec.ciymgbcd = Util.checkString(rset2.getString("ciymgbcd"));
			rec.cicdgb = Util.checkString(rset2.getString("cicdgb"));
			this.rdr_extntypecdcur.add(rec);
		}
		ResultSet rset3 = (ResultSet) cstmt.getObject(9);
		while(rset3.next()){
			SL_L_NWSPSUBSCNTRCLAMTMTHDCDCURRecord rec = new SL_L_NWSPSUBSCNTRCLAMTMTHDCDCURRecord();
			rec.cicodeval = Util.checkString(rset3.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset3.getString("cicdnm"));
			rec.cicdynm = Util.checkString(rset3.getString("cicdynm"));
			rec.ciymgbcd = Util.checkString(rset3.getString("ciymgbcd"));
			rec.cicdgb = Util.checkString(rset3.getString("cicdgb"));
			this.clamtmthdcdcur.add(rec);
		}
		ResultSet rset4 = (ResultSet) cstmt.getObject(10);
		while(rset4.next()){
			SL_L_NWSPSUBSCNTRFREECLSFCDCURRecord rec = new SL_L_NWSPSUBSCNTRFREECLSFCDCURRecord();
			rec.cicodeval = Util.checkString(rset4.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset4.getString("cicdnm"));
			rec.cicdynm = Util.checkString(rset4.getString("cicdynm"));
			rec.ciymgbcd = Util.checkString(rset4.getString("ciymgbcd"));
			rec.cicdgb = Util.checkString(rset4.getString("cicdgb"));
			this.freeclsfcdcur.add(rec);
		}
		ResultSet rset5 = (ResultSet) cstmt.getObject(11);
		while(rset5.next()){
			SL_L_NWSPSUBSCNTRNWSPSUBSCNTRCURRecord rec = new SL_L_NWSPSUBSCNTRNWSPSUBSCNTRCURRecord();
			rec.rdr_no = Util.checkString(rset5.getString("rdr_no"));
			rec.medicd = Util.checkString(rset5.getString("medicd"));
			rec.cntrno = Util.checkString(rset5.getString("cntrno"));
			rec.mangno = Util.checkString(rset5.getString("mangno"));
			rec.medinm = Util.checkString(rset5.getString("medinm"));
			rec.rdr_extndt = Util.checkString(rset5.getString("rdr_extndt"));
			rec.valmm = Util.checkString(rset5.getString("valmm"));
			rec.rdr_extnno = Util.checkString(rset5.getString("rdr_extnno"));
			rec.rdr_extntypecd = Util.checkString(rset5.getString("rdr_extntypecd"));
			rec.rdr_extntype = Util.checkString(rset5.getString("rdr_extntype"));
			rec.extnnm = Util.checkString(rset5.getString("extnnm"));
			rec.subsuprc = rset5.getInt("subsuprc");
			rec.subsqty = rset5.getInt("subsqty");
			rec.dscnamt = rset5.getInt("dscnamt");
			rec.post_dlvfee = rset5.getInt("post_dlvfee");
			rec.rdr_extncost = rset5.getInt("rdr_extncost");
			rec.freeyn = Util.checkString(rset5.getString("freeyn"));
			rec.freeclsf = Util.checkString(rset5.getString("freeclsf"));
			rec.bns_itemnm = Util.checkString(rset5.getString("bns_itemnm"));
			this.nwspsubscntrcur.add(rec);
		}
	}

	public String medicurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = medicur.size();
		for(int i=0; i<size; i++){
			SL_L_NWSPSUBSCNTRMEDICURRecord rec = (SL_L_NWSPSUBSCNTRMEDICURRecord)medicur.get(i);
			
			
			String code = rec.medicd;
			String name = rec.abrv;
			
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
			SL_L_NWSPSUBSCNTRBOMEDICDCURRecord rec = (SL_L_NWSPSUBSCNTRBOMEDICDCURRecord)bomedicdcur.get(i);
			
			
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
			SL_L_NWSPSUBSCNTRRDR_EXTNTYPECDCURRecord rec = (SL_L_NWSPSUBSCNTRRDR_EXTNTYPECDCURRecord)rdr_extntypecdcur.get(i);
			
			
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
			SL_L_NWSPSUBSCNTRCLAMTMTHDCDCURRecord rec = (SL_L_NWSPSUBSCNTRCLAMTMTHDCDCURRecord)clamtmthdcdcur.get(i);
			
			
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
			SL_L_NWSPSUBSCNTRFREECLSFCDCURRecord rec = (SL_L_NWSPSUBSCNTRFREECLSFCDCURRecord)freeclsfcdcur.get(i);
			
			
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

	public String nwspsubscntrcurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = nwspsubscntrcur.size();
		for(int i=0; i<size; i++){
			SL_L_NWSPSUBSCNTRNWSPSUBSCNTRCURRecord rec = (SL_L_NWSPSUBSCNTRNWSPSUBSCNTRCURRecord)nwspsubscntrcur.get(i);
			
			
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

	public String medicurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = medicur.size();
		for(int i=0; i<size; i++){
			SL_L_NWSPSUBSCNTRMEDICURRecord rec = (SL_L_NWSPSUBSCNTRMEDICURRecord)medicur.get(i);
			
			
			String code = rec.medicd;
			String name = rec.abrv;
			
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

	public String bomedicdcurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = bomedicdcur.size();
		for(int i=0; i<size; i++){
			SL_L_NWSPSUBSCNTRBOMEDICDCURRecord rec = (SL_L_NWSPSUBSCNTRBOMEDICDCURRecord)bomedicdcur.get(i);
			
			
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
			SL_L_NWSPSUBSCNTRRDR_EXTNTYPECDCURRecord rec = (SL_L_NWSPSUBSCNTRRDR_EXTNTYPECDCURRecord)rdr_extntypecdcur.get(i);
			
			
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
			SL_L_NWSPSUBSCNTRCLAMTMTHDCDCURRecord rec = (SL_L_NWSPSUBSCNTRCLAMTMTHDCDCURRecord)clamtmthdcdcur.get(i);
			
			
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
			SL_L_NWSPSUBSCNTRFREECLSFCDCURRecord rec = (SL_L_NWSPSUBSCNTRFREECLSFCDCURRecord)freeclsfcdcur.get(i);
			
			
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

	public String nwspsubscntrcurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = nwspsubscntrcur.size();
		for(int i=0; i<size; i++){
			SL_L_NWSPSUBSCNTRNWSPSUBSCNTRCURRecord rec = (SL_L_NWSPSUBSCNTRNWSPSUBSCNTRCURRecord)nwspsubscntrcur.get(i);
			
			
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

	public String medicurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = medicur.size();
		for(int i=0; i<size; i++){
			SL_L_NWSPSUBSCNTRMEDICURRecord rec = (SL_L_NWSPSUBSCNTRMEDICURRecord)medicur.get(i);
			
			
			String code = rec.medicd;
			String name = rec.abrv;
			
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

	public String bomedicdcurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = bomedicdcur.size();
		for(int i=0; i<size; i++){
			SL_L_NWSPSUBSCNTRBOMEDICDCURRecord rec = (SL_L_NWSPSUBSCNTRBOMEDICDCURRecord)bomedicdcur.get(i);
			
			
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
			SL_L_NWSPSUBSCNTRRDR_EXTNTYPECDCURRecord rec = (SL_L_NWSPSUBSCNTRRDR_EXTNTYPECDCURRecord)rdr_extntypecdcur.get(i);
			
			
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
			SL_L_NWSPSUBSCNTRCLAMTMTHDCDCURRecord rec = (SL_L_NWSPSUBSCNTRCLAMTMTHDCDCURRecord)clamtmthdcdcur.get(i);
			
			
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
			SL_L_NWSPSUBSCNTRFREECLSFCDCURRecord rec = (SL_L_NWSPSUBSCNTRFREECLSFCDCURRecord)freeclsfcdcur.get(i);
			
			
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

	public String nwspsubscntrcurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = nwspsubscntrcur.size();
		for(int i=0; i<size; i++){
			SL_L_NWSPSUBSCNTRNWSPSUBSCNTRCURRecord rec = (SL_L_NWSPSUBSCNTRNWSPSUBSCNTRCURRecord)nwspsubscntrcur.get(i);
			
			
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
	SL_L_NWSPSUBSCNTRDataSet ds = (SL_L_NWSPSUBSCNTRDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.medicur.size(); i++){
		SL_L_NWSPSUBSCNTRMEDICURRecord medicurRec = (SL_L_NWSPSUBSCNTRMEDICURRecord)ds.medicur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.bomedicdcur.size(); i++){
		SL_L_NWSPSUBSCNTRBOMEDICDCURRecord bomedicdcurRec = (SL_L_NWSPSUBSCNTRBOMEDICDCURRecord)ds.bomedicdcur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.rdr_extntypecdcur.size(); i++){
		SL_L_NWSPSUBSCNTRRDR_EXTNTYPECDCURRecord rdr_extntypecdcurRec = (SL_L_NWSPSUBSCNTRRDR_EXTNTYPECDCURRecord)ds.rdr_extntypecdcur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.clamtmthdcdcur.size(); i++){
		SL_L_NWSPSUBSCNTRCLAMTMTHDCDCURRecord clamtmthdcdcurRec = (SL_L_NWSPSUBSCNTRCLAMTMTHDCDCURRecord)ds.clamtmthdcdcur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.freeclsfcdcur.size(); i++){
		SL_L_NWSPSUBSCNTRFREECLSFCDCURRecord freeclsfcdcurRec = (SL_L_NWSPSUBSCNTRFREECLSFCDCURRecord)ds.freeclsfcdcur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.nwspsubscntrcur.size(); i++){
		SL_L_NWSPSUBSCNTRNWSPSUBSCNTRCURRecord nwspsubscntrcurRec = (SL_L_NWSPSUBSCNTRNWSPSUBSCNTRCURRecord)ds.nwspsubscntrcur.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getMedicur()%>
<%= ds.getBomedicdcur()%>
<%= ds.getRdr_extntypecdcur()%>
<%= ds.getClamtmthdcdcur()%>
<%= ds.getFreeclsfcdcur()%>
<%= ds.getNwspsubscntrcur()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= medicurRec.medicd%>
<%= medicurRec.abrv%>
<%= medicurRec.dlvqty%>
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
<%= nwspsubscntrcurRec.rdr_no%>
<%= nwspsubscntrcurRec.medicd%>
<%= nwspsubscntrcurRec.cntrno%>
<%= nwspsubscntrcurRec.mangno%>
<%= nwspsubscntrcurRec.medinm%>
<%= nwspsubscntrcurRec.rdr_extndt%>
<%= nwspsubscntrcurRec.valmm%>
<%= nwspsubscntrcurRec.rdr_extnno%>
<%= nwspsubscntrcurRec.rdr_extntypecd%>
<%= nwspsubscntrcurRec.rdr_extntype%>
<%= nwspsubscntrcurRec.extnnm%>
<%= nwspsubscntrcurRec.subsuprc%>
<%= nwspsubscntrcurRec.subsqty%>
<%= nwspsubscntrcurRec.dscnamt%>
<%= nwspsubscntrcurRec.post_dlvfee%>
<%= nwspsubscntrcurRec.rdr_extncost%>
<%= nwspsubscntrcurRec.freeyn%>
<%= nwspsubscntrcurRec.freeclsf%>
<%= nwspsubscntrcurRec.bns_itemnm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon May 31 16:22:37 KST 2004 */
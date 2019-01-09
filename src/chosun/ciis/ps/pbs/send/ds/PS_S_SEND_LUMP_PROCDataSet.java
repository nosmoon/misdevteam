/***************************************************************************************************
* 파일명 : PS_S_SEND_LUMP_PROC.java
* 기능   : 출판국 발송 관련 기초 코드
* 작성일자 : 2006-04-19
* 작성자 : 전현표
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/



package chosun.ciis.ps.pbs.send.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ps.pbs.send.dm.*;
import chosun.ciis.ps.pbs.send.rec.*;

/**
 * 출판국 -발송 기초 코드
 *
 */

public class PS_S_SEND_LUMP_PROCDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList sendclsfcur = new ArrayList();
	public ArrayList medisercur = new ArrayList();
	public ArrayList sendkindcur = new ArrayList();
	public ArrayList cmpycdcur = new ArrayList();
	public ArrayList medicdcur = new ArrayList();
	public ArrayList hdqtsenddtcur = new ArrayList();
	public ArrayList bocdcur = new ArrayList();
	public String errcode;
	public String errmsg;

	public PS_S_SEND_LUMP_PROCDataSet(){}
	public PS_S_SEND_LUMP_PROCDataSet(String errcode, String errmsg){
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
			PS_S_SEND_LUMP_PROCMEDICDCURRecord rec = new PS_S_SEND_LUMP_PROCMEDICDCURRecord();
			rec.cicodeval = Util.checkString(rset0.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset0.getString("cicdnm"));
			rec.cicdynm = Util.checkString(rset0.getString("cicdynm"));
			rec.ciymgbcd = Util.checkString(rset0.getString("ciymgbcd"));
			rec.cicdgb = Util.checkString(rset0.getString("cicdgb"));
			this.medicdcur.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(7);
		while(rset1.next()){
			PS_S_SEND_LUMP_PROCBOCDCURRecord rec = new PS_S_SEND_LUMP_PROCBOCDCURRecord();
			rec.cicodeval = Util.checkString(rset1.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset1.getString("cicdnm"));
			this.bocdcur.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(8);
		while(rset2.next()){
			PS_S_SEND_LUMP_PROCSENDCLSFCURRecord rec = new PS_S_SEND_LUMP_PROCSENDCLSFCURRecord();
			rec.cicodeval = Util.checkString(rset2.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset2.getString("cicdnm"));
			rec.cicdynm = Util.checkString(rset2.getString("cicdynm"));
			rec.ciymgbcd = Util.checkString(rset2.getString("ciymgbcd"));
			rec.cicdgb = Util.checkString(rset2.getString("cicdgb"));
			this.sendclsfcur.add(rec);
		}
		ResultSet rset3 = (ResultSet) cstmt.getObject(9);
		while(rset3.next()){
			PS_S_SEND_LUMP_PROCSENDKINDCURRecord rec = new PS_S_SEND_LUMP_PROCSENDKINDCURRecord();
			rec.cicodeval = Util.checkString(rset3.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset3.getString("cicdnm"));
			rec.cicdynm = Util.checkString(rset3.getString("cicdynm"));
			rec.ciymgbcd = Util.checkString(rset3.getString("ciymgbcd"));
			rec.cicdgb = Util.checkString(rset3.getString("cicdgb"));
			this.sendkindcur.add(rec);
		}
		ResultSet rset4 = (ResultSet) cstmt.getObject(10);
		while(rset4.next()){
			PS_S_SEND_LUMP_PROCMEDISERCURRecord rec = new PS_S_SEND_LUMP_PROCMEDISERCURRecord();
			rec.mediser_no = Util.checkString(rset4.getString("mediser_no"));
			rec.mediser_view = Util.checkString(rset4.getString("mediser_view"));
			this.medisercur.add(rec);
		}
		ResultSet rset5 = (ResultSet) cstmt.getObject(11);
		while(rset5.next()){
			PS_S_SEND_LUMP_PROCHDQTSENDDTCURRecord rec = new PS_S_SEND_LUMP_PROCHDQTSENDDTCURRecord();
			rec.hdqtsenddt = Util.checkString(rset5.getString("hdqtsenddt"));
			rec.hdqtsenddt_view = Util.checkString(rset5.getString("hdqtsenddt_view"));
			this.hdqtsenddtcur.add(rec);
		}
		ResultSet rset6 = (ResultSet) cstmt.getObject(12);
		while(rset6.next()){
			PS_S_SEND_LUMP_PROCCMPYCDCURRecord rec = new PS_S_SEND_LUMP_PROCCMPYCDCURRecord();
			rec.cicodeval = Util.checkString(rset6.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset6.getString("cicdnm"));
			rec.cicdynm = Util.checkString(rset6.getString("cicdynm"));
			rec.ciymgbcd = Util.checkString(rset6.getString("ciymgbcd"));
			rec.cicdgb = Util.checkString(rset6.getString("cicdgb"));
			this.cmpycdcur.add(rec);
		}
	}

	public String medicdcurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = medicdcur.size();
		for(int i=0; i<size; i++){
			PS_S_SEND_LUMP_PROCMEDICDCURRecord rec = (PS_S_SEND_LUMP_PROCMEDICDCURRecord)medicdcur.get(i);
			
			
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

	public String bocdcurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = bocdcur.size();
		for(int i=0; i<size; i++){
			PS_S_SEND_LUMP_PROCBOCDCURRecord rec = (PS_S_SEND_LUMP_PROCBOCDCURRecord)bocdcur.get(i);
			
			
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

	public String sendclsfcurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = sendclsfcur.size();
		for(int i=0; i<size; i++){
			PS_S_SEND_LUMP_PROCSENDCLSFCURRecord rec = (PS_S_SEND_LUMP_PROCSENDCLSFCURRecord)sendclsfcur.get(i);
			
			
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

	public String sendkindcurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = sendkindcur.size();
		for(int i=0; i<size; i++){
			PS_S_SEND_LUMP_PROCSENDKINDCURRecord rec = (PS_S_SEND_LUMP_PROCSENDKINDCURRecord)sendkindcur.get(i);
			
			
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

	public String medisercurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = medisercur.size();
		for(int i=0; i<size; i++){
			PS_S_SEND_LUMP_PROCMEDISERCURRecord rec = (PS_S_SEND_LUMP_PROCMEDISERCURRecord)medisercur.get(i);
			
			
			String code = rec.mediser_no;
			String name = rec.mediser_view;
			
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

	public String hdqtsenddtcurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = hdqtsenddtcur.size();
		for(int i=0; i<size; i++){
			PS_S_SEND_LUMP_PROCHDQTSENDDTCURRecord rec = (PS_S_SEND_LUMP_PROCHDQTSENDDTCURRecord)hdqtsenddtcur.get(i);
			
			
			String code = rec.hdqtsenddt;
			String name = rec.hdqtsenddt_view;
			
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

	public String cmpycdcurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = cmpycdcur.size();
		for(int i=0; i<size; i++){
			PS_S_SEND_LUMP_PROCCMPYCDCURRecord rec = (PS_S_SEND_LUMP_PROCCMPYCDCURRecord)cmpycdcur.get(i);
			
			
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

	public String medicdcurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = medicdcur.size();
		for(int i=0; i<size; i++){
			PS_S_SEND_LUMP_PROCMEDICDCURRecord rec = (PS_S_SEND_LUMP_PROCMEDICDCURRecord)medicdcur.get(i);
			
			
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

	public String bocdcurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = bocdcur.size();
		for(int i=0; i<size; i++){
			PS_S_SEND_LUMP_PROCBOCDCURRecord rec = (PS_S_SEND_LUMP_PROCBOCDCURRecord)bocdcur.get(i);
			
			
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

	public String sendclsfcurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = sendclsfcur.size();
		for(int i=0; i<size; i++){
			PS_S_SEND_LUMP_PROCSENDCLSFCURRecord rec = (PS_S_SEND_LUMP_PROCSENDCLSFCURRecord)sendclsfcur.get(i);
			
			
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

	public String sendkindcurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = sendkindcur.size();
		for(int i=0; i<size; i++){
			PS_S_SEND_LUMP_PROCSENDKINDCURRecord rec = (PS_S_SEND_LUMP_PROCSENDKINDCURRecord)sendkindcur.get(i);
			
			
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

	public String medisercurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = medisercur.size();
		for(int i=0; i<size; i++){
			PS_S_SEND_LUMP_PROCMEDISERCURRecord rec = (PS_S_SEND_LUMP_PROCMEDISERCURRecord)medisercur.get(i);
			
			
			String code = rec.mediser_no;
			String name = rec.mediser_view;
			
			sb.append("<input name=\"");
			sb.append("mediser_no");
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

	public String hdqtsenddtcurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = hdqtsenddtcur.size();
		for(int i=0; i<size; i++){
			PS_S_SEND_LUMP_PROCHDQTSENDDTCURRecord rec = (PS_S_SEND_LUMP_PROCHDQTSENDDTCURRecord)hdqtsenddtcur.get(i);
			
			
			String code = rec.hdqtsenddt;
			String name = rec.hdqtsenddt_view;
			
			sb.append("<input name=\"");
			sb.append("hdqtsenddt");
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

	public String cmpycdcurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = cmpycdcur.size();
		for(int i=0; i<size; i++){
			PS_S_SEND_LUMP_PROCCMPYCDCURRecord rec = (PS_S_SEND_LUMP_PROCCMPYCDCURRecord)cmpycdcur.get(i);
			
			
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

	public String medicdcurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = medicdcur.size();
		for(int i=0; i<size; i++){
			PS_S_SEND_LUMP_PROCMEDICDCURRecord rec = (PS_S_SEND_LUMP_PROCMEDICDCURRecord)medicdcur.get(i);
			
			
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

	public String bocdcurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = bocdcur.size();
		for(int i=0; i<size; i++){
			PS_S_SEND_LUMP_PROCBOCDCURRecord rec = (PS_S_SEND_LUMP_PROCBOCDCURRecord)bocdcur.get(i);
			
			
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

	public String sendclsfcurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = sendclsfcur.size();
		for(int i=0; i<size; i++){
			PS_S_SEND_LUMP_PROCSENDCLSFCURRecord rec = (PS_S_SEND_LUMP_PROCSENDCLSFCURRecord)sendclsfcur.get(i);
			
			
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

	public String sendkindcurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = sendkindcur.size();
		for(int i=0; i<size; i++){
			PS_S_SEND_LUMP_PROCSENDKINDCURRecord rec = (PS_S_SEND_LUMP_PROCSENDKINDCURRecord)sendkindcur.get(i);
			
			
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

	public String medisercurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = medisercur.size();
		for(int i=0; i<size; i++){
			PS_S_SEND_LUMP_PROCMEDISERCURRecord rec = (PS_S_SEND_LUMP_PROCMEDISERCURRecord)medisercur.get(i);
			
			
			String code = rec.mediser_no;
			String name = rec.mediser_view;
			
			sb.append("<input name=\"");
			sb.append("mediser_no");
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

	public String hdqtsenddtcurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = hdqtsenddtcur.size();
		for(int i=0; i<size; i++){
			PS_S_SEND_LUMP_PROCHDQTSENDDTCURRecord rec = (PS_S_SEND_LUMP_PROCHDQTSENDDTCURRecord)hdqtsenddtcur.get(i);
			
			
			String code = rec.hdqtsenddt;
			String name = rec.hdqtsenddt_view;
			
			sb.append("<input name=\"");
			sb.append("hdqtsenddt");
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

	public String cmpycdcurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = cmpycdcur.size();
		for(int i=0; i<size; i++){
			PS_S_SEND_LUMP_PROCCMPYCDCURRecord rec = (PS_S_SEND_LUMP_PROCCMPYCDCURRecord)cmpycdcur.get(i);
			
			
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
	PS_S_SEND_LUMP_PROCDataSet ds = (PS_S_SEND_LUMP_PROCDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.medicdcur.size(); i++){
		PS_S_SEND_LUMP_PROCMEDICDCURRecord medicdcurRec = (PS_S_SEND_LUMP_PROCMEDICDCURRecord)ds.medicdcur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.bocdcur.size(); i++){
		PS_S_SEND_LUMP_PROCBOCDCURRecord bocdcurRec = (PS_S_SEND_LUMP_PROCBOCDCURRecord)ds.bocdcur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.sendclsfcur.size(); i++){
		PS_S_SEND_LUMP_PROCSENDCLSFCURRecord sendclsfcurRec = (PS_S_SEND_LUMP_PROCSENDCLSFCURRecord)ds.sendclsfcur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.sendkindcur.size(); i++){
		PS_S_SEND_LUMP_PROCSENDKINDCURRecord sendkindcurRec = (PS_S_SEND_LUMP_PROCSENDKINDCURRecord)ds.sendkindcur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.medisercur.size(); i++){
		PS_S_SEND_LUMP_PROCMEDISERCURRecord medisercurRec = (PS_S_SEND_LUMP_PROCMEDISERCURRecord)ds.medisercur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.hdqtsenddtcur.size(); i++){
		PS_S_SEND_LUMP_PROCHDQTSENDDTCURRecord hdqtsenddtcurRec = (PS_S_SEND_LUMP_PROCHDQTSENDDTCURRecord)ds.hdqtsenddtcur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.cmpycdcur.size(); i++){
		PS_S_SEND_LUMP_PROCCMPYCDCURRecord cmpycdcurRec = (PS_S_SEND_LUMP_PROCCMPYCDCURRecord)ds.cmpycdcur.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getMedicdcur()%>
<%= ds.getBocdcur()%>
<%= ds.getSendclsfcur()%>
<%= ds.getSendkindcur()%>
<%= ds.getMedisercur()%>
<%= ds.getHdqtsenddtcur()%>
<%= ds.getCmpycdcur()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= medicdcurRec.cicodeval%>
<%= medicdcurRec.cicdnm%>
<%= medicdcurRec.cicdynm%>
<%= medicdcurRec.ciymgbcd%>
<%= medicdcurRec.cicdgb%>
<%= bocdcurRec.cicodeval%>
<%= bocdcurRec.cicdnm%>
<%= sendclsfcurRec.cicodeval%>
<%= sendclsfcurRec.cicdnm%>
<%= sendclsfcurRec.cicdynm%>
<%= sendclsfcurRec.ciymgbcd%>
<%= sendclsfcurRec.cicdgb%>
<%= sendkindcurRec.cicodeval%>
<%= sendkindcurRec.cicdnm%>
<%= sendkindcurRec.cicdynm%>
<%= sendkindcurRec.ciymgbcd%>
<%= sendkindcurRec.cicdgb%>
<%= medisercurRec.mediser_no%>
<%= medisercurRec.mediser_view%>
<%= hdqtsenddtcurRec.hdqtsenddt%>
<%= hdqtsenddtcurRec.hdqtsenddt_view%>
<%= cmpycdcurRec.cicodeval%>
<%= cmpycdcurRec.cicdnm%>
<%= cmpycdcurRec.cicdynm%>
<%= cmpycdcurRec.ciymgbcd%>
<%= cmpycdcurRec.cicdgb%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Oct 27 17:45:56 KST 2006 */
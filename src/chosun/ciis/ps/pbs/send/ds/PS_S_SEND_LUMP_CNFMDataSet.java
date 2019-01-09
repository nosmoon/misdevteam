/***************************************************************************************************
* 파일명   : SP_PS_S_SEND_LUMP_CNFM.java
* 기능     : 발송-일괄발송 초기
* 작성일자 : 2004-02-26
* 작성자   : 장수환
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 : 기준일자(전월 기준종료일자) out파라미터 추가
* 수정자   : 김재일
* 수정일자 : 2008/11/03
* 백업     :
***************************************************************************************************/


package chosun.ciis.ps.pbs.send.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ps.pbs.send.dm.*;
import chosun.ciis.ps.pbs.send.rec.*;

/**
 * 발송-일괄발송 초기화면
 *
 */

public class PS_S_SEND_LUMP_CNFMDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList medisercur = new ArrayList();
	public ArrayList medicdcur = new ArrayList();
	public ArrayList hdqtsenddtcur = new ArrayList();
	public ArrayList bocdcur = new ArrayList();
	public String errcode;
	public String errmsg;
	public String iv_bas_dt;

	public PS_S_SEND_LUMP_CNFMDataSet(){}
	public PS_S_SEND_LUMP_CNFMDataSet(String errcode, String errmsg, String iv_bas_dt){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.iv_bas_dt = iv_bas_dt;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setIv_bas_dt(String iv_bas_dt){
		this.iv_bas_dt = iv_bas_dt;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getIv_bas_dt(){
		return this.iv_bas_dt;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){			return;		}
		this.iv_bas_dt = Util.checkString(cstmt.getString(6));
		ResultSet rset0 = (ResultSet) cstmt.getObject(7);
		while(rset0.next()){
			PS_S_SEND_LUMP_CNFMMEDICDCURRecord rec = new PS_S_SEND_LUMP_CNFMMEDICDCURRecord();
			rec.cicodeval = Util.checkString(rset0.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset0.getString("cicdnm"));
			rec.cicdynm = Util.checkString(rset0.getString("cicdynm"));
			rec.ciymgbcd = Util.checkString(rset0.getString("ciymgbcd"));
			rec.cicdgb = Util.checkString(rset0.getString("cicdgb"));
			this.medicdcur.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(8);
		while(rset1.next()){
			PS_S_SEND_LUMP_CNFMBOCDCURRecord rec = new PS_S_SEND_LUMP_CNFMBOCDCURRecord();
			rec.cicodeval = Util.checkString(rset1.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset1.getString("cicdnm"));
			this.bocdcur.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(9);
		while(rset2.next()){
			PS_S_SEND_LUMP_CNFMMEDISERCURRecord rec = new PS_S_SEND_LUMP_CNFMMEDISERCURRecord();
			rec.mediser_no = Util.checkString(rset2.getString("mediser_no"));
			rec.mediser_view = Util.checkString(rset2.getString("mediser_view"));
			this.medisercur.add(rec);
		}
		ResultSet rset3 = (ResultSet) cstmt.getObject(10);
		while(rset3.next()){
			PS_S_SEND_LUMP_CNFMHDQTSENDDTCURRecord rec = new PS_S_SEND_LUMP_CNFMHDQTSENDDTCURRecord();
			rec.hdqtsenddt = Util.checkString(rset3.getString("hdqtsenddt"));
			rec.hdqtsenddt_view = Util.checkString(rset3.getString("hdqtsenddt_view"));
			this.hdqtsenddtcur.add(rec);
		}
	}

	public String medicdcurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = medicdcur.size();
		for(int i=0; i<size; i++){
			PS_S_SEND_LUMP_CNFMMEDICDCURRecord rec = (PS_S_SEND_LUMP_CNFMMEDICDCURRecord)medicdcur.get(i);
			
			
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
			PS_S_SEND_LUMP_CNFMBOCDCURRecord rec = (PS_S_SEND_LUMP_CNFMBOCDCURRecord)bocdcur.get(i);
			
			
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
			PS_S_SEND_LUMP_CNFMMEDISERCURRecord rec = (PS_S_SEND_LUMP_CNFMMEDISERCURRecord)medisercur.get(i);
			
			
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
			PS_S_SEND_LUMP_CNFMHDQTSENDDTCURRecord rec = (PS_S_SEND_LUMP_CNFMHDQTSENDDTCURRecord)hdqtsenddtcur.get(i);
			
			
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

	public String medicdcurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = medicdcur.size();
		for(int i=0; i<size; i++){
			PS_S_SEND_LUMP_CNFMMEDICDCURRecord rec = (PS_S_SEND_LUMP_CNFMMEDICDCURRecord)medicdcur.get(i);
			
			
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
			PS_S_SEND_LUMP_CNFMBOCDCURRecord rec = (PS_S_SEND_LUMP_CNFMBOCDCURRecord)bocdcur.get(i);
			
			
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
			PS_S_SEND_LUMP_CNFMMEDISERCURRecord rec = (PS_S_SEND_LUMP_CNFMMEDISERCURRecord)medisercur.get(i);
			
			
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
			PS_S_SEND_LUMP_CNFMHDQTSENDDTCURRecord rec = (PS_S_SEND_LUMP_CNFMHDQTSENDDTCURRecord)hdqtsenddtcur.get(i);
			
			
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

	public String medicdcurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = medicdcur.size();
		for(int i=0; i<size; i++){
			PS_S_SEND_LUMP_CNFMMEDICDCURRecord rec = (PS_S_SEND_LUMP_CNFMMEDICDCURRecord)medicdcur.get(i);
			
			
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
			PS_S_SEND_LUMP_CNFMBOCDCURRecord rec = (PS_S_SEND_LUMP_CNFMBOCDCURRecord)bocdcur.get(i);
			
			
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
			PS_S_SEND_LUMP_CNFMMEDISERCURRecord rec = (PS_S_SEND_LUMP_CNFMMEDISERCURRecord)medisercur.get(i);
			
			
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
			PS_S_SEND_LUMP_CNFMHDQTSENDDTCURRecord rec = (PS_S_SEND_LUMP_CNFMHDQTSENDDTCURRecord)hdqtsenddtcur.get(i);
			
			
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
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	PS_S_SEND_LUMP_CNFMDataSet ds = (PS_S_SEND_LUMP_CNFMDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.medicdcur.size(); i++){
		PS_S_SEND_LUMP_CNFMMEDICDCURRecord medicdcurRec = (PS_S_SEND_LUMP_CNFMMEDICDCURRecord)ds.medicdcur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.bocdcur.size(); i++){
		PS_S_SEND_LUMP_CNFMBOCDCURRecord bocdcurRec = (PS_S_SEND_LUMP_CNFMBOCDCURRecord)ds.bocdcur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.medisercur.size(); i++){
		PS_S_SEND_LUMP_CNFMMEDISERCURRecord medisercurRec = (PS_S_SEND_LUMP_CNFMMEDISERCURRecord)ds.medisercur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.hdqtsenddtcur.size(); i++){
		PS_S_SEND_LUMP_CNFMHDQTSENDDTCURRecord hdqtsenddtcurRec = (PS_S_SEND_LUMP_CNFMHDQTSENDDTCURRecord)ds.hdqtsenddtcur.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getIv_bas_dt()%>
<%= ds.getMedicdcur()%>
<%= ds.getBocdcur()%>
<%= ds.getMedisercur()%>
<%= ds.getHdqtsenddtcur()%>
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
<%= medisercurRec.mediser_no%>
<%= medisercurRec.mediser_view%>
<%= hdqtsenddtcurRec.hdqtsenddt%>
<%= hdqtsenddtcurRec.hdqtsenddt_view%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Nov 03 17:43:01 KST 2008 */
/***************************************************************************************************
* 파일명 : PS_S_BO_SEND_INIT.java
* 기능   : 발송 - 초기화면
* 작성일자 : 2007-04-23
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
 * 발송 - 초기화면
 */

public class PS_S_BO_SEND_INITDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curdeptcd = new ArrayList();
	public ArrayList medisercur = new ArrayList();
	public ArrayList medicdcur = new ArrayList();
	public ArrayList hdqtsenddtcur = new ArrayList();
	public ArrayList areacdcur = new ArrayList();
	public String errcode;
	public String errmsg;
	public String weekday;
	public String weekyymmdd;

	public PS_S_BO_SEND_INITDataSet(){}
	public PS_S_BO_SEND_INITDataSet(String errcode, String errmsg, String weekday, String weekyymmdd){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.weekday = weekday;
		this.weekyymmdd = weekyymmdd;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setWeekday(String weekday){
		this.weekday = weekday;
	}

	public void setWeekyymmdd(String weekyymmdd){
		this.weekyymmdd = weekyymmdd;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getWeekday(){
		return this.weekday;
	}

	public String getWeekyymmdd(){
		return this.weekyymmdd;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){			return;		}
		this.weekday = Util.checkString(cstmt.getString(6));
		this.weekyymmdd = Util.checkString(cstmt.getString(7));
		ResultSet rset0 = (ResultSet) cstmt.getObject(8);
		while(rset0.next()){
			PS_S_BO_SEND_INITMEDICDCURRecord rec = new PS_S_BO_SEND_INITMEDICDCURRecord();
			rec.cicodeval = Util.checkString(rset0.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset0.getString("cicdnm"));
			rec.cicdynm = Util.checkString(rset0.getString("cicdynm"));
			rec.ciymgbcd = Util.checkString(rset0.getString("ciymgbcd"));
			rec.cicdgb = Util.checkString(rset0.getString("cicdgb"));
			this.medicdcur.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(9);
		while(rset1.next()){
			PS_S_BO_SEND_INITCURDEPTCDRecord rec = new PS_S_BO_SEND_INITCURDEPTCDRecord();
			rec.deptcd = Util.checkString(rset1.getString("deptcd"));
			rec.boksnm = Util.checkString(rset1.getString("boksnm"));
			this.curdeptcd.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(10);
		while(rset2.next()){
			PS_S_BO_SEND_INITMEDISERCURRecord rec = new PS_S_BO_SEND_INITMEDISERCURRecord();
			rec.mediser_no = Util.checkString(rset2.getString("mediser_no"));
			rec.mediser_view = Util.checkString(rset2.getString("mediser_view"));
			this.medisercur.add(rec);
		}
		ResultSet rset3 = (ResultSet) cstmt.getObject(11);
		while(rset3.next()){
			PS_S_BO_SEND_INITHDQTSENDDTCURRecord rec = new PS_S_BO_SEND_INITHDQTSENDDTCURRecord();
			rec.hdqtsenddt = Util.checkString(rset3.getString("hdqtsenddt"));
			rec.hdqtsenddt_view = Util.checkString(rset3.getString("hdqtsenddt_view"));
			this.hdqtsenddtcur.add(rec);
		}
		ResultSet rset4 = (ResultSet) cstmt.getObject(12);
		while(rset4.next()){
			PS_S_BO_SEND_INITAREACDCURRecord rec = new PS_S_BO_SEND_INITAREACDCURRecord();
			rec.areacd = Util.checkString(rset4.getString("areacd"));
			rec.areanm = Util.checkString(rset4.getString("areanm"));
			this.areacdcur.add(rec);
		}
	}

	public String medicdcurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = medicdcur.size();
		for(int i=0; i<size; i++){
			PS_S_BO_SEND_INITMEDICDCURRecord rec = (PS_S_BO_SEND_INITMEDICDCURRecord)medicdcur.get(i);
			
			
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

	public String curdeptcdOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curdeptcd.size();
		for(int i=0; i<size; i++){
			PS_S_BO_SEND_INITCURDEPTCDRecord rec = (PS_S_BO_SEND_INITCURDEPTCDRecord)curdeptcd.get(i);
			
			
			String code = rec.deptcd;
			String name = rec.boksnm;
			
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
			PS_S_BO_SEND_INITMEDISERCURRecord rec = (PS_S_BO_SEND_INITMEDISERCURRecord)medisercur.get(i);
			
			
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
			PS_S_BO_SEND_INITHDQTSENDDTCURRecord rec = (PS_S_BO_SEND_INITHDQTSENDDTCURRecord)hdqtsenddtcur.get(i);
			
			
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

	public String areacdcurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = areacdcur.size();
		for(int i=0; i<size; i++){
			PS_S_BO_SEND_INITAREACDCURRecord rec = (PS_S_BO_SEND_INITAREACDCURRecord)areacdcur.get(i);
			
			
			String code = rec.areacd;
			String name = rec.areanm;
			
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
			PS_S_BO_SEND_INITMEDICDCURRecord rec = (PS_S_BO_SEND_INITMEDICDCURRecord)medicdcur.get(i);
			
			
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

	public String curdeptcdChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curdeptcd.size();
		for(int i=0; i<size; i++){
			PS_S_BO_SEND_INITCURDEPTCDRecord rec = (PS_S_BO_SEND_INITCURDEPTCDRecord)curdeptcd.get(i);
			
			
			String code = rec.deptcd;
			String name = rec.boksnm;
			
			sb.append("<input name=\"");
			sb.append("deptcd");
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
			PS_S_BO_SEND_INITMEDISERCURRecord rec = (PS_S_BO_SEND_INITMEDISERCURRecord)medisercur.get(i);
			
			
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
			PS_S_BO_SEND_INITHDQTSENDDTCURRecord rec = (PS_S_BO_SEND_INITHDQTSENDDTCURRecord)hdqtsenddtcur.get(i);
			
			
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

	public String areacdcurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = areacdcur.size();
		for(int i=0; i<size; i++){
			PS_S_BO_SEND_INITAREACDCURRecord rec = (PS_S_BO_SEND_INITAREACDCURRecord)areacdcur.get(i);
			
			
			String code = rec.areacd;
			String name = rec.areanm;
			
			sb.append("<input name=\"");
			sb.append("areacd");
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
			PS_S_BO_SEND_INITMEDICDCURRecord rec = (PS_S_BO_SEND_INITMEDICDCURRecord)medicdcur.get(i);
			
			
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

	public String curdeptcdRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curdeptcd.size();
		for(int i=0; i<size; i++){
			PS_S_BO_SEND_INITCURDEPTCDRecord rec = (PS_S_BO_SEND_INITCURDEPTCDRecord)curdeptcd.get(i);
			
			
			String code = rec.deptcd;
			String name = rec.boksnm;
			
			sb.append("<input name=\"");
			sb.append("deptcd");
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
			PS_S_BO_SEND_INITMEDISERCURRecord rec = (PS_S_BO_SEND_INITMEDISERCURRecord)medisercur.get(i);
			
			
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
			PS_S_BO_SEND_INITHDQTSENDDTCURRecord rec = (PS_S_BO_SEND_INITHDQTSENDDTCURRecord)hdqtsenddtcur.get(i);
			
			
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

	public String areacdcurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = areacdcur.size();
		for(int i=0; i<size; i++){
			PS_S_BO_SEND_INITAREACDCURRecord rec = (PS_S_BO_SEND_INITAREACDCURRecord)areacdcur.get(i);
			
			
			String code = rec.areacd;
			String name = rec.areanm;
			
			sb.append("<input name=\"");
			sb.append("areacd");
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
	PS_S_BO_SEND_INITDataSet ds = (PS_S_BO_SEND_INITDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.medicdcur.size(); i++){
		PS_S_BO_SEND_INITMEDICDCURRecord medicdcurRec = (PS_S_BO_SEND_INITMEDICDCURRecord)ds.medicdcur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curdeptcd.size(); i++){
		PS_S_BO_SEND_INITCURDEPTCDRecord curdeptcdRec = (PS_S_BO_SEND_INITCURDEPTCDRecord)ds.curdeptcd.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.medisercur.size(); i++){
		PS_S_BO_SEND_INITMEDISERCURRecord medisercurRec = (PS_S_BO_SEND_INITMEDISERCURRecord)ds.medisercur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.hdqtsenddtcur.size(); i++){
		PS_S_BO_SEND_INITHDQTSENDDTCURRecord hdqtsenddtcurRec = (PS_S_BO_SEND_INITHDQTSENDDTCURRecord)ds.hdqtsenddtcur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.areacdcur.size(); i++){
		PS_S_BO_SEND_INITAREACDCURRecord areacdcurRec = (PS_S_BO_SEND_INITAREACDCURRecord)ds.areacdcur.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getWeekday()%>
<%= ds.getWeekyymmdd()%>
<%= ds.getMedicdcur()%>
<%= ds.getCurdeptcd()%>
<%= ds.getMedisercur()%>
<%= ds.getHdqtsenddtcur()%>
<%= ds.getAreacdcur()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= medicdcurRec.cicodeval%>
<%= medicdcurRec.cicdnm%>
<%= medicdcurRec.cicdynm%>
<%= medicdcurRec.ciymgbcd%>
<%= medicdcurRec.cicdgb%>
<%= curdeptcdRec.deptcd%>
<%= curdeptcdRec.boksnm%>
<%= medisercurRec.mediser_no%>
<%= medisercurRec.mediser_view%>
<%= hdqtsenddtcurRec.hdqtsenddt%>
<%= hdqtsenddtcurRec.hdqtsenddt_view%>
<%= areacdcurRec.areacd%>
<%= areacdcurRec.areanm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Apr 24 16:33:14 KST 2007 */
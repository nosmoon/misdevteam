/***************************************************************************************************
* 파일명 : SS_L_RCPCMSBS_INITDataSet.java
* 기능 : 지국지원-빌링-수납수수료-기준-초기화면
* 작성일자 : 2004-02-23
* 작성자 : 김영윤
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/


package chosun.ciis.ss.sls.brsup.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.brsup.dm.*;
import chosun.ciis.ss.sls.brsup.rec.*;

/**
 * 지국지원-빌링-수납수수료-기준-초기화면
 *
 */


public class SS_L_RCPCMSBS_INITDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList calcbasiclsfcur = new ArrayList();
	public ArrayList clamtmthdcdcur = new ArrayList();
	public String errcode;
	public String errmsg;

	public SS_L_RCPCMSBS_INITDataSet(){}
	public SS_L_RCPCMSBS_INITDataSet(String errcode, String errmsg){
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
		ResultSet rset0 = (ResultSet) cstmt.getObject(3);
		while(rset0.next()){
			SS_L_RCPCMSBS_INITCLAMTMTHDCDCURRecord rec = new SS_L_RCPCMSBS_INITCLAMTMTHDCDCURRecord();
			rec.cicodeval = Util.checkString(rset0.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset0.getString("cicdnm"));
			rec.cicdynm = Util.checkString(rset0.getString("cicdynm"));
			rec.ciymgbcd = Util.checkString(rset0.getString("ciymgbcd"));
			rec.cicdgb = Util.checkString(rset0.getString("cicdgb"));
			this.clamtmthdcdcur.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(4);
		while(rset1.next()){
			SS_L_RCPCMSBS_INITCALCBASICLSFCURRecord rec = new SS_L_RCPCMSBS_INITCALCBASICLSFCURRecord();
			rec.cicodeval = Util.checkString(rset1.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset1.getString("cicdnm"));
			rec.cicdynm = Util.checkString(rset1.getString("cicdynm"));
			rec.ciymgbcd = Util.checkString(rset1.getString("ciymgbcd"));
			rec.cicdgb = Util.checkString(rset1.getString("cicdgb"));
			this.calcbasiclsfcur.add(rec);
		}
	}

	public String clamtmthdcdcurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = clamtmthdcdcur.size();
		for(int i=0; i<size; i++){
			SS_L_RCPCMSBS_INITCLAMTMTHDCDCURRecord rec = (SS_L_RCPCMSBS_INITCLAMTMTHDCDCURRecord)clamtmthdcdcur.get(i);


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

	public String calcbasiclsfcurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = calcbasiclsfcur.size();
		for(int i=0; i<size; i++){
			SS_L_RCPCMSBS_INITCALCBASICLSFCURRecord rec = (SS_L_RCPCMSBS_INITCALCBASICLSFCURRecord)calcbasiclsfcur.get(i);


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

	public String clamtmthdcdcurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = clamtmthdcdcur.size();
		for(int i=0; i<size; i++){
			SS_L_RCPCMSBS_INITCLAMTMTHDCDCURRecord rec = (SS_L_RCPCMSBS_INITCLAMTMTHDCDCURRecord)clamtmthdcdcur.get(i);


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

	public String calcbasiclsfcurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = calcbasiclsfcur.size();
		for(int i=0; i<size; i++){
			SS_L_RCPCMSBS_INITCALCBASICLSFCURRecord rec = (SS_L_RCPCMSBS_INITCALCBASICLSFCURRecord)calcbasiclsfcur.get(i);


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

	public String clamtmthdcdcurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = clamtmthdcdcur.size();
		for(int i=0; i<size; i++){
			SS_L_RCPCMSBS_INITCLAMTMTHDCDCURRecord rec = (SS_L_RCPCMSBS_INITCLAMTMTHDCDCURRecord)clamtmthdcdcur.get(i);


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

	public String calcbasiclsfcurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = calcbasiclsfcur.size();
		for(int i=0; i<size; i++){
			SS_L_RCPCMSBS_INITCALCBASICLSFCURRecord rec = (SS_L_RCPCMSBS_INITCALCBASICLSFCURRecord)calcbasiclsfcur.get(i);


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
	SS_L_RCPCMSBS_INITDataSet ds = (SS_L_RCPCMSBS_INITDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.clamtmthdcdcur.size(); i++){
		SS_L_RCPCMSBS_INITCLAMTMTHDCDCURRecord clamtmthdcdcurRec = (SS_L_RCPCMSBS_INITCLAMTMTHDCDCURRecord)ds.clamtmthdcdcur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.calcbasiclsfcur.size(); i++){
		SS_L_RCPCMSBS_INITCALCBASICLSFCURRecord calcbasiclsfcurRec = (SS_L_RCPCMSBS_INITCALCBASICLSFCURRecord)ds.calcbasiclsfcur.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getClamtmthdcdcur()%>
<%= ds.getCalcbasiclsfcur()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= clamtmthdcdcurRec.cicodeval%>
<%= clamtmthdcdcurRec.cicdnm%>
<%= clamtmthdcdcurRec.cicdynm%>
<%= clamtmthdcdcurRec.ciymgbcd%>
<%= clamtmthdcdcurRec.cicdgb%>
<%= calcbasiclsfcurRec.cicodeval%>
<%= calcbasiclsfcurRec.cicdnm%>
<%= calcbasiclsfcurRec.cicdynm%>
<%= calcbasiclsfcurRec.ciymgbcd%>
<%= calcbasiclsfcurRec.cicdgb%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Feb 23 21:17:40 KST 2004 */
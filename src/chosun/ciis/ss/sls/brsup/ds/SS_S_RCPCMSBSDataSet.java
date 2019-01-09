/***************************************************************************************************
* 파일명 : SS_S_RCPCMSBSDataSet.java
* 기능 : 지국지원-빌링-수납수수료-기준-상세
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
 * 지국지원-빌링-수납수수료-기준-상세
 *
 */


public class SS_S_RCPCMSBSDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList calcbasiclsfcur = new ArrayList();
	public ArrayList clamtmthdcdcur = new ArrayList();
	public String errcode;
	public String errmsg;
	public String comsnm;
	public String clamtmthdcd;
	public String calcbasiclsf;
	public String coms;
	public String comsrate;
	public String remk;
	public String etc1;
	public String etc2;
	public String etc3;

	public SS_S_RCPCMSBSDataSet(){}
	public SS_S_RCPCMSBSDataSet(String errcode, String errmsg, String comsnm, String clamtmthdcd, String calcbasiclsf, String coms, String comsrate, String remk, String etc1, String etc2, String etc3){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.comsnm = comsnm;
		this.clamtmthdcd = clamtmthdcd;
		this.calcbasiclsf = calcbasiclsf;
		this.coms = coms;
		this.comsrate = comsrate;
		this.remk = remk;
		this.etc1 = etc1;
		this.etc2 = etc2;
		this.etc3 = etc3;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setComsnm(String comsnm){
		this.comsnm = comsnm;
	}

	public void setClamtmthdcd(String clamtmthdcd){
		this.clamtmthdcd = clamtmthdcd;
	}

	public void setCalcbasiclsf(String calcbasiclsf){
		this.calcbasiclsf = calcbasiclsf;
	}

	public void setComs(String coms){
		this.coms = coms;
	}

	public void setComsrate(String comsrate){
		this.comsrate = comsrate;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setEtc1(String etc1){
		this.etc1 = etc1;
	}

	public void setEtc2(String etc2){
		this.etc2 = etc2;
	}

	public void setEtc3(String etc3){
		this.etc3 = etc3;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getComsnm(){
		return this.comsnm;
	}

	public String getClamtmthdcd(){
		return this.clamtmthdcd;
	}

	public String getCalcbasiclsf(){
		return this.calcbasiclsf;
	}

	public String getComs(){
		return this.coms;
	}

	public String getComsrate(){
		return this.comsrate;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getEtc1(){
		return this.etc1;
	}

	public String getEtc2(){
		return this.etc2;
	}

	public String getEtc3(){
		return this.etc3;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){			return;		}
		this.comsnm = Util.checkString(cstmt.getString(4));
		this.clamtmthdcd = Util.checkString(cstmt.getString(5));
		this.calcbasiclsf = Util.checkString(cstmt.getString(6));
		this.coms = Util.checkString(cstmt.getString(7));
		this.comsrate = Util.checkString(cstmt.getString(8));
		this.remk = Util.checkString(cstmt.getString(9));
		this.etc1 = Util.checkString(cstmt.getString(10));
		this.etc2 = Util.checkString(cstmt.getString(11));
		this.etc3 = Util.checkString(cstmt.getString(12));
		ResultSet rset0 = (ResultSet) cstmt.getObject(13);
		while(rset0.next()){
			SS_S_RCPCMSBSCLAMTMTHDCDCURRecord rec = new SS_S_RCPCMSBSCLAMTMTHDCDCURRecord();
			rec.cicodeval = Util.checkString(rset0.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset0.getString("cicdnm"));
			rec.cicdynm = Util.checkString(rset0.getString("cicdynm"));
			rec.ciymgbcd = Util.checkString(rset0.getString("ciymgbcd"));
			rec.cicdgb = Util.checkString(rset0.getString("cicdgb"));
			this.clamtmthdcdcur.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(14);
		while(rset1.next()){
			SS_S_RCPCMSBSCALCBASICLSFCURRecord rec = new SS_S_RCPCMSBSCALCBASICLSFCURRecord();
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
			SS_S_RCPCMSBSCLAMTMTHDCDCURRecord rec = (SS_S_RCPCMSBSCLAMTMTHDCDCURRecord)clamtmthdcdcur.get(i);


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
			SS_S_RCPCMSBSCALCBASICLSFCURRecord rec = (SS_S_RCPCMSBSCALCBASICLSFCURRecord)calcbasiclsfcur.get(i);


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
			SS_S_RCPCMSBSCLAMTMTHDCDCURRecord rec = (SS_S_RCPCMSBSCLAMTMTHDCDCURRecord)clamtmthdcdcur.get(i);


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
			SS_S_RCPCMSBSCALCBASICLSFCURRecord rec = (SS_S_RCPCMSBSCALCBASICLSFCURRecord)calcbasiclsfcur.get(i);


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
			SS_S_RCPCMSBSCLAMTMTHDCDCURRecord rec = (SS_S_RCPCMSBSCLAMTMTHDCDCURRecord)clamtmthdcdcur.get(i);


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
			SS_S_RCPCMSBSCALCBASICLSFCURRecord rec = (SS_S_RCPCMSBSCALCBASICLSFCURRecord)calcbasiclsfcur.get(i);


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
	SS_S_RCPCMSBSDataSet ds = (SS_S_RCPCMSBSDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.clamtmthdcdcur.size(); i++){
		SS_S_RCPCMSBSCLAMTMTHDCDCURRecord clamtmthdcdcurRec = (SS_S_RCPCMSBSCLAMTMTHDCDCURRecord)ds.clamtmthdcdcur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.calcbasiclsfcur.size(); i++){
		SS_S_RCPCMSBSCALCBASICLSFCURRecord calcbasiclsfcurRec = (SS_S_RCPCMSBSCALCBASICLSFCURRecord)ds.calcbasiclsfcur.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getComsnm()%>
<%= ds.getClamtmthdcd()%>
<%= ds.getCalcbasiclsf()%>
<%= ds.getComs()%>
<%= ds.getComsrate()%>
<%= ds.getRemk()%>
<%= ds.getEtc1()%>
<%= ds.getEtc2()%>
<%= ds.getEtc3()%>
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


/* 작성시간 : Wed Feb 25 11:24:46 KST 2004 */
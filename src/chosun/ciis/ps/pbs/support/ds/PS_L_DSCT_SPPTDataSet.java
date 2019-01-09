/***************************************************************************************************
* 파일명 : PS_L_DSCT_SPPT.java
* 기능   : 불편관리 - 초기화면
* 작성일자 : 2005-12-13
* 작성자 : 전현표
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/


package chosun.ciis.ps.pbs.support.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ps.pbs.support.dm.*;
import chosun.ciis.ps.pbs.support.rec.*;

/**
 * 불편관리 - 초기화면
 *
 */

public class PS_L_DSCT_SPPTDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList aplcpathcur = new ArrayList();
	public ArrayList rcptclsfcur = new ArrayList();
	public ArrayList medicdcur = new ArrayList();
	public ArrayList bocdcur = new ArrayList();
	public ArrayList dsctlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public String sysdate;

	public PS_L_DSCT_SPPTDataSet(){}
	public PS_L_DSCT_SPPTDataSet(String errcode, String errmsg, String sysdate){
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
		this.sysdate = Util.checkString(cstmt.getString(4));
		ResultSet rset0 = (ResultSet) cstmt.getObject(5);
		while(rset0.next()){
			PS_L_DSCT_SPPTDSCTLISTRecord rec = new PS_L_DSCT_SPPTDSCTLISTRecord();
			rec.cicodeval = Util.checkString(rset0.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset0.getString("cicdnm"));
			rec.cicdynm = Util.checkString(rset0.getString("cicdynm"));
			rec.ciymgbcd = Util.checkString(rset0.getString("ciymgbcd"));
			rec.cicdgb = Util.checkString(rset0.getString("cicdgb"));
			this.dsctlist.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(6);
		while(rset1.next()){
			PS_L_DSCT_SPPTBOCDCURRecord rec = new PS_L_DSCT_SPPTBOCDCURRecord();
			rec.cicodeval = Util.checkString(rset1.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset1.getString("cicdnm"));
			this.bocdcur.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(7);
		while(rset2.next()){
			PS_L_DSCT_SPPTMEDICDCURRecord rec = new PS_L_DSCT_SPPTMEDICDCURRecord();
			rec.cicodeval = Util.checkString(rset2.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset2.getString("cicdnm"));
			rec.cicdynm = Util.checkString(rset2.getString("cicdynm"));
			rec.ciymgbcd = Util.checkString(rset2.getString("ciymgbcd"));
			rec.cicdgb = Util.checkString(rset2.getString("cicdgb"));
			this.medicdcur.add(rec);
		}
		ResultSet rset3 = (ResultSet) cstmt.getObject(8);
		while(rset3.next()){
			PS_L_DSCT_SPPTRCPTCLSFCURRecord rec = new PS_L_DSCT_SPPTRCPTCLSFCURRecord();
			rec.cicodeval = Util.checkString(rset3.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset3.getString("cicdnm"));
			rec.cicdynm = Util.checkString(rset3.getString("cicdynm"));
			rec.ciymgbcd = Util.checkString(rset3.getString("ciymgbcd"));
			rec.cicdgb = Util.checkString(rset3.getString("cicdgb"));
			this.rcptclsfcur.add(rec);
		}
		ResultSet rset4 = (ResultSet) cstmt.getObject(9);
		while(rset4.next()){
			PS_L_DSCT_SPPTAPLCPATHCURRecord rec = new PS_L_DSCT_SPPTAPLCPATHCURRecord();
			rec.cicodeval = Util.checkString(rset4.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset4.getString("cicdnm"));
			rec.cicdynm = Util.checkString(rset4.getString("cicdynm"));
			rec.ciymgbcd = Util.checkString(rset4.getString("ciymgbcd"));
			rec.cicdgb = Util.checkString(rset4.getString("cicdgb"));
			this.aplcpathcur.add(rec);
		}
	}

	public String dsctlistOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = dsctlist.size();
		for(int i=0; i<size; i++){
			PS_L_DSCT_SPPTDSCTLISTRecord rec = (PS_L_DSCT_SPPTDSCTLISTRecord)dsctlist.get(i);
			
			
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
			PS_L_DSCT_SPPTBOCDCURRecord rec = (PS_L_DSCT_SPPTBOCDCURRecord)bocdcur.get(i);
			
			
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

	public String medicdcurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = medicdcur.size();
		for(int i=0; i<size; i++){
			PS_L_DSCT_SPPTMEDICDCURRecord rec = (PS_L_DSCT_SPPTMEDICDCURRecord)medicdcur.get(i);
			
			
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

	public String rcptclsfcurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = rcptclsfcur.size();
		for(int i=0; i<size; i++){
			PS_L_DSCT_SPPTRCPTCLSFCURRecord rec = (PS_L_DSCT_SPPTRCPTCLSFCURRecord)rcptclsfcur.get(i);
			
			
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

	public String aplcpathcurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = aplcpathcur.size();
		for(int i=0; i<size; i++){
			PS_L_DSCT_SPPTAPLCPATHCURRecord rec = (PS_L_DSCT_SPPTAPLCPATHCURRecord)aplcpathcur.get(i);
			
			
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

	public String dsctlistChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = dsctlist.size();
		for(int i=0; i<size; i++){
			PS_L_DSCT_SPPTDSCTLISTRecord rec = (PS_L_DSCT_SPPTDSCTLISTRecord)dsctlist.get(i);
			
			
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
			PS_L_DSCT_SPPTBOCDCURRecord rec = (PS_L_DSCT_SPPTBOCDCURRecord)bocdcur.get(i);
			
			
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

	public String medicdcurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = medicdcur.size();
		for(int i=0; i<size; i++){
			PS_L_DSCT_SPPTMEDICDCURRecord rec = (PS_L_DSCT_SPPTMEDICDCURRecord)medicdcur.get(i);
			
			
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

	public String rcptclsfcurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = rcptclsfcur.size();
		for(int i=0; i<size; i++){
			PS_L_DSCT_SPPTRCPTCLSFCURRecord rec = (PS_L_DSCT_SPPTRCPTCLSFCURRecord)rcptclsfcur.get(i);
			
			
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

	public String aplcpathcurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = aplcpathcur.size();
		for(int i=0; i<size; i++){
			PS_L_DSCT_SPPTAPLCPATHCURRecord rec = (PS_L_DSCT_SPPTAPLCPATHCURRecord)aplcpathcur.get(i);
			
			
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

	public String dsctlistRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = dsctlist.size();
		for(int i=0; i<size; i++){
			PS_L_DSCT_SPPTDSCTLISTRecord rec = (PS_L_DSCT_SPPTDSCTLISTRecord)dsctlist.get(i);
			
			
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
			PS_L_DSCT_SPPTBOCDCURRecord rec = (PS_L_DSCT_SPPTBOCDCURRecord)bocdcur.get(i);
			
			
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

	public String medicdcurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = medicdcur.size();
		for(int i=0; i<size; i++){
			PS_L_DSCT_SPPTMEDICDCURRecord rec = (PS_L_DSCT_SPPTMEDICDCURRecord)medicdcur.get(i);
			
			
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

	public String rcptclsfcurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = rcptclsfcur.size();
		for(int i=0; i<size; i++){
			PS_L_DSCT_SPPTRCPTCLSFCURRecord rec = (PS_L_DSCT_SPPTRCPTCLSFCURRecord)rcptclsfcur.get(i);
			
			
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

	public String aplcpathcurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = aplcpathcur.size();
		for(int i=0; i<size; i++){
			PS_L_DSCT_SPPTAPLCPATHCURRecord rec = (PS_L_DSCT_SPPTAPLCPATHCURRecord)aplcpathcur.get(i);
			
			
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
	PS_L_DSCT_SPPTDataSet ds = (PS_L_DSCT_SPPTDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.dsctlist.size(); i++){
		PS_L_DSCT_SPPTDSCTLISTRecord dsctlistRec = (PS_L_DSCT_SPPTDSCTLISTRecord)ds.dsctlist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.bocdcur.size(); i++){
		PS_L_DSCT_SPPTBOCDCURRecord bocdcurRec = (PS_L_DSCT_SPPTBOCDCURRecord)ds.bocdcur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.medicdcur.size(); i++){
		PS_L_DSCT_SPPTMEDICDCURRecord medicdcurRec = (PS_L_DSCT_SPPTMEDICDCURRecord)ds.medicdcur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.rcptclsfcur.size(); i++){
		PS_L_DSCT_SPPTRCPTCLSFCURRecord rcptclsfcurRec = (PS_L_DSCT_SPPTRCPTCLSFCURRecord)ds.rcptclsfcur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.aplcpathcur.size(); i++){
		PS_L_DSCT_SPPTAPLCPATHCURRecord aplcpathcurRec = (PS_L_DSCT_SPPTAPLCPATHCURRecord)ds.aplcpathcur.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getSysdate()%>
<%= ds.getDsctlist()%>
<%= ds.getBocdcur()%>
<%= ds.getMedicdcur()%>
<%= ds.getRcptclsfcur()%>
<%= ds.getAplcpathcur()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= dsctlistRec.cicodeval%>
<%= dsctlistRec.cicdnm%>
<%= dsctlistRec.cicdynm%>
<%= dsctlistRec.ciymgbcd%>
<%= dsctlistRec.cicdgb%>
<%= bocdcurRec.cicodeval%>
<%= bocdcurRec.cicdnm%>
<%= medicdcurRec.cicodeval%>
<%= medicdcurRec.cicdnm%>
<%= medicdcurRec.cicdynm%>
<%= medicdcurRec.ciymgbcd%>
<%= medicdcurRec.cicdgb%>
<%= rcptclsfcurRec.cicodeval%>
<%= rcptclsfcurRec.cicdnm%>
<%= rcptclsfcurRec.cicdynm%>
<%= rcptclsfcurRec.ciymgbcd%>
<%= rcptclsfcurRec.cicdgb%>
<%= aplcpathcurRec.cicodeval%>
<%= aplcpathcurRec.cicdnm%>
<%= aplcpathcurRec.cicdynm%>
<%= aplcpathcurRec.ciymgbcd%>
<%= aplcpathcurRec.cicdgb%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Jan 02 19:29:45 KST 2006 */
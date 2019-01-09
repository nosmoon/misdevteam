/***************************************************************************************************
* 파일명 :
* 기능 :
* 작성일자 : 2003-12-27
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
 *
 *
 */


public class SL_L_DSCT_INITDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList acpnpathcd = new ArrayList();
	public ArrayList dscttypecdcur = new ArrayList();
	public String errcode;
	public String errmsg;

	public SL_L_DSCT_INITDataSet(){}
	public SL_L_DSCT_INITDataSet(String errcode, String errmsg){
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
			SL_L_DSCT_INITDSCTTYPECDCURRecord rec = new SL_L_DSCT_INITDSCTTYPECDCURRecord();
			rec.cicodeval = Util.checkString(rset0.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset0.getString("cicdnm"));
			rec.cicdynm = Util.checkString(rset0.getString("cicdynm"));
			rec.ciymgbcd = Util.checkString(rset0.getString("ciymgbcd"));
			rec.cicdgb = Util.checkString(rset0.getString("cicdgb"));
			this.dscttypecdcur.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(4);
		while(rset1.next()){
			SL_L_DSCT_INITACPNPATHCDRecord rec = new SL_L_DSCT_INITACPNPATHCDRecord();
			rec.cicodeval = Util.checkString(rset1.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset1.getString("cicdnm"));
			rec.cicdynm = Util.checkString(rset1.getString("cicdynm"));
			rec.ciymgbcd = Util.checkString(rset1.getString("ciymgbcd"));
			rec.cicdgb = Util.checkString(rset1.getString("cicdgb"));
			this.acpnpathcd.add(rec);
		}
	}

	public String dscttypecdcurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = dscttypecdcur.size();
		for(int i=0; i<size; i++){
			SL_L_DSCT_INITDSCTTYPECDCURRecord rec = (SL_L_DSCT_INITDSCTTYPECDCURRecord)dscttypecdcur.get(i);


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

	public String acpnpathcdOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = acpnpathcd.size();
		for(int i=0; i<size; i++){
			SL_L_DSCT_INITACPNPATHCDRecord rec = (SL_L_DSCT_INITACPNPATHCDRecord)acpnpathcd.get(i);


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

	public String dscttypecdcurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = dscttypecdcur.size();
		for(int i=0; i<size; i++){
			SL_L_DSCT_INITDSCTTYPECDCURRecord rec = (SL_L_DSCT_INITDSCTTYPECDCURRecord)dscttypecdcur.get(i);


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

	public String acpnpathcdChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = acpnpathcd.size();
		for(int i=0; i<size; i++){
			SL_L_DSCT_INITACPNPATHCDRecord rec = (SL_L_DSCT_INITACPNPATHCDRecord)acpnpathcd.get(i);


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

	public String dscttypecdcurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = dscttypecdcur.size();
		for(int i=0; i<size; i++){
			SL_L_DSCT_INITDSCTTYPECDCURRecord rec = (SL_L_DSCT_INITDSCTTYPECDCURRecord)dscttypecdcur.get(i);


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

	public String acpnpathcdRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = acpnpathcd.size();
		for(int i=0; i<size; i++){
			SL_L_DSCT_INITACPNPATHCDRecord rec = (SL_L_DSCT_INITACPNPATHCDRecord)acpnpathcd.get(i);


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
	SL_L_DSCT_INITDataSet ds = (SL_L_DSCT_INITDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.dscttypecdcur.size(); i++){
		SL_L_DSCT_INITDSCTTYPECDCURRecord dscttypecdcurRec = (SL_L_DSCT_INITDSCTTYPECDCURRecord)ds.dscttypecdcur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.acpnpathcd.size(); i++){
		SL_L_DSCT_INITACPNPATHCDRecord acpnpathcdRec = (SL_L_DSCT_INITACPNPATHCDRecord)ds.acpnpathcd.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getDscttypecdcur()%>
<%= ds.getAcpnpathcd()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= dscttypecdcurRec.cicodeval%>
<%= dscttypecdcurRec.cicdnm%>
<%= dscttypecdcurRec.cicdynm%>
<%= dscttypecdcurRec.ciymgbcd%>
<%= dscttypecdcurRec.cicdgb%>
<%= acpnpathcdRec.cicodeval%>
<%= acpnpathcdRec.cicdnm%>
<%= acpnpathcdRec.cicdynm%>
<%= acpnpathcdRec.ciymgbcd%>
<%= acpnpathcdRec.cicdgb%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Jan 28 12:06:00 KST 2004 */
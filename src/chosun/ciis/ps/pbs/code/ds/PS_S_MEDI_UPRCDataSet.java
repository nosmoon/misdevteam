/***************************************************************************************************
* 파일명 : SP_PS_S_MEDI_UPRC.java
* 기능 :   코드관리-매체단가관리 초기화면
* 작성일자 : 2004-02-20
* 작성자 : 김건호
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/


package chosun.ciis.ps.pbs.code.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ps.pbs.code.dm.*;
import chosun.ciis.ps.pbs.code.rec.*;

/**
 * 코드관리-매체단가관리 초기화면
 *
 */


public class PS_S_MEDI_UPRCDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList acpnclsf = new ArrayList();
	public ArrayList bocd = new ArrayList();
	public ArrayList acpntype = new ArrayList();
	public ArrayList medicdcur = new ArrayList();
	public String errcode;
	public String errmsg;
	public String sysdate;

	public PS_S_MEDI_UPRCDataSet(){}
	public PS_S_MEDI_UPRCDataSet(String errcode, String errmsg, String sysdate){
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
			PS_S_MEDI_UPRCBOCDRecord rec = new PS_S_MEDI_UPRCBOCDRecord();
			rec.bocd = Util.checkString(rset0.getString("bocd"));
			rec.bonm = Util.checkString(rset0.getString("bonm"));
			this.bocd.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(6);
		while(rset1.next()){
			PS_S_MEDI_UPRCMEDICDCURRecord rec = new PS_S_MEDI_UPRCMEDICDCURRecord();
			rec.ciymgbcd = Util.checkString(rset1.getString("ciymgbcd"));
			rec.cicdgb = Util.checkString(rset1.getString("cicdgb"));
			rec.cicodeval = Util.checkString(rset1.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset1.getString("cicdnm"));
			rec.cicdynm = Util.checkString(rset1.getString("cicdynm"));
			this.medicdcur.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(7);
		while(rset2.next()){
			PS_S_MEDI_UPRCACPNTYPERecord rec = new PS_S_MEDI_UPRCACPNTYPERecord();
			rec.ciymgbcd = Util.checkString(rset2.getString("ciymgbcd"));
			rec.cicdgb = Util.checkString(rset2.getString("cicdgb"));
			rec.cicodeval = Util.checkString(rset2.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset2.getString("cicdnm"));
			rec.cicdynm = Util.checkString(rset2.getString("cicdynm"));
			this.acpntype.add(rec);
		}
		ResultSet rset3 = (ResultSet) cstmt.getObject(8);
		while(rset3.next()){
			PS_S_MEDI_UPRCACPNCLSFRecord rec = new PS_S_MEDI_UPRCACPNCLSFRecord();
			rec.ciymgbcd = Util.checkString(rset3.getString("ciymgbcd"));
			rec.cicdgb = Util.checkString(rset3.getString("cicdgb"));
			rec.cicodeval = Util.checkString(rset3.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset3.getString("cicdnm"));
			rec.cicdynm = Util.checkString(rset3.getString("cicdynm"));
			this.acpnclsf.add(rec);
		}
	}

	public String bocdOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = bocd.size();
		for(int i=0; i<size; i++){
			PS_S_MEDI_UPRCBOCDRecord rec = (PS_S_MEDI_UPRCBOCDRecord)bocd.get(i);


			String code = rec.bocd;
			String name = rec.bonm;

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
			PS_S_MEDI_UPRCMEDICDCURRecord rec = (PS_S_MEDI_UPRCMEDICDCURRecord)medicdcur.get(i);


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

	public String acpntypeOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = acpntype.size();
		for(int i=0; i<size; i++){
			PS_S_MEDI_UPRCACPNTYPERecord rec = (PS_S_MEDI_UPRCACPNTYPERecord)acpntype.get(i);


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

	public String acpnclsfOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = acpnclsf.size();
		for(int i=0; i<size; i++){
			PS_S_MEDI_UPRCACPNCLSFRecord rec = (PS_S_MEDI_UPRCACPNCLSFRecord)acpnclsf.get(i);


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

	public String bocdChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = bocd.size();
		for(int i=0; i<size; i++){
			PS_S_MEDI_UPRCBOCDRecord rec = (PS_S_MEDI_UPRCBOCDRecord)bocd.get(i);


			String code = rec.bocd;
			String name = rec.bonm;

			sb.append("<input name=\"");
			sb.append("bocd");
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
			PS_S_MEDI_UPRCMEDICDCURRecord rec = (PS_S_MEDI_UPRCMEDICDCURRecord)medicdcur.get(i);


			String code = rec.ciymgbcd;
			String name = rec.cicdgb;

			sb.append("<input name=\"");
			sb.append("ciymgbcd");
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

	public String acpntypeChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = acpntype.size();
		for(int i=0; i<size; i++){
			PS_S_MEDI_UPRCACPNTYPERecord rec = (PS_S_MEDI_UPRCACPNTYPERecord)acpntype.get(i);


			String code = rec.ciymgbcd;
			String name = rec.cicdgb;

			sb.append("<input name=\"");
			sb.append("ciymgbcd");
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

	public String acpnclsfChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = acpnclsf.size();
		for(int i=0; i<size; i++){
			PS_S_MEDI_UPRCACPNCLSFRecord rec = (PS_S_MEDI_UPRCACPNCLSFRecord)acpnclsf.get(i);


			String code = rec.ciymgbcd;
			String name = rec.cicdgb;

			sb.append("<input name=\"");
			sb.append("ciymgbcd");
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

	public String bocdRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = bocd.size();
		for(int i=0; i<size; i++){
			PS_S_MEDI_UPRCBOCDRecord rec = (PS_S_MEDI_UPRCBOCDRecord)bocd.get(i);


			String code = rec.bocd;
			String name = rec.bonm;

			sb.append("<input name=\"");
			sb.append("bocd");
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
			PS_S_MEDI_UPRCMEDICDCURRecord rec = (PS_S_MEDI_UPRCMEDICDCURRecord)medicdcur.get(i);


			String code = rec.ciymgbcd;
			String name = rec.cicdgb;

			sb.append("<input name=\"");
			sb.append("ciymgbcd");
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

	public String acpntypeRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = acpntype.size();
		for(int i=0; i<size; i++){
			PS_S_MEDI_UPRCACPNTYPERecord rec = (PS_S_MEDI_UPRCACPNTYPERecord)acpntype.get(i);


			String code = rec.ciymgbcd;
			String name = rec.cicdgb;

			sb.append("<input name=\"");
			sb.append("ciymgbcd");
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

	public String acpnclsfRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = acpnclsf.size();
		for(int i=0; i<size; i++){
			PS_S_MEDI_UPRCACPNCLSFRecord rec = (PS_S_MEDI_UPRCACPNCLSFRecord)acpnclsf.get(i);


			String code = rec.ciymgbcd;
			String name = rec.cicdgb;

			sb.append("<input name=\"");
			sb.append("ciymgbcd");
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
	PS_S_MEDI_UPRCDataSet ds = (PS_S_MEDI_UPRCDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.bocd.size(); i++){
		PS_S_MEDI_UPRCBOCDRecord bocdRec = (PS_S_MEDI_UPRCBOCDRecord)ds.bocd.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.medicdcur.size(); i++){
		PS_S_MEDI_UPRCMEDICDCURRecord medicdcurRec = (PS_S_MEDI_UPRCMEDICDCURRecord)ds.medicdcur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.acpntype.size(); i++){
		PS_S_MEDI_UPRCACPNTYPERecord acpntypeRec = (PS_S_MEDI_UPRCACPNTYPERecord)ds.acpntype.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.acpnclsf.size(); i++){
		PS_S_MEDI_UPRCACPNCLSFRecord acpnclsfRec = (PS_S_MEDI_UPRCACPNCLSFRecord)ds.acpnclsf.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getSysdate()%>
<%= ds.getBocd()%>
<%= ds.getMedicdcur()%>
<%= ds.getAcpntype()%>
<%= ds.getAcpnclsf()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= bocdRec.bocd%>
<%= bocdRec.bonm%>
<%= medicdcurRec.ciymgbcd%>
<%= medicdcurRec.cicdgb%>
<%= medicdcurRec.cicodeval%>
<%= medicdcurRec.cicdnm%>
<%= medicdcurRec.cicdynm%>
<%= acpntypeRec.ciymgbcd%>
<%= acpntypeRec.cicdgb%>
<%= acpntypeRec.cicodeval%>
<%= acpntypeRec.cicdnm%>
<%= acpntypeRec.cicdynm%>
<%= acpnclsfRec.ciymgbcd%>
<%= acpnclsfRec.cicdgb%>
<%= acpnclsfRec.cicodeval%>
<%= acpnclsfRec.cicdnm%>
<%= acpnclsfRec.cicdynm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Feb 20 10:26:59 KST 2004 */
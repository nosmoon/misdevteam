/***************************************************************************************************
* 파일명 : SP_PS_C_EXCSRCPMPROC.java
* 수당-초과수당 초기화면
* 작성일자 : 2004-03-19
* 작성자 : 김건호
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/


package chosun.ciis.ps.pbs.bill.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ps.pbs.bill.dm.*;
import chosun.ciis.ps.pbs.bill.rec.*;

/**
 * 수당-초과수당 초기화면
 *
 */



public class PS_C_EXCSRCPMPROCDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList asinbocdcur = new ArrayList();
	public ArrayList excsrcpmporcyn = new ArrayList();
	public ArrayList excsrcpmporcclsf = new ArrayList();
	public String errcode;
	public String errmsg;
	public String sysdate;

	public PS_C_EXCSRCPMPROCDataSet(){}
	public PS_C_EXCSRCPMPROCDataSet(String errcode, String errmsg, String sysdate){
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
		this.sysdate = Util.checkString(cstmt.getString(5));
		ResultSet rset0 = (ResultSet) cstmt.getObject(6);
		while(rset0.next()){
			PS_C_EXCSRCPMPROCASINBOCDCURRecord rec = new PS_C_EXCSRCPMPROCASINBOCDCURRecord();
			rec.bocd = Util.checkString(rset0.getString("bocd"));
			rec.bonm = Util.checkString(rset0.getString("bonm"));
			rec.deptcd = Util.checkString(rset0.getString("deptcd"));
			rec.sellnetclsf = Util.checkString(rset0.getString("sellnetclsf"));
			this.asinbocdcur.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(7);
		while(rset1.next()){
			PS_C_EXCSRCPMPROCEXCSRCPMPORCYNRecord rec = new PS_C_EXCSRCPMPROCEXCSRCPMPORCYNRecord();
			rec.ciymgbcd = Util.checkString(rset1.getString("ciymgbcd"));
			rec.cicdgb = Util.checkString(rset1.getString("cicdgb"));
			rec.cicodeval = Util.checkString(rset1.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset1.getString("cicdnm"));
			rec.cicdynm = Util.checkString(rset1.getString("cicdynm"));
			this.excsrcpmporcyn.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(8);
		while(rset2.next()){
			PS_C_EXCSRCPMPROCEXCSRCPMPORCCLSFRecord rec = new PS_C_EXCSRCPMPROCEXCSRCPMPORCCLSFRecord();
			rec.ciymgbcd = Util.checkString(rset2.getString("ciymgbcd"));
			rec.cicdgb = Util.checkString(rset2.getString("cicdgb"));
			rec.cicodeval = Util.checkString(rset2.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset2.getString("cicdnm"));
			rec.cicdynm = Util.checkString(rset2.getString("cicdynm"));
			this.excsrcpmporcclsf.add(rec);
		}
	}

	public String asinbocdcurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = asinbocdcur.size();
		for(int i=0; i<size; i++){
			PS_C_EXCSRCPMPROCASINBOCDCURRecord rec = (PS_C_EXCSRCPMPROCASINBOCDCURRecord)asinbocdcur.get(i);


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

	public String excsrcpmporcynOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = excsrcpmporcyn.size();
		for(int i=0; i<size; i++){
			PS_C_EXCSRCPMPROCEXCSRCPMPORCYNRecord rec = (PS_C_EXCSRCPMPROCEXCSRCPMPORCYNRecord)excsrcpmporcyn.get(i);


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

	public String excsrcpmporcclsfOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = excsrcpmporcclsf.size();
		for(int i=0; i<size; i++){
			PS_C_EXCSRCPMPROCEXCSRCPMPORCCLSFRecord rec = (PS_C_EXCSRCPMPROCEXCSRCPMPORCCLSFRecord)excsrcpmporcclsf.get(i);


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

	public String asinbocdcurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = asinbocdcur.size();
		for(int i=0; i<size; i++){
			PS_C_EXCSRCPMPROCASINBOCDCURRecord rec = (PS_C_EXCSRCPMPROCASINBOCDCURRecord)asinbocdcur.get(i);


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

	public String excsrcpmporcynChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = excsrcpmporcyn.size();
		for(int i=0; i<size; i++){
			PS_C_EXCSRCPMPROCEXCSRCPMPORCYNRecord rec = (PS_C_EXCSRCPMPROCEXCSRCPMPORCYNRecord)excsrcpmporcyn.get(i);

            String code = rec.cicodeval;
			String name = rec.cicdnm;

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

	public String excsrcpmporcclsfChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = excsrcpmporcclsf.size();
		for(int i=0; i<size; i++){
			PS_C_EXCSRCPMPROCEXCSRCPMPORCCLSFRecord rec = (PS_C_EXCSRCPMPROCEXCSRCPMPORCCLSFRecord)excsrcpmporcclsf.get(i);


            String code = rec.cicodeval;
			String name = rec.cicdnm;

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

	public String asinbocdcurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = asinbocdcur.size();
		for(int i=0; i<size; i++){
			PS_C_EXCSRCPMPROCASINBOCDCURRecord rec = (PS_C_EXCSRCPMPROCASINBOCDCURRecord)asinbocdcur.get(i);


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

	public String excsrcpmporcynRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = excsrcpmporcyn.size();
		for(int i=0; i<size; i++){
			PS_C_EXCSRCPMPROCEXCSRCPMPORCYNRecord rec = (PS_C_EXCSRCPMPROCEXCSRCPMPORCYNRecord)excsrcpmporcyn.get(i);


            String code = rec.cicodeval;
			String name = rec.cicdnm;

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

	public String excsrcpmporcclsfRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = excsrcpmporcclsf.size();
		for(int i=0; i<size; i++){
			PS_C_EXCSRCPMPROCEXCSRCPMPORCCLSFRecord rec = (PS_C_EXCSRCPMPROCEXCSRCPMPORCCLSFRecord)excsrcpmporcclsf.get(i);


            String code = rec.cicodeval;
			String name = rec.cicdnm;

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
	PS_C_EXCSRCPMPROCDataSet ds = (PS_C_EXCSRCPMPROCDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.asinbocdcur.size(); i++){
		PS_C_EXCSRCPMPROCASINBOCDCURRecord asinbocdcurRec = (PS_C_EXCSRCPMPROCASINBOCDCURRecord)ds.asinbocdcur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.excsrcpmporcyn.size(); i++){
		PS_C_EXCSRCPMPROCEXCSRCPMPORCYNRecord excsrcpmporcynRec = (PS_C_EXCSRCPMPROCEXCSRCPMPORCYNRecord)ds.excsrcpmporcyn.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.excsrcpmporcclsf.size(); i++){
		PS_C_EXCSRCPMPROCEXCSRCPMPORCCLSFRecord excsrcpmporcclsfRec = (PS_C_EXCSRCPMPROCEXCSRCPMPORCCLSFRecord)ds.excsrcpmporcclsf.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getSysdate()%>
<%= ds.getAsinbocdcur()%>
<%= ds.getExcsrcpmporcyn()%>
<%= ds.getExcsrcpmporcclsf()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= asinbocdcurRec.bocd%>
<%= asinbocdcurRec.bonm%>
<%= asinbocdcurRec.deptcd%>
<%= asinbocdcurRec.sellnetclsf%>
<%= excsrcpmporcynRec.ciymgbcd%>
<%= excsrcpmporcynRec.cicdgb%>
<%= excsrcpmporcynRec.cicodeval%>
<%= excsrcpmporcynRec.cicdnm%>
<%= excsrcpmporcynRec.cicdynm%>
<%= excsrcpmporcclsfRec.ciymgbcd%>
<%= excsrcpmporcclsfRec.cicdgb%>
<%= excsrcpmporcclsfRec.cicodeval%>
<%= excsrcpmporcclsfRec.cicdnm%>
<%= excsrcpmporcclsfRec.cicdynm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Mar 26 15:14:41 KST 2004 */
/***************************************************************************************************
* 파일명 : SP_PS_S_RDR_ARBT.java
* 기능 :   독자-중재처리 초기화면
* 작성일자 : 2004-02-23
* 작성자 : 김건호
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/


package chosun.ciis.ps.pbs.reader.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ps.pbs.reader.dm.*;
import chosun.ciis.ps.pbs.reader.rec.*;

/**
 * 독자-중재처리 초기화면
 *
 */


public class PS_S_RDR_ARBTDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList bocd = new ArrayList();
	public ArrayList aprvproccd = new ArrayList();
	public String errcode;
	public String errmsg;
	public String sysdate;

	public PS_S_RDR_ARBTDataSet(){}
	public PS_S_RDR_ARBTDataSet(String errcode, String errmsg, String sysdate){
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
			PS_S_RDR_ARBTBOCDRecord rec = new PS_S_RDR_ARBTBOCDRecord();
			rec.bocd = Util.checkString(rset0.getString("bocd"));
			rec.bonm = Util.checkString(rset0.getString("bonm"));
			this.bocd.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(6);
		while(rset1.next()){
			PS_S_RDR_ARBTAPRVPROCCDRecord rec = new PS_S_RDR_ARBTAPRVPROCCDRecord();
			rec.ciymgbcd = Util.checkString(rset1.getString("ciymgbcd"));
			rec.cicdgb = Util.checkString(rset1.getString("cicdgb"));
			rec.cicodeval = Util.checkString(rset1.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset1.getString("cicdnm"));
			rec.cicdynm = Util.checkString(rset1.getString("cicdynm"));
			this.aprvproccd.add(rec);
		}
	}

	public String bocdOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = bocd.size();
		for(int i=0; i<size; i++){
			PS_S_RDR_ARBTBOCDRecord rec = (PS_S_RDR_ARBTBOCDRecord)bocd.get(i);


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

	public String aprvproccdOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = aprvproccd.size();
		for(int i=0; i<size; i++){
			PS_S_RDR_ARBTAPRVPROCCDRecord rec = (PS_S_RDR_ARBTAPRVPROCCDRecord)aprvproccd.get(i);


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
			PS_S_RDR_ARBTBOCDRecord rec = (PS_S_RDR_ARBTBOCDRecord)bocd.get(i);


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

	public String aprvproccdChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = aprvproccd.size();
		for(int i=0; i<size; i++){
			PS_S_RDR_ARBTAPRVPROCCDRecord rec = (PS_S_RDR_ARBTAPRVPROCCDRecord)aprvproccd.get(i);


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
			PS_S_RDR_ARBTBOCDRecord rec = (PS_S_RDR_ARBTBOCDRecord)bocd.get(i);


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

	public String aprvproccdRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = aprvproccd.size();
		for(int i=0; i<size; i++){
			PS_S_RDR_ARBTAPRVPROCCDRecord rec = (PS_S_RDR_ARBTAPRVPROCCDRecord)aprvproccd.get(i);


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
	PS_S_RDR_ARBTDataSet ds = (PS_S_RDR_ARBTDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.bocd.size(); i++){
		PS_S_RDR_ARBTBOCDRecord bocdRec = (PS_S_RDR_ARBTBOCDRecord)ds.bocd.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.aprvproccd.size(); i++){
		PS_S_RDR_ARBTAPRVPROCCDRecord aprvproccdRec = (PS_S_RDR_ARBTAPRVPROCCDRecord)ds.aprvproccd.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getSysdate()%>
<%= ds.getBocd()%>
<%= ds.getAprvproccd()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= bocdRec.bocd%>
<%= bocdRec.bonm%>
<%= aprvproccdRec.ciymgbcd%>
<%= aprvproccdRec.cicdgb%>
<%= aprvproccdRec.cicodeval%>
<%= aprvproccdRec.cicdnm%>
<%= aprvproccdRec.cicdynm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Feb 24 19:48:57 KST 2004 */
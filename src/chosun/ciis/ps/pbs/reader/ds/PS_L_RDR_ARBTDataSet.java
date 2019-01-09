/***************************************************************************************************
* 파일명 : SP_PS_L_RDR_ARBT.java
* 기능 :   독자-중재처리 조회화면
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
 * 독자-중재처리 조회화면
 *
 */


public class PS_L_RDR_ARBTDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList aprvproccd = new ArrayList();
	public ArrayList curcommlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public long totalcnt;

	public PS_L_RDR_ARBTDataSet(){}
	public PS_L_RDR_ARBTDataSet(String errcode, String errmsg, long totalcnt){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.totalcnt = totalcnt;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setTotalcnt(long totalcnt){
		this.totalcnt = totalcnt;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public long getTotalcnt(){
		return this.totalcnt;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){			return;		}
		this.totalcnt = cstmt.getLong(10);
		ResultSet rset0 = (ResultSet) cstmt.getObject(11);
		while(rset0.next()){
			PS_L_RDR_ARBTAPRVPROCCDRecord rec = new PS_L_RDR_ARBTAPRVPROCCDRecord();
			rec.ciymgbcd = Util.checkString(rset0.getString("ciymgbcd"));
			rec.cicdgb = Util.checkString(rset0.getString("cicdgb"));
			rec.cicodeval = Util.checkString(rset0.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset0.getString("cicdnm"));
			rec.cicdynm = Util.checkString(rset0.getString("cicdynm"));
			this.aprvproccd.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(12);
		while(rset1.next()){
			PS_L_RDR_ARBTCURCOMMLISTRecord rec = new PS_L_RDR_ARBTCURCOMMLISTRecord();
			rec.arbtno = Util.checkString(rset1.getString("arbtno"));
			rec.arbtaplcdt = Util.checkString(rset1.getString("arbtaplcdt"));
			rec.aprvproccd = Util.checkString(rset1.getString("aprvproccd"));
			rec.arbtprocresn = Util.checkString(rset1.getString("arbtprocresn"));
			rec.medicd = Util.checkString(rset1.getString("medicd"));
			rec.medinm = Util.checkString(rset1.getString("medinm"));
			rec.subsfrser_no = Util.checkString(rset1.getString("subsfrser_no"));
			rec.rdrnm = Util.checkString(rset1.getString("rdrnm"));
			rec.rdrtel_no = Util.checkString(rset1.getString("rdrtel_no"));
			rec.rdrptph_no = Util.checkString(rset1.getString("rdrptph_no"));
			rec.bocd = Util.checkString(rset1.getString("bocd"));
			rec.bonm = Util.checkString(rset1.getString("bonm"));
			rec.dlvzip = Util.checkString(rset1.getString("dlvzip"));
			rec.dlvaddr = Util.checkString(rset1.getString("dlvaddr"));
			rec.dlvdtlsaddr = Util.checkString(rset1.getString("dlvdtlsaddr"));
			this.curcommlist.add(rec);
		}
	}

	public String aprvproccdOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = aprvproccd.size();
		for(int i=0; i<size; i++){
			PS_L_RDR_ARBTAPRVPROCCDRecord rec = (PS_L_RDR_ARBTAPRVPROCCDRecord)aprvproccd.get(i);


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

	public String curcommlistOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curcommlist.size();
		for(int i=0; i<size; i++){
			PS_L_RDR_ARBTCURCOMMLISTRecord rec = (PS_L_RDR_ARBTCURCOMMLISTRecord)curcommlist.get(i);


			String code = rec.arbtno;
			String name = rec.arbtaplcdt;

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

	public String aprvproccdChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = aprvproccd.size();
		for(int i=0; i<size; i++){
			PS_L_RDR_ARBTAPRVPROCCDRecord rec = (PS_L_RDR_ARBTAPRVPROCCDRecord)aprvproccd.get(i);


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

	public String curcommlistChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curcommlist.size();
		for(int i=0; i<size; i++){
			PS_L_RDR_ARBTCURCOMMLISTRecord rec = (PS_L_RDR_ARBTCURCOMMLISTRecord)curcommlist.get(i);


			String code = rec.arbtno;
			String name = rec.arbtaplcdt;

			sb.append("<input name=\"");
			sb.append("arbtno");
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

	public String aprvproccdRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = aprvproccd.size();
		for(int i=0; i<size; i++){
			PS_L_RDR_ARBTAPRVPROCCDRecord rec = (PS_L_RDR_ARBTAPRVPROCCDRecord)aprvproccd.get(i);


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

	public String curcommlistRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curcommlist.size();
		for(int i=0; i<size; i++){
			PS_L_RDR_ARBTCURCOMMLISTRecord rec = (PS_L_RDR_ARBTCURCOMMLISTRecord)curcommlist.get(i);


			String code = rec.arbtno;
			String name = rec.arbtaplcdt;

			sb.append("<input name=\"");
			sb.append("arbtno");
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
	PS_L_RDR_ARBTDataSet ds = (PS_L_RDR_ARBTDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.aprvproccd.size(); i++){
		PS_L_RDR_ARBTAPRVPROCCDRecord aprvproccdRec = (PS_L_RDR_ARBTAPRVPROCCDRecord)ds.aprvproccd.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curcommlist.size(); i++){
		PS_L_RDR_ARBTCURCOMMLISTRecord curcommlistRec = (PS_L_RDR_ARBTCURCOMMLISTRecord)ds.curcommlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getTotalcnt()%>
<%= ds.getAprvproccd()%>
<%= ds.getCurcommlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= aprvproccdRec.ciymgbcd%>
<%= aprvproccdRec.cicdgb%>
<%= aprvproccdRec.cicodeval%>
<%= aprvproccdRec.cicdnm%>
<%= aprvproccdRec.cicdynm%>
<%= curcommlistRec.arbtno%>
<%= curcommlistRec.arbtaplcdt%>
<%= curcommlistRec.aprvproccd%>
<%= curcommlistRec.arbtprocresn%>
<%= curcommlistRec.medicd%>
<%= curcommlistRec.medinm%>
<%= curcommlistRec.subsfrser_no%>
<%= curcommlistRec.rdrnm%>
<%= curcommlistRec.rdrtel_no%>
<%= curcommlistRec.rdrptph_no%>
<%= curcommlistRec.bocd%>
<%= curcommlistRec.bonm%>
<%= curcommlistRec.dlvzip%>
<%= curcommlistRec.dlvaddr%>
<%= curcommlistRec.dlvdtlsaddr%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Feb 26 20:06:06 KST 2004 */
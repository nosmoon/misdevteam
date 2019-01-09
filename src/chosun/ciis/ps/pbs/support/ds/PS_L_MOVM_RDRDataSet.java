/***************************************************************************************************
 * 파일명   : PS_L_MOVM_RDR.java
 * 기능     : 이사신청 리스트
 * 작성일자 : 2005-02-07
 * 작성자   : 전현표
 **************************************************************************************************/
 /**************************************************************************************************
 * 수정내역 :
 * 수정자   :
 * 수정일자 :
 * 백업     : 
 **************************************************************************************************/



package chosun.ciis.ps.pbs.support.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ps.pbs.support.dm.*;
import chosun.ciis.ps.pbs.support.rec.*;

/**
 * 이사신청 리스트
 */

public class PS_L_MOVM_RDRDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curcommlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public long totalcnt;

	public PS_L_MOVM_RDRDataSet(){}
	public PS_L_MOVM_RDRDataSet(String errcode, String errmsg, long totalcnt){
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
		ResultSet rset0 = (ResultSet) cstmt.getObject(11);
		while(rset0.next()){
			PS_L_MOVM_RDRCURCOMMLISTRecord rec = new PS_L_MOVM_RDRCURCOMMLISTRecord();
			rec.acptbocd = Util.checkString(rset0.getString("acptbocd"));
			rec.acptbonm = Util.checkString(rset0.getString("acptbonm"));
			rec.trsfbocd = Util.checkString(rset0.getString("trsfbocd"));
			rec.regdt = Util.checkString(rset0.getString("regdt"));
			rec.regno = Util.checkString(rset0.getString("regno"));
			rec.rdr_no = Util.checkString(rset0.getString("rdr_no"));
			rec.rdrnm = Util.checkString(rset0.getString("rdrnm"));
			rec.medicd = Util.checkString(rset0.getString("medicd"));
			rec.medinm = Util.checkString(rset0.getString("medinm"));
			rec.aplcdt = rset0.getTimestamp("aplcdt");
			rec.movmdt = Util.checkString(rset0.getString("movmdt"));
			rec.zip = Util.checkString(rset0.getString("zip"));
			rec.addr = Util.checkString(rset0.getString("addr"));
			rec.dtlsaddr = Util.checkString(rset0.getString("dtlsaddr"));
			rec.rdrtel_no1 = Util.checkString(rset0.getString("rdrtel_no1"));
			rec.rdrtel_no2 = Util.checkString(rset0.getString("rdrtel_no2"));
			rec.rdrtel_no3 = Util.checkString(rset0.getString("rdrtel_no3"));
			rec.movmzip = Util.checkString(rset0.getString("movmzip"));
			rec.movmaddr = Util.checkString(rset0.getString("movmaddr"));
			rec.movmdtlsaddr = Util.checkString(rset0.getString("movmdtlsaddr"));
			rec.movmtel_no1 = Util.checkString(rset0.getString("movmtel_no1"));
			rec.movmtel_no2 = Util.checkString(rset0.getString("movmtel_no2"));
			rec.movmtel_no3 = Util.checkString(rset0.getString("movmtel_no3"));
			rec.acptbocnfmyn = Util.checkString(rset0.getString("acptbocnfmyn"));
			rec.trsfboremk = Util.checkString(rset0.getString("trsfboremk"));
			rec.acptboremk = Util.checkString(rset0.getString("acptboremk"));
			rec.aplcpathnm = Util.checkString(rset0.getString("aplcpathnm"));
			rec.cns_empcnfmdt = rset0.getTimestamp("cns_empcnfmdt");
			this.curcommlist.add(rec);
		}
		this.totalcnt = cstmt.getLong(12);
	}

	public String curcommlistOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curcommlist.size();
		for(int i=0; i<size; i++){
			PS_L_MOVM_RDRCURCOMMLISTRecord rec = (PS_L_MOVM_RDRCURCOMMLISTRecord)curcommlist.get(i);
			
			
			String code = rec.acptbocd;
			String name = rec.acptbonm;
			
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

	public String curcommlistChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curcommlist.size();
		for(int i=0; i<size; i++){
			PS_L_MOVM_RDRCURCOMMLISTRecord rec = (PS_L_MOVM_RDRCURCOMMLISTRecord)curcommlist.get(i);
			
			
			String code = rec.acptbocd;
			String name = rec.acptbonm;
			
			sb.append("<input name=\"");
			sb.append("acptbocd");
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

	public String curcommlistRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curcommlist.size();
		for(int i=0; i<size; i++){
			PS_L_MOVM_RDRCURCOMMLISTRecord rec = (PS_L_MOVM_RDRCURCOMMLISTRecord)curcommlist.get(i);
			
			
			String code = rec.acptbocd;
			String name = rec.acptbonm;
			
			sb.append("<input name=\"");
			sb.append("acptbocd");
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
	PS_L_MOVM_RDRDataSet ds = (PS_L_MOVM_RDRDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curcommlist.size(); i++){
		PS_L_MOVM_RDRCURCOMMLISTRecord curcommlistRec = (PS_L_MOVM_RDRCURCOMMLISTRecord)ds.curcommlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurcommlist()%>
<%= ds.getTotalcnt()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curcommlistRec.acptbocd%>
<%= curcommlistRec.acptbonm%>
<%= curcommlistRec.trsfbocd%>
<%= curcommlistRec.regdt%>
<%= curcommlistRec.regno%>
<%= curcommlistRec.rdr_no%>
<%= curcommlistRec.rdrnm%>
<%= curcommlistRec.medicd%>
<%= curcommlistRec.medinm%>
<%= curcommlistRec.aplcdt%>
<%= curcommlistRec.movmdt%>
<%= curcommlistRec.zip%>
<%= curcommlistRec.addr%>
<%= curcommlistRec.dtlsaddr%>
<%= curcommlistRec.rdrtel_no1%>
<%= curcommlistRec.rdrtel_no2%>
<%= curcommlistRec.rdrtel_no3%>
<%= curcommlistRec.movmzip%>
<%= curcommlistRec.movmaddr%>
<%= curcommlistRec.movmdtlsaddr%>
<%= curcommlistRec.movmtel_no1%>
<%= curcommlistRec.movmtel_no2%>
<%= curcommlistRec.movmtel_no3%>
<%= curcommlistRec.acptbocnfmyn%>
<%= curcommlistRec.trsfboremk%>
<%= curcommlistRec.acptboremk%>
<%= curcommlistRec.aplcpathnm%>
<%= curcommlistRec.cns_empcnfmdt%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Feb 15 09:37:34 KST 2005 */
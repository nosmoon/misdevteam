/***************************************************************************************************
* 파일명 : SL_L_MOVM_RDR_CNFMDataSet.java
* 기능 : 독자-이사독자-인수확인독자-목록조회
* 작성일자 : 2004-06-30
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
 * 독자-이사독자-인수확인독자-목록조회
 *
 */

public class SL_L_MOVM_RDR_CNFMDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curcommlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public long totalcnt;

	public SL_L_MOVM_RDR_CNFMDataSet(){}
	public SL_L_MOVM_RDR_CNFMDataSet(String errcode, String errmsg, long totalcnt){
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
		ResultSet rset0 = (ResultSet) cstmt.getObject(12);
		while(rset0.next()){
			SL_L_MOVM_RDR_CNFMCURCOMMLISTRecord rec = new SL_L_MOVM_RDR_CNFMCURCOMMLISTRecord();
			rec.regdt = Util.checkString(rset0.getString("regdt"));
			rec.regno = Util.checkString(rset0.getString("regno"));
			rec.rdr_no = Util.checkString(rset0.getString("rdr_no"));
			rec.rdrnm = Util.checkString(rset0.getString("rdrnm"));
			rec.medi = Util.checkString(rset0.getString("medi"));
			rec.aplcdt = Util.checkString(rset0.getString("aplcdt"));
			rec.movmdt = Util.checkString(rset0.getString("movmdt"));
			rec.addr = Util.checkString(rset0.getString("addr"));
			rec.dtlsaddr = Util.checkString(rset0.getString("dtlsaddr"));
			rec.rdrtel_no1 = Util.checkString(rset0.getString("rdrtel_no1"));
			rec.rdrtel_no2 = Util.checkString(rset0.getString("rdrtel_no2"));
			rec.rdrtel_no3 = Util.checkString(rset0.getString("rdrtel_no3"));
			rec.movmaddr = Util.checkString(rset0.getString("movmaddr"));
			rec.movmdtlsaddr = Util.checkString(rset0.getString("movmdtlsaddr"));
			rec.tel_no = Util.checkString(rset0.getString("tel_no"));
			rec.trsfbocnfmstat = Util.checkString(rset0.getString("trsfbocnfmstat"));
			rec.acptbocnfmstat = Util.checkString(rset0.getString("acptbocnfmstat"));
			rec.aplcpathnm = Util.checkString(rset0.getString("aplcpathnm"));
			rec.acptbocnfmdt_tm = Util.checkString(rset0.getString("acptbocnfmdt_tm"));
			rec.trsfbonm = Util.checkString(rset0.getString("trsfbonm"));
			rec.trsfbote_no = Util.checkString(rset0.getString("trsfbote_no"));
			this.curcommlist.add(rec);
		}
		this.totalcnt = cstmt.getLong(13);
	}

	public String curcommlistOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curcommlist.size();
		for(int i=0; i<size; i++){
			SL_L_MOVM_RDR_CNFMCURCOMMLISTRecord rec = (SL_L_MOVM_RDR_CNFMCURCOMMLISTRecord)curcommlist.get(i);
			
			
			String code = rec.regdt;
			String name = rec.regno;
			
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
			SL_L_MOVM_RDR_CNFMCURCOMMLISTRecord rec = (SL_L_MOVM_RDR_CNFMCURCOMMLISTRecord)curcommlist.get(i);
			
			
			String code = rec.regdt;
			String name = rec.regno;
			
			sb.append("<input name=\"");
			sb.append("regdt");
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
			SL_L_MOVM_RDR_CNFMCURCOMMLISTRecord rec = (SL_L_MOVM_RDR_CNFMCURCOMMLISTRecord)curcommlist.get(i);
			
			
			String code = rec.regdt;
			String name = rec.regno;
			
			sb.append("<input name=\"");
			sb.append("regdt");
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
	SL_L_MOVM_RDR_CNFMDataSet ds = (SL_L_MOVM_RDR_CNFMDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curcommlist.size(); i++){
		SL_L_MOVM_RDR_CNFMCURCOMMLISTRecord curcommlistRec = (SL_L_MOVM_RDR_CNFMCURCOMMLISTRecord)ds.curcommlist.get(i);%>
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

<%= curcommlistRec.regdt%>
<%= curcommlistRec.regno%>
<%= curcommlistRec.rdr_no%>
<%= curcommlistRec.rdrnm%>
<%= curcommlistRec.medi%>
<%= curcommlistRec.aplcdt%>
<%= curcommlistRec.movmdt%>
<%= curcommlistRec.addr%>
<%= curcommlistRec.dtlsaddr%>
<%= curcommlistRec.rdrtel_no1%>
<%= curcommlistRec.rdrtel_no2%>
<%= curcommlistRec.rdrtel_no3%>
<%= curcommlistRec.movmaddr%>
<%= curcommlistRec.movmdtlsaddr%>
<%= curcommlistRec.tel_no%>
<%= curcommlistRec.trsfbocnfmstat%>
<%= curcommlistRec.acptbocnfmstat%>
<%= curcommlistRec.aplcpathnm%>
<%= curcommlistRec.acptbocnfmdt_tm%>
<%= curcommlistRec.trsfbonm%>
<%= curcommlistRec.trsfbote_no%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Jul 01 15:27:21 KST 2004 */
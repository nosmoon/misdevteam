/***************************************************************************************************
* 파일명 : SL_L_MOVM_RDRDataSet.java
* 기능 : 독자-이사독자관리-목록을 위한 DataSet
* 작성일자 : 2004-01-14
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
 * 독자-이사독자관리-목록을 위한 DataSet
 */



public class SL_L_MOVM_RDRDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curcommlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public long totalcnt;

	public SL_L_MOVM_RDRDataSet(){}
	public SL_L_MOVM_RDRDataSet(String errcode, String errmsg, long totalcnt){
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
		ResultSet rset1 = (ResultSet) cstmt.getObject(11);
		while(rset1.next()){
			SL_L_MOVM_RDRCURCOMMLISTRecord rec = new SL_L_MOVM_RDRCURCOMMLISTRecord();
			rec.regdt = Util.checkString(rset1.getString("regdt"));
			rec.regno = Util.checkString(rset1.getString("regno"));
			rec.rdr_no = Util.checkString(rset1.getString("rdr_no"));
			rec.rdrnm = Util.checkString(rset1.getString("rdrnm"));
			rec.aplcdt = rset1.getTimestamp("aplcdt");
			rec.movmdt = Util.checkString(rset1.getString("movmdt"));
			rec.addr = Util.checkString(rset1.getString("addr"));
			rec.dtlsaddr = Util.checkString(rset1.getString("dtlsaddr"));
			rec.rdrtel_no1 = Util.checkString(rset1.getString("rdrtel_no1"));
			rec.rdrtel_no2 = Util.checkString(rset1.getString("rdrtel_no2"));
			rec.rdrtel_no3 = Util.checkString(rset1.getString("rdrtel_no3"));
			rec.movmaddr = Util.checkString(rset1.getString("movmaddr"));
			rec.movmdtlsaddr = Util.checkString(rset1.getString("movmdtlsaddr"));
			rec.movmtel_no1 = Util.checkString(rset1.getString("movmtel_no1"));
			rec.movmtel_no2 = Util.checkString(rset1.getString("movmtel_no2"));
			rec.movmtel_no3 = Util.checkString(rset1.getString("movmtel_no3"));
			rec.trsfbocnfmstat = Util.checkString(rset1.getString("trsfbocnfmstat"));
			rec.acptbocnfmstat = Util.checkString(rset1.getString("acptbocnfmstat"));
			rec.trsfboremk = Util.checkString(rset1.getString("trsfboremk"));
			rec.acptboremk = Util.checkString(rset1.getString("acptboremk"));
			rec.aplcpathnm = Util.checkString(rset1.getString("aplcpathnm"));
			rec.cns_empcnfmdt = rset1.getTimestamp("cns_empcnfmdt");
			this.curcommlist.add(rec);
		}
		this.totalcnt = cstmt.getLong(12);
	}

	public String curcommlistOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curcommlist.size();
		for(int i=0; i<size; i++){
			SL_L_MOVM_RDRCURCOMMLISTRecord rec = (SL_L_MOVM_RDRCURCOMMLISTRecord)curcommlist.get(i);
			
			
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
			SL_L_MOVM_RDRCURCOMMLISTRecord rec = (SL_L_MOVM_RDRCURCOMMLISTRecord)curcommlist.get(i);
			
			
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
			SL_L_MOVM_RDRCURCOMMLISTRecord rec = (SL_L_MOVM_RDRCURCOMMLISTRecord)curcommlist.get(i);
			
			
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
	SL_L_MOVM_RDRDataSet ds = (SL_L_MOVM_RDRDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curcommlist.size(); i++){
		SL_L_MOVM_RDRCURCOMMLISTRecord curcommlistRec = (SL_L_MOVM_RDRCURCOMMLISTRecord)ds.curcommlist.get(i);%>
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
<%= curcommlistRec.aplcdt%>
<%= curcommlistRec.movmdt%>
<%= curcommlistRec.addr%>
<%= curcommlistRec.dtlsaddr%>
<%= curcommlistRec.rdrtel_no1%>
<%= curcommlistRec.rdrtel_no2%>
<%= curcommlistRec.rdrtel_no3%>
<%= curcommlistRec.movmaddr%>
<%= curcommlistRec.movmdtlsaddr%>
<%= curcommlistRec.movmtel_no1%>
<%= curcommlistRec.movmtel_no2%>
<%= curcommlistRec.movmtel_no3%>
<%= curcommlistRec.trsfbocnfmstat%>
<%= curcommlistRec.acptbocnfmstat%>
<%= curcommlistRec.trsfboremk%>
<%= curcommlistRec.acptboremk%>
<%= curcommlistRec.aplcpathnm%>
<%= curcommlistRec.cns_empcnfmdt%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Jan 15 21:17:22 KST 2004 */
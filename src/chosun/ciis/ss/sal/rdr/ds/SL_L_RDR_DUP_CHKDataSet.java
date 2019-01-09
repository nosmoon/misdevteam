/***************************************************************************************************
* 파일명 : SL_L_RDR_DUP_CHKDataSet.java
* 기능 : 독자정보관리(기존독자팝업-목록조회)
* 작성일자 : 2004-04-01
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
 * 독자정보관리(기존독자팝업-목록조회)
 *
 */

public class SL_L_RDR_DUP_CHKDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList rdrchkcur = new ArrayList();
	public String errcode;
	public String errmsg;
	public long chkcnt;

	public SL_L_RDR_DUP_CHKDataSet(){}
	public SL_L_RDR_DUP_CHKDataSet(String errcode, String errmsg, long chkcnt){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.chkcnt = chkcnt;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setChkcnt(long chkcnt){
		this.chkcnt = chkcnt;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public long getChkcnt(){
		return this.chkcnt;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){			return;		}
		this.chkcnt = cstmt.getLong(22);
		ResultSet rset0 = (ResultSet) cstmt.getObject(23);
		while(rset0.next()){
			SL_L_RDR_DUP_CHKRDRCHKCURRecord rec = new SL_L_RDR_DUP_CHKRDRCHKCURRecord();
			rec.rdr_no = Util.checkString(rset0.getString("rdr_no"));
			rec.rdrnm = Util.checkString(rset0.getString("rdrnm"));
			rec.prn = Util.checkString(rset0.getString("prn"));
			rec.email = Util.checkString(rset0.getString("email"));
			rec.dlvaddr = Util.checkString(rset0.getString("dlvaddr"));
			rec.rdrtel_no = Util.checkString(rset0.getString("rdrtel_no"));
			rec.rdrptph_no = Util.checkString(rset0.getString("rdrptph_no"));
			this.rdrchkcur.add(rec);
		}
	}

	public String rdrchkcurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = rdrchkcur.size();
		for(int i=0; i<size; i++){
			SL_L_RDR_DUP_CHKRDRCHKCURRecord rec = (SL_L_RDR_DUP_CHKRDRCHKCURRecord)rdrchkcur.get(i);
			
			
			String code = rec.rdr_no;
			String name = rec.rdrnm;
			
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

	public String rdrchkcurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = rdrchkcur.size();
		for(int i=0; i<size; i++){
			SL_L_RDR_DUP_CHKRDRCHKCURRecord rec = (SL_L_RDR_DUP_CHKRDRCHKCURRecord)rdrchkcur.get(i);
			
			
			String code = rec.rdr_no;
			String name = rec.rdrnm;
			
			sb.append("<input name=\"");
			sb.append("rdr_no");
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

	public String rdrchkcurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = rdrchkcur.size();
		for(int i=0; i<size; i++){
			SL_L_RDR_DUP_CHKRDRCHKCURRecord rec = (SL_L_RDR_DUP_CHKRDRCHKCURRecord)rdrchkcur.get(i);
			
			
			String code = rec.rdr_no;
			String name = rec.rdrnm;
			
			sb.append("<input name=\"");
			sb.append("rdr_no");
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
	SL_L_RDR_DUP_CHKDataSet ds = (SL_L_RDR_DUP_CHKDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.rdrchkcur.size(); i++){
		SL_L_RDR_DUP_CHKRDRCHKCURRecord rdrchkcurRec = (SL_L_RDR_DUP_CHKRDRCHKCURRecord)ds.rdrchkcur.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getChkcnt()%>
<%= ds.getRdrchkcur()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= rdrchkcurRec.rdr_no%>
<%= rdrchkcurRec.rdrnm%>
<%= rdrchkcurRec.prn%>
<%= rdrchkcurRec.email%>
<%= rdrchkcurRec.dlvaddr%>
<%= rdrchkcurRec.rdrtel_no%>
<%= rdrchkcurRec.rdrptph_no%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Apr 07 15:04:55 KST 2004 */
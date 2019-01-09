/***************************************************************************************************
* 파일명 : SL_S_READERINFODataSet.java
* 기능 : 외부확장확인관리(기존독자상세정보조회)
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
 * 외부확장확인관리(기존독자상세정보조회)
 */


public class SL_S_READERINFODataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList readercur = new ArrayList();
	public String errcode;
	public String errmsg;

	public SL_S_READERINFODataSet(){}
	public SL_S_READERINFODataSet(String errcode, String errmsg){
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
		ResultSet rset0 = (ResultSet) cstmt.getObject(5);
		while(rset0.next()){
			SL_S_READERINFOREADERCURRecord rec = new SL_S_READERINFOREADERCURRecord();
			rec.rdr_no = Util.checkString(rset0.getString("rdr_no"));
			rec.dlvdstccd = Util.checkString(rset0.getString("dlvdstccd"));
			rec.dlvno = Util.checkString(rset0.getString("dlvno"));
			rec.dlvintvno = Util.checkString(rset0.getString("dlvintvno"));
			rec.dstcnm = Util.checkString(rset0.getString("dstcnm"));
			rec.dlvzip = Util.checkString(rset0.getString("dlvzip"));
			rec.dlvaddr = Util.checkString(rset0.getString("dlvaddr"));
			rec.dlvdtlsaddr = Util.checkString(rset0.getString("dlvdtlsaddr"));
			rec.dlvbnji = Util.checkString(rset0.getString("dlvbnji"));
			rec.dlvcd = Util.checkString(rset0.getString("dlvcd"));
			rec.addrnm = Util.checkString(rset0.getString("addrnm"));
			rec.dlvdong = Util.checkString(rset0.getString("dlvdong"));
			rec.dlvser_no = Util.checkString(rset0.getString("dlvser_no"));
			rec.pyong = rset0.getInt("pyong");
			rec.rdrnm = Util.checkString(rset0.getString("rdrnm"));
			rec.paty_clsfcd = Util.checkString(rset0.getString("paty_clsfcd"));
			rec.rdrtel_no1 = Util.checkString(rset0.getString("rdrtel_no1"));
			rec.rdrtel_no2 = Util.checkString(rset0.getString("rdrtel_no2"));
			rec.rdrtel_no3 = Util.checkString(rset0.getString("rdrtel_no3"));
			rec.resitypecd = Util.checkString(rset0.getString("resitypecd"));
			rec.resiclsfcd = Util.checkString(rset0.getString("resiclsfcd"));
			rec.rdrptph_no1 = Util.checkString(rset0.getString("rdrptph_no1"));
			rec.rdrptph_no2 = Util.checkString(rset0.getString("rdrptph_no2"));
			rec.rdrptph_no3 = Util.checkString(rset0.getString("rdrptph_no3"));
			rec.dlvmthdcd = Util.checkString(rset0.getString("dlvmthdcd"));
			rec.thrw_plac = Util.checkString(rset0.getString("thrw_plac"));
			rec.bidt = Util.checkString(rset0.getString("bidt"));
			rec.lusoclsfcd = Util.checkString(rset0.getString("lusoclsfcd"));
			rec.weddanvydt = Util.checkString(rset0.getString("weddanvydt"));
			rec.email = Util.checkString(rset0.getString("email"));
			rec.prn = Util.checkString(rset0.getString("prn"));
			rec.remk = Util.checkString(rset0.getString("remk"));
			this.readercur.add(rec);
		}
	}

	public String readercurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = readercur.size();
		for(int i=0; i<size; i++){
			SL_S_READERINFOREADERCURRecord rec = (SL_S_READERINFOREADERCURRecord)readercur.get(i);


			String code = rec.rdr_no;
			String name = rec.dlvdstccd;

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

	public String readercurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = readercur.size();
		for(int i=0; i<size; i++){
			SL_S_READERINFOREADERCURRecord rec = (SL_S_READERINFOREADERCURRecord)readercur.get(i);


			String code = rec.rdr_no;
			String name = rec.dlvdstccd;

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

	public String readercurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = readercur.size();
		for(int i=0; i<size; i++){
			SL_S_READERINFOREADERCURRecord rec = (SL_S_READERINFOREADERCURRecord)readercur.get(i);


			String code = rec.rdr_no;
			String name = rec.dlvdstccd;

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
	SL_S_READERINFODataSet ds = (SL_S_READERINFODataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.readercur.size(); i++){
		SL_S_READERINFOREADERCURRecord readercurRec = (SL_S_READERINFOREADERCURRecord)ds.readercur.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getReadercur()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= readercurRec.rdr_no%>
<%= readercurRec.dlvdstccd%>
<%= readercurRec.dlvno%>
<%= readercurRec.dlvintvno%>
<%= readercurRec.dstcnm%>
<%= readercurRec.dlvzip%>
<%= readercurRec.dlvaddr%>
<%= readercurRec.dlvdtlsaddr%>
<%= readercurRec.dlvbnji%>
<%= readercurRec.dlvcd%>
<%= readercurRec.addrnm%>
<%= readercurRec.dlvdong%>
<%= readercurRec.dlvser_no%>
<%= readercurRec.pyong%>
<%= readercurRec.rdrnm%>
<%= readercurRec.paty_clsfcd%>
<%= readercurRec.rdrtel_no1%>
<%= readercurRec.rdrtel_no2%>
<%= readercurRec.rdrtel_no3%>
<%= readercurRec.resitypecd%>
<%= readercurRec.resiclsfcd%>
<%= readercurRec.rdrptph_no1%>
<%= readercurRec.rdrptph_no2%>
<%= readercurRec.rdrptph_no3%>
<%= readercurRec.dlvmthdcd%>
<%= readercurRec.thrw_plac%>
<%= readercurRec.bidt%>
<%= readercurRec.lusoclsfcd%>
<%= readercurRec.weddanvydt%>
<%= readercurRec.email%>
<%= readercurRec.prn%>
<%= readercurRec.remk%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Sat Jan 17 20:12:18 KST 2004 */
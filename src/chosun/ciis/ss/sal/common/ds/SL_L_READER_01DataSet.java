/***************************************************************************************************
* 파일명 : SL_L_READER_01DataSet.java
* 기능 : 독자조회(기본형) 한 독자에 한 건 조회
* 작성일자 : 2003-12-27
* 작성자 : 김영윤
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/


package chosun.ciis.ss.sal.common.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sal.common.dm.*;
import chosun.ciis.ss.sal.common.rec.*;

/**
 * 독자조회(기본형) 한 독자에 한 건 조회
 *
 */


public class SL_L_READER_01DataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList readercur = new ArrayList();
	public String errcode;
	public String errmsg;
	public long totalcnt;

	public SL_L_READER_01DataSet(){}
	public SL_L_READER_01DataSet(String errcode, String errmsg, long totalcnt){
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
		this.totalcnt = cstmt.getLong(13);
		ResultSet rset0 = (ResultSet) cstmt.getObject(14);
		while(rset0.next()){
			SL_L_READER_01READERCURRecord rec = new SL_L_READER_01READERCURRecord();
			rec.rdr_no = Util.checkString(rset0.getString("rdr_no"));
			rec.paty_clsfcd = Util.checkString(rset0.getString("paty_clsfcd"));
			rec.natnclsfcd = Util.checkString(rset0.getString("natnclsfcd"));
			rec.onlmembid = Util.checkString(rset0.getString("onlmembid"));
			rec.rdrnm = Util.checkString(rset0.getString("rdrnm"));
			rec.prn = Util.checkString(rset0.getString("prn"));
			rec.ernno = Util.checkString(rset0.getString("ernno"));
			rec.email = Util.checkString(rset0.getString("email"));
			rec.dlvzip = Util.checkString(rset0.getString("dlvzip"));
			rec.dlvcd = Util.checkString(rset0.getString("dlvcd"));
			rec.dlvaddr = Util.checkString(rset0.getString("dlvaddr"));
			rec.dlvdtlsaddr = Util.checkString(rset0.getString("dlvdtlsaddr"));
			rec.dlvdong = Util.checkString(rset0.getString("dlvdong"));
			rec.dlvser_no = Util.checkString(rset0.getString("dlvser_no"));
			rec.dlvbnji = Util.checkString(rset0.getString("dlvbnji"));
			rec.dlvteamcd = Util.checkString(rset0.getString("dlvteamcd"));
			rec.dlvdstccd = Util.checkString(rset0.getString("dlvdstccd"));
			rec.dlvno = Util.checkString(rset0.getString("dlvno"));
			rec.dlvintvno = Util.checkString(rset0.getString("dlvintvno"));
			rec.dlvmthdcd = Util.checkString(rset0.getString("dlvmthdcd"));
			rec.dlvqty = rset0.getInt("dlvqty");
			rec.rdrtel_no1 = Util.checkString(rset0.getString("rdrtel_no1"));
			rec.rdrtel_no2 = Util.checkString(rset0.getString("rdrtel_no2"));
			rec.rdrtel_no3 = Util.checkString(rset0.getString("rdrtel_no3"));
			rec.rdrptph_no1 = Util.checkString(rset0.getString("rdrptph_no1"));
			rec.rdrptph_no2 = Util.checkString(rset0.getString("rdrptph_no2"));
			rec.rdrptph_no3 = Util.checkString(rset0.getString("rdrptph_no3"));
			rec.realsubsamt = rset0.getInt("realsubsamt");
			rec.subsamt = rset0.getInt("subsamt");
			rec.dscnamt = rset0.getInt("dscnamt");
			rec.rptvsubsdt = Util.checkString(rset0.getString("rptvsubsdt"));
			rec.rptvrdr_extndt = Util.checkString(rset0.getString("rptvrdr_extndt"));
			rec.addrnm = Util.checkString(rset0.getString("addrnm"));
			rec.mil = Util.checkString(rset0.getString("mil"));
			this.readercur.add(rec);
		}
	}

	public String readercurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = readercur.size();
		for(int i=0; i<size; i++){
			SL_L_READER_01READERCURRecord rec = (SL_L_READER_01READERCURRecord)readercur.get(i);


			String code = rec.rdr_no;
			String name = rec.paty_clsfcd;

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
			SL_L_READER_01READERCURRecord rec = (SL_L_READER_01READERCURRecord)readercur.get(i);


			String code = rec.rdr_no;
			String name = rec.paty_clsfcd;

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
			SL_L_READER_01READERCURRecord rec = (SL_L_READER_01READERCURRecord)readercur.get(i);


			String code = rec.rdr_no;
			String name = rec.paty_clsfcd;

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
	SL_L_READER_01DataSet ds = (SL_L_READER_01DataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.readercur.size(); i++){
		SL_L_READER_01READERCURRecord readercurRec = (SL_L_READER_01READERCURRecord)ds.readercur.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getTotalcnt()%>
<%= ds.getReadercur()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= readercurRec.rdr_no%>
<%= readercurRec.paty_clsfcd%>
<%= readercurRec.natnclsfcd%>
<%= readercurRec.onlmembid%>
<%= readercurRec.rdrnm%>
<%= readercurRec.prn%>
<%= readercurRec.ernno%>
<%= readercurRec.email%>
<%= readercurRec.dlvzip%>
<%= readercurRec.dlvcd%>
<%= readercurRec.dlvaddr%>
<%= readercurRec.dlvdtlsaddr%>
<%= readercurRec.dlvdong%>
<%= readercurRec.dlvser_no%>
<%= readercurRec.dlvbnji%>
<%= readercurRec.dlvteamcd%>
<%= readercurRec.dlvdstccd%>
<%= readercurRec.dlvno%>
<%= readercurRec.dlvintvno%>
<%= readercurRec.dlvmthdcd%>
<%= readercurRec.dlvqty%>
<%= readercurRec.rdrtel_no1%>
<%= readercurRec.rdrtel_no2%>
<%= readercurRec.rdrtel_no3%>
<%= readercurRec.rdrptph_no1%>
<%= readercurRec.rdrptph_no2%>
<%= readercurRec.rdrptph_no3%>
<%= readercurRec.realsubsamt%>
<%= readercurRec.subsamt%>
<%= readercurRec.dscnamt%>
<%= readercurRec.rptvsubsdt%>
<%= readercurRec.rptvrdr_extndt%>
<%= readercurRec.addrnm%>
<%= readercurRec.mil%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Jan 16 17:20:24 KST 2004 */
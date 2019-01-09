/***************************************************************************************************
* 파일명 :
* 기능 :
* 작성일자 : 2015-10-21
* 작성자 : 장 선 희
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/


package chosun.ciis.ss.sal.rdr.ds;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import somo.framework.util.Util;
import chosun.ciis.ss.sal.rdr.rec.SL_MO_L_READERREADERCURRecord;

/**
 *
 */


public class SL_MO_L_READERDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList readercur = new ArrayList();
	public String errcode;
	public String errmsg;
	public long totalcnt;

	public SL_MO_L_READERDataSet(){}
	public SL_MO_L_READERDataSet(String errcode, String errmsg, long totalcnt){
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
		this.totalcnt = cstmt.getLong(12);
		ResultSet rset0 = (ResultSet) cstmt.getObject(13);
		while(rset0.next()){
			SL_MO_L_READERREADERCURRecord rec = new SL_MO_L_READERREADERCURRecord();
			rec.rdr_no = Util.checkString(rset0.getString("rdr_no"));
			rec.onlmembid = Util.checkString(rset0.getString("onlmembid"));
			rec.rdrnm = Util.checkString(rset0.getString("rdrnm"));
			rec.email = Util.checkString(rset0.getString("email"));
			rec.dlvzip = Util.checkString(rset0.getString("dlvzip"));
			rec.dlvcd = Util.checkString(rset0.getString("dlvcd"));
			rec.dlvaddr = Util.checkString(rset0.getString("dlvaddr"));
			rec.dlvdtlsaddr = Util.checkString(rset0.getString("dlvdtlsaddr"));
			rec.dlvdong = Util.checkString(rset0.getString("dlvdong"));
			rec.dlvser_no = Util.checkString(rset0.getString("dlvser_no"));
			rec.dlvbnji = Util.checkString(rset0.getString("dlvbnji"));
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
			rec.addrnm = Util.checkString(rset0.getString("addrnm"));
			rec.prvrdr_no = Util.checkString(rset0.getString("prvrdr_no"));
			rec.mil = Util.checkString(rset0.getString("mil"));
			this.readercur.add(rec);
		}
	}

	public String readercurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = readercur.size();
		for(int i=0; i<size; i++){
			SL_MO_L_READERREADERCURRecord rec = (SL_MO_L_READERREADERCURRecord)readercur.get(i);


			String code = rec.rdr_no;
			String name = rec.onlmembid;

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
			SL_MO_L_READERREADERCURRecord rec = (SL_MO_L_READERREADERCURRecord)readercur.get(i);


			String code = rec.rdr_no;
			String name = rec.onlmembid;

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
			SL_MO_L_READERREADERCURRecord rec = (SL_MO_L_READERREADERCURRecord)readercur.get(i);


			String code = rec.rdr_no;
			String name = rec.onlmembid;

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
	SL_MO_L_READERDataSet ds = (SL_MO_L_READERDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.readercur.size(); i++){
		SL_MO_L_READERREADERCURRecord readercurRec = (SL_MO_L_READERREADERCURRecord)ds.readercur.get(i);%>
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
<%= readercurRec.onlmembid%>
<%= readercurRec.rdrnm%>
<%= readercurRec.email%>
<%= readercurRec.dlvzip%>
<%= readercurRec.dlvcd%>
<%= readercurRec.dlvaddr%>
<%= readercurRec.dlvdtlsaddr%>
<%= readercurRec.dlvdong%>
<%= readercurRec.dlvser_no%>
<%= readercurRec.dlvbnji%>
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
<%= readercurRec.addrnm%>
<%= readercurRec.prvrdr_no%>
<%= readercurRec.mil%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Dec 06 13:58:32 KST 2016 */
/***************************************************************************************************
* 파일명 : SL_L_RDR_RDRAREADataSet.java
* 기능 : 독자-지역독자관리(목록조회)
* 작성일자 : 2004-05-20
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
 * 독자-지역독자관리(목록조회)
 *
 */

public class SL_L_RDR_RDRAREADataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList cursubsmedi = new ArrayList();
	public ArrayList curcommlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public long totalcnt;

	public SL_L_RDR_RDRAREADataSet(){}
	public SL_L_RDR_RDRAREADataSet(String errcode, String errmsg, long totalcnt){
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
		this.totalcnt = cstmt.getLong(11);
		ResultSet rset0 = (ResultSet) cstmt.getObject(12);
		while(rset0.next()){
			SL_L_RDR_RDRAREACURCOMMLISTRecord rec = new SL_L_RDR_RDRAREACURCOMMLISTRecord();
			rec.areardr_no = Util.checkString(rset0.getString("areardr_no"));
			rec.areardrnm = Util.checkString(rset0.getString("areardrnm"));
			rec.zip = Util.checkString(rset0.getString("zip"));
			rec.addr = Util.checkString(rset0.getString("addr"));
			rec.dtlsaddr = Util.checkString(rset0.getString("dtlsaddr"));
			rec.tel_no1 = Util.checkString(rset0.getString("tel_no1"));
			rec.tel_no2 = Util.checkString(rset0.getString("tel_no2"));
			rec.tel_no3 = Util.checkString(rset0.getString("tel_no3"));
			rec.area_rdrregdt = Util.checkString(rset0.getString("area_rdrregdt"));
			rec.subsmedicd = Util.checkString(rset0.getString("subsmedicd"));
			rec.subsmedinm = Util.checkString(rset0.getString("subsmedinm"));
			this.curcommlist.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(13);
		while(rset1.next()){
			SL_L_RDR_RDRAREACURSUBSMEDIRecord rec = new SL_L_RDR_RDRAREACURSUBSMEDIRecord();
			rec.ciymgbcd = Util.checkString(rset1.getString("ciymgbcd"));
			rec.cicdgb = Util.checkString(rset1.getString("cicdgb"));
			rec.cicodeval = Util.checkString(rset1.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset1.getString("cicdnm"));
			rec.cicdynm = Util.checkString(rset1.getString("cicdynm"));
			this.cursubsmedi.add(rec);
		}
	}

	public String curcommlistOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curcommlist.size();
		for(int i=0; i<size; i++){
			SL_L_RDR_RDRAREACURCOMMLISTRecord rec = (SL_L_RDR_RDRAREACURCOMMLISTRecord)curcommlist.get(i);


			String code = rec.areardr_no;
			String name = rec.areardrnm;

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

	public String cursubsmediOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = cursubsmedi.size();
		for(int i=0; i<size; i++){
			SL_L_RDR_RDRAREACURSUBSMEDIRecord rec = (SL_L_RDR_RDRAREACURSUBSMEDIRecord)cursubsmedi.get(i);


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

	public String curcommlistChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curcommlist.size();
		for(int i=0; i<size; i++){
			SL_L_RDR_RDRAREACURCOMMLISTRecord rec = (SL_L_RDR_RDRAREACURCOMMLISTRecord)curcommlist.get(i);


			String code = rec.areardr_no;
			String name = rec.areardrnm;

			sb.append("<input name=\"");
			sb.append("areardr_no");
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

	public String cursubsmediChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = cursubsmedi.size();
		for(int i=0; i<size; i++){
			SL_L_RDR_RDRAREACURSUBSMEDIRecord rec = (SL_L_RDR_RDRAREACURSUBSMEDIRecord)cursubsmedi.get(i);


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

	public String curcommlistRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curcommlist.size();
		for(int i=0; i<size; i++){
			SL_L_RDR_RDRAREACURCOMMLISTRecord rec = (SL_L_RDR_RDRAREACURCOMMLISTRecord)curcommlist.get(i);


			String code = rec.areardr_no;
			String name = rec.areardrnm;

			sb.append("<input name=\"");
			sb.append("areardr_no");
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

	public String cursubsmediRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = cursubsmedi.size();
		for(int i=0; i<size; i++){
			SL_L_RDR_RDRAREACURSUBSMEDIRecord rec = (SL_L_RDR_RDRAREACURSUBSMEDIRecord)cursubsmedi.get(i);


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
	SL_L_RDR_RDRAREADataSet ds = (SL_L_RDR_RDRAREADataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curcommlist.size(); i++){
		SL_L_RDR_RDRAREACURCOMMLISTRecord curcommlistRec = (SL_L_RDR_RDRAREACURCOMMLISTRecord)ds.curcommlist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.cursubsmedi.size(); i++){
		SL_L_RDR_RDRAREACURSUBSMEDIRecord cursubsmediRec = (SL_L_RDR_RDRAREACURSUBSMEDIRecord)ds.cursubsmedi.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getTotalcnt()%>
<%= ds.getCurcommlist()%>
<%= ds.getCursubsmedi()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curcommlistRec.areardr_no%>
<%= curcommlistRec.areardrnm%>
<%= curcommlistRec.zip%>
<%= curcommlistRec.addr%>
<%= curcommlistRec.dtlsaddr%>
<%= curcommlistRec.tel_no1%>
<%= curcommlistRec.tel_no2%>
<%= curcommlistRec.tel_no3%>
<%= curcommlistRec.area_rdrregdt%>
<%= curcommlistRec.subsmedicd%>
<%= curcommlistRec.subsmedinm%>
<%= cursubsmediRec.ciymgbcd%>
<%= cursubsmediRec.cicdgb%>
<%= cursubsmediRec.cicodeval%>
<%= cursubsmediRec.cicdnm%>
<%= cursubsmediRec.cicdynm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon May 24 15:30:08 KST 2004 */
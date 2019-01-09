/***************************************************************************************************
* 파일명 : PS_P_SEND_DD_STICKER.java
* 기능 : 출판 일일 발송 출력(Excel)
* 작성일자 : 2005-12-08
* 작성자 : 전현표
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/


package chosun.ciis.ps.pbs.send.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ps.pbs.send.dm.*;
import chosun.ciis.ps.pbs.send.rec.*;

/**
 * 출판국- 출판 일일 발송 출력(Excel)
 *
 */

public class PS_P_SEND_DD_STICKERDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curcommlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public String medinm;
	public String sendmthdnm;
	public String bonm;

	public PS_P_SEND_DD_STICKERDataSet(){}
	public PS_P_SEND_DD_STICKERDataSet(String errcode, String errmsg, String medinm, String sendmthdnm, String bonm){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.medinm = medinm;
		this.sendmthdnm = sendmthdnm;
		this.bonm = bonm;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setMedinm(String medinm){
		this.medinm = medinm;
	}

	public void setSendmthdnm(String sendmthdnm){
		this.sendmthdnm = sendmthdnm;
	}

	public void setBonm(String bonm){
		this.bonm = bonm;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getMedinm(){
		return this.medinm;
	}

	public String getSendmthdnm(){
		return this.sendmthdnm;
	}

	public String getBonm(){
		return this.bonm;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){			return;		}
		this.medinm = Util.checkString(cstmt.getString(10));
		this.sendmthdnm = Util.checkString(cstmt.getString(11));
		this.bonm = Util.checkString(cstmt.getString(12));
		ResultSet rset0 = (ResultSet) cstmt.getObject(13);
		while(rset0.next()){
			PS_P_SEND_DD_STICKERCURCOMMLISTRecord rec = new PS_P_SEND_DD_STICKERCURCOMMLISTRecord();
			rec.bonm = Util.checkString(rset0.getString("bonm"));
			rec.rdr_no = Util.checkString(rset0.getString("rdr_no"));
			rec.rdrnm = Util.checkString(rset0.getString("rdrnm"));
			rec.dlvzip = Util.checkString(rset0.getString("dlvzip"));
			rec.dlvaddr = Util.checkString(rset0.getString("dlvaddr"));
			rec.dlvdtlsaddr = Util.checkString(rset0.getString("dlvdtlsaddr"));
			rec.rdrtel_no = Util.checkString(rset0.getString("rdrtel_no"));
			rec.rdrptph_no = Util.checkString(rset0.getString("rdrptph_no"));
			rec.subsfrdt = Util.checkString(rset0.getString("subsfrdt"));
			rec.mediser_no = Util.checkString(rset0.getString("mediser_no"));
			rec.medinm = Util.checkString(rset0.getString("medinm"));
			rec.bndlbnsbook = Util.checkString(rset0.getString("bndlbnsbook"));
			rec.sendcnt = rset0.getInt("sendcnt");
			rec.rnum = rset0.getInt("rnum");
			this.curcommlist.add(rec);
		}
	}

	public String curcommlistOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curcommlist.size();
		for(int i=0; i<size; i++){
			PS_P_SEND_DD_STICKERCURCOMMLISTRecord rec = (PS_P_SEND_DD_STICKERCURCOMMLISTRecord)curcommlist.get(i);
			
			
			String code = rec.bonm;
			String name = rec.rdr_no;
			
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
			PS_P_SEND_DD_STICKERCURCOMMLISTRecord rec = (PS_P_SEND_DD_STICKERCURCOMMLISTRecord)curcommlist.get(i);
			
			
			String code = rec.bonm;
			String name = rec.rdr_no;
			
			sb.append("<input name=\"");
			sb.append("bonm");
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
			PS_P_SEND_DD_STICKERCURCOMMLISTRecord rec = (PS_P_SEND_DD_STICKERCURCOMMLISTRecord)curcommlist.get(i);
			
			
			String code = rec.bonm;
			String name = rec.rdr_no;
			
			sb.append("<input name=\"");
			sb.append("bonm");
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
	PS_P_SEND_DD_STICKERDataSet ds = (PS_P_SEND_DD_STICKERDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curcommlist.size(); i++){
		PS_P_SEND_DD_STICKERCURCOMMLISTRecord curcommlistRec = (PS_P_SEND_DD_STICKERCURCOMMLISTRecord)ds.curcommlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getMedinm()%>
<%= ds.getSendmthdnm()%>
<%= ds.getBonm()%>
<%= ds.getCurcommlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curcommlistRec.bonm%>
<%= curcommlistRec.rdr_no%>
<%= curcommlistRec.rdrnm%>
<%= curcommlistRec.dlvzip%>
<%= curcommlistRec.dlvaddr%>
<%= curcommlistRec.dlvdtlsaddr%>
<%= curcommlistRec.rdrtel_no%>
<%= curcommlistRec.rdrptph_no%>
<%= curcommlistRec.subsfrdt%>
<%= curcommlistRec.mediser_no%>
<%= curcommlistRec.medinm%>
<%= curcommlistRec.bndlbnsbook%>
<%= curcommlistRec.sendcnt%>
<%= curcommlistRec.rnum%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Jan 30 17:43:40 KST 2007 */
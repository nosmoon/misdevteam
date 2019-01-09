/***************************************************************************************************
* 파일명 : PS_P_SEND_BNSBK_STICKER.java
* 기능 : 출판 보너스북 발송 출력(Excel)
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
 * 출판국- 출판 보너스북 발송 출력(Excel)
 *
 */

public class PS_P_SEND_BNSBK_STICKERDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curcommlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public String sendmthdnm;
	public String bonm;

	public PS_P_SEND_BNSBK_STICKERDataSet(){}
	public PS_P_SEND_BNSBK_STICKERDataSet(String errcode, String errmsg, String sendmthdnm, String bonm){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.sendmthdnm = sendmthdnm;
		this.bonm = bonm;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
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
		this.sendmthdnm = Util.checkString(cstmt.getString(8));
		this.bonm = Util.checkString(cstmt.getString(9));
		ResultSet rset0 = (ResultSet) cstmt.getObject(10);
		while(rset0.next()){
			PS_P_SEND_BNSBK_STICKERCURCOMMLISTRecord rec = new PS_P_SEND_BNSBK_STICKERCURCOMMLISTRecord();
			rec.bonm = Util.checkString(rset0.getString("bonm"));
			rec.rdr_no = Util.checkString(rset0.getString("rdr_no"));
			rec.rdrnm = Util.checkString(rset0.getString("rdrnm"));
			rec.bnsbk = Util.checkString(rset0.getString("bnsbk"));
			rec.rdrtel_no = Util.checkString(rset0.getString("rdrtel_no"));
			rec.dlvzip = Util.checkString(rset0.getString("dlvzip"));
			rec.dlvaddr = Util.checkString(rset0.getString("dlvaddr"));
			rec.dlvdtlsaddr = Util.checkString(rset0.getString("dlvdtlsaddr"));
			rec.subsfrdt = Util.checkString(rset0.getString("subsfrdt"));
			rec.medinm = Util.checkString(rset0.getString("medinm"));
			rec.rnum = rset0.getInt("rnum");
			this.curcommlist.add(rec);
		}
	}

	public String curcommlistOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curcommlist.size();
		for(int i=0; i<size; i++){
			PS_P_SEND_BNSBK_STICKERCURCOMMLISTRecord rec = (PS_P_SEND_BNSBK_STICKERCURCOMMLISTRecord)curcommlist.get(i);
			
			
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
			PS_P_SEND_BNSBK_STICKERCURCOMMLISTRecord rec = (PS_P_SEND_BNSBK_STICKERCURCOMMLISTRecord)curcommlist.get(i);
			
			
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
			PS_P_SEND_BNSBK_STICKERCURCOMMLISTRecord rec = (PS_P_SEND_BNSBK_STICKERCURCOMMLISTRecord)curcommlist.get(i);
			
			
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
	PS_P_SEND_BNSBK_STICKERDataSet ds = (PS_P_SEND_BNSBK_STICKERDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curcommlist.size(); i++){
		PS_P_SEND_BNSBK_STICKERCURCOMMLISTRecord curcommlistRec = (PS_P_SEND_BNSBK_STICKERCURCOMMLISTRecord)ds.curcommlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getSendmthdnm()%>
<%= ds.getBonm()%>
<%= ds.getCurcommlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curcommlistRec.bonm%>
<%= curcommlistRec.rdr_no%>
<%= curcommlistRec.rdrnm%>
<%= curcommlistRec.bnsbk%>
<%= curcommlistRec.rdrtel_no%>
<%= curcommlistRec.dlvzip%>
<%= curcommlistRec.dlvaddr%>
<%= curcommlistRec.dlvdtlsaddr%>
<%= curcommlistRec.subsfrdt%>
<%= curcommlistRec.medinm%>
<%= curcommlistRec.rnum%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Dec 09 10:59:05 KST 2005 */
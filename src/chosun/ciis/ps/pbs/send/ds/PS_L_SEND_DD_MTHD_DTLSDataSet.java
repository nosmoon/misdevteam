/***************************************************************************************************
* 파일명 :
* 기능 :  발송-일일발송 확인처리
* 작성일자 : 2004-03-02
* 작성자 : 장수환
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
 * 발송-일일발송 확인처리
 *
 */

public class PS_L_SEND_DD_MTHD_DTLSDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curcommlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public PS_L_SEND_DD_MTHD_DTLSDataSet(){}
	public PS_L_SEND_DD_MTHD_DTLSDataSet(String errcode, String errmsg){
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
		ResultSet rset0 = (ResultSet) cstmt.getObject(6);
		while(rset0.next()){
			PS_L_SEND_DD_MTHD_DTLSCURCOMMLISTRecord rec = new PS_L_SEND_DD_MTHD_DTLSCURCOMMLISTRecord();
			rec.cicdnm = Util.checkString(rset0.getString("cicdnm"));
			rec.paty = rset0.getInt("paty");
			rec.gnr = rset0.getInt("gnr");
			rec.total = rset0.getInt("total");
			this.curcommlist.add(rec);
		}
	}
/*
	public String curcommlistOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curcommlist.size();
		for(int i=0; i<size; i++){
			PS_L_SEND_DD_MTHD_DTLSCURCOMMLISTRecord rec = (PS_L_SEND_DD_MTHD_DTLSCURCOMMLISTRecord)curcommlist.get(i);


			String code = rec.cicdnm;
			String name = rec.paty;

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
			PS_L_SEND_DD_MTHD_DTLSCURCOMMLISTRecord rec = (PS_L_SEND_DD_MTHD_DTLSCURCOMMLISTRecord)curcommlist.get(i);


			String code = rec.cicdnm;
			String name = rec.paty;

			sb.append("<input name=\"");
			sb.append("cicdnm");
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
			PS_L_SEND_DD_MTHD_DTLSCURCOMMLISTRecord rec = (PS_L_SEND_DD_MTHD_DTLSCURCOMMLISTRecord)curcommlist.get(i);


			String code = rec.cicdnm;
			String name = rec.paty;

			sb.append("<input name=\"");
			sb.append("cicdnm");
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
   */
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	PS_L_SEND_DD_MTHD_DTLSDataSet ds = (PS_L_SEND_DD_MTHD_DTLSDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curcommlist.size(); i++){
		PS_L_SEND_DD_MTHD_DTLSCURCOMMLISTRecord curcommlistRec = (PS_L_SEND_DD_MTHD_DTLSCURCOMMLISTRecord)ds.curcommlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurcommlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curcommlistRec.cicdnm%>
<%= curcommlistRec.paty%>
<%= curcommlistRec.gnr%>
<%= curcommlistRec.total%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Mar 02 16:15:24 KST 2004 */
/***************************************************************************************************
* 파일명 : 
* 기능 :  발송-일괄발송 발송처리
* 작성일자 : 2004-03-08
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
 * 발송-일괄발송 발송처리
 *
 */

public class PS_L_SEND_LUMP_PROCDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curcommlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public long totalcnt;

	public PS_L_SEND_LUMP_PROCDataSet(){}
	public PS_L_SEND_LUMP_PROCDataSet(String errcode, String errmsg, long totalcnt){
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
		this.totalcnt = cstmt.getLong(10);
		ResultSet rset0 = (ResultSet) cstmt.getObject(11);
		while(rset0.next()){
			PS_L_SEND_LUMP_PROCCURCOMMLISTRecord rec = new PS_L_SEND_LUMP_PROCCURCOMMLISTRecord();
			rec.bonm = Util.checkString(rset0.getString("bonm"));
			rec.senddt = Util.checkString(rset0.getString("senddt"));
			rec.medinm = Util.checkString(rset0.getString("medinm"));
			rec.bocd = Util.checkString(rset0.getString("bocd"));
			rec.medicd = Util.checkString(rset0.getString("medicd"));
			rec.mediser_no = Util.checkString(rset0.getString("mediser_no"));
			rec.sendmthdnm = Util.checkString(rset0.getString("sendmthdnm"));
			rec.sendkindnm = Util.checkString(rset0.getString("sendkindnm"));
			rec.sendmthdcd = Util.checkString(rset0.getString("sendmthdcd"));
			rec.sendkindcd = Util.checkString(rset0.getString("sendkindcd"));
			rec.sendqty = rset0.getInt("sendqty");
			this.curcommlist.add(rec);
		}
	}

	public String curcommlistOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curcommlist.size();
		for(int i=0; i<size; i++){
			PS_L_SEND_LUMP_PROCCURCOMMLISTRecord rec = (PS_L_SEND_LUMP_PROCCURCOMMLISTRecord)curcommlist.get(i);
			
			
			String code = rec.bonm;
			String name = rec.senddt;
			
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
			PS_L_SEND_LUMP_PROCCURCOMMLISTRecord rec = (PS_L_SEND_LUMP_PROCCURCOMMLISTRecord)curcommlist.get(i);
			
			
			String code = rec.bonm;
			String name = rec.senddt;
			
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
			PS_L_SEND_LUMP_PROCCURCOMMLISTRecord rec = (PS_L_SEND_LUMP_PROCCURCOMMLISTRecord)curcommlist.get(i);
			
			
			String code = rec.bonm;
			String name = rec.senddt;
			
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
	PS_L_SEND_LUMP_PROCDataSet ds = (PS_L_SEND_LUMP_PROCDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curcommlist.size(); i++){
		PS_L_SEND_LUMP_PROCCURCOMMLISTRecord curcommlistRec = (PS_L_SEND_LUMP_PROCCURCOMMLISTRecord)ds.curcommlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getTotalcnt()%>
<%= ds.getCurcommlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curcommlistRec.bonm%>
<%= curcommlistRec.senddt%>
<%= curcommlistRec.medinm%>
<%= curcommlistRec.bocd%>
<%= curcommlistRec.medicd%>
<%= curcommlistRec.mediser_no%>
<%= curcommlistRec.sendmthdnm%>
<%= curcommlistRec.sendkindnm%>
<%= curcommlistRec.sendmthdcd%>
<%= curcommlistRec.sendkindcd%>
<%= curcommlistRec.sendqty%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Mar 09 15:27:08 KST 2004 */
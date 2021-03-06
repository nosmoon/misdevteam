/***************************************************************************************************
* 파일명 : PS_L_SEND_BNSBK_DTL.java
* 기능 :   발송-보너스북발송확인처리  상세조회화면
* 작성일자 : 2004-02-28
* 작성자 : 김건호
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
 * 발송-보너스북발송 확인처리  상세조회화면
 *
 */

public class PS_L_SEND_BNSBK_DTLDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curcommlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public PS_L_SEND_BNSBK_DTLDataSet(){}
	public PS_L_SEND_BNSBK_DTLDataSet(String errcode, String errmsg){
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
		ResultSet rset0 = (ResultSet) cstmt.getObject(7);
		while(rset0.next()){
			PS_L_SEND_BNSBK_DTLCURCOMMLISTRecord rec = new PS_L_SEND_BNSBK_DTLCURCOMMLISTRecord();
			rec.bns_booknm = Util.checkString(rset0.getString("bns_booknm"));
			rec.dirsend = rset0.getInt("dirsend");
			rec.postsend = rset0.getInt("postsend");
			rec.zipsend = rset0.getInt("zipsend");
			rec.offsend = rset0.getInt("offsend");
			rec.unsend = rset0.getInt("unsend");
			rec.homesend = rset0.getInt("homesend");
			rec.sumsend = rset0.getInt("sumsend");
			this.curcommlist.add(rec);
		}
	}

	public String curcommlistOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curcommlist.size();
		for(int i=0; i<size; i++){
			PS_L_SEND_BNSBK_DTLCURCOMMLISTRecord rec = (PS_L_SEND_BNSBK_DTLCURCOMMLISTRecord)curcommlist.get(i);


			String code = rec.bns_booknm;
			int name = rec.dirsend;

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
			PS_L_SEND_BNSBK_DTLCURCOMMLISTRecord rec = (PS_L_SEND_BNSBK_DTLCURCOMMLISTRecord)curcommlist.get(i);


			String code = rec.bns_booknm;
			int name = rec.dirsend;

			sb.append("<input name=\"");
			sb.append("bns_booknm");
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
			PS_L_SEND_BNSBK_DTLCURCOMMLISTRecord rec = (PS_L_SEND_BNSBK_DTLCURCOMMLISTRecord)curcommlist.get(i);


			String code = rec.bns_booknm;
			int name = rec.dirsend;

			sb.append("<input name=\"");
			sb.append("bns_booknm");
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
	PS_L_SEND_BNSBK_DTLDataSet ds = (PS_L_SEND_BNSBK_DTLDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curcommlist.size(); i++){
		PS_L_SEND_BNSBK_DTLCURCOMMLISTRecord curcommlistRec = (PS_L_SEND_BNSBK_DTLCURCOMMLISTRecord)ds.curcommlist.get(i);%>
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

<%= curcommlistRec.bns_booknm%>
<%= curcommlistRec.dirsend%>
<%= curcommlistRec.postsend%>
<%= curcommlistRec.zipsend%>
<%= curcommlistRec.offsend%>
<%= curcommlistRec.unsend%>
<%= curcommlistRec.homesend%>
<%= curcommlistRec.sumsend%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Sep 28 10:55:26 KST 2005 */
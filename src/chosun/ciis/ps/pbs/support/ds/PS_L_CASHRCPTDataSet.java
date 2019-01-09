/***************************************************************************************************
* 파일명 : PS_L_CASHRCPT.java
* 기능   : 불편관리 - 현금영수증 신청리스트
* 작성일자 : 2005-12-19
* 작성자 : 전현표
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/


package chosun.ciis.ps.pbs.support.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ps.pbs.support.dm.*;
import chosun.ciis.ps.pbs.support.rec.*;

/**
 * 불편관리 - 현금영수증 신청리스트
 *
 */

public class PS_L_CASHRCPTDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curcommlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public long totalcnt;

	public PS_L_CASHRCPTDataSet(){}
	public PS_L_CASHRCPTDataSet(String errcode, String errmsg, long totalcnt){
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
			PS_L_CASHRCPTCURCOMMLISTRecord rec = new PS_L_CASHRCPTCURCOMMLISTRecord();
			rec.rdr_no = Util.checkString(rset0.getString("rdr_no"));
			rec.acqnm = Util.checkString(rset0.getString("acqnm"));
			rec.incmgdt = Util.checkString(rset0.getString("incmgdt"));
			rec.aplcpers = Util.checkString(rset0.getString("aplcpers"));
			rec.prn = Util.checkString(rset0.getString("prn"));
			rec.ptphno = Util.checkString(rset0.getString("ptphno"));
			rec.medicd = Util.checkString(rset0.getString("medicd"));
			rec.medinm = Util.checkString(rset0.getString("medinm"));
			rec.rcptclsfnm = Util.checkString(rset0.getString("rcptclsfnm"));
			rec.aplcpathnm = Util.checkString(rset0.getString("aplcpathnm"));
			rec.rnum = rset0.getInt("rnum");
			this.curcommlist.add(rec);
		}
	}

	public String curcommlistOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curcommlist.size();
		for(int i=0; i<size; i++){
			PS_L_CASHRCPTCURCOMMLISTRecord rec = (PS_L_CASHRCPTCURCOMMLISTRecord)curcommlist.get(i);
			
			
			String code = rec.rdr_no;
			String name = rec.acqnm;
			
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
			PS_L_CASHRCPTCURCOMMLISTRecord rec = (PS_L_CASHRCPTCURCOMMLISTRecord)curcommlist.get(i);
			
			
			String code = rec.rdr_no;
			String name = rec.acqnm;
			
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

	public String curcommlistRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curcommlist.size();
		for(int i=0; i<size; i++){
			PS_L_CASHRCPTCURCOMMLISTRecord rec = (PS_L_CASHRCPTCURCOMMLISTRecord)curcommlist.get(i);
			
			
			String code = rec.rdr_no;
			String name = rec.acqnm;
			
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
	PS_L_CASHRCPTDataSet ds = (PS_L_CASHRCPTDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curcommlist.size(); i++){
		PS_L_CASHRCPTCURCOMMLISTRecord curcommlistRec = (PS_L_CASHRCPTCURCOMMLISTRecord)ds.curcommlist.get(i);%>
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

<%= curcommlistRec.rdr_no%>
<%= curcommlistRec.acqnm%>
<%= curcommlistRec.incmgdt%>
<%= curcommlistRec.aplcpers%>
<%= curcommlistRec.prn%>
<%= curcommlistRec.ptphno%>
<%= curcommlistRec.medicd%>
<%= curcommlistRec.medinm%>
<%= curcommlistRec.rcptclsfnm%>
<%= curcommlistRec.aplcpathnm%>
<%= curcommlistRec.rnum%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Dec 23 15:42:59 KST 2005 */
/***************************************************************************************************
* 파일명 : SS_L_BOEMP_DTLDataSet.java
* 기능 : 지국Info-지국종사원현황-상세목록을 위한 DataSet
* 작성일자 : 2004-11-12
* 작성자 : 김대섭
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.ss.sls.brinfo.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.brinfo.dm.*;
import chosun.ciis.ss.sls.brinfo.rec.*;

/**
 * 지국Info-지국종사원현황-상세목록을 위한 DataSet
 */


public class SS_L_BOEMP_DTLDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curcommlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public long totalcnt;

	public SS_L_BOEMP_DTLDataSet(){}
	public SS_L_BOEMP_DTLDataSet(String errcode, String errmsg, long totalcnt){
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
		ResultSet rset0 = (ResultSet) cstmt.getObject(4);
		while(rset0.next()){
			SS_L_BOEMP_DTLCURCOMMLISTRecord rec = new SS_L_BOEMP_DTLCURCOMMLISTRecord();
			rec.flnm = Util.checkString(rset0.getString("flnm"));
			rec.dutynm = Util.checkString(rset0.getString("dutynm"));
			rec.prn = Util.checkString(rset0.getString("prn"));
			rec.tel1 = Util.checkString(rset0.getString("tel1"));
			rec.tel2 = Util.checkString(rset0.getString("tel2"));
			rec.tel3 = Util.checkString(rset0.getString("tel3"));
			rec.addr = Util.checkString(rset0.getString("addr"));
			rec.dtlsaddr = Util.checkString(rset0.getString("dtlsaddr"));
			rec.in_cmpy_dt = Util.checkString(rset0.getString("in_cmpy_dt"));
			rec.regdt = Util.checkString(rset0.getString("regdt"));
			rec.cctryn = Util.checkString(rset0.getString("cctryn"));
			this.curcommlist.add(rec);
		}
		this.totalcnt = cstmt.getLong(5);
	}

	public String curcommlistOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curcommlist.size();
		for(int i=0; i<size; i++){
			SS_L_BOEMP_DTLCURCOMMLISTRecord rec = (SS_L_BOEMP_DTLCURCOMMLISTRecord)curcommlist.get(i);
			
			
			String code = rec.flnm;
			String name = rec.dutynm;
			
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
			SS_L_BOEMP_DTLCURCOMMLISTRecord rec = (SS_L_BOEMP_DTLCURCOMMLISTRecord)curcommlist.get(i);
			
			
			String code = rec.flnm;
			String name = rec.dutynm;
			
			sb.append("<input name=\"");
			sb.append("flnm");
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
			SS_L_BOEMP_DTLCURCOMMLISTRecord rec = (SS_L_BOEMP_DTLCURCOMMLISTRecord)curcommlist.get(i);
			
			
			String code = rec.flnm;
			String name = rec.dutynm;
			
			sb.append("<input name=\"");
			sb.append("flnm");
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
	SS_L_BOEMP_DTLDataSet ds = (SS_L_BOEMP_DTLDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curcommlist.size(); i++){
		SS_L_BOEMP_DTLCURCOMMLISTRecord curcommlistRec = (SS_L_BOEMP_DTLCURCOMMLISTRecord)ds.curcommlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurcommlist()%>
<%= ds.getTotalcnt()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curcommlistRec.flnm%>
<%= curcommlistRec.dutynm%>
<%= curcommlistRec.prn%>
<%= curcommlistRec.tel1%>
<%= curcommlistRec.tel2%>
<%= curcommlistRec.tel3%>
<%= curcommlistRec.addr%>
<%= curcommlistRec.dtlsaddr%>
<%= curcommlistRec.in_cmpy_dt%>
<%= curcommlistRec.regdt%>
<%= curcommlistRec.cctryn%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Nov 12 16:49:17 KST 2004 */
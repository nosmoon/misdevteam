/***************************************************************************************************
* 파일명 : SS_L_PROMSTAFDataSet.java
* 기능 : 지국지원-판촉현황-요원관리-목록을 위한 DataSet
* 작성일자 : 2004-03-05
* 작성자 : 김대섭
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/

package chosun.ciis.ss.sls.brsup.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.brsup.dm.*;
import chosun.ciis.ss.sls.brsup.rec.*;

/**
 * 지국지원-판촉현황-요원관리-목록을 위한 DataSet
 */

public class SS_L_PROMSTAFDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curcommlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public long totalcnt;

	public SS_L_PROMSTAFDataSet(){}
	public SS_L_PROMSTAFDataSet(String errcode, String errmsg, long totalcnt){
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
		ResultSet rset3 = (ResultSet) cstmt.getObject(11);
		while(rset3.next()){
			SS_L_PROMSTAFCURCOMMLISTRecord rec = new SS_L_PROMSTAFCURCOMMLISTRecord();
			rec.stafclsfcd = Util.checkString(rset3.getString("stafclsfcd"));
			rec.stafclsfnm = Util.checkString(rset3.getString("stafclsfnm"));
			rec.stafno = Util.checkString(rset3.getString("stafno"));
			rec.prn = Util.checkString(rset3.getString("prn"));
			rec.ernno = Util.checkString(rset3.getString("ernno"));
			rec.stafnm = Util.checkString(rset3.getString("stafnm"));
			rec.zip = Util.checkString(rset3.getString("zip"));
			rec.addr = Util.checkString(rset3.getString("addr"));
			rec.dtlsaddr = Util.checkString(rset3.getString("dtlsaddr"));
			rec.tel_no1 = Util.checkString(rset3.getString("tel_no1"));
			rec.tel_no2 = Util.checkString(rset3.getString("tel_no2"));
			rec.tel_no3 = Util.checkString(rset3.getString("tel_no3"));
			rec.ptph_no1 = Util.checkString(rset3.getString("ptph_no1"));
			rec.ptph_no2 = Util.checkString(rset3.getString("ptph_no2"));
			rec.ptph_no3 = Util.checkString(rset3.getString("ptph_no3"));
			rec.email = Util.checkString(rset3.getString("email"));
			this.curcommlist.add(rec);
		}
		this.totalcnt = cstmt.getLong(12);
	}

	public String curcommlistOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curcommlist.size();
		for(int i=0; i<size; i++){
			SS_L_PROMSTAFCURCOMMLISTRecord rec = (SS_L_PROMSTAFCURCOMMLISTRecord)curcommlist.get(i);
			
			
			String code = rec.stafclsfcd;
			String name = rec.stafclsfnm;
			
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
			SS_L_PROMSTAFCURCOMMLISTRecord rec = (SS_L_PROMSTAFCURCOMMLISTRecord)curcommlist.get(i);
			
			
			String code = rec.stafclsfcd;
			String name = rec.stafclsfnm;
			
			sb.append("<input name=\"");
			sb.append("stafclsfcd");
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
			SS_L_PROMSTAFCURCOMMLISTRecord rec = (SS_L_PROMSTAFCURCOMMLISTRecord)curcommlist.get(i);
			
			
			String code = rec.stafclsfcd;
			String name = rec.stafclsfnm;
			
			sb.append("<input name=\"");
			sb.append("stafclsfcd");
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
	SS_L_PROMSTAFDataSet ds = (SS_L_PROMSTAFDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curcommlist.size(); i++){
		SS_L_PROMSTAFCURCOMMLISTRecord curcommlistRec = (SS_L_PROMSTAFCURCOMMLISTRecord)ds.curcommlist.get(i);%>
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

<%= curcommlistRec.stafclsfcd%>
<%= curcommlistRec.stafclsfnm%>
<%= curcommlistRec.stafno%>
<%= curcommlistRec.prn%>
<%= curcommlistRec.ernno%>
<%= curcommlistRec.stafnm%>
<%= curcommlistRec.zip%>
<%= curcommlistRec.addr%>
<%= curcommlistRec.dtlsaddr%>
<%= curcommlistRec.tel_no1%>
<%= curcommlistRec.tel_no2%>
<%= curcommlistRec.tel_no3%>
<%= curcommlistRec.ptph_no1%>
<%= curcommlistRec.ptph_no2%>
<%= curcommlistRec.ptph_no3%>
<%= curcommlistRec.email%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Mar 08 16:30:49 KST 2004 */
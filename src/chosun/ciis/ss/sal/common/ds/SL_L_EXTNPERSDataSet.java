/***************************************************************************************************
* 파일명 : SL_L_EXTNPERSDataSet.java
* 기능 : 공통-확장자검색팝업(목록조회)
* 작성일자 : 2004-04-07
* 작성자 : 김영윤
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.ss.sal.common.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sal.common.dm.*;
import chosun.ciis.ss.sal.common.rec.*;

/**
 * 공통-확장자검색팝업(목록조회)
 *
 */

public class SL_L_EXTNPERSDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curcommlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public long totalcnt;

	public SL_L_EXTNPERSDataSet(){}
	public SL_L_EXTNPERSDataSet(String errcode, String errmsg, long totalcnt){
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
			SL_L_EXTNPERSCURCOMMLISTRecord rec = new SL_L_EXTNPERSCURCOMMLISTRecord();
			rec.stafno = Util.checkString(rset0.getString("stafno"));
			rec.bocd = Util.checkString(rset0.getString("bocd"));
			rec.boemp_no = Util.checkString(rset0.getString("boemp_no"));
			rec.prn = Util.checkString(rset0.getString("prn"));
			rec.nm = Util.checkString(rset0.getString("nm"));
			rec.tel_no1 = Util.checkString(rset0.getString("tel_no1"));
			rec.tel_no2 = Util.checkString(rset0.getString("tel_no2"));
			rec.tel_no3 = Util.checkString(rset0.getString("tel_no3"));
			rec.ptph_no1 = Util.checkString(rset0.getString("ptph_no1"));
			rec.ptph_no2 = Util.checkString(rset0.getString("ptph_no2"));
			rec.ptph_no3 = Util.checkString(rset0.getString("ptph_no3"));
			rec.email = Util.checkString(rset0.getString("email"));
			rec.dutycd = Util.checkString(rset0.getString("dutycd"));
			rec.dutynm = Util.checkString(rset0.getString("dutynm"));
			rec.extntypecd = Util.checkString(rset0.getString("extntypecd"));
			rec.extnblngcd = Util.checkString(rset0.getString("extnblngcd"));
			rec.stafclsfcd = Util.checkString(rset0.getString("stafclsfcd"));
			rec.extnblngnm = Util.checkString(rset0.getString("extnblngnm"));
			rec.rnum = Util.checkString(rset0.getString("rnum"));
			this.curcommlist.add(rec);
		}
	}

	public String curcommlistOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curcommlist.size();
		for(int i=0; i<size; i++){
			SL_L_EXTNPERSCURCOMMLISTRecord rec = (SL_L_EXTNPERSCURCOMMLISTRecord)curcommlist.get(i);
			
			
			String code = rec.stafno;
			String name = rec.bocd;
			
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
			SL_L_EXTNPERSCURCOMMLISTRecord rec = (SL_L_EXTNPERSCURCOMMLISTRecord)curcommlist.get(i);
			
			
			String code = rec.stafno;
			String name = rec.bocd;
			
			sb.append("<input name=\"");
			sb.append("stafno");
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
			SL_L_EXTNPERSCURCOMMLISTRecord rec = (SL_L_EXTNPERSCURCOMMLISTRecord)curcommlist.get(i);
			
			
			String code = rec.stafno;
			String name = rec.bocd;
			
			sb.append("<input name=\"");
			sb.append("stafno");
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
	SL_L_EXTNPERSDataSet ds = (SL_L_EXTNPERSDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curcommlist.size(); i++){
		SL_L_EXTNPERSCURCOMMLISTRecord curcommlistRec = (SL_L_EXTNPERSCURCOMMLISTRecord)ds.curcommlist.get(i);%>
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

<%= curcommlistRec.stafno%>
<%= curcommlistRec.bocd%>
<%= curcommlistRec.boemp_no%>
<%= curcommlistRec.prn%>
<%= curcommlistRec.nm%>
<%= curcommlistRec.tel_no1%>
<%= curcommlistRec.tel_no2%>
<%= curcommlistRec.tel_no3%>
<%= curcommlistRec.ptph_no1%>
<%= curcommlistRec.ptph_no2%>
<%= curcommlistRec.ptph_no3%>
<%= curcommlistRec.email%>
<%= curcommlistRec.dutycd%>
<%= curcommlistRec.dutynm%>
<%= curcommlistRec.extntypecd%>
<%= curcommlistRec.extnblngcd%>
<%= curcommlistRec.stafclsfcd%>
<%= curcommlistRec.extnblngnm%>
<%= curcommlistRec.rnum%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Apr 08 18:59:50 KST 2004 */
/***************************************************************************************************
* 파일명 : .java
* 기능 : *지국지원-신문지원물품-사고-목록
* 작성일자 : 2009-04-07
* 작성자 : 김세웅
***************************************************************************************************/


package chosun.ciis.ss.sls.brsup.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.brsup.dm.*;
import chosun.ciis.ss.sls.brsup.rec.*;

/**
 * 지국지원-신문지원물품-사고-목록
 */

public class SS_L_NWSPITEMACCDDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curcommlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public long totalcnt;
	public long totalaccdquntcnt;

	public SS_L_NWSPITEMACCDDataSet(){}
	public SS_L_NWSPITEMACCDDataSet(String errcode, String errmsg, long totalcnt, long totalaccdquntcnt){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.totalcnt = totalcnt;
		this.totalaccdquntcnt = totalaccdquntcnt;
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

	public void setTotalaccdquntcnt(long totalaccdquntcnt){
		this.totalaccdquntcnt = totalaccdquntcnt;
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

	public long getTotalaccdquntcnt(){
		return this.totalaccdquntcnt;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){			return;		}
		ResultSet rset0 = (ResultSet) cstmt.getObject(15);
		while(rset0.next()){
			SS_L_NWSPITEMACCDCURCOMMLISTRecord rec = new SS_L_NWSPITEMACCDCURCOMMLISTRecord();
			rec.aplcdt = Util.checkString(rset0.getString("aplcdt"));
			rec.aplcno = Util.checkString(rset0.getString("aplcno"));
			rec.accdno = Util.checkString(rset0.getString("accdno"));
			rec.accddt = Util.checkString(rset0.getString("accddt"));
			rec.itemcd = Util.checkString(rset0.getString("itemcd"));
			rec.itemnm = Util.checkString(rset0.getString("itemnm"));
			rec.deptcd = Util.checkString(rset0.getString("deptcd"));
			rec.deptnm = Util.checkString(rset0.getString("deptnm"));
			rec.areacd = Util.checkString(rset0.getString("areacd"));
			rec.areanm = Util.checkString(rset0.getString("areanm"));
			rec.bocd = Util.checkString(rset0.getString("bocd"));
			rec.bonm = Util.checkString(rset0.getString("bonm"));
			rec.accdqunt = rset0.getInt("accdqunt");
			rec.regdt = Util.checkString(rset0.getString("regdt"));
			this.curcommlist.add(rec);
		}
		this.totalcnt = cstmt.getLong(16);
		this.totalaccdquntcnt = cstmt.getLong(17);
	}

	public String curcommlistOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curcommlist.size();
		for(int i=0; i<size; i++){
			SS_L_NWSPITEMACCDCURCOMMLISTRecord rec = (SS_L_NWSPITEMACCDCURCOMMLISTRecord)curcommlist.get(i);
			
			
			String code = rec.aplcdt;
			String name = rec.aplcno;
			
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
			SS_L_NWSPITEMACCDCURCOMMLISTRecord rec = (SS_L_NWSPITEMACCDCURCOMMLISTRecord)curcommlist.get(i);
			
			
			String code = rec.aplcdt;
			String name = rec.aplcno;
			
			sb.append("<input name=\"");
			sb.append("aplcdt");
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
			SS_L_NWSPITEMACCDCURCOMMLISTRecord rec = (SS_L_NWSPITEMACCDCURCOMMLISTRecord)curcommlist.get(i);
			
			
			String code = rec.aplcdt;
			String name = rec.aplcno;
			
			sb.append("<input name=\"");
			sb.append("aplcdt");
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
	SS_L_NWSPITEMACCDDataSet ds = (SS_L_NWSPITEMACCDDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curcommlist.size(); i++){
		SS_L_NWSPITEMACCDCURCOMMLISTRecord curcommlistRec = (SS_L_NWSPITEMACCDCURCOMMLISTRecord)ds.curcommlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurcommlist()%>
<%= ds.getTotalcnt()%>
<%= ds.getTotalaccdquntcnt()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curcommlistRec.aplcdt%>
<%= curcommlistRec.aplcno%>
<%= curcommlistRec.accdno%>
<%= curcommlistRec.accddt%>
<%= curcommlistRec.itemcd%>
<%= curcommlistRec.itemnm%>
<%= curcommlistRec.deptcd%>
<%= curcommlistRec.deptnm%>
<%= curcommlistRec.areacd%>
<%= curcommlistRec.areanm%>
<%= curcommlistRec.bocd%>
<%= curcommlistRec.bonm%>
<%= curcommlistRec.accdqunt%>
<%= curcommlistRec.regdt%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Apr 07 19:55:56 KST 2009 */
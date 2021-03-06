/***************************************************************************************************
* 파일명 : .java
* 기능 : *지국경영-부수증감 신청(담당) 조회(리스트)
* 작성일자 : 2009-07-21
* 작성자 : 김세웅
***************************************************************************************************/


package chosun.ciis.ss.sls.brmgr.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.brmgr.dm.*;
import chosun.ciis.ss.sls.brmgr.rec.*;

/**
 * 지국경영-부수증감 신청(담당) 조회(리스트)
 */

public class SS_L_QTYAPLC2DataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curcommlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public long totalcnt;

	public SS_L_QTYAPLC2DataSet(){}
	public SS_L_QTYAPLC2DataSet(String errcode, String errmsg, long totalcnt){
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
			SS_L_QTYAPLC2CURCOMMLISTRecord rec = new SS_L_QTYAPLC2CURCOMMLISTRecord();
			rec.aplcdt = Util.checkString(rset0.getString("aplcdt"));
			rec.bocd = Util.checkString(rset0.getString("bocd"));
			rec.bonm = Util.checkString(rset0.getString("bonm"));
			rec.issudt = Util.checkString(rset0.getString("issudt"));
			rec.medicd = Util.checkString(rset0.getString("medicd"));
			rec.medinm = Util.checkString(rset0.getString("medinm"));
			rec.chrgupdicdcqty = rset0.getInt("chrgupdicdcqty");
			rec.sendqty = rset0.getInt("sendqty");
			rec.chrgcnfmyn = Util.checkString(rset0.getString("chrgcnfmyn"));
			rec.closyn = Util.checkString(rset0.getString("closyn"));
			this.curcommlist.add(rec);
		}
	}

	public String curcommlistOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curcommlist.size();
		for(int i=0; i<size; i++){
			SS_L_QTYAPLC2CURCOMMLISTRecord rec = (SS_L_QTYAPLC2CURCOMMLISTRecord)curcommlist.get(i);
			
			
			String code = rec.aplcdt;
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
			SS_L_QTYAPLC2CURCOMMLISTRecord rec = (SS_L_QTYAPLC2CURCOMMLISTRecord)curcommlist.get(i);
			
			
			String code = rec.aplcdt;
			String name = rec.bocd;
			
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
			SS_L_QTYAPLC2CURCOMMLISTRecord rec = (SS_L_QTYAPLC2CURCOMMLISTRecord)curcommlist.get(i);
			
			
			String code = rec.aplcdt;
			String name = rec.bocd;
			
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
	SS_L_QTYAPLC2DataSet ds = (SS_L_QTYAPLC2DataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curcommlist.size(); i++){
		SS_L_QTYAPLC2CURCOMMLISTRecord curcommlistRec = (SS_L_QTYAPLC2CURCOMMLISTRecord)ds.curcommlist.get(i);%>
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

<%= curcommlistRec.aplcdt%>
<%= curcommlistRec.bocd%>
<%= curcommlistRec.bonm%>
<%= curcommlistRec.issudt%>
<%= curcommlistRec.medicd%>
<%= curcommlistRec.medinm%>
<%= curcommlistRec.chrgupdicdcqty%>
<%= curcommlistRec.sendqty%>
<%= curcommlistRec.chrgcnfmyn%>
<%= curcommlistRec.closyn%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Jul 20 20:27:22 KST 2009 */
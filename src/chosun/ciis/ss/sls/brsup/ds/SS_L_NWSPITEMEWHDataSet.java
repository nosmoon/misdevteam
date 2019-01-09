/***************************************************************************************************
* 파일명 : SS_L_NWSPITEMEWHDataSet.java
* 기능 : 지국지원-신문지원물품-입고-목록을 위한 DataSet
* 작성일자 : 2004-01-20
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
 * 지국지원-신문지원물품-입고-목록을 위한 DataSet
 */


public class SS_L_NWSPITEMEWHDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curcommlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public long totalcnt;

	public SS_L_NWSPITEMEWHDataSet(){}
	public SS_L_NWSPITEMEWHDataSet(String errcode, String errmsg, long totalcnt){
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
		ResultSet rset0 = (ResultSet) cstmt.getObject(11);
		while(rset0.next()){
			SS_L_NWSPITEMEWHCURCOMMLISTRecord rec = new SS_L_NWSPITEMEWHCURCOMMLISTRecord();
			rec.ewhdt = Util.checkString(rset0.getString("ewhdt"));
			rec.ewhno = Util.checkString(rset0.getString("ewhno"));
			rec.ewhqunt = rset0.getInt("ewhqunt");
			rec.stokqunt = rset0.getInt("stokqunt");
			rec.itemcd = Util.checkString(rset0.getString("itemcd"));
			rec.itemnm = Util.checkString(rset0.getString("itemnm"));
			rec.uprc = rset0.getInt("uprc");
			rec.divnuprc = rset0.getInt("divnuprc");
			rec.insddivnuprc = rset0.getInt("insddivnuprc");
			rec.itemclsfnm = Util.checkString(rset0.getString("itemclsfnm"));
			rec.sendclsfnm = Util.checkString(rset0.getString("sendclsfnm"));
			rec.costclsfnm = Util.checkString(rset0.getString("costclsfnm"));
			this.curcommlist.add(rec);
		}
		this.totalcnt = cstmt.getLong(12);
	}

	public String curcommlistOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curcommlist.size();
		for(int i=0; i<size; i++){
			SS_L_NWSPITEMEWHCURCOMMLISTRecord rec = (SS_L_NWSPITEMEWHCURCOMMLISTRecord)curcommlist.get(i);
			
			
			String code = rec.ewhdt;
			String name = rec.ewhno;
			
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
			SS_L_NWSPITEMEWHCURCOMMLISTRecord rec = (SS_L_NWSPITEMEWHCURCOMMLISTRecord)curcommlist.get(i);
			
			
			String code = rec.ewhdt;
			String name = rec.ewhno;
			
			sb.append("<input name=\"");
			sb.append("ewhdt");
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
			SS_L_NWSPITEMEWHCURCOMMLISTRecord rec = (SS_L_NWSPITEMEWHCURCOMMLISTRecord)curcommlist.get(i);
			
			
			String code = rec.ewhdt;
			String name = rec.ewhno;
			
			sb.append("<input name=\"");
			sb.append("ewhdt");
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
	SS_L_NWSPITEMEWHDataSet ds = (SS_L_NWSPITEMEWHDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curcommlist.size(); i++){
		SS_L_NWSPITEMEWHCURCOMMLISTRecord curcommlistRec = (SS_L_NWSPITEMEWHCURCOMMLISTRecord)ds.curcommlist.get(i);%>
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

<%= curcommlistRec.ewhdt%>
<%= curcommlistRec.ewhno%>
<%= curcommlistRec.ewhqunt%>
<%= curcommlistRec.stokqunt%>
<%= curcommlistRec.itemcd%>
<%= curcommlistRec.itemnm%>
<%= curcommlistRec.uprc%>
<%= curcommlistRec.divnuprc%>
<%= curcommlistRec.insddivnuprc%>
<%= curcommlistRec.itemclsfnm%>
<%= curcommlistRec.sendclsfnm%>
<%= curcommlistRec.costclsfnm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Jan 30 10:43:39 KST 2004 */
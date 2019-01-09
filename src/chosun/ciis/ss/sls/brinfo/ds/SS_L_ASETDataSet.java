/***************************************************************************************************
* 파일명 : SS_L_ASETDataSet.java
* 기능 : 지국Info-지국비품현황-현황 조회
* 작성일자 : 2004-01-29
* 작성자 : 고윤홍
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
 * 지국Info-지국비품현황-현황 조회
 */


public class SS_L_ASETDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList asetclascd = new ArrayList();
	public ArrayList curcommlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public long cdcnt;
	public long totalcnt;

	public SS_L_ASETDataSet(){}
	public SS_L_ASETDataSet(String errcode, String errmsg, long cdcnt, long totalcnt){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.cdcnt = cdcnt;
		this.totalcnt = totalcnt;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setCdcnt(long cdcnt){
		this.cdcnt = cdcnt;
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

	public long getCdcnt(){
		return this.cdcnt;
	}

	public long getTotalcnt(){
		return this.totalcnt;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){			return;		}
		ResultSet rset0 = (ResultSet) cstmt.getObject(8);
		while(rset0.next()){
			SS_L_ASETCURCOMMLISTRecord rec = new SS_L_ASETCURCOMMLISTRecord();
			rec.bocd = Util.checkString(rset0.getString("bocd"));
			rec.deptcd = Util.checkString(rset0.getString("deptcd"));
			rec.areacd = Util.checkString(rset0.getString("areacd"));
			rec.areanm = Util.checkString(rset0.getString("areanm"));
			rec.bonm = Util.checkString(rset0.getString("bonm"));
			rec.boknm = Util.checkString(rset0.getString("boknm"));
			rec.cd1 = Util.checkString(rset0.getString("cd1"));
			rec.nm1 = Util.checkString(rset0.getString("nm1"));
			rec.cnt1 = rset0.getInt("cnt1");
			rec.cd2 = Util.checkString(rset0.getString("cd2"));
			rec.nm2 = Util.checkString(rset0.getString("nm2"));
			rec.cnt2 = rset0.getInt("cnt2");
			rec.cd3 = Util.checkString(rset0.getString("cd3"));
			rec.nm3 = Util.checkString(rset0.getString("nm3"));
			rec.cnt3 = rset0.getInt("cnt3");
			rec.cd4 = Util.checkString(rset0.getString("cd4"));
			rec.nm4 = Util.checkString(rset0.getString("nm4"));
			rec.cnt4 = rset0.getInt("cnt4");
			rec.cd5 = Util.checkString(rset0.getString("cd5"));
			rec.nm5 = Util.checkString(rset0.getString("nm5"));
			rec.cnt5 = rset0.getInt("cnt5");
			rec.cd6 = Util.checkString(rset0.getString("cd6"));
			rec.nm6 = Util.checkString(rset0.getString("nm6"));
			rec.cnt6 = rset0.getInt("cnt6");
			rec.cd7 = Util.checkString(rset0.getString("cd7"));
			rec.nm7 = Util.checkString(rset0.getString("nm7"));
			rec.cnt7 = rset0.getInt("cnt7");
			rec.cd8 = Util.checkString(rset0.getString("cd8"));
			rec.nm8 = Util.checkString(rset0.getString("nm8"));
			rec.cnt8 = rset0.getInt("cnt8");
			rec.cd9 = Util.checkString(rset0.getString("cd9"));
			rec.nm9 = Util.checkString(rset0.getString("nm9"));
			rec.cnt9 = rset0.getInt("cnt9");
			rec.cd10 = Util.checkString(rset0.getString("cd10"));
			rec.nm10 = Util.checkString(rset0.getString("nm10"));
			rec.cnt10 = rset0.getInt("cnt10");
			rec.total = rset0.getInt("total");
			this.curcommlist.add(rec);
		}
		this.cdcnt = cstmt.getLong(9);
		this.totalcnt = cstmt.getLong(10);
		ResultSet rset1 = (ResultSet) cstmt.getObject(11);
		while(rset1.next()){
			SS_L_ASETASETCLASCDRecord rec = new SS_L_ASETASETCLASCDRecord();
			rec.cicodeval = Util.checkString(rset1.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset1.getString("cicdnm"));
			rec.ciymgbcd = Util.checkString(rset1.getString("ciymgbcd"));
			rec.cicdgb = Util.checkString(rset1.getString("cicdgb"));
			rec.cicdynm = Util.checkString(rset1.getString("cicdynm"));
			this.asetclascd.add(rec);
		}
	}

	public String curcommlistOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curcommlist.size();
		for(int i=0; i<size; i++){
			SS_L_ASETCURCOMMLISTRecord rec = (SS_L_ASETCURCOMMLISTRecord)curcommlist.get(i);
			
			
			String code = rec.bocd;
			String name = rec.deptcd;
			
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

	public String asetclascdOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = asetclascd.size();
		for(int i=0; i<size; i++){
			SS_L_ASETASETCLASCDRecord rec = (SS_L_ASETASETCLASCDRecord)asetclascd.get(i);
			
			
			String code = rec.cicodeval;
			String name = rec.cicdnm;
			
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
			SS_L_ASETCURCOMMLISTRecord rec = (SS_L_ASETCURCOMMLISTRecord)curcommlist.get(i);
			
			
			String code = rec.bocd;
			String name = rec.deptcd;
			
			sb.append("<input name=\"");
			sb.append("bocd");
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

	public String asetclascdChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = asetclascd.size();
		for(int i=0; i<size; i++){
			SS_L_ASETASETCLASCDRecord rec = (SS_L_ASETASETCLASCDRecord)asetclascd.get(i);
			
			
			String code = rec.cicodeval;
			String name = rec.cicdnm;
			
			sb.append("<input name=\"");
			sb.append("cicodeval");
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
			SS_L_ASETCURCOMMLISTRecord rec = (SS_L_ASETCURCOMMLISTRecord)curcommlist.get(i);
			
			
			String code = rec.bocd;
			String name = rec.deptcd;
			
			sb.append("<input name=\"");
			sb.append("bocd");
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

	public String asetclascdRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = asetclascd.size();
		for(int i=0; i<size; i++){
			SS_L_ASETASETCLASCDRecord rec = (SS_L_ASETASETCLASCDRecord)asetclascd.get(i);
			
			
			String code = rec.cicodeval;
			String name = rec.cicdnm;
			
			sb.append("<input name=\"");
			sb.append("cicodeval");
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
	SS_L_ASETDataSet ds = (SS_L_ASETDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curcommlist.size(); i++){
		SS_L_ASETCURCOMMLISTRecord curcommlistRec = (SS_L_ASETCURCOMMLISTRecord)ds.curcommlist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.asetclascd.size(); i++){
		SS_L_ASETASETCLASCDRecord asetclascdRec = (SS_L_ASETASETCLASCDRecord)ds.asetclascd.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurcommlist()%>
<%= ds.getCdcnt()%>
<%= ds.getTotalcnt()%>
<%= ds.getAsetclascd()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curcommlistRec.bocd%>
<%= curcommlistRec.deptcd%>
<%= curcommlistRec.areacd%>
<%= curcommlistRec.areanm%>
<%= curcommlistRec.bonm%>
<%= curcommlistRec.boknm%>
<%= curcommlistRec.cd1%>
<%= curcommlistRec.nm1%>
<%= curcommlistRec.cnt1%>
<%= curcommlistRec.cd2%>
<%= curcommlistRec.nm2%>
<%= curcommlistRec.cnt2%>
<%= curcommlistRec.cd3%>
<%= curcommlistRec.nm3%>
<%= curcommlistRec.cnt3%>
<%= curcommlistRec.cd4%>
<%= curcommlistRec.nm4%>
<%= curcommlistRec.cnt4%>
<%= curcommlistRec.cd5%>
<%= curcommlistRec.nm5%>
<%= curcommlistRec.cnt5%>
<%= curcommlistRec.cd6%>
<%= curcommlistRec.nm6%>
<%= curcommlistRec.cnt6%>
<%= curcommlistRec.cd7%>
<%= curcommlistRec.nm7%>
<%= curcommlistRec.cnt7%>
<%= curcommlistRec.cd8%>
<%= curcommlistRec.nm8%>
<%= curcommlistRec.cnt8%>
<%= curcommlistRec.cd9%>
<%= curcommlistRec.nm9%>
<%= curcommlistRec.cnt9%>
<%= curcommlistRec.cd10%>
<%= curcommlistRec.nm10%>
<%= curcommlistRec.cnt10%>
<%= curcommlistRec.total%>
<%= asetclascdRec.cicodeval%>
<%= asetclascdRec.cicdnm%>
<%= asetclascdRec.ciymgbcd%>
<%= asetclascdRec.cicdgb%>
<%= asetclascdRec.cicdynm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue May 18 06:32:33 KST 2004 */
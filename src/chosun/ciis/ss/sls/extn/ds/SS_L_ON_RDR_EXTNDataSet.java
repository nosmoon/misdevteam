/***************************************************************************************************
* 파일명 : .java
* 기능 : *확장현황-온라인확장-신청현황 목록
* 작성일자 : 2009-04-03
* 작성자 : 김세웅
***************************************************************************************************/


package chosun.ciis.ss.sls.extn.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.extn.dm.*;
import chosun.ciis.ss.sls.extn.rec.*;

/**
 * 확장현황-온라인확장-신청현황 목록
 */

public class SS_L_ON_RDR_EXTNDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curcommlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public long totalcnt;
	public long totalqty;
	public long advtcnt;
	public long advtqty;

	public SS_L_ON_RDR_EXTNDataSet(){}
	public SS_L_ON_RDR_EXTNDataSet(String errcode, String errmsg, long totalcnt, long totalqty, long advtcnt, long advtqty){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.totalcnt = totalcnt;
		this.totalqty = totalqty;
		this.advtcnt = advtcnt;
		this.advtqty = advtqty;
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

	public void setTotalqty(long totalqty){
		this.totalqty = totalqty;
	}

	public void setAdvtcnt(long advtcnt){
		this.advtcnt = advtcnt;
	}

	public void setAdvtqty(long advtqty){
		this.advtqty = advtqty;
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

	public long getTotalqty(){
		return this.totalqty;
	}

	public long getAdvtcnt(){
		return this.advtcnt;
	}

	public long getAdvtqty(){
		return this.advtqty;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){			return;		}
		ResultSet rset0 = (ResultSet) cstmt.getObject(18);
		while(rset0.next()){
			SS_L_ON_RDR_EXTNCURCOMMLISTRecord rec = new SS_L_ON_RDR_EXTNCURCOMMLISTRecord();
			rec.extnflnm = Util.checkString(rset0.getString("extnflnm"));
			rec.aplcpersnm = Util.checkString(rset0.getString("aplcpersnm"));
			rec.rdrnm = Util.checkString(rset0.getString("rdrnm"));
			rec.pymtflnm = Util.checkString(rset0.getString("pymtflnm"));
			rec.medicdnm = Util.checkString(rset0.getString("medicdnm"));
			rec.aplcpathcd = Util.checkString(rset0.getString("aplcpathcd"));
			rec.aplcpathnm = Util.checkString(rset0.getString("aplcpathnm"));
			rec.rdr_extntypecd = Util.checkString(rset0.getString("rdr_extntypecd"));
			rec.cmpynm = Util.checkString(rset0.getString("cmpynm"));
			rec.qty = rset0.getInt("qty");
			rec.areacd = Util.checkString(rset0.getString("areacd"));
			rec.areacdnm = Util.checkString(rset0.getString("areacdnm"));
			rec.corrbocd = Util.checkString(rset0.getString("corrbocd"));
			rec.corrbocdnm = Util.checkString(rset0.getString("corrbocdnm"));
			rec.extnareanm = Util.checkString(rset0.getString("extnareanm"));
			rec.extnbocdnm = Util.checkString(rset0.getString("extnbocdnm"));
			rec.dlvhopedt = Util.checkString(rset0.getString("dlvhopedt"));
			rec.aplcdt = Util.checkString(rset0.getString("aplcdt"));
			rec.bo_headcnfmdt = rset0.getTimestamp("bo_headcnfmdt");
			rec.bo_headcnfmyn = Util.checkString(rset0.getString("bo_headcnfmyn"));
			rec.subscnfmstatcd = Util.checkString(rset0.getString("subscnfmstatcd"));
			rec.subscnfmstatcdnm = Util.checkString(rset0.getString("subscnfmstatcdnm"));
			rec.rdr_extndt = Util.checkString(rset0.getString("rdr_extndt"));
			rec.rdr_extnno = Util.checkString(rset0.getString("rdr_extnno"));
			rec.rdr_no = Util.checkString(rset0.getString("rdr_no"));
			rec.medicd = Util.checkString(rset0.getString("medicd"));
			rec.cntrno = Util.checkString(rset0.getString("cntrno"));
			rec.mangno = Util.checkString(rset0.getString("mangno"));
			rec.valmm = Util.checkString(rset0.getString("valmm"));
			rec.aplcclsf = Util.checkString(rset0.getString("aplcclsf"));
			rec.advtpathcd = Util.checkString(rset0.getString("advtpathcd"));
			this.curcommlist.add(rec);
		}
		this.totalcnt = cstmt.getLong(19);
		this.totalqty = cstmt.getLong(20);
		this.advtcnt = cstmt.getLong(21);
		this.advtqty = cstmt.getLong(22);
	}

	public String curcommlistOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curcommlist.size();
		for(int i=0; i<size; i++){
			SS_L_ON_RDR_EXTNCURCOMMLISTRecord rec = (SS_L_ON_RDR_EXTNCURCOMMLISTRecord)curcommlist.get(i);
			
			
			String code = rec.extnflnm;
			String name = rec.aplcpersnm;
			
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
			SS_L_ON_RDR_EXTNCURCOMMLISTRecord rec = (SS_L_ON_RDR_EXTNCURCOMMLISTRecord)curcommlist.get(i);
			
			
			String code = rec.extnflnm;
			String name = rec.aplcpersnm;
			
			sb.append("<input name=\"");
			sb.append("extnflnm");
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
			SS_L_ON_RDR_EXTNCURCOMMLISTRecord rec = (SS_L_ON_RDR_EXTNCURCOMMLISTRecord)curcommlist.get(i);
			
			
			String code = rec.extnflnm;
			String name = rec.aplcpersnm;
			
			sb.append("<input name=\"");
			sb.append("extnflnm");
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
	SS_L_ON_RDR_EXTNDataSet ds = (SS_L_ON_RDR_EXTNDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curcommlist.size(); i++){
		SS_L_ON_RDR_EXTNCURCOMMLISTRecord curcommlistRec = (SS_L_ON_RDR_EXTNCURCOMMLISTRecord)ds.curcommlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurcommlist()%>
<%= ds.getTotalcnt()%>
<%= ds.getTotalqty()%>
<%= ds.getAdvtcnt()%>
<%= ds.getAdvtqty()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curcommlistRec.extnflnm%>
<%= curcommlistRec.aplcpersnm%>
<%= curcommlistRec.rdrnm%>
<%= curcommlistRec.pymtflnm%>
<%= curcommlistRec.medicdnm%>
<%= curcommlistRec.aplcpathcd%>
<%= curcommlistRec.aplcpathnm%>
<%= curcommlistRec.rdr_extntypecd%>
<%= curcommlistRec.cmpynm%>
<%= curcommlistRec.qty%>
<%= curcommlistRec.areacd%>
<%= curcommlistRec.areacdnm%>
<%= curcommlistRec.corrbocd%>
<%= curcommlistRec.corrbocdnm%>
<%= curcommlistRec.extnareanm%>
<%= curcommlistRec.extnbocdnm%>
<%= curcommlistRec.dlvhopedt%>
<%= curcommlistRec.aplcdt%>
<%= curcommlistRec.bo_headcnfmdt%>
<%= curcommlistRec.bo_headcnfmyn%>
<%= curcommlistRec.subscnfmstatcd%>
<%= curcommlistRec.subscnfmstatcdnm%>
<%= curcommlistRec.rdr_extndt%>
<%= curcommlistRec.rdr_extnno%>
<%= curcommlistRec.rdr_no%>
<%= curcommlistRec.medicd%>
<%= curcommlistRec.cntrno%>
<%= curcommlistRec.mangno%>
<%= curcommlistRec.valmm%>
<%= curcommlistRec.aplcclsf%>
<%= curcommlistRec.advtpathcd%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Apr 03 16:56:15 KST 2009 */
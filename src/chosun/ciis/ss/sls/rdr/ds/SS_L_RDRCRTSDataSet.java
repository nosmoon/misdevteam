/***************************************************************************************************
* 파일명 : .java
* 기능 : *독자현황-독자등급관리-조회
* 작성일자 : 2009-04-10
* 작성자 : 김세웅
***************************************************************************************************/


package chosun.ciis.ss.sls.rdr.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.rdr.dm.*;
import chosun.ciis.ss.sls.rdr.rec.*;

/**
 * 독자현황-독자등급관리-조회
 */

public class SS_L_RDRCRTSDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curcommlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public long totalcnt;

	public SS_L_RDRCRTSDataSet(){}
	public SS_L_RDRCRTSDataSet(String errcode, String errmsg, long totalcnt){
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
		this.totalcnt = cstmt.getLong(26);
		ResultSet rset0 = (ResultSet) cstmt.getObject(27);
		while(rset0.next()){
			SS_L_RDRCRTSCURCOMMLISTRecord rec = new SS_L_RDRCRTSCURCOMMLISTRecord();
			rec.areanm = Util.checkString(rset0.getString("areanm"));
			rec.bocd = Util.checkString(rset0.getString("bocd"));
			rec.bonm = Util.checkString(rset0.getString("bonm"));
			rec.regdt = Util.checkString(rset0.getString("regdt"));
			rec.regno = Util.checkString(rset0.getString("regno"));
			rec.rdr_no = Util.checkString(rset0.getString("rdr_no"));
			rec.medinm = Util.checkString(rset0.getString("medinm"));
			rec.dtlsprocstatnm = Util.checkString(rset0.getString("dtlsprocstatnm"));
			rec.errresncdnm = Util.checkString(rset0.getString("errresncdnm"));
			rec.recstatnm = Util.checkString(rset0.getString("recstatnm"));
			rec.onlmembid = Util.checkString(rset0.getString("onlmembid"));
			rec.onlmembseq = Util.checkString(rset0.getString("onlmembseq"));
			rec.rdrnm = Util.checkString(rset0.getString("rdrnm"));
			rec.memb_nm_korn = Util.checkString(rset0.getString("memb_nm_korn"));
			rec.prn = Util.checkString(rset0.getString("prn"));
			rec.email = Util.checkString(rset0.getString("email"));
			rec.ceph_no_1 = Util.checkString(rset0.getString("ceph_no_1"));
			rec.ceph_no_2 = Util.checkString(rset0.getString("ceph_no_2"));
			rec.home_tel_no = Util.checkString(rset0.getString("home_tel_no"));
			rec.memb_kind_cd = Util.checkString(rset0.getString("memb_kind_cd"));
			rec.zip = Util.checkString(rset0.getString("zip"));
			rec.addr = Util.checkString(rset0.getString("addr"));
			rec.dtlsaddr = Util.checkString(rset0.getString("dtlsaddr"));
			rec.procdt = Util.checkString(rset0.getString("procdt"));
			rec.recdt = Util.checkString(rset0.getString("recdt"));
			rec.mblefrdt = Util.checkString(rset0.getString("mblefrdt"));
			rec.mbleexpydt = Util.checkString(rset0.getString("mbleexpydt"));
			rec.mblestatcd = Util.checkString(rset0.getString("mblestatcd"));
			rec.mblenonrsmgcd = Util.checkString(rset0.getString("mblenonrsmgcd"));
			rec.ireaderstat = Util.checkString(rset0.getString("ireaderstat"));
			this.curcommlist.add(rec);
		}
	}

	public String curcommlistOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curcommlist.size();
		for(int i=0; i<size; i++){
			SS_L_RDRCRTSCURCOMMLISTRecord rec = (SS_L_RDRCRTSCURCOMMLISTRecord)curcommlist.get(i);
			
			
			String code = rec.areanm;
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
			SS_L_RDRCRTSCURCOMMLISTRecord rec = (SS_L_RDRCRTSCURCOMMLISTRecord)curcommlist.get(i);
			
			
			String code = rec.areanm;
			String name = rec.bocd;
			
			sb.append("<input name=\"");
			sb.append("areanm");
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
			SS_L_RDRCRTSCURCOMMLISTRecord rec = (SS_L_RDRCRTSCURCOMMLISTRecord)curcommlist.get(i);
			
			
			String code = rec.areanm;
			String name = rec.bocd;
			
			sb.append("<input name=\"");
			sb.append("areanm");
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
	SS_L_RDRCRTSDataSet ds = (SS_L_RDRCRTSDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curcommlist.size(); i++){
		SS_L_RDRCRTSCURCOMMLISTRecord curcommlistRec = (SS_L_RDRCRTSCURCOMMLISTRecord)ds.curcommlist.get(i);%>
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

<%= curcommlistRec.areanm%>
<%= curcommlistRec.bocd%>
<%= curcommlistRec.bonm%>
<%= curcommlistRec.regdt%>
<%= curcommlistRec.regno%>
<%= curcommlistRec.rdr_no%>
<%= curcommlistRec.medinm%>
<%= curcommlistRec.dtlsprocstatnm%>
<%= curcommlistRec.errresncdnm%>
<%= curcommlistRec.recstatnm%>
<%= curcommlistRec.onlmembid%>
<%= curcommlistRec.onlmembseq%>
<%= curcommlistRec.rdrnm%>
<%= curcommlistRec.memb_nm_korn%>
<%= curcommlistRec.prn%>
<%= curcommlistRec.email%>
<%= curcommlistRec.ceph_no_1%>
<%= curcommlistRec.ceph_no_2%>
<%= curcommlistRec.home_tel_no%>
<%= curcommlistRec.memb_kind_cd%>
<%= curcommlistRec.zip%>
<%= curcommlistRec.addr%>
<%= curcommlistRec.dtlsaddr%>
<%= curcommlistRec.procdt%>
<%= curcommlistRec.recdt%>
<%= curcommlistRec.mblefrdt%>
<%= curcommlistRec.mbleexpydt%>
<%= curcommlistRec.mblestatcd%>
<%= curcommlistRec.mblenonrsmgcd%>
<%= curcommlistRec.ireaderstat%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Sat Apr 11 13:17:02 KST 2009 */
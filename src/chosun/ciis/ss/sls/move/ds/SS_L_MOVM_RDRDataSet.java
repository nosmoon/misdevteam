/***************************************************************************************************
* 파일명 : SS_L_MOVM_RDRDataSet.java
* 기능 : 
* 작성일자 : 
* 작성자 : 
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 : 독자번호도 검색할 수 있도록 추가
* 수정자 :   장선희
* 수정일자 : 2015.08.10
* 백업 :
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 : 등록기간, 인계기간, 인수기간, 상담원기간, 상담원 별 조회 가능하도록 추가
* 수정자 :   장선희
* 수정일자 : 2015.10.29
* 백업 :
***************************************************************************************************/


package chosun.ciis.ss.sls.move.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.move.dm.*;
import chosun.ciis.ss.sls.move.rec.*;

/**
 * 
 */


public class SS_L_MOVM_RDRDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curcommlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public long totalcnt;

	public SS_L_MOVM_RDRDataSet(){}
	public SS_L_MOVM_RDRDataSet(String errcode, String errmsg, long totalcnt){
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
		ResultSet rset0 = (ResultSet) cstmt.getObject(30);
		while(rset0.next()){
			SS_L_MOVM_RDRCURCOMMLISTRecord rec = new SS_L_MOVM_RDRCURCOMMLISTRecord();
			rec.regdt = Util.checkString(rset0.getString("regdt"));
			rec.regno = Util.checkString(rset0.getString("regno"));
			rec.rdr_no = Util.checkString(rset0.getString("rdr_no"));
			rec.rdrnm = Util.checkString(rset0.getString("rdrnm"));
			rec.aplcdt = rset0.getTimestamp("aplcdt");
			rec.movmdt = Util.checkString(rset0.getString("movmdt"));
			rec.dlvhopedt = Util.checkString(rset0.getString("dlvhopedt"));
			rec.addr = Util.checkString(rset0.getString("addr"));
			rec.dtlsaddr = Util.checkString(rset0.getString("dtlsaddr"));
			rec.rdrtel_no1 = Util.checkString(rset0.getString("rdrtel_no1"));
			rec.rdrtel_no2 = Util.checkString(rset0.getString("rdrtel_no2"));
			rec.rdrtel_no3 = Util.checkString(rset0.getString("rdrtel_no3"));
			rec.movmaddr = Util.checkString(rset0.getString("movmaddr"));
			rec.movmdtlsaddr = Util.checkString(rset0.getString("movmdtlsaddr"));
			rec.movmtel_no1 = Util.checkString(rset0.getString("movmtel_no1"));
			rec.movmtel_no2 = Util.checkString(rset0.getString("movmtel_no2"));
			rec.movmtel_no3 = Util.checkString(rset0.getString("movmtel_no3"));
			rec.trsfdeptnm = Util.checkString(rset0.getString("trsfdeptnm"));
			rec.trsfareanm = Util.checkString(rset0.getString("trsfareanm"));
			rec.trsfbonm = Util.checkString(rset0.getString("trsfbonm"));
			rec.acptdeptnm = Util.checkString(rset0.getString("acptdeptnm"));
			rec.acptareanm = Util.checkString(rset0.getString("acptareanm"));
			rec.acptbonm = Util.checkString(rset0.getString("acptbonm"));
			rec.trsfbocnfmstat = Util.checkString(rset0.getString("trsfbocnfmstat"));
			rec.acptbocnfmstat = Util.checkString(rset0.getString("acptbocnfmstat"));
			rec.aplcpathnm = Util.checkString(rset0.getString("aplcpathnm"));
			rec.cns_empcnfmdt = rset0.getTimestamp("cns_empcnfmdt");
			rec.onlmembid = Util.checkString(rset0.getString("onlmembid"));
			rec.medinm = Util.checkString(rset0.getString("medinm"));
			rec.movmrdrtype = Util.checkString(rset0.getString("movmrdrtype"));
			rec.rstsubsmonths = Util.checkString(rset0.getString("rstsubsmonths"));
			rec.post_dlvyn = Util.checkString(rset0.getString("post_dlvyn"));
			rec.sellnetclsf = Util.checkString(rset0.getString("sellnetclsf"));
			rec.thmmsendqty = Util.checkString(rset0.getString("thmmsendqty"));
			rec.cns_empacpndtm = Util.checkString(rset0.getString("cns_empacpndtm"));
			rec.suspdt = Util.checkString(rset0.getString("suspdt"));
			rec.trsfbocd = Util.checkString(rset0.getString("trsfbocd"));
			rec.trsfbocnfmdt_tm = Util.checkString(rset0.getString("trsfbocnfmdt_tm"));
			rec.acptbocd = Util.checkString(rset0.getString("acptbocd"));
			rec.acptbocnfmdt_tm = Util.checkString(rset0.getString("acptbocnfmdt_tm"));
			rec.movmlinkalon_plan = Util.checkString(rset0.getString("movmlinkalon_plan"));
			rec.movmlinkalon_fix = Util.checkString(rset0.getString("movmlinkalon_fix"));
			rec.movmlinkalon_ptcr = Util.checkString(rset0.getString("movmlinkalon_ptcr"));
			rec.trsfboremk = Util.checkString(rset0.getString("trsfboremk"));
			rec.acptboremk = Util.checkString(rset0.getString("acptboremk"));
			rec.chrgqty = Util.checkString(rset0.getString("chrgqty"));
			rec.svcnm = Util.checkString(rset0.getString("svcnm"));
			rec.svcmm = Util.checkString(rset0.getString("svcmm"));
			rec.giftcard = Util.checkString(rset0.getString("giftcard"));
			rec.set_medicd = Util.checkString(rset0.getString("set_medicd"));
			this.curcommlist.add(rec);
		}
		this.totalcnt = cstmt.getLong(31);
	}

	public String curcommlistOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curcommlist.size();
		for(int i=0; i<size; i++){
			SS_L_MOVM_RDRCURCOMMLISTRecord rec = (SS_L_MOVM_RDRCURCOMMLISTRecord)curcommlist.get(i);
			
			
			String code = rec.regdt;
			String name = rec.regno;
			
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
			SS_L_MOVM_RDRCURCOMMLISTRecord rec = (SS_L_MOVM_RDRCURCOMMLISTRecord)curcommlist.get(i);
			
			
			String code = rec.regdt;
			String name = rec.regno;
			
			sb.append("<input name=\"");
			sb.append("regdt");
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
			SS_L_MOVM_RDRCURCOMMLISTRecord rec = (SS_L_MOVM_RDRCURCOMMLISTRecord)curcommlist.get(i);
			
			
			String code = rec.regdt;
			String name = rec.regno;
			
			sb.append("<input name=\"");
			sb.append("regdt");
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
	SS_L_MOVM_RDRDataSet ds = (SS_L_MOVM_RDRDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curcommlist.size(); i++){
		SS_L_MOVM_RDRCURCOMMLISTRecord curcommlistRec = (SS_L_MOVM_RDRCURCOMMLISTRecord)ds.curcommlist.get(i);%>
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

<%= curcommlistRec.regdt%>
<%= curcommlistRec.regno%>
<%= curcommlistRec.rdr_no%>
<%= curcommlistRec.rdrnm%>
<%= curcommlistRec.aplcdt%>
<%= curcommlistRec.movmdt%>
<%= curcommlistRec.dlvhopedt%>
<%= curcommlistRec.addr%>
<%= curcommlistRec.dtlsaddr%>
<%= curcommlistRec.rdrtel_no1%>
<%= curcommlistRec.rdrtel_no2%>
<%= curcommlistRec.rdrtel_no3%>
<%= curcommlistRec.movmaddr%>
<%= curcommlistRec.movmdtlsaddr%>
<%= curcommlistRec.movmtel_no1%>
<%= curcommlistRec.movmtel_no2%>
<%= curcommlistRec.movmtel_no3%>
<%= curcommlistRec.trsfdeptnm%>
<%= curcommlistRec.trsfareanm%>
<%= curcommlistRec.trsfbonm%>
<%= curcommlistRec.acptdeptnm%>
<%= curcommlistRec.acptareanm%>
<%= curcommlistRec.acptbonm%>
<%= curcommlistRec.trsfbocnfmstat%>
<%= curcommlistRec.acptbocnfmstat%>
<%= curcommlistRec.aplcpathnm%>
<%= curcommlistRec.cns_empcnfmdt%>
<%= curcommlistRec.onlmembid%>
<%= curcommlistRec.medinm%>
<%= curcommlistRec.movmrdrtype%>
<%= curcommlistRec.rstsubsmonths%>
<%= curcommlistRec.post_dlvyn%>
<%= curcommlistRec.sellnetclsf%>
<%= curcommlistRec.thmmsendqty%>
<%= curcommlistRec.cns_empacpndtm%>
<%= curcommlistRec.suspdt%>
<%= curcommlistRec.trsfbocd%>
<%= curcommlistRec.trsfbocnfmdt_tm%>
<%= curcommlistRec.acptbocd%>
<%= curcommlistRec.acptbocnfmdt_tm%>
<%= curcommlistRec.movmlinkalon_plan%>
<%= curcommlistRec.movmlinkalon_fix%>
<%= curcommlistRec.movmlinkalon_ptcr%>
<%= curcommlistRec.trsfboremk%>
<%= curcommlistRec.acptboremk%>
<%= curcommlistRec.chrgqty%>
<%= curcommlistRec.svcnm%>
<%= curcommlistRec.svcmm%>
<%= curcommlistRec.giftcard%>
<%= curcommlistRec.set_medicd%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Oct 29 21:37:09 KST 2015 */
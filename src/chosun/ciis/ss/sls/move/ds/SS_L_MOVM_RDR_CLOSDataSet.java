/***************************************************************************************************
* 파일명 : .java
* 기능 : 
* 작성일자 : 
* 작성자 : 심정보
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
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


public class SS_L_MOVM_RDR_CLOSDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curcommlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public long totalcnt;

	public SS_L_MOVM_RDR_CLOSDataSet(){}
	public SS_L_MOVM_RDR_CLOSDataSet(String errcode, String errmsg, long totalcnt){
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
		if(!"".equals(this.errcode)){
			return;
		}

		ResultSet rset0 = (ResultSet) cstmt.getObject(18);
		while(rset0.next()){
			SS_L_MOVM_RDR_CLOSCURCOMMLISTRecord rec = new SS_L_MOVM_RDR_CLOSCURCOMMLISTRecord();
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
			rec.zip = Util.checkString(rset0.getString("zip"));
			rec.movmzip = Util.checkString(rset0.getString("movmzip"));
			this.curcommlist.add(rec);
		}
		this.totalcnt = cstmt.getLong(19);
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SS_L_MOVM_RDR_CLOSDataSet ds = (SS_L_MOVM_RDR_CLOSDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curcommlist.size(); i++){
		SS_L_MOVM_RDR_CLOSCURCOMMLISTRecord curcommlistRec = (SS_L_MOVM_RDR_CLOSCURCOMMLISTRecord)ds.curcommlist.get(i);%>
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
<%= curcommlistRec.zip%>
<%= curcommlistRec.movmzip%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Jun 30 05:05:26 GMT 2014 */
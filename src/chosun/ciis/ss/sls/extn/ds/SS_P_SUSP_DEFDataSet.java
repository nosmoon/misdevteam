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


package chosun.ciis.ss.sls.extn.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.extn.dm.*;
import chosun.ciis.ss.sls.extn.rec.*;

/**
 * 
 */


public class SS_P_SUSP_DEFDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList suspdefcur = new ArrayList();
	public String errcode;
	public String errmsg;

	public SS_P_SUSP_DEFDataSet(){}
	public SS_P_SUSP_DEFDataSet(String errcode, String errmsg){
		this.errcode = errcode;
		this.errmsg = errmsg;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		ResultSet rset0 = (ResultSet) cstmt.getObject(13);
		while(rset0.next()){
			SS_P_SUSP_DEFSUSPDEFCURRecord rec = new SS_P_SUSP_DEFSUSPDEFCURRecord();
			rec.deptnm = Util.checkString(rset0.getString("deptnm"));
			rec.deptcd = Util.checkString(rset0.getString("deptcd"));
			rec.partnm = Util.checkString(rset0.getString("partnm"));
			rec.partcd = Util.checkString(rset0.getString("partcd"));
			rec.areanm = Util.checkString(rset0.getString("areanm"));
			rec.areacd = Util.checkString(rset0.getString("areacd"));
			rec.bonm = Util.checkString(rset0.getString("bonm"));
			rec.bocd = Util.checkString(rset0.getString("bocd"));
			rec.def_type = Util.checkString(rset0.getString("def_type"));
			rec.aplcdt = Util.checkString(rset0.getString("aplcdt"));
			rec.rdr_no = Util.checkString(rset0.getString("rdr_no"));
			rec.rdrnm = Util.checkString(rset0.getString("rdrnm"));
			rec.medinm = Util.checkString(rset0.getString("medinm"));
			rec.subsqty = Util.checkString(rset0.getString("subsqty"));
			rec.valmm = Util.checkString(rset0.getString("valmm"));
			rec.rdr_extndt = Util.checkString(rset0.getString("rdr_extndt"));
			rec.subsfr_dt = Util.checkString(rset0.getString("subsfr_dt"));
			rec.aplcpathnm = Util.checkString(rset0.getString("aplcpathnm"));
			rec.onlmembid = Util.checkString(rset0.getString("onlmembid"));
			rec.agentnm = Util.checkString(rset0.getString("agentnm"));
			rec.cns_stat = Util.checkString(rset0.getString("cns_stat"));
			rec.cns_cnfmdt = Util.checkString(rset0.getString("cns_cnfmdt"));
			rec.bo_stat = Util.checkString(rset0.getString("bo_stat"));
			rec.bo_cnfmdt = Util.checkString(rset0.getString("bo_cnfmdt"));
			rec.remk = Util.checkString(rset0.getString("remk"));
			rec.svccd = Util.checkString(rset0.getString("svccd"));
			rec.svcmm = Util.checkString(rset0.getString("svcmm"));
			rec.giftcard = Util.checkString(rset0.getString("giftcard"));
			rec.set_medicd = Util.checkString(rset0.getString("set_medicd"));
			this.suspdefcur.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SS_P_SUSP_DEFDataSet ds = (SS_P_SUSP_DEFDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.suspdefcur.size(); i++){
		SS_P_SUSP_DEFSUSPDEFCURRecord suspdefcurRec = (SS_P_SUSP_DEFSUSPDEFCURRecord)ds.suspdefcur.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getSuspdefcur()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= suspdefcurRec.deptnm%>
<%= suspdefcurRec.deptcd%>
<%= suspdefcurRec.partnm%>
<%= suspdefcurRec.partcd%>
<%= suspdefcurRec.areanm%>
<%= suspdefcurRec.areacd%>
<%= suspdefcurRec.bonm%>
<%= suspdefcurRec.bocd%>
<%= suspdefcurRec.def_type%>
<%= suspdefcurRec.aplcdt%>
<%= suspdefcurRec.rdr_no%>
<%= suspdefcurRec.rdrnm%>
<%= suspdefcurRec.medinm%>
<%= suspdefcurRec.subsqty%>
<%= suspdefcurRec.valmm%>
<%= suspdefcurRec.rdr_extndt%>
<%= suspdefcurRec.subsfr_dt%>
<%= suspdefcurRec.aplcpathnm%>
<%= suspdefcurRec.onlmembid%>
<%= suspdefcurRec.agentnm%>
<%= suspdefcurRec.cns_stat%>
<%= suspdefcurRec.cns_cnfmdt%>
<%= suspdefcurRec.bo_stat%>
<%= suspdefcurRec.bo_cnfmdt%>
<%= suspdefcurRec.remk%>
<%= suspdefcurRec.svccd%>
<%= suspdefcurRec.svcmm%>
<%= suspdefcurRec.giftcard%>
<%= suspdefcurRec.set_medicd%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Mar 03 19:00:46 KST 2015 */
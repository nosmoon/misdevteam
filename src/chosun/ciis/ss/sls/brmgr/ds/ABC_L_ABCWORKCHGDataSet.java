/***************************************************************************************************
* 파일명 : .java
* 기능 : 판매-지국지원-이사독자수당현황
* 작성일자 : 2011-12-05
* 작성자 : 이기영
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.ss.sls.brmgr.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.brmgr.dm.*;
import chosun.ciis.ss.sls.brmgr.rec.*;

/**
 * 
 */


public class ABC_L_ABCWORKCHGDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curabcchg = new ArrayList();
	public String errcode;
	public String errmsg;

	public ABC_L_ABCWORKCHGDataSet(){}
	public ABC_L_ABCWORKCHGDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(7);
		while(rset0.next()){
			ABC_L_ABCWORKCHGCURABCCHGRecord rec = new ABC_L_ABCWORKCHGCURABCCHGRecord();
			rec.rdr_no = Util.checkString(rset0.getString("rdr_no"));
			rec.rdr_nm = Util.checkString(rset0.getString("rdr_nm"));
			rec.subsmappli = Util.checkString(rset0.getString("subsmappli"));
			rec.bocd = Util.checkString(rset0.getString("bocd"));
			rec.wrkseq = Util.checkString(rset0.getString("wrkseq"));
			rec.wrkcode = Util.checkString(rset0.getString("wrkcode"));
			rec.clamthsty = Util.checkString(rset0.getString("clamthsty"));
			rec.clamlist = Util.checkString(rset0.getString("clamlist"));
			rec.remk = Util.checkString(rset0.getString("remk"));
			rec.rptvrdr_extndt = Util.checkString(rset0.getString("rptvrdr_extndt"));
			rec.rdrtel = Util.checkString(rset0.getString("rdrtel"));
			rec.rdrptph = Util.checkString(rset0.getString("rdrptph"));
			rec.dlvcd = Util.checkString(rset0.getString("dlvcd"));
			rec.realsubsamt = Util.checkString(rset0.getString("realsubsamt"));
			rec.dscnamt = Util.checkString(rset0.getString("dscnamt"));
			this.curabcchg.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	ABC_L_ABCWORKCHGDataSet ds = (ABC_L_ABCWORKCHGDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curabcchg.size(); i++){
		ABC_L_ABCWORKCHGCURABCCHGRecord curabcchgRec = (ABC_L_ABCWORKCHGCURABCCHGRecord)ds.curabcchg.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurabcchg()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curabcchgRec.rdr_no%>
<%= curabcchgRec.rdr_nm%>
<%= curabcchgRec.subsmappli%>
<%= curabcchgRec.bocd%>
<%= curabcchgRec.wrkseq%>
<%= curabcchgRec.wrkcode%>
<%= curabcchgRec.clamthsty%>
<%= curabcchgRec.clamlist%>
<%= curabcchgRec.remk%>
<%= curabcchgRec.rptvrdr_extndt%>
<%= curabcchgRec.rdrtel%>
<%= curabcchgRec.rdrptph%>
<%= curabcchgRec.dlvcd%>
<%= curabcchgRec.realsubsamt%>
<%= curabcchgRec.dscnamt%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Apr 03 05:13:07 GMT 2013 */
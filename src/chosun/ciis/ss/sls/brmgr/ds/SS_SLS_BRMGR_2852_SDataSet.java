/***************************************************************************************************
* 파일명 : .java
* 기능 : 	   
* 작성일자 : 
* 작성자 : 
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


public class SS_SLS_BRMGR_2852_SDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public SS_SLS_BRMGR_2852_SDataSet(){}
	public SS_SLS_BRMGR_2852_SDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(8);
		while(rset0.next()){
			SS_SLS_BRMGR_2852_SCURLISTRecord rec = new SS_SLS_BRMGR_2852_SCURLISTRecord();
			rec.yyyymm = Util.checkString(rset0.getString("yyyymm"));
			rec.bocd = Util.checkString(rset0.getString("bocd"));
			rec.rdr_no = Util.checkString(rset0.getString("rdr_no"));
			rec.medicd = Util.checkString(rset0.getString("medicd"));
			rec.medinm = Util.checkString(rset0.getString("medinm"));
			rec.subsqty = Util.checkString(rset0.getString("subsqty"));
			rec.rdr_extndt = Util.checkString(rset0.getString("rdr_extndt"));
			rec.valmm = Util.checkString(rset0.getString("valmm"));
			rec.suspdt = Util.checkString(rset0.getString("suspdt"));
			rec.clamqty = Util.checkString(rset0.getString("clamqty"));
			rec.clamamt = Util.checkString(rset0.getString("clamamt"));
			rec.dscnamt = Util.checkString(rset0.getString("dscnamt"));
			rec.post_dlvfee = Util.checkString(rset0.getString("post_dlvfee"));
			rec.clamt = Util.checkString(rset0.getString("clamt"));
			rec.clamtmthdcd = Util.checkString(rset0.getString("clamtmthdcd"));
			rec.clamtmthdnm = Util.checkString(rset0.getString("clamtmthdnm"));
			rec.rcpmclsfcd = Util.checkString(rset0.getString("rcpmclsfcd"));
			rec.rcpmclsfnm = Util.checkString(rset0.getString("rcpmclsfnm"));
			rec.shftdt = Util.checkString(rset0.getString("shftdt"));
			rec.pymtmm = Util.checkString(rset0.getString("pymtmm"));
			rec.subsmappli = Util.checkString(rset0.getString("subsmappli"));
			rec.clamtlist = Util.checkString(rset0.getString("clamtlist"));
			rec.clamtmm = Util.checkString(rset0.getString("clamtmm"));
			rec.abcmms = Util.checkString(rset0.getString("abcmms"));
			rec.abcyn = Util.checkString(rset0.getString("abcyn"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SS_SLS_BRMGR_2852_SDataSet ds = (SS_SLS_BRMGR_2852_SDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		SS_SLS_BRMGR_2852_SCURLISTRecord curlistRec = (SS_SLS_BRMGR_2852_SCURLISTRecord)ds.curlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlistRec.yyyymm%>
<%= curlistRec.bocd%>
<%= curlistRec.rdr_no%>
<%= curlistRec.medicd%>
<%= curlistRec.medinm%>
<%= curlistRec.subsqty%>
<%= curlistRec.rdr_extndt%>
<%= curlistRec.valmm%>
<%= curlistRec.suspdt%>
<%= curlistRec.clamqty%>
<%= curlistRec.clamamt%>
<%= curlistRec.dscnamt%>
<%= curlistRec.post_dlvfee%>
<%= curlistRec.clamt%>
<%= curlistRec.clamtmthdcd%>
<%= curlistRec.clamtmthdnm%>
<%= curlistRec.rcpmclsfcd%>
<%= curlistRec.rcpmclsfnm%>
<%= curlistRec.shftdt%>
<%= curlistRec.pymtmm%>
<%= curlistRec.subsmappli%>
<%= curlistRec.clamtlist%>
<%= curlistRec.clamtmm%>
<%= curlistRec.abcmms%>
<%= curlistRec.abcyn%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Feb 16 16:01:46 KST 2017 */